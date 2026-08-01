.class public Lcom/typesafe/config/ConfigException$ValidationProblem;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/typesafe/config/ConfigException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ValidationProblem"
.end annotation


# instance fields
.field private final transient origin:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

.field private final path:Ljava/lang/String;

.field private final problem:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->path:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->origin:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->problem:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/io/ObjectInputStream;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-class v0, Lcom/typesafe/config/ConfigException$ValidationProblem;

    .line 9
    .line 10
    invoke-static {p0, v0, p1}, Lcom/typesafe/config/ConfigException;->access$000(Ljava/lang/Object;Ljava/lang/Class;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->origin:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/io/ObjectOutputStream;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public origin()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->origin:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public path()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public problem()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->problem:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ValidationProblem("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->path:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ","

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->origin:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lcom/typesafe/config/ConfigException$ValidationProblem;->problem:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
