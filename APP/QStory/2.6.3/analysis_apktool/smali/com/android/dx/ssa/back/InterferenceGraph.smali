.class public Lcom/android/dx/ssa/back/InterferenceGraph;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private final interference:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/IntSet;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/android/dx/ssa/SetFactory;->makeInterferenceSet(I)Lcom/android/dx/util/IntSet;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method private ensureCapacity(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    :goto_0
    if-ge v0, p1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/android/dx/ssa/SetFactory;->makeInterferenceSet(I)Lcom/android/dx/util/IntSet;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public add(II)V
    .locals 1

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/android/dx/ssa/back/InterferenceGraph;->ensureCapacity(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/android/dx/util/IntSet;

    .line 17
    .line 18
    invoke-interface {v0, p2}, Lcom/android/dx/util/IntSet;->add(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/android/dx/util/IntSet;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Lcom/android/dx/util/IntSet;->add(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public dumpToStdout()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

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
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    const-string v2, "Reg "

    .line 11
    .line 12
    const-string v3, ":"

    .line 13
    .line 14
    invoke-static {v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/android/dx/util/IntSet;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method

.method public mergeInterferenceSet(ILcom/android/dx/util/IntSet;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/ssa/back/InterferenceGraph;->interference:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/android/dx/util/IntSet;

    .line 16
    .line 17
    invoke-interface {p2, p0}, Lcom/android/dx/util/IntSet;->merge(Lcom/android/dx/util/IntSet;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
