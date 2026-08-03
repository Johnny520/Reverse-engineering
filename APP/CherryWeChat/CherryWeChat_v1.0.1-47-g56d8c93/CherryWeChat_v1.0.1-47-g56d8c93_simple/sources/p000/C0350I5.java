package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: I5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0350I5 implements InterfaceC2518sw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1175a;

    /* JADX INFO: renamed from: b */
    public final Object f1176b;

    /* JADX INFO: renamed from: c */
    public final Object f1177c;

    public /* synthetic */ C0350I5(int r1, Object r2, Object r3) {
        this.f1175a = r1;
        this.f1176b = r2;
        this.f1177c = r3;
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw mo749a(Object r12, int r13, int r14, C2644vt r15) {
        switch(this.f1175a) {
            case 0: goto L48;
            case 1: goto L43;
            default: goto L4;
        };
    L4:
        InputStream r122 = (InputStream) r12;
        if ((r122 instanceof C1340dv) == false) goto L7;
        C1340dv r123 = (C1340dv) r122;
        boolean r1 = false;
    L8:
        ArrayDeque r2 = C2631vg.f9139c;
        monitor-enter(r2);
        C2631vg r0 = (C2631vg) r2.poll();     // Catch: Throwable -> L39
        monitor-exit(r2);     // Catch: Throwable -> L39
        if (r0 != null) goto L14;
        r0 = new C2631vg();
    L14:
        C2631vg r3 = r0;
        r3.f9140a = r123;
        C2641vq r02 = new C2641vq(r3);
        C0299Gy r9 = new C0299Gy(2, r123, r3);
        C2543te r4 = (C2543te) this.f1176b;     // Catch: Throwable -> L27
        C0608O5 r132 = r4.m5024a(new C2656w4(r02, r4.f8856d, r4.f8855c), r13, r14, r15, r9);     // Catch: Throwable -> L27
        r3.f9141b = null;
        r3.f9140a = null;
        monitor-enter(r2);
        r2.offer(r3);     // Catch: Throwable -> L23
        monitor-exit(r2);     // Catch: Throwable -> L23
        if (r1 == false) goto L22;
        r123.m2597f();
    L22:
        return r132;
    L23:
        th = move-exception;
        throw th;
    L27:
        th = move-exception;
        r3.f9141b = null;
        r3.f9140a = null;
        ArrayDeque r142 = C2631vg.f9139c;
        monitor-enter(r142);
        r142.offer(r3);     // Catch: Throwable -> L35
        if (r1 == false) goto L61;
        r123.m2597f();
        throw th;
    L61:
        throw th;
    L35:
        th = move-exception;
        throw th;
    L39:
        th = move-exception;
        throw th;
    L7:
        r1 = true;
        r123 = new C1340dv(r122, (C2812zp) this.f1177c);
        goto L8
    L43:
        InterfaceC2389pw r124 = ((C2604uw) this.f1176b).m5117c((Uri) r12, r15);
        if (r124 != null) goto L47;
        return null;
    L47:
        return AbstractC0148Dc.m271e((InterfaceC0565N5) this.f1177c, (Drawable) ((C0069Bj) r124).get(), r13, r14);
    L48:
        InterfaceC2389pw r125 = ((InterfaceC2518sw) this.f1176b).mo749a(r12, r13, r14, r15);
        Resources r133 = (Resources) this.f1177c;
        if (r125 != null) goto L52;
        return null;
    L52:
        return new C0608O5(r133, r125);
    }

    @Override // p000.InterfaceC2518sw
    /* JADX INFO: renamed from: b */
    public final boolean mo750b(Object r2, C2644vt r3) {
        switch(this.f1175a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        InputStream r22 = (InputStream) r2;
        return true;
    L7:
        return "android.resource".equals(((Uri) r2).getScheme());
    L9:
        return ((InterfaceC2518sw) this.f1176b).mo750b(r2, r3);
    }

    public C0350I5(Resources r2, InterfaceC2518sw r3) {
        this.f1175a = 0;
        this.f1177c = r2;
        this.f1176b = r3;
    }
}
