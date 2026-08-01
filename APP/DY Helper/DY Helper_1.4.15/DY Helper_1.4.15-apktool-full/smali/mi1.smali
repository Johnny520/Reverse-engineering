.class public final Lmi1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lmi1;

.field public static final β:Ljava/util/List;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final η:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ι:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmi1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lmi1;->α:Lmi1;

    .line 7
    .line 8
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89AE7092F5DC2A5A919822E5893A800A32F1302E7F"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89B97692FDF6367CA0853DF9893A800A32F1302E7F"

    .line 15
    .line 16
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134F804694504999EA259F6A0E69991C4321115C9095545D9C9013F8EFC3A290C121C37AEDF3899BB9592968"

    .line 21
    .line 22
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lmi1;->β:Ljava/util/List;

    .line 35
    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lmi1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, Lmi1;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 49
    .line 50
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lmi1;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 55
    .line 56
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    sput-object v0, Lmi1;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 61
    .line 62
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lmi1;->η:Ljava/util/concurrent/ConcurrentHashMap;

    .line 68
    .line 69
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lmi1;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lmi1;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

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
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-ge v3, v2, :cond_0

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v0
.end method

.method public static β(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_1

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
    if-nez v1, :cond_1

    .line 15
    .line 16
    :try_start_0
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
    array-length v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    :goto_1
    if-ge v3, v2, :cond_0

    .line 26
    .line 27
    aget-object v4, v1, v3

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-object v0
.end method

.method public static γ(J)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "precise_time_format"

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move-object v0, v1

    .line 24
    :cond_0
    const/16 v2, 0x32

    .line 25
    .line 26
    invoke-static {v0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 31
    .line 32
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {v2, v0, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/util/Date;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    new-instance v2, Leo1;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v0, v2

    .line 56
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 64
    .line 65
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Ljava/util/Date;

    .line 73
    .line 74
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    return-object v0
.end method

.method public static δ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/reflect/Field;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public static θ(Ljava/lang/Class;)Z
    .locals 12

    .line 1
    invoke-static {p0}, Lmi1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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
    check-cast v3, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v2, 0x0

    .line 46
    const-class v3, Ljava/lang/String;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    move v5, v4

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move v5, v4

    .line 58
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_5

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Ljava/lang/reflect/Field;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_3

    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    .line 82
    if-ltz v5, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-static {}, Lyh;->ф()V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    move v1, v4

    .line 98
    goto :goto_4

    .line 99
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    move v1, v4

    .line 104
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_9

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    check-cast v7, Ljava/lang/reflect/Field;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v7, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_7

    .line 125
    .line 126
    add-int/lit8 v1, v1, 0x1

    .line 127
    .line 128
    if-ltz v1, :cond_8

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    invoke-static {}, Lyh;->ф()V

    .line 132
    .line 133
    .line 134
    throw v2

    .line 135
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    array-length v0, p0

    .line 143
    move v2, v4

    .line 144
    :goto_5
    const/4 v7, 0x2

    .line 145
    const/4 v8, 0x1

    .line 146
    if-ge v2, v0, :cond_b

    .line 147
    .line 148
    aget-object v9, p0, v2

    .line 149
    .line 150
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    array-length v10, v9

    .line 155
    const/4 v11, 0x3

    .line 156
    if-ne v10, v11, :cond_a

    .line 157
    .line 158
    aget-object v10, v9, v4

    .line 159
    .line 160
    invoke-static {v10, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-eqz v10, :cond_a

    .line 165
    .line 166
    aget-object v10, v9, v8

    .line 167
    .line 168
    invoke-static {v10, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-eqz v10, :cond_a

    .line 173
    .line 174
    aget-object v9, v9, v7

    .line 175
    .line 176
    invoke-static {v9, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_a

    .line 181
    .line 182
    move p0, v8

    .line 183
    goto :goto_6

    .line 184
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_b
    move p0, v4

    .line 188
    :goto_6
    if-ne v5, v8, :cond_c

    .line 189
    .line 190
    if-lt v1, v7, :cond_c

    .line 191
    .line 192
    if-eqz p0, :cond_c

    .line 193
    .line 194
    return v8

    .line 195
    :cond_c
    return v4
.end method

.method public static ι(J)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-gtz v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide v4, 0x757b12c00L

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    add-long/2addr v2, v4

    .line 18
    const-wide v4, 0xdc6acfac00L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v6, v4, p0

    .line 24
    .line 25
    if-gtz v6, :cond_1

    .line 26
    .line 27
    cmp-long v6, p0, v2

    .line 28
    .line 29
    if-gtz v6, :cond_1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_1
    const-wide/32 v6, 0x386d4380

    .line 33
    .line 34
    .line 35
    cmp-long v6, v6, p0

    .line 36
    .line 37
    if-gtz v6, :cond_4

    .line 38
    .line 39
    const-wide/16 v6, 0x3e8

    .line 40
    .line 41
    div-long v8, v2, v6

    .line 42
    .line 43
    cmp-long v8, p0, v8

    .line 44
    .line 45
    if-gtz v8, :cond_4

    .line 46
    .line 47
    :try_start_0
    invoke-static {p0, p1, v6, v7}, Ljava/lang/Math;->multiplyExact(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    new-instance p1, Leo1;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object p0, p1

    .line 63
    :goto_0
    instance-of p1, p0, Leo1;

    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    move-object p0, v6

    .line 69
    :cond_2
    check-cast p0, Ljava/lang/Long;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    cmp-long p1, v4, v7

    .line 78
    .line 79
    if-gtz p1, :cond_3

    .line 80
    .line 81
    cmp-long p1, v7, v2

    .line 82
    .line 83
    if-gtz p1, :cond_3

    .line 84
    .line 85
    move-object v6, p0

    .line 86
    :cond_3
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    :cond_4
    :goto_1
    return-wide v0
.end method

.method public static κ(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;
    .locals 8

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->е:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x7d0

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    move-object v4, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v5, v4

    .line 38
    check-cast v5, Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v5}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    move-object v7, v6

    .line 49
    check-cast v7, Ljava/lang/Class;

    .line 50
    .line 51
    invoke-static {v7}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-ge v5, v7, :cond_3

    .line 56
    .line 57
    move-object v4, v6

    .line 58
    move v5, v7

    .line 59
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    :goto_0
    check-cast v4, Ljava/lang/Class;

    .line 66
    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    invoke-static {v4}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-lt v1, v2, :cond_4

    .line 74
    .line 75
    return-object v4

    .line 76
    :cond_4
    sget-object v1, Lmi1;->β:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {v1}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v4, Lt20;

    .line 83
    .line 84
    const/16 v5, 0x1b

    .line 85
    .line 86
    invoke-direct {v4, p0, v5}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v4}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v4, Lx30;

    .line 94
    .line 95
    invoke-direct {v4, v1}, Lx30;-><init>(Ly30;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    invoke-virtual {v4}, Lx30;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    invoke-virtual {v4}, Lx30;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object v5, v1

    .line 109
    check-cast v5, Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {v5}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-lt v5, v2, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    move-object v1, v3

    .line 119
    :goto_1
    check-cast v1, Ljava/lang/Class;

    .line 120
    .line 121
    if-eqz v1, :cond_7

    .line 122
    .line 123
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {v0, p0}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    return-object v1

    .line 133
    :cond_7
    if-eqz p1, :cond_d

    .line 134
    .line 135
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 136
    .line 137
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-nez p1, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_8
    new-instance p1, Lt20;

    .line 147
    .line 148
    const/16 v1, 0x1a

    .line 149
    .line 150
    invoke-direct {p1, p0, v1}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 151
    .line 152
    .line 153
    const-string v1, "\u5b9a\u4f4d\u8bc4\u8bba\u65f6\u95f4\u7ec4\u4ef6"

    .line 154
    .line 155
    invoke-static {v0, p0, v1, p1}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_9

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_a

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_a
    move-object p1, v3

    .line 182
    check-cast p1, Ljava/lang/Class;

    .line 183
    .line 184
    invoke-static {p1}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    move-object v1, v0

    .line 193
    check-cast v1, Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v1}, Lmi1;->λ(Ljava/lang/Class;)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-ge p1, v1, :cond_c

    .line 200
    .line 201
    move-object v3, v0

    .line 202
    move p1, v1

    .line 203
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_b

    .line 208
    .line 209
    :goto_2
    check-cast v3, Ljava/lang/Class;

    .line 210
    .line 211
    :cond_d
    :goto_3
    return-object v3
.end method

.method public static λ(Ljava/lang/Class;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89AE7092F5DC2A5A919822E5893A800A32F1302E7F"

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
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/16 v0, 0x1388

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "TimeOrRetryComponent"

    .line 27
    .line 28
    invoke-static {v2, v3, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    add-int/lit16 v0, v0, 0xbb8

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v3, "~791083E064F2E9C5322A913A15390BF9216A0DF7A214FC7E8ABE8691E19B556675"

    .line 41
    .line 42
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v2, v3, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    add-int/lit16 v0, v0, 0x1f4

    .line 53
    .line 54
    :cond_2
    const-string v1, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128700B29BC878899AC8BAA78D0125812290219B8488"

    .line 55
    .line 56
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    :goto_1
    if-eqz v2, :cond_4

    .line 65
    .line 66
    const-class v3, Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    add-int/lit16 v0, v0, 0x320

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    :goto_2
    const-string v1, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"

    .line 93
    .line 94
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {p0, v1}, Lmi1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_5

    .line 103
    .line 104
    add-int/lit16 v0, v0, 0x320

    .line 105
    .line 106
    :cond_5
    const-string v1, "android.widget.TextView"

    .line 107
    .line 108
    invoke-static {p0, v1}, Lmi1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    add-int/lit16 v0, v0, 0x258

    .line 115
    .line 116
    :cond_6
    const-string v1, "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC480344D16569A5D8EA89D0EB320675D83C27B049378E1FA69488"

    .line 117
    .line 118
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {p0, v1}, Lmi1;->δ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_7

    .line 127
    .line 128
    add-int/lit16 v0, v0, 0x190

    .line 129
    .line 130
    :cond_7
    invoke-static {p0}, Lmi1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_8

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    check-cast v1, Ljava/lang/reflect/Method;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v1}, Lmi1;->θ(Ljava/lang/Class;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_9

    .line 169
    .line 170
    add-int/lit16 v0, v0, 0x320

    .line 171
    .line 172
    :cond_a
    :goto_3
    return v0
.end method

.method public static μ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "#"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "("

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v2, Lcf1;

    .line 42
    .line 43
    const/16 v3, 0x1d

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const/16 v3, 0x1e

    .line 49
    .line 50
    const-string v4, ","

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-static {v1, v4, v5, v2, v3}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "):"

    .line 58
    .line 59
    invoke-static {v0, v1, v2, p0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method


# virtual methods
.method public final ε(Ljava/lang/reflect/Method;)V
    .locals 7

    .line 1
    invoke-static {p1}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lmi1;->ζ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v2, 0x1

    .line 15
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lxq0;->α:Lxq0;

    .line 19
    .line 20
    new-instance v3, Lad1;

    .line 21
    .line 22
    const/16 v4, 0x8

    .line 23
    .line 24
    invoke-direct {v3, v4, p0}, Lad1;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p1, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance v2, Leo1;

    .line 34
    .line 35
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p0, v2

    .line 39
    :goto_0
    instance-of v2, p0, Leo1;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    const-string v4, "rb95bed5e6997b6c3"

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    move-object v2, p0

    .line 48
    check-cast v2, Ll01;

    .line 49
    .line 50
    invoke-static {p1}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v6, "hooked compose time formatter "

    .line 55
    .line 56
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v4, v2, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string v0, "compose time formatter hook failed "

    .line 81
    .line 82
    const-string v1, ": "

    .line 83
    .line 84
    invoke-static {v0, p1, v1, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v4, p0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    return-void
.end method

.method public final ζ(Lji1;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lji1;->α:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    invoke-static {v0}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lmi1;->ε:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v3, 0x1

    .line 17
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    sget-object v3, Lxq0;->α:Lxq0;

    .line 21
    .line 22
    new-instance v4, Lnh;

    .line 23
    .line 24
    invoke-direct {v4, p0, p1}, Lnh;-><init>(Lmi1;Lji1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 28
    .line 29
    .line 30
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance p1, Leo1;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p0, p1

    .line 39
    :goto_0
    instance-of p1, p0, Leo1;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    const-string v4, "rb95bed5e6997b6c3"

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    move-object p1, p0

    .line 48
    check-cast p1, Ll01;

    .line 49
    .line 50
    invoke-static {v0}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const-string v6, "hooked template time "

    .line 55
    .line 56
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {v4, p1, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string v0, "template time hook failed "

    .line 81
    .line 82
    const-string v1, ": "

    .line 83
    .line 84
    invoke-static {v0, p1, v1, p0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {v4, p0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_1
    return-void
.end method

.method public final η(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    sget-object v0, Ls62;->α:Ls62;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "precise_time_enabled"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x4

    .line 14
    const-string v4, "rb95bed5e6997b6c3"

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const-string p0, "feature disabled, skip init"

    .line 20
    .line 21
    invoke-static {v4, p0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {p1, v2}, Lmi1;->κ(Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    const-string v1, "time component class not resolved"

    .line 32
    .line 33
    invoke-static {v4, v1, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, Lmi1;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 43
    .line 44
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    if-nez v8, :cond_2

    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_2
    invoke-static {v1}, Lmi1;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    new-instance v9, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    :cond_3
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-eqz v10, :cond_4

    .line 70
    .line 71
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    move-object v11, v10

    .line 76
    check-cast v11, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-nez v11, :cond_3

    .line 87
    .line 88
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    :cond_5
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_6

    .line 106
    .line 107
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    move-object v11, v10

    .line 112
    check-cast v11, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v11

    .line 124
    if-nez v11, :cond_5

    .line 125
    .line 126
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    :cond_7
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    if-eqz v10, :cond_8

    .line 144
    .line 145
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    move-object v11, v10

    .line 150
    check-cast v11, Ljava/lang/reflect/Method;

    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v11}, Lmi1;->θ(Ljava/lang/Class;)Z

    .line 160
    .line 161
    .line 162
    move-result v11

    .line 163
    if-eqz v11, :cond_7

    .line 164
    .line 165
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_8
    new-instance v8, Ljava/util/HashSet;

    .line 170
    .line 171
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 172
    .line 173
    .line 174
    new-instance v10, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    :cond_9
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 184
    .line 185
    .line 186
    move-result v11

    .line 187
    if-eqz v11, :cond_a

    .line 188
    .line 189
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    move-object v12, v11

    .line 194
    check-cast v12, Ljava/lang/reflect/Method;

    .line 195
    .line 196
    invoke-static {v12}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    if-eqz v12, :cond_9

    .line 205
    .line 206
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_b

    .line 215
    .line 216
    invoke-virtual {v7, v6}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v6, "no render-state methods in "

    .line 224
    .line 225
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-static {v4, v1, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_b
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    :cond_c
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v7

    .line 241
    if-eqz v7, :cond_d

    .line 242
    .line 243
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    check-cast v7, Ljava/lang/reflect/Method;

    .line 248
    .line 249
    const/4 v8, 0x1

    .line 250
    :try_start_0
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 251
    .line 252
    .line 253
    sget-object v8, Lxq0;->α:Lxq0;

    .line 254
    .line 255
    new-instance v9, Lad1;

    .line 256
    .line 257
    const/16 v11, 0x9

    .line 258
    .line 259
    invoke-direct {v9, v11}, Lad1;-><init>(I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v8, v7, v9}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 263
    .line 264
    .line 265
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    goto :goto_5

    .line 267
    :catchall_0
    move-exception v8

    .line 268
    new-instance v9, Leo1;

    .line 269
    .line 270
    invoke-direct {v9, v8}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    move-object v8, v9

    .line 274
    :goto_5
    invoke-static {v8}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    if-eqz v8, :cond_c

    .line 279
    .line 280
    invoke-static {v7}, Lmi1;->μ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    const-string v9, "hook method failed "

    .line 289
    .line 290
    const-string v11, ": "

    .line 291
    .line 292
    invoke-static {v9, v7, v11, v8}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    invoke-static {v4, v7, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_d
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    new-instance v7, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    const-string v8, "hooked "

    .line 311
    .line 312
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    const-string v1, ", methods="

    .line 319
    .line 320
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v4, v1, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :goto_6
    :try_start_1
    sget-object v1, Lki1;->α:Lki1;

    .line 334
    .line 335
    invoke-virtual {v1, p1, v2}, Lki1;->ι(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    if-eqz v6, :cond_e

    .line 348
    .line 349
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    check-cast v6, Lji1;

    .line 354
    .line 355
    invoke-virtual {p0, v6}, Lmi1;->ζ(Lji1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 356
    .line 357
    .line 358
    goto :goto_7

    .line 359
    :catchall_1
    move-exception v1

    .line 360
    goto :goto_8

    .line 361
    :cond_e
    move-object v6, v0

    .line 362
    goto :goto_9

    .line 363
    :goto_8
    new-instance v6, Leo1;

    .line 364
    .line 365
    invoke-direct {v6, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 366
    .line 367
    .line 368
    :goto_9
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    if-eqz v1, :cond_f

    .line 373
    .line 374
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    const-string v6, "template time target init failed: "

    .line 379
    .line 380
    invoke-static {v6, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    invoke-static {v4, v1, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_f
    :try_start_2
    sget-object v1, Lki1;->α:Lki1;

    .line 388
    .line 389
    invoke-virtual {v1, p1, v2}, Lki1;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_10

    .line 402
    .line 403
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, Ljava/lang/reflect/Method;

    .line 408
    .line 409
    invoke-virtual {p0, v1}, Lmi1;->ε(Ljava/lang/reflect/Method;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 410
    .line 411
    .line 412
    goto :goto_a

    .line 413
    :catchall_2
    move-exception p0

    .line 414
    new-instance v0, Leo1;

    .line 415
    .line 416
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 417
    .line 418
    .line 419
    :cond_10
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    if-eqz p0, :cond_11

    .line 424
    .line 425
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    const-string p1, "compose time formatter init failed: "

    .line 430
    .line 431
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-static {v4, p0, v5, v3, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :cond_11
    return-void
.end method
