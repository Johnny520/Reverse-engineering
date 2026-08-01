.class public final Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Lcom/android/dx/io/instructions/DecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 2
    .line 3
    .line 4
    iput p8, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->a:I

    .line 5
    .line 6
    iput p9, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getA()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public getB()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 10

    .line 1
    new-instance v0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;

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
    iget v8, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->a:I

    .line 24
    .line 25
    iget v9, p0, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;->b:I

    .line 26
    .line 27
    move v3, p1

    .line 28
    invoke-direct/range {v0 .. v9}, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJII)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
