.class public abstract Lxhss/ᛸᛷᛳᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛳᛵᲈᛲ;


# static fields
.field public static final synthetic ᛱᛱᛲᲇ:J

.field public static final synthetic ᛳᲁᲇᛸ:J


# instance fields
.field private volatile synthetic _parentHandle$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛸᛷᛳᲈ;

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
    sput-wide v2, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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
    sput-wide v0, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛲᲇ:J

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
    sget-object p1, Lxhss/ᛵᛶᲀᲇ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛵᲁᛵ;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lxhss/ᛵᛶᲀᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛳᛵᲁᛵ;

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lxhss/ᛸᛷᛳᲈ;->_state$volatile:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public static ᛱᛱᛴᲀ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Lxhss/ᲇᲈᛵᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lxhss/ᲇᲈᛵᲁ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛴᛷᛱ()Z

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
    invoke-virtual {p0}, Lxhss/ᲇᲈᛵᲁ;->ᲇᛶᛴᲀ()Z

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
    instance-of v0, p0, Lxhss/ᛲᲀᛵᛳ;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    check-cast p0, Lxhss/ᛲᲀᛵᛳ;

    .line 30
    .line 31
    invoke-interface {p0}, Lxhss/ᛲᲀᛵᛳ;->ᛱᛱᛲᲇ()Z

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
    instance-of p0, p0, Lxhss/ᛷᲁᲇᛷ;

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

