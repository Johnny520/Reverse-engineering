.class public final synthetic Lsn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/animation/Interpolator;


# virtual methods
.method public final getInterpolation(F)F
    .locals 12

    const-wide/high16 v10, 0x4008000000000000L    # 3.0

    const-wide/16 v4, 0x0

    const-string v0, "\u06e2\u06e7\u06df"

    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move-wide v2, v4

    move-wide v6, v4

    move-wide v8, v4

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    add-double v0, v6, v10

    const-wide/high16 v6, 0x4010000000000000L    # 4.0

    div-double v6, v2, v6

    sub-double/2addr v0, v6

    sub-double/2addr v0, v10

    const-wide v6, 0x401921fb54442d18L    # 6.283185307179586

    mul-double/2addr v0, v6

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    mul-double/2addr v0, v8

    sub-double v0, v4, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    sub-double v0, v4, v0

    double-to-float v0, v0

    return v0

    :sswitch_1
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x1c

    sput v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v0, "\u06e5\u06e2\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e7\u06df"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    float-to-double v6, p1

    sget v0, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/lit16 v1, v1, -0x1810

    sub-int/2addr v0, v1

    if-ltz v0, :cond_1

    const/4 v0, 0x6

    sput v0, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    :cond_1
    const-string v0, "\u06e8\u06e8\u06e3"

    invoke-static {v0}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    const v0, 0x3e8f5c29    # 0.28f

    float-to-double v2, v0

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x37

    sput v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v0, "\u06df\u06e2\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e1\u06e5"

    goto :goto_1

    :sswitch_4
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    const-wide/high16 v8, -0x3fdc000000000000L    # -10.0

    mul-double/2addr v8, v6

    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    if-ltz v0, :cond_3

    const-string v0, "\u06e2\u06e7\u06df"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06df\u06e2\u06e0"

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc24 -> :sswitch_0
        0x1aa75d -> :sswitch_3
        0x1aaefe -> :sswitch_1
        0x1ab33a -> :sswitch_2
        0x1ac9e3 -> :sswitch_4
    .end sparse-switch
.end method
