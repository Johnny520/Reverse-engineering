package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;
import p059h.C0943a;
import p061i.C0948a;
import p061i.C0949b;
import p061i.C0950c;
import p061i.C0951d;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0543t {

    /* JADX INFO: renamed from: a */
    public final boolean f1491a;

    /* JADX INFO: renamed from: b */
    public C0948a f1492b;

    /* JADX INFO: renamed from: c */
    public EnumC0536m f1493c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f1494d;

    /* JADX INFO: renamed from: e */
    public int f1495e;

    /* JADX INFO: renamed from: f */
    public boolean f1496f;

    /* JADX INFO: renamed from: g */
    public boolean f1497g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f1498h;

    public C0543t(InterfaceC0541r r2) {
        AbstractC0307g.m703e(r2, "provider");
        new AtomicReference();
        this.f1491a = true;
        this.f1492b = new C0948a();
        this.f1493c = EnumC0536m.f1483b;
        this.f1498h = new ArrayList();
        this.f1494d = new WeakReference(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1254a(InterfaceC0540q r10) {
        ArrayList r02 = this.f1498h;
        AbstractC0307g.m703e(r10, "observer");
        m1256c("addObserver");
        EnumC0536m r1 = this.f1493c;
        EnumC0536m r2 = EnumC0536m.f1482a;
        if (r1 == r2) goto L6;
        r2 = EnumC0536m.f1483b;
    L6:
        C0542s r12 = new C0542s();
        HashMap r3 = AbstractC0544u.f1499a;
        boolean r32 = r10 instanceof InterfaceC0539p;
        boolean r4 = r10 instanceof InterfaceC0527d;
        boolean r6 = false;
        if (r32 == false) goto L11;
        if (r4 == false) goto L11;
        InterfaceC0539p r33 = new DefaultLifecycleObserverAdapter((InterfaceC0527d) r10, (InterfaceC0539p) r10);
    L27:
        r12.f1490b = r33;
        r12.f1489a = r2;
        if (((C0542s) this.f1492b.m2283c(r10, r12)) == null) goto L30;
        return;
    L30:
        InterfaceC0541r r22 = (InterfaceC0541r) this.f1494d.get();
        if (r22 != null) goto L34;
        return;
    L34:
        if (this.f1495e == 0) goto L36;
    L37:
        r6 = true;
    L38:
        EnumC0536m r34 = m1255b(r10);
        this.f1495e++;
    L40:
        if (r12.f1489a.compareTo(r34) >= 0) goto L48;
        if (this.f1492b.f3365e.containsKey(r10) == false) goto L48;
        r02.add(r12.f1489a);
        C0533j r35 = EnumC0535l.Companion;
        EnumC0536m r42 = r12.f1489a;
        r35.getClass();
        EnumC0535l r36 = C0533j.m1251a(r42);
        if (r36 == null) goto L47;
        r12.m1253a(r22, r36);
        r02.remove(r02.size() - 1);
        r34 = m1255b(r10);
        goto L40
    L47:
        throw new IllegalStateException("no event up from " + r12.f1489a);
    L48:
        if (r6 == true) goto L50;
        m1259f();
    L50:
        this.f1495e--;
        return;
    L36:
        if (this.f1496f == false) goto L38;
    L11:
        if (r4 == false) goto L13;
        r33 = new DefaultLifecycleObserverAdapter((InterfaceC0527d) r10, null);
        goto L27
    L13:
        if (r32 == false) goto L15;
        r33 = (InterfaceC0539p) r10;
        goto L27
    L15:
        Class<?> r37 = r10.getClass();
        if (AbstractC0544u.m1261b(r37) != 2) goto L26;
        Object r38 = AbstractC0544u.f1500b.get(r37);
        AbstractC0307g.m700b(r38);
        List r39 = (List) r38;
        if (r39.size() == 1) goto L24;
        int r43 = r39.size();
        InterfaceC0530g[] r8 = new InterfaceC0530g[r43];
        if (r43 > 0) goto L22;
        r33 = new CompositeGeneratedAdaptersObserver(r8);
        goto L27
    L22:
        AbstractC0544u.m1260a((Constructor) r39.get(0), r10);
        throw null;
    L24:
        AbstractC0544u.m1260a((Constructor) r39.get(0), r10);
        throw null;
    L26:
        r33 = new ReflectiveGenericLifecycleObserver(r10);
        goto L27
    }

    /* JADX INFO: renamed from: b */
    public final EnumC0536m m1255b(InterfaceC0540q r4) {
        HashMap r02 = this.f1492b.f3365e;
        EnumC0536m r2 = null;
        if (r02.containsKey(r4) == false) goto L5;
        C0950c r42 = ((C0950c) r02.get(r4)).f3372d;
    L6:
        if (r42 == null) goto L10;
        C0542s r43 = (C0542s) r42.f3370b;
        if (r43 == null) goto L10;
        EnumC0536m r44 = r43.f1489a;
    L11:
        ArrayList r03 = this.f1498h;
        if ((!r03.isEmpty()) == false) goto L14;
        r2 = (EnumC0536m) r03.get(r03.size() - 1);
    L14:
        EnumC0536m r04 = this.f1493c;
        AbstractC0307g.m703e(r04, "state1");
        if (r44 != null) goto L17;
    L19:
        r44 = r04;
    L20:
        if (r2 == null) goto L25;
        if (r2.compareTo(r44) >= 0) goto L25;
        return r2;
    L25:
        return r44;
    L17:
        if (r44.compareTo(r04) >= 0) goto L19;
    L10:
        r44 = null;
        goto L11
    L5:
        r42 = null;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final void m1256c(String r4) {
        if (this.f1491a == true) goto L5;
        return;
    L5:
        if (C0943a.f3351c == null) goto L8;
        C0943a r02 = C0943a.f3351c;
    L16:
        ((C0943a) r02.f3352b).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L20;
        return;
    L20:
        throw new IllegalStateException(AbstractC0324d.m723f("Method ", r4, " must be called on the main thread").toString());
    L8:
        monitor-enter(C0943a.class);
    L12:
        th = move-exception;
        throw th;
    L10:
        if (C0943a.f3351c != null) goto L14;
        C0943a.f3351c = new C0943a(0);     // Catch: Throwable -> L12
    L14:
        monitor-exit(C0943a.class);     // Catch: Throwable -> L12
        r02 = C0943a.f3351c;
        goto L16
    }

    /* JADX INFO: renamed from: d */
    public final void m1257d(EnumC0535l r4) {
        AbstractC0307g.m703e(r4, "event");
        m1256c("handleLifecycleEvent");
        EnumC0536m r42 = r4.m1252a();
        EnumC0536m r02 = this.f1493c;
        if (r02 == r42) goto L23;
        EnumC0536m r1 = EnumC0536m.f1483b;
        EnumC0536m r2 = EnumC0536m.f1482a;
        if (r02 != r1) goto L11;
        if (r42 != r2) goto L11;
        throw new IllegalStateException(("no event down from " + this.f1493c + " in component " + this.f1494d.get()).toString());
    L11:
        this.f1493c = r42;
        if (this.f1496f == false) goto L14;
    L19:
        this.f1497g = true;
        return;
    L14:
        if (this.f1495e != 0) goto L19;
        this.f1496f = true;
        m1259f();
        this.f1496f = false;
        if (this.f1493c != r2) goto L21;
        this.f1492b = new C0948a();
        return;
    L21:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final void m1258e(InterfaceC0540q r2) {
        AbstractC0307g.m703e(r2, "observer");
        m1256c("removeObserver");
        this.f1492b.mo2282b(r2);
    }

    /* JADX INFO: renamed from: f */
    public final void m1259f() {
        InterfaceC0541r r02 = (InterfaceC0541r) this.f1494d.get();
        if (r02 == null) goto L64;
    L4:
        C0948a r1 = this.f1492b;
        if (r1.f3379d == 0) goto L11;
        C0950c r12 = r1.f3376a;
        AbstractC0307g.m700b(r12);
        EnumC0536m r13 = ((C0542s) r12.f3370b).f1489a;
        C0950c r2 = this.f1492b.f3377b;
        AbstractC0307g.m700b(r2);
        EnumC0536m r22 = ((C0542s) r2.f3370b).f1489a;
        if (r13 == r22) goto L10;
    L13:
        this.f1497g = false;
        EnumC0536m r14 = this.f1493c;
        C0950c r23 = this.f1492b.f3376a;
        AbstractC0307g.m700b(r23);
        if (r14.compareTo(((C0542s) r23.f3370b).f1489a) >= 0) goto L41;
        C0948a r15 = this.f1492b;
        C0949b r24 = new C0949b(r15.f3377b, r15.f3376a, 1);
        r15.f3378c.put(r24, Boolean.FALSE);
    L17:
        if (r24.hasNext() == false) goto L41;
        if (this.f1497g == true) goto L41;
        Map.Entry r16 = (Map.Entry) r24.next();
        AbstractC0307g.m702d(r16, "next()");
        InterfaceC0540q r3 = (InterfaceC0540q) r16.getKey();
        C0542s r17 = (C0542s) r16.getValue();
    L22:
        if (r17.f1489a.compareTo(this.f1493c) <= 0) goto L17;
        if (this.f1497g == true) goto L17;
        if (this.f1492b.f3365e.containsKey(r3) == false) goto L17;
        C0533j r4 = EnumC0535l.Companion;
        EnumC0536m r5 = r17.f1489a;
        r4.getClass();
        AbstractC0307g.m703e(r5, "state");
        int r42 = r5.ordinal();
        if (r42 != 2) goto L30;
        EnumC0535l r43 = EnumC0535l.ON_DESTROY;
    L37:
        if (r43 == null) goto L40;
        this.f1498h.add(r43.m1252a());
        r17.m1253a(r02, r43);
        this.f1498h.remove(r4.size() - 1);
        goto L22
    L40:
        throw new IllegalStateException("no event down from " + r17.f1489a);
    L30:
        if (r42 != 3) goto L32;
        r43 = EnumC0535l.ON_STOP;
        goto L37
    L32:
        if (r42 == 4) goto L34;
        r43 = null;
        goto L37
    L34:
        r43 = EnumC0535l.ON_PAUSE;
    L41:
        C0950c r18 = this.f1492b.f3377b;
        if (this.f1497g == true) goto L4;
        if (r18 == null) goto L4;
        if (this.f1493c.compareTo(((C0542s) r18.f3370b).f1489a) <= 0) goto L4;
        C0948a r19 = this.f1492b;
        r19.getClass();
        C0951d r25 = new C0951d(r19);
        r19.f3378c.put(r25, Boolean.FALSE);
    L48:
        if (r25.hasNext() == false) goto L4;
        if (this.f1497g == true) goto L4;
        Map.Entry r110 = (Map.Entry) r25.next();
        InterfaceC0540q r32 = (InterfaceC0540q) r110.getKey();
        C0542s r111 = (C0542s) r110.getValue();
    L53:
        if (r111.f1489a.compareTo(this.f1493c) >= 0) goto L48;
        if (this.f1497g == true) goto L48;
        if (this.f1492b.f3365e.containsKey(r32) == false) goto L48;
        this.f1498h.add(r111.f1489a);
        C0533j r44 = EnumC0535l.Companion;
        EnumC0536m r52 = r111.f1489a;
        r44.getClass();
        EnumC0535l r45 = C0533j.m1251a(r52);
        if (r45 == null) goto L62;
        r111.m1253a(r02, r45);
        this.f1498h.remove(r4.size() - 1);
        goto L53
    L62:
        throw new IllegalStateException("no event up from " + r111.f1489a);
    L10:
        if (this.f1493c != r22) goto L13;
    L11:
        this.f1497g = false;
        return;
    L64:
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
