.class public final Lkd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lkd1;

.field public static volatile β:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lkd1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkd1;->α:Lkd1;

    .line 7
    .line 8
    return-void
.end method

.method public static β(Ljava/lang/String;)Ljava/util/List;
    .locals 27

    .line 1
    invoke-static/range {p0 .. p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Ljz;->ε:Ljz;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 11
    .line 12
    move-object/from16 v1, p0

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v2, v1}, Lj81;->Σ(II)Lxm0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_1
    :goto_0
    move-object v4, v1

    .line 36
    check-cast v4, Lwm0;

    .line 37
    .line 38
    iget-boolean v5, v4, Lwm0;->η:Z

    .line 39
    .line 40
    if-eqz v5, :cond_5

    .line 41
    .line 42
    invoke-virtual {v4}, Lwm0;->nextInt()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v5, 0x0

    .line 51
    if-nez v4, :cond_2

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_2
    const-string v6, "seed_id"

    .line 56
    .line 57
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v6}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-lez v7, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move-object v6, v5

    .line 75
    :goto_1
    if-eqz v6, :cond_4

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    new-instance v7, Lid1;

    .line 82
    .line 83
    const-string v5, "name"

    .line 84
    .line 85
    invoke-static {v5, v4}, Lkd1;->κ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    const-string v5, "icon_url"

    .line 90
    .line 91
    invoke-static {v5, v4}, Lkd1;->κ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v10

    .line 95
    const-string v5, "growth_time"

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    const-string v5, "price"

    .line 106
    .line 107
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v12

    .line 115
    const-string v5, "income"

    .line 116
    .line 117
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    const-string v5, "experience"

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    const-string v5, "unlock_level"

    .line 136
    .line 137
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    const-string v5, "product_item_id"

    .line 146
    .line 147
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v16

    .line 155
    const-string v5, "product_item_count"

    .line 156
    .line 157
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v17

    .line 165
    const-string v5, "limit_count"

    .line 166
    .line 167
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v18

    .line 175
    const-string v5, "item_tag"

    .line 176
    .line 177
    invoke-static {v5, v4}, Lkd1;->κ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v19

    .line 181
    const-string v5, "weight"

    .line 182
    .line 183
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v20

    .line 191
    const-string v5, "watering_time"

    .line 192
    .line 193
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v21

    .line 201
    const-string v5, "watering_cd"

    .line 202
    .line 203
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v22

    .line 211
    const-string v5, "active_from_epoch"

    .line 212
    .line 213
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v5}, Lkd1;->π(Ljava/lang/Object;)Ljava/lang/Long;

    .line 218
    .line 219
    .line 220
    move-result-object v23

    .line 221
    const-string v5, "active_until_epoch"

    .line 222
    .line 223
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-static {v5}, Lkd1;->π(Ljava/lang/Object;)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object v24

    .line 231
    const-string v5, "limit_dimension"

    .line 232
    .line 233
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-static {v5}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object v25

    .line 241
    const-string v5, "in_shop"

    .line 242
    .line 243
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v26

    .line 247
    invoke-direct/range {v7 .. v26}, Lid1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V

    .line 248
    .line 249
    .line 250
    move-object v5, v7

    .line 251
    :cond_4
    :goto_2
    if-eqz v5, :cond_1

    .line 252
    .line 253
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :cond_5
    invoke-static {v3}, Lkd1;->ξ(Ljava/util/Collection;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0
.end method

.method public static δ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/16 v0, 0x3f

    .line 2
    .line 3
    invoke-static {p0, v0, p0}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [C

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/16 v2, 0x2f

    .line 12
    .line 13
    aput-char v2, v0, v1

    .line 14
    .line 15
    invoke-static {p0, v0}, Lq02;->Д(Ljava/lang/String;[C)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v0, "/config/v2/load"

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static ζ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public static η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lkd1;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lss1;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, Lkd1;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v1, v2

    .line 60
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_3
    return-object v2
.end method

.method public static θ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :cond_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    return-object p1
.end method

.method public static κ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    move-object p0, p1

    .line 13
    :cond_0
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    return-object p1
.end method

.method public static λ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x0

    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    const/16 v0, 0x7b

    .line 19
    .line 20
    invoke-static {p0, v0}, Lq02;->у(Ljava/lang/String;C)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x7d

    .line 27
    .line 28
    invoke-static {p0, v0}, Lq02;->Ψ(Ljava/lang/String;C)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    new-instance v0, Leo1;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    instance-of p0, v0, Leo1;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    move-object v2, v0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v0, 0x5b

    .line 54
    .line 55
    invoke-static {p0, v0}, Lq02;->у(Ljava/lang/String;C)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    const/16 v0, 0x5d

    .line 62
    .line 63
    invoke-static {p0, v0}, Lq02;->Ψ(Ljava/lang/String;C)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    :try_start_1
    new-instance v0, Lorg/json/JSONArray;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_1
    move-exception p0

    .line 76
    new-instance v0, Leo1;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_1
    instance-of p0, v0, Leo1;

    .line 82
    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    :cond_3
    :goto_2
    return-object v2
.end method

.method public static μ(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lkd1;->ξ(Ljava/util/Collection;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lid1;

    .line 32
    .line 33
    new-instance v2, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "seed_id"

    .line 39
    .line 40
    iget v4, v1, Lid1;->α:I

    .line 41
    .line 42
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string v3, "name"

    .line 46
    .line 47
    iget-object v4, v1, Lid1;->β:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-string v3, "icon_url"

    .line 53
    .line 54
    iget-object v4, v1, Lid1;->γ:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const-string v3, "growth_time"

    .line 60
    .line 61
    iget-object v4, v1, Lid1;->δ:Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string v3, "price"

    .line 67
    .line 68
    iget-object v4, v1, Lid1;->ε:Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const-string v3, "income"

    .line 74
    .line 75
    iget-object v4, v1, Lid1;->ζ:Ljava/lang/Integer;

    .line 76
    .line 77
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-string v3, "experience"

    .line 81
    .line 82
    iget-object v4, v1, Lid1;->η:Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-string v3, "unlock_level"

    .line 88
    .line 89
    iget-object v4, v1, Lid1;->θ:Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const-string v3, "product_item_id"

    .line 95
    .line 96
    iget-object v4, v1, Lid1;->ι:Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const-string v3, "product_item_count"

    .line 102
    .line 103
    iget-object v4, v1, Lid1;->κ:Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    const-string v3, "limit_count"

    .line 109
    .line 110
    iget-object v4, v1, Lid1;->λ:Ljava/lang/Integer;

    .line 111
    .line 112
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    const-string v3, "item_tag"

    .line 116
    .line 117
    iget-object v4, v1, Lid1;->μ:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const-string v3, "weight"

    .line 123
    .line 124
    iget-object v4, v1, Lid1;->ν:Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const-string v3, "watering_time"

    .line 130
    .line 131
    iget-object v4, v1, Lid1;->ξ:Ljava/lang/Integer;

    .line 132
    .line 133
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const-string v3, "watering_cd"

    .line 137
    .line 138
    iget-object v4, v1, Lid1;->ο:Ljava/lang/Integer;

    .line 139
    .line 140
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    const-string v3, "active_from_epoch"

    .line 144
    .line 145
    iget-object v4, v1, Lid1;->π:Ljava/lang/Long;

    .line 146
    .line 147
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const-string v3, "active_until_epoch"

    .line 151
    .line 152
    iget-object v4, v1, Lid1;->ρ:Ljava/lang/Long;

    .line 153
    .line 154
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const-string v3, "limit_dimension"

    .line 158
    .line 159
    iget-object v4, v1, Lid1;->σ:Ljava/lang/Integer;

    .line 160
    .line 161
    invoke-static {v2, v3, v4}, Lkd1;->ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    const-string v3, "in_shop"

    .line 165
    .line 166
    iget-boolean v1, v1, Lid1;->τ:Z

    .line 167
    .line 168
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    const-string v0, "pet_elf_camp_seed_catalog_cache"

    .line 184
    .line 185
    invoke-static {v0, p0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public static ν(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static ξ(Ljava/util/Collection;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lid1;

    .line 24
    .line 25
    iget v2, v2, Lid1;->α:I

    .line 26
    .line 27
    if-lez v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance p0, Lib1;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {p0, v1}, Lib1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lye;

    .line 40
    .line 41
    const/16 v2, 0x1d

    .line 42
    .line 43
    invoke-direct {v1, v2, p0}, Lye;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Ljd1;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {p0, v2, v1}, Ljd1;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, p0}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public static ο(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static π(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized α(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v6, Lij0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {v6, v0}, Lij0;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lhd1;->ε:Lhd1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lkd1;->ρ(Ljava/lang/Object;Lhd1;ILjava/util/LinkedHashMap;Lij0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Lkd1;->ε()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    monitor-exit v1

    .line 35
    return-object p0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    :goto_0
    move-object p0, v0

    .line 38
    goto/16 :goto_9

    .line 39
    .line 40
    :cond_0
    :try_start_2
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lkd1;->ε()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lid1;

    .line 64
    .line 65
    iget v2, v0, Lid1;->α:I

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast p1, Ljava/lang/Iterable;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Lid1;

    .line 99
    .line 100
    iget v2, v0, Lid1;->α:I

    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget v3, v0, Lid1;->α:I

    .line 107
    .line 108
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {p0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lid1;

    .line 117
    .line 118
    if-eqz v3, :cond_2

    .line 119
    .line 120
    invoke-virtual {v3, v0}, Lid1;->γ(Lid1;)Lid1;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_2
    invoke-interface {p0, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, Lkd1;->ξ(Ljava/util/Collection;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    sput-object p0, Lkd1;->β:Ljava/util/List;

    .line 140
    .line 141
    invoke-static {p0}, Lkd1;->μ(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    const-string p1, "rdf9a626134090cfa"

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/4 v3, 0x0

    .line 155
    const/4 v4, 0x0

    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    move v5, v4

    .line 159
    goto :goto_4

    .line 160
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    move v5, v4

    .line 165
    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-eqz v7, :cond_7

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    check-cast v7, Lid1;

    .line 176
    .line 177
    iget-boolean v7, v7, Lid1;->τ:Z

    .line 178
    .line 179
    if-eqz v7, :cond_5

    .line 180
    .line 181
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    if-ltz v5, :cond_6

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_6
    invoke-static {}, Lyh;->ф()V

    .line 187
    .line 188
    .line 189
    throw v3

    .line 190
    :cond_7
    :goto_4
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_8

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    :cond_9
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    if-eqz v7, :cond_c

    .line 206
    .line 207
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    check-cast v7, Lid1;

    .line 212
    .line 213
    iget-object v7, v7, Lid1;->γ:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v7, :cond_9

    .line 216
    .line 217
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    if-eqz v7, :cond_a

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 225
    .line 226
    if-ltz v4, :cond_b

    .line 227
    .line 228
    goto :goto_5

    .line 229
    :cond_b
    invoke-static {}, Lyh;->ф()V

    .line 230
    .line 231
    .line 232
    throw v3

    .line 233
    :cond_c
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    const-string v7, "\u5df2\u66f4\u65b0\u5bbf\u4e3b\u4f5c\u7269\u76ee\u5f55 count="

    .line 239
    .line 240
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v0, " shop="

    .line 247
    .line 248
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v0, " icon="

    .line 255
    .line 256
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    const/4 v2, 0x4

    .line 267
    invoke-static {p1, v0, v3, v2, v3}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-eqz p1, :cond_d

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    :cond_e
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_f

    .line 286
    .line 287
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, Lid1;

    .line 292
    .line 293
    iget-object v0, v0, Lid1;->γ:Ljava/lang/String;

    .line 294
    .line 295
    if-eqz v0, :cond_e

    .line 296
    .line 297
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_10

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_f
    :goto_8
    iget-object p1, v6, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 305
    .line 306
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-nez p1, :cond_10

    .line 311
    .line 312
    const-string p1, "rdf9a626134090cfa"

    .line 313
    .line 314
    iget-object v7, v6, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 315
    .line 316
    const-string v8, ";"

    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    const/16 v13, 0x3e

    .line 320
    .line 321
    const/4 v9, 0x0

    .line 322
    const/4 v10, 0x0

    .line 323
    const/4 v11, 0x0

    .line 324
    invoke-static/range {v7 .. v13}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    new-instance v4, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 331
    .line 332
    .line 333
    const-string v5, "\u5bbf\u4e3b\u79cd\u5b50\u914d\u7f6e\u672a\u8bc6\u522b\u5230\u56fe\u6807 URL missingIconShapes="

    .line 334
    .line 335
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-static {p1, v0, v3, v2, v3}, Lux;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 346
    .line 347
    .line 348
    :cond_10
    monitor-exit v1

    .line 349
    return-object p0

    .line 350
    :catchall_1
    move-exception v0

    .line 351
    move-object v1, p0

    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :goto_9
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 355
    throw p0
.end method

.method public final γ(ILjava/lang/Object;)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_6

    .line 3
    .line 4
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p2, v1, :cond_6

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-le p1, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    instance-of v1, p2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    check-cast p2, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p2, "https://"

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-static {p0, p2, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    const-string p2, "http://"

    .line 38
    .line 39
    invoke-static {p0, p2, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-nez p2, :cond_2

    .line 44
    .line 45
    const-string p2, "//"

    .line 46
    .line 47
    invoke-static {p0, p2, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object p2, v0

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    move-object p2, p0

    .line 57
    :goto_1
    if-nez p2, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, Lkd1;->λ(Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_6

    .line 64
    .line 65
    sget-object p2, Lkd1;->α:Lkd1;

    .line 66
    .line 67
    add-int/2addr p1, v1

    .line 68
    invoke-virtual {p2, p1, p0}, Lkd1;->γ(ILjava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :cond_3
    return-object p2

    .line 74
    :cond_4
    instance-of v1, p2, Lorg/json/JSONObject;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    const-string v0, "urlList"

    .line 79
    .line 80
    const-string v1, "src"

    .line 81
    .line 82
    const-string v2, "url"

    .line 83
    .line 84
    const-string v3, "uri"

    .line 85
    .line 86
    const-string v4, "url_list"

    .line 87
    .line 88
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Lf7;

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v0, p2

    .line 103
    check-cast v0, Lorg/json/JSONObject;

    .line 104
    .line 105
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v1, v0}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Lny0;

    .line 121
    .line 122
    const/4 v7, 0x0

    .line 123
    const/16 v8, 0xd

    .line 124
    .line 125
    const-class v4, Lkd1;

    .line 126
    .line 127
    const-string v5, "normalizeKey"

    .line 128
    .line 129
    const-string v6, "normalizeKey(Ljava/lang/String;)Ljava/lang/String;"

    .line 130
    .line 131
    move-object v3, p0

    .line 132
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 133
    .line 134
    .line 135
    new-instance p0, Lcu;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    invoke-direct {p0, v0, v2, v1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    new-instance v0, Lya1;

    .line 142
    .line 143
    const/16 v1, 0x10

    .line 144
    .line 145
    invoke-direct {v0, p1, v1, p2}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Ljava/lang/String;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_5
    instance-of p0, p2, Lorg/json/JSONArray;

    .line 160
    .line 161
    if-eqz p0, :cond_6

    .line 162
    .line 163
    move-object p0, p2

    .line 164
    check-cast p0, Lorg/json/JSONArray;

    .line 165
    .line 166
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    invoke-static {v2, p0}, Lj81;->Σ(II)Lxm0;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    new-instance v0, Lya1;

    .line 179
    .line 180
    const/16 v1, 0x11

    .line 181
    .line 182
    invoke-direct {v0, p1, v1, p2}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    check-cast p0, Ljava/lang/String;

    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_6
    :goto_2
    return-object v0
.end method

.method public final declared-synchronized ε()Ljava/util/List;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lkd1;->β:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-object v0

    .line 8
    :cond_0
    :try_start_1
    invoke-static {}, Lui1;->Α()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Ljz;->ε:Ljz;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_2

    .line 20
    :cond_1
    :try_start_2
    const-string v0, "pet_elf_camp_seed_catalog_cache"

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    invoke-static {v0, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    :try_start_3
    invoke-static {v0}, Lkd1;->β(Ljava/lang/String;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    :try_start_4
    new-instance v1, Leo1;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const-string v0, "rdf9a626134090cfa"

    .line 48
    .line 49
    const-string v2, "\u8bfb\u53d6\u4f5c\u7269\u76ee\u5f55\u7f13\u5b58\u5931\u8d25\uff0c\u5df2\u5b89\u5168\u5ffd\u7565"

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Ljz;->ε:Ljz;

    .line 55
    .line 56
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 57
    .line 58
    sput-object v0, Lkd1;->β:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-object v0

    .line 62
    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 63
    throw v0
.end method

.method public final ι(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v7, "SeedPic"

    .line 2
    .line 3
    const-string v8, "ItemPic"

    .line 4
    .line 5
    const-string v0, "SeedIcon"

    .line 6
    .line 7
    const-string v1, "IconUrl"

    .line 8
    .line 9
    const-string v2, "IconURL"

    .line 10
    .line 11
    const-string v3, "Icon"

    .line 12
    .line 13
    const-string v4, "ItemIcon"

    .line 14
    .line 15
    const-string v5, "SeedImage"

    .line 16
    .line 17
    const-string v6, "ItemImage"

    .line 18
    .line 19
    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lf71;

    .line 39
    .line 40
    const/16 v3, 0x13

    .line 41
    .line 42
    invoke-direct {v2, v3}, Lf71;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Ly30;

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    invoke-direct {v3, v1, v4, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Lf7;

    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-direct {v1, v2, v0}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v3}, Lus1;->Δ(Lss1;Lss1;)Lc40;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lny0;

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/16 v8, 0xe

    .line 65
    .line 66
    const-class v4, Lkd1;

    .line 67
    .line 68
    const-string v5, "normalizeKey"

    .line 69
    .line 70
    const-string v6, "normalizeKey(Ljava/lang/String;)Ljava/lang/String;"

    .line 71
    .line 72
    move-object v3, p0

    .line 73
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 74
    .line 75
    .line 76
    new-instance p0, Lcu;

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    invoke-direct {p0, v0, v2, v1}, Lcu;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lgd1;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    invoke-direct {v0, p1, v1}, Lgd1;-><init>(Lorg/json/JSONObject;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Ljava/lang/String;

    .line 97
    .line 98
    return-object p0
.end method

.method public final ρ(Ljava/lang/Object;Lhd1;ILjava/util/LinkedHashMap;Lij0;)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v6, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    if-eqz v1, :cond_f

    .line 12
    .line 13
    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 14
    .line 15
    if-eq v1, v2, :cond_f

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    if-le v6, v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    instance-of v2, v1, Lorg/json/JSONObject;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    if-eqz v2, :cond_d

    .line 27
    .line 28
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    if-eq v2, v7, :cond_3

    .line 36
    .line 37
    const/4 v8, 0x2

    .line 38
    if-ne v2, v8, :cond_2

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, Lorg/json/JSONObject;

    .line 42
    .line 43
    const-string v8, "ItemID"

    .line 44
    .line 45
    invoke-static {v8, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-static {v8}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    if-eqz v8, :cond_5

    .line 54
    .line 55
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    if-lez v9, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    move-object v8, v3

    .line 63
    :goto_0
    if-eqz v8, :cond_5

    .line 64
    .line 65
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    new-instance v9, Lid1;

    .line 70
    .line 71
    const-string v3, "ItemName"

    .line 72
    .line 73
    invoke-static {v3, v2}, Lkd1;->θ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-virtual {v0, v2}, Lkd1;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    const-string v3, "BuyMoneyPrice"

    .line 82
    .line 83
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v14

    .line 91
    const-string v3, "LimitCampLv"

    .line 92
    .line 93
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v17

    .line 101
    const-string v3, "LimitNum"

    .line 102
    .line 103
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v20

    .line 111
    const-string v3, "weight"

    .line 112
    .line 113
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v22

    .line 121
    const-string v3, "TimeActive"

    .line 122
    .line 123
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Lkd1;->π(Ljava/lang/Object;)Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v25

    .line 131
    const-string v3, "TimeEnd"

    .line 132
    .line 133
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-static {v3}, Lkd1;->π(Ljava/lang/Object;)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object v26

    .line 141
    const-string v3, "LimitDimension"

    .line 142
    .line 143
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v27

    .line 151
    const/16 v28, 0x6b68

    .line 152
    .line 153
    const/4 v13, 0x0

    .line 154
    const/4 v15, 0x0

    .line 155
    const/16 v16, 0x0

    .line 156
    .line 157
    const/16 v18, 0x0

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    const/16 v21, 0x0

    .line 162
    .line 163
    const/16 v23, 0x0

    .line 164
    .line 165
    const/16 v24, 0x0

    .line 166
    .line 167
    invoke-direct/range {v9 .. v28}, Lid1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;I)V

    .line 168
    .line 169
    .line 170
    :goto_1
    move-object v3, v9

    .line 171
    goto/16 :goto_3

    .line 172
    .line 173
    :cond_2
    invoke-static {}, Lγ;->κ()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_3
    move-object v2, v1

    .line 178
    check-cast v2, Lorg/json/JSONObject;

    .line 179
    .line 180
    const-string v8, "SeedID"

    .line 181
    .line 182
    invoke-static {v8, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    invoke-static {v8}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    if-eqz v8, :cond_5

    .line 191
    .line 192
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-lez v9, :cond_4

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    move-object v8, v3

    .line 200
    :goto_2
    if-eqz v8, :cond_5

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    new-instance v9, Lid1;

    .line 207
    .line 208
    const-string v3, "SeedName"

    .line 209
    .line 210
    invoke-static {v3, v2}, Lkd1;->θ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-virtual {v0, v2}, Lkd1;->ι(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    const-string v3, "GrowthTime"

    .line 219
    .line 220
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    const-string v3, "ProductMoneyNum"

    .line 229
    .line 230
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 235
    .line 236
    .line 237
    move-result-object v15

    .line 238
    const-string v3, "ProductCampExp"

    .line 239
    .line 240
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    const-string v3, "ProductItemID"

    .line 249
    .line 250
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v18

    .line 258
    const-string v3, "ProductItemNum"

    .line 259
    .line 260
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v19

    .line 268
    const-string v3, "ItemTag"

    .line 269
    .line 270
    invoke-static {v3, v2}, Lkd1;->θ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v21

    .line 274
    const-string v3, "WateringTime"

    .line 275
    .line 276
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v3}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v23

    .line 284
    const-string v3, "WateringCD"

    .line 285
    .line 286
    invoke-static {v3, v2}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-static {v2}, Lkd1;->ο(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v24

    .line 294
    const/16 v27, 0x0

    .line 295
    .line 296
    const v28, 0x79490

    .line 297
    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/16 v17, 0x0

    .line 301
    .line 302
    const/16 v20, 0x0

    .line 303
    .line 304
    const/16 v22, 0x0

    .line 305
    .line 306
    const/16 v25, 0x0

    .line 307
    .line 308
    const/16 v26, 0x0

    .line 309
    .line 310
    invoke-direct/range {v9 .. v28}, Lid1;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;I)V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_1

    .line 314
    .line 315
    :cond_5
    :goto_3
    if-eqz v3, :cond_8

    .line 316
    .line 317
    iget-object v2, v3, Lid1;->γ:Ljava/lang/String;

    .line 318
    .line 319
    if-eqz v2, :cond_6

    .line 320
    .line 321
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-eqz v2, :cond_8

    .line 326
    .line 327
    :cond_6
    move-object v2, v1

    .line 328
    check-cast v2, Lorg/json/JSONObject;

    .line 329
    .line 330
    iget-object v8, v5, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 331
    .line 332
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->size()I

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    const/4 v10, 0x3

    .line 337
    if-lt v9, v10, :cond_7

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_7
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-static {v9}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    new-instance v10, Lf7;

    .line 352
    .line 353
    const/4 v11, 0x4

    .line 354
    invoke-direct {v10, v11, v9}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    const/16 v9, 0x18

    .line 358
    .line 359
    invoke-static {v10, v9}, Lus1;->Ε(Lss1;I)Lss1;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    new-instance v10, Lgd1;

    .line 364
    .line 365
    invoke-direct {v10, v5, v2}, Lgd1;-><init>(Lij0;Lorg/json/JSONObject;)V

    .line 366
    .line 367
    .line 368
    const/16 v2, 0x1e

    .line 369
    .line 370
    const-string v11, ","

    .line 371
    .line 372
    invoke-static {v9, v11, v10, v2}, Lus1;->ψ(Lss1;Ljava/lang/String;Lgd1;I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    new-instance v10, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string v9, "["

    .line 389
    .line 390
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    const-string v2, "]"

    .line 397
    .line 398
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    :cond_8
    :goto_4
    if-eqz v3, :cond_a

    .line 409
    .line 410
    iget v2, v3, Lid1;->α:I

    .line 411
    .line 412
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    check-cast v2, Lid1;

    .line 425
    .line 426
    if-eqz v2, :cond_9

    .line 427
    .line 428
    invoke-virtual {v2, v3}, Lid1;->γ(Lid1;)Lid1;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    :cond_9
    invoke-interface {v4, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    :cond_a
    move-object v8, v1

    .line 436
    check-cast v8, Lorg/json/JSONObject;

    .line 437
    .line 438
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v9

    .line 442
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_f

    .line 447
    .line 448
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    check-cast v1, Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    invoke-static {v1}, Lkd1;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    const-string v3, "campseed"

    .line 462
    .line 463
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    if-eqz v3, :cond_b

    .line 468
    .line 469
    sget-object v2, Lhd1;->ζ:Lhd1;

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_b
    const-string v3, "shopseed"

    .line 473
    .line 474
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v2

    .line 478
    if-eqz v2, :cond_c

    .line 479
    .line 480
    sget-object v2, Lhd1;->η:Lhd1;

    .line 481
    .line 482
    goto :goto_6

    .line 483
    :cond_c
    move-object/from16 v2, p2

    .line 484
    .line 485
    :goto_6
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    add-int/lit8 v3, v6, 0x1

    .line 490
    .line 491
    invoke-virtual/range {v0 .. v5}, Lkd1;->ρ(Ljava/lang/Object;Lhd1;ILjava/util/LinkedHashMap;Lij0;)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v0, p0

    .line 495
    .line 496
    move-object/from16 v4, p4

    .line 497
    .line 498
    move-object/from16 v5, p5

    .line 499
    .line 500
    goto :goto_5

    .line 501
    :cond_d
    instance-of v0, v1, Lorg/json/JSONArray;

    .line 502
    .line 503
    move v2, v0

    .line 504
    sget-object v0, Lkd1;->α:Lkd1;

    .line 505
    .line 506
    if-eqz v2, :cond_e

    .line 507
    .line 508
    move-object v8, v1

    .line 509
    check-cast v8, Lorg/json/JSONArray;

    .line 510
    .line 511
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    const/4 v2, 0x0

    .line 516
    invoke-static {v2, v1}, Lj81;->Σ(II)Lxm0;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    invoke-virtual {v1}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 521
    .line 522
    .line 523
    move-result-object v9

    .line 524
    :goto_7
    move-object v1, v9

    .line 525
    check-cast v1, Lwm0;

    .line 526
    .line 527
    iget-boolean v2, v1, Lwm0;->η:Z

    .line 528
    .line 529
    if-eqz v2, :cond_f

    .line 530
    .line 531
    invoke-virtual {v1}, Lwm0;->nextInt()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    invoke-virtual {v8, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    add-int/lit8 v3, v6, 0x1

    .line 540
    .line 541
    move-object/from16 v2, p2

    .line 542
    .line 543
    move-object/from16 v4, p4

    .line 544
    .line 545
    move-object/from16 v5, p5

    .line 546
    .line 547
    invoke-virtual/range {v0 .. v5}, Lkd1;->ρ(Ljava/lang/Object;Lhd1;ILjava/util/LinkedHashMap;Lij0;)V

    .line 548
    .line 549
    .line 550
    goto :goto_7

    .line 551
    :cond_e
    instance-of v2, v1, Ljava/lang/String;

    .line 552
    .line 553
    if-eqz v2, :cond_f

    .line 554
    .line 555
    check-cast v1, Ljava/lang/String;

    .line 556
    .line 557
    invoke-static {v1}, Lkd1;->λ(Ljava/lang/String;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    if-eqz v1, :cond_f

    .line 562
    .line 563
    add-int/lit8 v3, v6, 0x1

    .line 564
    .line 565
    move-object/from16 v2, p2

    .line 566
    .line 567
    move-object/from16 v4, p4

    .line 568
    .line 569
    move-object/from16 v5, p5

    .line 570
    .line 571
    invoke-virtual/range {v0 .. v5}, Lkd1;->ρ(Ljava/lang/Object;Lhd1;ILjava/util/LinkedHashMap;Lij0;)V

    .line 572
    .line 573
    .line 574
    :cond_f
    :goto_8
    return-void
.end method
