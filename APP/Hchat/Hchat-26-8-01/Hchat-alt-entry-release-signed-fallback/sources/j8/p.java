package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j8.n f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8.y f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb.b f6817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.f f6818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.x f6819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j8.h f6820f;

    public p(android.content.Context r8, h.Hchat.dexkit.DexFinder r9, java.lang.ClassLoader r10, org.luckypray.dexkit.DexKitBridge r11, q8.o r12, i8.f r13) {
            r7 = this;
            r7.<init>()
            j8.n r4 = new j8.n
            i8.f r0 = new i8.f
            r3 = 26
            r0.<init>(r13, r3)
            r4.<init>(r8, r9, r0)
            r7.f6815a = r4
            j8.y r0 = new j8.y
            i8.f r3 = new i8.f
            r5 = 27
            r3.<init>(r13, r5)
            r0.<init>(r8, r9, r3)
            r7.f6816b = r0
            bb.b r0 = new bb.b
            i8.f r5 = new i8.f
            r3 = 28
            r5.<init>(r13, r3)
            r1 = r8
            r2 = r9
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f6817c = r0
            j8.f r0 = new j8.f
            i8.f r3 = new i8.f
            r4 = 29
            r3.<init>(r13, r4)
            r0.<init>(r8, r9, r3)
            r7.f6818d = r0
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            j8.o r3 = new j8.o
            r3.<init>(r13)
            r0.<init>(r9, r3)
            r7.f6819e = r0
            j8.h r0 = new j8.h
            j8.o r3 = new j8.o
            r3.<init>(r13)
            r4 = r11
            r5 = r12
            r6 = r3
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6820f = r0
            return
    }

    public final boolean a(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            j8.n r2 = r3.f6815a
            boolean r4 = r2.r(r4, r5, r0, r1)
            return r4
    }

    public final boolean b(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, byte[] r16, java.lang.String r17) {
            r10 = this;
            androidx.lifecycle.x r0 = r10.f6819e
            r0.getClass()
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r2 = "/0/page-frame.html"
            java.lang.String r3 = "https://servicewechat.com/"
            if (r1 != 0) goto L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = androidx.lifecycle.x.R(r14)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L22:
            r7 = r1
            goto L41
        L24:
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = androidx.lifecycle.x.R(r14)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L22
        L3e:
            java.lang.String r1 = "https://weixin.qq.com/"
            goto L22
        L41:
            java.lang.String r8 = "miniprogramType"
            r1 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "userName"
            java.lang.String r4 = "path"
            java.lang.String r6 = "webpageUrl"
            r3 = r14
            r5 = r15
            java.lang.Object[] r14 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9}
            java.lang.Object[][] r14 = androidx.lifecycle.x.q(r14)
            java.lang.String r4 = "description"
            java.lang.String r6 = "thumbData"
            java.lang.String r2 = "title"
            r3 = r12
            r5 = r13
            r7 = r16
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7}
            java.lang.Object[][] r12 = androidx.lifecycle.x.q(r12)
            java.lang.String r13 = "com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject"
            java.lang.Object r12 = r0.D(r13, r14, r12)
            if (r12 == 0) goto L7c
            r13 = r17
            boolean r11 = r0.U(r12, r11, r13)
            if (r11 == 0) goto L7c
            r11 = 1
            return r11
        L7c:
            return r1
    }

    public final boolean c(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12, java.lang.String r13) {
            r7 = this;
            java.lang.String r0 = "webpageUrl"
            java.lang.Object[] r11 = new java.lang.Object[]{r0, r11}
            androidx.lifecycle.x r0 = r7.f6819e
            r0.getClass()
            java.lang.Object[][] r11 = androidx.lifecycle.x.q(r11)
            java.lang.String r3 = "description"
            java.lang.String r5 = "thumbData"
            java.lang.String r1 = "title"
            r2 = r9
            r4 = r10
            r6 = r12
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6}
            java.lang.Object[][] r9 = androidx.lifecycle.x.q(r9)
            java.lang.String r10 = "com.tencent.mm.opensdk.modelmsg.WXWebpageObject"
            java.lang.Object r9 = r0.D(r10, r11, r9)
            if (r9 == 0) goto L30
            boolean r8 = r0.U(r9, r8, r13)
            if (r8 == 0) goto L30
            r8 = 1
            return r8
        L30:
            r8 = 0
            return r8
    }
}
