.class public final synthetic Los;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 3

    iput p3, p0, Los;->a:I

    iput-object p1, p0, Los;->c:Ljava/lang/Object;

    iput p2, p0, Los;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e7\u06e8"

    invoke-static {v1}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    or-int/lit16 v2, v2, 0x1059

    xor-int/2addr v0, v2

    if-gtz v0, :cond_2

    const-string v0, "\u06e0\u06e5\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "uWfq7kv4SWGhMnYR"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۣۢۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    mul-int/2addr v1, v2

    const v2, 0x1d3111

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/lit16 v2, v2, -0x934

    xor-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    const-string v0, "\u06e1\u06e8\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e0\u06e4\u06e2"

    goto :goto_1

    :cond_2
    const-string v0, "\u06e3\u06e7\u06e8"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v0, "\u06e2\u06e6\u06e8"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e4\u06e2"

    goto :goto_2

    :sswitch_4
    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x13

    sput v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v0, "\u06df\u06e0\u06e3"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    add-int/2addr v0, v2

    const v2, -0x1ab0c6

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_0
        0x1aa722 -> :sswitch_3
        0x1aab5e -> :sswitch_5
        0x1ab324 -> :sswitch_1
        0x1ab704 -> :sswitch_4
        0x1ac56c -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 18

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const-wide/16 v14, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v10, "\u06e7\u06e8\u06e8"

    invoke-static {v10}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v10

    move-object v11, v2

    move-object v12, v5

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    if-eqz v11, :cond_3

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v2

    if-gtz v2, :cond_e

    const-string v2, "\u06e7\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-object v2, v0, Los;->c:Ljava/lang/Object;

    check-cast v2, Lmu;

    move-object/from16 v0, p0

    iget v5, v0, Los;->b:I

    invoke-virtual {v2, v5}, Lmu;->w(I)V

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v2

    if-gtz v2, :cond_0

    const/16 v2, 0x40

    sput v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v2, "\u06e5\u06e2\u06df"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_0
    const-string v2, "\u06df\u06e2\u06e3"

    move-object v5, v9

    move-object v10, v2

    :goto_1
    invoke-static {v10}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v5

    move v10, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    iget v2, v0, Los;->b:I

    const/4 v5, 0x0

    invoke-virtual {v3, v11, v2, v5}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    or-int/lit16 v5, v5, 0x22c8

    rem-int/2addr v2, v5

    if-gtz v2, :cond_1

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v2, "\u06e0\u06e6\u06e1"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v5, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/2addr v2, v5

    const v5, 0x191088

    add-int/2addr v2, v5

    move v10, v2

    goto :goto_0

    :pswitch_0
    :sswitch_3
    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    if-ltz v2, :cond_2

    const-string v2, "\u06e1\u06e8\u06e5"

    :goto_2
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e1\u06e4\u06e5"

    move-object v5, v2

    :goto_3
    invoke-static {v5}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/lit16 v5, v5, 0x23c

    or-int/2addr v2, v5

    if-gtz v2, :cond_4

    const-string v2, "\u06e1\u06e2\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/2addr v2, v5

    const v5, 0x1ab64a

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_5
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    if-ltz v2, :cond_6

    invoke-static {}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦۥۣۥ()I

    move-object v2, v3

    :cond_5
    const-string v3, "\u06e6\u06e3\u06e4"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v2

    move v10, v5

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06e8\u06e7\u06e0"

    move-object v5, v2

    goto :goto_3

    :sswitch_6
    move-object/from16 v0, p0

    iget v2, v0, Los;->b:I

    int-to-double v6, v2

    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    div-double v6, v6, v16

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    if-ltz v2, :cond_7

    const-string v2, "\u06e0\u06e3\u06df"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_7
    move-object v2, v4

    :cond_8
    const-string v4, "\u06e0\u06e5\u06e3"

    move-object v5, v4

    :goto_4
    invoke-static {v5}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_7
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "\ud83d\udcb8 \u81ea\u52a8\u6536\u6b3e\u6210\u529f: \uffe5"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v4

    if-gez v4, :cond_8

    const-string v5, "\u06e3\u06e2\u06e3"

    move-object v4, v2

    goto :goto_3

    :sswitch_8
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "\u06e7\u06e6\u06e6"

    move-object v5, v9

    move-object v10, v2

    goto/16 :goto_1

    :pswitch_1
    :sswitch_9
    const-string v2, "\u06e2\u06e7\u06e4"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p0

    iget v2, v0, Los;->a:I

    packed-switch v2, :pswitch_data_0

    :sswitch_b
    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit16 v5, v5, 0x1800

    add-int/2addr v2, v5

    if-ltz v2, :cond_9

    const/16 v2, 0xb

    sput v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v2, "\u06e6\u06df\u06e2"

    move-object v5, v2

    goto/16 :goto_3

    :cond_9
    const-string v2, "\u06e0\u06e3\u06e2"

    move-object v5, v2

    goto/16 :goto_3

    :sswitch_c
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget v5, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v8, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/lit16 v8, v8, 0x44f

    div-int/2addr v5, v8

    if-eqz v5, :cond_f

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v5, "\u06e0\u06e6\u06e7"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v8, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_d
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v14, v15}, Ljava/io/PrintStream;->println(J)V

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v2

    if-gtz v2, :cond_a

    const/16 v2, 0x63

    sput v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    const-string v2, "\u06e3\u06e2\u06e3"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e2\u06e8\u06e7"

    goto/16 :goto_2

    :sswitch_e
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v2, v5

    const v5, 0x1accfc

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_f
    invoke-static {v9, v8}, Lkn;->k(Landroid/content/Context;Ljava/lang/String;)V

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v5, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    or-int/lit16 v5, v5, 0x1e99

    or-int/2addr v2, v5

    if-ltz v2, :cond_b

    const-string v2, "\u06e6\u06e4\u06e3"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e0\u06e6\u06e7"

    move-object v2, v4

    goto/16 :goto_4

    :sswitch_10
    const-string v2, "5er0Yp6hHHhOW4wET"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۦ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/2addr v2, v5

    const v5, 0x1aa8e1

    xor-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_11
    sget-object v2, Lkn;->a:Lkn;

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v10, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    rem-int/lit16 v10, v10, 0x23a

    mul-int/2addr v5, v10

    if-ltz v5, :cond_c

    const/16 v5, 0x25

    sput v5, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v5, "\u06e2\u06e2\u06e3"

    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v12, v2

    move v10, v5

    goto/16 :goto_0

    :cond_c
    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v10, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v5, v10

    const v10, -0x1abd92

    xor-int/2addr v5, v10

    move-object v12, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, p0

    iget-object v2, v0, Los;->c:Ljava/lang/Object;

    check-cast v2, Landroid/app/Application;

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v9, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/lit16 v9, v9, 0x104d

    add-int/2addr v5, v9

    if-ltz v5, :cond_d

    const-string v5, "\u06df\u06e2\u06e3"

    invoke-static {v5}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v2

    move v10, v5

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e6\u06e4\u06e3"

    move-object v5, v2

    move-object v10, v9

    goto/16 :goto_1

    :cond_e
    const-string v2, "\u06df\u06e3\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p0

    iget-object v2, v0, Los;->c:Ljava/lang/Object;

    check-cast v2, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget v5, v0, Los;->b:I

    invoke-static {v2, v5}, Lcom/ljx/wechatmod/ui/MainActivity;->a(Landroid/widget/TextView;I)V

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v2, :cond_10

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-object v2, v8

    :cond_f
    const-string v10, "\u06e6\u06e2\u06e6"

    move-object v5, v9

    move-object v8, v2

    goto/16 :goto_1

    :cond_10
    const-string v2, "\u06e4\u06e5\u06e7"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :pswitch_2
    :sswitch_14
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v2, :cond_11

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v2, "\u06e7\u06e0\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06df\u06e8\u06e2"

    goto/16 :goto_2

    :cond_12
    :sswitch_15
    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v5, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/lit16 v5, v5, -0x22ca

    sub-int/2addr v2, v5

    if-ltz v2, :cond_13

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v2, "\u06e1\u06df\u06e8"

    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_13
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    add-int/2addr v2, v5

    const v5, -0x1ab3d8

    xor-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_16
    iget-object v2, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v5, :cond_14

    const-string v5, "\u06e8\u06e7\u06e0"

    invoke-static {v5}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v11, v2

    move v10, v5

    goto/16 :goto_0

    :cond_14
    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v10, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v5, v10

    const v10, 0xe8fe

    xor-int/2addr v5, v10

    move-object v11, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v2

    if-gtz v2, :cond_12

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v2

    if-ltz v2, :cond_15

    const/4 v2, 0x6

    sput v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v2, "\u06e1\u06e4\u06e5"

    goto :goto_5

    :cond_15
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    xor-int/2addr v2, v5

    const v5, 0x1ac562

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v0, p0

    iget-object v2, v0, Los;->c:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v3, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v3, "\u06e4\u06e7\u06e3"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v3, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_19
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc46 -> :sswitch_0
        0x1aa700 -> :sswitch_3
        0x1aa760 -> :sswitch_19
        0x1aa781 -> :sswitch_2
        0x1aa819 -> :sswitch_1
        0x1aab3c -> :sswitch_d
        0x1aab3f -> :sswitch_12
        0x1aab7e -> :sswitch_7
        0x1aab9b -> :sswitch_4
        0x1aaba1 -> :sswitch_17
        0x1aaf22 -> :sswitch_18
        0x1ab2a3 -> :sswitch_14
        0x1ab33f -> :sswitch_13
        0x1ab361 -> :sswitch_19
        0x1ab64a -> :sswitch_19
        0x1ab664 -> :sswitch_8
        0x1ab6de -> :sswitch_9
        0x1aba86 -> :sswitch_19
        0x1abac0 -> :sswitch_b
        0x1abde2 -> :sswitch_6
        0x1ac1aa -> :sswitch_5
        0x1ac1c7 -> :sswitch_16
        0x1ac1e5 -> :sswitch_11
        0x1ac56c -> :sswitch_10
        0x1ac5c1 -> :sswitch_e
        0x1ac5e7 -> :sswitch_c
        0x1ac626 -> :sswitch_15
        0x1ac627 -> :sswitch_a
        0x1ac9c1 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
