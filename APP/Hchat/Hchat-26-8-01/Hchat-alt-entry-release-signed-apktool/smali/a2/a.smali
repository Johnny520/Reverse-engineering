.class public La2/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/d;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 23
    iput p1, p0, La2/a;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ld1/c0;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, La2/a;->g:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    iput v0, p0, La2/a;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "Conditions list can\'t be empty"

    .line 16
    .line 17
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1
.end method

.method public static A(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, La/a;->E()Luf/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-lt v2, v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Ltf/m;->p1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const/4 v3, 0x0

    .line 49
    :goto_1
    if-eqz v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 55
    .line 56
    goto :goto_0
.end method

.method public static B(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-lt v2, v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-lez v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method public static C(Ljava/lang/String;)Ljava/util/List;
    .locals 19

    .line 1
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    move v4, v3

    .line 27
    :goto_0
    if-lt v4, v2, :cond_1

    .line 28
    .line 29
    return-object v1

    .line 30
    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    if-eqz v5, :cond_4

    .line 35
    .line 36
    const-string v6, "id"

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    new-instance v8, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v6, "_"

    .line 61
    .line 62
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :cond_2
    move-object v8, v6

    .line 73
    const-string v6, "name"

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_3

    .line 84
    .line 85
    add-int/lit8 v6, v4, 0x1

    .line 86
    .line 87
    new-instance v7, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    const-string v9, "\u6a21\u677f "

    .line 93
    .line 94
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    :cond_3
    move-object v9, v6

    .line 105
    const-string v6, "enabled"

    .line 106
    .line 107
    const/4 v7, 0x1

    .line 108
    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    const-string v6, "mode"

    .line 113
    .line 114
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 115
    .line 116
    .line 117
    move-result v11

    .line 118
    const-string v6, "targets"

    .line 119
    .line 120
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const-string v6, "targetGroupMembers"

    .line 128
    .line 129
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const-string v6, "excludes"

    .line 137
    .line 138
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v14

    .line 142
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const-string v6, "excludeGroupMembers"

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v6, "typeAll"

    .line 155
    .line 156
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 157
    .line 158
    .line 159
    move-result v16

    .line 160
    const-string v6, "types"

    .line 161
    .line 162
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    invoke-static {v6}, La2/a;->D(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    move-result-object v17

    .line 170
    const-string v6, "textKeywords"

    .line 171
    .line 172
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v18

    .line 176
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v7, Laa/h;

    .line 180
    .line 181
    invoke-direct/range {v7 .. v18}, Laa/h;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    .line 186
    .line 187
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :catchall_0
    :goto_1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 192
    .line 193
    return-object v0
.end method

.method public static D(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-lt v2, v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-lez v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method public static E(Lba/a;ZZ)Lba/n;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lba/n;->values()[Lba/n;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    if-ge v3, v1, :cond_3

    .line 12
    .line 13
    aget-object v4, v0, v3

    .line 14
    .line 15
    iget-object v5, v4, Lba/n;->i:Lba/a;

    .line 16
    .line 17
    if-ne v5, p0, :cond_1

    .line 18
    .line 19
    iget-boolean v5, v4, Lba/n;->k:Z

    .line 20
    .line 21
    if-ne v5, p2, :cond_1

    .line 22
    .line 23
    sget-object v5, Lba/a;->k:Lba/a;

    .line 24
    .line 25
    if-eq p0, v5, :cond_0

    .line 26
    .line 27
    iget-boolean v5, v4, Lba/n;->j:Z

    .line 28
    .line 29
    if-ne v5, p1, :cond_1

    .line 30
    .line 31
    :cond_0
    const/4 v5, 0x1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v2

    .line 34
    :goto_1
    if-eqz v5, :cond_2

    .line 35
    .line 36
    return-object v4

    .line 37
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const-string p0, "Array contains no element matching the predicate."

    .line 41
    .line 42
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public static F(JILjava/util/Set;J)J
    .locals 17

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    cmp-long v6, v0, v4

    .line 13
    .line 14
    if-gtz v6, :cond_0

    .line 15
    .line 16
    return-wide v4

    .line 17
    :cond_0
    if-nez v2, :cond_1

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_1
    const/4 v4, 0x2

    .line 21
    if-ne v2, v4, :cond_4

    .line 22
    .line 23
    move-object v5, v3

    .line 24
    check-cast v5, Ljava/lang/Iterable;

    .line 25
    .line 26
    new-instance v6, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/4 v8, 0x7

    .line 40
    if-eqz v7, :cond_3

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    move-object v9, v7

    .line 47
    check-cast v9, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    const/4 v11, 0x3

    .line 58
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    const/4 v12, 0x4

    .line 63
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    const/4 v13, 0x5

    .line 68
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v13

    .line 72
    const/4 v14, 0x6

    .line 73
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v14

    .line 77
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v15

    .line 81
    const/4 v8, 0x1

    .line 82
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-static {v8}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    invoke-static {v6}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    move-object v5, v4

    .line 113
    check-cast v5, Ljava/util/Collection;

    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_4

    .line 120
    .line 121
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v8}, Ljava/util/Calendar;->get(I)I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    if-nez v5, :cond_4

    .line 141
    .line 142
    invoke-static {v0, v1, v2, v4}, La2/a;->b(JILjava/util/Set;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    :cond_4
    const/4 v4, 0x0

    .line 147
    :goto_1
    cmp-long v5, v0, p4

    .line 148
    .line 149
    if-gtz v5, :cond_5

    .line 150
    .line 151
    const/16 v5, 0x190

    .line 152
    .line 153
    if-ge v4, v5, :cond_5

    .line 154
    .line 155
    invoke-static {v0, v1, v2, v3}, La2/a;->b(JILjava/util/Set;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    add-int/lit8 v4, v4, 0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    return-wide v0
.end method

.method public static G(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    const-string v1, "\r"

    .line 4
    .line 5
    const-string v2, "|"

    .line 6
    .line 7
    const-string v3, ","

    .line 8
    .line 9
    const-string v4, "\uff0c"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v1

    .line 68
    check-cast v2, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-lez v2, :cond_2

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const/4 v2, 0x0

    .line 79
    :goto_2
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    return-object p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "group_member"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "contact"

    .line 11
    .line 12
    :goto_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "|"

    .line 21
    .line 22
    invoke-static {v0, p1, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static b(JILjava/util/Set;)J
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p0, v0

    .line 7
    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    return-wide v0

    .line 11
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x5

    .line 19
    const/4 p1, 0x1

    .line 20
    if-eq p2, p1, :cond_6

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-eq p2, v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_1
    check-cast p3, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance p2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v3, 0x7

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    move-object v4, v2

    .line 50
    check-cast v4, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const/4 v6, 0x3

    .line 61
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    const/4 v7, 0x4

    .line 66
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    const/4 v9, 0x6

    .line 75
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    filled-new-array/range {v5 .. v11}, [Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-static {v3}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    invoke-static {p2}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-eqz p3, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->add(II)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    const/16 p3, 0xe

    .line 124
    .line 125
    :cond_5
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->add(II)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 p3, p3, -0x1

    .line 129
    .line 130
    if-lez p3, :cond_7

    .line 131
    .line 132
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-interface {p2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_5

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    invoke-virtual {v0, p0, p1}, Ljava/util/Calendar;->add(II)V

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 151
    .line 152
    .line 153
    move-result-wide p0

    .line 154
    return-wide p0
.end method

.method public static d(ZZ)Laa/b;
    .locals 11

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "\u9ed8\u8ba4\u516c\u4f17\u53f7\u89c4\u5219"

    .line 4
    .line 5
    :goto_0
    move-object v3, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    if-eqz p0, :cond_1

    .line 8
    .line 9
    const-string v0, "\u9ed8\u8ba4\u7fa4\u804a\u89c4\u5219"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const-string v0, "\u9ed8\u8ba4\u79c1\u804a\u89c4\u5219"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    new-instance v1, Laa/b;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const-string v10, ""

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    sget-object v6, Ltf/v;->g:Ltf/v;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    move-object v9, v6

    .line 25
    move v2, p0

    .line 26
    move v4, p1

    .line 27
    invoke-direct/range {v1 .. v10}, Laa/b;-><init>(ZLjava/lang/String;ZZLjava/util/Set;ZZLjava/util/Set;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public static e(Ljava/util/List;)Ljava/lang/String;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v4, "contact"

    .line 23
    .line 24
    const-string v5, "group_member"

    .line 25
    .line 26
    if-eqz v3, :cond_13

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Laa/a;

    .line 33
    .line 34
    iget-object v6, v3, Laa/a;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v6, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_0

    .line 41
    .line 42
    move-object v9, v5

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    move-object v9, v4

    .line 45
    :goto_1
    iget-object v4, v3, Laa/a;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v9, v4}, La2/a;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    if-eqz v10, :cond_12

    .line 52
    .line 53
    iget-object v4, v3, Laa/a;->f:Ljava/lang/String;

    .line 54
    .line 55
    const-string v5, "exclude"

    .line 56
    .line 57
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    :goto_2
    move-object v13, v5

    .line 64
    goto :goto_3

    .line 65
    :cond_1
    const-string v5, "block"

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :goto_3
    invoke-static {v9, v10}, La2/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v1, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, Laa/a;

    .line 77
    .line 78
    iget-object v5, v3, Laa/a;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-eqz v6, :cond_3

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    iget-object v5, v4, Laa/a;->d:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_2
    move-object v5, v10

    .line 94
    :cond_3
    :goto_4
    move-object v11, v5

    .line 95
    iget-boolean v12, v3, Laa/a;->e:Z

    .line 96
    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    iget-object v6, v4, Laa/a;->g:Ljava/util/Set;

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_4
    const/4 v6, 0x0

    .line 103
    :goto_5
    sget-object v7, Ltf/v;->g:Ltf/v;

    .line 104
    .line 105
    if-nez v6, :cond_5

    .line 106
    .line 107
    move-object v6, v7

    .line 108
    :cond_5
    iget-object v14, v3, Laa/a;->g:Ljava/util/Set;

    .line 109
    .line 110
    check-cast v14, Ljava/lang/Iterable;

    .line 111
    .line 112
    new-instance v15, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    :cond_6
    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v16

    .line 125
    if-eqz v16, :cond_7

    .line 126
    .line 127
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    move-object/from16 v16, v5

    .line 132
    .line 133
    check-cast v16, Ljava/lang/String;

    .line 134
    .line 135
    invoke-static/range {v16 .. v16}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v16

    .line 139
    if-nez v16, :cond_6

    .line 140
    .line 141
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    invoke-static {v6, v15}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    iget-boolean v5, v3, Laa/a;->h:Z

    .line 150
    .line 151
    const/4 v15, 0x1

    .line 152
    if-nez v5, :cond_9

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    iget-boolean v5, v4, Laa/a;->h:Z

    .line 157
    .line 158
    if-ne v5, v15, :cond_8

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_8
    const/4 v5, 0x0

    .line 162
    goto :goto_8

    .line 163
    :cond_9
    :goto_7
    move v5, v15

    .line 164
    :goto_8
    iget-boolean v6, v3, Laa/a;->i:Z

    .line 165
    .line 166
    if-nez v6, :cond_b

    .line 167
    .line 168
    if-eqz v4, :cond_a

    .line 169
    .line 170
    iget-boolean v6, v4, Laa/a;->i:Z

    .line 171
    .line 172
    if-ne v6, v15, :cond_a

    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_a
    const/16 v16, 0x0

    .line 176
    .line 177
    goto :goto_a

    .line 178
    :cond_b
    :goto_9
    move/from16 v16, v15

    .line 179
    .line 180
    :goto_a
    if-eqz v4, :cond_c

    .line 181
    .line 182
    iget-object v6, v4, Laa/a;->j:Ljava/util/Set;

    .line 183
    .line 184
    goto :goto_b

    .line 185
    :cond_c
    const/4 v6, 0x0

    .line 186
    :goto_b
    if-nez v6, :cond_d

    .line 187
    .line 188
    goto :goto_c

    .line 189
    :cond_d
    move-object v7, v6

    .line 190
    :goto_c
    iget-object v6, v3, Laa/a;->j:Ljava/util/Set;

    .line 191
    .line 192
    check-cast v6, Ljava/lang/Iterable;

    .line 193
    .line 194
    new-instance v15, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v17

    .line 207
    if-eqz v17, :cond_f

    .line 208
    .line 209
    move-object/from16 v19, v2

    .line 210
    .line 211
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    move-object/from16 v17, v2

    .line 216
    .line 217
    check-cast v17, Ljava/lang/String;

    .line 218
    .line 219
    invoke-static/range {v17 .. v17}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v17

    .line 223
    if-nez v17, :cond_e

    .line 224
    .line 225
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_e
    move-object/from16 v2, v19

    .line 229
    .line 230
    goto :goto_d

    .line 231
    :cond_f
    move-object/from16 v19, v2

    .line 232
    .line 233
    invoke-static {v7, v15}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 234
    .line 235
    .line 236
    move-result-object v17

    .line 237
    iget-object v2, v3, Laa/a;->k:Ljava/lang/String;

    .line 238
    .line 239
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_11

    .line 244
    .line 245
    if-eqz v4, :cond_10

    .line 246
    .line 247
    iget-object v2, v4, Laa/a;->k:Ljava/lang/String;

    .line 248
    .line 249
    goto :goto_e

    .line 250
    :cond_10
    const/4 v2, 0x0

    .line 251
    :goto_e
    if-nez v2, :cond_11

    .line 252
    .line 253
    const-string v2, ""

    .line 254
    .line 255
    :cond_11
    move-object/from16 v18, v2

    .line 256
    .line 257
    new-instance v7, Laa/a;

    .line 258
    .line 259
    move v15, v5

    .line 260
    invoke-direct/range {v7 .. v18}, Laa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;ZZLjava/util/Set;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    goto :goto_f

    .line 267
    :cond_12
    move-object/from16 v19, v2

    .line 268
    .line 269
    :goto_f
    move-object/from16 v2, v19

    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_13
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    check-cast v1, Ljava/lang/Iterable;

    .line 281
    .line 282
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_18

    .line 295
    .line 296
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Laa/a;

    .line 301
    .line 302
    new-instance v3, Lorg/json/JSONObject;

    .line 303
    .line 304
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 305
    .line 306
    .line 307
    iget-object v6, v2, Laa/a;->a:Ljava/lang/String;

    .line 308
    .line 309
    iget-object v7, v2, Laa/a;->c:Ljava/lang/String;

    .line 310
    .line 311
    iget-object v8, v2, Laa/a;->b:Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_15

    .line 318
    .line 319
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v6

    .line 329
    if-eqz v6, :cond_14

    .line 330
    .line 331
    move-object v6, v5

    .line 332
    goto :goto_11

    .line 333
    :cond_14
    move-object v6, v4

    .line 334
    :goto_11
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    const-string v10, "|"

    .line 343
    .line 344
    invoke-static {v6, v10, v9}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    :cond_15
    const-string v9, "id"

    .line 349
    .line 350
    invoke-virtual {v3, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 351
    .line 352
    .line 353
    const-string v6, "targetType"

    .line 354
    .line 355
    invoke-virtual {v3, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 356
    .line 357
    .line 358
    const-string v6, "targetId"

    .line 359
    .line 360
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 361
    .line 362
    .line 363
    const-string v6, "label"

    .line 364
    .line 365
    iget-object v7, v2, Laa/a;->d:Ljava/lang/String;

    .line 366
    .line 367
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 368
    .line 369
    .line 370
    const-string v6, "enabled"

    .line 371
    .line 372
    iget-boolean v7, v2, Laa/a;->e:Z

    .line 373
    .line 374
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 375
    .line 376
    .line 377
    const-string v6, "action"

    .line 378
    .line 379
    iget-object v7, v2, Laa/a;->f:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 382
    .line 383
    .line 384
    new-instance v6, Lorg/json/JSONArray;

    .line 385
    .line 386
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 387
    .line 388
    .line 389
    iget-object v7, v2, Laa/a;->g:Ljava/util/Set;

    .line 390
    .line 391
    check-cast v7, Ljava/lang/Iterable;

    .line 392
    .line 393
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v8

    .line 401
    if-eqz v8, :cond_16

    .line 402
    .line 403
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    check-cast v8, Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 410
    .line 411
    .line 412
    goto :goto_12

    .line 413
    :cond_16
    const-string v7, "templateIds"

    .line 414
    .line 415
    invoke-virtual {v3, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 416
    .line 417
    .line 418
    const-string v6, "customRules"

    .line 419
    .line 420
    iget-boolean v7, v2, Laa/a;->h:Z

    .line 421
    .line 422
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 423
    .line 424
    .line 425
    const-string v6, "typeAll"

    .line 426
    .line 427
    iget-boolean v7, v2, Laa/a;->i:Z

    .line 428
    .line 429
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 430
    .line 431
    .line 432
    new-instance v6, Lorg/json/JSONArray;

    .line 433
    .line 434
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 435
    .line 436
    .line 437
    iget-object v7, v2, Laa/a;->j:Ljava/util/Set;

    .line 438
    .line 439
    check-cast v7, Ljava/lang/Iterable;

    .line 440
    .line 441
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v8

    .line 449
    if-eqz v8, :cond_17

    .line 450
    .line 451
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    check-cast v8, Ljava/lang/String;

    .line 456
    .line 457
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 458
    .line 459
    .line 460
    goto :goto_13

    .line 461
    :cond_17
    const-string v7, "types"

    .line 462
    .line 463
    invoke-virtual {v3, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 464
    .line 465
    .line 466
    const-string v6, "textKeywords"

    .line 467
    .line 468
    iget-object v2, v2, Laa/a;->k:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v3, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 474
    .line 475
    .line 476
    goto/16 :goto_10

    .line 477
    .line 478
    :cond_18
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    return-object v0
.end method

.method public static f(Laa/b;ZZ)Ljava/lang/String;
    .locals 12

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-string v0, "\u9ed8\u8ba4\u516c\u4f17\u53f7\u89c4\u5219"

    .line 4
    .line 5
    :goto_0
    move-object v3, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const-string v0, "\u9ed8\u8ba4\u7fa4\u804a\u89c4\u5219"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const-string v0, "\u9ed8\u8ba4\u79c1\u804a\u89c4\u5219"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_1
    const/4 v10, 0x0

    .line 16
    const/16 v11, 0x1f8

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move v2, p1

    .line 25
    move v4, p2

    .line 26
    invoke-static/range {v1 .. v11}, Laa/b;->a(Laa/b;ZLjava/lang/String;ZZLjava/util/Set;ZZLjava/util/Set;Ljava/lang/String;I)Laa/b;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string p2, "enabled"

    .line 36
    .line 37
    iget-boolean v0, p0, Laa/b;->d:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    new-instance p2, Lorg/json/JSONArray;

    .line 43
    .line 44
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Laa/b;->e:Ljava/util/Set;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const-string v0, "templateIds"

    .line 72
    .line 73
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    const-string p2, "customRules"

    .line 77
    .line 78
    iget-boolean v0, p0, Laa/b;->f:Z

    .line 79
    .line 80
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string p2, "typeAll"

    .line 84
    .line 85
    iget-boolean v0, p0, Laa/b;->g:Z

    .line 86
    .line 87
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    new-instance p2, Lorg/json/JSONArray;

    .line 91
    .line 92
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Laa/b;->h:Ljava/util/Set;

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Iterable;

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_3

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const-string v0, "types"

    .line 120
    .line 121
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    const-string p2, "textKeywords"

    .line 125
    .line 126
    iget-object p0, p0, Laa/b;->i:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p1, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    return-object p0
.end method

.method public static g(Ljava/util/List;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Laa/h;

    .line 24
    .line 25
    new-instance v2, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "id"

    .line 31
    .line 32
    iget-object v4, v1, Laa/h;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v3, "name"

    .line 38
    .line 39
    iget-object v4, v1, Laa/h;->b:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string v3, "enabled"

    .line 45
    .line 46
    iget-boolean v4, v1, Laa/h;->c:Z

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    const-string v3, "mode"

    .line 52
    .line 53
    iget v4, v1, Laa/h;->d:I

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    const-string v3, "targets"

    .line 59
    .line 60
    iget-object v4, v1, Laa/h;->e:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 63
    .line 64
    .line 65
    const-string v3, "targetGroupMembers"

    .line 66
    .line 67
    iget-object v4, v1, Laa/h;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    const-string v3, "excludes"

    .line 73
    .line 74
    iget-object v4, v1, Laa/h;->g:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    const-string v3, "excludeGroupMembers"

    .line 80
    .line 81
    iget-object v4, v1, Laa/h;->h:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    const-string v3, "typeAll"

    .line 87
    .line 88
    iget-boolean v4, v1, Laa/h;->i:Z

    .line 89
    .line 90
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    new-instance v3, Lorg/json/JSONArray;

    .line 94
    .line 95
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object v4, v1, Laa/h;->j:Ljava/util/Set;

    .line 99
    .line 100
    check-cast v4, Ljava/lang/Iterable;

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_0

    .line 111
    .line 112
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_0
    const-string v4, "types"

    .line 123
    .line 124
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 125
    .line 126
    .line 127
    const-string v3, "textKeywords"

    .line 128
    .line 129
    iget-object v1, v1, Laa/h;->k:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    return-object p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/ClassLoader;)Z
    .locals 9

    .line 1
    const-string v0, "[Hchat:MiniProgramVideoAds] \u5b89\u88c5\u5c0f\u7a0b\u5e8f\u89c6\u9891\u5e7f\u544a Hook \u5931\u8d25: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    new-instance v4, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "@"

    .line 28
    .line 29
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sget-object v3, Lga/a;->e:Ljava/util/HashSet;

    .line 40
    .line 41
    monitor-enter v3

    .line 42
    :try_start_0
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    monitor-exit v3

    .line 49
    const/4 p0, 0x1

    .line 50
    return p0

    .line 51
    :cond_1
    :try_start_1
    const-string v4, "com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding"

    .line 52
    .line 53
    invoke-static {v4, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    const-string p0, "[Hchat:MiniProgramVideoAds] \u672a\u627e\u5230\u5c0f\u7a0b\u5e8f JS Bridge: com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding"

    .line 60
    .line 61
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    monitor-exit v3

    .line 65
    return v1

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    :try_start_2
    const-string v4, "subscribeHandler"

    .line 69
    .line 70
    const-class v5, Ljava/lang/String;

    .line 71
    .line 72
    const-class v6, Ljava/lang/String;

    .line 73
    .line 74
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-class v8, Ljava/lang/String;

    .line 80
    .line 81
    filled-new-array {v5, v6, v7, v8}, [Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {p1, v4, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-static {v4, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 101
    if-nez v4, :cond_3

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    :try_start_3
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 105
    .line 106
    new-instance v4, Lea/b;

    .line 107
    .line 108
    const/4 v5, 0x2

    .line 109
    invoke-direct {v4, p0, v5}, Lea/b;-><init>(Landroid/content/Context;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p1, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :catchall_1
    move-exception p0

    .line 122
    :try_start_4
    new-instance p1, Lsf/f;

    .line 123
    .line 124
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object p0, p1

    .line 128
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-nez p1, :cond_4

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 155
    .line 156
    :goto_1
    check-cast p0, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 162
    monitor-exit v3

    .line 163
    return p0

    .line 164
    :cond_5
    :goto_2
    :try_start_5
    const-string p0, "[Hchat:MiniProgramVideoAds] \u672a\u627e\u5230 subscribeHandler(String,String,int,String)"

    .line 165
    .line 166
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 167
    .line 168
    .line 169
    monitor-exit v3

    .line 170
    return v1

    .line 171
    :goto_3
    monitor-exit v3

    .line 172
    throw p0
.end method

.method public static m(Ljava/util/List;)Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Laa/h;

    .line 21
    .line 22
    iget-object v2, v1, Laa/h;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2}, La2/a;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const-string v4, "block"

    .line 37
    .line 38
    const-string v5, "contact"

    .line 39
    .line 40
    const-string v6, "group_member"

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3}, La2/a;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    move-object v5, v6

    .line 57
    :cond_1
    invoke-static {v0, v5, v3, v4, v1}, La2/a;->n(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa/h;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-object v2, v1, Laa/h;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v2}, La2/a;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v0, v6, v3, v4, v1}, La2/a;->n(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa/h;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iget-object v2, v1, Laa/h;->g:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v2}, La2/a;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    const-string v4, "exclude"

    .line 102
    .line 103
    if-eqz v3, :cond_5

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v3}, La2/a;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    if-eqz v7, :cond_4

    .line 116
    .line 117
    move-object v7, v6

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v7, v5

    .line 120
    :goto_3
    invoke-static {v0, v7, v3, v4, v1}, La2/a;->n(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa/h;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    iget-object v2, v1, Laa/h;->h:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2}, La2/a;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_0

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v0, v6, v3, v4, v1}, La2/a;->n(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa/h;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    check-cast p0, Ljava/lang/Iterable;

    .line 158
    .line 159
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0
.end method

.method public static final n(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Laa/h;)V
    .locals 9

    .line 1
    const-string v0, "group_member"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :goto_0
    move-object v3, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v0, "contact"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :goto_1
    invoke-static {v3, p2}, La2/a;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-eqz v4, :cond_6

    .line 19
    .line 20
    invoke-static {v3, v4}, La2/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Laa/a;

    .line 29
    .line 30
    new-instance v1, Laa/a;

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object v0, p2, Laa/a;->a:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    move-object v2, v0

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move-object v2, p1

    .line 41
    :goto_2
    if-eqz p2, :cond_2

    .line 42
    .line 43
    iget-object v0, p2, Laa/a;->d:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    move-object v5, v0

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    move-object v5, v4

    .line 50
    :goto_3
    if-eqz p2, :cond_3

    .line 51
    .line 52
    iget-boolean v0, p2, Laa/a;->e:Z

    .line 53
    .line 54
    :goto_4
    move v6, v0

    .line 55
    goto :goto_5

    .line 56
    :cond_3
    const/4 v0, 0x1

    .line 57
    goto :goto_4

    .line 58
    :goto_5
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iget-object p2, p2, Laa/a;->g:Ljava/util/Set;

    .line 61
    .line 62
    goto :goto_6

    .line 63
    :cond_4
    const/4 p2, 0x0

    .line 64
    :goto_6
    if-nez p2, :cond_5

    .line 65
    .line 66
    sget-object p2, Ltf/v;->g:Ltf/v;

    .line 67
    .line 68
    :cond_5
    iget-object p4, p4, Laa/h;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {p2, p4}, Ltf/d0;->V(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    move-object v7, p3

    .line 75
    invoke-direct/range {v1 .. v8}, Laa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :cond_6
    return-void
.end method

.method public static o(Ldb/c;)Ljava/lang/String;
    .locals 9

    .line 1
    iget v0, p0, Ldb/c;->r:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v2, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    invoke-static {p0}, La2/a;->u(Ldb/c;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    :cond_1
    move v3, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Ldb/a;

    .line 37
    .line 38
    iget v6, v5, Ldb/a;->a:I

    .line 39
    .line 40
    if-nez v6, :cond_4

    .line 41
    .line 42
    iget-object v5, v5, Ldb/a;->b:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_4

    .line 49
    .line 50
    move v5, v2

    .line 51
    goto :goto_0

    .line 52
    :cond_4
    move v5, v4

    .line 53
    :goto_0
    if-eqz v5, :cond_3

    .line 54
    .line 55
    move v3, v2

    .line 56
    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_5

    .line 61
    .line 62
    move v6, v4

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    move v6, v4

    .line 69
    :cond_6
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_9

    .line 74
    .line 75
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, Ldb/a;

    .line 80
    .line 81
    iget v7, v7, Ldb/a;->a:I

    .line 82
    .line 83
    if-ne v7, v2, :cond_7

    .line 84
    .line 85
    move v7, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_7
    move v7, v4

    .line 88
    :goto_3
    if-eqz v7, :cond_6

    .line 89
    .line 90
    add-int/lit8 v6, v6, 0x1

    .line 91
    .line 92
    if-ltz v6, :cond_8

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_8
    invoke-static {}, La/a;->P0()V

    .line 96
    .line 97
    .line 98
    throw v1

    .line 99
    :cond_9
    :goto_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    const/4 v7, 0x2

    .line 104
    if-eqz v5, :cond_a

    .line 105
    .line 106
    goto :goto_7

    .line 107
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move v5, v4

    .line 112
    :cond_b
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_e

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Ldb/a;

    .line 123
    .line 124
    iget v8, v8, Ldb/a;->a:I

    .line 125
    .line 126
    if-ne v8, v7, :cond_c

    .line 127
    .line 128
    move v8, v2

    .line 129
    goto :goto_6

    .line 130
    :cond_c
    move v8, v4

    .line 131
    :goto_6
    if-eqz v8, :cond_b

    .line 132
    .line 133
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    if-ltz v5, :cond_d

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_d
    invoke-static {}, La/a;->P0()V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_e
    move v4, v5

    .line 143
    :goto_7
    iget p0, p0, Ldb/c;->s:I

    .line 144
    .line 145
    if-eqz p0, :cond_17

    .line 146
    .line 147
    const/16 v0, 0xa

    .line 148
    .line 149
    if-eq p0, v2, :cond_14

    .line 150
    .line 151
    if-eq p0, v7, :cond_11

    .line 152
    .line 153
    const/4 v3, 0x3

    .line 154
    if-eq p0, v3, :cond_10

    .line 155
    .line 156
    const/4 v0, 0x4

    .line 157
    if-eq p0, v0, :cond_f

    .line 158
    .line 159
    const-string p0, "\u8bf7\u9009\u62e9\u670b\u53cb\u5708\u7c7b\u578b"

    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_f
    if-ne v4, v2, :cond_13

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_10
    if-gt v2, v6, :cond_16

    .line 166
    .line 167
    if-ge v6, v0, :cond_16

    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_11
    if-nez v3, :cond_12

    .line 171
    .line 172
    goto :goto_9

    .line 173
    :cond_12
    if-eq v4, v2, :cond_18

    .line 174
    .line 175
    :cond_13
    const-string p0, "\u8bf7\u9009\u62e9 1 \u4e2a\u670b\u53cb\u5708\u89c6\u9891"

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_14
    if-nez v3, :cond_15

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_15
    if-gt v2, v6, :cond_16

    .line 182
    .line 183
    if-ge v6, v0, :cond_16

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_16
    const-string p0, "\u8bf7\u9009\u62e9 1-9 \u5f20\u670b\u53cb\u5708\u56fe\u7247"

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_17
    if-eqz v3, :cond_19

    .line 190
    .line 191
    :cond_18
    :goto_8
    return-object v1

    .line 192
    :cond_19
    :goto_9
    const-string p0, "\u8bf7\u8f93\u5165\u670b\u53cb\u5708\u6587\u5b57"

    .line 193
    .line 194
    return-object p0
.end method

.method public static p()Ldb/c;
    .locals 30

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 10
    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    const/4 v4, 0x5

    .line 15
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 16
    .line 17
    .line 18
    const/16 v3, 0xd

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0xe

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    .line 27
    .line 28
    .line 29
    new-instance v5, Ldb/c;

    .line 30
    .line 31
    const/16 v3, 0x270f

    .line 32
    .line 33
    sget-object v4, Ljg/d;->g:Ljg/a;

    .line 34
    .line 35
    const/16 v6, 0x3e8

    .line 36
    .line 37
    invoke-virtual {v4, v6, v3}, Ljg/d;->c(II)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v4, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v6, "task_"

    .line 44
    .line 45
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "_"

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v12

    .line 67
    const/16 v26, 0x0

    .line 68
    .line 69
    const/16 v28, 0x0

    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    const-string v8, ""

    .line 73
    .line 74
    sget-object v9, Ltf/t;->g:Ltf/t;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    sget-object v15, Ltf/v;->g:Ltf/v;

    .line 78
    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    const/16 v18, 0x1

    .line 84
    .line 85
    const-string v19, "pending"

    .line 86
    .line 87
    const-wide/16 v20, 0x0

    .line 88
    .line 89
    const/16 v22, 0x0

    .line 90
    .line 91
    const/16 v23, 0x0

    .line 92
    .line 93
    const-string v24, ""

    .line 94
    .line 95
    const/16 v25, 0x0

    .line 96
    .line 97
    move-object v10, v9

    .line 98
    move-object v11, v9

    .line 99
    move-object/from16 v27, v9

    .line 100
    .line 101
    move-object/from16 v29, v9

    .line 102
    .line 103
    invoke-direct/range {v5 .. v29}, Ldb/c;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;)V

    .line 104
    .line 105
    .line 106
    return-object v5
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string v0, "group_member"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, La2/a;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    return-object p1
.end method

.method public static r(Ldb/c;)Ldb/c;
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, v1, Ldb/c;->r:I

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/16 v26, 0x0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object/from16 v2, v26

    .line 21
    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v2, v0

    .line 31
    :goto_1
    iget v4, v1, Ldb/c;->s:I

    .line 32
    .line 33
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const/4 v6, 0x5

    .line 38
    if-ltz v4, :cond_3

    .line 39
    .line 40
    if-ge v4, v6, :cond_3

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    move-object/from16 v5, v26

    .line 44
    .line 45
    :goto_2
    if-eqz v5, :cond_4

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    move/from16 v21, v4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move/from16 v21, v0

    .line 55
    .line 56
    :goto_3
    if-nez v2, :cond_8

    .line 57
    .line 58
    iget v4, v1, Ldb/c;->u:I

    .line 59
    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v4, :cond_6

    .line 65
    .line 66
    if-ne v4, v3, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-object/from16 v5, v26

    .line 70
    .line 71
    :cond_6
    :goto_4
    if-eqz v5, :cond_7

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    goto :goto_5

    .line 78
    :cond_7
    move v4, v0

    .line 79
    :goto_5
    move/from16 v27, v4

    .line 80
    .line 81
    goto :goto_6

    .line 82
    :cond_8
    move/from16 v27, v0

    .line 83
    .line 84
    :goto_6
    if-ne v2, v3, :cond_9

    .line 85
    .line 86
    const/16 v24, 0x0

    .line 87
    .line 88
    const v25, 0x3bffff

    .line 89
    .line 90
    .line 91
    move/from16 v20, v2

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    move v4, v3

    .line 95
    const/4 v3, 0x0

    .line 96
    move v5, v4

    .line 97
    const/4 v4, 0x0

    .line 98
    move v7, v5

    .line 99
    const/4 v5, 0x0

    .line 100
    move v8, v6

    .line 101
    const/4 v6, 0x0

    .line 102
    move v10, v7

    .line 103
    move v9, v8

    .line 104
    const-wide/16 v7, 0x0

    .line 105
    .line 106
    move v11, v9

    .line 107
    const/4 v9, 0x0

    .line 108
    move v12, v10

    .line 109
    const/4 v10, 0x0

    .line 110
    move v13, v11

    .line 111
    const/4 v11, 0x0

    .line 112
    move v14, v12

    .line 113
    const/4 v12, 0x0

    .line 114
    move v15, v13

    .line 115
    const/4 v13, 0x0

    .line 116
    move/from16 v16, v14

    .line 117
    .line 118
    const/4 v14, 0x0

    .line 119
    move/from16 v17, v15

    .line 120
    .line 121
    move/from16 v18, v16

    .line 122
    .line 123
    const-wide/16 v15, 0x0

    .line 124
    .line 125
    move/from16 v19, v17

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    move/from16 v22, v18

    .line 130
    .line 131
    const/16 v18, 0x0

    .line 132
    .line 133
    move/from16 v23, v19

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    move/from16 v28, v20

    .line 138
    .line 139
    const/16 v20, 0x0

    .line 140
    .line 141
    move/from16 v29, v22

    .line 142
    .line 143
    const/16 v22, 0x0

    .line 144
    .line 145
    move/from16 v30, v23

    .line 146
    .line 147
    const/16 v23, 0x0

    .line 148
    .line 149
    invoke-static/range {v1 .. v25}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, La2/a;->u(Ldb/c;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    :goto_7
    move-object/from16 v22, v2

    .line 158
    .line 159
    goto :goto_8

    .line 160
    :cond_9
    move/from16 v28, v2

    .line 161
    .line 162
    move/from16 v29, v3

    .line 163
    .line 164
    move/from16 v30, v6

    .line 165
    .line 166
    invoke-static {v1}, La2/a;->t(Ldb/c;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    goto :goto_7

    .line 171
    :goto_8
    invoke-static/range {v22 .. v22}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, Ldb/a;

    .line 176
    .line 177
    if-eqz v2, :cond_a

    .line 178
    .line 179
    iget v2, v2, Ldb/a;->a:I

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_a
    iget v2, v1, Ldb/c;->b:I

    .line 183
    .line 184
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-ltz v2, :cond_b

    .line 189
    .line 190
    const/16 v4, 0x9

    .line 191
    .line 192
    if-ge v2, v4, :cond_b

    .line 193
    .line 194
    move-object/from16 v26, v3

    .line 195
    .line 196
    :cond_b
    if-eqz v26, :cond_c

    .line 197
    .line 198
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    goto :goto_9

    .line 203
    :cond_c
    move v2, v0

    .line 204
    :goto_9
    const/4 v3, 0x6

    .line 205
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 206
    .line 207
    if-eqz v2, :cond_e

    .line 208
    .line 209
    if-ne v2, v3, :cond_d

    .line 210
    .line 211
    goto :goto_a

    .line 212
    :cond_d
    move-object v6, v4

    .line 213
    goto :goto_d

    .line 214
    :cond_e
    :goto_a
    new-instance v5, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-interface/range {v22 .. v22}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    :cond_f
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_10

    .line 228
    .line 229
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    move-object v8, v7

    .line 234
    check-cast v8, Ldb/a;

    .line 235
    .line 236
    iget v8, v8, Ldb/a;->a:I

    .line 237
    .line 238
    if-ne v8, v2, :cond_f

    .line 239
    .line 240
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_10
    new-instance v6, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_11

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    check-cast v7, Ldb/a;

    .line 268
    .line 269
    iget-object v7, v7, Ldb/a;->b:Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_11
    :goto_d
    if-eqz v2, :cond_16

    .line 276
    .line 277
    if-ne v2, v3, :cond_12

    .line 278
    .line 279
    goto :goto_10

    .line 280
    :cond_12
    const/16 v5, 0x8

    .line 281
    .line 282
    if-eq v2, v5, :cond_16

    .line 283
    .line 284
    new-instance v5, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-interface/range {v22 .. v22}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    :cond_13
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v8

    .line 297
    if-eqz v8, :cond_14

    .line 298
    .line 299
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    move-object v9, v8

    .line 304
    check-cast v9, Ldb/a;

    .line 305
    .line 306
    iget v9, v9, Ldb/a;->a:I

    .line 307
    .line 308
    if-ne v9, v2, :cond_13

    .line 309
    .line 310
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_14
    new-instance v7, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    :goto_f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    if-eqz v8, :cond_15

    .line 332
    .line 333
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v8

    .line 337
    check-cast v8, Ldb/a;

    .line 338
    .line 339
    iget-object v8, v8, Ldb/a;->b:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_15
    invoke-static {v7}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    goto :goto_11

    .line 354
    :cond_16
    :goto_10
    move-object v5, v4

    .line 355
    :goto_11
    invoke-static {v1}, La2/a;->v(Ldb/c;)Ljava/util/List;

    .line 356
    .line 357
    .line 358
    move-result-object v24

    .line 359
    iget-object v7, v1, Ldb/c;->q:Ljava/lang/String;

    .line 360
    .line 361
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v19

    .line 369
    invoke-static {v6}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    check-cast v7, Ljava/lang/String;

    .line 374
    .line 375
    if-nez v7, :cond_17

    .line 376
    .line 377
    const-string v7, ""

    .line 378
    .line 379
    :cond_17
    if-nez v28, :cond_1b

    .line 380
    .line 381
    iget-object v4, v1, Ldb/c;->f:Ljava/util/List;

    .line 382
    .line 383
    new-instance v8, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 390
    .line 391
    .line 392
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    :goto_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    if-eqz v9, :cond_18

    .line 401
    .line 402
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    check-cast v9, Ljava/lang/String;

    .line 407
    .line 408
    invoke-static {v9, v8}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 409
    .line 410
    .line 411
    goto :goto_12

    .line 412
    :cond_18
    new-instance v4, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v8

    .line 421
    :cond_19
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    if-eqz v9, :cond_1a

    .line 426
    .line 427
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    move-object v10, v9

    .line 432
    check-cast v10, Ljava/lang/String;

    .line 433
    .line 434
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 435
    .line 436
    .line 437
    move-result v10

    .line 438
    if-nez v10, :cond_19

    .line 439
    .line 440
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_13

    .line 444
    :cond_1a
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    :cond_1b
    iget-object v8, v1, Ldb/c;->i:Ljava/util/Set;

    .line 453
    .line 454
    check-cast v8, Ljava/lang/Iterable;

    .line 455
    .line 456
    new-instance v9, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 462
    .line 463
    .line 464
    move-result-object v8

    .line 465
    :cond_1c
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 466
    .line 467
    .line 468
    move-result v10

    .line 469
    if-eqz v10, :cond_1d

    .line 470
    .line 471
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    move-object v11, v10

    .line 476
    check-cast v11, Ljava/lang/Number;

    .line 477
    .line 478
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v11

    .line 482
    const/4 v12, 0x2

    .line 483
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v31

    .line 487
    const/4 v12, 0x3

    .line 488
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v32

    .line 492
    const/4 v12, 0x4

    .line 493
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 494
    .line 495
    .line 496
    move-result-object v33

    .line 497
    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v34

    .line 501
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 502
    .line 503
    .line 504
    move-result-object v35

    .line 505
    const/4 v12, 0x7

    .line 506
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v36

    .line 510
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v37

    .line 514
    filled-new-array/range {v31 .. v37}, [Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v12

    .line 518
    invoke-static {v12}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v11

    .line 526
    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v11

    .line 530
    if-eqz v11, :cond_1c

    .line 531
    .line 532
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    goto :goto_14

    .line 536
    :cond_1d
    invoke-static {v9}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 537
    .line 538
    .line 539
    move-result-object v10

    .line 540
    iget v3, v1, Ldb/c;->j:I

    .line 541
    .line 542
    const/16 v8, 0xe10

    .line 543
    .line 544
    invoke-static {v3, v0, v8}, Lr9/e0;->r(III)I

    .line 545
    .line 546
    .line 547
    move-result v11

    .line 548
    iget v3, v1, Ldb/c;->k:I

    .line 549
    .line 550
    invoke-static {v3, v0, v8}, Lr9/e0;->r(III)I

    .line 551
    .line 552
    .line 553
    move-result v12

    .line 554
    invoke-static/range {v24 .. v24}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    check-cast v0, Ljava/lang/Long;

    .line 559
    .line 560
    if-eqz v0, :cond_1e

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 563
    .line 564
    .line 565
    move-result-wide v8

    .line 566
    goto :goto_15

    .line 567
    :cond_1e
    const-wide/16 v8, 0x0

    .line 568
    .line 569
    :goto_15
    const/16 v18, 0x0

    .line 570
    .line 571
    const v25, 0xe881

    .line 572
    .line 573
    .line 574
    move-object v3, v7

    .line 575
    move-wide v7, v8

    .line 576
    const/4 v9, 0x0

    .line 577
    const/4 v13, 0x0

    .line 578
    const-string v14, "pending"

    .line 579
    .line 580
    const-wide/16 v15, 0x0

    .line 581
    .line 582
    const/16 v17, 0x0

    .line 583
    .line 584
    move-object/from16 v20, v6

    .line 585
    .line 586
    move-object v6, v4

    .line 587
    move-object/from16 v4, v20

    .line 588
    .line 589
    move/from16 v23, v27

    .line 590
    .line 591
    move/from16 v20, v28

    .line 592
    .line 593
    invoke-static/range {v1 .. v25}, Ldb/c;->a(Ldb/c;ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;JILjava/util/Set;IIZLjava/lang/String;JIILjava/lang/String;IILjava/util/List;ILjava/util/List;I)Ldb/c;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    return-object v0
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    const/4 v0, 0x4

    .line 10
    new-array v1, v0, [C

    .line 11
    .line 12
    fill-array-data v1, :array_0

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v4, v0, :cond_0

    .line 23
    .line 24
    aget-char v5, v1, v4

    .line 25
    .line 26
    const/4 v6, 0x6

    .line 27
    invoke-static {p0, v5, v3, v6}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    const/4 v4, 0x1

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    move-object v5, v2

    .line 62
    check-cast v5, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-lez v5, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v4, v3

    .line 72
    :goto_2
    if-eqz v4, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {v0}, Ltf/m;->D1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    add-int/2addr v0, v4

    .line 103
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_4

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    const-string v0, "/"

    .line 130
    .line 131
    invoke-static {v1, v0, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    return-object p0

    .line 136
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :array_0
    .array-data 2
        0x2fs
        0x23s
        0x3as
        -0xe6s
    .end array-data
.end method

.method public static t(Ldb/c;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldb/c;->b:I

    .line 5
    .line 6
    iget-object v1, p0, Ldb/c;->t:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_9

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object p0, p0, Ldb/c;->e:Ljava/util/List;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_9

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/String;

    .line 47
    .line 48
    new-instance v4, Ldb/a;

    .line 49
    .line 50
    invoke-direct {v4, v0, v2}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    iget-object v1, p0, Ldb/c;->d:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    iget-object p0, p0, Ldb/c;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object p0, v3

    .line 75
    :goto_2
    if-eqz p0, :cond_3

    .line 76
    .line 77
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_3
    move-object v1, p0

    .line 82
    goto :goto_4

    .line 83
    :cond_3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_4
    new-instance p0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    check-cast v2, Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v2, p0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :cond_6
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v4, v2

    .line 135
    check-cast v4, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-nez v4, :cond_6

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Ljava/lang/String;

    .line 171
    .line 172
    new-instance v4, Ldb/a;

    .line 173
    .line 174
    invoke-direct {v4, v0, v2}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_8
    move-object v1, p0

    .line 182
    :cond_9
    new-instance p0, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :cond_a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_e

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    check-cast v1, Ldb/a;

    .line 202
    .line 203
    iget v2, v1, Ldb/a;->a:I

    .line 204
    .line 205
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    if-ltz v2, :cond_b

    .line 210
    .line 211
    const/16 v5, 0x9

    .line 212
    .line 213
    if-ge v2, v5, :cond_b

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_b
    move-object v4, v3

    .line 217
    :goto_9
    if-eqz v4, :cond_c

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    goto :goto_a

    .line 224
    :cond_c
    const/4 v2, 0x0

    .line 225
    :goto_a
    iget-object v1, v1, Ldb/a;->b:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_d

    .line 240
    .line 241
    move-object v4, v3

    .line 242
    goto :goto_b

    .line 243
    :cond_d
    new-instance v4, Ldb/a;

    .line 244
    .line 245
    invoke-direct {v4, v2, v1}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :goto_b
    if-eqz v4, :cond_a

    .line 249
    .line 250
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_e
    return-object p0
.end method

.method public static u(Ldb/c;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p0, Ldb/c;->t:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, La2/a;->t(Ldb/c;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x1

    .line 23
    const/4 v5, 0x0

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v6, v2

    .line 31
    check-cast v6, Ldb/a;

    .line 32
    .line 33
    iget v6, v6, Ldb/a;->a:I

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    move v6, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move v6, v3

    .line 40
    :goto_0
    if-eqz v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    move-object v2, v5

    .line 44
    :goto_1
    check-cast v2, Ldb/a;

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    iget-object v1, v2, Ldb/a;->b:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v1, v5

    .line 62
    :goto_2
    const-string v2, ""

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    move-object v1, v2

    .line 67
    :cond_5
    new-instance v6, Ldg/n;

    .line 68
    .line 69
    const/4 v7, 0x6

    .line 70
    invoke-direct {v6, v0, v7}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    new-instance v7, Lb4/b;

    .line 74
    .line 75
    const/16 v8, 0x19

    .line 76
    .line 77
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v8, Lng/i;

    .line 81
    .line 82
    invoke-direct {v8, v6, v4, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 83
    .line 84
    .line 85
    new-instance v6, Lb4/b;

    .line 86
    .line 87
    const/16 v7, 0x1a

    .line 88
    .line 89
    invoke-direct {v6, v7}, Lb4/b;-><init>(I)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v6}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    new-instance v7, Lb4/b;

    .line 97
    .line 98
    const/16 v8, 0x1b

    .line 99
    .line 100
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 101
    .line 102
    .line 103
    new-instance v8, Lng/i;

    .line 104
    .line 105
    invoke-direct {v8, v6, v4, v7}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v8}, Lng/m;->S(Lng/j;)Lng/c;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const/16 v7, 0x9

    .line 113
    .line 114
    invoke-static {v6, v7}, Lng/m;->Z(Lng/j;I)Lng/j;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    new-instance v7, Lb4/b;

    .line 119
    .line 120
    const/16 v8, 0x1c

    .line 121
    .line 122
    invoke-direct {v7, v8}, Lb4/b;-><init>(I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6, v7}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v6}, Lng/m;->b0(Lng/j;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    const/4 v8, 0x2

    .line 142
    if-eqz v7, :cond_8

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    move-object v9, v7

    .line 149
    check-cast v9, Ldb/a;

    .line 150
    .line 151
    iget v9, v9, Ldb/a;->a:I

    .line 152
    .line 153
    if-ne v9, v8, :cond_7

    .line 154
    .line 155
    move v9, v4

    .line 156
    goto :goto_3

    .line 157
    :cond_7
    move v9, v3

    .line 158
    :goto_3
    if-eqz v9, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    move-object v7, v5

    .line 162
    :goto_4
    check-cast v7, Ldb/a;

    .line 163
    .line 164
    if-eqz v7, :cond_9

    .line 165
    .line 166
    iget-object v0, v7, Ldb/a;->b:Ljava/lang/String;

    .line 167
    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    goto :goto_5

    .line 179
    :cond_9
    move-object v0, v5

    .line 180
    :goto_5
    if-nez v0, :cond_a

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_a
    move-object v2, v0

    .line 184
    :goto_6
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_b

    .line 189
    .line 190
    invoke-static {v2}, Leh/a;->y(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    move v0, v4

    .line 197
    goto :goto_7

    .line 198
    :cond_b
    move v0, v3

    .line 199
    :goto_7
    if-eqz v0, :cond_c

    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_c
    move-object v2, v5

    .line 203
    :goto_8
    if-eqz v2, :cond_d

    .line 204
    .line 205
    new-instance v0, Ldb/a;

    .line 206
    .line 207
    invoke-direct {v0, v8, v2}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_9

    .line 211
    :cond_d
    move-object v0, v5

    .line 212
    :goto_9
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_e

    .line 217
    .line 218
    goto :goto_a

    .line 219
    :cond_e
    move-object v1, v5

    .line 220
    :goto_a
    if-eqz v1, :cond_f

    .line 221
    .line 222
    new-instance v5, Ldb/a;

    .line 223
    .line 224
    invoke-direct {v5, v3, v1}, Ldb/a;-><init>(ILjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_f
    iget p0, p0, Ldb/c;->s:I

    .line 228
    .line 229
    if-eqz p0, :cond_14

    .line 230
    .line 231
    if-eq p0, v4, :cond_13

    .line 232
    .line 233
    if-eq p0, v8, :cond_12

    .line 234
    .line 235
    const/4 v1, 0x3

    .line 236
    if-eq p0, v1, :cond_11

    .line 237
    .line 238
    const/4 v1, 0x4

    .line 239
    if-eq p0, v1, :cond_10

    .line 240
    .line 241
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 242
    .line 243
    return-object p0

    .line 244
    :cond_10
    invoke-static {v0}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    return-object p0

    .line 249
    :cond_11
    return-object v6

    .line 250
    :cond_12
    filled-new-array {v5, v0}, [Ldb/a;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-static {p0}, La/a;->z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :cond_13
    invoke-static {v5}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-static {p0, v6}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :cond_14
    invoke-static {v5}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0
.end method

.method public static v(Ldb/c;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldb/c;->v:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-wide v0, p0, Ldb/c;->g:J

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    new-instance p0, Ldg/n;

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-direct {p0, v0, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lb4/b;

    .line 29
    .line 30
    const/16 v1, 0x18

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lb4/b;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lng/i;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Lng/m;->S(Lng/j;)Lng/c;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Ltf/q;->f1(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_2

    .line 78
    .line 79
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_3
    return-object v1
.end method

.method public static w(Ljava/lang/String;)Ljava/util/List;
    .locals 21

    .line 1
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_11

    .line 8
    .line 9
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 10
    .line 11
    move-object/from16 v1, p0

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_0
    if-lt v4, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_17

    .line 47
    .line 48
    const-string v6, "targetType"

    .line 49
    .line 50
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const-string v7, "group_member"

    .line 58
    .line 59
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_2

    .line 64
    .line 65
    :goto_1
    move-object v10, v7

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    const-string v7, "contact"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :goto_2
    const-string v6, "targetId"

    .line 71
    .line 72
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-static {v10, v6}, La2/a;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    if-eqz v11, :cond_17

    .line 92
    .line 93
    const-string v6, "action"

    .line 94
    .line 95
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    const-string v8, "block"

    .line 104
    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    move-object v6, v8

    .line 108
    :cond_3
    :try_start_1
    const-string v7, "exclude"

    .line 109
    .line 110
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    const/4 v9, 0x0

    .line 115
    if-eqz v7, :cond_4

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move-object v6, v9

    .line 119
    :goto_3
    if-eqz v6, :cond_5

    .line 120
    .line 121
    move-object v14, v6

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    move-object v14, v8

    .line 124
    :goto_4
    const-string v6, "templateIds"

    .line 125
    .line 126
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-static {v6}, La2/a;->B(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    check-cast v6, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    sget-object v8, Ltf/v;->g:Ltf/v;

    .line 141
    .line 142
    const/4 v12, 0x1

    .line 143
    if-eqz v7, :cond_9

    .line 144
    .line 145
    :try_start_2
    const-string v6, "templateId"

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-lez v7, :cond_6

    .line 167
    .line 168
    move v7, v12

    .line 169
    goto :goto_5

    .line 170
    :cond_6
    const/4 v7, 0x0

    .line 171
    :goto_5
    if-eqz v7, :cond_7

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_7
    move-object v6, v9

    .line 175
    :goto_6
    if-eqz v6, :cond_8

    .line 176
    .line 177
    invoke-static {v6}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    check-cast v6, Ljava/util/Set;

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_8
    move-object v6, v8

    .line 185
    :cond_9
    :goto_7
    check-cast v6, Ljava/util/Set;

    .line 186
    .line 187
    move-object v7, v9

    .line 188
    invoke-static {v10, v11}, La2/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    check-cast v13, Laa/a;

    .line 197
    .line 198
    const-string v15, "label"

    .line 199
    .line 200
    invoke-virtual {v5, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v16

    .line 208
    if-eqz v16, :cond_b

    .line 209
    .line 210
    if-eqz v13, :cond_a

    .line 211
    .line 212
    iget-object v15, v13, Laa/a;->d:Ljava/lang/String;

    .line 213
    .line 214
    if-eqz v15, :cond_a

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_a
    move-object v15, v11

    .line 218
    :cond_b
    :goto_8
    const-string v3, "enabled"

    .line 219
    .line 220
    if-eqz v13, :cond_c

    .line 221
    .line 222
    iget-boolean v12, v13, Laa/a;->e:Z

    .line 223
    .line 224
    :cond_c
    invoke-virtual {v5, v3, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v13, :cond_d

    .line 229
    .line 230
    iget-object v12, v13, Laa/a;->g:Ljava/util/Set;

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_d
    move-object v12, v7

    .line 234
    :goto_9
    if-nez v12, :cond_e

    .line 235
    .line 236
    move-object v12, v8

    .line 237
    :cond_e
    check-cast v6, Ljava/lang/Iterable;

    .line 238
    .line 239
    invoke-static {v12, v6}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    new-instance v12, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v16

    .line 256
    if-eqz v16, :cond_10

    .line 257
    .line 258
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    move-object/from16 v17, v7

    .line 263
    .line 264
    check-cast v17, Ljava/lang/String;

    .line 265
    .line 266
    invoke-static/range {v17 .. v17}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v17

    .line 270
    if-nez v17, :cond_f

    .line 271
    .line 272
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    :cond_f
    const/4 v7, 0x0

    .line 276
    goto :goto_a

    .line 277
    :cond_10
    invoke-static {v12}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    const-string v7, "customRules"

    .line 282
    .line 283
    if-eqz v13, :cond_11

    .line 284
    .line 285
    iget-boolean v12, v13, Laa/a;->h:Z

    .line 286
    .line 287
    goto :goto_b

    .line 288
    :cond_11
    const/4 v12, 0x0

    .line 289
    :goto_b
    invoke-virtual {v5, v7, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    const-string v12, "typeAll"

    .line 294
    .line 295
    if-eqz v13, :cond_12

    .line 296
    .line 297
    move-object/from16 v20, v0

    .line 298
    .line 299
    iget-boolean v0, v13, Laa/a;->i:Z

    .line 300
    .line 301
    goto :goto_c

    .line 302
    :cond_12
    move-object/from16 v20, v0

    .line 303
    .line 304
    const/4 v0, 0x0

    .line 305
    :goto_c
    invoke-virtual {v5, v12, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 306
    .line 307
    .line 308
    move-result v17

    .line 309
    if-eqz v13, :cond_13

    .line 310
    .line 311
    iget-object v0, v13, Laa/a;->j:Ljava/util/Set;

    .line 312
    .line 313
    goto :goto_d

    .line 314
    :cond_13
    const/4 v0, 0x0

    .line 315
    :goto_d
    if-nez v0, :cond_14

    .line 316
    .line 317
    goto :goto_e

    .line 318
    :cond_14
    move-object v8, v0

    .line 319
    :goto_e
    const-string v0, "types"

    .line 320
    .line 321
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v0}, La2/a;->D(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    check-cast v0, Ljava/lang/Iterable;

    .line 330
    .line 331
    invoke-static {v8, v0}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 332
    .line 333
    .line 334
    move-result-object v18

    .line 335
    const-string v0, "textKeywords"

    .line 336
    .line 337
    if-eqz v13, :cond_15

    .line 338
    .line 339
    iget-object v8, v13, Laa/a;->k:Ljava/lang/String;

    .line 340
    .line 341
    move-object/from16 v16, v8

    .line 342
    .line 343
    goto :goto_f

    .line 344
    :cond_15
    const/16 v16, 0x0

    .line 345
    .line 346
    :goto_f
    if-nez v16, :cond_16

    .line 347
    .line 348
    const-string v16, ""

    .line 349
    .line 350
    :cond_16
    move-object/from16 v8, v16

    .line 351
    .line 352
    invoke-virtual {v5, v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v19

    .line 356
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    new-instance v8, Laa/a;

    .line 360
    .line 361
    move v13, v3

    .line 362
    move/from16 v16, v7

    .line 363
    .line 364
    move-object v12, v15

    .line 365
    move-object v15, v6

    .line 366
    invoke-direct/range {v8 .. v19}, Laa/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Set;ZZLjava/util/Set;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-interface {v1, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 370
    .line 371
    .line 372
    goto :goto_10

    .line 373
    :cond_17
    move-object/from16 v20, v0

    .line 374
    .line 375
    :goto_10
    add-int/lit8 v4, v4, 0x1

    .line 376
    .line 377
    move-object/from16 v0, v20

    .line 378
    .line 379
    goto/16 :goto_0

    .line 380
    .line 381
    :catchall_0
    :goto_11
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 382
    .line 383
    return-object v0
.end method

.method public static x(Ljava/lang/String;ZZ)Laa/b;
    .locals 12

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, La2/a;->d(ZZ)Laa/b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, La2/a;->d(ZZ)Laa/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string p0, "enabled"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    const-string p0, "templateIds"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La2/a;->B(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/util/Collection;

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_4

    .line 45
    .line 46
    const-string p0, "templateId"

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-lez v3, :cond_1

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v3, v2

    .line 72
    :goto_0
    if-eqz v3, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 p0, 0x0

    .line 76
    :goto_1
    if-eqz p0, :cond_3

    .line 77
    .line 78
    invoke-static {p0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Ljava/util/Set;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 86
    .line 87
    :cond_4
    :goto_2
    move-object v6, p0

    .line 88
    check-cast v6, Ljava/util/Set;

    .line 89
    .line 90
    const-string p0, "customRules"

    .line 91
    .line 92
    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    const-string p0, "typeAll"

    .line 97
    .line 98
    invoke-virtual {v0, p0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    const-string p0, "types"

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, La2/a;->D(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    const-string p0, "textKeywords"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/4 v11, 0x7

    .line 122
    const/4 v2, 0x0

    .line 123
    const/4 v3, 0x0

    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-static/range {v1 .. v11}, Laa/b;->a(Laa/b;ZLjava/lang/String;ZZLjava/util/Set;ZZLjava/util/Set;Ljava/lang/String;I)Laa/b;

    .line 126
    .line 127
    .line 128
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    return-object p0

    .line 130
    :catchall_0
    invoke-static {p1, p2}, La2/a;->d(ZZ)Laa/b;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0
.end method

.method public static y(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 12

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Luf/i;

    .line 7
    .line 8
    invoke-direct {v0}, Luf/i;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-lt v2, v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Lac/p;->h(Luf/i;)Luf/i;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    const/high16 v3, -0x80000000

    .line 24
    .line 25
    invoke-virtual {p0, v2, v3}, Lorg/json/JSONArray;->optInt(II)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x2

    .line 30
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const/4 v4, 0x3

    .line 35
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const/4 v4, 0x4

    .line 40
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    const/4 v4, 0x5

    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const/4 v4, 0x6

    .line 50
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const/4 v4, 0x7

    .line 55
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    const/4 v4, 0x1

    .line 60
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    filled-new-array/range {v5 .. v11}, [Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v4}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v3}, Luf/i;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0
.end method

.method public static z(Lorg/json/JSONObject;)Ljava/util/List;
    .locals 11

    .line 1
    const-string v0, "planTimes"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_4

    .line 13
    .line 14
    invoke-static {}, La/a;->E()Luf/c;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    move p0, v3

    .line 23
    :goto_0
    if-lt p0, v7, :cond_0

    .line 24
    .line 25
    invoke-static {v6}, La/a;->t(Luf/c;)Luf/c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ltf/m;->p1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Ltf/m;->J1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    invoke-virtual {v0, p0, v4, v5}, Lorg/json/JSONArray;->optLong(IJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    cmp-long v8, v8, v4

    .line 47
    .line 48
    if-lez v8, :cond_1

    .line 49
    .line 50
    move v8, v2

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v8, v3

    .line 53
    :goto_1
    if-eqz v8, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v10, v1

    .line 57
    :goto_2
    if-eqz v10, :cond_3

    .line 58
    .line 59
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide v8

    .line 63
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {v6, v8}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    const-string v0, "planTime"

    .line 74
    .line 75
    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v6

    .line 79
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    cmp-long v0, v6, v4

    .line 84
    .line 85
    if-lez v0, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move v2, v3

    .line 89
    :goto_3
    if-eqz v2, :cond_6

    .line 90
    .line 91
    move-object v1, p0

    .line 92
    :cond_6
    invoke-static {v1}, La/a;->A0(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method


# virtual methods
.method public c(Lud/r;Lud/n;)Z
    .locals 4

    .line 1
    instance-of v0, p2, Lyd/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    check-cast p2, Lyd/c;

    .line 7
    .line 8
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_3

    .line 13
    :cond_0
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {v0, v0}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    goto :goto_3

    .line 26
    :cond_2
    iget-object v0, p2, Lyd/c;->m:Lud/j;

    .line 27
    .line 28
    invoke-static {v0}, Lf8/i;->E(Lud/j;)Lud/p;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v2, Lpd/k;->r:Lpd/k;

    .line 33
    .line 34
    invoke-static {v0, v2}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-virtual {p1}, Lud/r;->Z()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iget-object p1, p2, Lyd/c;->m:Lud/j;

    .line 48
    .line 49
    invoke-static {p1}, Lf8/i;->R(Lud/j;)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/4 v0, 0x5

    .line 54
    if-ge p1, v0, :cond_5

    .line 55
    .line 56
    iget-object v0, p2, Lyd/c;->n:Lud/j;

    .line 57
    .line 58
    invoke-static {v0}, Lf8/i;->R(Lud/j;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p2, Lyd/c;->n:Lud/j;

    .line 63
    .line 64
    check-cast v2, Lmd/e;

    .line 65
    .line 66
    iget-object v2, v2, Lmd/e;->g:Lmd/f;

    .line 67
    .line 68
    sget-object v3, Lmd/a;->R:Lmd/a;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    const/4 v2, 0x4

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    const/4 v2, 0x2

    .line 79
    :goto_1
    if-eq p1, v0, :cond_6

    .line 80
    .line 81
    mul-int v3, p1, v2

    .line 82
    .line 83
    if-le v3, v0, :cond_5

    .line 84
    .line 85
    mul-int/2addr v0, v2

    .line 86
    if-ge p1, v0, :cond_5

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    :goto_2
    iget-object p1, p2, Lxd/a;->i:Lud/n;

    .line 90
    .line 91
    new-instance v0, Lxd/b;

    .line 92
    .line 93
    invoke-direct {v0, p1}, Lxd/b;-><init>(Lud/n;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p1, p2, v0}, Lud/n;->l(Lud/j;Lud/j;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v0, p2}, Lxd/b;->H(Lud/j;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p2, Lyd/c;->n:Lud/j;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lxd/b;->H(Lud/j;)V

    .line 108
    .line 109
    .line 110
    const/4 p1, 0x0

    .line 111
    iput-object p1, p2, Lyd/c;->n:Lud/j;

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    return p1

    .line 115
    :cond_6
    :goto_3
    return v1
.end method

.method public h(Li5/a;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, v0}, La2/a;->j(Ljava/io/StringWriter;)Lq5/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p1}, Li5/a;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Lq5/a;->s(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, Lq5/a;->g:Ljava/io/Writer;

    .line 18
    .line 19
    const/16 v3, 0x3a

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/io/Writer;->write(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Li5/a;->getType()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v1, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :catch_0
    const-string p1, "Unexpected IOException"

    .line 37
    .line 38
    invoke-static {p1}, Lj8/o;->f(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return-object p1
.end method

.method public i(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 8
    .line 9
    return-object p1
.end method

.method public j(Ljava/io/StringWriter;)Lq5/a;
    .locals 2

    .line 1
    new-instance v0, Le5/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Le5/a;-><init>(Ljava/io/Writer;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public declared-synchronized l(Landroid/content/Context;Ljava/lang/ClassLoader;)Z
    .locals 6

    .line 1
    const-string v0, "[Hchat:FakeMiniProgramHostVersion] \u5c0f\u7a0b\u5e8f\u8fdb\u7a0b\u5347\u7ea7\u8df3\u8f6cHook\u5b89\u88c5\u5931\u8d25: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-boolean v1, Lea/a;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v2

    .line 14
    :cond_0
    :try_start_1
    const-string v1, "Hchat_fake_mini_program_host_version_member_cache"

    .line 15
    .line 16
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1, p2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "private_open_url_method"

    .line 25
    .line 26
    invoke-static {v1, v3, p2, v4}, Le8/b;->e(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    if-eqz p2, :cond_3

    .line 31
    .line 32
    invoke-static {p2}, Lx6/d;->j(Ljava/lang/reflect/Method;)Z

    .line 33
    .line 34
    .line 35
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p2, 0x0

    .line 40
    :goto_0
    if-eqz p2, :cond_3

    .line 41
    .line 42
    :try_start_2
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 43
    .line 44
    new-instance v3, Lea/b;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v5, 0x0

    .line 48
    invoke-direct {v3, p1, v4, v5}, Lea/b;-><init>(Landroid/content/Context;IZ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p2, v3}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 52
    .line 53
    .line 54
    sput-boolean v2, Lea/a;->g:Z

    .line 55
    .line 56
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    :try_start_3
    new-instance p2, Lsf/f;

    .line 61
    .line 62
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object p1, p2

    .line 66
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-nez p2, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1, p2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 100
    monitor-exit p0

    .line 101
    return p1

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    monitor-exit p0

    .line 105
    const/4 p1, 0x0

    .line 106
    return p1

    .line 107
    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, La2/a;->g:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    const-string v0, "dex-input: Dex Input - \'Load .dex and .apk files\'"

    .line 12
    .line 13
    return-object v0

    .line 14
    :sswitch_1
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    nop

    .line 17
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method
