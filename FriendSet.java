
class FriendSet {
	private String _me;
	private String _friend;
	private String[] socialNet = new String[30];// set maximum of social network
	private String relationList[][] = new String[30][30];// the maximum of fiends

	FriendSet(String me) {
		_me = me;
	}

	// a method for set be pointed person name
	public void setFriend(String friend) {
		_friend = friend;
	}

	// String socialNet[] = {"Alic","Bob","Cathy","Don"};//hard code

	// String[][] arr = new String[23][33];
	// String arr[][] = {{"Alic","Bob","Cathy","Don"}};

	// following method is for add person in network
	public void addInNetwork(String[] socialNet, String[][] relationList,
			String newPerson) {

		for (int x = 0; x < socialNet.length; x++) {
			if (socialNet[x] == null) {
				this.socialNet[x] = newPerson;
				break;
			}
		}// end of for

		for (int x = 0; x < relationList.length; x++) {
			if ((relationList[x][0] == null)
					&& (relationList[x][0] != newPerson)) {
				this.relationList[x][0] = newPerson;
				break;
			}
		}// end of for_2
	}// end of method of addInNetwork

	// following method can show the social list
	public void showSocialList() {
		for (int x = 0; x < socialNet.length; x++) {
			System.out.println(socialNet[x]);
		}
	}// end of method of showSocialList

	// following method can search be pointed person's relation ship
	public void showRelationList(String name) {
		for (int x = 0; x < relationList.length; x++) {
			if (relationList[x][0] == name) {
				for (int y = 0; y < relationList[x].length; y++) {
					System.out.println(relationList[x][y]);
				}
			}
		}
	}// end of method showRelationList

	// following method is to add friends
	public void addFriend(String friend) {//using _me and add friend
		for (int x = 0; x < relationList.length; x++) {
			if (relationList[x][0] == _me) {
				for (int y = 1; y < relationList[x].length; y++) {
					if ((relationList[x][y] != friend)
							&& (relationList[x][y] == null)) {
						relationList[x][y] = friend;
						break;
					}
				}
				break;
			}
		}

		for (int x = 0; x < relationList.length; x++) {//using friend the add me
			if (relationList[x][0] == friend) {
				for (int y = 1; y < relationList[x].length; y++) {
					if ((relationList[x][y] != _me)
							&& (relationList[x][y] == null)) {
						relationList[x][y] = _me;
						break;
					}
				}
				break;
			}
		}
	}// end of method addFriend

	// following method can check two people whether are fiend
	public void checkFriend(String name, String other) {
		for (int x = 0; x < relationList.length; x++) {
			if (relationList[x][0] == name) {
				for (int y = 1; y < relationList[x].length; y++) {
					if (relationList[x][y] == other) {
						System.out.println("Yes, they are friend");
						break;
					} else {
						System.out.println("Ne, they are not friend");
						break;
					}
				}
				break;
			}
		}
	}// end of method checkFriend
}