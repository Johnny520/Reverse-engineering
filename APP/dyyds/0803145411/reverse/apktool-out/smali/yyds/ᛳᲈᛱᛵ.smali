.class public final Lyyds/ᛳᲈᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

.field public static final ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;


# instance fields
.field public ᛲᛴᛳᛲ:J

.field public final ᲀᛲᛳᲀ:Ljava/util/ArrayList;

.field public final ᲇᲇᲇᛱ:Ljava/util/ArrayList;

.field public ᲇᲈᛵᛷ:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛳᲈᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Lyyds/ᛶᛳᛶᛵ;

    .line 9
    .line 10
    const/16 v1, 0xe

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛳᲈᛱᛵ;->ᛱᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Lyyds/ᛵᲇᛲᛱ;IJ)Lyyds/ᛱᛸᛳᛵ;
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᲈᲇᲀᛲ;->ᛱᛳᲇ()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Lyyds/ᲈᲇᲀᛲ;->ᛲᛲᲈᲈ(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Lyyds/ᛵᲇᛲᛱ;->ᛸᛴᛵᛶ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget v4, v3, Lyyds/ᛱᛸᛳᛵ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    if-ne v4, p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v3}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0

    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, p0, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 37
    .line 38
    const-wide v2, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v2, p2, v2

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    :try_start_0
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    const-string v2, "RV Prefetch forced - needed next frame"

    .line 54
    .line 55
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->ᲁᛵᲁᲁ()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1, p2, p3}, Lyyds/ᲈᲈᲁᛱ;->ᛷᛲᲈᛱ(IJ)Lyyds/ᛱᛸᛳᛵ;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    invoke-virtual {p1}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-nez p2, :cond_3

    .line 81
    .line 82
    iget-object p2, p1, Lyyds/ᛱᛸᛳᛵ;->ᛲᲈᲁ:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {v0, p2}, Lyyds/ᲈᲈᲁᛱ;->ᛱᲈᲁ(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {v0, p1, v1}, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ(Lyyds/ᛱᛸᛳᛵ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_2
    invoke-virtual {p0, v1}, Lyyds/ᛵᲇᛲᛱ;->ᛳᛷᛶᛲ(Z)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :goto_3
    invoke-virtual {p0, v1}, Lyyds/ᛵᲇᛲᛱ;->ᛳᛷᛶᛲ(Z)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 102
    .line 103
    .line 104
    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    const-string v3, "RV Prefetch"

    .line 6
    .line 7
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :goto_0
    iput-wide v1, p0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲈᛵᛷ:J

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    move-wide v5, v1

    .line 28
    :goto_1
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Lyyds/ᛵᲇᛲᛱ;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    cmp-long v0, v5, v1

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    iget-wide v5, p0, Lyyds/ᛳᲈᛱᛵ;->ᛲᛴᛳᛲ:J

    .line 68
    .line 69
    add-long/2addr v3, v5

    .line 70
    invoke-virtual {p0, v3, v4}, Lyyds/ᛳᲈᛱᛵ;->ᛵᛸᛸᛷ(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_3
    iput-wide v1, p0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲈᛵᛷ:J

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    throw v0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛵᲇᛲᛱ;II)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Lyyds/ᛵᲇᛲᛱ;->ᛶᲈᛴᲈ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-boolean v0, Lyyds/ᛵᲇᛲᛱ;->ᛶᛵᛸᛳ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "attempting to post unregistered view!"

    .line 19
    .line 20
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-wide v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲈᛵᛷ:J

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->getNanoTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲈᛵᛷ:J

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p0, p1, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 42
    .line 43
    iput p2, p0, Lyyds/ᲁᲇᛷᛳ;->ᛲᲈᲁ:I

    .line 44
    .line 45
    iput p3, p0, Lyyds/ᲁᲇᛷᛳ;->ᲀᛲᛳᲀ:I

    .line 46
    .line 47
    return-void
.end method

.method public final ᛵᛸᛸᛷ(J)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-object v3, v0, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    const/4 v5, 0x0

    .line 12
    move v6, v5

    .line 13
    move v7, v6

    .line 14
    :goto_0
    if-ge v6, v4, :cond_1

    .line 15
    .line 16
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v8

    .line 20
    check-cast v8, Lyyds/ᛵᲇᛲᛱ;

    .line 21
    .line 22
    invoke-virtual {v8}, Landroid/view/View;->getWindowVisibility()I

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    iget-object v10, v8, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 27
    .line 28
    if-nez v9, :cond_0

    .line 29
    .line 30
    invoke-virtual {v10, v8, v5}, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛵᲇᛲᛱ;Z)V

    .line 31
    .line 32
    .line 33
    iget v8, v10, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 34
    .line 35
    add-int/2addr v7, v8

    .line 36
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, v0, Lyyds/ᛳᲈᛱᛵ;->ᲇᲇᲇᛱ:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 42
    .line 43
    .line 44
    move v6, v5

    .line 45
    move v7, v6

    .line 46
    :goto_1
    const/4 v8, 0x1

    .line 47
    if-ge v6, v4, :cond_6

    .line 48
    .line 49
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    check-cast v9, Lyyds/ᛵᲇᛲᛱ;

    .line 54
    .line 55
    invoke-virtual {v9}, Landroid/view/View;->getWindowVisibility()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-eqz v10, :cond_2

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_2
    iget-object v10, v9, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 63
    .line 64
    iget v11, v10, Lyyds/ᲁᲇᛷᛳ;->ᛲᲈᲁ:I

    .line 65
    .line 66
    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    iget v12, v10, Lyyds/ᲁᲇᛷᛳ;->ᲀᛲᛳᲀ:I

    .line 71
    .line 72
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    add-int/2addr v12, v11

    .line 77
    move v11, v5

    .line 78
    :goto_2
    iget v13, v10, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 79
    .line 80
    mul-int/lit8 v13, v13, 0x2

    .line 81
    .line 82
    if-ge v11, v13, :cond_5

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-lt v7, v13, :cond_3

    .line 89
    .line 90
    new-instance v13, Lyyds/ᛱᲇᲇᛴ;

    .line 91
    .line 92
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v13

    .line 103
    check-cast v13, Lyyds/ᛱᲇᲇᛴ;

    .line 104
    .line 105
    :goto_3
    iget-object v14, v10, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 106
    .line 107
    add-int/lit8 v15, v11, 0x1

    .line 108
    .line 109
    aget v15, v14, v15

    .line 110
    .line 111
    if-gt v15, v12, :cond_4

    .line 112
    .line 113
    move v5, v8

    .line 114
    :cond_4
    iput-boolean v5, v13, Lyyds/ᛱᲇᲇᛴ;->ᛲᲈᲁ:Z

    .line 115
    .line 116
    iput v12, v13, Lyyds/ᛱᲇᲇᛴ;->ᛵᛸᛸᛷ:I

    .line 117
    .line 118
    iput v15, v13, Lyyds/ᛱᲇᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 119
    .line 120
    iput-object v9, v13, Lyyds/ᛱᲇᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 121
    .line 122
    aget v5, v14, v11

    .line 123
    .line 124
    iput v5, v13, Lyyds/ᛱᲇᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 125
    .line 126
    add-int/lit8 v7, v7, 0x1

    .line 127
    .line 128
    add-int/lit8 v11, v11, 0x2

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    goto :goto_2

    .line 132
    :cond_5
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    goto :goto_1

    .line 136
    :cond_6
    sget-object v3, Lyyds/ᛳᲈᛱᛵ;->ᛱᲈᲁ:Lyyds/ᛶᛳᛶᛵ;

    .line 137
    .line 138
    invoke-static {v0, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 139
    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    :goto_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-ge v3, v4, :cond_10

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, Lyyds/ᛱᲇᲇᛴ;

    .line 153
    .line 154
    iget-object v5, v4, Lyyds/ᛱᲇᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 155
    .line 156
    if-nez v5, :cond_7

    .line 157
    .line 158
    goto/16 :goto_b

    .line 159
    .line 160
    :cond_7
    iget-boolean v6, v4, Lyyds/ᛱᲇᲇᛴ;->ᛲᲈᲁ:Z

    .line 161
    .line 162
    const-wide v9, 0x7fffffffffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    if-eqz v6, :cond_8

    .line 168
    .line 169
    move-wide v6, v9

    .line 170
    goto :goto_6

    .line 171
    :cond_8
    move-wide v6, v1

    .line 172
    :goto_6
    iget v11, v4, Lyyds/ᛱᲇᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 173
    .line 174
    invoke-static {v5, v11, v6, v7}, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛵᲇᛲᛱ;IJ)Lyyds/ᛱᛸᛳᛵ;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    if-eqz v5, :cond_f

    .line 179
    .line 180
    iget-object v6, v5, Lyyds/ᛱᛸᛳᛵ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 181
    .line 182
    if-eqz v6, :cond_f

    .line 183
    .line 184
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᲇᲇᲇᛱ()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_f

    .line 189
    .line 190
    invoke-virtual {v5}, Lyyds/ᛱᛸᛳᛵ;->ᛶᛷᛲᲁ()Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-nez v6, :cond_f

    .line 195
    .line 196
    iget-object v5, v5, Lyyds/ᛱᛸᛳᛵ;->ᛵᛸᛸᛷ:Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    check-cast v5, Lyyds/ᛵᲇᛲᛱ;

    .line 203
    .line 204
    if-nez v5, :cond_9

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_9
    iget-boolean v6, v5, Lyyds/ᛵᲇᛲᛱ;->ᲀᛴᲁᲈ:Z

    .line 208
    .line 209
    if-eqz v6, :cond_c

    .line 210
    .line 211
    iget-object v6, v5, Lyyds/ᛵᲇᛲᛱ;->ᛱᲈᲁ:Lyyds/ᲈᲇᲀᛲ;

    .line 212
    .line 213
    invoke-virtual {v6}, Lyyds/ᲈᲇᲀᛲ;->ᛱᛳᲇ()I

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-eqz v6, :cond_c

    .line 218
    .line 219
    iget-object v6, v5, Lyyds/ᛵᲇᛲᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲈᲁᛱ;

    .line 220
    .line 221
    iget-object v7, v5, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛵᛷ:Lyyds/ᲇᛲᲇᲇ;

    .line 222
    .line 223
    if-eqz v7, :cond_a

    .line 224
    .line 225
    invoke-virtual {v7}, Lyyds/ᲇᛲᲇᲇ;->ᛲᛴᛳᛲ()V

    .line 226
    .line 227
    .line 228
    :cond_a
    iget-object v7, v5, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 229
    .line 230
    if-eqz v7, :cond_b

    .line 231
    .line 232
    invoke-virtual {v7, v6}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛲᛶᲁ(Lyyds/ᲈᲈᲁᛱ;)V

    .line 233
    .line 234
    .line 235
    iget-object v7, v5, Lyyds/ᛵᲇᛲᛱ;->ᲇᛱᛲ:Lyyds/ᲇᲇᛵᛲ;

    .line 236
    .line 237
    invoke-virtual {v7, v6}, Lyyds/ᲇᲇᛵᛲ;->ᛵᛸᛵᛶ(Lyyds/ᲈᲈᲁᛱ;)V

    .line 238
    .line 239
    .line 240
    :cond_b
    iget-object v7, v6, Lyyds/ᲈᲈᲁᛱ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6}, Lyyds/ᲈᲈᲁᛱ;->ᲇᲇᲇᛱ()V

    .line 246
    .line 247
    .line 248
    :cond_c
    iget-object v6, v5, Lyyds/ᛵᲇᛲᛱ;->ᲈᛳ:Lyyds/ᲁᲇᛷᛳ;

    .line 249
    .line 250
    invoke-virtual {v6, v5, v8}, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛵᲇᛲᛱ;Z)V

    .line 251
    .line 252
    .line 253
    iget v7, v6, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 254
    .line 255
    if-eqz v7, :cond_f

    .line 256
    .line 257
    cmp-long v7, v1, v9

    .line 258
    .line 259
    if-nez v7, :cond_d

    .line 260
    .line 261
    :try_start_0
    const-string v7, "RV Nested Prefetch"

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_d
    const-string v7, "RV Nested Prefetch forced - needed next frame"

    .line 265
    .line 266
    :goto_7
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object v7, v5, Lyyds/ᛵᲇᛲᛱ;->ᛸᲀᛷᛲ:Lyyds/ᲈᛳᲇᛲ;

    .line 270
    .line 271
    iget-object v9, v5, Lyyds/ᛵᲇᛲᛱ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛵᲇᛳ;

    .line 272
    .line 273
    iput v8, v7, Lyyds/ᲈᛳᲇᛲ;->ᲇᲈᛵᛷ:I

    .line 274
    .line 275
    invoke-virtual {v9}, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ()I

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    iput v9, v7, Lyyds/ᲈᛳᲇᛲ;->ᛲᛴᛳᛲ:I

    .line 280
    .line 281
    const/4 v9, 0x0

    .line 282
    iput-boolean v9, v7, Lyyds/ᲈᛳᲇᛲ;->ᛶᛷᛲᲁ:Z

    .line 283
    .line 284
    iput-boolean v9, v7, Lyyds/ᲈᛳᲇᛲ;->ᛱᲈᲁ:Z

    .line 285
    .line 286
    iput-boolean v9, v7, Lyyds/ᲈᛳᲇᛲ;->ᛲᛳᛶᲁ:Z

    .line 287
    .line 288
    const/4 v9, 0x0

    .line 289
    :goto_8
    iget v7, v6, Lyyds/ᲁᲇᛷᛳ;->ᲇᲈᛵᛷ:I

    .line 290
    .line 291
    mul-int/lit8 v7, v7, 0x2

    .line 292
    .line 293
    if-ge v9, v7, :cond_e

    .line 294
    .line 295
    iget-object v7, v6, Lyyds/ᲁᲇᛷᛳ;->ᛵᛸᛸᛷ:[I

    .line 296
    .line 297
    aget v7, v7, v9

    .line 298
    .line 299
    invoke-static {v5, v7, v1, v2}, Lyyds/ᛳᲈᛱᛵ;->ᲀᛲᛳᲀ(Lyyds/ᛵᲇᛲᛱ;IJ)Lyyds/ᛱᛸᛳᛵ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    .line 301
    .line 302
    add-int/lit8 v9, v9, 0x2

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 306
    .line 307
    .line 308
    :cond_f
    :goto_9
    const/4 v9, 0x0

    .line 309
    goto :goto_a

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 312
    .line 313
    .line 314
    throw v0

    .line 315
    :goto_a
    iput-boolean v9, v4, Lyyds/ᛱᲇᲇᛴ;->ᛲᲈᲁ:Z

    .line 316
    .line 317
    iput v9, v4, Lyyds/ᛱᲇᲇᛴ;->ᛵᛸᛸᛷ:I

    .line 318
    .line 319
    iput v9, v4, Lyyds/ᛱᲇᲇᛴ;->ᲀᛲᛳᲀ:I

    .line 320
    .line 321
    const/4 v5, 0x0

    .line 322
    iput-object v5, v4, Lyyds/ᛱᲇᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲇᛲᛱ;

    .line 323
    .line 324
    iput v9, v4, Lyyds/ᛱᲇᲇᛴ;->ᛲᛴᛳᛲ:I

    .line 325
    .line 326
    add-int/lit8 v3, v3, 0x1

    .line 327
    .line 328
    goto/16 :goto_5

    .line 329
    .line 330
    :cond_10
    :goto_b
    return-void
.end method