.method public static ᲁᛴᛴᛸ(Lxhss/ᛱᛸᛲᛴ;)Lxhss/ᛴᛴᛷᛲ;
    .locals 1

    .line 1
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛱᛸᛲᛴ;->ᲈᛳᲀ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛷᲈᲈ()Lxhss/ᛱᛸᛲᛴ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛲᲀᛵ()Lxhss/ᛱᛸᛲᛴ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lxhss/ᛱᛸᛲᛴ;->ᲈᛳᲀ()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    instance-of v0, p0, Lxhss/ᛴᛴᛷᛲ;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p0, Lxhss/ᛴᛴᛷᛲ;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    instance-of v0, p0, Lxhss/ᛴᲁᛶᛲ;

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
.method public final getKey()Lxhss/ᲇᲁᛵᲈ;
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    return-object p0
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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x7b

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛴᲀ(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/16 v2, 0x7d

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x40

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public final ᛱᛲᛸᲇ(Lxhss/ᲇᲈᛵᲁ;Lxhss/ᛴᛴᛷᛲ;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p2, Lxhss/ᛴᛴᛷᛲ;->ᲇᛶᛴᲀ:Lxhss/ᛸᛷᛳᲈ;

    .line 2
    .line 3
    new-instance v1, Lxhss/ᲈᲈᲈᲈ;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2, p3}, Lxhss/ᲈᲈᲈᲈ;-><init>(Lxhss/ᛸᛷᛳᲈ;Lxhss/ᲇᲈᛵᲁ;Lxhss/ᛴᛴᛷᛲ;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛸᛶᲈᛶ(Lxhss/ᛸᛷᛳᲈ;ZLxhss/ᛴᛷᛴᲀ;)Lxhss/ᛱᛲᲁᲇ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

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
    invoke-static {p2}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛴᛴᛸ(Lxhss/ᛱᛸᛲᛴ;)Lxhss/ᛴᛴᛷᛲ;

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

.method public final ᛱᛳᲁᲈ(Lxhss/ᛸᛷᛳᲈ;)V
    .locals 9

    .line 1
    sget-wide v0, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛲᲇ:J

    .line 2
    .line 3
    sget-object v2, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 8
    .line 9
    invoke-virtual {p1, p0, v0, v1, v2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛸᛷᛳᲈ;->ᛴᲀᛸᛵ()Z

    .line 14
    .line 15
    .line 16
    new-instance v8, Lxhss/ᛴᛴᛷᛲ;

    .line 17
    .line 18
    invoke-direct {v8, p0}, Lxhss/ᛴᛴᛷᛲ;-><init>(Lxhss/ᛸᛷᛳᲈ;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v8, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    instance-of v3, v7, Lxhss/ᛳᛵᲁᛵ;

    .line 28
    .line 29
    if-eqz v3, :cond_4

    .line 30
    .line 31
    move-object v3, v7

    .line 32
    check-cast v3, Lxhss/ᛳᛵᲁᛵ;

    .line 33
    .line 34
    iget-boolean v4, v3, Lxhss/ᛳᛵᲁᛵ;->ᛱᛱᛲᲇ:Z

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    :goto_1
    sget-object v3, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 39
    .line 40
    sget-wide v5, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 41
    .line 42
    move-object v4, p1

    .line 43
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_1
    invoke-virtual {v3, v4, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-eq p1, v7, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object p1, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move-object v4, p1

    .line 61
    invoke-virtual {v4, v3}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛴᛸᛲ(Lxhss/ᛳᛵᲁᛵ;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object v4, p1

    .line 66
    instance-of p1, v7, Lxhss/ᛲᲀᛵᛳ;

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    if-eqz p1, :cond_b

    .line 70
    .line 71
    move-object p1, v7

    .line 72
    check-cast p1, Lxhss/ᛲᲀᛵᛳ;

    .line 73
    .line 74
    invoke-interface {p1}, Lxhss/ᛲᲀᛵᛳ;->ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    check-cast v7, Lxhss/ᛴᛷᛴᲀ;

    .line 81
    .line 82
    invoke-virtual {v4, v7}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛷᲇᲇ(Lxhss/ᛴᛷᛴᲀ;)V

    .line 83
    .line 84
    .line 85
    :goto_2
    move-object p1, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    const/4 v5, 0x7

    .line 88
    invoke-virtual {p1, v8, v5}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :cond_6
    const/4 v5, 0x3

    .line 96
    invoke-virtual {p1, v8, v5}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {v4}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    instance-of v5, v4, Lxhss/ᲇᲈᛵᲁ;

    .line 105
    .line 106
    if-eqz v5, :cond_7

    .line 107
    .line 108
    check-cast v4, Lxhss/ᲇᲈᛵᲁ;

    .line 109
    .line 110
    invoke-virtual {v4}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    goto :goto_4

    .line 115
    :cond_7
    instance-of v5, v4, Lxhss/ᛷᲁᲇᛷ;

    .line 116
    .line 117
    if-eqz v5, :cond_8

    .line 118
    .line 119
    check-cast v4, Lxhss/ᛷᲁᲇᛷ;

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_8
    move-object v4, v3

    .line 123
    :goto_3
    if-eqz v4, :cond_9

    .line 124
    .line 125
    iget-object v3, v4, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 126
    .line 127
    :cond_9
    :goto_4
    invoke-virtual {v8, v3}, Lxhss/ᛴᛴᛷᛲ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    if-eqz p1, :cond_a

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_a
    :goto_5
    move-object v8, v2

    .line 134
    goto :goto_7

    .line 135
    :cond_b
    invoke-virtual {v4}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    instance-of v4, p1, Lxhss/ᛷᲁᲇᛷ;

    .line 140
    .line 141
    if-eqz v4, :cond_c

    .line 142
    .line 143
    check-cast p1, Lxhss/ᛷᲁᲇᛷ;

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_c
    move-object p1, v3

    .line 147
    :goto_6
    if-eqz p1, :cond_d

    .line 148
    .line 149
    iget-object v3, p1, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 150
    .line 151
    :cond_d
    invoke-virtual {v8, v3}, Lxhss/ᛴᛴᛷᛲ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :goto_7
    sget-object p1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 156
    .line 157
    invoke-virtual {p1, p0, v0, v1, v8}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    instance-of v3, v3, Lxhss/ᛲᲀᛵᛳ;

    .line 165
    .line 166
    if-nez v3, :cond_e

    .line 167
    .line 168
    invoke-interface {v8}, Lxhss/ᛱᛲᲁᲇ;->ᛷᛵᛵᲈ()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, p0, v0, v1, v2}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_e
    return-void
.end method

.method public final ᛱᲁᛳᛲ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lxhss/ᛲᲀᛵᛳ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p1, Lxhss/ᛳᛵᲁᛵ;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    instance-of v0, p1, Lxhss/ᛴᛷᛴᲀ;

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
    instance-of v0, p1, Lxhss/ᛴᛴᛷᛲ;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    instance-of v0, p2, Lxhss/ᛷᲁᲇᛷ;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    check-cast v5, Lxhss/ᛲᲀᛵᛳ;

    .line 29
    .line 30
    instance-of p1, p2, Lxhss/ᛲᲀᛵᛳ;

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    new-instance p1, Lxhss/ᲀᛳᲈᛳ;

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, Lxhss/ᛲᲀᛵᛳ;

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lxhss/ᲀᛳᲈᛳ;-><init>(Lxhss/ᛲᲀᛵᛳ;)V

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
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v3, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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
    invoke-virtual {v2, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v5, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛳᲈᲈᛲ(Lxhss/ᛲᲀᛵᛳ;Ljava/lang/Object;)V

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
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

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
    check-cast v11, Lxhss/ᛲᲀᛵᛳ;

    .line 76
    .line 77
    invoke-virtual {v2, v11}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛲᛴᛴ(Lxhss/ᛲᲀᛵᛳ;)Lxhss/ᛴᲁᛶᛲ;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-nez p0, :cond_6

    .line 82
    .line 83
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_6
    instance-of p1, v11, Lxhss/ᲇᲈᛵᲁ;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    if-eqz p1, :cond_7

    .line 90
    .line 91
    move-object p1, v11

    .line 92
    check-cast p1, Lxhss/ᲇᲈᛵᲁ;

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
    new-instance p1, Lxhss/ᲇᲈᛵᲁ;

    .line 99
    .line 100
    invoke-direct {p1, p0, v0}, Lxhss/ᲇᲈᛵᲁ;-><init>(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :cond_8
    move-object v12, p1

    .line 104
    monitor-enter v12

    .line 105
    :try_start_0
    invoke-virtual {v12}, Lxhss/ᲇᲈᛵᲁ;->ᲇᛶᛴᲀ()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_9

    .line 110
    .line 111
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;
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
    sget-object p1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 120
    .line 121
    sget-wide v3, Lxhss/ᲇᲈᛵᲁ;->ᲇᛴᲇᛵ:J

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
    sget-object v7, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 130
    .line 131
    sget-wide v9, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;
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
    invoke-virtual {v12}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛴᛷᛱ()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    instance-of v1, p2, Lxhss/ᛷᲁᲇᛷ;

    .line 157
    .line 158
    if-eqz v1, :cond_d

    .line 159
    .line 160
    move-object v1, p2

    .line 161
    check-cast v1, Lxhss/ᛷᲁᲇᛷ;

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
    iget-object v1, v1, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 168
    .line 169
    invoke-virtual {v12, v1}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    :cond_e
    invoke-virtual {v12}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

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
    invoke-virtual {v2, p0, v0}, Lxhss/ᛸᛷᛳᲈ;->ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    :cond_10
    invoke-static {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛴᛴᛸ(Lxhss/ᛱᛸᛲᛴ;)Lxhss/ᛴᛴᛷᛲ;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_11

    .line 190
    .line 191
    invoke-virtual {v2, v12, p1, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛲᛸᲇ(Lxhss/ᲇᲈᛵᲁ;Lxhss/ᛴᛴᛷᛲ;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_11

    .line 196
    .line 197
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 198
    .line 199
    return-object p0

    .line 200
    :cond_11
    new-instance p1, Lxhss/ᛷᛳᛷᛷ;

    .line 201
    .line 202
    const/4 v0, 0x2

    .line 203
    invoke-direct {p1, v0}, Lxhss/ᛷᛳᛷᛷ;-><init>(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1, v0}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

    .line 207
    .line 208
    .line 209
    invoke-static {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛴᛴᛸ(Lxhss/ᛱᛸᛲᛴ;)Lxhss/ᛴᛴᛷᛲ;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    if-eqz p0, :cond_12

    .line 214
    .line 215
    invoke-virtual {v2, v12, p0, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛲᛸᲇ(Lxhss/ᲇᲈᛵᲁ;Lxhss/ᛴᛴᛷᛲ;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-eqz p0, :cond_12

    .line 220
    .line 221
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 222
    .line 223
    return-object p0

    .line 224
    :cond_12
    invoke-virtual {v2, v12, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛶᛴᲈ(Lxhss/ᲇᲈᛵᲁ;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public ᛱᲈᛳᛴ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛲᛴᲀᲈ(ZLxhss/ᛴᛷᛴᲀ;)Lxhss/ᛱᛲᲁᲇ;
    .locals 6

    .line 1
    iput-object p0, p2, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 2
    .line 3
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    instance-of v0, v4, Lxhss/ᛳᛵᲁᛵ;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    move-object v0, v4

    .line 12
    check-cast v0, Lxhss/ᛳᛵᲁᛵ;

    .line 13
    .line 14
    iget-boolean v1, v0, Lxhss/ᛳᛵᲁᛵ;->ᛱᛱᛲᲇ:Z

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    :goto_1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v2, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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
    invoke-virtual {v1, v0}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛴᛸᛲ(Lxhss/ᛳᛵᲁᛵ;)V

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
    instance-of p0, v4, Lxhss/ᛲᲀᛵᛳ;

    .line 50
    .line 51
    sget-object p2, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    if-eqz p0, :cond_a

    .line 55
    .line 56
    move-object p0, v4

    .line 57
    check-cast p0, Lxhss/ᛲᲀᛵᛳ;

    .line 58
    .line 59
    invoke-interface {p0}, Lxhss/ᛲᲀᛵᛳ;->ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    check-cast v4, Lxhss/ᛴᛷᛴᲀ;

    .line 66
    .line 67
    invoke-virtual {v1, v4}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛷᲇᲇ(Lxhss/ᛴᛷᛴᲀ;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_4
    invoke-virtual {v5}, Lxhss/ᛴᛷᛴᲀ;->ᛷᲁᲁ()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_8

    .line 76
    .line 77
    instance-of v3, p0, Lxhss/ᲇᲈᛵᲁ;

    .line 78
    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    check-cast p0, Lxhss/ᲇᲈᛵᲁ;

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
    invoke-virtual {p0}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

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
    invoke-virtual {v2, v5, p0}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

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
    invoke-virtual {v5, v0}, Lxhss/ᛴᛷᛴᲀ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    return-object p2

    .line 105
    :cond_8
    const/4 p0, 0x1

    .line 106
    invoke-virtual {v2, v5, p0}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

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
    invoke-virtual {v1}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    instance-of p1, p0, Lxhss/ᛷᲁᲇᛷ;

    .line 123
    .line 124
    if-eqz p1, :cond_b

    .line 125
    .line 126
    check-cast p0, Lxhss/ᛷᲁᲇᛷ;

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
    iget-object v0, p0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 133
    .line 134
    :cond_c
    invoke-virtual {v5, v0}, Lxhss/ᛴᛷᛴᲀ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_d
    return-object p2
.end method

.method public ᛲᛴᲇᛲ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lxhss/ᛲᲀᛵᛳ;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lxhss/ᛲᲀᛵᛳ;

    .line 10
    .line 11
    invoke-interface {p0}, Lxhss/ᛲᲀᛵᛳ;->ᛱᛱᛲᲇ()Z

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

.method public ᛳᛶᛷᲀ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛳᛸᛵᲀ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛱᲁᛳᛲ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

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
    instance-of v1, p1, Lxhss/ᛷᲁᲇᛷ;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast p1, Lxhss/ᛷᲁᲇᛷ;

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
    iget-object v2, p1, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

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
    sget-object v1, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 55
    .line 56
    if-eq v0, v1, :cond_0

    .line 57
    .line 58
    return-object v0
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/Object;Lxhss/ᛵᲇᛱᛴ;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lxhss/ᛵᲇᛱᛴ;->ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛳᲈᲈᛲ(Lxhss/ᛲᲀᛵᛳ;Ljava/lang/Object;)V
    .locals 6

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛲᲇ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    check-cast v3, Lxhss/ᛶᛷᛴᛶ;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    invoke-interface {v3}, Lxhss/ᛱᛲᲁᲇ;->ᛷᛵᛵᲈ()V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 17
    .line 18
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    instance-of v0, p2, Lxhss/ᛷᲁᲇᛷ;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p2, Lxhss/ᛷᲁᲇᛷ;

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
    iget-object p2, p2, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object p2, v1

    .line 36
    :goto_1
    instance-of v0, p1, Lxhss/ᛴᛷᛴᲀ;

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
    check-cast v0, Lxhss/ᛴᛷᛴᲀ;

    .line 46
    .line 47
    invoke-virtual {v0, p2}, Lxhss/ᛴᛷᛴᲀ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
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
    new-instance v0, Lxhss/ᛵᛲᛲᲇ;

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
    invoke-virtual {p0, v0}, Lxhss/ᛸᛷᛳᲈ;->ᲀᛷᲁᲀ(Lxhss/ᛵᛲᛲᲇ;)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    invoke-interface {p1}, Lxhss/ᛲᲀᛵᛳ;->ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_7

    .line 84
    .line 85
    new-instance v0, Lxhss/ᛷᛳᛷᛷ;

    .line 86
    .line 87
    const/4 v4, 0x1

    .line 88
    invoke-direct {v0, v4}, Lxhss/ᛷᛳᛷᛷ;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0, v4}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛴᛶᛳ()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lxhss/ᛱᛸᛲᛴ;

    .line 99
    .line 100
    :goto_2
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    instance-of v4, v0, Lxhss/ᛴᛷᛴᲀ;

    .line 107
    .line 108
    if-eqz v4, :cond_5

    .line 109
    .line 110
    :try_start_1
    move-object v4, v0

    .line 111
    check-cast v4, Lxhss/ᛴᛷᛴᲀ;

    .line 112
    .line 113
    invoke-virtual {v4, p2}, Lxhss/ᛴᛷᛴᲀ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
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
    invoke-static {v1, v4}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    new-instance v1, Lxhss/ᛵᛲᛲᲇ;

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
    invoke-virtual {v0}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛲᲀᛵ()Lxhss/ᛱᛸᛲᛴ;

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
    invoke-virtual {p0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᲀᛷᲁᲀ(Lxhss/ᛵᛲᛲᲇ;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_4
    return-void
.end method

.method public final ᛴᲀᛸᛵ()Z
    .locals 8

    .line 1
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v4

    .line 5
    instance-of v0, v4, Lxhss/ᛳᛵᲁᛵ;

    .line 6
    .line 7
    sget-wide v6, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    move-object v0, v4

    .line 12
    check-cast v0, Lxhss/ᛳᛵᲁᛵ;

    .line 13
    .line 14
    iget-boolean v0, v0, Lxhss/ᛳᛵᲁᛵ;->ᛱᛱᛲᲇ:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_4

    .line 19
    :cond_0
    :goto_1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 20
    .line 21
    sget-wide v2, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 22
    .line 23
    sget-object v5, Lxhss/ᛵᛶᲀᲇ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛵᲁᛵ;

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eq p0, v4, :cond_2

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_2
    move-object p0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    move-object v1, p0

    .line 43
    instance-of p0, v4, Lxhss/ᛴᛸᲇᛲ;

    .line 44
    .line 45
    if-eqz p0, :cond_6

    .line 46
    .line 47
    move-object p0, v4

    .line 48
    check-cast p0, Lxhss/ᛴᛸᲇᛲ;

    .line 49
    .line 50
    iget-object v5, p0, Lxhss/ᛴᛸᲇᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲁᛶᛲ;

    .line 51
    .line 52
    :cond_4
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 53
    .line 54
    sget-wide v2, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 55
    .line 56
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_5

    .line 61
    .line 62
    :goto_2
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_5
    invoke-virtual {v0, v1, v6, v7}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eq p0, v4, :cond_4

    .line 69
    .line 70
    :goto_3
    move-object p0, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_6
    :goto_4
    const/4 p0, 0x0

    .line 73
    return p0
.end method

.method public ᛴᲈᛱᛴ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    new-instance v0, Lxhss/ᛷᛳᛷᛷ;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lxhss/ᛷᛳᛷᛷ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v0, v1}, Lxhss/ᛱᛸᛲᛴ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛸᛲᛴ;I)Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛴᛶᛳ()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lxhss/ᛱᛸᛲᛴ;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    instance-of v2, v0, Lxhss/ᛴᛷᛴᲀ;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    check-cast v2, Lxhss/ᛴᛷᛴᲀ;

    .line 29
    .line 30
    invoke-virtual {v2}, Lxhss/ᛴᛷᛴᲀ;->ᛷᲁᲁ()Z

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
    check-cast v2, Lxhss/ᛴᛷᛴᲀ;

    .line 38
    .line 39
    invoke-virtual {v2, p2}, Lxhss/ᛴᛷᛴᲀ;->ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
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
    invoke-static {v1, v2}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance v1, Lxhss/ᛵᛲᛲᲇ;

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
    invoke-virtual {v0}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛲᲀᛵ()Lxhss/ᛱᛸᛲᛴ;

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
    invoke-virtual {p0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᲀᛷᲁᲀ(Lxhss/ᛵᛲᛲᲇ;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {p0, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛷᲁᲁ(Ljava/lang/Throwable;)Z

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public ᛵᛷᛲᛸ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛶᲇᲈᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;
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
    new-instance p1, Lxhss/ᲈᛶᲈᛵ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛶᲈᛶ()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p1, v0, v1, p0}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-object p1

    .line 24
    :cond_2
    check-cast p1, Lxhss/ᛸᛷᛳᲈ;

    .line 25
    .line 26
    invoke-virtual {p1}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    instance-of v0, p0, Lxhss/ᲇᲈᛵᲁ;

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    move-object v0, p0

    .line 35
    check-cast v0, Lxhss/ᲇᲈᛵᲁ;

    .line 36
    .line 37
    invoke-virtual {v0}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    instance-of v0, p0, Lxhss/ᛷᲁᲇᛷ;

    .line 43
    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    move-object v0, p0

    .line 47
    check-cast v0, Lxhss/ᛷᲁᲇᛷ;

    .line 48
    .line 49
    iget-object v0, v0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    instance-of v0, p0, Lxhss/ᛲᲀᛵᛳ;

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
    new-instance v1, Lxhss/ᲈᛶᲈᛵ;

    .line 67
    .line 68
    invoke-static {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛴᲀ(Ljava/lang/Object;)Ljava/lang/String;

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
    invoke-direct {v1, p0, v0, p1}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V

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
    invoke-static {p0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method public ᛷᛵᛵᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛷᲁᲁ(Ljava/lang/Throwable;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲁᲁᛴᲁ()Z

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
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 11
    .line 12
    sget-wide v2, Lxhss/ᛸᛷᛳᲈ;->ᛱᛱᛲᲇ:J

    .line 13
    .line 14
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lxhss/ᛶᛷᛴᛶ;

    .line 19
    .line 20
    if-eqz p0, :cond_4

    .line 21
    .line 22
    sget-object v1, Lxhss/ᛵᛵᲇᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛵᛵᲇᛳ;

    .line 23
    .line 24
    if-ne p0, v1, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-interface {p0, p1}, Lxhss/ᛶᛷᛴᛶ;->ᛳᲁᲇᛸ(Ljava/lang/Throwable;)Z

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

.method public final ᛸᛲᛷᛱ()Ljava/util/concurrent/CancellationException;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lxhss/ᲇᲈᛵᲁ;

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
    check-cast v0, Lxhss/ᲇᲈᛵᲁ;

    .line 13
    .line 14
    invoke-virtual {v0}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

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
    new-instance v2, Lxhss/ᲈᛶᲈᛵ;

    .line 44
    .line 45
    invoke-direct {v2, v1, v0, p0}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_1
    return-object v3

    .line 50
    :cond_2
    invoke-static {p0, v2}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_3
    instance-of v1, v0, Lxhss/ᛲᲀᛵᛳ;

    .line 55
    .line 56
    if-nez v1, :cond_7

    .line 57
    .line 58
    instance-of v1, v0, Lxhss/ᛷᲁᲇᛷ;

    .line 59
    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    check-cast v0, Lxhss/ᛷᲁᲇᛷ;

    .line 63
    .line 64
    iget-object v0, v0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

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
    new-instance v1, Lxhss/ᲈᛶᲈᛵ;

    .line 76
    .line 77
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛶᲈᛶ()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2, v0, p0}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_5
    return-object v3

    .line 86
    :cond_6
    new-instance v0, Lxhss/ᲈᛶᲈᛵ;

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
    invoke-direct {v0, v1, v3, p0}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_7
    invoke-static {p0, v2}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v3
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p0, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 10
    .line 11
    :cond_0
    return-object p0
.end method

.method public final ᛸᛴᛸᛲ(Lxhss/ᛳᛵᲁᛵ;)V
    .locals 8

    .line 1
    new-instance v0, Lxhss/ᛴᲁᛶᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛱᛸᛲᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p1, Lxhss/ᛳᛵᲁᛵ;->ᛱᛱᛲᲇ:Z

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
    new-instance v1, Lxhss/ᛴᛸᲇᛲ;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lxhss/ᛴᛸᲇᛲ;-><init>(Lxhss/ᛴᲁᛶᛲ;)V

    .line 15
    .line 16
    .line 17
    move-object v7, v1

    .line 18
    :goto_0
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 19
    .line 20
    sget-wide v4, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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

.method public final ᛸᛶᛴᲈ(Lxhss/ᲇᲈᛵᲁ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lxhss/ᛷᲁᲇᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p2

    .line 7
    check-cast v0, Lxhss/ᛷᲁᲇᛷ;

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
    iget-object v0, v0, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move-object v0, v1

    .line 17
    :goto_1
    monitor-enter p1

    .line 18
    :try_start_0
    invoke-virtual {p1}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛴᛷᛱ()Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lxhss/ᲇᲈᛵᲁ;->ᲀᲇᛳᲁ(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    :try_start_1
    invoke-virtual {p1}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛴᛷᛱ()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_6

    .line 37
    .line 38
    new-instance v3, Lxhss/ᲈᛶᲈᛵ;

    .line 39
    .line 40
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛸᛶᲈᛶ()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-direct {v3, v5, v1, p0}, Lxhss/ᲈᛶᲈᛵ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lxhss/ᛸᛷᛳᲈ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    .line 47
    move-object v1, v3

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    :try_start_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    :try_start_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    move-object v6, v5

    .line 64
    check-cast v6, Ljava/lang/Throwable;

    .line 65
    .line 66
    instance-of v6, v6, Ljava/util/concurrent/CancellationException;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    .line 68
    if-nez v6, :cond_3

    .line 69
    .line 70
    move-object v1, v5

    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    goto :goto_5

    .line 75
    :cond_4
    :goto_2
    :try_start_4
    check-cast v1, Ljava/lang/Throwable;

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Throwable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 85
    .line 86
    :cond_6
    :goto_3
    if-eqz v1, :cond_9

    .line 87
    .line 88
    :try_start_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    const/4 v5, 0x1

    .line 93
    if-gt v3, v5, :cond_7

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 101
    .line 102
    invoke-direct {v5, v3}, Ljava/util/IdentityHashMap;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_9

    .line 118
    .line 119
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    check-cast v5, Ljava/lang/Throwable;

    .line 124
    .line 125
    if-eq v5, v1, :cond_8

    .line 126
    .line 127
    if-eq v5, v1, :cond_8

    .line 128
    .line 129
    instance-of v6, v5, Ljava/util/concurrent/CancellationException;

    .line 130
    .line 131
    if-nez v6, :cond_8

    .line 132
    .line 133
    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    if-eqz v6, :cond_8

    .line 138
    .line 139
    invoke-static {v1, v5}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :goto_5
    move-object v6, p1

    .line 144
    goto :goto_a

    .line 145
    :cond_9
    :goto_6
    monitor-exit p1

    .line 146
    if-nez v1, :cond_a

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_a
    if-ne v1, v0, :cond_b

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_b
    new-instance p2, Lxhss/ᛷᲁᲇᛷ;

    .line 153
    .line 154
    invoke-direct {p2, v1, v4}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 155
    .line 156
    .line 157
    :goto_7
    if-eqz v1, :cond_d

    .line 158
    .line 159
    invoke-virtual {p0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᛷᲁᲁ(Ljava/lang/Throwable;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_c

    .line 164
    .line 165
    invoke-virtual {p0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛴᲇᛲ(Ljava/lang/Throwable;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_d

    .line 170
    .line 171
    :cond_c
    move-object v2, p2

    .line 172
    check-cast v2, Lxhss/ᛷᲁᲇᛷ;

    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 178
    .line 179
    sget-wide v3, Lxhss/ᛷᲁᲇᛷ;->ᛱᛱᛲᲇ:J

    .line 180
    .line 181
    const/4 v5, 0x0

    .line 182
    const/4 v6, 0x1

    .line 183
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 184
    .line 185
    .line 186
    :cond_d
    invoke-virtual {p0, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛵᛷᛲᛸ(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    instance-of v0, p2, Lxhss/ᛲᲀᛵᛳ;

    .line 190
    .line 191
    if-eqz v0, :cond_e

    .line 192
    .line 193
    new-instance v0, Lxhss/ᲀᛳᲈᛳ;

    .line 194
    .line 195
    move-object v1, p2

    .line 196
    check-cast v1, Lxhss/ᛲᲀᛵᛳ;

    .line 197
    .line 198
    invoke-direct {v0, v1}, Lxhss/ᲀᛳᲈᛳ;-><init>(Lxhss/ᛲᲀᛵᛳ;)V

    .line 199
    .line 200
    .line 201
    move-object v7, v0

    .line 202
    goto :goto_8

    .line 203
    :cond_e
    move-object v7, p2

    .line 204
    :goto_8
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 205
    .line 206
    sget-wide v4, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 207
    .line 208
    move-object v3, p0

    .line 209
    move-object v6, p1

    .line 210
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-eqz p0, :cond_f

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_f
    invoke-virtual {v2, v3, v4, v5}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-eq p0, v6, :cond_10

    .line 222
    .line 223
    :goto_9
    invoke-virtual {v3, v6, p2}, Lxhss/ᛸᛷᛳᲈ;->ᛳᲈᲈᛲ(Lxhss/ᛲᲀᛵᛳ;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-object p2

    .line 227
    :cond_10
    move-object p0, v3

    .line 228
    move-object p1, v6

    .line 229
    goto :goto_8

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    move-object v6, p1

    .line 232
    move-object p0, v0

    .line 233
    :goto_a
    monitor-exit v6

    .line 234
    throw p0
.end method

.method public ᛸᛶᲈᛶ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Job was cancelled"

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛸᛷᲈᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public ᲀᛷᲁᲀ(Lxhss/ᛵᛲᛲᲇ;)V
    .locals 0

    .line 1
    throw p1
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛱᛷᛵᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛴᛵᛳᛵ;)Lxhss/ᛴᛵᛳᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᲁᛲᛴᛴ(Lxhss/ᛲᲀᛵᛳ;)Lxhss/ᛴᲁᛶᛲ;
    .locals 2

    .line 1
    invoke-interface {p1}, Lxhss/ᛲᲀᛵᛳ;->ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    instance-of v0, p1, Lxhss/ᛳᛵᲁᛵ;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lxhss/ᛴᲁᛶᛲ;

    .line 12
    .line 13
    invoke-direct {p0}, Lxhss/ᛱᛸᛲᛴ;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    instance-of v0, p1, Lxhss/ᛴᛷᛴᲀ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lxhss/ᛴᛷᛴᲀ;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛷᲇᲇ(Lxhss/ᛴᛷᛴᲀ;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    const-string p0, "State should have list: "

    .line 29
    .line 30
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_2
    return-object v0
.end method

.method public ᲁᛴᲇᛲ(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᲁᛷᲇᲇ(Lxhss/ᛴᛷᛴᲀ;)V
    .locals 14

    .line 1
    new-instance v5, Lxhss/ᛴᲁᛶᛲ;

    .line 2
    .line 3
    invoke-direct {v5}, Lxhss/ᛱᛸᛲᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lxhss/ᛱᛸᛲᛴ;->ᛳᲁᲇᛸ:J

    .line 9
    .line 10
    invoke-virtual {v0, v5, v1, v2, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-wide v6, Lxhss/ᛱᛸᛲᛴ;->ᛱᛱᛲᲇ:J

    .line 14
    .line 15
    invoke-virtual {v0, v5, v6, v7, p1}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛴᛶᛳ()Ljava/lang/Object;

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
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 27
    .line 28
    sget-wide v2, Lxhss/ᛱᛸᛲᛴ;->ᛱᛱᛲᲇ:J

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
    invoke-virtual {v5, v1}, Lxhss/ᛱᛸᛲᛴ;->ᲀᲇᛳᲁ(Lxhss/ᛱᛸᛲᛴ;)V

    .line 39
    .line 40
    .line 41
    :goto_2
    invoke-virtual {v1}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛲᲀᛵ()Lxhss/ᛱᛸᛲᛴ;

    .line 42
    .line 43
    .line 44
    move-result-object v13

    .line 45
    :goto_3
    sget-object v8, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 46
    .line 47
    sget-wide v10, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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

.method public ᲁᲁᛴᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᲇᲁᛵᲈ;)Lxhss/ᛳᛵᲈᛲ;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛳᛴᲀᲁ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᲀᲁ;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public ᲇᛸᛳᲁ(Ljava/lang/Throwable;)Z
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
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛳᲀ(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛴᲈᛱᛴ()Z

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

.method public final ᲈᛲᛵᲁ()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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

.method public final ᲈᛳᲀ(Ljava/lang/Object;)Z
    .locals 12

    .line 1
    sget-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᛳᛶᛷᲀ()Z

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
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lxhss/ᛲᲀᛵᛳ;

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    instance-of v1, v0, Lxhss/ᲇᲈᛵᲁ;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lxhss/ᲇᲈᛵᲁ;

    .line 25
    .line 26
    invoke-virtual {v1}, Lxhss/ᲇᲈᛵᲁ;->ᲇᛶᛴᲀ()Z

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
    new-instance v1, Lxhss/ᛷᲁᲇᛷ;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct {v1, v4, v2}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Lxhss/ᛸᛷᛳᲈ;->ᛱᲁᛳᛲ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

    .line 47
    .line 48
    if-eq v0, v1, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 52
    .line 53
    :goto_1
    sget-object v1, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 54
    .line 55
    if-ne v0, v1, :cond_3

    .line 56
    .line 57
    goto/16 :goto_9

    .line 58
    .line 59
    :cond_3
    sget-object v1, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

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
    invoke-virtual {p0}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    instance-of v5, v4, Lxhss/ᲇᲈᛵᲁ;

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
    check-cast v5, Lxhss/ᲇᲈᛵᲁ;

    .line 76
    .line 77
    sget-object v6, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 78
    .line 79
    sget-wide v7, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ:J

    .line 80
    .line 81
    invoke-virtual {v6, v5, v7, v8}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    sget-object v6, Lxhss/ᛵᛶᲀᲇ;->ᲀᲇᛳᲁ:Lxhss/ᛶᛲᛷᛵ;

    .line 86
    .line 87
    if-ne v5, v6, :cond_4

    .line 88
    .line 89
    sget-object p1, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛲᛷᛵ;
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
    check-cast v5, Lxhss/ᲇᲈᛵᲁ;

    .line 101
    .line 102
    invoke-virtual {v5}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛴᛷᛱ()Z

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
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    :cond_6
    move-object p1, v4

    .line 117
    check-cast p1, Lxhss/ᲇᲈᛵᲁ;

    .line 118
    .line 119
    invoke-virtual {p1, v1}, Lxhss/ᲇᲈᛵᲁ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    move-object p1, v4

    .line 123
    check-cast p1, Lxhss/ᲇᲈᛵᲁ;

    .line 124
    .line 125
    invoke-virtual {p1}, Lxhss/ᲇᲈᛵᲁ;->ᛳᲁᲇᛸ()Ljava/lang/Throwable;

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
    check-cast v4, Lxhss/ᲇᲈᛵᲁ;

    .line 136
    .line 137
    iget-object p1, v4, Lxhss/ᲇᲈᛵᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲁᛶᛲ;

    .line 138
    .line 139
    invoke-virtual {p0, p1, v0}, Lxhss/ᛸᛷᛳᲈ;->ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    sget-object p1, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

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
    instance-of v5, v4, Lxhss/ᛲᲀᛵᛳ;

    .line 148
    .line 149
    if-eqz v5, :cond_12

    .line 150
    .line 151
    if-nez v1, :cond_b

    .line 152
    .line 153
    invoke-virtual {p0, p1}, Lxhss/ᛸᛷᛳᲈ;->ᛶᲇᲈᛸ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    :cond_b
    move-object v9, v4

    .line 158
    check-cast v9, Lxhss/ᛲᲀᛵᛳ;

    .line 159
    .line 160
    invoke-interface {v9}, Lxhss/ᛲᲀᛵᛳ;->ᛱᛱᛲᲇ()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_f

    .line 165
    .line 166
    invoke-virtual {p0, v9}, Lxhss/ᛸᛷᛳᲈ;->ᲁᛲᛴᛴ(Lxhss/ᛲᲀᛵᛳ;)Lxhss/ᛴᲁᛶᛲ;

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
    new-instance v10, Lxhss/ᲇᲈᛵᲁ;

    .line 175
    .line 176
    invoke-direct {v10, v11, v1}, Lxhss/ᲇᲈᛵᲁ;-><init>(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    :goto_5
    sget-object v5, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 180
    .line 181
    sget-wide v7, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

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
    invoke-virtual {v6, v11, v1}, Lxhss/ᛸᛷᛳᲈ;->ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᛲ;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

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
    new-instance p0, Lxhss/ᛷᲁᲇᛷ;

    .line 208
    .line 209
    invoke-direct {p0, v1, v2}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6, v4, p0}, Lxhss/ᛸᛷᛳᲈ;->ᛱᲁᛳᛲ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    sget-object v5, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 217
    .line 218
    if-eq p0, v5, :cond_11

    .line 219
    .line 220
    sget-object v4, Lxhss/ᛵᛶᲀᲇ;->ᛷᛴᛷᛱ:Lxhss/ᛶᛲᛷᛵ;

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
    invoke-static {v4, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᲈᲈᛲ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return v2

    .line 234
    :cond_12
    move-object v6, p0

    .line 235
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛲᛷᛵ;

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_13
    move-object v6, p0

    .line 239
    :goto_8
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛶᛲᛷᛵ;

    .line 240
    .line 241
    if-ne v0, p0, :cond_14

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_14
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛴᲇᛵ:Lxhss/ᛶᛲᛷᛵ;

    .line 245
    .line 246
    if-ne v0, p0, :cond_15

    .line 247
    .line 248
    :goto_9
    return v3

    .line 249
    :cond_15
    sget-object p0, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ:Lxhss/ᛶᛲᛷᛵ;

    .line 250
    .line 251
    if-ne v0, p0, :cond_16

    .line 252
    .line 253
    return v2

    .line 254
    :cond_16
    invoke-virtual {v6, v0}, Lxhss/ᛸᛷᛳᲈ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return v3
.end method
