.class public final Laa;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I

.field public final f:Ljava/lang/ClassLoader;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/io/Serializable;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lvd;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Laa;->e:I

    iput-object p1, p0, Laa;->h:Ljava/io/Serializable;

    iput-object p2, p0, Laa;->f:Ljava/lang/ClassLoader;

    iput-object p3, p0, Laa;->g:Ljava/lang/String;

    iput-object p4, p0, Laa;->i:Ljava/lang/Object;

    invoke-direct {p0, p5}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e1\u06df"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    invoke-static {}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۦۣ۠()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v1

    if-ltz v1, :cond_0

    const-string v1, "\u06e3\u06e3\u06e0"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/2addr v1, v2

    const v2, 0x1ab2d6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    const-string v0, "1QETwCuebDCJHEzI"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->ۣۣ۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "\u06e7\u06e8\u06e3"

    :goto_1
    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    or-int/lit16 v2, v2, 0x12b1

    xor-int/2addr v1, v2

    if-gtz v1, :cond_2

    invoke-static {}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۤ۟۠ۢ()I

    const-string v1, "\u06e6\u06e0\u06e5"

    invoke-static {v1}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/2addr v1, v2

    const v2, 0xdd2d

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    sget v1, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/lit16 v2, v2, 0xfb

    or-int/2addr v1, v2

    if-ltz v1, :cond_3

    const-string v1, "\u06e7\u06e1\u06df"

    goto :goto_1

    :cond_3
    const-string v1, "\u06e6\u06e3"

    goto :goto_1

    :sswitch_5
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    add-int/lit16 v2, v2, -0x202e

    div-int/2addr v1, v2

    if-eqz v1, :cond_4

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v1, "\u06e8\u06df\u06e7"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    add-int/2addr v1, v2

    const v2, 0x1ac00e

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcbd -> :sswitch_0
        0x1ab285 -> :sswitch_2
        0x1ab680 -> :sswitch_5
        0x1ab9eb -> :sswitch_3
        0x1ac545 -> :sswitch_1
        0x1ac622 -> :sswitch_4
    .end sparse-switch
.end method

