.class public final Lnd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final Α:Landroid/app/AlertDialog;

.field public final Β:Ljava/util/LinkedHashSet;

.field public final Γ:Ljava/util/LinkedHashSet;

.field public Δ:Lad0;

.field public Ε:Ljava/lang/String;

.field public Ζ:Z

.field public Η:Ljava/lang/String;

.field public Θ:Ljava/util/List;

.field public Ι:Lnt;

.field public final α:Landroid/app/Activity;

.field public final β:Lfi;

.field public final γ:Landroid/os/Handler;

.field public final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ε:Ljava/lang/ClassLoader;

.field public final ζ:Landroid/view/View;

.field public final η:Landroid/view/View;

.field public final θ:Landroid/widget/TextView;

.field public final ι:Landroid/widget/TextView;

.field public final κ:Landroid/widget/TextView;

.field public final λ:Landroid/view/View;

.field public final μ:Landroid/widget/TextView;

.field public final ν:Landroid/widget/TextView;

.field public final ξ:Landroid/view/View;

.field public final ο:Landroid/widget/EditText;

.field public final π:Landroid/widget/ProgressBar;

.field public final ρ:Landroid/widget/TextView;

.field public final σ:Landroid/widget/ListView;

.field public final τ:Landroid/view/View;

.field public final υ:Landroid/widget/TextView;

.field public final φ:Landroid/widget/Button;

.field public final χ:Landroid/widget/Button;

.field public final ψ:Landroid/widget/TextView;

