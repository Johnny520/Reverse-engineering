.class Lbsh/BSHType;
.super Lbsh/SimpleNode;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lbsh/飘花落叶言子楪苏世哲兰;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private arrayDims:I

.field private baseType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field descriptor:Ljava/lang/String;

.field private isListener:Z

.field private type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
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
    iput-boolean p1, p0, Lbsh/BSHType;->isListener:Z

    .line 6
    .line 7
    return-void
.end method

.method public static getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 150
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    const-string p0, "Z"

    return-object p0

    .line 151
    :cond_0
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    const-string p0, "C"

    return-object p0

    .line 152
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_2

    const-string p0, "B"

    return-object p0

    .line 153
    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_3

    const-string p0, "S"

    return-object p0

    .line 154
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_4

    const-string p0, "I"

    return-object p0

    .line 155
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_5

    const-string p0, "J"

    return-object p0

    .line 156
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_6

    const-string p0, "F"

    return-object p0

    .line 157
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_7

    const-string p0, "D"

    return-object p0

    .line 158
    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_8

    const-string p0, "V"

    return-object p0

    .line 159
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x2e

    const/16 v1, 0x2f

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    .line 160
    const-string v2, "["

    invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    const-string v2, ";"

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_0

    .line 161
    :cond_9
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "L"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_a
    :goto_0
    return-object p0
.end method


# virtual methods
.method public addArrayDimension()V
    .locals 1

    .line 1
    iget v0, p0, Lbsh/BSHType;->arrayDims:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lbsh/BSHType;->arrayDims:I

    .line 6
    .line 7
    return-void
.end method

.method public classLoaderChanged()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lbsh/BSHType;->type:Ljava/lang/Class;

    .line 3
    .line 4
    iput-object v0, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method

.method public getArrayDims()I
    .locals 0

    .line 1
    iget p0, p0, Lbsh/BSHType;->arrayDims:I

    .line 2
    .line 3
    return p0
.end method

.method public getBaseType()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public getType(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/CallStack;",
            "Lbsh/Interpreter;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BSHType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHType;->getTypeNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lbsh/BSHPrimitiveType;

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Lbsh/BSHPrimitiveType;

    .line 18
    .line 19
    invoke-virtual {v0}, Lbsh/BSHPrimitiveType;->getType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :try_start_0
    move-object v1, v0

    .line 27
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 28
    .line 29
    invoke-virtual {v1, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v1

    .line 37
    invoke-interface {v0}, Lbsh/飘花落叶言子世兰苏楪哲;->getText()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-ne v0, v3, :cond_5

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    instance-of v0, v0, Ljava/lang/ClassNotFoundException;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iput-object v2, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 60
    .line 61
    :goto_0
    iget v0, p0, Lbsh/BSHType;->arrayDims:I

    .line 62
    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    :try_start_1
    new-array v0, v0, [I

    .line 66
    .line 67
    iget-object v1, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 68
    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v2, v1

    .line 73
    :goto_1
    invoke-static {v2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, Lbsh/BSHType;->type:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catch_1
    move-exception p2

    .line 85
    new-instance v0, Lbsh/EvalException;

    .line 86
    .line 87
    const-string v1, "Couldn\'t construct array type"

    .line 88
    .line 89
    invoke-direct {v0, v1, p0, p1, p2}, Lbsh/EvalException;-><init>(Ljava/lang/String;Lbsh/飘花落叶言子世兰苏楪哲;Lbsh/CallStack;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_3
    iget-object p1, p0, Lbsh/BSHType;->baseType:Ljava/lang/Class;

    .line 94
    .line 95
    iput-object p1, p0, Lbsh/BSHType;->type:Ljava/lang/Class;

    .line 96
    .line 97
    :goto_2
    iget-boolean p1, p0, Lbsh/BSHType;->isListener:Z

    .line 98
    .line 99
    if-nez p1, :cond_4

    .line 100
    .line 101
    invoke-virtual {p2}, Lbsh/Interpreter;->getClassManager()Lbsh/飘花落叶言子楪苏哲世兰;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V

    .line 106
    .line 107
    .line 108
    iput-boolean v3, p0, Lbsh/BSHType;->isListener:Z

    .line 109
    .line 110
    :cond_4
    iget-object p0, p0, Lbsh/BSHType;->type:Ljava/lang/Class;

    .line 111
    .line 112
    return-object p0

    .line 113
    :cond_5
    throw v1
.end method

.method public getTypeDescriptor(Lbsh/CallStack;Lbsh/Interpreter;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/BSHType;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lbsh/BSHType;->getTypeNode()Lbsh/飘花落叶言子世兰苏楪哲;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    instance-of v1, v0, Lbsh/BSHPrimitiveType;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast v0, Lbsh/BSHPrimitiveType;

    .line 15
    .line 16
    iget-object p1, v0, Lbsh/BSHPrimitiveType;->type:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p1}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :cond_1
    move-object v1, v0

    .line 25
    check-cast v1, Lbsh/BSHAmbiguousName;

    .line 26
    .line 27
    iget-object v1, v1, Lbsh/BSHAmbiguousName;->text:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1}, Lbsh/CallStack;->top()Lbsh/NameSpace;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v2, v2, Lbsh/NameSpace;->importedClasses:Ljava/util/Map;

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    const/16 v3, 0x2e

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    :try_start_0
    check-cast v0, Lbsh/BSHAmbiguousName;

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, Lbsh/BSHAmbiguousName;->toClass(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4
    :try_end_0
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/4 p2, 0x1

    .line 58
    if-ne p1, p2, :cond_3

    .line 59
    .line 60
    const-string p1, "java.lang.Object"

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/16 p1, 0x24

    .line 65
    .line 66
    invoke-virtual {v2, v3, p1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    :goto_0
    if-eqz v4, :cond_4

    .line 71
    .line 72
    invoke-static {v4}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const-string p1, ";"

    .line 78
    .line 79
    const/16 p2, 0x2f

    .line 80
    .line 81
    const-string v0, "L"

    .line 82
    .line 83
    if-eqz p3, :cond_6

    .line 84
    .line 85
    invoke-static {v1}, Lbsh/Name;->isCompound(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3, v3, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p2, "/"

    .line 105
    .line 106
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v1, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    goto :goto_2

    .line 114
    :cond_6
    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v3, p2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_2
    const/4 p2, 0x0

    .line 134
    :goto_3
    iget p3, p0, Lbsh/BSHType;->arrayDims:I

    .line 135
    .line 136
    if-ge p2, p3, :cond_7

    .line 137
    .line 138
    const-string p3, "["

    .line 139
    .line 140
    invoke-static {p3, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    add-int/lit8 p2, p2, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    iput-object p1, p0, Lbsh/BSHType;->descriptor:Ljava/lang/String;

    .line 148
    .line 149
    return-object p1
.end method

.method public getTypeNode()Lbsh/飘花落叶言子世兰苏楪哲;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lbsh/SimpleNode;->jjtGetChild(I)Lbsh/飘花落叶言子世兰苏楪哲;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
