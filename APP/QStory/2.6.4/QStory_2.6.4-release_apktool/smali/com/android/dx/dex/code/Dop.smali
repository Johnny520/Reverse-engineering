.class public final Lcom/android/dx/dex/code/Dop;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final family:I

.field private final format:Lcom/android/dx/dex/code/InsnFormat;

.field private final hasResult:Z

.field private final nextOpcode:I

.field private final opcode:I


# direct methods
.method public constructor <init>(IIILcom/android/dx/dex/code/InsnFormat;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/android/dx/io/Opcodes;->isValidShape(I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-static {p2}, Lcom/android/dx/io/Opcodes;->isValidShape(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {p3}, Lcom/android/dx/io/Opcodes;->isValidShape(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-eqz p4, :cond_0

    .line 24
    .line 25
    iput p1, p0, Lcom/android/dx/dex/code/Dop;->opcode:I

    .line 26
    .line 27
    iput p2, p0, Lcom/android/dx/dex/code/Dop;->family:I

    .line 28
    .line 29
    iput p3, p0, Lcom/android/dx/dex/code/Dop;->nextOpcode:I

    .line 30
    .line 31
    iput-object p4, p0, Lcom/android/dx/dex/code/Dop;->format:Lcom/android/dx/dex/code/InsnFormat;

    .line 32
    .line 33
    iput-boolean p5, p0, Lcom/android/dx/dex/code/Dop;->hasResult:Z

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    const-string p0, "format == null"

    .line 37
    .line 38
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_1
    const-string p0, "bogus nextOpcode"

    .line 43
    .line 44
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_2
    const-string p0, "bogus family"

    .line 49
    .line 50
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1

    .line 54
    :cond_3
    const-string p0, "bogus opcode"

    .line 55
    .line 56
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1
.end method


# virtual methods
.method public getFamily()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/Dop;->family:I

    .line 2
    .line 3
    return p0
.end method

.method public getFormat()Lcom/android/dx/dex/code/InsnFormat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/Dop;->format:Lcom/android/dx/dex/code/InsnFormat;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/Dop;->opcode:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/android/dx/io/OpcodeInfo;->getName(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getNextOpcode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/Dop;->nextOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public getOpcode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/Dop;->opcode:I

    .line 2
    .line 3
    return p0
.end method

.method public getOppositeTest()Lcom/android/dx/dex/code/Dop;
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/Dop;->opcode:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "bogus opcode: "

    .line 7
    .line 8
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_GTZ:Lcom/android/dx/dex/code/Dop;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_LEZ:Lcom/android/dx/dex/code/Dop;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_LTZ:Lcom/android/dx/dex/code/Dop;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_3
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_GEZ:Lcom/android/dx/dex/code/Dop;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_4
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_EQZ:Lcom/android/dx/dex/code/Dop;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_5
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_NEZ:Lcom/android/dx/dex/code/Dop;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_6
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_GT:Lcom/android/dx/dex/code/Dop;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_7
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_LE:Lcom/android/dx/dex/code/Dop;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_8
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_LT:Lcom/android/dx/dex/code/Dop;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_9
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_GE:Lcom/android/dx/dex/code/Dop;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_a
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_EQ:Lcom/android/dx/dex/code/Dop;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_b
    sget-object p0, Lcom/android/dx/dex/code/Dops;->IF_NE:Lcom/android/dx/dex/code/Dop;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public hasResult()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/dex/code/Dop;->hasResult:Z

    .line 2
    .line 3
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/Dop;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
