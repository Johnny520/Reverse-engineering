.class public final synthetic Lu20;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/widget/ScrollView;

.field public final b:Landroid/widget/ScrollView;

.field public final c:Landroid/widget/ScrollView;

.field public final d:Landroid/widget/ScrollView;

.field public final e:Landroid/widget/LinearLayout;

.field public final f:Landroid/widget/LinearLayout;

.field public final g:Landroid/widget/LinearLayout;

.field public final h:Landroid/widget/LinearLayout;

.field public final i:Landroid/widget/LinearLayout;

.field public final j:Lsn;

.field public final k:Landroid/view/View;

.field public final l:Lo40;

.field public final m:Lo40;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v4, 0x0

    const-string v2, "\u06e6\u06e6\u06e8"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    iput-object p3, p0, Lu20;->c:Landroid/widget/ScrollView;

    iput-object p4, p0, Lu20;->d:Landroid/widget/ScrollView;

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    move-result v2

    if-ltz v2, :cond_0

    const/16 v2, 0x4c

    sput v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    const-string v2, "\u06e6\u06e6\u06e8"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v2, v3

    const v3, 0x1ac575

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_2
    iput-object p1, p0, Lu20;->a:Landroid/widget/ScrollView;

    iput-object p2, p0, Lu20;->b:Landroid/widget/ScrollView;

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/lit16 v3, v3, 0x15ab

    add-int/2addr v2, v3

    if-gtz v2, :cond_1

    const-string v2, "\u06e2\u06e1\u06e3"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e5\u06e4\u06e2"

    :goto_1
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_3
    iput-object p7, p0, Lu20;->g:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lu20;->h:Landroid/widget/LinearLayout;

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v2

    if-ltz v2, :cond_3

    const/16 v2, 0x3c

    sput v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    :cond_2
    const-string v2, "\u06e8\u06e4\u06df"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int/2addr v2, v3

    const v3, 0x1ab641

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_4
    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sub-int/2addr v2, v3

    const v3, -0x1ac325

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    iput-object p5, p0, Lu20;->e:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lu20;->f:Landroid/widget/LinearLayout;

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v2, :cond_4

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v2, "\u06e4\u06e2\u06e1"

    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    rem-int/2addr v2, v3

    const v3, 0x1aafda

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_6
    iput-object p9, p0, Lu20;->i:Landroid/widget/LinearLayout;

    move-object/from16 v0, p10

    iput-object v0, p0, Lu20;->j:Lsn;

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v3, v3, 0x2248

    add-int/2addr v2, v3

    if-gtz v2, :cond_5

    const/16 v2, 0x30

    sput v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v2, "\u06e8\u06e7\u06e4"

    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e4\u06e2\u06e1"

    :goto_2
    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p11

    iput-object v0, p0, Lu20;->k:Landroid/view/View;

    move-object/from16 v0, p12

    iput-object v0, p0, Lu20;->l:Lo40;

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    or-int/lit16 v3, v3, 0xb1e

    mul-int/2addr v2, v3

    if-ltz v2, :cond_2

    const/16 v2, 0x5d

    sput v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v2, "\u06e3\u06e1\u06df"

    goto :goto_2

    :cond_6
    :sswitch_8
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v2, :cond_7

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v2, "\u06e0\u06e4\u06e7"

    goto/16 :goto_1

    :cond_7
    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/2addr v2, v3

    const v3, 0xd909

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_9
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v4, v5}, Ljava/io/PrintStream;->println(D)V

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v3, v3, -0x116

    sub-int/2addr v2, v3

    if-gtz v2, :cond_8

    :cond_8
    const-string v2, "\u06df\u06e8"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p13

    iput-object v0, p0, Lu20;->m:Lo40;

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v2

    if-ltz v2, :cond_6

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v2, :cond_9

    const/16 v2, 0x4c

    sput v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v2, "\u06e5\u06e4\u06e2"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e1\u06e0\u06e7"

    goto/16 :goto_1

    :sswitch_b
    const-string v2, "cuhFOozgA8QNWSJZserPN"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->ۣۣ۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v2, v3

    const v3, 0xdc0a

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc9d -> :sswitch_9
        0x1aaea8 -> :sswitch_b
        0x1aaf23 -> :sswitch_3
        0x1ab284 -> :sswitch_4
        0x1ab641 -> :sswitch_6
        0x1aba23 -> :sswitch_7
        0x1abe23 -> :sswitch_1
        0x1ac228 -> :sswitch_2
        0x1ac606 -> :sswitch_5
        0x1ac963 -> :sswitch_a
        0x1ac9c5 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 17

    const/16 v16, 0x0

    const-string v1, "\u06e2\u06e1\u06e8"

    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    div-int/lit16 v2, v2, -0x2521

    mul-int/2addr v1, v2

    if-eqz v1, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v1, "\u06e7\u06e7\u06e7"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lu20;->a:Landroid/widget/ScrollView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lu20;->b:Landroid/widget/ScrollView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lu20;->c:Landroid/widget/ScrollView;

    move-object/from16 v0, p0

    iget-object v4, v0, Lu20;->d:Landroid/widget/ScrollView;

    move-object/from16 v0, p0

    iget-object v5, v0, Lu20;->e:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lu20;->f:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v7, v0, Lu20;->g:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v8, v0, Lu20;->h:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v9, v0, Lu20;->i:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v10, v0, Lu20;->j:Lsn;

    move-object/from16 v0, p0

    iget-object v11, v0, Lu20;->k:Landroid/view/View;

    move-object/from16 v0, p0

    iget-object v12, v0, Lu20;->l:Lo40;

    move-object/from16 v0, p0

    iget-object v13, v0, Lu20;->m:Lo40;

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v1 .. v15}, Lz20;->d(Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Lsn;Landroid/view/View;Lo40;Lo40;IZ)V

    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    xor-int/lit16 v2, v2, -0x2002

    xor-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06e3\u06e6\u06e5"

    invoke-static {v1}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    goto :goto_0

    :cond_0
    const-string v2, "\u06e1\u06e4\u06e0"

    move-object/from16 v1, v16

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v1

    if-ltz v1, :cond_2

    sget v1, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    mul-int/2addr v1, v2

    const v2, 0x155676

    add-int/2addr v1, v2

    move v2, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e2\u06e1\u06e8"

    goto :goto_1

    :cond_2
    :sswitch_3
    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    rem-int/lit16 v2, v2, 0x1eec

    div-int/2addr v1, v2

    if-eqz v1, :cond_3

    const/16 v1, 0x61

    sput v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v1, "\u06e7\u06df\u06e3"

    invoke-static {v1}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac377

    add-int/2addr v1, v2

    move v2, v1

    goto/16 :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/lit16 v2, v2, 0x25a

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    const-string v1, "\u06e3\u06e2\u06e1"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    move v2, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac374

    add-int/2addr v1, v2

    move v2, v1

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "TLDefJAQN1uWfDjI6K5wrpRRwjb"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣۢۧۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v2

    if-ltz v2, :cond_5

    const-string v2, "\u06e7\u06e1\u06e4"

    goto :goto_2

    :cond_5
    const-string v2, "\u06e3\u06e0\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v16, v1

    goto/16 :goto_0

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7db -> :sswitch_0
        0x1aaf1d -> :sswitch_2
        0x1ab289 -> :sswitch_1
        0x1ab624 -> :sswitch_4
        0x1ab662 -> :sswitch_3
        0x1ab6e2 -> :sswitch_5
        0x1ac54a -> :sswitch_6
    .end sparse-switch
.end method
