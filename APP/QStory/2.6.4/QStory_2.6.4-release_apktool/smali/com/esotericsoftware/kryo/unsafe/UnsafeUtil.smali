.class public Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;
    }
.end annotation


# static fields
.field public static final booleanArrayBaseOffset:J

.field public static final byteArrayBaseOffset:J

.field public static final charArrayBaseOffset:J

.field public static final doubleArrayBaseOffset:J

.field public static final floatArrayBaseOffset:J

.field public static final intArrayBaseOffset:J

.field public static final longArrayBaseOffset:J

.field public static final shortArrayBaseOffset:J

.field public static final unsafe:Lsun/misc/Unsafe;


# direct methods
.method static constructor <clinit>()V
    .locals 22

    .line 1
    const-string v1, "kryo"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    sget-boolean v0, Lcom/esotericsoftware/kryo/util/Util;->isAndroid:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-class v0, Lsun/misc/Unsafe;

    .line 9
    .line 10
    const-string v5, "theUnsafe"

    .line 11
    .line 12
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v5, 0x1

    .line 17
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    move-object v5, v0

    .line 25
    check-cast v5, Lsun/misc/Unsafe;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_8

    .line 26
    .line 27
    :try_start_1
    const-class v0, [B

    .line 28
    .line 29
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    .line 33
    int-to-long v6, v0

    .line 34
    :try_start_2
    const-class v0, [C

    .line 35
    .line 36
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_6

    .line 40
    int-to-long v8, v0

    .line 41
    :try_start_3
    const-class v0, [S

    .line 42
    .line 43
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 44
    .line 45
    .line 46
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    .line 47
    int-to-long v10, v0

    .line 48
    :try_start_4
    const-class v0, [I

    .line 49
    .line 50
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 51
    .line 52
    .line 53
    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 54
    int-to-long v12, v0

    .line 55
    :try_start_5
    const-class v0, [F

    .line 56
    .line 57
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 58
    .line 59
    .line 60
    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 61
    int-to-long v14, v0

    .line 62
    :try_start_6
    const-class v0, [J

    .line 63
    .line 64
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 65
    .line 66
    .line 67
    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 68
    int-to-long v3, v0

    .line 69
    :try_start_7
    const-class v0, [D

    .line 70
    .line 71
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 72
    .line 73
    .line 74
    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 75
    move-wide/from16 v18, v3

    .line 76
    .line 77
    int-to-long v2, v0

    .line 78
    :try_start_8
    const-class v0, [Z

    .line 79
    .line 80
    invoke-virtual {v5, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 81
    .line 82
    .line 83
    move-result v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 84
    int-to-long v0, v0

    .line 85
    move-wide/from16 v16, v14

    .line 86
    .line 87
    move-wide/from16 v20, v2

    .line 88
    .line 89
    move-object v2, v5

    .line 90
    move-wide v3, v6

    .line 91
    move-wide v5, v0

    .line 92
    move-wide/from16 v0, v20

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :catch_0
    move-exception v0

    .line 96
    move-wide v3, v2

    .line 97
    move-object v2, v5

    .line 98
    goto :goto_7

    .line 99
    :catch_1
    move-exception v0

    .line 100
    move-wide/from16 v18, v3

    .line 101
    .line 102
    move-object v2, v5

    .line 103
    const-wide/16 v3, 0x0

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :catch_2
    move-exception v0

    .line 107
    move-object v2, v5

    .line 108
    const-wide/16 v3, 0x0

    .line 109
    .line 110
    :goto_0
    const-wide/16 v18, 0x0

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :catch_3
    move-exception v0

    .line 114
    move-object v2, v5

    .line 115
    const-wide/16 v3, 0x0

    .line 116
    .line 117
    :goto_1
    const-wide/16 v14, 0x0

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catch_4
    move-exception v0

    .line 121
    move-object v2, v5

    .line 122
    const-wide/16 v3, 0x0

    .line 123
    .line 124
    :goto_2
    const-wide/16 v12, 0x0

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catch_5
    move-exception v0

    .line 128
    move-object v2, v5

    .line 129
    const-wide/16 v3, 0x0

    .line 130
    .line 131
    :goto_3
    const-wide/16 v10, 0x0

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catch_6
    move-exception v0

    .line 135
    move-object v2, v5

    .line 136
    const-wide/16 v3, 0x0

    .line 137
    .line 138
    :goto_4
    const-wide/16 v8, 0x0

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :catch_7
    move-exception v0

    .line 142
    move-object v2, v5

    .line 143
    :goto_5
    const-wide/16 v3, 0x0

    .line 144
    .line 145
    const-wide/16 v6, 0x0

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :catch_8
    move-exception v0

    .line 149
    goto :goto_5

    .line 150
    :cond_0
    :try_start_9
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 151
    .line 152
    if-eqz v0, :cond_1

    .line 153
    .line 154
    const-string v0, "Unsafe is not available on Android."

    .line 155
    .line 156
    invoke-static {v1, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    .line 157
    .line 158
    .line 159
    :cond_1
    const-wide/16 v0, 0x0

    .line 160
    .line 161
    const-wide/16 v3, 0x0

    .line 162
    .line 163
    const-wide/16 v5, 0x0

    .line 164
    .line 165
    const-wide/16 v8, 0x0

    .line 166
    .line 167
    const-wide/16 v10, 0x0

    .line 168
    .line 169
    const-wide/16 v12, 0x0

    .line 170
    .line 171
    const-wide/16 v16, 0x0

    .line 172
    .line 173
    const-wide/16 v18, 0x0

    .line 174
    .line 175
    :goto_6
    move-wide/from16 v14, v16

    .line 176
    .line 177
    move-wide/from16 v16, v5

    .line 178
    .line 179
    goto :goto_8

    .line 180
    :goto_7
    sget-boolean v5, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 181
    .line 182
    if-eqz v5, :cond_2

    .line 183
    .line 184
    const-string v5, "Unsafe is not available."

    .line 185
    .line 186
    invoke-static {v1, v5, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    :cond_2
    move-wide v0, v3

    .line 190
    move-wide v3, v6

    .line 191
    const-wide/16 v16, 0x0

    .line 192
    .line 193
    :goto_8
    sput-wide v3, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->byteArrayBaseOffset:J

    .line 194
    .line 195
    sput-wide v8, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->charArrayBaseOffset:J

    .line 196
    .line 197
    sput-wide v10, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->shortArrayBaseOffset:J

    .line 198
    .line 199
    sput-wide v12, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->intArrayBaseOffset:J

    .line 200
    .line 201
    sput-wide v14, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->floatArrayBaseOffset:J

    .line 202
    .line 203
    sput-wide v18, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->longArrayBaseOffset:J

    .line 204
    .line 205
    sput-wide v0, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->doubleArrayBaseOffset:J

    .line 206
    .line 207
    sput-wide v16, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->booleanArrayBaseOffset:J

    .line 208
    .line 209
    sput-object v2, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->unsafe:Lsun/misc/Unsafe;

    .line 210
    .line 211
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static dispose(Ljava/nio/ByteBuffer;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static isNewDirectBufferAvailable()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->access$000()Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public static newDirectBuffer(JI)Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    invoke-static {}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil;->isNewDirectBufferAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/esotericsoftware/kryo/unsafe/UnsafeUtil$DirectBuffers;->access$000()Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    filled-new-array {v1, p2}, [Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    return-object p2

    .line 30
    :catch_0
    move-exception p2

    .line 31
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 32
    .line 33
    const-string v1, "Error creating a ByteBuffer at address: "

    .line 34
    .line 35
    invoke-static {p0, p1, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {v0, p0, p2}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_0
    const-string p0, "No direct ByteBuffer constructor is available."

    .line 44
    .line 45
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method
