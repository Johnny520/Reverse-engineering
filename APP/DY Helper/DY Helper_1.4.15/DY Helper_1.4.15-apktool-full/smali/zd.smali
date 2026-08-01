.class public final synthetic Lzd;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lzd;->ε:I

    iput-object p2, p0, Lzd;->ζ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr21;Lq21;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Lzd;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzd;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lzd;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lzd;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lla2;

    .line 9
    .line 10
    check-cast p1, Landroid/net/Uri;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/String;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const/4 p3, 0x0

    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p2, p3

    .line 40
    :goto_0
    if-nez p2, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    move-object v2, p2

    .line 44
    goto :goto_3

    .line 45
    :cond_2
    :goto_2
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-nez p2, :cond_1

    .line 50
    .line 51
    const-string p2, "\u97f3\u9891\u6587\u4ef6"

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_3
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lqa2;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v5}, Lqa2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 64
    .line 65
    .line 66
    move-object p3, v0

    .line 67
    :cond_3
    sget-object p1, Lib2;->β:Landroid/os/Handler;

    .line 68
    .line 69
    new-instance p2, Lka2;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p2, p0, v0, p3}, Lka2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    :goto_4
    sget-object p0, Ls62;->α:Ls62;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_0
    check-cast p0, Lic;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    check-cast p2, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide p1

    .line 95
    check-cast p3, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const-wide/16 v2, 0x0

    .line 101
    .line 102
    cmp-long p3, p1, v2

    .line 103
    .line 104
    const-string v2, "\u6b63\u5728\u4e0b\u8f7d "

    .line 105
    .line 106
    if-lez p3, :cond_4

    .line 107
    .line 108
    const/16 p3, 0x64

    .line 109
    .line 110
    int-to-long v3, p3

    .line 111
    mul-long/2addr v0, v3

    .line 112
    div-long/2addr v0, p1

    .line 113
    long-to-int p1, v0

    .line 114
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    new-instance p3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p1, "%"

    .line 127
    .line 128
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p0, p2, p1}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const/4 p1, 0x0

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/16 p2, 0x400

    .line 145
    .line 146
    int-to-long p2, p2

    .line 147
    div-long/2addr v0, p2

    .line 148
    new-instance p2, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string p3, " KB"

    .line 157
    .line 158
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p0, p1, p2}, Lic;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    :goto_5
    sget-object p0, Ls62;->α:Ls62;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_1
    check-cast p0, Lns1;

    .line 172
    .line 173
    check-cast p1, Ljava/lang/Throwable;

    .line 174
    .line 175
    check-cast p2, Ls62;

    .line 176
    .line 177
    check-cast p3, Lup;

    .line 178
    .line 179
    invoke-virtual {p0}, Lns1;->β()V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :pswitch_2
    check-cast p0, Lr21;

    .line 184
    .line 185
    check-cast p1, Ljava/lang/Throwable;

    .line 186
    .line 187
    check-cast p2, Ls62;

    .line 188
    .line 189
    check-cast p3, Lup;

    .line 190
    .line 191
    sget-object p1, Lr21;->η:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 192
    .line 193
    const/4 p2, 0x0

    .line 194
    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, p2}, Lr21;->γ(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto :goto_4

    .line 201
    :pswitch_3
    check-cast p0, Lθ;

    .line 202
    .line 203
    check-cast p1, Ljava/lang/Throwable;

    .line 204
    .line 205
    check-cast p3, Lup;

    .line 206
    .line 207
    invoke-virtual {p0, p1}, Lθ;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    goto/16 :goto_4

    .line 211
    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
