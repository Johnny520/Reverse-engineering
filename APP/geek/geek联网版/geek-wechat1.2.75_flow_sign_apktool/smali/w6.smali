.class public final synthetic Lw6;
.super Ljava/lang/Object;

# interfaces
.implements Lum;


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Landroid/widget/LinearLayout;

.field public final d:Landroid/app/Activity;

.field public final e:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e4\u06e2\u06e4"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/lit16 v2, v2, 0x257a

    rem-int/2addr v0, v2

    if-ltz v0, :cond_6

    const/16 v0, 0x54

    sput v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    const-string v0, "\u06e5\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p2, p0, Lw6;->b:Landroid/widget/FrameLayout;

    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    add-int/lit16 v2, v2, -0x771

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    :cond_0
    const-string v0, "\u06e0\u06e0\u06e0"

    :goto_2
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e2\u06e6\u06e1"

    goto :goto_1

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(F)V

    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x61

    sput v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    const-string v0, "\u06e2\u06e6\u06e1"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v2, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    rem-int/2addr v0, v2

    const v2, -0x1ab6ce

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "Dmhe"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->ۣۣ۟ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    xor-int/lit16 v2, v2, 0x18b

    or-int/2addr v1, v2

    if-gtz v1, :cond_7

    const-string v1, "\u06e3\u06e6"

    invoke-static {v1}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto :goto_0

    :cond_3
    :sswitch_4
    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v0, "\u06e1\u06e7\u06e5"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e3\u06e3\u06e6"

    goto :goto_3

    :sswitch_5
    iput-object p3, p0, Lw6;->c:Landroid/widget/LinearLayout;

    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    rem-int/lit16 v2, v2, 0x421

    sub-int/2addr v0, v2

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۧۡ۠۠;->ۥۧۡۦ()I

    const-string v0, "\u06e0\u06e2"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e6"

    goto :goto_2

    :sswitch_6
    invoke-static {}, Landroid/app/۟ۡۧۦۡ;->ۥۣۨۧ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    add-int/lit16 v2, v2, 0x1db0

    rem-int/2addr v0, v2

    if-gtz v0, :cond_9

    const-string v0, "\u06e3\u06e3\u06e6"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    xor-int/2addr v0, v2

    const v2, 0x1abe08

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    iput-object p1, p0, Lw6;->a:Landroid/view/ViewGroup;

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    mul-int/lit16 v2, v2, 0x56a

    xor-int/2addr v0, v2

    if-ltz v0, :cond_8

    const/16 v0, 0xf

    sput v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    move v0, v1

    :cond_7
    const-string v1, "\u06e2\u06e6\u06e2"

    invoke-static {v1}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    goto/16 :goto_0

    :cond_8
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    mul-int/2addr v0, v2

    const v2, -0x1a3844

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    iput-object p5, p0, Lw6;->e:Landroid/widget/TextView;

    const-string v0, "\u06e4\u06e0\u06e8"

    goto :goto_3

    :sswitch_9
    iput-object p4, p0, Lw6;->d:Landroid/app/Activity;

    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v2, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    div-int/lit16 v2, v2, -0xb44

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۧۡۥۦ()I

    :cond_9
    const-string v0, "\u06df\u06e0\u06e4"

    invoke-static {v0}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_0
        0xdc63 -> :sswitch_9
        0x1aa723 -> :sswitch_3
        0x1aaae0 -> :sswitch_8
        0x1aaea0 -> :sswitch_1
        0x1ab31d -> :sswitch_5
        0x1ab31e -> :sswitch_2
        0x1ab686 -> :sswitch_a
        0x1ab9e9 -> :sswitch_4
        0x1ab9ec -> :sswitch_6
        0x1aba26 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    const/4 v7, 0x0

    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v7

    move v1, v0

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    div-int/lit16 v2, v2, 0x11fe

    add-int/2addr v1, v2

    if-gtz v1, :cond_4

    move-object v5, v0

    :cond_0
    const-string v0, "\u06e8\u06e1\u06e2"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/view/View;->setEnabled(Z)V

    sget v0, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    mul-int/lit16 v1, v1, 0x9b3

    sub-int/2addr v0, v1

    if-gtz v0, :cond_1

    const/16 v0, 0x50

    sput v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e7\u06e6"

    :goto_1
    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v5

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "86Bn9xQvx2+36GeZdT+Mzjgg\n"

    const-string v2, "Fg7uEpGHIeA=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e7\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Lkn;->a:Lkn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    mul-int/lit16 v1, v1, 0x14b8

    or-int/2addr v0, v1

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    const-string v0, "\u06e7\u06e7\u06e6"

    goto :goto_1

    :cond_2
    const-string v0, "\u06e7\u06e6\u06e0"

    invoke-static {v0}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto :goto_0

    :sswitch_4
    sget-object v8, Lkn;->i:Lsd;

    new-instance v0, Lc7;

    iget-object v1, p0, Lw6;->a:Landroid/view/ViewGroup;

    iget-object v2, p0, Lw6;->b:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lw6;->c:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lw6;->d:Landroid/app/Activity;

    iget-object v6, p0, Lw6;->e:Landroid/widget/TextView;

    invoke-direct/range {v0 .. v7}, Lc7;-><init>(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V

    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    xor-int/lit8 v1, v1, 0xf

    invoke-static {v8, v7, v0, v1}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    sget v0, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    if-gtz v0, :cond_3

    const-string v0, "\u06e7\u06e4\u06e6"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e7\u06e4\u06e6"

    :goto_2
    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_4
    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v2, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    div-int/2addr v1, v2

    const v2, 0x1abe1f

    add-int/2addr v1, v2

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_5
    sget-object v0, Lxh;->n:Lxh;

    return-object v0

    :sswitch_6
    sget v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    add-int/lit16 v1, v1, -0xbbd

    or-int/2addr v0, v1

    if-ltz v0, :cond_5

    const-string v0, "\u06e7\u06e0\u06e7"

    goto :goto_2

    :cond_5
    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "s2s6\n"

    const-string v1, "0R9UCrbAOz8=\n"

    invoke-static {v0, v1}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    if-ltz v0, :cond_6

    const/16 v0, 0xc

    sput v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v0, "\u06e3\u06e7\u06e7"

    :goto_3
    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v0

    move v1, v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e2\u06e0\u06e2"

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_0
        0x1ab264 -> :sswitch_1
        0x1ab703 -> :sswitch_6
        0x1abe21 -> :sswitch_7
        0x1ac5a9 -> :sswitch_5
        0x1ac5e1 -> :sswitch_4
        0x1ac606 -> :sswitch_2
        0x1ac909 -> :sswitch_3
    .end sparse-switch
.end method
