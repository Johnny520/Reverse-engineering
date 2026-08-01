.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/chat/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u82cf\u5170;",
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
    .locals 10

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
    const-wide v0, -0x36a5d268051405a7L    # -2.3351645767935873E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const-wide v3, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_0
    const/16 v5, 0x26aa

    .line 36
    .line 37
    sget v6, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 38
    .line 39
    if-lt v6, v5, :cond_1

    .line 40
    .line 41
    const-wide v5, -0x36a5d225051405a7L    # -2.335255772467922E45

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-wide v5, -0x36a5d219051405a7L    # -2.3352721060215344E45

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    array-length v6, v0

    .line 71
    move v7, v2

    .line 72
    :goto_1
    if-ge v7, v6, :cond_3

    .line 73
    .line 74
    aget-object v8, v0, v7

    .line 75
    .line 76
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    invoke-static {v9, v5}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object v8, v1

    .line 91
    :goto_2
    if-eqz v8, :cond_4

    .line 92
    .line 93
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;

    .line 94
    .line 95
    invoke-direct {v0, p0, v2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v8, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_3
    const-wide v5, -0x36a5d1f5051405a7L    # -2.335321106682371E45

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_5

    .line 115
    .line 116
    goto :goto_6

    .line 117
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    array-length v0, p1

    .line 128
    move v3, v2

    .line 129
    :goto_4
    if-ge v3, v0, :cond_7

    .line 130
    .line 131
    aget-object v4, p1, v3

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-eqz v5, :cond_6

    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 148
    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_6

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    array-length v5, v5

    .line 160
    const/4 v6, 0x3

    .line 161
    if-ne v5, v6, :cond_6

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    aget-object v5, v5, v2

    .line 168
    .line 169
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 170
    .line 171
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_6

    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    const/4 v6, 0x2

    .line 182
    aget-object v5, v5, v6

    .line 183
    .line 184
    const-class v6, Ljava/util/List;

    .line 185
    .line 186
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_6

    .line 191
    .line 192
    move-object v1, v4

    .line 193
    goto :goto_5

    .line 194
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 198
    .line 199
    new-instance p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;

    .line 200
    .line 201
    const/4 v0, 0x1

    .line 202
    invoke-direct {p1, p0, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏兰哲;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲苏兰;I)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_6
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5d28f051405a7L    # -2.3351114927443477E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
