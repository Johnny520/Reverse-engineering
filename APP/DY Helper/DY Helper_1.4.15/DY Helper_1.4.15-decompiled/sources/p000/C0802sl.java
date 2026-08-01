package p000;

/* JADX INFO: renamed from: sl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0802sl extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ java.lang.reflect.Field f9942;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.reflect.Field f9943;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.reflect.Field f9944;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ java.lang.reflect.Field f9945;

    public C0802sl(java.lang.reflect.Field r1, java.lang.reflect.Field r2, java.lang.reflect.Field r3, java.lang.reflect.Field r4) {
            r0 = this;
            r0.f9942 = r1
            r0.f9943 = r2
            r0.f9944 = r3
            r0.f9945 = r4
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r8) {
            r7 = this;
            r8.getClass()
            android.util.LruCache r0 = p000.C0839tl.f10408
            boolean r0 = p000.C0839tl.m5717()
            if (r0 != 0) goto Ld
            goto L11b
        Ld:
            java.lang.Object r0 = r8.f5694
            if (r0 != 0) goto L13
            goto L11b
        L13:
            java.lang.Object r1 = r8.f5691
            if (r1 != 0) goto L19
            goto L11b
        L19:
            java.lang.reflect.Field r2 = r7.f9942
            java.lang.Object r2 = p000.C0839tl.m5715(r1, r2)
            if (r2 != 0) goto L23
            goto L11b
        L23:
            if (r0 == r2) goto L27
            goto L11b
        L27:
            java.lang.reflect.Field r0 = r7.f9943
            java.lang.Object r0 = p000.C0839tl.m5715(r1, r0)
            java.lang.reflect.Field r2 = r7.f9944
            java.lang.Object r2 = p000.C0839tl.m5715(r1, r2)
            java.lang.reflect.Field r7 = r7.f9945
            java.lang.Object r7 = p000.C0839tl.m5715(r1, r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r2, r7}
            java.util.ArrayList r7 = p000.AbstractC0312g7.m2248(r7)
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L119
            java.lang.Object r0 = r7.next()
            android.util.LruCache r2 = p000.C0839tl.f10408
            java.lang.String r2 = "urlList"
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Field r3 = r3.getField(r2)     // Catch: java.lang.Throwable -> L5d
            goto L64
        L5d:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L64:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L69
            r3 = r1
        L69:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            jz r4 = p000.C0450jz.f5672
            if (r3 != 0) goto L8e
            java.lang.Class r3 = r0.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Field r2 = r3.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L7c
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L7c
            goto L83
        L7c:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L83:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L88
            r2 = r1
        L88:
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r3 != 0) goto L8e
            goto Lcf
        L8e:
            java.lang.Object r2 = r3.get(r0)     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L9a:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L9f
            r2 = r1
        L9f:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto La6
            java.util.List r2 = (java.util.List) r2
            goto La7
        La6:
            r2 = r1
        La7:
            if (r2 == 0) goto Lcb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lb2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r2.next()
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto Lc3
            java.lang.String r5 = (java.lang.String) r5
            goto Lc4
        Lc3:
            r5 = r1
        Lc4:
            if (r5 == 0) goto Lb2
            r3.add(r5)
            goto Lb2
        Lca:
            r1 = r3
        Lcb:
            if (r1 != 0) goto Lce
            goto Lcf
        Lce:
            r4 = r1
        Lcf:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto Ld7
            goto L45
        Ld7:
            java.util.Iterator r1 = r4.iterator()
        Ldb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = p000.q02.m4671(r2)
            if (r3 != 0) goto Ldb
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.lang.String r3 = "watermark"
            r4 = 0
            boolean r3 = p000.q02.m4654(r2, r3, r4)
            if (r3 != 0) goto Ldb
            java.lang.String r3 = "download-webp"
            boolean r3 = p000.q02.m4654(r2, r3, r4)
            if (r3 != 0) goto Ldb
            java.lang.String r3 = "has_watermark=1"
            boolean r3 = p000.q02.m4654(r2, r3, r4)
            if (r3 != 0) goto Ldb
            java.lang.String r3 = "is_watermarked=1"
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L118
            goto Ldb
        L118:
            r1 = r0
        L119:
            if (r1 != 0) goto L11c
        L11b:
            return
        L11c:
            r8.m3107(r1)
            java.lang.String r7 = "DYHelper_ImageWatermark"
            java.lang.String r8 = "替换评论图片保存源: download_url -> 原图候选"
            p000.C0888ux.m5975(r7, r8)
            return
    }
}
