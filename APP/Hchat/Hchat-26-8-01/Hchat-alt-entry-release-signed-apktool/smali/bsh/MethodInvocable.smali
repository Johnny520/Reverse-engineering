.class Lbsh/MethodInvocable;
.super Lbsh/ExecutingInvocable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final PROPERTY_PATTERN:Ljava/util/regex/Pattern;


# instance fields
.field private getter:Z

.field private method:Ljava/lang/reflect/Method;

.field private setter:Z

.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(?:[gs]et|is)\\p{javaUpperCase}.*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lbsh/MethodInvocable;->PROPERTY_PATTERN:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lbsh/ExecutingInvocable;-><init>(Ljava/lang/reflect/Executable;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/MethodInvocable;->getter:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lbsh/MethodInvocable;->setter:Z

    .line 8
    .line 9
    iput-object p1, p0, Lbsh/MethodInvocable;->method:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lbsh/MethodInvocable;->type:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterCount()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->isVarArgs()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v1, v2

    .line 26
    iput v1, p0, Lbsh/Invocable;->lastParameterIndex:I

    .line 27
    .line 28
    sget-object v1, Lbsh/MethodInvocable;->PROPERTY_PATTERN:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "set"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput-boolean v1, p0, Lbsh/MethodInvocable;->setter:Z

    .line 55
    .line 56
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterCount()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_0

    .line 66
    .line 67
    if-eq p1, v2, :cond_0

    .line 68
    .line 69
    move v1, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move v1, v0

    .line 72
    :goto_0
    iput-boolean v1, p0, Lbsh/MethodInvocable;->getter:Z

    .line 73
    .line 74
    iget-boolean v1, p0, Lbsh/MethodInvocable;->setter:Z

    .line 75
    .line 76
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterCount()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ne v4, v3, :cond_1

    .line 81
    .line 82
    if-ne p1, v2, :cond_1

    .line 83
    .line 84
    move v2, v3

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    move v2, v0

    .line 87
    :goto_1
    and-int/2addr v1, v2

    .line 88
    iput-boolean v1, p0, Lbsh/MethodInvocable;->setter:Z

    .line 89
    .line 90
    iget-boolean v1, p0, Lbsh/MethodInvocable;->getter:Z

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Lbsh/Invocable;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const-string v2, "is"

    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    const-class v1, Ljava/lang/Boolean;

    .line 107
    .line 108
    if-eq p1, v1, :cond_2

    .line 109
    .line 110
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 111
    .line 112
    if-ne p1, v1, :cond_3

    .line 113
    .line 114
    :cond_2
    move v0, v3

    .line 115
    :cond_3
    iput-boolean v0, p0, Lbsh/MethodInvocable;->getter:Z

    .line 116
    .line 117
    :cond_4
    return-void
.end method

.method private static getHandle(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    move-object v4, v2

    .line 18
    :cond_0
    :goto_0
    if-eqz v4, :cond_3

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v3, p0}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-object p0

    .line 27
    :catch_0
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    array-length v6, v5

    .line 32
    const/4 v7, 0x0

    .line 33
    :goto_1
    if-ge v7, v6, :cond_2

    .line 34
    .line 35
    aget-object v8, v5, v7

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {v8, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v3, p0}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 42
    .line 43
    .line 44
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 45
    return-object p0

    .line 46
    :catch_1
    add-int/lit8 v7, v7, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_0

    .line 54
    .line 55
    :try_start_2
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 59
    goto :goto_0

    .line 60
    :catch_2
    const/4 p0, 0x0

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    const-string v1, "MethodHandle lookup failed to find a "

    .line 65
    .line 66
    const-string v3, " in "

    .line 67
    .line 68
    invoke-static {v1, v0, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0
.end method


# virtual methods
.method public collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/ExecutingInvocable;->collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0}, Lbsh/Invocable;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    new-instance p1, Lbsh/Invocable$ParameterType;

    .line 18
    .line 19
    iget-object v0, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 20
    .line 21
    iget-boolean p2, p2, Lbsh/Invocable$ParameterType;->isFixedArity:Z

    .line 22
    .line 23
    invoke-direct {p1, v0, p2}, Lbsh/Invocable$ParameterType;-><init>(Ljava/util/List;Z)V

    .line 24
    .line 25
    .line 26
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
    iget-object v0, p0, Lbsh/MethodInvocable;->type:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public isGetter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/MethodInvocable;->getter:Z

    .line 2
    .line 3
    return v0
.end method

.method public isSetter()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/MethodInvocable;->setter:Z

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
    iget-object v0, p0, Lbsh/MethodInvocable;->method:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    invoke-static {v0}, Lbsh/MethodInvocable;->getHandle(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-super {p0, v0}, Lbsh/ExecutingInvocable;->lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iput-object p1, p0, Lbsh/MethodInvocable;->method:Ljava/lang/reflect/Method;

    .line 13
    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    :goto_0
    iput-object p1, p0, Lbsh/MethodInvocable;->method:Ljava/lang/reflect/Method;

    .line 25
    .line 26
    throw v0
.end method
