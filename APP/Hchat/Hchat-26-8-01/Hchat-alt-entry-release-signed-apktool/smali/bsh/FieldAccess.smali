.class Lbsh/FieldAccess;
.super Lbsh/Invocable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private field:Ljava/lang/reflect/Field;

.field private getter:Z

.field private setter:Ljava/lang/invoke/MethodHandle;

.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/Invocable;-><init>(Ljava/lang/reflect/AccessibleObject;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/FieldAccess;->getter:Z

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lbsh/FieldAccess;->type:Ljava/lang/Class;

    .line 12
    .line 13
    iput-object p1, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getParameterCount()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getParameterTypes()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/FieldAccess;->type:Ljava/lang/Class;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getReturnType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/FieldAccess;->type:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSetterHandle()Ljava/lang/invoke/MethodHandle;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/FieldAccess;->setter:Ljava/lang/invoke/MethodHandle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/FieldAccess;->lookup()Ljava/lang/invoke/MethodHandle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lbsh/FieldAccess;->setter:Ljava/lang/invoke/MethodHandle;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lbsh/FieldAccess;->setter:Ljava/lang/invoke/MethodHandle;

    .line 12
    .line 13
    return-object v0
.end method

.method public varargs declared-synchronized invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    array-length v0, p2

    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lbsh/Invocable;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lbsh/Invocable;->getMethodHandle()Ljava/lang/invoke/MethodHandle;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-polymorphic {p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0}, Lbsh/FieldAccess;->getReturnType()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit p0

    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lbsh/Invocable;->getMethodHandle()Ljava/lang/invoke/MethodHandle;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-polymorphic {p2, p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0}, Lbsh/FieldAccess;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    monitor-exit p0

    .line 50
    return-object p1

    .line 51
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lbsh/Invocable;->isStatic()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lbsh/FieldAccess;->getSetterHandle()Ljava/lang/invoke/MethodHandle;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    aget-object p2, p2, v1

    .line 63
    .line 64
    invoke-virtual {p0}, Lbsh/FieldAccess;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    aget-object v0, v0, v1

    .line 69
    .line 70
    invoke-super {p0, p2, v0}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-polymorphic {p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    monitor-exit p0

    .line 80
    return-object p1

    .line 81
    :cond_2
    :try_start_3
    invoke-virtual {p0}, Lbsh/FieldAccess;->getSetterHandle()Ljava/lang/invoke/MethodHandle;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    aget-object p2, p2, v1

    .line 86
    .line 87
    invoke-virtual {p0}, Lbsh/FieldAccess;->getParameterTypes()[Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    aget-object v1, v2, v1

    .line 92
    .line 93
    invoke-super {p0, p2, v1}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-polymorphic {v0, p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    monitor-exit p0

    .line 103
    return-object p1

    .line 104
    :goto_0
    :try_start_4
    new-instance p2, Ljava/lang/reflect/InvocationTargetException;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-direct {p2, p1}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw p2

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 116
    throw p1
.end method

.method public lookup()Ljava/lang/invoke/MethodHandle;
    .locals 3

    const/4 v0, 0x0

    .line 40
    :try_start_0
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v1

    iget-object v2, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v2}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectSetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iget-boolean v2, p0, Lbsh/FieldAccess;->getter:Z

    if-eqz v2, :cond_0

    .line 42
    iput-object v0, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

    :cond_0
    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 43
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    :goto_0
    iget-boolean v2, p0, Lbsh/FieldAccess;->getter:Z

    if-eqz v2, :cond_1

    .line 45
    iput-object v0, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

    .line 46
    :cond_1
    throw v1
.end method

.method public lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
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
    iget-object v2, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

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
    iput-boolean v0, p0, Lbsh/FieldAccess;->getter:Z

    .line 14
    .line 15
    iget-object v0, p0, Lbsh/FieldAccess;->setter:Ljava/lang/invoke/MethodHandle;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iput-object p1, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

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
    iput-boolean v0, p0, Lbsh/FieldAccess;->getter:Z

    .line 32
    .line 33
    iget-object v0, p0, Lbsh/FieldAccess;->setter:Ljava/lang/invoke/MethodHandle;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iput-object p1, p0, Lbsh/FieldAccess;->field:Ljava/lang/reflect/Field;

    .line 38
    .line 39
    :cond_1
    throw v1
.end method
