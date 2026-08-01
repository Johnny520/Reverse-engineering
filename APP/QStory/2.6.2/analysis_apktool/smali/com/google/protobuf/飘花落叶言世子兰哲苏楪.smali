.class public final Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;
.super Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;
.implements Ljava/util/RandomAccess;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰苏世:Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;-><init>(Z)V

    .line 23
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x1

    .line 20
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;-><init>(Z)V

    .line 21
    iput-object p1, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 16
    .line 17
    return-void
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 18
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p2, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;

    .line 9
    .line 10
    invoke-interface {p2}, Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget p2, p0, Ljava/util/AbstractList;->modCount:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    iput p2, p0, Ljava/util/AbstractList;->modCount:I

    .line 25
    .line 26
    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 28
    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->addAll(ILjava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public final clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 14
    .line 15
    return-void
.end method

.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪世兰苏哲(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    .line 15
    .line 16
    instance-of p0, p1, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    check-cast p1, Ljava/lang/String;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    instance-of p0, p1, Lcom/google/protobuf/ByteString;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    check-cast p1, Lcom/google/protobuf/ByteString;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    check-cast p1, [B

    .line 35
    .line 36
    new-instance p0, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v0, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    invoke-direct {p0, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public final bridge synthetic set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪苏世兰哲(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final 飘花落叶言子世哲兰楪苏(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()Lcom/google/protobuf/飘花落叶言世楪子苏哲兰;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/飘花落叶言苏楪子哲世兰;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/google/protobuf/飘花落叶言苏楪子哲世兰;-><init>(Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;)V

    .line 8
    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(I)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    instance-of v1, v0, Lcom/google/protobuf/ByteString;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isValidUtf8()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object v1

    .line 34
    :cond_2
    check-cast v0, [B

    .line 35
    .line 36
    new-instance v1, Ljava/lang/String;

    .line 37
    .line 38
    sget-object v2, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Lcom/google/protobuf/飘花落叶言苏楪世哲兰子;->飘花落叶言子楪世苏哲兰:Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    array-length v4, v0

    .line 47
    invoke-virtual {v2, v3, v0, v4}, Lcom/google/protobuf/飘花落叶言世楪哲兰子苏;->飘花落叶言子楪苏兰世哲(I[BI)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_3
    return-object v1
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(Lcom/google/protobuf/ByteString;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    .line 14
    .line 15
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of p1, p0, Lcom/google/protobuf/ByteString;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    check-cast p0, Lcom/google/protobuf/ByteString;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_1
    check-cast p0, [B

    .line 29
    .line 30
    new-instance p1, Ljava/lang/String;

    .line 31
    .line 32
    sget-object p2, Lcom/google/protobuf/飘花落叶言世子苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 33
    .line 34
    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method

.method public final 飘花落叶言子楪苏世哲兰(I)Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lcom/google/protobuf/ByteString;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v1, v0

    .line 28
    check-cast v1, [B

    .line 29
    .line 30
    invoke-static {v1}, Lcom/google/protobuf/ByteString;->copyFrom([B)Lcom/google/protobuf/ByteString;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    if-eq v1, v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p0, p1, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_2
    return-object v1
.end method

.method public final 飘花落叶言子楪苏兰哲世(I)Lcom/google/protobuf/飘花落叶言世子苏哲兰楪;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;->飘花落叶言子楪哲兰世苏:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p1, v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    new-instance p0, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lcom/google/protobuf/飘花落叶言世子兰哲苏楪;-><init>(Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method
