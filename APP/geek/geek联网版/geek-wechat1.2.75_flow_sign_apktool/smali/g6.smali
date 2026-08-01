.class public final Lg6;
.super Landroid/view/ViewOutlineProvider;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 3

    iput p1, p0, Lg6;->a:I

    iput-object p2, p0, Lg6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e6\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v0

    if-ltz v0, :cond_0

    const/16 v0, 0x24

    sput v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    const-string v0, "\u06e2\u06e0\u06df"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/2addr v0, v2

    const v2, -0x1aaa9b

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/lit16 v2, v2, 0x1a1

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۠۟ۥۧ()I

    const-string v0, "\u06e1\u06e4\u06df"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v0, v2

    const v2, 0x1aa9b8

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_2
    :sswitch_3
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit16 v2, v2, 0x2073

    sub-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    const-string v0, "\u06e3\u06e0\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e0\u06e8"

    goto :goto_1

    :sswitch_4
    const-string v0, "qFPhlrS1C6a9G8O"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->ۣ۟ۨۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v0, :cond_4

    const-string v0, "\u06e4\u06e5\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e1\u06e1\u06e8"

    goto :goto_2

    :sswitch_5
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e2\u06e0\u06df"

    invoke-static {v0}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaae8 -> :sswitch_0
        0x1aaba1 -> :sswitch_5
        0x1aaec8 -> :sswitch_1
        0x1ab261 -> :sswitch_4
        0x1aba84 -> :sswitch_3
        0x1abe06 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 13

    const/4 v0, 0x0

    const/16 v12, 0x43

    const/4 v1, 0x0

    const-string v2, "\u06e7\u06e2\u06e3"

    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move-object v9, v0

    move v10, v1

    move v7, v1

    move v8, v1

    move v11, v1

    move v4, v2

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :pswitch_0
    :sswitch_0
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v2, v2, 0x1942

    rem-int/2addr v0, v2

    if-gtz v0, :cond_10

    const-string v0, "\u06df\u06e8\u06e2"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "Ny3EtA==\n"

    const-string v2, "QUShw2rQyxE=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "4m+r2amyag==\n"

    const-string v2, "jRrftcDcDzw=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e2\u06e6\u06e4"

    :goto_1
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lg6;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit16 v2, v2, 0x19c

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x54

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    const-string v0, "\u06e3\u06e0\u06df"

    :goto_2
    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e0"

    goto :goto_2

    :sswitch_4
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v0

    if-ltz v0, :cond_15

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    mul-int/2addr v0, v2

    const v2, 0x1953a3

    xor-int/2addr v0, v2

    move v4, v0

    goto :goto_0

    :pswitch_1
    :sswitch_5
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    if-gtz v0, :cond_1

    const/16 v0, 0x3b

    sput v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    const-string v0, "\u06e6\u06e3\u06e8"

    move v2, v7

    move v3, v8

    :goto_3
    invoke-static {v0}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v7, v2

    move v8, v3

    move v4, v0

    goto/16 :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    mul-int/2addr v0, v2

    const v2, 0x152bb3

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual {v6, p2}, Lsa;->getOutline(Landroid/graphics/Outline;)V

    const-string v0, "\u06e8\u06e6\u06e8"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_7
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/lit16 v0, v0, -0x9f

    invoke-static {v0}, Lmp;->q(I)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x0

    sub-int/2addr v0, v10

    rsub-int/lit8 v4, v0, 0x0

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    move v3, v11

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v0, :cond_2

    :cond_2
    const-string v0, "\u06e5\u06e5\u06e6"

    invoke-static {v0}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/lit8 v2, v2, -0x75

    sub-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e3\u06e8\u06df"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab360

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_9
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    invoke-static {}, Landroid/window/۟ۤ۟ۡۧ;->ۢۦۣۨ()I

    move-result v0

    if-gtz v0, :cond_4

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v0, "\u06e4\u06e1\u06e3"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e2\u06e8\u06e8"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "Os5CMA==\n"

    const-string v2, "TKcnR1GSRUc=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "05ipJX4Cxw==\n"

    const-string v2, "vO3dSRdsos8=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e3\u06e5\u06e8"

    goto/16 :goto_2

    :sswitch_b
    const-string v0, "LXxf"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۢۧۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u06e8\u06e4\u06e0"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v0

    move v4, v2

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    xor-int/lit16 v2, v2, -0x1a43

    or-int/2addr v0, v2

    if-ltz v0, :cond_5

    const/16 v0, 0x27

    sput v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    const-string v0, "\u06e8\u06e6\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e6\u06e1"

    :goto_4
    invoke-static {v0}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v4, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v4, v4, 0x1b15

    or-int/2addr v0, v4

    if-ltz v0, :cond_6

    const/4 v0, 0x2

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06e4\u06e6\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v7, v2

    move v8, v3

    move v4, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06df\u06e2\u06e6"

    goto/16 :goto_3

    :sswitch_e
    move-object v0, v6

    :cond_7
    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v2

    if-ltz v2, :cond_8

    const/16 v2, 0x31

    sput v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    const-string v2, "\u06df\u06e0\u06e0"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v4, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/2addr v2, v3

    const v3, -0x1aaf43

    xor-int/2addr v2, v3

    move-object v6, v0

    move v4, v2

    goto/16 :goto_0

    :pswitch_2
    :sswitch_f
    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v2, v2, -0x15f3

    add-int/2addr v0, v2

    if-ltz v0, :cond_9

    const-string v0, "\u06df\u06df\u06df"

    :goto_5
    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_9
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    xor-int/2addr v0, v2

    const v2, -0x1abbc2

    xor-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/graphics/Outline;->setAlpha(F)V

    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac26d

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_11
    const-string v0, "eJN9tQ==\n"

    const-string v2, "DvoYwnBA6kY=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "GojeMP8ioQ==\n"

    const-string v2, "df2qXJZMxMw=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aae8b

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_12
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/lit16 v0, v0, -0xa0

    invoke-static {v0}, Lmp;->q(I)I

    move-result v0

    rsub-int/lit8 v2, v8, 0x0

    sub-int v4, v0, v2

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    move v3, v7

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/lit16 v2, v2, 0x223

    or-int/2addr v0, v2

    if-gtz v0, :cond_a

    const/16 v0, 0x57

    sput v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    const-string v0, "\u06df\u06e5\u06e0"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    mul-int/2addr v0, v2

    const v2, 0x16234e

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_13
    const-string v0, "UE2dLw==\n"

    const-string v2, "JiT4WFdt5aU=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "j/aNbdHtLA==\n"

    const-string v2, "4IP5AbiDSfs=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v0, :cond_b

    sput v12, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    const-string v0, "\u06e8\u06e3\u06e8"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v0, v2

    const v2, -0x1aab34

    xor-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_14
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    xor-int/lit16 v2, v2, 0x1cf6

    add-int/2addr v0, v2

    if-ltz v0, :cond_d

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    :cond_c
    const-string v0, "\u06e7\u06e1\u06e5"

    goto/16 :goto_4

    :cond_d
    const-string v0, "\u06e0\u06e3\u06e4"

    goto/16 :goto_1

    :sswitch_15
    const-string v0, "md5J2Q==\n"

    const-string v2, "77csrr6ZsaU=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "4wyU4UpoNw==\n"

    const-string v2, "jHngjSMGUuw=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۡۥ()I

    move-result v0

    if-gtz v0, :cond_c

    const/16 v0, 0x50

    sput v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v0, "\u06e2\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :pswitch_3
    :sswitch_16
    sget v0, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    or-int/lit16 v2, v2, -0x1ff4

    sub-int/2addr v0, v2

    if-gtz v0, :cond_e

    const-string v0, "\u06e8\u06e1\u06e8"

    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_e
    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    rem-int/2addr v0, v2

    const v2, 0x1ac975    # 2.459992E-39f

    xor-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :pswitch_4
    :sswitch_17
    const-string v0, "\u06e4\u06df\u06e1"

    goto/16 :goto_5

    :pswitch_5
    :sswitch_18
    sget v0, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab8d2

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_19
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    mul-int/lit16 v2, v2, 0x1202

    sub-int/2addr v0, v2

    if-gtz v0, :cond_f

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v0, "\u06e2\u06e2\u06e6"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_f
    const-string v0, "\u06df\u06e7\u06df"

    move v2, v7

    move v3, v8

    goto/16 :goto_3

    :cond_10
    const-string v0, "\u06e5\u06e5\u06e0"

    goto/16 :goto_1

    :sswitch_1a
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    sget v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v4, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    div-int/lit16 v4, v4, 0x1b0

    xor-int/2addr v3, v4

    if-ltz v3, :cond_11

    sput v12, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v3, "\u06e3\u06e1\u06e8"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move v10, v0

    move v11, v2

    move v4, v3

    goto/16 :goto_0

    :cond_11
    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v4, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v3, v4

    const v4, 0x1aa77c

    add-int/2addr v3, v4

    move v10, v0

    move v11, v2

    move v4, v3

    goto/16 :goto_0

    :sswitch_1b
    const-string v0, "ZpNghQ==\n"

    const-string v2, "EPoF8pFyfTQ=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "WRt9QKbxSg==\n"

    const-string v2, "Nm4JLM+fL1Y=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    rem-int/lit16 v2, v2, 0xcf9

    mul-int/2addr v0, v2

    if-gtz v0, :cond_13

    :cond_12
    const-string v0, "\u06e3\u06e1\u06e7"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_13
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    div-int/2addr v0, v2

    const v2, 0x1aba02

    add-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_1c
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lsn;

    iget v5, v0, Lsn;->j:F

    move-object v0, p2

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_12

    const-string v0, "\u06e3\u06e8\u06e4"

    invoke-static {v0}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_1d
    const-string v0, "v0tH3g==\n"

    const-string v2, "ySIiqRnk+mI=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "W0Y5RvO74A==\n"

    const-string v2, "NDNNKprVhQc=\n"

    invoke-static {v0, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    add-int/lit16 v2, v2, -0x1884

    sub-int/2addr v0, v2

    if-gtz v0, :cond_14

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_14
    const-string v0, "\u06df\u06e5\u06e0"

    :goto_6
    invoke-static {v0}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_15
    :sswitch_1e
    sget v0, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    if-ltz v0, :cond_16

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v0, "\u06e4\u06e8\u06e5"

    goto/16 :goto_1

    :cond_16
    const-string v0, "\u06e2\u06e8\u06e8"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :sswitch_1f
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v0

    if-ltz v0, :cond_17

    const-string v0, "\u06e4\u06e5\u06e4"

    goto :goto_6

    :cond_17
    const-string v0, "\u06e6\u06df\u06e7"

    goto :goto_6

    :sswitch_20
    iget-object v0, p0, Lg6;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/chip/Chip;

    iget-object v0, v0, Lcom/google/android/material/chip/Chip;->e:Lsa;

    if-eqz v0, :cond_7

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v3, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    xor-int/lit16 v3, v3, -0x1eda

    add-int/2addr v2, v3

    if-gtz v2, :cond_18

    const-string v2, "\u06e4\u06e7\u06e7"

    invoke-static {v2}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move v4, v2

    goto/16 :goto_0

    :cond_18
    sget v2, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sub-int/2addr v2, v3

    const v3, 0x1ab941

    add-int/2addr v2, v3

    move-object v6, v0

    move v4, v2

    goto/16 :goto_0

    :sswitch_21
    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    xor-int/lit16 v2, v2, 0x1d38

    or-int/2addr v0, v2

    if-ltz v0, :cond_19

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e7\u06e5\u06e4"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_19
    const-string v0, "\u06e7\u06e2\u06e3"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :pswitch_6
    :sswitch_22
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    rem-int/lit16 v2, v2, 0x1c68

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1a

    const-string v0, "\u06e0\u06e1\u06e1"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto/16 :goto_0

    :cond_1a
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    sub-int/2addr v0, v2

    const v2, -0x1ac9ac

    xor-int/2addr v0, v2

    move v4, v0

    goto/16 :goto_0

    :sswitch_23
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0xdc7c -> :sswitch_20
        0xdcbb -> :sswitch_23
        0x1aa763 -> :sswitch_12
        0x1aa77c -> :sswitch_7
        0x1aa7ba -> :sswitch_d
        0x1aa7f7 -> :sswitch_1f
        0x1aa7fb -> :sswitch_b
        0x1aab41 -> :sswitch_23
        0x1aab9d -> :sswitch_14
        0x1aae89 -> :sswitch_8
        0x1aaf42 -> :sswitch_10
        0x1ab280 -> :sswitch_17
        0x1ab2a6 -> :sswitch_23
        0x1ab2c5 -> :sswitch_e
        0x1ab320 -> :sswitch_c
        0x1ab33e -> :sswitch_16
        0x1ab362 -> :sswitch_23
        0x1ab649 -> :sswitch_23
        0x1ab64a -> :sswitch_f
        0x1ab686 -> :sswitch_6
        0x1ab6c1 -> :sswitch_23
        0x1ab6c6 -> :sswitch_1a
        0x1ab71a -> :sswitch_1d
        0x1ab71f -> :sswitch_a
        0x1ab9c6 -> :sswitch_11
        0x1ab9cd -> :sswitch_1f
        0x1aba06 -> :sswitch_1c
        0x1aba26 -> :sswitch_1e
        0x1abaa4 -> :sswitch_1
        0x1abac4 -> :sswitch_5
        0x1abe40 -> :sswitch_13
        0x1abe46 -> :sswitch_23
        0x1ac14e -> :sswitch_23
        0x1ac16e -> :sswitch_22
        0x1ac21f -> :sswitch_3
        0x1ac50c -> :sswitch_18
        0x1ac54b -> :sswitch_4
        0x1ac568 -> :sswitch_2
        0x1ac5a8 -> :sswitch_21
        0x1ac928 -> :sswitch_15
        0x1ac94d -> :sswitch_1b
        0x1ac964 -> :sswitch_9
        0x1ac9aa -> :sswitch_19
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_6
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_5
    .end packed-switch
.end method
