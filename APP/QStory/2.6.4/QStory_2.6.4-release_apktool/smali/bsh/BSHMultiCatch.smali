.class public Lbsh/BSHMultiCatch;
.super Lbsh/SimpleNode;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final UNTYPED:Ljava/lang/Class; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public isFinal:Z

.field public name:Ljava/lang/String;

.field public types:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lbsh/BSHMultiCatch;->isFinal:Z

    .line 6
    .line 7
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

.method public countTypes()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->jjtGetNumChildren()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0
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
    iget-object v0, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->countTypes()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    new-array v0, v0, [Ljava/lang/Class;

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->isUntyped()Z

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
    iget-object p1, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

    .line 22
    .line 23
    sget-object p2, Lbsh/BSHMultiCatch;->UNTYPED:Ljava/lang/Class;

    .line 24
    .line 25
    aput-object p2, p1, v1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->countTypes()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ge v1, v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lbsh/BSHMultiCatch;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lbsh/BSHType;

    .line 41
    .line 42
    invoke-virtual {v2, p1, p2}, Lbsh/BSHType;->getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aput-object v2, v0, v1

    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    :goto_1
    iget-object p0, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

    .line 52
    .line 53
    return-object p0
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

.method public getTypes()[Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/BSHMultiCatch;->types:[Ljava/lang/Class;

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

.method public isFinal()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lbsh/BSHMultiCatch;->isFinal:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->countTypes()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-le p0, v1, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public isUntyped()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BSHMultiCatch;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lbsh/BSHMultiCatch;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", final="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean p0, p0, Lbsh/BSHMultiCatch;->isFinal:Z

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public bridge synthetic toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 38
    invoke-super {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
