.class public final Lhf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lhf0;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lhf0;->α:Lhf0;

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
    sput-object v0, Lhf0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lhf0;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    return-void
.end method

.method public static β(Ljava/util/List;)V
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ":"

    .line 50
    .line 51
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "#"

    .line 58
    .line 59
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, "()"

    .line 66
    .line 67
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v2, Lhf0;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_0

    .line 81
    .line 82
    :try_start_0
    sget-object v3, Lxq0;->α:Lxq0;

    .line 83
    .line 84
    new-instance v4, Lf10;

    .line 85
    .line 86
    const/16 v5, 0xf

    .line 87
    .line 88
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    new-instance v3, Leo1;

    .line 98
    .line 99
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    move-object v0, v3

    .line 103
    :goto_1
    instance-of v3, v0, Leo1;

    .line 104
    .line 105
    const/4 v4, 0x4

    .line 106
    const-string v5, "r57da051d00c44d33"

    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    if-nez v3, :cond_1

    .line 110
    .line 111
    move-object v3, v0

    .line 112
    check-cast v3, Ll01;

    .line 113
    .line 114
    const-string v3, "\u5bbf\u4e3b\u957f\u6309\u500d\u7387 Hook \u5df2\u5b89\u88c5: "

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {v5, v3, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_0

    .line 128
    .line 129
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v2, "\u5bbf\u4e3b\u957f\u6309\u500d\u7387 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 137
    .line 138
    const-string v3, ", "

    .line 139
    .line 140
    invoke-static {v2, v1, v3, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {v5, v0, v6, v4, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_2
    return-void
.end method


# virtual methods
.method public final α(Lz81;)V
    .locals 13

    .line 1
    sget-object v1, Ls62;->α:Ls62;

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Ll82;->α:Ll82;

    .line 4
    .line 5
    iget-object v2, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ll82;->δ(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    new-instance v2, Leo1;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x4

    .line 23
    const-string v3, "r57da051d00c44d33"

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v5, "\u5b89\u88c5\u65e7\u7248\u64ad\u653e\u5668\u500d\u901f\u515c\u5e95\u5931\u8d25: "

    .line 33
    .line 34
    invoke-static {v5, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :try_start_1
    sget-object v0, Ln82;->α:[Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1}, Ln82;->γ(Lz81;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    move-object v5, v1

    .line 47
    goto :goto_1

    .line 48
    :catchall_1
    move-exception v0

    .line 49
    new-instance v5, Leo1;

    .line 50
    .line 51
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v5, "\u5b89\u88c5\u9ad8\u500d\u901f native \u80fd\u529b\u5931\u8d25: "

    .line 65
    .line 66
    invoke-static {v5, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :try_start_2
    sget-object v0, Lif0;->α:Ljava/util/List;

    .line 74
    .line 75
    iget-object v0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 76
    .line 77
    invoke-static {v0}, Lif0;->β(Ljava/lang/ClassLoader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    .line 79
    .line 80
    move-object v5, v1

    .line 81
    goto :goto_2

    .line 82
    :catchall_2
    move-exception v0

    .line 83
    new-instance v5, Leo1;

    .line 84
    .line 85
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v5, "\u5b89\u88c5\u5bbf\u4e3b\u957f\u6309\u500d\u901f\u63d0\u793a\u540c\u6b65\u5931\u8d25: "

    .line 99
    .line 100
    invoke-static {v5, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {v3, v0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_2
    sget-object v0, Lhf0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 108
    .line 109
    const/4 v5, 0x1

    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-virtual {v0, v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    sget-object v0, Lm20;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 118
    .line 119
    new-instance v5, Lng;

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    const/16 v12, 0xc

    .line 123
    .line 124
    const/4 v6, 0x1

    .line 125
    const-class v8, Lhf0;

    .line 126
    .line 127
    const-string v9, "installResolvedMethods"

    .line 128
    .line 129
    const-string v10, "installResolvedMethods(Ljava/util/List;)V"

    .line 130
    .line 131
    move-object v7, p0

    .line 132
    invoke-direct/range {v5 .. v12}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    sget-object p0, Lm20;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 136
    .line 137
    invoke-virtual {p0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_3
    :try_start_3
    sget-object p0, Lm20;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 141
    .line 142
    iget-object p0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 143
    .line 144
    invoke-static {p0}, Lm20;->γ(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lhf0;->β(Ljava/util/List;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catchall_3
    move-exception v0

    .line 153
    move-object p0, v0

    .line 154
    new-instance v1, Leo1;

    .line 155
    .line 156
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    :goto_3
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-eqz p0, :cond_4

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    const-string p1, "\u5b89\u88c5\u5bbf\u4e3b\u957f\u6309\u500d\u7387\u63d0\u4f9b Hook \u5931\u8d25: "

    .line 170
    .line 171
    invoke-static {p1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {v3, p0, v4, v2, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    return-void
.end method
