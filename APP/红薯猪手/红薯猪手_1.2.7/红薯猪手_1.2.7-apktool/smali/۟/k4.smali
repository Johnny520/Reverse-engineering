.class public final L۟/k4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/k4$b;,
        L۟/k4$c;,
        L۟/k4$d;
    }
.end annotation


# static fields
.field public static final ۥ۟ۧ:[Ljava/lang/String;


# instance fields
.field public final ۥ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:[Ljava/lang/String;

.field public final ۥ۟۟:L۟/a9;

.field public ۥ۟۠:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public volatile ۥ۟ۡ:Z

.field public volatile ۥ۟ۢ:L۟/eb;

.field public final ۥۣ۟:L۟/k4$b;

.field public final ۥ۟ۤ:L۟/e9;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/e9<",
            "L\u06df/k4$c;",
            "L\u06df/k4$d;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟ۥ:Ljava/lang/Object;

.field public ۥ۟ۦ:L۟/k4$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "UPDATE"

    const-string v1, "DELETE"

    const-string v2, "INSERT"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, L۟/k4;->ۥ۟ۧ:[Ljava/lang/String;

    return-void
.end method

.method public varargs constructor <init>(L۟/a9;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p3, p0, L۟/k4;->ۥ۟۠:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v0, p0, L۟/k4;->ۥ۟ۡ:Z

    new-instance p3, L۟/e9;

    invoke-direct {p3}, L۟/e9;-><init>()V

    iput-object p3, p0, L۟/k4;->ۥ۟ۤ:L۟/e9;

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, L۟/k4;->ۥ۟ۥ:Ljava/lang/Object;

    new-instance p3, L۟/k4$a;

    invoke-direct {p3, p0}, L۟/k4$a;-><init>(L۟/k4;)V

    iput-object p3, p0, L۟/k4;->ۥ۟ۦ:L۟/k4$a;

    iput-object p1, p0, L۟/k4;->ۥ۟۟:L۟/a9;

    new-instance p1, L۟/k4$b;

    array-length p3, p4

    invoke-direct {p1, p3}, L۟/k4$b;-><init>(I)V

    iput-object p1, p0, L۟/k4;->ۥۣ۟:L۟/k4$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, L۟/k4;->ۥ:Ljava/util/HashMap;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    array-length p1, p4

    new-array p3, p1, [Ljava/lang/String;

    iput-object p3, p0, L۟/k4;->ۥ۟:[Ljava/lang/String;

    :goto_0
    if-ge v0, p1, :cond_1

    aget-object p3, p4, v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p3, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    iget-object v2, p0, L۟/k4;->ۥ:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, p3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v2, p4, v0

    invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-object p3, p0, L۟/k4;->ۥ۟:[Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p3, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, L۟/k4;->ۥ۟:[Ljava/lang/String;

    aput-object p3, v1, v0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    sget-object p4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, L۟/k4;->ۥ:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    iget-object p4, p0, L۟/k4;->ۥ:Ljava/util/HashMap;

    invoke-virtual {p4, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p4, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    return-void
.end method


# virtual methods
.method public final ۥ()Z
    .locals 3

    .line 1
    iget-object v0, p0, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 2
    .line 3
    iget-object v0, v0, L۟/a9;->ۥ:L۟/ab;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, L۟/ab;->isOpen()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    iget-boolean v0, p0, L۟/k4;->ۥ۟ۡ:Z

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 26
    .line 27
    iget-object v0, v0, L۟/a9;->ۥ۟۟:L۟/bb;

    .line 28
    .line 29
    invoke-interface {v0}, L۟/bb;->ۥ۠ۡ()L۟/ab;

    .line 30
    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, L۟/k4;->ۥ۟ۡ:Z

    .line 33
    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    const-string v0, "ROOM"

    .line 37
    .line 38
    const-string v1, "database is not initialized even though it is open"

    .line 39
    .line 40
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    return v2

    .line 44
    :cond_3
    return v1
.end method

.method public final ۥ۟(IL۟/ab;)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", 0)"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {p2, v0}, L۟/ab;->ۥ۟۠(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, L۟/k4;->ۥ۟:[Ljava/lang/String;

    .line 27
    .line 28
    aget-object v0, v0, p1

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v2, L۟/k4;->ۥ۟ۧ:[Ljava/lang/String;

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_0
    const/4 v5, 0x3

    .line 40
    if-ge v4, v5, :cond_0

    .line 41
    .line 42
    aget-object v5, v2, v4

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 45
    .line 46
    .line 47
    const-string v6, "CREATE TEMP TRIGGER IF NOT EXISTS "

    .line 48
    .line 49
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v6, "`"

    .line 53
    .line 54
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v7, "room_table_modification_trigger_"

    .line 58
    .line 59
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v7, "_"

    .line 66
    .line 67
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v6, " AFTER "

    .line 77
    .line 78
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v5, " ON `"

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v5, "` BEGIN UPDATE "

    .line 93
    .line 94
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v5, "room_table_modification_log"

    .line 98
    .line 99
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v5, " SET "

    .line 103
    .line 104
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v5, "invalidated"

    .line 108
    .line 109
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v6, " = 1"

    .line 113
    .line 114
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v6, " WHERE "

    .line 118
    .line 119
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v6, "table_id"

    .line 123
    .line 124
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string v6, " = "

    .line 128
    .line 129
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v6, " AND "

    .line 136
    .line 137
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v5, " = 0"

    .line 144
    .line 145
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v5, "; END"

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-interface {p2, v5}, L۟/ab;->ۥ۟۠(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_0
    return-void
.end method

.method public final ۥ۟۟(L۟/ab;)V
    .locals 13

    .line 1
    invoke-interface {p1}, L۟/ab;->ۥ۟ۧ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, L۟/k4;->ۥ۟۟:L۟/a9;

    .line 9
    .line 10
    iget-object v0, v0, L۟/a9;->ۥ۟ۤ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :try_start_1
    iget-object v1, p0, L۟/k4;->ۥ۟ۥ:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 22
    :try_start_2
    iget-object v2, p0, L۟/k4;->ۥۣ۟:L۟/k4$b;

    .line 23
    .line 24
    invoke-virtual {v2}, L۟/k4$b;->ۥ()[I

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 31
    :try_start_3
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    :try_start_4
    array-length v3, v2

    .line 36
    invoke-interface {p1}, L۟/ab;->ۥ۟ۨ()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    invoke-interface {p1}, L۟/ab;->ۥ۠۠()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-interface {p1}, L۟/ab;->ۥ۟()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 47
    .line 48
    .line 49
    :goto_0
    const/4 v4, 0x0

    .line 50
    move v5, v4

    .line 51
    :goto_1
    if-ge v5, v3, :cond_6

    .line 52
    .line 53
    :try_start_5
    aget v6, v2, v5

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    if-eq v6, v7, :cond_4

    .line 57
    .line 58
    const/4 v7, 0x2

    .line 59
    if-eq v6, v7, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-object v6, p0, L۟/k4;->ۥ۟:[Ljava/lang/String;

    .line 63
    .line 64
    aget-object v6, v6, v5

    .line 65
    .line 66
    new-instance v7, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    sget-object v8, L۟/k4;->ۥ۟ۧ:[Ljava/lang/String;

    .line 72
    .line 73
    move v9, v4

    .line 74
    :goto_2
    const/4 v10, 0x3

    .line 75
    if-ge v9, v10, :cond_5

    .line 76
    .line 77
    aget-object v10, v8, v9

    .line 78
    .line 79
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 80
    .line 81
    .line 82
    const-string v11, "DROP TRIGGER IF EXISTS "

    .line 83
    .line 84
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v11, "`"

    .line 88
    .line 89
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v12, "room_table_modification_trigger_"

    .line 93
    .line 94
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v12, "_"

    .line 101
    .line 102
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-interface {p1, v10}, L۟/ab;->ۥ۟۠(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v9, v9, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :catchall_0
    move-exception v2

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    invoke-virtual {p0, v5, p1}, L۟/k4;->ۥ۟(IL۟/ab;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    invoke-interface {p1}, L۟/ab;->ۥ۠۟()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 130
    .line 131
    .line 132
    :try_start_6
    invoke-interface {p1}, L۟/ab;->ۥ()V

    .line 133
    .line 134
    .line 135
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 136
    :try_start_7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :goto_4
    :try_start_8
    invoke-interface {p1}, L۟/ab;->ۥ()V

    .line 141
    .line 142
    .line 143
    throw v2

    .line 144
    :catchall_1
    move-exception p1

    .line 145
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 146
    :try_start_9
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 147
    :catchall_2
    move-exception p1

    .line 148
    :try_start_a
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 149
    .line 150
    .line 151
    throw p1
    :try_end_a
    .catch Ljava/lang/IllegalStateException; {:try_start_a .. :try_end_a} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_0

    .line 152
    :catch_0
    move-exception p1

    .line 153
    goto :goto_5

    .line 154
    :catch_1
    move-exception p1

    .line 155
    :goto_5
    const-string v0, "ROOM"

    .line 156
    .line 157
    const-string v1, "Cannot run invalidation tracker. Is the db closed?"

    .line 158
    .line 159
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 160
    .line 161
    .line 162
    :goto_6
    return-void
.end method
