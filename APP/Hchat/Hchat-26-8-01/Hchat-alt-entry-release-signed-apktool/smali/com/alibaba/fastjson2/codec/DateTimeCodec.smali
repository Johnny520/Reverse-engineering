.class public abstract Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field dateFormatter:Ljava/time/format/DateTimeFormatter;

.field public final format:Ljava/lang/String;

.field protected final formatHasDay:Z

.field protected final formatHasHour:Z

.field public final formatISO8601:Z

.field public final formatMillis:Z

.field public final formatUnixTime:Z

.field public final locale:Ljava/util/Locale;

.field protected final useSimpleDateFormat:Z

.field public final useSimpleFormatter:Z

.field protected final yyyyMMdd10:Z

.field protected final yyyyMMdd8:Z

.field protected final yyyyMMddhhmm16:Z

.field protected final yyyyMMddhhmmss14:Z

.field protected final yyyyMMddhhmmss19:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 203
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "aa"

    .line 7
    .line 8
    const-string v1, "a"

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 17
    .line 18
    const-string p2, "yyyyMMddHHmmss"

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 25
    .line 26
    const-string p2, "yyyy-MM-dd HH:mm:ss"

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 33
    .line 34
    const-string p2, "yyyy-MM-dd HH:mm"

    .line 35
    .line 36
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmm16:Z

    .line 41
    .line 42
    const-string p2, "yyyy-MM-dd"

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 49
    .line 50
    const-string p2, "yyyyMMdd"

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd8:Z

    .line 57
    .line 58
    const-string p2, "yyyy-MM-dd\'T\'HH:mm:ssXXX"

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->useSimpleDateFormat:Z

    .line 65
    .line 66
    const/4 p2, 0x0

    .line 67
    if-eqz p1, :cond_7

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x1

    .line 74
    const/4 v2, -0x1

    .line 75
    sparse-switch v0, :sswitch_data_0

    .line 76
    .line 77
    .line 78
    :goto_0
    move v0, v2

    .line 79
    goto :goto_1

    .line 80
    :sswitch_0
    const-string v0, "iso8601"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v0, 0x2

    .line 90
    goto :goto_1

    .line 91
    :sswitch_1
    const-string v0, "unixtime"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    move v0, v1

    .line 101
    goto :goto_1

    .line 102
    :sswitch_2
    const-string v0, "millis"

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    move v0, p2

    .line 112
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    const/16 v0, 0x64

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eq v0, v2, :cond_4

    .line 122
    .line 123
    move v0, v1

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    move v0, p2

    .line 126
    :goto_2
    const/16 v3, 0x48

    .line 127
    .line 128
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-ne v3, v2, :cond_6

    .line 133
    .line 134
    const/16 v3, 0x68

    .line 135
    .line 136
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-ne v3, v2, :cond_6

    .line 141
    .line 142
    const/16 v3, 0x4b

    .line 143
    .line 144
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-ne v3, v2, :cond_6

    .line 149
    .line 150
    const/16 v3, 0x6b

    .line 151
    .line 152
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-eq v3, v2, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    move v1, p2

    .line 160
    :cond_6
    :goto_3
    move v2, v0

    .line 161
    move v3, v1

    .line 162
    move v0, p2

    .line 163
    move v1, v0

    .line 164
    goto :goto_6

    .line 165
    :pswitch_0
    move v2, p2

    .line 166
    move v3, v2

    .line 167
    move v0, v1

    .line 168
    :goto_4
    move v1, v3

    .line 169
    goto :goto_6

    .line 170
    :pswitch_1
    move v0, p2

    .line 171
    move v2, v0

    .line 172
    move v3, v2

    .line 173
    move p2, v1

    .line 174
    goto :goto_4

    .line 175
    :pswitch_2
    move v0, p2

    .line 176
    move v2, v0

    .line 177
    :goto_5
    move v3, v2

    .line 178
    goto :goto_6

    .line 179
    :cond_7
    move v0, p2

    .line 180
    move v1, v0

    .line 181
    move v2, v1

    .line 182
    goto :goto_5

    .line 183
    :goto_6
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 184
    .line 185
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 186
    .line 187
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 188
    .line 189
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasDay:Z

    .line 190
    .line 191
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasHour:Z

    .line 192
    .line 193
    const-string p2, "yyyyMMddHHmmssSSSZ"

    .line 194
    .line 195
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->useSimpleFormatter:Z

    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :sswitch_data_0
    .sparse-switch
        -0x400565ba -> :sswitch_2
        -0x112ad7ab -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getDateFormatter()Ljava/time/format/DateTimeFormatter;
    .locals 2

    .line 80
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    if-nez v1, :cond_1

    .line 81
    iget-object v1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    if-nez v1, :cond_0

    .line 82
    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    goto :goto_0

    .line 83
    :cond_0
    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    iput-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 84
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public getDateFormatter(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 6
    .line 7
    if-nez v0, :cond_6

    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 10
    .line 11
    if-nez v0, :cond_6

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eq p1, v0, :cond_2

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/Locale;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    if-nez p1, :cond_5

    .line 48
    .line 49
    iget-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->locale:Ljava/util/Locale;

    .line 50
    .line 51
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 52
    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_4
    invoke-static {v0, p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v0, p1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_6
    :goto_0
    const/4 p1, 0x0

    .line 79
    return-object p1
.end method
