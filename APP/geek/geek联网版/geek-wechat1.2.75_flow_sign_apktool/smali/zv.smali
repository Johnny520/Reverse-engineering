.class public final Lzv;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:Ln00;

.field public final h:Lp00;

.field public final i:Lp00;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ln00;Lp00;Lp00;Lvd;)V
    .locals 3

    iput-object p1, p0, Lzv;->f:Ljava/util/ArrayList;

    iput-object p2, p0, Lzv;->g:Ln00;

    iput-object p3, p0, Lzv;->h:Lp00;

    iput-object p4, p0, Lzv;->i:Lp00;

    invoke-direct {p0, p5}, Lt50;-><init>(Lvd;)V

    const/4 v1, 0x0

    const-string v0, "\u06e2\u06e6\u06e0"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/lit16 v2, v2, -0x502

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const-string v0, "\u06e1\u06e0\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "3YB"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۤۢ۠ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac030

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e6\u06e0"

    goto :goto_1

    :cond_1
    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e2\u06e7\u06e5"

    :goto_2
    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e6\u06df"

    goto :goto_2

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/2addr v0, v2

    const v2, -0x1ac064

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    :cond_3
    const-string v0, "\u06e2\u06e0\u06e8"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabbc -> :sswitch_0
        0x1ab26a -> :sswitch_1
        0x1ab31c -> :sswitch_4
        0x1ac202 -> :sswitch_3
        0x1ac21f -> :sswitch_5
        0x1ac220 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 6

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e5\u06e3"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move-object v3, v0

    move-object v4, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v3, p0, Lzv;->h:Lp00;

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    div-int/lit16 v1, v1, -0x6d1

    xor-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x2a

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06e1\u06e5\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    iget-object v4, p0, Lzv;->i:Lp00;

    const-string v0, "\u06e8\u06e8\u06e1"

    goto :goto_1

    :cond_0
    const-string v0, "\u06e1\u06e7\u06e7"

    goto :goto_1

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    add-int/2addr v0, v1

    const v1, -0x1aaeb6

    xor-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    :sswitch_3
    new-instance v0, Lzv;

    iget-object v1, p0, Lzv;->f:Ljava/util/ArrayList;

    iget-object v2, p0, Lzv;->g:Ln00;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lzv;-><init>(Ljava/util/ArrayList;Ln00;Lp00;Lp00;Lvd;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1aaf3f -> :sswitch_0
        0x1aaf81 -> :sswitch_1
        0x1ab2bf -> :sswitch_2
        0x1ac9e1 -> :sswitch_3
    .end sparse-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e5\u06e0\u06e2"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e3\u06e3\u06e0"

    :goto_1
    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    move-object v0, p1

    check-cast v0, Lpe;

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    const-string v0, "\u06e1\u06e6\u06e6"

    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v1, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    rem-int/2addr v0, v1

    const v1, 0x1abd05

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    check-cast p2, Lvd;

    invoke-virtual {p0, p2}, Lzv;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lzv;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lzv;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "\u06e5\u06e0\u06e2"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf61 -> :sswitch_0
        0x1abda7 -> :sswitch_1
        0x1abdcc -> :sswitch_2
    .end sparse-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    const/4 v12, 0x0

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e6\u06e4\u06e8"

    invoke-static {v4}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v4

    move v14, v0

    move v11, v4

    :goto_0
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {v12}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v0, Lyg;->b:Lof;

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v4, v4, 0x1ef9

    sub-int/2addr v3, v4

    if-ltz v3, :cond_6

    const/16 v3, 0x5a

    sput v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v3, "\u06e5\u06e7\u06df"

    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v11, v4

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lzv;->g:Ln00;

    invoke-static {v0, v9, v5, v10}, Lbw;->g(Ln00;Lp00;Lp00;Ljava/util/ArrayList;)V

    const-string v4, "\u06e5\u06e7\u06df"

    move-object v0, v3

    :goto_1
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    move v11, v4

    goto :goto_0

    :sswitch_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "qe8ZMuceL5bt/BAtsgclkersEDioGCWW7ecbKKgBJZHq+Rwqr0oj2bjhACquBCU=\n"

    const-string v2, "yo51XsdqQLY=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_3
    if-eqz v14, :cond_d

    const/4 v0, 0x1

    if-ne v14, v0, :cond_1

    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v0, :cond_0

    const/16 v0, 0x39

    sput v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v0, "\u06e5\u06e0\u06e5"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/2addr v0, v4

    const v4, 0x1abf66

    add-int/2addr v0, v4

    move v11, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lzv;->i:Lp00;

    const-string v5, "\u06e1\u06e4\u06e6"

    move-object v4, v6

    move-object v7, v5

    :goto_2
    invoke-static {v7}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v5, v0

    move-object v6, v4

    move v11, v7

    goto :goto_0

    :sswitch_5
    sget-object v0, Lxh;->n:Lxh;

    :goto_3
    return-object v0

    :cond_1
    :sswitch_6
    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v0, "\u06e8\u06e5\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/2addr v0, v4

    const v4, 0x1ab55f

    add-int/2addr v0, v4

    move v11, v0

    goto/16 :goto_0

    :cond_3
    move-object v1, v2

    :sswitch_7
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v4, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/2addr v0, v4

    const v4, 0x1aac20

    xor-int/2addr v0, v4

    move v11, v0

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Lzv;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v7, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    or-int/lit16 v7, v7, 0x1eb5

    mul-int/2addr v4, v7

    if-gtz v4, :cond_4

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v4, "\u06e0\u06e8"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v10, v0

    move v11, v4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e5\u06e0\u06e5"

    move-object v7, v0

    move-object v11, v4

    :goto_4
    invoke-static {v11}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v10, v7

    move v11, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v0, :cond_5

    const-string v4, "\u06e8\u06e3\u06df"

    move-object v0, v3

    goto/16 :goto_1

    :cond_5
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v4, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/2addr v0, v4

    const v4, 0x1ac0b1

    add-int/2addr v0, v4

    move v11, v0

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u06e7\u06e5"

    move-object v4, v3

    goto/16 :goto_1

    :sswitch_a
    iget v0, p0, Lzv;->e:I

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    move-result v4

    if-ltz v4, :cond_7

    const-string v4, "\u06e1\u06e4\u06e6"

    invoke-static {v4}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v12, p1

    move v14, v0

    move v11, v4

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e7\u06e5\u06e5"

    invoke-static {v4}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v12, p1

    move v14, v0

    move v11, v4

    goto/16 :goto_0

    :sswitch_b
    new-instance v4, Lt6;

    const/4 v0, 0x0

    sget v6, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit8 v6, v6, -0x61

    invoke-direct {v4, v0, v6}, Lt6;-><init>(Lvd;I)V

    const/4 v0, 0x1

    iput v0, p0, Lzv;->e:I

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    add-int/lit16 v6, v6, -0x2186

    sub-int/2addr v0, v6

    if-gtz v0, :cond_8

    const-string v6, "\u06e4\u06df\u06e8"

    move-object v0, v5

    move-object v7, v6

    goto/16 :goto_2

    :cond_8
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v6, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v0, v6

    const v6, 0x1aac63

    add-int/2addr v0, v6

    move-object v6, v4

    move v11, v0

    goto/16 :goto_0

    :sswitch_c
    invoke-static {v12}, Lgu;->M(Ljava/lang/Object;)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v0, :cond_9

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v0, "\u06e8\u06e4\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v12

    move v11, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e8\u06e4\u06e1"

    move-object v4, v0

    move-object v1, v12

    :goto_5
    invoke-static {v4}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v4, p0, Lzv;->h:Lp00;

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v7, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/lit16 v7, v7, 0x1690

    mul-int/2addr v0, v7

    if-ltz v0, :cond_a

    const/16 v0, 0x62

    sput v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    move-object v0, v8

    :goto_6
    const-string v11, "\u06e1\u06df\u06e0"

    move-object v8, v0

    move-object v7, v10

    move-object v9, v4

    goto/16 :goto_4

    :cond_a
    const-string v0, "\u06e6\u06e0\u06e7"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move-object v9, v4

    move v11, v0

    goto/16 :goto_0

    :sswitch_e
    move-object v0, v8

    :cond_b
    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    move-result v4

    if-gtz v4, :cond_c

    const/16 v4, 0x4c

    sput v4, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    const-string v4, "\u06e6\u06e5\u06e1"

    move-object v8, v0

    goto :goto_5

    :cond_c
    const-string v4, "\u06e5\u06e7\u06df"

    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v8, v0

    move v11, v4

    goto/16 :goto_0

    :sswitch_f
    move-object v0, v13

    goto/16 :goto_3

    :cond_d
    :sswitch_10
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/lit16 v4, v4, -0x165b

    xor-int/2addr v0, v4

    if-gtz v0, :cond_e

    const/16 v0, 0x43

    sput v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v0, "\u06e4\u06e3\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e0\u06e1"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :sswitch_11
    move-object v0, v1

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    move-object v4, v9

    goto :goto_6

    :sswitch_12
    invoke-static {v3, v6, p0}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v2

    sget-object v13, Lqe;->a:Lqe;

    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v0, v4

    const v4, 0x1aa872

    add-int/2addr v0, v4

    move v11, v0

    goto/16 :goto_0

    :sswitch_13
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v0, :cond_f

    const-string v0, "\u06e8\u06e1\u06e6"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    move v11, v0

    goto/16 :goto_0

    :cond_f
    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v0, v4

    const v4, 0x1ab33b

    add-int/2addr v0, v4

    move v11, v0

    goto/16 :goto_0

    :sswitch_14
    if-ne v2, v13, :cond_3

    const-string v0, "\u06e1\u06e4\u06df"

    move-object v4, v0

    move-object v1, v2

    goto/16 :goto_5

    :sswitch_data_0
    .sparse-switch
        0xdc01 -> :sswitch_0
        0xdc08 -> :sswitch_10
        0xdc3f -> :sswitch_e
        0x1aa7fd -> :sswitch_b
        0x1aa81a -> :sswitch_11
        0x1aaae0 -> :sswitch_12
        0x1aabbf -> :sswitch_14
        0x1aae82 -> :sswitch_8
        0x1aaf1c -> :sswitch_f
        0x1aaf23 -> :sswitch_1
        0x1ab249 -> :sswitch_2
        0x1ab31e -> :sswitch_7
        0x1ab9cd -> :sswitch_9
        0x1abdaa -> :sswitch_d
        0x1abe7d -> :sswitch_5
        0x1ac16d -> :sswitch_4
        0x1ac18d -> :sswitch_6
        0x1ac1e4 -> :sswitch_c
        0x1ac1ea -> :sswitch_a
        0x1ac5c7 -> :sswitch_3
        0x1ac90d -> :sswitch_7
        0x1ac965 -> :sswitch_13
    .end sparse-switch
.end method
