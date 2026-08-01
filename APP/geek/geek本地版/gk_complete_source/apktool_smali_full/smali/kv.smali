.class public final synthetic Lkv;
.super Ljava/lang/Object;

# interfaces
.implements Lsm;


# instance fields
.field public final a:I

.field public final b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 3

    iput p2, p0, Lkv;->a:I

    iput-object p1, p0, Lkv;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e5\u06e2"

    invoke-static {v1}, Landroidx/coordinatorlayout/widget/ۣۥۨۢ;->ۣ۟ۧ۠ۡ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget v0, Lcom/ljx/wechatmod/auth/۟ۤۡۤۡ;->ۣ۟۠ۨۡ:I

    if-ltz v0, :cond_0

    invoke-static {}, Landroid/app/ۣۢۤۥ;->ۣۤۧۧ()I

    const-string v0, "\u06e3\u06e5\u06e3"

    :goto_1
    invoke-static {v0}, Landroid/app/۟ۦۦۤۥ;->ۦۨۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e7\u06e5\u06e2"

    goto :goto_1

    :cond_1
    :sswitch_1
    invoke-static {}, Landroidx/lifecycle/۟۟ۡۨ;->ۦۣ۟ۦ()I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v0, "\u06df\u06e7\u06df"

    :goto_2
    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e8\u06e4\u06e3"

    goto :goto_1

    :sswitch_2
    invoke-static {}, Lcom/google/android/material/carousel/۟ۧۡۢ;->۟ۦۥۣۧ()I

    move-result v0

    if-ltz v0, :cond_1

    sget v0, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    xor-int/lit16 v2, v2, 0x1bfe

    xor-int/2addr v0, v2

    if-gtz v0, :cond_3

    const/16 v0, 0x63

    sput v0, Landroidx/versionedparcelable/۟۟۠ۥ۠;->ۡۥۤۢ:I

    :cond_3
    const-string v0, "\u06e6\u06e4\u06e4"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    if-ltz v0, :cond_4

    invoke-static {}, Landroidx/fragment/app/۟ۧۡۦ;->ۧۤۨ۟()I

    const-string v0, "\u06e7\u06e5\u06e2"

    invoke-static {v0}, Landroid/app/۠ۨۥۨ;->ۣۢ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_4
    const-string v0, "\u06e8\u06e4\u06e3"

    goto :goto_2

    :sswitch_4
    const-string v0, "fqvllKtCK2AL76O"

    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->ۣۣۣۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget v1, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    sget v2, Landroidx/savedstate/ۡۤۨۡ;->۟ۢۡۨ۠:I

    rem-int/2addr v1, v2

    const v2, 0x1ac470

    add-int/2addr v2, v1

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1f -> :sswitch_0
        0xdc45 -> :sswitch_1
        0x1ac1e6 -> :sswitch_4
        0x1ac204 -> :sswitch_3
        0x1ac5c4 -> :sswitch_2
        0x1ac967 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "\u06e5\u06e8\u06df"

    invoke-static {v0}, Lkotlinx/coroutines/ۣ۟ۧۦ۟;->ۣۨۥۡ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Lkv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lkv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :sswitch_2
    iget v0, p0, Lkv;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v1, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    mul-int/2addr v0, v1

    const v1, 0x255c9

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lۣ۟ۢ۠۠;->۠۟ۥ۠()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-static {}, L۠ۡۢۨ;->ۥۡ۠ۨ()I

    const-string v0, "\u06e3\u06e4\u06e5"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۥ۠۟۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e5\u06e8\u06df"

    goto :goto_2

    :pswitch_0
    :sswitch_5
    const-string v0, "\u06e2\u06e4\u06e7"

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc62 -> :sswitch_0
        0x1ab2e5 -> :sswitch_1
        0x1abe44 -> :sswitch_3
        0x1abe9c -> :sswitch_2
        0x1ac220 -> :sswitch_5
        0x1ac966 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
