.class public final Lcom/android/dx/cf/code/Frame;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final locals:Lcom/android/dx/cf/code/LocalsArray;

.field private final stack:Lcom/android/dx/cf/code/ExecutionStack;

.field private final subroutines:Lcom/android/dx/util/IntList;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 32
    new-instance v0, Lcom/android/dx/cf/code/OneLocalsArray;

    invoke-direct {v0, p1}, Lcom/android/dx/cf/code/OneLocalsArray;-><init>(I)V

    new-instance p1, Lcom/android/dx/cf/code/ExecutionStack;

    invoke-direct {p1, p2}, Lcom/android/dx/cf/code/ExecutionStack;-><init>(I)V

    invoke-direct {p0, v0, p1}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;)V

    return-void
.end method

.method private constructor <init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;)V
    .locals 1

    .line 31
    sget-object v0, Lcom/android/dx/util/IntList;->EMPTY:Lcom/android/dx/util/IntList;

    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    return-void
.end method

.method private constructor <init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V
    .locals 1

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
    invoke-virtual {p3}, Lcom/android/dx/util/MutabilityControl;->throwIfMutable()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 15
    .line 16
    iput-object p3, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "stack == null"

    .line 20
    .line 21
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    const-string p0, "locals == null"

    .line 26
    .line 27
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method private static adjustLocalsForSubroutines(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/util/IntList;)Lcom/android/dx/cf/code/LocalsArray;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    check-cast p0, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/android/dx/cf/code/LocalsArraySet;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    return-object p0
.end method

.method private mergeSubroutineLists(Lcom/android/dx/util/IntList;)Lcom/android/dx/util/IntList;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/util/IntList;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lcom/android/dx/util/IntList;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/android/dx/util/IntList;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    if-ge v3, v1, :cond_1

    .line 29
    .line 30
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    iget-object v4, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {p1, v3}, Lcom/android/dx/util/IntList;->get(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-ne v4, v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Lcom/android/dx/util/IntList;->add(I)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/LocalsArray;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/ExecutionStack;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public copy()Lcom/android/dx/cf/code/Frame;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/Frame;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalsArray;->copy()Lcom/android/dx/cf/code/LocalsArray;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/android/dx/cf/code/ExecutionStack;->copy()Lcom/android/dx/cf/code/ExecutionStack;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, p0}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public getLocals()Lcom/android/dx/cf/code/LocalsArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStack()Lcom/android/dx/cf/code/ExecutionStack;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSubroutines()Lcom/android/dx/util/IntList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    return-object p0
.end method

