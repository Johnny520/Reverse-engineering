.class public Lbsh/BSHAutoCloseable;
.super Lbsh/BSHTypedVariableDeclaration;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public name:Ljava/lang/String;

.field public ths:Ljava/lang/AutoCloseable;

.field public type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public typeName:Ljava/lang/String;

.field public varThis:Lbsh/Variable;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/BSHTypedVariableDeclaration;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private renderTypeNode()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lbsh/BSHAutoCloseable;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    new-instance v0, Lbsh/BSHType;

    .line 9
    .line 10
    const/16 v2, 0xb

    .line 11
    .line 12
    invoke-direct {v0, v2}, Lbsh/BSHType;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Lbsh/BSHAutoCloseable;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :cond_0
    invoke-interface {v3}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetNumChildren()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-lez v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v3, v2}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    instance-of v4, v3, Lbsh/BSHAmbiguousName;

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    :cond_1
    new-instance v4, Lbsh/BSHAmbiguousName;

    .line 35
    .line 36
    const/16 v5, 0xe

    .line 37
    .line 38
    invoke-direct {v4, v5}, Lbsh/BSHAmbiguousName;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v0}, Lbsh/SimpleNode;->jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 42
    .line 43
    .line 44
    check-cast v3, Lbsh/BSHAmbiguousName;

    .line 45
    .line 46
    iget-object v3, v3, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v3, v4, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v0, v4, v2}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtAddChild(Lbsh/飘花落叶言子世兰苏楪哲;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v0, p0}, Lbsh/飘花落叶言子世兰苏楪哲;->jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, p0, Lbsh/SimpleNode;->children:[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 57
    .line 58
    aget-object v3, v3, v2

    .line 59
    .line 60
    const/4 v4, 0x2

    .line 61
    new-array v4, v4, [Lbsh/飘花落叶言子世兰苏楪哲;

    .line 62
    .line 63
    aput-object v0, v4, v2

    .line 64
    .line 65
    aput-object v3, v4, v1

    .line 66
    .line 67
    iput-object v4, p0, Lbsh/SimpleNode;->children:[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 68
    .line 69
    :cond_2
    return-void
.end method


# virtual methods
.method public bridge synthetic add(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->add(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/BSHAutoCloseable;->varThis:Lbsh/Variable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Variable;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/AutoCloseable;

    .line 10
    .line 11
    iput-object v0, p0, Lbsh/BSHAutoCloseable;->ths:Ljava/lang/AutoCloseable;

    .line 12
    .line 13
    :cond_0
    iget-object p0, p0, Lbsh/BSHAutoCloseable;->ths:Ljava/lang/AutoCloseable;

    .line 14
    .line 15
    if-eqz p0, :cond_9

    .line 16
    .line 17
    instance-of v0, p0, Ljava/lang/AutoCloseable;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    .line 26
    .line 27
    if-eqz v0, :cond_5

    .line 28
    .line 29
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-ne p0, v0, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_9

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    :cond_3
    :goto_0
    if-nez v0, :cond_4

    .line 49
    .line 50
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 51
    .line 52
    const-wide/16 v3, 0x1

    .line 53
    .line 54
    invoke-interface {p0, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    goto :goto_0

    .line 59
    :catch_0
    if-nez v1, :cond_3

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    if-eqz v1, :cond_9

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    instance-of v0, p0, Landroid/content/res/TypedArray;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    check-cast p0, Landroid/content/res/TypedArray;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_6
    instance-of v0, p0, Landroid/media/MediaMetadataRetriever;

    .line 87
    .line 88
    if-eqz v0, :cond_7

    .line 89
    .line 90
    check-cast p0, Landroid/media/MediaMetadataRetriever;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_7
    instance-of v0, p0, Landroid/media/MediaDrm;

    .line 97
    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    check-cast p0, Landroid/media/MediaDrm;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/media/MediaDrm;->release()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_8
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 107
    .line 108
    .line 109
    :cond_9
    :goto_1
    return-void
.end method

.method public bridge synthetic dump(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->dump(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, Lbsh/BSHAutoCloseable;->renderTypeNode()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lbsh/BSHTypedVariableDeclaration;->evalType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/BSHAutoCloseable;->type:Ljava/lang/Class;

    .line 9
    .line 10
    const-class v0, Ljava/lang/AutoCloseable;

    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/BSHAutoCloseable;->getType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/BSHTypedVariableDeclaration;->getDeclarators()[Lbsh/BSHVariableDeclarator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    aget-object v0, v0, v1

    .line 28
    .line 29
    iget-object v0, v0, Lbsh/BSHVariableDeclarator;->name:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v0, p0, Lbsh/BSHAutoCloseable;->name:Ljava/lang/String;

    .line 32
    .line 33
    invoke-super {p0, p1, p2}, Lbsh/BSHTypedVariableDeclaration;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p0}, Lbsh/BSHAutoCloseable;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {p2, v0, v1}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iput-object p2, p0, Lbsh/BSHAutoCloseable;->varThis:Lbsh/Variable;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 52
    .line 53
    return-object p0

    .line 54
    :catch_0
    move-exception p2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "Unable to evaluate the try-with-resource "

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lbsh/BSHAutoCloseable;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ". With message:"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p2, v0, p0, p1}, Lbsh/UtilEvalError;->toEvalError(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)Lbsh/EvalError;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    throw p0

    .line 90
    :cond_0
    new-instance p2, Lbsh/EvalException;

    .line 91
    .line 92
    iget-object v0, p0, Lbsh/BSHAutoCloseable;->type:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "The resource type "

    .line 101
    .line 102
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, " does not implement java.lang.AutoCloseable."

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 118
    .line 119
    .line 120
    throw p2
.end method

.method public bridge synthetic getId()I
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic getLineNumber()I
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getLineNumber()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/BSHAutoCloseable;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getSourceFile()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getSourceFile()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic getText()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getText()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/BSHAutoCloseable;->type:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic hasNext()Z
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic hasPrevious()Z
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic jjtAddChild(Lbsh/飘花落叶言子世兰苏楪哲;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/SimpleNode;->jjtAddChild(Lbsh/飘花落叶言子世兰苏楪哲;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtClose()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtClose()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic jjtGetChildren()[Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic jjtGetNumChildren()I
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic jjtGetParent()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetParent()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic jjtOpen()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtOpen()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtSetParent(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic next()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->next()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic nextIndex()I
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->nextIndex()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic previous()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previous()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic previousIndex()I
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previousIndex()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public bridge synthetic remove()V
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->remove()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic set(Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->set(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic setSourceFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->setSourceFile(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Lbsh/BSHTypedVariableDeclaration;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public bridge synthetic toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
