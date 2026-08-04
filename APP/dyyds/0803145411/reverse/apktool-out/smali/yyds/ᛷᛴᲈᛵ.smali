.class public final synthetic Lyyds/ᛷᛴᲈᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲈᲁᲁᛲ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛲᛶᲀᛱ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛲᛶᲀᛱ;Lyyds/ᲈᲁᲁᛲ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛷᛴᲈᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛷᛴᲈᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛶᲀᛱ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛷᛴᲈᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᲁᛲ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛷᛴᲈᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lyyds/ᛷᛴᲈᛵ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᲁᛲ;

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛷᛴᲈᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛶᲀᛱ;

    .line 7
    .line 8
    check-cast p1, Lyyds/ᛱᛵᛷ;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-wide v3, -0x4fcd3e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᛲᛶᲀᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛵᲈᲁ;

    .line 22
    .line 23
    const-wide v3, -0x111abe68a836eL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {p1, v0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :try_start_0
    invoke-virtual {p0, v0, v2}, Lyyds/ᛱᛵᲈᲁ;->ᛶᛷᛲᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲇᲇᛱ(Lyyds/ᛱᛵᛷ;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    invoke-static {v0, p0}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :pswitch_0
    const-wide v3, -0x4fcafe68a836eL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lyyds/ᛲᛶᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛶᲇᲁ;

    .line 70
    .line 71
    const-wide v3, -0x12a3e68a836eL

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p1, p0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :try_start_2
    invoke-static {p0, v2}, Lyyds/ᛷᛶᲇᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Lyyds/ᛳᛴᲁᲇ;->ᲇᲇᲇᛱ(Lyyds/ᛱᛵᛷ;)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-nez p0, :cond_0

    .line 98
    .line 99
    const-wide/16 p0, -0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const-string p0, "SELECT last_insert_rowid()"

    .line 103
    .line 104
    invoke-interface {p1, p0}, Lyyds/ᛱᛵᛷ;->ᲀᛲᛱᛱ(Ljava/lang/String;)Lyyds/ᛵᲇᛱᛸ;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :try_start_3
    invoke-interface {p0}, Lyyds/ᛵᲇᛱᛸ;->ᛵᲀᛵᛸ()Z

    .line 109
    .line 110
    .line 111
    const/4 p1, 0x0

    .line 112
    invoke-interface {p0, p1}, Lyyds/ᛵᲇᛱᛸ;->getLong(I)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 116
    invoke-static {p0, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-wide p0, v2

    .line 120
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :catchall_2
    move-exception p1

    .line 126
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 127
    :catchall_3
    move-exception v0

    .line 128
    invoke-static {p0, p1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :catchall_4
    move-exception p1

    .line 133
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 134
    :catchall_5
    move-exception v0

    .line 135
    invoke-static {p0, p1}, Lyyds/ᛴᛲᛴᛲ;->ᛲᲈᲁ(Lyyds/ᛵᲇᛱᛸ;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
