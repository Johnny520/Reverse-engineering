.class public final Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final data:Ljava/lang/Object;

.field private final elementWidth:I

.field private final size:I


# direct methods
.method private constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;ILjava/lang/Object;II)V
    .locals 8

    .line 1
    const/4 v5, 0x0

    .line 2
    const-wide/16 v6, 0x0

    .line 3
    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x0

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move v2, p2

    .line 9
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/DecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 10
    .line 11
    .line 12
    iput-object p3, v0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->data:Ljava/lang/Object;

    .line 13
    .line 14
    iput p4, v0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->size:I

    .line 15
    .line 16
    iput p5, v0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->elementWidth:I

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;I[B)V
    .locals 6

    .line 19
    array-length v4, p3

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;ILjava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;I[I)V
    .locals 6

    .line 21
    array-length v4, p3

    const/4 v5, 0x4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;ILjava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;I[J)V
    .locals 6

    .line 22
    array-length v4, p3

    const/16 v5, 0x8

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;ILjava/lang/Object;II)V

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;I[S)V
    .locals 6

    .line 20
    array-length v4, p3

    const/4 v5, 0x2

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->data:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public getElementWidthUnit()S
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->elementWidth:I

    .line 2
    .line 3
    int-to-short p0, p0

    .line 4
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/FillArrayDataPayloadDecodedInstruction;->size:I

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
    const-string p1, "no index in instruction"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
