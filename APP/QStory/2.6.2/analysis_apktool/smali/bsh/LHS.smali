.class Lbsh/LHS;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lbsh/飘花落叶言子世兰哲苏楪;
.implements Ljava/io/Serializable;


# static fields
.field static final FIELD:I = 0x1

.field static final INDEX:I = 0x3

.field static final LOOSETYPE_FIELD:I = 0x5

.field static final MAP_ENTRY:I = 0x6

.field static final METHOD_EVAL:I = 0x4

.field static final PROPERTY:I = 0x2

.field static final VARIABLE:I = 0x0

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field field:Lbsh/飘花落叶言子世哲苏楪兰;

.field index:I

.field localVar:Z

.field nameSpace:Lbsh/NameSpace;

.field object:Ljava/lang/Object;

.field propName:Ljava/lang/Object;

.field type:I

.field var:Lbsh/Variable;

.field varName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 28
    iput v0, p0, Lbsh/LHS;->type:I

    .line 29
    iput-object p2, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 30
    iput-object p1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;Z)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput v0, p0, Lbsh/LHS;->type:I

    .line 40
    iput-boolean p3, p0, Lbsh/LHS;->localVar:Z

    .line 41
    iput-object p2, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 42
    iput-object p1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    return-void
.end method

.method public constructor <init>(Lbsh/飘花落叶言子世哲苏楪兰;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 32
    iput v0, p0, Lbsh/LHS;->type:I

    .line 33
    iget-object v0, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 34
    iput-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 35
    iput-object p1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 36
    iget-object p1, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 37
    iput-object p1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x6

    .line 49
    iput v0, p0, Lbsh/LHS;->type:I

    .line 50
    iput-object p1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;I)V
    .locals 1

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 52
    iput v0, p0, Lbsh/LHS;->type:I

    .line 53
    iput-object p1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 54
    iput p2, p0, Lbsh/LHS;->index:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lbsh/飘花落叶言子世哲苏楪兰;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lbsh/LHS;->type:I

    .line 8
    .line 9
    iput-object p1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p1, p2, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    const-string p0, "constructed empty LHS"

    .line 21
    .line 22
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x2

    .line 44
    iput v0, p0, Lbsh/LHS;->type:I

    .line 45
    iput-object p1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 46
    iput-object p2, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    return-void

    .line 47
    :cond_0
    const-string p0, "constructed empty LHS"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private getValueImpl()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lbsh/LHS;->type:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 7
    .line 8
    iget-object p0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, p0, v1}, Lbsh/NameSpace;->getVariableOrProperty(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    :try_start_0
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 19
    .line 20
    const-string v1, "get value, field cannot be null"

    .line 21
    .line 22
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    new-array v2, v2, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object p0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    new-instance v1, Lbsh/UtilEvalError;

    .line 37
    .line 38
    iget-object p0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "Can\'t read field: "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    const/4 v2, 0x2

    .line 59
    if-ne v0, v2, :cond_2

    .line 60
    .line 61
    :try_start_1
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v1, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 69
    return-object p0

    .line 70
    :catch_1
    move-exception v0

    .line 71
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v1, Lbsh/UtilEvalError;

    .line 83
    .line 84
    iget-object p0, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "No such property: "

    .line 89
    .line 90
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-direct {v1, p0, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_2
    const/4 v2, 0x3

    .line 105
    if-ne v0, v2, :cond_3

    .line 106
    .line 107
    :try_start_2
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 108
    .line 109
    iget p0, p0, Lbsh/LHS;->index:I

    .line 110
    .line 111
    invoke-static {p0, v0}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 115
    return-object p0

    .line 116
    :catch_2
    move-exception p0

    .line 117
    new-instance v0, Lbsh/UtilEvalError;

    .line 118
    .line 119
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "Array access: "

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :cond_3
    const/4 v2, 0x5

    .line 138
    if-ne v0, v2, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 141
    .line 142
    iget-object p0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, p0}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_4
    const-string p0, "LHS type"

    .line 150
    .line 151
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 14
    .line 15
    instance-of v1, v0, Ljava/lang/Class;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    move-object p1, v0

    .line 20
    check-cast p1, Ljava/lang/Class;

    .line 21
    .line 22
    :cond_1
    sget-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lbsh/飘花落叶言子楪苏世兰哲;

    .line 29
    .line 30
    iget-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 31
    .line 32
    iget-object p1, p1, Lbsh/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 47
    .line 48
    :goto_0
    iput-object p1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 49
    .line 50
    return-void
.end method

.method private declared-synchronized writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object v1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
.end method


# virtual methods
.method public assign(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 394
    invoke-virtual {p0, p1, v0}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public assign(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lbsh/LHS;->type:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lbsh/LHS;->localVar:Z

    .line 6
    .line 7
    iget-object v1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 8
    .line 9
    iget-object v2, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v2, p1, p2}, Lbsh/NameSpace;->setLocalVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v1, v2, p1, p2}, Lbsh/NameSpace;->setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p2, 0x1

    .line 26
    if-ne v0, p2, :cond_3

    .line 27
    .line 28
    :try_start_0
    iget-object p2, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 29
    .line 30
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p2}, Lbsh/飘花落叶言子世哲苏楪兰;->getModifiers()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 45
    .line 46
    iget-object v1, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 47
    .line 48
    iget-object v0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p2, v1, v0, p1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception p1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 61
    .line 62
    iget-object v1, v1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p2, v0, v1, p1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    iget-object p2, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 68
    .line 69
    const-string v0, "assign value, field cannot be null"

    .line 70
    .line 71
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 75
    .line 76
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p2, v0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    return-object p0

    .line 88
    :goto_2
    new-instance p2, Lbsh/UtilEvalError;

    .line 89
    .line 90
    iget-object p0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 91
    .line 92
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 93
    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v1, "LHS ("

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p0, ") can\'t access field: "

    .line 105
    .line 106
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-direct {p2, p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw p2

    .line 120
    :cond_3
    const/4 v1, 0x2

    .line 121
    const-string v2, "Assignment: "

    .line 122
    .line 123
    if-ne v0, v1, :cond_7

    .line 124
    .line 125
    :try_start_1
    iget-object p2, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 126
    .line 127
    instance-of v0, p2, Ljava/lang/String;
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 128
    .line 129
    iget-object v1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    :try_start_2
    check-cast p2, Ljava/lang/String;

    .line 134
    .line 135
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 136
    .line 137
    sget-object v0, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 138
    .line 139
    instance-of v0, v1, Ljava/util/Map$Entry;
    :try_end_2
    .catch Lbsh/ReflectError; {:try_start_2 .. :try_end_2} :catch_1

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    const-string v0, "val"

    .line 144
    .line 145
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_4

    .line 150
    .line 151
    const-string v0, "value"

    .line 152
    .line 153
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_4

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_4
    :try_start_3
    check-cast v1, Ljava/util/Map$Entry;

    .line 161
    .line 162
    invoke-interface {v1, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0

    .line 167
    :cond_5
    :goto_3
    invoke-static {v1, p2, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    return-object p0

    .line 172
    :catch_1
    move-exception p1

    .line 173
    goto :goto_4

    .line 174
    :cond_6
    invoke-static {v1, p2, p1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0
    :try_end_3
    .catch Lbsh/ReflectError; {:try_start_3 .. :try_end_3} :catch_1

    .line 178
    return-object p0

    .line 179
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    new-instance p2, Lbsh/UtilEvalError;

    .line 203
    .line 204
    iget-object p0, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 205
    .line 206
    new-instance v0, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v1, "No such property: "

    .line 209
    .line 210
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-direct {p2, p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    throw p2

    .line 224
    :cond_7
    const/4 v1, 0x3

    .line 225
    if-ne v0, v1, :cond_a

    .line 226
    .line 227
    :try_start_4
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 234
    .line 235
    .line 236
    move-result v0
    :try_end_4
    .catch Lbsh/UtilTargetError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 237
    if-eqz v0, :cond_8

    .line 238
    .line 239
    if-eqz p1, :cond_8

    .line 240
    .line 241
    :try_start_5
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {p1, v0, p2}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 255
    :catch_2
    :cond_8
    :try_start_6
    iget-object p2, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 256
    .line 257
    iget p0, p0, Lbsh/LHS;->index:I

    .line 258
    .line 259
    invoke-static {p2, p0, p1}, Lbsh/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_6
    .catch Lbsh/UtilTargetError; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 260
    .line 261
    .line 262
    return-object p1

    .line 263
    :catch_3
    move-exception p0

    .line 264
    new-instance p1, Lbsh/UtilEvalError;

    .line 265
    .line 266
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    new-instance v0, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    throw p1

    .line 286
    :catch_4
    move-exception p0

    .line 287
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    const-class p2, Ljava/lang/IndexOutOfBoundsException;

    .line 296
    .line 297
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 298
    .line 299
    .line 300
    move-result p1

    .line 301
    if-eqz p1, :cond_9

    .line 302
    .line 303
    new-instance p1, Lbsh/UtilEvalError;

    .line 304
    .line 305
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v1, "Error array set index: "

    .line 312
    .line 313
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    invoke-direct {p1, p2, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw p1

    .line 327
    :cond_9
    throw p0

    .line 328
    :cond_a
    const/4 p2, 0x5

    .line 329
    if-ne v0, p2, :cond_c

    .line 330
    .line 331
    new-instance p2, Lbsh/Modifiers;

    .line 332
    .line 333
    invoke-direct {p2, v1}, Lbsh/Modifiers;-><init>(I)V

    .line 334
    .line 335
    .line 336
    const-string v0, "public"

    .line 337
    .line 338
    invoke-virtual {p2, v0}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 342
    .line 343
    iget-boolean v0, v0, Lbsh/NameSpace;->isInterface:Z

    .line 344
    .line 345
    if-eqz v0, :cond_b

    .line 346
    .line 347
    invoke-virtual {p2}, Lbsh/Modifiers;->setConstant()V

    .line 348
    .line 349
    .line 350
    :cond_b
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 351
    .line 352
    iget-object p0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 353
    .line 354
    const/4 v1, 0x0

    .line 355
    invoke-static {p1, v1}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v0, p0, v1, p1, p2}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 360
    .line 361
    .line 362
    return-object p1

    .line 363
    :cond_c
    const/4 p2, 0x6

    .line 364
    if-ne v0, p2, :cond_e

    .line 365
    .line 366
    iget-object p2, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 367
    .line 368
    instance-of v0, p2, Ljava/util/Map$Entry;

    .line 369
    .line 370
    if-eqz v0, :cond_d

    .line 371
    .line 372
    check-cast p2, Ljava/util/Map$Entry;

    .line 373
    .line 374
    invoke-interface {p2, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    return-object p0

    .line 379
    :cond_d
    new-instance p2, Lbsh/Types$MapEntry;

    .line 380
    .line 381
    iget-object p0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-direct {p2, p0, p1}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    return-object p2

    .line 387
    :cond_e
    const-string p0, "unknown lhs type"

    .line 388
    .line 389
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    const/4 p0, 0x0

    .line 393
    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    iget-object p0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method public getType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lbsh/LHS;->getVariable()Lbsh/Variable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 17
    .line 18
    invoke-virtual {p0}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {p0, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-object p0

    .line 33
    :catch_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lbsh/LHS;->type:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 7
    .line 8
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->getModifiers()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 23
    .line 24
    iget-object v2, v1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 25
    .line 26
    iget-object v1, v1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lbsh/Interpreter;->mainSecurityGuard:L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;

    .line 33
    .line 34
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 35
    .line 36
    iget-object v1, v1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0}, L飘花落叶言楪子世哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public getVariable()Lbsh/Variable;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    sget-object v4, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {v0, v3, v1}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 19
    .line 20
    .line 21
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    iput-object v2, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    invoke-virtual {p0}, Lbsh/LHS;->isStatic()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 32
    .line 33
    iget-object v0, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    iget-object v0, v3, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世苏哲(Ljava/lang/Class;)Lbsh/NameSpace;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    :try_start_1
    invoke-virtual {v0, v3, v1}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 57
    .line 58
    .line 59
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    :catch_1
    :goto_0
    iput-object v2, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    new-instance v0, Lbsh/Variable;

    .line 64
    .line 65
    iget-object v1, v3, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v3}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v0, v1, v2, p0}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪苏兰哲(Ljava/lang/Class;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v0}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;)Lbsh/NameSpace;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    :try_start_2
    invoke-virtual {v0, v3, v1}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 103
    .line 104
    .line 105
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 106
    :catch_2
    :goto_1
    iput-object v2, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 110
    .line 111
    if-eqz v0, :cond_7

    .line 112
    .line 113
    new-instance v1, Lbsh/Variable;

    .line 114
    .line 115
    iget-object v2, v0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {v1, v2, v0, p0}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 122
    .line 123
    .line 124
    iput-object v1, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 125
    .line 126
    :cond_7
    :goto_2
    iget-object p0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 127
    .line 128
    return-object p0
.end method

.method public isFinal()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/LHS;->getVariable()Lbsh/Variable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-object p0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 10
    .line 11
    const-string v0, "final"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public isStatic()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世兰苏()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    const-string v0, "static"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LHS: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v3, "field = "

    .line 17
    .line 18
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lbsh/LHS;->field:Lbsh/飘花落叶言子世哲苏楪兰;

    .line 22
    .line 23
    iget-object v3, v3, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v3, " varName = "

    .line 44
    .line 45
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v3, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v1, v2

    .line 59
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v2, " nameSpace = "

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 74
    .line 75
    invoke-virtual {p0}, Lbsh/NameSpace;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
