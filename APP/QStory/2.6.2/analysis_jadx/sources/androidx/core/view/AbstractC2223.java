package androidx.core.view;

import android.graphics.Rect;
import java.util.List;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Rect[][] f6515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Rect[][] f6516;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C7664[] f6517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2225 f6518;

    public AbstractC2223(C2225 c2225) {
        this.f6516 = new Rect[10][];
        this.f6515 = new Rect[10][];
        this.f6518 = c2225;
        mo4014(c2225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract void mo4044(C7664 c7664);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo4013(int i, C7664 c7664) {
        if (this.f6517 == null) {
            this.f6517 = new C7664[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f6517[AbstractC2267.m4221(i2)] = c7664;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo4014(C2225 c2225) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo4029 = c2225.f6520.mo4029(i);
            int iM4221 = AbstractC2267.m4221(i);
            this.f6516[iM4221] = (Rect[]) listMo4029.toArray(new Rect[listMo4029.size()]);
            if (i != 8) {
                List<Rect> listMo4041 = c2225.f6520.mo4041(i);
                this.f6515[iM4221] = (Rect[]) listMo4041.toArray(new Rect[listMo4041.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public abstract C2225 mo4046();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4047() {
        C7664[] c7664Arr = this.f6517;
        if (c7664Arr != null) {
            C7664 c7664Mo4042 = c7664Arr[0];
            C7664 c7664Mo40422 = c7664Arr[1];
            C2225 c2225 = this.f6518;
            if (c7664Mo40422 == null) {
                c7664Mo40422 = c2225.f6520.mo4042(2);
            }
            if (c7664Mo4042 == null) {
                c7664Mo4042 = c2225.f6520.mo4042(1);
            }
            mo4048(C7664.m12912(c7664Mo4042, c7664Mo40422));
            C7664 c7664 = this.f6517[AbstractC2267.m4221(16)];
            if (c7664 != null) {
                mo4049(c7664);
            }
            C7664 c76642 = this.f6517[AbstractC2267.m4221(32)];
            if (c76642 != null) {
                mo4045(c76642);
            }
            C7664 c76643 = this.f6517[AbstractC2267.m4221(64)];
            if (c76643 != null) {
                mo4050(c76643);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo4048(C7664 c7664);

    public AbstractC2223() {
        this(new C2225((C2225) null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4045(C7664 c7664) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void mo4049(C7664 c7664) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo4050(C7664 c7664) {
    }
}
