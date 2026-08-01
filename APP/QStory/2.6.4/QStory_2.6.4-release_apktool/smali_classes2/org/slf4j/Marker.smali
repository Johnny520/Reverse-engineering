.class public interface abstract Lorg/slf4j/Marker;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ANY_MARKER:Ljava/lang/String; = "*"

.field public static final ANY_NON_NULL_MARKER:Ljava/lang/String; = "+"


# virtual methods
.method public abstract add(Lorg/slf4j/Marker;)V
.end method

.method public abstract contains(Ljava/lang/String;)Z
.end method

.method public abstract contains(Lorg/slf4j/Marker;)Z
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract hasChildren()Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract hasReferences()Z
.end method

.method public abstract hashCode()I
.end method

.method public abstract iterator()Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lorg/slf4j/Marker;",
            ">;"
        }
    .end annotation
.end method

.method public abstract remove(Lorg/slf4j/Marker;)Z
.end method
