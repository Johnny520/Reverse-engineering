.class public final synthetic Lj80;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final a:Lf00;

.field public final b:Lf00;

.field public final c:Le00;

.field public final d:Lhm;


# direct methods
.method public synthetic constructor <init>(Lf00;Lf00;Le00;Lhm;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e8\u06e8"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p2, p0, Lj80;->b:Lf00;

    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۡۢۡۥ()I

    const-string v0, "\u06e3\u06e8\u06e8"

    :goto_1
    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/lit16 v2, v2, 0x362

    add-int/2addr v0, v2

    if-gtz v0, :cond_0

    const-string v0, "\u06e3\u06e5\u06e0"

    invoke-static {v0}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e0\u06e7"

    goto :goto_1

    :sswitch_2
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_6

    sget v0, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    :cond_1
    const-string v0, "\u06e8\u06e3\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    add-int/2addr v0, v2

    const v2, 0x1ab949

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "kwHMJgAJZ"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۨ۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v1

    if-ltz v1, :cond_8

    const-string v1, "\u06e0\u06e8\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    sget v2, Lcom/google/android/material/appbar/ۢۧۦۢ;->۟۟ۨۥۥ:I

    mul-int/2addr v0, v2

    const v2, 0x1a90b5

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p3, p0, Lj80;->c:Le00;

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v0, 0x8

    sput v0, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v0, "\u06e6\u06e0\u06e7"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_5
    iput-object p1, p0, Lj80;->a:Lf00;

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    mul-int/lit16 v2, v2, -0x1439

    add-int/2addr v0, v2

    if-gtz v0, :cond_4

    const-string v0, "\u06e4\u06e0\u06e2"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    div-int/2addr v0, v2

    const v2, 0x1aaba1

    xor-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v0, :cond_5

    const/4 v0, 0x2

    sput v0, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    const-string v0, "\u06e5\u06e3\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e3\u06e8\u06e8"

    goto :goto_2

    :cond_6
    :sswitch_7
    sget v0, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v2, v2, -0x1ff4

    mul-int/2addr v0, v2

    if-gtz v0, :cond_7

    const/16 v0, 0x19

    sput v0, Landroidx/constraintlayout/widget/۠ۥۨۨ;->ۡۤ۟ۦ:I

    const-string v0, "\u06e1\u06e0\u06e5"

    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1ac1cd

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    iput-object p4, p0, Lj80;->d:Lhm;

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_9

    move-object v0, v1

    :cond_8
    const-string v1, "\u06e4\u06e4\u06df"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto/16 :goto_0

    :cond_9
    const-string v0, "\u06e7\u06e3\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaba0 -> :sswitch_0
        0x1aabdb -> :sswitch_6
        0x1aaf00 -> :sswitch_4
        0x1ab6be -> :sswitch_3
        0x1ab723 -> :sswitch_5
        0x1ab9e6 -> :sswitch_7
        0x1aba5f -> :sswitch_1
        0x1ac16d -> :sswitch_9
        0x1ac588 -> :sswitch_2
        0x1ac94d -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12

    const/high16 v11, 0x41500000    # 13.0f

    const/high16 v10, 0x40a00000    # 5.0f

    const/4 v2, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v0, "\u06e3\u06e1"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v7

    move-object v3, v2

    move-object v4, v2

    move-object v0, v2

    move v5, v8

    move v6, v8

    :goto_0
    sparse-switch v7, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v2, v2, v10

    if-lez v2, :cond_6

    sget v2, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    if-ltz v2, :cond_9

    const/16 v2, 0x3b

    sput v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    const-string v2, "\u06e3\u06e6\u06e6"

    invoke-static {v2}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :sswitch_1
    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    rem-int/2addr v2, v7

    const v7, 0x1aabc2

    add-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :sswitch_2
    if-eqz v1, :cond_d

    if-eq v1, v9, :cond_1

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    sget v7, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v7, v7, 0x1e9f

    rem-int/2addr v2, v7

    if-ltz v2, :cond_0

    const/16 v2, 0x28

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e3\u06e7\u06df"

    invoke-static {v2}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_0
    sget v2, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    sget v7, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    sub-int/2addr v2, v7

    const v7, 0x1abe2e

    add-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :sswitch_3
    const/4 v2, 0x0

    iput-boolean v2, v3, Le00;->a:Z

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    xor-int/2addr v2, v7

    const v7, 0x1ab740

    xor-int/2addr v2, v7

    move v7, v2

    goto :goto_0

    :cond_1
    :sswitch_4
    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    move-result v2

    if-ltz v2, :cond_2

    const-string v2, "\u06e2\u06e4"

    invoke-static {v2}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e4\u06e2\u06e3"

    :goto_1
    invoke-static {v2}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto :goto_0

    :sswitch_5
    iput-boolean v9, v3, Le00;->a:Z

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v2

    const/high16 v7, 0x41a80000    # 21.0f

    sub-float/2addr v2, v7

    add-float/2addr v2, v5

    const/high16 v7, 0x41a80000    # 21.0f

    add-float/2addr v2, v7

    invoke-virtual {p1, v2}, Landroid/view/View;->setX(F)V

    :cond_3
    const-string v2, "\u06e3\u06e8\u06df"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    sget v2, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    if-ltz v2, :cond_5

    const/16 v2, 0x3f

    sput v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    const-string v2, "\u06df\u06e7\u06e2"

    goto :goto_1

    :cond_5
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v7, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    rem-int/2addr v2, v7

    const v7, 0xd9dc

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :cond_6
    :sswitch_7
    sget v2, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    if-ltz v2, :cond_7

    const/16 v2, 0x10

    sput v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    const-string v2, "\u06e4\u06e7\u06e0"

    :goto_2
    invoke-static {v2}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_7
    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    sub-int/2addr v2, v7

    const v7, 0x1aba22

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_8
    iget-object v4, p0, Lj80;->b:Lf00;

    iget-object v2, p0, Lj80;->c:Le00;

    sget v3, Lۣ۟ۢ۠۠;->ۣ۟ۧۦۧ:I

    if-ltz v3, :cond_12

    invoke-static {}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۣ۟ۧۤۡ()I

    const-string v3, "\u06e2\u06e0\u06e1"

    invoke-static {v3}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v7

    move-object v3, v2

    goto/16 :goto_0

    :sswitch_9
    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    sget v2, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sget v7, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    mul-int/2addr v2, v7

    const v7, 0x18402b

    add-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_a
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v2

    sub-float v7, v8, v6

    sub-float/2addr v2, v7

    invoke-virtual {p1, v2}, Landroid/view/View;->setY(F)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    iput v2, v0, Lf00;->a:F

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    mul-int/lit16 v7, v7, 0x1bf5

    div-int/2addr v2, v7

    if-nez v2, :cond_3

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v7, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    div-int/2addr v2, v7

    const v7, -0x1aabd9

    xor-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_b
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    iput v2, v4, Lf00;->a:F

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v7, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    mul-int/lit16 v7, v7, 0xebe

    mul-int/2addr v2, v7

    if-gtz v2, :cond_8

    const-string v2, "\u06df\u06e2"

    invoke-static {v2}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e8\u06e8\u06e4"

    :goto_3
    invoke-static {v2}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    iget-object v0, p0, Lj80;->a:Lf00;

    sget v2, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v7, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    add-int/lit16 v7, v7, -0x13b5

    rem-int/2addr v2, v7

    if-gtz v2, :cond_a

    const/16 v2, 0xd

    sput v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    :cond_9
    const-string v2, "\u06e3\u06e8"

    invoke-static {v2}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_a
    move v2, v5

    :cond_b
    const-string v5, "\u06e3\u06e7\u06e6"

    invoke-static {v5}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v7

    move v5, v2

    goto/16 :goto_0

    :sswitch_d
    iget-boolean v2, v3, Le00;->a:Z

    if-nez v2, :cond_6

    iget-object v2, p0, Lj80;->d:Lhm;

    invoke-interface {v2}, Lhm;->a()Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۥ۟۟ۢ()I

    move-result v2

    if-ltz v2, :cond_c

    invoke-static {}, Landroid/view/ۢۥۢۦ;->ۤۦۢ۟()I

    const-string v2, "\u06df\u06e4"

    invoke-static {v2}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e4\u06e4\u06e4"

    goto/16 :goto_2

    :cond_d
    :sswitch_e
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v2

    if-ltz v2, :cond_e

    const/16 v2, 0x1e

    sput v2, Lcom/google/android/material/theme/ۣۡ۟ۧ;->۟ۢ۠ۡۥ:I

    const-string v2, "\u06e2\u06e7\u06df"

    invoke-static {v2}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e5\u06e1\u06e7"

    invoke-static {v2}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :cond_f
    :sswitch_f
    const-string v2, "\u06e3\u06e8"

    :goto_4
    invoke-static {v2}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v2, :cond_10

    const-string v2, "\u06e3\u06e4\u06e7"

    goto :goto_4

    :cond_10
    const-string v2, "\u06e3\u06e1"

    goto :goto_4

    :sswitch_11
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    iput v2, v0, Lf00;->a:F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    iput v2, v4, Lf00;->a:F

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v2

    if-ltz v2, :cond_11

    const/16 v2, 0xb

    sput v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    const-string v2, "\u06e4\u06e4\u06e4"

    goto/16 :goto_3

    :cond_11
    const-string v2, "\u06e2\u06e0\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۣۢۨۨ(Ljava/lang/Object;)I

    move-result v2

    move v7, v2

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    move-result v2

    if-gtz v2, :cond_13

    const/16 v2, 0x55

    sput v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    move-object v2, v3

    :cond_12
    const-string v3, "\u06e6\u06e6\u06e5"

    invoke-static {v3}, Landroidx/savedstate/۠ۡۢ۠;->۟ۦۥۧۦ(Ljava/lang/Object;)I

    move-result v7

    move-object v3, v2

    goto/16 :goto_0

    :cond_13
    const-string v2, "\u06e5\u06e1\u06df"

    goto/16 :goto_1

    :sswitch_13
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    sub-float/2addr v2, v11

    iget v5, v0, Lf00;->a:F

    sub-float/2addr v2, v5

    add-float/2addr v2, v11

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v5

    const/high16 v6, 0x41f80000    # 31.0f

    add-float/2addr v5, v6

    iget v6, v4, Lf00;->a:F

    sub-float/2addr v5, v6

    const/high16 v6, 0x41f80000    # 31.0f

    sub-float v6, v5, v6

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v7, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v7, v7, 0x725

    or-int/2addr v5, v7

    if-lez v5, :cond_b

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v7, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    add-int/2addr v5, v7

    const v7, 0x1ac91b

    add-int/2addr v7, v5

    move v5, v2

    goto/16 :goto_0

    :sswitch_14
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v2, v2, v10

    if-gtz v2, :cond_f

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v7, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    mul-int/2addr v2, v7

    const v7, 0x1beeb

    sub-int/2addr v2, v7

    move v7, v2

    goto/16 :goto_0

    :sswitch_15
    const-string v2, "\u06e6\u06e6\u06df"

    goto/16 :goto_4

    :sswitch_16
    return v9

    :sswitch_data_0
    .sparse-switch
        0xdbe3 -> :sswitch_0
        0xdbe5 -> :sswitch_13
        0xdc5e -> :sswitch_c
        0xdc65 -> :sswitch_5
        0x1aabd9 -> :sswitch_b
        0x1aaea6 -> :sswitch_7
        0x1ab263 -> :sswitch_3
        0x1ab2c6 -> :sswitch_6
        0x1ab33f -> :sswitch_e
        0x1ab6e3 -> :sswitch_7
        0x1ab6fb -> :sswitch_16
        0x1ab702 -> :sswitch_8
        0x1ab71a -> :sswitch_a
        0x1aba25 -> :sswitch_d
        0x1aba64 -> :sswitch_12
        0x1abae2 -> :sswitch_10
        0x1abdc3 -> :sswitch_7
        0x1abdc5 -> :sswitch_9
        0x1abdcb -> :sswitch_11
        0x1ac21f -> :sswitch_7
        0x1ac225 -> :sswitch_2
        0x1ac8cd -> :sswitch_1
        0x1ac8cf -> :sswitch_f
        0x1ac8ee -> :sswitch_4
        0x1ac9a2 -> :sswitch_14
        0x1ac9e4 -> :sswitch_15
    .end sparse-switch
.end method
