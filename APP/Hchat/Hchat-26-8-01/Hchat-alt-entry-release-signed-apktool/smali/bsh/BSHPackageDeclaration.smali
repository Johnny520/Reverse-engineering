.class public Lbsh/BSHPackageDeclaration;
.super Lbsh/SimpleNode;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field private static final serialVersionUID:J = 0x1L


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
.method public bridge synthetic add(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->add(Lbsh/Node;)V

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
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p0, p2}, Lbsh/BSHPackageDeclaration;->jjtGetChild(I)Lbsh/Node;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Lbsh/BSHAmbiguousName;

    .line 7
    .line 8
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p2, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lbsh/NameSpace;->setPackage(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p2, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lbsh/NameSpace;->importPackage(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 23
    .line 24
    return-object p1
.end method

.method public bridge synthetic getId()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getLineNumber()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getLineNumber()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic getSourceFile()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getSourceFile()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->getText()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic hasNext()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic hasPrevious()Z
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtAddChild(Lbsh/Node;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/SimpleNode;->jjtAddChild(Lbsh/Node;I)V

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

.method public bridge synthetic jjtGetChild(I)Lbsh/Node;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic jjtGetChildren()[Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetChildren()[Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic jjtGetNumChildren()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic jjtGetParent()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->jjtGetParent()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public bridge synthetic jjtSetParent(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->jjtSetParent(Lbsh/Node;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic next()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->next()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic nextIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->nextIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public bridge synthetic previous()Lbsh/Node;
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previous()Lbsh/Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic previousIndex()I
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->previousIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public bridge synthetic set(Lbsh/Node;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lbsh/SimpleNode;->set(Lbsh/Node;)V

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
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/SimpleNode;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    invoke-super {p0, p1}, Lbsh/SimpleNode;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
