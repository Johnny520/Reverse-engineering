package androidx.core.util;

import p206.C7911;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2185 implements InterfaceC2186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f6457;

    public C2185(int i) {
        if (i > 0) {
            this.f6457 = new Object[i];
        } else {
            C5919.m11249("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    public Object acquire() {
        int i = this.f6456;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f6457;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.f6456--;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m3980(C7911 c7911) {
        int i = this.f6456;
        Object[] objArr = this.f6457;
        if (i < objArr.length) {
            objArr[i] = c7911;
            this.f6456 = i + 1;
        }
    }

    @Override // androidx.core.util.InterfaceC2186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3979(Object obj) {
        obj.getClass();
        int i = this.f6456;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f6457;
            if (i2 >= i) {
                int i3 = this.f6456;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f6456 = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C5919.m11250("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public C2185() {
        this.f6457 = new Object[256];
    }
}
