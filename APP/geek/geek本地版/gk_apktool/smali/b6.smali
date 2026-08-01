.class public final synthetic Lb6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:I

.field public final b:Landroid/app/Dialog;

.field public final c:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(ILandroid/app/Dialog;Landroid/widget/LinearLayout;)V
    .locals 5

    iput p1, p0, Lb6;->a:I

    iput-object p2, p0, Lb6;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lb6;->c:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e3\u06df\u06e8"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v4

    move-wide v2, v0

    :goto_0
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "SQ9mfwfuXcQVBOf1PAtuI"

    invoke-static {v0}, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۦۣۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1aa5d6

    add-int v4, v2, v3

    move-wide v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v2, v3}, Ljava/io/PrintStream;->println(J)V

    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v1, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    or-int/lit16 v1, v1, -0x1b33

    rem-int/2addr v0, v1

    if-gtz v0, :cond_0

    const/16 v0, 0x58

    sput v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v0, "\u06df\u06df\u06e8"

    :goto_1
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06df\u06e8\u06e2"

    goto :goto_1

    :cond_1
    :sswitch_2
    const-string v0, "\u06df\u06e8\u06e2"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e8\u06e2\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06df\u06e8"

    goto :goto_2

    :sswitch_4
    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e3\u06df\u06e0"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v1, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    div-int/2addr v0, v1

    const v1, 0xdbe1

    add-int/2addr v0, v1

    move v4, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdbe1 -> :sswitch_0
        0x1aa708 -> :sswitch_1
        0x1aa819 -> :sswitch_5
        0x1ab604 -> :sswitch_2
        0x1ab60c -> :sswitch_4
        0x1ab6c6 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 24

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v8, 0x0

    const-string v14, "\u06e2\u06e4\u06e6"

    invoke-static {v14}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v19

    move-object v14, v4

    move-object v15, v5

    move-object/from16 v16, v8

    move-object/from16 v17, v13

    :goto_0
    sparse-switch v19, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v6, v7}, Ljava/io/PrintStream;->println(D)V

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v5, v5, 0x1a4e

    xor-int/2addr v4, v5

    if-gtz v4, :cond_1

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v4, "\u06e7\u06e2\u06e3"

    :goto_1
    invoke-static {v4}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto :goto_0

    :sswitch_1
    new-instance v4, Lh40;

    sget-object v5, Lh40;->o:Lqh;

    move-object/from16 v0, v16

    invoke-direct {v4, v0, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    invoke-static {}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۣۣۡ۟()I

    move-result v4

    if-gtz v4, :cond_2

    move-wide v4, v6

    :cond_0
    const-string v6, "\u06e2\u06e2"

    move-object v8, v6

    :goto_2
    invoke-static {v8}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v8

    move/from16 v19, v8

    move-wide v6, v4

    goto :goto_0

    :sswitch_2
    new-instance v4, Lh40;

    sget-object v5, Lh40;->o:Lqh;

    invoke-direct {v4, v9, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sub-int/2addr v4, v5

    const v5, 0x1aa3a5

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto :goto_0

    :pswitch_0
    :sswitch_3
    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    rem-int/2addr v4, v5

    const v5, 0x1abd2f

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto :goto_0

    :cond_1
    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/2addr v4, v5

    const v5, 0xdce0

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_4
    new-instance v4, Lh40;

    sget-object v5, Lh40;->n:Lqh;

    move-object/from16 v0, v16

    invoke-direct {v4, v0, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v4, :cond_3

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    :cond_2
    const-string v4, "\u06e4\u06e4\u06e1"

    invoke-static {v4}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_3
    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sub-int/2addr v4, v5

    const v5, 0x1ac46a

    xor-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_4
    :sswitch_5
    const-string v5, "\u06e7\u06e7"

    move-object v4, v9

    :goto_3
    invoke-static {v5}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :pswitch_1
    :sswitch_6
    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v4, :cond_5

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v4, "\u06e8\u06df\u06e8"

    invoke-static {v4}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_5
    sget v4, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    sget v5, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab3fe

    xor-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :pswitch_2
    :sswitch_7
    sget v4, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v5, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    mul-int/2addr v4, v5

    const v5, 0x1119a2

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v4}, Lmn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v5, 0x3f19999a    # 0.6f

    invoke-virtual {v4, v5}, Landroid/view/View;->setScaleX(F)V

    sget v5, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v8, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v8, v8, -0xda0

    rem-int/2addr v5, v8

    if-ltz v5, :cond_6

    const-string v5, "\u06e0\u06e3\u06e6"

    invoke-static {v5}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v16, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v8, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    or-int/2addr v5, v8

    const v8, 0x1ab882

    add-int/2addr v5, v8

    move-object/from16 v16, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    move-result v4

    if-gtz v4, :cond_4

    const-string v4, "fmnCw2iB"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v6

    if-ltz v6, :cond_0

    const/16 v6, 0x38

    sput v6, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    const-string v6, "\u06e5\u06e8"

    invoke-static {v6}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v8

    move/from16 v19, v8

    move-wide v6, v4

    goto/16 :goto_0

    :sswitch_a
    move/from16 v0, v18

    xor-int/lit16 v4, v0, -0x337

    const/4 v5, 0x0

    invoke-virtual {v15, v4, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v15, v4}, Landroid/view/View;->setScaleX(F)V

    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v15, v4}, Landroid/view/View;->setScaleY(F)V

    sget v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    div-int/lit16 v5, v5, 0x7a8

    xor-int/2addr v4, v5

    if-ltz v4, :cond_12

    const/16 v4, 0x18

    sput v4, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v4, "\u06e1\u06e3\u06e7"

    :goto_4
    invoke-static {v4}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_b
    new-instance v4, Lh40;

    sget-object v5, Lh40;->o:Lqh;

    invoke-direct {v4, v3, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v5, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    xor-int/2addr v4, v5

    const v5, 0x1aaaa7

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_c
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x43480000    # 200.0f

    const v8, 0x3f19999a    # 0.6f

    invoke-static {v4, v5, v8}, Lz30;->f(FFF)Li40;

    move-result-object v4

    iput-object v4, v14, Lh40;->j:Li40;

    new-instance v4, Lln;

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/lit16 v5, v5, 0x1dc

    invoke-direct {v4, v15, v5}, Lln;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v14, v4}, Lh40;->a(Lsh;)V

    invoke-virtual {v14}, Lh40;->h()V

    sget v4, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v4, :cond_7

    const/16 v4, 0x45

    sput v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v4, "\u06e4\u06e3\u06e6"

    invoke-static {v4}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06e0\u06e3\u06e6"

    move-wide v4, v6

    goto/16 :goto_2

    :sswitch_d
    move-object/from16 v0, p0

    iget v4, v0, Lb6;->a:I

    packed-switch v4, :pswitch_data_0

    :sswitch_e
    sget v4, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v4, :cond_8

    const/16 v4, 0x1f

    sput v4, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    const-string v5, "\u06e5\u06e6\u06e2"

    move-object v4, v9

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u06e3\u06e8\u06e5"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_f
    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v3, v4}, Landroid/view/View;->setScaleY(F)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v20, 0x186

    sget v5, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    int-to-long v0, v5

    move-wide/from16 v22, v0

    xor-long v20, v20, v22

    move-wide/from16 v0, v20

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    sget v4, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/2addr v4, v5

    const v5, 0xdcd9

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_10
    const/high16 v4, 0x3f800000    # 1.0f

    const/high16 v5, 0x43480000    # 200.0f

    const v8, 0x3f19999a    # 0.6f

    invoke-static {v4, v5, v8}, Lz30;->f(FFF)Li40;

    move-result-object v4

    move-object/from16 v0, v17

    iput-object v4, v0, Lh40;->j:Li40;

    invoke-virtual/range {v17 .. v17}, Lh40;->h()V

    new-instance v4, Lh40;

    sget-object v5, Lh40;->o:Lqh;

    invoke-direct {v4, v15, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۦۤۨۢ()I

    move-result v5

    if-gtz v5, :cond_9

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v5, "\u06e2\u06e3\u06e7"

    invoke-static {v5}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v5

    move-object v14, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :cond_9
    sget v5, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v8, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/2addr v5, v8

    const v8, -0x1ac19c

    xor-int/2addr v5, v8

    move-object v14, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_11
    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v9, v4}, Landroid/view/View;->setScaleY(F)V

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v9}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v20, 0x206

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    int-to-long v0, v5

    move-wide/from16 v22, v0

    xor-long v20, v20, v22

    move-wide/from16 v0, v20

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    const-string v4, "\u06e7\u06df"

    goto/16 :goto_4

    :pswitch_3
    :sswitch_12
    sget v4, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    add-int/lit16 v5, v5, 0x14f6

    sub-int/2addr v4, v5

    if-ltz v4, :cond_a

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v4, "\u06e3\u06e4"

    invoke-static {v4}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_a
    sget v4, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v5, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    rem-int/2addr v4, v5

    const v5, 0x1ab1fb

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_13
    const/4 v4, 0x0

    const/high16 v5, 0x43480000    # 200.0f

    const v8, 0x3f333333    # 0.7f

    invoke-static {v4, v5, v8}, Lz30;->f(FFF)Li40;

    move-result-object v4

    iput-object v4, v10, Lh40;->j:Li40;

    new-instance v4, Lln;

    const/4 v5, 0x0

    invoke-direct {v4, v11, v5}, Lln;-><init>(Landroid/widget/LinearLayout;I)V

    invoke-virtual {v10, v4}, Lh40;->a(Lsh;)V

    invoke-virtual {v10}, Lh40;->h()V

    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/2addr v4, v5

    const v5, 0x1e93b9

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_14
    const/4 v4, 0x0

    invoke-virtual {v15, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v15}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v20, -0x379

    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    int-to-long v0, v5

    move-wide/from16 v22, v0

    xor-long v20, v20, v22

    move-wide/from16 v0, v20

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    new-instance v4, Lh40;

    sget-object v5, Lh40;->n:Lqh;

    invoke-direct {v4, v15, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v5

    if-gtz v5, :cond_b

    const-string v5, "\u06df\u06e5\u06e8"

    invoke-static {v5}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v17, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :cond_b
    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sub-int/2addr v5, v8

    const v8, 0x1ac891

    add-int/2addr v5, v8

    move-object/from16 v17, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v2}, Lmn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const/high16 v4, 0x44fa0000    # 2000.0f

    invoke-virtual {v2, v4}, Landroid/view/View;->setTranslationY(F)V

    sget v4, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    rem-int/lit16 v5, v5, 0x43b

    add-int/2addr v4, v5

    if-gtz v4, :cond_c

    const-string v4, "\u06e6\u06e5\u06e1"

    invoke-static {v4}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u06e5\u06e8"

    :goto_5
    invoke-static {v4}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_16
    sget v4, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v5, v5, 0x397

    rem-int/2addr v4, v5

    if-ltz v4, :cond_d

    const-string v4, "\u06e7\u06e7\u06e5"

    :goto_6
    invoke-static {v4}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e2\u06e4\u06e6"

    goto :goto_6

    :sswitch_17
    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v4}, Lmn;->a(Landroid/app/Dialog;)V

    sget v8, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    move-object/from16 v0, p0

    iget-object v5, v0, Lb6;->c:Landroid/widget/LinearLayout;

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    if-gtz v4, :cond_e

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    const-string v4, "\u06e3\u06e8\u06e5"

    invoke-static {v4}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v4

    move-object v11, v5

    move v12, v8

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_e
    const-string v11, "\u06e3\u06e4\u06e1"

    move-object v4, v10

    move-object v13, v11

    :goto_7
    invoke-static {v13}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v13

    move-object v10, v4

    move-object v11, v5

    move v12, v8

    move/from16 v19, v13

    goto/16 :goto_0

    :sswitch_18
    new-instance v4, Lh40;

    sget-object v5, Lh40;->n:Lqh;

    invoke-direct {v4, v9, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v5, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    mul-int/lit16 v5, v5, -0x43b

    div-int/2addr v4, v5

    if-eqz v4, :cond_f

    const/16 v4, 0x1e

    sput v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v4, "\u06e0\u06e3\u06e1"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06e1\u06e3\u06e7"

    goto/16 :goto_1

    :sswitch_19
    xor-int/lit16 v4, v12, -0x18b

    const/4 v5, 0x0

    invoke-virtual {v11, v4, v5}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const/high16 v4, 0x44480000    # 800.0f

    invoke-virtual {v11, v4}, Landroid/view/View;->setTranslationY(F)V

    new-instance v4, Lh40;

    sget-object v5, Lh40;->m:Lqh;

    invoke-direct {v4, v11, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v5, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    if-ltz v5, :cond_10

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v10, "\u06e7\u06e8\u06e6"

    move-object v5, v11

    move v8, v12

    move-object v13, v10

    goto :goto_7

    :cond_10
    sget v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    mul-int/2addr v5, v8

    const v8, -0x1b2d55

    xor-int/2addr v5, v8

    move-object v10, v4

    move/from16 v19, v5

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v4}, Lmn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v5, 0x3f19999a    # 0.6f

    invoke-virtual {v4, v5}, Landroid/view/View;->setScaleX(F)V

    const-string v5, "\u06e3\u06e5\u06e6"

    goto/16 :goto_3

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v4}, Lmn;->a(Landroid/app/Dialog;)V

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lb6;->c:Landroid/widget/LinearLayout;

    sget v8, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v13, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sub-int/2addr v8, v13

    const v13, 0x1aad76

    add-int/2addr v8, v13

    move-object v15, v4

    move/from16 v18, v5

    move/from16 v19, v8

    goto/16 :goto_0

    :sswitch_1c
    new-instance v4, Lh40;

    sget-object v5, Lh40;->m:Lqh;

    invoke-direct {v4, v2, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/4 v5, 0x0

    const/high16 v8, 0x43480000    # 200.0f

    const/high16 v13, 0x3f400000    # 0.75f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    mul-int/2addr v4, v5

    const v5, 0x19dab9

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :pswitch_4
    :sswitch_1d
    const-string v5, "\u06e6\u06df\u06e1"

    move-object v4, v9

    goto/16 :goto_3

    :sswitch_1e
    const v4, 0x3f19999a    # 0.6f

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Landroid/view/View;->setScaleY(F)V

    const/4 v4, 0x0

    move-object/from16 v0, v16

    invoke-virtual {v0, v4}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual/range {v16 .. v16}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const-wide/16 v20, 0x36a

    sget v5, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    int-to-long v0, v5

    move-wide/from16 v22, v0

    xor-long v20, v20, v22

    move-wide/from16 v0, v20

    invoke-virtual {v4, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/ViewPropertyAnimator;->start()V

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    move-result v4

    if-ltz v4, :cond_11

    const-string v4, "\u06e3\u06df\u06e8"

    invoke-static {v4}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_11
    sget v4, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    add-int/2addr v4, v5

    const v5, 0x1aaa42

    add-int/2addr v4, v5

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_1f
    new-instance v4, Lh40;

    sget-object v5, Lh40;->n:Lqh;

    invoke-direct {v4, v3, v5}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v8, 0x43480000    # 200.0f

    const v13, 0x3f19999a    # 0.6f

    invoke-static {v5, v8, v13}, Lz30;->f(FFF)Li40;

    move-result-object v5

    iput-object v5, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    sget v4, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    if-ltz v4, :cond_13

    :cond_12
    const-string v4, "\u06e8\u06e5\u06e7"

    invoke-static {v4}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :cond_13
    const-string v4, "\u06e8\u06e0\u06e4"

    invoke-static {v4}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v4

    move/from16 v19, v4

    goto/16 :goto_0

    :sswitch_20
    move-object/from16 v0, p0

    iget-object v3, v0, Lb6;->b:Landroid/app/Dialog;

    invoke-static {v3}, Lmn;->a(Landroid/app/Dialog;)V

    move-object/from16 v0, p0

    iget-object v3, v0, Lb6;->c:Landroid/widget/LinearLayout;

    const v4, 0x3f19999a    # 0.6f

    invoke-virtual {v3, v4}, Landroid/view/View;->setScaleX(F)V

    sget v4, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    div-int/lit16 v5, v5, -0xb7

    add-int/2addr v4, v5

    if-gtz v4, :cond_14

    const-string v4, "\u06e8\u06e6\u06df"

    goto/16 :goto_5

    :cond_14
    const-string v5, "\u06e5\u06e7\u06e0"

    move-object v4, v9

    goto/16 :goto_3

    :sswitch_21
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc40 -> :sswitch_0
        0xdca3 -> :sswitch_5
        0xdcbb -> :sswitch_1f
        0xdcd8 -> :sswitch_18
        0xdce0 -> :sswitch_21
        0x1aa71f -> :sswitch_7
        0x1aa7c2 -> :sswitch_1c
        0x1aa7fd -> :sswitch_21
        0x1aab3e -> :sswitch_9
        0x1aab43 -> :sswitch_21
        0x1aaf04 -> :sswitch_4
        0x1aaf05 -> :sswitch_2
        0x1aaf61 -> :sswitch_1d
        0x1ab282 -> :sswitch_17
        0x1ab2a6 -> :sswitch_1b
        0x1ab2c6 -> :sswitch_a
        0x1ab2e4 -> :sswitch_d
        0x1ab60c -> :sswitch_e
        0x1ab647 -> :sswitch_1e
        0x1ab664 -> :sswitch_21
        0x1ab6a0 -> :sswitch_19
        0x1ab6c4 -> :sswitch_11
        0x1ab71c -> :sswitch_3
        0x1ab720 -> :sswitch_15
        0x1ab723 -> :sswitch_13
        0x1aba47 -> :sswitch_6
        0x1aba61 -> :sswitch_21
        0x1aba87 -> :sswitch_16
        0x1abe5e -> :sswitch_20
        0x1abe5f -> :sswitch_1a
        0x1abe7e -> :sswitch_f
        0x1ac148 -> :sswitch_8
        0x1ac202 -> :sswitch_c
        0x1ac566 -> :sswitch_12
        0x1ac568 -> :sswitch_10
        0x1ac625 -> :sswitch_1
        0x1ac8ec -> :sswitch_b
        0x1ac98a -> :sswitch_14
        0x1ac9a1 -> :sswitch_21
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
