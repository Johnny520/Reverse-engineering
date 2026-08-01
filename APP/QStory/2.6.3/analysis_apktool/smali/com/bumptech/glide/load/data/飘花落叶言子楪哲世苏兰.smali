.class public abstract Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲兰苏;


# instance fields
.field public 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰世苏:Landroid/net/Uri;

.field public final 飘花落叶言子楪哲兰苏世:Landroid/content/ContentResolver;

.field public final 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Landroid/content/ContentResolver;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroid/net/Uri;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract 飘花落叶言子楪世兰哲苏(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Landroid/net/Uri;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Landroid/content/ContentResolver;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p0

    .line 16
    const/4 p1, 0x3

    .line 17
    const-string v0, "LocalUriFetcher"

    .line 18
    .line 19
    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    const-string p1, "Failed to open Uri"

    .line 26
    .line 27
    invoke-static {v0, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Exception;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()Lcom/bumptech/glide/load/DataSource;
    .locals 0

    .line 1
    sget-object p0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract 飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
.end method

.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/bumptech/glide/load/data/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    return-void
.end method
