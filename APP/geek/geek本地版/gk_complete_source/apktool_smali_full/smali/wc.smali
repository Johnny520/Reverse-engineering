.class public final Lwc;
.super Landroid/widget/BaseAdapter;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Landroid/app/Activity;

.field public final c:Lon;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Lon;)V
    .locals 3

    iput-object p1, p0, Lwc;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lwc;->b:Landroid/app/Activity;

    iput-object p3, p0, Lwc;->c:Lon;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e1\u06e1"

    invoke-static {v1}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/lit16 v2, v2, -0x16d0

    xor-int/2addr v1, v2

    if-ltz v1, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v1, "\u06e2\u06e1\u06e8"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/2addr v1, v2

    const v2, 0x1ac3ed

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/2addr v1, v2

    const v2, 0x1ab857

    xor-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v1, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    xor-int/2addr v1, v2

    const v2, 0x1abc8a

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    const-string v0, "IQf2pvPcQP9MTyQgyvBza0xK1"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۧۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/lit16 v2, v2, 0xcfb

    div-int/2addr v1, v2

    if-eqz v1, :cond_2

    :goto_2
    const-string v1, "\u06e2\u06e2\u06e5"

    invoke-static {v1}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e1\u06df\u06e7"

    goto :goto_1

    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v1

    if-ltz v1, :cond_1

    goto :goto_2

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_0
        0x1aae89 -> :sswitch_1
        0x1ab2a5 -> :sswitch_3
        0x1ab609 -> :sswitch_2
        0x1abdc8 -> :sswitch_5
        0x1ac547 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    iget-object v0, p0, Lwc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e5\u06e1"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    mul-int/lit16 v2, v2, -0x2106

    div-int/2addr v0, v2

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    const-string v0, "\u06e7\u06e8\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->ۡۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "hB2S/qDSYcc=\n"

    const-string v2, "43jm1o78T+4=\n"

    invoke-static {v0, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    if-gtz v0, :cond_0

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    const-string v0, "\u06df\u06e5\u06e1"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e3\u06e2\u06e4"

    goto :goto_1

    :cond_1
    const-string v0, "\u06df\u06e5\u06e1"

    goto :goto_1

    :sswitch_2
    iget-object v0, p0, Lwc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    div-int/lit16 v2, v2, 0xb37

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/recyclerview/widget/ۧۧۦۢ;->ۣۢۦۨ()I

    const-string v0, "\u06e3\u06e7\u06e3"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06e7\u06e3"

    goto :goto_2

    :sswitch_3
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0xdc3e -> :sswitch_0
        0x1aa7bb -> :sswitch_2
        0x1ab665 -> :sswitch_3
        0x1ab6ff -> :sswitch_1
    .end sparse-switch
.end method

.method public final getItemId(I)J
    .locals 2

    const-string v0, "\u06e0\u06df\u06e0"

    invoke-static {v0}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    int-to-long v0, p1

    return-wide v0

    :sswitch_1
    sget v0, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v1, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v0, v1

    const v1, 0x1aab8c

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aaac1 -> :sswitch_0
        0x1ac627 -> :sswitch_1
    .end sparse-switch
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 32

    const/4 v2, 0x0

    const/16 v29, 0x0

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/16 v21, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/16 v20, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/16 v27, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/4 v6, 0x0

    const-string v24, "\u06df\u06e8\u06df"

    invoke-static/range {v24 .. v24}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v31

    move-object/from16 v24, v2

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    :goto_0
    sparse-switch v31, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v2, 0x0

    const/4 v8, 0x1

    move-object/from16 v0, v27

    invoke-virtual {v0, v2, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, 0x0

    sget v9, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/lit16 v9, v9, 0x347

    const/high16 v31, 0x3f800000    # 1.0f

    move/from16 v0, v31

    invoke-direct {v2, v8, v9, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v2, 0x1

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    xor-int/2addr v2, v8

    const v8, 0x1aba5d

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto :goto_0

    :sswitch_1
    if-nez v21, :cond_16

    new-instance v12, Landroid/widget/LinearLayout;

    move-object/from16 v0, v19

    invoke-direct {v12, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/lit16 v2, v2, 0x2cb

    invoke-virtual {v12, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v8, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v8, v8, -0x3b6

    rem-int/2addr v2, v8

    if-gtz v2, :cond_0

    const-string v2, "\u06e6\u06e0\u06e8"

    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto :goto_0

    :cond_0
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v8, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/2addr v2, v8

    const v8, 0x1ac509

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto :goto_0

    :sswitch_2
    move-object/from16 v0, v27

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x41700000    # 15.0f

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lwc;->c:Lon;

    iget v2, v4, Lon;->e:I

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v2

    if-gtz v2, :cond_1

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۣۡۧۢ()I

    move-object v2, v3

    :goto_1
    const-string v3, "\u06e5\u06e5\u06df"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v8

    move-object v3, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :cond_1
    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v8, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v2, v8

    const v8, 0x24325

    sub-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_2
    move v2, v5

    :goto_2
    sget v6, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v8, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    div-int/lit16 v8, v8, 0x68b

    xor-int/2addr v6, v8

    if-gtz v6, :cond_3

    const/16 v6, 0x5c

    sput v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    const-string v6, "\u06e0\u06df\u06e5"

    move-object v8, v6

    move v9, v2

    :goto_3
    invoke-static {v8}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    move v6, v9

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06e8\u06e6\u06e8"

    move-object v8, v6

    move v9, v2

    :goto_4
    invoke-static {v8}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    move v6, v9

    goto/16 :goto_0

    :sswitch_3
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    mul-int/lit16 v8, v8, -0x17b3

    xor-int/2addr v2, v8

    if-ltz v2, :cond_5

    const/16 v2, 0x4c

    sput v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    :cond_4
    const-string v2, "\u06e4\u06e7\u06e1"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_5
    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v8, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sub-int/2addr v2, v8

    const v8, -0xd9bf

    xor-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_4
    move-object/from16 v0, v25

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v29, :cond_27

    sget-object v2, Lxn;->a:Landroid/graphics/Typeface;

    if-eqz v2, :cond_26

    sget v7, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v8, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    div-int/lit16 v8, v8, -0x1450

    sub-int/2addr v7, v8

    if-gtz v7, :cond_6

    const/16 v7, 0x51

    sput v7, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v7, "\u06df\u06e8\u06df"

    invoke-static {v7}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v8

    move-object v7, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e0\u06e3\u06e8"

    move-object v7, v2

    move v9, v6

    goto :goto_3

    :sswitch_5
    invoke-static/range {v22 .. v22}, Lff;->q(I)I

    move-result v2

    invoke-static/range {v22 .. v22}, Lff;->q(I)I

    move-result v8

    invoke-static/range {v22 .. v22}, Lff;->q(I)I

    move-result v9

    invoke-static/range {v22 .. v22}, Lff;->q(I)I

    move-result v31

    move/from16 v0, v31

    invoke-virtual {v12, v2, v8, v9, v0}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/high16 v8, 0x41800000    # 16.0f

    invoke-static {v8}, Lff;->p(F)F

    move-result v8

    invoke-virtual {v2, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v12, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v2, :cond_7

    const-string v2, "\u06df\u06df\u06e1"

    invoke-static {v2}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06e6\u06e0\u06e1"

    move-object v8, v2

    :goto_5
    invoke-static {v8}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_6
    invoke-virtual/range {v15 .. v16}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    move-result v2

    if-gtz v2, :cond_8

    const/16 v2, 0xe

    sput v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    const-string v2, "\u06e8\u06e6\u06e8"

    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/2addr v2, v8

    const v8, -0x1ab59e

    xor-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_7
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    xor-int/lit16 v2, v2, 0xb0

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x41800000    # 16.0f

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    sget v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    xor-int/lit16 v2, v2, 0x16d

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setGravity(I)V

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v2, v2, -0x25f

    :goto_6
    const-string v8, "\u06e4\u06e5\u06e0"

    move/from16 v17, v2

    goto :goto_5

    :sswitch_8
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_9

    const/16 v2, 0x43

    sput v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    move-object v2, v10

    move-object v8, v12

    :goto_7
    const-string v9, "\u06df\u06e0\u06e7"

    invoke-static {v9}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v9

    move-object v10, v2

    move-object v13, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :cond_9
    move-object v13, v12

    :goto_8
    const-string v2, "\u06e4\u06e0\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v8, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    add-int/lit16 v8, v8, 0x61a

    or-int/2addr v2, v8

    if-ltz v2, :cond_a

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    const-string v2, "\u06e5\u06e5\u06e5"

    invoke-static {v2}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move-object v10, v11

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_a
    move-object v2, v11

    move-object v8, v13

    goto :goto_7

    :sswitch_a
    const-string v2, "9Q==\n"

    const-string v8, "yvLk+BDKWx8=\n"

    invoke-static {v2, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v2, :cond_b

    const/16 v2, 0x28

    sput v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    const-string v2, "\u06e0\u06df\u06e2"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v20, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_b
    move-object/from16 v2, v19

    move/from16 v9, v22

    :goto_9
    const-string v19, "\u06e4\u06df\u06e1"

    invoke-static/range {v19 .. v19}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v31

    move-object/from16 v19, v2

    move-object/from16 v20, v8

    move/from16 v22, v9

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {v15, v6}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v0, v25

    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move-object/from16 v0, v27

    invoke-virtual {v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v13, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget v2, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    if-gtz v2, :cond_d

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    move-object v2, v14

    :cond_c
    const-string v8, "\u06e2\u06e7\u06e3"

    invoke-static {v8}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v8

    move-object v14, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :cond_d
    sget v2, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/2addr v2, v8

    const v8, 0x1aaec4

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_c
    const-string v2, "\u06e2\u06e5\u06e8"

    move-object v8, v2

    :goto_a
    invoke-static {v8}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v2

    if-ltz v2, :cond_e

    const-string v2, "\u06e6\u06e5\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_e
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/2addr v2, v8

    const v8, 0x1abf29

    xor-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_e
    const/4 v2, 0x0

    const/4 v8, 0x1

    move-object/from16 v0, v25

    invoke-virtual {v0, v2, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v8, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/lit16 v8, v8, -0x8d7

    or-int/2addr v2, v8

    if-ltz v2, :cond_f

    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    const-string v2, "\u06e4\u06e3\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_f
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v8, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    xor-int/2addr v2, v8

    const v8, -0xdeb7

    xor-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_10
    :sswitch_f
    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v8, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    add-int/lit16 v8, v8, -0xf62

    add-int/2addr v2, v8

    if-ltz v2, :cond_11

    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    const-string v9, "\u06e0\u06e3\u06e4"

    move-object v2, v15

    move-object/from16 v8, v16

    :goto_b
    invoke-static {v9}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v15, v2

    move-object/from16 v16, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :cond_11
    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v8, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    mul-int/2addr v2, v8

    const v8, 0x24f875

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_10
    move-object v2, v15

    move-object/from16 v8, v16

    :cond_12
    const-string v9, "\u06e3\u06e5\u06e5"

    goto :goto_b

    :sswitch_11
    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v8, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/lit16 v8, v8, -0x25e0

    xor-int/2addr v2, v8

    if-ltz v2, :cond_13

    const/16 v2, 0x5d

    sput v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v2, "\u06e0\u06e6\u06e6"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    move-object/from16 v21, v14

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e2\u06e5\u06e8"

    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    move-object/from16 v21, v14

    goto/16 :goto_0

    :sswitch_12
    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v2, :cond_14

    invoke-static {}, Lio/fastkv/ۦۣ۠ۨ;->۠ۡۨۧ()I

    goto/16 :goto_8

    :cond_14
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v8, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    rem-int/2addr v2, v8

    const v8, 0x1ac9e9

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_13
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v0, v26

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v28

    const-string v2, "sd0nks66Hn2kwRfKkPFCFw==\n"

    const-string v8, "xbJy4r7fbD4=\n"

    invoke-static {v2, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, v28

    invoke-static {v2, v0}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v2

    if-ltz v2, :cond_15

    invoke-static {}, Landroidx/legacy/content/۠ۥۣۥ;->۟۠ۧ۟۟()I

    const-string v2, "\u06e4\u06e5\u06e8"

    invoke-static {v2}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_15
    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v8, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    rem-int/2addr v2, v8

    const v8, -0x1ab2e7

    xor-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_16
    :sswitch_14
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v8, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/lit8 v8, v8, 0x43

    sub-int/2addr v2, v8

    if-gtz v2, :cond_17

    const-string v2, "\u06e2\u06e2\u06e2"

    :goto_c
    invoke-static {v2}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_17
    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    or-int/2addr v2, v8

    const v8, 0x1abc1c

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_15
    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, v19

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-string v8, "uWaU\n"

    const-string v9, "V8svz9LjGvo=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v8, Lxn;->a:Landroid/graphics/Typeface;

    if-eqz v8, :cond_12

    sget v9, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v9, :cond_18

    const/16 v9, 0x2f

    sput v9, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v9, "\u06e1\u06e5\u06e4"

    invoke-static {v9}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v15, v2

    move-object/from16 v16, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :cond_18
    sget v9, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v15, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    xor-int/2addr v9, v15

    const v15, 0x1aa3e7

    add-int/2addr v9, v15

    move-object v15, v2

    move-object/from16 v16, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :sswitch_16
    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v8, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    rem-int/lit16 v8, v8, 0x1728

    div-int/2addr v2, v8

    if-eqz v2, :cond_19

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v2, "\u06e5\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_19
    const-string v2, "\u06e6\u06e5\u06df"

    goto :goto_c

    :sswitch_17
    const-string v2, "\u06df\u06e8\u06df"

    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_18
    const/4 v2, 0x0

    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v9, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    rem-int/lit16 v9, v9, 0x7ee

    or-int/2addr v8, v9

    if-ltz v8, :cond_c

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    const-string v8, "\u06e2\u06e6"

    invoke-static {v8}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v8

    move-object v14, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v0, v25

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    sget v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v8, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    mul-int/lit16 v8, v8, 0x24e4

    rem-int/2addr v2, v8

    if-ltz v2, :cond_4

    const/16 v2, 0xb

    sput v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    const-string v2, "\u06e6\u06e7\u06e8"

    invoke-static {v2}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_1a
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    if-gtz v2, :cond_1a

    const/16 v2, 0x2a

    sput v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    move/from16 v2, v17

    move/from16 v6, v18

    goto/16 :goto_6

    :cond_1a
    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v6, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/2addr v2, v6

    const v6, -0x1ac91b

    xor-int/2addr v2, v6

    move/from16 v31, v2

    move/from16 v6, v18

    goto/16 :goto_0

    :sswitch_1b
    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lwc;->b:Landroid/app/Activity;

    sget v8, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    xor-int/lit16 v9, v8, -0x273

    sget v8, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v13, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    add-int/lit16 v13, v13, 0x12af

    xor-int/2addr v8, v13

    if-ltz v8, :cond_1b

    const/16 v8, 0x18

    sput v8, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    move-object/from16 v8, v20

    move-object/from16 v13, v21

    goto/16 :goto_9

    :cond_1b
    sget v8, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v13, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    xor-int/2addr v8, v13

    const v13, 0x1abaff

    add-int/2addr v8, v13

    move-object/from16 v19, v2

    move-object/from16 v13, v21

    move/from16 v22, v9

    move/from16 v31, v8

    goto/16 :goto_0

    :sswitch_1c
    sget-object v2, Lxc;->a:[I

    move-object/from16 v0, v24

    iget-object v8, v0, Luc;->a:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    array-length v9, v2

    rem-int/2addr v8, v9

    aget v8, v2, v8

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, v19

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    sget v9, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v10, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/lit16 v10, v10, -0x1386

    rem-int/2addr v9, v10

    if-gtz v9, :cond_1c

    const/16 v9, 0x1b

    sput v9, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v9, "\u06e3\u06e8\u06e2"

    invoke-static {v9}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟۠ۤۧ(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v25, v2

    move-object/from16 v10, v28

    move/from16 v30, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :cond_1c
    sget v9, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v10, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/2addr v9, v10

    const v10, 0x1abb38

    add-int/2addr v9, v10

    move-object/from16 v25, v2

    move-object/from16 v10, v28

    move/from16 v30, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :sswitch_1d
    invoke-virtual {v13}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_21

    const/4 v2, 0x0

    const/4 v8, 0x1

    move-object/from16 v0, v23

    invoke-virtual {v0, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v8, "Vi2xWdIHrP1CcP0EiFw=\n"

    const-string v9, "JVjTKqZ1xZM=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    sget v8, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v9, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    mul-int/2addr v8, v9

    xor-int/lit16 v8, v8, 0x63af

    move-object/from16 v26, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :sswitch_1e
    move/from16 v0, v30

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    move-object/from16 v0, v25

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance v2, Landroid/widget/TextView;

    move-object/from16 v0, v19

    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v8

    if-gtz v8, :cond_1d

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v8, "\u06e3\u06e4\u06e2"

    invoke-static {v8}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v27, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :cond_1d
    const-string v8, "\u06e4\u06e6\u06e3"

    invoke-static {v8}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v27, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :sswitch_1f
    move-object/from16 v0, p0

    iget-object v2, v0, Lwc;->a:Ljava/util/ArrayList;

    move/from16 v0, p1

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v8, "c+pRmlbfliM=\n"

    const-string v9, "FI8lsnjxuAo=\n"

    invoke-static {v8, v9}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v2, Luc;

    iget-boolean v8, v2, Luc;->c:Z

    sget v9, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v9, :cond_1e

    const-string v9, "\u06e2\u06e1\u06e2"

    invoke-static {v9}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v9

    move-object/from16 v24, v2

    move/from16 v29, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :cond_1e
    sget v9, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v24, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    or-int v9, v9, v24

    const v24, 0xdca7

    add-int v9, v9, v24

    move-object/from16 v24, v2

    move/from16 v29, v8

    move/from16 v31, v9

    goto/16 :goto_0

    :sswitch_20
    if-eqz v29, :cond_10

    const-string v2, "m9/k\n"

    const-string v8, "dFxXrxjforA=\n"

    invoke-static {v2, v8}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget v2, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v8, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/lit16 v8, v8, 0x251

    or-int/2addr v2, v8

    if-ltz v2, :cond_1f

    const/4 v2, 0x3

    sput v2, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_1f
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v8, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    add-int/2addr v2, v8

    const v8, 0x1ac247

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_21
    const/high16 v2, 0x41b00000    # 22.0f

    invoke-virtual {v15, v2}, Landroid/widget/TextView;->setTextSize(F)V

    move-object/from16 v0, v24

    iget-boolean v2, v0, Luc;->d:Z

    if-eqz v2, :cond_2

    iget v0, v4, Lon;->g:I

    move/from16 v18, v0

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    if-gtz v2, :cond_20

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    const-string v2, "\u06e5\u06e5\u06e6"

    invoke-static {v2}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    move v6, v5

    goto/16 :goto_0

    :cond_20
    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v6, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/2addr v2, v6

    const v6, 0x1aabb5

    xor-int/2addr v2, v6

    move/from16 v31, v2

    move v6, v5

    goto/16 :goto_0

    :cond_21
    :sswitch_22
    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v8, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    add-int/lit16 v8, v8, -0x1c1f

    add-int/2addr v2, v8

    if-ltz v2, :cond_22

    const/16 v2, 0x2b

    sput v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v2, "\u06e2\u06e1\u06e5"

    invoke-static {v2}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_22
    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v8, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/2addr v2, v8

    const v8, 0x1abdf3

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_23
    const-string v2, "\u06e6\u06e5\u06df"

    invoke-static {v2}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v28, v20

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_24
    move-object/from16 v0, v24

    iget-object v8, v0, Luc;->b:Ljava/lang/String;

    move-object/from16 v0, p2

    instance-of v2, v0, Landroid/widget/LinearLayout;

    if-eqz v2, :cond_23

    move-object/from16 v2, p2

    check-cast v2, Landroid/widget/LinearLayout;

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v21, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    mul-int v9, v9, v21

    const v21, 0x19fd9b

    add-int v9, v9, v21

    move-object/from16 v23, v8

    move/from16 v31, v9

    move-object/from16 v21, v2

    goto/16 :goto_0

    :sswitch_25
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static/range {v17 .. v17}, Lff;->q(I)I

    move-result v3

    invoke-static/range {v17 .. v17}, Lff;->q(I)I

    move-result v8

    invoke-direct {v2, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static/range {v22 .. v22}, Lff;->q(I)I

    move-result v3

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    move-object/from16 v0, v25

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    goto/16 :goto_1

    :cond_23
    move-object v2, v8

    :goto_d
    sget v8, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v9, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    mul-int/lit16 v9, v9, -0x75d

    add-int/2addr v8, v9

    if-ltz v8, :cond_24

    const-string v8, "\u06e2\u06e3\u06e4"

    move-object/from16 v23, v2

    goto/16 :goto_a

    :cond_24
    sget v8, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v9, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    add-int/2addr v8, v9

    const v9, 0x1ab2d9

    add-int/2addr v8, v9

    move-object/from16 v23, v2

    move/from16 v31, v8

    goto/16 :goto_0

    :sswitch_26
    new-instance v2, Ly5;

    sget v8, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    invoke-direct {v2, v0, v8, v1}, Ly5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v2, "\u06e4\u06e8\u06e1"

    invoke-static {v2}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_27
    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v2, :cond_25

    const/16 v2, 0x44

    sput v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v2, "\u06e1\u06e5\u06df"

    invoke-static {v2}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move/from16 v31, v2

    goto/16 :goto_0

    :cond_25
    const-string v9, "\u06e2\u06e6"

    move-object v2, v15

    move-object/from16 v8, v16

    goto/16 :goto_b

    :cond_26
    move-object v7, v2

    :cond_27
    :sswitch_28
    sget v2, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    sget v8, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    div-int/lit16 v8, v8, 0x1b6a

    or-int/2addr v2, v8

    if-ltz v2, :cond_28

    invoke-static {}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->۟ۡۨۢ()I

    const-string v2, "\u06e2\u06e0\u06e1"

    move-object v8, v2

    move v9, v6

    goto/16 :goto_4

    :cond_28
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v8, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    mul-int/2addr v2, v8

    const v8, 0x1a7c94

    add-int/2addr v2, v8

    move/from16 v31, v2

    goto/16 :goto_0

    :sswitch_29
    return-object v13

    :sswitch_2a
    move v2, v6

    goto/16 :goto_2

    :sswitch_2b
    move-object/from16 v2, v23

    goto :goto_d

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdc25 -> :sswitch_24
        0xdc40 -> :sswitch_16
        0xdc44 -> :sswitch_7
        0xdcdc -> :sswitch_13
        0x1aa701 -> :sswitch_16
        0x1aa726 -> :sswitch_4
        0x1aa740 -> :sswitch_6
        0x1aa79b -> :sswitch_22
        0x1aa800 -> :sswitch_17
        0x1aa816 -> :sswitch_1f
        0x1aaac3 -> :sswitch_2a
        0x1aaae3 -> :sswitch_c
        0x1aab02 -> :sswitch_1a
        0x1aab45 -> :sswitch_19
        0x1aaba0 -> :sswitch_10
        0x1aaec1 -> :sswitch_e
        0x1aaec4 -> :sswitch_26
        0x1aaf40 -> :sswitch_d
        0x1ab283 -> :sswitch_3
        0x1ab29f -> :sswitch_18
        0x1ab305 -> :sswitch_1b
        0x1ab33e -> :sswitch_11
        0x1ab6a1 -> :sswitch_14
        0x1ab6c3 -> :sswitch_21
        0x1ab71d -> :sswitch_27
        0x1ab9c6 -> :sswitch_23
        0x1ab9e6 -> :sswitch_28
        0x1ab9e9 -> :sswitch_1d
        0x1aba25 -> :sswitch_1
        0x1aba42 -> :sswitch_f
        0x1aba7f -> :sswitch_25
        0x1aba87 -> :sswitch_20
        0x1abaa1 -> :sswitch_2
        0x1ababe -> :sswitch_12
        0x1abadd -> :sswitch_29
        0x1abe04 -> :sswitch_15
        0x1abe3f -> :sswitch_1e
        0x1abe45 -> :sswitch_c
        0x1abe46 -> :sswitch_a
        0x1ac167 -> :sswitch_8
        0x1ac16e -> :sswitch_2b
        0x1ac200 -> :sswitch_1c
        0x1ac247 -> :sswitch_9
        0x1ac509 -> :sswitch_5
        0x1ac968 -> :sswitch_27
        0x1ac9aa -> :sswitch_b
    .end sparse-switch
.end method
