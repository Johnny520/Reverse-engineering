.class public final Lcom/android/dx/cf/code/Ropper;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/Ropper$Subroutine;,
        Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;,
        Lcom/android/dx/cf/code/Ropper$CatchInfo;,
        Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;,
        Lcom/android/dx/cf/code/Ropper$SubroutineInliner;,
        Lcom/android/dx/cf/code/Ropper$LabelAllocator;
    }
.end annotation


# static fields
.field private static final PARAM_ASSIGNMENT:I = -0x1

.field private static final RETURN:I = -0x2

.field private static final SPECIAL_LABEL_COUNT:I = 0x7

.field private static final SYNCH_CATCH_1:I = -0x6

.field private static final SYNCH_CATCH_2:I = -0x7

.field private static final SYNCH_RETURN:I = -0x3

.field private static final SYNCH_SETUP_1:I = -0x4

.field private static final SYNCH_SETUP_2:I = -0x5


# instance fields
.field private final blocks:Lcom/android/dx/cf/code/ByteBlockList;

.field private final catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

.field private final exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

.field private hasSubroutines:Z

.field private final machine:Lcom/android/dx/cf/code/RopperMachine;

.field private final maxLabel:I

.field private final maxLocals:I

.field private final method:Lcom/android/dx/cf/code/ConcreteMethod;

.field private final result:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/BasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private final resultSubroutines:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/IntList;",
            ">;"
        }
    .end annotation
.end field

.field private final sim:Lcom/android/dx/cf/code/Simulator;

