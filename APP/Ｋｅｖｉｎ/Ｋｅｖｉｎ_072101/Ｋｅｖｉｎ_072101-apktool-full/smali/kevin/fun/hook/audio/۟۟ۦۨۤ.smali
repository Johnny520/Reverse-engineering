.class public Lkevin/fun/hook/audio/۟۟ۦۨۤ;
.super Ljava/lang/Object;


# static fields
.field public static ۣۡۢ۟:I = 0x322


# direct methods
.method public static ۟۟۠ۡ۟(Ljava/lang/Object;II)V
    .locals 1

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p0, p1, p2}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟۟ۢۦ۟(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۢۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u63d2\u773c\u5217\u8868 ("

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۧۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "android.view.ViewGroup"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۠ۧ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda157;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda157;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۥۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\n\u672a\u5931\u8d25\u7684\u529f\u80fd\u53ef\u6b63\u5e38\u4f7f\u7528\n\u91cd\u542f\u5e94\u7528\u751f\u6548"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۧۡ(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager;

    invoke-virtual {p0}, Lkevin/fun/hook/download/DownloadManager;->getBatchManager()Lkevin/fun/hook/download/DownloadManager$BatchDownloadManager;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۦۨۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "JSONArray"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡ۠ۢ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda183;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda183;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠ۥۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۧ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/WeakHashMap;

    invoke-virtual {p0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۢ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda16;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda16;->f$0:Lkevin/fun/hook/download/DownloadManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۢ۠ۨۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "sp"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۢۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "UserInfo_CLASS"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۨ۠ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\\\\"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟()I
    .locals 2

    const v0, 0x205

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۣ۟۟ۥۤ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/app/Application;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$ActivityHolder;->init(Landroid/app/Application;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣ۟ۡۡۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda75;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda75;->f$0:Lkevin/fun/hook/DYHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۢۤۤ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda4;->f$5:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۥۡۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "android.view.Window"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤ۠۟۠(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda27;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda27;->f$2:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۡ۟(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda5;->f$4:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۡۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda103;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda103;->f$0:Lkevin/fun/hook/DYHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۦۦۣ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۧۡۧ(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->setSingleLine()V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۟ۤۧۨۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥ۠۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-ltz v0, :cond_0

    sget-object v0, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۣۧ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.feed.ui.FeedRightScaleView"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۤۡ۟(Ljava/lang/Object;)Lkevin/fun/hook/download/DownloadManager;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda15;->f$0:Lkevin/fun/hook/download/DownloadManager;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "shield_familiar"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦ۠ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u2705 \u4e0b\u8f7d\u5b8c\u6210: \u6210\u529f "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۦۢ۠(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda26;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda26;->f$0:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۦۣ۠()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "message_show_time"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۧۨۥ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠۟۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/io/InputStream;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/content/res/AssetManager;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/LinearLayout;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠۠ۥۥ(Ljava/lang/Object;)J
    .locals 4

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;

    iget-wide v2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$4:J

    :goto_0
    return-wide v2

    :cond_0
    const-wide v2, 0x0

    goto :goto_0
.end method

.method public static ۠ۡۨۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u624b\u52bf\u63a7\u5236"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۠ۥۥ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    check-cast p3, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۠ۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/PPHook$VerifyCallback;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Lkevin/fun/hook/PPHook$VerifyCallback;->onFailure(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۡ۟ۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "shield_nickname"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡ۠ۤۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "_getOriginCover"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۡۢۧ۠(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda30;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda30;->f$0:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۡۤ([SIII)Ljava/lang/String;
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

.method public static ۢۡۤۤ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda9;->f$0:Lkevin/fun/hook/KSHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۧۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u4e92\u5173 Hook Error: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۢ۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;

    iget-object v1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$2:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۦ۠۠(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda35;->f$0:Lkevin/fun/hook/KSHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۨۡۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u8bbe\u7f6e\u70b9\u8d5e\u6570\u8303\u56f4\n0 \u8868\u793a\u4e0d\u9650\u5236"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۨۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/util/stream/Stream;

    check-cast p1, Ljava/util/function/Predicate;

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧۡ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda87;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda87;->f$0:Ljava/lang/ref/WeakReference;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۠ۧ(Ljava/lang/Object;Z)Landroidx/core/app/NotificationCompat$Builder;
    .locals 1

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p0, p1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤ۠ۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u274c \u5f3a\u5236\u65e7\u7248\u8bc4\u8bba \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۤۢۧۤ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۤۥۣۢ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/ScrollView;

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۤۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "com.ss.android.ugc.aweme.account.AccountProxyService"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۢۥ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۣۢۥ(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۥۤۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\""

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۧ۠ۢ(Ljava/lang/Object;)Ljava/util/function/Consumer;
    .locals 2

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$8:Ljava/util/function/Consumer;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const-string v3, ""

    const-string v2, ""

    move v0, v1

    :goto_0
    const/16 v4, 0xf

    if-lt v0, v4, :cond_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

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

    move-result-object v0

    array-length v3, v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v1, v3, :cond_3

    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    return-object v1

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
    aget-byte v5, v0, v1

    rem-int v6, v1, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2
.end method

.method public static ۦ۠ۨۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u6296\u97f3\u6587\u6848"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۢۢۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/io/OutputStream;

    check-cast p1, [B

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۦۦ۟ۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "h265"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۦۦۣ(Ljava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/io/InputStream;

    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۦۧۢۨ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/text/Spannable;

    invoke-interface {p0}, Landroid/text/Spannable;->length()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۧۨۤ(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda0;

    iget-object v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda0;->f$0:Landroid/widget/EditText;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۧ۠(II)V
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureConfig;->setDoubleClickAction(II)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۧۧۨۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Landroid/widget/GridView;

    invoke-virtual {p0}, Landroid/widget/GridView;->getFirstVisiblePosition()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢ۠ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "[]"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۢۧ۠(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda91;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda91;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۨۤۨۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 insertButtonsIntoDialog failed: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۥ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u6c89\u6d78\u5bfc\u822a\u680f"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
