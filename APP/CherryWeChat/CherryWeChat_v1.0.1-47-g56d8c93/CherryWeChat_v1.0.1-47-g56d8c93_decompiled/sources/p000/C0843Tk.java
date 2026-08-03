package p000;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: Tk */
/* JADX INFO: loaded from: classes.dex */
public final class C0843Tk implements InterfaceC1189as {

    /* JADX INFO: renamed from: b */
    public static final C2601ut f2688b = C2601ut.m5116a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    public final C1017Xm f2689a;

    public C0843Tk(C1017Xm c1017Xm) {
        this.f2689a = c1017Xm;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo994a(Object obj) {
        return true;
    }

    @Override // p000.InterfaceC1189as
    /* JADX INFO: renamed from: b */
    public final C1108Zr mo995b(Object obj, int i, int i2, C2644vt c2644vt) {
        C1057Yj c1057Yj = (C1057Yj) obj;
        C1017Xm c1017Xm = this.f2689a;
        if (c1017Xm != null) {
            C1022Xr c1022Xr = (C1022Xr) c1017Xm.f3226b;
            C1065Yr c1065YrM2002a = C1065Yr.m2002a(c1057Yj);
            Object objM186a = c1022Xr.m186a(c1065YrM2002a);
            ArrayDeque arrayDeque = C1065Yr.f3375b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c1065YrM2002a);
            }
            C1057Yj c1057Yj2 = (C1057Yj) objM186a;
            if (c1057Yj2 == null) {
                c1022Xr.m189d(C1065Yr.m2002a(c1057Yj), c1057Yj);
            } else {
                c1057Yj = c1057Yj2;
            }
        }
        return new C1108Zr(c1057Yj, new C0886Uk(c1057Yj, ((Integer) c2644vt.m5177c(f2688b)).intValue()));
    }
}
