package p020b5;

import ac.AbstractC0063p;
import ac.C0058k;
import android.os.Trace;
import androidx.lifecycle.C0119x;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p003a2.C0014a;
import p005a5.C0016a;
import p032c5.C0398a;
import p032c5.C0400c;
import p032c5.C0401d;
import p032c5.C0402e;
import p033c6.C0404b;
import p045d5.C0690a;
import p045d5.C0694e;
import p045d5.C0695f;
import p045d5.C0699j;
import p045d5.C0703n;
import p046d6.C0709f;
import p061e5.C0826a;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p074f5.EnumC1065a;
import p074f5.EnumC1067c;
import p074f5.EnumC1070f;
import p075f6.AbstractC1078e;
import p075f6.C1076c;
import p085fg.InterfaceC1220a;
import p093g5.AbstractC1352a;
import p117i0.C1848k0;
import p117i0.InterfaceC1810a2;
import p117i0.InterfaceC1835h;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p150k5.AbstractC2271v;
import p150k5.C2248c0;
import p150k5.C2254f0;
import p150k5.C2270u;
import p150k5.C2275z;
import p164l5.C2480b;
import p164l5.C2483c0;
import p164l5.C2487e0;
import p207o5.AbstractC3050e;
import p207o5.C3061p;
import p222p.AbstractC3199a;
import p266s0.C3876f;
import p281t3.AbstractC4106c;
import p283t5.InterfaceC4121d;
import p283t5.InterfaceC4123f;
import p296u5.InterfaceC4273a;
import p332wb.C5475xi;
import p338x0.C5574d;
import p342x5.AbstractC5690a;
import p342x5.C5691b;
import p342x5.C5693d;
import p342x5.C5694e;
import p342x5.C5695f;
import p342x5.C5696g;
import p361y5.C5996a;

