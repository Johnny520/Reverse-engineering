.class public final Lcp0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/Set;

.field public static final δ:Ljava/util/Set;

.field public static volatile ε:Lng;

.field public static final ζ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "LandscapeEntranceModule"

    .line 2
    .line 3
    const-string v1, "FeedLandscapeEntranceModule"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcp0;->α:Ljava/util/Set;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcp0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcp0;->γ:Ljava/util/Set;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcp0;->δ:Ljava/util/Set;

    .line 50
    .line 51
    const-string v0, "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9F0CE7DC02DBAECD2D4F1C293E6904E624CF4AC12A0270674B672DEF2B2ED42D16F33ED92D8908DD3B7A48299DC77678D41F23C647694"

    .line 52
    .line 53
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "~782EF7E56DAA90CE216196979186EE07173230C07EC7B955655F4BCD0D5E71D74F6A36838C5E475B53D77C91F38447A2B51C065CAF8B02097308BD66513FBAA4A8BD1D7FB924256C8CF9371C70D1BFC92A026FA090F83DE1A5A68AE8B5D34CAB64963BCD289895CED47F041B64EF"

    .line 58
    .line 59
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sput-object v0, Lcp0;->ζ:Ljava/util/List;

    .line 72
    .line 73
    return-void
.end method

.method public static final α(Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7f0deae1

    .line 2
    .line 3
    .line 4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 5
    .line 6
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lcp0;->δ:Ljava/util/Set;

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Ljava/lang/Iterable;

    .line 13
    .line 14
    new-instance v2, Lwk0;

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v2, p0, v3}, Lwk0;-><init>(Landroid/view/View;I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object v0, Lcp0;->ε:Lng;

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :try_start_0
    invoke-virtual {v0, p0}, Lng;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    new-instance v1, Leo1;

    .line 44
    .line 45
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v0, v1

    .line 49
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, "clean mode view callback failed: "

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_1
    const v0, 0x7f0deae2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Llg;

    .line 96
    .line 97
    const/4 v1, 0x4

    .line 98
    invoke-direct {v0, v1}, Llg;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 102
    .line 103
    .line 104
    :goto_2
    return-void
.end method

.method public static β(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    array-length v1, p0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_3

    .line 17
    .line 18
    aget-object v4, p0, v3

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    const-class v5, Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    array-length v6, v5

    .line 49
    const/4 v7, 0x2

    .line 50
    if-ne v6, v7, :cond_2

    .line 51
    .line 52
    const-class v6, Landroid/content/Context;

    .line 53
    .line 54
    aget-object v7, v5, v2

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    const-class v6, Landroid/view/ViewGroup;

    .line 63
    .line 64
    const/4 v7, 0x1

    .line 65
    aget-object v5, v5, v7

    .line 66
    .line 67
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    return-object v0
.end method

.method public static γ(Lz81;Lng;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sput-object p1, Lcp0;->ε:Lng;

    .line 5
    .line 6
    sget-object p1, Lcp0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    new-instance p1, Lwj0;

    .line 20
    .line 21
    const/16 v0, 0x19

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lwj0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const-string v0, "landscape_entrance_misc_control"

    .line 27
    .line 28
    invoke-static {v0, p1}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lwj0;

    .line 32
    .line 33
    const/16 v2, 0x1a

    .line 34
    .line 35
    invoke-direct {p1, v2}, Lwj0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "DexKit provider registered"

    .line 42
    .line 43
    invoke-static {p1}, Lcp0;->ε(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 47
    .line 48
    invoke-static {p0, v1}, Lcp0;->δ(Ljava/lang/ClassLoader;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static δ(Ljava/lang/ClassLoader;Z)V
    .locals 13

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lkx;->ｘ:Lkx;

    .line 4
    .line 5
    invoke-static {v1, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v2, 0x384

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    new-instance v4, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    move-object v6, v5

    .line 34
    check-cast v6, Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {v6}, Lcp0;->ζ(Ljava/lang/Class;)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-lt v6, v2, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v5, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    move-object v7, v6

    .line 71
    check-cast v7, Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_2

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v5, v3

    .line 88
    :cond_4
    sget-object v4, Ljz;->ε:Ljz;

    .line 89
    .line 90
    if-nez v5, :cond_5

    .line 91
    .line 92
    move-object v6, v4

    .line 93
    goto :goto_2

    .line 94
    :cond_5
    move-object v6, v5

    .line 95
    :goto_2
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    new-instance v11, Lwj0;

    .line 102
    .line 103
    const/16 p0, 0x1b

    .line 104
    .line 105
    invoke-direct {v11, p0}, Lwj0;-><init>(I)V

    .line 106
    .line 107
    .line 108
    const/16 v12, 0x1f

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    invoke-static/range {v6 .. v12}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    const-string p1, "resolve class from cache: "

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    move-object v4, v6

    .line 128
    goto/16 :goto_a

    .line 129
    .line 130
    :cond_6
    new-instance v5, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    sget-object v0, Lcp0;->ζ:Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    :cond_7
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/String;

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    :try_start_0
    invoke-static {v0, v7, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    goto :goto_4

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    new-instance v7, Leo1;

    .line 161
    .line 162
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    move-object v0, v7

    .line 166
    :goto_4
    instance-of v7, v0, Leo1;

    .line 167
    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    move-object v0, v3

    .line 171
    :cond_8
    check-cast v0, Ljava/lang/Class;

    .line 172
    .line 173
    if-eqz v0, :cond_7

    .line 174
    .line 175
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    :cond_a
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_b

    .line 193
    .line 194
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    move-object v6, v5

    .line 199
    check-cast v6, Ljava/lang/Class;

    .line 200
    .line 201
    invoke-static {v6}, Lcp0;->ζ(Ljava/lang/Class;)I

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-lt v6, v2, :cond_a

    .line 206
    .line 207
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_b
    new-instance v3, Ljava/util/HashSet;

    .line 212
    .line 213
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 214
    .line 215
    .line 216
    new-instance v5, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-eqz v6, :cond_d

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    move-object v7, v6

    .line 236
    check-cast v7, Ljava/lang/Class;

    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    if-eqz v7, :cond_c

    .line 247
    .line 248
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-nez v0, :cond_e

    .line 257
    .line 258
    :try_start_1
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 259
    .line 260
    invoke-static {v1, v5}, Lox;->υ(Lkx;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 261
    .line 262
    .line 263
    :catchall_1
    new-instance v10, Lwj0;

    .line 264
    .line 265
    const/16 p0, 0x1c

    .line 266
    .line 267
    invoke-direct {v10, p0}, Lwj0;-><init>(I)V

    .line 268
    .line 269
    .line 270
    const/16 v11, 0x1f

    .line 271
    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    invoke-static/range {v5 .. v11}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    const-string p1, "resolve class from reflection fallback: "

    .line 281
    .line 282
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    move-object v4, v5

    .line 290
    goto/16 :goto_a

    .line 291
    .line 292
    :cond_e
    if-nez p1, :cond_f

    .line 293
    .line 294
    goto/16 :goto_a

    .line 295
    .line 296
    :cond_f
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 297
    .line 298
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    if-nez p1, :cond_10

    .line 305
    .line 306
    const-string p0, "DexKitManager not initialized"

    .line 307
    .line 308
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    goto/16 :goto_a

    .line 312
    .line 313
    :cond_10
    new-instance p1, Lt20;

    .line 314
    .line 315
    const/16 v0, 0xb

    .line 316
    .line 317
    invoke-direct {p1, p0, v0}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 318
    .line 319
    .line 320
    const-string v0, "\u5b9a\u4f4d\u5168\u5c4f\u89c2\u770b\u5165\u53e3\u6a21\u5757"

    .line 321
    .line 322
    invoke-static {v1, p0, v0, p1}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    new-instance p1, Ljava/util/ArrayList;

    .line 327
    .line 328
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    :cond_11
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_12

    .line 340
    .line 341
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    move-object v1, v0

    .line 346
    check-cast v1, Ljava/lang/Class;

    .line 347
    .line 348
    invoke-static {v1}, Lcp0;->ζ(Ljava/lang/Class;)I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    if-lt v1, v2, :cond_11

    .line 353
    .line 354
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_12
    new-instance p0, Ljava/util/HashSet;

    .line 359
    .line 360
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 361
    .line 362
    .line 363
    new-instance v0, Ljava/util/ArrayList;

    .line 364
    .line 365
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    :cond_13
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-eqz v1, :cond_14

    .line 377
    .line 378
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    move-object v2, v1

    .line 383
    check-cast v2, Ljava/lang/Class;

    .line 384
    .line 385
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_13

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-nez p0, :cond_15

    .line 404
    .line 405
    new-instance v5, Lwj0;

    .line 406
    .line 407
    const/16 p0, 0x1d

    .line 408
    .line 409
    invoke-direct {v5, p0}, Lwj0;-><init>(I)V

    .line 410
    .line 411
    .line 412
    const/16 v6, 0x1f

    .line 413
    .line 414
    const/4 v1, 0x0

    .line 415
    const/4 v2, 0x0

    .line 416
    const/4 v3, 0x0

    .line 417
    const/4 v4, 0x0

    .line 418
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    const-string p1, "resolve class from DexKit: "

    .line 423
    .line 424
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    goto :goto_9

    .line 432
    :cond_15
    const-string p0, "DexKit did not find LandscapeEntranceModule"

    .line 433
    .line 434
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    :goto_9
    move-object v4, v0

    .line 438
    :goto_a
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result p0

    .line 442
    if-eqz p0, :cond_16

    .line 443
    .line 444
    const-string p0, "installHooks skipped, no LandscapeEntranceModule class"

    .line 445
    .line 446
    invoke-static {p0}, Lcp0;->ε(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :cond_16
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 451
    .line 452
    .line 453
    move-result-object p0

    .line 454
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    if-eqz p1, :cond_1a

    .line 459
    .line 460
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    check-cast p1, Ljava/lang/Class;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    const-string v2, "@"

    .line 479
    .line 480
    invoke-static {v0, v2, v1}, Lnx;->ι(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    sget-object v1, Lcp0;->γ:Ljava/util/Set;

    .line 485
    .line 486
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    if-nez v2, :cond_17

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :cond_17
    invoke-static {p1}, Lcp0;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_18

    .line 502
    .line 503
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    const-string v0, "no onCreateView method found in "

    .line 511
    .line 512
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-static {p1}, Lcp0;->ε(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_18
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    if-eqz v1, :cond_19

    .line 529
    .line 530
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    check-cast v1, Ljava/lang/reflect/Method;

    .line 535
    .line 536
    const/4 v2, 0x1

    .line 537
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 538
    .line 539
    .line 540
    sget-object v2, Lxq0;->α:Lxq0;

    .line 541
    .line 542
    new-instance v4, Loj0;

    .line 543
    .line 544
    const/16 v5, 0xc

    .line 545
    .line 546
    invoke-direct {v4, v5}, Loj0;-><init>(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v1, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 550
    .line 551
    .line 552
    goto :goto_c

    .line 553
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    new-instance v8, Lwj0;

    .line 558
    .line 559
    const/16 v0, 0x18

    .line 560
    .line 561
    invoke-direct {v8, v0}, Lwj0;-><init>(I)V

    .line 562
    .line 563
    .line 564
    const/16 v9, 0x1f

    .line 565
    .line 566
    const/4 v4, 0x0

    .line 567
    const/4 v5, 0x0

    .line 568
    const/4 v6, 0x0

    .line 569
    const/4 v7, 0x0

    .line 570
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    new-instance v1, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    const-string v2, "hook success: "

    .line 577
    .line 578
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string p1, ", methods="

    .line 585
    .line 586
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    invoke-static {p1}, Lcp0;->ε(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    goto/16 :goto_b

    .line 600
    .line 601
    :cond_1a
    return-void
.end method

.method public static ε(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "r79e6cea2fdbd1358"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static ζ(Ljava/lang/Class;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcp0;->ζ:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/16 v2, 0x4b0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v3

    .line 22
    :goto_0
    sget-object v4, Lcp0;->α:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    add-int/lit16 v2, v2, 0x320

    .line 31
    .line 32
    :cond_1
    const-string v1, "longervideo"

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const-string v1, "landscape"

    .line 42
    .line 43
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    const-string v1, "entrance"

    .line 50
    .line 51
    invoke-static {v0, v1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    add-int/lit16 v2, v2, 0x1f4

    .line 58
    .line 59
    :cond_2
    const-string v0, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7006CEB3BBADA10C0A0191636D8AE260E631"

    .line 60
    .line 61
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v1, p0

    .line 66
    :goto_1
    if-eqz v1, :cond_4

    .line 67
    .line 68
    const-class v4, Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    add-int/lit16 v2, v2, 0x1f4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    :goto_2
    invoke-static {p0}, Lcp0;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    add-int/lit16 v2, v2, 0x2bc

    .line 105
    .line 106
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    array-length v0, p0

    .line 114
    :goto_3
    if-ge v3, v0, :cond_7

    .line 115
    .line 116
    aget-object v1, p0, v3

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_6

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    array-length v4, v4

    .line 136
    if-nez v4, :cond_6

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    const-class v5, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const-string v4, "moduleName"

    .line 155
    .line 156
    invoke-static {v1, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_6

    .line 161
    .line 162
    add-int/lit16 v2, v2, 0xc8

    .line 163
    .line 164
    return v2

    .line 165
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_7
    return v2
.end method
