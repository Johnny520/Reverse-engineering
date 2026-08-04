.class public interface abstract Lorg/simpleframework/xml/stream/InputNode;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lorg/simpleframework/xml/stream/Node;


# virtual methods
.method public abstract getAttribute(Ljava/lang/String;)Lorg/simpleframework/xml/stream/InputNode;
.end method

.method public abstract getAttributes()Lorg/simpleframework/xml/stream/NodeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/simpleframework/xml/stream/NodeMap<",
            "Lorg/simpleframework/xml/stream/InputNode;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getNext()Lorg/simpleframework/xml/stream/InputNode;
.end method

.method public abstract getNext(Ljava/lang/String;)Lorg/simpleframework/xml/stream/InputNode;
.end method

.method public abstract getParent()Lorg/simpleframework/xml/stream/InputNode;
.end method

.method public abstract getPosition()Lorg/simpleframework/xml/stream/Position;
.end method

.method public abstract getPrefix()Ljava/lang/String;
.end method

.method public abstract getReference()Ljava/lang/String;
.end method

.method public abstract getSource()Ljava/lang/Object;
.end method

.method public abstract isElement()Z
.end method

.method public abstract isEmpty()Z
.end method

.method public abstract isRoot()Z
.end method

.method public abstract skip()V
.end method
