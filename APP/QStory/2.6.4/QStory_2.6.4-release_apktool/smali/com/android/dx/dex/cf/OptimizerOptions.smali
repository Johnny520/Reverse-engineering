.class public Lcom/android/dx/dex/cf/OptimizerOptions;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private dontOptimizeList:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private optimizeList:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private optimizeListsLoaded:Z


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

.method private static loadStringsFromFile(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Ljava/io/FileReader;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/io/BufferedReader;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :goto_1
    const-string v1, "Error with optimize list: "

    .line 33
    .line 34
    invoke-static {v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method


# virtual methods
.method public compareOptimizerStep(Lcom/android/dx/rop/code/RopMethod;IZLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/rop/code/RopMethod;)V
    .locals 6

    .line 1
    const-class p0, Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    sget-object p0, Lcom/android/dx/ssa/Optimizer$OptionalStep;->CONST_COLLECTOR:Lcom/android/dx/ssa/Optimizer$OptionalStep;

    .line 8
    .line 9
    invoke-virtual {v5, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-boolean v3, p4, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    move v1, p2

    .line 16
    move v2, p3

    .line 17
    move-object v4, p5

    .line 18
    invoke-static/range {v0 .. v5}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;Ljava/util/EnumSet;)Lcom/android/dx/rop/code/RopMethod;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p6}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/android/dx/rop/code/BasicBlockList;->getEffectiveInstructionCount()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Lcom/android/dx/rop/code/BasicBlockList;->getEffectiveInstructionCount()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    sget-object p3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 39
    .line 40
    invoke-virtual {p6}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    invoke-virtual {p4}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 53
    .line 54
    .line 55
    move-result-object p4

    .line 56
    invoke-virtual {p4}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    invoke-virtual {p4}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    invoke-virtual {p6}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 73
    .line 74
    .line 75
    move-result-object p5

    .line 76
    invoke-virtual {p5}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 77
    .line 78
    .line 79
    move-result p5

    .line 80
    sub-int/2addr p4, p5

    .line 81
    int-to-float p4, p4

    .line 82
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RopMethod;->getBlocks()Lcom/android/dx/rop/code/BasicBlockList;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Lcom/android/dx/rop/code/BasicBlockList;->getRegCount()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    int-to-float p0, p0

    .line 91
    div-float/2addr p4, p0

    .line 92
    float-to-double p4, p4

    .line 93
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 94
    .line 95
    mul-double/2addr p4, v2

    .line 96
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    move-wide p4, v2

    .line 101
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    sub-int p1, p2, p1

    .line 110
    .line 111
    int-to-float p1, p1

    .line 112
    int-to-float p2, p2

    .line 113
    div-float/2addr p1, p2

    .line 114
    float-to-double p1, p1

    .line 115
    mul-double/2addr p1, p4

    .line 116
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    move-object v2, p0

    .line 121
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    const-string p1, "optimize step regs:(%d/%d/%.2f%%) insns:(%d/%d/%.2f%%)\n"

    .line 126
    .line 127
    invoke-virtual {p3, p1, p0}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public loadOptimizeLists(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->optimizeListsLoaded:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    if-nez p2, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string p0, "optimize and don\'t optimize lists  are mutually exclusive."

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-static {p1}, Lcom/android/dx/dex/cf/OptimizerOptions;->loadStringsFromFile(Ljava/lang/String;)Ljava/util/HashSet;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->optimizeList:Ljava/util/HashSet;

    .line 24
    .line 25
    :cond_3
    if-eqz p2, :cond_4

    .line 26
    .line 27
    invoke-static {p2}, Lcom/android/dx/dex/cf/OptimizerOptions;->loadStringsFromFile(Ljava/lang/String;)Ljava/util/HashSet;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->dontOptimizeList:Ljava/util/HashSet;

    .line 32
    .line 33
    :cond_4
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->optimizeListsLoaded:Z

    .line 35
    .line 36
    return-void
.end method

.method public shouldOptimize(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->optimizeList:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/cf/OptimizerOptions;->dontOptimizeList:Ljava/util/HashSet;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    xor-int/2addr p0, v0

    .line 20
    return p0

    .line 21
    :cond_1
    return v0
.end method
