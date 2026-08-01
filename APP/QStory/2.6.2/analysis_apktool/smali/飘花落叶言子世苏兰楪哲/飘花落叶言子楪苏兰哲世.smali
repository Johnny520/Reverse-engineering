.class public abstract L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Iterator;
.implements L飘花落叶言世子哲苏楪兰/飘花落叶言子楪世苏哲兰;


# instance fields
.field public 飘花落叶言子楪哲兰世苏:I

.field public 飘花落叶言子楪哲兰苏世:I

.field public 飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iget-object v0, v0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏:[Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final 飘花落叶言子楪世苏哲兰([Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 2
    .line 3
    iput p2, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    iput p3, p0, L飘花落叶言子世苏兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:I

    .line 6
    .line 7
    return-void
.end method
