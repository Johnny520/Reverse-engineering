.class public final Lcom/android/dx/cf/code/ExecutionStack;
.super Lcom/android/dx/util/MutabilityControl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final local:[Z

.field private final stack:[Lcom/android/dx/rop/type/TypeBearer;

.field private stackPtr:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    new-array v1, p1, [Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    iput-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 13
    .line 14
    new-array p1, p1, [Z

    .line 15
    .line 16
    iput-object p1, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 17
    .line 18
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 19
    .line 20
    return-void
.end method

.method private static stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "<invalid>"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/SimException;

    .line 2
    .line 3
    const-string v1, "stack: "

    .line 4
    .line 5
    invoke-static {v1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw v0
.end method


# virtual methods
.method public annotate(Lcom/android/dex/util/ExceptionWithContext;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-gt v1, v0, :cond_1

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    const-string v2, "top0"

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    sub-int v2, v0, v1

    .line 14
    .line 15
    invoke-static {v2}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_1
    const-string v3, "stack["

    .line 20
    .line 21
    const-string v4, "]: "

    .line 22
    .line 23
    invoke-static {v3, v2, v4}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 28
    .line 29
    aget-object v3, v3, v1

    .line 30
    .line 31
    invoke-static {v3}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, v2}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public change(ILcom/android/dx/rop/type/TypeBearer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 9
    .line 10
    sub-int/2addr v0, p1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 14
    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-interface {p2}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "incompatible substitution: "

    .line 40
    .line 41
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string p1, " -> "

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, Lcom/android/dx/cf/code/ExecutionStack;->stackElementString(Lcom/android/dx/rop/type/TypeBearer;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 71
    .line 72
    aput-object p2, p0, v0

    .line 73
    .line 74
    return-void

    .line 75
    :catch_0
    const-string p0, "type == null"

    .line 76
    .line 77
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public clear()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 7
    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v3, v2, v1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 16
    .line 17
    aput-boolean v0, v2, v1

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 23
    .line 24
    return-void
.end method

.method public copy()Lcom/android/dx/cf/code/ExecutionStack;
    .locals 5

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/ExecutionStack;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iget-object v2, v0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    array-length v3, v1

    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 19
    .line 20
    iget-object v2, v0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 21
    .line 22
    array-length v3, v1

    .line 23
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    .line 25
    .line 26
    iget p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 27
    .line 28
    iput p0, v0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 29
    .line 30
    return-object v0
.end method

.method public getMaxStack()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public makeInitialized(Lcom/android/dx/rop/type/Type;)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getInitializedType()Lcom/android/dx/rop/type/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 19
    .line 20
    aget-object v3, v2, v1

    .line 21
    .line 22
    if-ne v3, p1, :cond_1

    .line 23
    .line 24
    aput-object v0, v2, v1

    .line 25
    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    :goto_1
    return-void
.end method

.method public merge(Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lcom/android/dx/cf/code/Merger;->mergeStack(Lcom/android/dx/cf/code/ExecutionStack;Lcom/android/dx/cf/code/ExecutionStack;)Lcom/android/dx/cf/code/ExecutionStack;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Lcom/android/dx/cf/code/SimException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    const-string v1, "underlay stack:"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/ExecutionStack;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "overlay stack:"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/android/dex/util/ExceptionWithContext;->addContext(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/android/dx/cf/code/ExecutionStack;->annotate(Lcom/android/dex/util/ExceptionWithContext;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public peek(I)Lcom/android/dx/rop/type/TypeBearer;
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    .line 7
    const-string p0, "underflow"

    .line 8
    .line 9
    invoke-static {p0}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    aget-object p0, p0, v0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    const-string p0, "n < 0"

    .line 23
    .line 24
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public peekLocal(I)Z
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 8
    .line 9
    sub-int/2addr v0, p1

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    aget-boolean p0, p0, v0

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    new-instance p0, Lcom/android/dx/cf/code/SimException;

    .line 16
    .line 17
    const-string p1, "stack: underflow"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/android/dx/cf/code/SimException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "n < 0"

    .line 24
    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public peekType(I)Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public pop()Lcom/android/dx/rop/type/TypeBearer;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lcom/android/dx/cf/code/ExecutionStack;->peek(I)Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 10
    .line 11
    iget v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 12
    .line 13
    add-int/lit8 v4, v3, -0x1

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    aput-object v5, v2, v4

    .line 17
    .line 18
    iget-object v2, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 19
    .line 20
    add-int/lit8 v4, v3, -0x1

    .line 21
    .line 22
    aput-boolean v0, v2, v4

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v3, v0

    .line 33
    iput v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 34
    .line 35
    return-object v1
.end method

.method public push(Lcom/android/dx/rop/type/TypeBearer;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getFrameType()Lcom/android/dx/rop/type/TypeBearer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/android/dx/rop/type/Type;->getCategory()I

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    iget v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 17
    .line 18
    add-int v2, v1, v0

    .line 19
    .line 20
    iget-object v3, p0, Lcom/android/dx/cf/code/ExecutionStack;->stack:[Lcom/android/dx/rop/type/TypeBearer;

    .line 21
    .line 22
    array-length v4, v3

    .line 23
    if-le v2, v4, :cond_0

    .line 24
    .line 25
    const-string p0, "overflow"

    .line 26
    .line 27
    invoke-static {p0}, Lcom/android/dx/cf/code/ExecutionStack;->throwSimException(Ljava/lang/String;)Lcom/android/dx/rop/type/TypeBearer;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const/4 v2, 0x2

    .line 32
    if-ne v0, v2, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    aput-object v0, v3, v1

    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    iput v1, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 40
    .line 41
    :cond_1
    iget v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 42
    .line 43
    aput-object p1, v3, v0

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    iput v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    const-string p0, "type == null"

    .line 51
    .line 52
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setLocal()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/cf/code/ExecutionStack;->local:[Z

    .line 5
    .line 6
    iget p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    aput-boolean v1, v0, p0

    .line 10
    .line 11
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/ExecutionStack;->stackPtr:I

    .line 2
    .line 3
    return p0
.end method
