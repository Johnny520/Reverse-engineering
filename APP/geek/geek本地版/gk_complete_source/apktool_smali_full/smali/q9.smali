.class public final Lq9;
.super Lm50;

# interfaces
.implements Lwm;


# instance fields
.field public final e:I

.field public final f:Ljava/lang/ClassLoader;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/io/Serializable;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li00;Ljava/lang/String;Ljava/lang/ClassLoader;Lo9;Lld;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lq9;->e:I

    iput-object p1, p0, Lq9;->h:Ljava/io/Serializable;

    iput-object p2, p0, Lq9;->g:Ljava/lang/String;

    iput-object p3, p0, Lq9;->f:Ljava/lang/ClassLoader;

    iput-object p4, p0, Lq9;->i:Ljava/lang/Object;

    invoke-direct {p0, p5}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06df\u06e1"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->۟ۦۣۡۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    xor-int/lit16 v2, v2, -0x56e

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v0, "\u06e3\u06e3\u06e7"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۧۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    const-string v0, "hEDKH"

    invoke-static {v0}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡۥۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    sget v0, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    rem-int/lit16 v2, v2, 0x2548

    or-int/2addr v0, v2

    if-ltz v0, :cond_0

    const/16 v0, 0x46

    sput v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    const-string v0, "\u06e7\u06e0\u06e6"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06df\u06e7"

    goto :goto_2

    :cond_1
    const-string v0, "\u06e3\u06e4\u06e1"

    goto :goto_1

    :sswitch_2
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    sget v2, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    rem-int/lit16 v2, v2, 0x127b

    sub-int/2addr v0, v2

    if-gtz v0, :cond_2

    const-string v0, "\u06e2\u06e5\u06e5"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e0\u06e6"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_3
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    div-int/2addr v0, v2

    const v2, 0x1aa701

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    sget v0, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac5a2

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa701 -> :sswitch_0
        0x1ab302 -> :sswitch_4
        0x1ab687 -> :sswitch_3
        0x1ab6a0 -> :sswitch_1
        0x1abd8d -> :sswitch_2
        0x1ac52d -> :sswitch_5
    .end sparse-switch
.end method

