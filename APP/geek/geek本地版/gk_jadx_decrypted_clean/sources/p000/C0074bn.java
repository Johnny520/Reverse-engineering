package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: renamed from: bn */
/* JADX INFO: loaded from: classes.dex */
public final class C0074bn {

    /* JADX INFO: renamed from: a */
    public int f813a;

    /* JADX INFO: renamed from: b */
    public int f814b;

    /* JADX INFO: renamed from: c */
    public int[] f815c;

    /* JADX INFO: renamed from: d */
    public int f816d;

    /* JADX INFO: renamed from: a */
    public final void m562a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f816d;
        int i4 = i3 * 2;
        int[] iArr = this.f815c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f815c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f815c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f815c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f816d++;
    }

    /* JADX INFO: renamed from: b */
    public final void m563b(RecyclerView recyclerView, boolean z) {
        this.f816d = 0;
        int[] iArr = this.f815c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0540nz abstractC0540nz = recyclerView.f605l;
        if (recyclerView.f603k == null || abstractC0540nz == null || !abstractC0540nz.f3463i) {
            return;
        }
        if (z) {
            if (!recyclerView.f589d.m2648f()) {
                abstractC0540nz.mo358i(recyclerView.f603k.mo757a(), this);
            }
        } else if (!recyclerView.m381K()) {
            abstractC0540nz.mo357h(this.f813a, this.f814b, recyclerView.f588c0, this);
        }
        int i = this.f816d;
        if (i > abstractC0540nz.f3464j) {
            abstractC0540nz.f3464j = i;
            abstractC0540nz.f3465k = z;
            recyclerView.f585b.m2403k();
        }
    }
}
