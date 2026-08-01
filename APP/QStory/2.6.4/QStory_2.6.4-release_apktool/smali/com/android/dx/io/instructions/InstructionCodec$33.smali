.class final enum Lcom/android/dx/io/instructions/InstructionCodec$33;
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
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$100(I)I

    .line 2
    .line 3
    .line 4
    move-result v2

    .line 5
    const/16 v0, 0xfb

    .line 6
    .line 7
    if-ne v2, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$200(I)I

    .line 10
    .line 11
    .line 12
    move-result v6

    .line 13
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-static {v2}, Lcom/android/dx/io/OpcodeInfo;->getIndexType(I)Lcom/android/dx/io/IndexType;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;

    .line 30
    .line 31
    move-object v1, p0

    .line 32
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;III)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getRegisterCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0, v0}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndexUnit()S

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getCUnit()S

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getProtoIndex()S

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p2, p0, v0, v1, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(SSSS)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
