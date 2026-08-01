.class public final Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    iput p2, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p2, p1, v0}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/ClassLoader;I)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x3

    .line 32
    invoke-direct {p2, p1, v0}, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/ClassLoader;I)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 2

    .line 1
    iget v0, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-super {p0}, Landroid/content/ContextWrapper;->getClassLoader()Ljava/lang/ClassLoader;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    return-object v1

    .line 18
    :pswitch_0
    check-cast v1, Lcom/kongzue/dialogx/util/飘花落叶言子楪世兰哲苏;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    invoke-super {p0}, Landroid/content/ContextWrapper;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_1
    return-object v1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
