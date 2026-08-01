.class public final Lc10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lc10;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc10;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc10;->α:Lc10;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lc10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lc10;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    return-void
.end method

.method public static final α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lc10;->δ(Ljava/lang/reflect/Method;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, p1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v4, Ljava/util/ArrayList;

    .line 35
    .line 36
    array-length v5, v3

    .line 37
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    array-length v5, v3

    .line 41
    const/4 v6, 0x0

    .line 42
    :goto_1
    if-ge v6, v5, :cond_2

    .line 43
    .line 44
    aget-object v7, v3, v6

    .line 45
    .line 46
    const/4 v8, 0x1

    .line 47
    invoke-static {v7, v4, v6, v8}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 57
    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/16 v10, 0x3e

    .line 61
    .line 62
    const-string v5, ","

    .line 63
    .line 64
    const/4 v6, 0x0

    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    invoke-static/range {v4 .. v10}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "#"

    .line 72
    .line 73
    const-string v5, "("

    .line 74
    .line 75
    invoke-static {v0, v4, v1, v5, v3}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v1, "):"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static β(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/HashSet;)Z
    .locals 8

    .line 1
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    array-length v3, v2

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-ge v4, v3, :cond_2

    .line 20
    .line 21
    aget-object v5, v2, v4

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v5, v6}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    move v2, v0

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v2

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    move v2, v1

    .line 73
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    goto :goto_3

    .line 78
    :goto_2
    new-instance v3, Leo1;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v2, v3

    .line 84
    :goto_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 85
    .line 86
    instance-of v4, v2, Leo1;

    .line 87
    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    move-object v2, v3

    .line 91
    :cond_3
    check-cast v2, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-eqz v2, :cond_4

    .line 98
    .line 99
    return v0

    .line 100
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    array-length v2, p0

    .line 108
    move v3, v1

    .line 109
    :goto_4
    if-ge v3, v2, :cond_6

    .line 110
    .line 111
    aget-object v4, p0, v3

    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v4, p1, p2}, Lc10;->β(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/HashSet;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    move v1, v0

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_6
    :goto_5
    return v1
.end method

.method public static γ(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 16
    .line 17
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static δ(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    array-length v2, v0

    .line 31
    const/4 v3, 0x1

    .line 32
    if-ne v2, v3, :cond_3

    .line 33
    .line 34
    aget-object v0, v0, v1

    .line 35
    .line 36
    const-class v2, Landroid/view/MotionEvent;

    .line 37
    .line 38
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lc10;->γ(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :cond_3
    :goto_0
    return v1
.end method

.method public static ε(Ljava/lang/reflect/Method;)Z
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    const-class v3, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    array-length v4, v3

    .line 29
    :goto_1
    if-ge v2, v4, :cond_1

    .line 30
    .line 31
    aget-object v5, v3, v2

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {v5, p0, v0}, Lc10;->β(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/HashSet;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_3

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    new-instance v0, Leo1;

    .line 59
    .line 60
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object p0, v0

    .line 64
    :goto_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 65
    .line 66
    instance-of v1, p0, Leo1;

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    move-object p0, v0

    .line 71
    :cond_3
    check-cast p0, Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    return p0
.end method

.method public static η(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 9
    .line 10
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sget-object v2, Ljz;->ε:Ljz;

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v3, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"

    .line 24
    .line 25
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v0, v3}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-string v4, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 37
    .line 38
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v0, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    :goto_0
    return-object v2

    .line 49
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    array-length v5, v1

    .line 62
    const/4 v6, 0x0

    .line 63
    move v7, v6

    .line 64
    :goto_1
    const/4 v8, 0x1

    .line 65
    if-ge v7, v5, :cond_9

    .line 66
    .line 67
    aget-object v9, v1, v7

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    if-eqz v10, :cond_5

    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    if-eqz v10, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    array-length v11, v10

    .line 100
    const/4 v12, 0x3

    .line 101
    if-ne v11, v12, :cond_5

    .line 102
    .line 103
    aget-object v11, v10, v6

    .line 104
    .line 105
    const-class v12, Landroid/view/MotionEvent;

    .line 106
    .line 107
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-nez v11, :cond_4

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    aget-object v8, v10, v8

    .line 115
    .line 116
    invoke-virtual {v3, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-nez v8, :cond_6

    .line 121
    .line 122
    :cond_5
    :goto_2
    move v8, v6

    .line 123
    goto :goto_3

    .line 124
    :cond_6
    const/4 v8, 0x2

    .line 125
    aget-object v8, v10, v8

    .line 126
    .line 127
    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-nez v8, :cond_7

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v8}, Lc10;->γ(Ljava/lang/Class;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    :goto_3
    if-eqz v8, :cond_8

    .line 146
    .line 147
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_9
    new-instance v0, Ljava/util/HashSet;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    :cond_a
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_c

    .line 172
    .line 173
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    move-object v5, v4

    .line 178
    check-cast v5, Ljava/lang/reflect/Method;

    .line 179
    .line 180
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    invoke-static {v9, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v12, Ljava/util/ArrayList;

    .line 200
    .line 201
    array-length v13, v11

    .line 202
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    array-length v13, v11

    .line 206
    move v14, v6

    .line 207
    :goto_5
    if-ge v14, v13, :cond_b

    .line 208
    .line 209
    aget-object v15, v11, v14

    .line 210
    .line 211
    invoke-static {v15, v12, v14, v8}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    goto :goto_5

    .line 216
    :cond_b
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 221
    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x3e

    .line 226
    .line 227
    const-string v13, ","

    .line 228
    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    invoke-static/range {v12 .. v18}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    const-string v11, "#"

    .line 238
    .line 239
    const-string v12, "("

    .line 240
    .line 241
    invoke-static {v7, v11, v9, v12, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    const-string v7, "):"

    .line 246
    .line 247
    invoke-static {v5, v7, v10, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_a

    .line 252
    .line 253
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eq v0, v8, :cond_d

    .line 262
    .line 263
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    const-string v1, "\u53cc\u51fb\u70b9\u8d5e\u8bed\u4e49\u5165\u53e3\u5019\u9009\u4e0d\u552f\u4e00\uff0c\u62d2\u7edd\u4f7f\u7528 count="

    .line 268
    .line 269
    invoke-static {v1, v0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const/4 v1, 0x4

    .line 274
    const-string v3, "rc8611bc391e3e31b"

    .line 275
    .line 276
    const/4 v4, 0x0

    .line 277
    invoke-static {v3, v0, v4, v1, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    return-object v2

    .line 281
    :cond_d
    invoke-static {v1}, Lxh;->Щ(Ljava/util/List;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    move-object v1, v0

    .line 286
    check-cast v1, Ljava/lang/reflect/Method;

    .line 287
    .line 288
    invoke-virtual {v1, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0
.end method

.method public static θ(Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-static {p0}, Lc10;->ε(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x7d0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 21
    .line 22
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    add-int/lit16 v0, v0, 0x3e8

    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    array-length v2, v2

    .line 39
    const/4 v3, 0x1

    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    aget-object v1, v2, v1

    .line 47
    .line 48
    const-class v2, Landroid/view/MotionEvent;

    .line 49
    .line 50
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    add-int/lit16 v0, v0, 0x1f4

    .line 57
    .line 58
    :cond_2
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    add-int/lit16 v0, v0, 0x12c

    .line 71
    .line 72
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_4

    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x64

    .line 83
    .line 84
    :cond_4
    return v0
.end method


# virtual methods
.method public final ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v0, Lkx;->З:Lkx;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Ljz;->ε:Ljz;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_0
    invoke-virtual {p0, v1}, Lc10;->ι(Ljava/util/Collection;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v4

    .line 30
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_2
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 34
    .line 35
    const-string v1, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 36
    .line 37
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {p1, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    move-object v1, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lc10;->ι(Ljava/util/Collection;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    :goto_1
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v5, 0x4

    .line 72
    const-string v6, "rc8611bc391e3e31b"

    .line 73
    .line 74
    if-nez v3, :cond_5

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    :try_start_0
    invoke-static {v0, v1}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_0
    move-exception p0

    .line 85
    new-instance p1, Leo1;

    .line 86
    .line 87
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object p0, p1

    .line 91
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-eqz p0, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string p1, "\u4fdd\u5b58\u53cd\u5c04\u515c\u5e95\u7f13\u5b58\u5931\u8d25: "

    .line 102
    .line 103
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {v6, p0, v4, v5, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    return-object v1

    .line 111
    :cond_5
    if-eqz p2, :cond_8

    .line 112
    .line 113
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-nez p2, :cond_6

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {p2, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_7

    .line 135
    .line 136
    const-string p0, "\u4e3b\u7ebf\u7a0b\u4e0d\u6267\u884c DexKit \u626b\u63cf"

    .line 137
    .line 138
    invoke-static {v6, p0, v4, v5, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-object v2

    .line 142
    :cond_7
    new-instance p2, Lbb;

    .line 143
    .line 144
    const/16 v1, 0x17

    .line 145
    .line 146
    invoke-direct {p2, p1, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 147
    .line 148
    .line 149
    const-string v1, "\u5b9a\u4f4d Feed \u539f\u751f\u53cc\u51fb\u70b9\u8d5e\u5165\u53e3"

    .line 150
    .line 151
    invoke-static {v0, p1, v1, p2}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0, p1}, Lc10;->ι(Ljava/util/Collection;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_8
    :goto_3
    return-object v2
.end method

.method public final ι(Ljava/util/Collection;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Ljava/lang/reflect/Method;

    .line 26
    .line 27
    invoke-static {v3}, Lc10;->δ(Ljava/lang/reflect/Method;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x1

    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    move-object v5, v3

    .line 63
    check-cast v5, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-static {v7, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v10, Ljava/util/ArrayList;

    .line 85
    .line 86
    array-length v11, v9

    .line 87
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    array-length v11, v9

    .line 91
    const/4 v12, 0x0

    .line 92
    :goto_2
    if-ge v12, v11, :cond_3

    .line 93
    .line 94
    aget-object v13, v9, v12

    .line 95
    .line 96
    invoke-static {v13, v10, v12, v4}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 106
    .line 107
    .line 108
    const/4 v15, 0x0

    .line 109
    const/16 v16, 0x3e

    .line 110
    .line 111
    const-string v11, ","

    .line 112
    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const-string v5, "#"

    .line 121
    .line 122
    const-string v9, "("

    .line 123
    .line 124
    invoke-static {v6, v5, v7, v9, v4}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    const-string v5, "):"

    .line 129
    .line 130
    invoke-static {v4, v5, v8, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-eqz v4, :cond_2

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    sget-object v1, Ljz;->ε:Ljz;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    goto/16 :goto_6

    .line 149
    .line 150
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    if-eqz v5, :cond_7

    .line 164
    .line 165
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    move-object v6, v5

    .line 170
    check-cast v6, Ljava/lang/reflect/Method;

    .line 171
    .line 172
    invoke-static {v6}, Lc10;->ε(Ljava/lang/reflect/Method;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_6

    .line 177
    .line 178
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_8

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_8
    move-object v2, v0

    .line 190
    :goto_4
    new-instance v3, Lqt;

    .line 191
    .line 192
    const/16 v5, 0xc

    .line 193
    .line 194
    move-object/from16 v6, p0

    .line 195
    .line 196
    invoke-direct {v3, v5, v6}, Lqt;-><init>(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Ljava/lang/reflect/Method;

    .line 208
    .line 209
    if-eqz v3, :cond_c

    .line 210
    .line 211
    invoke-static {v3}, Lc10;->θ(Ljava/lang/reflect/Method;)I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    new-instance v5, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    :cond_9
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_a

    .line 229
    .line 230
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    move-object v7, v6

    .line 235
    check-cast v7, Ljava/lang/reflect/Method;

    .line 236
    .line 237
    invoke-static {v7}, Lc10;->θ(Ljava/lang/reflect/Method;)I

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-ne v7, v3, :cond_9

    .line 242
    .line 243
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eq v2, v4, :cond_b

    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    const-string v3, "\u53cc\u51fb\u5165\u53e3\u7ed3\u6784\u5019\u9009\u4e0d\u552f\u4e00\uff0c\u62d2\u7edd\u4f7f\u7528 count="

    .line 262
    .line 263
    const-string v4, ", interfaceBacked="

    .line 264
    .line 265
    invoke-static {v2, v0, v3, v4}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const/4 v2, 0x4

    .line 270
    const-string v3, "rc8611bc391e3e31b"

    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    return-object v1

    .line 277
    :cond_b
    invoke-static {v5}, Lxh;->Щ(Ljava/util/List;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object v1, v0

    .line 282
    check-cast v1, Ljava/lang/reflect/Method;

    .line 283
    .line 284
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    :cond_c
    :goto_6
    return-object v1
.end method
