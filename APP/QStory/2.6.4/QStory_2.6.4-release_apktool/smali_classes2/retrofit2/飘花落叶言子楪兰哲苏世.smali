.class public final Lretrofit2/飘花落叶言子楪兰哲苏世;
.super L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;


# direct methods
.method public constructor <init>(Lretrofit2/飘花落叶言子世楪苏哲兰;L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lretrofit2/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-direct {p0, p2}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    const-wide/16 v0, 0x2000

    .line 7
    .line 8
    invoke-interface {p2, p1, v0, v1}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;->飘花落叶言子哲苏兰楪世(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰苏哲;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-wide p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object p0, p0, Lretrofit2/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lretrofit2/飘花落叶言子世楪苏哲兰;

    .line 15
    .line 16
    iput-object p1, p0, Lretrofit2/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/io/IOException;

    .line 17
    .line 18
    throw p1
.end method
