package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 implements by2 {

    /* JADX INFO: renamed from: h */
    public final int f1653h;

    /* JADX INFO: renamed from: i */
    public final int f1654i;

    /* JADX INFO: renamed from: j */
    public l82 f1655j;

    /* JADX INFO: renamed from: k */
    public final Handler f1656k;

    /* JADX INFO: renamed from: l */
    public final int f1657l;

    /* JADX INFO: renamed from: m */
    public final long f1658m;

    /* JADX INFO: renamed from: n */
    public Bitmap f1659n;

    public cp0(Handler handler, int i, long j) {
        if (!b93.m502i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            C0676s.m4651j("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.f1653h = Integer.MIN_VALUE;
        this.f1654i = Integer.MIN_VALUE;
        this.f1656k = handler;
        this.f1657l = i;
        this.f1658m = j;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: m */
    public final void mo601m(yq2 yq2Var) throws Throwable {
        yq2Var.m6311l(this.f1653h, this.f1654i);
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: o */
    public final void mo602o(l82 l82Var) {
        this.f1655j = l82Var;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: u */
    public final l82 mo604u() {
        return this.f1655j;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: v */
    public final void mo605v(Drawable drawable) {
        this.f1659n = null;
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: w */
    public final void mo606w(Object obj) {
        this.f1659n = (Bitmap) obj;
        Handler handler = this.f1656k;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f1658m);
    }

    @Override // p000.ga1
    /* JADX INFO: renamed from: x */
    public final void mo881x() {
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: f */
    public final void mo599f(Drawable drawable) {
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: g */
    public final void mo600g(yq2 yq2Var) {
    }

    @Override // p000.by2
    /* JADX INFO: renamed from: p */
    public final void mo603p(Drawable drawable) {
    }
}
