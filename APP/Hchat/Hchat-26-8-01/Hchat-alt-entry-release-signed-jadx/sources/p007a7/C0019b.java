package p007a7;

import ae.C0077h;
import bsh.classpath.BshClassPath;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import md.EnumC2824a;
import p034c7.C0406b;
import p038ce.C0560m;
import p166l7.C2525m;
import p199nd.AbstractC2963b0;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4317m;
import p314v7.C4487b0;
import p314v7.C4490d;
import p351xe.AbstractC5792m;

/* JADX INFO: renamed from: a7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0019b implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f59g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ae.e.accept(java.lang.Object):void, bc.k.e():void, be.a0.g(ud.r):void, be.b.A(java.util.ArrayList):void, be.b.H(qd.s):void, be.b.R(ud.r):void, be.b.X(ud.e):void, be.b.h(ud.e):boolean, be.b.n(ud.r, java.util.List, java.util.HashSet, boolean):nd.x, be.c.g(ud.r):void, be.d0.g(ud.r):void, be.e.f(ud.u):void, be.h0.k(ud.e):void, be.l.i(ud.e):boolean, bsh.classpath.BshClassPath.searchJarFSForClasses(java.net.URL):java.lang.String[], bsh.classpath.BshClassPath.searchJrtFSForClasses(java.net.URL):java.lang.String[], c7.a.a():c7.f, ce.l.g(ud.r):void, ce.l.n(java.util.LinkedHashSet, ud.r):void, ce.m.g(ud.r):void, qe.c.o(java.util.LinkedHashSet):java.util.Optional, qe.n.k(ud.r, qd.s):void] */
    public /* synthetic */ C0019b(int i9) {
        this.f59g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        EnumC3400k enumC3400k;
        switch (this.f59g) {
            case 0:
                C4490d c4490d = (C4490d) obj;
                if (!(c4490d.f14846k instanceof C4487b0)) {
                    return false;
                }
                C2525m c2525m = (C2525m) c4490d.m5553u(C2525m.class);
                String strM5934V = c2525m != null ? c2525m.m5934V() : null;
                return !(strM5934V == null ? false : "string".equals(strM5934V) ? true : C2525m.m5932W("string").equals(C2525m.m5932W(strM5934V)));
            case 1:
                return ((C3515s) obj).f11444i.f9217g.mo6235a(EnumC2824a.f9127M);
            case 2:
                C3514r c3514r = (C3514r) obj;
                C4320p c4320p = c3514r.f11420j;
                if (c4320p == null || c4320p.f14396k == EnumC3400k.f10972X || c3514r.f11440m.m7398b().f11413c.size() > 1) {
                    return false;
                }
                return c4320p.f9217g.mo6235a(EnumC2824a.f9166s);
            case 3:
                return ((C4311g) obj).f14391m.m856h();
            case 4:
                AbstractC3506j abstractC3506j = ((C4311g) obj).f14392n;
                abstractC3506j.getClass();
                return abstractC3506j instanceof C3497a;
            case 5:
                return !((C4311g) obj).f14391m.m857i();
            case 6:
                return ((C4311g) obj).f14390l.f10147h.equals("$VALUES");
            case 7:
                return ((C4320p) obj).f14398m.size() == 1;
            case 8:
                return ((C4311g) obj).f14391m.m856h();
            case 9:
                return !((C4311g) obj).f14391m.m856h();
            case 10:
                return ((Integer) ((Map.Entry) obj).getValue()).intValue() > 1;
            case 11:
                return Objects.nonNull((AbstractC3506j) obj);
            case 12:
                return ((AbstractC3506j) obj).mo7345w();
            case 13:
                return !((String) obj).equals("java.lang.Exception");
            case 14:
                return !((String) obj).equals("java.lang.Throwable");
            case 15:
                return AbstractC5792m.m10493j(((C3514r) obj).f11420j, EnumC3400k.f10992v);
            case 16:
                return !(((InterfaceC4317m) obj) instanceof C4322r);
            case 17:
                return !((AbstractC2963b0) obj).f9217g.mo6235a(EnumC2824a.f9166s);
            case 18:
                return ((AbstractC2963b0) obj).f9752i != 0;
            case 19:
                return ((C4322r) obj).m8698W();
            case 20:
                return ((List) ((Map.Entry) obj).getValue()).size() == 1;
            case 21:
                return Files.isRegularFile((Path) obj, new LinkOption[0]);
            case 22:
                return BshClassPath.isClassFileName((String) obj);
            case 23:
                C0406b c0406b = (C0406b) obj;
                return !(c0406b.m1366b() == 0 && c0406b.f1106a.m1908a0().endsWith("/"));
            case 24:
                C0077h c0077h = (C0077h) obj;
                return c0077h.f245i.isEmpty() || c0077h.f244h.isEmpty();
            case 25:
                return ((C4305a) obj).f9217g.mo6235a(EnumC2824a.f9168u);
            case 26:
                return !((C4305a) obj).f14351l.isEmpty();
            case 27:
                return C0560m.m1574q((C4305a) obj);
            case 28:
                C4305a c4305a = (C4305a) obj;
                if (c4305a.f14351l.isEmpty() && c4305a.f14352m.isEmpty() && c4305a.f14353n.isEmpty()) {
                    if (!c4305a.f9217g.mo6235a(EnumC2824a.f9147g)) {
                        if (!c4305a.f9217g.mo6235a(EnumC2824a.f9149h)) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                C4320p c4320p2 = (C4320p) obj;
                return c4320p2.f9217g.mo6240f() && ((enumC3400k = c4320p2.f14396k) == EnumC3400k.f10987q || enumC3400k == EnumC3400k.f10965Q);
        }
    }
}
