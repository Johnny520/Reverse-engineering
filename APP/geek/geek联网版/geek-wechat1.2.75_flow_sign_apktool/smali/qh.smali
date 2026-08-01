.class public final synthetic Lqh;
.super Ljava/lang/Object;

# interfaces
.implements La0;
.implements Lym;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqh;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lqh;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/CharSequence;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const-string v1, "$this$DelimitedRangesSequence"

    .line 14
    .line 15
    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x0

    .line 25
    if-ne v1, v3, :cond_4

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    if-ne v1, v3, :cond_2

    .line 34
    .line 35
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-static {p1, v0, p2, v2, v1}, Li50;->E(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    :cond_0
    :goto_0
    move-object p2, v4

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Lsx;

    .line 56
    .line 57
    invoke-direct {p2, p1, v0}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_5

    .line 61
    .line 62
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string p2, "List has more than one element."

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 71
    .line 72
    const-string p2, "List is empty."

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_4
    new-instance v1, Llp;

    .line 79
    .line 80
    if-gez p2, :cond_5

    .line 81
    .line 82
    move p2, v2

    .line 83
    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-direct {v1, p2, v2, v3}, Ljp;-><init>(III)V

    .line 88
    .line 89
    .line 90
    instance-of v2, p1, Ljava/lang/String;

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    iget v1, v1, Ljp;->b:I

    .line 94
    .line 95
    if-eqz v2, :cond_a

    .line 96
    .line 97
    if-le p2, v1, :cond_6

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_6
    move v6, p2

    .line 101
    :goto_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v8, v2

    .line 116
    check-cast v8, Ljava/lang/String;

    .line 117
    .line 118
    move-object v9, p1

    .line 119
    check-cast v9, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    const/4 v5, 0x0

    .line 126
    invoke-static/range {v5 .. v10}, Li50;->G(IIILjava/lang/String;Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_8
    move-object v2, v4

    .line 134
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v2, :cond_9

    .line 137
    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, Lsx;

    .line 143
    .line 144
    invoke-direct {p2, p1, v2}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    if-eq v6, v1, :cond_0

    .line 149
    .line 150
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_a
    if-le p2, v1, :cond_b

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-eqz v3, :cond_d

    .line 165
    .line 166
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    move-object v5, v3

    .line 171
    check-cast v5, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    invoke-static {v5, p1, p2, v6, v10}, Li50;->H(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_c

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_d
    move-object v3, v4

    .line 185
    :goto_4
    check-cast v3, Ljava/lang/String;

    .line 186
    .line 187
    if-eqz v3, :cond_e

    .line 188
    .line 189
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance p2, Lsx;

    .line 194
    .line 195
    invoke-direct {p2, p1, v3}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_e
    if-eq p2, v1, :cond_0

    .line 200
    .line 201
    add-int/lit8 p2, p2, 0x1

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :goto_5
    if-eqz p2, :cond_f

    .line 205
    .line 206
    iget-object p1, p2, Lsx;->a:Ljava/lang/Object;

    .line 207
    .line 208
    iget-object p2, p2, Lsx;->b:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p2, Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object p2

    .line 220
    new-instance v0, Lsx;

    .line 221
    .line 222
    invoke-direct {v0, p1, p2}, Lsx;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    :cond_f
    return-object v4
.end method
