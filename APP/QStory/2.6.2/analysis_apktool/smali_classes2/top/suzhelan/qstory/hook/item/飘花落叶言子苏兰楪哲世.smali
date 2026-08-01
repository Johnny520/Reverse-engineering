.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u5170\u696a\u54f2\u4e16;",
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

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-wide v1, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    array-length v1, p0

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    aget-object v4, p0, v3

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-wide v6, -0x36a5a13b051405a7L    # -2.352299835662258E45

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    array-length v5, v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const/4 v1, 0x1

    .line 79
    if-le p0, v1, :cond_5

    .line 80
    .line 81
    new-instance p0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object v4, v3

    .line 101
    check-cast v4, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    const-wide v5, -0x36a5ab52051405a7L    # -2.348784038247231E45

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 119
    .line 120
    const-wide v6, -0x36a57a83051405a7L    # -2.3657913509459395E45

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v4, v5, v6, v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Ljava/util/Locale;J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    const-wide v5, -0x36a57dde051405a7L    # -2.364622140733199E45

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v4, v5, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-nez v5, :cond_3

    .line 143
    .line 144
    const-wide v5, -0x36a5c137051405a7L    # -2.3411549075808635E45

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v4, v5, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-nez v5, :cond_3

    .line 158
    .line 159
    const-wide v5, -0x36a5c133051405a7L    # -2.3411603520987343E45

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v4, v5, v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_2

    .line 173
    .line 174
    :cond_3
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_5

    .line 183
    .line 184
    invoke-static {p0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪世哲兰(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    check-cast p0, Ljava/lang/reflect/Method;

    .line 189
    .line 190
    return-object p0

    .line 191
    :cond_5
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪哲世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, Ljava/lang/reflect/Method;

    .line 196
    .line 197
    return-object p0
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 2

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
    :try_start_0
    sget v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 13
    .line 14
    const/16 v1, 0x12f4

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide v0, -0x36a5c18b051405a7L    # -2.341040572705578E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 42
    .line 43
    const/16 v1, 0x9

    .line 44
    .line 45
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a5c19c051405a7L    # -2.3410174335046275E45

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
