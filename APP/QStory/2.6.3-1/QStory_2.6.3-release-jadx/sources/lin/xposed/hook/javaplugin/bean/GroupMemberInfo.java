package lin.xposed.hook.javaplugin.bean;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import p303.AbstractC9234;

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
        sb.append(AbstractC9234.m14531(604));
        sb.append(this.UserUin);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(605));
        sb.append(this.UserName);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(606));
        sb.append(this.NickName);
        sb.append('\'');
        sb.append(AbstractC9234.m14531(607));
        AbstractC7012.m12137(sb, this.UserLevel, 608);
        sb.append(this.Join_Time);
        sb.append(AbstractC9234.m14531(609));
        sb.append(this.Last_AvtivityTime);
        sb.append(AbstractC9234.m14531(610));
        sb.append(this.IsOwner);
        sb.append(AbstractC9234.m14531(611));
        return AbstractC0900.m712(sb, this.IsAdmin, '}');
    }
}
