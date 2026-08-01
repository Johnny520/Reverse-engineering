package p243q9;

import gb.AbstractC2650c1;
import gb.AbstractC2706r0;
import gb.EnumC2691m2;
import okhttp3.internal.url._UrlKt;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5114x;
import p186m9.AbstractC5128i;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p229p9.InterfaceC6005h0;
import ua.C8579a;
import ua.C8581b;
import ua.C8594k;
import ua.C8607x;

/* JADX INFO: renamed from: q9.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6332g {

    /* JADX INFO: renamed from: a */
    public static final C5695f f19868a;

    /* JADX INFO: renamed from: b */
    public static final C5695f f19869b;

    /* JADX INFO: renamed from: c */
    public static final C5695f f19870c;

    /* JADX INFO: renamed from: d */
    public static final C5695f f19871d;

    /* JADX INFO: renamed from: e */
    public static final C5695f f19872e;

    static {
        C5695f c5695fM23027j = C5695f.m23027j("message");
        c5695fM23027j.getClass();
        f19868a = c5695fM23027j;
        C5695f c5695fM23027j2 = C5695f.m23027j("replaceWith");
        c5695fM23027j2.getClass();
        f19869b = c5695fM23027j2;
        C5695f c5695fM23027j3 = C5695f.m23027j("level");
        c5695fM23027j3.getClass();
        f19870c = c5695fM23027j3;
        C5695f c5695fM23027j4 = C5695f.m23027j("expression");
        c5695fM23027j4.getClass();
        f19871d = c5695fM23027j4;
        C5695f c5695fM23027j5 = C5695f.m23027j("imports");
        c5695fM23027j5.getClass();
        f19872e = c5695fM23027j5;
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6328c m24999b(AbstractC5128i abstractC5128i, String str, String str2, String str3, boolean z10) {
        abstractC5128i.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        C6337l c6337l = new C6337l(abstractC5128i, C5135p.a.f15526B, AbstractC5109u0.m20771l(AbstractC4717x.m18815a(f19871d, new C8607x(str2)), AbstractC4717x.m18815a(f19872e, new C8581b(AbstractC5114x.m20800o(), new C6331f(abstractC5128i)))), false, 8, null);
        C5692c c5692c = C5135p.a.f15620y;
        C4711r c4711rM18815a = AbstractC4717x.m18815a(f19868a, new C8607x(str));
        C4711r c4711rM18815a2 = AbstractC4717x.m18815a(f19869b, new C8579a(c6337l));
        C5695f c5695f = f19870c;
        C5691b c5691bM22993c = C5691b.f17894d.m22993c(C5135p.a.f15524A);
        C5695f c5695fM23027j = C5695f.m23027j(str3);
        c5695fM23027j.getClass();
        return new C6337l(abstractC5128i, c5692c, AbstractC5109u0.m20771l(c4711rM18815a, c4711rM18815a2, AbstractC4717x.m18815a(c5695f, new C8594k(c5691bM22993c, c5695fM23027j))), z10);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC6328c m25000c(AbstractC5128i abstractC5128i, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return m24999b(abstractC5128i, str, str2, str3, z10);
    }

    /* JADX INFO: renamed from: d */
    public static final AbstractC2706r0 m25001d(AbstractC5128i abstractC5128i, InterfaceC6005h0 interfaceC6005h0) {
        interfaceC6005h0.getClass();
        AbstractC2650c1 abstractC2650c1M20924m = interfaceC6005h0.mo12669t().m20924m(EnumC2691m2.f7042u, abstractC5128i.m20913X());
        abstractC2650c1M20924m.getClass();
        return abstractC2650c1M20924m;
    }
}
