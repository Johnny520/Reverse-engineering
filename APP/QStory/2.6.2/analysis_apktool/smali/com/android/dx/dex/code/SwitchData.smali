.class public final Lcom/android/dx/dex/code/SwitchData;
.super Lcom/android/dx/dex/code/VariableSizeInsn;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final cases:Lcom/android/dx/util/IntList;

.field private final packed:Z

.field private final targets:[Lcom/android/dx/dex/code/CodeAddress;

.field private final user:Lcom/android/dx/dex/code/CodeAddress;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Lcom/android/dx/util/IntList;[Lcom/android/dx/dex/code/CodeAddress;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/code/VariableSizeInsn;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    if-eqz p2, :cond_4

    .line 8
    .line 9
    if-eqz p3, :cond_3

    .line 10
    .line 11
    if-eqz p4, :cond_2

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/android/dx/util/IntList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    array-length v1, p4

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    const v1, 0xffff

    .line 21
    .line 22
    .line 23
    if-gt v0, v1, :cond_0

    .line 24
    .line 25
    iput-object p2, p0, Lcom/android/dx/dex/code/SwitchData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    iput-object p4, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 30
    .line 31
    invoke-static {p3}, Lcom/android/dx/dex/code/SwitchData;->shouldPack(Lcom/android/dx/util/IntList;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput-boolean p1, p0, Lcom/android/dx/dex/code/SwitchData;->packed:Z

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const-string p0, "too many cases"

    .line 39
    .line 40
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    const-string p0, "cases / targets mismatch"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    const-string p0, "targets == null"

    .line 51
    .line 52
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_3
    const-string p0, "cases == null"

    .line 57
    .line 58
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_4
    const-string p0, "user == null"

    .line 63
    .line 64
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1
.end method

.method private static packedCodeSize(Lcom/android/dx/util/IntList;)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-long v1, v1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    int-to-long v3, p0

    .line 18
    sub-long/2addr v3, v1

    .line 19
    const-wide/16 v0, 0x1

    .line 20
    .line 21
    add-long/2addr v3, v0

    .line 22
    const-wide/16 v0, 0x2

    .line 23
    .line 24
    mul-long/2addr v3, v0

    .line 25
    const-wide/16 v0, 0x4

    .line 26
    .line 27
    add-long/2addr v3, v0

    .line 28
    const-wide/32 v0, 0x7fffffff

    .line 29
    .line 30
    .line 31
    cmp-long p0, v3, v0

    .line 32
    .line 33
    if-gtz p0, :cond_0

    .line 34
    .line 35
    return-wide v3

    .line 36
    :cond_0
    const-wide/16 v0, -0x1

    .line 37
    .line 38
    return-wide v0
.end method

.method private static shouldPack(Lcom/android/dx/util/IntList;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/android/dx/dex/code/SwitchData;->packedCodeSize(Lcom/android/dx/util/IntList;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {p0}, Lcom/android/dx/dex/code/SwitchData;->sparseCodeSize(Lcom/android/dx/util/IntList;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    const-wide/16 v5, 0x0

    .line 19
    .line 20
    cmp-long p0, v0, v5

    .line 21
    .line 22
    if-ltz p0, :cond_1

    .line 23
    .line 24
    const-wide/16 v5, 0x5

    .line 25
    .line 26
    mul-long/2addr v3, v5

    .line 27
    const-wide/16 v5, 0x4

    .line 28
    .line 29
    div-long/2addr v3, v5

    .line 30
    cmp-long p0, v0, v3

    .line 31
    .line 32
    if-gtz p0, :cond_1

    .line 33
    .line 34
    return v2

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method private static sparseCodeSize(Lcom/android/dx/util/IntList;)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    mul-long/2addr v0, v2

    .line 9
    const-wide/16 v2, 0x2

    .line 10
    .line 11
    add-long/2addr v0, v2

    .line 12
    return-wide v0
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_0

    .line 13
    .line 14
    const-string v3, "\n    "

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v3, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 20
    .line 21
    invoke-virtual {v3, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, ": "

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v3, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 34
    .line 35
    aget-object v3, v3, v2

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public codeSize()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/dex/code/SwitchData;->packed:Z

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/android/dx/dex/code/SwitchData;->packedCodeSize(Lcom/android/dx/util/IntList;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    :goto_0
    long-to-int p0, v0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-static {p0}, Lcom/android/dx/dex/code/SwitchData;->sparseCodeSize(Lcom/android/dx/util/IntList;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    goto :goto_0
.end method

.method public isPacked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/dex/code/SwitchData;->packed:Z

    .line 2
    .line 3
    return p0
.end method

.method public listingString0(Z)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object p1, p0, Lcom/android/dx/dex/code/SwitchData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const/16 v1, 0x64

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 15
    .line 16
    array-length v1, v1

    .line 17
    iget-boolean v2, p0, Lcom/android/dx/dex/code/SwitchData;->packed:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v2, "packed"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v2, "sparse"

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "-switch-payload // for switch @ "

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_1
    if-ge v2, v1, :cond_1

    .line 43
    .line 44
    iget-object v3, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 45
    .line 46
    aget-object v3, v3, v2

    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    sub-int v4, v3, p1

    .line 53
    .line 54
    const-string v5, "\n  "

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 60
    .line 61
    invoke-virtual {v5, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v5, ": "

    .line 69
    .line 70
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v3, " // "

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method public withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 3

    .line 1
    new-instance p1, Lcom/android/dx/dex/code/SwitchData;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/code/SwitchData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1, v2, p0}, Lcom/android/dx/dex/code/SwitchData;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Lcom/android/dx/util/IntList;[Lcom/android/dx/dex/code/CodeAddress;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/SwitchData;->user:Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lcom/android/dx/dex/code/Dops;->PACKED_SWITCH:Lcom/android/dx/dex/code/Dop;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->getFormat()Lcom/android/dx/dex/code/InsnFormat;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/android/dx/dex/code/InsnFormat;->codeSize()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 18
    .line 19
    array-length v2, v2

    .line 20
    iget-boolean v3, p0, Lcom/android/dx/dex/code/SwitchData;->packed:Z

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    move v3, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v3, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Lcom/android/dx/util/IntList;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    :goto_0
    if-nez v2, :cond_1

    .line 36
    .line 37
    move v2, v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object v5, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 40
    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    invoke-virtual {v5, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :goto_1
    sub-int/2addr v2, v3

    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    .line 50
    const/16 v5, 0x100

    .line 51
    .line 52
    invoke-interface {p1, v5}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1, v2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1, v3}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 59
    .line 60
    .line 61
    move v5, v4

    .line 62
    :goto_2
    if-ge v4, v2, :cond_5

    .line 63
    .line 64
    add-int v6, v3, v4

    .line 65
    .line 66
    iget-object v7, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 67
    .line 68
    invoke-virtual {v7, v5}, Lcom/android/dx/util/IntList;->get(I)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-le v7, v6, :cond_2

    .line 73
    .line 74
    move v6, v1

    .line 75
    goto :goto_3

    .line 76
    :cond_2
    iget-object v6, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 77
    .line 78
    aget-object v6, v6, v5

    .line 79
    .line 80
    invoke-virtual {v6}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    sub-int/2addr v6, v0

    .line 85
    add-int/lit8 v5, v5, 0x1

    .line 86
    .line 87
    :goto_3
    invoke-interface {p1, v6}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    const/16 v1, 0x200

    .line 94
    .line 95
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v2}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 99
    .line 100
    .line 101
    move v1, v4

    .line 102
    :goto_4
    if-ge v1, v2, :cond_4

    .line 103
    .line 104
    iget-object v3, p0, Lcom/android/dx/dex/code/SwitchData;->cases:Lcom/android/dx/util/IntList;

    .line 105
    .line 106
    invoke-virtual {v3, v1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-interface {p1, v3}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_4
    :goto_5
    if-ge v4, v2, :cond_5

    .line 117
    .line 118
    iget-object v1, p0, Lcom/android/dx/dex/code/SwitchData;->targets:[Lcom/android/dx/dex/code/CodeAddress;

    .line 119
    .line 120
    aget-object v1, v1, v4

    .line 121
    .line 122
    invoke-virtual {v1}, Lcom/android/dx/dex/code/DalvInsn;->getAddress()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v1, v0

    .line 127
    invoke-interface {p1, v1}, Lcom/android/dx/util/Output;->writeInt(I)V

    .line 128
    .line 129
    .line 130
    add-int/lit8 v4, v4, 0x1

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    return-void
.end method
