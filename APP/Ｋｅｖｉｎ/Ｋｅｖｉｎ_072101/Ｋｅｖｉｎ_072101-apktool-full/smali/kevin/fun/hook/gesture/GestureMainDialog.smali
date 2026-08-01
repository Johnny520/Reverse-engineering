.class public Lkevin/fun/hook/gesture/GestureMainDialog;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;
    }
.end annotation


# static fields
.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/gesture/GestureMainDialog;->short:[S

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/gesture/GestureMainDialog;->MAIN_HANDLER:Landroid/os/Handler;

    return-void

    nop

    :array_0
    .array-data 2
        0x555as
        0x46b6s
        0x5175s
        0x4c8cs
        0x58e2s
        0x4b0fs
        0x59b6s
        0x444es
        0x54a5s
        0x5692s
        0x753s
        0x749s
        -0x60abs
        0x6923s
        0xa10s
        0xa0as
        0x67a3s
        0x5757s
        0x664fs
        0x57des
        0x503ds
        0x713as
        0x6659s
        0x56ads
        0x67b5s
        0x5624s
        0x6338s
        0x53ccs
        0x5249s
        0x56acs
        -0x7533s
        0x7e1ds
        0x783es
        0x7497s
        0x5273s
        0x5044s
        0x7106s
        -0x731fs
        0x7c7es
        0x70d7s
        -0x6f80s
        0x66f6s
        -0x79dds
        0x56aas
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "DX2MI9PJnZeLlHEeAiRuoCYO3w3v"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۧۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static animatePanel(Landroid/view/View;)V
    .locals 6

    const v0, 0x3f666666    # 0.9f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦۡۤۨ(Ljava/lang/Object;F)V

    invoke-static {p0, v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۢۡۨ(Ljava/lang/Object;F)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢۤۧۢ(Ljava/lang/Object;F)V

    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۡۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0, v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v2, -0x176

    sget v1, Landroidx/interpolator/ۦۨۢۦ;->۟ۦۨ۠ۧ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v0, v2, v3}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v1}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "L1cSMOKV6g608WaghpHYcnJSOC"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method private static createActionButton(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 13

    const/high16 v12, 0x41000000    # 8.0f

    const/high16 v11, 0x40c00000    # 6.0f

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const-string v4, "\u06e7\u06df\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v5, v6

    move v7, v6

    move v8, v6

    move v9, v6

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v6, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06df\u06e1\u06df"

    move-object v4, v1

    move v9, v6

    goto :goto_0

    :sswitch_0
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v4, "\u06e1\u06e0\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/high16 v1, 0x40800000    # 4.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e8\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v6, v9, -0x1bf

    const-string v1, "\u06e7\u06e6\u06e0"

    move-object v4, v1

    move v8, v6

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢ۠۠ۨ:I

    const-string v1, "\u06e0\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "\u06e2\u06e6\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    sget v6, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤ۟ۨ:I

    const-string v1, "\u06e4\u06e8\u06e3"

    move-object v4, v1

    move v9, v6

    goto :goto_0

    :sswitch_6
    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06df\u06e3\u06e0"

    move-object v4, v1

    move v7, v6

    goto :goto_0

    :sswitch_7
    const/high16 v1, 0x41300000    # 11.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v1, "\u06e0\u06e8\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    const v1, 0xa0bed

    xor-int v6, v1, v9

    const-string v1, "\u06e2\u06e7\u06e2"

    move-object v4, v1

    move v8, v6

    goto :goto_0

    :sswitch_9
    xor-int/lit8 v6, v8, -0x54

    const-string v1, "\u06e6\u06df"

    move-object v4, v1

    move v7, v6

    goto :goto_0

    :sswitch_a
    xor-int/lit8 v6, v5, 0x4a

    const-string v1, "\u06e4\u06e4\u06e0"

    move-object v4, v1

    move v9, v6

    goto :goto_0

    :sswitch_b
    invoke-static {p0, v11}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e1\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    invoke-static {p0, v12}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06df\u06e5\u06e2"

    move-object v4, v1

    move v9, v6

    goto :goto_0

    :sswitch_d
    invoke-static {p0, v11}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06e0\u06e0\u06e7"

    move-object v4, v1

    move v8, v6

    goto/16 :goto_0

    :sswitch_e
    invoke-static {v0, v9, v8, v7, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06df\u06e4\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_f
    int-to-float v6, v7

    const-string v1, "\u06e8\u06e4\u06e2"

    move-object v4, v1

    move v10, v6

    goto/16 :goto_0

    :sswitch_10
    const v1, 0xab8a

    xor-int v6, v1, v9

    const-string v1, "\u06e2\u06e8\u06e7"

    move-object v4, v1

    move v8, v6

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v3, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e3\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_12
    iput v5, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    const-string v1, "\u06e2\u06e8\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۢۥۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e5\u06e0\u06e4"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_14
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v4, "\u06df\u06e2\u06e1"

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_15
    sget v6, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    const-string v1, "\u06e6\u06e1\u06e1"

    move-object v4, v1

    move v8, v6

    goto/16 :goto_0

    :sswitch_16
    invoke-static {v0, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e7\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_17
    invoke-static {v0, v8}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e5\u06e1\u06e1"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_18
    invoke-static {v3, v10}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e2\u06e0\u06e5"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_19
    invoke-static {p0, v12}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06e2\u06df\u06e1"

    move-object v4, v1

    move v7, v6

    goto/16 :goto_0

    :sswitch_1a
    invoke-static {v0, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_1b
    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e3\u06e3"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_1c
    sget v6, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۡۨۨۧ:I

    const-string v1, "\u06e6\u06e5\u06e0"

    move-object v4, v1

    move v9, v6

    goto/16 :goto_0

    :sswitch_1d
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_e
        0xdc46 -> :sswitch_3
        0xdcb9 -> :sswitch_14
        0xdcf7 -> :sswitch_12
        0x1aa73d -> :sswitch_10
        0x1aa75e -> :sswitch_1
        0x1aa77c -> :sswitch_f
        0x1aa79e -> :sswitch_0
        0x1aa7bc -> :sswitch_d
        0x1aaae7 -> :sswitch_19
        0x1aab07 -> :sswitch_a
        0x1aaea5 -> :sswitch_1c
        0x1aaf01 -> :sswitch_7
        0x1ab244 -> :sswitch_b
        0x1ab267 -> :sswitch_1a
        0x1ab2c0 -> :sswitch_6
        0x1ab324 -> :sswitch_1b
        0x1ab33d -> :sswitch_11
        0x1ab343 -> :sswitch_5
        0x1ab361 -> :sswitch_16
        0x1ab362 -> :sswitch_13
        0x1aba60 -> :sswitch_15
        0x1abadf -> :sswitch_2
        0x1abda9 -> :sswitch_1d
        0x1abdc5 -> :sswitch_c
        0x1ac186 -> :sswitch_9
        0x1ac201 -> :sswitch_8
        0x1ac50f -> :sswitch_4
        0x1ac5e1 -> :sswitch_17
        0x1ac966 -> :sswitch_18
    .end sparse-switch
.end method

.method private static createDivider(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e4\u06df\u06e5"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e8\u06e7\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e6\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v5, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e8\u06e7"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v6}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e4\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    xor-int/lit8 v5, v7, 0x7a

    const-string v1, "\u06e6\u06e7\u06e1"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_4
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v1, "\u06e1\u06e6\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    const-string v1, "\u06e0\u06df\u06df"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_6
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e6\u06e4\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    const v1, 0x111019

    xor-int v5, v1, v7

    const-string v1, "\u06e2\u06e5\u06e5"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_8
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdcff -> :sswitch_7
        0x1aaac0 -> :sswitch_3
        0x1aaf5f -> :sswitch_0
        0x1aaf62 -> :sswitch_1
        0x1ab302 -> :sswitch_2
        0x1ab6a7 -> :sswitch_8
        0x1ac1e6 -> :sswitch_5
        0x1ac240 -> :sswitch_4
        0x1ac9c4 -> :sswitch_6
    .end sparse-switch
.end method

.method private static createHorizontalDivider(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e0\u06e2\u06e6"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e6\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v1, "\u06e5\u06df\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    sget v5, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    const-string v1, "\u06e2\u06e1\u06e1"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_2
    const v1, -0x111144

    xor-int v5, v1, v7

    const-string v1, "\u06e8\u06e3"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_3
    sget v5, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e1\u06e3\u06e7"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_4
    invoke-static {v2, v6}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e1\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e0\u06e1\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e5\u06e4\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v5, v7, 0x108

    const-string v1, "\u06e5\u06df\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_8
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdcfb -> :sswitch_4
        0x1aa7d8 -> :sswitch_1
        0x1aab04 -> :sswitch_6
        0x1aab24 -> :sswitch_5
        0x1aaf05 -> :sswitch_7
        0x1ab282 -> :sswitch_2
        0x1ab646 -> :sswitch_8
        0x1abd88 -> :sswitch_0
        0x1abe23 -> :sswitch_3
    .end sparse-switch
.end method

.method private static createQuadrantGrid(Landroid/content/Context;Landroid/app/Dialog;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)Landroid/view/View;
    .locals 11

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "\u06e6\u06e8\u06e5"

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v8

    const/4 v1, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v1, v9, v6, v8}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const-string v6, "\u06df\u06e5\u06e7"

    goto :goto_0

    :sswitch_0
    invoke-static {v1, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟۠ۤۨ۟(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v6

    invoke-static {v1, v6}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e1\u06e1\u06e1"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v4

    sget v9, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/lit8 v8, v9, -0x61

    const-string v6, "\u06e3\u06df\u06e2"

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦۤۤ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e1\u06e7\u06e4"

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v4

    sget v7, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v9, v7, 0x164

    const-string v6, "\u06e6\u06e5\u06e7"

    goto :goto_0

    :sswitch_4
    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۥۧۤۥ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    invoke-static {v1, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e0\u06df\u06e3"

    goto :goto_0

    :sswitch_5
    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e6\u06e8\u06df"

    goto :goto_0

    :sswitch_6
    sget v9, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v7, v9, -0x383

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v6, "\u06e0\u06e4"

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v7, v8, 0xc1

    const/4 v5, 0x6

    const/16 v6, 0xa45

    invoke-static {v4, v5, v7, v6}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v9, v5, p1, p2}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۥۣۧۨ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    const-string v6, "\u06e1\u06e5\u06e0"

    goto :goto_0

    :sswitch_8
    const/4 v5, 0x4

    const/16 v6, 0x504

    invoke-static {v4, v5, v9, v6}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟۠ۢۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v8, v5, p1, p2}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۥۣۧۨ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06df\u06e3\u06e6"

    goto/16 :goto_0

    :sswitch_9
    xor-int/lit16 v9, v7, -0x1e5

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v4

    sget v8, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    const-string v6, "\u06e6\u06e0\u06e4"

    goto/16 :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦۤۤ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v7, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    const-string v6, "\u06e7\u06e1\u06e3"

    goto/16 :goto_0

    :sswitch_b
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x1

    invoke-static {v0, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v9

    const-string v6, "\u06e2\u06e3\u06df"

    goto/16 :goto_0

    :sswitch_c
    const/4 v6, 0x1

    invoke-static {v1, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v9, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v8, v9, -0x168

    const-string v6, "\u06e7\u06df\u06e2"

    goto/16 :goto_0

    :sswitch_d
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v3, v7, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const-string v6, "\u06e1\u06e4\u06e7"

    goto/16 :goto_0

    :sswitch_e
    xor-int/lit16 v8, v9, 0xf1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v10, 0x8bc

    invoke-static {v4, v6, v8, v10}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, v5, v6, p1, p2}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۥۣۧۨ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    const-string v6, "\u06e7\u06e7\u06df"

    goto/16 :goto_0

    :sswitch_f
    const/4 v5, 0x1

    const/4 v6, 0x2

    const/16 v10, 0x286

    invoke-static {v4, v6, v8, v10}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, v5, v6, p1, p2}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۥۣۧۨ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e2\u06e8\u06e2"

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v9, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v8, v9, -0x3a8

    const-string v6, "\u06e0\u06e0\u06df"

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v2, v3}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v4

    sget v9, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    const-string v6, "\u06e6\u06e4\u06df"

    goto/16 :goto_0

    :sswitch_12
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v3, v7, v6, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const-string v6, "\u06e1\u06e1\u06e6"

    goto/16 :goto_0

    :sswitch_13
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0x1aa782 -> :sswitch_a
        0x1aa7c1 -> :sswitch_c
        0x1aaac4 -> :sswitch_12
        0x1aaadf -> :sswitch_3
        0x1aaec1 -> :sswitch_d
        0x1aaec6 -> :sswitch_10
        0x1aaf24 -> :sswitch_11
        0x1aaf3c -> :sswitch_5
        0x1aaf7e -> :sswitch_1
        0x1ab35c -> :sswitch_4
        0x1ab606 -> :sswitch_f
        0x1ac16a -> :sswitch_7
        0x1ac1e1 -> :sswitch_e
        0x1ac208 -> :sswitch_8
        0x1ac25d -> :sswitch_13
        0x1ac263 -> :sswitch_b
        0x1ac50a -> :sswitch_6
        0x1ac549 -> :sswitch_9
        0x1ac5ff -> :sswitch_2
    .end sparse-switch
.end method

.method private static createRegionCell(Landroid/content/Context;ILjava/lang/String;Landroid/app/Dialog;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)Landroid/view/View;
    .locals 20

    const/4 v6, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v5, 0x0

    const-string v17, "\u06e5\u06df\u06e1"

    :goto_0
    invoke-static/range {v17 .. v17}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v17

    sparse-switch v17, :sswitch_data_0

    const/high16 v14, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    invoke-static {v0, v14}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v15

    const/high16 v14, 0x41400000    # 12.0f

    move-object/from16 v0, p0

    invoke-static {v0, v14}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v14

    const-string v17, "\u06e2\u06e5\u06e1"

    goto :goto_0

    :sswitch_0
    sget v16, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const v13, 0x999891

    xor-int v13, v13, v16

    const-string v17, "\u06e5\u06e0\u06e4"

    goto :goto_0

    :sswitch_1
    invoke-static {v9, v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v17, "\u06e1\u06e7\u06e7"

    goto :goto_0

    :sswitch_2
    new-instance v17, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v18, 0x0

    const/high16 v19, 0x3f800000    # 1.0f

    move-object/from16 v0, v17

    move/from16 v1, v18

    move/from16 v2, v16

    move/from16 v3, v19

    invoke-direct {v0, v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v17, "\u06e7\u06e8\u06e7"

    goto :goto_0

    :sswitch_3
    invoke-static/range {p1 .. p1}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۡ۟ۧۤ(I)I

    move-result v12

    invoke-static {v12}, Landroidx/customview/ۡۤۡۤ;->ۥۣۡۨ(I)Ljava/lang/String;

    move-result-object p2

    const-string v17, "\u06e8\u06df\u06e0"

    goto :goto_0

    :sswitch_4
    xor-int/lit16 v0, v14, 0x1bb

    move/from16 v16, v0

    const/16 v11, 0x8

    const/16 v17, 0x769

    move/from16 v0, v16

    move/from16 v1, v17

    invoke-static {v7, v11, v0, v1}, Landroidx/loader/ۢۥ۟;->۟ۧ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v11

    const-string v17, "\u06e7\u06e3\u06e5"

    goto :goto_0

    :sswitch_5
    invoke-static {v8, v11}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    move-object/from16 v0, p2

    invoke-static {v10, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v17, "\u06e0\u06e2\u06e7"

    goto :goto_0

    :sswitch_6
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v7

    const-string v17, "\u06e7\u06e7\u06e4"

    goto :goto_0

    :sswitch_7
    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۨۨۦ۟(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-static {v6, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v17, "\u06e5\u06e1\u06e7"

    goto/16 :goto_0

    :sswitch_8
    new-instance v6, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v6, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v17, 0x1

    move/from16 v0, v17

    invoke-static {v6, v0}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const-string v17, "\u06e3\u06e3"

    goto/16 :goto_0

    :sswitch_9
    invoke-static {v6, v12}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v16, 0x430c0000    # 140.0f

    move-object/from16 v0, p0

    move/from16 v1, v16

    invoke-static {v0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v16

    const-string v17, "\u06e7\u06df\u06e2"

    goto/16 :goto_0

    :sswitch_a
    sget v15, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v14, v15, 0x3bd

    const-string v17, "\u06e2\u06e2\u06e6"

    goto/16 :goto_0

    :sswitch_b
    sget v16, Landroidx/core/ۤۦ۟ۢ;->ۡ۟ۤۨ:I

    move/from16 v0, v16

    xor-int/lit16 v12, v0, -0x20f

    const-string v17, "\u06e6\u06df\u06e0"

    goto/16 :goto_0

    :sswitch_c
    move/from16 v0, v16

    invoke-static {v6, v0, v13, v15, v14}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v9, Landroid/widget/TextView;

    move-object/from16 v0, p0

    invoke-direct {v9, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v17, "\u06e0\u06e0\u06e2"

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p0

    invoke-static {v0, v11}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v9

    new-instance v5, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda4;

    move-object/from16 v0, p3

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p4

    invoke-direct {v5, v0, v1, v2, v3}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda4;-><init>(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    const-string v17, "\u06e3\u06e8\u06e2"

    goto/16 :goto_0

    :sswitch_e
    invoke-static {v9, v13}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v9, v12}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const-string v17, "\u06e8\u06e0\u06df"

    goto/16 :goto_0

    :sswitch_f
    new-instance v17, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;

    move-object/from16 v0, v17

    move-object/from16 v1, p3

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v4, p4

    invoke-direct {v0, v1, v2, v3, v4}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda3;-><init>(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    move-object/from16 v0, v17

    invoke-static {v9, v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۦۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v17, "\u06df\u06e2\u06e7"

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p2

    invoke-static {v9, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v17, 0x41600000    # 14.0f

    move/from16 v0, v17

    invoke-static {v9, v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v17, "\u06e0\u06e4"

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v15}, Landroidx/customview/ۡۤۡۤ;->ۥۣۡۨ(I)Ljava/lang/String;

    move-result-object p2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v17, "\u06e4\u06e4\u06e6"

    goto/16 :goto_0

    :sswitch_12
    const/high16 v13, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v16

    const/high16 v13, 0x41400000    # 12.0f

    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v13

    const-string v17, "\u06df\u06e6\u06df"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v7

    sget v14, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    const-string v17, "\u06e8\u06e5\u06e5"

    goto/16 :goto_0

    :sswitch_14
    const/16 v8, 0xc

    const/16 v11, 0xa2a

    invoke-static {v7, v8, v14, v11}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v17, "\u06df\u06e0\u06e8"

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v6, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p1 .. p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۡۡ(I)I

    move-result v15

    const-string v17, "\u06e8\u06e6\u06df"

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v0, p2

    invoke-static {v8, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-static {v10}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v17, "\u06e8\u06e2\u06e4"

    goto/16 :goto_0

    :sswitch_17
    invoke-static {v6, v9}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v13, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    invoke-static {v0, v13}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v13

    const-string v17, "\u06e8\u06df\u06e4"

    goto/16 :goto_0

    :sswitch_18
    invoke-static {v8}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v0, p0

    invoke-static {v0, v11}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v9

    const-string v17, "\u06e4\u06e2\u06e7"

    goto/16 :goto_0

    :sswitch_19
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc04 -> :sswitch_0
        0xdc60 -> :sswitch_b
        0x1aa727 -> :sswitch_16
        0x1aa764 -> :sswitch_17
        0x1aaae2 -> :sswitch_10
        0x1aab25 -> :sswitch_18
        0x1aaf81 -> :sswitch_19
        0x1ab2a6 -> :sswitch_14
        0x1ab2fe -> :sswitch_c
        0x1ab71d -> :sswitch_1
        0x1aba29 -> :sswitch_f
        0x1aba66 -> :sswitch_13
        0x1abd87 -> :sswitch_8
        0x1abda9 -> :sswitch_e
        0x1abdcb -> :sswitch_3
        0x1ac147 -> :sswitch_9
        0x1ac50a -> :sswitch_2
        0x1ac589 -> :sswitch_5
        0x1ac604 -> :sswitch_a
        0x1ac626 -> :sswitch_12
        0x1ac8c9 -> :sswitch_6
        0x1ac8cd -> :sswitch_7
        0x1ac8e7 -> :sswitch_15
        0x1ac92a -> :sswitch_d
        0x1ac988 -> :sswitch_4
        0x1ac9a1 -> :sswitch_11
    .end sparse-switch
.end method

.method private static createRegionTitle(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 6

    const/high16 v5, 0x41000000    # 8.0f

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e2\u06e5"

    move v2, v3

    move v4, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const v1, -0x7774f6

    xor-int v4, v1, v2

    const-string v1, "\u06e0\u06e5\u06e3"

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v5}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e6\u06e0\u06e3"

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v3, v2, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e3\u06df\u06e5"

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e1\u06e7\u06e6"

    goto :goto_0

    :sswitch_3
    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e8\u06e6"

    goto :goto_0

    :sswitch_4
    const/high16 v1, 0x41500000    # 13.0f

    invoke-static {v0, v1}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v1, "\u06e5\u06e6\u06e7"

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v5}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v2

    const-string v1, "\u06e6\u06e0\u06e5"

    goto :goto_0

    :sswitch_6
    sget v2, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    const-string v1, "\u06e7\u06e4\u06e7"

    goto :goto_0

    :sswitch_7
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "\u06e1\u06e6\u06e2"

    goto :goto_0

    :sswitch_8
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa81d -> :sswitch_4
        0x1aab7e -> :sswitch_2
        0x1aaf5d -> :sswitch_3
        0x1aaf80 -> :sswitch_5
        0x1ab2a5 -> :sswitch_7
        0x1ab609 -> :sswitch_8
        0x1abe66 -> :sswitch_6
        0x1ac169 -> :sswitch_1
        0x1ac16b -> :sswitch_0
    .end sparse-switch
.end method

.method private static createSpacer(Landroid/content/Context;I)Landroid/view/View;
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e7\u06e2\u06e1"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v6, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v1, "\u06e1\u06e3\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v5, v4, -0x167

    const-string v1, "\u06e1\u06e0\u06e7"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e5\u06e5\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_3
    sget v4, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    const-string v1, "\u06e6\u06e7\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aaefe -> :sswitch_0
        0x1ab321 -> :sswitch_4
        0x1abe45 -> :sswitch_3
        0x1ac243 -> :sswitch_1
        0x1ac566 -> :sswitch_2
    .end sparse-switch
.end method

.method private static createSquareBg(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;
    .locals 7

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v6, 0x0

    const-string v1, "\u06e1\u06e5\u06e8"

    move v2, v3

    move v4, v3

    move v5, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const v1, -0x111164

    xor-int v2, v1, v5

    const-string v1, "\u06e1\u06e7\u06e7"

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e2\u06e5"

    goto :goto_0

    :sswitch_1
    int-to-float v3, v5

    const-string v1, "\u06e8\u06e4\u06e3"

    move v6, v3

    goto :goto_0

    :sswitch_2
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v3

    const-string v1, "\u06e8\u06e0\u06e5"

    move v4, v3

    goto :goto_0

    :sswitch_3
    sget v3, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    const-string v1, "\u06e0\u06e7\u06e1"

    move v5, v3

    goto :goto_0

    :sswitch_4
    sget v3, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    const-string v1, "\u06e7\u06e1\u06df"

    move v5, v3

    goto :goto_0

    :sswitch_5
    invoke-static {v0, v4, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    const-string v1, "\u06e6\u06e6\u06e3"

    goto :goto_0

    :sswitch_6
    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v3

    const-string v1, "\u06e1\u06e1\u06e8"

    move v5, v3

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v6}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e0\u06e4\u06e3"

    goto :goto_0

    :sswitch_8
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e2\u06e7\u06e5"

    goto :goto_0

    :sswitch_9
    const v1, 0x506c3

    xor-int v3, v1, v5

    const-string v1, "\u06e0\u06e8\u06e3"

    move v4, v3

    goto :goto_0

    :sswitch_a
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aab5f -> :sswitch_2
        0x1aabdb -> :sswitch_0
        0x1aaec8 -> :sswitch_1
        0x1aaf44 -> :sswitch_8
        0x1aaf81 -> :sswitch_5
        0x1ab340 -> :sswitch_4
        0x1ab666 -> :sswitch_6
        0x1ac223 -> :sswitch_a
        0x1ac545 -> :sswitch_9
        0x1ac8ed -> :sswitch_3
        0x1ac967 -> :sswitch_7
    .end sparse-switch
.end method

.method private static createSwitchItem(Landroid/content/Context;Ljava/lang/String;ZLjava/util/function/Consumer;)Landroid/widget/LinearLayout;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/function/Consumer",
            "<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Landroid/widget/LinearLayout;"
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-string v6, "\u06e8\u06e6\u06e2"

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {v2, v4}, Landroidx/loader/ۥۧۨۤ;->ۣۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e7\u06e8"

    goto :goto_0

    :sswitch_0
    const-string v6, "\u06e4\u06e6\u06e8"

    goto :goto_0

    :sswitch_1
    new-instance v2, Landroid/widget/Switch;

    invoke-direct {v2, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    invoke-static {v2, p2}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۤ۠ۧ(Ljava/lang/Object;Z)V

    const-string v6, "\u06e5\u06e8\u06e3"

    goto :goto_0

    :sswitch_2
    const/high16 v6, 0x3f800000    # 1.0f

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-static {v1, v0, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06df\u06e4\u06e1"

    goto :goto_0

    :sswitch_3
    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x41700000    # 15.0f

    invoke-static {v0, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v6, "\u06e2\u06df\u06e2"

    goto :goto_0

    :sswitch_4
    invoke-static {v1, v5}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v6, "\u06e6\u06df\u06e2"

    goto :goto_0

    :sswitch_5
    invoke-static {v1, v9}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    const/high16 v6, 0x41400000    # 12.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v10

    const-string v6, "\u06e2\u06e3\u06e6"

    goto :goto_0

    :sswitch_6
    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v1, v10, v9, v8, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    const-string v6, "\u06e6\u06e1\u06e1"

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v6, "\u06e1\u06e6\u06e2"

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۣ۠ۧ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const-string v6, "\u06e7\u06e7\u06e7"

    goto :goto_0

    :sswitch_9
    sget v10, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    const-string v6, "\u06e8\u06e2\u06e0"

    goto :goto_0

    :sswitch_a
    xor-int/lit8 v9, v10, -0x73

    sget v8, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    const-string v6, "\u06e0\u06e1\u06e5"

    goto :goto_0

    :sswitch_b
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v9

    const-string v6, "\u06e5\u06e1\u06e1"

    goto :goto_0

    :sswitch_c
    new-instance v6, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda0;

    invoke-direct {v6, p3}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda0;-><init>(Ljava/util/function/Consumer;)V

    invoke-static {v2, v6}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۡۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e6\u06e0\u06e7"

    goto/16 :goto_0

    :sswitch_d
    invoke-static {v2, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۡ۟ۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۤۤۥ(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const-string v6, "\u06df\u06e6\u06e1"

    goto/16 :goto_0

    :sswitch_e
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-direct {v1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const-string v6, "\u06e3\u06e3\u06e4"

    goto/16 :goto_0

    :sswitch_f
    sget v10, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v9, v10, 0x29d

    const-string v6, "\u06e4\u06e8\u06e7"

    goto/16 :goto_0

    :sswitch_10
    xor-int/lit16 v7, v8, -0x179

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v5, v9, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v6, "\u06e5\u06e6\u06e3"

    goto/16 :goto_0

    :sswitch_11
    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v9

    const/high16 v6, 0x41400000    # 12.0f

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v8

    const-string v6, "\u06e3\u06e4\u06e1"

    goto/16 :goto_0

    :sswitch_12
    sget v10, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    const v6, -0xccce60

    xor-int v8, v6, v10

    const-string v6, "\u06e7\u06e6"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {v0, v8}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->ۧۨ۟ۢ()Landroid/graphics/Typeface;

    move-result-object v3

    const-string v6, "\u06e4\u06e3\u06df"

    goto/16 :goto_0

    :sswitch_14
    iput v9, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    invoke-static {v1, v2, v5}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e4\u06df\u06e1"

    goto/16 :goto_0

    :sswitch_15
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdf -> :sswitch_13
        0xdce1 -> :sswitch_0
        0x1aa79c -> :sswitch_1
        0x1aab04 -> :sswitch_10
        0x1aaf5d -> :sswitch_2
        0x1ab245 -> :sswitch_12
        0x1ab2c5 -> :sswitch_11
        0x1ab684 -> :sswitch_f
        0x1ab6a0 -> :sswitch_6
        0x1ab9c6 -> :sswitch_c
        0x1aba40 -> :sswitch_7
        0x1abaa6 -> :sswitch_b
        0x1abae3 -> :sswitch_5
        0x1abdc5 -> :sswitch_14
        0x1abe62 -> :sswitch_4
        0x1abea0 -> :sswitch_8
        0x1ac149 -> :sswitch_3
        0x1ac16d -> :sswitch_15
        0x1ac186 -> :sswitch_9
        0x1ac607 -> :sswitch_d
        0x1ac926 -> :sswitch_a
        0x1ac9a4 -> :sswitch_e
    .end sparse-switch
.end method

.method private static createSwitchThumb(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 7

    const/high16 v6, 0x41900000    # 18.0f

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e8\u06e0"

    move v2, v3

    move v4, v3

    move v5, v3

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object v0

    :sswitch_0
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e5\u06e5\u06e5"

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v3

    const-string v1, "\u06e3\u06e3\u06e2"

    move v5, v3

    goto :goto_0

    :sswitch_2
    sget v3, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    const-string v1, "\u06e6\u06e6\u06e5"

    move v5, v3

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e6\u06e7"

    goto :goto_0

    :sswitch_4
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v3

    const-string v1, "\u06e2\u06e8\u06e6"

    move v5, v3

    goto :goto_0

    :sswitch_5
    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v3

    const-string v1, "\u06e3\u06e4\u06e2"

    move v4, v3

    goto :goto_0

    :sswitch_6
    sget v3, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۣۣ۠:I

    const-string v1, "\u06e3\u06e0\u06e2"

    move v4, v3

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v5, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    const-string v1, "\u06e1\u06e6\u06df"

    goto :goto_0

    :sswitch_8
    invoke-static {v0, v5, v4}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟۟۠ۡ۟(Ljava/lang/Object;II)V

    const-string v1, "\u06df\u06e8"

    goto :goto_0

    :sswitch_9
    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const-string v1, "\u06e4\u06e6\u06df"

    goto :goto_0

    :sswitch_a
    xor-int/lit16 v3, v5, 0x322

    const-string v1, "\u06e6\u06e5\u06e7"

    move v4, v3

    goto :goto_0

    :sswitch_b
    const v1, -0x1f1d4d

    xor-int v2, v1, v4

    const-string v1, "\u06e0\u06e3\u06e3"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_2
        0x1aab40 -> :sswitch_7
        0x1ab360 -> :sswitch_6
        0x1ab625 -> :sswitch_b
        0x1ab682 -> :sswitch_5
        0x1ab6a1 -> :sswitch_8
        0x1aba9d -> :sswitch_1
        0x1abadc -> :sswitch_0
        0x1abe45 -> :sswitch_9
        0x1ac208 -> :sswitch_3
        0x1ac225 -> :sswitch_a
        0x1ac9a9 -> :sswitch_4
    .end sparse-switch
.end method

.method private static createSwitchTrack(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 11

    const/high16 v10, 0x41200000    # 10.0f

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-string v5, "\u06e8\u06e8\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v8}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e6\u06e6\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_0
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v5, "\u06e7\u06e1\u06e8"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v10}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e2\u06e3\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const-string v5, "\u06e2\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e2\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    new-array v1, v7, [I

    const-string v5, "\u06e6\u06e3\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v3, v4, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e1\u06e7\u06e2"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e8\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v2, v8, v6}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟۟۠ۡ۟(Ljava/lang/Object;II)V

    const-string v1, "\u06df\u06e3\u06e4"

    move-object v5, v1

    goto :goto_0

    :sswitch_8
    sget v8, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    const-string v1, "\u06e2\u06e2\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_9
    const v1, -0xaba6

    xor-int v8, v1, v6

    const-string v1, "\u06df\u06e4\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_a
    int-to-float v9, v8

    const-string v1, "\u06e6\u06e2\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_b
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const-string v1, "\u06e3\u06e0\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_c
    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06e1\u06e7\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_d
    invoke-static {v0, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e1\u06e4\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_e
    invoke-static {p0, v10}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e4\u06e6\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_f
    sget v6, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    const-string v1, "\u06e4\u06e4\u06e0"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_10
    invoke-static {v2, v9}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    const-string v1, "\u06e2\u06e6\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_11
    const/4 v1, 0x1

    new-array v1, v1, [I

    const-string v5, "\u06e0\u06e0\u06e8"

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_12
    invoke-static {v3, v4, v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۥۨۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06df\u06e3"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_13
    xor-int/lit16 v8, v6, -0x1e8

    const-string v1, "\u06e7\u06e4\u06e2"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_14
    const/high16 v1, 0x42100000    # 36.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v8

    const-string v1, "\u06e0\u06e5\u06df"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v0, v7}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e1\u06e0"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_16
    sget v6, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    const-string v1, "\u06e0\u06e3\u06e4"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_17
    const v1, -0x1f1e02

    xor-int v6, v1, v8

    const-string v1, "\u06e1\u06df\u06e8"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_18
    int-to-float v9, v8

    const-string v1, "\u06e5\u06e6"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_19
    const v1, 0x10100a0

    aput v1, v4, v8

    const-string v1, "\u06e0\u06e2\u06e5"

    move-object v5, v1

    goto/16 :goto_0

    :sswitch_1a
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0xdca1 -> :sswitch_d
        0x1aa780 -> :sswitch_8
        0x1aaae8 -> :sswitch_f
        0x1aaaff -> :sswitch_e
        0x1aab1f -> :sswitch_2
        0x1aab23 -> :sswitch_12
        0x1aab41 -> :sswitch_9
        0x1aab7a -> :sswitch_c
        0x1aabdf -> :sswitch_1
        0x1aae8a -> :sswitch_3
        0x1aaf24 -> :sswitch_16
        0x1aaf7c -> :sswitch_1a
        0x1aaf80 -> :sswitch_7
        0x1ab284 -> :sswitch_b
        0x1ab2a5 -> :sswitch_17
        0x1ab2c4 -> :sswitch_a
        0x1ab324 -> :sswitch_14
        0x1ab624 -> :sswitch_15
        0x1aba60 -> :sswitch_13
        0x1abaa5 -> :sswitch_18
        0x1ac1a9 -> :sswitch_10
        0x1ac1c8 -> :sswitch_5
        0x1ac222 -> :sswitch_11
        0x1ac50b -> :sswitch_4
        0x1ac54e -> :sswitch_6
        0x1ac5a5 -> :sswitch_19
        0x1ac9df -> :sswitch_0
    .end sparse-switch
.end method

.method private static createVerticalDivider(Landroid/content/Context;)Landroid/view/View;
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06df\u06e6\u06e5"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v2, v7}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e2\u06e0\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v7, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const-string v1, "\u06e6\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const-string v3, "\u06e1\u06e7\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v4, v6, 0x35

    const-string v1, "\u06e8\u06e2\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    const v1, 0x111019

    xor-int v5, v1, v6

    const-string v1, "\u06e2\u06e0\u06e8"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_4
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    const-string v1, "\u06e6\u06e3\u06e1"

    move-object v3, v1

    move v7, v5

    goto :goto_0

    :sswitch_5
    sget v5, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    const-string v1, "\u06e4\u06e7\u06e2"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e6\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    sget v5, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    const-string v1, "\u06e2\u06e2\u06df"

    move-object v3, v1

    move v6, v5

    goto :goto_0

    :sswitch_8
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aa7de -> :sswitch_1
        0x1aaf7c -> :sswitch_4
        0x1ab269 -> :sswitch_8
        0x1ab29f -> :sswitch_2
        0x1ab6e2 -> :sswitch_5
        0x1ababf -> :sswitch_3
        0x1ac1c4 -> :sswitch_7
        0x1ac206 -> :sswitch_6
        0x1ac929 -> :sswitch_0
    .end sparse-switch
.end method

.method private static dp(Landroid/content/Context;F)I
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const-string v3, "\u06df\u06e0\u06e0"

    move-object v0, v1

    move-object v2, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    mul-float v5, p1, v7

    const-string v1, "\u06e7\u06e6\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "\u06e0\u06e0\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v1

    const-string v3, "\u06e6\u06e5\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v6

    const-string v1, "\u06e5\u06df\u06e5"

    move-object v3, v1

    move v7, v6

    goto :goto_0

    :sswitch_3
    float-to-int v4, p1

    const-string v1, "\u06e6\u06e3\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    const/high16 v1, 0x3f000000    # 0.5f

    add-float p1, v5, v1

    const-string v1, "\u06e3\u06e1\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa71f -> :sswitch_0
        0x1aaae3 -> :sswitch_1
        0x1ab647 -> :sswitch_3
        0x1ac1c5 -> :sswitch_5
        0x1ac203 -> :sswitch_2
        0x1ac5e5 -> :sswitch_4
    .end sparse-switch
.end method

.method static synthetic lambda$0(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Ljava/lang/Boolean;)V
    .locals 2

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۥۧ۠ۥ(Z)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۦۥۥۡ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "08VRljShYa"

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۤۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$1(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Ljava/lang/Boolean;)V
    .locals 2

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۢۥۡۦ(Z)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۦۥۥۡ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۣۨۧۥ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "vKEuKWWFy1LBxPshlSVFN"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$10(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;IIZ)V
    .locals 6

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۦۥۥۡ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧ۟۠ۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda1;

    invoke-direct {v1, p1, p0}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    const-wide/16 v2, -0x347

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "t5ALNZH2rikaBqFvs4"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic lambda$11(Landroid/content/Context;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟۟ۡۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$2(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Ljava/lang/Boolean;)V
    .locals 1

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۨ۟ۧۨ(Z)V

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۦۥۥۡ(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$3(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$4(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method static synthetic lambda$5(Ljava/util/function/Consumer;Landroid/widget/CompoundButton;Z)V
    .locals 1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Landroidx/loader/ۡۢۢ;->ۤۨۡۥ(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0, v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۥۨ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$6(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e0\u06e2"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance v0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda6;

    invoke-direct {v0, p3, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda6;-><init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;)V

    const-string v1, "\u06e7\u06e4\u06e5"

    goto :goto_0

    :sswitch_0
    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۤۧۡ(Ljava/lang/Object;IZLjava/lang/Object;)V

    const-string v1, "\u06e8\u06e2\u06e3"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06df\u06e2"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab9e6 -> :sswitch_1
        0x1ac5a8 -> :sswitch_0
        0x1ac929 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic lambda$7(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;IIZ)V
    .locals 6

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۦۥۥۡ(Ljava/lang/Object;)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧ۟۠ۨ()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda2;

    invoke-direct {v1, p1, p0}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    const-wide/16 v2, -0x184

    sget v4, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۤ۟ۧۤ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۣۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$8(Landroid/content/Context;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V
    .locals 2

    invoke-static {p0, p1}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟۟ۡۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "7B3cfeavSgDjp1M0trQmH"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method static synthetic lambda$9(Landroid/app/Dialog;Landroid/content/Context;ILkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e3\u06e3"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣۤۧۡ(Ljava/lang/Object;IZLjava/lang/Object;)V

    const-string v1, "\u06e1\u06e4\u06e4"

    goto :goto_0

    :sswitch_0
    new-instance v0, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;

    invoke-direct {v0, p3, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda5;-><init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;Landroid/content/Context;)V

    const-string v1, "\u06e4\u06e2\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e4\u06df"

    goto :goto_0

    :sswitch_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77f -> :sswitch_1
        0x1aab5b -> :sswitch_0
        0x1aaf21 -> :sswitch_2
    .end sparse-switch
.end method

.method public static show(Landroid/content/Context;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V
    .locals 13

    const/4 v12, 0x1

    const/4 v11, 0x0

    const/high16 v10, 0x41800000    # 16.0f

    const/4 v9, 0x0

    const/high16 v8, 0x41a00000    # 20.0f

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "g8Tvw4rZegl70hHSME"

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۟ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_2
    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Landroid/app/Dialog;

    const v1, 0x1030283

    sget v2, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۢۥۨۦ:I

    xor-int/2addr v1, v2

    invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    invoke-static {v0, v12}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, 0x115

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v3, 0x66000335

    sget v4, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

    xor-int/2addr v3, v4

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v3, v12}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    invoke-static {p0, v10}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v4

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {p0, v5}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0, v10}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {p0, v8}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v3, v4, v5, v6, v7}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v5, v5, 0x3a4

    invoke-direct {v4, v2, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v5, 0x50

    iput v5, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {v3, v4}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v4, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/16 v2, 0x8

    new-array v2, v2, [F

    invoke-static {p0, v8}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    int-to-float v5, v5

    aput v5, v2, v11

    invoke-static {p0, v8}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    int-to-float v5, v5

    aput v5, v2, v12

    const/4 v5, 0x2

    invoke-static {p0, v8}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v2, v5

    const/4 v5, 0x3

    invoke-static {p0, v8}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v6

    int-to-float v6, v6

    aput v6, v2, v5

    const/4 v5, 0x4

    aput v9, v2, v5

    const/4 v5, 0x5

    aput v9, v2, v5

    const/4 v5, 0x6

    aput v9, v2, v5

    const/4 v5, 0x7

    aput v9, v2, v5

    invoke-static {v4, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v4

    const/16 v5, 0x10

    sget v6, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v6, v6, -0xe9

    const/16 v7, 0x5e8

    invoke-static {v4, v5, v6, v7}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۧۢۨۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41900000    # 18.0f

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const v4, -0xcccd27

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/2addr v4, v5

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    sget v4, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    xor-int/lit16 v4, v4, 0x30e

    invoke-static {v2, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {p0, v4}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0, v10}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧۧ۠ۦ(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {v2, v11, v4, v11, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۦۦ۠۠(Ljava/lang/Object;)Z

    move-result v2

    new-instance v4, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda7;

    invoke-direct {v4, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda7;-><init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v5

    const/16 v6, 0x14

    sget v7, Landroidx/customview/ۡۤۡۤ;->۟ۦ۟ۨۨ:I

    xor-int/lit16 v7, v7, 0xf5

    const/16 v8, 0x412

    invoke-static {v5, v6, v7, v8}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2, v4}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۨۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧ۟ۧ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v2

    const/16 v4, 0x1a

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x208

    const/16 v6, 0x173

    invoke-static {v2, v4, v5, v6}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۟۠ۤۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۣۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۤۢۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۧ۟ۧ۠(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->۟ۦۨۥۨ()Z

    move-result v2

    new-instance v4, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda8;

    invoke-direct {v4, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda8;-><init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v5

    const/16 v6, 0x20

    sget v7, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v7, v7, -0x10f

    const/16 v8, 0x1bf

    invoke-static {v5, v6, v7, v8}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2, v4}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۨۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۥۦۦۨ()Z

    move-result v2

    new-instance v4, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda9;

    invoke-direct {v4, p1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda9;-><init>(Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureMainDialog;->۟ۦ۠ۧۤ()[S

    move-result-object v5

    const/16 v6, 0x26

    sget v7, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v7, v7, -0x114

    const/16 v8, 0x5ff

    invoke-static {v5, v6, v7, v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧ۠ۥ۟([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v5, v2, v4}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۨۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v3, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda10;

    invoke-direct {v2, v0}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda10;-><init>(Landroid/app/Dialog;)V

    invoke-static {v1, v2}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda11;

    invoke-direct {v1}, Lkevin/fun/hook/gesture/GestureMainDialog$$ExternalSyntheticLambda11;-><init>()V

    invoke-static {v3, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    invoke-static {v3}, Lkevin/fun/hook/gesture/GestureMainDialog;->ۣ۟۠ۥۥ(Ljava/lang/Object;)V

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public static ۟۠ۤۨ۟(Ljava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createSquareBg(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟۠ۥۥ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->animatePanel(Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "DSUvdq194eALhdgi"

    invoke-static {v0}, Landroidx/loader/۟۠ۢۧۡ;->ۨۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۢۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Landroid/app/Dialog;

    check-cast p2, Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/gesture/GestureMainDialog;->createQuadrantGrid(Landroid/content/Context;Landroid/app/Dialog;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۤۤۥ(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createSwitchTrack(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦ۠ۧۤ()[S
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/gesture/GestureMainDialog;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦۤۤ۠(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createVerticalDivider(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۟۠ۨ()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/gesture/GestureMainDialog;->MAIN_HANDLER:Landroid/os/Handler;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧ۟ۧ۠(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createDivider(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟ۧۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->createRegionTitle(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۧۧ۠ۦ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Landroidx/activity/ۤۧۧۧ;->ۥۢۧۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->dp(Landroid/content/Context;F)I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠ۧ۟(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createSwitchThumb(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->createActionButton(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۧۤۥ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureMainDialog;->createHorizontalDivider(Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۥۣۧۨ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/app/Dialog;

    check-cast p4, Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;

    invoke-static {p0, p1, p2, p3, p4}, Lkevin/fun/hook/gesture/GestureMainDialog;->createRegionCell(Landroid/content/Context;ILjava/lang/String;Landroid/app/Dialog;Lkevin/fun/hook/gesture/GestureMainDialog$OnSettingChangedListener;)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۡۨۥ(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    check-cast p1, Ljava/lang/String;

    check-cast p3, Ljava/util/function/Consumer;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/gesture/GestureMainDialog;->createSwitchItem(Landroid/content/Context;Ljava/lang/String;ZLjava/util/function/Consumer;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨۨۦ۟(Ljava/lang/Object;I)Landroid/view/View;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureMainDialog;->createSpacer(Landroid/content/Context;I)Landroid/view/View;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method
