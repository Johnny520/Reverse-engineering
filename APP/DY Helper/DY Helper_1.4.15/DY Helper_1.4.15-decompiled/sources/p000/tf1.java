package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f10353;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f10354;

    /* JADX INFO: renamed from: γ */
    public final int f10355;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f10356;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f10357;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f10358;

    /* JADX INFO: renamed from: η */
    public final java.lang.Integer f10359;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Integer f10360;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Integer f10361;

    /* JADX INFO: renamed from: κ */
    public final java.lang.String f10362;

    /* JADX INFO: renamed from: λ */
    public final java.lang.String f10363;

    /* JADX INFO: renamed from: μ */
    public final java.lang.String f10364;

    /* JADX INFO: renamed from: ν */
    public final java.util.List f10365;

    /* JADX INFO: renamed from: ξ */
    public final org.json.JSONObject f10366;

    public tf1(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.List r13, org.json.JSONObject r14) {
            r0 = this;
            r0.<init>()
            r0.f10353 = r1
            r0.f10354 = r2
            r0.f10355 = r3
            r0.f10356 = r4
            r0.f10357 = r5
            r0.f10358 = r6
            r0.f10359 = r7
            r0.f10360 = r8
            r0.f10361 = r9
            r0.f10362 = r10
            r0.f10363 = r11
            r0.f10364 = r12
            r0.f10365 = r13
            r0.f10366 = r14
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5630(java.util.ArrayList r1, p000.tf1 r2) {
            r1.add(r2)
            java.util.List r2 = r2.f10365
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r2.next()
            tf1 r0 = (p000.tf1) r0
            m5630(r1, r0)
            goto L9
        L19:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto La7
        L4:
            boolean r0 = r3 instanceof p000.tf1
            if (r0 != 0) goto La
            goto La5
        La:
            tf1 r3 = (p000.tf1) r3
            java.lang.String r0 = r2.f10353
            java.lang.String r1 = r3.f10353
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto La5
        L18:
            java.lang.String r0 = r2.f10354
            java.lang.String r1 = r3.f10354
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L24
            goto La5
        L24:
            int r0 = r2.f10355
            int r1 = r3.f10355
            if (r0 == r1) goto L2c
            goto La5
        L2c:
            java.lang.String r0 = r2.f10356
            java.lang.String r1 = r3.f10356
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L38
            goto La5
        L38:
            java.lang.String r0 = r2.f10357
            java.lang.String r1 = r3.f10357
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L43
            goto La5
        L43:
            java.lang.String r0 = r2.f10358
            java.lang.String r1 = r3.f10358
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4e
            goto La5
        L4e:
            java.lang.Integer r0 = r2.f10359
            java.lang.Integer r1 = r3.f10359
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L59
            goto La5
        L59:
            java.lang.Integer r0 = r2.f10360
            java.lang.Integer r1 = r3.f10360
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L64
            goto La5
        L64:
            java.lang.Integer r0 = r2.f10361
            java.lang.Integer r1 = r3.f10361
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L6f
            goto La5
        L6f:
            java.lang.String r0 = r2.f10362
            java.lang.String r1 = r3.f10362
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L7a
            goto La5
        L7a:
            java.lang.String r0 = r2.f10363
            java.lang.String r1 = r3.f10363
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L85
            goto La5
        L85:
            java.lang.String r0 = r2.f10364
            java.lang.String r1 = r3.f10364
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L90
            goto La5
        L90:
            java.util.List r0 = r2.f10365
            java.util.List r1 = r3.f10365
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9b
            goto La5
        L9b:
            org.json.JSONObject r2 = r2.f10366
            org.json.JSONObject r3 = r3.f10366
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La7
        La5:
            r2 = 0
            return r2
        La7:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f10353
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.String r3 = r4.f10354
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f10355
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f10356
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f10357
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f10358
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f10359
            if (r3 != 0) goto L46
            r3 = r2
            goto L4a
        L46:
            int r3 = r3.hashCode()
        L4a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f10360
            if (r3 != 0) goto L52
            r3 = r2
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f10361
            if (r3 != 0) goto L5e
            r3 = r2
            goto L62
        L5e:
            int r3 = r3.hashCode()
        L62:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f10362
            if (r3 != 0) goto L6a
            r3 = r2
            goto L6e
        L6a:
            int r3 = r3.hashCode()
        L6e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f10363
            if (r3 != 0) goto L75
            goto L79
        L75:
            int r2 = r3.hashCode()
        L79:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f10364
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.List r2 = r4.f10365
            int r0 = p000.a12.m16(r2, r0, r1)
            org.json.JSONObject r4 = r4.f10366
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", uniqueTaskId="
            java.lang.String r1 = ", taskStatus="
            java.lang.String r2 = "PetElfTask(taskId="
            java.lang.String r3 = r5.f10353
            java.lang.String r4 = r5.f10354
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", token="
            java.lang.String r2 = ", taskKey="
            int r3 = r5.f10355
            java.lang.String r4 = r5.f10356
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", taskName="
            java.lang.String r2 = ", taskType="
            java.lang.String r3 = r5.f10357
            java.lang.String r4 = r5.f10358
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.Integer r1 = r5.f10359
            r0.append(r1)
            java.lang.String r1 = ", currentTimes="
            r0.append(r1)
            java.lang.Integer r1 = r5.f10360
            r0.append(r1)
            java.lang.String r1 = ", totalTimes="
            r0.append(r1)
            java.lang.Integer r1 = r5.f10361
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = r5.f10362
            r0.append(r1)
            java.lang.String r1 = ", subtitle="
            r0.append(r1)
            java.lang.String r1 = ", rewardEnterFrom="
            java.lang.String r2 = ", subTasks="
            java.lang.String r3 = r5.f10363
            java.lang.String r4 = r5.f10364
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f10365
            r0.append(r1)
            java.lang.String r1 = ", raw="
            r0.append(r1)
            org.json.JSONObject r5 = r5.f10366
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m5631() {
            r5 = this;
            fg1 r0 = r5.m5632()
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L77
            java.lang.Integer r2 = r5.f10361
            r3 = 1
            if (r0 == r3) goto L25
            r5 = 2
            if (r0 != r5) goto L20
            if (r2 == 0) goto L1c
            int r5 = r2.intValue()
            if (r5 <= 0) goto L1c
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 == 0) goto L80
            goto L74
        L20:
            p000.C1080.m7272()
            r5 = 0
            return r5
        L25:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = r5.f10353
            int r3 = r5.hashCode()
            r4 = 1591813689(0x5ee12639, float:8.1118587E18)
            if (r3 == r4) goto L5a
            switch(r3) {
                case 1591810740: goto L51;
                case 1591810741: goto L41;
                case 1591810742: goto L38;
                default: goto L37;
            }
        L37:
            goto L62
        L38:
            java.lang.String r3 = "601052"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L63
            goto L62
        L41:
            java.lang.String r0 = "601051"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L4a
            goto L62
        L4a:
            r5 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L63
        L51:
            java.lang.String r3 = "601050"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L63
            goto L62
        L5a:
            java.lang.String r3 = "601374"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L63
        L62:
            r0 = r1
        L63:
            if (r0 == 0) goto L68
            java.lang.String r5 = "task-id-fallback"
            return r5
        L68:
            if (r2 == 0) goto L71
            int r5 = r2.intValue()
            if (r5 <= 0) goto L71
            goto L72
        L71:
            r2 = r1
        L72:
            if (r2 == 0) goto L80
        L74:
            java.lang.String r5 = "server-total-times"
            return r5
        L77:
            qg1 r5 = p000.rg1.m5088(r5)
            if (r5 == 0) goto L80
            java.lang.String r5 = r5.f9004
            return r5
        L80:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final p000.fg1 m5632() {
            r8 = this;
            java.lang.String r0 = r8.f10357
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length()
            r3 = 0
        Le:
            if (r3 >= r2) goto L20
            char r4 = r0.charAt(r3)
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 == 0) goto L1d
            r1.append(r4)
        L1d:
            int r3 = r3 + 1
            goto Le
        L20:
            java.lang.String r0 = r1.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 != 0) goto L33
            java.lang.String r0 = ""
        L33:
            int r1 = r0.hashCode()
            fg1 r2 = p000.fg1.f3930
            fg1 r3 = p000.fg1.f3931
            fg1 r4 = p000.fg1.f3929
            switch(r1) {
                case -1424668828: goto L79;
                case -872188913: goto L6e;
                case -767729247: goto L65;
                case -543202211: goto L5c;
                case 849936134: goto L53;
                case 1344654985: goto L4a;
                case 1761872243: goto L41;
                default: goto L40;
            }
        L40:
            goto L81
        L41:
            java.lang.String r1 = "mutualmessage"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77
            goto L81
        L4a:
            java.lang.String r1 = "msgsend"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77
            goto L81
        L53:
            java.lang.String r1 = "contentshare"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83
            goto L81
        L5c:
            java.lang.String r1 = "msgsendnum"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77
            goto L81
        L65:
            java.lang.String r1 = "pictureshare"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83
            goto L81
        L6e:
            java.lang.String r1 = "messagesend"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L77
            goto L81
        L77:
            r0 = r4
            goto L84
        L79:
            java.lang.String r1 = "imageshare"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L83
        L81:
            r0 = r3
            goto L84
        L83:
            r0 = r2
        L84:
            java.lang.String r1 = r8.f10353
            int r5 = r1.hashCode()
            r6 = 1591813689(0x5ee12639, float:8.1118587E18)
            java.lang.String r7 = r8.f10362
            java.lang.String r8 = r8.f10358
            if (r5 == r6) goto Lc3
            switch(r5) {
                case 1591810740: goto Lb2;
                case 1591810741: goto La9;
                case 1591810742: goto La0;
                case 1591810743: goto L97;
                default: goto L96;
            }
        L96:
            goto Lcb
        L97:
            java.lang.String r2 = "601053"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbb
            goto Lcb
        La0:
            java.lang.String r5 = "601052"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Ldf
            goto Lcb
        La9:
            java.lang.String r2 = "601051"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbb
            goto Lcb
        Lb2:
            java.lang.String r2 = "601050"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lbb
            goto Lcb
        Lbb:
            boolean r8 = p000.e81.m1881(r7, r8)
            if (r8 == 0) goto Lc2
            return r4
        Lc2:
            return r3
        Lc3:
            java.lang.String r5 = "601374"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Ldf
        Lcb:
            int[] r1 = p000.xf1.f12157
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 != r2) goto Lde
            boolean r8 = p000.e81.m1881(r7, r8)
            if (r8 == 0) goto Ldd
            return r4
        Ldd:
            return r3
        Lde:
            return r0
        Ldf:
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer m5633() {
            r5 = this;
            fg1 r0 = r5.m5632()
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L6d
            java.lang.Integer r2 = r5.f10361
            r3 = 1
            if (r0 == r3) goto L22
            r5 = 2
            if (r0 != r5) goto L1d
            if (r2 == 0) goto L1c
            int r5 = r2.intValue()
            if (r5 <= 0) goto L1c
            return r2
        L1c:
            return r1
        L1d:
            p000.C1080.m7272()
            r5 = 0
            return r5
        L22:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = r5.f10353
            int r3 = r5.hashCode()
            r4 = 1591813689(0x5ee12639, float:8.1118587E18)
            if (r3 == r4) goto L57
            switch(r3) {
                case 1591810740: goto L4e;
                case 1591810741: goto L3e;
                case 1591810742: goto L35;
                default: goto L34;
            }
        L34:
            goto L5f
        L35:
            java.lang.String r3 = "601052"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L60
            goto L5f
        L3e:
            java.lang.String r0 = "601051"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L47
            goto L5f
        L47:
            r5 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L60
        L4e:
            java.lang.String r3 = "601050"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L60
            goto L5f
        L57:
            java.lang.String r3 = "601374"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L60
        L5f:
            r0 = r1
        L60:
            if (r0 != 0) goto L6c
            if (r2 == 0) goto L6b
            int r5 = r2.intValue()
            if (r5 <= 0) goto L6b
            return r2
        L6b:
            return r1
        L6c:
            return r0
        L6d:
            qg1 r5 = p000.rg1.m5088(r5)
            if (r5 == 0) goto L7a
            int r5 = r5.f9003
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L7a:
            return r1
    }
}
