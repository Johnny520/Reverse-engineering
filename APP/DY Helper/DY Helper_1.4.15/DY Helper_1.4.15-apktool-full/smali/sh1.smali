.class public final Lsh1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lsh1;

.field public static final β:Landroid/os/Handler;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final θ:Ljava/util/Set;

.field public static final ι:Ljava/util/Set;

.field public static volatile κ:Ljava/lang/ref/WeakReference;

.field public static volatile λ:Z

.field public static final μ:Ljava/lang/Object;

.field public static volatile ν:J

.field public static volatile ξ:Ljava/lang/String;

.field public static volatile ο:Ljava/lang/ref/WeakReference;

.field public static final π:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ρ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsh1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lsh1;->α:Lsh1;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lsh1;->β:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lsh1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lsh1;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lsh1;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lsh1;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sput-object v0, Lsh1;->θ:Ljava/util/Set;

    .line 65
    .line 66
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lsh1;->ι:Ljava/util/Set;

    .line 76
    .line 77
    new-instance v0, Ljava/lang/Object;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    sput-object v0, Lsh1;->μ:Ljava/lang/Object;

    .line 83
    .line 84
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lsh1;->π:Ljava/util/concurrent/ConcurrentHashMap;

    .line 90
    .line 91
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lsh1;->ρ:Ljava/util/Set;

    .line 101
    .line 102
    return-void
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
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

