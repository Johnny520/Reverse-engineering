.class public final Lnb0;
.super Ljava/lang/Object;

# interfaces
.implements Lsh;


# instance fields
.field public final a:I

.field public final b:Lmb0;

.field public final c:Lh40;


# direct methods
.method public synthetic constructor <init>(Lmb0;Lh40;I)V
    .locals 3

    iput p3, p0, Lnb0;->a:I

    iput-object p1, p0, Lnb0;->b:Lmb0;

    iput-object p2, p0, Lnb0;->c:Lh40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e6\u06e4\u06e3"

    invoke-static {v0}, Landroidx/startup/ۣۤۦۥ;->ۣۣ۟ۦۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "QMQLKCD17zMfDQUL"

    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣۨۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x14

    sput v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    :cond_0
    const-string v0, "\u06e4\u06e6\u06e4"

    invoke-static {v0}, Landroidx/savedstate/ۡۤۨۡ;->۟۠ۥۣۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e6\u06e6\u06e4"

    invoke-static {v0}, Landroidx/appcompat/widget/ۡۢ۠ۦ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->ۡ۠۟ۤ:I

    sget v2, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac008

    add-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v0

    if-gtz v0, :cond_3

    sget v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣۣ۟ۥ:I

    add-int/lit16 v2, v2, 0x2025

    add-int/2addr v0, v2

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/core/content/ۥۨۤۦ;->۟۠۠۠ۥ()I

    const-string v0, "\u06e3\u06e3\u06e8"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۣۣ۟ۤۡ;->۟ۢۤۧ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    sget v0, Landroidx/appcompat/widget/۟ۢۨۦ;->ۣۨۧۧ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    add-int/2addr v0, v2

    const v2, 0x1acb70

    add-int/2addr v0, v2

    goto :goto_0

    :cond_3
    :sswitch_4
    const-string v0, "\u06e0\u06e6\u06e5"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v0, :cond_4

    const/16 v0, 0x55

    sput v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    :cond_4
    const-string v0, "\u06e0\u06e6\u06e5"

    invoke-static {v0}, Landroidx/recyclerview/widget/ۡۥۥ۠;->ۣۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab9f -> :sswitch_0
        0x1ab688 -> :sswitch_4
        0x1abaa2 -> :sswitch_5
        0x1ac1e5 -> :sswitch_3
        0x1ac56c -> :sswitch_2
        0x1ac9c3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 5

    const/4 v4, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e8\u06e0\u06e6"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۣ۟۟۠ۤ(Ljava/lang/Object;)I

    move-result v0

    move-object v1, v2

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/chip/۟ۦۤ۟ۥ;->ۤۦۧۥ()I

    move-result v0

    if-ltz v0, :cond_3

    sget v0, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    sget v3, Landroidx/core/widget/ۣۤۨۢ;->۟۠ۨۥ:I

    add-int/lit16 v3, v3, 0x7db

    add-int/2addr v0, v3

    if-gtz v0, :cond_0

    const-string v0, "\u06e7\u06e8\u06e4"

    invoke-static {v0}, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->۟ۡۨۥۣ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lnb0;->c:Lh40;

    invoke-virtual {v0, p0}, Lh40;->e(Lsh;)V

    const-string v0, "\u06e0\u06df\u06e1"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e6\u06e7\u06e4"

    goto :goto_1

    :sswitch_2
    iget v0, p0, Lnb0;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v3, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟۠۠ۨۡ:I

    rem-int/lit16 v3, v3, 0x2195

    rem-int/2addr v0, v3

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۣ۟ۡۧ۠()I

    const-string v0, "\u06e1\u06e3\u06e5"

    goto :goto_1

    :pswitch_0
    :sswitch_4
    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    move-result v0

    if-gtz v0, :cond_1

    invoke-static {}, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۢۨۨۤ()I

    const-string v0, "\u06e3\u06e3\u06e5"

    :goto_2
    invoke-static {v0}, Landroidx/versionedparcelable/ۥۣۦۧ;->۟ۧۤۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e7\u06e8\u06e4"

    goto :goto_1

    :cond_2
    sget v0, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->۟۟ۡۢۥ:I

    sget v3, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    xor-int/2addr v0, v3

    const v3, 0x1aaff3

    add-int/2addr v0, v3

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/legacy/content/۠ۥۣۥ;->۟ۥۣۢ۠:I

    sget v3, Lcom/github/megatronking/stringfog/xor/۟ۨۦ۠;->ۡۢۢۨ:I

    rem-int/2addr v0, v3

    const v3, 0x1ac9ae

    add-int/2addr v0, v3

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lnb0;->b:Lmb0;

    iget-object v0, v0, Lmb0;->a:Landroid/view/View;

    invoke-virtual {v0, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/activity/ۣ۟ۧۨۡ;->۟۟ۨۦۦ:I

    sget v3, Landroidx/versionedparcelable/۟ۥۦۡۤ;->۟ۦۥۦ:I

    mul-int/2addr v0, v3

    const v3, -0x1b7a8c

    xor-int/2addr v0, v3

    goto :goto_0

    :cond_3
    :sswitch_7
    sget v0, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v3, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    or-int/2addr v0, v3

    const v3, 0x1ac50d

    add-int/2addr v0, v3

    goto :goto_0

    :sswitch_8
    iget-object v0, p0, Lnb0;->c:Lh40;

    invoke-virtual {v0, p0}, Lh40;->e(Lsh;)V

    sget v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    if-gtz v0, :cond_4

    const/16 v0, 0x5c

    sput v0, L۠ۡۢۨ;->۟ۤۤۦۨ:I

    const-string v0, "\u06e4\u06e3\u06e4"

    invoke-static {v0}, Landroidx/core/widget/ۣۤۨۢ;->ۣ۟ۢۧۡ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e4\u06e3\u06e4"

    goto :goto_2

    :sswitch_9
    iget-object v0, p0, Lnb0;->b:Lmb0;

    iget-object v0, v0, Lmb0;->a:Landroid/view/View;

    invoke-virtual {v0, v4, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/constraintlayout/helper/widget/۟ۥ۟۠ۢ;->ۧۥۣۦ:I

    sget v3, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    rem-int/2addr v0, v3

    const v3, 0x1ab5af

    add-int/2addr v0, v3

    goto/16 :goto_0

    :sswitch_a
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    const-string v0, "\u06e8\u06e1\u06e3"

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "mw96jiM2lj12Z"

    invoke-static {v0}, Landroidx/activity/result/ۣۥۣ۟;->۟۟ۨۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {}, Landroid/app/ۦۥۡ۠;->ۥۣۡۧ()I

    move-result v0

    if-ltz v0, :cond_5

    const-string v0, "\u06e0\u06df\u06e1"

    :goto_3
    invoke-static {v0}, Landroidx/lifecycle/۟۟ۡۨ;->۠ۡۧۥ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e4\u06e5\u06e3"

    goto :goto_3

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac2 -> :sswitch_0
        0x1aaec4 -> :sswitch_1
        0x1aaee5 -> :sswitch_9
        0x1ab666 -> :sswitch_8
        0x1ab9ea -> :sswitch_4
        0x1aba45 -> :sswitch_c
        0x1aba82 -> :sswitch_a
        0x1abd8e -> :sswitch_3
        0x1ac243 -> :sswitch_b
        0x1ac623 -> :sswitch_6
        0x1ac8ee -> :sswitch_2
        0x1ac90a -> :sswitch_c
        0x1ac90c -> :sswitch_7
        0x1ac9c9 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
