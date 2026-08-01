.class public Lbsh/BSHPackageDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/SimpleNode;-><init>(I)V

    .line 2
    .line 3
    .line 4
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
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p2}, Lbsh/BSHPackageDeclaration;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lbsh/BSHAmbiguousName;

    .line 7
    .line 8
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lbsh/NameSpace;->setPackage(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 23
    .line 24
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
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

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
