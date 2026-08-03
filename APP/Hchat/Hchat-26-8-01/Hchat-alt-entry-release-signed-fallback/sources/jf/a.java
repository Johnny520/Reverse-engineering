package jf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f6865a = null;

    static {
            java.lang.Class<jf.a> r0 = jf.a.class
            mh.b r0 = mh.d.b(r0)
            jf.a.f6865a = r0
            return
    }

    public static void a(java.lang.String r12, java.util.ArrayList r13, java.util.List r14) {
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L8
            goto L1c7
        L8:
            java.util.Iterator r0 = r14.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1be
            java.lang.Object r1 = r0.next()
            nc.b r1 = (nc.b) r1
            int r2 = r1.f9343a
            java.util.LinkedHashMap r3 = r1.f9345c
            r4 = 3
            if (r2 != r4) goto Lc
            java.lang.String r2 = r1.f9344b
            r2.getClass()
            int r5 = r2.hashCode()
            r6 = 0
            r7 = 1
            r8 = -1
            switch(r5) {
                case -1911645549: goto L5a;
                case -1104599473: goto L4f;
                case -858881176: goto L44;
                case 1338970954: goto L3b;
                case 1664436329: goto L30;
                default: goto L2e;
            }
        L2e:
            r4 = r8
            goto L64
        L30:
            java.lang.String r4 = "Ldalvik/annotation/Signature;"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L39
            goto L2e
        L39:
            r4 = 4
            goto L64
        L3b:
            java.lang.String r5 = "Ldalvik/annotation/MethodParameters;"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L64
            goto L2e
        L44:
            java.lang.String r4 = "Ldalvik/annotation/Throws;"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L4d
            goto L2e
        L4d:
            r4 = 2
            goto L64
        L4f:
            java.lang.String r4 = "Ldalvik/annotation/AnnotationDefault;"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L58
            goto L2e
        L58:
            r4 = r7
            goto L64
        L5a:
            java.lang.String r4 = "Ldalvik/annotation/InnerClass;"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L63
            goto L2e
        L63:
            r4 = r6
        L64:
            java.lang.String r2 = "value"
            java.lang.String r5 = "Failed to parse annotation: {}"
            java.lang.String r8 = "accessFlags"
            mh.b r9 = jf.a.f6865a
            switch(r4) {
                case 0: goto L162;
                case 1: goto L144;
                case 2: goto L10f;
                case 3: goto Lb6;
                case 4: goto L70;
                default: goto L6f;
            }
        L6f:
            goto Lc
        L70:
            pc.j r1 = new pc.j
            java.lang.Object r2 = r3.get(r2)
            nc.a r2 = (nc.a) r2
            java.lang.Object r2 = r2.f9342h
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 != r7) goto L8d
            java.lang.Object r2 = r2.get(r6)
            nc.a r2 = (nc.a) r2
            java.lang.Object r2 = r2.f9342h
            java.lang.String r2 = (java.lang.String) r2
            goto Lae
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L96:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Laa
            java.lang.Object r4 = r2.next()
            nc.a r4 = (nc.a) r4
            java.lang.Object r4 = r4.f9342h
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            goto L96
        Laa:
            java.lang.String r2 = r3.toString()
        Lae:
            r1.<init>(r2)
            r13.add(r1)
            goto Lc
        Lb6:
            java.lang.String r2 = "names"
            java.util.List r2 = a.a.R(r1, r2)     // Catch: java.lang.Exception -> Lfe
            java.util.List r3 = a.a.R(r1, r8)     // Catch: java.lang.Exception -> Lfe
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Exception -> Lfe
            if (r4 != 0) goto Lc
            int r4 = r2.size()     // Catch: java.lang.Exception -> Lfe
            int r7 = r3.size()     // Catch: java.lang.Exception -> Lfe
            if (r4 != r7) goto Lc
            int r4 = r2.size()     // Catch: java.lang.Exception -> Lfe
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lfe
            r7.<init>(r4)     // Catch: java.lang.Exception -> Lfe
        Ld9:
            if (r6 >= r4) goto L100
            java.lang.Object r8 = r2.get(r6)     // Catch: java.lang.Exception -> Lfe
            nc.a r8 = (nc.a) r8     // Catch: java.lang.Exception -> Lfe
            java.lang.Object r8 = r8.f9342h     // Catch: java.lang.Exception -> Lfe
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> Lfe
            java.lang.Object r10 = r3.get(r6)     // Catch: java.lang.Exception -> Lfe
            nc.a r10 = (nc.a) r10     // Catch: java.lang.Exception -> Lfe
            java.lang.Object r10 = r10.f9342h     // Catch: java.lang.Exception -> Lfe
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Exception -> Lfe
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> Lfe
            pc.h r11 = new pc.h     // Catch: java.lang.Exception -> Lfe
            r11.<init>(r10, r8)     // Catch: java.lang.Exception -> Lfe
            r7.add(r11)     // Catch: java.lang.Exception -> Lfe
            int r6 = r6 + 1
            goto Ld9
        Lfe:
            r2 = move-exception
            goto L10a
        L100:
            pc.i r2 = new pc.i     // Catch: java.lang.Exception -> Lfe
            r2.<init>(r7)     // Catch: java.lang.Exception -> Lfe
            r13.add(r2)     // Catch: java.lang.Exception -> Lfe
            goto Lc
        L10a:
            r9.s(r1, r5, r2)
            goto Lc
        L10f:
            java.lang.Object r1 = r3.get(r2)     // Catch: java.lang.Exception -> L13e
            nc.a r1 = (nc.a) r1     // Catch: java.lang.Exception -> L13e
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r1.f9342h     // Catch: java.lang.Exception -> L13e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L13e
            java.util.stream.Stream r1 = r1.stream()     // Catch: java.lang.Exception -> L13e
            com.alibaba.fastjson2.writer.b r2 = new com.alibaba.fastjson2.writer.b     // Catch: java.lang.Exception -> L13e
            r3 = 24
            r2.<init>(r3)     // Catch: java.lang.Exception -> L13e
            java.util.stream.Stream r1 = r1.map(r2)     // Catch: java.lang.Exception -> L13e
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()     // Catch: java.lang.Exception -> L13e
            java.lang.Object r1 = r1.collect(r2)     // Catch: java.lang.Exception -> L13e
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> L13e
            pc.e r2 = new pc.e     // Catch: java.lang.Exception -> L13e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L13e
            r13.add(r2)     // Catch: java.lang.Exception -> L13e
            goto Lc
        L13e:
            r1 = move-exception
            r9.u(r1)
            goto Lc
        L144:
            java.lang.Object r1 = r3.get(r2)
            nc.a r1 = (nc.a) r1
            if (r1 == 0) goto Lc
            int r2 = r1.f9341g
            r3 = 18
            if (r2 != r3) goto Lc
            java.lang.Object r1 = r1.f9342h
            nc.b r1 = (nc.b) r1
            pc.b r2 = new pc.b
            java.util.LinkedHashMap r1 = r1.f9345c
            r2.<init>(r1)
            r13.add(r2)
            goto Lc
        L162:
            java.lang.String r2 = "name"
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L1b8
            if (r4 == 0) goto L16b
            goto L17d
        L16b:
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Exception -> L1b8
            nc.a r2 = (nc.a) r2     // Catch: java.lang.Exception -> L1b8
            if (r2 == 0) goto L17d
            int r4 = r2.f9341g     // Catch: java.lang.Exception -> L1b8
            r7 = 10
            if (r4 == r7) goto L17a
            goto L17d
        L17a:
            java.lang.Object r2 = r2.f9342h     // Catch: java.lang.Exception -> L1b8
            goto L17e
        L17d:
            r2 = 0
        L17e:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1b8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> L1b8
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Exception -> L1b8
            if (r6 == 0) goto L18b
            goto L19b
        L18b:
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Exception -> L1b8
            nc.a r3 = (nc.a) r3     // Catch: java.lang.Exception -> L1b8
            if (r3 == 0) goto L19b
            int r6 = r3.f9341g     // Catch: java.lang.Exception -> L1b8
            r7 = 6
            if (r6 == r7) goto L199
            goto L19b
        L199:
            java.lang.Object r4 = r3.f9342h     // Catch: java.lang.Exception -> L1b8
        L19b:
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L1b8
            int r3 = r4.intValue()     // Catch: java.lang.Exception -> L1b8
            if (r2 != 0) goto L1a5
            if (r3 == 0) goto Lc
        L1a5:
            pc.g r4 = new pc.g     // Catch: java.lang.Exception -> L1b8
            r4.<init>(r3, r12, r2)     // Catch: java.lang.Exception -> L1b8
            pc.f r2 = new pc.f     // Catch: java.lang.Exception -> L1b8
            java.util.Map r3 = java.util.Collections.singletonMap(r12, r4)     // Catch: java.lang.Exception -> L1b8
            r2.<init>(r3)     // Catch: java.lang.Exception -> L1b8
            r13.add(r2)     // Catch: java.lang.Exception -> L1b8
            goto Lc
        L1b8:
            r2 = move-exception
            r9.s(r1, r5, r2)
            goto Lc
        L1be:
            pc.d r12 = pc.d.b(r14)
            if (r12 == 0) goto L1c7
            r13.add(r12)
        L1c7:
            return
    }
}
