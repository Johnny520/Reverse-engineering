.class final enum Lcom/android/dx/io/instructions/InstructionCodec$1;
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
    .locals 8

    .line 1
    new-instance v0, Lcom/android/dx/io/instructions/ZeroRegisterDecodedInstruction;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const-wide/16 v6, 0x0

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    move-object v1, p0

    .line 9
    move v2, p1

    .line 10
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/io/instructions/ZeroRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcodeUnit()S

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p2, p0}, Lcom/android/dx/io/instructions/CodeOutput;->write(S)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
