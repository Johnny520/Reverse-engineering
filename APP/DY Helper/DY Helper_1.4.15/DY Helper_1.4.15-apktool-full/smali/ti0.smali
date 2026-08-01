.class public final synthetic Lti0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lti0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lti0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lti0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lti0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lti0;->ι:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lti0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lti0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, v0

    .line 9
    check-cast v6, Lf8;

    .line 10
    .line 11
    iget-object v0, p0, Lti0;->η:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    check-cast v2, Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v0, p0, Lti0;->θ:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Landroid/app/Activity;

    .line 20
    .line 21
    iget-object p0, p0, Lti0;->ι:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, p0

    .line 24
    check-cast v5, Lfv;

    .line 25
    .line 26
    move-object v4, p1

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lqy0;->α:Lqy0;

    .line 33
    .line 34
    const-string p1, "images"

    .line 35
    .line 36
    invoke-static {p1, v6, v2}, Lqy0;->е(Ljava/lang/String;Lf8;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    invoke-static {v9}, Lqy0;->β(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_0

    .line 45
    .line 46
    iget-object p0, v6, Lf8;->θ:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "[IMG-DL-SKIP-DUP] awemeId="

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string p0, ", count="

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string p1, "DYHelper"

    .line 75
    .line 76
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string p0, "\u56fe\u7247\u4e0b\u8f7d\u5df2\u5728\u8fdb\u884c\u4e2d\uff0c\u8bf7\u52ff\u91cd\u590d\u70b9\u51fb"

    .line 80
    .line 81
    invoke-static {v3, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-static {v3}, Lqy0;->Φ(Landroid/content/Context;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lqy0;->ж()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    invoke-static {v3}, Lqy0;->А(Landroid/content/Context;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v0, "\u5171 "

    .line 103
    .line 104
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p0, " \u5f20\uff0c\u51c6\u5907\u4e2d..."

    .line 111
    .line 112
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string p1, "\u4e0b\u8f7d\u56fe\u7247"

    .line 120
    .line 121
    invoke-static {v3, p1, p0}, Lqy0;->б(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v0, "\u2b07 \u5f00\u59cb\u4e0b\u8f7d "

    .line 131
    .line 132
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string p0, " \u5f20\u56fe\u7247..."

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-static {v3, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Lvx0;

    .line 151
    .line 152
    invoke-direct/range {v1 .. v9}, Lvx0;-><init>(Ljava/util/ArrayList;Landroid/app/Activity;Ljava/lang/String;Lfv;Lf8;IZLjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/16 p0, 0x17

    .line 156
    .line 157
    const-string p1, "dl-images"

    .line 158
    .line 159
    invoke-static {p0, v1, p1}, Lp91;->Ζ(ILp70;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_0
    iget-object v0, p0, Lti0;->ζ:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v0, Lwi0;

    .line 168
    .line 169
    iget-object v1, p0, Lti0;->η:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v1, Ljava/lang/ClassLoader;

    .line 172
    .line 173
    iget-object v2, p0, Lti0;->θ:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Ljava/lang/Class;

    .line 176
    .line 177
    iget-object p0, p0, Lti0;->ι:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p0, Ljava/util/List;

    .line 180
    .line 181
    check-cast p1, Lorg/luckypray/dexkit/DexKitBridge;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v3, Lt00;

    .line 187
    .line 188
    const/4 v4, 0x4

    .line 189
    invoke-direct {v3, v2, v4}, Lt00;-><init>(Ljava/lang/Class;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v3}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(La80;)Lorg/luckypray/dexkit/result/MethodDataList;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    new-instance v3, Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_2

    .line 210
    .line 211
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, Lorg/luckypray/dexkit/result/MethodData;

    .line 216
    .line 217
    invoke-virtual {v4, v1}, Lorg/luckypray/dexkit/result/MethodData;->getMethodInstance(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    if-eqz v4, :cond_1

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_2
    sget-object p1, Lwi0;->α:Lwi0;

    .line 228
    .line 229
    invoke-virtual {p1, v3, v2}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-eqz v1, :cond_3

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_3
    move-object p0, p1

    .line 241
    :goto_2
    invoke-virtual {v0, p0, v2}, Lwi0;->λ(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    return-object p0

    .line 246
    nop

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
