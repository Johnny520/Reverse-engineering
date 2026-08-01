.class public Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;
.super Lcom/esotericsoftware/kryo/util/ObjectIntMap;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/esotericsoftware/kryo/util/ObjectIntMap<",
        "TK;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(I)V

    return-void
.end method

.method public constructor <init>(IF)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(IF)V

    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap<",
            "TK;>;)V"
        }
    .end annotation

    .line 7
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/ObjectIntMap;-><init>(Lcom/esotericsoftware/kryo/util/ObjectIntMap;)V

    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;I)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;I)I"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;->place(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return p2

    .line 12
    :cond_0
    if-ne v1, p1, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 15
    .line 16
    aget p0, p0, v0

    .line 17
    .line 18
    return p0

    .line 19
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    iget v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 22
    .line 23
    and-int/2addr v0, v1

    .line 24
    goto :goto_0
.end method

.method public hashCode()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->size:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->valueTable:[I

    .line 6
    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    :goto_0
    if-ge v3, v2, :cond_1

    .line 10
    .line 11
    aget-object v4, v1, v3

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    aget v5, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, v5

    .line 22
    add-int/2addr v4, v0

    .line 23
    move v0, v4

    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
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
    iget-object v0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->keyTable:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/util/IdentityObjectIntMap;->place(Ljava/lang/Object;)I

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
    iget v2, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

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
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

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
    iget p0, p0, Lcom/esotericsoftware/kryo/util/ObjectIntMap;->mask:I

    .line 6
    .line 7
    and-int/2addr p0, p1

    .line 8
    return p0
.end method
