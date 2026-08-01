package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: dn */
/* JADX INFO: loaded from: classes.dex */
public final class C0157dn {

    /* JADX INFO: renamed from: a */
    public int f1396a;

    /* JADX INFO: renamed from: b */
    public int f1397b;

    /* JADX INFO: renamed from: c */
    public int[] f1398c;

    /* JADX INFO: renamed from: d */
    public int f1399d;

    /* JADX INFO: renamed from: a */
    public final void m929a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f1399d;
        int i4 = i3 * 2;
        int[] iArr = this.f1398c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1398c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f1398c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f1398c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f1399d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m930b(RecyclerView recyclerView, boolean z) {
        this.f1399d = 0;
        int[] iArr = this.f1398c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0799uz abstractC0799uz = recyclerView.f568l;
        if (recyclerView.f566k == null || abstractC0799uz == null || !abstractC0799uz.f4863i) {
            return;
        }
        if (z) {
            if (!recyclerView.f552d.m2718f()) {
                abstractC0799uz.mo343i(recyclerView.f566k.mo715a(), this);
            }
        } else if (!recyclerView.m366K()) {
            abstractC0799uz.mo342h(this.f1396a, this.f1397b, recyclerView.f551c0, this);
        }
        int i = this.f1399d;
        if (i > abstractC0799uz.f4864j) {
            abstractC0799uz.f4864j = i;
            abstractC0799uz.f4865k = z;
            recyclerView.f548b.m13k();
        }
    }
}
