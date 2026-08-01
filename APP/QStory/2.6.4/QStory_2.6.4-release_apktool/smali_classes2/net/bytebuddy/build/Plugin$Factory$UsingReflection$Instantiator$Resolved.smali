.class public Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Resolved"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation
.end field

.field private final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;",
            "Ljava/util/List<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->arguments:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

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
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->arguments:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->arguments:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public getConstructor()Ljava/lang/reflect/Constructor;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/reflect/Constructor<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->arguments:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public instantiate()Lnet/bytebuddy/build/Plugin;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->arguments:Ljava/util/List;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lnet/bytebuddy/build/Plugin;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :catch_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception v0

    .line 22
    goto :goto_2

    .line 23
    :catch_2
    move-exception v0

    .line 24
    goto :goto_3

    .line 25
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Error during construction of"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0, v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :goto_2
    const-string v1, "Failed to access "

    .line 51
    .line 52
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 53
    .line 54
    invoke-static {v1, p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :goto_3
    const-string v1, "Failed to instantiate plugin via "

    .line 59
    .line 60
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 61
    .line 62
    invoke-static {v1, p0, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1
.end method

.method public replaceBy(Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    const-class v1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;

    .line 10
    .line 11
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    move v0, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {v0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;->value()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    :goto_0
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-interface {v1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;->value()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_1
    if-le v0, v2, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    if-ge v0, v2, :cond_3

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    array-length v1, v1

    .line 50
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    array-length v2, v2

    .line 59
    if-le v1, v2, :cond_4

    .line 60
    .line 61
    :goto_2
    return-object p0

    .line 62
    :cond_4
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    array-length v1, v1

    .line 69
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    array-length v2, v2

    .line 78
    if-ge v1, v2, :cond_5

    .line 79
    .line 80
    :goto_3
    return-object p1

    .line 81
    :cond_5
    new-instance v1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;

    .line 82
    .line 83
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 84
    .line 85
    invoke-virtual {p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->getConstructor()Ljava/lang/reflect/Constructor;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;->constructor:Ljava/lang/reflect/Constructor;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    array-length p0, p0

    .line 96
    invoke-direct {v1, v2, p1, v0, p0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Ambiguous;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;II)V

    .line 97
    .line 98
    .line 99
    return-object v1
.end method
