.class public final Lao;
.super Ljava/lang/Object;

# interfaces
.implements Lsh;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lh40;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lh40;I)V
    .locals 3

    iput p3, p0, Lao;->a:I

    iput-object p1, p0, Lao;->b:Ljava/lang/Object;

    iput-object p2, p0, Lao;->c:Lh40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e3\u06e6"

    invoke-static {v1}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "2AApni5"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟ۦۥۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    rem-int/lit16 v2, v2, 0x119a

    div-int/2addr v1, v2

    if-eqz v1, :cond_3

    const-string v1, "\u06e6\u06e1\u06e5"

    invoke-static {v1}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v1

    if-gtz v1, :cond_4

    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v1

    if-gtz v1, :cond_1

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    :cond_0
    const-string v1, "\u06e3\u06e3"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    rem-int/2addr v1, v2

    const v2, 0x1abfe9

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    div-int/lit16 v2, v2, -0x380

    add-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x41

    sput v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    const-string v1, "\u06e0\u06e5\u06e0"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    rem-int/2addr v1, v2

    const v2, 0x1ac1d9

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v1, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v2, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    or-int/lit16 v2, v2, 0x25f1

    div-int/2addr v1, v2

    if-eqz v1, :cond_0

    const/16 v1, 0xc

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    :cond_3
    const-string v1, "\u06df\u06e5\u06df"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_4
    :sswitch_5
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    sget v2, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    xor-int/lit16 v2, v2, -0x24d2

    sub-int/2addr v1, v2

    if-gtz v1, :cond_5

    const/16 v1, 0x53

    sput v1, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    const-string v1, "\u06e1\u06e0\u06df"

    :goto_1
    invoke-static {v1}, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->۟ۥۨۢۥ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06e3\u06e3"

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdc60 -> :sswitch_0
        0x1aa7b9 -> :sswitch_4
        0x1ab9e6 -> :sswitch_3
        0x1ac14c -> :sswitch_1
        0x1ac18a -> :sswitch_5
        0x1ac1c9 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x0

    const-string v0, "\u06e3\u06e2"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move-object v3, v4

    move-object v1, v4

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lao;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    sget v0, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    rem-int/lit16 v2, v2, 0x1e82

    div-int/2addr v0, v2

    if-ltz v0, :cond_9

    const-string v0, "\u06e7\u06e6\u06e2"

    :goto_1
    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lao;->b:Ljava/lang/Object;

    check-cast v0, Li00;

    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v5, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sub-int/2addr v0, v2

    const v2, -0xd953

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, Lao;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    move-result v1

    if-gtz v1, :cond_0

    const/16 v1, 0x37

    sput v1, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    :cond_0
    const-string v1, "\u06e1\u06e6\u06e1"

    move-object v2, v1

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06df\u06e2\u06e2"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    add-int/2addr v0, v2

    const v2, 0xd72f

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lao;->c:Lh40;

    invoke-virtual {v0, p0}, Lh40;->e(Lsh;)V

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۣۡ۠ۡ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e3\u06e2"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    div-int/2addr v0, v2

    const v2, -0x1ac9e1

    xor-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_3
    :sswitch_6
    sget v0, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v2, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    div-int/lit16 v2, v2, -0xc4d

    xor-int/2addr v0, v2

    if-gtz v0, :cond_4

    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    const-string v0, "\u06e6\u06e6\u06e4"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e5\u06e2\u06e3"

    invoke-static {v0}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۨ۟ۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    invoke-virtual {v1, v5, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    const-string v0, "\u06df\u06e0\u06df"

    :goto_4
    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_8
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v0

    if-ltz v0, :cond_5

    const/16 v0, 0x4e

    sput v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    const-string v0, "\u06df\u06e8\u06e8"

    invoke-static {v0}, Landroidx/versionedparcelable/۟۟۠ۥ۠;->۟۠ۥۣۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e1\u06e8\u06df"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lao;->c:Lh40;

    invoke-virtual {v0, p0}, Lh40;->e(Lsh;)V

    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    if-gtz v0, :cond_6

    const-string v0, "\u06e0\u06df\u06e5"

    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    rem-int/2addr v0, v2

    const v2, 0x1aba25

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_a
    iget-object v0, p0, Lao;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v5, v4}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    div-int/lit16 v2, v2, -0x1b14

    or-int/2addr v0, v2

    if-gtz v0, :cond_7

    const/16 v0, 0x33

    sput v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    const-string v0, "\u06e8\u06e5\u06e5"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_7
    sget v0, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    rem-int/2addr v0, v2

    const v2, 0x1aab22

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Landroidx/appcompat/widget/۟ۥۥۤۦ;->۠۠ۧ۟()I

    move-result v0

    if-gtz v0, :cond_3

    :goto_5
    const-string v0, "\u06e4\u06e5\u06e2"

    goto :goto_4

    :sswitch_c
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v0

    if-ltz v0, :cond_8

    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    goto :goto_5

    :cond_8
    const-string v2, "\u06e5\u06e2\u06e3"

    move-object v0, v1

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u06e1\u06e2\u06e1"

    goto/16 :goto_3

    :pswitch_0
    :sswitch_d
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_a

    const-string v0, "\u06e6\u06e3\u06e8"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_a
    sget v0, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    xor-int/2addr v0, v2

    const v2, 0x1acd38

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :pswitch_1
    :sswitch_e
    sget v0, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v2, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    add-int/lit16 v2, v2, 0x1a24

    rem-int/2addr v0, v2

    if-gtz v0, :cond_b

    const/16 v0, 0x1e

    sput v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    const-string v0, "\u06e0\u06e5\u06e8"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto/16 :goto_0

    :cond_b
    sget v0, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    or-int/2addr v0, v2

    const v2, 0x1aba62

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_f
    const-string v0, "DCYGIYA5KS8UJF1"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۥۢۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    sget v3, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    rem-int/lit16 v3, v3, 0x1814

    sub-int/2addr v2, v3

    if-ltz v2, :cond_c

    const-string v2, "\u06e1\u06e2\u06e1"

    invoke-static {v2}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v3, v0

    goto/16 :goto_0

    :cond_c
    sget v2, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    sget v3, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    xor-int/2addr v2, v3

    const v3, 0x1ac027

    add-int/2addr v2, v3

    move-object v3, v0

    goto/16 :goto_0

    :sswitch_10
    iget-object v0, p0, Lao;->c:Lh40;

    invoke-virtual {v0, p0}, Lh40;->e(Lsh;)V

    const-string v0, "\u06e5\u06e5\u06e4"

    goto/16 :goto_1

    :sswitch_11
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc5f -> :sswitch_0
        0xdcdc -> :sswitch_9
        0x1aa71e -> :sswitch_5
        0x1aa81f -> :sswitch_1
        0x1aaac6 -> :sswitch_e
        0x1aab82 -> :sswitch_10
        0x1aaee0 -> :sswitch_2
        0x1aaf3c -> :sswitch_4
        0x1aaf5c -> :sswitch_8
        0x1aaf98 -> :sswitch_7
        0x1aba04 -> :sswitch_11
        0x1aba81 -> :sswitch_f
        0x1abaa0 -> :sswitch_d
        0x1abde6 -> :sswitch_11
        0x1abe44 -> :sswitch_b
        0x1abe61 -> :sswitch_a
        0x1ac14a -> :sswitch_c
        0x1ac5a7 -> :sswitch_6
        0x1ac988 -> :sswitch_3
        0x1ac9e0 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
