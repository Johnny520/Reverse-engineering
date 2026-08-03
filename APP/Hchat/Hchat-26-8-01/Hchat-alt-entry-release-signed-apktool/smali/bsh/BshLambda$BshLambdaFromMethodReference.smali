.class Lbsh/BshLambda$BshLambdaFromMethodReference;
.super Lbsh/BshLambda;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/BshLambda;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BshLambdaFromMethodReference"
.end annotation


# instance fields
.field private final _class:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final methodName:Ljava/lang/String;

.field private final methods:[Ljava/lang/reflect/Method;

.field private final staticRef:Z

.field private final thisArg:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbsh/Node;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lbsh/BshLambda;-><init>(Lbsh/Node;I)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->thisArg:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 8
    .line 9
    instance-of p1, p2, Lbsh/ClassIdentifier;

    .line 10
    .line 11
    iput-boolean p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->staticRef:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    check-cast p2, Lbsh/ClassIdentifier;

    .line 16
    .line 17
    iget-object p1, p2, Lbsh/ClassIdentifier;->clas:Ljava/lang/Class;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    iput-object p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-class p2, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    filled-new-array {p1, p2}, [[Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lbsh/util/Util;->concatArrays([[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, [Ljava/lang/reflect/Method;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :goto_1
    iput-object p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methods:[Ljava/lang/reflect/Method;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final invokeImpl([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    new-instance v0, Lbsh/NameSpace;

    .line 3
    .line 4
    const-string v2, "MethodReferenceLambda"

    .line 5
    .line 6
    invoke-direct {v0, v2}, Lbsh/NameSpace;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v7, Lbsh/CallStack;

    .line 10
    .line 11
    invoke-direct {v7, v0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 12
    .line 13
    .line 14
    new-instance v6, Lbsh/Interpreter;

    .line 15
    .line 16
    invoke-direct {v6, v0}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v2, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->staticRef:Z

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->thisArg:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v4, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v8, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 28
    .line 29
    move-object v5, p1

    .line 30
    invoke-static/range {v3 .. v8}, Lbsh/Reflect;->invokeObjectMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    move-object v5, p1

    .line 40
    iget-object p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 41
    .line 42
    const-string v2, "new"

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {p1, v5}, Lbsh/Reflect;->constructObject(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_1
    array-length p1, v5

    .line 58
    if-eqz p1, :cond_7

    .line 59
    .line 60
    iget-object p1, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    aget-object v3, v5, v2

    .line 64
    .line 65
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    invoke-static {v5}, Lbsh/Types;->getTypes([Ljava/lang/Object;)[Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    array-length v0, p1

    .line 77
    const/4 v3, 0x1

    .line 78
    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, [Ljava/lang/Class;

    .line 83
    .line 84
    iget-object v4, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methods:[Ljava/lang/reflect/Method;

    .line 85
    .line 86
    array-length v6, v4

    .line 87
    move v7, v2

    .line 88
    :goto_0
    if-ge v7, v6, :cond_6

    .line 89
    .line 90
    aget-object v8, v4, v7

    .line 91
    .line 92
    iget-object v9, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v9
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    if-nez v9, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    :try_start_1
    invoke-static {v8}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-eqz v9, :cond_4

    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    invoke-static {p1, v9, v3}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eqz v9, :cond_5

    .line 120
    .line 121
    invoke-virtual {v8, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1

    .line 126
    :cond_4
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-static {v0, v9, v3}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    aget-object v9, v5, v2

    .line 137
    .line 138
    array-length v10, v5

    .line 139
    invoke-static {v5, v3, v10}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v8, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    return-object p1

    .line 148
    :catch_1
    :cond_5
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_6
    :try_start_2
    new-instance p1, Lbsh/UtilEvalError;

    .line 152
    .line 153
    const-string v0, "Can\'t invoke lambda made from method reference!"

    .line 154
    .line 155
    invoke-direct {p1, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lbsh/NameSpace;->getClassManager()Lbsh/BshClassManager;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 164
    .line 165
    iget-object v2, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v3, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 168
    .line 169
    invoke-static {p1, v0, v2, v5, v3}, Lbsh/Reflect;->invokeStaticMethod(Lbsh/BshClassManager;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;Lbsh/Node;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_0

    .line 173
    return-object p1

    .line 174
    :goto_3
    new-instance v0, Lbsh/TargetError;

    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iget-object v2, p0, Lbsh/BshLambda;->expressionNode:Lbsh/Node;

    .line 181
    .line 182
    invoke-direct {v0, p1, v2, v1}, Lbsh/TargetError;-><init>(Ljava/lang/Throwable;Lbsh/Node;Lbsh/CallStack;)V

    .line 183
    .line 184
    .line 185
    throw v0
.end method

.method public isAssignable(Ljava/lang/reflect/Method;I)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->staticRef:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    array-length v3, v0

    .line 14
    move v4, v2

    .line 15
    :goto_0
    if-ge v4, v3, :cond_4

    .line 16
    .line 17
    aget-object v5, v0, v4

    .line 18
    .line 19
    iget-object v6, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {v5}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static {v6, v7, p2}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    invoke-static {v5, v6, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_3

    .line 67
    .line 68
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return v1

    .line 72
    :cond_4
    return v2

    .line 73
    :cond_5
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 74
    .line 75
    const-string v3, "new"

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_9

    .line 82
    .line 83
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    array-length v3, v0

    .line 90
    move v4, v2

    .line 91
    :goto_2
    if-ge v4, v3, :cond_8

    .line 92
    .line 93
    aget-object v5, v0, v4

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v5, v6, p2}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    iget-object v5, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    invoke-static {v5, v6, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_7

    .line 121
    .line 122
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    return v1

    .line 126
    :cond_8
    return v2

    .line 127
    :cond_9
    iget-object v0, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methods:[Ljava/lang/reflect/Method;

    .line 128
    .line 129
    array-length v3, v0

    .line 130
    move v4, v2

    .line 131
    :goto_4
    if-ge v4, v3, :cond_f

    .line 132
    .line 133
    aget-object v5, v0, v4

    .line 134
    .line 135
    iget-object v6, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->methodName:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_a

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_a
    invoke-static {v5}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_c

    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v6, v7, p2}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-nez v6, :cond_b

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_b
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v5, v6, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-nez v5, :cond_e

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_c
    iget-object v6, p0, Lbsh/BshLambda$BshLambdaFromMethodReference;->_class:Ljava/lang/Class;

    .line 185
    .line 186
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    filled-new-array {v6, v7}, [[Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-static {v6}, Lbsh/util/Util;->concatArrays([[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, [Ljava/lang/Class;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-static {v6, v7, p2}, Lbsh/Types;->isSignatureAssignable([Ljava/lang/Class;[Ljava/lang/reflect/Type;I)Z

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-nez v6, :cond_d

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_d
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-static {v5, v6, p2}, Lbsh/Types;->isAssignable(Ljava/lang/Class;Ljava/lang/reflect/Type;I)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-nez v5, :cond_e

    .line 228
    .line 229
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_e
    return v1

    .line 233
    :cond_f
    return v2
.end method
