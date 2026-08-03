.class Lbsh/ConstructorInvocable;
.super Lbsh/ExecutingInvocable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field private final isStatic:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lbsh/ExecutingInvocable;-><init>(Ljava/lang/reflect/Executable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/ConstructorInvocable;->constructor:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    invoke-virtual {p0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lbsh/Reflect;->isStatic(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lbsh/ConstructorInvocable;->isStatic:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/ConstructorInvocable;->isInnerClass()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lbsh/ConstructorInvocable;->isStatic()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {v0, p2}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2}, Ljava/util/stream/Stream;->toArray()[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_0
    invoke-super {p0, p1, p2}, Lbsh/ExecutingInvocable;->collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
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
    invoke-virtual {p0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public isInnerClass()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public isStatic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/ConstructorInvocable;->isStatic:Z

    .line 2
    .line 3
    return v0
.end method

.method public lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lbsh/ConstructorInvocable;->constructor:Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectConstructor(Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-super {p0, v0}, Lbsh/ExecutingInvocable;->lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    iput-object p1, p0, Lbsh/ConstructorInvocable;->constructor:Ljava/lang/reflect/Constructor;

    .line 17
    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v0

    .line 22
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :goto_0
    iput-object p1, p0, Lbsh/ConstructorInvocable;->constructor:Ljava/lang/reflect/Constructor;

    .line 29
    .line 30
    throw v0
.end method
