.class public final Lyyds/ᲈᛳᛳᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Z


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᛶᛳᛸ;

.field public final ᛲᲈᲁ:Lyyds/ᲈᲇᲇᛷ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛱ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᲈ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛶᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᛵᛸᛱ;Lyyds/ᲀᛵᲁᛴ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛳᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛱ;

    .line 5
    .line 6
    new-instance v0, Lyyds/ᛳᲇᛲᲁ;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Lyyds/ᛳᲇᛲᲁ;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Lyyds/ᛳᛷᲀᛴ;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {p2, v1}, Lyyds/ᛳᛷᲀᛴ;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᲈᛳᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    iput-object p0, p2, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    new-instance p2, Lyyds/ᲀᛴᛱᛷ;

    .line 26
    .line 27
    const/16 v2, 0xe

    .line 28
    .line 29
    invoke-direct {p2, v2}, Lyyds/ᲀᛴᛱᛷ;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lyyds/ᲈᛳᛳᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

    .line 33
    .line 34
    new-instance p2, Lyyds/ᲈᲇᲇᛷ;

    .line 35
    .line 36
    invoke-direct {p2, v1}, Lyyds/ᲈᲇᲇᛷ;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lyyds/ᲈᛳᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᛷ;

    .line 40
    .line 41
    new-instance v2, Lyyds/ᛴᛸᛶᛱ;

    .line 42
    .line 43
    move-object v8, p0

    .line 44
    move-object v7, p0

    .line 45
    move-object v3, p3

    .line 46
    move-object v4, p4

    .line 47
    move-object v5, p5

    .line 48
    move-object v6, p6

    .line 49
    invoke-direct/range {v2 .. v8}, Lyyds/ᛴᛸᛶᛱ;-><init>(Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᛷᛵᛴᲇ;Lyyds/ᲈᛳᛳᛵ;Lyyds/ᲈᛳᛳᛵ;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, v7, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛶᛱ;

    .line 53
    .line 54
    new-instance p0, Lyyds/ᛷᛸᛱᲈ;

    .line 55
    .line 56
    invoke-direct {p0, v0}, Lyyds/ᛷᛸᛱᲈ;-><init>(Lyyds/ᛳᲇᛲᲁ;)V

    .line 57
    .line 58
    .line 59
    iput-object p0, v7, Lyyds/ᲈᛳᛳᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᲈ;

    .line 60
    .line 61
    new-instance p0, Lyyds/ᛷᛶᛳᛸ;

    .line 62
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p2, Landroid/os/Handler;

    .line 67
    .line 68
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    new-instance p4, Lyyds/ᛳᲈᲇᛶ;

    .line 73
    .line 74
    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-direct {p2, p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 78
    .line 79
    .line 80
    iput-object p2, p0, Lyyds/ᛷᛶᛳᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p0, v7, Lyyds/ᲈᛳᛳᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᛳᛸ;

    .line 83
    .line 84
    iput-object v7, p1, Lyyds/ᛳᛵᛸᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛳᛳᛵ;

    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object v7, p0

    .line 89
    :goto_0
    move-object p0, v0

    .line 90
    goto :goto_2

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    move-object v7, p0

    .line 93
    :goto_1
    move-object p0, v0

    .line 94
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 95
    :try_start_4
    throw p0

    .line 96
    :catchall_2
    move-exception v0

    .line 97
    goto :goto_0

    .line 98
    :catchall_3
    move-exception v0

    .line 99
    goto :goto_1

    .line 100
    :goto_2
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 101
    throw p0
.end method

.method public static ᛶᛷᛲᲁ(Lyyds/ᲁᛱᛸᛵ;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lyyds/ᲀᲀᛱ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lyyds/ᲀᲀᛱ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Cannot release anything but an EngineResource"

    .line 12
    .line 13
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᲀᲀᛱ;)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const-string v1, "GlideMemoryTracking"

    .line 3
    .line 4
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object p1, p1, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 12
    .line 13
    invoke-interface {p1}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    instance-of v0, p1, Landroid/graphics/Bitmap;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/graphics/Bitmap;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_0
    if-nez p1, :cond_3

    .line 37
    .line 38
    :goto_1
    return-void

    .line 39
    :cond_3
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v3, "Engine [Device: "

    .line 46
    .line 47
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v3, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v3, "]: Loaded bitmap [ID: "

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, "] from memory cache ("

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, "). Size: ["

    .line 72
    .line 73
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, "x"

    .line 84
    .line 85
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, "] ("

    .line 96
    .line 97
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static {p1}, Lyyds/ᛱᛷᲈᛲ;->ᲇᲇᲇᛱ(Landroid/graphics/Bitmap;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p0, " bytes)"

    .line 108
    .line 109
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static ᲇᲈᛵᛷ(Ljava/lang/String;JLyyds/ᛸᲁᛲᛷ;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, " in "

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p0, "ms, key: "

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string p1, "Engine"

    .line 31
    .line 32
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Lyyds/ᲇᲈᲁᛷ;Ljava/lang/Object;Lyyds/ᛶᲀᛶᲀ;IILjava/lang/Class;Ljava/lang/Class;Lyyds/ᛲᛲᲀᲈ;Lyyds/ᲁᲁᲇᛷ;Lyyds/ᛲᛷᲈᛴ;ZZLyyds/ᛴᛳᲀᲈ;ZZLyyds/ᛲᛷᛶᛸ;Ljava/util/concurrent/Executor;Lyyds/ᛸᲁᛲᛷ;J)Lyyds/ᛳᛷᲀᛴ;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p8

    .line 14
    .line 15
    move-object/from16 v7, p9

    .line 16
    .line 17
    move-object/from16 v8, p13

    .line 18
    .line 19
    move-object/from16 v9, p16

    .line 20
    .line 21
    move-object/from16 v10, p17

    .line 22
    .line 23
    move-object/from16 v11, p18

    .line 24
    .line 25
    move-wide/from16 v12, p19

    .line 26
    .line 27
    iget-object v14, v0, Lyyds/ᲈᛳᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᛷ;

    .line 28
    .line 29
    iget-object v14, v14, Lyyds/ᲈᲇᲇᛷ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    check-cast v14, Lyyds/ᲀᛷᛱ;

    .line 36
    .line 37
    if-eqz v14, :cond_1

    .line 38
    .line 39
    invoke-virtual {v14, v9, v10}, Lyyds/ᲀᛷᛱ;->ᛲᲈᲁ(Lyyds/ᛲᛷᛶᛸ;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    sget-boolean v1, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const-string v1, "Added to existing load"

    .line 47
    .line 48
    invoke-static {v1, v12, v13, v11}, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;JLyyds/ᛸᲁᛲᛷ;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    new-instance v1, Lyyds/ᛳᛷᲀᛴ;

    .line 52
    .line 53
    invoke-direct {v1, v0, v9, v14}, Lyyds/ᛳᛷᲀᛴ;-><init>(Lyyds/ᲈᛳᛳᛵ;Lyyds/ᛲᛷᛶᛸ;Lyyds/ᲀᛷᛱ;)V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :cond_1
    iget-object v14, v0, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛶᛱ;

    .line 58
    .line 59
    iget-object v14, v14, Lyyds/ᛴᛸᛶᛱ;->ᛲᛳᛶᲁ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v14, Lyyds/ᛳᛷᲀᛴ;

    .line 62
    .line 63
    invoke-virtual {v14}, Lyyds/ᛳᛷᲀᛴ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    check-cast v14, Lyyds/ᲀᛷᛱ;

    .line 68
    .line 69
    monitor-enter v14

    .line 70
    :try_start_0
    iput-object v11, v14, Lyyds/ᲀᛷᛱ;->ᛷᛵᲇᲀ:Lyyds/ᛸᲁᛲᛷ;

    .line 71
    .line 72
    move/from16 v15, p14

    .line 73
    .line 74
    iput-boolean v15, v14, Lyyds/ᲀᛷᛱ;->ᛲᛲᲈᲈ:Z

    .line 75
    .line 76
    move/from16 v15, p15

    .line 77
    .line 78
    iput-boolean v15, v14, Lyyds/ᲀᛷᛱ;->ᛱᛳᲇ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    .line 80
    monitor-exit v14

    .line 81
    iget-object v15, v0, Lyyds/ᲈᛳᛳᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᲈ;

    .line 82
    .line 83
    iget-object v12, v15, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v12, Lyyds/ᛳᛷᲀᛴ;

    .line 86
    .line 87
    invoke-virtual {v12}, Lyyds/ᛳᛷᲀᛴ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    check-cast v12, Lyyds/ᛷᲁᲀᲁ;

    .line 92
    .line 93
    iget v13, v15, Lyyds/ᛷᛸᛱᲈ;->ᛵᛸᛸᛷ:I

    .line 94
    .line 95
    add-int/lit8 v9, v13, 0x1

    .line 96
    .line 97
    iput v9, v15, Lyyds/ᛷᛸᛱᲈ;->ᛵᛸᛸᛷ:I

    .line 98
    .line 99
    iget-object v9, v12, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 100
    .line 101
    iget-object v15, v12, Lyyds/ᛷᲁᲀᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲇᛲᲁ;

    .line 102
    .line 103
    iput-object v1, v9, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

    .line 104
    .line 105
    iput-object v2, v9, Lyyds/ᛵᛱᛱᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v3, v9, Lyyds/ᛵᛱᛱᛸ;->ᛱᛳᲇ:Lyyds/ᛶᲀᛶᲀ;

    .line 108
    .line 109
    iput v4, v9, Lyyds/ᛵᛱᛱᛸ;->ᛲᛴᛳᛲ:I

    .line 110
    .line 111
    iput v5, v9, Lyyds/ᛵᛱᛱᛸ;->ᲇᲇᲇᛱ:I

    .line 112
    .line 113
    iput-object v7, v9, Lyyds/ᛵᛱᛱᛸ;->ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 114
    .line 115
    move-object/from16 v10, p6

    .line 116
    .line 117
    iput-object v10, v9, Lyyds/ᛵᛱᛱᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 118
    .line 119
    iput-object v15, v9, Lyyds/ᛵᛱᛱᛸ;->ᛱᲈᲁ:Lyyds/ᛳᲇᛲᲁ;

    .line 120
    .line 121
    move-object/from16 v10, p7

    .line 122
    .line 123
    iput-object v10, v9, Lyyds/ᛵᛱᛱᛸ;->ᛷᛲᲈᛱ:Ljava/lang/Class;

    .line 124
    .line 125
    iput-object v6, v9, Lyyds/ᛵᛱᛱᛸ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛲᲀᲈ;

    .line 126
    .line 127
    iput-object v8, v9, Lyyds/ᛵᛱᛱᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

    .line 128
    .line 129
    move-object/from16 v10, p10

    .line 130
    .line 131
    iput-object v10, v9, Lyyds/ᛵᛱᛱᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

    .line 132
    .line 133
    move/from16 v10, p11

    .line 134
    .line 135
    iput-boolean v10, v9, Lyyds/ᛵᛱᛱᛸ;->ᛶᛳᛶᛵ:Z

    .line 136
    .line 137
    move/from16 v10, p12

    .line 138
    .line 139
    iput-boolean v10, v9, Lyyds/ᛵᛱᛱᛸ;->ᛵᛶᛲᲀ:Z

    .line 140
    .line 141
    iput-object v1, v12, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ:Lyyds/ᲇᲈᲁᛷ;

    .line 142
    .line 143
    iput-object v3, v12, Lyyds/ᛷᲁᲀᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 144
    .line 145
    iput-object v6, v12, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ:Lyyds/ᛲᛲᲀᲈ;

    .line 146
    .line 147
    iput-object v11, v12, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛸᲁᛲᛷ;

    .line 148
    .line 149
    iput v4, v12, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᲇ:I

    .line 150
    .line 151
    iput v5, v12, Lyyds/ᛷᲁᲀᲁ;->ᛳᲁᲁᲇ:I

    .line 152
    .line 153
    iput-object v7, v12, Lyyds/ᛷᲁᲀᲁ;->ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 154
    .line 155
    iput-object v8, v12, Lyyds/ᛷᲁᲀᲁ;->ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;

    .line 156
    .line 157
    iput-object v14, v12, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 158
    .line 159
    iput v13, v12, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛲᲇ:I

    .line 160
    .line 161
    const/4 v3, 0x1

    .line 162
    iput v3, v12, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 163
    .line 164
    iput-object v2, v12, Lyyds/ᛷᲁᲀᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object v1, v1, Lyyds/ᲇᲈᲁᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛱᛱᛴ;

    .line 167
    .line 168
    iput-object v1, v12, Lyyds/ᛷᲁᲀᲁ;->ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

    .line 169
    .line 170
    sget-object v1, Lyyds/ᛷᲁᲀᲁ;->ᛲᛱᲁᛳ:Lyyds/ᲀᲇᲇᛲ;

    .line 171
    .line 172
    invoke-virtual {v8, v1}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Ljava/util/function/Supplier;

    .line 177
    .line 178
    iput-object v1, v12, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 179
    .line 180
    iget-object v1, v0, Lyyds/ᲈᛳᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᛷ;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v1, v1, Lyyds/ᲈᲇᲇᛷ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-virtual {v1, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-object/from16 v9, p16

    .line 191
    .line 192
    move-object/from16 v10, p17

    .line 193
    .line 194
    invoke-virtual {v14, v9, v10}, Lyyds/ᲀᛷᛱ;->ᛲᲈᲁ(Lyyds/ᛲᛷᛶᛸ;Ljava/util/concurrent/Executor;)V

    .line 195
    .line 196
    .line 197
    monitor-enter v14

    .line 198
    :try_start_1
    iput-object v12, v14, Lyyds/ᲀᛷᛱ;->ᛶᲈᛴᲈ:Lyyds/ᛷᲁᲀᲁ;

    .line 199
    .line 200
    invoke-virtual {v12, v3}, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ(I)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    const/4 v2, 0x2

    .line 205
    if-eq v1, v2, :cond_4

    .line 206
    .line 207
    const/4 v2, 0x3

    .line 208
    if-ne v1, v2, :cond_2

    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_2
    iget-boolean v1, v14, Lyyds/ᲀᛷᛱ;->ᛱᛳᲇ:Z

    .line 212
    .line 213
    if-eqz v1, :cond_3

    .line 214
    .line 215
    iget-object v1, v14, Lyyds/ᲀᛷᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_3
    iget-object v1, v14, Lyyds/ᲀᛷᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_4
    :goto_0
    iget-object v1, v14, Lyyds/ᲀᛷᛱ;->ᛱᲈᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 222
    .line 223
    :goto_1
    invoke-virtual {v1, v12}, Lyyds/ᛷᛵᛴᲇ;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    .line 225
    .line 226
    monitor-exit v14

    .line 227
    sget-boolean v1, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    .line 228
    .line 229
    if-eqz v1, :cond_5

    .line 230
    .line 231
    const-string v1, "Started new load"

    .line 232
    .line 233
    move-wide/from16 v12, p19

    .line 234
    .line 235
    invoke-static {v1, v12, v13, v11}, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;JLyyds/ᛸᲁᛲᛷ;)V

    .line 236
    .line 237
    .line 238
    :cond_5
    new-instance v1, Lyyds/ᛳᛷᲀᛴ;

    .line 239
    .line 240
    invoke-direct {v1, v0, v9, v14}, Lyyds/ᛳᛷᲀᛴ;-><init>(Lyyds/ᲈᛳᛳᛵ;Lyyds/ᛲᛷᛶᛸ;Lyyds/ᲀᛷᛱ;)V

    .line 241
    .line 242
    .line 243
    return-object v1

    .line 244
    :catchall_0
    move-exception v0

    .line 245
    :try_start_2
    monitor-exit v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 246
    throw v0

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    :try_start_3
    monitor-exit v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 249
    throw v0
.end method

.method public final declared-synchronized ᛲᛴᛳᛲ(Lyyds/ᲀᛷᛱ;Lyyds/ᛸᲁᛲᛷ;Lyyds/ᲀᲀᛱ;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p3, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᲈᛳᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p3}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛳᛶᲁ(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᲀᲀᛱ;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_2

    .line 16
    :cond_0
    :goto_0
    iget-object p3, p0, Lyyds/ᲈᛳᛳᛵ;->ᛲᲈᲁ:Lyyds/ᲈᲇᲇᛷ;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p3, p3, Lyyds/ᲈᲇᲇᛷ;->ᛲᲈᲁ:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    :goto_1
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲇᲈᲁᛷ;Ljava/lang/Object;Lyyds/ᛶᲀᛶᲀ;IILjava/lang/Class;Ljava/lang/Class;Lyyds/ᛲᛲᲀᲈ;Lyyds/ᲁᲁᲇᛷ;Lyyds/ᛲᛷᲈᛴ;ZZLyyds/ᛴᛳᲀᲈ;ZZLyyds/ᛲᛷᛶᛸ;Lyyds/ᛶᛱᛷᛱ;)Lyyds/ᛳᛷᲀᛴ;
    .locals 23

    move-object/from16 v2, p0

    .line 1
    sget-boolean v0, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    if-eqz v0, :cond_0

    sget v0, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    .line 3
    :goto_0
    iget-object v3, v2, Lyyds/ᲈᛳᛳᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᛴᛱᛷ;

    .line 4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    new-instance v4, Lyyds/ᛸᲁᛲᛷ;

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v7, p4

    move/from16 v8, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    move-object/from16 v9, p10

    move-object/from16 v12, p13

    invoke-direct/range {v4 .. v12}, Lyyds/ᛸᲁᛲᛷ;-><init>(Ljava/lang/Object;Lyyds/ᛶᲀᛶᲀ;IILyyds/ᛲᛷᲈᛴ;Ljava/lang/Class;Ljava/lang/Class;Lyyds/ᛴᛳᲀᲈ;)V

    .line 6
    monitor-enter p0

    move/from16 v3, p14

    .line 7
    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, Lyyds/ᲈᛳᛳᛵ;->ᛵᛸᛸᛷ(Lyyds/ᛸᲁᛲᛷ;ZJ)Lyyds/ᲀᲀᛱ;

    move-result-object v5

    if-nez v5, :cond_1

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move/from16 v13, p11

    move/from16 v14, p12

    move-object/from16 v15, p13

    move/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v19, p17

    move-wide/from16 v21, v0

    move/from16 v16, v3

    move-object/from16 v20, v4

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 8
    invoke-virtual/range {v2 .. v22}, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ(Lyyds/ᲇᲈᲁᛷ;Ljava/lang/Object;Lyyds/ᛶᲀᛶᲀ;IILjava/lang/Class;Ljava/lang/Class;Lyyds/ᛲᛲᲀᲈ;Lyyds/ᲁᲁᲇᛷ;Lyyds/ᛲᛷᲈᛴ;ZZLyyds/ᛴᛳᲀᲈ;ZZLyyds/ᛲᛷᛶᛸ;Ljava/util/concurrent/Executor;Lyyds/ᛸᲁᛲᛷ;J)Lyyds/ᛳᛷᲀᛴ;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object v0, v5

    .line 9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x5

    move-object/from16 v2, p16

    .line 10
    invoke-virtual {v2, v0, v1}, Lyyds/ᛲᛷᛶᛸ;->ᛷᛲᲈᛱ(Lyyds/ᲁᛱᛸᛵ;I)V

    const/4 v0, 0x0

    return-object v0

    .line 11
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛸᲁᛲᛷ;ZJ)Lyyds/ᲀᲀᛱ;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    iget-object p2, p0, Lyyds/ᲈᛳᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 7
    .line 8
    monitor-enter p2

    .line 9
    :try_start_0
    iget-object v1, p2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lyyds/ᛲᲈᲈ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    monitor-exit p2

    .line 22
    move-object v2, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lyyds/ᲀᲀᛱ;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p2, v1}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛲᲈᲈ(Lyyds/ᛲᲈᲈ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move-object p0, v0

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_2
    :goto_0
    monitor-exit p2

    .line 41
    :goto_1
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v2}, Lyyds/ᲀᲀᛱ;->ᛲᲈᲁ()V

    .line 44
    .line 45
    .line 46
    :cond_3
    const/4 p2, 0x3

    .line 47
    if-eqz v2, :cond_6

    .line 48
    .line 49
    sget-boolean p0, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    const-string p0, "Loaded resource from active resources"

    .line 54
    .line 55
    invoke-static {p0, p3, p4, p1}, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;JLyyds/ᛸᲁᛲᛷ;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    const-string p0, "GlideMemoryTracking"

    .line 59
    .line 60
    invoke-static {p0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_5

    .line 65
    .line 66
    const-string p0, "active"

    .line 67
    .line 68
    invoke-static {p0, v2}, Lyyds/ᲈᛳᛳᛵ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᲀᲀᛱ;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    return-object v2

    .line 72
    :cond_6
    iget-object v1, p0, Lyyds/ᲈᛳᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛱ;

    .line 73
    .line 74
    monitor-enter v1

    .line 75
    :try_start_2
    iget-object v2, v1, Lyyds/ᲁᛱᲈᛳ;->ᛲᲈᲁ:Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lyyds/ᲈᛶᲁᛲ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    .line 83
    if-nez v2, :cond_7

    .line 84
    .line 85
    monitor-exit v1

    .line 86
    move-object v2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_7
    :try_start_3
    iget-wide v3, v1, Lyyds/ᲁᛱᲈᛳ;->ᲀᛲᛳᲀ:J

    .line 89
    .line 90
    iget v5, v2, Lyyds/ᲈᛶᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 91
    .line 92
    int-to-long v5, v5

    .line 93
    sub-long/2addr v3, v5

    .line 94
    iput-wide v3, v1, Lyyds/ᲁᛱᲈᛳ;->ᲀᛲᛳᲀ:J

    .line 95
    .line 96
    iget-object v2, v2, Lyyds/ᲈᛶᲁᛲ;->ᛲᲈᲁ:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 97
    .line 98
    monitor-exit v1

    .line 99
    :goto_2
    move-object v4, v2

    .line 100
    check-cast v4, Lyyds/ᲁᛱᛸᛵ;

    .line 101
    .line 102
    if-nez v4, :cond_8

    .line 103
    .line 104
    move-object v8, p0

    .line 105
    move-object v7, p1

    .line 106
    move-object v4, v0

    .line 107
    goto :goto_3

    .line 108
    :cond_8
    instance-of v1, v4, Lyyds/ᲀᲀᛱ;

    .line 109
    .line 110
    if-eqz v1, :cond_9

    .line 111
    .line 112
    check-cast v4, Lyyds/ᲀᲀᛱ;

    .line 113
    .line 114
    move-object v8, p0

    .line 115
    move-object v7, p1

    .line 116
    goto :goto_3

    .line 117
    :cond_9
    new-instance v3, Lyyds/ᲀᲀᛱ;

    .line 118
    .line 119
    const/4 v5, 0x1

    .line 120
    const/4 v6, 0x1

    .line 121
    move-object v8, p0

    .line 122
    move-object v7, p1

    .line 123
    invoke-direct/range {v3 .. v8}, Lyyds/ᲀᲀᛱ;-><init>(Lyyds/ᲁᛱᛸᛵ;ZZLyyds/ᛶᲀᛶᲀ;Lyyds/ᲈᛳᛳᛵ;)V

    .line 124
    .line 125
    .line 126
    move-object v4, v3

    .line 127
    :goto_3
    if-eqz v4, :cond_a

    .line 128
    .line 129
    invoke-virtual {v4}, Lyyds/ᲀᲀᛱ;->ᛲᲈᲁ()V

    .line 130
    .line 131
    .line 132
    iget-object p0, v8, Lyyds/ᲈᛳᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 133
    .line 134
    invoke-virtual {p0, v7, v4}, Lyyds/ᛳᛷᲀᛴ;->ᛲᛳᛶᲁ(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᲀᲀᛱ;)V

    .line 135
    .line 136
    .line 137
    :cond_a
    if-eqz v4, :cond_d

    .line 138
    .line 139
    sget-boolean p0, Lyyds/ᲈᛳᛳᛵ;->ᛱᲈᲁ:Z

    .line 140
    .line 141
    if-eqz p0, :cond_b

    .line 142
    .line 143
    const-string p0, "Loaded resource from cache"

    .line 144
    .line 145
    invoke-static {p0, p3, p4, v7}, Lyyds/ᲈᛳᛳᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;JLyyds/ᛸᲁᛲᛷ;)V

    .line 146
    .line 147
    .line 148
    :cond_b
    const-string p0, "GlideMemoryTracking"

    .line 149
    .line 150
    invoke-static {p0, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_c

    .line 155
    .line 156
    const-string p0, "cache"

    .line 157
    .line 158
    invoke-static {p0, v4}, Lyyds/ᲈᛳᛳᛵ;->ᲀᛲᛳᲀ(Ljava/lang/String;Lyyds/ᲀᲀᛱ;)V

    .line 159
    .line 160
    .line 161
    :cond_c
    return-object v4

    .line 162
    :cond_d
    :goto_4
    return-object v0

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 166
    throw p0

    .line 167
    :goto_5
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 168
    throw p0
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᲀᲀᛱ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲈᛳᛳᛵ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lyyds/ᛲᲈᲈ;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v1, Lyyds/ᛲᲈᲈ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᛸᛵ;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    iget-boolean v0, p2, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᲈᛳᛳᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛵᛸᛱ;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᛱᲈᛳ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lyyds/ᲁᛱᛸᛵ;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p0, p0, Lyyds/ᲈᛳᛳᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᛳᛸ;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p2, p1}, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ(Lyyds/ᲁᛱᛸᛵ;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p0
.end method
