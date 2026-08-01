.class final enum Lcom/android/dx/io/instructions/InstructionCodec$31;
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
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readLong()J

    .line 10
    .line 11
    .line 12
    move-result-wide v6

    .line 13
    new-instance v0, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v1, p0

    .line 19
    invoke-direct/range {v0 .. v8}, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJI)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getLiteral()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1300(J)S

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1400(J)S

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1500(J)S

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v0, v1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$1600(J)S

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    move-object v2, p2

    .line 34
    invoke-interface/range {v2 .. v7}, Lcom/android/dx/io/instructions/CodeOutput;->write(SSSSS)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
