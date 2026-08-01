.class public final synthetic Ljs;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;

.field public final c:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Ljs;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "\u06e8\u06e4\u06e5"

    invoke-static {v1}, Lcom/google/android/material/datepicker/ۥۢۢۢ;->ۨۨۡ۟(Ljava/lang/Object;)I

    move-result v2

    move v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    invoke-static {}, Landroidx/savedstate/۠ۡۢ۠;->ۣ۟ۨۤۨ()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/appcompat/app/ۥۦۣ۠;->ۨۤ۠ۨ()I

    const-string v0, "\u06e0\u06e0\u06e2"

    invoke-static {v0}, Landroid/view/ۢۥۢۦ;->۟۠ۨۡ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    sget v0, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/versionedparcelable/ۣۢۥ;->ۣ۟ۥۨ۠:I

    mul-int/2addr v0, v2

    const v2, 0x1c0de2

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v0, "lE0vc2aZ0V2kY48wxMNeNQ4x"

    invoke-static {v0}, Lio/fastkv/ۦۣ۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget v1, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->ۦ۟ۨۤ:I

    sget v2, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ab506

    add-int/2addr v2, v1

    move v1, v0

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(I)V

    sget v0, Lcom/google/android/material/theme/۟ۥۦۦۧ;->۠ۢۦۦ:I

    sget v2, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟۟ۥۡۦ:I

    div-int/lit16 v2, v2, 0xad0

    add-int/2addr v0, v2

    if-ltz v0, :cond_1

    const/16 v0, 0x11

    sput v0, Landroidx/emoji2/text/ۣۣ۟۟۠;->۟ۦۤ۟ۡ:I

    const-string v0, "\u06e0\u06e0"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_1
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Landroidx/activity/ۣ۟۠ۤۢ;->ۣ۟ۢۤ:I

    add-int/2addr v0, v2

    const v2, 0xdc1c

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_4
    iput-object p2, p0, Ljs;->b:Landroid/widget/LinearLayout;

    const-string v0, "\u06e6\u06e1\u06e8"

    invoke-static {v0}, Landroidx/constraintlayout/widget/۠ۥۨۨ;->۟۟ۡۧۦ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_5
    iput-object p1, p0, Ljs;->c:Landroid/view/ViewGroup;

    invoke-static {}, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۣۨ()I

    move-result v0

    if-gtz v0, :cond_2

    const-string v0, "\u06e8\u06e4\u06e5"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->۟ۤۡۥۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06e6\u06e2"

    goto :goto_1

    :cond_3
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Lcom/google/android/material/datepicker/ۢۡۧۧ;->ۣۡ۟ۢ:I

    rem-int/2addr v0, v2

    const v2, 0xdcfb

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_6
    invoke-static {}, Landroidx/constraintlayout/widget/ۣ۟ۤۤ۟;->ۣۣۤۧ()I

    move-result v0

    if-gtz v0, :cond_0

    sget v0, Landroid/view/ۢۥۢۦ;->ۣ۠ۢۥ:I

    sget v2, Landroidx/versionedparcelable/ۥۣۦۧ;->ۣ۟ۧ۟ۨ:I

    xor-int/2addr v0, v2

    const v2, 0x1ac030

    add-int/2addr v0, v2

    move v2, v0

    goto/16 :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc00 -> :sswitch_0
        0xdc63 -> :sswitch_7
        0x1aa7db -> :sswitch_4
        0x1ab6e0 -> :sswitch_3
        0x1abd8b -> :sswitch_2
        0x1ac18d -> :sswitch_6
        0x1ac5c4 -> :sswitch_1
        0x1ac969 -> :sswitch_5
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Landroid/widget/LinearLayout;Landroid/view/ViewGroup;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Ljs;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06df\u06e3\u06e3"

    invoke-static {v0}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iput-object p1, p0, Ljs;->b:Landroid/widget/LinearLayout;

    invoke-static {}, Landroid/app/۠ۨۥۨ;->ۣۣ۟ۨۧ()I

    move-result v0

    if-gtz v0, :cond_1

    const-string v0, "\u06e2\u06e6\u06e5"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/carousel/۠ۨۡۢ;->۟ۤ۠ۥ۟(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_0
    :sswitch_1
    sget v0, Lcom/github/megatronking/stringfog/ۣۧ۠۟;->ۥۨ۠۠:I

    sget v2, Landroid/support/v4/graphics/drawable/۟ۦۡۦۡ;->ۧ۠ۥۤ:I

    add-int/2addr v0, v2

    const v2, 0x1aca52

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_2
    iput-object p2, p0, Ljs;->c:Landroid/view/ViewGroup;

    const-string v0, "\u06e2\u06e6\u06e5"

    :goto_2
    invoke-static {v0}, Landroid/app/ۦۥۡ۠;->ۣۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_3
    const-string v0, "bhInrDHGkqsqJNIoFXMa5p1p5X"

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/۟ۦۥۣۢ;->۟ۤ۟ۤۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget v1, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    sget v2, Landroidx/activity/result/ۤ۟ۨۧ;->ۣ۟ۡۤ۠:I

    xor-int/lit16 v2, v2, -0x591

    add-int/2addr v1, v2

    if-gtz v1, :cond_2

    const/16 v1, 0x45

    sput v1, Lcom/google/android/material/floatingactionbutton/۟ۧ۠ۧ۟;->ۦۣۧۡ:I

    const-string v1, "\u06e6\u06e0\u06e3"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/annotation/۟۟ۡ;->ۣ۟ۡۡ۟(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e6\u06e0\u06e3"

    goto :goto_1

    :sswitch_4
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    if-gtz v0, :cond_3

    const/16 v0, 0x4b

    sput v0, Landroidx/core/content/ۥۨۤۦ;->۟ۡۡۦۥ:I

    move-object v0, v1

    :cond_2
    const-string v1, "\u06e8\u06e0\u06e4"

    invoke-static {v1}, Lcom/google/android/material/theme/۠ۥ۠ۤ;->ۢ۠ۥۦ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۣ۟۟۟ۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۣۢۡ;->ۡ۠ۤۥ:I

    div-int/2addr v0, v2

    const v2, 0x1ac8ef

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/startup/ۣۤۦۥ;->ۨ۟ۦۢ:I

    if-ltz v0, :cond_4

    const-string v0, "\u06e3\u06e6\u06e7"

    goto :goto_2

    :cond_4
    sget v0, Landroid/app/ۣۢۤۥ;->۟ۥۧۤۡ:I

    sget v2, Lcom/google/android/material/behavior/ۣۡۡۦ;->۟ۦۨ۠ۦ:I

    sub-int/2addr v0, v2

    const v2, 0x1aa4a8

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/android/material/chip/ۣۣ۟۠ۤ;->۟ۢۧۨۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e6\u06df\u06df"

    goto :goto_2

    :sswitch_7
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa77f -> :sswitch_0
        0x1aabdc -> :sswitch_1
        0x1ab321 -> :sswitch_6
        0x1ac146 -> :sswitch_3
        0x1ac169 -> :sswitch_2
        0x1ac8ec -> :sswitch_4
        0x1ac8ed -> :sswitch_7
        0x1ac90a -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e3\u06e7"

    invoke-static {v1}, Landroidx/versionedparcelable/ۣۢۥ;->۟ۡۤۧۥ(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v1, p0, Ljs;->c:Landroid/view/ViewGroup;

    iget-object v2, p0, Ljs;->b:Landroid/widget/LinearLayout;

    invoke-static {v1, v2}, Lcom/ljx/wechatmod/ui/MainActivity;->b(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    sget v1, Landroid/support/v4/graphics/drawable/۠ۨۨۡ;->ۧۧۨۡ:I

    sget v2, Landroidx/recyclerview/widget/ۡۥۥ۠;->۟ۧۢۨۤ:I

    mul-int/lit16 v2, v2, 0x45f

    sub-int/2addr v1, v2

    if-gtz v1, :cond_0

    const-string v1, "\u06e4\u06e2"

    invoke-static {v1}, Landroidx/recyclerview/widget/ۧۧۦۢ;->۟ۡۧۥ۠(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    const-string v1, "\u06e2\u06e6\u06e4"

    invoke-static {v1}, Lcom/ljx/wechatmod/hook/۟ۡۢ۟ۧ;->۟۟۠ۢۨ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :pswitch_0
    :sswitch_1
    sget v1, Lcom/google/android/material/bottomsheet/ۣ۟۠۠ۦ;->ۣۢۡۧ:I

    sget v2, Landroidx/activity/result/ۣۥۣ۟;->۟ۥۢۢۧ:I

    div-int/2addr v1, v2

    const v2, 0xdc7e

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_2
    iget v1, p0, Ljs;->a:I

    packed-switch v1, :pswitch_data_0

    :sswitch_3
    invoke-static {}, Lcom/google/android/material/internal/۟۟ۡ۠ۦ;->۟ۤۥۧۤ()I

    move-result v1

    if-gtz v1, :cond_1

    const/16 v1, 0x58

    sput v1, Landroidx/core/content/ۣ۟ۧ۠;->۟ۥۣۡ۠:I

    const-string v1, "\u06e1\u06e6\u06df"

    invoke-static {v1}, Landroidx/viewpager2/adapter/ۢۥۤ۠;->ۤ۠۟ۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_1
    sget v1, Landroidx/viewpager2/adapter/ۢۥۤ۠;->۟۠ۢۡۡ:I

    sget v2, Landroidx/fragment/app/۟ۧۡۦ;->ۦ۟ۤۥ:I

    rem-int/2addr v1, v2

    const v2, 0x1aaa06

    add-int/2addr v1, v2

    goto :goto_0

    :sswitch_4
    sget v1, Landroidx/savedstate/ۢۨۧۤ;->۟۟ۡۡۤ:I

    sget v2, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sub-int/2addr v1, v2

    const v2, 0x1ac5d4

    xor-int/2addr v1, v2

    goto :goto_0

    :sswitch_5
    iget-object v1, p0, Ljs;->c:Landroid/view/ViewGroup;

    invoke-static {v1, v0}, Lcom/ljx/wechatmod/ui/MainActivity;->e(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;)V

    sget v1, Landroid/app/۠ۨۥۨ;->۟ۦۣۢۡ:I

    sget v2, Landroidx/recyclerview/widget/ۧۧۦۢ;->۠ۦۤۤ:I

    rem-int/lit16 v2, v2, -0x2005

    div-int/2addr v1, v2

    if-eqz v1, :cond_2

    const-string v1, "\u06e0\u06e4\u06e4"

    :goto_1
    invoke-static {v1}, Landroidx/legacy/content/۠ۥۣۥ;->۟ۧۧۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_2
    const-string v1, "\u06e3\u06e5\u06e4"

    goto :goto_1

    :sswitch_6
    iget-object v0, p0, Ljs;->b:Landroid/widget/LinearLayout;

    invoke-static {}, Lcom/ljx/wechatmod/ui/۟ۢۡ۟ۦ;->ۥۣۢۡ()I

    move-result v1

    if-gtz v1, :cond_3

    invoke-static {}, Lcom/github/megatronking/stringfog/۟ۢۦۨۦ;->ۦۡۦۢ()I

    const-string v1, "\u06e3\u06e5\u06e4"

    invoke-static {v1}, Lio/fastkv/ۦۣ۠ۨ;->۟ۡۥۥ(Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_3
    const-string v1, "\u06e0\u06e2\u06e1"

    goto :goto_1

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7e -> :sswitch_0
        0x1aab1f -> :sswitch_5
        0x1aab3e -> :sswitch_3
        0x1aab60 -> :sswitch_6
        0x1ab320 -> :sswitch_7
        0x1ab341 -> :sswitch_4
        0x1ab6c2 -> :sswitch_7
        0x1aba61 -> :sswitch_1
        0x1ac1ca -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
