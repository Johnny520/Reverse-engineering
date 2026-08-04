.class public abstract Lyyds/ᛴᲈᛱᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲇᲈᲇ;


# static fields
.field public static final synthetic ᲀᛲᛳᲀ:J

.field public static final synthetic ᲇᲈᛵᛷ:J


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛴᲈᛱᛷ;

    .line 4
    .line 5
    const-string v2, "_state$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    sput-wide v2, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 16
    .line 17
    const-string v2, "_parentHandle$volatile"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    sput-wide v0, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛳᲀ:J

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lyyds/ᛲᛷᛵᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛸᲇ;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lyyds/ᛲᛷᛵᲇ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛸᲇ;

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lyyds/ᛴᲈᛱᛷ;->_state$volatile:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public static ᛳᛷᛶᛲ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Lyyds/ᛶᛴᲀᛳ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛶᛴᲀᛳ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string p0, "Cancelling"

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛶᛴᲀᛳ;->ᲇᲇᲇᛱ()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    const-string p0, "Completing"

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of v0, p0, Lyyds/ᲀᲀᛶᛸ;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    check-cast p0, Lyyds/ᲀᲀᛶᛸ;

    .line 30
    .line 31
    invoke-interface {p0}, Lyyds/ᲀᲀᛶᛸ;->ᛲᲈᲁ()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    :cond_2
    const-string p0, "Active"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    const-string p0, "New"

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    instance-of p0, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 44
    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    const-string p0, "Cancelled"

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_5
    const-string p0, "Completed"

    .line 51
    .line 52
    return-object p0
.end method

