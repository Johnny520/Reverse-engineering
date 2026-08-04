.class Lorg/simpleframework/xml/stream/InputAttribute;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lorg/simpleframework/xml/stream/InputNode;


# instance fields
.field private name:Ljava/lang/String;

.field private parent:Lorg/simpleframework/xml/stream/InputNode;

.field private prefix:Ljava/lang/String;

.field private reference:Ljava/lang/String;

.field private source:Ljava/lang/Object;

.field private value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/simpleframework/xml/stream/InputNode;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lorg/simpleframework/xml/stream/InputAttribute;->parent:Lorg/simpleframework/xml/stream/InputNode;

    .line 39
    iput-object p3, p0, Lorg/simpleframework/xml/stream/InputAttribute;->value:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Lorg/simpleframework/xml/stream/InputAttribute;->name:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lorg/simpleframework/xml/stream/InputNode;Lorg/simpleframework/xml/stream/Attribute;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Lorg/simpleframework/xml/stream/Attribute;->getReference()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->reference:Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {p2}, Lorg/simpleframework/xml/stream/Attribute;->getPrefix()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->prefix:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p2}, Lorg/simpleframework/xml/stream/Attribute;->getSource()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->source:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-interface {p2}, Lorg/simpleframework/xml/stream/Attribute;->getValue()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->value:Ljava/lang/String;

    .line 27
    .line 28
    invoke-interface {p2}, Lorg/simpleframework/xml/stream/Attribute;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lorg/simpleframework/xml/stream/InputAttribute;->name:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p1, p0, Lorg/simpleframework/xml/stream/InputAttribute;->parent:Lorg/simpleframework/xml/stream/InputNode;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public getAttribute(Ljava/lang/String;)Lorg/simpleframework/xml/stream/InputNode;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getAttributes()Lorg/simpleframework/xml/stream/NodeMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/simpleframework/xml/stream/NodeMap<",
            "Lorg/simpleframework/xml/stream/InputNode;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/simpleframework/xml/stream/InputNodeMap;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/simpleframework/xml/stream/InputNodeMap;-><init>(Lorg/simpleframework/xml/stream/InputNode;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNext()Lorg/simpleframework/xml/stream/InputNode;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getNext(Ljava/lang/String;)Lorg/simpleframework/xml/stream/InputNode;
    .locals 0

    .line 3
    const/4 p0, 0x0

    return-object p0
.end method

.method public getParent()Lorg/simpleframework/xml/stream/InputNode;
    .locals 0

    .line 6
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->parent:Lorg/simpleframework/xml/stream/InputNode;

    return-object p0
.end method

.method public bridge synthetic getParent()Lorg/simpleframework/xml/stream/Node;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/simpleframework/xml/stream/InputAttribute;->getParent()Lorg/simpleframework/xml/stream/InputNode;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getPosition()Lorg/simpleframework/xml/stream/Position;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->parent:Lorg/simpleframework/xml/stream/InputNode;

    .line 2
    .line 3
    invoke-interface {p0}, Lorg/simpleframework/xml/stream/InputNode;->getPosition()Lorg/simpleframework/xml/stream/Position;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getPrefix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->prefix:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReference()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->reference:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSource()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->source:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public isElement()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public isRoot()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public skip()V
    .locals 0

    .line 1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->name:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/simpleframework/xml/stream/InputAttribute;->value:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v2, "attribute "

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, "=\'"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "\'"

    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
