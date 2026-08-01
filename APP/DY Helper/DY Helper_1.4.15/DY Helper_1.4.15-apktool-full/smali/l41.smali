.class public final Ll41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ll41;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/Set;

.field public static final δ:Ljava/util/Set;

.field public static final ε:Ljava/util/Set;

.field public static final ζ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ll41;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll41;->α:Ll41;

    .line 7
    .line 8
    const-string v0, "LJI"

    .line 9
    .line 10
    const-string v1, "getCacheCount"

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Ll41;->β:Ljava/util/Set;

    .line 21
    .line 22
    const-string v0, "LJJI"

    .line 23
    .line 24
    const-string v1, "setCacheCount"

    .line 25
    .line 26
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Ll41;->γ:Ljava/util/Set;

    .line 35
    .line 36
    const-string v0, "LJJIIJZLJL"

    .line 37
    .line 38
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ll41;->δ:Ljava/util/Set;

    .line 47
    .line 48
    const-string v0, "kr0"

    .line 49
    .line 50
    const-string v2, "adjustCacheCount"

    .line 51
    .line 52
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Ll41;->ε:Ljava/util/Set;

    .line 61
    .line 62
    const-string v0, "renderCacheCount"

    .line 63
    .line 64
    const-string v1, "updateCacheCountSelection"

    .line 65
    .line 66
    const-string v2, "wr0"

    .line 67
    .line 68
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Ll41;->ζ:Ljava/util/Set;

    .line 77
    .line 78
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    new-instance p1, Leo1;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p0, p1

    .line 14
    :goto_0
    instance-of p1, p0, Leo1;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 20
    .line 21
    return-object p0
.end method

