.class public final L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final 飘花落叶言子楪世兰哲苏()V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪世哲苏兰()V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪苏世兰哲()V
    .locals 0

    .line 1
    return-void
.end method

.method private final 飘花落叶言子楪苏世哲兰()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    iget p1, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    :try_start_0
    check-cast p0, Ljava/io/File;

    .line 13
    .line 14
    invoke-static {p0}, L飘花落叶言楪世哲兰苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/io/File;)Ljava/nio/MappedByteBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const/4 p1, 0x3

    .line 24
    const-string v0, "ByteBufferFileLoader"

    .line 25
    .line 26
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const-string p1, "Failed to obtain ByteBuffer for file"

    .line 33
    .line 34
    invoke-static {v0, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lcom/bumptech/glide/load/DataSource;
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, L飘花落叶言楪世子哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    const-class p0, Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
