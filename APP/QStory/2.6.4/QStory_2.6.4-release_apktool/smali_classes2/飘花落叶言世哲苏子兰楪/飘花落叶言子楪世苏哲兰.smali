.class public L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子哲楪苏/飘花落叶言子楪世苏哲兰;


# static fields
.field public static 飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 p0, 0x12a

    .line 5
    .line 6
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;ILjava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/16 v0, 0x97

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    iget-object v4, v2, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v2}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget v3, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 32
    .line 33
    const/16 v4, 0x13a4

    .line 34
    .line 35
    const-class v5, Ljava/lang/String;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    const/16 v7, 0x12b

    .line 39
    .line 40
    if-le v3, v4, :cond_2

    .line 41
    .line 42
    const/16 v4, 0x19bc

    .line 43
    .line 44
    const-string v8, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5"

    .line 45
    .line 46
    const-string v9, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 47
    .line 48
    const-string v10, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 49
    .line 50
    if-lt v3, v4, :cond_0

    .line 51
    .line 52
    new-instance v3, Lnet/bytebuddy/ByteBuddy;

    .line 53
    .line 54
    invoke-direct {v3}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v1}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const-string v4, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 62
    .line 63
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {v3, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v3}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {p1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p3}, Lnet/bytebuddy/implementation/MethodCall;->call(Ljava/util/concurrent/Callable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {p2}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    new-instance p3, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;

    .line 176
    .line 177
    sget-object v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 178
    .line 179
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {p3, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;-><init>(Ljava/io/File;)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p1, p2, p3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_0
    const/16 v4, 0x16d4

    .line 201
    .line 202
    if-lt v3, v4, :cond_1

    .line 203
    .line 204
    new-instance v3, Lnet/bytebuddy/ByteBuddy;

    .line 205
    .line 206
    invoke-direct {v3}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3, v1}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-static {v9}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-interface {v3, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-static {v3}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-interface {p1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p3}, Lnet/bytebuddy/implementation/MethodCall;->call(Ljava/util/concurrent/Callable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-static {v8}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p3

    .line 277
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    invoke-static {p2}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 302
    .line 303
    .line 304
    move-result-object p2

    .line 305
    new-instance p3, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;

    .line 306
    .line 307
    sget-object v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 308
    .line 309
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-direct {p3, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;-><init>(Ljava/io/File;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {p1, p2, p3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_1
    new-instance v3, Lnet/bytebuddy/ByteBuddy;

    .line 331
    .line 332
    invoke-direct {v3}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v1}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-static {v5}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-interface {v3, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    invoke-static {v10}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v3}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    invoke-interface {p1, v2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {p3}, Lnet/bytebuddy/implementation/MethodCall;->call(Ljava/util/concurrent/Callable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 388
    .line 389
    .line 390
    move-result-object p3

    .line 391
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    const-string p3, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5"

    .line 396
    .line 397
    invoke-static {p3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p3

    .line 401
    invoke-static {p3}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 402
    .line 403
    .line 404
    move-result-object p3

    .line 405
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-static {p2}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 414
    .line 415
    .line 416
    move-result-object p2

    .line 417
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    new-instance p3, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;

    .line 430
    .line 431
    sget-object v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 432
    .line 433
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-direct {p3, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;-><init>(Ljava/io/File;)V

    .line 442
    .line 443
    .line 444
    invoke-interface {p1, p2, p3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    goto :goto_0

    .line 453
    :cond_2
    new-instance v3, Lnet/bytebuddy/ByteBuddy;

    .line 454
    .line 455
    invoke-direct {v3}, Lnet/bytebuddy/ByteBuddy;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v3, v1}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    invoke-static {v5}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-interface {v3, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-static {p1}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-interface {v3, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 479
    .line 480
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->returns(Ljava/lang/Class;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object p2

    .line 492
    invoke-static {p2}, Lnet/bytebuddy/implementation/FixedValue;->value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 493
    .line 494
    .line 495
    move-result-object p2

    .line 496
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-static {v2}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/reflect/Method;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 501
    .line 502
    .line 503
    move-result-object p2

    .line 504
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->method(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    invoke-static {p3}, Lnet/bytebuddy/implementation/MethodCall;->call(Ljava/util/concurrent/Callable;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 509
    .line 510
    .line 511
    move-result-object p2

    .line 512
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 521
    .line 522
    .line 523
    move-result-object p2

    .line 524
    new-instance p3, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;

    .line 525
    .line 526
    sget-object v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 527
    .line 528
    invoke-static {v7}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-virtual {v1, v2, v6}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-direct {p3, v1}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;-><init>(Ljava/io/File;)V

    .line 537
    .line 538
    .line 539
    invoke-interface {p1, p2, p3}, Lnet/bytebuddy/dynamic/DynamicType$Unloaded;->load(Ljava/lang/ClassLoader;Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Loaded;

    .line 540
    .line 541
    .line 542
    move-result-object p1

    .line 543
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Loaded;->getLoaded()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    :goto_0
    :try_start_0
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    move-result-object p2

    .line 551
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 563
    return-object p0

    .line 564
    :catch_0
    move-exception p0

    .line 565
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 566
    .line 567
    .line 568
    const/4 p0, 0x0

    .line 569
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 0

    .line 1
    const/16 p0, 0x12a

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, L飘花落叶言世哲苏子兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Method;

    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V
    .locals 5

    .line 1
    const/16 p0, 0x12c

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v0, p0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p0, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/16 v4, 0x12d

    .line 26
    .line 27
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/16 p0, 0x12a

    .line 38
    .line 39
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, v2, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/lang/reflect/Method;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method
