package lin.xposed.hook.javaplugin.bean;

import com.alibaba.fastjson2.InterfaceC2915;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FriendInfo {
    public String name;
    public String remark;
    public String uin;
    public boolean isVip = false;
    public int vipLevel = 0;

    public String toString() {
        return InterfaceC2915.m6317(this);
    }
}
