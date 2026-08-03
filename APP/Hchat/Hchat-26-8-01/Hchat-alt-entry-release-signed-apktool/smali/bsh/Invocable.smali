.class public abstract Lbsh/Invocable;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/Member;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/Invocable$ParameterType;
    }
.end annotation


# instance fields
.field private final declaringClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final flags:I

.field private handle:Ljava/lang/invoke/MethodHandle;

.field private final isStatic:Z

.field private final isSynthetic:Z

.field protected lastParameterIndex:I

.field private final name:Ljava/lang/String;

.field protected final parameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final toString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/AccessibleObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M:",
            "Ljava/lang/reflect/AccessibleObject;",
            ":",
            "Ljava/lang/reflect/Member;",
            ">(TM;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lbsh/Invocable;->handle:Ljava/lang/invoke/MethodHandle;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/reflect/Member;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lbsh/Invocable;->flags:I

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lbsh/Invocable;->declaringClass:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lbsh/Invocable;->name:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lbsh/Invocable;->toString:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput v0, p0, Lbsh/Invocable;->lastParameterIndex:I

    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Ljava/lang/reflect/Member;

    .line 46
    .line 47
    invoke-static {v0}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iput-boolean v1, p0, Lbsh/Invocable;->isStatic:Z

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput-boolean v1, p0, Lbsh/Invocable;->isSynthetic:Z

    .line 58
    .line 59
    invoke-static {}, Lbsh/Capabilities;->haveAccessibility()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-class v1, Ljava/lang/Class;

    .line 70
    .line 71
    if-eq v0, v1, :cond_0

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    :catch_0
    :cond_0
    return-void
.end method

