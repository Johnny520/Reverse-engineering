.class public Lcom/android/dx/ssa/DomFront;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/DomFront$DomInfo;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private final domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

.field private final meth:Lcom/android/dx/ssa/SsaMethod;

.field private final nodes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/DomFront;->meth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-array v0, p1, [Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-ge v0, p1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 24
    .line 25
    new-instance v2, Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 26
    .line 27
    invoke-direct {v2}, Lcom/android/dx/ssa/DomFront$DomInfo;-><init>()V

    .line 28
    .line 29
    .line 30
    aput-object v2, v1, v0

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method private buildDomTree()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

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
    iget-object v2, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 11
    .line 12
    aget-object v2, v2, v1

    .line 13
    .line 14
    iget v2, v2, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v3, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lcom/android/dx/ssa/SsaBasicBlock;->addDomChild(Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void
.end method

.method private calcDomFronts()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

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
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_4

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    iget-object v4, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 20
    .line 21
    aget-object v4, v4, v2

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/util/BitSet;->cardinality()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x1

    .line 32
    if-le v5, v6, :cond_3

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    :goto_1
    if-ltz v5, :cond_3

    .line 39
    .line 40
    move v6, v5

    .line 41
    :goto_2
    iget v7, v4, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 42
    .line 43
    if-eq v6, v7, :cond_2

    .line 44
    .line 45
    const/4 v7, -0x1

    .line 46
    if-ne v6, v7, :cond_0

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_0
    iget-object v7, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 50
    .line 51
    aget-object v6, v7, v6

    .line 52
    .line 53
    iget-object v7, v6, Lcom/android/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/android/dx/util/IntSet;

    .line 54
    .line 55
    invoke-interface {v7, v2}, Lcom/android/dx/util/IntSet;->has(I)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    iget-object v7, v6, Lcom/android/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/android/dx/util/IntSet;

    .line 63
    .line 64
    invoke-interface {v7, v2}, Lcom/android/dx/util/IntSet;->add(I)V

    .line 65
    .line 66
    .line 67
    iget v6, v6, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    return-void
.end method

.method private debugPrintDomChildren()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

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
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_2

    .line 10
    .line 11
    iget-object v3, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    new-instance v4, Ljava/lang/StringBuffer;

    .line 20
    .line 21
    const-string v5, "{"

    .line 22
    .line 23
    invoke-direct {v4, v5}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaBasicBlock;->getDomChildren()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    move v6, v1

    .line 35
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 46
    .line 47
    if-eqz v6, :cond_0

    .line 48
    .line 49
    const/16 v6, 0x2c

    .line 50
    .line 51
    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const/16 v5, 0x7d

    .line 60
    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 62
    .line 63
    .line 64
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 65
    .line 66
    new-instance v6, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v7, "domChildren["

    .line 69
    .line 70
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v3, "]: "

    .line 77
    .line 78
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v5, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    return-void
.end method


# virtual methods
.method public run()[Lcom/android/dx/ssa/DomFront$DomInfo;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/DomFront;->meth:Lcom/android/dx/ssa/SsaMethod;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v2, v3}, Lcom/android/dx/ssa/Dominators;->make(Lcom/android/dx/ssa/SsaMethod;[Lcom/android/dx/ssa/DomFront$DomInfo;Z)Lcom/android/dx/ssa/Dominators;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/android/dx/ssa/DomFront;->buildDomTree()V

    .line 16
    .line 17
    .line 18
    :goto_0
    if-ge v3, v0, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 21
    .line 22
    aget-object v1, v1, v3

    .line 23
    .line 24
    invoke-static {v0}, Lcom/android/dx/ssa/SetFactory;->makeDomFrontSet(I)Lcom/android/dx/util/IntSet;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v1, Lcom/android/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/android/dx/util/IntSet;

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-direct {p0}, Lcom/android/dx/ssa/DomFront;->calcDomFronts()V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/android/dx/ssa/DomFront;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 37
    .line 38
    return-object p0
.end method
