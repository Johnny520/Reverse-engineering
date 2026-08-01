.class public final L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪哲兰世苏:Landroid/content/res/Resources;

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪哲苏兰世:Landroid/content/res/Resources$Theme;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/content/res/Resources$Theme;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroid/content/res/Resources;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    iput p4, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget-object v0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/content/res/Resources$Theme;

    .line 4
    .line 5
    iget-object v1, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroid/content/res/Resources;

    .line 6
    .line 7
    iget v2, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    iget v3, p1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    iget-object p1, p1, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {p1, p1, v2, v0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :pswitch_1
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    iput-object p1, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception p0

    .line 37
    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Exception;)V

    .line 38
    .line 39
    .line 40
    return-void

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lcom/bumptech/glide/load/DataSource;
    .locals 0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    iget p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/io/InputStream;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_0
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    check-cast v0, Landroid/content/res/AssetFileDescriptor;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    :cond_0
    :goto_0
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪世苏子兰哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言子哲苏兰楪世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-class p0, Ljava/io/InputStream;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :pswitch_0
    const-class p0, Landroid/graphics/drawable/Drawable;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_1
    const-class p0, Landroid/content/res/AssetFileDescriptor;

    .line 15
    .line 16
    :goto_0
    return-object p0

    .line 17
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
