.class public Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final protoIndex:I

.field private final registers:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;I[I)V
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    const-wide/16 v6, 0x0

    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/DecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 10
    .line 11
    .line 12
    int-to-short p0, p5

    .line 13
    if-ne p5, p0, :cond_0

    .line 14
    .line 15
    iput p5, v0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->protoIndex:I

    .line 16
    .line 17
    iput-object p6, v0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "protoIndex doesn\'t fit in a short: "

    .line 21
    .line 22
    invoke-static {p5, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    throw p0
.end method


# virtual methods
.method public getC()I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    aget p0, p0, v1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    return v1
.end method

.method public getD()I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x1

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    aget p0, p0, v1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public getE()I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x2

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    aget p0, p0, v1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public getF()I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x3

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    aget p0, p0, v1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public getG()I
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x4

    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    aget p0, p0, v1

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public getProtoIndex()S
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->protoIndex:I

    .line 2
    .line 3
    int-to-short p0, p0

    .line 4
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "use withProtoIndex to update both the method and proto indices for invoke-polymorphic"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public withProtoIndex(II)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getFormat()Lcom/android/dx/io/instructions/InstructionCodec;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getIndexType()Lcom/android/dx/io/IndexType;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    iget-object v6, p0, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;->registers:[I

    .line 16
    .line 17
    move v3, p1

    .line 18
    move v5, p2

    .line 19
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/io/instructions/InvokePolymorphicDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;I[I)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
