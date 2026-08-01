package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.C2867;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p142.C8252;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1758 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f2955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f2956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f2957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f2958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2959;

    public C1758(int i, int i2, int i3, C2867 c2867) {
        this.f2959 = 0;
        this.f2958 = i;
        this.f2957 = i2;
        this.f2956 = i3;
        this.f2955 = c2867;
    }

    public String toString() {
        switch (this.f2959) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f2958;
                sb.append(i);
                sb.append(SignatureVisitor.SUPER);
                C2867 c2867 = (C2867) this.f2955;
                sb.append(AbstractC1733.m2372(c2867, i));
                sb.append(',');
                int i2 = this.f2957;
                sb.append(i2);
                sb.append(SignatureVisitor.SUPER);
                sb.append(AbstractC1733.m2372(c2867, i2));
                sb.append("), prevOffset=");
                return AbstractC0900.m716(sb, this.f2956, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object m2383(int i) {
        return ((C8252) this.f2955).f20463[this.f2956 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int m2384(int i) {
        return ((C8252) this.f2955).f20467[this.f2957 + i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int m2385() {
        return this.f2956 - this.f2957;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2386(RecyclerView recyclerView, boolean z) {
        this.f2956 = 0;
        int[] iArr = (int[]) this.f2955;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC3352 abstractC3352 = recyclerView.f7538;
        if (recyclerView.f7539 == null || abstractC3352 == null || !abstractC3352.f7934) {
            return;
        }
        if (z) {
            if (!recyclerView.f7569.m1227()) {
                abstractC3352.mo5232(recyclerView.f7539.mo5354(), this);
            }
        } else if (!recyclerView.m5262()) {
            abstractC3352.mo5231(this.f2958, this.f2957, recyclerView.f7586, this);
        }
        int i = this.f2956;
        if (i > abstractC3352.f7930) {
            abstractC3352.f7930 = i;
            abstractC3352.f7929 = z;
            recyclerView.f7576.m5595();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1750 m2387(int i) {
        return new C1750(AbstractC1733.m2372((C2867) this.f2955, i), i, 1L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2388(int i, int i2) {
        if (i < 0) {
            C6755.m11869("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C6755.m11869("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f2956;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.f2955;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2955 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2955 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f2955;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f2956++;
    }

    public C1758(C8252 c8252) {
        this.f2959 = 3;
        this.f2955 = c8252;
    }

    public /* synthetic */ C1758(int i) {
        this.f2959 = i;
    }
}
