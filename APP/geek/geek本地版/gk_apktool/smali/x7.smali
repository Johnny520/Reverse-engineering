.class public final synthetic Lx7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lg00;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Landroid/app/Activity;

.field public final f:Landroid/app/Dialog;

.field public final g:Lsm;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lg00;Ljava/lang/String;ZLandroid/app/Activity;Landroid/app/Dialog;Lsm;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e3\u06e7"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p7, p0, Lx7;->g:Lsm;

    const-string v1, "\u06e5\u06e8\u06e2"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    iput-boolean p4, p0, Lx7;->d:Z

    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v1, :cond_0

    const-string v1, "\u06e2\u06e8\u06df"

    invoke-static {v1}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e0\u06e4\u06e8"

    :goto_2
    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    move-result v1

    if-gtz v1, :cond_7

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    add-int/lit16 v2, v2, -0xc6c

    xor-int/2addr v1, v2

    if-gtz v1, :cond_1

    const-string v1, "\u06e2\u06e0\u06e6"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e1\u06e0\u06e4"

    :goto_3
    invoke-static {v1}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    iput-object p5, p0, Lx7;->e:Landroid/app/Activity;

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v1

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    :cond_2
    const-string v1, "\u06e4\u06e8\u06e5"

    :goto_4
    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e3\u06e4\u06e4"

    goto :goto_4

    :sswitch_4
    iput-object p2, p0, Lx7;->b:Lg00;

    const-string v1, "\u06e2\u06e8\u06df"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/lit16 v2, v2, 0x1a82

    mul-int/2addr v1, v2

    if-ltz v1, :cond_4

    const/16 v1, 0x4d

    sput v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v1, "\u06e8\u06e8\u06e6"

    goto :goto_3

    :cond_4
    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    or-int/2addr v1, v2

    const v2, 0x1aaca4

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_6
    iput-object p3, p0, Lx7;->c:Ljava/lang/String;

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e0\u06e2\u06e3"

    invoke-static {v1}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "VCkx9SLrT"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۨۢۧۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    move-result v1

    if-gtz v1, :cond_5

    const/16 v1, 0x1e

    sput v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v1, "\u06df\u06e8\u06e5"

    goto/16 :goto_1

    :cond_5
    const-string v1, "\u06e6\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_8
    iput-object p1, p0, Lx7;->a:Ljava/util/List;

    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    add-int/lit16 v2, v2, -0x1808

    add-int/2addr v1, v2

    if-ltz v1, :cond_6

    const/4 v1, 0x0

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    :cond_6
    const-string v1, "\u06e5\u06e1\u06e8"

    goto/16 :goto_2

    :sswitch_9
    iput-object p6, p0, Lx7;->f:Landroid/app/Dialog;

    sget v1, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sub-int/2addr v1, v2

    const v2, -0x1aaa05

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :cond_7
    :sswitch_a
    const-string v1, "\u06e0\u06e2\u06e3"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_b
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    add-int/2addr v1, v2

    const v2, -0x1abcbc

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_c
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa81c -> :sswitch_0
        0x1aab21 -> :sswitch_c
        0x1aab64 -> :sswitch_3
        0x1aaea5 -> :sswitch_7
        0x1ab268 -> :sswitch_b
        0x1ab359 -> :sswitch_6
        0x1ab6a3 -> :sswitch_9
        0x1abae1 -> :sswitch_1
        0x1abdcc -> :sswitch_4
        0x1abe09 -> :sswitch_8
        0x1abe9f -> :sswitch_2
        0x1ac1ca -> :sswitch_5
        0x1ac9e6 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 28

    const/4 v3, 0x0

    const/16 v25, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v23, 0x0

    const/4 v8, 0x0

    const/16 v18, 0x0

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/16 v26, 0x0

    const/4 v12, 0x0

    const-string v20, "\u06e6\u06e8\u06e6"

    invoke-static/range {v20 .. v20}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v27

    move-object/from16 v20, v3

    move-object/from16 v21, v5

    move-object/from16 v22, v8

    :goto_0
    sparse-switch v27, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "\u06e3\u06e1\u06e7"

    :goto_1
    invoke-static {v3}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto :goto_0

    :cond_0
    :sswitch_1
    const-string v3, "\u06e7\u06e2\u06e2"

    goto :goto_1

    :sswitch_2
    move-object/from16 v0, v22

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "start_night"

    move-object/from16 v0, v22

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v2, Lz7;->d:Ljava/lang/String;

    invoke-static {v3, v5}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    move-result v3

    if-gtz v3, :cond_1

    const-string v3, "\u06e5\u06e3\u06e6"

    :goto_2
    invoke-static {v3}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto :goto_0

    :cond_1
    const-string v3, "\u06e4\u06e6\u06e1"

    move-object/from16 v5, v16

    move-object v8, v3

    :goto_3
    invoke-static {v8}, Lۣ۟ۢ۠۠;->ۣ۟ۤۥ۟(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v16, v5

    move/from16 v27, v3

    goto :goto_0

    :sswitch_3
    const-string v5, "YUI+Ey4j\n"

    const-string v3, "hfqt9p+9g2Y=\n"

    :goto_4
    const-string v8, "\u06e3\u06df\u06e6"

    invoke-static {v8}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v14, v3

    move-object v15, v5

    move/from16 v27, v8

    goto :goto_0

    :sswitch_4
    move v3, v4

    :cond_2
    sget v4, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v5, v5, 0x9cd

    xor-int/2addr v4, v5

    if-gtz v4, :cond_3

    const/16 v4, 0x43

    sput v4, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v4, "\u06e4\u06e2\u06e7"

    move-object v5, v4

    move v8, v3

    :goto_5
    invoke-static {v5}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v3

    move v4, v8

    move/from16 v27, v3

    goto :goto_0

    :cond_3
    const-string v4, "\u06e0\u06e2\u06e8"

    move-object v5, v4

    move v8, v3

    :goto_6
    invoke-static {v5}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v3

    move v4, v8

    move/from16 v27, v3

    goto :goto_0

    :sswitch_5
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v12}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    xor-int/lit16 v5, v5, -0x1b9

    div-int/2addr v3, v5

    if-eqz v3, :cond_4

    const/16 v3, 0x17

    sput v3, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    const-string v3, "\u06e5\u06e1\u06e4"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_4
    move-object v3, v9

    :cond_5
    const-string v5, "\u06e7\u06e2\u06e2"

    invoke-static {v5}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_6
    const-string v3, "1wE9e5Q9gek=\n"

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-gez v5, :cond_5

    :goto_7
    const-string v8, "\u06e4\u06e3\u06e6"

    move-object/from16 v5, v16

    move-object v9, v3

    goto :goto_3

    :sswitch_7
    const-string v3, "start"

    move-object/from16 v0, v17

    invoke-static {v0, v3}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v2, Lz7;->b:Ljava/lang/String;

    invoke-static {v3, v5}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v17

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/lit16 v8, v8, -0x1e2f

    sub-int/2addr v5, v8

    if-gtz v5, :cond_6

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v5, "\u06e1\u06e7\u06e2"

    invoke-static {v5}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v23, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/2addr v5, v8

    const v8, -0x1ac249

    xor-int/2addr v5, v8

    move-object/from16 v23, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v7, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v5

    if-ltz v5, :cond_7

    const/16 v5, 0x15

    sput v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    const-string v5, "\u06e2\u06e6\u06e7"

    invoke-static {v5}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e3\u06e4\u06e6"

    move-object/from16 v5, v18

    :goto_8
    invoke-static {v8}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v17, v3

    move-object/from16 v18, v5

    move/from16 v27, v8

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    move-result v3

    if-gtz v3, :cond_8

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v3, "\u06e1\u06e4\u06e6"

    :goto_9
    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_8
    sget v3, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/2addr v3, v5

    const v5, 0x1ac918

    add-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p0

    iget-object v2, v0, Lx7;->a:Ljava/util/List;

    move/from16 v0, v25

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz7;

    move-object/from16 v0, v20

    iget v3, v0, Lg00;->a:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lx7;->c:Ljava/lang/String;

    invoke-static {v5, v3}, Lgn;->g(Ljava/lang/String;I)V

    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    mul-int/lit16 v5, v5, -0x33a

    div-int/2addr v3, v5

    if-eqz v3, :cond_9

    :goto_a
    const-string v3, "\u06e2\u06e2\u06e0"

    invoke-static {v3}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e5\u06e1\u06e4"

    goto/16 :goto_2

    :sswitch_b
    sget-object v3, Lgn;->a:Lgn;

    invoke-static/range {p1 .. p1}, Lip;->l(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroidx/versionedparcelable/ۣۢۥ;->ۦۦۡۤ()I

    move-result v3

    if-gtz v3, :cond_a

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e0\u06e2\u06e0"

    move-object v5, v3

    move v8, v4

    goto/16 :goto_5

    :cond_b
    :sswitch_c
    sget v3, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v3, :cond_c

    const/16 v3, 0x2a

    sput v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    const-string v3, "\u06e8\u06e4\u06e5"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_c
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/2addr v3, v5

    const v5, 0x1ab4cf

    add-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_d
    const-string v3, "end"

    move-object/from16 v0, v23

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v2, Lz7;->c:Ljava/lang/String;

    invoke-static {v3, v5}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    div-int/lit16 v8, v8, 0xa0e

    or-int/2addr v5, v8

    if-ltz v5, :cond_d

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    const-string v5, "\u06e0\u06e2\u06e0"

    invoke-static {v5}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v22, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_d
    sget v5, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v8, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    xor-int/2addr v5, v8

    const v8, 0x1abd29

    add-int/2addr v5, v8

    move-object/from16 v22, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_e
    const/4 v3, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lgn;->i(Landroid/view/View;I)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lx7;->b:Lg00;

    iget v5, v3, Lg00;->a:I

    sget v8, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v20, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    move/from16 v0, v20

    add-int/lit16 v0, v0, 0x88

    move/from16 v20, v0

    or-int v8, v8, v20

    if-ltz v8, :cond_e

    const/16 v8, 0x5c

    sput v8, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    const-string v8, "\u06e2\u06e8\u06e0"

    invoke-static {v8}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v20, v3

    move/from16 v25, v5

    move/from16 v27, v8

    goto/16 :goto_0

    :cond_e
    sget v8, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v20, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    mul-int v8, v8, v20

    const v20, 0x16780c

    add-int v8, v8, v20

    move-object/from16 v20, v3

    move/from16 v25, v5

    move/from16 v27, v8

    goto/16 :goto_0

    :sswitch_f
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v17

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "end_night"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    move-result v3

    if-ltz v3, :cond_f

    const/16 v3, 0x2e

    sput v3, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    const-string v3, "\u06e6\u06e8\u06e6"

    invoke-static {v3}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u06e7\u06e1\u06e7"

    move-object/from16 v3, v17

    goto/16 :goto_8

    :sswitch_10
    sget v3, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v5, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    add-int/lit16 v5, v5, -0x23c5

    rem-int/2addr v3, v5

    if-gtz v3, :cond_10

    const-string v3, "\u06e8\u06e6\u06e0"

    move-object v5, v3

    move v8, v4

    goto/16 :goto_6

    :cond_10
    const-string v3, "\u06e6\u06e8\u06e6"

    move-object v5, v3

    move v8, v4

    goto/16 :goto_6

    :sswitch_11
    move-object/from16 v0, p0

    iget-object v3, v0, Lx7;->g:Lsm;

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v5}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۦۡۧۨ()I

    move-result v3

    if-ltz v3, :cond_0

    const-string v3, "RvP6mHgEMi6"

    invoke-static {v3}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۨ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v3

    if-ltz v3, :cond_11

    const-string v3, "\u06e4\u06df\u06e0"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v12, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_11
    move-object v3, v11

    move-object v8, v13

    :goto_b
    const-string v11, "\u06e7\u06df\u06e6"

    invoke-static {v11}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v27

    move-object v11, v3

    move-object v12, v5

    move-object v13, v8

    goto/16 :goto_0

    :sswitch_12
    sget v3, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    div-int/lit16 v5, v5, 0x193f

    add-int/2addr v3, v5

    if-ltz v3, :cond_12

    const/16 v3, 0x1f

    sput v3, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v3, "\u06e0\u06e7\u06e4"

    invoke-static {v3}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_12
    const-string v3, "\u06e2\u06e2\u06e0"

    move-object v5, v3

    move v8, v4

    goto/16 :goto_6

    :sswitch_13
    sget v3, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v5, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/lit16 v5, v5, -0x505

    add-int/2addr v3, v5

    if-ltz v3, :cond_13

    const/16 v3, 0x16

    sput v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v3, "\u06e8\u06e7\u06e0"

    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_13
    sget v3, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int/2addr v3, v5

    const v5, -0x1ab316

    xor-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v0, p0

    iget-object v3, v0, Lx7;->e:Landroid/app/Activity;

    move-object/from16 v0, v21

    invoke-static {v3, v0}, Lgn;->k(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lx7;->f:Landroid/app/Dialog;

    invoke-virtual {v3}, Landroid/app/Dialog;->dismiss()V

    move-object/from16 v0, v20

    iget v3, v0, Lg00;->a:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v8, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    xor-int/2addr v5, v8

    const v8, 0x1ab2a0

    xor-int/2addr v5, v8

    move/from16 v26, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_15
    const-string v7, "ZHk38AwjXTRjeRHMATpQJFA=\n"

    const-string v6, "DxxOr25WP1Y=\n"

    const-string v3, "\u06e0\u06e5\u06e4"

    move-object v5, v3

    move v8, v4

    goto/16 :goto_5

    :sswitch_16
    iget-object v8, v2, Lz7;->a:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v0, v16

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v5

    if-ltz v5, :cond_14

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-object v5, v12

    goto/16 :goto_b

    :cond_14
    const-string v5, "\u06e5\u06e3\u06e6"

    :goto_c
    invoke-static {v5}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v11, v3

    move-object v13, v8

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_17
    sget v3, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/lit16 v5, v5, -0x343

    xor-int/2addr v3, v5

    if-ltz v3, :cond_15

    const-string v5, "\u06e3\u06e4\u06e6"

    move-object v3, v11

    move-object v8, v13

    goto :goto_c

    :cond_15
    const-string v3, "\u06e4\u06e4\u06e6"

    :goto_d
    invoke-static {v3}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_18
    move-object v7, v10

    goto/16 :goto_a

    :sswitch_19
    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v3, :cond_16

    const/4 v3, 0x5

    sput v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    move-object v3, v14

    move-object v5, v15

    goto/16 :goto_4

    :cond_16
    const-string v3, "\u06e3\u06e8\u06e1"

    goto/16 :goto_9

    :sswitch_1a
    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v2, Lz7;->e:Ljava/lang/String;

    invoke-static {v3, v5}, Lgn;->h(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Li9;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    if-eqz v4, :cond_b

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    if-gtz v3, :cond_17

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v3, "\u06e1\u06e6\u06df"

    goto :goto_d

    :cond_17
    sget v3, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v5, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    mul-int/2addr v3, v5

    const v5, 0x211c0d

    add-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_1b
    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v5, v5, -0x2ae

    rem-int/2addr v3, v5

    if-gtz v3, :cond_18

    const/16 v3, 0x1b

    sput v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    move-object v3, v6

    goto/16 :goto_7

    :cond_18
    sget v3, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v3, v5

    const v5, -0xdcd5

    xor-int/2addr v3, v5

    move-object v9, v6

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_1c
    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    if-gtz v3, :cond_19

    const-string v8, "\u06e6\u06e8\u06e2"

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    move-object/from16 v19, v14

    goto/16 :goto_8

    :cond_19
    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sub-int/2addr v3, v5

    const v5, 0x1aaf60

    add-int/2addr v3, v5

    move-object/from16 v19, v14

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_1d
    const-string v3, "Xy/SMuoP\n"

    const-string v19, "uoBr1Hy2fO4=\n"

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int/2addr v5, v8

    const v8, 0x1e00ab

    add-int/2addr v5, v8

    move-object/from16 v24, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v0, v19

    invoke-static {v15, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "\u06e8\u06e7\u06e0"

    move-object v5, v3

    goto/16 :goto_3

    :sswitch_1f
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lx7;->d:Z

    if-eqz v3, :cond_2

    const-string v10, "vGREJPJP6Iy5ZWIZ4V/jhbJeXhT4UvO2\n"

    sget v4, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    div-int/lit16 v5, v5, -0x1eee

    sub-int/2addr v4, v5

    if-gtz v4, :cond_1a

    const/16 v4, 0x62

    sput v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v4, "\u06e3\u06df\u06df"

    invoke-static {v4}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v5

    move v4, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_1a
    sget v4, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v5, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    mul-int/2addr v4, v5

    const v5, -0x185af2

    xor-int/2addr v5, v4

    move v4, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_20
    sget v3, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v5, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    rem-int/lit16 v5, v5, -0x9e9

    mul-int/2addr v3, v5

    if-ltz v3, :cond_1b

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v3, "\u06e0\u06e6\u06e7"

    goto/16 :goto_1

    :cond_1b
    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/2addr v3, v5

    const v5, 0x1aad49

    xor-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_21
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    rem-int/lit16 v5, v5, 0x1d45

    rem-int/2addr v3, v5

    if-gtz v3, :cond_1c

    const-string v3, "\u06e0\u06e5\u06e4"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v27, v3

    goto/16 :goto_0

    :cond_1c
    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/2addr v3, v5

    const v5, 0x1aab33

    add-int/2addr v3, v5

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_22
    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v5, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    or-int/2addr v3, v5

    const v5, 0x1ab742

    add-int/2addr v3, v5

    move-object/from16 v15, v24

    move/from16 v27, v3

    goto/16 :goto_0

    :sswitch_23
    const-string v3, "\u6c14\u6ce1\u5df2\u5207\u6362\u4e3a: "

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v5, :cond_1d

    const-string v5, "\u06e3\u06e7\u06e6"

    invoke-static {v5}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :cond_1d
    sget v5, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    xor-int/2addr v5, v8

    const v8, 0x1ac518

    xor-int/2addr v5, v8

    move-object/from16 v21, v3

    move/from16 v27, v5

    goto/16 :goto_0

    :sswitch_24
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca0 -> :sswitch_0
        0xdcbf -> :sswitch_4
        0xdcfa -> :sswitch_19
        0x1aab1e -> :sswitch_e
        0x1aab26 -> :sswitch_15
        0x1aab7b -> :sswitch_0
        0x1aab7f -> :sswitch_1b
        0x1aaf00 -> :sswitch_6
        0x1aaf5a -> :sswitch_7
        0x1aaf5c -> :sswitch_1
        0x1aaf60 -> :sswitch_21
        0x1aaf7c -> :sswitch_a
        0x1aaf9b -> :sswitch_22
        0x1ab26a -> :sswitch_9
        0x1ab2a0 -> :sswitch_8
        0x1ab323 -> :sswitch_11
        0x1ab35a -> :sswitch_1d
        0x1ab603 -> :sswitch_20
        0x1ab60a -> :sswitch_1c
        0x1ab649 -> :sswitch_1e
        0x1ab660 -> :sswitch_3
        0x1ab6a5 -> :sswitch_17
        0x1ab702 -> :sswitch_10
        0x1ab71c -> :sswitch_12
        0x1ab9c5 -> :sswitch_c
        0x1aba47 -> :sswitch_18
        0x1aba66 -> :sswitch_20
        0x1aba9f -> :sswitch_f
        0x1abdc8 -> :sswitch_1f
        0x1abde2 -> :sswitch_2
        0x1abe08 -> :sswitch_23
        0x1ac244 -> :sswitch_d
        0x1ac260 -> :sswitch_9
        0x1ac264 -> :sswitch_b
        0x1ac50e -> :sswitch_5
        0x1ac54d -> :sswitch_1a
        0x1ac567 -> :sswitch_24
        0x1ac5e3 -> :sswitch_12
        0x1ac604 -> :sswitch_14
        0x1ac94c -> :sswitch_16
        0x1ac9c1 -> :sswitch_13
    .end sparse-switch
.end method
