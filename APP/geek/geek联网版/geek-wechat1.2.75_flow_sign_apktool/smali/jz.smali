.class public final Ljz;
.super Landroid/text/style/ReplacementSpan;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:F

.field public d:F

.field public final e:F


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 13

    const-string v0, "ImA72o7GvQ==\n"

    const-string v1, "UAFMjuu+yZw=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const-string v8, "\u06e7\u06e8\u06e2"

    invoke-static {v8}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v12

    move-object v8, v3

    :goto_0
    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, ""

    sget v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v12, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/lit16 v12, v12, -0x11d3

    mul-int/2addr v3, v12

    if-gtz v3, :cond_b

    const-string v3, "\u06e2\u06e7\u06e1"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :sswitch_1
    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v12, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/lit16 v12, v12, -0x1f98

    sub-int/2addr v3, v12

    if-gtz v3, :cond_0

    const/16 v3, 0x42

    sput v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v3, "\u06e4\u06e7\u06e2"

    invoke-static {v3}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_0
    const-string v3, "\u06e4\u06e3"

    :goto_1
    invoke-static {v3}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v12, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    or-int/2addr v3, v12

    const v12, 0x1aa769

    add-int/2addr v3, v12

    move v12, v3

    goto :goto_0

    :sswitch_3
    const/high16 v2, 0x41000000    # 8.0f

    iput v2, p0, Ljz;->e:F

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v3, :cond_2

    const/16 v3, 0x32

    sput v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    :goto_2
    const-string v3, "\u06e8\u06e5\u06e6"

    invoke-static {v3}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06e3\u06e7\u06df"

    invoke-static {v3}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :sswitch_4
    iput-object v6, p0, Ljz;->a:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v3

    if-gtz v3, :cond_1

    sget v3, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v12, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v12, v12, -0xb96

    mul-int/2addr v3, v12

    if-gtz v3, :cond_3

    const/4 v3, 0x3

    sput v3, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v3, "\u06e8\u06e3\u06e5"

    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto :goto_0

    :cond_3
    sget v3, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v12, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/2addr v3, v12

    const v12, 0x1abc6a

    add-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "W9"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۦ۟۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    sget v10, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    if-gtz v10, :cond_4

    const-string v10, "\u06e0\u06e3\u06e7"

    invoke-static {v10}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v12

    move-object v10, v3

    goto/16 :goto_0

    :cond_4
    sget v10, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v12, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v10, v12

    const v12, 0x1aab92

    add-int/2addr v12, v10

    move-object v10, v3

    goto/16 :goto_0

    :sswitch_6
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v0, "\u06e6\u06e8\u06e6"

    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v0, v1

    move v12, v3

    goto/16 :goto_0

    :cond_5
    move-object v0, v1

    goto :goto_2

    :sswitch_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {p1}, Li50;->B(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v12, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/lit16 v12, v12, 0x124c

    mul-int/2addr v3, v12

    if-gtz v3, :cond_6

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v3, "\u06e4\u06e3"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_6
    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v12, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v3, v12

    const v12, 0x1ac3a4

    xor-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :cond_7
    :sswitch_8
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v3

    if-ltz v3, :cond_8

    const-string v3, "\u06e5\u06e5\u06e4"

    :goto_3
    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e4\u06e4\u06e5"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :sswitch_9
    const/high16 v3, 0x41200000    # 10.0f

    iput v3, p0, Ljz;->c:F

    const/high16 v3, -0x40800000    # -1.0f

    iput v3, p0, Ljz;->d:F

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v12, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    mul-int/2addr v3, v12

    const v12, 0x18d25f

    xor-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_a
    sget-object v3, Lkn;->a:Lkn;

    const-string v8, "BF+rmxBnxfgwVLOpB13T5g5KoqEQXdfgFla3\n"

    const-string v9, "bzrSxGICpJQ=\n"

    invoke-static {v8, v9}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v12, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/lit16 v12, v12, 0x2177

    or-int/2addr v8, v12

    if-ltz v8, :cond_9

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v8, "\u06e0\u06e5\u06e5"

    invoke-static {v8}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v12

    move-object v8, v3

    goto/16 :goto_0

    :cond_9
    sget v8, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v12, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/2addr v8, v12

    const v12, 0x1aba7c

    add-int/2addr v12, v8

    move-object v8, v3

    goto/16 :goto_0

    :sswitch_b
    const-string v3, "TRUDJlnx/D15HhsUTsvtI0MWEwE=\n"

    const-string v6, "JnB6eSuUnVE=\n"

    invoke-static {v3, v6}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "X+vi\n"

    const-string v11, "ulttWrjBe0k=\n"

    invoke-static {v6, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget v6, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v11, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sub-int/2addr v6, v11

    const v11, 0x1ac1ac

    add-int v12, v6, v11

    move-object v11, v3

    move-object v6, v4

    goto/16 :goto_0

    :sswitch_c
    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v3, :cond_a

    const-string v3, "\u06e7\u06e8\u06e2"

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v6, v5

    move v12, v3

    goto/16 :goto_0

    :cond_a
    move-object v3, v5

    :goto_4
    const-string v6, "\u06e5\u06e3\u06e4"

    invoke-static {v6}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v12

    move-object v6, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v12, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/2addr v3, v12

    const v12, 0x1ac86f

    add-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_d
    sget v3, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v12, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    xor-int/lit16 v12, v12, 0xcc

    rem-int/2addr v3, v12

    if-gtz v3, :cond_c

    const-string v3, "\u06e5\u06e7\u06e3"

    :goto_5
    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06e5\u06e6"

    goto :goto_5

    :sswitch_e
    const-string v4, ""

    if-lez v2, :cond_d

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v12, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    add-int/lit16 v12, v12, -0xbbf

    or-int/2addr v3, v12

    if-ltz v3, :cond_13

    const-string v3, "\u06e5\u06e5\u06e8"

    invoke-static {v3}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :sswitch_f
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Char sequence is empty."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :sswitch_10
    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v12, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v12, v12, 0x1a20

    div-int/2addr v3, v12

    if-eqz v3, :cond_e

    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    const-string v3, "\u06e6\u06e2\u06e0"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06df\u06e2"

    goto/16 :goto_3

    :sswitch_11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_14

    invoke-virtual {v11, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v3, :cond_f

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    const-string v3, "\u06e0\u06e0\u06df"

    invoke-static {v3}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_f
    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v12, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sub-int/2addr v3, v12

    const v12, 0x1aae2c

    add-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_12
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v10}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v12, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/lit16 v12, v12, -0xcf7

    xor-int/2addr v3, v12

    if-gtz v3, :cond_11

    :cond_10
    const-string v3, "\u06df\u06e1\u06e5"

    invoke-static {v3}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_11
    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v12, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    div-int/2addr v3, v12

    const v12, 0x1aa73a

    add-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_13
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/lit16 v3, v3, -0x1abd

    add-int/2addr v0, v3

    if-ltz v0, :cond_12

    move-object v3, v6

    move-object v0, v7

    goto/16 :goto_4

    :cond_12
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v0, v3

    const v3, 0x1accbf

    add-int/2addr v3, v0

    move-object v0, v7

    move v12, v3

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-static {v9, v3}, Lkn;->b(Ljava/lang/String;I)I

    move-result v3

    iput v3, p0, Ljz;->b:I

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v12, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    div-int/lit16 v12, v12, -0x1a24

    or-int/2addr v3, v12

    if-ltz v3, :cond_10

    const/16 v3, 0x32

    sput v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    :cond_13
    const-string v3, "\u06e7\u06e3"

    goto/16 :goto_1

    :cond_14
    :sswitch_15
    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v12, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    div-int/lit16 v12, v12, -0xd32

    add-int/2addr v3, v12

    if-gtz v3, :cond_15

    const/4 v3, 0x0

    sput v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    const-string v3, "\u06e1\u06e7\u06e5"

    :goto_6
    invoke-static {v3}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v3

    move v12, v3

    goto/16 :goto_0

    :cond_15
    const-string v3, "\u06e5\u06e3\u06e4"

    goto :goto_6

    :sswitch_16
    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v12, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/2addr v3, v12

    const v12, 0x1acb16

    add-int/2addr v3, v12

    move v12, v3

    goto/16 :goto_0

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdc7f -> :sswitch_d
        0xdcdc -> :sswitch_7
        0x1aa743 -> :sswitch_9
        0x1aa746 -> :sswitch_17
        0x1aaadf -> :sswitch_3
        0x1aab44 -> :sswitch_c
        0x1aab80 -> :sswitch_12
        0x1ab33c -> :sswitch_8
        0x1ab64a -> :sswitch_16
        0x1ab686 -> :sswitch_10
        0x1ab6fb -> :sswitch_e
        0x1aba49 -> :sswitch_14
        0x1aba63 -> :sswitch_5
        0x1aba65 -> :sswitch_f
        0x1ababf -> :sswitch_15
        0x1abe06 -> :sswitch_4
        0x1abe48 -> :sswitch_d
        0x1ac263 -> :sswitch_13
        0x1ac264 -> :sswitch_11
        0x1ac621 -> :sswitch_a
        0x1ac94a -> :sswitch_6
        0x1ac983 -> :sswitch_2
        0x1ac989 -> :sswitch_b
        0x1ac9df -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 35

    const/4 v8, 0x0

    const/16 v28, 0x0

    const/16 v33, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/16 v29, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/4 v4, 0x0

    const/16 v32, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const-string v20, "\u06e6\u06e0\u06e3"

    invoke-static/range {v20 .. v20}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v34

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move/from16 v22, v4

    move/from16 v23, v5

    move/from16 v24, v6

    move/from16 v25, v7

    :goto_0
    sparse-switch v34, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v3, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v2, v3

    const v3, 0x1ab419

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto :goto_0

    :sswitch_1
    move/from16 v0, p7

    int-to-float v2, v0

    const/4 v3, 0x0

    move-object/from16 v0, v21

    iget v4, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    sub-float/2addr v3, v4

    sub-float/2addr v2, v3

    const/high16 v3, 0x40c00000    # 6.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x40c00000    # 6.0f

    add-float v4, v2, v3

    move-object/from16 v0, p0

    iget v3, v0, Ljz;->e:F

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    xor-int/lit16 v2, v2, 0x39a

    int-to-float v5, v2

    sget v6, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v7, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    add-int/lit16 v7, v7, -0x2384

    xor-int/2addr v6, v7

    if-gtz v6, :cond_0

    const-string v6, "\u06e7\u06df\u06e6"

    invoke-static {v6}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v6

    move/from16 v22, v2

    move/from16 v30, v3

    move/from16 v31, v4

    move/from16 v32, v5

    move/from16 v34, v6

    goto :goto_0

    :cond_0
    sget v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v7, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/2addr v6, v7

    const v7, -0x1ac1e5

    xor-int/2addr v6, v7

    move/from16 v22, v2

    move/from16 v30, v3

    move/from16 v31, v4

    move/from16 v32, v5

    move/from16 v34, v6

    goto :goto_0

    :sswitch_2
    move/from16 v0, v22

    new-array v2, v0, [F

    const/4 v3, 0x0

    const/high16 v4, 0x41000000    # 8.0f

    aput v4, v2, v3

    const/4 v3, 0x1

    const/high16 v4, 0x40c00000    # 6.0f

    aput v4, v2, v3

    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/high16 v2, 0x41000000    # 8.0f

    const/high16 v3, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, p9

    invoke-virtual {v0, v10, v2, v3, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/lit16 v3, v3, -0x1342

    add-int/2addr v2, v3

    if-ltz v2, :cond_1

    const/16 v2, 0xf

    sput v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    const-string v2, "\u06e1\u06e8\u06df"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_1
    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/2addr v2, v3

    const v3, 0x1aaea5

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_3
    iget v3, v10, Landroid/graphics/RectF;->left:F

    iget v4, v10, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x41d00000    # 26.0f

    add-float/2addr v2, v3

    const/high16 v5, 0x41000000    # 8.0f

    add-float/2addr v2, v5

    const/high16 v5, 0x41d00000    # 26.0f

    sub-float v5, v2, v5

    move-object/from16 v2, p1

    move v6, v4

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v10, Landroid/graphics/RectF;->left:F

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    rem-int/lit16 v4, v4, -0x102d

    or-int/2addr v3, v4

    if-ltz v3, :cond_2

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    const-string v3, "\u06e8\u06e5\u06e7"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move v12, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e1\u06e0\u06e7"

    move v5, v2

    move-object v6, v3

    :goto_1
    invoke-static {v6}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v12, v5

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_4
    const/4 v2, 0x1

    if-eq v11, v2, :cond_c

    move/from16 v0, v22

    if-eq v11, v0, :cond_f

    const/4 v2, 0x3

    if-eq v11, v2, :cond_1e

    const/4 v2, 0x4

    if-eq v11, v2, :cond_21

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v3, v3, 0x6c2

    sub-int/2addr v2, v3

    if-ltz v2, :cond_3

    invoke-static {}, Landroidx/activity/ۣۢۦۨ;->۟ۦۣ۠ۢ()I

    const-string v2, "\u06e1\u06e0\u06e8"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_3
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    sget v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    xor-int/2addr v2, v3

    const v3, -0x1ac5ec

    xor-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_5
    invoke-static/range {v33 .. v33}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v3, 0x3fc00000    # 1.5f

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    xor-int/lit16 v3, v3, 0x1b8

    move/from16 v0, v16

    invoke-static {v3, v0, v14, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    move-object/from16 v0, p9

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget v2, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v2, :cond_12

    const/16 v2, 0x11

    sput v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v2, "\u06e6\u06e2\u06e0"

    invoke-static {v2}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_6
    move-object v2, v9

    move-object v3, v10

    move v4, v11

    :cond_4
    sget v5, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/lit16 v6, v6, 0x1156

    xor-int/2addr v5, v6

    if-gtz v5, :cond_5

    const-string v6, "\u06e8\u06e4\u06df"

    move-object v9, v2

    move-object v10, v3

    move v5, v12

    move v11, v4

    goto :goto_1

    :cond_5
    sget v5, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v6, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    xor-int/2addr v5, v6

    const v6, 0x1acad5

    xor-int/2addr v5, v6

    move-object v9, v2

    move-object v10, v3

    move v11, v4

    move/from16 v34, v5

    goto/16 :goto_0

    :sswitch_7
    new-instance v3, Landroid/graphics/RectF;

    iget v2, v13, Landroid/graphics/RectF;->left:F

    const/high16 v4, 0x41e80000    # 29.0f

    sub-float/2addr v2, v4

    const v4, 0x3f19999a    # 0.6f

    add-float/2addr v2, v4

    const/high16 v4, 0x41e80000    # 29.0f

    add-float/2addr v2, v4

    iget v4, v13, Landroid/graphics/RectF;->top:F

    const/high16 v5, 0x40a00000    # 5.0f

    sub-float/2addr v4, v5

    const v5, 0x3f19999a    # 0.6f

    add-float/2addr v4, v5

    const/high16 v5, 0x40a00000    # 5.0f

    add-float/2addr v4, v5

    iget v5, v13, Landroid/graphics/RectF;->right:F

    const/high16 v6, 0x41500000    # 13.0f

    sub-float/2addr v5, v6

    const v6, 0x3f19999a    # 0.6f

    sub-float/2addr v5, v6

    const/high16 v6, 0x41500000    # 13.0f

    add-float/2addr v5, v6

    iget v6, v13, Landroid/graphics/RectF;->bottom:F

    const/high16 v7, 0x40000000    # 2.0f

    sub-float/2addr v6, v7

    const v7, 0x3f19999a    # 0.6f

    sub-float/2addr v6, v7

    const/high16 v7, 0x40000000    # 2.0f

    add-float/2addr v6, v7

    invoke-direct {v3, v2, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getPathEffect()Landroid/graphics/PathEffect;

    move-result-object v2

    move-object/from16 v0, p0

    iget v4, v0, Ljz;->b:I

    if-eqz v4, :cond_4

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v5, v6

    const v6, 0x13da35

    xor-int/2addr v5, v6

    move-object v9, v2

    move-object v10, v3

    move v11, v4

    move/from16 v34, v5

    goto/16 :goto_0

    :sswitch_8
    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, v10, Landroid/graphics/RectF;->top:F

    sub-float/2addr v3, v4

    const/high16 v4, 0x40800000    # 4.0f

    sub-float/2addr v3, v4

    sub-float v4, v2, v3

    iget v2, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v3, 0x41b80000    # 23.0f

    add-float/2addr v2, v3

    const/high16 v3, 0x40800000    # 4.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x41b80000    # 23.0f

    sub-float v6, v2, v3

    move-object/from16 v2, p1

    move/from16 v3, v26

    move/from16 v5, v26

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/lit16 v3, v3, 0x148e

    div-int/2addr v2, v3

    if-eqz v2, :cond_6

    const-string v2, "\u06e1\u06e4\u06e2"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    xor-int/2addr v2, v3

    const v3, 0x1aa44a

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_9
    move/from16 v0, v22

    new-array v2, v0, [F

    const/4 v3, 0x0

    const/high16 v4, 0x40400000    # 3.0f

    aput v4, v2, v3

    const/4 v3, 0x1

    const/high16 v4, 0x40800000    # 4.0f

    aput v4, v2, v3

    new-instance v3, Landroid/graphics/DashPathEffect;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    move-object/from16 v0, p9

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/high16 v2, 0x41000000    # 8.0f

    const/high16 v3, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, p9

    invoke-virtual {v0, v10, v2, v3, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/lit16 v3, v3, -0x160a

    add-int/2addr v2, v3

    if-gtz v2, :cond_7

    :goto_2
    const-string v2, "\u06e4\u06e1\u06e6"

    :goto_3
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e1\u06e8\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_a
    const/4 v2, 0x5

    if-eq v11, v2, :cond_10

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    rem-int/lit16 v3, v3, -0x17fc

    rem-int/2addr v2, v3

    if-ltz v2, :cond_9

    const-string v2, "\u06e3\u06e3\u06e0"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_b
    const/high16 v2, 0x41000000    # 8.0f

    const/high16 v3, 0x41000000    # 8.0f

    move-object/from16 v0, p1

    move-object/from16 v1, p9

    invoke-virtual {v0, v10, v2, v3, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_2

    :sswitch_c
    iget v3, v10, Landroid/graphics/RectF;->left:F

    iget v2, v10, Landroid/graphics/RectF;->top:F

    const/high16 v4, 0x40800000    # 4.0f

    sub-float/2addr v2, v4

    const/high16 v4, 0x40800000    # 4.0f

    add-float/2addr v2, v4

    const/high16 v4, 0x40800000    # 4.0f

    add-float/2addr v4, v2

    iget v2, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v5, 0x41a00000    # 20.0f

    add-float/2addr v2, v5

    const/high16 v5, 0x40800000    # 4.0f

    sub-float/2addr v2, v5

    const/high16 v5, 0x41a00000    # 20.0f

    sub-float v6, v2, v5

    move-object/from16 v2, p1

    move v5, v3

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v10, Landroid/graphics/RectF;->right:F

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    xor-int/2addr v3, v4

    const v4, 0x1ab0cb

    add-int/2addr v3, v4

    move/from16 v26, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :sswitch_d
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    or-int/lit16 v3, v3, 0x1954

    div-int/2addr v2, v3

    if-gtz v2, :cond_8

    const/4 v2, 0x1

    sput v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v2, "\u06df\u06e5\u06df"

    invoke-static {v2}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    div-int/2addr v2, v3

    const v3, 0x1ab9cc

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_e
    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    if-ltz v2, :cond_a

    const/16 v2, 0x61

    sput v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    :cond_9
    const-string v2, "\u06e6\u06e8\u06e4"

    move-object v3, v2

    :goto_4
    invoke-static {v3}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_a
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    add-int/2addr v2, v3

    const v3, 0x1ab56f

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_f
    iget v4, v10, Landroid/graphics/RectF;->top:F

    const/high16 v2, 0x41d00000    # 26.0f

    add-float/2addr v2, v4

    const/high16 v3, 0x41000000    # 8.0f

    add-float/2addr v2, v3

    const/high16 v3, 0x41d00000    # 26.0f

    sub-float v6, v2, v3

    move-object/from16 v2, p1

    move v3, v12

    move v5, v12

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v10, Landroid/graphics/RectF;->right:F

    iget v3, v10, Landroid/graphics/RectF;->top:F

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    if-ltz v4, :cond_b

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v4, "\u06e8\u06e0\u06e8"

    invoke-static {v4}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v24, v2

    move/from16 v25, v3

    move/from16 v34, v4

    goto/16 :goto_0

    :cond_b
    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v5, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v4, v5

    const v5, 0x1ac913

    add-int/2addr v4, v5

    move/from16 v24, v2

    move/from16 v25, v3

    move/from16 v34, v4

    goto/16 :goto_0

    :cond_c
    :sswitch_10
    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v2

    if-gtz v2, :cond_d

    const-string v2, "\u06e8\u06e1\u06e5"

    invoke-static {v2}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v3, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    xor-int/2addr v2, v3

    const v3, -0x1ab96d

    xor-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_11
    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/2addr v2, v3

    const v3, 0x1ab4d9

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_12
    iget v3, v10, Landroid/graphics/RectF;->left:F

    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x41000000    # 8.0f

    const/4 v5, 0x0

    sub-float/2addr v5, v3

    sub-float v5, v2, v5

    move-object/from16 v2, p1

    move v6, v4

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v10, Landroid/graphics/RectF;->left:F

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    xor-int/lit16 v4, v4, 0x166e

    div-int/2addr v3, v4

    if-eqz v3, :cond_e

    const-string v3, "\u06e2\u06e3"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v23, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e0\u06e5"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v23, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :sswitch_13
    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/2addr v2, v3

    const v3, 0x1ac439

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_f
    :sswitch_14
    const-string v2, "\u06e5\u06e8"

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_10
    :sswitch_15
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v2, :cond_11

    const-string v2, "\u06e8\u06e8\u06e5"

    :goto_6
    invoke-static {v2}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_11
    const-string v2, "\u06e0\u06e0\u06e0"

    goto :goto_6

    :sswitch_16
    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    add-int/lit16 v3, v3, -0x1480

    rem-int/2addr v2, v3

    if-ltz v2, :cond_13

    const/16 v2, 0x37

    sput v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    :cond_12
    const-string v6, "\u06e6\u06e1\u06e3"

    move-object v2, v13

    move v3, v14

    move v4, v15

    move/from16 v5, v16

    :goto_7
    invoke-static {v6}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v13, v2

    move v14, v3

    move v15, v4

    move/from16 v16, v5

    move/from16 v34, v6

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e6\u06e7\u06e5"

    goto :goto_5

    :sswitch_17
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v4

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    const v5, 0x3f47ae14    # 0.78f

    mul-float/2addr v5, v3

    move-object/from16 v0, p9

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v6, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/lit16 v6, v6, -0x9f1

    xor-int/2addr v5, v6

    if-ltz v5, :cond_14

    const-string v5, "\u06e6\u06e0\u06df"

    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v21, v2

    move/from16 v28, v3

    move/from16 v33, v4

    move/from16 v34, v5

    goto/16 :goto_0

    :cond_14
    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/2addr v5, v6

    const v6, 0x1abf02

    add-int/2addr v5, v6

    move-object/from16 v21, v2

    move/from16 v28, v3

    move/from16 v33, v4

    move/from16 v34, v5

    goto/16 :goto_0

    :sswitch_18
    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/lit16 v3, v3, -0x1578

    xor-int/2addr v2, v3

    if-gtz v2, :cond_15

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v3, "\u06e2\u06e8\u06e4"

    move/from16 v2, v17

    :goto_8
    invoke-static {v3}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/2addr v2, v3

    const v3, 0x1aa5b4

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_19
    const/high16 v2, 0x41500000    # 13.0f

    add-float v2, v2, v19

    const/high16 v3, 0x41000000    # 8.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x41500000    # 13.0f

    sub-float v5, v2, v3

    move-object/from16 v2, p1

    move/from16 v3, v19

    move/from16 v4, v18

    move/from16 v6, v18

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v3, v10, Landroid/graphics/RectF;->right:F

    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x41980000    # 19.0f

    add-float/2addr v2, v4

    const/high16 v5, 0x41000000    # 8.0f

    sub-float/2addr v2, v5

    const/high16 v5, 0x41980000    # 19.0f

    sub-float v6, v2, v5

    move-object/from16 v2, p1

    move v5, v3

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v2, :cond_16

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v2, "\u06df\u06e8"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e7\u06e8\u06e4"

    :goto_9
    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p9

    invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    move-object/from16 v0, p9

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    move-object/from16 v0, p9

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v2, 0x0

    move-object/from16 v0, p9

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    div-int/lit16 v3, v3, -0x1d06

    mul-int/2addr v2, v3

    if-eqz v2, :cond_17

    const-string v2, "\u06e8\u06e2\u06e8"

    goto :goto_9

    :cond_17
    const-string v2, "\u06e6\u06e6\u06df"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_1b
    iget v2, v10, Landroid/graphics/RectF;->left:F

    iget v4, v10, Landroid/graphics/RectF;->top:F

    const/high16 v3, 0x40800000    # 4.0f

    const/4 v5, 0x0

    sub-float v2, v5, v2

    sub-float/2addr v3, v2

    iget v2, v10, Landroid/graphics/RectF;->right:F

    const/high16 v5, 0x41500000    # 13.0f

    add-float/2addr v2, v5

    const/high16 v5, 0x40800000    # 4.0f

    sub-float/2addr v2, v5

    const/high16 v5, 0x41500000    # 13.0f

    sub-float v5, v2, v5

    move-object/from16 v2, p1

    move v6, v4

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v2, v10, Landroid/graphics/RectF;->left:F

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v4, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/lit16 v4, v4, 0x96a

    add-int/2addr v3, v4

    if-gtz v3, :cond_18

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    const-string v3, "\u06e8\u06e1\u06e4"

    invoke-static {v3}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v17, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :cond_18
    const-string v3, "\u06e7\u06e0\u06e2"

    goto/16 :goto_8

    :sswitch_1c
    const/4 v2, 0x1

    move-object/from16 v0, p9

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v2

    move-object/from16 v0, p9

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v6, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v5, v6

    const v6, 0x1ab300

    xor-int/2addr v5, v6

    move-object/from16 v20, v2

    move/from16 v27, v3

    move/from16 v29, v4

    move/from16 v34, v5

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual {v13}, Landroid/graphics/RectF;->centerY()F

    move-result v2

    move-object/from16 v0, v20

    iget v3, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    const/4 v4, 0x0

    move-object/from16 v0, v20

    iget v5, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    sub-float/2addr v4, v5

    sub-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget v4, v13, Landroid/graphics/RectF;->left:F

    const/high16 v5, 0x41e80000    # 29.0f

    sub-float/2addr v4, v5

    add-float/2addr v4, v15

    const/high16 v5, 0x41e80000    # 29.0f

    add-float/2addr v4, v5

    const/high16 v5, 0x41f00000    # 30.0f

    add-float/2addr v2, v5

    sub-float/2addr v2, v3

    const/high16 v3, 0x41f00000    # 30.0f

    sub-float/2addr v2, v3

    move-object/from16 v0, p1

    move-object/from16 v1, p9

    invoke-virtual {v0, v8, v4, v2, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    move-object/from16 v0, p9

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    if-ltz v2, :cond_19

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v2, "\u06e2\u06e5\u06e4"

    invoke-static {v2}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_19
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v2, v3

    const v3, -0x1aba6b

    xor-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_1e
    move-object v2, v8

    :cond_1a
    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    move-result v3

    if-gtz v3, :cond_1b

    const-string v3, "\u06e4\u06e4\u06e5"

    :goto_a
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v8, v2

    move/from16 v34, v3

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06e8\u06e5\u06e7"

    goto :goto_a

    :sswitch_1f
    move-object/from16 v0, p9

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    const-string v4, "\u06df\u06e1\u06e1"

    move/from16 v2, v18

    move/from16 v3, v19

    :goto_b
    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v18, v2

    move/from16 v19, v3

    move/from16 v34, v4

    goto/16 :goto_0

    :sswitch_20
    const-string v3, "\u06e8\u06e0\u06e8"

    move-object v2, v8

    goto :goto_a

    :sswitch_21
    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    add-int/lit16 v3, v3, 0x21f8

    div-int/2addr v2, v3

    if-eqz v2, :cond_1c

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    const-string v2, "\u06e5\u06e5\u06e0"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_1c
    const-string v2, "\u06e2\u06e2\u06df"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_22
    move-object/from16 v0, p0

    iget v4, v0, Ljz;->c:F

    new-instance v2, Landroid/graphics/RectF;

    const/4 v3, 0x0

    const/4 v5, 0x0

    sub-float v5, v5, p5

    sub-float v5, v5, v30

    sub-float/2addr v3, v5

    const/high16 v5, 0x40a00000    # 5.0f

    add-float v5, v5, v31

    const/high16 v6, 0x41100000    # 9.0f

    sub-float v6, v27, v6

    const/high16 v7, 0x41000000    # 8.0f

    add-float/2addr v6, v7

    const/high16 v7, 0x41100000    # 9.0f

    add-float/2addr v6, v7

    sub-float/2addr v5, v6

    const/high16 v6, 0x40a00000    # 5.0f

    sub-float/2addr v5, v6

    mul-float v6, v32, v4

    const/4 v7, 0x0

    const/high16 v13, 0x40a00000    # 5.0f

    add-float v13, v13, p5

    add-float v13, v13, v30

    const/high16 v14, 0x40a00000    # 5.0f

    sub-float/2addr v13, v14

    const/4 v14, 0x0

    sub-float v14, v14, v29

    sub-float/2addr v13, v14

    sub-float/2addr v7, v13

    sub-float/2addr v6, v7

    move/from16 v0, v31

    invoke-direct {v2, v3, v5, v6, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static/range {v33 .. v33}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static/range {v33 .. v33}, Landroid/graphics/Color;->green(I)I

    move-result v3

    sget v6, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v6, :cond_1d

    const/16 v6, 0x19

    sput v6, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v6, "\u06e4\u06e5\u06e8"

    invoke-static {v6}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v13, v2

    move v14, v3

    move v15, v4

    move/from16 v16, v5

    move/from16 v34, v6

    goto/16 :goto_0

    :cond_1d
    const-string v6, "\u06e4\u06e5\u06e8"

    goto/16 :goto_7

    :cond_1e
    :sswitch_23
    const-string v2, "\u06e5\u06e2\u06e0"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_24
    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x41e80000    # 29.0f

    sub-float v2, v17, v2

    const/high16 v3, 0x40800000    # 4.0f

    add-float/2addr v2, v3

    const/high16 v3, 0x41e80000    # 29.0f

    add-float/2addr v3, v2

    iget v2, v10, Landroid/graphics/RectF;->right:F

    const/high16 v5, 0x40c00000    # 6.0f

    add-float/2addr v2, v5

    const/high16 v5, 0x40800000    # 4.0f

    sub-float/2addr v2, v5

    const/high16 v5, 0x40c00000    # 6.0f

    sub-float v5, v2, v5

    move-object/from16 v2, p1

    move v6, v4

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    or-int/lit16 v3, v3, -0xf6

    mul-int/2addr v2, v3

    if-ltz v2, :cond_1f

    const-string v2, "\u06e8\u06e0\u06e7"

    invoke-static {v2}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v2, v3

    const v3, 0x1abcb8

    add-int/2addr v2, v3

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_25
    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    const/high16 v2, 0x40a00000    # 5.0f

    sub-float v2, v4, v2

    const/high16 v3, 0x41000000    # 8.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x40a00000    # 5.0f

    add-float v6, v2, v3

    move-object/from16 v2, p1

    move/from16 v3, v23

    move/from16 v5, v23

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v3, v10, Landroid/graphics/RectF;->right:F

    iget v2, v10, Landroid/graphics/RectF;->bottom:F

    sget v4, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v5, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v5, v5, -0x8ac

    or-int/2addr v4, v5

    if-ltz v4, :cond_20

    const/16 v4, 0x57

    sput v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    :cond_20
    const-string v4, "\u06e2\u06e4\u06e5"

    goto/16 :goto_b

    :cond_21
    :sswitch_26
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v3, v3, -0x1a69

    mul-int/2addr v2, v3

    if-ltz v2, :cond_22

    const-string v2, "\u06e7\u06e3\u06e5"

    goto/16 :goto_5

    :cond_22
    const-string v2, "\u06e1\u06e0\u06e8"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :sswitch_27
    const-string v2, "LXDK9GSD\n"

    const-string v3, "ThGkggXwjvw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p1

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "TcXzy24=\n"

    const-string v3, "PaSapRrRhMw=\n"

    invoke-static {v2, v3}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p9

    invoke-static {v2, v0}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Ljz;->a:Ljava/lang/String;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1a

    const-string v3, "\u06e1\u06e4\u06e2"

    move-object v8, v2

    goto/16 :goto_4

    :sswitch_28
    const/high16 v2, 0x40400000    # 3.0f

    add-float v2, v2, v24

    const/high16 v3, 0x41000000    # 8.0f

    sub-float/2addr v2, v3

    const/high16 v3, 0x40400000    # 3.0f

    sub-float v5, v2, v3

    move-object/from16 v2, p1

    move/from16 v3, v24

    move/from16 v4, v25

    move/from16 v6, v25

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget v3, v10, Landroid/graphics/RectF;->right:F

    iget v4, v10, Landroid/graphics/RectF;->top:F

    const/4 v2, 0x0

    const/high16 v5, 0x41000000    # 8.0f

    sub-float/2addr v2, v5

    sub-float v6, v4, v2

    move-object/from16 v2, p1

    move v5, v3

    move-object/from16 v7, p9

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/lit16 v3, v3, -0x847

    xor-int/2addr v2, v3

    if-ltz v2, :cond_23

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    const-string v2, "\u06e6\u06e6\u06df"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v34, v2

    goto/16 :goto_0

    :cond_23
    const-string v2, "\u06e3\u06e3\u06e0"

    goto/16 :goto_3

    :sswitch_29
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0xdc05 -> :sswitch_25
        0xdc41 -> :sswitch_1e
        0xdca3 -> :sswitch_9
        0x1aa73f -> :sswitch_29
        0x1aa77d -> :sswitch_23
        0x1aa77e -> :sswitch_14
        0x1aa7b9 -> :sswitch_6
        0x1aa7bb -> :sswitch_11
        0x1aaae0 -> :sswitch_c
        0x1aab64 -> :sswitch_18
        0x1aaea8 -> :sswitch_f
        0x1aaea9 -> :sswitch_1b
        0x1aaec1 -> :sswitch_8
        0x1aaf1f -> :sswitch_29
        0x1aaf5b -> :sswitch_20
        0x1aaf98 -> :sswitch_21
        0x1ab29f -> :sswitch_0
        0x1ab2e0 -> :sswitch_0
        0x1ab2e3 -> :sswitch_19
        0x1ab301 -> :sswitch_1
        0x1ab680 -> :sswitch_12
        0x1ab681 -> :sswitch_0
        0x1ab9c7 -> :sswitch_0
        0x1aba09 -> :sswitch_1a
        0x1aba42 -> :sswitch_2
        0x1aba87 -> :sswitch_5
        0x1abac5 -> :sswitch_4
        0x1abde3 -> :sswitch_3
        0x1abe22 -> :sswitch_16
        0x1abe40 -> :sswitch_1f
        0x1ac165 -> :sswitch_13
        0x1ac169 -> :sswitch_27
        0x1ac187 -> :sswitch_22
        0x1ac188 -> :sswitch_7
        0x1ac1a4 -> :sswitch_1c
        0x1ac201 -> :sswitch_26
        0x1ac21f -> :sswitch_1d
        0x1ac244 -> :sswitch_18
        0x1ac262 -> :sswitch_e
        0x1ac50e -> :sswitch_a
        0x1ac529 -> :sswitch_24
        0x1ac566 -> :sswitch_28
        0x1ac623 -> :sswitch_d
        0x1ac8ef -> :sswitch_10
        0x1ac8f0 -> :sswitch_0
        0x1ac90b -> :sswitch_b
        0x1ac92e -> :sswitch_15
        0x1ac98a -> :sswitch_17
    .end sparse-switch
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 9

    const/high16 v8, 0x41f00000    # 30.0f

    const/4 v4, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06df\u06e5\u06e0"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v7

    move v3, v4

    move v0, v4

    move v1, v4

    move v5, v4

    move-object v6, v2

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v2, p0, Ljz;->a:Ljava/lang/String;

    sget v6, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v6, :cond_4

    const/16 v6, 0x40

    sput v6, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    const-string v6, "\u06e3\u06e0\u06e5"

    invoke-static {v6}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v7

    move-object v6, v2

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    move-result v2

    if-ltz v2, :cond_5

    const/16 v2, 0x53

    sput v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v2, "\u06e2\u06df\u06e4"

    invoke-static {v2}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_0
    :sswitch_2
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v2, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    const-string v2, "\u06e0\u06df\u06e2"

    invoke-static {v2}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_1
    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v7, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/2addr v2, v7

    const v7, 0x1abdc2

    add-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :sswitch_3
    const v2, 0x3f4ccccd    # 0.8f

    mul-float/2addr v2, v5

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v2, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    :goto_1
    const-string v2, "\u06e1\u06e8"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_2
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v7, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    add-int/2addr v2, v7

    const v7, 0x1abcbc

    add-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :sswitch_4
    iget v2, p0, Ljz;->c:F

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v3, :cond_3

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v3, "\u06e3\u06e7\u06e6"

    invoke-static {v3}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v7

    move v3, v2

    goto :goto_0

    :cond_3
    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v7, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/2addr v3, v7

    const v7, -0x1aa7ba

    xor-int/2addr v7, v3

    move v3, v2

    goto/16 :goto_0

    :cond_4
    sget v6, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v7, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v6, v7

    const v7, -0x1ac575

    xor-int/2addr v7, v6

    move-object v6, v2

    goto/16 :goto_0

    :sswitch_5
    iget v0, p0, Ljz;->d:F

    float-to-int v0, v0

    :goto_2
    return v0

    :sswitch_6
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/lit16 v0, v0, 0x2bc

    int-to-float v0, v0

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v2

    if-ltz v2, :cond_6

    const/16 v2, 0x8

    sput v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    :cond_5
    const-string v2, "\u06e2\u06e2\u06e3"

    invoke-static {v2}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_6
    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v7, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sub-int/2addr v2, v7

    const v7, -0x1ab7f4

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_7
    iget v2, p0, Ljz;->e:F

    mul-float v7, v3, v0

    sub-float/2addr v7, v8

    add-float/2addr v7, v1

    add-float/2addr v7, v8

    sub-float v7, v4, v7

    sub-float/2addr v2, v7

    iput v2, p0, Ljz;->d:F

    :goto_3
    const-string v2, "\u06e4\u06e1\u06e3"

    invoke-static {v2}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v7, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/lit16 v7, v7, -0x123f

    mul-int/2addr v2, v7

    if-eqz v2, :cond_7

    invoke-static {}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣۢ۠۠()I

    goto :goto_3

    :cond_7
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v7, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/2addr v2, v7

    const v7, 0x1aacc2

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_9
    const-string v2, "G7EF6kI=\n"

    const-string v7, "a9BshDb2g54=\n"

    invoke-static {v2, v7}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_a
    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v7, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/lit16 v7, v7, 0x1813

    xor-int/2addr v2, v7

    if-ltz v2, :cond_8

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v2, "\u06e8\u06e7\u06e6"

    :goto_4
    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06df\u06e5\u06e0"

    goto :goto_4

    :sswitch_b
    const/4 v0, 0x0

    goto :goto_2

    :sswitch_c
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v7, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/lit16 v7, v7, 0x1897

    add-int/2addr v2, v7

    if-ltz v2, :cond_9

    const-string v2, "\u06e7\u06e6\u06df"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_9
    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v7, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    add-int/2addr v2, v7

    const v7, 0x1acd90

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v5

    if-ltz v5, :cond_a

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v5, "\u06e8\u06e8\u06e5"

    invoke-static {v5}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v7

    move v5, v2

    goto/16 :goto_0

    :cond_a
    sget v5, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v7, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v5, v7

    const v7, 0x1acc6c

    add-int/2addr v7, v5

    move v5, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0x1aa7ba -> :sswitch_9
        0x1aa7fd -> :sswitch_7
        0x1aaba0 -> :sswitch_a
        0x1aaf81 -> :sswitch_6
        0x1ab247 -> :sswitch_4
        0x1ab2a3 -> :sswitch_5
        0x1ab628 -> :sswitch_2
        0x1ab702 -> :sswitch_8
        0x1aba06 -> :sswitch_1
        0x1abdc5 -> :sswitch_d
        0x1ac5e0 -> :sswitch_c
        0x1ac90e -> :sswitch_3
        0x1ac9e5 -> :sswitch_b
    .end sparse-switch
.end method
