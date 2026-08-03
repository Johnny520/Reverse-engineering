.class public final synthetic Lwb/tf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/tf;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/tf;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/tf;->i:Lfg/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/tf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const/16 v7, 0x36

    .line 32
    .line 33
    const/16 v8, 0x8

    .line 34
    .line 35
    const-string v1, "\u641c\u7d22"

    .line 36
    .line 37
    const-string v2, "\u6309\u89c4\u5219\u540d\u6216\u5173\u952e\u8bcd\u7b5b\u9009"

    .line 38
    .line 39
    iget-object v3, p0, Lwb/tf;->h:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    iget-object v5, p0, Lwb/tf;->i:Lfg/l;

    .line 43
    .line 44
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 49
    .line 50
    .line 51
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    move-object v5, p1

    .line 55
    check-cast v5, Li0/h0;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    and-int/lit8 p2, p1, 0x3

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    const/4 v1, 0x1

    .line 67
    if-eq p2, v0, :cond_2

    .line 68
    .line 69
    move p2, v1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 p2, 0x0

    .line 72
    :goto_2
    and-int/2addr p1, v1

    .line 73
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    const/16 v6, 0x36

    .line 80
    .line 81
    const/16 v7, 0x8

    .line 82
    .line 83
    const-string v0, "\u641c\u7d22"

    .line 84
    .line 85
    const-string v1, "\u6309\u89c4\u5219\u540d\u3001\u4f1a\u8bdd\u3001\u7fa4\u6210\u5458\u6216\u6d88\u606f\u7c7b\u578b\u7b5b\u9009"

    .line 86
    .line 87
    iget-object v2, p0, Lwb/tf;->h:Ljava/lang/String;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    iget-object v4, p0, Lwb/tf;->i:Lfg/l;

    .line 91
    .line 92
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 97
    .line 98
    .line 99
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1

    .line 102
    :pswitch_1
    move-object v5, p1

    .line 103
    check-cast v5, Li0/h0;

    .line 104
    .line 105
    check-cast p2, Ljava/lang/Integer;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    and-int/lit8 p2, p1, 0x3

    .line 112
    .line 113
    const/4 v0, 0x2

    .line 114
    const/4 v1, 0x1

    .line 115
    if-eq p2, v0, :cond_4

    .line 116
    .line 117
    move p2, v1

    .line 118
    goto :goto_4

    .line 119
    :cond_4
    const/4 p2, 0x0

    .line 120
    :goto_4
    and-int/2addr p1, v1

    .line 121
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_5

    .line 126
    .line 127
    const/16 v6, 0x36

    .line 128
    .line 129
    const/16 v7, 0x8

    .line 130
    .line 131
    const-string v0, "\u641c\u7d22"

    .line 132
    .line 133
    const-string v1, "\u5173\u952e\u8bcd"

    .line 134
    .line 135
    iget-object v2, p0, Lwb/tf;->h:Ljava/lang/String;

    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    iget-object v4, p0, Lwb/tf;->i:Lfg/l;

    .line 139
    .line 140
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_5
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 145
    .line 146
    .line 147
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 148
    .line 149
    return-object p1

    .line 150
    :pswitch_2
    move-object v5, p1

    .line 151
    check-cast v5, Li0/h0;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    and-int/lit8 p2, p1, 0x3

    .line 160
    .line 161
    const/4 v0, 0x2

    .line 162
    const/4 v1, 0x1

    .line 163
    if-eq p2, v0, :cond_6

    .line 164
    .line 165
    move p2, v1

    .line 166
    goto :goto_6

    .line 167
    :cond_6
    const/4 p2, 0x0

    .line 168
    :goto_6
    and-int/2addr p1, v1

    .line 169
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_7

    .line 174
    .line 175
    const/16 v6, 0x36

    .line 176
    .line 177
    const/16 v7, 0x8

    .line 178
    .line 179
    const-string v0, "\u641c\u7d22"

    .line 180
    .line 181
    const-string v1, "\u6635\u79f0 / wxid / \u7fa4\u53f7"

    .line 182
    .line 183
    iget-object v2, p0, Lwb/tf;->h:Ljava/lang/String;

    .line 184
    .line 185
    const/4 v3, 0x0

    .line 186
    iget-object v4, p0, Lwb/tf;->i:Lfg/l;

    .line 187
    .line 188
    invoke-static/range {v0 .. v7}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_7
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 193
    .line 194
    .line 195
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 196
    .line 197
    return-object p1

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
