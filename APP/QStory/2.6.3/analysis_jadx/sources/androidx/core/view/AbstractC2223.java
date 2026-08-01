package androidx.core.view;

import android.graphics.Rect;
import java.util.List;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect[][] f6516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect[][] f6517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7665[] f6518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2225 f6519;

    public AbstractC2223(C2225 c2225) {
        this.f6517 = new Rect[10][];
        this.f6516 = new Rect[10][];
        this.f6519 = c2225;
        mo4024(c2225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract void mo4054(C7665 c7665);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4023(int i, C7665 c7665) {
        if (this.f6518 == null) {
            this.f6518 = new C7665[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f6518[AbstractC2267.m4231(i2)] = c7665;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4024(C2225 c2225) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo4039 = c2225.f6521.mo4039(i);
            int iM4231 = AbstractC2267.m4231(i);
            this.f6517[iM4231] = (Rect[]) listMo4039.toArray(new Rect[listMo4039.size()]);
            if (i != 8) {
                List<Rect> listMo4051 = c2225.f6521.mo4051(i);
                this.f6516[iM4231] = (Rect[]) listMo4051.toArray(new Rect[listMo4051.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract C2225 mo4056();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4057() {
        C7665[] c7665Arr = this.f6518;
        if (c7665Arr != null) {
            C7665 c7665Mo4052 = c7665Arr[0];
            C7665 c7665Mo40522 = c7665Arr[1];
            C2225 c2225 = this.f6519;
            if (c7665Mo40522 == null) {
                c7665Mo40522 = c2225.f6521.mo4052(2);
            }
            if (c7665Mo4052 == null) {
                c7665Mo4052 = c2225.f6521.mo4052(1);
            }
            mo4058(C7665.m12941(c7665Mo4052, c7665Mo40522));
            C7665 c7665 = this.f6518[AbstractC2267.m4231(16)];
            if (c7665 != null) {
                mo4059(c7665);
            }
            C7665 c76652 = this.f6518[AbstractC2267.m4231(32)];
            if (c76652 != null) {
                mo4055(c76652);
            }
            C7665 c76653 = this.f6518[AbstractC2267.m4231(64)];
            if (c76653 != null) {
                mo4060(c76653);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo4058(C7665 c7665);

    public AbstractC2223() {
        this(new C2225((C2225) null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4055(C7665 c7665) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo4059(C7665 c7665) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo4060(C7665 c7665) {
    }
}
