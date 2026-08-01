.class public Lcom/android/dx/ssa/Optimizer;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/Optimizer$OptionalStep;
    }
.end annotation


# static fields
.field private static advice:Lcom/android/dx/rop/code/TranslationAdvice; = null

.field private static preserveLocals:Z = true


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static debugDeadCodeRemover(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public static debugEdgeSplit(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->testEdgeSplit(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static debugNoRegisterAllocation(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/rop/code/RopMethod;",
            "IZZ",
            "Lcom/android/dx/rop/code/TranslationAdvice;",
            "Ljava/util/EnumSet<",
            "Lcom/android/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/android/dx/ssa/SsaMethod;"
        }
    .end annotation

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p5}, Lcom/android/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/android/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/android/dx/ssa/back/LivenessAnalyzer;->constructInterferenceGraph(Lcom/android/dx/ssa/SsaMethod;)Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static debugPhiPlacement(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->testPhiPlacement(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static debugRenaming(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static getAdvice()Lcom/android/dx/rop/code/TranslationAdvice;
    .locals 1

    .line 1
    sget-object v0, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getPreserveLocals()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    return v0
.end method

.method public static optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/rop/code/RopMethod;
    .locals 7

    .line 39
    const-class v0, Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 40
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v6

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    .line 41
    invoke-static/range {v1 .. v6}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/android/dx/rop/code/RopMethod;

    move-result-object p0

    return-object p0
.end method

.method public static optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/android/dx/rop/code/RopMethod;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/rop/code/RopMethod;",
            "IZZ",
            "Lcom/android/dx/rop/code/TranslationAdvice;",
            "Ljava/util/EnumSet<",
            "Lcom/android/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/android/dx/rop/code/RopMethod;"
        }
    .end annotation

    .line 1
    sput-boolean p3, Lcom/android/dx/ssa/Optimizer;->preserveLocals:Z

    .line 2
    .line 3
    sput-object p4, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-static {p3, p5}, Lcom/android/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/android/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    .line 10
    .line 11
    .line 12
    const/4 p4, 0x0

    .line 13
    invoke-static {p3, p4}, Lcom/android/dx/ssa/back/SsaToRop;->convertToRopMethod(Lcom/android/dx/ssa/SsaMethod;Z)Lcom/android/dx/rop/code/RopMethod;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    invoke-virtual {p4}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    sget-object v0, Lcom/android/dx/ssa/Optimizer;->advice:Lcom/android/dx/rop/code/TranslationAdvice;

    .line 26
    .line 27
    invoke-interface {v0}, Lcom/android/dx/rop/code/TranslationAdvice;->getMaxOptimalRegisterCount()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-le p4, v0, :cond_0

    .line 32
    .line 33
    invoke-static {p0, p1, p2, p5}, Lcom/android/dx/ssa/Optimizer;->optimizeMinimizeRegisters(Lcom/android/dx/rop/code/RopMethod;IZLjava/util/EnumSet;)Lcom/android/dx/rop/code/RopMethod;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    return-object p3
.end method

.method private static optimizeMinimizeRegisters(Lcom/android/dx/rop/code/RopMethod;IZLjava/util/EnumSet;)Lcom/android/dx/rop/code/RopMethod;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/rop/code/RopMethod;",
            "IZ",
            "Ljava/util/EnumSet<",
            "Lcom/android/dx/ssa/Optimizer$OptionalStep;",
            ">;)",
            "Lcom/android/dx/rop/code/RopMethod;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/android/dx/ssa/SsaConverter;->convertToSsaMethod(Lcom/android/dx/rop/code/RopMethod;IZ)Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p3}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lcom/android/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/android/dx/ssa/Optimizer;->runSsaFormSteps(Lcom/android/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-static {p0, p1}, Lcom/android/dx/ssa/back/SsaToRop;->convertToRopMethod(Lcom/android/dx/ssa/SsaMethod;Z)Lcom/android/dx/rop/code/RopMethod;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static runSsaFormSteps(Lcom/android/dx/ssa/SsaMethod;Ljava/util/EnumSet;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/dx/ssa/SsaMethod;",
            "Ljava/util/EnumSet<",
            "Lcom/android/dx/ssa/Optimizer$OptionalStep;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/android/dx/ssa/Optimizer$OptionalStep;->MOVE_PARAM_COMBINER:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lcom/android/dx/ssa/MoveParamCombiner;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/android/dx/ssa/Optimizer$OptionalStep;->SCCP:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Lcom/android/dx/ssa/SCCP;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 25
    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x1

    .line 30
    :goto_0
    sget-object v2, Lcom/android/dx/ssa/Optimizer$OptionalStep;->LITERAL_UPGRADE:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-static {p0}, Lcom/android/dx/ssa/LiteralOpUpgrader;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 42
    .line 43
    .line 44
    move v0, v1

    .line 45
    :cond_2
    sget-object v2, Lcom/android/dx/ssa/Optimizer$OptionalStep;->ESCAPE_ANALYSIS:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 46
    .line 47
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-static {p0}, Lcom/android/dx/ssa/EscapeAnalysis;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 60
    .line 61
    .line 62
    move v0, v1

    .line 63
    :cond_3
    sget-object v2, Lcom/android/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    invoke-static {p0}, Lcom/android/dx/ssa/ConstCollector;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move v1, v0

    .line 79
    :goto_1
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-static {p0}, Lcom/android/dx/ssa/DeadCodeRemover;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 82
    .line 83
    .line 84
    :cond_5
    invoke-static {p0}, Lcom/android/dx/ssa/PhiTypeResolver;->process(Lcom/android/dx/ssa/SsaMethod;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method
