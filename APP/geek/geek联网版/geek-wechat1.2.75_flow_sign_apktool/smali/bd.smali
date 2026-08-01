.class public final synthetic Lbd;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Ll00;

.field public final c:Landroid/widget/TextView;

.field public final d:Lsn;

.field public final e:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll00;Landroid/widget/TextView;Lsn;Landroid/widget/TextView;I)V
    .locals 3

    iput p5, p0, Lbd;->a:I

    iput-object p1, p0, Lbd;->b:Ll00;

    iput-object p2, p0, Lbd;->c:Landroid/widget/TextView;

    iput-object p3, p0, Lbd;->d:Lsn;

    iput-object p4, p0, Lbd;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06e0\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "eeS"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۢۧۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget v0, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    mul-int/lit16 v2, v2, -0x2208

    or-int/2addr v0, v2

    if-ltz v0, :cond_5

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    const-string v0, "\u06e6\u06e0\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    add-int/lit16 v2, v2, -0x13a4

    div-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/16 v0, 0x41

    sput v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v0, "\u06e7\u06e4\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06e5\u06e8"

    goto :goto_1

    :sswitch_2
    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/lit16 v2, v2, 0x23d1

    add-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e4\u06e5\u06e8"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e0\u06e1"

    goto :goto_1

    :sswitch_3
    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x2d

    sput v0, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    const-string v0, "\u06e6\u06e3\u06e3"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sub-int/2addr v0, v2

    const v2, 0x1abdb8

    add-int/2addr v0, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v0, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/lit16 v2, v2, -0x2294

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    const-string v0, "\u06e4\u06df\u06df"

    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e4\u06e5\u06e8"

    goto :goto_2

    :cond_5
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    add-int/2addr v0, v2

    const v2, -0x1ab603

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaea2 -> :sswitch_0
        0x1aaf9e -> :sswitch_4
        0x1ab281 -> :sswitch_1
        0x1aba87 -> :sswitch_5
        0x1ac165 -> :sswitch_2
        0x1ac5a4 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    const/4 v7, 0x1

    const/4 v1, 0x0

    const-string v0, "\u06e7\u06e5\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    move-object v4, v1

    move-object v5, v1

    move-object v0, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, Lkn;->a:Lkn;

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    or-int/lit16 v3, v3, -0x29b

    mul-int/2addr v1, v3

    if-ltz v1, :cond_a

    const-string v1, "\u06e7\u06e2\u06e4"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_1
    iget-object v1, p0, Lbd;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lbd;->d:Lsn;

    iget-object v6, p0, Lbd;->e:Landroid/widget/TextView;

    invoke-static {v1, v5, v3, v6}, Lhd;->b(Landroid/widget/TextView;Ll00;Lsn;Landroid/widget/TextView;)V

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    rem-int/lit16 v3, v3, 0x62a

    add-int/2addr v1, v3

    if-gtz v1, :cond_0

    const-string v1, "\u06e7\u06e4\u06e5"

    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e7\u06e2\u06e4"

    goto :goto_1

    :sswitch_2
    iput-boolean v7, v4, Ll00;->a:Z

    sget v1, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    xor-int/lit16 v3, v3, 0x42d

    sub-int/2addr v1, v3

    if-gtz v1, :cond_1

    const/16 v1, 0x5b

    sput v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v1, "\u06e5\u06e6\u06e8"

    :goto_2
    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v3, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    add-int/2addr v1, v3

    const v3, 0xdc3e

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v3, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    mul-int/lit16 v3, v3, -0x20da

    mul-int/2addr v1, v3

    if-gtz v1, :cond_2

    const-string v1, "\u06e6\u06df\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06e1\u06e3"

    goto :goto_2

    :sswitch_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    const-string v1, "\u06e3\u06e1\u06e5"

    invoke-static {v1}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :sswitch_5
    sget v1, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    or-int/2addr v1, v3

    const v3, 0x1ac1e4

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_6
    iget-object v1, p0, Lbd;->c:Landroid/widget/TextView;

    iget-object v3, p0, Lbd;->d:Lsn;

    iget-object v6, p0, Lbd;->e:Landroid/widget/TextView;

    invoke-static {v1, v4, v3, v6}, Lhd;->b(Landroid/widget/TextView;Ll00;Lsn;Landroid/widget/TextView;)V

    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v1, :cond_3

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    const-string v1, "\u06e4\u06df\u06e4"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v3, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    rem-int/2addr v1, v3

    const v3, 0x1ac084

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :pswitch_0
    :sswitch_7
    sget v1, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v3, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    or-int/2addr v1, v3

    const v3, 0x1ac72b

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_8
    iget v1, p0, Lbd;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_9
    invoke-static {}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->۠ۨۦۥ()I

    move-result v1

    if-gtz v1, :cond_4

    const-string v1, "\u06e3\u06e7"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :sswitch_a
    invoke-static {p1, v7}, Lkn;->i(Landroid/view/View;I)V

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v3, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/lit16 v3, v3, -0xcf2

    div-int/2addr v1, v3

    if-ltz v1, :cond_b

    const-string v1, "\u06e8\u06e5\u06e4"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v3, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    rem-int/2addr v1, v3

    const v3, -0xdc12

    xor-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_b
    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    sget v1, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    if-ltz v1, :cond_5

    const/16 v1, 0x56

    sput v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    const-string v1, "\u06e7\u06e8"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06df\u06e2\u06e7"

    move-object v1, v2

    :goto_4
    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v1

    goto/16 :goto_0

    :sswitch_c
    sget-object v1, Lkn;->a:Lkn;

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v3, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    add-int/lit16 v3, v3, 0x1098

    rem-int/2addr v2, v3

    if-gtz v2, :cond_6

    const/16 v2, 0x23

    sput v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v2, "\u06e4\u06e8\u06e3"

    move-object v3, v2

    goto :goto_4

    :cond_6
    const-string v2, "\u06e4\u06e7\u06e8"

    move-object v3, v2

    goto :goto_4

    :sswitch_d
    iget-object v1, p0, Lbd;->b:Ll00;

    sget v3, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v3, :cond_7

    const/16 v3, 0x3a

    sput v3, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    const-string v3, "\u06df\u06e2\u06e7"

    :goto_5
    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v1

    goto/16 :goto_0

    :cond_7
    sget v3, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v4, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v3, v4

    const v4, -0x19546e

    xor-int/2addr v3, v4

    move-object v4, v1

    goto/16 :goto_0

    :sswitch_e
    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v3, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/lit16 v3, v3, -0x215a

    rem-int/2addr v1, v3

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/core/content/ۣۧۡۤ;->۟ۦۦ۠ۡ()I

    const-string v1, "\u06e7\u06e5\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e6\u06df\u06e8"

    move-object v1, v4

    goto :goto_5

    :sswitch_f
    const/4 v1, 0x0

    iput-boolean v1, v5, Ll00;->a:Z

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v1

    if-ltz v1, :cond_9

    const/16 v1, 0x4c

    sput v1, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    goto/16 :goto_3

    :cond_9
    sget v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    mul-int/2addr v1, v3

    const v3, 0x163d68

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_10
    iget-object v1, p0, Lbd;->b:Ll00;

    sget v3, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    rem-int/2addr v3, v5

    const v5, 0x1acc0a

    add-int/2addr v3, v5

    move-object v5, v1

    goto/16 :goto_0

    :cond_a
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    add-int/2addr v1, v3

    const v3, 0x1aacaa

    add-int/2addr v1, v3

    move v3, v1

    goto/16 :goto_0

    :sswitch_11
    invoke-static {p1, v7}, Lkn;->i(Landroid/view/View;I)V

    sget v1, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    sget v3, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    rem-int/lit16 v3, v3, 0x2524

    div-int/2addr v1, v3

    if-gtz v1, :cond_c

    const/16 v1, 0x41

    sput v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    :cond_b
    const-string v1, "\u06e7\u06e3\u06e2"

    invoke-static {v1}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e5\u06e6\u06e8"

    move-object v1, v2

    goto/16 :goto_4

    :sswitch_12
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0xdc84 -> :sswitch_6
        0xdce1 -> :sswitch_9
        0x1aa764 -> :sswitch_4
        0x1aab60 -> :sswitch_b
        0x1aae82 -> :sswitch_2
        0x1aaec3 -> :sswitch_a
        0x1ab647 -> :sswitch_11
        0x1ab9c9 -> :sswitch_7
        0x1abac5 -> :sswitch_e
        0x1abadf -> :sswitch_5
        0x1abe67 -> :sswitch_d
        0x1ac14f -> :sswitch_3
        0x1ac1c7 -> :sswitch_12
        0x1ac569 -> :sswitch_12
        0x1ac586 -> :sswitch_10
        0x1ac5a8 -> :sswitch_1
        0x1ac5c1 -> :sswitch_8
        0x1ac5ca -> :sswitch_c
        0x1ac987 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
