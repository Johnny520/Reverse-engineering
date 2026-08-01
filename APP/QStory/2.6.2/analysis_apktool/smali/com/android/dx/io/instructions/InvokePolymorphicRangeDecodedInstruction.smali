.class public Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final c:I

.field private final protoIndex:I

.field private final registerCount:I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;III)V
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
    int-to-short p0, p7

    .line 13
    if-ne p7, p0, :cond_0

    .line 14
    .line 15
    iput p5, v0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->c:I

    .line 16
    .line 17
    iput p6, v0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->registerCount:I

    .line 18
    .line 19
    iput p7, v0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->protoIndex:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "protoIndex doesn\'t fit in a short: "

    .line 23
    .line 24
    invoke-static {p7, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public getC()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public getProtoIndex()S
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->protoIndex:I

    .line 2
    .line 3
    int-to-short p0, p0

    .line 4
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->registerCount:I

    .line 2
    .line 3
    return p0
.end method

.method public withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "use withProtoIndex to update both the method and proto indices for invoke-polymorphic/range"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public withProtoIndex(II)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 8

    .line 1
    new-instance v0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;

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
    iget v5, p0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->c:I

    .line 16
    .line 17
    iget v6, p0, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;->registerCount:I

    .line 18
    .line 19
    move v3, p1

    .line 20
    move v7, p2

    .line 21
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/InvokePolymorphicRangeDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;III)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
