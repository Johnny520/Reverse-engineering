package androidx.core.util;

import p206.C7912;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2185 implements InterfaceC2186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6457;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f6458;

    public C2185(int i) {
        if (i > 0) {
            this.f6458 = new Object[i];
        } else {
            C5925.m11310("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    public Object acquire() {
        int i = this.f6457;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f6458;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.f6457--;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m3990(C7912 c7912) {
        int i = this.f6457;
        Object[] objArr = this.f6458;
        if (i < objArr.length) {
            objArr[i] = c7912;
            this.f6457 = i + 1;
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3989(Object obj) {
        obj.getClass();
        int i = this.f6457;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f6458;
            if (i2 >= i) {
                int i3 = this.f6457;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f6457 = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C5925.m11311("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public C2185() {
        this.f6458 = new Object[256];
    }
}
