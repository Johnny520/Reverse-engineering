.class public final synthetic Lyyds/ᛵᲈᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Class;

.field public final synthetic ᲀᛲᛳᲀ:J

.field public final synthetic ᲇᲇᲇᛱ:Z

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Ljava/lang/Class;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lyyds/ᛵᲈᛱᛴ;->ᲀᛲᛳᲀ:J

    .line 5
    .line 6
    iput-object p3, p0, Lyyds/ᛵᲈᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, Lyyds/ᛵᲈᛱᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Class;

    .line 9
    .line 10
    iput-boolean p5, p0, Lyyds/ᛵᲈᛱᛴ;->ᲇᲇᲇᛱ:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-wide v0, p0, Lyyds/ᛵᲈᛱᛴ;->ᲀᛲᛳᲀ:J

    .line 2
    .line 3
    iget-object v2, p0, Lyyds/ᛵᲈᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, Lyyds/ᛵᲈᛱᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Class;

    .line 6
    .line 7
    iget-boolean p0, p0, Lyyds/ᛵᲈᛱᛴ;->ᲇᲇᲇᛱ:Z

    .line 8
    .line 9
    sget-object v4, Lyyds/ᛸᛵᲈᛷ;->ᛶᛸᲀᲁ:Ljava/util/Map;

    .line 10
    .line 11
    const-wide v5, -0x39659e68a836eL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    monitor-enter v4

    .line 20
    :try_start_0
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    check-cast v5, Ljava/lang/Long;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    monitor-exit v4

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    cmp-long v4, v4, v0

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    sget-object v4, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 40
    .line 41
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Lyyds/ᛸᛵᲈᛷ;->ᲀᛴᲁᲈ(Ljava/lang/Object;Ljava/lang/Class;)Landroid/widget/ImageView;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {v4, v2}, Lyyds/ᛸᛵᲈᛷ;->ᛸᛴᛵᛶ(Landroid/widget/ImageView;)Lyyds/ᛷᲀᛶᛵ;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-wide v4, -0x392bde68a836eL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v2, v0}, Lyyds/ᛸᛵᲈᛷ;->ᛶᛵᛸᛲ(Lyyds/ᛷᲀᛶᛵ;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v1, Lyyds/ᛸᛶᛵᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛸᛶᛵᲈ;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const-wide v3, -0x38d1ce68a836eL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    iput-object v1, v0, Lyyds/ᲇᲁᲁᛱ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛵᲈ;

    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    const/4 v1, 0x1

    .line 103
    invoke-static {v2, p0, v1, v1, v0}, Lyyds/ᛸᛵᲈᛷ;->ᲀᛸᲈᲁ(Lyyds/ᛷᲀᛶᛵ;ZZZZ)V

    .line 104
    .line 105
    .line 106
    :goto_0
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_0
    move-exception p0

    .line 110
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 111
    .line 112
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object p0, v0

    .line 116
    :goto_1
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 123
    .line 124
    const-wide v1, -0x39673e68a836eL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v0, v1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    :goto_2
    return-void

    .line 137
    :catchall_1
    move-exception p0

    .line 138
    monitor-exit v4

    .line 139
    throw p0
.end method
