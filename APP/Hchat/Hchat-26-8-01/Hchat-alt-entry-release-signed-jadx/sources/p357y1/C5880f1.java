package p357y1;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.InterfaceC0112q;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p016b1.C0166f;
import p036c9.C0416a1;
import p041d1.C0655c0;
import p042d2.C0683c;
import p042d2.C0684d;
import p071f1.C1033v;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.R;
import p114hg.InterfaceC1711a;
import p114hg.InterfaceC1715e;
import p117i0.AbstractC1852l0;
import p117i0.AbstractC1863o;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p117i0.C1883u;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p159l0.C2426h;
import p159l0.C2429k;
import p174m.C2571a;
import p177m2.InterfaceC2759c;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p205o3.AbstractC3043a;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p294u3.InterfaceC4250c;
import p304uf.C4330d;
import p307v0.AbstractC4368h;
import p307v0.C4367g;
import p310v3.AbstractC4445a;
import p332wb.AbstractC4855en;
import p338x0.AbstractC5577g;
import p339x1.C5610h0;
import pa.C3377c;

/* JADX INFO: renamed from: y1.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5880f1 {

    /* JADX INFO: renamed from: a */
    public final View f23857a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1863o f23858b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0112q f23859c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4250c f23860d;

    /* JADX INFO: renamed from: e */
    public final C0416a1 f23861e;

    /* JADX INFO: renamed from: f */
    public final C0683c f23862f;

    /* JADX INFO: renamed from: g */
    public final C0684d f23863g;

    /* JADX INFO: renamed from: h */
    public final Configuration f23864h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC1809a1 f23865i;

    /* JADX INFO: renamed from: j */
    public final C5882g f23866j;

    /* JADX INFO: renamed from: k */
    public final C5919p0 f23867k;

    /* JADX INFO: renamed from: l */
    public final C5890i f23868l;

    /* JADX INFO: renamed from: m */
    public final C5886h f23869m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2759c f23870n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC1809a1 f23871o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2862a f23872p;

    /* JADX INFO: renamed from: q */
    public final C5923q0 f23873q;

    /* JADX INFO: renamed from: r */
    public final C5610h0 f23874r;

    /* JADX INFO: renamed from: s */
    public final C5944v1 f23875s;

    /* JADX INFO: renamed from: t */
    public final C1033v f23876t;

    /* JADX INFO: renamed from: u */
    public int f23877u;

    /* JADX INFO: renamed from: v */
    public final C0655c0 f23878v;

    /* JADX INFO: renamed from: w */
    public final ComponentCallbacks2C5876e1 f23879w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5880f1(C5880f1 c5880f1, View view, AbstractC1863o abstractC1863o, InterfaceC0112q interfaceC0112q, InterfaceC4250c interfaceC4250c, C0416a1 c0416a1) {
        C0683c c0683c;
        Configuration configuration;
        InterfaceC1809a1 interfaceC1809a1M4639u;
        C5882g c5882g;
        C5919p0 c5919p0;
        C5890i c5890i;
        C5886h c5886h;
        InterfaceC2759c c5928r1;
        InterfaceC1809a1 c1845j1;
        C5923q0 c5923q0;
        C1033v c1033v;
        C5610h0 c5610h0;
        C0684d c0684d;
        View view2;
        boolean zM3825a = AbstractC1416l.m3825a((c5880f1 == null || (view2 = c5880f1.f23857a) == null) ? null : view2.getContext(), view.getContext());
        this.f23857a = view;
        this.f23858b = abstractC1863o;
        this.f23859c = interfaceC0112q;
        this.f23860d = interfaceC4250c;
        this.f23861e = c0416a1;
        if (zM3825a) {
            c5880f1.getClass();
            c0683c = c5880f1.f23862f;
        } else {
            c0683c = new C0683c();
        }
        this.f23862f = c0683c;
        this.f23863g = (c5880f1 == null || (c0684d = c5880f1.f23863g) == null) ? new C0684d() : c0684d;
        if (zM3825a) {
            c5880f1.getClass();
            configuration = c5880f1.f23864h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f23864h = configuration;
        if (zM3825a) {
            c5880f1.getClass();
            interfaceC1809a1M4639u = c5880f1.f23865i;
        } else {
            interfaceC1809a1M4639u = AbstractC1874r.m4639u(new Configuration(configuration));
        }
        this.f23865i = interfaceC1809a1M4639u;
        if (zM3825a) {
            c5880f1.getClass();
            c5882g = c5880f1.f23866j;
        } else {
            Context context = view.getContext();
            c5882g = new C5882g();
            Object systemService = context.getSystemService("accessibility");
            systemService.getClass();
        }
        this.f23866j = c5882g;
        if (zM3825a) {
            c5880f1.getClass();
            c5919p0 = c5880f1.f23867k;
        } else {
            c5919p0 = new C5919p0(view.getContext());
        }
        this.f23867k = c5919p0;
        if (zM3825a) {
            c5880f1.getClass();
            c5890i = c5880f1.f23868l;
        } else {
            c5890i = new C5890i(view.getContext());
        }
        this.f23868l = c5890i;
        if (zM3825a) {
            c5880f1.getClass();
            c5886h = c5880f1.f23869m;
        } else {
            c5886h = new C5886h(c5890i);
        }
        this.f23869m = c5886h;
        if (zM3825a) {
            c5880f1.getClass();
            c5928r1 = c5880f1.f23870n;
        } else {
            view.getContext();
            c5928r1 = new C5928r1();
        }
        this.f23870n = c5928r1;
        if (zM3825a) {
            c5880f1.getClass();
            c1845j1 = c5880f1.f23871o;
        } else {
            c1845j1 = new C1845j1(AbstractC2043a.m5037k(view.getContext()), C1823e.f6050k);
        }
        this.f23871o = c1845j1;
        this.f23872p = view == (c5880f1 != null ? c5880f1.f23857a : null) ? c5880f1.f23872p : new C2864c(view);
        if (zM3825a) {
            c5880f1.getClass();
            c5923q0 = c5880f1.f23873q;
        } else {
            c5923q0 = new C5923q0(ViewConfiguration.get(view.getContext()));
        }
        this.f23873q = c5923q0;
        this.f23874r = (c5880f1 == null || (c5610h0 = c5880f1.f23874r) == null) ? new C5610h0() : c5610h0;
        this.f23875s = new C5944v1();
        this.f23876t = (c5880f1 == null || (c1033v = c5880f1.f23876t) == null) ? new C1033v() : c1033v;
        this.f23878v = new C0655c0(this, 20);
        this.f23879w = new ComponentCallbacks2C5876e1(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10581a(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, InterfaceC1235p interfaceC1235p, C1836h0 c1836h0, int i9) {
        LinkedHashMap linkedHashMap;
        c1836h0.m4527b0(123858079);
        int i10 = (c1836h0.m4538h(viewTreeObserverOnGlobalLayoutListenerC5934t) ? 4 : 2) | i9 | (c1836h0.m4538h(interfaceC1235p) ? 32 : 16) | (c1836h0.m4538h(this) ? Opcodes.ACC_NATIVE : 128);
        boolean z9 = false;
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC5934t.getTag(R.id.inspection_slot_table_set);
            C5904l1 c5904l1 = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC1711a) && !(tag instanceof InterfaceC1715e))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC5934t.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1711a) && !(tag2 instanceof InterfaceC1715e))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c1836h0.m4562y());
                c1836h0.f6113q = true;
                c1836h0.f6078C = true;
                c1836h0.f6099c.m5782c();
                c1836h0.f6083H.m5782c();
                C2429k c2429k = c1836h0.f6084I;
                C2426h c2426h = c2429k.f7963a;
                c2429k.f7967e = c2426h.f7958p;
                c2429k.f7968f = c2426h.f7959q;
            }
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                InterfaceC4250c interfaceC4250c = this.f23860d;
                Object parent2 = viewTreeObserverOnGlobalLayoutListenerC5934t.getParent();
                parent2.getClass();
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strM9263g = AbstractC4855en.m9263g("SaveableStateRegistry:", strValueOf);
                C2571a c2571aMo1402b = interfaceC4250c.mo1402b();
                Bundle bundleM6031l = c2571aMo1402b.m6031l(strM9263g);
                if (bundleM6031l != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM6031l.keySet()) {
                        ArrayList parcelableArrayList = bundleM6031l.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                C5914o c5914o = C5914o.f24001k;
                C1858m2 c1858m2 = AbstractC4368h.f14575a;
                C4367g c4367g = new C4367g(linkedHashMap, c5914o);
                C3377c c3377c = (C3377c) c2571aMo1402b.f8339h;
                synchronized (((C4330d) c3377c.f10909e)) {
                    Iterator it = ((LinkedHashMap) c3377c.f10910f).entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        String str2 = (String) entry.getKey();
                        C5904l1 c5904l12 = (C5904l1) entry.getValue();
                        if (!AbstractC1416l.m3825a(str2, strM9263g)) {
                            c5904l12 = null;
                        }
                        if (c5904l12 != null) {
                            c5904l1 = c5904l12;
                            break;
                        }
                    }
                }
                if (c5904l1 == null) {
                    try {
                        C5904l1 c5904l13 = new C5904l1(c4367g);
                        C3377c c3377c2 = (C3377c) c2571aMo1402b.f8339h;
                        synchronized (((C4330d) c3377c2.f10909e)) {
                            if (((LinkedHashMap) c3377c2.f10910f).containsKey(strM9263g)) {
                                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                            }
                            ((LinkedHashMap) c3377c2.f10910f).put(strM9263g, c5904l13);
                        }
                        z9 = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                objM4514P = new C5900k1(c4367g, new C5908m1(z9, c2571aMo1402b, strM9263g));
                c1836h0.m4545k0(objM4514P);
            }
            C5900k1 c5900k1 = (C5900k1) objM4514P;
            C3967n c3967n = C3967n.f12976a;
            boolean zM4538h = c1836h0.m4538h(c5900k1);
            Object objM4514P2 = c1836h0.m4514P();
            if (zM4538h || objM4514P2 == C1851l.f6155a) {
                objM4514P2 = new C0166f(c5900k1, 24);
                c1836h0.m4545k0(objM4514P2);
            }
            AbstractC1874r.m4621c(c3967n, (InterfaceC1231l) objM4514P2, c1836h0);
            C1883u c1883u = AbstractC5888h1.f23941w;
            boolean zBooleanValue = ((Boolean) c1836h0.m4542j(c1883u)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC5934t.getScrollCaptureInProgress$ui();
            boolean zM4534f = c1836h0.m4534f(viewTreeObserverOnGlobalLayoutListenerC5934t.getView());
            Object objM4514P3 = c1836h0.m4514P();
            if (zM4534f || objM4514P3 == C1851l.f6155a) {
                viewTreeObserverOnGlobalLayoutListenerC5934t.getView();
                objM4514P3 = new C5913n2();
                c1836h0.m4545k0(objM4514P3);
            }
            AbstractC1874r.m4620b(new C1873q1[]{AbstractC3043a.f9864a.mo4582a(this.f23859c), AbstractC4445a.f14756a.mo4582a(this.f23860d), AbstractC5891i0.f23948d.mo4582a(this.f23862f), AbstractC5891i0.f23949e.mo4582a(this.f23863g), AbstractC5891i0.f23946b.mo4582a(viewTreeObserverOnGlobalLayoutListenerC5934t.getContext()), AbstractC5577g.f22704a.mo4582a(set), AbstractC5891i0.f23945a.mo4582a(viewTreeObserverOnGlobalLayoutListenerC5934t.getConfiguration()), AbstractC4368h.f14575a.mo4582a(c5900k1), AbstractC5891i0.f23950f.mo4582a(viewTreeObserverOnGlobalLayoutListenerC5934t.getView()), c1883u.mo4582a(Boolean.valueOf(zBooleanValue)), AbstractC5888h1.f23938t.mo4582a(viewTreeObserverOnGlobalLayoutListenerC5934t.getViewConfiguration()), AbstractC1852l0.f6156a.mo4582a((C5913n2) objM4514P3)}, AbstractC3879i.m8071e(1317454175, new C5872d1(viewTreeObserverOnGlobalLayoutListenerC5934t, this, interfaceC1235p), c1836h0), c1836h0, 56);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C5872d1(this, viewTreeObserverOnGlobalLayoutListenerC5934t, interfaceC1235p, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10582b() {
        int i9 = this.f23877u - 1;
        this.f23877u = i9;
        if (i9 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f23877u = 0;
        }
        if (this.f23877u == 0) {
            View view = this.f23857a;
            Context context = view.getContext();
            ComponentCallbacks2C5876e1 componentCallbacks2C5876e1 = this.f23879w;
            context.unregisterComponentCallbacks(componentCallbacks2C5876e1);
            C5944v1 c5944v1 = this.f23875s;
            if (c5944v1.f24165b == null) {
                c5944v1.f24164a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C5876e1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10583c() {
        int i9 = this.f23877u + 1;
        this.f23877u = i9;
        if (i9 == 1) {
            View view = this.f23857a;
            Context context = view.getContext();
            ComponentCallbacks2C5876e1 componentCallbacks2C5876e1 = this.f23879w;
            context.registerComponentCallbacks(componentCallbacks2C5876e1);
            m10584d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C5944v1 c5944v1 = this.f23875s;
            c5944v1.f24166c.setValue(Boolean.valueOf(zHasWindowFocus));
            C1845j1 c1845j1 = c5944v1.f24165b;
            C0655c0 c0655c0 = this.f23878v;
            if (c1845j1 == null) {
                c5944v1.f24164a = c0655c0;
            }
            if (c1845j1 != null) {
                c1845j1.setValue(c0655c0.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C5876e1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10584d(Configuration configuration) {
        int iUpdateFrom = this.f23864h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f23862f.f2090a.entrySet().iterator();
            while (it.hasNext()) {
                it.remove();
            }
            this.f23865i.setValue(new Configuration(configuration));
            C0684d c0684d = this.f23863g;
            synchronized (c0684d) {
                c0684d.f2091a.m2374c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f23871o.setValue(AbstractC2043a.m5037k(this.f23857a.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C5944v1 c5944v1 = this.f23875s;
                C0655c0 c0655c0 = this.f23878v;
                C1845j1 c1845j1 = c5944v1.f24165b;
                if (c1845j1 != null) {
                    c1845j1.setValue(c0655c0.invoke());
                }
            }
        }
    }
}
