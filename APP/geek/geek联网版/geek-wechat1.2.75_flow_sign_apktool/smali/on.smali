.class public final synthetic Lon;
.super Ljava/lang/Object;

# interfaces
.implements Luh;


# instance fields
.field public final a:I

.field public final b:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/LinearLayout;I)V
    .locals 3

    iput p2, p0, Lon;->a:I

    iput-object p1, p0, Lon;->b:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const-string v1, "\u06df\u06df\u06e1"

    invoke-static {v1}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۤۦۨ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    :goto_0
    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/android/material/datepicker/۟ۥۥۣ;->۟ۤ۟ۦ۟()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣۣ۟ۡ()I

    move-result v0

    if-gtz v0, :cond_0

    const/16 v0, 0x23

    sput v0, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۥۧۨ:I

    :cond_0
    const-string v0, "\u06e3\u06e7\u06e8"

    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "foiEjxRkFHS1uIZFKqo8rw"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->۟ۥۤ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    sget v2, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    add-int/lit16 v2, v2, -0x16c6

    sub-int/2addr v1, v2

    if-gtz v1, :cond_1

    :cond_1
    const-string v1, "\u06e6\u06e1\u06e6"

    invoke-static {v1}, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->ۨۦۥۥ(Ljava/lang/Object;)I

    move-result v2

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟ۧ۠ۧۢ()I

    move-result v0

    if-ltz v0, :cond_2

    const/16 v0, 0x25

    sput v0, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    const-string v0, "\u06e8\u06e6\u06e2"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/ۦۣۣۧ;->۟ۢۤ۠ۨ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06df\u06df\u06e1"

    goto :goto_1

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    sget v2, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    add-int/lit16 v2, v2, -0xfaf

    rem-int/2addr v0, v2

    if-gtz v0, :cond_3

    const-string v0, "\u06e5\u06e0\u06e5"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    move v2, v0

    goto :goto_0

    :cond_3
    sget v0, Landroidx/coordinatorlayout/widget/۟ۨۨۡ;->ۦۦۦۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    mul-int/2addr v0, v2

    const v2, 0x1874a0

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :cond_4
    :sswitch_4
    sget v0, Lcom/ljx/wechatmod/hook/۠ۧۤ۟;->ۥۤۧ۠:I

    sget v2, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۤۤ۠:I

    or-int/2addr v0, v2

    const v2, 0x1abe69

    add-int/2addr v0, v2

    move v2, v0

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa701 -> :sswitch_0
        0x1aa7bf -> :sswitch_4
        0x1ab704 -> :sswitch_1
        0x1abdaa -> :sswitch_2
        0x1abe60 -> :sswitch_5
        0x1ac18b -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Lcom/google/android/material/datepicker/۟ۢۤۧۥ;->ۡۦۨۧ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :pswitch_0
    :sswitch_0
    sget v0, Lcom/google/android/material/textfield/ۡۢۥۡ;->ۢۦ۠۟:I

    if-gtz v0, :cond_4

    const/16 v0, 0x46

    sput v0, Landroidx/core/graphics/drawable/ۣۡ۟ۢ;->ۣۣ۠ۡ:I

    const-string v0, "\u06df\u06e3\u06e8"

    :goto_1
    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lon;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/datepicker/ۥۨۨ۟;->ۦۢۢۢ()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "\u06e0\u06e1\u06e6"

    invoke-static {v0}, Landroidx/appcompat/view/menu/۟ۢۧۤۧ;->ۣ۟ۦ۟(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    sget v1, Landroid/app/۟ۡۧۦۡ;->۟ۦۣۧۧ:I

    sub-int/2addr v0, v1

    const v1, -0x1abcb9

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lon;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    invoke-static {}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->ۤ۠ۡۧ()I

    move-result v0

    if-ltz v0, :cond_1

    const/4 v0, 0x4

    sput v0, L۟ۤۧۦۢ;->ۣ۟۠۠۟:I

    const-string v0, "\u06e2\u06e6"

    invoke-static {v0}, Landroid/window/ۣۤ۠ۢ;->ۥۢۥ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/ljx/wechatmod/ui/۠ۧۢۢ;->۟ۤۨ:I

    sget v1, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    mul-int/2addr v0, v1

    const v1, -0x185a2c

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_3
    iget v0, p0, Lon;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_4
    invoke-static {}, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟۠ۢۨۦ()I

    move-result v0

    if-gtz v0, :cond_2

    const/16 v0, 0x50

    sput v0, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    const-string v0, "\u06e0\u06e2"

    :goto_2
    invoke-static {v0}, Landroidx/legacy/content/ۨ۠ۦۥ;->ۦۥۡۨ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_2
    const-string v0, "\u06e0\u06e1\u06e6"

    invoke-static {v0}, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->۟۠ۢۥۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    sget v0, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    if-gtz v0, :cond_3

    invoke-static {}, Landroidx/constraintlayout/helper/widget/۠ۤۢۢ;->ۢۧۥ()I

    const-string v0, "\u06e1\u06e6"

    :goto_3
    invoke-static {v0}, Lcom/google/android/material/behavior/ۢۤۡ;->ۤۨۨۥ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/datepicker/۟ۥۢۢ۟;->ۣ۟ۧۤ۠:I

    sget v1, Landroidx/legacy/content/ۧۡ۠۠;->ۤۧۧۡ:I

    rem-int/2addr v0, v1

    const v1, 0x1abfb3

    xor-int/2addr v0, v1

    goto/16 :goto_0

    :cond_4
    const-string v0, "\u06e0\u06e4\u06e5"

    goto :goto_1

    :sswitch_6
    iget-object v0, p0, Lon;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->۟ۤۤۥ۠:I

    if-ltz v0, :cond_5

    invoke-static {}, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->۟ۦۥۨ۠()I

    const-string v0, "\u06e5\u06e8\u06e0"

    invoke-static {v0}, Landroidx/core/content/ۣ۟ۤۧۨ;->۟ۦ۟ۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_5
    const-string v0, "\u06e5\u06e1\u06e2"

    goto :goto_2

    :pswitch_1
    :sswitch_7
    const-string v0, "\u06e7\u06e6\u06e0"

    goto :goto_3

    :sswitch_8
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_0
        0x1aab05 -> :sswitch_1
        0x1aab61 -> :sswitch_6
        0x1ab242 -> :sswitch_8
        0x1ab280 -> :sswitch_7
        0x1ababd -> :sswitch_8
        0x1abdc6 -> :sswitch_8
        0x1abe9d -> :sswitch_3
        0x1ac14d -> :sswitch_5
        0x1ac58a -> :sswitch_4
        0x1ac5e1 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
