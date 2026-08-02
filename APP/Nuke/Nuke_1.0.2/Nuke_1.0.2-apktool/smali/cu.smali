.class public final Lcu;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lr43;


# instance fields
.field public final synthetic h:I

.field public final i:Lsz0;


# direct methods
.method public synthetic constructor <init>(Lsz0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcu;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lcu;->i:Lsz0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lir0;Lj63;)Lq43;
    .locals 9

    .line 1
    iget v0, p0, Lcu;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lcu;->i:Lsz0;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p2, Lj63;->b:Ljava/lang/reflect/Type;

    .line 13
    .line 14
    iget-object v5, p2, Lj63;->a:Ljava/lang/Class;

    .line 15
    .line 16
    const-class v6, Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-nez v7, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    const-class v3, Ljava/util/Properties;

    .line 27
    .line 28
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v7, 0x2

    .line 33
    const/4 v8, 0x1

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    new-array v0, v7, [Ljava/lang/reflect/Type;

    .line 37
    .line 38
    const-class v2, Ljava/lang/String;

    .line 39
    .line 40
    aput-object v2, v0, v4

    .line 41
    .line 42
    aput-object v2, v0, v8

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    instance-of v3, v0, Ljava/lang/reflect/WildcardType;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    aget-object v0, v0, v4

    .line 56
    .line 57
    :cond_2
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3}, Lrg3;->s(Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v5, v6}, Ltl;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v6, Ljava/util/HashMap;

    .line 69
    .line 70
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v5, v3, v6}, Ltl;->S(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 78
    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    goto :goto_0

    .line 88
    :cond_3
    new-array v0, v7, [Ljava/lang/reflect/Type;

    .line 89
    .line 90
    aput-object v2, v0, v4

    .line 91
    .line 92
    aput-object v2, v0, v8

    .line 93
    .line 94
    :goto_0
    aget-object v2, v0, v4

    .line 95
    .line 96
    aget-object v0, v0, v8

    .line 97
    .line 98
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 99
    .line 100
    if-eq v2, v3, :cond_5

    .line 101
    .line 102
    const-class v3, Ljava/lang/Boolean;

    .line 103
    .line 104
    if-ne v2, v3, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    new-instance v3, Lj63;

    .line 108
    .line 109
    invoke-direct {v3, v2}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v3}, Lir0;->c(Lj63;)Lq43;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    :goto_1
    sget-object v3, Lv53;->c:Lp53;

    .line 118
    .line 119
    :goto_2
    new-instance v5, Lue1;

    .line 120
    .line 121
    invoke-direct {v5, p1, v3, v2}, Lue1;-><init>(Lir0;Lq43;Ljava/lang/reflect/Type;)V

    .line 122
    .line 123
    .line 124
    new-instance v2, Lj63;

    .line 125
    .line 126
    invoke-direct {v2, v0}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v2}, Lir0;->c(Lj63;)Lq43;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    new-instance v3, Lue1;

    .line 134
    .line 135
    invoke-direct {v3, p1, v2, v0}, Lue1;-><init>(Lir0;Lq43;Ljava/lang/reflect/Type;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p2, v4}, Lsz0;->D(Lj63;Z)Lgs1;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, Lue1;

    .line 143
    .line 144
    invoke-direct {p2, p0, v5, v3, p1}, Lue1;-><init>(Lcu;Lue1;Lue1;Lgs1;)V

    .line 145
    .line 146
    .line 147
    move-object v3, p2

    .line 148
    :goto_3
    return-object v3

    .line 149
    :pswitch_0
    iget-object p0, p2, Lj63;->b:Ljava/lang/reflect/Type;

    .line 150
    .line 151
    iget-object v0, p2, Lj63;->a:Ljava/lang/Class;

    .line 152
    .line 153
    const-class v5, Ljava/util/Collection;

    .line 154
    .line 155
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-nez v6, :cond_6

    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    instance-of v3, p0, Ljava/lang/reflect/WildcardType;

    .line 163
    .line 164
    if-eqz v3, :cond_7

    .line 165
    .line 166
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    aget-object p0, p0, v4

    .line 173
    .line 174
    :cond_7
    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    invoke-static {v3}, Lrg3;->s(Z)V

    .line 179
    .line 180
    .line 181
    invoke-static {p0, v0, v5}, Ltl;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    new-instance v5, Ljava/util/HashMap;

    .line 186
    .line 187
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-static {p0, v0, v3, v5}, Ltl;->S(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 195
    .line 196
    if-eqz v0, :cond_8

    .line 197
    .line 198
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 199
    .line 200
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    aget-object v2, p0, v4

    .line 205
    .line 206
    :cond_8
    new-instance p0, Lj63;

    .line 207
    .line 208
    invoke-direct {p0, v2}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p0}, Lir0;->c(Lj63;)Lq43;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    new-instance v0, Lue1;

    .line 216
    .line 217
    invoke-direct {v0, p1, p0, v2}, Lue1;-><init>(Lir0;Lq43;Ljava/lang/reflect/Type;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, p2, v4}, Lsz0;->D(Lj63;Z)Lgs1;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    new-instance v3, Lbu;

    .line 225
    .line 226
    invoke-direct {v3, v0, p0}, Lbu;-><init>(Lue1;Lgs1;)V

    .line 227
    .line 228
    .line 229
    :goto_4
    return-object v3

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
