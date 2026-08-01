package androidx.lifecycle;

import android.os.Looper;
import defpackage.gq;
import defpackage.ip;
import defpackage.iq;
import defpackage.j6;
import defpackage.jq;
import defpackage.k10;
import defpackage.l10;
import defpackage.m10;
import defpackage.mq;
import defpackage.nq;
import defpackage.oq;
import defpackage.pq;
import defpackage.qq;
import defpackage.uj;
import defpackage.vf;
import defpackage.yn;
import defpackage.z30;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final boolean a;
    public uj b;
    public jq c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;

    public a(oq r2) {
        new AtomicReference();
        this.a = true;
        this.b = new uj();
        this.c = jq.b;
        this.h = new ArrayList();
        this.d = new WeakReference(r2);
    }

    public final void a(nq r10) {
        c("addObserver");
        jq r0 = this.c;
        jq r1 = jq.a;
        if (r0 == r1) goto L6;
        r1 = jq.b;
    L6:
        pq r02 = new pq();
        HashMap r2 = qq.a;
        boolean r22 = r10 instanceof mq;
        boolean r3 = r10 instanceof vf;
        boolean r6 = false;
        if (r22 == false) goto L10;
        if (r3 == false) goto L10;
        mq r23 = new DefaultLifecycleObserverAdapter((vf) r10, (mq) r10);
    L26:
        r02.b = r23;
        r02.a = r1;
        uj r12 = this.b;
        l10 r24 = r12.a(r10);
        if (r24 == null) goto L29;
        Object r13 = r24.b;
    L35:
        if (((pq) r13) != null) goto L70;
        oq r14 = (oq) this.d.get();
        if (r14 != null) goto L41;
        return;
    L41:
        if (this.e == 0) goto L43;
    L44:
        r6 = true;
    L45:
        jq r25 = b(r10);
        this.e++;
    L47:
        if (r02.a.compareTo(r25) >= 0) goto L63;
        if (this.b.e.containsKey(r10) == false) goto L63;
        jq r26 = r02.a;
        ArrayList r32 = this.h;
        r32.add(r26);
        gq r27 = iq.Companion;
        jq r8 = r02.a;
        r27.getClass();
        ip.o("state", r8);
        int r28 = r8.ordinal();
        if (r28 == 1) goto L58;
        if (r28 != 2) goto L54;
        iq r29 = iq.ON_START;
    L59:
        if (r29 == null) goto L62;
        r02.a(r14, r29);
        r32.remove(r32.size() - 1);
        r25 = b(r10);
        goto L47
    L62:
        throw new IllegalStateException("no event up from " + r02.a);
    L54:
        if (r28 == 3) goto L56;
        r29 = null;
        goto L59
    L56:
        r29 = iq.ON_RESUME;
        goto L59
    L58:
        r29 = iq.ON_CREATE;
    L63:
        if (r6 == true) goto L65;
        h();
    L65:
        this.e--;
        return;
    L43:
        if (this.f == false) goto L45;
    L70:
        return;
    L29:
        HashMap r210 = r12.e;
        l10 r33 = new l10(r10, r02);
        r12.d++;
        l10 r82 = r12.b;
        if (r82 != null) goto L32;
        r12.a = r33;
        r12.b = r33;
    L33:
        r210.put(r10, r33);
        r13 = null;
        goto L35
    L32:
        r82.c = r33;
        r33.d = r82;
        r12.b = r33;
    L10:
        if (r3 == false) goto L12;
        r23 = new DefaultLifecycleObserverAdapter((vf) r10, null);
        goto L26
    L12:
        if (r22 == false) goto L14;
        r23 = (mq) r10;
        goto L26
    L14:
        Class<?> r211 = r10.getClass();
        if (qq.b(r211) != 2) goto L25;
        Object r212 = qq.b.get(r211);
        ip.l(r212);
        List r213 = (List) r212;
        if (r213.size() == 1) goto L23;
        int r34 = r213.size();
        yn[] r83 = new yn[r34];
        if (r34 > 0) goto L21;
        r23 = new CompositeGeneratedAdaptersObserver(r83);
        goto L26
    L21:
        qq.a((Constructor) r213.get(0), r10);
        throw null;
    L23:
        qq.a((Constructor) r213.get(0), r10);
        throw null;
    L25:
        r23 = new ReflectiveGenericLifecycleObserver(r10);
        goto L26
    }

    public final jq b(nq r4) {
        HashMap r0 = this.b.e;
        jq r2 = null;
        if (r0.containsKey(r4) == false) goto L5;
        l10 r42 = ((l10) r0.get(r4)).d;
    L6:
        if (r42 == null) goto L8;
        jq r43 = ((pq) r42.b).a;
    L9:
        ArrayList r02 = this.h;
        if (r02.isEmpty() == true) goto L12;
        r2 = (jq) r02.get(r02.size() - 1);
    L12:
        jq r03 = this.c;
        ip.o("state1", r03);
        if (r43 != null) goto L15;
    L17:
        r43 = r03;
    L18:
        if (r2 != null) goto L20;
    L22:
        return r43;
    L20:
        if (r2.compareTo(r43) >= 0) goto L22;
        return r2;
    L15:
        if (r43.compareTo(r03) >= 0) goto L17;
    L8:
        r43 = null;
        goto L9
    L5:
        r42 = null;
        goto L6
    }

    public final void c(String r3) {
        if (this.a == false) goto L9;
        ((j6) j6.z().d).getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L8;
        return;
    L8:
        throw new IllegalStateException(z30.j("Method ", r3, " must be called on the main thread").toString());
    }

    public final void d(iq r2) {
        ip.o("event", r2);
        c("handleLifecycleEvent");
        e(r2.a());
    }

    public final void e(jq r4) {
        jq r0 = this.c;
        if (r0 == r4) goto L23;
        jq r1 = jq.b;
        jq r2 = jq.a;
        if (r0 != r1) goto L11;
        if (r4 != r2) goto L11;
        throw new IllegalStateException(("no event down from " + this.c + " in component " + this.d.get()).toString());
    L11:
        this.c = r4;
        if (this.f == false) goto L14;
    L20:
        this.g = true;
        return;
    L14:
        if (this.e != 0) goto L20;
        this.f = true;
        h();
        this.f = false;
        if (this.c != r2) goto L22;
        this.b = new uj();
        return;
    L22:
        return;
    }

    public final void f(nq r2) {
        c("removeObserver");
        this.b.b(r2);
    }

    public final void g() {
        c("setCurrentState");
        e(jq.c);
    }

    public final void h() {
        oq r0 = (oq) this.d.get();
        if (r0 == null) goto L70;
    L4:
        uj r1 = this.b;
        if (r1.d == 0) goto L11;
        l10 r12 = r1.a;
        ip.l(r12);
        jq r13 = ((pq) r12.b).a;
        l10 r2 = this.b.b;
        ip.l(r2);
        jq r22 = ((pq) r2.b).a;
        if (r13 == r22) goto L10;
    L13:
        this.g = false;
        jq r14 = this.c;
        l10 r23 = this.b.a;
        ip.l(r23);
        int r15 = r14.compareTo(((pq) r23.b).a);
        ArrayList r7 = this.h;
        if (r15 >= 0) goto L40;
        uj r16 = this.b;
        k10 r8 = new k10(r16.b, r16.a, 1);
        r16.c.put(r8, Boolean.FALSE);
    L17:
        if (r8.hasNext() == false) goto L40;
        if (this.g == true) goto L40;
        Map.Entry r17 = (Map.Entry) r8.next();
        ip.n("next()", r17);
        nq r9 = (nq) r17.getKey();
        pq r18 = (pq) r17.getValue();
    L22:
        if (r18.a.compareTo(this.c) <= 0) goto L17;
        if (this.g == true) goto L17;
        if (this.b.e.containsKey(r9) == false) goto L17;
        gq r10 = iq.Companion;
        jq r11 = r18.a;
        r10.getClass();
        ip.o("state", r11);
        int r102 = r11.ordinal();
        if (r102 == 2) goto L35;
        if (r102 != 3) goto L31;
        iq r103 = iq.ON_STOP;
    L36:
        if (r103 == null) goto L39;
        r7.add(r103.a());
        r18.a(r0, r103);
        r7.remove(r7.size() - 1);
        goto L22
    L39:
        throw new IllegalStateException("no event down from " + r18.a);
    L31:
        if (r102 == 4) goto L33;
        r103 = null;
        goto L36
    L33:
        r103 = iq.ON_PAUSE;
        goto L36
    L35:
        r103 = iq.ON_DESTROY;
    L40:
        l10 r19 = this.b.b;
        if (this.g == true) goto L4;
        if (r19 == null) goto L4;
        if (this.c.compareTo(((pq) r19.b).a) <= 0) goto L4;
        uj r110 = this.b;
        r110.getClass();
        m10 r82 = new m10(r110);
        r110.c.put(r82, Boolean.FALSE);
    L47:
        if (r82.hasNext() == false) goto L4;
        if (this.g == true) goto L4;
        Map.Entry r111 = (Map.Entry) r82.next();
        nq r92 = (nq) r111.getKey();
        pq r112 = (pq) r111.getValue();
    L52:
        if (r112.a.compareTo(this.c) >= 0) goto L47;
        if (this.g == true) goto L47;
        if (this.b.e.containsKey(r92) == false) goto L47;
        r7.add(r112.a);
        gq r104 = iq.Companion;
        jq r113 = r112.a;
        r104.getClass();
        ip.o("state", r113);
        int r105 = r113.ordinal();
        if (r105 == 1) goto L64;
        if (r105 == 2) goto L63;
        if (r105 == 3) goto L62;
        iq r106 = null;
    L65:
        if (r106 == null) goto L68;
        r112.a(r0, r106);
        r7.remove(r7.size() - 1);
        goto L52
    L68:
        throw new IllegalStateException("no event up from " + r112.a);
    L62:
        r106 = iq.ON_RESUME;
        goto L65
    L63:
        r106 = iq.ON_START;
        goto L65
    L64:
        r106 = iq.ON_CREATE;
        goto L65
    L10:
        if (this.c != r22) goto L13;
    L11:
        this.g = false;
        return;
    L70:
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
