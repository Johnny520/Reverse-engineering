.class public final Lz9;
.super Landroid/widget/FrameLayout;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    iput p2, p0, Lz9;->a:I

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-wide/16 v0, 0x0

    const-string v2, "\u06e6\u06e0\u06df"

    invoke-static {v2}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v2

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "fZlGY8iQhu0CGt9FnXlz3R"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۥۣۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v3, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    rem-int/lit16 v3, v3, 0x139a

    div-int/2addr v2, v3

    if-eqz v2, :cond_1

    invoke-static {}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۢۨۤ۟()I

    :cond_0
    const-string v2, "\u06df\u06e7\u06e3"

    :goto_1
    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v2

    if-gtz v2, :cond_3

    invoke-static {}, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۢۧ()I

    move-result v2

    if-ltz v2, :cond_0

    const-string v2, "\u06e1\u06e4\u06df"

    invoke-static {v2}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :sswitch_2
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

    const-string v2, "\u06e2\u06e8\u06e2"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۟ۦۣۨۨ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e7\u06e0\u06e4"

    goto :goto_1

    :sswitch_3
    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v3, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    add-int/lit16 v3, v3, -0x1da5

    mul-int/2addr v2, v3

    if-ltz v2, :cond_2

    const/16 v2, 0x32

    sput v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    const-string v2, "\u06e5\u06e0"

    :goto_3
    invoke-static {v2}, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۥ۟ۡۧ(Ljava/lang/Object;)I

    move-result v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e6\u06e0\u06df"

    goto :goto_3

    :cond_3
    :sswitch_4
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v2

    if-ltz v2, :cond_4

    const/16 v2, 0x5e

    sput v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    const-string v2, "\u06e3\u06e8\u06e8"

    goto :goto_2

    :cond_4
    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v3, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    rem-int/2addr v2, v3

    const v3, 0x1ab323

    add-int/2addr v2, v3

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7fb -> :sswitch_0
        0x1aa817 -> :sswitch_3
        0x1aaf1c -> :sswitch_4
        0x1ab35c -> :sswitch_5
        0x1ac165 -> :sswitch_1
        0x1ac52b -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06e5\u06e4\u06e6"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۟ۦ۟ۢۨ(Ljava/lang/Object;)I

    move-result v6

    move v2, v0

    move v5, v0

    move v1, v0

    move v3, v0

    move v4, v0

    :goto_0
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v6, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    add-int/lit16 v6, v6, 0x26e0

    mul-int/2addr v0, v6

    if-ltz v0, :cond_2

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v0, "\u06e7\u06df\u06e5"

    :goto_1
    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    or-int/lit16 v3, v3, 0x8ce

    add-int/2addr v0, v3

    if-gtz v0, :cond_1

    const/16 v0, 0x1f

    sput v0, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    const-string v0, "\u06e7\u06e0"

    move v3, v1

    :goto_2
    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۠۠ۤۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    move v3, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    const-string v5, "\u06e5\u06e2\u06e3"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۣۤۨۤ(Ljava/lang/Object;)I

    move-result v6

    move v5, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e3\u06e0"

    goto :goto_1

    :sswitch_3
    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    sget v6, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    add-int/lit16 v6, v6, 0x739

    mul-int/2addr v0, v6

    if-ltz v0, :cond_3

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06e0\u06df\u06df"

    :goto_3
    invoke-static {v0}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e5\u06e4\u06e6"

    goto :goto_3

    :sswitch_4
    const v0, 0x7ffffeee

    sget v1, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    xor-int/2addr v0, v1

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v6, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    or-int/lit16 v6, v6, 0x1fba

    add-int/2addr v0, v6

    if-gtz v0, :cond_4

    const/16 v0, 0x13

    sput v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    move v0, v2

    :goto_4
    const-string v2, "\u06e1\u06e6\u06e8"

    invoke-static {v2}, Landroidx/savedstate/ۢۨۧۤ;->۟ۡ۠۠ۨ(Ljava/lang/Object;)I

    move-result v6

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e1\u06e8\u06e7"

    goto :goto_3

    :sswitch_5
    iget v0, p0, Lz9;->a:I

    goto :goto_4

    :sswitch_6
    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v0, :cond_5

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v0, "\u06e7\u06e5\u06e0"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    move v3, v4

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e7\u06e5\u06e0"

    move v3, v4

    :goto_5
    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :sswitch_7
    if-le v5, v2, :cond_0

    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v6, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    rem-int/lit16 v6, v6, -0x17ae

    rem-int/2addr v0, v6

    if-gtz v0, :cond_6

    invoke-static {}, Landroidx/savedstate/ۡۤۨۡ;->ۧۨۧ۠()I

    const-string v0, "\u06e1\u06df\u06e0"

    goto :goto_5

    :cond_6
    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v6, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    xor-int/2addr v0, v6

    const v6, -0x1abda7

    xor-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_8
    invoke-super {p0, p1, v3}, Landroid/widget/FrameLayout;->onMeasure(II)V

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_7

    const-string v0, "\u06e8\u06e3\u06e0"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->ۥۣۢۢ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v6, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    mul-int/2addr v0, v6

    const v6, 0x127b6e

    xor-int/2addr v0, v6

    move v6, v0

    goto/16 :goto_0

    :sswitch_9
    sget v0, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    sget v4, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    add-int/lit16 v4, v4, 0x1c4a

    div-int/2addr v0, v4

    if-eqz v0, :cond_8

    const/16 v0, 0x51

    sput v0, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    const-string v0, "\u06e5\u06e2\u06e7"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    move v6, v0

    move v4, p2

    goto/16 :goto_0

    :cond_8
    const-string v0, "\u06e1\u06df\u06e0"

    move v4, p2

    goto/16 :goto_2

    :sswitch_a
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdcd9 -> :sswitch_0
        0x1aae82 -> :sswitch_2
        0x1aaf63 -> :sswitch_6
        0x1aafa0 -> :sswitch_1
        0x1ab263 -> :sswitch_a
        0x1abde6 -> :sswitch_5
        0x1abdea -> :sswitch_4
        0x1abe27 -> :sswitch_9
        0x1ac5c2 -> :sswitch_7
        0x1ac90c -> :sswitch_3
        0x1ac945 -> :sswitch_8
    .end sparse-switch
.end method
