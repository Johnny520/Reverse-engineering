.class public Lkevin/fun/hook/۟ۥ۠۠;
.super Ljava/lang/Object;


# static fields
.field public static ۢۦۧۧ:I = -0x1c5


# direct methods
.method public static ۟۟۟۟۠(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda3;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda3;->f$2:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟۟۠ۥ(Ljava/lang/Object;)Landroid/widget/SeekBar;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda145;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda145;->f$4:Landroid/widget/SeekBar;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢ۟ۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u2705 \u89c6\u9891\u94fe\u63a5\u5df2\u590d\u5236"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۦۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda3;

    iget-object v1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda3;->f$2:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۢۦۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda15;->f$4:Ljava/lang/String;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۟ۤ۟(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۥۧ(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda25;

    iget-object v1, p0, Lkevin/fun/hook/VoiceAssistantHook$$ExternalSyntheticLambda25;->f$0:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۟ۧۧۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Landroid/widget/GridView;

    invoke-virtual {p0}, Landroid/widget/GridView;->getLastVisiblePosition()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۟۟(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$193$1$$ExternalSyntheticLambda0;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$193$1$$ExternalSyntheticLambda0;->f$2:[Ljava/lang/Object;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟۠۠ۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u70b9\u51fb\u8c03\u6574\u4f4d\u7f6e"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟۠ۢۤۥ(Ljava/lang/Object;)Lkevin/fun/hook/SparkRenewHelper$SparkInfo;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda17;

    iget-object v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda17;->f$0:Lkevin/fun/hook/SparkRenewHelper$SparkInfo;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠ۨۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u26a0\ufe0f Hook\u8bc4\u8bba\u533a\u72b6\u6001\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡ۠۠ۥ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->ۣۨۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011Hook \u5f55\u97f3\u53d1\u9001\u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۡۢۢ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 \u7eed\u706b\u82b1\u5bf9\u8bdd\u6846\u6253\u5f00\u5931\u8d25\n"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۡۢۦ۠(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda150;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda150;->f$0:Lkevin/fun/hook/DYHook;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۤۤ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 hook handleBigDiggViewClick \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۢۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Class;
    .locals 1

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Ljava/lang/ClassLoader;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟۠۟ۦ(Ljava/lang/Object;)I
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Landroid/widget/LinearLayout;

    invoke-virtual/range {p0 .. p0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۡۤ۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "comment_download_btn"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۣ۟ۧۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "\u3010Kevin\u3011 getModuleDrawable \u5931\u8d25: "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۤۢۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, "\u7eff\u8272"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۤۤۡ(Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public static ۟ۤۧۦۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۣۣۨ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u3010Kevin\u3011: \u672a\u627e\u5230\u6807\u7b7e\u5e03\u5c40\u7c7b"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۟ۡ(Ljava/lang/Object;)Lkevin/fun/hook/PPHook$ActivateResult;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;

    iget-object v1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda7;->f$0:Lkevin/fun/hook/PPHook$ActivateResult;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۥۧ۠۟(Ljava/lang/Object;)Landroid/content/Context;
    .locals 1

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/app/Dialog;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۡۦۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda6;

    iget-object v1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda6;->f$2:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۦۣ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "backupTime"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۢۦۦ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۟ۦۥۥۢ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;

    iget-boolean v1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda17;->f$1:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۟ۧ۟ۡ(Ljava/lang/Object;)Lkevin/fun/hook/DexKitFinder$SafeFinder;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda32;

    iget-object v1, p0, Lkevin/fun/hook/DexKitFinder$SafeFinder$$ExternalSyntheticLambda32;->f$0:Lkevin/fun/hook/DexKitFinder$SafeFinder;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۠ۥ۠(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda9;

    iget-object v1, p0, Lkevin/fun/hook/PPHook$$ExternalSyntheticLambda9;->f$1:Ljava/lang/Throwable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣ۠ۧۡ(Ljava/lang/Object;)Landroid/widget/Switch;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda203;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda203;->f$1:Landroid/widget/Switch;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۡۥۣ۟(Ljava/lang/Object;)Landroid/app/Dialog;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda4;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda4;->f$3:Landroid/app/Dialog;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢ۠ۦۦ(Ljava/lang/Object;)Landroid/app/Activity;
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda9;

    iget-object v1, p0, Lkevin/fun/hook/SparkRenewHelper$$ExternalSyntheticLambda9;->f$0:Landroid/app/Activity;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۢۢۢ(Ljava/lang/Object;Z)V
    .locals 1

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/widget/HorizontalScrollView;

    invoke-virtual {p0, p1}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۣۢۨ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۢۤۨۡ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "TIME_OR_RETRY_TEXT_VIEW_FIELD"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۥۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/function/Consumer;

    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    goto :goto_0
.end method

.method public static ۣۦۥۨ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\ud83d\udccb "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۨۢ۟([SIII)Ljava/lang/String;
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

.method public static ۣۤ۟(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda171;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda171;->f$3:Landroid/widget/LinearLayout;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۤۡ۠(Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda12;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda12;->f$1:Landroid/widget/ImageView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const-string v3, ""

    const-string v2, ""

    move v1, v0

    :goto_0
    const/16 v4, 0xf

    if-lt v1, v4, :cond_0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    invoke-direct {v1, v4}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-gtz v4, :cond_1

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v3, v1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    :goto_2
    if-lt v0, v3, :cond_2

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

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

    xor-int/2addr v4, v1

    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    const/4 v5, -0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_2
    aget-byte v5, v1, v0

    rem-int v6, v0, v4

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

.method public static ۤۥ۠۟()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "?enter_from=comment&cid="

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۣۤۨۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "MAIN_TAB_LAYOUT_METHOD"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۟ۤۧ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v0

    if-gez v0, :cond_0

    const-string v0, " \u2192 "

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥ۠۠ۤ()I
    .locals 2

    const v0, -0x30e

    sget v1, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public static ۥۤ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\n\u26a0\ufe0f \u5f53\u524d\u7248\u672c\u8fc7\u4f4e\uff0c\u90e8\u5206\u529f\u80fd\u53ef\u80fd\u5f02\u5e38"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۥۤۡۦ(Ljava/lang/Object;)[Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;

    iget-object v1, p0, Lkevin/fun/hook/download/DownloadManager$$ExternalSyntheticLambda2;->f$3:[Landroid/widget/TextView;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۥۦۣ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;

    iget-boolean v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda88;->f$0:Z

    :goto_0
    return v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۦۣۢ(Ljava/lang/Object;)Ljava/lang/Runnable;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$11:Ljava/lang/Runnable;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۦۧۧۢ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda85;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda85;->f$2:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۨۧ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$6:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۦۢۡ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v0

    if-ltz v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda205;->f$1:Landroid/content/Context;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۣۧۧۨ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v0

    if-lez v0, :cond_0

    check-cast p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;

    iget-object v1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$3:Ljava/util/List;

    :goto_0
    return-object v1

    :cond_0
    const v1, 0x0

    goto :goto_0
.end method

.method public static ۧۧۤۥ(Ljava/lang/Object;II)Z
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۧۨ۟ۦ()Ljava/lang/String;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "#F0F0F0"

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨ۟ۨۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

    move-result v0

    if-gtz v0, :cond_0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method

.method public static ۨۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v0

    if-gez v0, :cond_0

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x0

    goto :goto_0
.end method
