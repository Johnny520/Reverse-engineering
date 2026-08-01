.class Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DirectClassFileConsumer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field bytes:[B

.field dcff:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Lcom/android/dx/cf/direct/DirectClassFile;",
            ">;"
        }
    .end annotation
.end field

.field name:Ljava/lang/String;

.field final synthetic this$0:Lcom/android/dx/command/dexer/Main;


# direct methods
.method private constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLjava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/concurrent/Future<",
            "Lcom/android/dx/cf/direct/DirectClassFile;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->bytes:[B

    .line 9
    .line 10
    iput-object p4, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->dcff:Ljava/util/concurrent/Future;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLjava/util/concurrent/Future;Lcom/android/dx/command/dexer/Main$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLjava/util/concurrent/Future;)V

    return-void
.end method

.method public static synthetic access$700(Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;Lcom/android/dx/cf/direct/DirectClassFile;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->call(Lcom/android/dx/cf/direct/DirectClassFile;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private call(Lcom/android/dx/cf/direct/DirectClassFile;)Ljava/lang/Boolean;
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/android/dx/rop/cst/ConstantPool;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Lcom/android/dx/cf/iface/MethodList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v1, v0

    .line 28
    add-int/lit8 v1, v1, 0x2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getFields()Lcom/android/dx/cf/iface/FieldList;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Lcom/android/dx/cf/iface/FieldList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v0

    .line 39
    add-int/lit8 v2, v2, 0x9

    .line 40
    .line 41
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    monitor-enter v3

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :try_start_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 56
    .line 57
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lcom/android/dx/dex/file/MethodIdsSection;->items()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 74
    .line 75
    invoke-static {v5}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v5}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Lcom/android/dx/dex/file/FieldIdsSection;->items()Ljava/util/Collection;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 92
    :goto_0
    add-int/2addr v0, v1

    .line 93
    :try_start_2
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 94
    .line 95
    invoke-static {v4}, Lcom/android/dx/command/dexer/Main;->access$1900(Lcom/android/dx/command/dexer/Main;)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    add-int/2addr v0, v4

    .line 100
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 101
    .line 102
    invoke-static {v4}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    iget v4, v4, Lcom/android/dx/command/dexer/Main$Arguments;->maxNumberOfIdxPerDex:I

    .line 107
    .line 108
    if-gt v0, v4, :cond_0

    .line 109
    .line 110
    add-int/2addr v5, v2

    .line 111
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 112
    .line 113
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$2000(Lcom/android/dx/command/dexer/Main;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-int/2addr v5, v0

    .line 118
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 119
    .line 120
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1400(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/command/dexer/Main$Arguments;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iget v0, v0, Lcom/android/dx/command/dexer/Main$Arguments;->maxNumberOfIdxPerDex:I

    .line 125
    .line 126
    if-le v5, v0, :cond_2

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    move-object p0, v0

    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 134
    .line 135
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1900(Lcom/android/dx/command/dexer/Main;)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-gtz v0, :cond_3

    .line 140
    .line 141
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 142
    .line 143
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$2000(Lcom/android/dx/command/dexer/Main;)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-lez v0, :cond_1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_1
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 151
    .line 152
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DexFile;->getClassDefs()Lcom/android/dx/dex/file/ClassDefsSection;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lcom/android/dx/dex/file/ClassDefsSection;->items()Ljava/util/Collection;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-lez v0, :cond_2

    .line 169
    .line 170
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 171
    .line 172
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$2100(Lcom/android/dx/command/dexer/Main;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_2
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 177
    .line 178
    invoke-static {v0, v1}, Lcom/android/dx/command/dexer/Main;->access$1912(Lcom/android/dx/command/dexer/Main;I)I

    .line 179
    .line 180
    .line 181
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 182
    .line 183
    invoke-static {v0, v2}, Lcom/android/dx/command/dexer/Main;->access$2012(Lcom/android/dx/command/dexer/Main;I)I

    .line 184
    .line 185
    .line 186
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    move v6, v1

    .line 188
    move v7, v2

    .line 189
    goto :goto_5

    .line 190
    :cond_3
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 191
    .line 192
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1700(Lcom/android/dx/command/dexer/Main;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 197
    .line 198
    .line 199
    :catch_0
    :goto_3
    :try_start_4
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 200
    .line 201
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 206
    :try_start_5
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 207
    .line 208
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-virtual {v0}, Lcom/android/dx/dex/file/MethodIdsSection;->items()Ljava/util/Collection;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget-object v5, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 225
    .line 226
    invoke-static {v5}, Lcom/android/dx/command/dexer/Main;->access$1800(Lcom/android/dx/command/dexer/Main;)Lcom/android/dx/dex/file/DexFile;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {v5}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5}, Lcom/android/dx/dex/file/FieldIdsSection;->items()Ljava/util/Collection;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    monitor-exit v4

    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :catchall_1
    move-exception v0

    .line 246
    move-object p0, v0

    .line 247
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 248
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 249
    :catchall_2
    move-exception v0

    .line 250
    move-object p0, v0

    .line 251
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 252
    :try_start_8
    throw p0

    .line 253
    :goto_4
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 254
    throw p0

    .line 255
    :cond_4
    const/4 v1, 0x0

    .line 256
    move v6, v1

    .line 257
    move v7, v6

    .line 258
    :goto_5
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 259
    .line 260
    invoke-static {v0}, Lcom/android/dx/command/dexer/Main;->access$2300(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/ExecutorService;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    new-instance v8, Lcom/android/dx/command/dexer/Main$ClassTranslatorTask;

    .line 265
    .line 266
    iget-object v9, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 267
    .line 268
    iget-object v10, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->name:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v11, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->bytes:[B

    .line 271
    .line 272
    const/4 v13, 0x0

    .line 273
    move-object v12, p1

    .line 274
    invoke-direct/range {v8 .. v13}, Lcom/android/dx/command/dexer/Main$ClassTranslatorTask;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;[BLcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/command/dexer/Main$1;)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 282
    .line 283
    invoke-static {p1}, Lcom/android/dx/command/dexer/Main;->access$2500(Lcom/android/dx/command/dexer/Main;)Ljava/util/concurrent/ExecutorService;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    new-instance v2, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;

    .line 288
    .line 289
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 290
    .line 291
    iget-object v4, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->name:Ljava/lang/String;

    .line 292
    .line 293
    const/4 v8, 0x0

    .line 294
    invoke-direct/range {v2 .. v8}, Lcom/android/dx/command/dexer/Main$ClassDefItemConsumer;-><init>(Lcom/android/dx/command/dexer/Main;Ljava/lang/String;Ljava/util/concurrent/Future;IILcom/android/dx/command/dexer/Main$1;)V

    .line 295
    .line 296
    .line 297
    invoke-interface {p1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->this$0:Lcom/android/dx/command/dexer/Main;

    .line 302
    .line 303
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->access$2600(Lcom/android/dx/command/dexer/Main;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 311
    .line 312
    return-object p0
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->dcff:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 314
    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->call(Lcom/android/dx/cf/direct/DirectClassFile;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 315
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$DirectClassFileConsumer;->call()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
