.class public final Lbi0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Landroid/content/SharedPreferences;
.implements Landroid/content/SharedPreferences$Editor;


# static fields
.field public static final x:[B

.field public static final y:[I

.field public static final z:I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/HashMap;

.field public d:I

.field public e:J

.field public final f:Ljava/util/HashMap;

.field public volatile g:Z

.field public h:Le9;

.field public i:I

.field public j:I

.field public final k:Ljava/util/ArrayList;

.field public final l:Lra1;

.field public m:I

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/ArrayList;

.field public final p:Landroid/os/Handler;

.field public q:Ljava/nio/channels/FileChannel;

.field public r:Ljava/nio/channels/FileChannel;

.field public s:Ljava/nio/MappedByteBuffer;

.field public t:Ljava/nio/MappedByteBuffer;

.field public u:I

.field public v:I

.field public w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lbi0;->x:[B

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Lbi0;->y:[I

    .line 13
    .line 14
    :try_start_0
    const-string v0, "sun.misc.Unsafe"

    .line 15
    .line 16
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "theUnsafe"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    .line 29
    .line 30
    const-string v3, "pageSize"

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    const/16 v0, 0x4000

    .line 56
    .line 57
    :goto_0
    sput v0, Lbi0;->z:I

    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :array_0
    .array-data 4
        0x0
        0x1
        0x4
        0x4
        0x8
        0x8
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lov2;I)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lbi0;->g:Z

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lbi0;->k:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance v1, Lra1;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lbi0;->l:Lra1;

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 41
    .line 42
    new-instance v1, Landroid/os/Handler;

    .line 43
    .line 44
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lbi0;->p:Landroid/os/Handler;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    iput-boolean v1, p0, Lbi0;->w:Z

    .line 55
    .line 56
    iput-object p1, p0, Lbi0;->a:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p2, p0, Lbi0;->b:Ljava/lang/String;

    .line 59
    .line 60
    iput p4, p0, Lbi0;->v:I

    .line 61
    .line 62
    new-instance p1, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    if-eqz p3, :cond_1

    .line 68
    .line 69
    array-length p2, p3

    .line 70
    :goto_0
    if-ge v0, p2, :cond_1

    .line 71
    .line 72
    aget-object p4, p3, v0

    .line 73
    .line 74
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const-string v2, "StringSet"

    .line 78
    .line 79
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_0

    .line 84
    .line 85
    const-string p4, "duplicate encoder tag:StringSet"

    .line 86
    .line 87
    invoke-static {p0, p4}, Ls11;->I(Lbi0;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    invoke-virtual {p1, v2, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    sget-object p2, Lov2;->a:Lov2;

    .line 98
    .line 99
    const-string p3, "StringSet"

    .line 100
    .line 101
    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lbi0;->c:Ljava/util/HashMap;

    .line 105
    .line 106
    iget-object p1, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 107
    .line 108
    monitor-enter p1

    .line 109
    :try_start_0
    invoke-static {}, Lci0;->J()Ljava/util/concurrent/Executor;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    new-instance p3, Lzh0;

    .line 114
    .line 115
    invoke-direct {p3, p0, v1}, Lzh0;-><init>(Lbi0;I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 119
    .line 120
    .line 121
    iget-boolean p2, p0, Lbi0;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    if-nez p2, :cond_2

    .line 124
    .line 125
    :try_start_1
    iget-object p0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :catchall_0
    move-exception p0

    .line 132
    goto :goto_3

    .line 133
    :catch_0
    :cond_2
    :goto_2
    :try_start_2
    monitor-exit p1

    .line 134
    return-void

    .line 135
    :goto_3
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    throw p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "key is empty"

    .line 11
    .line 12
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;[BLyz;B)V
    .locals 6

    .line 1
    if-nez p4, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0, p1, p3, p5}, Lbi0;->n(Ljava/lang/String;[BB)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-lez v2, :cond_9

    .line 8
    .line 9
    array-length v4, p3

    .line 10
    iget v1, p0, Lbi0;->i:I

    .line 11
    .line 12
    const/4 p3, 0x6

    .line 13
    if-ne p5, p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lxz;

    .line 16
    .line 17
    move-object v3, p2

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p3, 0x7

    .line 26
    if-ne p5, p3, :cond_1

    .line 27
    .line 28
    new-instance v0, Lpz;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v3, p2

    .line 32
    invoke-direct/range {v0 .. v5}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, p2

    .line 37
    new-instance v0, Lwz;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct/range {v0 .. v5}, Lyz;-><init>(IILjava/lang/Object;IZ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p2, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lbi0;->k()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    move-object v3, p2

    .line 53
    iget-boolean p2, p4, Lyz;->e:Z

    .line 54
    .line 55
    const/4 p5, 0x0

    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    iget p2, p4, Lyz;->d:I

    .line 59
    .line 60
    array-length v0, p3

    .line 61
    if-ne p2, v0, :cond_4

    .line 62
    .line 63
    iget p1, p4, Lqz;->a:I

    .line 64
    .line 65
    array-length p2, p3

    .line 66
    iget-wide v0, p0, Lbi0;->e:J

    .line 67
    .line 68
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 69
    .line 70
    invoke-virtual {v2, p1, p2}, Le9;->f(II)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    xor-long/2addr v0, v4

    .line 75
    iput-wide v0, p0, Lbi0;->e:J

    .line 76
    .line 77
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 78
    .line 79
    iput p1, v0, Le9;->i:I

    .line 80
    .line 81
    invoke-virtual {v0, p3}, Le9;->o([B)V

    .line 82
    .line 83
    .line 84
    iget-wide v0, p0, Lbi0;->e:J

    .line 85
    .line 86
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 87
    .line 88
    invoke-virtual {v2, p1, p2}, Le9;->f(II)J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    xor-long/2addr v0, v4

    .line 93
    iput-wide v0, p0, Lbi0;->e:J

    .line 94
    .line 95
    iget p2, p0, Lbi0;->v:I

    .line 96
    .line 97
    const/4 v2, 0x4

    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    iget-object p2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 101
    .line 102
    const/4 v0, -0x1

    .line 103
    invoke-virtual {p2, p5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 107
    .line 108
    iget-wide v0, p0, Lbi0;->e:J

    .line 109
    .line 110
    invoke-virtual {p2, v2, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 116
    .line 117
    .line 118
    iget-object p2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 119
    .line 120
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 124
    .line 125
    iget v0, p0, Lbi0;->d:I

    .line 126
    .line 127
    add-int/lit8 v0, v0, -0xc

    .line 128
    .line 129
    invoke-virtual {p2, p5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    iget-object p2, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 133
    .line 134
    iget-wide v0, p0, Lbi0;->e:J

    .line 135
    .line 136
    invoke-virtual {p2, v2, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    iget-object p2, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 140
    .line 141
    invoke-virtual {p2, p1}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 145
    .line 146
    invoke-virtual {p0, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 151
    .line 152
    invoke-virtual {p0, v0, v1, v2}, Le9;->r(JI)V

    .line 153
    .line 154
    .line 155
    :goto_1
    iput-object v3, p4, Lyz;->b:Ljava/lang/Object;

    .line 156
    .line 157
    return-void

    .line 158
    :cond_4
    invoke-virtual {p4}, Lqz;->a()B

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {p0, p1, p3, p2}, Lbi0;->n(Ljava/lang/String;[BB)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-lez p1, :cond_9

    .line 167
    .line 168
    iget-boolean p2, p4, Lyz;->e:Z

    .line 169
    .line 170
    if-eqz p2, :cond_5

    .line 171
    .line 172
    iget-object p2, p4, Lyz;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p2, Ljava/lang/String;

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_5
    const/4 p2, 0x0

    .line 178
    :goto_2
    invoke-virtual {p4}, Lqz;->a()B

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget v1, p4, Lyz;->c:I

    .line 183
    .line 184
    iget v2, p4, Lqz;->a:I

    .line 185
    .line 186
    iget v4, p4, Lyz;->d:I

    .line 187
    .line 188
    add-int/2addr v2, v4

    .line 189
    invoke-virtual {p0, v0, v1, v2}, Lbi0;->h(BII)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lbi0;->i:I

    .line 193
    .line 194
    iput v0, p4, Lyz;->c:I

    .line 195
    .line 196
    iput p1, p4, Lqz;->a:I

    .line 197
    .line 198
    iput-boolean p5, p4, Lyz;->e:Z

    .line 199
    .line 200
    iput-object v3, p4, Lyz;->b:Ljava/lang/Object;

    .line 201
    .line 202
    array-length p1, p3

    .line 203
    iput p1, p4, Lyz;->d:I

    .line 204
    .line 205
    invoke-virtual {p0}, Lbi0;->k()V

    .line 206
    .line 207
    .line 208
    iget p1, p0, Lbi0;->m:I

    .line 209
    .line 210
    const/16 p3, 0x2000

    .line 211
    .line 212
    if-ge p1, p3, :cond_6

    .line 213
    .line 214
    iget-object p1, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    const/16 p3, 0x64

    .line 221
    .line 222
    if-lt p1, p3, :cond_7

    .line 223
    .line 224
    :cond_6
    invoke-static {p0, p5}, Ltp0;->t(Lbi0;I)V

    .line 225
    .line 226
    .line 227
    :cond_7
    if-eqz p2, :cond_9

    .line 228
    .line 229
    iget p1, p0, Lbi0;->v:I

    .line 230
    .line 231
    if-nez p1, :cond_8

    .line 232
    .line 233
    invoke-static {}, Lci0;->J()Ljava/util/concurrent/Executor;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance p3, Lt7;

    .line 238
    .line 239
    const/4 p4, 0x2

    .line 240
    invoke-direct {p3, p4, p0, p2}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {p1, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_8
    iget-object p0, p0, Lbi0;->k:Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    :cond_9
    return-void
.end method

.method public final declared-synchronized apply()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lbi0;->w:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Lbi0;->c()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final c()Z
    .locals 3

    .line 1
    iget v0, p0, Lbi0;->v:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lzh0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p0, v2}, Lzh0;-><init>(Lbi0;I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbi0;->l:Lra1;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lra1;->execute(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Lte;->t0(Lbi0;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    return v1
.end method

.method public final declared-synchronized clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p0}, Lte;->q(Lbi0;)V

    .line 3
    .line 4
    .line 5
    iget v0, p0, Lbi0;->v:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lte;->v(Lbi0;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Lbi0;->f(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-object p0

    .line 21
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method public final declared-synchronized commit()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lbi0;->w:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Lbi0;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit p0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public final declared-synchronized contains(Ljava/lang/String;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p1
.end method

.method public final declared-synchronized d(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lqz;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0}, Lqz;->a()B

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/16 v3, 0x8

    .line 18
    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    check-cast v0, Lwz;

    .line 23
    .line 24
    iget-boolean v2, v0, Lyz;->e:Z

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-static {p0, v0}, Lte;->H(Lbi0;Lwz;)Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-object v1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :try_start_1
    iput-object v2, v0, Lyz;->b:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, v0, Lyz;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-object v2

    .line 48
    :cond_2
    :try_start_2
    iget-object p1, v0, Lyz;->b:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 49
    .line 50
    monitor-exit p0

    .line 51
    return-object p1

    .line 52
    :cond_3
    :goto_0
    monitor-exit p0

    .line 53
    return-object v1

    .line 54
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    throw p1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lbi0;->v:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lbi0;->w:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lbi0;->c()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lbi0;->f(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final edit()Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final declared-synchronized f(Ljava/lang/String;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    iget-object v0, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;

    .line 29
    .line 30
    iget-object v2, p0, Lbi0;->p:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance v3, Llb;

    .line 33
    .line 34
    const/4 v4, 0x6

    .line 35
    invoke-direct {v3, p0, v1, p1, v4}, Llb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw p1
.end method

.method public final declared-synchronized g(Ljava/lang/String;Ljava/lang/Object;Lov2;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    if-eqz p3, :cond_5

    .line 6
    .line 7
    const-string p3, "StringSet"

    .line 8
    .line 9
    iget-object v0, p0, Lbi0;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    :try_start_1
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    move-object v2, p0

    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    const/4 v1, 0x0

    .line 30
    :try_start_2
    invoke-static {p2}, Lov2;->b(Ljava/lang/Object;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    move-exception v0

    .line 36
    :try_start_3
    const-string v2, "FastKV"

    .line 37
    .line 38
    iget-object v3, p0, Lbi0;->b:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 41
    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :goto_0
    if-nez v0, :cond_1

    .line 45
    .line 46
    :try_start_4
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :cond_1
    :try_start_5
    iget-object v2, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lqz;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    :try_start_6
    invoke-virtual {v2}, Lqz;->a()B

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/16 v4, 0x8

    .line 66
    .line 67
    if-eq v3, v4, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move-object v1, v2

    .line 74
    :goto_1
    :try_start_7
    move-object v6, v1

    .line 75
    check-cast v6, Lwz;

    .line 76
    .line 77
    invoke-static {p3}, Le9;->l(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    new-instance v2, Le9;

    .line 82
    .line 83
    add-int/lit8 v3, v1, 0x1

    .line 84
    .line 85
    array-length v4, v0

    .line 86
    add-int/2addr v3, v4

    .line 87
    const/4 v4, 0x3

    .line 88
    invoke-direct {v2, v3, v4}, Le9;-><init>(II)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 89
    .line 90
    .line 91
    int-to-byte v1, v1

    .line 92
    :try_start_8
    iget-object v3, v2, Le9;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, [B

    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    iput v4, v2, Le9;->i:I

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    aput-byte v1, v3, v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 101
    .line 102
    :try_start_9
    invoke-virtual {v2, p3}, Le9;->s(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0}, Le9;->o([B)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 106
    .line 107
    .line 108
    :try_start_a
    iget-object p3, v2, Le9;->k:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v5, p3

    .line 111
    check-cast v5, [B
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 112
    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    monitor-exit p0

    .line 116
    return-void

    .line 117
    :cond_3
    const/16 v7, 0x8

    .line 118
    .line 119
    move-object v2, p0

    .line 120
    move-object v3, p1

    .line 121
    move-object v4, p2

    .line 122
    :try_start_b
    invoke-virtual/range {v2 .. v7}, Lbi0;->a(Ljava/lang/String;Ljava/lang/Object;[BLyz;B)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v3}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 126
    .line 127
    .line 128
    monitor-exit v2

    .line 129
    return-void

    .line 130
    :catchall_1
    move-exception v0

    .line 131
    :goto_2
    move-object p1, v0

    .line 132
    goto :goto_3

    .line 133
    :catchall_2
    move-exception v0

    .line 134
    move-object v2, p0

    .line 135
    move-object p0, v0

    .line 136
    move-object p1, p0

    .line 137
    goto :goto_3

    .line 138
    :catchall_3
    move-exception v0

    .line 139
    move-object v2, p0

    .line 140
    goto :goto_2

    .line 141
    :cond_4
    move-object v2, p0

    .line 142
    :try_start_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string p1, "Encoder hasn\'t been registered"

    .line 145
    .line 146
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :cond_5
    move-object v2, p0

    .line 151
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    const-string p1, "Encoder is null"

    .line 154
    .line 155
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0

    .line 159
    :goto_3
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 160
    throw p1
.end method

.method public final declared-synchronized getAll()Ljava/util/Map;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/HashMap;

    .line 21
    .line 22
    mul-int/lit8 v0, v0, 0x4

    .line 23
    .line 24
    div-int/lit8 v0, v0, 0x3

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_6

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lqz;

    .line 64
    .line 65
    invoke-virtual {v2}, Lqz;->a()B

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    const/4 v5, 0x0

    .line 70
    packed-switch v4, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :pswitch_0
    move-object v4, v2

    .line 76
    check-cast v4, Lwz;

    .line 77
    .line 78
    iget-boolean v5, v4, Lyz;->e:Z

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    invoke-static {p0, v4}, Lte;->H(Lbi0;Lwz;)Ljava/util/LinkedHashSet;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_1
    move-object v5, v2

    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_2
    check-cast v2, Lwz;

    .line 90
    .line 91
    iget-object v2, v2, Lyz;->b:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_1
    check-cast v2, Lpz;

    .line 95
    .line 96
    iget-boolean v4, v2, Lyz;->e:Z

    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    iget-object v4, p0, Lbi0;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v2, v2, Lyz;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v2, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    :try_start_2
    new-instance v6, Ljava/io/File;

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    iget-object v8, p0, Lbi0;->a:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-direct {v6, v7, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v6}, Lhg3;->e(Ljava/io/File;)[B

    .line 129
    .line 130
    .line 131
    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :catch_0
    move-exception v2

    .line 136
    :try_start_3
    const-string v6, "FastKV"

    .line 137
    .line 138
    invoke-static {v6, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    iget-object v2, v2, Lyz;->b:Ljava/lang/Object;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_2
    check-cast v2, Lxz;

    .line 146
    .line 147
    iget-boolean v4, v2, Lyz;->e:Z

    .line 148
    .line 149
    if-eqz v4, :cond_4

    .line 150
    .line 151
    invoke-static {p0, v2}, Lte;->K(Lbi0;Lxz;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_1

    .line 156
    :cond_4
    iget-object v2, v2, Lyz;->b:Ljava/lang/Object;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :pswitch_3
    check-cast v2, Lsz;

    .line 160
    .line 161
    iget-wide v4, v2, Lsz;->b:D

    .line 162
    .line 163
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    goto :goto_2

    .line 168
    :pswitch_4
    check-cast v2, Lvz;

    .line 169
    .line 170
    iget-wide v4, v2, Lvz;->b:J

    .line 171
    .line 172
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    goto :goto_2

    .line 177
    :pswitch_5
    check-cast v2, Ltz;

    .line 178
    .line 179
    iget v2, v2, Ltz;->b:F

    .line 180
    .line 181
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    goto :goto_2

    .line 186
    :pswitch_6
    check-cast v2, Luz;

    .line 187
    .line 188
    iget v2, v2, Luz;->b:I

    .line 189
    .line 190
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    goto :goto_2

    .line 195
    :pswitch_7
    check-cast v2, Lrz;

    .line 196
    .line 197
    iget-boolean v2, v2, Lrz;->b:Z

    .line 198
    .line 199
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    :cond_5
    :goto_2
    if-eqz v5, :cond_1

    .line 204
    .line 205
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 206
    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :cond_6
    monitor-exit p0

    .line 211
    return-object v1

    .line 212
    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    throw v0

    .line 214
    nop

    .line 215
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

.method public final declared-synchronized getBoolean(Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lqz;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lqz;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return p2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized getFloat(Ljava/lang/String;F)F
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lqz;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lqz;->c()F

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return p2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized getInt(Ljava/lang/String;I)I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lqz;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lqz;->d()I

    .line 14
    .line 15
    .line 16
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return p2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized getLong(Ljava/lang/String;J)J
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lqz;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lqz;->e()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return-wide p2

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final declared-synchronized getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lqz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-object p2

    .line 14
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Lqz;->a()B

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x6

    .line 19
    if-ne v1, v2, :cond_3

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Lxz;

    .line 23
    .line 24
    iget-boolean v2, v1, Lyz;->e:Z

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-static {p0, v1}, Lte;->K(Lbi0;Lxz;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iput-object v0, v1, Lyz;->b:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, v1, Lyz;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    :try_start_2
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-object p2

    .line 55
    :cond_3
    :try_start_3
    invoke-virtual {v0}, Lqz;->f()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    monitor-exit p0

    .line 60
    return-object p1

    .line 61
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 62
    throw p1
.end method

.method public final getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Lbi0;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    monitor-exit p0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    return-object p2

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1
.end method

.method public final h(BII)V
    .locals 8

    .line 1
    iget v0, p0, Lbi0;->m:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    iput v1, p0, Lbi0;->m:I

    .line 7
    .line 8
    new-instance v0, Lnm2;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p2, v0, Lnm2;->h:I

    .line 14
    .line 15
    iput p3, v0, Lnm2;->i:I

    .line 16
    .line 17
    iget-object p3, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    or-int/lit8 p1, p1, -0x80

    .line 23
    .line 24
    int-to-byte p1, p1

    .line 25
    iget-object p3, p0, Lbi0;->h:Le9;

    .line 26
    .line 27
    iget-object p3, p3, Le9;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p3, [B

    .line 30
    .line 31
    aget-byte v0, p3, p2

    .line 32
    .line 33
    and-int/lit8 v1, p2, 0x7

    .line 34
    .line 35
    shl-int/lit8 v1, v1, 0x3

    .line 36
    .line 37
    iget-wide v2, p0, Lbi0;->e:J

    .line 38
    .line 39
    xor-int/2addr v0, p1

    .line 40
    int-to-long v4, v0

    .line 41
    const-wide/16 v6, 0xff

    .line 42
    .line 43
    and-long/2addr v4, v6

    .line 44
    shl-long v0, v4, v1

    .line 45
    .line 46
    xor-long/2addr v0, v2

    .line 47
    iput-wide v0, p0, Lbi0;->e:J

    .line 48
    .line 49
    aput-byte p1, p3, p2

    .line 50
    .line 51
    iput p2, p0, Lbi0;->u:I

    .line 52
    .line 53
    return-void
.end method

.method public final i(Ljava/nio/MappedByteBuffer;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-wide v1, p0, Lbi0;->e:J

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lbi0;->u:I

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lbi0;->h:Le9;

    .line 12
    .line 13
    iget-object v1, v1, Le9;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, [B

    .line 16
    .line 17
    aget-byte v1, v1, v0

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget v0, p0, Lbi0;->j:I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lbi0;->i:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 32
    .line 33
    iget-object v0, v0, Le9;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [B

    .line 36
    .line 37
    iget v1, p0, Lbi0;->i:I

    .line 38
    .line 39
    iget p0, p0, Lbi0;->j:I

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1, p0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final j(BI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lbi0;->e:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    invoke-static {v2, v3, p2}, Lte;->f0(JI)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    xor-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Lbi0;->e:J

    .line 11
    .line 12
    iget v2, p0, Lbi0;->v:I

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 28
    .line 29
    iget-wide v1, p0, Lbi0;->e:J

    .line 30
    .line 31
    invoke-virtual {v0, v3, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 41
    .line 42
    invoke-virtual {v2, v0, v1, v3}, Le9;->r(JI)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 46
    .line 47
    iget-object p0, p0, Le9;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, [B

    .line 50
    .line 51
    aput-byte p1, p0, p2

    .line 52
    .line 53
    return-void
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lbi0;->e:J

    .line 2
    .line 3
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 4
    .line 5
    iget v3, p0, Lbi0;->i:I

    .line 6
    .line 7
    iget v4, p0, Lbi0;->j:I

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, Le9;->f(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    xor-long/2addr v0, v2

    .line 14
    iput-wide v0, p0, Lbi0;->e:J

    .line 15
    .line 16
    iget v0, p0, Lbi0;->d:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0xc

    .line 19
    .line 20
    iget v1, p0, Lbi0;->v:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lbi0;->i(Ljava/nio/MappedByteBuffer;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lbi0;->i(Ljava/nio/MappedByteBuffer;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v1, p0, Lbi0;->h:Le9;

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, Le9;->q(II)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    iget-wide v3, p0, Lbi0;->e:J

    .line 61
    .line 62
    invoke-virtual {v0, v3, v4, v1}, Le9;->r(JI)V

    .line 63
    .line 64
    .line 65
    :goto_0
    iput v2, p0, Lbi0;->u:I

    .line 66
    .line 67
    iput v2, p0, Lbi0;->j:I

    .line 68
    .line 69
    return-void
.end method

.method public final l(IIJ)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lbi0;->e:J

    .line 2
    .line 3
    invoke-static {p3, p4, p2}, Lte;->f0(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    xor-long/2addr p3, v0

    .line 8
    iput-wide p3, p0, Lbi0;->e:J

    .line 9
    .line 10
    iget v0, p0, Lbi0;->v:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p3, p2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p3, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lbi0;->e:J

    .line 28
    .line 29
    invoke-virtual {p3, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p3, p2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 39
    .line 40
    invoke-virtual {v0, p3, p4, v1}, Le9;->r(JI)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 44
    .line 45
    invoke-virtual {p0, p2, p1}, Le9;->q(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final m(IJJ)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lbi0;->e:J

    .line 2
    .line 3
    invoke-static {p4, p5, p1}, Lte;->f0(JI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p4

    .line 7
    xor-long/2addr p4, v0

    .line 8
    iput-wide p4, p0, Lbi0;->e:J

    .line 9
    .line 10
    iget v0, p0, Lbi0;->v:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p4, p5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p4, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p4, p1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p4, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lbi0;->e:J

    .line 28
    .line 29
    invoke-virtual {p4, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p4, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2, p3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 39
    .line 40
    invoke-virtual {v0, p4, p5, v1}, Le9;->r(JI)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 44
    .line 45
    invoke-virtual {p0, p2, p3, p1}, Le9;->r(JI)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final n(Ljava/lang/String;[BB)I
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const v1, 0xffff

    .line 3
    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    const/4 v2, 0x6

    .line 15
    if-eq p3, v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    if-eq p3, v2, :cond_2

    .line 19
    .line 20
    if-eq p3, v1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/16 p3, 0xb

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const/16 p3, 0xa

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    const/16 p3, 0x9

    .line 30
    .line 31
    :cond_4
    :goto_1
    const/4 v2, 0x2

    .line 32
    if-eqz v0, :cond_5

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_2

    .line 36
    :cond_5
    move v3, v2

    .line 37
    :goto_2
    array-length v4, p2

    .line 38
    add-int/2addr v3, v4

    .line 39
    invoke-virtual {p0, p1, p3, v3}, Lbi0;->o(Ljava/lang/String;BI)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lbi0;->h:Le9;

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    array-length p3, p2

    .line 47
    invoke-virtual {p1, p3}, Le9;->p(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_6
    array-length p3, p2

    .line 52
    int-to-short p3, p3

    .line 53
    iget-object v0, p1, Le9;->k:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, [B

    .line 56
    .line 57
    iget v3, p1, Le9;->i:I

    .line 58
    .line 59
    add-int/lit8 v4, v3, 0x1

    .line 60
    .line 61
    iput v4, p1, Le9;->i:I

    .line 62
    .line 63
    int-to-byte v5, p3

    .line 64
    aput-byte v5, v0, v3

    .line 65
    .line 66
    add-int/2addr v3, v2

    .line 67
    iput v3, p1, Le9;->i:I

    .line 68
    .line 69
    shr-int/lit8 p1, p3, 0x8

    .line 70
    .line 71
    int-to-byte p1, p1

    .line 72
    aput-byte p1, v0, v4

    .line 73
    .line 74
    :goto_3
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 75
    .line 76
    iget p1, p0, Le9;->i:I

    .line 77
    .line 78
    invoke-virtual {p0, p2}, Le9;->o([B)V

    .line 79
    .line 80
    .line 81
    return p1
.end method

.method public final o(Ljava/lang/String;BI)V
    .locals 6

    .line 1
    invoke-static {p1}, Le9;->l(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xff

    .line 6
    .line 7
    if-gt v0, v1, :cond_5

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    add-int/2addr v1, p3

    .line 12
    iput v1, p0, Lbi0;->j:I

    .line 13
    .line 14
    iget-object p3, p0, Lbi0;->h:Le9;

    .line 15
    .line 16
    iget-object p3, p3, Le9;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p3, [B

    .line 19
    .line 20
    array-length p3, p3

    .line 21
    iget v2, p0, Lbi0;->d:I

    .line 22
    .line 23
    add-int/2addr v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-lt v2, p3, :cond_3

    .line 26
    .line 27
    iget v4, p0, Lbi0;->m:I

    .line 28
    .line 29
    if-le v4, v1, :cond_0

    .line 30
    .line 31
    const/16 v5, 0x2000

    .line 32
    .line 33
    if-le v4, v5, :cond_0

    .line 34
    .line 35
    invoke-static {p0, v1}, Ltp0;->t(Lbi0;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {p3, v2}, Lte;->G(II)I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    new-array v1, p3, [B

    .line 44
    .line 45
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 46
    .line 47
    iget-object v2, v2, Le9;->k:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, [B

    .line 50
    .line 51
    iget v4, p0, Lbi0;->d:I

    .line 52
    .line 53
    invoke-static {v2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 57
    .line 58
    iput-object v1, v2, Le9;->k:Ljava/lang/Object;

    .line 59
    .line 60
    iget v1, p0, Lbi0;->v:I

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Lbi0;->q:Ljava/nio/channels/FileChannel;

    .line 65
    .line 66
    invoke-static {v1, p3}, Lte;->a0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, p0, Lbi0;->r:Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    invoke-static {v2, p3}, Lte;->a0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    if-nez p3, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iput-object v1, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 82
    .line 83
    iput-object p3, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_0
    new-instance p3, Ljava/lang/Exception;

    .line 87
    .line 88
    const-string v1, "map failed"

    .line 89
    .line 90
    invoke-direct {p3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "FastKV"

    .line 94
    .line 95
    iget-object v2, p0, Lbi0;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1, v2, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    .line 99
    .line 100
    iget p3, p0, Lbi0;->d:I

    .line 101
    .line 102
    add-int/lit8 p3, p3, -0xc

    .line 103
    .line 104
    iget-object v1, p0, Lbi0;->h:Le9;

    .line 105
    .line 106
    invoke-virtual {v1, v3, p3}, Le9;->q(II)V

    .line 107
    .line 108
    .line 109
    iget-object p3, p0, Lbi0;->h:Le9;

    .line 110
    .line 111
    const/4 v1, 0x4

    .line 112
    iget-wide v4, p0, Lbi0;->e:J

    .line 113
    .line 114
    invoke-virtual {p3, v4, v5, v1}, Le9;->r(JI)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Lte;->k0(Lbi0;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    iget p3, p0, Lbi0;->d:I

    .line 121
    .line 122
    iput p3, p0, Lbi0;->i:I

    .line 123
    .line 124
    iget v1, p0, Lbi0;->j:I

    .line 125
    .line 126
    add-int/2addr v1, p3

    .line 127
    iput v1, p0, Lbi0;->d:I

    .line 128
    .line 129
    iget-object v1, p0, Lbi0;->h:Le9;

    .line 130
    .line 131
    iget-object v2, v1, Le9;->k:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, [B

    .line 134
    .line 135
    add-int/lit8 v4, p3, 0x1

    .line 136
    .line 137
    iput v4, v1, Le9;->i:I

    .line 138
    .line 139
    aput-byte p2, v2, p3

    .line 140
    .line 141
    int-to-byte p2, v0

    .line 142
    add-int/lit8 p3, p3, 0x2

    .line 143
    .line 144
    iput p3, v1, Le9;->i:I

    .line 145
    .line 146
    aput-byte p2, v2, v4

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    iget-object p3, p0, Lbi0;->h:Le9;

    .line 153
    .line 154
    if-ne v0, p2, :cond_4

    .line 155
    .line 156
    iget-object p2, p3, Le9;->k:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p2, [B

    .line 159
    .line 160
    iget p3, p3, Le9;->i:I

    .line 161
    .line 162
    invoke-virtual {p1, v3, v0, p2, p3}, Ljava/lang/String;->getBytes(II[BI)V

    .line 163
    .line 164
    .line 165
    iget-object p0, p0, Lbi0;->h:Le9;

    .line 166
    .line 167
    iget p1, p0, Le9;->i:I

    .line 168
    .line 169
    add-int/2addr p1, v0

    .line 170
    iput p1, p0, Le9;->i:I

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-virtual {p3, p1}, Le9;->s(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_2
    return-void

    .line 177
    :cond_5
    const-string p0, "key\'s length must less than 256"

    .line 178
    .line 179
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final declared-synchronized putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqz;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lqz;->a()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_0
    check-cast v0, Lrz;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lbi0;->y:[I

    .line 34
    .line 35
    aget v0, v0, v1

    .line 36
    .line 37
    invoke-virtual {p0, p1, v1, v0}, Lbi0;->o(Ljava/lang/String;BI)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 41
    .line 42
    iget v1, v0, Le9;->i:I

    .line 43
    .line 44
    int-to-byte v2, p2

    .line 45
    iget-object v3, v0, Le9;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, [B

    .line 48
    .line 49
    add-int/lit8 v4, v1, 0x1

    .line 50
    .line 51
    iput v4, v0, Le9;->i:I

    .line 52
    .line 53
    aput-byte v2, v3, v1

    .line 54
    .line 55
    invoke-virtual {p0}, Lbi0;->k()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v2, Lrz;

    .line 61
    .line 62
    invoke-direct {v2, v1, p2}, Lrz;-><init>(IZ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    iget-boolean v1, v0, Lrz;->b:Z

    .line 73
    .line 74
    if-eq v1, p2, :cond_2

    .line 75
    .line 76
    iput-boolean p2, v0, Lrz;->b:Z

    .line 77
    .line 78
    int-to-byte p2, p2

    .line 79
    iget v0, v0, Lqz;->a:I

    .line 80
    .line 81
    invoke-virtual {p0, p2, v0}, Lbi0;->j(BI)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    monitor-exit p0

    .line 88
    return-object p0

    .line 89
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    throw p1
.end method

.method public final declared-synchronized putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqz;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lqz;->a()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_0
    check-cast v0, Ltz;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lbi0;->y:[I

    .line 34
    .line 35
    aget v0, v0, v1

    .line 36
    .line 37
    invoke-virtual {p0, p1, v1, v0}, Lbi0;->o(Ljava/lang/String;BI)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 41
    .line 42
    iget v1, v0, Le9;->i:I

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v0, v2}, Le9;->p(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lbi0;->k()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 55
    .line 56
    new-instance v2, Ltz;

    .line 57
    .line 58
    invoke-direct {v2, p2, v1}, Ltz;-><init>(FI)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget v1, v0, Ltz;->b:F

    .line 69
    .line 70
    cmpl-float v1, v1, p2

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    iget-object v2, p0, Lbi0;->h:Le9;

    .line 79
    .line 80
    iget v3, v0, Lqz;->a:I

    .line 81
    .line 82
    iget-object v2, v2, Le9;->k:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, [B

    .line 85
    .line 86
    add-int/lit8 v4, v3, 0x1

    .line 87
    .line 88
    aget-byte v5, v2, v3

    .line 89
    .line 90
    and-int/lit16 v5, v5, 0xff

    .line 91
    .line 92
    add-int/lit8 v6, v3, 0x2

    .line 93
    .line 94
    aget-byte v4, v2, v4

    .line 95
    .line 96
    and-int/lit16 v4, v4, 0xff

    .line 97
    .line 98
    shl-int/lit8 v4, v4, 0x8

    .line 99
    .line 100
    or-int/2addr v4, v5

    .line 101
    add-int/lit8 v5, v3, 0x3

    .line 102
    .line 103
    aget-byte v6, v2, v6

    .line 104
    .line 105
    and-int/lit16 v6, v6, 0xff

    .line 106
    .line 107
    shl-int/lit8 v6, v6, 0x10

    .line 108
    .line 109
    or-int/2addr v4, v6

    .line 110
    aget-byte v2, v2, v5

    .line 111
    .line 112
    shl-int/lit8 v2, v2, 0x18

    .line 113
    .line 114
    or-int/2addr v2, v4

    .line 115
    xor-int/2addr v2, v1

    .line 116
    int-to-long v4, v2

    .line 117
    const-wide v6, 0xffffffffL

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    and-long/2addr v4, v6

    .line 123
    iput p2, v0, Ltz;->b:F

    .line 124
    .line 125
    invoke-virtual {p0, v1, v3, v4, v5}, Lbi0;->l(IIJ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    .line 131
    :cond_2
    :goto_1
    monitor-exit p0

    .line 132
    return-object p0

    .line 133
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 134
    throw p1
.end method

.method public final declared-synchronized putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqz;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lqz;->a()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :goto_0
    check-cast v0, Luz;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lbi0;->y:[I

    .line 34
    .line 35
    aget v0, v0, v1

    .line 36
    .line 37
    invoke-virtual {p0, p1, v1, v0}, Lbi0;->o(Ljava/lang/String;BI)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 41
    .line 42
    iget v1, v0, Le9;->i:I

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Le9;->p(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lbi0;->k()V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 51
    .line 52
    new-instance v2, Luz;

    .line 53
    .line 54
    invoke-direct {v2, v1, p2}, Luz;-><init>(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    iget v1, v0, Luz;->b:I

    .line 65
    .line 66
    if-eq v1, p2, :cond_2

    .line 67
    .line 68
    xor-int/2addr v1, p2

    .line 69
    int-to-long v1, v1

    .line 70
    const-wide v3, 0xffffffffL

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v1, v3

    .line 76
    iput p2, v0, Luz;->b:I

    .line 77
    .line 78
    iget v0, v0, Lqz;->a:I

    .line 79
    .line 80
    invoke-virtual {p0, p2, v0, v1, v2}, Lbi0;->l(IIJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_1
    monitor-exit p0

    .line 87
    return-object p0

    .line 88
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    throw p1
.end method

.method public final declared-synchronized putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lqz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_1
    invoke-virtual {v0}, Lqz;->a()B

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eq v2, v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p1, v0

    .line 29
    move-object v4, p0

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    :goto_0
    :try_start_2
    check-cast v0, Lvz;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    :try_start_3
    sget-object v0, Lbi0;->y:[I

    .line 36
    .line 37
    aget v0, v0, v1

    .line 38
    .line 39
    invoke-virtual {p0, p1, v1, v0}, Lbi0;->o(Ljava/lang/String;BI)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lbi0;->h:Le9;

    .line 43
    .line 44
    iget v1, v0, Le9;->i:I

    .line 45
    .line 46
    invoke-virtual {v0, p2, p3, v1}, Le9;->r(JI)V

    .line 47
    .line 48
    .line 49
    iget v2, v0, Le9;->i:I

    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x8

    .line 52
    .line 53
    iput v2, v0, Le9;->i:I

    .line 54
    .line 55
    invoke-virtual {p0}, Lbi0;->k()V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 59
    .line 60
    new-instance v2, Lvz;

    .line 61
    .line 62
    invoke-direct {v2, p2, p3, v1}, Lvz;-><init>(JI)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    .line 70
    .line 71
    :cond_1
    move-object v4, p0

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    :try_start_4
    iget-wide v1, v0, Lvz;->b:J

    .line 74
    .line 75
    cmp-long v3, v1, p2

    .line 76
    .line 77
    if-eqz v3, :cond_1

    .line 78
    .line 79
    xor-long v8, p2, v1

    .line 80
    .line 81
    iput-wide p2, v0, Lvz;->b:J

    .line 82
    .line 83
    iget v5, v0, Lqz;->a:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 84
    .line 85
    move-object v4, p0

    .line 86
    move-wide v6, p2

    .line 87
    :try_start_5
    invoke-virtual/range {v4 .. v9}, Lbi0;->m(IJJ)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, p1}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :catchall_1
    move-exception v0

    .line 95
    :goto_1
    move-object p1, v0

    .line 96
    goto :goto_3

    .line 97
    :catchall_2
    move-exception v0

    .line 98
    move-object v4, p0

    .line 99
    goto :goto_1

    .line 100
    :goto_2
    monitor-exit v4

    .line 101
    return-object v4

    .line 102
    :goto_3
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 103
    throw p1
.end method

.method public final declared-synchronized putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Lbi0;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    move-object v1, p0

    .line 11
    goto :goto_2

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    move-object p1, v0

    .line 14
    move-object v1, p0

    .line 15
    goto :goto_4

    .line 16
    :cond_0
    :try_start_2
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lqz;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    :try_start_3
    invoke-virtual {v0}, Lqz;->a()B

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const/4 v2, 0x6

    .line 31
    if-eq v1, v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    :cond_1
    :try_start_4
    move-object v5, v0

    .line 38
    check-cast v5, Lxz;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    :try_start_5
    iget-boolean v0, v5, Lyz;->e:Z

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object v0, v5, Lyz;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    :try_start_6
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    :try_start_7
    sget-object v0, Lbi0;->x:[B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 63
    .line 64
    :goto_0
    move-object v4, v0

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    :try_start_8
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 67
    .line 68
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 69
    .line 70
    .line 71
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 72
    goto :goto_0

    .line 73
    :goto_1
    if-nez v4, :cond_4

    .line 74
    .line 75
    :try_start_9
    new-instance p1, Ljava/lang/Exception;

    .line 76
    .line 77
    const-string p2, "Encrypt failed"

    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const-string p2, "FastKV"

    .line 83
    .line 84
    iget-object v0, p0, Lbi0;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 87
    .line 88
    .line 89
    monitor-exit p0

    .line 90
    return-object p0

    .line 91
    :cond_4
    const/4 v6, 0x6

    .line 92
    move-object v1, p0

    .line 93
    move-object v2, p1

    .line 94
    move-object v3, p2

    .line 95
    :try_start_a
    invoke-virtual/range {v1 .. v6}, Lbi0;->a(Ljava/lang/String;Ljava/lang/Object;[BLyz;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lbi0;->e(Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 99
    .line 100
    .line 101
    :goto_2
    monitor-exit v1

    .line 102
    return-object v1

    .line 103
    :catchall_1
    move-exception v0

    .line 104
    :goto_3
    move-object p1, v0

    .line 105
    goto :goto_4

    .line 106
    :catchall_2
    move-exception v0

    .line 107
    move-object v1, p0

    .line 108
    goto :goto_3

    .line 109
    :goto_4
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 110
    throw p1
.end method

.method public final declared-synchronized putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lbi0;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    sget-object v0, Lov2;->a:Lov2;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, v0}, Lbi0;->g(Ljava/lang/String;Ljava/lang/Object;Lov2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    :goto_0
    monitor-exit p0

    .line 16
    return-object p0

    .line 17
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final declared-synchronized registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
.end method

.method public final declared-synchronized remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lqz;

    .line 9
    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    iget-object v1, p0, Lbi0;->f:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lqz;->a()B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x5

    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x0

    .line 24
    if-gt v1, v2, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Le9;->l(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget v0, v0, Lqz;->a:I

    .line 31
    .line 32
    add-int/2addr p1, v3

    .line 33
    sub-int p1, v0, p1

    .line 34
    .line 35
    sget-object v2, Lbi0;->y:[I

    .line 36
    .line 37
    aget v2, v2, v1

    .line 38
    .line 39
    add-int/2addr v0, v2

    .line 40
    invoke-virtual {p0, v1, p1, v0}, Lbi0;->h(BII)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_0
    check-cast v0, Lyz;

    .line 48
    .line 49
    iget p1, v0, Lyz;->c:I

    .line 50
    .line 51
    iget v2, v0, Lqz;->a:I

    .line 52
    .line 53
    iget v5, v0, Lyz;->d:I

    .line 54
    .line 55
    add-int/2addr v2, v5

    .line 56
    invoke-virtual {p0, v1, p1, v2}, Lbi0;->h(BII)V

    .line 57
    .line 58
    .line 59
    iget-boolean p1, v0, Lyz;->e:Z

    .line 60
    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    iget-object p1, v0, Lyz;->b:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, p1

    .line 66
    check-cast v4, Ljava/lang/String;

    .line 67
    .line 68
    :cond_1
    :goto_0
    or-int/lit8 p1, v1, -0x80

    .line 69
    .line 70
    int-to-byte p1, p1

    .line 71
    iget v0, p0, Lbi0;->v:I

    .line 72
    .line 73
    const/4 v1, 0x4

    .line 74
    if-nez v0, :cond_2

    .line 75
    .line 76
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 77
    .line 78
    iget-wide v5, p0, Lbi0;->e:J

    .line 79
    .line 80
    invoke-virtual {v0, v1, v5, v6}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, Lbi0;->s:Ljava/nio/MappedByteBuffer;

    .line 84
    .line 85
    iget v2, p0, Lbi0;->u:I

    .line 86
    .line 87
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 91
    .line 92
    iget-wide v5, p0, Lbi0;->e:J

    .line 93
    .line 94
    invoke-virtual {v0, v1, v5, v6}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lbi0;->t:Ljava/nio/MappedByteBuffer;

    .line 98
    .line 99
    iget v1, p0, Lbi0;->u:I

    .line 100
    .line 101
    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object p1, p0, Lbi0;->h:Le9;

    .line 106
    .line 107
    iget-wide v5, p0, Lbi0;->e:J

    .line 108
    .line 109
    invoke-virtual {p1, v5, v6, v1}, Le9;->r(JI)V

    .line 110
    .line 111
    .line 112
    :goto_1
    const/4 p1, 0x0

    .line 113
    iput p1, p0, Lbi0;->u:I

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    iget v0, p0, Lbi0;->v:I

    .line 118
    .line 119
    if-nez v0, :cond_3

    .line 120
    .line 121
    invoke-static {}, Lci0;->J()Ljava/util/concurrent/Executor;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    new-instance v1, Lt7;

    .line 126
    .line 127
    invoke-direct {v1, v3, p0, v4}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    iget-object v0, p0, Lbi0;->k:Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_4
    :goto_2
    iget v0, p0, Lbi0;->m:I

    .line 140
    .line 141
    const/16 v1, 0x2000

    .line 142
    .line 143
    if-ge v0, v1, :cond_5

    .line 144
    .line 145
    iget-object v0, p0, Lbi0;->n:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const/16 v1, 0x64

    .line 152
    .line 153
    if-lt v0, v1, :cond_6

    .line 154
    .line 155
    :cond_5
    invoke-static {p0, p1}, Ltp0;->t(Lbi0;I)V

    .line 156
    .line 157
    .line 158
    :cond_6
    iget p1, p0, Lbi0;->v:I

    .line 159
    .line 160
    if-eqz p1, :cond_7

    .line 161
    .line 162
    iget-boolean p1, p0, Lbi0;->w:Z

    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    invoke-virtual {p0}, Lbi0;->c()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    .line 169
    :cond_7
    monitor-exit p0

    .line 170
    return-object p0

    .line 171
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FastKV: path:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbi0;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " name:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lbi0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final declared-synchronized unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbi0;->o:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method
