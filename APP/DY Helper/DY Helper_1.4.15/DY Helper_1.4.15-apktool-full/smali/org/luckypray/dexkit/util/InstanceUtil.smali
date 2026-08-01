.class public final Lorg/luckypray/dexkit/util/InstanceUtil;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

.field private static final classCache:Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private static final primitiveMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/util/InstanceUtil;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->INSTANCE:Lorg/luckypray/dexkit/util/InstanceUtil;

    .line 7
    .line 8
    new-instance v0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->classCache:Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;

    .line 15
    .line 16
    new-instance v2, Ll91;

    .line 17
    .line 18
    const-string v0, "boolean"

    .line 19
    .line 20
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ll91;

    .line 26
    .line 27
    const-string v0, "byte"

    .line 28
    .line 29
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-direct {v3, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, Ll91;

    .line 35
    .line 36
    const-string v0, "char"

    .line 37
    .line 38
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-direct {v4, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Ll91;

    .line 44
    .line 45
    const-string v0, "short"

    .line 46
    .line 47
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-direct {v5, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Ll91;

    .line 53
    .line 54
    const-string v0, "int"

    .line 55
    .line 56
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-direct {v6, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance v7, Ll91;

    .line 62
    .line 63
    const-string v0, "long"

    .line 64
    .line 65
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-direct {v7, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v8, Ll91;

    .line 71
    .line 72
    const-string v0, "float"

    .line 73
    .line 74
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-direct {v8, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v9, Ll91;

    .line 80
    .line 81
    const-string v0, "double"

    .line 82
    .line 83
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-direct {v9, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance v10, Ll91;

    .line 89
    .line 90
    const-string v0, "void"

    .line 91
    .line 92
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-direct {v10, v0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    filled-new-array/range {v2 .. v10}, [Ll91;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Lex0;->Μ([Ll91;)Ljava/util/Map;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sput-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->primitiveMap:Ljava/util/Map;

    .line 106
    .line 107
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getPrimitiveMap$p()Ljava/util/Map;
    .locals 1

    .line 1
    sget-object v0, Lorg/luckypray/dexkit/util/InstanceUtil;->primitiveMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method private final getDeclaredCtorOrNull(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 1
    :try_start_0
    array-length p0, p2

    .line 2
    invoke-static {p2, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    new-instance p1, Leo1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    instance-of p1, p0, Leo1;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    :cond_0
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 30
    .line 31
    return-object p0
.end method

.method private final getDeclaredFieldOrNull(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance p1, Leo1;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, p1

    .line 17
    :goto_0
    instance-of p1, p0, Leo1;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    :cond_0
    check-cast p0, Ljava/lang/reflect/Field;

    .line 23
    .line 24
    return-object p0
.end method

.method private final getDeclaredMethodOrNull(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :try_start_0
    array-length p0, p3

    .line 2
    invoke-static {p3, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    new-instance p1, Leo1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    instance-of p1, p0, Leo1;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    :cond_0
    check-cast p0, Ljava/lang/reflect/Method;

    .line 30
    .line 31
    return-object p0
.end method

.method public static synthetic getFieldInstance$default(Lorg/luckypray/dexkit/util/InstanceUtil;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Field;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/util/InstanceUtil;->getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic getMethodInstance$default(Lorg/luckypray/dexkit/util/InstanceUtil;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lorg/luckypray/dexkit/util/InstanceUtil;->getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final resolveParamTypesOrNull-gIAlu-s(Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->tryLoadType-gIAlu-s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p0, Leo1;

    .line 43
    .line 44
    invoke-direct {p0, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    new-array p0, p0, [Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 59
    .line 60
    const-string p1, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p0
.end method

.method private final tryLoadType-gIAlu-s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance p1, Leo1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method


# virtual methods
.method public final getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lorg/luckypray/dexkit/util/InstanceUtil;->classCache:Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;

    .line 8
    .line 9
    new-instance v0, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;

    .line 10
    .line 11
    invoke-direct {v0, p2, p1}, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, v0}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->get(Ljava/lang/ClassLoader;Ljava/lang/Object;Lp70;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0
.end method

.method public final getClassInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexClass;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Lorg/luckypray/dexkit/wrap/DexClass;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexClass;->getTypeName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public final getConstructorInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Constructor;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Lorg/luckypray/dexkit/wrap/DexMethod;",
            ")",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->isConstructor()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->resolveParamTypesOrNull-gIAlu-s(Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "Constructor "

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    check-cast p1, [Ljava/lang/Class;

    .line 38
    .line 39
    invoke-direct {p0, v0, p1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getDeclaredCtorOrNull(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    const/4 p0, 0x1

    .line 47
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    array-length v1, p1

    .line 55
    const/4 v3, 0x0

    .line 56
    :goto_0
    if-ge v3, v1, :cond_2

    .line 57
    .line 58
    aget-object v4, p1, v3

    .line 59
    .line 60
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v4}, Lorg/luckypray/dexkit/util/DexSignUtil;->getConstructorSign(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    invoke-virtual {v4, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    return-object v4

    .line 81
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    :cond_2
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-static {v0, p1, v1, v3}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 101
    .line 102
    invoke-virtual {p1, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_3
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 107
    .line 108
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string p2, " not found"

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_4
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 130
    .line 131
    new-instance p1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p2, " not available: parameter type(s) missing"

    .line 140
    .line 141
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 152
    .line 153
    .line 154
    throw p0

    .line 155
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string p1, " not a constructor"

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;)Ljava/lang/reflect/Field;
    .locals 6

    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/util/InstanceUtil;->getFieldInstance$default(Lorg/luckypray/dexkit/util/InstanceUtil;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0
.end method

.method public final getFieldInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexField;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getClassName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->tryLoadType-gIAlu-s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "Field "

    .line 28
    .line 29
    if-nez v1, :cond_6

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Class;

    .line 32
    .line 33
    move-object v1, v0

    .line 34
    :goto_0
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {p0, v1, v3}, Lorg/luckypray/dexkit/util/InstanceUtil;->getDeclaredFieldOrNull(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object p0, v0

    .line 63
    :goto_1
    const/4 p1, 0x1

    .line 64
    if-eqz p0, :cond_4

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    array-length v3, v1

    .line 74
    const/4 v4, 0x0

    .line 75
    :goto_2
    if-ge v4, v3, :cond_3

    .line 76
    .line 77
    aget-object v5, v1, v4

    .line 78
    .line 79
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_2

    .line 92
    .line 93
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v7}, Lorg/luckypray/dexkit/util/DexSignUtil;->getTypeSign(Ljava/lang/Class;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-eqz v6, :cond_2

    .line 113
    .line 114
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 115
    .line 116
    .line 117
    return-object v5

    .line 118
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    :cond_4
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexField;->getTypeSign()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-static {v0, p0, v1, p3}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-eqz p0, :cond_5

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 141
    .line 142
    .line 143
    return-object p0

    .line 144
    :cond_5
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 145
    .line 146
    new-instance p1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p2, " not found"

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_6
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 168
    .line 169
    new-instance p1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string p2, " not available: type missing"

    .line 178
    .line 179
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    throw p0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Method;
    .locals 6

    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lorg/luckypray/dexkit/util/InstanceUtil;->getMethodInstance$default(Lorg/luckypray/dexkit/util/InstanceUtil;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0
.end method

.method public final getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;Ljava/lang/Boolean;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->isMethod()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_8

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getClassName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, p1, v0}, Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getParamTypeNames()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {p0, p1, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->resolveParamTypesOrNull-gIAlu-s(Ljava/lang/ClassLoader;Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "Method "

    .line 34
    .line 35
    if-nez v2, :cond_7

    .line 36
    .line 37
    check-cast v1, [Ljava/lang/Class;

    .line 38
    .line 39
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getReturnTypeName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {p0, p1, v2}, Lorg/luckypray/dexkit/util/InstanceUtil;->tryLoadType-gIAlu-s(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-nez v2, :cond_6

    .line 52
    .line 53
    check-cast p1, Ljava/lang/Class;

    .line 54
    .line 55
    move-object v2, v0

    .line 56
    :goto_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-direct {p0, v2, v4, v1}, Lorg/luckypray/dexkit/util/InstanceUtil;->getDeclaredMethodOrNull(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_0

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-static {v5, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move-object p0, v0

    .line 85
    :goto_1
    const/4 p1, 0x1

    .line 86
    if-eqz p0, :cond_4

    .line 87
    .line 88
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    array-length v2, v1

    .line 96
    const/4 v4, 0x0

    .line 97
    :goto_2
    if-ge v4, v2, :cond_3

    .line 98
    .line 99
    aget-object v5, v1, v4

    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_2

    .line 114
    .line 115
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v5}, Lorg/luckypray/dexkit/util/DexSignUtil;->getMethodSign(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_2

    .line 128
    .line 129
    invoke-virtual {v5, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 130
    .line 131
    .line 132
    return-object v5

    .line 133
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    goto :goto_1

    .line 141
    :catchall_0
    :cond_4
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p2}, Lorg/luckypray/dexkit/wrap/DexMethod;->getMethodSign()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v0, p0, v1, p3}, Lorg/luckypray/dexkit/util/NativeReflect;->getReflectedMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/reflect/Member;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-eqz p0, :cond_5

    .line 154
    .line 155
    check-cast p0, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_5
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 162
    .line 163
    new-instance p1, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p2, " not found"

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p0

    .line 184
    :cond_6
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 185
    .line 186
    new-instance p1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p2, " not available: return type missing"

    .line 195
    .line 196
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 207
    .line 208
    .line 209
    throw p0

    .line 210
    :cond_7
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 211
    .line 212
    new-instance p1, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p2, " not available: parameter type(s) missing"

    .line 221
    .line 222
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 233
    .line 234
    .line 235
    throw p0

    .line 236
    :cond_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string p1, " not a method"

    .line 245
    .line 246
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p1
.end method
