.class public final synthetic Lcd;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final a:I

.field public final b:Ll00;

.field public final c:Lsn;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Lgd;

.field public final f:Ljava/util/ArrayList;

.field public final g:I

.field public final h:Ljava/util/ArrayList;

.field public final i:Lp00;


# direct methods
.method public synthetic constructor <init>(Ll00;Lsn;Landroid/widget/LinearLayout;Lgd;Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;I)V
    .locals 4

    iput p9, p0, Lcd;->a:I

    iput-object p1, p0, Lcd;->b:Ll00;

    iput-object p2, p0, Lcd;->c:Lsn;

    iput-object p3, p0, Lcd;->d:Landroid/widget/LinearLayout;

    iput-object p4, p0, Lcd;->e:Lgd;

    iput-object p5, p0, Lcd;->f:Ljava/util/ArrayList;

    iput p6, p0, Lcd;->g:I

    iput-object p7, p0, Lcd;->h:Ljava/util/ArrayList;

    iput-object p8, p0, Lcd;->i:Lp00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e2\u06e8\u06e3"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v3, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    mul-int/lit16 v3, v3, 0x172b

    or-int/2addr v2, v3

    if-gtz v2, :cond_0

    const-string v2, "\u06e0\u06e1\u06e1"

    :goto_1
    invoke-static {v2}, L۟ۤۧۦۢ;->ۣۤۤ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_0
    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v3, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    add-int/2addr v2, v3

    const v3, 0xdab2

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v2

    if-gtz v2, :cond_1

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    div-int/2addr v2, v3

    const v3, 0x1aab05

    add-int/2addr v2, v3

    goto :goto_0

    :cond_1
    :sswitch_3
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v3, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    or-int/lit16 v3, v3, -0x2674

    div-int/2addr v2, v3

    if-gtz v2, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v2, "\u06e7\u06e8\u06e5"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e5\u06df"

    :goto_2
    invoke-static {v2}, Landroidx/activity/result/۟ۡۤۦۡ;->ۨۥۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_4
    const-string v0, "gB5s3bVM0MF3fNsEE24uplR6c"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->۟ۢۥۨۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {}, Landroidx/core/app/ۡۤۡ۠;->ۨۥۨۧ()I

    move-result v2

    if-ltz v2, :cond_3

    const-string v2, "\u06e5\u06df"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e6\u06e8\u06e1"

    goto :goto_1

    :sswitch_5
    sget v2, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v2, :cond_4

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->۟ۥۣۥۦ()I

    const-string v2, "\u06e0\u06e3\u06e4"

    goto :goto_2

    :cond_4
    sget v2, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/2addr v2, v3

    const v3, 0x1ab3b5

    add-int/2addr v2, v3

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9a -> :sswitch_0
        0x1aab00 -> :sswitch_4
        0x1aaea1 -> :sswitch_5
        0x1ab35d -> :sswitch_2
        0x1ac25f -> :sswitch_1
        0x1ac927 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 25

    const/16 v20, 0x0

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const-string v6, "\u06e1\u06e7\u06e5"

    invoke-static {v6}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v6

    move-object/from16 v21, v1

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v1}, Lkn;->i(Landroid/view/View;I)V

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v1

    if-gtz v1, :cond_f

    move-object/from16 v1, v18

    :goto_1
    const-string v2, "\u06e6\u06e7\u06e8"

    invoke-static {v2}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v18, v1

    move v6, v2

    goto :goto_0

    :sswitch_1
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, v24

    iget v2, v0, Lsn;->b:I

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    if-gtz v2, :cond_0

    const/16 v2, 0x48

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    :goto_2
    const-string v2, "\u06df\u06e1\u06e2"

    invoke-static {v2}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v14, v1

    move v6, v2

    goto :goto_0

    :cond_0
    const-string v3, "\u06e5\u06e0\u06e3"

    move-object/from16 v2, v20

    move-object v14, v1

    :goto_3
    invoke-static {v3}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v20, v2

    move v6, v1

    goto :goto_0

    :sswitch_2
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    move-object/from16 v0, p1

    invoke-static {v0, v1}, Lkn;->i(Landroid/view/View;I)V

    sget v1, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    sget v2, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    div-int/lit16 v2, v2, -0x1bfd

    add-int/2addr v1, v2

    if-ltz v1, :cond_b

    const-string v1, "\u06e6\u06e1\u06e8"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_3
    move-object/from16 v0, v24

    iget v1, v0, Lsn;->e:I

    move-object/from16 v0, v21

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    move-object/from16 v0, v21

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    move-object/from16 v1, v19

    :goto_4
    const-string v2, "\u06e0\u06df\u06e1"

    move-object/from16 v19, v1

    :goto_5
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto :goto_0

    :sswitch_4
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    move-object/from16 v0, v17

    iget v2, v0, Lsn;->b:I

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_1

    :sswitch_5
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcd;->c:Lsn;

    sget v3, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v4, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    div-int/lit16 v4, v4, 0x21f4

    add-int/2addr v3, v4

    if-ltz v3, :cond_1

    invoke-static {}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۧۧ()I

    const-string v3, "\u06e7\u06e1\u06e7"

    invoke-static {v3}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v1

    move-object/from16 v24, v2

    move v6, v3

    goto/16 :goto_0

    :cond_1
    const-string v3, "\u06e4\u06e7\u06e7"

    invoke-static {v3}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move-object/from16 v21, v1

    move-object/from16 v24, v2

    move v6, v3

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v0, p0

    iget-object v1, v0, Lcd;->d:Landroid/widget/LinearLayout;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    const-string v1, "o4zuFmGWuJWjlvZaI5D5mKyK9lo1mvmVopevFDSZtdu5gPIfYZS3n7+W6x5vgrCfqpz2VBWQoY+b\nkOcN\n"

    const-string v2, "zfmCekH12fs=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->۟۠ۡ۠۟:I

    mul-int/lit16 v2, v2, -0x26b3

    add-int/2addr v1, v2

    if-gtz v1, :cond_3

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    :cond_2
    const-string v1, "\u06e7\u06e5\u06e2"

    invoke-static {v1}, Lio/fastkv/ۣ۟ۧۦۡ;->ۡ۠ۦۣ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_3
    sget v1, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sub-int/2addr v1, v2

    const v2, 0x1aaa3f

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_7
    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {v1}, Lmp;->p(F)F

    move-result v1

    invoke-virtual {v14, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v21

    invoke-virtual {v0, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    add-int/lit16 v2, v2, 0x115e

    sub-int/2addr v1, v2

    if-ltz v1, :cond_4

    const-string v1, "\u06df\u06df\u06e2"

    invoke-static {v1}, Lkotlinx/coroutines/۠ۥۣۧ;->ۨۧۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_4
    sget v1, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sub-int/2addr v1, v2

    const v2, 0x1aac51

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v1, p1

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcd;->c:Lsn;

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v4, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/lit16 v4, v4, -0x1f3a

    or-int/2addr v2, v4

    if-gtz v2, :cond_5

    const-string v2, "\u06e4\u06e3"

    invoke-static {v2}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v15, v1

    move-object/from16 v17, v3

    move v6, v2

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e5\u06e4\u06e2"

    move-object/from16 v2, v16

    :goto_6
    invoke-static {v4}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟۠ۤ۟۠(Ljava/lang/Object;)I

    move-result v4

    move-object v15, v1

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move v6, v4

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "IfO"

    invoke-static {v1}, Lcom/google/android/material/button/ۥۤ۠;->ۧ۠۠ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v2

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    mul-int/lit16 v3, v3, 0x655

    mul-int/2addr v1, v3

    if-gtz v1, :cond_6

    const-string v4, "\u06e5\u06e7\u06e6"

    move-object v1, v15

    move-object/from16 v3, v17

    goto :goto_6

    :cond_6
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v3, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    div-int/2addr v1, v3

    const v3, 0x1ac8c2

    add-int/2addr v1, v3

    move-object/from16 v16, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_a
    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, v23

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, v23

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    if-ltz v1, :cond_7

    const/4 v1, 0x4

    sput v1, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    const-string v1, "\u06e8\u06df\u06e3"

    invoke-static {v1}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_7
    sget v1, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    sget v2, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    div-int/2addr v1, v2

    const v2, 0x1ac56d

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_b
    move-object/from16 v0, p0

    iget-object v10, v0, Lcd;->b:Ll00;

    const/4 v1, 0x1

    iput-boolean v1, v10, Ll00;->a:Z

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    div-int/lit16 v2, v2, -0x1ee4

    or-int/2addr v1, v2

    if-gtz v1, :cond_8

    invoke-static {}, Landroidx/activity/result/۟۠۟۠ۦ;->۟ۢۡ۠()I

    const-string v1, "\u06e2\u06e1\u06e0"

    invoke-static {v1}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06df\u06df\u06e2"

    :goto_7
    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_c
    const/high16 v1, 0x42c80000    # 100.0f

    invoke-static {v1}, Lmp;->p(F)F

    move-result v1

    move-object/from16 v0, v18

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    move-object/from16 v0, v18

    invoke-virtual {v15, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    rem-int/lit16 v2, v2, -0x2184

    mul-int/2addr v1, v2

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۦۥۨۦ()I

    const-string v1, "\u06df\u06df\u06e5"

    invoke-static {v1}, Landroidx/startup/ۣۣۡ۟;->۟۟ۥ۠ۤ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v0, p0

    iget v1, v0, Lcd;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_e
    sget v1, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    rem-int/lit16 v2, v2, 0x102

    rem-int/2addr v1, v2

    if-gtz v1, :cond_9

    const/16 v1, 0x5b

    sput v1, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    const-string v1, "\u06e0\u06e3\u06e2"

    invoke-static {v1}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e5\u06e7\u06e6"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۡۡۡ۟(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_f
    move-object v1, v12

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v0, v24

    iget v2, v0, Lsn;->f:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u06e4\u06e1\u06e8"

    invoke-static {v2}, Landroid/window/۟ۤ۟ۡۧ;->ۣ۟۟ۤۦ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v22, v1

    move v6, v2

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v0, p0

    iget-object v1, v0, Lcd;->f:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v2, v0, Lcd;->g:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcd;->h:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcd;->i:Lp00;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcd;->e:Lgd;

    invoke-static/range {v1 .. v6}, Lhd;->c(Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;Ll00;Landroid/widget/BaseAdapter;)V

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab558

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    sget v2, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sget v3, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/lit16 v3, v3, -0x168b

    div-int/2addr v2, v3

    if-eqz v2, :cond_a

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v2, "\u06e6\u06e3\u06e1"

    invoke-static {v2}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v20, v1

    move v6, v2

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e4\u06e3"

    move-object v2, v1

    goto/16 :goto_3

    :cond_b
    const-string v1, "\u06e3\u06e6\u06e8"

    invoke-static {v1}, Landroidx/activity/ۣۢۦۨ;->۟۟ۢۦۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_c
    :sswitch_12
    sget v1, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    mul-int/lit16 v2, v2, 0x298

    rem-int/2addr v1, v2

    if-ltz v1, :cond_d

    const/16 v1, 0x62

    sput v1, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    const-string v1, "\u06e6\u06e8\u06e0"

    goto/16 :goto_7

    :cond_d
    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    add-int/2addr v1, v2

    const v2, 0x1aa425

    xor-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v0, p0

    iget-object v1, v0, Lcd;->d:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    const-string v1, "77m7nJhqi9vvo6PQ2mzK1uC/o9DMZsrb7qL6ns1lhpX1taeVmGiE0fOjvpSWfoPR5qmj3uxsksHX\npbKH\n"

    const-string v2, "gczX8LgJ6rU=\n"

    invoke-static {v1, v2}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v13}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    move-result v1

    if-gtz v1, :cond_e

    invoke-static {}, Landroidx/activity/۟ۥۥۧ۠;->۟ۥۥۤ۟()I

    const-string v1, "\u06e0\u06e8\u06e1"

    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06df\u06e4\u06df"

    invoke-static {v1}, Lۤۤۥۤ;->ۣ۟ۡۢۦ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06e5\u06e2\u06e2"

    move-object v2, v1

    goto/16 :goto_5

    :sswitch_14
    const-string v1, "\u06e1\u06e7\u06e5"

    invoke-static {v1}, Landroid/app/۟ۡۧۦۡ;->ۢۧ۟ۨ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :sswitch_15
    sget-object v1, Lkn;->a:Lkn;

    invoke-static/range {p1 .. p1}, Lmp;->d(Ljava/lang/Object;)V

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۥۣ۠ۦ()I

    move-result v2

    if-ltz v2, :cond_10

    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    goto/16 :goto_4

    :cond_10
    const-string v3, "\u06e7\u06e1\u06e7"

    move-object/from16 v2, v20

    move-object/from16 v19, v1

    goto/16 :goto_3

    :sswitch_16
    move-object v1, v13

    check-cast v1, Landroid/widget/TextView;

    move-object/from16 v0, v17

    iget v2, v0, Lsn;->f:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    rem-int/lit16 v3, v3, -0x1f9b

    rem-int/2addr v2, v3

    if-ltz v2, :cond_11

    const/16 v2, 0x29

    sput v2, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    const-string v2, "\u06df\u06e4\u06df"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۣۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v23, v1

    move v6, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    div-int/2addr v2, v3

    const v3, 0x1ac1c3

    add-int/2addr v2, v3

    move-object/from16 v23, v1

    move v6, v2

    goto/16 :goto_0

    :sswitch_17
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    move-object/from16 v0, v16

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    if-gtz v1, :cond_12

    const-string v1, "\u06e4\u06e7\u06e7"

    invoke-static {v1}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_12
    move-object v1, v14

    goto/16 :goto_2

    :sswitch_18
    move-object/from16 v0, p0

    iget-object v6, v0, Lcd;->f:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget v7, v0, Lcd;->g:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lcd;->h:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcd;->i:Lp00;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcd;->e:Lgd;

    invoke-static/range {v6 .. v11}, Lhd;->c(Ljava/util/ArrayList;ILjava/util/ArrayList;Lp00;Ll00;Landroid/widget/BaseAdapter;)V

    invoke-static {}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۥۧۤ۠()I

    move-result v1

    if-ltz v1, :cond_c

    sget v1, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v2, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    add-int/2addr v1, v2

    const v2, 0x1ab561

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, v17

    iget v1, v0, Lsn;->e:I

    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v15, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    if-gtz v1, :cond_13

    invoke-static {}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->ۢۢۧۨ()I

    const-string v1, "\u06e5\u06df\u06df"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_13
    sget v1, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    mul-int/2addr v1, v2

    const v2, 0x1a8ac0

    xor-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v5, v0, Lcd;->b:Ll00;

    const/4 v1, 0x0

    iput-boolean v1, v5, Ll00;->a:Z

    invoke-static {}, Landroidx/core/widget/۟ۡۦۢۥ;->ۡۧۡۦ()I

    move-result v1

    if-ltz v1, :cond_14

    const-string v1, "\u06e5\u06e2\u06e2"

    invoke-static {v1}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_14
    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sub-int/2addr v1, v2

    const v2, -0x1ac0c5

    xor-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :pswitch_0
    :sswitch_1b
    invoke-static {}, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢ۠ۨۦ()I

    move-result v1

    if-ltz v1, :cond_15

    const/16 v1, 0x1f

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v1, "\u06e7\u06e1\u06e2"

    move-object/from16 v2, v20

    move-object v3, v1

    goto/16 :goto_3

    :cond_15
    sget v1, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    or-int/2addr v1, v2

    const v2, 0x1ab000

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_1c
    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, v22

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    move-object/from16 v0, v22

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v1, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    if-ltz v1, :cond_16

    const/16 v1, 0x57

    sput v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    const-string v1, "\u06e2\u06e0\u06e4"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    move v6, v1

    goto/16 :goto_0

    :cond_16
    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    div-int/2addr v1, v2

    const v2, 0x1abde2

    add-int/2addr v1, v2

    move v6, v1

    goto/16 :goto_0

    :sswitch_1d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc7f -> :sswitch_0
        0x1aa702 -> :sswitch_8
        0x1aa705 -> :sswitch_f
        0x1aa740 -> :sswitch_1d
        0x1aa79a -> :sswitch_16
        0x1aaac2 -> :sswitch_1
        0x1aab20 -> :sswitch_6
        0x1aaba0 -> :sswitch_4
        0x1aabd9 -> :sswitch_12
        0x1aaf42 -> :sswitch_14
        0x1aaf7b -> :sswitch_15
        0x1aaf7f -> :sswitch_d
        0x1ab266 -> :sswitch_1d
        0x1ab281 -> :sswitch_1b
        0x1ab686 -> :sswitch_9
        0x1ab6e5 -> :sswitch_1a
        0x1aba0b -> :sswitch_1c
        0x1abac4 -> :sswitch_3
        0x1abd85 -> :sswitch_e
        0x1abda8 -> :sswitch_7
        0x1abde2 -> :sswitch_10
        0x1abde5 -> :sswitch_b
        0x1abe23 -> :sswitch_19
        0x1abe84 -> :sswitch_11
        0x1ac18d -> :sswitch_5
        0x1ac1c4 -> :sswitch_a
        0x1ac247 -> :sswitch_c
        0x1ac54d -> :sswitch_2
        0x1ac56d -> :sswitch_18
        0x1ac5c4 -> :sswitch_13
        0x1ac8cc -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
