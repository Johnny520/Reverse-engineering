.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰世哲楪;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u4e16\u54f2\u696a;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    const-wide v0, -0x36a538d6051405a7L    # -2.3886760206861064E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    const-wide v0, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const-wide v2, -0x36a5c0b7051405a7L    # -2.341329132152727E45

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x0

    .line 27
    :try_start_0
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 35
    const-wide v7, -0x36a5c09e051405a7L    # -2.3413631603894192E45

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 49
    .line 50
    .line 51
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    array-length v7, v6

    .line 64
    move v8, v5

    .line 65
    :goto_0
    if-ge v8, v7, :cond_1

    .line 66
    .line 67
    aget-object v9, v6, v8

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    array-length v10, v10

    .line 74
    if-ne v10, v4, :cond_0

    .line 75
    .line 76
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    aget-object v10, v10, v5

    .line 81
    .line 82
    invoke-static {v10, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_0

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {v10, v11}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_0

    .line 99
    .line 100
    move-object v6, v9

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    add-int/lit8 v8, v8, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    move-object v6, p1

    .line 106
    :goto_1
    if-eqz v6, :cond_2

    .line 107
    .line 108
    new-instance v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    const/16 v8, 0x14

    .line 111
    .line 112
    invoke-direct {v7, v8}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v7}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 116
    .line 117
    .line 118
    :catch_1
    :cond_2
    const-wide v6, -0x36a5c080051405a7L    # -2.3414039942734497E45

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    :try_start_3
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v6}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    array-length v0, v3

    .line 150
    move v1, v5

    .line 151
    :goto_2
    if-ge v1, v0, :cond_4

    .line 152
    .line 153
    aget-object v6, v3, v1

    .line 154
    .line 155
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    array-length v8, v7

    .line 160
    const/4 v9, 0x5

    .line 161
    if-ne v8, v9, :cond_3

    .line 162
    .line 163
    aget-object v8, v7, v5

    .line 164
    .line 165
    invoke-static {v8, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-eqz v8, :cond_3

    .line 170
    .line 171
    aget-object v8, v7, v4

    .line 172
    .line 173
    invoke-static {v8, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_3

    .line 178
    .line 179
    const/4 v8, 0x2

    .line 180
    aget-object v8, v7, v8

    .line 181
    .line 182
    invoke-static {v8, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    if-eqz v8, :cond_3

    .line 187
    .line 188
    const/4 v8, 0x3

    .line 189
    aget-object v8, v7, v8

    .line 190
    .line 191
    invoke-static {v8, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-eqz v8, :cond_3

    .line 196
    .line 197
    const/4 v8, 0x4

    .line 198
    aget-object v7, v7, v8

    .line 199
    .line 200
    const-class v8, Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v7, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-eqz v7, :cond_3

    .line 207
    .line 208
    move-object p1, v6

    .line 209
    goto :goto_3

    .line 210
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_4
    :goto_3
    if-eqz p1, :cond_5

    .line 214
    .line 215
    new-instance p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 216
    .line 217
    const/16 v0, 0x15

    .line 218
    .line 219
    invoke-direct {p0, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-static {p1, p0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 223
    .line 224
    .line 225
    :catch_2
    :cond_5
    return-void
.end method
