package p142c2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import p171h2.C2239f;
import p171h2.InterfaceC2236c;
import p177i2.InterfaceC2313c;
import p195l2.AbstractC2511o;

/* JADX INFO: renamed from: c2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1894e implements InterfaceC2313c {

    /* JADX INFO: renamed from: d */
    public final int f6437d;

    /* JADX INFO: renamed from: e */
    public final int f6438e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2236c f6439f;

    /* JADX INFO: renamed from: g */
    public final Handler f6440g;

    /* JADX INFO: renamed from: h */
    public final int f6441h;

    /* JADX INFO: renamed from: i */
    public final long f6442i;

    /* JADX INFO: renamed from: j */
    public Bitmap f6443j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1894e(Handler handler, int i5, long j5) {
        if (!AbstractC2511o.m4460i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f6437d = Integer.MIN_VALUE;
        this.f6438e = Integer.MIN_VALUE;
        this.f6440g = handler;
        this.f6441h = i5;
        this.f6442i = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: d */
    public final void mo3377d(InterfaceC2236c interfaceC2236c) {
        this.f6439f = interfaceC2236c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: j */
    public final void mo3379j(C2239f c2239f) throws Throwable {
        c2239f.m4067l(this.f6437d, this.f6438e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: t */
    public final InterfaceC2236c mo3381t() {
        return this.f6439f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: u */
    public final void mo3382u(Drawable drawable) {
        this.f6443j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: w */
    public final void mo3384w(Object obj) {
        this.f6443j = (Bitmap) obj;
        Handler handler = this.f6440g;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f6442i);
    }

    @Override // p154e2.InterfaceC2024c
    /* JADX INFO: renamed from: x */
    public final void mo2852x() {
    }

    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: f */
    public final void mo3378f(Drawable drawable) {
    }

    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: p */
    public final void mo3380p(Drawable drawable) {
    }

    @Override // p177i2.InterfaceC2313c
    /* JADX INFO: renamed from: v */
    public final void mo3383v(C2239f c2239f) {
    }
}