.method public static ᛶᲀᲈᲇ(Lyyds/ᛳᲁᛱ;)Lyyds/ᲈᛳᛷᲁ;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛳᲁᛱ;->ᛷᛲᲈᛱ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛳᲁᛱ;->ᛷᲈᲈᲁ()Lyyds/ᛳᲁᛱ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛳᲁᛱ;->ᛲᛳᛶᲁ()Lyyds/ᛳᲁᛱ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lyyds/ᛳᲁᛱ;->ᛷᛲᲈᛱ()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    instance-of v0, p0, Lyyds/ᲈᛳᛷᲁ;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Lyyds/ᲈᛳᛷᲁ;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    instance-of v0, p0, Lyyds/ᛷᛳᲁᲈ;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final getKey()Lyyds/ᲁᛸᛲᲁ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final start()Z
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lyyds/ᛴᲈᛱᛷ;->ᲁᛵᲁᲁ(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲁᛶᛴᛸ()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/16 v2, 0x7b

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, Lyyds/ᛴᲈᛱᛷ;->ᛳᛷᛶᛲ(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v2, 0x7d

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x40

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lyyds/ᲇᛲᲁᛱ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public ᛱᛳᛶᛳ()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lyyds/ᲇᲁᲇᛵ;

    .line 2
    .line 3
    return p0
.end method

.method public final ᛱᛳᲇ(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    sget-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᛶᛳ()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lyyds/ᲀᲀᛶᛸ;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    instance-of v1, v0, Lyyds/ᛶᛴᲀᛳ;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lyyds/ᛶᛴᲀᛳ;

    .line 25
    .line 26
    invoke-virtual {v1}, Lyyds/ᛶᛴᲀᛳ;->ᲇᲇᲇᛱ()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v1, Lyyds/ᛲᛸᛶᛳ;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛸᲀᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v1, v4, v2}, Lyyds/ᛲᛸᛶᛳ;-><init>(Ljava/lang/Throwable;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Lyyds/ᛴᲈᛱᛷ;->ᛴᛸᛴᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 47
    .line 48
    if-eq v0, v1, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 52
    .line 53
    :goto_1
    sget-object v1, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_3
    sget-object v1, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 60
    .line 61
    if-ne v0, v1, :cond_13

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    move-object v1, v0

    .line 65
    :goto_2
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    instance-of v5, v4, Lyyds/ᛶᛴᲀᛳ;

    .line 70
    .line 71
    if-eqz v5, :cond_a

    .line 72
    .line 73
    monitor-enter v4

    .line 74
    :try_start_0
    move-object v5, v4

    .line 75
    check-cast v5, Lyyds/ᛶᛴᲀᛳ;

    .line 76
    .line 77
    sget-object v6, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 78
    .line 79
    sget-wide v7, Lyyds/ᛶᛴᲀᛳ;->ᲇᲈᛵᛷ:J

    .line 80
    .line 81
    invoke-virtual {v6, v5, v7, v8}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    sget-object v6, Lyyds/ᛲᛷᛵᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛲᛸᛴᛶ;

    .line 86
    .line 87
    if-ne v5, v6, :cond_4

    .line 88
    .line 89
    sget-object p1, Lyyds/ᛲᛷᛵᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    monitor-exit v4

    .line 92
    :goto_3
    move-object v6, p0

    .line 93
    move-object v0, p1

    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p0, v0

    .line 98
    goto :goto_4

    .line 99
    :cond_4
    :try_start_1
    move-object v5, v4

    .line 100
    check-cast v5, Lyyds/ᛶᛴᲀᛳ;

    .line 101
    .line 102
    invoke-virtual {v5}, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ()Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    if-nez v5, :cond_7

    .line 109
    .line 110
    :cond_5
    if-nez v1, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛸᲀᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_6
    move-object p1, v4

    .line 117
    check-cast p1, Lyyds/ᛶᛴᲀᛳ;

    .line 118
    .line 119
    invoke-virtual {p1, v1}, Lyyds/ᛶᛴᲀᛳ;->ᛵᛸᛸᛷ(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    move-object p1, v4

    .line 123
    check-cast p1, Lyyds/ᛶᛴᲀᛳ;

    .line 124
    .line 125
    invoke-virtual {p1}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    if-nez v5, :cond_8

    .line 130
    .line 131
    move-object v0, p1

    .line 132
    :cond_8
    monitor-exit v4

    .line 133
    if-eqz v0, :cond_9

    .line 134
    .line 135
    check-cast v4, Lyyds/ᛶᛴᲀᛳ;

    .line 136
    .line 137
    iget-object p1, v4, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᲁᲈ;

    .line 138
    .line 139
    invoke-virtual {p0, p1, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛲᲀᛵᛷ(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    sget-object p1, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :goto_4
    monitor-exit v4

    .line 146
    throw p0

    .line 147
    :cond_a
    instance-of v5, v4, Lyyds/ᲀᲀᛶᛸ;

    .line 148
    .line 149
    if-eqz v5, :cond_12

    .line 150
    .line 151
    if-nez v1, :cond_b

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛸᲀᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_b
    move-object v9, v4

    .line 158
    check-cast v9, Lyyds/ᲀᲀᛶᛸ;

    .line 159
    .line 160
    invoke-interface {v9}, Lyyds/ᲀᲀᛶᛸ;->ᛲᲈᲁ()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_f

    .line 165
    .line 166
    invoke-virtual {p0, v9}, Lyyds/ᛴᲈᛱᛷ;->ᛸᛸᛷᛱ(Lyyds/ᲀᲀᛶᛸ;)Lyyds/ᛷᛳᲁᲈ;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    if-nez v11, :cond_c

    .line 171
    .line 172
    move-object v6, p0

    .line 173
    goto :goto_7

    .line 174
    :cond_c
    new-instance v10, Lyyds/ᛶᛴᲀᛳ;

    .line 175
    .line 176
    invoke-direct {v10, v11, v1}, Lyyds/ᛶᛴᲀᛳ;-><init>(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :goto_5
    sget-object v5, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 180
    .line 181
    sget-wide v7, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 182
    .line 183
    move-object v6, p0

    .line 184
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_d

    .line 189
    .line 190
    invoke-virtual {v6, v11, v1}, Lyyds/ᛴᲈᛱᛷ;->ᛲᲀᛵᛷ(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 194
    .line 195
    :goto_6
    move-object v0, p0

    .line 196
    goto :goto_8

    .line 197
    :cond_d
    invoke-virtual {v5, v6, v7, v8}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-eq p0, v9, :cond_e

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_e
    move-object p0, v6

    .line 205
    goto :goto_5

    .line 206
    :cond_f
    move-object v6, p0

    .line 207
    new-instance p0, Lyyds/ᛲᛸᛶᛳ;

    .line 208
    .line 209
    invoke-direct {p0, v1, v2}, Lyyds/ᛲᛸᛶᛳ;-><init>(Ljava/lang/Throwable;Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6, v4, p0}, Lyyds/ᛴᲈᛱᛷ;->ᛴᛸᛴᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    sget-object v5, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 217
    .line 218
    if-eq p0, v5, :cond_11

    .line 219
    .line 220
    sget-object v4, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 221
    .line 222
    if-eq p0, v4, :cond_10

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_10
    :goto_7
    move-object p0, v6

    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :cond_11
    const-string p0, "Cannot happen in "

    .line 229
    .line 230
    invoke-static {v4, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return v2

    .line 234
    :cond_12
    move-object v6, p0

    .line 235
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_13
    move-object v6, p0

    .line 239
    :goto_8
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 240
    .line 241
    if-ne v0, p0, :cond_14

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_14
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 245
    .line 246
    if-ne v0, p0, :cond_15

    .line 247
    .line 248
    :goto_9
    return v3

    .line 249
    :cond_15
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 250
    .line 251
    if-ne v0, p0, :cond_16

    .line 252
    .line 253
    return v2

    .line 254
    :cond_16
    invoke-virtual {v6, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return v3
.end method

.method public ᛱᛸᲁᲇ()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lyyds/ᛳᲁᛴᲀ;

    .line 2
    .line 3
    return p0
.end method

.method public final ᛱᲀᲈᛲ(Lyyds/ᛴᲀᛴᛵ;)V
    .locals 14

    .line 1
    new-instance v5, Lyyds/ᛷᛳᲁᲈ;

    .line 2
    .line 3
    invoke-direct {v5}, Lyyds/ᛳᲁᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lyyds/ᛳᲁᛱ;->ᲇᲈᛵᛷ:J

    .line 9
    .line 10
    invoke-virtual {v0, v5, v1, v2, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-wide v6, Lyyds/ᛳᲁᛱ;->ᲀᛲᛳᲀ:J

    .line 14
    .line 15
    invoke-virtual {v0, v5, v6, v7, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p1}, Lyyds/ᛳᲁᛱ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq v0, p1, :cond_0

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :goto_1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 27
    .line 28
    sget-wide v2, Lyyds/ᛳᲁᛱ;->ᲀᛲᛳᲀ:J

    .line 29
    .line 30
    move-object v4, p1

    .line 31
    move-object v1, p1

    .line 32
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Lyyds/ᛳᲁᛱ;->ᛶᛷᛲᲁ(Lyyds/ᛳᲁᛱ;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    invoke-virtual {v1}, Lyyds/ᛳᲁᛱ;->ᛲᛳᛶᲁ()Lyyds/ᛳᲁᛱ;

    .line 42
    .line 43
    .line 44
    move-result-object v13

    .line 45
    :goto_3
    sget-object v8, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v10, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 48
    .line 49
    move-object v9, p0

    .line 50
    move-object v12, v1

    .line 51
    invoke-virtual/range {v8 .. v13}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_1
    invoke-virtual {v8, v9, v10, v11}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eq p0, v1, :cond_2

    .line 63
    .line 64
    :goto_4
    return-void

    .line 65
    :cond_2
    move-object p0, v9

    .line 66
    goto :goto_3

    .line 67
    :cond_3
    move-object v9, p0

    .line 68
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    move-object p1, v1

    .line 73
    if-eq p0, v1, :cond_4

    .line 74
    .line 75
    move-object p0, v9

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    move-object p0, v9

    .line 78
    goto :goto_1
.end method

.method public final ᛲᛱᲁᛳ(ZLyyds/ᛴᲀᛴᛵ;)Lyyds/ᛴᲇᛲᛱ;
    .locals 6

    .line 1
    iput-object p0, p2, Lyyds/ᛴᲀᛴᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    instance-of v0, v4, Lyyds/ᲈᛳᛸᲇ;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    move-object v0, v4

    .line 12
    check-cast v0, Lyyds/ᲈᛳᛸᲇ;

    .line 13
    .line 14
    iget-boolean v1, v0, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :goto_1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v2, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    move-object v5, p2

    .line 24
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eq p0, v4, :cond_1

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_1
    move-object p0, v1

    .line 39
    move-object p2, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v1, p0

    .line 42
    move-object v5, p2

    .line 43
    invoke-virtual {v1, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛴᛱᛲ(Lyyds/ᲈᛳᛸᲇ;)V

    .line 44
    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_3
    move-object v1, p0

    .line 48
    move-object v5, p2

    .line 49
    instance-of p0, v4, Lyyds/ᲀᲀᛶᛸ;

    .line 50
    .line 51
    sget-object p2, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    if-eqz p0, :cond_a

    .line 55
    .line 56
    move-object p0, v4

    .line 57
    check-cast p0, Lyyds/ᲀᲀᛶᛸ;

    .line 58
    .line 59
    invoke-interface {p0}, Lyyds/ᲀᲀᛶᛸ;->ᲇᲈᛵᛷ()Lyyds/ᛷᛳᲁᲈ;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    check-cast v4, Lyyds/ᛴᲀᛴᛵ;

    .line 66
    .line 67
    invoke-virtual {v1, v4}, Lyyds/ᛴᲈᛱᛷ;->ᛱᲀᲈᛲ(Lyyds/ᛴᲀᛴᛵ;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_4
    invoke-virtual {v5}, Lyyds/ᛴᲀᛴᛵ;->ᛷᛵᲇᲀ()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_8

    .line 76
    .line 77
    instance-of v3, p0, Lyyds/ᛶᛴᲀᛳ;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    check-cast p0, Lyyds/ᛶᛴᲀᛳ;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    move-object p0, v0

    .line 85
    :goto_2
    if-eqz p0, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :cond_6
    if-nez v0, :cond_7

    .line 92
    .line 93
    const/4 p0, 0x5

    .line 94
    invoke-virtual {v2, v5, p0}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    goto :goto_3

    .line 99
    :cond_7
    if-eqz p1, :cond_d

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Lyyds/ᛴᲀᛴᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    return-object p2

    .line 105
    :cond_8
    const/4 p0, 0x1

    .line 106
    invoke-virtual {v2, v5, p0}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    :goto_3
    if-eqz p0, :cond_9

    .line 111
    .line 112
    :goto_4
    return-object v5

    .line 113
    :cond_9
    :goto_5
    move-object p0, v1

    .line 114
    move-object p2, v5

    .line 115
    goto :goto_0

    .line 116
    :cond_a
    if-eqz p1, :cond_d

    .line 117
    .line 118
    invoke-virtual {v1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    instance-of p1, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 123
    .line 124
    if-eqz p1, :cond_b

    .line 125
    .line 126
    check-cast p0, Lyyds/ᛲᛸᛶᛳ;

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_b
    move-object p0, v0

    .line 130
    :goto_6
    if-eqz p0, :cond_c

    .line 131
    .line 132
    iget-object v0, p0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 133
    .line 134
    :cond_c
    invoke-virtual {v5, v0}, Lyyds/ᛴᲀᛴᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_d
    return-object p2
.end method

.method public ᛲᛲᲈᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public ᛲᛳᛴᛸ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public ᛲᛳᛶᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛲᛶᛱᲈ(Lyyds/ᛶᛴᲀᛳ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lyyds/ᛲᛸᛶᛳ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p2

    .line 7
    check-cast v0, Lyyds/ᛲᛸᛶᛳ;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 14
    .line 15
    :cond_1
    monitor-enter p1

    .line 16
    :try_start_0
    invoke-virtual {p1}, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ()Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Lyyds/ᛶᛴᲀᛳ;->ᛶᛷᛲᲁ(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, p1, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛵᲀᛵᛸ(Lyyds/ᛶᛴᲀᛳ;Ljava/util/ArrayList;)Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    :try_start_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-gt v3, v4, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 42
    .line 43
    invoke-direct {v4, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ljava/lang/Throwable;

    .line 65
    .line 66
    if-eq v4, v2, :cond_3

    .line 67
    .line 68
    if-eq v4, v2, :cond_3

    .line 69
    .line 70
    instance-of v5, v4, Ljava/util/concurrent/CancellationException;

    .line 71
    .line 72
    if-nez v5, :cond_3

    .line 73
    .line 74
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_3

    .line 79
    .line 80
    invoke-static {v2, v4}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p0, v0

    .line 86
    move-object v6, p1

    .line 87
    goto :goto_6

    .line 88
    :cond_4
    :goto_2
    monitor-exit p1

    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_5
    if-ne v2, v1, :cond_6

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    new-instance p2, Lyyds/ᛲᛸᛶᛳ;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-direct {p2, v2, v0}, Lyyds/ᛲᛸᛶᛳ;-><init>(Ljava/lang/Throwable;Z)V

    .line 99
    .line 100
    .line 101
    :goto_3
    if-eqz v2, :cond_8

    .line 102
    .line 103
    invoke-virtual {p0, v2}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Throwable;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p0, v2}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛴᲁᲈ(Ljava/lang/Throwable;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    :cond_7
    move-object v2, p2

    .line 116
    check-cast v2, Lyyds/ᛲᛸᛶᛳ;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 122
    .line 123
    sget-wide v3, Lyyds/ᛲᛸᛶᛳ;->ᛵᛸᛸᛷ:J

    .line 124
    .line 125
    const/4 v5, 0x0

    .line 126
    const/4 v6, 0x1

    .line 127
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 128
    .line 129
    .line 130
    :cond_8
    invoke-virtual {p0, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛷᛴᛴᲁ(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    instance-of v0, p2, Lyyds/ᲀᲀᛶᛸ;

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    new-instance v0, Lyyds/ᲇᛵᲇ;

    .line 138
    .line 139
    move-object v1, p2

    .line 140
    check-cast v1, Lyyds/ᲀᲀᛶᛸ;

    .line 141
    .line 142
    invoke-direct {v0, v1}, Lyyds/ᲇᛵᲇ;-><init>(Lyyds/ᲀᲀᛶᛸ;)V

    .line 143
    .line 144
    .line 145
    move-object v7, v0

    .line 146
    goto :goto_4

    .line 147
    :cond_9
    move-object v7, p2

    .line 148
    :goto_4
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 149
    .line 150
    sget-wide v4, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 151
    .line 152
    move-object v3, p0

    .line 153
    move-object v6, p1

    .line 154
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-eqz p0, :cond_a

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_a
    invoke-virtual {v2, v3, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-eq p0, v6, :cond_b

    .line 166
    .line 167
    :goto_5
    invoke-virtual {v3, v6, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛶᲈᛴᲈ(Lyyds/ᲀᲀᛶᛸ;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    return-object p2

    .line 171
    :cond_b
    move-object p0, v3

    .line 172
    move-object p1, v6

    .line 173
    goto :goto_4

    .line 174
    :catchall_1
    move-exception v0

    .line 175
    move-object v6, p1

    .line 176
    move-object p0, v0

    .line 177
    :goto_6
    monitor-exit v6

    .line 178
    throw p0
.end method

.method public ᛲᲀᛲᛲ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛲᲀᛵᛷ(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    new-instance v0, Lyyds/ᲀᛷᛲᛷ;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᲀᛷᛲᛷ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lyyds/ᛳᲁᛱ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lyyds/ᛳᲁᛱ;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    instance-of v2, v0, Lyyds/ᛴᲀᛴᛵ;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    check-cast v2, Lyyds/ᛴᲀᛴᛵ;

    .line 29
    .line 30
    invoke-virtual {v2}, Lyyds/ᛴᲀᛴᛵ;->ᛷᛵᲇᲀ()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    :try_start_0
    move-object v2, v0

    .line 37
    check-cast v2, Lyyds/ᛴᲀᛴᛵ;

    .line 38
    .line 39
    invoke-virtual {v2, p2}, Lyyds/ᛴᲀᛴᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-static {v1, v2}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance v1, Lyyds/ᛸᛳᛵᛳ;

    .line 51
    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v4, "Exception in completion handler "

    .line 55
    .line 56
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v4, " for "

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {v1, v3, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_1
    invoke-virtual {v0}, Lyyds/ᛳᲁᛱ;->ᛲᛳᛶᲁ()Lyyds/ᛳᲁᛱ;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lyyds/ᛴᲈᛱᛷ;->ᛷᲇᛲᛱ(Lyyds/ᛸᛳᛵᛳ;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p0, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛳᛶᛵ(Ljava/lang/Throwable;)Z

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public ᛲᲈᲁ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lyyds/ᲀᲀᛶᛸ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lyyds/ᲀᲀᛶᛸ;

    .line 10
    .line 11
    invoke-interface {p0}, Lyyds/ᲀᲀᛶᛸ;->ᛲᲈᲁ()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public ᛳᛸᛴᛶ(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᲇ(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛲᛳᛴᛸ()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᛱᲈᲁ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛴᛸᛴᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lyyds/ᲀᲀᛶᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p1, Lyyds/ᲈᛳᛸᲇ;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    instance-of v0, p1, Lyyds/ᛴᲀᛴᛵ;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object v2, p0

    .line 18
    goto :goto_2

    .line 19
    :cond_2
    :goto_0
    instance-of v0, p1, Lyyds/ᲈᛳᛷᲁ;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    instance-of v0, p2, Lyyds/ᛲᛸᛶᛳ;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, Lyyds/ᲀᲀᛶᛸ;

    .line 29
    .line 30
    instance-of p1, p2, Lyyds/ᲀᲀᛶᛸ;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    new-instance p1, Lyyds/ᲇᛵᲇ;

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, Lyyds/ᲀᲀᛶᛸ;

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lyyds/ᲇᛵᲇ;-><init>(Lyyds/ᲀᲀᛶᛸ;)V

    .line 40
    .line 41
    .line 42
    move-object v6, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move-object v6, p2

    .line 45
    :goto_1
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v3, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 48
    .line 49
    move-object v2, p0

    .line 50
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_4

    .line 55
    .line 56
    invoke-virtual {v2, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛷᛴᛴᲁ(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v5, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛶᲈᛴᲈ(Lyyds/ᲀᲀᛶᛸ;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p2

    .line 63
    :cond_4
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eq p0, v5, :cond_5

    .line 68
    .line 69
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_5
    move-object p0, v2

    .line 73
    goto :goto_1

    .line 74
    :goto_2
    move-object v11, p1

    .line 75
    check-cast v11, Lyyds/ᲀᲀᛶᛸ;

    .line 76
    .line 77
    invoke-virtual {v2, v11}, Lyyds/ᛴᲈᛱᛷ;->ᛸᛸᛷᛱ(Lyyds/ᲀᲀᛶᛸ;)Lyyds/ᛷᛳᲁᲈ;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-nez p0, :cond_6

    .line 82
    .line 83
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_6
    instance-of p1, v11, Lyyds/ᛶᛴᲀᛳ;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    move-object p1, v11

    .line 92
    check-cast p1, Lyyds/ᛶᛴᲀᛳ;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    move-object p1, v0

    .line 96
    :goto_3
    if-nez p1, :cond_8

    .line 97
    .line 98
    new-instance p1, Lyyds/ᛶᛴᲀᛳ;

    .line 99
    .line 100
    invoke-direct {p1, p0, v0}, Lyyds/ᛶᛴᲀᛳ;-><init>(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :cond_8
    move-object v12, p1

    .line 104
    monitor-enter v12

    .line 105
    :try_start_0
    invoke-virtual {v12}, Lyyds/ᛶᛴᲀᛳ;->ᲇᲇᲇᛱ()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_9

    .line 110
    .line 111
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    monitor-exit v12

    .line 114
    return-object p0

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    move-object p0, v0

    .line 117
    goto/16 :goto_6

    .line 118
    .line 119
    :cond_9
    :try_start_1
    sget-object p1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 120
    .line 121
    sget-wide v3, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ:J

    .line 122
    .line 123
    const/4 v1, 0x1

    .line 124
    invoke-virtual {p1, v12, v3, v4, v1}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    .line 125
    .line 126
    .line 127
    if-eq v12, v11, :cond_c

    .line 128
    .line 129
    :cond_a
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 130
    .line 131
    sget-wide v9, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 132
    .line 133
    move-object v8, v2

    .line 134
    invoke-virtual/range {v7 .. v12}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    move-object v2, v8

    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_b
    invoke-virtual {v7, v2, v9, v10}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    if-eq p1, v11, :cond_a

    .line 147
    .line 148
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    monitor-exit v12

    .line 151
    return-object p0

    .line 152
    :cond_c
    :goto_4
    :try_start_2
    invoke-virtual {v12}, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    instance-of v1, p2, Lyyds/ᛲᛸᛶᛳ;

    .line 157
    .line 158
    if-eqz v1, :cond_d

    .line 159
    .line 160
    move-object v1, p2

    .line 161
    check-cast v1, Lyyds/ᛲᛸᛶᛳ;

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_d
    move-object v1, v0

    .line 165
    :goto_5
    if-eqz v1, :cond_e

    .line 166
    .line 167
    iget-object v1, v1, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 168
    .line 169
    invoke-virtual {v12, v1}, Lyyds/ᛶᛴᲀᛳ;->ᛵᛸᛸᛷ(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :cond_e
    invoke-virtual {v12}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 173
    .line 174
    .line 175
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 176
    if-nez p1, :cond_f

    .line 177
    .line 178
    move-object v0, v1

    .line 179
    :cond_f
    monitor-exit v12

    .line 180
    if-eqz v0, :cond_10

    .line 181
    .line 182
    invoke-virtual {v2, p0, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛲᲀᛵᛷ(Lyyds/ᛷᛳᲁᲈ;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    :cond_10
    invoke-static {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛶᲀᲈᲇ(Lyyds/ᛳᲁᛱ;)Lyyds/ᲈᛳᛷᲁ;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_11

    .line 190
    .line 191
    invoke-virtual {v2, v12, p1, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛵᲈᲇᛵ(Lyyds/ᛶᛴᲀᛳ;Lyyds/ᲈᛳᛷᲁ;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_11

    .line 196
    .line 197
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 198
    .line 199
    return-object p0

    .line 200
    :cond_11
    new-instance p1, Lyyds/ᲀᛷᛲᛷ;

    .line 201
    .line 202
    const/4 v0, 0x2

    .line 203
    invoke-direct {p1, v0}, Lyyds/ᲀᛷᛲᛷ;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1, v0}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 207
    .line 208
    .line 209
    invoke-static {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛶᲀᲈᲇ(Lyyds/ᛳᲁᛱ;)Lyyds/ᲈᛳᛷᲁ;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    if-eqz p0, :cond_12

    .line 214
    .line 215
    invoke-virtual {v2, v12, p0, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛵᲈᲇᛵ(Lyyds/ᛶᛴᲀᛳ;Lyyds/ᲈᛳᛷᲁ;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_12

    .line 220
    .line 221
    sget-object p0, Lyyds/ᛲᛷᛵᲇ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛸᛴᛶ;

    .line 222
    .line 223
    return-object p0

    .line 224
    :cond_12
    invoke-virtual {v2, v12, p2}, Lyyds/ᛴᲈᛱᛷ;->ᛲᛶᛱᲈ(Lyyds/ᛶᛴᲀᛳ;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :goto_6
    monitor-exit v12

    .line 230
    throw p0
.end method

.method public final ᛵᛶᛲᲀ()Ljava/util/concurrent/CancellationException;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lyyds/ᛶᛴᲀᛳ;

    .line 6
    .line 7
    const-string v2, "Job is still new or active: "

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    check-cast v0, Lyyds/ᛶᛴᲀᛳ;

    .line 13
    .line 14
    invoke-virtual {v0}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, " is cancelling"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v3, v0

    .line 39
    check-cast v3, Ljava/util/concurrent/CancellationException;

    .line 40
    .line 41
    :cond_0
    if-nez v3, :cond_1

    .line 42
    .line 43
    new-instance v2, Lyyds/ᲀᲀᛱᛱ;

    .line 44
    .line 45
    invoke-direct {v2, v1, v0, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_1
    return-object v3

    .line 50
    :cond_2
    invoke-static {p0, v2}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_3
    instance-of v1, v0, Lyyds/ᲀᲀᛶᛸ;

    .line 55
    .line 56
    if-nez v1, :cond_7

    .line 57
    .line 58
    instance-of v1, v0, Lyyds/ᛲᛸᛶᛳ;

    .line 59
    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    check-cast v0, Lyyds/ᛲᛸᛶᛳ;

    .line 63
    .line 64
    iget-object v0, v0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 65
    .line 66
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    check-cast v3, Ljava/util/concurrent/CancellationException;

    .line 72
    .line 73
    :cond_4
    if-nez v3, :cond_5

    .line 74
    .line 75
    new-instance v1, Lyyds/ᲀᲀᛱᛱ;

    .line 76
    .line 77
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛲᲇ()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2, v0, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_5
    return-object v3

    .line 86
    :cond_6
    new-instance v0, Lyyds/ᲀᲀᛱᛱ;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v2, " has completed normally"

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-direct {v0, v1, v3, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_7
    invoke-static {p0, v2}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v3
.end method

.method public final ᛵᲀᛵᛸ(Lyyds/ᛶᛴᲀᛳ;Ljava/util/ArrayList;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lyyds/ᛶᛴᲀᛳ;->ᛲᛴᛳᛲ()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    new-instance p1, Lyyds/ᲀᲀᛱᛱ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛲᲇ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-direct {p1, p2, v1, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    return-object v1

    .line 25
    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    move-object v0, p1

    .line 40
    check-cast v0, Ljava/lang/Throwable;

    .line 41
    .line 42
    instance-of v0, v0, Ljava/util/concurrent/CancellationException;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move-object p1, v1

    .line 48
    :goto_0
    check-cast p1, Ljava/lang/Throwable;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_4
    const/4 p0, 0x0

    .line 54
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Throwable;

    .line 59
    .line 60
    instance-of p1, p0, Lyyds/ᛶᛱᛴᲁ;

    .line 61
    .line 62
    if-eqz p1, :cond_7

    .line 63
    .line 64
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_6

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    move-object v0, p2

    .line 79
    check-cast v0, Ljava/lang/Throwable;

    .line 80
    .line 81
    if-eq v0, p0, :cond_5

    .line 82
    .line 83
    instance-of v0, v0, Lyyds/ᛶᛱᛴᲁ;

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    move-object v1, p2

    .line 88
    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    .line 89
    .line 90
    if-eqz v1, :cond_7

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_7
    return-object p0
.end method

.method public final ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lyyds/ᲀᲀᛱᛱ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛲᲇ()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v0, v1, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᲇ(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final ᛵᲈᲇᛵ(Lyyds/ᛶᛴᲀᛳ;Lyyds/ᲈᛳᛷᲁ;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p2, Lyyds/ᲈᛳᛷᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲈᛱᛷ;

    .line 2
    .line 3
    new-instance v1, Lyyds/ᛸᛸᛶᲀ;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2, p3}, Lyyds/ᛸᛸᛶᲀ;-><init>(Lyyds/ᛴᲈᛱᛷ;Lyyds/ᛶᛴᲀᛳ;Lyyds/ᲈᛳᛷᲁ;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v1}, Lyyds/ᛷᛸ;->ᛷᲈᲈᲁ(Lyyds/ᲈᲇᲈᲇ;ZLyyds/ᛴᲀᛴᛵ;)Lyyds/ᛴᲇᛲᛱ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    invoke-static {p2}, Lyyds/ᛴᲈᛱᛷ;->ᛶᲀᲈᲇ(Lyyds/ᛳᲁᛱ;)Lyyds/ᲈᛳᛷᲁ;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    return v2
.end method

.method public final ᛶᛳᛶᛵ(Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛸᲁᲇ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 9
    .line 10
    sget-object v1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v2, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛳᲀ:J

    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lyyds/ᲁᲁᛴᛷ;

    .line 19
    .line 20
    if-eqz p0, :cond_4

    .line 21
    .line 22
    sget-object v1, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 23
    .line 24
    if-ne p0, v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-interface {p0, p1}, Lyyds/ᲁᲁᛴᛷ;->ᲀᛲᛳᲀ(Ljava/lang/Throwable;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_3

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_4
    :goto_1
    return v0
.end method

.method public final ᛶᛴᛱᛲ(Lyyds/ᲈᛳᛸᲇ;)V
    .locals 8

    .line 1
    new-instance v0, Lyyds/ᛷᛳᲁᲈ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛳᲁᛱ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p1, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v7, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lyyds/ᛸᛶᛳᛶ;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lyyds/ᛸᛶᛳᛶ;-><init>(Lyyds/ᛷᛳᲁᲈ;)V

    .line 15
    .line 16
    .line 17
    move-object v7, v1

    .line 18
    :goto_0
    sget-object v2, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v4, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 21
    .line 22
    move-object v3, p0

    .line 23
    move-object v6, p1

    .line 24
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v2, v3, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eq p0, v6, :cond_2

    .line 36
    .line 37
    :goto_1
    return-void

    .line 38
    :cond_2
    move-object p0, v3

    .line 39
    move-object p1, v6

    .line 40
    goto :goto_0
.end method

.method public ᛶᛷᛲᲁ()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲈᲀᛲᲀ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛶᛸᲀᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    :goto_0
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    new-instance p1, Lyyds/ᲀᲀᛱᛱ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛲᲇ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p1, v0, v1, p0}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-object p1

    .line 24
    :cond_2
    check-cast p1, Lyyds/ᛴᲈᛱᛷ;

    .line 25
    .line 26
    invoke-virtual {p1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    instance-of v0, p0, Lyyds/ᛶᛴᲀᛳ;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    check-cast v0, Lyyds/ᛶᛴᲀᛳ;

    .line 36
    .line 37
    invoke-virtual {v0}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    instance-of v0, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    move-object v0, p0

    .line 47
    check-cast v0, Lyyds/ᛲᛸᛶᛳ;

    .line 48
    .line 49
    iget-object v0, v0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    instance-of v0, p0, Lyyds/ᲀᲀᛶᛸ;

    .line 53
    .line 54
    if-nez v0, :cond_7

    .line 55
    .line 56
    move-object v0, v1

    .line 57
    :goto_1
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    move-object v1, v0

    .line 62
    check-cast v1, Ljava/util/concurrent/CancellationException;

    .line 63
    .line 64
    :cond_5
    if-nez v1, :cond_6

    .line 65
    .line 66
    new-instance v1, Lyyds/ᲀᲀᛱᛱ;

    .line 67
    .line 68
    invoke-static {p0}, Lyyds/ᛴᲈᛱᛷ;->ᛳᛷᛶᛲ(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v2, "Parent job is "

    .line 73
    .line 74
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v1, p0, v0, p1}, Lyyds/ᲀᲀᛱᛱ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lyyds/ᛴᲈᛱᛷ;)V

    .line 79
    .line 80
    .line 81
    :cond_6
    return-object v1

    .line 82
    :cond_7
    const-string p1, "Cannot be cancelling child in this state: "

    .line 83
    .line 84
    invoke-static {p0, p1}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method public final ᛶᲈᛴᲈ(Lyyds/ᲀᲀᛶᛸ;Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛳᲀ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    check-cast v3, Lyyds/ᲁᲁᛴᛷ;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-interface {v3}, Lyyds/ᛴᲇᛲᛱ;->ᛵᛸᛸᛷ()V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 17
    .line 18
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    instance-of v0, p2, Lyyds/ᛲᛸᛶᛳ;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p2, Lyyds/ᛲᛸᛶᛳ;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object p2, v1

    .line 30
    :goto_0
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p2, p2, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object p2, v1

    .line 36
    :goto_1
    instance-of v0, p1, Lyyds/ᛴᲀᛴᛵ;

    .line 37
    .line 38
    const-string v2, " for "

    .line 39
    .line 40
    const-string v3, "Exception in completion handler "

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    :try_start_0
    move-object v0, p1

    .line 45
    check-cast v0, Lyyds/ᛴᲀᛴᛵ;

    .line 46
    .line 47
    invoke-virtual {v0, p2}, Lyyds/ᛴᲀᛴᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    new-instance v0, Lyyds/ᛸᛳᛵᛳ;

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛷᲇᛲᛱ(Lyyds/ᛸᛳᛵᛳ;)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    invoke-interface {p1}, Lyyds/ᲀᲀᛶᛸ;->ᲇᲈᛵᛷ()Lyyds/ᛷᛳᲁᲈ;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    new-instance v0, Lyyds/ᲀᛷᛲᛷ;

    .line 86
    .line 87
    const/4 v4, 0x1

    .line 88
    invoke-direct {v0, v4}, Lyyds/ᲀᛷᛲᛷ;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0, v4}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lyyds/ᛳᲁᛱ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lyyds/ᛳᲁᛱ;

    .line 99
    .line 100
    :goto_2
    invoke-static {v0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    instance-of v4, v0, Lyyds/ᛴᲀᛴᛵ;

    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    :try_start_1
    move-object v4, v0

    .line 111
    check-cast v4, Lyyds/ᛴᲀᛴᛵ;

    .line 112
    .line 113
    invoke-virtual {v4, p2}, Lyyds/ᛴᲀᛴᛵ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :catchall_1
    move-exception v4

    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    invoke-static {v1, v4}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    new-instance v1, Lyyds/ᛸᛳᛵᛳ;

    .line 125
    .line 126
    new-instance v5, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-direct {v1, v5, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_5
    :goto_3
    invoke-virtual {v0}, Lyyds/ᛳᲁᛱ;->ᛲᛳᛶᲁ()Lyyds/ᛳᲁᛱ;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    goto :goto_2

    .line 152
    :cond_6
    if-eqz v1, :cond_7

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Lyyds/ᛴᲈᛱᛷ;->ᛷᲇᛲᛱ(Lyyds/ᛸᛳᛵᛳ;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_4
    return-void
.end method

.method public ᛷᛴᛴᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lyyds/ᛷᛶᛷᛵ;->ᲇᲇᲇᛱ(Lyyds/ᲁᛶᛱᛴ;Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public ᛷᲇᛲᛱ(Lyyds/ᛸᛳᛵᛳ;)V
    .locals 0

    .line 1
    throw p1
.end method

.method public final native ᛷᲈᲈᲁ(ZZLyyds/ᲈᛳᲀᲈ;)Lyyds/ᛴᲇᛲᛱ;
.end method

.method public final ᛸᛴᛵᛶ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛴᛸᛴᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lyyds/ᛲᛷᛵᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 10
    .line 11
    if-ne v0, v1, :cond_3

    .line 12
    .line 13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "Job "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, " is already complete or completing, but is being completed with "

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    instance-of v1, p1, Lyyds/ᛲᛸᛶᛳ;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast p1, Lyyds/ᛲᛸᛶᛳ;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p1, v2

    .line 46
    :goto_0
    if-eqz p1, :cond_2

    .line 47
    .line 48
    iget-object v2, p1, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 49
    .line 50
    :cond_2
    invoke-direct {v0, p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_3
    sget-object v1, Lyyds/ᛲᛷᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛸᛴᛶ;

    .line 55
    .line 56
    if-eq v0, v1, :cond_0

    .line 57
    .line 58
    return-object v0
.end method

.method public final ᛸᛸᛷᛱ(Lyyds/ᲀᲀᛶᛸ;)Lyyds/ᛷᛳᲁᲈ;
    .locals 2

    .line 1
    invoke-interface {p1}, Lyyds/ᲀᲀᛶᛸ;->ᲇᲈᛵᛷ()Lyyds/ᛷᛳᲁᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p1, Lyyds/ᲈᛳᛸᲇ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lyyds/ᛷᛳᲁᲈ;

    .line 12
    .line 13
    invoke-direct {p0}, Lyyds/ᛳᲁᛱ;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of v0, p1, Lyyds/ᛴᲀᛴᛵ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lyyds/ᛴᲀᛴᛵ;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛱᲀᲈᛲ(Lyyds/ᛴᲀᛴᛵ;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const-string p0, "State should have list: "

    .line 29
    .line 30
    invoke-static {p1, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_2
    return-object v0
.end method

.method public final ᲀᛲᛱᛱ()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public ᲀᛲᛲᲇ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Job was cancelled"

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲀᛴᲁᲈ(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᲁᛵᲁᲁ(Ljava/lang/Object;)I
    .locals 11

    .line 1
    instance-of v0, p1, Lyyds/ᲈᛳᛸᲇ;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lyyds/ᲈᛳᛸᲇ;

    .line 10
    .line 11
    iget-boolean v0, v0, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :goto_0
    sget-object v4, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 17
    .line 18
    sget-wide v6, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 19
    .line 20
    sget-object v9, Lyyds/ᛲᛷᛵᲇ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛸᲇ;

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    move-object v8, p1

    .line 24
    invoke-virtual/range {v4 .. v9}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    return v3

    .line 31
    :cond_1
    invoke-virtual {v4, v5, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eq p0, v8, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object p0, v5

    .line 39
    move-object p1, v8

    .line 40
    goto :goto_0

    .line 41
    :cond_3
    move-object v5, p0

    .line 42
    move-object v8, p1

    .line 43
    instance-of p0, v8, Lyyds/ᛸᛶᛳᛶ;

    .line 44
    .line 45
    if-eqz p0, :cond_6

    .line 46
    .line 47
    move-object p1, v8

    .line 48
    check-cast p1, Lyyds/ᛸᛶᛳᛶ;

    .line 49
    .line 50
    iget-object v10, p1, Lyyds/ᛸᛶᛳᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᲁᲈ;

    .line 51
    .line 52
    :cond_4
    move-object v6, v5

    .line 53
    sget-object v5, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 54
    .line 55
    move-object v9, v8

    .line 56
    sget-wide v7, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 57
    .line 58
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    move-object p1, v5

    .line 63
    move-object v5, v6

    .line 64
    move-object v8, v9

    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    return v3

    .line 68
    :cond_5
    invoke-virtual {p1, v5, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eq p0, v8, :cond_4

    .line 73
    .line 74
    :goto_1
    const/4 p0, -0x1

    .line 75
    return p0

    .line 76
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 77
    return p0
.end method

.method public ᲁᛶᛴᛸ()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᲇᛱᛲ(Lyyds/ᛴᲈᛱᛷ;)Lyyds/ᲁᲁᛴᛷ;
    .locals 6

    .line 1
    new-instance v5, Lyyds/ᲈᛳᛷᲁ;

    .line 2
    .line 3
    invoke-direct {v5, p1}, Lyyds/ᲈᛳᛷᲁ;-><init>(Lyyds/ᛴᲈᛱᛷ;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v5, Lyyds/ᛴᲀᛴᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛴᲈᛱᛷ;

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    instance-of p1, v4, Lyyds/ᲈᛳᛸᲇ;

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    move-object p1, v4

    .line 17
    check-cast p1, Lyyds/ᲈᛳᛸᲇ;

    .line 18
    .line 19
    iget-boolean v0, p1, Lyyds/ᲈᛳᛸᲇ;->ᲀᛲᛳᲀ:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    :goto_1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 24
    .line 25
    sget-wide v2, Lyyds/ᛴᲈᛱᛷ;->ᲇᲈᛵᛷ:J

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    goto :goto_5

    .line 35
    :cond_0
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eq p0, v4, :cond_1

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    move-object p0, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object v1, p0

    .line 45
    invoke-virtual {v1, p1}, Lyyds/ᛴᲈᛱᛷ;->ᛶᛴᛱᛲ(Lyyds/ᲈᛳᛸᲇ;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    move-object v1, p0

    .line 50
    instance-of p0, v4, Lyyds/ᲀᲀᛶᛸ;

    .line 51
    .line 52
    sget-object p1, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    if-eqz p0, :cond_a

    .line 56
    .line 57
    move-object p0, v4

    .line 58
    check-cast p0, Lyyds/ᲀᲀᛶᛸ;

    .line 59
    .line 60
    invoke-interface {p0}, Lyyds/ᲀᲀᛶᛸ;->ᲇᲈᛵᛷ()Lyyds/ᛷᛳᲁᲈ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    check-cast v4, Lyyds/ᛴᲀᛴᛵ;

    .line 67
    .line 68
    invoke-virtual {v1, v4}, Lyyds/ᛴᲈᛱᛷ;->ᛱᲀᲈᛲ(Lyyds/ᛴᲀᛴᛵ;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    move-object p0, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_4
    const/4 v2, 0x7

    .line 74
    invoke-virtual {p0, v5, v2}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_5
    const/4 v2, 0x3

    .line 82
    invoke-virtual {p0, v5, v2}, Lyyds/ᛳᲁᛱ;->ᛲᛴᛳᛲ(Lyyds/ᛳᲁᛱ;I)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-virtual {v1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    instance-of v2, v1, Lyyds/ᛶᛴᲀᛳ;

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    check-cast v1, Lyyds/ᛶᛴᲀᛳ;

    .line 95
    .line 96
    invoke-virtual {v1}, Lyyds/ᛶᛴᲀᛳ;->ᲀᛲᛳᲀ()Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    instance-of v2, v1, Lyyds/ᛲᛸᛶᛳ;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    check-cast v1, Lyyds/ᛲᛸᛶᛳ;

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_7
    move-object v1, v0

    .line 109
    :goto_3
    if-eqz v1, :cond_8

    .line 110
    .line 111
    iget-object v0, v1, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 112
    .line 113
    :cond_8
    :goto_4
    invoke-virtual {v5, v0}, Lyyds/ᲈᛳᛷᲁ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    if-eqz p0, :cond_9

    .line 117
    .line 118
    :goto_5
    return-object v5

    .line 119
    :cond_9
    return-object p1

    .line 120
    :cond_a
    invoke-virtual {v1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    instance-of v1, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 125
    .line 126
    if-eqz v1, :cond_b

    .line 127
    .line 128
    check-cast p0, Lyyds/ᛲᛸᛶᛳ;

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_b
    move-object p0, v0

    .line 132
    :goto_6
    if-eqz p0, :cond_c

    .line 133
    .line 134
    iget-object v0, p0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 135
    .line 136
    :cond_c
    invoke-virtual {v5, v0}, Lyyds/ᲈᛳᛷᲁ;->ᛲᛲᲈᲈ(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    return-object p1
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᲈᛷᲈᛶ(Lyyds/ᲈᲇᲈᲇ;)V
    .locals 5

    .line 1
    sget-wide v0, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛳᲀ:J

    .line 2
    .line 3
    sget-object v2, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {p1, p0, v0, v1, v2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p1}, Lyyds/ᲈᲇᲈᲇ;->start()Z

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, p0}, Lyyds/ᲈᲇᲈᲇ;->ᲇᛱᛲ(Lyyds/ᛴᲈᛱᛷ;)Lyyds/ᲁᲁᛴᛷ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v3, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 21
    .line 22
    invoke-virtual {v3, p0, v0, v1, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    instance-of v4, v4, Lyyds/ᲀᲀᛶᛸ;

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    invoke-interface {p1}, Lyyds/ᛴᲇᛲᛱ;->ᛵᛸᛸᛷ()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0, v0, v1, v2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final ᲈᲀᛲᲀ()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lyyds/ᲀᲀᛶᛸ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lyyds/ᛲᛷᛵᲇ;->ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    check-cast p0, Lyyds/ᛲᛸᛶᛳ;

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "This job has not completed yet"

    .line 24
    .line 25
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
