package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 {

    /* JADX INFO: renamed from: α */
    public static final p000.yc0 f12575 = null;

    static {
            yc0 r0 = new yc0
            r0.<init>()
            p000.yc0.f12575 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static p000.xd0 m6846(org.json.JSONObject r20) {
            r0 = r20
            r1 = 0
            if (r0 != 0) goto L6
            goto L53
        L6:
            java.lang.String r2 = "uid"
            java.lang.String r2 = r0.optString(r2)
            r2.getClass()
            java.lang.String r3 = "sec_uid"
            java.lang.String r3 = r0.optString(r3)
            r3.getClass()
            java.lang.String r4 = "unique_id"
            java.lang.String r4 = r0.optString(r4)
            r4.getClass()
            java.lang.String r5 = "short_id"
            java.lang.String r5 = r0.optString(r5)
            r5.getClass()
            java.lang.String r6 = "display_name"
            java.lang.String r6 = r0.optString(r6)
            r6.getClass()
            java.lang.String r7 = "hidden_at"
            r8 = 0
            long r10 = r0.optLong(r7, r8)
            r0 = 64
            java.lang.String r15 = p000.AbstractC0782s1.m5343(r2, r0)
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r16 = p000.AbstractC0782s1.m5343(r3, r0)
            int r2 = r15.length()
            if (r2 != 0) goto L54
            int r2 = r16.length()
            if (r2 != 0) goto L54
        L53:
            return r1
        L54:
            r2 = 128(0x80, float:1.8E-43)
            java.lang.String r17 = p000.AbstractC0782s1.m5326(r4, r2)
            java.lang.String r18 = p000.AbstractC0782s1.m5326(r5, r2)
            java.lang.String r19 = p000.AbstractC0782s1.m5326(r6, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L6b
            r1 = r0
        L6b:
            if (r1 == 0) goto L73
            long r0 = r1.longValue()
        L71:
            r13 = r0
            goto L78
        L73:
            long r0 = java.lang.System.currentTimeMillis()
            goto L71
        L78:
            xd0 r12 = new xd0
            r12.<init>(r13, r15, r16, r17, r18, r19)
            return r12
    }

    /* JADX INFO: renamed from: α */
    public final java.util.List m6847(java.util.List r14) {
            r13 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r14)
            r14 = 2000(0x7d0, float:2.803E-42)
            ss1 r14 = p000.us1.m5947(r1, r14)
            ng r1 = new ng
            r7 = 0
            r8 = 11
            java.lang.Class<yc0> r4 = p000.yc0.class
            java.lang.String r5 = "normalizeRecord"
            java.lang.String r6 = "normalizeRecord(Lcom/example/dyhelper/hook/contacthide/HiddenContactRecord;)Lcom/example/dyhelper/hook/contacthide/HiddenContactRecord;"
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            y30 r13 = p000.us1.m5943(r14, r1)
            x30 r14 = new x30
            r14.<init>(r13)
        L29:
            boolean r13 = r14.hasNext()
            if (r13 == 0) goto La0
            java.lang.Object r13 = r14.next()
            xd0 r13 = (p000.xd0) r13
            java.lang.String r1 = r13.f12133
            java.lang.String r2 = r13.f12134
            int r3 = r1.length()
            if (r3 <= 0) goto L40
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L4a
            java.lang.String r3 = "uid:"
            java.lang.String r1 = r3.concat(r1)
            goto L50
        L4a:
            java.lang.String r1 = "sec:"
            java.lang.String r1 = p000.lz1.m3687(r1, r2)
        L50:
            java.lang.Object r3 = r0.get(r1)
            xd0 r3 = (p000.xd0) r3
            if (r3 != 0) goto L59
            goto L9c
        L59:
            java.lang.String r4 = r13.f12133
            int r5 = r4.length()
            if (r5 != 0) goto L63
            java.lang.String r4 = r3.f12133
        L63:
            r8 = r4
            int r4 = r2.length()
            if (r4 != 0) goto L6c
            java.lang.String r2 = r3.f12134
        L6c:
            r9 = r2
            java.lang.String r2 = r13.f12135
            int r4 = r2.length()
            if (r4 != 0) goto L77
            java.lang.String r2 = r3.f12135
        L77:
            r10 = r2
            java.lang.String r2 = r13.f12136
            int r4 = r2.length()
            if (r4 != 0) goto L82
            java.lang.String r2 = r3.f12136
        L82:
            r11 = r2
            java.lang.String r2 = r13.f12137
            int r4 = r2.length()
            if (r4 != 0) goto L8d
            java.lang.String r2 = r3.f12137
        L8d:
            r12 = r2
            long r2 = r3.f12138
            long r4 = r13.f12138
            long r6 = java.lang.Math.min(r2, r4)
            xd0 r5 = new xd0
            r5.<init>(r6, r8, r9, r10, r11, r12)
            r13 = r5
        L9c:
            r0.put(r1, r13)
            goto L29
        La0:
            java.util.Collection r13 = r0.values()
            r13.getClass()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            qt r14 = new qt
            r0 = 23
            r14.<init>(r0)
            java.util.List r13 = p000.AbstractC0984xh.m6658(r13, r14)
            return r13
    }
}
