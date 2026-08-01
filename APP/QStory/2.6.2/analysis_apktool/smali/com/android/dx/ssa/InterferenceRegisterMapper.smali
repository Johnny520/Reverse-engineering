.class public Lcom/android/dx/ssa/InterferenceRegisterMapper;
.super Lcom/android/dx/ssa/BasicRegisterMapper;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final newRegInterference:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/BitIntSet;",
            ">;"
        }
    .end annotation
.end field

.field private final oldRegInterference:Lcom/android/dx/ssa/back/InterferenceGraph;


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/back/InterferenceGraph;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/ssa/BasicRegisterMapper;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->oldRegInterference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 12
    .line 13
    return-void
.end method

.method private addInterfence(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 2
    .line 3
    add-int/lit8 v1, p1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v2, Lcom/android/dx/util/BitIntSet;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lcom/android/dx/util/BitIntSet;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->oldRegInterference:Lcom/android/dx/ssa/back/InterferenceGraph;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Lcom/android/dx/util/IntSet;

    .line 36
    .line 37
    invoke-virtual {v0, p2, p0}, Lcom/android/dx/ssa/back/InterferenceGraph;->mergeInterferenceSet(ILcom/android/dx/util/IntSet;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public addMapping(III)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/android/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p1}, Lcom/android/dx/ssa/InterferenceRegisterMapper;->addInterfence(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-ne p3, v0, :cond_0

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-direct {p0, p2, p1}, Lcom/android/dx/ssa/InterferenceRegisterMapper;->addInterfence(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public areAnyPinned(Lcom/android/dx/rop/code/RegisterSpecList;II)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lcom/android/dx/rop/code/RegisterSpecList;->get(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {p0, v4}, Lcom/android/dx/ssa/BasicRegisterMapper;->oldToNew(I)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eq v4, p2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v5, 0x2

    .line 28
    if-ne v3, v5, :cond_0

    .line 29
    .line 30
    add-int/lit8 v3, v4, 0x1

    .line 31
    .line 32
    if-eq v3, p2, :cond_2

    .line 33
    .line 34
    :cond_0
    if-ne p3, v5, :cond_1

    .line 35
    .line 36
    add-int/lit8 v3, p2, 0x1

    .line 37
    .line 38
    if-ne v4, v3, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_3
    return v1
.end method

.method public interferes(III)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

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
    if-lt p2, v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/android/dx/ssa/InterferenceRegisterMapper;->newRegInterference:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/android/dx/util/IntSet;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 v2, 0x1

    .line 23
    if-ne p3, v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lcom/android/dx/util/IntSet;->has(I)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_2
    invoke-interface {v0, p1}, Lcom/android/dx/util/IntSet;->has(I)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    add-int/2addr p2, v2

    .line 37
    sub-int/2addr p3, v2

    .line 38
    invoke-virtual {p0, p1, p2, p3}, Lcom/android/dx/ssa/InterferenceRegisterMapper;->interferes(III)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return v1

    .line 46
    :cond_4
    :goto_0
    return v2
.end method

.method public interferes(Lcom/android/dx/rop/code/RegisterSpec;I)Z
    .locals 1

    .line 47
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    move-result p1

    invoke-virtual {p0, v0, p2, p1}, Lcom/android/dx/ssa/InterferenceRegisterMapper;->interferes(III)Z

    move-result p0

    return p0
.end method
