.class public final Ltu;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/ListAdapter;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/ListAdapter;

.field public final c:Ljava/lang/Object;

.field public final d:Landroid/app/Activity;


# direct methods
.method public constructor <init>(ILandroid/widget/ListAdapter;Ljava/lang/Object;Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e1\u06e6"

    invoke-static {v1}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "yYjxBSO4WA"

    invoke-static {v0}, Lۤۤۥۤ;->ۥۧۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟ۡۡۦ()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    const-string v1, "\u06e6\u06e8\u06df"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    const-string v1, "\u06e6\u06e2\u06e8"

    :goto_1
    invoke-static {v1}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_1
    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨۤ۟ۤ:I

    xor-int/2addr v1, v2

    const v2, 0x1ab6a4

    add-int/2addr v1, v2

    goto :goto_0

    :cond_2
    :sswitch_2
    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    move-result v1

    if-gtz v1, :cond_3

    const/16 v1, 0xd

    sput v1, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    const-string v1, "\u06e4\u06e6\u06e4"

    goto :goto_1

    :cond_3
    sget v1, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v2, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۡۨ۟ۦ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab2af

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_3
    iput-object p3, p0, Ltu;->c:Ljava/lang/Object;

    sget v1, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v2, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    rem-int/lit16 v2, v2, -0x1d38

    mul-int/2addr v1, v2

    if-gtz v1, :cond_4

    invoke-static {}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟ۦۢۧۧ()I

    const-string v1, "\u06e6\u06e2\u06e8"

    invoke-static {v1}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :sswitch_4
    iput p1, p0, Ltu;->a:I

    sget v1, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v2, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    add-int/lit16 v2, v2, 0x1f7c

    xor-int/2addr v1, v2

    if-ltz v1, :cond_5

    invoke-static {}, Lio/fastkv/ۣ۟ۧۦۡ;->ۥۥۤۥ()I

    :cond_4
    const-string v1, "\u06e3\u06e2\u06e4"

    invoke-static {v1}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_5
    sget v1, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac2a2

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iput-object p4, p0, Ltu;->d:Landroid/app/Activity;

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    add-int/lit16 v2, v2, 0x73e

    sub-int/2addr v1, v2

    if-ltz v1, :cond_0

    const/16 v1, 0x3c

    sput v1, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->ۥۣ۠ۦ:I

    const-string v1, "\u06e4\u06e8\u06e7"

    invoke-static {v1}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_6
    iput-object p2, p0, Ltu;->b:Landroid/widget/ListAdapter;

    sget v1, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    sget v2, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    mul-int/lit16 v2, v2, -0xa4a

    or-int/2addr v1, v2

    if-ltz v1, :cond_6

    :cond_6
    const-string v1, "\u06e0\u06e6\u06e3"

    invoke-static {v1}, Lio/fastkv/۟ۢ۟ۢۥ;->۟ۥۨۤۦ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Lcom/google/android/material/carousel/ۢۢۢۥ;->۟ۡ۟۠ۧ()I

    move-result v1

    if-gtz v1, :cond_2

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v2, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    xor-int/2addr v1, v2

    const v2, 0x1aa4b9

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_8
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/activity/result/۟ۡۧ۠ۥ;->۟ۥۥۧ۟()I

    move-result v1

    if-gtz v1, :cond_7

    const-string v1, "\u06e4\u06e8\u06e1"

    invoke-static {v1}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v1

    goto/16 :goto_0

    :cond_7
    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v2, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    rem-int/2addr v1, v2

    const v2, -0x1aad0d

    xor-int/2addr v1, v2

    goto/16 :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa784 -> :sswitch_0
        0x1aab9d -> :sswitch_3
        0x1aaf41 -> :sswitch_9
        0x1ab648 -> :sswitch_4
        0x1ab665 -> :sswitch_5
        0x1abadd -> :sswitch_2
        0x1abae3 -> :sswitch_1
        0x1ac1ac -> :sswitch_8
        0x1ac25d -> :sswitch_7
        0x1ac8ce -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final areAllItemsEnabled()Z
    .locals 1

    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v0

    return v0
.end method

.method public final getCount()I
    .locals 2

    iget v0, p0, Ltu;->a:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit8 v1, v1, -0x73

    add-int/2addr v0, v1

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "\u06e8\u06e8\u06e0"

    invoke-static {v2}, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->۟۠ۧ۟ۡ(Ljava/lang/Object;)I

    move-result v3

    move v2, v1

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v1, p0, Ltu;->a:I

    sget v2, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v3, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/lit16 v3, v3, -0x24f6

    rem-int/2addr v2, v3

    if-ltz v2, :cond_4

    const-string v2, "\u06e3\u06e7\u06e4"

    invoke-static {v2}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۣ۟ۧ۟(Ljava/lang/Object;)I

    move-result v3

    move v2, v1

    goto :goto_0

    :cond_0
    :sswitch_1
    invoke-static {}, Lkotlinx/coroutines/۠ۥۣۧ;->۠ۧۥ()I

    move-result v1

    if-ltz v1, :cond_1

    invoke-static {}, Landroid/window/ۦۣۦۥ;->ۡۥۥۥ()I

    const-string v1, "\u06df\u06e1\u06e5"

    :goto_1
    invoke-static {v1}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/material/datepicker/۟ۥۥۣ;->ۧ۠ۢۡ:I

    sget v3, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    mul-int/2addr v1, v3

    const v3, -0x1a86a0

    xor-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_2
    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    xor-int/lit16 v1, v1, -0x3da

    add-int/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    return-object v0

    :sswitch_3
    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    sget v1, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    sget v3, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    xor-int/lit16 v3, v3, -0x1e9d

    add-int/2addr v1, v3

    if-gtz v1, :cond_3

    :cond_2
    const-string v1, "\u06e6\u06e2\u06e4"

    invoke-static {v1}, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e4\u06e8"

    goto :goto_1

    :sswitch_4
    sget v1, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v3, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۣۤۨۥ:I

    or-int/2addr v1, v3

    const v3, 0x1ac5e1

    add-int/2addr v1, v3

    move v3, v1

    goto :goto_0

    :sswitch_5
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_4
    const-string v2, "\u06e4\u06e0\u06e5"

    invoke-static {v2}, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۤ۠ۧۧ(Ljava/lang/Object;)I

    move-result v3

    move v2, v1

    goto :goto_0

    :sswitch_6
    if-ne p1, v2, :cond_0

    invoke-static {}, Landroidx/core/content/ۣ۟ۦۣۧ;->۟ۥۦۧۡ()I

    move-result v1

    if-ltz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/datepicker/ۨۧۤ;->۠ۤ۠ۧ()I

    const-string v1, "\u06e4\u06e8"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢ۟ۤۦ;->۟ۦۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    move v3, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc84 -> :sswitch_0
        0xdc9c -> :sswitch_4
        0x1ab700 -> :sswitch_5
        0x1ab9e9 -> :sswitch_6
        0x1abde5 -> :sswitch_1
        0x1ac1a8 -> :sswitch_2
        0x1ac9e0 -> :sswitch_3
    .end sparse-switch
.end method

.method public final getItemId(I)J
    .locals 2

    const-string v0, "\u06e8\u06e6\u06e1"

    invoke-static {v0}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sget v1, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    or-int/lit16 v1, v1, 0x7ea

    mul-int/2addr v0, v1

    if-gtz v0, :cond_0

    const-string v0, "\u06e6\u06e8\u06df"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/appcompat/app/۟۟ۥۨۤ;->۠ۥۧۥ:I

    sget v1, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sub-int/2addr v0, v1

    const v1, -0x1acba3

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    int-to-long v0, p1

    return-wide v0

    :sswitch_data_0
    .sparse-switch
        0x1ac1e6 -> :sswitch_0
        0x1ac9a3 -> :sswitch_1
    .end sparse-switch
.end method

.method public final getItemViewType(I)I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "\u06e6\u06e2\u06e5"

    invoke-static {v2}, Landroidx/activity/result/۟ۡۧ۠ۥ;->ۨ۠ۦ۟(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-interface {v2, p1}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v0

    :goto_1
    return v0

    :cond_0
    :sswitch_1
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v3, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->۟۠ۨۧۦ:I

    or-int/2addr v0, v3

    const v3, -0x1aaf03

    xor-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v0, 0x42

    sput v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    const-string v0, "\u06e1\u06e4\u06e6"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/textfield/ۡۢۥۡ;->۟۠۟۟ۧ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e2\u06e5"

    goto :goto_2

    :sswitch_3
    iget v0, p0, Ltu;->a:I

    sget v1, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    if-gtz v1, :cond_2

    invoke-static {}, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۤۥۣ۟()I

    const-string v1, "\u06e6\u06e2\u06e5"

    invoke-static {v1}, Lۤۨۤۨ;->۟ۦۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move v1, v0

    goto :goto_0

    :sswitch_4
    if-ne p1, v1, :cond_0

    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v0, :cond_3

    const/16 v0, 0x1d

    sput v0, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    move v0, v1

    :cond_2
    const-string v1, "\u06e2\u06e4\u06e7"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v3

    move v1, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v3, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    rem-int/2addr v0, v3

    const v3, 0x1ab9e6

    add-int/2addr v0, v3

    move v3, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    sget v2, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v3, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    div-int/lit16 v3, v3, -0x1f9b

    xor-int/2addr v2, v3

    if-gtz v2, :cond_4

    invoke-static {}, Landroidx/legacy/content/ۨ۠ۦۥ;->۟ۢۦ۠ۦ()I

    :cond_4
    const-string v2, "\u06e7\u06e6\u06e3"

    invoke-static {v2}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v3

    move-object v2, v0

    goto :goto_0

    :sswitch_6
    sget v0, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۤۤ۠:I

    xor-int/lit16 v0, v0, 0x186

    add-int/2addr v0, v1

    invoke-interface {v2, v0}, Landroid/widget/Adapter;->getItemViewType(I)I

    move-result v0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf02 -> :sswitch_0
        0x1ab2e5 -> :sswitch_4
        0x1aba45 -> :sswitch_6
        0x1ac1a9 -> :sswitch_5
        0x1ac5e4 -> :sswitch_3
        0x1ac8ec -> :sswitch_1
        0x1ac908 -> :sswitch_2
    .end sparse-switch
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v5, "\u06df\u06e2\u06e5"

    invoke-static {v5}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v2

    move v10, v5

    :goto_0
    sparse-switch v10, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v5, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    xor-int/lit16 v5, v5, -0x31e

    rem-int/2addr v2, v5

    if-ltz v2, :cond_10

    invoke-static {}, Landroid/window/ۣۤ۠ۢ;->ۧۢۦ۟()I

    const-string v2, "\u06e0\u06e2\u06e4"

    :goto_1
    invoke-static {v2}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :sswitch_1
    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Landroid/view/View;->setFocusable(Z)V

    sget v2, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v5, Lkotlinx/coroutines/internal/۟ۤۧۤۤ;->ۣ۟ۤۡۡ:I

    sub-int/2addr v2, v5

    const v5, 0x1ab061

    add-int/2addr v2, v5

    move v10, v2

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Lmp;->d(Ljava/lang/Object;)V

    const-string v2, "\u06e7\u06e6\u06e6"

    :goto_2
    invoke-static {v2}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :sswitch_3
    invoke-static {v8}, Lxh;->l(Landroid/view/View;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۨ۠۟()I

    move-result v2

    if-ltz v2, :cond_1

    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    const-string v2, "\u06e3\u06e8\u06e3"

    invoke-static {v2}, Landroidx/core/app/ۡۤۡ۠;->ۣ۟۠ۧۥ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_1
    const-string v2, "\u06e4\u06e6\u06e0"

    goto :goto_1

    :sswitch_4
    new-instance v2, Ly5;

    iget-object v5, p0, Ltu;->c:Ljava/lang/Object;

    xor-int/lit16 v10, v3, -0x317

    iget-object v11, p0, Ltu;->d:Landroid/app/Activity;

    invoke-direct {v2, v5, v10, v11}, Ly5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Lkotlinx/coroutines/ۤۢۢۥ;->ۤ۠ۦۢ:I

    add-int/lit16 v5, v5, 0xf4f

    sub-int/2addr v2, v5

    if-ltz v2, :cond_2

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v2, "\u06e3\u06e4\u06e5"

    invoke-static {v2}, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۥۥۥ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :cond_2
    const-string v2, "\u06e2\u06e3\u06e4"

    :goto_3
    invoke-static {v2}, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->ۨ۠ۦۧ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto :goto_0

    :sswitch_5
    sget v3, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v2, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۢ۠ۨۥ:I

    if-ltz v2, :cond_3

    const-string v2, "\u06e2\u06e7\u06df"

    goto :goto_2

    :cond_3
    sget v2, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۢۡۨ:I

    sget v5, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۤ۟ۤۦ:I

    sub-int/2addr v2, v5

    const v5, 0x1ac29c

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :cond_4
    :sswitch_6
    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    sget v5, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    or-int/2addr v2, v5

    const v5, 0x1aaeab

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_7
    iget-object v2, p0, Ltu;->b:Landroid/widget/ListAdapter;

    sget v4, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    or-int/lit16 v5, v5, 0x22d

    mul-int/2addr v4, v5

    if-gtz v4, :cond_5

    const-string v4, "\u06e7\u06e2\u06e7"

    move-object v5, v4

    :goto_4
    invoke-static {v5}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v2

    move v10, v5

    goto/16 :goto_0

    :cond_5
    sget v4, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->ۣ۟۠۟۟:I

    sget v5, Lۤۨۤۨ;->۟۠ۤۦۨ:I

    add-int/2addr v4, v5

    const v5, 0x1ac5cf

    add-int/2addr v5, v4

    move-object v4, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v8}, Lxh;->k(Landroid/view/View;)Landroid/widget/ImageView;

    move-result-object v2

    sget v5, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟۠ۥۣ۠:I

    sget v9, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v9, v9, 0x1b14

    mul-int/2addr v5, v9

    if-ltz v5, :cond_6

    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    const-string v5, "\u06e5\u06e2\u06e8"

    invoke-static {v5}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->۠ۧۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v9, v2

    move v10, v5

    goto/16 :goto_0

    :cond_6
    sget v5, Lcom/google/android/material/datepicker/۟۟ۦۦۢ;->ۣ۟ۤۡۦ:I

    sget v9, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    div-int/2addr v5, v9

    const v9, -0x1ac209

    xor-int/2addr v5, v9

    move-object v9, v2

    move v10, v5

    goto/16 :goto_0

    :sswitch_9
    sget v2, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    xor-int/lit16 v2, v2, -0x24a

    invoke-virtual {v9, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const-string v2, "\u06df\u06e0\u06df"

    move v5, v7

    :goto_5
    invoke-static {v2}, Lcom/google/android/material/button/ۥۤ۠;->ۢۥۥۢ(Ljava/lang/Object;)I

    move-result v2

    move v7, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_a
    iget v5, p0, Ltu;->a:I

    const-string v2, "\u06e6\u06e1\u06e5"

    goto :goto_5

    :sswitch_b
    move-object v1, v8

    :sswitch_c
    return-object v1

    :sswitch_d
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    sget v2, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    sget v5, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    div-int/2addr v2, v5

    const v5, 0x1ac5ab

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_e
    const-string v2, "uo45MVTdi/kaVvI=\n"

    const-string v5, "/etcWnQ1JUc=\n"

    invoke-static {v2, v5}, Lb50;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v2, Lcom/google/android/material/bottomappbar/۟ۦۨۧۥ;->۟ۧۢ۟ۧ:I

    sget v5, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    or-int/lit16 v5, v5, -0x13cd

    or-int/2addr v2, v5

    if-ltz v2, :cond_7

    const/16 v2, 0x53

    sput v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    const-string v2, "\u06df\u06e0\u06df"

    goto/16 :goto_3

    :cond_7
    sget v2, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    sget v5, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->ۣ۟ۦۢ۟:I

    add-int/2addr v2, v5

    const v5, 0x1aaab0

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_f
    if-eqz v6, :cond_d

    sget v2, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    sget v5, Landroidx/activity/ۣۢۦۨ;->۟ۢۨۢۡ:I

    add-int/lit16 v5, v5, 0xab1

    div-int/2addr v2, v5

    if-eqz v2, :cond_8

    invoke-static {}, Landroid/window/ۣۧ۟۠;->ۣۡ۟ۢ()I

    const-string v2, "\u06e2\u06e3\u06e1"

    invoke-static {v2}, Lcom/google/android/material/internal/۟ۡ۟ۧۢ;->ۢ۠۠ۤ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_8
    sget v2, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    sget v5, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sub-int/2addr v2, v5

    const v5, 0x1aaa59

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_10
    sget v2, Landroidx/activity/result/۟۠۟۠ۦ;->ۡۧ۠ۦ:I

    sget v5, Landroidx/legacy/content/ۨ۠ۦۥ;->۟۠ۥۢۡ:I

    rem-int/2addr v2, v5

    const v5, 0x1aa79e

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :cond_9
    :sswitch_11
    sget v2, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    if-gtz v2, :cond_a

    const/16 v2, 0x4a

    sput v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    const-string v5, "\u06e3\u06e3\u06e0"

    move-object v2, v6

    :goto_6
    invoke-static {v5}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->ۣۧۧ۠(Ljava/lang/Object;)I

    move-result v5

    move-object v6, v2

    move v10, v5

    goto/16 :goto_0

    :cond_a
    sget v2, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sub-int/2addr v2, v5

    const v5, 0x1ac51a

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_12
    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Landroid/view/View;->setClickable(Z)V

    sget v2, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v5, Lcom/google/android/material/carousel/ۦۥۥۨ;->۟ۦ۟ۨۢ:I

    add-int/lit16 v5, v5, 0x1240

    sub-int/2addr v2, v5

    if-ltz v2, :cond_b

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v2, "\u06e4\u06e6\u06e0"

    move v5, v7

    goto/16 :goto_5

    :cond_b
    const-string v2, "\u06e0\u06e5\u06e2"

    invoke-static {v2}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۣ۟۠ۡۤ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :sswitch_13
    if-eqz v9, :cond_0

    sget v2, Lkotlinx/coroutines/۠ۥۣۧ;->ۣۢۤۧ:I

    if-gtz v2, :cond_c

    const/16 v2, 0x2c

    sput v2, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    const-string v2, "\u06e1\u06df\u06e8"

    invoke-static {v2}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e3\u06e4\u06e5"

    move-object v2, v4

    goto/16 :goto_4

    :sswitch_14
    add-int/lit8 v2, v7, 0x11

    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v2, v2, -0x11

    const/4 v5, 0x0

    invoke-interface {v4, v2, v5, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    :goto_7
    const-string v2, "\u06e0\u06e0\u06e1"

    invoke-static {v2}, Lcom/github/megatronking/stringfog/xor/۟۟ۤۤۥ;->۟ۦۣۣۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v8, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_15
    if-ne p1, v7, :cond_9

    sget v2, Lcom/google/android/material/button/ۥۤ۠;->ۣ۠ۤۤ:I

    sget v5, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/2addr v2, v5

    const v5, 0x1aab25

    add-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :cond_d
    :sswitch_16
    invoke-static {}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->۟ۧۧۥۦ()I

    move-result v2

    if-ltz v2, :cond_e

    const-string v2, "\u06e6\u06e6\u06e2"

    :goto_8
    invoke-static {v2}, Landroidx/appcompat/view/menu/۟۠ۢ۠ۡ;->۟ۧۢۥ۠(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e7\u06e4\u06e8"

    goto :goto_8

    :sswitch_17
    if-eqz v0, :cond_4

    const-string v5, "\u06e1\u06e1\u06e5"

    move-object v2, v6

    goto/16 :goto_6

    :sswitch_18
    invoke-static {v1}, Lxh;->k(Landroid/view/View;)Landroid/widget/ImageView;

    move-result-object v2

    sget v5, Lcom/google/android/material/carousel/ۢۢۢۥ;->ۣۧۤۨ:I

    if-ltz v5, :cond_f

    const/16 v5, 0x44

    sput v5, Landroidx/core/content/ۣۧۡۤ;->۟ۢ۠۟ۡ:I

    move-object v6, v2

    move-object v5, v8

    goto :goto_7

    :cond_f
    const-string v5, "\u06e5\u06e2\u06e8"

    goto/16 :goto_6

    :cond_10
    sget v2, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v5, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    add-int/2addr v2, v5

    const v5, 0x1aa5c6

    xor-int/2addr v2, v5

    move v10, v2

    goto/16 :goto_0

    :sswitch_19
    invoke-interface {v4, p1, p2, p3}, Landroid/widget/Adapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const-string v2, "\u06e2\u06e3\u06e1"

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_0
        0x1aa71e -> :sswitch_b
        0x1aa762 -> :sswitch_7
        0x1aaae1 -> :sswitch_5
        0x1aaae4 -> :sswitch_11
        0x1aab25 -> :sswitch_14
        0x1aab26 -> :sswitch_d
        0x1aab62 -> :sswitch_16
        0x1aab7d -> :sswitch_1
        0x1aae8a -> :sswitch_8
        0x1aaec5 -> :sswitch_e
        0x1ab2c0 -> :sswitch_2
        0x1ab2c3 -> :sswitch_12
        0x1ab2c4 -> :sswitch_3
        0x1ab33a -> :sswitch_6
        0x1ab6a4 -> :sswitch_9
        0x1ab71e -> :sswitch_10
        0x1aba9e -> :sswitch_17
        0x1abdeb -> :sswitch_f
        0x1ac18a -> :sswitch_15
        0x1ac208 -> :sswitch_13
        0x1ac21f -> :sswitch_4
        0x1ac56c -> :sswitch_19
        0x1ac584 -> :sswitch_a
        0x1ac5ab -> :sswitch_c
        0x1ac5e7 -> :sswitch_18
    .end sparse-switch
.end method

.method public final getViewTypeCount()I
    .locals 1

    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->getViewTypeCount()I

    move-result v0

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->hasStableIds()Z

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 2

    const-string v0, "\u06e6\u06e0"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۢۧۤۤ;->ۣ۟۟ۡۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x1

    return v0

    :sswitch_1
    sget v0, Landroid/window/ۣۤ۠ۢ;->۟ۤۦۥۨ:I

    sget v1, Landroidx/coordinatorlayout/widget/ۨ۟ۢۥ;->ۡۢ۟ۦ:I

    add-int/lit16 v1, v1, -0x57c

    add-int/2addr v0, v1

    if-ltz v0, :cond_0

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v1, Lcom/google/android/material/appbar/۟۟ۦۤۥ;->۟ۢ۠ۥۥ:I

    or-int/2addr v0, v1

    const v1, 0xdcdd

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcba -> :sswitch_0
        0x1aab44 -> :sswitch_1
    .end sparse-switch
.end method

.method public final registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 2

    const-string v0, "\u06e6\u06df\u06e7"

    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    sget v0, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۥۨۨۨ:I

    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    xor-int/lit16 v1, v1, 0xffa

    mul-int/2addr v0, v1

    if-ltz v0, :cond_0

    invoke-static {}, Lkotlinx/coroutines/ۤۢۢۥ;->ۡ۠ۥۡ()I

    const-string v0, "\u06e0\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Landroidx/activity/result/۟ۡۤۦۡ;->۟ۦۡۢۥ:I

    sget v1, Landroidx/core/content/ۣ۟ۦۣۧ;->ۣ۟ۢۨۡ:I

    add-int/2addr v0, v1

    const v1, 0x1abff8

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    sget v0, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    xor-int/2addr v0, v1

    const v1, -0x1ab6a8

    xor-int/2addr v0, v1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab6fb -> :sswitch_0
        0x1ac14e -> :sswitch_2
        0x1ac569 -> :sswitch_1
    .end sparse-switch
.end method

.method public final unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 2

    const-string v0, "\u06e4\u06e2\u06e5"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۡ۟ۥۢ;->۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    if-ltz v0, :cond_0

    const-string v0, "\u06e7\u06e8\u06df"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->۟ۢۡۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟۟ۤۡۥ:I

    sget v1, Landroid/window/۟ۤ۟ۡۧ;->ۧۥۥۨ:I

    mul-int/2addr v0, v1

    const v1, 0x126d71

    add-int/2addr v0, v1

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Ltu;->b:Landroid/widget/ListAdapter;

    invoke-interface {v0, p1}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    sget v0, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->۟ۦۡۤۧ:I

    if-ltz v0, :cond_1

    const/16 v0, 0x15

    sput v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    const-string v0, "\u06e4\u06e2\u06e5"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۣۥۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e8\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠۟ۧۤ;->ۨۥۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab64a -> :sswitch_0
        0x1aba27 -> :sswitch_1
        0x1ac624 -> :sswitch_2
    .end sparse-switch
.end method
