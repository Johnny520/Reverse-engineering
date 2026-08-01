.class Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Resolved"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
        ">;"
    }
.end annotation


# instance fields
.field private final classFileVersion:Lnet/bytebuddy/ClassFileVersion;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field final synthetic this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .param p1    # Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin$1;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    .line 336
    invoke-virtual {p0}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->call()Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;

    move-result-object p0

    return-object p0
.end method

.method public call()Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 17
    .line 18
    iget-object v3, v3, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 19
    .line 20
    invoke-static {v3}, Lnet/bytebuddy/build/Plugin$Engine$Default;->access$1400(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 25
    .line 26
    iget-object v4, v4, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Default;

    .line 27
    .line 28
    invoke-static {v4}, Lnet/bytebuddy/build/Plugin$Engine$Default;->access$1200(Lnet/bytebuddy/build/Plugin$Engine$Default;)Lnet/bytebuddy/ByteBuddy;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 33
    .line 34
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 35
    .line 36
    invoke-static {v6}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1300(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-interface {v3, v4, v5, v6}, Lnet/bytebuddy/build/Plugin$Engine$TypeStrategy;->builder(Lnet/bytebuddy/ByteBuddy;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 45
    .line 46
    invoke-static {v4}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1500(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Lnet/bytebuddy/build/Plugin;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 65
    .line 66
    :try_start_1
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 67
    .line 68
    invoke-interface {v5, v6}, Lnet/bytebuddy/matcher/ElementMatcher;->matches(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_0

    .line 73
    .line 74
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 75
    .line 76
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 77
    .line 78
    invoke-static {v7}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1300(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v5, v3, v6, v7}, Lnet/bytebuddy/build/Plugin;->apply(Lnet/bytebuddy/dynamic/DynamicType$Builder;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 87
    .line 88
    invoke-static {v6}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 93
    .line 94
    invoke-interface {v6, v7, v5}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v6

    .line 102
    goto :goto_1

    .line 103
    :cond_0
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 104
    .line 105
    invoke-static {v6}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 110
    .line 111
    invoke-interface {v6, v7, v5}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_1
    :try_start_2
    iget-object v7, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 119
    .line 120
    invoke-static {v7}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    iget-object v8, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 125
    .line 126
    invoke-interface {v7, v8, v5, v6}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :catchall_1
    move-exception v0

    .line 134
    goto/16 :goto_5

    .line 135
    .line 136
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_2

    .line 141
    .line 142
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 143
    .line 144
    invoke-static {v0}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 149
    .line 150
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForFailedElement;

    .line 154
    .line 155
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 156
    .line 157
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1700(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 162
    .line 163
    invoke-direct {v0, v1, v3, v2}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForFailedElement;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 164
    .line 165
    .line 166
    :goto_2
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 167
    .line 168
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 173
    .line 174
    invoke-interface {v1, p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_2
    :try_start_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 182
    if-nez v4, :cond_5

    .line 183
    .line 184
    :try_start_4
    sget-object v1, Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;->INSTANCE:Lnet/bytebuddy/dynamic/TypeResolutionStrategy$Disabled;

    .line 185
    .line 186
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 187
    .line 188
    invoke-static {v4}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1800(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/pool/TypePool;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-interface {v3, v1, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make(Lnet/bytebuddy/dynamic/TypeResolutionStrategy;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 197
    .line 198
    invoke-static {v3}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 203
    .line 204
    invoke-interface {v3, v4, v0}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v1}, Lnet/bytebuddy/dynamic/DynamicType;->getLoadedTypeInitializers()Ljava/util/Map;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_4

    .line 224
    .line 225
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, Ljava/util/Map$Entry;

    .line 230
    .line 231
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    check-cast v4, Lnet/bytebuddy/implementation/LoadedTypeInitializer;

    .line 236
    .line 237
    invoke-interface {v4}, Lnet/bytebuddy/implementation/LoadedTypeInitializer;->isAlive()Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_3

    .line 242
    .line 243
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 244
    .line 245
    invoke-static {v4}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 250
    .line 251
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 256
    .line 257
    invoke-interface {v4, v5, v3}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 258
    .line 259
    .line 260
    goto :goto_3

    .line 261
    :catchall_2
    move-exception v0

    .line 262
    goto :goto_4

    .line 263
    :cond_4
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;

    .line 264
    .line 265
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 266
    .line 267
    invoke-direct {v0, v3, v1}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForTransformedElement;-><init>(Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/DynamicType;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :goto_4
    :try_start_5
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 275
    .line 276
    invoke-static {v0}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 281
    .line 282
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;->onError(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 283
    .line 284
    .line 285
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForFailedElement;

    .line 286
    .line 287
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 288
    .line 289
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1700(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 294
    .line 295
    invoke-direct {v0, v1, v3, v2}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForFailedElement;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :cond_5
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 301
    .line 302
    invoke-static {v0}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 307
    .line 308
    invoke-interface {v0, v2, v1}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 309
    .line 310
    .line 311
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForRetainedElement;

    .line 312
    .line 313
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 314
    .line 315
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1700(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable$ForRetainedElement;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Source$Element;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 320
    .line 321
    .line 322
    goto/16 :goto_2

    .line 323
    .line 324
    :goto_5
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->this$1:Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;

    .line 325
    .line 326
    invoke-static {v1}, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;->access$1600(Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor;)Lnet/bytebuddy/build/Plugin$Engine$Listener;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$Preprocessor$Resolved;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 331
    .line 332
    invoke-interface {v1, p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener;->onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 333
    .line 334
    .line 335
    throw v0
.end method
