.class public abstract Lv71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lxp1;


# static fields
.field public static volatile α:Z


# direct methods
.method public static final α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance p1, Lix0;

    .line 10
    .line 11
    invoke-direct {p1, p0, p2}, Lix0;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public static final γ(F)I
    .locals 2

    .line 1
    float-to-double v0, p0

    .line 2
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    double-to-float p0, v0

    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static δ(II)V
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p0, 0x12c

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static ε(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v2, "value"

    .line 9
    .line 10
    const-string v3, "type"

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string v1, "boolean"

    .line 15
    .line 16
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    check-cast p0, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    instance-of v1, p0, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v1, "int"

    .line 34
    .line 35
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    check-cast p0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    instance-of v1, p0, Ljava/lang/Long;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    const-string v1, "long"

    .line 53
    .line 54
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    check-cast p0, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    instance-of v1, p0, Ljava/lang/Float;

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    const-string v1, "float"

    .line 72
    .line 73
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    check-cast p0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    float-to-double v3, p0

    .line 83
    invoke-virtual {v0, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    instance-of v1, p0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    const-string v1, "string"

    .line 92
    .line 93
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_4
    instance-of v1, p0, Ljava/util/Set;

    .line 101
    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    const-string v1, "string_set"

    .line 105
    .line 106
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    new-instance v1, Lorg/json/JSONArray;

    .line 110
    .line 111
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 112
    .line 113
    .line 114
    check-cast p0, Ljava/lang/Iterable;

    .line 115
    .line 116
    new-instance v3, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    :cond_5
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    instance-of v5, v4, Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    invoke-static {v3}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_7

    .line 156
    .line 157
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    return-object v0

    .line 171
    :cond_8
    const-string v1, "unsupported"

    .line 172
    .line 173
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    if-eqz p0, :cond_9

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    goto :goto_2

    .line 183
    :cond_9
    const/4 p0, 0x0

    .line 184
    :goto_2
    if-nez p0, :cond_a

    .line 185
    .line 186
    const-string p0, ""

    .line 187
    .line 188
    :cond_a
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 189
    .line 190
    .line 191
    return-object v0
.end method

.method public static ζ(Ljava/lang/ClassLoader;)Lkf1;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lry1;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-static {v1}, Lex0;->Ο(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-static {v1}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Lcf1;

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    invoke-direct {v2, v3}, Lcf1;-><init>(I)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Ly30;

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-direct {v4, v1, v5, v2}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lib1;

    .line 32
    .line 33
    const/16 v2, 0xd

    .line 34
    .line 35
    invoke-direct {v1, v2}, Lib1;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v4}, Lus1;->Η(Lss1;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2, v1}, Lai;->щ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    sget-object v1, Ljz;->ε:Ljz;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 67
    .line 68
    invoke-static {v2}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v2}, Llz1;->φ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    move-object v1, v2

    .line 92
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    const/4 v10, 0x1

    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    new-instance v4, Lkf1;

    .line 100
    .line 101
    const/4 v8, 0x0

    .line 102
    const/4 v9, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    const-string v11, "\u6ca1\u6709\u5df2\u8bc6\u522b\u7684\u5c0f\u706b\u4eba\u5355\u804a\u4f1a\u8bdd"

    .line 107
    .line 108
    invoke-direct/range {v4 .. v11}, Lkf1;-><init>(IIIIIILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v4

    .line 112
    :cond_3
    const-string v2, "pet_elf_auto_feed_default_food_id"

    .line 113
    .line 114
    const-string v4, "204"

    .line 115
    .line 116
    invoke-static {v2, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    const-string v6, "__smart__"

    .line 140
    .line 141
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    const/16 v7, 0xa

    .line 146
    .line 147
    const-string v8, ""

    .line 148
    .line 149
    const/4 v9, 0x0

    .line 150
    if-eqz v5, :cond_4

    .line 151
    .line 152
    move-object v2, v6

    .line 153
    goto :goto_4

    .line 154
    :cond_4
    invoke-static {v2, v7}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-lez v5, :cond_5

    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_5
    move-object v2, v9

    .line 168
    :goto_2
    if-eqz v2, :cond_6

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    move-object v2, v9

    .line 176
    :goto_3
    if-nez v2, :cond_7

    .line 177
    .line 178
    move-object v2, v8

    .line 179
    :cond_7
    :goto_4
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_8

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_8
    move-object v4, v2

    .line 187
    :goto_5
    const-string v2, "pet_elf_auto_feed_max_price"

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 191
    .line 192
    .line 193
    move-result-object v11

    .line 194
    invoke-interface {v11, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 195
    .line 196
    .line 197
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    goto :goto_6

    .line 199
    :catchall_0
    move v2, v5

    .line 200
    :goto_6
    const/16 v11, 0x64

    .line 201
    .line 202
    invoke-static {v2, v5, v11}, Lj81;->μ(III)I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-static {v11, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    if-eqz v6, :cond_9

    .line 219
    .line 220
    const-string v6, "\u667a\u80fd\u9009\u62e9"

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_9
    const-string v6, "foodId="

    .line 224
    .line 225
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    :goto_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    const-string v12, " selection="

    .line 234
    .line 235
    const-string v13, " maxPrice="

    .line 236
    .line 237
    const-string v14, "\u5f00\u59cb\u6309\u8bbe\u7f6e\u6295\u5582 \u4f1a\u8bdd="

    .line 238
    .line 239
    invoke-static {v11, v14, v12, v6, v13}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    const-string v11, "rfac809154b3e7cbf"

    .line 251
    .line 252
    invoke-static {v11, v6, v9, v3, v9}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    move v7, v5

    .line 260
    move v12, v7

    .line 261
    move v13, v12

    .line 262
    move v14, v13

    .line 263
    move v15, v14

    .line 264
    move/from16 v16, v10

    .line 265
    .line 266
    move v10, v15

    .line 267
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    if-eqz v18, :cond_1f

    .line 272
    .line 273
    add-int/lit8 v18, v5, 0x1

    .line 274
    .line 275
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v19

    .line 279
    move-object/from16 v3, v19

    .line 280
    .line 281
    check-cast v3, Lky1;

    .line 282
    .line 283
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 284
    .line 285
    .line 286
    move-result-object v19

    .line 287
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Thread;->isInterrupted()Z

    .line 288
    .line 289
    .line 290
    move-result v19

    .line 291
    if-nez v19, :cond_1f

    .line 292
    .line 293
    sget-object v19, Lry1;->α:Lry1;

    .line 294
    .line 295
    invoke-static {v3}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    move-object/from16 v20, v6

    .line 300
    .line 301
    move/from16 v21, v7

    .line 302
    .line 303
    iget-wide v6, v3, Lky1;->β:J

    .line 304
    .line 305
    invoke-static {v0, v6, v7}, Lp91;->κ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    move-object/from16 v22, v1

    .line 310
    .line 311
    instance-of v1, v3, Leo1;

    .line 312
    .line 313
    move/from16 v23, v1

    .line 314
    .line 315
    const-string v1, " shortId="

    .line 316
    .line 317
    if-eqz v23, :cond_b

    .line 318
    .line 319
    add-int/lit8 v21, v21, 0x1

    .line 320
    .line 321
    move-object/from16 v23, v3

    .line 322
    .line 323
    new-instance v3, Ljava/lang/StringBuilder;

    .line 324
    .line 325
    move-object/from16 v24, v8

    .line 326
    .line 327
    const-string v8, "\u6309\u8bbe\u7f6e\u6295\u5582\u524d\u76ee\u5f55\u8bfb\u53d6\u5931\u8d25 name="

    .line 328
    .line 329
    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-static/range {v23 .. v23}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    if-nez v3, :cond_a

    .line 350
    .line 351
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 352
    .line 353
    const-string v6, "\u98df\u7269\u76ee\u5f55\u8fd4\u56de\u672a\u77e5\u9519\u8bef"

    .line 354
    .line 355
    invoke-direct {v3, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    :cond_a
    invoke-static {v11, v1, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    add-int/lit8 v1, v1, -0x1

    .line 366
    .line 367
    invoke-static {v5, v1}, Lv71;->δ(II)V

    .line 368
    .line 369
    .line 370
    move/from16 v5, v18

    .line 371
    .line 372
    move-object/from16 v6, v20

    .line 373
    .line 374
    move/from16 v7, v21

    .line 375
    .line 376
    move-object/from16 v1, v22

    .line 377
    .line 378
    move-object/from16 v8, v24

    .line 379
    .line 380
    :goto_9
    const/4 v3, 0x4

    .line 381
    const/4 v9, 0x0

    .line 382
    goto :goto_8

    .line 383
    :cond_b
    move-object/from16 v23, v3

    .line 384
    .line 385
    move-object/from16 v24, v8

    .line 386
    .line 387
    invoke-static/range {v23 .. v23}, Li81;->Β(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    move-object/from16 v3, v23

    .line 391
    .line 392
    check-cast v3, Lxe1;

    .line 393
    .line 394
    invoke-virtual {v3}, Lxe1;->α()Z

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    move/from16 v23, v8

    .line 399
    .line 400
    const-string v8, " msg="

    .line 401
    .line 402
    move/from16 v26, v10

    .line 403
    .line 404
    const-string v10, " code="

    .line 405
    .line 406
    move/from16 v27, v12

    .line 407
    .line 408
    const-string v12, "\u6309\u8bbe\u7f6e\u6295\u5582\u8df3\u8fc7 name="

    .line 409
    .line 410
    if-nez v23, :cond_e

    .line 411
    .line 412
    iget v1, v3, Lxe1;->γ:I

    .line 413
    .line 414
    const v6, 0xf2ad8

    .line 415
    .line 416
    .line 417
    if-ne v1, v6, :cond_c

    .line 418
    .line 419
    add-int/lit8 v10, v26, 0x1

    .line 420
    .line 421
    const-string v1, " reason=pet_not_exist"

    .line 422
    .line 423
    invoke-static {v12, v9, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    const/4 v3, 0x4

    .line 428
    const/4 v6, 0x0

    .line 429
    invoke-static {v11, v1, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    move/from16 v7, v21

    .line 433
    .line 434
    goto :goto_a

    .line 435
    :cond_c
    add-int/lit8 v7, v21, 0x1

    .line 436
    .line 437
    iget-object v3, v3, Lxe1;->δ:Ljava/lang/String;

    .line 438
    .line 439
    if-nez v3, :cond_d

    .line 440
    .line 441
    move-object/from16 v3, v24

    .line 442
    .line 443
    :cond_d
    const-string v6, "\u6309\u8bbe\u7f6e\u6295\u5582\u524d\u76ee\u5f55\u4e1a\u52a1\u5931\u8d25 name="

    .line 444
    .line 445
    invoke-static {v1, v6, v9, v10, v8}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    const/4 v3, 0x4

    .line 457
    const/4 v6, 0x0

    .line 458
    invoke-static {v11, v1, v6, v3, v6}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    move/from16 v10, v26

    .line 462
    .line 463
    :goto_a
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 464
    .line 465
    .line 466
    move-result v1

    .line 467
    add-int/lit8 v1, v1, -0x1

    .line 468
    .line 469
    invoke-static {v5, v1}, Lv71;->δ(II)V

    .line 470
    .line 471
    .line 472
    move/from16 v5, v18

    .line 473
    .line 474
    move-object/from16 v6, v20

    .line 475
    .line 476
    move-object/from16 v1, v22

    .line 477
    .line 478
    move-object/from16 v8, v24

    .line 479
    .line 480
    move/from16 v12, v27

    .line 481
    .line 482
    goto :goto_9

    .line 483
    :cond_e
    add-int/lit8 v13, v13, 0x1

    .line 484
    .line 485
    iget-object v3, v3, Lxe1;->ζ:Ljava/util/List;

    .line 486
    .line 487
    invoke-static {v2, v4, v3}, Lg81;->ζ(ILjava/lang/String;Ljava/util/List;)Lta1;

    .line 488
    .line 489
    .line 490
    move-result-object v3

    .line 491
    move/from16 v23, v2

    .line 492
    .line 493
    iget-object v2, v3, Lta1;->β:Lua1;

    .line 494
    .line 495
    move-object/from16 v28, v4

    .line 496
    .line 497
    iget-object v4, v3, Lta1;->α:Lze1;

    .line 498
    .line 499
    move/from16 v29, v13

    .line 500
    .line 501
    const-string v13, " reason="

    .line 502
    .line 503
    if-eqz v4, :cond_1c

    .line 504
    .line 505
    if-nez v2, :cond_1c

    .line 506
    .line 507
    if-eqz v4, :cond_1b

    .line 508
    .line 509
    iget-object v2, v4, Lze1;->α:Ljava/lang/String;

    .line 510
    .line 511
    const/16 v3, 0xa

    .line 512
    .line 513
    invoke-static {v2, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    iget-object v3, v4, Lze1;->γ:Ljava/lang/Integer;

    .line 518
    .line 519
    if-eqz v2, :cond_f

    .line 520
    .line 521
    if-nez v3, :cond_10

    .line 522
    .line 523
    :cond_f
    move/from16 v31, v14

    .line 524
    .line 525
    move/from16 v30, v15

    .line 526
    .line 527
    const/4 v3, 0x4

    .line 528
    const/4 v6, 0x0

    .line 529
    goto/16 :goto_10

    .line 530
    .line 531
    :cond_10
    move/from16 v30, v15

    .line 532
    .line 533
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result v15

    .line 537
    move/from16 v31, v14

    .line 538
    .line 539
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 540
    .line 541
    .line 542
    move-result v14

    .line 543
    invoke-static {v0, v6, v7, v15, v14}, Lp91;->ι(Ljava/lang/ClassLoader;JII)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v14

    .line 547
    instance-of v15, v14, Leo1;

    .line 548
    .line 549
    if-eqz v15, :cond_12

    .line 550
    .line 551
    add-int/lit8 v2, v21, 0x1

    .line 552
    .line 553
    new-instance v3, Ljava/lang/StringBuilder;

    .line 554
    .line 555
    const-string v4, "\u6309\u8bbe\u7f6e\u6295\u5582\u8bf7\u6c42\u5931\u8d25 name="

    .line 556
    .line 557
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v1

    .line 573
    invoke-static {v14}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    if-nez v3, :cond_11

    .line 578
    .line 579
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 580
    .line 581
    const-string v4, "\u6295\u5582\u8fd4\u56de\u672a\u77e5\u9519\u8bef"

    .line 582
    .line 583
    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    :cond_11
    invoke-static {v11, v1, v3}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 587
    .line 588
    .line 589
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    add-int/lit8 v1, v1, -0x1

    .line 594
    .line 595
    invoke-static {v5, v1}, Lv71;->δ(II)V

    .line 596
    .line 597
    .line 598
    move v7, v2

    .line 599
    move/from16 v5, v18

    .line 600
    .line 601
    move-object/from16 v6, v20

    .line 602
    .line 603
    move-object/from16 v1, v22

    .line 604
    .line 605
    move/from16 v2, v23

    .line 606
    .line 607
    move-object/from16 v8, v24

    .line 608
    .line 609
    move/from16 v10, v26

    .line 610
    .line 611
    move/from16 v12, v27

    .line 612
    .line 613
    move-object/from16 v4, v28

    .line 614
    .line 615
    move/from16 v13, v29

    .line 616
    .line 617
    move/from16 v15, v30

    .line 618
    .line 619
    :goto_b
    move/from16 v14, v31

    .line 620
    .line 621
    goto/16 :goto_9

    .line 622
    .line 623
    :cond_12
    invoke-static {v14}, Li81;->Β(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    check-cast v14, Lwe1;

    .line 627
    .line 628
    iget-object v1, v14, Lwe1;->δ:Ljava/lang/String;

    .line 629
    .line 630
    iget v6, v14, Lwe1;->γ:I

    .line 631
    .line 632
    invoke-virtual {v14}, Lwe1;->α()Z

    .line 633
    .line 634
    .line 635
    move-result v7

    .line 636
    const/4 v15, -0x1

    .line 637
    if-eqz v7, :cond_15

    .line 638
    .line 639
    add-int/lit8 v1, v31, 0x1

    .line 640
    .line 641
    iget-object v6, v4, Lze1;->β:Ljava/lang/String;

    .line 642
    .line 643
    const/16 v7, 0x30

    .line 644
    .line 645
    invoke-static {v6, v7}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v6

    .line 649
    iget-object v7, v14, Lwe1;->θ:Ljava/lang/Long;

    .line 650
    .line 651
    if-nez v7, :cond_13

    .line 652
    .line 653
    iget-object v7, v4, Lze1;->ε:Ljava/lang/Integer;

    .line 654
    .line 655
    if-nez v7, :cond_13

    .line 656
    .line 657
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    :cond_13
    iget-object v4, v14, Lwe1;->η:Ljava/lang/Long;

    .line 662
    .line 663
    if-eqz v4, :cond_14

    .line 664
    .line 665
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 666
    .line 667
    .line 668
    move-result-wide v12

    .line 669
    goto :goto_c

    .line 670
    :cond_14
    const-wide/16 v12, -0x1

    .line 671
    .line 672
    :goto_c
    new-instance v4, Ljava/lang/StringBuilder;

    .line 673
    .line 674
    const-string v8, "\u6309\u8bbe\u7f6e\u6295\u5582\u6210\u529f name="

    .line 675
    .line 676
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    const-string v8, " foodId="

    .line 683
    .line 684
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    const-string v2, " foodName="

    .line 691
    .line 692
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    const-string v2, " price="

    .line 699
    .line 700
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    const-string v2, " closeness="

    .line 707
    .line 708
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    const-string v2, " balanceSpark="

    .line 715
    .line 716
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v4, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    const/4 v3, 0x4

    .line 727
    const/4 v6, 0x0

    .line 728
    invoke-static {v11, v2, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    move v14, v1

    .line 732
    move/from16 v7, v21

    .line 733
    .line 734
    move/from16 v10, v26

    .line 735
    .line 736
    goto/16 :goto_f

    .line 737
    .line 738
    :cond_15
    const v2, 0x493e1

    .line 739
    .line 740
    .line 741
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    const v3, 0x493e2

    .line 746
    .line 747
    .line 748
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    const v25, 0xf2ad8

    .line 753
    .line 754
    .line 755
    invoke-static/range {v25 .. v25}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 756
    .line 757
    .line 758
    move-result-object v4

    .line 759
    filled-new-array {v2, v3, v4}, [Ljava/lang/Integer;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    invoke-static {v2}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result v2

    .line 775
    if-eqz v2, :cond_17

    .line 776
    .line 777
    add-int/lit8 v2, v26, 0x1

    .line 778
    .line 779
    if-nez v1, :cond_16

    .line 780
    .line 781
    move-object/from16 v1, v24

    .line 782
    .line 783
    :cond_16
    invoke-static {v6, v12, v9, v10, v8}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    move-result-object v3

    .line 787
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    const/4 v3, 0x4

    .line 795
    const/4 v6, 0x0

    .line 796
    invoke-static {v11, v1, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    move v10, v2

    .line 800
    move/from16 v7, v21

    .line 801
    .line 802
    :goto_d
    move/from16 v14, v31

    .line 803
    .line 804
    goto :goto_f

    .line 805
    :cond_17
    add-int/lit8 v7, v21, 0x1

    .line 806
    .line 807
    const v2, 0x493e3

    .line 808
    .line 809
    .line 810
    if-ne v6, v2, :cond_18

    .line 811
    .line 812
    const-string v2, "price_changed_no_retry"

    .line 813
    .line 814
    goto :goto_e

    .line 815
    :cond_18
    const-string v2, "business_error"

    .line 816
    .line 817
    :goto_e
    iget v3, v14, Lwe1;->α:I

    .line 818
    .line 819
    iget-object v4, v14, Lwe1;->β:Ljava/lang/Integer;

    .line 820
    .line 821
    if-eqz v4, :cond_19

    .line 822
    .line 823
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 824
    .line 825
    .line 826
    move-result v15

    .line 827
    :cond_19
    if-nez v1, :cond_1a

    .line 828
    .line 829
    move-object/from16 v1, v24

    .line 830
    .line 831
    :cond_1a
    const-string v4, " bridge="

    .line 832
    .line 833
    const-string v12, " http="

    .line 834
    .line 835
    const-string v14, "\u6309\u8bbe\u7f6e\u6295\u5582\u5931\u8d25 name="

    .line 836
    .line 837
    invoke-static {v3, v14, v9, v4, v12}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 838
    .line 839
    .line 840
    move-result-object v3

    .line 841
    invoke-static {v3, v15, v10, v6, v13}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-static {v3, v2, v8, v1}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v1

    .line 848
    const/4 v3, 0x4

    .line 849
    const/4 v6, 0x0

    .line 850
    invoke-static {v11, v1, v6, v3, v6}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 851
    .line 852
    .line 853
    move/from16 v10, v26

    .line 854
    .line 855
    goto :goto_d

    .line 856
    :goto_f
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 857
    .line 858
    .line 859
    move-result v1

    .line 860
    add-int/lit8 v1, v1, -0x1

    .line 861
    .line 862
    invoke-static {v5, v1}, Lv71;->δ(II)V

    .line 863
    .line 864
    .line 865
    move-object v9, v6

    .line 866
    move/from16 v5, v18

    .line 867
    .line 868
    move-object/from16 v6, v20

    .line 869
    .line 870
    move-object/from16 v1, v22

    .line 871
    .line 872
    move/from16 v2, v23

    .line 873
    .line 874
    move-object/from16 v8, v24

    .line 875
    .line 876
    move/from16 v12, v27

    .line 877
    .line 878
    move-object/from16 v4, v28

    .line 879
    .line 880
    move/from16 v13, v29

    .line 881
    .line 882
    move/from16 v15, v30

    .line 883
    .line 884
    goto/16 :goto_8

    .line 885
    .line 886
    :goto_10
    add-int/lit8 v1, v27, 0x1

    .line 887
    .line 888
    const-string v2, " reason=invalid_catalog_item"

    .line 889
    .line 890
    invoke-static {v12, v9, v2}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    invoke-static {v11, v2, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    add-int/lit8 v2, v2, -0x1

    .line 902
    .line 903
    invoke-static {v5, v2}, Lv71;->δ(II)V

    .line 904
    .line 905
    .line 906
    move v12, v1

    .line 907
    move-object v9, v6

    .line 908
    move/from16 v5, v18

    .line 909
    .line 910
    move-object/from16 v6, v20

    .line 911
    .line 912
    move/from16 v7, v21

    .line 913
    .line 914
    move-object/from16 v1, v22

    .line 915
    .line 916
    move/from16 v2, v23

    .line 917
    .line 918
    move-object/from16 v8, v24

    .line 919
    .line 920
    move/from16 v10, v26

    .line 921
    .line 922
    move-object/from16 v4, v28

    .line 923
    .line 924
    move/from16 v13, v29

    .line 925
    .line 926
    move/from16 v15, v30

    .line 927
    .line 928
    move/from16 v14, v31

    .line 929
    .line 930
    const/4 v3, 0x4

    .line 931
    goto/16 :goto_8

    .line 932
    .line 933
    :cond_1b
    const/4 v6, 0x0

    .line 934
    const-string v0, "Required value was null."

    .line 935
    .line 936
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    return-object v6

    .line 940
    :cond_1c
    move/from16 v31, v14

    .line 941
    .line 942
    move/from16 v30, v15

    .line 943
    .line 944
    const/16 v17, 0xa

    .line 945
    .line 946
    sget-object v1, Lua1;->ι:Lua1;

    .line 947
    .line 948
    if-ne v2, v1, :cond_1d

    .line 949
    .line 950
    add-int/lit8 v15, v30, 0x1

    .line 951
    .line 952
    move/from16 v1, v27

    .line 953
    .line 954
    goto :goto_11

    .line 955
    :cond_1d
    add-int/lit8 v1, v27, 0x1

    .line 956
    .line 957
    move/from16 v15, v30

    .line 958
    .line 959
    :goto_11
    if-eqz v2, :cond_1e

    .line 960
    .line 961
    iget-object v2, v2, Lua1;->ε:Ljava/lang/String;

    .line 962
    .line 963
    goto :goto_12

    .line 964
    :cond_1e
    const-string v2, "policy_rejected"

    .line 965
    .line 966
    :goto_12
    iget-object v3, v3, Lta1;->γ:Ljava/lang/String;

    .line 967
    .line 968
    const-string v4, " detail="

    .line 969
    .line 970
    invoke-static {v12, v9, v13, v2, v4}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    const/4 v3, 0x4

    .line 982
    const/4 v6, 0x0

    .line 983
    invoke-static {v11, v2, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    invoke-interface/range {v22 .. v22}, Ljava/util/List;->size()I

    .line 987
    .line 988
    .line 989
    move-result v2

    .line 990
    add-int/lit8 v2, v2, -0x1

    .line 991
    .line 992
    invoke-static {v5, v2}, Lv71;->δ(II)V

    .line 993
    .line 994
    .line 995
    move v12, v1

    .line 996
    move/from16 v5, v18

    .line 997
    .line 998
    move-object/from16 v6, v20

    .line 999
    .line 1000
    move/from16 v7, v21

    .line 1001
    .line 1002
    move-object/from16 v1, v22

    .line 1003
    .line 1004
    move/from16 v2, v23

    .line 1005
    .line 1006
    move-object/from16 v8, v24

    .line 1007
    .line 1008
    move/from16 v10, v26

    .line 1009
    .line 1010
    move-object/from16 v4, v28

    .line 1011
    .line 1012
    move/from16 v13, v29

    .line 1013
    .line 1014
    goto/16 :goto_b

    .line 1015
    .line 1016
    :cond_1f
    move/from16 v21, v7

    .line 1017
    .line 1018
    move/from16 v26, v10

    .line 1019
    .line 1020
    move/from16 v27, v12

    .line 1021
    .line 1022
    move/from16 v31, v14

    .line 1023
    .line 1024
    move/from16 v30, v15

    .line 1025
    .line 1026
    const-string v0, ", \u6210\u529f "

    .line 1027
    .line 1028
    const-string v1, ", \u4ef7\u683c\u62e6\u622a "

    .line 1029
    .line 1030
    const-string v2, "\u6309\u8bbe\u7f6e\u6295\u5582\u5b8c\u6210: \u4f1a\u8bdd "

    .line 1031
    .line 1032
    move/from16 v14, v31

    .line 1033
    .line 1034
    invoke-static {v2, v13, v0, v14, v1}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    const-string v1, ", \u76ee\u5f55\u4e0d\u53ef\u7528 "

    .line 1039
    .line 1040
    const-string v2, ", \u8df3\u8fc7 "

    .line 1041
    .line 1042
    move/from16 v5, v27

    .line 1043
    .line 1044
    move/from16 v15, v30

    .line 1045
    .line 1046
    invoke-static {v0, v15, v1, v5, v2}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1047
    .line 1048
    .line 1049
    move/from16 v10, v26

    .line 1050
    .line 1051
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1052
    .line 1053
    .line 1054
    const-string v1, ", \u5931\u8d25 "

    .line 1055
    .line 1056
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1057
    .line 1058
    .line 1059
    move/from16 v7, v21

    .line 1060
    .line 1061
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    const/4 v3, 0x4

    .line 1069
    const/4 v6, 0x0

    .line 1070
    invoke-static {v11, v0, v6, v3, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1071
    .line 1072
    .line 1073
    new-instance v12, Lkf1;

    .line 1074
    .line 1075
    move-object/from16 v19, v0

    .line 1076
    .line 1077
    move/from16 v16, v5

    .line 1078
    .line 1079
    move/from16 v18, v7

    .line 1080
    .line 1081
    move/from16 v17, v10

    .line 1082
    .line 1083
    invoke-direct/range {v12 .. v19}, Lkf1;-><init>(IIIIIILjava/lang/String;)V

    .line 1084
    .line 1085
    .line 1086
    return-object v12
.end method

.method public static final η(Landroid/view/View;)Lhr0;
    .locals 3

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    const v1, 0x7f090386

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Lhr0;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    check-cast v1, Lhr0;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    move-object v1, v0

    .line 19
    :goto_1
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    invoke-static {p0}, Lp91;->ο(Landroid/view/View;)Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    instance-of v1, p0, Landroid/view/View;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    check-cast p0, Landroid/view/View;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    move-object p0, v0

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    return-object v0
.end method

.method public static final θ(Lxr1;)Lm32;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lwr1;->α:Lis1;

    .line 7
    .line 8
    iget-object p0, p0, Lxr1;->ε:Lb21;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    move-object p0, v1

    .line 18
    :cond_0
    check-cast p0, Lм;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lм;->β:Lm80;

    .line 23
    .line 24
    check-cast p0, La80;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Lm32;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    return-object v1
.end method

.method public static final ι(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p0, v0, v1, p1}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eq p1, p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public static κ(Lz81;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sput-boolean p1, Lv71;->α:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x4

    .line 8
    if-eqz p1, :cond_11

    .line 9
    .line 10
    const-string v0, "r3e86435464f24cb5"

    .line 11
    .line 12
    const-string v6, "\u4f7f\u7528 3903 \u9876\u680f Tab \u8fc7\u6ee4\u5206\u652f"

    .line 13
    .line 14
    invoke-static {v0, v6}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v6, Ll52;->α:Ll52;

    .line 18
    .line 19
    const-string v0, "ra3f49bce40b36580"

    .line 20
    .line 21
    const-string v7, "\u521d\u59cb\u5316 3903 \u9876\u680f Tab \u8fc7\u6ee4"

    .line 22
    .line 23
    invoke-static {v0, v7}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 27
    .line 28
    :try_start_0
    sget-object v7, Lqe0;->α:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v7, Ll52;->δ:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v7}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    sget-object v8, Ll52;->ε:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v8}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :try_start_1
    sget-object v8, Ll52;->υ:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 44
    .line 45
    if-ne v8, v7, :cond_0

    .line 46
    .line 47
    :try_start_2
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    move v3, v2

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :catchall_0
    move-exception v0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_0
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v9, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    array-length v10, v8

    .line 71
    const/4 v11, 0x0

    .line 72
    :goto_0
    if-ge v11, v10, :cond_3

    .line 73
    .line 74
    aget-object v12, v8, v11

    .line 75
    .line 76
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    if-nez v13, :cond_2

    .line 85
    .line 86
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    invoke-static {v13, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    if-eqz v13, :cond_2

    .line 97
    .line 98
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    array-length v14, v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 106
    const/4 v15, 0x0

    .line 107
    :goto_1
    if-ge v15, v14, :cond_2

    .line 108
    .line 109
    const/16 v16, 0x0

    .line 110
    .line 111
    :try_start_4
    aget-object v3, v13, v15

    .line 112
    .line 113
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_1

    .line 118
    .line 119
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :cond_1
    add-int/lit8 v15, v15, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    const/16 v16, 0x0

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :catchall_2
    move-exception v0

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :goto_2
    add-int/lit8 v11, v11, 0x1

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_3
    const/16 v16, 0x0

    .line 141
    .line 142
    new-instance v0, Ljava/util/HashSet;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v3, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    :cond_4
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_5

    .line 161
    .line 162
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    move-object v10, v9

    .line 167
    check-cast v10, Ljava/lang/reflect/Method;

    .line 168
    .line 169
    sget-object v11, Ll52;->α:Ll52;

    .line 170
    .line 171
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-static {v10}, Ll52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-eqz v10, :cond_4

    .line 183
    .line 184
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_6

    .line 193
    .line 194
    const-string v0, "ra3f49bce40b36580"

    .line 195
    .line 196
    const-string v3, "\u672a\u627e\u5230 3903 \u9876\u680f ViewPager \u7ed3\u6784\u5019\u9009\uff0c\u5df2\u964d\u7ea7\u4e3a\u4e0d\u6355\u83b7\u9875\u5e8f"

    .line 197
    .line 198
    invoke-static {v0, v3, v4, v5, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 199
    .line 200
    .line 201
    :try_start_5
    monitor-exit v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 202
    :goto_4
    move/from16 v3, v16

    .line 203
    .line 204
    goto :goto_8

    .line 205
    :catchall_3
    move-exception v0

    .line 206
    goto :goto_7

    .line 207
    :cond_6
    :try_start_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v8

    .line 215
    if-eqz v8, :cond_7

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    check-cast v8, Ljava/lang/reflect/Method;

    .line 222
    .line 223
    invoke-virtual {v8, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 224
    .line 225
    .line 226
    sget-object v9, Lxq0;->α:Lxq0;

    .line 227
    .line 228
    new-instance v10, Lpy1;

    .line 229
    .line 230
    const/16 v11, 0xc

    .line 231
    .line 232
    invoke-direct {v10, v11}, Lpy1;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v9, v8, v10}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_7
    sget-object v0, Ll52;->α:Ll52;

    .line 240
    .line 241
    invoke-static {v7}, Ll52;->μ(Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    sput-object v7, Ll52;->υ:Ljava/lang/Class;

    .line 245
    .line 246
    const-string v0, "ra3f49bce40b36580"

    .line 247
    .line 248
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    new-instance v7, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    const-string v8, "Hook \u9876\u680f ViewPager \u6355\u83b7\u6210\u529f methods="

    .line 258
    .line 259
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    invoke-static {v0, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 270
    .line 271
    .line 272
    :try_start_7
    monitor-exit v6

    .line 273
    move v3, v2

    .line 274
    goto :goto_8

    .line 275
    :goto_6
    monitor-exit v6

    .line 276
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 277
    :goto_7
    const-string v3, "ra3f49bce40b36580"

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    const-string v8, "Hook \u9876\u680f ViewPager \u6355\u83b7\u5931\u8d25: "

    .line 284
    .line 285
    invoke-static {v8, v7, v3, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    goto :goto_4

    .line 289
    :goto_8
    invoke-static {}, Ll52;->ο()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_f

    .line 294
    .line 295
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 296
    .line 297
    :try_start_8
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 298
    .line 299
    sget-object v1, Ll52;->γ:Ljava/lang/String;

    .line 300
    .line 301
    invoke-static {v0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    monitor-enter v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 306
    :try_start_9
    sget-object v1, Ll52;->φ:Ljava/lang/Class;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 307
    .line 308
    if-ne v1, v0, :cond_8

    .line 309
    .line 310
    :try_start_a
    monitor-exit v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 311
    goto/16 :goto_10

    .line 312
    .line 313
    :catchall_4
    move-exception v0

    .line 314
    goto/16 :goto_f

    .line 315
    .line 316
    :cond_8
    :try_start_b
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    new-instance v7, Ljava/util/ArrayList;

    .line 324
    .line 325
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 326
    .line 327
    .line 328
    array-length v8, v1

    .line 329
    move/from16 v9, v16

    .line 330
    .line 331
    :goto_9
    if-ge v9, v8, :cond_a

    .line 332
    .line 333
    aget-object v10, v1, v9

    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-nez v11, :cond_9

    .line 347
    .line 348
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 353
    .line 354
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result v11

    .line 358
    if-eqz v11, :cond_9

    .line 359
    .line 360
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    array-length v11, v11

    .line 365
    if-ne v11, v2, :cond_9

    .line 366
    .line 367
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    aget-object v11, v11, v16

    .line 372
    .line 373
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 374
    .line 375
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v11

    .line 379
    if-eqz v11, :cond_9

    .line 380
    .line 381
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :catchall_5
    move-exception v0

    .line 386
    goto/16 :goto_e

    .line 387
    .line 388
    :cond_9
    :goto_a
    add-int/lit8 v9, v9, 0x1

    .line 389
    .line 390
    goto :goto_9

    .line 391
    :cond_a
    new-instance v1, Ljava/util/HashSet;

    .line 392
    .line 393
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 394
    .line 395
    .line 396
    new-instance v8, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    :cond_b
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v9

    .line 409
    if-eqz v9, :cond_c

    .line 410
    .line 411
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v9

    .line 415
    move-object v10, v9

    .line 416
    check-cast v10, Ljava/lang/reflect/Method;

    .line 417
    .line 418
    sget-object v11, Ll52;->α:Ll52;

    .line 419
    .line 420
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {v10}, Ll52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    if-eqz v10, :cond_b

    .line 432
    .line 433
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 434
    .line 435
    .line 436
    goto :goto_b

    .line 437
    :cond_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-eqz v1, :cond_d

    .line 442
    .line 443
    const-string v0, "ra3f49bce40b36580"

    .line 444
    .line 445
    const-string v1, "\u672a\u627e\u5230 3903 \u9876\u680f\u9875\u9762\u5207\u6362\u7ed3\u6784\u5019\u9009\uff0c\u5df2\u964d\u7ea7\u4e3a\u4e0d\u8df3\u8fc7\u9690\u85cf\u9875"

    .line 446
    .line 447
    invoke-static {v0, v1, v4, v5, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 448
    .line 449
    .line 450
    :try_start_c
    monitor-exit v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 451
    :goto_c
    move/from16 v2, v16

    .line 452
    .line 453
    goto :goto_10

    .line 454
    :cond_d
    :try_start_d
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-eqz v4, :cond_e

    .line 463
    .line 464
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    check-cast v4, Ljava/lang/reflect/Method;

    .line 469
    .line 470
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 471
    .line 472
    .line 473
    sget-object v5, Lxq0;->α:Lxq0;

    .line 474
    .line 475
    new-instance v7, Lpy1;

    .line 476
    .line 477
    const/16 v9, 0xe

    .line 478
    .line 479
    invoke-direct {v7, v9}, Lpy1;-><init>(I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v5, v4, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 483
    .line 484
    .line 485
    goto :goto_d

    .line 486
    :cond_e
    sput-object v0, Ll52;->φ:Ljava/lang/Class;

    .line 487
    .line 488
    const-string v0, "ra3f49bce40b36580"

    .line 489
    .line 490
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    new-instance v4, Ljava/lang/StringBuilder;

    .line 495
    .line 496
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 497
    .line 498
    .line 499
    const-string v5, "Hook \u9876\u680f\u9875\u9762\u5207\u6362\u6210\u529f methods="

    .line 500
    .line 501
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 512
    .line 513
    .line 514
    :try_start_e
    monitor-exit v6

    .line 515
    goto :goto_10

    .line 516
    :goto_e
    monitor-exit v6

    .line 517
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 518
    :goto_f
    const-string v1, "ra3f49bce40b36580"

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    const-string v4, "Hook \u9876\u680f\u9875\u9762\u5207\u6362\u5931\u8d25: "

    .line 525
    .line 526
    invoke-static {v4, v2, v1, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 527
    .line 528
    .line 529
    goto :goto_c

    .line 530
    :cond_f
    const-string v0, "ra3f49bce40b36580"

    .line 531
    .line 532
    const-string v1, "\u9876\u680f\u9690\u85cf\u9875\u8df3\u8fc7\u672a\u542f\u7528\uff0c\u8df3\u8fc7\u6ed1\u52a8\u7d22\u5f15 Hook"

    .line 533
    .line 534
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    :goto_10
    if-eqz v3, :cond_10

    .line 538
    .line 539
    if-eqz v2, :cond_10

    .line 540
    .line 541
    const-string v0, "ra3f49bce40b36580"

    .line 542
    .line 543
    const-string v1, "Hook 3903 MainTabStripScrollView \u6210\u529f"

    .line 544
    .line 545
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_23

    .line 549
    .line 550
    :cond_10
    const-string v0, "ra3f49bce40b36580"

    .line 551
    .line 552
    const-string v1, "3903 \u9876\u680f Hook \u5c1a\u672a\u5b8c\u5168\u5c31\u7eea\uff0c\u7b49\u5f85 attach \u9636\u6bb5\u5b89\u5168\u91cd\u8bd5"

    .line 553
    .line 554
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_23

    .line 558
    .line 559
    :cond_11
    const/16 v16, 0x0

    .line 560
    .line 561
    const-string v0, "r3e86435464f24cb5"

    .line 562
    .line 563
    const-string v3, "\u4f7f\u7528\u65e7\u7248\u9876\u680f Tab \u8fc7\u6ee4\u5206\u652f"

    .line 564
    .line 565
    invoke-static {v0, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    sget-object v3, Lm52;->α:Lm52;

    .line 569
    .line 570
    const-string v0, "r14983b95b84acb5"

    .line 571
    .line 572
    const-string v6, "\u521d\u59cb\u5316\u9876\u680f Tab \u8fc7\u6ee4"

    .line 573
    .line 574
    invoke-static {v0, v6}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 578
    .line 579
    :try_start_f
    sget-object v6, Lqe0;->α:Ljava/lang/Object;

    .line 580
    .line 581
    sget-object v6, Lm52;->δ:Ljava/lang/String;

    .line 582
    .line 583
    invoke-static {v0, v6}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    sget-object v7, Lm52;->ε:Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {v0, v7}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    monitor-enter v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 594
    :try_start_10
    sget-object v7, Lm52;->υ:Ljava/lang/Class;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 595
    .line 596
    if-ne v7, v6, :cond_12

    .line 597
    .line 598
    :try_start_11
    monitor-exit v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 599
    :goto_11
    move v6, v2

    .line 600
    goto/16 :goto_1a

    .line 601
    .line 602
    :catchall_6
    move-exception v0

    .line 603
    goto/16 :goto_19

    .line 604
    .line 605
    :cond_12
    :try_start_12
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    new-instance v8, Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 615
    .line 616
    .line 617
    array-length v9, v7

    .line 618
    move/from16 v10, v16

    .line 619
    .line 620
    :goto_12
    if-ge v10, v9, :cond_15

    .line 621
    .line 622
    aget-object v11, v7, v10

    .line 623
    .line 624
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 625
    .line 626
    .line 627
    move-result v12

    .line 628
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 629
    .line 630
    .line 631
    move-result v12

    .line 632
    if-nez v12, :cond_14

    .line 633
    .line 634
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    move-result-object v12

    .line 638
    sget-object v13, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 639
    .line 640
    invoke-static {v12, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v12

    .line 644
    if-eqz v12, :cond_14

    .line 645
    .line 646
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    move-result-object v12

    .line 650
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    array-length v13, v12

    .line 654
    move/from16 v14, v16

    .line 655
    .line 656
    :goto_13
    if-ge v14, v13, :cond_14

    .line 657
    .line 658
    aget-object v15, v12, v14

    .line 659
    .line 660
    invoke-virtual {v0, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 661
    .line 662
    .line 663
    move-result v15

    .line 664
    if-eqz v15, :cond_13

    .line 665
    .line 666
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 667
    .line 668
    .line 669
    goto :goto_14

    .line 670
    :catchall_7
    move-exception v0

    .line 671
    goto/16 :goto_18

    .line 672
    .line 673
    :cond_13
    add-int/lit8 v14, v14, 0x1

    .line 674
    .line 675
    goto :goto_13

    .line 676
    :cond_14
    :goto_14
    add-int/lit8 v10, v10, 0x1

    .line 677
    .line 678
    goto :goto_12

    .line 679
    :cond_15
    new-instance v0, Ljava/util/HashSet;

    .line 680
    .line 681
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 682
    .line 683
    .line 684
    new-instance v7, Ljava/util/ArrayList;

    .line 685
    .line 686
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 690
    .line 691
    .line 692
    move-result-object v8

    .line 693
    :cond_16
    :goto_15
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 694
    .line 695
    .line 696
    move-result v9

    .line 697
    if-eqz v9, :cond_17

    .line 698
    .line 699
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    move-object v10, v9

    .line 704
    check-cast v10, Ljava/lang/reflect/Method;

    .line 705
    .line 706
    sget-object v11, Lm52;->α:Lm52;

    .line 707
    .line 708
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    invoke-static {v10}, Lm52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v10

    .line 715
    invoke-virtual {v0, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    move-result v10

    .line 719
    if-eqz v10, :cond_16

    .line 720
    .line 721
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    goto :goto_15

    .line 725
    :cond_17
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    if-eqz v0, :cond_18

    .line 730
    .line 731
    const-string v0, "r14983b95b84acb5"

    .line 732
    .line 733
    const-string v6, "\u672a\u627e\u5230\u9876\u680f ViewPager \u7ed3\u6784\u5019\u9009\uff0c\u5df2\u964d\u7ea7\u4e3a\u4e0d\u6355\u83b7\u9875\u5e8f"

    .line 734
    .line 735
    invoke-static {v0, v6, v4, v5, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 736
    .line 737
    .line 738
    :try_start_13
    monitor-exit v3
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 739
    :goto_16
    move/from16 v6, v16

    .line 740
    .line 741
    goto :goto_1a

    .line 742
    :cond_18
    :try_start_14
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v8

    .line 750
    if-eqz v8, :cond_19

    .line 751
    .line 752
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v8

    .line 756
    check-cast v8, Ljava/lang/reflect/Method;

    .line 757
    .line 758
    invoke-virtual {v8, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 759
    .line 760
    .line 761
    sget-object v9, Lxq0;->α:Lxq0;

    .line 762
    .line 763
    new-instance v10, Lpy1;

    .line 764
    .line 765
    const/16 v11, 0x9

    .line 766
    .line 767
    invoke-direct {v10, v11}, Lpy1;-><init>(I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v9, v8, v10}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 771
    .line 772
    .line 773
    goto :goto_17

    .line 774
    :cond_19
    sget-object v0, Lm52;->α:Lm52;

    .line 775
    .line 776
    invoke-static {v6}, Lm52;->μ(Ljava/lang/Class;)V

    .line 777
    .line 778
    .line 779
    sput-object v6, Lm52;->υ:Ljava/lang/Class;

    .line 780
    .line 781
    const-string v0, "r14983b95b84acb5"

    .line 782
    .line 783
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 784
    .line 785
    .line 786
    move-result v6

    .line 787
    new-instance v7, Ljava/lang/StringBuilder;

    .line 788
    .line 789
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 790
    .line 791
    .line 792
    const-string v8, "Hook \u9876\u680f ViewPager \u6355\u83b7\u6210\u529f methods="

    .line 793
    .line 794
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    .line 796
    .line 797
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v6

    .line 804
    invoke-static {v0, v6}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 805
    .line 806
    .line 807
    :try_start_15
    monitor-exit v3

    .line 808
    goto/16 :goto_11

    .line 809
    .line 810
    :goto_18
    monitor-exit v3

    .line 811
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 812
    :goto_19
    const-string v6, "r14983b95b84acb5"

    .line 813
    .line 814
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v7

    .line 818
    const-string v8, "Hook \u9876\u680f ViewPager \u6355\u83b7\u5931\u8d25: "

    .line 819
    .line 820
    invoke-static {v8, v7, v6, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 821
    .line 822
    .line 823
    goto :goto_16

    .line 824
    :goto_1a
    invoke-static {}, Lm52;->ο()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_21

    .line 829
    .line 830
    iget-object v0, v1, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 831
    .line 832
    :try_start_16
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 833
    .line 834
    sget-object v1, Lm52;->γ:Ljava/lang/String;

    .line 835
    .line 836
    invoke-static {v0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    monitor-enter v3
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .line 841
    :try_start_17
    sget-object v1, Lm52;->φ:Ljava/lang/Class;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    .line 842
    .line 843
    if-ne v1, v0, :cond_1a

    .line 844
    .line 845
    :try_start_18
    monitor-exit v3
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_8

    .line 846
    goto/16 :goto_22

    .line 847
    .line 848
    :catchall_8
    move-exception v0

    .line 849
    goto/16 :goto_21

    .line 850
    .line 851
    :cond_1a
    :try_start_19
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    new-instance v7, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 861
    .line 862
    .line 863
    array-length v8, v1

    .line 864
    move/from16 v9, v16

    .line 865
    .line 866
    :goto_1b
    if-ge v9, v8, :cond_1c

    .line 867
    .line 868
    aget-object v10, v1, v9

    .line 869
    .line 870
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 874
    .line 875
    .line 876
    move-result v11

    .line 877
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 878
    .line 879
    .line 880
    move-result v11

    .line 881
    if-nez v11, :cond_1b

    .line 882
    .line 883
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    move-result-object v11

    .line 887
    sget-object v12, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 888
    .line 889
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v11

    .line 893
    if-eqz v11, :cond_1b

    .line 894
    .line 895
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    array-length v11, v11

    .line 900
    if-ne v11, v2, :cond_1b

    .line 901
    .line 902
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    move-result-object v11

    .line 906
    aget-object v11, v11, v16

    .line 907
    .line 908
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 909
    .line 910
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v11

    .line 914
    if-eqz v11, :cond_1b

    .line 915
    .line 916
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 917
    .line 918
    .line 919
    goto :goto_1c

    .line 920
    :catchall_9
    move-exception v0

    .line 921
    goto/16 :goto_20

    .line 922
    .line 923
    :cond_1b
    :goto_1c
    add-int/lit8 v9, v9, 0x1

    .line 924
    .line 925
    goto :goto_1b

    .line 926
    :cond_1c
    new-instance v1, Ljava/util/HashSet;

    .line 927
    .line 928
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 929
    .line 930
    .line 931
    new-instance v8, Ljava/util/ArrayList;

    .line 932
    .line 933
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 934
    .line 935
    .line 936
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 937
    .line 938
    .line 939
    move-result-object v7

    .line 940
    :cond_1d
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 941
    .line 942
    .line 943
    move-result v9

    .line 944
    if-eqz v9, :cond_1e

    .line 945
    .line 946
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v9

    .line 950
    move-object v10, v9

    .line 951
    check-cast v10, Ljava/lang/reflect/Method;

    .line 952
    .line 953
    sget-object v11, Lm52;->α:Lm52;

    .line 954
    .line 955
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 956
    .line 957
    .line 958
    invoke-static {v10}, Lm52;->ρ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    move-result-object v10

    .line 962
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v10

    .line 966
    if-eqz v10, :cond_1d

    .line 967
    .line 968
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    goto :goto_1d

    .line 972
    :cond_1e
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-eqz v1, :cond_1f

    .line 977
    .line 978
    const-string v0, "r14983b95b84acb5"

    .line 979
    .line 980
    const-string v1, "\u672a\u627e\u5230\u9876\u680f\u9875\u9762\u5207\u6362\u7ed3\u6784\u5019\u9009\uff0c\u5df2\u964d\u7ea7\u4e3a\u4e0d\u8df3\u8fc7\u9690\u85cf\u9875"

    .line 981
    .line 982
    invoke-static {v0, v1, v4, v5, v4}, Lux;->λ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 983
    .line 984
    .line 985
    :try_start_1a
    monitor-exit v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    .line 986
    :goto_1e
    move/from16 v2, v16

    .line 987
    .line 988
    goto :goto_22

    .line 989
    :cond_1f
    :try_start_1b
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    :goto_1f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 994
    .line 995
    .line 996
    move-result v4

    .line 997
    if-eqz v4, :cond_20

    .line 998
    .line 999
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v4

    .line 1003
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1004
    .line 1005
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1006
    .line 1007
    .line 1008
    sget-object v5, Lxq0;->α:Lxq0;

    .line 1009
    .line 1010
    new-instance v7, Lpy1;

    .line 1011
    .line 1012
    const/16 v9, 0xb

    .line 1013
    .line 1014
    invoke-direct {v7, v9}, Lpy1;-><init>(I)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v5, v4, v7}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 1018
    .line 1019
    .line 1020
    goto :goto_1f

    .line 1021
    :cond_20
    sput-object v0, Lm52;->φ:Ljava/lang/Class;

    .line 1022
    .line 1023
    const-string v0, "r14983b95b84acb5"

    .line 1024
    .line 1025
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1026
    .line 1027
    .line 1028
    move-result v1

    .line 1029
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    const-string v5, "Hook \u9876\u680f\u9875\u9762\u5207\u6362\u6210\u529f methods="

    .line 1035
    .line 1036
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 1047
    .line 1048
    .line 1049
    :try_start_1c
    monitor-exit v3

    .line 1050
    goto :goto_22

    .line 1051
    :goto_20
    monitor-exit v3

    .line 1052
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    .line 1053
    :goto_21
    const-string v1, "r14983b95b84acb5"

    .line 1054
    .line 1055
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v2

    .line 1059
    const-string v3, "Hook \u9876\u680f\u9875\u9762\u5207\u6362\u5931\u8d25: "

    .line 1060
    .line 1061
    invoke-static {v3, v2, v1, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_1e

    .line 1065
    :cond_21
    const-string v0, "r14983b95b84acb5"

    .line 1066
    .line 1067
    const-string v1, "\u9876\u680f\u9690\u85cf\u9875\u8df3\u8fc7\u672a\u542f\u7528\uff0c\u8df3\u8fc7\u6ed1\u52a8\u7d22\u5f15 Hook"

    .line 1068
    .line 1069
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    :goto_22
    if-eqz v6, :cond_22

    .line 1073
    .line 1074
    if-eqz v2, :cond_22

    .line 1075
    .line 1076
    const-string v0, "r14983b95b84acb5"

    .line 1077
    .line 1078
    const-string v1, "Hook MainTabStripScrollView \u6210\u529f"

    .line 1079
    .line 1080
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_23

    .line 1084
    :cond_22
    const-string v0, "r14983b95b84acb5"

    .line 1085
    .line 1086
    const-string v1, "\u9876\u680f Hook \u5c1a\u672a\u5b8c\u5168\u5c31\u7eea\uff0c\u7b49\u5f85 attach \u9636\u6bb5\u5b89\u5168\u91cd\u8bd5"

    .line 1087
    .line 1088
    invoke-static {v0, v1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    :goto_23
    return-void
.end method

.method public static λ(Lrw1;ILrw1;ZZZ)Ljava/util/List;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p1}, Lrw1;->φ(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    add-int v4, v1, v3

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Lrw1;->ζ(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    invoke-virtual {v0, v4}, Lrw1;->ζ(I)I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    sub-int v7, v6, v5

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ltz v1, :cond_0

    .line 25
    .line 26
    iget-object v10, v0, Lrw1;->β:[I

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Lrw1;->σ(I)I

    .line 29
    .line 30
    .line 31
    move-result v11

    .line 32
    mul-int/lit8 v11, v11, 0x5

    .line 33
    .line 34
    add-int/2addr v11, v9

    .line 35
    aget v10, v10, v11

    .line 36
    .line 37
    const/high16 v11, 0xc000000

    .line 38
    .line 39
    and-int/2addr v10, v11

    .line 40
    if-eqz v10, :cond_0

    .line 41
    .line 42
    move v10, v9

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v10, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2, v3}, Lrw1;->ψ(I)V

    .line 46
    .line 47
    .line 48
    iget v11, v2, Lrw1;->υ:I

    .line 49
    .line 50
    invoke-virtual {v2, v7, v11}, Lrw1;->ω(II)V

    .line 51
    .line 52
    .line 53
    iget v11, v0, Lrw1;->η:I

    .line 54
    .line 55
    if-ge v11, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Lrw1;->Δ(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget v11, v0, Lrw1;->λ:I

    .line 61
    .line 62
    if-ge v11, v6, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, v6, v4}, Lrw1;->Ε(II)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v6, v2, Lrw1;->β:[I

    .line 68
    .line 69
    iget v11, v2, Lrw1;->υ:I

    .line 70
    .line 71
    iget-object v12, v0, Lrw1;->β:[I

    .line 72
    .line 73
    mul-int/lit8 v13, v11, 0x5

    .line 74
    .line 75
    mul-int/lit8 v14, v1, 0x5

    .line 76
    .line 77
    mul-int/lit8 v15, v4, 0x5

    .line 78
    .line 79
    invoke-static {v13, v14, v15, v12, v6}, Lg7;->Λ(III[I[I)V

    .line 80
    .line 81
    .line 82
    iget-object v12, v2, Lrw1;->γ:[Ljava/lang/Object;

    .line 83
    .line 84
    iget v14, v2, Lrw1;->ι:I

    .line 85
    .line 86
    iget-object v15, v0, Lrw1;->γ:[Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {v15, v5, v12, v14, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 89
    .line 90
    .line 91
    iget v15, v2, Lrw1;->χ:I

    .line 92
    .line 93
    add-int/lit8 v16, v13, 0x2

    .line 94
    .line 95
    aput v15, v6, v16

    .line 96
    .line 97
    sub-int v16, v11, v1

    .line 98
    .line 99
    add-int v8, v11, v3

    .line 100
    .line 101
    invoke-virtual {v2, v11, v6}, Lrw1;->η(I[I)I

    .line 102
    .line 103
    .line 104
    move-result v18

    .line 105
    sub-int v18, v14, v18

    .line 106
    .line 107
    move/from16 v19, v9

    .line 108
    .line 109
    iget v9, v2, Lrw1;->ν:I

    .line 110
    .line 111
    move/from16 v20, v9

    .line 112
    .line 113
    iget v9, v2, Lrw1;->μ:I

    .line 114
    .line 115
    array-length v12, v12

    .line 116
    move/from16 v21, v10

    .line 117
    .line 118
    move/from16 v10, v20

    .line 119
    .line 120
    move/from16 v20, v13

    .line 121
    .line 122
    move v13, v11

    .line 123
    :goto_1
    if-ge v13, v8, :cond_6

    .line 124
    .line 125
    if-eq v13, v11, :cond_3

    .line 126
    .line 127
    mul-int/lit8 v22, v13, 0x5

    .line 128
    .line 129
    add-int/lit8 v22, v22, 0x2

    .line 130
    .line 131
    aget v23, v6, v22

    .line 132
    .line 133
    add-int v23, v23, v16

    .line 134
    .line 135
    aput v23, v6, v22

    .line 136
    .line 137
    :cond_3
    invoke-virtual {v2, v13, v6}, Lrw1;->η(I[I)I

    .line 138
    .line 139
    .line 140
    move-result v22

    .line 141
    move-object/from16 v23, v6

    .line 142
    .line 143
    add-int v6, v22, v18

    .line 144
    .line 145
    if-ge v10, v13, :cond_4

    .line 146
    .line 147
    move/from16 v22, v11

    .line 148
    .line 149
    const/4 v11, 0x0

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move/from16 v22, v11

    .line 152
    .line 153
    iget v11, v2, Lrw1;->λ:I

    .line 154
    .line 155
    :goto_2
    invoke-static {v6, v11, v9, v12}, Lrw1;->ι(IIII)I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    mul-int/lit8 v11, v13, 0x5

    .line 160
    .line 161
    add-int/lit8 v11, v11, 0x4

    .line 162
    .line 163
    aput v6, v23, v11

    .line 164
    .line 165
    if-ne v13, v10, :cond_5

    .line 166
    .line 167
    add-int/lit8 v10, v10, 0x1

    .line 168
    .line 169
    :cond_5
    add-int/lit8 v13, v13, 0x1

    .line 170
    .line 171
    move/from16 v11, v22

    .line 172
    .line 173
    move-object/from16 v6, v23

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_6
    move-object/from16 v23, v6

    .line 177
    .line 178
    iput v10, v2, Lrw1;->ν:I

    .line 179
    .line 180
    iget-object v6, v0, Lrw1;->δ:Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-virtual {v0}, Lrw1;->π()I

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    invoke-static {v6, v1, v9}, Lqw1;->α(Ljava/util/ArrayList;II)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    iget-object v9, v0, Lrw1;->δ:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Lrw1;->π()I

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    invoke-static {v9, v4, v10}, Lqw1;->α(Ljava/util/ArrayList;II)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-ge v6, v4, :cond_8

    .line 201
    .line 202
    iget-object v9, v0, Lrw1;->δ:Ljava/util/ArrayList;

    .line 203
    .line 204
    new-instance v10, Ljava/util/ArrayList;

    .line 205
    .line 206
    sub-int v11, v4, v6

    .line 207
    .line 208
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 209
    .line 210
    .line 211
    move v11, v6

    .line 212
    :goto_3
    if-ge v11, v4, :cond_7

    .line 213
    .line 214
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    check-cast v12, Lq80;

    .line 219
    .line 220
    iget v13, v12, Lq80;->α:I

    .line 221
    .line 222
    add-int v13, v13, v16

    .line 223
    .line 224
    iput v13, v12, Lq80;->α:I

    .line 225
    .line 226
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    add-int/lit8 v11, v11, 0x1

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    iget-object v11, v2, Lrw1;->δ:Ljava/util/ArrayList;

    .line 233
    .line 234
    iget v12, v2, Lrw1;->υ:I

    .line 235
    .line 236
    invoke-virtual {v2}, Lrw1;->π()I

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    invoke-static {v11, v12, v13}, Lqw1;->α(Ljava/util/ArrayList;II)I

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    iget-object v12, v2, Lrw1;->δ:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v12, v11, v10}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9, v6, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_8
    sget-object v10, Ljz;->ε:Ljz;

    .line 258
    .line 259
    :goto_4
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_9

    .line 264
    .line 265
    iget-object v4, v0, Lrw1;->ε:Ljava/util/HashMap;

    .line 266
    .line 267
    iget-object v6, v2, Lrw1;->ε:Ljava/util/HashMap;

    .line 268
    .line 269
    if-eqz v4, :cond_9

    .line 270
    .line 271
    if-eqz v6, :cond_9

    .line 272
    .line 273
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 274
    .line 275
    .line 276
    move-result v6

    .line 277
    const/4 v9, 0x0

    .line 278
    :goto_5
    if-ge v9, v6, :cond_9

    .line 279
    .line 280
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    check-cast v11, Lq80;

    .line 285
    .line 286
    invoke-virtual {v4, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    check-cast v11, Lx80;

    .line 291
    .line 292
    add-int/lit8 v9, v9, 0x1

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_9
    iget v4, v2, Lrw1;->χ:I

    .line 296
    .line 297
    invoke-virtual {v2, v15}, Lrw1;->Ρ(I)Lx80;

    .line 298
    .line 299
    .line 300
    iget-object v4, v0, Lrw1;->β:[I

    .line 301
    .line 302
    invoke-virtual {v0, v1, v4}, Lrw1;->Η(I[I)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez p5, :cond_a

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_a
    if-eqz p3, :cond_e

    .line 312
    .line 313
    if-ltz v4, :cond_b

    .line 314
    .line 315
    move/from16 v17, v19

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_b
    const/16 v17, 0x0

    .line 319
    .line 320
    :goto_6
    if-eqz v17, :cond_c

    .line 321
    .line 322
    invoke-virtual {v0}, Lrw1;->Σ()V

    .line 323
    .line 324
    .line 325
    iget v3, v0, Lrw1;->υ:I

    .line 326
    .line 327
    sub-int/2addr v4, v3

    .line 328
    invoke-virtual {v0, v4}, Lrw1;->α(I)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lrw1;->Σ()V

    .line 332
    .line 333
    .line 334
    :cond_c
    iget v3, v0, Lrw1;->υ:I

    .line 335
    .line 336
    sub-int/2addr v1, v3

    .line 337
    invoke-virtual {v0, v1}, Lrw1;->α(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Lrw1;->Κ()Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    if-eqz v17, :cond_d

    .line 345
    .line 346
    invoke-virtual {v0}, Lrw1;->Ο()V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Lrw1;->κ()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0}, Lrw1;->Ο()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Lrw1;->κ()V

    .line 356
    .line 357
    .line 358
    :cond_d
    move/from16 v17, v1

    .line 359
    .line 360
    goto :goto_7

    .line 361
    :cond_e
    invoke-virtual {v0, v1, v3}, Lrw1;->Λ(II)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    add-int/lit8 v1, v1, -0x1

    .line 366
    .line 367
    invoke-virtual {v0, v5, v7, v1}, Lrw1;->Μ(III)V

    .line 368
    .line 369
    .line 370
    move/from16 v17, v3

    .line 371
    .line 372
    :goto_7
    if-eqz v17, :cond_f

    .line 373
    .line 374
    const-string v0, "Unexpectedly removed anchors"

    .line 375
    .line 376
    invoke-static {v0}, Lsn;->α(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    :cond_f
    iget v0, v2, Lrw1;->ο:I

    .line 380
    .line 381
    add-int/lit8 v13, v20, 0x1

    .line 382
    .line 383
    aget v1, v23, v13

    .line 384
    .line 385
    const/high16 v3, 0x40000000    # 2.0f

    .line 386
    .line 387
    and-int/2addr v3, v1

    .line 388
    if-eqz v3, :cond_10

    .line 389
    .line 390
    move/from16 v9, v19

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_10
    const v3, 0x3ffffff

    .line 394
    .line 395
    .line 396
    and-int v9, v1, v3

    .line 397
    .line 398
    :goto_8
    add-int/2addr v0, v9

    .line 399
    iput v0, v2, Lrw1;->ο:I

    .line 400
    .line 401
    if-eqz p4, :cond_11

    .line 402
    .line 403
    iput v8, v2, Lrw1;->υ:I

    .line 404
    .line 405
    add-int/2addr v14, v7

    .line 406
    iput v14, v2, Lrw1;->ι:I

    .line 407
    .line 408
    :cond_11
    if-eqz v21, :cond_12

    .line 409
    .line 410
    invoke-virtual {v2, v15}, Lrw1;->Χ(I)V

    .line 411
    .line 412
    .line 413
    :cond_12
    return-object v10
.end method

.method public static μ()V
    .locals 11

    .line 1
    sget-object v0, Ljz;->ε:Ljz;

    .line 2
    .line 3
    sget-object v1, Lnz;->ε:Lnz;

    .line 4
    .line 5
    sget-boolean v2, Lv71;->α:Z

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, -0x1

    .line 12
    const-string v8, ""

    .line 13
    .line 14
    const-wide/16 v9, -0x1

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    sget-object v2, Ll52;->α:Ll52;

    .line 19
    .line 20
    sput-wide v9, Ll52;->ι:J

    .line 21
    .line 22
    sput-object v1, Ll52;->η:Ljava/util/Set;

    .line 23
    .line 24
    sput-object v1, Ll52;->θ:Ljava/util/Set;

    .line 25
    .line 26
    sput-object v8, Ll52;->κ:Ljava/lang/String;

    .line 27
    .line 28
    sput-object v0, Ll52;->λ:Ljava/lang/Object;

    .line 29
    .line 30
    sput-object v1, Ll52;->μ:Ljava/util/Set;

    .line 31
    .line 32
    sput v7, Ll52;->ν:I

    .line 33
    .line 34
    sput-object v8, Ll52;->ξ:Ljava/lang/String;

    .line 35
    .line 36
    sput-object v6, Ll52;->ο:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    sput-object v0, Ll52;->π:Ljava/lang/Object;

    .line 39
    .line 40
    sput v5, Ll52;->ρ:I

    .line 41
    .line 42
    sput-wide v3, Ll52;->σ:J

    .line 43
    .line 44
    sput-wide v3, Ll52;->τ:J

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    sget-object v2, Lm52;->α:Lm52;

    .line 48
    .line 49
    sput-wide v9, Lm52;->ι:J

    .line 50
    .line 51
    sput-object v1, Lm52;->η:Ljava/util/Set;

    .line 52
    .line 53
    sput-object v1, Lm52;->θ:Ljava/util/Set;

    .line 54
    .line 55
    sput-object v8, Lm52;->κ:Ljava/lang/String;

    .line 56
    .line 57
    sput-object v0, Lm52;->λ:Ljava/lang/Object;

    .line 58
    .line 59
    sput-object v1, Lm52;->μ:Ljava/util/Set;

    .line 60
    .line 61
    sput v7, Lm52;->ν:I

    .line 62
    .line 63
    sput-object v8, Lm52;->ξ:Ljava/lang/String;

    .line 64
    .line 65
    sput-object v6, Lm52;->ο:Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    sput-object v0, Lm52;->π:Ljava/lang/Object;

    .line 68
    .line 69
    sput v5, Lm52;->ρ:I

    .line 70
    .line 71
    sput-wide v3, Lm52;->σ:J

    .line 72
    .line 73
    sput-wide v3, Lm52;->τ:J

    .line 74
    .line 75
    return-void
.end method

.method public static ν()V
    .locals 3

    .line 1
    sget-boolean v0, Lv71;->α:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Ll52;->α:Ll52;

    .line 6
    .line 7
    invoke-static {}, Ll52;->δ()V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ll52;->σ()V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ll52;->π:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroid/view/View;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    invoke-static {v1}, Ll52;->α(Ljava/util/List;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    sget-object v0, Lm52;->α:Lm52;

    .line 59
    .line 60
    invoke-static {}, Lm52;->δ()V

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lm52;->σ()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lm52;->π:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance v1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, Landroid/view/View;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    invoke-static {v1}, Lm52;->α(Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    return-void
.end method

.method public static ξ(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 5

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-string v3, "value"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_1

    .line 21
    .line 22
    :sswitch_0
    const-string v2, "float"

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_1

    .line 31
    .line 32
    :cond_0
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    invoke-virtual {p2, v3, v0, v1}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    double-to-float p2, v0

    .line 39
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    return v4

    .line 43
    :sswitch_1
    const-string v2, "boolean"

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p2, v3, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    return v4

    .line 60
    :sswitch_2
    const-string v2, "long"

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const-wide/16 v0, 0x0

    .line 70
    .line 71
    invoke-virtual {p2, v3, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-interface {p0, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 76
    .line 77
    .line 78
    return v4

    .line 79
    :sswitch_3
    const-string v2, "int"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {p2, v3, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    return v4

    .line 96
    :sswitch_4
    const-string v2, "string"

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const-string v0, ""

    .line 106
    .line 107
    invoke-virtual {p2, v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 112
    .line 113
    .line 114
    return v4

    .line 115
    :sswitch_5
    const-string v2, "string_set"

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_5

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    if-nez p2, :cond_6

    .line 129
    .line 130
    new-instance p2, Lorg/json/JSONArray;

    .line 131
    .line 132
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 133
    .line 134
    .line 135
    :cond_6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 136
    .line 137
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    :goto_0
    if-ge v1, v2, :cond_7

    .line 145
    .line 146
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    add-int/lit8 v1, v1, 0x1

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_7
    invoke-interface {p0, p1, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 157
    .line 158
    .line 159
    return v4

    .line 160
    :cond_8
    :goto_1
    return v1

    .line 161
    :sswitch_data_0
    .sparse-switch
        -0x5dbe24cc -> :sswitch_5
        -0x352a9fef -> :sswitch_4
        0x197ef -> :sswitch_3
        0x32c67c -> :sswitch_2
        0x3db6c28 -> :sswitch_1
        0x5d0225c -> :sswitch_0
    .end sparse-switch
.end method

.method public static final π(Landroidx/compose/ui/platform/AndroidViewsHandler;I)Landroidx/compose/ui/viewinterop/AndroidViewHolder;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidViewsHandler;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, Ljava/util/Map$Entry;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lyp0;

    .line 34
    .line 35
    iget v2, v2, Lyp0;->ζ:I

    .line 36
    .line 37
    if-ne v2, p1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v1

    .line 41
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder;

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_2
    return-object v1
.end method

.method public static ρ(Landroid/app/Activity;ILjava/lang/String;Ljava/util/List;La80;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Ls71;

    .line 33
    .line 34
    iget-object v3, v3, Ls71;->α:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    const-string v0, "\u7559\u7a7a"

    .line 51
    .line 52
    invoke-virtual {p3, v0}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ls71;

    .line 70
    .line 71
    iget-boolean v3, v2, Ls71;->ζ:Z

    .line 72
    .line 73
    iget-object v2, v2, Ls71;->β:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    const-string v3, " \u00b7 \u5185\u6d4b"

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :cond_2
    invoke-virtual {p3, v2}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {p3}, Lyh;->μ(Lzt0;)Lzt0;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/4 v2, 0x0

    .line 96
    move v3, v2

    .line 97
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_5

    .line 102
    .line 103
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ls71;

    .line 108
    .line 109
    iget-object v4, v4, Ls71;->α:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    const/4 v3, -0x1

    .line 122
    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    const/4 v0, 0x0

    .line 127
    if-ltz v3, :cond_6

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_6
    move-object p2, v0

    .line 131
    :goto_4
    if-eqz p2, :cond_7

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    add-int/lit8 p2, p2, 0x1

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_7
    move p2, v2

    .line 141
    :goto_5
    new-instance v3, Landroid/app/AlertDialog$Builder;

    .line 142
    .line 143
    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    new-instance p0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v4, "\u8bbe\u7f6e\u7b2c "

    .line 149
    .line 150
    invoke-direct {p0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string p1, " \u4e2a\u5feb\u6377\u6309\u94ae"

    .line 157
    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v3, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    new-array p1, v2, [Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p3, p1}, Lzt0;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, [Ljava/lang/CharSequence;

    .line 176
    .line 177
    new-instance p3, Lbc0;

    .line 178
    .line 179
    const/4 v2, 0x4

    .line 180
    invoke-direct {p3, p4, v2, v1}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    const-string p1, "\u53d6\u6d88"

    .line 188
    .line 189
    invoke-virtual {p0, p1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public static final σ(I)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "android.widget.Button"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p0, v0, :cond_1

    .line 8
    .line 9
    const-string p0, "android.widget.CheckBox"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const/4 v0, 0x3

    .line 13
    if-ne p0, v0, :cond_2

    .line 14
    .line 15
    const-string p0, "android.widget.RadioButton"

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_2
    const/4 v0, 0x5

    .line 19
    if-ne p0, v0, :cond_3

    .line 20
    .line 21
    const-string p0, "android.widget.ImageView"

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_3
    const/4 v0, 0x6

    .line 25
    if-ne p0, v0, :cond_4

    .line 26
    .line 27
    const-string p0, "android.widget.Spinner"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_4
    const/4 v0, 0x7

    .line 31
    if-ne p0, v0, :cond_5

    .line 32
    .line 33
    const-string p0, "android.widget.NumberPicker"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public static final τ(J)D
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    ushr-long v0, p0, v0

    .line 4
    .line 5
    long-to-double v0, v0

    .line 6
    const/16 v2, 0x800

    .line 7
    .line 8
    int-to-double v2, v2

    .line 9
    mul-double/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x7ff

    .line 11
    .line 12
    and-long/2addr p0, v2

    .line 13
    long-to-double p0, p0

    .line 14
    add-double/2addr v0, p0

    .line 15
    return-wide v0
.end method

.method public static final υ(J)Ljava/lang/String;
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Ljx0;->λ(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const/4 v0, 0x1

    .line 21
    ushr-long v2, p0, v0

    .line 22
    .line 23
    int-to-long v4, v1

    .line 24
    div-long/2addr v2, v4

    .line 25
    shl-long/2addr v2, v0

    .line 26
    mul-long v6, v2, v4

    .line 27
    .line 28
    sub-long/2addr p0, v6

    .line 29
    cmp-long v0, p0, v4

    .line 30
    .line 31
    if-ltz v0, :cond_1

    .line 32
    .line 33
    sub-long/2addr p0, v4

    .line 34
    const-wide/16 v4, 0x1

    .line 35
    .line 36
    add-long/2addr v2, v4

    .line 37
    :cond_1
    invoke-static {v1}, Ljx0;->λ(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Ljx0;->λ(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1, v1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method


# virtual methods
.method public abstract β()V
.end method

.method public abstract ο(Lγ;)V
.end method

.method public abstract φ()V
.end method
