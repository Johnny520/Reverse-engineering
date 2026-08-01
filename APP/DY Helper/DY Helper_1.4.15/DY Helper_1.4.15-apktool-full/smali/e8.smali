.class public final Le8;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le8;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static final α(Ljava/lang/reflect/Member;)I
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Le8;->ε(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 v0, 0x3e8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    instance-of v1, p0, Ljava/lang/reflect/Field;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    check-cast v2, Ljava/lang/reflect/Field;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    instance-of v2, p0, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    move-object v2, p0

    .line 35
    check-cast v2, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v2, 0x0

    .line 43
    :goto_1
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-static {v2}, Le8;->ζ(Ljava/lang/Class;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    add-int/lit16 v0, v0, 0x7d0

    .line 52
    .line 53
    :cond_3
    const-string v2, "author"

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    move-object v3, p0

    .line 58
    check-cast v3, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    invoke-static {v3}, Le8;->μ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v4, 0x1

    .line 71
    if-ne v3, v4, :cond_4

    .line 72
    .line 73
    add-int/lit16 v0, v0, 0xfa0

    .line 74
    .line 75
    :cond_4
    instance-of v3, p0, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    move-object v3, p0

    .line 80
    check-cast v3, Ljava/lang/reflect/Method;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v4, "getAuthor"

    .line 87
    .line 88
    invoke-static {v3, v4}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    add-int/lit16 v0, v0, 0x1f4

    .line 95
    .line 96
    :cond_5
    if-eqz v1, :cond_6

    .line 97
    .line 98
    check-cast p0, Ljava/lang/reflect/Field;

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0, v2}, Lx02;->Κ(Ljava/lang/String;Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_6

    .line 109
    .line 110
    add-int/lit16 v0, v0, 0x1f4

    .line 111
    .line 112
    :cond_6
    return v0
.end method

.method public static β(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static γ(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public static δ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, "null"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const-string v0, "\u672a\u77e5"

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    const-string v0, "unknown"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method public static ε(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "author"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "mAuthor"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-string v0, "authorInfo"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    const-string v0, "getAuthor"

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    const-string v0, "getAuthorInfo"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public static ζ(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"

    .line 6
    .line 7
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "User"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static η(Ljava/lang/reflect/Member;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    instance-of v1, p0, Ljava/lang/reflect/Field;

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Ljava/lang/reflect/Field;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/lang/reflect/Field;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v1, p0, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, Ljava/lang/reflect/Method;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 30
    .line 31
    .line 32
    check-cast p0, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object p0, v0

    .line 40
    goto :goto_1

    .line 41
    :goto_0
    new-instance p1, Leo1;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object p0, p1

    .line 47
    :goto_1
    instance-of p1, p0, Leo1;

    .line 48
    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v0, p0

    .line 53
    :goto_2
    return-object v0
.end method

.method public static varargs θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p0, p1}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of p1, p0, Ljava/lang/Number;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static varargs ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v3, v1, :cond_0

    .line 11
    .line 12
    aget-object v4, p1, v3

    .line 13
    .line 14
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    array-length v3, p1

    .line 39
    move v4, v2

    .line 40
    :goto_1
    if-ge v4, v3, :cond_2

    .line 41
    .line 42
    aget-object v5, p1, v4

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-lez v6, :cond_1

    .line 49
    .line 50
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v6}, Ljava/lang/Character;->toUpperCase(C)C

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const/4 v7, 0x1

    .line 59
    invoke-virtual {v5, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    new-instance v8, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    goto :goto_2

    .line 79
    :cond_1
    move-object v6, v5

    .line 80
    :goto_2
    const-string v7, "get"

    .line 81
    .line 82
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v1, v5}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v4, v4, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    .line 101
    .line 102
    const/16 v2, 0xa

    .line 103
    .line 104
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 128
    .line 129
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    invoke-static {p1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-static {v1}, Le8;->γ(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    const/4 v3, 0x0

    .line 161
    if-eqz v2, :cond_5

    .line 162
    .line 163
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    move-object v4, v2

    .line 168
    check-cast v4, Ljava/lang/reflect/Method;

    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-nez v5, :cond_4

    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    array-length v5, v5

    .line 188
    if-nez v5, :cond_4

    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 195
    .line 196
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-nez v5, :cond_4

    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 210
    .line 211
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-interface {p1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_4

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_5
    move-object v2, v3

    .line 226
    :goto_4
    check-cast v2, Ljava/lang/reflect/Method;

    .line 227
    .line 228
    if-eqz v2, :cond_6

    .line 229
    .line 230
    invoke-static {v2, p0}, Le8;->η(Ljava/lang/reflect/Member;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-eqz p1, :cond_6

    .line 235
    .line 236
    return-object p1

    .line 237
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-static {p1}, Le8;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_8

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-object v4, v2

    .line 260
    check-cast v4, Ljava/lang/reflect/Field;

    .line 261
    .line 262
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-nez v5, :cond_7

    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 280
    .line 281
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_7

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_8
    move-object v2, v3

    .line 296
    :goto_5
    check-cast v2, Ljava/lang/reflect/Field;

    .line 297
    .line 298
    if-eqz v2, :cond_9

    .line 299
    .line 300
    invoke-static {v2, p0}, Le8;->η(Ljava/lang/reflect/Member;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    if-eqz v1, :cond_9

    .line 305
    .line 306
    return-object v1

    .line 307
    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_c

    .line 316
    .line 317
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    move-object v2, v1

    .line 322
    check-cast v2, Ljava/lang/reflect/Field;

    .line 323
    .line 324
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    if-nez v4, :cond_a

    .line 333
    .line 334
    move-object v4, v0

    .line 335
    check-cast v4, Ljava/lang/Iterable;

    .line 336
    .line 337
    invoke-static {v2}, Le8;->μ(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    if-eqz v2, :cond_b

    .line 342
    .line 343
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 344
    .line 345
    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_b
    move-object v2, v3

    .line 354
    :goto_6
    invoke-static {v4, v2}, Lxh;->Б(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_a

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_c
    move-object v1, v3

    .line 362
    :goto_7
    check-cast v1, Ljava/lang/reflect/Field;

    .line 363
    .line 364
    if-eqz v1, :cond_d

    .line 365
    .line 366
    invoke-static {v1, p0}, Le8;->η(Ljava/lang/reflect/Member;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    if-eqz p0, :cond_d

    .line 371
    .line 372
    return-object p0

    .line 373
    :cond_d
    return-object v3
.end method

.method public static κ(Ljava/lang/Object;)Ld8;
    .locals 21

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ln7;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, v2}, Ln7;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lc8;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v1, v3}, Lc8;-><init>(La80;I)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Le8;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/reflect/Member;

    .line 51
    .line 52
    move-object/from16 v3, p0

    .line 53
    .line 54
    invoke-static {v2, v3}, Le8;->η(Ljava/lang/reflect/Member;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-ne v5, v2, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    const/16 v2, 0xa

    .line 92
    .line 93
    invoke-static {v1, v2}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v3, 0x0

    .line 109
    if-eqz v2, :cond_11

    .line 110
    .line 111
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const-string v4, "userId"

    .line 116
    .line 117
    const-string v5, "user_id"

    .line 118
    .line 119
    const-string v6, "uid"

    .line 120
    .line 121
    filled-new-array {v6, v4, v5}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v2, v4}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-static {v4}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    const/4 v5, 0x5

    .line 134
    const/4 v6, 0x0

    .line 135
    if-eqz v4, :cond_7

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-lt v7, v5, :cond_7

    .line 142
    .line 143
    move v7, v6

    .line 144
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    if-ge v7, v8, :cond_6

    .line 149
    .line 150
    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_5

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    move-object v11, v4

    .line 165
    goto :goto_5

    .line 166
    :cond_7
    :goto_4
    move-object v11, v3

    .line 167
    :goto_5
    const-string v4, "nick_name"

    .line 168
    .line 169
    const-string v7, "displayName"

    .line 170
    .line 171
    const-string v8, "nickname"

    .line 172
    .line 173
    const-string v9, "nickName"

    .line 174
    .line 175
    filled-new-array {v8, v9, v4, v7}, [Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v2, v4}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-static {v4}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    if-nez v4, :cond_8

    .line 188
    .line 189
    const-string v4, ""

    .line 190
    .line 191
    :cond_8
    move-object v9, v4

    .line 192
    const-string v4, "shortId"

    .line 193
    .line 194
    const-string v7, "short_id"

    .line 195
    .line 196
    const-string v8, "uniqueId"

    .line 197
    .line 198
    const-string v10, "unique_id"

    .line 199
    .line 200
    filled-new-array {v8, v10, v4, v7}, [Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-static {v2, v4}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v4}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    const-string v4, "sec_uid"

    .line 213
    .line 214
    const-string v7, "secUserId"

    .line 215
    .line 216
    const-string v8, "secUid"

    .line 217
    .line 218
    const-string v12, "secUID"

    .line 219
    .line 220
    filled-new-array {v8, v12, v4, v7}, [Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-static {v2, v4}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-static {v4}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    if-eqz v4, :cond_a

    .line 233
    .line 234
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    if-lt v7, v5, :cond_b

    .line 239
    .line 240
    move v5, v6

    .line 241
    :goto_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    if-ge v5, v7, :cond_a

    .line 246
    .line 247
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    invoke-static {v7}, Ljava/lang/Character;->isDigit(C)Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-nez v7, :cond_9

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_a
    move-object v12, v3

    .line 262
    goto :goto_8

    .line 263
    :cond_b
    :goto_7
    move-object v12, v4

    .line 264
    :goto_8
    const-string v3, "signature"

    .line 265
    .line 266
    filled-new-array {v3}, [Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v2, v3}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v3}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v13

    .line 278
    const-string v3, "followerCount"

    .line 279
    .line 280
    const-string v4, "follower_count"

    .line 281
    .line 282
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-static {v2, v3}, Le8;->θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    if-eqz v3, :cond_c

    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    move v14, v3

    .line 297
    goto :goto_9

    .line 298
    :cond_c
    move v14, v6

    .line 299
    :goto_9
    const-string v3, "followingCount"

    .line 300
    .line 301
    const-string v4, "following_count"

    .line 302
    .line 303
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-static {v2, v3}, Le8;->θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    if-eqz v3, :cond_d

    .line 312
    .line 313
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    move v15, v3

    .line 318
    goto :goto_a

    .line 319
    :cond_d
    move v15, v6

    .line 320
    :goto_a
    const-string v3, "awemeCount"

    .line 321
    .line 322
    const-string v4, "aweme_count"

    .line 323
    .line 324
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-static {v2, v3}, Le8;->θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    if-eqz v3, :cond_e

    .line 333
    .line 334
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    move/from16 v16, v3

    .line 339
    .line 340
    goto :goto_b

    .line 341
    :cond_e
    move/from16 v16, v6

    .line 342
    .line 343
    :goto_b
    const-string v3, "verificationType"

    .line 344
    .line 345
    const-string v4, "verification_type"

    .line 346
    .line 347
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-static {v2, v3}, Le8;->θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    if-eqz v3, :cond_f

    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    :cond_f
    move/from16 v17, v6

    .line 362
    .line 363
    const-string v3, "ipLocation"

    .line 364
    .line 365
    const-string v4, "ip_location"

    .line 366
    .line 367
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v2, v3}, Le8;->ι(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-static {v3}, Le8;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v18

    .line 379
    const-string v3, "liveStatus"

    .line 380
    .line 381
    const-string v4, "live_status"

    .line 382
    .line 383
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-static {v2, v3}, Le8;->θ(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Number;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    if-eqz v2, :cond_10

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    :goto_c
    move-wide/from16 v19, v2

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_10
    const-wide/16 v2, 0x0

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :goto_d
    new-instance v8, Ld8;

    .line 404
    .line 405
    invoke-direct/range {v8 .. v20}, Ld8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;J)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    goto/16 :goto_2

    .line 412
    .line 413
    :cond_11
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-nez v1, :cond_12

    .line 422
    .line 423
    move-object v1, v3

    .line 424
    goto :goto_e

    .line 425
    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-nez v2, :cond_13

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :cond_13
    move-object v2, v1

    .line 437
    check-cast v2, Ld8;

    .line 438
    .line 439
    invoke-static {v2}, Le8;->λ(Ld8;)I

    .line 440
    .line 441
    .line 442
    move-result v2

    .line 443
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    move-object v5, v4

    .line 448
    check-cast v5, Ld8;

    .line 449
    .line 450
    invoke-static {v5}, Le8;->λ(Ld8;)I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-ge v2, v5, :cond_15

    .line 455
    .line 456
    move-object v1, v4

    .line 457
    move v2, v5

    .line 458
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_14

    .line 463
    .line 464
    :goto_e
    check-cast v1, Ld8;

    .line 465
    .line 466
    if-eqz v1, :cond_17

    .line 467
    .line 468
    invoke-static {v1}, Le8;->λ(Ld8;)I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    if-lez v0, :cond_16

    .line 473
    .line 474
    move-object v3, v1

    .line 475
    :cond_16
    if-eqz v3, :cond_17

    .line 476
    .line 477
    return-object v3

    .line 478
    :cond_17
    new-instance v4, Ld8;

    .line 479
    .line 480
    const/4 v13, 0x0

    .line 481
    const-wide/16 v15, 0x0

    .line 482
    .line 483
    const-string v5, ""

    .line 484
    .line 485
    const/4 v6, 0x0

    .line 486
    const/4 v7, 0x0

    .line 487
    const/4 v8, 0x0

    .line 488
    const/4 v9, 0x0

    .line 489
    const/4 v10, 0x0

    .line 490
    const/4 v11, 0x0

    .line 491
    const/4 v12, 0x0

    .line 492
    const/4 v14, 0x0

    .line 493
    invoke-direct/range {v4 .. v16}, Ld8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;J)V

    .line 494
    .line 495
    .line 496
    return-object v4
.end method

.method public static λ(Ld8;)I
    .locals 2

    .line 1
    iget-object v0, p0, Ld8;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Ld8;->γ:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v0, v0, 0xc

    .line 25
    .line 26
    :cond_2
    :goto_1
    iget-object v1, p0, Ld8;->β:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    add-int/lit8 v0, v0, 0x8

    .line 38
    .line 39
    :cond_4
    :goto_2
    iget-object v1, p0, Ld8;->δ:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_5
    add-int/lit8 v0, v0, 0x6

    .line 51
    .line 52
    :cond_6
    :goto_3
    iget-object v1, p0, Ld8;->ε:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v1, :cond_8

    .line 55
    .line 56
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_7

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_7
    add-int/lit8 v0, v0, 0x2

    .line 64
    .line 65
    :cond_8
    :goto_4
    iget p0, p0, Ld8;->ζ:I

    .line 66
    .line 67
    if-lez p0, :cond_9

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x1

    .line 70
    .line 71
    :cond_9
    return v0
.end method

.method public static μ(Ljava/lang/reflect/Field;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    if-ge v1, v0, :cond_1

    .line 12
    .line 13
    aget-object v3, p0, v1

    .line 14
    .line 15
    invoke-static {v3}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "SerializedName"

    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v3, v2

    .line 40
    :goto_1
    if-nez v3, :cond_2

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_2
    :try_start_0
    invoke-static {v3}, Lln0;->Ζ(Ljava/lang/annotation/Annotation;)Lwf;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lln0;->Λ(Lwf;)Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "value"

    .line 52
    .line 53
    invoke-virtual {p0, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    instance-of v0, p0, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    move-object p0, v2

    .line 71
    goto :goto_3

    .line 72
    :goto_2
    new-instance v0, Leo1;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object p0, v0

    .line 78
    :goto_3
    instance-of v0, p0, Leo1;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    move-object v2, p0

    .line 84
    :goto_4
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    return-object v2
.end method
