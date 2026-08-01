.class final enum Lcom/android/dx/io/instructions/InstructionCodec$12;
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
    .locals 9

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
    int-to-short p1, p1

    .line 14
    int-to-long p1, p1

    .line 15
    const/16 v0, 0x15

    .line 16
    .line 17
    if-ne v2, v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x10

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x30

    .line 23
    .line 24
    :goto_0
    shl-long v6, p1, v0

    .line 25
    .line 26
    new-instance v0, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    move-object v1, p0

    .line 32
    invoke-direct/range {v0 .. v8}, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJI)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 v0, 0x15

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v0, 0x30

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getLiteral()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    shr-long v0, v1, v0

    .line 19
    .line 20
    long-to-int v0, v0

    .line 21
    int-to-short v0, v0

    .line 22
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-interface {p2, p0, v0}, Lcom/android/dx/io/instructions/CodeOutput;->write(SS)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
