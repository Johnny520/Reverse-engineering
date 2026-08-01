package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2033;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p126.C7423;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0920 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f2611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f2612;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f2613;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2614;

    public C0920(int i, int i2, int i3, C2033 c2033) {
        this.f2614 = 0;
        this.f2613 = i;
        this.f2612 = i2;
        this.f2611 = i3;
        this.f2610 = c2033;
    }

    public String toString() {
        switch (this.f2614) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f2613;
                sb.append(i);
                sb.append(SignatureVisitor.SUPER);
                C2033 c2033 = (C2033) this.f2610;
                sb.append(AbstractC0895.m1812(c2033, i));
                sb.append(',');
                int i2 = this.f2612;
                sb.append(i2);
                sb.append(SignatureVisitor.SUPER);
                sb.append(AbstractC0895.m1812(c2033, i2));
                sb.append("), prevOffset=");
                return AbstractC0053.m156(sb, this.f2611, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object m1823(int i) {
        return ((C7423) this.f2610).f20118[this.f2611 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m1824(int i) {
        return ((C7423) this.f2610).f20122[this.f2612 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m1825() {
        return this.f2611 - this.f2612;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m1826(RecyclerView recyclerView, boolean z) {
        this.f2611 = 0;
        int[] iArr = (int[]) this.f2610;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC2519 abstractC2519 = recyclerView.f7193;
        if (recyclerView.f7194 == null || abstractC2519 == null || !abstractC2519.f7589) {
            return;
        }
        if (z) {
            if (!recyclerView.f7224.m667()) {
                abstractC2519.mo4672(recyclerView.f7194.mo4794(), this);
            }
        } else if (!recyclerView.m4702()) {
            abstractC2519.mo4671(this.f2613, this.f2612, recyclerView.f7241, this);
        }
        int i = this.f2611;
        if (i > abstractC2519.f7585) {
            abstractC2519.f7585 = i;
            abstractC2519.f7584 = z;
            recyclerView.f7231.m5035();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0912 m1827(int i) {
        return new C0912(AbstractC0895.m1812((C2033) this.f2610, i), i, 1L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1828(int i, int i2) {
        if (i < 0) {
            C5925.m11310("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C5925.m11310("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f2611;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.f2610;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2610 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2610 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f2610;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f2611++;
    }

    public C0920(C7423 c7423) {
        this.f2614 = 3;
        this.f2610 = c7423;
    }

    public /* synthetic */ C0920(int i) {
        this.f2614 = i;
    }
}
