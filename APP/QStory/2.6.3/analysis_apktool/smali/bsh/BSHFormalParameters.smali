.class Lbsh/BSHFormalParameters;
.super Lbsh/SimpleNode;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lbsh/飘花落叶言子楪苏世哲兰;


# instance fields
.field isVarArgs:Z

.field private listener:Z

.field numArgs:I

.field private paramModifiers:[Lbsh/Modifiers;

.field private paramNames:[Ljava/lang/String;

.field paramTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field typeDescriptors:[Ljava/lang/String;


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
.method public classLoaderChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 0

    .line 38
    invoke-virtual {p0, p1, p2}, Lbsh/BSHFormalParameters;->eval(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)[Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHFormalParameters;->insureParsed()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 10
    .line 11
    new-array v0, v0, [Ljava/lang/Class;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lbsh/BSHFormalParameter;

    .line 23
    .line 24
    invoke-virtual {v2, p1, p2}, Lbsh/BSHFormalParameter;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Class;

    .line 29
    .line 30
    aput-object v2, v0, v1

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iput-object v0, p0, Lbsh/BSHFormalParameters;->paramTypes:[Ljava/lang/Class;

    .line 36
    .line 37
    return-object v0
.end method

.method public getParamModifiers()[Lbsh/Modifiers;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BSHFormalParameters;->insureParsed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbsh/BSHFormalParameters;->paramModifiers:[Lbsh/Modifiers;

    .line 5
    .line 6
    return-object p0
.end method

.method public getParamNames()[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/BSHFormalParameters;->insureParsed()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lbsh/BSHFormalParameters;->paramNames:[Ljava/lang/String;

    .line 5
    .line 6
    return-object p0
.end method

.method public getTypeDescriptors(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/BSHFormalParameters;->typeDescriptors:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHFormalParameters;->insureParsed()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 10
    .line 11
    new-array v0, v0, [Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    iget v2, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 15
    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lbsh/BSHFormalParameter;

    .line 23
    .line 24
    invoke-virtual {v2, p1, p2, p3}, Lbsh/BSHFormalParameter;->getTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    aput-object v2, v0, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iput-object v0, p0, Lbsh/BSHFormalParameters;->typeDescriptors:[Ljava/lang/String;

    .line 34
    .line 35
    return-object v0
.end method

.method public insureParsed()V
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/BSHFormalParameters;->paramNames:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/SimpleNode;->jjtGetNumChildren()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 11
    .line 12
    new-array v1, v0, [Ljava/lang/String;

    .line 13
    .line 14
    new-array v0, v0, [Lbsh/Modifiers;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    iget v3, p0, Lbsh/BSHFormalParameters;->numArgs:I

    .line 18
    .line 19
    if-ge v2, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lbsh/BSHFormalParameter;

    .line 26
    .line 27
    iget-boolean v4, v3, Lbsh/BSHFormalParameter;->isVarArgs:Z

    .line 28
    .line 29
    iput-boolean v4, p0, Lbsh/BSHFormalParameters;->isVarArgs:Z

    .line 30
    .line 31
    iget-object v4, v3, Lbsh/BSHFormalParameter;->name:Ljava/lang/String;

    .line 32
    .line 33
    aput-object v4, v1, v2

    .line 34
    .line 35
    new-instance v4, Lbsh/Modifiers;

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    invoke-direct {v4, v5}, Lbsh/Modifiers;-><init>(I)V

    .line 39
    .line 40
    .line 41
    aput-object v4, v0, v2

    .line 42
    .line 43
    iget-boolean v3, v3, Lbsh/BSHFormalParameter;->isFinal:Z

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    const-string v3, "final"

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iput-object v1, p0, Lbsh/BSHFormalParameters;->paramNames:[Ljava/lang/String;

    .line 56
    .line 57
    iput-object v0, p0, Lbsh/BSHFormalParameters;->paramModifiers:[Lbsh/Modifiers;

    .line 58
    .line 59
    return-void
.end method

.method public isListener()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/BSHFormalParameters;->listener:Z

    .line 2
    .line 3
    return p0
.end method

.method public setListener(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lbsh/BSHFormalParameters;->listener:Z

    .line 2
    .line 3
    return-void
.end method
