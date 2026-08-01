package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BookmarkNativeJump {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump INSTANCE = null;
    private static final java.lang.String TAG = "r8019613efb2e496";

    static {
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r0 = new com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE = r0
            return
    }

    private BookmarkNativeJump() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<java.lang.String> buildProfileSchemaCandidates(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "snssdk1128"
            java.lang.String r1 = "aweme"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = p000.q02.m4671(r4)
            if (r2 != 0) goto L2e
            java.lang.String r2 = buildProfileSchemaCandidates$buildUri(r4, r5, r1, r4)
            r3.add(r2)
        L2e:
            boolean r2 = p000.q02.m4671(r4)
            if (r2 == 0) goto L41
            boolean r2 = p000.q02.m4671(r5)
            if (r2 != 0) goto L41
            java.lang.String r2 = buildProfileSchemaCandidates$buildUri(r4, r5, r1, r5)
            r3.add(r2)
        L41:
            r2 = 0
            java.lang.String r1 = buildProfileSchemaCandidates$buildUri(r4, r5, r1, r2)
            r3.add(r1)
            goto L15
        L4a:
            java.util.List r3 = p000.AbstractC0984xh.m6633(r3)
            return r3
    }

    private static final java.lang.String buildProfileSchemaCandidates$buildUri(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r3 = r0.scheme(r3)
            java.lang.String r0 = "user"
            android.net.Uri$Builder r3 = r3.authority(r0)
            java.lang.String r0 = "profile"
            android.net.Uri$Builder r3 = r3.appendPath(r0)
            if (r4 == 0) goto L21
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L1e
            goto L21
        L1e:
            r3.appendPath(r4)
        L21:
            boolean r4 = p000.q02.m4671(r1)
            if (r4 != 0) goto L36
            java.lang.String r4 = "uid"
            r3.appendQueryParameter(r4, r1)
            java.lang.String r4 = "id"
            r3.appendQueryParameter(r4, r1)
            java.lang.String r4 = "user_id"
            r3.appendQueryParameter(r4, r1)
        L36:
            boolean r1 = p000.q02.m4671(r2)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "sec_user_id"
            r3.appendQueryParameter(r1, r2)
            java.lang.String r1 = "sec_uid"
            r3.appendQueryParameter(r1, r2)
            java.lang.String r1 = "secUid"
            r3.appendQueryParameter(r1, r2)
        L4b:
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "dyhelper_profile_bookmark"
            r3.appendQueryParameter(r1, r2)
            android.net.Uri r1 = r3.build()
            java.lang.String r1 = r1.toString()
            r1.getClass()
            return r1
    }

    private final java.util.List<java.lang.String> buildVideoSchemaCandidates(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1) {
            r0 = this;
            java.lang.String r1 = r1.getAwemeId()
            java.util.List r0 = r0.buildVideoSchemaCandidates(r1)
            return r0
    }

    private final java.util.List<java.lang.String> buildVideoSchemaCandidates(java.lang.String r4) {
            r3 = this;
            java.lang.String r3 = android.net.Uri.encode(r4)
            java.lang.String r4 = "snssdk1128://aweme/detail/"
            java.lang.String r4 = p000.lz1.m3687(r4, r3)
            java.lang.String r0 = "aweme://aweme/detail/"
            java.lang.String r0 = p000.lz1.m3687(r0, r3)
            java.lang.String r1 = "snssdk1128://aweme/detail/?aweme_id="
            java.lang.String r1 = p000.lz1.m3687(r1, r3)
            java.lang.String r2 = "aweme://aweme/detail/?aweme_id="
            java.lang.String r3 = p000.lz1.m3687(r2, r3)
            java.lang.String[] r3 = new java.lang.String[]{r4, r0, r1, r3}
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)
            return r3
    }

    private final boolean jumpToVideoOnly(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3) {
            r1 = this;
            java.lang.String r0 = r3.getAwemeId()
            java.util.List r0 = r1.buildVideoSchemaCandidates(r0)
            java.lang.String r3 = r3.getAwemeId()
            boolean r1 = r1.jumpToVideoSchemas(r2, r0, r3)
            return r1
    }

    private final boolean jumpToVideoSchemas(android.app.Activity r7, java.util.List<java.lang.String> r8, java.lang.String r9) {
            r6 = this;
            java.util.Iterator r6 = r8.iterator()
        L4:
            boolean r8 = r6.hasNext()
            r0 = 4
            java.lang.String r1 = "r8019613efb2e496"
            r2 = 0
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "trying video-only schema: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L58
            r3.append(r8)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L58
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)     // Catch: java.lang.Throwable -> L58
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r5 = android.net.Uri.parse(r8)     // Catch: java.lang.Throwable -> L58
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L58
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r3.addFlags(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r7.getPackageName()     // Catch: java.lang.Throwable -> L58
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L58
            r7.startActivity(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "video-only jump started, awemeId="
            r3.append(r4)     // Catch: java.lang.Throwable -> L58
            r3.append(r9)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L58
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)     // Catch: java.lang.Throwable -> L58
            r6 = 1
            return r6
        L58:
            r0 = move-exception
            java.lang.String r2 = "schema failed: "
            p000.AbstractC0602nx.m4145(r2, r8, r1, r0)
            goto L4
        L5f:
            java.lang.String r6 = "all video-only schemas failed"
            p000.C0888ux.m5988(r1, r6, r2, r0, r2)
            r6 = 0
            return r6
    }

    private final boolean openProfileActivityExplicitly(android.app.Activity r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r4 = "r8019613efb2e496"
            java.lang.String r0 = "profile jump via explicit UserProfileActivity uid="
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r1 = p000.qe0.m4877(r2, r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L1c
            r5 = 0
            goto L77
        L1c:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L3c
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r1)     // Catch: java.lang.Throwable -> L3c
            boolean r1 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L3e
            java.lang.String r1 = "uid"
            r2.putExtra(r1, r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "id"
            r2.putExtra(r1, r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "user_id"
            r2.putExtra(r1, r6)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r5 = move-exception
            goto L7c
        L3e:
            boolean r1 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L53
            java.lang.String r1 = "sec_user_id"
            r2.putExtra(r1, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "sec_uid"
            r2.putExtra(r1, r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = "secUid"
            r2.putExtra(r1, r7)     // Catch: java.lang.Throwable -> L3c
        L53:
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = "dyhelper_profile_bookmark"
            r2.putExtra(r1, r3)     // Catch: java.lang.Throwable -> L3c
            r5.startActivity(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            r5.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = " secUid="
            r5.append(r6)     // Catch: java.lang.Throwable -> L3c
            r5.append(r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3c
            r6 = 4
            r7 = 0
            p000.C0888ux.m5988(r4, r5, r7, r6, r7)     // Catch: java.lang.Throwable -> L3c
            r5 = 1
        L77:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            goto L82
        L7c:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L82:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 == 0) goto L8d
            java.lang.String r7 = "explicit UserProfileActivity jump failed"
            p000.C0888ux.m5977(r4, r7, r6)
        L8d:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L94
            r5 = r4
        L94:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
    }

    private final boolean openProfileBySmartRouter(android.app.Activity r18, java.util.List<java.lang.String> r19) {
            r17 = this;
            java.lang.String r1 = "r8019613efb2e496"
            java.lang.Class r0 = r18.getClass()
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r3 = 0
            if (r2 != 0) goto L11
        Ld:
            r17 = r3
            goto L133
        L11:
            java.lang.String r0 = "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r4 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r4 = r0.iterator()
        L29:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r0 = p000.qe0.m4877(r2, r0)     // Catch: java.lang.Throwable -> L3a
            goto L41
        L3a:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L41:
            boolean r5 = r0 instanceof p000.eo1
            r6 = 0
            if (r5 == 0) goto L47
            r0 = r6
        L47:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L4c
            goto L29
        L4c:
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r5 = r0.length
            r7 = r3
        L55:
            r8 = 1
            if (r7 >= r5) goto L8e
            r9 = r0[r7]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "buildRoute"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L8b
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 2
            if (r10 != r11) goto L8b
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r3]
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L8b
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r8]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L8b
            goto L8f
        L8b:
            int r7 = r7 + 1
            goto L55
        L8e:
            r9 = r6
        L8f:
            if (r9 != 0) goto L92
            goto L29
        L92:
            java.util.Iterator r5 = r19.iterator()
        L96:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L12f
            java.lang.Object r0 = r5.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r10 = 4
            r11 = r18
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r7}     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r0 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> Lea
            if (r0 != 0) goto Lb1
            goto L96
        Lb1:
            java.lang.Class r12 = r0.getClass()     // Catch: java.lang.Throwable -> Lea
            java.lang.reflect.Method[] r12 = r12.getMethods()     // Catch: java.lang.Throwable -> Lea
            r12.getClass()     // Catch: java.lang.Throwable -> Lea
            int r13 = r12.length     // Catch: java.lang.Throwable -> Lea
            r14 = r3
        Lbe:
            if (r14 >= r13) goto Lee
            r15 = r12[r14]     // Catch: java.lang.Throwable -> Lea
            r17 = r3
            java.lang.String r3 = r15.getName()     // Catch: java.lang.Throwable -> Le6
            r16 = r8
            java.lang.String r8 = "open"
            boolean r3 = p000.ln0.m3626(r3, r8)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ldf
            java.lang.Class[] r3 = r15.getParameterTypes()     // Catch: java.lang.Throwable -> Ldd
            r3.getClass()     // Catch: java.lang.Throwable -> Ldd
            int r3 = r3.length     // Catch: java.lang.Throwable -> Ldd
            if (r3 != 0) goto Ldf
            goto Lf3
        Ldd:
            r0 = move-exception
            goto L11f
        Ldf:
            int r14 = r14 + 1
            r3 = r17
            r8 = r16
            goto Lbe
        Le6:
            r0 = move-exception
        Le7:
            r16 = r8
            goto L11f
        Lea:
            r0 = move-exception
            r17 = r3
            goto Le7
        Lee:
            r17 = r3
            r16 = r8
            r15 = r6
        Lf3:
            if (r15 != 0) goto Lfa
        Lf5:
            r3 = r17
            r8 = r16
            goto L96
        Lfa:
            java.lang.Object r0 = r15.invoke(r0, r6)     // Catch: java.lang.Throwable -> Ldd
            boolean r3 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L10a
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Ldd
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Lf5
        L10a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r0.<init>()     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r3 = "profile jump via SmartRouter route="
            r0.append(r3)     // Catch: java.lang.Throwable -> Ldd
            r0.append(r7)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldd
            p000.C0888ux.m5988(r1, r0, r6, r10, r6)     // Catch: java.lang.Throwable -> Ldd
            return r16
        L11f:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "SmartRouter profile route failed route="
            java.lang.String r8 = " err="
            java.lang.String r0 = p000.a12.m18(r3, r7, r8, r0)
            p000.C0888ux.m5988(r1, r0, r6, r10, r6)
            goto Lf5
        L12f:
            r11 = r18
            goto L29
        L133:
            return r17
    }

    private final java.lang.Object walkForPageParam(java.lang.Object r7, int r8, java.util.Set<java.lang.Object> r9) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto La8
            r1 = 6
            if (r8 <= r1) goto L8
            goto La8
        L8:
            java.lang.Class r1 = r7.getClass()
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E1346FF1258BD4730B619814EC11C79EF1584E39A35A58F164D327A9F9C3714A163C8E912E"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            return r7
        L1d:
            boolean r2 = r1.isPrimitive()
            if (r2 != 0) goto La8
            boolean r2 = r7 instanceof java.lang.String
            if (r2 != 0) goto La8
            boolean r2 = r7 instanceof java.lang.Number
            if (r2 != 0) goto La8
            boolean r2 = r7 instanceof java.lang.Boolean
            if (r2 == 0) goto L30
            return r0
        L30:
            boolean r2 = r9.add(r7)
            if (r2 != 0) goto L38
            goto La8
        L38:
            boolean r2 = r7 instanceof java.lang.Iterable
            r3 = 1
            if (r2 == 0) goto L58
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r6 = r7.iterator()
        L43:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La8
            java.lang.Object r7 = r6.next()
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
            int r2 = r8 + 1
            java.lang.Object r7 = r1.walkForPageParam(r7, r2, r9)
            if (r7 == 0) goto L43
            return r7
        L58:
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L75
            int r1 = java.lang.reflect.Array.getLength(r7)
            r2 = 0
        L63:
            if (r2 >= r1) goto La8
            java.lang.Object r4 = java.lang.reflect.Array.get(r7, r2)
            int r5 = r8 + 1
            java.lang.Object r4 = r6.walkForPageParam(r4, r5, r9)
            if (r4 == 0) goto L72
            return r4
        L72:
            int r2 = r2 + 1
            goto L63
        L75:
            if (r1 == 0) goto La8
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto La8
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            τ r2 = p000.h62.m2434(r2)
        L87:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.setAccessible(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L87
            int r5 = r8 + 1
            java.lang.Object r4 = r6.walkForPageParam(r4, r5, r9)     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L87
            return r4
        La3:
            java.lang.Class r1 = r1.getSuperclass()
            goto L75
        La8:
            return r0
    }

    public final java.lang.Object findVideoCommentPageParam(java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            r4.getClass()
            java.util.Iterator r4 = r4.iterator()
        L7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r4.next()
            if (r0 == 0) goto L7
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r1.getClass()
            r2 = 0
            java.lang.Object r0 = r3.walkForPageParam(r0, r2, r1)
            if (r0 == 0) goto L7
            return r0
        L27:
            r3 = 0
            return r3
    }

    public final boolean jump(android.app.Activity r1, java.lang.ClassLoader r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            boolean r0 = r0.jumpToVideoOnly(r1, r3)
            return r0
    }

    public final boolean jumpToProfile(android.app.Activity r13, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r14) {
            r12 = this;
            r13.getClass()
            r14.getClass()
            java.lang.String r0 = r14.getUid()
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r14.getSecUid()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = p000.q02.m4671(r0)
            r3 = 0
            r4 = 4
            java.lang.String r5 = "r8019613efb2e496"
            r6 = 0
            if (r2 == 0) goto L41
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L41
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "jumpToProfile failed, uid/secUid empty, record="
            r12.<init>(r13)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            p000.C0888ux.m5988(r5, r12, r6, r4, r6)
            return r3
        L41:
            java.util.List r14 = r12.buildProfileSchemaCandidates(r0, r1)
            boolean r2 = r12.openProfileBySmartRouter(r13, r14)
            r7 = 1
            if (r2 == 0) goto L4d
            return r7
        L4d:
            java.util.Iterator r14 = r14.iterator()
        L51:
            boolean r2 = r14.hasNext()
            java.lang.String r8 = ", secUid="
            if (r2 == 0) goto Leb
            java.lang.Object r2 = r14.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r9.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "trying profile schema: "
            r9.append(r10)     // Catch: java.lang.Throwable -> La0
            r9.append(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La0
            p000.C0888ux.m5988(r5, r9, r6, r4, r6)     // Catch: java.lang.Throwable -> La0
            android.content.Intent r9 = new android.content.Intent     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "android.intent.action.VIEW"
            android.net.Uri r11 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> La0
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> La0
            r10 = 268435456(0x10000000, float:2.524355E-29)
            r9.addFlags(r10)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = r13.getPackageName()     // Catch: java.lang.Throwable -> La0
            r9.setPackage(r10)     // Catch: java.lang.Throwable -> La0
            boolean r10 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto La2
            java.lang.String r10 = "uid"
            r9.putExtra(r10, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "id"
            r9.putExtra(r10, r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "user_id"
            r9.putExtra(r10, r0)     // Catch: java.lang.Throwable -> La0
            goto La2
        La0:
            r8 = move-exception
            goto Le4
        La2:
            boolean r10 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> La0
            if (r10 != 0) goto Lb7
            java.lang.String r10 = "sec_user_id"
            r9.putExtra(r10, r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "sec_uid"
            r9.putExtra(r10, r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "secUid"
            r9.putExtra(r10, r1)     // Catch: java.lang.Throwable -> La0
        Lb7:
            java.lang.String r10 = "enter_from"
            java.lang.String r11 = "dyhelper_profile_bookmark"
            r9.putExtra(r10, r11)     // Catch: java.lang.Throwable -> La0
            r13.startActivity(r9)     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r9.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r10 = "profile jump started, uid="
            r9.append(r10)     // Catch: java.lang.Throwable -> La0
            r9.append(r0)     // Catch: java.lang.Throwable -> La0
            r9.append(r8)     // Catch: java.lang.Throwable -> La0
            r9.append(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = ", schema="
            r9.append(r8)     // Catch: java.lang.Throwable -> La0
            r9.append(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> La0
            p000.C0888ux.m5988(r5, r8, r6, r4, r6)     // Catch: java.lang.Throwable -> La0
            return r7
        Le4:
            java.lang.String r9 = "schema failed: "
            p000.AbstractC0602nx.m4145(r9, r2, r5, r8)
            goto L51
        Leb:
            boolean r12 = r12.openProfileActivityExplicitly(r13, r0, r1)
            if (r12 == 0) goto Lf2
            return r7
        Lf2:
            java.lang.String r12 = "all profile schemas failed, uid="
            java.lang.String r12 = p000.a12.m18(r12, r0, r8, r1)
            p000.C0888ux.m5988(r5, r12, r6, r4, r6)
            return r3
    }

    public final boolean jumpToVideo(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = r3.getAwemeId()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "jumpToVideo failed, awemeId empty, record="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 4
            java.lang.String r3 = "r8019613efb2e496"
            r0 = 0
            p000.C0888ux.m5988(r3, r1, r0, r2, r0)
            r1 = 0
            return r1
        L27:
            java.lang.String r0 = r3.getAwemeId()
            java.util.List r0 = r1.buildVideoSchemaCandidates(r0)
            java.lang.String r3 = r3.getAwemeId()
            boolean r1 = r1.jumpToVideoSchemas(r2, r0, r3)
            return r1
    }
}
