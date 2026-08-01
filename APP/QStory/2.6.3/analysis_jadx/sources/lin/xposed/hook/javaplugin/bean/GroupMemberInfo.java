package lin.xposed.hook.javaplugin.bean;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        sb.append(AbstractC8405.m13972(604));
        sb.append(this.UserUin);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(605));
        sb.append(this.UserName);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(606));
        sb.append(this.NickName);
        sb.append('\'');
        sb.append(AbstractC8405.m13972(607));
        AbstractC6183.m11578(sb, this.UserLevel, 608);
        sb.append(this.Join_Time);
        sb.append(AbstractC8405.m13972(609));
        sb.append(this.Last_AvtivityTime);
        sb.append(AbstractC8405.m13972(610));
        sb.append(this.IsOwner);
        sb.append(AbstractC8405.m13972(611));
        return AbstractC0053.m152(sb, this.IsAdmin, '}');
    }
}
