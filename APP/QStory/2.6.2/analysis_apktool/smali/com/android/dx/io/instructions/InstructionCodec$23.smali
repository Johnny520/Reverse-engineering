.class final enum Lcom/android/dx/io/instructions/InstructionCodec$23;
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
    .locals 10

    .line 1
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeCursor;->cursor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$100(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$200(I)I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->readInt()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    add-int v6, p1, v0

    .line 20
    .line 21
    const/16 p1, 0x2b

    .line 22
    .line 23
    if-eq v3, p1, :cond_0

    .line 24
    .line 25
    const/16 p1, 0x2c

    .line 26
    .line 27
    if-eq v3, p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {p2, v6, v0}, Lcom/android/dx/io/instructions/CodeCursor;->setBaseAddress(II)V

    .line 31
    .line 32
    .line 33
    :goto_0
    new-instance v1, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const-wide/16 v7, 0x0

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    move-object v2, p0

    .line 40
    invoke-direct/range {v1 .. v9}, Lcom/android/dx/io/instructions/OneRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJI)V

    .line 41
    .line 42
    .line 43
    return-object v1
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 1

    .line 1
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeCursor;->cursor()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getTarget(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getOpcode()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {v0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p0}, Lcom/android/dx/io/instructions/InstructionCodec;->access$700(I)S

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p0}, Lcom/android/dx/io/instructions/InstructionCodec;->access$800(I)S

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-interface {p2, p1, v0, p0}, Lcom/android/dx/io/instructions/CodeOutput;->write(SSS)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
