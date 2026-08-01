.class public final Lbf;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lbf;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/Set;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ldf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbf;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbf;->α:Lbf;

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
    sput-object v0, Lbf;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sput-object v0, Lbf;->γ:Ljava/util/Set;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lbf;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lbf;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    new-instance v0, Ldf;

    .line 45
    .line 46
    invoke-direct {v0}, Ldf;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lbf;->ζ:Ldf;

    .line 50
    .line 51
    return-void
.end method

.method public static final α(Lbf;Ljava/lang/reflect/Method;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"

    .line 10
    .line 11
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    const/16 p0, 0x3e8

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p0, v0

    .line 26
    :goto_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    add-int/lit16 p0, p0, 0x12c

    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    array-length v1, v1

    .line 43
    const/4 v2, 0x7

    .line 44
    if-ne v1, v2, :cond_2

    .line 45
    .line 46
    add-int/lit16 p0, p0, 0x1f4

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, "LJII"

    .line 53
    .line 54
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    add-int/lit16 p0, p0, 0x2bc

    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v1, "X."

    .line 71
    .line 72
    invoke-static {p1, v1, v0}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    add-int/lit8 p0, p0, 0x64

    .line 79
    .line 80
    :cond_4
    return p0
.end method

.method public static final β(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p1}, Lbf;->ε(Ljava/lang/reflect/Method;)Z

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
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2, p1}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v5, Ljava/util/ArrayList;

    .line 39
    .line 40
    array-length v6, v4

    .line 41
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    array-length v6, v4

    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_1
    if-ge v7, v6, :cond_2

    .line 47
    .line 48
    aget-object v8, v4, v7

    .line 49
    .line 50
    invoke-static {v8, v5, v7, v0}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 60
    .line 61
    .line 62
    const/4 v10, 0x0

    .line 63
    const/16 v11, 0x3e

    .line 64
    .line 65
    const-string v6, ","

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string v4, "#"

    .line 75
    .line 76
    const-string v5, "("

    .line 77
    .line 78
    invoke-static {v1, v4, v2, v5, v0}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "):"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public static γ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 17

    .line 1
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/lang/reflect/Method;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, Ljava/lang/reflect/Method;

    .line 48
    .line 49
    invoke-static {v5}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7, v5}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    array-length v11, v9

    .line 71
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    array-length v11, v9

    .line 75
    const/4 v12, 0x0

    .line 76
    :goto_2
    if-ge v12, v11, :cond_2

    .line 77
    .line 78
    aget-object v13, v9, v12

    .line 79
    .line 80
    invoke-static {v13, v10, v12, v2}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 90
    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0x3e

    .line 94
    .line 95
    const-string v11, ","

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    const/4 v13, 0x0

    .line 99
    const/4 v14, 0x0

    .line 100
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v9, "#"

    .line 105
    .line 106
    const-string v10, "("

    .line 107
    .line 108
    invoke-static {v6, v9, v7, v10, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "):"

    .line 113
    .line 114
    invoke-static {v5, v6, v8, v0}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    return-object v1
.end method

.method public static ε(Ljava/lang/reflect/Method;)Z
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"

    .line 26
    .line 27
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v2, ".ChapterNavigationHelper"

    .line 46
    .line 47
    invoke-static {v0, v2, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    array-length v2, v0

    .line 59
    const/4 v3, 0x7

    .line 60
    if-eq v2, v3, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    aget-object v2, v0, v1

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v3, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 70
    .line 71
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    const/4 v2, 0x1

    .line 83
    aget-object v3, v0, v2

    .line 84
    .line 85
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    const/4 v3, 0x2

    .line 95
    aget-object v4, v0, v3

    .line 96
    .line 97
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_5

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    const/4 v4, 0x3

    .line 107
    aget-object v4, v0, v4

    .line 108
    .line 109
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-nez v4, :cond_6

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_6
    const/4 v4, 0x4

    .line 117
    aget-object v4, v0, v4

    .line 118
    .line 119
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-nez v4, :cond_7

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_7
    const/4 v4, 0x5

    .line 127
    aget-object v4, v0, v4

    .line 128
    .line 129
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-nez v4, :cond_8

    .line 136
    .line 137
    :goto_0
    return v1

    .line 138
    :cond_8
    const/4 v4, 0x6

    .line 139
    aget-object v0, v0, v4

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 149
    .line 150
    if-nez v4, :cond_9

    .line 151
    .line 152
    move v0, v1

    .line 153
    goto/16 :goto_c

    .line 154
    .line 155
    :cond_9
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    array-length v4, v0

    .line 163
    move v8, v1

    .line 164
    :goto_1
    if-ge v8, v4, :cond_b

    .line 165
    .line 166
    aget-object v9, v0, v8

    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    invoke-static {v10, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_a

    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 183
    .line 184
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_a

    .line 193
    .line 194
    move v4, v2

    .line 195
    goto :goto_2

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_b
    move v4, v1

    .line 203
    :goto_2
    array-length v8, v0

    .line 204
    move v9, v1

    .line 205
    :goto_3
    if-ge v9, v8, :cond_d

    .line 206
    .line 207
    aget-object v10, v0, v9

    .line 208
    .line 209
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    array-length v11, v11

    .line 217
    if-nez v11, :cond_c

    .line 218
    .line 219
    const-class v11, Landroid/app/Activity;

    .line 220
    .line 221
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-eqz v10, :cond_c

    .line 230
    .line 231
    move v8, v2

    .line 232
    goto :goto_4

    .line 233
    :cond_c
    add-int/lit8 v9, v9, 0x1

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_d
    move v8, v1

    .line 237
    :goto_4
    array-length v9, v0

    .line 238
    move v10, v1

    .line 239
    :goto_5
    if-ge v10, v9, :cond_f

    .line 240
    .line 241
    aget-object v11, v0, v10

    .line 242
    .line 243
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    array-length v12, v12

    .line 251
    if-nez v12, :cond_e

    .line 252
    .line 253
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    const-class v12, Ljava/lang/String;

    .line 258
    .line 259
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    if-eqz v11, :cond_e

    .line 264
    .line 265
    move v9, v2

    .line 266
    goto :goto_6

    .line 267
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_f
    move v9, v1

    .line 271
    :goto_6
    array-length v10, v0

    .line 272
    move v11, v1

    .line 273
    :goto_7
    if-ge v11, v10, :cond_11

    .line 274
    .line 275
    aget-object v12, v0, v11

    .line 276
    .line 277
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v13

    .line 281
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    array-length v13, v13

    .line 285
    if-nez v13, :cond_10

    .line 286
    .line 287
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    invoke-static {v12, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-eqz v12, :cond_10

    .line 296
    .line 297
    move v0, v2

    .line 298
    goto :goto_8

    .line 299
    :cond_10
    add-int/lit8 v11, v11, 0x1

    .line 300
    .line 301
    goto :goto_7

    .line 302
    :cond_11
    move v0, v1

    .line 303
    :goto_8
    if-eqz v4, :cond_12

    .line 304
    .line 305
    if-eqz v8, :cond_12

    .line 306
    .line 307
    if-eqz v9, :cond_12

    .line 308
    .line 309
    if-eqz v0, :cond_12

    .line 310
    .line 311
    move v0, v2

    .line 312
    goto :goto_9

    .line 313
    :cond_12
    move v0, v1

    .line 314
    :goto_9
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 315
    .line 316
    .line 317
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    goto :goto_b

    .line 319
    :goto_a
    new-instance v4, Leo1;

    .line 320
    .line 321
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    move-object v0, v4

    .line 325
    :goto_b
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 326
    .line 327
    instance-of v8, v0, Leo1;

    .line 328
    .line 329
    if-eqz v8, :cond_13

    .line 330
    .line 331
    move-object v0, v4

    .line 332
    :cond_13
    check-cast v0, Ljava/lang/Boolean;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    :goto_c
    if-eqz v0, :cond_22

    .line 339
    .line 340
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_21

    .line 352
    .line 353
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    if-eqz v0, :cond_14

    .line 358
    .line 359
    goto/16 :goto_16

    .line 360
    .line 361
    :cond_14
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    new-instance v0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 371
    .line 372
    .line 373
    array-length v4, p0

    .line 374
    move v7, v1

    .line 375
    :goto_d
    if-ge v7, v4, :cond_16

    .line 376
    .line 377
    aget-object v8, p0, v7

    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 384
    .line 385
    .line 386
    move-result v9

    .line 387
    if-nez v9, :cond_15

    .line 388
    .line 389
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_e

    .line 393
    :catchall_1
    move-exception p0

    .line 394
    goto/16 :goto_14

    .line 395
    .line 396
    :cond_15
    :goto_e
    add-int/lit8 v7, v7, 0x1

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    const/4 v4, 0x0

    .line 404
    if-eqz p0, :cond_17

    .line 405
    .line 406
    move v7, v1

    .line 407
    goto :goto_10

    .line 408
    :cond_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    move v7, v1

    .line 413
    :cond_18
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    if-eqz v8, :cond_1a

    .line 418
    .line 419
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    check-cast v8, Ljava/lang/reflect/Field;

    .line 424
    .line 425
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-static {v8, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v8

    .line 433
    if-eqz v8, :cond_18

    .line 434
    .line 435
    add-int/lit8 v7, v7, 0x1

    .line 436
    .line 437
    if-ltz v7, :cond_19

    .line 438
    .line 439
    goto :goto_f

    .line 440
    :cond_19
    invoke-static {}, Lyh;->ф()V

    .line 441
    .line 442
    .line 443
    throw v4

    .line 444
    :cond_1a
    :goto_10
    if-lt v7, v3, :cond_1f

    .line 445
    .line 446
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result p0

    .line 450
    if-eqz p0, :cond_1b

    .line 451
    .line 452
    move v0, v1

    .line 453
    goto :goto_12

    .line 454
    :cond_1b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object p0

    .line 458
    move v0, v1

    .line 459
    :cond_1c
    :goto_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    if-eqz v3, :cond_1e

    .line 464
    .line 465
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    check-cast v3, Ljava/lang/reflect/Field;

    .line 470
    .line 471
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    invoke-static {v3, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-eqz v3, :cond_1c

    .line 480
    .line 481
    add-int/lit8 v0, v0, 0x1

    .line 482
    .line 483
    if-ltz v0, :cond_1d

    .line 484
    .line 485
    goto :goto_11

    .line 486
    :cond_1d
    invoke-static {}, Lyh;->ф()V

    .line 487
    .line 488
    .line 489
    throw v4

    .line 490
    :cond_1e
    :goto_12
    if-lt v0, v2, :cond_1f

    .line 491
    .line 492
    move p0, v2

    .line 493
    goto :goto_13

    .line 494
    :cond_1f
    move p0, v1

    .line 495
    :goto_13
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 496
    .line 497
    .line 498
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 499
    goto :goto_15

    .line 500
    :goto_14
    new-instance v0, Leo1;

    .line 501
    .line 502
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 503
    .line 504
    .line 505
    move-object p0, v0

    .line 506
    :goto_15
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 507
    .line 508
    instance-of v3, p0, Leo1;

    .line 509
    .line 510
    if-eqz v3, :cond_20

    .line 511
    .line 512
    move-object p0, v0

    .line 513
    :cond_20
    check-cast p0, Ljava/lang/Boolean;

    .line 514
    .line 515
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 516
    .line 517
    .line 518
    move-result p0

    .line 519
    goto :goto_17

    .line 520
    :cond_21
    :goto_16
    move p0, v1

    .line 521
    :goto_17
    if-eqz p0, :cond_22

    .line 522
    .line 523
    move v1, v2

    .line 524
    :cond_22
    return v1
.end method

.method public static ζ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "re1ccc43159b6faec"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/ClassLoader;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, p1, v1}, Lbf;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string p0, "no skip method resolved, allowDexKitScan=false"

    .line 16
    .line 17
    invoke-static {p0}, Lbf;->ζ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_5

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-static {v2}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3, v2}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v6, Ljava/util/ArrayList;

    .line 58
    .line 59
    array-length v7, v5

    .line 60
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    array-length v7, v5

    .line 64
    move v8, v1

    .line 65
    :goto_1
    const/4 v13, 0x1

    .line 66
    if-ge v8, v7, :cond_2

    .line 67
    .line 68
    aget-object v9, v5, v8

    .line 69
    .line 70
    invoke-static {v9, v6, v8, v13}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 80
    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/16 v12, 0x3e

    .line 84
    .line 85
    const-string v7, ","

    .line 86
    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    invoke-static/range {v6 .. v12}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "("

    .line 95
    .line 96
    const-string v7, "#"

    .line 97
    .line 98
    invoke-static {v0, v7, v3, v6, v5}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v3, "):"

    .line 103
    .line 104
    invoke-static {v0, v3, v4}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v4, Lbf;->γ:Ljava/util/Set;

    .line 109
    .line 110
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_3

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :try_start_0
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 118
    .line 119
    .line 120
    sget-object v0, Lxq0;->α:Lxq0;

    .line 121
    .line 122
    new-instance v5, Lxe;

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-direct {v5, v6, p0, v2}, Lxe;-><init>(ILjava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_2

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    new-instance v5, Leo1;

    .line 135
    .line 136
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object v0, v5

    .line 140
    :goto_2
    instance-of v5, v0, Leo1;

    .line 141
    .line 142
    if-nez v5, :cond_4

    .line 143
    .line 144
    move-object v5, v0

    .line 145
    check-cast v5, Ll01;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    new-instance v8, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v9, "hooked "

    .line 162
    .line 163
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    invoke-static {v5}, Lbf;->ζ(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_1

    .line 187
    .line 188
    invoke-interface {v4, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v4, "hook failed "

    .line 208
    .line 209
    const-string v5, ": "

    .line 210
    .line 211
    invoke-static {v4, v3, v7, v2, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lbf;->ζ(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_5
    return-void
.end method

.method public final η(Ljava/lang/ClassLoader;)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836376A3EBF3A7DDC2D3458C1CDC0C2B628EF60276FC030F269B1E80CD3B21C0B13E896E0C5"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p0, Ljz;->ε:Ljz;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    array-length v1, p1

    .line 31
    const/4 v2, 0x0

    .line 32
    move v3, v2

    .line 33
    :goto_0
    if-ge v3, v1, :cond_2

    .line 34
    .line 35
    aget-object v4, p1, v3

    .line 36
    .line 37
    invoke-static {v4}, Lbf;->ε(Ljava/lang/reflect/Method;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    new-instance p1, Lye;

    .line 50
    .line 51
    invoke-direct {p1, v2, p0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lbf;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Ｄ:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_3

    .line 20
    .line 21
    new-instance p0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    move-object v0, p2

    .line 41
    check-cast v0, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-static {v0}, Lbf;->ε(Ljava/lang/reflect/Method;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {p0}, Lbf;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    invoke-virtual {p0, p1}, Lbf;->η(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-static {v0, p0}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-object p0

    .line 74
    :cond_5
    if-eqz p2, :cond_9

    .line 75
    .line 76
    sget-object p0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    new-instance p0, Lbb;

    .line 86
    .line 87
    const/4 p2, 0x7

    .line 88
    invoke-direct {p0, p1, p2}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 89
    .line 90
    .line 91
    const-string p2, "\u5b9a\u4f4d\u89c6\u9891\u7ae0\u8282\u5e7f\u544a\u81ea\u52a8\u8df3\u8fc7\u903b\u8f91"

    .line 92
    .line 93
    invoke-static {v0, p1, p2, p0}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_8

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    move-object v0, p2

    .line 117
    check-cast v0, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-static {v0}, Lbf;->ε(Ljava/lang/reflect/Method;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_8
    invoke-static {p1}, Lbf;->γ(Ljava/util/List;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_9
    :goto_3
    sget-object p0, Ljz;->ε:Ljz;

    .line 135
    .line 136
    return-object p0
.end method
