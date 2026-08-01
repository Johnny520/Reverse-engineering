.class public final Lsb0;
.super Ljava/lang/Object;

# interfaces
.implements Luh;


# instance fields
.field public final a:I

.field public final b:Lrb0;

.field public final c:Lo40;


# direct methods
.method public synthetic constructor <init>(Lrb0;Lo40;I)V
    .locals 3

    iput p3, p0, Lsb0;->a:I

    iput-object p1, p0, Lsb0;->b:Lrb0;

    iput-object p2, p0, Lsb0;->c:Lo40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    const-string v0, "\u06e8\u06e2\u06df"

    invoke-static {v0}, Lcom/google/android/material/carousel/ۥۣۤۡ;->ۣۢۧۢ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    return-void

    :sswitch_1
    const-string v0, "zUt8TjBrvocssT7oFfWogb"

    invoke-static {v0}, Landroid/app/۟ۡۧۦۡ;->ۣۡۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget v0, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۤۢۨ۟:I

    sget v2, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    div-int/lit16 v2, v2, -0xdec

    add-int/2addr v0, v2

    if-gtz v0, :cond_0

    invoke-static {}, Lcom/github/megatronking/stringfog/ۨۧۥۢ;->ۧۡۥ۟()I

    const-string v0, "\u06e4\u06df\u06e3"

    :goto_1
    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    const-string v0, "\u06e4\u06df\u06e3"

    goto :goto_1

    :sswitch_2
    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    if-gtz v0, :cond_1

    const-string v0, "\u06e3\u06e3\u06e6"

    :goto_2
    invoke-static {v0}, Lcom/google/android/material/sidesheet/۟ۥۨۧۦ;->۟ۤ۠ۡ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/github/megatronking/stringfog/annotation/۟۟۠۟ۥ;->ۣ۟۟ۡۢ:I

    sget v2, Lۤۤۥۤ;->ۣ۟۠ۧۢ:I

    div-int/2addr v0, v2

    const v2, 0x1ac925

    xor-int/2addr v0, v2

    goto :goto_0

    :sswitch_3
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    sget v2, Lcom/google/android/material/carousel/۟ۦۢ۠۠;->ۣۣ۟ۨۡ:I

    xor-int/2addr v0, v2

    const v2, -0x1aa5cc

    xor-int/2addr v0, v2

    goto :goto_0

    :cond_2
    :sswitch_4
    invoke-static {}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->ۧۡۥ۟()I

    move-result v0

    if-gtz v0, :cond_3

    const-string v0, "\u06e2\u06e4\u06e7"

    invoke-static {v0}, Lcom/github/megatronking/stringfog/annotation/۟ۤۢ۟۟;->ۣۧۢ۠(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "\u06df\u06e5\u06e2"

    goto :goto_2

    :sswitch_5
    invoke-static {}, Lcom/google/android/material/floatingactionbutton/ۤۢۥۢ;->ۡۥۥۦ()I

    move-result v0

    if-ltz v0, :cond_2

    const-string v0, "\u06e5\u06e7\u06e7"

    goto :goto_2

    :sswitch_data_0
    .sparse-switch
        0x1aa7bc -> :sswitch_0
        0x1ab9c8 -> :sswitch_3
        0x1abd87 -> :sswitch_2
        0x1abe85 -> :sswitch_1
        0x1ac1e6 -> :sswitch_4
        0x1ac925 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final a()V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06e2\u06e7\u06e4"

    invoke-static {v0}, Landroid/window/ۦۣۦۥ;->ۨ۟ۢۤ(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lsb0;->b:Lrb0;

    iget-object v0, v0, Lrb0;->a:Landroid/view/View;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/core/app/ۡۤۡ۠;->ۡ۟ۦ:I

    sget v1, Lcom/ljx/wechatmod/ui/ۨ۟ۧۢ;->ۤۡۡۡ:I

    add-int/lit16 v1, v1, -0xf93

    rem-int/2addr v0, v1

    if-ltz v0, :cond_2

    invoke-static {}, Lcom/google/android/material/transformation/ۣۣۡۡ;->۟ۧ۟ۥۧ()I

    const-string v0, "\u06e6\u06df\u06e5"

    invoke-static {v0}, Lcom/google/android/material/timepicker/۟۟ۨۢۤ;->۠ۧ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lsb0;->c:Lo40;

    invoke-virtual {v0, p0}, Lo40;->e(Luh;)V

    sget v0, Landroid/window/ۣۧ۟۠;->۟ۡۥۡ:I

    if-gtz v0, :cond_0

    const/16 v0, 0x2b

    sput v0, Landroidx/core/widget/۟ۡۦۢۥ;->۟۠ۨۤ۠:I

    const-string v0, "\u06e6\u06e0\u06e0"

    invoke-static {v0}, Landroidx/appcompat/app/۟۟ۥۨۤ;->ۤۤۡۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Lcom/google/android/material/bottomappbar/ۣۥ۠ۦ;->ۣ۟ۢۡۤ:I

    sget v1, Landroidx/core/content/ۣ۟ۤۧۨ;->ۨۨ۠۠:I

    sub-int/2addr v0, v1

    const v1, 0x1aae4b

    xor-int/2addr v0, v1

    goto :goto_0

    :sswitch_2
    iget v0, p0, Lsb0;->a:I

    packed-switch v0, :pswitch_data_0

    :sswitch_3
    sget v0, Lcom/ljx/wechatmod/hook/۟ۥ۠۟ۥ;->ۣ۠ۤۥ:I

    sget v1, Lcom/google/android/material/timepicker/ۦۣۣۧ;->ۣۨۧۨ:I

    add-int/lit16 v1, v1, -0x4bf

    rem-int/2addr v0, v1

    if-ltz v0, :cond_1

    invoke-static {}, Lۤۤۥۤ;->۟ۤ۠()I

    const-string v0, "\u06e1\u06e4\u06e2"

    :goto_1
    invoke-static {v0}, Lkotlinx/coroutines/ۤۢۢۥ;->۟ۦۡۧۢ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :cond_1
    const-string v0, "\u06e3\u06e1\u06e8"

    goto :goto_1

    :sswitch_4
    const-string v0, "\u06e2\u06e7\u06e4"

    invoke-static {v0}, Lcom/google/android/material/appbar/۟ۥ۠ۧۦ;->ۢۢۧۤ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_5
    iget-object v0, p0, Lsb0;->b:Lrb0;

    iget-object v0, v0, Lrb0;->a:Landroid/view/View;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    sget v0, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    sget v1, Lcom/google/android/material/datepicker/ۨۧۤ;->ۥۤۨ۠:I

    xor-int/2addr v0, v1

    const v1, 0x1ac009

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    const-string v0, "\u06e1\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣ۟ۤۤۢ;->۟ۤۤ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Lsb0;->c:Lo40;

    invoke-virtual {v0, p0}, Lo40;->e(Luh;)V

    sget v0, Lcom/ljx/wechatmod/auth/۟ۨۨ۠;->۟ۥۢۥ۟:I

    if-ltz v0, :cond_3

    const/16 v0, 0x14

    sput v0, Landroid/window/ۦۣۦۥ;->ۥۣۨۡ:I

    const-string v0, "\u06e1\u06e7\u06e3"

    invoke-static {v0}, Lcom/google/android/material/transformation/ۣۣۡۡ;->ۣۣۨۦ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_3
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v1, Landroidx/legacy/content/۟ۦۥ۟ۢ;->۟ۡۥۦ:I

    xor-int/2addr v0, v1

    const v1, 0x1ac5b7

    add-int/2addr v0, v1

    goto/16 :goto_0

    :pswitch_0
    :sswitch_7
    invoke-static {}, Lۤۨۤۨ;->۟ۢۦۣۢ()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {}, Landroid/support/v4/graphics/drawable/ۧۥۦۤ;->ۡۤۥۧ()I

    const-string v0, "\u06e2\u06e2\u06e5"

    invoke-static {v0}, Landroidx/core/graphics/drawable/۟۠ۢۨۡ;->۟۠ۧۢۧ(Ljava/lang/Object;)I

    move-result v0

    goto/16 :goto_0

    :cond_4
    sget v0, Lcom/google/android/material/snackbar/ۣ۟ۧۦ۠;->ۣۡۡ:I

    sget v1, Landroidx/startup/ۣۣۡ۟;->ۡۦۣۢ:I

    sub-int/2addr v0, v1

    const v1, 0x1aace6

    add-int/2addr v0, v1

    goto/16 :goto_0

    :sswitch_8
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa800 -> :sswitch_0
        0x1aaee7 -> :sswitch_8
        0x1aaf7d -> :sswitch_6
        0x1ab33f -> :sswitch_2
        0x1ab64a -> :sswitch_5
        0x1ac14c -> :sswitch_4
        0x1ac166 -> :sswitch_1
        0x1ac508 -> :sswitch_8
        0x1ac620 -> :sswitch_3
        0x1ac8ef -> :sswitch_7
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
