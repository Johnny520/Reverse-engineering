.class public Landroidx/activity/ۣۦۡۥ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۢۤۡ:I = 0x2


# direct methods
.method public static ۟۟۠ۥ۟(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda4;->f$0:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda95;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda95;->f$0:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۥۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 showHideConversationTipDialog \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_0

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_1

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    array-length v4, v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_2
    if-lt v0, v4, :cond_2

    :goto_3
    array-length v0, v3

    if-lt v1, v0, :cond_3

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v4

    const/16 v6, 0xa

    int-to-double v6, v6

    mul-double/2addr v4, v6

    double-to-int v4, v4

    xor-int/2addr v4, v0

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v4, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_2
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_3
.end method

.method public static ۟۠۠ۡ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "imageInfos"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.comment.ui.longpress.CommentLongPressItemView"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۥۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011\u4fdd\u5b58\u4f1a\u8bdd\u540d\u79f0\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۨۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "AWEME_RAW_AD_ERROR_METHOD"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۧۨ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u6309\u94ae\u5bb9\u5668(\u5931\u6548\u52ff\u5f00)"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۨۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda4;->f$3:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۧۥ(Ljava/lang/Object;)Landroid/net/Uri;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨ۟۟([SIII)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    new-array v1, p2, [C

    .line 26
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 27
    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    .line 26
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ۟ۢ۟۠ۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟ۡۦ(Ljava/lang/Object;)Landroid/app/Activity;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda23;

    iget-object v1, p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda23;->f$0:Landroid/app/Activity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/concurrent/ExecutorService;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۡ۠ۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 hookSplashAdActivity failed: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۢ(Ljava/lang/Object;)Landroid/content/ContentResolver;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۧۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "mmkvWithID"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۦۡۤ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setClickable(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۨ۟ۢ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$1:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "kevin_prefs"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۡۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "MAIN_TAB_LAYOUT_CLASS"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "#2196F3"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۢۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "shield_FeedAnchorFrameworkComponentRegister"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۦۨ(Ljava/lang/Object;)[I
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda67;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda67;->f$0:[I

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۡ(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda77;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda77;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۢۦ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda10;->f$2:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۣۡ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۧۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "hookCommentFullTime failed:\n"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->showSuccessToast(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨۨ۟(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/MMKVHelper;->remove(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨۨۦ(Ljava/lang/Object;Ljava/lang/Object;)Lorg/json/JSONArray;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lorg/json/JSONArray;

    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۢ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\ud83c\udfb2 \u9009\u62e9\u9ab0\u5b50\u70b9\u6570"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۧۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$2:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۣۨۨ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda160;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda160;->f$1:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۤۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/FrameLayout;

    check-cast p1, Landroid/view/View$OnLongClickListener;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦۦۣۧ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda3;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda3;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۨ۠(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda5;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda5;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۤۦ(Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/text/Spannable;

    check-cast p3, Ljava/lang/Class;

    invoke-interface {p0, p1, p2, p3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۧۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/Iterator;

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۧۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda39;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda39;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۤۥ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda44;

    iget-object v1, p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda44;->f$0:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۡۥ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda206;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda206;->f$0:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۤۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "Self-destruct"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۧۦ()Landroid/graphics/Bitmap$Config;
    .locals 1

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۦۡۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u64ad\u653e\u53cd\u9988"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۦ۟(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda82;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda82;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۤ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda129;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda129;->f$0:Lkevin/fun/hook/DYHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۡۦۥۤ()Landroid/net/Uri;
    .locals 1

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۦۥۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "android.intent.category.OPENABLE"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢ۟۠ۧ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda82;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda82;->f$1:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۤ۠ۥ(Ljava/lang/Object;)Ljava/lang/Runnable;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda49;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda49;->f$0:Ljava/lang/Runnable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۤۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.flux.register.right.FeedFlowComponentRegister"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۥ۠ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "FEED_TIME_FORMAT"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۥۧ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda24;

    iget-object v1, p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda24;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/OutputStream;

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۢۧۥۡ(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda39;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda39;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۦۣۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "shield_ecom_tag_group"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤ۠ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "shield_reward"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/Button;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/widget/Button;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/ListView;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۤۧۤ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u641c\u7d22\u4f5c\u8005\u3001\u6587\u6848\u3001\u5907\u6ce8..."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۢۨ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda14;

    iget v1, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda14;->f$2:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۤ۟۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "IM\u5206\u4eab\u5f15\u5bfc"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥۢۨ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda10;->f$0:Lkevin/fun/hook/KSHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "other"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۤۡۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda6;

    iget-object v1, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda6;->f$1:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۤۨۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda8;->f$3:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۣۧۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "shield_feedback"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧۥۨ()I
    .locals 2

    const v0, -0x2de

    sget v1, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۦۧۧۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "decode"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧ۠۠(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۨ۟ۢ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda62;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda62;->f$0:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۢ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "snssdk1128://chat?conversation_id=%s"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۧۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u274c Hook SimPlayer \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۤۨ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "shield_c2_recommend_drag_mask"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۥۢۡ()Ljava/nio/charset/Charset;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۧۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011Scheme\u6253\u5f00\u89c6\u9891\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۧۧۡ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$10:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method
