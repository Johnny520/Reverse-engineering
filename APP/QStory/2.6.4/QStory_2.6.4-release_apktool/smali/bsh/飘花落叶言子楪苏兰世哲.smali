.class public final Lbsh/飘花落叶言子楪苏兰世哲;
.super Lbsh/飘花落叶言子楪哲世苏兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lbsh/NameSpace;

.field public final 飘花落叶言子楪苏世兰哲:[Ljava/lang/Class;

.field public final 飘花落叶言子楪苏世哲兰:[Lbsh/Modifiers;

.field public final 飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

.field public final 飘花落叶言子楪苏哲兰世:Lbsh/飘花落叶言子世兰苏楪哲;


# direct methods
.method public constructor <init>(Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/NameSpace;[Lbsh/Modifiers;[Ljava/lang/Class;[Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子楪哲世苏兰;-><init>(Lbsh/飘花落叶言子世兰苏楪哲;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lbsh/NameSpace;->toLambdaNameSpace()Lbsh/NameSpace;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p2, p1

    .line 13
    :goto_0
    iput-object p2, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Lbsh/NameSpace;

    .line 14
    .line 15
    iput-object p3, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:[Lbsh/Modifiers;

    .line 16
    .line 17
    iput-object p4, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:[Ljava/lang/Class;

    .line 18
    .line 19
    iput-object p5, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 20
    .line 21
    iput-object p6, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 22
    .line 23
    array-length p0, p3

    .line 24
    array-length p2, p4

    .line 25
    if-ne p0, p2, :cond_1

    .line 26
    .line 27
    array-length p0, p4

    .line 28
    array-length p2, p5

    .line 29
    if-ne p0, p2, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "The length of \'paramsModifiers\', \'paramsTypes\' and \'paramsNames\' can\'t be different!"

    .line 33
    .line 34
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;I)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:[Ljava/lang/Class;

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    array-length v1, p1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-static {p0, p1, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪兰哲苏世([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲:[Ljava/lang/Class;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ne v0, v2, :cond_4

    .line 6
    .line 7
    new-instance v0, Lbsh/NameSpace;

    .line 8
    .line 9
    iget-object v2, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏:Lbsh/NameSpace;

    .line 10
    .line 11
    const-string v3, "LambdaExpression"

    .line 12
    .line 13
    invoke-direct {v0, v2, v3}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    iget-object v4, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲世兰:[Ljava/lang/String;

    .line 19
    .line 20
    array-length v5, v4

    .line 21
    if-ge v3, v5, :cond_1

    .line 22
    .line 23
    aget-object v5, v1, v3

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    aget-object v4, v4, v3

    .line 28
    .line 29
    aget-object v6, p1, v3

    .line 30
    .line 31
    iget-object v7, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:[Lbsh/Modifiers;

    .line 32
    .line 33
    aget-object v7, v7, v3

    .line 34
    .line 35
    invoke-virtual {v0, v4, v5, v6, v7}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    aget-object v4, v4, v3

    .line 40
    .line 41
    aget-object v5, p1, v3

    .line 42
    .line 43
    invoke-virtual {v0, v4, v5, v2}, Lbsh/NameSpace;->setVariable(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 44
    .line 45
    .line 46
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance p1, Lbsh/CallStack;

    .line 50
    .line 51
    invoke-direct {p1, v0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lbsh/Interpreter;

    .line 55
    .line 56
    invoke-direct {v1, v0}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏哲兰世:Lbsh/飘花落叶言子世兰苏楪哲;

    .line 60
    .line 61
    instance-of v0, p0, Lbsh/BSHBlock;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-interface {p0, p1, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    instance-of p1, p0, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    check-cast p0, Lbsh/飘花落叶言子苏楪兰哲世;

    .line 74
    .line 75
    iget p1, p0, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 76
    .line 77
    const/16 v0, 0x2f

    .line 78
    .line 79
    if-ne p1, v0, :cond_2

    .line 80
    .line 81
    iget-object p0, p0, Lbsh/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_2
    const/4 p0, 0x0

    .line 85
    return-object p0

    .line 86
    :cond_3
    invoke-interface {p0, p1, v1}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_4
    new-instance p0, Lbsh/UtilEvalError;

    .line 92
    .line 93
    const-string p1, "Wrong number of arguments!"

    .line 94
    .line 95
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0
.end method
