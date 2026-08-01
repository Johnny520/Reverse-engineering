.class public final Lqs;
.super Lde/robv/android/xposed/XC_MethodReplacement;


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e0\u06e7\u06e3"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "8Bcfguk=\n"

    const-string v1, "gHZt44SbvCc=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/lit16 v1, v1, -0x971

    rem-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    :cond_0
    const-string v0, "\u06e8\u06e0\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x26

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e0\u06e8\u06e7"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    rem-int/2addr v0, v1

    const v1, -0x1aaaa4

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aabbc -> :sswitch_0
        0x1aaea7 -> :sswitch_2
        0x1ac8ed -> :sswitch_1
    .end sparse-switch
.end method
