.class Lbsh/SimpleNode;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/Node;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field protected children:[Lbsh/Node;

.field private cursor:I

.field transient firstToken:Lbsh/Token;

.field protected id:I

.field private lastRet:I

.field transient lastToken:Lbsh/Token;

.field protected parent:Lbsh/Node;

.field protected transient parser:Lbsh/Parser;

.field private sourceFile:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lbsh/SimpleNode;->lastRet:I

    .line 9
    .line 10
    iput p1, p0, Lbsh/SimpleNode;->id:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public add(Lbsh/Node;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    new-array v1, v0, [Lbsh/Node;

    .line 8
    .line 9
    iget-object v2, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    iget v4, p0, Lbsh/SimpleNode;->cursor:I

    .line 13
    .line 14
    invoke-static {v2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 18
    .line 19
    iget v3, p0, Lbsh/SimpleNode;->cursor:I

    .line 20
    .line 21
    add-int/lit8 v4, v3, 0x1

    .line 22
    .line 23
    sub-int/2addr v0, v3

    .line 24
    add-int/lit8 v0, v0, -0x1

    .line 25
    .line 26
    invoke-static {v2, v3, v1, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 30
    .line 31
    iget v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 32
    .line 33
    add-int/lit8 v2, v0, 0x1

    .line 34
    .line 35
    iput v2, p0, Lbsh/SimpleNode;->cursor:I

    .line 36
    .line 37
    aput-object p1, v1, v0

    .line 38
    .line 39
    const/4 v0, -0x1

    .line 40
    iput v0, p0, Lbsh/SimpleNode;->lastRet:I

    .line 41
    .line 42
    invoke-interface {p1, p0}, Lbsh/Node;->jjtSetParent(Lbsh/Node;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 46
    check-cast p1, Lbsh/Node;

    invoke-virtual {p0, p1}, Lbsh/SimpleNode;->add(Lbsh/Node;)V

    return-void
.end method

.method public dump(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 16
    .line 17
    array-length v2, v1

    .line 18
    if-ge v0, v2, :cond_1

    .line 19
    .line 20
    aget-object v1, v1, v0

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, " "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v1, v2}, Lbsh/Node;->dump(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p1, Lbsh/InterpreterError;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, "Unimplemented or inappropriate for "

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-direct {p1, p2}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public getLineNumber()I
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, v0, Lbsh/Token;->beginLine:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, -0x1

    .line 9
    return v0
.end method

.method public getSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->sourceFile:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/SimpleNode;->parent:Lbsh/Node;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lbsh/Node;->getSourceFile()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v0, "<unknown file>"

    .line 15
    .line 16
    :cond_1
    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->firstToken:Lbsh/Token;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    :goto_0
    iget-object v2, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lbsh/SimpleNode;->lastToken:Lbsh/Token;

    .line 16
    .line 17
    if-eq v0, v2, :cond_4

    .line 18
    .line 19
    iget-object v2, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "{"

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_4

    .line 28
    .line 29
    iget-object v2, v0, Lbsh/Token;->image:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, ";"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v2, v0, Lbsh/Token;->next:Lbsh/Token;

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget v3, v2, Lbsh/Token;->beginLine:I

    .line 46
    .line 47
    iget v4, v0, Lbsh/Token;->endLine:I

    .line 48
    .line 49
    if-gt v3, v4, :cond_2

    .line 50
    .line 51
    iget v3, v2, Lbsh/Token;->beginColumn:I

    .line 52
    .line 53
    iget v0, v0, Lbsh/Token;->endColumn:I

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    if-le v3, v0, :cond_3

    .line 58
    .line 59
    :cond_2
    const-string v0, " "

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_3
    move-object v0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0

    .line 71
    :cond_5
    invoke-virtual {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public jjtAddChild(Lbsh/Node;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 v0, p2, 0x1

    .line 6
    .line 7
    new-array v0, v0, [Lbsh/Node;

    .line 8
    .line 9
    iput-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    array-length v1, v0

    .line 13
    if-lt p2, v1, :cond_1

    .line 14
    .line 15
    add-int/lit8 v1, p2, 0x1

    .line 16
    .line 17
    new-array v1, v1, [Lbsh/Node;

    .line 18
    .line 19
    array-length v2, v0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 25
    .line 26
    :cond_1
    :goto_0
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 27
    .line 28
    aput-object p1, v0, p2

    .line 29
    .line 30
    return-void
.end method

.method public jjtClose()V
    .locals 0

    .line 1
    return-void
.end method

.method public jjtGetChild(I)Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public jjtGetChildren()[Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    new-array v0, v0, [Lbsh/Node;

    .line 7
    .line 8
    iput-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 11
    .line 12
    return-object v0
.end method

.method public jjtGetNumChildren()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    return v0
.end method

.method public jjtGetParent()Lbsh/Node;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/SimpleNode;->parent:Lbsh/Node;

    .line 2
    .line 3
    return-object v0
.end method

.method public jjtOpen()V
    .locals 0

    .line 1
    return-void
.end method

.method public jjtSetParent(Lbsh/Node;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/SimpleNode;->parent:Lbsh/Node;

    .line 2
    .line 3
    return-void
.end method

.method public next()Lbsh/Node;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 8
    .line 9
    iget v1, p0, Lbsh/SimpleNode;->cursor:I

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    iput v2, p0, Lbsh/SimpleNode;->cursor:I

    .line 14
    .line 15
    iput v1, p0, Lbsh/SimpleNode;->lastRet:I

    .line 16
    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lbsh/SimpleNode;->next()Lbsh/Node;

    move-result-object v0

    return-object v0
.end method

.method public nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 2
    .line 3
    return v0
.end method

.method public previous()Lbsh/Node;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/SimpleNode;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 8
    .line 9
    iget v1, p0, Lbsh/SimpleNode;->cursor:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    iput v1, p0, Lbsh/SimpleNode;->cursor:I

    .line 14
    .line 15
    iput v1, p0, Lbsh/SimpleNode;->lastRet:I

    .line 16
    .line 17
    aget-object v0, v0, v1

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public bridge synthetic previous()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0}, Lbsh/SimpleNode;->previous()Lbsh/Node;

    move-result-object v0

    return-object v0
.end method

.method public previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    return v0
.end method

.method public remove()V
    .locals 5

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->lastRet:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iput v0, p0, Lbsh/SimpleNode;->cursor:I

    .line 6
    .line 7
    iget-object v1, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    add-int/lit8 v2, v2, -0x1

    .line 11
    .line 12
    new-array v3, v2, [Lbsh/Node;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-static {v1, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 19
    .line 20
    iget v1, p0, Lbsh/SimpleNode;->cursor:I

    .line 21
    .line 22
    add-int/lit8 v4, v1, 0x1

    .line 23
    .line 24
    sub-int/2addr v2, v1

    .line 25
    invoke-static {v0, v4, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iput-object v3, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    iput v0, p0, Lbsh/SimpleNode;->lastRet:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public set(Lbsh/Node;)V
    .locals 2

    .line 1
    iget v0, p0, Lbsh/SimpleNode;->lastRet:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lbsh/SimpleNode;->children:[Lbsh/Node;

    .line 6
    .line 7
    aput-object p1, v1, v0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 16
    check-cast p1, Lbsh/Node;

    invoke-virtual {p0, p1}, Lbsh/SimpleNode;->set(Lbsh/Node;)V

    return-void
.end method

.method public setSourceFile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbsh/SimpleNode;->sourceFile:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    sget-object v0, Lbsh/ParserTreeConstants;->jjtNodeName:[Ljava/lang/String;

    iget v1, p0, Lbsh/SimpleNode;->id:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method
