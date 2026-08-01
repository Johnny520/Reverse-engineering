.class public final Lxhss/ᲀᲈᛵᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static ᛳᲁᲇᛸ:Landroid/app/Application;

.field public static ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

.field public static final ᛸᛲᲀᛵ:[C

.field public static final ᛸᛴᛶᛳ:[Ljava/lang/reflect/Type;

.field public static ᲀᲇᛳᲁ:Ljava/lang/Boolean;

.field public static ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

.field public static ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 3
    .line 4
    sput-object v0, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    const/16 v0, 0x10

    .line 7
    .line 8
    new-array v0, v0, [C

    .line 9
    .line 10
    fill-array-data v0, :array_0

    .line 11
    .line 12
    .line 13
    sput-object v0, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ:[C

    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lxhss/ᛱᛷᛶᛲ;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛱᛲᲇ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Lxhss/ᛱᛷᛶᛲ;-><init>(Ljava/lang/reflect/Type;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    return-object p0

    .line 28
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 33
    .line 34
    new-instance v0, Lxhss/ᛸᲇᲈᛳ;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/lang/Class;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {v0, v1, v2, p0}, Lxhss/ᛸᲇᲈᛳ;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 59
    .line 60
    new-instance v0, Lxhss/ᛱᛷᛶᛲ;

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v0, p0}, Lxhss/ᛱᛷᛶᛲ;-><init>(Ljava/lang/reflect/Type;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 75
    .line 76
    new-instance v0, Lxhss/ᲁᛸᛴᲁ;

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-direct {v0, v1, p0}, Lxhss/ᲁᛸᛴᲁ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_4
    return-object p0
.end method

.method public static ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    if-lez v0, :cond_2

    .line 3
    .line 4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return-void
.end method

.method public static ᛲᛴᲀᲈ(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :cond_0
    instance-of v2, p2, Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v2, :cond_9

    .line 7
    .line 8
    move-object v2, p2

    .line 9
    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .line 10
    .line 11
    invoke-virtual {p3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ljava/lang/reflect/Type;

    .line 16
    .line 17
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    if-ne v4, v5, :cond_1

    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_1
    return-object v4

    .line 25
    :cond_2
    invoke-virtual {p3, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :cond_3
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    instance-of v4, p2, Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v4, :cond_4

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Class;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    move-object p2, v0

    .line 43
    :goto_0
    if-nez p2, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    invoke-static {p0, p1, p2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    array-length v5, p2

    .line 59
    :goto_1
    if-ge v3, v5, :cond_7

    .line 60
    .line 61
    aget-object v6, p2, v3

    .line 62
    .line 63
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_6

    .line 68
    .line 69
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    aget-object p2, p2, v3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_7
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_8
    :goto_2
    move-object p2, v2

    .line 88
    :goto_3
    if-ne p2, v2, :cond_0

    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_9
    instance-of v0, p2, Ljava/lang/Class;

    .line 93
    .line 94
    if-eqz v0, :cond_b

    .line 95
    .line 96
    move-object v0, p2

    .line 97
    check-cast v0, Ljava/lang/Class;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_b

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p0, p1, p2, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {p2, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_a

    .line 118
    .line 119
    move-object p2, v0

    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_a
    new-instance p1, Lxhss/ᛱᛷᛶᛲ;

    .line 123
    .line 124
    invoke-direct {p1, p0}, Lxhss/ᛱᛷᛶᛲ;-><init>(Ljava/lang/reflect/Type;)V

    .line 125
    .line 126
    .line 127
    :goto_4
    move-object p2, p1

    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_b
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 131
    .line 132
    if-eqz v0, :cond_d

    .line 133
    .line 134
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 135
    .line 136
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {p0, p1, v0, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_c

    .line 149
    .line 150
    goto/16 :goto_8

    .line 151
    .line 152
    :cond_c
    new-instance p1, Lxhss/ᛱᛷᛶᛲ;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Lxhss/ᛱᛷᛶᛲ;-><init>(Ljava/lang/reflect/Type;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_d
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    if-eqz v0, :cond_12

    .line 162
    .line 163
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 164
    .line 165
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p0, p1, v0, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-static {v4, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    array-length v6, v5

    .line 182
    move-object v7, v5

    .line 183
    move v5, v3

    .line 184
    :goto_5
    if-ge v3, v6, :cond_10

    .line 185
    .line 186
    aget-object v8, v7, v3

    .line 187
    .line 188
    invoke-static {p0, p1, v8, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    aget-object v9, v7, v3

    .line 193
    .line 194
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-nez v9, :cond_f

    .line 199
    .line 200
    if-nez v5, :cond_e

    .line 201
    .line 202
    invoke-virtual {v7}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    move-object v7, v5

    .line 207
    check-cast v7, [Ljava/lang/reflect/Type;

    .line 208
    .line 209
    move v5, v2

    .line 210
    :cond_e
    aput-object v8, v7, v3

    .line 211
    .line 212
    :cond_f
    add-int/lit8 v3, v3, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_10
    if-eqz v0, :cond_11

    .line 216
    .line 217
    if-eqz v5, :cond_16

    .line 218
    .line 219
    :cond_11
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Ljava/lang/Class;

    .line 224
    .line 225
    new-instance p1, Lxhss/ᛸᲇᲈᛳ;

    .line 226
    .line 227
    invoke-direct {p1, v4, p0, v7}, Lxhss/ᛸᲇᲈᛳ;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_12
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    .line 232
    .line 233
    if-eqz v0, :cond_16

    .line 234
    .line 235
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 236
    .line 237
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    array-length v5, v0

    .line 246
    if-ne v5, v2, :cond_14

    .line 247
    .line 248
    aget-object v4, v0, v3

    .line 249
    .line 250
    invoke-static {p0, p1, v4, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    aget-object p1, v0, v3

    .line 255
    .line 256
    if-eq p0, p1, :cond_16

    .line 257
    .line 258
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 259
    .line 260
    if-eqz p1, :cond_13

    .line 261
    .line 262
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 263
    .line 264
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    goto :goto_6

    .line 269
    :cond_13
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 270
    .line 271
    aput-object p0, p1, v3

    .line 272
    .line 273
    move-object p0, p1

    .line 274
    :goto_6
    new-instance p2, Lxhss/ᲁᛸᛴᲁ;

    .line 275
    .line 276
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 277
    .line 278
    const-class v0, Ljava/lang/Object;

    .line 279
    .line 280
    aput-object v0, p1, v3

    .line 281
    .line 282
    invoke-direct {p2, p1, p0}, Lxhss/ᲁᛸᛴᲁ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 283
    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_14
    array-length v0, v4

    .line 287
    if-ne v0, v2, :cond_16

    .line 288
    .line 289
    aget-object v0, v4, v3

    .line 290
    .line 291
    invoke-static {p0, p1, v0, p3}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    aget-object p1, v4, v3

    .line 296
    .line 297
    if-eq p0, p1, :cond_16

    .line 298
    .line 299
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 300
    .line 301
    if-eqz p1, :cond_15

    .line 302
    .line 303
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 304
    .line 305
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    goto :goto_7

    .line 310
    :cond_15
    new-array p1, v2, [Ljava/lang/reflect/Type;

    .line 311
    .line 312
    aput-object p0, p1, v3

    .line 313
    .line 314
    move-object p0, p1

    .line 315
    :goto_7
    new-instance p2, Lxhss/ᲁᛸᛴᲁ;

    .line 316
    .line 317
    sget-object p1, Lxhss/ᲀᲈᛵᛸ;->ᛸᛴᛶᛳ:[Ljava/lang/reflect/Type;

    .line 318
    .line 319
    invoke-direct {p2, p0, p1}, Lxhss/ᲁᛸᛴᲁ;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 320
    .line 321
    .line 322
    :cond_16
    :goto_8
    if-eqz v1, :cond_17

    .line 323
    .line 324
    invoke-virtual {p3, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    :cond_17
    return-object p2
.end method

.method public static ᛳᲁᲇᛸ(Ljava/lang/String;IILjava/lang/String;I)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    and-int/lit8 v2, p4, 0x1

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v2, p1

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v4, p4, 0x2

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, p4, 0x8

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move v5, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v5, v6

    .line 33
    :goto_2
    and-int/lit8 v7, p4, 0x10

    .line 34
    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    move v7, v3

    .line 38
    goto :goto_3

    .line 39
    :cond_3
    move v7, v6

    .line 40
    :goto_3
    and-int/lit8 v8, p4, 0x20

    .line 41
    .line 42
    if-eqz v8, :cond_4

    .line 43
    .line 44
    move v8, v3

    .line 45
    goto :goto_4

    .line 46
    :cond_4
    move v8, v6

    .line 47
    :goto_4
    and-int/lit8 v9, p4, 0x40

    .line 48
    .line 49
    if-eqz v9, :cond_5

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move v3, v6

    .line 53
    :goto_5
    move v6, v2

    .line 54
    :goto_6
    if-ge v6, v4, :cond_15

    .line 55
    .line 56
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/16 v10, 0x20

    .line 61
    .line 62
    const/16 v11, 0x80

    .line 63
    .line 64
    const/16 v12, 0x2b

    .line 65
    .line 66
    const/16 v13, 0x25

    .line 67
    .line 68
    const/16 v14, 0x7f

    .line 69
    .line 70
    if-lt v9, v10, :cond_9

    .line 71
    .line 72
    if-eq v9, v14, :cond_9

    .line 73
    .line 74
    if-lt v9, v11, :cond_6

    .line 75
    .line 76
    if-eqz v3, :cond_9

    .line 77
    .line 78
    :cond_6
    int-to-char v15, v9

    .line 79
    invoke-static {v1, v15}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛲᛸᲇ(Ljava/lang/CharSequence;C)Z

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    if-nez v15, :cond_9

    .line 84
    .line 85
    if-ne v9, v13, :cond_7

    .line 86
    .line 87
    if-eqz v5, :cond_9

    .line 88
    .line 89
    if-eqz v7, :cond_7

    .line 90
    .line 91
    invoke-static {v0, v6, v4}, Lxhss/ᲀᲈᛵᛸ;->ᲇᛸᛳᲁ(Ljava/lang/String;II)Z

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    if-eqz v15, :cond_9

    .line 96
    .line 97
    :cond_7
    if-ne v9, v12, :cond_8

    .line 98
    .line 99
    if-eqz v8, :cond_8

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_8
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    add-int/2addr v6, v9

    .line 107
    goto :goto_6

    .line 108
    :cond_9
    :goto_7
    new-instance v9, Lxhss/ᛴᛲᛴᛶ;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v0, v2, v6}, Lxhss/ᛴᛲᛴᛶ;->ᲁᲁᛴᲁ(Ljava/lang/String;II)V

    .line 114
    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    :goto_8
    if-ge v6, v4, :cond_14

    .line 118
    .line 119
    invoke-virtual {v0, v6}, Ljava/lang/String;->codePointAt(I)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    if-eqz v5, :cond_a

    .line 124
    .line 125
    const/16 v13, 0x9

    .line 126
    .line 127
    if-eq v15, v13, :cond_10

    .line 128
    .line 129
    const/16 v13, 0xa

    .line 130
    .line 131
    if-eq v15, v13, :cond_10

    .line 132
    .line 133
    const/16 v13, 0xc

    .line 134
    .line 135
    if-eq v15, v13, :cond_10

    .line 136
    .line 137
    const/16 v13, 0xd

    .line 138
    .line 139
    if-ne v15, v13, :cond_a

    .line 140
    .line 141
    goto :goto_b

    .line 142
    :cond_a
    const-string v13, "+"

    .line 143
    .line 144
    if-ne v15, v10, :cond_b

    .line 145
    .line 146
    const-string v11, " !\"#$&\'()+,/:;<=>?@[\\]^`{|}~"

    .line 147
    .line 148
    if-ne v1, v11, :cond_b

    .line 149
    .line 150
    invoke-virtual {v9, v13}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲇᛲ(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_9
    const/16 v11, 0x80

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_b
    if-ne v15, v12, :cond_d

    .line 157
    .line 158
    if-eqz v8, :cond_d

    .line 159
    .line 160
    if-eqz v5, :cond_c

    .line 161
    .line 162
    goto :goto_a

    .line 163
    :cond_c
    const-string v13, "%2B"

    .line 164
    .line 165
    :goto_a
    invoke-virtual {v9, v13}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲇᛲ(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_9

    .line 169
    :cond_d
    if-lt v15, v10, :cond_11

    .line 170
    .line 171
    if-eq v15, v14, :cond_11

    .line 172
    .line 173
    const/16 v11, 0x80

    .line 174
    .line 175
    if-lt v15, v11, :cond_e

    .line 176
    .line 177
    if-eqz v3, :cond_12

    .line 178
    .line 179
    :cond_e
    int-to-char v13, v15

    .line 180
    invoke-static {v1, v13}, Lxhss/ᛲᛱᛲᲀ;->ᛱᛲᛸᲇ(Ljava/lang/CharSequence;C)Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    if-nez v13, :cond_12

    .line 185
    .line 186
    const/16 v13, 0x25

    .line 187
    .line 188
    if-ne v15, v13, :cond_f

    .line 189
    .line 190
    if-eqz v5, :cond_12

    .line 191
    .line 192
    if-eqz v7, :cond_f

    .line 193
    .line 194
    invoke-static {v0, v6, v4}, Lxhss/ᲀᲈᛵᛸ;->ᲇᛸᛳᲁ(Ljava/lang/String;II)Z

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    if-nez v13, :cond_f

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_f
    invoke-virtual {v9, v15}, Lxhss/ᛴᛲᛴᛶ;->ᛳᛸᛵᲀ(I)V

    .line 202
    .line 203
    .line 204
    :cond_10
    :goto_b
    const/16 v11, 0x25

    .line 205
    .line 206
    goto :goto_e

    .line 207
    :cond_11
    const/16 v11, 0x80

    .line 208
    .line 209
    :cond_12
    :goto_c
    if-nez v2, :cond_13

    .line 210
    .line 211
    new-instance v2, Lxhss/ᛴᛲᛴᛶ;

    .line 212
    .line 213
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 214
    .line 215
    .line 216
    :cond_13
    invoke-virtual {v2, v15}, Lxhss/ᛴᛲᛴᛶ;->ᛳᛸᛵᲀ(I)V

    .line 217
    .line 218
    .line 219
    :goto_d
    invoke-virtual {v2}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ()Z

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    if-nez v13, :cond_10

    .line 224
    .line 225
    invoke-virtual {v2}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    and-int/lit16 v10, v13, 0xff

    .line 230
    .line 231
    const/16 v11, 0x25

    .line 232
    .line 233
    invoke-virtual {v9, v11}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 234
    .line 235
    .line 236
    shr-int/lit8 v10, v10, 0x4

    .line 237
    .line 238
    and-int/lit8 v10, v10, 0xf

    .line 239
    .line 240
    sget-object v16, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ:[C

    .line 241
    .line 242
    aget-char v10, v16, v10

    .line 243
    .line 244
    invoke-virtual {v9, v10}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 245
    .line 246
    .line 247
    and-int/lit8 v10, v13, 0xf

    .line 248
    .line 249
    aget-char v10, v16, v10

    .line 250
    .line 251
    invoke-virtual {v9, v10}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 252
    .line 253
    .line 254
    const/16 v10, 0x20

    .line 255
    .line 256
    const/16 v11, 0x80

    .line 257
    .line 258
    goto :goto_d

    .line 259
    :goto_e
    invoke-static {v15}, Ljava/lang/Character;->charCount(I)I

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    add-int/2addr v6, v10

    .line 264
    move v13, v11

    .line 265
    const/16 v10, 0x20

    .line 266
    .line 267
    const/16 v11, 0x80

    .line 268
    .line 269
    goto/16 :goto_8

    .line 270
    .line 271
    :cond_14
    invoke-virtual {v9}, Lxhss/ᛴᛲᛴᛶ;->ᛶᲇᲈᛸ()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    return-object v0

    .line 276
    :cond_15
    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    return-object v0
.end method

.method public static ᛳᲈᲈᛲ(Landroid/content/Context;I)Landroid/view/animation/Animation;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    :cond_0
    new-instance p0, Landroid/view/animation/AlphaAnimation;

    .line 11
    .line 12
    const/high16 p1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-direct {p0, p1, p1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v0, 0xb4

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public static ᛴᲈᛱᛴ(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getType(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v3, v4, :cond_4

    .line 36
    .line 37
    move p1, v2

    .line 38
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p1, v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_1
    if-ge v6, v5, :cond_2

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    array-length v3, p0

    .line 91
    move v4, v2

    .line 92
    :goto_2
    if-ge v4, v3, :cond_5

    .line 93
    .line 94
    aget-object v5, p0, v4

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :goto_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method

.method public static ᛶᲇᲈᛸ(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lxhss/ᛶᛶᲈᛱ;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v1, v3, :cond_16

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v4, "font-family"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-interface {v5, v3, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_15

    .line 33
    .line 34
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v6, Lxhss/ᲀᛳᛴᲀ;->ᛱᛱᛲᲇ:[I

    .line 39
    .line 40
    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const/4 v10, 0x6

    .line 55
    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    invoke-virtual {v4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-virtual {v4, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const/4 v12, 0x3

    .line 68
    invoke-virtual {v4, v12, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    move-object/from16 v16, v1

    .line 73
    .line 74
    const/16 v1, 0x1f4

    .line 75
    .line 76
    const/4 v7, 0x4

    .line 77
    invoke-virtual {v4, v7, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v7, 0x7

    .line 82
    invoke-virtual {v4, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 87
    .line 88
    .line 89
    if-eqz v8, :cond_9

    .line 90
    .line 91
    if-eqz v9, :cond_9

    .line 92
    .line 93
    invoke-static {v0, v11}, Lxhss/ᲀᲈᛵᛸ;->ᛴᲈᛱᛴ(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    new-instance v4, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    :goto_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eq v7, v12, :cond_5

    .line 107
    .line 108
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eq v7, v3, :cond_1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    const-string v10, "fallback"

    .line 120
    .line 121
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_4

    .line 126
    .line 127
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    sget-object v10, Lxhss/ᲀᛳᛴᲀ;->ᲇᛴᲇᛵ:[I

    .line 132
    .line 133
    invoke-virtual {v0, v7, v10}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    :try_start_0
    invoke-virtual {v7, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    const/4 v6, 0x1

    .line 142
    invoke-virtual {v7, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v17

    .line 146
    move v6, v13

    .line 147
    invoke-virtual {v7, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    if-eqz v10, :cond_3

    .line 152
    .line 153
    :goto_2
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eq v3, v12, :cond_2

    .line 158
    .line 159
    invoke-static {v5}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :catchall_0
    move-exception v0

    .line 164
    move-object/from16 v17, v7

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_2
    move-object v3, v7

    .line 168
    :try_start_1
    new-instance v7, Lxhss/ᛷᛱᛲᲇ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 169
    .line 170
    move-object/from16 v24, v17

    .line 171
    .line 172
    move-object/from16 v17, v3

    .line 173
    .line 174
    move v3, v12

    .line 175
    move-object/from16 v12, v24

    .line 176
    .line 177
    :try_start_2
    invoke-direct/range {v7 .. v13}, Lxhss/ᛷᛱᛲᲇ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 178
    .line 179
    .line 180
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :catchall_1
    move-exception v0

    .line 188
    goto :goto_3

    .line 189
    :catchall_2
    move-exception v0

    .line 190
    move-object/from16 v17, v3

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_3
    move-object/from16 v17, v7

    .line 194
    .line 195
    :try_start_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 196
    .line 197
    const-string v1, "query attribute must be set in fallback element"

    .line 198
    .line 199
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 203
    :goto_3
    invoke-virtual/range {v17 .. v17}, Landroid/content/res/TypedArray;->recycle()V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_4
    move v3, v12

    .line 208
    move v6, v13

    .line 209
    invoke-static {v5}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    move v12, v3

    .line 213
    move v13, v6

    .line 214
    const/4 v3, 0x2

    .line 215
    const/4 v6, 0x0

    .line 216
    goto :goto_1

    .line 217
    :cond_5
    move v6, v13

    .line 218
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_6

    .line 223
    .line 224
    new-instance v0, Lxhss/ᲀᛲᲈᛶ;

    .line 225
    .line 226
    invoke-direct {v0, v4, v6, v1, v2}, Lxhss/ᲀᛲᲈᛶ;-><init>(Ljava/util/ArrayList;IILjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :cond_6
    if-eqz v14, :cond_8

    .line 231
    .line 232
    new-instance v7, Lxhss/ᛷᛱᛲᲇ;

    .line 233
    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    move-object v10, v14

    .line 237
    invoke-direct/range {v7 .. v13}, Lxhss/ᛷᛱᛲᲇ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    if-eqz v15, :cond_7

    .line 244
    .line 245
    new-instance v7, Lxhss/ᛷᛱᛲᲇ;

    .line 246
    .line 247
    const/4 v12, 0x0

    .line 248
    const/4 v13, 0x0

    .line 249
    move-object v10, v15

    .line 250
    invoke-direct/range {v7 .. v13}, Lxhss/ᛷᛱᛲᲇ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_7
    new-instance v0, Lxhss/ᲀᛲᲈᛶ;

    .line 257
    .line 258
    invoke-direct {v0, v4, v6, v1, v2}, Lxhss/ᲀᛲᲈᛶ;-><init>(Ljava/util/ArrayList;IILjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    :cond_8
    const-string v0, "The provider font XML requires query attribute or fallback children."

    .line 263
    .line 264
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v16

    .line 268
    :cond_9
    move v3, v12

    .line 269
    new-instance v1, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    :goto_5
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-eq v2, v3, :cond_13

    .line 279
    .line 280
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    const/4 v4, 0x2

    .line 285
    if-eq v2, v4, :cond_a

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_a
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    const-string v6, "font"

    .line 293
    .line 294
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    if-eqz v2, :cond_12

    .line 299
    .line 300
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    sget-object v6, Lxhss/ᲀᛳᛴᲀ;->ᛳᲁᲇᛸ:[I

    .line 305
    .line 306
    invoke-virtual {v0, v2, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    const/16 v6, 0x8

    .line 311
    .line 312
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-eqz v8, :cond_b

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_b
    const/4 v6, 0x1

    .line 320
    :goto_6
    const/16 v8, 0x190

    .line 321
    .line 322
    invoke-virtual {v2, v6, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 323
    .line 324
    .line 325
    move-result v19

    .line 326
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 327
    .line 328
    .line 329
    move-result v6

    .line 330
    if-eqz v6, :cond_c

    .line 331
    .line 332
    move v6, v10

    .line 333
    :goto_7
    const/4 v8, 0x0

    .line 334
    goto :goto_8

    .line 335
    :cond_c
    move v6, v4

    .line 336
    goto :goto_7

    .line 337
    :goto_8
    invoke-virtual {v2, v6, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    const/4 v8, 0x1

    .line 342
    if-ne v8, v6, :cond_d

    .line 343
    .line 344
    move/from16 v20, v8

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_d
    const/16 v20, 0x0

    .line 348
    .line 349
    :goto_9
    const/16 v12, 0x9

    .line 350
    .line 351
    invoke-virtual {v2, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_e

    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_e
    move v12, v3

    .line 359
    :goto_a
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    if-eqz v6, :cond_f

    .line 364
    .line 365
    move v6, v7

    .line 366
    goto :goto_b

    .line 367
    :cond_f
    const/4 v6, 0x4

    .line 368
    :goto_b
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v21

    .line 372
    const/4 v6, 0x0

    .line 373
    invoke-virtual {v2, v12, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 374
    .line 375
    .line 376
    move-result v22

    .line 377
    const/4 v9, 0x5

    .line 378
    invoke-virtual {v2, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    if-eqz v11, :cond_10

    .line 383
    .line 384
    move v11, v9

    .line 385
    goto :goto_c

    .line 386
    :cond_10
    move v11, v6

    .line 387
    :goto_c
    invoke-virtual {v2, v11, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 388
    .line 389
    .line 390
    move-result v23

    .line 391
    invoke-virtual {v2, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 395
    .line 396
    .line 397
    :goto_d
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eq v2, v3, :cond_11

    .line 402
    .line 403
    invoke-static {v5}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 404
    .line 405
    .line 406
    goto :goto_d

    .line 407
    :cond_11
    new-instance v18, Lxhss/ᛲᲁᲈᛱ;

    .line 408
    .line 409
    invoke-direct/range {v18 .. v23}, Lxhss/ᛲᲁᲈᛱ;-><init>(IZLjava/lang/String;II)V

    .line 410
    .line 411
    .line 412
    move-object/from16 v2, v18

    .line 413
    .line 414
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto/16 :goto_5

    .line 418
    .line 419
    :cond_12
    const/4 v8, 0x1

    .line 420
    const/4 v9, 0x5

    .line 421
    invoke-static {v5}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_5

    .line 425
    .line 426
    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-eqz v0, :cond_14

    .line 431
    .line 432
    return-object v16

    .line 433
    :cond_14
    new-instance v0, Lxhss/ᛷᲁᛵ;

    .line 434
    .line 435
    const/4 v6, 0x0

    .line 436
    new-array v2, v6, [Lxhss/ᛲᲁᲈᛱ;

    .line 437
    .line 438
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    check-cast v1, [Lxhss/ᛲᲁᲈᛱ;

    .line 443
    .line 444
    invoke-direct {v0, v1}, Lxhss/ᛷᲁᛵ;-><init>([Lxhss/ᛲᲁᲈᛱ;)V

    .line 445
    .line 446
    .line 447
    return-object v0

    .line 448
    :cond_15
    move-object/from16 v16, v1

    .line 449
    .line 450
    invoke-static {v5}, Lxhss/ᲀᲈᛵᛸ;->ᛱᛳᲁᲈ(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 451
    .line 452
    .line 453
    return-object v16

    .line 454
    :cond_16
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 455
    .line 456
    const-string v1, "No start tag found"

    .line 457
    .line 458
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    throw v0
.end method

.method public static ᛷᛴᛷᛱ(Ljava/lang/String;IIZ)I
    .locals 4

    .line 1
    :goto_0
    if-ge p1, p2, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    if-ne v0, v1, :cond_5

    .line 15
    .line 16
    :cond_0
    const/16 v1, 0x7f

    .line 17
    .line 18
    if-ge v0, v1, :cond_5

    .line 19
    .line 20
    const/16 v1, 0x30

    .line 21
    .line 22
    const/16 v3, 0x3a

    .line 23
    .line 24
    if-gt v1, v0, :cond_1

    .line 25
    .line 26
    if-ge v0, v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v1, 0x61

    .line 30
    .line 31
    if-gt v1, v0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x7b

    .line 34
    .line 35
    if-ge v0, v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/16 v1, 0x41

    .line 39
    .line 40
    if-gt v1, v0, :cond_3

    .line 41
    .line 42
    const/16 v1, 0x5b

    .line 43
    .line 44
    if-ge v0, v1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    if-ne v0, v3, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    const/4 v0, 0x0

    .line 51
    goto :goto_2

    .line 52
    :cond_5
    :goto_1
    move v0, v2

    .line 53
    :goto_2
    xor-int/lit8 v1, p3, 0x1

    .line 54
    .line 55
    if-ne v0, v1, :cond_6

    .line 56
    .line 57
    return p1

    .line 58
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    return p2
.end method

.method public static ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;ILjava/util/ArrayList;IILjava/util/ArrayList;)V
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v2, p5

    .line 8
    .line 9
    move/from16 v10, p6

    .line 10
    .line 11
    move-object/from16 v8, p7

    .line 12
    .line 13
    const-string v3, "Failed requirement."

    .line 14
    .line 15
    if-ge v2, v10, :cond_11

    .line 16
    .line 17
    move v4, v2

    .line 18
    :goto_0
    if-ge v4, v10, :cond_1

    .line 19
    .line 20
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Lxhss/ᛳᛶᲈᲈ;

    .line 25
    .line 26
    invoke-virtual {v6}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-lt v6, v1, :cond_0

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v3}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual/range {p4 .. p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lxhss/ᛳᛶᲈᲈ;

    .line 44
    .line 45
    add-int/lit8 v4, v10, -0x1

    .line 46
    .line 47
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lxhss/ᛳᛶᲈᲈ;

    .line 52
    .line 53
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ne v1, v6, :cond_2

    .line 58
    .line 59
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v2, v2, 0x1

    .line 70
    .line 71
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    check-cast v6, Lxhss/ᛳᛶᲈᲈ;

    .line 76
    .line 77
    move-object/from16 v19, v6

    .line 78
    .line 79
    move v6, v2

    .line 80
    move v2, v3

    .line 81
    move-object/from16 v3, v19

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move v6, v2

    .line 85
    const/4 v2, -0x1

    .line 86
    :goto_1
    invoke-virtual {v3, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual {v4, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    const-wide/16 v14, 0x2

    .line 95
    .line 96
    if-eq v7, v9, :cond_c

    .line 97
    .line 98
    add-int/lit8 v3, v6, 0x1

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    :goto_2
    if-ge v3, v10, :cond_4

    .line 102
    .line 103
    add-int/lit8 v7, v3, -0x1

    .line 104
    .line 105
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    check-cast v7, Lxhss/ᛳᛶᲈᲈ;

    .line 110
    .line 111
    invoke-virtual {v7, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Lxhss/ᛳᛶᲈᲈ;

    .line 120
    .line 121
    invoke-virtual {v9, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eq v7, v9, :cond_3

    .line 126
    .line 127
    add-int/lit8 v4, v4, 0x1

    .line 128
    .line 129
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const/16 v16, -0x1

    .line 133
    .line 134
    const-wide/16 v17, 0x4

    .line 135
    .line 136
    iget-wide v11, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 137
    .line 138
    div-long v11, v11, v17

    .line 139
    .line 140
    add-long v11, v11, p0

    .line 141
    .line 142
    add-long/2addr v11, v14

    .line 143
    mul-int/lit8 v3, v4, 0x2

    .line 144
    .line 145
    int-to-long v13, v3

    .line 146
    add-long/2addr v11, v13

    .line 147
    invoke-virtual {v0, v4}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 151
    .line 152
    .line 153
    move v2, v6

    .line 154
    :goto_3
    if-ge v2, v10, :cond_7

    .line 155
    .line 156
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, Lxhss/ᛳᛶᲈᲈ;

    .line 161
    .line 162
    invoke-virtual {v3, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eq v2, v6, :cond_5

    .line 167
    .line 168
    add-int/lit8 v4, v2, -0x1

    .line 169
    .line 170
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    check-cast v4, Lxhss/ᛳᛶᲈᲈ;

    .line 175
    .line 176
    invoke-virtual {v4, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eq v3, v4, :cond_6

    .line 181
    .line 182
    :cond_5
    and-int/lit16 v3, v3, 0xff

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 185
    .line 186
    .line 187
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_7
    new-instance v4, Lxhss/ᛴᛲᛴᛶ;

    .line 191
    .line 192
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    move v7, v6

    .line 196
    :goto_4
    if-ge v7, v10, :cond_b

    .line 197
    .line 198
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, Lxhss/ᛳᛶᲈᲈ;

    .line 203
    .line 204
    invoke-virtual {v2, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    add-int/lit8 v3, v7, 0x1

    .line 209
    .line 210
    move v6, v3

    .line 211
    :goto_5
    if-ge v6, v10, :cond_9

    .line 212
    .line 213
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    check-cast v9, Lxhss/ᛳᛶᲈᲈ;

    .line 218
    .line 219
    invoke-virtual {v9, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-eq v2, v9, :cond_8

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_9
    move v6, v10

    .line 230
    :goto_6
    if-ne v3, v6, :cond_a

    .line 231
    .line 232
    add-int/lit8 v2, v1, 0x1

    .line 233
    .line 234
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    check-cast v3, Lxhss/ᛳᛶᲈᲈ;

    .line 239
    .line 240
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-ne v2, v3, :cond_a

    .line 245
    .line 246
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    invoke-virtual {v0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 257
    .line 258
    .line 259
    move-object v9, v8

    .line 260
    move-wide v2, v11

    .line 261
    move v8, v6

    .line 262
    goto :goto_7

    .line 263
    :cond_a
    iget-wide v2, v4, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 264
    .line 265
    div-long v2, v2, v17

    .line 266
    .line 267
    add-long/2addr v2, v11

    .line 268
    long-to-int v2, v2

    .line 269
    mul-int/lit8 v2, v2, -0x1

    .line 270
    .line 271
    invoke-virtual {v0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 272
    .line 273
    .line 274
    add-int/lit8 v5, v1, 0x1

    .line 275
    .line 276
    move-object v9, v8

    .line 277
    move-wide v2, v11

    .line 278
    move v8, v6

    .line 279
    move-object/from16 v6, p4

    .line 280
    .line 281
    invoke-static/range {v2 .. v9}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 282
    .line 283
    .line 284
    move-object v5, v6

    .line 285
    :goto_7
    move-wide v11, v2

    .line 286
    move v7, v8

    .line 287
    move-object v8, v9

    .line 288
    goto :goto_4

    .line 289
    :cond_b
    invoke-virtual {v0, v4}, Lxhss/ᛴᛲᛴᛶ;->ᲈᛲᛵᲁ(Lxhss/ᲇᲁᲀᲇ;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :cond_c
    move-object v9, v8

    .line 294
    const/16 v16, -0x1

    .line 295
    .line 296
    const-wide/16 v17, 0x4

    .line 297
    .line 298
    invoke-virtual {v3}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 299
    .line 300
    .line 301
    move-result v7

    .line 302
    invoke-virtual {v4}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 303
    .line 304
    .line 305
    move-result v8

    .line 306
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    const/4 v8, 0x0

    .line 311
    move v11, v1

    .line 312
    :goto_8
    if-ge v11, v7, :cond_d

    .line 313
    .line 314
    invoke-virtual {v3, v11}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    invoke-virtual {v4, v11}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    if-ne v12, v13, :cond_d

    .line 323
    .line 324
    add-int/lit8 v8, v8, 0x1

    .line 325
    .line 326
    add-int/lit8 v11, v11, 0x1

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_d
    iget-wide v11, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 330
    .line 331
    div-long v11, v11, v17

    .line 332
    .line 333
    add-long v11, v11, p0

    .line 334
    .line 335
    add-long/2addr v11, v14

    .line 336
    int-to-long v13, v8

    .line 337
    add-long/2addr v11, v13

    .line 338
    const-wide/16 v13, 0x1

    .line 339
    .line 340
    add-long/2addr v11, v13

    .line 341
    neg-int v4, v8

    .line 342
    invoke-virtual {v0, v4}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 346
    .line 347
    .line 348
    add-int v4, v1, v8

    .line 349
    .line 350
    :goto_9
    if-ge v1, v4, :cond_e

    .line 351
    .line 352
    invoke-virtual {v3, v1}, Lxhss/ᛳᛶᲈᲈ;->ᲇᛴᲇᛵ(I)B

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    and-int/lit16 v2, v2, 0xff

    .line 357
    .line 358
    invoke-virtual {v0, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 359
    .line 360
    .line 361
    add-int/lit8 v1, v1, 0x1

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_e
    add-int/lit8 v1, v6, 0x1

    .line 365
    .line 366
    if-ne v1, v10, :cond_10

    .line 367
    .line 368
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, Lxhss/ᛳᛶᲈᲈ;

    .line 373
    .line 374
    invoke-virtual {v1}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-ne v4, v1, :cond_f

    .line 379
    .line 380
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Ljava/lang/Number;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    invoke-virtual {v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_f
    const-string v0, "Check failed."

    .line 395
    .line 396
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :cond_10
    new-instance v3, Lxhss/ᛴᛲᛴᛶ;

    .line 401
    .line 402
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 403
    .line 404
    .line 405
    iget-wide v1, v3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 406
    .line 407
    div-long v1, v1, v17

    .line 408
    .line 409
    add-long/2addr v1, v11

    .line 410
    long-to-int v1, v1

    .line 411
    mul-int/lit8 v1, v1, -0x1

    .line 412
    .line 413
    invoke-virtual {v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛲᛴᲀᲈ(I)V

    .line 414
    .line 415
    .line 416
    move-object v8, v9

    .line 417
    move v7, v10

    .line 418
    move-wide v1, v11

    .line 419
    invoke-static/range {v1 .. v8}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v3}, Lxhss/ᛴᛲᛴᛶ;->ᲈᛲᛵᲁ(Lxhss/ᲇᲁᲀᲇ;)V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :cond_11
    invoke-static {v3}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method public static ᛷᲁᲁ(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_7

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eq p0, v1, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq p0, v2, :cond_5

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/16 v0, 0x40

    .line 23
    .line 24
    if-eq p0, v0, :cond_3

    .line 25
    .line 26
    const/16 v0, 0x80

    .line 27
    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x100

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x200

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x9

    .line 39
    .line 40
    return p0

    .line 41
    :cond_0
    const-string v0, "type needs to be >= FIRST and <= LAST, type="

    .line 42
    .line 43
    invoke-static {v0, p0}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_1
    return v1

    .line 53
    :cond_2
    const/4 p0, 0x7

    .line 54
    return p0

    .line 55
    :cond_3
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_4
    const/4 p0, 0x5

    .line 58
    return p0

    .line 59
    :cond_5
    return v0

    .line 60
    :cond_6
    const/4 p0, 0x3

    .line 61
    return p0

    .line 62
    :cond_7
    return v1

    .line 63
    :cond_8
    return v0

    .line 64
    :cond_9
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static ᛸᛲᛷᛱ(IIILjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p2, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    :cond_1
    and-int/lit8 p2, p2, 0x4

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 v1, 0x1

    .line 21
    :goto_0
    move p2, p0

    .line 22
    :goto_1
    if-ge p2, p1, :cond_8

    .line 23
    .line 24
    invoke-virtual {p3, p2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/16 v2, 0x2b

    .line 29
    .line 30
    const/16 v3, 0x25

    .line 31
    .line 32
    if-eq v0, v3, :cond_4

    .line 33
    .line 34
    if-ne v0, v2, :cond_3

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    :goto_2
    new-instance v0, Lxhss/ᛴᛲᛴᛶ;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p3, p0, p2}, Lxhss/ᛴᛲᛴᛶ;->ᲁᲁᛴᲁ(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    :goto_3
    if-ge p2, p1, :cond_7

    .line 51
    .line 52
    invoke-virtual {p3, p2}, Ljava/lang/String;->codePointAt(I)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ne p0, v3, :cond_5

    .line 57
    .line 58
    add-int/lit8 v4, p2, 0x2

    .line 59
    .line 60
    if-ge v4, p1, :cond_5

    .line 61
    .line 62
    add-int/lit8 v5, p2, 0x1

    .line 63
    .line 64
    invoke-virtual {p3, v5}, Ljava/lang/String;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v5}, Lxhss/ᛶᛸᛲ;->ᛸᛷᲈᲈ(C)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    invoke-static {v6}, Lxhss/ᛶᛸᛲ;->ᛸᛷᲈᲈ(C)I

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    const/4 v7, -0x1

    .line 81
    if-eq v5, v7, :cond_6

    .line 82
    .line 83
    if-eq v6, v7, :cond_6

    .line 84
    .line 85
    shl-int/lit8 p2, v5, 0x4

    .line 86
    .line 87
    add-int/2addr p2, v6

    .line 88
    invoke-virtual {v0, p2}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    add-int p2, p0, v4

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    if-ne p0, v2, :cond_6

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    const/16 p0, 0x20

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Lxhss/ᛴᛲᛴᛶ;->ᲁᛴᲇᛲ(I)V

    .line 105
    .line 106
    .line 107
    add-int/lit8 p2, p2, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    invoke-virtual {v0, p0}, Lxhss/ᛴᛲᛴᛶ;->ᛳᛸᛵᲀ(I)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0}, Ljava/lang/Character;->charCount(I)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    add-int/2addr p2, p0

    .line 118
    goto :goto_3

    .line 119
    :cond_7
    invoke-virtual {v0}, Lxhss/ᛴᛲᛴᛶ;->ᛶᲇᲈᛸ()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_8
    invoke-virtual {p3, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method

.method public static ᛸᛲᲀᛵ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_3

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    if-ne v2, p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aget-object p0, p0, v1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {p2, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    aget-object p1, p1, v1

    .line 40
    .line 41
    aget-object p0, p0, v1

    .line 42
    .line 43
    invoke-static {p1, p0, p2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    :goto_1
    const-class p0, Ljava/lang/Object;

    .line 58
    .line 59
    if-eq p1, p0, :cond_6

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-ne p0, p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1, p0, p2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_5
    move-object p1, p0

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    return-object p2
.end method

.method public static ᛸᛴᛶᛳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-static {}, Lxhss/ᛱᲈᲁᛴ;->ᛳᲁᲇᛸ()Lxhss/ᛱᲈᲁᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0, p1}, Lxhss/ᛱᲈᲁᛴ;->ᲇᛴᲇᛵ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static ᛸᛶᛴᲈ(Ljava/lang/String;I)J
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, v0}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ(Ljava/lang/String;IIZ)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    sget-object v2, Lxhss/ᛶᲁᛸᲇ;->ᲇᛸᛳᲁ:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, -0x1

    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    move v8, v7

    .line 18
    move v9, v8

    .line 19
    :goto_0
    const/4 v10, 0x2

    .line 20
    const/4 v11, 0x1

    .line 21
    if-ge v1, p1, :cond_4

    .line 22
    .line 23
    add-int/lit8 v12, v1, 0x1

    .line 24
    .line 25
    invoke-static {p0, v12, p1, v11}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ(Ljava/lang/String;IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    invoke-virtual {v2, v1, v12}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    if-ne v5, v3, :cond_0

    .line 33
    .line 34
    sget-object v1, Lxhss/ᛶᲁᛸᲇ;->ᲇᛸᛳᲁ:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/4 v1, 0x3

    .line 63
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    if-ne v6, v3, :cond_1

    .line 73
    .line 74
    sget-object v1, Lxhss/ᛶᲁᛸᲇ;->ᛸᛶᲈᛶ:Ljava/util/regex/Pattern;

    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    if-ne v7, v3, :cond_2

    .line 96
    .line 97
    sget-object v1, Lxhss/ᛶᲁᛸᲇ;->ᛷᲁᲁ:Ljava/util/regex/Pattern;

    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-eqz v10, :cond_2

    .line 108
    .line 109
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 114
    .line 115
    invoke-virtual {v7, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const/4 v10, 0x6

    .line 124
    invoke-static {v1, v7, v0, v0, v10}, Lxhss/ᛲᛱᛲᲀ;->ᛶᲀᛵᲇ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    div-int/lit8 v7, v1, 0x4

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_2
    if-ne v4, v3, :cond_3

    .line 132
    .line 133
    sget-object v1, Lxhss/ᛶᲁᛸᲇ;->ᲈᛳᲀ:Ljava/util/regex/Pattern;

    .line 134
    .line 135
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    :cond_3
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 154
    .line 155
    invoke-static {p0, v12, p1, v0}, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ(Ljava/lang/String;IIZ)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_4
    const/16 p0, 0x46

    .line 162
    .line 163
    if-gt p0, v4, :cond_5

    .line 164
    .line 165
    const/16 p1, 0x64

    .line 166
    .line 167
    if-ge v4, p1, :cond_5

    .line 168
    .line 169
    add-int/lit16 v4, v4, 0x76c

    .line 170
    .line 171
    :cond_5
    if-ltz v4, :cond_6

    .line 172
    .line 173
    if-ge v4, p0, :cond_6

    .line 174
    .line 175
    add-int/lit16 v4, v4, 0x7d0

    .line 176
    .line 177
    :cond_6
    const/16 p0, 0x641

    .line 178
    .line 179
    const-wide/16 v1, 0x0

    .line 180
    .line 181
    const-string p1, "Failed requirement."

    .line 182
    .line 183
    if-lt v4, p0, :cond_c

    .line 184
    .line 185
    if-eq v7, v3, :cond_b

    .line 186
    .line 187
    if-gt v11, v6, :cond_a

    .line 188
    .line 189
    const/16 p0, 0x20

    .line 190
    .line 191
    if-ge v6, p0, :cond_a

    .line 192
    .line 193
    if-ltz v5, :cond_9

    .line 194
    .line 195
    const/16 p0, 0x18

    .line 196
    .line 197
    if-ge v5, p0, :cond_9

    .line 198
    .line 199
    if-ltz v8, :cond_8

    .line 200
    .line 201
    const/16 p0, 0x3c

    .line 202
    .line 203
    if-ge v8, p0, :cond_8

    .line 204
    .line 205
    if-ltz v9, :cond_7

    .line 206
    .line 207
    if-ge v9, p0, :cond_7

    .line 208
    .line 209
    new-instance p0, Ljava/util/GregorianCalendar;

    .line 210
    .line 211
    sget-object p1, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 212
    .line 213
    invoke-direct {p0, p1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setLenient(Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v11, v4}, Ljava/util/Calendar;->set(II)V

    .line 220
    .line 221
    .line 222
    sub-int/2addr v7, v11

    .line 223
    invoke-virtual {p0, v10, v7}, Ljava/util/Calendar;->set(II)V

    .line 224
    .line 225
    .line 226
    const/4 p1, 0x5

    .line 227
    invoke-virtual {p0, p1, v6}, Ljava/util/Calendar;->set(II)V

    .line 228
    .line 229
    .line 230
    const/16 p1, 0xb

    .line 231
    .line 232
    invoke-virtual {p0, p1, v5}, Ljava/util/Calendar;->set(II)V

    .line 233
    .line 234
    .line 235
    const/16 p1, 0xc

    .line 236
    .line 237
    invoke-virtual {p0, p1, v8}, Ljava/util/Calendar;->set(II)V

    .line 238
    .line 239
    .line 240
    const/16 p1, 0xd

    .line 241
    .line 242
    invoke-virtual {p0, p1, v9}, Ljava/util/Calendar;->set(II)V

    .line 243
    .line 244
    .line 245
    const/16 p1, 0xe

    .line 246
    .line 247
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 251
    .line 252
    .line 253
    move-result-wide p0

    .line 254
    return-wide p0

    .line 255
    :cond_7
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-wide v1

    .line 259
    :cond_8
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-wide v1

    .line 263
    :cond_9
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-wide v1

    .line 267
    :cond_a
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-wide v1

    .line 271
    :cond_b
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    return-wide v1

    .line 275
    :cond_c
    invoke-static {p1}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-wide v1
.end method

.method public static ᛸᛶᲈᛶ(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "Connection"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "Keep-Alive"

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "Proxy-Authenticate"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "Proxy-Authorization"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const-string v0, "TE"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    const-string v0, "Trailers"

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    const-string v0, "Transfer-Encoding"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-string v0, "Upgrade"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_0

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public static ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/Class;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const-class p0, Ljava/lang/Object;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    aget-object p0, p0, v1

    .line 63
    .line 64
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛷᲈᲈ(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_4
    if-nez p0, :cond_5

    .line 70
    .line 71
    const-string v0, "null"

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v3, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    .line 87
    .line 88
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p0, "> is of type "

    .line 95
    .line 96
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1
.end method

.method public static ᲀᛷᲁᲀ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛵᛴᲀᛸ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛵᛴᲀᛸ;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    iput p0, v0, Lxhss/ᛵᛴᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 10
    .line 11
    invoke-static {v0}, Lxhss/ᲀᲈᛵᛸ;->ᲁᛴᲇᛲ(Lxhss/ᛵᛴᲀᛸ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static ᲀᲇᛳᲁ(Ljava/lang/String;)Lxhss/ᛶᲈᛴ;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x4b88569

    .line 6
    .line 7
    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const v1, 0x4c38896

    .line 11
    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    const-string v0, "TLSv1.3"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    sget-object p0, Lxhss/ᛶᲈᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛶᲈᛴ;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    const-string v0, "TLSv1.2"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object p0, Lxhss/ᛶᲈᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛶᲈᛴ;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    const-string v0, "TLSv1.1"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    sget-object p0, Lxhss/ᛶᲈᛴ;->ᛷᛴᛷᛱ:Lxhss/ᛶᲈᛴ;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    const-string v0, "TLSv1"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    sget-object p0, Lxhss/ᛶᲈᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛶᲈᛴ;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    const-string v0, "SSLv3"

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    sget-object p0, Lxhss/ᛶᲈᛴ;->ᲀᲇᛳᲁ:Lxhss/ᛶᲈᛴ;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_2
    :goto_0
    const-string v0, "Unexpected TLS version: "

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch -0x1dfc3f27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ᲁᛲᛴᛴ(Ljava/lang/Class;)Lxhss/ᲇᛵᛲᲁ;
    .locals 4

    .line 1
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 2
    .line 3
    new-instance v1, Lxhss/ᛸᛵᲇᲈ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v1, v2, p0, v3}, Lxhss/ᛸᛵᲇᲈ;-><init>(ILjava/lang/Class;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0xc

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static ᲁᛴᲇᛲ(Lxhss/ᛵᛴᲀᛸ;)V
    .locals 10

    .line 1
    sget-object v0, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ:Landroid/app/Application;

    .line 2
    .line 3
    const-string v1, "Toaster has not been initialized"

    .line 4
    .line 5
    if-eqz v0, :cond_10

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 8
    .line 9
    if-eqz v0, :cond_f

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    sget-object v0, Lxhss/ᲀᲈᛵᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 24
    .line 25
    iput-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    sget-object v0, Lxhss/ᲀᲈᛵᛸ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lxhss/ᛳᛴᲀᲁ;

    .line 37
    .line 38
    invoke-direct {v0, v2}, Lxhss/ᛳᛴᲀᲁ;-><init>(I)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lxhss/ᲀᲈᛵᛸ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛴᲀᲁ;

    .line 42
    .line 43
    :cond_2
    iput-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 44
    .line 45
    :cond_3
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

    .line 46
    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    sget-object v0, Lxhss/ᲀᲈᛵᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛴᲀᲁ;

    .line 50
    .line 51
    iput-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛳᛴᲀᲁ;

    .line 52
    .line 53
    :cond_4
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 54
    .line 55
    sget-object v3, Lxhss/ᲀᲈᛵᛸ;->ᲀᲇᛳᲁ:Ljava/lang/Boolean;

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    if-nez v3, :cond_7

    .line 59
    .line 60
    sget-object v3, Lxhss/ᲀᲈᛵᛸ;->ᛳᲁᲇᛸ:Landroid/app/Application;

    .line 61
    .line 62
    if-eqz v3, :cond_6

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 69
    .line 70
    and-int/lit8 v1, v1, 0x2

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    move v1, v4

    .line 75
    goto :goto_0

    .line 76
    :cond_5
    move v1, v2

    .line 77
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    sput-object v3, Lxhss/ᲀᲈᛵᛸ;->ᲀᲇᛳᲁ:Ljava/lang/Boolean;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_7
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_8

    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :cond_8
    new-instance v1, Ljava/lang/Throwable;

    .line 97
    .line 98
    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    array-length v3, v1

    .line 106
    move v5, v2

    .line 107
    :goto_2
    if-ge v5, v3, :cond_c

    .line 108
    .line 109
    aget-object v6, v1, v5

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-gtz v7, :cond_9

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_9
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    :try_start_0
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const-class v9, Lxhss/ᛳᛴᲀᲁ;

    .line 127
    .line 128
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-nez v9, :cond_b

    .line 133
    .line 134
    const-class v9, Lxhss/ᲀᲈᛵᛸ;

    .line 135
    .line 136
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-nez v9, :cond_b

    .line 141
    .line 142
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-nez v9, :cond_b

    .line 147
    .line 148
    invoke-virtual {v8}, Ljava/lang/Class;->getModifiers()I

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_a

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_a
    new-instance v8, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string v9, "("

    .line 165
    .line 166
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v6, ":"

    .line 177
    .line 178
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v6, ") "

    .line 185
    .line 186
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    const-string v7, "Toaster"

    .line 201
    .line 202
    invoke-static {v7, v6}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :catch_0
    move-exception v6

    .line 207
    invoke-virtual {v6}, Ljava/lang/Throwable;->printStackTrace()V

    .line 208
    .line 209
    .line 210
    :cond_b
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_c
    :goto_4
    iget v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 214
    .line 215
    const/4 v1, -0x1

    .line 216
    if-ne v0, v1, :cond_e

    .line 217
    .line 218
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 219
    .line 220
    iget-object v1, p0, Lxhss/ᛵᛴᲀᛸ;->ᛷᛵᛵᲈ:Ljava/lang/CharSequence;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    const/16 v1, 0x14

    .line 230
    .line 231
    if-le v0, v1, :cond_d

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_d
    move v4, v2

    .line 235
    :goto_5
    iput v4, p0, Lxhss/ᛵᛴᲀᛸ;->ᛱᛱᛲᲇ:I

    .line 236
    .line 237
    :cond_e
    iget-object v0, p0, Lxhss/ᛵᛴᲀᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲀᛸᛵ;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    sget-object v1, Lxhss/ᲀᛸᛵ;->ᛳᲁᲇᛸ:Landroid/os/Handler;

    .line 243
    .line 244
    new-instance v3, Lxhss/ᛱᛴᛲᛵ;

    .line 245
    .line 246
    invoke-direct {v3, v0, p0, v2}, Lxhss/ᛱᛴᛲᛵ;-><init>(Lxhss/ᲀᛸᛵ;Lxhss/ᛵᛴᲀᛸ;I)V

    .line 247
    .line 248
    .line 249
    const-wide/16 v4, 0x64

    .line 250
    .line 251
    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 252
    .line 253
    .line 254
    :cond_f
    :goto_6
    return-void

    .line 255
    :cond_10
    invoke-static {v1}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-void
.end method

.method public static ᲇᛴᲇᛵ(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "Primitive type is not allowed"

    .line 15
    .line 16
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public static ᲇᛶᛴᲀ(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    return v0

    .line 71
    :cond_3
    return v2

    .line 72
    :cond_4
    instance-of v1, p0, Ljava/lang/reflect/GenericArrayType;

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    return v2

    .line 81
    :cond_5
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p0, p1}, Lxhss/ᲀᲈᛵᛸ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_6
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    .line 99
    .line 100
    if-eqz v1, :cond_9

    .line 101
    .line 102
    instance-of v1, p1, Ljava/lang/reflect/WildcardType;

    .line 103
    .line 104
    if-nez v1, :cond_7

    .line 105
    .line 106
    return v2

    .line 107
    :cond_7
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 108
    .line 109
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_8

    .line 138
    .line 139
    return v0

    .line 140
    :cond_8
    return v2

    .line 141
    :cond_9
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    .line 142
    .line 143
    if-eqz v1, :cond_b

    .line 144
    .line 145
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 146
    .line 147
    if-nez v1, :cond_a

    .line 148
    .line 149
    return v2

    .line 150
    :cond_a
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 151
    .line 152
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_b

    .line 167
    .line 168
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_b

    .line 181
    .line 182
    return v0

    .line 183
    :cond_b
    return v2
.end method

.method public static final ᲇᛸᛳᲁ(Ljava/lang/String;II)Z
    .locals 2

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    if-ge v0, p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/16 v1, 0x25

    .line 10
    .line 11
    if-ne p2, v1, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    add-int/2addr p1, p2

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Lxhss/ᛶᛸᛲ;->ᛸᛷᲈᲈ(C)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq p1, v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Lxhss/ᛶᛸᛲ;->ᛸᛷᲈᲈ(C)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_0

    .line 35
    .line 36
    return p2

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;
    .locals 5

    .line 1
    instance-of v0, p0, Lxhss/ᛱᛸᛷᛸ;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 9
    .line 10
    move-object v3, p0

    .line 11
    check-cast v3, Lxhss/ᛱᛸᛷᛸ;

    .line 12
    .line 13
    check-cast v3, Lxhss/ᛲᛵᲀᲈ;

    .line 14
    .line 15
    invoke-interface {v3}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Lxhss/ᛸᛵᲇᲈ;

    .line 20
    .line 21
    invoke-direct {v4, v2, v3, p0}, Lxhss/ᛸᛵᲇᲈ;-><init>(ILjava/lang/Class;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v4}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    instance-of v0, p0, Ljava/lang/Class;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 33
    .line 34
    move-object v3, p0

    .line 35
    check-cast v3, Ljava/lang/Class;

    .line 36
    .line 37
    new-instance v4, Lxhss/ᛸᛵᲇᲈ;

    .line 38
    .line 39
    invoke-direct {v4, v2, v3, p0}, Lxhss/ᛸᛵᲇᲈ;-><init>(ILjava/lang/Class;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v4}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    new-instance v4, Lxhss/ᛸᛵᲇᲈ;

    .line 53
    .line 54
    invoke-direct {v4, v2, v3, p0}, Lxhss/ᛸᛵᲇᲈ;-><init>(ILjava/lang/Class;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1, v4}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public static ᲈᛳᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object p0, p0, v0

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {p0, p1, p2}, Lxhss/ᲀᲈᛵᛸ;->ᛸᛲᲀᛵ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1, p2, v0}, Lxhss/ᲀᲈᛵᛸ;->ᛳᛶᛷᲀ(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, " is not the same as or a subtype of "

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method
