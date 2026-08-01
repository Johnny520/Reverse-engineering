.class public final synthetic Lrd;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final a:Landroid/widget/ListView;

.field public final b:Landroid/view/View;

.field public final c:Lf00;

.field public final d:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ListView;Landroid/view/View;Lf00;Landroid/widget/FrameLayout;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e0\u06e4\u06e7"

    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p4, p0, Lrd;->d:Landroid/widget/FrameLayout;

    sget v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac665

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۢ۟ۡۧ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    div-int/lit16 v2, v2, 0x45c

    xor-int/2addr v0, v2

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟ۢۡ۟۟()I

    const-string v0, "\u06e0\u06e5\u06e0"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e2\u06e3\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    :sswitch_2
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    if-ltz v0, :cond_2

    const/16 v0, 0x3d

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e4\u06e1\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e3\u06df\u06e7"

    goto :goto_2

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v0, :cond_3

    const-string v0, "\u06df\u06e5\u06df"

    invoke-static {v0}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e3\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Lrd;->a:Landroid/widget/ListView;

    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/lit16 v2, v2, -0x20c8

    or-int/2addr v0, v2

    if-ltz v0, :cond_4

    :cond_4
    const-string v0, "\u06df\u06e8\u06e2"

    goto :goto_1

    :sswitch_5
    iput-object p2, p0, Lrd;->b:Landroid/view/View;

    const-string v0, "\u06e8\u06e5\u06e5"

    invoke-static {v0}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_6
    const-string v0, "jGjQs6zr6sJP5Eeg"

    invoke-static {v0}, Landroidx/fragment/app/۟ۧۡۦ;->ۣۣ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    add-int/lit16 v2, v2, -0xc3

    sub-int/2addr v0, v2

    if-gtz v0, :cond_5

    const/16 v0, 0x32

    sput v0, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v0, "\u06e8\u06e5\u06e5"

    invoke-static {v0}, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۧۦۢ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06df\u06e5\u06df"

    goto :goto_2

    :sswitch_7
    iput-object p3, p0, Lrd;->c:Lf00;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_6

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v0, "\u06e3\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_6
    const-string v0, "\u06e1\u06e6"

    goto :goto_1

    :sswitch_8
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    if-ltz v0, :cond_7

    const/16 v0, 0x47

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    const-string v0, "\u06df\u06df\u06e2"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v0, v2

    const v2, 0x1aaa40

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_0
        0x1aa7b9 -> :sswitch_3
        0x1aa819 -> :sswitch_5
        0x1aab63 -> :sswitch_4
        0x1aab7b -> :sswitch_8
        0x1ab2c3 -> :sswitch_6
        0x1ab60b -> :sswitch_9
        0x1ac18d -> :sswitch_2
        0x1ac603 -> :sswitch_1
        0x1ac988 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 15

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e1\u06e5\u06e0"

    invoke-static {v5}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v2

    move v14, v4

    move v11, v5

    :goto_0
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "\u06e3\u06e6\u06e1"

    move-object v4, v2

    move v5, v3

    :goto_1
    invoke-static {v4}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->۠ۦۦۨ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move v3, v5

    goto :goto_0

    :sswitch_1
    const-string v2, "\u06e6\u06e0"

    move-object v4, v2

    move v5, v3

    move v6, v7

    goto :goto_1

    :sswitch_2
    iget-object v2, p0, Lrd;->a:Landroid/widget/ListView;

    iget-object v5, p0, Lrd;->b:Landroid/view/View;

    invoke-static {}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟ۧۢ۟ۧ()I

    move-result v4

    if-gtz v4, :cond_0

    const-string v4, "\u06df\u06df\u06e6"

    invoke-static {v4}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v4

    move-object v9, v2

    move-object v10, v5

    move v11, v4

    goto :goto_0

    :cond_0
    const-string v9, "\u06e3\u06e5\u06e2"

    move-object v4, v2

    move-object v11, v9

    move v12, v3

    :goto_2
    invoke-static {v11}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v9, v4

    move-object v10, v5

    move v11, v2

    move v3, v12

    goto :goto_0

    :sswitch_3
    iget v1, v13, Lf00;->a:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpg-float v2, v1, v2

    if-nez v2, :cond_4

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v4, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    or-int/lit16 v4, v4, -0x20eb

    add-int/2addr v2, v4

    if-ltz v2, :cond_1

    const-string v2, "\u06df\u06df\u06e1"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :cond_1
    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    sget v4, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    xor-int/2addr v2, v4

    const v4, 0x1ab8dc

    add-int/2addr v2, v4

    move v11, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    invoke-static {}, Landroidx/core/widget/ۣۤۨۢ;->ۥۢۡۥ()I

    move-result v2

    if-ltz v2, :cond_3

    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    const-string v2, "\u06e3\u06e0\u06e7"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :cond_3
    const-string v2, "\u06e1\u06df\u06e3"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto :goto_0

    :sswitch_5
    const/4 v0, 0x1

    return v0

    :cond_4
    :sswitch_6
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    if-gtz v2, :cond_5

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v2, "\u06df\u06e6\u06e8"

    :goto_4
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u06e4\u06e1\u06e8"

    goto :goto_4

    :sswitch_7
    move v2, v3

    :cond_6
    sget v3, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    if-gtz v3, :cond_7

    const-string v3, "\u06df\u06e8\u06e8"

    move-object v4, v3

    move v5, v2

    goto/16 :goto_1

    :cond_7
    const-string v3, "\u06e8\u06e2\u06e5"

    move-object v4, v3

    move v5, v2

    goto/16 :goto_1

    :sswitch_8
    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    div-int/2addr v2, v4

    const v4, -0x1ab721

    xor-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    const-string v2, "\u06e3\u06e6\u06e1"

    move v4, v8

    :goto_5
    invoke-static {v2}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    move v8, v4

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {v0, v6}, Landroid/view/View;->setTranslationY(F)V

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v4, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/2addr v2, v4

    const v4, 0x1aaec7

    add-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {v10}, Landroid/view/View;->getY()F

    move-result v2

    const/4 v4, 0x0

    invoke-virtual {v9}, Landroid/view/View;->getY()F

    move-result v5

    sub-float/2addr v4, v5

    sub-float v8, v2, v4

    sget v2, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v2, v2, -0x26b

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v8, v2

    if-lez v2, :cond_f

    sget v2, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    or-int/lit16 v4, v4, 0x5dd

    div-int/2addr v2, v4

    if-eqz v2, :cond_8

    const/16 v2, 0xa

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e4\u06e1\u06e8"

    invoke-static {v2}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v4, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    rem-int/2addr v2, v4

    const v4, 0x1aaf48

    add-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_c
    sget v2, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/lit16 v2, v2, -0x167

    invoke-static {v2}, Lff;->q(I)I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, v8, v2

    if-gez v2, :cond_f

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v2, :cond_9

    const-string v2, "\u06e2\u06e7\u06e2"

    :goto_6
    invoke-static {v2}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06e7\u06e3\u06e7"

    goto :goto_6

    :sswitch_d
    sget v2, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v4, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    div-int/2addr v2, v4

    const v4, 0x1ac96d

    add-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_e
    iput v8, v13, Lf00;->a:F

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    div-int/lit16 v4, v4, -0x2130

    mul-int/2addr v2, v4

    if-eqz v2, :cond_a

    const/16 v2, 0x2b

    sput v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v2, "\u06df\u06e1\u06e3"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e3\u06e5\u06e4"

    :goto_7
    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :sswitch_f
    iget-object v0, p0, Lrd;->d:Landroid/widget/FrameLayout;

    const/4 v2, -0x1

    if-eq v14, v2, :cond_2

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v4, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    or-int/2addr v2, v4

    const v4, 0x1aa7f2

    add-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :cond_b
    move v6, v8

    :sswitch_10
    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v4, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit8 v4, v4, -0x55

    add-int/2addr v2, v4

    if-gtz v2, :cond_c

    const/16 v2, 0x44

    sput v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    const-string v2, "\u06e1\u06e2"

    goto/16 :goto_3

    :cond_c
    sget v2, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v4, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    xor-int/2addr v2, v4

    const v4, -0xdca2

    xor-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Landroidx/emoji2/text/ۣۣ۟۟۠;->ۢۡۢۦ()I

    move-result v2

    if-gtz v2, :cond_d

    const/16 v2, 0x16

    sput v2, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    const-string v2, "\u06e3\u06e5\u06e2"

    move v7, v3

    goto :goto_7

    :cond_d
    sget v2, Lkotlinx/coroutines/ۦۡۧۧ;->ۣ۠ۥۡ:I

    sget v4, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v2, v4

    const v4, 0x1ab3a3

    add-int/2addr v2, v4

    move v11, v2

    move v7, v3

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟۟ۤۥ۠()I

    move-result v2

    if-gtz v2, :cond_e

    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    const-string v2, "\u06e2\u06e6\u06df"

    move v4, v8

    goto/16 :goto_5

    :cond_e
    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    sget v4, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sub-int/2addr v2, v4

    const v4, 0x1aacc1

    xor-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :cond_f
    :sswitch_13
    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    sget v4, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    xor-int/lit16 v4, v4, 0x95a

    sub-int/2addr v2, v4

    if-ltz v2, :cond_10

    const-string v2, "\u06e0\u06e4\u06e8"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->۟ۥۣۥۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_10
    const-string v2, "\u06e3\u06e5\u06e4"

    move v4, v8

    goto/16 :goto_5

    :sswitch_14
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v2

    if-ltz v2, :cond_11

    const-string v2, "\u06df\u06e6\u06e6"

    invoke-static {v2}, Landroidx/activity/result/ۣۥۣ۟;->ۨۤ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move v11, v2

    goto/16 :goto_0

    :cond_11
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v4, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    rem-int/2addr v2, v4

    const v4, -0x1aaeb5

    xor-int/2addr v2, v4

    move v11, v2

    goto/16 :goto_0

    :sswitch_15
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    iget-object v2, p0, Lrd;->c:Lf00;

    sget v5, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v11, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    add-int/lit16 v11, v11, -0x175a

    sub-int/2addr v5, v11

    if-gtz v5, :cond_12

    const/16 v5, 0x35

    sput v5, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    const-string v5, "\u06e3\u06e3\u06df"

    invoke-static {v5}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v2

    move v14, v4

    move v11, v5

    goto/16 :goto_0

    :cond_12
    const-string v5, "\u06e6\u06e3\u06e2"

    invoke-static {v5}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v13, v2

    move v14, v4

    move v11, v5

    goto/16 :goto_0

    :sswitch_16
    iget v2, v13, Lf00;->a:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpg-float v3, v2, v3

    if-nez v3, :cond_6

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v3

    if-ltz v3, :cond_13

    const/16 v3, 0x2d

    sput v3, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v3, "\u06e5\u06e7\u06e1"

    move-object v4, v9

    move-object v5, v10

    move-object v11, v3

    move v12, v2

    goto/16 :goto_2

    :cond_13
    const-string v3, "\u06e0\u06e4\u06e6"

    move-object v4, v3

    move v5, v2

    goto/16 :goto_1

    :sswitch_17
    cmpg-float v2, v8, v3

    if-gez v2, :cond_b

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v4, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v2, v4

    const v4, 0x1ac23b

    add-int/2addr v2, v4

    move v11, v2

    move v6, v8

    goto/16 :goto_0

    :sswitch_18
    const-string v2, "\u06e5\u06e8\u06e8"

    move v4, v8

    move v6, v8

    goto/16 :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9f -> :sswitch_0
        0xdcba -> :sswitch_a
        0x1aa701 -> :sswitch_7
        0x1aa706 -> :sswitch_6
        0x1aa741 -> :sswitch_b
        0x1aa7df -> :sswitch_4
        0x1aab62 -> :sswitch_18
        0x1aae85 -> :sswitch_3
        0x1aaea3 -> :sswitch_0
        0x1aaec7 -> :sswitch_14
        0x1aaf3c -> :sswitch_2
        0x1aaf42 -> :sswitch_c
        0x1ab33d -> :sswitch_1
        0x1ab625 -> :sswitch_10
        0x1ab67f -> :sswitch_8
        0x1ab6c0 -> :sswitch_15
        0x1ab6c2 -> :sswitch_16
        0x1ab6de -> :sswitch_5
        0x1ab720 -> :sswitch_0
        0x1aba0b -> :sswitch_9
        0x1abe04 -> :sswitch_13
        0x1abe7f -> :sswitch_12
        0x1abea5 -> :sswitch_d
        0x1ac1a3 -> :sswitch_11
        0x1ac1c5 -> :sswitch_f
        0x1ac58b -> :sswitch_e
        0x1ac92b -> :sswitch_17
        0x1ac96c -> :sswitch_10
    .end sparse-switch
.end method
