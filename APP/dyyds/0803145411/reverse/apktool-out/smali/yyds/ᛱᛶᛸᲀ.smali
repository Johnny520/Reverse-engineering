.class public final Lyyds/ᛱᛶᛸᲀ;
.super Lyyds/ᲈᛸᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛷ;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛷ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲈᛸᛷ;Lyyds/ᲈᛸᛷ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛱᛶᛸᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛱᛶᛸᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛷ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛱᛶᛸᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛷ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛱᛶᛸᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛱᛶᛸᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛷ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛱᛶᛸᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛷ;

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "time"

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 15
    .line 16
    .line 17
    move-object v0, v3

    .line 18
    :goto_0
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const-string v6, "offset"

    .line 23
    .line 24
    if-eq v5, v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛱᛸᲁᲇ()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛵᲈᲇᛵ()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/time/LocalTime;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v1, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/time/ZoneOffset;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᛱᛲ()V

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v4, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v6, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v3, v0}, Ljava/time/OffsetTime;->of(Ljava/time/LocalTime;Ljava/time/ZoneOffset;)Ljava/time/OffsetTime;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_0
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᲇᲇᛱ()V

    .line 75
    .line 76
    .line 77
    move-object v0, v3

    .line 78
    :goto_1
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛲᲀᛲᛲ()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const-string v6, "date"

    .line 83
    .line 84
    if-eq v5, v2, :cond_5

    .line 85
    .line 86
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛱᛸᲁᲇ()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_4

    .line 95
    .line 96
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-nez v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᛵᲈᲇᛵ()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {v1, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ljava/time/LocalTime;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_4
    invoke-virtual {p0, p1}, Lyyds/ᲈᛸᛷ;->ᛵᛸᛸᛷ(Lyyds/ᲀᛲᛴᲇ;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    check-cast v3, Ljava/time/LocalDate;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    invoke-virtual {p1}, Lyyds/ᲀᛲᛴᲇ;->ᲇᛱᛲ()V

    .line 121
    .line 122
    .line 123
    invoke-static {v3, v6, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v4, p1}, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ(Ljava/io/Serializable;Ljava/lang/String;Lyyds/ᲀᛲᛴᲇ;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v3, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛱᛶᛸᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛱᛶᛸᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛸᛷ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛱᛶᛸᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛸᛷ;

    .line 6
    .line 7
    const-string v2, "time"

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, Ljava/time/OffsetTime;

    .line 13
    .line 14
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᛶᛷᛲᲁ()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/time/OffsetTime;->toLocalTime()Ljava/time/LocalTime;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, p1, v0}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const-string p0, "offset"

    .line 28
    .line 29
    invoke-virtual {p1, p0}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/time/OffsetTime;->getOffset()Ljava/time/ZoneOffset;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p1, p0}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᲇᛱᛲ()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    check-cast p2, Ljava/time/LocalDateTime;

    .line 44
    .line 45
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᛶᛷᛲᲁ()V

    .line 46
    .line 47
    .line 48
    const-string v0, "date"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0, p1, v0}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v2}, Lyyds/ᛶᲀᛳᲁ;->ᛵᛶᛲᲀ(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v1, p1, p0}, Lyyds/ᲈᛸᛷ;->ᲀᛲᛳᲀ(Lyyds/ᛶᲀᛳᲁ;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Lyyds/ᛶᲀᛳᲁ;->ᲇᛱᛲ()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
