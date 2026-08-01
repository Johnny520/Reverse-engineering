.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final 飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

.field public final 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:[Ljava/lang/reflect/Parameter;

.field public final 飘花落叶言子楪兰哲世苏:Ljava/util/HashMap;

.field public final 飘花落叶言子楪兰哲苏世:Ljava/util/HashMap;

.field public final 飘花落叶言子楪兰苏世哲:[J

.field public final 飘花落叶言子楪兰苏哲世:Ljava/util/HashMap;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Constructor;


# direct methods
.method public varargs constructor <init>(Ljava/util/ArrayList;Ljava/lang/reflect/Constructor;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

    .line 7
    .line 8
    const/4 p3, 0x0

    .line 9
    const/4 p4, 0x1

    .line 10
    if-eqz p5, :cond_0

    .line 11
    .line 12
    move v0, p4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, p3

    .line 15
    :goto_0
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object p5, p2

    .line 21
    :goto_1
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/reflect/Parameter;

    .line 28
    .line 29
    array-length p2, p2

    .line 30
    new-array p2, p2, [J

    .line 31
    .line 32
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[J

    .line 33
    .line 34
    move p2, p3

    .line 35
    :goto_2
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/reflect/Parameter;

    .line 36
    .line 37
    array-length v0, p5

    .line 38
    if-ge p2, v0, :cond_4

    .line 39
    .line 40
    array-length v0, p6

    .line 41
    if-ge p2, v0, :cond_2

    .line 42
    .line 43
    aget-object p5, p6, p2

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_2
    aget-object p5, p5, p2

    .line 47
    .line 48
    invoke-virtual {p5}, Ljava/lang/reflect/Parameter;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    :goto_3
    if-nez p5, :cond_3

    .line 53
    .line 54
    const-string p5, "arg"

    .line 55
    .line 56
    invoke-static {p2, p5}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p5

    .line 60
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[J

    .line 61
    .line 62
    invoke-static {p5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    aput-wide v1, v0, p2

    .line 67
    .line 68
    add-int/lit8 p2, p2, 0x1

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    if-eqz p1, :cond_8

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    new-instance p5, Ljava/util/HashMap;

    .line 78
    .line 79
    const/high16 p6, 0x3f800000    # 1.0f

    .line 80
    .line 81
    invoke-direct {p5, p2, p6}, Ljava/util/HashMap;-><init>(IF)V

    .line 82
    .line 83
    .line 84
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Ljava/util/HashMap;

    .line 85
    .line 86
    new-instance p5, Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-direct {p5, p2, p6}, Ljava/util/HashMap;-><init>(IF)V

    .line 89
    .line 90
    .line 91
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/HashMap;

    .line 92
    .line 93
    new-instance p5, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-direct {p5, p2, p6}, Ljava/util/HashMap;-><init>(IF)V

    .line 96
    .line 97
    .line 98
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

    .line 99
    .line 100
    new-instance p5, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-direct {p5, p2, p6}, Ljava/util/HashMap;-><init>(IF)V

    .line 103
    .line 104
    .line 105
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/HashMap;

    .line 106
    .line 107
    move p5, p3

    .line 108
    :goto_4
    if-ge p5, p2, :cond_8

    .line 109
    .line 110
    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p6

    .line 114
    move-object v3, p6

    .line 115
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 116
    .line 117
    invoke-virtual {v3, p4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, L飘花落叶言楪子哲苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/reflect/AccessibleObject;)[Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p6

    .line 124
    invoke-virtual {v3}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    new-instance v1, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世哲苏兰;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move v4, p3

    .line 138
    :goto_5
    array-length v2, v6

    .line 139
    if-ge v4, v2, :cond_6

    .line 140
    .line 141
    array-length v2, p6

    .line 142
    if-ge v4, v2, :cond_6

    .line 143
    .line 144
    invoke-virtual {v1}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰()V

    .line 145
    .line 146
    .line 147
    aget-object v5, v6, v4

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世哲苏兰;Ljava/lang/Class;Ljava/lang/reflect/Constructor;ILjava/lang/reflect/Parameter;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, v1, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 157
    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    aput-object v2, p6, v4

    .line 161
    .line 162
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_6
    array-length v0, p6

    .line 166
    new-array v0, v0, [J

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    new-instance v2, Ljava/util/HashSet;

    .line 173
    .line 174
    array-length v4, p6

    .line 175
    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 176
    .line 177
    .line 178
    move v4, p3

    .line 179
    :goto_6
    array-length v5, p6

    .line 180
    if-ge v4, v5, :cond_7

    .line 181
    .line 182
    aget-object v5, p6, v4

    .line 183
    .line 184
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v5

    .line 188
    aput-wide v5, v0, v4

    .line 189
    .line 190
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    add-int/lit8 v4, v4, 0x1

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_7
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Ljava/util/HashMap;

    .line 201
    .line 202
    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲世苏:Ljava/util/HashMap;

    .line 206
    .line 207
    invoke-virtual {v3, v2, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    iget-object p6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/HashMap;

    .line 211
    .line 212
    invoke-virtual {p6, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    iget-object p6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

    .line 216
    .line 217
    invoke-virtual {p6, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    add-int/lit8 p5, p5, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏世哲:[J

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :goto_0
    const/4 v4, 0x0

    .line 9
    const-string v5, "invoke constructor error, "

    .line 10
    .line 11
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    aget-wide v6, v0, v3

    .line 14
    .line 15
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-interface {p1, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    if-nez v6, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Ljava/util/HashMap;

    .line 26
    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰哲苏世:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, [J

    .line 48
    .line 49
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪苏哲兰:Ljava/util/HashMap;

    .line 50
    .line 51
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, [Ljava/lang/reflect/Type;

    .line 56
    .line 57
    array-length v3, v0

    .line 58
    new-array v3, v3, [Ljava/lang/Object;

    .line 59
    .line 60
    :goto_1
    array-length v6, v0

    .line 61
    if-ge v2, v6, :cond_1

    .line 62
    .line 63
    aget-wide v6, v0, v2

    .line 64
    .line 65
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    aget-object v7, p0, v2

    .line 74
    .line 75
    if-nez v6, :cond_0

    .line 76
    .line 77
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    :cond_0
    aput-object v6, v3, v2

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    return-object p0

    .line 91
    :catch_0
    move-exception p0

    .line 92
    goto :goto_2

    .line 93
    :catch_1
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :catch_2
    move-exception p0

    .line 96
    goto :goto_2

    .line 97
    :catch_3
    move-exception p0

    .line 98
    :goto_2
    invoke-static {v5, v1, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    return-object v4

    .line 102
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:[Ljava/lang/reflect/Parameter;

    .line 108
    .line 109
    const/4 v6, 0x1

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    array-length v7, v3

    .line 113
    if-ne v7, v6, :cond_6

    .line 114
    .line 115
    aget-object p0, v3, v2

    .line 116
    .line 117
    aget-wide v2, v0, v2

    .line 118
    .line 119
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p0}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-nez p1, :cond_4

    .line 132
    .line 133
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto :goto_3

    .line 138
    :cond_4
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    :cond_5
    :goto_3
    invoke-interface {v1, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_6
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/function/BiFunction;

    .line 154
    .line 155
    if-eqz v1, :cond_b

    .line 156
    .line 157
    array-length v7, v3

    .line 158
    const/4 v8, 0x2

    .line 159
    if-ne v7, v8, :cond_b

    .line 160
    .line 161
    aget-wide v4, v0, v2

    .line 162
    .line 163
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    aget-object v2, v3, v2

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    if-nez p0, :cond_7

    .line 178
    .line 179
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    goto :goto_4

    .line 184
    :cond_7
    invoke-virtual {v2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-nez v4, :cond_8

    .line 189
    .line 190
    invoke-static {v2, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    :cond_8
    :goto_4
    aget-wide v4, v0, v6

    .line 195
    .line 196
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    aget-object v0, v3, v6

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-nez p1, :cond_9

    .line 211
    .line 212
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    goto :goto_5

    .line 217
    :cond_9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_a

    .line 222
    .line 223
    invoke-static {v0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    :cond_a
    :goto_5
    invoke-interface {v1, p0, p1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :cond_b
    array-length v1, v3

    .line 233
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Constructor;

    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    new-array v8, v8, [Ljava/lang/Object;

    .line 240
    .line 241
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世哲苏:Z

    .line 242
    .line 243
    if-eqz p0, :cond_12

    .line 244
    .line 245
    move p0, v2

    .line 246
    move v9, p0

    .line 247
    :goto_6
    if-ge p0, v1, :cond_16

    .line 248
    .line 249
    aget-object v10, v3, p0

    .line 250
    .line 251
    invoke-virtual {v10}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-virtual {v10}, Ljava/lang/reflect/Parameter;->getParameterizedType()Ljava/lang/reflect/Type;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    aget-wide v12, v0, p0

    .line 260
    .line 261
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 262
    .line 263
    .line 264
    move-result-object v12

    .line 265
    invoke-interface {p1, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    if-eqz v12, :cond_e

    .line 270
    .line 271
    invoke-virtual {v11, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    if-nez v13, :cond_c

    .line 276
    .line 277
    invoke-static {v11, v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    goto :goto_7

    .line 282
    :cond_c
    instance-of v11, v10, Ljava/lang/reflect/ParameterizedType;

    .line 283
    .line 284
    if-eqz v11, :cond_d

    .line 285
    .line 286
    invoke-static {v12, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    :cond_d
    :goto_7
    aput-object v12, v8, p0

    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_e
    shl-int v10, v6, p0

    .line 294
    .line 295
    or-int/2addr v9, v10

    .line 296
    invoke-virtual {v11}, Ljava/lang/Class;->isPrimitive()Z

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    if-eqz v10, :cond_f

    .line 301
    .line 302
    invoke-static {v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    aput-object v10, v8, p0

    .line 307
    .line 308
    :cond_f
    :goto_8
    add-int/lit8 v10, p0, 0x1

    .line 309
    .line 310
    rem-int/lit8 v11, v10, 0x20

    .line 311
    .line 312
    if-eqz v11, :cond_10

    .line 313
    .line 314
    if-ne v10, v1, :cond_11

    .line 315
    .line 316
    :cond_10
    div-int/lit8 p0, p0, 0x20

    .line 317
    .line 318
    add-int/2addr p0, v1

    .line 319
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    aput-object v9, v8, p0

    .line 324
    .line 325
    move v9, v2

    .line 326
    :cond_11
    move p0, v10

    .line 327
    goto :goto_6

    .line 328
    :cond_12
    :goto_9
    if-ge v2, v1, :cond_16

    .line 329
    .line 330
    aget-object p0, v3, v2

    .line 331
    .line 332
    invoke-virtual {p0}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-virtual {p0}, Ljava/lang/reflect/Parameter;->getParameterizedType()Ljava/lang/reflect/Type;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    aget-wide v9, v0, v2

    .line 341
    .line 342
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    invoke-interface {p1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    if-nez v9, :cond_13

    .line 351
    .line 352
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    goto :goto_a

    .line 357
    :cond_13
    invoke-virtual {v6, v9}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    if-nez v10, :cond_14

    .line 362
    .line 363
    invoke-static {v6, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    goto :goto_a

    .line 368
    :cond_14
    instance-of v6, p0, Ljava/lang/reflect/ParameterizedType;

    .line 369
    .line 370
    if-eqz v6, :cond_15

    .line 371
    .line 372
    invoke-static {v9, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v9

    .line 376
    :cond_15
    :goto_a
    aput-object v9, v8, v2

    .line 377
    .line 378
    add-int/lit8 v2, v2, 0x1

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_16
    :try_start_1
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    .line 385
    return-object p0

    .line 386
    :catch_4
    move-exception p0

    .line 387
    goto :goto_b

    .line 388
    :catch_5
    move-exception p0

    .line 389
    goto :goto_b

    .line 390
    :catch_6
    move-exception p0

    .line 391
    goto :goto_b

    .line 392
    :catch_7
    move-exception p0

    .line 393
    :goto_b
    invoke-static {v5, v7, p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 394
    .line 395
    .line 396
    return-object v4
.end method
