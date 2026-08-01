.class public Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithDynamicType"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I

.field private final value:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->index:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

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
    iget v2, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_6

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    if-eqz p0, :cond_6

    .line 45
    .line 46
    :cond_5
    return v1

    .line 47
    :cond_6
    return v0
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
    iget v1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->index:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0

    .line 26
    :cond_0
    return v0
.end method

.method public resolve(ILjava/lang/Class;)Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->index:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    sget-object p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;->INSTANCE:Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-eq p2, p1, :cond_5

    .line 11
    .line 12
    const-class p1, Ljava/lang/Character;

    .line 13
    .line 14
    if-ne p2, p1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    const-class p1, Ljava/lang/String;

    .line 18
    .line 19
    if-ne p2, p1, :cond_2

    .line 20
    .line 21
    new-instance p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;

    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-static {}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex;->access$000()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Ljava/lang/Class;

    .line 44
    .line 45
    :cond_3
    const/4 v0, 0x0

    .line 46
    :try_start_0
    const-string v1, "valueOf"

    .line 47
    .line 48
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p2, v1, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    new-instance p2, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;

    .line 77
    .line 78
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 79
    .line 80
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {p2, p0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;-><init>(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object p2

    .line 92
    :catch_0
    move-exception p0

    .line 93
    goto :goto_0

    .line 94
    :catch_1
    move-exception p0

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    sget-object p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;->INSTANCE:Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 97
    .line 98
    return-object p0

    .line 99
    :catch_2
    sget-object p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;->INSTANCE:Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;

    .line 100
    .line 101
    return-object p0

    .line 102
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :goto_1
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_5
    :goto_2
    iget-object p1, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    const/4 p2, 0x1

    .line 123
    if-ne p1, p2, :cond_6

    .line 124
    .line 125
    new-instance p1, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;

    .line 126
    .line 127
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$ForIndex$WithDynamicType;->value:Ljava/lang/String;

    .line 128
    .line 129
    const/4 p2, 0x0

    .line 130
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-direct {p1, p0}, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Resolved;-><init>(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_6
    sget-object p0, Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;->INSTANCE:Lnet/bytebuddy/build/Plugin$Factory$UsingReflection$ArgumentResolver$Resolution$Unresolved;

    .line 143
    .line 144
    return-object p0
.end method
