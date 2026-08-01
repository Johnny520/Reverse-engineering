.class public L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

.field public 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 13

    .line 1
    const-wide v0, -0x36a50e1c051405a7L    # -2.4035640548036313E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    array-length v0, p1

    .line 23
    const/4 v1, 0x0

    .line 24
    move v2, v1

    .line 25
    :goto_0
    const-wide v3, -0x36a50dd7051405a7L    # -2.4036579727369015E45

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    const/4 v6, 0x0

    .line 32
    if-ge v2, v0, :cond_1

    .line 33
    .line 34
    aget-object v7, p1, v2

    .line 35
    .line 36
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_0

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move-object v7, v6

    .line 62
    :goto_1
    invoke-static {v7}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-class v0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    const-class v2, Ljava/util/List;

    .line 69
    .line 70
    filled-new-array {v0, v2}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v7, p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    iput-object v0, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 77
    .line 78
    iput-object v2, v7, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-virtual {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;

    .line 85
    .line 86
    invoke-direct {v0, p0, v5}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 90
    .line 91
    .line 92
    const-wide v7, -0x36a51571051405a7L    # -2.401009214792789E45

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    const-wide v7, -0x36a50182051405a7L    # -2.407955058466379E45

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v2, p1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 115
    .line 116
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 117
    .line 118
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 119
    .line 120
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    iput-object v0, v2, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-virtual {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Method;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;

    .line 131
    .line 132
    invoke-direct {v0, p0, v1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 136
    .line 137
    .line 138
    const-wide v7, -0x36a50dbc051405a7L    # -2.403694723232529E45

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-static {p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    array-length v0, p1

    .line 156
    move v2, v1

    .line 157
    :goto_2
    const/4 v7, 0x2

    .line 158
    if-ge v2, v0, :cond_3

    .line 159
    .line 160
    aget-object v8, p1, v2

    .line 161
    .line 162
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    array-length v10, v9

    .line 167
    const/4 v11, 0x3

    .line 168
    if-ne v10, v11, :cond_2

    .line 169
    .line 170
    aget-object v10, v9, v1

    .line 171
    .line 172
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    const-wide v11, -0x36a50d7f051405a7L    # -2.4037777521300577E45

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-eqz v10, :cond_2

    .line 190
    .line 191
    aget-object v10, v9, v5

    .line 192
    .line 193
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_2

    .line 206
    .line 207
    aget-object v9, v9, v7

    .line 208
    .line 209
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 210
    .line 211
    if-ne v9, v10, :cond_2

    .line 212
    .line 213
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 214
    .line 215
    .line 216
    move-object v6, v8

    .line 217
    goto :goto_3

    .line 218
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_3
    :goto_3
    new-instance p1, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;

    .line 222
    .line 223
    invoke-direct {p1, p0, v7}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v6, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Member;L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method

.method public final 飘花落叶言子楪世兰哲苏()Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x36a515ad051405a7L    # -2.400927547024728E45

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
