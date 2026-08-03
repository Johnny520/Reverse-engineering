.class public final Lj8/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:J

.field public final g:Ljava/util/List;


# direct methods
.method public constructor <init>(JILjava/lang/String;Ljava/lang/String;JJLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lj8/i;->a:J

    .line 5
    .line 6
    iput p3, p0, Lj8/i;->b:I

    .line 7
    .line 8
    iput-object p4, p0, Lj8/i;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lj8/i;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p6, p0, Lj8/i;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, Lj8/i;->f:J

    .line 15
    .line 16
    iput-object p10, p0, Lj8/i;->g:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lj8/i;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-lez v2, :cond_0

    .line 23
    .line 24
    move v2, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v3

    .line 27
    :goto_0
    if-eqz v2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_1
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Lj8/i;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-wide v1, p0, Lj8/i;->f:J

    .line 50
    .line 51
    const-wide/16 v5, 0x0

    .line 52
    .line 53
    cmp-long v7, v1, v5

    .line 54
    .line 55
    if-lez v7, :cond_4

    .line 56
    .line 57
    new-instance v7, Ljava/text/SimpleDateFormat;

    .line 58
    .line 59
    const-string v8, "yyyy-MM-dd"

    .line 60
    .line 61
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 66
    .line 67
    .line 68
    new-instance v8, Ljava/util/Date;

    .line 69
    .line 70
    invoke-direct {v8, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-wide v1, p0, Lj8/i;->e:J

    .line 81
    .line 82
    cmp-long v5, v1, v5

    .line 83
    .line 84
    if-lez v5, :cond_9

    .line 85
    .line 86
    if-gtz v5, :cond_5

    .line 87
    .line 88
    const-string v1, "0 B"

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_5
    const-string v5, "MB"

    .line 92
    .line 93
    const-string v6, "GB"

    .line 94
    .line 95
    const-string v7, "B"

    .line 96
    .line 97
    const-string v8, "KB"

    .line 98
    .line 99
    filled-new-array {v7, v8, v5, v6}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    long-to-double v1, v1

    .line 104
    :goto_2
    const-wide/high16 v6, 0x4090000000000000L    # 1024.0

    .line 105
    .line 106
    cmpl-double v8, v1, v6

    .line 107
    .line 108
    if-ltz v8, :cond_6

    .line 109
    .line 110
    const/4 v8, 0x3

    .line 111
    if-ge v3, v8, :cond_6

    .line 112
    .line 113
    div-double/2addr v1, v6

    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    .line 118
    .line 119
    cmpl-double v6, v1, v6

    .line 120
    .line 121
    if-gez v6, :cond_8

    .line 122
    .line 123
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 124
    .line 125
    rem-double v6, v1, v6

    .line 126
    .line 127
    const-wide/16 v8, 0x0

    .line 128
    .line 129
    cmpg-double v6, v6, v8

    .line 130
    .line 131
    if-nez v6, :cond_7

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 135
    .line 136
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v2, "%.1f"

    .line 149
    .line 150
    invoke-static {v6, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    goto :goto_4

    .line 155
    :cond_8
    :goto_3
    double-to-int v1, v1

    .line 156
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :goto_4
    aget-object v2, v5, v3

    .line 161
    .line 162
    const-string v3, " "

    .line 163
    .line 164
    invoke-static {v1, v3, v2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_9
    const/4 v4, 0x0

    .line 172
    const/16 v5, 0x3e

    .line 173
    .line 174
    const-string v1, " \u00b7 "

    .line 175
    .line 176
    const/4 v2, 0x0

    .line 177
    const/4 v3, 0x0

    .line 178
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    const-string v1, "\u7b14\u8bb0"

    .line 4
    .line 5
    iget v2, p0, Lj8/i;->b:I

    .line 6
    .line 7
    if-eq v2, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0xe

    .line 10
    .line 11
    if-eq v2, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x12

    .line 14
    .line 15
    if-eq v2, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x13

    .line 18
    .line 19
    if-eq v2, v0, :cond_0

    .line 20
    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const-string v0, "\u7c7b\u578b"

    .line 25
    .line 26
    invoke-static {v2, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_0
    const-string v0, "\u6587\u4ef6"

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    const-string v0, "\u97f3\u4e50"

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    const-string v0, "\u4f4d\u7f6e"

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_3
    const-string v0, "\u94fe\u63a5"

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_4
    const-string v0, "\u89c6\u9891"

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_5
    const-string v0, "\u8bed\u97f3"

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_6
    const-string v0, "\u56fe\u7247"

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_7
    const-string v0, "\u6587\u5b57"

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_0
    const-string v0, "\u5c0f\u7a0b\u5e8f"

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    return-object v1

    .line 59
    :cond_2
    const-string v0, "\u804a\u5929\u8bb0\u5f55"

    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_3
    return-object v1

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
