package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Tk */
/* JADX INFO: loaded from: classes.dex */
public final class C0843Tk implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final C2601ut f2688b = null;

    /* JADX INFO: renamed from: a */
    public final C1017Xm f2689a;

    static {
        f2688b = C2601ut.m5116a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    }

    public C0843Tk(C1017Xm r1) {
        this.f2689a = r1;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo994a(Object r1) {
        C1057Yj r12 = (C1057Yj) r1;
        return true;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object r3, int r4, int r5, C2644vt r6) {
        C1057Yj r32 = (C1057Yj) r3;
        C1017Xm r42 = this.f2689a;
        if (r42 == null) goto L16;
        C1022Xr r43 = (C1022Xr) r42.f3226b;
        C1065Yr r52 = C1065Yr.m2002a(r32);
        Object r0 = r43.m186a(r52);
        ArrayDeque r1 = C1065Yr.f3375b;
        monitor-enter(r1);
        r1.offer(r52);     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
        C1057Yj r02 = (C1057Yj) r0;
        if (r02 != null) goto L11;
        r43.m189d(C1065Yr.m2002a(r32), r32);
        goto L16
    L11:
        r32 = r02;
    L12:
        th = move-exception;
        throw th;
    L16:
        return new C1108Zr(r32, new C0886Uk(r32, ((Integer) r6.m5177c(f2688b)).intValue()));
    }
}
