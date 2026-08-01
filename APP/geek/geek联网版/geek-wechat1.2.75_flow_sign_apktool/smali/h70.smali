.class public final Lh70;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/util/HashMap;

.field public b:D

.field public c:D


# direct methods
.method public static a(DD)Lh70;
    .locals 16

    .line 1
    new-instance v6, Lh70;

    .line 2
    .line 3
    const-wide/high16 v4, 0x4049000000000000L    # 50.0

    .line 4
    .line 5
    move-wide/from16 v0, p0

    .line 6
    .line 7
    move-wide/from16 v2, p2

    .line 8
    .line 9
    invoke-static/range {v0 .. v5}, Lqo;->a(DDD)Lqo;

    .line 10
    .line 11
    .line 12
    move-result-object v7

    .line 13
    move-wide v8, v4

    .line 14
    iget-wide v0, v7, Lqo;->a:D

    .line 15
    .line 16
    sub-double v0, v0, p2

    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 23
    .line 24
    move-wide v12, v0

    .line 25
    move-wide v14, v10

    .line 26
    :goto_0
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 27
    .line 28
    cmpg-double v0, v14, v0

    .line 29
    .line 30
    if-gez v0, :cond_0

    .line 31
    .line 32
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->round(D)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iget-wide v2, v7, Lqo;->a:D

    .line 37
    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    cmp-long v0, v0, v2

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    :cond_0
    move-wide/from16 v2, p2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    add-double v4, v8, v14

    .line 50
    .line 51
    move-wide/from16 v0, p0

    .line 52
    .line 53
    move-wide/from16 v2, p2

    .line 54
    .line 55
    invoke-static/range {v0 .. v5}, Lqo;->a(DDD)Lqo;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    iget-wide v0, v4, Lqo;->a:D

    .line 60
    .line 61
    sub-double v0, v0, p2

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    cmpg-double v2, v0, v12

    .line 68
    .line 69
    if-gez v2, :cond_2

    .line 70
    .line 71
    move-wide v12, v0

    .line 72
    move-object v7, v4

    .line 73
    :cond_2
    sub-double v4, v8, v14

    .line 74
    .line 75
    move-wide/from16 v0, p0

    .line 76
    .line 77
    move-wide/from16 v2, p2

    .line 78
    .line 79
    invoke-static/range {v0 .. v5}, Lqo;->a(DDD)Lqo;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-wide v0, v4, Lqo;->a:D

    .line 84
    .line 85
    sub-double/2addr v0, v2

    .line 86
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    cmpg-double v5, v0, v12

    .line 91
    .line 92
    if-gez v5, :cond_3

    .line 93
    .line 94
    move-wide v12, v0

    .line 95
    move-object v7, v4

    .line 96
    :cond_3
    add-double/2addr v14, v10

    .line 97
    goto :goto_0

    .line 98
    :goto_1
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v0, v6, Lh70;->a:Ljava/util/HashMap;

    .line 107
    .line 108
    move-wide/from16 v0, p0

    .line 109
    .line 110
    iput-wide v0, v6, Lh70;->b:D

    .line 111
    .line 112
    iput-wide v2, v6, Lh70;->c:D

    .line 113
    .line 114
    return-object v6
.end method


# virtual methods
.method public final b(I)I
    .locals 8

    .line 1
    iget-object v0, p0, Lh70;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-wide v2, p0, Lh70;->b:D

    .line 16
    .line 17
    iget-wide v4, p0, Lh70;->c:D

    .line 18
    .line 19
    int-to-double v6, p1

    .line 20
    invoke-static/range {v2 .. v7}, Lqo;->a(DDD)Lqo;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v1, v1, Lqo;->b:I

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method
