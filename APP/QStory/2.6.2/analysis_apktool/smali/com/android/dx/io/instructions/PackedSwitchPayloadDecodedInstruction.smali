.class public final Lcom/android/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final firstKey:I

.field private final targets:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;II[I)V
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
    iput p3, v0, Lcom/android/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->firstKey:I

    .line 13
    .line 14
    iput-object p4, v0, Lcom/android/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->targets:[I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getFirstKey()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->firstKey:I

    .line 2
    .line 3
    return p0
.end method

.method public getRegisterCount()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getTargets()[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/PackedSwitchPayloadDecodedInstruction;->targets:[I

    .line 2
    .line 3
    return-object p0
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
