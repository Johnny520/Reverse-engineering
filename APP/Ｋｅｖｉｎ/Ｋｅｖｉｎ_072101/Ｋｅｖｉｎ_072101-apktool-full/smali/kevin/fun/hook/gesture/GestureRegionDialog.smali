.class public Lkevin/fun/hook/gesture/GestureRegionDialog;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;
    }
.end annotation


# static fields
.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/gesture/GestureRegionDialog;->short:[S

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۤۡۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lkevin/fun/hook/gesture/GestureRegionDialog;->MAIN_HANDLER:Landroid/os/Handler;

    return-void

    nop

    :array_0
    .array-data 2
        0x2282s
        0x63bds
        0x7372s
        0x57ads
        0x5348s
        0x50fbs
        0x4d03s
        0x5032s
        0x54d7s
        0x5fc3s
        0x4c2es
        0x511fs
        0x55fas
        0x5f62s
        0x429bs
        0x5fabs
        0x5b4es
        0x5b74s
        0x4898s
        0x55a8s
        0x514ds
        0x5740s
        -0x7ef4s
        0x75dcs
        0x5516s
        0x5721s
        -0x6bf2s
        0x6278s
        0x411s
        0x41cs
        0x411s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    const-string v0, "MoiScy"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۣ۟ۧۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method private static addRadioItem(Landroid/content/Context;Landroid/widget/LinearLayout;ILjava/lang/String;ZLjava/lang/Runnable;)V
    .locals 8

    const/high16 v4, 0x41600000    # 14.0f

    const/4 v7, 0x0

    const/high16 v6, 0x41800000    # 16.0f

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v7}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    sget v1, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v1, v1, 0x42

    invoke-static {v0, v1}, Landroidx/emoji2/ۢۧۡۧ;->ۡۤۥ(Ljava/lang/Object;I)V

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v2

    invoke-static {p0, v6}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v1, p3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v1, v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    new-instance v2, Landroid/widget/TextView;

    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v3

    const/4 v4, 0x1

    const/16 v5, 0x591

    invoke-static {v3, v7, v4, v5}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    sget v4, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v4, v4, -0x54

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v3, v7, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-static {v0, v1, v3}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v2, p4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->۟ۦۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;Z)V

    new-instance v1, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda3;

    invoke-direct {v1, p5}, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda3;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۠۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-static {p1}, Landroidx/loader/ۣۦ۟ۡ;->ۣۡ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    sget v3, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۢۢ:I

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
    xor-int/lit16 v0, v3, -0x336

    add-int/2addr v0, v2

    if-ge v1, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v1

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    sget v3, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v3, v3, 0x115

    invoke-direct {v2, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x11117f

    sget v2, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۣ۠ۢۢ:I

    xor-int/2addr v1, v2

    invoke-static {v0, v1}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

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

.method private static animatePanel(Landroid/view/View;)V
    .locals 14

    const-wide/16 v8, 0x0

    const v13, 0x3f666666    # 0.9f

    const/4 v1, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e2\u06e2"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-wide v6, v8

    move-wide v10, v8

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0, v13}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۡۢۡۨ(Ljava/lang/Object;F)V

    const-string v1, "\u06e5\u06e6\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۢۤۧۢ(Ljava/lang/Object;F)V

    const-string v1, "\u06e8\u06e6\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    sget v5, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    const-string v1, "\u06e6\u06e5\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v12}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۡۢۢ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06e2\u06df\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v12}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣۤۦۦ(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06df\u06e1\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۣ۟ۡۤ(Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06e2\u06e7\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    const-wide/16 v8, -0x1de

    xor-long/2addr v8, v6

    const-string v1, "\u06e4\u06e4\u06e5"

    move-object v4, v1

    move-wide v10, v8

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۦ۟ۢ۟(Ljava/lang/Object;Ljava/lang/Object;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06e6\u06e8\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    new-instance v0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {v0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    const-string v1, "\u06e1\u06df\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_8
    invoke-static {p0, v13}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦۡۤۨ(Ljava/lang/Object;F)V

    const-string v1, "\u06df\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v3, v12}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣۡۦ۠(Ljava/lang/Object;F)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06e5\u06e2\u06e6"

    move-object v2, v1

    goto :goto_0

    :sswitch_a
    int-to-long v6, v5

    const-string v1, "\u06e2\u06e2\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_b
    invoke-static {v3, v10, v11}, Landroidx/loader/ۥۧۨۤ;->ۣۣۧ۠(Ljava/lang/Object;J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    const-string v4, "\u06e3\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_c
    invoke-static {v3}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۤ۟ۥ(Ljava/lang/Object;)V

    const-string v1, "\u06e7\u06e8\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5d -> :sswitch_7
        0x1aa73f -> :sswitch_1
        0x1aae81 -> :sswitch_6
        0x1ab245 -> :sswitch_9
        0x1ab2a1 -> :sswitch_5
        0x1ab33c -> :sswitch_2
        0x1aba24 -> :sswitch_8
        0x1aba65 -> :sswitch_b
        0x1abde9 -> :sswitch_3
        0x1abe5e -> :sswitch_0
        0x1ac205 -> :sswitch_a
        0x1ac265 -> :sswitch_c
        0x1ac61e -> :sswitch_d
        0x1ac9a3 -> :sswitch_4
    .end sparse-switch
.end method

.method private static applyRadioStyle(Landroid/widget/TextView;Landroid/widget/TextView;Z)V
    .locals 2

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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const v0, -0xeeed4f

    sget v1, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, -0xab2b

    sget v1, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const v0, 0x666613

    sget v1, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v0, v1

    invoke-static {p0, v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->ۧۨ۟ۢ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v0, v0, -0x327

    invoke-static {p1, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch
.end method

.method private static buildTitle(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 8

    const/4 v1, 0x0

    const/high16 v7, 0x41800000    # 16.0f

    const/4 v5, 0x0

    const-string v3, "\u06e7\u06e4\u06e4"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, v2}, Landroidx/customview/ۡۤۡۤ;->ۧ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, v5, v6, v5, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    const-string v1, "\u06e0\u06e1\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const v1, 0xcccea3

    xor-int v4, v1, v6

    const-string v1, "\u06df\u06e2\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e5\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, p1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e4\u06e4"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->۟ۡۡۧۦ()Landroid/graphics/Typeface;

    move-result-object v1

    const-string v3, "\u06df\u06e8\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    const/high16 v1, 0x41400000    # 12.0f

    invoke-static {p0, v1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v6

    const-string v1, "\u06e6\u06e2\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    sget v6, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۢ۟ۡ:I

    const-string v1, "\u06e5\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v0, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const-string v1, "\u06e8\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit8 v4, v6, -0x74

    const-string v1, "\u06e5\u06e7\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_9
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v1, "\u06e0\u06e3\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_a
    invoke-static {v0, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const-string v1, "\u06e8\u06e6\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_b
    sget v6, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    const-string v1, "\u06e3\u06e5\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_c
    invoke-static {p0, v7}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    const-string v1, "\u06e1\u06e8\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_d
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_1
        0x1aa75e -> :sswitch_2
        0x1aab05 -> :sswitch_d
        0x1aab3d -> :sswitch_3
        0x1aab60 -> :sswitch_7
        0x1aaf9b -> :sswitch_0
        0x1ab6c1 -> :sswitch_8
        0x1ab6c3 -> :sswitch_6
        0x1abe84 -> :sswitch_a
        0x1ac1a5 -> :sswitch_c
        0x1ac5a7 -> :sswitch_9
        0x1ac985 -> :sswitch_b
        0x1ac988 -> :sswitch_4
        0x1ac9a2 -> :sswitch_5
    .end sparse-switch
.end method

.method private static dp(Landroid/content/Context;F)I
    .locals 8

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const-string v3, "\u06e2\u06e8\u06e5"

    move-object v0, v1

    move-object v2, v1

    move v5, v6

    move v7, v6

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟۟ۤۦۤ(Ljava/lang/Object;)Landroid/util/DisplayMetrics;

    move-result-object v1

    const-string v3, "\u06e7\u06e8\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۨ۟ۨ(Ljava/lang/Object;)Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "\u06e6\u06e3\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/high16 v1, 0x3f000000    # 0.5f

    add-float p1, v5, v1

    const-string v1, "\u06e4\u06e0\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_2
    mul-float v5, p1, v7

    const-string v1, "\u06e3\u06e2\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦۡۧ(Ljava/lang/Object;)F

    move-result v6

    const-string v1, "\u06e2\u06e3\u06e4"

    move-object v3, v1

    move v7, v6

    goto :goto_0

    :sswitch_4
    float-to-int v4, p1

    const-string v1, "\u06e8\u06df\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab2c3 -> :sswitch_2
        0x1ab35f -> :sswitch_0
        0x1ab662 -> :sswitch_1
        0x1ab9e5 -> :sswitch_4
        0x1ac624 -> :sswitch_3
        0x1ac8cc -> :sswitch_5
    .end sparse-switch
.end method

.method private static getRegionName(I)Ljava/lang/String;
    .locals 4

    packed-switch p0, :pswitch_data_0

    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/4 v1, 0x1

    sget v2, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v2, v2, -0x3c3

    const/16 v3, 0x497

    invoke-static {v0, v1, v2, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/4 v1, 0x5

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v2, v2, -0x3a2

    const/16 v3, 0x308

    invoke-static {v0, v1, v2, v3}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/16 v1, 0x9

    sget v2, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/lit16 v2, v2, -0x3c3

    const/16 v3, 0x225

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/16 v1, 0xd

    sget v2, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/lit16 v2, v2, 0xc7

    const/16 v3, 0xc91

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/16 v1, 0x11

    sget v2, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    xor-int/lit16 v2, v2, -0x112

    const/16 v3, 0x692

    invoke-static {v0, v1, v2, v3}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic lambda$0(ZIILkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;Landroid/app/Dialog;Landroid/content/Context;)V
    .locals 4

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
    invoke-static {p1, p2}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۧۧۧ۠(II)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p1, p2}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۥ۟ۦۡ(II)V

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz p3, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p3, p1, p2, p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۥۡۧۧ(Ljava/lang/Object;IIZ)V

    :sswitch_9
    invoke-static {p4}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v0

    const/16 v1, 0x15

    sget v2, Lkevin/fun/hook/۟ۥ۠۠;->ۢۦۧۧ:I

    xor-int/lit16 v2, v2, -0x1c8

    const/16 v3, 0xab2

    invoke-static {v0, v1, v2, v3}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {p5, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۥۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method static synthetic lambda$1(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->ۧۢۡۧ(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic lambda$2(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    const-string v0, "iKzxH9lA"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method static synthetic lambda$3(Ljava/lang/Runnable;Landroid/view/View;)V
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
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣ۠ۢۥ(Ljava/lang/Object;)V

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

.method public static show(Landroid/content/Context;IZLkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;)V
    .locals 17

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez p0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v6, Landroid/app/Dialog;

    const v1, 0x1030294

    sget v2, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/2addr v1, v2

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x1

    invoke-static {v6, v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۡۡ۠(Ljava/lang/Object;Z)V

    new-instance v15, Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    invoke-direct {v15, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget v1, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v1, v1, -0x11f

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v15, v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x66000166

    sget v3, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/2addr v2, v3

    invoke-static {v15, v2}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۣۢۧ(Ljava/lang/Object;I)V

    new-instance v16, Landroid/widget/LinearLayout;

    invoke-direct/range {v16 .. v17}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    const/high16 v2, 0x41400000    # 12.0f

    move-object/from16 v0, p0

    invoke-static {v0, v2}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v2

    const/high16 v3, 0x41000000    # 8.0f

    move-object/from16 v0, p0

    invoke-static {v0, v3}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v3

    const/high16 v4, 0x41400000    # 12.0f

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    const/high16 v5, 0x41800000    # 16.0f

    move-object/from16 v0, p0

    invoke-static {v0, v5}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v5

    move-object/from16 v0, v16

    invoke-static {v0, v2, v3, v4, v5}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۧ۠ۧۨ(Ljava/lang/Object;IIII)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    sget v3, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v3, v3, -0x324

    invoke-direct {v2, v1, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x50

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v3, 0x0

    const/high16 v4, 0x41800000    # 16.0f

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    aput v4, v1, v3

    const/4 v3, 0x1

    const/high16 v4, 0x41800000    # 16.0f

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    aput v4, v1, v3

    const/4 v3, 0x2

    const/high16 v4, 0x41800000    # 16.0f

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    aput v4, v1, v3

    const/4 v3, 0x3

    const/high16 v4, 0x41800000    # 16.0f

    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣ۟ۡۥۦ(Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    aput v4, v1, v3

    const/4 v3, 0x4

    const/4 v4, 0x0

    aput v4, v1, v3

    const/4 v3, 0x5

    const/4 v4, 0x0

    aput v4, v1, v3

    const/4 v3, 0x6

    const/4 v4, 0x0

    aput v4, v1, v3

    const/4 v3, 0x7

    const/4 v4, 0x0

    aput v4, v1, v3

    invoke-static {v2, v1}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, v16

    invoke-static {v0, v2}, Landroidx/activity/ۦۧۥۥ;->۟ۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz p2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v1

    const/16 v2, 0x18

    sget v3, Landroidx/customview/ۤۡۥ;->ۣ۟ۢۥۢ:I

    xor-int/lit8 v3, v3, -0x68

    const/16 v4, 0x6da

    invoke-static {v1, v2, v3, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۧۢۥ([SIII)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v2, 0xbe22

    goto :goto_2

    :sswitch_7
    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v1

    const/16 v2, 0x1a

    sget v3, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v3, v3, -0x10b

    const/16 v4, 0x171

    invoke-static {v1, v2, v3, v4}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۢۤۤ([SIII)Ljava/lang/String;

    move-result-object v1

    :sswitch_8
    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->۟ۢۧ۠ۥ(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۥۣ۠ۢ()[S

    move-result-object v3

    const/16 v4, 0x1c

    sget v5, Landroidx/activity/ۤۧۧۧ;->۟۟ۢ۠ۡ:I

    xor-int/lit16 v5, v5, 0x1e9

    const/16 v7, 0x431

    invoke-static {v3, v4, v5, v7}, Landroidx/activity/ۦۧۥۥ;->۟ۤۡۦۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    invoke-static {v0, v1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->۟۠ۧ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    move-object/from16 v0, v16

    invoke-static {v0, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-static {v8, v1}, Landroidx/customview/ۡۤۡۤ;->ۣۧۤۡ(Ljava/lang/Object;I)V

    move-object/from16 v0, v16

    invoke-static {v0, v8}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbebd

    goto :goto_3

    :sswitch_a
    if-eqz p2, :cond_2

    const v1, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static/range {p1 .. p1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۡۡ(I)I

    move-result v1

    const v2, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :sswitch_c
    move v13, v1

    :goto_5
    const/4 v1, 0x0

    move v14, v1

    :goto_6
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟۟۠۟ۦ()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const v1, 0xc202

    :goto_7
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_7

    :sswitch_d
    if-lt v14, v2, :cond_3

    const v1, 0xc25f

    goto :goto_7

    :sswitch_e
    const v2, 0xbf1a

    goto :goto_4

    :sswitch_f
    invoke-static/range {p1 .. p1}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۡ۟ۧۤ(I)I

    move-result v1

    move v13, v1

    goto :goto_5

    :cond_3
    :sswitch_10
    const v1, 0xc240

    goto :goto_7

    :sswitch_11
    invoke-static/range {v15 .. v16}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۡۢ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6, v15}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥۢۨۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda1;

    invoke-direct {v1, v6}, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda1;-><init>(Landroid/app/Dialog;)V

    invoke-static {v15, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda2;-><init>()V

    move-object/from16 v0, v16

    invoke-static {v0, v1}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۦۧۤۡ(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۣۣۥۥ(Ljava/lang/Object;)V

    :sswitch_12
    return-void

    :sswitch_13
    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۢ۠ۧ()[I

    move-result-object v1

    aget v4, v1, v14

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟۟۠۟ۦ()[Ljava/lang/String;

    move-result-object v1

    aget-object v10, v1, v14

    const v1, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_14
    const v1, 0xc2bc

    goto :goto_8

    :sswitch_15
    if-ne v4, v13, :cond_4

    const v1, 0xc2db

    goto :goto_8

    :sswitch_16
    const/4 v11, 0x1

    const v1, 0xc2fa

    :goto_9
    const v2, 0xc30b

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_9

    :sswitch_17
    const v1, 0xc5a4

    goto :goto_9

    :sswitch_18
    const/4 v11, 0x0

    :sswitch_19
    new-instance v1, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;

    move/from16 v2, p2

    move/from16 v3, p1

    move-object/from16 v5, p3

    move-object/from16 v7, p0

    invoke-direct/range {v1 .. v7}, Lkevin/fun/hook/gesture/GestureRegionDialog$$ExternalSyntheticLambda0;-><init>(ZIILkevin/fun/hook/gesture/GestureRegionDialog$ActionCallback;Landroid/app/Dialog;Landroid/content/Context;)V

    move-object/from16 v7, p0

    move v9, v4

    move-object v12, v1

    invoke-static/range {v7 .. v12}, Lkevin/fun/hook/gesture/GestureRegionDialog;->ۤ۠۠ۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZLjava/lang/Object;)V

    sget v1, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v1, v1, 0x10d

    add-int/2addr v1, v14

    const v2, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_1a
    const v2, 0xc620

    goto :goto_a

    :sswitch_1b
    move v14, v1

    goto/16 :goto_6

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_12
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_f
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_d
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_18
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_19
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_1b
    .end sparse-switch
.end method

.method private static showToast(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۨۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۠۠ۥۣ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۟۠ۧ۟۠(Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->buildTitle(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

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

.method public static ۟ۢۧ۠ۥ(I)Ljava/lang/String;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureRegionDialog;->getRegionName(I)Ljava/lang/String;

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

.method public static ۣ۟ۡۥۦ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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

    invoke-static {p0, p1}, Lkevin/fun/hook/gesture/GestureRegionDialog;->dp(Landroid/content/Context;F)I

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

.method public static ۟ۦۡۥۧ(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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
    check-cast p0, Landroid/widget/TextView;

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/gesture/GestureRegionDialog;->applyRadioStyle(Landroid/widget/TextView;Landroid/widget/TextView;Z)V

    :sswitch_3
    invoke-static {}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۤ۠ۧۡ()I

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
    const-string v0, "eL2v42pW"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۣۣۥۥ(Ljava/lang/Object;)V
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
    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Lkevin/fun/hook/gesture/GestureRegionDialog;->animatePanel(Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    const-string v0, "j3ZziHJA0"

    invoke-static {v0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢ۠ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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

.method public static ۤ۠۠ۤ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZLjava/lang/Object;)V
    .locals 6

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Ljava/lang/Runnable;

    move v2, p2

    move v4, p4

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/gesture/GestureRegionDialog;->addRadioItem(Landroid/content/Context;Landroid/widget/LinearLayout;ILjava/lang/String;ZLjava/lang/Runnable;)V

    :sswitch_3
    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "UqSp8KzJc0ty2Dp"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۥۣ۠ۢ()[S
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    sget-object v0, Lkevin/fun/hook/gesture/GestureRegionDialog;->short:[S

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
