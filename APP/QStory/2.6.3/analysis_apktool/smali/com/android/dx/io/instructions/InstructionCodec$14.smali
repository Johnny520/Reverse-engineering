.class final enum Lcom/android/dx/io/instructions/InstructionCodec$14;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    .locals 11

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
    move-result v8

    .line 9
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$100(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$200(I)I

    .line 18
    .line 19
    .line 20
    move-result v10

    .line 21
    new-instance v0, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const-wide/16 v6, 0x0

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v1, p0

    .line 29
    invoke-direct/range {v0 .. v10}, Lcom/android/dx/io/instructions/ThreeRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJIII)V

    .line 30
    .line 31
    .line 32
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
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

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
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getB()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getC()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {v0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-interface {p2, p0, p1}, Lcom/android/dx/io/instructions/CodeOutput;->write(SS)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
