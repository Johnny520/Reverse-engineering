.class public final Lc9/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc9/z;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lc9/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast p1, Lwb/s0;

    .line 14
    .line 15
    iget-object p1, p1, Lwb/s0;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p1, v0

    .line 29
    :goto_0
    check-cast p2, Lwb/s0;

    .line 30
    .line 31
    iget-object p2, p2, Lwb/s0;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Integer;

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    move-object v0, p2

    .line 42
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :pswitch_0
    const v0, 0x7fffffff

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast p1, Lqb/g;

    .line 55
    .line 56
    iget-object p1, p1, Lqb/g;->a:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 59
    .line 60
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Integer;

    .line 65
    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object p1, v0

    .line 70
    :goto_1
    check-cast p2, Lqb/g;

    .line 71
    .line 72
    iget-object p2, p2, Lqb/g;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Ljava/lang/Integer;

    .line 79
    .line 80
    if-eqz p2, :cond_3

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    return p1

    .line 88
    :pswitch_1
    const v0, 0x7fffffff

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast p1, Lwb/jv;

    .line 96
    .line 97
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 98
    .line 99
    iget-object v1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 100
    .line 101
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Ljava/lang/Integer;

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    move-object p1, v0

    .line 111
    :goto_2
    check-cast p2, Lwb/jv;

    .line 112
    .line 113
    iget-object p2, p2, Lwb/jv;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Ljava/lang/Integer;

    .line 120
    .line 121
    if-eqz p2, :cond_5

    .line 122
    .line 123
    move-object v0, p2

    .line 124
    :cond_5
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    return p1

    .line 129
    :pswitch_2
    const v0, 0x7fffffff

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast p1, Lwb/jv;

    .line 137
    .line 138
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 141
    .line 142
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz p1, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_6
    move-object p1, v0

    .line 152
    :goto_3
    check-cast p2, Lwb/jv;

    .line 153
    .line 154
    iget-object p2, p2, Lwb/jv;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Ljava/lang/Integer;

    .line 161
    .line 162
    if-eqz p2, :cond_7

    .line 163
    .line 164
    move-object v0, p2

    .line 165
    :cond_7
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    return p1

    .line 170
    :pswitch_3
    const v0, 0x7fffffff

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast p1, Lwb/jv;

    .line 178
    .line 179
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v1, p0, Lc9/z;->h:Ljava/util/Map;

    .line 182
    .line 183
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, Ljava/lang/Integer;

    .line 188
    .line 189
    if-eqz p1, :cond_8

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_8
    move-object p1, v0

    .line 193
    :goto_4
    check-cast p2, Lwb/jv;

    .line 194
    .line 195
    iget-object p2, p2, Lwb/jv;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, Ljava/lang/Integer;

    .line 202
    .line 203
    if-eqz p2, :cond_9

    .line 204
    .line 205
    move-object v0, p2

    .line 206
    :cond_9
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    return p1

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
