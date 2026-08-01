.class public final Lf02;
.super Lк;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf40;
.implements Ld02;
.implements Lg40;


# static fields
.field public static final synthetic κ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field public ι:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, Lf02;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lf02;->κ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf02;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lxb;->ο:Luy;

    .line 2
    .line 3
    sget-object v1, Lf02;->κ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    return-object p0
.end method

.method public final β()Lл;
    .locals 0

    .line 1
    new-instance p0, Lg02;

    .line 2
    .line 3
    invoke-direct {p0}, Lg02;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final γ(Lg40;Lop;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Le02;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Le02;

    .line 7
    .line 8
    iget v1, v0, Le02;->ο:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Le02;->ο:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le02;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Le02;-><init>(Lf02;Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Le02;->ν:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Le02;->ο:I

    .line 28
    .line 29
    sget-object v2, Lcq;->ε:Lcq;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    if-eq v1, v6, :cond_3

    .line 38
    .line 39
    if-eq v1, v5, :cond_2

    .line 40
    .line 41
    if-ne v1, v4, :cond_1

    .line 42
    .line 43
    iget-object p0, v0, Le02;->μ:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, v0, Le02;->λ:Lfo0;

    .line 46
    .line 47
    iget-object v1, v0, Le02;->κ:Lg02;

    .line 48
    .line 49
    iget-object v7, v0, Le02;->ι:Lg40;

    .line 50
    .line 51
    iget-object v8, v0, Le02;->θ:Lf02;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    :cond_2
    iget-object p0, v0, Le02;->μ:Ljava/lang/Object;

    .line 68
    .line 69
    iget-object p1, v0, Le02;->λ:Lfo0;

    .line 70
    .line 71
    iget-object v1, v0, Le02;->κ:Lg02;

    .line 72
    .line 73
    iget-object v7, v0, Le02;->ι:Lg40;

    .line 74
    .line 75
    iget-object v8, v0, Le02;->θ:Lf02;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :cond_3
    iget-object v1, v0, Le02;->κ:Lg02;

    .line 83
    .line 84
    iget-object p1, v0, Le02;->ι:Lg40;

    .line 85
    .line 86
    iget-object p0, v0, Le02;->θ:Lf02;

    .line 87
    .line 88
    :try_start_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-exception p1

    .line 93
    move-object v8, p0

    .line 94
    move-object p0, p1

    .line 95
    goto/16 :goto_8

    .line 96
    .line 97
    :cond_4
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lк;->α()Lл;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lg02;

    .line 105
    .line 106
    move-object v1, p2

    .line 107
    :goto_1
    :try_start_3
    iget-object p2, v0, Lpp;->ζ:Lup;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    sget-object v7, Lxn0;->ζ:Lxn0;

    .line 113
    .line 114
    invoke-interface {p2, v7}, Lup;->θ(Ltp;)Lsp;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Lfo0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    move-object v8, p0

    .line 121
    move-object v7, p1

    .line 122
    move-object p1, p2

    .line 123
    move-object p0, v3

    .line 124
    :cond_5
    :goto_2
    :try_start_4
    sget-object p2, Lf02;->κ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 125
    .line 126
    invoke-virtual {p2, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-eqz p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p1}, Lfo0;->Μ()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_6

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    invoke-virtual {p1}, Lfo0;->Β()Ljava/util/concurrent/CancellationException;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    throw p0

    .line 144
    :cond_7
    :goto_3
    if-eqz p0, :cond_8

    .line 145
    .line 146
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-nez v9, :cond_b

    .line 151
    .line 152
    :cond_8
    sget-object p0, Lxb;->ο:Luy;

    .line 153
    .line 154
    if-ne p2, p0, :cond_9

    .line 155
    .line 156
    move-object p0, v3

    .line 157
    goto :goto_4

    .line 158
    :cond_9
    move-object p0, p2

    .line 159
    :goto_4
    iput-object v8, v0, Le02;->θ:Lf02;

    .line 160
    .line 161
    iput-object v7, v0, Le02;->ι:Lg40;

    .line 162
    .line 163
    iput-object v1, v0, Le02;->κ:Lg02;

    .line 164
    .line 165
    iput-object p1, v0, Le02;->λ:Lfo0;

    .line 166
    .line 167
    iput-object p2, v0, Le02;->μ:Ljava/lang/Object;

    .line 168
    .line 169
    iput v5, v0, Le02;->ο:I

    .line 170
    .line 171
    invoke-interface {v7, p0, v0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    if-ne p0, v2, :cond_a

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_a
    move-object p0, p2

    .line 179
    :cond_b
    :goto_5
    iget-object p2, v1, Lg02;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 180
    .line 181
    sget-object v9, Lln0;->ι:Luy;

    .line 182
    .line 183
    invoke-virtual {p2, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    sget-object v10, Lln0;->κ:Luy;

    .line 191
    .line 192
    if-ne p2, v10, :cond_c

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_c
    iput-object v8, v0, Le02;->θ:Lf02;

    .line 196
    .line 197
    iput-object v7, v0, Le02;->ι:Lg40;

    .line 198
    .line 199
    iput-object v1, v0, Le02;->κ:Lg02;

    .line 200
    .line 201
    iput-object p1, v0, Le02;->λ:Lfo0;

    .line 202
    .line 203
    iput-object p0, v0, Le02;->μ:Ljava/lang/Object;

    .line 204
    .line 205
    iput v4, v0, Le02;->ο:I

    .line 206
    .line 207
    sget-object p2, Ls62;->α:Ls62;

    .line 208
    .line 209
    new-instance v10, Lae;

    .line 210
    .line 211
    invoke-static {v0}, Lxb;->Θ(Lop;)Lop;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-direct {v10, v6, v11}, Lae;-><init>(ILop;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v10}, Lae;->τ()V

    .line 219
    .line 220
    .line 221
    iget-object v11, v1, Lg02;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 222
    .line 223
    :cond_d
    invoke-virtual {v11, v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v12

    .line 227
    if-eqz v12, :cond_e

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_e
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    if-eq v12, v9, :cond_d

    .line 235
    .line 236
    invoke-virtual {v10, p2}, Lae;->ζ(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    :goto_6
    invoke-virtual {v10}, Lae;->σ()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 243
    if-ne v9, v2, :cond_f

    .line 244
    .line 245
    move-object p2, v9

    .line 246
    :cond_f
    if-ne p2, v2, :cond_5

    .line 247
    .line 248
    :goto_7
    return-object v2

    .line 249
    :goto_8
    invoke-virtual {v8, v1}, Lк;->ζ(Lл;)V

    .line 250
    .line 251
    .line 252
    throw p0
.end method

.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lf02;->θ(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Ls62;->α:Ls62;

    .line 5
    .line 6
    return-object p0
.end method

.method public final ε()[Lл;
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    new-array p0, p0, [Lg02;

    .line 3
    .line 4
    return-object p0
.end method

.method public final θ(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lxb;->ο:Luy;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0, p1}, Lf02;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ι(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lf02;->κ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-static {v1, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return v2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-static {v1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    monitor-exit p0

    .line 30
    return v1

    .line 31
    :cond_1
    :try_start_2
    invoke-virtual {v0, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Lf02;->ι:I

    .line 35
    .line 36
    and-int/lit8 p2, p1, 0x1

    .line 37
    .line 38
    if-nez p2, :cond_b

    .line 39
    .line 40
    add-int/2addr p1, v1

    .line 41
    iput p1, p0, Lf02;->ι:I

    .line 42
    .line 43
    iget-object p2, p0, Lк;->ε:[Lл;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    :goto_0
    check-cast p2, [Lg02;

    .line 47
    .line 48
    if-eqz p2, :cond_9

    .line 49
    .line 50
    array-length v0, p2

    .line 51
    move v3, v2

    .line 52
    :goto_1
    if-ge v3, v0, :cond_9

    .line 53
    .line 54
    aget-object v4, p2, v3

    .line 55
    .line 56
    if-eqz v4, :cond_8

    .line 57
    .line 58
    iget-object v4, v4, Lg02;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    sget-object v6, Lln0;->κ:Luy;

    .line 68
    .line 69
    if-ne v5, v6, :cond_3

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    sget-object v7, Lln0;->ι:Luy;

    .line 73
    .line 74
    if-ne v5, v7, :cond_6

    .line 75
    .line 76
    :cond_4
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_5

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    if-eq v7, v5, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_7

    .line 95
    .line 96
    check-cast v5, Lae;

    .line 97
    .line 98
    sget-object v4, Ls62;->α:Ls62;

    .line 99
    .line 100
    invoke-virtual {v5, v4}, Lae;->ζ(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-eq v6, v5, :cond_6

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_9
    monitor-enter p0

    .line 115
    :try_start_3
    iget p2, p0, Lf02;->ι:I

    .line 116
    .line 117
    if-ne p2, p1, :cond_a

    .line 118
    .line 119
    add-int/2addr p1, v1

    .line 120
    iput p1, p0, Lf02;->ι:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    .line 122
    monitor-exit p0

    .line 123
    return v1

    .line 124
    :catchall_1
    move-exception p1

    .line 125
    goto :goto_4

    .line 126
    :cond_a
    :try_start_4
    iget-object p1, p0, Lк;->ε:[Lл;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 127
    .line 128
    monitor-exit p0

    .line 129
    move v8, p2

    .line 130
    move-object p2, p1

    .line 131
    move p1, v8

    .line 132
    goto :goto_0

    .line 133
    :goto_4
    monitor-exit p0

    .line 134
    throw p1

    .line 135
    :cond_b
    add-int/lit8 p1, p1, 0x2

    .line 136
    .line 137
    :try_start_5
    iput p1, p0, Lf02;->ι:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    .line 139
    monitor-exit p0

    .line 140
    return v1

    .line 141
    :goto_5
    monitor-exit p0

    .line 142
    throw p1
.end method
