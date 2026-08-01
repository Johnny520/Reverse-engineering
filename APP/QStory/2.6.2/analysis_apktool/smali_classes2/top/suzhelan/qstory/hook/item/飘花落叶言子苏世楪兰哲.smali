.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/item/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
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

.method public static final 飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-wide v0, -0x36a5b850051405a7L    # -2.3442569216377148E45

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    array-length v2, p0

    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    const/4 v5, 0x1

    .line 24
    if-ge v4, v2, :cond_1

    .line 25
    .line 26
    aget-object v6, p0, v4

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {p2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_1
    if-eqz p0, :cond_4

    .line 58
    .line 59
    const-class v2, Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    array-length v4, v2

    .line 78
    move v6, v3

    .line 79
    :goto_2
    if-ge v6, v4, :cond_3

    .line 80
    .line 81
    aget-object v7, v2, v6

    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    invoke-virtual {p2, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-eqz v8, :cond_2

    .line 92
    .line 93
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    goto :goto_1

    .line 109
    :catch_0
    :cond_4
    const/4 p0, 0x0

    .line 110
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
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/ClassLoader;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-wide v0, -0x36a5b84f051405a7L    # -2.3442582827671825E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-wide v1, -0x36a5c7f1051405a7L    # -2.338811042637512E45

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide v2, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    array-length v2, v0

    .line 48
    const/4 v3, 0x0

    .line 49
    move v4, v3

    .line 50
    :goto_0
    const-wide v5, -0x36a5c7d0051405a7L    # -2.3388559599099457E45

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-ge v4, v2, :cond_2

    .line 56
    .line 57
    aget-object v7, v0, v4

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    array-length v9, v8

    .line 64
    const/4 v10, 0x1

    .line 65
    if-ne v9, v10, :cond_1

    .line 66
    .line 67
    aget-object v8, v8, v3

    .line 68
    .line 69
    invoke-static {v8, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_1

    .line 74
    .line 75
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v8, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_0

    .line 91
    .line 92
    const-wide v5, -0x36a5c7b2051405a7L    # -2.3388967937939762E45

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v8, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-nez v5, :cond_0

    .line 106
    .line 107
    const-wide v5, -0x36a5c7a5051405a7L    # -2.338914488477056E45

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-static {v8, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_0

    .line 121
    .line 122
    const-wide v5, -0x36a5c7ac051405a7L    # -2.3389049605707823E45

    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v8, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_0

    .line 136
    .line 137
    const-wide v5, -0x36a5c7a9051405a7L    # -2.3389090439591854E45

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-static {v8, v5, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_1

    .line 151
    .line 152
    :cond_0
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    move-object v2, v0

    .line 173
    check-cast v2, Ljava/lang/reflect/Method;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_3

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_4
    const/4 v0, 0x0

    .line 191
    :goto_1
    check-cast v0, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    if-nez v0, :cond_5

    .line 194
    .line 195
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪哲世兰(Ljava/util/List;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    move-object v0, p1

    .line 200
    check-cast v0, Ljava/lang/reflect/Method;

    .line 201
    .line 202
    :cond_5
    if-eqz v0, :cond_6

    .line 203
    .line 204
    new-instance p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;

    .line 205
    .line 206
    const/4 v1, 0x6

    .line 207
    invoke-direct {p1, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;-><init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0, p1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 211
    .line 212
    .line 213
    :catch_0
    :cond_6
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Ljava/lang/ClassLoader;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-class v1, Landroid/view/View;

    .line 4
    .line 5
    const-wide v2, -0x36a5b8dd051405a7L    # -2.3440650023827714E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const-wide v3, -0x36a5b8ac051405a7L    # -2.344131697726688E45

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-wide v4, -0x36a5b88a051405a7L    # -2.3441779761285892E45

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v0, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-class v4, Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-wide v6, -0x36a5924c051405a7L    # -2.357503433617213E45

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    array-length v8, v5

    .line 68
    const/4 v9, 0x0

    .line 69
    move v10, v9

    .line 70
    :goto_0
    const/4 v11, 0x1

    .line 71
    if-ge v10, v8, :cond_1

    .line 72
    .line 73
    aget-object v12, v5, v10

    .line 74
    .line 75
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v13

    .line 79
    array-length v14, v13

    .line 80
    const/4 v15, 0x2

    .line 81
    if-ne v14, v15, :cond_0

    .line 82
    .line 83
    aget-object v14, v13, v9

    .line 84
    .line 85
    invoke-static {v14, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v14

    .line 89
    if-eqz v14, :cond_0

    .line 90
    .line 91
    aget-object v13, v13, v11

    .line 92
    .line 93
    invoke-static {v13, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    if-eqz v13, :cond_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const/4 v12, 0x0

    .line 104
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    array-length v4, v2

    .line 115
    move v5, v9

    .line 116
    :goto_2
    if-ge v5, v4, :cond_4

    .line 117
    .line 118
    aget-object v6, v2, v5

    .line 119
    .line 120
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    const-wide v13, -0x36a54943051405a7L    # -2.3829524712744963E45

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-static {v7, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_2

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    array-length v7, v7

    .line 144
    if-ne v7, v11, :cond_2

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    aget-object v7, v7, v9

    .line 151
    .line 152
    invoke-static {v7, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-nez v8, :cond_3

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-static {v7, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_2

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_2
    move-object/from16 v8, p0

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_3
    :goto_3
    new-instance v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 173
    .line 174
    move-object/from16 v8, p0

    .line 175
    .line 176
    invoke-direct {v7, v8, v3, v0, v12}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v6, v7}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 180
    .line 181
    .line 182
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :catch_0
    :cond_4
    return-void
.end method
