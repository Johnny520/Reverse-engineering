.class public final synthetic Lr0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lr0/i;


# direct methods
.method public synthetic constructor <init>(Lr0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/c;->a:Lr0/i;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/util/Map;)V
    .locals 9

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object v1, p0, Lr0/c;->a:Lr0/i;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v3

    .line 26
    :goto_0
    instance-of v4, v0, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v0, v3

    .line 34
    :goto_1
    if-nez v0, :cond_2

    .line 35
    .line 36
    goto/16 :goto_a

    .line 37
    .line 38
    :cond_2
    iget-object p2, p2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 39
    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    invoke-static {v4, p2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object p2, v3

    .line 49
    :goto_2
    instance-of v4, p2, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    check-cast p2, Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    move-object p2, v3

    .line 57
    :goto_3
    if-nez p2, :cond_5

    .line 58
    .line 59
    goto/16 :goto_a

    .line 60
    .line 61
    :cond_5
    const-string v4, "sysmsg"

    .line 62
    .line 63
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_11

    .line 68
    .line 69
    const-string p2, "revokemsg"

    .line 70
    .line 71
    invoke-static {v0, p2, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_6
    const-string v0, ".sysmsg.$type"

    .line 80
    .line 81
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v4, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_7

    .line 90
    .line 91
    goto/16 :goto_a

    .line 92
    .line 93
    :cond_7
    const-string p2, ".sysmsg.revokemsg.session"

    .line 94
    .line 95
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    instance-of v4, p2, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v4, :cond_8

    .line 102
    .line 103
    check-cast p2, Ljava/lang/String;

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_8
    move-object p2, v3

    .line 107
    :goto_4
    if-nez p2, :cond_9

    .line 108
    .line 109
    goto/16 :goto_a

    .line 110
    .line 111
    :cond_9
    const-string v4, ".sysmsg.revokemsg.newmsgid"

    .line 112
    .line 113
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    instance-of v6, v5, Ljava/lang/String;

    .line 118
    .line 119
    if-eqz v6, :cond_a

    .line 120
    .line 121
    check-cast v5, Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_a
    move-object v5, v3

    .line 125
    :goto_5
    if-eqz v5, :cond_b

    .line 126
    .line 127
    invoke-static {v5}, LU0/p;->a0(Ljava/lang/String;)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    if-eqz v5, :cond_b

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    goto :goto_7

    .line 138
    :cond_b
    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    instance-of v5, v4, Ljava/lang/Number;

    .line 143
    .line 144
    if-eqz v5, :cond_c

    .line 145
    .line 146
    check-cast v4, Ljava/lang/Number;

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_c
    move-object v4, v3

    .line 150
    :goto_6
    if-eqz v4, :cond_11

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v4

    .line 156
    :goto_7
    const-string v6, ".sysmsg.revokemsg.replacemsg"

    .line 157
    .line 158
    invoke-interface {p3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    instance-of v7, v6, Ljava/lang/String;

    .line 163
    .line 164
    if-eqz v7, :cond_d

    .line 165
    .line 166
    check-cast v6, Ljava/lang/String;

    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_d
    move-object v6, v3

    .line 170
    :goto_8
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-nez v7, :cond_11

    .line 175
    .line 176
    const-wide/16 v7, 0x0

    .line 177
    .line 178
    cmp-long v7, v4, v7

    .line 179
    .line 180
    if-lez v7, :cond_11

    .line 181
    .line 182
    if-eqz v6, :cond_10

    .line 183
    .line 184
    invoke-static {v6}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_e

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_e
    invoke-static {v6}, Lr0/i;->f(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    if-eqz v7, :cond_f

    .line 196
    .line 197
    goto :goto_a

    .line 198
    :cond_f
    const-string v7, "\""

    .line 199
    .line 200
    invoke-static {v6, v7, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-nez v7, :cond_10

    .line 205
    .line 206
    const-string v7, "\u300c"

    .line 207
    .line 208
    invoke-static {v6, v7, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-nez v7, :cond_10

    .line 213
    .line 214
    const-string v7, "\u300e"

    .line 215
    .line 216
    invoke-static {v6, v7, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_10

    .line 221
    .line 222
    goto :goto_a

    .line 223
    :cond_10
    :goto_9
    invoke-interface {p3, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const-string v7, "xml"

    .line 228
    .line 229
    move-object v2, p1

    .line 230
    move-object v3, p2

    .line 231
    invoke-virtual/range {v1 .. v7}, Lr0/i;->d(Landroid/content/Context;Ljava/lang/String;JLr0/e;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_11
    :goto_a
    return-void
.end method
