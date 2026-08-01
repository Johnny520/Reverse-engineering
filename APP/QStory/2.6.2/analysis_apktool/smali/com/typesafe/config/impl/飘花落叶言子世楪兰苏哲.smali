.class public final Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    return-object p0
.end method

.method public final remove()V
    .locals 0

    .line 1
    const-string p0, "iterator().remove"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigList;->access$000(Ljava/lang/String;)Ljava/lang/UnsupportedOperationException;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    throw p0
.end method