/* JADX INFO: renamed from: b5.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190i {

    /* JADX INFO: renamed from: a */
    public ArrayList f475a;

    /* JADX INFO: renamed from: b */
    public Object f476b;

    /* JADX INFO: renamed from: c */
    public Object f477c;

    /* JADX INFO: renamed from: d */
    public final Object f478d;

    /* JADX INFO: renamed from: e */
    public Object f479e;

    /* JADX INFO: renamed from: f */
    public RandomAccess f480f;

    /* JADX INFO: renamed from: g */
    public Object f481g;

    /* JADX INFO: renamed from: h */
    public final Object f482h;

    /* JADX INFO: renamed from: i */
    public Object f483i;

    /* JADX INFO: renamed from: j */
    public Object f484j;

    /* JADX INFO: renamed from: k */
    public Object f485k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0190i(C0184c c0184c, C2275z c2275z, C0058k c0058k) {
        boolean z9;
        int iMo5877c;
        boolean z10;
        C0189h c0189h = new C0189h();
        c0189h.f474a = new HashMap();
        this.f482h = c0189h;
        this.f476b = c0184c;
        this.f477c = c2275z;
        this.f478d = c0058k;
        try {
            AbstractC1078e abstractC1078eM2712h = AbstractC1078e.m2712h(c0058k.m365p());
            this.f479e = abstractC1078eM2712h;
            this.f480f = AbstractC1078e.m2711g(c2275z.m5528j1());
            abstractC1078eM2712h.getClass();
            this.f475a = new ArrayList(abstractC1078eM2712h);
            this.f483i = new C0058k((byte) 0, 1);
            this.f484j = new C0058k((byte) 0, 1);
            C0119x c0119x = new C0119x(abstractC1078eM2712h);
            this.f485k = c0119x;
            int iM611u = c0119x.m611u(abstractC1078eM2712h.size() - 1) + ((InterfaceC4121d) abstractC1078eM2712h.get(abstractC1078eM2712h.size() - 1)).mo5877c();
            for (int i9 = 0; i9 < ((AbstractC1078e) this.f479e).size(); i9++) {
                InterfaceC4121d interfaceC4121d = (InterfaceC4121d) ((AbstractC1078e) this.f479e).get(i9);
                EnumC1070f enumC1070fMo5878i = interfaceC4121d.mo5878i();
                if (enumC1070fMo5878i == EnumC1070f.PACKED_SWITCH) {
                    int iM611u2 = ((C0119x) this.f485k).m611u(i9);
                    int iMo5882l = ((InterfaceC4123f) interfaceC4121d).mo5882l() + iM611u2;
                    try {
                        iMo5882l = m843e(iMo5882l, EnumC1070f.PACKED_SWITCH_PAYLOAD);
                        z10 = true;
                    } catch (C0188g unused) {
                        z10 = false;
                    }
                    if (z10) {
                        if (((C0058k) this.f483i).m360k(iMo5882l) != -1) {
                            InterfaceC4121d interfaceC4121dM844f = m844f(iMo5882l, EnumC1070f.PACKED_SWITCH_PAYLOAD);
                            this.f475a.set(i9, new C5996a(enumC1070fMo5878i, ((InterfaceC4273a) interfaceC4121d).mo5885h(), iM611u - iM611u2));
                            this.f475a.add(interfaceC4121dM844f);
                            iMo5877c = interfaceC4121dM844f.mo5877c() + iM611u;
                        } else {
                            iMo5877c = iM611u;
                            iM611u = iMo5882l;
                        }
                        ((C0058k) this.f483i).m353c(iM611u, iM611u2);
                        iM611u = iMo5877c;
                    }
                } else if (enumC1070fMo5878i == EnumC1070f.SPARSE_SWITCH) {
                    int iM611u3 = ((C0119x) this.f485k).m611u(i9);
                    int iMo5882l2 = ((InterfaceC4123f) interfaceC4121d).mo5882l() + iM611u3;
                    try {
                        iMo5882l2 = m843e(iMo5882l2, EnumC1070f.SPARSE_SWITCH_PAYLOAD);
                        z9 = true;
                    } catch (C0188g unused2) {
                        z9 = false;
                    }
                    if (z9) {
                        if (((C0058k) this.f484j).m360k(iMo5882l2) != -1) {
                            InterfaceC4121d interfaceC4121dM844f2 = m844f(iMo5882l2, EnumC1070f.SPARSE_SWITCH_PAYLOAD);
                            this.f475a.set(i9, new C5996a(enumC1070fMo5878i, ((InterfaceC4273a) interfaceC4121d).mo5885h(), iM611u - iM611u3));
                            this.f475a.add(interfaceC4121dM844f2);
                            iMo5877c = interfaceC4121dM844f2.mo5877c() + iM611u;
                        } else {
                            iMo5877c = iM611u;
                            iM611u = iMo5882l2;
                        }
                        ((C0058k) this.f484j).m353c(iM611u, iM611u3);
                        iM611u = iMo5877c;
                    }
                }
            }
        } catch (Exception e6) {
            try {
                C0014a c0014a = (C0014a) c0184c.f471c;
                StringWriter stringWriter = new StringWriter();
                try {
                    c0014a.m196j(stringWriter).mo2078i(c2275z);
                    throw C0709f.m1882a(e6, "Error while processing method %s", stringWriter.toString());
                } catch (IOException unused3) {
                    throw new AssertionError("Unexpected IOException");
                }
            } catch (Exception unused4) {
                throw C0709f.m1882a(e6, "Error while processing method", new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m835h(C1848k0 c1848k0, C2046b c2046b) {
        Object[] objArr = c2046b.f6891g;
        int i9 = c2046b.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            InterfaceC1810a2 interfaceC1810a2 = ((C1848k0) objArr[i10]).f6147a;
            if (interfaceC1810a2 instanceof C3876f) {
                C2046b c2046b2 = ((C3876f) interfaceC1810a2).f12726h;
                if (c2046b2.m5064j(c1848k0) || m835h(c1848k0, c2046b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m836j(C0826a c0826a, int i9, Set set) throws IOException {
        EnumC1065a[] enumC1065aArr = EnumC1065a.f3413n;
        int i10 = 0;
        for (EnumC1065a enumC1065a : enumC1065aArr) {
            if (enumC1065a.f3419j && (enumC1065a.f3416g & i9) != 0) {
                i10++;
            }
        }
        EnumC1065a[] enumC1065aArr2 = new EnumC1065a[i10];
        int i11 = 0;
        for (EnumC1065a enumC1065a2 : enumC1065aArr) {
            if (enumC1065a2.f3419j && (enumC1065a2.f3416g & i9) != 0) {
                enumC1065aArr2[i11] = enumC1065a2;
                i11++;
            }
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c0826a.write(enumC1065aArr2[i12].f3417h);
            c0826a.write(32);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c0826a.write(((EnumC1067c) it.next()).f3427h);
            c0826a.write(32);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m837k(C0826a c0826a, C2275z c2275z, C0184c c0184c) throws IOException {
        c0826a.write(".method ");
        int i9 = c2275z.f7572l;
        int i10 = c2275z.f7576p;
        m836j(c0826a, i9, i10 == 7 ? Collections.EMPTY_SET : EnumSet.copyOf((Collection) EnumC1067c.m2689a(i10)));
        c0826a.write(c2275z.getName());
        c0826a.write("(");
        AbstractC1078e abstractC1078eM2711g = AbstractC1078e.m2711g(c2275z.m5528j1());
        C1076c c1076cListIterator = abstractC1078eM2711g.listIterator(0);
        while (c1076cListIterator.hasNext()) {
            c0826a.m7221t(((C3061p) c1076cListIterator.next()).f9898l);
        }
        c0826a.write(")");
        c0826a.write(c2275z.mo4931h1());
        c0826a.write(10);
        c0826a.m2081w();
        m838l(c0184c, c0826a, c2275z, abstractC1078eM2711g);
        AbstractC0063p.m407Q(c0826a, AbstractC3050e.m6493a(c2275z.f7570j, c2275z.f7575o));
        c0826a.m2080u();
        c0826a.write(".end method\n");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m838l(C0184c c0184c, C0826a c0826a, C2275z c2275z, List list) throws IOException {
        int i9 = !EnumC1065a.STATIC.m2688a(c2275z.f7572l) ? 1 : 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3061p c3061p = (C3061p) it.next();
            String str = c3061p.f9898l;
            CharSequence charSequence = c3061p.f9897k;
            Set set = c3061p.f9896j;
            Object obj = c0184c.f469a;
            if (charSequence != null || set.size() != 0) {
                c0826a.write(".param p");
                c0826a.m2084z(i9);
                if (charSequence != null) {
                    c0826a.write(", ");
                    c0826a.m7218m(charSequence);
                }
                c0826a.write("    # ");
                c0826a.m7221t(str);
                c0826a.write("\n");
                if (set.size() > 0) {
                    c0826a.m2081w();
                    AbstractC0063p.m407Q(c0826a, set);
                    c0826a.m2080u();
                    c0826a.write(".end param\n");
                }
            }
            int i10 = i9 + 1;
            char cCharAt = str.charAt(0);
            i9 = (cCharAt == 'J' || cCharAt == 'D') ? i9 + 2 : i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m839a() {
        this.f476b = null;
        this.f477c = null;
        C2046b c2046b = (C2046b) this.f478d;
        c2046b.m5061g();
        ((C0945l0) this.f479e).m2329b();
        this.f480f = c2046b;
        ((C2046b) this.f481g).m5061g();
        ((C2046b) this.f482h).m5061g();
        this.f483i = null;
        this.f484j = null;
        this.f475a = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m840b() {
        Set set = (Set) this.f476b;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC1810a2 interfaceC1810a2 = (InterfaceC1810a2) it.next();
                it.remove();
                interfaceC1810a2.mo2480d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x0024 */
    /* JADX INFO: renamed from: c */
    public void m841c() {
        C2046b c2046b = (C2046b) this.f478d;
        C2046b c2046b2 = (C2046b) this.f481g;
        Set set = (Set) this.f476b;
        if (set == null) {
            return;
        }
        this.f485k = null;
        if (c2046b2.f6893i != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0945l0 c0945l0 = (C0945l0) this.f483i;
                int i9 = c2046b2.f6893i;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    Object obj = c2046b2.f6891g[i9];
                    try {
                        if (obj instanceof C1848k0) {
                            InterfaceC1810a2 interfaceC1810a2 = ((C1848k0) obj).f6147a;
                            set.remove(interfaceC1810a2);
                            interfaceC1810a2.mo2481f();
                        }
                        if (obj instanceof InterfaceC1835h) {
                            if (c0945l0 == null || !c0945l0.m2330c(obj)) {
                                ((InterfaceC1835h) obj).mo4497b();
                            } else {
                                ((InterfaceC1835h) obj).mo4496a();
                            }
                        }
                    } catch (Throwable th2) {
                        C5574d c5574d = (C5574d) this.f477c;
                        if (c5574d != null) {
                            AbstractC2043a.m5024b0(th2, new C5475xi(c5574d, 24, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (c2046b.f6893i != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f476b;
                if (set2 != null) {
                    Object[] objArr = c2046b.f6891g;
                    int i10 = c2046b.f6893i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        C1848k0 c1848k0 = (C1848k0) objArr[i11];
                        InterfaceC1810a2 interfaceC1810a22 = c1848k0.f6147a;
                        set2.remove(interfaceC1810a22);
                        try {
                            interfaceC1810a22.mo2482j();
                        } catch (Throwable th3) {
                            C5574d c5574d2 = (C5574d) this.f477c;
                            if (c5574d2 != null) {
                                AbstractC2043a.m5024b0(th3, new C5475xi(c5574d2, 24, c1848k0));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m842d() {
        C2046b c2046b = (C2046b) this.f482h;
        if (c2046b.f6893i != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c2046b.f6891g;
                int i9 = c2046b.f6893i;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((InterfaceC1220a) objArr[i10]).invoke();
                }
                c2046b.m5061g();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m843e(int i9, EnumC1070f enumC1070f) {
        int i10;
        C0119x c0119x = (C0119x) this.f485k;
        AbstractC1078e abstractC1078e = (AbstractC1078e) this.f479e;
        try {
            int iM613x = c0119x.m613x(i9, true);
            InterfaceC4121d interfaceC4121d = (InterfaceC4121d) abstractC1078e.get(iM613x);
            if (interfaceC4121d.mo5878i() == enumC1070f) {
                return i9;
            }
            if (interfaceC4121d.mo5878i() == EnumC1070f.NOP && (i10 = iM613x + 1) < abstractC1078e.size() && ((InterfaceC4121d) abstractC1078e.get(i10)).mo5878i() == enumC1070f) {
                return c0119x.m611u(i10);
            }
            throw new C0188g(i9);
        } catch (C0404b unused) {
            throw new C0188g(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public InterfaceC4121d m844f(int i9, EnumC1070f enumC1070f) {
        int i10;
        AbstractC1078e abstractC1078e = (AbstractC1078e) this.f479e;
        try {
            int iM613x = ((C0119x) this.f485k).m613x(i9, true);
            InterfaceC4121d interfaceC4121d = (InterfaceC4121d) abstractC1078e.get(iM613x);
            if (interfaceC4121d.mo5878i() == enumC1070f) {
                return interfaceC4121d;
            }
            if (interfaceC4121d.mo5878i() == EnumC1070f.NOP && (i10 = iM613x + 1) < abstractC1078e.size()) {
                InterfaceC4121d interfaceC4121d2 = (InterfaceC4121d) abstractC1078e.get(i10);
                if (interfaceC4121d2.mo5878i() == enumC1070f) {
                    return interfaceC4121d2;
                }
            }
            throw new C0188g(i9);
        } catch (C0404b unused) {
            throw new C0188g(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m845g(C1848k0 c1848k0) {
        C2046b c2046b = (C2046b) this.f478d;
        if (!((C0945l0) this.f479e).m2330c(c1848k0)) {
            C0945l0 c0945l0 = (C0945l0) this.f485k;
            if (c0945l0 == null || !c0945l0.m2330c(c1848k0)) {
                ((C2046b) this.f481g).m5056b(c1848k0);
                return;
            }
            return;
        }
        ((C0945l0) this.f479e).m2339l(c1848k0);
        if (!((C2046b) this.f480f).m5064j(c1848k0) && !c2046b.m5064j(c1848k0)) {
            m835h(c1848k0, c2046b);
        }
        Set set = (Set) this.f476b;
        if (set == null) {
            return;
        }
        set.add(c1848k0.f6147a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m846i(Set set, C5574d c5574d) {
        m839a();
        this.f476b = set;
        this.f477c = c5574d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:130:0x0303 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m847m(C0826a c0826a) throws IOException {
        List<C2254f0> c2248c0;
        AbstractC0191j c0400c;
        AbstractC0191j c0398a;
        C0184c c0184c;
        ArrayList arrayList;
        Object c0690a;
        String str;
        C0189h c0189h = (C0189h) this.f482h;
        C0058k c0058k = (C0058k) this.f478d;
        C0184c c0184c2 = (C0184c) this.f476b;
        EnumC1065a enumC1065a = EnumC1065a.STATIC;
        C2275z c2275z = (C2275z) this.f477c;
        int i9 = !enumC1065a.m2688a(c2275z.f7572l) ? 1 : 0;
        c0826a.write(".method ");
        int i10 = c2275z.f7572l;
        int i11 = c2275z.f7576p;
        m836j(c0826a, i10, i11 == 7 ? Collections.EMPTY_SET : EnumSet.copyOf((Collection) EnumC1067c.m2689a(i11)));
        c0826a.mo2079s(c2275z.getName());
        c0826a.write("(");
        AbstractC1078e abstractC1078e = (AbstractC1078e) this.f480f;
        C1076c c1076cListIterator = abstractC1078e.listIterator(0);
        while (c1076cListIterator.hasNext()) {
            String str2 = ((C3061p) c1076cListIterator.next()).f9898l;
            c0826a.m7221t(str2);
            int i12 = i9 + 1;
            char cCharAt = str2.charAt(0);
            i9 = (cCharAt == 'J' || cCharAt == 'D') ? i9 + 2 : i12;
        }
        c0826a.write(")");
        c0826a.m7221t(c2275z.mo4931h1());
        c0826a.write(10);
        c0826a.m2081w();
        Object obj = c0184c2.f469a;
        C0016a c0016a = (C0016a) c0184c2.f469a;
        c0826a.write(".registers ");
        c0826a.m2084z(c0058k.m369t());
        c0826a.write(10);
        m838l(c0184c2, c0826a, c2275z, abstractC1078e);
        if (((C0192k) this.f481g) == null) {
            this.f481g = new C0192k(c0016a, c0058k.m369t(), i9);
        }
        AbstractC0063p.m407Q(c0826a, AbstractC3050e.m6493a(c2275z.f7570j, c2275z.f7575o));
        c0826a.write(10);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f475a;
        int i13 = 0;
        int iMo5877c = 0;
        while (i13 < arrayList3.size()) {
            InterfaceC4121d interfaceC4121d = (InterfaceC4121d) arrayList3.get(i13);
            if (!(interfaceC4121d instanceof InterfaceC4123f)) {
                c0184c = c0184c2;
                arrayList = arrayList3;
                if (!(interfaceC4121d instanceof AbstractC1352a)) {
                    switch (AbstractC4106c.m8279b(interfaceC4121d.mo5878i().f3448m)) {
                        case 33:
                            c0690a = new C0690a(this, iMo5877c, (C2480b) interfaceC4121d, 0);
                            break;
                        case 34:
                            c0690a = new C0699j(this, iMo5877c, (C2483c0) interfaceC4121d);
                            break;
                        case 35:
                            c0690a = new C0703n(this, iMo5877c, (C2487e0) interfaceC4121d);
                            break;
                        default:
                            c0690a = new C0694e(this, iMo5877c, interfaceC4121d);
                            break;
                    }
                } else {
                    c0690a = new C0690a(this, iMo5877c, (AbstractC1352a) interfaceC4121d, 1);
                }
            } else {
                C0016a c0016a2 = (C0016a) c0184c2.f469a;
                InterfaceC4123f interfaceC4123f = (InterfaceC4123f) interfaceC4121d;
                C0695f c0695f = new C0695f(this, iMo5877c, interfaceC4123f);
                int iMo5882l = interfaceC4123f.mo5882l() + iMo5877c;
                EnumC1070f enumC1070fMo5878i = interfaceC4123f.mo5878i();
                c0184c = c0184c2;
                int iM8279b = AbstractC4106c.m8279b(enumC1070fMo5878i.f3448m);
                arrayList = arrayList3;
                if (iM8279b == 0 || iM8279b == 6) {
                    str = "goto_";
                    C0187f c0187f = new C0187f(c0016a2, iMo5882l, str);
                    c0695f.f2111j = c0187f;
                    c0695f.f2111j = c0189h.m833b(c0187f);
                    c0690a = c0695f;
                } else {
                    if (iM8279b == 11 || iM8279b == 16) {
                        str = "cond_";
                    } else if (iM8279b != 19) {
                        str = iM8279b != 22 ? null : enumC1070fMo5878i == EnumC1070f.FILL_ARRAY_DATA ? "array_" : enumC1070fMo5878i == EnumC1070f.PACKED_SWITCH ? "pswitch_data_" : "sswitch_data_";
                    }
                    C0187f c0187f2 = new C0187f(c0016a2, iMo5882l, str);
                    c0695f.f2111j = c0187f2;
                    c0695f.f2111j = c0189h.m833b(c0187f2);
                    c0690a = c0695f;
                }
            }
            arrayList2.add(c0690a);
            if (i13 != arrayList.size() - 1) {
                arrayList2.add(new C0182a(iMo5877c));
            }
            iMo5877c += interfaceC4121d.mo5877c();
            i13++;
            c0184c2 = c0184c;
            arrayList3 = arrayList;
        }
        AbstractC1078e abstractC1078e2 = (AbstractC1078e) this.f479e;
        C0119x c0119x = (C0119x) this.f485k;
        C2270u c2270u = (C2270u) c0058k.f177i;
        C0119x c0119x2 = c2270u.f7532b;
        int i14 = c0058k.f176h;
        int iM585P = c0119x2.m585P(i14 + 6);
        if (iM585P > 0) {
            int iM6834g = AbstractC3199a.m6834g(c2270u.f7532b.m583N(i14 + 12), 2, i14 + 16, 3) & (-4);
            c2248c0 = new C2248c0(c0058k, iM6834g, (iM585P * 8) + iM6834g, iM585P);
        } else {
            c2248c0 = Collections.EMPTY_LIST;
        }
        if (c2248c0.size() != 0) {
            int iMo5877c2 = ((InterfaceC4121d) abstractC1078e2.get(abstractC1078e2.size() - 1)).mo5877c() + c0119x.m611u(abstractC1078e2.size() - 1);
            for (C2254f0 c2254f0 : c2248c0) {
                int iM5502c = c2254f0.m5502c();
                int iM5500a = c2254f0.m5500a() + iM5502c;
                if (iM5502c >= iMo5877c2) {
                    throw new RuntimeException(String.format("Try start offset %d is past the end of the code block.", Integer.valueOf(iM5502c)));
                }
                if (iM5500a > iMo5877c2) {
                    throw new RuntimeException(String.format("Try end offset %d is past the end of the code block.", Integer.valueOf(iM5500a)));
                }
                int iM611u = c0119x.m611u(c0119x.m613x(iM5500a - 1, false));
                for (AbstractC2271v abstractC2271v : c2254f0.m5501b()) {
                    int iMo5498b = abstractC2271v.mo5498b();
                    if (iMo5498b >= iMo5877c2) {
                        throw new C0709f(null, "Exception handler offset %d is past the end of the code block.", Integer.valueOf(iMo5498b));
                    }
                    int i15 = iM5502c;
                    arrayList2.add(new C0183b(c0016a, (C0189h) this.f482h, iM611u, abstractC2271v.mo5497a(), i15, iM5500a, iMo5498b));
                    iM5502c = i15;
                }
            }
        }
        for (AbstractC5690a abstractC5690a : c0058k.m363n()) {
            C0192k c0192k = (C0192k) this.f481g;
            int i16 = abstractC5690a.f23149g;
            switch (abstractC5690a.mo10244a()) {
                case 3:
                    c0400c = new C0400c(i16, c0192k, (C5696g) abstractC5690a, 2);
                    break;
                case 4:
                default:
                    throw new C0709f(null, "Invalid debug item type: %d", Integer.valueOf(abstractC5690a.mo10244a()));
                case 5:
                    c0400c = new C0400c(i16, c0192k, (C5691b) abstractC5690a, 0);
                    break;
                case 6:
                    c0400c = new C0400c(i16, c0192k, (C5694e) abstractC5690a, 1);
                    break;
                case 7:
                    c0398a = new C0398a(i16, -4, 1);
                    continue;
                    arrayList2.add(c0398a);
                    break;
                case 8:
                    c0398a = new C0398a(i16, -4, 0);
                    continue;
                    arrayList2.add(c0398a);
                    break;
                case 9:
                    c0398a = new C0402e(i16, (C5695f) abstractC5690a);
                    continue;
                    arrayList2.add(c0398a);
                    break;
                case 10:
                    c0398a = new C0401d(i16, (C5693d) abstractC5690a);
                    continue;
                    arrayList2.add(c0398a);
                    break;
            }
            c0398a = c0400c;
            arrayList2.add(c0398a);
        }
        Iterator it = c0189h.f474a.values().iterator();
        while (it.hasNext()) {
            arrayList2.add((C0187f) it.next());
        }
        Collections.sort(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0191j) it2.next()).mo776c(c0826a)) {
                c0826a.write(10);
            }
        }
        c0826a.m2080u();
        c0826a.write(".end method\n");
    }

    public C0190i() {
        C2046b c2046b = new C2046b(new C1848k0[16]);
        this.f478d = c2046b;
        C0945l0 c0945l0 = AbstractC0959s0.f3019a;
        this.f479e = new C0945l0();
        this.f480f = c2046b;
        this.f481g = new C2046b(new Object[16]);
        this.f482h = new C2046b(new InterfaceC1220a[16]);
    }
}
