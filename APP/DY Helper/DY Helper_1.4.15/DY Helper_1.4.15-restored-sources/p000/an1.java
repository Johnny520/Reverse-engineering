package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class an1 {

    /* JADX INFO: renamed from: α */
    public static final p000.an1 f334 = null;

    /* JADX INFO: renamed from: β */
    public static org.json.JSONObject f335;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f336 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f337;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f338 = null;

    static {
            an1 r0 = new an1
            r0.<init>()
            p000.an1.f334 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.an1.f336 = r0
            java.lang.String r0 = "31"
            java.lang.String r1 = "50"
            java.lang.String r2 = "11"
            java.lang.String r3 = "12"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.an1.f338 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.zm1 m185(java.lang.String r12, org.json.JSONObject r13) {
            int r0 = r12.length()
            r1 = 0
            r2 = 4
            r3 = 6
            java.lang.String r4 = "00"
            r5 = 2
            if (r0 != r5) goto L13
            java.lang.String r0 = "0000"
            java.lang.String r0 = r12.concat(r0)
            goto L2a
        L13:
            int r0 = r12.length()
            if (r0 != r2) goto L1e
            java.lang.String r0 = r12.concat(r4)
            goto L2a
        L1e:
            int r0 = r12.length()
            if (r0 <= r3) goto L29
            java.lang.String r0 = r12.substring(r1, r3)
            goto L2a
        L29:
            r0 = r12
        L2a:
            int r6 = r0.length()
            java.lang.String r7 = "）"
            r8 = 0
            if (r6 >= r3) goto L3f
            zm1 r13 = new zm1
            java.lang.String r0 = "无效代码（"
            java.lang.String r12 = p000.lz1.m3674(r0, r12, r7)
            r13.<init>(r8, r8, r8, r12)
            return r13
        L3f:
            java.lang.String r6 = r0.substring(r1, r5)
            java.lang.String r5 = r0.substring(r5, r2)
            java.lang.String r0 = r0.substring(r2, r3)
            org.json.JSONObject r13 = r13.optJSONObject(r6)
            java.lang.String r2 = "未知地区（"
            if (r13 != 0) goto L5d
            zm1 r13 = new zm1
            java.lang.String r12 = p000.lz1.m3674(r2, r12, r7)
            r13.<init>(r8, r8, r8, r12)
            return r13
        L5d:
            java.lang.String r3 = "name"
            java.lang.String r9 = ""
            java.lang.String r10 = r13.optString(r3, r9)
            r10.getClass()
            boolean r11 = p000.q02.m4671(r10)
            if (r11 == 0) goto L78
            zm1 r13 = new zm1
            java.lang.String r12 = p000.lz1.m3674(r2, r12, r7)
            r13.<init>(r8, r8, r8, r12)
            return r13
        L78:
            java.util.Set r12 = p000.an1.f338
            boolean r12 = r12.contains(r6)
            boolean r2 = r5.equals(r4)
            if (r2 == 0) goto L90
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L90
            zm1 r12 = new zm1
            r12.<init>(r10, r8, r8, r10)
            return r12
        L90:
            java.lang.String r2 = "cities"
            org.json.JSONObject r13 = r13.optJSONObject(r2)
            if (r13 != 0) goto L9e
            zm1 r12 = new zm1
            r12.<init>(r10, r8, r8, r10)
            return r12
        L9e:
            org.json.JSONObject r13 = r13.optJSONObject(r5)
            if (r13 != 0) goto Laa
            zm1 r12 = new zm1
            r12.<init>(r10, r8, r8, r10)
            return r12
        Laa:
            java.lang.String r2 = r13.optString(r3, r9)
            if (r12 == 0) goto Lc8
            java.lang.String r12 = "市辖区"
            boolean r12 = p000.ln0.m3626(r2, r12)
            if (r12 != 0) goto Lc7
            boolean r12 = p000.ln0.m3626(r2, r10)
            if (r12 != 0) goto Lc7
            r2.getClass()
            boolean r12 = p000.q02.m4671(r2)
            if (r12 == 0) goto Lc8
        Lc7:
            r1 = 1
        Lc8:
            boolean r12 = r0.equals(r4)
            if (r12 == 0) goto Le3
            if (r1 == 0) goto Ld2
            r12 = r10
            goto Ld6
        Ld2:
            java.lang.String r12 = p000.AbstractC0602nx.m4129(r10, r2)
        Ld6:
            boolean r13 = p000.q02.m4671(r2)
            if (r13 == 0) goto Ldd
            r2 = r8
        Ldd:
            zm1 r13 = new zm1
            r13.<init>(r10, r2, r8, r12)
            return r13
        Le3:
            java.lang.String r12 = "counties"
            org.json.JSONObject r12 = r13.optJSONObject(r12)
            if (r12 != 0) goto L100
            if (r1 == 0) goto Lef
            r12 = r10
            goto Lf3
        Lef:
            java.lang.String r12 = p000.AbstractC0602nx.m4129(r10, r2)
        Lf3:
            boolean r13 = p000.q02.m4671(r2)
            if (r13 == 0) goto Lfa
            r2 = r8
        Lfa:
            zm1 r13 = new zm1
            r13.<init>(r10, r2, r8, r12)
            return r13
        L100:
            java.lang.String r12 = r12.optString(r0, r9)
            r12.getClass()
            boolean r13 = p000.q02.m4671(r12)
            if (r13 != 0) goto L126
            if (r1 == 0) goto L114
            java.lang.String r13 = r10.concat(r12)
            goto L118
        L114:
            java.lang.String r13 = p000.lz1.m3688(r10, r2, r12)
        L118:
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L11f
            goto L120
        L11f:
            r8 = r2
        L120:
            zm1 r0 = new zm1
            r0.<init>(r10, r8, r12, r13)
            return r0
        L126:
            if (r1 == 0) goto L12a
            r12 = r10
            goto L12e
        L12a:
            java.lang.String r12 = p000.AbstractC0602nx.m4129(r10, r2)
        L12e:
            boolean r13 = p000.q02.m4671(r2)
            if (r13 == 0) goto L135
            r2 = r8
        L135:
            zm1 r13 = new zm1
            r13.<init>(r10, r2, r8, r12)
            return r13
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m186(java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto L83
            boolean r1 = p000.q02.m4671(r5)
            if (r1 == 0) goto Lb
            goto L83
        Lb:
            boolean r1 = p000.q02.m4671(r5)
            zm1 r2 = p000.zm1.f13170
            if (r1 == 0) goto L14
            goto L6e
        L14:
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "[^0-9]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r5.getClass()
            java.util.regex.Matcher r5 = r1.matcher(r5)
            java.lang.String r1 = ""
            java.lang.String r5 = r5.replaceAll(r1)
            r5.getClass()
            int r1 = r5.length()
            r3 = 2
            if (r1 >= r3) goto L3d
            goto L6e
        L3d:
            java.util.concurrent.ConcurrentHashMap r1 = p000.an1.f336
            java.lang.Object r2 = r1.get(r5)
            zm1 r2 = (p000.zm1) r2
            if (r2 == 0) goto L48
            goto L6e
        L48:
            org.json.JSONObject r2 = p000.an1.f335
            if (r2 != 0) goto L67
            java.lang.String r2 = "⚠️ parse 被调用但 regionData 为 null，code="
            java.lang.String r2 = r2.concat(r5)
            r3 = 4
            java.lang.String r4 = "DYHelper"
            p000.C0888ux.m5988(r4, r2, r0, r3, r0)
            zm1 r2 = new zm1
            java.lang.String r3 = "地区代码: "
            java.lang.String r3 = r3.concat(r5)
            r2.<init>(r0, r0, r0, r3)
            r1.put(r5, r2)
            goto L6e
        L67:
            zm1 r2 = m185(r5, r2)
            r1.put(r5, r2)
        L6e:
            java.lang.String r5 = r2.f13174
            java.lang.String r1 = "未知"
            r2 = 0
            boolean r1 = p000.x02.m6485(r5, r1, r2)
            if (r1 != 0) goto L83
            java.lang.String r1 = "地区代码"
            boolean r1 = p000.x02.m6485(r5, r1, r2)
            if (r1 == 0) goto L82
            goto L83
        L82:
            return r5
        L83:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final void m187(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "✅ 区域代码表加载成功，省份数: "
            boolean r1 = p000.an1.f337
            if (r1 == 0) goto L7
            return
        L7:
            monitor-enter(r4)
            boolean r1 = p000.an1.f337     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto Le
            monitor-exit(r4)
            return
        Le:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L40
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L40
            p000.an1.f335 = r1     // Catch: java.lang.Throwable -> L40
            r5 = 1
            p000.an1.f337 = r5     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "110105"
            zm1 r5 = m185(r5, r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "DYHelper"
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r5.f13174     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            r3.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "，验证 110105 = "
            r3.append(r0)     // Catch: java.lang.Throwable -> L40
            r3.append(r5)     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L40
            r0 = 4
            r1 = 0
            p000.C0888ux.m5988(r2, r5, r1, r0, r1)     // Catch: java.lang.Throwable -> L40
            goto L48
        L40:
            r5 = move-exception
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "❌ JSON 解析失败"
            p000.C0888ux.m5977(r0, r1, r5)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r4)
            return
        L4a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }
}
