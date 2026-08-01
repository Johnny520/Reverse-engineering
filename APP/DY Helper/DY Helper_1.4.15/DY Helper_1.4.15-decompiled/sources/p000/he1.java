package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {

    /* JADX INFO: renamed from: α */
    public static final p000.ym1 f4708 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f4709 = null;

    static {
            ym1 r0 = new ym1
            java.lang.String r1 = "[0-9]+"
            r0.<init>(r1)
            p000.he1.f4708 = r0
            java.lang.String r0 = "other_uid"
            java.lang.String r1 = "group_id"
            java.lang.String r2 = "conversation_short_id"
            java.lang.String r3 = "conversation_id"
            java.lang.String r4 = "to_user_id"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.he1.f4709 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m2497(java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = java.net.URLDecoder.decode(r2, r0)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L12:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L17
            goto L18
        L17:
            r2 = r0
        L18:
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static p000.ee1 m2498(java.util.Map r8) {
            if (r8 == 0) goto L32
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L9
            goto L32
        L9:
            b8 r0 = new b8
            r1 = 5
            r0.<init>(r1)
            r1 = 0
            r0.m821(r8, r1)
            ee1 r2 = new ee1
            java.lang.Object r8 = r0.f1555
            r3 = r8
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r8 = r0.f1556
            r4 = r8
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r0.f1557
            r5 = r8
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r8 = r0.f1558
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r0.f1559
            r7 = r8
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L32:
            ee1 r8 = new ee1
            r8.<init>()
            return r8
    }

    /* JADX INFO: renamed from: γ */
    public static p000.de1 m2499(java.lang.String r13, java.util.ArrayList r14) {
            java.lang.CharSequence r13 = p000.q02.m4660(r13)
            java.lang.String r13 = r13.toString()
            int r0 = r13.length()
            jz r1 = p000.C0450jz.f5672
            if (r0 != 0) goto L16
            de1 r13 = new de1
            r13.<init>(r1, r1, r1, r1)
            return r13
        L16:
            r0 = 10
            java.lang.Long r0 = p000.x02.m6489(r13, r0)
            r2 = 0
            r4 = 0
            if (r0 == 0) goto L2a
            long r5 = r0.longValue()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L2a
            goto L2b
        L2a:
            r0 = r4
        L2b:
            java.util.List r5 = m2500(r13)
            ym1 r6 = p000.he1.f4708
            cu r6 = p000.ym1.m6940(r6, r13)
            f71 r7 = new f71
            r8 = 23
            r7.<init>(r8)
            y30 r6 = p000.us1.m5943(r6, r7)
            java.util.Set r6 = p000.us1.m5950(r6)
            if (r0 == 0) goto L6a
            long r7 = r0.longValue()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r14.iterator()
        L53:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L6b
            java.lang.Object r10 = r9.next()
            r11 = r10
            fe1 r11 = (p000.fe1) r11
            long r11 = r11.f3912
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L53
            r0.add(r10)
            goto L53
        L6a:
            r0 = r4
        L6b:
            if (r0 != 0) goto L6e
            r0 = r1
        L6e:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r14.iterator()
        L77:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.next()
            r10 = r9
            fe1 r10 = (p000.fe1) r10
            java.lang.String r10 = r10.f3913
            if (r10 == 0) goto L91
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            goto L92
        L91:
            r10 = r4
        L92:
            boolean r10 = p000.ln0.m3626(r10, r13)
            if (r10 == 0) goto L77
            r7.add(r9)
            goto L77
        L9c:
            if (r5 == 0) goto Lc8
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r8 = r14.iterator()
        La7:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc9
            java.lang.Object r9 = r8.next()
            r10 = r9
            fe1 r10 = (p000.fe1) r10
            java.lang.String r10 = r10.f3913
            if (r10 == 0) goto Lbd
            java.util.List r10 = m2500(r10)
            goto Lbe
        Lbd:
            r10 = r4
        Lbe:
            boolean r10 = p000.ln0.m3626(r10, r5)
            if (r10 == 0) goto La7
            r13.add(r9)
            goto La7
        Lc8:
            r13 = r4
        Lc9:
            if (r13 != 0) goto Lcc
            goto Lcd
        Lcc:
            r1 = r13
        Lcd:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r14.iterator()
        Ld6:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L106
            java.lang.Object r5 = r14.next()
            r8 = r5
            fe1 r8 = (p000.fe1) r8
            java.lang.Long r8 = r8.f3914
            if (r8 == 0) goto Ld6
            long r9 = r8.longValue()
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 <= 0) goto Lf0
            goto Lf1
        Lf0:
            r8 = r4
        Lf1:
            if (r8 == 0) goto Ld6
            long r8 = r8.longValue()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            boolean r8 = r6.contains(r8)
            r9 = 1
            if (r8 != r9) goto Ld6
            r13.add(r5)
            goto Ld6
        L106:
            de1 r14 = new de1
            r14.<init>(r0, r7, r1, r13)
            return r14
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m2500(java.lang.String r8) {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r2 = 58
            r0[r1] = r2
            r2 = 6
            java.util.List r8 = p000.q02.m4682(r8, r0, r1, r2)
            int r0 = r8.size()
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto L16
            goto L5f
        L16:
            r0 = 2
            java.util.List r8 = p000.AbstractC0984xh.m6634(r8, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L24:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r8.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            java.lang.Long r3 = p000.x02.m6488(r3)
            if (r3 == 0) goto L49
            long r4 = r3.longValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L49
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r3 == 0) goto L24
            r1.add(r3)
            goto L24
        L50:
            int r8 = r1.size()
            if (r8 < r0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            if (r1 == 0) goto L5f
            java.util.List r8 = p000.AbstractC0984xh.m6657(r1)
            return r8
        L5f:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static p000.ge1 m2501(p000.ee1 r12, java.util.ArrayList r13) {
            java.lang.Long r0 = r12.f3524
            java.lang.String r1 = r12.f3523
            java.lang.Long r2 = r12.f3522
            r3 = 0
            r5 = 0
            if (r2 == 0) goto L51
            long r6 = r2.longValue()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L14
            goto L15
        L14:
            r2 = r5
        L15:
            if (r2 == 0) goto L51
            long r7 = r2.longValue()
            java.util.Iterator r12 = r13.iterator()
        L1f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L33
            java.lang.Object r13 = r12.next()
            r2 = r13
            fe1 r2 = (p000.fe1) r2
            long r2 = r2.f3912
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L1f
            r5 = r13
        L33:
            fe1 r5 = (p000.fe1) r5
            ge1 r6 = new ge1
            if (r5 == 0) goto L40
            java.lang.String r12 = r5.f3913
            if (r12 != 0) goto L3e
            goto L40
        L3e:
            r9 = r12
            goto L41
        L40:
            r9 = r1
        L41:
            if (r5 == 0) goto L4a
            java.lang.Long r12 = r5.f3914
            if (r12 != 0) goto L48
            goto L4a
        L48:
            r10 = r12
            goto L4b
        L4a:
            r10 = r0
        L4b:
            java.lang.String r11 = "conversation_short_id"
            r6.<init>(r7, r9, r10, r11)
            return r6
        L51:
            if (r1 == 0) goto L9b
            de1 r1 = m2499(r1, r13)
            java.util.List r2 = r1.f3107
            java.lang.Object r2 = p000.AbstractC0984xh.m6656(r2)
            fe1 r2 = (p000.fe1) r2
            if (r2 == 0) goto L68
            java.lang.String r12 = "conversation_id"
            ge1 r12 = m2502(r2, r12)
            return r12
        L68:
            java.util.List r2 = r1.f3106
            java.lang.Object r2 = p000.AbstractC0984xh.m6656(r2)
            fe1 r2 = (p000.fe1) r2
            if (r2 == 0) goto L79
            java.lang.String r12 = "conversation_id_short_id"
            ge1 r12 = m2502(r2, r12)
            return r12
        L79:
            java.util.List r2 = r1.f3108
            java.lang.Object r2 = p000.AbstractC0984xh.m6656(r2)
            fe1 r2 = (p000.fe1) r2
            if (r2 == 0) goto L8a
            java.lang.String r12 = "conversation_id_participants"
            ge1 r12 = m2502(r2, r12)
            return r12
        L8a:
            java.util.List r1 = r1.f3109
            java.lang.Object r1 = p000.AbstractC0984xh.m6656(r1)
            fe1 r1 = (p000.fe1) r1
            if (r1 == 0) goto L9b
            java.lang.String r12 = "conversation_id_other_uid"
            ge1 r12 = m2502(r1, r12)
            return r12
        L9b:
            java.lang.String r12 = r12.f3525
            if (r12 == 0) goto Le3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r13.iterator()
        La8:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Ld4
            java.lang.Object r6 = r2.next()
            r7 = r6
            fe1 r7 = (p000.fe1) r7
            java.lang.String r8 = r7.f3913
            boolean r8 = p000.ln0.m3626(r8, r12)
            if (r8 != 0) goto Ld0
            long r7 = r7.f3912
            r9 = 10
            java.lang.Long r9 = p000.x02.m6489(r12, r9)
            if (r9 != 0) goto Lc8
            goto La8
        Lc8:
            long r9 = r9.longValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto La8
        Ld0:
            r1.add(r6)
            goto La8
        Ld4:
            java.lang.Object r12 = p000.AbstractC0984xh.m6656(r1)
            fe1 r12 = (p000.fe1) r12
            if (r12 == 0) goto Le3
            java.lang.String r13 = "group_id"
            ge1 r12 = m2502(r12, r13)
            return r12
        Le3:
            if (r0 == 0) goto L12b
            long r1 = r0.longValue()
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 <= 0) goto Lee
            goto Lef
        Lee:
            r0 = r5
        Lef:
            if (r0 == 0) goto L12b
            long r0 = r0.longValue()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r13.iterator()
        Lfe:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L11c
            java.lang.Object r2 = r13.next()
            r3 = r2
            fe1 r3 = (p000.fe1) r3
            java.lang.Long r3 = r3.f3914
            if (r3 != 0) goto L110
            goto Lfe
        L110:
            long r3 = r3.longValue()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto Lfe
            r12.add(r2)
            goto Lfe
        L11c:
            java.lang.Object r12 = p000.AbstractC0984xh.m6656(r12)
            fe1 r12 = (p000.fe1) r12
            if (r12 == 0) goto L12b
            java.lang.String r13 = "other_uid"
            ge1 r12 = m2502(r12, r13)
            return r12
        L12b:
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.ge1 m2502(p000.fe1 r6, java.lang.String r7) {
            ge1 r0 = new ge1
            long r1 = r6.f3912
            java.lang.String r3 = r6.f3913
            java.lang.Long r4 = r6.f3914
            r5 = r7
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
