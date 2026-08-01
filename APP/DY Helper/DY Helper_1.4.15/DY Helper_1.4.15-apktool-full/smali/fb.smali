.class public abstract Lfb;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile β:Z

.field public static final γ:Ljava/util/List;

.field public static final δ:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    const-string v0, "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A8F6A1C3389074335160687955403BE9F1FF8D9DFF8B0C721F258E0C89091A072226B"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11191155A1E04541A2C6D7589F3BA263618D5C9E9631DAED24084C05EC0FA5AEEE60D19DF7E8BEB7B8F8F59915"

    .line 15
    .line 16
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lfb;->γ:Ljava/util/List;

    .line 29
    .line 30
    const-string v0, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D68E259722F51C3EC086C9236A937084C06950"

    .line 31
    .line 32
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "com.p771ss.android.ugc.aweme.feed.p1043ui.bottom.BottomSpace"

    .line 37
    .line 38
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lfb;->δ:Ljava/util/List;

    .line 47
    .line 48
    return-void
.end method

.method public static α(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Lab;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p2

    .line 5
    move-object v2, p3

    .line 6
    move-object v3, p4

    .line 7
    move-object v4, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lab;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    if-eqz p3, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    check-cast p3, Lorg/luckypray/dexkit/result/MethodData;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    .line 36
    :try_start_1
    invoke-virtual {p3, p1}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p3, v0

    .line 43
    :try_start_2
    new-instance p4, Leo1;

    .line 44
    .line 45
    invoke-direct {p4, p3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object p3, p4

    .line 49
    :goto_1
    instance-of p4, p3, Leo1;

    .line 50
    .line 51
    if-eqz p4, :cond_1

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    :cond_1
    check-cast p3, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    move-object p0, v0

    .line 64
    new-instance p2, Leo1;

    .line 65
    .line 66
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-static {p2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    const-string p1, "ra96c4bde0d98e3d4"

    .line 76
    .line 77
    const-string p3, "dexFindMethodsCompat failed"

    .line 78
    .line 79
    invoke-static {p1, p3, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    instance-of p0, p2, Leo1;

    .line 83
    .line 84
    if-eqz p0, :cond_4

    .line 85
    .line 86
    sget-object p2, Ljz;->ε:Ljz;

    .line 87
    .line 88
    :cond_4
    check-cast p2, Ljava/util/List;

    .line 89
    .line 90
    return-object p2
.end method

.method public static β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    new-instance p1, Leo1;

    .line 9
    .line 10
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p0, p1

    .line 14
    :goto_0
    instance-of p1, p0, Leo1;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 20
    .line 21
    return-object p0
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1}, Lfb;->ι(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    new-instance v4, Leb;

    .line 31
    .line 32
    sget-object v5, Ldb;->ε:Ldb;

    .line 33
    .line 34
    invoke-direct {v4, v5, v3}, Leb;-><init>(Ldb;Ljava/lang/reflect/Method;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p0, v1}, Lfb;->θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    new-instance v4, Leb;

    .line 62
    .line 63
    sget-object v5, Ldb;->ζ:Ldb;

    .line 64
    .line 65
    invoke-direct {v4, v5, v3}, Leb;-><init>(Ldb;Ljava/lang/reflect/Method;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-static {p0, v1}, Lfb;->η(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    new-instance v2, Leb;

    .line 93
    .line 94
    sget-object v3, Ldb;->η:Ldb;

    .line 95
    .line 96
    invoke-direct {v2, v3, v1}, Leb;-><init>(Ldb;Ljava/lang/reflect/Method;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_3

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    .line 112
    .line 113
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 114
    .line 115
    .line 116
    new-instance v1, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    move-object v3, v2

    .line 136
    check-cast v3, Leb;

    .line 137
    .line 138
    iget-object v4, v3, Leb;->α:Ldb;

    .line 139
    .line 140
    iget-object v3, v3, Leb;->β:Ljava/lang/reflect/Method;

    .line 141
    .line 142
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-instance v5, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v4, ":"

    .line 155
    .line 156
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_4

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_6

    .line 185
    .line 186
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Leb;

    .line 191
    .line 192
    iget-object v0, v0, Leb;->β:Ljava/lang/reflect/Method;

    .line 193
    .line 194
    const/4 v2, 0x1

    .line 195
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 196
    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    const-string v0, "resolved methods="

    .line 204
    .line 205
    invoke-static {v0, p0}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    const/4 v0, 0x4

    .line 210
    const-string v2, "ra96c4bde0d98e3d4"

    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    invoke-static {v2, p0, v3, v0, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    sget-object p0, Lfb;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 217
    .line 218
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    :cond_7
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_8

    .line 227
    .line 228
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, La80;

    .line 233
    .line 234
    :try_start_0
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    .line 239
    goto :goto_6

    .line 240
    :catchall_0
    move-exception v0

    .line 241
    new-instance v3, Leo1;

    .line 242
    .line 243
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object v0, v3

    .line 247
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-eqz v0, :cond_7

    .line 252
    .line 253
    const-string v3, "listener failed"

    .line 254
    .line 255
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_8
    :goto_7
    return-void
.end method

.method public static δ(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    array-length p0, v0

    .line 30
    const/4 v2, 0x2

    .line 31
    if-ne p0, v2, :cond_1

    .line 32
    .line 33
    aget-object p0, v0, v1

    .line 34
    .line 35
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    aget-object v0, v0, p0

    .line 45
    .line 46
    const-class v2, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    return p0

    .line 55
    :cond_1
    :goto_0
    return v1
.end method

.method public static ε(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-class v2, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    array-length p0, v0

    .line 30
    const/4 v2, 0x3

    .line 31
    if-ne p0, v2, :cond_1

    .line 32
    .line 33
    aget-object p0, v0, v1

    .line 34
    .line 35
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-static {p0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    aget-object v3, v0, p0

    .line 45
    .line 46
    invoke-static {v3, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    aget-object v0, v0, v2

    .line 54
    .line 55
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    return p0

    .line 64
    :cond_1
    :goto_0
    return v1
.end method

.method public static ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x23

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v1, 0x28

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    array-length v2, v1

    .line 42
    const/4 v3, 0x0

    .line 43
    move v4, v3

    .line 44
    :goto_0
    if-ge v3, v2, :cond_1

    .line 45
    .line 46
    aget-object v5, v1, v3

    .line 47
    .line 48
    add-int/lit8 v6, v4, 0x1

    .line 49
    .line 50
    if-lez v4, :cond_0

    .line 51
    .line 52
    const/16 v4, 0x2c

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    move v4, v6

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-string v1, "):"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static η(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 10

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->н:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-static {v1}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p1, Ld50;

    .line 52
    .line 53
    const/16 v0, 0x11

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ld50;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Ljava/util/HashSet;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v3, v1

    .line 87
    check-cast v3, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    return-object v0

    .line 124
    :cond_6
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v3, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lfb;->δ:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p0, v5}, Lfb;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_b

    .line 171
    .line 172
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, Ljava/lang/Class;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    array-length v5, v4

    .line 186
    const/4 v6, 0x0

    .line 187
    :goto_5
    if-ge v6, v5, :cond_9

    .line 188
    .line 189
    aget-object v7, v4, v6

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    const-string v9, "LIZ"

    .line 196
    .line 197
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_a

    .line 202
    .line 203
    invoke-static {v7}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_a

    .line 208
    .line 209
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_b
    new-instance v3, Ld50;

    .line 216
    .line 217
    const/16 v4, 0xe

    .line 218
    .line 219
    invoke-direct {v3, v4}, Ld50;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v3, Ljava/util/HashSet;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 229
    .line 230
    .line 231
    new-instance v4, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_d

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    move-object v6, v5

    .line 251
    check-cast v6, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    invoke-static {v6}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-eqz v6, :cond_c

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_e

    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Ljava/lang/reflect/Method;

    .line 282
    .line 283
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-nez v1, :cond_10

    .line 292
    .line 293
    if-eqz p1, :cond_f

    .line 294
    .line 295
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-static {v0, v4}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 298
    .line 299
    .line 300
    :cond_f
    return-object v4

    .line 301
    :cond_10
    if-nez p1, :cond_11

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_11
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 305
    .line 306
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-nez p1, :cond_12

    .line 313
    .line 314
    :goto_8
    sget-object p0, Ljz;->ε:Ljz;

    .line 315
    .line 316
    return-object p0

    .line 317
    :cond_12
    new-instance p1, Lbb;

    .line 318
    .line 319
    invoke-direct {p1, p0, v2}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 320
    .line 321
    .line 322
    const-string v1, "\u5b9a\u4f4d\u5e95\u680f\u5360\u4f4d\u5e03\u5c40\u5237\u65b0\u6df7\u6dc6\u65b9\u6cd5"

    .line 323
    .line 324
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    new-instance p1, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    :cond_13
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_14

    .line 342
    .line 343
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    move-object v1, v0

    .line 348
    check-cast v1, Ljava/lang/reflect/Method;

    .line 349
    .line 350
    invoke-static {v1}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-eqz v1, :cond_13

    .line 355
    .line 356
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_9

    .line 360
    :cond_14
    new-instance p0, Ld50;

    .line 361
    .line 362
    const/16 v0, 0x12

    .line 363
    .line 364
    invoke-direct {p0, v0}, Ld50;-><init>(I)V

    .line 365
    .line 366
    .line 367
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    new-instance p1, Ljava/util/HashSet;

    .line 372
    .line 373
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 374
    .line 375
    .line 376
    new-instance v0, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 379
    .line 380
    .line 381
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    :cond_15
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_16

    .line 390
    .line 391
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    move-object v3, v1

    .line 396
    check-cast v3, Ljava/lang/reflect/Method;

    .line 397
    .line 398
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    if-eqz v3, :cond_15

    .line 407
    .line 408
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_17

    .line 421
    .line 422
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    check-cast p1, Ljava/lang/reflect/Method;

    .line 427
    .line 428
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 429
    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_17
    return-object v0
.end method

.method public static θ(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 10

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->м:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-static {v1}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p1, Ld50;

    .line 52
    .line 53
    const/16 v0, 0x13

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ld50;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Ljava/util/HashSet;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v3, v1

    .line 87
    check-cast v3, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    return-object v0

    .line 124
    :cond_6
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v3, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lfb;->δ:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p0, v5}, Lfb;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_b

    .line 171
    .line 172
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, Ljava/lang/Class;

    .line 177
    .line 178
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    array-length v5, v4

    .line 186
    const/4 v6, 0x0

    .line 187
    :goto_5
    if-ge v6, v5, :cond_9

    .line 188
    .line 189
    aget-object v7, v4, v6

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    const-string v9, "LIZIZ"

    .line 196
    .line 197
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_a

    .line 202
    .line 203
    invoke-static {v7}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    if-eqz v8, :cond_a

    .line 208
    .line 209
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_b
    new-instance v3, Ld50;

    .line 216
    .line 217
    const/16 v4, 0xf

    .line 218
    .line 219
    invoke-direct {v3, v4}, Ld50;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1, v3}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    new-instance v3, Ljava/util/HashSet;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 229
    .line 230
    .line 231
    new-instance v4, Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-eqz v5, :cond_d

    .line 245
    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    move-object v6, v5

    .line 251
    check-cast v6, Ljava/lang/reflect/Method;

    .line 252
    .line 253
    invoke-static {v6}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    if-eqz v6, :cond_c

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_e

    .line 276
    .line 277
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Ljava/lang/reflect/Method;

    .line 282
    .line 283
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 284
    .line 285
    .line 286
    goto :goto_7

    .line 287
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-nez v1, :cond_10

    .line 292
    .line 293
    if-eqz p1, :cond_f

    .line 294
    .line 295
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 296
    .line 297
    invoke-static {v0, v4}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 298
    .line 299
    .line 300
    :cond_f
    return-object v4

    .line 301
    :cond_10
    if-nez p1, :cond_11

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_11
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 305
    .line 306
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    if-nez p1, :cond_12

    .line 313
    .line 314
    :goto_8
    sget-object p0, Ljz;->ε:Ljz;

    .line 315
    .line 316
    return-object p0

    .line 317
    :cond_12
    new-instance p1, Lbb;

    .line 318
    .line 319
    const/4 v1, 0x2

    .line 320
    invoke-direct {p1, p0, v1}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 321
    .line 322
    .line 323
    const-string v1, "\u5b9a\u4f4d\u5e95\u680f\u5360\u4f4d\u53ef\u89c1\u6027\u6df7\u6dc6\u65b9\u6cd5"

    .line 324
    .line 325
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    new-instance p1, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 332
    .line 333
    .line 334
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    :cond_13
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_14

    .line 343
    .line 344
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    move-object v1, v0

    .line 349
    check-cast v1, Ljava/lang/reflect/Method;

    .line 350
    .line 351
    invoke-static {v1}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_13

    .line 356
    .line 357
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_14
    new-instance p0, Ld50;

    .line 362
    .line 363
    const/16 v0, 0x14

    .line 364
    .line 365
    invoke-direct {p0, v0}, Ld50;-><init>(I)V

    .line 366
    .line 367
    .line 368
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    new-instance p1, Ljava/util/HashSet;

    .line 373
    .line 374
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 375
    .line 376
    .line 377
    new-instance v0, Ljava/util/ArrayList;

    .line 378
    .line 379
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 383
    .line 384
    .line 385
    move-result-object p0

    .line 386
    :cond_15
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_16

    .line 391
    .line 392
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    move-object v3, v1

    .line 397
    check-cast v3, Ljava/lang/reflect/Method;

    .line 398
    .line 399
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-eqz v3, :cond_15

    .line 408
    .line 409
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result p1

    .line 421
    if-eqz p1, :cond_17

    .line 422
    .line 423
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    check-cast p1, Ljava/lang/reflect/Method;

    .line 428
    .line 429
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 430
    .line 431
    .line 432
    goto :goto_b

    .line 433
    :cond_17
    return-object v0
.end method

.method public static ι(Ljava/lang/ClassLoader;Z)Ljava/util/List;
    .locals 9

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->л:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->σ(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v1, v0

    .line 39
    check-cast v1, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-static {v1}, Lfb;->ε(Ljava/lang/reflect/Method;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p1, Ld50;

    .line 52
    .line 53
    const/16 v0, 0x15

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ld50;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Ljava/util/HashSet;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object v3, v1

    .line 87
    check-cast v3, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/reflect/Method;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    return-object v0

    .line 124
    :cond_6
    :goto_3
    new-instance v1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v3, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lfb;->γ:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_7
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_8

    .line 145
    .line 146
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {p0, v5}, Lfb;->β(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    const/4 v5, 0x0

    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Ljava/lang/Class;

    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    array-length v6, v4

    .line 187
    :goto_5
    if-ge v5, v6, :cond_9

    .line 188
    .line 189
    aget-object v7, v4, v5

    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v7}, Lfb;->ε(Ljava/lang/reflect/Method;)Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eqz v8, :cond_a

    .line 199
    .line 200
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :cond_c
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_d

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    move-object v6, v4

    .line 226
    check-cast v6, Ljava/lang/reflect/Method;

    .line 227
    .line 228
    invoke-static {v6}, Lfb;->λ(Ljava/lang/reflect/Method;)I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    const/16 v7, 0x708

    .line 233
    .line 234
    if-lt v6, v7, :cond_c

    .line 235
    .line 236
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_d
    new-instance v1, Ld50;

    .line 241
    .line 242
    const/16 v4, 0x10

    .line 243
    .line 244
    invoke-direct {v1, v4}, Ld50;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-static {v3, v1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    new-instance v3, Ljava/util/HashSet;

    .line 252
    .line 253
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 254
    .line 255
    .line 256
    new-instance v4, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :cond_e
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_f

    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    move-object v7, v6

    .line 276
    check-cast v7, Ljava/lang/reflect/Method;

    .line 277
    .line 278
    invoke-static {v7}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    invoke-virtual {v3, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_e

    .line 287
    .line 288
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_f
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_10

    .line 301
    .line 302
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    check-cast v3, Ljava/lang/reflect/Method;

    .line 307
    .line 308
    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-nez v1, :cond_12

    .line 317
    .line 318
    if-eqz p1, :cond_11

    .line 319
    .line 320
    sget-object p0, Lox;->α:Ljava/lang/Object;

    .line 321
    .line 322
    invoke-static {v0, v4}, Lox;->χ(Lkx;Ljava/util/List;)V

    .line 323
    .line 324
    .line 325
    :cond_11
    return-object v4

    .line 326
    :cond_12
    if-nez p1, :cond_13

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_13
    sget-object p1, Lox;->α:Ljava/lang/Object;

    .line 330
    .line 331
    sget-object p1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 334
    .line 335
    .line 336
    move-result p1

    .line 337
    if-nez p1, :cond_14

    .line 338
    .line 339
    :goto_9
    sget-object p0, Ljz;->ε:Ljz;

    .line 340
    .line 341
    return-object p0

    .line 342
    :cond_14
    new-instance p1, Lbb;

    .line 343
    .line 344
    invoke-direct {p1, p0, v5}, Lbb;-><init>(Ljava/lang/ClassLoader;I)V

    .line 345
    .line 346
    .line 347
    const-string v1, "\u5b9a\u4f4d\u5e95\u680f\u53ef\u89c1\u6027\u6df7\u6dc6\u63a7\u5236\u65b9\u6cd5"

    .line 348
    .line 349
    invoke-static {v0, p0, v1, p1}, Lox;->λ(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    new-instance p1, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    :cond_15
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v0

    .line 366
    if-eqz v0, :cond_16

    .line 367
    .line 368
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    move-object v1, v0

    .line 373
    check-cast v1, Ljava/lang/reflect/Method;

    .line 374
    .line 375
    invoke-static {v1}, Lfb;->ε(Ljava/lang/reflect/Method;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_15

    .line 380
    .line 381
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_16
    new-instance p0, Ld50;

    .line 386
    .line 387
    const/16 v0, 0x16

    .line 388
    .line 389
    invoke-direct {p0, v0}, Ld50;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-static {p1, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    new-instance p1, Ljava/util/HashSet;

    .line 397
    .line 398
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 399
    .line 400
    .line 401
    new-instance v0, Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    :cond_17
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v1

    .line 414
    if-eqz v1, :cond_18

    .line 415
    .line 416
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    move-object v3, v1

    .line 421
    check-cast v3, Ljava/lang/reflect/Method;

    .line 422
    .line 423
    invoke-static {v3}, Lfb;->ζ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-eqz v3, :cond_17

    .line 432
    .line 433
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    if-eqz p1, :cond_19

    .line 446
    .line 447
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    check-cast p1, Ljava/lang/reflect/Method;

    .line 452
    .line 453
    invoke-virtual {p1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 454
    .line 455
    .line 456
    goto :goto_c

    .line 457
    :cond_19
    return-object v0
.end method

.method public static κ(Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0}, Lfb;->δ(Ljava/lang/reflect/Method;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/16 v2, 0x320

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x0

    .line 27
    :goto_0
    const-string v3, "BottomSpace"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    add-int/lit16 v2, v2, 0x3e8

    .line 36
    .line 37
    :cond_1
    const-string v1, "feed"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-static {v0, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    add-int/lit16 v2, v2, 0xc8

    .line 47
    .line 48
    :cond_2
    const-string v1, "bottom"

    .line 49
    .line 50
    invoke-static {v0, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    add-int/lit16 v2, v2, 0xc8

    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "LIZ"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string v0, "LIZIZ"

    .line 75
    .line 76
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    return v2

    .line 84
    :cond_5
    :goto_1
    add-int/lit8 v2, v2, 0x64

    .line 85
    .line 86
    return v2
.end method

.method public static λ(Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {p0}, Lfb;->ε(Ljava/lang/reflect/Method;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/16 v2, 0x320

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v2, 0x0

    .line 27
    :goto_0
    const-string v3, "MainBottomTabViewNew"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    add-int/lit16 v2, v2, 0x3e8

    .line 36
    .line 37
    :cond_1
    const-string v1, "homepage"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-static {v0, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    add-int/lit16 v2, v2, 0xc8

    .line 47
    .line 48
    :cond_2
    const-string v1, "tab"

    .line 49
    .line 50
    invoke-static {v0, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    add-int/lit16 v2, v2, 0xc8

    .line 57
    .line 58
    :cond_3
    const-string v1, "bottom"

    .line 59
    .line 60
    invoke-static {v0, v1, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    add-int/lit16 v2, v2, 0xc8

    .line 67
    .line 68
    :cond_4
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v0, "LJIIJ"

    .line 73
    .line 74
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    add-int/lit16 v2, v2, 0x12c

    .line 81
    .line 82
    :cond_5
    return v2
.end method
