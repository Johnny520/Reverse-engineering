.class public final Lcom/android/dx/ssa/Dominators;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/Dominators$DFSInfo;,
        Lcom/android/dx/ssa/Dominators$DfsWalker;
    }
.end annotation


# instance fields
.field private final blocks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field

.field private final domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

.field private final info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

.field private final meth:Lcom/android/dx/ssa/SsaMethod;

.field private final postdom:Z

.field private final vertex:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/android/dx/ssa/SsaMethod;[Lcom/android/dx/ssa/DomFront$DomInfo;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/ssa/Dominators;->meth:Lcom/android/dx/ssa/SsaMethod;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 7
    .line 8
    iput-boolean p3, p0, Lcom/android/dx/ssa/Dominators;->postdom:Z

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/android/dx/ssa/Dominators;->blocks:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    add-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    new-array p1, p1, [Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic access$100(Lcom/android/dx/ssa/Dominators;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$200(Lcom/android/dx/ssa/Dominators;)[Lcom/android/dx/ssa/Dominators$DFSInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method private compress(Lcom/android/dx/ssa/SsaBasicBlock;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    aget-object v0, v1, v0

    .line 18
    .line 19
    iget-object v0, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    add-int/lit8 p1, p1, -0x1

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 53
    .line 54
    iget-object v3, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    aget-object v2, v3, v2

    .line 61
    .line 62
    iget-object v3, v2, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 63
    .line 64
    iget-object v4, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    aget-object v4, v4, v5

    .line 71
    .line 72
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    iget-object v5, v4, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 79
    .line 80
    if-eqz v5, :cond_0

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    iget-object p1, v4, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 90
    .line 91
    if-nez p1, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object p1, v4, Lcom/android/dx/ssa/Dominators$DFSInfo;->rep:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 95
    .line 96
    iget-object v3, v2, Lcom/android/dx/ssa/Dominators$DFSInfo;->rep:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 97
    .line 98
    iget-object v5, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    aget-object v5, v5, v6

    .line 105
    .line 106
    iget v5, v5, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 107
    .line 108
    iget-object v6, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    aget-object v3, v6, v3

    .line 115
    .line 116
    iget v3, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 117
    .line 118
    if-ge v5, v3, :cond_2

    .line 119
    .line 120
    iput-object p1, v2, Lcom/android/dx/ssa/Dominators$DFSInfo;->rep:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 121
    .line 122
    :cond_2
    iget-object p1, v4, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 123
    .line 124
    iput-object p1, v2, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    return-void
.end method

.method private eval(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/Dominators;->compress(Lcom/android/dx/ssa/SsaBasicBlock;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Lcom/android/dx/ssa/Dominators$DFSInfo;->rep:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 18
    .line 19
    return-object p0
.end method

.method private getPreds(Lcom/android/dx/ssa/SsaBasicBlock;)Ljava/util/BitSet;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/ssa/Dominators;->postdom:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private getSuccs(Lcom/android/dx/ssa/SsaBasicBlock;)Ljava/util/BitSet;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/ssa/Dominators;->postdom:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static make(Lcom/android/dx/ssa/SsaMethod;[Lcom/android/dx/ssa/DomFront$DomInfo;Z)Lcom/android/dx/ssa/Dominators;
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/ssa/Dominators;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/android/dx/ssa/Dominators;-><init>(Lcom/android/dx/ssa/SsaMethod;[Lcom/android/dx/ssa/DomFront$DomInfo;Z)V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lcom/android/dx/ssa/Dominators;->run()V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method private run()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/ssa/Dominators;->postdom:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->meth:Lcom/android/dx/ssa/SsaMethod;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaMethod;->getExitBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlock()Lcom/android/dx/ssa/SsaBasicBlock;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    aget-object v1, v1, v2

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, v1, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 36
    .line 37
    :cond_1
    new-instance v0, Lcom/android/dx/ssa/Dominators$DfsWalker;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, Lcom/android/dx/ssa/Dominators$DfsWalker;-><init>(Lcom/android/dx/ssa/Dominators;Lcom/android/dx/ssa/Dominators$1;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->meth:Lcom/android/dx/ssa/SsaMethod;

    .line 44
    .line 45
    iget-boolean v2, p0, Lcom/android/dx/ssa/Dominators;->postdom:Z

    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Lcom/android/dx/ssa/SsaMethod;->forEachBlockDepthFirst(ZLcom/android/dx/ssa/SsaBasicBlock$Visitor;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    move v1, v0

    .line 59
    :goto_1
    const/4 v2, 0x2

    .line 60
    if-lt v1, v2, :cond_6

    .line 61
    .line 62
    iget-object v2, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 69
    .line 70
    iget-object v3, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 71
    .line 72
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    aget-object v3, v3, v4

    .line 77
    .line 78
    invoke-direct {p0, v2}, Lcom/android/dx/ssa/Dominators;->getPreds(Lcom/android/dx/ssa/SsaBasicBlock;)Ljava/util/BitSet;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    :goto_2
    if-ltz v5, :cond_3

    .line 88
    .line 89
    iget-object v6, p0, Lcom/android/dx/ssa/Dominators;->blocks:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    check-cast v6, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 96
    .line 97
    iget-object v7, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 98
    .line 99
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    aget-object v7, v7, v8

    .line 104
    .line 105
    if-eqz v7, :cond_2

    .line 106
    .line 107
    iget-object v7, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 108
    .line 109
    invoke-direct {p0, v6}, Lcom/android/dx/ssa/Dominators;->eval(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    aget-object v6, v7, v6

    .line 118
    .line 119
    iget v6, v6, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 120
    .line 121
    iget v7, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 122
    .line 123
    if-ge v6, v7, :cond_2

    .line 124
    .line 125
    iput v6, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 126
    .line 127
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 128
    .line 129
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    iget-object v4, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 135
    .line 136
    iget-object v5, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 137
    .line 138
    iget v6, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    check-cast v5, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 145
    .line 146
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    aget-object v4, v4, v5

    .line 151
    .line 152
    iget-object v4, v4, Lcom/android/dx/ssa/Dominators$DFSInfo;->bucket:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    iget-object v2, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->parent:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 158
    .line 159
    iput-object v2, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->ancestor:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 160
    .line 161
    iget-object v4, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    aget-object v2, v4, v2

    .line 168
    .line 169
    iget-object v2, v2, Lcom/android/dx/ssa/Dominators$DFSInfo;->bucket:Ljava/util/ArrayList;

    .line 170
    .line 171
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_5

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    add-int/lit8 v4, v4, -0x1

    .line 182
    .line 183
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    check-cast v4, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 188
    .line 189
    invoke-direct {p0, v4}, Lcom/android/dx/ssa/Dominators;->eval(Lcom/android/dx/ssa/SsaBasicBlock;)Lcom/android/dx/ssa/SsaBasicBlock;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    iget-object v6, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 194
    .line 195
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    aget-object v6, v6, v7

    .line 200
    .line 201
    iget v6, v6, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 202
    .line 203
    iget-object v7, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 204
    .line 205
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    aget-object v7, v7, v8

    .line 210
    .line 211
    iget v7, v7, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 212
    .line 213
    iget-object v8, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 214
    .line 215
    if-ge v6, v7, :cond_4

    .line 216
    .line 217
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    aget-object v4, v8, v4

    .line 222
    .line 223
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    iput v5, v4, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_4
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    aget-object v4, v8, v4

    .line 235
    .line 236
    iget-object v5, v3, Lcom/android/dx/ssa/Dominators$DFSInfo;->parent:Lcom/android/dx/ssa/SsaBasicBlock;

    .line 237
    .line 238
    invoke-virtual {v5}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    iput v5, v4, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_5
    add-int/lit8 v1, v1, -0x1

    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :cond_6
    :goto_4
    if-gt v2, v0, :cond_8

    .line 250
    .line 251
    iget-object v1, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    check-cast v1, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 258
    .line 259
    iget-object v3, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 260
    .line 261
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    aget-object v3, v3, v4

    .line 266
    .line 267
    iget v3, v3, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 268
    .line 269
    iget-object v4, p0, Lcom/android/dx/ssa/Dominators;->vertex:Ljava/util/ArrayList;

    .line 270
    .line 271
    iget-object v5, p0, Lcom/android/dx/ssa/Dominators;->info:[Lcom/android/dx/ssa/Dominators$DFSInfo;

    .line 272
    .line 273
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    aget-object v5, v5, v6

    .line 278
    .line 279
    iget v5, v5, Lcom/android/dx/ssa/Dominators$DFSInfo;->semidom:I

    .line 280
    .line 281
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Lcom/android/dx/ssa/SsaBasicBlock;

    .line 286
    .line 287
    invoke-virtual {v4}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-eq v3, v4, :cond_7

    .line 292
    .line 293
    iget-object v3, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 294
    .line 295
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    aget-object v3, v3, v4

    .line 300
    .line 301
    iget-object v4, p0, Lcom/android/dx/ssa/Dominators;->domInfos:[Lcom/android/dx/ssa/DomFront$DomInfo;

    .line 302
    .line 303
    invoke-virtual {v1}, Lcom/android/dx/ssa/SsaBasicBlock;->getIndex()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    aget-object v1, v4, v1

    .line 308
    .line 309
    iget v1, v1, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 310
    .line 311
    aget-object v1, v4, v1

    .line 312
    .line 313
    iget v1, v1, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 314
    .line 315
    iput v1, v3, Lcom/android/dx/ssa/DomFront$DomInfo;->idom:I

    .line 316
    .line 317
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_8
    return-void
.end method
