.class public abstract Lcom/android/dx/io/instructions/DecodedInstruction;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final format:Lcom/android/dx/io/instructions/InstructionCodec;

.field private final index:I

.field private final indexType:Lcom/android/dx/io/IndexType;

.field private final literal:J

.field private final opcode:I

.field private final target:I


# direct methods
.method public constructor <init>(Lcom/android/dx/io/instructions/InstructionCodec;IILcom/android/dx/io/IndexType;IJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-static {p2}, Lcom/android/dx/io/Opcodes;->isValidShape(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->format:Lcom/android/dx/io/instructions/InstructionCodec;

    .line 14
    .line 15
    iput p2, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->opcode:I

    .line 16
    .line 17
    iput p3, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->index:I

    .line 18
    .line 19
    iput-object p4, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->indexType:Lcom/android/dx/io/IndexType;

    .line 20
    .line 21
    iput p5, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->target:I

    .line 22
    .line 23
    iput-wide p6, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "invalid opcode"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    const-string p0, "format == null"

    .line 33
    .line 34
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public static decode(Lcom/android/dx/io/instructions/CodeInput;)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 2

    .line 1
    invoke-interface {p0}, Lcom/android/dx/io/instructions/CodeInput;->read()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/android/dx/io/Opcodes;->extractOpcodeFromUnit(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Lcom/android/dx/io/OpcodeInfo;->getFormat(I)Lcom/android/dx/io/instructions/InstructionCodec;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0, p0}, Lcom/android/dx/io/instructions/InstructionCodec;->decode(ILcom/android/dx/io/instructions/CodeInput;)Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static decodeAll([S)[Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 3
    .line 4
    new-instance v1, Lcom/android/dx/io/instructions/ShortArrayCodeInput;

    .line 5
    .line 6
    invoke-direct {v1, p0}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;-><init>([S)V

    .line 7
    .line 8
    .line 9
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Lcom/android/dx/io/instructions/ShortArrayCodeInput;->hasMore()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/android/dx/io/instructions/BaseCodeCursor;->cursor()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-static {v1}, Lcom/android/dx/io/instructions/DecodedInstruction;->decode(Lcom/android/dx/io/instructions/CodeInput;)Lcom/android/dx/io/instructions/DecodedInstruction;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    aput-object v2, v0, p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object v0

    .line 27
    :catch_0
    move-exception p0

    .line 28
    new-instance v0, Lcom/android/dex/DexException;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lcom/android/dex/DexException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method


# virtual methods
.method public final encode(Lcom/android/dx/io/instructions/CodeOutput;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->format:Lcom/android/dx/io/instructions/InstructionCodec;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/android/dx/io/instructions/InstructionCodec;->encode(Lcom/android/dx/io/instructions/DecodedInstruction;Lcom/android/dx/io/instructions/CodeOutput;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getA()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getAByte()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, -0x100

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register A out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getANibble()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, -0x10

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register A out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getAUnit()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getA()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, -0x10000

    .line 6
    .line 7
    and-int/2addr v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    int-to-long v0, p0

    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Register A out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public getB()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getBByte()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getB()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, -0x100

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register B out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getBNibble()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getB()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, -0x10

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register B out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getBUnit()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getB()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, -0x10000

    .line 6
    .line 7
    and-int/2addr v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    int-to-long v0, p0

    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Register B out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public getC()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getCByte()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getC()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, -0x100

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register C out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getCNibble()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getC()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, -0x10

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register C out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getCUnit()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getC()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, -0x10000

    .line 6
    .line 7
    and-int/2addr v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    int-to-long v0, p0

    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Register C out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public getD()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getDByte()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getD()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, -0x100

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register D out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getDNibble()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getD()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, -0x10

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register D out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getDUnit()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getD()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, -0x10000

    .line 6
    .line 7
    and-int/2addr v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    int-to-long v0, p0

    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Register D out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public getE()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getENibble()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getE()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, -0x10

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    int-to-short p0, p0

    .line 10
    return p0

    .line 11
    :cond_0
    int-to-long v0, p0

    .line 12
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Register E out of range: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final getFormat()Lcom/android/dx/io/instructions/InstructionCodec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->format:Lcom/android/dx/io/instructions/InstructionCodec;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public final getIndexType()Lcom/android/dx/io/IndexType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->indexType:Lcom/android/dx/io/IndexType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIndexUnit()S
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->index:I

    .line 2
    .line 3
    int-to-short p0, p0

    .line 4
    return p0
.end method

.method public final getLiteral()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLiteralByte()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 2
    .line 3
    long-to-int v2, v0

    .line 4
    int-to-byte v2, v2

    .line 5
    int-to-long v2, v2

    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    long-to-int p0, v0

    .line 11
    and-int/lit16 p0, p0, 0xff

    .line 12
    .line 13
    return p0

    .line 14
    :cond_0
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v0, "Literal out of range: "

    .line 21
    .line 22
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final getLiteralInt()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 2
    .line 3
    long-to-int v2, v0

    .line 4
    int-to-long v2, v2

    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    long-to-int p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Literal out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final getLiteralNibble()I
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 2
    .line 3
    const-wide/16 v2, -0x8

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-ltz v2, :cond_0

    .line 8
    .line 9
    const-wide/16 v2, 0x7

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-gtz v2, :cond_0

    .line 14
    .line 15
    long-to-int p0, v0

    .line 16
    and-int/lit8 p0, p0, 0xf

    .line 17
    .line 18
    return p0

    .line 19
    :cond_0
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "Literal out of range: "

    .line 26
    .line 27
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final getLiteralUnit()S
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 2
    .line 3
    long-to-int v2, v0

    .line 4
    int-to-short v2, v2

    .line 5
    int-to-long v2, v2

    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    long-to-int p0, v0

    .line 11
    int-to-short p0, p0

    .line 12
    return p0

    .line 13
    :cond_0
    iget-wide v0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->literal:J

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "Literal out of range: "

    .line 20
    .line 21
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final getOpcode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->opcode:I

    .line 2
    .line 3
    return p0
.end method

.method public final getOpcodeUnit()S
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->opcode:I

    .line 2
    .line 3
    int-to-short p0, p0

    .line 4
    return p0
.end method

.method public getProtoIndex()S
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public abstract getRegisterCount()I
.end method

.method public final getRegisterCountUnit()S
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/io/instructions/DecodedInstruction;->getRegisterCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/high16 v0, -0x10000

    .line 6
    .line 7
    and-int/2addr v0, p0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    int-to-short p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    int-to-long v0, p0

    .line 13
    invoke-static {v0, v1}, Lcom/android/dx/util/Hex;->u8(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "Register count out of range: "

    .line 18
    .line 19
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final getTarget()I
    .locals 0

    .line 5
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->target:I

    return p0
.end method

.method public final getTarget(I)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/io/instructions/DecodedInstruction;->target:I

    .line 2
    .line 3
    sub-int/2addr p0, p1

    .line 4
    return p0
.end method

.method public final getTargetByte(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getTarget(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-byte p1, p0

    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    and-int/lit16 p0, p0, 0xff

    .line 9
    .line 10
    return p0

    .line 11
    :cond_0
    const-string p1, "Target out of range: "

    .line 12
    .line 13
    invoke-static {p0}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final getTargetUnit(I)S
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/io/instructions/DecodedInstruction;->getTarget(I)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-short p1, p0

    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    const-string p1, "Target out of range: "

    .line 10
    .line 11
    invoke-static {p0}, Lcom/android/dx/util/Hex;->s4(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public abstract withIndex(I)Lcom/android/dx/io/instructions/DecodedInstruction;
.end method

.method public withProtoIndex(II)Lcom/android/dx/io/instructions/DecodedInstruction;
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
.end method
