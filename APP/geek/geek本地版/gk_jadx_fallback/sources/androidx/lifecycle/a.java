package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final boolean a;
    public defpackage.uj b;
    public defpackage.jq c;
    public final java.lang.ref.WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final java.util.ArrayList h;

    public a(defpackage.oq r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r0 = 1
            r1.a = r0
            uj r0 = new uj
            r0.<init>()
            r1.b = r0
            jq r0 = defpackage.jq.b
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.h = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.d = r0
            return
    }

    public final void a(defpackage.nq r10) {
            r9 = this;
            java.lang.String r0 = "addObserver"
            r9.c(r0)
            jq r0 = r9.c
            jq r1 = defpackage.jq.a
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            jq r1 = defpackage.jq.b
        Le:
            pq r0 = new pq
            r0.<init>()
            java.util.HashMap r2 = defpackage.qq.a
            boolean r2 = r10 instanceof defpackage.mq
            boolean r3 = r10 instanceof defpackage.vf
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2d
            if (r3 == 0) goto L2d
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            vf r3 = (defpackage.vf) r3
            r8 = r10
            mq r8 = (defpackage.mq) r8
            r2.<init>(r3, r8)
            goto L80
        L2d:
            if (r3 == 0) goto L38
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            vf r3 = (defpackage.vf) r3
            r2.<init>(r3, r5)
            goto L80
        L38:
            if (r2 == 0) goto L3e
            r2 = r10
            mq r2 = (defpackage.mq) r2
            goto L80
        L3e:
            java.lang.Class r2 = r10.getClass()
            int r3 = defpackage.qq.b(r2)
            if (r3 != r4) goto L7b
            java.util.HashMap r3 = defpackage.qq.b
            java.lang.Object r2 = r3.get(r2)
            defpackage.ip.l(r2)
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == r7) goto L71
            int r3 = r2.size()
            yn[] r8 = new defpackage.yn[r3]
            if (r3 > 0) goto L67
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r2 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r2.<init>(r8)
            goto L80
        L67:
            java.lang.Object r0 = r2.get(r6)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            defpackage.qq.a(r0, r10)
            throw r5
        L71:
            java.lang.Object r0 = r2.get(r6)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            defpackage.qq.a(r0, r10)
            throw r5
        L7b:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r2 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r2.<init>(r10)
        L80:
            r0.b = r2
            r0.a = r1
            uj r1 = r9.b
            l10 r2 = r1.a(r10)
            if (r2 == 0) goto L8f
            java.lang.Object r1 = r2.b
            goto Lae
        L8f:
            java.util.HashMap r2 = r1.e
            l10 r3 = new l10
            r3.<init>(r10, r0)
            int r8 = r1.d
            int r8 = r8 + r7
            r1.d = r8
            l10 r8 = r1.b
            if (r8 != 0) goto La4
            r1.a = r3
            r1.b = r3
            goto Laa
        La4:
            r8.c = r3
            r3.d = r8
            r1.b = r3
        Laa:
            r2.put(r10, r3)
            r1 = r5
        Lae:
            pq r1 = (defpackage.pq) r1
            if (r1 == 0) goto Lb3
            goto Lbd
        Lb3:
            java.lang.ref.WeakReference r1 = r9.d
            java.lang.Object r1 = r1.get()
            oq r1 = (defpackage.oq) r1
            if (r1 != 0) goto Lbe
        Lbd:
            return
        Lbe:
            int r2 = r9.e
            if (r2 != 0) goto Lc6
            boolean r2 = r9.f
            if (r2 == 0) goto Lc7
        Lc6:
            r6 = r7
        Lc7:
            jq r2 = r9.b(r10)
            int r3 = r9.e
            int r3 = r3 + r7
            r9.e = r3
        Ld0:
            jq r3 = r0.a
            int r2 = r3.compareTo(r2)
            if (r2 >= 0) goto L132
            uj r2 = r9.b
            java.util.HashMap r2 = r2.e
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L132
            jq r2 = r0.a
            java.util.ArrayList r3 = r9.h
            r3.add(r2)
            gq r2 = defpackage.iq.Companion
            jq r8 = r0.a
            r2.getClass()
            java.lang.String r2 = "state"
            defpackage.ip.o(r2, r8)
            int r2 = r8.ordinal()
            if (r2 == r7) goto L108
            if (r2 == r4) goto L105
            r8 = 3
            if (r2 == r8) goto L102
            r2 = r5
            goto L10a
        L102:
            iq r2 = defpackage.iq.ON_RESUME
            goto L10a
        L105:
            iq r2 = defpackage.iq.ON_START
            goto L10a
        L108:
            iq r2 = defpackage.iq.ON_CREATE
        L10a:
            if (r2 == 0) goto L11c
            r0.a(r1, r2)
            int r2 = r3.size()
            int r2 = r2 - r7
            r3.remove(r2)
            jq r2 = r9.b(r10)
            goto Ld0
        L11c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no event up from "
            r1.<init>(r2)
            jq r0 = r0.a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r10.<init>(r0)
            throw r10
        L132:
            if (r6 != 0) goto L137
            r9.h()
        L137:
            int r10 = r9.e
            int r10 = r10 + (-1)
            r9.e = r10
            return
    }

    public final defpackage.jq b(defpackage.nq r4) {
            r3 = this;
            uj r0 = r3.b
            java.util.HashMap r0 = r0.e
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            l10 r4 = (defpackage.l10) r4
            l10 r4 = r4.d
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r4.b
            pq r4 = (defpackage.pq) r4
            jq r4 = r4.a
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.util.ArrayList r0 = r3.h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L34
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            jq r2 = (defpackage.jq) r2
        L34:
            jq r0 = r3.c
            java.lang.String r1 = "state1"
            defpackage.ip.o(r1, r0)
            if (r4 == 0) goto L44
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L44
            goto L45
        L44:
            r4 = r0
        L45:
            if (r2 == 0) goto L4e
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L4e
            return r2
        L4e:
            return r4
    }

    public final void c(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.a
            if (r0 == 0) goto L30
            j6 r0 = defpackage.j6.z()
            java.lang.Object r0 = r0.d
            j6 r0 = (defpackage.j6) r0
            r0.getClass()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L1e
            return
        L1e:
            java.lang.String r0 = "Method "
            java.lang.String r1 = " must be called on the main thread"
            java.lang.String r3 = defpackage.z30.j(r0, r3, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L30:
            return
    }

    public final void d(defpackage.iq r2) {
            r1 = this;
            java.lang.String r0 = "event"
            defpackage.ip.o(r0, r2)
            java.lang.String r0 = "handleLifecycleEvent"
            r1.c(r0)
            jq r2 = r2.a()
            r1.e(r2)
            return
    }

    public final void e(defpackage.jq r4) {
            r3 = this;
            jq r0 = r3.c
            if (r0 != r4) goto L5
            goto L55
        L5:
            jq r1 = defpackage.jq.b
            jq r2 = defpackage.jq.a
            if (r0 != r1) goto L36
            if (r4 == r2) goto Le
            goto L36
        Le:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "no event down from "
            r4.<init>(r0)
            jq r0 = r3.c
            r4.append(r0)
            java.lang.String r0 = " in component "
            r4.append(r0)
            java.lang.ref.WeakReference r0 = r3.d
            java.lang.Object r0 = r0.get()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            r3.c = r4
            boolean r4 = r3.f
            r0 = 1
            if (r4 != 0) goto L56
            int r4 = r3.e
            if (r4 == 0) goto L42
            goto L56
        L42:
            r3.f = r0
            r3.h()
            r4 = 0
            r3.f = r4
            jq r4 = r3.c
            if (r4 != r2) goto L55
            uj r4 = new uj
            r4.<init>()
            r3.b = r4
        L55:
            return
        L56:
            r3.g = r0
            return
    }

    public final void f(defpackage.nq r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            r1.c(r0)
            uj r0 = r1.b
            r0.b(r2)
            return
    }

    public final void g() {
            r1 = this;
            java.lang.String r0 = "setCurrentState"
            r1.c(r0)
            jq r0 = defpackage.jq.c
            r1.e(r0)
            return
    }

    public final void h() {
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.d
            java.lang.Object r0 = r0.get()
            oq r0 = (defpackage.oq) r0
            if (r0 == 0) goto L18c
        La:
            uj r1 = r12.b
            int r2 = r1.d
            r3 = 0
            if (r2 != 0) goto L12
            goto L30
        L12:
            l10 r1 = r1.a
            defpackage.ip.l(r1)
            java.lang.Object r1 = r1.b
            pq r1 = (defpackage.pq) r1
            jq r1 = r1.a
            uj r2 = r12.b
            l10 r2 = r2.b
            defpackage.ip.l(r2)
            java.lang.Object r2 = r2.b
            pq r2 = (defpackage.pq) r2
            jq r2 = r2.a
            if (r1 != r2) goto L33
            jq r1 = r12.c
            if (r1 != r2) goto L33
        L30:
            r12.g = r3
            return
        L33:
            r12.g = r3
            jq r1 = r12.c
            uj r2 = r12.b
            l10 r2 = r2.a
            defpackage.ip.l(r2)
            java.lang.Object r2 = r2.b
            pq r2 = (defpackage.pq) r2
            jq r2 = r2.a
            int r1 = r1.compareTo(r2)
            r2 = 0
            r3 = 3
            r4 = 2
            java.lang.String r5 = "state"
            r6 = 1
            java.util.ArrayList r7 = r12.h
            if (r1 >= 0) goto Le8
            uj r1 = r12.b
            k10 r8 = new k10
            l10 r9 = r1.b
            l10 r10 = r1.a
            r11 = 1
            r8.<init>(r9, r10, r11)
            java.util.WeakHashMap r1 = r1.c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r1.put(r8, r9)
        L65:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Le8
            boolean r1 = r12.g
            if (r1 != 0) goto Le8
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r9 = "next()"
            defpackage.ip.n(r9, r1)
            java.lang.Object r9 = r1.getKey()
            nq r9 = (defpackage.nq) r9
            java.lang.Object r1 = r1.getValue()
            pq r1 = (defpackage.pq) r1
        L86:
            jq r10 = r1.a
            jq r11 = r12.c
            int r10 = r10.compareTo(r11)
            if (r10 <= 0) goto L65
            boolean r10 = r12.g
            if (r10 != 0) goto L65
            uj r10 = r12.b
            java.util.HashMap r10 = r10.e
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L65
            gq r10 = defpackage.iq.Companion
            jq r11 = r1.a
            r10.getClass()
            defpackage.ip.o(r5, r11)
            int r10 = r11.ordinal()
            if (r10 == r4) goto Lbb
            if (r10 == r3) goto Lb8
            r11 = 4
            if (r10 == r11) goto Lb5
            r10 = r2
            goto Lbd
        Lb5:
            iq r10 = defpackage.iq.ON_PAUSE
            goto Lbd
        Lb8:
            iq r10 = defpackage.iq.ON_STOP
            goto Lbd
        Lbb:
            iq r10 = defpackage.iq.ON_DESTROY
        Lbd:
            if (r10 == 0) goto Ld2
            jq r11 = r10.a()
            r7.add(r11)
            r1.a(r0, r10)
            int r10 = r7.size()
            int r10 = r10 - r6
            r7.remove(r10)
            goto L86
        Ld2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event down from "
            r2.<init>(r3)
            jq r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Le8:
            uj r1 = r12.b
            l10 r1 = r1.b
            boolean r8 = r12.g
            if (r8 != 0) goto La
            if (r1 == 0) goto La
            jq r8 = r12.c
            java.lang.Object r1 = r1.b
            pq r1 = (defpackage.pq) r1
            jq r1 = r1.a
            int r1 = r8.compareTo(r1)
            if (r1 <= 0) goto La
            uj r1 = r12.b
            r1.getClass()
            m10 r8 = new m10
            r8.<init>(r1)
            java.util.WeakHashMap r1 = r1.c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r1.put(r8, r9)
        L111:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r12.g
            if (r1 != 0) goto La
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r9 = r1.getKey()
            nq r9 = (defpackage.nq) r9
            java.lang.Object r1 = r1.getValue()
            pq r1 = (defpackage.pq) r1
        L12d:
            jq r10 = r1.a
            jq r11 = r12.c
            int r10 = r10.compareTo(r11)
            if (r10 >= 0) goto L111
            boolean r10 = r12.g
            if (r10 != 0) goto L111
            uj r10 = r12.b
            java.util.HashMap r10 = r10.e
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L111
            jq r10 = r1.a
            r7.add(r10)
            gq r10 = defpackage.iq.Companion
            jq r11 = r1.a
            r10.getClass()
            defpackage.ip.o(r5, r11)
            int r10 = r11.ordinal()
            if (r10 == r6) goto L166
            if (r10 == r4) goto L163
            if (r10 == r3) goto L160
            r10 = r2
            goto L168
        L160:
            iq r10 = defpackage.iq.ON_RESUME
            goto L168
        L163:
            iq r10 = defpackage.iq.ON_START
            goto L168
        L166:
            iq r10 = defpackage.iq.ON_CREATE
        L168:
            if (r10 == 0) goto L176
            r1.a(r0, r10)
            int r10 = r7.size()
            int r10 = r10 - r6
            r7.remove(r10)
            goto L12d
        L176:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "no event up from "
            r2.<init>(r3)
            jq r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L18c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }
}
