.class public final synthetic Lyyds/ᲀᛸᛶᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᲀᛷᛷ;II)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    .line 2
    iput p3, p0, Lyyds/ᲀᛸᛶᛱ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 8
    .line 9
    iput p2, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛴᲀᛷᛷ;ILjava/util/List;)V
    .locals 0

    .line 12
    const/4 p3, 0x1

    iput p3, p0, Lyyds/ᲀᛸᛶᛱ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    iput p2, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛴᲀᛷᛷ;ILjava/util/List;Z)V
    .locals 0

    .line 13
    const/4 p3, 0x0

    iput p3, p0, Lyyds/ᲀᛸᛶᛱ;->ᲀᛲᛳᲀ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    iput p2, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲀᛸᛶᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 9
    .line 10
    iget p0, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    iget-object v1, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v1, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 29
    .line 30
    return-object p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0

    .line 33
    throw p0

    .line 34
    :pswitch_0
    iget-object v0, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 35
    .line 36
    iget p0, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    .line 37
    .line 38
    iget-object v2, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v2, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 44
    .line 45
    invoke-virtual {v2, p0, v1}, Lyyds/ᛲᛱᛷᲀ;->ᛵᛶᛲᲀ(II)V

    .line 46
    .line 47
    .line 48
    monitor-enter v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 49
    :try_start_2
    iget-object v1, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    .line 57
    .line 58
    :try_start_3
    monitor-exit v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    monitor-exit v0

    .line 62
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 63
    :catch_0
    :goto_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    iget-object v0, p0, Lyyds/ᲀᛸᛶᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 67
    .line 68
    iget p0, p0, Lyyds/ᲀᛸᛶᛱ;->ᛲᛴᛳᛲ:I

    .line 69
    .line 70
    iget-object v2, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    :try_start_4
    iget-object v2, v0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 76
    .line 77
    invoke-virtual {v2, p0, v1}, Lyyds/ᛲᛱᛷᲀ;->ᛵᛶᛲᲀ(II)V

    .line 78
    .line 79
    .line 80
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 81
    :try_start_5
    iget-object v1, v0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

    .line 82
    .line 83
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 88
    .line 89
    .line 90
    :try_start_6
    monitor-exit v0

    .line 91
    goto :goto_1

    .line 92
    :catchall_2
    move-exception p0

    .line 93
    monitor-exit v0

    .line 94
    throw p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 95
    :catch_1
    :goto_1
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