.method public constructor <init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lld;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lq9;->e:I

    iput-object p1, p0, Lq9;->h:Ljava/io/Serializable;

    iput-object p2, p0, Lq9;->f:Ljava/lang/ClassLoader;

    iput-object p3, p0, Lq9;->g:Ljava/lang/String;

    iput-object p4, p0, Lq9;->i:Ljava/lang/Object;

    invoke-direct {p0, p5}, Lm50;-><init>(Lld;)V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e6\u06e7"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v2, L۟ۡۦۧۤ;->ۦۨۦۧ:I

    add-int/lit16 v2, v2, -0xe5d

    sub-int/2addr v0, v2

    if-gtz v0, :cond_1

    invoke-static {}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۣ۟ۦۢ()I

    const-string v0, "\u06e7\u06e3\u06e2"

    invoke-static {v0}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۡۥ۟ۨ()I

    move-result v0

    if-ltz v0, :cond_0

    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    const-string v0, "\u06e8\u06e2\u06e2"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e3\u06e0"

    goto :goto_1

    :cond_1
    sget v0, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v2, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    add-int/2addr v0, v2

    const v2, 0x1accc8

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_2
    :sswitch_2
    sget v0, Landroidx/coordinatorlayout/widget/ۢۢۦ۠;->۟ۢۥ۟۟:I

    sget v2, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sub-int/2addr v0, v2

    const v2, -0x1aaf15

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    or-int/lit16 v2, v2, -0xee5

    mul-int/2addr v0, v2

    if-ltz v0, :cond_3

    const/16 v0, 0x53

    sput v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v0, "\u06e8\u06e6\u06e7"

    invoke-static {v0}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06e0\u06e6\u06e3"

    invoke-static {v0}, Landroidx/activity/ۣ۟۠ۤۢ;->ۣۣۤ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_4
    const-string v0, "KG6bp"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v2, v2, 0x2f7

    xor-int/2addr v0, v2

    if-ltz v0, :cond_4

    const/16 v0, 0x12

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    const-string v0, "\u06e7\u06e3\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v2, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    or-int/2addr v0, v2

    const v2, -0x1ac83c

    xor-int/2addr v0, v2

    goto/16 :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa720 -> :sswitch_0
        0x1aab9d -> :sswitch_5
        0x1ab6a6 -> :sswitch_2
        0x1ac584 -> :sswitch_4
        0x1ac928 -> :sswitch_3
        0x1ac9a9 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lld;)Lld;
    .locals 7

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e8"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v6, v0

    move-object v5, v0

    move-object v1, v0

    move-object v4, v0

    move v3, v2

    :goto_0
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget v0, p0, Lq9;->e:I

    packed-switch v0, :pswitch_data_0

    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟۟ۤ۟ۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    div-int/lit16 v2, v2, -0x589

    xor-int/2addr v0, v2

    if-ltz v0, :cond_2

    invoke-static {}, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۢ۠ۨ۟()I

    const-string v0, "\u06e3\u06e2\u06e1"

    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lq9;->h:Ljava/io/Serializable;

    check-cast v0, Ljava/util/LinkedHashSet;

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v2, :cond_0

    move-object v2, v0

    :goto_1
    const-string v0, "\u06e1\u06e0\u06df"

    move-object v3, v0

    :goto_2
    invoke-static {v3}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v0

    move-object v5, v2

    move v3, v0

    goto :goto_0

    :cond_0
    sget v2, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v3, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    sub-int/2addr v2, v3

    const v3, 0x1aa98c

    add-int/2addr v2, v3

    move-object v5, v0

    move v3, v2

    goto :goto_0

    :sswitch_3
    new-instance v0, Lq9;

    iget-object v2, p0, Lq9;->g:Ljava/lang/String;

    iget-object v3, p0, Lq9;->f:Ljava/lang/ClassLoader;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lq9;-><init>(Li00;Ljava/lang/String;Ljava/lang/ClassLoader;Lo9;Lld;)V

    :goto_3
    return-object v0

    :pswitch_0
    :sswitch_4
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v0

    if-gtz v0, :cond_1

    const/16 v0, 0x9

    sput v0, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    const-string v0, "\u06e3\u06df\u06e8"

    invoke-static {v0}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣ۟ۦۥۥ(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto :goto_0

    :cond_1
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/2addr v0, v2

    const v2, 0x1ab880

    add-int/2addr v0, v2

    move v3, v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lq9;->h:Ljava/io/Serializable;

    check-cast v0, Li00;

    move-object v2, v5

    move-object v1, v0

    goto :goto_1

    :sswitch_6
    new-instance v0, Lq9;

    iget-object v2, p0, Lq9;->f:Ljava/lang/ClassLoader;

    iget-object v3, p0, Lq9;->g:Ljava/lang/String;

    move-object v1, v5

    move-object v4, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lq9;-><init>(Ljava/util/LinkedHashSet;Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;Lld;)V

    goto :goto_3

    :sswitch_7
    iget-object v0, p0, Lq9;->i:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    sget v2, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    sget v3, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    rem-int/2addr v2, v3

    const v3, 0x1aae6e

    add-int/2addr v2, v3

    move-object v6, v0

    move v3, v2

    goto/16 :goto_0

    :cond_2
    sget v0, Landroidx/appcompat/widget/۟ۥۥۤۦ;->ۨۥ۟۟:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    mul-int/2addr v0, v2

    const v2, 0x1dc1cb

    xor-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_8
    sget v0, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v2, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    xor-int/lit16 v2, v2, 0x18f5

    sub-int/2addr v0, v2

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e5\u06df\u06e0"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    move v3, v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    rem-int/2addr v0, v2

    const v2, 0xdc30

    add-int/2addr v0, v2

    move v3, v0

    goto/16 :goto_0

    :sswitch_9
    iget-object v0, p0, Lq9;->i:Ljava/lang/Object;

    check-cast v0, Lo9;

    sget v2, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    if-ltz v2, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟۟ۤۦۨ()I

    const-string v2, "\u06e3\u06e0\u06e0"

    invoke-static {v2}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v4, v0

    move v3, v2

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e3\u06df\u06e3"

    move-object v2, v5

    move-object v4, v0

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe9 -> :sswitch_0
        0x1aa81a -> :sswitch_7
        0x1aaba0 -> :sswitch_4
        0x1aaea0 -> :sswitch_9
        0x1aaec0 -> :sswitch_2
        0x1aaee1 -> :sswitch_6
        0x1ab2a2 -> :sswitch_8
        0x1ab607 -> :sswitch_3
        0x1ab623 -> :sswitch_1
        0x1ab646 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    const/4 v3, 0x0

    const-string v1, "\u06e2\u06e5\u06e4"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v5

    move-object v1, v0

    move-object v4, v0

    move-object v2, v0

    :goto_0
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Landroidx/profileinstaller/ۣ۠ۨۢ;->ۣ۟ۧ:I

    if-ltz v0, :cond_4

    invoke-static {}, Lkotlinx/coroutines/ۦۡۧۧ;->۟ۤۧۨۦ()I

    const-string v0, "\u06e6\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->ۣ۠ۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :sswitch_1
    invoke-virtual {v4, v1}, Lq9;->g(Ljava/lang/Object;)Ljava/lang/Object;

    sget v0, Landroid/app/۟ۦۦۤۥ;->۟۠ۧۤۡ:I

    if-gtz v0, :cond_0

    const-string v0, "\u06e2\u06e5\u06e4"

    :goto_1
    invoke-static {v0}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    mul-int/2addr v0, v5

    const v5, 0x1abdd5

    xor-int/2addr v0, v5

    move v5, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p2

    check-cast v0, Lld;

    sget v2, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v5, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    rem-int/lit16 v5, v5, 0x18f5

    div-int/2addr v2, v5

    if-ltz v2, :cond_1

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    move-object v2, v0

    :goto_2
    const-string v0, "\u06e0\u06e2\u06e5"

    invoke-static {v0}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_1
    sget v2, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    add-int/2addr v2, v5

    const v5, 0x1aa8cd

    add-int/2addr v5, v2

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p1

    check-cast v0, Loe;

    sget v0, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۣ۟ۢۥ۟:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    or-int/lit16 v5, v5, 0x30e

    xor-int/2addr v0, v5

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۢۡۤ()I

    const-string v0, "\u06df\u06e1\u06e0"

    invoke-static {v0}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e7\u06e6"

    goto :goto_1

    :sswitch_4
    invoke-virtual {p0, v2}, Lq9;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Lq9;

    sget-object v1, Lvh;->n:Lvh;

    invoke-virtual {v0, v1}, Lq9;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :sswitch_5
    return-object v1

    :sswitch_6
    packed-switch v3, :pswitch_data_0

    :sswitch_7
    invoke-static {}, Landroidx/versionedparcelable/۟ۥۦۡۤ;->ۣ۟ۤۦۡ()I

    move-result v0

    if-ltz v0, :cond_3

    const-string v0, "\u06e5\u06e4\u06e3"

    :goto_3
    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u06e2\u06df\u06e5"

    goto :goto_3

    :sswitch_8
    iget v3, p0, Lq9;->e:I

    const-string v0, "\u06df\u06e2\u06e4"

    goto :goto_3

    :cond_4
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v5, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v0, v5

    const v5, 0x1aaee3

    add-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    :sswitch_9
    sget-object v0, Lvh;->n:Lvh;

    invoke-static {}, Landroidx/startup/ۣۤۦۥ;->۠ۨ۟()I

    move-result v1

    if-gtz v1, :cond_5

    const/4 v1, 0x5

    sput v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    const-string v1, "\u06e4\u06e1\u06e7"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v5

    move-object v1, v0

    goto/16 :goto_0

    :cond_5
    move-object v1, v0

    goto :goto_2

    :sswitch_a
    invoke-virtual {p0, v2}, Lq9;->a(Lld;)Lld;

    move-result-object v0

    check-cast v0, Lq9;

    sget v4, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v5, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣۡۧۥ:I

    mul-int/2addr v4, v5

    const v5, 0x24a93a

    add-int/2addr v5, v4

    move-object v4, v0

    goto/16 :goto_0

    :pswitch_0
    :sswitch_b
    invoke-static {}, Landroidx/savedstate/ۢۨۧۤ;->ۨ۠ۨۡ()I

    move-result v0

    if-ltz v0, :cond_6

    const-string v0, "\u06e0\u06e8\u06e4"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    move v5, v0

    goto/16 :goto_0

    :cond_6
    sget v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    sget v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    rem-int/2addr v0, v5

    const v5, -0x1ab727

    xor-int/2addr v0, v5

    move v5, v0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc9c -> :sswitch_0
        0xdcdf -> :sswitch_2
        0x1aa73e -> :sswitch_6
        0x1aa761 -> :sswitch_3
        0x1aa7fd -> :sswitch_5
        0x1aab23 -> :sswitch_1
        0x1ab248 -> :sswitch_4
        0x1ab301 -> :sswitch_8
        0x1ab648 -> :sswitch_a
        0x1aba0a -> :sswitch_7
        0x1abe85 -> :sswitch_b
        0x1ac226 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    const/16 v21, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-string v15, "\u06e8\u06e7\u06e5"

    invoke-static {v15}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v23

    move-object v15, v1

    move-object/from16 v16, v5

    move-object/from16 v17, v7

    move-object/from16 v18, v9

    :goto_0
    sparse-switch v23, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    sget-object v1, Lbz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object v1, v3

    check-cast v1, Li00;

    iget-object v1, v1, Li00;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget v4, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->ۨۨ۟۠:I

    if-gtz v4, :cond_1c

    invoke-static {}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->۟ۡۥۥۣ()I

    const-string v4, "\u06e7\u06e3"

    move-object v5, v4

    :goto_1
    invoke-static {v5}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۤۢۧۡ(Ljava/lang/Object;)I

    move-result v5

    move-object v4, v1

    move/from16 v23, v5

    goto :goto_0

    :sswitch_1
    :try_start_0
    sget v1, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    xor-int/lit16 v1, v1, -0x276

    aput-object v16, v19, v1

    move-object/from16 v0, v19

    invoke-static {v14, v0}, Lde/robv/android/xposed/XposedHelpers;->newInstance(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    sget v5, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v7, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    div-int/lit16 v7, v7, -0x2467

    mul-int/2addr v5, v7

    if-eqz v5, :cond_0

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v5, "\u06e1\u06e4\u06e2"

    invoke-static {v5}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->ۥۥ۠(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v20, v1

    move/from16 v23, v5

    goto :goto_0

    :cond_0
    sget v5, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    sget v7, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    div-int/2addr v5, v7

    const v7, 0x1abaa2

    add-int/2addr v5, v7

    move-object/from16 v20, v1

    move/from16 v23, v5

    goto :goto_0

    :sswitch_2
    sget v1, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v5, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    add-int/2addr v1, v5

    const v5, 0x1ab5ae

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto :goto_0

    :sswitch_3
    move-object v1, v2

    check-cast v1, Landroid/content/Context;

    move-object/from16 v0, v16

    invoke-static {v15, v12, v0, v1}, Luv;->e(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "Mps/kzmdjg==\n"

    const-string v5, "Yc580HzO3SQ=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    sget v9, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v1

    if-gtz v1, :cond_1

    const-string v1, "\u06e3\u06e0\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v1

    move-object v10, v7

    move v11, v9

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u06e3\u06e3\u06e7"

    move-object v1, v4

    move-object v10, v7

    move v11, v9

    goto :goto_1

    :sswitch_4
    sget v1, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v5, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    mul-int/2addr v1, v5

    const v5, -0x1b0a26

    xor-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_5
    new-instance v1, Ljava/lang/Integer;

    move/from16 v0, v24

    invoke-direct {v1, v0}, Ljava/lang/Integer;-><init>(I)V

    xor-int/lit16 v1, v11, -0xb2

    add-int v5, v24, v1

    sget v1, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    if-ltz v1, :cond_2

    invoke-static {}, Landroidx/appcompat/widget/ۣۤۤۥ;->ۣۣۢۢ()I

    const-string v1, "\u06e3\u06e4\u06e4"

    invoke-static {v1}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۧۦۣ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    move/from16 v24, v5

    goto/16 :goto_0

    :cond_2
    sget v1, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    mul-int/2addr v1, v7

    const v7, 0x193def

    add-int/2addr v1, v7

    move/from16 v23, v1

    move/from16 v24, v5

    goto/16 :goto_0

    :sswitch_6
    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->۟۠ۡۢۦ()I

    move-result v5

    if-gtz v5, :cond_3

    const/16 v5, 0x54

    sput v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    const-string v5, "\u06e3\u06e2\u06e5"

    invoke-static {v5}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v5

    move-object/from16 v19, v1

    move/from16 v23, v5

    goto/16 :goto_0

    :cond_3
    sget v5, Lcom/google/android/material/carousel/۟ۧۡۢ;->ۦۥۥ:I

    sget v7, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    rem-int/2addr v5, v7

    const v7, 0x1ac929

    add-int/2addr v5, v7

    move-object/from16 v19, v1

    move/from16 v23, v5

    goto/16 :goto_0

    :sswitch_7
    packed-switch v21, :pswitch_data_0

    :sswitch_8
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v5, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    or-int/lit16 v5, v5, -0x20ba

    rem-int/2addr v1, v5

    if-gtz v1, :cond_e

    invoke-static {}, Landroidx/profileinstaller/ۣ۟۠ۧۦ;->۟ۢۡ۠ۦ()I

    const-string v1, "\u06e7\u06e1\u06e0"

    :goto_2
    invoke-static {v1}, Landroid/app/ۣۢۤۥ;->۟ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u06e2\u06e1\u06e1"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    move/from16 v24, v22

    goto/16 :goto_0

    :sswitch_9
    :try_start_2
    sget-object v7, Lbz;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v9, Lkx;

    move-object/from16 v0, v17

    invoke-direct {v9, v4, v0}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v1, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    if-gtz v1, :cond_5

    invoke-static {}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۡۦۣۨ()I

    const-string v1, "\u06df\u06e6\u06e6"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    move-object v6, v7

    move-object v8, v9

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06e2\u06e6\u06e8"

    move-object v1, v4

    move-object v6, v7

    move-object v8, v9

    goto/16 :goto_1

    :sswitch_a
    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v5, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    mul-int/2addr v1, v5

    const v5, 0x3b9c8

    sub-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_b
    :try_start_3
    move-object/from16 v0, v20

    invoke-static {v15, v0}, Luv;->d(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    sget v1, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    sget v5, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    add-int/lit16 v5, v5, -0x1df3

    or-int/2addr v1, v5

    if-ltz v1, :cond_6

    invoke-static {}, Landroidx/activity/ۣ۟ۧۨۡ;->ۡۥۧۧ()I

    const-string v1, "\u06e2\u06e7\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_6
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    xor-int/2addr v1, v5

    const v5, 0x1aab61

    xor-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_c
    sget v1, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    sget v5, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    mul-int/lit16 v5, v5, -0x2619

    xor-int/2addr v1, v5

    if-ltz v1, :cond_7

    const/16 v1, 0x41

    sput v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v1, "\u06e7\u06e0\u06e1"

    invoke-static {v1}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v1

    move-object v13, v10

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_7
    move-object v1, v12

    move-object v5, v10

    :goto_3
    const-string v7, "\u06e0\u06e2\u06e0"

    move-object v12, v1

    move-object v9, v14

    move-object v13, v5

    :goto_4
    invoke-static {v7}, Landroidx/appcompat/app/ۥۦۣ۠;->ۣۧۦ۟(Ljava/lang/Object;)I

    move-result v1

    move-object v14, v9

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_d
    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v5, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    add-int/lit16 v5, v5, -0xbe

    or-int/2addr v1, v5

    if-ltz v1, :cond_8

    const/16 v1, 0x5d

    sput v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    const-string v1, "\u06e7\u06e7\u06e1"

    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_8
    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v5, Landroidx/appcompat/app/ۥۦۣ۠;->۟ۡۨۢۥ:I

    xor-int/2addr v1, v5

    const v5, 0x1aacdf

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v0, p0

    iget v5, v0, Lq9;->e:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lq9;->i:Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lq9;->g:Ljava/lang/String;

    sget v7, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v9, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    or-int/2addr v7, v9

    const v9, 0x1ab345

    add-int/2addr v7, v9

    move-object/from16 v16, v1

    move/from16 v21, v5

    move/from16 v23, v7

    goto/16 :goto_0

    :sswitch_f
    sget v1, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/lit16 v5, v5, 0x1725

    rem-int/2addr v1, v5

    if-gtz v1, :cond_4

    const/16 v1, 0x54

    sput v1, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    const-string v1, "\u06e7\u06e3\u06e0"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۧۦۣۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    move/from16 v24, v22

    goto/16 :goto_0

    :sswitch_10
    :try_start_4
    sget v1, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    xor-int/lit16 v1, v1, 0x2db

    aput-object v4, v19, v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v5, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->ۥۥۧۡ:I

    add-int/2addr v1, v5

    const v5, 0x1aadb5

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :pswitch_0
    :sswitch_11
    sget v1, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    if-gtz v1, :cond_9

    const/16 v1, 0x5f

    sput v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    const-string v1, "\u06df\u06e0\u06e5"

    invoke-static {v1}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e1\u06e3"

    invoke-static {v1}, Lcom/google/android/material/theme/ۣۡ۟ۧ;->ۡۥۣۢ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_a
    :sswitch_12
    sget v1, Landroidx/lifecycle/۟۟ۡۨ;->۟ۥ۟ۥۣ:I

    sget v5, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۟ۦۧۢۧ:I

    xor-int/2addr v1, v5

    const v5, 0x1aa8da

    xor-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_13
    :try_start_5
    sget-object v1, Lpb0;->j:Ljava/lang/String;

    invoke-static {v1, v15}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v5

    sget v1, Landroidx/savedstate/۠ۡۢ۠;->ۢۤ۟۠:I

    if-ltz v1, :cond_b

    const-string v1, "\u06e7\u06e5\u06e5"

    invoke-static {v1}, Lkotlinx/coroutines/ۦۡۧۧ;->ۤۦۥۨ(Ljava/lang/Object;)I

    move-result v1

    move-object v14, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e4\u06e4\u06e2"

    move-object v7, v1

    move-object v9, v5

    goto/16 :goto_4

    :catch_0
    move-exception v1

    sget v1, Landroid/app/ۦۥۡ۠;->۟ۤۨۦۣ:I

    sget v5, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    xor-int/2addr v1, v5

    const v5, 0x1abbe4

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_14
    if-nez v14, :cond_c

    invoke-static {}, L۟ۡۦۧۤ;->۟۟۠ۡۢ()I

    move-result v1

    if-ltz v1, :cond_19

    const-string v1, "\u06e2\u06e3"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_15
    new-instance v1, Lkx;

    new-instance v2, Ljava/lang/Integer;

    move/from16 v0, v24

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v1, v2, v13}, Lkx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_5
    return-object v1

    :cond_c
    :sswitch_16
    sget v1, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۥۣۤۤ:I

    if-ltz v1, :cond_d

    const-string v1, "\u06e1\u06e7\u06e6"

    :goto_6
    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_d
    sget v1, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v5, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    or-int/2addr v1, v5

    const v5, 0x1ab888

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u06e7\u06e3"

    invoke-static {v1}, Landroidx/fragment/app/۟ۧۡۦ;->ۦۡۨۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_17
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v5, Luv;->a:Landroid/os/Handler;

    sget v5, Landroidx/versionedparcelable/ۣ۟۠ۨ;->۟ۧۡۥۥ:I

    if-ltz v5, :cond_f

    move-object v5, v13

    goto/16 :goto_3

    :cond_f
    sget v5, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v7, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    div-int/2addr v5, v7

    const v7, 0x1ab623

    add-int/2addr v5, v7

    move-object v12, v1

    move/from16 v23, v5

    goto/16 :goto_0

    :sswitch_18
    const-string v13, ""

    sget v1, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v1, :cond_10

    const-string v1, "\u06e5\u06e6\u06e7"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_10
    sget v1, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۦۡ۟ۡ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۡۢۢ;->ۢۧ۟ۧ:I

    sub-int/2addr v1, v5

    const v5, 0x1ac8f3

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_19
    const-string v1, "DLRazV6RTi0=\n"

    const-string v5, "Y9oIqC3kIlk=\n"

    invoke-static {v1, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    sget v1, Lcom/google/android/material/theme/۠ۥ۠ۤ;->۟ۢۡۢۡ:I

    sget v5, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    xor-int/2addr v1, v5

    const v5, 0xdfa5

    xor-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1a
    invoke-static/range {p1 .. p1}, Lct;->y(Ljava/lang/Object;)V

    move-object v1, v3

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    const-string v7, "\u06e1\u06e3\u06e3"

    invoke-static {v7}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v7

    move-object/from16 v18, v1

    move/from16 v22, v5

    move/from16 v23, v7

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    iget-object v1, v0, Lq9;->f:Ljava/lang/ClassLoader;

    move-object/from16 v0, p0

    iget-object v3, v0, Lq9;->h:Ljava/io/Serializable;

    sget v5, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v5, :cond_11

    const/16 v5, 0x10

    sput v5, Landroidx/appcompat/widget/ۣۤۤۥ;->۟ۡۢۨۢ:I

    :cond_11
    const-string v5, "\u06e6\u06e1\u06df"

    invoke-static {v5}, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۧۦۥۧ(Ljava/lang/Object;)I

    move-result v5

    move-object v15, v1

    move/from16 v23, v5

    goto/16 :goto_0

    :sswitch_1c
    sget v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    sget v5, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    add-int/lit16 v5, v5, -0xb3d

    mul-int/2addr v1, v5

    if-ltz v1, :cond_12

    const/16 v1, 0x51

    sput v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    const-string v1, "\u06e3\u06e8\u06e0"

    invoke-static {v1}, Lcom/google/android/material/appbar/ۢۧۦۢ;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_12
    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v5, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    add-int/2addr v1, v5

    const v5, 0x1ac8a8

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1d
    sget-object v1, Lvh;->n:Lvh;

    goto/16 :goto_5

    :sswitch_1e
    new-instance v5, Lf;

    const/4 v7, 0x1

    move-object v1, v2

    check-cast v1, Lo9;

    invoke-direct {v5, v7, v1}, Lf;-><init>(ILjava/lang/Object;)V

    const-string v1, "unqkpw==\n"

    const-string v7, "zQLNw6hs6zA=\n"

    const-string v9, "MLe8dAzy4+Aauw==\n"

    const-string v17, "U9/dAH6djI0=\n"

    move-object/from16 v0, v17

    invoke-static {v1, v7, v4, v9, v0}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Bq8XL2nL\n"

    const-string v7, "asB2Swy5C1E=\n"

    invoke-static {v1, v7}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۟ۦ۠ۡۢ()I

    move-result v1

    if-ltz v1, :cond_13

    invoke-static {}, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣ۟۠()I

    const-string v1, "\u06e4\u06e1\u06e7"

    invoke-static {v1}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v17, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_13
    sget v1, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    sget v7, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    xor-int/2addr v1, v7

    const v7, 0x1aa998

    xor-int/2addr v1, v7

    move-object/from16 v17, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_1f
    move-object v7, v10

    :cond_14
    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    if-gtz v1, :cond_15

    const/16 v1, 0x5f

    sput v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    const-string v1, "\u06e0\u06e3"

    move-object v10, v7

    :goto_7
    invoke-static {v1}, Landroidx/versionedparcelable/ۣ۟۠ۨ;->ۧۤ۠(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_15
    sget v1, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    sget v5, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    add-int/2addr v1, v5

    const v5, 0x1ac3a9

    add-int/2addr v1, v5

    move-object v10, v7

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_20
    sget v1, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->۠ۧ۟۠:I

    sget v5, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    div-int/lit16 v5, v5, 0xcfb

    xor-int/2addr v1, v5

    if-ltz v1, :cond_16

    invoke-static {}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->۟ۢۦۡۦ()I

    const-string v1, "\u06e3\u06e3\u06e7"

    invoke-static {v1}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_16
    sget v1, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sget v5, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۦۣۨ:I

    add-int/2addr v1, v5

    const v5, 0x1abea4

    xor-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :sswitch_21
    invoke-static {}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->۟ۥۧۦۥ()I

    move-result v1

    if-gtz v1, :cond_17

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->۠ۥۥ۟()I

    const-string v1, "\u06e1\u06e6\u06e0"

    invoke-static {v1}, Landroidx/appcompat/widget/۟ۢۨۦ;->۠ۢۤۥ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_17
    const-string v1, "\u06e0\u06e7\u06e5"

    goto :goto_7

    :sswitch_22
    if-nez v20, :cond_a

    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v5, Lio/fastkv/ۦۣ۠ۨ;->ۣۧ۠ۦ:I

    div-int/lit16 v5, v5, 0x154

    div-int/2addr v1, v5

    if-ltz v1, :cond_18

    invoke-static {}, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۦۥ()I

    const-string v1, "\u06e2\u06e6\u06e8"

    invoke-static {v1}, Landroidx/core/content/ۥۨۤۦ;->۠ۧۨۤ(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_18
    const-string v1, "\u06e1\u06e6\u06e4"

    goto :goto_7

    :sswitch_23
    :try_start_6
    move-object/from16 v0, v20

    invoke-virtual {v6, v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    sget v1, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    sget v5, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    or-int/lit16 v5, v5, 0x227d

    sub-int/2addr v1, v5

    if-ltz v1, :cond_1a

    :cond_19
    const-string v1, "\u06e4\u06e4\u06e6"

    move-object v5, v1

    :goto_8
    invoke-static {v5}, Lcom/github/megatronking/stringfog/xor/۟۟ۥۡ;->ۣۤۧ۟(Ljava/lang/Object;)I

    move-result v1

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_1a
    const-string v1, "\u06e5\u06e6\u06e7"

    goto/16 :goto_6

    :cond_1b
    :sswitch_24
    const-string v1, "\u06e2\u06e7\u06e7"

    goto/16 :goto_2

    :sswitch_25
    sget v1, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v5, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    add-int/2addr v1, v5

    const v5, 0x1abd9f

    add-int/2addr v1, v5

    move/from16 v23, v1

    goto/16 :goto_0

    :cond_1c
    const-string v5, "\u06e5\u06e6\u06e8"

    move-object v4, v1

    goto :goto_8

    :sswitch_data_0
    .sparse-switch
        0xdc22 -> :sswitch_0
        0xdc41 -> :sswitch_1f
        0xdcba -> :sswitch_13
        0xdcdc -> :sswitch_1a
        0x1aa7df -> :sswitch_d
        0x1aaac6 -> :sswitch_1d
        0x1aaae0 -> :sswitch_9
        0x1aab1e -> :sswitch_21
        0x1aab9c -> :sswitch_19
        0x1aabbe -> :sswitch_4
        0x1aaf01 -> :sswitch_18
        0x1aaf1f -> :sswitch_a
        0x1aaf5b -> :sswitch_1c
        0x1aaf5f -> :sswitch_20
        0x1ab282 -> :sswitch_17
        0x1ab305 -> :sswitch_1
        0x1ab324 -> :sswitch_23
        0x1ab340 -> :sswitch_4
        0x1ab342 -> :sswitch_15
        0x1ab628 -> :sswitch_3
        0x1ab666 -> :sswitch_6
        0x1ab687 -> :sswitch_5
        0x1ab6a3 -> :sswitch_8
        0x1ab6fb -> :sswitch_1b
        0x1aba0a -> :sswitch_24
        0x1aba62 -> :sswitch_14
        0x1aba66 -> :sswitch_25
        0x1abae0 -> :sswitch_22
        0x1abe26 -> :sswitch_d
        0x1abe61 -> :sswitch_d
        0x1abe66 -> :sswitch_b
        0x1abe67 -> :sswitch_1e
        0x1abe9f -> :sswitch_d
        0x1ac184 -> :sswitch_7
        0x1ac188 -> :sswitch_11
        0x1ac264 -> :sswitch_16
        0x1ac509 -> :sswitch_f
        0x1ac528 -> :sswitch_4
        0x1ac584 -> :sswitch_2
        0x1ac5a3 -> :sswitch_12
        0x1ac5c7 -> :sswitch_c
        0x1ac982 -> :sswitch_10
        0x1ac9c6 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
