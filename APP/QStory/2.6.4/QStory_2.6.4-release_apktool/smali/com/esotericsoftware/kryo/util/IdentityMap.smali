.class public Lcom/esotericsoftware/kryo/util/IdentityMap;
.super Lcom/esotericsoftware/kryo/util/ObjectMap;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/util/ObjectMap<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(I)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IdentityMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/IdentityMap<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>(Lcom/esotericsoftware/kryo/util/ObjectMap;)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:TK;>(TT;)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->place(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    if-ne v1, p1, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object p0, p0, v0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 23
    .line 24
    and-int/2addr v0, v1

    .line 25
    goto :goto_0
.end method

.method public get(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 26
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->place(Ljava/lang/Object;)I

    move-result v0

    .line 27
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    aget-object v1, v1, v0

    if-nez v1, :cond_0

    return-object p2

    :cond_0
    if-ne v1, p1, :cond_1

    .line 28
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    aget-object p0, p0, v0

    return-object p0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 29
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    and-int/2addr v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->valueTable:[Ljava/lang/Object;

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v2, :cond_2

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    if-eqz v4, :cond_1

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/2addr v4, v0

    .line 20
    aget-object v0, p0, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/2addr v0, v4

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v0, v4

    .line 31
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return v0
.end method

.method public locateKey(Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->place(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    :goto_0
    aget-object v2, v0, v1

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    neg-int p0, v1

    .line 16
    return p0

    .line 17
    :cond_0
    if-ne v2, p1, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 23
    .line 24
    and-int/2addr v1, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const-string p0, "key cannot be null."

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public place(Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectMap;->mask:I

    .line 6
    .line 7
    and-int/2addr p0, p1

    .line 8
    return p0
.end method
