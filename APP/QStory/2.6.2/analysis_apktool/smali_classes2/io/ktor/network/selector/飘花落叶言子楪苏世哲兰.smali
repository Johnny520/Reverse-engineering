.class public final Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世兰哲苏:Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;

.field public static final synthetic 飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final synthetic 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子楪苏世哲兰:J


# instance fields
.field private volatile synthetic _next:Ljava/lang/Object;

.field private volatile synthetic _state:J

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    const-class v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    const-class v1, Ljava/lang/Object;

    .line 11
    .line 12
    const-string v2, "_next"

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    sput-object v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    sput-wide v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 31
    .line 32
    const-string v1, "_state"

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    add-int/lit8 v0, p1, -0x1

    .line 7
    .line 8
    iput v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_next:Ljava/lang/Object;

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 16
    .line 17
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 18
    .line 19
    invoke-direct {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 23
    .line 24
    const p0, 0x3fffffff    # 1.9999999f

    .line 25
    .line 26
    .line 27
    const-string v1, "Check failed."

    .line 28
    .line 29
    if-gt v0, p0, :cond_1

    .line 30
    .line 31
    and-int p0, p1, v0

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0

    .line 41
    :cond_1
    invoke-static {v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-wide v2, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 4
    .line 5
    const-wide/high16 v6, 0x1000000000000000L

    .line 6
    .line 7
    and-long v4, v2, v6

    .line 8
    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    cmp-long v0, v4, v8

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏:Lio/ktor/network/selector/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-wide/32 v10, 0x3fffffff

    .line 19
    .line 20
    .line 21
    and-long v4, v2, v10

    .line 22
    .line 23
    long-to-int v12, v4

    .line 24
    const-wide v4, 0xfffffffc0000000L

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v4, v2

    .line 30
    const/16 v0, 0x1e

    .line 31
    .line 32
    shr-long/2addr v4, v0

    .line 33
    long-to-int v0, v4

    .line 34
    iget v4, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 35
    .line 36
    and-int/2addr v0, v4

    .line 37
    and-int/2addr v4, v12

    .line 38
    const/4 v13, 0x0

    .line 39
    if-ne v0, v4, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v0, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v14

    .line 48
    if-nez v14, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    instance-of v0, v14, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    :goto_0
    return-object v13

    .line 56
    :cond_3
    add-int/lit8 v0, v12, 0x1

    .line 57
    .line 58
    const v4, 0x3fffffff    # 1.9999999f

    .line 59
    .line 60
    .line 61
    and-int/2addr v0, v4

    .line 62
    sget-object v4, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 63
    .line 64
    const-wide/32 v15, -0x40000000

    .line 65
    .line 66
    .line 67
    and-long v17, v2, v15

    .line 68
    .line 69
    move-wide/from16 v19, v6

    .line 70
    .line 71
    int-to-long v6, v0

    .line 72
    or-long v17, v17, v6

    .line 73
    .line 74
    move-object v0, v4

    .line 75
    move-wide/from16 v4, v17

    .line 76
    .line 77
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    iget-object v0, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 84
    .line 85
    iget v1, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 86
    .line 87
    and-int/2addr v1, v12

    .line 88
    invoke-virtual {v0, v1, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object v14

    .line 92
    :cond_4
    :goto_1
    iget-wide v2, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 93
    .line 94
    and-long v4, v2, v10

    .line 95
    .line 96
    long-to-int v0, v4

    .line 97
    if-ne v0, v12, :cond_7

    .line 98
    .line 99
    and-long v4, v2, v19

    .line 100
    .line 101
    cmp-long v4, v4, v8

    .line 102
    .line 103
    if-eqz v4, :cond_5

    .line 104
    .line 105
    invoke-virtual {v1}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object v1, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    sget-object v21, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 112
    .line 113
    and-long v4, v2, v15

    .line 114
    .line 115
    or-long v25, v4, v6

    .line 116
    .line 117
    move-object/from16 v22, v1

    .line 118
    .line 119
    move-wide/from16 v23, v2

    .line 120
    .line 121
    invoke-virtual/range {v21 .. v26}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    move-object/from16 v2, v22

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    iget-object v1, v2, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 130
    .line 131
    iget v2, v2, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 132
    .line 133
    and-int/2addr v0, v2

    .line 134
    invoke-virtual {v1, v0, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v1, v13

    .line 138
    :goto_2
    if-nez v1, :cond_4

    .line 139
    .line 140
    return-object v14

    .line 141
    :cond_6
    move-object v1, v2

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    const-string v0, "This queue can have only one consumer"

    .line 144
    .line 145
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-object v13
.end method

.method public final 飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;
    .locals 8

    .line 1
    :goto_0
    iget-wide v2, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 2
    .line 3
    const-wide/high16 v0, 0x1000000000000000L

    .line 4
    .line 5
    and-long v4, v2, v0

    .line 6
    .line 7
    const-wide/16 v6, 0x0

    .line 8
    .line 9
    cmp-long v4, v4, v6

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v1, p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    or-long v4, v2, v0

    .line 16
    .line 17
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    move-wide v2, v4

    .line 27
    :goto_1
    invoke-virtual {v1, v2, v3}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(J)Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    move-object p0, v1

    .line 33
    goto :goto_0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 2
    .line 3
    const-wide/32 v2, 0x3fffffff

    .line 4
    .line 5
    .line 6
    and-long/2addr v2, v0

    .line 7
    long-to-int p0, v2

    .line 8
    const-wide v2, 0xfffffffc0000000L

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    and-long/2addr v0, v2

    .line 14
    const/16 v2, 0x1e

    .line 15
    .line 16
    shr-long/2addr v0, v2

    .line 17
    long-to-int v0, v0

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Z
    .locals 9

    .line 1
    :goto_0
    iget-wide v2, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 2
    .line 3
    const-wide/high16 v0, 0x2000000000000000L

    .line 4
    .line 5
    and-long v4, v2, v0

    .line 6
    .line 7
    const-wide/16 v6, 0x0

    .line 8
    .line 9
    cmp-long v4, v4, v6

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    return v8

    .line 15
    :cond_0
    const-wide/high16 v4, 0x1000000000000000L

    .line 16
    .line 17
    and-long/2addr v4, v2

    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    or-long v4, v2, v0

    .line 25
    .line 26
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 27
    .line 28
    move-object v1, p0

    .line 29
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    return v8

    .line 36
    :cond_2
    move-object p0, v1

    .line 37
    goto :goto_0
.end method

.method public final 飘花落叶言子楪世苏兰哲(J)Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;
    .locals 8

    .line 1
    :goto_0
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_next:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 9
    .line 10
    new-instance v6, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 11
    .line 12
    iget v1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 13
    .line 14
    mul-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    invoke-direct {v6, v1}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const-wide/32 v1, 0x3fffffff

    .line 20
    .line 21
    .line 22
    and-long/2addr v1, p1

    .line 23
    long-to-int v1, v1

    .line 24
    const-wide v2, 0xfffffffc0000000L

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v2, p1

    .line 30
    const/16 v4, 0x1e

    .line 31
    .line 32
    shr-long/2addr v2, v4

    .line 33
    long-to-int v2, v2

    .line 34
    :goto_1
    iget v3, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 35
    .line 36
    and-int v4, v1, v3

    .line 37
    .line 38
    and-int/2addr v3, v2

    .line 39
    if-eq v4, v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v6, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 42
    .line 43
    iget v5, v6, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 44
    .line 45
    and-int/2addr v5, v1

    .line 46
    iget-object v7, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 47
    .line 48
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    if-nez v4, :cond_1

    .line 53
    .line 54
    new-instance v4, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;

    .line 55
    .line 56
    invoke-direct {v4, v1}, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v3, v5, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const-wide v1, -0x1000000000000001L    # -3.1050361846014175E231

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v1, p1

    .line 71
    iput-wide v1, v6, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 72
    .line 73
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 77
    .line 78
    sget-wide v3, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    move-object v2, p0

    .line 82
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    :goto_3
    move-object p0, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    move-object p0, v2

    .line 98
    goto :goto_2
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)I
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-wide v2, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 5
    .line 6
    const-wide/high16 v0, 0x3000000000000000L    # 1.727233711018889E-77

    .line 7
    .line 8
    and-long/2addr v0, v2

    .line 9
    const-wide/16 v6, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v6

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-wide/high16 p0, 0x2000000000000000L

    .line 17
    .line 18
    and-long/2addr p0, v2

    .line 19
    cmp-long p0, p0, v6

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    return p0

    .line 25
    :cond_0
    return v1

    .line 26
    :cond_1
    const-wide/32 v4, 0x3fffffff

    .line 27
    .line 28
    .line 29
    and-long/2addr v4, v2

    .line 30
    long-to-int v0, v4

    .line 31
    const-wide v4, 0xfffffffc0000000L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v4, v2

    .line 37
    const/16 v8, 0x1e

    .line 38
    .line 39
    shr-long/2addr v4, v8

    .line 40
    long-to-int v9, v4

    .line 41
    add-int/lit8 v4, v9, 0x2

    .line 42
    .line 43
    iget v5, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 44
    .line 45
    and-int/2addr v4, v5

    .line 46
    and-int/2addr v0, v5

    .line 47
    if-ne v4, v0, :cond_2

    .line 48
    .line 49
    return v1

    .line 50
    :cond_2
    add-int/lit8 v0, v9, 0x1

    .line 51
    .line 52
    const v1, 0x3fffffff    # 1.9999999f

    .line 53
    .line 54
    .line 55
    and-int/2addr v0, v1

    .line 56
    move v1, v0

    .line 57
    sget-object v0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 58
    .line 59
    const-wide v4, -0xfffffffc0000001L    # -3.1050369248997324E231

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v4, v2

    .line 65
    int-to-long v10, v1

    .line 66
    shl-long/2addr v10, v8

    .line 67
    or-long/2addr v4, v10

    .line 68
    move-object v1, p0

    .line 69
    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    iget-object p0, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 76
    .line 77
    iget v0, v1, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 78
    .line 79
    and-int/2addr v0, v9

    .line 80
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object p0, v1

    .line 84
    :cond_3
    iget-wide v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->_state:J

    .line 85
    .line 86
    const-wide/high16 v2, 0x1000000000000000L

    .line 87
    .line 88
    and-long/2addr v0, v2

    .line 89
    cmp-long v0, v0, v6

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {p0}, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object v0, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 98
    .line 99
    iget v1, p0, Lio/ktor/network/selector/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 100
    .line 101
    and-int/2addr v1, v9

    .line 102
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    instance-of v3, v2, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;

    .line 107
    .line 108
    if-eqz v3, :cond_4

    .line 109
    .line 110
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;

    .line 111
    .line 112
    iget v2, v2, Lio/ktor/network/selector/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 113
    .line 114
    if-ne v2, v9, :cond_4

    .line 115
    .line 116
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const/4 p0, 0x0

    .line 121
    :goto_1
    if-nez p0, :cond_3

    .line 122
    .line 123
    :cond_5
    const/4 p0, 0x0

    .line 124
    return p0

    .line 125
    :cond_6
    move-object p0, v1

    .line 126
    goto :goto_0
.end method
