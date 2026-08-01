.class public Landroidx/vectordrawable/animated/ۣ۟ۧۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۟ۢۤۧ:I = 0xc3


# direct methods
.method public static ۟۟ۦ۠ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "shield_long_article_detail"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧ۟(Ljava/lang/Object;)Ljava/util/Map;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧ۟۠(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda21;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda21;->f$2:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۟ۥۡ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda75;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda75;->f$4:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u9009\u62e9\u8981\u7cbe\u7b80\u7684\u5206\u4eab\u7ec4\u4ef6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟۠۠ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "authorName"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۦۢ(Ljava/lang/Object;I)V
    .locals 1

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/GridView;

    invoke-virtual {p0, p1}, Landroid/widget/GridView;->setBackgroundColor(I)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۠ۤۦ۠(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda1;

    iget-object v1, p0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda1;->f$1:Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۨ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u6587\u4ef6\u540d\u683c\u5f0f\uff1a"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۟ۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۡ۟ۤۨ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda86;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda86;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢۡۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "addView"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۢ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setScaleY(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۡۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u6b63\u5728\u52a0\u8f7d\u4e2a\u6027\u7b7e\u540d..."

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u89c6\u9891\u65f6\u957f\u8fc7\u6ee4"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۦۧۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "SHARE_MENU"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۨۦۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda90;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda90;->f$3:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۥۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "#"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v4, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move v0, v1

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-lt v0, v5, :cond_2

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v3

    const-string v0, "a"

    :cond_0
    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    move v0, v1

    :goto_3
    if-lt v0, v4, :cond_4

    :goto_4
    array-length v0, v3

    if-lt v1, v0, :cond_5

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_1
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

    :cond_2
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

    :cond_3
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    const-string v0, "a"

    goto :goto_2

    :cond_4
    aget-byte v6, v3, v0

    rem-int v7, v0, v5

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    xor-int/2addr v6, v7

    int-to-byte v6, v6

    aput-byte v6, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    const-string v0, ""

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    goto :goto_4
.end method

.method public static ۟ۢۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lorg/json/JSONObject;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u83b7\u53d6\u5185\u5bb9\u4fe1\u606f\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "VIDEO_PLAY_ADDR_H264_FIELD"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۨۧ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda22;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda22;->f$1:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۟ۧۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "READ_DOREQUEST"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۡۢۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "android.app.Activity"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢ۠ۥ(Ljava/lang/Object;)Lorg/json/JSONArray;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda13;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda13;->f$4:Lorg/json/JSONArray;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤۢ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda14;->f$0:Lkevin/fun/hook/download/DownloadManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۣۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda29;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda29;->f$2:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۦۥ(Ljava/lang/Object;)[Ljava/lang/Runnable;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$15:[Ljava/lang/Runnable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۨۤ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$9:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۢۨۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, " \u63d2\u773c "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۥۣۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "duration"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/os/Handler;

    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u4e0b\u8f7d\u5c01\u9762\u56fe"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۤۤ۠(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda31;->f$2:Lorg/json/JSONObject;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۨۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u663e\u793a\u8b66\u544a\u5bf9\u8bdd\u6846\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۠ۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda34;->f$3:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡ۠ۤ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda21;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda21;->f$1:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۡۨۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "https://api.suyanw.cn/api/bd.php"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۡۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "com.bytedance.im.core.model.Conversation"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧ۟۟(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda171;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda171;->f$0:Lkevin/fun/hook/DYHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۧۢۢ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟۟ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, " \u5f20"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۥ۟(Ljava/lang/Object;)Ljava/lang/Runnable;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$3:Ljava/lang/Runnable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/EditText;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroid/widget/EditText;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۢۦۡ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda43;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda43;->f$0:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۢۨۡ(Ljava/lang/Object;)[I
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda7;

    iget-object v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda7;->f$0:[I

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۣۧ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;

    iget v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda28;->f$2:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۧۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u2705 \u5b9e\u51b5\u56fe\u7247\u5df2\u4fdd\u5b58"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۟ۥۦ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Constructor;

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "g"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u6570\u7ec4\u957f\u5ea6: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۡۢۨ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda156;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda156;->f$0:Landroid/widget/LinearLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۢۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۡۤۡ(Ljava/lang/Object;F)V
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011\u83b7\u53d6\u6296\u97f3\u7248\u672c\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۢۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u7ecf\u9a8c"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢۨۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "lastSelectedCategory"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۢۧ(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda79;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda79;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۤۢۤۦ()I
    .locals 2

    const v0, 0xa4

    sget v1, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۤۥ۟ۡ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    invoke-virtual {p0}, Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;->isRunning()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۨۡۦ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda2;

    iget-wide v2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda2;->f$0:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۥ۟۠ۦ(Ljava/lang/Object;Ljava/lang/Object;)[B
    .locals 1

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۢۨ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, [Z

    invoke-static {p0, p1}, Ljava/util/Arrays;->fill([ZZ)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦ۟۟(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda10;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda10;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۧۨ([SIII)Ljava/lang/String;
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

.method public static ۦۡۦۣ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda16;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda16;->f$0:Lkevin/fun/hook/XhsHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۡۧ(Ljava/lang/Object;)F
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/util/DisplayMetrics;

    iget v1, p0, Landroid/util/DisplayMetrics;->density:F

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۤۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "bottomtab"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۤۦۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u5176\u4ed6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۧ۟ۦ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda4;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۧۦ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0}, Lkevin/fun/hook/SparkRenewHelper;->captureSendMsgHandler(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۡ۠ۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "author"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨ۟ۨ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda10;

    iget-object v1, p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda10;->f$2:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۥۡۥ(Ljava/lang/Object;IIII)V
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method
