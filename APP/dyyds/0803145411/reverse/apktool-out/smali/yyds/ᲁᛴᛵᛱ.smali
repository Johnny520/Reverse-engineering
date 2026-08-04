.class public abstract Lyyds/ᲁᛴᛵᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛴᛲᛷᛸ;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛴᛲᛷᛸ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᲁᛴᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 9
    .line 10
    return-void
.end method

.method public static final ᛱᲈᲁ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 6
    .line 7
    invoke-interface {p0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Lyyds/ᛴᲇᛴᛲ;

    .line 12
    .line 13
    sget-object v3, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lyyds/ᲇᲈᛷᲇ;->ᛲᲈᲁ()Lyyds/ᛲᲁᲀᛱ;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {p0, v2}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v3, p0, v4}, Lyyds/ᛲᛳᲁ;->ᛷᲈᲈᲁ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;Z)Lyyds/ᲁᛴᛲ;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v3, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 31
    .line 32
    if-eq p0, v3, :cond_1

    .line 33
    .line 34
    invoke-interface {p0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    invoke-interface {p0, v3}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object v2, Lyyds/ᲇᲈᛷᲇ;->ᛲᲈᲁ:Ljava/lang/ThreadLocal;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lyyds/ᛲᲁᲀᛱ;

    .line 52
    .line 53
    invoke-static {v3, p0, v4}, Lyyds/ᛲᛳᲁ;->ᛷᲈᲈᲁ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;Z)Lyyds/ᲁᛴᛲ;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object v3, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 58
    .line 59
    if-eq p0, v3, :cond_1

    .line 60
    .line 61
    invoke-interface {p0, v1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    invoke-interface {p0, v3}, Lyyds/ᲁᛴᛲ;->ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :cond_1
    :goto_0
    new-instance v1, Lyyds/ᛳᲁᛴᲀ;

    .line 72
    .line 73
    invoke-direct {v1, p0, v0, v2}, Lyyds/ᛳᲁᛴᲀ;-><init>(Lyyds/ᲁᛴᛲ;Ljava/lang/Thread;Lyyds/ᛲᲁᲀᛱ;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v4, v1, p1}, Lyyds/ᛱᛸᲁᲇ;->ᛶᛵᛸᛲ(ILyyds/ᛱᛸᲁᲇ;Lyyds/ᛲᲇᲁᛴ;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    iget-object p1, v1, Lyyds/ᛳᲁᛴᲀ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲀᛱ;

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lyyds/ᛲᲁᲀᛱ;->ᛷᛴᛴᲁ(Z)V

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    invoke-virtual {p1}, Lyyds/ᛲᲁᲀᛱ;->ᛶᛴᛱᛲ()J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    goto :goto_2

    .line 100
    :catchall_0
    move-exception v0

    .line 101
    goto :goto_4

    .line 102
    :cond_3
    const-wide v2, 0x7fffffffffffffffL

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-virtual {v1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    instance-of v0, v0, Lyyds/ᲀᲀᛶᛸ;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    invoke-static {v1, v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    if-eqz p1, :cond_5

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Lyyds/ᛲᲁᲀᛱ;->ᛱᛸᲁᲇ(Z)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v1}, Lyyds/ᛴᲈᛱᛷ;->ᲀᛲᛱᛱ()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Lyyds/ᛲᛷᛵᲇ;->ᛶᛳᛶᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    instance-of p1, p0, Lyyds/ᛲᛸᛶᛳ;

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    move-object p1, p0

    .line 137
    check-cast p1, Lyyds/ᛲᛸᛶᛳ;

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    const/4 p1, 0x0

    .line 141
    :goto_3
    if-nez p1, :cond_7

    .line 142
    .line 143
    return-object p0

    .line 144
    :cond_7
    iget-object p0, p1, Lyyds/ᛲᛸᛶᛳ;->ᛲᲈᲁ:Ljava/lang/Throwable;

    .line 145
    .line 146
    throw p0

    .line 147
    :cond_8
    :try_start_1
    new-instance v0, Ljava/lang/InterruptedException;

    .line 148
    .line 149
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, v0}, Lyyds/ᛴᲈᛱᛷ;->ᛱᛳᲇ(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    :goto_4
    if-eqz p1, :cond_9

    .line 157
    .line 158
    invoke-virtual {p1, p0}, Lyyds/ᛲᲁᲀᛱ;->ᛱᛸᲁᲇ(Z)V

    .line 159
    .line 160
    .line 161
    :cond_9
    throw v0
.end method

.method public static final ᛲᛳᛶᲁ([Ljava/lang/Object;IILyyds/ᛱᲀᲈᛲ;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static final ᛲᛴᛳᛲ(Ljava/lang/Object;)Lyyds/ᛲᛶᲁᛴ;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛲᛶᲁᛴ;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "Does not contain segment"

    .line 9
    .line 10
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lyyds/ᛱᛸᛶᛲ;->ᛱᛳᲇ(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final ᛵᛸᛸᛷ(JJJ)V
    .locals 4

    .line 1
    or-long v0, p2, p4

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    cmp-long v0, p2, p0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    sub-long v0, p0, p2

    .line 14
    .line 15
    cmp-long v0, v0, p4

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "size="

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " offset="

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, " byteCount="

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static final ᛶᛷᛲᲁ([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aput-object v0, p0, p1

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void
.end method

.method public static final ᛷᛲᲈᛱ(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lyyds/ᲁᛴᛵᛱ;->ᛷᛲᲈᛱ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance v0, Lyyds/ᲁᲈᛲᛵ;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "Cannot cast type "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " to java.lang.Class object."

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public static final ᛷᛵᲇᲀ(I)Ljava/lang/String;
    .locals 10

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "0"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, Lyyds/ᛱᛷᲈᛲ;->ᲇᲈᛵᛷ:[C

    .line 7
    .line 8
    shr-int/lit8 v1, p0, 0x1c

    .line 9
    .line 10
    and-int/lit8 v1, v1, 0xf

    .line 11
    .line 12
    aget-char v1, v0, v1

    .line 13
    .line 14
    shr-int/lit8 v2, p0, 0x18

    .line 15
    .line 16
    and-int/lit8 v2, v2, 0xf

    .line 17
    .line 18
    aget-char v2, v0, v2

    .line 19
    .line 20
    shr-int/lit8 v3, p0, 0x14

    .line 21
    .line 22
    and-int/lit8 v3, v3, 0xf

    .line 23
    .line 24
    aget-char v3, v0, v3

    .line 25
    .line 26
    shr-int/lit8 v4, p0, 0x10

    .line 27
    .line 28
    and-int/lit8 v4, v4, 0xf

    .line 29
    .line 30
    aget-char v4, v0, v4

    .line 31
    .line 32
    shr-int/lit8 v5, p0, 0xc

    .line 33
    .line 34
    and-int/lit8 v5, v5, 0xf

    .line 35
    .line 36
    aget-char v5, v0, v5

    .line 37
    .line 38
    shr-int/lit8 v6, p0, 0x8

    .line 39
    .line 40
    and-int/lit8 v6, v6, 0xf

    .line 41
    .line 42
    aget-char v6, v0, v6

    .line 43
    .line 44
    shr-int/lit8 v7, p0, 0x4

    .line 45
    .line 46
    and-int/lit8 v7, v7, 0xf

    .line 47
    .line 48
    aget-char v7, v0, v7

    .line 49
    .line 50
    and-int/lit8 p0, p0, 0xf

    .line 51
    .line 52
    aget-char p0, v0, p0

    .line 53
    .line 54
    const/16 v0, 0x8

    .line 55
    .line 56
    new-array v8, v0, [C

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    aput-char v1, v8, v9

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    aput-char v2, v8, v1

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    aput-char v3, v8, v1

    .line 66
    .line 67
    const/4 v1, 0x3

    .line 68
    aput-char v4, v8, v1

    .line 69
    .line 70
    const/4 v1, 0x4

    .line 71
    aput-char v5, v8, v1

    .line 72
    .line 73
    const/4 v1, 0x5

    .line 74
    aput-char v6, v8, v1

    .line 75
    .line 76
    const/4 v1, 0x6

    .line 77
    aput-char v7, v8, v1

    .line 78
    .line 79
    const/4 v1, 0x7

    .line 80
    aput-char p0, v8, v1

    .line 81
    .line 82
    :goto_0
    if-ge v9, v0, :cond_1

    .line 83
    .line 84
    aget-char p0, v8, v9

    .line 85
    .line 86
    const/16 v1, 0x30

    .line 87
    .line 88
    if-ne p0, v1, :cond_1

    .line 89
    .line 90
    add-int/lit8 v9, v9, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string p0, "startIndex: "

    .line 94
    .line 95
    if-ltz v9, :cond_3

    .line 96
    .line 97
    if-gt v9, v0, :cond_2

    .line 98
    .line 99
    new-instance p0, Ljava/lang/String;

    .line 100
    .line 101
    rsub-int/lit8 v0, v9, 0x8

    .line 102
    .line 103
    invoke-direct {p0, v8, v9, v0}, Ljava/lang/String;-><init>([CII)V

    .line 104
    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    new-instance v1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p0, " > endIndex: 8"

    .line 118
    .line 119
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 131
    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p0, ", endIndex: 8, size: 8"

    .line 141
    .line 142
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0
.end method

.method public static ᛷᲈᲈᲁ(ILyyds/ᛶᲁᛸᛷ;)Lyyds/ᛳᛷᲀᛴ;
    .locals 6

    .line 1
    new-instance v1, Lyyds/ᲀᛳᛵᲈ;

    .line 2
    .line 3
    invoke-direct {v1, p0}, Lyyds/ᲀᛳᛵᲈ;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᛳᛷᲀᛴ;

    .line 7
    .line 8
    const/16 v4, 0xe

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    sget-object v3, Lyyds/ᲁᛴᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛴᛲᛷᛸ;

    .line 12
    .line 13
    move-object v2, p1

    .line 14
    invoke-direct/range {v0 .. v5}, Lyyds/ᛳᛷᲀᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static ᲀᛲᛳᲀ(Landroid/graphics/Bitmap;)Lyyds/ᛶᲇᛴᛴ;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-wide v2, -0x20291e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {v1}, Lyyds/ᲁᛴᛵᛱ;->ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez v5, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_0
    const/4 v12, 0x0

    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_1
    :try_start_1
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    new-instance v3, Lyyds/ᛱᲁᛲᛱ;

    .line 29
    .line 30
    const-class v6, Landroid/graphics/Bitmap;

    .line 31
    .line 32
    const-wide v7, -0x211e7e68a836eL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const-wide v8, -0x211f0e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x2

    .line 52
    const/4 v4, 0x2

    .line 53
    invoke-direct/range {v3 .. v10}, Lyyds/ᛱᲁᛲᛱ;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v11, v3}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛴᛳᛲ(IILyyds/ᛱᲁᛲᛱ;)Lyyds/ᛶᲇᛴᛴ;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    if-nez v0, :cond_2

    .line 61
    .line 62
    if-eq v5, v1, :cond_0

    .line 63
    .line 64
    :try_start_2
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_2
    :try_start_3
    iget v3, v0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 72
    .line 73
    iget v4, v0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 74
    .line 75
    iget v6, v0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 76
    .line 77
    iget v0, v0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    int-to-float v7, v7

    .line 84
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    int-to-float v8, v8

    .line 89
    div-float/2addr v7, v8

    .line 90
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    int-to-float v8, v8

    .line 95
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    int-to-float v9, v9

    .line 100
    div-float/2addr v8, v9

    .line 101
    float-to-double v9, v7

    .line 102
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    double-to-float v9, v9

    .line 107
    float-to-int v9, v9

    .line 108
    const/4 v10, 0x1

    .line 109
    if-ge v9, v10, :cond_3

    .line 110
    .line 111
    move v9, v10

    .line 112
    :cond_3
    float-to-double v11, v8

    .line 113
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 114
    .line 115
    .line 116
    move-result-wide v11

    .line 117
    double-to-float v11, v11

    .line 118
    float-to-int v11, v11

    .line 119
    if-ge v11, v10, :cond_4

    .line 120
    .line 121
    move v11, v10

    .line 122
    :cond_4
    new-instance v12, Lyyds/ᛶᲇᛴᛴ;

    .line 123
    .line 124
    int-to-float v13, v0

    .line 125
    mul-float/2addr v13, v7

    .line 126
    float-to-double v13, v13

    .line 127
    invoke-static {v13, v14}, Ljava/lang/Math;->floor(D)D

    .line 128
    .line 129
    .line 130
    move-result-wide v13

    .line 131
    double-to-float v13, v13

    .line 132
    float-to-int v13, v13

    .line 133
    const/4 v14, 0x0

    .line 134
    if-lez v0, :cond_5

    .line 135
    .line 136
    move v0, v9

    .line 137
    goto :goto_1

    .line 138
    :cond_5
    move v0, v14

    .line 139
    :goto_1
    add-int/2addr v13, v0

    .line 140
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    sub-int/2addr v0, v10

    .line 145
    invoke-static {v13, v14, v0}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    int-to-float v13, v6

    .line 150
    mul-float/2addr v13, v8

    .line 151
    move v15, v3

    .line 152
    float-to-double v2, v13

    .line 153
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v2

    .line 157
    double-to-float v2, v2

    .line 158
    float-to-int v2, v2

    .line 159
    if-lez v6, :cond_6

    .line 160
    .line 161
    move v3, v11

    .line 162
    goto :goto_2

    .line 163
    :cond_6
    move v3, v14

    .line 164
    :goto_2
    add-int/2addr v2, v3

    .line 165
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    sub-int/2addr v3, v10

    .line 170
    invoke-static {v2, v14, v3}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    int-to-float v3, v4

    .line 175
    mul-float/2addr v3, v7

    .line 176
    float-to-double v6, v3

    .line 177
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 178
    .line 179
    .line 180
    move-result-wide v6

    .line 181
    double-to-float v3, v6

    .line 182
    float-to-int v3, v3

    .line 183
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    if-ge v4, v6, :cond_7

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    move v9, v14

    .line 191
    :goto_3
    sub-int/2addr v3, v9

    .line 192
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    invoke-static {v3, v10, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    move v4, v15

    .line 201
    int-to-float v6, v4

    .line 202
    mul-float/2addr v6, v8

    .line 203
    float-to-double v6, v6

    .line 204
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    double-to-float v6, v6

    .line 209
    float-to-int v6, v6

    .line 210
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-ge v4, v7, :cond_8

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_8
    move v11, v14

    .line 218
    :goto_4
    sub-int/2addr v6, v11

    .line 219
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    invoke-static {v6, v10, v4}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    invoke-direct {v12, v0, v2, v3, v4}, Lyyds/ᛶᲇᛴᛴ;-><init>(IIII)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v12}, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-lez v0, :cond_9

    .line 235
    .line 236
    invoke-virtual {v12}, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ()I

    .line 237
    .line 238
    .line 239
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 240
    if-lez v0, :cond_9

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :catchall_1
    move-exception v0

    .line 244
    goto :goto_6

    .line 245
    :cond_9
    const/4 v12, 0x0

    .line 246
    :goto_5
    if-eq v5, v1, :cond_b

    .line 247
    .line 248
    :try_start_4
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 249
    .line 250
    .line 251
    goto :goto_8

    .line 252
    :goto_6
    if-eq v5, v1, :cond_a

    .line 253
    .line 254
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 255
    .line 256
    .line 257
    :cond_a
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 258
    :goto_7
    new-instance v12, Lyyds/ᲈᛵᛵᛴ;

    .line 259
    .line 260
    invoke-direct {v12, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    :cond_b
    :goto_8
    instance-of v0, v12, Lyyds/ᲈᛵᛵᛴ;

    .line 264
    .line 265
    if-eqz v0, :cond_c

    .line 266
    .line 267
    const/4 v2, 0x0

    .line 268
    goto :goto_9

    .line 269
    :cond_c
    move-object v2, v12

    .line 270
    :goto_9
    check-cast v2, Lyyds/ᛶᲇᛴᛴ;

    .line 271
    .line 272
    return-object v2
.end method

.method public static final ᲇᲇᲇᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᲁᛷᛵᲁ;->ᛲᲈᲁ:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lyyds/ᛱᲈᛵᛷ;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    new-instance v0, Lyyds/ᛷᛴᛶᲈ;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lyyds/ᛷᛴᛶᲈ;-><init>(Lyyds/ᲁᛴᛲ;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Lyyds/ᛷᛶᛷᛵ;->ᛲᲈᲁ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_6

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/16 v1, 0x100

    .line 33
    .line 34
    if-gt v0, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 41
    .line 42
    if-eq v1, v2, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    const/high16 v1, 0x43800000    # 256.0f

    .line 46
    .line 47
    int-to-float v0, v0

    .line 48
    div-float/2addr v1, v0

    .line 49
    const/high16 v0, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    int-to-float v1, v1

    .line 60
    mul-float/2addr v1, v0

    .line 61
    invoke-static {v1}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛳᛶᛵ(F)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v2, 0x1

    .line 66
    if-ge v1, v2, :cond_2

    .line 67
    .line 68
    move v1, v2

    .line 69
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-float v3, v3

    .line 74
    mul-float/2addr v3, v0

    .line 75
    invoke-static {v3}, Lyyds/ᛱᛷᲈᛲ;->ᛶᛳᛶᛵ(F)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-ge v0, v2, :cond_3

    .line 80
    .line 81
    move v0, v2

    .line 82
    :cond_3
    invoke-static {p0, v1, v0, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-wide v1, -0x202b8e68a836eL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 99
    .line 100
    if-eq v1, v2, :cond_4

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_4
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eq v0, p0, :cond_5

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 113
    .line 114
    .line 115
    :cond_5
    return-object v1

    .line 116
    :cond_6
    :goto_0
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method