.field public final ω:Lzc0;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lfi;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lnd0;->α:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lnd0;->β:Lfi;

    .line 10
    .line 11
    new-instance p2, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lnd0;->γ:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const/4 v1, 0x0

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    iput-object p2, p0, Lnd0;->ε:Ljava/lang/ClassLoader;

    .line 42
    .line 43
    sget-object p2, Lx01;->α:Lx01;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const v2, 0x7f0c0029

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v2, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, p0, Lnd0;->ζ:Landroid/view/View;

    .line 57
    .line 58
    const v0, 0x7f09016f

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lnd0;->η:Landroid/view/View;

    .line 66
    .line 67
    const v0, 0x7f09017f

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/widget/TextView;

    .line 75
    .line 76
    iput-object v0, p0, Lnd0;->θ:Landroid/widget/TextView;

    .line 77
    .line 78
    const v0, 0x7f09016b

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroid/widget/TextView;

    .line 86
    .line 87
    iput-object v0, p0, Lnd0;->ι:Landroid/widget/TextView;

    .line 88
    .line 89
    const v0, 0x7f09016c

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Landroid/widget/TextView;

    .line 97
    .line 98
    iput-object v0, p0, Lnd0;->κ:Landroid/widget/TextView;

    .line 99
    .line 100
    const v0, 0x7f09017e

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lnd0;->λ:Landroid/view/View;

    .line 108
    .line 109
    const v0, 0x7f09017c

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Landroid/widget/TextView;

    .line 117
    .line 118
    iput-object v0, p0, Lnd0;->μ:Landroid/widget/TextView;

    .line 119
    .line 120
    const v0, 0x7f09017d

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Landroid/widget/TextView;

    .line 128
    .line 129
    iput-object v0, p0, Lnd0;->ν:Landroid/widget/TextView;

    .line 130
    .line 131
    const v0, 0x7f09017a

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, p0, Lnd0;->ξ:Landroid/view/View;

    .line 139
    .line 140
    const v0, 0x7f090179

    .line 141
    .line 142
    .line 143
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Landroid/widget/EditText;

    .line 148
    .line 149
    iput-object v0, p0, Lnd0;->ο:Landroid/widget/EditText;

    .line 150
    .line 151
    const v0, 0x7f090177

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroid/widget/ProgressBar;

    .line 159
    .line 160
    iput-object v0, p0, Lnd0;->π:Landroid/widget/ProgressBar;

    .line 161
    .line 162
    const v0, 0x7f09017b

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Landroid/widget/TextView;

    .line 170
    .line 171
    iput-object v0, p0, Lnd0;->ρ:Landroid/widget/TextView;

    .line 172
    .line 173
    const v0, 0x7f090174

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Landroid/widget/ListView;

    .line 181
    .line 182
    iput-object v0, p0, Lnd0;->σ:Landroid/widget/ListView;

    .line 183
    .line 184
    const v0, 0x7f090175

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iput-object v0, p0, Lnd0;->τ:Landroid/view/View;

    .line 192
    .line 193
    const v0, 0x7f09016d

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Landroid/widget/TextView;

    .line 201
    .line 202
    iput-object v0, p0, Lnd0;->υ:Landroid/widget/TextView;

    .line 203
    .line 204
    const v0, 0x7f090176

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Landroid/widget/Button;

    .line 212
    .line 213
    iput-object v0, p0, Lnd0;->φ:Landroid/widget/Button;

    .line 214
    .line 215
    const v0, 0x7f09016a

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroid/widget/Button;

    .line 223
    .line 224
    iput-object v0, p0, Lnd0;->χ:Landroid/widget/Button;

    .line 225
    .line 226
    const v0, 0x7f09016e

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Landroid/widget/TextView;

    .line 234
    .line 235
    iput-object v0, p0, Lnd0;->ψ:Landroid/widget/TextView;

    .line 236
    .line 237
    new-instance v0, Lzc0;

    .line 238
    .line 239
    invoke-direct {v0, p1}, Lzc0;-><init>(Landroid/app/Activity;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Lnd0;->ω:Lzc0;

    .line 243
    .line 244
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 245
    .line 246
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    iput-object p1, p0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 258
    .line 259
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 260
    .line 261
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 262
    .line 263
    .line 264
    iput-object p1, p0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 265
    .line 266
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 267
    .line 268
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 269
    .line 270
    .line 271
    iput-object p1, p0, Lnd0;->Γ:Ljava/util/LinkedHashSet;

    .line 272
    .line 273
    sget-object p1, Lad0;->ε:Lad0;

    .line 274
    .line 275
    iput-object p1, p0, Lnd0;->Δ:Lad0;

    .line 276
    .line 277
    const-string p1, ""

    .line 278
    .line 279
    iput-object p1, p0, Lnd0;->Ε:Ljava/lang/String;

    .line 280
    .line 281
    const/4 p2, 0x1

    .line 282
    iput-boolean p2, p0, Lnd0;->Ζ:Z

    .line 283
    .line 284
    iput-object p1, p0, Lnd0;->Η:Ljava/lang/String;

    .line 285
    .line 286
    sget-object p1, Ljz;->ε:Ljz;

    .line 287
    .line 288
    iput-object p1, p0, Lnd0;->Θ:Ljava/util/List;

    .line 289
    .line 290
    return-void

    .line 291
    :cond_0
    const-string p0, "\u5bbf\u4e3b ClassLoader \u4e0d\u53ef\u7528"

    .line 292
    .line 293
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v1
.end method

.method public static ζ(Ljava/util/List;)V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lth0;

    .line 21
    .line 22
    sget-object v2, Lvh0;->α:Lvh0;

    .line 23
    .line 24
    iget-object v2, v1, Lth0;->α:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Lvh0;->ν(Ljava/lang/String;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    cmp-long v4, v2, v4

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    if-gtz v4, :cond_1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_1
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    sget-object v4, Lst;->α:Lst;

    .line 43
    .line 44
    invoke-virtual {v1}, Lth0;->α()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v2, v3, v4}, Lst;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v4, "UID: "

    .line 57
    .line 58
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    iget-object v1, v1, Lth0;->α:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v5, v2

    .line 84
    :cond_3
    :goto_1
    if-nez v5, :cond_4

    .line 85
    .line 86
    const-string v5, ""

    .line 87
    .line 88
    :cond_4
    move-object v13, v5

    .line 89
    new-instance v6, Lxd0;

    .line 90
    .line 91
    const-string v12, ""

    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    const-string v10, ""

    .line 98
    .line 99
    const-string v11, ""

    .line 100
    .line 101
    invoke-direct/range {v6 .. v13}, Lxd0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    move-object v5, v6

    .line 105
    :goto_2
    if-eqz v5, :cond_0

    .line 106
    .line 107
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    sget-object p0, Lxc0;->α:Lxc0;

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Lxc0;->δ(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public static θ(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    const/16 p0, 0xa

    .line 16
    .line 17
    const/16 v1, 0x20

    .line 18
    .line 19
    invoke-virtual {v0, p0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/16 v0, 0xd

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/16 v0, 0x78

    .line 36
    .line 37
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final α(Lxd0;)V
    .locals 5

    .line 1
    sget-object v0, Lbe0;->α:Lbe0;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const/16 v3, 0x1f

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {p1, v4, v1, v2, v3}, Lxd0;->α(Lxd0;Ljava/lang/String;JI)Lxd0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lbe0;->α(Lxd0;)Lyd0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v1, p0, Lnd0;->α:Landroid/app/Activity;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz p1, :cond_3

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-eq p1, v3, :cond_3

    .line 29
    .line 30
    const/4 p0, 0x4

    .line 31
    if-eq p1, p0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x5

    .line 34
    if-eq p1, p0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x7

    .line 37
    if-eq p1, p0, :cond_0

    .line 38
    .line 39
    const-string p0, "\u8054\u7cfb\u4eba\u8eab\u4efd\u65e0\u6548"

    .line 40
    .line 41
    invoke-static {v1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "\u9690\u85cf\u540d\u5355\u4fdd\u5b58\u5931\u8d25"

    .line 50
    .line 51
    invoke-static {v1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const-string p0, "\u5f53\u524d\u8d26\u53f7\u5c1a\u672a\u8bc6\u522b"

    .line 60
    .line 61
    invoke-static {v1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    const-string p0, "\u8be5\u8054\u7cfb\u4eba\u5df2\u5728\u540d\u5355\u4e2d"

    .line 70
    .line 71
    invoke-static {v1, p0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    invoke-virtual {v0}, Lbe0;->ζ()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    const-string p1, "\u5df2\u52a0\u5165\u9690\u85cf\u540d\u5355"

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    const-string p1, "\u5df2\u52a0\u5165\u540d\u5355\uff0c\u5f00\u542f\u603b\u5f00\u5173\u540e\u751f\u6548"

    .line 89
    .line 90
    :goto_0
    invoke-static {v1, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lnd0;->η()V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final β(Landroid/app/AlertDialog;Landroid/widget/EditText;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {p0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Lxx;->η:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, v0, Lxx;->ζ:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v4, v0, Lxx;->γ:Ljava/lang/String;

    .line 18
    .line 19
    const/16 v5, 0x10

    .line 20
    .line 21
    invoke-static {v5, p0, v4}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v3, v4}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    const v3, 0x1020016

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const v3, 0x102000b

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Landroid/widget/TextView;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 62
    .line 63
    .line 64
    :cond_2
    const/4 v3, -0x1

    .line 65
    invoke-virtual {p1, v3}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    iget-object v4, v0, Lxx;->ι:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    :cond_3
    const/4 v3, -0x2

    .line 81
    invoke-virtual {p1, v3}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 92
    .line 93
    .line 94
    :cond_4
    if-eqz p2, :cond_5

    .line 95
    .line 96
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 101
    .line 102
    .line 103
    iget-object p1, v0, Lxx;->θ:Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v0, Lxx;->χ:Ljava/lang/String;

    .line 113
    .line 114
    const/16 v0, 0x8

    .line 115
    .line 116
    invoke-static {v0, p0, p1}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p2, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    return-void
.end method

.method public final γ(Lpt;)V
    .locals 9

    .line 1
    sget-object v0, Lst;->α:Lst;

    .line 2
    .line 3
    iget-object v0, p1, Lpt;->β:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v1, p1, Lpt;->α:J

    .line 6
    .line 7
    invoke-static {v1, v2, v0}, Lst;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_6

    .line 12
    .line 13
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lxc0;->α:Lxc0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lxc0;->γ()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v3, 0x0

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    move-object v4, v2

    .line 56
    check-cast v4, Lxd0;

    .line 57
    .line 58
    iget-object v4, v4, Lxd0;->α:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v4, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v2, v3

    .line 68
    :goto_0
    check-cast v2, Lxd0;

    .line 69
    .line 70
    const/16 v1, 0x2f

    .line 71
    .line 72
    const-wide/16 v4, 0x0

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    sget-object v6, Lxc0;->α:Lxc0;

    .line 77
    .line 78
    invoke-static {v2, p1, v4, v5, v1}, Lxd0;->α(Lxd0;Ljava/lang/String;JI)Lxd0;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v6, v2}, Lxc0;->δ(Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    sget-object v2, Lbe0;->α:Lbe0;

    .line 90
    .line 91
    invoke-virtual {v2}, Lbe0;->ξ()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    move-object v7, v6

    .line 110
    check-cast v7, Lxd0;

    .line 111
    .line 112
    iget-object v8, v7, Lxd0;->α:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v8, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_4

    .line 119
    .line 120
    iget-object v7, v7, Lxd0;->ε:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v7, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_4

    .line 127
    .line 128
    move-object v3, v6

    .line 129
    :cond_5
    check-cast v3, Lxd0;

    .line 130
    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    sget-object v0, Lbe0;->α:Lbe0;

    .line 134
    .line 135
    invoke-static {v3, p1, v4, v5, v1}, Lxd0;->α(Lxd0;Ljava/lang/String;JI)Lxd0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {v0, p1}, Lbe0;->α(Lxd0;)Lyd0;

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_1
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final δ(Lp70;)V
    .locals 2

    .line 1
    new-instance v0, Lw1;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, p0, v1, p1}, Lw1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lnd0;->γ:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ε()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lbe0;->α:Lbe0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lbe0;->ξ()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lnd0;->Δ:Lad0;

    .line 10
    .line 11
    sget-object v3, Lad0;->ε:Lad0;

    .line 12
    .line 13
    if-ne v2, v3, :cond_5

    .line 14
    .line 15
    sget-object v2, Lxc0;->α:Lxc0;

    .line 16
    .line 17
    invoke-virtual {v2}, Lxc0;->γ()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_6

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    move-object v6, v5

    .line 41
    check-cast v6, Lxd0;

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    if-eqz v8, :cond_4

    .line 59
    .line 60
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    check-cast v8, Lxd0;

    .line 65
    .line 66
    iget-object v9, v8, Lxd0;->α:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v10, v8, Lxd0;->β:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-lez v9, :cond_3

    .line 75
    .line 76
    iget-object v8, v8, Lxd0;->α:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v9, v6, Lxd0;->α:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-nez v8, :cond_0

    .line 85
    .line 86
    :cond_3
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-lez v8, :cond_2

    .line 91
    .line 92
    iget-object v8, v6, Lxd0;->β:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v10, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_2

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    :goto_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    move-object v4, v1

    .line 106
    :cond_6
    iget-object v2, v0, Lnd0;->Ε:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 117
    .line 118
    invoke-static {v5, v2, v5}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    const/4 v6, 0x0

    .line 127
    if-nez v5, :cond_7

    .line 128
    .line 129
    move-object v5, v4

    .line 130
    goto :goto_3

    .line 131
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    :cond_8
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_9

    .line 145
    .line 146
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    move-object v9, v8

    .line 151
    check-cast v9, Lxd0;

    .line 152
    .line 153
    iget-object v10, v9, Lxd0;->ε:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v11, v9, Lxd0;->γ:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v12, v9, Lxd0;->δ:Ljava/lang/String;

    .line 158
    .line 159
    iget-object v13, v9, Lxd0;->α:Ljava/lang/String;

    .line 160
    .line 161
    iget-object v9, v9, Lxd0;->β:Ljava/lang/String;

    .line 162
    .line 163
    filled-new-array {v10, v11, v12, v13, v9}, [Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-static {v9}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x3e

    .line 173
    .line 174
    const-string v11, " "

    .line 175
    .line 176
    const/4 v12, 0x0

    .line 177
    const/4 v13, 0x0

    .line 178
    const/4 v14, 0x0

    .line 179
    invoke-static/range {v10 .. v16}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 184
    .line 185
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-static {v9, v2, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 196
    .line 197
    .line 198
    move-result v9

    .line 199
    if-eqz v9, :cond_8

    .line 200
    .line 201
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_9
    :goto_3
    iput-object v5, v0, Lnd0;->Θ:Ljava/util/List;

    .line 206
    .line 207
    iget-object v7, v0, Lnd0;->Δ:Lad0;

    .line 208
    .line 209
    iget-object v8, v0, Lnd0;->ω:Lzc0;

    .line 210
    .line 211
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    iput-object v5, v8, Lzc0;->η:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v7, v8, Lzc0;->θ:Ljava/io/Serializable;

    .line 224
    .line 225
    invoke-virtual {v8}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 226
    .line 227
    .line 228
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    iget-object v7, v0, Lnd0;->β:Lfi;

    .line 237
    .line 238
    invoke-virtual {v7, v5}, Lfi;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    sget-object v5, Lx01;->α:Lx01;

    .line 242
    .line 243
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    iget-object v8, v0, Lnd0;->α:Landroid/app/Activity;

    .line 256
    .line 257
    const v9, 0x7f0f0048

    .line 258
    .line 259
    .line 260
    invoke-virtual {v5, v8, v9, v7}, Lx01;->η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    iget-object v7, v0, Lnd0;->κ:Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    .line 268
    .line 269
    iget-object v5, v0, Lnd0;->Δ:Lad0;

    .line 270
    .line 271
    const/16 v7, 0x8

    .line 272
    .line 273
    if-ne v5, v3, :cond_a

    .line 274
    .line 275
    move v5, v6

    .line 276
    goto :goto_4

    .line 277
    :cond_a
    move v5, v7

    .line 278
    :goto_4
    iget-object v8, v0, Lnd0;->φ:Landroid/widget/Button;

    .line 279
    .line 280
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 281
    .line 282
    .line 283
    iget-object v5, v0, Lnd0;->Δ:Lad0;

    .line 284
    .line 285
    sget-object v8, Lad0;->ζ:Lad0;

    .line 286
    .line 287
    if-ne v5, v8, :cond_b

    .line 288
    .line 289
    move v5, v6

    .line 290
    goto :goto_5

    .line 291
    :cond_b
    move v5, v7

    .line 292
    :goto_5
    iget-object v9, v0, Lnd0;->χ:Landroid/widget/Button;

    .line 293
    .line 294
    invoke-virtual {v9, v5}, Landroid/view/View;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    const/4 v5, 0x1

    .line 302
    xor-int/2addr v1, v5

    .line 303
    invoke-virtual {v9, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 304
    .line 305
    .line 306
    iget-boolean v1, v0, Lnd0;->Ζ:Z

    .line 307
    .line 308
    iget-object v9, v0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 309
    .line 310
    if-nez v1, :cond_d

    .line 311
    .line 312
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-nez v1, :cond_c

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_c
    move v5, v6

    .line 320
    :cond_d
    :goto_6
    if-eqz v5, :cond_e

    .line 321
    .line 322
    move v1, v6

    .line 323
    goto :goto_7

    .line 324
    :cond_e
    move v1, v7

    .line 325
    :goto_7
    iget-object v10, v0, Lnd0;->π:Landroid/widget/ProgressBar;

    .line 326
    .line 327
    invoke-virtual {v10, v1}, Landroid/view/View;->setVisibility(I)V

    .line 328
    .line 329
    .line 330
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    iget-object v4, v0, Lnd0;->Θ:Ljava/util/List;

    .line 335
    .line 336
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    iget-boolean v10, v0, Lnd0;->Ζ:Z

    .line 341
    .line 342
    if-eqz v10, :cond_f

    .line 343
    .line 344
    if-nez v1, :cond_f

    .line 345
    .line 346
    const-string v1, "\u6b63\u5728\u8bfb\u53d6\u8054\u7cfb\u4eba\u548c\u4f1a\u8bdd\u76ee\u5f55\u2026"

    .line 347
    .line 348
    goto/16 :goto_8

    .line 349
    .line 350
    :cond_f
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 351
    .line 352
    .line 353
    move-result v10

    .line 354
    if-nez v10, :cond_10

    .line 355
    .line 356
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    const-string v4, "\u6b63\u5728\u5c06 "

    .line 361
    .line 362
    const-string v8, " \u4e2a UID \u8f6c\u6362\u4e3a\u540d\u79f0\u2026"

    .line 363
    .line 364
    invoke-static {v4, v1, v8}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    goto :goto_8

    .line 369
    :cond_10
    if-eqz v5, :cond_11

    .line 370
    .line 371
    const-string v1, "\u6b63\u5728\u5237\u65b0\u8054\u7cfb\u4eba\u2026"

    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 375
    .line 376
    .line 377
    move-result v9

    .line 378
    const-string v10, " \u4eba"

    .line 379
    .line 380
    if-lez v9, :cond_12

    .line 381
    .line 382
    const-string v8, "\u5339\u914d "

    .line 383
    .line 384
    const-string v9, " / "

    .line 385
    .line 386
    invoke-static {v8, v4, v9, v1, v10}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    goto :goto_8

    .line 391
    :cond_12
    iget-object v4, v0, Lnd0;->Δ:Lad0;

    .line 392
    .line 393
    if-ne v4, v3, :cond_13

    .line 394
    .line 395
    if-lez v1, :cond_13

    .line 396
    .line 397
    const-string v4, "\u53ef\u6dfb\u52a0 "

    .line 398
    .line 399
    invoke-static {v4, v1, v10}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    goto :goto_8

    .line 404
    :cond_13
    if-ne v4, v8, :cond_14

    .line 405
    .line 406
    if-lez v1, :cond_14

    .line 407
    .line 408
    const-string v4, "\u5df2\u9690\u85cf "

    .line 409
    .line 410
    const-string v8, " \u4eba\uff0c\u70b9\u51fb\u53ef\u6062\u590d\u663e\u793a"

    .line 411
    .line 412
    invoke-static {v4, v1, v8}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    goto :goto_8

    .line 417
    :cond_14
    iget-object v1, v0, Lnd0;->Η:Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 420
    .line 421
    .line 422
    move-result v1

    .line 423
    if-nez v1, :cond_15

    .line 424
    .line 425
    iget-object v1, v0, Lnd0;->Δ:Lad0;

    .line 426
    .line 427
    if-ne v1, v3, :cond_15

    .line 428
    .line 429
    iget-object v1, v0, Lnd0;->Η:Ljava/lang/String;

    .line 430
    .line 431
    const-string v4, "\u8054\u7cfb\u4eba\u52a0\u8f7d\u4e0d\u5b8c\u6574\uff1a"

    .line 432
    .line 433
    invoke-static {v4, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    goto :goto_8

    .line 438
    :cond_15
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_16

    .line 447
    .line 448
    const-string v1, "\u5c1a\u672a\u8bc6\u522b\u5f53\u524d\u6296\u97f3\u8d26\u53f7"

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_16
    iget-object v1, v0, Lnd0;->Δ:Lad0;

    .line 452
    .line 453
    if-ne v1, v3, :cond_17

    .line 454
    .line 455
    const-string v1, "\u6682\u65e0\u5019\u9009\u8054\u7cfb\u4eba"

    .line 456
    .line 457
    goto :goto_8

    .line 458
    :cond_17
    const-string v1, "\u5f53\u524d\u6ca1\u6709\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 459
    .line 460
    :goto_8
    iget-object v4, v0, Lnd0;->ρ:Landroid/widget/TextView;

    .line 461
    .line 462
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 463
    .line 464
    .line 465
    if-eqz v5, :cond_18

    .line 466
    .line 467
    iget-object v1, v0, Lnd0;->Θ:Ljava/util/List;

    .line 468
    .line 469
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_18

    .line 474
    .line 475
    const-string v1, "\u6b63\u5728\u52a0\u8f7d\u8054\u7cfb\u4eba\u2026"

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_18
    iget-object v1, v0, Lnd0;->Δ:Lad0;

    .line 479
    .line 480
    if-ne v1, v3, :cond_19

    .line 481
    .line 482
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    if-lez v1, :cond_19

    .line 487
    .line 488
    const-string v1, "\u6ca1\u6709\u5339\u914d\u7684\u53ef\u6dfb\u52a0\u8054\u7cfb\u4eba"

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_19
    iget-object v1, v0, Lnd0;->Δ:Lad0;

    .line 492
    .line 493
    if-ne v1, v3, :cond_1a

    .line 494
    .line 495
    const-string v1, "\u6682\u65e0\u5019\u9009\u8054\u7cfb\u4eba\n\u53ef\u4f7f\u7528\u4e0b\u65b9\u6309\u94ae\u8f93\u5165\u6570\u5b57 UID"

    .line 496
    .line 497
    goto :goto_9

    .line 498
    :cond_1a
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-lez v1, :cond_1b

    .line 503
    .line 504
    const-string v1, "\u540d\u5355\u4e2d\u6ca1\u6709\u5339\u914d\u8054\u7cfb\u4eba"

    .line 505
    .line 506
    goto :goto_9

    .line 507
    :cond_1b
    const-string v1, "\u5f53\u524d\u8d26\u53f7\u6ca1\u6709\u9690\u85cf\u8054\u7cfb\u4eba"

    .line 508
    .line 509
    :goto_9
    iget-object v2, v0, Lnd0;->υ:Landroid/widget/TextView;

    .line 510
    .line 511
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 512
    .line 513
    .line 514
    iget-object v1, v0, Lnd0;->Θ:Ljava/util/List;

    .line 515
    .line 516
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 517
    .line 518
    .line 519
    move-result v1

    .line 520
    if-eqz v1, :cond_1c

    .line 521
    .line 522
    move v1, v6

    .line 523
    goto :goto_a

    .line 524
    :cond_1c
    move v1, v7

    .line 525
    :goto_a
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 526
    .line 527
    .line 528
    iget-object v1, v0, Lnd0;->Θ:Ljava/util/List;

    .line 529
    .line 530
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    if-eqz v1, :cond_1d

    .line 535
    .line 536
    move v6, v7

    .line 537
    :cond_1d
    iget-object v0, v0, Lnd0;->σ:Landroid/widget/ListView;

    .line 538
    .line 539
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 540
    .line 541
    .line 542
    return-void
.end method

.method public final η()V
    .locals 4

    .line 1
    sget-object v0, Lbe0;->α:Lbe0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbe0;->ξ()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lxc0;->α:Lxc0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lxc0;->γ()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Lf7;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lzb0;

    .line 24
    .line 25
    const/4 v2, 0x5

    .line 26
    invoke-direct {v0, v2}, Lzb0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Ly30;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v2, v1, v3, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lzb0;

    .line 36
    .line 37
    const/4 v1, 0x6

    .line 38
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lbd0;

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-direct {v1, p0, v2}, Lbd0;-><init>(Lnd0;I)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ly30;

    .line 52
    .line 53
    invoke-direct {v2, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lus1;->υ(Lss1;)Lcu;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    iget-object v1, p0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    invoke-static {v1, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 77
    .line 78
    .line 79
    sget-object v1, Lst;->α:Lst;

    .line 80
    .line 81
    iget-object v2, p0, Lnd0;->ε:Ljava/lang/ClassLoader;

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Lst;->σ(Ljava/lang/ClassLoader;)V

    .line 84
    .line 85
    .line 86
    sget-object v1, Lpd0;->α:Ljava/util/concurrent/ExecutorService;

    .line 87
    .line 88
    new-instance v2, Lfd0;

    .line 89
    .line 90
    invoke-direct {v2, v0, p0}, Lfd0;-><init>(Ljava/util/List;Lnd0;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Lfd0;

    .line 97
    .line 98
    invoke-direct {v1, p0, v0}, Lfd0;-><init>(Lnd0;Ljava/util/List;)V

    .line 99
    .line 100
    .line 101
    const-wide/16 v2, 0x2ee0

    .line 102
    .line 103
    iget-object p0, p0, Lnd0;->γ:Landroid/os/Handler;

    .line 104
    .line 105
    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final ι()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lbe0;->α:Lbe0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lbe0;->δ()V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lkd0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lkd0;-><init>(Lnd0;I)V

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, Lnd0;->ι:Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lkd0;

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    invoke-direct {v1, v0, v4}, Lkd0;-><init>(Lnd0;I)V

    .line 23
    .line 24
    .line 25
    iget-object v5, v0, Lnd0;->μ:Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v5, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lkd0;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    invoke-direct {v1, v0, v5}, Lkd0;-><init>(Lnd0;I)V

    .line 34
    .line 35
    .line 36
    iget-object v6, v0, Lnd0;->ν:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {v6, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Lkd0;

    .line 42
    .line 43
    const/4 v6, 0x3

    .line 44
    invoke-direct {v1, v0, v6}, Lkd0;-><init>(Lnd0;I)V

    .line 45
    .line 46
    .line 47
    iget-object v7, v0, Lnd0;->φ:Landroid/widget/Button;

    .line 48
    .line 49
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    new-instance v1, Lkd0;

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    invoke-direct {v1, v0, v8}, Lkd0;-><init>(Lnd0;I)V

    .line 56
    .line 57
    .line 58
    iget-object v8, v0, Lnd0;->χ:Landroid/widget/Button;

    .line 59
    .line 60
    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lld0;

    .line 64
    .line 65
    invoke-direct {v1, v2, v0}, Lld0;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v9, v0, Lnd0;->σ:Landroid/widget/ListView;

    .line 69
    .line 70
    invoke-virtual {v9, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Lmd0;

    .line 74
    .line 75
    invoke-direct {v1, v2, v0}, Lmd0;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v10, v0, Lnd0;->ο:Landroid/widget/EditText;

    .line 79
    .line 80
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setShowSoftInputOnFocus(Z)V

    .line 84
    .line 85
    .line 86
    new-instance v1, Ltj;

    .line 87
    .line 88
    invoke-direct {v1, v4, v0}, Ltj;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v10, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 92
    .line 93
    .line 94
    new-instance v1, Lkd0;

    .line 95
    .line 96
    const/4 v11, 0x5

    .line 97
    invoke-direct {v1, v0, v11}, Lkd0;-><init>(Lnd0;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, v0, Lnd0;->α:Landroid/app/Activity;

    .line 104
    .line 105
    invoke-static {v1}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    iget-object v12, v11, Lxx;->β:Ljava/lang/String;

    .line 110
    .line 111
    const/16 v13, 0x10

    .line 112
    .line 113
    invoke-static {v13, v1, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 114
    .line 115
    .line 116
    move-result-object v12

    .line 117
    iget-object v13, v0, Lnd0;->ζ:Landroid/view/View;

    .line 118
    .line 119
    invoke-virtual {v13, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 120
    .line 121
    .line 122
    iget-object v12, v11, Lxx;->γ:Ljava/lang/String;

    .line 123
    .line 124
    const/16 v13, 0xa

    .line 125
    .line 126
    invoke-static {v13, v1, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    iget-object v15, v0, Lnd0;->η:Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {v15, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 133
    .line 134
    .line 135
    iget-object v14, v0, Lnd0;->λ:Landroid/view/View;

    .line 136
    .line 137
    invoke-static {v13, v1, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 138
    .line 139
    .line 140
    move-result-object v15

    .line 141
    invoke-virtual {v14, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    const/16 v14, 0xc

    .line 145
    .line 146
    invoke-static {v14, v1, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    iget-object v5, v0, Lnd0;->ξ:Landroid/view/View;

    .line 151
    .line 152
    invoke-virtual {v5, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 153
    .line 154
    .line 155
    iget-object v5, v0, Lnd0;->τ:Landroid/view/View;

    .line 156
    .line 157
    invoke-static {v14, v1, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    invoke-virtual {v5, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v5

    .line 168
    invoke-virtual {v9, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 169
    .line 170
    .line 171
    iget-object v5, v11, Lxx;->ζ:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    iget-object v14, v0, Lnd0;->θ:Landroid/widget/TextView;

    .line 178
    .line 179
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    .line 181
    .line 182
    iget-object v12, v11, Lxx;->η:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    invoke-virtual {v3, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 189
    .line 190
    .line 191
    iget-object v3, v11, Lxx;->λ:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    iget-object v15, v0, Lnd0;->κ:Landroid/widget/TextView;

    .line 198
    .line 199
    invoke-virtual {v15, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 200
    .line 201
    .line 202
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setTextColor(I)V

    .line 207
    .line 208
    .line 209
    iget-object v14, v11, Lxx;->θ:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    invoke-virtual {v10, v14}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 216
    .line 217
    .line 218
    iget-object v14, v11, Lxx;->χ:Ljava/lang/String;

    .line 219
    .line 220
    const/16 v6, 0x8

    .line 221
    .line 222
    invoke-static {v6, v1, v14}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v10, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 227
    .line 228
    .line 229
    iget-object v6, v0, Lnd0;->ρ:Landroid/widget/TextView;

    .line 230
    .line 231
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 236
    .line 237
    .line 238
    iget-object v6, v0, Lnd0;->υ:Landroid/widget/TextView;

    .line 239
    .line 240
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 245
    .line 246
    .line 247
    iget-object v6, v11, Lxx;->Β:Ljava/lang/String;

    .line 248
    .line 249
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    iget-object v10, v0, Lnd0;->ψ:Landroid/widget/TextView;

    .line 254
    .line 255
    invoke-virtual {v10, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 256
    .line 257
    .line 258
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 259
    .line 260
    iget-object v10, v11, Lxx;->δ:Ljava/lang/String;

    .line 261
    .line 262
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    invoke-direct {v6, v10}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v6}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v4}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v2}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 276
    .line 277
    .line 278
    iget-object v6, v11, Lxx;->Α:Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {v6}, Ljx0;->Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 281
    .line 282
    .line 283
    move-result-object v10

    .line 284
    invoke-virtual {v9, v10}, Landroid/widget/AbsListView;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    iget-object v10, v0, Lnd0;->π:Landroid/widget/ProgressBar;

    .line 296
    .line 297
    invoke-virtual {v10, v3}, Landroid/widget/ProgressBar;->setIndeterminateTintList(Landroid/content/res/ColorStateList;)V

    .line 298
    .line 299
    .line 300
    iget-object v3, v11, Lxx;->μ:Ljava/lang/String;

    .line 301
    .line 302
    const/16 v10, 0x63

    .line 303
    .line 304
    invoke-static {v10, v1, v3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-virtual {v15, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 309
    .line 310
    .line 311
    iget-object v3, v11, Lxx;->ι:Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v13, v1, v6, v3}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v7, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 318
    .line 319
    .line 320
    const-string v3, "#FFFFFF"

    .line 321
    .line 322
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 327
    .line 328
    .line 329
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 334
    .line 335
    .line 336
    invoke-static {v13, v1, v6, v14}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-virtual {v8, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Lnd0;->μ()V

    .line 344
    .line 345
    .line 346
    sget-object v3, Lst;->α:Lst;

    .line 347
    .line 348
    new-instance v3, Lbd0;

    .line 349
    .line 350
    invoke-direct {v3, v0, v2}, Lbd0;-><init>(Lnd0;I)V

    .line 351
    .line 352
    .line 353
    sget-object v5, Lst;->μ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 354
    .line 355
    invoke-virtual {v5, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    new-instance v5, Lnt;

    .line 359
    .line 360
    invoke-direct {v5, v3, v2}, Lnt;-><init>(La80;I)V

    .line 361
    .line 362
    .line 363
    iput-object v5, v0, Lnd0;->Ι:Lnt;

    .line 364
    .line 365
    iget-object v3, v0, Lnd0;->ω:Lzc0;

    .line 366
    .line 367
    invoke-virtual {v9, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 368
    .line 369
    .line 370
    new-instance v3, Lvg;

    .line 371
    .line 372
    const/4 v5, 0x3

    .line 373
    invoke-direct {v3, v5, v0}, Lvg;-><init>(ILjava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    iget-object v5, v0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 377
    .line 378
    invoke-virtual {v5, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5}, Landroid/app/Dialog;->show()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    if-eqz v3, :cond_0

    .line 389
    .line 390
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 391
    .line 392
    invoke-direct {v5, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 396
    .line 397
    .line 398
    const/high16 v5, 0x3f000000    # 0.5f

    .line 399
    .line 400
    invoke-virtual {v3, v5}, Landroid/view/Window;->setDimAmount(F)V

    .line 401
    .line 402
    .line 403
    const/4 v5, 0x2

    .line 404
    invoke-virtual {v3, v5}, Landroid/view/Window;->addFlags(I)V

    .line 405
    .line 406
    .line 407
    const/high16 v5, 0x20000

    .line 408
    .line 409
    invoke-virtual {v3, v5}, Landroid/view/Window;->clearFlags(I)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v3, v4}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    iget v4, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 424
    .line 425
    int-to-float v4, v4

    .line 426
    const v5, 0x3f70a3d7    # 0.94f

    .line 427
    .line 428
    .line 429
    mul-float/2addr v4, v5

    .line 430
    float-to-int v4, v4

    .line 431
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 440
    .line 441
    int-to-float v1, v1

    .line 442
    const v5, 0x3f5c28f6    # 0.86f

    .line 443
    .line 444
    .line 445
    mul-float/2addr v1, v5

    .line 446
    float-to-int v1, v1

    .line 447
    invoke-virtual {v3, v4, v1}, Landroid/view/Window;->setLayout(II)V

    .line 448
    .line 449
    .line 450
    :cond_0
    invoke-virtual {v0}, Lnd0;->ε()V

    .line 451
    .line 452
    .line 453
    sget-object v1, Lpd0;->α:Ljava/util/concurrent/ExecutorService;

    .line 454
    .line 455
    new-instance v3, Lhd0;

    .line 456
    .line 457
    invoke-direct {v3, v0, v2}, Lhd0;-><init>(Lnd0;I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 461
    .line 462
    .line 463
    return-void
.end method

.method public final κ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lnd0;->Α:Landroid/app/AlertDialog;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/high16 v1, 0x20000

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    new-instance v0, Lhd0;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, p0, v1}, Lhd0;-><init>(Lnd0;I)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lnd0;->ο:Landroid/widget/EditText;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final λ(Landroid/widget/TextView;ZLxx;)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "#FFFFFF"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p3, Lxx;->η:Ljava/lang/String;

    .line 7
    .line 8
    :goto_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 21
    .line 22
    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p3, Lxx;->Α:Ljava/lang/String;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    iget-object p0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget-object p2, p3, Lxx;->ι:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, p0, v0, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object p2, p3, Lxx;->γ:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, p0, v0, p2}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_2
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final μ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-static {v0}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lnd0;->μ:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lnd0;->Δ:Lad0;

    .line 13
    .line 14
    sget-object v3, Lad0;->ε:Lad0;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    move v2, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v4

    .line 23
    :goto_0
    invoke-virtual {p0, v1, v2, v0}, Lnd0;->λ(Landroid/widget/TextView;ZLxx;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lnd0;->ν:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lnd0;->Δ:Lad0;

    .line 32
    .line 33
    sget-object v3, Lad0;->ζ:Lad0;

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    move v4, v5

    .line 38
    :cond_1
    invoke-virtual {p0, v1, v4, v0}, Lnd0;->λ(Landroid/widget/TextView;ZLxx;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
