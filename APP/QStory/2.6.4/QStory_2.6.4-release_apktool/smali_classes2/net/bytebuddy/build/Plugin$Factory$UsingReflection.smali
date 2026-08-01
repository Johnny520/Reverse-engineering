.class public Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingReflection"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;,
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Priority;,
        Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final argumentResolvers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;",
            ">;"
        }
    .end annotation
.end field

.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;)V"
        }
    .end annotation

    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;-><init>(Ljava/lang/Class;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lnet/bytebuddy/build/Plugin;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

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

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public make()Lnet/bytebuddy/build/Plugin;
    .locals 15

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Unresolved;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Unresolved;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    if-ge v4, v2, :cond_3

    .line 18
    .line 19
    aget-object v5, v1, v4

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->isSynthetic()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-nez v6, :cond_2

    .line 26
    .line 27
    new-instance v6, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    array-length v7, v7

    .line 34
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    array-length v8, v7

    .line 42
    move v9, v3

    .line 43
    move v10, v9

    .line 44
    :goto_1
    if-ge v9, v8, :cond_1

    .line 45
    .line 46
    aget-object v11, v7, v9

    .line 47
    .line 48
    iget-object v12, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    :cond_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    if-eqz v13, :cond_2

    .line 59
    .line 60
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v13

    .line 64
    check-cast v13, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;

    .line 65
    .line 66
    invoke-interface {v13, v10, v11}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;->resolve(ILjava/lang/Class;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    invoke-interface {v13}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution;->isResolved()Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    if-eqz v14, :cond_0

    .line 75
    .line 76
    invoke-interface {v13}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution;->getArgument()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    add-int/lit8 v10, v10, 0x1

    .line 84
    .line 85
    add-int/lit8 v9, v9, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v7, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;

    .line 89
    .line 90
    invoke-direct {v7, v5, v6}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;-><init>(Ljava/lang/reflect/Constructor;Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v0, v7}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;->replaceBy(Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator$Resolved;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-interface {v0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$Instantiator;->instantiate()Lnet/bytebuddy/build/Plugin;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method public with(Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;",
            ">;)",
            "Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->type:Ljava/lang/Class;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->argumentResolvers:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;-><init>(Ljava/lang/Class;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public varargs with([Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;
    .locals 0

    .line 15
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;->with(Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection;

    move-result-object p0

    return-object p0
.end method
