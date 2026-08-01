.class public final Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;
.super Lcom/android/dx/io/instructions/DecodedInstruction;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final keys:[I

.field private final targets:[I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;I[I[I)V
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
    array-length p0, p3

    .line 13
    array-length p1, p4

    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    iput-object p3, v0, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->keys:[I

    .line 17
    .line 18
    iput-object p4, v0, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->targets:[I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "keys/targets length mismatch"

    .line 22
    .line 23
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    throw p0
.end method


# virtual methods
.method public getKeys()[I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->keys:[I

    .line 2
    .line 3
    return-object p0
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
    iget-object p0, p0, Lcom/android/dx/io/instructions/SparseSwitchPayloadDecodedInstruction;->targets:[I

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
