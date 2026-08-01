.class final enum Lcom/android/dx/io/instructions/InstructionCodec$36;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/io/instructions/InstructionCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/io/instructions/InstructionCodec;-><init>(Ljava/lang/String;ILcom/android/dx/io/instructions/InstructionCodec$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public decode(ILcom/android/dx/io/instructions/CodeInput;)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 7

    .line 1
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-eq v0, v4, :cond_6

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v0, v4, :cond_4

    .line 17
    .line 18
    const/4 v4, 0x4

    .line 19
    if-eq v0, v4, :cond_2

    .line 20
    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    new-array v0, v1, [J

    .line 24
    .line 25
    :goto_0
    if-ge v3, v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readLong()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    aput-wide v4, v0, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 37
    .line 38
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[J)V

    .line 39
    .line 40
    .line 41
    return-object p2

    .line 42
    :cond_1
    new-instance p0, Lcom/android/dex/DexException;

    .line 43
    .line 44
    new-instance p1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string p2, "bogus element_width: "

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {p0, p1}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_2
    new-array v0, v1, [I

    .line 60
    .line 61
    :goto_1
    if-ge v3, v1, :cond_3

    .line 62
    .line 63
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    aput v2, v0, v3

    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 73
    .line 74
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[I)V

    .line 75
    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_4
    new-array v0, v1, [S

    .line 79
    .line 80
    :goto_2
    if-ge v3, v1, :cond_5

    .line 81
    .line 82
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-short v2, v2

    .line 87
    aput-short v2, v0, v3

    .line 88
    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 93
    .line 94
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[S)V

    .line 95
    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_6
    new-array v0, v1, [B

    .line 99
    .line 100
    move v5, v4

    .line 101
    move v4, v3

    .line 102
    :goto_3
    if-ge v3, v1, :cond_8

    .line 103
    .line 104
    if-eqz v5, :cond_7

    .line 105
    .line 106
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    :cond_7
    and-int/lit16 v6, v4, 0xff

    .line 111
    .line 112
    int-to-byte v6, v6

    .line 113
    aput-byte v6, v0, v3

    .line 114
    .line 115
    shr-int/2addr v4, v2

    .line 116
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    xor-int/lit8 v5, v5, 0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_8
    new-instance p2, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 122
    .line 123
    invoke-direct {p2, p0, p1, v0}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[B)V

    .line 124
    .line 125
    .line 126
    return-object p2
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 1
    check-cast p1, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getElementWidthUnit()S

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getData()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-interface {p2, v1}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p0}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->getSize()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->writeInt(I)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    if-eq p0, p1, :cond_3

    .line 30
    .line 31
    const/4 p1, 0x2

    .line 32
    if-eq p0, p1, :cond_2

    .line 33
    .line 34
    const/4 p1, 0x4

    .line 35
    if-eq p0, p1, :cond_1

    .line 36
    .line 37
    const/16 p1, 0x8

    .line 38
    .line 39
    if-ne p0, p1, :cond_0

    .line 40
    .line 41
    check-cast v0, [J

    .line 42
    .line 43
    invoke-interface {p2, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write([J)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance p1, Lcom/android/dex/DexException;

    .line 48
    .line 49
    new-instance p2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, "bogus element_width: "

    .line 52
    .line 53
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p1, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_1
    check-cast v0, [I

    .line 65
    .line 66
    invoke-interface {p2, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write([I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    check-cast v0, [S

    .line 71
    .line 72
    invoke-interface {p2, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write([S)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    check-cast v0, [B

    .line 77
    .line 78
    invoke-interface {p2, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write([B)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
