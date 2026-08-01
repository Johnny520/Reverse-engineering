.class public final Lc7;
.super Lt50;

# interfaces
.implements Lym;


# instance fields
.field public final e:I

.field public f:I

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/widget/FrameLayout;

.field public final i:Landroid/widget/LinearLayout;

.field public final j:Landroid/app/Activity;

.field public final k:Landroid/view/View;

.field public final l:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(ILandroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lc7;->e:I

    iput p1, p0, Lc7;->f:I

    iput-object p2, p0, Lc7;->g:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc7;->h:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lc7;->i:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lc7;->j:Landroid/app/Activity;

    iput-object p6, p0, Lc7;->k:Landroid/view/View;

    iput-object p7, p0, Lc7;->l:Landroid/widget/TextView;

    invoke-direct {p0, p8}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    div-int/2addr v1, v2

    const v2, 0x1aabdf

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    or-int/lit16 v2, v2, -0x26e5

    or-int/2addr v1, v2

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v1, "\u06e1\u06e2\u06e7"

    invoke-static {v1}, Landroidx/activity/result/۟۠۟۠ۦ;->ۨۤۦۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sub-int/2addr v1, v2

    const v2, 0xe2e6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "uMt2dBhDt4nLpaQGLk6EFxWbfz"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۢۧۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e8\u06e6\u06e5"

    :goto_1
    invoke-static {v1}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_4
    sget v1, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v1, :cond_2

    const-string v1, "\u06e1\u06df\u06e5"

    goto :goto_1

    :cond_2
    const-string v1, "\u06e0\u06e8\u06e7"

    goto :goto_1

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdcff -> :sswitch_3
        0x1aab7c -> :sswitch_2
        0x1aabdf -> :sswitch_5
        0x1ab35b -> :sswitch_4
        0x1ac9a7 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lc7;->e:I

    iput-object p1, p0, Lc7;->g:Landroid/view/ViewGroup;

    iput-object p2, p0, Lc7;->h:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lc7;->i:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lc7;->j:Landroid/app/Activity;

    iput-object p5, p0, Lc7;->k:Landroid/view/View;

    iput-object p6, p0, Lc7;->l:Landroid/widget/TextView;

    invoke-direct {p0, p7}, Lt50;-><init>(Lvd;)V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06df\u06df"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    const-string v1, "\u06e6\u06e0\u06e1"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v1, :cond_1

    const-string v1, "\u06df\u06e3\u06e3"

    :goto_1
    invoke-static {v1}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    rem-int/2addr v1, v2

    const v2, 0x1ab46f

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_2
    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    move-result v1

    if-gtz v1, :cond_3

    const/16 v1, 0x3a

    sput v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v1, "\u06df\u06e4"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    sget v1, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    xor-int/2addr v1, v2

    const v2, -0x1ac2c0

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "kkQTngJbFSRMnfVYIcdHc4"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣ۟ۧ۠۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    if-gez v1, :cond_0

    const-string v1, "\u06df\u06e2"

    goto :goto_1

    :sswitch_4
    invoke-static {}, L۟ۤۧۦۢ;->ۣ۟۟ۢ۟()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v1

    if-ltz v1, :cond_4

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v1, "\u06e4\u06e1\u06e6"

    :goto_2
    invoke-static {v1}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v1, "\u06e4\u06e1\u06e6"

    goto :goto_2

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0x1aa81e -> :sswitch_2
        0x1ab603 -> :sswitch_4
        0x1aba09 -> :sswitch_3
        0x1ac167 -> :sswitch_5
        0x1ac205 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lvd;)Lvd;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "\u06e0\u06e6\u06e7"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move-object v7, v0

    move-object v5, v0

    move-object v8, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lc7;

    iget-object v2, p0, Lc7;->g:Landroid/view/ViewGroup;

    iget-object v3, p0, Lc7;->h:Landroid/widget/FrameLayout;

    iget-object v4, p0, Lc7;->i:Landroid/widget/LinearLayout;

    iget-object v5, p0, Lc7;->j:Landroid/app/Activity;

    move-object v6, v8

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lc7;-><init>(ILandroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V

    :goto_1
    return-object v0

    :sswitch_1
    iget v0, p0, Lc7;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_2
    sget v0, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac5b9

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :pswitch_0
    :sswitch_3
    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x1d

    sput v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v0, "\u06e2\u06e3\u06e2"

    invoke-static {v0}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    div-int/2addr v0, v2

    const v2, 0x1ac8e7

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iget-object v6, p0, Lc7;->l:Landroid/widget/TextView;

    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v0, "\u06e5\u06e8\u06e4"

    invoke-static {v0}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e0\u06e6\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    iget-object v7, p0, Lc7;->l:Landroid/widget/TextView;

    sget v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    if-ltz v0, :cond_2

    const-string v0, "\u06e8\u06e5\u06e3"

    :goto_3
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sub-int/2addr v0, v2

    const v2, 0xdd4b

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    iget v1, p0, Lc7;->f:I

    invoke-static {}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۟۟۟ۢ()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e0\u06e6\u06e5"

    invoke-static {v0}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e5\u06e0"

    goto :goto_3

    :sswitch_7
    new-instance v0, Lc7;

    iget-object v1, p0, Lc7;->g:Landroid/view/ViewGroup;

    iget-object v2, p0, Lc7;->h:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lc7;->i:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lc7;->j:Landroid/app/Activity;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lc7;-><init>(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V

    goto/16 :goto_1

    :sswitch_8
    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v0, "\u06e1\u06e7"

    goto :goto_2

    :cond_4
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lio/fastkv/۟ۢ۟ۢۥ;->۟۟ۧۧۨ:I

    or-int/2addr v0, v2

    const v2, 0x1aa95e

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lc7;->k:Landroid/view/View;

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v2, :cond_5

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v2, "\u06e1\u06e7\u06e8"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v0

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    or-int/2addr v2, v3

    const v3, 0x1abab4

    add-int/2addr v2, v3

    move-object v8, v0

    goto/16 :goto_0

    :sswitch_a
    iget-object v5, p0, Lc7;->k:Landroid/view/View;

    sget v0, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1aae28

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_0
        0x1aab9f -> :sswitch_7
        0x1aaba1 -> :sswitch_1
        0x1aaede -> :sswitch_4
        0x1aaf82 -> :sswitch_3
        0x1aba42 -> :sswitch_8
        0x1abe40 -> :sswitch_9
        0x1abea1 -> :sswitch_5
        0x1ac50c -> :sswitch_a
        0x1ac8ea -> :sswitch_6
        0x1ac986 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "\u06e3\u06e3\u06e4"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object v4, v0

    move-object v5, v0

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    packed-switch v1, :pswitch_data_0

    :sswitch_1
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/lit16 v3, v3, -0x24d0

    sub-int/2addr v0, v3

    if-ltz v0, :cond_0

    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    const-string v0, "\u06e5\u06e3\u06e4"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0, v2}, Lc7;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lc7;

    sget-object v1, Lxh;->n:Lxh;

    invoke-virtual {v0, v1}, Lc7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    return-object v0

    :sswitch_3
    sget-object v4, Lxh;->n:Lxh;

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    sub-int/2addr v0, v3

    const v3, -0x1ab8af

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0, v2}, Lc7;->a(Lvd;)Lvd;

    move-result-object v0

    check-cast v0, Lc7;

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sub-int/2addr v3, v5

    const v5, 0x1aa6f9

    add-int/2addr v3, v5

    move-object v5, v0

    goto :goto_0

    :pswitch_0
    :sswitch_5
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    add-int/2addr v0, v3

    const v3, -0x1aaff9

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v3, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    div-int/2addr v0, v3

    const v3, 0x1aa7fe

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_6
    move-object v0, v4

    goto :goto_2

    :sswitch_7
    invoke-virtual {v5, v4}, Lc7;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    mul-int/lit16 v3, v3, 0x13d3

    add-int/2addr v0, v3

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v3, "\u06e8\u06e0\u06e6"

    move-object v0, v2

    :goto_3
    invoke-static {v3}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v3, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v0, v3

    const v3, 0x1ab71d

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_8
    iget v1, p0, Lc7;->e:I

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    move-result v0

    if-ltz v0, :cond_2

    :goto_4
    const-string v0, "\u06e6\u06e0\u06e2"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->۟ۤۤۡۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e0\u06e6"

    goto :goto_1

    :sswitch_9
    move-object v0, p1

    check-cast v0, Lpe;

    goto :goto_4

    :sswitch_a
    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    if-gtz v0, :cond_3

    const-string v0, "\u06e6\u06e2\u06e0"

    :goto_5
    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e3\u06e3\u06e4"

    goto :goto_5

    :sswitch_b
    move-object v0, p2

    check-cast v0, Lvd;

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v2

    if-gtz v2, :cond_4

    const-string v2, "\u06e0\u06e1\u06e5"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u06e8\u06e2"

    move-object v3, v2

    goto :goto_3

    :sswitch_data_0
    .sparse-switch
        0xdcfa -> :sswitch_0
        0x1aa7fe -> :sswitch_2
        0x1aaac0 -> :sswitch_4
        0x1aab04 -> :sswitch_3
        0x1aab3c -> :sswitch_5
        0x1ab2fe -> :sswitch_a
        0x1ab301 -> :sswitch_6
        0x1ab684 -> :sswitch_8
        0x1abac4 -> :sswitch_7
        0x1ac168 -> :sswitch_b
        0x1ac221 -> :sswitch_1
        0x1ac8ee -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    const/16 v24, 0x0

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v31, 0x0

    const/16 v30, 0x0

    const/4 v11, 0x0

    const/16 v23, 0x0

    const/16 v22, 0x0

    const-wide/16 v28, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v26, 0x0

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/16 v21, 0x0

    const/16 v20, 0x0

    const/4 v4, 0x0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const-string v5, "\u06df\u06e6\u06e6"

    invoke-static {v5}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v32, v2

    move-object/from16 v33, v4

    move v7, v5

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "\u06e0\u06e1\u06e8"

    invoke-static {v2}, Landroid/window/ۣۧ۟۠;->ۧۥۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :sswitch_1
    move-object v2, v13

    :cond_0
    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/lit16 v5, v5, -0x13af

    sub-int/2addr v4, v5

    if-ltz v4, :cond_1

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v4, "\u06e2\u06e6\u06e8"

    invoke-static {v4}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v2

    move v7, v4

    goto :goto_0

    :cond_1
    const-string v4, "\u06e5\u06e6\u06e4"

    move-object v13, v2

    :goto_1
    invoke-static {v4}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, p0

    iget v4, v0, Lc7;->f:I

    sget-object v17, Lqe;->a:Lqe;

    if-eqz v4, :cond_20

    const/4 v2, 0x1

    if-eq v4, v2, :cond_17

    const-string v2, "\u06e8\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v4

    move v7, v2

    goto :goto_0

    :sswitch_3
    const-string v2, "Bu2S23ksnQ==\n"

    const-string v4, "JavU4kwcraw=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v2, 0x1

    const/high16 v4, 0x41400000    # 12.0f

    invoke-virtual/range {v30 .. v30}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    invoke-static {v2, v4, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    int-to-float v2, v2

    move-object/from16 v0, v33

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v33

    invoke-virtual {v14, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v4, "\u06e0\u06e1"

    move-object/from16 v2, v19

    move-object/from16 v5, v20

    :goto_2
    invoke-static {v4}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v19, v2

    move-object/from16 v20, v5

    move v7, v4

    goto :goto_0

    :sswitch_4
    move-object v2, v11

    check-cast v2, Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    const-string v4, "Ik/M1HRWH0NoG8S+GVp2HlV6kbVzGlRu\n"

    const-string v5, "xfR4Mv7y+/s=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v4, Lu6;->a:Lu6;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v4

    if-ltz v4, :cond_2

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    const-string v4, "\u06e5\u06e7\u06e6"

    move-object v5, v15

    :goto_3
    invoke-static {v4}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v2

    move-object v15, v5

    move v7, v4

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e5\u06e6\u06df"

    invoke-static {v4}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v14, v2

    move v7, v4

    goto/16 :goto_0

    :sswitch_5
    sget-object v5, Lxh;->n:Lxh;

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    mul-int/lit16 v4, v4, 0x1534

    or-int/2addr v2, v4

    if-gtz v2, :cond_3

    const/4 v2, 0x4

    sput v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    move-object/from16 v2, v16

    :goto_4
    const-string v4, "\u06e6\u06e4\u06e1"

    move-object/from16 v16, v2

    :goto_5
    invoke-static {v4}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v5

    move v7, v2

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06e8\u06e7\u06e1"

    move-object v2, v14

    goto :goto_3

    :sswitch_6
    const-string v2, "l7twomS1MkfvpAIqI9IHN5KpbGQem3If8shkA22LFkbVmAE9AdIQP52jWWc1hX8h6cdwKmG3GKqd\nj1NlKbx/LcbFbQ9niRqAIWfEayCmcyHmxFwJaoonRumgAhQy0BMok7xIbT62\n"

    const-string v4, "dSDkgoI3mqA=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    if-ltz v2, :cond_1e

    const/16 v2, 0x27

    sput v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    const-string v2, "\u06e2\u06e4\u06e3"

    :goto_6
    invoke-static {v2}, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۡۨۡۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_7
    new-instance v2, Landroid/app/AlertDialog$Builder;

    move-object/from16 v0, v30

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v4, "7K6G0xanQmS5xp68fosI\n"

    const-string v5, "CSEXNJgXpPI=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const-string v4, "hbd2ifTehUDw213o\n"

    const-string v5, "Yz/nbmt7bME=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, La7;

    invoke-direct {v5}, La7;-><init>()V

    invoke-virtual {v2, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v4, v4, 0x114a

    or-int/2addr v2, v4

    if-ltz v2, :cond_4

    const-string v2, "\u06e8\u06e5\u06df"

    invoke-static {v2}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_4
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v4, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    rem-int/2addr v2, v4

    const v4, 0x1aa9ce

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v13, v18

    :goto_7
    const-string v2, "\u06e5\u06e6\u06e4"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x1

    move/from16 v0, v31

    if-eq v0, v2, :cond_1a

    const/4 v2, 0x2

    move/from16 v0, v31

    if-eq v0, v2, :cond_11

    move/from16 v0, v31

    move/from16 v1, v23

    if-eq v0, v1, :cond_22

    move-object v2, v11

    check-cast v2, Landroid/widget/TextView;

    sget v4, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v5, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    rem-int/lit16 v5, v5, 0x57b

    rem-int/2addr v4, v5

    if-ltz v4, :cond_5

    const/16 v4, 0x1d

    sput v4, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    const-string v4, "\u06e2\u06e4\u06e4"

    move-object/from16 v5, v20

    goto/16 :goto_2

    :cond_5
    const-string v5, "\u06e3\u06e7\u06e4"

    move-object/from16 v19, v2

    move-object/from16 v4, v22

    move/from16 v6, v23

    :goto_8
    invoke-static {v5}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v22, v4

    move/from16 v23, v6

    move v7, v2

    goto/16 :goto_0

    :sswitch_a
    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    div-int/lit16 v4, v4, -0x234

    sub-int/2addr v2, v4

    if-ltz v2, :cond_6

    const/16 v2, 0x4f

    sput v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v2, "\u06e6\u06e5\u06e6"

    move-object/from16 v4, v22

    move-object v5, v2

    move/from16 v6, v23

    goto :goto_8

    :cond_6
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sub-int/2addr v2, v4

    const v4, 0x1ac8c3

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_b
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v2, :cond_7

    const-string v2, "\u06e6\u06e3"

    invoke-static {v2}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e3\u06e5"

    move/from16 v4, v24

    :goto_9
    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v24, v4

    move v7, v2

    goto/16 :goto_0

    :cond_8
    :sswitch_c
    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    rem-int/2addr v2, v4

    const v4, 0x1ac61c

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_d
    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    or-int/lit16 v4, v4, -0x7d5

    div-int/2addr v2, v4

    if-eqz v2, :cond_9

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e0\u06e3\u06e4"

    invoke-static {v2}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e3\u06e5\u06e0"

    move-object v4, v2

    move-object v5, v15

    goto/16 :goto_5

    :sswitch_e
    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    move-wide/from16 v0, v28

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v4, Lt5;

    const/4 v5, 0x1

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-direct {v4, v0, v5, v1}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v2, Lo40;

    const/high16 v4, 0x447a0000    # 1000.0f

    move-object/from16 v0, v25

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1, v4}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    iget-object v4, v2, Lo40;->k:Lp40;

    const/high16 v5, 0x43480000    # 200.0f

    invoke-virtual {v4, v5}, Lp40;->b(F)V

    invoke-virtual {v2}, Lo40;->h()V

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v4, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v2, v4

    const v4, 0x292114

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :pswitch_0
    :sswitch_f
    const-string v2, "\u06e7\u06e2"

    :goto_a
    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_10
    move-object v2, v12

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v3

    sget-object v2, Lyg;->a:Lyf;

    sget-object v4, Lps;->a:Lno;

    move-object/from16 v0, p0

    iget-object v9, v0, Lc7;->l:Landroid/widget/TextView;

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    rem-int/lit16 v5, v5, -0x800

    or-int/2addr v2, v5

    if-gtz v2, :cond_a

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v2, "\u06e0\u06e7\u06e1"

    :goto_b
    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v32, v4

    move v7, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e5\u06e7\u06e6"

    goto :goto_b

    :sswitch_11
    move-object/from16 v0, p0

    iget v2, v0, Lc7;->e:I

    packed-switch v2, :pswitch_data_0

    :sswitch_12
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v2, :cond_b

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v2, "\u06e8\u06e8\u06e7"

    move/from16 v4, v24

    goto/16 :goto_9

    :cond_b
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v4, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    rem-int/2addr v2, v4

    const v4, 0x1abe9f

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_13
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    const-string v2, "\u06e7\u06e5\u06e5"

    move-object/from16 v4, v18

    move-object/from16 v12, p1

    goto/16 :goto_6

    :sswitch_14
    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    div-int/lit16 v4, v4, -0x1cd0

    sub-int/2addr v2, v4

    if-ltz v2, :cond_c

    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    goto/16 :goto_7

    :cond_c
    const-string v4, "\u06e8\u06e7\u06e8"

    move-object v2, v14

    move-object v5, v15

    goto/16 :goto_3

    :sswitch_15
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v4, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/2addr v2, v4

    const v4, 0x1abf85

    xor-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_16
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    if-gtz v2, :cond_d

    const-string v2, "\u06e2\u06e1\u06e0"

    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_d
    sget v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v4, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    div-int/2addr v2, v4

    const v4, 0x1ab6e6

    xor-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :cond_e
    :sswitch_17
    const-string v2, "\u06e0\u06e7\u06e1"

    move/from16 v4, v24

    goto/16 :goto_9

    :cond_f
    :sswitch_18
    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    if-gtz v2, :cond_10

    const-string v2, "\u06e3\u06df\u06e4"

    :goto_c
    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e5\u06e8"

    move-object v4, v2

    goto/16 :goto_1

    :cond_11
    :sswitch_19
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    xor-int/lit16 v4, v4, 0x1b57

    xor-int/2addr v2, v4

    if-gtz v2, :cond_12

    const/16 v2, 0x59

    sput v2, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v2, "\u06e8\u06e7"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_12
    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v4, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v2, v4

    const v4, 0x1604e

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v4, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    div-int/lit16 v4, v4, -0x11f5

    xor-int/2addr v2, v4

    if-ltz v2, :cond_13

    const-string v2, "\u06e7\u06e4\u06e0"

    goto/16 :goto_a

    :cond_13
    const-string v2, "\u06df\u06e6\u06e6"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۠ۦۤۢ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_1b
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "amxLrjz7gxcuf0KxaeKJEClvQqRz/YkXLmRJtHPkiRApek62dK+PWHtiUrZ14Yk=\n"

    const-string v4, "CQ0nwhyP7Dc=\n"

    invoke-static {v3, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_1c
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget-object v2, Lu6;->a:Lu6;

    const/4 v4, 0x1

    move-object/from16 v0, p0

    iput v4, v0, Lc7;->f:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_d
    const-string v2, "\u06e7\u06e8\u06e0"

    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_1d
    const/4 v2, -0x2

    move/from16 v0, v31

    if-eq v0, v2, :cond_f

    if-eqz v31, :cond_26

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/lit8 v6, v2, -0x1f

    sget-object v2, Lo40;->n:Lsh;

    sget v4, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    or-int/lit16 v5, v5, 0x9b7

    add-int/2addr v4, v5

    if-gtz v4, :cond_14

    const-string v4, "\u06e8\u06e7\u06e1"

    invoke-static {v4}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v22, v2

    move/from16 v23, v6

    move v7, v4

    goto/16 :goto_0

    :cond_14
    const-string v5, "\u06e8\u06e2\u06e2"

    move-object v4, v2

    goto/16 :goto_8

    :sswitch_1e
    const-string v2, "v08MJciO3a3KdUp55elS8LhaOi/Orxn0/DAjfZ+9caPyYktr3uVC1rhiHiz4kRjBwjI1cZW8aK7j\ne0h10Q==\n"

    const-string v4, "XdWsynAB/Us=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, v30

    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    sget v2, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v4, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/2addr v2, v4

    const v4, 0x1abcc5

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_1f
    const/4 v2, 0x2

    move/from16 v0, v24

    if-ne v0, v2, :cond_24

    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    if-ltz v2, :cond_15

    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    const-string v2, "\u06e7\u06e5\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    div-int/2addr v2, v4

    const v4, 0x1ac9c4

    xor-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_20
    sget-object v20, Lu6;->d:Ljava/lang/String;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_28

    const-string v2, "heO2CoLyqQzLmIBb7tnocdvS1FOEtdYXhv6nCYbbqgjglpFj4PzN\n"

    const-string v4, "Y3877whTTJU=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    add-int/2addr v2, v4

    const v4, 0x1ac042

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_21
    const/4 v2, 0x1

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    const-string v2, "DzQbhH1r5UdqbDLbKUuMHGowb+R9Hod2ACYf\n"

    const-string v4, "6ImKY8b3APs=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "uRffRFON3frMLZkYfupCgr0D2k5jshuA1mj1Cg6bVfPnAZcEXORenL0S2kxWkxqnx2vnBA6SW/Xb\nF5g+buR1ir4x/057rRmn+GrvLQ==\n"

    const-string v4, "W41/q+sC/Rw=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, v30

    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    sget v2, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    if-ltz v2, :cond_16

    const-string v2, "\u06e5\u06e8"

    :goto_e
    invoke-static {v2}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_16
    const-string v2, "\u06e7\u06e1\u06df"

    :goto_f
    invoke-static {v2}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۡۡۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_22
    sget v2, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    sget v4, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/2addr v2, v4

    const v4, 0x1aa781

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_23
    move/from16 v4, v24

    :cond_17
    const-string v2, "\u06e8\u06e5\u06e7"

    goto/16 :goto_9

    :sswitch_24
    invoke-static/range {p0 .. p0}, Lu6;->f(Lt50;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v0, v17

    if-ne v12, v0, :cond_e

    invoke-static {}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۨۧ۟ۤ()I

    move-result v2

    if-ltz v2, :cond_18

    const/16 v2, 0x54

    sput v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    move-object/from16 v16, v17

    goto/16 :goto_d

    :cond_18
    const-string v2, "\u06e4\u06e2\u06e6"

    move-object/from16 v16, v17

    goto :goto_e

    :sswitch_25
    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    xor-int/2addr v2, v4

    const v4, 0x1ac51b

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_26
    move-object v2, v11

    check-cast v2, Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    const-string v4, "DSY7SxD+Yot2aww+UMMI52Y1UiQElgONDCMi\n"

    const-string v5, "5Iy3o79/hAA=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "DJvStjazRlFFqbgKeO9DCAan0nluhT8ZWeH/ODqnc15Bo7sofO1oFwuJ6XNluz8URSYK0fLubCcL\nqMQ=\n"

    const-string v4, "7gZeltIJ17Y=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    move-object/from16 v0, v30

    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    const-string v4, "\u06e1\u06e1\u06e2"

    move-object/from16 v2, v30

    move/from16 v5, v31

    :goto_10
    invoke-static {v4}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v30, v2

    move/from16 v31, v5

    move v7, v4

    goto/16 :goto_0

    :sswitch_27
    const-string v4, "\u06e1\u06e3\u06df"

    move-object/from16 v2, v19

    move-object/from16 v5, v21

    goto/16 :goto_2

    :sswitch_28
    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    move-result v2

    if-gtz v2, :cond_19

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v2, "\u06e5\u06e3\u06e3"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e8\u06e0\u06e5"

    invoke-static {v2}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_29
    move-object v2, v11

    check-cast v2, Landroid/widget/TextView;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setEnabled(Z)V

    const-string v4, "mwmR5GURdWTIQ5uUBSc8GcwH\n"

    const-string v5, "c6YmAeCZkv0=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "\u06e2\u06e5\u06e0"

    :goto_11
    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_1a
    :sswitch_2a
    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    move-result v2

    if-ltz v2, :cond_1b

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    const-string v2, "\u06e8\u06e6\u06e1"

    goto/16 :goto_f

    :cond_1b
    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v4, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sub-int/2addr v2, v4

    const v4, 0x1ac104

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_2b
    sget-object v2, Lu6;->a:Lu6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lu6;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    sget v4, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    if-ltz v4, :cond_1c

    const-string v4, "\u06e1\u06e7\u06e6"

    invoke-static {v4}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v4

    move-object v13, v2

    move v7, v4

    goto/16 :goto_0

    :cond_1c
    const-string v4, "\u06e8\u06e1\u06df"

    move-object v13, v2

    :goto_12
    invoke-static {v4}, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->ۣۣ۟ۡ۠(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_2c
    move-object/from16 v0, p0

    iget-object v2, v0, Lc7;->l:Landroid/widget/TextView;

    move-object/from16 v0, v20

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v4, "HsgEr2HX8g==\n"

    const-string v5, "PY5CllTnwhI=\n"

    invoke-static {v4, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v4, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v4, :cond_1d

    const/16 v4, 0x29

    sput v4, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v4, "\u06e4\u06e2\u06e6"

    invoke-static {v4}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v33, v2

    move v7, v4

    goto/16 :goto_0

    :cond_1d
    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    rem-int/2addr v4, v5

    const v5, 0x1ac049

    xor-int/2addr v4, v5

    move-object/from16 v33, v2

    move v7, v4

    goto/16 :goto_0

    :sswitch_2d
    const-string v2, "1jxM8VQMW26pIy9ZImdZF9scSDcfITYUnElOXFcSfG2+ACFsD2dVDdIAcf+crA==\n"

    const-string v4, "NKDJ0bKC04g=\n"

    invoke-static {v2, v4}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    move-object/from16 v0, v30

    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    sget-object v2, Lkn;->a:Lkn;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lkn;->i:Lsd;

    const/4 v4, 0x0

    new-instance v5, Lb7;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, v30

    invoke-direct {v5, v0, v6, v7}, Lb7;-><init>(Landroid/app/Activity;Lvd;I)V

    move/from16 v0, v23

    invoke-static {v2, v4, v5, v0}, Lg80;->u(Lpe;Lhe;Lym;I)Lw40;

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    rem-int/lit16 v4, v4, -0x15e1

    div-int/2addr v2, v4

    if-ltz v2, :cond_1f

    move-object/from16 v4, v18

    :cond_1e
    const-string v2, "\u06e5\u06e1\u06e4"

    move-object/from16 v18, v4

    goto/16 :goto_11

    :cond_1f
    const-string v2, "\u06e2\u06e4\u06e3"

    goto/16 :goto_c

    :sswitch_2e
    move/from16 v4, v24

    :cond_20
    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v5, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    mul-int/lit16 v5, v5, -0x560

    xor-int/2addr v2, v5

    if-gtz v2, :cond_21

    const/16 v2, 0x2f

    sput v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    const-string v7, "\u06e6\u06e1\u06e8"

    move-object/from16 v2, v25

    move-object/from16 v5, v26

    move-object/from16 v6, v27

    move/from16 v24, v4

    :goto_13
    invoke-static {v7}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v4

    move-object/from16 v25, v2

    move-object/from16 v26, v5

    move-object/from16 v27, v6

    move v7, v4

    goto/16 :goto_0

    :cond_21
    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    xor-int/2addr v2, v5

    const v5, 0x1ab113

    xor-int/2addr v2, v5

    move/from16 v24, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_2f
    const-wide/16 v4, 0xd8

    sget v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    int-to-long v6, v2

    xor-long v26, v4, v6

    move-object/from16 v0, p0

    iget-object v2, v0, Lc7;->i:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lc7;->h:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v4, v0, Lc7;->g:Landroid/view/ViewGroup;

    const-string v7, "\u06e0\u06e3\u06e4"

    move-object v5, v4

    move-wide/from16 v28, v26

    goto :goto_13

    :sswitch_30
    sget v2, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sub-int/2addr v2, v4

    const v4, 0x1ab6cb

    xor-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :cond_22
    :sswitch_31
    const-string v2, "\u06e6\u06e5\u06e6"

    goto/16 :goto_a

    :sswitch_32
    invoke-static/range {p1 .. p1}, Lgu;->M(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget v5, v0, Lc7;->f:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lc7;->j:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v11, v0, Lc7;->k:Landroid/view/View;

    sget v4, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    sget v6, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    xor-int/lit16 v6, v6, 0x131f

    xor-int/2addr v4, v6

    if-gtz v4, :cond_23

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v4, "\u06e7\u06e5\u06e5"

    goto/16 :goto_10

    :cond_23
    sget v4, Lio/fastkv/ۣ۟ۧۦۡ;->۟۠۠ۨۨ:I

    sget v6, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    add-int/2addr v4, v6

    const v6, 0x1ac6b0

    add-int/2addr v4, v6

    move-object/from16 v30, v2

    move/from16 v31, v5

    move v7, v4

    goto/16 :goto_0

    :cond_24
    :sswitch_33
    sget v2, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v4, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/2addr v2, v4

    const v4, 0x1abd7f

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_34
    new-instance v2, Lc7;

    move-object/from16 v0, p0

    iget-object v4, v0, Lc7;->g:Landroid/view/ViewGroup;

    move-object/from16 v0, p0

    iget-object v5, v0, Lc7;->h:Landroid/widget/FrameLayout;

    move-object/from16 v0, p0

    iget-object v6, v0, Lc7;->i:Landroid/widget/LinearLayout;

    move-object/from16 v0, p0

    iget-object v7, v0, Lc7;->j:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v8, v0, Lc7;->k:Landroid/view/View;

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v10}, Lc7;-><init>(ILandroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;Lvd;)V

    const/4 v4, 0x2

    move-object/from16 v0, p0

    iput v4, v0, Lc7;->f:I

    move-object/from16 v0, v32

    move-object/from16 v1, p0

    invoke-static {v0, v2, v1}, Lg80;->M(Lhe;Lym;Lt50;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v0, v17

    if-ne v2, v0, :cond_8

    sget v2, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    if-gtz v2, :cond_25

    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    const-string v2, "\u06df\u06e1\u06e8"

    move-object v4, v2

    move-object/from16 v16, v17

    goto/16 :goto_12

    :cond_25
    move-object v5, v15

    move-object/from16 v2, v17

    goto/16 :goto_4

    :cond_26
    :sswitch_35
    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    if-ltz v2, :cond_27

    const-string v2, "\u06e5\u06e7\u06e1"

    invoke-static {v2}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_27
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    div-int/2addr v2, v4

    const v4, 0xdc64

    add-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_36
    sget-object v16, Lxh;->n:Lxh;

    :sswitch_37
    return-object v16

    :cond_28
    :sswitch_38
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v2

    if-gtz v2, :cond_29

    const/16 v2, 0x5d

    sput v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    const-string v2, "\u06e1\u06e0"

    move-object v4, v2

    goto/16 :goto_1

    :cond_29
    sget v2, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v4, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    xor-int/2addr v2, v4

    const v4, -0x1aac9d

    xor-int/2addr v2, v4

    move v7, v2

    goto/16 :goto_0

    :sswitch_39
    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    div-int/2addr v2, v4

    const v4, 0x1ab6e2

    add-int/2addr v2, v4

    move-object/from16 v16, v15

    move v7, v2

    goto/16 :goto_0

    :sswitch_3a
    invoke-virtual/range {v27 .. v27}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    move-wide/from16 v0, v28

    invoke-virtual {v2, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v4, Lt5;

    const/4 v5, 0x1

    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-direct {v4, v0, v5, v1}, Lt5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v2, Lo40;

    const/high16 v4, 0x447a0000    # 1000.0f

    move-object/from16 v0, v25

    move-object/from16 v1, v22

    invoke-direct {v2, v0, v1, v4}, Lo40;-><init>(Landroid/view/View;Lgf;F)V

    iget-object v4, v2, Lo40;->k:Lp40;

    const/high16 v5, 0x43480000    # 200.0f

    invoke-virtual {v4, v5}, Lp40;->b(F)V

    invoke-virtual {v2}, Lo40;->h()V

    sget v2, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v4, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    or-int/lit16 v4, v4, -0x2616

    mul-int/2addr v2, v4

    if-gtz v2, :cond_2a

    const/16 v2, 0x12

    sput v2, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    const-string v2, "\u06e0\u06e1\u06e8"

    invoke-static {v2}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_2a
    const-string v2, "\u06e4\u06e8\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc01 -> :sswitch_0
        0xdc08 -> :sswitch_38
        0xdc62 -> :sswitch_25
        0xdc63 -> :sswitch_26
        0xdca3 -> :sswitch_29
        0xdcbd -> :sswitch_18
        0xdcdb -> :sswitch_32
        0xdcdf -> :sswitch_25
        0xdcfe -> :sswitch_e
        0x1aa741 -> :sswitch_2e
        0x1aa746 -> :sswitch_1a
        0x1aa77d -> :sswitch_23
        0x1aa7df -> :sswitch_11
        0x1aa819 -> :sswitch_a
        0x1aaac1 -> :sswitch_2a
        0x1aaae6 -> :sswitch_1
        0x1aab07 -> :sswitch_25
        0x1aab41 -> :sswitch_9
        0x1aab5e -> :sswitch_17
        0x1aab7f -> :sswitch_25
        0x1aabba -> :sswitch_10
        0x1aae83 -> :sswitch_16
        0x1aaec2 -> :sswitch_22
        0x1aaefd -> :sswitch_2c
        0x1aaf7b -> :sswitch_2b
        0x1aaf80 -> :sswitch_12
        0x1ab2e1 -> :sswitch_b
        0x1ab2e2 -> :sswitch_1c
        0x1ab2fd -> :sswitch_1e
        0x1ab6be -> :sswitch_17
        0x1ab6c0 -> :sswitch_c
        0x1ab6e2 -> :sswitch_37
        0x1ab700 -> :sswitch_21
        0x1ab9c7 -> :sswitch_c
        0x1aba28 -> :sswitch_15
        0x1abadc -> :sswitch_f
        0x1abae3 -> :sswitch_2d
        0x1abdc8 -> :sswitch_8
        0x1abe05 -> :sswitch_33
        0x1abe21 -> :sswitch_16
        0x1abe5e -> :sswitch_20
        0x1abe62 -> :sswitch_2
        0x1abe63 -> :sswitch_7
        0x1abe64 -> :sswitch_1b
        0x1abe84 -> :sswitch_34
        0x1ac168 -> :sswitch_27
        0x1ac1ac -> :sswitch_36
        0x1ac1cb -> :sswitch_3a
        0x1ac1e3 -> :sswitch_14
        0x1ac207 -> :sswitch_4
        0x1ac225 -> :sswitch_3
        0x1ac545 -> :sswitch_28
        0x1ac56a -> :sswitch_31
        0x1ac5a8 -> :sswitch_5
        0x1ac5c3 -> :sswitch_1d
        0x1ac5c7 -> :sswitch_d
        0x1ac5c9 -> :sswitch_19
        0x1ac61f -> :sswitch_24
        0x1ac621 -> :sswitch_35
        0x1ac8ed -> :sswitch_25
        0x1ac906 -> :sswitch_6
        0x1ac928 -> :sswitch_2f
        0x1ac982 -> :sswitch_1f
        0x1ac98a -> :sswitch_13
        0x1ac9a7 -> :sswitch_25
        0x1ac9c2 -> :sswitch_39
        0x1ac9c4 -> :sswitch_30
        0x1ac9c9 -> :sswitch_16
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
