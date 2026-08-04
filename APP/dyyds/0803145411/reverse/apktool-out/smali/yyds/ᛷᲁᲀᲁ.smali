.class public final Lyyds/ᛷᲁᲀᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᛵᛷ;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lyyds/ᲀᛸᛶᲀ;


# static fields
.field public static final ᛲᛱᲁᛳ:Lyyds/ᲀᲇᲇᛲ;


# instance fields
.field public volatile ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

.field public ᛱᛳᲇ:I

.field public final ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

.field public ᛲᛲᲈᲈ:Lyyds/ᛸᲁᛲᛷ;

.field public ᛲᛳᛴᛸ:Ljava/lang/Object;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛱᛱᛱᲁ;

.field public final ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛵᲁ;

.field public ᛲᛶᛱᲈ:Ljava/lang/Thread;

.field public ᛳᛸᛴᛶ:J

.field public ᛳᲁᲁᲇ:I

.field public ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

.field public ᛵᲀᛵᛸ:Lyyds/ᛶᲀᛶᲀ;

.field public ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

.field public ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲇᛱ;

.field public ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

.field public ᛶᲈᛴᲈ:Ljava/lang/Object;

.field public ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

.field public ᛷᛵᲇᲀ:Lyyds/ᛲᛲᲀᲈ;

.field public ᛷᛶᛷᲀ:I

.field public ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

.field public ᛷᲇᛲᛱ:I

.field public ᛷᲈᲈᲁ:Lyyds/ᲇᲈᲁᛷ;

.field public volatile ᛸᛸᛷᛱ:Z

.field public volatile ᲀᛲᛱᛱ:Z

.field public ᲀᛲᛲᲇ:I

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

.field public ᲀᛴᲁᲈ:Z

.field public ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛳᲇᛲᲁ;

.field public final ᲇᲈᛵᛷ:Ljava/util/ArrayList;

.field public ᲈᛷᲈᛶ:I

.field public ᲈᲀᛲᲀ:Lyyds/ᛶᲀᛶᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᲀᲇᲇᛲ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lyyds/ᲀᲇᲇᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛲᛷᛸ;

    .line 5
    .line 6
    const-string v3, "glide_thread_priority_override"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lyyds/ᲀᲇᲇᛲ;-><init>(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛱᛵᲇᲈ;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛱᲁᛳ:Lyyds/ᲀᲇᲇᛲ;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᲇᛲᲁ;Lyyds/ᛳᛷᲀᛴ;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᛱᛱᛸ;

    .line 5
    .line 6
    invoke-direct {v0}, Lyyds/ᛵᛱᛱᛸ;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lyyds/ᛵᲁᛵᲁ;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛵᲁ;

    .line 24
    .line 25
    new-instance v0, Lyyds/ᛳᛷᲀᛴ;

    .line 26
    .line 27
    const/16 v1, 0xa

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v1, v2}, Lyyds/ᛳᛷᲀᛴ;-><init>(IZ)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 34
    .line 35
    new-instance v0, Lyyds/ᛱᛱᛱᲁ;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛱᛱᲁ;

    .line 41
    .line 42
    iput-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲇᛲᲁ;

    .line 43
    .line 44
    iput-object p2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲇᛱ;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lyyds/ᛷᲁᲀᲁ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ:Lyyds/ᛲᛲᲀᲈ;

    .line 4
    .line 5
    iget-object v1, p1, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ:Lyyds/ᛲᛲᲀᲈ;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛲᲇ:I

    .line 14
    .line 15
    iget p1, p1, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛲᲇ:I

    .line 16
    .line 17
    sub-int/2addr p0, p1

    .line 18
    return p0

    .line 19
    :cond_0
    return v0
.end method

