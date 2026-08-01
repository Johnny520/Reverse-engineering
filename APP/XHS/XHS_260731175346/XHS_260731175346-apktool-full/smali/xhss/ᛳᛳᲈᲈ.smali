.class public final Lxhss/ᛳᛳᲈᲈ;
.super Lxhss/ᛴᛷᛴᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final synthetic ᛸᛲᲀᛵ:J


# instance fields
.field private volatile synthetic _disposer$volatile:Ljava/lang/Object;

.field public final synthetic ᛸᛴᛶᛳ:Lxhss/ᛸᛱᛶᛲ;

.field public ᲀᲇᛳᲁ:Lxhss/ᛱᛲᲁᲇ;

.field public final ᲇᛶᛴᲀ:Lxhss/ᛲᛶᛳᲁ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛳᛳᲈᲈ;

    .line 4
    .line 5
    const-string v2, "_disposer$volatile"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lxhss/ᛳᛳᲈᲈ;->ᛸᛲᲀᛵ:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lxhss/ᛸᛱᛶᛲ;Lxhss/ᛲᛶᛳᲁ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛳᛳᲈᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᛱᛶᛲ;

    .line 2
    .line 3
    invoke-direct {p0}, Lxhss/ᛱᛸᛲᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᛳᲈᲈ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛶᛳᲁ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᲁᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v3, p0, Lxhss/ᛳᛳᲈᲈ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛶᛳᲁ;

    .line 4
    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    new-instance v8, Lxhss/ᛷᲁᲇᛷ;

    .line 8
    .line 9
    invoke-direct {v8, p1, v1}, Lxhss/ᛷᲁᲇᛷ;-><init>(Ljava/lang/Throwable;Z)V

    .line 10
    .line 11
    .line 12
    sget-object p1, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛲᛷᛵ;

    .line 13
    .line 14
    sget-wide v9, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 15
    .line 16
    :goto_0
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 17
    .line 18
    invoke-virtual {v1, v3, v9, v10}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    instance-of v2, v6, Lxhss/ᛲᲇᛱᛶ;

    .line 23
    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    move-object v1, v6

    .line 27
    check-cast v1, Lxhss/ᛲᲇᛱᛶ;

    .line 28
    .line 29
    iget v2, v3, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 30
    .line 31
    invoke-static {v1, v8, v2}, Lxhss/ᛲᛶᛳᲁ;->ᲁᛲᛴᛴ(Lxhss/ᛲᲇᛱᛶ;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    :cond_0
    sget-object v2, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 36
    .line 37
    sget-wide v4, Lxhss/ᛲᛶᛳᲁ;->ᛸᛲᲀᛵ:J

    .line 38
    .line 39
    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Lxhss/ᛲᛶᛳᲁ;->ᛶᲇᲈᛸ()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v3}, Lxhss/ᛲᛶᛳᲁ;->ᛷᲁᲁ()V

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v0, p1

    .line 55
    move-object v1, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-virtual {v2, v3, v9, v10}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eq v1, v6, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    :goto_1
    if-eqz v0, :cond_a

    .line 65
    .line 66
    iget p1, v3, Lxhss/ᲇᛷᛲᛱ;->ᲇᛴᲇᛵ:I

    .line 67
    .line 68
    invoke-virtual {v3, p1}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛶᲈᛶ(I)V

    .line 69
    .line 70
    .line 71
    sget-wide v2, Lxhss/ᛳᛳᲈᲈ;->ᛸᛲᲀᛵ:J

    .line 72
    .line 73
    invoke-virtual {v1, p0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Lxhss/ᛷᲁᛸᲀ;

    .line 78
    .line 79
    if-eqz p0, :cond_a

    .line 80
    .line 81
    invoke-virtual {p0}, Lxhss/ᛷᲁᛸᲀ;->ᛱᛱᛲᲇ()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    sget-object p1, Lxhss/ᛸᛱᛶᛲ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 86
    .line 87
    iget-object p0, p0, Lxhss/ᛳᛳᲈᲈ;->ᛸᛴᛶᛳ:Lxhss/ᛸᛱᛶᛲ;

    .line 88
    .line 89
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_a

    .line 94
    .line 95
    iget-object p0, p0, Lxhss/ᛸᛱᛶᛲ;->ᛷᛵᛵᲈ:[Lxhss/ᛲᛳᛲᛷ;

    .line 96
    .line 97
    new-instance p1, Ljava/util/ArrayList;

    .line 98
    .line 99
    array-length v2, p0

    .line 100
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    array-length v2, p0

    .line 104
    :goto_2
    if-ge v1, v2, :cond_9

    .line 105
    .line 106
    aget-object v4, p0, v1

    .line 107
    .line 108
    invoke-virtual {v4}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    instance-of v5, v4, Lxhss/ᛲᲀᛵᛳ;

    .line 113
    .line 114
    if-nez v5, :cond_8

    .line 115
    .line 116
    instance-of v5, v4, Lxhss/ᛷᲁᲇᛷ;

    .line 117
    .line 118
    if-nez v5, :cond_7

    .line 119
    .line 120
    instance-of v5, v4, Lxhss/ᲀᛳᲈᛳ;

    .line 121
    .line 122
    if-eqz v5, :cond_5

    .line 123
    .line 124
    move-object v5, v4

    .line 125
    check-cast v5, Lxhss/ᲀᛳᲈᛳ;

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move-object v5, v0

    .line 129
    :goto_3
    if-eqz v5, :cond_6

    .line 130
    .line 131
    iget-object v4, v5, Lxhss/ᲀᛳᲈᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛲᲀᛵᛳ;

    .line 132
    .line 133
    :cond_6
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    check-cast v4, Lxhss/ᛷᲁᲇᛷ;

    .line 140
    .line 141
    iget-object p0, v4, Lxhss/ᛷᲁᲇᛷ;->ᛷᛵᛵᲈ:Ljava/lang/Throwable;

    .line 142
    .line 143
    throw p0

    .line 144
    :cond_8
    const-string p0, "This job has not completed yet"

    .line 145
    .line 146
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_9
    invoke-virtual {v3, p1}, Lxhss/ᛲᛶᛳᲁ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_a
    return-void
.end method
