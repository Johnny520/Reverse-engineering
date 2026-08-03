.class public final synthetic Lxa/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxa/c;


# direct methods
.method public synthetic constructor <init>(Lxa/c;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxa/b;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lxa/b;->h:Lxa/c;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lxa/b;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lxa/b;->h:Lxa/c;

    .line 7
    .line 8
    iget-object v0, v0, Lxa/c;->e:Lxa/m;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_b

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    sget-object v2, Lxa/n;->a:Lxa/n;

    .line 15
    .line 16
    iget-object v3, v0, Lxa/m;->a:Lr8/g;

    .line 17
    .line 18
    iget-object v4, v0, Lxa/m;->b:Lia/t;

    .line 19
    .line 20
    invoke-virtual {v2, v3, v4}, Lxa/n;->e(Lr8/g;Lia/t;)Lxa/o;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, v2, Lxa/o;->a:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    move v4, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move v4, v1

    .line 40
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    check-cast v6, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    new-instance v7, Lxa/k;

    .line 53
    .line 54
    const/4 v8, 0x3

    .line 55
    invoke-direct {v7, v0, v8}, Lxa/k;-><init>(Lxa/m;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v6, v7}, Lxa/m;->e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    if-ltz v4, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static {}, La/a;->P0()V

    .line 70
    .line 71
    .line 72
    throw v5

    .line 73
    :catchall_0
    move-exception v1

    .line 74
    goto :goto_5

    .line 75
    :cond_3
    :goto_1
    iget-object v2, v2, Lxa/o;->b:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_4

    .line 82
    .line 83
    move v3, v1

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move v3, v1

    .line 90
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ljava/lang/reflect/Method;

    .line 101
    .line 102
    new-instance v7, Lc9/c2;

    .line 103
    .line 104
    const/16 v8, 0xf

    .line 105
    .line 106
    invoke-direct {v7, v0, v8, v6}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v6, v7}, Lxa/m;->e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_5

    .line 114
    .line 115
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    if-ltz v3, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-static {}, La/a;->P0()V

    .line 121
    .line 122
    .line 123
    throw v5

    .line 124
    :cond_7
    :goto_3
    if-gtz v4, :cond_8

    .line 125
    .line 126
    iget-object v2, v0, Lxa/m;->b:Lia/t;

    .line 127
    .line 128
    const-string v6, "\u670b\u53cb\u5708\u5934\u50cf\u83dc\u5355\u521b\u5efa Hook \u672a\u5b89\u88c5"

    .line 129
    .line 130
    invoke-virtual {v2, v6, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_8
    if-gtz v3, :cond_9

    .line 134
    .line 135
    iget-object v2, v0, Lxa/m;->b:Lia/t;

    .line 136
    .line 137
    const-string v6, "\u670b\u53cb\u5708\u5934\u50cf\u83dc\u5355\u70b9\u51fb Hook \u672a\u5b89\u88c5"

    .line 138
    .line 139
    invoke-virtual {v2, v6, v5}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_9
    const/4 v2, 0x1

    .line 143
    if-lez v4, :cond_a

    .line 144
    .line 145
    if-lez v3, :cond_a

    .line 146
    .line 147
    move v3, v2

    .line 148
    goto :goto_4

    .line 149
    :cond_a
    move v3, v1

    .line 150
    :goto_4
    monitor-exit v0

    .line 151
    if-ne v3, v2, :cond_b

    .line 152
    .line 153
    move v1, v2

    .line 154
    goto :goto_6

    .line 155
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    throw v1

    .line 157
    :cond_b
    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_0
    iget-object v0, p0, Lxa/b;->h:Lxa/c;

    .line 163
    .line 164
    iget-object v0, v0, Lxa/c;->e:Lxa/m;

    .line 165
    .line 166
    const/4 v1, 0x0

    .line 167
    if-eqz v0, :cond_e

    .line 168
    .line 169
    monitor-enter v0

    .line 170
    :try_start_2
    sget-object v2, Lxa/a;->a:Lxa/a;

    .line 171
    .line 172
    iget-object v3, v0, Lxa/m;->a:Lr8/g;

    .line 173
    .line 174
    iget-object v4, v0, Lxa/m;->b:Lia/t;

    .line 175
    .line 176
    invoke-virtual {v2, v3, v4}, Lxa/a;->d(Lr8/g;Lfg/p;)Ljava/lang/reflect/Method;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    const/4 v3, 0x1

    .line 181
    if-eqz v2, :cond_c

    .line 182
    .line 183
    new-instance v4, Lxa/k;

    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    invoke-direct {v4, v0, v5}, Lxa/k;-><init>(Lxa/m;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v2, v4}, Lxa/m;->e(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_c

    .line 194
    .line 195
    move v2, v3

    .line 196
    goto :goto_7

    .line 197
    :catchall_1
    move-exception v1

    .line 198
    goto :goto_8

    .line 199
    :cond_c
    move v2, v1

    .line 200
    :goto_7
    if-nez v2, :cond_d

    .line 201
    .line 202
    iget-object v4, v0, Lxa/m;->b:Lia/t;

    .line 203
    .line 204
    const-string v5, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e\u83dc\u5355\u521b\u5efa Hook \u672a\u5b89\u88c5"

    .line 205
    .line 206
    const/4 v6, 0x0

    .line 207
    invoke-virtual {v4, v5, v6}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 208
    .line 209
    .line 210
    :cond_d
    monitor-exit v0

    .line 211
    if-ne v2, v3, :cond_e

    .line 212
    .line 213
    move v1, v3

    .line 214
    goto :goto_9

    .line 215
    :goto_8
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 216
    throw v1

    .line 217
    :cond_e
    :goto_9
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    return-object v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
