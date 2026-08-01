.class public Lkevin/fun/hook/audio/ۣۧۤۦ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۨ۟:I = 0x49


# direct methods
.method public static ۟۟ۢۧۦ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$3:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/OriginalVideoParser$ParseCallback;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Lkevin/fun/hook/OriginalVideoParser$ParseCallback;->onSuccess(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u4fdd\u5b58\u81f3\u76f8\u518c"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۦۢۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 getCurrentVideoId \u5f02\u5e38: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۡۨ(Ljava/lang/Object;F)F
    .locals 1

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/MMKVHelper;->getFloat(Ljava/lang/String;F)F

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۨۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, ": "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۧۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "ShareUserViewHook \u5b9e\u51b5\u56fe\u7247\u7f3a\u5c11\u89c6\u9891URL\uff0c\u53ea\u4e0b\u8f7d\u9759\u6001\u56fe\u7247: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۥۥۤ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$7:Landroid/widget/LinearLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۧ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u9009\u62e9\u8981\u5c4f\u853d\u7684\u7ec4\u4ef6"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۨ۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, [Ljava/lang/Object;

    check-cast p1, Ljava/util/Comparator;

    invoke-static {p0, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡ۠ۦۦ(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda43;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda43;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۨ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/FileOutputStream;

    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۡۡۡ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/HorizontalScrollView;

    check-cast p1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1}, Landroid/widget/HorizontalScrollView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۨۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\uff08ID\uff1a"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۟ۨ۟(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۢۢ۠ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u8bc4\u8bba\u63d2\u773c\u5f00\u5173"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;
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

.method public static ۣ۟۠ۤۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda12;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda12;->f$0:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟۠۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {p0, p1}, Lkevin/fun/hook/SparkRenewHelper;->processConversationSpark(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣ۟ۢۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda0;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda0;->f$1:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۣ۟ۨ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$87$$ExternalSyntheticLambda1;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$87$$ExternalSyntheticLambda1;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۨۧ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/io/FileInputStream;

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۤۥۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda118;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda118;->f$1:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۥۡۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "remove_related_input"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۤۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/Locale;

    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠ۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "JSONObject"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۨۦ(Ljava/lang/Object;IIII)V
    .locals 1

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/EditText;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->setPadding(IIII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۤۥ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "snssdk1128://user/profile?uid="

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۟ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, ".tmp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۨ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/app/Dialog;

    check-cast p1, Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۥۨۦۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "noteDetailMap"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۣۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$5:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۧ۟(Ljava/lang/Object;)Landroid/widget/GridView;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda36;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda36;->f$1:Landroid/widget/GridView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۧۢ(Ljava/lang/Object;IIII)V
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPadding(IIII)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۧۢۨۦ(J)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۤ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "onCommentDialogEvent"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۨۥۥ()Ljava/util/Locale;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۟ۧۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "HOMEPAGE_TIME_method"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۢۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣۣ۟۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "xhs_livephoto_"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۤۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 hookBottomSpace \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۤۡ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u274c TimeUtils \u7c7b\u548c\u914d\u7f6e\u7c7b\u90fd\u4e0d\u5b58\u5728"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "setText"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۧۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۡۥۧ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setFocusable(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۢ۠ۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda35;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda35;->f$0:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۡۢ۠(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$9:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۧۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/graphics/Canvas;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Canvas;->restore()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡۧۧ۟(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda46;

    iget-object v1, p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda46;->f$0:Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۨ۠ۧ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۢ۟ۦۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.im.feedguide.flux.ForceImShareGuideComponentRegister"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۡۤۨ(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۢۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u8bf7\u7a0d\u540e\u624b\u52a8\u91cd\u542f\u5e94\u7528\u751f\u6548"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۦۣۨ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۧۡ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda80;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda80;->f$1:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۧۢۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u7981\u7528\u8fd4\u56de\u5237\u65b0\u89c6\u9891"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۧۥۧ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda36;->f$5:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۥۤۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u9009\u62e9\u989c\u8272"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۥۥ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.homepage.tab.top.ui.titlebar.MainTitleBarContainer"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣ۟ۡ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda80;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda80;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۡ۟ۢ(Ljava/lang/Object;)I
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda6;

    iget v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda6;->f$1:I

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۦۤۡ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$$ExternalSyntheticLambda4;->f$0:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۨۨۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u81ea\u9002\u5e94"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦ۠ۦۥ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLeft()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۡۢ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/FileOutputStream;

    invoke-virtual {p0}, Ljava/io/FileOutputStream;->flush()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۦ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lkevin/fun/hook/download/DownloadManager;->downloadCommentImageSilent(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۧ۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u6253\u5f00\u8d5e\u8d4f\u5931\u8d25"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۤۤۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/ListView;

    check-cast p1, Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {p0, p1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۨۤۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, " \u6761\u63d2\u773c\u8bb0\u5f55\u5417\uff1f"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۟۟ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "TOUCH_LISTENER_CLASS"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۨ۟(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda68;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda68;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨ۠ۥۢ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda9;

    iget-object v1, p0, Lkevin/fun/hook/webdav/WebDAVDialog$$ExternalSyntheticLambda9;->f$0:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۨۤ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣۨۨ(Ljava/lang/Object;)Landroid/widget/Switch;
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda20;

    iget-object v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda20;->f$0:Landroid/widget/Switch;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۤۡ۠(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۨۤۧۢ()I
    .locals 2

    const v0, -0x3bd

    sget v1, Landroidx/activity/ۦۧۥۥ;->۟ۦۢۧۤ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۨۦ۟ۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u26a0 \u683c\u5f0f\u9519\u8bef"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۦۥۢ([SIII)Ljava/lang/String;
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
