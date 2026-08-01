package androidx.compose.ui.input.pointer;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1634 implements InterfaceC1641 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f4779;

    public C1634(int i) {
        this.f4779 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1634.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f4779 == ((C1634) obj).f4779;
    }

    public final int hashCode() {
        return this.f4779;
    }

    public final String toString() {
        return AbstractC0053.m156(new StringBuilder("AndroidPointerIcon(type="), this.f4779, ')');
    }
}
