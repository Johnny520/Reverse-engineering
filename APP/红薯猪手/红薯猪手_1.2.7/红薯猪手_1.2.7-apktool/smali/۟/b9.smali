.class public final L۟/b9;
.super L۟/bb$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/b9$b;,
        L۟/b9$a;
    }
.end annotation


# instance fields
.field public ۥ۟:L۟/f1;

.field public final ۥ۟۟:L۟/b9$a;

.field public final ۥ۟۠:Ljava/lang/String;

.field public final ۥ۟ۡ:Ljava/lang/String;


# direct methods
.method public constructor <init>(L۟/f1;Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget v0, p2, L۟/b9$a;->ۥ:I

    invoke-direct {p0, v0}, L۟/bb$a;-><init>(I)V

    iput-object p1, p0, L۟/b9;->ۥ۟:L۟/f1;

    iput-object p2, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    iput-object p3, p0, L۟/b9;->ۥ۟۠:Ljava/lang/String;

    iput-object p4, p0, L۟/b9;->ۥ۟ۡ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۥ۟()V
    .locals 0

    return-void
.end method

.method public final ۥ۟۟(L۟/b3;)V
    .locals 3

    .line 1
    const-string v0, "SELECT count(*) FROM sqlite_master WHERE name != \'android_metadata\'"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, L۟/b3;->ۥۣ۠(Ljava/lang/String;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, L۟/b9$a;->ۥ(L۟/b3;)V

    .line 29
    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, L۟/b9$a;->ۥ۟(L۟/b3;)L۟/b9$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-boolean v1, v0, L۟/b9$b;->ۥ:Z

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "Pre-packaged database has an invalid schema: "

    .line 47
    .line 48
    invoke-static {v1}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v0, v0, L۟/b9$b;->ۥ۟:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, L۟/b9;->ۥۣ۟(L۟/b3;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 69
    .line 70
    check-cast p1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;

    .line 71
    .line 72
    iget-object v0, p1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 73
    .line 74
    iget-object v0, v0, L۟/a9;->ۥ۟ۢ:Ljava/util/List;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    :goto_2
    if-ge v2, v0, :cond_3

    .line 83
    .line 84
    iget-object v1, p1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 85
    .line 86
    iget-object v1, v1, L۟/a9;->ۥ۟ۢ:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, L۟/a9$a;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    return-void

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public final ۥ۟۠(L۟/b3;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, L۟/b9;->ۥ۟ۢ(L۟/b3;II)V

    return-void
.end method

.method public final ۥ۟ۡ(L۟/b3;)V
    .locals 6

    .line 1
    const-string v0, "SELECT 1 FROM sqlite_master WHERE type = \'table\' AND name=\'room_master_table\'"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, L۟/b3;->ۥۣ۠(Ljava/lang/String;)Landroid/database/Cursor;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    new-instance v1, L۟/i4;

    .line 31
    .line 32
    const-string v4, "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"

    .line 33
    .line 34
    invoke-direct {v1, v4}, L۟/i4;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, L۟/b3;->ۥ۟ۢ(L۟/db;)Landroid/database/Cursor;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v4, v0

    .line 53
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, L۟/b9;->ۥ۟۠:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_4

    .line 63
    .line 64
    iget-object v1, p0, L۟/b9;->ۥ۟ۡ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v0, "Room cannot verify the data integrity. Looks like you\'ve changed schema but forgot to update the version number. You can simply fix this by increasing the version number."

    .line 76
    .line 77
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw p1

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_3
    iget-object v1, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 87
    .line 88
    invoke-virtual {v1, p1}, L۟/b9$a;->ۥ۟(L۟/b3;)L۟/b9$b;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-boolean v4, v1, L۟/b9$b;->ۥ:Z

    .line 93
    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    iget-object v1, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, L۟/b9;->ۥۣ۟(L۟/b3;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    :goto_2
    iget-object v1, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 105
    .line 106
    check-cast v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;

    .line 107
    .line 108
    iget-object v4, v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 109
    .line 110
    iput-object p1, v4, L۟/a9;->ۥ:L۟/ab;

    .line 111
    .line 112
    iget-object v4, v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 113
    .line 114
    iget-object v4, v4, L۟/a9;->ۥ۟۠:L۟/k4;

    .line 115
    .line 116
    monitor-enter v4

    .line 117
    :try_start_2
    iget-boolean v5, v4, L۟/k4;->ۥ۟ۡ:Z

    .line 118
    .line 119
    if-eqz v5, :cond_5

    .line 120
    .line 121
    const-string p1, "ROOM"

    .line 122
    .line 123
    const-string v3, "Invalidation tracker is initialized twice :/."

    .line 124
    .line 125
    invoke-static {p1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    const-string v5, "PRAGMA temp_store = MEMORY;"

    .line 130
    .line 131
    invoke-virtual {p1, v5}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v5, "PRAGMA recursive_triggers=\'ON\';"

    .line 135
    .line 136
    invoke-virtual {p1, v5}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v5, "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 140
    .line 141
    invoke-virtual {p1, v5}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4, p1}, L۟/k4;->ۥ۟۟(L۟/ab;)V

    .line 145
    .line 146
    .line 147
    const-string v5, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "

    .line 148
    .line 149
    invoke-virtual {p1, v5}, L۟/b3;->ۥ۟ۤ(Ljava/lang/String;)L۟/eb;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iput-object p1, v4, L۟/k4;->ۥ۟ۢ:L۟/eb;

    .line 154
    .line 155
    iput-boolean v3, v4, L۟/k4;->ۥ۟ۡ:Z

    .line 156
    .line 157
    :goto_3
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    iget-object p1, v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 159
    .line 160
    iget-object p1, p1, L۟/a9;->ۥ۟ۢ:Ljava/util/List;

    .line 161
    .line 162
    if-eqz p1, :cond_6

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    :goto_4
    if-ge v2, p1, :cond_6

    .line 169
    .line 170
    iget-object v3, v1, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;->ۥ۟:Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl;

    .line 171
    .line 172
    iget-object v3, v3, L۟/a9;->ۥ۟ۢ:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, L۟/a9$a;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    iput-object v0, p0, L۟/b9;->ۥ۟:L۟/f1;

    .line 187
    .line 188
    return-void

    .line 189
    :catchall_1
    move-exception p1

    .line 190
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    throw p1

    .line 192
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 193
    .line 194
    const-string v0, "Pre-packaged database has an invalid schema: "

    .line 195
    .line 196
    invoke-static {v0}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iget-object v1, v1, L۟/b9$b;->ۥ۟:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :catchall_2
    move-exception p1

    .line 214
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 215
    .line 216
    .line 217
    throw p1
.end method

.method public final ۥ۟ۢ(L۟/b3;II)V
    .locals 11

    .line 1
    iget-object v0, p0, L۟/b9;->ۥ۟:L۟/f1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    iget-object v0, v0, L۟/f1;->ۥ۟۠:L۟/a9$b;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    if-ne p2, p3, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    if-le p3, p2, :cond_1

    .line 21
    .line 22
    move v3, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v3, v2

    .line 25
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    move v5, p2

    .line 31
    :cond_2
    if-eqz v3, :cond_3

    .line 32
    .line 33
    if-ge v5, p3, :cond_a

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    if-le v5, p3, :cond_a

    .line 37
    .line 38
    :goto_1
    iget-object v6, v0, L۟/a9$b;->ۥ:Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/util/TreeMap;

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    if-nez v6, :cond_4

    .line 52
    .line 53
    goto :goto_6

    .line 54
    :cond_4
    if-eqz v3, :cond_5

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/util/TreeMap;->descendingKeySet()Ljava/util/NavigableSet;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    goto :goto_2

    .line 61
    :cond_5
    invoke-virtual {v6}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    :goto_2
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    if-eqz v9, :cond_9

    .line 74
    .line 75
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v3, :cond_7

    .line 86
    .line 87
    if-gt v9, p3, :cond_8

    .line 88
    .line 89
    if-le v9, v5, :cond_8

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_7
    if-lt v9, p3, :cond_8

    .line 93
    .line 94
    if-ge v9, v5, :cond_8

    .line 95
    .line 96
    :goto_3
    move v10, v1

    .line 97
    goto :goto_4

    .line 98
    :cond_8
    move v10, v2

    .line 99
    :goto_4
    if-eqz v10, :cond_6

    .line 100
    .line 101
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, L۟/t5;

    .line 110
    .line 111
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move v6, v1

    .line 115
    move v5, v9

    .line 116
    goto :goto_5

    .line 117
    :cond_9
    move v6, v2

    .line 118
    :goto_5
    if-nez v6, :cond_2

    .line 119
    .line 120
    :goto_6
    move-object v0, v7

    .line 121
    goto :goto_7

    .line 122
    :cond_a
    move-object v0, v4

    .line 123
    :goto_7
    if-eqz v0, :cond_10

    .line 124
    .line 125
    iget-object v3, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 126
    .line 127
    check-cast v3, Lcom/skyhand/redbookhelper/utils/sqllite/AppDatabase_Impl$a;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v3, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v4, "SELECT name FROM sqlite_master WHERE type = \'trigger\'"

    .line 138
    .line 139
    invoke-virtual {p1, v4}, L۟/b3;->ۥۣ۠(Ljava/lang/String;)Landroid/database/Cursor;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    :goto_8
    :try_start_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_b

    .line 148
    .line 149
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_b
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    :cond_c
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_d

    .line 169
    .line 170
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Ljava/lang/String;

    .line 175
    .line 176
    const-string v4, "room_fts_content_sync_"

    .line 177
    .line 178
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_c

    .line 183
    .line 184
    new-instance v4, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v5, "DROP TRIGGER IF EXISTS "

    .line 190
    .line 191
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {p1, v3}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_d
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_e

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, L۟/t5;

    .line 220
    .line 221
    invoke-virtual {v2, p1}, L۟/t5;->ۥ(L۟/b3;)V

    .line 222
    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_e
    iget-object v0, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 226
    .line 227
    invoke-virtual {v0, p1}, L۟/b9$a;->ۥ۟(L۟/b3;)L۟/b9$b;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-boolean v2, v0, L۟/b9$b;->ۥ:Z

    .line 232
    .line 233
    if-eqz v2, :cond_f

    .line 234
    .line 235
    iget-object v0, p0, L۟/b9;->ۥ۟۟:L۟/b9$a;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, p1}, L۟/b9;->ۥۣ۟(L۟/b3;)V

    .line 241
    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string p2, "Migration didn\'t properly handle: "

    .line 247
    .line 248
    invoke-static {p2}, L۟/c4;->ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    iget-object p3, v0, L۟/b9$b;->ۥ۟:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw p1

    .line 265
    :catchall_0
    move-exception p1

    .line 266
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 267
    .line 268
    .line 269
    throw p1

    .line 270
    :cond_10
    move v1, v2

    .line 271
    :goto_b
    if-eqz v1, :cond_11

    .line 272
    .line 273
    return-void

    .line 274
    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    const-string v1, "A migration from "

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string p2, " to "

    .line 290
    .line 291
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string p2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."

    .line 298
    .line 299
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw p1
.end method

.method public final ۥۣ۟(L۟/b3;)V
    .locals 3

    .line 1
    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, L۟/b9;->ۥ۟۠:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, "\')"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, L۟/b3;->ۥ۟۠(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
