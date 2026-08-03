package p052dd;

import af.C0084g;
import be.AbstractC0269a;
import be.AbstractC0283h;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p025bc.EnumC0252b;
import p025bc.InterfaceC0254d;
import p081fc.C1202e;
import p302ud.C4309e;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;
import p351xe.C5787h;

/* JADX INFO: renamed from: dd.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0771b {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2844b f2322b = AbstractC2846d.m6274b(C0771b.class);

    /* JADX INFO: renamed from: c */
    public static final C1202e f2323c = new C1202e(HttpUrl.FRAGMENT_ENCODE_SET);

    /* JADX INFO: renamed from: a */
    public final ArrayList f2324a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0771b(ArrayList arrayList) {
        new EnumMap(EnumC0252b.class);
        this.f2324a = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1989a(C4309e c4309e) {
        C4309e c4309eM8656a0 = c4309e.m8656a0();
        if (c4309eM8656a0 != c4309e) {
            m1989a(c4309eM8656a0);
            return;
        }
        try {
            m1991c(c4309e, false);
        } catch (Exception | StackOverflowError e6) {
            throw new C0084g(AbstractC4855en.m9263g("Failed to process class: ", c4309e.f14373m.m6642f()), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC0254d m1990b(C4309e c4309e) {
        C4309e c4309eM8656a0 = c4309e.m8656a0();
        if (c4309eM8656a0 != c4309e) {
            return m1990b(c4309eM8656a0);
        }
        try {
            if (c4309e.f9217g.mo6235a(EnumC2824a.f9166s)) {
                m1991c(c4309e, false);
                return f2323c;
            }
            Iterator it = c4309e.f14386z.iterator();
            while (it.hasNext()) {
                m1991c((C4309e) it.next(), false);
            }
            if (!c4309e.f14366A.isEmpty()) {
                m1991c(c4309e, false);
                Iterator it2 = c4309e.f14366A.iterator();
                while (it2.hasNext()) {
                    m1991c((C4309e) it2.next(), false);
                }
            }
            InterfaceC0254d interfaceC0254dM1991c = m1991c(c4309e, true);
            if (interfaceC0254dM1991c != null) {
                return interfaceC0254dM1991c;
            }
            throw new C0084g("Codegen failed");
        } catch (Exception e6) {
            e = e6;
            throw new C0084g(AbstractC4855en.m9263g("Failed to generate code for class: ", c4309e.f14373m.m6642f()), e);
        } catch (StackOverflowError e7) {
            e = e7;
            throw new C0084g(AbstractC4855en.m9263g("Failed to generate code for class: ", c4309e.f14373m.m6642f()), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x0010, B:11:0x001a, B:18:0x002e, B:20:0x0038, B:21:0x0040, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:28:0x005a, B:30:0x005e, B:31:0x0061, B:33:0x0066, B:34:0x006f, B:36:0x0075, B:37:0x007f, B:39:0x0083, B:41:0x0094, B:42:0x0099, B:44:0x009b, B:47:0x009f, B:48:0x00bb, B:50:0x00bd), top: B:53:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x0010, B:11:0x001a, B:18:0x002e, B:20:0x0038, B:21:0x0040, B:23:0x0046, B:25:0x004a, B:27:0x0054, B:28:0x005a, B:30:0x005e, B:31:0x0061, B:33:0x0066, B:34:0x006f, B:36:0x0075, B:37:0x007f, B:39:0x0083, B:41:0x0094, B:42:0x0099, B:44:0x009b, B:47:0x009f, B:48:0x00bb, B:50:0x00bd), top: B:53:0x0010 }] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0254d m1991c(C4309e c4309e, boolean z9) {
        if (z9 || c4309e.f14385y != 4) {
            AbstractC5798s.m10507a();
            synchronized (c4309e.f14373m) {
                try {
                    try {
                        EnumC2824a enumC2824a = EnumC2824a.f9150h0;
                        if (c4309e.f9217g.mo6235a(enumC2824a)) {
                            c4309e.m6227D(enumC2824a);
                            c4309e.m8652W();
                            c4309e.m6231w(EnumC2824a.f9152i0);
                        }
                        EnumC2824a enumC2824a2 = EnumC2824a.f9152i0;
                        if (c4309e.f9217g.mo6235a(enumC2824a2)) {
                            c4309e.f14371k.m8719j(c4309e);
                            c4309e.m6227D(enumC2824a2);
                        }
                        if (c4309e.f14385y == 5) {
                            c4309e.f14385y = 1;
                        }
                        if (z9) {
                            EnumC2824a enumC2824a3 = EnumC2824a.f9148g0;
                            if (c4309e.f9217g.mo6235a(enumC2824a3)) {
                                c4309e.m6227D(enumC2824a3);
                                c4309e.m8670o0();
                            }
                        }
                        if (c4309e.f14385y == 1) {
                            c4309e.m8660e0();
                        }
                        if (c4309e.f14385y == 2) {
                            c4309e.f14385y = 3;
                            Iterator it = this.f2324a.iterator();
                            while (it.hasNext()) {
                                AbstractC0283h.m1162h0((AbstractC0269a) it.next(), c4309e);
                            }
                            c4309e.f14385y = 4;
                        }
                        if (!z9) {
                            return null;
                        }
                        AbstractC5798s.m10507a();
                        InterfaceC0254d interfaceC0254dM258v = AbstractC0018a.m258v(c4309e);
                        if (!c4309e.f9217g.mo6235a(EnumC2824a.f9154j0)) {
                            c4309e.m8670o0();
                            c4309e.f14385y = 5;
                        }
                        return interfaceC0254dM258v;
                    } finally {
                    }
                } catch (Exception e6) {
                    e = e6;
                    if (!z9) {
                        throw e;
                    }
                    C5787h.m10468a(c4309e, "Class process error: " + e.getClass().getSimpleName(), e);
                    return null;
                } catch (StackOverflowError e7) {
                    e = e7;
                    if (!z9) {
                    }
                }
            }
        }
        return null;
    }
}
