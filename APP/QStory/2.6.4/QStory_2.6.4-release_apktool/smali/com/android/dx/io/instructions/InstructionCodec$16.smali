.class final enum Lcom/android/dx/io/instructions/InstructionCodec$16;
.super Lcom/android/dx/io/instructions/InstructionCodec;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$300(I)I

    .line 12
    .line 13
    .line 14
    move-result v9

    .line 15
    invoke-static {p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$400(I)I

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-short p1, p1

    .line 24
    new-instance v1, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;

    .line 25
    .line 26
    add-int v6, v0, p1

    .line 27
    .line 28
    const-wide/16 v7, 0x0

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v2, p0

    .line 33
    invoke-direct/range {v1 .. v10}, Lcom/android/dx/io/instructions/TwoRegisterDecodedInstruction;-><init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJII)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/android/dx/io/instructions/CodeCursor;->cursor()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1, p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getTargetUnit(I)S

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
    move-result v1

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getB()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {v1, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$500(II)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {v0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->access$600(II)S

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-interface {p2, p1, p0}, Lcom/android/dx/io/instructions/CodeOutput;->write(SS)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
