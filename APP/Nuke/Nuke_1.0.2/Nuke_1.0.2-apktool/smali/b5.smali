.class public final Lb5;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lys2;
.implements Ln92;
.implements La22;
.implements Ltf2;
.implements Lnh2;
.implements Lec2;
.implements Lrh2;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lb5;->h:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sparse-switch p1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p1, Lz4;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v1}, Lz4;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lb5;->i:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/ref/ReferenceQueue;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 33
    .line 34
    new-instance v1, Ly4;

    .line 35
    .line 36
    invoke-direct {v1, v0, p0}, Ly4;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    sget-object v0, Lci0;->y:Lb23;

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 54
    .line 55
    new-instance p1, Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 61
    .line 62
    return-void

    .line 63
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    sget-object p1, Led2;->a:[J

    .line 67
    .line 68
    new-instance p1, Lrk1;

    .line 69
    .line 70
    invoke-direct {p1}, Lrk1;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 74
    .line 75
    return-void

    .line 76
    :sswitch_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    sget-object v0, Lno;->k:Lno;

    .line 91
    .line 92
    invoke-static {p1}, Leb;->z(Ljava/lang/String;)Lno;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 97
    .line 98
    sget-object p1, Luj1;->f:Lvf1;

    .line 99
    .line 100
    iput-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance p1, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 108
    .line 109
    return-void

    .line 110
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    new-instance p1, Lrk1;

    .line 114
    .line 115
    invoke-direct {p1}, Lrk1;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 119
    .line 120
    return-void

    .line 121
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance p1, Ln4;

    .line 125
    .line 126
    const/16 v0, 0xb

    .line 127
    .line 128
    invoke-direct {p1, v0}, Ln4;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 132
    .line 133
    new-instance p1, Ln4;

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ln4;-><init>(I)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 139
    .line 140
    new-instance p1, Ln4;

    .line 141
    .line 142
    invoke-direct {p1, v0}, Ln4;-><init>(I)V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 146
    .line 147
    return-void

    .line 148
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    new-instance p1, Lix2;

    .line 156
    .line 157
    invoke-direct {p1, v0}, Lix2;-><init>(I)V

    .line 158
    .line 159
    .line 160
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 161
    .line 162
    return-void

    .line 163
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x6 -> :sswitch_5
        0x7 -> :sswitch_4
        0xc -> :sswitch_3
        0x15 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Ltd1;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lb5;->h:I

    .line 243
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 244
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 245
    iput-object p3, p0, Lb5;->i:Ljava/lang/Object;

    .line 246
    invoke-static {v0, p2}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 247
    iput-object p2, p0, Lb5;->j:Ljava/lang/Object;

    .line 248
    new-instance p2, Lcom/bumptech/glide/load/data/a;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, Lb5;->h:I

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 231
    new-instance v0, Lea;

    const/16 v1, 0xb

    invoke-direct {v0, v1, p0}, Lea;-><init>(ILjava/lang/Object;)V

    sget-object v1, Li91;->i:Li91;

    invoke-static {v1, v0}, Lp7;->B(Li91;Lxm0;)Lj71;

    move-result-object v0

    iput-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 232
    new-instance v0, Lhh1;

    invoke-direct {v0, p1}, Lhh1;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb5;)V
    .locals 8

    const/4 v0, 0x2

    iput v0, p0, Lb5;->h:I

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    iget-object p1, p1, Lb5;->i:Ljava/lang/Object;

    check-cast p1, Lbk;

    .line 203
    invoke-virtual {p1}, Lbk;->h()I

    move-result v0

    .line 204
    new-array v1, v0, [Lxt;

    iput-object v1, p0, Lb5;->i:Ljava/lang/Object;

    .line 205
    new-array v1, v0, [Lxt;

    iput-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 206
    new-array v0, v0, [Lxt;

    iput-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 207
    iget-object v0, p1, Lkj0;->i:[Ljava/lang/Object;

    .line 208
    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    .line 209
    invoke-virtual {p1, v2}, Lkj0;->e(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzj;

    iget-object v4, v3, Lzj;->b:Lj01;

    .line 210
    iget v3, v3, Lzj;->a:I

    .line 211
    invoke-virtual {v4, v1}, Lkj0;->e(I)Ljava/lang/Object;

    move-result-object v5

    .line 212
    check-cast v5, Li01;

    .line 213
    iget-object v6, p0, Lb5;->i:Ljava/lang/Object;

    check-cast v6, [Lxt;

    new-instance v7, Lxt;

    .line 214
    iget-object v5, v5, Li01;->i:Lkt2;

    .line 215
    invoke-direct {v7, v5}, Lqg3;-><init>(Lkt2;)V

    .line 216
    aput-object v7, v6, v3

    .line 217
    invoke-virtual {v4}, Lj01;->h()Li01;

    move-result-object v4

    .line 218
    iget-object v4, v4, Li01;->i:Lkt2;

    .line 219
    iget-object v5, p0, Lb5;->j:Ljava/lang/Object;

    check-cast v5, [Lxt;

    new-instance v6, Lxt;

    .line 220
    invoke-direct {v6, v4}, Lqg3;-><init>(Lkt2;)V

    .line 221
    aput-object v6, v5, v3

    .line 222
    iget-object v5, p0, Lb5;->k:Ljava/lang/Object;

    check-cast v5, [Lxt;

    new-instance v6, Lxt;

    .line 223
    invoke-direct {v6, v4}, Lqg3;-><init>(Lkt2;)V

    .line 224
    aput-object v6, v5, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lbf0;Lyq2;Lff0;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lb5;->h:I

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 250
    iput-object p2, p0, Lb5;->j:Ljava/lang/Object;

    .line 251
    iput-object p3, p0, Lb5;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbk;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Lb5;->h:I

    .line 225
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 226
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 227
    iput-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 228
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbt2;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lb5;->h:I

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc62;)V
    .locals 2

    const/16 v0, 0x17

    iput v0, p0, Lb5;->h:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v0, Lxg;

    const/4 v1, 0x0

    .line 177
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 178
    iput-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 179
    new-instance v0, Lcj;

    invoke-direct {v0, v1}, Lcj;-><init>(I)V

    iput-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 180
    new-instance v0, Lr1;

    const/16 v1, 0x18

    invoke-direct {v0, v1, p0, p1}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lb5;->h:I

    .line 168
    sget-object v0, Lo90;->a:Lc60;

    .line 169
    sget-object v0, Lt50;->j:Lt50;

    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    iput-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 173
    invoke-virtual {p1}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 174
    new-instance p1, Lgs;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Lgs;-><init>(I)V

    invoke-static {p1}, Lse;->o(Lin0;)Lv31;

    move-result-object p1

    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 181
    iput p4, p0, Lb5;->h:I

    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    iput-object p2, p0, Lb5;->j:Ljava/lang/Object;

    iput-object p3, p0, Lb5;->k:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    .locals 0

    .line 163
    iput p4, p0, Lb5;->h:I

    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    iput-object p2, p0, Lb5;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb5;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/time/Clock;I)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lb5;->h:I

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 193
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    :cond_0
    sget-object p2, Lsn;->Q:Lc80;

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 197
    iput-object p2, p0, Lb5;->j:Ljava/lang/Object;

    .line 198
    sget-object p1, Lhn;->i:Lhn;

    const/16 p2, 0x64

    const/16 v0, 0x100

    .line 199
    invoke-static {p2, v0, p1}, Lp7;->d(IILhn;)Llq2;

    move-result-object p1

    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 200
    new-instance p0, Lk52;

    invoke-direct {p0, p1}, Lk52;-><init>(Llq2;)V

    return-void
.end method

.method public constructor <init>(Lkj1;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lb5;->h:I

    .line 182
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 184
    iget-object v0, p1, Lkj1;->k:Ljava/lang/Object;

    check-cast v0, Lg60;

    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    new-instance v1, Lo52;

    invoke-direct {v1, v0}, Lo52;-><init>(Lht2;)V

    .line 187
    iput-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 188
    iget-object p1, p1, Lkj1;->l:Ljava/lang/Object;

    check-cast p1, Lf60;

    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    new-instance v0, Ln52;

    invoke-direct {v0, p1}, Ln52;-><init>(Lfr2;)V

    .line 191
    iput-object v0, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkj1;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lb5;->h:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    .line 166
    iput-object p2, p0, Lb5;->j:Ljava/lang/Object;

    .line 167
    iput-object p3, p0, Lb5;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsp;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lb5;->h:I

    .line 233
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 234
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 235
    new-instance p1, Ln4;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 236
    iput-object p1, p0, Lb5;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lye1;Ljava/util/ArrayList;Ltd1;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lb5;->h:I

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 239
    iput-object p3, p0, Lb5;->j:Ljava/lang/Object;

    .line 240
    invoke-static {v0, p2}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 241
    iput-object p2, p0, Lb5;->k:Ljava/lang/Object;

    .line 242
    new-instance p2, Ln4;

    invoke-direct {p2, p1, p3}, Ln4;-><init>(Ljava/io/InputStream;Ltd1;)V

    iput-object p2, p0, Lb5;->i:Ljava/lang/Object;

    return-void
.end method

.method private final F()V
    .locals 0

    .line 1
    return-void
.end method

.method private final G()V
    .locals 0

    .line 1
    return-void
.end method

.method public static x(Lb5;Lph2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;I)V
    .locals 8

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    move-object v5, p3

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lqh2;

    .line 11
    .line 12
    iget-object p3, p0, Lb5;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p3, Ljava/time/Clock;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v3, Lsh2;->i:Lsh2;

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v2, p1

    .line 27
    move-object v4, p2

    .line 28
    move-object v7, p4

    .line 29
    invoke-direct/range {v0 .. v7}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lb5;->f(Lqh2;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Lv93;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Le23;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lb5;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p0, Lb5;->j:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, p0, Lb5;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lb23;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Lb23;->a(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-virtual {v3, v0, v1, p1}, Lb23;->b(JLjava/lang/Object;)Lb23;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :try_start_1
    iget-object p0, v3, Lb23;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, p0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v2

    .line 55
    throw p0
.end method

.method public B(Lqp;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iput-object p1, p0, Lrp;->c:Lqp;

    .line 8
    .line 9
    return-void
.end method

.method public C(Le70;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iput-object p1, p0, Lrp;->a:Le70;

    .line 8
    .line 9
    return-void
.end method

.method public D(Ld61;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iput-object p1, p0, Lrp;->b:Ld61;

    .line 8
    .line 9
    return-void
.end method

.method public E(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iput-wide p1, p0, Lrp;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public H()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrk1;

    .line 4
    .line 5
    iget-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lrk1;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lxm0;

    .line 20
    .line 21
    invoke-interface {v2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, v1, v2}, Lrk1;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lth0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lth0;

    .line 7
    .line 8
    invoke-interface {v0}, Lth0;->c()Lsu2;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, Lsu2;->a:Z

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Leb;

    .line 18
    .line 19
    iget v0, v0, Leb;->h:I

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object v0, p1

    .line 25
    check-cast v0, Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    :pswitch_0
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Le9;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Le9;->a(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
    .end packed-switch
.end method

.method public b(Llh2;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p1, Llh2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb5;->y(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/content/Context;

    .line 9
    .line 10
    return-object p0
.end method

.method public c()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le9;

    .line 4
    .line 5
    invoke-virtual {v0}, Le9;->c()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lsh0;

    .line 14
    .line 15
    invoke-interface {p0}, Lsh0;->k()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 p0, 0x2

    .line 20
    const-string v1, "FactoryPools"

    .line 21
    .line 22
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    new-instance p0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Created new "

    .line 31
    .line 32
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    :cond_0
    instance-of p0, v0, Lth0;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    move-object p0, v0

    .line 54
    check-cast p0, Lth0;

    .line 55
    .line 56
    invoke-interface {p0}, Lth0;->c()Lsu2;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const/4 v1, 0x0

    .line 61
    iput-boolean v1, p0, Lsu2;->a:Z

    .line 62
    .line 63
    :cond_1
    return-object v0
.end method

.method public d(Llh2;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p1, Llh2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb5;->y(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/ClassLoader;

    .line 9
    .line 10
    return-object p0
.end method

.method public e(Llh2;Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Llh2;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lb5;->y(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/ClassLoader;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-static {p2, p1, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public f(Lqh2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llq2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Llq2;->p(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lrh2;

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lrh2;->f(Lqh2;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    :catch_0
    return-void
.end method

.method public g(Ljava/lang/String;Lt00;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc20;

    .line 4
    .line 5
    new-instance v1, Lu30;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-direct {v1, p0, p1, v2, v3}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p2}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public declared-synchronized h(La51;Lhf0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, La5;

    .line 3
    .line 4
    iget-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, La5;-><init>(La51;Lhf0;Ljava/lang/ref/ReferenceQueue;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lb5;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La5;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    iput-object p2, p1, La5;->c:Ld92;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public i(Ld92;Lov1;)Ld92;
    .locals 2

    .line 1
    invoke-interface {p1}, Ld92;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lb5;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ldk;

    .line 14
    .line 15
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lzk;

    .line 24
    .line 25
    invoke-static {p0, v0}, Lal;->c(Lzk;Landroid/graphics/Bitmap;)Lal;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p1, p0, p2}, Ldk;->i(Ld92;Lov1;)Ld92;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    instance-of v0, v0, Lyo0;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Leb;

    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Leb;->i(Ld92;Lov1;)Ld92;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public j(Lr61;La21;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln4;

    .line 4
    .line 5
    iget-object v1, p0, Lb5;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln4;

    .line 8
    .line 9
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ln4;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_5

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p2, v2, :cond_4

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p2, v2, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lr61;->o:Lr61;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ln4;->h(Lr61;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Ln4;->h(Lr61;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lc80;->s()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p2, p1, Lr61;->o:Lr61;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ln4;->h(Lr61;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0, p1}, Ln4;->h(Lr61;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {v1, p1}, Ln4;->h(Lr61;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ln4;->h(Lr61;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {v0, p1}, Ln4;->h(Lr61;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ln4;->h(Lr61;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public k(La5;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v1, p1, La5;->a:La51;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p1, La5;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, La5;->c:Ld92;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v1, Lhf0;

    .line 22
    .line 23
    iget-object v5, p1, La5;->a:La51;

    .line 24
    .line 25
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, Lbf0;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, Lhf0;-><init>(Ld92;ZZLa51;Lbf0;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lbf0;

    .line 38
    .line 39
    iget-object p1, p1, La5;->a:La51;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v1}, Lbf0;->f(La51;Lhf0;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
.end method

.method public l()Lfr2;
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ln52;

    .line 4
    .line 5
    return-object p0
.end method

.method public m(Lr61;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lr61;->o:Lr61;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lb5;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Ln4;

    .line 13
    .line 14
    iget-object v3, v3, Ln4;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lgt2;

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ln4;

    .line 27
    .line 28
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lgt2;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move p0, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    move p0, v2

    .line 42
    :goto_2
    if-nez v0, :cond_3

    .line 43
    .line 44
    if-eqz p0, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public n()Lht2;
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo52;

    .line 4
    .line 5
    return-object p0
.end method

.method public o(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    iget v0, p0, Lb5;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/bumptech/glide/load/data/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v2, 0x22

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-ne v1, v2, :cond_4

    .line 24
    .line 25
    invoke-static {p1}, Lse;->v(Landroid/graphics/BitmapFactory$Options;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-static {p0}, Lgf1;->B(Lb5;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_4

    .line 36
    .line 37
    iget-object p0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 38
    .line 39
    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 40
    .line 41
    if-ne p0, v1, :cond_0

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    :goto_0
    const-string v2, ""

    .line 47
    .line 48
    invoke-static {v2, p0}, Lfg1;->o(Ljava/lang/String;Z)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 52
    .line 53
    iput-object p0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 54
    .line 55
    :try_start_0
    invoke-static {v0, v3, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    :goto_1
    iput-object v1, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_2
    :try_start_1
    invoke-static {p0}, Lgf1;->S(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    :goto_2
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    move-object v3, p0

    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    :goto_3
    if-eqz v3, :cond_3

    .line 80
    .line 81
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 82
    .line 83
    .line 84
    :cond_3
    sget-object p0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    .line 85
    .line 86
    iput-object p0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 87
    .line 88
    throw v0

    .line 89
    :cond_4
    invoke-static {v0, v3, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    :goto_4
    return-object v3

    .line 94
    :pswitch_0
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ln4;

    .line 97
    .line 98
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lr62;

    .line 101
    .line 102
    invoke-virtual {v0}, Lr62;->reset()V

    .line 103
    .line 104
    .line 105
    invoke-static {v0, p1, p0}, Lgf1;->r(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lb5;)Landroid/graphics/Bitmap;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_1
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 113
    .line 114
    invoke-static {v0}, Llo;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Ljo;

    .line 119
    .line 120
    invoke-direct {v1, v0}, Ljo;-><init>(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, p1, p0}, Lgf1;->r(Ljava/io/InputStream;Landroid/graphics/BitmapFactory$Options;Lb5;)Landroid/graphics/Bitmap;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lv93;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Le23;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Lb23;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lb23;->a(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lb23;->c:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object p0, p0, v0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public q()Lqp;
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iget-object p0, p0, Lrp;->c:Lqp;

    .line 8
    .line 9
    return-object p0
.end method

.method public r()Lkc1;
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lb5;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lix2;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lb5;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lkc1;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lb5;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return-object v2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    if-ge v4, v2, :cond_1

    .line 35
    .line 36
    new-instance v5, Ljc1;

    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, Ljc1;-><init>(Ljava/util/Locale;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v2, Lkc1;

    .line 54
    .line 55
    invoke-direct {v2, v3}, Lkc1;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v2, p0, Lb5;->j:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-object v2

    .line 64
    :goto_1
    monitor-exit v1

    .line 65
    throw p0
.end method

.method public s()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 9

    .line 1
    iget v0, p0, Lb5;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, Lb5;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lcom/bumptech/glide/load/data/a;

    .line 13
    .line 14
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ltd1;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_2

    .line 24
    .line 25
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lkx0;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :try_start_0
    new-instance v6, Lr62;

    .line 33
    .line 34
    new-instance v7, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v8}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    invoke-direct {v7, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v6, v7, p0}, Lr62;-><init>(Ljava/io/InputStream;Ltd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-interface {v4, v6}, Lkx0;->f(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 51
    .line 52
    .line 53
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    invoke-virtual {v6}, Lr62;->c()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 58
    .line 59
    .line 60
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 61
    .line 62
    if-eq v4, v5, :cond_0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    move-object v5, v6

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    :goto_1
    if-eqz v5, :cond_1

    .line 73
    .line 74
    invoke-virtual {v5}, Lr62;->c()V

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v1}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 78
    .line 79
    .line 80
    throw p0

    .line 81
    :cond_2
    sget-object v4, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 82
    .line 83
    :goto_2
    return-object v4

    .line 84
    :pswitch_0
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Lb5;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Ln4;

    .line 91
    .line 92
    iget-object v1, v1, Ln4;->i:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lr62;

    .line 95
    .line 96
    invoke-virtual {v1}, Lr62;->reset()V

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Ltd1;

    .line 102
    .line 103
    invoke-static {v0, v1, p0}, Lse;->I(Ljava/util/List;Ljava/io/InputStream;Ltd1;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_1
    iget-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/List;

    .line 111
    .line 112
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 115
    .line 116
    invoke-static {p0}, Llo;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {v0, p0}, Lse;->J(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public t()Lk51;
    .locals 0

    .line 1
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lk51;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string p0, "keyboardActions"

    .line 9
    .line 10
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public u()J
    .locals 2

    .line 1
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsp;

    .line 4
    .line 5
    iget-object p0, p0, Lsp;->h:Lrp;

    .line 6
    .line 7
    iget-wide v0, p0, Lrp;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public v()Z
    .locals 11

    .line 1
    iget v0, p0, Lb5;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, p0, Lb5;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lcom/bumptech/glide/load/data/a;

    .line 15
    .line 16
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ltd1;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    move v5, v1

    .line 25
    :goto_0
    if-ge v5, v4, :cond_2

    .line 26
    .line 27
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    check-cast v6, Lkx0;

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    :try_start_0
    new-instance v8, Lr62;

    .line 35
    .line 36
    new-instance v9, Ljava/io/FileInputStream;

    .line 37
    .line 38
    invoke-virtual {v3}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v8, v9, p0}, Lr62;-><init>(Ljava/io/InputStream;Ltd1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-interface {v6, v8, p0}, Lkx0;->e(Ljava/io/InputStream;Ltd1;)Z

    .line 53
    .line 54
    .line 55
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    invoke-virtual {v8}, Lr62;->c()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 60
    .line 61
    .line 62
    if-eqz v6, :cond_0

    .line 63
    .line 64
    move v1, v2

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    move-object v7, v8

    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    :goto_1
    if-eqz v7, :cond_1

    .line 74
    .line 75
    invoke-virtual {v7}, Lr62;->c()V

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {v3}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_2
    :goto_2
    return v1

    .line 83
    :pswitch_0
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/util/List;

    .line 86
    .line 87
    iget-object v3, p0, Lb5;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Ln4;

    .line 90
    .line 91
    iget-object v3, v3, Ln4;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v3, Lr62;

    .line 94
    .line 95
    invoke-virtual {v3}, Lr62;->reset()V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Ltd1;

    .line 101
    .line 102
    const/high16 v4, 0x500000

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Lr62;->mark(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    move v5, v1

    .line 112
    :goto_3
    if-ge v5, v4, :cond_4

    .line 113
    .line 114
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    check-cast v6, Lkx0;

    .line 119
    .line 120
    :try_start_2
    invoke-interface {v6, v3, p0}, Lkx0;->e(Ljava/io/InputStream;Ltd1;)Z

    .line 121
    .line 122
    .line 123
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 124
    invoke-virtual {v3}, Lr62;->reset()V

    .line 125
    .line 126
    .line 127
    if-eqz v6, :cond_3

    .line 128
    .line 129
    move v1, v2

    .line 130
    goto :goto_4

    .line 131
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :catchall_2
    move-exception p0

    .line 135
    invoke-virtual {v3}, Lr62;->reset()V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :cond_4
    :goto_4
    return v1

    .line 140
    :pswitch_1
    iget-object v0, p0, Lb5;->j:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ljava/util/List;

    .line 143
    .line 144
    iget-object v3, p0, Lb5;->i:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    invoke-static {v3}, Llo;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Ltd1;

    .line 155
    .line 156
    if-nez v3, :cond_5

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    move v5, v1

    .line 164
    :goto_5
    if-ge v5, v4, :cond_7

    .line 165
    .line 166
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, Lkx0;

    .line 171
    .line 172
    :try_start_3
    invoke-interface {v6, v3, p0}, Lkx0;->c(Ljava/nio/ByteBuffer;Ltd1;)Z

    .line 173
    .line 174
    .line 175
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 176
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    if-eqz v6, :cond_6

    .line 183
    .line 184
    move v1, v2

    .line 185
    goto :goto_6

    .line 186
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :catchall_3
    move-exception p0

    .line 190
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 195
    .line 196
    throw p0

    .line 197
    :cond_7
    :goto_6
    return v1

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb5;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln4;

    .line 4
    .line 5
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lgt2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lb5;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ln4;

    .line 19
    .line 20
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lgt2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lb5;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ln4;

    .line 33
    .line 34
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lgt2;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    move p0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    :goto_0
    xor-int/2addr p0, v1

    .line 48
    return p0
.end method

.method public y(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkj1;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    invoke-virtual {p0}, Lkj1;->D()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit v0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    new-instance p0, Leh2;

    .line 27
    .line 28
    const-string p1, "PERMISSION_DENIED"

    .line 29
    .line 30
    const-string v0, "Host runtime access has been revoked for this script."

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/16 v2, 0xc

    .line 34
    .line 35
    invoke-direct {p0, v2, p1, v0, v1}, Leh2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v0

    .line 41
    throw p0
.end method

.method public z(I)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    const/4 v2, 0x6

    .line 4
    const/4 v3, 0x2

    .line 5
    const/4 v4, 0x1

    .line 6
    const/4 v5, 0x7

    .line 7
    if-ne p1, v5, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-ne p1, v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-ne p1, v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    if-ne p1, v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    const/4 v6, 0x3

    .line 32
    if-ne p1, v6, :cond_4

    .line 33
    .line 34
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    const/4 v6, 0x4

    .line 39
    if-ne p1, v6, :cond_5

    .line 40
    .line 41
    invoke-virtual {p0}, Lb5;->t()Lk51;

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    if-ne p1, v4, :cond_6

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_6
    if-nez p1, :cond_c

    .line 49
    .line 50
    :goto_0
    const/4 v6, 0x0

    .line 51
    const-string v7, "focusManager"

    .line 52
    .line 53
    if-ne p1, v2, :cond_8

    .line 54
    .line 55
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lyk0;

    .line 58
    .line 59
    if-eqz p0, :cond_7

    .line 60
    .line 61
    check-cast p0, Lbl0;

    .line 62
    .line 63
    invoke-virtual {p0, v4, v4}, Lbl0;->g(IZ)Z

    .line 64
    .line 65
    .line 66
    return v4

    .line 67
    :cond_7
    invoke-static {v7}, Lt11;->S(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v6

    .line 71
    :cond_8
    if-ne p1, v1, :cond_a

    .line 72
    .line 73
    iget-object p0, p0, Lb5;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Lyk0;

    .line 76
    .line 77
    if-eqz p0, :cond_9

    .line 78
    .line 79
    check-cast p0, Lbl0;

    .line 80
    .line 81
    invoke-virtual {p0, v3, v4}, Lbl0;->g(IZ)Z

    .line 82
    .line 83
    .line 84
    return v4

    .line 85
    :cond_9
    invoke-static {v7}, Lt11;->S(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v6

    .line 89
    :cond_a
    if-ne p1, v5, :cond_b

    .line 90
    .line 91
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, Lbt2;

    .line 94
    .line 95
    if-eqz p0, :cond_b

    .line 96
    .line 97
    check-cast p0, Lv60;

    .line 98
    .line 99
    invoke-virtual {p0}, Lv60;->a()V

    .line 100
    .line 101
    .line 102
    return v4

    .line 103
    :cond_b
    return v0

    .line 104
    :cond_c
    const-string p0, "invalid ImeAction"

    .line 105
    .line 106
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return v0
.end method
