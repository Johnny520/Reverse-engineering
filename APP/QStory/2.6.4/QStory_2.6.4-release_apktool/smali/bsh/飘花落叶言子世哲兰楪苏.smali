.class public final Lbsh/飘花落叶言子世哲兰楪苏;
.super Lbsh/飘花落叶言子世苏楪兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子世苏哲楪兰:Ljava/util/regex/Pattern;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子世楪兰苏哲:Ljava/lang/Class;

.field public final 飘花落叶言子世苏楪兰哲:Z

.field public final 飘花落叶言子世苏楪哲兰:Z


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
    sput-object v0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏哲楪兰:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/reflect/Executable;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲:Z

    .line 8
    .line 9
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲:Ljava/lang/Class;

    .line 16
    .line 17
    iget v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 18
    .line 19
    iget-boolean v2, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 23
    .line 24
    sget-object v1, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏哲楪兰:Ljava/util/regex/Pattern;

    .line 25
    .line 26
    iget-object v2, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "set"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲:Z

    .line 47
    .line 48
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    iget v4, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 54
    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    if-eq p1, v2, :cond_0

    .line 58
    .line 59
    move v4, v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v4, v0

    .line 62
    :goto_0
    iput-boolean v4, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰:Z

    .line 63
    .line 64
    iget v5, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 65
    .line 66
    if-ne v5, v3, :cond_1

    .line 67
    .line 68
    if-ne p1, v2, :cond_1

    .line 69
    .line 70
    move v2, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    move v2, v0

    .line 73
    :goto_1
    and-int/2addr v1, v2

    .line 74
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲:Z

    .line 75
    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 79
    .line 80
    const-string v2, "is"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    const-class v1, Ljava/lang/Boolean;

    .line 89
    .line 90
    if-eq p1, v1, :cond_2

    .line 91
    .line 92
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    if-ne p1, v1, :cond_3

    .line 95
    .line 96
    :cond_2
    move v0, v3

    .line 97
    :cond_3
    iput-boolean v0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰:Z

    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public static 飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;
    .locals 10

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
    const/4 v5, 0x0

    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {v3, p0}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    return-object p0

    .line 28
    :catch_0
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    array-length v7, v6

    .line 33
    const/4 v8, 0x0

    .line 34
    :goto_1
    if-ge v8, v7, :cond_2

    .line 35
    .line 36
    aget-object v9, v6, v8

    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v9, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v3, p0}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 46
    return-object p0

    .line 47
    :catch_1
    add-int/lit8 v8, v8, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    :try_start_2
    invoke-virtual {v4, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2

    .line 60
    goto :goto_0

    .line 61
    :catch_2
    move-object p0, v5

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    const-string p0, "MethodHandle lookup failed to find a "

    .line 64
    .line 65
    const-string v1, " in "

    .line 66
    .line 67
    invoke-static {p0, v0, v1}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {v2, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v5
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-boolean v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance p1, Lbsh/飘花落叶言子世哲楪兰苏;

    .line 16
    .line 17
    iget-boolean p2, p2, Lbsh/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 18
    .line 19
    invoke-direct {p1, p0, p2}, Lbsh/飘花落叶言子世哲楪兰苏;-><init>(Ljava/util/ArrayList;Z)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public final 飘花落叶言子楪哲世苏兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏:Ljava/lang/reflect/Method;

    .line 3
    .line 4
    invoke-static {v0}, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪哲兰世苏(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/invoke/MethodHandle;->asVarargsCollector(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_0
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    return-object v0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    :goto_0
    iput-object p1, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏:Ljava/lang/reflect/Method;

    .line 33
    .line 34
    throw v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰:Z

    .line 2
    .line 3
    return p0
.end method
