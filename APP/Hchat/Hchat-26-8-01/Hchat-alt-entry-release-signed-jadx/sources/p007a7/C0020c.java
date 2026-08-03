package p007a7;

import android.R;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p022b7.C0202a;
import p034c7.AbstractC0409e;
import p034c7.C0405a;
import p034c7.C0408d;
import p034c7.C0410f;
import p135j7.C2086b;
import p136j8.C2104o;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2335e;
import p166l7.C2516d;
import p166l7.C2518f;
import p166l7.C2524l;
import p182m7.C2788a;
import p182m7.C2790c;
import p182m7.C2793f;
import p182m7.C2794g;
import p182m7.C2797j;
import p229p7.C3339i;
import p241q7.C3445b;
import p285t7.C4134a;
import p298u7.C4279b;
import p314v7.EnumC4505k0;
import p379z7.C6107c;
import p379z7.C6110f;

/* JADX INFO: renamed from: a7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0020c implements Closeable {

    /* JADX INFO: renamed from: g */
    public final String f60g;

    /* JADX INFO: renamed from: h */
    public final C0410f f61h;

    /* JADX INFO: renamed from: i */
    public boolean f62i = true;

    /* JADX INFO: renamed from: j */
    public boolean f63j = false;

    /* JADX INFO: renamed from: k */
    public C2524l f64k;

    /* JADX INFO: renamed from: l */
    public AbstractC0409e f65l;

    /* JADX INFO: renamed from: m */
    public C2788a f66m;

    /* JADX INFO: renamed from: n */
    public AbstractC0409e f67n;

    /* JADX INFO: renamed from: o */
    public int f68o;

    /* JADX INFO: renamed from: p */
    public C0405a f69p;

    /* JADX INFO: renamed from: q */
    public final C6107c f70q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0020c(String str, C0410f c0410f) {
        this.f60g = str;
        this.f61h = c0410f;
        HashSet hashSet = new HashSet();
        new HashSet();
        for (AbstractC0409e abstractC0409e : c0410f.m1371c()) {
            if (abstractC0409e.f1110c != 8) {
                String strM1368a = abstractC0409e.m1368a();
                String str2 = null;
                if (strM1368a.length() != 0) {
                    String strTrim = strM1368a.replace(File.separatorChar, '/').trim();
                    while (strTrim.startsWith("/")) {
                        strTrim = strTrim.substring(1);
                    }
                    if (strTrim.length() != 0) {
                        str2 = strTrim;
                    }
                }
                if (str2 != null) {
                    hashSet.add(str2);
                }
            }
        }
        this.f70q = new C6107c(0);
        new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m265l(C2524l c2524l) {
        if (!(c2524l instanceof C4134a)) {
            return false;
        }
        C4134a c4134a = (C4134a) c2524l;
        if (!"android".equals(c4134a.m8317b0())) {
            return false;
        }
        int i9 = c4134a.f13625v;
        if (i9 == 0) {
            C2518f c2518fM5930Z = c4134a.m5930Z();
            if (c2518fM5930Z != null) {
                c4134a.f13625v = c2518fM5930Z.mo5913U();
            }
            i9 = c4134a.f13625v;
        }
        return i9 == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m266a() {
        C2788a c2788a;
        C2524l c2524l;
        C2524l c2524l2 = this.f64k;
        if (c2524l2 == null || (c2788a = this.f66m) == null) {
            return;
        }
        C2518f c2518fMo5921i = c2788a.mo5921i();
        if (c2518fMo5921i == null || c2518fMo5921i.mo5915Y() != c2524l2) {
            C2518f c2518fM5142k0 = C2086b.m5142k0(c2524l2.f8155p.f9926k, c2788a.m6162Y());
            if (c2518fM5142k0 == null) {
                c2518fM5142k0 = c2524l2.m5930Z();
            }
            if (c2518fM5142k0 != null) {
                ((C2794g) c2788a.f9062k).f9049r = c2518fM5142k0;
            }
            c2788a.f9044m = this;
            if (this.f63j || (c2524l = this.f64k) == null || (c2524l instanceof C4134a) || m265l(c2524l) || this.f66m == null || c2524l.f8156q.f24644i != 0) {
                return;
            }
            try {
                m273k(c2524l, null);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Integer m267b() {
        C2797j c2797jM6191O;
        C2790c c2790cM6199X;
        C2790c c2790cM6198W;
        Integer numValueOf = null;
        if (this.f66m == null && this.f61h.m1370b("AndroidManifest.xml") == null) {
            return null;
        }
        C2788a c2788aM268c = m268c();
        Integer numM6159V = c2788aM268c.m6159V(R.attr.compileSdkVersion);
        EnumC4505k0 enumC4505k0 = EnumC4505k0.f14867n;
        if (numM6159V == null) {
            C2797j c2797jM6191O2 = c2788aM268c.m6191O("manifest");
            numM6159V = (c2797jM6191O2 == null || (c2790cM6198W = c2797jM6191O2.m6198W("platformBuildVersionCode")) == null || c2790cM6198W.m8936T() != enumC4505k0) ? null : Integer.valueOf(c2790cM6198W.mo8928O());
        }
        C2797j c2797jM6191O3 = c2788aM268c.m6191O("manifest");
        if (c2797jM6191O3 != null && (c2797jM6191O = c2797jM6191O3.m6191O("uses-sdk")) != null && (c2790cM6199X = c2797jM6191O.m6199X(R.attr.targetSdkVersion)) != null && c2790cM6199X.m8936T() == enumC4505k0) {
            numValueOf = Integer.valueOf(c2790cM6199X.mo8928O());
        }
        return (numM6159V != null && (numValueOf == null || numValueOf.intValue() <= numM6159V.intValue())) ? numM6159V : numValueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2788a m268c() {
        C2788a c2788a = this.f66m;
        if (c2788a != null) {
            return c2788a;
        }
        C0410f c0410f = this.f61h;
        AbstractC0409e abstractC0409eM1370b = c0410f.m1370b("AndroidManifest.xml");
        if (abstractC0409eM1370b == null) {
            return null;
        }
        if (this.f67n == null && !(abstractC0409eM1370b instanceof C0408d)) {
            this.f67n = abstractC0409eM1370b;
        }
        try {
            InputStream inputStreamMo1367b = abstractC0409eM1370b.mo1367b();
            C2788a c2788a2 = new C2788a();
            ((C3339i) ((C2794g) c2788a2.f9062k).f9046o.f8138m).m7055T(false);
            c2788a2.m5545G(new C3445b(inputStreamMo1367b));
            inputStreamMo1367b.close();
            this.f66m = c2788a2;
            C0408d c0408d = new C0408d(abstractC0409eM1370b.f1108a, c2788a2);
            if (abstractC0409eM1370b != c0408d) {
                c0408d.f1111d = abstractC0409eM1370b.f1111d;
                c0408d.f1110c = abstractC0409eM1370b.f1110c;
                c0408d.f1109b = abstractC0409eM1370b.m1368a();
            }
            c0410f.m1369a(c0408d);
            m266a();
            m276q(c2788a2);
            return this.f66m;
        } catch (IOException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0405a c0405a = this.f69p;
        if (c0405a != null) {
            c0405a.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public C2524l mo269e() {
        return this.f64k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C2524l mo270g() {
        C2788a c2788aM268c;
        C2524l c2524l = this.f64k;
        if (c2524l != null) {
            return c2524l;
        }
        if (!this.f63j && this.f70q.f24644i != 0) {
            this.f63j = true;
        }
        if (!this.f63j && (c2788aM268c = m268c()) != null && c2788aM268c.m6163Z() != null && "android".equals(c2788aM268c.m6161X()) && c2788aM268c.m6162Y() == 1) {
            this.f63j = true;
        }
        return m271h(!this.f63j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C2524l m271h(boolean z9) {
        C2524l c2524l = this.f64k;
        if (c2524l != null) {
            return c2524l;
        }
        if (!m272i()) {
            return null;
        }
        try {
            C2524l c2524lMo275o = mo275o();
            this.f64k = c2524lMo275o;
            if (z9 && this.f62i) {
                m273k(c2524lMo275o, m267b());
            }
            C2524l c2524l2 = this.f64k;
            if (c2524l2 != null) {
                for (C2524l c2524l3 : this.f70q) {
                    if (c2524l3 != null && !c2524l2.m5925U(c2524l3)) {
                        c2524l2.f8156q.add(c2524l3);
                    }
                }
            }
            m266a();
            return c2524lMo275o;
        } catch (IOException e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m272i() {
        return (this.f64k == null && this.f61h.m1370b("resources.arsc") == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m273k(C2524l c2524l, Integer num) {
        C0021d c0021d;
        C0202a c0202a;
        Integer numValueOf;
        C0021d c0021dM864a;
        C0202a c0202a2;
        if (this.f63j || c2524l == null || m265l(c2524l)) {
            return;
        }
        int i9 = 0;
        C6107c<C2524l> c6107c = new C6107c(0);
        if (m272i()) {
            c6107c.addAll(m271h(false).f8156q);
        }
        for (C2524l c2524l2 : c6107c) {
            if (c2524l2 instanceof C4134a) {
                C4134a c4134a = (C4134a) c2524l2;
                if (m265l(c4134a) && (num == null || num.equals(Integer.valueOf(c4134a.m8318c0())))) {
                    c0021d = (C0021d) c4134a.f8157r;
                    break;
                }
            }
        }
        c0021d = null;
        if (c0021d != null) {
            return;
        }
        if (num == null) {
            synchronized (AbstractC0018a.class) {
                try {
                    c0202a2 = AbstractC0018a.f58a;
                    if (c0202a2 == null) {
                        c0202a2 = C0202a.f501c;
                        AbstractC0018a.f58a = c0202a2;
                    }
                } finally {
                }
            }
            synchronized (AbstractC0018a.class) {
                Iterator it = ((HashMap) c0202a2.m865b()).keySet().iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (i9 == 0 || iIntValue > i9) {
                        i9 = iIntValue;
                    }
                }
                c0021dM864a = c0202a2.m864a();
                if (c0021dM864a == null || i9 != c0021dM864a.m279u()) {
                    try {
                        C0021d c0021dM866c = c0202a2.m866c(i9);
                        if (c0021dM864a == null) {
                            synchronized (c0202a2) {
                                c0202a2.f502a = c0021dM866c;
                            }
                        }
                        c0021dM864a = c0021dM866c;
                    } catch (IOException e6) {
                        throw new RuntimeException(e6);
                    }
                }
            }
        } else {
            int iIntValue2 = num.intValue();
            synchronized (AbstractC0018a.class) {
                try {
                    c0202a = AbstractC0018a.f58a;
                    if (c0202a == null) {
                        c0202a = C0202a.f501c;
                        AbstractC0018a.f58a = c0202a;
                    }
                } finally {
                }
            }
            HashMap map = (HashMap) c0202a.m865b();
            if (map.containsKey(Integer.valueOf(iIntValue2))) {
                numValueOf = Integer.valueOf(iIntValue2);
            } else {
                Iterator it2 = map.keySet().iterator();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (it2.hasNext()) {
                    int iIntValue3 = ((Integer) it2.next()).intValue();
                    if (i11 == 0) {
                        i12 = (iIntValue2 * 2) + 1000;
                        i10 = iIntValue3;
                        i11 = i10;
                    } else {
                        if (iIntValue3 > i11) {
                            i11 = iIntValue3;
                        }
                        int i13 = iIntValue3 - iIntValue2;
                        if (i13 < 0) {
                            i13 = -i13;
                        }
                        if (i13 < i12 || (i13 == i12 && iIntValue3 > i10)) {
                            i10 = iIntValue3;
                            i12 = i13;
                        }
                    }
                }
                numValueOf = Integer.valueOf(i10);
            }
            synchronized (AbstractC0018a.class) {
                int iIntValue4 = numValueOf.intValue();
                c0021dM864a = c0202a.m864a();
                if (c0021dM864a == null || iIntValue4 != c0021dM864a.m279u()) {
                    try {
                        c0021dM864a = c0202a.m866c(iIntValue4);
                    } catch (IOException e7) {
                        throw new RuntimeException(e7);
                    }
                }
            }
        }
        C4134a c4134aM278t = c0021dM864a.m278t();
        if (c4134aM278t != null && !c2524l.m5925U(c4134aM278t)) {
            c2524l.f8156q.add(c4134aM278t);
        }
        c0021dM864a.m277s();
        if (c0021dM864a.f73t == null) {
            c0021dM864a.m280w();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2793f m274m(String str) throws FileNotFoundException {
        C2793f c2793f;
        AbstractC0409e abstractC0409eM1370b = this.f61h.m1370b(str);
        if (abstractC0409eM1370b == null) {
            throw new FileNotFoundException("No such file in apk: ".concat(str));
        }
        C2518f c2518fM5930Z = null;
        if (abstractC0409eM1370b instanceof C0408d) {
            AbstractC2331a abstractC2331a = ((C0408d) abstractC0409eM1370b).f1107e;
            if (abstractC2331a instanceof InterfaceC2335e) {
                ((InterfaceC2335e) abstractC2331a).mo5562c();
            }
            c2793f = abstractC2331a instanceof C2793f ? (C2793f) abstractC2331a : null;
        }
        if (c2793f == null) {
            c2793f = new C2793f();
            c2793f.m5545G(new C3445b(abstractC0409eM1370b.mo1367b()));
        }
        c2793f.f9044m = this;
        if (c2793f.mo5921i() == null) {
            String strM1368a = abstractC0409eM1370b.m1368a();
            C2524l c2524lMo270g = mo270g();
            if (c2524lMo270g != null) {
                C2086b c2086b = c2524lMo270g.f8155p;
                if (c2086b.f9926k.size() == 1) {
                    c2518fM5930Z = (C2518f) c2086b.m6524Q(0);
                } else {
                    C4279b c4279b = c2524lMo270g.f8154o;
                    c4279b.m8599U();
                    C2516d c2516d = new C2516d(c4279b.f14198r.m2580o(strM1368a), 3);
                    c2518fM5930Z = (C2518f) (c2516d.hasNext() ? c2516d.next() : null);
                    if (c2518fM5930Z == null) {
                        c2518fM5930Z = c2524lMo270g.m5930Z();
                    }
                }
            }
            ((C2794g) c2793f.f9062k).f9049r = c2518fM5930Z;
        }
        return c2793f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public C2524l mo275o() throws IOException {
        C2524l c2524l;
        C0410f c0410f = this.f61h;
        AbstractC0409e abstractC0409eM1370b = c0410f.m1370b("resources.arsc");
        if (abstractC0409eM1370b == null) {
            C2104o.m5299y("Entry not found: resources.arsc");
            return null;
        }
        boolean z9 = abstractC0409eM1370b instanceof C0408d;
        if (z9) {
            Object obj = ((C0408d) abstractC0409eM1370b).f1107e;
            if (obj instanceof InterfaceC2335e) {
                ((InterfaceC2335e) obj).mo5562c();
            }
            c2524l = (C2524l) obj;
        } else {
            if (this.f65l == null && !z9) {
                this.f65l = abstractC0409eM1370b;
            }
            InputStream inputStreamMo1367b = abstractC0409eM1370b.mo1367b();
            C2524l c2524l2 = new C2524l();
            c2524l2.m5545G(new C3445b(inputStreamMo1367b));
            inputStreamMo1367b.close();
            c2524l = c2524l2;
        }
        C0408d c0408d = new C0408d(abstractC0409eM1370b.f1108a, c2524l);
        if (abstractC0409eM1370b != c0408d) {
            c0408d.f1111d = abstractC0409eM1370b.f1111d;
            c0408d.f1110c = abstractC0409eM1370b.f1110c;
            c0408d.f1109b = abstractC0409eM1370b.m1368a();
        }
        c0410f.m1369a(c0408d);
        c2524l.f8157r = this;
        return c2524l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m276q(C2788a c2788a) {
        C2797j c2797j;
        int i9;
        if (this.f68o != 0) {
            return;
        }
        C2797j c2797jM6191O = c2788a.m6191O("manifest");
        if (c2797jM6191O == null || c2797jM6191O.m6198W("split") == null) {
            Boolean boolM6163Z = c2788a.m6163Z();
            if (boolM6163Z == null || !boolM6163Z.booleanValue()) {
                Iterator itM6192P = c2788a.m6192P("manifest", "application", "activity");
                Iterator itM6192P2 = c2788a.m6192P("manifest", "application", "activity-alias");
                if (!itM6192P.hasNext()) {
                    itM6192P = itM6192P2;
                } else if (itM6192P2.hasNext()) {
                    itM6192P = new C6110f(itM6192P, itM6192P2);
                }
                loop0: while (true) {
                    if (!itM6192P.hasNext()) {
                        c2797j = null;
                        break;
                    }
                    c2797j = (C2797j) itM6192P.next();
                    Iterator itM6192P3 = c2797j.m6192P("intent-filter", "action");
                    while (itM6192P3.hasNext()) {
                        C2790c c2790cM6199X = ((C2797j) itM6192P3.next()).m6199X(R.attr.name);
                        if (c2790cM6199X != null && "android.intent.action.MAIN".equals(c2790cM6199X.m8935S())) {
                            break loop0;
                        }
                    }
                }
                i9 = c2797j != null ? 1 : 0;
            } else {
                i9 = 3;
            }
        } else {
            i9 = 2;
        }
        if (i9 != 0) {
            this.f68o = i9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return this.f60g;
    }
}
