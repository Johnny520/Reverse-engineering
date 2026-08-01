package lin.xposed.hook.login.model;

import java.io.Serializable;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        user2.setName(AbstractC9234.m14531(813));
        user2.setUin(AbstractC9234.m14531(814));
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
