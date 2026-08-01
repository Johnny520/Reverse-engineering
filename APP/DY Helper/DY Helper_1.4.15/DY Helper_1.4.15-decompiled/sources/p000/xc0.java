package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xc0 {

    /* JADX INFO: renamed from: α */
    public static final p000.xc0 f12128 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicReference f12129 = null;

    static {
            xc0 r0 = new xc0
            r0.<init>()
            p000.xc0.f12128 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            wc0 r1 = new wc0
            java.lang.String r2 = ""
            kz r3 = p000.C0493kz.f6332
            r1.<init>(r2, r3)
            r0.<init>(r1)
            p000.xc0.f12129 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m6607() {
            java.lang.String r0 = p000.ui1.m5890()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            int r1 = r0.length()
            if (r1 != 0) goto L13
            goto L1b
        L13:
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L20
            java.lang.String r0 = ""
        L20:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.xd0 m6608(p000.xd0 r10, p000.xd0 r11) {
            java.lang.String r0 = r11.f12137
            java.lang.String r1 = r11.f12133
            java.lang.CharSequence r2 = p000.q02.m4660(r0)
            java.lang.String r2 = r2.toString()
            int r3 = r2.length()
            if (r3 != 0) goto L13
            goto L2d
        L13:
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "UID: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L2e
        L2d:
            r0 = 0
        L2e:
            int r2 = r1.length()
            if (r2 != 0) goto L36
            java.lang.String r1 = r10.f12133
        L36:
            r5 = r1
            java.lang.String r1 = r11.f12134
            int r2 = r1.length()
            if (r2 != 0) goto L41
            java.lang.String r1 = r10.f12134
        L41:
            r6 = r1
            java.lang.String r1 = r11.f12135
            int r2 = r1.length()
            if (r2 != 0) goto L4c
            java.lang.String r1 = r10.f12135
        L4c:
            r7 = r1
            java.lang.String r1 = r11.f12136
            int r2 = r1.length()
            if (r2 != 0) goto L57
            java.lang.String r1 = r10.f12136
        L57:
            r8 = r1
            if (r0 != 0) goto L5c
            java.lang.String r0 = r10.f12137
        L5c:
            r9 = r0
            long r0 = r10.f12138
            long r10 = r11.f12138
            long r3 = java.lang.Math.min(r0, r10)
            xd0 r2 = new xd0
            r2.<init>(r3, r5, r6, r7, r8, r9)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final synchronized java.util.List m6609() {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = m6607()     // Catch: java.lang.Throwable -> L1d
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference r0 = p000.xc0.f12129     // Catch: java.lang.Throwable -> L1d
            wc0 r1 = new wc0     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = ""
            kz r3 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L1d
            r0.set(r1)     // Catch: java.lang.Throwable -> L1d
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r0
        L1d:
            r0 = move-exception
            goto L59
        L1f:
            java.util.concurrent.atomic.AtomicReference r1 = p000.xc0.f12129     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L1d
            wc0 r2 = (p000.wc0) r2     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r2.f11674     // Catch: java.lang.Throwable -> L1d
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L3d
            wc0 r2 = new wc0     // Catch: java.lang.Throwable -> L1d
            kz r3 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L1d
            r1.set(r2)     // Catch: java.lang.Throwable -> L1d
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r0
        L3d:
            java.util.Map r0 = r2.f11675     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L1d
            qt r1 = new qt     // Catch: java.lang.Throwable -> L1d
            r2 = 22
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            ye r2 = new ye     // Catch: java.lang.Throwable -> L1d
            r3 = 10
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1d
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)
            return r0
        L59:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    /* JADX INFO: renamed from: δ */
    public final synchronized void m6610(java.util.List r11) {
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = m6607()     // Catch: java.lang.Throwable -> L3c
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto Lc
            goto L12
        Lc:
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L14
        L12:
            monitor-exit(r10)
            return
        L14:
            yc0 r1 = p000.yc0.f12575     // Catch: java.lang.Throwable -> L3c
            java.util.List r11 = r1.m6847(r11)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L3c
        L23:
            boolean r2 = r11.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> L3c
            r3 = r2
            xd0 r3 = (p000.xd0) r3     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r3.f12133     // Catch: java.lang.Throwable -> L3c
            boolean r3 = p000.ln0.m3626(r3, r0)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L23
            r1.add(r2)     // Catch: java.lang.Throwable -> L3c
            goto L23
        L3c:
            r11 = move-exception
            goto L188
        L3f:
            boolean r11 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L47
            monitor-exit(r10)
            return
        L47:
            java.util.concurrent.atomic.AtomicReference r11 = p000.xc0.f12129     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L3c
            r2 = r11
            wc0 r2 = (p000.wc0) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = r2.f11674     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L3c
            r3 = 0
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r11 = r3
        L5b:
            wc0 r11 = (p000.wc0) r11     // Catch: java.lang.Throwable -> L3c
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L64
            java.util.Map r11 = r11.f11675     // Catch: java.lang.Throwable -> L3c
            goto L65
        L64:
            r11 = r3
        L65:
            if (r11 != 0) goto L69
            kz r11 = p000.C0493kz.f6332     // Catch: java.lang.Throwable -> L3c
        L69:
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r11 = r1.iterator()     // Catch: java.lang.Throwable -> L3c
        L70:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L107
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L3c
            xd0 r1 = (p000.xd0) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Set r4 = r2.entrySet()     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L3c
        L89:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3c
            r6 = r5
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L3c
            r6.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L3c
            xd0 r6 = (p000.xd0) r6     // Catch: java.lang.Throwable -> L3c
            r6.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = r6.f12133     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r6.f12134     // Catch: java.lang.Throwable -> L3c
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L3c
            if (r7 <= 0) goto Lb6
            java.lang.String r6 = r6.f12133     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = r1.f12133     // Catch: java.lang.Throwable -> L3c
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto Lc6
        Lb6:
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L3c
            if (r6 <= 0) goto L89
            java.lang.String r6 = r1.f12134     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r8.equals(r6)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L89
            goto Lc6
        Lc5:
            r5 = r3
        Lc6:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto Ld1
            java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> L3c
            r2.remove(r4)     // Catch: java.lang.Throwable -> L3c
        Ld1:
            if (r5 == 0) goto Ldf
            java.lang.Object r4 = r5.getValue()     // Catch: java.lang.Throwable -> L3c
            xd0 r4 = (p000.xd0) r4     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto Ldf
            xd0 r1 = m6608(r4, r1)     // Catch: java.lang.Throwable -> L3c
        Ldf:
            java.lang.String r4 = r1.f12133     // Catch: java.lang.Throwable -> L3c
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto Le8
            goto Le9
        Le8:
            r4 = r3
        Le9:
            if (r4 == 0) goto Lf2
            java.lang.String r5 = "uid:"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L3c
            goto L102
        Lf2:
            java.lang.String r4 = r1.f12134     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "sec:"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3c
            r5.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3c
        L102:
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L3c
            goto L70
        L107:
            int r11 = r2.size()     // Catch: java.lang.Throwable -> L3c
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r11 <= r1) goto L16c
            java.util.Set r11 = r2.entrySet()     // Catch: java.lang.Throwable -> L3c
            r11.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L3c
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L124
            r1 = r3
            goto L15b
        L124:
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r4 != 0) goto L12f
            goto L15b
        L12f:
            r4 = r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L3c
            xd0 r4 = (p000.xd0) r4     // Catch: java.lang.Throwable -> L3c
            long r4 = r4.f12138     // Catch: java.lang.Throwable -> L3c
        L13d:
            java.lang.Object r6 = r11.next()     // Catch: java.lang.Throwable -> L3c
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L3c
            r7.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L3c
            xd0 r7 = (p000.xd0) r7     // Catch: java.lang.Throwable -> L3c
            long r7 = r7.f12138     // Catch: java.lang.Throwable -> L3c
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L155
            r1 = r6
            r4 = r7
        L155:
            boolean r6 = r11.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L13d
        L15b:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L16c
            java.lang.Object r11 = r1.getKey()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L168
            goto L16c
        L168:
            r2.remove(r11)     // Catch: java.lang.Throwable -> L3c
            goto L107
        L16c:
            java.lang.String r11 = m6607()     // Catch: java.lang.Throwable -> L3c
            boolean r11 = r11.equals(r0)     // Catch: java.lang.Throwable -> L3c
            if (r11 != 0) goto L178
            monitor-exit(r10)
            return
        L178:
            java.util.concurrent.atomic.AtomicReference r11 = p000.xc0.f12129     // Catch: java.lang.Throwable -> L3c
            wc0 r1 = new wc0     // Catch: java.lang.Throwable -> L3c
            java.util.Map r2 = p000.ex0.m1975(r2)     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L3c
            r11.set(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r10)
            return
        L188:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3c
            throw r11
    }
}
