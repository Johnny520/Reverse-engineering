package androidx.core.view;

import android.graphics.Rect;
import java.util.List;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect[][] f6861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect[][] f6862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8494[] f6863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3058 f6864;

    public AbstractC3056(C3058 c3058) {
        this.f6862 = new Rect[10][];
        this.f6861 = new Rect[10][];
        this.f6864 = c3058;
        mo4584(c3058);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract void mo4614(C8494 c8494);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4583(int i, C8494 c8494) {
        if (this.f6863 == null) {
            this.f6863 = new C8494[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f6863[AbstractC3100.m4791(i2)] = c8494;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4584(C3058 c3058) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo4599 = c3058.f6866.mo4599(i);
            int iM4791 = AbstractC3100.m4791(i);
            this.f6862[iM4791] = (Rect[]) listMo4599.toArray(new Rect[listMo4599.size()]);
            if (i != 8) {
                List<Rect> listMo4611 = c3058.f6866.mo4611(i);
                this.f6861[iM4791] = (Rect[]) listMo4611.toArray(new Rect[listMo4611.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract C3058 mo4616();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4617() {
        C8494[] c8494Arr = this.f6863;
        if (c8494Arr != null) {
            C8494 c8494Mo4612 = c8494Arr[0];
            C8494 c8494Mo46122 = c8494Arr[1];
            C3058 c3058 = this.f6864;
            if (c8494Mo46122 == null) {
                c8494Mo46122 = c3058.f6866.mo4612(2);
            }
            if (c8494Mo4612 == null) {
                c8494Mo4612 = c3058.f6866.mo4612(1);
            }
            mo4618(C8494.m13500(c8494Mo4612, c8494Mo46122));
            C8494 c8494 = this.f6863[AbstractC3100.m4791(16)];
            if (c8494 != null) {
                mo4619(c8494);
            }
            C8494 c84942 = this.f6863[AbstractC3100.m4791(32)];
            if (c84942 != null) {
                mo4615(c84942);
            }
            C8494 c84943 = this.f6863[AbstractC3100.m4791(64)];
            if (c84943 != null) {
                mo4620(c84943);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo4618(C8494 c8494);

    public AbstractC3056() {
        this(new C3058((C3058) null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4615(C8494 c8494) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo4619(C8494 c8494) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo4620(C8494 c8494) {
    }
}
