.class public final synthetic Lxhss/ᛱᛸᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

.field public final synthetic ᲇᛴᲇᛵ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲁᛲᛵ;II)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    iput p3, p0, Lxhss/ᛱᛸᲈᛶ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 8
    .line 9
    iput p2, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lxhss/ᲁᛲᛵ;ILjava/util/List;)V
    .locals 0

    .line 12
    const/4 p3, 0x0

    iput p3, p0, Lxhss/ᛱᛸᲈᛶ;->ᛱᛱᛲᲇ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    iput p2, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    return-void
.end method

.method public synthetic constructor <init>(Lxhss/ᲁᛲᛵ;ILjava/util/List;Z)V
    .locals 0

    .line 13
    const/4 p3, 0x2

    iput p3, p0, Lxhss/ᛱᛸᲈᛶ;->ᛱᛱᛲᲇ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    iput p2, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛱᛸᲈᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 9
    .line 10
    iget p0, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 11
    .line 12
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᛷᲁᲁ:Lxhss/ᛳᛴᲀᲁ;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 18
    .line 19
    invoke-virtual {v2, p0, v1}, Lxhss/ᲀᛱᛶᛳ;->ᛸᛶᲈᛶ(II)V

    .line 20
    .line 21
    .line 22
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :try_start_1
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᛲᛴᲀᲈ:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    .line 32
    :try_start_2
    monitor-exit v0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    monitor-exit v0

    .line 36
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 37
    :catch_0
    :goto_0
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object v0, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 41
    .line 42
    iget p0, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 43
    .line 44
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᛷᲁᲁ:Lxhss/ᛳᛴᲀᲁ;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_3
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᛲᛴᲀᲈ:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 57
    .line 58
    .line 59
    monitor-exit v0

    .line 60
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 61
    .line 62
    return-object p0

    .line 63
    :catchall_1
    move-exception p0

    .line 64
    monitor-exit v0

    .line 65
    throw p0

    .line 66
    :pswitch_1
    iget-object v0, p0, Lxhss/ᛱᛸᲈᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 67
    .line 68
    iget p0, p0, Lxhss/ᛱᛸᲈᛶ;->ᲇᛴᲇᛵ:I

    .line 69
    .line 70
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᛷᲁᲁ:Lxhss/ᛳᛴᲀᲁ;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    :try_start_4
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᲀᛷᲁᲀ:Lxhss/ᲀᛱᛶᛳ;

    .line 76
    .line 77
    invoke-virtual {v2, p0, v1}, Lxhss/ᲀᛱᛶᛳ;->ᛸᛶᲈᛶ(II)V

    .line 78
    .line 79
    .line 80
    monitor-enter v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 81
    :try_start_5
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᛲᛴᲀᲈ:Ljava/util/LinkedHashSet;

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
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

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
