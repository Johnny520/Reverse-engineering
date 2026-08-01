.class public final synthetic Lve0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lz81;


# direct methods
.method public synthetic constructor <init>(Lz81;I)V
    .locals 0

    .line 1
    iput p2, p0, Lve0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lve0;->ζ:Lz81;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final β()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 2
    .line 3
    const-string v0, "String"

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v1, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 8
    .line 9
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    invoke-static {p0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    move-object v2, p0

    .line 25
    :goto_0
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const-class v3, Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_1
    invoke-virtual {v3}, Lτ;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3}, Lτ;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/lang/reflect/Field;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    new-instance v6, Ll91;

    .line 68
    .line 69
    invoke-direct {v6, v5, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string v2, "desc"

    .line 82
    .line 83
    const-string v3, "description"

    .line 84
    .line 85
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v1, v2, v0}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sput-object v2, Lbd;->π:Ljava/lang/String;

    .line 98
    .line 99
    const-string v2, "author"

    .line 100
    .line 101
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-static {v1, v2, v3}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    sput-object v2, Lbd;->ρ:Ljava/lang/String;

    .line 111
    .line 112
    const-string v2, "video"

    .line 113
    .line 114
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v1, v2, v3}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sput-object v2, Lbd;->σ:Ljava/lang/String;

    .line 123
    .line 124
    const-string v2, "imageList"

    .line 125
    .line 126
    const-string v4, "images"

    .line 127
    .line 128
    const-string v5, "image_list"

    .line 129
    .line 130
    const-string v6, "imagePostInfo"

    .line 131
    .line 132
    filled-new-array {v2, v4, v5, v6}, [Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-static {v1, v2, v3}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    sput-object v2, Lbd;->τ:Ljava/lang/String;

    .line 145
    .line 146
    const-string v2, "aid"

    .line 147
    .line 148
    const-string v3, "awemeId"

    .line 149
    .line 150
    const-string v4, "id"

    .line 151
    .line 152
    const-string v5, "aweme_id"

    .line 153
    .line 154
    const-string v6, "aId"

    .line 155
    .line 156
    filled-new-array {v2, v3, v4, v5, v6}, [Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v1, v2, v0}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    const-string v2, "shareUrl"

    .line 168
    .line 169
    const-string v3, "share_url"

    .line 170
    .line 171
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-static {v2}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v1, v2, v0}, Lbd;->ξ(Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    sget-object v0, Lbd;->π:Ljava/lang/String;

    .line 183
    .line 184
    sget-object v1, Lbd;->ρ:Ljava/lang/String;

    .line 185
    .line 186
    sget-object v2, Lbd;->σ:Ljava/lang/String;

    .line 187
    .line 188
    sget-object v3, Lbd;->τ:Ljava/lang/String;

    .line 189
    .line 190
    new-instance v4, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    const-string v5, "DYHelper: \u5b57\u6bb5\u5339\u914d: desc="

    .line 196
    .line 197
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, ", author="

    .line 204
    .line 205
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v0, ", video="

    .line 212
    .line 213
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v0, ", imageList="

    .line 220
    .line 221
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    sget-object v0, Lbd;->σ:Ljava/lang/String;

    .line 235
    .line 236
    if-eqz v0, :cond_2

    .line 237
    .line 238
    invoke-static {p0}, Lbd;->Λ(Ljava/lang/Class;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :catchall_0
    move-exception p0

    .line 243
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    const-string v0, "DYHelper: Aweme \u63a2\u6d4b\u5931\u8d25: "

    .line 248
    .line 249
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :cond_2
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 253
    .line 254
    return-object p0
.end method

.method private final γ()Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    sget-object v0, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_2

    .line 14
    .line 15
    :cond_0
    const-string v0, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 16
    .line 17
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 22
    .line 23
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    :try_start_0
    invoke-static {p0, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance v0, Leo1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :goto_0
    instance-of v0, p0, Leo1;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    move-object p0, v1

    .line 43
    :cond_1
    check-cast p0, Ljava/lang/Class;

    .line 44
    .line 45
    const/4 v0, 0x4

    .line 46
    const-string v2, "DYHelper: SeekBarVisibility"

    .line 47
    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    const-string p0, "ProSeekBarView not found"

    .line 51
    .line 52
    invoke-static {v2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    :try_start_1
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 57
    .line 58
    const-class v3, Landroid/content/Context;

    .line 59
    .line 60
    const-class v4, Landroid/util/AttributeSet;

    .line 61
    .line 62
    new-instance v5, Lad1;

    .line 63
    .line 64
    sget-object v6, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 65
    .line 66
    const/16 v6, 0x14

    .line 67
    .line 68
    invoke-direct {v5, v6}, Lad1;-><init>(I)V

    .line 69
    .line 70
    .line 71
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {p0, v3}, Lqe0;->δ(Ljava/lang/Class;[Ljava/lang/Object;)Ll01;

    .line 76
    .line 77
    .line 78
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    goto :goto_1

    .line 80
    :catchall_1
    move-exception v3

    .line 81
    new-instance v4, Leo1;

    .line 82
    .line 83
    invoke-direct {v4, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object v3, v4

    .line 87
    :goto_1
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    sget-object v4, Lqr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const-string v4, "hook constructor failed: "

    .line 100
    .line 101
    invoke-static {v4, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v2, v3, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    new-instance v3, Lad1;

    .line 109
    .line 110
    const/16 v4, 0x15

    .line 111
    .line 112
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 113
    .line 114
    .line 115
    const-string v4, "setVisibility"

    .line 116
    .line 117
    invoke-static {p0, v4, v3}, Lqr1;->β(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 118
    .line 119
    .line 120
    new-instance v3, Lad1;

    .line 121
    .line 122
    const/16 v4, 0x16

    .line 123
    .line 124
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 125
    .line 126
    .line 127
    const-string v4, "setProgress"

    .line 128
    .line 129
    invoke-static {p0, v4, v3}, Lqr1;->β(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 130
    .line 131
    .line 132
    new-instance v3, Lad1;

    .line 133
    .line 134
    const/16 v4, 0x17

    .line 135
    .line 136
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const-string v4, "onDraw"

    .line 140
    .line 141
    invoke-static {p0, v4, v3}, Lqr1;->β(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 142
    .line 143
    .line 144
    const-string p0, "ProSeekBarView visibility hook installed"

    .line 145
    .line 146
    invoke-static {v2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 150
    .line 151
    return-object p0
.end method

.method private final δ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 2
    .line 3
    sget-object v0, Ljb0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    sput-object p0, Ljb0;->ζ:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    sget-object p0, Lui1;->α:Ljava/lang/Object;

    .line 19
    .line 20
    sget-object p0, Ljb0;->κ:Ls20;

    .line 21
    .line 22
    invoke-static {p0}, Lui1;->β(La80;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Li;->α:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    sget-object p0, Ljb0;->λ:Lib0;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v0, Li;->γ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, Ljb0;->α(Landroid/app/Activity;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const-string p0, "\u81ea\u52a8\u5ba1\u6279\u8c03\u5ea6\u5668\u5df2\u6ce8\u518c"

    .line 47
    .line 48
    const/4 v0, 0x4

    .line 49
    const-string v1, "rb22c2f83ae9ef877"

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 56
    .line 57
    return-object p0
.end method

.method private final ζ()Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    sget-object v0, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_9

    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 16
    .line 17
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 18
    .line 19
    const-string v3, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 20
    .line 21
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v0, v3}, Lpr1;->δ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, "ProSeekBarView not found"

    .line 32
    .line 33
    invoke-static {v0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance v3, Lad1;

    .line 38
    .line 39
    const/16 v4, 0x12

    .line 40
    .line 41
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v4, "onDraw"

    .line 45
    .line 46
    invoke-static {v0, v4, v3}, Lpr1;->κ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Lad1;

    .line 50
    .line 51
    const/16 v4, 0x13

    .line 52
    .line 53
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string v4, "setProgress"

    .line 57
    .line 58
    invoke-static {v0, v4, v3}, Lpr1;->κ(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "ProSeekBarView hook installed"

    .line 62
    .line 63
    invoke-static {v0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 67
    .line 68
    const-string v3, "~78E784A121CC4D4A76A82A6412191AC853CB05E0BEF16A4FCD52E9EDE594B1EB7A26029BA8545F3C7E30A101FAD966DF810DCD83CF069660D5377A43BED0508D947414BCADFE80D1D63722F51F5BE5BECF12C2F147A77F50B5412A90"

    .line 69
    .line 70
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v0, v3}, Lpr1;->δ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    const-string v0, "ProSeekBarPlayerProgressComponent not found"

    .line 83
    .line 84
    invoke-static {v0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v4, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    array-length v5, v0

    .line 102
    move v6, v1

    .line 103
    :goto_1
    if-ge v6, v5, :cond_8

    .line 104
    .line 105
    aget-object v7, v0, v6

    .line 106
    .line 107
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_3

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-static {v8, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-nez v8, :cond_4

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    array-length v9, v8

    .line 137
    const/4 v10, 0x2

    .line 138
    if-ne v9, v10, :cond_7

    .line 139
    .line 140
    aget-object v9, v8, v1

    .line 141
    .line 142
    sget-object v10, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 143
    .line 144
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-nez v9, :cond_5

    .line 149
    .line 150
    aget-object v9, v8, v1

    .line 151
    .line 152
    const-class v10, Ljava/lang/Float;

    .line 153
    .line 154
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_7

    .line 159
    .line 160
    :cond_5
    aget-object v9, v8, v2

    .line 161
    .line 162
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 163
    .line 164
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_6

    .line 169
    .line 170
    aget-object v8, v8, v2

    .line 171
    .line 172
    const-class v9, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-eqz v8, :cond_7

    .line 179
    .line 180
    :cond_6
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    move v4, v1

    .line 191
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_a

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 204
    .line 205
    .line 206
    :try_start_0
    sget-object v6, Lxq0;->α:Lxq0;

    .line 207
    .line 208
    new-instance v7, Lad1;

    .line 209
    .line 210
    sget-object v8, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 211
    .line 212
    const/16 v8, 0x11

    .line 213
    .line 214
    invoke-direct {v7, v8}, Lad1;-><init>(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v5, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 218
    .line 219
    .line 220
    add-int/lit8 v6, v4, 0x1

    .line 221
    .line 222
    :try_start_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    goto :goto_5

    .line 227
    :catchall_0
    move-exception v4

    .line 228
    goto :goto_4

    .line 229
    :catchall_1
    move-exception v6

    .line 230
    move-object v11, v6

    .line 231
    move v6, v4

    .line 232
    move-object v4, v11

    .line 233
    :goto_4
    new-instance v7, Leo1;

    .line 234
    .line 235
    invoke-direct {v7, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    move-object v4, v7

    .line 239
    :goto_5
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    if-eqz v4, :cond_9

    .line 244
    .line 245
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    new-instance v7, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v8, "hook progress update failed: "

    .line 256
    .line 257
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v5, ", "

    .line 264
    .line 265
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v4}, Lpr1;->λ(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_9
    move v4, v6

    .line 279
    goto :goto_3

    .line 280
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v5, "ProSeekBarPlayerProgressComponent progress hook count="

    .line 283
    .line 284
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-static {v0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :goto_6
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 298
    .line 299
    const-string v0, "~78C7222F2A96B599B7D83774C1C1E3514447820FDCE5C5B541FD315DD1B9B5C000F722126CC42AE4415DE1C47B613731957AADC7925C7378F4980D27F9E4E3C0120A3F38898F23E5E80C1EA4B93B83F0D2C11DDA"

    .line 300
    .line 301
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {p0, v0}, Lpr1;->δ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    if-nez p0, :cond_b

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    new-instance v0, Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 322
    .line 323
    .line 324
    array-length v4, p0

    .line 325
    move v5, v1

    .line 326
    :goto_7
    if-ge v5, v4, :cond_d

    .line 327
    .line 328
    aget-object v6, p0, v5

    .line 329
    .line 330
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 331
    .line 332
    .line 333
    move-result v7

    .line 334
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 335
    .line 336
    .line 337
    move-result v7

    .line 338
    if-nez v7, :cond_c

    .line 339
    .line 340
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v7

    .line 344
    invoke-static {v7, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    if-eqz v7, :cond_c

    .line 349
    .line 350
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    move-result-object v7

    .line 354
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    array-length v7, v7

    .line 358
    if-nez v7, :cond_c

    .line 359
    .line 360
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    :cond_c
    add-int/lit8 v5, v5, 0x1

    .line 364
    .line 365
    goto :goto_7

    .line 366
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    :catchall_2
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_e

    .line 375
    .line 376
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    check-cast v0, Ljava/lang/reflect/Method;

    .line 381
    .line 382
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 383
    .line 384
    .line 385
    :try_start_2
    sget-object v3, Lxq0;->α:Lxq0;

    .line 386
    .line 387
    new-instance v4, Lad1;

    .line 388
    .line 389
    sget-object v5, Lpr1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 390
    .line 391
    const/16 v5, 0x10

    .line 392
    .line 393
    invoke-direct {v4, v5}, Lad1;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 397
    .line 398
    .line 399
    add-int/lit8 v1, v1, 0x1

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_e
    new-instance p0, Ljava/lang/StringBuilder;

    .line 403
    .line 404
    const-string v0, "ProTimeDescViewComponent fallback hook count="

    .line 405
    .line 406
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-static {p0}, Lpr1;->λ(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    :goto_9
    sget-object p0, Ls62;->α:Ls62;

    .line 420
    .line 421
    return-object p0
.end method

.method private final η()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 2
    .line 3
    sget-object v0, Lqj1;->α:Lqj1;

    .line 4
    .line 5
    sget-object v1, Lqj1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v4, Ls62;->α:Ls62;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_9

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {}, Lnj1;->η()V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lnj1;->ζ()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 35
    .line 36
    sget-object v1, Lnj1;->θ:Lli1;

    .line 37
    .line 38
    invoke-static {v1}, Lui1;->β(La80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    move-object v2, v4

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    new-instance v2, Leo1;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "ProfileVideoOverlayAlpha: \u914d\u7f6e\u76d1\u542c\u6ce8\u518c\u5931\u8d25\uff0c\u4fdd\u7559\u9875\u9762\u7ed1\u5b9a\u65f6\u8bfb\u53d6\u7684\u9ed8\u8ba4\u503c: "

    .line 60
    .line 61
    invoke-static {v2, v1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :try_start_1
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 65
    .line 66
    sget-object v1, Lnj1;->ι:Lli1;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v2, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 74
    .line 75
    .line 76
    move-object v2, v4

    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception v1

    .line 79
    new-instance v2, Leo1;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v2, "ProfileVideoOverlayAlpha: \u8d26\u53f7\u914d\u7f6e\u5207\u6362\u76d1\u542c\u6ce8\u518c\u5931\u8d25\uff0c\u5c06\u5728\u4e0b\u6b21\u9875\u9762\u7ed1\u5b9a\u65f6\u91cd\u8bfb: "

    .line 95
    .line 96
    invoke-static {v2, v1}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_2
    :try_start_2
    iget-object v1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lqj1;->δ(Ljava/lang/ClassLoader;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 109
    goto :goto_3

    .line 110
    :catchall_2
    move-exception v1

    .line 111
    new-instance v2, Leo1;

    .line 112
    .line 113
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v2

    .line 117
    :goto_3
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-nez v2, :cond_4

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v2, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v3, "search \u5206\u652f\u5b89\u88c5\u5df2\u964d\u7ea7: "

    .line 131
    .line 132
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "branch_search"

    .line 143
    .line 144
    invoke-static {v2, v1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 148
    .line 149
    :goto_4
    check-cast v1, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    :try_start_3
    iget-object v2, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Lqj1;->γ(Ljava/lang/ClassLoader;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 165
    goto :goto_5

    .line 166
    :catchall_3
    move-exception v2

    .line 167
    new-instance v3, Leo1;

    .line 168
    .line 169
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    move-object v2, v3

    .line 173
    :goto_5
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-nez v3, :cond_5

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v3, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v5, "comment_input \u5206\u652f\u5b89\u88c5\u5df2\u964d\u7ea7: "

    .line 187
    .line 188
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    const-string v3, "branch_comment_input"

    .line 199
    .line 200
    invoke-static {v3, v2}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 204
    .line 205
    :goto_6
    check-cast v2, Ljava/lang/Boolean;

    .line 206
    .line 207
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_6

    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x1

    .line 214
    .line 215
    :cond_6
    :try_start_4
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 216
    .line 217
    invoke-virtual {v0, p0}, Lqj1;->ε(Ljava/lang/ClassLoader;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 222
    .line 223
    .line 224
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 225
    goto :goto_7

    .line 226
    :catchall_4
    move-exception p0

    .line 227
    new-instance v0, Leo1;

    .line 228
    .line 229
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    move-object p0, v0

    .line 233
    :goto_7
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-nez v0, :cond_7

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    new-instance v0, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v2, "ultra_comment \u5206\u652f\u5b89\u88c5\u5df2\u964d\u7ea7: "

    .line 247
    .line 248
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    const-string v0, "branch_ultra_comment"

    .line 259
    .line 260
    invoke-static {v0, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 264
    .line 265
    :goto_8
    check-cast p0, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result p0

    .line 271
    if-eqz p0, :cond_8

    .line 272
    .line 273
    add-int/lit8 v1, v1, 0x1

    .line 274
    .line 275
    :cond_8
    if-nez v1, :cond_9

    .line 276
    .line 277
    const-string p0, "no_hook"

    .line 278
    .line 279
    const-string v0, "\u5f53\u524d\u5bbf\u4e3b\u672a\u547d\u4e2d\u4efb\u4f55\u900f\u660e\u5ea6\u8fb9\u754c\uff0c\u5df2\u4fdd\u6301\u539f\u754c\u9762"

    .line 280
    .line 281
    invoke-static {p0, v0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    goto :goto_9

    .line 285
    :cond_9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v0, "ProfileVideoOverlayAlphaHook: \u5df2\u5b89\u88c5 "

    .line 288
    .line 289
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v0, " \u7ec4\u4f5c\u8005\u4e3b\u9875\u89c6\u9891\u900f\u660e\u5ea6\u8fb9\u754c"

    .line 296
    .line 297
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    :goto_9
    return-object v4
.end method

.method private final θ()Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf;->α:Lkf;

    .line 2
    .line 3
    sget-object v0, Lkf;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 15
    .line 16
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    const-string v1, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E842756DA5E8CF875623AE519F07DFAD42004186D37B9EBBCC2E6698BA9A46908228635487F32694"

    .line 19
    .line 20
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v0, v1}, Lkf;->ε(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-string v0, "FeedSyncPresenter not found"

    .line 31
    .line 32
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    new-instance v1, Lh;

    .line 37
    .line 38
    const/4 v2, 0x2

    .line 39
    invoke-direct {v1, v2}, Lh;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const-string v2, "onBind"

    .line 43
    .line 44
    invoke-static {v0, v2, v1}, Lkf;->ν(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 48
    .line 49
    const-string v1, "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"

    .line 50
    .line 51
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v0, v1}, Lkf;->ε(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "setProgress"

    .line 60
    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    const-string v0, "ProSeekBarView not found"

    .line 64
    .line 65
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    new-instance v2, Lh;

    .line 70
    .line 71
    const/4 v3, 0x4

    .line 72
    invoke-direct {v2, v3}, Lh;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1, v2}, Lkf;->ν(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "ProSeekBarView segment skip hook installed"

    .line 79
    .line 80
    invoke-static {v0}, Lkf;->ο(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 84
    .line 85
    const-string v0, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"

    .line 86
    .line 87
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {p0, v0}, Lkf;->ε(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-nez p0, :cond_3

    .line 96
    .line 97
    const-string p0, "ChapterOuterSeekBar not found"

    .line 98
    .line 99
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    new-instance v0, Lh;

    .line 104
    .line 105
    const/4 v2, 0x3

    .line 106
    invoke-direct {v0, v2}, Lh;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v1, v0}, Lkf;->ν(Ljava/lang/Class;Ljava/lang/String;Lm01;)V

    .line 110
    .line 111
    .line 112
    const-string p0, "ChapterOuterSeekBar segment observer installed"

    .line 113
    .line 114
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    const-string p0, "segment skip hook installed"

    .line 118
    .line 119
    invoke-static {p0}, Lkf;->ο(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 123
    .line 124
    return-object p0
.end method

.method private final ι()Ljava/lang/Object;
    .locals 6

    .line 1
    const-string v0, "DYHelper:AntiRecall"

    .line 2
    .line 3
    sget-object v1, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 6
    .line 7
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v3, "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"

    .line 14
    .line 15
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {p0, v3}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    sget-object v3, Lxq0;->α:Lxq0;

    .line 24
    .line 25
    new-instance v4, Lf10;

    .line 26
    .line 27
    const/16 v5, 0x10

    .line 28
    .line 29
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const-string v5, "isRecalled"

    .line 33
    .line 34
    invoke-virtual {v3, p0, v5, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    new-instance v4, Lf10;

    .line 38
    .line 39
    const/16 v5, 0x11

    .line 40
    .line 41
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v5, "getMsgStatus"

    .line 45
    .line 46
    invoke-virtual {v3, p0, v5, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    new-instance v4, Lf10;

    .line 50
    .line 51
    const/16 v5, 0x12

    .line 52
    .line 53
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 54
    .line 55
    .line 56
    const-string v5, "setContent"

    .line 57
    .line 58
    invoke-virtual {v3, p0, v5, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    new-instance v4, Lf10;

    .line 62
    .line 63
    const/16 v5, 0x13

    .line 64
    .line 65
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 66
    .line 67
    .line 68
    const-string v5, "getContent"

    .line 69
    .line 70
    invoke-virtual {v3, p0, v5, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    new-instance v4, Lf10;

    .line 74
    .line 75
    const/16 v5, 0x14

    .line 76
    .line 77
    invoke-direct {v4, v5}, Lf10;-><init>(I)V

    .line 78
    .line 79
    .line 80
    const-string v5, "getContentByte"

    .line 81
    .line 82
    invoke-virtual {v3, p0, v5, v4}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    const-string p0, "\u9632\u64a4\u56de\u5df2\u5b89\u88c5"

    .line 86
    .line 87
    invoke-static {v0, p0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    const-string p0, "rc4f62a03697beec1"

    .line 92
    .line 93
    invoke-static {v0, p0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 97
    .line 98
    return-object p0
.end method

.method private final κ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 2
    .line 3
    sget-object v0, Lzj0;->α:Lzj0;

    .line 4
    .line 5
    iget-object v1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    sput-object v1, Lzj0;->δ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lzj0;->κ(Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    invoke-static {v0}, Lzj0;->λ(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lzj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance v0, Lfj0;

    .line 33
    .line 34
    const/16 v1, 0x11

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lfj0;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v1, "IMMarkAllReadHelper"

    .line 40
    .line 41
    invoke-static {v1, v0}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lfj0;

    .line 45
    .line 46
    const/16 v1, 0x12

    .line 47
    .line 48
    invoke-direct {v0, v1}, Lfj0;-><init>(I)V

    .line 49
    .line 50
    .line 51
    const-string v1, "IMMarkAllReadHelper_bottom_sync"

    .line 52
    .line 53
    invoke-static {v1, v0}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 54
    .line 55
    .line 56
    :goto_0
    sget v0, Lix;->α:I

    .line 57
    .line 58
    invoke-static {p0}, Lix;->η(Lz81;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "DYHelperIMMarkAllReadHelper: IMMarkAllReadHelper \u521d\u59cb\u5316\u5b8c\u6210"

    .line 62
    .line 63
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Ls62;->α:Ls62;

    .line 67
    .line 68
    return-object p0
.end method

.method private final λ()Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lri0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    sget-object v0, Lwi0;->α:Lwi0;

    .line 4
    .line 5
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 6
    .line 7
    iget-object v1, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lwi0;->η(Ljava/lang/ClassLoader;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lri0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v3, Ls62;->α:Ls62;

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :try_start_0
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 26
    .line 27
    invoke-static {p0}, Lri0;->θ(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    move-object v1, v3

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance v1, Leo1;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 45
    .line 46
    .line 47
    const-string v0, "rbb4637c919e2110c"

    .line 48
    .line 49
    const-string v1, "\u5b89\u88c5\u6d88\u606f\u9875\u4f1a\u8bdd\u5220\u9664\u5165\u53e3\u5931\u8d25"

    .line 50
    .line 51
    invoke-static {v0, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    return-object v3
.end method

.method private final μ()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lbk0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object v0, Lbk0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v0, Lwj0;

    .line 24
    .line 25
    const/16 v1, 0x10

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lwj0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const-string v1, "IMPrivacyStatusHook"

    .line 31
    .line 32
    invoke-static {v1, v0}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lwj0;

    .line 36
    .line 37
    const/16 v2, 0x11

    .line 38
    .line 39
    invoke-direct {v0, v2}, Lwj0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v0}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 46
    .line 47
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 48
    .line 49
    invoke-static {p0}, Lbk0;->γ(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const-string p0, "DYHelperIMPrivacyStatusHook"

    .line 53
    .line 54
    const-string v0, "IMPrivacyStatusHook \u521d\u59cb\u5316\u5b8c\u6210\uff0c\u4ec5\u62e6\u622a\u5df2\u8bfb\u4e0a\u62a5"

    .line 55
    .line 56
    invoke-static {p0, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 60
    .line 61
    return-object p0
.end method

.method private final ν()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object p0, p0, Lve0;->ζ:Lz81;

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    sget-object v0, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const-string v2, "DYHelper"

    .line 8
    .line 9
    sget-object v0, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual {v0, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    iget-object v0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    sput-object v0, Lpj0;->γ:Ljava/lang/ClassLoader;

    .line 23
    .line 24
    iget-object p0, p0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    const-string v0, "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"

    .line 27
    .line 28
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const/4 v5, 0x4

    .line 33
    const/4 v6, 0x0

    .line 34
    :try_start_0
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 35
    .line 36
    const-string v0, "LJIIL"

    .line 37
    .line 38
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    new-instance v13, Lf10;

    .line 45
    .line 46
    const/16 v8, 0x1d

    .line 47
    .line 48
    invoke-direct {v13, v8}, Lf10;-><init>(I)V

    .line 49
    .line 50
    .line 51
    move-object v8, v7

    .line 52
    move-object v9, v7

    .line 53
    move-object v10, v7

    .line 54
    filled-new-array/range {v7 .. v13}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-static {v3, p0, v0, v7}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 59
    .line 60
    .line 61
    const-string v0, "\u5df2 Hook MessageTabDotHelperNew.LJIIL"

    .line 62
    .line 63
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    move-object v7, v1

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    new-instance v7, Leo1;

    .line 70
    .line 71
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    invoke-static {v7}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    invoke-static {v0}, Lpj0;->ε(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v7, "Hook MessageTabDotHelperNew.LJIIL \u5931\u8d25: "

    .line 89
    .line 90
    invoke-static {v7, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v2, v0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    :try_start_1
    const-string v0, "X.C2244071Ckh"

    .line 98
    .line 99
    invoke-static {v0, v4, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v7, Lqe0;->α:Ljava/lang/Object;

    .line 104
    .line 105
    const-string v7, "LIZ"

    .line 106
    .line 107
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    const-class v9, Ljava/util/Map;

    .line 110
    .line 111
    new-instance v10, Loj0;

    .line 112
    .line 113
    sget-object v11, Lpj0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-direct {v10, v4}, Loj0;-><init>(I)V

    .line 116
    .line 117
    .line 118
    filled-new-array {v8, v9, v0, v10}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v3, p0, v7, v0}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 123
    .line 124
    .line 125
    const-string p0, "\u5df2 Hook MessageTabDotHelperNew.LIZ"

    .line 126
    .line 127
    invoke-static {v2, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 128
    .line 129
    .line 130
    move-object v0, v1

    .line 131
    goto :goto_1

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    new-instance v0, Leo1;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-eqz p0, :cond_2

    .line 144
    .line 145
    invoke-static {p0}, Lpj0;->ε(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    const-string v0, "Hook MessageTabDotHelperNew.LIZ \u5931\u8d25: "

    .line 154
    .line 155
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {v2, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_2
    const-string p0, "IMDndUnreadHook \u521d\u59cb\u5316\u5b8c\u6210"

    .line 163
    .line 164
    invoke-static {v2, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object v1
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lve0;->ε:I

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    const/16 v3, 0xa

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/16 v5, 0x1c

    .line 11
    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x4

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 21
    .line 22
    sget-object v1, Lsh1;->α:Lsh1;

    .line 23
    .line 24
    iget-object v1, v0, Lz81;->α:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, v0, Lz81;->β:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "init called, packageName="

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, ", processName="

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lsh1;->ν(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v2, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 54
    .line 55
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_0

    .line 64
    .line 65
    const-string v0, "rf08a45e43722957e"

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_1

    .line 81
    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v3, "init skipped: processName mismatch ("

    .line 85
    .line 86
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, " != "

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ")"

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    const-string v0, "init proceeding..."

    .line 114
    .line 115
    invoke-static {v0}, Lsh1;->ν(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v0, "feed_auto_scroll_content_resolver"

    .line 119
    .line 120
    sget-object v1, Ls00;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 121
    .line 122
    invoke-virtual {v1, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_2

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 130
    .line 131
    new-instance v1, Lhm;

    .line 132
    .line 133
    invoke-direct {v1, v5}, Lhm;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v1}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 137
    .line 138
    .line 139
    new-instance v1, Lhm;

    .line 140
    .line 141
    const/16 v2, 0x1d

    .line 142
    .line 143
    invoke-direct {v1, v2}, Lhm;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v1}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 147
    .line 148
    .line 149
    :goto_0
    sget-object v0, Lx00;->α:Lx00;

    .line 150
    .line 151
    invoke-static {}, Lx00;->θ()V

    .line 152
    .line 153
    .line 154
    const-class v0, Landroid/app/Activity;

    .line 155
    .line 156
    sget-object v1, Lsh1;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 157
    .line 158
    invoke-virtual {v1, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_3

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    sget-object v1, Lxq0;->α:Lxq0;

    .line 166
    .line 167
    const-string v2, "onResume"

    .line 168
    .line 169
    new-instance v3, Lad1;

    .line 170
    .line 171
    invoke-direct {v3, v6}, Lad1;-><init>(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1, v0, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    const-string v2, "onPause"

    .line 178
    .line 179
    new-instance v3, Lad1;

    .line 180
    .line 181
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v0, v2, v3}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    const-string v1, "dispatchTouchEvent"

    .line 188
    .line 189
    const-class v2, Landroid/view/MotionEvent;

    .line 190
    .line 191
    new-instance v3, Lad1;

    .line 192
    .line 193
    invoke-direct {v3, v8}, Lad1;-><init>(I)V

    .line 194
    .line 195
    .line 196
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v0, v1, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 201
    .line 202
    .line 203
    :goto_1
    sget-object v0, Lsh1;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 204
    .line 205
    invoke-virtual {v0, v10, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_4

    .line 210
    .line 211
    const-class v0, Landroid/app/Application;

    .line 212
    .line 213
    const-string v1, "attach"

    .line 214
    .line 215
    const-class v2, Landroid/content/Context;

    .line 216
    .line 217
    new-instance v3, Lad1;

    .line 218
    .line 219
    const/4 v4, 0x7

    .line 220
    invoke-direct {v3, v4}, Lad1;-><init>(I)V

    .line 221
    .line 222
    .line 223
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v0, v1, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 228
    .line 229
    .line 230
    :cond_4
    :goto_2
    sget-object v0, Ls62;->α:Ls62;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_0
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 234
    .line 235
    sget-boolean v1, Lpu0;->β:Z

    .line 236
    .line 237
    if-eqz v1, :cond_5

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_5
    sput-boolean v9, Lpu0;->β:Z

    .line 241
    .line 242
    sget-object v1, Lj41;->α:Ljava/lang/ClassLoader;

    .line 243
    .line 244
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sput-object v0, Lj41;->α:Ljava/lang/ClassLoader;

    .line 250
    .line 251
    :goto_3
    sget-object v0, Ls62;->α:Ls62;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_1
    invoke-direct {v0}, Lve0;->ν()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0

    .line 259
    :pswitch_2
    invoke-direct {v0}, Lve0;->μ()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    return-object v0

    .line 264
    :pswitch_3
    invoke-direct {v0}, Lve0;->λ()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    return-object v0

    .line 269
    :pswitch_4
    invoke-direct {v0}, Lve0;->β()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    return-object v0

    .line 274
    :pswitch_5
    invoke-direct {v0}, Lve0;->κ()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_6
    invoke-direct {v0}, Lve0;->ι()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    return-object v0

    .line 284
    :pswitch_7
    invoke-direct {v0}, Lve0;->θ()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :pswitch_8
    invoke-direct {v0}, Lve0;->η()Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0

    .line 294
    :pswitch_9
    invoke-direct {v0}, Lve0;->ζ()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0

    .line 299
    :pswitch_a
    invoke-direct {v0}, Lve0;->δ()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    return-object v0

    .line 304
    :pswitch_b
    invoke-direct {v0}, Lve0;->γ()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :pswitch_c
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 310
    .line 311
    sget-object v1, Lc82;->α:Lc82;

    .line 312
    .line 313
    sget-object v1, Ls62;->α:Ls62;

    .line 314
    .line 315
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 316
    .line 317
    sget-object v0, Lc82;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 318
    .line 319
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-nez v0, :cond_6

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_6
    :try_start_0
    invoke-static {v2}, Lc82;->η(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    .line 328
    .line 329
    move-object v3, v1

    .line 330
    goto :goto_4

    .line 331
    :catchall_0
    move-exception v0

    .line 332
    new-instance v3, Leo1;

    .line 333
    .line 334
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 335
    .line 336
    .line 337
    :goto_4
    invoke-static {v3}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-eqz v0, :cond_7

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    new-instance v3, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    const-string v4, "Feed \u89e3\u7801 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 350
    .line 351
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :cond_7
    :try_start_1
    invoke-static {v2}, Lc82;->θ(Ljava/lang/ClassLoader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 365
    .line 366
    .line 367
    move-object v2, v1

    .line 368
    goto :goto_5

    .line 369
    :catchall_1
    move-exception v0

    .line 370
    new-instance v2, Leo1;

    .line 371
    .line 372
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    :goto_5
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    if-eqz v0, :cond_8

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    new-instance v2, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v3, "Feed \u5217\u8868 setter Hook \u5b89\u88c5\u5931\u8d25: "

    .line 388
    .line 389
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v0}, Lc82;->ο(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    :cond_8
    :goto_6
    return-object v1

    .line 403
    :pswitch_d
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 404
    .line 405
    sget-object v1, Lfj;->α:Lfj;

    .line 406
    .line 407
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 408
    .line 409
    invoke-virtual {v1, v0}, Lfj;->ρ(Ljava/lang/ClassLoader;)V

    .line 410
    .line 411
    .line 412
    :goto_7
    sget-object v0, Ls62;->α:Ls62;

    .line 413
    .line 414
    return-object v0

    .line 415
    :pswitch_e
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 416
    .line 417
    sget-object v1, Lql;->α:Lql;

    .line 418
    .line 419
    monitor-enter v1

    .line 420
    :try_start_2
    sget-boolean v2, Lql;->γ:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 421
    .line 422
    if-eqz v2, :cond_9

    .line 423
    .line 424
    monitor-exit v1

    .line 425
    goto :goto_8

    .line 426
    :cond_9
    :try_start_3
    sput-boolean v9, Lql;->γ:Z

    .line 427
    .line 428
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 429
    .line 430
    invoke-virtual {v1, v2}, Lql;->φ(Ljava/lang/ClassLoader;)V

    .line 431
    .line 432
    .line 433
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 434
    .line 435
    invoke-virtual {v1, v2}, Lql;->χ(Ljava/lang/ClassLoader;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v0}, Lql;->ψ(Lz81;)V

    .line 439
    .line 440
    .line 441
    sget v0, Lcom/example/dyhelper/MainHook;->β:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 442
    .line 443
    monitor-exit v1

    .line 444
    :goto_8
    sget-object v0, Ls62;->α:Ls62;

    .line 445
    .line 446
    return-object v0

    .line 447
    :catchall_2
    move-exception v0

    .line 448
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 449
    throw v0

    .line 450
    :pswitch_f
    iget-object v1, v0, Lve0;->ζ:Lz81;

    .line 451
    .line 452
    sget-object v0, Ltl;->α:Landroid/util/LruCache;

    .line 453
    .line 454
    const-class v2, Ljava/lang/String;

    .line 455
    .line 456
    const-string v3, "DYHelper_ImageWatermark"

    .line 457
    .line 458
    :try_start_5
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 459
    .line 460
    const-string v0, "android.net.Uri"

    .line 461
    .line 462
    iget-object v7, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 463
    .line 464
    const-string v8, "parse"

    .line 465
    .line 466
    new-instance v11, Lh;

    .line 467
    .line 468
    invoke-direct {v11, v5}, Lh;-><init>(I)V

    .line 469
    .line 470
    .line 471
    filled-new-array {v2, v11}, [Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-static {v0, v7, v8, v5}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 476
    .line 477
    .line 478
    goto :goto_9

    .line 479
    :catchall_3
    move-exception v0

    .line 480
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    const-string v7, "Hook Uri.parse \u5931\u8d25: "

    .line 485
    .line 486
    invoke-static {v7, v5, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 487
    .line 488
    .line 489
    :goto_9
    :try_start_6
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 490
    .line 491
    const-string v0, "java.net.URL"

    .line 492
    .line 493
    iget-object v5, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 494
    .line 495
    new-instance v7, Lh;

    .line 496
    .line 497
    const/16 v8, 0x1b

    .line 498
    .line 499
    invoke-direct {v7, v8}, Lh;-><init>(I)V

    .line 500
    .line 501
    .line 502
    filled-new-array {v2, v7}, [Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    invoke-static {v5, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    invoke-static {v0, v5}, Lqe0;->δ(Ljava/lang/Class;[Ljava/lang/Object;)Ll01;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 515
    .line 516
    .line 517
    goto :goto_a

    .line 518
    :catchall_4
    move-exception v0

    .line 519
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    const-string v7, "Hook java.net.URL \u5931\u8d25: "

    .line 524
    .line 525
    invoke-static {v7, v5, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 526
    .line 527
    .line 528
    :goto_a
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 529
    .line 530
    :try_start_7
    sget-object v5, Lqe0;->α:Ljava/lang/Object;

    .line 531
    .line 532
    const-string v5, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAD9131B3F256364FE597603FE0C975A9FCE723D12F128B686"

    .line 533
    .line 534
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v0, v5}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    if-nez v5, :cond_a

    .line 543
    .line 544
    goto :goto_b

    .line 545
    :cond_a
    const-string v7, "~7924EBBB26E5F66AE51C20F0B6D7913B6350E34D1800219366D00F3ECE76895F8E4CEECA58736F4E112BCC66"

    .line 546
    .line 547
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    invoke-static {v0, v7}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    if-nez v0, :cond_b

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_b
    const-string v7, "download_url"

    .line 559
    .line 560
    invoke-static {v5, v7}, Ltl;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    if-nez v7, :cond_c

    .line 565
    .line 566
    :goto_b
    move/from16 v16, v10

    .line 567
    .line 568
    goto/16 :goto_10

    .line 569
    .line 570
    :cond_c
    const-string v8, "origin_url"

    .line 571
    .line 572
    invoke-static {v5, v8}, Ltl;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    const-string v11, "medium_url"

    .line 577
    .line 578
    invoke-static {v5, v11}, Ltl;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 579
    .line 580
    .line 581
    move-result-object v11

    .line 582
    const-string v12, "crop_url"

    .line 583
    .line 584
    invoke-static {v5, v12}, Ltl;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 585
    .line 586
    .line 587
    move-result-object v12

    .line 588
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    new-instance v13, Ljava/util/ArrayList;

    .line 596
    .line 597
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 598
    .line 599
    .line 600
    array-length v14, v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 601
    move v15, v10

    .line 602
    :goto_c
    if-ge v15, v14, :cond_e

    .line 603
    .line 604
    move/from16 v16, v10

    .line 605
    .line 606
    :try_start_8
    aget-object v10, v5, v15

    .line 607
    .line 608
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    array-length v4, v4

    .line 616
    if-nez v4, :cond_d

    .line 617
    .line 618
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-eqz v4, :cond_d

    .line 627
    .line 628
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    goto :goto_d

    .line 632
    :catchall_5
    move-exception v0

    .line 633
    goto :goto_f

    .line 634
    :cond_d
    :goto_d
    add-int/lit8 v15, v15, 0x1

    .line 635
    .line 636
    move/from16 v10, v16

    .line 637
    .line 638
    const/4 v4, 0x3

    .line 639
    goto :goto_c

    .line 640
    :cond_e
    move/from16 v16, v10

    .line 641
    .line 642
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 647
    .line 648
    .line 649
    move-result v4

    .line 650
    if-eqz v4, :cond_f

    .line 651
    .line 652
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    check-cast v4, Ljava/lang/reflect/Method;

    .line 657
    .line 658
    invoke-virtual {v4, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 659
    .line 660
    .line 661
    sget-object v5, Lxq0;->α:Lxq0;

    .line 662
    .line 663
    new-instance v10, Lsl;

    .line 664
    .line 665
    invoke-direct {v10, v7, v8, v11, v12}, Lsl;-><init>(Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;Ljava/lang/reflect/Field;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v5, v4, v10}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 669
    .line 670
    .line 671
    goto :goto_e

    .line 672
    :cond_f
    const-string v0, "\u8bc4\u8bba\u56fe\u7247\u6a21\u578b\u4fdd\u5b58\u6e90 Hook \u5df2\u5b89\u88c5"

    .line 673
    .line 674
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 675
    .line 676
    .line 677
    goto :goto_10

    .line 678
    :catchall_6
    move-exception v0

    .line 679
    move/from16 v16, v10

    .line 680
    .line 681
    :goto_f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    const-string v5, "\u8bc4\u8bba\u56fe\u7247\u6a21\u578b Hook \u5931\u8d25: "

    .line 686
    .line 687
    invoke-static {v5, v4, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 688
    .line 689
    .line 690
    :goto_10
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 691
    .line 692
    :try_start_9
    sget-object v4, Lqe0;->α:Ljava/lang/Object;

    .line 693
    .line 694
    const-string v4, "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059049CFED8B79CC2450D2A13695573BF621FDC7044653DE2732CF77606074B77E4DD920584C20D2B73D"

    .line 695
    .line 696
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v4

    .line 700
    invoke-static {v0, v4}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    if-nez v0, :cond_10

    .line 705
    .line 706
    goto :goto_15

    .line 707
    :cond_10
    const-string v4, "url_list"

    .line 708
    .line 709
    invoke-static {v0, v4}, Ltl;->β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    if-nez v4, :cond_11

    .line 714
    .line 715
    goto :goto_15

    .line 716
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    new-instance v5, Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 726
    .line 727
    .line 728
    array-length v7, v0

    .line 729
    move/from16 v8, v16

    .line 730
    .line 731
    :goto_11
    if-ge v8, v7, :cond_13

    .line 732
    .line 733
    aget-object v10, v0, v8

    .line 734
    .line 735
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    move-result-object v11

    .line 739
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    array-length v11, v11

    .line 743
    if-nez v11, :cond_12

    .line 744
    .line 745
    const-class v11, Ljava/util/List;

    .line 746
    .line 747
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    move-result-object v12

    .line 751
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 752
    .line 753
    .line 754
    move-result v11

    .line 755
    if-eqz v11, :cond_12

    .line 756
    .line 757
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    goto :goto_12

    .line 761
    :catchall_7
    move-exception v0

    .line 762
    goto :goto_14

    .line 763
    :cond_12
    :goto_12
    add-int/lit8 v8, v8, 0x1

    .line 764
    .line 765
    goto :goto_11

    .line 766
    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result v5

    .line 774
    if-eqz v5, :cond_14

    .line 775
    .line 776
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v5

    .line 780
    check-cast v5, Ljava/lang/reflect/Method;

    .line 781
    .line 782
    invoke-virtual {v5, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 783
    .line 784
    .line 785
    sget-object v7, Lxq0;->α:Lxq0;

    .line 786
    .line 787
    new-instance v8, Lnh;

    .line 788
    .line 789
    invoke-direct {v8, v6, v4}, Lnh;-><init>(ILjava/lang/Object;)V

    .line 790
    .line 791
    .line 792
    invoke-virtual {v7, v5, v8}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 793
    .line 794
    .line 795
    goto :goto_13

    .line 796
    :cond_14
    const-string v0, "\u8bc4\u8bba\u52a8\u56fe\u6a21\u578b\u4fdd\u5b58\u6e90 Hook \u5df2\u5b89\u88c5"

    .line 797
    .line 798
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 799
    .line 800
    .line 801
    goto :goto_15

    .line 802
    :goto_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v4

    .line 806
    const-string v5, "\u8bc4\u8bba\u52a8\u56fe\u6a21\u578b Hook \u5931\u8d25: "

    .line 807
    .line 808
    invoke-static {v5, v4, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    :goto_15
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 812
    .line 813
    :try_start_a
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 814
    .line 815
    const-string v1, "~790C6456DF85BCEE663B681374F92433989E3F9AAFD50EBB9E0AF620A1EC6DD9E218D80B4AA6"

    .line 816
    .line 817
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v1

    .line 821
    invoke-static {v0, v1}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    if-nez v0, :cond_15

    .line 826
    .line 827
    goto/16 :goto_1b

    .line 828
    .line 829
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    new-instance v1, Ljava/util/ArrayList;

    .line 837
    .line 838
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 839
    .line 840
    .line 841
    array-length v4, v0

    .line 842
    move/from16 v5, v16

    .line 843
    .line 844
    :goto_16
    if-ge v5, v4, :cond_19

    .line 845
    .line 846
    aget-object v7, v0, v5

    .line 847
    .line 848
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 849
    .line 850
    .line 851
    move-result v8

    .line 852
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 853
    .line 854
    .line 855
    move-result v8

    .line 856
    if-eqz v8, :cond_16

    .line 857
    .line 858
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    move-result-object v8

    .line 862
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 863
    .line 864
    invoke-static {v8, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v8

    .line 868
    if-nez v8, :cond_17

    .line 869
    .line 870
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-result-object v8

    .line 874
    invoke-static {v8, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 875
    .line 876
    .line 877
    move-result v8

    .line 878
    if-eqz v8, :cond_16

    .line 879
    .line 880
    goto :goto_17

    .line 881
    :cond_16
    const/4 v10, 0x3

    .line 882
    goto :goto_18

    .line 883
    :catchall_8
    move-exception v0

    .line 884
    goto/16 :goto_1a

    .line 885
    .line 886
    :cond_17
    :goto_17
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    move-result-object v8

    .line 890
    array-length v8, v8

    .line 891
    const/4 v10, 0x3

    .line 892
    if-ne v8, v10, :cond_18

    .line 893
    .line 894
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    move-result-object v8

    .line 898
    aget-object v8, v8, v16

    .line 899
    .line 900
    invoke-static {v8, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v8

    .line 904
    if-eqz v8, :cond_18

    .line 905
    .line 906
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 907
    .line 908
    .line 909
    move-result-object v8

    .line 910
    aget-object v8, v8, v9

    .line 911
    .line 912
    invoke-static {v8, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 913
    .line 914
    .line 915
    move-result v8

    .line 916
    if-eqz v8, :cond_18

    .line 917
    .line 918
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    move-result-object v8

    .line 922
    aget-object v8, v8, v6

    .line 923
    .line 924
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v8

    .line 928
    const-string v11, "~7908F94451A999F71196F64AC0FD22E4AC4B6D6F206A5D2BC66D4B109B0B5F28FEB88301ABE47A"

    .line 929
    .line 930
    invoke-static {v11}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v11

    .line 934
    invoke-virtual {v8, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v8

    .line 938
    if-eqz v8, :cond_18

    .line 939
    .line 940
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    :cond_18
    :goto_18
    add-int/lit8 v5, v5, 0x1

    .line 944
    .line 945
    goto :goto_16

    .line 946
    :cond_19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 951
    .line 952
    .line 953
    move-result v2

    .line 954
    if-eqz v2, :cond_1a

    .line 955
    .line 956
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    check-cast v2, Ljava/lang/reflect/Method;

    .line 961
    .line 962
    invoke-virtual {v2, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 963
    .line 964
    .line 965
    sget-object v4, Lxq0;->α:Lxq0;

    .line 966
    .line 967
    new-instance v5, Lh;

    .line 968
    .line 969
    const/16 v6, 0x1a

    .line 970
    .line 971
    invoke-direct {v5, v6}, Lh;-><init>(I)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v4, v2, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 975
    .line 976
    .line 977
    goto :goto_19

    .line 978
    :cond_1a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    new-instance v1, Ljava/lang/StringBuilder;

    .line 983
    .line 984
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 985
    .line 986
    .line 987
    const-string v2, "\u8bc4\u8bba\u56fe\u7247\u7528\u6237\u4e0b\u8f7d\u76ee\u5f55 Hook \u5df2\u5b89\u88c5: "

    .line 988
    .line 989
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 990
    .line 991
    .line 992
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 993
    .line 994
    .line 995
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v3, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1000
    .line 1001
    .line 1002
    goto :goto_1b

    .line 1003
    :goto_1a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    const-string v2, "\u8bc4\u8bba\u56fe\u7247\u7528\u6237\u4e0b\u8f7d\u76ee\u5f55 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 1008
    .line 1009
    invoke-static {v2, v1, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1010
    .line 1011
    .line 1012
    :goto_1b
    sget-object v0, Ls62;->α:Ls62;

    .line 1013
    .line 1014
    return-object v0

    .line 1015
    :pswitch_10
    move/from16 v16, v10

    .line 1016
    .line 1017
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1018
    .line 1019
    sget-object v1, Lmj;->α:Lh22;

    .line 1020
    .line 1021
    iget-object v1, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1022
    .line 1023
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 1027
    .line 1028
    .line 1029
    move-result v0

    .line 1030
    sget-object v2, Lmj;->β:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 1031
    .line 1032
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v0

    .line 1040
    if-nez v0, :cond_1b

    .line 1041
    .line 1042
    goto :goto_1d

    .line 1043
    :cond_1b
    sget-object v0, Lmj;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1044
    .line 1045
    move/from16 v2, v16

    .line 1046
    .line 1047
    invoke-virtual {v0, v2, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v0

    .line 1051
    if-nez v0, :cond_1c

    .line 1052
    .line 1053
    goto :goto_1c

    .line 1054
    :cond_1c
    :try_start_b
    new-instance v0, Lgh;

    .line 1055
    .line 1056
    const/16 v2, 0xd

    .line 1057
    .line 1058
    invoke-direct {v0, v2}, Lgh;-><init>(I)V

    .line 1059
    .line 1060
    .line 1061
    sget-object v2, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1062
    .line 1063
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 1064
    .line 1065
    .line 1066
    goto :goto_1c

    .line 1067
    :catchall_9
    move-exception v0

    .line 1068
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    const-string v3, "install profile listener failed: "

    .line 1075
    .line 1076
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-static {v0}, Lmj;->σ(Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    :goto_1c
    :try_start_c
    invoke-static {v1}, Lmj;->μ(Ljava/lang/ClassLoader;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-static {v1}, Lmj;->ν(Ljava/lang/ClassLoader;)V

    .line 1093
    .line 1094
    .line 1095
    const-string v0, "installed"

    .line 1096
    .line 1097
    invoke-static {v0}, Lmj;->σ(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 1098
    .line 1099
    .line 1100
    goto :goto_1d

    .line 1101
    :catchall_a
    move-exception v0

    .line 1102
    const-string v1, "r31ea4ef8bcca40f9"

    .line 1103
    .line 1104
    const-string v2, "install failed"

    .line 1105
    .line 1106
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1107
    .line 1108
    .line 1109
    :goto_1d
    sget-object v0, Ls62;->α:Ls62;

    .line 1110
    .line 1111
    return-object v0

    .line 1112
    :pswitch_11
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1113
    .line 1114
    sget-object v1, Le72;->γ:Ljava/util/ArrayList;

    .line 1115
    .line 1116
    const-string v1, "r3d7af71c7d5f3398"

    .line 1117
    .line 1118
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1119
    .line 1120
    const-string v4, "~793C911F02B4DC5CCCA55B8C6F59F423EC7383D78869998D7000C6ADBCAD99044D3E8549548CF07CFE2D"

    .line 1121
    .line 1122
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v4

    .line 1126
    const-string v5, "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128319BA9DDE6489BFD0F890B62A0B8F269639979E85"

    .line 1127
    .line 1128
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v5

    .line 1132
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v4

    .line 1136
    invoke-static {v4}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v4

    .line 1140
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v4

    .line 1144
    :catchall_b
    :goto_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1145
    .line 1146
    .line 1147
    move-result v5

    .line 1148
    if-eqz v5, :cond_1d

    .line 1149
    .line 1150
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v5

    .line 1154
    check-cast v5, Ljava/lang/String;

    .line 1155
    .line 1156
    :try_start_d
    invoke-static {v0, v5}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v6

    .line 1160
    const-string v9, "onResume"

    .line 1161
    .line 1162
    new-instance v10, Lbm;

    .line 1163
    .line 1164
    const/4 v11, 0x0

    .line 1165
    invoke-direct {v10, v3, v0, v11}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 1166
    .line 1167
    .line 1168
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v10

    .line 1172
    invoke-static {v6, v9, v10}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1173
    .line 1174
    .line 1175
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1176
    .line 1177
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1178
    .line 1179
    .line 1180
    const-string v9, "\u5df2 hook "

    .line 1181
    .line 1182
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1186
    .line 1187
    .line 1188
    const-string v5, ".onResume()"

    .line 1189
    .line 1190
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v5

    .line 1197
    invoke-static {v1, v5, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 1198
    .line 1199
    .line 1200
    goto :goto_1e

    .line 1201
    :cond_1d
    :try_start_e
    sget-object v3, Lqe0;->α:Ljava/lang/Object;

    .line 1202
    .line 1203
    const-string v3, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"

    .line 1204
    .line 1205
    invoke-static {v3}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v3

    .line 1209
    invoke-static {v0, v3}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    const-string v4, "getUid"

    .line 1214
    .line 1215
    new-instance v5, Lbm;

    .line 1216
    .line 1217
    const/4 v11, 0x0

    .line 1218
    invoke-direct {v5, v2, v0, v11}, Lbm;-><init>(ILjava/lang/ClassLoader;Z)V

    .line 1219
    .line 1220
    .line 1221
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    invoke-static {v3, v4, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1226
    .line 1227
    .line 1228
    const-string v0, "\u5df2 hook User.getUid() (\u5907\u7528)"

    .line 1229
    .line 1230
    invoke-static {v1, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 1231
    .line 1232
    .line 1233
    goto :goto_1f

    .line 1234
    :catchall_c
    move-exception v0

    .line 1235
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    const-string v2, "User.getUid() hook \u5931\u8d25: "

    .line 1240
    .line 1241
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    invoke-static {v1, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1246
    .line 1247
    .line 1248
    :goto_1f
    const-string v0, "\u521d\u59cb\u5316\u5b8c\u6210"

    .line 1249
    .line 1250
    invoke-static {v1, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1251
    .line 1252
    .line 1253
    goto/16 :goto_7

    .line 1254
    .line 1255
    :pswitch_12
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1256
    .line 1257
    sget-object v1, Li;->α:Ljava/lang/ref/WeakReference;

    .line 1258
    .line 1259
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 1260
    .line 1261
    const-string v1, "android.app.Activity"

    .line 1262
    .line 1263
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1264
    .line 1265
    const-string v3, "onResume"

    .line 1266
    .line 1267
    new-instance v4, Lh;

    .line 1268
    .line 1269
    const/4 v11, 0x0

    .line 1270
    invoke-direct {v4, v11}, Lh;-><init>(I)V

    .line 1271
    .line 1272
    .line 1273
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v4

    .line 1277
    invoke-static {v1, v2, v3, v4}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1278
    .line 1279
    .line 1280
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1281
    .line 1282
    const-string v2, "onDestroy"

    .line 1283
    .line 1284
    new-instance v3, Lh;

    .line 1285
    .line 1286
    invoke-direct {v3, v9}, Lh;-><init>(I)V

    .line 1287
    .line 1288
    .line 1289
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    invoke-static {v1, v0, v2, v3}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1294
    .line 1295
    .line 1296
    goto/16 :goto_7

    .line 1297
    .line 1298
    :pswitch_13
    iget-object v1, v0, Lve0;->ζ:Lz81;

    .line 1299
    .line 1300
    sget-object v0, Lf82;->α:Landroid/os/Handler;

    .line 1301
    .line 1302
    const-string v2, "DYHelper: VideoLengthAlert"

    .line 1303
    .line 1304
    :try_start_f
    invoke-static {}, Lui1;->Α()Z

    .line 1305
    .line 1306
    .line 1307
    move-result v0

    .line 1308
    if-eqz v0, :cond_1e

    .line 1309
    .line 1310
    goto :goto_20

    .line 1311
    :cond_1e
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    if-eqz v0, :cond_1f

    .line 1316
    .line 1317
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1322
    .line 1323
    .line 1324
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    .line 1325
    .line 1326
    .line 1327
    goto :goto_20

    .line 1328
    :catchall_d
    move-exception v0

    .line 1329
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    const-string v3, "PrefsManager \u521d\u59cb\u5316\u5931\u8d25: "

    .line 1334
    .line 1335
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    invoke-static {v2, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1340
    .line 1341
    .line 1342
    :cond_1f
    :goto_20
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1343
    .line 1344
    :try_start_10
    sget-object v1, Lx00;->α:Lx00;

    .line 1345
    .line 1346
    invoke-virtual {v1, v0}, Lx00;->δ(Ljava/lang/ClassLoader;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_e

    .line 1347
    .line 1348
    .line 1349
    goto :goto_21

    .line 1350
    :catchall_e
    move-exception v0

    .line 1351
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    const-string v1, "\u5f53\u524d\u4f5c\u54c1\u9009\u4e2d\u6001 Hook \u5b89\u88c5\u5931\u8d25\uff0c\u8df3\u8fc7\u957f\u89c6\u9891\u63d0\u9192: "

    .line 1356
    .line 1357
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    invoke-static {v2, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1362
    .line 1363
    .line 1364
    :goto_21
    new-instance v0, Lj72;

    .line 1365
    .line 1366
    const/16 v1, 0xc

    .line 1367
    .line 1368
    invoke-direct {v0, v1}, Lj72;-><init>(I)V

    .line 1369
    .line 1370
    .line 1371
    sget-object v1, Lpq;->ι:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1372
    .line 1373
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 1374
    .line 1375
    .line 1376
    const-string v0, "\u5df2\u8ba2\u9605\u5f53\u524d\u4f5c\u54c1\u9009\u4e2d\u6001"

    .line 1377
    .line 1378
    invoke-static {v2, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1379
    .line 1380
    .line 1381
    goto/16 :goto_7

    .line 1382
    .line 1383
    :pswitch_14
    iget-object v1, v0, Lve0;->ζ:Lz81;

    .line 1384
    .line 1385
    sget-object v0, Lct;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1386
    .line 1387
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1388
    .line 1389
    const-string v3, "nextInt"

    .line 1390
    .line 1391
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1392
    .line 1393
    const-string v4, "rf839340cfbdf7ea6"

    .line 1394
    .line 1395
    :try_start_11
    const-string v5, "kotlin.random.Random$Default"

    .line 1396
    .line 1397
    const-string v6, "Kotlin Random"

    .line 1398
    .line 1399
    new-instance v9, Lbt;

    .line 1400
    .line 1401
    const/4 v11, 0x0

    .line 1402
    invoke-direct {v9, v6, v11}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 1403
    .line 1404
    .line 1405
    filled-new-array {v2, v9}, [Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v6

    .line 1409
    invoke-static {v5, v0, v3, v6}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_f

    .line 1413
    goto :goto_22

    .line 1414
    :catchall_f
    move-exception v0

    .line 1415
    new-instance v5, Leo1;

    .line 1416
    .line 1417
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1418
    .line 1419
    .line 1420
    move-object v0, v5

    .line 1421
    :goto_22
    instance-of v5, v0, Leo1;

    .line 1422
    .line 1423
    if-nez v5, :cond_20

    .line 1424
    .line 1425
    move-object v5, v0

    .line 1426
    check-cast v5, Ll01;

    .line 1427
    .line 1428
    const-string v5, "\u9ab0\u5b50 Kotlin Random Hook \u5df2\u90e8\u7f72"

    .line 1429
    .line 1430
    invoke-static {v4, v5, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1431
    .line 1432
    .line 1433
    :cond_20
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v0

    .line 1437
    if-eqz v0, :cond_21

    .line 1438
    .line 1439
    const-string v5, "\u9ab0\u5b50 Kotlin Random Hook \u5b89\u88c5\u5931\u8d25\uff0c\u4fdd\u7559\u5bbf\u4e3b\u968f\u673a\u884c\u4e3a"

    .line 1440
    .line 1441
    invoke-static {v4, v5, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1442
    .line 1443
    .line 1444
    :cond_21
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1445
    .line 1446
    :try_start_12
    const-string v1, "java.util.Random"

    .line 1447
    .line 1448
    const-string v5, "Java Random"

    .line 1449
    .line 1450
    new-instance v6, Lbt;

    .line 1451
    .line 1452
    const/4 v11, 0x0

    .line 1453
    invoke-direct {v6, v5, v11}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 1454
    .line 1455
    .line 1456
    filled-new-array {v2, v6}, [Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v2

    .line 1460
    invoke-static {v1, v0, v3, v2}, Lqe0;->ζ(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    .line 1464
    goto :goto_23

    .line 1465
    :catchall_10
    move-exception v0

    .line 1466
    new-instance v1, Leo1;

    .line 1467
    .line 1468
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1469
    .line 1470
    .line 1471
    move-object v0, v1

    .line 1472
    :goto_23
    instance-of v1, v0, Leo1;

    .line 1473
    .line 1474
    if-nez v1, :cond_22

    .line 1475
    .line 1476
    move-object v1, v0

    .line 1477
    check-cast v1, Ll01;

    .line 1478
    .line 1479
    const-string v1, "\u9ab0\u5b50 Java Random \u517c\u5bb9 Hook \u5df2\u90e8\u7f72"

    .line 1480
    .line 1481
    invoke-static {v4, v1, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1482
    .line 1483
    .line 1484
    :cond_22
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    if-eqz v0, :cond_23

    .line 1489
    .line 1490
    const-string v1, "\u9ab0\u5b50 Java Random Hook \u5b89\u88c5\u5931\u8d25\uff0c\u4fdd\u7559\u5bbf\u4e3b\u968f\u673a\u884c\u4e3a"

    .line 1491
    .line 1492
    invoke-static {v4, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1493
    .line 1494
    .line 1495
    :cond_23
    const-string v0, "\u9ab0\u5b50\u63a7\u5236Hook\u521d\u59cb\u5316\u5b8c\u6210"

    .line 1496
    .line 1497
    invoke-static {v4, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1498
    .line 1499
    .line 1500
    goto/16 :goto_7

    .line 1501
    .line 1502
    :pswitch_15
    iget-object v1, v0, Lve0;->ζ:Lz81;

    .line 1503
    .line 1504
    sget-object v2, Ls62;->α:Ls62;

    .line 1505
    .line 1506
    sget-object v3, Lry1;->α:Lry1;

    .line 1507
    .line 1508
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1509
    .line 1510
    sput-object v0, Lry1;->φ:Ljava/lang/ClassLoader;

    .line 1511
    .line 1512
    sget-object v0, Lry1;->Ξ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1513
    .line 1514
    const/4 v11, 0x0

    .line 1515
    invoke-virtual {v0, v11, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1516
    .line 1517
    .line 1518
    move-result v0

    .line 1519
    const/16 v4, 0x19

    .line 1520
    .line 1521
    if-nez v0, :cond_24

    .line 1522
    .line 1523
    goto :goto_24

    .line 1524
    :cond_24
    new-instance v0, Leu1;

    .line 1525
    .line 1526
    invoke-direct {v0, v4}, Leu1;-><init>(I)V

    .line 1527
    .line 1528
    .line 1529
    sget-object v5, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1530
    .line 1531
    invoke-virtual {v5, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    invoke-static {v0}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    if-eqz v0, :cond_26

    .line 1551
    .line 1552
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1553
    .line 1554
    .line 1555
    move-result-wide v5

    .line 1556
    const-wide/16 v10, 0x0

    .line 1557
    .line 1558
    cmp-long v5, v5, v10

    .line 1559
    .line 1560
    if-lez v5, :cond_25

    .line 1561
    .line 1562
    move-object v7, v0

    .line 1563
    :cond_25
    if-eqz v7, :cond_26

    .line 1564
    .line 1565
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 1566
    .line 1567
    .line 1568
    move-result-wide v5

    .line 1569
    const-string v0, "PrefsManager.currentUid"

    .line 1570
    .line 1571
    invoke-static {v5, v6, v0}, Lry1;->ｍ(JLjava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    :cond_26
    :goto_24
    sget-object v0, Lbd1;->α:Ljava/util/Set;

    .line 1575
    .line 1576
    iget-object v5, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1577
    .line 1578
    const-string v6, "rc2954fec18baf260"

    .line 1579
    .line 1580
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1581
    .line 1582
    .line 1583
    sget-object v7, Lbd1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1584
    .line 1585
    const/4 v11, 0x0

    .line 1586
    invoke-virtual {v7, v11, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1587
    .line 1588
    .line 1589
    move-result v0

    .line 1590
    if-nez v0, :cond_27

    .line 1591
    .line 1592
    goto/16 :goto_2c

    .line 1593
    .line 1594
    :cond_27
    :try_start_13
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22BB36ACF30F5904E8FC433C73395AC3A9559B49EE96CBEE40836D687DDFD6168EFC"

    .line 1595
    .line 1596
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v0

    .line 1600
    invoke-static {v0, v11, v5}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v10

    .line 1608
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1609
    .line 1610
    .line 1611
    invoke-static {v10}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v10

    .line 1615
    invoke-static {v10}, Lbd1;->ρ(Ljava/util/List;)Ljava/lang/reflect/Method;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v10

    .line 1619
    if-eqz v10, :cond_2d

    .line 1620
    .line 1621
    invoke-virtual {v10, v9}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1622
    .line 1623
    .line 1624
    sget-object v11, Lxq0;->α:Lxq0;

    .line 1625
    .line 1626
    new-instance v12, Loj0;

    .line 1627
    .line 1628
    invoke-direct {v12, v4}, Loj0;-><init>(I)V

    .line 1629
    .line 1630
    .line 1631
    invoke-virtual {v11, v10, v12}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    .line 1632
    .line 1633
    .line 1634
    :try_start_14
    invoke-static {v0}, Lbd1;->μ(Ljava/lang/Class;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    .line 1635
    .line 1636
    .line 1637
    move-object v4, v2

    .line 1638
    goto :goto_25

    .line 1639
    :catchall_11
    move-exception v0

    .line 1640
    :try_start_15
    new-instance v4, Leo1;

    .line 1641
    .line 1642
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1643
    .line 1644
    .line 1645
    :goto_25
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    if-eqz v0, :cond_28

    .line 1650
    .line 1651
    const-string v4, "\u4e16\u754c\u4f1a\u8bdd\u89c2\u5bdf\u4e0d\u53ef\u7528\uff0c\u8425\u5730\u7f13\u5b58\u5c06\u4fdd\u6301\u672a\u7ed1\u5b9a"

    .line 1652
    .line 1653
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_12

    .line 1654
    .line 1655
    .line 1656
    goto :goto_26

    .line 1657
    :catchall_12
    move-exception v0

    .line 1658
    const/4 v11, 0x0

    .line 1659
    goto/16 :goto_2b

    .line 1660
    .line 1661
    :cond_28
    :goto_26
    :try_start_16
    invoke-static {v5}, Lbd1;->ι(Ljava/lang/ClassLoader;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_13

    .line 1662
    .line 1663
    .line 1664
    move-object v4, v2

    .line 1665
    goto :goto_27

    .line 1666
    :catchall_13
    move-exception v0

    .line 1667
    :try_start_17
    new-instance v4, Leo1;

    .line 1668
    .line 1669
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1670
    .line 1671
    .line 1672
    :goto_27
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    if-eqz v0, :cond_29

    .line 1677
    .line 1678
    const-string v4, "\u516c\u5171\u53c2\u6570\u89c2\u5bdf\u4e0d\u53ef\u7528\uff0c\u7ee7\u7eed\u4f7f\u7528\u4e16\u754c\u542f\u52a8\u4e0e Unity \u515c\u5e95"

    .line 1679
    .line 1680
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_12

    .line 1681
    .line 1682
    .line 1683
    :cond_29
    :try_start_18
    invoke-static {v5}, Lbd1;->λ(Ljava/lang/ClassLoader;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_14

    .line 1684
    .line 1685
    .line 1686
    move-object v4, v2

    .line 1687
    goto :goto_28

    .line 1688
    :catchall_14
    move-exception v0

    .line 1689
    :try_start_19
    new-instance v4, Leo1;

    .line 1690
    .line 1691
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1692
    .line 1693
    .line 1694
    :goto_28
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v0

    .line 1698
    if-eqz v0, :cond_2a

    .line 1699
    .line 1700
    const-string v4, "\u4e16\u754c\u542f\u52a8\u89c2\u5bdf\u4e0d\u53ef\u7528\uff0c\u7ee7\u7eed\u4f7f\u7528\u516c\u5171\u53c2\u6570\u515c\u5e95"

    .line 1701
    .line 1702
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_12

    .line 1703
    .line 1704
    .line 1705
    :cond_2a
    :try_start_1a
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v0

    .line 1709
    aget-object v0, v0, v8

    .line 1710
    .line 1711
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    invoke-static {v0}, Lbd1;->θ(Ljava/lang/Class;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_15

    .line 1715
    .line 1716
    .line 1717
    move-object v4, v2

    .line 1718
    goto :goto_29

    .line 1719
    :catchall_15
    move-exception v0

    .line 1720
    :try_start_1b
    new-instance v4, Leo1;

    .line 1721
    .line 1722
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1723
    .line 1724
    .line 1725
    :goto_29
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v0

    .line 1729
    if-eqz v0, :cond_2b

    .line 1730
    .line 1731
    const-string v4, "\u6865\u63a5\u56de\u8c03 Hook \u4e0d\u53ef\u7528\uff0c\u5df2\u4fdd\u7559\u8bf7\u6c42\u89c2\u5bdf"

    .line 1732
    .line 1733
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_12

    .line 1734
    .line 1735
    .line 1736
    :cond_2b
    :try_start_1c
    invoke-static {v5}, Lbd1;->κ(Ljava/lang/ClassLoader;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_16

    .line 1737
    .line 1738
    .line 1739
    move-object v4, v2

    .line 1740
    goto :goto_2a

    .line 1741
    :catchall_16
    move-exception v0

    .line 1742
    :try_start_1d
    new-instance v4, Leo1;

    .line 1743
    .line 1744
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1745
    .line 1746
    .line 1747
    :goto_2a
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v0

    .line 1751
    if-eqz v0, :cond_2c

    .line 1752
    .line 1753
    const-string v4, "\u54cd\u5e94\u76d1\u63a7 Hook \u4e0d\u53ef\u7528\uff0c\u5df2\u964d\u7ea7\u4e3a\u6865\u63a5\u56de\u8c03\u89c2\u5bdf"

    .line 1754
    .line 1755
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1756
    .line 1757
    .line 1758
    :cond_2c
    const-string v0, "rfd9083af6ee7091f"

    .line 1759
    .line 1760
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 1761
    .line 1762
    .line 1763
    const/4 v11, 0x0

    .line 1764
    goto :goto_2c

    .line 1765
    :cond_2d
    new-instance v0, Ljava/lang/NoSuchMethodException;

    .line 1766
    .line 1767
    const-string v4, "\u672a\u627e\u5230\u552f\u4e00\u7684 Hamlet HTTP \u6865\u63a5\u65b9\u6cd5"

    .line 1768
    .line 1769
    invoke-direct {v0, v4}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 1770
    .line 1771
    .line 1772
    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_12

    .line 1773
    :goto_2b
    invoke-virtual {v7, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1774
    .line 1775
    .line 1776
    const-string v4, "\u5b89\u88c5 DEV \u53ea\u8bfb\u8bf7\u6c42\u89c2\u5bdf\u5668\u5931\u8d25"

    .line 1777
    .line 1778
    invoke-static {v6, v4, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1779
    .line 1780
    .line 1781
    :goto_2c
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1782
    .line 1783
    invoke-static {v0}, Lry1;->ж(Ljava/lang/ClassLoader;)V

    .line 1784
    .line 1785
    .line 1786
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1787
    .line 1788
    invoke-virtual {v3, v0, v9}, Lry1;->Γ(Ljava/lang/ClassLoader;Z)V

    .line 1789
    .line 1790
    .line 1791
    sget-object v0, Lry1;->Ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1792
    .line 1793
    invoke-virtual {v0, v11, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1794
    .line 1795
    .line 1796
    move-result v0

    .line 1797
    if-nez v0, :cond_2e

    .line 1798
    .line 1799
    goto :goto_2d

    .line 1800
    :cond_2e
    :try_start_1e
    const-class v0, Landroid/app/Activity;

    .line 1801
    .line 1802
    const-string v3, "onResume"

    .line 1803
    .line 1804
    new-instance v4, Lhx;

    .line 1805
    .line 1806
    invoke-direct {v4, v1, v9}, Lhx;-><init>(Lz81;I)V

    .line 1807
    .line 1808
    .line 1809
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v1

    .line 1813
    invoke-static {v0, v3, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 1814
    .line 1815
    .line 1816
    const-string v0, "Activity.onResume \u76d1\u542c\u5df2\u90e8\u7f72"

    .line 1817
    .line 1818
    invoke-static {v0}, Lry1;->щ(Ljava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_17

    .line 1819
    .line 1820
    .line 1821
    goto :goto_2d

    .line 1822
    :catchall_17
    move-exception v0

    .line 1823
    const-string v1, "Activity Hook \u5931\u8d25"

    .line 1824
    .line 1825
    invoke-static {v1, v0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1826
    .line 1827
    .line 1828
    :goto_2d
    return-object v2

    .line 1829
    :pswitch_16
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1830
    .line 1831
    sget-object v1, Lx10;->α:Lx10;

    .line 1832
    .line 1833
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1834
    .line 1835
    invoke-virtual {v1, v0}, Lx10;->λ(Ljava/lang/ClassLoader;)V

    .line 1836
    .line 1837
    .line 1838
    goto/16 :goto_7

    .line 1839
    .line 1840
    :pswitch_17
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1841
    .line 1842
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;

    .line 1843
    .line 1844
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1845
    .line 1846
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CmtReplyDetailProbeHook;->init(Ljava/lang/ClassLoader;)V

    .line 1847
    .line 1848
    .line 1849
    goto/16 :goto_7

    .line 1850
    .line 1851
    :pswitch_18
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1852
    .line 1853
    sget-object v1, Lbl;->α:Ljava/util/Set;

    .line 1854
    .line 1855
    const-string v1, "comment_control"

    .line 1856
    .line 1857
    sget-object v4, Lkk;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1858
    .line 1859
    const/4 v11, 0x0

    .line 1860
    invoke-virtual {v4, v11, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1861
    .line 1862
    .line 1863
    move-result v4

    .line 1864
    if-nez v4, :cond_2f

    .line 1865
    .line 1866
    goto :goto_2e

    .line 1867
    :cond_2f
    sget-object v4, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1868
    .line 1869
    new-instance v4, Lwj;

    .line 1870
    .line 1871
    invoke-direct {v4, v3}, Lwj;-><init>(I)V

    .line 1872
    .line 1873
    .line 1874
    invoke-static {v1, v4}, Lrx;->ε(Ljava/lang/String;La80;)V

    .line 1875
    .line 1876
    .line 1877
    new-instance v3, Lwj;

    .line 1878
    .line 1879
    invoke-direct {v3, v2}, Lwj;-><init>(I)V

    .line 1880
    .line 1881
    .line 1882
    invoke-static {v1, v3}, Lrx;->δ(Ljava/lang/String;La80;)V

    .line 1883
    .line 1884
    .line 1885
    :goto_2e
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1886
    .line 1887
    invoke-static {v0}, Lbl;->β(Ljava/lang/ClassLoader;)V

    .line 1888
    .line 1889
    .line 1890
    goto/16 :goto_7

    .line 1891
    .line 1892
    :pswitch_19
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1893
    .line 1894
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1895
    .line 1896
    invoke-static {v0}, Ls1;->ν(Ljava/lang/ClassLoader;)V

    .line 1897
    .line 1898
    .line 1899
    goto/16 :goto_7

    .line 1900
    .line 1901
    :pswitch_1a
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1902
    .line 1903
    sget-object v1, Ls62;->α:Ls62;

    .line 1904
    .line 1905
    sget-object v2, Li10;->α:Li10;

    .line 1906
    .line 1907
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 1908
    .line 1909
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1910
    .line 1911
    .line 1912
    sput-object v0, Li10;->δ:Ljava/lang/ClassLoader;

    .line 1913
    .line 1914
    sget-object v3, Li10;->ζ:Lq00;

    .line 1915
    .line 1916
    sget-object v4, Li10;->ε:Lq00;

    .line 1917
    .line 1918
    sget-object v5, Li10;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1919
    .line 1920
    const/4 v11, 0x0

    .line 1921
    invoke-virtual {v5, v11, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 1922
    .line 1923
    .line 1924
    move-result v0

    .line 1925
    if-nez v0, :cond_30

    .line 1926
    .line 1927
    goto :goto_30

    .line 1928
    :cond_30
    :try_start_1f
    invoke-static {v4}, Lui1;->β(La80;)V

    .line 1929
    .line 1930
    .line 1931
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1932
    .line 1933
    .line 1934
    sget-object v0, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1935
    .line 1936
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_18

    .line 1937
    .line 1938
    .line 1939
    move-object v6, v1

    .line 1940
    goto :goto_2f

    .line 1941
    :catchall_18
    move-exception v0

    .line 1942
    new-instance v6, Leo1;

    .line 1943
    .line 1944
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1945
    .line 1946
    .line 1947
    :goto_2f
    invoke-static {v6}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v0

    .line 1951
    if-eqz v0, :cond_31

    .line 1952
    .line 1953
    const/4 v11, 0x0

    .line 1954
    invoke-virtual {v5, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1955
    .line 1956
    .line 1957
    :try_start_20
    sget-object v5, Lui1;->α:Ljava/lang/Object;

    .line 1958
    .line 1959
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1960
    .line 1961
    .line 1962
    sget-object v5, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1963
    .line 1964
    invoke-virtual {v5, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_19

    .line 1965
    .line 1966
    .line 1967
    :catchall_19
    :try_start_21
    sget-object v4, Lui1;->α:Ljava/lang/Object;

    .line 1968
    .line 1969
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1970
    .line 1971
    .line 1972
    sget-object v4, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1973
    .line 1974
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1a

    .line 1975
    .line 1976
    .line 1977
    :catchall_1a
    const-string v3, "r884b4b855564017b"

    .line 1978
    .line 1979
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v0

    .line 1983
    const-string v4, "\u6ce8\u518c\u914d\u7f6e\u76d1\u542c\u5931\u8d25: "

    .line 1984
    .line 1985
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v0

    .line 1989
    invoke-static {v3, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1990
    .line 1991
    .line 1992
    :cond_31
    :goto_30
    invoke-virtual {v2}, Li10;->γ()V

    .line 1993
    .line 1994
    .line 1995
    return-object v1

    .line 1996
    :pswitch_1b
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 1997
    .line 1998
    sget-object v1, Ls62;->α:Ls62;

    .line 1999
    .line 2000
    sget-object v2, Lht0;->α:Lht0;

    .line 2001
    .line 2002
    const-string v3, "r887cfbb8e325e13c"

    .line 2003
    .line 2004
    const-string v4, "attach-stage \u5df2\u4f7f\u7528\u6700\u7ec8 ClassLoader \u91cd\u8bd5\u5e95\u680f\u53d1\u73b0: "

    .line 2005
    .line 2006
    :try_start_22
    sget-object v5, Lht0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2007
    .line 2008
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 2009
    .line 2010
    .line 2011
    move-result v5

    .line 2012
    if-nez v5, :cond_32

    .line 2013
    .line 2014
    invoke-virtual {v2, v0}, Lht0;->γ(Lz81;)V

    .line 2015
    .line 2016
    .line 2017
    goto :goto_31

    .line 2018
    :catchall_1b
    move-exception v0

    .line 2019
    goto :goto_32

    .line 2020
    :cond_32
    :goto_31
    invoke-static {}, Lht0;->η()V

    .line 2021
    .line 2022
    .line 2023
    iget-object v2, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 2024
    .line 2025
    invoke-static {v2}, Lht0;->ι(Ljava/lang/ClassLoader;)V

    .line 2026
    .line 2027
    .line 2028
    sget-object v2, Lht0;->η:Landroid/os/Handler;

    .line 2029
    .line 2030
    new-instance v5, Lfb0;

    .line 2031
    .line 2032
    const/4 v6, 0x6

    .line 2033
    invoke-direct {v5, v6}, Lfb0;-><init>(I)V

    .line 2034
    .line 2035
    .line 2036
    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 2037
    .line 2038
    .line 2039
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 2040
    .line 2041
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v0

    .line 2045
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v0

    .line 2049
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v0

    .line 2053
    invoke-static {v3, v0, v7, v8, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1b

    .line 2054
    .line 2055
    .line 2056
    move-object v2, v1

    .line 2057
    goto :goto_33

    .line 2058
    :goto_32
    new-instance v2, Leo1;

    .line 2059
    .line 2060
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 2061
    .line 2062
    .line 2063
    :goto_33
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v0

    .line 2067
    if-eqz v0, :cond_33

    .line 2068
    .line 2069
    const-string v2, "attach-stage \u91cd\u8bd5\u6db2\u6001\u73bb\u7483\u5e95\u680f\u5931\u8d25\uff0c\u4fdd\u7559\u5bbf\u4e3b\u539f\u5e95\u680f"

    .line 2070
    .line 2071
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2072
    .line 2073
    .line 2074
    :cond_33
    return-object v1

    .line 2075
    :pswitch_1c
    iget-object v0, v0, Lve0;->ζ:Lz81;

    .line 2076
    .line 2077
    sget-object v1, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;

    .line 2078
    .line 2079
    iget-object v0, v0, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 2080
    .line 2081
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentRouterTraceHook;->init(Ljava/lang/ClassLoader;)V

    .line 2082
    .line 2083
    .line 2084
    goto/16 :goto_7

    .line 2085
    .line 2086
    nop

    .line 2087
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
