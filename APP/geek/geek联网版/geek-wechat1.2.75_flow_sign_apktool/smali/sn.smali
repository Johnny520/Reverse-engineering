.class public final Lsn;
.super Ljava/lang/Object;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:F

.field public final k:F

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z


# direct methods
.method public constructor <init>(IIIIIIIIIFFZZZZZ)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v2, "\u06e2\u06e8\u06e7"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    xor-int/lit16 v3, v3, -0xa8c

    rem-int/2addr v2, v3

    if-gtz v2, :cond_3

    const-string v2, "\u06df\u06e3\u06e6"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    iput p9, p0, Lsn;->i:I

    iput p10, p0, Lsn;->j:F

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    if-gtz v2, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    :cond_1
    const-string v2, "\u06e2\u06e1\u06e4"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e2\u06e4\u06e7"

    goto :goto_1

    :sswitch_2
    iput p3, p0, Lsn;->c:I

    iput p4, p0, Lsn;->d:I

    :goto_2
    const-string v2, "\u06e7\u06e1"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    mul-int/2addr v2, v3

    const v3, 0x168cfc

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_3
    iput p7, p0, Lsn;->g:I

    iput p8, p0, Lsn;->h:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    if-ltz v2, :cond_5

    const/16 v2, 0x1a

    sput v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    :cond_4
    const-string v2, "\u06e5\u06e1\u06df"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_5
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/2addr v2, v3

    const v3, 0x1ab549

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v1, "P4pQX0VpDFNUoGet"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟ۢۦۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v2, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    goto :goto_2

    :cond_6
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    mul-int/2addr v2, v3

    const v3, -0x1a15ef

    xor-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v2, "\u06e6\u06e4\u06e6"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_6
    iput p11, p0, Lsn;->k:F

    move/from16 v0, p12

    iput-boolean v0, p0, Lsn;->l:Z

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    if-ltz v2, :cond_1

    const-string v2, "\u06e0\u06e7\u06e1"

    :goto_3
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_7
    move/from16 v0, p15

    iput-boolean v0, p0, Lsn;->o:Z

    move/from16 v0, p16

    iput-boolean v0, p0, Lsn;->p:Z

    const-string v2, "\u06e7\u06e0"

    :goto_4
    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_8
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/2addr v2, v3

    const v3, 0x1ab417

    add-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_9
    move/from16 v0, p13

    iput-boolean v0, p0, Lsn;->m:Z

    move/from16 v0, p14

    iput-boolean v0, p0, Lsn;->n:Z

    const-string v2, "\u06e0\u06e7\u06e1"

    goto :goto_3

    :sswitch_a
    iput p5, p0, Lsn;->e:I

    iput p6, p0, Lsn;->f:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/lit16 v3, v3, 0x7b5

    xor-int/2addr v2, v3

    if-ltz v2, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v2, "\u06e3\u06e1\u06e5"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    goto/16 :goto_0

    :sswitch_b
    iput p1, p0, Lsn;->a:I

    iput p2, p0, Lsn;->b:I

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    move-result v2

    if-ltz v2, :cond_7

    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    const-string v2, "\u06e6\u06e4\u06e6"

    goto :goto_4

    :cond_7
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/2addr v2, v3

    const v3, -0x1ac9a7

    xor-int/2addr v2, v3

    goto/16 :goto_0

    :sswitch_c
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_0
        0xdcd9 -> :sswitch_4
        0xdcda -> :sswitch_a
        0x1aabba -> :sswitch_7
        0x1ab285 -> :sswitch_9
        0x1ab2e5 -> :sswitch_6
        0x1ab361 -> :sswitch_b
        0x1ab647 -> :sswitch_1
        0x1abdc3 -> :sswitch_3
        0x1ac1e8 -> :sswitch_c
        0x1ac624 -> :sswitch_5
        0x1ac9a4 -> :sswitch_2
        0x1ac9a7 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    div-int/2addr v0, v2

    const v2, 0x1ac20a

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    if-ltz v0, :cond_1

    const/16 v0, 0x5c

    sput v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v0, "\u06df\u06df\u06e6"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab8dd

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x31

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06e0\u06e1\u06e4"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e2\u06e7\u06e8"

    :goto_3
    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p1

    check-cast v0, Lsn;

    iget v1, p0, Lsn;->a:I

    iget v2, v0, Lsn;->a:I

    if-eq v1, v2, :cond_18

    sget v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v1, v2

    const v2, 0x1aabbb

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    div-int/lit16 v2, v2, 0x1bb4

    xor-int/2addr v0, v2

    if-ltz v0, :cond_3

    const-string v0, "\u06e3\u06e1\u06e0"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/2addr v0, v2

    const v2, 0xddda

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_4
    :sswitch_5
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/lit16 v2, v2, 0x1d93

    xor-int/2addr v0, v2

    if-gtz v0, :cond_5

    const-string v0, "\u06e1\u06e4\u06e2"

    :goto_4
    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    rem-int/2addr v0, v2

    const v2, 0x1aba0c

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iget-boolean v0, p0, Lsn;->n:Z

    iget-boolean v2, v1, Lsn;->n:Z

    if-eq v0, v2, :cond_26

    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v2, v2, -0x5c4

    sub-int/2addr v0, v2

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e6\u06e8\u06df"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iget v0, p0, Lsn;->e:I

    iget v2, v1, Lsn;->e:I

    if-eq v0, v2, :cond_4

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sub-int/2addr v0, v2

    const v2, 0x1abe23

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v0

    if-ltz v0, :cond_7

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v0, "\u06e4\u06e6\u06e3"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1aba0a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v2, v2, 0x13ff

    add-int/2addr v0, v2

    if-gtz v0, :cond_8

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v0, "\u06df\u06df\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e5\u06e2\u06e1"

    goto/16 :goto_1

    :sswitch_a
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    xor-int/lit16 v2, v2, 0x255d

    mul-int/2addr v0, v2

    if-ltz v0, :cond_9

    const/16 v0, 0x49

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06e3\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e6\u06e5\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    :sswitch_b
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v0

    if-ltz v0, :cond_b

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e7\u06e6\u06e2"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e4\u06e8\u06e1"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    iget-boolean v0, p0, Lsn;->o:Z

    iget-boolean v2, v1, Lsn;->o:Z

    if-eq v0, v2, :cond_32

    sget v0, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    rem-int/lit16 v2, v2, 0x114f

    sub-int/2addr v0, v2

    if-ltz v0, :cond_c

    const-string v0, "\u06e5\u06e6\u06df"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06e5\u06e6\u06df"

    goto/16 :goto_2

    :sswitch_d
    iget v0, p0, Lsn;->b:I

    iget v2, v1, Lsn;->b:I

    if-eq v0, v2, :cond_1c

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    xor-int/lit16 v2, v2, 0xcb8

    rem-int/2addr v0, v2

    if-ltz v0, :cond_d

    const/16 v0, 0x11

    sput v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v0, "\u06e7\u06e4\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/2addr v0, v2

    const v2, -0x1ababe

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/lit16 v2, v2, 0x18a9

    xor-int/2addr v0, v2

    if-ltz v0, :cond_e

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    const-string v0, "\u06e4\u06e8\u06e5"

    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_e
    const-string v0, "\u06e4\u06e8\u06df"

    :goto_6
    invoke-static {v0}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    iget v0, p0, Lsn;->i:I

    iget v2, v1, Lsn;->i:I

    if-eq v0, v2, :cond_37

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_1e

    const/4 v0, 0x6

    sput v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    const-string v0, "\u06e5\u06e2\u06e1"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_10
    if-ne p0, p1, :cond_1b

    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v0, :cond_10

    :cond_f
    const-string v0, "\u06df\u06e8\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_10
    const-string v0, "\u06e3\u06e3\u06e3"

    :goto_7
    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_11
    iget v0, p0, Lsn;->k:F

    iget v2, v1, Lsn;->k:F

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "\u06e1\u06e5\u06e1"

    goto/16 :goto_4

    :cond_11
    :sswitch_12
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v0, :cond_12

    const/16 v0, 0x15

    sput v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v0, "\u06e7\u06e6\u06e1"

    goto :goto_7

    :cond_12
    const-string v0, "\u06e0\u06e1"

    :goto_8
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_13
    iget-boolean v0, p0, Lsn;->m:Z

    iget-boolean v2, v1, Lsn;->m:Z

    if-eq v0, v2, :cond_20

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/lit16 v2, v2, 0x352

    rem-int/2addr v0, v2

    if-ltz v0, :cond_13

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v0, "\u06e4\u06e6\u06e7"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_13
    const-string v0, "\u06e8\u06e0\u06e0"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_14
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/lit16 v2, v2, -0xed5

    mul-int/2addr v0, v2

    if-gtz v0, :cond_14

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e1\u06e5\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06e6\u06e7\u06e2"

    move-object v2, v0

    :goto_9
    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_15
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/lit16 v2, v2, 0x843

    mul-int/2addr v0, v2

    if-ltz v0, :cond_15

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v0, "\u06e5\u06e7\u06e1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_15
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v0, v2

    const v2, 0x1aa917

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_16
    :sswitch_16
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v0

    if-ltz v0, :cond_17

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v0, "\u06e0\u06e4\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_17
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1aae8b

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_17
    move-object v0, v1

    :cond_18
    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/lit16 v2, v2, 0x10e5

    div-int/2addr v1, v2

    if-eqz v1, :cond_19

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v2, "\u06e2\u06df\u06e4"

    move-object v1, v0

    goto :goto_9

    :cond_19
    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/2addr v1, v2

    const v2, 0x1abdc7

    add-int/2addr v2, v1

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_18
    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    add-int/2addr v0, v2

    const v2, 0x1aa67f

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_19
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    if-gtz v0, :cond_1a

    const/16 v0, 0xc

    sput v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    const-string v0, "\u06e3\u06e7\u06e5"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1a
    const-string v0, "\u06e8\u06e7\u06e4"

    :goto_a
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_1a
    iget v0, p0, Lsn;->g:I

    iget v2, v1, Lsn;->g:I

    if-eq v0, v2, :cond_2c

    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab675

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_1b
    :sswitch_1b
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    mul-int/2addr v0, v2

    const v2, 0x13906d

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_1c
    :sswitch_1c
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v0, :cond_1d

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v0, "\u06e0\u06e0\u06e4"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1d
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac078

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_1d
    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    move-result v0

    if-gtz v0, :cond_1f

    :cond_1e
    const-string v0, "\u06df\u06e2\u06e5"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_1f
    const-string v0, "\u06e0\u06e7\u06e1"

    :goto_b
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_20
    :sswitch_1e
    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v0

    if-ltz v0, :cond_21

    const/16 v0, 0x21

    sput v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v0, "\u06e6\u06e7\u06e1"

    goto/16 :goto_3

    :cond_21
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    add-int/2addr v0, v2

    const v2, 0xd906

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_22
    :sswitch_1f
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v0

    if-gtz v0, :cond_23

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e1\u06e8\u06e6"

    goto/16 :goto_8

    :cond_23
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/2addr v0, v2

    const v2, -0x1ac74a

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_20
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۥۥۢۧ()I

    move-result v0

    if-ltz v0, :cond_24

    const-string v0, "\u06e2\u06e7\u06e7"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_24
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1aab1c

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_21
    iget v0, p0, Lsn;->j:F

    iget v2, v1, Lsn;->j:F

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v0

    if-gtz v0, :cond_25

    const-string v0, "\u06e6\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_25
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/2addr v0, v2

    const v2, 0x1847f0

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_26
    :sswitch_22
    const-string v0, "\u06e6\u06e2\u06df"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_27
    :sswitch_23
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v0, :cond_28

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v0, "\u06e7\u06e4\u06e1"

    :goto_c
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_28
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v0, v2

    const v2, 0x1acaa8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_24
    instance-of v0, p1, Lsn;

    if-nez v0, :cond_22

    const-string v0, "\u06e6\u06e6\u06e3"

    goto :goto_c

    :sswitch_25
    iget-boolean v0, p0, Lsn;->l:Z

    iget-boolean v2, v1, Lsn;->l:Z

    if-eq v0, v2, :cond_2e

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v0, :cond_29

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v0, "\u06e7\u06e4"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_29
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    div-int/2addr v0, v2

    const v2, 0x1ac93e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_26
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v0, :cond_2a

    const/16 v0, 0xa

    sput v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v0, "\u06e6\u06e5\u06e4"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_2a
    const-string v0, "\u06e3\u06e4\u06e3"

    :goto_d
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_27
    iget-boolean v0, p0, Lsn;->p:Z

    iget-boolean v2, v1, Lsn;->p:Z

    if-eq v0, v2, :cond_16

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v0

    if-ltz v0, :cond_2b

    const/16 v0, 0x5d

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e4\u06e4\u06e0"

    goto :goto_d

    :cond_2b
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac152

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_2c
    :sswitch_28
    sget v0, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    if-ltz v0, :cond_2d

    const/16 v0, 0x41

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06e1\u06e6\u06e7"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_2d
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1ae9f8

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_29
    iget v0, p0, Lsn;->d:I

    iget v2, v1, Lsn;->d:I

    if-eq v0, v2, :cond_a

    const-string v0, "\u06df\u06e2\u06e8"

    goto/16 :goto_2

    :cond_2e
    :sswitch_2a
    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    if-ltz v0, :cond_2f

    const/16 v0, 0x8

    sput v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    const-string v0, "\u06df\u06e1\u06e2"

    goto/16 :goto_b

    :cond_2f
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/2addr v0, v2

    const v2, 0xdc08

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_2b
    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/lit16 v2, v2, -0x4e7

    xor-int/2addr v0, v2

    if-gtz v0, :cond_30

    const-string v0, "\u06e4\u06e8\u06df"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_30
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v0, v2

    const v2, 0xdb20

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_2c
    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/lit16 v2, v2, -0x102e

    add-int/2addr v0, v2

    if-ltz v0, :cond_31

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v0, "\u06e6\u06e5\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_31
    sget v0, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int/2addr v0, v2

    const v2, -0x1abc0e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_2d
    iget v0, p0, Lsn;->c:I

    iget v2, v1, Lsn;->c:I

    if-eq v0, v2, :cond_0

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab46e

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_32
    :sswitch_2e
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_33

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    const-string v0, "\u06e6\u06e0\u06e7"

    goto/16 :goto_6

    :cond_33
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    mul-int/2addr v0, v2

    const v2, 0xd5502

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_2f
    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v0, :cond_34

    const-string v0, "\u06df\u06e2\u06e8"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_34
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/2addr v0, v2

    const v2, 0x103f54

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_30
    const/4 v0, 0x1

    :goto_e
    return v0

    :sswitch_31
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v2, v2, -0x1a35

    or-int/2addr v0, v2

    if-ltz v0, :cond_35

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v0, "\u06e8\u06e0\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_35
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1abf1a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_32
    const/4 v0, 0x0

    goto :goto_e

    :sswitch_33
    iget v0, p0, Lsn;->f:I

    iget v2, v1, Lsn;->f:I

    if-eq v0, v2, :cond_36

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v0, :cond_f

    const/16 v0, 0x5f

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e0\u06e1"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_36
    :sswitch_34
    const-string v0, "\u06e1\u06e1\u06e8"

    goto/16 :goto_5

    :cond_37
    :sswitch_35
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v0, v2

    const v2, -0x1abdec

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :cond_38
    :sswitch_36
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v0, :cond_39

    const-string v0, "\u06e7\u06e7\u06e8"

    goto/16 :goto_a

    :cond_39
    const-string v0, "\u06e0\u06e1\u06e4"

    goto/16 :goto_4

    :sswitch_37
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac15a

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_38
    iget v0, p0, Lsn;->h:I

    iget v2, v1, Lsn;->h:I

    if-eq v0, v2, :cond_27

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v0

    if-ltz v0, :cond_3a

    const/16 v0, 0x13

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e0\u06e6\u06df"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3a
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/2addr v0, v2

    const v2, 0x1ac263

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc01 -> :sswitch_25
        0xdc08 -> :sswitch_13
        0xdc5f -> :sswitch_6
        0xdcdd -> :sswitch_16
        0xdcf9 -> :sswitch_0
        0x1aa701 -> :sswitch_0
        0x1aa71e -> :sswitch_0
        0x1aa720 -> :sswitch_28
        0x1aa762 -> :sswitch_8
        0x1aa765 -> :sswitch_19
        0x1aa77f -> :sswitch_10
        0x1aa819 -> :sswitch_20
        0x1aab03 -> :sswitch_11
        0x1aab3e -> :sswitch_34
        0x1aab7a -> :sswitch_16
        0x1aab7e -> :sswitch_0
        0x1aab99 -> :sswitch_35
        0x1aabba -> :sswitch_0
        0x1aabbb -> :sswitch_a
        0x1aabbe -> :sswitch_2e
        0x1aaec8 -> :sswitch_1a
        0x1aaf06 -> :sswitch_38
        0x1aaf3d -> :sswitch_1d
        0x1ab2a1 -> :sswitch_1c
        0x1ab2a4 -> :sswitch_30
        0x1ab31f -> :sswitch_18
        0x1ab342 -> :sswitch_27
        0x1ab343 -> :sswitch_0
        0x1ab642 -> :sswitch_b
        0x1ab683 -> :sswitch_2f
        0x1ab6a2 -> :sswitch_0
        0x1ab6a4 -> :sswitch_37
        0x1ab701 -> :sswitch_2c
        0x1ab71f -> :sswitch_4
        0x1ab722 -> :sswitch_0
        0x1ab9c6 -> :sswitch_29
        0x1ab9c7 -> :sswitch_22
        0x1aba09 -> :sswitch_33
        0x1aba40 -> :sswitch_1f
        0x1aba60 -> :sswitch_24
        0x1aba80 -> :sswitch_1
        0x1aba81 -> :sswitch_9
        0x1abaa1 -> :sswitch_0
        0x1abaa3 -> :sswitch_5
        0x1abaa5 -> :sswitch_17
        0x1abadb -> :sswitch_0
        0x1abadd -> :sswitch_7
        0x1abae1 -> :sswitch_2a
        0x1abd8e -> :sswitch_26
        0x1abdc6 -> :sswitch_d
        0x1abde3 -> :sswitch_21
        0x1abde4 -> :sswitch_0
        0x1abde8 -> :sswitch_1b
        0x1abde9 -> :sswitch_0
        0x1abe46 -> :sswitch_12
        0x1abe5e -> :sswitch_14
        0x1abe7f -> :sswitch_2d
        0x1ac1a3 -> :sswitch_c
        0x1ac1e8 -> :sswitch_0
        0x1ac200 -> :sswitch_23
        0x1ac201 -> :sswitch_32
        0x1ac205 -> :sswitch_0
        0x1ac223 -> :sswitch_2b
        0x1ac241 -> :sswitch_0
        0x1ac25d -> :sswitch_15
        0x1ac263 -> :sswitch_e
        0x1ac5a9 -> :sswitch_3
        0x1ac5e7 -> :sswitch_1e
        0x1ac627 -> :sswitch_36
        0x1ac8e8 -> :sswitch_31
        0x1ac92e -> :sswitch_2
        0x1ac9c5 -> :sswitch_0
        0x1ac9e8 -> :sswitch_f
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 22

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v11, 0x0

    const-string v14, "\u06e3\u06e8\u06e3"

    invoke-static {v14}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v21

    move v14, v1

    move v15, v11

    move/from16 v16, v12

    :goto_0
    sparse-switch v21, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->f:I

    invoke-static {v1, v14, v13}, Lg40;->d(III)I

    move-result v1

    :goto_1
    const-string v7, "\u06e4\u06e4\u06e7"

    invoke-static {v7}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v11

    move v7, v1

    move/from16 v21, v11

    goto :goto_0

    :sswitch_1
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lsn;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v4

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v11, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/lit16 v11, v11, -0xa28

    or-int/2addr v1, v11

    if-ltz v1, :cond_0

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    const-string v1, "\u06e8\u06e1\u06e1"

    :goto_2
    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e1\u06e3\u06e1"

    goto :goto_2

    :sswitch_2
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->i:I

    move/from16 v0, v17

    invoke-static {v1, v0, v13}, Lg40;->d(III)I

    move-result v3

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const/16 v1, 0x13

    sput v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v1, "\u06e8\u06e5\u06e5"

    :goto_3
    invoke-static {v1}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e8\u06e5\u06e5"

    goto :goto_2

    :sswitch_3
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->h:I

    move/from16 v0, v20

    invoke-static {v1, v0, v13}, Lg40;->d(III)I

    move-result v1

    sget v11, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v12, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/lit16 v12, v12, -0x1632

    add-int/2addr v11, v12

    if-ltz v11, :cond_2

    const-string v11, "\u06e0\u06df\u06e5"

    invoke-static {v11}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v11

    move/from16 v17, v1

    move/from16 v21, v11

    goto :goto_0

    :cond_2
    sget v11, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v12, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    xor-int/2addr v11, v12

    const v12, -0x1aaac4

    xor-int/2addr v11, v12

    move/from16 v17, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_4
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v5

    sget v1, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v11, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    rem-int/lit16 v11, v11, 0x1e83

    div-int/2addr v1, v11

    if-ltz v1, :cond_3

    const/16 v1, 0x44

    sput v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    const-string v1, "\u06e8\u06e4"

    :goto_4
    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u06e4\u06e3\u06e2"

    goto :goto_3

    :sswitch_5
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->j:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v6

    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v1, :cond_4

    const-string v1, "\u06e4\u06e3\u06e2"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e3\u06e8\u06e0"

    goto :goto_4

    :sswitch_6
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->b:I

    mul-int v11, v9, v13

    invoke-static {v1, v11, v13}, Lg40;->d(III)I

    move-result v1

    sget v11, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v12, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    or-int/2addr v11, v12

    const v12, 0x1aa8c7

    add-int/2addr v11, v12

    move/from16 v16, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->c:I

    move/from16 v0, v16

    invoke-static {v1, v0, v13}, Lg40;->d(III)I

    move-result v8

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v1

    if-ltz v1, :cond_5

    move v1, v7

    goto/16 :goto_1

    :cond_5
    const-string v1, "\u06e8\u06e0\u06e0"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->d:I

    invoke-static {v1, v8, v13}, Lg40;->d(III)I

    move-result v10

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v1, :cond_7

    const/16 v1, 0x54

    sput v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    move v1, v9

    :cond_6
    const-string v9, "\u06e3\u06e4\u06e7"

    move-object v11, v9

    move v12, v1

    :goto_5
    invoke-static {v11}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v9, v12

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v11, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    xor-int/2addr v1, v11

    const v11, 0x1ab5a3

    add-int/2addr v1, v11

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v1

    if-gtz v1, :cond_8

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v1, "\u06e1\u06df\u06e8"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v11, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    add-int/2addr v1, v11

    const v11, 0x1ab78a

    add-int/2addr v1, v11

    move/from16 v21, v1

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lsn;->o:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    sget v11, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v11, :cond_9

    const/16 v11, 0x61

    sput v11, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v11, "\u06e0\u06e5\u06df"

    invoke-static {v11}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v11

    move v15, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u06e3\u06e3\u06e8"

    invoke-static {v11}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v11

    move v15, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_b
    const/4 v1, 0x0

    move-object/from16 v0, p0

    iget-boolean v11, v0, Lsn;->m:Z

    invoke-static {v11}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v11

    rsub-int/lit8 v11, v11, 0x0

    add-int/lit8 v12, v4, 0x16

    add-int/lit8 v18, v6, 0x7

    add-int v18, v18, v3

    add-int/lit8 v18, v18, -0x7

    mul-int v18, v18, v13

    rsub-int/lit8 v21, v2, 0x0

    sub-int v18, v18, v21

    mul-int v18, v18, v13

    rsub-int/lit8 v18, v18, 0x0

    sub-int v18, v5, v18

    mul-int v18, v18, v13

    add-int v12, v12, v18

    add-int/lit8 v12, v12, -0x16

    mul-int/2addr v12, v13

    sub-int/2addr v11, v12

    rsub-int/lit8 v11, v11, 0x0

    mul-int/2addr v11, v13

    invoke-static {v1, v11, v13}, Lg40;->d(III)I

    move-result v1

    sget v11, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v11, :cond_a

    const/16 v11, 0xf

    sput v11, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v11, "\u06e8\u06e0\u06e6"

    invoke-static {v11}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v11

    move/from16 v18, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :cond_a
    const-string v11, "\u06e8\u06e1\u06e1"

    invoke-static {v11}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v11

    move/from16 v18, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lsn;->p:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/lit8 v1, v1, 0x6

    rsub-int/lit8 v2, v19, 0x0

    sub-int v2, v2, v18

    rsub-int/lit8 v2, v2, 0x0

    mul-int/2addr v2, v13

    rsub-int/lit8 v2, v2, 0x0

    sub-int v2, v15, v2

    mul-int/2addr v2, v13

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x6

    return v1

    :sswitch_d
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->g:I

    invoke-static {v1, v7, v13}, Lg40;->d(III)I

    move-result v1

    sget v11, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v12, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v11, v12

    const v12, 0x1aa5d1

    add-int/2addr v11, v12

    move/from16 v20, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_e
    sget v1, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/lit16 v13, v1, -0x101

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v11, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/lit16 v11, v11, 0x77e

    div-int/2addr v1, v11

    if-eqz v1, :cond_b

    const/16 v1, 0x57

    sput v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    const-string v1, "\u06e8\u06e0\u06e0"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v21, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e8\u06e4"

    move-object v11, v1

    move v12, v9

    goto/16 :goto_5

    :sswitch_f
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->k:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    const-string v1, "\u06e8\u06df\u06e2"

    goto/16 :goto_2

    :sswitch_10
    move-object/from16 v0, p0

    iget-boolean v1, v0, Lsn;->n:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    sget v11, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v12, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    rem-int/2addr v11, v12

    const v12, 0x1abd19

    add-int/2addr v11, v12

    move/from16 v19, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    sget v9, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v11, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/lit16 v11, v11, -0x218f

    xor-int/2addr v9, v11

    if-ltz v9, :cond_6

    const-string v9, "\u06e8\u06df\u06e2"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v11

    move v9, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_12
    move-object/from16 v0, p0

    iget v1, v0, Lsn;->e:I

    invoke-static {v1, v10, v13}, Lg40;->d(III)I

    move-result v1

    sget v11, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v11, :cond_c

    const-string v11, "\u06e3\u06e6\u06e8"

    invoke-static {v11}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v11

    move v14, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u06df\u06e7"

    invoke-static {v11}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v11

    move v14, v1

    move/from16 v21, v11

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_0
        0xdcfc -> :sswitch_6
        0x1aa71e -> :sswitch_3
        0x1aaac6 -> :sswitch_7
        0x1aab7a -> :sswitch_2
        0x1aaeff -> :sswitch_b
        0x1ab688 -> :sswitch_c
        0x1ab6a6 -> :sswitch_e
        0x1ab6e5 -> :sswitch_12
        0x1ab71b -> :sswitch_f
        0x1ab71e -> :sswitch_11
        0x1aba43 -> :sswitch_1
        0x1aba67 -> :sswitch_d
        0x1abde2 -> :sswitch_a
        0x1ac8cb -> :sswitch_4
        0x1ac8e8 -> :sswitch_8
        0x1ac8ee -> :sswitch_9
        0x1ac908 -> :sswitch_10
        0x1ac988 -> :sswitch_5
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v1, 0x0

    const-string v0, "\u06e7\u06e8\u06df"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x26

    sput v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    :cond_0
    const-string v0, "\u06e4\u06df\u06e1"

    :goto_1
    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, ", iconTintAccent="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lsn;->o:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "\u06e2\u06e0\u06e3"

    goto :goto_1

    :sswitch_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/2addr v0, v2

    const v2, -0x1aabd6

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, ", cardCornerRadius="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->j:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/lit16 v2, v2, 0x1a3a

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    const-string v2, "\u06e7\u06e3\u06e8"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06e5\u06e7"

    :goto_3
    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac61f

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    const-string v0, ", itemCornerRadius="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->k:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v0

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    const-string v0, "\u06e6\u06e5\u06e4"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    add-int/2addr v0, v2

    const v2, 0x1ac434

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    const-string v0, ", useStroke=false, useElevationShadow="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lsn;->l:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "\u06e7\u06e6\u06df"

    move-object v0, v1

    goto :goto_2

    :sswitch_7
    const-string v0, ", rippleCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->i:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    div-int/lit16 v2, v2, -0x1741

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x37

    sput v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v0, "\u06e7\u06e8\u06df"

    :goto_4
    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e1\u06e8"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, ", useDivider="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lsn;->m:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    mul-int/lit16 v2, v2, 0x1c53

    div-int/2addr v0, v2

    if-eqz v0, :cond_6

    :cond_5
    const-string v0, "\u06e0\u06df\u06e3"

    goto/16 :goto_3

    :cond_6
    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sub-int/2addr v0, v2

    const v2, 0x1aae15

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    const-string v0, ", cardCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->c:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v0

    if-ltz v0, :cond_7

    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u06e8\u06e1\u06df"

    goto/16 :goto_1

    :sswitch_a
    const-string v0, ", glassStrokeColor="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v2, v2, 0x11b2

    or-int/2addr v0, v2

    if-ltz v0, :cond_8

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    const-string v0, "\u06e3\u06e5\u06e5"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e6\u06e5\u06e4"

    move-object v0, v1

    goto/16 :goto_2

    :sswitch_b
    const-string v0, ", bgCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/lit16 v2, v2, 0x1030

    sub-int/2addr v0, v2

    if-ltz v0, :cond_5

    const-string v0, "\u06e6\u06e8\u06e5"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_c
    const-string v0, ", itemSpacing=0, showIcons="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lsn;->n:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    mul-int/lit16 v2, v2, -0x726

    rem-int/2addr v0, v2

    if-ltz v0, :cond_9

    const-string v0, "\u06e0\u06e8\u06df"

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u06e3\u06e5\u06e5"

    goto/16 :goto_3

    :sswitch_d
    const-string v0, ", dividerCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->h:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_a

    const/16 v0, 0x5c

    sput v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    const-string v0, "\u06e2\u06e1\u06e3"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e5\u06e1\u06e8"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    const-string v0, ", textMainCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/google/android/material/carousel/۠۟ۧۤ;->۟ۡۡۨۥ()I

    move-result v0

    if-gtz v0, :cond_b

    const/16 v0, 0x27

    sput v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    const-string v0, "\u06df\u06e1\u06df"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sub-int/2addr v0, v2

    const v2, -0x1abfe1

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    const-string v0, ", isNight="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lsn;->p:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    sget v0, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v0, :cond_c

    const-string v0, "\u06e3\u06e1\u06e8"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06df\u06e1\u06df"

    goto/16 :goto_4

    :sswitch_10
    const-string v0, ", textSubCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->f:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/lit16 v2, v2, 0x291

    xor-int/2addr v0, v2

    if-ltz v0, :cond_d

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v0, "\u06e7\u06e6\u06df"

    invoke-static {v0}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e7\u06e3\u06e8"

    goto/16 :goto_3

    :sswitch_11
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GeekThemeContext(styleMode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lsn;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v2, v2, 0x17eb

    xor-int/2addr v1, v2

    if-gtz v1, :cond_e

    const/16 v1, 0xc

    sput v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v1, "\u06e1\u06e6\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e7\u06e2\u06e2"

    move-object v2, v1

    goto/16 :goto_2

    :sswitch_12
    const-string v0, ", accentCol="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lsn;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    rem-int/lit16 v2, v2, 0x15f2

    mul-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v0, "\u06e7\u06e2\u06e2"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa73d -> :sswitch_0
        0x1aaac4 -> :sswitch_9
        0x1aabd7 -> :sswitch_2
        0x1aaf5c -> :sswitch_c
        0x1ab265 -> :sswitch_f
        0x1ab284 -> :sswitch_4
        0x1ab64a -> :sswitch_3
        0x1ab6c3 -> :sswitch_1
        0x1ab6c5 -> :sswitch_5
        0x1ab9c6 -> :sswitch_d
        0x1abdcc -> :sswitch_7
        0x1abe65 -> :sswitch_10
        0x1ac205 -> :sswitch_e
        0x1ac263 -> :sswitch_6
        0x1ac567 -> :sswitch_b
        0x1ac58c -> :sswitch_12
        0x1ac5e0 -> :sswitch_8
        0x1ac61e -> :sswitch_11
        0x1ac906 -> :sswitch_a
    .end sparse-switch
.end method
