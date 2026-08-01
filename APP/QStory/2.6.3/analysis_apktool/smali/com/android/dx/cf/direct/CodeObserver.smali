.class public Lcom/android/dx/cf/direct/CodeObserver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/cf/code/BytecodeArray$Visitor;


# instance fields
.field private final bytes:Lcom/android/dx/util/ByteArray;

.field private final observer:Lcom/android/dx/cf/iface/ParseObserver;


# direct methods
.method public constructor <init>(Lcom/android/dx/util/ByteArray;Lcom/android/dx/cf/iface/ParseObserver;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "observer == null"

    .line 15
    .line 16
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :cond_1
    const-string p0, "bytes == null"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method private header(I)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lcom/android/dx/cf/code/ByteOps;->opName(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/16 v2, 0xc4

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 16
    .line 17
    add-int/lit8 v0, p1, 0x1

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const-string v0, " "

    .line 24
    .line 25
    invoke-static {v1, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0}, Lcom/android/dx/cf/code/ByteOps;->opName(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p1, ": "

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method private visitLiteralDouble(IIIJ)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    if-eq p3, p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, " #"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4, p5}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, ""

    .line 24
    .line 25
    :goto_0
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " // "

    .line 45
    .line 46
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {p4, p5}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {v0, v1, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private visitLiteralFloat(IIII)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    if-eq p3, p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v0, " #"

    .line 7
    .line 8
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, ""

    .line 24
    .line 25
    :goto_0
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " // "

    .line 45
    .line 46
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {v0, v1, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method private visitLiteralInt(IIII)V
    .locals 3

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p3, p1, :cond_0

    .line 3
    .line 4
    const-string v0, " // "

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v0, " "

    .line 8
    .line 9
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 10
    .line 11
    invoke-virtual {v1, p2}, Lcom/android/dx/util/ByteArray;->getUnsignedByte(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const-string v2, "#"

    .line 16
    .line 17
    if-eq p3, p1, :cond_3

    .line 18
    .line 19
    const/16 p1, 0x10

    .line 20
    .line 21
    if-ne v1, p1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/16 p1, 0x11

    .line 25
    .line 26
    if-ne v1, p1, :cond_2

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p4}, Lcom/android/dx/util/Hex;->s2(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p4}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p4}, Lcom/android/dx/util/Hex;->s1(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_2
    iget-object p4, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 81
    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-interface {p4, v1, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method private visitLiteralLong(IIIJ)V
    .locals 2

    .line 1
    const/4 p1, 0x1

    .line 2
    if-ne p3, p1, :cond_0

    .line 3
    .line 4
    const-string v0, " // "

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v0, " #"

    .line 8
    .line 9
    :goto_0
    if-ne p3, p1, :cond_1

    .line 10
    .line 11
    long-to-int p1, p4

    .line 12
    invoke-static {p1}, Lcom/android/dx/util/Hex;->s1(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-static {p4, p5}, Lcom/android/dx/util/Hex;->s8(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_1
    iget-object p4, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 22
    .line 23
    iget-object p5, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p4, p5, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public getPreviousOffset()I
    .locals 0

    .line 1
    const/4 p0, -0x1

    .line 2
    return p0
.end method

.method public setPreviousOffset(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public visitBranch(IIII)V
    .locals 2

    .line 1
    const/4 p1, 0x3

    .line 2
    if-gt p3, p1, :cond_0

    .line 3
    .line 4
    invoke-static {p4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p4}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    iget-object p4, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, " "

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-interface {p4, v0, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public visitConstant(IIILcom/android/dx/rop/cst/Constant;I)V
    .locals 6

    .line 1
    instance-of v0, p4, Lcom/android/dx/rop/cst/CstKnownNull;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/CodeObserver;->visitNoArgs(IIILcom/android/dx/rop/type/Type;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    instance-of v0, p4, Lcom/android/dx/rop/cst/CstInteger;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/android/dx/cf/direct/CodeObserver;->visitLiteralInt(IIII)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    instance-of v0, p4, Lcom/android/dx/rop/cst/CstLong;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    check-cast p4, Lcom/android/dx/rop/cst/CstLong;

    .line 23
    .line 24
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstLong;->getValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    move-object v0, p0

    .line 29
    move v1, p1

    .line 30
    move v2, p2

    .line 31
    move v3, p3

    .line 32
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/cf/direct/CodeObserver;->visitLiteralLong(IIIJ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    instance-of v0, p4, Lcom/android/dx/rop/cst/CstFloat;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p4, Lcom/android/dx/rop/cst/CstFloat;

    .line 41
    .line 42
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstLiteral32;->getIntBits()I

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/CodeObserver;->visitLiteralFloat(IIII)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    instance-of v0, p4, Lcom/android/dx/rop/cst/CstDouble;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    check-cast p4, Lcom/android/dx/rop/cst/CstDouble;

    .line 55
    .line 56
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstLiteral64;->getLongBits()J

    .line 57
    .line 58
    .line 59
    move-result-wide p4

    .line 60
    invoke-direct/range {p0 .. p5}, Lcom/android/dx/cf/direct/CodeObserver;->visitLiteralDouble(IIIJ)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    if-eqz p5, :cond_6

    .line 65
    .line 66
    const/16 v0, 0xc5

    .line 67
    .line 68
    const-string v1, ", "

    .line 69
    .line 70
    if-ne p1, v0, :cond_5

    .line 71
    .line 72
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {p5}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p5

    .line 81
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    goto :goto_0

    .line 89
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1, p5}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    goto :goto_0

    .line 99
    :cond_6
    const-string p1, ""

    .line 100
    .line 101
    :goto_0
    iget-object p5, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 104
    .line 105
    new-instance v1, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p0, " "

    .line 118
    .line 119
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-interface {p5, v0, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public visitInvalid(III)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1, v0, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public visitLocal(IIIILcom/android/dx/rop/type/Type;I)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    if-gt p3, v0, :cond_0

    .line 3
    .line 4
    invoke-static {p4}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p4}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    :goto_0
    const/4 v1, 0x1

    .line 14
    if-ne p3, v1, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_1
    const/16 v2, 0x84

    .line 19
    .line 20
    const-string v3, ""

    .line 21
    .line 22
    if-ne p1, v2, :cond_3

    .line 23
    .line 24
    new-instance p1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v2, ", #"

    .line 27
    .line 28
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    if-gt p3, v0, :cond_2

    .line 32
    .line 33
    invoke-static {p6}, Lcom/android/dx/util/Hex;->s1(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p6

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-static {p6}, Lcom/android/dx/util/Hex;->s2(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p6

    .line 42
    :goto_2
    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    move-object p1, v3

    .line 51
    :goto_3
    invoke-virtual {p5}, Lcom/android/dx/rop/type/Type;->isCategory2()Z

    .line 52
    .line 53
    .line 54
    move-result p5

    .line 55
    if-eqz p5, :cond_5

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    const-string p5, ","

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    const-string p5, " //"

    .line 63
    .line 64
    :goto_4
    const-string p6, " category-2"

    .line 65
    .line 66
    invoke-virtual {p5, p6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    :cond_5
    iget-object p5, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 71
    .line 72
    iget-object p6, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 73
    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    if-eqz v1, :cond_6

    .line 87
    .line 88
    const-string p0, " // "

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    const-string p0, " "

    .line 92
    .line 93
    :goto_5
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p5, p6, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public visitNewarray(IILcom/android/dx/rop/cst/CstType;Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lcom/android/dx/rop/cst/CstType;",
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/cst/Constant;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p4, 0x1

    .line 2
    if-ne p2, p4, :cond_0

    .line 3
    .line 4
    const-string p4, " // "

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string p4, " "

    .line 8
    .line 9
    :goto_0
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->getComponentType()Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3}, Lcom/android/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    iget-object v0, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {v0, v1, p1, p2, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public visitNoArgs(IIILcom/android/dx/rop/type/Type;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 2
    .line 3
    iget-object p4, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1, p4, p2, p3, p0}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public visitSwitch(IIILcom/android/dx/cf/code/SwitchList;I)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Lcom/android/dx/cf/code/SwitchList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    mul-int/lit8 v1, p1, 0x14

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x64

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p2}, Lcom/android/dx/cf/direct/CodeObserver;->header(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    if-eqz p5, :cond_0

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, " // padding: "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p5}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p5

    .line 34
    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_0
    const/16 p5, 0xa

    .line 45
    .line 46
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    :goto_0
    if-ge v1, p1, :cond_1

    .line 51
    .line 52
    const-string v2, "  "

    .line 53
    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p4, v1}, Lcom/android/dx/cf/code/SwitchList;->getValue(I)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-static {v2}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, ": "

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p4, v1}, Lcom/android/dx/cf/code/SwitchList;->getTarget(I)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string p1, "  default: "

    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4}, Lcom/android/dx/cf/code/SwitchList;->getDefaultTarget()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lcom/android/dx/cf/direct/CodeObserver;->observer:Lcom/android/dx/cf/iface/ParseObserver;

    .line 107
    .line 108
    iget-object p0, p0, Lcom/android/dx/cf/direct/CodeObserver;->bytes:Lcom/android/dx/util/ByteArray;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    invoke-interface {p1, p0, p2, p3, p4}, Lcom/android/dx/cf/iface/ParseObserver;->parsed(Lcom/android/dx/util/ByteArray;IILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
