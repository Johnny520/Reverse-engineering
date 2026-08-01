package lin.xposed.hook.login.model;

import com.bumptech.glide.AbstractC3056;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class User implements Serializable {
    private static User currentUser;
    private String identityName;
    private String name;
    private String uid;
    private String uin;
    private int userIdentity;
    private String userLabel;

    public static User getCurrentUser() {
        User user = currentUser;
        if (user != null) {
            return user;
        }
        User user2 = new User();
        user2.setUserIdentity(0);
        user2.setName(AbstractC3056.m6668(-3937634735841609127L));
        user2.setUin(AbstractC3056.m6668(-3937634637057361319L));
        return user2;
    }

    public static void setCurrentUser(User user) {
        currentUser = user;
    }

    public int getIdentity() {
        return this.userIdentity;
    }

    public String getIdentityName() {
        return this.identityName;
    }

    public String getName() {
        return this.name;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUin() {
        return this.uin;
    }

    public String getUserLabel() {
        return this.userLabel;
    }

    public void setIdentityName(String str) {
        this.identityName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUin(String str) {
        this.uin = str;
    }

    public void setUserIdentity(int i) {
        this.userIdentity = i;
    }

    public void setUserLabel(String str) {
        this.userLabel = str;
    }
}
