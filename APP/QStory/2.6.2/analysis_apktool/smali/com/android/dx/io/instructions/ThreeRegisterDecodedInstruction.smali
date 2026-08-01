.class public final Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJIII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/android/dx/io/instructions/DecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 2
    .line 3
    .line 4
    iput p8, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    .line 5
    .line 6
    iput p9, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    .line 7
    .line 8
    iput p10, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getA()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public getB()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public getC()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    return p0
.end method

.method public withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 11

    .line 1
    new-instance v0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;

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
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getTarget()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getLiteral()J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    iget v8, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->a:I

    .line 24
    .line 25
    iget v9, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->b:I

    .line 26
    .line 27
    iget v10, p0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;->c:I

    .line 28
    .line 29
    move v3, p1

    .line 30
    invoke-direct/range {v0 .. v10}, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJIII)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
