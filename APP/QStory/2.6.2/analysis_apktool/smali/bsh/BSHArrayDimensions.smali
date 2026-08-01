.class Lbsh/BSHArrayDimensions;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public baseType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public definedDimensions:[I

.field public numDefinedDims:I

.field public numUndefinedDims:I


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
.method public addDefinedDimension()V
    .locals 1

    .line 1
    iget v0, p0, Lbsh/BSHArrayDimensions;->numDefinedDims:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/BSHArrayDimensions;->numDefinedDims:I

    .line 6
    .line 7
    return-void
.end method

.method public addUndefinedDimension()V
    .locals 1

    .line 1
    iget v0, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 6
    .line 7
    return-void
.end method

.method public eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v2, v1, Lbsh/BSHArrayInitializer;

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    check-cast v1, Lbsh/BSHArrayInitializer;

    .line 11
    .line 12
    iget-object v0, p0, Lbsh/BSHArrayDimensions;->baseType:Ljava/lang/Class;

    .line 13
    .line 14
    iget v2, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 15
    .line 16
    invoke-virtual {v1, v0, v2, p1, p2}, Lbsh/BSHArrayInitializer;->eval(Ljava/lang/Class;ILbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {p2}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)[I

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lbsh/BSHArrayDimensions;->definedDimensions:[I

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    iget v2, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    array-length v1, v0

    .line 43
    iput v1, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 44
    .line 45
    :cond_1
    array-length v0, v0

    .line 46
    iget v1, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    :goto_0
    return-object p2

    .line 51
    :cond_2
    new-instance p2, Lbsh/EvalException;

    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v1, "Incompatible initializer. Allocation calls for a "

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget v1, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, " dimensional array, but initializer is a "

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Lbsh/BSHArrayDimensions;->definedDimensions:[I

    .line 71
    .line 72
    array-length v1, v1

    .line 73
    const-string v2, " dimensional array"

    .line 74
    .line 75
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p2, v0, p0, p1}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_3
    iget v1, p0, Lbsh/BSHArrayDimensions;->numDefinedDims:I

    .line 84
    .line 85
    new-array v1, v1, [I

    .line 86
    .line 87
    iput-object v1, p0, Lbsh/BSHArrayDimensions;->definedDimensions:[I

    .line 88
    .line 89
    :goto_1
    iget v1, p0, Lbsh/BSHArrayDimensions;->numDefinedDims:I

    .line 90
    .line 91
    if-ge v0, v1, :cond_4

    .line 92
    .line 93
    :try_start_0
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v1, p1, p2}, Lbsh/飘花落叶言子世兰苏楪哲;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v2, p0, Lbsh/BSHArrayDimensions;->definedDimensions:[I

    .line 102
    .line 103
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v3, v1}, Lbsh/Primitive;->castWrapper(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    aput v1, v2, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    add-int/lit8 v0, v0, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catch_0
    move-exception p2

    .line 121
    new-instance v1, Lbsh/EvalException;

    .line 122
    .line 123
    const-string v2, "Array index: "

    .line 124
    .line 125
    const-string v3, " length does not evaluate to an integer"

    .line 126
    .line 127
    invoke-static {v0, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {v1, v0, p0, p1, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v1

    .line 135
    :cond_4
    sget-object p0, Lbsh/Primitive;->VOID:Lbsh/Primitive;

    .line 136
    .line 137
    return-object p0
.end method

.method public eval(Ljava/lang/Class;Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 138
    const-string v0, "array base type = "

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 139
    iput-object p1, p0, Lbsh/BSHArrayDimensions;->baseType:Ljava/lang/Class;

    .line 140
    invoke-virtual {p0, p2, p3}, Lbsh/BSHArrayDimensions;->eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
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
    iget v1, p0, Lbsh/BSHArrayDimensions;->numDefinedDims:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget p0, p0, Lbsh/BSHArrayDimensions;->numUndefinedDims:I

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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
