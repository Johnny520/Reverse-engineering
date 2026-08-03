.class Lbsh/LHS;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lbsh/ParserConstants;
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
.field field:Lbsh/Invocable;

.field index:I

.field localVar:Z

.field nameSpace:Lbsh/NameSpace;

.field object:Ljava/lang/Object;

.field propName:Ljava/lang/Object;

.field type:I

.field var:Lbsh/Variable;

.field varName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbsh/Invocable;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 34
    iput v0, p0, Lbsh/LHS;->type:I

    .line 35
    invoke-virtual {p1}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 36
    iput-object p1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 37
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x5

    .line 30
    iput v0, p0, Lbsh/LHS;->type:I

    .line 31
    iput-object p2, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 32
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

.method public constructor <init>(Ljava/lang/Object;Lbsh/Invocable;)V
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
    iput-object p2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :cond_1
    const-string p1, "constructed empty LHS"

    .line 23
    .line 24
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    throw p1
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
    const-string p1, "constructed empty LHS"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private getValueImpl()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lbsh/LHS;->type:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 6
    .line 7
    iget-object v1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Lbsh/NameSpace;->getVariableOrProperty(Ljava/lang/String;Lbsh/Interpreter;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

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
    invoke-virtual {v0, v1, v2}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object v0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    new-instance v1, Lbsh/UtilEvalError;

    .line 37
    .line 38
    iget-object v2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 39
    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v4, "Can\'t read field: "

    .line 43
    .line 44
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-direct {v1, v2, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    const/4 v1, 0x2

    .line 59
    if-ne v0, v1, :cond_2

    .line 60
    .line 61
    :try_start_1
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v1, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lbsh/Reflect;->getObjectProperty(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 69
    return-object v0

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
    iget-object v2, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 85
    .line 86
    new-instance v3, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v4, "No such property: "

    .line 89
    .line 90
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-direct {v1, v2, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_2
    const/4 v1, 0x3

    .line 105
    if-ne v0, v1, :cond_3

    .line 106
    .line 107
    :try_start_2
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 108
    .line 109
    iget v1, p0, Lbsh/LHS;->index:I

    .line 110
    .line 111
    invoke-static {v0, v1}, Lbsh/BshArray;->getIndex(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 115
    return-object v0

    .line 116
    :catch_2
    move-exception v0

    .line 117
    new-instance v1, Lbsh/UtilEvalError;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v3, "Array access: "

    .line 122
    .line 123
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-direct {v1, v2, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw v1

    .line 137
    :cond_3
    const/4 v1, 0x5

    .line 138
    if-ne v0, v1, :cond_4

    .line 139
    .line 140
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 141
    .line 142
    iget-object v1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lbsh/NameSpace;->getVariable(Ljava/lang/String;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :cond_4
    const-string v0, "LHS type"

    .line 150
    .line 151
    invoke-static {v0}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/4 v0, 0x0

    .line 155
    return-object v0
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
    sget-object v0, Lbsh/BshClassManager;->memberCache:Lbsh/util/ValueReferenceMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lbsh/util/ValueReferenceMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lbsh/BshClassManager$MemberCache;

    .line 29
    .line 30
    iget-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lbsh/BshClassManager$MemberCache;->findField(Ljava/lang/String;)Lbsh/Invocable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 37
    .line 38
    return-void
.end method

.method private declared-synchronized writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 13
    .line 14
    invoke-virtual {v0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method


# virtual methods
.method public assign(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p0, p1, v0}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1, v0, p1, p2}, Lbsh/NameSpace;->setLocalVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1, p2}, Lbsh/NameSpace;->setVariableOrProperty(Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 p2, 0x1

    .line 28
    if-ne v0, p2, :cond_3

    .line 29
    .line 30
    :try_start_0
    iget-object p2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 31
    .line 32
    invoke-static {p2}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_2

    .line 37
    .line 38
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 39
    .line 40
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 41
    .line 42
    invoke-virtual {v0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 47
    .line 48
    invoke-virtual {v1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p2, v0, v1, p1}, Lbsh/security/MainSecurityGuard;->canSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    sget-object p2, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 59
    .line 60
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 63
    .line 64
    invoke-virtual {v1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p2, v0, v1, p1}, Lbsh/security/MainSecurityGuard;->canSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    iget-object p2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 72
    .line 73
    const-string v0, "assign value, field cannot be null"

    .line 74
    .line 75
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 79
    .line 80
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p2, v0, p1}, Lbsh/Invocable;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    return-object p1

    .line 92
    :goto_2
    new-instance p2, Lbsh/UtilEvalError;

    .line 93
    .line 94
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 95
    .line 96
    invoke-virtual {v0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "LHS ("

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, ") can\'t access field: "

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    throw p2

    .line 126
    :cond_3
    const/4 v1, 0x2

    .line 127
    const-string v2, "Assignment: "

    .line 128
    .line 129
    if-ne v0, v1, :cond_5

    .line 130
    .line 131
    :try_start_1
    iget-object p2, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 132
    .line 133
    instance-of v0, p2, Ljava/lang/String;
    :try_end_1
    .catch Lbsh/ReflectError; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    .line 135
    iget-object v1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 136
    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    :try_start_2
    check-cast p2, Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v1, p2, p1}, Lbsh/Reflect;->setObjectProperty(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1

    .line 146
    :catch_1
    move-exception p1

    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-static {v1, p2, p1}, Lbsh/Reflect;->setObjectProperty(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1
    :try_end_2
    .catch Lbsh/ReflectError; {:try_start_2 .. :try_end_2} :catch_1

    .line 152
    return-object p1

    .line 153
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-static {p2}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance p2, Lbsh/UtilEvalError;

    .line 177
    .line 178
    iget-object v0, p0, Lbsh/LHS;->propName:Ljava/lang/Object;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "No such property: "

    .line 183
    .line 184
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    throw p2

    .line 198
    :cond_5
    const/4 v1, 0x3

    .line 199
    if-ne v0, v1, :cond_8

    .line 200
    .line 201
    :try_start_3
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 208
    .line 209
    .line 210
    move-result v0
    :try_end_3
    .catch Lbsh/UtilTargetError; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 211
    if-eqz v0, :cond_6

    .line 212
    .line 213
    if-eqz p1, :cond_6

    .line 214
    .line 215
    :try_start_4
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {p1, v0, p2}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 229
    :catch_2
    :cond_6
    :try_start_5
    iget-object p2, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 230
    .line 231
    iget v0, p0, Lbsh/LHS;->index:I

    .line 232
    .line 233
    invoke-static {p2, v0, p1}, Lbsh/BshArray;->setIndex(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_5
    .catch Lbsh/UtilTargetError; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 234
    .line 235
    .line 236
    return-object p1

    .line 237
    :catch_3
    move-exception p1

    .line 238
    goto :goto_4

    .line 239
    :catch_4
    move-exception p1

    .line 240
    goto :goto_5

    .line 241
    :goto_4
    new-instance p2, Lbsh/UtilEvalError;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    new-instance v1, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    throw p2

    .line 263
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object p2

    .line 271
    const-class v0, Ljava/lang/IndexOutOfBoundsException;

    .line 272
    .line 273
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 274
    .line 275
    .line 276
    move-result p2

    .line 277
    if-eqz p2, :cond_7

    .line 278
    .line 279
    new-instance p2, Lbsh/UtilEvalError;

    .line 280
    .line 281
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    new-instance v1, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v2, "Error array set index: "

    .line 288
    .line 289
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-direct {p2, v0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 300
    .line 301
    .line 302
    throw p2

    .line 303
    :cond_7
    throw p1

    .line 304
    :cond_8
    const/4 p2, 0x5

    .line 305
    if-ne v0, p2, :cond_a

    .line 306
    .line 307
    new-instance p2, Lbsh/Modifiers;

    .line 308
    .line 309
    invoke-direct {p2, v1}, Lbsh/Modifiers;-><init>(I)V

    .line 310
    .line 311
    .line 312
    const-string v0, "public"

    .line 313
    .line 314
    invoke-virtual {p2, v0}, Lbsh/Modifiers;->addModifier(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 318
    .line 319
    iget-boolean v0, v0, Lbsh/NameSpace;->isInterface:Z

    .line 320
    .line 321
    if-eqz v0, :cond_9

    .line 322
    .line 323
    invoke-virtual {p2}, Lbsh/Modifiers;->setConstant()V

    .line 324
    .line 325
    .line 326
    :cond_9
    iget-object v0, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 327
    .line 328
    iget-object v1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {p1}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v0, v1, v2, p1, p2}, Lbsh/NameSpace;->setTypedVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)V

    .line 335
    .line 336
    .line 337
    return-object p1

    .line 338
    :cond_a
    const/4 p2, 0x6

    .line 339
    if-ne v0, p2, :cond_c

    .line 340
    .line 341
    iget-object p2, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 342
    .line 343
    instance-of v0, p2, Ljava/util/Map$Entry;

    .line 344
    .line 345
    if-eqz v0, :cond_b

    .line 346
    .line 347
    check-cast p2, Ljava/util/Map$Entry;

    .line 348
    .line 349
    invoke-interface {p2, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    return-object p1

    .line 354
    :cond_b
    new-instance p2, Lbsh/Types$MapEntry;

    .line 355
    .line 356
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 357
    .line 358
    invoke-direct {p2, v0, p1}, Lbsh/Types$MapEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    return-object p2

    .line 362
    :cond_c
    const-string p1, "unknown lhs type"

    .line 363
    .line 364
    invoke-static {p1}, Lbsh/j;->f(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const/4 p1, 0x0

    .line 368
    return-object p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lbsh/Variable;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    iget-object v0, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 20
    .line 21
    return-object v0
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
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

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
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 17
    .line 18
    invoke-virtual {v0}, Lbsh/Variable;->getType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-object v0

    .line 32
    :catch_0
    const/4 v0, 0x0

    .line 33
    return-object v0
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
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 7
    .line 8
    invoke-static {v0}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 15
    .line 16
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 17
    .line 18
    invoke-virtual {v1}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 23
    .line 24
    invoke-virtual {v2}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v1, v2}, Lbsh/security/MainSecurityGuard;->canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lbsh/Interpreter;->mainSecurityGuard:Lbsh/security/MainSecurityGuard;

    .line 33
    .line 34
    iget-object v1, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 37
    .line 38
    invoke-virtual {v2}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-direct {p0}, Lbsh/LHS;->getValueImpl()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method

.method public getVariable()Lbsh/Variable;
    .locals 3

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
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lbsh/Reflect;->getVariable(Lbsh/NameSpace;Ljava/lang/String;)Lbsh/Variable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lbsh/LHS;->isStatic()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 28
    .line 29
    invoke-virtual {v0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0, v1}, Lbsh/Reflect;->getVariable(Ljava/lang/Class;Ljava/lang/String;)Lbsh/Variable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance v0, Lbsh/Variable;

    .line 57
    .line 58
    invoke-virtual {v1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 63
    .line 64
    invoke-virtual {v2}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v0, v1, v2, p0}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lbsh/Reflect;->isGeneratedClass(Ljava/lang/Class;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    iget-object v0, p0, Lbsh/LHS;->object:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-virtual {p0}, Lbsh/LHS;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0, v1}, Lbsh/Reflect;->getVariable(Ljava/lang/Object;Ljava/lang/String;)Lbsh/Variable;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    new-instance v1, Lbsh/Variable;

    .line 104
    .line 105
    invoke-virtual {v0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v2, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 110
    .line 111
    invoke-virtual {v2}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {v1, v0, v2, p0}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 119
    .line 120
    :cond_5
    :goto_0
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 121
    .line 122
    return-object v0
.end method

.method public isFinal()Z
    .locals 2

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
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 10
    .line 11
    const-string v1, "final"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public isStatic()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/Invocable;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Lbsh/LHS;->var:Lbsh/Variable;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    const-string v1, "static"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lbsh/Variable;->hasModifier(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0
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
    iget-object v1, p0, Lbsh/LHS;->field:Lbsh/Invocable;

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
    iget-object v3, p0, Lbsh/LHS;->field:Lbsh/Invocable;

    .line 22
    .line 23
    invoke-virtual {v3}, Lbsh/Invocable;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v1, v2

    .line 36
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, " varName = "

    .line 46
    .line 47
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lbsh/LHS;->varName:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v1, v2

    .line 61
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v2, " nameSpace = "

    .line 71
    .line 72
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lbsh/LHS;->nameSpace:Lbsh/NameSpace;

    .line 76
    .line 77
    invoke-virtual {v2}, Lbsh/NameSpace;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method
