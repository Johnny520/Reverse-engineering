.class public final Ltg;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static Α(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Le80;)V
    .locals 5

    .line 1
    const-string v0, "r4d8c1d36f219aeac"

    .line 2
    .line 3
    invoke-static {p0, p1}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const-string p0, "rf1adadb627527086"

    .line 10
    .line 11
    invoke-static {p0, p2, p1}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_0
    const-string p1, "onCreateView"

    .line 16
    .line 17
    const-class v1, Landroid/content/Context;

    .line 18
    .line 19
    const-class v2, Landroid/view/ViewGroup;

    .line 20
    .line 21
    new-instance v3, Lqg;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v3, p3, v4, p2}, Lqg;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    invoke-static {p0, p1, p3}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    new-instance p1, Leo1;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p0, p1

    .line 66
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string p1, "r55744285c1a5b894"

    .line 77
    .line 78
    invoke-static {p1, p2, p0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    return-void
.end method

.method public static Γ(Lz81;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const-string v1, "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE65551CC6F74BBDC4A802DF0A0C73E9975D27BB6DCD3B3DE86AF70F88B9EC0E24D1C402FCC3E011F44CC7A933AD83D0"

    .line 4
    .line 5
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lig;

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    invoke-direct {v2, v3}, Lig;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const-string v3, "bottom video group module"

    .line 16
    .line 17
    invoke-static {v0, v1, v3, v2}, Ltg;->Α(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Le80;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    const-string v1, "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9FAC476C366B9EFD2D3FF83C8E39C4F624AFBA84CA46A1773AD6E91DAB4ED08DF6129FD8ED6B09EC29BA598ACCF76719841F23C647694"

    .line 23
    .line 24
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lig;

    .line 29
    .line 30
    const/4 v3, 0x3

    .line 31
    invoke-direct {v2, v3}, Lig;-><init>(I)V

    .line 32
    .line 33
    .line 34
    const-string v3, "bottom action group module"

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v2}, Ltg;->Α(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Le80;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    invoke-static {p0}, Ltg;->Κ(Ljava/lang/ClassLoader;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static Ζ(Lz81;)V
    .locals 8

    .line 1
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB38ACFA1A4C4DE4BF4639733A5CC5A954D77DF2D1F2F66A8C556D44DCD72183EB"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C6D8DCD83B75146CBF9196B2C921758D9CBA4D1CA59A5F99A4AA8365B129A65D23E9E653551AF9B481B4"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    sget-object v2, Lug;->α:Ltg;

    .line 38
    .line 39
    iget-object v3, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    invoke-static {v3, v1}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    const-string v2, "rb8181a9b5998cac"

    .line 48
    .line 49
    invoke-static {v2, v1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string v6, "\u9876\u680f"

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v4, 0x3

    .line 57
    const-string v5, "top bar"

    .line 58
    .line 59
    invoke-virtual/range {v2 .. v7}, Ltg;->Θ(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method

.method public static Η(Lz81;)V
    .locals 16

    .line 1
    sget-boolean v0, Lug;->Ξ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lqh;->α:Ljava/util/Set;

    .line 8
    .line 9
    move-object/from16 v0, p0

    .line 10
    .line 11
    iget-object v1, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    new-instance v2, Lig;

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-direct {v2, v3}, Lig;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v4, Lqh;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x1

    .line 26
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_1
    sget-object v0, Lqh;->α:Ljava/util/Set;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Iterable;

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    move v8, v5

    .line 43
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const-string v9, "r3712eeb14c86ce94"

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    if-eqz v0, :cond_8

    .line 51
    .line 52
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    move-object v11, v0

    .line 57
    check-cast v11, Ljava/lang/String;

    .line 58
    .line 59
    sget-object v12, Ls62;->α:Ls62;

    .line 60
    .line 61
    :try_start_0
    invoke-static {v1, v11}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    move-exception v0

    .line 67
    new-instance v13, Leo1;

    .line 68
    .line 69
    invoke-direct {v13, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    move-object v0, v13

    .line 73
    :goto_1
    instance-of v13, v0, Leo1;

    .line 74
    .line 75
    if-eqz v13, :cond_2

    .line 76
    .line 77
    move-object v0, v10

    .line 78
    :cond_2
    move-object v13, v0

    .line 79
    check-cast v13, Ljava/lang/Class;

    .line 80
    .line 81
    if-nez v13, :cond_3

    .line 82
    .line 83
    const-string v0, "3903 \u9876\u680f\u7c7b\u672a\u547d\u4e2d: "

    .line 84
    .line 85
    invoke-static {v0, v11}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v9, v0, v10, v3, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :goto_2
    move v14, v5

    .line 93
    goto :goto_5

    .line 94
    :cond_3
    const-class v0, Landroid/view/View;

    .line 95
    .line 96
    invoke-virtual {v0, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_4

    .line 101
    .line 102
    const-string v0, "3903 \u9876\u680f\u7c7b\u4e0d\u662f View\uff0c\u8df3\u8fc7: "

    .line 103
    .line 104
    invoke-static {v0, v11}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v9, v0, v10, v3, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 113
    .line 114
    new-instance v10, Lph;

    .line 115
    .line 116
    invoke-direct {v10, v2, v5}, Lph;-><init>(Lig;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v13, v10}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 120
    .line 121
    .line 122
    move v14, v6

    .line 123
    move-object v10, v12

    .line 124
    goto :goto_3

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    new-instance v10, Leo1;

    .line 127
    .line 128
    invoke-direct {v10, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move v14, v5

    .line 132
    :goto_3
    invoke-static {v10}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const-string v10, ", "

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v15

    .line 144
    const-string v3, "3903 \u9876\u680f\u6784\u9020 Hook \u5931\u8d25: "

    .line 145
    .line 146
    invoke-static {v3, v11, v10, v15}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {v9, v3, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    :try_start_2
    sget-object v0, Lxq0;->α:Lxq0;

    .line 154
    .line 155
    const-string v3, "onAttachedToWindow"

    .line 156
    .line 157
    new-instance v15, Lph;

    .line 158
    .line 159
    invoke-direct {v15, v2, v6}, Lph;-><init>(Lig;I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v13, v3, v15}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 163
    .line 164
    .line 165
    move v14, v6

    .line 166
    goto :goto_4

    .line 167
    :catchall_2
    move-exception v0

    .line 168
    new-instance v12, Leo1;

    .line 169
    .line 170
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    :goto_4
    invoke-static {v12}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    const-string v12, "3903 \u9876\u680f onAttachedToWindow Hook \u5931\u8d25: "

    .line 184
    .line 185
    invoke-static {v12, v11, v10, v3}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v9, v3, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    :goto_5
    if-eqz v14, :cond_7

    .line 193
    .line 194
    add-int/lit8 v8, v8, 0x1

    .line 195
    .line 196
    :cond_7
    const/4 v3, 0x4

    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_8
    if-nez v8, :cond_9

    .line 200
    .line 201
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 202
    .line 203
    .line 204
    const-string v0, "3903 \u9876\u680f\u900f\u660e\u5ea6 Hook \u672a\u547d\u4e2d\u76ee\u6807\u7c7b"

    .line 205
    .line 206
    const/4 v1, 0x4

    .line 207
    invoke-static {v9, v0, v10, v1, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_9
    const/4 v1, 0x4

    .line 212
    const-string v0, "3903 \u9876\u680f\u900f\u660e\u5ea6 Hook \u5df2\u5b89\u88c5 classes="

    .line 213
    .line 214
    invoke-static {v0, v8}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v9, v0, v10, v1, v10}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    :goto_6
    return-void
.end method

.method public static Κ(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lag;->α:Lag;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, p0, v1}, Lag;->δ(Ljava/lang/ClassLoader;Z)Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_7

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Class;

    .line 26
    .line 27
    sget-object v2, Lug;->α:Ltg;

    .line 28
    .line 29
    const-string v2, "bottom misc flux register"

    .line 30
    .line 31
    new-instance v3, Lig;

    .line 32
    .line 33
    invoke-direct {v3, v1}, Lig;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sget-object v4, Lag;->α:Lag;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lag;->ε(Ljava/lang/Class;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x1

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    const-string v7, "BOTTOM_BAR_CONTAINER"

    .line 50
    .line 51
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-nez v7, :cond_1

    .line 56
    .line 57
    const-string v7, "BUTTON_CONTAINER"

    .line 58
    .line 59
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v7, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    array-length v8, v4

    .line 78
    move v9, v1

    .line 79
    :goto_1
    if-ge v9, v8, :cond_3

    .line 80
    .line 81
    aget-object v10, v4, v9

    .line 82
    .line 83
    invoke-static {v10}, Lag;->γ(Ljava/lang/reflect/Method;)Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    if-eqz v11, :cond_2

    .line 88
    .line 89
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {v7}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Ljava/lang/reflect/Method;

    .line 100
    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move-object v4, v5

    .line 108
    :goto_2
    if-nez v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v2, "r91f9eeeb280fa734bottom misc flux register"

    .line 115
    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    new-instance v7, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const/16 v8, 0x23

    .line 137
    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const/16 v8, 0x28

    .line 149
    .line 150
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v9, Lwe;

    .line 161
    .line 162
    const/16 v10, 0x18

    .line 163
    .line 164
    invoke-direct {v9, v10}, Lwe;-><init>(I)V

    .line 165
    .line 166
    .line 167
    const/16 v10, 0x1f

    .line 168
    .line 169
    invoke-static {v8, v5, v5, v9, v10}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    const/16 v8, 0x29

    .line 174
    .line 175
    invoke-static {v7, v5, v8}, Lnx;->λ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    sget-object v7, Lug;->ι:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 180
    .line 181
    invoke-virtual {v7, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-nez v7, :cond_6

    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_6
    :try_start_0
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    sget-object v6, Lxq0;->α:Lxq0;

    .line 193
    .line 194
    new-instance v7, Lqg;

    .line 195
    .line 196
    invoke-direct {v7, v3, v1, v4}, Lqg;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6, v4, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    new-instance v6, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v7, "rb4a46d880497e25b"

    .line 216
    .line 217
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    new-instance v2, Leo1;

    .line 241
    .line 242
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    move-object v0, v2

    .line 246
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    if-eqz v0, :cond_0

    .line 251
    .line 252
    sget-object v2, Lug;->ι:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 253
    .line 254
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v3, "rdd2d21e754a48f7bbottom misc flux register"

    .line 266
    .line 267
    invoke-static {v3, v2, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_7
    return-void
.end method

.method public static Λ(Landroid/view/View;I)V
    .locals 1

    .line 1
    sget v0, Lug;->χ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    sput v0, Lug;->χ:I

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget p0, Lug;->χ:I

    .line 11
    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    sput p0, Lug;->χ:I

    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    sget p1, Lug;->χ:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    sput p1, Lug;->χ:I

    .line 23
    .line 24
    throw p0
.end method

.method public static Μ()Z
    .locals 1

    .line 1
    sget-boolean v0, Lug;->Τ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lug;->ν:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public static Ν(Landroid/view/View;)Z
    .locals 3

    .line 1
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_4

    .line 12
    .line 13
    const-string v0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"

    .line 14
    .line 15
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_4

    .line 24
    .line 25
    const v0, 0x7f0deada

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const v0, 0x7f0dead1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    instance-of v2, v0, Ljava/lang/Integer;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    check-cast v0, Ljava/lang/Integer;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v0, 0x0

    .line 55
    :goto_0
    if-nez v0, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v2, 0x4

    .line 63
    if-ne v0, v2, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    :goto_1
    const v0, 0x7f0deae9

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_4
    :goto_2
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public static Ξ(Landroid/view/View;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    const-class v0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static Ο(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of v2, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/view/View;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    return v0
.end method

.method public static Π(I)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p0, v1, :cond_1

    .line 9
    .line 10
    invoke-static {p0}, Ltg;->Ρ(I)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne p0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    return v0
.end method

.method public static Ρ(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    if-eq p0, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x7

    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public static Σ(Landroid/view/View;I)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-ne p1, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    return v0

    .line 9
    :cond_1
    :goto_0
    sget-wide v1, Lug;->Α:J

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long p1, v1, v3

    .line 14
    .line 15
    if-gtz p1, :cond_2

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_2
    const p1, 0x7f0deade

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    instance-of v4, v3, Ljava/lang/Long;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v4, :cond_3

    .line 29
    .line 30
    check-cast v3, Ljava/lang/Long;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    move-object v3, v5

    .line 34
    :goto_1
    if-nez v3, :cond_4

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    cmp-long v3, v3, v1

    .line 42
    .line 43
    if-nez v3, :cond_5

    .line 44
    .line 45
    return v0

    .line 46
    :cond_5
    :goto_2
    sget-object v3, Lug;->Β:Ljava/lang/Long;

    .line 47
    .line 48
    if-eqz v3, :cond_c

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide v3

    .line 54
    sget-object v6, Lpq;->α:Lpq;

    .line 55
    .line 56
    invoke-static {}, Lpq;->β()Lkq;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    if-nez v6, :cond_6

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_6
    iget-object v7, v6, Lkq;->δ:Lmq;

    .line 64
    .line 65
    iget-wide v7, v7, Lmq;->δ:J

    .line 66
    .line 67
    cmp-long v3, v7, v3

    .line 68
    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_7
    iget-object v3, v6, Lkq;->γ:Landroid/view/View;

    .line 73
    .line 74
    if-nez v3, :cond_a

    .line 75
    .line 76
    iget-object v3, v6, Lkq;->α:Ljava/lang/Object;

    .line 77
    .line 78
    instance-of v4, v3, Landroid/view/View;

    .line 79
    .line 80
    if-eqz v4, :cond_8

    .line 81
    .line 82
    move-object v5, v3

    .line 83
    check-cast v5, Landroid/view/View;

    .line 84
    .line 85
    :cond_8
    if-nez v5, :cond_9

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_9
    move-object v3, v5

    .line 89
    :cond_a
    invoke-static {p0, v3}, Ltg;->Ο(Landroid/view/View;Landroid/view/View;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_b

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_b
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return v0

    .line 104
    :cond_c
    :goto_3
    const/4 p0, 0x0

    .line 105
    return p0
.end method

.method public static Χ(Landroid/view/View;)Z
    .locals 5

    .line 1
    const v0, 0x7f0dead9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return v3

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return v4

    .line 26
    :cond_1
    const v1, 0x7f0deadd

    .line 27
    .line 28
    .line 29
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {p0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return v3
.end method

.method public static Ψ(I)Lbh;
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    sget-object v1, Lbh;->ζ:Lbh;

    .line 3
    .line 4
    if-eq p0, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    if-eq p0, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    if-eq p0, v0, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lbh;->θ:Lbh;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lbh;->η:Lbh;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    return-object v1
.end method

.method public static Ω(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object v0, Lug;->Ω:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 13
    .line 14
    new-instance v1, Lw1;

    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-direct {v1, p0, v2, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static α(Z)V
    .locals 6

    .line 1
    invoke-static {}, Ltg;->у()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/util/Set;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Iterable;

    .line 43
    .line 44
    new-instance v3, Leg;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct {v3, v2, v4}, Leg;-><init>(II)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v3}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroid/view/View;

    .line 74
    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    sget-object v4, Lug;->α:Ltg;

    .line 79
    .line 80
    invoke-static {v3}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-nez v5, :cond_3

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-ne v5, v2, :cond_1

    .line 92
    .line 93
    invoke-virtual {v4, v3, v2, p0}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    return-void
.end method

.method public static β(Landroid/view/View;IFZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v1, p2, v0

    .line 3
    .line 4
    if-lez v1, :cond_0

    .line 5
    .line 6
    invoke-static {p0}, Ltg;->н(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    const/16 v2, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    if-eqz p3, :cond_4

    .line 18
    .line 19
    if-lez v1, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Ltg;->н(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p1}, Ltg;->с(I)Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    if-eqz p3, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Ltg;->Χ(Landroid/view/View;)Z

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    invoke-static {p0}, Ltg;->ε(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    sub-float v1, p3, p2

    .line 42
    .line 43
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const v3, 0x3c23d70a    # 0.01f

    .line 48
    .line 49
    .line 50
    cmpg-float v1, v1, v3

    .line 51
    .line 52
    if-gez v1, :cond_3

    .line 53
    .line 54
    cmpg-float p2, p2, v0

    .line 55
    .line 56
    if-gtz p2, :cond_5

    .line 57
    .line 58
    invoke-static {p1}, Ltg;->с(I)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    const p1, 0x7f0dead9

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_5

    .line 78
    .line 79
    invoke-static {p0, v2}, Ltg;->Λ(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const/4 v0, 0x2

    .line 84
    new-array v0, v0, [F

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    aput p3, v0, v1

    .line 88
    .line 89
    const/4 p3, 0x1

    .line 90
    aput p2, v0, p3

    .line 91
    .line 92
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    const-wide/16 v2, 0xfa

    .line 97
    .line 98
    invoke-virtual {p3, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 99
    .line 100
    .line 101
    new-instance v0, Lfg;

    .line 102
    .line 103
    invoke-direct {v0, p0, v1}, Lfg;-><init>(Landroid/view/View;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lkg;

    .line 110
    .line 111
    invoke-direct {v0, p2, p1, p0}, Lkg;-><init>(FILandroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 115
    .line 116
    .line 117
    const p1, 0x7f0dead2

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1, p3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->start()V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    invoke-static {p0}, Ltg;->ε(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, p2}, Ltg;->р(Landroid/view/View;F)V

    .line 131
    .line 132
    .line 133
    cmpg-float p2, p2, v0

    .line 134
    .line 135
    if-gtz p2, :cond_5

    .line 136
    .line 137
    invoke-static {p1}, Ltg;->с(I)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-static {p0}, Ltg;->Χ(Landroid/view/View;)Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_5

    .line 148
    .line 149
    invoke-static {p0, v2}, Ltg;->Λ(Landroid/view/View;I)V

    .line 150
    .line 151
    .line 152
    :cond_5
    return-void
.end method

.method public static γ(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p0}, Ltg;->Ν(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lug;->κ:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v1, Ljb;

    .line 25
    .line 26
    const/16 v2, 0xf

    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, Ljb;-><init>(Landroid/view/View;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    :try_start_0
    invoke-static {p0}, Ltg;->м(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lug;->α:Ltg;

    .line 39
    .line 40
    invoke-static {p0}, Ltg;->к(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    new-instance v1, Leo1;

    .line 48
    .line 49
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "r6f43e25c86fc96d6"

    .line 72
    .line 73
    invoke-static {v1, p0, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    return-void
.end method

.method public static ε(Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7f0dead2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static ζ(Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Lug;->Φ:Lν;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lug;->κ:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lug;->Φ:Lν;

    .line 12
    .line 13
    sget-object v1, Lug;->λ:Lrf;

    .line 14
    .line 15
    iget-object v2, v1, Lrf;->γ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Llh;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-wide v2, v1, Lrf;->β:J

    .line 23
    .line 24
    const-wide/16 v4, 0x1

    .line 25
    .line 26
    add-long/2addr v2, v4

    .line 27
    iput-wide v2, v1, Lrf;->β:J

    .line 28
    .line 29
    iput-object v0, v1, Lrf;->γ:Ljava/lang/Object;

    .line 30
    .line 31
    const-string v0, "r8eaaa04942e6a77c"

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v0, "rf9ef3362bd85f5b5"

    .line 38
    .line 39
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static η()V
    .locals 2

    .line 1
    sget-object v0, Lug;->Υ:Ls0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lug;->κ:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sput-object v0, Lug;->Υ:Ls0;

    .line 12
    .line 13
    return-void
.end method

.method public static θ()V
    .locals 2

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    sput-wide v0, Lug;->Η:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput-object v0, Lug;->Θ:Ljava/lang/Long;

    .line 7
    .line 8
    invoke-static {}, Ltg;->з()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static ι(ZLjava/lang/String;ZI)V
    .locals 18

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lug;->α:Ltg;

    .line 6
    .line 7
    and-int/lit8 v2, p3, 0x4

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    and-int/lit8 v5, p3, 0x8

    .line 16
    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move/from16 v5, p2

    .line 22
    .line 23
    :goto_1
    sget-boolean v6, Lug;->ψ:Z

    .line 24
    .line 25
    sget-boolean v7, Lug;->ω:Z

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    if-nez v7, :cond_2

    .line 30
    .line 31
    if-eqz v5, :cond_3

    .line 32
    .line 33
    :cond_2
    move v5, v4

    .line 34
    goto :goto_2

    .line 35
    :cond_3
    const/4 v5, 0x0

    .line 36
    :goto_2
    if-eq v6, v0, :cond_4

    .line 37
    .line 38
    move v8, v4

    .line 39
    goto :goto_3

    .line 40
    :cond_4
    const/4 v8, 0x0

    .line 41
    :goto_3
    if-eq v7, v5, :cond_5

    .line 42
    .line 43
    move v9, v4

    .line 44
    goto :goto_4

    .line 45
    :cond_5
    const/4 v9, 0x0

    .line 46
    :goto_4
    sput-boolean v0, Lug;->ψ:Z

    .line 47
    .line 48
    sput-boolean v5, Lug;->ω:Z

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    if-eqz v5, :cond_14

    .line 52
    .line 53
    if-eqz v6, :cond_6

    .line 54
    .line 55
    if-nez v7, :cond_14

    .line 56
    .line 57
    :cond_6
    sget-wide v11, Lug;->Α:J

    .line 58
    .line 59
    const-wide v13, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    cmp-long v7, v11, v13

    .line 65
    .line 66
    const-wide/16 v11, 0x1

    .line 67
    .line 68
    if-nez v7, :cond_7

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_7
    sget-wide v13, Lug;->Α:J

    .line 72
    .line 73
    add-long/2addr v11, v13

    .line 74
    :goto_5
    sput-wide v11, Lug;->Α:J

    .line 75
    .line 76
    sget-object v7, Lpq;->α:Lpq;

    .line 77
    .line 78
    invoke-static {}, Lpq;->β()Lkq;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-eqz v7, :cond_8

    .line 83
    .line 84
    iget-object v13, v7, Lkq;->δ:Lmq;

    .line 85
    .line 86
    iget-wide v13, v13, Lmq;->δ:J

    .line 87
    .line 88
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    goto :goto_6

    .line 93
    :cond_8
    move-object v13, v10

    .line 94
    :goto_6
    sput-object v13, Lug;->Β:Ljava/lang/Long;

    .line 95
    .line 96
    if-eqz v7, :cond_9

    .line 97
    .line 98
    iget-object v13, v7, Lkq;->γ:Landroid/view/View;

    .line 99
    .line 100
    if-nez v13, :cond_c

    .line 101
    .line 102
    :cond_9
    if-eqz v7, :cond_a

    .line 103
    .line 104
    iget-object v7, v7, Lkq;->α:Ljava/lang/Object;

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    move-object v7, v10

    .line 108
    :goto_7
    instance-of v13, v7, Landroid/view/View;

    .line 109
    .line 110
    if-eqz v13, :cond_b

    .line 111
    .line 112
    move-object v13, v7

    .line 113
    check-cast v13, Landroid/view/View;

    .line 114
    .line 115
    goto :goto_8

    .line 116
    :cond_b
    move-object v13, v10

    .line 117
    :cond_c
    :goto_8
    sget-object v7, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    if-eqz v14, :cond_15

    .line 132
    .line 133
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v14

    .line 137
    check-cast v14, Ljava/util/Map$Entry;

    .line 138
    .line 139
    invoke-interface {v14}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    check-cast v15, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v15

    .line 149
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    check-cast v14, Ljava/util/Set;

    .line 154
    .line 155
    sget-object v16, Lug;->α:Ltg;

    .line 156
    .line 157
    if-eq v15, v4, :cond_d

    .line 158
    .line 159
    const/4 v3, 0x2

    .line 160
    if-ne v15, v3, :cond_13

    .line 161
    .line 162
    :cond_d
    check-cast v14, Ljava/lang/Iterable;

    .line 163
    .line 164
    new-instance v3, Lwe;

    .line 165
    .line 166
    const/16 v15, 0x17

    .line 167
    .line 168
    invoke-direct {v3, v15}, Lwe;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-static {v14, v3}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-eqz v14, :cond_13

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    check-cast v14, Ljava/lang/ref/WeakReference;

    .line 189
    .line 190
    invoke-virtual {v14}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    check-cast v14, Landroid/view/View;

    .line 195
    .line 196
    if-nez v14, :cond_e

    .line 197
    .line 198
    goto :goto_e

    .line 199
    :cond_e
    if-eqz v13, :cond_f

    .line 200
    .line 201
    sget-object v15, Lug;->α:Ltg;

    .line 202
    .line 203
    invoke-static {v14, v13}, Ltg;->Ο(Landroid/view/View;Landroid/view/View;)Z

    .line 204
    .line 205
    .line 206
    move-result v15

    .line 207
    goto :goto_c

    .line 208
    :cond_f
    sget-object v15, Lug;->α:Ltg;

    .line 209
    .line 210
    invoke-virtual {v14}, Landroid/view/View;->isAttachedToWindow()Z

    .line 211
    .line 212
    .line 213
    move-result v15

    .line 214
    if-eqz v15, :cond_11

    .line 215
    .line 216
    invoke-virtual {v14}, Landroid/view/View;->isShown()Z

    .line 217
    .line 218
    .line 219
    move-result v15

    .line 220
    if-nez v15, :cond_10

    .line 221
    .line 222
    goto :goto_b

    .line 223
    :cond_10
    new-instance v15, Landroid/graphics/Rect;

    .line 224
    .line 225
    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v14, v15}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 229
    .line 230
    .line 231
    move-result v17

    .line 232
    if-eqz v17, :cond_11

    .line 233
    .line 234
    invoke-virtual {v15}, Landroid/graphics/Rect;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v15

    .line 238
    if-nez v15, :cond_11

    .line 239
    .line 240
    move v15, v4

    .line 241
    goto :goto_c

    .line 242
    :cond_11
    :goto_b
    const/4 v15, 0x0

    .line 243
    :goto_c
    if-eqz v15, :cond_12

    .line 244
    .line 245
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    .line 247
    .line 248
    move-result-object v15

    .line 249
    goto :goto_d

    .line 250
    :cond_12
    move-object v15, v10

    .line 251
    :goto_d
    const v4, 0x7f0deade

    .line 252
    .line 253
    .line 254
    invoke-virtual {v14, v4, v15}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    :goto_e
    const/4 v4, 0x1

    .line 258
    goto :goto_a

    .line 259
    :cond_13
    const/4 v4, 0x1

    .line 260
    goto/16 :goto_9

    .line 261
    .line 262
    :cond_14
    if-nez v5, :cond_15

    .line 263
    .line 264
    sput-object v10, Lug;->Β:Ljava/lang/Long;

    .line 265
    .line 266
    :cond_15
    sget-object v3, Loh;->α:Loh;

    .line 267
    .line 268
    invoke-static {v0}, Loh;->θ(Z)V

    .line 269
    .line 270
    .line 271
    invoke-static {}, Ltg;->Μ()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-nez v3, :cond_16

    .line 276
    .line 277
    return-void

    .line 278
    :cond_16
    sget-boolean v3, Lug;->ν:Z

    .line 279
    .line 280
    sget-boolean v4, Lug;->σ:Z

    .line 281
    .line 282
    sget-boolean v7, Lug;->υ:Z

    .line 283
    .line 284
    new-instance v10, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v11, "rd1afa54545715f71"

    .line 287
    .line 288
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    const-string v4, "rf9ef3362bd85f5b5"

    .line 317
    .line 318
    invoke-static {v4, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    if-nez v8, :cond_17

    .line 322
    .line 323
    if-nez v9, :cond_17

    .line 324
    .line 325
    const-string v0, "playback unchanged: "

    .line 326
    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v0}, Ltg;->щ(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_17
    const-string v3, "playback changed: "

    .line 336
    .line 337
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-static {v1}, Ltg;->щ(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    sget-boolean v1, Lug;->σ:Z

    .line 345
    .line 346
    if-eqz v1, :cond_19

    .line 347
    .line 348
    if-nez v9, :cond_18

    .line 349
    .line 350
    goto :goto_f

    .line 351
    :cond_18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    const-string v3, "applying all states due to paused="

    .line 354
    .line 355
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-static {v2}, Ltg;->α(Z)V

    .line 369
    .line 370
    .line 371
    return-void

    .line 372
    :cond_19
    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v1, "r2802425e750d8502"

    .line 375
    .line 376
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v4, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    return-void
.end method

.method public static κ(Landroid/view/View;I)Ljava/lang/Float;
    .locals 6

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, -0x2

    .line 8
    if-ne p1, v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_4

    .line 11
    .line 12
    :cond_0
    sget-boolean v2, Lug;->Τ:Z

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_1
    invoke-static {p1}, Ltg;->Ψ(I)Lbh;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/high16 v3, 0x42c80000    # 100.0f

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    if-eqz v2, :cond_a

    .line 26
    .line 27
    sget-object v0, Lug;->ρ:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lch;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    sget-boolean v2, Lug;->σ:Z

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    sget-boolean v2, Lug;->ψ:Z

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    sget-boolean v2, Lug;->ω:Z

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-static {p0, p1}, Ltg;->Σ(Landroid/view/View;I)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    move p0, v4

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move p0, v5

    .line 60
    :goto_0
    sget-boolean p1, Lug;->τ:Z

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    sget-boolean p1, Lug;->φ:Z

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    move p1, v4

    .line 69
    goto :goto_1

    .line 70
    :cond_4
    move p1, v5

    .line 71
    :goto_1
    sget-boolean v2, Lug;->ν:Z

    .line 72
    .line 73
    if-nez p0, :cond_6

    .line 74
    .line 75
    if-eqz p1, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    move v4, v5

    .line 79
    :cond_6
    :goto_2
    if-eqz v2, :cond_9

    .line 80
    .line 81
    iget-boolean p0, v0, Lch;->α:Z

    .line 82
    .line 83
    if-nez p0, :cond_7

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_7
    if-eqz v4, :cond_8

    .line 87
    .line 88
    iget-boolean p0, v0, Lch;->γ:Z

    .line 89
    .line 90
    if-eqz p0, :cond_8

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_8
    iget p0, v0, Lch;->β:I

    .line 94
    .line 95
    const/16 p1, 0x64

    .line 96
    .line 97
    invoke-static {p0, v5, p1}, Lj81;->μ(III)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    int-to-float p0, p0

    .line 102
    div-float/2addr p0, v3

    .line 103
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_9
    :goto_3
    const/4 p0, 0x0

    .line 109
    return-object p0

    .line 110
    :cond_a
    const/4 v2, 0x5

    .line 111
    if-ne p1, v2, :cond_b

    .line 112
    .line 113
    sget-boolean p0, Lug;->ν:Z

    .line 114
    .line 115
    if-eqz p0, :cond_e

    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :cond_b
    sget-boolean v2, Lug;->σ:Z

    .line 124
    .line 125
    if-eqz v2, :cond_c

    .line 126
    .line 127
    sget-boolean v2, Lug;->ψ:Z

    .line 128
    .line 129
    if-eqz v2, :cond_c

    .line 130
    .line 131
    sget-boolean v2, Lug;->ω:Z

    .line 132
    .line 133
    if-eqz v2, :cond_c

    .line 134
    .line 135
    invoke-static {p0, p1}, Ltg;->Σ(Landroid/view/View;I)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_c

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_c
    sget-boolean p0, Lug;->φ:Z

    .line 143
    .line 144
    if-eqz p0, :cond_d

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_d
    sget-boolean p0, Lug;->ν:Z

    .line 148
    .line 149
    if-nez p0, :cond_f

    .line 150
    .line 151
    :cond_e
    :goto_4
    return-object v1

    .line 152
    :cond_f
    if-eq p1, v4, :cond_12

    .line 153
    .line 154
    const/4 p0, 0x2

    .line 155
    if-eq p1, p0, :cond_11

    .line 156
    .line 157
    const/4 p0, 0x3

    .line 158
    if-eq p1, p0, :cond_10

    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_10
    sget p0, Lug;->π:I

    .line 162
    .line 163
    :goto_5
    int-to-float p0, p0

    .line 164
    div-float v0, p0, v3

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_11
    sget p0, Lug;->ο:I

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_12
    sget p0, Lug;->ξ:I

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0
.end method

.method public static λ(Landroid/view/View;I)Z
    .locals 6

    .line 1
    invoke-static {p0}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ltg;->Ψ(I)Lbh;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lbh;->ζ:Lbh;

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const-string v0, "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"

    .line 22
    .line 23
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p0, v0}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-static {p0}, Ltg;->τ(Landroid/view/View;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v2, "cfm"

    .line 38
    .line 39
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    sget-object v0, Lcg;->ε:Lcg;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v2, "e68"

    .line 49
    .line 50
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v0, Lcg;->ζ:Lcg;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v0, 0x0

    .line 60
    :goto_0
    if-eqz v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/4 v0, 0x0

    .line 64
    if-lez p1, :cond_6

    .line 65
    .line 66
    instance-of v2, p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-nez v2, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    check-cast p0, Landroid/view/ViewGroup;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    move v3, v0

    .line 78
    :goto_1
    if-ge v3, v2, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    add-int/lit8 v5, p1, -0x1

    .line 88
    .line 89
    invoke-static {v4, v5}, Ltg;->λ(Landroid/view/View;I)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    :goto_2
    return v1

    .line 96
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_3
    return v0
.end method

.method public static μ(I)Ljava/lang/String;
    .locals 2

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const-string v0, "TYPE_UNKNOWN("

    .line 5
    .line 6
    const-string v1, ")"

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    const-string p0, "TYPE_MISC_DANMAKU"

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    const-string p0, "TYPE_MISC_FULLSCREEN"

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_2
    const-string p0, "TYPE_MISC_BOTTOM_ENTRY"

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_3
    const-string p0, "TYPE_DOCUMENT_FORCE_HIDE"

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_4
    const-string p0, "TYPE_MISC_BOTTOM_BAR"

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_5
    const-string p0, "TYPE_TOP_BAR"

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_6
    const-string p0, "TYPE_BOTTOM_INFO"

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_7
    const-string p0, "TYPE_RIGHT_PANEL"

    .line 35
    .line 36
    return-object p0

    .line 37
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

.method public static ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance p1, Leo1;

    .line 8
    .line 9
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :goto_0
    instance-of p1, p0, Leo1;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0
.end method

.method public static σ(Landroid/view/View;)Ll91;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    instance-of v1, p0, Landroid/view/View;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    if-ge v0, v1, :cond_2

    .line 14
    .line 15
    check-cast p0, Landroid/view/View;

    .line 16
    .line 17
    const v1, 0x7f0dead1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    instance-of v3, v1, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    move-object v2, v1

    .line 29
    check-cast v2, Ljava/lang/Integer;

    .line 30
    .line 31
    :cond_0
    const v1, 0x7f0deada

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v1}, Ltg;->Π(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    new-instance v0, Ll91;

    .line 59
    .line 60
    invoke-direct {v0, p0, v2}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    return-object v2
.end method

.method public static τ(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    new-instance v0, Leo1;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p0, v0

    .line 30
    :goto_0
    instance-of v0, p0, Leo1;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v2, p0

    .line 36
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    return-object v2
.end method

.method public static а(Landroid/view/View;)Ljava/lang/Integer;
    .locals 4

    .line 1
    const v0, 0x7f0dead1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ljava/lang/Integer;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ltg;->Π(I)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    const/4 v3, 0x5

    .line 31
    if-ne v1, v3, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const v1, 0x7f0deada

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    :goto_1
    return-object v0

    .line 50
    :cond_3
    :goto_2
    return-object v2
.end method

.method public static б(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Ltg;->μ(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    const-string v3, "] type="

    .line 26
    .line 27
    const-string v4, " source="

    .line 28
    .line 29
    const-string v5, "\u6e05\u723d\u8c03\u8bd5\u5165\u53e3 ["

    .line 30
    .line 31
    invoke-static {v5, p3, v3, p1, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p3, " class="

    .line 36
    .line 37
    const-string v3, " attached="

    .line 38
    .line 39
    invoke-static {p1, p2, p3, v0, v3}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p2, " size="

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p2, "x"

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "rf9ef3362bd85f5b5"

    .line 66
    .line 67
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static synthetic г(Ltg;Landroid/view/View;ILjava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    and-int/lit8 v0, p5, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v4, p4

    .line 7
    and-int/lit8 p4, p5, 0x10

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    :goto_0
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move v2, p2

    .line 15
    move-object v3, p3

    .line 16
    move v5, p4

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 p4, 0x1

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    invoke-virtual/range {v0 .. v5}, Ltg;->в(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static д()V
    .locals 5

    .line 1
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Set;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_6

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Landroid/view/View;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    sget-object v3, Lug;->α:Ltg;

    .line 74
    .line 75
    invoke-static {v2}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-ne v4, v1, :cond_3

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-virtual {v3, v2, v1, v4}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    :goto_2
    return-void
.end method

.method public static е()V
    .locals 9

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lug;->η:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/app/Activity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto/16 :goto_e

    .line 29
    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :try_start_0
    sget-boolean v0, Lug;->Ρ:Z

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    sget-object v0, Lug;->η:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/app/Activity;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-static {v0}, Lx9;->ο(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    sput-boolean v2, Lug;->Ρ:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    invoke-static {}, Lx9;->π()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->β()Z

    .line 63
    .line 64
    .line 65
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v2, "rf7136ca2f759796a"

    .line 74
    .line 75
    invoke-static {v2, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    move v2, v1

    .line 79
    :goto_2
    sput-boolean v2, Lug;->Τ:Z

    .line 80
    .line 81
    sget-boolean v0, Lug;->Τ:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    const-string v0, "clean_mode_enabled"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    goto :goto_3

    .line 92
    :cond_4
    move v0, v1

    .line 93
    :goto_3
    sget-boolean v2, Lug;->Τ:Z

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    const-string v2, "clean_auto_hide"

    .line 98
    .line 99
    invoke-static {v2, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move v2, v1

    .line 105
    :goto_4
    sput-boolean v0, Lug;->ν:Z

    .line 106
    .line 107
    sput-boolean v2, Lug;->σ:Z

    .line 108
    .line 109
    sget-boolean v3, Lug;->ν:Z

    .line 110
    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    sget-boolean v3, Lug;->σ:Z

    .line 114
    .line 115
    if-nez v3, :cond_7

    .line 116
    .line 117
    :cond_6
    invoke-static {}, Ltg;->θ()V

    .line 118
    .line 119
    .line 120
    sput-boolean v1, Lug;->ω:Z

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    sput-object v3, Lug;->Β:Ljava/lang/Long;

    .line 124
    .line 125
    :cond_7
    sget-boolean v3, Lug;->Τ:Z

    .line 126
    .line 127
    if-eqz v3, :cond_8

    .line 128
    .line 129
    const-string v3, "clean_touch_restore_controls"

    .line 130
    .line 131
    invoke-static {v3, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    goto :goto_5

    .line 136
    :cond_8
    move v3, v1

    .line 137
    :goto_5
    sput-boolean v3, Lug;->τ:Z

    .line 138
    .line 139
    sget-boolean v3, Lug;->Τ:Z

    .line 140
    .line 141
    if-eqz v3, :cond_9

    .line 142
    .line 143
    const-string v3, "clean_pause_show_bottom_bar"

    .line 144
    .line 145
    invoke-static {v3, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    goto :goto_6

    .line 150
    :cond_9
    move v3, v1

    .line 151
    :goto_6
    sput-boolean v3, Lug;->υ:Z

    .line 152
    .line 153
    const-string v3, "clean_right_panel_alpha"

    .line 154
    .line 155
    const/16 v4, 0x28

    .line 156
    .line 157
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 162
    .line 163
    .line 164
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 165
    goto :goto_7

    .line 166
    :catchall_1
    move v3, v4

    .line 167
    :goto_7
    const/16 v5, 0x64

    .line 168
    .line 169
    invoke-static {v3, v1, v5}, Lj81;->μ(III)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    sput v3, Lug;->ξ:I

    .line 174
    .line 175
    const-string v3, "clean_bottom_info_alpha"

    .line 176
    .line 177
    :try_start_2
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-interface {v6, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 182
    .line 183
    .line 184
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 185
    goto :goto_8

    .line 186
    :catchall_2
    move v3, v4

    .line 187
    :goto_8
    invoke-static {v3, v1, v5}, Lj81;->μ(III)I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    sput v3, Lug;->ο:I

    .line 192
    .line 193
    const-string v3, "clean_top_bar_alpha"

    .line 194
    .line 195
    :try_start_3
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    invoke-interface {v6, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 200
    .line 201
    .line 202
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 203
    :catchall_3
    invoke-static {v4, v1, v5}, Lj81;->μ(III)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    sput v1, Lug;->π:I

    .line 208
    .line 209
    sget-object v1, Lbh;->κ:Lrz;

    .line 210
    .line 211
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 212
    .line 213
    const/16 v4, 0xa

    .line 214
    .line 215
    invoke-static {v1, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-static {v4}, Lex0;->Κ(I)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    const/16 v5, 0x10

    .line 224
    .line 225
    if-ge v4, v5, :cond_a

    .line 226
    .line 227
    move v4, v5

    .line 228
    :cond_a
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 229
    .line 230
    .line 231
    new-instance v4, Lτ;

    .line 232
    .line 233
    invoke-direct {v4, v1}, Lτ;-><init>(Lχ;)V

    .line 234
    .line 235
    .line 236
    :goto_9
    invoke-virtual {v4}, Lτ;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_b

    .line 241
    .line 242
    invoke-virtual {v4}, Lτ;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object v5, v1

    .line 247
    check-cast v5, Lbh;

    .line 248
    .line 249
    invoke-static {v5}, Ls1;->π(Lbh;)Lch;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_b
    sput-object v3, Lug;->ρ:Ljava/util/LinkedHashMap;

    .line 258
    .line 259
    sget-boolean v1, Lug;->Τ:Z

    .line 260
    .line 261
    sget-boolean v3, Lug;->τ:Z

    .line 262
    .line 263
    sget-boolean v4, Lug;->υ:Z

    .line 264
    .line 265
    sget-object v5, Lug;->ρ:Ljava/util/LinkedHashMap;

    .line 266
    .line 267
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 268
    .line 269
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    invoke-static {v7}, Lex0;->Κ(I)I

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    invoke-direct {v6, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    check-cast v5, Ljava/lang/Iterable;

    .line 285
    .line 286
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v5

    .line 290
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v7

    .line 294
    if-eqz v7, :cond_c

    .line 295
    .line 296
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    check-cast v7, Ljava/util/Map$Entry;

    .line 301
    .line 302
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    check-cast v7, Lch;

    .line 311
    .line 312
    iget-boolean v7, v7, Lch;->α:Z

    .line 313
    .line 314
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    goto :goto_a

    .line 322
    :cond_c
    new-instance v5, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const-string v7, "rf7b64370f033a806"

    .line 325
    .line 326
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-static {}, Ltg;->Μ()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_d

    .line 359
    .line 360
    sget-object v0, Leh;->α:Leh;

    .line 361
    .line 362
    invoke-static {}, Leh;->α()Ljava/util/ArrayList;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_d

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    move-object v3, v1

    .line 381
    check-cast v3, Landroid/view/View;

    .line 382
    .line 383
    sget-object v2, Lug;->α:Ltg;

    .line 384
    .line 385
    const-string v5, "captured music cover sync"

    .line 386
    .line 387
    const/4 v6, 0x0

    .line 388
    const/16 v7, 0x8

    .line 389
    .line 390
    const/4 v4, 0x1

    .line 391
    invoke-static/range {v2 .. v7}, Ltg;->г(Ltg;Landroid/view/View;ILjava/lang/String;Ljava/lang/String;I)V

    .line 392
    .line 393
    .line 394
    goto :goto_b

    .line 395
    :cond_d
    sget-object v0, Leh;->α:Leh;

    .line 396
    .line 397
    invoke-static {}, Leh;->δ()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    if-nez v0, :cond_e

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :cond_e
    sget-object v1, Leh;->ε:Ljava/util/Map;

    .line 405
    .line 406
    monitor-enter v1

    .line 407
    :try_start_4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 408
    .line 409
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    :cond_f
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_10

    .line 425
    .line 426
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v3, Ljava/util/Map$Entry;

    .line 431
    .line 432
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    check-cast v4, Ljava/lang/Boolean;

    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    if-nez v4, :cond_f

    .line 443
    .line 444
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v0, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    goto :goto_c

    .line 456
    :catchall_4
    move-exception v0

    .line 457
    goto :goto_f

    .line 458
    :cond_10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    check-cast v0, Ljava/lang/Iterable;

    .line 463
    .line 464
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 468
    monitor-exit v1

    .line 469
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_11

    .line 478
    .line 479
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    sget-object v2, Leh;->α:Leh;

    .line 484
    .line 485
    const-string v2, "clean state sync"

    .line 486
    .line 487
    invoke-static {v1, v2}, Leh;->ζ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto :goto_d

    .line 491
    :cond_11
    :goto_e
    return-void

    .line 492
    :goto_f
    monitor-exit v1

    .line 493
    throw v0
.end method

.method public static ж(Ltg;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, 0x7f0deadb

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static з()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    sput-wide v0, Lug;->Γ:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    sput v0, Lug;->Δ:F

    .line 7
    .line 8
    sput v0, Lug;->Ε:F

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    sput-boolean v0, Lug;->Ζ:Z

    .line 12
    .line 13
    return-void
.end method

.method public static и(ILandroid/view/View;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_1

    .line 3
    .line 4
    const-string v1, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"

    .line 5
    .line 6
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {p1, v1}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p1, "music cover"

    .line 17
    .line 18
    invoke-static {p2, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const-string p1, "listen cover"

    .line 25
    .line 26
    invoke-static {p2, p1, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    :cond_0
    const-string p0, "\u5531\u7247"

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    if-ne p0, v0, :cond_2

    .line 36
    .line 37
    const-string p0, "\u53f3\u4fa7\u63a7\u4ef6\u533a"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const/4 p1, 0x3

    .line 41
    if-ne p0, p1, :cond_3

    .line 42
    .line 43
    const-string p0, "\u9876\u680f"

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const/4 p1, 0x2

    .line 47
    if-ne p0, p1, :cond_4

    .line 48
    .line 49
    const-string p0, "\u6587\u6848\u533a"

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_4
    const/4 p1, 0x4

    .line 53
    if-ne p0, p1, :cond_5

    .line 54
    .line 55
    const-string p0, "\u5e95\u680f\u6742\u9879"

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_5
    const/4 p1, 0x6

    .line 59
    if-ne p0, p1, :cond_6

    .line 60
    .line 61
    const-string p0, "\u5e95\u680f\u6742\u9879\u5165\u53e3"

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_6
    const/4 p1, 0x7

    .line 65
    if-ne p0, p1, :cond_7

    .line 66
    .line 67
    const-string p0, "\u5168\u5c4f\u89c2\u770b"

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_7
    const/16 p1, 0x8

    .line 71
    .line 72
    if-ne p0, p1, :cond_8

    .line 73
    .line 74
    const-string p0, "Feed \u5f39\u5e55\u6309\u94ae"

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_8
    const/4 p1, 0x5

    .line 78
    if-ne p0, p1, :cond_9

    .line 79
    .line 80
    const-string p0, "\u6587\u6863\u5f02\u5e38\u63a7\u4ef6"

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_9
    const-string p0, "\u672a\u77e5\u533a\u57df"

    .line 84
    .line 85
    return-object p0
.end method

.method public static й()V
    .locals 9

    .line 1
    invoke-static {}, Ltg;->у()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_8

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/util/Set;

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Iterable;

    .line 43
    .line 44
    new-instance v3, Leg;

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-direct {v3, v2, v4}, Leg;-><init>(II)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v3}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroid/view/View;

    .line 74
    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    const v4, 0x7f0dead2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    instance-of v6, v5, Landroid/animation/ValueAnimator;

    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    check-cast v5, Landroid/animation/ValueAnimator;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    move-object v5, v7

    .line 93
    :goto_1
    if-eqz v5, :cond_3

    .line 94
    .line 95
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 96
    .line 97
    .line 98
    :cond_3
    invoke-virtual {v3, v4, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    sget-object v4, Lug;->α:Ltg;

    .line 102
    .line 103
    invoke-static {v3}, Ltg;->н(Landroid/view/View;)V

    .line 104
    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    if-ne v2, v4, :cond_5

    .line 108
    .line 109
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 110
    .line 111
    if-nez v4, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move-object v4, v3

    .line 115
    check-cast v4, Landroid/view/ViewGroup;

    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    const/4 v6, 0x0

    .line 122
    :goto_2
    if-ge v6, v5, :cond_5

    .line 123
    .line 124
    invoke-virtual {v4, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v8}, Ltg;->ф(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v6, v6, 0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    :goto_3
    const v4, 0x7f0deadb

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    instance-of v6, v5, Ljava/lang/Float;

    .line 145
    .line 146
    if-eqz v6, :cond_6

    .line 147
    .line 148
    check-cast v5, Ljava/lang/Float;

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    move-object v5, v7

    .line 152
    :goto_4
    const/high16 v6, 0x3f800000    # 1.0f

    .line 153
    .line 154
    if-eqz v5, :cond_7

    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    goto :goto_5

    .line 161
    :cond_7
    move v5, v6

    .line 162
    :goto_5
    invoke-virtual {v3, v4, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    const/4 v4, 0x0

    .line 166
    invoke-static {v5, v4, v6}, Lj81;->λ(FFF)F

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-static {v3, v4}, Ltg;->р(Landroid/view/View;F)V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_8
    return-void
.end method

.method public static к(Landroid/view/View;)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0deae7

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    instance-of v3, v2, Ljava/lang/Integer;

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    check-cast v2, Ljava/lang/Integer;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    move-object v2, v4

    .line 23
    :goto_0
    const v3, 0x7f0deae8

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    instance-of v6, v5, Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    check-cast v5, Ljava/lang/Integer;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v5, v4

    .line 38
    :goto_1
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-ne v0, v5, :cond_2

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eq v0, v5, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sub-int/2addr v2, v0

    .line 59
    invoke-virtual {p0, v2}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :goto_2
    new-instance v1, Leo1;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    move-object v0, v1

    .line 77
    :goto_3
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v1, "rdc76cfdafb4a32b8"

    .line 96
    .line 97
    invoke-static {v1, p0, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    return-void
.end method

.method public static л(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p0}, Ltg;->ε(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Ltg;->н(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"

    .line 8
    .line 9
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, v0}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object v0, p0

    .line 25
    check-cast v0, Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x0

    .line 32
    :goto_0
    if-ge v2, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Ltg;->ф(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    invoke-static {p0}, Ltg;->х(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    const v0, 0x7f0deadb

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    instance-of v2, v1, Ljava/lang/Float;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    check-cast v1, Ljava/lang/Float;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    move-object v1, v3

    .line 66
    :goto_2
    if-eqz v1, :cond_3

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    const/high16 v2, 0x3f800000    # 1.0f

    .line 77
    .line 78
    invoke-static {v1, v0, v2}, Lj81;->λ(FFF)F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    invoke-static {p0, v0}, Ltg;->р(Landroid/view/View;F)V

    .line 83
    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method public static м(Landroid/view/View;)V
    .locals 6

    .line 1
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Ltg;->Ξ(Landroid/view/View;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v1, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/Set;

    .line 32
    .line 33
    const v2, 0x7f0deae9

    .line 34
    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    check-cast v1, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Landroid/view/View;

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/4 v3, 0x0

    .line 78
    :goto_1
    if-eqz v3, :cond_1

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    sget-object v1, Leh;->α:Leh;

    .line 85
    .line 86
    invoke-static {}, Leh;->α()Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Landroid/view/View;

    .line 105
    .line 106
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 107
    .line 108
    invoke-virtual {v3, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v4, Lug;->α:Ltg;

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Ltg;->ν(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Landroid/view/View;

    .line 135
    .line 136
    if-eq v1, p0, :cond_5

    .line 137
    .line 138
    sget-object v2, Lug;->α:Ltg;

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    const/4 v3, 0x0

    .line 145
    :goto_4
    instance-of v4, v2, Landroid/view/View;

    .line 146
    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    const/16 v4, 0x18

    .line 150
    .line 151
    if-ge v3, v4, :cond_5

    .line 152
    .line 153
    if-ne v2, p0, :cond_6

    .line 154
    .line 155
    sget-object v2, Lug;->α:Ltg;

    .line 156
    .line 157
    invoke-static {v1}, Ltg;->к(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    check-cast v2, Landroid/view/View;

    .line 162
    .line 163
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    :goto_5
    return-void
.end method

.method public static н(Landroid/view/View;)V
    .locals 5

    .line 1
    const v0, 0x7f0dead9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const v1, 0x7f0deadd

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    instance-of v3, v2, Ljava/lang/Integer;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    check-cast v2, Ljava/lang/Integer;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v2, v4

    .line 33
    :goto_0
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v2, 0x0

    .line 41
    :goto_1
    invoke-virtual {p0, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v2}, Ltg;->Λ(Landroid/view/View;I)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static р(Landroid/view/View;F)V
    .locals 1

    .line 1
    sget v0, Lug;->χ:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    sput v0, Lug;->χ:I

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget p0, Lug;->χ:I

    .line 11
    .line 12
    add-int/lit8 p0, p0, -0x1

    .line 13
    .line 14
    sput p0, Lug;->χ:I

    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    sget p1, Lug;->χ:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    sput p1, Lug;->χ:I

    .line 23
    .line 24
    throw p0
.end method

.method public static с(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-eq p0, v0, :cond_1

    .line 3
    .line 4
    invoke-static {p0}, Ltg;->Ρ(I)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 14
    return p0
.end method

.method public static т(Landroid/view/View;I)Z
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_4

    .line 6
    .line 7
    :cond_0
    const/4 p1, 0x7

    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    filled-new-array {p1, v0}, [I

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move v0, v1

    .line 15
    :goto_0
    const/4 v2, 0x2

    .line 16
    if-ge v0, v2, :cond_8

    .line 17
    .line 18
    aget v2, p1, v0

    .line 19
    .line 20
    sget-object v3, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/util/Set;

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    check-cast v2, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    instance-of v3, v2, Ljava/util/Collection;

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    move-object v3, v2

    .line 71
    check-cast v3, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_7

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    check-cast v3, Landroid/view/View;

    .line 101
    .line 102
    if-nez v3, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    if-eq v3, p0, :cond_5

    .line 112
    .line 113
    sget-object v4, Lug;->α:Ltg;

    .line 114
    .line 115
    invoke-static {v3, p0}, Ltg;->Ο(Landroid/view/View;Landroid/view/View;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_5

    .line 120
    .line 121
    const/4 p0, 0x1

    .line 122
    return p0

    .line 123
    :cond_7
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_8
    :goto_4
    return v1
.end method

.method public static у()V
    .locals 5

    .line 1
    sget-object v0, Lcp0;->α:Ljava/util/Set;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lcp0;->δ:Ljava/util/Set;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v2, Lθ;

    .line 13
    .line 14
    const/16 v3, 0x16

    .line 15
    .line 16
    invoke-direct {v2, v3, v0}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lxh;->Ц(Ljava/lang/Iterable;La80;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v2, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v4, v3

    .line 47
    check-cast v4, Landroid/view/View;

    .line 48
    .line 49
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Landroid/view/View;

    .line 82
    .line 83
    sget-object v2, Lug;->α:Ltg;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-virtual {v2, v1, v3}, Ltg;->Φ(Landroid/view/View;Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    return-void
.end method

.method public static ф(Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7f0deadc

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Ljava/lang/Float;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Float;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sub-float/2addr v0, v1

    .line 31
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v2, 0x3c23d70a    # 0.01f

    .line 36
    .line 37
    .line 38
    cmpl-float v0, v0, v2

    .line 39
    .line 40
    if-lez v0, :cond_1

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    const/high16 v2, 0x3f800000    # 1.0f

    .line 44
    .line 45
    invoke-static {v1, v0, v2}, Lj81;->λ(FFF)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {p0, v0}, Ltg;->р(Landroid/view/View;F)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public static х(Landroid/view/View;)V
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    check-cast p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const v3, 0x7f0deada

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {v2}, Ltg;->ф(Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Ltg;->х(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_2
    return-void
.end method

.method public static ч(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ltg;->Π(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/Set;

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    move-object v0, p1

    .line 24
    check-cast v0, Ljava/lang/Iterable;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_4

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/view/View;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    if-ne v1, p0, :cond_2

    .line 54
    .line 55
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static ш(Landroid/view/View;I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ltg;->Π(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    sget-object v0, Lug;->Ψ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/Set;

    .line 19
    .line 20
    if-eqz p1, :cond_3

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroid/view/View;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    if-ne v0, p0, :cond_1

    .line 52
    .line 53
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    :goto_1
    return-void
.end method

.method public static щ(Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-static {}, Ltg;->Μ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-boolean v0, Lug;->σ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-boolean v0, Lug;->υ:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-boolean v0, Lug;->ψ:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-boolean v0, Lug;->ω:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    sget-boolean v1, Lug;->ψ:Z

    .line 27
    .line 28
    sget-boolean v2, Lug;->ω:Z

    .line 29
    .line 30
    sget-boolean v3, Lug;->σ:Z

    .line 31
    .line 32
    sget-boolean v4, Lug;->υ:Z

    .line 33
    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v6, "re92b1ad19855843a"

    .line 37
    .line 38
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string v1, "rf9ef3362bd85f5b5"

    .line 64
    .line 65
    invoke-static {v1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    sget-object p0, Lsb;->α:Lsb;

    .line 69
    .line 70
    invoke-static {v0}, Lsb;->в(Z)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    new-instance v0, Leo1;

    .line 78
    .line 79
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object p0, v0

    .line 83
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string v0, "r45145d7acf794178"

    .line 94
    .line 95
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    return-void
.end method


# virtual methods
.method public final Β(Lz81;)V
    .locals 5

    .line 1
    const-string v0, "r73fa9ffd19a3a15b"

    .line 2
    .line 3
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    sget-object v1, Lug;->θ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v1, "~796896D9FD9A99E3FF60F870F520A872CAB9C9E837D81AFF017266A3E9979F463DE356D00EC2BD454B6297D77AC58FCC046CA8A6B257A19D285C5090E83692"

    .line 11
    .line 12
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1, v1}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string p0, "r58be7ef7c971f2c9"

    .line 23
    .line 24
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_0
    sget-object v2, Lxq0;->α:Lxq0;

    .line 29
    .line 30
    new-instance v3, Lpg;

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    invoke-direct {v3, p0, v4}, Lpg;-><init>(Ltg;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v1, v3}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    sput-object p1, Lug;->θ:Ljava/lang/ClassLoader;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    new-instance p1, Leo1;

    .line 57
    .line 58
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object p0, p1

    .line 62
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string p1, "r53cbe97f99eca8a4"

    .line 73
    .line 74
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_1
    return-void
.end method

.method public final Δ(Lz81;)V
    .locals 4

    .line 1
    sget-object v0, Lkh;->α:Lkh;

    .line 2
    .line 3
    const-string v0, "clean_mode_playback"

    .line 4
    .line 5
    sget-boolean v1, Lkh;->δ:Z

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sput-boolean v2, Lkh;->δ:Z

    .line 12
    .line 13
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v1, Lgh;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v1, v3}, Lgh;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lgh;

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    invoke-direct {v1, v3}, Lgh;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "re6db9aaa4394f758"

    .line 34
    .line 35
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    :try_start_0
    sget-object v0, Lx00;->α:Lx00;

    .line 39
    .line 40
    iget-object v1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lx00;->δ(Ljava/lang/ClassLoader;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    new-instance v1, Leo1;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object v0, v1

    .line 55
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v1, "rd584aa97335f952f"

    .line 66
    .line 67
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    sget-boolean v0, Lug;->Κ:Z

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    monitor-enter p0

    .line 76
    :try_start_1
    sget-boolean v0, Lug;->Κ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    monitor-exit p0

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :try_start_2
    sget-object v0, Lpq;->α:Lpq;

    .line 83
    .line 84
    sget-object v0, Lug;->Χ:Lwe;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v1, Lpq;->κ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    sput-boolean v2, Lug;->Κ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 95
    .line 96
    monitor-exit p0

    .line 97
    :goto_2
    sget-boolean p0, Lug;->Ι:Z

    .line 98
    .line 99
    if-eqz p0, :cond_4

    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    sput-boolean v2, Lug;->Ι:Z

    .line 103
    .line 104
    sget-object p0, Lkh;->α:Lkh;

    .line 105
    .line 106
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lkh;->ε(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :catchall_1
    move-exception p1

    .line 113
    monitor-exit p0

    .line 114
    throw p1
.end method

.method public final Ε(Lz81;)V
    .locals 9

    .line 1
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string p0, "r1928b29b38ea3aa6"

    .line 16
    .line 17
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v5, "\u53f3\u4fa7\u63a7\u4ef6\u533a"

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    const-string v4, "right panel"

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    invoke-virtual/range {v1 .. v6}, Ltg;->Θ(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    filled-new-array {p0, p1, p1, p1, p1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 p0, 0x1

    .line 46
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const-string v8, "\u53f3\u4fa7\u63a7\u4ef6\u533a"

    .line 51
    .line 52
    const-string v3, "onLayout"

    .line 53
    .line 54
    const-string v5, "right panel layout"

    .line 55
    .line 56
    invoke-virtual/range {v1 .. v8}, Ltg;->χ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final Θ(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 10

    .line 1
    :try_start_0
    sget-object v0, Lxq0;->α:Lxq0;

    .line 2
    .line 3
    new-instance v2, Lrg;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    move-object v3, p0

    .line 7
    move v4, p2

    .line 8
    move-object v5, p3

    .line 9
    move-object v6, p4

    .line 10
    move v7, p5

    .line 11
    invoke-direct/range {v2 .. v8}, Lrg;-><init>(Ltg;ILjava/lang/String;Ljava/lang/String;ZI)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1, v2}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    new-instance v2, Leo1;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object v0, v2

    .line 26
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v2, "r1ec63fc92b91b33d"

    .line 37
    .line 38
    invoke-static {v2, p3, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 42
    .line 43
    const-string v9, "onAttachedToWindow"

    .line 44
    .line 45
    new-instance v2, Lrg;

    .line 46
    .line 47
    const/4 v8, 0x1

    .line 48
    move-object v3, p0

    .line 49
    move v4, p2

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    move v7, p5

    .line 53
    invoke-direct/range {v2 .. v8}, Lrg;-><init>(Ltg;ILjava/lang/String;Ljava/lang/String;ZI)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1, v9, v2}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    goto :goto_1

    .line 61
    :catchall_1
    move-exception v0

    .line 62
    new-instance v1, Leo1;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v1, "rb9064f75649eda9"

    .line 79
    .line 80
    invoke-static {v1, p3, v0}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public final Ι(Lz81;ZZ)V
    .locals 12

    .line 1
    const-string v0, "rc06208ca4f0fef1f"

    .line 2
    .line 3
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sput-boolean p2, Lug;->Ξ:Z

    .line 7
    .line 8
    sput-boolean p3, Lug;->Ο:Z

    .line 9
    .line 10
    sput-object p1, Lug;->Π:Lz81;

    .line 11
    .line 12
    const-string p2, "clean_mode_bottom_misc_resolver"

    .line 13
    .line 14
    sget-object p3, Lag;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p3, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p3, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    new-instance p3, Lwe;

    .line 28
    .line 29
    const/16 v0, 0x12

    .line 30
    .line 31
    invoke-direct {p3, v0}, Lwe;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p3}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 35
    .line 36
    .line 37
    new-instance p3, Lwe;

    .line 38
    .line 39
    const/16 v0, 0x13

    .line 40
    .line 41
    invoke-direct {p3, v0}, Lwe;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2, p3}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const-string p2, "android.app.Activity"

    .line 48
    .line 49
    :try_start_0
    sget-object p3, Lqe0;->α:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object p3, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 52
    .line 53
    const-string v0, "onResume"

    .line 54
    .line 55
    new-instance v3, Lh;

    .line 56
    .line 57
    const/4 v4, 0x5

    .line 58
    invoke-direct {v3, v4}, Lh;-><init>(I)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {p2, p3, v0, v3}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 66
    .line 67
    .line 68
    iget-object p3, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 69
    .line 70
    const-string v0, "onPause"

    .line 71
    .line 72
    new-instance v3, Lh;

    .line 73
    .line 74
    const/4 v4, 0x6

    .line 75
    invoke-direct {v3, v4}, Lh;-><init>(I)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-static {p2, p3, v0, v3}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p2, v0

    .line 88
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    const-string p3, "ra1a282e126eadf5b"

    .line 93
    .line 94
    invoke-static {p3, p2}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    sget-object p2, Leh;->α:Leh;

    .line 98
    .line 99
    iget-object p3, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 100
    .line 101
    new-instance v0, Lig;

    .line 102
    .line 103
    invoke-direct {v0, v2}, Lig;-><init>(I)V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lw0;

    .line 107
    .line 108
    const-class v6, Ltg;

    .line 109
    .line 110
    const-string v7, "shouldSuppressGlMusicCover"

    .line 111
    .line 112
    const-string v8, "shouldSuppressGlMusicCover()Z"

    .line 113
    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x1

    .line 116
    const/4 v4, 0x0

    .line 117
    move-object v5, p0

    .line 118
    invoke-direct/range {v3 .. v10}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 119
    .line 120
    .line 121
    monitor-enter p2

    .line 122
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sput-object v3, Leh;->θ:Lw0;

    .line 126
    .line 127
    sget-object p0, Leh;->β:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_1

    .line 138
    .line 139
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    check-cast v3, Ldh;

    .line 144
    .line 145
    sget-object v4, Leh;->α:Leh;

    .line 146
    .line 147
    invoke-virtual {v4, p3, v3, v0}, Leh;->γ(Ljava/lang/ClassLoader;Ldh;Lig;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    move-object p0, v0

    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_1
    invoke-static {p3}, Leh;->β(Ljava/lang/ClassLoader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 156
    .line 157
    .line 158
    monitor-exit p2

    .line 159
    iget-object p0, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 160
    .line 161
    sget-object p2, Lug;->ε:Ljava/lang/ClassLoader;

    .line 162
    .line 163
    if-ne p2, p0, :cond_2

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_2
    monitor-enter v5

    .line 167
    :try_start_2
    sget-object p2, Lug;->ε:Ljava/lang/ClassLoader;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 168
    .line 169
    if-ne p2, p0, :cond_3

    .line 170
    .line 171
    monitor-exit v5

    .line 172
    goto :goto_4

    .line 173
    :cond_3
    :try_start_3
    sget-object v6, Lug;->α:Ltg;

    .line 174
    .line 175
    invoke-virtual {v6, p1}, Ltg;->Ε(Lz81;)V

    .line 176
    .line 177
    .line 178
    const-string p2, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"

    .line 179
    .line 180
    invoke-static {p2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    iget-object p3, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 185
    .line 186
    invoke-static {p3, p2}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    if-nez v7, :cond_4

    .line 191
    .line 192
    const-string p2, "r509ac0e31486e47c"

    .line 193
    .line 194
    invoke-static {p2}, Lux;->ρ(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_4
    const-string v9, "music cover container"

    .line 199
    .line 200
    const-string v10, "\u5531\u7247"

    .line 201
    .line 202
    const/4 v11, 0x1

    .line 203
    const/4 v8, 0x1

    .line 204
    invoke-virtual/range {v6 .. v11}, Ltg;->Θ(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 205
    .line 206
    .line 207
    :goto_3
    invoke-virtual {v6, p1}, Ltg;->φ(Lz81;)V

    .line 208
    .line 209
    .line 210
    invoke-static {p1}, Ltg;->Ζ(Lz81;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p1}, Ltg;->Η(Lz81;)V

    .line 214
    .line 215
    .line 216
    invoke-static {p1}, Ltg;->Γ(Lz81;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v6, p1}, Ltg;->Β(Lz81;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6, p1}, Ltg;->ψ(Lz81;)V

    .line 223
    .line 224
    .line 225
    sput-object p0, Lug;->ε:Ljava/lang/ClassLoader;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 226
    .line 227
    monitor-exit v5

    .line 228
    :goto_4
    const-class p0, Landroid/view/View;

    .line 229
    .line 230
    sget-boolean p1, Lug;->δ:Z

    .line 231
    .line 232
    if-eqz p1, :cond_5

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_5
    sput-boolean v2, Lug;->δ:Z

    .line 236
    .line 237
    :try_start_4
    sget-object p1, Lqe0;->α:Ljava/lang/Object;

    .line 238
    .line 239
    const-string p1, "setAlpha"

    .line 240
    .line 241
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 242
    .line 243
    new-instance p3, Lh;

    .line 244
    .line 245
    const/16 v0, 0x9

    .line 246
    .line 247
    invoke-direct {p3, v0, v5}, Lh;-><init>(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-static {p0, p1, p2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 255
    .line 256
    .line 257
    const-string p1, "setVisibility"

    .line 258
    .line 259
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 260
    .line 261
    new-instance p3, Lh;

    .line 262
    .line 263
    const/16 v0, 0xa

    .line 264
    .line 265
    invoke-direct {p3, v0, v5}, Lh;-><init>(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    filled-new-array {p2, p3}, [Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p0, p1, p2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 273
    .line 274
    .line 275
    const-string p0, "re4cefdf117d5eb0f"

    .line 276
    .line 277
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    sget-object p0, Ls62;->α:Ls62;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :catchall_2
    move-exception v0

    .line 284
    move-object p0, v0

    .line 285
    new-instance p1, Leo1;

    .line 286
    .line 287
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    move-object p0, p1

    .line 291
    :goto_5
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    if-eqz p0, :cond_6

    .line 296
    .line 297
    sget-object p1, Lug;->α:Ltg;

    .line 298
    .line 299
    sput-boolean v1, Lug;->δ:Z

    .line 300
    .line 301
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    const-string p1, "ra93b4920430201a3"

    .line 306
    .line 307
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_6
    :goto_6
    sget-boolean p0, Lug;->Σ:Z

    .line 311
    .line 312
    if-nez p0, :cond_7

    .line 313
    .line 314
    sput-boolean v2, Lug;->Σ:Z

    .line 315
    .line 316
    new-instance p0, Lwe;

    .line 317
    .line 318
    const/16 p1, 0x19

    .line 319
    .line 320
    invoke-direct {p0, p1}, Lwe;-><init>(I)V

    .line 321
    .line 322
    .line 323
    sget-object p1, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 324
    .line 325
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    new-instance p0, Lwe;

    .line 329
    .line 330
    const/16 p1, 0x1a

    .line 331
    .line 332
    invoke-direct {p0, p1}, Lwe;-><init>(I)V

    .line 333
    .line 334
    .line 335
    sget-object p1, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 336
    .line 337
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    :cond_7
    invoke-static {}, Lui1;->Α()Z

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    if-eqz p0, :cond_a

    .line 345
    .line 346
    const-string p0, "clean_mode_enabled"

    .line 347
    .line 348
    invoke-static {p0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    if-nez p0, :cond_8

    .line 353
    .line 354
    const-string p0, "clean_auto_hide"

    .line 355
    .line 356
    invoke-static {p0, v1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-nez p0, :cond_8

    .line 361
    .line 362
    invoke-static {}, Lui1;->τ()Z

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    if-eqz p0, :cond_a

    .line 367
    .line 368
    :cond_8
    invoke-static {}, Ltg;->е()V

    .line 369
    .line 370
    .line 371
    invoke-static {}, Ltg;->Μ()Z

    .line 372
    .line 373
    .line 374
    move-result p0

    .line 375
    if-eqz p0, :cond_9

    .line 376
    .line 377
    invoke-virtual {v5}, Ltg;->ο()Z

    .line 378
    .line 379
    .line 380
    :cond_9
    invoke-virtual {v5}, Ltg;->π()V

    .line 381
    .line 382
    .line 383
    :cond_a
    return-void

    .line 384
    :catchall_3
    move-exception v0

    .line 385
    move-object p0, v0

    .line 386
    monitor-exit v5

    .line 387
    throw p0

    .line 388
    :goto_7
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 389
    throw p0
.end method

.method public final Τ(Landroid/view/View;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v0, Ldg;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1, p1, p2}, Ldg;-><init>(ILandroid/view/View;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const v0, 0x7f0dead1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    instance-of v2, v1, Ljava/lang/Integer;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v1, v3

    .line 43
    :goto_0
    const/4 v2, 0x2

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eq v4, v2, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {p1, v4}, Ltg;->ш(Landroid/view/View;I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    const/4 v4, 0x0

    .line 60
    if-nez v1, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eq v1, v2, :cond_4

    .line 68
    .line 69
    :goto_1
    const/4 v1, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move v1, v4

    .line 72
    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {p1, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v0, 0x7f0deada

    .line 80
    .line 81
    .line 82
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    invoke-static {p1, v2}, Ltg;->ч(Landroid/view/View;I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1}, Ltg;->γ(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    const v0, 0x7f0deae3

    .line 97
    .line 98
    .line 99
    const-string v5, "\u6587\u6848\u533a"

    .line 100
    .line 101
    invoke-virtual {p1, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    const v0, 0x7f0deae4

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v2, p2, v5}, Ltg;->б(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-static {}, Ltg;->Μ()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0, p1, v2, v4}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_6

    .line 129
    .line 130
    new-instance p0, Ljb;

    .line 131
    .line 132
    const/16 p2, 0xc

    .line 133
    .line 134
    invoke-direct {p0, p1, p2}, Ljb;-><init>(Landroid/view/View;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    :cond_6
    return-void
.end method

.method public final Υ(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v0, Ljb;

    .line 18
    .line 19
    const/16 v1, 0xb

    .line 20
    .line 21
    invoke-direct {v0, p1, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const v0, 0x7f0dead1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, Ljava/lang/Integer;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v1, 0x0

    .line 43
    :goto_0
    const/4 v2, 0x5

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eq v3, v2, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-static {p1, v1}, Ltg;->ш(Landroid/view/View;I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1, v2}, Ltg;->ч(Landroid/view/View;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    sget-boolean v0, Lug;->ν:Z

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0, p1, v2, v0}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public final Φ(Landroid/view/View;Z)V
    .locals 6

    .line 1
    const v0, 0x7f0dead1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Ljava/lang/Integer;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Integer;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    invoke-static {p1}, Ltg;->σ(Landroid/view/View;)Ll91;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    iget-object v2, v2, Ll91;->ε:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, v2

    .line 26
    check-cast v3, Landroid/view/View;

    .line 27
    .line 28
    :cond_1
    const v2, 0x7f0deada

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x7

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eq v5, v4, :cond_4

    .line 40
    .line 41
    :goto_1
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sget-object v5, Lug;->α:Ltg;

    .line 48
    .line 49
    invoke-static {p1, v1}, Ltg;->ш(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v4}, Ltg;->ч(Landroid/view/View;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p1, v4}, Ltg;->ч(Landroid/view/View;I)V

    .line 72
    .line 73
    .line 74
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p1, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v1, 0x7f0deae3

    .line 80
    .line 81
    .line 82
    const-string v2, "\u5168\u5c4f\u89c2\u770b"

    .line 83
    .line 84
    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    const v1, 0x7f0deaed

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v2, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Llg;

    .line 108
    .line 109
    const/4 v1, 0x3

    .line 110
    invoke-direct {v0, v1}, Llg;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 114
    .line 115
    .line 116
    :goto_3
    if-eqz p2, :cond_7

    .line 117
    .line 118
    invoke-static {}, Ltg;->Μ()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_7

    .line 123
    .line 124
    const/4 p2, 0x0

    .line 125
    invoke-virtual {p0, p1, v4, p2}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 126
    .line 127
    .line 128
    if-eqz v3, :cond_7

    .line 129
    .line 130
    sget-object p0, Lug;->α:Ltg;

    .line 131
    .line 132
    invoke-static {v3}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-nez p1, :cond_6

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    const/4 v0, 0x4

    .line 144
    if-ne p1, v0, :cond_7

    .line 145
    .line 146
    invoke-virtual {p0, v3, v0, p2}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_4
    return-void
.end method

.method public final δ(Landroid/view/View;IZ)V
    .locals 12

    .line 1
    const/4 v0, -0x2

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_9

    .line 5
    .line 6
    :cond_0
    invoke-static {p2}, Ltg;->Π(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-static {p0, p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-static {p1, p2}, Ltg;->т(Landroid/view/View;I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Ltg;->л(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    const/4 p0, 0x3

    .line 26
    const/4 v0, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-ne p2, p0, :cond_7

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/16 v2, 0x8

    .line 35
    .line 36
    if-ne p0, v2, :cond_3

    .line 37
    .line 38
    const p0, 0x7f0dead9

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-static {p0, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_3
    instance-of p0, p1, Landroid/widget/TextView;

    .line 56
    .line 57
    if-eqz p0, :cond_7

    .line 58
    .line 59
    move-object p0, p1

    .line 60
    move v3, v1

    .line 61
    :goto_0
    if-eqz p0, :cond_7

    .line 62
    .line 63
    const/16 v4, 0xf

    .line 64
    .line 65
    if-ge v3, v4, :cond_7

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v5, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB38ACFA1A4C4DE4BF4639733A5CC5A954D77DF2D1F2F66A8C556D44DCD72183EB"

    .line 76
    .line 77
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_6

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const-string v5, "~789B0C8A27824271C64AC17B4A4EFA968DD58C04A0DDDC0007C6D8DCD83B75146CBF9196B2C921758D9CBA4D1CA59A5F99A4AA8365B129A65D23E9E653551AF9B481B4"

    .line 96
    .line 97
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-nez v4, :cond_6

    .line 106
    .line 107
    sget-boolean v4, Lug;->Ξ:Z

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    sget-object v4, Lqh;->α:Ljava/util/Set;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    sget-object v5, Lqh;->α:Ljava/util/Set;

    .line 122
    .line 123
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    instance-of v4, p0, Landroid/view/View;

    .line 135
    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    check-cast p0, Landroid/view/View;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    move-object p0, v0

    .line 142
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_6
    :goto_2
    move-object p0, p1

    .line 146
    check-cast p0, Landroid/widget/TextView;

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-eqz p0, :cond_7

    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-eqz p0, :cond_7

    .line 159
    .line 160
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-eqz p0, :cond_7

    .line 169
    .line 170
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 171
    .line 172
    invoke-virtual {p0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-lez v3, :cond_7

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-gt p0, v2, :cond_7

    .line 190
    .line 191
    goto/16 :goto_9

    .line 192
    .line 193
    :cond_7
    const/4 p0, 0x7

    .line 194
    if-ne p2, p0, :cond_a

    .line 195
    .line 196
    sget-object v2, Lcp0;->α:Ljava/util/Set;

    .line 197
    .line 198
    if-nez p1, :cond_8

    .line 199
    .line 200
    move v2, v1

    .line 201
    goto :goto_3

    .line 202
    :cond_8
    const v2, 0x7f0deae1

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    :goto_3
    if-eqz v2, :cond_a

    .line 216
    .line 217
    invoke-static {p1, p0}, Ltg;->κ(Landroid/view/View;I)Ljava/lang/Float;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    if-nez p2, :cond_9

    .line 222
    .line 223
    invoke-static {p1}, Ltg;->л(Landroid/view/View;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    invoke-static {p1, p0, p2, p3}, Ltg;->β(Landroid/view/View;IFZ)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_a
    invoke-static {p1, p2}, Ltg;->κ(Landroid/view/View;I)Ljava/lang/Float;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    if-nez p0, :cond_b

    .line 240
    .line 241
    invoke-static {p1}, Ltg;->л(Landroid/view/View;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    invoke-static {p2}, Ltg;->Π(I)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    const/high16 v4, 0x3f800000    # 1.0f

    .line 254
    .line 255
    const/4 v5, 0x0

    .line 256
    const/4 v6, 0x1

    .line 257
    if-nez v3, :cond_c

    .line 258
    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :cond_c
    invoke-static {v2, v5, v4}, Lj81;->λ(FFF)F

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    const/high16 v3, 0x42c80000    # 100.0f

    .line 266
    .line 267
    mul-float/2addr v2, v3

    .line 268
    float-to-int v2, v2

    .line 269
    if-nez v2, :cond_d

    .line 270
    .line 271
    invoke-static {p2}, Ltg;->с(I)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_d

    .line 276
    .line 277
    move v3, v6

    .line 278
    goto :goto_4

    .line 279
    :cond_d
    move v3, v1

    .line 280
    :goto_4
    shl-int/lit8 v7, p2, 0xa

    .line 281
    .line 282
    shl-int/lit8 v8, v2, 0x1

    .line 283
    .line 284
    or-int/2addr v7, v8

    .line 285
    or-int/2addr v7, v3

    .line 286
    const v8, 0x7f0deae4

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v9

    .line 301
    if-eqz v9, :cond_e

    .line 302
    .line 303
    goto :goto_6

    .line 304
    :cond_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v7

    .line 308
    invoke-virtual {p1, v8, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    const v7, 0x7f0deae3

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    instance-of v8, v7, Ljava/lang/String;

    .line 319
    .line 320
    if-eqz v8, :cond_f

    .line 321
    .line 322
    move-object v0, v7

    .line 323
    check-cast v0, Ljava/lang/String;

    .line 324
    .line 325
    :cond_f
    if-nez v0, :cond_10

    .line 326
    .line 327
    const-string v0, "state fallback"

    .line 328
    .line 329
    invoke-static {p2, p1, v0}, Ltg;->и(ILandroid/view/View;Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    :cond_10
    invoke-static {p2}, Ltg;->μ(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    if-eqz v3, :cond_11

    .line 338
    .line 339
    const-string v3, "GONE"

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_11
    const-string v3, "alpha"

    .line 343
    .line 344
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    const-string v9, "] type="

    .line 353
    .line 354
    const-string v10, " target="

    .line 355
    .line 356
    const-string v11, "\u6e05\u723d\u8c03\u8bd5\u72b6\u6001 ["

    .line 357
    .line 358
    invoke-static {v11, v0, v9, v7, v10}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    const-string v7, "% hide="

    .line 363
    .line 364
    const-string v9, " animate="

    .line 365
    .line 366
    invoke-static {v0, v2, v7, v3, v9}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    const-string v2, " class="

    .line 373
    .line 374
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const-string v2, "rf9ef3362bd85f5b5"

    .line 385
    .line 386
    invoke-static {v2, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    :goto_6
    const/4 v0, 0x2

    .line 390
    if-ne p2, v0, :cond_18

    .line 391
    .line 392
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 393
    .line 394
    .line 395
    move-result p0

    .line 396
    invoke-static {p1}, Ltg;->ε(Landroid/view/View;)V

    .line 397
    .line 398
    .line 399
    invoke-static {p1}, Ltg;->н(Landroid/view/View;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 403
    .line 404
    .line 405
    move-result p2

    .line 406
    sub-float/2addr p2, v4

    .line 407
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 408
    .line 409
    .line 410
    move-result p2

    .line 411
    const p3, 0x3c23d70a    # 0.01f

    .line 412
    .line 413
    .line 414
    cmpl-float p2, p2, p3

    .line 415
    .line 416
    if-lez p2, :cond_12

    .line 417
    .line 418
    invoke-static {p1, v4}, Ltg;->р(Landroid/view/View;F)V

    .line 419
    .line 420
    .line 421
    :cond_12
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 422
    .line 423
    if-nez p2, :cond_13

    .line 424
    .line 425
    goto :goto_9

    .line 426
    :cond_13
    check-cast p1, Landroid/view/ViewGroup;

    .line 427
    .line 428
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 429
    .line 430
    .line 431
    move-result p2

    .line 432
    :goto_7
    if-ge v1, p2, :cond_17

    .line 433
    .line 434
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    const/16 v2, 0xc

    .line 442
    .line 443
    invoke-static {v0, v2}, Ltg;->λ(Landroid/view/View;I)Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-eqz v2, :cond_14

    .line 448
    .line 449
    invoke-static {v0}, Ltg;->ф(Landroid/view/View;)V

    .line 450
    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_14
    const v2, 0x7f0deadc

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    if-nez v3, :cond_15

    .line 461
    .line 462
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    :cond_15
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    sub-float/2addr v2, p0

    .line 478
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    cmpl-float v2, v2, p3

    .line 483
    .line 484
    if-lez v2, :cond_16

    .line 485
    .line 486
    invoke-static {p0, v5, v4}, Lj81;->λ(FFF)F

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    invoke-static {v0, v2}, Ltg;->р(Landroid/view/View;F)V

    .line 491
    .line 492
    .line 493
    :cond_16
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 494
    .line 495
    goto :goto_7

    .line 496
    :cond_17
    :goto_9
    return-void

    .line 497
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 498
    .line 499
    .line 500
    move-result p0

    .line 501
    if-eqz p3, :cond_19

    .line 502
    .line 503
    const/4 p3, 0x5

    .line 504
    if-eq p2, p3, :cond_19

    .line 505
    .line 506
    move v1, v6

    .line 507
    :cond_19
    invoke-static {p1, p2, p0, v1}, Ltg;->β(Landroid/view/View;IFZ)V

    .line 508
    .line 509
    .line 510
    return-void
.end method

.method public final ν(Landroid/view/View;)V
    .locals 5

    .line 1
    const v0, 0x7f0deaeb

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v0, Ljb;

    .line 34
    .line 35
    const/16 v1, 0xd

    .line 36
    .line 37
    invoke-direct {v0, p1, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    new-instance v1, Llg;

    .line 56
    .line 57
    const/4 v3, 0x1

    .line 58
    invoke-direct {v1, v3}, Llg;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lmg;

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-direct {v3, v4}, Lmg;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ltg;->о(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    :goto_0
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_1
    new-instance v2, Leo1;

    .line 92
    .line 93
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p0, v2

    .line 97
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string p1, "rccdb3dc3d2848481"

    .line 118
    .line 119
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_3
    return-void
.end method

.method public final ξ(Landroid/view/View;)V
    .locals 5

    .line 1
    const v0, 0x7f0deaec

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v0, Ljb;

    .line 34
    .line 35
    const/16 v1, 0xe

    .line 36
    .line 37
    invoke-direct {v0, p1, v1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    new-instance v1, Llg;

    .line 56
    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-direct {v1, v3}, Llg;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Lmg;

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    invoke-direct {v3, v4}, Lmg;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ltg;->о(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    :goto_0
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_1
    new-instance v2, Leo1;

    .line 92
    .line 93
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object p0, v2

    .line 97
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-eqz p0, :cond_4

    .line 102
    .line 103
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 107
    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string p1, "r81b4e64bc05b3429"

    .line 118
    .line 119
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_3
    return-void
.end method

.method public final ο()Z
    .locals 11

    .line 1
    sget-boolean v0, Lug;->Λ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget-object v0, Lug;->Π:Lz81;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_1
    monitor-enter p0

    .line 14
    :try_start_0
    sget-boolean v2, Lug;->Λ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return v1

    .line 20
    :cond_2
    :try_start_1
    sget-object v2, Lcp0;->α:Ljava/util/Set;

    .line 21
    .line 22
    new-instance v3, Lng;

    .line 23
    .line 24
    sget-object v5, Lug;->α:Ltg;

    .line 25
    .line 26
    const-class v6, Ltg;

    .line 27
    .line 28
    const-string v7, "onLandscapeEntranceMiscControlRecorded"

    .line 29
    .line 30
    const-string v8, "onLandscapeEntranceMiscControlRecorded(Landroid/view/View;)V"

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    invoke-direct/range {v3 .. v10}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v3}, Lcp0;->γ(Lz81;Lng;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ltg;->ω(Lz81;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v0}, Ltg;->Δ(Lz81;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Ltg;->π()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ltg;->ц()V

    .line 51
    .line 52
    .line 53
    sput-boolean v1, Lug;->Λ:Z

    .line 54
    .line 55
    const-string v0, "r2c2f7248a5741c55"

    .line 56
    .line 57
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return v1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    monitor-exit p0

    .line 64
    throw v0
.end method

.method public final π()V
    .locals 3

    .line 1
    sget-object v0, Lug;->Π:Lz81;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    invoke-static {}, Lui1;->Α()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_4

    .line 11
    .line 12
    invoke-static {}, Lui1;->τ()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_1
    sget-boolean v1, Lug;->Μ:Z

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    :try_start_0
    sget-boolean v1, Lug;->Μ:Z

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-static {}, Lui1;->τ()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    sget-object v1, Loh;->α:Loh;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Loh;->δ(Lz81;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Lug;->α:Ltg;

    .line 41
    .line 42
    sput-boolean v2, Lug;->Μ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    monitor-exit p0

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    monitor-exit p0

    .line 50
    throw v0

    .line 51
    :cond_3
    :goto_2
    const-string v1, "clean_progress_bar_restore_alpha_on_pause"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ltg;->Δ(Lz81;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_3
    return-void
.end method

.method public final υ(Landroid/view/View;Ljava/lang/String;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_7

    .line 4
    .line 5
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object p0, Lug;->κ:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v0, Ldg;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Ldg;-><init>(Landroid/view/View;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    if-eqz p2, :cond_3

    .line 32
    .line 33
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    sget-object v1, Lug;->γ:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_0
    move p2, v0

    .line 48
    :goto_1
    if-nez p2, :cond_a

    .line 49
    .line 50
    sget-boolean p2, Lug;->Ξ:Z

    .line 51
    .line 52
    sget-boolean v1, Lug;->Ο:Z

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, -0x1

    .line 59
    const/4 v4, 0x1

    .line 60
    if-ne v2, v3, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    if-eqz v1, :cond_5

    .line 64
    .line 65
    const p2, 0x7f0ad382

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    if-eqz p2, :cond_6

    .line 70
    .line 71
    const p2, 0x7f0ad3a8

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    const p2, 0x7f0ad29d

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-ne v1, p2, :cond_7

    .line 83
    .line 84
    :goto_3
    move v0, v4

    .line 85
    goto :goto_6

    .line 86
    :cond_7
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    :goto_5
    if-eqz p2, :cond_9

    .line 91
    .line 92
    const-class v1, Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_9

    .line 99
    .line 100
    sget-object v1, Lug;->γ:Ljava/util/Set;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_8

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    goto :goto_5

    .line 118
    :cond_9
    :goto_6
    if-nez v0, :cond_a

    .line 119
    .line 120
    :goto_7
    return-void

    .line 121
    :cond_a
    invoke-virtual {p0, p1}, Ltg;->Υ(Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final φ(Lz81;)V
    .locals 9

    .line 1
    sget-boolean v0, Lug;->ζ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v0, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B176FF618D47B48161BBD6802803BCEF2506F2675D8864E9F"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object p1, Lxq0;->α:Lxq0;

    .line 21
    .line 22
    new-instance v0, Lh;

    .line 23
    .line 24
    const/4 v1, 0x7

    .line 25
    invoke-direct {v0, v1}, Lh;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2, v0}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    const-string v0, "onAttachedToWindow"

    .line 32
    .line 33
    new-instance v1, Lh;

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    invoke-direct {v1, v3}, Lh;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v2, v0, v1}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    const-string v3, "onMeasure"

    .line 44
    .line 45
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    filled-new-array {p1, p1}, [Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v5, "bottom info measure"

    .line 55
    .line 56
    const/4 p1, 0x2

    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const-string v8, "\u6587\u6848\u533a"

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    move-object v1, p0

    .line 65
    invoke-virtual/range {v1 .. v8}, Ltg;->χ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    sput-boolean p0, Lug;->ζ:Z

    .line 70
    .line 71
    const-string p0, "re18843b7ac92ec96"

    .line 72
    .line 73
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object p0, v0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const-string p1, "r2c9d446a8038a7a8"

    .line 84
    .line 85
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final χ(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v1, "rcf8060bfb76400f5"

    .line 2
    .line 3
    :try_start_0
    array-length v0, p3

    .line 4
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, [Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    move-object p3, v0

    .line 21
    new-instance v0, Leo1;

    .line 22
    .line 23
    invoke-direct {v0, p3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p3, v0

    .line 27
    :goto_0
    invoke-static {p3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    check-cast p3, Ljava/lang/reflect/Method;

    .line 34
    .line 35
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 36
    .line 37
    new-instance v2, Log;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 38
    .line 39
    move-object v4, p0

    .line 40
    move-object v5, p4

    .line 41
    move v7, p5

    .line 42
    move-object v3, p6

    .line 43
    move-object v6, p7

    .line 44
    :try_start_2
    invoke-direct/range {v2 .. v7}, Log;-><init>(Ljava/lang/Integer;Ltg;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p3, v2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance p3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    :goto_1
    move-object p0, v0

    .line 80
    goto :goto_2

    .line 81
    :catchall_2
    move-exception v0

    .line 82
    move-object v5, p4

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    new-instance p3, Leo1;

    .line 85
    .line 86
    invoke-direct {p3, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object p0, p3

    .line 90
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_0

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance p3, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string p4, "r79b26c01a8572a1d"

    .line 107
    .line 108
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_0
    return-void

    .line 131
    :cond_1
    move-object v5, p4

    .line 132
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance p3, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string p4, "r530a1652494ba007"

    .line 143
    .line 144
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final ψ(Lz81;)V
    .locals 7

    .line 1
    const-string v0, "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE65551CC6F74BA8D0AF0CD54F0C34F2915C25F94C821335EC65C03695BEEA011BD4C913EAC2E01FEC59C6A72EB79AC1"

    .line 2
    .line 3
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    invoke-static {p1, v0}, Ltg;->ρ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    const-string p0, "r50b5152a486079c1"

    .line 16
    .line 17
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-class p1, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string p1, "rd58f16edd7a21c6c"

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string v5, "Feed \u5f39\u5e55\u6309\u94ae"

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    const/16 v3, 0x8

    .line 47
    .line 48
    const-string v4, "danmaku visibility frame"

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    invoke-virtual/range {v1 .. v6}, Ltg;->Θ(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final ω(Lz81;)V
    .locals 7

    .line 1
    const-class v0, Landroid/util/AttributeSet;

    .line 2
    .line 3
    const-string v1, "createView"

    .line 4
    .line 5
    const-class v2, Landroid/view/LayoutInflater;

    .line 6
    .line 7
    const-class v3, Ljava/lang/String;

    .line 8
    .line 9
    sget-boolean v4, Lug;->β:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    const/4 v4, 0x1

    .line 16
    sput-boolean v4, Lug;->β:Z

    .line 17
    .line 18
    :try_start_0
    new-instance v5, Lpg;

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-direct {v5, p0, v6}, Lpg;-><init>(Ltg;I)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v3, v3, v0, v5}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-static {v2, v1, v5}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 29
    .line 30
    .line 31
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v5

    .line 34
    new-instance v6, Leo1;

    .line 35
    .line 36
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v5, v6

    .line 40
    :goto_0
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    const-string v6, "rcf7159b38fd7b0ca"

    .line 51
    .line 52
    invoke-static {v6, v5}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    :try_start_1
    const-class v5, Landroid/content/Context;

    .line 56
    .line 57
    new-instance v6, Lpg;

    .line 58
    .line 59
    invoke-direct {v6, p0, v4}, Lpg;-><init>(Ltg;I)V

    .line 60
    .line 61
    .line 62
    filled-new-array {v5, v3, v3, v0, v6}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v2, v1, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    new-instance v1, Leo1;

    .line 73
    .line 74
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v1

    .line 78
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "rec2e7a7ea2a1f3f9"

    .line 89
    .line 90
    invoke-static {v1, v0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :try_start_2
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 94
    .line 95
    const-string v0, "android.telephony.PhaeshVadZenaith"

    .line 96
    .line 97
    iget-object p1, p1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 98
    .line 99
    invoke-static {p1, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    const-class v0, Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    sget-object v0, Lxq0;->α:Lxq0;

    .line 112
    .line 113
    new-instance v1, Lpg;

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    invoke-direct {v1, p0, v2}, Lpg;-><init>(Ltg;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p1, v1}, Lxq0;->β(Ljava/lang/Class;Lm01;)Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    const-string p0, "r4eab92dc2e52f0af"

    .line 123
    .line 124
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_2
    move-exception p0

    .line 131
    new-instance p1, Leo1;

    .line 132
    .line 133
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object p0, p1

    .line 137
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string p1, "r6d0c7b096d9be830"

    .line 148
    .line 149
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    :goto_3
    return-void
.end method

.method public final в(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 16

    .line 1
    invoke-static/range {p2 .. p2}, Ltg;->Π(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_d

    .line 8
    .line 9
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v6, Lug;->κ:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v0, Lgg;

    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    move/from16 v2, p2

    .line 30
    .line 31
    move-object/from16 v3, p3

    .line 32
    .line 33
    move-object/from16 v4, p4

    .line 34
    .line 35
    move/from16 v5, p5

    .line 36
    .line 37
    invoke-direct/range {v0 .. v5}, Lgg;-><init>(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    move-object/from16 v1, p1

    .line 45
    .line 46
    move/from16 v2, p2

    .line 47
    .line 48
    move-object/from16 v3, p3

    .line 49
    .line 50
    const v0, 0x7f0dead1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    instance-of v5, v4, Ljava/lang/Integer;

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    check-cast v4, Ljava/lang/Integer;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move-object v4, v6

    .line 66
    :goto_0
    if-eqz p5, :cond_3

    .line 67
    .line 68
    const v5, 0x7f0deae9

    .line 69
    .line 70
    .line 71
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {v1, v5, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual/range {p0 .. p1}, Ltg;->ν(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-static {v1}, Ltg;->σ(Landroid/view/View;)Ll91;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v2}, Ltg;->Ψ(I)Lbh;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    sget-object v8, Lbh;->ζ:Lbh;

    .line 88
    .line 89
    const/4 v9, 0x1

    .line 90
    const/4 v10, 0x0

    .line 91
    if-eqz v7, :cond_4

    .line 92
    .line 93
    if-eq v7, v8, :cond_4

    .line 94
    .line 95
    move v7, v9

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    move v7, v10

    .line 98
    :goto_1
    const/4 v11, 0x2

    .line 99
    if-eqz v5, :cond_8

    .line 100
    .line 101
    iget-object v12, v5, Ll91;->ζ:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v12, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    sget-object v13, Lug;->α:Ltg;

    .line 110
    .line 111
    invoke-static {v2}, Ltg;->Ψ(I)Lbh;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    if-eq v13, v8, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    sget-object v13, Lbg;->ε:Lbg;

    .line 119
    .line 120
    if-ne v12, v11, :cond_6

    .line 121
    .line 122
    move-object v12, v13

    .line 123
    goto :goto_2

    .line 124
    :cond_6
    invoke-static {v12}, Ltg;->Ψ(I)Lbh;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    if-ne v12, v8, :cond_7

    .line 129
    .line 130
    sget-object v12, Lbg;->ζ:Lbg;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    sget-object v12, Lbg;->η:Lbg;

    .line 134
    .line 135
    :goto_2
    if-ne v12, v13, :cond_8

    .line 136
    .line 137
    move v12, v9

    .line 138
    goto :goto_4

    .line 139
    :cond_8
    :goto_3
    move v12, v10

    .line 140
    :goto_4
    const v13, 0x7f0deada

    .line 141
    .line 142
    .line 143
    if-eqz v5, :cond_10

    .line 144
    .line 145
    if-nez v7, :cond_10

    .line 146
    .line 147
    if-nez v12, :cond_10

    .line 148
    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    invoke-static {v2}, Ltg;->Π(I)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-static {v1, v2}, Ltg;->ш(Landroid/view/View;I)V

    .line 166
    .line 167
    .line 168
    :cond_9
    invoke-static {v1}, Ltg;->Ν(Landroid/view/View;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_a

    .line 173
    .line 174
    invoke-static {v1}, Ltg;->к(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    :cond_a
    invoke-virtual {v1, v13, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-nez v2, :cond_b

    .line 191
    .line 192
    if-eqz v4, :cond_f

    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    invoke-static {v2}, Ltg;->Π(I)Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-ne v2, v9, :cond_f

    .line 203
    .line 204
    :cond_b
    if-eqz v4, :cond_c

    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    invoke-static {v2}, Ltg;->Π(I)Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_c

    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-static {v1, v2}, Ltg;->ш(Landroid/view/View;I)V

    .line 221
    .line 222
    .line 223
    :cond_c
    const v2, 0x7f0deadb

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    instance-of v4, v3, Ljava/lang/Float;

    .line 231
    .line 232
    if-eqz v4, :cond_d

    .line 233
    .line 234
    check-cast v3, Ljava/lang/Float;

    .line 235
    .line 236
    goto :goto_5

    .line 237
    :cond_d
    move-object v3, v6

    .line 238
    :goto_5
    if-eqz v3, :cond_e

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    goto :goto_6

    .line 245
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    :goto_6
    invoke-virtual {v1, v2, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v13, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v1}, Ltg;->н(Landroid/view/View;)V

    .line 256
    .line 257
    .line 258
    const v2, 0x7f0deadc

    .line 259
    .line 260
    .line 261
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_f
    const/4 v2, -0x2

    .line 269
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_10
    const/4 v12, 0x4

    .line 278
    if-ne v2, v12, :cond_11

    .line 279
    .line 280
    invoke-virtual/range {p0 .. p1}, Ltg;->ξ(Landroid/view/View;)V

    .line 281
    .line 282
    .line 283
    :cond_11
    if-eqz v7, :cond_13

    .line 284
    .line 285
    const v7, 0x7f0deaed

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v14

    .line 292
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-static {v14, v15}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v14

    .line 298
    if-eqz v14, :cond_12

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_12
    invoke-virtual {v1, v7, v15}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    new-instance v7, Llg;

    .line 305
    .line 306
    const/4 v14, 0x3

    .line 307
    invoke-direct {v7, v14}, Llg;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v7}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 311
    .line 312
    .line 313
    :cond_13
    :goto_7
    if-nez v4, :cond_14

    .line 314
    .line 315
    goto :goto_8

    .line 316
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-ne v7, v2, :cond_16

    .line 321
    .line 322
    invoke-virtual {v1, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-static {v7, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v7

    .line 332
    if-nez v7, :cond_15

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_15
    move v7, v10

    .line 336
    goto :goto_9

    .line 337
    :cond_16
    :goto_8
    move v7, v9

    .line 338
    :goto_9
    if-nez p4, :cond_17

    .line 339
    .line 340
    invoke-static {v2, v1, v3}, Ltg;->и(ILandroid/view/View;Ljava/lang/String;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    goto :goto_a

    .line 345
    :cond_17
    move-object/from16 v14, p4

    .line 346
    .line 347
    :goto_a
    if-eqz v4, :cond_18

    .line 348
    .line 349
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v15

    .line 353
    if-eq v15, v2, :cond_18

    .line 354
    .line 355
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 356
    .line 357
    .line 358
    move-result v4

    .line 359
    invoke-static {v1, v4}, Ltg;->ш(Landroid/view/View;I)V

    .line 360
    .line 361
    .line 362
    :cond_18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v1, v0, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 370
    .line 371
    invoke-virtual {v1, v13, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    const v0, 0x7f0deae3

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1, v0, v14}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-static/range {p0 .. p1}, Ltg;->ж(Ltg;Landroid/view/View;)V

    .line 381
    .line 382
    .line 383
    if-eqz v7, :cond_19

    .line 384
    .line 385
    invoke-static/range {p1 .. p2}, Ltg;->ч(Landroid/view/View;I)V

    .line 386
    .line 387
    .line 388
    const v0, 0x7f0deae4

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v0, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v1, v2, v3, v14}, Ltg;->б(Landroid/view/View;ILjava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    :cond_19
    invoke-static {v1}, Ltg;->γ(Landroid/view/View;)V

    .line 398
    .line 399
    .line 400
    invoke-static {}, Ltg;->Μ()Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-eqz v0, :cond_1e

    .line 405
    .line 406
    move-object/from16 v0, p0

    .line 407
    .line 408
    invoke-virtual {v0, v1, v2, v10}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 409
    .line 410
    .line 411
    if-eqz v5, :cond_1d

    .line 412
    .line 413
    iget-object v0, v5, Ll91;->ε:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Landroid/view/View;

    .line 416
    .line 417
    if-eqz v0, :cond_1d

    .line 418
    .line 419
    sget-object v3, Lug;->α:Ltg;

    .line 420
    .line 421
    invoke-static {v0}, Ltg;->а(Landroid/view/View;)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    if-nez v4, :cond_1a

    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_1a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    if-eq v5, v12, :cond_1c

    .line 433
    .line 434
    :goto_b
    if-nez v4, :cond_1b

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_1b
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    if-ne v5, v11, :cond_1d

    .line 442
    .line 443
    invoke-static {v2}, Ltg;->Ψ(I)Lbh;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    if-ne v5, v8, :cond_1d

    .line 448
    .line 449
    :cond_1c
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 450
    .line 451
    .line 452
    move-result v4

    .line 453
    invoke-virtual {v3, v0, v4, v10}, Ltg;->δ(Landroid/view/View;IZ)V

    .line 454
    .line 455
    .line 456
    :cond_1d
    :goto_c
    if-eqz v7, :cond_1e

    .line 457
    .line 458
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-nez v0, :cond_1e

    .line 463
    .line 464
    new-instance v0, Llb;

    .line 465
    .line 466
    invoke-direct {v0, v1, v2, v9}, Llb;-><init>(Landroid/view/View;II)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 470
    .line 471
    .line 472
    :cond_1e
    :goto_d
    return-void
.end method

.method public final о(Landroid/view/View;)V
    .locals 3

    .line 1
    const v0, 0x7f0deaea

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    new-instance v1, Ljb;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1}, Ljb;-><init>(Ltg;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    new-instance v1, Leo1;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object p0, v1

    .line 41
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    instance-of v2, p0, Leo1;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    move-object p0, v1

    .line 48
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_2

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    return-void
.end method

.method public final п(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    .line 1
    const v0, 0x7f0deae5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    new-instance v1, Le9;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v1, p1, p0, p2, v2}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    new-instance p2, Leo1;

    .line 37
    .line 38
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object p0, p2

    .line 42
    :goto_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 43
    .line 44
    instance-of v1, p0, Leo1;

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    move-object p0, p2

    .line 49
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_2

    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    return-void
.end method

.method public final ц()V
    .locals 3

    .line 1
    sget-object v0, Lug;->Π:Lz81;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    sget-boolean v1, Lug;->τ:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    sget-boolean v1, Lug;->σ:Z

    .line 11
    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    :cond_1
    invoke-static {}, Ltg;->Μ()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_8

    .line 19
    .line 20
    sget-boolean v1, Lug;->Ν:Z

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    monitor-enter p0

    .line 26
    :try_start_0
    sget-boolean v1, Lug;->Ν:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :cond_3
    :try_start_1
    sget-boolean v1, Lug;->τ:Z

    .line 33
    .line 34
    if-nez v1, :cond_4

    .line 35
    .line 36
    sget-boolean v1, Lug;->σ:Z

    .line 37
    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_4
    :goto_0
    sget-object v1, Lug;->α:Ltg;

    .line 44
    .line 45
    invoke-static {}, Ltg;->Μ()Z

    .line 46
    .line 47
    .line 48
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    if-nez v1, :cond_6

    .line 50
    .line 51
    :cond_5
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :cond_6
    :try_start_2
    sget-object v1, Le30;->α:Le30;

    .line 54
    .line 55
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Le30;->β(Ljava/lang/ClassLoader;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Lug;->д:Lsg;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v1, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_7

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_7
    const/4 v0, 0x1

    .line 77
    sput-boolean v0, Lug;->Ν:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    monitor-exit p0

    .line 80
    return-void

    .line 81
    :goto_1
    monitor-exit p0

    .line 82
    throw v0

    .line 83
    :cond_8
    sget-boolean p0, Lug;->Ν:Z

    .line 84
    .line 85
    if-eqz p0, :cond_9

    .line 86
    .line 87
    sget-object p0, Le30;->α:Le30;

    .line 88
    .line 89
    sget-object p0, Lug;->д:Lsg;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    sget-object v0, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    sput-boolean p0, Lug;->Ν:Z

    .line 101
    .line 102
    :cond_9
    :goto_2
    return-void
.end method
