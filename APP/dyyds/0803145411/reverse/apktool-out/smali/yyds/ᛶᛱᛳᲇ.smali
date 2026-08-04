.class public abstract Lyyds/ᛶᛱᛳᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛲᲈᲁ:J

.field public static final synthetic ᛵᛸᛸᛷ:J


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _prev$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛶᛱᛳᲇ;

    .line 4
    .line 5
    const-string v2, "_next$volatile"

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
    sput-wide v2, Lyyds/ᛶᛱᛳᲇ;->ᛲᲈᲁ:J

    .line 16
    .line 17
    const-string v2, "_prev$volatile"

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
    sput-wide v0, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ:J

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lyyds/ᛵᛳᛳᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛶᛱᛳᲇ;->_prev$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract ᛵᛸᛸᛷ()Z
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 14

    .line 1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    sget-wide v1, Lyyds/ᛶᛱᛳᲇ;->ᛲᲈᲁ:J

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v3, Lyyds/ᛶᛶᲁᲇ;->ᛲᲈᲁ:Lyyds/ᛲᛸᛴᛶ;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    move-object v0, v4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast v0, Lyyds/ᛶᛱᛳᲇ;

    .line 17
    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v0, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v5, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ:J

    .line 24
    .line 25
    invoke-virtual {v0, p0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lyyds/ᛶᛱᛳᲇ;

    .line 30
    .line 31
    :goto_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_2

    .line 38
    .line 39
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 40
    .line 41
    invoke-virtual {v7, v0, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lyyds/ᛶᛱᛳᲇ;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 49
    .line 50
    invoke-virtual {v7, p0, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-ne v7, v3, :cond_3

    .line 55
    .line 56
    move-object v7, v4

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    check-cast v7, Lyyds/ᛶᛱᛳᲇ;

    .line 59
    .line 60
    :cond_4
    :goto_2
    move-object v9, v7

    .line 61
    invoke-virtual {v9}, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ()Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-eqz v7, :cond_6

    .line 66
    .line 67
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 68
    .line 69
    invoke-virtual {v7, v9, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    if-ne v7, v3, :cond_5

    .line 74
    .line 75
    move-object v7, v4

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    check-cast v7, Lyyds/ᛶᛱᛳᲇ;

    .line 78
    .line 79
    :goto_3
    if-nez v7, :cond_4

    .line 80
    .line 81
    :cond_6
    :goto_4
    sget-object v7, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 82
    .line 83
    invoke-virtual {v7, v9, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    move-object v7, v12

    .line 88
    check-cast v7, Lyyds/ᛶᛱᛳᲇ;

    .line 89
    .line 90
    if-nez v7, :cond_7

    .line 91
    .line 92
    move-object v13, v4

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    move-object v13, v0

    .line 95
    :cond_8
    :goto_5
    sget-object v8, Lyyds/ᲀᲇᛵᛱ;->ᛲᲈᲁ:Lsun/misc/Unsafe;

    .line 96
    .line 97
    sget-wide v10, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ:J

    .line 98
    .line 99
    invoke-virtual/range {v8 .. v13}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_d

    .line 104
    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    invoke-virtual {v8, v0, v1, v2, v9}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_9
    invoke-virtual {v9}, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ()Z

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    if-eqz v5, :cond_b

    .line 115
    .line 116
    invoke-virtual {v8, v9, v1, v2}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    if-ne v5, v3, :cond_a

    .line 121
    .line 122
    move-object v5, v4

    .line 123
    goto :goto_6

    .line 124
    :cond_a
    check-cast v5, Lyyds/ᛶᛱᛳᲇ;

    .line 125
    .line 126
    :goto_6
    if-nez v5, :cond_1

    .line 127
    .line 128
    :cond_b
    if-eqz v0, :cond_c

    .line 129
    .line 130
    invoke-virtual {v0}, Lyyds/ᛶᛱᛳᲇ;->ᛵᛸᛸᛷ()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_1

    .line 135
    .line 136
    :cond_c
    return-void

    .line 137
    :cond_d
    invoke-virtual {v8, v9, v5, v6}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    if-eq v7, v12, :cond_8

    .line 142
    .line 143
    goto :goto_4
.end method
