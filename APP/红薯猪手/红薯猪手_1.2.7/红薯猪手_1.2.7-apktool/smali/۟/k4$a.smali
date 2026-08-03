.class public final L۟/k4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/k4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/k4;


# direct methods
.method public constructor <init>(L۟/k4;)V
    .locals 0

    iput-object p1, p0, L۟/k4$a;->ۥ:L۟/k4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 2
    .line 3
    iget-object v0, v0, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 4
    .line 5
    iget-object v0, v0, L۟/a9;->ۥ۟ۤ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    :try_start_0
    iget-object v4, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 18
    .line 19
    invoke-virtual {v4}, L۟/k4;->ۥ()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v4, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 27
    .line 28
    iget-object v4, v4, L۟/k4;->ۥ۟۠:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-virtual {v4, v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v1, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 38
    .line 39
    iget-object v1, v1, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 40
    .line 41
    iget-object v1, v1, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 42
    .line 43
    invoke-interface {v1}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, L۟/ab;->ۥ۟ۧ()Z

    .line 48
    .line 49
    .line 50
    move-result v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    :try_start_1
    iget-object v1, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 63
    .line 64
    iget-object v1, v1, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 65
    .line 66
    iget-object v1, v1, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 67
    .line 68
    invoke-interface {v1}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v1}, L۟/ab;->ۥ۠۠()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    :try_start_2
    invoke-virtual {p0}, L۟/k4$a;->ۥ()Ljava/util/HashSet;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v1}, L۟/ab;->ۥ۠۟()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    .line 82
    :try_start_3
    invoke-interface {v1}, L۟/ab;->ۥ()V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :catch_0
    move-exception v1

    .line 87
    goto :goto_1

    .line 88
    :catch_1
    move-exception v1

    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v3

    .line 91
    invoke-interface {v1}, L۟/ab;->ۥ()V

    .line 92
    .line 93
    .line 94
    throw v3
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    :catchall_1
    move-exception v1

    .line 96
    goto :goto_4

    .line 97
    :goto_1
    :try_start_4
    const-string v3, "ROOM"

    .line 98
    .line 99
    const-string v4, "Cannot run invalidation tracker. Is the db closed?"

    .line 100
    .line 101
    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 102
    .line 103
    .line 104
    :goto_2
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    iget-object v0, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 121
    .line 122
    iget-object v0, v0, L۟/k4;->ۥ۟ۤ:L۟/e9;

    .line 123
    .line 124
    monitor-enter v0

    .line 125
    :try_start_5
    iget-object v1, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 126
    .line 127
    iget-object v1, v1, L۟/k4;->ۥ۟ۤ:L۟/e9;

    .line 128
    .line 129
    invoke-virtual {v1}, L۟/e9;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, L۟/e9$c;

    .line 134
    .line 135
    invoke-virtual {v1}, L۟/e9$c;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_3

    .line 140
    .line 141
    monitor-exit v0

    .line 142
    goto :goto_3

    .line 143
    :cond_3
    invoke-virtual {v1}, L۟/e9$c;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    check-cast v1, Ljava/util/Map$Entry;

    .line 148
    .line 149
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, L۟/k4$d;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const/4 v1, 0x0

    .line 159
    throw v1

    .line 160
    :catchall_2
    move-exception v1

    .line 161
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 162
    throw v1

    .line 163
    :cond_4
    :goto_3
    return-void

    .line 164
    :goto_4
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 165
    .line 166
    .line 167
    iget-object v0, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    throw v1
.end method

.method public final ۥ()Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 7
    .line 8
    iget-object v1, v1, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 9
    .line 10
    new-instance v2, L۟/i4;

    .line 11
    .line 12
    const-string v3, "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"

    .line 13
    .line 14
    invoke-direct {v2, v3}, L۟/i4;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, L۟/a9;->ۥ۟ۥ(L۟/db;)Landroid/database/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, L۟/k4$a;->ۥ:L۟/k4;

    .line 50
    .line 51
    iget-object v1, v1, L۟/k4;->ۥ۟ۢ:L۟/eb;

    .line 52
    .line 53
    invoke-interface {v1}, L۟/eb;->ۥۣ۟()I

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 59
    .line 60
    .line 61
    throw v0
.end method
