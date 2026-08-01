.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Enabled"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;


# instance fields
.field private final types:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$500(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;

    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v8, p5

    .line 6
    .line 7
    iget-object v2, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v8, v2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onBeforeWarmUp(Ljava/util/Set;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V

    .line 10
    .line 11
    .line 12
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    const/4 v11, 0x0

    .line 24
    move v12, v11

    .line 25
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_7

    .line 30
    .line 31
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v7, v0

    .line 36
    check-cast v7, Ljava/lang/Class;

    .line 37
    .line 38
    :try_start_0
    invoke-static {v7}, Lnet/bytebuddy/utility/JavaModule;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/utility/JavaModule;

    .line 39
    .line 40
    .line 41
    move-result-object v13

    .line 42
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 43
    .line 44
    .line 45
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 46
    move-object/from16 v14, p2

    .line 47
    .line 48
    :try_start_1
    invoke-interface {v14, v0, v13}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;->classFileLocator(Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v0, v2}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    .line 65
    .line 66
    .line 67
    const/4 v15, 0x1

    .line 68
    if-nez v13, :cond_3

    .line 69
    .line 70
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1500()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v7}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    move v1, v15

    .line 93
    goto :goto_1

    .line 94
    :cond_0
    move v1, v11

    .line 95
    :goto_1
    or-int/2addr v12, v1

    .line 96
    invoke-virtual/range {p3 .. p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->isEnabled()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {v7}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 111
    .line 112
    .line 113
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 114
    move-object/from16 v1, p1

    .line 115
    .line 116
    move-object v4, v7

    .line 117
    :try_start_3
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;->transform(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    move-object/from16 v16, v4

    .line 122
    .line 123
    if-eqz v0, :cond_1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    move v15, v11

    .line 127
    :goto_2
    or-int v1, v12, v15

    .line 128
    .line 129
    move v12, v1

    .line 130
    move-object/from16 v4, v16

    .line 131
    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :catchall_0
    move-exception v0

    .line 137
    move-object/from16 v16, v4

    .line 138
    .line 139
    move-object/from16 v1, p1

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :catchall_1
    move-exception v0

    .line 144
    move-object/from16 v16, v7

    .line 145
    .line 146
    :goto_3
    move-object/from16 v1, p1

    .line 147
    .line 148
    :goto_4
    move-object/from16 v4, v16

    .line 149
    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_2
    move-object/from16 v1, p1

    .line 153
    .line 154
    move-object v4, v7

    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :cond_3
    move-object/from16 v16, v7

    .line 158
    .line 159
    :try_start_4
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->DISPATCHER:Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;

    .line 160
    .line 161
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1500()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    move-object v7, v6

    .line 178
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 179
    .line 180
    .line 181
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 182
    move-object/from16 v1, p1

    .line 183
    .line 184
    :try_start_5
    invoke-interface/range {v0 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;->transform(Ljava/lang/instrument/ClassFileTransformer;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 185
    .line 186
    .line 187
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 188
    move-object v6, v7

    .line 189
    if-eqz v2, :cond_4

    .line 190
    .line 191
    move v1, v15

    .line 192
    goto :goto_5

    .line 193
    :cond_4
    move v1, v11

    .line 194
    :goto_5
    or-int/2addr v12, v1

    .line 195
    :try_start_6
    invoke-virtual/range {p3 .. p3}, Lnet/bytebuddy/agent/builder/AgentBuilder$RedefinitionStrategy;->isEnabled()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_6

    .line 200
    .line 201
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaModule;->unwrap()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    move-object v7, v6

    .line 214
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    .line 215
    .line 216
    .line 217
    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 218
    move-object/from16 v1, p1

    .line 219
    .line 220
    move-object/from16 v5, v16

    .line 221
    .line 222
    :try_start_7
    invoke-interface/range {v0 .. v7}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled$Dispatcher;->transform(Ljava/lang/instrument/ClassFileTransformer;Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B

    .line 223
    .line 224
    .line 225
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 226
    move-object v4, v5

    .line 227
    if-eqz v0, :cond_5

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_5
    move v15, v11

    .line 231
    :goto_6
    or-int v2, v12, v15

    .line 232
    .line 233
    move v12, v2

    .line 234
    goto :goto_7

    .line 235
    :catchall_2
    move-exception v0

    .line 236
    move-object v4, v5

    .line 237
    goto :goto_8

    .line 238
    :catchall_3
    move-exception v0

    .line 239
    goto :goto_3

    .line 240
    :cond_6
    move-object/from16 v1, p1

    .line 241
    .line 242
    move-object/from16 v4, v16

    .line 243
    .line 244
    move-object v0, v2

    .line 245
    :goto_7
    :try_start_8
    invoke-interface {v9, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 246
    .line 247
    .line 248
    :try_start_9
    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    .line 249
    .line 250
    .line 251
    goto/16 :goto_0

    .line 252
    .line 253
    :catchall_4
    move-exception v0

    .line 254
    goto :goto_a

    .line 255
    :catchall_5
    move-exception v0

    .line 256
    goto :goto_8

    .line 257
    :catchall_6
    move-exception v0

    .line 258
    goto :goto_4

    .line 259
    :goto_8
    invoke-interface/range {p4 .. p4}, Lnet/bytebuddy/agent/builder/AgentBuilder$CircularityLock;->acquire()Z

    .line 260
    .line 261
    .line 262
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 263
    :catchall_7
    move-exception v0

    .line 264
    :goto_9
    move-object v4, v7

    .line 265
    goto :goto_a

    .line 266
    :catchall_8
    move-exception v0

    .line 267
    move-object/from16 v14, p2

    .line 268
    .line 269
    goto :goto_9

    .line 270
    :goto_a
    invoke-interface {v8, v4, v1, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onWarmUpError(Ljava/lang/Class;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    invoke-static {}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default;->access$1600()[B

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-interface {v9, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :cond_7
    invoke-interface {v8, v9, v1, v12}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;->onAfterWarmUp(Ljava/util/Map;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Z)V

    .line 283
    .line 284
    .line 285
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public with(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;->types:Ljava/util/Set;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 9
    .line 10
    .line 11
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Default$WarmupStrategy$Enabled;-><init>(Ljava/util/Set;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method
