.class public abstract L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static volatile 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/LongFunction;
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/invoke/MethodType;

    .line 10
    .line 11
    invoke-virtual {v1, v0, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    const-string v2, "apply"

    .line 22
    .line 23
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世:Ljava/lang/invoke/MethodType;

    .line 24
    .line 25
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/invoke/MethodType;

    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/LongFunction;

    .line 36
    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    return-object p0

    .line 41
    :catchall_0
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲兰苏;

    .line 42
    .line 43
    invoke-direct {v0, p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    array-length v4, v2

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x1

    .line 24
    if-ne v4, v6, :cond_0

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    aget-object v2, v2, v5

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    array-length v2, v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    move-object v2, v0

    .line 37
    :goto_0
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v3, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v7, v0, v1, v4}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_1
    move-object v11, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v7, v0, v1, v4}, Ljava/lang/invoke/MethodHandles$Lookup;->findVirtual(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_1

    .line 70
    :goto_2
    const-string v8, "apply"

    .line 71
    .line 72
    sget-object v9, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/invoke/MethodType;

    .line 73
    .line 74
    sget-object v10, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/invoke/MethodType;

    .line 75
    .line 76
    invoke-static {v3, v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    invoke-static/range {v7 .. v12}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Function;

    .line 89
    .line 90
    .line 91
    .line 92
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    return-object p0

    .line 94
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲苏兰;

    .line 105
    .line 106
    invoke-direct {v0, p0, v6}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/reflect/Method;I)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_2
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲苏兰;

    .line 111
    .line 112
    invoke-direct {v0, p0, v5}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/reflect/Method;I)V

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_3
    const-string v0, "not support parameters "

    .line 117
    .line 118
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    aget-object v3, v3, v0

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v4, v3}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v2, v1, v4}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    move-object v4, v3

    .line 27
    const-string v3, "apply"

    .line 28
    .line 29
    move-object v5, v4

    .line 30
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/invoke/MethodType;

    .line 31
    .line 32
    move-object v7, v5

    .line 33
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/invoke/MethodType;

    .line 34
    .line 35
    invoke-static {v7}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-static {v1, v7}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-static/range {v2 .. v7}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-polymorphic {v1}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Function;

    .line 52
    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    return-object p0

    .line 57
    :catchall_0
    new-instance v1, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;

    .line 58
    .line 59
    invoke-direct {v1, p0, v0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public static 飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;)Ljava/util/function/BiFunction;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x0

    .line 19
    aget-object v5, v4, v5

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    aget-object v4, v4, v0

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-static {v2, v5, v7}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v3, v1, v6, v7}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v2, v5, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    move-object v7, v1

    .line 58
    :goto_0
    move-object v8, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-static {v2, v5}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v3, v1, v4, v6}, Ljava/lang/invoke/MethodHandles$Lookup;->findVirtual(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v5}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v2, v1, v5}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    move-object v7, v4

    .line 85
    goto :goto_0

    .line 86
    :goto_1
    const-string v4, "apply"

    .line 87
    .line 88
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲世苏兰:Ljava/lang/invoke/MethodType;

    .line 89
    .line 90
    sget-object v6, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/invoke/MethodType;

    .line 91
    .line 92
    invoke-static/range {v3 .. v8}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-polymorphic {v1}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 101
    .line 102
    .line 103
    .line 104
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    return-object p0

    .line 106
    :catchall_0
    new-instance v1, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 107
    .line 108
    invoke-direct {v1, p0, v0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Executable;I)V

    .line 109
    .line 110
    .line 111
    return-object v1
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/Constructor;)Ljava/util/function/BiFunction;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    aget-object v4, v3, v0

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    aget-object v3, v3, v5

    .line 18
    .line 19
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v5, v4, v6}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v2, v1, v5}, Ljava/lang/invoke/MethodHandles$Lookup;->findConstructor(Ljava/lang/Class;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    move-object v5, v3

    .line 34
    const-string v3, "apply"

    .line 35
    .line 36
    move-object v7, v4

    .line 37
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲世苏兰:Ljava/lang/invoke/MethodType;

    .line 38
    .line 39
    move-object v8, v5

    .line 40
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/invoke/MethodType;

    .line 41
    .line 42
    invoke-static {v7}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-static {v8}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    invoke-static {v1, v7, v8}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-static/range {v2 .. v7}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-polymorphic {v1}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 67
    .line 68
    .line 69
    .line 70
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    return-object p0

    .line 72
    :catchall_0
    new-instance v1, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-direct {v1, p0, v0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/reflect/Executable;I)V

    .line 75
    .line 76
    .line 77
    return-object v1
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-class p0, Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const-class p0, Ljava/lang/Long;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    const-class p0, Ljava/lang/Boolean;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    const-class p0, Ljava/lang/Short;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne p0, v0, :cond_4

    .line 32
    .line 33
    const-class p0, Ljava/lang/Byte;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    if-ne p0, v0, :cond_5

    .line 39
    .line 40
    const-class p0, Ljava/lang/Character;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne p0, v0, :cond_6

    .line 46
    .line 47
    const-class p0, Ljava/lang/Float;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, v0, :cond_7

    .line 53
    .line 54
    const-class p0, Ljava/lang/Double;

    .line 55
    .line 56
    :cond_7
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v0, v4, v3}, Ljava/lang/invoke/MethodHandles$Lookup;->findVirtual(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    move-object v3, v2

    .line 24
    const-string v2, "applyAsInt"

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/invoke/MethodType;

    .line 28
    .line 29
    move-object v6, v4

    .line 30
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/invoke/MethodType;

    .line 31
    .line 32
    invoke-static {v6, v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static/range {v1 .. v6}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/ToIntFunction;

    .line 45
    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    return-object p0

    .line 50
    :catchall_0
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世兰哲苏;

    .line 51
    .line 52
    invoke-direct {v0, p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Ljava/lang/reflect/Method;)Ljava/util/function/Supplier;
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v2, v0, v3, v4}, Ljava/lang/invoke/MethodHandles$Lookup;->findStatic(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const-string v3, "get"

    .line 26
    .line 27
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/invoke/MethodType;

    .line 28
    .line 29
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodType;

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static/range {v2 .. v7}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/Supplier;

    .line 44
    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    return-object p0

    .line 49
    :catchall_0
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世兰苏哲;

    .line 50
    .line 51
    invoke-direct {v0, p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/reflect/Method;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public static 飘花落叶言子楪苏兰世哲(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏哲兰;
    .locals 12

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    sget-boolean v1, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v3, "com.carrotsearch.hppc.LongHashSet"

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const-string v4, "toArray"

    .line 21
    .line 22
    const-string v5, "illegal state"

    .line 23
    .line 24
    if-nez v3, :cond_9

    .line 25
    .line 26
    const-string v3, "gnu.trove.set.hash.TShortHashSet"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_8

    .line 33
    .line 34
    const-string v3, "com.carrotsearch.hppc.CharHashSet"

    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_7

    .line 41
    .line 42
    const-string v3, "com.carrotsearch.hppc.CharArrayList"

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_7

    .line 49
    .line 50
    const-string v3, "com.carrotsearch.hppc.IntArrayList"

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_6

    .line 57
    .line 58
    const-string v3, "gnu.trove.list.array.TLongArrayList"

    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_9

    .line 65
    .line 66
    const-string v3, "com.carrotsearch.hppc.BitSet"

    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    const-string v0, "gnu.trove.list.array.TShortArrayList"

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_8

    .line 81
    .line 82
    const-string v0, "gnu.trove.set.hash.TIntHashSet"

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_6

    .line 89
    .line 90
    const-string v0, "com.carrotsearch.hppc.ShortArrayList"

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_8

    .line 97
    .line 98
    const-string v0, "com.carrotsearch.hppc.DoubleArrayList"

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_4

    .line 105
    .line 106
    const-string v0, "com.carrotsearch.hppc.ByteArrayList"

    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    const-string v0, "gnu.trove.set.hash.TLongHashSet"

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-nez v0, :cond_9

    .line 121
    .line 122
    const-string v0, "gnu.trove.list.array.TCharArrayList"

    .line 123
    .line 124
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_7

    .line 129
    .line 130
    const-string v0, "gnu.trove.list.array.TFloatArrayList"

    .line 131
    .line 132
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_2

    .line 137
    .line 138
    const-string v0, "gnu.trove.stack.array.TByteArrayStack"

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_3

    .line 145
    .line 146
    const-string v0, "com.carrotsearch.hppc.FloatArrayList"

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_2

    .line 153
    .line 154
    const-string v0, "com.carrotsearch.hppc.IntHashSet"

    .line 155
    .line 156
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_6

    .line 161
    .line 162
    const-string v0, "gnu.trove.list.array.TIntArrayList"

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_6

    .line 169
    .line 170
    const-string v0, "gnu.trove.list.array.TByteArrayList"

    .line 171
    .line 172
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_3

    .line 177
    .line 178
    const-string v0, "org.bson.types.Decimal128"

    .line 179
    .line 180
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_1

    .line 185
    .line 186
    const-string v0, "gnu.trove.set.hash.TByteHashSet"

    .line 187
    .line 188
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-nez v0, :cond_3

    .line 193
    .line 194
    const-string v0, "com.carrotsearch.hppc.LongArrayList"

    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_9

    .line 201
    .line 202
    const-string v0, "gnu.trove.list.array.TDoubleArrayList"

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-nez v0, :cond_4

    .line 209
    .line 210
    :goto_0
    return-object v2

    .line 211
    :cond_1
    :try_start_0
    const-string v0, "bigDecimalValue"

    .line 212
    .line 213
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 222
    .line 223
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    invoke-direct {v0, v2, v1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :catch_0
    move-exception v0

    .line 231
    :goto_1
    move-object p0, v0

    .line 232
    goto :goto_2

    .line 233
    :catch_1
    move-exception v0

    .line 234
    goto :goto_1

    .line 235
    :goto_2
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    return-object v2

    .line 239
    :cond_2
    :try_start_1
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 248
    .line 249
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪苏哲世;

    .line 250
    .line 251
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪苏哲世;-><init>(Ljava/util/function/Function;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 252
    .line 253
    .line 254
    return-object v0

    .line 255
    :catch_2
    move-exception v0

    .line 256
    :goto_3
    move-object p0, v0

    .line 257
    goto :goto_4

    .line 258
    :catch_3
    move-exception v0

    .line 259
    goto :goto_3

    .line 260
    :goto_4
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    return-object v2

    .line 264
    :cond_3
    :try_start_2
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 273
    .line 274
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世哲苏楪;

    .line 275
    .line 276
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世哲苏楪;-><init>(Ljava/util/function/Function;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_4

    .line 277
    .line 278
    .line 279
    return-object v0

    .line 280
    :catch_4
    move-exception v0

    .line 281
    :goto_5
    move-object p0, v0

    .line 282
    goto :goto_6

    .line 283
    :catch_5
    move-exception v0

    .line 284
    goto :goto_5

    .line 285
    :goto_6
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    return-object v2

    .line 289
    :cond_4
    :try_start_3
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 298
    .line 299
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世哲苏;

    .line 300
    .line 301
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪世哲苏;-><init>(Ljava/util/function/Function;)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_6

    .line 302
    .line 303
    .line 304
    return-object v0

    .line 305
    :catch_6
    move-exception v0

    .line 306
    :goto_7
    move-object p0, v0

    .line 307
    goto :goto_8

    .line 308
    :catch_7
    move-exception v0

    .line 309
    goto :goto_7

    .line 310
    :goto_8
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    return-object v2

    .line 314
    :cond_5
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    const/4 v1, 0x1

    .line 319
    :try_start_4
    const-string v3, "size"

    .line 320
    .line 321
    invoke-virtual {p0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-static {v3}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Method;)Ljava/util/function/ToLongFunction;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    const-string v4, "get"

    .line 330
    .line 331
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 332
    .line 333
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 334
    .line 335
    invoke-static {v5, v7}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    invoke-virtual {v6, p0, v4, v5}, Ljava/lang/invoke/MethodHandles$Lookup;->findVirtual(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 340
    .line 341
    .line 342
    move-result-object v10

    .line 343
    const-string v7, "apply"

    .line 344
    .line 345
    const-class v4, Ljava/util/function/BiFunction;

    .line 346
    .line 347
    invoke-static {v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-static {v0, v0, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    const-class v0, Ljava/lang/Boolean;

    .line 360
    .line 361
    const-class v4, Ljava/lang/Integer;

    .line 362
    .line 363
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v0, p0, v4}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    invoke-static/range {v6 .. v11}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    invoke-virtual {p0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    invoke-polymorphic {p0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/BiFunction;

    .line 380
    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 385
    .line 386
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲苏兰;

    .line 387
    .line 388
    invoke-direct {v0, v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲苏兰;-><init>(Ljava/util/function/ToLongFunction;)V

    .line 389
    .line 390
    .line 391
    new-instance v3, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;

    .line 392
    .line 393
    invoke-direct {v3, v0, v1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲苏兰世楪;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 394
    .line 395
    .line 396
    return-object v3

    .line 397
    :catchall_0
    sput-boolean v1, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 398
    .line 399
    return-object v2

    .line 400
    :cond_6
    :try_start_5
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 409
    .line 410
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;

    .line 411
    .line 412
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世楪哲苏;-><init>(Ljava/util/function/Function;)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_9
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_8

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :catch_8
    move-exception v0

    .line 417
    :goto_9
    move-object p0, v0

    .line 418
    goto :goto_a

    .line 419
    :catch_9
    move-exception v0

    .line 420
    goto :goto_9

    .line 421
    :goto_a
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 422
    .line 423
    .line 424
    return-object v2

    .line 425
    :cond_7
    :try_start_6
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 434
    .line 435
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰世楪苏;

    .line 436
    .line 437
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰世楪苏;-><init>(Ljava/util/function/Function;)V
    :try_end_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_b
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_a

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :catch_a
    move-exception v0

    .line 442
    :goto_b
    move-object p0, v0

    .line 443
    goto :goto_c

    .line 444
    :catch_b
    move-exception v0

    .line 445
    goto :goto_b

    .line 446
    :goto_c
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    return-object v2

    .line 450
    :cond_8
    :try_start_7
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 459
    .line 460
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲苏世;

    .line 461
    .line 462
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰楪哲苏世;-><init>(Ljava/util/function/Function;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_c

    .line 463
    .line 464
    .line 465
    return-object v0

    .line 466
    :catch_c
    move-exception v0

    .line 467
    :goto_d
    move-object p0, v0

    .line 468
    goto :goto_e

    .line 469
    :catch_d
    move-exception v0

    .line 470
    goto :goto_d

    .line 471
    :goto_e
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    return-object v2

    .line 475
    :cond_9
    :try_start_8
    invoke-virtual {p0, v4, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲楪兰苏世;

    .line 484
    .line 485
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;

    .line 486
    .line 487
    invoke-direct {v0, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰世苏哲楪;-><init>(Ljava/util/function/Function;)V
    :try_end_8
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_e

    .line 488
    .line 489
    .line 490
    return-object v0

    .line 491
    :catch_e
    move-exception v0

    .line 492
    :goto_f
    move-object p0, v0

    .line 493
    goto :goto_10

    .line 494
    :catch_f
    move-exception v0

    .line 495
    goto :goto_f

    .line 496
    :goto_10
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 497
    .line 498
    .line 499
    return-object v2
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Method;)Ljava/util/function/ToLongFunction;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandles$Lookup;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v0, v4, v3}, Ljava/lang/invoke/MethodHandles$Lookup;->findVirtual(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    move-object v3, v2

    .line 24
    const-string v2, "applyAsLong"

    .line 25
    .line 26
    move-object v4, v3

    .line 27
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/invoke/MethodType;

    .line 28
    .line 29
    move-object v6, v4

    .line 30
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/invoke/MethodType;

    .line 31
    .line 32
    invoke-static {v6, v0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static/range {v1 .. v6}, Ljava/lang/invoke/LambdaMetafactory;->metafactory(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/invoke/CallSite;->getTarget()Ljava/lang/invoke/MethodHandle;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-polymorphic {v0}, Ljava/lang/invoke/MethodHandle;->invokeExact([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/util/function/ToLongFunction;

    .line 45
    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    return-object p0

    .line 50
    :catchall_0
    new-instance v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世哲兰;

    .line 51
    .line 52
    invoke-direct {v0, p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世兰哲;
    .locals 11

    .line 1
    sget-boolean v0, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_0

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "com.carrotsearch.hppc.LongHashSet"

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-class v3, [J

    .line 19
    .line 20
    const-string v4, "from"

    .line 21
    .line 22
    const-string v5, "illegal state"

    .line 23
    .line 24
    if-nez v2, :cond_f

    .line 25
    .line 26
    const-string v2, "gnu.trove.set.hash.TShortHashSet"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-class v6, [S

    .line 33
    .line 34
    if-nez v2, :cond_e

    .line 35
    .line 36
    const-string v2, "com.carrotsearch.hppc.CharHashSet"

    .line 37
    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-class v7, [C

    .line 43
    .line 44
    if-nez v2, :cond_d

    .line 45
    .line 46
    const-string v2, "com.carrotsearch.hppc.CharArrayList"

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_d

    .line 53
    .line 54
    const-string v2, "com.carrotsearch.hppc.IntArrayList"

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const-class v8, [I

    .line 61
    .line 62
    if-nez v2, :cond_c

    .line 63
    .line 64
    const-string v2, "gnu.trove.list.array.TLongArrayList"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_b

    .line 71
    .line 72
    const-string v2, "gnu.trove.list.array.TShortArrayList"

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_e

    .line 79
    .line 80
    const-string v2, "gnu.trove.set.hash.TIntHashSet"

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_a

    .line 87
    .line 88
    const-string v2, "com.carrotsearch.hppc.ShortArrayList"

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_9

    .line 95
    .line 96
    const-string v2, "com.carrotsearch.hppc.DoubleArrayList"

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    const-class v6, [D

    .line 103
    .line 104
    if-nez v2, :cond_8

    .line 105
    .line 106
    const-string v2, "com.carrotsearch.hppc.ByteArrayList"

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    const-string v9, "base64"

    .line 113
    .line 114
    const-class v10, [B

    .line 115
    .line 116
    if-nez v2, :cond_7

    .line 117
    .line 118
    const-string v2, "gnu.trove.set.hash.TLongHashSet"

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_b

    .line 125
    .line 126
    const-string v2, "gnu.trove.list.array.TCharArrayList"

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-nez v2, :cond_6

    .line 133
    .line 134
    const-string v2, "gnu.trove.list.array.TFloatArrayList"

    .line 135
    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    const-class v7, [F

    .line 141
    .line 142
    if-nez v2, :cond_5

    .line 143
    .line 144
    const-string v2, "gnu.trove.stack.array.TByteArrayStack"

    .line 145
    .line 146
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_4

    .line 151
    .line 152
    const-string v2, "com.carrotsearch.hppc.FloatArrayList"

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_3

    .line 159
    .line 160
    const-string v2, "com.carrotsearch.hppc.IntHashSet"

    .line 161
    .line 162
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-nez v2, :cond_c

    .line 167
    .line 168
    const-string v2, "gnu.trove.list.array.TIntArrayList"

    .line 169
    .line 170
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-nez v2, :cond_a

    .line 175
    .line 176
    const-string v2, "gnu.trove.list.array.TByteArrayList"

    .line 177
    .line 178
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_4

    .line 183
    .line 184
    const-string v2, "org.bson.types.Decimal128"

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_2

    .line 191
    .line 192
    const-string v2, "gnu.trove.set.hash.TByteHashSet"

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-nez v2, :cond_4

    .line 199
    .line 200
    const-string v2, "com.carrotsearch.hppc.LongArrayList"

    .line 201
    .line 202
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-nez v2, :cond_f

    .line 207
    .line 208
    const-string v2, "gnu.trove.list.array.TDoubleArrayList"

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-nez v0, :cond_1

    .line 215
    .line 216
    :goto_0
    return-object v1

    .line 217
    :cond_1
    :try_start_0
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;

    .line 230
    .line 231
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;-><init>(Ljava/util/function/Function;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :catch_0
    move-exception p0

    .line 236
    goto :goto_1

    .line 237
    :catch_1
    move-exception p0

    .line 238
    :goto_1
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    return-object v1

    .line 242
    :cond_2
    :try_start_1
    const-class v0, Ljava/math/BigDecimal;

    .line 243
    .line 244
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;

    .line 257
    .line 258
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲楪兰世苏;-><init>(Ljava/util/function/Function;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    :catch_2
    move-exception p0

    .line 263
    goto :goto_2

    .line 264
    :catch_3
    move-exception p0

    .line 265
    :goto_2
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 266
    .line 267
    .line 268
    return-object v1

    .line 269
    :cond_3
    :try_start_2
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;

    .line 282
    .line 283
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;-><init>(Ljava/util/function/Function;)V
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_4

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :catch_4
    move-exception p0

    .line 288
    goto :goto_3

    .line 289
    :catch_5
    move-exception p0

    .line 290
    :goto_3
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    return-object v1

    .line 294
    :cond_4
    :try_start_3
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    .line 307
    .line 308
    invoke-direct {v0, v9, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;-><init>(Ljava/lang/String;Ljava/util/function/Function;)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_6

    .line 309
    .line 310
    .line 311
    return-object v0

    .line 312
    :catch_6
    move-exception p0

    .line 313
    goto :goto_4

    .line 314
    :catch_7
    move-exception p0

    .line 315
    :goto_4
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    return-object v1

    .line 319
    :cond_5
    :try_start_4
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;

    .line 332
    .line 333
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰楪世苏;-><init>(Ljava/util/function/Function;)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_9
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_8

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :catch_8
    move-exception p0

    .line 338
    goto :goto_5

    .line 339
    :catch_9
    move-exception p0

    .line 340
    :goto_5
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    return-object v1

    .line 344
    :cond_6
    :try_start_5
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;

    .line 357
    .line 358
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;-><init>(Ljava/util/function/Function;)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_b
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_a

    .line 359
    .line 360
    .line 361
    return-object v0

    .line 362
    :catch_a
    move-exception p0

    .line 363
    goto :goto_6

    .line 364
    :catch_b
    move-exception p0

    .line 365
    :goto_6
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    return-object v1

    .line 369
    :cond_7
    :try_start_6
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 374
    .line 375
    .line 376
    move-result-object p0

    .line 377
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;

    .line 382
    .line 383
    invoke-direct {v0, v9, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪哲世苏;-><init>(Ljava/lang/String;Ljava/util/function/Function;)V
    :try_end_6
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_d
    .catch Ljava/lang/SecurityException; {:try_start_6 .. :try_end_6} :catch_c

    .line 384
    .line 385
    .line 386
    return-object v0

    .line 387
    :catch_c
    move-exception p0

    .line 388
    goto :goto_7

    .line 389
    :catch_d
    move-exception p0

    .line 390
    :goto_7
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 391
    .line 392
    .line 393
    return-object v1

    .line 394
    :cond_8
    :try_start_7
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;

    .line 407
    .line 408
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏世楪兰;-><init>(Ljava/util/function/Function;)V
    :try_end_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_7 .. :try_end_7} :catch_f
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_e

    .line 409
    .line 410
    .line 411
    return-object v0

    .line 412
    :catch_e
    move-exception p0

    .line 413
    goto :goto_8

    .line 414
    :catch_f
    move-exception p0

    .line 415
    :goto_8
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    return-object v1

    .line 419
    :cond_9
    :try_start_8
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;

    .line 432
    .line 433
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;-><init>(Ljava/util/function/Function;)V
    :try_end_8
    .catch Ljava/lang/NoSuchMethodException; {:try_start_8 .. :try_end_8} :catch_11
    .catch Ljava/lang/SecurityException; {:try_start_8 .. :try_end_8} :catch_10

    .line 434
    .line 435
    .line 436
    return-object v0

    .line 437
    :catch_10
    move-exception p0

    .line 438
    goto :goto_9

    .line 439
    :catch_11
    move-exception p0

    .line 440
    :goto_9
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    return-object v1

    .line 444
    :cond_a
    :try_start_9
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;

    .line 457
    .line 458
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V
    :try_end_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_9 .. :try_end_9} :catch_13
    .catch Ljava/lang/SecurityException; {:try_start_9 .. :try_end_9} :catch_12

    .line 459
    .line 460
    .line 461
    return-object v0

    .line 462
    :catch_12
    move-exception p0

    .line 463
    goto :goto_a

    .line 464
    :catch_13
    move-exception p0

    .line 465
    :goto_a
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    return-object v1

    .line 469
    :cond_b
    :try_start_a
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 474
    .line 475
    .line 476
    move-result-object p0

    .line 477
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;

    .line 482
    .line 483
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V
    :try_end_a
    .catch Ljava/lang/NoSuchMethodException; {:try_start_a .. :try_end_a} :catch_15
    .catch Ljava/lang/SecurityException; {:try_start_a .. :try_end_a} :catch_14

    .line 484
    .line 485
    .line 486
    return-object v0

    .line 487
    :catch_14
    move-exception p0

    .line 488
    goto :goto_b

    .line 489
    :catch_15
    move-exception p0

    .line 490
    :goto_b
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 491
    .line 492
    .line 493
    return-object v1

    .line 494
    :cond_c
    :try_start_b
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;

    .line 507
    .line 508
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪世苏哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V
    :try_end_b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_b .. :try_end_b} :catch_17
    .catch Ljava/lang/SecurityException; {:try_start_b .. :try_end_b} :catch_16

    .line 509
    .line 510
    .line 511
    return-object v0

    .line 512
    :catch_16
    move-exception p0

    .line 513
    goto :goto_c

    .line 514
    :catch_17
    move-exception p0

    .line 515
    :goto_c
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 516
    .line 517
    .line 518
    return-object v1

    .line 519
    :cond_d
    :try_start_c
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 528
    .line 529
    .line 530
    move-result-object p0

    .line 531
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;

    .line 532
    .line 533
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲世苏兰楪;-><init>(Ljava/util/function/Function;)V
    :try_end_c
    .catch Ljava/lang/NoSuchMethodException; {:try_start_c .. :try_end_c} :catch_19
    .catch Ljava/lang/SecurityException; {:try_start_c .. :try_end_c} :catch_18

    .line 534
    .line 535
    .line 536
    return-object v0

    .line 537
    :catch_18
    move-exception p0

    .line 538
    goto :goto_d

    .line 539
    :catch_19
    move-exception p0

    .line 540
    :goto_d
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    return-object v1

    .line 544
    :cond_e
    :try_start_d
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 549
    .line 550
    .line 551
    move-result-object p0

    .line 552
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Constructor;)Ljava/util/function/Function;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;

    .line 557
    .line 558
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲兰苏楪世;-><init>(Ljava/util/function/Function;)V
    :try_end_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_d .. :try_end_d} :catch_1b
    .catch Ljava/lang/SecurityException; {:try_start_d .. :try_end_d} :catch_1a

    .line 559
    .line 560
    .line 561
    return-object v0

    .line 562
    :catch_1a
    move-exception p0

    .line 563
    goto :goto_e

    .line 564
    :catch_1b
    move-exception p0

    .line 565
    :goto_e
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    return-object v1

    .line 569
    :cond_f
    :try_start_e
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {p0, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    invoke-static {p0}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;

    .line 582
    .line 583
    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰楪苏世哲;-><init>(Ljava/lang/Class;Ljava/util/function/Function;)V
    :try_end_e
    .catch Ljava/lang/NoSuchMethodException; {:try_start_e .. :try_end_e} :catch_1d
    .catch Ljava/lang/SecurityException; {:try_start_e .. :try_end_e} :catch_1c

    .line 584
    .line 585
    .line 586
    return-object v0

    .line 587
    :catch_1c
    move-exception p0

    .line 588
    goto :goto_f

    .line 589
    :catch_1d
    move-exception p0

    .line 590
    :goto_f
    invoke-static {v5, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 591
    .line 592
    .line 593
    return-object v1
.end method
