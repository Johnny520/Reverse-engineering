package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2033;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p126.C7422;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0920 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f2610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f2611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f2612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2613;

    public C0920(int i, int i2, int i3, C2033 c2033) {
        this.f2613 = 0;
        this.f2612 = i;
        this.f2611 = i2;
        this.f2610 = i3;
        this.f2609 = c2033;
    }

    public String toString() {
        switch (this.f2613) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f2612;
                sb.append(i);
                sb.append(SignatureVisitor.SUPER);
                C2033 c2033 = (C2033) this.f2609;
                sb.append(AbstractC0895.m1802(c2033, i));
                sb.append(',');
                int i2 = this.f2611;
                sb.append(i2);
                sb.append(SignatureVisitor.SUPER);
                sb.append(AbstractC0895.m1802(c2033, i2));
                sb.append("), prevOffset=");
                return AbstractC0053.m154(sb, this.f2610, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object m1813(int i) {
        return ((C7422) this.f2609).f20125[this.f2610 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m1814(int i) {
        return ((C7422) this.f2609).f20127[this.f2611 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m1815() {
        return this.f2610 - this.f2611;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m1816(RecyclerView recyclerView, boolean z) {
        this.f2610 = 0;
        int[] iArr = (int[]) this.f2609;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2519 abstractC2519 = recyclerView.f7192;
        if (recyclerView.f7193 == null || abstractC2519 == null || !abstractC2519.f7588) {
            return;
        }
        if (z) {
            if (!recyclerView.f7223.m666()) {
                abstractC2519.mo4662(recyclerView.f7193.mo4784(), this);
            }
        } else if (!recyclerView.m4692()) {
            abstractC2519.mo4661(this.f2612, this.f2611, recyclerView.f7240, this);
        }
        int i = this.f2610;
        if (i > abstractC2519.f7584) {
            abstractC2519.f7584 = i;
            abstractC2519.f7583 = z;
            recyclerView.f7230.m5025();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0912 m1817(int i) {
        return new C0912(AbstractC0895.m1802((C2033) this.f2609, i), i, 1L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1818(int i, int i2) {
        if (i < 0) {
            C5919.m11249("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C5919.m11249("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f2610;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.f2609;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2609 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2609 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f2609;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f2610++;
    }

    public C0920(C7422 c7422) {
        this.f2613 = 3;
        this.f2609 = c7422;
    }

    public /* synthetic */ C0920(int i) {
        this.f2613 = i;
    }
}
