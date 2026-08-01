package androidx.compose.p001ui.input.pointer;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2469 implements InterfaceC2476 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5124;

    public C2469(int i) {
        this.f5124 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2469.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f5124 == ((C2469) obj).f5124;
    }

    public final int hashCode() {
        return this.f5124;
    }

    public final String toString() {
        return AbstractC0900.m716(new StringBuilder("AndroidPointerIcon(type="), this.f5124, ')');
    }
}
