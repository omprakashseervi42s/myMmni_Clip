package np.com.example.miniclip.model

import android.security.identity.AccessControlProfile

data class UserModel(
    var id : String = "",
    var email : String = "",
    var username : String = "",
    var profilePic : String ="",
    var followerList : MutableList<String> = mutableListOf(),
    var followingList: MutableList<String> = mutableListOf()
)
