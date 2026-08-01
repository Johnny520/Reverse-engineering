.class Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/rop/code/Insn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/RopTranslator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TranslationVisitor"
.end annotation


# instance fields
.field private block:Lcom/android/dx/rop/code/BasicBlock;

.field private lastAddress:Lcom/android/dx/dex/code/CodeAddress;

.field private final output:Lcom/android/dx/dex/code/OutputCollector;

.field final synthetic this$0:Lcom/android/dx/dex/code/RopTranslator;


# direct methods
.method public constructor <init>(Lcom/android/dx/dex/code/RopTranslator;Lcom/android/dx/dex/code/OutputCollector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->output:Lcom/android/dx/dex/code/OutputCollector;

    .line 7
    .line 8
    return-void
.end method

.method private getNextMoveResultPseudo()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->block:Lcom/android/dx/rop/code/BasicBlock;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 12
    .line 13
    invoke-static {p0}, Lcom/android/dx/dex/code/RopTranslator;->access$500(Lcom/android/dx/dex/code/RopTranslator;)Lcom/android/dx/rop/code/RopMethod;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/BasicBlockList;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlock;->getInsns()Lcom/android/dx/rop/code/InsnList;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/16 v2, 0x38

    .line 43
    .line 44
    if-eq v0, v2, :cond_1

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method


# virtual methods
.method public addOutput(Lcom/android/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->output:Lcom/android/dx/dex/code/OutputCollector;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/OutputCollector;->add(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->output:Lcom/android/dx/dex/code/OutputCollector;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/OutputCollector;->addSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getPrevNonSpecialInsn()Lcom/android/dx/dex/code/DalvInsn;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->output:Lcom/android/dx/dex/code/OutputCollector;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/dex/code/OutputCollector;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->output:Lcom/android/dx/dex/code/OutputCollector;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lcom/android/dx/dex/code/OutputCollector;->get(I)Lcom/android/dx/dex/code/DalvInsn;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, -0x1

    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public setBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/dex/code/CodeAddress;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->block:Lcom/android/dx/rop/code/BasicBlock;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 4
    .line 5
    return-void
.end method

.method public visitFillArrayDataInsn(Lcom/android/dx/rop/code/FillArrayDataInsn;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/code/FillArrayDataInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/FillArrayDataInsn;->getInitValues()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    new-instance v3, Lcom/android/dx/dex/code/CodeAddress;

    .line 25
    .line 26
    invoke-direct {v3, v0}, Lcom/android/dx/dex/code/CodeAddress;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, Lcom/android/dx/dex/code/ArrayData;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 32
    .line 33
    invoke-direct {v4, v0, v5, v2, v1}, Lcom/android/dx/dex/code/ArrayData;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Ljava/util/ArrayList;Lcom/android/dx/rop/cst/Constant;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/android/dx/dex/code/TargetInsn;

    .line 37
    .line 38
    sget-object v2, Lcom/android/dx/dex/code/Dops;->FILL_ARRAY_DATA:Lcom/android/dx/dex/code/Dop;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/android/dx/dex/code/RopTranslator;->access$000(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, v2, v0, p1, v3}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, Lcom/android/dx/dex/code/OddSpacer;

    .line 56
    .line 57
    invoke-direct {p1, v0}, Lcom/android/dx/dex/code/OddSpacer;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v4}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    const-string p0, "shouldn\'t happen"

    .line 71
    .line 72
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public visitInvokePolymorphicInsn(Lcom/android/dx/rop/code/InvokePolymorphicInsn;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/android/dx/dex/code/RopToDop;->dopFor(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x6

    .line 18
    if-ne v3, v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->isCallLike()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getPolymorphicMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getCallSiteProto()Lcom/android/dx/rop/cst/CstProtoRef;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/4 v4, 0x2

    .line 44
    new-array v4, v4, [Lcom/android/dx/rop/cst/Constant;

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    aput-object v3, v4, v5

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    aput-object p1, v4, v3

    .line 51
    .line 52
    new-instance p1, Lcom/android/dx/dex/code/MultiCstInsn;

    .line 53
    .line 54
    invoke-direct {p1, v1, v0, v2, v4}, Lcom/android/dx/dex/code/MultiCstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;[Lcom/android/dx/rop/cst/Constant;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    const-string p0, "Expected call-like operation"

    .line 62
    .line 63
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 68
    .line 69
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v1, "Expected BRANCH_THROW got "

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p0
.end method

.method public visitPlainCstInsn(Lcom/android/dx/rop/code/PlainCstInsn;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/android/dx/dex/code/RopToDop;->dopFor(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x1

    .line 22
    if-ne v2, v4, :cond_2

    .line 23
    .line 24
    const/4 v2, 0x3

    .line 25
    if-ne v3, v2, :cond_1

    .line 26
    .line 27
    iget-object v2, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 28
    .line 29
    invoke-static {v2}, Lcom/android/dx/dex/code/RopTranslator;->access$200(Lcom/android/dx/dex/code/RopTranslator;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getResult()Lcom/android/dx/rop/code/RegisterSpec;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Lcom/android/dx/rop/cst/CstInteger;

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v3, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 50
    .line 51
    invoke-static {v3}, Lcom/android/dx/dex/code/RopTranslator;->access$300(Lcom/android/dx/dex/code/RopTranslator;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iget-object v4, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 56
    .line 57
    invoke-static {v4}, Lcom/android/dx/dex/code/RopTranslator;->access$400(Lcom/android/dx/dex/code/RopTranslator;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    sub-int/2addr v3, v4

    .line 62
    add-int/2addr v3, p1

    .line 63
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {v3, p1}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v3, Lcom/android/dx/dex/code/SimpleInsn;

    .line 72
    .line 73
    invoke-static {v2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v3, v1, v0, p1}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    return-void

    .line 84
    :cond_1
    invoke-static {p1}, Lcom/android/dx/dex/code/RopTranslator;->access$000(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, Lcom/android/dx/dex/code/CstInsn;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {v3, v1, v0, v2, p1}, Lcom/android/dx/dex/code/CstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 102
    .line 103
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public visitPlainInsn(Lcom/android/dx/rop/code/PlainInsn;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x36

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x38

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {p1}, Lcom/android/dx/dex/code/RopToDop;->dopFor(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/dex/code/Dop;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v3, 0x1

    .line 36
    if-eq v0, v3, :cond_5

    .line 37
    .line 38
    const/4 v4, 0x2

    .line 39
    if-eq v0, v4, :cond_5

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    if-eq v0, v4, :cond_4

    .line 43
    .line 44
    const/4 v4, 0x4

    .line 45
    if-eq v0, v4, :cond_3

    .line 46
    .line 47
    const/4 v3, 0x6

    .line 48
    if-ne v0, v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 52
    .line 53
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->block:Lcom/android/dx/rop/code/BasicBlock;

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    new-instance v3, Lcom/android/dx/dex/code/TargetInsn;

    .line 68
    .line 69
    invoke-static {p1}, Lcom/android/dx/dex/code/RopTranslator;->access$000(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v4, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 74
    .line 75
    invoke-static {v4}, Lcom/android/dx/dex/code/RopTranslator;->access$100(Lcom/android/dx/dex/code/RopTranslator;)Lcom/android/dx/dex/code/BlockAddresses;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v4, v0}, Lcom/android/dx/dex/code/BlockAddresses;->getStart(I)Lcom/android/dx/dex/code/CodeAddress;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {v3, v2, v1, p1, v0}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_0
    return-void

    .line 88
    :cond_5
    :goto_1
    new-instance v3, Lcom/android/dx/dex/code/SimpleInsn;

    .line 89
    .line 90
    invoke-static {p1}, Lcom/android/dx/dex/code/RopTranslator;->access$000(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {v3, v2, v1, p1}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public visitSwitchInsn(Lcom/android/dx/rop/code/SwitchInsn;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/code/SwitchInsn;->getCases()Lcom/android/dx/util/IntList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->block:Lcom/android/dx/rop/code/BasicBlock;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget-object v5, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->block:Lcom/android/dx/rop/code/BasicBlock;

    .line 24
    .line 25
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getPrimarySuccessor()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    const/4 v6, 0x1

    .line 30
    sub-int/2addr v4, v6

    .line 31
    if-ne v3, v4, :cond_2

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ne v5, v4, :cond_2

    .line 38
    .line 39
    new-array v4, v3, [Lcom/android/dx/dex/code/CodeAddress;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    :goto_0
    if-ge v5, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2, v5}, Lcom/android/dx/util/IntList;->get(I)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    iget-object v8, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->this$0:Lcom/android/dx/dex/code/RopTranslator;

    .line 49
    .line 50
    invoke-static {v8}, Lcom/android/dx/dex/code/RopTranslator;->access$100(Lcom/android/dx/dex/code/RopTranslator;)Lcom/android/dx/dex/code/BlockAddresses;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-virtual {v8, v7}, Lcom/android/dx/dex/code/BlockAddresses;->getStart(I)Lcom/android/dx/dex/code/CodeAddress;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    aput-object v7, v4, v5

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance v2, Lcom/android/dx/dex/code/CodeAddress;

    .line 64
    .line 65
    invoke-direct {v2, v0}, Lcom/android/dx/dex/code/CodeAddress;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 66
    .line 67
    .line 68
    new-instance v3, Lcom/android/dx/dex/code/CodeAddress;

    .line 69
    .line 70
    iget-object v5, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 71
    .line 72
    invoke-virtual {v5}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-direct {v3, v5, v6}, Lcom/android/dx/dex/code/CodeAddress;-><init>(Lcom/android/dx/rop/code/SourcePosition;Z)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Lcom/android/dx/dex/code/SwitchData;

    .line 80
    .line 81
    invoke-direct {v5, v0, v3, v1, v4}, Lcom/android/dx/dex/code/SwitchData;-><init>(Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/dex/code/CodeAddress;Lcom/android/dx/util/IntList;[Lcom/android/dx/dex/code/CodeAddress;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Lcom/android/dx/dex/code/SwitchData;->isPacked()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    sget-object v1, Lcom/android/dx/dex/code/Dops;->PACKED_SWITCH:Lcom/android/dx/dex/code/Dop;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    sget-object v1, Lcom/android/dx/dex/code/Dops;->SPARSE_SWITCH:Lcom/android/dx/dex/code/Dop;

    .line 94
    .line 95
    :goto_1
    new-instance v4, Lcom/android/dx/dex/code/TargetInsn;

    .line 96
    .line 97
    invoke-static {p1}, Lcom/android/dx/dex/code/RopTranslator;->access$000(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {v4, v1, v0, p1, v2}, Lcom/android/dx/dex/code/TargetInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/dex/code/CodeAddress;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v4}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lcom/android/dx/dex/code/OddSpacer;

    .line 111
    .line 112
    invoke-direct {p1, v0}, Lcom/android/dx/dex/code/OddSpacer;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v5}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutputSuffix(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 126
    .line 127
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public visitThrowingCstInsn(Lcom/android/dx/rop/code/ThrowingCstInsn;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/android/dx/dex/code/RopToDop;->dopFor(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/rop/code/CstInsn;->getConstant()Lcom/android/dx/rop/cst/Constant;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x6

    .line 22
    if-ne v4, v5, :cond_8

    .line 23
    .line 24
    iget-object v4, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->isCallLike()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v2, Lcom/android/dx/dex/code/CstInsn;

    .line 40
    .line 41
    invoke-direct {v2, v1, v0, p1, v3}, Lcom/android/dx/dex/code/CstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v2}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    invoke-direct {p0}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->getNextMoveResultPseudo()Lcom/android/dx/rop/code/RegisterSpec;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {p1, v4}, Lcom/android/dx/dex/code/RopTranslator;->access$600(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->hasResult()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x1

    .line 62
    if-nez v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const/16 v9, 0x2b

    .line 69
    .line 70
    if-ne v6, v9, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move v6, v7

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    move v6, v8

    .line 76
    :goto_1
    if-eqz v4, :cond_3

    .line 77
    .line 78
    move v4, v8

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move v4, v7

    .line 81
    :goto_2
    if-ne v6, v4, :cond_7

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getOpcode()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    const/16 v2, 0x29

    .line 88
    .line 89
    if-ne p1, v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/16 v2, 0x23

    .line 96
    .line 97
    if-eq p1, v2, :cond_4

    .line 98
    .line 99
    new-instance p1, Lcom/android/dx/dex/code/SimpleInsn;

    .line 100
    .line 101
    invoke-direct {p1, v1, v0, v5}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    new-instance p1, Lcom/android/dx/dex/code/CstInsn;

    .line 106
    .line 107
    invoke-direct {p1, v1, v0, v5, v3}, Lcom/android/dx/dex/code/CstInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->getPrevNonSpecialInsn()Lcom/android/dx/dex/code/DalvInsn;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    const/16 v3, 0x20

    .line 119
    .line 120
    if-ne v1, v3, :cond_6

    .line 121
    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvInsn;->getOpcode()Lcom/android/dx/dex/code/Dop;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->getOpcode()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    const/4 v3, 0x7

    .line 133
    if-eq v1, v3, :cond_5

    .line 134
    .line 135
    const/16 v3, 0x8

    .line 136
    .line 137
    if-eq v1, v3, :cond_5

    .line 138
    .line 139
    const/16 v3, 0x9

    .line 140
    .line 141
    if-ne v1, v3, :cond_6

    .line 142
    .line 143
    :cond_5
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-lez v1, :cond_6

    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-le v1, v8, :cond_6

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1, v7}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {v2}, Lcom/android/dx/dex/code/DalvInsn;->getRegisters()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2, v8}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v2}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-ne v1, v2, :cond_6

    .line 188
    .line 189
    new-instance v1, Lcom/android/dx/dex/code/SimpleInsn;

    .line 190
    .line 191
    sget-object v2, Lcom/android/dx/dex/code/Dops;->NOP:Lcom/android/dx/dex/code/Dop;

    .line 192
    .line 193
    sget-object v3, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 194
    .line 195
    invoke-direct {v1, v2, v0, v3}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 199
    .line 200
    .line 201
    :cond_6
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_7
    const-string p0, "Insn with result/move-result-pseudo mismatch "

    .line 206
    .line 207
    invoke-static {p1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_8
    new-instance p0, Ljava/lang/RuntimeException;

    .line 212
    .line 213
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    new-instance v0, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v1, "Expected BRANCH_THROW got "

    .line 220
    .line 221
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p0
.end method

.method public visitThrowingInsn(Lcom/android/dx/rop/code/ThrowingInsn;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lcom/android/dx/dex/code/RopToDop;->dopFor(Lcom/android/dx/rop/code/Insn;)Lcom/android/dx/dex/code/Dop;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x6

    .line 18
    if-ne v2, v3, :cond_2

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->getNextMoveResultPseudo()Lcom/android/dx/rop/code/RegisterSpec;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1}, Lcom/android/dx/dex/code/Dop;->hasResult()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x0

    .line 33
    :goto_0
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    iget-object v3, p0, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->lastAddress:Lcom/android/dx/dex/code/CodeAddress;

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Lcom/android/dx/dex/code/SimpleInsn;

    .line 41
    .line 42
    invoke-static {p1, v2}, Lcom/android/dx/dex/code/RopTranslator;->access$600(Lcom/android/dx/rop/code/Insn;Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {v3, v1, v0, p1}, Lcom/android/dx/dex/code/SimpleInsn;-><init>(Lcom/android/dx/dex/code/Dop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v3}, Lcom/android/dx/dex/code/RopTranslator$TranslationVisitor;->addOutput(Lcom/android/dx/dex/code/DalvInsn;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const-string p0, "Insn with result/move-result-pseudo mismatch"

    .line 54
    .line 55
    invoke-static {p1, p0}, Lcom/google/protobuf/飘花落叶言楪苏兰哲子世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 60
    .line 61
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method
