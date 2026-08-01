.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;
.super L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u696a\u4e16\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5170\u5b50\u82cf\u54f2\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "QStory:app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const/16 v0, 0x4cd

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x806

    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const/16 p1, 0x807

    .line 22
    .line 23
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    if-eqz p1, :cond_3

    .line 32
    .line 33
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 43
    .line 44
    invoke-direct {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 48
    .line 49
    const/16 p1, 0x808

    .line 50
    .line 51
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const/16 v1, 0x809

    .line 56
    .line 57
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/16 v2, 0x80a

    .line 62
    .line 63
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    filled-new-array {p1, v1, v2}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪([Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世楪哲兰()Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/16 v0, 0x78e

    .line 79
    .line 80
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    move-object v1, v0

    .line 98
    check-cast v1, Ljava/lang/reflect/Method;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    array-length v1, v1

    .line 105
    const/4 v2, 0x3

    .line 106
    if-ne v1, v2, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    const/4 v0, 0x0

    .line 110
    :goto_0
    check-cast v0, Ljava/lang/reflect/Method;

    .line 111
    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 115
    .line 116
    const/4 v1, 0x1

    .line 117
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 121
    .line 122
    .line 123
    :cond_3
    const/16 p1, 0xa2

    .line 124
    .line 125
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 136
    .line 137
    invoke-direct {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 138
    .line 139
    .line 140
    iput-object p1, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 141
    .line 142
    const/16 v1, 0x80b

    .line 143
    .line 144
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const/16 v2, 0x80c

    .line 149
    .line 150
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    const/16 v3, 0x80d

    .line 155
    .line 156
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世兰哲楪([Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰()Ljava/lang/reflect/Method;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-nez v0, :cond_4

    .line 172
    .line 173
    const/16 v1, 0x80e

    .line 174
    .line 175
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    if-eqz v1, :cond_4

    .line 184
    .line 185
    invoke-static {v1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const/16 v2, 0x80f

    .line 190
    .line 191
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iput-object v2, v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ljava/lang/reflect/Method;

    .line 202
    .line 203
    if-eqz v1, :cond_4

    .line 204
    .line 205
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;

    .line 206
    .line 207
    invoke-direct {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;-><init>()V

    .line 208
    .line 209
    .line 210
    iput-object p1, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 211
    .line 212
    filled-new-array {v1}, [Ljava/lang/reflect/Method;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    iget-object v1, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏世哲楪兰()Ljava/lang/reflect/Method;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    :cond_4
    if-eqz v0, :cond_5

    .line 230
    .line 231
    new-instance p1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;

    .line 232
    .line 233
    const/4 v1, 0x2

    .line 234
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V

    .line 235
    .line 236
    .line 237
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 238
    .line 239
    .line 240
    :catch_0
    :cond_5
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x805

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
