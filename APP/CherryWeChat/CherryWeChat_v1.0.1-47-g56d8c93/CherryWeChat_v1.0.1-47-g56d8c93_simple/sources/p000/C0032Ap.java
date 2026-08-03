package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: Ap */
/* JADX INFO: loaded from: classes.dex */
public final class C0032Ap implements InterfaceC0565N5 {

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config f63f = null;

    /* JADX INFO: renamed from: a */
    public final C2821zy f64a;

    /* JADX INFO: renamed from: b */
    public final Set f65b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f66c;

    /* JADX INFO: renamed from: d */
    public final long f67d;

    /* JADX INFO: renamed from: e */
    public long f68e;

    static {
        f63f = Bitmap.Config.ARGB_8888;
    }

    public C0032Ap(long r4) {
        C2821zy r0 = new C2821zy();
        HashSet r1 = new HashSet(Arrays.asList(Bitmap.Config.values()));
        r1.add(null);
        r1.remove(Bitmap.Config.HARDWARE);
        Set r12 = Collections.unmodifiableSet(r1);
        this.f67d = r4;
        this.f64a = r0;
        this.f65b = r12;
        this.f66c = new C0668Pg(18);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Bitmap m49a(int r6, int r7, Bitmap.Config r8) {
        monitor-enter(this);
    L14:
        th = move-exception;
        throw th;
    L4:
        if (r8 == Bitmap.Config.HARDWARE) goto L26;
        C2821zy r0 = this.f64a;     // Catch: Throwable -> L14
        if (r8 == null) goto L8;
        Bitmap.Config r1 = r8;
    L9:
        Bitmap r02 = r0.m5457b(r6, r7, r1);     // Catch: Throwable -> L14
        if (r02 == null) goto L12;
        long r12 = this.f68e;     // Catch: Throwable -> L14
        this.f64a.getClass();     // Catch: Throwable -> L14
        this.f68e = r12 - ((long) AbstractC2622vD.m5132c(r02));     // Catch: Throwable -> L14
        this.f66c.getClass();     // Catch: Throwable -> L14
        r02.setHasAlpha(true);     // Catch: Throwable -> L14
        r02.setPremultiplied(true);     // Catch: Throwable -> L14
    L18:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L21;
        this.f64a.getClass();     // Catch: Throwable -> L14
        C2821zy.m5455c(AbstractC2622vD.m5133d(r8) * (r6 * r7), r8);     // Catch: Throwable -> L14
    L21:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L23;
        Objects.toString(this.f64a);     // Catch: Throwable -> L14
    L23:
        monitor-exit(this);
        return r02;
    L12:
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L18;
        this.f64a.getClass();     // Catch: Throwable -> L14
        C2821zy.m5455c(AbstractC2622vD.m5133d(r8) * (r6 * r7), r8);     // Catch: Throwable -> L14
        goto L18
    L8:
        r1 = f63f;     // Catch: Throwable -> L14
        goto L9
    L26:
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + r8 + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");     // Catch: Throwable -> L14
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m50b(long r7) {
        monitor-enter(this);
    L29:
    L15:
        th = move-exception;
        throw th;
    L4:
        if (this.f68e <= r7) goto L25;
        C2821zy r0 = this.f64a;     // Catch: Throwable -> L15
        Bitmap r1 = (Bitmap) r0.f9548b.m1287R();     // Catch: Throwable -> L15
        if (r1 == null) goto L8;
        r0.m5456a(Integer.valueOf(AbstractC2622vD.m5132c(r1)), r1);     // Catch: Throwable -> L15
    L8:
        if (r1 == null) goto L10;
        this.f66c.getClass();     // Catch: Throwable -> L15
        long r2 = this.f68e;     // Catch: Throwable -> L15
        this.f64a.getClass();     // Catch: Throwable -> L15
        this.f68e = r2 - ((long) AbstractC2622vD.m5132c(r1));     // Catch: Throwable -> L15
        if (Log.isLoggable("LruBitmapPool", 3) == false) goto L21;
        this.f64a.getClass();     // Catch: Throwable -> L15
        C2821zy.m5455c(AbstractC2622vD.m5132c(r1), r1.getConfig());     // Catch: Throwable -> L15
    L21:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L23;
        Objects.toString(this.f64a);     // Catch: Throwable -> L15
    L23:
        r1.recycle();     // Catch: Throwable -> L15
        goto L29
    L10:
        if (Log.isLoggable("LruBitmapPool", 5) == false) goto L12;
        Objects.toString(this.f64a);     // Catch: Throwable -> L15
    L12:
        this.f68e = 0;     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L25:
        monitor-exit(this);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: e */
    public final Bitmap mo51e(int r2, int r3, Bitmap.Config r4) {
        Bitmap r0 = m49a(r2, r3, r4);
        if (r0 != null) goto L9;
        if (r4 != null) goto L8;
        r4 = f63f;
    L8:
        return Bitmap.createBitmap(r2, r3, r4);
    L9:
        return r0;
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: g */
    public final Bitmap mo52g(int r2, int r3, Bitmap.Config r4) {
        Bitmap r0 = m49a(r2, r3, r4);
        if (r0 == null) goto L6;
        r0.eraseColor(0);
        return r0;
    L6:
        if (r4 != null) goto L10;
        r4 = f63f;
    L10:
        return Bitmap.createBitmap(r2, r3, r4);
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: h */
    public final synchronized void mo53h(Bitmap r7) {
        monitor-enter(this);
        if (r7 == null) goto L33;
        if (r7.isRecycled() == true) goto L31;
        if (r7.isMutable() == false) goto L25;
        this.f64a.getClass();     // Catch: Throwable -> L16
        if (AbstractC2622vD.m5132c(r7) > this.f67d) goto L25;
        if (this.f65b.contains(r7.getConfig()) == false) goto L25;
        this.f64a.getClass();     // Catch: Throwable -> L16
        int r0 = AbstractC2622vD.m5132c(r7);     // Catch: Throwable -> L16
        this.f64a.m5459e(r7);     // Catch: Throwable -> L16
        this.f66c.getClass();     // Catch: Throwable -> L16
        this.f68e += (long) r0;
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L19;
        this.f64a.getClass();     // Catch: Throwable -> L16
        C2821zy.m5455c(AbstractC2622vD.m5132c(r7), r7.getConfig());     // Catch: Throwable -> L16
    L19:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L21;
        Objects.toString(this.f64a);     // Catch: Throwable -> L16
    L21:
        m50b(this.f67d);     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L25:
        if (Log.isLoggable("LruBitmapPool", 2) == false) goto L27;
        this.f64a.getClass();     // Catch: Throwable -> L16
        C2821zy.m5455c(AbstractC2622vD.m5132c(r7), r7.getConfig());     // Catch: Throwable -> L16
        r7.isMutable();     // Catch: Throwable -> L16
        this.f65b.contains(r7.getConfig());     // Catch: Throwable -> L16
    L27:
        r7.recycle();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L31:
        throw new IllegalStateException("Cannot pool recycled bitmap");     // Catch: Throwable -> L16
    L33:
        throw new NullPointerException("Bitmap must not be null");     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: k */
    public final void mo54k(int r5) {
        if (r5 < 40) goto L5;
    L14:
        mo55m();
        return;
    L5:
        if (r5 >= 20) goto L14;
        if (r5 < 20) goto L9;
    L12:
        m50b(this.f67d / 2);
        return;
    L9:
        if (r5 == 15) goto L12;
    }

    @Override // p000.InterfaceC0565N5
    /* JADX INFO: renamed from: m */
    public final void mo55m() {
        m50b(0);
    }
}
