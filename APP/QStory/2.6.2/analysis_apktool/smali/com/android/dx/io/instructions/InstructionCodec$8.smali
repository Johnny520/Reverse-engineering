.class final enum Lcom/android/dx/io/instructions/InstructionCodec$8;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$200(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    new-instance v0, Lcom/android/dx/io/instructions/ZeroRegisterDecodedInstruction;

    .line 14
    .line 15
    sget-object v4, Lcom/android/dx/io/IndexType;->VARIES:Lcom/android/dx/io/IndexType;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    int-to-long v6, p1

    .line 19
    move-object v1, p0

    .line 20
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/ZeroRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getLiteralByte()I

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
    move-result p1

    .line 17
    invoke-interface {p2, p0, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(SS)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
