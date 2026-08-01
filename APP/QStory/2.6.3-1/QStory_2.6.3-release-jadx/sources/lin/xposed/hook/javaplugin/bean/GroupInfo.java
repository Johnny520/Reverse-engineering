package lin.xposed.hook.javaplugin.bean;

import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class GroupInfo {
    public ArrayList<String> AdminList;
    public String GroupName;
    public String GroupOwner;
    public String GroupUin;
    public boolean IsOwnerOrAdmin;
    public Object sourceInfo;

    public String toString() {
        return InterfaceC3749.m6932(this, JSONWriter$Feature.PrettyFormat);
    }
}
