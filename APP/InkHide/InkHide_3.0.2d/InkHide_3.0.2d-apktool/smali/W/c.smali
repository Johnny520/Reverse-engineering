.class public final LW/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z;


# instance fields
.field public final synthetic a:I

.field public final b:LM/e;


# direct methods
.method public synthetic constructor <init>(LM/e;I)V
    .locals 0

    .line 1
    iput p2, p0, LW/c;->a:I

    iput-object p1, p0, LW/c;->b:LM/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(LM/e;LT/l;La0/a;LU/a;)LT/y;
    .locals 2

    .line 1
    invoke-interface {p3}, LU/a;->value()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La0/a;

    .line 6
    .line 7
    invoke-direct {v1, v0}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, LM/e;->b(La0/a;)LV/p;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, LV/p;->n()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p3}, LU/a;->nullSafe()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    instance-of v0, p0, LT/y;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    check-cast p0, LT/y;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    instance-of v0, p0, LT/z;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    check-cast p0, LT/z;

    .line 34
    .line 35
    invoke-interface {p0, p1, p2}, LT/z;->a(LT/l;La0/a;)LT/y;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_0
    if-eqz p0, :cond_1

    .line 40
    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    new-instance p1, LT/j;

    .line 44
    .line 45
    const/4 p2, 0x2

    .line 46
    invoke-direct {p1, p0, p2}, LT/j;-><init>(LT/y;I)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_1
    return-object p0

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    new-instance p3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v0, "Invalid attempt to bind an instance of "

    .line 56
    .line 57
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, " as a @JsonAdapter for "

    .line 72
    .line 73
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object p0, p2, La0/a;->b:Ljava/lang/reflect/Type;

    .line 77
    .line 78
    invoke-static {p0}, LV/d;->j(Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    .line 86
    .line 87
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method


# virtual methods
.method public final a(LT/l;La0/a;)LT/y;
    .locals 12

    .line 1
    const-class v3, Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v4, 0x2

    .line 4
    iget-object v5, p0, LW/c;->b:LM/e;

    .line 5
    .line 6
    const/4 v6, 0x1

    .line 7
    const/4 v7, 0x0

    .line 8
    const/4 v8, 0x0

    .line 9
    iget v9, p0, LW/c;->a:I

    .line 10
    .line 11
    packed-switch v9, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-class v9, Ljava/util/Map;

    .line 15
    .line 16
    iget-object v10, p2, La0/a;->a:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v11

    .line 22
    if-nez v11, :cond_0

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    const-class v7, Ljava/util/Properties;

    .line 27
    .line 28
    iget-object v11, p2, La0/a;->b:Ljava/lang/reflect/Type;

    .line 29
    .line 30
    if-ne v11, v7, :cond_1

    .line 31
    .line 32
    new-array v3, v4, [Ljava/lang/reflect/Type;

    .line 33
    .line 34
    const-class v4, Ljava/lang/String;

    .line 35
    .line 36
    aput-object v4, v3, v8

    .line 37
    .line 38
    aput-object v4, v3, v6

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v7, v11, Ljava/lang/reflect/WildcardType;

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    check-cast v11, Ljava/lang/reflect/WildcardType;

    .line 46
    .line 47
    invoke-interface {v11}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    aget-object v11, v7, v8

    .line 52
    .line 53
    :cond_2
    invoke-virtual {v9, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-static {v7}, LV/d;->b(Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {v11, v10, v9}, LV/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    new-instance v9, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {v11, v10, v7, v9}, LV/d;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    instance-of v9, v7, Ljava/lang/reflect/ParameterizedType;

    .line 74
    .line 75
    if-eqz v9, :cond_3

    .line 76
    .line 77
    check-cast v7, Ljava/lang/reflect/ParameterizedType;

    .line 78
    .line 79
    invoke-interface {v7}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    new-array v4, v4, [Ljava/lang/reflect/Type;

    .line 85
    .line 86
    aput-object v3, v4, v8

    .line 87
    .line 88
    aput-object v3, v4, v6

    .line 89
    .line 90
    move-object v3, v4

    .line 91
    :goto_0
    aget-object v4, v3, v8

    .line 92
    .line 93
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    if-eq v4, v7, :cond_5

    .line 96
    .line 97
    const-class v7, Ljava/lang/Boolean;

    .line 98
    .line 99
    if-ne v4, v7, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    new-instance v7, La0/a;

    .line 103
    .line 104
    invoke-direct {v7, v4}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v7}, LT/l;->d(La0/a;)LT/y;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    goto :goto_2

    .line 112
    :cond_5
    :goto_1
    sget-object v4, LW/x;->c:LT/i;

    .line 113
    .line 114
    :goto_2
    aget-object v7, v3, v6

    .line 115
    .line 116
    new-instance v9, La0/a;

    .line 117
    .line 118
    invoke-direct {v9, v7}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v9}, LT/l;->d(La0/a;)LT/y;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    move v9, v6

    .line 126
    move-object v6, v7

    .line 127
    invoke-virtual {v5, p2}, LM/e;->b(La0/a;)LV/p;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    new-instance v0, LW/k;

    .line 132
    .line 133
    move-object v5, v3

    .line 134
    aget-object v3, v5, v8

    .line 135
    .line 136
    aget-object v5, v5, v9

    .line 137
    .line 138
    move-object v1, p0

    .line 139
    move-object v2, p1

    .line 140
    invoke-direct/range {v0 .. v7}, LW/k;-><init>(LW/c;LT/l;Ljava/lang/reflect/Type;LT/y;Ljava/lang/reflect/Type;LT/y;LV/p;)V

    .line 141
    .line 142
    .line 143
    move-object v7, v0

    .line 144
    :goto_3
    return-object v7

    .line 145
    :pswitch_0
    const-class v1, LU/a;

    .line 146
    .line 147
    iget-object v3, p2, La0/a;->a:Ljava/lang/Class;

    .line 148
    .line 149
    invoke-virtual {v3, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, LU/a;

    .line 154
    .line 155
    if-nez v1, :cond_6

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    invoke-static {v5, p1, p2, v1}, LW/c;->b(LM/e;LT/l;La0/a;LU/a;)LT/y;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    :goto_4
    return-object v7

    .line 163
    :pswitch_1
    const-class v1, Ljava/util/Collection;

    .line 164
    .line 165
    iget-object v4, p2, La0/a;->a:Ljava/lang/Class;

    .line 166
    .line 167
    invoke-virtual {v1, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-nez v6, :cond_7

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_7
    iget-object v6, p2, La0/a;->b:Ljava/lang/reflect/Type;

    .line 175
    .line 176
    instance-of v7, v6, Ljava/lang/reflect/WildcardType;

    .line 177
    .line 178
    if-eqz v7, :cond_8

    .line 179
    .line 180
    check-cast v6, Ljava/lang/reflect/WildcardType;

    .line 181
    .line 182
    invoke-interface {v6}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    aget-object v6, v6, v8

    .line 187
    .line 188
    :cond_8
    invoke-virtual {v1, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    invoke-static {v7}, LV/d;->b(Z)V

    .line 193
    .line 194
    .line 195
    invoke-static {v6, v4, v1}, LV/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v7, Ljava/util/HashMap;

    .line 200
    .line 201
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-static {v6, v4, v1, v7}, LV/d;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    instance-of v4, v1, Ljava/lang/reflect/ParameterizedType;

    .line 209
    .line 210
    if-eqz v4, :cond_9

    .line 211
    .line 212
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    aget-object v3, v1, v8

    .line 219
    .line 220
    :cond_9
    new-instance v1, La0/a;

    .line 221
    .line 222
    invoke-direct {v1, v3}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v1}, LT/l;->d(La0/a;)LT/y;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v5, p2}, LM/e;->b(La0/a;)LV/p;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-instance v7, LW/b;

    .line 234
    .line 235
    invoke-direct {v7, p1, v3, v1, v0}, LW/b;-><init>(LT/l;Ljava/lang/reflect/Type;LT/y;LV/p;)V

    .line 236
    .line 237
    .line 238
    :goto_5
    return-object v7

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
