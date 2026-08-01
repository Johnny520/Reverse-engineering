package p358y9;

import p172l8.AbstractC4717x;
import p172l8.C4701j;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p213oa.C5692c;
import p358y9.C9614c0;

/* JADX INFO: renamed from: y9.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9612b0 {

    /* JADX INFO: renamed from: a */
    public static final C5692c f32717a;

    /* JADX INFO: renamed from: b */
    public static final C5692c f32718b;

    /* JADX INFO: renamed from: c */
    public static final C5692c f32719c;

    /* JADX INFO: renamed from: d */
    public static final C5692c f32720d;

    /* JADX INFO: renamed from: e */
    public static final String f32721e;

    /* JADX INFO: renamed from: f */
    public static final C5692c[] f32722f;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC9630k0 f32723g;

    /* JADX INFO: renamed from: h */
    public static final C9614c0 f32724h;

    static {
        C5692c c5692c = new C5692c("org.jspecify.nullness");
        f32717a = c5692c;
        C5692c c5692c2 = new C5692c("org.jspecify.annotations");
        f32718b = c5692c2;
        C5692c c5692c3 = new C5692c("io.reactivex.rxjava3.annotations");
        f32719c = c5692c3;
        C5692c c5692c4 = new C5692c("org.checkerframework.checker.nullness.compatqual");
        f32720d = c5692c4;
        String strM22994a = c5692c3.m22994a();
        f32721e = strM22994a;
        f32722f = new C5692c[]{new C5692c(strM22994a + ".Nullable"), new C5692c(strM22994a + ".NonNull")};
        C5692c c5692c5 = new C5692c("org.jetbrains.annotations");
        C9614c0.a aVar = C9614c0.f32734d;
        C4711r c4711rM18815a = AbstractC4717x.m18815a(c5692c5, aVar.m37615a());
        C4711r c4711rM18815a2 = AbstractC4717x.m18815a(new C5692c("androidx.annotation"), aVar.m37615a());
        C4711r c4711rM18815a3 = AbstractC4717x.m18815a(new C5692c("android.support.annotation"), aVar.m37615a());
        C4711r c4711rM18815a4 = AbstractC4717x.m18815a(new C5692c("android.annotation"), aVar.m37615a());
        C4711r c4711rM18815a5 = AbstractC4717x.m18815a(new C5692c("com.android.annotations"), aVar.m37615a());
        C4711r c4711rM18815a6 = AbstractC4717x.m18815a(new C5692c("org.eclipse.jdt.annotation"), aVar.m37615a());
        C4711r c4711rM18815a7 = AbstractC4717x.m18815a(new C5692c("org.checkerframework.checker.nullness.qual"), aVar.m37615a());
        C4711r c4711rM18815a8 = AbstractC4717x.m18815a(c5692c4, aVar.m37615a());
        C4711r c4711rM18815a9 = AbstractC4717x.m18815a(new C5692c("javax.annotation"), aVar.m37615a());
        C4711r c4711rM18815a10 = AbstractC4717x.m18815a(new C5692c("edu.umd.cs.findbugs.annotations"), aVar.m37615a());
        C4711r c4711rM18815a11 = AbstractC4717x.m18815a(new C5692c("io.reactivex.annotations"), aVar.m37615a());
        C5692c c5692c6 = new C5692c("androidx.annotation.RecentlyNullable");
        EnumC9638o0 enumC9638o0 = EnumC9638o0.f32828t;
        C4711r c4711rM18815a12 = AbstractC4717x.m18815a(c5692c6, new C9614c0(enumC9638o0, null, null, 4, null));
        C4711r c4711rM18815a13 = AbstractC4717x.m18815a(new C5692c("androidx.annotation.RecentlyNonNull"), new C9614c0(enumC9638o0, null, null, 4, null));
        C4711r c4711rM18815a14 = AbstractC4717x.m18815a(new C5692c("lombok"), aVar.m37615a());
        C4701j c4701j = new C4701j(2, 1);
        EnumC9638o0 enumC9638o02 = EnumC9638o0.f32829u;
        f32723g = new C9634m0(AbstractC5109u0.m20771l(c4711rM18815a, c4711rM18815a2, c4711rM18815a3, c4711rM18815a4, c4711rM18815a5, c4711rM18815a6, c4711rM18815a7, c4711rM18815a8, c4711rM18815a9, c4711rM18815a10, c4711rM18815a11, c4711rM18815a12, c4711rM18815a13, c4711rM18815a14, AbstractC4717x.m18815a(c5692c, new C9614c0(enumC9638o0, c4701j, enumC9638o02)), AbstractC4717x.m18815a(c5692c2, new C9614c0(enumC9638o0, new C4701j(2, 1), enumC9638o02)), AbstractC4717x.m18815a(c5692c3, new C9614c0(enumC9638o0, new C4701j(1, 8), enumC9638o02))));
        f32724h = new C9614c0(enumC9638o0, null, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static final C9622g0 m37601a(C4701j c4701j) {
        c4701j.getClass();
        C9614c0 c9614c0 = f32724h;
        EnumC9638o0 enumC9638o0M37613c = (c9614c0.m37614d() == null || c9614c0.m37614d().compareTo(c4701j) > 0) ? c9614c0.m37613c() : c9614c0.m37612b();
        return new C9622g0(enumC9638o0M37613c, m37603c(enumC9638o0M37613c), null, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C9622g0 m37602b(C4701j c4701j, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4701j = C4701j.f13912v;
        }
        return m37601a(c4701j);
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC9638o0 m37603c(EnumC9638o0 enumC9638o0) {
        enumC9638o0.getClass();
        if (enumC9638o0 == EnumC9638o0.f32828t) {
            return null;
        }
        return enumC9638o0;
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC9638o0 m37604d(C5692c c5692c) {
        c5692c.getClass();
        return m37608h(c5692c, InterfaceC9630k0.f32816a.m37679a(), null, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public static final C5692c m37605e() {
        return f32718b;
    }

    /* JADX INFO: renamed from: f */
    public static final C5692c[] m37606f() {
        return f32722f;
    }

    /* JADX INFO: renamed from: g */
    public static final EnumC9638o0 m37607g(C5692c c5692c, InterfaceC9630k0 interfaceC9630k0, C4701j c4701j) {
        c5692c.getClass();
        interfaceC9630k0.getClass();
        c4701j.getClass();
        EnumC9638o0 enumC9638o0 = (EnumC9638o0) interfaceC9630k0.mo37678a(c5692c);
        if (enumC9638o0 != null) {
            return enumC9638o0;
        }
        C9614c0 c9614c0 = (C9614c0) f32723g.mo37678a(c5692c);
        return c9614c0 == null ? EnumC9638o0.f32827s : (c9614c0.m37614d() == null || c9614c0.m37614d().compareTo(c4701j) > 0) ? c9614c0.m37613c() : c9614c0.m37612b();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ EnumC9638o0 m37608h(C5692c c5692c, InterfaceC9630k0 interfaceC9630k0, C4701j c4701j, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c4701j = new C4701j(1, 7, 20);
        }
        return m37607g(c5692c, interfaceC9630k0, c4701j);
    }
}
