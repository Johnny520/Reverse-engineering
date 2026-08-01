.class public final Lretrofit2/飘花落叶言子世楪苏兰哲;
.super L飘花落叶言世兰楪哲子苏/飘花落叶言子世哲楪兰苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:J

.field public final 飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    iput-wide p2, p0, Lretrofit2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lretrofit2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lretrofit2/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()L飘花落叶言苏子楪哲兰世/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot read raw response body of a converted body."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
