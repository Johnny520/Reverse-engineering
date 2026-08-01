package androidx.core.util;

import p222.C8741;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.core.util.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3018 implements InterfaceC3019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object[] f6803;

    public C3018(int i) {
        if (i > 0) {
            this.f6803 = new Object[i];
        } else {
            C6755.m11869("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // androidx.core.util.InterfaceC3019
    public Object acquire() {
        int i = this.f6802;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f6803;
        Object obj = objArr[i2];
        obj.getClass();
        objArr[i2] = null;
        this.f6802--;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m4550(C8741 c8741) {
        int i = this.f6802;
        Object[] objArr = this.f6803;
        if (i < objArr.length) {
            objArr[i] = c8741;
            this.f6802 = i + 1;
        }
    }

    @Override // androidx.core.util.InterfaceC3019
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo4549(Object obj) {
        obj.getClass();
        int i = this.f6802;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f6803;
            if (i2 >= i) {
                int i3 = this.f6802;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f6802 = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C6755.m11870("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public C3018() {
        this.f6803 = new Object[256];
    }
}