.method public static β(Ljava/lang/Object;)V
    .locals 5

    .line 1
    sget-object v0, Lkx;->Ш:Lkx;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    sget-object v1, Lsh1;->ο:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ne v1, p0, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lsh1;->μ(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_3
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lsh1;->ο:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p0, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_8

    .line 47
    .line 48
    sget-object p0, Lsh1;->ρ:Ljava/util/Set;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-interface {p0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_8

    .line 59
    .line 60
    sget-object p0, Luh1;->α:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {v0, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    sget-object p0, Ljz;->ε:Ljz;

    .line 73
    .line 74
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v2, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Ljava/lang/Class;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_6

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    :goto_1
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v0, v2}, Lox;->υ(Lkx;Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    :cond_8
    :goto_2
    return-void
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/Integer;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p0, v1

    .line 19
    goto :goto_1

    .line 20
    :goto_0
    new-instance p1, Leo1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_1
    instance-of p1, p0, Leo1;

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-object v1, p0

    .line 32
    :goto_2
    check-cast v1, Ljava/lang/Integer;

    .line 33
    .line 34
    return-object v1
.end method

.method public static ζ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 5

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v2, v1

    .line 20
    :goto_1
    if-ge v0, v2, :cond_2

    .line 21
    .line 22
    aget-object v3, v1, v0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v3, p1}, Lsh1;->ζ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    :goto_2
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return v0
.end method

.method public static η(Ljava/lang/ClassLoader;Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-static {v0}, Luh1;->ε(Ljava/lang/reflect/Method;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v0}, Lsh1;->ξ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, Lsh1;->θ:Ljava/util/Set;

    .line 29
    .line 30
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v3, 0x1

    .line 38
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    sget-object v3, Lxq0;->α:Lxq0;

    .line 42
    .line 43
    new-instance v4, Lbm;

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    invoke-direct {v4, p0, v5}, Lbm;-><init>(Ljava/lang/ClassLoader;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 51
    .line 52
    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v3, "hook play complete -> "

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    new-instance v3, Leo1;

    .line 78
    .line 79
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object v0, v3

    .line 83
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_0

    .line 88
    .line 89
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "hook play complete failed -> "

    .line 95
    .line 96
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", err="

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    return-void
.end method

.method public static ι(Ljava/lang/ClassLoader;)Z
    .locals 3

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->Ц:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    const-string p0, "completed methods cache empty, re-resolve"

    .line 20
    .line 21
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-static {p0, v0}, Lsh1;->η(Ljava/lang/ClassLoader;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v1, "completed methods cache present, count="

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x1

    .line 56
    return p0
.end method

.method public static κ(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 7

    .line 1
    sget-object v0, Luh1;->α:Ljava/util/List;

    .line 2
    .line 3
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v0, Lkx;->Ю:Lkx;

    .line 6
    .line 7
    invoke-static {v0, p0}, Lox;->ρ(Lkx;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Luh1;->ζ(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v3

    .line 32
    new-instance v4, Leo1;

    .line 33
    .line 34
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v3, v4

    .line 38
    :goto_0
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 39
    .line 40
    instance-of v5, v3, Leo1;

    .line 41
    .line 42
    if-eqz v5, :cond_0

    .line 43
    .line 44
    move-object v3, v4

    .line 45
    :cond_0
    check-cast v3, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_1
    if-eqz p0, :cond_2

    .line 64
    .line 65
    const-class v4, Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_2

    .line 72
    .line 73
    invoke-static {p0, v3}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/reflect/Field;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-nez v4, :cond_3

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    goto :goto_3

    .line 112
    :catchall_1
    move-exception v4

    .line 113
    new-instance v5, Leo1;

    .line 114
    .line 115
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    move-object v4, v5

    .line 119
    :goto_3
    instance-of v5, v4, Leo1;

    .line 120
    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    move-object v4, v1

    .line 124
    :cond_4
    if-nez v4, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-static {v4}, Luh1;->ζ(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {v0, v3}, Lox;->φ(Lkx;Ljava/lang/reflect/Field;)V

    .line 139
    .line 140
    .line 141
    move-object p0, v3

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    move-object p0, v1

    .line 144
    :goto_4
    if-nez p0, :cond_7

    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_7
    :try_start_2
    invoke-virtual {p0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 154
    goto :goto_5

    .line 155
    :catchall_2
    move-exception v0

    .line 156
    new-instance v3, Leo1;

    .line 157
    .line 158
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    move-object v0, v3

    .line 162
    :goto_5
    instance-of v3, v0, Leo1;

    .line 163
    .line 164
    if-eqz v3, :cond_8

    .line 165
    .line 166
    move-object v0, v1

    .line 167
    :cond_8
    if-nez v0, :cond_9

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v3}, Lsh1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_b

    .line 187
    .line 188
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    move-object v5, v4

    .line 193
    check-cast v5, Ljava/lang/reflect/Method;

    .line 194
    .line 195
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-nez v6, :cond_a

    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-static {v6, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_a

    .line 214
    .line 215
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    array-length v5, v5

    .line 223
    if-nez v5, :cond_a

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_b
    move-object v4, v1

    .line 227
    :goto_6
    check-cast v4, Ljava/lang/reflect/Method;

    .line 228
    .line 229
    if-nez v4, :cond_c

    .line 230
    .line 231
    :goto_7
    const/4 p0, 0x0

    .line 232
    return p0

    .line 233
    :cond_c
    :try_start_3
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    new-instance v2, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const-string v3, "invoke internal player OK: "

    .line 269
    .line 270
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string p1, "."

    .line 277
    .line 278
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string p0, " -> "

    .line 285
    .line 286
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string p0, "#"

    .line 293
    .line 294
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :catchall_3
    move-exception p0

    .line 311
    new-instance p1, Leo1;

    .line 312
    .line 313
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    move-object p0, p1

    .line 317
    :goto_8
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    if-nez p1, :cond_d

    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    const-string v0, "invoke internal player failed: method="

    .line 327
    .line 328
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const-string p2, ", err="

    .line 335
    .line 336
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 350
    .line 351
    :goto_9
    check-cast p0, Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    return p0
.end method

.method public static λ(Ljava/lang/Object;Ljava/lang/ClassLoader;Z)Z
    .locals 6

    .line 1
    const-string v0, "resumeFeedPlayer OK via wrapper="

    .line 2
    .line 3
    const-string v1, "pauseFeedPlayer OK via wrapper="

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    sget-object v2, Luh1;->α:Ljava/util/List;

    .line 8
    .line 9
    const-string v2, "pausePlay"

    .line 10
    .line 11
    const-string v3, "onPausePlay"

    .line 12
    .line 13
    const-string v4, "LJIIIIZZ"

    .line 14
    .line 15
    const-string v5, "pause"

    .line 16
    .line 17
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v5}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, Lkx;->Щ:Lkx;

    .line 30
    .line 31
    invoke-static {v4, p0, p1, v2, v3}, Luh1;->θ(Lkx;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sget-object v2, Luh1;->α:Ljava/util/List;

    .line 37
    .line 38
    const-string v2, "onResumePlay"

    .line 39
    .line 40
    const-string v3, "resumePlay"

    .line 41
    .line 42
    const-string v4, "resume"

    .line 43
    .line 44
    filled-new-array {v3, v4, v2}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v4}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    sget-object v4, Lkx;->Э:Lkx;

    .line 57
    .line 58
    invoke-static {v4, p0, p1, v2, v3}, Luh1;->θ(Lkx;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/util/List;Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_0
    if-nez p1, :cond_1

    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_1
    const/4 v2, 0x1

    .line 67
    :try_start_0
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    const-string v2, "#"

    .line 75
    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :goto_1
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :goto_2
    new-instance v0, Leo1;

    .line 148
    .line 149
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    move-object p0, v0

    .line 153
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-nez v0, :cond_3

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v1, "invoke wrapper control failed: pause="

    .line 167
    .line 168
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p2, ", method="

    .line 175
    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p0, ", err="

    .line 183
    .line 184
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 198
    .line 199
    :goto_4
    check-cast p0, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    return p0
.end method

.method public static μ(Ljava/lang/Class;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lsh1;->π:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Boolean;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"

    .line 25
    .line 26
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string v2, "FeedPlayerWrapper"

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-static {v0, v2, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const-string v0, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"

    .line 49
    .line 50
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p0, v0}, Lsh1;->ζ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {p0}, Lsh1;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v2, Lf7;

    .line 66
    .line 67
    const/4 v5, 0x1

    .line 68
    invoke-direct {v2, v5, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lcf1;

    .line 72
    .line 73
    const/16 v5, 0x13

    .line 74
    .line 75
    invoke-direct {v0, v5}, Lcf1;-><init>(I)V

    .line 76
    .line 77
    .line 78
    new-instance v5, Lt52;

    .line 79
    .line 80
    invoke-direct {v5, v2, v0}, Lt52;-><init>(Lss1;La80;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lus1;->Θ(Lss1;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v2, "setOnUIPlayListener"

    .line 88
    .line 89
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    const-string v2, "isPlaying"

    .line 96
    .line 97
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_5

    .line 102
    .line 103
    const-string v2, "resumePlay"

    .line 104
    .line 105
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_5

    .line 110
    .line 111
    const-string v2, "LJIIIIZZ"

    .line 112
    .line 113
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    move v3, v4

    .line 121
    :cond_5
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return v3
.end method

.method public static ν(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "r33415130c3798aa0"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ξ(Ljava/lang/reflect/Method;)Ljava/lang/String;
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
    const/16 v3, 0x12

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

.method public static π(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance p1, Leo1;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, p1

    .line 29
    :goto_0
    instance-of p1, p0, Leo1;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 35
    .line 36
    return-object p0
.end method

.method public static ρ(Landroid/app/Activity;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "live"

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v3, 0x1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v1, "publish"

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string v1, "edit"

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    instance-of v0, v0, Landroid/widget/EditText;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    :goto_0
    return v3

    .line 56
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 v0, 0x0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object p0, v0

    .line 69
    :goto_1
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    move-object v0, p0

    .line 74
    check-cast v0, Landroid/view/ViewGroup;

    .line 75
    .line 76
    :cond_5
    if-nez v0, :cond_6

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_6
    new-instance p0, Lqm1;

    .line 80
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v1, Lqh1;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-direct {v1, p0, v4, v0}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0, v1}, Lsh1;->τ(Landroid/view/View;La80;)V

    .line 91
    .line 92
    .line 93
    iget-boolean p0, p0, Lqm1;->ε:Z

    .line 94
    .line 95
    if-eqz p0, :cond_7

    .line 96
    .line 97
    const-string p0, "auto_scroll_in_comment"

    .line 98
    .line 99
    invoke-static {p0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    xor-int/2addr p0, v3

    .line 104
    return p0

    .line 105
    :cond_7
    :goto_2
    return v2
.end method

.method public static σ(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lxx0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lxx0;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lsh1;->β:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static τ(Landroid/view/View;La80;)V
    .locals 3

    .line 1
    invoke-interface {p1, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p1}, Lsh1;->τ(Landroid/view/View;La80;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public static final φ(JFLandroid/app/Activity;IF)V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v2

    .line 5
    const/4 v7, 0x0

    .line 6
    move-wide v0, p0

    .line 7
    move v5, p2

    .line 8
    move v4, p4

    .line 9
    move v6, p5

    .line 10
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/16 p1, 0x1002

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->setSource(I)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    sget-object p1, Le30;->α:Le30;

    .line 20
    .line 21
    invoke-static {p3, p0}, Le30;->α(Landroid/app/Activity;Landroid/view/MotionEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/MotionEvent;->recycle()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    invoke-virtual {p0}, Landroid/view/MotionEvent;->recycle()V

    .line 31
    .line 32
    .line 33
    throw p1
.end method


# virtual methods
.method public final δ(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lsh1;->ο:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Lsh1;->μ(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v1, Luh1;->α:Ljava/util/List;

    .line 28
    .line 29
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v1, Lkx;->Ч:Lkx;

    .line 32
    .line 33
    invoke-static {v1, p1}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    sget-object v1, Ljz;->ε:Ljz;

    .line 40
    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/lang/reflect/Method;

    .line 56
    .line 57
    invoke-static {v2}, Lsh1;->ξ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v1, Luh1;->α:Ljava/util/List;

    .line 66
    .line 67
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    sget-object v2, Luh1;->β:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_8

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p1, v3}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    array-length v4, v3

    .line 105
    const/4 v5, 0x0

    .line 106
    :goto_2
    if-ge v5, v4, :cond_3

    .line 107
    .line 108
    aget-object v6, v3, v5

    .line 109
    .line 110
    sget-object v7, Luh1;->α:Ljava/util/List;

    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-nez v7, :cond_5

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    array-length v7, v7

    .line 134
    if-nez v7, :cond_7

    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    const-string v8, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A6499963AF392C9B2B9E9BAA7A7377F1B689B86E188"

    .line 145
    .line 146
    invoke-static {v8}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const-string v8, "LIZJ"

    .line 162
    .line 163
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_7

    .line 168
    .line 169
    :goto_3
    invoke-static {v1, v6}, Luh1;->α(Ljava/util/LinkedHashMap;Ljava/lang/reflect/Method;)V

    .line 170
    .line 171
    .line 172
    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    check-cast p1, Ljava/lang/Iterable;

    .line 183
    .line 184
    invoke-static {p1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_9

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, Ljava/lang/reflect/Method;

    .line 203
    .line 204
    invoke-static {v1}, Lsh1;->ξ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    const/4 v1, 0x0

    .line 217
    if-eqz p1, :cond_a

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_a
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    :cond_b
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_e

    .line 233
    .line 234
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    check-cast v0, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    const/4 v2, 0x1

    .line 244
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 251
    goto :goto_7

    .line 252
    :catchall_0
    move-exception v0

    .line 253
    new-instance v2, Leo1;

    .line 254
    .line 255
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    move-object v0, v2

    .line 259
    :goto_7
    instance-of v2, v0, Leo1;

    .line 260
    .line 261
    if-eqz v2, :cond_c

    .line 262
    .line 263
    move-object v0, v1

    .line 264
    :cond_c
    if-nez v0, :cond_d

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-static {v2}, Lsh1;->μ(Ljava/lang/Class;)Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-eqz v2, :cond_b

    .line 276
    .line 277
    invoke-static {v0}, Lsh1;->β(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p0, p1}, Lsh1;->θ(Ljava/lang/Class;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    const-string p1, "FeedPlayerWrapper obtained -> "

    .line 296
    .line 297
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    return-object v0

    .line 305
    :cond_e
    :goto_8
    return-object v1
.end method

.method public final ε(Landroid/app/Activity;)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v1

    .line 22
    :goto_1
    const/4 v2, 0x0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    goto/16 :goto_9

    .line 26
    .line 27
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v4, Lwa;

    .line 33
    .line 34
    const/16 v5, 0x1d

    .line 35
    .line 36
    invoke-direct {v4, v0, v5, v3}, Lwa;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v4}, Lsh1;->τ(Landroid/view/View;La80;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lib1;

    .line 43
    .line 44
    const/16 v4, 0x11

    .line 45
    .line 46
    invoke-direct {v0, v4}, Lib1;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    const-string v0, "auto next pager candidates empty"

    .line 60
    .line 61
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_9

    .line 65
    .line 66
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_10

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Ll91;

    .line 81
    .line 82
    iget-object v4, v3, Ll91;->ε:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Landroid/view/View;

    .line 85
    .line 86
    iget-object v3, v3, Ll91;->ζ:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const-string v5, "setCurrentItem"

    .line 95
    .line 96
    const-string v6, "getCurrentItem"

    .line 97
    .line 98
    invoke-static {v4, v6}, Lsh1;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-eqz v6, :cond_5

    .line 103
    .line 104
    :goto_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    const-string v6, "mCurrentItem"

    .line 110
    .line 111
    invoke-static {v4, v6}, Lsh1;->π(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    if-eqz v6, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    const-string v6, "mCurItem"

    .line 119
    .line 120
    invoke-static {v4, v6}, Lsh1;->π(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    if-eqz v6, :cond_a

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :goto_3
    :try_start_0
    const-string v7, "getAdapter"

    .line 128
    .line 129
    new-array v8, v2, [Ljava/lang/Object;

    .line 130
    .line 131
    invoke-static {v4, v7, v8}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    goto :goto_4

    .line 136
    :catchall_0
    move-exception v7

    .line 137
    new-instance v8, Leo1;

    .line 138
    .line 139
    invoke-direct {v8, v7}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    move-object v7, v8

    .line 143
    :goto_4
    instance-of v8, v7, Leo1;

    .line 144
    .line 145
    if-eqz v8, :cond_7

    .line 146
    .line 147
    move-object v7, v1

    .line 148
    :cond_7
    if-nez v7, :cond_8

    .line 149
    .line 150
    move-object v8, v1

    .line 151
    goto :goto_5

    .line 152
    :cond_8
    const-string v8, "getItemCount"

    .line 153
    .line 154
    invoke-static {v7, v8}, Lsh1;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-nez v8, :cond_9

    .line 159
    .line 160
    const-string v8, "getCount"

    .line 161
    .line 162
    invoke-static {v7, v8}, Lsh1;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    :cond_9
    :goto_5
    if-eqz v8, :cond_b

    .line 167
    .line 168
    add-int/lit8 v7, v6, 0x1

    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-lt v7, v8, :cond_b

    .line 175
    .line 176
    :cond_a
    move v5, v2

    .line 177
    goto/16 :goto_8

    .line 178
    .line 179
    :cond_b
    sget-object v7, Lpq;->α:Lpq;

    .line 180
    .line 181
    invoke-static {}, Lpq;->α()Lmq;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    :try_start_1
    sget-object v8, Lqe0;->α:Ljava/lang/Object;

    .line 186
    .line 187
    add-int/lit8 v8, v6, 0x1

    .line 188
    .line 189
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 194
    .line 195
    filled-new-array {v8, v9}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-static {v4, v5, v8}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :catchall_1
    move-exception v8

    .line 204
    new-instance v9, Leo1;

    .line 205
    .line 206
    invoke-direct {v9, v8}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    :goto_6
    invoke-static {v9}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    if-nez v8, :cond_c

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_c
    :try_start_2
    sget-object v8, Lqe0;->α:Ljava/lang/Object;

    .line 217
    .line 218
    add-int/lit8 v6, v6, 0x1

    .line 219
    .line 220
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    invoke-static {v4, v5, v6}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 232
    .line 233
    move-object v9, v5

    .line 234
    goto :goto_7

    .line 235
    :catchall_2
    move-exception v5

    .line 236
    new-instance v6, Leo1;

    .line 237
    .line 238
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    move-object v9, v6

    .line 242
    :goto_7
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 243
    .line 244
    instance-of v6, v9, Leo1;

    .line 245
    .line 246
    if-eqz v6, :cond_d

    .line 247
    .line 248
    move-object v9, v5

    .line 249
    :cond_d
    check-cast v9, Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    if-eqz v5, :cond_f

    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    if-nez v7, :cond_e

    .line 266
    .line 267
    const-string v6, "auto next pager fallback skipped: current work summary unavailable"

    .line 268
    .line 269
    invoke-static {v6}, Lsh1;->ν(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_e
    sget-object v8, Lsh1;->η:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 274
    .line 275
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 276
    .line 277
    .line 278
    move-result v8

    .line 279
    new-instance v9, Lvw;

    .line 280
    .line 281
    invoke-direct {v9, v8, p1, v7, v6}, Lvw;-><init>(ILandroid/app/Activity;Lmq;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    const-wide/16 v6, 0x1c2

    .line 285
    .line 286
    sget-object v8, Lsh1;->β:Landroid/os/Handler;

    .line 287
    .line 288
    invoke-virtual {v8, v9, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 289
    .line 290
    .line 291
    :cond_f
    :goto_8
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    const-string v6, ", score="

    .line 300
    .line 301
    const-string v7, ", accepted="

    .line 302
    .line 303
    const-string v8, "auto next pager request class="

    .line 304
    .line 305
    invoke-static {v3, v8, v4, v6, v7}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-static {v3}, Lsh1;->ν(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    if-eqz v5, :cond_4

    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_10
    :goto_9
    invoke-virtual {p0, p1}, Lsh1;->υ(Landroid/app/Activity;)Z

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    if-eqz p0, :cond_11

    .line 327
    .line 328
    :goto_a
    const/4 v2, 0x1

    .line 329
    :cond_11
    return v2
.end method

.method public final θ(Ljava/lang/Class;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lsh1;->ι:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    :try_start_0
    sget-object v0, Lxq0;->α:Lxq0;

    .line 16
    .line 17
    new-instance v2, Lad1;

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    invoke-direct {v2, v3, p0}, Lad1;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1, v2}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    const-string v4, "LJIIIIZZ"

    .line 27
    .line 28
    const-string v5, "resumePlay"

    .line 29
    .line 30
    const-string v6, "pause"

    .line 31
    .line 32
    const-string v7, "resume"

    .line 33
    .line 34
    const-string v8, "stopPlay"

    .line 35
    .line 36
    const-string v9, "setOnUIPlayListener"

    .line 37
    .line 38
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

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
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    array-length v4, v2

    .line 59
    const/4 v5, 0x0

    .line 60
    :goto_0
    const/4 v6, 0x1

    .line 61
    if-ge v5, v4, :cond_3

    .line 62
    .line 63
    aget-object v7, v2, v5

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-nez v8, :cond_2

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_2

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-nez v8, :cond_1

    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const-string v9, "pause"

    .line 103
    .line 104
    invoke-static {v8, v9, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-nez v8, :cond_1

    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const-string v9, "resume"

    .line 118
    .line 119
    invoke-static {v8, v9, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object p0, v0

    .line 128
    goto :goto_3

    .line 129
    :cond_1
    :goto_1
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_4

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    invoke-virtual {v2, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 152
    .line 153
    .line 154
    sget-object v3, Lxq0;->α:Lxq0;

    .line 155
    .line 156
    new-instance v4, Lad1;

    .line 157
    .line 158
    const/4 v5, 0x6

    .line 159
    invoke-direct {v4, v5, p0}, Lad1;-><init>(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v2, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v2, "FeedPlayerWrapper cache hook OK -> "

    .line 176
    .line 177
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :goto_3
    new-instance v0, Leo1;

    .line 194
    .line 195
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object p0, v0

    .line 199
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    if-eqz p0, :cond_5

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v0, "FeedPlayerWrapper cache hook failed: "

    .line 217
    .line 218
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const-string v0, "r33415130c3798aa0"

    .line 223
    .line 224
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 225
    .line 226
    .line 227
    :cond_5
    :goto_5
    return-void
.end method

.method public final ο(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lsh1;->δ(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "pause"

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    invoke-static {p0, p1, v1}, Lsh1;->λ(Ljava/lang/Object;Ljava/lang/ClassLoader;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_a

    .line 17
    .line 18
    :cond_0
    invoke-static {p1, p0, v0}, Lsh1;->κ(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_a

    .line 25
    .line 26
    :cond_1
    :try_start_0
    const-string p0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC406E12B8914FB88E85298625B4217CE390D825569B5182C86950"

    .line 27
    .line 28
    invoke-static {p0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    filled-new-array {p0}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v2, 0x0

    .line 37
    aget-object p0, p0, v2

    .line 38
    .line 39
    invoke-static {p1, p0}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 43
    const/4 p1, 0x0

    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object p0, p1

    .line 48
    :goto_0
    if-nez p0, :cond_3

    .line 49
    .line 50
    goto/16 :goto_9

    .line 51
    .line 52
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    array-length v4, v3

    .line 60
    move v5, v2

    .line 61
    :goto_1
    if-ge v5, v4, :cond_5

    .line 62
    .line 63
    aget-object v6, v3, v5

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    array-length v7, v7

    .line 83
    if-nez v7, :cond_4

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {p0, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception v3

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move-object v6, p1

    .line 102
    :goto_2
    if-eqz v6, :cond_6

    .line 103
    .line 104
    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, p1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    goto :goto_4

    .line 112
    :cond_6
    move-object v3, p1

    .line 113
    goto :goto_4

    .line 114
    :goto_3
    :try_start_2
    new-instance v4, Leo1;

    .line 115
    .line 116
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object v3, v4

    .line 120
    :goto_4
    instance-of v4, v3, Leo1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 121
    .line 122
    if-eqz v4, :cond_7

    .line 123
    .line 124
    move-object v3, p1

    .line 125
    :cond_7
    if-nez v3, :cond_9

    .line 126
    .line 127
    :try_start_3
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 138
    goto :goto_5

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    :try_start_4
    new-instance v1, Leo1;

    .line 141
    .line 142
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    move-object p0, v1

    .line 146
    :goto_5
    instance-of v1, p0, Leo1;

    .line 147
    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_8
    move-object p1, p0

    .line 152
    goto :goto_6

    .line 153
    :cond_9
    move-object p1, v3

    .line 154
    :goto_6
    if-nez p1, :cond_a

    .line 155
    .line 156
    goto :goto_9

    .line 157
    :cond_a
    new-array p0, v2, [Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {p1, v0, p0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    const-string p0, "pauseFeedPlayer OK via PlayerService"

    .line 163
    .line 164
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :catchall_2
    move-exception p0

    .line 171
    new-instance p1, Leo1;

    .line 172
    .line 173
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object p0, p1

    .line 177
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-nez p1, :cond_b

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v0, "pauseByPlayerService failed: "

    .line 187
    .line 188
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 202
    .line 203
    :goto_8
    check-cast p0, Ljava/lang/Boolean;

    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    :goto_9
    if-eqz v2, :cond_c

    .line 210
    .line 211
    :goto_a
    return-void

    .line 212
    :cond_c
    const-string p0, "pauseFeedPlayer failed: wrapper/provider/playerService all unavailable"

    .line 213
    .line 214
    invoke-static {p0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public final υ(Landroid/app/Activity;)Z
    .locals 18

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-lez v2, :cond_5

    .line 25
    .line 26
    if-gtz v0, :cond_1

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_1
    int-to-float v2, v2

    .line 31
    const/high16 v3, 0x3f000000    # 0.5f

    .line 32
    .line 33
    mul-float v6, v2, v3

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    const v2, 0x3f3851ec    # 0.72f

    .line 37
    .line 38
    .line 39
    mul-float v9, v0, v2

    .line 40
    .line 41
    const v2, 0x3e8f5c29    # 0.28f

    .line 42
    .line 43
    .line 44
    mul-float/2addr v0, v2

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v4

    .line 49
    const/4 v2, 0x1

    .line 50
    sput-boolean v2, Lsh1;->λ:Z

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    move-object/from16 v7, p1

    .line 54
    .line 55
    :try_start_0
    invoke-static/range {v4 .. v9}, Lsh1;->φ(JFLandroid/app/Activity;IF)V

    .line 56
    .line 57
    .line 58
    move v3, v9

    .line 59
    :goto_0
    int-to-float v7, v2

    .line 60
    const/16 v10, 0x8

    .line 61
    .line 62
    int-to-float v8, v10

    .line 63
    div-float/2addr v7, v8

    .line 64
    sub-float v8, v0, v3

    .line 65
    .line 66
    mul-float/2addr v8, v7

    .line 67
    add-float/2addr v8, v3

    .line 68
    sget-object v11, Lsh1;->β:Landroid/os/Handler;

    .line 69
    .line 70
    move v9, v6

    .line 71
    move-wide v6, v4

    .line 72
    new-instance v4, Lph1;

    .line 73
    .line 74
    move v5, v8

    .line 75
    move v8, v9

    .line 76
    move-object/from16 v9, p1

    .line 77
    .line 78
    invoke-direct/range {v4 .. v9}, Lph1;-><init>(FJFLandroid/app/Activity;)V

    .line 79
    .line 80
    .line 81
    move-wide/from16 v16, v6

    .line 82
    .line 83
    move-object v7, v4

    .line 84
    move-wide/from16 v4, v16

    .line 85
    .line 86
    move v6, v8

    .line 87
    int-to-long v8, v2

    .line 88
    const-wide/16 v12, 0x140

    .line 89
    .line 90
    mul-long/2addr v8, v12

    .line 91
    const/16 v14, 0x9

    .line 92
    .line 93
    int-to-long v14, v14

    .line 94
    div-long/2addr v8, v14

    .line 95
    invoke-virtual {v11, v7, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    if-eq v2, v10, :cond_2

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    new-instance v2, Lph1;

    .line 104
    .line 105
    move-object/from16 v10, p1

    .line 106
    .line 107
    move-wide v7, v4

    .line 108
    move v9, v6

    .line 109
    move-object/from16 v5, p0

    .line 110
    .line 111
    move v6, v0

    .line 112
    move-object v4, v2

    .line 113
    invoke-direct/range {v4 .. v10}, Lph1;-><init>(Lsh1;FJFLandroid/app/Activity;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v11, v4, v12, v13}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 117
    .line 118
    .line 119
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    new-instance v2, Leo1;

    .line 124
    .line 125
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v2

    .line 129
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    if-eqz v2, :cond_3

    .line 134
    .line 135
    sput-boolean v1, Lsh1;->λ:Z

    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v3, "swipe next failed: "

    .line 140
    .line 141
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Lsh1;->ν(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 155
    .line 156
    instance-of v2, v0, Leo1;

    .line 157
    .line 158
    if-eqz v2, :cond_4

    .line 159
    .line 160
    move-object v0, v1

    .line 161
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    return v0

    .line 168
    :cond_5
    :goto_2
    return v1
.end method
