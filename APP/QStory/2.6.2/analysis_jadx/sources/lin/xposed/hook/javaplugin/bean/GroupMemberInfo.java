package lin.xposed.hook.javaplugin.bean;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class GroupMemberInfo {
    public boolean IsAdmin;
    public boolean IsOwner;
    public long Join_Time;
    public long Last_AvtivityTime;
    public String NickName;
    public int UserLevel;
    public String UserName;
    public String UserUin;
    public Object sourceInfo;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937617659051640231L));
        sb.append(this.UserUin);
        sb.append('\'');
        sb.append(AbstractC3056.m6668(-3937617598922098087L));
        sb.append(this.UserName);
        sb.append('\'');
        sb.append(AbstractC3056.m6668(-3937617551677457831L));
        sb.append(this.NickName);
        sb.append('\'');
        sb.append(AbstractC3056.m6668(-3937617435713340839L));
        AbstractC6136.m11533(sb, this.UserLevel, -3937617388468700583L);
        AbstractC6136.m11532(sb, this.Join_Time, -3937617306864321959L);
        AbstractC6136.m11532(sb, this.Last_AvtivityTime, -3937617225259943335L);
        sb.append(this.IsOwner);
        sb.append(AbstractC3056.m6668(-3937617169425368487L));
        return AbstractC0053.m150(sb, this.IsAdmin, '}');
    }
}
