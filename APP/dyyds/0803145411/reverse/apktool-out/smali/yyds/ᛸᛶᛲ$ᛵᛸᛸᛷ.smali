.class public Lyyds/ᛸᛶᛲ$ᛵᛸᛸᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛴ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyyds/ᛸᛶᛲ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;Lyyds/ᲈᲈᛸᛳ;)Lyyds/ᲈᛸᛷ;
    .locals 3

    .line 1
    iget-object p0, p2, Lyyds/ᲈᲈᛸᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const-string v0, "java.time."

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    const-class p2, Ljava/time/Duration;

    .line 18
    .line 19
    if-ne p0, p2, :cond_1

    .line 20
    .line 21
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲇᛲᛱᲀ;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    const-class p2, Ljava/time/Instant;

    .line 25
    .line 26
    if-ne p0, p2, :cond_2

    .line 27
    .line 28
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛵᛸᛸᛷ:Lyyds/ᲇᛲᛱᲀ;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    const-class p2, Ljava/time/LocalDate;

    .line 32
    .line 33
    if-ne p0, p2, :cond_3

    .line 34
    .line 35
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲇᛲᛱᲀ;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    const-class p2, Ljava/time/LocalTime;

    .line 39
    .line 40
    if-ne p0, p2, :cond_4

    .line 41
    .line 42
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛲᛱᲀ;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_4
    const-class v0, Ljava/time/LocalDateTime;

    .line 46
    .line 47
    if-ne p0, v0, :cond_5

    .line 48
    .line 49
    invoke-static {p1}, Lyyds/ᛸᛶᛲ;->ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;)Lyyds/ᛳᲇᛸᛴ;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_5
    const-class v0, Ljava/time/MonthDay;

    .line 55
    .line 56
    if-ne p0, v0, :cond_6

    .line 57
    .line 58
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛲᛱᲀ;

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_6
    const-class v0, Ljava/time/OffsetDateTime;

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    const-class v2, Ljava/time/ZoneOffset;

    .line 65
    .line 66
    if-ne p0, v0, :cond_7

    .line 67
    .line 68
    invoke-static {p1}, Lyyds/ᛸᛶᛲ;->ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;)Lyyds/ᛳᲇᛸᛴ;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p1, v2}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance p2, Lyyds/ᛷᛴᲇᲀ;

    .line 77
    .line 78
    invoke-direct {p2, p0, p1, v1}, Lyyds/ᛷᛴᲇᲀ;-><init>(Lyyds/ᲈᛸᛷ;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lyyds/ᲈᛸᛷ;->ᛲᲈᲁ()Lyyds/ᛳᲇᛸᛴ;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :cond_7
    const-class v0, Ljava/time/OffsetTime;

    .line 87
    .line 88
    if-ne p0, v0, :cond_8

    .line 89
    .line 90
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛲᲈᲁ:Lyyds/ᲇᛲᛱᲀ;

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p1, v2}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance p2, Lyyds/ᛱᛶᛸᲀ;

    .line 101
    .line 102
    invoke-direct {p2, p0, p1, v1}, Lyyds/ᛱᛶᛸᲀ;-><init>(Lyyds/ᲈᛸᛷ;Lyyds/ᲈᛸᛷ;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2}, Lyyds/ᲈᛸᛷ;->ᛲᲈᲁ()Lyyds/ᛳᲇᛸᛴ;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_8
    const-class p2, Ljava/time/Period;

    .line 111
    .line 112
    if-ne p0, p2, :cond_9

    .line 113
    .line 114
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲇᛲᛱᲀ;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_9
    const-class p2, Ljava/time/Year;

    .line 118
    .line 119
    if-ne p0, p2, :cond_a

    .line 120
    .line 121
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛱᲀ;

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_a
    const-class p2, Ljava/time/YearMonth;

    .line 125
    .line 126
    if-ne p0, p2, :cond_b

    .line 127
    .line 128
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛱᲈᲁ:Lyyds/ᲇᛲᛱᲀ;

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_b
    const-class p2, Ljava/time/ZoneId;

    .line 132
    .line 133
    if-eq p0, p2, :cond_e

    .line 134
    .line 135
    if-ne p0, v2, :cond_c

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_c
    const-class v0, Ljava/time/ZonedDateTime;

    .line 139
    .line 140
    if-ne p0, v0, :cond_d

    .line 141
    .line 142
    invoke-static {p1}, Lyyds/ᛸᛶᛲ;->ᛲᲈᲁ(Lyyds/ᛱᛴᲇᲀ;)Lyyds/ᛳᲇᛸᛴ;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p1, v2}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p1, p2}, Lyyds/ᛱᛴᲇᲀ;->ᲀᛲᛳᲀ(Ljava/lang/Class;)Lyyds/ᲈᛸᛷ;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance p2, Lyyds/ᛷᲀᛶ;

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    invoke-direct {p2, p0, v0, p1, v1}, Lyyds/ᛷᲀᛶ;-><init>(Ljava/lang/Object;Lyyds/ᲈᛸᛷ;Ljava/lang/Object;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Lyyds/ᲈᛸᛷ;->ᛲᲈᲁ()Lyyds/ᛳᲇᛸᛴ;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_d
    :goto_0
    const/4 p0, 0x0

    .line 166
    return-object p0

    .line 167
    :cond_e
    :goto_1
    sget-object p0, Lyyds/ᛸᛶᛲ;->ᛲᛳᛶᲁ:Lyyds/ᛳᲇᛸᛴ;

    .line 168
    .line 169
    return-object p0
.end method
