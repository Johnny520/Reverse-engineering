.class final enum Lcom/android/dx/io/instructions/InstructionCodec$32;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    .locals 10

    .line 1
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$100(I)I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    const/16 v0, 0xfa

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-ne v2, v0, :cond_1

    .line 9
    .line 10
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$300(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$400(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1700(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-static {v4}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1800(I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-static {v4}, Lcom/android/dx/io/instructions/InstructionCodec;->access$300(I)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-static {v4}, Lcom/android/dx/io/instructions/InstructionCodec;->access$400(I)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    move v8, v4

    .line 47
    invoke-static {v2}, Lcom/android/dx/io/OpcodeInfo;->getIndexType(I)Lcom/android/dx/io/IndexType;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const/4 v9, 0x1

    .line 52
    if-lt p1, v9, :cond_0

    .line 53
    .line 54
    const/4 v9, 0x5

    .line 55
    if-gt p1, v9, :cond_0

    .line 56
    .line 57
    filled-new-array {v5, v6, v7, v8, v0}, [I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-static {v0, v1, p1}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    new-instance v0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;

    .line 67
    .line 68
    move-object v1, p0

    .line 69
    move v5, p2

    .line 70
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;I[I)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_0
    const-string p0, "bogus registerCount: "

    .line 75
    .line 76
    invoke-static {p1}, Lcom/android/dx/util/Hex;->uNibble(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v1
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 5

    .line 1
    check-cast p1, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getG()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getRegisterCount()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$500(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {p0, v0}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getC()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getD()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getE()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getF()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v1, v2, v3, v4}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1900(IIII)S

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->getProtoIndex()S

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-interface {p2, p0, v0, v1, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(SSSS)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
