.class public final Lretrofit2/飘花落叶言子楪苏兰世哲;
.super Ljava/util/concurrent/CompletableFuture;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lretrofit2/飘花落叶言子世楪哲苏兰;


# direct methods
.method public constructor <init>(Lretrofit2/飘花落叶言子世楪哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/CompletableFuture;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lretrofit2/飘花落叶言子世楪哲苏兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lretrofit2/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lretrofit2/飘花落叶言子世楪哲苏兰;

    .line 4
    .line 5
    invoke-virtual {v0}, Lretrofit2/飘花落叶言子世楪哲苏兰;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1}, Ljava/util/concurrent/CompletableFuture;->cancel(Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method