.method public initializeWithParameters(Lcom/android/dx/rop/type/StdTypeList;)V
    .locals 5

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
    if-ge v1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lcom/android/dx/rop/type/StdTypeList;->get(I)Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 14
    .line 15
    invoke-virtual {v4, v2, v3}, Lcom/android/dx/cf/code/LocalsArray;->set(ILcom/android/dx/rop/type/TypeBearer;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    add-int/2addr v2, v3

    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public makeExceptionHandlerStartFrame(Lcom/android/dx/rop/cst/CstType;)Lcom/android/dx/cf/code/Frame;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ExecutionStack;->copy()Lcom/android/dx/cf/code/ExecutionStack;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/android/dx/cf/code/ExecutionStack;->clear()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/ExecutionStack;->push(Lcom/android/dx/rop/type/TypeBearer;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/android/dx/cf/code/Frame;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 22
    .line 23
    invoke-direct {p1, v1, v0, p0}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/android/dx/cf/code/LocalsArray;->makeInitialized(Lcom/android/dx/rop/type/Type;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/ExecutionStack;->makeInitialized(Lcom/android/dx/rop/type/Type;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public makeNewSubroutineStartFrame(II)Lcom/android/dx/cf/code/Frame;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/android/dx/util/IntList;->add(I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lcom/android/dx/cf/code/Frame;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/android/dx/cf/code/LocalsArray;->getPrimary()Lcom/android/dx/cf/code/OneLocalsArray;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/android/dx/util/IntList;->makeImmutable(I)Lcom/android/dx/util/IntList;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-direct {v0, v1, v2, v3}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0, p1, p2}, Lcom/android/dx/cf/code/Frame;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/Frame;II)Lcom/android/dx/cf/code/Frame;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public mergeWith(Lcom/android/dx/cf/code/Frame;)Lcom/android/dx/cf/code/Frame;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/LocalsArray;->merge(Lcom/android/dx/cf/code/LocalsArray;)Lcom/android/dx/cf/code/LocalsArray;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lcom/android/dx/cf/code/ExecutionStack;->merge(Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p1, p1, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/Frame;->mergeSubroutineLists(Lcom/android/dx/util/IntList;)Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Lcom/android/dx/cf/code/Frame;->adjustLocalsForSubroutines(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/util/IntList;)Lcom/android/dx/cf/code/LocalsArray;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-ne v0, v2, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-ne v1, v2, :cond_0

    .line 46
    .line 47
    iget-object v2, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 48
    .line 49
    if-ne v2, p1, :cond_0

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    new-instance p0, Lcom/android/dx/cf/code/Frame;

    .line 53
    .line 54
    invoke-direct {p0, v0, v1, p1}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method public mergeWithSubroutineCaller(Lcom/android/dx/cf/code/Frame;II)Lcom/android/dx/cf/code/Frame;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1, p3}, Lcom/android/dx/cf/code/LocalsArray;->mergeWithSubroutineCaller(Lcom/android/dx/cf/code/LocalsArray;I)Lcom/android/dx/cf/code/LocalsArraySet;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/android/dx/cf/code/ExecutionStack;->merge(Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object p1, p1, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p2}, Lcom/android/dx/util/IntList;->add(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getLocals()Lcom/android/dx/cf/code/LocalsArray;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-ne p3, p2, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/android/dx/cf/code/Frame;->getStack()Lcom/android/dx/cf/code/ExecutionStack;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    if-ne v0, p2, :cond_0

    .line 48
    .line 49
    iget-object p2, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Lcom/android/dx/util/IntList;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_0

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_0
    iget-object p2, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Lcom/android/dx/util/IntList;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 65
    .line 66
    if-eqz p2, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->size()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 78
    .line 79
    if-le p2, v1, :cond_2

    .line 80
    .line 81
    move-object v5, p1

    .line 82
    move-object p1, p0

    .line 83
    move-object p0, v5

    .line 84
    :cond_2
    invoke-virtual {p1}, Lcom/android/dx/util/IntList;->size()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p0}, Lcom/android/dx/util/IntList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    add-int/lit8 v2, v1, -0x1

    .line 93
    .line 94
    :goto_0
    if-ltz v2, :cond_4

    .line 95
    .line 96
    invoke-virtual {p0, v2}, Lcom/android/dx/util/IntList;->get(I)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    sub-int v4, p2, v1

    .line 101
    .line 102
    add-int/2addr v4, v2

    .line 103
    invoke-virtual {p1, v4}, Lcom/android/dx/util/IntList;->get(I)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-ne v3, v4, :cond_3

    .line 108
    .line 109
    add-int/lit8 v2, v2, -0x1

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_3
    const-string p0, "Incompatible merged subroutines"

    .line 113
    .line 114
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    return-object p0

    .line 119
    :cond_4
    move-object v1, p1

    .line 120
    :goto_1
    new-instance p0, Lcom/android/dx/cf/code/Frame;

    .line 121
    .line 122
    invoke-direct {p0, p3, v0, v1}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 123
    .line 124
    .line 125
    return-object p0
.end method

.method public setImmutable()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public subFrameForLabel(II)Lcom/android/dx/cf/code/Frame;
    .locals 4

    .line 1
    const-string v0, "returning from invalid subroutine"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->locals:Lcom/android/dx/cf/code/LocalsArray;

    .line 4
    .line 5
    instance-of v2, v1, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v1, Lcom/android/dx/cf/code/LocalsArraySet;

    .line 11
    .line 12
    invoke-virtual {v1, p2}, Lcom/android/dx/cf/code/LocalsArraySet;->subArrayForLabel(I)Lcom/android/dx/cf/code/LocalsArray;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p2, v3

    .line 18
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/android/dx/cf/code/Frame;->subroutines:Lcom/android/dx/util/IntList;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->mutableCopy()Lcom/android/dx/util/IntList;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/android/dx/util/IntList;->pop()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ne v2, p1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    if-nez p2, :cond_1

    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_1
    new-instance p1, Lcom/android/dx/cf/code/Frame;

    .line 37
    .line 38
    iget-object p0, p0, Lcom/android/dx/cf/code/Frame;->stack:Lcom/android/dx/cf/code/ExecutionStack;

    .line 39
    .line 40
    invoke-direct {p1, p2, p0, v1}, Lcom/android/dx/cf/code/Frame;-><init>(Lcom/android/dx/cf/code/LocalsArray;Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/util/IntList;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    :try_start_1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 45
    .line 46
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 50
    :catch_0
    const-string p0, "can\'t return from non-subroutine"

    .line 51
    .line 52
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :catch_1
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v3
.end method