.method public static β(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v1
.end method

.method public static γ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lzi;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p2, v1}, Lzi;-><init>([Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 31
    .line 32
    invoke-static {v0, p1}, Ll41;->ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    new-instance p2, Leo1;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    instance-of p0, p2, Leo1;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    sget-object p2, Ljz;->ε:Ljz;

    .line 53
    .line 54
    :cond_2
    check-cast p2, Ljava/util/List;

    .line 55
    .line 56
    return-object p2
.end method

.method public static δ(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lyh0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p2, v1}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lorg/luckypray/dexkit/result/MethodData;

    .line 31
    .line 32
    invoke-static {v0, p1}, Ll41;->ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    new-instance p2, Leo1;

    .line 44
    .line 45
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    instance-of p0, p2, Leo1;

    .line 49
    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    sget-object p2, Ljz;->ε:Ljz;

    .line 53
    .line 54
    :cond_2
    check-cast p2, Ljava/util/List;

    .line 55
    .line 56
    return-object p2
.end method

.method public static ε(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "onViewCreated"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    array-length v2, p0

    .line 46
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    array-length v2, p0

    .line 50
    move v3, v1

    .line 51
    :goto_0
    const/4 v4, 0x1

    .line 52
    if-ge v3, v2, :cond_0

    .line 53
    .line 54
    aget-object v5, p0, v3

    .line 55
    .line 56
    invoke-static {v5, v0, v3, v4}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const-string p0, "android.view.View"

    .line 62
    .line 63
    const-string v2, "android.os.Bundle"

    .line 64
    .line 65
    filled-new-array {p0, v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    return v4

    .line 80
    :cond_1
    return v1
.end method

.method public static ζ(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public static η(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    array-length p0, p0

    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public static θ(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return p0
.end method

.method public static ι(Lkx;Ljava/lang/ClassLoader;Lp70;)Lqx;
    .locals 2

    .line 1
    new-instance v0, Lqx;

    .line 2
    .line 3
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lox;->ο(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Lkx;->ζ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {v0, p1, p0, p2}, Lqx;-><init>(Ljava/lang/String;Ljava/lang/String;Lp70;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lkx;->ε:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v2

    .line 20
    :goto_0
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Ll41;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {p3, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_3

    .line 66
    .line 67
    move-object v2, v3

    .line 68
    :cond_3
    const-string v0, "DYH-OfflineDex"

    .line 69
    .line 70
    const-string v3, "[resolve] key="

    .line 71
    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p2, " source=cache count="

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v2

    .line 102
    :cond_4
    invoke-interface {p4}, Lp70;->invoke()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    check-cast p4, Ljava/util/List;

    .line 107
    .line 108
    invoke-static {p4}, Ll41;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    new-instance v2, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    :cond_5
    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-interface {p3, v4}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_5

    .line 142
    .line 143
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result p4

    .line 151
    if-nez p4, :cond_8

    .line 152
    .line 153
    if-eqz p2, :cond_7

    .line 154
    .line 155
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {p0, v2}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p2, " source=reflection count="

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v2

    .line 188
    :cond_8
    if-eqz p2, :cond_c

    .line 189
    .line 190
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 191
    .line 192
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-nez p2, :cond_9

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    iget-object p2, p0, Lkx;->ζ:Ljava/lang/String;

    .line 202
    .line 203
    new-instance p4, Lxj0;

    .line 204
    .line 205
    const/4 v2, 0x1

    .line 206
    invoke-direct {p4, p5, v2}, Lxj0;-><init>(La80;I)V

    .line 207
    .line 208
    .line 209
    invoke-static {p0, p1, p2, p4}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-static {p0}, Ll41;->β(Ljava/util/List;)Ljava/util/ArrayList;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    new-instance p1, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    :cond_a
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-eqz p2, :cond_b

    .line 231
    .line 232
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    invoke-interface {p3, p2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p4

    .line 240
    check-cast p4, Ljava/lang/Boolean;

    .line 241
    .line 242
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result p4

    .line 246
    if-eqz p4, :cond_a

    .line 247
    .line 248
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_b
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    new-instance p2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string p3, " source=dexkit count="

    .line 265
    .line 266
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object p1

    .line 280
    :cond_c
    :goto_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string p1, " source=deferred count=0"

    .line 289
    .line 290
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    sget-object p0, Ljz;->ε:Ljz;

    .line 301
    .line 302
    return-object p0
.end method

.method public static ν(Lorg/luckypray/dexkit/result/MethodData;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    const/4 v4, 0x1

    .line 16
    if-ge v3, v2, :cond_1

    .line 17
    .line 18
    aget-object v5, v1, v3

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const-string v7, "getMethodInstance"

    .line 25
    .line 26
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    array-length v6, v6

    .line 37
    if-ne v6, v4, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_3

    .line 42
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object v5, v0

    .line 46
    :goto_1
    if-nez v5, :cond_3

    .line 47
    .line 48
    :cond_2
    move-object p0, v0

    .line 49
    goto :goto_4

    .line 50
    :cond_3
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v5, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    instance-of p1, p0, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    check-cast p0, Ljava/lang/reflect/Method;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object p0, v0

    .line 66
    :goto_2
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_4

    .line 72
    :goto_3
    new-instance p1, Leo1;

    .line 73
    .line 74
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object p0, p1

    .line 78
    :goto_4
    instance-of p1, p0, Leo1;

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_5
    move-object v0, p0

    .line 84
    :goto_5
    check-cast v0, Ljava/lang/reflect/Method;

    .line 85
    .line 86
    return-object v0
.end method


# virtual methods
.method public final λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lny0;

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v7, 0x5

    .line 8
    const/4 v1, 0x1

    .line 9
    const-class v3, Ll41;

    .line 10
    .line 11
    const-string v4, "isExactTargetGetter"

    .line 12
    .line 13
    const-string v5, "isExactTargetGetter(Ljava/lang/reflect/Method;)Z"

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    invoke-direct/range {v0 .. v7}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Lr20;

    .line 20
    .line 21
    const/16 p0, 0x1b

    .line 22
    .line 23
    invoke-direct {v4, p1, p0}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 24
    .line 25
    .line 26
    new-instance v5, Lt20;

    .line 27
    .line 28
    const/16 p0, 0x12

    .line 29
    .line 30
    invoke-direct {v5, p1, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 31
    .line 32
    .line 33
    move-object v3, v0

    .line 34
    sget-object v0, Lkx;->Ｍ:Lkx;

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    move v2, p2

    .line 38
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public final μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lny0;

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v7, 0x6

    .line 8
    const/4 v1, 0x1

    .line 9
    const-class v3, Ll41;

    .line 10
    .line 11
    const-string v4, "isExactTargetSetter"

    .line 12
    .line 13
    const-string v5, "isExactTargetSetter(Ljava/lang/reflect/Method;)Z"

    .line 14
    .line 15
    move-object v2, p0

    .line 16
    invoke-direct/range {v0 .. v7}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    new-instance v4, Lk41;

    .line 20
    .line 21
    const/4 p0, 0x7

    .line 22
    invoke-direct {v4, p1, p0}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 23
    .line 24
    .line 25
    new-instance v5, Lt20;

    .line 26
    .line 27
    const/16 p0, 0x13

    .line 28
    .line 29
    invoke-direct {v5, p1, p0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 30
    .line 31
    .line 32
    move-object v3, v0

    .line 33
    sget-object v0, Lkx;->Ｎ:Lkx;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    move v2, p2

    .line 37
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
