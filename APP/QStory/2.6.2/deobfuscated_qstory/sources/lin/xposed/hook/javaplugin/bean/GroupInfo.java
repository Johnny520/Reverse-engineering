package lin.xposed.hook.javaplugin.bean;

import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class GroupInfo {
    public ArrayList<String> AdminList;
    public String GroupName;
    public String GroupOwner;
    public String GroupUin;
    public boolean IsOwnerOrAdmin;
    public Object sourceInfo;

    public String toString() {
        return InterfaceC2915.m6314(this, JSONWriter$Feature.PrettyFormat);
    }
}
