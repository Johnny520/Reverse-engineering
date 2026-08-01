.class public final synthetic Lmk;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;

.field public final c:I


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;II)V
    .locals 3

    iput p3, p0, Lmk;->a:I

    iput-object p1, p0, Lmk;->b:Landroid/widget/LinearLayout;

    iput p2, p0, Lmk;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06df\u06e1"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "txjQgymwXcYwWxOV0iwFyBelP"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->ۥۦۤۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget v1, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    div-int/2addr v1, v2

    const v2, 0x1abaa6

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_1
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :cond_0
    const-string v1, "\u06e7\u06e7\u06e2"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v1, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/lit16 v2, v2, 0x572

    rem-int/2addr v1, v2

    if-gtz v1, :cond_2

    const-string v1, "\u06e3\u06e8\u06e7"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    mul-int/2addr v1, v2

    const v2, -0x1ec42f

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    move-result v1

    if-ltz v1, :cond_1

    sget v1, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    add-int/lit16 v2, v2, -0x1b81

    div-int/2addr v1, v2

    if-nez v1, :cond_0

    sget v1, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    add-int/2addr v1, v2

    const v2, 0x1abbd1

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    rem-int/lit16 v2, v2, 0x1bd3

    mul-int/2addr v1, v2

    if-ltz v1, :cond_3

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v1, "\u06e3\u06e0\u06e5"

    invoke-static {v1}, L۠ۡۢۨ;->۟ۡۧۡۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e4\u06df\u06e1"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1ab669 -> :sswitch_0
        0x1ab9c6 -> :sswitch_3
        0x1abaa4 -> :sswitch_1
        0x1ac14d -> :sswitch_4
        0x1ac263 -> :sswitch_2
        0x1ac602 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 13

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x0

    const-string v9, "\u06df\u06e5\u06e7"

    invoke-static {v9}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۧۡ۟ۥ(Ljava/lang/Object;)I

    move-result v9

    move-object v10, v3

    :goto_0
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v3, 0x0

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v12, 0x3f400000    # 0.75f

    invoke-static {v3, v9, v12}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v4, Lh40;->j:Li40;

    invoke-virtual {v4}, Lh40;->h()V

    const-string v3, "\u06e7\u06e1\u06e5"

    :goto_1
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :sswitch_1
    const/4 v3, 0x0

    const/high16 v9, 0x43480000    # 200.0f

    const/high16 v12, 0x3f400000    # 0.75f

    invoke-static {v3, v9, v12}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v7, Lh40;->j:Li40;

    invoke-virtual {v7}, Lh40;->h()V

    sget v3, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v9, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    add-int/2addr v3, v9

    const v9, -0x1aa86f

    xor-int/2addr v3, v9

    move v9, v3

    goto :goto_0

    :sswitch_2
    iget v3, p0, Lmk;->c:I

    int-to-float v8, v3

    iget-object v3, p0, Lmk;->b:Landroid/widget/LinearLayout;

    sget v6, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v9, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/lit16 v9, v9, -0x154

    mul-int/2addr v6, v9

    if-gtz v6, :cond_0

    const-string v6, "\u06df\u06e5\u06e2"

    invoke-static {v6}, L۟ۡۦۧۤ;->ۣۣ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v3

    goto :goto_0

    :cond_0
    const-string v6, "\u06e3\u06e3\u06e2"

    move-object v9, v6

    :goto_2
    invoke-static {v9}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v9

    move-object v6, v3

    goto :goto_0

    :sswitch_3
    iget v1, p0, Lmk;->c:I

    int-to-float v2, v1

    iget-object v1, p0, Lmk;->b:Landroid/widget/LinearLayout;

    sget v3, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v9, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/lit16 v9, v9, 0x17a8

    div-int/2addr v3, v9

    if-eqz v3, :cond_2

    invoke-static {}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۢۧۥۧ()I

    :cond_1
    const-string v3, "\u06e5\u06e4\u06e8"

    invoke-static {v3}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :cond_2
    const-string v3, "\u06e4\u06e2\u06e4"

    :goto_3
    invoke-static {v3}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto :goto_0

    :sswitch_4
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v3

    if-gtz v3, :cond_5

    const-string v3, "0Mu916ZSfBC"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟۟۟ۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    sget v3, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v9, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    xor-int/lit16 v9, v9, 0x24a6

    div-int/2addr v3, v9

    if-eqz v3, :cond_3

    const/16 v3, 0x38

    sput v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    move-object v3, v4

    :goto_4
    const-string v4, "\u06e4\u06e4"

    invoke-static {v4}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    move-object v4, v3

    goto/16 :goto_0

    :cond_3
    sget v3, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v9, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    add-int/2addr v3, v9

    const v9, -0x1acad9

    xor-int/2addr v3, v9

    move v9, v3

    goto/16 :goto_0

    :sswitch_5
    sget v3, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    if-ltz v3, :cond_4

    const/16 v3, 0x22

    sput v3, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    const-string v3, "\u06e8\u06e8\u06e5"

    :goto_5
    invoke-static {v3}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06df\u06e5\u06e7"

    goto :goto_5

    :sswitch_6
    const/4 v3, 0x0

    const/high16 v9, 0x43480000    # 200.0f

    const v12, 0x3f333333    # 0.7f

    invoke-static {v3, v9, v12}, Lz30;->f(FFF)Li40;

    move-result-object v3

    iput-object v3, v0, Lh40;->j:Li40;

    invoke-virtual {v0}, Lh40;->h()V

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sget v9, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    rem-int/lit16 v9, v9, -0xb01

    mul-int/2addr v3, v9

    if-ltz v3, :cond_1

    const/16 v3, 0x54

    sput v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    const-string v3, "\u06e5\u06e3\u06e6"

    invoke-static {v3}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :cond_5
    :sswitch_7
    sget v3, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v9, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    rem-int/2addr v3, v9

    const v9, 0x1aaf1f

    add-int/2addr v3, v9

    move v9, v3

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v6, v8}, Landroid/view/View;->setTranslationY(F)V

    new-instance v3, Lh40;

    sget-object v4, Lh40;->m:Lqh;

    invoke-direct {v3, v6, v4}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    goto :goto_4

    :sswitch_9
    iget v3, p0, Lmk;->c:I

    int-to-float v11, v3

    iget-object v3, p0, Lmk;->b:Landroid/widget/LinearLayout;

    sget v9, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v10, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sub-int/2addr v9, v10

    const v10, 0x1abe5b

    add-int/2addr v9, v10

    move-object v10, v3

    goto/16 :goto_0

    :pswitch_0
    :sswitch_a
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v9, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/lit8 v9, v9, -0x7a

    rem-int/2addr v3, v9

    if-gtz v3, :cond_6

    const-string v3, "\u06e3\u06df\u06e0"

    goto/16 :goto_1

    :cond_6
    const-string v3, "\u06e8\u06e4\u06e3"

    invoke-static {v3}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_b
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v5}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v3, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v9, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    mul-int/2addr v3, v9

    const v9, 0x1aba1b

    add-int/2addr v3, v9

    move v9, v3

    goto/16 :goto_0

    :pswitch_1
    :sswitch_c
    sget v3, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    if-gtz v3, :cond_7

    const-string v3, "\u06e4\u06e2\u06e3"

    goto/16 :goto_3

    :cond_7
    sget v3, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sget v9, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    or-int/2addr v3, v9

    const v9, -0x1ab59d

    xor-int/2addr v3, v9

    move v9, v3

    goto/16 :goto_0

    :sswitch_d
    iget v3, p0, Lmk;->a:I

    packed-switch v3, :pswitch_data_0

    :sswitch_e
    const-string v3, "\u06e8\u06e7\u06e5"

    invoke-static {v3}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v3

    move v9, v3

    goto/16 :goto_0

    :sswitch_f
    invoke-virtual {v10, v11}, Landroid/view/View;->setTranslationY(F)V

    new-instance v7, Lh40;

    sget-object v3, Lh40;->m:Lqh;

    invoke-direct {v7, v10, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    sget v3, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v9, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    div-int/lit16 v9, v9, 0x2492

    add-int/2addr v3, v9

    if-ltz v3, :cond_8

    const/16 v3, 0x3f

    sput v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    const-string v9, "\u06df\u06e5\u06e7"

    move-object v3, v6

    goto/16 :goto_2

    :cond_8
    sget v3, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    xor-int/2addr v3, v9

    const v9, 0x1ac0d4

    add-int/2addr v3, v9

    move v9, v3

    goto/16 :goto_0

    :sswitch_10
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    new-instance v0, Lh40;

    sget-object v3, Lh40;->m:Lqh;

    invoke-direct {v0, v1, v3}, Lh40;-><init>(Ljava/lang/Object;Lip;)V

    const-string v3, "\u06e5\u06e6\u06e1"

    goto/16 :goto_3

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc80 -> :sswitch_0
        0x1aa7bc -> :sswitch_a
        0x1aa7c1 -> :sswitch_d
        0x1aaae2 -> :sswitch_5
        0x1aabdc -> :sswitch_c
        0x1aaee2 -> :sswitch_11
        0x1aaf44 -> :sswitch_11
        0x1aaf7d -> :sswitch_7
        0x1ab682 -> :sswitch_8
        0x1ab71c -> :sswitch_9
        0x1aba26 -> :sswitch_10
        0x1abe08 -> :sswitch_f
        0x1abe29 -> :sswitch_4
        0x1abe60 -> :sswitch_6
        0x1ac21f -> :sswitch_1
        0x1ac54b -> :sswitch_11
        0x1ac8ed -> :sswitch_b
        0x1ac90b -> :sswitch_e
        0x1ac967 -> :sswitch_2
        0x1ac9c6 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