.method public final run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ()V
    :try_end_0
    .catch Lyyds/ᛴᲁᛴᛶ; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v2}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᲇ()V
    :try_end_1
    .catch Lyyds/ᛴᲁᛴᛶ; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :goto_0
    const/4 v4, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", stage: "

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 56
    .line 57
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛵᲀᲈᛴ(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    iget v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ()V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-boolean p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 88
    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    throw v3

    .line 92
    :cond_4
    throw v3

    .line 93
    :goto_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    :goto_3
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-interface {v2}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 97
    .line 98
    .line 99
    :cond_5
    throw p0
.end method

.method public final ᛱᛳᲇ()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᲇᲇᲇᛱ()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const-string p0, "null"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string p0, "DECODE_DATA"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p0, "SWITCH_TO_SOURCE_SERVICE"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const-string p0, "INITIALIZE"

    .line 40
    .line 41
    :goto_0
    const-string v0, "Unrecognized run reason: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_5
    invoke-virtual {p0, v1}, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 60
    .line 61
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛶᛷᛲᲁ()Lyyds/ᲈᛳᲀᛴ;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

    .line 66
    .line 67
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final ᛱᲈᲁ(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x2

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    if-eq v0, v2, :cond_3

    .line 12
    .line 13
    if-eq v0, v3, :cond_2

    .line 14
    .line 15
    if-eq v0, v4, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x5

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛵᲀᲈᛴ(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "Unrecognized stage: "

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x6

    .line 36
    return p0

    .line 37
    :cond_2
    const/4 p0, 0x4

    .line 38
    return p0

    .line 39
    :cond_3
    iget-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 40
    .line 41
    iget p1, p1, Lyyds/ᲁᲁᲇᛷ;->ᛲᲈᲁ:I

    .line 42
    .line 43
    packed-switch p1, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    :pswitch_0
    move v1, v2

    .line 47
    :pswitch_1
    if-eqz v1, :cond_4

    .line 48
    .line 49
    return v4

    .line 50
    :cond_4
    invoke-virtual {p0, v4}, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_5
    iget-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 56
    .line 57
    iget p1, p1, Lyyds/ᲁᲁᲇᛷ;->ᛲᲈᲁ:I

    .line 58
    .line 59
    packed-switch p1, :pswitch_data_1

    .line 60
    .line 61
    .line 62
    :pswitch_2
    move v1, v2

    .line 63
    :pswitch_3
    if-eqz v1, :cond_6

    .line 64
    .line 65
    return v3

    .line 66
    :cond_6
    invoke-virtual {p0, v3}, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ(I)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 6
    .line 7
    sget v0, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛳᛸᛴᛶ:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

    .line 25
    .line 26
    invoke-interface {v0}, Lyyds/ᲈᛳᲀᛴ;->ᲇᲈᛵᛷ()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛶᛷᛲᲁ()Lyyds/ᲈᛳᲀᛴ;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

    .line 45
    .line 46
    iget v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    iput v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 53
    .line 54
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 55
    .line 56
    iget-boolean v1, v0, Lyyds/ᲀᛷᛱ;->ᛱᛳᲇ:Z

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lyyds/ᲀᛷᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, v0, Lyyds/ᲀᛷᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v0, p0}, Lyyds/ᛷᛵᛴᲇ;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    if-eq v1, v2, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    :cond_3
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ()V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void
.end method

.method public final ᛲᛳᛶᲁ(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, " in "

    .line 7
    .line 8
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, ", load key: "

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛸᲁᛲᛷ;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    if-eqz p4, :cond_0

    .line 29
    .line 30
    const-string p0, ", "

    .line 31
    .line 32
    invoke-virtual {p0, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, ""

    .line 38
    .line 39
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, ", thread: "

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p1, "DecodeJob"

    .line 63
    .line 64
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final ᛲᛴᛳᛲ(ILjava/lang/Object;)Lyyds/ᲁᛱᛸᛵ;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᛶᛶᛷᲁ;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    if-eq p1, v3, :cond_1

    .line 15
    .line 16
    iget-boolean v1, v1, Lyyds/ᛵᛱᛱᛸ;->ᛵᛶᛲᲀ:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 24
    :goto_1
    sget-object v3, Lyyds/ᲈᛷᲀᲈ;->ᛲᛳᛶᲁ:Lyyds/ᲀᲇᲇᛲ;

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    :cond_2
    :goto_2
    move-object v7, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    new-instance v0, Lyyds/ᛴᛳᲀᲈ;

    .line 45
    .line 46
    invoke-direct {v0}, Lyyds/ᛴᛳᲀᲈ;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;

    .line 50
    .line 51
    iget-object v4, v4, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 52
    .line 53
    iget-object v5, v0, Lyyds/ᛴᛳᲀᲈ;->ᛵᛸᛸᛷ:Lyyds/ᛲᛷᲈᛴ;

    .line 54
    .line 55
    invoke-virtual {v5, v4}, Lyyds/ᛲᛷᲈᛴ;->ᛶᛷᛲᲁ(Lyyds/ᛷᛲᲇᲀ;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v5, v3, v1}, Lyyds/ᛲᛷᲈᛴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :goto_3
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ:Lyyds/ᲇᲈᲁᛷ;

    .line 67
    .line 68
    invoke-virtual {v0}, Lyyds/ᲇᲈᲁᛷ;->ᛲᲈᲁ()Lyyds/ᛷᛶᛷ;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p2}, Lyyds/ᛷᛶᛷ;->ᛶᛷᛲᲁ(Ljava/lang/Object;)Lyyds/ᛳᲈᛲᲈ;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :try_start_0
    iget v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᲇ:I

    .line 77
    .line 78
    iget v4, p0, Lyyds/ᛷᲁᲀᲁ;->ᛳᲁᲁᲇ:I

    .line 79
    .line 80
    new-instance v5, Lyyds/ᛸᛴᛷᛵ;

    .line 81
    .line 82
    invoke-direct {v5, p0, p1}, Lyyds/ᛸᛴᛷᛵ;-><init>(Lyyds/ᛷᲁᲀᲁ;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {v2 .. v7}, Lyyds/ᛶᛶᛷᲁ;->ᛲᲈᲁ(IILyyds/ᛸᛴᛷᛵ;Lyyds/ᛳᲈᛲᲈ;Lyyds/ᛴᛳᲀᲈ;)Lyyds/ᲁᛱᛸᛵ;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    invoke-interface {v6}, Lyyds/ᛳᲈᛲᲈ;->ᛵᛸᛸᛷ()V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    move-object p0, v0

    .line 95
    invoke-interface {v6}, Lyyds/ᛳᲈᛲᲈ;->ᛵᛸᛸᛷ()V

    .line 96
    .line 97
    .line 98
    throw p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛶᲀᛶᲀ;Ljava/lang/Object;Lyyds/ᛳᲇᛶᲀ;ILyyds/ᛶᲀᛶᲀ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᲀᛲᲀ:Lyyds/ᛶᲀᛶᲀ;

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛴᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

    .line 6
    .line 7
    iput p4, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᛷᲈᛶ:I

    .line 8
    .line 9
    iput-object p5, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᛵᛸ:Lyyds/ᛶᲀᛶᲀ;

    .line 10
    .line 11
    iget-object p2, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 12
    .line 13
    invoke-virtual {p2}, Lyyds/ᛵᛱᛱᛸ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    :cond_0
    iput-boolean p3, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛴᲁᲈ:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eq p1, p2, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    iput p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 37
    .line 38
    iget-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 39
    .line 40
    iget-boolean p2, p1, Lyyds/ᲀᛷᛱ;->ᛱᛳᲇ:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-object p1, p1, Lyyds/ᲀᛷᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p1, p1, Lyyds/ᲀᛷᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1, p0}, Lyyds/ᛷᛵᛴᲇ;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᲇᲇᲇᛱ()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final ᛳᲁᲁᲇ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛵᲁ;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyyds/ᛵᲁᛵᲁ;->ᛲᲈᲁ()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛸᛸᛷᛱ:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int/2addr v0, v1

    .line 28
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "Already notified"

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    iput-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛸᛸᛷᛱ:Z

    .line 43
    .line 44
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛶᲀᛶᲀ;Ljava/lang/Exception;Lyyds/ᛳᲇᛶᲀ;I)V
    .locals 2

    .line 1
    invoke-interface {p3}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛴᲇᛴᛵ;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {v0, v1, p2}, Lyyds/ᛴᲇᛴᛵ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, Lyyds/ᛳᲇᛶᲀ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p1, v0, Lyyds/ᛴᲇᛴᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛶᲀ;

    .line 20
    .line 21
    iput p4, v0, Lyyds/ᛴᲇᛴᛵ;->ᛲᛴᛳᛲ:I

    .line 22
    .line 23
    iput-object p2, v0, Lyyds/ᛴᲇᛴᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Class;

    .line 24
    .line 25
    iget-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    iput p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲇᛲᛱ:I

    .line 40
    .line 41
    iget-object p1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 42
    .line 43
    iget-boolean p2, p1, Lyyds/ᲀᛷᛱ;->ᛱᛳᲇ:Z

    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, Lyyds/ᲀᛷᛱ;->ᛷᲈᲈᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p1, Lyyds/ᲀᛷᛱ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛵᛴᲇ;

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, p0}, Lyyds/ᛷᛵᛴᲇ;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᲈᛳᲀᛴ;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 2
    .line 3
    invoke-static {v0}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 9
    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    iget p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 24
    .line 25
    invoke-static {p0}, Lyyds/ᲀᲁᲈᲇ;->ᛵᲀᲈᛴ(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "Unrecognized stage: "

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    new-instance v0, Lyyds/ᛶᲀᲈᲈ;

    .line 40
    .line 41
    invoke-direct {v0, v2, p0}, Lyyds/ᛶᲀᲈᲈ;-><init>(Lyyds/ᛵᛱᛱᛸ;Lyyds/ᛷᲁᲀᲁ;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    new-instance v0, Lyyds/ᛴᛱᛶᛲ;

    .line 46
    .line 47
    invoke-virtual {v2}, Lyyds/ᛵᛱᛱᛸ;->ᛲᲈᲁ()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {v0, v1, v2, p0}, Lyyds/ᛴᛱᛶᛲ;-><init>(Ljava/util/List;Lyyds/ᛵᛱᛱᛸ;Lyyds/ᲈᛵᛷ;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    new-instance v0, Lyyds/ᛸᛴᛵᛲ;

    .line 56
    .line 57
    invoke-direct {v0, v2, p0}, Lyyds/ᛸᛴᛵᛲ;-><init>(Lyyds/ᛵᛱᛱᛸ;Lyyds/ᛷᲁᲀᲁ;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final ᛷᛲᲈᛱ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛱᛱᲁ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, Lyyds/ᛱᛱᛱᲁ;->ᛵᛸᛸᛷ:Z

    .line 6
    .line 7
    iput-boolean v1, v0, Lyyds/ᛱᛱᛱᲁ;->ᛲᲈᲁ:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lyyds/ᛱᛱᛱᲁ;->ᲀᛲᛳᲀ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v2, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛱᛸ;

    .line 22
    .line 23
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᲀᛲᛳᲀ:Lyyds/ᲇᲈᲁᛷ;

    .line 24
    .line 25
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛱᛳᲇ:Lyyds/ᛶᲀᛶᲀ;

    .line 28
    .line 29
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Class;

    .line 30
    .line 31
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛷᛲᲈᛱ:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛳᛶᲁ:Lyyds/ᛴᛳᲀᲈ;

    .line 34
    .line 35
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛳᲁᲁᲇ:Lyyds/ᛲᛲᲀᲈ;

    .line 36
    .line 37
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᛷᲈᲈᲁ:Lyyds/ᛲᛷᲈᛴ;

    .line 38
    .line 39
    iput-object v2, v0, Lyyds/ᛵᛱᛱᛸ;->ᲇᛱᛲ:Lyyds/ᲁᲁᲇᛷ;

    .line 40
    .line 41
    iget-object v3, v0, Lyyds/ᛵᛱᛱᛸ;->ᛲᲈᲁ:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, v0, Lyyds/ᛵᛱᛱᛸ;->ᛷᛵᲇᲀ:Z

    .line 47
    .line 48
    iget-object v3, v0, Lyyds/ᛵᛱᛱᛸ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v0, Lyyds/ᛵᛱᛱᛸ;->ᛲᛲᲈᲈ:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛸᛸᛷᛱ:Z

    .line 56
    .line 57
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᲈᲈᲁ:Lyyds/ᲇᲈᲁᛷ;

    .line 58
    .line 59
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛲᲈᛱ:Lyyds/ᛶᲀᛶᲀ;

    .line 60
    .line 61
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;

    .line 62
    .line 63
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ:Lyyds/ᛲᛲᲀᲈ;

    .line 64
    .line 65
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛸᲁᛲᛷ;

    .line 66
    .line 67
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 68
    .line 69
    iput v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 70
    .line 71
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᛳᛶᛳ:Lyyds/ᲈᛳᲀᛴ;

    .line 72
    .line 73
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛶᛱᲈ:Ljava/lang/Thread;

    .line 74
    .line 75
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᲀᛲᲀ:Lyyds/ᛶᲀᛶᲀ;

    .line 76
    .line 77
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛴᛸ:Ljava/lang/Object;

    .line 78
    .line 79
    iput v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᛷᲈᛶ:I

    .line 80
    .line 81
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    iput-wide v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛳᛸᛴᛶ:J

    .line 86
    .line 87
    iput-boolean v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲀᛲᛱᛱ:Z

    .line 88
    .line 89
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᲈᛴᲈ:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛴᲀᲇᛱ;

    .line 97
    .line 98
    invoke-interface {v0, p0}, Lyyds/ᛴᲀᲇᛱ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p0

    .line 103
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw p0
.end method

.method public final ᛷᛵᲇᲀ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    const-class v1, Lyyds/ᛲᲇᲁᛳ;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x9

    .line 30
    .line 31
    invoke-static {v0, v1}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    const/4 v1, 0x0

    .line 37
    iput-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    const-string v1, "DecodeJob"

    .line 41
    .line 42
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    const-string p0, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 49
    .line 50
    invoke-static {v1, p0, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :cond_1
    const-string p0, "OverrideGlideThreadPriority experiment is not enabled."

    .line 55
    .line 56
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛲᲇᲁᛳ;

    .line 4
    .line 5
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛳᲁᲁᲇ()V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lyyds/ᛴᲇᛴᛵ;

    .line 22
    .line 23
    const-string v1, "Failed to load resource"

    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lyyds/ᛴᲇᛴᛵ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 36
    .line 37
    monitor-enter v1

    .line 38
    :try_start_0
    iput-object v0, v1, Lyyds/ᲀᛷᛱ;->ᛵᛶᛲᲀ:Lyyds/ᛴᲇᛴᛵ;

    .line 39
    .line 40
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 41
    monitor-enter v1

    .line 42
    :try_start_1
    iget-object v0, v1, Lyyds/ᲀᛷᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲁᛵᲁ;

    .line 43
    .line 44
    invoke-virtual {v0}, Lyyds/ᛵᲁᛵᲁ;->ᛲᲈᲁ()V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, v1, Lyyds/ᲀᛷᛱ;->ᛶᛸᲀᲁ:Z

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Lyyds/ᲀᛷᛱ;->ᲇᲇᲇᛱ()V

    .line 53
    .line 54
    .line 55
    monitor-exit v1

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v0, v1, Lyyds/ᲀᛷᛱ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲀᛶ;

    .line 60
    .line 61
    iget-object v0, v0, Lyyds/ᲁᛶᲀᛶ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iget-boolean v0, v1, Lyyds/ᲀᛷᛱ;->ᲀᛲᛲᲇ:Z

    .line 70
    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    iput-boolean v2, v1, Lyyds/ᲀᛷᛱ;->ᲀᛲᛲᲇ:Z

    .line 74
    .line 75
    iget-object v0, v1, Lyyds/ᲀᛷᛱ;->ᛷᛵᲇᲀ:Lyyds/ᛸᲁᛲᛷ;

    .line 76
    .line 77
    iget-object v3, v1, Lyyds/ᲀᛷᛱ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲀᛶ;

    .line 78
    .line 79
    new-instance v4, Ljava/util/ArrayList;

    .line 80
    .line 81
    iget-object v3, v3, Lyyds/ᲁᛶᲀᛶ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    add-int/2addr v3, v2

    .line 91
    invoke-virtual {v1, v3}, Lyyds/ᲀᛷᛱ;->ᲇᲈᛵᛷ(I)V

    .line 92
    .line 93
    .line 94
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    iget-object v3, v1, Lyyds/ᲀᛷᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛳᛵ;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    invoke-virtual {v3, v1, v0, v5}, Lyyds/ᲈᛳᛳᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲀᛷᛱ;Lyyds/ᛸᲁᛲᛷ;Lyyds/ᲀᲀᛱ;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Lyyds/ᛴᛲᛲᛳ;

    .line 116
    .line 117
    iget-object v4, v3, Lyyds/ᛴᛲᛲᛳ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/Executor;

    .line 118
    .line 119
    new-instance v5, Lyyds/ᲈᛱᛸᛷ;

    .line 120
    .line 121
    iget-object v3, v3, Lyyds/ᛴᛲᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛶᛸ;

    .line 122
    .line 123
    const/4 v6, 0x0

    .line 124
    invoke-direct {v5, v1, v3, v6}, Lyyds/ᲈᛱᛸᛷ;-><init>(Lyyds/ᲀᛷᛱ;Lyyds/ᛲᛷᛶᛸ;I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_2
    invoke-virtual {v1}, Lyyds/ᲀᛷᛱ;->ᛵᛸᛸᛷ()V

    .line 132
    .line 133
    .line 134
    :goto_1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛱᛱᲁ;

    .line 135
    .line 136
    monitor-enter v0

    .line 137
    :try_start_2
    iput-boolean v2, v0, Lyyds/ᛱᛱᛱᲁ;->ᲀᛲᛳᲀ:Z

    .line 138
    .line 139
    invoke-virtual {v0}, Lyyds/ᛱᛱᛱᲁ;->ᛲᲈᲁ()Z

    .line 140
    .line 141
    .line 142
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 143
    monitor-exit v0

    .line 144
    if-eqz v1, :cond_3

    .line 145
    .line 146
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᛲᲈᛱ()V

    .line 147
    .line 148
    .line 149
    :cond_3
    return-void

    .line 150
    :catchall_1
    move-exception p0

    .line 151
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    throw p0

    .line 153
    :cond_4
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    const-string v0, "Already failed once"

    .line 156
    .line 157
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p0

    .line 161
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    const-string v0, "Received an exception without any callbacks to notify"

    .line 164
    .line 165
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw p0

    .line 169
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 170
    throw p0

    .line 171
    :catchall_2
    move-exception p0

    .line 172
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 173
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛵᲁᛵᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛵᲁᛵᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 12

    .line 1
    const-string v0, "DecodeJob"

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
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Retrieved data"

    .line 11
    .line 12
    iget-wide v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛳᛸᛴᛶ:J

    .line 13
    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v5, "data: "

    .line 17
    .line 18
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛴᛸ:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v5, ", cache key: "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᲀᛲᲀ:Lyyds/ᛶᲀᛶᲀ;

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v5, ", fetcher: "

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v5, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0, v2, v3, v0, v4}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ(JLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

    .line 54
    .line 55
    const-class v2, Lyyds/ᛲᲇᲁᛳ;

    .line 56
    .line 57
    iget-object v0, v0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v0, v3}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    iput-object v2, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᲈᛴ:Ljava/util/function/Supplier;

    .line 100
    .line 101
    const-string v3, "DecodeJob"

    .line 102
    .line 103
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    const-string v1, "DecodeJob"

    .line 110
    .line 111
    const-string v3, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 112
    .line 113
    invoke-static {v1, v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 114
    .line 115
    .line 116
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛸᲇᛶ:Lyyds/ᛳᲇᛶᲀ;

    .line 117
    .line 118
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛴᛸ:Ljava/lang/Object;

    .line 119
    .line 120
    iget v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᛷᲈᛶ:I

    .line 121
    .line 122
    invoke-virtual {p0, v0, v1, v3}, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᲇᛶᲀ;Ljava/lang/Object;I)Lyyds/ᲁᛱᛸᛵ;

    .line 123
    .line 124
    .line 125
    move-result-object v0
    :try_end_1
    .catch Lyyds/ᛴᲇᛴᛵ; {:try_start_1 .. :try_end_1} :catch_1

    .line 126
    goto :goto_1

    .line 127
    :catch_1
    move-exception v0

    .line 128
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᲀᛵᛸ:Lyyds/ᛶᲀᛶᲀ;

    .line 129
    .line 130
    iget v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᛷᲈᛶ:I

    .line 131
    .line 132
    iput-object v1, v0, Lyyds/ᛴᲇᛴᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲀᛶᲀ;

    .line 133
    .line 134
    iput v3, v0, Lyyds/ᛴᲇᛴᛵ;->ᛲᛴᛳᛲ:I

    .line 135
    .line 136
    iput-object v2, v0, Lyyds/ᛴᲇᛴᛵ;->ᲇᲇᲇᛱ:Ljava/lang/Class;

    .line 137
    .line 138
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-object v0, v2

    .line 144
    :goto_1
    if-eqz v0, :cond_d

    .line 145
    .line 146
    iget v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᲈᛷᲈᛶ:I

    .line 147
    .line 148
    instance-of v3, v0, Lyyds/ᛴᛱᛵ;

    .line 149
    .line 150
    if-eqz v3, :cond_2

    .line 151
    .line 152
    move-object v3, v0

    .line 153
    check-cast v3, Lyyds/ᛴᛱᛵ;

    .line 154
    .line 155
    invoke-interface {v3}, Lyyds/ᛴᛱᛵ;->ᛲᲈᲁ()V

    .line 156
    .line 157
    .line 158
    :cond_2
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 159
    .line 160
    iget-object v3, v3, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v3, Lyyds/ᛶᛱᛵᲁ;

    .line 163
    .line 164
    const/4 v4, 0x0

    .line 165
    const/4 v5, 0x1

    .line 166
    if-eqz v3, :cond_3

    .line 167
    .line 168
    sget-object v2, Lyyds/ᛶᛱᛵᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 169
    .line 170
    invoke-virtual {v2}, Lyyds/ᛳᛷᲀᛴ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Lyyds/ᛶᛱᛵᲁ;

    .line 175
    .line 176
    iput-boolean v4, v2, Lyyds/ᛶᛱᛵᲁ;->ᲇᲇᲇᛱ:Z

    .line 177
    .line 178
    iput-boolean v5, v2, Lyyds/ᛶᛱᛵᲁ;->ᛲᛴᛳᛲ:Z

    .line 179
    .line 180
    iput-object v0, v2, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 181
    .line 182
    move-object v0, v2

    .line 183
    :cond_3
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛸᲀᲁ:Lyyds/ᛱᛱᛴ;

    .line 184
    .line 185
    const-class v6, Lyyds/ᛲᲇᲁᛳ;

    .line 186
    .line 187
    iget-object v3, v3, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v3, Ljava/util/Map;

    .line 190
    .line 191
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-eqz v3, :cond_4

    .line 196
    .line 197
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᛵᲇᲀ()V

    .line 198
    .line 199
    .line 200
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛳᲁᲁᲇ()V

    .line 201
    .line 202
    .line 203
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛵᛶᛲᲀ:Lyyds/ᲀᛷᛱ;

    .line 204
    .line 205
    monitor-enter v3

    .line 206
    :try_start_2
    iput-object v0, v3, Lyyds/ᲀᛷᛱ;->ᛳᲁᲁᲇ:Lyyds/ᲁᛱᛸᛵ;

    .line 207
    .line 208
    iput v1, v3, Lyyds/ᲀᛷᛱ;->ᲇᛱᛲ:I

    .line 209
    .line 210
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 211
    monitor-enter v3

    .line 212
    :try_start_3
    iget-object v0, v3, Lyyds/ᲀᛷᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛵᲁᛵᲁ;

    .line 213
    .line 214
    invoke-virtual {v0}, Lyyds/ᛵᲁᛵᲁ;->ᛲᲈᲁ()V

    .line 215
    .line 216
    .line 217
    iget-boolean v0, v3, Lyyds/ᲀᛷᛱ;->ᛶᛸᲀᲁ:Z

    .line 218
    .line 219
    if-eqz v0, :cond_5

    .line 220
    .line 221
    iget-object v0, v3, Lyyds/ᲀᛷᛱ;->ᛳᲁᲁᲇ:Lyyds/ᲁᛱᛸᛵ;

    .line 222
    .line 223
    invoke-interface {v0}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Lyyds/ᲀᛷᛱ;->ᲇᲇᲇᛱ()V

    .line 227
    .line 228
    .line 229
    monitor-exit v3

    .line 230
    goto :goto_3

    .line 231
    :catchall_0
    move-exception v0

    .line 232
    move-object p0, v0

    .line 233
    goto/16 :goto_6

    .line 234
    .line 235
    :cond_5
    iget-object v0, v3, Lyyds/ᲀᛷᛱ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲀᛶ;

    .line 236
    .line 237
    iget-object v0, v0, Lyyds/ᲁᛶᲀᛶ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_c

    .line 244
    .line 245
    iget-boolean v0, v3, Lyyds/ᲀᛷᛱ;->ᛶᛳᛶᛵ:Z

    .line 246
    .line 247
    if-nez v0, :cond_b

    .line 248
    .line 249
    iget-object v7, v3, Lyyds/ᲀᛷᛱ;->ᛳᲁᲁᲇ:Lyyds/ᲁᛱᛸᛵ;

    .line 250
    .line 251
    iget-boolean v8, v3, Lyyds/ᲀᛷᛱ;->ᛲᛲᲈᲈ:Z

    .line 252
    .line 253
    iget-object v10, v3, Lyyds/ᲀᛷᛱ;->ᛷᛵᲇᲀ:Lyyds/ᛸᲁᛲᛷ;

    .line 254
    .line 255
    iget-object v11, v3, Lyyds/ᲀᛷᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛳᛳᛵ;

    .line 256
    .line 257
    new-instance v6, Lyyds/ᲀᲀᛱ;

    .line 258
    .line 259
    const/4 v9, 0x1

    .line 260
    invoke-direct/range {v6 .. v11}, Lyyds/ᲀᲀᛱ;-><init>(Lyyds/ᲁᛱᛸᛵ;ZZLyyds/ᛶᲀᛶᲀ;Lyyds/ᲈᛳᛳᛵ;)V

    .line 261
    .line 262
    .line 263
    iput-object v6, v3, Lyyds/ᲀᛷᛱ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲀᛱ;

    .line 264
    .line 265
    iput-boolean v5, v3, Lyyds/ᲀᛷᛱ;->ᛶᛳᛶᛵ:Z

    .line 266
    .line 267
    iget-object v0, v3, Lyyds/ᲀᛷᛱ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲀᛶ;

    .line 268
    .line 269
    new-instance v1, Ljava/util/ArrayList;

    .line 270
    .line 271
    iget-object v0, v0, Lyyds/ᲁᛶᲀᛶ;->ᲀᛲᛳᲀ:Ljava/util/ArrayList;

    .line 272
    .line 273
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    add-int/2addr v0, v5

    .line 281
    invoke-virtual {v3, v0}, Lyyds/ᲀᛷᛱ;->ᲇᲈᛵᛷ(I)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v3, Lyyds/ᲀᛷᛱ;->ᛷᛵᲇᲀ:Lyyds/ᛸᲁᛲᛷ;

    .line 285
    .line 286
    iget-object v6, v3, Lyyds/ᲀᛷᛱ;->ᛳᛸᛴᛶ:Lyyds/ᲀᲀᛱ;

    .line 287
    .line 288
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 289
    iget-object v7, v3, Lyyds/ᲀᛷᛱ;->ᛶᛷᛲᲁ:Lyyds/ᲈᛳᛳᛵ;

    .line 290
    .line 291
    invoke-virtual {v7, v3, v0, v6}, Lyyds/ᲈᛳᛳᛵ;->ᛲᛴᛳᛲ(Lyyds/ᲀᛷᛱ;Lyyds/ᛸᲁᛲᛷ;Lyyds/ᲀᲀᛱ;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_6

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Lyyds/ᛴᛲᛲᛳ;

    .line 309
    .line 310
    iget-object v6, v1, Lyyds/ᛴᛲᛲᛳ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/Executor;

    .line 311
    .line 312
    new-instance v7, Lyyds/ᲈᛱᛸᛷ;

    .line 313
    .line 314
    iget-object v1, v1, Lyyds/ᛴᛲᛲᛳ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛶᛸ;

    .line 315
    .line 316
    invoke-direct {v7, v3, v1, v5}, Lyyds/ᲈᛱᛸᛷ;-><init>(Lyyds/ᲀᛷᛱ;Lyyds/ᛲᛷᛶᛸ;I)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 320
    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_6
    invoke-virtual {v3}, Lyyds/ᲀᛷᛱ;->ᛵᛸᛸᛷ()V

    .line 324
    .line 325
    .line 326
    :goto_3
    const/4 v0, 0x5

    .line 327
    iput v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᛷᛶᛷᲀ:I

    .line 328
    .line 329
    :try_start_4
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛱᲈᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 330
    .line 331
    iget-object v0, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, Lyyds/ᛶᛱᛵᲁ;

    .line 334
    .line 335
    if-eqz v0, :cond_7

    .line 336
    .line 337
    move v4, v5

    .line 338
    :cond_7
    if-eqz v4, :cond_8

    .line 339
    .line 340
    iget-object v0, p0, Lyyds/ᛷᲁᲀᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲇᛲᲁ;

    .line 341
    .line 342
    iget-object v3, p0, Lyyds/ᛷᲁᲀᲁ;->ᛶᛳᛶᛵ:Lyyds/ᛴᛳᲀᲈ;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 343
    .line 344
    :try_start_5
    invoke-virtual {v0}, Lyyds/ᛳᲇᛲᲁ;->ᛲᲈᲁ()Lyyds/ᛳᛵᛶᲇ;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    iget-object v4, v1, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v4, Lyyds/ᛶᲀᛶᲀ;

    .line 351
    .line 352
    new-instance v6, Lyyds/ᛳᛷᲀᛴ;

    .line 353
    .line 354
    iget-object v7, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v7, Lyyds/ᛳᲇᛶᛷ;

    .line 357
    .line 358
    iget-object v8, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v8, Lyyds/ᛶᛱᛵᲁ;

    .line 361
    .line 362
    const/16 v9, 0x9

    .line 363
    .line 364
    invoke-direct {v6, v7, v8, v3, v9}, Lyyds/ᛳᛷᲀᛴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v0, v4, v6}, Lyyds/ᛳᛵᛶᲇ;->ᛲᲈᲁ(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᛷᲀᛴ;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 368
    .line 369
    .line 370
    :try_start_6
    iget-object v0, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, Lyyds/ᛶᛱᛵᲁ;

    .line 373
    .line 374
    invoke-virtual {v0}, Lyyds/ᛶᛱᛵᲁ;->ᛲᲈᲁ()V

    .line 375
    .line 376
    .line 377
    goto :goto_4

    .line 378
    :catchall_1
    move-exception v0

    .line 379
    move-object p0, v0

    .line 380
    iget-object v0, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Lyyds/ᛶᛱᛵᲁ;

    .line 383
    .line 384
    invoke-virtual {v0}, Lyyds/ᛶᛱᛵᲁ;->ᛲᲈᲁ()V

    .line 385
    .line 386
    .line 387
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 388
    :catchall_2
    move-exception v0

    .line 389
    move-object p0, v0

    .line 390
    goto :goto_5

    .line 391
    :cond_8
    :goto_4
    if-eqz v2, :cond_9

    .line 392
    .line 393
    invoke-virtual {v2}, Lyyds/ᛶᛱᛵᲁ;->ᛲᲈᲁ()V

    .line 394
    .line 395
    .line 396
    :cond_9
    iget-object v1, p0, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛱᛱᲁ;

    .line 397
    .line 398
    monitor-enter v1

    .line 399
    :try_start_7
    iput-boolean v5, v1, Lyyds/ᛱᛱᛱᲁ;->ᛵᛸᛸᛷ:Z

    .line 400
    .line 401
    invoke-virtual {v1}, Lyyds/ᛱᛱᛱᲁ;->ᛲᲈᲁ()Z

    .line 402
    .line 403
    .line 404
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 405
    monitor-exit v1

    .line 406
    if-eqz v0, :cond_e

    .line 407
    .line 408
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛷᛲᲈᛱ()V

    .line 409
    .line 410
    .line 411
    goto :goto_7

    .line 412
    :catchall_3
    move-exception v0

    .line 413
    move-object p0, v0

    .line 414
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 415
    throw p0

    .line 416
    :goto_5
    if-eqz v2, :cond_a

    .line 417
    .line 418
    invoke-virtual {v2}, Lyyds/ᛶᛱᛵᲁ;->ᛲᲈᲁ()V

    .line 419
    .line 420
    .line 421
    :cond_a
    throw p0

    .line 422
    :cond_b
    :try_start_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 423
    .line 424
    const-string v0, "Already have resource"

    .line 425
    .line 426
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    throw p0

    .line 430
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 431
    .line 432
    const-string v0, "Received a resource without any callbacks to notify"

    .line 433
    .line 434
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw p0

    .line 438
    :goto_6
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 439
    throw p0

    .line 440
    :catchall_4
    move-exception v0

    .line 441
    move-object p0, v0

    .line 442
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 443
    throw p0

    .line 444
    :cond_d
    invoke-virtual {p0}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛲᲈᲈ()V

    .line 445
    .line 446
    .line 447
    :cond_e
    :goto_7
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛳᲇᛶᲀ;Ljava/lang/Object;I)Lyyds/ᲁᛱᛸᛵ;
    .locals 5

    .line 1
    const-string v0, "Decoded result "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    sget v2, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p0, p3, p2}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛴᛳᛲ(ILjava/lang/Object;)Lyyds/ᲁᛱᛸᛵ;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "DecodeJob"

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p0, v2, v3, p3, v1}, Lyyds/ᛷᲁᲀᲁ;->ᛲᛳᛶᲁ(JLjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {p1}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :goto_1
    invoke-interface {p1}, Lyyds/ᛳᲇᛶᲀ;->ᛵᛸᛸᛷ()V

    .line 52
    .line 53
    .line 54
    throw p0
.end method
