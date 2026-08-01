package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ln0 {

    /* JADX INFO: renamed from: α */
    public static final p000.C0833tf f6714 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.C0615o9 f6715 = null;

    /* JADX INFO: renamed from: γ */
    public static final p000.C1068zr f6716 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.Object f6717 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f6718 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.rk0 f6719 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.rk0 f6720 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.rk0 f6721 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.C0889uy f6722 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.C0889uy f6723 = null;

    static {
            tf r0 = new tf
            r1 = 23
            r0.<init>(r1)
            p000.ln0.f6714 = r0
            o9 r0 = new o9
            r1 = 3
            r0.<init>(r1)
            p000.ln0.f6715 = r0
            zr r0 = new zr
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            p000.ln0.f6716 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.ln0.f6717 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.ln0.f6718 = r0
            rk0 r0 = new rk0
            r1 = 23
            r0.<init>(r1)
            p000.ln0.f6719 = r0
            rk0 r0 = new rk0
            r1 = 24
            r0.<init>(r1)
            p000.ln0.f6720 = r0
            rk0 r0 = new rk0
            r1 = 25
            r0.<init>(r1)
            p000.ln0.f6721 = r0
            uy r0 = new uy
            java.lang.String r1 = "NONE"
            r2 = 1
            r0.<init>(r1, r2)
            p000.ln0.f6722 = r0
            uy r0 = new uy
            java.lang.String r1 = "PENDING"
            r0.<init>(r1, r2)
            p000.ln0.f6723 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static p000.vc1 m3594(long r9) {
            java.util.Set r0 = p000.bd1.f1661
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            xn0 r1 = p000.xn0.f12234
            java.util.List r1 = r1.m6761()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            vc1 r2 = (p000.vc1) r2
            java.lang.String r3 = r2.m6173()
            r0.put(r3, r2)
            goto L11
        L25:
            java.util.concurrent.ConcurrentHashMap r1 = p000.bd1.f1664
            java.util.Collection r1 = r1.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            vc1 r2 = (p000.vc1) r2
            java.lang.String r3 = r2.m6173()
            java.util.Set r4 = p000.bd1.f1661
            java.lang.String r4 = r2.m6173()
            java.lang.Object r4 = r0.get(r4)
            vc1 r4 = (p000.vc1) r4
            vc1 r2 = p000.bd1.m923(r2, r4)
            r0.put(r3, r2)
            goto L34
        L58:
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            ib1 r1 = new ib1
            r2 = 2
            r1.<init>(r2)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r0.next()
            r3 = r2
            vc1 r3 = (p000.vc1) r3
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            java.util.Map r2 = r3.f11233
            r4.<init>(r2)
            r7 = 0
            r8 = 123(0x7b, float:1.72E-43)
            r5 = 0
            r6 = 0
            vc1 r2 = p000.vc1.m6172(r3, r4, r5, r6, r7, r8)
            r1.add(r2)
            goto L7a
        L9b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        La4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r1.next()
            r3 = r2
            vc1 r3 = (p000.vc1) r3
            java.lang.Long r4 = r3.f11235
            java.util.Map r5 = r3.f11233
            if (r4 != 0) goto Lb8
            goto La4
        Lb8:
            long r6 = r4.longValue()
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 != 0) goto La4
            java.lang.String r4 = "Agw-Js-Conv"
            java.lang.Object r4 = r5.get(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto La4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto Ld1
            goto La4
        Ld1:
            uc1 r3 = r3.f11232
            uc1 r4 = p000.uc1.f10693
            if (r3 != r4) goto Le8
            java.lang.String r3 = "X-Hamlet-Is-Unity"
            java.lang.Object r3 = r5.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto La4
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto Le8
            goto La4
        Le8:
            r0.add(r2)
            goto La4
        Lec:
            uh0 r9 = new uh0
            r10 = 28
            r9.<init>(r10)
            ye r1 = new ye
            r1.<init>(r10, r9)
            java.lang.Object r9 = p000.AbstractC0984xh.m6648(r0, r1)
            vc1 r9 = (p000.vc1) r9
            return r9
    }

    /* JADX INFO: renamed from: Β */
    public static final int m3595(int r4, java.util.List r5) {
            int r0 = r5.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r1 > r0) goto L24
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r5.get(r2)
            rn0 r3 = (p000.rn0) r3
            int r3 = r3.f9418
            int r3 = m3632(r3, r4)
            if (r3 >= 0) goto L1e
            int r1 = r2 + 1
            goto L7
        L1e:
            if (r3 <= 0) goto L23
            int r0 = r2 + (-1)
            goto L7
        L23:
            return r2
        L24:
            int r1 = r1 + 1
            int r4 = -r1
            return r4
    }

    /* JADX INFO: renamed from: Γ */
    public static final java.lang.Integer m3596(p000.nw1 r5, p000.AbstractC0878un r6, int r7, int r8) {
            int[] r0 = r5.f7798
        L2:
            r1 = 0
            if (r7 >= r8) goto L68
            int r2 = r7 * 5
            int r2 = r2 + 3
            r2 = r0[r2]
            int r2 = r2 + r7
            boolean r3 = r5.m4105(r7)
            if (r3 == 0) goto L4f
            int r3 = r5.m4104(r7)
            r4 = 206(0xce, float:2.89E-43)
            if (r3 != r4) goto L4f
            java.lang.Object r3 = r5.m4111(r7, r0)
            i51 r4 = p000.AbstractC0804sn.f9972
            boolean r3 = m3626(r3, r4)
            if (r3 == 0) goto L4f
            r3 = 0
            java.lang.Object r3 = r5.m4103(r7, r3)
            boolean r4 = r3 instanceof p000.a90
            if (r4 == 0) goto L32
            a90 r3 = (p000.a90) r3
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            fn1 r3 = r3.f145
            goto L39
        L38:
            r3 = r1
        L39:
            boolean r4 = r3 instanceof p000.s80
            if (r4 == 0) goto L40
            r1 = r3
            s80 r1 = (p000.s80) r1
        L40:
            if (r1 == 0) goto L4f
            t80 r1 = r1.f9763
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            return r5
        L4f:
            boolean r1 = r5.m4099(r7)
            if (r1 == 0) goto L66
            int r7 = r7 + 1
            java.lang.Integer r7 = m3596(r5, r6, r7, r2)
            if (r7 == 0) goto L66
            int r5 = r7.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L66:
            r7 = r2
            goto L2
        L68:
            return r1
    }

    /* JADX INFO: renamed from: Δ */
    public static final p000.ml1 m3597(p000.c50 r4) {
            boolean r0 = r4.f8784
            if (r0 != 0) goto L5
            goto L3b
        L5:
            q31 r0 = r4.f8778
            if (r0 == 0) goto L3b
            mp0 r0 = p000.AbstractC0782s1.m5332(r0)
            boolean r1 = r0.mo2331()
            if (r1 == 0) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L18
            goto L3b
        L18:
            z40 r1 = r4.m1135()
            ml1 r1 = r1.f12969
            ml1 r2 = p000.C0966x.f11931
            if (r1 == r2) goto L31
            q31 r4 = p000.h62.m2444(r4)
            r2 = 0
            long r2 = r0.mo2332(r4, r2)
            ml1 r4 = r1.m3870(r2)
            return r4
        L31:
            q31 r4 = p000.h62.m2444(r4)
            r1 = 0
            ml1 r4 = r0.mo2337(r4, r1)
            return r4
        L3b:
            ml1 r4 = p000.ml1.f7199
            return r4
    }

    /* JADX INFO: renamed from: Ε */
    public static final p000.c50 m3598(p000.c50 r8) {
            q01 r0 = r8.f8771
            boolean r0 = r0.f8784
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            p000.am0.m178(r0)
        L10:
            k21 r0 = new k21
            r2 = 16
            q01[] r3 = new p000.q01[r2]
            r0.<init>(r3)
            q01 r8 = r8.f8771
            q01 r3 = r8.f8776
            if (r3 != 0) goto L23
            p000.h62.m2386(r0, r8)
            goto L26
        L23:
            r0.m3127(r3)
        L26:
            int r8 = r0.f5718
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.m3136(r8)
            q01 r8 = (p000.q01) r8
            int r3 = r8.f8774
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            p000.h62.m2386(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f8773
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof p000.c50
            r5 = 1
            if (r4 == 0) goto L6c
            c50 r8 = (p000.c50) r8
            q01 r4 = r8.f8771
            boolean r4 = r4.f8784
            if (r4 == 0) goto La2
            b50 r4 = r8.m1137()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            p000.C1080.m7272()
            r8 = 0
        L6b:
            return r8
        L6c:
            int r4 = r8.f8773
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof p000.C1014ya
            if (r4 == 0) goto La2
            r4 = r8
            ya r4 = (p000.C1014ya) r4
            q01 r4 = r4.f12512
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.f8773
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            k21 r3 = new k21
            q01[] r7 = new p000.q01[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.m3127(r8)
            r8 = r1
        L99:
            r3.m3127(r4)
        L9c:
            q01 r4 = r4.f8776
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            q01 r8 = p000.h62.m2387(r3)
            goto L45
        La7:
            q01 r8 = r8.f8776
            goto L3c
        Laa:
            return r1
    }

    /* JADX INFO: renamed from: Ζ */
    public static final p000.C0945wf m3599(java.lang.annotation.Annotation r0) {
            r0.getClass()
            java.lang.Class r0 = r0.annotationType()
            r0.getClass()
            wf r0 = p000.vm1.m6272(r0)
            return r0
    }

    /* JADX INFO: renamed from: Η */
    public static android.content.res.ColorStateList m3600(android.content.Context r8, int r9) {
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            vn1 r1 = new vn1
            r1.<init>(r0, r8)
            java.lang.Object r2 = p000.wn1.f11770
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p000.wn1.f11769     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            un1 r5 = (p000.un1) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f10916     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f10917     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f10917     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f10915     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p000.wn1.f11768
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p000.AbstractC0587ni.m4069(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p000.wn1.f11770
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p000.wn1.f11769     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            un1 r0 = new un1     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f11353     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    /* JADX INFO: renamed from: Θ */
    public static final java.lang.String[] m3601(p000.InterfaceC0520lp r1) {
            r1.getClass()
            b2 r1 = (p000.C0062b2) r1
            java.util.Set r1 = r1.f1421
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    /* JADX INFO: renamed from: Ι */
    public static p000.av0 m3602() {
            m6 r0 = p000.ih1.f5090
            r0.getClass()
            android.os.LocaleList r1 = android.os.LocaleList.getDefault()
            java.lang.Object r2 = r0.f6969
            zz1 r2 = (p000.zz1) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f6968     // Catch: java.lang.Throwable -> L37
            av0 r3 = (p000.av0) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L1c
            java.lang.Object r4 = r0.f6967     // Catch: java.lang.Throwable -> L37
            android.os.LocaleList r4 = (android.os.LocaleList) r4     // Catch: java.lang.Throwable -> L37
            if (r1 != r4) goto L1c
            monitor-exit(r2)
            return r3
        L1c:
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L37
            r5 = 0
        L26:
            if (r5 >= r3) goto L39
            zu0 r6 = new zu0     // Catch: java.lang.Throwable -> L37
            java.util.Locale r7 = r1.get(r5)     // Catch: java.lang.Throwable -> L37
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L37
            r4.add(r6)     // Catch: java.lang.Throwable -> L37
            int r5 = r5 + 1
            goto L26
        L37:
            r0 = move-exception
            goto L44
        L39:
            av0 r3 = new av0     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            r0.f6967 = r1     // Catch: java.lang.Throwable -> L37
            r0.f6968 = r3     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r3
        L44:
            monitor-exit(r2)
            throw r0
    }

    /* JADX INFO: renamed from: Κ */
    public static android.graphics.drawable.Drawable m3603(android.content.Context r1, int r2) {
            tn1 r0 = p000.tn1.m5720()
            android.graphics.drawable.Drawable r1 = r0.m5724(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: Λ */
    public static final java.lang.Class m3604(p000.C0945wf r0) {
            java.lang.Class r0 = r0.mo50()
            r0.getClass()
            return r0
    }

    /* JADX INFO: renamed from: Μ */
    public static final java.lang.Class m3605(p000.C0945wf r2) {
            r2.getClass()
            vf r2 = (p000.InterfaceC0907vf) r2
            java.lang.Class r2 = r2.mo50()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L11
            goto L86
        L11:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L7e;
                case 104431: goto L72;
                case 3039496: goto L66;
                case 3052374: goto L5a;
                case 3327612: goto L4e;
                case 3625364: goto L42;
                case 64711720: goto L36;
                case 97526364: goto L2a;
                case 109413500: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L86
        L1e:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L86
        L27:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            return r2
        L2a:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L33
            goto L86
        L33:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            return r2
        L36:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L86
        L3f:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            return r2
        L42:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4b
            goto L86
        L4b:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            return r2
        L4e:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L57
            goto L86
        L57:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            return r2
        L5a:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L86
        L63:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            return r2
        L66:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6f
            goto L86
        L6f:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            return r2
        L72:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            goto L86
        L7b:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            return r2
        L7e:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L87
        L86:
            return r2
        L87:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            return r2
    }

    /* JADX INFO: renamed from: Ν */
    public static final p000.fq1 m3606(p000.r92 r3) {
            cq1 r0 = new cq1
            r0.<init>()
            boolean r1 = r3 instanceof p000.sc0
            if (r1 == 0) goto L11
            r1 = r3
            sc0 r1 = (p000.sc0) r1
            k11 r1 = r1.mo190()
            goto L13
        L11:
            gq r1 = p000.C0331gq.f4429
        L13:
            r1.getClass()
            q92 r3 = r3.mo191()
            r3.getClass()
            i0 r2 = new i0
            r2.<init>(r3, r0, r1)
            java.lang.Class<fq1> r3 = p000.fq1.class
            wf r3 = p000.vm1.m6272(r3)
            java.lang.String r0 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            m92 r3 = r2.m2574(r3, r0)
            fq1 r3 = (p000.fq1) r3
            return r3
    }

    /* JADX INFO: renamed from: Ξ */
    public static final float[] m3607(float[] r24) {
            r0 = r24
            r1 = 0
            r2 = r0[r1]
            r3 = 3
            r4 = r0[r3]
            r5 = 6
            r6 = r0[r5]
            r7 = 1
            r8 = r0[r7]
            r9 = 4
            r10 = r0[r9]
            r11 = 7
            r12 = r0[r11]
            r13 = 2
            r14 = r0[r13]
            r15 = 5
            r16 = r0[r15]
            r17 = 8
            r18 = r0[r17]
            float r19 = r10 * r18
            float r20 = r12 * r16
            float r19 = r19 - r20
            float r20 = r12 * r14
            float r21 = r8 * r18
            float r20 = r20 - r21
            float r21 = r8 * r16
            float r22 = r10 * r14
            float r21 = r21 - r22
            float r22 = r2 * r19
            float r23 = r4 * r20
            float r23 = r23 + r22
            float r22 = r6 * r21
            float r22 = r22 + r23
            int r0 = r0.length
            float[] r0 = new float[r0]
            float r19 = r19 / r22
            r0[r1] = r19
            float r20 = r20 / r22
            r0[r7] = r20
            float r21 = r21 / r22
            r0[r13] = r21
            float r1 = r6 * r16
            float r7 = r4 * r18
            float r1 = r1 - r7
            float r1 = r1 / r22
            r0[r3] = r1
            float r18 = r18 * r2
            float r1 = r6 * r14
            float r18 = r18 - r1
            float r18 = r18 / r22
            r0[r9] = r18
            float r14 = r14 * r4
            float r16 = r16 * r2
            float r14 = r14 - r16
            float r14 = r14 / r22
            r0[r15] = r14
            float r1 = r4 * r12
            float r3 = r6 * r10
            float r1 = r1 - r3
            float r1 = r1 / r22
            r0[r5] = r1
            float r6 = r6 * r8
            float r12 = r12 * r2
            float r6 = r6 - r12
            float r6 = r6 / r22
            r0[r11] = r6
            float r2 = r2 * r10
            float r4 = r4 * r8
            float r2 = r2 - r4
            float r2 = r2 / r22
            r0[r17] = r2
            return r0
    }

    /* JADX INFO: renamed from: Ο */
    public static boolean m3608(java.lang.String r2) {
            java.lang.String r0 = "dyhelper_prefs"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_prefs_meta"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_beta"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_spark_records"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dy_titlebar_hidden_buttons"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_prefs_uid_"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_beta_uid_"
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 != 0) goto L43
            java.lang.String r0 = "dyhelper_"
            boolean r2 = p000.x02.m6485(r2, r0, r1)
            if (r2 == 0) goto L42
            goto L43
        L42:
            return r1
        L43:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: Π */
    public static final boolean m3609(p000.c50 r2) {
            q31 r0 = r2.f8778
            if (r0 == 0) goto L1e
            yp0 r0 = r0.f8839
            if (r0 == 0) goto L1e
            boolean r0 = r0.m6978()
            r1 = 1
            if (r0 != r1) goto L1e
            q31 r2 = r2.f8778
            if (r2 == 0) goto L1e
            yp0 r2 = r2.f8839
            if (r2 == 0) goto L1e
            boolean r2 = r2.m6977()
            if (r2 != r1) goto L1e
            return r1
        L1e:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Ρ */
    public static p000.xz1 m3610(p000.InterfaceC0086bq r2, p000.InterfaceC0880up r3, p000.e80 r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            hz r3 = p000.C0377hz.f4846
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Ld
            eq r5 = p000.EnumC0257eq.f3631
            goto Lf
        Ld:
            eq r5 = p000.EnumC0257eq.f3634
        Lf:
            up r2 = r2.mo993()
            r0 = 1
            up r2 = p000.AbstractC0782s1.m5333(r2, r3, r0)
            jr r3 = p000.AbstractC0524lt.f6767
            if (r2 == r3) goto L28
            x r1 = p000.C0966x.f11916
            sp r1 = r2.mo1785(r1)
            if (r1 != 0) goto L28
            up r2 = r2.mo1784(r3)
        L28:
            eq r3 = p000.EnumC0257eq.f3632
            if (r5 != r3) goto L32
            pq0 r3 = new pq0
            r3.<init>(r2, r4)
            goto L37
        L32:
            xz1 r3 = new xz1
            r3.<init>(r2, r0)
        L37:
            r3.m7284(r5, r3, r4)
            return r3
    }

    /* JADX INFO: renamed from: Σ */
    public static p000.oq0 m3611(p000.qq0 r2, p000.p70 r3) {
            xn0 r0 = p000.xn0.f12222
            int r2 = r2.ordinal()
            if (r2 == 0) goto L27
            r1 = 1
            if (r2 == r1) goto L1d
            r1 = 2
            if (r2 != r1) goto L18
            w62 r2 = new w62
            r2.<init>()
            r2.f11589 = r3
            r2.f11590 = r0
            return r2
        L18:
            p000.C1080.m7272()
            r2 = 0
            return r2
        L1d:
            vp1 r2 = new vp1
            r2.<init>()
            r2.f11360 = r3
            r2.f11361 = r0
            return r2
        L27:
            h22 r2 = new h22
            r2.<init>(r3)
            return r2
    }

    /* JADX INFO: renamed from: Τ */
    public static p000.h22 m3612(p000.p70 r1) {
            r1.getClass()
            h22 r0 = new h22
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: Υ */
    public static int m3613(int r1, int r2, int r3) {
            r2 = r2 & 8
            if (r2 == 0) goto L6
            int r1 = r1 + (-1)
        L6:
            if (r3 > r1) goto La
            int r1 = r1 - r3
            return r1
        La:
            java.lang.String r2 = "PROTOCOL_ERROR padding "
            java.lang.String r0 = " > remaining length "
            java.lang.String r1 = p000.AbstractC0602nx.m4125(r3, r1, r2, r0)
            p000.C1080.m7281(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: Φ */
    public static final float[] m3614(float[] r21, float[] r22) {
            r0 = r21
            r1 = r22
            r2 = 9
            float[] r3 = new float[r2]
            int r4 = r0.length
            if (r4 >= r2) goto Lc
            goto Lf
        Lc:
            int r4 = r1.length
            if (r4 >= r2) goto L10
        Lf:
            return r3
        L10:
            r2 = 0
            r4 = r0[r2]
            r5 = r1[r2]
            float r4 = r4 * r5
            r5 = 3
            r6 = r0[r5]
            r7 = 1
            r8 = r1[r7]
            float r9 = r6 * r8
            float r9 = r9 + r4
            r4 = 6
            r10 = r0[r4]
            r11 = 2
            r12 = r1[r11]
            float r13 = r10 * r12
            float r13 = r13 + r9
            r3[r2] = r13
            r9 = r0[r7]
            r13 = r1[r2]
            float r9 = r9 * r13
            r14 = 4
            r15 = r0[r14]
            float r8 = r8 * r15
            float r8 = r8 + r9
            r9 = 7
            r16 = r0[r9]
            float r17 = r16 * r12
            float r17 = r17 + r8
            r3[r7] = r17
            r8 = r0[r11]
            float r8 = r8 * r13
            r13 = 5
            r17 = r0[r13]
            r18 = r1[r7]
            float r18 = r18 * r17
            float r18 = r18 + r8
            r8 = 8
            r19 = r0[r8]
            float r12 = r12 * r19
            float r12 = r12 + r18
            r3[r11] = r12
            r2 = r0[r2]
            r12 = r1[r5]
            float r12 = r12 * r2
            r18 = r1[r14]
            float r6 = r6 * r18
            float r6 = r6 + r12
            r12 = r1[r13]
            float r20 = r10 * r12
            float r20 = r20 + r6
            r3[r5] = r20
            r6 = r0[r7]
            r7 = r1[r5]
            float r20 = r6 * r7
            float r15 = r15 * r18
            float r15 = r15 + r20
            float r18 = r16 * r12
            float r18 = r18 + r15
            r3[r14] = r18
            r11 = r0[r11]
            float r7 = r7 * r11
            r15 = r1[r14]
            float r17 = r17 * r15
            float r17 = r17 + r7
            float r12 = r12 * r19
            float r12 = r12 + r17
            r3[r13] = r12
            r7 = r1[r4]
            float r2 = r2 * r7
            r5 = r0[r5]
            r7 = r1[r9]
            float r5 = r5 * r7
            float r5 = r5 + r2
            r2 = r1[r8]
            float r10 = r10 * r2
            float r10 = r10 + r5
            r3[r4] = r10
            r4 = r1[r4]
            float r6 = r6 * r4
            r5 = r0[r14]
            float r5 = r5 * r7
            float r5 = r5 + r6
            float r16 = r16 * r2
            float r16 = r16 + r5
            r3[r9] = r16
            float r11 = r11 * r4
            r0 = r0[r13]
            r1 = r1[r9]
            float r0 = r0 * r1
            float r0 = r0 + r11
            float r19 = r19 * r2
            float r19 = r19 + r0
            r3[r8] = r19
            return r3
    }

    /* JADX INFO: renamed from: Χ */
    public static final float[] m3615(float[] r8, float[] r9) {
            int r0 = r8.length
            r1 = 9
            if (r0 >= r1) goto L6
            goto La
        L6:
            int r0 = r9.length
            r1 = 3
            if (r0 >= r1) goto Lb
        La:
            return r9
        Lb:
            r0 = 0
            r2 = r9[r0]
            r3 = 1
            r4 = r9[r3]
            r5 = 2
            r6 = r9[r5]
            r7 = r8[r0]
            float r7 = r7 * r2
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r7
            r7 = 6
            r7 = r8[r7]
            float r7 = r7 * r6
            float r7 = r7 + r1
            r9[r0] = r7
            r0 = r8[r3]
            float r0 = r0 * r2
            r1 = 4
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r0
            r0 = 7
            r0 = r8[r0]
            float r0 = r0 * r6
            float r0 = r0 + r1
            r9[r3] = r0
            r0 = r8[r5]
            float r0 = r0 * r2
            r1 = 5
            r1 = r8[r1]
            float r1 = r1 * r4
            float r1 = r1 + r0
            r0 = 8
            r8 = r8[r0]
            float r8 = r8 * r6
            float r8 = r8 + r1
            r9[r5] = r8
            return r9
    }

    /* JADX INFO: renamed from: Ψ */
    public static java.lang.String m3616(java.lang.String r2) {
            r2.getClass()
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "//"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "https:"
            java.lang.String r2 = r0.concat(r2)
        L1a:
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: Ω */
    public static java.lang.String m3617(java.lang.String r2) {
            r2.getClass()
            java.lang.String r2 = m3616(r2)
            java.lang.String r0 = "#"
            java.lang.String r2 = p000.q02.m4690(r2, r0, r2)
            java.lang.String r0 = "?"
            java.lang.String r2 = p000.q02.m4690(r2, r0, r2)
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
        L1b:
            java.lang.String r0 = "/"
            r1 = 0
            boolean r0 = p000.x02.m6479(r2, r0, r1)
            if (r0 == 0) goto L29
            java.lang.String r2 = p000.q02.m4656(r2)
            goto L1b
        L29:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = p000.AbstractC0602nx.m4134(r0, r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: α */
    public static final void m3618(java.lang.String r16, p000.r01 r17, p000.w32 r18, int r19, boolean r20, int r21, int r22, p000.v80 r23, int r24, int r25) {
            r0 = r23
            r8 = r24
            r1 = -1040751001(0xffffffffc1f76667, float:-30.925001)
            r0.m6083(r1)
            r12 = r16
            boolean r1 = r0.m6090(r12)
            r2 = 4
            if (r1 == 0) goto L15
            r1 = r2
            goto L16
        L15:
            r1 = 2
        L16:
            r1 = r1 | r8
            r3 = r25 & 2
            if (r3 == 0) goto L20
            r1 = r1 | 48
        L1d:
            r4 = r17
            goto L32
        L20:
            r4 = r8 & 48
            if (r4 != 0) goto L1d
            r4 = r17
            boolean r5 = r0.m6090(r4)
            if (r5 == 0) goto L2f
            r5 = 32
            goto L31
        L2f:
            r5 = 16
        L31:
            r1 = r1 | r5
        L32:
            r5 = r8 & 384(0x180, float:5.38E-43)
            r10 = r18
            if (r5 != 0) goto L44
            boolean r5 = r0.m6090(r10)
            if (r5 == 0) goto L41
            r5 = 256(0x100, float:3.59E-43)
            goto L43
        L41:
            r5 = 128(0x80, float:1.8E-43)
        L43:
            r1 = r1 | r5
        L44:
            r5 = r1 | 3072(0xc00, float:4.305E-42)
            r6 = r25 & 16
            if (r6 == 0) goto L4f
            r5 = r1 | 27648(0x6c00, float:3.8743E-41)
        L4c:
            r1 = r19
            goto L61
        L4f:
            r1 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L4c
            r1 = r19
            boolean r7 = r0.m6089(r1)
            if (r7 == 0) goto L5e
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L60
        L5e:
            r7 = 8192(0x2000, float:1.148E-41)
        L60:
            r5 = r5 | r7
        L61:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 | r5
            r9 = r25 & 64
            if (r9 == 0) goto L6e
            r7 = 1769472(0x1b0000, float:2.479558E-39)
            r7 = r7 | r5
        L6b:
            r5 = r21
            goto L81
        L6e:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r8
            if (r5 != 0) goto L6b
            r5 = r21
            boolean r11 = r0.m6089(r5)
            if (r11 == 0) goto L7e
            r11 = 1048576(0x100000, float:1.469368E-39)
            goto L80
        L7e:
            r11 = 524288(0x80000, float:7.34684E-40)
        L80:
            r7 = r7 | r11
        L81:
            r11 = 918552576(0x36c00000, float:5.722046E-6)
            r7 = r7 | r11
            r11 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r11 & r7
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 0
            r15 = 1
            if (r11 == r13) goto L91
            r11 = r15
            goto L92
        L91:
            r11 = r14
        L92:
            r7 = r7 & r15
            boolean r7 = r0.m6075(r7, r11)
            if (r7 == 0) goto L1dc
            if (r3 == 0) goto L9e
            p01 r3 = p000.p01.f8378
            goto L9f
        L9e:
            r3 = r4
        L9f:
            if (r6 == 0) goto La3
            r6 = r15
            goto La4
        La3:
            r6 = r1
        La4:
            if (r9 == 0) goto Lab
            r1 = 2147483647(0x7fffffff, float:NaN)
            r7 = r1
            goto Lac
        Lab:
            r7 = r5
        Lac:
            if (r7 <= 0) goto Laf
            goto Lcd
        Laf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "both minLines "
            r1.<init>(r4)
            r1.append(r15)
            java.lang.String r4 = " and maxLines "
            r1.append(r4)
            r1.append(r7)
            java.lang.String r4 = " must be greater than zero"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            p000.dm0.m1779(r1)
        Lcd:
            if (r15 > r7) goto Ld0
            goto Le9
        Ld0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "minLines "
            r1.<init>(r4)
            r1.append(r15)
            java.lang.String r4 = " must be less than or equal to maxLines "
            r1.append(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            p000.dm0.m1779(r1)
        Le9:
            yx r1 = p000.vr1.f11372
            java.lang.Object r1 = r0.m6094(r1)
            if (r1 != 0) goto L1d8
            r1 = 356914239(0x1546143f, float:4.0001753E-26)
            r0.m6082(r1)
            r0.m6100(r14)
            m02 r1 = p000.AbstractC0292fo.f4039
            java.lang.Object r1 = r0.m6094(r1)
            r5 = r1
            f50 r5 = (p000.f50) r5
            m02 r1 = p000.AbstractC0938w8.f11601
            java.lang.Object r1 = r0.m6094(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            if (r1 == 0) goto L168
            int r4 = r12.length()
            r9 = 8
            if (r4 < r9) goto L168
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r4 >= r9) goto L168
            java.lang.Boolean r4 = p000.AbstractC0938w8.f11602
            if (r4 != 0) goto L130
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            int r4 = r4.availableProcessors()
            if (r4 < r2) goto L129
            r2 = r15
            goto L12a
        L129:
            r2 = r14
        L12a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            p000.AbstractC0938w8.f11602 = r2
        L130:
            java.lang.Boolean r2 = p000.AbstractC0938w8.f11602
            r2.getClass()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L168
            r2 = 1254298614(0x4ac313f6, float:6392315.0)
            r0.m6082(r2)
            m02 r2 = p000.AbstractC0292fo.f4042
            java.lang.Object r2 = r0.m6094(r2)
            r11 = r2
            np0 r11 = (p000.np0) r11
            m02 r2 = p000.AbstractC0292fo.f4036
            java.lang.Object r2 = r0.m6094(r2)
            r13 = r2
            yr r13 = (p000.InterfaceC1031yr) r13
            v8 r9 = new v8     // Catch: java.util.concurrent.RejectedExecutionException -> L161
            r2 = r15
            r15 = 0
            r4 = r2
            r2 = r14
            r14 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: java.util.concurrent.RejectedExecutionException -> L164
            r1.execute(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L164
            goto L164
        L161:
            r2 = r14
            r4 = r15
            r14 = r5
        L164:
            r0.m6100(r2)
            goto L174
        L168:
            r2 = r14
            r4 = r15
            r14 = r5
            r1 = 1255914055(0x4adbba47, float:7200035.5)
            r0.m6082(r1)
            r0.m6100(r2)
        L174:
            r1 = 357875859(0x1554c093, float:4.2964973E-26)
            r0.m6082(r1)
            r0.m6100(r2)
            s32 r2 = new s32
            r1 = r3
            r9 = r4
            r5 = r14
            r3 = r16
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r01 r2 = r1.mo4345(r2)
            dc r3 = p000.C0207dc.f3048
            long r4 = r0.f11155
            int r4 = java.lang.Long.hashCode(r4)
            r01 r2 = p000.pd2.m4459(r0, r2)
            androidx.compose.runtime.internal.α r5 = r0.m6096()
            kn r10 = p000.InterfaceC0518ln.f6713
            r10.getClass()
            u40 r10 = p000.C0475kn.f6034
            r0.m6084()
            boolean r11 = r0.f11154
            if (r11 == 0) goto L1af
            r0.m6095(r10)
            goto L1b2
        L1af:
            r0.m6118()
        L1b2:
            ui r10 = p000.C0475kn.f6037
            p000.e81.m1887(r10, r0, r3)
            ui r3 = p000.C0475kn.f6036
            p000.e81.m1887(r3, r0, r5)
            a1 r3 = p000.C0475kn.f6039
            p000.e81.m1884(r0, r3)
            ui r3 = p000.C0475kn.f6035
            p000.e81.m1887(r3, r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            ui r3 = p000.C0475kn.f6038
            p000.e81.m1887(r3, r0, r2)
            r0.m6100(r9)
            r2 = r1
            r4 = r6
            r6 = r7
            r5 = r9
            r7 = r5
            goto L1e6
        L1d8:
            p000.C1080.m7264()
            return
        L1dc:
            r0.m6078()
            r7 = r22
            r2 = r4
            r6 = r5
            r5 = r20
            r4 = r1
        L1e6:
            bl1 r10 = r0.m6101()
            if (r10 == 0) goto L1f9
            u8 r0 = new u8
            r1 = r16
            r3 = r18
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f1780 = r0
        L1f9:
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.C0942wc m3619(int r2, p000.EnumC0867uc r3, int r4) {
            r4 = r4 & 2
            uc r0 = p000.EnumC0867uc.f10687
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            r4 = -2
            r1 = 1
            if (r2 == r4) goto L49
            r4 = -1
            if (r2 == r4) goto L38
            if (r2 == 0) goto L29
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L23
            if (r3 != r0) goto L1d
            wc r3 = new wc
            r3.<init>(r2)
            return r3
        L1d:
            ko r4 = new ko
            r4.<init>(r2, r3)
            return r4
        L23:
            wc r2 = new wc
            r2.<init>(r4)
            return r2
        L29:
            if (r3 != r0) goto L32
            wc r2 = new wc
            r3 = 0
            r2.<init>(r3)
            return r2
        L32:
            ko r2 = new ko
            r2.<init>(r1, r3)
            return r2
        L38:
            if (r3 != r0) goto L42
            ko r2 = new ko
            uc r3 = p000.EnumC0867uc.f10688
            r2.<init>(r1, r3)
            return r2
        L42:
            java.lang.String r2 = "CONFLATED capacity cannot be used with non-default onBufferOverflow"
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
        L49:
            if (r3 != r0) goto L58
            wc r2 = new wc
            le r3 = p000.InterfaceC0546me.f7096
            r3.getClass()
            int r3 = p000.C0509le.f6583
            r2.<init>(r3)
            return r2
        L58:
            ko r2 = new ko
            r2.<init>(r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static final p000.C0062b2 m3620(java.lang.String r1) {
            b2 r0 = new b2
            java.util.Set r1 = p000.g81.m2288(r1)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final p000.f02 m3621(java.lang.Object r1) {
            f02 r0 = new f02
            if (r1 != 0) goto L6
            uy r1 = p000.AbstractC0978xb.f12108
        L6:
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static final void m3622(java.util.List r1, int r2, int r3) {
            int r2 = m3595(r2, r1)
            if (r2 >= 0) goto L9
            int r2 = r2 + 1
            int r2 = -r2
        L9:
            int r0 = r1.size()
            if (r2 >= r0) goto L20
            java.lang.Object r0 = r1.get(r2)
            rn0 r0 = (p000.rn0) r0
            int r0 = r0.f9418
            if (r0 >= r3) goto L20
            java.lang.Object r0 = r1.remove(r2)
            rn0 r0 = (p000.rn0) r0
            goto L9
        L20:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.AbstractC0432ji m3623(p000.AbstractC0432ji r11) {
            nb2 r3 = p000.AbstractC0782s1.f9645
            long r0 = r11.f5475
            long r4 = p000.AbstractC0213di.f3165
            boolean r0 = p000.AbstractC0213di.m1746(r0, r4)
            if (r0 == 0) goto L46
            r0 = r11
            po1 r0 = (p000.po1) r0
            nb2 r1 = r0.f8625
            boolean r2 = m3634(r1, r3)
            if (r2 == 0) goto L18
            goto L46
        L18:
            float[] r11 = r3.m4018()
            n r2 = p000.C0568n.f7334
            java.lang.Object r2 = r2.f7336
            float[] r2 = (float[]) r2
            float[] r1 = r1.m4018()
            float[] r11 = m3630(r2, r1, r11)
            float[] r1 = r0.f8630
            float[] r4 = m3614(r11, r1)
            r11 = r0
            po1 r0 = new po1
            java.lang.String r1 = r11.f5474
            float[] r2 = r11.f8629
            du r5 = r11.f8632
            du r6 = r11.f8635
            float r7 = r11.f8626
            float r8 = r11.f8627
            q52 r9 = r11.f8628
            r10 = -1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L46:
            return r11
    }

    /* JADX INFO: renamed from: η */
    public static void m3624(java.lang.Throwable r2, java.lang.Throwable r3) {
            r2.getClass()
            r3.getClass()
            if (r2 == r3) goto L29
            java.lang.Integer r0 = p000.vn0.f11352
            if (r0 == 0) goto L17
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 == 0) goto L1e
            r2.addSuppressed(r3)
            return
        L1e:
            java.lang.reflect.Method r0 = p000.hh1.f4741
            if (r0 == 0) goto L29
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
        L29:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m3625(android.content.Context r3, android.widget.TextView r4) {
            xx r0 = p000.jx0.m3049(r3)
            r1 = 17
            r4.setGravity(r1)
            r1 = 0
            r4.setIncludeFontPadding(r1)
            boolean r1 = p000.jx0.m3017(r3)
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.f12355
            goto L18
        L16:
            java.lang.String r1 = r0.f12356
        L18:
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setTextColor(r1)
            java.lang.String r1 = r0.f12348
            java.lang.String r0 = r0.f12371
            r2 = 10
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r2, r3, r1, r0)
            r4.setBackground(r3)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m3626(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static final p000.r01 m3627(p000.r01 r1, long r2, p000.iv1 r4) {
            n8 r0 = new n8
            r0.<init>(r2, r4)
            r01 r1 = r1.mo4345(r0)
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static final java.util.List m3628(p000.rw1 r5, java.lang.Integer r6, int r7, java.lang.Integer r8) {
            boolean r0 = r5.f9560
            if (r0 != 0) goto L9d
            int r0 = r5.m5165()
            if (r0 == 0) goto L9d
            nk1 r0 = new nk1
            r0.<init>(r5)
            if (r8 == 0) goto L16
            int r8 = r8.intValue()
            goto L20
        L16:
            int r8 = r5.f9559
            if (r8 >= 0) goto L20
            int[] r8 = r5.f9539
            int r8 = r5.m5134(r7, r8)
        L20:
            if (r6 != 0) goto L44
            int r6 = r5.f9546
            int[] r1 = r5.f9539
            int r2 = r5.m5167(r7)
            int r1 = r5.m5143(r2, r1)
            int r6 = r6 - r1
            n11 r1 = r5.f9556
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.m5525(r7)
            v11 r1 = (p000.v11) r1
            if (r1 == 0) goto L3e
            int r1 = r1.f11065
            goto L3f
        L3e:
            r1 = 0
        L3f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L44:
            int r1 = r5.m5167(r7)
            int r1 = r1 * 5
            int[] r2 = r5.f9539
            int r3 = r2.length
            if (r1 >= r3) goto L54
            int r1 = r5.m5168(r7)
            goto L61
        L54:
            if (r8 < 0) goto L5b
            int r7 = r5.m5134(r8, r2)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            int r1 = r5.m5168(r8)
            goto L92
        L61:
            if (r7 < 0) goto L98
            int r2 = r5.m5167(r7)
            int[] r3 = r5.f9539
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            java.lang.Object r2 = r5.m5169(r7)
            goto L7b
        L79:
            i2 r2 = p000.C0730qn.f9051
        L7b:
            x80 r3 = r5.m5144(r7)
            r0.m2769(r1, r2, r3, r6)
            q80 r6 = r5.m5152(r7)
            if (r8 < 0) goto L96
            int[] r7 = r5.f9539
            int r7 = r5.m5134(r8, r7)
            int r1 = r5.m5168(r8)
        L92:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L61
        L96:
            r7 = r8
            goto L61
        L98:
            java.lang.Object r5 = r0.f5134
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L9d:
            jz r5 = p000.C0450jz.f5672
            return r5
    }

    /* JADX INFO: renamed from: μ */
    public static final void m3629(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " offset="
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " byteCount="
            r1.append(r4)
            r1.append(r8)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ν */
    public static final float[] m3630(float[] r20, float[] r21, float[] r22) {
            r0 = r20
            r1 = r22
            m3615(r20, r21)
            m3615(r0, r1)
            r2 = 0
            r3 = r1[r2]
            r4 = r21[r2]
            float r3 = r3 / r4
            r4 = 1
            r5 = r1[r4]
            r6 = r21[r4]
            float r5 = r5 / r6
            r6 = 2
            r1 = r1[r6]
            r7 = r21[r6]
            float r1 = r1 / r7
            r7 = 3
            float[] r8 = new float[r7]
            r8[r2] = r3
            r8[r4] = r5
            r8[r6] = r1
            float[] r1 = m3607(r0)
            r3 = r8[r2]
            r5 = r0[r2]
            float r5 = r5 * r3
            r9 = r8[r4]
            r10 = r0[r4]
            float r10 = r10 * r9
            r8 = r8[r6]
            r11 = r0[r6]
            float r11 = r11 * r8
            r12 = r0[r7]
            float r12 = r12 * r3
            r13 = 4
            r14 = r0[r13]
            float r14 = r14 * r9
            r15 = 5
            r16 = r0[r15]
            float r16 = r16 * r8
            r17 = 6
            r18 = r0[r17]
            float r3 = r3 * r18
            r18 = 7
            r19 = r0[r18]
            float r9 = r9 * r19
            r19 = 8
            r0 = r0[r19]
            float r8 = r8 * r0
            r0 = 9
            float[] r0 = new float[r0]
            r0[r2] = r5
            r0[r4] = r10
            r0[r6] = r11
            r0[r7] = r12
            r0[r13] = r14
            r0[r15] = r16
            r0[r17] = r3
            r0[r18] = r9
            r0[r19] = r8
            float[] r0 = m3614(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static final void m3631(p000.nw1 r3, java.util.ArrayList r4, int r5) {
            boolean r0 = r3.m4107(r5)
            int[] r1 = r3.f7798
            if (r0 == 0) goto L10
            java.lang.Object r3 = r3.m4109(r5)
            r4.add(r3)
            return
        L10:
            int r0 = r5 + 1
            int r2 = r5 * 5
            int r2 = r2 + 3
            r2 = r1[r2]
            int r2 = r2 + r5
        L19:
            if (r0 >= r2) goto L26
            m3631(r3, r4, r0)
            int r5 = r0 * 5
            int r5 = r5 + 3
            r5 = r1[r5]
            int r0 = r0 + r5
            goto L19
        L26:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static int m3632(int r0, int r1) {
            if (r0 >= r1) goto L4
            r0 = -1
            return r0
        L4:
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static int m3633(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = -1
            return r0
        L6:
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static final boolean m3634(p000.nb2 r3, p000.nb2 r4) {
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            float r1 = r3.f7509
            float r2 = r4.f7509
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 981668463(0x3a83126f, float:0.001)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L22
            float r3 = r3.f7510
            float r4 = r4.f7510
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 >= 0) goto L22
            return r0
        L22:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: σ */
    public static p000.p50 m3635(android.content.Context r12) {
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            p000.p91.m4418(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r5 = r4
            goto L6f
        L3a:
            java.lang.String r6 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r7 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r7, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r3 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
        L4c:
            if (r2 >= r3) goto L5a
            r5 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            byte[] r5 = r5.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            r1.add(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r9 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            n50 r5 = new n50     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            java.lang.String r8 = "emojicompat-emoji-font"
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L68
            goto L6f
        L68:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6f:
            if (r5 != 0) goto L72
            goto L7c
        L72:
            p50 r4 = new p50
            o50 r0 = new o50
            r0.<init>(r12, r5)
            r4.<init>(r0)
        L7c:
            return r4
    }

    /* JADX INFO: renamed from: τ */
    public static final p000.C0805so m3636(p000.AbstractC0432ji r4, p000.AbstractC0432ji r5) {
            if (r4 != r5) goto L9
            qo r5 = new qo
            r0 = 1
            r5.<init>(r4, r4, r0)
            return r5
        L9:
            long r0 = r4.f5475
            long r2 = p000.AbstractC0213di.f3165
            boolean r0 = p000.AbstractC0213di.m1746(r0, r2)
            if (r0 == 0) goto L25
            long r0 = r5.f5475
            boolean r0 = p000.AbstractC0213di.m1746(r0, r2)
            if (r0 == 0) goto L25
            ro r0 = new ro
            po1 r4 = (p000.po1) r4
            po1 r5 = (p000.po1) r5
            r0.<init>(r4, r5)
            return r0
        L25:
            so r0 = new so
            r1 = 0
            r0.<init>(r4, r5, r1)
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static void m3637(p000.ViewOnAttachStateChangeListenerC1042z1 r6, android.util.LongSparseArray r7) {
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = p000.AbstractC0671p1.m4368(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = p000.AbstractC0671p1.m4365(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = p000.AbstractC0671p1.m4369(r4)
            if (r4 == 0) goto L58
            sm0 r5 = r6.m7059()
            int r2 = (int) r2
            java.lang.Object r2 = r5.m5525(r2)
            ds1 r2 = (p000.ds1) r2
            if (r2 == 0) goto L58
            bs1 r2 = r2.f3268
            if (r2 == 0) goto L58
            xr1 r2 = r2.f1824
            is1 r3 = p000.wr1.f11822
            b21 r2 = r2.f12268
            java.lang.Object r2 = r2.m695(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            м r2 = (p000.C1114) r2
            if (r2 == 0) goto L58
            m80 r2 = r2.f13447
            a80 r2 = (p000.a80) r2
            if (r2 == 0) goto L58
            g4 r3 = new g4
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
    }

    /* JADX INFO: renamed from: φ */
    public static final void m3638(p000.InterfaceC0190cw r22, p000.wa0 r23) {
            r0 = r23
            m6 r1 = r22.mo579()
            de r2 = r1.m3787()
            m6 r1 = r22.mo579()
            java.lang.Object r1 = r1.f6968
            wa0 r1 = (p000.wa0) r1
            bb0 r3 = r0.f11620
            bb0 r4 = r0.f11620
            android.graphics.RenderNode r8 = r3.f1602
            boolean r5 = r0.f11638
            if (r5 == 0) goto L1e
            goto L1f7
        L1e:
            r0.m6341()
            boolean r5 = r8.hasDisplayList()
            if (r5 != 0) goto L2a
            r0.m6346()     // Catch: java.lang.Throwable -> L2a
        L2a:
            float r5 = r4.f1611
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r9 = 1
            if (r5 <= 0) goto L34
            r11 = r9
            goto L35
        L34:
            r11 = 0
        L35:
            if (r11 == 0) goto L3a
            r2.mo1733()
        L3a:
            android.graphics.Canvas r5 = p000.AbstractC0532m0.f6880
            r2.getClass()
            r12 = r2
            l0 r12 = (p000.C0495l0) r12
            android.graphics.Canvas r13 = r12.f6337
            boolean r19 = r13.isHardwareAccelerated()
            if (r19 != 0) goto Lc1
            long r6 = r0.f11639
            r14 = 32
            r20 = r11
            long r10 = r6 >> r14
            int r10 = (int) r10
            float r10 = (float) r10
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r15
            int r6 = (int) r6
            float r6 = (float) r6
            r7 = r14
            r17 = r15
            long r14 = r0.f11640
            r16 = r6
            long r5 = r14 >> r7
            int r5 = (int) r5
            float r5 = (float) r5
            float r5 = r5 + r10
            long r6 = r14 & r17
            int r6 = (int) r6
            float r6 = (float) r6
            float r17 = r16 + r6
            float r4 = r4.f1607
            int r6 = r3.f1608
            r7 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 < 0) goto L88
            r7 = 3
            if (r6 != r7) goto L88
            int r7 = r3.f1619
            if (r7 != r9) goto L80
            goto L88
        L80:
            r13.save()
            r14 = r10
            r15 = r16
            r11 = 0
            goto Lac
        L88:
            q2 r7 = r0.f11635
            if (r7 != 0) goto L92
            q2 r7 = p000.pd2.m4479()
            r0.f11635 = r7
        L92:
            java.lang.Object r14 = r7.f8800
            android.graphics.Paint r14 = (android.graphics.Paint) r14
            r7.m4712(r4)
            r7.m4713(r6)
            r11 = 0
            r7.f8802 = r11
            r14.setColorFilter(r11)
            r18 = r14
            r15 = r16
            r16 = r5
            r14 = r10
            r13.saveLayer(r14, r15, r16, r17, r18)
        Lac:
            r13.translate(r14, r15)
            android.graphics.Matrix r4 = r3.f1605
            if (r4 != 0) goto Lba
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r3.f1605 = r4
        Lba:
            r8.getMatrix(r4)
            r13.concat(r4)
            goto Lc4
        Lc1:
            r20 = r11
            r11 = 0
        Lc4:
            if (r19 != 0) goto Lcc
            boolean r3 = r0.f11642
            if (r3 == 0) goto Lcc
            r10 = r9
            goto Lcd
        Lcc:
            r10 = 0
        Lcd:
            if (r10 == 0) goto L121
            r2.mo1729()
            u81 r3 = r0.m6344()
            boolean r4 = r3 instanceof p000.s81
            if (r4 == 0) goto Lf2
            s81 r3 = (p000.s81) r3
            ml1 r3 = r3.f9764
            float r4 = r3.f7200
            r5 = r4
            float r4 = r3.f7201
            r6 = r5
            float r5 = r3.f7202
            float r3 = r3.f7203
            r7 = 1
            r21 = r6
            r6 = r3
            r3 = r21
            r2.mo1724(r3, r4, r5, r6, r7)
            goto L121
        Lf2:
            boolean r4 = r3 instanceof p000.t81
            if (r4 == 0) goto L111
            x2 r4 = r0.f11632
            if (r4 == 0) goto L100
            android.graphics.Path r5 = r4.f11999
            r5.rewind()
            goto L106
        L100:
            x2 r4 = p000.AbstractC1006y2.m6812()
            r0.f11632 = r4
        L106:
            t81 r3 = (p000.t81) r3
            wo1 r3 = r3.f10247
            p000.z91.m7119(r4, r3)
            r2.mo1732(r4)
            goto L121
        L111:
            boolean r4 = r3 instanceof p000.r81
            if (r4 == 0) goto L11d
            r81 r3 = (p000.r81) r3
            z91 r3 = r3.f9289
            r2.mo1732(r3)
            goto L121
        L11d:
            p000.C1080.m7272()
            return
        L121:
            if (r1 == 0) goto L177
            sf r1 = r1.f11637
            boolean r3 = r1.f9879
            if (r3 != 0) goto L12e
            java.lang.String r3 = "Only add dependencies during a tracking"
            p000.zl0.m7163(r3)
        L12e:
            java.lang.Object r3 = r1.f9882
            c21 r3 = (p000.c21) r3
            if (r3 == 0) goto L138
            r3.m1107(r0)
            goto L159
        L138:
            java.lang.Object r3 = r1.f9880
            wa0 r3 = (p000.wa0) r3
            if (r3 == 0) goto L157
            int r3 = p000.uq1.f10933
            c21 r3 = new c21
            r3.<init>()
            java.lang.Object r4 = r1.f9880
            wa0 r4 = (p000.wa0) r4
            r4.getClass()
            r3.m1107(r4)
            r3.m1107(r0)
            r1.f9882 = r3
            r1.f9880 = r11
            goto L159
        L157:
            r1.f9880 = r0
        L159:
            java.lang.Object r3 = r1.f9883
            c21 r3 = (p000.c21) r3
            if (r3 == 0) goto L165
            boolean r1 = r3.m1117(r0)
            r1 = r1 ^ r9
            goto L170
        L165:
            java.lang.Object r3 = r1.f9881
            wa0 r3 = (p000.wa0) r3
            if (r3 == r0) goto L16d
            r1 = r9
            goto L170
        L16d:
            r1.f9881 = r11
            r1 = 0
        L170:
            if (r1 == 0) goto L177
            int r1 = r0.f11636
            int r1 = r1 + r9
            r0.f11636 = r1
        L177:
            android.graphics.Canvas r1 = r12.f6337
            boolean r1 = r1.isHardwareAccelerated()
            if (r1 != 0) goto L1e3
            fe r1 = r0.f11634
            if (r1 != 0) goto L18a
            fe r1 = new fe
            r1.<init>()
            r0.f11634 = r1
        L18a:
            m6 r3 = r1.f3907
            yr r4 = r0.f11621
            np0 r5 = r0.f11622
            long r6 = r0.f11640
            long r6 = p000.AbstractC0782s1.m5322(r6)
            yr r8 = r3.m3791()
            np0 r9 = r3.m3757()
            de r11 = r3.m3787()
            long r14 = r3.m3758()
            java.lang.Object r12 = r3.f6968
            wa0 r12 = (p000.wa0) r12
            r3.m3769(r4)
            r3.m3770(r5)
            r3.m3768(r2)
            r3.m3771(r6)
            r3.f6968 = r0
            r2.mo1729()
            r0.m6343(r1)     // Catch: java.lang.Throwable -> L1d0
            r2.mo1727()
            r3.m3769(r8)
            r3.m3770(r9)
            r3.m3768(r11)
            r3.m3771(r14)
            r3.f6968 = r12
            goto L1e8
        L1d0:
            r0 = move-exception
            r2.mo1727()
            r3.m3769(r8)
            r3.m3770(r9)
            r3.m3768(r11)
            r3.m3771(r14)
            r3.f6968 = r12
            throw r0
        L1e3:
            android.graphics.Canvas r0 = r12.f6337
            r0.drawRenderNode(r8)
        L1e8:
            if (r10 == 0) goto L1ed
            r2.mo1727()
        L1ed:
            if (r20 == 0) goto L1f2
            r2.mo1730()
        L1f2:
            if (r19 != 0) goto L1f7
            r13.restore()
        L1f7:
            return
    }

    /* JADX INFO: renamed from: χ */
    public static final void m3639(p000.kq1 r4) {
            jr0 r0 = r4.mo192()
            cr0 r0 = r0.f5558
            cr0 r1 = p000.cr0.f2725
            if (r0 == r1) goto L15
            cr0 r1 = p000.cr0.f2726
            if (r0 != r1) goto Lf
            goto L15
        Lf:
            java.lang.String r4 = "Failed requirement."
            p000.C1080.m7275(r4)
            return
        L15:
            n5 r0 = r4.mo189()
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            hq1 r0 = r0.m3964(r1)
            if (r0 != 0) goto L41
            eq1 r0 = new eq1
            n5 r2 = r4.mo189()
            r3 = r4
            r92 r3 = (p000.r92) r3
            r0.<init>(r2, r3)
            n5 r2 = r4.mo189()
            r2.m3974(r1, r0)
            jr0 r4 = r4.mo192()
            ll1 r1 = new ll1
            r2 = 3
            r1.<init>(r2, r0)
            r4.m2980(r1)
        L41:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.Object m3640(java.lang.ClassLoader r4, boolean r5) {
            java.lang.String r0 = "营地作物配置请求失败: bridge="
            r1 = 0
            if (r5 != 0) goto L16
            kd1 r2 = p000.kd1.f5861     // Catch: java.lang.Throwable -> L89
            java.util.List r2 = r2.m3202()     // Catch: java.lang.Throwable -> L89
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L89
            if (r3 != 0) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.Object r2 = p000.ln0.f6718     // Catch: java.lang.Throwable -> L89
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L89
            if (r5 != 0) goto L2e
            kd1 r5 = p000.kd1.f5861     // Catch: java.lang.Throwable -> L2c
            java.util.List r5 = r5.m3202()     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L28
            goto L29
        L28:
            r5 = r1
        L29:
            if (r5 == 0) goto L2e
            goto L7c
        L2c:
            r4 = move-exception
            goto L87
        L2e:
            java.lang.Object r4 = p000.j81.m2915(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Throwable r5 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L86
            eb1 r4 = (p000.eb1) r4     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r4.m1892()     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L6a
            int r5 = r4.f3471     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r4 = r4.f3472     // Catch: java.lang.Throwable -> L2c
            if (r4 == 0) goto L4b
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L2c
            goto L4c
        L4b:
            r4 = -1
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            r1.append(r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = " http="
            r1.append(r5)     // Catch: java.lang.Throwable -> L2c
            r1.append(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L6a:
            kd1 r5 = p000.kd1.f5861     // Catch: java.lang.Throwable -> L2c
            org.json.JSONObject r4 = r4.f3473     // Catch: java.lang.Throwable -> L2c
            java.util.List r4 = r5.m3200(r4)     // Catch: java.lang.Throwable -> L2c
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L79
            r1 = r4
        L79:
            if (r1 == 0) goto L7e
            r5 = r1
        L7c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            return r5
        L7e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "宿主配置响应中未解析到作物目录"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L86:
            throw r5     // Catch: java.lang.Throwable -> L2c
        L87:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            throw r4     // Catch: java.lang.Throwable -> L89
        L89:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            return r5
    }

    /* JADX INFO: renamed from: ω */
    public static final p000.c50 m3641(p000.c50 r1) {
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r1)
            v40 r1 = r1.getFocusOwner()
            y40 r1 = (p000.y40) r1
            c50 r1 = r1.m6827()
            if (r1 == 0) goto L15
            boolean r0 = r1.f8784
            if (r0 == 0) goto L15
            return r1
        L15:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: а */
    public static final void m3642(p000.q01 r2, p000.p70 r3) {
            d41 r0 = r2.f8777
            if (r0 != 0) goto Le
            d41 r0 = new d41
            r1 = r2
            c41 r1 = (p000.c41) r1
            r0.<init>(r1)
            r2.f8777 = r0
        Le:
            androidx.compose.ui.platform.AndroidComposeView r2 = p000.h62.m2446(r2)
            y81 r2 = r2.getSnapshotObserver()
            a1 r1 = p000.C0002a1.f34
            kx1 r2 = r2.f12491
            r2.m3425(r0, r1, r3)
            return
    }

    /* JADX INFO: renamed from: б */
    public static p000.h01 m3643(java.nio.MappedByteBuffer r13) {
            java.nio.ByteBuffer r13 = r13.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r13.order(r0)
            int r0 = r13.position()
            int r0 = r0 + 4
            r13.position(r0)
            short r0 = r13.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            java.lang.String r2 = "Cannot read metadata."
            if (r0 > r1) goto Lcd
            int r1 = r13.position()
            int r1 = r1 + 6
            r13.position(r1)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = -1
            if (r3 >= r0) goto L59
            int r8 = r13.getInt()
            int r9 = r13.position()
            int r9 = r9 + 4
            r13.position(r9)
            int r9 = r13.getInt()
            long r9 = (long) r9
            long r9 = r9 & r4
            int r11 = r13.position()
            int r11 = r11 + 4
            r13.position(r11)
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 != r8) goto L56
            goto L5a
        L56:
            int r3 = r3 + 1
            goto L2b
        L59:
            r9 = r6
        L5a:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto Lc8
            int r0 = r13.position()
            long r6 = (long) r0
            long r6 = r9 - r6
            int r0 = (int) r6
            int r3 = r13.position()
            int r3 = r3 + r0
            r13.position(r3)
            int r0 = r13.position()
            int r0 = r0 + 12
            r13.position(r0)
            int r0 = r13.getInt()
            long r6 = (long) r0
            long r6 = r6 & r4
        L7d:
            long r11 = (long) r1
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lc8
            int r0 = r13.getInt()
            int r3 = r13.getInt()
            long r11 = (long) r3
            long r11 = r11 & r4
            r13.getInt()
            r3 = 1164798569(0x456d6a69, float:3798.6506)
            if (r3 == r0) goto L9d
            r3 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r3 != r0) goto L9a
            goto L9d
        L9a:
            int r1 = r1 + 1
            goto L7d
        L9d:
            long r11 = r11 + r9
            int r0 = (int) r11
            r13.position(r0)
            h01 r0 = new h01
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = p000.AbstractC0602nx.m4122(r13, r1)
            int r2 = r13.position()
            int r2 = r2 + r1
            r0.f12860 = r13
            r0.f12857 = r2
            int r13 = r13.getInt(r2)
            int r2 = r2 - r13
            r0.f12858 = r2
            java.lang.Object r13 = r0.f12860
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            short r13 = r13.getShort(r2)
            r0.f12859 = r13
            return r0
        Lc8:
            p000.C1080.m7281(r2)
        Lcb:
            r13 = 0
            return r13
        Lcd:
            p000.C1080.m7281(r2)
            goto Lcb
    }

    /* JADX INFO: renamed from: в */
    public static void m3644(java.util.ArrayList r2, long r3, java.lang.String r5, java.lang.String r6) {
            r0 = 13
            r1 = 32
            java.lang.String r6 = r6.replace(r0, r1)
            r6.getClass()
            r0 = 10
            java.lang.String r6 = r6.replace(r0, r1)
            r6.getClass()
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r6 = p000.q02.m4693(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.add(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "营地身份候选验证失败 shortId="
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r3 = " source="
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " detail="
            java.lang.String r2 = p000.lz1.m3691(r2, r3, r6)
            r3 = 0
            r4 = 4
            java.lang.String r5 = "rda66562695b2940c"
            p000.C0888ux.m5992(r5, r2, r3, r4, r3)
            return
    }

    /* JADX INFO: renamed from: г */
    public static final void m3645(p000.rw1 r2, int r3, java.lang.Object r4) {
            int r3 = r2.m5158(r3)
            java.lang.Object[] r2 = r2.f9540
            r0 = r2[r3]
            i2 r1 = p000.C0730qn.f9051
            r2[r3] = r1
            if (r4 != r0) goto Lf
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Slot table is out of sync (expected "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ", got "
            r2.append(r3)
            r2.append(r0)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p000.AbstractC0804sn.m5526(r2)
            return
    }

    /* JADX INFO: renamed from: д */
    public static final androidx.compose.p001ui.platform.AndroidComposeView m3646(p000.yp0 r0) {
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f12756
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "LayoutNode should be attached to an owner"
            pm r0 = p000.lz1.m3680(r0)
            throw r0
    }

    /* JADX INFO: renamed from: е */
    public static java.lang.String m3647(java.lang.Throwable r3) {
            f71 r0 = new f71
            r1 = 11
            r0.<init>(r1)
            ss1 r0 = p000.us1.m5954(r3, r0)
            java.lang.Object r0 = p000.us1.m5956(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L19
            java.lang.String r0 = ""
        L19:
            r1 = 13
            r2 = 32
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            r1 = 10
            java.lang.String r0 = r0.replace(r1, r2)
            r0.getClass()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L52
            f71 r0 = new f71
            r1 = 12
            r0.<init>(r1)
            ss1 r3 = p000.us1.m5954(r3, r0)
            java.lang.Object r3 = p000.us1.m5956(r3)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r0 = r3.getSimpleName()
        L52:
            r3 = 120(0x78, float:1.68E-43)
            java.lang.String r3 = p000.q02.m4693(r0, r3)
            return r3
    }

    /* JADX INFO: renamed from: ж */
    public static void m3648(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    /* JADX INFO: renamed from: з */
    public static java.lang.String m3649(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            r1.flush()
            java.lang.String r2 = r0.toString()
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: и */
    public static void m3650(java.lang.String r2) {
            java.lang.String r0 = "lateinit property "
            java.lang.String r1 = " has not been initialized"
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            pm r0 = new pm
            r0.<init>(r2)
            java.lang.Class<ln0> r2 = p000.ln0.class
            java.lang.String r2 = r2.getName()
            m3648(r0, r2)
            throw r0
    }

    /* JADX INFO: renamed from: й */
    public static final java.lang.String m3651(int r10) {
            if (r10 != 0) goto L5
            java.lang.String r10 = "0"
            return r10
        L5:
            char[] r0 = p000.AbstractC0782s1.f9641
            int r1 = r10 >> 28
            r1 = r1 & 15
            char r1 = r0[r1]
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r2 = r0[r2]
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r3 = r0[r3]
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r4 = r0[r4]
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r5 = r0[r5]
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r6 = r0[r6]
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r7 = r0[r7]
            r10 = r10 & 15
            char r10 = r0[r10]
            r0 = 8
            char[] r8 = new char[r0]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r1 = 2
            r8[r1] = r3
            r1 = 3
            r8[r1] = r4
            r1 = 4
            r8[r1] = r5
            r1 = 5
            r8[r1] = r6
            r1 = 6
            r8[r1] = r7
            r1 = 7
            r8[r1] = r10
        L51:
            if (r9 >= r0) goto L5c
            char r10 = r8[r9]
            r1 = 48
            if (r10 != r1) goto L5c
            int r9 = r9 + 1
            goto L51
        L5c:
            r10 = 0
            java.lang.String r1 = "startIndex: "
            if (r9 < 0) goto L75
            if (r9 > r0) goto L6b
            java.lang.String r10 = new java.lang.String
            int r0 = 8 - r9
            r10.<init>(r8, r9, r0)
            return r10
        L6b:
            java.lang.String r0 = " > endIndex: 8"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r9, r0)
            p000.C1080.m7275(r0)
            return r10
        L75:
            java.lang.String r0 = ", endIndex: 8, size: 8"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r9, r0)
            p000.C1080.m7269(r0)
            return r10
    }

    /* JADX INFO: renamed from: к */
    public static final java.util.ArrayList m3652(p000.nw1 r7, int r8, java.lang.Integer r9) {
            nk1 r0 = new nk1
            r0.<init>(r7)
            int r1 = r7.m4112(r8)
            q80 r2 = r7.m4096(r8)
        Ld:
            if (r8 < 0) goto L3e
            boolean r3 = r7.m4106(r8)
            if (r3 == 0) goto L1c
            int[] r3 = r7.f7798
            java.lang.Object r3 = r7.m4111(r8, r3)
            goto L1e
        L1c:
            i2 r3 = p000.C0730qn.f9051
        L1e:
            int r4 = r7.m4104(r8)
            ow1 r5 = r7.f7797
            x80 r8 = r5.m4305(r8)
            r0.m2769(r4, r3, r8, r9)
            if (r1 < 0) goto L3b
            q80 r8 = r7.m4096(r1)
            int r9 = r7.m4112(r1)
            r6 = r2
            r2 = r8
            r8 = r1
            r1 = r9
            r9 = r6
            goto Ld
        L3b:
            r8 = r1
            r9 = r2
            goto Ld
        L3e:
            java.lang.Object r7 = r0.f5134
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            return r7
    }

    /* JADX INFO: renamed from: л */
    public static java.lang.Object m3653(java.lang.ClassLoader r12, p000.hb1 r13, long r14, java.lang.String r16, long r17) {
            java.lang.String r0 = "营地上下文自动获取成功 shortId="
            java.lang.String r1 = "http="
            java.lang.String r3 = r13.f4677     // Catch: java.lang.Throwable -> Ld6
            uc1 r4 = r13.f4678     // Catch: java.lang.Throwable -> Ld6
            uc1 r2 = p000.uc1.f10693     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "str"
            java.lang.String r6 = "Agw-Js-Conv"
            if (r4 != r2) goto L28
            l91 r2 = new l91     // Catch: java.lang.Throwable -> Ld6
            r2.<init>(r6, r5)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r5 = "X-Hamlet-Is-Unity"
            java.lang.String r6 = "true"
            l91 r7 = new l91     // Catch: java.lang.Throwable -> Ld6
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> Ld6
            l91[] r2 = new p000.l91[]{r2, r7}     // Catch: java.lang.Throwable -> Ld6
            java.util.LinkedHashMap r2 = p000.ex0.m1969(r2)     // Catch: java.lang.Throwable -> Ld6
        L26:
            r5 = r2
            goto L32
        L28:
            l91 r2 = new l91     // Catch: java.lang.Throwable -> Ld6
            r2.<init>(r6, r5)     // Catch: java.lang.Throwable -> Ld6
            java.util.Map r2 = p000.ex0.m1971(r2)     // Catch: java.lang.Throwable -> Ld6
            goto L26
        L32:
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld6
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> Ld6
            r11 = 0
            if (r16 == 0) goto L4f
            java.lang.CharSequence r2 = p000.q02.m4660(r16)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            if (r2 == 0) goto L4f
            int r9 = r2.length()     // Catch: java.lang.Throwable -> Ld6
            if (r9 <= 0) goto L4f
            r9 = r2
            goto L50
        L4f:
            r9 = r11
        L50:
            java.lang.Long r10 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> Ld6
            vc1 r2 = new vc1     // Catch: java.lang.Throwable -> Ld6
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Object r12 = p000.i81.m2663(r12, r2)     // Catch: java.lang.Throwable -> Ld6
            java.lang.Throwable r3 = p000.fo1.m2190(r12)     // Catch: java.lang.Throwable -> Ld6
            if (r3 != 0) goto Ld5
            ab1 r12 = (p000.ab1) r12     // Catch: java.lang.Throwable -> Ld6
            boolean r3 = r12.m54()     // Catch: java.lang.Throwable -> Ld6
            if (r3 != 0) goto La9
            java.lang.Integer r13 = r12.f172     // Catch: java.lang.Throwable -> Ld6
            if (r13 == 0) goto L74
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> Ld6
            goto L75
        L74:
            r13 = -1
        L75:
            int r0 = r12.f173     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = r12.f174     // Catch: java.lang.Throwable -> Ld6
            if (r12 != 0) goto L7d
            java.lang.String r12 = ""
        L7d:
            r2 = 80
            java.lang.String r12 = p000.q02.m4693(r12, r2)     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r13)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = " code="
            r2.append(r13)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r0)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = " "
            r2.append(r13)     // Catch: java.lang.Throwable -> Ld6
            r2.append(r12)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> Ld6
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Ld6
            r13.<init>(r12)     // Catch: java.lang.Throwable -> Ld6
            throw r13     // Catch: java.lang.Throwable -> Ld6
        La9:
            xn0 r12 = p000.xn0.f12234     // Catch: java.lang.Throwable -> Ld6
            r12.m6767(r2)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r12 = "rda66562695b2940c"
            java.lang.String r13 = r13.f4679     // Catch: java.lang.Throwable -> Ld6
            int r1 = r4.f10695     // Catch: java.lang.Throwable -> Ld6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld6
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld6
            r3.append(r14)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r0 = " source="
            r3.append(r0)     // Catch: java.lang.Throwable -> Ld6
            r3.append(r13)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = " clientType="
            r3.append(r13)     // Catch: java.lang.Throwable -> Ld6
            r3.append(r1)     // Catch: java.lang.Throwable -> Ld6
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> Ld6
            r0 = 4
            p000.C0888ux.m5992(r12, r13, r11, r0, r11)     // Catch: java.lang.Throwable -> Ld6
            return r2
        Ld5:
            throw r3     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            r0 = move-exception
            r12 = r0
            eo1 r13 = new eo1
            r13.<init>(r12)
            return r13
    }

    /* JADX INFO: renamed from: м */
    public static java.util.List m3654(java.lang.ClassLoader r19, long r20, long r22, java.util.ArrayList r24) {
            r6 = r24
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r0 = 0
            r9 = r0
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
        L16:
            java.lang.String r0 = "world_relation_list"
            jz r17 = p000.C0450jz.f5672
            r1 = 20
            if (r9 >= r1) goto L1c6
            r1 = r19
            java.lang.Object r2 = p000.j81.m2916(r1, r10)
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto L1bb
            eb1 r2 = (p000.eb1) r2
            org.json.JSONObject r1 = r2.f3473
            boolean r3 = r2.m1892()
            if (r3 == 0) goto L40
            java.lang.Integer r3 = r2.m1891()
            if (r3 == 0) goto L4b
            java.lang.Integer r3 = r2.m1891()
            if (r3 != 0) goto L45
        L40:
            r4 = r20
            r9 = r0
            goto L147
        L45:
            int r3 = r3.intValue()
            if (r3 != 0) goto L40
        L4b:
            r2 = r0
            lb1 r0 = p000.lb1.f6537
            r4 = r22
            r18 = r9
            r9 = r2
            r2 = r20
            kb1 r0 = r0.m3543(r1, r2, r4)
            r4 = r2
            int r1 = r0.f5835
            int r11 = r11 + r1
            int r1 = r0.f5838
            int r12 = r12 + r1
            int r1 = r0.f5839
            int r13 = r13 + r1
            int r1 = r0.f5840
            int r14 = r14 + r1
            int r1 = r0.f5841
            int r15 = r15 + r1
            int r1 = r0.f5842
            int r1 = r16 + r1
            java.util.List r2 = r0.f5834
            p000.AbstractC0984xh.m6660(r7, r2)
            java.util.List r2 = r0.f5843
            p000.AbstractC0984xh.m6660(r8, r2)
            boolean r2 = r0.f5836
            if (r2 != 0) goto L12d
            int r0 = r8.size()
            java.lang.String r2 = " relation="
            java.lang.String r3 = " relationId="
            java.lang.String r10 = "pet="
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4136(r10, r12, r2, r13, r3)
            java.lang.String r3 = " matchedCid="
            java.lang.String r10 = " friendUid="
            p000.AbstractC0602nx.m4117(r2, r14, r3, r0, r10)
            r2.append(r15)
            java.lang.String r0 = " explicitSec="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            if (r11 != 0) goto Lab
            java.lang.String r1 = "未匹配到当前会话关系 "
            java.lang.String r0 = r1.concat(r0)
            m3644(r6, r4, r9, r0)
            return r17
        Lab:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            int r2 = r7.size()
            r3 = 1
            if (r2 == 0) goto Le6
            if (r2 == r3) goto Ld6
            int r2 = r7.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = "个明确身份候选 "
            r7.append(r2)
            r7.append(r0)
            java.lang.String r2 = r7.toString()
            m3644(r6, r4, r9, r2)
            goto Le6
        Ld6:
            hb1 r2 = new hb1
            java.lang.Object r7 = p000.AbstractC0984xh.m6654(r7)
            java.lang.String r7 = (java.lang.String) r7
            uc1 r10 = p000.uc1.f10693
            r2.<init>(r7, r10, r9)
            r1.add(r2)
        Le6:
            int r2 = r8.size()
            if (r2 == 0) goto L11d
            if (r2 == r3) goto L10a
            int r2 = r8.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "个会话鉴权候选 "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            m3644(r6, r4, r9, r0)
            return r1
        L10a:
            hb1 r0 = new hb1
            java.lang.Object r2 = p000.AbstractC0984xh.m6654(r8)
            java.lang.String r2 = (java.lang.String) r2
            uc1 r3 = p000.uc1.f10692
            java.lang.String r4 = "world_relation_conversation_id"
            r0.<init>(r2, r3, r4)
            r1.add(r0)
            return r1
        L11d:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L12c
            java.lang.String r2 = "匹配关系缺少conversation_id "
            java.lang.String r0 = r2.concat(r0)
            m3644(r6, r4, r9, r0)
        L12c:
            return r1
        L12d:
            java.lang.Integer r0 = r0.f5837
            if (r0 == 0) goto L136
            int r0 = r0.intValue()
            goto L138
        L136:
            int r0 = r10 + 10
        L138:
            if (r0 > r10) goto L140
            java.lang.String r0 = "分页 offset 未递增"
            m3644(r6, r4, r9, r0)
            return r17
        L140:
            int r9 = r18 + 1
            r10 = r0
            r16 = r1
            goto L16
        L147:
            java.lang.Integer r0 = r2.f3472
            r3 = -1
            if (r0 == 0) goto L151
            int r0 = r0.intValue()
            goto L152
        L151:
            r0 = r3
        L152:
            java.lang.Integer r2 = r2.m1891()
            if (r2 == 0) goto L15c
            int r3 = r2.intValue()
        L15c:
            java.lang.String r2 = "base_resp"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            java.lang.String r7 = "status_message"
            java.lang.String r8 = r1.optString(r7)
            java.lang.String r10 = "StatusMessage"
            java.lang.String r11 = r1.optString(r10)
            java.lang.String r12 = "status_msg"
            java.lang.String r1 = r1.optString(r12)
            r12 = 0
            if (r2 == 0) goto L17c
            java.lang.String r7 = r2.optString(r7)
            goto L17d
        L17c:
            r7 = r12
        L17d:
            if (r2 == 0) goto L183
            java.lang.String r12 = r2.optString(r10)
        L183:
            java.lang.String[] r1 = new java.lang.String[]{r8, r11, r1, r7, r12}
            ss1 r1 = p000.AbstractC0312g7.m2232(r1)
            f71 r2 = new f71
            r7 = 10
            r2.<init>(r7)
            y30 r1 = p000.us1.m5943(r1, r2)
            java.lang.Object r1 = p000.us1.m5953(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1a0
            java.lang.String r1 = ""
        L1a0:
            r2 = 80
            java.lang.String r1 = p000.q02.m4693(r1, r2)
            java.lang.String r2 = " code="
            java.lang.String r7 = " "
            java.lang.String r8 = "http="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r8, r0, r2, r3, r7)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m3644(r6, r4, r9, r0)
            return r17
        L1bb:
            r4 = r20
            r9 = r0
            java.lang.String r0 = m3647(r3)
            m3644(r6, r4, r9, r0)
            return r17
        L1c6:
            r4 = r20
            r9 = r0
            java.lang.String r0 = "关系列表超过20页，已停止自动选择"
            m3644(r6, r4, r9, r0)
            return r17
    }
}
