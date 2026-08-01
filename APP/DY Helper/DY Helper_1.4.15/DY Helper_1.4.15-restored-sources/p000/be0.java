package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class be0 {

    /* JADX INFO: renamed from: α */
    public static final p000.be0 f1670 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f1671 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.CopyOnWriteArrayList f1672 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicReference f1673 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicReference f1674 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.zb0 f1675 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.zb0 f1676 = null;

    static {
            be0 r0 = new be0
            r0.<init>()
            p000.be0.f1670 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.be0.f1671 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.be0.f1672 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            zd0 r2 = new zd0
            jz r3 = p000.C0450jz.f5672
            n5 r4 = p000.h62.m2380(r3)
            java.lang.String r5 = ""
            r2.<init>(r5, r1, r3, r4)
            r0.<init>(r2)
            p000.be0.f1673 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            he0 r1 = p000.he0.f4706
            r0.<init>(r1)
            p000.be0.f1674 = r0
            zb0 r0 = new zb0
            r1 = 16
            r0.<init>(r1)
            p000.be0.f1675 = r0
            zb0 r0 = new zb0
            r1 = 17
            r0.<init>(r1)
            p000.be0.f1676 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m929() {
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

    /* JADX INFO: renamed from: ι */
    public static boolean m930(p000.zd0 r1) {
            boolean r0 = r1.f13044
            if (r0 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference r0 = p000.be0.f1674
            java.lang.Object r0 = r0.get()
            he0 r0 = (p000.he0) r0
            java.lang.String r1 = r1.f13043
            boolean r1 = r0.m2496(r1)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static p000.xd0 m931(p000.xd0 r9, p000.xd0 r10) {
            java.lang.String r0 = r10.f12133
            int r1 = r0.length()
            if (r1 != 0) goto La
            java.lang.String r0 = r9.f12133
        La:
            r4 = r0
            java.lang.String r0 = r10.f12134
            int r1 = r0.length()
            if (r1 != 0) goto L15
            java.lang.String r0 = r9.f12134
        L15:
            r5 = r0
            java.lang.String r0 = r10.f12135
            int r1 = r0.length()
            if (r1 != 0) goto L20
            java.lang.String r0 = r9.f12135
        L20:
            r6 = r0
            java.lang.String r0 = r10.f12136
            int r1 = r0.length()
            if (r1 != 0) goto L2b
            java.lang.String r0 = r9.f12136
        L2b:
            r7 = r0
            java.lang.String r10 = r10.f12137
            int r0 = r10.length()
            if (r0 != 0) goto L36
            java.lang.String r10 = r9.f12137
        L36:
            r8 = r10
            long r2 = r9.f12138
            xd0 r1 = new xd0
            r1.<init>(r2, r4, r5, r6, r7, r8)
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static void m932(java.lang.String r5) {
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.be0.f1672
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            p70 r1 = (p000.p70) r1
            r1.invoke()     // Catch: java.lang.Throwable -> L18
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1f:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L6
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "change listener failed reason="
            java.lang.String r3 = " err="
            java.lang.String r4 = "r62bda5d817332bb8"
            p000.AbstractC0602nx.m4144(r2, r5, r3, r1, r4)
            goto L6
        L33:
            return
    }

    /* JADX INFO: renamed from: π */
    public static boolean m933(p000.xd0 r2, p000.xd0 r3) {
            java.lang.String r0 = r2.f12133
            java.lang.String r1 = r2.f12134
            int r0 = r0.length()
            if (r0 <= 0) goto L14
            java.lang.String r2 = r2.f12133
            java.lang.String r0 = r3.f12133
            boolean r2 = p000.ln0.m3626(r2, r0)
            if (r2 != 0) goto L22
        L14:
            int r2 = r1.length()
            if (r2 <= 0) goto L24
            java.lang.String r2 = r3.f12134
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final synchronized p000.yd0 m934(p000.xd0 r5) {
            r4 = this;
            monitor-enter(r4)
            r4.m937()     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = m929()     // Catch: java.lang.Throwable -> L12
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L15
            yd0 r5 = p000.yd0.f12584     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L12:
            r5 = move-exception
            goto L96
        L15:
            yc0 r1 = p000.yc0.f12575     // Catch: java.lang.Throwable -> L12
            java.util.List r5 = p000.AbstractC1021yh.m6896(r5)     // Catch: java.lang.Throwable -> L12
            java.util.List r5 = r1.m6847(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r5 = p000.AbstractC0984xh.m6640(r5)     // Catch: java.lang.Throwable -> L12
            xd0 r5 = (p000.xd0) r5     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L2b
            yd0 r5 = p000.yd0.f12585     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L2b:
            java.lang.String r1 = r5.f12133     // Catch: java.lang.Throwable -> L12
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L12
            if (r1 <= 0) goto L3f
            java.lang.String r1 = r5.f12133     // Catch: java.lang.Throwable -> L12
            boolean r0 = p000.ln0.m3626(r1, r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L3f
            yd0 r5 = p000.yd0.f12585     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L3f:
            java.util.List r0 = r4.m943()     // Catch: java.lang.Throwable -> L12
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L12
            r2 = 0
        L4d:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L63
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L12
            xd0 r3 = (p000.xd0) r3     // Catch: java.lang.Throwable -> L12
            boolean r3 = m933(r3, r5)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L60
            goto L64
        L60:
            int r2 = r2 + 1
            goto L4d
        L63:
            r2 = -1
        L64:
            if (r2 < 0) goto L84
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L12
            xd0 r0 = (p000.xd0) r0     // Catch: java.lang.Throwable -> L12
            xd0 r5 = m931(r0, r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r1.get(r2)     // Catch: java.lang.Throwable -> L12
            boolean r0 = r5.equals(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L7e
            yd0 r5 = p000.yd0.f12583     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L7e:
            r1.set(r2, r5)     // Catch: java.lang.Throwable -> L12
            yd0 r5 = p000.yd0.f12580     // Catch: java.lang.Throwable -> L12
            goto L89
        L84:
            r1.add(r5)     // Catch: java.lang.Throwable -> L12
            yd0 r5 = p000.yd0.f12579     // Catch: java.lang.Throwable -> L12
        L89:
            java.lang.String r0 = "add"
            boolean r0 = r4.m942(r0, r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L92
            goto L94
        L92:
            yd0 r5 = p000.yd0.f12586     // Catch: java.lang.Throwable -> L12
        L94:
            monitor-exit(r4)
            return r5
        L96:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public final p000.zd0 m935() {
            r2 = this;
            r2.m937()
            java.lang.String r2 = m929()
            int r0 = r2.length()
            if (r0 != 0) goto Le
            goto L2a
        Le:
            java.util.concurrent.atomic.AtomicReference r0 = p000.be0.f1673
            java.lang.Object r0 = r0.get()
            zd0 r0 = (p000.zd0) r0
            java.lang.String r1 = r0.f13043
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
            goto L2a
        L1f:
            java.lang.String r1 = m929()
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L2a
            return r0
        L2a:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m936() {
            r3 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.be0.f1671
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L1b
            java.lang.Object r0 = p000.ui1.f10844
            zb0 r0 = p000.be0.f1675
            r0.getClass()
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.ui1.f10852
            r1.add(r0)
            zb0 r0 = p000.be0.f1676
            p000.ui1.m5882(r0)
        L1b:
            java.lang.String r0 = "initialize"
            r3.m944(r0)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m937() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.be0.f1671
            boolean r0 = r0.get()
            if (r0 != 0) goto Lb
            r1.m936()
        Lb:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final boolean m938() {
            r1 = this;
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L7
            goto L13
        L7:
            zd0 r1 = r1.m935()
            if (r1 == 0) goto L13
            boolean r1 = r1.f13044
            r0 = 1
            if (r1 != r0) goto L13
            return r0
        L13:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: η */
    public final boolean m939() {
            r1 = this;
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L7
            goto L22
        L7:
            zd0 r1 = r1.m935()
            if (r1 != 0) goto Le
            goto L22
        Le:
            boolean r0 = r1.f13044
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f13045
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            boolean r1 = m930(r1)
            if (r1 != 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m940() {
            r1 = this;
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L7
            goto Ld
        L7:
            zd0 r1 = r1.m935()
            if (r1 != 0) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            boolean r1 = m930(r1)
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m941(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L7
            goto L52
        L7:
            zd0 r1 = r1.m935()
            if (r1 != 0) goto Le
            goto L52
        Le:
            boolean r0 = r1.f13044
            if (r0 == 0) goto L52
            java.util.List r0 = r1.f13045
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
            boolean r0 = m930(r1)
            if (r0 == 0) goto L21
            goto L52
        L21:
            n5 r1 = r1.f13046
            r0 = 64
            java.lang.String r2 = p000.AbstractC0782s1.m5343(r2, r0)
            int r0 = r2.length()
            if (r0 <= 0) goto L3a
            java.lang.Object r0 = r1.f7387
            java.util.Set r0 = (java.util.Set) r0
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L3a
            goto L50
        L3a:
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r2 = p000.AbstractC0782s1.m5343(r3, r2)
            int r3 = r2.length()
            if (r3 <= 0) goto L52
            java.lang.Object r1 = r1.f7388
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L52
        L50:
            r1 = 1
            return r1
        L52:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ν */
    public final boolean m942(java.lang.String r8, java.util.List r9) {
            r7 = this;
            yc0 r0 = p000.yc0.f12575
            java.util.List r9 = r0.m6847(r9)
            java.lang.Object r1 = p000.ui1.f10844
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.List r0 = r0.m6847(r9)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r0.next()
            xd0 r2 = (p000.xd0) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "uid"
            java.lang.String r5 = r2.f12133
            r3.put(r4, r5)
            java.lang.String r4 = "sec_uid"
            java.lang.String r5 = r2.f12134
            r3.put(r4, r5)
            java.lang.String r4 = "unique_id"
            java.lang.String r5 = r2.f12135
            r3.put(r4, r5)
            java.lang.String r4 = "short_id"
            java.lang.String r5 = r2.f12136
            r3.put(r4, r5)
            java.lang.String r4 = "display_name"
            java.lang.String r5 = r2.f12137
            r3.put(r4, r5)
            java.lang.String r4 = "hidden_at"
            long r5 = r2.f12138
            r3.put(r4, r5)
            r1.put(r3)
            goto L15
        L54:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r2 = "version"
            r3 = 2
            org.json.JSONObject r0 = r0.put(r2, r3)
            java.lang.String r2 = "contacts"
            org.json.JSONObject r0 = r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r1 = "hidden_contacts_v2"
            p000.ui1.m5875(r1, r0)
            java.lang.String r0 = "persist_"
            java.lang.String r8 = r0.concat(r8)
            r7.m944(r8)
            java.lang.String r7 = m929()
            java.util.concurrent.atomic.AtomicReference r8 = p000.be0.f1673
            java.lang.Object r8 = r8.get()
            zd0 r8 = (p000.zd0) r8
            int r0 = r7.length()
            if (r0 <= 0) goto L9f
            java.lang.String r0 = r8.f13043
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L9f
            java.util.List r7 = r8.f13045
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L9f
            r7 = 1
            return r7
        L9f:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ξ */
    public final java.util.List m943() {
            r0 = this;
            zd0 r0 = r0.m935()
            if (r0 == 0) goto L9
            java.util.List r0 = r0.f13045
            return r0
        L9:
            jz r0 = p000.C0450jz.f5672
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public final void m944(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = m929()
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto L1a
            zd0 r0 = new zd0
            java.lang.String r1 = ""
            jz r3 = p000.C0450jz.f5672
            n5 r4 = p000.h62.m2380(r3)
            r0.<init>(r1, r2, r3, r4)
            goto L8b
        L1a:
            yc0 r1 = p000.yc0.f12575
            java.lang.String r3 = "hidden_contacts_v2"
            java.lang.String r4 = ""
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            jz r4 = p000.C0450jz.f5672
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto L2d
            goto L7b
        L2d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L63
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = "contacts"
            org.json.JSONArray r3 = r5.optJSONArray(r3)     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L3c
            r1 = r4
            goto L73
        L3c:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L63
            r7 = 2000(0x7d0, float:2.803E-42)
            if (r6 <= r7) goto L47
            r6 = r7
        L47:
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L63
            int r6 = r3.length()     // Catch: java.lang.Throwable -> L63
            if (r6 <= r7) goto L51
            goto L52
        L51:
            r7 = r6
        L52:
            r6 = r2
        L53:
            if (r6 >= r7) goto L68
            org.json.JSONObject r8 = r3.optJSONObject(r6)     // Catch: java.lang.Throwable -> L63
            xd0 r8 = p000.yc0.m6846(r8)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L65
            r5.add(r8)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r1 = move-exception
            goto L6d
        L65:
            int r6 = r6 + 1
            goto L53
        L68:
            java.util.List r1 = r1.m6847(r5)     // Catch: java.lang.Throwable -> L63
            goto L73
        L6d:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L73:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L78
            goto L79
        L78:
            r4 = r1
        L79:
            java.util.List r4 = (java.util.List) r4
        L7b:
            zd0 r1 = new zd0
            java.lang.String r3 = "hidden_contact_enabled_v2"
            boolean r3 = p000.ui1.m5887(r3, r2)
            n5 r5 = p000.h62.m2380(r4)
            r1.<init>(r0, r3, r4, r5)
            r0 = r1
        L8b:
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReference r1 = p000.be0.f1674     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r1.get()     // Catch: java.lang.Throwable -> La9
            he0 r3 = (p000.he0) r3     // Catch: java.lang.Throwable -> La9
            he0 r4 = p000.he0.f4706     // Catch: java.lang.Throwable -> La9
            boolean r5 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> La9
            if (r5 != 0) goto Lb4
            boolean r5 = r0.f13044     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto Lab
            java.lang.String r5 = r0.f13043     // Catch: java.lang.Throwable -> La9
            boolean r5 = r3.m2496(r5)     // Catch: java.lang.Throwable -> La9
            if (r5 == 0) goto Lab
            goto Lb4
        La9:
            r10 = move-exception
            goto L106
        Lab:
            r3.getClass()     // Catch: java.lang.Throwable -> La9
            r1.set(r4)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r9)
            r2 = 1
            goto Lb5
        Lb4:
            monitor-exit(r9)
        Lb5:
            java.util.concurrent.atomic.AtomicReference r9 = p000.be0.f1673
            java.lang.Object r9 = r9.getAndSet(r0)
            zd0 r9 = (p000.zd0) r9
            java.lang.String r1 = r9.f13043
            java.lang.String r3 = r0.f13043
            java.util.List r4 = r0.f13045
            boolean r0 = r0.f13044
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ldb
            boolean r1 = r9.f13044
            if (r1 != r0) goto Ldb
            java.util.List r9 = r9.f13045
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto Ld8
            goto Ldb
        Ld8:
            if (r2 != 0) goto Ldb
            goto L105
        Ldb:
            java.lang.String r9 = "r62bda5d817332bb8"
            int r1 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "state refreshed reason="
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = " enabled="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " count="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5975(r9, r0)
            m932(r10)
        L105:
            return
        L106:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> La9
            throw r10
    }

    /* JADX INFO: renamed from: ρ */
    public final synchronized p000.ae0 m945() {
            r7 = this;
            java.lang.String r0 = "temporary reveal changed revealed="
            monitor-enter(r7)
            r7.m937()     // Catch: java.lang.Throwable -> L10
            boolean r1 = p000.AbstractC0976x9.m6526()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L13
            ae0 r0 = p000.ae0.f202     // Catch: java.lang.Throwable -> L10
            monitor-exit(r7)
            return r0
        L10:
            r0 = move-exception
            goto L94
        L13:
            zd0 r1 = r7.m935()     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1d
            ae0 r0 = p000.ae0.f201     // Catch: java.lang.Throwable -> L10
            monitor-exit(r7)
            return r0
        L1d:
            boolean r2 = r1.f13044     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L25
            ae0 r0 = p000.ae0.f200     // Catch: java.lang.Throwable -> L10
            monitor-exit(r7)
            return r0
        L25:
            java.util.concurrent.atomic.AtomicReference r2 = p000.be0.f1674     // Catch: java.lang.Throwable -> L10
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L10
            he0 r3 = (p000.he0) r3     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r1.f13043     // Catch: java.lang.Throwable -> L10
            r3.getClass()     // Catch: java.lang.Throwable -> L10
            he0 r5 = p000.he0.f4706     // Catch: java.lang.Throwable -> L10
            java.lang.CharSequence r4 = p000.q02.m4660(r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L10
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L43
            goto L4b
        L43:
            java.lang.String r6 = "0"
            boolean r6 = r4.equals(r6)     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto L4d
        L4b:
            r3 = r5
            goto L59
        L4d:
            boolean r3 = r3.m2496(r4)     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L54
            goto L4b
        L54:
            he0 r3 = new he0     // Catch: java.lang.Throwable -> L10
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L10
        L59:
            r2.set(r3)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = m929()     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = r1.f13043     // Catch: java.lang.Throwable -> L10
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L6f
            r2.set(r5)     // Catch: java.lang.Throwable -> L10
            ae0 r0 = p000.ae0.f201     // Catch: java.lang.Throwable -> L10
            monitor-exit(r7)
            return r0
        L6f:
            java.lang.String r1 = r1.f13043     // Catch: java.lang.Throwable -> L10
            boolean r1 = r3.m2496(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "r62bda5d817332bb8"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L10
            r3.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L10
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = "temporary_reveal"
            m932(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L90
            ae0 r0 = p000.ae0.f198     // Catch: java.lang.Throwable -> L10
            goto L92
        L90:
            ae0 r0 = p000.ae0.f199     // Catch: java.lang.Throwable -> L10
        L92:
            monitor-exit(r7)
            return r0
        L94:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L10
            throw r0
    }
}
