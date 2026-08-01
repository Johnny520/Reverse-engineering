.class public final Lbsh/飘花落叶言子世苏哲楪兰;
.super Lbsh/飘花落叶言子世哲苏楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子世楪哲兰苏:Z

.field public 飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

.field public final 飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

.field public 飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;-><init>(Ljava/lang/reflect/AccessibleObject;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 12
    .line 13
    iput-object p1, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪哲兰世苏()Ljava/lang/invoke/MethodHandle;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectSetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iget-boolean v2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏:Z

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iput-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 21
    .line 22
    :cond_0
    iput-object v1, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v1

    .line 28
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_0
    iget-boolean v2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏:Z

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iput-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 39
    .line 40
    :cond_1
    throw v1

    .line 41
    :cond_2
    :goto_1
    iget-object p0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

    .line 42
    .line 43
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iput-boolean v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏:Z

    .line 14
    .line 15
    iget-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object p1, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v1

    .line 25
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 26
    .line 27
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    :goto_0
    iput-boolean v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲兰苏:Z

    .line 32
    .line 33
    iget-object v0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪哲苏兰:Ljava/lang/invoke/MethodHandle;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iput-object p1, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    :cond_1
    throw v1
.end method

.method public final 飘花落叶言子楪苏世哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final varargs declared-synchronized 飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    array-length v0, p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    iget-boolean v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_1
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-polymorphic {p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    monitor-exit p0

    .line 25
    return-object p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-polymorphic {p2, p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object p1

    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    :try_start_3
    invoke-virtual {p0}, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏()Ljava/lang/invoke/MethodHandle;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    aget-object p2, p2, v0

    .line 53
    .line 54
    iget-object v1, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 55
    .line 56
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    aget-object v0, v1, v0

    .line 61
    .line 62
    invoke-static {v0, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-polymorphic {p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    .line 70
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 71
    monitor-exit p0

    .line 72
    return-object p1

    .line 73
    :cond_2
    :try_start_4
    invoke-virtual {p0}, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏()Ljava/lang/invoke/MethodHandle;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    aget-object p2, p2, v0

    .line 78
    .line 79
    iget-object v2, p0, Lbsh/飘花落叶言子世苏哲楪兰;->飘花落叶言子世楪苏兰哲:Ljava/lang/Class;

    .line 80
    .line 81
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    aget-object v0, v2, v0

    .line 86
    .line 87
    invoke-static {v0, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-polymorphic {v1, p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    .line 95
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 96
    monitor-exit p0

    .line 97
    return-object p1

    .line 98
    :goto_0
    :try_start_5
    new-instance p2, Ljava/lang/reflect/InvocationTargetException;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p2, p1}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw p2

    .line 108
    :catchall_1
    move-exception p1

    .line 109
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 110
    throw p1
.end method