.method public constructor <init>(Lp00;Ljava/lang/String;Ljava/lang/ClassLoader;Le30;Lvd;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Laa;->e:I

    iput-object p1, p0, Laa;->h:Ljava/io/Serializable;

    iput-object p2, p0, Laa;->g:Ljava/lang/String;

    iput-object p3, p0, Laa;->f:Ljava/lang/ClassLoader;

    iput-object p4, p0, Laa;->i:Ljava/lang/Object;

    invoke-direct {p0, p5}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e7\u06e4"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v2, v2, 0x646

    mul-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v1, "\u06e6\u06e8\u06e7"

    invoke-static {v1}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    const-string v0, "l1bnV7M40CnP0y"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۢۥۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۣۣ۟ۥ۟()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x3c

    sput v1, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    const-string v1, "\u06e1\u06df\u06e2"

    :goto_1
    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e5\u06e0\u06e4"

    goto :goto_1

    :cond_1
    :sswitch_2
    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    move-result v1

    if-ltz v1, :cond_2

    const/16 v1, 0x57

    sput v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v1, "\u06e1\u06e0"

    :goto_2
    invoke-static {v1}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/2addr v1, v2

    const v2, 0x1aae91

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/2addr v1, v2

    const v2, 0x1aaaea

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    const-string v1, "\u06e1\u06e3\u06e1"

    goto :goto_1

    :cond_3
    const-string v1, "\u06e7\u06df\u06e2"

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabbd -> :sswitch_0
        0x1aae84 -> :sswitch_3
        0x1aaeff -> :sswitch_5
        0x1abda9 -> :sswitch_4
        0x1ac265 -> :sswitch_2
        0x1ac50a -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e6\u06e8"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move-object v4, v0

    move-object v5, v0

    move-object v6, v0

    move v3, v2

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Laa;->h:Ljava/io/Serializable;

    check-cast v0, Ljava/util/LinkedHashSet;

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-ltz v1, :cond_0

    const/16 v1, 0x1c

    sput v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v1, "\u06e8\u06e2\u06e0"

    invoke-static {v1}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move v3, v2

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Laa;->h:Ljava/io/Serializable;

    check-cast v0, Lp00;

    sget v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v3, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab794

    add-int/2addr v2, v3

    move-object v6, v0

    move v3, v2

    goto :goto_0

    :sswitch_2
    new-instance v0, Laa;

    iget-object v2, p0, Laa;->f:Ljava/lang/ClassLoader;

    iget-object v3, p0, Laa;->g:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Laa;-><init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lvd;)V

    :goto_1
    return-object v0

    :cond_0
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    add-int/2addr v1, v2

    const v2, -0x1ac52a

    xor-int/2addr v2, v1

    move-object v1, v0

    move v3, v2

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Laa;->i:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v2

    if-gtz v2, :cond_1

    const-string v2, "\u06e5\u06e8\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    move v3, v2

    goto :goto_0

    :cond_1
    move-object v4, v0

    move-object v2, v5

    :goto_2
    const-string v0, "\u06e3\u06e0\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v2

    move v3, v0

    goto :goto_0

    :pswitch_0
    :sswitch_4
    sget v0, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/lit8 v2, v2, 0x49

    or-int/2addr v0, v2

    if-ltz v0, :cond_2

    const/16 v0, 0x3d

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v0, "\u06e4\u06e1\u06e4"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1aabb7

    xor-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :sswitch_5
    iget v0, p0, Laa;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_6
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    div-int/lit16 v2, v2, -0xa8

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e2\u06e0\u06e5"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    or-int/2addr v0, v2

    const v2, -0xde87

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_7
    iget-object v0, p0, Laa;->i:Ljava/lang/Object;

    check-cast v0, Le30;

    sget v2, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    div-int/lit16 v3, v3, 0x1f46

    xor-int/2addr v2, v3

    if-ltz v2, :cond_4

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-object v2, v0

    goto :goto_2

    :cond_4
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    mul-int/2addr v2, v3

    const v3, 0x1ad952

    xor-int/2addr v2, v3

    move-object v5, v0

    move v3, v2

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->۟ۢ۟ۥۣ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x9

    sput v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v0, "\u06e6\u06e6\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e6\u06e8"

    goto :goto_3

    :sswitch_9
    new-instance v0, Laa;

    iget-object v2, p0, Laa;->g:Ljava/lang/String;

    iget-object v3, p0, Laa;->f:Ljava/lang/ClassLoader;

    move-object v1, v6

    move-object v4, v5

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Laa;-><init>(Lp00;Ljava/lang/String;Ljava/lang/ClassLoader;Le30;Lvd;)V

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdc26 -> :sswitch_0
        0x1aab7f -> :sswitch_1
        0x1ab246 -> :sswitch_4
        0x1ab626 -> :sswitch_2
        0x1ab6dd -> :sswitch_7
        0x1aba62 -> :sswitch_8
        0x1abaa6 -> :sswitch_5
        0x1abea0 -> :sswitch_6
        0x1ac1c9 -> :sswitch_3
        0x1ac926 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    const/4 v4, 0x0

    const-string v1, "\u06e5\u06e5\u06e0"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    move-object v5, v0

    move-object v3, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v0, p2

    check-cast v0, Lvd;

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int/2addr v2, v5

    const v5, -0x1aef27

    xor-int/2addr v2, v5

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Lxh;->n:Lxh;

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    move-result v2

    if-ltz v2, :cond_0

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v2, "\u06df\u06e1\u06e4"

    :goto_1
    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto :goto_0

    :cond_0
    const-string v2, "\u06e2\u06e4\u06e4"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    iget v4, p0, Laa;->e:I

    const-string v2, "\u06e0\u06e8\u06e1"

    move-object v0, v3

    goto :goto_1

    :sswitch_3
    invoke-virtual {v1, v3}, Laa;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/2addr v0, v2

    const v2, 0x1ab7f3

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    packed-switch v4, :pswitch_data_0

    :sswitch_5
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/lit16 v2, v2, 0x172d

    add-int/2addr v0, v2

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    const-string v2, "\u06e4\u06e2\u06e1"

    move-object v0, v1

    :goto_2
    invoke-static {v2}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    move-object v0, p1

    check-cast v0, Lpe;

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v0, "\u06e2\u06e4\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    rem-int/2addr v0, v2

    const v2, -0x1aa748

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :pswitch_0
    :sswitch_7
    const-string v0, "\u06e7\u06e5\u06e4"

    :goto_3
    invoke-static {v0}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_8
    invoke-virtual {p0, v5}, Laa;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Laa;

    const-string v1, "\u06e6\u06e8\u06e7"

    move-object v2, v1

    goto :goto_2

    :cond_2
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    div-int/2addr v0, v2

    const v2, 0x1ac986

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/lit16 v2, v2, -0x1c14

    rem-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v0, "\u06e8\u06e4\u06e4"

    goto :goto_3

    :cond_3
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    div-int/2addr v0, v2

    const v2, 0x1abe40

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p0, v5}, Laa;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Laa;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Laa;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :sswitch_b
    return-object v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa725 -> :sswitch_0
        0x1aa742 -> :sswitch_9
        0x1aa760 -> :sswitch_5
        0x1aabd9 -> :sswitch_6
        0x1ab2e2 -> :sswitch_3
        0x1ab6bd -> :sswitch_4
        0x1ab722 -> :sswitch_b
        0x1abe40 -> :sswitch_2
        0x1ac265 -> :sswitch_1
        0x1ac5c6 -> :sswitch_8
        0x1ac8f0 -> :sswitch_7
        0x1ac986 -> :sswitch_a
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/16 v19, 0x0

    const/16 v18, 0x0

    const-string v20, "\u06e1\u06e7\u06e8"

    invoke-static/range {v20 .. v20}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v25

    move-object/from16 v20, v3

    move-object/from16 v21, v8

    move-object/from16 v22, v12

    :goto_0
    sparse-switch v25, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v3

    if-ltz v3, :cond_6

    const-string v3, "\u06e4\u06e5\u06e8"

    invoke-static {v3}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto :goto_0

    :sswitch_1
    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/lit16 v8, v8, 0x19d2

    add-int/2addr v3, v8

    if-gtz v3, :cond_0

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v3, "\u06e1\u06e6\u06e4"

    :goto_1
    invoke-static {v3}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto :goto_0

    :cond_0
    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v8, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/2addr v3, v8

    const v8, 0x175bb3

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto :goto_0

    :sswitch_2
    new-instance v8, Lf;

    const/4 v11, 0x1

    move-object v3, v4

    check-cast v3, Le30;

    invoke-direct {v8, v11, v3}, Lf;-><init>(ILjava/lang/Object;)V

    const-string v3, "JN/McQ==\n"

    const-string v11, "U6elFQh5caA=\n"

    const-string v12, "mgk2UX2duduwBQ==\n"

    const-string v25, "+WFXJQ/y1rY=\n"

    move-object/from16 v0, v25

    invoke-static {v3, v11, v7, v12, v0}, Lg40;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "SuBBbioO\n"

    const-string v11, "Jo8gCk98nAk=\n"

    invoke-static {v3, v11}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v13}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v11, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    div-int/lit16 v11, v11, -0x2ff

    sub-int/2addr v3, v11

    if-gtz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    const-string v3, "\u06e5\u06e5"

    invoke-static {v3}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v11, v8

    move/from16 v25, v3

    goto :goto_0

    :cond_1
    const-string v11, "\u06df\u06e5\u06e6"

    move-object v3, v8

    move-object v12, v11

    :goto_2
    invoke-static {v12}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v8

    move-object v11, v3

    move/from16 v25, v8

    goto :goto_0

    :sswitch_3
    move-object v3, v4

    check-cast v3, Landroid/content/Context;

    move-object/from16 v0, v20

    invoke-static {v13, v14, v0, v3}, Lbw;->e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    const-string v3, "sijyBSI3Xw==\n"

    const-string v8, "4X2xRmdkDF0=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    sget v3, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v8

    if-gtz v8, :cond_2

    const/16 v8, 0x10

    sput v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    :cond_2
    const-string v8, "\u06e5\u06e7\u06df"

    invoke-static {v8}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v24, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_3
    :sswitch_4
    sget v3, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v8, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    or-int/lit16 v8, v8, 0x14b

    div-int/2addr v3, v8

    if-eqz v3, :cond_4

    const/16 v3, 0x21

    sput v3, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v8, "\u06df\u06e2\u06e5"

    move-object v3, v7

    :goto_3
    invoke-static {v8}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e6\u06e0\u06e5"

    invoke-static {v3}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :catch_0
    move-exception v3

    const-string v3, "\u06df\u06e3\u06e6"

    :goto_4
    invoke-static {v3}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_5
    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v3, :cond_5

    const/16 v3, 0x24

    sput v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v3, "\u06e5\u06df\u06e4"

    invoke-static {v3}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_5
    sget v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v8, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v3, v8

    const v8, -0x1ac157

    xor-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e6\u06e3\u06e6"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_6
    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v8, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    or-int/lit16 v8, v8, 0x1c51

    xor-int/2addr v3, v8

    if-ltz v3, :cond_7

    const/16 v3, 0x4b

    sput v3, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v8, "\u06e3\u06e8\u06e1"

    move-object v3, v9

    :goto_5
    invoke-static {v8}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v9, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v8, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    or-int/2addr v3, v8

    const v8, 0x1ac2b0

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_7
    const-string v12, ""

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    mul-int/lit16 v8, v8, -0xeba

    rem-int/2addr v3, v8

    if-gtz v3, :cond_8

    invoke-static {}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۡۢۨۥ()I

    const-string v3, "\u06e4\u06e5"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object v15, v12

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06e2\u06e3\u06e8"

    move-object v3, v14

    :goto_6
    invoke-static {v8}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v14, v3

    move-object v15, v12

    move/from16 v25, v8

    goto/16 :goto_0

    :sswitch_8
    :try_start_0
    move-object/from16 v0, v21

    invoke-static {v13, v0}, Lbw;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v3, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    if-gtz v3, :cond_9

    const/16 v3, 0x58

    sput v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v8, "\u06e2\u06e1\u06e7"

    move-object v3, v11

    move-object v12, v8

    goto/16 :goto_2

    :cond_9
    const-string v3, "\u06e7\u06e7\u06df"

    invoke-static {v3}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_9
    :try_start_1
    sget v3, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v3, v3, -0x187

    aput-object v7, v22, v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    sget v3, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v8, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/lit16 v8, v8, 0x1995

    xor-int/2addr v3, v8

    if-gtz v3, :cond_a

    invoke-static {}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟۠ۢۧۡ()I

    const-string v3, "\u06e5\u06e0\u06df"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e5\u06e0\u06e0"

    goto/16 :goto_4

    :sswitch_a
    if-nez v21, :cond_14

    sget v3, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v8, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    rem-int/lit16 v8, v8, 0x1d14

    add-int/2addr v3, v8

    if-ltz v3, :cond_b

    invoke-static {}, Lcom/google/android/material/button/ۥۤ۠;->۠۠ۨۢ()I

    const-string v3, "\u06e4\u06e1\u06e7"

    invoke-static {v3}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_b
    sget v3, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v8, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    rem-int/2addr v3, v8

    const v8, -0x1aae8c

    xor-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    move-result v3

    if-gtz v3, :cond_d

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-object v3, v13

    :cond_c
    const-string v8, "\u06e2\u06e6\u06e4"

    invoke-static {v8}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_d
    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v8, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    mul-int/2addr v3, v8

    const v8, 0x1ba2a0

    xor-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iget-object v3, v0, Laa;->f:Ljava/lang/ClassLoader;

    move-object/from16 v0, p0

    iget-object v5, v0, Laa;->h:Ljava/io/Serializable;

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v8

    if-ltz v8, :cond_c

    const-string v8, "\u06e3\u06e1\u06e7"

    invoke-static {v8}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v8

    move-object v13, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p0

    iget v8, v0, Laa;->e:I

    move-object/from16 v0, p0

    iget-object v4, v0, Laa;->i:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v3, v0, Laa;->g:Ljava/lang/String;

    sget v12, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v20, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    mul-int v12, v12, v20

    const v20, 0x1af2c6

    xor-int v12, v12, v20

    move-object/from16 v20, v3

    move/from16 v23, v8

    move/from16 v25, v12

    goto/16 :goto_0

    :sswitch_e
    packed-switch v23, :pswitch_data_0

    :sswitch_f
    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sub-int/2addr v3, v8

    const v8, 0x1abbba

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_10
    const/4 v3, 0x2

    :try_start_2
    new-array v3, v3, [Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v8, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v12, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    xor-int/lit16 v12, v12, -0x24b

    xor-int/2addr v8, v12

    if-ltz v8, :cond_e

    invoke-static {}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->۟۠ۢۢ۠()I

    const-string v8, "\u06e8\u06e4\u06e0"

    invoke-static {v8}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v22, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_e
    sget v8, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v12, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sub-int/2addr v8, v12

    const v12, 0x1ab485

    xor-int/2addr v8, v12

    move-object/from16 v22, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :sswitch_11
    :try_start_3
    sget v3, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v3, v3, -0x36d

    aput-object v20, v22, v3

    move-object/from16 v0, v16

    move-object/from16 v1, v22

    invoke-static {v0, v1}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v3

    sget v8, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v12, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    or-int/2addr v8, v12

    const v12, -0x1ac7a8

    xor-int/2addr v8, v12

    move-object/from16 v21, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_f
    :sswitch_12
    invoke-static {}, Landroidx/activity/result/۟ۡۤۦۡ;->۟۟۟ۥۤ()I

    move-result v3

    if-gtz v3, :cond_10

    const-string v3, "\u06df\u06e2"

    invoke-static {v3}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u06e4\u06e1\u06e8"

    goto/16 :goto_1

    :pswitch_0
    :sswitch_13
    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v8, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    xor-int/2addr v3, v8

    const v8, 0x1aa8f6

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_14
    sget v3, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v8, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    or-int/lit16 v8, v8, 0x1484

    add-int/2addr v3, v8

    if-ltz v3, :cond_11

    const-string v3, "\u06e6\u06e3\u06df"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    move/from16 v17, v10

    goto/16 :goto_0

    :cond_11
    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v8, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/2addr v3, v8

    const v8, 0x1ac916

    add-int/2addr v3, v8

    move/from16 v25, v3

    move/from16 v17, v10

    goto/16 :goto_0

    :sswitch_15
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    move-object v3, v5

    check-cast v3, Ljava/util/LinkedHashSet;

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v10, 0x0

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v9, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    rem-int/lit16 v9, v9, 0x35a

    xor-int/2addr v8, v9

    if-gtz v8, :cond_12

    invoke-static {}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۟ۢۢ()I

    const-string v8, "\u06df\u06e4\u06e5"

    invoke-static {v8}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v9, v3

    move/from16 v25, v8

    goto/16 :goto_0

    :cond_12
    const-string v8, "\u06e2\u06e8\u06e1"

    goto/16 :goto_5

    :cond_13
    :sswitch_16
    const-string v3, "\u06e4\u06e5"

    goto/16 :goto_1

    :sswitch_17
    sget-object v3, Lxh;->n:Lxh;

    :goto_7
    return-object v3

    :cond_14
    :sswitch_18
    const-string v3, "\u06e2\u06e1\u06e7"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_19
    new-instance v3, Lsx;

    new-instance v4, Ljava/lang/Integer;

    move/from16 v0, v17

    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v3, v4, v15}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_7

    :sswitch_1a
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v8, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    xor-int/2addr v3, v8

    const v8, 0x1ac7e4

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_1b
    :try_start_4
    sget-object v3, Lub0;->j:Ljava/lang/String;

    invoke-static {v3, v13}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-object v3

    move/from16 v8, v17

    :goto_8
    const-string v12, "\u06df\u06df\u06e4"

    invoke-static {v12}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v12

    move-object/from16 v16, v3

    move/from16 v25, v12

    move/from16 v17, v8

    goto/16 :goto_0

    :sswitch_1c
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v3

    if-ltz v3, :cond_15

    const/16 v3, 0x4a

    sput v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v3, "\u06e5\u06e0\u06e0"

    move-object v15, v6

    goto/16 :goto_4

    :cond_15
    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v8, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sub-int/2addr v3, v8

    const v8, 0x1ac19e

    xor-int/2addr v3, v8

    move-object v15, v6

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_1d
    :try_start_5
    move-object/from16 v0, v19

    move-object/from16 v1, v21

    move-object/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    sget v3, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v8, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    xor-int/lit16 v8, v8, -0xf4e

    or-int/2addr v3, v8

    if-ltz v3, :cond_16

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    const-string v3, "\u06e6\u06e0\u06e5"

    invoke-static {v3}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u06e4\u06e2\u06e1"

    invoke-static {v3}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_1e
    if-nez v16, :cond_13

    sget v3, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v8, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sub-int/2addr v3, v8

    const v8, 0xdade

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_1f
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v8, Lbw;->a:Landroid/os/Handler;

    const-string v8, "\u06e5\u06e1\u06df"

    move-object v12, v15

    goto/16 :goto_6

    :sswitch_20
    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v8, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    or-int/lit16 v8, v8, -0x263e

    sub-int/2addr v3, v8

    if-gtz v3, :cond_17

    const/16 v3, 0x16

    sput v3, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    const-string v3, "\u06e2\u06e5\u06e3"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_17
    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v8, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    add-int/2addr v3, v8

    const v8, 0xe016

    add-int/2addr v3, v8

    move/from16 v25, v3

    goto/16 :goto_0

    :sswitch_21
    const-string v3, "DssGb9/srO0=\n"

    const-string v8, "YaVUCqyZwJk=\n"

    invoke-static {v3, v8}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    if-ltz v3, :cond_18

    const-string v3, "\u06e8\u06df\u06df"

    invoke-static {v3}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_18
    const-string v3, "\u06e5\u06e5"

    goto/16 :goto_4

    :sswitch_22
    new-instance v3, Ljava/lang/Integer;

    move/from16 v0, v17

    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    move/from16 v0, v24

    xor-int/lit16 v3, v0, -0x1fa

    add-int v8, v17, v3

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v12, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/lit16 v12, v12, 0x69c

    sub-int/2addr v3, v12

    if-ltz v3, :cond_19

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-object/from16 v3, v16

    goto/16 :goto_8

    :cond_19
    sget v3, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v12, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    add-int/2addr v3, v12

    const v12, 0xe0ea

    add-int/2addr v3, v12

    move/from16 v25, v3

    move/from16 v17, v8

    goto/16 :goto_0

    :sswitch_23
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v3, Liz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v3, v5

    check-cast v3, Lp00;

    iget-object v3, v3, Lp00;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    sget v7, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    sget v8, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    rem-int/lit16 v8, v8, -0x1bdb

    or-int/2addr v7, v8

    if-ltz v7, :cond_1a

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-object/from16 v8, v18

    move-object/from16 v12, v19

    :goto_9
    const-string v7, "\u06e5\u06df\u06e7"

    invoke-static {v7}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v25

    move-object v7, v3

    move-object/from16 v18, v8

    move-object/from16 v19, v12

    goto/16 :goto_0

    :cond_1a
    const-string v7, "\u06e3\u06e2\u06e2"

    move-object v8, v7

    goto/16 :goto_3

    :sswitch_24
    :try_start_6
    sget-object v12, Liz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v8, Lsx;

    invoke-direct {v8, v7, v11}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    sget v3, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    if-ltz v3, :cond_1b

    const/16 v3, 0x45

    sput v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    const-string v3, "\u06e5\u06e8\u06df"

    invoke-static {v3}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v18, v8

    move-object/from16 v19, v12

    move/from16 v25, v3

    goto/16 :goto_0

    :cond_1b
    move-object v3, v7

    goto :goto_9

    :sswitch_25
    const-string v3, "\u06e0\u06e6\u06e2"

    invoke-static {v3}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v3

    move/from16 v25, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc5c -> :sswitch_0
        0xdc81 -> :sswitch_10
        0xdca0 -> :sswitch_1b
        0xdcfc -> :sswitch_25
        0x1aa704 -> :sswitch_1e
        0x1aa77c -> :sswitch_1a
        0x1aa780 -> :sswitch_c
        0x1aa782 -> :sswitch_6
        0x1aa7a0 -> :sswitch_1a
        0x1aa7c0 -> :sswitch_21
        0x1aab82 -> :sswitch_23
        0x1aab9c -> :sswitch_6
        0x1aaf82 -> :sswitch_d
        0x1aafa1 -> :sswitch_5
        0x1ab288 -> :sswitch_24
        0x1ab2c7 -> :sswitch_14
        0x1ab320 -> :sswitch_e
        0x1ab35b -> :sswitch_7
        0x1ab649 -> :sswitch_6
        0x1ab663 -> :sswitch_2
        0x1ab702 -> :sswitch_9
        0x1aba0a -> :sswitch_f
        0x1aba0b -> :sswitch_1c
        0x1aba23 -> :sswitch_8
        0x1aba87 -> :sswitch_15
        0x1abaa0 -> :sswitch_1
        0x1abd8a -> :sswitch_12
        0x1abd8d -> :sswitch_1d
        0x1abda4 -> :sswitch_18
        0x1abda5 -> :sswitch_11
        0x1abdc3 -> :sswitch_3
        0x1abe45 -> :sswitch_20
        0x1abe7d -> :sswitch_22
        0x1abe9c -> :sswitch_16
        0x1ac14b -> :sswitch_6
        0x1ac16b -> :sswitch_19
        0x1ac1c2 -> :sswitch_b
        0x1ac1c9 -> :sswitch_1a
        0x1ac5a2 -> :sswitch_a
        0x1ac5ff -> :sswitch_17
        0x1ac8c8 -> :sswitch_1f
        0x1ac964 -> :sswitch_13
        0x1ac9c0 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
