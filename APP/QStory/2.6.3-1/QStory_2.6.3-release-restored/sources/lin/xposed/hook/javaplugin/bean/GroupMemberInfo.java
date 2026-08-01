package lin.xposed.hook.javaplugin.bean;

import androidx.activity.AbstractC0900;
import p025.AbstractC7012;

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
        sb.append("GroupMemberInfo{UserUin='");
        sb.append(this.UserUin);
        sb.append('\'');
        sb.append(", UserName='");
        sb.append(this.UserName);
        sb.append('\'');
        sb.append(", NickName='");
        sb.append(this.NickName);
        sb.append('\'');
        sb.append(", UserLevel=");
        AbstractC7012.m12137(sb, this.UserLevel, 608);
        sb.append(this.Join_Time);
        sb.append(", Last_AvtivityTime=");
        sb.append(this.Last_AvtivityTime);
        sb.append(", IsOwner=");
        sb.append(this.IsOwner);
        sb.append(", IsAdmin=");
        return AbstractC0900.m712(sb, this.IsAdmin, '}');
    }
}
