.class public final Lac/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/content/SharedPreferences;
.implements Landroid/content/SharedPreferences$Editor;


# static fields
.field public static final A:I

.field public static final y:[B

.field public static final z:[I


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/HashMap;

.field public d:I

.field public e:J

.field public final f:Ljava/util/HashMap;

.field public volatile g:Z

.field public h:Lac/k;

.field public i:I

.field public j:I

.field public final k:Ljava/util/ArrayList;

.field public l:Z

.field public final m:Lac/q;

.field public n:I

.field public final o:Ljava/util/ArrayList;

.field public final p:Ljava/util/ArrayList;

.field public final q:Landroid/os/Handler;

.field public r:Ljava/nio/channels/FileChannel;

.field public s:Ljava/nio/channels/FileChannel;

.field public t:Ljava/nio/MappedByteBuffer;

.field public u:Ljava/nio/MappedByteBuffer;

.field public v:I

.field public w:I

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lac/o;->y:[B

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
    sput-object v0, Lac/o;->z:[I

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
    sput v0, Lac/o;->A:I

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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[Lac/s;I)V
    .locals 3

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
    iput-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lac/o;->g:Z

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lac/o;->k:Ljava/util/ArrayList;

    .line 20
    .line 21
    iput-boolean v0, p0, Lac/o;->l:Z

    .line 22
    .line 23
    new-instance v1, Lac/q;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lac/o;->m:Lac/q;

    .line 29
    .line 30
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lac/o;->o:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v1, p0, Lac/o;->p:Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance v1, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lac/o;->q:Landroid/os/Handler;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    iput-boolean v1, p0, Lac/o;->x:Z

    .line 57
    .line 58
    iput-object p1, p0, Lac/o;->a:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p2, p0, Lac/o;->b:Ljava/lang/String;

    .line 61
    .line 62
    iput p4, p0, Lac/o;->w:I

    .line 63
    .line 64
    new-instance p1, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    if-eqz p3, :cond_1

    .line 70
    .line 71
    array-length p2, p3

    .line 72
    :goto_0
    if-ge v0, p2, :cond_1

    .line 73
    .line 74
    aget-object p4, p3, v0

    .line 75
    .line 76
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v1, "StringSet"

    .line 80
    .line 81
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    const-string p4, "duplicate encoder tag:StringSet"

    .line 88
    .line 89
    invoke-static {p0, p4}, Lg4/a;->m(Lac/o;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_0
    invoke-virtual {p1, v1, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    sget-object p2, Lac/s;->a:Lac/s;

    .line 100
    .line 101
    const-string p3, "StringSet"

    .line 102
    .line 103
    invoke-virtual {p1, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lac/o;->c:Ljava/util/HashMap;

    .line 107
    .line 108
    iget-object p1, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 109
    .line 110
    monitor-enter p1

    .line 111
    :try_start_0
    invoke-static {}, Lac/p;->w()Ljava/util/concurrent/Executor;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    new-instance p3, Lac/m;

    .line 116
    .line 117
    const/4 p4, 0x1

    .line 118
    invoke-direct {p3, p0, p4}, Lac/m;-><init>(Lac/o;I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 122
    .line 123
    .line 124
    iget-boolean p2, p0, Lac/o;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    if-nez p2, :cond_2

    .line 127
    .line 128
    :try_start_1
    iget-object p2, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catchall_0
    move-exception p2

    .line 135
    goto :goto_3

    .line 136
    :catch_0
    :cond_2
    :goto_2
    :try_start_2
    monitor-exit p1

    .line 137
    return-void

    .line 138
    :goto_3
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    throw p2
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
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Object;[BLac/j;B)V
    .locals 6

    .line 1
    if-nez p4, :cond_2

    .line 2
    .line 3
    invoke-virtual {p0, p1, p3, p5}, Lac/o;->o(Ljava/lang/String;[BB)I

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
    iget v1, p0, Lac/o;->i:I

    .line 11
    .line 12
    const/4 p3, 0x6

    .line 13
    if-ne p5, p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lac/i;

    .line 16
    .line 17
    move-object v3, p2

    .line 18
    check-cast v3, Ljava/lang/String;

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

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
    new-instance v0, Lac/a;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move-object v3, p2

    .line 32
    invoke-direct/range {v0 .. v5}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, p2

    .line 37
    new-instance v0, Lac/h;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct/range {v0 .. v5}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p2, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lac/o;->l()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    move-object v3, p2

    .line 53
    iget-boolean p2, p4, Lac/j;->e:Z

    .line 54
    .line 55
    const/4 p5, 0x0

    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    iget p2, p4, Lac/j;->d:I

    .line 59
    .line 60
    array-length v0, p3

    .line 61
    if-ne p2, v0, :cond_4

    .line 62
    .line 63
    iget p1, p4, Lac/b;->a:I

    .line 64
    .line 65
    array-length p2, p3

    .line 66
    iget-wide v0, p0, Lac/o;->e:J

    .line 67
    .line 68
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 69
    .line 70
    invoke-virtual {v2, p1, p2}, Lac/k;->m(II)J

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    xor-long/2addr v0, v4

    .line 75
    iput-wide v0, p0, Lac/o;->e:J

    .line 76
    .line 77
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 78
    .line 79
    iput p1, v0, Lac/k;->h:I

    .line 80
    .line 81
    invoke-virtual {v0, p3}, Lac/k;->C([B)V

    .line 82
    .line 83
    .line 84
    iget-wide v0, p0, Lac/o;->e:J

    .line 85
    .line 86
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 87
    .line 88
    invoke-virtual {v2, p1, p2}, Lac/k;->m(II)J

    .line 89
    .line 90
    .line 91
    move-result-wide v4

    .line 92
    xor-long/2addr v0, v4

    .line 93
    iput-wide v0, p0, Lac/o;->e:J

    .line 94
    .line 95
    iget p2, p0, Lac/o;->w:I

    .line 96
    .line 97
    const/4 v2, 0x4

    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    iget-object p2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 101
    .line 102
    const/4 v0, -0x1

    .line 103
    invoke-virtual {p2, p5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 107
    .line 108
    iget-wide v0, p0, Lac/o;->e:J

    .line 109
    .line 110
    invoke-virtual {p2, v2, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 111
    .line 112
    .line 113
    iget-object p2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 116
    .line 117
    .line 118
    iget-object p2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 119
    .line 120
    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 121
    .line 122
    .line 123
    iget-object p2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 124
    .line 125
    iget v0, p0, Lac/o;->d:I

    .line 126
    .line 127
    add-int/lit8 v0, v0, -0xc

    .line 128
    .line 129
    invoke-virtual {p2, p5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 130
    .line 131
    .line 132
    iget-object p2, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 133
    .line 134
    iget-wide v0, p0, Lac/o;->e:J

    .line 135
    .line 136
    invoke-virtual {p2, v2, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    iget-object p2, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 140
    .line 141
    invoke-virtual {p2, p1}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 145
    .line 146
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-object p1, p0, Lac/o;->h:Lac/k;

    .line 151
    .line 152
    invoke-virtual {p1, v2, v0, v1}, Lac/k;->F(IJ)V

    .line 153
    .line 154
    .line 155
    :goto_1
    iput-object v3, p4, Lac/j;->b:Ljava/lang/Object;

    .line 156
    .line 157
    return-void

    .line 158
    :cond_4
    invoke-virtual {p4}, Lac/b;->a()B

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {p0, p1, p3, p2}, Lac/o;->o(Ljava/lang/String;[BB)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-lez p1, :cond_9

    .line 167
    .line 168
    iget-boolean p2, p4, Lac/j;->e:Z

    .line 169
    .line 170
    if-eqz p2, :cond_5

    .line 171
    .line 172
    iget-object p2, p4, Lac/j;->b:Ljava/lang/Object;

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
    invoke-virtual {p4}, Lac/b;->a()B

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iget v1, p4, Lac/j;->c:I

    .line 183
    .line 184
    iget v2, p4, Lac/b;->a:I

    .line 185
    .line 186
    iget v4, p4, Lac/j;->d:I

    .line 187
    .line 188
    add-int/2addr v2, v4

    .line 189
    invoke-virtual {p0, v0, v1, v2}, Lac/o;->i(BII)V

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lac/o;->i:I

    .line 193
    .line 194
    iput v0, p4, Lac/j;->c:I

    .line 195
    .line 196
    iput p1, p4, Lac/b;->a:I

    .line 197
    .line 198
    iput-boolean p5, p4, Lac/j;->e:Z

    .line 199
    .line 200
    iput-object v3, p4, Lac/j;->b:Ljava/lang/Object;

    .line 201
    .line 202
    array-length p1, p3

    .line 203
    iput p1, p4, Lac/j;->d:I

    .line 204
    .line 205
    invoke-virtual {p0}, Lac/o;->l()V

    .line 206
    .line 207
    .line 208
    iget p1, p0, Lac/o;->n:I

    .line 209
    .line 210
    const/16 p3, 0x2000

    .line 211
    .line 212
    if-ge p1, p3, :cond_6

    .line 213
    .line 214
    iget-object p1, p0, Lac/o;->o:Ljava/util/ArrayList;

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
    invoke-static {p0, p5}, Lfb/v0;->s(Lac/o;I)V

    .line 225
    .line 226
    .line 227
    :cond_7
    if-eqz p2, :cond_9

    .line 228
    .line 229
    iget p1, p0, Lac/o;->w:I

    .line 230
    .line 231
    if-nez p1, :cond_8

    .line 232
    .line 233
    invoke-static {}, Lac/p;->w()Ljava/util/concurrent/Executor;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance p3, La1/d;

    .line 238
    .line 239
    const/4 p4, 0x1

    .line 240
    invoke-direct {p3, p0, p4, p2}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

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
    iget-object p1, p0, Lac/o;->k:Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lac/o;->x:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Lac/o;->d()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    throw v0
.end method

.method public final declared-synchronized c()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lac/o;->l:Z

    .line 9
    .line 10
    iget v1, p0, Lac/o;->w:I

    .line 11
    .line 12
    if-nez v1, :cond_4

    .line 13
    .line 14
    iget-object v1, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    .line 21
    :catch_0
    :cond_1
    :try_start_2
    iget-object v1, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :try_start_3
    invoke-virtual {v1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 26
    .line 27
    .line 28
    :catch_1
    :cond_2
    :try_start_4
    iget-object v1, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    :try_start_5
    invoke-virtual {v1, v0}, Ljava/nio/channels/FileChannel;->force(Z)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 33
    .line 34
    .line 35
    :catch_2
    :cond_3
    :try_start_6
    iget-object v0, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    :try_start_7
    invoke-virtual {v0}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 40
    .line 41
    .line 42
    :catch_3
    :cond_4
    :goto_0
    :try_start_8
    const-class v0, Lac/n;

    .line 43
    .line 44
    monitor-enter v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 45
    :try_start_9
    sget-object v1, Lac/n;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v3, p0, Lac/o;->a:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lac/o;->b:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 70
    monitor-exit p0

    .line 71
    return-void

    .line 72
    :catchall_0
    move-exception v1

    .line 73
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 74
    :try_start_b
    throw v1

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    monitor-exit p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 77
    throw v0
.end method

.method public final declared-synchronized clear()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p0}, Lf8/i;->i(Lac/o;)V

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lac/o;->w:I

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lf8/i;->r(Lac/o;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, v0}, Lac/o;->g(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object p0

    .line 27
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    throw v0
.end method

.method public final declared-synchronized commit()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    :try_start_1
    iput-boolean v0, p0, Lac/o;->x:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lac/o;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    throw v0
.end method

.method public final declared-synchronized contains(Ljava/lang/String;)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

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

.method public final d()Z
    .locals 3

    .line 1
    iget v0, p0, Lac/o;->w:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lac/m;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, p0, v2}, Lac/m;-><init>(Lac/o;I)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lac/o;->m:Lac/q;

    .line 13
    .line 14
    invoke-virtual {v2, v0}, Lac/q;->execute(Ljava/lang/Runnable;)V

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
    invoke-static {p0}, Lf8/i;->T0(Lac/o;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0

    .line 26
    :cond_1
    return v1
.end method

.method public final declared-synchronized e(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lac/b;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    invoke-virtual {v0}, Lac/b;->a()B

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
    check-cast v0, Lac/h;

    .line 23
    .line 24
    iget-boolean v2, v0, Lac/j;->e:Z

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-static {p0, v0}, Lf8/i;->H(Lac/o;Lac/h;)Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
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
    iput-object v2, v0, Lac/j;->b:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, v0, Lac/j;->e:Z
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
    iget-object p1, v0, Lac/j;->b:Ljava/lang/Object;
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

.method public final edit()Landroid/content/SharedPreferences$Editor;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, Lac/o;->w:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lac/o;->x:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lac/o;->d()Z

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lac/o;->g(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final declared-synchronized g(Ljava/lang/String;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/o;->p:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lac/o;->p:Ljava/util/ArrayList;

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
    iget-object v2, p0, Lac/o;->q:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance v3, Lac/l;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v3, p0, v1, p1, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

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

.method public final declared-synchronized getAll()Ljava/util/Map;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

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
    check-cast v2, Lac/b;

    .line 64
    .line 65
    invoke-virtual {v2}, Lac/b;->a()B

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
    check-cast v4, Lac/h;

    .line 77
    .line 78
    iget-boolean v5, v4, Lac/j;->e:Z

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    invoke-static {p0, v4}, Lf8/i;->H(Lac/o;Lac/h;)Ljava/util/LinkedHashSet;

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
    check-cast v2, Lac/h;

    .line 90
    .line 91
    iget-object v2, v2, Lac/j;->b:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_1
    check-cast v2, Lac/a;

    .line 95
    .line 96
    iget-boolean v4, v2, Lac/j;->e:Z

    .line 97
    .line 98
    if-eqz v4, :cond_3

    .line 99
    .line 100
    iget-object v4, p0, Lac/o;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v2, v2, Lac/j;->b:Ljava/lang/Object;

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
    iget-object v8, p0, Lac/o;->a:Ljava/lang/String;

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
    invoke-static {v6}, Lig/a;->u(Ljava/io/File;)[B

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
    iget-object v2, v2, Lac/j;->b:Ljava/lang/Object;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_2
    check-cast v2, Lac/i;

    .line 146
    .line 147
    iget-boolean v4, v2, Lac/j;->e:Z

    .line 148
    .line 149
    if-eqz v4, :cond_4

    .line 150
    .line 151
    invoke-static {p0, v2}, Lf8/i;->J(Lac/o;Lac/i;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    goto :goto_1

    .line 156
    :cond_4
    iget-object v2, v2, Lac/j;->b:Ljava/lang/Object;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :pswitch_3
    check-cast v2, Lac/d;

    .line 160
    .line 161
    iget-wide v4, v2, Lac/d;->b:D

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
    check-cast v2, Lac/g;

    .line 169
    .line 170
    iget-wide v4, v2, Lac/g;->b:J

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
    check-cast v2, Lac/e;

    .line 178
    .line 179
    iget v2, v2, Lac/e;->b:F

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
    check-cast v2, Lac/f;

    .line 187
    .line 188
    iget v2, v2, Lac/f;->b:I

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
    check-cast v2, Lac/c;

    .line 196
    .line 197
    iget-boolean v2, v2, Lac/c;->b:Z

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lac/b;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lac/b;->b()Z

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lac/b;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lac/b;->c()F

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lac/b;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lac/b;->d()I

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lac/b;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lac/b;->e()J

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
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lac/b;
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
    invoke-virtual {v0}, Lac/b;->a()B

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
    check-cast v1, Lac/i;

    .line 23
    .line 24
    iget-boolean v2, v1, Lac/j;->e:Z

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-static {p0, v1}, Lf8/i;->J(Lac/o;Lac/i;)Ljava/lang/String;

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
    iput-object v0, v1, Lac/j;->b:Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, v1, Lac/j;->e:Z
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
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
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
    invoke-virtual {v0}, Lac/b;->f()Ljava/lang/String;

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
    invoke-virtual {p0, p1}, Lac/o;->e(Ljava/lang/String;)Ljava/lang/Object;

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

.method public final declared-synchronized h(Ljava/lang/String;Ljava/lang/Object;Lac/s;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_6

    .line 12
    .line 13
    const-string p3, "StringSet"

    .line 14
    .line 15
    iget-object v0, p0, Lac/o;->c:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    :try_start_2
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    .line 27
    .line 28
    monitor-exit p0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    move-object p1, v0

    .line 32
    move-object v2, p0

    .line 33
    goto/16 :goto_3

    .line 34
    .line 35
    :cond_1
    const/4 v1, 0x0

    .line 36
    :try_start_3
    invoke-static {p2}, Lac/s;->b(Ljava/lang/Object;)[B

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v0

    .line 42
    :try_start_4
    const-string v2, "FastKV"

    .line 43
    .line 44
    iget-object v3, p0, Lac/o;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 47
    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :goto_0
    if-nez v0, :cond_2

    .line 51
    .line 52
    :try_start_5
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 53
    .line 54
    .line 55
    monitor-exit p0

    .line 56
    return-void

    .line 57
    :cond_2
    :try_start_6
    iget-object v2, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lac/b;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    :try_start_7
    invoke-virtual {v2}, Lac/b;->a()B

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/16 v4, 0x8

    .line 72
    .line 73
    if-eq v3, v4, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move-object v1, v2

    .line 80
    :goto_1
    :try_start_8
    move-object v6, v1

    .line 81
    check-cast v6, Lac/h;

    .line 82
    .line 83
    invoke-static {p3}, Lac/k;->x(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    new-instance v2, Lac/k;

    .line 88
    .line 89
    add-int/lit8 v3, v1, 0x1

    .line 90
    .line 91
    array-length v4, v0

    .line 92
    add-int/2addr v3, v4

    .line 93
    invoke-direct {v2, v3}, Lac/k;-><init>(I)V

    .line 94
    .line 95
    .line 96
    int-to-byte v1, v1

    .line 97
    iget-object v3, v2, Lac/k;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, [B

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    iput v4, v2, Lac/k;->h:I

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    aput-byte v1, v3, v4

    .line 106
    .line 107
    invoke-virtual {v2, p3}, Lac/k;->G(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v0}, Lac/k;->C([B)V

    .line 111
    .line 112
    .line 113
    iget-object p3, v2, Lac/k;->j:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v5, p3

    .line 116
    check-cast v5, [B
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 117
    .line 118
    if-nez v5, :cond_4

    .line 119
    .line 120
    monitor-exit p0

    .line 121
    return-void

    .line 122
    :cond_4
    const/16 v7, 0x8

    .line 123
    .line 124
    move-object v2, p0

    .line 125
    move-object v3, p1

    .line 126
    move-object v4, p2

    .line 127
    :try_start_9
    invoke-virtual/range {v2 .. v7}, Lac/o;->a(Ljava/lang/String;Ljava/lang/Object;[BLac/j;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v3}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 131
    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-void

    .line 135
    :catchall_1
    move-exception v0

    .line 136
    :goto_2
    move-object p1, v0

    .line 137
    goto :goto_3

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object v2, p0

    .line 140
    goto :goto_2

    .line 141
    :cond_5
    move-object v2, p0

    .line 142
    :try_start_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string p2, "Encoder hasn\'t been registered"

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p1

    .line 150
    :cond_6
    move-object v2, p0

    .line 151
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 152
    .line 153
    const-string p2, "Encoder is null"

    .line 154
    .line 155
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :goto_3
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 160
    throw p1
.end method

.method public final i(BII)V
    .locals 8

    .line 1
    iget v0, p0, Lac/o;->n:I

    .line 2
    .line 3
    sub-int v1, p3, p2

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    iput v1, p0, Lac/o;->n:I

    .line 7
    .line 8
    new-instance v0, Lac/r;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p2, v0, Lac/r;->g:I

    .line 14
    .line 15
    iput p3, v0, Lac/r;->h:I

    .line 16
    .line 17
    iget-object p3, p0, Lac/o;->o:Ljava/util/ArrayList;

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
    iget-object p3, p0, Lac/o;->h:Lac/k;

    .line 26
    .line 27
    iget-object p3, p3, Lac/k;->j:Ljava/lang/Object;

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
    iget-wide v2, p0, Lac/o;->e:J

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
    iput-wide v0, p0, Lac/o;->e:J

    .line 48
    .line 49
    aput-byte p1, p3, p2

    .line 50
    .line 51
    iput p2, p0, Lac/o;->v:I

    .line 52
    .line 53
    return-void
.end method

.method public final j(Ljava/nio/MappedByteBuffer;)V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    iget-wide v1, p0, Lac/o;->e:J

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lac/o;->v:I

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lac/o;->h:Lac/k;

    .line 12
    .line 13
    iget-object v1, v1, Lac/k;->j:Ljava/lang/Object;

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
    iget v0, p0, Lac/o;->j:I

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lac/o;->i:I

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/nio/Buffer;->position(I)Ljava/nio/Buffer;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 32
    .line 33
    iget-object v0, v0, Lac/k;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, [B

    .line 36
    .line 37
    iget v1, p0, Lac/o;->i:I

    .line 38
    .line 39
    iget v2, p0, Lac/o;->j:I

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final k(BI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lac/o;->e:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    invoke-static {p2, v2, v3}, Lf8/i;->H0(IJ)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    xor-long/2addr v0, v2

    .line 10
    iput-wide v0, p0, Lac/o;->e:J

    .line 11
    .line 12
    iget v2, p0, Lac/o;->w:I

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 18
    .line 19
    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 23
    .line 24
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 28
    .line 29
    iget-wide v1, p0, Lac/o;->e:J

    .line 30
    .line 31
    invoke-virtual {v0, v3, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 35
    .line 36
    invoke-virtual {v0, p2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v0, v1}, Lac/k;->F(IJ)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 46
    .line 47
    iget-object v0, v0, Lac/k;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, [B

    .line 50
    .line 51
    aput-byte p1, v0, p2

    .line 52
    .line 53
    return-void
.end method

.method public final l()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lac/o;->e:J

    .line 2
    .line 3
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 4
    .line 5
    iget v3, p0, Lac/o;->i:I

    .line 6
    .line 7
    iget v4, p0, Lac/o;->j:I

    .line 8
    .line 9
    invoke-virtual {v2, v3, v4}, Lac/k;->m(II)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    xor-long/2addr v0, v2

    .line 14
    iput-wide v0, p0, Lac/o;->e:J

    .line 15
    .line 16
    iget v0, p0, Lac/o;->d:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0xc

    .line 19
    .line 20
    iget v1, p0, Lac/o;->w:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    const/4 v3, -0x1

    .line 28
    invoke-virtual {v1, v2, v3}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lac/o;->j(Ljava/nio/MappedByteBuffer;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lac/o;->j(Ljava/nio/MappedByteBuffer;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v1, p0, Lac/o;->h:Lac/k;

    .line 53
    .line 54
    invoke-virtual {v1, v2, v0}, Lac/k;->E(II)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    iget-wide v3, p0, Lac/o;->e:J

    .line 61
    .line 62
    invoke-virtual {v0, v1, v3, v4}, Lac/k;->F(IJ)V

    .line 63
    .line 64
    .line 65
    :goto_0
    iput v2, p0, Lac/o;->v:I

    .line 66
    .line 67
    iput v2, p0, Lac/o;->j:I

    .line 68
    .line 69
    return-void
.end method

.method public final m(IIJ)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lac/o;->e:J

    .line 2
    .line 3
    invoke-static {p2, p3, p4}, Lf8/i;->H0(IJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    xor-long/2addr p3, v0

    .line 8
    iput-wide p3, p0, Lac/o;->e:J

    .line 9
    .line 10
    iget v0, p0, Lac/o;->w:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p3, p2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p3, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lac/o;->e:J

    .line 28
    .line 29
    invoke-virtual {p3, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p3, p2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p3, p4}, Lac/k;->F(IJ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p3, p0, Lac/o;->h:Lac/k;

    .line 44
    .line 45
    invoke-virtual {p3, p2, p1}, Lac/k;->E(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final n(JJI)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lac/o;->e:J

    .line 2
    .line 3
    invoke-static {p5, p3, p4}, Lf8/i;->H0(IJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    xor-long/2addr p3, v0

    .line 8
    iput-wide p3, p0, Lac/o;->e:J

    .line 9
    .line 10
    iget v0, p0, Lac/o;->w:I

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 21
    .line 22
    invoke-virtual {p3, p5, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    .line 25
    iget-object p3, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 26
    .line 27
    iget-wide v2, p0, Lac/o;->e:J

    .line 28
    .line 29
    invoke-virtual {p3, v1, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p3, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 33
    .line 34
    invoke-virtual {p3, p5, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 39
    .line 40
    invoke-virtual {v0, v1, p3, p4}, Lac/k;->F(IJ)V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p3, p0, Lac/o;->h:Lac/k;

    .line 44
    .line 45
    invoke-virtual {p3, p5, p1, p2}, Lac/k;->F(IJ)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final o(Ljava/lang/String;[BB)I
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
    invoke-virtual {p0, p3, v3, p1}, Lac/o;->p(BILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lac/o;->h:Lac/k;

    .line 43
    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    array-length p3, p2

    .line 47
    invoke-virtual {p1, p3}, Lac/k;->D(I)V

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
    iget-object v0, p1, Lac/k;->j:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, [B

    .line 56
    .line 57
    iget v3, p1, Lac/k;->h:I

    .line 58
    .line 59
    add-int/lit8 v4, v3, 0x1

    .line 60
    .line 61
    iput v4, p1, Lac/k;->h:I

    .line 62
    .line 63
    int-to-byte v5, p3

    .line 64
    aput-byte v5, v0, v3

    .line 65
    .line 66
    add-int/2addr v3, v2

    .line 67
    iput v3, p1, Lac/k;->h:I

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
    iget-object p1, p0, Lac/o;->h:Lac/k;

    .line 75
    .line 76
    iget p3, p1, Lac/k;->h:I

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Lac/k;->C([B)V

    .line 79
    .line 80
    .line 81
    return p3
.end method

.method public final p(BILjava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p3}, Lac/k;->x(Ljava/lang/String;)I

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
    add-int/2addr v1, p2

    .line 12
    iput v1, p0, Lac/o;->j:I

    .line 13
    .line 14
    iget-object p2, p0, Lac/o;->h:Lac/k;

    .line 15
    .line 16
    iget-object p2, p2, Lac/k;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, [B

    .line 19
    .line 20
    array-length p2, p2

    .line 21
    iget v2, p0, Lac/o;->d:I

    .line 22
    .line 23
    add-int/2addr v2, v1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-lt v2, p2, :cond_3

    .line 26
    .line 27
    iget v4, p0, Lac/o;->n:I

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
    invoke-static {p0, v1}, Lfb/v0;->s(Lac/o;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {p2, v2}, Lf8/i;->G(II)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    new-array v1, p2, [B

    .line 44
    .line 45
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 46
    .line 47
    iget-object v2, v2, Lac/k;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, [B

    .line 50
    .line 51
    iget v4, p0, Lac/o;->d:I

    .line 52
    .line 53
    invoke-static {v2, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    .line 56
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 57
    .line 58
    iput-object v1, v2, Lac/k;->j:Ljava/lang/Object;

    .line 59
    .line 60
    iget v1, p0, Lac/o;->w:I

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    iget-object v1, p0, Lac/o;->r:Ljava/nio/channels/FileChannel;

    .line 65
    .line 66
    invoke-static {v1, p2}, Lf8/i;->v0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v2, p0, Lac/o;->s:Ljava/nio/channels/FileChannel;

    .line 71
    .line 72
    invoke-static {v2, p2}, Lf8/i;->v0(Ljava/nio/channels/FileChannel;I)Ljava/nio/MappedByteBuffer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    if-nez p2, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    iput-object v1, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 82
    .line 83
    iput-object p2, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    :goto_0
    new-instance p2, Ljava/lang/Exception;

    .line 87
    .line 88
    const-string v1, "map failed"

    .line 89
    .line 90
    invoke-direct {p2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "FastKV"

    .line 94
    .line 95
    iget-object v2, p0, Lac/o;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v1, v2, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 98
    .line 99
    .line 100
    iget p2, p0, Lac/o;->d:I

    .line 101
    .line 102
    add-int/lit8 p2, p2, -0xc

    .line 103
    .line 104
    iget-object v1, p0, Lac/o;->h:Lac/k;

    .line 105
    .line 106
    invoke-virtual {v1, v3, p2}, Lac/k;->E(II)V

    .line 107
    .line 108
    .line 109
    iget-object p2, p0, Lac/o;->h:Lac/k;

    .line 110
    .line 111
    const/4 v1, 0x4

    .line 112
    iget-wide v4, p0, Lac/o;->e:J

    .line 113
    .line 114
    invoke-virtual {p2, v1, v4, v5}, Lac/k;->F(IJ)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Lf8/i;->J0(Lac/o;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_1
    iget p2, p0, Lac/o;->d:I

    .line 121
    .line 122
    iput p2, p0, Lac/o;->i:I

    .line 123
    .line 124
    iget v1, p0, Lac/o;->j:I

    .line 125
    .line 126
    add-int/2addr v1, p2

    .line 127
    iput v1, p0, Lac/o;->d:I

    .line 128
    .line 129
    iget-object v1, p0, Lac/o;->h:Lac/k;

    .line 130
    .line 131
    iget-object v2, v1, Lac/k;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v2, [B

    .line 134
    .line 135
    add-int/lit8 v4, p2, 0x1

    .line 136
    .line 137
    iput v4, v1, Lac/k;->h:I

    .line 138
    .line 139
    aput-byte p1, v2, p2

    .line 140
    .line 141
    int-to-byte p1, v0

    .line 142
    add-int/lit8 p2, p2, 0x2

    .line 143
    .line 144
    iput p2, v1, Lac/k;->h:I

    .line 145
    .line 146
    aput-byte p1, v2, v4

    .line 147
    .line 148
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iget-object p2, p0, Lac/o;->h:Lac/k;

    .line 153
    .line 154
    if-ne v0, p1, :cond_4

    .line 155
    .line 156
    iget-object p1, p2, Lac/k;->j:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p1, [B

    .line 159
    .line 160
    iget p2, p2, Lac/k;->h:I

    .line 161
    .line 162
    invoke-virtual {p3, v3, v0, p1, p2}, Ljava/lang/String;->getBytes(II[BI)V

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, Lac/o;->h:Lac/k;

    .line 166
    .line 167
    iget p2, p1, Lac/k;->h:I

    .line 168
    .line 169
    add-int/2addr p2, v0

    .line 170
    iput p2, p1, Lac/k;->h:I

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_4
    invoke-virtual {p2, p3}, Lac/k;->G(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :goto_2
    return-void

    .line 177
    :cond_5
    const-string p1, "key\'s length must less than 256"

    .line 178
    .line 179
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

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
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lac/b;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lac/b;->a()B

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_0
    check-cast v0, Lac/c;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Lac/o;->z:[I

    .line 40
    .line 41
    aget v0, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v1, v0, p1}, Lac/o;->p(BILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 47
    .line 48
    iget v1, v0, Lac/k;->h:I

    .line 49
    .line 50
    int-to-byte v2, p2

    .line 51
    iget-object v3, v0, Lac/k;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, [B

    .line 54
    .line 55
    add-int/lit8 v4, v1, 0x1

    .line 56
    .line 57
    iput v4, v0, Lac/k;->h:I

    .line 58
    .line 59
    aput-byte v2, v3, v1

    .line 60
    .line 61
    invoke-virtual {p0}, Lac/o;->l()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 65
    .line 66
    new-instance v2, Lac/c;

    .line 67
    .line 68
    invoke-direct {v2, v1, p2}, Lac/c;-><init>(IZ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    iget-boolean v1, v0, Lac/c;->b:Z

    .line 79
    .line 80
    if-eq v1, p2, :cond_3

    .line 81
    .line 82
    iput-boolean p2, v0, Lac/c;->b:Z

    .line 83
    .line 84
    int-to-byte p2, p2

    .line 85
    iget v0, v0, Lac/b;->a:I

    .line 86
    .line 87
    invoke-virtual {p0, p2, v0}, Lac/o;->k(BI)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    .line 92
    .line 93
    :cond_3
    :goto_1
    monitor-exit p0

    .line 94
    return-object p0

    .line 95
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    throw p1
.end method

.method public final declared-synchronized putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lac/b;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lac/b;->a()B

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_0
    check-cast v0, Lac/e;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Lac/o;->z:[I

    .line 40
    .line 41
    aget v0, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v1, v0, p1}, Lac/o;->p(BILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 47
    .line 48
    iget v1, v0, Lac/k;->h:I

    .line 49
    .line 50
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v0, v2}, Lac/k;->D(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lac/o;->l()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 61
    .line 62
    new-instance v2, Lac/e;

    .line 63
    .line 64
    invoke-direct {v2, v1, p2}, Lac/e;-><init>(IF)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget v1, v0, Lac/e;->b:F

    .line 75
    .line 76
    cmpl-float v1, v1, p2

    .line 77
    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    iget-object v2, p0, Lac/o;->h:Lac/k;

    .line 85
    .line 86
    iget v3, v0, Lac/b;->a:I

    .line 87
    .line 88
    iget-object v2, v2, Lac/k;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, [B

    .line 91
    .line 92
    add-int/lit8 v4, v3, 0x1

    .line 93
    .line 94
    aget-byte v5, v2, v3

    .line 95
    .line 96
    and-int/lit16 v5, v5, 0xff

    .line 97
    .line 98
    add-int/lit8 v6, v3, 0x2

    .line 99
    .line 100
    aget-byte v4, v2, v4

    .line 101
    .line 102
    and-int/lit16 v4, v4, 0xff

    .line 103
    .line 104
    shl-int/lit8 v4, v4, 0x8

    .line 105
    .line 106
    or-int/2addr v4, v5

    .line 107
    add-int/lit8 v5, v3, 0x3

    .line 108
    .line 109
    aget-byte v6, v2, v6

    .line 110
    .line 111
    and-int/lit16 v6, v6, 0xff

    .line 112
    .line 113
    shl-int/lit8 v6, v6, 0x10

    .line 114
    .line 115
    or-int/2addr v4, v6

    .line 116
    aget-byte v2, v2, v5

    .line 117
    .line 118
    shl-int/lit8 v2, v2, 0x18

    .line 119
    .line 120
    or-int/2addr v2, v4

    .line 121
    xor-int/2addr v2, v1

    .line 122
    int-to-long v4, v2

    .line 123
    const-wide v6, 0xffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    and-long/2addr v4, v6

    .line 129
    iput p2, v0, Lac/e;->b:F

    .line 130
    .line 131
    invoke-virtual {p0, v1, v3, v4, v5}, Lac/o;->m(IIJ)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    .line 137
    :cond_3
    :goto_1
    monitor-exit p0

    .line 138
    return-object p0

    .line 139
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    throw p1
.end method

.method public final declared-synchronized putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lac/b;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Lac/b;->a()B

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_2

    .line 35
    :cond_1
    :goto_0
    check-cast v0, Lac/f;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    sget-object v0, Lac/o;->z:[I

    .line 40
    .line 41
    aget v0, v0, v1

    .line 42
    .line 43
    invoke-virtual {p0, v1, v0, p1}, Lac/o;->p(BILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 47
    .line 48
    iget v1, v0, Lac/k;->h:I

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Lac/k;->D(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lac/o;->l()V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 57
    .line 58
    new-instance v2, Lac/f;

    .line 59
    .line 60
    invoke-direct {v2, v1, p2}, Lac/f;-><init>(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget v1, v0, Lac/f;->b:I

    .line 71
    .line 72
    if-eq v1, p2, :cond_3

    .line 73
    .line 74
    xor-int/2addr v1, p2

    .line 75
    int-to-long v1, v1

    .line 76
    const-wide v3, 0xffffffffL

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    and-long/2addr v1, v3

    .line 82
    iput p2, v0, Lac/f;->b:I

    .line 83
    .line 84
    iget v0, v0, Lac/b;->a:I

    .line 85
    .line 86
    invoke-virtual {p0, p2, v0, v1, v2}, Lac/o;->m(IIJ)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_1
    monitor-exit p0

    .line 93
    return-object p0

    .line 94
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    throw p1
.end method

.method public final declared-synchronized putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lac/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    :try_start_2
    invoke-virtual {v0}, Lac/b;->a()B

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eq v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    move-object v4, p0

    .line 36
    goto :goto_3

    .line 37
    :cond_1
    :goto_0
    :try_start_3
    check-cast v0, Lac/g;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    :try_start_4
    sget-object v0, Lac/o;->z:[I

    .line 42
    .line 43
    aget v0, v0, v1

    .line 44
    .line 45
    invoke-virtual {p0, v1, v0, p1}, Lac/o;->p(BILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 49
    .line 50
    iget v1, v0, Lac/k;->h:I

    .line 51
    .line 52
    invoke-virtual {v0, v1, p2, p3}, Lac/k;->F(IJ)V

    .line 53
    .line 54
    .line 55
    iget v2, v0, Lac/k;->h:I

    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x8

    .line 58
    .line 59
    iput v2, v0, Lac/k;->h:I

    .line 60
    .line 61
    invoke-virtual {p0}, Lac/o;->l()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 65
    .line 66
    new-instance v2, Lac/g;

    .line 67
    .line 68
    invoke-direct {v2, v1, p2, p3}, Lac/g;-><init>(IJ)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 75
    .line 76
    .line 77
    :cond_2
    move-object v4, p0

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    :try_start_5
    iget-wide v1, v0, Lac/g;->b:J

    .line 80
    .line 81
    cmp-long v3, v1, p2

    .line 82
    .line 83
    if-eqz v3, :cond_2

    .line 84
    .line 85
    xor-long v7, p2, v1

    .line 86
    .line 87
    iput-wide p2, v0, Lac/g;->b:J

    .line 88
    .line 89
    iget v9, v0, Lac/b;->a:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 90
    .line 91
    move-object v4, p0

    .line 92
    move-wide v5, p2

    .line 93
    :try_start_6
    invoke-virtual/range {v4 .. v9}, Lac/o;->n(JJI)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catchall_1
    move-exception v0

    .line 101
    :goto_1
    move-object p1, v0

    .line 102
    goto :goto_3

    .line 103
    :catchall_2
    move-exception v0

    .line 104
    move-object v4, p0

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    monitor-exit p0

    .line 107
    return-object v4

    .line 108
    :goto_3
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 109
    throw p1
.end method

.method public final declared-synchronized putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {p1}, Lac/o;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 9
    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    :try_start_2
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    .line 15
    .line 16
    move-object v1, p0

    .line 17
    goto :goto_2

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    move-object v1, p0

    .line 21
    goto :goto_4

    .line 22
    :cond_1
    :try_start_3
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lac/b;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    :try_start_4
    invoke-virtual {v0}, Lac/b;->a()B

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x6

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    :cond_2
    :try_start_5
    move-object v5, v0

    .line 44
    check-cast v5, Lac/i;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 45
    .line 46
    if-eqz v5, :cond_3

    .line 47
    .line 48
    :try_start_6
    iget-boolean v0, v5, Lac/j;->e:Z

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    iget-object v0, v5, Lac/j;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-object p0

    .line 62
    :cond_3
    :try_start_7
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    :try_start_8
    sget-object v0, Lac/o;->y:[B
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 69
    .line 70
    :goto_0
    move-object v4, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    :try_start_9
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 73
    .line 74
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 75
    .line 76
    .line 77
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    if-nez v4, :cond_5

    .line 80
    .line 81
    :try_start_a
    new-instance p1, Ljava/lang/Exception;

    .line 82
    .line 83
    const-string p2, "Encrypt failed"

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string p2, "FastKV"

    .line 89
    .line 90
    iget-object v0, p0, Lac/o;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 93
    .line 94
    .line 95
    monitor-exit p0

    .line 96
    return-object p0

    .line 97
    :cond_5
    const/4 v6, 0x6

    .line 98
    move-object v1, p0

    .line 99
    move-object v2, p1

    .line 100
    move-object v3, p2

    .line 101
    :try_start_b
    invoke-virtual/range {v1 .. v6}, Lac/o;->a(Ljava/lang/String;Ljava/lang/Object;[BLac/j;B)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v2}, Lac/o;->f(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 105
    .line 106
    .line 107
    :goto_2
    monitor-exit p0

    .line 108
    return-object v1

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    :goto_3
    move-object p1, v0

    .line 111
    goto :goto_4

    .line 112
    :catchall_2
    move-exception v0

    .line 113
    move-object v1, p0

    .line 114
    goto :goto_3

    .line 115
    :goto_4
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 116
    throw p1
.end method

.method public final declared-synchronized putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {p0, p1}, Lac/o;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    sget-object v0, Lac/s;->a:Lac/s;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, v0}, Lac/o;->h(Ljava/lang/String;Ljava/lang/Object;Lac/s;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    :goto_0
    monitor-exit p0

    .line 22
    return-object p0

    .line 23
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 24
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
    iget-object v0, p0, Lac/o;->p:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lac/o;->p:Ljava/util/ArrayList;

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
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lac/o;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lac/b;

    .line 15
    .line 16
    if-eqz v0, :cond_8

    .line 17
    .line 18
    iget-object v1, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lac/b;->a()B

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x5

    .line 28
    const/4 v3, 0x0

    .line 29
    if-gt v1, v2, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, Lac/k;->x(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget v0, v0, Lac/b;->a:I

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x2

    .line 38
    .line 39
    sub-int p1, v0, p1

    .line 40
    .line 41
    sget-object v2, Lac/o;->z:[I

    .line 42
    .line 43
    aget v2, v2, v1

    .line 44
    .line 45
    add-int/2addr v0, v2

    .line 46
    invoke-virtual {p0, v1, p1, v0}, Lac/o;->i(BII)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    check-cast v0, Lac/j;

    .line 54
    .line 55
    iget p1, v0, Lac/j;->c:I

    .line 56
    .line 57
    iget v2, v0, Lac/b;->a:I

    .line 58
    .line 59
    iget v4, v0, Lac/j;->d:I

    .line 60
    .line 61
    add-int/2addr v2, v4

    .line 62
    invoke-virtual {p0, v1, p1, v2}, Lac/o;->i(BII)V

    .line 63
    .line 64
    .line 65
    iget-boolean p1, v0, Lac/j;->e:Z

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    iget-object p1, v0, Lac/j;->b:Ljava/lang/Object;

    .line 70
    .line 71
    move-object v3, p1

    .line 72
    check-cast v3, Ljava/lang/String;

    .line 73
    .line 74
    :cond_2
    :goto_0
    or-int/lit8 p1, v1, -0x80

    .line 75
    .line 76
    int-to-byte p1, p1

    .line 77
    iget v0, p0, Lac/o;->w:I

    .line 78
    .line 79
    const/4 v1, 0x4

    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 83
    .line 84
    iget-wide v4, p0, Lac/o;->e:J

    .line 85
    .line 86
    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lac/o;->t:Ljava/nio/MappedByteBuffer;

    .line 90
    .line 91
    iget v2, p0, Lac/o;->v:I

    .line 92
    .line 93
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 97
    .line 98
    iget-wide v4, p0, Lac/o;->e:J

    .line 99
    .line 100
    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lac/o;->u:Ljava/nio/MappedByteBuffer;

    .line 104
    .line 105
    iget v1, p0, Lac/o;->v:I

    .line 106
    .line 107
    invoke-virtual {v0, v1, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    iget-object p1, p0, Lac/o;->h:Lac/k;

    .line 112
    .line 113
    iget-wide v4, p0, Lac/o;->e:J

    .line 114
    .line 115
    invoke-virtual {p1, v1, v4, v5}, Lac/k;->F(IJ)V

    .line 116
    .line 117
    .line 118
    :goto_1
    const/4 p1, 0x0

    .line 119
    iput p1, p0, Lac/o;->v:I

    .line 120
    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    iget v0, p0, Lac/o;->w:I

    .line 124
    .line 125
    if-nez v0, :cond_4

    .line 126
    .line 127
    invoke-static {}, Lac/p;->w()Ljava/util/concurrent/Executor;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v1, La1/d;

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    invoke-direct {v1, p0, v2, v3}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    iget-object v0, p0, Lac/o;->k:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_2
    iget v0, p0, Lac/o;->n:I

    .line 147
    .line 148
    const/16 v1, 0x2000

    .line 149
    .line 150
    if-ge v0, v1, :cond_6

    .line 151
    .line 152
    iget-object v0, p0, Lac/o;->o:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/16 v1, 0x64

    .line 159
    .line 160
    if-lt v0, v1, :cond_7

    .line 161
    .line 162
    :cond_6
    invoke-static {p0, p1}, Lfb/v0;->s(Lac/o;I)V

    .line 163
    .line 164
    .line 165
    :cond_7
    iget p1, p0, Lac/o;->w:I

    .line 166
    .line 167
    if-eqz p1, :cond_8

    .line 168
    .line 169
    iget-boolean p1, p0, Lac/o;->x:Z

    .line 170
    .line 171
    if-eqz p1, :cond_8

    .line 172
    .line 173
    invoke-virtual {p0}, Lac/o;->d()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    .line 175
    .line 176
    :cond_8
    monitor-exit p0

    .line 177
    return-object p0

    .line 178
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
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
    iget-object v1, p0, Lac/o;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lac/o;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final declared-synchronized unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lac/o;->p:Ljava/util/ArrayList;

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
