.class public final Lwv;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    const-string v0, "XQVL8A==\n"

    const-string v1, "Kn0ilBVivwE=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "qTGYcA==\n"

    const-string v1, "x1D1FS4CizI=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06df\u06df"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "tf7w3OHki"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۢۧۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x46

    sput v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    const-string v0, "\u06e5\u06e4\u06e6"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1ab438

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    iput-object p1, p0, Lwv;->a:Ljava/lang/String;

    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    or-int/lit16 v2, v2, -0x8b8

    rem-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x24

    sput v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    const-string v0, "\u06e5\u06e3\u06e7"

    :goto_2
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06e4\u06e6"

    goto :goto_2

    :sswitch_2
    const-string v0, "\u06e0\u06df\u06df"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    :sswitch_3
    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۨۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e7\u06e0\u06e5"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e3\u06e7"

    goto :goto_3

    :sswitch_4
    iput-object p2, p0, Lwv;->b:Ljava/lang/String;

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    move-result v0

    if-gtz v0, :cond_4

    const/16 v0, 0x40

    sput v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v0, "\u06e8\u06df\u06e0"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e6\u06e8\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v0

    if-gtz v0, :cond_2

    sget v0, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v0, :cond_5

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v0, "\u06e6\u06e8\u06e7"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/2addr v0, v2

    const v2, -0xdc3a

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_6
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    const-string v0, "\u06e5\u06e3\u06e7"

    :goto_4
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :sswitch_7
    iput p3, p0, Lwv;->c:I

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_6

    const-string v0, "\u06e6\u06e8\u06e0"

    goto :goto_4

    :cond_6
    const-string v0, "\u06e8\u06df\u06e0"

    goto/16 :goto_1

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0x1aaac0 -> :sswitch_1
        0x1aaefe -> :sswitch_6
        0x1ab6fe -> :sswitch_2
        0x1abe09 -> :sswitch_8
        0x1abe27 -> :sswitch_4
        0x1ac25e -> :sswitch_7
        0x1ac265 -> :sswitch_3
        0x1ac8c9 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    const-string v3, "\u06e3\u06e6\u06e2"

    invoke-static {v3}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lwv;->a:Ljava/lang/String;

    iget-object v4, v3, Lwv;->a:Ljava/lang/String;

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "\u06e0\u06e6\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    if-ne p0, p1, :cond_3

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    xor-int/lit16 v4, v4, 0x2e3

    rem-int/2addr v0, v4

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v0, "\u06e2\u06e5\u06e7"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    mul-int/2addr v0, v4

    const v4, 0x1a547c

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e7"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e5\u06e3\u06e1"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    :sswitch_3
    const-string v0, "\u06e0\u06df\u06e7"

    goto :goto_1

    :sswitch_4
    instance-of v0, p1, Lwv;

    if-nez v0, :cond_7

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    :cond_4
    const-string v0, "\u06e2\u06e2\u06e6"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_5
    move v0, v1

    :goto_2
    return v0

    :sswitch_6
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/lit16 v4, v4, -0x1118

    xor-int/2addr v0, v4

    if-ltz v0, :cond_5

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v0, "\u06e6\u06e2\u06e3"

    goto :goto_1

    :cond_5
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/2addr v0, v4

    const v4, 0x1ab6df

    xor-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_7
    iget-object v0, p0, Lwv;->b:Ljava/lang/String;

    iget-object v4, v3, Lwv;->b:Ljava/lang/String;

    invoke-static {v0, v4}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v4, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v4, v4, 0x320

    mul-int/2addr v0, v4

    if-gtz v0, :cond_6

    const-string v0, "\u06df\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e6\u06e8\u06e1"

    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_8
    move v0, v2

    goto :goto_2

    :sswitch_9
    move v0, v2

    goto :goto_2

    :sswitch_a
    move v0, v1

    goto :goto_2

    :cond_7
    :sswitch_b
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    add-int/2addr v0, v4

    const v4, 0x1ab037

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :cond_8
    :sswitch_c
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    div-int/2addr v0, v4

    const v4, 0x1ac14b

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    move v0, v2

    goto :goto_2

    :sswitch_e
    move v0, v2

    goto :goto_2

    :cond_9
    :sswitch_f
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v0, v4

    const v4, 0x1575b3

    add-int/2addr v0, v4

    move v4, v0

    goto/16 :goto_0

    :sswitch_10
    iget v0, p0, Lwv;->c:I

    iget v4, v3, Lwv;->c:I

    if-eq v0, v4, :cond_9

    const-string v0, "\u06e6\u06e1\u06e2"

    goto/16 :goto_1

    :sswitch_11
    move-object v0, p1

    check-cast v0, Lwv;

    sget v3, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v3, :cond_a

    const/16 v3, 0x5a

    sput v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    const-string v3, "\u06e0\u06df\u06e7"

    invoke-static {v3}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v4

    move-object v3, v0

    goto/16 :goto_0

    :cond_a
    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    mul-int/2addr v3, v4

    add-int/lit16 v4, v3, 0x71f2

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc5e -> :sswitch_0
        0x1aa7d9 -> :sswitch_c
        0x1aaac8 -> :sswitch_4
        0x1aab9c -> :sswitch_8
        0x1ab243 -> :sswitch_5
        0x1ab2a6 -> :sswitch_d
        0x1ab2e5 -> :sswitch_11
        0x1ab304 -> :sswitch_3
        0x1ab6de -> :sswitch_b
        0x1ab6df -> :sswitch_1
        0x1aba07 -> :sswitch_f
        0x1abd8c -> :sswitch_a
        0x1abdc3 -> :sswitch_6
        0x1abe03 -> :sswitch_10
        0x1ac14e -> :sswitch_7
        0x1ac187 -> :sswitch_9
        0x1ac25f -> :sswitch_e
        0x1ac54c -> :sswitch_2
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 5

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06df\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move v1, v0

    move v2, v0

    move v3, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lwv;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x7

    return v0

    :sswitch_1
    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    move-result v0

    if-ltz v0, :cond_0

    const-string v0, "\u06e5\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v4, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/2addr v0, v4

    const v4, 0x1aa7ec

    add-int/2addr v0, v4

    move v4, v0

    goto :goto_0

    :sswitch_2
    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    xor-int/lit16 v0, v0, -0xb6

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/lit16 v4, v4, -0x1095

    mul-int/2addr v2, v4

    if-eqz v2, :cond_1

    const/16 v2, 0x48

    sput v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    const-string v2, "\u06e0\u06df\u06e8"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v4

    move v2, v0

    goto :goto_0

    :cond_1
    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v2, v4

    const v4, 0x1ab3ab

    add-int/2addr v4, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lwv;->b:Ljava/lang/String;

    mul-int v1, v3, v2

    invoke-static {v0, v1, v2}, Lg40;->e(Ljava/lang/String;II)I

    move-result v0

    const-string v1, "\u06df\u06e1\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v4

    move v1, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Lwv;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    or-int/lit16 v4, v4, 0x5c2

    add-int/2addr v0, v4

    if-gtz v0, :cond_2

    const/16 v0, 0x38

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v0, "\u06df\u06e1\u06e6"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e6\u06e5\u06e8"

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa744 -> :sswitch_0
        0x1aaac9 -> :sswitch_4
        0x1aab3e -> :sswitch_1
        0x1ab606 -> :sswitch_3
        0x1ac209 -> :sswitch_2
    .end sparse-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e1\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    or-int/lit16 v2, v2, 0x193e

    add-int/2addr v1, v2

    if-gtz v1, :cond_1

    invoke-static {}, Landroidx/startup/ۣۣۡ۟;->۠ۢۢۧ()I

    const-string v1, "\u06e1\u06e3\u06e7"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    rem-int/2addr v1, v2

    const v2, -0x1aaf03

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    iget-object v1, p0, Lwv;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v1, :cond_0

    :goto_1
    const-string v1, "\u06e5\u06e6\u06e5"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e2\u06e5\u06e4"

    :goto_2
    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sub-int/2addr v1, v2

    const v2, -0x1aaa19

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    or-int/lit16 v2, v2, -0x166e

    or-int/2addr v1, v2

    if-ltz v1, :cond_4

    const/16 v1, 0x4a

    sput v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v1, "\u06e0\u06e2\u06e4"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :sswitch_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContactItem(wxid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    mul-int/lit16 v2, v2, 0xa3a

    sub-int/2addr v1, v2

    if-ltz v1, :cond_3

    const/16 v1, 0x34

    sput v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    :cond_2
    const-string v1, "\u06e6\u06e4\u06e7"

    goto :goto_2

    :cond_3
    const-string v1, "\u06e5\u06e6\u06e6"

    goto :goto_2

    :sswitch_7
    iget v1, p0, Lwv;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    sget v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/lit16 v2, v2, -0x14db

    xor-int/2addr v1, v2

    if-ltz v1, :cond_5

    const/16 v1, 0x10

    sput v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    :cond_4
    const-string v1, "\u06e6\u06e8\u06e8"

    :goto_3
    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e7\u06e7"

    goto :goto_3

    :sswitch_8
    iget-object v1, p0, Lwv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    if-ltz v1, :cond_2

    const-string v1, "\u06e2\u06e5\u06e4"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdce0 -> :sswitch_0
        0x1aab22 -> :sswitch_3
        0x1aaf05 -> :sswitch_6
        0x1ab301 -> :sswitch_5
        0x1abe64 -> :sswitch_8
        0x1abe65 -> :sswitch_2
        0x1ac1a9 -> :sswitch_1
        0x1ac1e9 -> :sswitch_4
        0x1ac266 -> :sswitch_7
    .end sparse-switch
.end method