.field private final startFrames:[Lcom/android/dx/cf/code/Frame;

.field private final subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

.field private synchNeedsExceptionHandler:Z


# direct methods
.method private constructor <init>(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)V
    .locals 4

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
    if-eqz p2, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/android/dx/cf/code/BasicBlocker;->identifyBlocks(Lcom/android/dx/cf/code/ConcreteMethod;)Lcom/android/dx/cf/code/ByteBlockList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/android/dx/cf/code/Ropper;->blocks:Lcom/android/dx/cf/code/ByteBlockList;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/android/dx/util/LabeledList;->getMaxLabel()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxLocals()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    iput v2, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    .line 28
    .line 29
    new-instance v3, Lcom/android/dx/cf/code/RopperMachine;

    .line 30
    .line 31
    invoke-direct {v3, p0, p1, p2, p3}, Lcom/android/dx/cf/code/RopperMachine;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;)V

    .line 32
    .line 33
    .line 34
    iput-object v3, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 35
    .line 36
    new-instance p2, Lcom/android/dx/cf/code/Simulator;

    .line 37
    .line 38
    invoke-direct {p2, v3, p1, p4}, Lcom/android/dx/cf/code/Simulator;-><init>(Lcom/android/dx/cf/code/Machine;Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/dex/DexOptions;)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper;->sim:Lcom/android/dx/cf/code/Simulator;

    .line 42
    .line 43
    new-array p2, v1, [Lcom/android/dx/cf/code/Frame;

    .line 44
    .line 45
    iput-object p2, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 46
    .line 47
    new-array p3, v1, [Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 48
    .line 49
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 50
    .line 51
    new-instance p3, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    mul-int/lit8 p4, p4, 0x2

    .line 58
    .line 59
    add-int/lit8 p4, p4, 0xa

    .line 60
    .line 61
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 65
    .line 66
    new-instance p3, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    mul-int/lit8 p4, p4, 0x2

    .line 73
    .line 74
    add-int/lit8 p4, p4, 0xa

    .line 75
    .line 76
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 80
    .line 81
    new-array p3, v1, [Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 82
    .line 83
    iput-object p3, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 84
    .line 85
    const/4 p3, 0x0

    .line 86
    iput-boolean p3, p0, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 87
    .line 88
    new-instance p4, Lcom/android/dx/cf/code/Frame;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxStack()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    invoke-direct {p4, v2, p1}, Lcom/android/dx/cf/code/Frame;-><init>(II)V

    .line 95
    .line 96
    .line 97
    aput-object p4, p2, p3

    .line 98
    .line 99
    new-instance p1, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 100
    .line 101
    invoke-direct {p1, p0}, Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;-><init>(Lcom/android/dx/cf/code/Ropper;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper;->exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 105
    .line 106
    return-void

    .line 107
    :cond_0
    const-string p0, "advice == null"

    .line 108
    .line 109
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_1
    const-string p0, "method == null"

    .line 114
    .line 115
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v0
.end method

.method public static synthetic access$000(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->exceptionSetupLabelAllocator:Lcom/android/dx/cf/code/Ropper$ExceptionSetupLabelAllocator;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/android/dx/cf/code/Ropper;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1100(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->filterMoveReturnAddressInsns(Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$1200(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$202(Lcom/android/dx/cf/code/Ropper;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/android/dx/cf/code/Ropper;->hasSubroutines:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$300(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$400(Lcom/android/dx/cf/code/Ropper;IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$600(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$700(Lcom/android/dx/cf/code/Ropper;)Lcom/android/dx/cf/code/ConcreteMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/cf/code/Ropper;->addOrReplaceBlockNoDelete(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$900(Lcom/android/dx/cf/code/Ropper;I)Lcom/android/dx/cf/code/Ropper$Subroutine;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->subroutineFromRetBlock(I)Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "block == null"

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private addExceptionSetupBlocks()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/android/dx/cf/code/Ropper$CatchInfo;->getSetups()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 33
    .line 34
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v5}, Lcom/android/dx/rop/code/BasicBlock;->getFirstInsn()Lcom/android/dx/rop/code/Insn;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v6, Lcom/android/dx/rop/code/InsnList;

    .line 47
    .line 48
    const/4 v7, 0x2

    .line 49
    invoke-direct {v6, v7}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Lcom/android/dx/rop/code/PlainInsn;

    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getCaughtType()Lcom/android/dx/rop/type/Type;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v8}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    iget v9, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    .line 63
    .line 64
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getCaughtType()Lcom/android/dx/rop/type/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-static {v9, v10}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    sget-object v10, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 73
    .line 74
    invoke-direct {v7, v8, v5, v9, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6, v1, v7}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 78
    .line 79
    .line 80
    new-instance v7, Lcom/android/dx/rop/code/PlainInsn;

    .line 81
    .line 82
    sget-object v8, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 83
    .line 84
    const/4 v9, 0x0

    .line 85
    invoke-direct {v7, v8, v5, v9, v10}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 86
    .line 87
    .line 88
    const/4 v5, 0x1

    .line 89
    invoke-virtual {v6, v5, v7}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 93
    .line 94
    .line 95
    new-instance v5, Lcom/android/dx/rop/code/BasicBlock;

    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getLabel()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-direct {v5, v4, v6, v7, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 106
    .line 107
    .line 108
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 109
    .line 110
    aget-object v4, v4, v2

    .line 111
    .line 112
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-direct {p0, v5, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    return-void
.end method

.method private addOrReplaceBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-direct {p0, v1}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-direct {p0, v1}, Lcom/android/dx/cf/code/Ropper;->removeBlockAndSpecialSuccessors(I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    const-string p0, "block == null"

    .line 34
    .line 35
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return v0
.end method

.method private addOrReplaceBlockNoDelete(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-direct {p0, v1}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    :goto_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return v0

    .line 40
    :cond_1
    const-string p0, "block == null"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v0
.end method

.method private addReturnBlock()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/RopperMachine;->getReturnOp()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getReturnPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, -0x2

    .line 17
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    new-instance v3, Lcom/android/dx/rop/code/InsnList;

    .line 30
    .line 31
    invoke-direct {v3, v4}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v6, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 35
    .line 36
    sget-object v7, Lcom/android/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/android/dx/rop/code/Rop;

    .line 37
    .line 38
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-static {v8}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    sget-object v9, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 47
    .line 48
    invoke-direct {v6, v7, v1, v8, v9}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5, v6}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 55
    .line 56
    .line 57
    const/4 v6, -0x3

    .line 58
    invoke-direct {p0, v6}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    new-instance v7, Lcom/android/dx/rop/code/BasicBlock;

    .line 63
    .line 64
    invoke-static {v6}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-direct {v7, v2, v3, v8, v6}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 69
    .line 70
    .line 71
    sget-object v2, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 72
    .line 73
    invoke-direct {p0, v7, v2}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 74
    .line 75
    .line 76
    move v2, v6

    .line 77
    :cond_1
    new-instance v3, Lcom/android/dx/rop/code/InsnList;

    .line 78
    .line 79
    invoke-direct {v3, v4}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/android/dx/rop/code/Rop;->getSources()Lcom/android/dx/rop/type/TypeList;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-interface {v4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_2

    .line 91
    .line 92
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    invoke-interface {v4, v5}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v5, v4}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v4}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    :goto_0
    new-instance v6, Lcom/android/dx/rop/code/PlainInsn;

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    invoke-direct {v6, v0, v1, v7, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v5, v6}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 117
    .line 118
    .line 119
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 120
    .line 121
    sget-object v1, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 122
    .line 123
    const/4 v4, -0x1

    .line 124
    invoke-direct {v0, v2, v3, v1, v4}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, v0, v1}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method private addSetupBlocks()V
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getLocalVariables()Lcom/android/dx/cf/code/LocalVariableList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    new-instance v10, Lcom/android/dx/rop/code/InsnList;

    .line 29
    .line 30
    add-int/lit8 v3, v9, 0x1

    .line 31
    .line 32
    invoke-direct {v10, v3}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    move v11, v2

    .line 36
    move v12, v11

    .line 37
    :goto_0
    if-ge v11, v9, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v11}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 40
    .line 41
    .line 42
    move-result-object v13

    .line 43
    invoke-virtual {v0, v2, v12}, Lcom/android/dx/cf/code/LocalVariableList;->pcAndIndexToLocal(II)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    invoke-static {v12, v13}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :goto_1
    move-object v6, v3

    .line 54
    goto :goto_2

    .line 55
    :cond_0
    invoke-virtual {v3}, Lcom/android/dx/cf/code/LocalVariableList$Item;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v12, v13, v3}, Lcom/android/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    goto :goto_1

    .line 64
    :goto_2
    new-instance v3, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 65
    .line 66
    invoke-static {v13}, Lcom/android/dx/rop/code/Rops;->opMoveParam(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    sget-object v7, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 71
    .line 72
    invoke-static {v12}, Lcom/android/dx/rop/cst/CstInteger;->make(I)Lcom/android/dx/rop/cst/CstInteger;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-direct/range {v3 .. v8}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v10, v11, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v13}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/2addr v12, v3

    .line 87
    add-int/lit8 v11, v11, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance v0, Lcom/android/dx/rop/code/PlainInsn;

    .line 91
    .line 92
    sget-object v1, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 93
    .line 94
    sget-object v6, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    invoke-direct {v0, v1, v5, v11, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10, v9, v0}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    const/4 v3, -0x4

    .line 113
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    move v9, v3

    .line 118
    goto :goto_3

    .line 119
    :cond_2
    move v9, v2

    .line 120
    :goto_3
    new-instance v3, Lcom/android/dx/rop/code/BasicBlock;

    .line 121
    .line 122
    const/4 v4, -0x1

    .line 123
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    invoke-static {v9}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-direct {v3, v4, v10, v7, v9}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 132
    .line 133
    .line 134
    sget-object v10, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 135
    .line 136
    invoke-direct {p0, v3, v10}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 137
    .line 138
    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/4 v12, 0x2

    .line 150
    const/4 v13, 0x1

    .line 151
    if-eqz v3, :cond_3

    .line 152
    .line 153
    new-instance v3, Lcom/android/dx/rop/code/ThrowingCstInsn;

    .line 154
    .line 155
    sget-object v4, Lcom/android/dx/rop/code/Rops;->CONST_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 156
    .line 157
    sget-object v7, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 158
    .line 159
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ConcreteMethod;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    invoke-direct/range {v3 .. v8}, Lcom/android/dx/rop/code/ThrowingCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/Constant;)V

    .line 166
    .line 167
    .line 168
    new-instance v1, Lcom/android/dx/rop/code/InsnList;

    .line 169
    .line 170
    invoke-direct {v1, v13}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_3
    new-instance v14, Lcom/android/dx/rop/code/InsnList;

    .line 178
    .line 179
    invoke-direct {v14, v12}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 180
    .line 181
    .line 182
    new-instance v3, Lcom/android/dx/rop/code/PlainCstInsn;

    .line 183
    .line 184
    sget-object v4, Lcom/android/dx/rop/code/Rops;->MOVE_PARAM_OBJECT:Lcom/android/dx/rop/code/Rop;

    .line 185
    .line 186
    sget-object v8, Lcom/android/dx/rop/cst/CstInteger;->VALUE_0:Lcom/android/dx/rop/cst/CstInteger;

    .line 187
    .line 188
    move-object v7, v6

    .line 189
    move-object v6, v0

    .line 190
    invoke-direct/range {v3 .. v8}, Lcom/android/dx/rop/code/PlainCstInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/cst/Constant;)V

    .line 191
    .line 192
    .line 193
    move-object v6, v7

    .line 194
    invoke-virtual {v14, v2, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 195
    .line 196
    .line 197
    new-instance v3, Lcom/android/dx/rop/code/PlainInsn;

    .line 198
    .line 199
    invoke-direct {v3, v1, v5, v11, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v14, v13, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 203
    .line 204
    .line 205
    move-object v1, v14

    .line 206
    :goto_4
    const/4 v3, -0x5

    .line 207
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 212
    .line 213
    .line 214
    new-instance v4, Lcom/android/dx/rop/code/BasicBlock;

    .line 215
    .line 216
    invoke-static {v3}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 217
    .line 218
    .line 219
    move-result-object v7

    .line 220
    invoke-direct {v4, v9, v1, v7, v3}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 221
    .line 222
    .line 223
    invoke-direct {p0, v4, v10}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 224
    .line 225
    .line 226
    new-instance v1, Lcom/android/dx/rop/code/InsnList;

    .line 227
    .line 228
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_4

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_4
    move v12, v13

    .line 236
    :goto_5
    invoke-direct {v1, v12}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 237
    .line 238
    .line 239
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-eqz v4, :cond_5

    .line 244
    .line 245
    new-instance v4, Lcom/android/dx/rop/code/PlainInsn;

    .line 246
    .line 247
    invoke-static {v0}, Lcom/android/dx/rop/code/Rops;->opMoveResultPseudo(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    invoke-direct {v4, v7, v5, v0, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2, v4}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 255
    .line 256
    .line 257
    :cond_5
    new-instance v4, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 258
    .line 259
    sget-object v6, Lcom/android/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/android/dx/rop/code/Rop;

    .line 260
    .line 261
    invoke-static {v0}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    sget-object v7, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 266
    .line 267
    invoke-direct {v4, v6, v5, v0, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 268
    .line 269
    .line 270
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isStatic()Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    invoke-virtual {v1, v0, v4}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 278
    .line 279
    .line 280
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 281
    .line 282
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    invoke-direct {v0, v3, v1, v4, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 287
    .line 288
    .line 289
    invoke-direct {p0, v0, v10}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 290
    .line 291
    .line 292
    :cond_6
    return-void
.end method

.method private addSynchExceptionHandlerBlock()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/ConcreteMethod;->makeSourcePosistion(I)Lcom/android/dx/rop/code/SourcePosition;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Lcom/android/dx/rop/code/InsnList;

    .line 20
    .line 21
    const/4 v5, 0x2

    .line 22
    invoke-direct {v4, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lcom/android/dx/rop/code/PlainInsn;

    .line 26
    .line 27
    invoke-static {v2}, Lcom/android/dx/rop/code/Rops;->opMoveException(Lcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/Rop;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v6, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 32
    .line 33
    invoke-direct {v5, v2, v0, v3, v6}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v1, v5}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 40
    .line 41
    sget-object v5, Lcom/android/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/android/dx/rop/code/Rop;

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-static {v6}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    sget-object v7, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    .line 52
    .line 53
    invoke-direct {v2, v5, v0, v6, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x1

    .line 57
    invoke-virtual {v4, v5, v2}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 61
    .line 62
    .line 63
    const/4 v2, -0x7

    .line 64
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    new-instance v6, Lcom/android/dx/rop/code/BasicBlock;

    .line 69
    .line 70
    const/4 v8, -0x6

    .line 71
    invoke-direct {p0, v8}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-direct {v6, v8, v4, v9, v2}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 80
    .line 81
    .line 82
    sget-object v4, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    .line 83
    .line 84
    invoke-direct {p0, v6, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, Lcom/android/dx/rop/code/InsnList;

    .line 88
    .line 89
    invoke-direct {v6, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v5, Lcom/android/dx/rop/code/ThrowingInsn;

    .line 93
    .line 94
    sget-object v8, Lcom/android/dx/rop/code/Rops;->THROW:Lcom/android/dx/rop/code/Rop;

    .line 95
    .line 96
    invoke-static {v3}, Lcom/android/dx/rop/code/RegisterSpecList;->make(Lcom/android/dx/rop/code/RegisterSpec;)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v5, v8, v0, v3, v7}, Lcom/android/dx/rop/code/ThrowingInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v1, v5}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lcom/android/dx/rop/code/BasicBlock;

    .line 110
    .line 111
    const/4 v1, -0x1

    .line 112
    invoke-direct {v0, v2, v6, v4, v1}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p0, v0, v4}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/android/dx/cf/code/Ropper;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/android/dx/cf/code/Ropper;-><init>(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->doit()V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->getRopMethod()Lcom/android/dx/rop/code/RopMethod;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p3, "...while working on method "

    .line 18
    .line 19
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->toHuman()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method private deleteUnreachableBlocks()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    const/4 v1, -0x1

    .line 18
    invoke-direct {p0, v1}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, Lcom/android/dx/cf/code/Ropper$2;

    .line 23
    .line 24
    invoke-direct {v2, p0, v0}, Lcom/android/dx/cf/code/Ropper$2;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v1, v2}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->sort()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-int/lit8 v1, v1, -0x1

    .line 40
    .line 41
    :goto_0
    if-ltz v1, :cond_1

    .line 42
    .line 43
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->indexOf(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-gez v2, :cond_0

    .line 60
    .line 61
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
.end method

.method private doit()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/util/Bits;->makeBitSet(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addSetupBlocks()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->setFirstFrame()V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0, v1}, Lcom/android/dx/util/Bits;->findFirst([II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-gez v2, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addReturnBlock()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addSynchExceptionHandlerBlock()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->addExceptionSetupBlocks()V

    .line 30
    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/android/dx/cf/code/Ropper;->hasSubroutines:Z

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->inlineSubroutines()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-static {v0, v2}, Lcom/android/dx/util/Bits;->clear([II)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->blocks:Lcom/android/dx/cf/code/ByteBlockList;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, Lcom/android/dx/cf/code/ByteBlockList;->labelToBlock(I)Lcom/android/dx/cf/code/ByteBlock;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 50
    .line 51
    aget-object v4, v4, v2

    .line 52
    .line 53
    :try_start_0
    invoke-direct {p0, v3, v4, v0}, Lcom/android/dx/cf/code/Ropper;->processBlock(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "...while working on block "

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p0, v0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p0
.end method

.method private filterMoveReturnAddressInsns(Lcom/android/dx/rop/code/InsnList;)Lcom/android/dx/rop/code/InsnList;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v1, p0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v4, Lcom/android/dx/rop/code/Rops;->MOVE_RETURN_ADDRESS:Lcom/android/dx/rop/code/Rop;

    .line 19
    .line 20
    if-eq v3, v4, :cond_0

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    if-ne v2, p0, :cond_2

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    new-instance v1, Lcom/android/dx/rop/code/InsnList;

    .line 31
    .line 32
    invoke-direct {v1, v2}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    move v2, v0

    .line 36
    :goto_1
    if-ge v0, p0, :cond_4

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lcom/android/dx/rop/code/InsnList;->get(I)Lcom/android/dx/rop/code/Insn;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v5, Lcom/android/dx/rop/code/Rops;->MOVE_RETURN_ADDRESS:Lcom/android/dx/rop/code/Rop;

    .line 47
    .line 48
    if-eq v4, v5, :cond_3

    .line 49
    .line 50
    add-int/lit8 v4, v2, 0x1

    .line 51
    .line 52
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 53
    .line 54
    .line 55
    move v2, v4

    .line 56
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method private forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/util/BitSet;

    .line 6
    .line 7
    iget v1, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V
    .locals 5

    .line 1
    invoke-interface {p2, p1}, Lcom/android/dx/rop/code/BasicBlock$Visitor;->visitBlock(Lcom/android/dx/rop/code/BasicBlock;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p3, v0}, Ljava/util/BitSet;->set(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    if-ge v2, v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p3, v3}, Ljava/util/BitSet;->get(I)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    if-lez v2, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-ltz v3, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/android/dx/rop/code/BasicBlock;

    .line 55
    .line 56
    invoke-direct {p0, v3, p2, p3}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst0(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/rop/code/BasicBlock$Visitor;Ljava/util/BitSet;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-void
.end method

.method private getAvailableLabel()I
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getMinimumUnreservedLabel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lt v1, v0, :cond_0

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
.end method

.method private getMinimumUnreservedLabel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    add-int/lit8 p0, p0, 0x7

    .line 15
    .line 16
    return p0
.end method

.method private getNormalRegCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLocals:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getMaxStack()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    add-int/2addr p0, v0

    .line 10
    return p0
.end method

.method private getRopMethod()Lcom/android/dx/rop/code/RopMethod;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lcom/android/dx/rop/code/BasicBlockList;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/android/dx/rop/code/BasicBlockList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/android/dx/rop/code/BasicBlock;

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/rop/code/BasicBlockList;->set(ILcom/android/dx/rop/code/BasicBlock;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/android/dx/rop/code/RopMethod;

    .line 33
    .line 34
    const/4 v2, -0x1

    .line 35
    invoke-direct {p0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-direct {v0, v1, p0}, Lcom/android/dx/rop/code/RopMethod;-><init>(Lcom/android/dx/rop/code/BasicBlockList;I)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method private getSpecialLabel(I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/Ropper;->maxLabel:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    not-int p1, p1

    .line 15
    add-int/2addr p0, p1

    .line 16
    return p0
.end method

.method private getSynchReg()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getNormalRegCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ge p0, v0, :cond_0

    .line 7
    .line 8
    move p0, v0

    .line 9
    :cond_0
    sget-object v0, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private inlineSubroutines()V
    .locals 8

    .line 1
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lcom/android/dx/cf/code/Ropper$1;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0}, Lcom/android/dx/cf/code/Ropper$1;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/util/IntList;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v2, v1}, Lcom/android/dx/cf/code/Ropper;->forEachNonSubBlockDepthFirst(ILcom/android/dx/rop/code/BasicBlock$Visitor;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    new-instance v3, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    move v4, v2

    .line 26
    :goto_0
    if-ge v4, v1, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v2

    .line 36
    :goto_1
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-ge v1, v4, :cond_2

    .line 43
    .line 44
    iget-object v4, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lcom/android/dx/rop/code/BasicBlock;

    .line 51
    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    iget-object v5, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lcom/android/dx/util/IntList;

    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_3
    if-ge v2, v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    new-instance v5, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;

    .line 84
    .line 85
    new-instance v6, Lcom/android/dx/cf/code/Ropper$LabelAllocator;

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    invoke-direct {v6, v7}, Lcom/android/dx/cf/code/Ropper$LabelAllocator;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v5, p0, v6, v3}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$LabelAllocator;Ljava/util/ArrayList;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/Ropper;->labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v5, v4}, Lcom/android/dx/cf/code/Ropper$SubroutineInliner;->inlineSubroutineCalledFrom(Lcom/android/dx/rop/code/BasicBlock;)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->deleteUnreachableBlocks()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method private isStatic()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    and-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private isSubroutineCaller(Lcom/android/dx/rop/code/BasicBlock;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/android/dx/util/IntList;->get(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 20
    .line 21
    array-length v1, p0

    .line 22
    if-ge p1, v1, :cond_1

    .line 23
    .line 24
    aget-object p0, p0, p1

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    return v2
.end method

.method private isSynchronized()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/cf/code/ConcreteMethod;->getAccessFlags()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    and-int/lit8 p0, p0, 0x20

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method private labelToBlock(I)Lcom/android/dx/rop/code/BasicBlock;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/android/dx/rop/code/BasicBlock;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, "no such label "

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method private labelToResultIndex(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/android/dx/rop/code/BasicBlock;->getLabel()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v2, p1, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, -0x1

    .line 29
    return p0
.end method

.method private mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 2
    .line 3
    aget-object v1, v0, p1

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    invoke-virtual {p3}, Lcom/android/dx/cf/code/Ropper$Subroutine;->getStartBlock()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {v1, p4, p3, p2}, Lcom/android/dx/cf/code/Frame;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/Frame;II)Lcom/android/dx/cf/code/Frame;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v1, p4}, Lcom/android/dx/cf/code/Frame;->mergeWith(Lcom/android/dx/cf/code/Frame;)Lcom/android/dx/cf/code/Frame;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    if-eq p2, v1, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 25
    .line 26
    aput-object p2, p0, p1

    .line 27
    .line 28
    invoke-static {p5, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void

    .line 32
    :cond_2
    if-eqz p3, :cond_3

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2}, Lcom/android/dx/cf/code/Frame;->makeNewSubroutineStartFrame(II)Lcom/android/dx/cf/code/Frame;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    aput-object p0, v0, p1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    aput-object p4, v0, p1

    .line 42
    .line 43
    :goto_1
    invoke-static {p5, p1}, Lcom/android/dx/util/Bits;->set([II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private processBlock(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;[I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/code/ByteBlock;->getCatches()Lcom/android/dx/cf/code/ByteCatchList;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget-object v1, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 8
    .line 9
    invoke-virtual {v6}, Lcom/android/dx/cf/code/ByteCatchList;->toRopCatchList()Lcom/android/dx/rop/type/TypeList;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/RopperMachine;->startBlock(Lcom/android/dx/rop/type/TypeList;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, Lcom/android/dx/cf/code/Frame;->copy()Lcom/android/dx/cf/code/Frame;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v1, v0, Lcom/android/dx/cf/code/Ropper;->sim:Lcom/android/dx/cf/code/Simulator;

    .line 21
    .line 22
    move-object/from16 v7, p1

    .line 23
    .line 24
    invoke-virtual {v1, v7, v4}, Lcom/android/dx/cf/code/Simulator;->simulate(Lcom/android/dx/cf/code/ByteBlock;Lcom/android/dx/cf/code/Frame;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/android/dx/cf/code/Frame;->setImmutable()V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getExtraBlockCount()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    iget-object v1, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/android/dx/cf/code/RopperMachine;->getInsns()Ljava/util/ArrayList;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-virtual {v6}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->hasJsr()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v13, 0x1

    .line 61
    const/4 v14, 0x0

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1, v13}, Lcom/android/dx/util/IntList;->get(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 69
    .line 70
    aget-object v5, v3, v2

    .line 71
    .line 72
    if-nez v5, :cond_0

    .line 73
    .line 74
    new-instance v5, Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 75
    .line 76
    invoke-direct {v5, v0, v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;I)V

    .line 77
    .line 78
    .line 79
    aput-object v5, v3, v2

    .line 80
    .line 81
    :cond_0
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 82
    .line 83
    aget-object v3, v3, v2

    .line 84
    .line 85
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-virtual {v3, v5}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addCallerBlock(I)V

    .line 90
    .line 91
    .line 92
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 93
    .line 94
    aget-object v2, v3, v2

    .line 95
    .line 96
    move-object/from16 v5, p3

    .line 97
    .line 98
    move-object v15, v1

    .line 99
    move-object v3, v2

    .line 100
    move v1, v13

    .line 101
    goto :goto_2

    .line 102
    :cond_1
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->hasRet()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    invoke-virtual {v3}, Lcom/android/dx/cf/code/RopperMachine;->getReturnAddress()Lcom/android/dx/cf/code/ReturnAddress;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Lcom/android/dx/cf/code/ReturnAddress;->getSubroutineAddress()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 121
    .line 122
    aget-object v3, v2, v1

    .line 123
    .line 124
    if-nez v3, :cond_2

    .line 125
    .line 126
    new-instance v3, Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 127
    .line 128
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-direct {v3, v0, v1, v5}, Lcom/android/dx/cf/code/Ropper$Subroutine;-><init>(Lcom/android/dx/cf/code/Ropper;II)V

    .line 133
    .line 134
    .line 135
    aput-object v3, v2, v1

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_2
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v3, v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;->addRetBlock(I)V

    .line 143
    .line 144
    .line 145
    :goto_0
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 146
    .line 147
    aget-object v2, v2, v1

    .line 148
    .line 149
    invoke-virtual {v2}, Lcom/android/dx/cf/code/Ropper$Subroutine;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 154
    .line 155
    aget-object v1, v3, v1

    .line 156
    .line 157
    move-object/from16 v5, p3

    .line 158
    .line 159
    invoke-virtual {v1, v4, v5}, Lcom/android/dx/cf/code/Ropper$Subroutine;->mergeToSuccessors(Lcom/android/dx/cf/code/Frame;[I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Lcom/android/dx/util/IntList;->size()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    move-object v15, v2

    .line 167
    :goto_1
    move-object v3, v14

    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move-object/from16 v5, p3

    .line 170
    .line 171
    invoke-virtual {v3}, Lcom/android/dx/cf/code/RopperMachine;->wereCatchesUsed()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_4

    .line 176
    .line 177
    move-object v15, v1

    .line 178
    move v1, v11

    .line 179
    goto :goto_1

    .line 180
    :cond_4
    move-object v15, v1

    .line 181
    move-object v3, v14

    .line 182
    const/4 v1, 0x0

    .line 183
    :goto_2
    invoke-virtual {v15}, Lcom/android/dx/util/IntList;->size()I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    :goto_3
    if-ge v1, v2, :cond_5

    .line 188
    .line 189
    move v12, v1

    .line 190
    invoke-virtual {v15, v12}, Lcom/android/dx/util/IntList;->get(I)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    move/from16 v16, v2

    .line 195
    .line 196
    :try_start_0
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    .line 202
    .line 203
    move-object v1, v4

    .line 204
    add-int/lit8 v2, v12, 0x1

    .line 205
    .line 206
    move-object/from16 v5, p3

    .line 207
    .line 208
    move-object v4, v1

    .line 209
    move v1, v2

    .line 210
    move/from16 v2, v16

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :catch_0
    move-exception v0

    .line 214
    move v2, v1

    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v3, "...while merging to block "

    .line 218
    .line 219
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v0

    .line 237
    :cond_5
    move/from16 v16, v2

    .line 238
    .line 239
    move-object v1, v4

    .line 240
    if-nez v16, :cond_6

    .line 241
    .line 242
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 243
    .line 244
    invoke-virtual {v2}, Lcom/android/dx/cf/code/RopperMachine;->returns()Z

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    if-eqz v2, :cond_6

    .line 249
    .line 250
    const/4 v2, -0x2

    .line 251
    invoke-direct {v0, v2}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-static {v2}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 256
    .line 257
    .line 258
    move-result-object v15

    .line 259
    move v2, v13

    .line 260
    goto :goto_4

    .line 261
    :cond_6
    move/from16 v2, v16

    .line 262
    .line 263
    :goto_4
    if-nez v2, :cond_8

    .line 264
    .line 265
    const/4 v3, -0x1

    .line 266
    :cond_7
    :goto_5
    move v12, v3

    .line 267
    goto :goto_6

    .line 268
    :cond_8
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 269
    .line 270
    invoke-virtual {v3}, Lcom/android/dx/cf/code/RopperMachine;->getPrimarySuccessorIndex()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-ltz v3, :cond_7

    .line 275
    .line 276
    invoke-virtual {v15, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    goto :goto_5

    .line 281
    :goto_6
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_9

    .line 286
    .line 287
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->machine:Lcom/android/dx/cf/code/RopperMachine;

    .line 288
    .line 289
    invoke-virtual {v3}, Lcom/android/dx/cf/code/RopperMachine;->canThrow()Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_9

    .line 294
    .line 295
    move/from16 v16, v13

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_9
    const/16 v16, 0x0

    .line 299
    .line 300
    :goto_7
    if-nez v16, :cond_b

    .line 301
    .line 302
    if-eqz v11, :cond_a

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_a
    move-object/from16 v18, v1

    .line 306
    .line 307
    goto/16 :goto_d

    .line 308
    .line 309
    :cond_b
    :goto_8
    new-instance v15, Lcom/android/dx/util/IntList;

    .line 310
    .line 311
    invoke-direct {v15, v2}, Lcom/android/dx/util/IntList;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const/4 v2, 0x0

    .line 315
    const/4 v3, 0x0

    .line 316
    :goto_9
    if-ge v2, v11, :cond_e

    .line 317
    .line 318
    invoke-virtual {v6, v2}, Lcom/android/dx/cf/code/ByteCatchList;->get(I)Lcom/android/dx/cf/code/ByteCatchList$Item;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-virtual {v4}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getExceptionClass()Lcom/android/dx/rop/cst/CstType;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v4}, Lcom/android/dx/cf/code/ByteCatchList$Item;->getHandlerPc()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    sget-object v13, Lcom/android/dx/rop/cst/CstType;->OBJECT:Lcom/android/dx/rop/cst/CstType;

    .line 331
    .line 332
    if-ne v5, v13, :cond_c

    .line 333
    .line 334
    const/4 v13, 0x1

    .line 335
    goto :goto_a

    .line 336
    :cond_c
    const/4 v13, 0x0

    .line 337
    :goto_a
    or-int/2addr v13, v3

    .line 338
    move v3, v4

    .line 339
    invoke-virtual {v1, v5}, Lcom/android/dx/cf/code/Frame;->makeExceptionHandlerStartFrame(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/cf/code/Frame;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    move/from16 v17, v2

    .line 344
    .line 345
    :try_start_1
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 346
    .line 347
    .line 348
    move-result v2
    :try_end_1
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_1 .. :try_end_1} :catch_2

    .line 349
    move-object/from16 v18, v1

    .line 350
    .line 351
    move v1, v3

    .line 352
    const/4 v3, 0x0

    .line 353
    move-object/from16 v19, v5

    .line 354
    .line 355
    move-object/from16 v5, p3

    .line 356
    .line 357
    :try_start_2
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/cf/code/Ropper;->mergeAndWorkAsNecessary(IILcom/android/dx/cf/code/Ropper$Subroutine;Lcom/android/dx/cf/code/Frame;[I)V
    :try_end_2
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_2 .. :try_end_2} :catch_1

    .line 358
    .line 359
    .line 360
    iget-object v2, v0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 361
    .line 362
    aget-object v2, v2, v1

    .line 363
    .line 364
    if-nez v2, :cond_d

    .line 365
    .line 366
    new-instance v2, Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 367
    .line 368
    invoke-direct {v2, v0, v14}, Lcom/android/dx/cf/code/Ropper$CatchInfo;-><init>(Lcom/android/dx/cf/code/Ropper;Lcom/android/dx/cf/code/Ropper$1;)V

    .line 369
    .line 370
    .line 371
    iget-object v3, v0, Lcom/android/dx/cf/code/Ropper;->catchInfos:[Lcom/android/dx/cf/code/Ropper$CatchInfo;

    .line 372
    .line 373
    aput-object v2, v3, v1

    .line 374
    .line 375
    :cond_d
    invoke-virtual/range {v19 .. v19}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-virtual {v2, v1}, Lcom/android/dx/cf/code/Ropper$CatchInfo;->getSetup(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v1}, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->getLabel()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-virtual {v15, v1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 388
    .line 389
    .line 390
    add-int/lit8 v2, v17, 0x1

    .line 391
    .line 392
    move v3, v13

    .line 393
    move-object/from16 v1, v18

    .line 394
    .line 395
    const/4 v13, 0x1

    .line 396
    goto :goto_9

    .line 397
    :catch_1
    move-exception v0

    .line 398
    goto :goto_b

    .line 399
    :catch_2
    move-exception v0

    .line 400
    move v1, v3

    .line 401
    :goto_b
    new-instance v2, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v3, "...while merging exception to block "

    .line 404
    .line 405
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    throw v0

    .line 423
    :cond_e
    move-object/from16 v18, v1

    .line 424
    .line 425
    if-eqz v16, :cond_10

    .line 426
    .line 427
    if-nez v3, :cond_10

    .line 428
    .line 429
    const/4 v1, -0x6

    .line 430
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/Ropper;->getSpecialLabel(I)I

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    invoke-virtual {v15, v1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 435
    .line 436
    .line 437
    const/4 v1, 0x1

    .line 438
    iput-boolean v1, v0, Lcom/android/dx/cf/code/Ropper;->synchNeedsExceptionHandler:Z

    .line 439
    .line 440
    sub-int v2, v10, v8

    .line 441
    .line 442
    sub-int/2addr v2, v1

    .line 443
    :goto_c
    if-ge v2, v10, :cond_10

    .line 444
    .line 445
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    check-cast v1, Lcom/android/dx/rop/code/Insn;

    .line 450
    .line 451
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->canThrow()Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-eqz v3, :cond_f

    .line 456
    .line 457
    sget-object v3, Lcom/android/dx/rop/type/Type;->OBJECT:Lcom/android/dx/rop/type/Type;

    .line 458
    .line 459
    invoke-virtual {v1, v3}, Lcom/android/dx/rop/code/Insn;->withAddedCatch(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Insn;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-virtual {v9, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 467
    .line 468
    goto :goto_c

    .line 469
    :cond_10
    if-ltz v12, :cond_11

    .line 470
    .line 471
    invoke-virtual {v15, v12}, Lcom/android/dx/util/IntList;->add(I)V

    .line 472
    .line 473
    .line 474
    :cond_11
    invoke-virtual {v15}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 475
    .line 476
    .line 477
    :goto_d
    invoke-virtual {v15, v12}, Lcom/android/dx/util/IntList;->indexOf(I)I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    :goto_e
    if-lez v8, :cond_15

    .line 482
    .line 483
    add-int/lit8 v10, v10, -0x1

    .line 484
    .line 485
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    check-cast v2, Lcom/android/dx/rop/code/Insn;

    .line 490
    .line 491
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {v3}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    const/4 v4, 0x1

    .line 500
    if-ne v3, v4, :cond_12

    .line 501
    .line 502
    const/4 v3, 0x1

    .line 503
    goto :goto_f

    .line 504
    :cond_12
    const/4 v3, 0x0

    .line 505
    :goto_f
    new-instance v4, Lcom/android/dx/rop/code/InsnList;

    .line 506
    .line 507
    if-eqz v3, :cond_13

    .line 508
    .line 509
    const/4 v5, 0x2

    .line 510
    goto :goto_10

    .line 511
    :cond_13
    const/4 v5, 0x1

    .line 512
    :goto_10
    invoke-direct {v4, v5}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 513
    .line 514
    .line 515
    const/4 v5, 0x0

    .line 516
    invoke-virtual {v4, v5, v2}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 517
    .line 518
    .line 519
    if-eqz v3, :cond_14

    .line 520
    .line 521
    new-instance v3, Lcom/android/dx/rop/code/PlainInsn;

    .line 522
    .line 523
    sget-object v6, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 524
    .line 525
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    sget-object v11, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 530
    .line 531
    invoke-direct {v3, v6, v2, v14, v11}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 532
    .line 533
    .line 534
    const/4 v2, 0x1

    .line 535
    invoke-virtual {v4, v2, v3}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 536
    .line 537
    .line 538
    invoke-static {v12}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    goto :goto_11

    .line 543
    :cond_14
    move-object v2, v15

    .line 544
    :goto_11
    invoke-virtual {v4}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 545
    .line 546
    .line 547
    invoke-direct {v0}, Lcom/android/dx/cf/code/Ropper;->getAvailableLabel()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    new-instance v6, Lcom/android/dx/rop/code/BasicBlock;

    .line 552
    .line 553
    invoke-direct {v6, v3, v4, v2, v12}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v18 .. v18}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-direct {v0, v6, v2}, Lcom/android/dx/cf/code/Ropper;->addBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v15}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 564
    .line 565
    .line 566
    move-result-object v15

    .line 567
    invoke-virtual {v15, v1, v3}, Lcom/android/dx/util/IntList;->set(II)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v15}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 571
    .line 572
    .line 573
    add-int/lit8 v8, v8, -0x1

    .line 574
    .line 575
    move v12, v3

    .line 576
    goto :goto_e

    .line 577
    :cond_15
    const/4 v5, 0x0

    .line 578
    if-nez v10, :cond_16

    .line 579
    .line 580
    move-object v1, v14

    .line 581
    goto :goto_12

    .line 582
    :cond_16
    add-int/lit8 v1, v10, -0x1

    .line 583
    .line 584
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    check-cast v1, Lcom/android/dx/rop/code/Insn;

    .line 589
    .line 590
    :goto_12
    if-eqz v1, :cond_17

    .line 591
    .line 592
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    invoke-virtual {v2}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 597
    .line 598
    .line 599
    move-result v2

    .line 600
    const/4 v4, 0x1

    .line 601
    if-ne v2, v4, :cond_19

    .line 602
    .line 603
    :cond_17
    if-nez v1, :cond_18

    .line 604
    .line 605
    sget-object v1, Lcom/android/dx/rop/code/SourcePosition;->NO_INFO:Lcom/android/dx/rop/code/SourcePosition;

    .line 606
    .line 607
    goto :goto_13

    .line 608
    :cond_18
    invoke-virtual {v1}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    :goto_13
    new-instance v2, Lcom/android/dx/rop/code/PlainInsn;

    .line 613
    .line 614
    sget-object v3, Lcom/android/dx/rop/code/Rops;->GOTO:Lcom/android/dx/rop/code/Rop;

    .line 615
    .line 616
    sget-object v4, Lcom/android/dx/rop/code/RegisterSpecList;->EMPTY:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 617
    .line 618
    invoke-direct {v2, v3, v1, v14, v4}, Lcom/android/dx/rop/code/PlainInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    add-int/lit8 v10, v10, 0x1

    .line 625
    .line 626
    :cond_19
    new-instance v1, Lcom/android/dx/rop/code/InsnList;

    .line 627
    .line 628
    invoke-direct {v1, v10}, Lcom/android/dx/rop/code/InsnList;-><init>(I)V

    .line 629
    .line 630
    .line 631
    :goto_14
    if-ge v5, v10, :cond_1a

    .line 632
    .line 633
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, Lcom/android/dx/rop/code/Insn;

    .line 638
    .line 639
    invoke-virtual {v1, v5, v2}, Lcom/android/dx/rop/code/InsnList;->set(ILcom/android/dx/rop/code/Insn;)V

    .line 640
    .line 641
    .line 642
    add-int/lit8 v5, v5, 0x1

    .line 643
    .line 644
    goto :goto_14

    .line 645
    :cond_1a
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 646
    .line 647
    .line 648
    new-instance v2, Lcom/android/dx/rop/code/BasicBlock;

    .line 649
    .line 650
    invoke-virtual {v7}, Lcom/android/dx/cf/code/ByteBlock;->getLabel()I

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    invoke-direct {v2, v3, v1, v15, v12}, Lcom/android/dx/rop/code/BasicBlock;-><init>(ILcom/android/dx/rop/code/InsnList;Lcom/android/dx/util/IntList;I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v18 .. v18}, Lcom/android/dx/cf/code/Frame;->getSubroutines()Lcom/android/dx/util/IntList;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    invoke-direct {v0, v2, v1}, Lcom/android/dx/cf/code/Ropper;->addOrReplaceBlock(Lcom/android/dx/rop/code/BasicBlock;Lcom/android/dx/util/IntList;)Z

    .line 662
    .line 663
    .line 664
    return-void
.end method

.method private removeBlockAndSpecialSuccessors(I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getMinimumUnreservedLabel()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/android/dx/rop/code/BasicBlock;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/android/dx/rop/code/BasicBlock;->getSuccessors()Lcom/android/dx/util/IntList;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->result:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-object v3, p0, Lcom/android/dx/cf/code/Ropper;->resultSubroutines:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    :goto_0
    if-ge p1, v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lcom/android/dx/util/IntList;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-lt v3, v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0, v3}, Lcom/android/dx/cf/code/Ropper;->labelToResultIndex(I)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ltz v4, :cond_0

    .line 45
    .line 46
    invoke-direct {p0, v4}, Lcom/android/dx/cf/code/Ropper;->removeBlockAndSpecialSuccessors(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string p1, "Invalid label "

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return-void
.end method

.method private setFirstFrame()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->method:Lcom/android/dx/cf/code/ConcreteMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ConcreteMethod;->getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aget-object v1, v1, v2

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v1, v0}, Lcom/android/dx/cf/code/Frame;->initializeWithParameters(Lcom/android/dx/rop/type/StdTypeList;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper;->startFrames:[Lcom/android/dx/cf/code/Frame;

    .line 20
    .line 21
    aget-object p0, p0, v2

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->setImmutable()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private subroutineFromRetBlock(I)Lcom/android/dx/cf/code/Ropper$Subroutine;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    :goto_0
    if-ltz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/android/dx/cf/code/Ropper;->subroutines:[Lcom/android/dx/cf/code/Ropper$Subroutine;

    .line 9
    .line 10
    aget-object v1, v1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-static {v1}, Lcom/android/dx/cf/code/Ropper$Subroutine;->access$1300(Lcom/android/dx/cf/code/Ropper$Subroutine;)Ljava/util/BitSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2, p1}, Ljava/util/BitSet;->get(I)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method


# virtual methods
.method public getFirstTempStackReg()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->getNormalRegCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/android/dx/cf/code/Ropper;->isSynchronized()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    :cond_0
    return v0
.end method
