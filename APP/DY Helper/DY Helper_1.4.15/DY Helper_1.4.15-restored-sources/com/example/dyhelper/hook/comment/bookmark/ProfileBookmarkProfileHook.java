package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkProfileHook {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook INSTANCE = null;
    private static final java.lang.String MY_PANDA_FRAGMENT = null;
    private static final java.lang.String POST_AWEME_MODEL = null;
    private static final java.lang.String PROFILE_USER_CLASS = null;
    private static final java.lang.String TAG = "rd1d88829108d0f54";
    private static final java.lang.String USER_PANDA_FRAGMENT = null;
    private static final java.lang.String USER_PROFILE_ACTIVITY = null;
    private static volatile android.content.Context appContext;
    private static volatile java.lang.ClassLoader hostClassLoader;
    private static final java.util.concurrent.atomic.AtomicBoolean installed = null;
    private static volatile com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord lastProfileRecord;
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem>> latestAwemeItemsByProfileKey = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE = r0
            java.lang.String r0 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.USER_PROFILE_ACTIVITY = r0
            java.lang.String r0 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654BCB3269353AA13AAC01D1D74242243F4583536FF0BAA7689CC7A0B2BEC39B09E"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.POST_AWEME_MODEL = r0
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A325AEF903414FAFE45A7E3E2147D4EB64C679F2AFDEF96783477651D7DF068CED"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.USER_PANDA_FRAGMENT = r0
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56E12235AEF6A9D8A96D4C6BF6620E3BC7CC2AB8F5AF77DB0E4422D8132D6EA4"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.MY_PANDA_FRAGMENT = r0
            java.lang.String r0 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.PROFILE_USER_CLASS = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.installed = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.latestAwemeItemsByProfileKey = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.$stable = r0
            return
    }

    private ProfileBookmarkProfileHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$cacheCurrentProfileInfo(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, android.app.Activity r1, java.lang.String r2) {
            r0.cacheCurrentProfileInfo(r1, r2)
            return
    }

    public static final /* synthetic */ void access$cacheProfileFromFragment(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, java.lang.Object r1, java.lang.String r2) {
            r0.cacheProfileFromFragment(r1, r2)
            return
    }

    public static final /* synthetic */ void access$cacheProfileFromObject(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, java.lang.Object r1, java.lang.String r2) {
            r0.cacheProfileFromObject(r1, r2)
            return
    }

    public static final /* synthetic */ void access$handleFeedItemListFromModel(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, java.lang.Object r1, java.lang.Object r2) {
            r0.handleFeedItemListFromModel(r1, r2)
            return
    }

    public static final /* synthetic */ void access$handlePostAwemeModelMessage(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, java.lang.Object r1, java.lang.Object r2) {
            r0.handlePostAwemeModelMessage(r1, r2)
            return
    }

    private final void cacheCurrentProfileInfo(android.app.Activity r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "r7d3fbcce43dd94ea"
            java.lang.String r1 = "ra2ee991432cf41a5"
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L16
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord     // Catch: java.lang.Throwable -> L16
            r4 = 0
            if (r3 == 0) goto L18
            java.lang.String r3 = r3.uniqueKey()     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r6 = move-exception
            goto L7a
        L18:
            r3 = r4
        L19:
            if (r3 != 0) goto L1d
            java.lang.String r3 = ""
        L1d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L16
            r5.append(r8)     // Catch: java.lang.Throwable -> L16
            r5.append(r2)     // Catch: java.lang.Throwable -> L16
            r5.append(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L16
            p000.C0888ux.m5985(r1)     // Catch: java.lang.Throwable -> L16
            android.view.Window r1 = r7.getWindow()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L3c
            android.view.View r4 = r1.getDecorView()     // Catch: java.lang.Throwable -> L16
        L3c:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L16
            android.content.Intent r2 = r7.getIntent()     // Catch: java.lang.Throwable -> L16
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r7, r4}     // Catch: java.lang.Throwable -> L16
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r1.findProfileRecordFromRoots(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L50
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r6.scanSupportFragments(r7, r8)     // Catch: java.lang.Throwable -> L16
        L50:
            if (r2 != 0) goto L74
            android.content.Intent r6 = r7.getIntent()     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = r1.dumpIntent(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = r1.dumpShort(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L16
            r1.append(r8)     // Catch: java.lang.Throwable -> L16
            r1.append(r6)     // Catch: java.lang.Throwable -> L16
            r1.append(r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L16
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L16
            return
        L74:
            r6.cacheProfileRecord(r2, r8)     // Catch: java.lang.Throwable -> L16
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L16
            goto L80
        L7a:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L80:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L97
            java.lang.String r7 = r6.getMessage()
            java.lang.String r0 = "cache current profile failed reason="
            java.lang.String r1 = ": "
            java.lang.String r7 = p000.a12.m18(r0, r8, r1, r7)
            java.lang.String r8 = "rd1d88829108d0f54"
            p000.C0888ux.m5977(r8, r7, r6)
        L97:
            return
    }

    private final void cacheProfileFromFragment(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "rdd565d77372ce6c2"
            if (r4 != 0) goto L5
            goto L58
        L5:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L33
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r1.findProfileRecordFromRoots(r2)     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r1.dumpShort(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r1.append(r5)     // Catch: java.lang.Throwable -> L33
            r1.append(r3)     // Catch: java.lang.Throwable -> L33
            r1.append(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L33
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L33
            return
        L33:
            r3 = move-exception
            goto L3b
        L35:
            r3.cacheProfileRecord(r2, r5)     // Catch: java.lang.Throwable -> L33
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L33
            goto L41
        L3b:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L41:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L58
            java.lang.String r4 = r3.getMessage()
            java.lang.String r0 = "cacheProfileFromFragment error reason="
            java.lang.String r1 = ": "
            java.lang.String r4 = p000.a12.m18(r0, r5, r1, r4)
            java.lang.String r5 = "rd1d88829108d0f54"
            p000.C0888ux.m5977(r5, r4, r3)
        L58:
            return
    }

    private final void cacheProfileFromObject(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "rde1c2d22870506a2"
            if (r4 != 0) goto L5
            goto L54
        L5:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L2f
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r1.toProfileRecord(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L31
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r1.dumpShort(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r1.append(r5)     // Catch: java.lang.Throwable -> L2f
            r1.append(r3)     // Catch: java.lang.Throwable -> L2f
            r1.append(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2f
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r3 = move-exception
            goto L37
        L31:
            r3.cacheProfileRecord(r2, r5)     // Catch: java.lang.Throwable -> L2f
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2f
            goto L3d
        L37:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L3d:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L54
            java.lang.String r4 = r3.getMessage()
            java.lang.String r0 = "cacheProfileFromObject error reason="
            java.lang.String r1 = ": "
            java.lang.String r4 = p000.a12.m18(r0, r5, r1, r4)
            java.lang.String r5 = "rd1d88829108d0f54"
            p000.C0888ux.m5977(r5, r4, r3)
        L54:
            return
    }

    private final void cacheProfileRecord(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r23, java.lang.String r24) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            boolean r3 = r22.isUsableProfileRecord(r23)
            if (r3 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "r5def5dd5165d6640"
            r0.<init>(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5985(r0)
            return
        L21:
            java.lang.String r3 = r1.uniqueKey()
            boolean r4 = p000.q02.m4671(r3)
            if (r4 == 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "r267e7507c64cc9bc"
            r0.<init>(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5985(r0)
            return
        L40:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord
            if (r4 == 0) goto L7e
            boolean r5 = r0.isUsableProfileRecord(r4)
            if (r5 == 0) goto L7e
            java.lang.String r5 = r4.uniqueKey()
            boolean r5 = p000.ln0.m3626(r5, r3)
            if (r5 != 0) goto L7e
            int r5 = r22.profileRecordQuality(r23)
            int r0 = r0.profileRecordQuality(r4)
            if (r5 >= r0) goto L7e
            java.lang.String r0 = r1.uniqueKey()
            java.lang.String r1 = r4.uniqueKey()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "r358291efc7784b37"
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5985(r0)
            return
        L7e:
            if (r4 == 0) goto Le4
            java.lang.String r0 = r4.uniqueKey()
            boolean r0 = p000.ln0.m3626(r0, r3)
            if (r0 == 0) goto Le4
            java.lang.String r0 = r1.getNickname()
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L98
            java.lang.String r0 = r4.getNickname()
        L98:
            java.lang.String r3 = r1.getSignature()
            boolean r5 = p000.q02.m4671(r3)
            if (r5 == 0) goto La6
            java.lang.String r3 = r4.getSignature()
        La6:
            r5 = r3
            java.lang.String r3 = r1.getAvatarUrl()
            boolean r6 = p000.q02.m4671(r3)
            if (r6 == 0) goto Lb5
            java.lang.String r3 = r4.getAvatarUrl()
        Lb5:
            r6 = r3
            java.lang.String r3 = r1.getGroup()
            boolean r7 = p000.q02.m4671(r3)
            if (r7 == 0) goto Lc4
            java.lang.String r3 = r4.getGroup()
        Lc4:
            r7 = r3
            r20 = 65475(0xffc3, float:9.175E-41)
            r21 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r4 = r0
            r0 = r24
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto Le7
        Le4:
            r0 = r2
            r1 = r23
        Le7:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord = r1
            java.lang.String r2 = r1.uniqueKey()
            java.lang.String r3 = r1.getUid()
            java.lang.String r4 = r1.getSecUid()
            java.lang.String r1 = r1.getNickname()
            java.lang.String r5 = "r97713f23d3913294"
            java.lang.StringBuilder r0 = p000.lz1.m3695(r5, r0, r2, r3, r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5985(r0)
            return
    }

    private final java.lang.String getStringField(java.lang.Object r7, java.lang.String r8) {
            r6 = this;
            r6 = 0
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L2a
        L5:
            if (r0 == 0) goto L43
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L43
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L2a
            r1.getClass()     // Catch: java.lang.Throwable -> L2a
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2a
            r3 = 0
        L18:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L2a
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L2a
            if (r5 == 0) goto L27
            goto L2d
        L27:
            int r3 = r3 + 1
            goto L18
        L2a:
            r7 = move-exception
            goto L45
        L2c:
            r4 = r6
        L2d:
            if (r4 == 0) goto L3e
            r8 = 1
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L3d
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L2a
        L3d:
            return r6
        L3e:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L2a
            goto L5
        L43:
            r8 = r6
            goto L4a
        L45:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L4a:
            if (r8 == 0) goto L4d
            goto L4e
        L4d:
            r6 = r8
        L4e:
            java.lang.String r6 = (java.lang.String) r6
            return r6
    }

    private final void handleFeedItemListFromModel(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            java.lang.String r0 = "rfb9953027d114767"
            if (r5 == 0) goto L8c
            if (r6 != 0) goto L8
            goto L8c
        L8:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L1e
            goto L8c
        L1e:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L76
            java.util.List r1 = r1.findAwemeItems(r6)     // Catch: java.lang.Throwable -> L76
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L2b
            goto L8c
        L2b:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = r4.resolveProfileRecordFromModelOrList(r5, r6)     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L36
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord     // Catch: java.lang.Throwable -> L76
            if (r4 != 0) goto L36
            goto L8c
        L36:
            java.lang.String r5 = r4.uniqueKey()     // Catch: java.lang.Throwable -> L76
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L41
            goto L8c
        L41:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem>> r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.latestAwemeItemsByProfileKey     // Catch: java.lang.Throwable -> L76
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L76
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L76
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r6.get(r5)     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L56
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L76
            r3 = 1
            r6.updateAwemeSnapshot(r5, r1, r2, r3)     // Catch: java.lang.Throwable -> L76
        L56:
            java.lang.String r4 = r4.displayName()     // Catch: java.lang.Throwable -> L76
            int r6 = r1.size()     // Catch: java.lang.Throwable -> L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L76
            r1.append(r5)     // Catch: java.lang.Throwable -> L76
            r1.append(r4)     // Catch: java.lang.Throwable -> L76
            r1.append(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L76
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L76
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L76
            goto L7d
        L76:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L7d:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L8c
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "rbe16a59a180bc89e"
            p000.AbstractC0602nx.m4142(r5, r4)
        L8c:
            return
    }

    private final void handlePostAwemeModelMessage(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof android.os.Message
            if (r0 == 0) goto L7
            android.os.Message r3 = (android.os.Message) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lb
            goto Lf
        Lb:
            java.lang.Object r3 = r3.obj
            if (r3 != 0) goto L10
        Lf:
            return
        L10:
            r1.handleFeedItemListFromModel(r2, r3)
            return
    }

    private final void hookPostAwemeModel(java.lang.ClassLoader r9) {
            r8 = this;
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.POST_AWEME_MODEL     // Catch: java.lang.Throwable -> L89
            java.lang.Class r9 = p000.qe0.m4877(r9, r0)     // Catch: java.lang.Throwable -> L89
            if (r9 != 0) goto L10
            java.lang.String r8 = "r82114919bc8a8f9b"
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L89
            return
        L10:
            java.lang.String r0 = "handleMsg"
            java.lang.Class<android.os.Message> r1 = android.os.Message.class
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookPostAwemeModel$1$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookPostAwemeModel$1$1     // Catch: java.lang.Throwable -> L89
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L89
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L89
            p000.qe0.m4873(r9, r0, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L89
            r9.getClass()     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            int r1 = r9.length     // Catch: java.lang.Throwable -> L89
            r2 = 0
            r3 = r2
        L2f:
            r4 = 1
            if (r3 >= r1) goto L63
            r5 = r9[r3]     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L89
            java.lang.String r7 = "LJJIIJZLJL"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L60
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L89
            int r6 = r6.length     // Catch: java.lang.Throwable -> L89
            if (r6 != r4) goto L60
            java.lang.Class[] r4 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L89
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "~7954D7E14DB7341B6A011C494738772667DB63664E455DD5DA58ED8F989CACF999AC69E217F86CE29F98764059103120"
            java.lang.String r6 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L89
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L60
            r0.add(r5)     // Catch: java.lang.Throwable -> L89
        L60:
            int r3 = r3 + 1
            goto L2f
        L63:
            java.util.Iterator r9 = r0.iterator()     // Catch: java.lang.Throwable -> L89
        L67:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L81
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L89
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L89
            xq0 r1 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L89
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookPostAwemeModel$1$3$1     // Catch: java.lang.Throwable -> L89
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L89
            r1.m6775(r0, r2)     // Catch: java.lang.Throwable -> L89
            goto L67
        L81:
            java.lang.String r8 = "r5d0d79ce3c5441a4"
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L89
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L90:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto La1
            java.lang.String r9 = r8.getMessage()
            java.lang.String r0 = "hook PostAwemeModel failed: "
            java.lang.String r1 = "rd1d88829108d0f54"
            p000.AbstractC0602nx.m4145(r0, r9, r1, r8)
        La1:
            return
    }

    private final void hookProfileFragments(java.lang.ClassLoader r13) {
            r12 = this;
            java.lang.String r12 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.USER_PANDA_FRAGMENT
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.MY_PANDA_FRAGMENT
            java.lang.String[] r12 = new java.lang.String[]{r12, r0}
            java.util.List r12 = p000.AbstractC1021yh.m6897(r12)
            java.util.Iterator r12 = r12.iterator()
        L10:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L1c4
            java.lang.Object r0 = r12.next()
            java.lang.String r0 = (java.lang.String) r0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            java.lang.Class r2 = p000.qe0.m4877(r13, r0)     // Catch: java.lang.Throwable -> L3c
            s62 r3 = p000.s62.f9751
            if (r2 != 0) goto L3f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "re2b7404ba78efdb1"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r1)     // Catch: java.lang.Throwable -> L3c
            goto L1ab
        L3c:
            r1 = move-exception
            goto L1a6
        L3f:
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "onResume"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1 r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$1$1     // Catch: java.lang.Throwable -> L4d
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4d
            java.util.Set r4 = r4.m6774(r2, r5, r6)     // Catch: java.lang.Throwable -> L4d
            goto L54
        L4d:
            r4 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            r4 = r5
        L54:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L79
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r6.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = "rc2b02f7846ad6b78"
            r6.append(r7)     // Catch: java.lang.Throwable -> L3c
            r6.append(r5)     // Catch: java.lang.Throwable -> L3c
            r6.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L3c
        L79:
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "onViewCreated"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$3$1 r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$3$1     // Catch: java.lang.Throwable -> L87
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L87
            java.util.Set r4 = r4.m6774(r2, r5, r6)     // Catch: java.lang.Throwable -> L87
            goto L8e
        L87:
            r4 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            r4 = r5
        L8e:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto Lb3
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r6.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = "r4815d50da722bee"
            r6.append(r7)     // Catch: java.lang.Throwable -> L3c
            r6.append(r5)     // Catch: java.lang.Throwable -> L3c
            r6.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L3c
        Lb3:
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r5 = "setUserVisibleHint"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$5$1 r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$5$1     // Catch: java.lang.Throwable -> Lc1
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lc1
            java.util.Set r4 = r4.m6774(r2, r5, r6)     // Catch: java.lang.Throwable -> Lc1
            goto Lc8
        Lc1:
            r4 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3c
            r4 = r5
        Lc8:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto Led
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r6.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = "r203990334e4d17f0"
            r6.append(r7)     // Catch: java.lang.Throwable -> L3c
            r6.append(r5)     // Catch: java.lang.Throwable -> L3c
            r6.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r4)     // Catch: java.lang.Throwable -> L3c
        Led:
            java.lang.reflect.Method[] r4 = r2.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3c
            r4.getClass()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r5.<init>()     // Catch: java.lang.Throwable -> L3c
            int r6 = r4.length     // Catch: java.lang.Throwable -> L3c
            r7 = 0
            r8 = r7
        Lfc:
            r9 = 1
            if (r8 >= r6) goto L120
            r10 = r4[r8]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r11 = r11.length     // Catch: java.lang.Throwable -> L3c
            if (r11 != r9) goto L11d
            java.lang.Class[] r9 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r9 = r9[r7]     // Catch: java.lang.Throwable -> L3c
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.PROFILE_USER_CLASS     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.equals(r11)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L11d
            r5.add(r10)     // Catch: java.lang.Throwable -> L3c
        L11d:
            int r8 = r8 + 1
            goto Lfc
        L120:
            java.util.Iterator r4 = r5.iterator()     // Catch: java.lang.Throwable -> L3c
        L124:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L191
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L3c
            r5.setAccessible(r9)     // Catch: java.lang.Throwable -> L15e
            xq0 r6 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L15e
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$8$1$1 r7 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookProfileFragments$1$1$8$1$1     // Catch: java.lang.Throwable -> L15e
            r7.<init>(r1, r2, r5)     // Catch: java.lang.Throwable -> L15e
            r6.m6775(r5, r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r6 = r2.getName()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L15e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15e
            r8.<init>()     // Catch: java.lang.Throwable -> L15e
            java.lang.String r10 = "ra06b2b8bdd621a68"
            r8.append(r10)     // Catch: java.lang.Throwable -> L15e
            r8.append(r6)     // Catch: java.lang.Throwable -> L15e
            r8.append(r7)     // Catch: java.lang.Throwable -> L15e
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L15e
            p000.C0888ux.m5985(r6)     // Catch: java.lang.Throwable -> L15e
            r7 = r3
            goto L164
        L15e:
            r6 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L3c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L3c
        L164:
            java.lang.Throwable r6 = p000.fo1.m2190(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L124
            java.lang.String r7 = r2.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r8.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = "rc75b6e7e9328aa23"
            r8.append(r10)     // Catch: java.lang.Throwable -> L3c
            r8.append(r7)     // Catch: java.lang.Throwable -> L3c
            r8.append(r5)     // Catch: java.lang.Throwable -> L3c
            r8.append(r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r5)     // Catch: java.lang.Throwable -> L3c
            goto L124
        L191:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r1.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "rb629cd816f460a34"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3c
            r1.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            p000.C0888ux.m5985(r1)     // Catch: java.lang.Throwable -> L3c
            goto L1ab
        L1a6:
            eo1 r3 = new eo1
            r3.<init>(r1)
        L1ab:
            java.lang.Throwable r1 = p000.fo1.m2190(r3)
            if (r1 == 0) goto L10
            java.lang.String r2 = r1.getMessage()
            java.lang.String r3 = "hook profile fragment failed "
            java.lang.String r4 = ": "
            java.lang.String r0 = p000.a12.m18(r3, r0, r4, r2)
            java.lang.String r2 = "rd1d88829108d0f54"
            p000.C0888ux.m5977(r2, r0, r1)
            goto L10
        L1c4:
            return
    }

    private final void hookUserProfileActivity(java.lang.ClassLoader r4) {
            r3 = this;
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.USER_PROFILE_ACTIVITY     // Catch: java.lang.Throwable -> L38
            java.lang.Class r4 = p000.qe0.m4877(r4, r0)     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L10
            java.lang.String r3 = "rbd1f99afa1f7b172"
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L38
            return
        L10:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "onCreate"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$1     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            r0.m6774(r4, r1, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "onResume"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$2 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$2     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            r0.m6774(r4, r1, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = "onWindowFocusChanged"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$3 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook$hookUserProfileActivity$1$3     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            r0.m6774(r4, r1, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "r7e0847cbdaa89875"
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L38
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L3f:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L50
            java.lang.String r4 = r3.getMessage()
            java.lang.String r0 = "hook UserProfileActivity failed: "
            java.lang.String r1 = "rd1d88829108d0f54"
            p000.AbstractC0602nx.m4145(r0, r4, r1, r3)
        L50:
            return
    }

    private final java.lang.Object invokeNoArg(java.lang.Object r7, java.lang.String r8) {
            r6 = this;
            r6 = 0
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L31
        L5:
            if (r0 == 0) goto L47
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L47
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L31
            r1.getClass()     // Catch: java.lang.Throwable -> L31
            int r2 = r1.length     // Catch: java.lang.Throwable -> L31
            r3 = 0
        L18:
            if (r3 >= r2) goto L36
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L31
            boolean r5 = p000.ln0.m3626(r5, r8)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L31
            r5.getClass()     // Catch: java.lang.Throwable -> L31
            int r5 = r5.length     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto L33
            goto L37
        L31:
            r7 = move-exception
            goto L49
        L33:
            int r3 = r3 + 1
            goto L18
        L36:
            r4 = r6
        L37:
            if (r4 == 0) goto L42
            r8 = 1
            r4.setAccessible(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r4.invoke(r7, r6)     // Catch: java.lang.Throwable -> L31
            return r6
        L42:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L31
            goto L5
        L47:
            r8 = r6
            goto L4e
        L49:
            eo1 r8 = new eo1
            r8.<init>(r7)
        L4e:
            if (r8 == 0) goto L51
            goto L52
        L51:
            r6 = r8
        L52:
            return r6
    }

    private final boolean isUsableProfileRecord(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r5) {
            r4 = this;
            java.lang.String r4 = r5.getUid()
            boolean r4 = p000.q02.m4671(r4)
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L26
            java.lang.String r4 = r5.getUid()
            r2 = r1
        L11:
            int r3 = r4.length()
            if (r2 >= r3) goto L26
            char r3 = r4.charAt(r2)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 != 0) goto L23
            r4 = r1
            goto L27
        L23:
            int r2 = r2 + 1
            goto L11
        L26:
            r4 = r0
        L27:
            java.lang.String r2 = r5.getSecUid()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L64
            java.lang.String r2 = r5.getSecUid()
            java.lang.String r3 = "-1"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L62
            java.lang.String r2 = r5.getSecUid()
            java.lang.String r3 = "true"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L62
            java.lang.String r2 = r5.getSecUid()
            java.lang.String r3 = "false"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L62
            java.lang.String r2 = r5.getSecUid()
            int r2 = r2.length()
            r3 = 8
            if (r2 < r3) goto L62
            goto L64
        L62:
            r2 = r1
            goto L65
        L64:
            r2 = r0
        L65:
            if (r4 == 0) goto L7e
            if (r2 == 0) goto L7e
            java.lang.String r4 = r5.getUid()
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L7d
            java.lang.String r4 = r5.getSecUid()
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L7e
        L7d:
            return r0
        L7e:
            return r1
    }

    private final int profileRecordQuality(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4) {
            r3 = this;
            java.lang.String r3 = r4.getUid()
            boolean r3 = p000.q02.m4671(r3)
            r0 = 0
            if (r3 != 0) goto L25
            java.lang.String r3 = r4.getUid()
            r1 = r0
        L10:
            int r2 = r3.length()
            if (r1 >= r2) goto L24
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L21
            goto L25
        L21:
            int r1 = r1 + 1
            goto L10
        L24:
            r0 = 2
        L25:
            java.lang.String r3 = r4.getSecUid()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L3d
            java.lang.String r3 = r4.getSecUid()
            int r3 = r3.length()
            r1 = 8
            if (r3 < r1) goto L3d
            int r0 = r0 + 3
        L3d:
            java.lang.String r3 = r4.getNickname()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L49
            int r0 = r0 + 1
        L49:
            return r0
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord resolveProfileRecordFromModelOrList(java.lang.Object r31, java.lang.Object r32) {
            r30 = this;
            r0 = r30
            r1 = r31
            java.lang.String r2 = "h"
            java.lang.String r2 = r0.getStringField(r1, r2)
            java.lang.String r3 = "i"
            java.lang.String r1 = r0.getStringField(r1, r3)
            r3 = 0
            r4 = 0
            java.lang.Class r0 = r32.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
            int r5 = r0.length     // Catch: java.lang.Throwable -> L3a
            r6 = r3
        L1f:
            if (r6 >= r5) goto L3f
            r7 = r0[r6]     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r9 = "getUid"
            boolean r8 = p000.ln0.m3626(r8, r9)     // Catch: java.lang.Throwable -> L3a
            if (r8 == 0) goto L3c
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L3a
            r8.getClass()     // Catch: java.lang.Throwable -> L3a
            int r8 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r8 != 0) goto L3c
            goto L40
        L3a:
            r0 = move-exception
            goto L51
        L3c:
            int r6 = r6 + 1
            goto L1f
        L3f:
            r7 = r4
        L40:
            if (r7 == 0) goto L4f
            r0 = r32
            java.lang.Object r0 = r7.invoke(r0, r4)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L4f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            goto L57
        L4f:
            r0 = r4
            goto L57
        L51:
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L57:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L5c
            r0 = r4
        L5c:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = ""
            if (r0 != 0) goto L63
            r0 = r5
        L63:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord
            if (r6 == 0) goto L6c
            java.lang.String r7 = r6.getUid()
            goto L6d
        L6c:
            r7 = r4
        L6d:
            if (r6 == 0) goto L74
            java.lang.String r8 = r6.getSecUid()
            goto L75
        L74:
            r8 = r4
        L75:
            boolean r9 = p000.q02.m4671(r0)
            if (r9 != 0) goto L7d
            r10 = r0
            goto Lc9
        L7d:
            if (r7 == 0) goto L88
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L86
            goto L88
        L86:
            r10 = r7
            goto Lc9
        L88:
            if (r2 == 0) goto La8
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto L91
            goto La8
        L91:
            r0 = r3
        L92:
            int r7 = r2.length()
            if (r0 >= r7) goto La6
            char r7 = r2.charAt(r0)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto La3
            goto La8
        La3:
            int r0 = r0 + 1
            goto L92
        La6:
            r10 = r2
            goto Lc9
        La8:
            if (r1 == 0) goto Lc8
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto Lb1
            goto Lc8
        Lb1:
            r0 = r3
        Lb2:
            int r7 = r1.length()
            if (r0 >= r7) goto Lc6
            char r7 = r1.charAt(r0)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto Lc3
            goto Lc8
        Lc3:
            int r0 = r0 + 1
            goto Lb2
        Lc6:
            r10 = r1
            goto Lc9
        Lc8:
            r10 = r5
        Lc9:
            if (r8 == 0) goto Ld4
            boolean r0 = p000.q02.m4671(r8)
            if (r0 == 0) goto Ld2
            goto Ld4
        Ld2:
            r11 = r8
            goto L112
        Ld4:
            if (r2 == 0) goto Lf3
            boolean r0 = p000.q02.m4671(r2)
            if (r0 == 0) goto Ldd
            goto Lf3
        Ldd:
            r0 = r3
        Lde:
            int r7 = r2.length()
            if (r0 >= r7) goto Lf3
            char r7 = r2.charAt(r0)
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 != 0) goto Lf0
            r11 = r2
            goto L112
        Lf0:
            int r0 = r0 + 1
            goto Lde
        Lf3:
            if (r1 == 0) goto L111
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto Lfc
            goto L111
        Lfc:
            int r0 = r1.length()
            if (r3 >= r0) goto L111
            char r0 = r1.charAt(r3)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L10e
            r11 = r1
            goto L112
        L10e:
            int r3 = r3 + 1
            goto Lfc
        L111:
            r11 = r5
        L112:
            boolean r0 = p000.q02.m4671(r10)
            if (r0 == 0) goto L11f
            boolean r0 = p000.q02.m4671(r11)
            if (r0 == 0) goto L11f
            return r4
        L11f:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r9 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord
            if (r6 == 0) goto L128
            java.lang.String r0 = r6.getNickname()
            goto L129
        L128:
            r0 = r4
        L129:
            if (r0 != 0) goto L12d
            r12 = r5
            goto L12e
        L12d:
            r12 = r0
        L12e:
            if (r6 == 0) goto L135
            java.lang.String r0 = r6.getSignature()
            goto L136
        L135:
            r0 = r4
        L136:
            if (r0 != 0) goto L13a
            r13 = r5
            goto L13b
        L13a:
            r13 = r0
        L13b:
            if (r6 == 0) goto L142
            java.lang.String r0 = r6.getAvatarUrl()
            goto L143
        L142:
            r0 = r4
        L143:
            if (r0 != 0) goto L147
            r14 = r5
            goto L148
        L147:
            r14 = r0
        L148:
            if (r6 == 0) goto L14e
            java.lang.String r4 = r6.getGroup()
        L14e:
            if (r4 != 0) goto L152
            r15 = r5
            goto L153
        L152:
            r15 = r4
        L153:
            r28 = 65472(0xffc0, float:9.1746E-41)
            r29 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r9
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord scanFragmentManager(java.lang.Object r5, java.lang.String r6, int r7, java.util.IdentityHashMap<java.lang.Object, java.lang.Boolean> r8) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 4
            if (r7 <= r1) goto L8
            return r0
        L8:
            boolean r1 = r8.containsKey(r5)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.put(r5, r1)
            java.lang.String r1 = "getFragments"
            java.lang.Object r5 = r4.invokeNoArg(r5, r1)     // Catch: java.lang.Throwable -> L21
            boolean r1 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L21
            goto L2b
        L21:
            r5 = move-exception
            goto L25
        L23:
            r5 = r0
            goto L2b
        L25:
            eo1 r1 = new eo1
            r1.<init>(r5)
            r5 = r1
        L2b:
            boolean r1 = r5 instanceof p000.eo1
            if (r1 == 0) goto L30
            r5 = r0
        L30:
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L36
            jz r5 = p000.C0450jz.f5672
        L36:
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L90
            java.lang.Object r1 = r5.next()
            if (r1 == 0) goto L3a
            boolean r2 = r8.containsKey(r1)
            if (r2 != 0) goto L3a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r8.put(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[]{r1}
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r2.findProfileRecordFromRoots(r3)
            if (r2 == 0) goto L81
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r2.uniqueKey()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "rf10cad313c61db93"
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            p000.C0888ux.m5985(r4)
            return r2
        L81:
            java.lang.String r2 = "getChildFragmentManager"
            java.lang.Object r1 = r4.invokeNoArg(r1, r2)
            int r2 = r7 + 1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r4.scanFragmentManager(r1, r6, r2, r8)
            if (r1 == 0) goto L3a
            return r1
        L90:
            return r0
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord scanSupportFragments(android.app.Activity r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "getSupportFragmentManager"
            java.lang.Object r4 = r3.invokeNoArg(r4, r1)     // Catch: java.lang.Throwable -> L16
            if (r4 != 0) goto Lb
            r3 = r0
            goto L1d
        Lb:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            r2 = 0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3 = r3.scanFragmentManager(r4, r5, r2, r1)     // Catch: java.lang.Throwable -> L16
            goto L1d
        L16:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L1d:
            java.lang.Throwable r4 = p000.fo1.m2190(r3)
            if (r4 == 0) goto L2c
            java.lang.String r4 = r4.getMessage()
            java.lang.String r1 = "r89361a1d24f363b3"
            p000.AbstractC0602nx.m4121(r1, r5, r4)
        L2c:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L31
            goto L32
        L31:
            r0 = r3
        L32:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r0
            return r0
    }

    public static /* synthetic */ void toggleCurrentProfileBookmark$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0, android.app.Activity r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r0.toggleCurrentProfileBookmark(r1, r2)
            return
    }

    private static final p000.s62 toggleProfileBookmark$lambda$52(java.lang.String r4, android.app.Activity r5, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6) {
            r6.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            r0.add(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem>> r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.latestAwemeItemsByProfileKey
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L14
            jz r1 = p000.C0450jz.f5672
        L14:
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L25
            int r2 = r1.size()
            r0.updateAwemeSnapshot(r4, r1, r2, r3)
            r0.markRead(r4)
        L25:
            java.lang.String r4 = r6.getGroup()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "已添加主页书签 ["
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = "]"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r5, r4, r3)
            r4.show()
            s62 r4 = p000.s62.f9751
            return r4
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ p000.s62 m1458(java.lang.String r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2) {
            s62 r0 = toggleProfileBookmark$lambda$52(r0, r1, r2)
            return r0
    }

    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord getLastProfileRecord() {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord
            return r0
    }

    public final java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem> getLatestAwemeItems(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem>> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.latestAwemeItemsByProfileKey
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            jz r0 = p000.C0450jz.f5672
        Lf:
            return r0
    }

    public final void init(android.content.Context r3, java.lang.ClassLoader r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r3 = r0
        Le:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.appContext = r3
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.hostClassLoader = r4
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.appContext
            r0.getClass()
            r3.init(r0)
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r3 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.appContext
            r0.getClass()
            r3.init(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.installed
            r0 = 0
            r1 = 1
            boolean r3 = r3.compareAndSet(r0, r1)
            if (r3 != 0) goto L31
            return
        L31:
            r2.hookUserProfileActivity(r4)
            r2.hookProfileFragments(r4)
            r2.hookPostAwemeModel(r4)
            return
    }

    public final void toggleCurrentProfileBookmark(android.app.Activity r25, java.lang.String r26) {
            r24 = this;
            r0 = r24
            r1 = r25
            r1.getClass()
            r26.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord
            if (r2 == 0) goto L13
            java.lang.String r3 = r2.uniqueKey()
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 != 0) goto L18
            java.lang.String r3 = ""
        L18:
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "rfb641bf00383e452"
            p000.AbstractC0602nx.m4121(r5, r3, r4)
            if (r2 == 0) goto L34
            java.lang.String r3 = r2.uniqueKey()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L32
            goto L34
        L32:
            r3 = r2
            goto L3c
        L34:
            java.lang.String r2 = "toggleCurrentProfileBookmark"
            r0.cacheCurrentProfileInfo(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.lastProfileRecord
            goto L32
        L3c:
            if (r3 == 0) goto L75
            java.lang.String r2 = r3.uniqueKey()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L49
            goto L75
        L49:
            boolean r2 = p000.q02.m4671(r26)
            if (r2 != 0) goto L71
            r22 = 65503(0xffdf, float:9.1789E-41)
            r23 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r9 = r26
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L71:
            r0.toggleProfileBookmark(r1, r3)
            return
        L75:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE
            android.content.Intent r2 = r1.getIntent()
            java.lang.String r2 = r0.dumpIntent(r2)
            java.lang.String r0 = r0.dumpShort(r1)
            java.lang.String r3 = "r230ae7157611e050"
            p000.AbstractC0602nx.m4121(r3, r2, r0)
            java.lang.String r0 = "未识别到当前主页信息，请稍等主页加载完成后重试"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            return
    }

    public final void toggleProfileBookmark(android.app.Activity r4, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            android.content.Context r1 = r4.getApplicationContext()
            if (r1 != 0) goto Lf
            r1 = r4
        Lf:
            r0.init(r1)
            boolean r3 = r3.isUsableProfileRecord(r5)
            r1 = 0
            if (r3 != 0) goto L34
            java.lang.String r3 = "未识别到作品作者主页信息"
            android.widget.Toast r3 = android.widget.Toast.makeText(r4, r3, r1)
            r3.show()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "rada9d489d707677d"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            p000.C0888ux.m5985(r3)
            return
        L34:
            java.lang.String r3 = r5.uniqueKey()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2 = r0.get(r3)
            if (r2 == 0) goto L4b
            r0.remove(r3)
            java.lang.String r3 = "已取消主页书签"
            android.widget.Toast r3 = android.widget.Toast.makeText(r4, r3, r1)
            r3.show()
            return
        L4b:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog
            fj1 r1 = new fj1
            r1.<init>(r3, r4)
            r0.<init>(r4, r5, r1)
            r0.show()
            return
    }
}
