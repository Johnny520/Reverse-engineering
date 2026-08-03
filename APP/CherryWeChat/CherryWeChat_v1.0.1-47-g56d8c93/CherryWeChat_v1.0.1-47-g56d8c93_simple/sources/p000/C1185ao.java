package p000;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1185ao extends AbstractC0760Rn {

    /* JADX INFO: renamed from: a */
    public final boolean f4062a;

    /* JADX INFO: renamed from: b */
    public C1414fh f4063b;

    /* JADX INFO: renamed from: c */
    public EnumC0675Pn f4064c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f4065d;

    /* JADX INFO: renamed from: e */
    public int f4066e;

    /* JADX INFO: renamed from: f */
    public boolean f4067f;

    /* JADX INFO: renamed from: g */
    public boolean f4068g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4069h;

    /* JADX INFO: renamed from: i */
    public final C1115Zy f4070i;

    public C1185ao(InterfaceC1061Yn r3) {
        new AtomicReference();
        this.f4062a = true;
        this.f4063b = new C1414fh();
        EnumC0675Pn r0 = EnumC0675Pn.f2148b;
        this.f4064c = r0;
        this.f4069h = new ArrayList();
        this.f4065d = new WeakReference(r3);
        this.f4070i = new C1115Zy(r0);
    }

    @Override // p000.AbstractC0760Rn
    /* JADX INFO: renamed from: a */
    public final void mo1555a(InterfaceC1018Xn r10) {
        m2275d("addObserver");
        EnumC0675Pn r0 = this.f4064c;
        EnumC0675Pn r1 = EnumC0675Pn.f2147a;
        if (r0 == r1) goto L6;
        r1 = EnumC0675Pn.f2148b;
    L6:
        C1104Zn r02 = new C1104Zn();
        HashMap r2 = AbstractC1272co.f4333a;
        boolean r22 = r10 instanceof InterfaceC0889Un;
        boolean r3 = r10 instanceof DefaultLifecycleObserver;
        int r4 = 2;
        Object r5 = null;
        int r6 = 0;
        if (r22 == false) goto L10;
        if (r3 == false) goto L10;
        InterfaceC0889Un r23 = new C1366ed(r6, (DefaultLifecycleObserver) r10, (InterfaceC0889Un) r10);
    L26:
        r02.f3497b = r23;
        r02.f3496a = r1;
        C1414fh r12 = this.f4063b;
        C0898Uw r24 = r12.mo1943a(r10);
        if (r24 == null) goto L29;
        Object r13 = r24.f2792b;
    L35:
        if (((C1104Zn) r13) != null) goto L70;
        InterfaceC1061Yn r14 = (InterfaceC1061Yn) this.f4065d.get();
        if (r14 != null) goto L41;
        return;
    L41:
        if (this.f4066e == 0) goto L43;
    L44:
        r6 = 1;
    L45:
        EnumC0675Pn r25 = m2274c(r10);
        this.f4066e++;
    L47:
        if (r02.f3496a.compareTo(r25) >= 0) goto L63;
        if (this.f4063b.f4996e.containsKey(r10) == false) goto L63;
        EnumC0675Pn r26 = r02.f3496a;
        ArrayList r32 = this.f4069h;
        r32.add(r26);
        C0546Mn r27 = EnumC0632On.Companion;
        EnumC0675Pn r8 = r02.f3496a;
        r27.getClass();
        int r28 = r8.ordinal();
        if (r28 == 1) goto L58;
        if (r28 != 2) goto L54;
        EnumC0632On r29 = EnumC0632On.ON_START;
    L59:
        if (r29 == null) goto L62;
        r02.m2028a(r14, r29);
        r32.remove(r32.size() - 1);
        r25 = m2274c(r10);
        goto L47
    L62:
        throw new IllegalStateException("no event up from " + r02.f3496a);
    L54:
        if (r28 == 3) goto L56;
        r29 = null;
        goto L59
    L56:
        r29 = EnumC0632On.ON_RESUME;
        goto L59
    L58:
        r29 = EnumC0632On.ON_CREATE;
    L63:
        if (r6 != 0) goto L65;
        m2278g();
    L65:
        this.f4066e--;
        return;
    L43:
        if (this.f4067f == false) goto L45;
    L70:
        return;
    L29:
        HashMap r210 = r12.f4996e;
        C0898Uw r33 = new C0898Uw(r10, r02);
        r12.f3272d++;
        C0898Uw r82 = r12.f3270b;
        if (r82 != null) goto L32;
        r12.f3269a = r33;
        r12.f3270b = r33;
    L33:
        r210.put(r10, r33);
        r13 = null;
        goto L35
    L32:
        r82.f2793c = r33;
        r33.f2794d = r82;
        r12.f3270b = r33;
    L10:
        if (r3 == false) goto L12;
        r23 = new C1366ed(r6, (DefaultLifecycleObserver) r10, r5);
        goto L26
    L12:
        if (r22 == false) goto L14;
        r23 = (InterfaceC0889Un) r10;
        goto L26
    L14:
        Class<?> r211 = r10.getClass();
        if (AbstractC1272co.m2411b(r211) != 2) goto L25;
        List r212 = (List) AbstractC1272co.f4334b.get(r211);
        if (r212.size() == 1) goto L23;
        int r34 = r212.size();
        InterfaceC2462rj[] r83 = new InterfaceC2462rj[r34];
        if (r34 > 0) goto L21;
        r23 = new C1297cv(r4, r83);
        goto L26
    L21:
        AbstractC1272co.m2410a((Constructor) r212.get(0), r10);
        throw null;
    L23:
        AbstractC1272co.m2410a((Constructor) r212.get(0), r10);
        throw null;
    L25:
        r23 = new C1366ed(r10);
        goto L26
    }

    @Override // p000.AbstractC0760Rn
    /* JADX INFO: renamed from: b */
    public final void mo1556b(InterfaceC1018Xn r2) {
        m2275d("removeObserver");
        this.f4063b.mo1944b(r2);
    }

    /* JADX INFO: renamed from: c */
    public final EnumC0675Pn m2274c(InterfaceC1018Xn r4) {
        HashMap r0 = this.f4063b.f4996e;
        EnumC0675Pn r2 = null;
        if (r0.containsKey(r4) == false) goto L5;
        C0898Uw r42 = ((C0898Uw) r0.get(r4)).f2794d;
    L6:
        if (r42 == null) goto L10;
        C1104Zn r43 = (C1104Zn) r42.f2792b;
        if (r43 == null) goto L10;
        EnumC0675Pn r44 = r43.f3496a;
    L11:
        ArrayList r02 = this.f4069h;
        if (r02.isEmpty() == true) goto L14;
        r2 = (EnumC0675Pn) r02.get(r02.size() - 1);
    L14:
        EnumC0675Pn r03 = this.f4064c;
        if (r44 != null) goto L17;
    L19:
        r44 = r03;
    L20:
        if (r2 != null) goto L22;
    L24:
        return r44;
    L22:
        if (r2.compareTo(r44) >= 0) goto L24;
        return r2;
    L17:
        if (r44.compareTo(r03) >= 0) goto L19;
    L10:
        r44 = null;
        goto L11
    L5:
        r42 = null;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final void m2275d(String r3) {
        if (this.f4062a == false) goto L9;
        C0005A4.m2X().f3f.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L8;
        return;
    L8:
        throw new IllegalStateException(AbstractC2374ph.m4814k("Method ", r3, " must be called on the main thread").toString());
    }

    /* JADX INFO: renamed from: e */
    public final void m2276e(EnumC0632On r2) {
        m2275d("handleLifecycleEvent");
        m2277f(r2.m1254a());
    }

    /* JADX INFO: renamed from: f */
    public final void m2277f(EnumC0675Pn r4) {
        EnumC0675Pn r0 = this.f4064c;
        if (r0 == r4) goto L23;
        EnumC0675Pn r1 = EnumC0675Pn.f2148b;
        EnumC0675Pn r2 = EnumC0675Pn.f2147a;
        if (r0 != r1) goto L11;
        if (r4 != r2) goto L11;
        throw new IllegalStateException(("no event down from " + this.f4064c + " in component " + this.f4065d.get()).toString());
    L11:
        this.f4064c = r4;
        if (this.f4067f == false) goto L14;
    L20:
        this.f4068g = true;
        return;
    L14:
        if (this.f4066e != 0) goto L20;
        this.f4067f = true;
        m2278g();
        this.f4067f = false;
        if (this.f4064c != r2) goto L22;
        this.f4063b = new C1414fh();
        return;
    L22:
        return;
    }

    /* JADX INFO: renamed from: g */
    public final void m2278g() {
        InterfaceC1061Yn r0 = (InterfaceC1061Yn) this.f4065d.get();
        if (r0 == null) goto L70;
    L4:
        C1414fh r1 = this.f4063b;
        if (r1.f3272d == 0) goto L11;
        EnumC0675Pn r2 = ((C1104Zn) r1.f3269a.f2792b).f3496a;
        EnumC0675Pn r12 = ((C1104Zn) r1.f3270b.f2792b).f3496a;
        if (r2 == r12) goto L10;
    L13:
        this.f4068g = false;
        int r13 = this.f4064c.compareTo(r2);
        ArrayList r6 = this.f4069h;
        if (r13 >= 0) goto L40;
        C1414fh r14 = this.f4063b;
        C0855Tw r7 = new C0855Tw(r14.f3270b, r14.f3269a, 1);
        r14.f3271c.put(r7, Boolean.FALSE);
    L17:
        if (r7.hasNext() == false) goto L40;
        if (this.f4068g == true) goto L40;
        Map.Entry r15 = (Map.Entry) r7.next();
        InterfaceC1018Xn r8 = (InterfaceC1018Xn) r15.getKey();
        C1104Zn r16 = (C1104Zn) r15.getValue();
    L22:
        if (r16.f3496a.compareTo(this.f4064c) <= 0) goto L17;
        if (this.f4068g == true) goto L17;
        if (this.f4063b.f4996e.containsKey(r8) == false) goto L17;
        C0546Mn r9 = EnumC0632On.Companion;
        EnumC0675Pn r10 = r16.f3496a;
        r9.getClass();
        int r92 = r10.ordinal();
        if (r92 == 2) goto L35;
        if (r92 != 3) goto L31;
        EnumC0632On r93 = EnumC0632On.ON_STOP;
    L36:
        if (r93 == null) goto L39;
        r6.add(r93.m1254a());
        r16.m2028a(r0, r93);
        r6.remove(r6.size() - 1);
        goto L22
    L39:
        throw new IllegalStateException("no event down from " + r16.f3496a);
    L31:
        if (r92 == 4) goto L33;
        r93 = null;
        goto L36
    L33:
        r93 = EnumC0632On.ON_PAUSE;
        goto L36
    L35:
        r93 = EnumC0632On.ON_DESTROY;
    L40:
        C0898Uw r17 = this.f4063b.f3270b;
        if (this.f4068g == true) goto L4;
        if (r17 == null) goto L4;
        if (this.f4064c.compareTo(((C1104Zn) r17.f2792b).f3496a) <= 0) goto L4;
        C1414fh r18 = this.f4063b;
        r18.getClass();
        C0941Vw r72 = new C0941Vw(r18);
        r18.f3271c.put(r72, Boolean.FALSE);
    L47:
        if (r72.hasNext() == false) goto L4;
        if (this.f4068g == true) goto L4;
        Map.Entry r19 = (Map.Entry) r72.next();
        InterfaceC1018Xn r82 = (InterfaceC1018Xn) r19.getKey();
        C1104Zn r110 = (C1104Zn) r19.getValue();
    L52:
        if (r110.f3496a.compareTo(this.f4064c) >= 0) goto L47;
        if (this.f4068g == true) goto L47;
        if (this.f4063b.f4996e.containsKey(r82) == false) goto L47;
        r6.add(r110.f3496a);
        C0546Mn r94 = EnumC0632On.Companion;
        EnumC0675Pn r102 = r110.f3496a;
        r94.getClass();
        int r95 = r102.ordinal();
        if (r95 == 1) goto L64;
        if (r95 == 2) goto L63;
        if (r95 == 3) goto L62;
        EnumC0632On r96 = null;
    L65:
        if (r96 == null) goto L68;
        r110.m2028a(r0, r96);
        r6.remove(r6.size() - 1);
        goto L52
    L68:
        throw new IllegalStateException("no event up from " + r110.f3496a);
    L62:
        r96 = EnumC0632On.ON_RESUME;
        goto L65
    L63:
        r96 = EnumC0632On.ON_START;
        goto L65
    L64:
        r96 = EnumC0632On.ON_CREATE;
        goto L65
    L10:
        if (this.f4064c != r12) goto L13;
    L11:
        this.f4068g = false;
        this.f4070i.m2031D(this.f4064c);
        return;
    L70:
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
