.class final enum Lcom/android/dx/io/instructions/InstructionCodec$35;
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
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeCursor;->baseAddressForCursor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    new-array v2, v1, [I

    .line 12
    .line 13
    new-array v3, v1, [I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    :goto_0
    if-ge v5, v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    aput v6, v2, v5

    .line 24
    .line 25
    add-int/lit8 v5, v5, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :goto_1
    if-ge v4, v1, :cond_1

    .line 29
    .line 30
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    add-int/2addr v5, v0

    .line 35
    aput v5, v3, v4

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p2, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;

    .line 41
    .line 42
    invoke-direct {p2, p0, p1, v2, v3}, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;I[I[I)V

    .line 43
    .line 44
    .line 45
    return-object p2
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->getKeys()[I

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->getTargets()[I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeCursor;->baseAddressForCursor()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-interface {p2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 20
    .line 21
    .line 22
    array-length p1, v0

    .line 23
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$2000(I)S

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-interface {p2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 28
    .line 29
    .line 30
    array-length p1, p0

    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_0
    if-ge v3, p1, :cond_0

    .line 34
    .line 35
    aget v4, p0, v3

    .line 36
    .line 37
    invoke-interface {p2, v4}, Lcom/android/dx/io/instructions/CodeOutput;->writeInt(I)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    array-length p0, v0

    .line 44
    :goto_1
    if-ge v2, p0, :cond_1

    .line 45
    .line 46
    aget p1, v0, v2

    .line 47
    .line 48
    sub-int/2addr p1, v1

    .line 49
    invoke-interface {p2, p1}, Lcom/android/dx/io/instructions/CodeOutput;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    return-void
.end method
