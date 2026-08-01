.class public final Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;,
        Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;,
        Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private multi:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "TK;",
            "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref<",
            "TV;>;>;>;"
        }
    .end annotation
.end field

.field private singleLoaderRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation
.end field

.field private singleMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "TK;",
            "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private final weakValue:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 21
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;-><init>(ZILzq;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->weakValue:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 19
    .line 20
    return-void
.end method

.method public synthetic constructor <init>(ZILzq;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 22
    :cond_0
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;-><init>(Z)V

    return-void
.end method

.method private final wrap(Ljava/lang/Object;)Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)",
            "Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-boolean p0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->weakValue:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$WeakRef;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$StrongRef;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 72
    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 73
    :try_start_0
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 74
    iput-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 75
    iput-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 76
    iget-object p0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method public final clear(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v3, 0x1

    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    iput-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    :cond_1
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/lang/ClassLoader;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v1, v2

    .line 55
    :goto_1
    if-ne v1, p1, :cond_3

    .line 56
    .line 57
    iput-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    iget-object p0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :goto_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

.method public final get(Ljava/lang/ClassLoader;Ljava/lang/Object;Lp70;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "TK;",
            "Lp70;",
            ")TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/ClassLoader;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto/16 :goto_6

    .line 40
    .line 41
    :cond_0
    move-object v1, v2

    .line 42
    :goto_0
    if-ne v1, p1, :cond_4

    .line 43
    .line 44
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 45
    .line 46
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_2
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/util/Map;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;

    .line 78
    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-interface {v1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->lock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 105
    .line 106
    .line 107
    :try_start_2
    iget-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 108
    .line 109
    if-nez v1, :cond_7

    .line 110
    .line 111
    iget-object v3, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 112
    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, Ljava/lang/ClassLoader;

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_1
    move-exception p0

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    move-object v3, v2

    .line 125
    :goto_2
    if-nez v3, :cond_6

    .line 126
    .line 127
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 128
    .line 129
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 133
    .line 134
    iget-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 135
    .line 136
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    if-eq v3, p1, :cond_7

    .line 141
    .line 142
    new-instance v1, Ljava/util/WeakHashMap;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v4, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 148
    .line 149
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    new-instance v3, Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iput-object v1, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->multi:Ljava/util/WeakHashMap;

    .line 161
    .line 162
    iput-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleLoaderRef:Ljava/lang/ref/WeakReference;

    .line 163
    .line 164
    new-instance v2, Ljava/util/HashMap;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 170
    .line 171
    :cond_7
    :goto_3
    if-eqz v1, :cond_9

    .line 172
    .line 173
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-nez v2, :cond_8

    .line 178
    .line 179
    new-instance v2, Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_8
    check-cast v2, Ljava/util/Map;

    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    iget-object v2, p0, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->singleMap:Ljava/util/Map;

    .line 191
    .line 192
    :goto_4
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;

    .line 197
    .line 198
    if-eqz p1, :cond_a

    .line 199
    .line 200
    invoke-interface {p1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 204
    if-eqz p1, :cond_a

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_a
    :try_start_3
    invoke-interface {p3}, Lp70;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p0, p1}, Lorg/luckypray/dexkit/util/AdaptiveLoaderCache;->wrap(Ljava/lang/Object;)Lorg/luckypray/dexkit/util/AdaptiveLoaderCache$Ref;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-interface {v2, p2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 222
    .line 223
    .line 224
    return-object p1

    .line 225
    :goto_5
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 226
    .line 227
    .line 228
    throw p0

    .line 229
    :goto_6
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 230
    .line 231
    .line 232
    throw p0
.end method
