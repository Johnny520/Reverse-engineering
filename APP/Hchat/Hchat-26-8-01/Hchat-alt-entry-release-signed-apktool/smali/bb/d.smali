.class public final synthetic Lbb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk8/n;


# instance fields
.field public final synthetic a:Lbb/l;

.field public final synthetic b:Lbb/e;

.field public final synthetic c:Lbb/k;


# direct methods
.method public synthetic constructor <init>(Lbb/l;Lbb/e;Lbb/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbb/d;->a:Lbb/l;

    .line 5
    .line 6
    iput-object p2, p0, Lbb/d;->b:Lbb/e;

    .line 7
    .line 8
    iput-object p3, p0, Lbb/d;->c:Lbb/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lk8/o;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lbb/d;->a:Lbb/l;

    .line 2
    .line 3
    iget-object v1, p0, Lbb/d;->b:Lbb/e;

    .line 4
    .line 5
    iget-object v2, p0, Lbb/d;->c:Lbb/k;

    .line 6
    .line 7
    iget-object v3, v0, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const-string v4, "enable"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_d

    .line 17
    .line 18
    iget-object v3, v0, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    const-string v4, "message_query"

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_0
    invoke-virtual {p1}, Lk8/o;->j()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_d

    .line 36
    .line 37
    invoke-virtual {p1}, Lk8/o;->q()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_1
    iget-object v3, p1, Lk8/o;->c:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lk8/o;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_d

    .line 57
    .line 58
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const/4 v5, 0x0

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4}, Lg8/a;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object v4, v5

    .line 71
    :goto_0
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, ""

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-lez v6, :cond_4

    .line 80
    .line 81
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_4

    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_4
    if-eqz v3, :cond_5

    .line 90
    .line 91
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    :cond_5
    if-nez v5, :cond_6

    .line 100
    .line 101
    const-string v5, ""

    .line 102
    .line 103
    :cond_6
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-nez v3, :cond_7

    .line 112
    .line 113
    const-string v3, ""

    .line 114
    .line 115
    :cond_7
    invoke-static {v5}, Lbb/k;->g(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_c

    .line 120
    .line 121
    sget-object v4, Lbb/l;->c:Log/k;

    .line 122
    .line 123
    invoke-static {v3}, Lfb/v0;->A(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_8

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_8
    invoke-static {v3}, Lbb/k;->h(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_c

    .line 135
    .line 136
    iget-object v4, v2, Lbb/k;->a:Lbb/l;

    .line 137
    .line 138
    invoke-virtual {v4, v3}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-nez v4, :cond_c

    .line 143
    .line 144
    iget-object v4, v2, Lbb/k;->h:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_9

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_9
    iget-object v4, v2, Lbb/k;->e:Ljava/lang/Object;

    .line 154
    .line 155
    monitor-enter v4

    .line 156
    :try_start_0
    iget-object v6, v2, Lbb/k;->f:Ljava/util/ArrayDeque;

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->size()I

    .line 159
    .line 160
    .line 161
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    const/16 v7, 0xc

    .line 163
    .line 164
    if-lt v6, v7, :cond_a

    .line 165
    .line 166
    monitor-exit v4

    .line 167
    goto :goto_1

    .line 168
    :cond_a
    monitor-exit v4

    .line 169
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 170
    .line 171
    .line 172
    move-result-wide v6

    .line 173
    invoke-static {v5, v3}, Lbb/k;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    iget-object v8, v2, Lbb/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 178
    .line 179
    invoke-virtual {v8, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    check-cast v8, Ljava/lang/Long;

    .line 184
    .line 185
    if-eqz v8, :cond_b

    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 188
    .line 189
    .line 190
    move-result-wide v8

    .line 191
    sub-long v8, v6, v8

    .line 192
    .line 193
    const-wide/16 v10, 0xbb8

    .line 194
    .line 195
    cmp-long v8, v8, v10

    .line 196
    .line 197
    if-gez v8, :cond_b

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_b
    iget-object v8, v2, Lbb/k;->m:Ljava/util/concurrent/ConcurrentHashMap;

    .line 201
    .line 202
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v8, v4, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v5, v3}, Lbb/k;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :catchall_0
    move-exception p1

    .line 214
    monitor-exit v4

    .line 215
    throw p1

    .line 216
    :cond_c
    :goto_1
    invoke-virtual {v0, p1}, Lbb/l;->e(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_d

    .line 221
    .line 222
    iget-object v0, v1, Lbb/e;->e:Lbb/g;

    .line 223
    .line 224
    if-eqz v0, :cond_d

    .line 225
    .line 226
    invoke-virtual {v0, p1}, Lbb/g;->a(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_d
    :goto_2
    return-void
.end method
