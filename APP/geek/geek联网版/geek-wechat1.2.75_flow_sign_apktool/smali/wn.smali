.class public final synthetic Lwn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Interpolator;


# virtual methods
.method public final getInterpolation(F)F
    .locals 14

    const-wide/high16 v12, 0x4032000000000000L    # 18.0

    const-wide/16 v4, 0x0

    const-string v0, "\u06e3\u06e1\u06e0"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move-wide v2, v4

    move-wide v6, v4

    move-wide v8, v4

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    float-to-double v6, p1

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    :cond_0
    const-string v0, "\u06e8\u06e2\u06e7"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const v0, 0x3e8f5c29    # 0.28f

    float-to-double v2, v0

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v1, v1, 0x2506

    or-int/2addr v0, v1

    if-gtz v0, :cond_1

    :cond_1
    const-string v0, "\u06e8\u06e4\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    mul-int/lit16 v1, v1, -0x759

    sub-int/2addr v0, v1

    if-gtz v0, :cond_2

    const/16 v0, 0x63

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v0, "\u06e4\u06e3\u06e3"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v1, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/2addr v0, v1

    const v1, 0x1ab4de

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    add-double/2addr v6, v12

    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    div-double v10, v2, v10

    sub-double/2addr v6, v10

    sub-double/2addr v6, v12

    const-wide v10, 0x401921fb54442d18L    # 6.283185307179586

    mul-double/2addr v6, v10

    div-double v2, v6, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v8

    sub-double v2, v4, v2

    sub-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    :sswitch_4
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const-wide/high16 v8, -0x3fdc000000000000L    # -10.0

    mul-double/2addr v8, v6

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    if-gtz v0, :cond_3

    const/16 v0, 0x38

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e3\u06e1\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/2addr v0, v1

    const v1, 0x1ac8d5

    xor-int/2addr v0, v1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab642 -> :sswitch_0
        0x1ac1e4 -> :sswitch_2
        0x1ac92d -> :sswitch_4
        0x1ac948 -> :sswitch_1
        0x1ac963 -> :sswitch_3
    .end sparse-switch
.end method
