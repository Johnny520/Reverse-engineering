.class public final Lwi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lwi0;

.field public static final β:[Ljava/lang/String;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final η:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final θ:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lwi0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwi0;->α:Lwi0;

    .line 7
    .line 8
    const-string v0, "X.C2828591ZpS"

    .line 9
    .line 10
    const-string v1, "X.1ZpS"

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lwi0;->β:[Ljava/lang/String;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lwi0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lwi0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    sget-object v1, Ljz;->ε:Ljz;

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lwi0;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 50
    .line 51
    const-wide/16 v1, 0x0

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lwi0;->η:Ljava/util/concurrent/atomic/AtomicLong;

    .line 57
    .line 58
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lwi0;->θ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    :catchall_0
    :goto_0
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const-class v1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lxh;->э(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    :catchall_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    move-object v3, v2

    .line 66
    check-cast v3, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    invoke-static {v3}, Lwi0;->κ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_1

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    return-object v1
.end method

.method public static β(Ljava/lang/Object;Lvi0;JLp70;)Z
    .locals 4

    .line 1
    const-wide/16 v0, 0x78

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-interface {p4}, Lp70;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    check-cast v2, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    cmp-long v2, v2, p2

    .line 23
    .line 24
    if-gez v2, :cond_1

    .line 25
    .line 26
    iget-object v2, p1, Lvi0;->ε:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-static {v2, p0}, Lwi0;->μ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;Ljava/util/Set;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object p0, v0

    .line 19
    :cond_0
    instance-of p1, p0, Ljava/lang/Iterable;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    move-object v0, p0

    .line 24
    check-cast v0, Ljava/lang/Iterable;

    .line 25
    .line 26
    :cond_1
    if-nez v0, :cond_2

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_2
    invoke-static {v0}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_8

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "~7934B87CF08E6E0B8EF20E7F7EAFB0B14A20D8F45CA801574E4ACC71C619528447ABA15E9CCFA094"

    .line 62
    .line 63
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_6

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v3, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, Ljava/lang/ClassLoader;

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    if-nez v3, :cond_4

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-nez v3, :cond_4

    .line 93
    .line 94
    :goto_2
    move v1, v4

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v3, v2}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-nez v2, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    :goto_3
    if-eqz v1, :cond_7

    .line 112
    .line 113
    :cond_6
    const/4 v4, 0x1

    .line 114
    :cond_7
    if-eqz v4, :cond_3

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :cond_9
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_a

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_9

    .line 139
    .line 140
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_a
    :goto_5
    return-void
.end method

.method public static δ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "getConversationId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lwi0;->θ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v1

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    return-object v1
.end method

.method public static ε(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

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
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
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
    invoke-static {v2}, Lwi0;->δ(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static ζ(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    const-wide/16 v0, 0x0

    .line 70
    .line 71
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_6

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_7

    .line 97
    .line 98
    const-wide/16 v0, 0x0

    .line 99
    .line 100
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_7
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-eqz p0, :cond_8

    .line 112
    .line 113
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_8
    :goto_0
    const/4 p0, 0x0

    .line 119
    return-object p0
.end method

.method public static θ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    array-length v3, v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move-object v2, v0

    .line 52
    :goto_0
    check-cast v2, Ljava/lang/reflect/Method;

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    :goto_1
    return-object v0

    .line 57
    :cond_3
    const/4 p1, 0x1

    .line 58
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    new-instance p1, Leo1;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object p0, p1

    .line 73
    :goto_2
    instance-of p1, p0, Leo1;

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    move-object v0, p0

    .line 79
    :goto_3
    return-object v0
.end method

.method public static κ(Ljava/lang/reflect/Method;)Ljava/lang/String;
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
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
    new-instance v2, Lsh0;

    .line 42
    .line 43
    const/16 v3, 0x15

    .line 44
    .line 45
    invoke-direct {v2, v3}, Lsh0;-><init>(I)V

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

.method public static μ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    check-cast p0, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object p0, v0

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    new-instance p1, Leo1;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p0, p1

    .line 27
    :goto_1
    instance-of p1, p0, Leo1;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object v0, p0

    .line 33
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method public static ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 6

    .line 1
    const-string v0, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB5724BB89BE6385D9C2932ECA4237E4AFA25B040AEAA203EF26CB2F6D47FBE24A5AA0270B525149A01D60541126DF0CB30D0E8AD605CE57E8A99A"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    invoke-static {p0}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v3, v2

    .line 34
    check-cast v3, Ljava/lang/reflect/Method;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-string v5, "getStrangerListModel"

    .line 41
    .line 42
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    array-length v4, v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v2, v0

    .line 70
    :goto_0
    check-cast v2, Ljava/lang/reflect/Method;

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    invoke-static {p0}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance v1, Lf7;

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-direct {v1, v2, p0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance p0, Lsh0;

    .line 92
    .line 93
    const/16 v2, 0x16

    .line 94
    .line 95
    invoke-direct {p0, v2}, Lsh0;-><init>(I)V

    .line 96
    .line 97
    .line 98
    new-instance v2, Ly30;

    .line 99
    .line 100
    const/4 v3, 0x1

    .line 101
    invoke-direct {v2, v1, v3, p0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 102
    .line 103
    .line 104
    new-instance p0, Lsh0;

    .line 105
    .line 106
    const/16 v1, 0x17

    .line 107
    .line 108
    invoke-direct {p0, v1}, Lsh0;-><init>(I)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Lt52;

    .line 112
    .line 113
    invoke-direct {v1, v2, p0}, Lt52;-><init>(Lss1;La80;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lus1;->υ(Lss1;)Lcu;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Lcu;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :cond_4
    :goto_1
    move-object v1, p0

    .line 125
    check-cast v1, Lσ;

    .line 126
    .line 127
    invoke-virtual {v1}, Lσ;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_9

    .line 132
    .line 133
    invoke-virtual {v1}, Lσ;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    move-object v2, v1

    .line 138
    check-cast v2, Ljava/lang/Class;

    .line 139
    .line 140
    invoke-static {v2}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_5

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-eqz v4, :cond_4

    .line 160
    .line 161
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    array-length v5, v5

    .line 175
    if-nez v5, :cond_6

    .line 176
    .line 177
    const-class v5, Ljava/util/List;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-eqz v4, :cond_6

    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_7

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_4

    .line 205
    .line 206
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    check-cast v3, Ljava/lang/reflect/Method;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    array-length v4, v4

    .line 220
    if-nez v4, :cond_8

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 227
    .line 228
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-eqz v3, :cond_8

    .line 233
    .line 234
    move-object v0, v1

    .line 235
    :cond_9
    check-cast v0, Ljava/lang/Class;

    .line 236
    .line 237
    return-object v0
.end method

.method public static ο(Ljava/lang/Class;Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

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
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    array-length p1, p0

    .line 32
    move v0, v1

    .line 33
    :goto_0
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    if-ge v0, p1, :cond_3

    .line 36
    .line 37
    aget-object v3, p0, v0

    .line 38
    .line 39
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_8

    .line 50
    .line 51
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    array-length p1, p0

    .line 55
    const/4 v0, 0x2

    .line 56
    if-gt p1, v0, :cond_8

    .line 57
    .line 58
    array-length p1, p0

    .line 59
    if-ne p1, v0, :cond_6

    .line 60
    .line 61
    array-length p1, p0

    .line 62
    move v0, v1

    .line 63
    :goto_1
    if-ge v0, p1, :cond_6

    .line 64
    .line 65
    aget-object v3, p0, v0

    .line 66
    .line 67
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_5

    .line 72
    .line 73
    array-length p1, p0

    .line 74
    :goto_2
    if-ge v1, p1, :cond_6

    .line 75
    .line 76
    aget-object v0, p0, v1

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    const/16 p0, 0x2328

    .line 85
    .line 86
    return p0

    .line 87
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    array-length p0, p0

    .line 94
    if-nez p0, :cond_7

    .line 95
    .line 96
    const/16 p0, 0x1b58

    .line 97
    .line 98
    return p0

    .line 99
    :cond_7
    const/16 p0, 0x1770

    .line 100
    .line 101
    return p0

    .line 102
    :cond_8
    :goto_3
    return v1
.end method


# virtual methods
.method public final η(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lwi0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/ClassLoader;

    .line 16
    .line 17
    sget-object v1, Lwi0;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    if-eq v0, p1, :cond_0

    .line 22
    .line 23
    sget-object v0, Ljz;->ε:Ljz;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, p1, v0}, Lwi0;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final ι(Ljava/lang/ClassLoader;Lp70;)Lui0;
    .locals 26

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "r542b803b7817851a"

    .line 6
    .line 7
    const/16 v3, 0x14

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v4, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lwi0;->ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    :cond_0
    const/4 v7, 0x0

    .line 31
    goto/16 :goto_b

    .line 32
    .line 33
    :cond_1
    move-object/from16 v9, p0

    .line 34
    .line 35
    invoke-virtual {v9, v0, v7}, Lwi0;->ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v11, Ljava/util/ArrayList;

    .line 63
    .line 64
    array-length v12, v10

    .line 65
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    .line 67
    .line 68
    array-length v12, v10

    .line 69
    move v13, v7

    .line 70
    :goto_1
    if-ge v13, v12, :cond_8

    .line 71
    .line 72
    aget-object v14, v10, v13

    .line 73
    .line 74
    invoke-static {v14, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v15

    .line 78
    if-eqz v15, :cond_2

    .line 79
    .line 80
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_7

    .line 84
    :cond_2
    invoke-virtual {v14}, Ljava/lang/Class;->isEnum()Z

    .line 85
    .line 86
    .line 87
    move-result v15

    .line 88
    if-eqz v15, :cond_7

    .line 89
    .line 90
    invoke-virtual {v14}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v14

    .line 94
    if-eqz v14, :cond_7

    .line 95
    .line 96
    array-length v15, v14

    .line 97
    move v8, v7

    .line 98
    :goto_2
    if-ge v8, v15, :cond_6

    .line 99
    .line 100
    aget-object v6, v14, v8

    .line 101
    .line 102
    instance-of v7, v6, Ljava/lang/Enum;

    .line 103
    .line 104
    if-eqz v7, :cond_3

    .line 105
    .line 106
    move-object v7, v6

    .line 107
    check-cast v7, Ljava/lang/Enum;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    const/4 v7, 0x0

    .line 111
    :goto_3
    if-eqz v7, :cond_4

    .line 112
    .line 113
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    :goto_4
    move-object/from16 p0, v6

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_4
    const/4 v7, 0x0

    .line 121
    goto :goto_4

    .line 122
    :goto_5
    const-string v6, "STRANGER"

    .line 123
    .line 124
    invoke-static {v7, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_5

    .line 129
    .line 130
    move-object/from16 v6, p0

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    goto :goto_2

    .line 137
    :cond_6
    const/4 v6, 0x0

    .line 138
    :goto_6
    if-eqz v6, :cond_7

    .line 139
    .line 140
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :goto_7
    add-int/lit8 v13, v13, 0x1

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    goto :goto_1

    .line 147
    :cond_7
    const/4 v6, 0x0

    .line 148
    goto :goto_8

    .line 149
    :cond_8
    move v6, v7

    .line 150
    new-array v7, v6, [Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    :goto_8
    if-nez v6, :cond_9

    .line 157
    .line 158
    goto :goto_a

    .line 159
    :cond_9
    const/4 v7, 0x1

    .line 160
    :try_start_0
    invoke-virtual {v0, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 161
    .line 162
    .line 163
    array-length v7, v6

    .line 164
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    const/4 v7, 0x0

    .line 169
    invoke-virtual {v0, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    goto :goto_9

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    new-instance v6, Leo1;

    .line 176
    .line 177
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v0, v6

    .line 181
    :goto_9
    instance-of v6, v0, Leo1;

    .line 182
    .line 183
    if-eqz v6, :cond_a

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    :cond_a
    if-eqz v0, :cond_b

    .line 187
    .line 188
    invoke-virtual {v4, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    if-eqz v6, :cond_b

    .line 193
    .line 194
    move-object v7, v0

    .line 195
    goto :goto_b

    .line 196
    :cond_b
    :goto_a
    const/4 v7, 0x0

    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :goto_b
    sget-object v0, Ljz;->ε:Ljz;

    .line 200
    .line 201
    if-nez v7, :cond_c

    .line 202
    .line 203
    new-instance v1, Lui0;

    .line 204
    .line 205
    const-string v2, "\u672a\u5b9a\u4f4d\u5230\u964c\u751f\u4eba\u4f1a\u8bdd\u6a21\u578b"

    .line 206
    .line 207
    const/4 v6, 0x0

    .line 208
    invoke-direct {v1, v0, v6, v2}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-object v1

    .line 212
    :cond_c
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    new-instance v6, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    :cond_d
    :goto_c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    if-eqz v9, :cond_e

    .line 234
    .line 235
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    move-object v10, v9

    .line 240
    check-cast v10, Ljava/lang/reflect/Method;

    .line 241
    .line 242
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    array-length v11, v11

    .line 250
    if-nez v11, :cond_d

    .line 251
    .line 252
    const-class v11, Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_d

    .line 263
    .line 264
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_e
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    if-nez v8, :cond_f

    .line 277
    .line 278
    const/4 v8, 0x0

    .line 279
    goto :goto_f

    .line 280
    :cond_f
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v8

    .line 284
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-nez v10, :cond_10

    .line 289
    .line 290
    goto :goto_f

    .line 291
    :cond_10
    move-object v10, v8

    .line 292
    check-cast v10, Ljava/lang/reflect/Method;

    .line 293
    .line 294
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    const-string v11, "S3"

    .line 299
    .line 300
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    if-eqz v10, :cond_11

    .line 305
    .line 306
    const/16 v10, 0xa

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :cond_11
    const/4 v10, 0x0

    .line 310
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    move-object v13, v12

    .line 315
    check-cast v13, Ljava/lang/reflect/Method;

    .line 316
    .line 317
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v13

    .line 321
    invoke-static {v13, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_12

    .line 326
    .line 327
    const/16 v13, 0xa

    .line 328
    .line 329
    goto :goto_e

    .line 330
    :cond_12
    const/4 v13, 0x0

    .line 331
    :goto_e
    if-ge v10, v13, :cond_13

    .line 332
    .line 333
    move-object v8, v12

    .line 334
    move v10, v13

    .line 335
    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    if-nez v12, :cond_4f

    .line 340
    .line 341
    :goto_f
    move-object/from16 v20, v8

    .line 342
    .line 343
    check-cast v20, Ljava/lang/reflect/Method;

    .line 344
    .line 345
    if-nez v20, :cond_14

    .line 346
    .line 347
    const/4 v4, 0x0

    .line 348
    const/4 v8, 0x1

    .line 349
    goto/16 :goto_21

    .line 350
    .line 351
    :cond_14
    new-instance v12, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    :cond_15
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 365
    .line 366
    if-eqz v8, :cond_16

    .line 367
    .line 368
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    move-object v10, v8

    .line 373
    check-cast v10, Ljava/lang/reflect/Method;

    .line 374
    .line 375
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    array-length v11, v11

    .line 383
    if-nez v11, :cond_15

    .line 384
    .line 385
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    invoke-static {v10, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v10

    .line 393
    if-eqz v10, :cond_15

    .line 394
    .line 395
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_10

    .line 399
    :cond_16
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v14

    .line 403
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    const-string v15, "hasMore"

    .line 408
    .line 409
    if-nez v6, :cond_17

    .line 410
    .line 411
    const/4 v6, 0x0

    .line 412
    goto :goto_13

    .line 413
    :cond_17
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v8

    .line 421
    if-nez v8, :cond_18

    .line 422
    .line 423
    goto :goto_13

    .line 424
    :cond_18
    move-object v8, v6

    .line 425
    check-cast v8, Ljava/lang/reflect/Method;

    .line 426
    .line 427
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-static {v8, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v8

    .line 435
    const/16 v19, 0x64

    .line 436
    .line 437
    if-eqz v8, :cond_19

    .line 438
    .line 439
    move/from16 v8, v19

    .line 440
    .line 441
    goto :goto_11

    .line 442
    :cond_19
    const/4 v8, 0x0

    .line 443
    :goto_11
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    move-object v11, v10

    .line 448
    check-cast v11, Ljava/lang/reflect/Method;

    .line 449
    .line 450
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v11

    .line 454
    invoke-static {v11, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v11

    .line 458
    if-eqz v11, :cond_1a

    .line 459
    .line 460
    move/from16 v11, v19

    .line 461
    .line 462
    goto :goto_12

    .line 463
    :cond_1a
    const/4 v11, 0x0

    .line 464
    :goto_12
    if-ge v8, v11, :cond_1b

    .line 465
    .line 466
    move-object v6, v10

    .line 467
    move v8, v11

    .line 468
    :cond_1b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    if-nez v10, :cond_4e

    .line 473
    .line 474
    :goto_13
    check-cast v6, Ljava/lang/reflect/Method;

    .line 475
    .line 476
    if-eqz v6, :cond_1c

    .line 477
    .line 478
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-static {v8, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    if-nez v8, :cond_1d

    .line 487
    .line 488
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 489
    .line 490
    .line 491
    move-result v8

    .line 492
    const/4 v10, 0x1

    .line 493
    if-ne v8, v10, :cond_1c

    .line 494
    .line 495
    goto :goto_14

    .line 496
    :cond_1c
    const/16 v23, 0x0

    .line 497
    .line 498
    goto :goto_15

    .line 499
    :cond_1d
    :goto_14
    move-object/from16 v23, v6

    .line 500
    .line 501
    :goto_15
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    :cond_1e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v8

    .line 509
    if-eqz v8, :cond_1f

    .line 510
    .line 511
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v8

    .line 515
    move-object v10, v8

    .line 516
    check-cast v10, Ljava/lang/reflect/Method;

    .line 517
    .line 518
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v10

    .line 522
    const-string v11, "isLoading"

    .line 523
    .line 524
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v10

    .line 528
    if-eqz v10, :cond_1e

    .line 529
    .line 530
    goto :goto_16

    .line 531
    :cond_1f
    const/4 v8, 0x0

    .line 532
    :goto_16
    move-object/from16 v24, v8

    .line 533
    .line 534
    check-cast v24, Ljava/lang/reflect/Method;

    .line 535
    .line 536
    new-instance v6, Ljava/util/ArrayList;

    .line 537
    .line 538
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v8

    .line 545
    :cond_20
    :goto_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    const-class v11, Ljava/lang/String;

    .line 550
    .line 551
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 552
    .line 553
    if-eqz v10, :cond_22

    .line 554
    .line 555
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v10

    .line 559
    move-object v14, v10

    .line 560
    check-cast v14, Ljava/lang/reflect/Method;

    .line 561
    .line 562
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    move-result-object v15

    .line 566
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    invoke-static {v15, v11}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move-result v11

    .line 574
    if-eqz v11, :cond_20

    .line 575
    .line 576
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    invoke-static {v11, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v11

    .line 584
    if-nez v11, :cond_21

    .line 585
    .line 586
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v11

    .line 594
    if-eqz v11, :cond_20

    .line 595
    .line 596
    :cond_21
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    goto :goto_17

    .line 600
    :cond_22
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 605
    .line 606
    .line 607
    move-result v6

    .line 608
    if-nez v6, :cond_23

    .line 609
    .line 610
    const/4 v6, 0x0

    .line 611
    goto :goto_1a

    .line 612
    :cond_23
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v6

    .line 616
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    if-nez v8, :cond_24

    .line 621
    .line 622
    goto :goto_1a

    .line 623
    :cond_24
    move-object v8, v6

    .line 624
    check-cast v8, Ljava/lang/reflect/Method;

    .line 625
    .line 626
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v8

    .line 630
    const-string v14, "LJI"

    .line 631
    .line 632
    invoke-static {v8, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    if-eqz v8, :cond_25

    .line 637
    .line 638
    const/16 v8, 0xa

    .line 639
    .line 640
    goto :goto_18

    .line 641
    :cond_25
    const/4 v8, 0x0

    .line 642
    :goto_18
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v15

    .line 646
    move-object/from16 v19, v15

    .line 647
    .line 648
    check-cast v19, Ljava/lang/reflect/Method;

    .line 649
    .line 650
    invoke-virtual/range {v19 .. v19}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v9

    .line 654
    invoke-static {v9, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    if-eqz v9, :cond_26

    .line 659
    .line 660
    const/16 v9, 0xa

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :cond_26
    const/4 v9, 0x0

    .line 664
    :goto_19
    if-ge v8, v9, :cond_27

    .line 665
    .line 666
    move v8, v9

    .line 667
    move-object v6, v15

    .line 668
    :cond_27
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 669
    .line 670
    .line 671
    move-result v9

    .line 672
    if-nez v9, :cond_4d

    .line 673
    .line 674
    :goto_1a
    move-object/from16 v21, v6

    .line 675
    .line 676
    check-cast v21, Ljava/lang/reflect/Method;

    .line 677
    .line 678
    new-instance v6, Ljava/util/ArrayList;

    .line 679
    .line 680
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 684
    .line 685
    .line 686
    move-result-object v8

    .line 687
    :cond_28
    :goto_1b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v9

    .line 691
    if-eqz v9, :cond_2a

    .line 692
    .line 693
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    move-object v10, v9

    .line 698
    check-cast v10, Ljava/lang/reflect/Method;

    .line 699
    .line 700
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    move-result-object v14

    .line 704
    filled-new-array {v5, v11}, [Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    move-result-object v15

    .line 708
    invoke-static {v14, v15}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    move-result v14

    .line 712
    if-eqz v14, :cond_28

    .line 713
    .line 714
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    move-result-object v14

    .line 718
    invoke-static {v14, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v14

    .line 722
    if-nez v14, :cond_29

    .line 723
    .line 724
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    move-result-object v10

    .line 728
    invoke-static {v10, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v10

    .line 732
    if-eqz v10, :cond_28

    .line 733
    .line 734
    :cond_29
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    goto :goto_1b

    .line 738
    :cond_2a
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v9

    .line 742
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    if-nez v5, :cond_2b

    .line 747
    .line 748
    const/4 v5, 0x0

    .line 749
    goto :goto_1e

    .line 750
    :cond_2b
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 755
    .line 756
    .line 757
    move-result v6

    .line 758
    if-nez v6, :cond_2c

    .line 759
    .line 760
    goto :goto_1e

    .line 761
    :cond_2c
    move-object v6, v5

    .line 762
    check-cast v6, Ljava/lang/reflect/Method;

    .line 763
    .line 764
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v6

    .line 768
    const-string v15, "LLLLLILLIL"

    .line 769
    .line 770
    invoke-static {v6, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v6

    .line 774
    if-eqz v6, :cond_2d

    .line 775
    .line 776
    const/16 v6, 0xa

    .line 777
    .line 778
    goto :goto_1c

    .line 779
    :cond_2d
    const/4 v6, 0x0

    .line 780
    :cond_2e
    :goto_1c
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v8

    .line 784
    move-object v10, v8

    .line 785
    check-cast v10, Ljava/lang/reflect/Method;

    .line 786
    .line 787
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v10

    .line 791
    invoke-static {v10, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v10

    .line 795
    if-eqz v10, :cond_2f

    .line 796
    .line 797
    const/16 v10, 0xa

    .line 798
    .line 799
    goto :goto_1d

    .line 800
    :cond_2f
    const/4 v10, 0x0

    .line 801
    :goto_1d
    if-ge v6, v10, :cond_30

    .line 802
    .line 803
    move-object v5, v8

    .line 804
    move v6, v10

    .line 805
    :cond_30
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 806
    .line 807
    .line 808
    move-result v8

    .line 809
    if-nez v8, :cond_2e

    .line 810
    .line 811
    :goto_1e
    move-object v14, v5

    .line 812
    check-cast v14, Ljava/lang/reflect/Method;

    .line 813
    .line 814
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 815
    .line 816
    .line 817
    move-result-object v4

    .line 818
    :cond_31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v5

    .line 822
    if-eqz v5, :cond_32

    .line 823
    .line 824
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    move-object v6, v5

    .line 829
    check-cast v6, Ljava/lang/reflect/Method;

    .line 830
    .line 831
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v8

    .line 835
    const-string v9, "unregister"

    .line 836
    .line 837
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v8

    .line 841
    if-eqz v8, :cond_31

    .line 842
    .line 843
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    move-result-object v8

    .line 847
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    array-length v8, v8

    .line 851
    if-nez v8, :cond_31

    .line 852
    .line 853
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    move-result-object v6

    .line 857
    invoke-static {v6, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 858
    .line 859
    .line 860
    move-result v6

    .line 861
    if-eqz v6, :cond_31

    .line 862
    .line 863
    goto :goto_1f

    .line 864
    :cond_32
    const/4 v5, 0x0

    .line 865
    :goto_1f
    move-object v15, v5

    .line 866
    check-cast v15, Ljava/lang/reflect/Method;

    .line 867
    .line 868
    move-object/from16 v10, v20

    .line 869
    .line 870
    move-object/from16 v13, v21

    .line 871
    .line 872
    move-object/from16 v11, v23

    .line 873
    .line 874
    move-object/from16 v12, v24

    .line 875
    .line 876
    filled-new-array/range {v10 .. v15}, [Ljava/lang/reflect/Method;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    invoke-static {v4}, Lg7;->Ω([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 885
    .line 886
    .line 887
    move-result-object v4

    .line 888
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 889
    .line 890
    .line 891
    move-result v5

    .line 892
    if-eqz v5, :cond_33

    .line 893
    .line 894
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    check-cast v5, Ljava/lang/reflect/Method;

    .line 899
    .line 900
    const/4 v8, 0x1

    .line 901
    invoke-virtual {v5, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 902
    .line 903
    .line 904
    goto :goto_20

    .line 905
    :cond_33
    const/4 v8, 0x1

    .line 906
    new-instance v19, Lvi0;

    .line 907
    .line 908
    move-object/from16 v21, v13

    .line 909
    .line 910
    move-object/from16 v22, v14

    .line 911
    .line 912
    move-object/from16 v25, v15

    .line 913
    .line 914
    invoke-direct/range {v19 .. v25}, Lvi0;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 915
    .line 916
    .line 917
    move-object/from16 v4, v19

    .line 918
    .line 919
    :goto_21
    if-nez v4, :cond_34

    .line 920
    .line 921
    new-instance v1, Lui0;

    .line 922
    .line 923
    const-string v2, "\u964c\u751f\u4eba\u4f1a\u8bdd\u6a21\u578b\u63a5\u53e3\u4e0d\u517c\u5bb9"

    .line 924
    .line 925
    const/4 v6, 0x0

    .line 926
    invoke-direct {v1, v0, v6, v2}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 927
    .line 928
    .line 929
    return-object v1

    .line 930
    :cond_34
    iget-object v0, v4, Lvi0;->β:Ljava/lang/reflect/Method;

    .line 931
    .line 932
    iget-object v5, v4, Lvi0;->ε:Ljava/lang/reflect/Method;

    .line 933
    .line 934
    iget-object v6, v4, Lvi0;->δ:Ljava/lang/reflect/Method;

    .line 935
    .line 936
    iget-object v9, v4, Lvi0;->α:Ljava/lang/reflect/Method;

    .line 937
    .line 938
    iget-object v10, v4, Lvi0;->ζ:Ljava/lang/reflect/Method;

    .line 939
    .line 940
    new-instance v11, Ljava/util/ArrayList;

    .line 941
    .line 942
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 943
    .line 944
    .line 945
    new-instance v12, Ljava/util/IdentityHashMap;

    .line 946
    .line 947
    invoke-direct {v12}, Ljava/util/IdentityHashMap;-><init>()V

    .line 948
    .line 949
    .line 950
    invoke-static {v12}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 951
    .line 952
    .line 953
    move-result-object v12

    .line 954
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 955
    .line 956
    .line 957
    move-result-wide v13

    .line 958
    const-wide/16 v19, 0x4e20

    .line 959
    .line 960
    add-long v13, v13, v19

    .line 961
    .line 962
    :try_start_1
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    invoke-static {v7, v9, v11, v12}, Lwi0;->γ(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    .line 966
    .line 967
    .line 968
    if-eqz v6, :cond_47

    .line 969
    .line 970
    if-nez v5, :cond_35

    .line 971
    .line 972
    goto/16 :goto_2b

    .line 973
    .line 974
    :cond_35
    :try_start_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 975
    .line 976
    .line 977
    move-result v15

    .line 978
    if-eqz v15, :cond_37

    .line 979
    .line 980
    if-nez v0, :cond_37

    .line 981
    .line 982
    const-string v0, "\u964c\u751f\u4eba\u5217\u8868\u7f3a\u5c11\u9996\u5c4f\u5237\u65b0\u63a5\u53e3"

    .line 983
    .line 984
    new-instance v1, Lui0;

    .line 985
    .line 986
    invoke-static {v11}, Lwi0;->ε(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    const/4 v6, 0x0

    .line 991
    invoke-direct {v1, v3, v6, v0}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 992
    .line 993
    .line 994
    if-eqz v10, :cond_36

    .line 995
    .line 996
    const/4 v2, 0x0

    .line 997
    :try_start_3
    invoke-virtual {v10, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 998
    .line 999
    .line 1000
    :catchall_1
    :cond_36
    return-object v1

    .line 1001
    :catchall_2
    move-exception v0

    .line 1002
    const/16 v18, 0x0

    .line 1003
    .line 1004
    goto/16 :goto_2d

    .line 1005
    .line 1006
    :cond_37
    :try_start_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v15

    .line 1010
    if-eqz v15, :cond_39

    .line 1011
    .line 1012
    invoke-static {v5, v7}, Lwi0;->μ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v5

    .line 1016
    if-nez v5, :cond_39

    .line 1017
    .line 1018
    const-string v5, "dyhelper_delete_initial"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1019
    .line 1020
    if-nez v0, :cond_38

    .line 1021
    .line 1022
    goto :goto_23

    .line 1023
    :cond_38
    :try_start_5
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v5

    .line 1027
    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1031
    goto :goto_22

    .line 1032
    :catchall_3
    move-exception v0

    .line 1033
    :try_start_6
    new-instance v5, Leo1;

    .line 1034
    .line 1035
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1036
    .line 1037
    .line 1038
    move-object v0, v5

    .line 1039
    :goto_22
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    if-eqz v0, :cond_39

    .line 1044
    .line 1045
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    const-string v15, "\u89e6\u53d1\u964c\u751f\u4eba\u9996\u5c4f\u52a0\u8f7d\u5931\u8d25: "

    .line 1052
    .line 1053
    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v0

    .line 1063
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    :cond_39
    :goto_23
    invoke-static {v7, v4, v13, v14, v1}, Lwi0;->β(Ljava/lang/Object;Lvi0;JLp70;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1070
    const-string v5, "\u964c\u751f\u4eba\u5217\u8868\u52a0\u8f7d\u8d85\u65f6"

    .line 1071
    .line 1072
    const-string v15, "\u964c\u751f\u4eba\u5217\u8868\u52a0\u8f7d\u5df2\u505c\u6b62"

    .line 1073
    .line 1074
    if-nez v0, :cond_3c

    .line 1075
    .line 1076
    :try_start_7
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    check-cast v0, Ljava/lang/Boolean;

    .line 1081
    .line 1082
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v0

    .line 1086
    if-eqz v0, :cond_3a

    .line 1087
    .line 1088
    move-object v5, v15

    .line 1089
    :cond_3a
    new-instance v0, Lui0;

    .line 1090
    .line 1091
    invoke-static {v11}, Lwi0;->ε(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    const/4 v6, 0x0

    .line 1096
    invoke-direct {v0, v1, v6, v5}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1097
    .line 1098
    .line 1099
    if-eqz v10, :cond_3b

    .line 1100
    .line 1101
    const/4 v2, 0x0

    .line 1102
    :try_start_8
    invoke-virtual {v10, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1103
    .line 1104
    .line 1105
    :catchall_4
    :cond_3b
    return-object v0

    .line 1106
    :cond_3c
    :try_start_9
    invoke-static {v7, v9, v11, v12}, Lwi0;->γ(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;Ljava/util/Set;)V

    .line 1107
    .line 1108
    .line 1109
    const/4 v8, 0x0

    .line 1110
    :goto_24
    invoke-static {v6, v7}, Lwi0;->μ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v0

    .line 1114
    move-object/from16 p1, v5

    .line 1115
    .line 1116
    const/16 v5, 0x50

    .line 1117
    .line 1118
    if-eqz v0, :cond_42

    .line 1119
    .line 1120
    if-ge v8, v5, :cond_42

    .line 1121
    .line 1122
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    check-cast v0, Ljava/lang/Boolean;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1129
    .line 1130
    .line 1131
    move-result v0

    .line 1132
    if-nez v0, :cond_42

    .line 1133
    .line 1134
    iget-object v0, v4, Lvi0;->γ:Ljava/lang/reflect/Method;

    .line 1135
    .line 1136
    if-nez v0, :cond_3d

    .line 1137
    .line 1138
    const-string v0, "\u964c\u751f\u4eba\u5217\u8868\u7f3a\u5c11\u52a0\u8f7d\u4e0b\u4e00\u9875\u63a5\u53e3"

    .line 1139
    .line 1140
    move-object/from16 v20, v15

    .line 1141
    .line 1142
    goto :goto_28

    .line 1143
    :cond_3d
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    move-object/from16 v20, v15

    .line 1149
    .line 1150
    const-string v15, "dyhelper_delete_more_"

    .line 1151
    .line 1152
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1156
    .line 1157
    .line 1158
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1162
    :try_start_a
    filled-new-array {v3, v5}, [Ljava/lang/Object;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v5

    .line 1166
    invoke-virtual {v0, v7, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 1170
    goto :goto_25

    .line 1171
    :catchall_5
    move-exception v0

    .line 1172
    :try_start_b
    new-instance v5, Leo1;

    .line 1173
    .line 1174
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1175
    .line 1176
    .line 1177
    move-object v0, v5

    .line 1178
    :goto_25
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    if-eqz v0, :cond_3f

    .line 1183
    .line 1184
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    if-nez v1, :cond_3e

    .line 1189
    .line 1190
    goto :goto_26

    .line 1191
    :cond_3e
    move-object v0, v1

    .line 1192
    :goto_26
    throw v0

    .line 1193
    :cond_3f
    invoke-static {v7, v4, v13, v14, v1}, Lwi0;->β(Ljava/lang/Object;Lvi0;JLp70;)Z

    .line 1194
    .line 1195
    .line 1196
    move-result v0

    .line 1197
    if-nez v0, :cond_41

    .line 1198
    .line 1199
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    check-cast v0, Ljava/lang/Boolean;

    .line 1204
    .line 1205
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    if-eqz v0, :cond_40

    .line 1210
    .line 1211
    move-object/from16 v5, v20

    .line 1212
    .line 1213
    goto :goto_27

    .line 1214
    :cond_40
    move-object/from16 v5, p1

    .line 1215
    .line 1216
    :goto_27
    move-object v0, v5

    .line 1217
    goto :goto_28

    .line 1218
    :cond_41
    invoke-static {v7, v9, v11, v12}, Lwi0;->γ(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;Ljava/util/Set;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1219
    .line 1220
    .line 1221
    add-int/lit8 v8, v8, 0x1

    .line 1222
    .line 1223
    move-object/from16 v5, p1

    .line 1224
    .line 1225
    move-object/from16 v15, v20

    .line 1226
    .line 1227
    goto :goto_24

    .line 1228
    :cond_42
    move-object/from16 v20, v15

    .line 1229
    .line 1230
    const-string v0, ""

    .line 1231
    .line 1232
    :goto_28
    :try_start_c
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    check-cast v3, Ljava/lang/Boolean;

    .line 1237
    .line 1238
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    if-nez v3, :cond_43

    .line 1243
    .line 1244
    invoke-static {v6, v7}, Lwi0;->μ(Ljava/lang/reflect/Method;Ljava/lang/Object;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1248
    if-nez v3, :cond_43

    .line 1249
    .line 1250
    const/4 v6, 0x1

    .line 1251
    goto :goto_29

    .line 1252
    :cond_43
    const/4 v6, 0x0

    .line 1253
    :goto_29
    if-nez v6, :cond_46

    .line 1254
    .line 1255
    :try_start_d
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v3

    .line 1259
    if-eqz v3, :cond_46

    .line 1260
    .line 1261
    invoke-interface {v1}, Lp70;->invoke()Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    check-cast v0, Ljava/lang/Boolean;

    .line 1266
    .line 1267
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    if-eqz v0, :cond_44

    .line 1272
    .line 1273
    move-object/from16 v15, v20

    .line 1274
    .line 1275
    goto :goto_2a

    .line 1276
    :cond_44
    const/16 v1, 0x50

    .line 1277
    .line 1278
    if-lt v8, v1, :cond_45

    .line 1279
    .line 1280
    const-string v15, "\u964c\u751f\u4eba\u4f1a\u8bdd\u9875\u6570\u8d85\u8fc7\u5b89\u5168\u4e0a\u9650"

    .line 1281
    .line 1282
    goto :goto_2a

    .line 1283
    :catchall_6
    move-exception v0

    .line 1284
    move/from16 v18, v6

    .line 1285
    .line 1286
    goto :goto_2d

    .line 1287
    :cond_45
    const-string v15, "\u964c\u751f\u4eba\u5217\u8868\u672a\u5b8c\u6574\u52a0\u8f7d"
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 1288
    .line 1289
    :goto_2a
    move-object v0, v15

    .line 1290
    :cond_46
    if-eqz v10, :cond_4b

    .line 1291
    .line 1292
    const/4 v2, 0x0

    .line 1293
    :try_start_e
    invoke-virtual {v10, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 1294
    .line 1295
    .line 1296
    goto :goto_2e

    .line 1297
    :cond_47
    :goto_2b
    :try_start_f
    const-string v0, "\u964c\u751f\u4eba\u5206\u9875\u72b6\u6001\u63a5\u53e3\u4e0d\u517c\u5bb9"

    .line 1298
    .line 1299
    new-instance v1, Lui0;

    .line 1300
    .line 1301
    invoke-static {v11}, Lwi0;->ε(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 1305
    const/4 v8, 0x0

    .line 1306
    :try_start_10
    invoke-direct {v1, v3, v8, v0}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1307
    .line 1308
    .line 1309
    if-eqz v10, :cond_48

    .line 1310
    .line 1311
    const/4 v2, 0x0

    .line 1312
    :try_start_11
    invoke-virtual {v10, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 1313
    .line 1314
    .line 1315
    :catchall_7
    :cond_48
    return-object v1

    .line 1316
    :catchall_8
    move-exception v0

    .line 1317
    :goto_2c
    move/from16 v18, v8

    .line 1318
    .line 1319
    goto :goto_2d

    .line 1320
    :catchall_9
    move-exception v0

    .line 1321
    const/4 v8, 0x0

    .line 1322
    goto :goto_2c

    .line 1323
    :goto_2d
    :try_start_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v1

    .line 1327
    if-nez v1, :cond_49

    .line 1328
    .line 1329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v1

    .line 1337
    :cond_49
    const/16 v3, 0x20

    .line 1338
    .line 1339
    const/16 v13, 0xa

    .line 1340
    .line 1341
    invoke-virtual {v1, v13, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1346
    .line 1347
    .line 1348
    const/16 v4, 0xd

    .line 1349
    .line 1350
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v1

    .line 1354
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1355
    .line 1356
    .line 1357
    const/16 v3, 0xa0

    .line 1358
    .line 1359
    invoke-static {v1, v3}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v1

    .line 1363
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1364
    .line 1365
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1366
    .line 1367
    .line 1368
    const-string v4, "\u964c\u751f\u4eba\u5217\u8868\u52a0\u8f7d\u5931\u8d25\uff1a"

    .line 1369
    .line 1370
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v1

    .line 1380
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 1381
    .line 1382
    .line 1383
    if-eqz v10, :cond_4a

    .line 1384
    .line 1385
    const/4 v2, 0x0

    .line 1386
    :try_start_13
    invoke-virtual {v10, v7, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 1387
    .line 1388
    .line 1389
    :catchall_a
    :cond_4a
    move-object v0, v1

    .line 1390
    move/from16 v6, v18

    .line 1391
    .line 1392
    :catchall_b
    :cond_4b
    :goto_2e
    new-instance v1, Lui0;

    .line 1393
    .line 1394
    invoke-static {v11}, Lwi0;->ε(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v2

    .line 1398
    invoke-direct {v1, v2, v6, v0}, Lui0;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    .line 1399
    .line 1400
    .line 1401
    return-object v1

    .line 1402
    :catchall_c
    move-exception v0

    .line 1403
    if-eqz v10, :cond_4c

    .line 1404
    .line 1405
    const/4 v11, 0x0

    .line 1406
    :try_start_14
    invoke-virtual {v10, v7, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 1407
    .line 1408
    .line 1409
    :catchall_d
    :cond_4c
    throw v0

    .line 1410
    :cond_4d
    const/16 v17, 0x1

    .line 1411
    .line 1412
    const/16 v18, 0x0

    .line 1413
    .line 1414
    const/16 v22, 0x0

    .line 1415
    .line 1416
    goto/16 :goto_18

    .line 1417
    .line 1418
    :cond_4e
    const/16 v17, 0x1

    .line 1419
    .line 1420
    const/16 v18, 0x0

    .line 1421
    .line 1422
    const/16 v22, 0x0

    .line 1423
    .line 1424
    goto/16 :goto_11

    .line 1425
    .line 1426
    :cond_4f
    const/16 v17, 0x1

    .line 1427
    .line 1428
    const/16 v18, 0x0

    .line 1429
    .line 1430
    const/16 v22, 0x0

    .line 1431
    .line 1432
    goto/16 :goto_d
.end method

.method public final λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;
    .locals 11

    .line 1
    invoke-static {p1}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lt00;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p2, v1}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ly30;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p1, v2, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lng;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/16 v10, 0x12

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    const-class v6, Lwi0;

    .line 24
    .line 25
    const-string v7, "methodKey"

    .line 26
    .line 27
    const-string v8, "methodKey(Ljava/lang/reflect/Method;)Ljava/lang/String;"

    .line 28
    .line 29
    move-object v5, p0

    .line 30
    invoke-direct/range {v3 .. v10}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lcu;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-direct {p0, v1, p1, v3}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lrt;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-direct {p1, p2, v0}, Lrt;-><init>(Ljava/lang/Class;I)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Lcu;

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-direct {p2, p0, v0, p1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lsh0;

    .line 52
    .line 53
    const/16 p1, 0x18

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lsh0;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p2, p0}, Lus1;->Γ(Lss1;La80;)Lt52;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public final ν(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, Lwi0;->δ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwi0;->ε:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/ClassLoader;

    .line 13
    .line 14
    sget-object v1, Ljz;->ε:Ljz;

    .line 15
    .line 16
    sget-object v2, Lwi0;->ζ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    if-eq v0, p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {p1}, Lwi0;->ξ(Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    if-nez v6, :cond_1

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v0, Ljava/util/List;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v6}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object v0, Lkx;->Д:Lkx;

    .line 55
    .line 56
    invoke-static {v0, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    move-object v3, v1

    .line 63
    :cond_3
    invoke-virtual {p0, v3, v6}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_4

    .line 72
    .line 73
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    :goto_0
    const/4 v5, 0x2

    .line 84
    if-ge v4, v5, :cond_6

    .line 85
    .line 86
    sget-object v5, Lwi0;->β:[Ljava/lang/String;

    .line 87
    .line 88
    aget-object v5, v5, v4

    .line 89
    .line 90
    invoke-static {p1, v5}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v5, :cond_5

    .line 95
    .line 96
    move-object v5, v1

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    invoke-static {v5}, Lwi0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    :goto_1
    invoke-static {v3, v5}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v4, v4, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    invoke-virtual {p0, v3, v6}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    if-eqz p2, :cond_9

    .line 113
    .line 114
    sget-object p2, Lox;->α:Ljava/lang/Object;

    .line 115
    .line 116
    sget-object p2, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-nez p2, :cond_7

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_7
    :try_start_0
    const-string p2, "\u5b9a\u4f4d IM \u964c\u751f\u4eba\u4f1a\u8bdd\u6a21\u578b\u5de5\u5382"

    .line 126
    .line 127
    new-instance v3, Lti0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    move-object v4, p0

    .line 131
    move-object v5, p1

    .line 132
    :try_start_1
    invoke-direct/range {v3 .. v8}, Lti0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v5, p2, v3}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    goto :goto_4

    .line 140
    :catchall_0
    move-exception v0

    .line 141
    :goto_2
    move-object p0, v0

    .line 142
    goto :goto_3

    .line 143
    :catchall_1
    move-exception v0

    .line 144
    move-object v4, p0

    .line 145
    goto :goto_2

    .line 146
    :goto_3
    new-instance p1, Leo1;

    .line 147
    .line 148
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    move-object p0, p1

    .line 152
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-nez p1, :cond_8

    .line 157
    .line 158
    move-object v7, p0

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    const-string p0, "r542b803b7817851a"

    .line 161
    .line 162
    const-string p2, "DexKit \u5b9a\u4f4d\u964c\u751f\u4eba\u6a21\u578b\u5de5\u5382\u5931\u8d25"

    .line 163
    .line 164
    invoke-static {p0, p2, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 168
    .line 169
    invoke-virtual {v4, v7, v6}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_9
    :goto_6
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eqz p0, :cond_a

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_a
    invoke-virtual {v2, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :try_start_2
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 188
    .line 189
    invoke-static {v0, v7}, Lox;->χ(Lkx;Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 190
    .line 191
    .line 192
    :catchall_2
    :goto_7
    return-object v7
.end method
