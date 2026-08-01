package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2007d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f2008e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f2009f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f2010g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2011h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2012i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ gk0(Context context, String str, String str2, String str3, String str4, int i) {
        this.f2007d = i;
        this.f2008e = context;
        this.f2009f = str;
        this.f2010g = str2;
        this.f2011h = str3;
        this.f2012i = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2007d) {
            case 0:
                hk0.m1331C(this.f2008e, this.f2009f, this.f2010g, this.f2011h, this.f2012i);
                break;
            default:
                hk0.m1369x(this.f2008e, this.f2009f, this.f2010g, this.f2011h, this.f2012i);
                break;
        }
    }
}
