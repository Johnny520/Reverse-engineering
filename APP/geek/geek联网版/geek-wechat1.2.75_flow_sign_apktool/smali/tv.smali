.class public final synthetic Ltv;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:Ln00;

.field public final b:I

.field public final c:[Landroid/widget/TextView;

.field public final d:Landroid/widget/TextView;

.field public final e:Lxv;

.field public final f:Lsv;

.field public final g:Lsv;

.field public final h:Ljava/util/ArrayList;

.field public final i:Lp00;

.field public final j:Lp00;


# direct methods
.method public synthetic constructor <init>(Ln00;I[Landroid/widget/TextView;Landroid/widget/TextView;Lxv;Lsv;Lsv;Ljava/util/ArrayList;Lp00;Lp00;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e2\u06e5\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1aaa84

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_1
    iput-object p7, p0, Ltv;->g:Lsv;

    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    rem-int/lit16 v2, v2, -0x260f

    mul-int/2addr v0, v2

    if-ltz v0, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e8\u06e5\u06e4"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e1\u06e6\u06e4"

    invoke-static {v0}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    sget v0, Landroidx/activity/۟ۥۥۧ۠;->ۤۧۢ۠:I

    sget v2, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۤ۟ۦ۟:I

    rem-int/2addr v0, v2

    const v2, 0x1ab120

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iput-object p6, p0, Ltv;->f:Lsv;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۤ۠ۤۢ()I

    move-result v0

    if-ltz v0, :cond_3

    const/16 v0, 0x17

    sput v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    :cond_2
    const-string v0, "\u06e0\u06df\u06e6"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    or-int/2addr v0, v2

    const v2, -0x1ac994

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p10, p0, Ltv;->j:Lp00;

    sget v0, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    sget v2, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    add-int/lit16 v2, v2, -0x2324

    mul-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x50

    sput v0, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    const-string v0, "\u06e2\u06e2\u06e3"

    :goto_1
    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e2\u06e2\u06e3"

    goto :goto_1

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e2\u06e8"

    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    iput-object p5, p0, Ltv;->e:Lxv;

    sget v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/lit16 v2, v2, -0x1064

    sub-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/4 v0, 0x6

    sput v0, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    const-string v0, "\u06df\u06e5\u06e2"

    :goto_2
    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e0\u06e4\u06e4"

    goto :goto_2

    :sswitch_7
    iput-object p4, p0, Ltv;->d:Landroid/widget/TextView;

    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    sget v2, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    mul-int/2addr v0, v2

    const v2, -0x1abff2

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "pgMuV"

    invoke-static {v0}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۥ۠ۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v1

    if-gtz v1, :cond_6

    const-string v1, "\u06e0\u06e4\u06e4"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06e3\u06e2\u06e8"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_9
    iput-object p9, p0, Ltv;->i:Lp00;

    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v0, :cond_7

    const-string v0, "\u06e6\u06e7\u06df"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac0b5

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iput-object p3, p0, Ltv;->c:[Landroid/widget/TextView;

    sget v0, Lcom/google/android/material/behavior/ۢۤۡ;->ۣۢۨ۠:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    div-int/lit16 v2, v2, -0x16ad

    xor-int/2addr v0, v2

    if-ltz v0, :cond_8

    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    const-string v0, "\u06e1\u06e6\u06e4"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06df\u06e8\u06e1"

    :goto_4
    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    iput-object p1, p0, Ltv;->a:Ln00;

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/lit16 v2, v2, -0x112b

    add-int/2addr v0, v2

    if-gtz v0, :cond_9

    const/16 v0, 0x60

    sput v0, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    const-string v0, "\u06e5\u06e8\u06e4"

    goto :goto_4

    :cond_9
    const-string v0, "\u06e5\u06e8\u06e4"

    goto :goto_3

    :sswitch_c
    iput p2, p0, Ltv;->b:I

    sget v0, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    xor-int/2addr v0, v2

    const v2, -0x1ac687

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣۤۧۥ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v2, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    add-int/lit16 v2, v2, -0x22d5

    or-int/2addr v0, v2

    if-ltz v0, :cond_a

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    :cond_a
    const-string v0, "\u06e2\u06e6\u06e6"

    invoke-static {v0}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_e
    iput-object p8, p0, Ltv;->h:Ljava/util/ArrayList;

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    move-result v0

    if-gtz v0, :cond_b

    const/16 v0, 0x5d

    sput v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    const-string v0, "\u06e3\u06e2\u06e8"

    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e0\u06e7\u06e8"

    goto :goto_4

    :sswitch_f
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7bc -> :sswitch_0
        0x1aa818 -> :sswitch_7
        0x1aaac7 -> :sswitch_f
        0x1aab60 -> :sswitch_3
        0x1aabc1 -> :sswitch_9
        0x1aaf5f -> :sswitch_e
        0x1ab2a3 -> :sswitch_d
        0x1ab302 -> :sswitch_b
        0x1ab322 -> :sswitch_8
        0x1ab669 -> :sswitch_5
        0x1abd8c -> :sswitch_2
        0x1abdeb -> :sswitch_4
        0x1abea1 -> :sswitch_c
        0x1ac23e -> :sswitch_6
        0x1ac58c -> :sswitch_a
        0x1ac987 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    const/16 v13, 0xb

    const/4 v12, 0x1

    const/4 v5, 0x0

    const/4 v11, 0x0

    const-string v0, "\u06e2\u06e1\u06e4"

    invoke-static {v0}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move-object v7, v11

    move-object v2, v11

    move-object v10, v11

    move-object v3, v11

    move-object v1, v11

    move v8, v5

    move v9, v0

    move v4, v5

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v6, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sub-int/2addr v0, v6

    const v6, 0x1abff0

    add-int/2addr v0, v6

    move v9, v0

    goto :goto_0

    :sswitch_1
    sget v0, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    xor-int/lit16 v0, v0, -0x36d

    add-int/2addr v0, v4

    sget v6, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v8, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v8, v8, 0x535

    or-int/2addr v6, v8

    if-ltz v6, :cond_0

    const/16 v6, 0x32

    sput v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    const-string v6, "\u06df\u06e0\u06e5"

    invoke-static {v6}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v6

    move v8, v0

    move v9, v6

    goto :goto_0

    :cond_0
    const-string v8, "\u06df\u06e0\u06e5"

    move v6, v0

    move-object v9, v8

    :goto_1
    invoke-static {v9}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v0

    move v8, v6

    move v9, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Ltv;->g:Lsv;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v6}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v6, v2, Lxv;->b:I

    invoke-virtual {v10, v0, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    sget v0, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v6, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/lit16 v6, v6, -0x1fbd

    xor-int/2addr v0, v6

    if-gtz v0, :cond_e

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e6\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_3
    invoke-virtual {v1, v11, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v0, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    if-ltz v0, :cond_1

    const/16 v0, 0x48

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    const-string v0, "\u06df\u06df\u06e2"

    invoke-static {v0}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e5\u06df\u06e3"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto :goto_0

    :sswitch_4
    iget-object v0, p0, Ltv;->e:Lxv;

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v6, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    add-int/lit16 v6, v6, 0x1a22

    rem-int/2addr v2, v6

    if-gtz v2, :cond_2

    sput v13, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۢ۟ۥۨ:I

    :goto_2
    const-string v2, "\u06e0\u06e2\u06e5"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۤ۟ۧۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v2, v0

    move v9, v6

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u06e7\u06e4\u06df"

    move-object v2, v0

    move v6, v8

    goto :goto_1

    :sswitch_5
    invoke-virtual {v1, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-string v6, "\u06e5\u06e3\u06e3"

    move v0, v4

    :goto_3
    invoke-static {v6}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v6

    move v9, v6

    move v4, v0

    goto/16 :goto_0

    :sswitch_6
    iget v0, v2, Lxv;->a:I

    invoke-virtual {v10, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v6, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    xor-int/lit16 v6, v6, 0x22c8

    or-int/2addr v0, v6

    if-ltz v0, :cond_4

    sput v13, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    :cond_3
    const-string v0, "\u06e6\u06e5\u06e1"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/theme/۟ۢۧۤۤ;->۟ۥ۠ۢۨ:I

    sget v6, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    mul-int/2addr v0, v6

    const v6, 0x1ce23b

    add-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v3, v11, v12}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x1e

    sput v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    const-string v0, "\u06e2\u06e8\u06e3"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_5
    move-object v0, v7

    :goto_4
    const-string v9, "\u06e1\u06e6\u06df"

    move-object v7, v0

    move v6, v8

    goto/16 :goto_1

    :sswitch_8
    sget v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v0, :cond_6

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v4, "\u06e7\u06e4\u06df"

    move v0, v5

    move-object v6, v4

    goto :goto_3

    :cond_6
    const-string v6, "\u06e6\u06e7\u06e1"

    move-object v0, v10

    move v4, v5

    :goto_5
    invoke-static {v6}, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣ۠ۦۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v10, v0

    move v9, v6

    goto/16 :goto_0

    :sswitch_9
    iget-object v3, p0, Ltv;->d:Landroid/widget/TextView;

    move-object v0, v2

    goto :goto_2

    :sswitch_a
    invoke-virtual {v3, v10}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v0, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    if-gtz v0, :cond_7

    const-string v0, "\u06e3\u06df\u06e4"

    invoke-static {v0}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v6, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    mul-int/2addr v0, v6

    const v6, 0xce2ed

    add-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->۟ۦۣۣۧ()I

    move-result v0

    if-gtz v0, :cond_8

    const/16 v0, 0x23

    sput v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v0, "\u06e8\u06e3\u06e1"

    :goto_6
    invoke-static {v0}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۢ۟ۤۤ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e2\u06e1\u06e4"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_c
    iget-object v0, p0, Ltv;->i:Lp00;

    iget-object v6, p0, Ltv;->j:Lp00;

    iget-object v9, p0, Ltv;->h:Ljava/util/ArrayList;

    invoke-static {v7, v0, v6, v9}, Lbw;->g(Ln00;Lp00;Lp00;Ljava/util/ArrayList;)V

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v6, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    div-int/lit16 v6, v6, -0x606

    sub-int/2addr v0, v6

    if-gtz v0, :cond_3

    const/16 v0, 0x9

    sput v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۥۢۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_d
    iget-object v0, p0, Ltv;->c:[Landroid/widget/TextView;

    aget-object v0, v0, v4

    :goto_7
    const-string v1, "\u06e5\u06e5\u06e7"

    invoke-static {v1}, Landroidx/activity/۟ۥۥۧ۠;->۟ۢۤۨۦ(Ljava/lang/Object;)I

    move-result v6

    move-object v1, v0

    move v9, v6

    goto/16 :goto_0

    :sswitch_e
    iget-object v0, p0, Ltv;->a:Ln00;

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    move-result v6

    if-gtz v6, :cond_9

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    goto/16 :goto_4

    :cond_9
    const-string v6, "\u06e4\u06e2\u06e7"

    move-object v7, v0

    :goto_8
    invoke-static {v6}, Lcom/google/android/material/datepicker/ۨۧۤ;->ۤۦ۟۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :sswitch_f
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v6, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    if-gtz v6, :cond_a

    const-string v6, "\u06e7\u06e8\u06e3"

    goto/16 :goto_5

    :cond_a
    const-string v6, "\u06e7\u06e5\u06df"

    invoke-static {v6}, Landroidx/legacy/content/ۧۡ۠۠;->ۨ۟ۤۥ(Ljava/lang/Object;)I

    move-result v6

    move-object v10, v0

    move v9, v6

    goto/16 :goto_0

    :sswitch_10
    iget v0, p0, Ltv;->b:I

    iput v0, v7, Ln00;->a:I

    sget v0, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v0, :cond_b

    move-object v0, v1

    goto :goto_7

    :cond_b
    sget v0, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    mul-int/2addr v0, v6

    const v6, -0x1af831

    xor-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :sswitch_11
    sget v0, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    if-gtz v0, :cond_c

    const/16 v0, 0xe

    sput v0, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    const-string v0, "\u06e3\u06e5\u06e7"

    invoke-static {v0}, Landroidx/core/content/ۣۧۡۤ;->۠۟۟ۨ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_c
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v0, v6

    const v6, 0xe216

    add-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :sswitch_12
    const/4 v0, 0x3

    if-ge v4, v0, :cond_11

    const-string v0, "\u06e7\u06e8\u06e3"

    goto/16 :goto_6

    :sswitch_13
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v4, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    add-int/lit16 v4, v4, 0x76d

    add-int/2addr v0, v4

    if-gtz v0, :cond_d

    const/16 v0, 0x3b

    sput v0, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    const-string v0, "\u06e5\u06df\u06e3"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    move v4, v8

    goto/16 :goto_0

    :cond_d
    const-string v0, "\u06e2\u06e8\u06e3"

    move v4, v8

    move-object v6, v0

    goto :goto_8

    :sswitch_14
    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v6, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    div-int/lit16 v6, v6, -0x9a3

    add-int/2addr v0, v6

    if-gtz v0, :cond_f

    const/16 v0, 0x63

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    :cond_e
    const-string v0, "\u06e8\u06e7\u06e7"

    move-object v6, v0

    goto/16 :goto_8

    :cond_f
    const-string v0, "\u06df\u06e1"

    goto/16 :goto_6

    :sswitch_15
    iget-object v0, p0, Ltv;->f:Lsv;

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v0, v6}, Lsv;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-virtual {v10, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    sget v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    sget v6, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/lit16 v6, v6, -0x132a

    sub-int/2addr v0, v6

    if-gtz v0, :cond_10

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v0, "\u06e7\u06e5\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۣۨ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v9, v0

    goto/16 :goto_0

    :cond_10
    sget v0, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v6, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    div-int/2addr v0, v6

    const v6, 0xdc3d

    add-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :cond_11
    :sswitch_16
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sget v6, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sub-int/2addr v0, v6

    const v6, 0x1aaea9

    add-int/2addr v0, v6

    move v9, v0

    goto/16 :goto_0

    :sswitch_17
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe2 -> :sswitch_0
        0xdc3d -> :sswitch_2
        0xdcb9 -> :sswitch_8
        0x1aa702 -> :sswitch_16
        0x1aa724 -> :sswitch_13
        0x1aab23 -> :sswitch_a
        0x1aaf5a -> :sswitch_c
        0x1ab26a -> :sswitch_f
        0x1ab285 -> :sswitch_e
        0x1ab35d -> :sswitch_14
        0x1ab608 -> :sswitch_0
        0x1ab6c5 -> :sswitch_7
        0x1aba29 -> :sswitch_10
        0x1abd89 -> :sswitch_1
        0x1abe05 -> :sswitch_3
        0x1abe47 -> :sswitch_5
        0x1abe63 -> :sswitch_11
        0x1ac1e5 -> :sswitch_b
        0x1ac202 -> :sswitch_17
        0x1ac240 -> :sswitch_12
        0x1ac5a2 -> :sswitch_6
        0x1ac5c1 -> :sswitch_4
        0x1ac622 -> :sswitch_d
        0x1ac94b -> :sswitch_15
        0x1ac9c8 -> :sswitch_9
    .end sparse-switch
.end method
