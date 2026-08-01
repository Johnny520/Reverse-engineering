.class public final Lkotlinx/io/飘花落叶言子楪苏兰哲世;
.super Ljava/io/InputStream;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iput-object p2, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 1
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-interface {v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-wide v0, p0, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 22
    .line 23
    const-wide/32 v2, 0x7fffffff

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    long-to-int p0, v0

    .line 31
    return p0

    .line 32
    :cond_0
    const-string p0, "Underlying source is closed."

    .line 33
    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final read()I
    .locals 1

    .line 40
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    invoke-interface {v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 41
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 42
    :cond_0
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->readByte()B

    move-result p0

    and-int/lit16 p0, p0, 0xff

    return p0

    .line 43
    :cond_1
    const-string p0, "Underlying source is closed."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method public final read([BII)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    invoke-interface {v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    int-to-long v1, v0

    .line 20
    int-to-long v3, p2

    .line 21
    int-to-long v5, p3

    .line 22
    invoke-static/range {v1 .. v6}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(JJJ)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    add-int/2addr p3, p2

    .line 28
    invoke-interface {p0, p2, p1, p3}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子苏楪哲世兰(I[BI)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_0
    const-string p0, "Underlying source is closed."

    .line 34
    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlinx/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, ".asInputStream()"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