.method public static synthetic a(Ljava/lang/Class;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/Invocable;->lambda$hashCode$1(Ljava/lang/Class;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lbsh/Invocable;->lambda$hashCode$2(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/Invocable;->lambda$getParamTypeDescriptors$0(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static get(Ljava/lang/reflect/Field;)Lbsh/FieldAccess;
    .locals 1

    .line 8
    new-instance v0, Lbsh/FieldAccess;

    invoke-direct {v0, p0}, Lbsh/FieldAccess;-><init>(Ljava/lang/reflect/Field;)V

    return-object v0
.end method

.method public static get(Ljava/lang/reflect/Constructor;)Lbsh/Invocable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Lbsh/Invocable;"
        }
    .end annotation

    .line 7
    new-instance v0, Lbsh/ConstructorInvocable;

    invoke-direct {v0, p0}, Lbsh/ConstructorInvocable;-><init>(Ljava/lang/reflect/Constructor;)V

    return-object v0
.end method

.method public static get(Ljava/lang/reflect/Method;)Lbsh/Invocable;
    .locals 1

    .line 1
    new-instance v0, Lbsh/MethodInvocable;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbsh/MethodInvocable;-><init>(Ljava/lang/reflect/Method;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private declared-synchronized invokeTarget(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "Invoking method (entry): "

    .line 3
    .line 4
    invoke-static {v0, p0, p2}, Lbsh/Reflect;->logInvokeMethod(Ljava/lang/String;Lbsh/Invocable;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lbsh/Invocable;->collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p1, Lbsh/Invocable$ParameterType;->params:Ljava/util/List;

    .line 12
    .line 13
    const-string v0, "Invoking method (after): "

    .line 14
    .line 15
    invoke-static {v0, p0, p2}, Lbsh/Reflect;->logInvokeMethod(Ljava/lang/String;Lbsh/Invocable;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-lez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lbsh/Invocable;->getMethodHandle()Ljava/lang/invoke/MethodHandle;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-boolean p1, p1, Lbsh/Invocable$ParameterType;->isFixedArity:Z

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/invoke/MethodHandle;->asFixedArity()Ljava/lang/invoke/MethodHandle;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/invoke/MethodHandle;->invokeWithArguments(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    monitor-exit p0

    .line 44
    return-object p1

    .line 45
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lbsh/Invocable;->isStatic()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    instance-of p1, p0, Lbsh/ConstructorInvocable;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-virtual {p0}, Lbsh/Invocable;->getMethodHandle()Ljava/lang/invoke/MethodHandle;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-polymorphic {p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    .line 69
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    monitor-exit p0

    .line 71
    return-object p1

    .line 72
    :cond_3
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lbsh/Invocable;->getMethodHandle()Ljava/lang/invoke/MethodHandle;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-polymorphic {p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    monitor-exit p0

    .line 82
    return-object p1

    .line 83
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    throw p1
.end method

.method private static synthetic lambda$getParamTypeDescriptors$0(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static synthetic lambda$hashCode$1(Ljava/lang/Class;)Ljava/lang/Integer;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/16 p0, 0x27

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static synthetic lambda$hashCode$2(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    xor-int/2addr p0, p1

    .line 10
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method


# virtual methods
.method public coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lbsh/Types;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-static {p1, p2, v0}, Lbsh/Types;->castObject(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    array-length v0, p2

    .line 6
    if-gt p1, v0, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    move v0, p1

    .line 15
    :goto_0
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 20
    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    aget-object v1, p2, v0

    .line 24
    .line 25
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    aget-object v3, v3, v0

    .line 30
    .line 31
    invoke-virtual {p0, v1, v3}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p2, Lbsh/Invocable$ParameterType;

    .line 42
    .line 43
    invoke-direct {p2, v2, p1}, Lbsh/Invocable$ParameterType;-><init>(Ljava/util/List;Z)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/reflect/InvocationTargetException;

    .line 48
    .line 49
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v2, "Insufficient parameters passed for method: "

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-direct {p1, v0, p2}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p0, p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    check-cast p1, Lbsh/Invocable;

    .line 21
    .line 22
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p1}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_6

    .line 35
    .line 36
    invoke-virtual {p0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-ne v2, v3, :cond_6

    .line 45
    .line 46
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterCount()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {p1}, Lbsh/Invocable;->getParameterCount()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-ne v2, v3, :cond_6

    .line 55
    .line 56
    invoke-virtual {p0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {p1}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-ne v2, v3, :cond_6

    .line 65
    .line 66
    invoke-virtual {p0}, Lbsh/Invocable;->getModifiers()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p1}, Lbsh/Invocable;->getModifiers()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eq v2, v3, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    move v2, v0

    .line 78
    :goto_0
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterCount()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-ge v2, v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    aget-object v3, v3, v2

    .line 89
    .line 90
    invoke-virtual {p1}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    aget-object v4, v4, v2

    .line 95
    .line 96
    if-eq v3, v4, :cond_4

    .line 97
    .line 98
    return v0

    .line 99
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    return v1

    .line 103
    :cond_6
    :goto_1
    return v0
.end method

.method public getDeclaringClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/Invocable;->declaringClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLastParameterIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/Invocable;->lastParameterIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public getMethodDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->methodType()Ljava/lang/invoke/MethodType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/invoke/MethodType;->toMethodDescriptorString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getMethodHandle()Ljava/lang/invoke/MethodHandle;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Invocable;->handle:Ljava/lang/invoke/MethodHandle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lbsh/Invocable;->lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lbsh/Invocable;->handle:Ljava/lang/invoke/MethodHandle;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lbsh/Invocable;->handle:Ljava/lang/invoke/MethodHandle;

    .line 13
    .line 14
    return-object v0
.end method

.method public getModifiers()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/Invocable;->flags:I

    .line 2
    .line 3
    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Invocable;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getParamTypeDescriptors()[Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->methodType()Ljava/lang/invoke/MethodType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/invoke/MethodType;->parameterList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lbsh/b;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2}, Lbsh/b;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lbsh/e;

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, [Ljava/lang/String;

    .line 34
    .line 35
    return-object v0
.end method

.method public abstract getParameterCount()I
.end method

.method public abstract getParameterTypes()[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract getReturnType()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public getReturnTypeDescriptor()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbsh/BSHType;->getTypeDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getVarArgsComponentType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVarArgsType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    xor-int/2addr v0, v1

    .line 18
    invoke-virtual {p0}, Lbsh/Invocable;->getDeclaringClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    xor-int/2addr v0, v1

    .line 27
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterCount()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    xor-int/2addr v0, v1

    .line 32
    invoke-virtual {p0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    xor-int/2addr v0, v1

    .line 41
    invoke-virtual {p0}, Lbsh/Invocable;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    xor-int/2addr v0, v1

    .line 46
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v2, Lbsh/b;

    .line 55
    .line 56
    const/16 v3, 0xb

    .line 57
    .line 58
    invoke-direct {v2, v3}, Lbsh/b;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/16 v2, 0x4b

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    new-instance v3, Lbsh/i;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, v2, v3}, Ljava/util/stream/Stream;->reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    xor-int/2addr v0, v1

    .line 87
    return v0
.end method

.method public varargs declared-synchronized invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    sget-object p2, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    :try_start_1
    invoke-direct {p0, p1, p2}, Lbsh/Invocable;->invokeTarget(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    monitor-exit p0

    .line 22
    return-object p1

    .line 23
    :catchall_1
    move-exception p1

    .line 24
    :try_start_2
    new-instance p2, Ljava/lang/reflect/InvocationTargetException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    throw p1
.end method

.method public isGetter()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isInnerClass()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isSetter()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isStatic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/Invocable;->isStatic:Z

    .line 2
    .line 3
    return v0
.end method

.method public isSynthetic()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/Invocable;->isSynthetic:Z

    .line 2
    .line 3
    return v0
.end method

.method public isVarArgs()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
.end method

.method public methodType()Ljava/lang/invoke/MethodType;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/Invocable;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lbsh/Invocable;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/Invocable;->toString:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
