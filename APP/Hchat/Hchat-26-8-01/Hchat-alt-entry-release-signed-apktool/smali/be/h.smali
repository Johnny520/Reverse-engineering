.class public abstract Lbe/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static volatile a:Lcb/f;

.field public static volatile b:Ljava/lang/String;


# direct methods
.method public static A(III)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x50

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    not-int v1, p1

    .line 9
    and-int/2addr v1, p0

    .line 10
    and-int/2addr p0, p1

    .line 11
    and-int/lit8 p1, p0, 0x1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p1, "|public"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 p1, p0, 0x2

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const-string p1, "|private"

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_1
    and-int/lit8 p1, p0, 0x4

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const-string p1, "|protected"

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_2
    and-int/lit8 p1, p0, 0x8

    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    const-string p1, "|static"

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    :cond_3
    and-int/lit8 p1, p0, 0x10

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    const-string p1, "|final"

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_4
    and-int/lit8 p1, p0, 0x20

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    if-ne p2, v2, :cond_5

    .line 62
    .line 63
    const-string p1, "|super"

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    const-string p1, "|synchronized"

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    :cond_6
    :goto_0
    and-int/lit8 p1, p0, 0x40

    .line 75
    .line 76
    const/4 v3, 0x3

    .line 77
    if-eqz p1, :cond_8

    .line 78
    .line 79
    if-ne p2, v3, :cond_7

    .line 80
    .line 81
    const-string p1, "|bridge"

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_7
    const-string p1, "|volatile"

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :cond_8
    :goto_1
    and-int/lit16 p1, p0, 0x80

    .line 93
    .line 94
    if-eqz p1, :cond_a

    .line 95
    .line 96
    if-ne p2, v3, :cond_9

    .line 97
    .line 98
    const-string p1, "|varargs"

    .line 99
    .line 100
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_9
    const-string p1, "|transient"

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_a
    :goto_2
    and-int/lit16 p1, p0, 0x100

    .line 110
    .line 111
    if-eqz p1, :cond_b

    .line 112
    .line 113
    const-string p1, "|native"

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    :cond_b
    and-int/lit16 p1, p0, 0x200

    .line 119
    .line 120
    if-eqz p1, :cond_c

    .line 121
    .line 122
    const-string p1, "|interface"

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_c
    and-int/lit16 p1, p0, 0x400

    .line 128
    .line 129
    if-eqz p1, :cond_d

    .line 130
    .line 131
    const-string p1, "|abstract"

    .line 132
    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    :cond_d
    and-int/lit16 p1, p0, 0x800

    .line 137
    .line 138
    if-eqz p1, :cond_e

    .line 139
    .line 140
    const-string p1, "|strictfp"

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :cond_e
    and-int/lit16 p1, p0, 0x1000

    .line 146
    .line 147
    if-eqz p1, :cond_f

    .line 148
    .line 149
    const-string p1, "|synthetic"

    .line 150
    .line 151
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    :cond_f
    and-int/lit16 p1, p0, 0x2000

    .line 155
    .line 156
    if-eqz p1, :cond_10

    .line 157
    .line 158
    const-string p1, "|annotation"

    .line 159
    .line 160
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    :cond_10
    and-int/lit16 p1, p0, 0x4000

    .line 164
    .line 165
    if-eqz p1, :cond_11

    .line 166
    .line 167
    const-string p1, "|enum"

    .line 168
    .line 169
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    :cond_11
    const/high16 p1, 0x10000

    .line 173
    .line 174
    and-int/2addr p1, p0

    .line 175
    if-eqz p1, :cond_12

    .line 176
    .line 177
    const-string p1, "|constructor"

    .line 178
    .line 179
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :cond_12
    const/high16 p1, 0x20000

    .line 183
    .line 184
    and-int/2addr p0, p1

    .line 185
    if-eqz p0, :cond_13

    .line 186
    .line 187
    const-string p0, "|declared_synchronized"

    .line 188
    .line 189
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :cond_13
    if-nez v1, :cond_14

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-nez p0, :cond_15

    .line 199
    .line 200
    :cond_14
    const/16 p0, 0x7c

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-static {v1}, La/a;->X0(I)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    :cond_15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    return-object p0
.end method

.method public static final B(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static C(Lh/Hchat/hooks/api/model/WeChatMessage;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isText()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method

.method public static final D(Le1/d;)Z
    .locals 6

    .line 1
    iget-wide v0, p0, Le1/d;->e:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    const-wide v4, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v4, v0

    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-wide v2, p0, Le1/d;->f:J

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, p0, Le1/d;->g:J

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget-wide v2, p0, Le1/d;->h:J

    .line 30
    .line 31
    cmp-long p0, v0, v2

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static E(Ljava/util/List;Ljava/lang/Comparable;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    :goto_0
    return v0
.end method

.method public static F(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static G(Lsf/d;Lfg/a;)Lsf/c;
    .locals 2

    .line 1
    sget-object v0, Lsf/m;->a:Lsf/m;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    new-instance p0, Lsf/o;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lsf/o;->g:Lfg/a;

    .line 21
    .line 22
    iput-object v0, p0, Lsf/o;->h:Ljava/lang/Object;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0

    .line 30
    :cond_1
    new-instance p0, Lsf/h;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lsf/h;->g:Lfg/a;

    .line 36
    .line 37
    iput-object v0, p0, Lsf/h;->h:Ljava/lang/Object;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    new-instance p0, Lsf/i;

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static H(Lfg/a;)Lsf/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsf/i;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lsf/i;-><init>(Lfg/a;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static I(Ll3/l;)Lna/a;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "hb_reply_group_items_v1"

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v2, "hb_reply_enable"

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move v2, v3

    .line 21
    :goto_0
    const/4 v4, 0x1

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const-string v5, "hb_reply_type"

    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6, v5, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move v5, v4

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    move v5, v3

    .line 38
    :goto_1
    const-string v6, "hb_reply_custom_enable"

    .line 39
    .line 40
    :try_start_2
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-interface {v7, v6, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 48
    goto :goto_2

    .line 49
    :catchall_2
    move v6, v3

    .line 50
    :goto_2
    const-wide/16 v7, 0x3e8

    .line 51
    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    const-string v6, "hb_reply_delay_value"

    .line 55
    .line 56
    :try_start_3
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v11

    .line 60
    invoke-interface {v11, v6, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 64
    goto :goto_3

    .line 65
    :catchall_3
    move v6, v4

    .line 66
    :goto_3
    if-gez v6, :cond_1

    .line 67
    .line 68
    move v6, v3

    .line 69
    :cond_1
    const-string v11, "hb_reply_delay_unit"

    .line 70
    .line 71
    :try_start_4
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-interface {v12, v11, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 79
    goto :goto_4

    .line 80
    :catchall_4
    move v11, v4

    .line 81
    :goto_4
    if-ne v11, v4, :cond_2

    .line 82
    .line 83
    int-to-long v11, v6

    .line 84
    mul-long/2addr v11, v7

    .line 85
    goto :goto_5

    .line 86
    :cond_2
    int-to-long v11, v6

    .line 87
    goto :goto_5

    .line 88
    :cond_3
    const-wide/16 v11, 0x0

    .line 89
    .line 90
    :goto_5
    const/4 v6, 0x2

    .line 91
    const-string v13, ""

    .line 92
    .line 93
    if-eq v5, v4, :cond_5

    .line 94
    .line 95
    if-ne v5, v6, :cond_4

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_4
    const-string v14, "hb_reply_media_paths"

    .line 99
    .line 100
    invoke-virtual {v0, v14, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    goto :goto_7

    .line 105
    :cond_5
    :goto_6
    const-string v14, "hb_reply_text"

    .line 106
    .line 107
    const-string v15, "\u8c22\u8c22\u8001\u677f"

    .line 108
    .line 109
    invoke-virtual {v0, v14, v15}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    const-string v15, "hb_reply_templates"

    .line 114
    .line 115
    invoke-virtual {v0, v15, v14}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v14

    .line 119
    :goto_7
    const-string v15, "hb_reply_items_v1"

    .line 120
    .line 121
    invoke-virtual {v0, v15, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    const-string v6, "hb_reply_random"

    .line 126
    .line 127
    if-eqz v2, :cond_6

    .line 128
    .line 129
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v17

    .line 133
    if-nez v17, :cond_6

    .line 134
    .line 135
    invoke-static {v15}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :goto_8
    move-object/from16 v31, v2

    .line 140
    .line 141
    goto :goto_a

    .line 142
    :cond_6
    if-eqz v2, :cond_7

    .line 143
    .line 144
    :try_start_5
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-interface {v2, v6, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 149
    .line 150
    .line 151
    move-result v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 152
    goto :goto_9

    .line 153
    :catchall_5
    move v2, v3

    .line 154
    :goto_9
    invoke-static {v5, v11, v12, v14, v2}, La7/a;->B(IJLjava/lang/String;Z)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_8

    .line 159
    :cond_7
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :goto_a
    :try_start_6
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {v2, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 170
    if-ne v2, v4, :cond_8

    .line 171
    .line 172
    move v2, v4

    .line 173
    goto :goto_b

    .line 174
    :catchall_6
    :cond_8
    move v2, v3

    .line 175
    :goto_b
    if-eqz v2, :cond_9

    .line 176
    .line 177
    invoke-virtual {v0, v1, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v1}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    move-object/from16 v32, v1

    .line 186
    .line 187
    goto :goto_c

    .line 188
    :cond_9
    move-object/from16 v32, v31

    .line 189
    .line 190
    :goto_c
    new-instance v1, Lna/a;

    .line 191
    .line 192
    move-wide/from16 v17, v7

    .line 193
    .line 194
    invoke-virtual {v0}, Ll3/l;->e()Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    const-string v2, "hb_grab_mode"

    .line 199
    .line 200
    :try_start_7
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-interface {v7, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 205
    .line 206
    .line 207
    move-result v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 208
    goto :goto_d

    .line 209
    :catchall_7
    move v2, v4

    .line 210
    :goto_d
    const-string v7, "hb_auto_delay_mode"

    .line 211
    .line 212
    const-string v15, "hb_auto_delay_value"

    .line 213
    .line 214
    const-wide/16 v19, 0x0

    .line 215
    .line 216
    invoke-virtual {v0, v15, v3}, Ll3/l;->c(Ljava/lang/String;I)I

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    const-string v10, "hb_auto_delay_unit"

    .line 221
    .line 222
    move-object/from16 v21, v1

    .line 223
    .line 224
    invoke-virtual {v0, v10, v3}, Ll3/l;->c(Ljava/lang/String;I)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    move/from16 v26, v5

    .line 229
    .line 230
    if-ne v1, v4, :cond_a

    .line 231
    .line 232
    int-to-long v4, v9

    .line 233
    mul-long v4, v4, v17

    .line 234
    .line 235
    goto :goto_e

    .line 236
    :cond_a
    int-to-long v4, v9

    .line 237
    :goto_e
    cmp-long v4, v4, v19

    .line 238
    .line 239
    if-lez v4, :cond_b

    .line 240
    .line 241
    const/4 v4, 0x2

    .line 242
    goto :goto_f

    .line 243
    :cond_b
    move v4, v3

    .line 244
    :goto_f
    :try_start_8
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    invoke-interface {v5, v7, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 249
    .line 250
    .line 251
    move-result v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 252
    :catchall_8
    invoke-virtual {v0, v15, v3}, Ll3/l;->c(Ljava/lang/String;I)I

    .line 253
    .line 254
    .line 255
    move-result v5

    .line 256
    invoke-virtual {v0, v10, v3}, Ll3/l;->c(Ljava/lang/String;I)I

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    const/4 v1, 0x1

    .line 261
    int-to-long v9, v5

    .line 262
    if-ne v7, v1, :cond_c

    .line 263
    .line 264
    mul-long v9, v9, v17

    .line 265
    .line 266
    :cond_c
    const-string v1, "hb_auto_delay_random_min"

    .line 267
    .line 268
    :try_start_9
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-interface {v5, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 273
    .line 274
    .line 275
    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 276
    goto :goto_10

    .line 277
    :catchall_9
    move v1, v3

    .line 278
    :goto_10
    if-gez v1, :cond_d

    .line 279
    .line 280
    move v1, v3

    .line 281
    :cond_d
    move v7, v4

    .line 282
    int-to-long v3, v1

    .line 283
    const-string v1, "hb_auto_delay_random_max"

    .line 284
    .line 285
    :try_start_a
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    const/4 v5, 0x0

    .line 290
    invoke-interface {v15, v1, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 291
    .line 292
    .line 293
    move-result v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 294
    goto :goto_11

    .line 295
    :catchall_a
    const/4 v1, 0x0

    .line 296
    :goto_11
    if-gez v1, :cond_e

    .line 297
    .line 298
    const/4 v1, 0x0

    .line 299
    :cond_e
    move-object v15, v6

    .line 300
    int-to-long v5, v1

    .line 301
    const-string v1, "hb_skip_self"

    .line 302
    .line 303
    move/from16 v17, v2

    .line 304
    .line 305
    :try_start_b
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 306
    .line 307
    .line 308
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 309
    move-wide/from16 v18, v3

    .line 310
    .line 311
    const/4 v3, 0x0

    .line 312
    :try_start_c
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 313
    .line 314
    .line 315
    move-result v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 316
    move-wide/from16 v28, v11

    .line 317
    .line 318
    move-wide v11, v9

    .line 319
    move/from16 v9, v17

    .line 320
    .line 321
    move/from16 v17, v1

    .line 322
    .line 323
    goto :goto_12

    .line 324
    :catchall_b
    move-wide/from16 v18, v3

    .line 325
    .line 326
    const/4 v3, 0x0

    .line 327
    :catchall_c
    move-wide/from16 v28, v11

    .line 328
    .line 329
    move-wide v11, v9

    .line 330
    move/from16 v9, v17

    .line 331
    .line 332
    move/from16 v17, v3

    .line 333
    .line 334
    :goto_12
    const-string v1, "hb_auto_mode"

    .line 335
    .line 336
    :try_start_d
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 341
    .line 342
    .line 343
    move-result v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 344
    move-wide/from16 v47, v18

    .line 345
    .line 346
    move/from16 v18, v1

    .line 347
    .line 348
    move-wide/from16 v1, v47

    .line 349
    .line 350
    goto :goto_13

    .line 351
    :catchall_d
    move-wide/from16 v1, v18

    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    :goto_13
    const-string v3, "hb_auto_whitelist"

    .line 356
    .line 357
    invoke-virtual {v0, v3, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v19

    .line 361
    const-string v3, "hb_auto_blacklist"

    .line 362
    .line 363
    invoke-virtual {v0, v3, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v20

    .line 367
    const-string v3, "hb_kw_mode"

    .line 368
    .line 369
    :try_start_e
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 370
    .line 371
    .line 372
    move-result-object v4
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 373
    const/4 v10, 0x0

    .line 374
    :try_start_f
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 375
    .line 376
    .line 377
    move-result v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 378
    move-object/from16 v47, v21

    .line 379
    .line 380
    move/from16 v21, v3

    .line 381
    .line 382
    move-object v3, v15

    .line 383
    move-wide v15, v5

    .line 384
    move-object/from16 v6, v47

    .line 385
    .line 386
    goto :goto_14

    .line 387
    :catchall_e
    const/4 v10, 0x0

    .line 388
    :catchall_f
    move-object v3, v15

    .line 389
    move-wide v15, v5

    .line 390
    move-object/from16 v6, v21

    .line 391
    .line 392
    move/from16 v21, v10

    .line 393
    .line 394
    :goto_14
    const-string v4, "hb_keywords"

    .line 395
    .line 396
    invoke-virtual {v0, v4, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v22

    .line 400
    :try_start_10
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 405
    .line 406
    .line 407
    move-result v5
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 408
    move/from16 v30, v5

    .line 409
    .line 410
    goto :goto_15

    .line 411
    :catchall_10
    move/from16 v30, v10

    .line 412
    .line 413
    :goto_15
    const-string v3, "hb_notify_system_enable"

    .line 414
    .line 415
    :try_start_11
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 420
    .line 421
    .line 422
    move-result v5
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 423
    move/from16 v33, v5

    .line 424
    .line 425
    goto :goto_16

    .line 426
    :catchall_11
    move/from16 v33, v10

    .line 427
    .line 428
    :goto_16
    const-string v3, "hb_notify_toast_enable"

    .line 429
    .line 430
    :try_start_12
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 435
    .line 436
    .line 437
    move-result v5
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 438
    move/from16 v34, v5

    .line 439
    .line 440
    goto :goto_17

    .line 441
    :catchall_12
    move/from16 v34, v10

    .line 442
    .line 443
    :goto_17
    const-string v3, "hb_notify_sound_enable"

    .line 444
    .line 445
    :try_start_13
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 450
    .line 451
    .line 452
    move-result v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 453
    move/from16 v35, v5

    .line 454
    .line 455
    goto :goto_18

    .line 456
    :catchall_13
    move/from16 v35, v10

    .line 457
    .line 458
    :goto_18
    const-string v3, "hb_notify_sound_mode"

    .line 459
    .line 460
    :try_start_14
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 465
    .line 466
    .line 467
    move-result v5
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 468
    move/from16 v36, v5

    .line 469
    .line 470
    goto :goto_19

    .line 471
    :catchall_14
    move/from16 v36, v10

    .line 472
    .line 473
    :goto_19
    const-string v3, "hb_notify_vibrate_enable"

    .line 474
    .line 475
    :try_start_15
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    invoke-interface {v4, v3, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 480
    .line 481
    .line 482
    move-result v5
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    .line 483
    move/from16 v37, v5

    .line 484
    .line 485
    goto :goto_1a

    .line 486
    :catchall_15
    const/16 v37, 0x0

    .line 487
    .line 488
    :goto_1a
    const-string v4, "hb_notify_sound_uri"

    .line 489
    .line 490
    invoke-virtual {v0, v4, v13}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v38

    .line 494
    const-string v4, "hb_notify_text"

    .line 495
    .line 496
    const-string v5, "\u62a2\u5230\u7ea2\u5305 {amount} \u5143"

    .line 497
    .line 498
    invoke-virtual {v0, v4, v5}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v39

    .line 502
    const-string v10, "hb_notify_toast_text"

    .line 503
    .line 504
    invoke-virtual {v0, v4, v5}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    invoke-virtual {v0, v10, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v40

    .line 512
    const-string v4, "hb_notify_failed_system_enable"

    .line 513
    .line 514
    :try_start_16
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 515
    .line 516
    .line 517
    move-result-object v10
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_16

    .line 518
    const/4 v3, 0x0

    .line 519
    :try_start_17
    invoke-interface {v10, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 520
    .line 521
    .line 522
    move-result v4
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_17

    .line 523
    move/from16 v41, v4

    .line 524
    .line 525
    goto :goto_1b

    .line 526
    :catchall_16
    const/4 v3, 0x0

    .line 527
    :catchall_17
    move/from16 v41, v3

    .line 528
    .line 529
    :goto_1b
    const-string v4, "hb_notify_failed_toast_enable"

    .line 530
    .line 531
    :try_start_18
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    invoke-interface {v10, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 536
    .line 537
    .line 538
    move-result v4
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_18

    .line 539
    move/from16 v42, v4

    .line 540
    .line 541
    goto :goto_1c

    .line 542
    :catchall_18
    const/16 v42, 0x0

    .line 543
    .line 544
    :goto_1c
    const-string v4, "hb_notify_failed_text"

    .line 545
    .line 546
    const-string v10, "\u672a\u62a2\u5230\u7ea2\u5305"

    .line 547
    .line 548
    invoke-virtual {v0, v4, v10}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v43

    .line 552
    const-string v13, "hb_notify_failed_toast_text"

    .line 553
    .line 554
    invoke-virtual {v0, v4, v10}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v0, v13, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v44

    .line 562
    const-string v4, "hb_announce_enable"

    .line 563
    .line 564
    :try_start_19
    invoke-virtual {v0}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 565
    .line 566
    .line 567
    move-result-object v10
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1a

    .line 568
    const/4 v3, 0x0

    .line 569
    :try_start_1a
    invoke-interface {v10, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 570
    .line 571
    .line 572
    move-result v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_19

    .line 573
    :catchall_19
    :goto_1d
    move/from16 v45, v3

    .line 574
    .line 575
    goto :goto_1e

    .line 576
    :catchall_1a
    const/4 v3, 0x0

    .line 577
    goto :goto_1d

    .line 578
    :goto_1e
    const-string v3, "hb_announce_text"

    .line 579
    .line 580
    invoke-virtual {v0, v3, v5}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v46

    .line 584
    move v10, v7

    .line 585
    const-string v7, "\u65e7\u7248\u5168\u5c40\u8bbe\u7f6e"

    .line 586
    .line 587
    const/16 v23, 0x0

    .line 588
    .line 589
    const/16 v24, 0x0

    .line 590
    .line 591
    const/16 v25, 0x0

    .line 592
    .line 593
    move-object/from16 v27, v14

    .line 594
    .line 595
    move-wide v13, v1

    .line 596
    invoke-direct/range {v6 .. v46}, Lna/a;-><init>(Ljava/lang/String;ZIIJJJZILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIIILjava/lang/String;JZLjava/util/List;Ljava/util/List;ZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 597
    .line 598
    .line 599
    return-object v6
.end method

.method public static J(Z)Ljava/util/List;
    .locals 19

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    if-eqz v0, :cond_34

    .line 8
    .line 9
    invoke-virtual {v0}, Lg8/i;->G()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v2, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v2, v3

    .line 19
    :goto_0
    if-eqz v2, :cond_34

    .line 20
    .line 21
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v2}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    new-instance v5, Lsf/f;

    .line 33
    .line 34
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v5

    .line 38
    :goto_1
    nop

    .line 39
    instance-of v5, v0, Lsf/f;

    .line 40
    .line 41
    if-eqz v5, :cond_1

    .line 42
    .line 43
    move-object v0, v1

    .line 44
    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_7

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 61
    .line 62
    iget-object v6, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    iget-object v6, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 71
    .line 72
    :cond_3
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    iget-object v5, v5, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    :cond_5
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_2

    .line 90
    .line 91
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-nez v8, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    if-nez v8, :cond_6

    .line 108
    .line 109
    new-instance v8, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v4, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_6
    check-cast v8, Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 124
    .line 125
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    invoke-static {v5}, Ltf/y;->a0(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    invoke-direct {v0, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    check-cast v4, Ljava/lang/Iterable;

    .line 141
    .line 142
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-eqz v5, :cond_8

    .line 151
    .line 152
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    check-cast v5, Ljava/util/Map$Entry;

    .line 157
    .line 158
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Ljava/util/List;

    .line 167
    .line 168
    invoke-static {v5}, Ltf/m;->p1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    if-eqz v4, :cond_9

    .line 181
    .line 182
    invoke-virtual {v4}, Lh8/a;->c()Ljava/util/ArrayList;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    goto :goto_5

    .line 187
    :cond_9
    move-object v4, v3

    .line 188
    :goto_5
    if-nez v4, :cond_a

    .line 189
    .line 190
    move-object v4, v1

    .line 191
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    const/4 v6, 0x0

    .line 205
    move v7, v6

    .line 206
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-eqz v8, :cond_c

    .line 211
    .line 212
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    add-int/lit8 v9, v7, 0x1

    .line 217
    .line 218
    if-ltz v7, :cond_b

    .line 219
    .line 220
    check-cast v8, Ll8/b;

    .line 221
    .line 222
    iget-object v8, v8, Ll8/b;->a:Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    new-instance v10, Lsf/e;

    .line 229
    .line 230
    invoke-direct {v10, v8, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move v7, v9

    .line 237
    goto :goto_6

    .line 238
    :cond_b
    invoke-static {}, La/a;->Q0()V

    .line 239
    .line 240
    .line 241
    throw v3

    .line 242
    :cond_c
    invoke-static {v5}, Ltf/y;->e0(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    new-instance v5, Lc9/z;

    .line 247
    .line 248
    const/4 v7, 0x2

    .line 249
    invoke-direct {v5, v4, v7}, Lc9/z;-><init>(Ljava/util/Map;I)V

    .line 250
    .line 251
    .line 252
    new-instance v4, Lc9/a0;

    .line 253
    .line 254
    const/16 v7, 0x15

    .line 255
    .line 256
    invoke-direct {v4, v5, v7}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2}, Lg8/i;->y()Ljava/util/ArrayList;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    new-instance v5, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    :cond_d
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    if-eqz v7, :cond_12

    .line 277
    .line 278
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 283
    .line 284
    iget-object v8, v7, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    check-cast v8, Ljava/util/List;

    .line 291
    .line 292
    if-nez v8, :cond_e

    .line 293
    .line 294
    move-object v15, v1

    .line 295
    goto :goto_8

    .line 296
    :cond_e
    move-object v15, v8

    .line 297
    :goto_8
    iget-object v8, v7, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 298
    .line 299
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    if-eqz v8, :cond_f

    .line 304
    .line 305
    move-object v9, v3

    .line 306
    goto :goto_a

    .line 307
    :cond_f
    iget-object v10, v7, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 308
    .line 309
    invoke-static {v7, v6}, Lr9/e0;->Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    iget-object v13, v7, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 314
    .line 315
    iget-object v14, v7, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v8, v7, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 318
    .line 319
    iget-object v9, v7, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 320
    .line 321
    iget-object v7, v7, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 322
    .line 323
    filled-new-array {v8, v9, v7}, [Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    invoke-static {v7}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    new-instance v8, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    :cond_10
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v9

    .line 344
    if-eqz v9, :cond_11

    .line 345
    .line 346
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    move-object v12, v9

    .line 351
    check-cast v12, Ljava/lang/String;

    .line 352
    .line 353
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    if-nez v12, :cond_10

    .line 358
    .line 359
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_11
    invoke-static {v8}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-static {v7}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v17

    .line 371
    new-instance v9, Lwb/jv;

    .line 372
    .line 373
    const/4 v12, 0x0

    .line 374
    const/16 v16, 0x0

    .line 375
    .line 376
    const/16 v18, 0x40

    .line 377
    .line 378
    invoke-direct/range {v9 .. v18}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 379
    .line 380
    .line 381
    :goto_a
    if-eqz v9, :cond_d

    .line 382
    .line 383
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_12
    new-instance v0, Ljava/util/HashSet;

    .line 388
    .line 389
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 390
    .line 391
    .line 392
    new-instance v2, Ljava/util/ArrayList;

    .line 393
    .line 394
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    :cond_13
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    if-eqz v6, :cond_14

    .line 406
    .line 407
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v6

    .line 411
    move-object v7, v6

    .line 412
    check-cast v7, Lwb/jv;

    .line 413
    .line 414
    iget-object v7, v7, Lwb/jv;->a:Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_13

    .line 421
    .line 422
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_14
    invoke-static {v2, v4}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    if-nez p0, :cond_15

    .line 431
    .line 432
    return-object v0

    .line 433
    :cond_15
    new-instance v2, Ljava/util/HashSet;

    .line 434
    .line 435
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    if-eqz v6, :cond_16

    .line 447
    .line 448
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    check-cast v6, Lwb/jv;

    .line 453
    .line 454
    iget-object v6, v6, Lwb/jv;->a:Ljava/lang/String;

    .line 455
    .line 456
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_c

    .line 460
    :cond_16
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    if-eqz v5, :cond_31

    .line 465
    .line 466
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    if-eqz v6, :cond_17

    .line 478
    .line 479
    invoke-virtual {v6}, Lg8/a;->c()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    goto :goto_d

    .line 484
    :cond_17
    move-object v6, v3

    .line 485
    :goto_d
    const-string v7, ""

    .line 486
    .line 487
    if-nez v6, :cond_18

    .line 488
    .line 489
    move-object v6, v7

    .line 490
    :cond_18
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 491
    .line 492
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v5}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v9

    .line 503
    :cond_19
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v10

    .line 507
    if-eqz v10, :cond_1e

    .line 508
    .line 509
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v10

    .line 513
    check-cast v10, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 514
    .line 515
    iget-object v11, v10, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v5, v11}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 518
    .line 519
    .line 520
    move-result-object v11

    .line 521
    iget-object v10, v10, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {v5, v10}, Lg8/i;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 524
    .line 525
    .line 526
    move-result-object v10

    .line 527
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 528
    .line 529
    .line 530
    move-result-object v10

    .line 531
    :cond_1a
    :goto_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 532
    .line 533
    .line 534
    move-result v12

    .line 535
    if-eqz v12, :cond_19

    .line 536
    .line 537
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v12

    .line 541
    check-cast v12, Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    if-nez v13, :cond_1a

    .line 551
    .line 552
    invoke-virtual {v12, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v13

    .line 556
    if-nez v13, :cond_1a

    .line 557
    .line 558
    invoke-virtual {v2, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v13

    .line 562
    if-eqz v13, :cond_1b

    .line 563
    .line 564
    goto :goto_e

    .line 565
    :cond_1b
    invoke-virtual {v11, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    check-cast v13, Ljava/lang/String;

    .line 570
    .line 571
    if-nez v13, :cond_1c

    .line 572
    .line 573
    move-object v13, v7

    .line 574
    :cond_1c
    invoke-static {v13}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 575
    .line 576
    .line 577
    move-result-object v13

    .line 578
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v13

    .line 582
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 583
    .line 584
    .line 585
    move-result v14

    .line 586
    if-lez v14, :cond_1d

    .line 587
    .line 588
    invoke-interface {v8, v12, v13}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v12

    .line 592
    check-cast v12, Ljava/lang/String;

    .line 593
    .line 594
    goto :goto_e

    .line 595
    :cond_1d
    invoke-interface {v8, v12, v7}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v12

    .line 599
    check-cast v12, Ljava/lang/String;

    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1e
    invoke-virtual {v8}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    if-eqz v2, :cond_1f

    .line 607
    .line 608
    goto/16 :goto_1b

    .line 609
    .line 610
    :cond_1f
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    check-cast v1, Ljava/lang/Iterable;

    .line 618
    .line 619
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {v5, v1}, Lg8/i;->q(Ljava/util/List;)Ljava/util/ArrayList;

    .line 624
    .line 625
    .line 626
    move-result-object v1

    .line 627
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    invoke-static {v2}, Ltf/y;->a0(I)I

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    const/16 v5, 0x10

    .line 636
    .line 637
    if-ge v2, v5, :cond_20

    .line 638
    .line 639
    move v2, v5

    .line 640
    :cond_20
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 641
    .line 642
    invoke-direct {v5, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    if-eqz v2, :cond_21

    .line 654
    .line 655
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    move-object v6, v2

    .line 660
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 661
    .line 662
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 663
    .line 664
    invoke-interface {v5, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    goto :goto_f

    .line 668
    :cond_21
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    check-cast v1, Ljava/lang/Iterable;

    .line 676
    .line 677
    new-instance v2, Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 680
    .line 681
    .line 682
    move-result v6

    .line 683
    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 684
    .line 685
    .line 686
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v6

    .line 694
    if-eqz v6, :cond_30

    .line 695
    .line 696
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v6

    .line 700
    move-object v10, v6

    .line 701
    check-cast v10, Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {v5, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v6

    .line 707
    check-cast v6, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 708
    .line 709
    if-eqz v6, :cond_22

    .line 710
    .line 711
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 712
    .line 713
    goto :goto_11

    .line 714
    :cond_22
    move-object v9, v3

    .line 715
    :goto_11
    if-eqz v6, :cond_23

    .line 716
    .line 717
    iget-object v11, v6, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 718
    .line 719
    goto :goto_12

    .line 720
    :cond_23
    move-object v11, v3

    .line 721
    :goto_12
    invoke-virtual {v8, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v12

    .line 725
    check-cast v12, Ljava/lang/String;

    .line 726
    .line 727
    filled-new-array {v9, v11, v12}, [Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v9

    .line 731
    invoke-static {v9}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 732
    .line 733
    .line 734
    move-result-object v9

    .line 735
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v9

    .line 739
    :cond_24
    :goto_13
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v11

    .line 743
    if-eqz v11, :cond_25

    .line 744
    .line 745
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v11

    .line 749
    move-object v12, v11

    .line 750
    check-cast v12, Ljava/lang/String;

    .line 751
    .line 752
    if-eqz v12, :cond_24

    .line 753
    .line 754
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 755
    .line 756
    .line 757
    move-result v12

    .line 758
    if-eqz v12, :cond_26

    .line 759
    .line 760
    goto :goto_13

    .line 761
    :cond_25
    move-object v11, v3

    .line 762
    :cond_26
    check-cast v11, Ljava/lang/String;

    .line 763
    .line 764
    if-nez v11, :cond_27

    .line 765
    .line 766
    move-object v11, v7

    .line 767
    :cond_27
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 768
    .line 769
    .line 770
    move-result v9

    .line 771
    if-eqz v9, :cond_28

    .line 772
    .line 773
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    move-object v11, v10

    .line 777
    :cond_28
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    if-eqz v6, :cond_29

    .line 781
    .line 782
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 783
    .line 784
    goto :goto_14

    .line 785
    :cond_29
    move-object v9, v3

    .line 786
    :goto_14
    if-nez v9, :cond_2a

    .line 787
    .line 788
    move-object v13, v7

    .line 789
    goto :goto_15

    .line 790
    :cond_2a
    move-object v13, v9

    .line 791
    :goto_15
    if-eqz v6, :cond_2b

    .line 792
    .line 793
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 794
    .line 795
    goto :goto_16

    .line 796
    :cond_2b
    move-object v9, v3

    .line 797
    :goto_16
    if-nez v9, :cond_2c

    .line 798
    .line 799
    move-object v14, v7

    .line 800
    goto :goto_17

    .line 801
    :cond_2c
    move-object v14, v9

    .line 802
    :goto_17
    if-eqz v6, :cond_2d

    .line 803
    .line 804
    iget-object v9, v6, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 805
    .line 806
    if-eqz v9, :cond_2d

    .line 807
    .line 808
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 809
    .line 810
    .line 811
    move-result v12

    .line 812
    if-nez v12, :cond_2d

    .line 813
    .line 814
    goto :goto_18

    .line 815
    :cond_2d
    move-object v9, v3

    .line 816
    :goto_18
    if-eqz v6, :cond_2e

    .line 817
    .line 818
    iget-object v6, v6, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 819
    .line 820
    if-eqz v6, :cond_2e

    .line 821
    .line 822
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 823
    .line 824
    .line 825
    move-result v12

    .line 826
    if-nez v12, :cond_2e

    .line 827
    .line 828
    goto :goto_19

    .line 829
    :cond_2e
    move-object v6, v3

    .line 830
    :goto_19
    invoke-virtual {v8, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v12

    .line 834
    check-cast v12, Ljava/lang/String;

    .line 835
    .line 836
    if-eqz v12, :cond_2f

    .line 837
    .line 838
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 839
    .line 840
    .line 841
    move-result v15

    .line 842
    if-nez v15, :cond_2f

    .line 843
    .line 844
    goto :goto_1a

    .line 845
    :cond_2f
    move-object v12, v3

    .line 846
    :goto_1a
    const-string v15, "\u7fa4\u6210\u5458"

    .line 847
    .line 848
    filled-new-array {v9, v6, v12, v15}, [Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v6

    .line 852
    invoke-static {v6}, La/a;->z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 853
    .line 854
    .line 855
    move-result-object v6

    .line 856
    invoke-static {v6}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    invoke-static {v6}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 861
    .line 862
    .line 863
    move-result-object v17

    .line 864
    new-instance v9, Lwb/jv;

    .line 865
    .line 866
    const/4 v12, 0x0

    .line 867
    const/4 v15, 0x0

    .line 868
    const/16 v16, 0x0

    .line 869
    .line 870
    const/16 v18, 0x60

    .line 871
    .line 872
    invoke-direct/range {v9 .. v18}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    goto/16 :goto_10

    .line 879
    .line 880
    :cond_30
    new-instance v1, La9/h;

    .line 881
    .line 882
    const/16 v3, 0x14

    .line 883
    .line 884
    invoke-direct {v1, v3}, La9/h;-><init>(I)V

    .line 885
    .line 886
    .line 887
    invoke-static {v2, v1}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 888
    .line 889
    .line 890
    move-result-object v1

    .line 891
    :cond_31
    :goto_1b
    invoke-static {v0, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    new-instance v1, Ljava/util/HashSet;

    .line 896
    .line 897
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 898
    .line 899
    .line 900
    new-instance v2, Ljava/util/ArrayList;

    .line 901
    .line 902
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 903
    .line 904
    .line 905
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    :cond_32
    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    if-eqz v3, :cond_33

    .line 914
    .line 915
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v3

    .line 919
    move-object v5, v3

    .line 920
    check-cast v5, Lwb/jv;

    .line 921
    .line 922
    iget-object v5, v5, Lwb/jv;->a:Ljava/lang/String;

    .line 923
    .line 924
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v5

    .line 928
    if-eqz v5, :cond_32

    .line 929
    .line 930
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    goto :goto_1c

    .line 934
    :cond_33
    invoke-static {v2, v4}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    return-object v0

    .line 939
    :cond_34
    return-object v1
.end method

.method public static K(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {p1, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-object v0

    .line 42
    :cond_2
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 43
    .line 44
    return-object p0
.end method

.method public static L(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

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
    const-string v0, "\uffe5"

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "\u00a5"

    .line 19
    .line 20
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "\u5143"

    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, ","

    .line 31
    .line 32
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "[0-9]+(?:\\.[0-9]{0,2})?"

    .line 52
    .line 53
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    :goto_0
    const/4 p0, 0x0

    .line 71
    return-object p0

    .line 72
    :cond_1
    const-string v0, "."

    .line 73
    .line 74
    invoke-static {p0, v0}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static M(Lac/o;Lac/k;BLjava/lang/String;I)V
    .locals 4

    .line 1
    iget-object p0, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p2, v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p2, v0, :cond_0

    .line 14
    .line 15
    new-instance p2, Lac/d;

    .line 16
    .line 17
    iget v0, p1, Lac/k;->h:I

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lac/k;->r(I)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    iget v2, p1, Lac/k;->h:I

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x8

    .line 26
    .line 27
    iput v2, p1, Lac/k;->h:I

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput p4, p2, Lac/b;->a:I

    .line 37
    .line 38
    iput-wide v0, p2, Lac/d;->b:D

    .line 39
    .line 40
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance p2, Lac/g;

    .line 45
    .line 46
    iget v0, p1, Lac/k;->h:I

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lac/k;->r(I)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iget v2, p1, Lac/k;->h:I

    .line 53
    .line 54
    add-int/lit8 v2, v2, 0x8

    .line 55
    .line 56
    iput v2, p1, Lac/k;->h:I

    .line 57
    .line 58
    invoke-direct {p2, p4, v0, v1}, Lac/g;-><init>(IJ)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    new-instance p2, Lac/e;

    .line 66
    .line 67
    invoke-virtual {p1}, Lac/k;->q()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-direct {p2, p4, p1}, Lac/e;-><init>(IF)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_2
    new-instance p2, Lac/f;

    .line 83
    .line 84
    invoke-virtual {p1}, Lac/k;->q()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-direct {p2, p4, p1}, Lac/f;-><init>(II)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    new-instance p2, Lac/c;

    .line 96
    .line 97
    iget-object v1, p1, Lac/k;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, [B

    .line 100
    .line 101
    iget v2, p1, Lac/k;->h:I

    .line 102
    .line 103
    add-int/lit8 v3, v2, 0x1

    .line 104
    .line 105
    iput v3, p1, Lac/k;->h:I

    .line 106
    .line 107
    aget-byte p1, v1, v2

    .line 108
    .line 109
    if-ne p1, v0, :cond_4

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    const/4 v0, 0x0

    .line 113
    :goto_0
    invoke-direct {p2, p4, v0}, Lac/c;-><init>(IZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static N(Lac/o;Lac/k;BLjava/lang/String;IIB)V
    .locals 13

    .line 1
    move v0, p2

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    iget-object v2, p0, Lac/o;->f:Ljava/util/HashMap;

    .line 5
    .line 6
    const/16 v3, 0x9

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/16 v3, 0xa

    .line 13
    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    const/16 v3, 0xb

    .line 17
    .line 18
    if-ne v0, v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v3, v4

    .line 24
    :goto_1
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Lac/k;->q()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    :goto_2
    move v11, v6

    .line 31
    goto :goto_3

    .line 32
    :cond_2
    invoke-virtual {p1}, Lac/k;->u()S

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const v7, 0xffff

    .line 37
    .line 38
    .line 39
    and-int/2addr v6, v7

    .line 40
    goto :goto_2

    .line 41
    :goto_3
    if-eqz v3, :cond_3

    .line 42
    .line 43
    const/4 v3, 0x4

    .line 44
    goto :goto_4

    .line 45
    :cond_3
    const/4 v3, 0x2

    .line 46
    :goto_4
    and-int/lit8 v6, p6, 0x40

    .line 47
    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    move v12, v4

    .line 51
    goto :goto_5

    .line 52
    :cond_4
    move v12, v5

    .line 53
    :goto_5
    if-eqz v12, :cond_6

    .line 54
    .line 55
    const/16 v6, 0x20

    .line 56
    .line 57
    if-ne v11, v6, :cond_5

    .line 58
    .line 59
    goto :goto_6

    .line 60
    :cond_5
    const-string p0, "name size not match"

    .line 61
    .line 62
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_6
    :goto_6
    const/4 v6, 0x6

    .line 67
    const/4 v7, 0x7

    .line 68
    packed-switch v0, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    goto :goto_7

    .line 72
    :pswitch_0
    const/16 v0, 0x8

    .line 73
    .line 74
    goto :goto_7

    .line 75
    :pswitch_1
    move v0, v7

    .line 76
    goto :goto_7

    .line 77
    :pswitch_2
    move v0, v6

    .line 78
    :goto_7
    if-eq v0, v6, :cond_c

    .line 79
    .line 80
    if-eq v0, v7, :cond_a

    .line 81
    .line 82
    if-eqz v12, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1, v11}, Lac/k;->w(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    new-instance v7, Lac/h;

    .line 89
    .line 90
    add-int v9, p4, v3

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    move/from16 v8, p5

    .line 94
    .line 95
    invoke-direct/range {v7 .. v12}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_7
    iget-object v0, p0, Lac/o;->h:Lac/k;

    .line 103
    .line 104
    iget-object v5, v0, Lac/k;->j:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v5, [B

    .line 107
    .line 108
    iget v6, v0, Lac/k;->h:I

    .line 109
    .line 110
    add-int/lit8 v7, v6, 0x1

    .line 111
    .line 112
    iput v7, v0, Lac/k;->h:I

    .line 113
    .line 114
    aget-byte v5, v5, v6

    .line 115
    .line 116
    and-int/lit16 v5, v5, 0xff

    .line 117
    .line 118
    invoke-virtual {v0, v5}, Lac/k;->w(I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iget-object v7, p0, Lac/o;->c:Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    check-cast v7, Lac/s;

    .line 129
    .line 130
    add-int/2addr v5, v4

    .line 131
    sub-int v4, v11, v5

    .line 132
    .line 133
    if-ltz v4, :cond_9

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    :try_start_0
    iget-object v5, v0, Lac/k;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, [B

    .line 140
    .line 141
    iget v0, v0, Lac/k;->h:I

    .line 142
    .line 143
    invoke-static {v5, v0, v4}, Lac/s;->a([BII)Ljava/util/LinkedHashSet;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    new-instance v7, Lac/h;

    .line 148
    .line 149
    add-int/lit8 v9, p4, 0x2

    .line 150
    .line 151
    const/4 v12, 0x0

    .line 152
    move/from16 v8, p5

    .line 153
    .line 154
    invoke-direct/range {v7 .. v12}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 158
    .line 159
    .line 160
    goto :goto_8

    .line 161
    :catch_0
    move-exception v0

    .line 162
    const-string v1, "FastKV"

    .line 163
    .line 164
    iget-object p0, p0, Lac/o;->b:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v1, p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    .line 168
    .line 169
    goto :goto_8

    .line 170
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v1, "object with tag: "

    .line 173
    .line 174
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v1, " without encoder"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {p0, v0}, Lg4/a;->m(Lac/o;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_8
    add-int p0, p4, v3

    .line 193
    .line 194
    add-int/2addr p0, v11

    .line 195
    iput p0, p1, Lac/k;->h:I

    .line 196
    .line 197
    return-void

    .line 198
    :cond_9
    new-instance p0, Ljava/lang/Exception;

    .line 199
    .line 200
    const-string v0, "parse dara failed"

    .line 201
    .line 202
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p0

    .line 206
    :cond_a
    if-eqz v12, :cond_b

    .line 207
    .line 208
    invoke-virtual {p1, v11}, Lac/k;->w(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    :goto_9
    move-object v10, p0

    .line 213
    goto :goto_a

    .line 214
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-array p0, v11, [B

    .line 218
    .line 219
    iget-object v0, p1, Lac/k;->j:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, [B

    .line 222
    .line 223
    iget v4, p1, Lac/k;->h:I

    .line 224
    .line 225
    invoke-static {v0, v4, p0, v5, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 226
    .line 227
    .line 228
    iget v0, p1, Lac/k;->h:I

    .line 229
    .line 230
    add-int/2addr v0, v11

    .line 231
    iput v0, p1, Lac/k;->h:I

    .line 232
    .line 233
    goto :goto_9

    .line 234
    :goto_a
    new-instance v7, Lac/a;

    .line 235
    .line 236
    add-int v9, p4, v3

    .line 237
    .line 238
    move/from16 v8, p5

    .line 239
    .line 240
    invoke-direct/range {v7 .. v12}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_c
    if-eqz v12, :cond_d

    .line 248
    .line 249
    invoke-virtual {p1, v11}, Lac/k;->w(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :goto_b
    move-object v10, p0

    .line 254
    goto :goto_c

    .line 255
    :cond_d
    invoke-virtual {p1, v11}, Lac/k;->w(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    goto :goto_b

    .line 260
    :goto_c
    new-instance v7, Lac/i;

    .line 261
    .line 262
    add-int v9, p4, v3

    .line 263
    .line 264
    move/from16 v8, p5

    .line 265
    .line 266
    invoke-direct/range {v7 .. v12}, Lac/j;-><init>(IILjava/lang/Object;IZ)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, v1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static O(Lac/o;Z)Z
    .locals 11

    .line 1
    const-string v1, "FastKV"

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string p1, "miss cipher"

    .line 7
    .line 8
    invoke-static {p0, p1}, Lg4/a;->m(Lac/o;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return v2

    .line 12
    :cond_0
    iget-object v4, p0, Lac/o;->h:Lac/k;

    .line 13
    .line 14
    iget-object p1, p0, Lac/o;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/16 v0, 0xc

    .line 17
    .line 18
    iput v0, v4, Lac/k;->h:I

    .line 19
    .line 20
    :goto_0
    :try_start_0
    iget v8, v4, Lac/k;->h:I

    .line 21
    .line 22
    iget v0, p0, Lac/o;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    const-string v3, "parse dara failed"

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    if-ge v8, v0, :cond_9

    .line 28
    .line 29
    :try_start_1
    iget-object v0, v4, Lac/k;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, [B

    .line 32
    .line 33
    add-int/lit8 v6, v8, 0x1

    .line 34
    .line 35
    iput v6, v4, Lac/k;->h:I

    .line 36
    .line 37
    aget-byte v9, v0, v8

    .line 38
    .line 39
    and-int/lit8 v7, v9, 0x3f

    .line 40
    .line 41
    int-to-byte v7, v7

    .line 42
    if-lt v7, v5, :cond_8

    .line 43
    .line 44
    const/16 v10, 0xb

    .line 45
    .line 46
    if-gt v7, v10, :cond_8

    .line 47
    .line 48
    add-int/lit8 v3, v8, 0x2

    .line 49
    .line 50
    iput v3, v4, Lac/k;->h:I

    .line 51
    .line 52
    aget-byte v0, v0, v6

    .line 53
    .line 54
    and-int/lit16 v0, v0, 0xff

    .line 55
    .line 56
    if-eqz v0, :cond_7

    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    if-gez v9, :cond_5

    .line 60
    .line 61
    add-int/2addr v3, v0

    .line 62
    iput v3, v4, Lac/k;->h:I

    .line 63
    .line 64
    if-gt v7, v6, :cond_1

    .line 65
    .line 66
    sget-object v0, Lac/o;->z:[I

    .line 67
    .line 68
    aget v0, v0, v7

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catch_0
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_1
    const/16 v0, 0x9

    .line 76
    .line 77
    if-eq v7, v0, :cond_3

    .line 78
    .line 79
    const/16 v0, 0xa

    .line 80
    .line 81
    if-eq v7, v0, :cond_3

    .line 82
    .line 83
    if-ne v7, v10, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move v5, v2

    .line 87
    :cond_3
    :goto_1
    if-eqz v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v4}, Lac/k;->q()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {v4}, Lac/k;->u()S

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const v3, 0xffff

    .line 99
    .line 100
    .line 101
    and-int/2addr v0, v3

    .line 102
    :goto_2
    iget v3, v4, Lac/k;->h:I

    .line 103
    .line 104
    add-int/2addr v3, v0

    .line 105
    iput v3, v4, Lac/k;->h:I

    .line 106
    .line 107
    iget v0, p0, Lac/o;->n:I

    .line 108
    .line 109
    sub-int v5, v3, v8

    .line 110
    .line 111
    add-int/2addr v5, v0

    .line 112
    iput v5, p0, Lac/o;->n:I

    .line 113
    .line 114
    iget-object v0, p0, Lac/o;->o:Ljava/util/ArrayList;

    .line 115
    .line 116
    new-instance v5, Lac/r;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput v8, v5, Lac/r;->g:I

    .line 122
    .line 123
    iput v3, v5, Lac/r;->h:I

    .line 124
    .line 125
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    invoke-virtual {v4, v0}, Lac/k;->w(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    move v5, v7

    .line 134
    iget v7, v4, Lac/k;->h:I

    .line 135
    .line 136
    if-gt v5, v6, :cond_6

    .line 137
    .line 138
    invoke-static {p0, v4, v5, v0, v7}, Lbe/h;->M(Lac/o;Lac/k;BLjava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    move-object v3, p0

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move-object v3, p0

    .line 144
    move-object v6, v0

    .line 145
    invoke-static/range {v3 .. v9}, Lbe/h;->N(Lac/o;Lac/k;BLjava/lang/String;IIB)V

    .line 146
    .line 147
    .line 148
    :goto_3
    move-object p0, v3

    .line 149
    goto/16 :goto_0

    .line 150
    .line 151
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string v0, "invalid key size"

    .line 154
    .line 155
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p0

    .line 159
    :cond_8
    new-instance p0, Ljava/lang/Exception;

    .line 160
    .line 161
    invoke-direct {p0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    :cond_9
    if-eq v8, v0, :cond_a

    .line 166
    .line 167
    new-instance p0, Ljava/lang/Exception;

    .line 168
    .line 169
    invoke-direct {p0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 173
    .line 174
    .line 175
    return v2

    .line 176
    :cond_a
    return v5

    .line 177
    :goto_4
    invoke-static {v1, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 178
    .line 179
    .line 180
    return v2
.end method

.method public static final P(Ll0/k;Li0/a;I)V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Ll0/k;->v:I

    .line 2
    .line 3
    if-le p2, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Ll0/k;->u:I

    .line 6
    .line 7
    if-lt p2, v1, :cond_1

    .line 8
    .line 9
    :cond_0
    if-nez v0, :cond_2

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    :cond_1
    return-void

    .line 14
    :cond_2
    invoke-virtual {p0}, Ll0/k;->M()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Ll0/k;->v:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ll0/k;->y(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Li0/a;->k()V

    .line 26
    .line 27
    .line 28
    :cond_3
    invoke-virtual {p0}, Ll0/k;->j()V

    .line 29
    .line 30
    .line 31
    goto :goto_0
.end method

.method public static Q(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0}, Lbe/h;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v1, "\n\n\u5f15\u7528\uff1a"

    .line 19
    .line 20
    invoke-static {v0, v1, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static R(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Lbe/h;->o0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbe/h;->n0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "type"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "49"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const-string v4, "title"

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    const-string v3, "57"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    :cond_0
    invoke-static {v1}, Lbe/h;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2, v4}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    invoke-static {v1}, Lbe/h;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, v4}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v2, "refermsg"

    .line 57
    .line 58
    invoke-static {p0, v2}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    filled-new-array {v1, v0, p0}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lbe/h;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public static S(Ljava/io/InputStream;)Ljava/util/HashMap;
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    .line 2
    .line 3
    new-instance v1, Ljava/io/InputStreamReader;

    .line 4
    .line 5
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    :try_start_1
    new-instance p0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    const/4 v2, 0x0

    .line 29
    const/16 v3, 0x8

    .line 30
    .line 31
    :try_start_3
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const/16 v3, 0x10

    .line 36
    .line 37
    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/16 v3, 0x9

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_5
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    throw p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 65
    :catch_0
    move-exception p0

    .line 66
    new-instance v0, Laf/g;

    .line 67
    .line 68
    const-string v1, "Failed to read res-map file"

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v0
.end method

.method public static T(Ljava/nio/MappedByteBuffer;)Lm3/b;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0xffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const-string v2, "Cannot read metadata."

    .line 30
    .line 31
    if-gt v0, v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v3, v1

    .line 44
    :goto_0
    const-wide v4, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide/16 v6, -0x1

    .line 50
    .line 51
    if-ge v3, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    add-int/lit8 v9, v9, 0x4

    .line 62
    .line 63
    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    int-to-long v9, v9

    .line 71
    and-long/2addr v9, v4

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    add-int/lit8 v11, v11, 0x4

    .line 77
    .line 78
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 79
    .line 80
    .line 81
    const v11, 0x6d657461

    .line 82
    .line 83
    .line 84
    if-ne v11, v8, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-wide v9, v6

    .line 91
    :goto_1
    cmp-long v0, v9, v6

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v6, v0

    .line 100
    sub-long v6, v9, v6

    .line 101
    .line 102
    long-to-int v0, v6

    .line 103
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/2addr v3, v0

    .line 108
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, 0xc

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v6, v0

    .line 125
    and-long/2addr v6, v4

    .line 126
    :goto_2
    int-to-long v11, v1

    .line 127
    cmp-long v0, v11, v6

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-long v11, v3

    .line 140
    and-long/2addr v11, v4

    .line 141
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 142
    .line 143
    .line 144
    const v3, 0x456d6a69

    .line 145
    .line 146
    .line 147
    if-eq v3, v0, :cond_3

    .line 148
    .line 149
    const v3, 0x656d6a69

    .line 150
    .line 151
    .line 152
    if-ne v3, v0, :cond_2

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    :goto_3
    add-long/2addr v11, v9

    .line 159
    long-to-int v0, v11

    .line 160
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lm3/b;

    .line 164
    .line 165
    invoke-direct {v0}, Lm3/c;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 169
    .line 170
    invoke-static {p0, v1}, Lj8/b;->d(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    add-int/2addr v2, v1

    .line 179
    iput-object p0, v0, Lm3/c;->j:Ljava/lang/Object;

    .line 180
    .line 181
    iput v2, v0, Lm3/c;->g:I

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    sub-int/2addr v2, p0

    .line 188
    iput v2, v0, Lm3/c;->h:I

    .line 189
    .line 190
    iget-object p0, v0, Lm3/c;->j:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    iput p0, v0, Lm3/c;->i:I

    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_4
    invoke-static {v2}, Lj8/o;->y(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :goto_4
    const/4 p0, 0x0

    .line 205
    return-object p0

    .line 206
    :cond_5
    invoke-static {v2}, Lj8/o;->y(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto :goto_4
.end method

.method public static U(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

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
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    const-string v0, "<"

    .line 10
    .line 11
    const-string v1, "(?:\\s[^>]*)?>(.*?)</"

    .line 12
    .line 13
    const-string v2, ">"

    .line 14
    .line 15
    invoke-static {v0, p1, v1, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Log/l;->h:Log/l;

    .line 20
    .line 21
    sget-object v3, Log/l;->i:Log/l;

    .line 22
    .line 23
    filled-new-array {v1, v3}, [Log/l;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v3, 0x0

    .line 38
    move v4, v3

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Log/l;

    .line 50
    .line 51
    iget v5, v5, Log/l;->g:I

    .line 52
    .line 53
    or-int/2addr v4, v5

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v4}, Ll3/w;->f(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v3, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const/16 v4, 0x3e

    .line 84
    .line 85
    const/4 v5, 0x6

    .line 86
    invoke-static {v1, v4, v3, v5}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const-string v3, "</"

    .line 97
    .line 98
    invoke-static {v3, p1, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v0}, Log/i;->b()Llg/d;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget p2, v0, Llg/b;->g:I

    .line 128
    .line 129
    iget v0, v0, Llg/b;->h:I

    .line 130
    .line 131
    add-int/lit8 v0, v0, 0x1

    .line 132
    .line 133
    invoke-static {p0, p2, v0, p1}, Log/m;->C0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static W(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

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
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Log/k;

    .line 9
    .line 10
    const-string v1, "(?:\\s[^>]*)?>(.*?)</"

    .line 11
    .line 12
    const-string v2, ">"

    .line 13
    .line 14
    const-string v3, "<"

    .line 15
    .line 16
    invoke-static {v3, p1, v1, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    sget-object v2, Log/l;->h:Log/l;

    .line 21
    .line 22
    sget-object v3, Log/l;->i:Log/l;

    .line 23
    .line 24
    filled-new-array {v2, v3}, [Log/l;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Leb/g;

    .line 36
    .line 37
    const/16 v2, 0x8

    .line 38
    .line 39
    invoke-direct {v1, v2, p2, p1}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0, v1}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final X(Ljava/lang/Object;Ljava/lang/reflect/Method;Lfg/p;)Lb/e;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    :cond_0
    move-object v4, v1

    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_1
    new-instance v2, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayDeque;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    new-instance v4, Lk8/c;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v4, p0, v5}, Lk8/c;-><init>(Ljava/lang/Object;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_0

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lk8/c;

    .line 57
    .line 58
    iget-object v4, p0, Lk8/c;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iget p0, p0, Lk8/c;->b:I

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_3
    const/4 v6, 0x4

    .line 71
    if-lt p0, v6, :cond_4

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    :goto_1
    if-eqz v7, :cond_8

    .line 84
    .line 85
    const-class v8, Ljava/lang/Object;

    .line 86
    .line 87
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-nez v8, :cond_8

    .line 92
    .line 93
    invoke-static {v7}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    :cond_5
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_7

    .line 106
    .line 107
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    check-cast v9, Ljava/lang/reflect/Field;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_5

    .line 122
    .line 123
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_5

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_6

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_6
    invoke-static {v9, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    if-eqz v9, :cond_5

    .line 149
    .line 150
    const-string v10, "com.tencent.mm.ui.chatting.component."

    .line 151
    .line 152
    invoke-static {v10, v9, v5}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v10

    .line 156
    if-eqz v10, :cond_5

    .line 157
    .line 158
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    goto :goto_1

    .line 167
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    :cond_9
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_2

    .line 176
    .line 177
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_9

    .line 186
    .line 187
    new-instance v7, Lk8/c;

    .line 188
    .line 189
    add-int/lit8 v8, p0, 0x1

    .line 190
    .line 191
    invoke-direct {v7, v6, v8}, Lk8/c;-><init>(Ljava/lang/Object;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v7}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :goto_4
    if-nez v4, :cond_a

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    const-string p1, "\u672a\u627e\u5230\u591a\u9009\u6d88\u606f\u539f\u751f\u9000\u51fa\u7ec4\u4ef6: "

    .line 209
    .line 210
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-interface {p2, p0, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    return-object v1

    .line 218
    :cond_a
    new-instance p0, Lb/e;

    .line 219
    .line 220
    invoke-direct {p0, v4, p1}, Lb/e;-><init>(Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 221
    .line 222
    .line 223
    return-object p0
.end method

.method public static Y(Ljava/util/List;Lnd/b0;)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static Z(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, -0x1

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public static final a(Landroid/content/Context;)Lu2/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 10
    .line 11
    new-instance v1, Lu2/e;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 22
    .line 23
    invoke-static {v0}, Lv2/b;->a(F)Lv2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v2, Lu2/n;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lu2/n;-><init>(F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-direct {v1, p0, v0, v2}, Lu2/e;-><init>(FFLv2/a;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method

.method public static a0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lk8/s;->b(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-wide v1, v1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 30
    .line 31
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 32
    .line 33
    cmp-long v1, v1, v3

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    new-instance v1, Landroid/content/ContentValues;

    .line 38
    .line 39
    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v2, "content"

    .line 43
    .line 44
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 48
    .line 49
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    const-string v3, "msgType"

    .line 54
    .line 55
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 59
    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    const-string v3, "isSend"

    .line 65
    .line 66
    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    .line 68
    .line 69
    const-string v2, "digest"

    .line 70
    .line 71
    invoke-static {p0, p1}, Lbe/h;->s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 79
    .line 80
    filled-new-array {p0}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "rconversation"

    .line 85
    .line 86
    const-string v2, "username=?"

    .line 87
    .line 88
    invoke-virtual {v0, p1, v1, v2, p0}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public static final b(FFFFJ)Le1/d;
    .locals 17

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p4, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long v4, p4, v2

    .line 16
    .line 17
    long-to-int v4, v4

    .line 18
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v5, v1

    .line 27
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-long v7, v1

    .line 32
    shl-long v0, v5, v0

    .line 33
    .line 34
    and-long/2addr v2, v7

    .line 35
    or-long v9, v0, v2

    .line 36
    .line 37
    new-instance v4, Le1/d;

    .line 38
    .line 39
    move-wide v11, v9

    .line 40
    move-wide v13, v9

    .line 41
    move-wide v15, v9

    .line 42
    move/from16 v5, p0

    .line 43
    .line 44
    move/from16 v6, p1

    .line 45
    .line 46
    move/from16 v7, p2

    .line 47
    .line 48
    move/from16 v8, p3

    .line 49
    .line 50
    invoke-direct/range {v4 .. v16}, Le1/d;-><init>(FFFFJJJJ)V

    .line 51
    .line 52
    .line 53
    return-object v4
.end method

.method public static b0(Ljava/util/Iterator;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lz7/i;->g:Lz7/i;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v1, Lz7/c;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v2}, Lz7/c;-><init>(I)V

    .line 14
    .line 15
    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, v0}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p0, v1, Lz7/c;->i:I

    .line 31
    .line 32
    const/16 v0, 0x3e8

    .line 33
    .line 34
    if-le p0, v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Lz7/c;->m()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-object v1
.end method

.method public static final c(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 7

    .line 1
    const v0, -0x6e8e8303

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    and-int/lit8 v1, v0, 0x13

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p2, v0, v1}, Li0/h0;->S(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sget-object v1, Li0/l;->a:Li0/e;

    .line 39
    .line 40
    if-ne v0, v1, :cond_2

    .line 41
    .line 42
    sget-object v0, Lh0/p0;->a:Lh0/p0;

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    check-cast v0, Lv1/n0;

    .line 48
    .line 49
    iget-wide v1, p2, Li0/h0;->T:J

    .line 50
    .line 51
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p2}, Li0/h0;->l()Ls0/h;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {p2, p0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, Lx1/g;->f:Lx1/f;

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v5, Lx1/f;->b:Lx1/y;

    .line 69
    .line 70
    invoke-virtual {p2}, Li0/h0;->d0()V

    .line 71
    .line 72
    .line 73
    iget-boolean v6, p2, Li0/h0;->S:Z

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    invoke-virtual {p2, v5}, Li0/h0;->k(Lfg/a;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-virtual {p2}, Li0/h0;->n0()V

    .line 82
    .line 83
    .line 84
    :goto_2
    sget-object v5, Lx1/f;->e:Lx1/e;

    .line 85
    .line 86
    invoke-static {v5, p2, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lx1/f;->d:Lx1/e;

    .line 90
    .line 91
    invoke-static {v0, p2, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v1, Lx1/f;->f:Lx1/e;

    .line 99
    .line 100
    invoke-static {v1, p2, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lx1/f;->g:Lx1/d;

    .line 104
    .line 105
    invoke-static {v0, p2}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 106
    .line 107
    .line 108
    sget-object v0, Lx1/f;->c:Lx1/e;

    .line 109
    .line 110
    invoke-static {v0, p2, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    const/4 v0, 0x6

    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1, p2, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, v3}, Li0/h0;->p(Z)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 126
    .line 127
    .line 128
    :goto_3
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    if-eqz p2, :cond_5

    .line 133
    .line 134
    new-instance v0, Lb0/q;

    .line 135
    .line 136
    const/4 v1, 0x5

    .line 137
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public static c0(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "payerdes"

    .line 2
    .line 3
    const-string v1, "receiverdes"

    .line 4
    .line 5
    const-string v2, "feedesc"

    .line 6
    .line 7
    const-string v3, "title"

    .line 8
    .line 9
    const-string v4, "desc"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0, v1}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Lbe/h;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v1, v5

    .line 48
    :goto_0
    if-eqz v1, :cond_2

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_2
    const-string v0, "total_fee"

    .line 52
    .line 53
    invoke-static {p0, v0}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "feederval"

    .line 58
    .line 59
    invoke-static {p0, v1}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v6, "fee"

    .line 64
    .line 65
    invoke-static {p0, v6}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    filled-new-array {v0, v1, v6}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lbe/h;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-static {p0, v2}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {p0, v3}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {p0, v4}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    filled-new-array {v0, v1, p0}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, Lbe/h;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lbe/h;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-eqz p0, :cond_4

    .line 113
    .line 114
    invoke-static {p0}, Lbe/h;->i(Ljava/lang/String;)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    :cond_4
    if-eqz v5, :cond_6

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    :goto_1
    new-instance p0, Ljava/math/BigDecimal;

    .line 125
    .line 126
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(J)V

    .line 127
    .line 128
    .line 129
    const/4 v0, 0x2

    .line 130
    invoke-virtual {p0, v0}, Ljava/math/BigDecimal;->movePointLeft(I)Ljava/math/BigDecimal;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/math/BigDecimal;->signum()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_5

    .line 139
    .line 140
    new-instance p0, Ljava/math/BigDecimal;

    .line 141
    .line 142
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 143
    .line 144
    const/4 v1, 0x0

    .line 145
    invoke-direct {p0, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    invoke-virtual {p0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    :goto_2
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :cond_6
    const-string p0, ""

    .line 162
    .line 163
    return-object p0
.end method

.method public static final d(ILjava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p3

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p0, p3, v2, v0}, Ltf/l;->r0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    array-length v2, p3

    .line 14
    invoke-static {v1, p0, p3, v2, v0}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    aput-object p1, v0, p0

    .line 18
    .line 19
    add-int/lit8 p0, p0, 0x1

    .line 20
    .line 21
    aput-object p2, v0, p0

    .line 22
    .line 23
    return-object v0
.end method

.method public static d0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Lbe/h;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "feedesc"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "title"

    .line 12
    .line 13
    invoke-static {p0, v2}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "desc"

    .line 18
    .line 19
    invoke-static {p0, v3}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    filled-new-array {v1, v2, p0}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lbe/h;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    const-string p0, "\uffe5"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method

.method public static final e(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p0, p1, v2, v0}, Ltf/l;->r0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p0, v1, p1, v2, v0}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static e0(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&lt;"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "&gt;"

    .line 11
    .line 12
    const-string v1, ">"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&amp;"

    .line 19
    .line 20
    const-string v1, "&"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&quot;"

    .line 27
    .line 28
    const-string v1, "\""

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&apos;"

    .line 35
    .line 36
    const-string v1, "\'"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static final f(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p0, p1, v2, v0}, Ltf/l;->r0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x1

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p0, v1, p1, v2, v0}, Ltf/l;->n0(II[Ljava/lang/Object;I[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static f0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;Ljava/lang/Object;)Lf9/f;
    .locals 6

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 9
    .line 10
    invoke-virtual {v0, v2, v3, p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->updateNativeMessageContent(JLjava/lang/String;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    new-instance p0, Lf9/f;

    .line 18
    .line 19
    invoke-direct {p0, v2, v2}, Lf9/f;-><init>(ZZ)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p2, Landroid/content/ContentValues;

    .line 24
    .line 25
    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "content"

    .line 29
    .line 30
    invoke-virtual {p2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableForTalker(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v3, 0x0

    .line 55
    :goto_0
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    const-string v3, "message"

    .line 61
    .line 62
    invoke-interface {p1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_4

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v3, Ljava/lang/String;

    .line 86
    .line 87
    iget-wide v4, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 88
    .line 89
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    filled-new-array {v4}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    const-string v5, "msgId=?"

    .line 98
    .line 99
    invoke-virtual {v0, v3, p2, v5, v4}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-lez v3, :cond_3

    .line 104
    .line 105
    new-instance p0, Lf9/f;

    .line 106
    .line 107
    invoke-direct {p0, v2, v1}, Lf9/f;-><init>(ZZ)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_4
    new-instance p0, Lf9/f;

    .line 112
    .line 113
    invoke-direct {p0, v1, v1}, Lf9/f;-><init>(ZZ)V

    .line 114
    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_5
    new-instance p0, Lf9/f;

    .line 118
    .line 119
    invoke-direct {p0, v1, v1}, Lf9/f;-><init>(ZZ)V

    .line 120
    .line 121
    .line 122
    return-object p0
.end method

.method public static g(Ljava/util/Collection;Ljava/util/function/Predicate;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p1}, Lbe/h;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "title"

    .line 6
    .line 7
    invoke-static {p0, v0, p1}, Lbe/h;->V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lbe/h;->o0(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-static {p1}, Lbe/h;->n0(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    move-object v1, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-static {p2}, Lbe/h;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "&lt;title&gt;"

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-static {v1, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sget-object v5, Log/l;->i:Log/l;

    .line 51
    .line 52
    sget-object v6, Log/l;->h:Log/l;

    .line 53
    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    const-string v3, "&lt;/title&gt;"

    .line 57
    .line 58
    invoke-static {v1, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    new-instance v3, Log/k;

    .line 65
    .line 66
    filled-new-array {v6, v5}, [Log/l;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-static {v4}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "&lt;title&gt;.*?&lt;/title&gt;"

    .line 75
    .line 76
    invoke-direct {v3, v5, v4}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 77
    .line 78
    .line 79
    new-instance v4, Lca/s;

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    invoke-direct {v4, v2, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v1, v4}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string v3, "<title>"

    .line 91
    .line 92
    invoke-static {v1, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_2

    .line 97
    .line 98
    const-string v3, "</title>"

    .line 99
    .line 100
    invoke-static {v1, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_2

    .line 105
    .line 106
    new-instance v3, Log/k;

    .line 107
    .line 108
    filled-new-array {v6, v5}, [Log/l;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "<title>.*?</title>"

    .line 117
    .line 118
    invoke-direct {v3, v5, v4}, Log/k;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 119
    .line 120
    .line 121
    new-instance v4, Lca/s;

    .line 122
    .line 123
    const/4 v5, 0x4

    .line 124
    invoke-direct {v4, v2, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v1, v4}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_2
    :goto_0
    const-string v1, "content"

    .line 132
    .line 133
    invoke-static {p1, v1, v2}, Lbe/h;->V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_1
    invoke-static {p2}, Lbe/h;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {v1, v0, p2}, Lbe/h;->V(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_3

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-static {p0, p1, p2, v0}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    :cond_3
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Lbe/h;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    invoke-static {p0, v2, v1}, Log/m;->J0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {p0, v2}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v0

    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v1, 0x0

    .line 40
    :goto_1
    :try_start_0
    new-instance v2, Ljava/math/BigDecimal;

    .line 41
    .line 42
    invoke-direct {v2, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 46
    .line 47
    invoke-virtual {v2, p0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-gez p0, :cond_2

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_2
    sget-object p0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    .line 55
    .line 56
    invoke-virtual {v2, v1, p0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    goto :goto_2

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    new-instance v1, Lsf/f;

    .line 67
    .line 68
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p0, v1

    .line 72
    :goto_2
    nop

    .line 73
    instance-of v1, p0, Lsf/f;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move-object v0, p0

    .line 79
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 80
    .line 81
    :cond_4
    :goto_4
    return-object v0
.end method

.method public static h0(Lbe/a;Lud/e;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lbe/a;->h(Lud/e;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lud/e;->v:Ljava/util/List;

    .line 8
    .line 9
    new-instance v1, Lbe/g;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, v2}, Lbe/g;-><init>(Lbe/a;I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lud/e;->t:Ljava/util/List;

    .line 19
    .line 20
    new-instance v1, Lbe/g;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, p0, v2}, Lbe/g;-><init>(Lbe/a;I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception v0

    .line 31
    goto :goto_0

    .line 32
    :catch_1
    move-exception v0

    .line 33
    goto :goto_0

    .line 34
    :catch_2
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void

    .line 37
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, " in pass: "

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p0, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/Long;
    .locals 6

    .line 1
    invoke-static {p0}, Lbe/h;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_4

    .line 7
    .line 8
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :try_start_0
    new-instance v2, Ljava/math/BigDecimal;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-gez p0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 p0, 0x2

    .line 31
    invoke-virtual {v2, p0}, Ljava/math/BigDecimal;->movePointRight(I)Ljava/math/BigDecimal;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v2, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/math/BigDecimal;->longValueExact()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    new-instance v2, Lsf/f;

    .line 52
    .line 53
    invoke-direct {v2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object p0, v2

    .line 57
    :goto_0
    nop

    .line 58
    instance-of v2, p0, Lsf/f;

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :cond_2
    check-cast p0, Ljava/lang/Long;

    .line 64
    .line 65
    if-eqz p0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    const-wide/16 v4, 0x0

    .line 72
    .line 73
    cmp-long v2, v2, v4

    .line 74
    .line 75
    if-ltz v2, :cond_3

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    :cond_3
    if-eqz v1, :cond_4

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static i0(Lbe/a;Lud/r;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 2
    .line 3
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->b(Loc/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lbe/a;->g(Lud/r;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    :catch_1
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :catch_2
    move-exception v0

    .line 21
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " in pass: "

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p0, v0}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "[0-9]+(?:\\.[0-9]{1,2})?"

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Log/i;->c()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Lbe/h;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_0
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method

.method public static j0(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const-string v2, ":\n"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v0, v2, v3, v3, v1}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isIncoming()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x2

    .line 28
    .line 29
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_0
    return-object p1
.end method

.method public static k(Ljava/util/Collection;Ljava/util/function/Predicate;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1, v0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public static k0(Ljava/lang/Object;Ljava/lang/String;I)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :goto_0
    if-eqz v0, :cond_3

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    move-object v5, v4

    .line 44
    check-cast v5, Ljava/lang/reflect/Field;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-nez v6, :cond_0

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/4 v2, 0x0

    .line 106
    if-eqz v1, :cond_8

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Ljava/lang/reflect/Field;

    .line 113
    .line 114
    invoke-static {v1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    instance-of v4, v3, Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    check-cast v3, Ljava/lang/Integer;

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    const/4 v3, 0x0

    .line 126
    :goto_4
    if-eqz v3, :cond_4

    .line 127
    .line 128
    const v4, 0x14b857

    .line 129
    .line 130
    .line 131
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {v1, p0, v5}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    new-instance v6, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v5, v4, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    goto :goto_5

    .line 170
    :catchall_0
    move-exception v2

    .line 171
    new-instance v4, Lsf/f;

    .line 172
    .line 173
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object v2, v4

    .line 177
    :goto_5
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 178
    .line 179
    instance-of v5, v2, Lsf/f;

    .line 180
    .line 181
    if-eqz v5, :cond_7

    .line 182
    .line 183
    move-object v2, v4

    .line 184
    :cond_7
    check-cast v2, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-static {v1, p0, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    if-eqz v2, :cond_4

    .line 194
    .line 195
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {v1, p0, p1}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    return p0

    .line 204
    :cond_8
    return v2
.end method

.method public static l(J)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "msg_"

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static l0(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, "coverTimeStampMs="

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    if-eqz v1, :cond_3

    .line 13
    .line 14
    const-class v3, Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    move-object v6, v5

    .line 46
    check-cast v6, Ljava/lang/reflect/Field;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-nez v7, :cond_0

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/reflect/Field;

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    instance-of v4, v3, Ljava/lang/Long;

    .line 120
    .line 121
    if-eqz v4, :cond_5

    .line 122
    .line 123
    check-cast v3, Ljava/lang/Long;

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    const/4 v3, 0x0

    .line 127
    :goto_4
    if-eqz v3, :cond_4

    .line 128
    .line 129
    const-wide v4, 0x13c29d147ddL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v2, p0, v6}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_6

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    new-instance v7, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    const/4 v5, 0x0

    .line 165
    invoke-static {v6, v4, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    goto :goto_5

    .line 174
    :catchall_0
    move-exception v4

    .line 175
    new-instance v5, Lsf/f;

    .line 176
    .line 177
    invoke-direct {v5, v4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v4, v5

    .line 181
    :goto_5
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 182
    .line 183
    instance-of v6, v4, Lsf/f;

    .line 184
    .line 185
    if-eqz v6, :cond_7

    .line 186
    .line 187
    move-object v4, v5

    .line 188
    :cond_7
    check-cast v4, Ljava/lang/Boolean;

    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    if-eqz v4, :cond_4

    .line 198
    .line 199
    const-wide/16 v0, 0x0

    .line 200
    .line 201
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v2, p0, v0}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_8
    return-void
.end method

.method public static final m(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "index: "

    .line 7
    .line 8
    const-string v1, ", size: "

    .line 9
    .line 10
    invoke-static {p0, v0, v1, p1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static m0(Le5/a;Lk5/w;Z)V
    .locals 11

    .line 1
    iget-object v0, p1, Lk5/w;->m:Lw5/a;

    .line 2
    .line 3
    iget v1, p1, Lk5/w;->l:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p2, :cond_b

    .line 7
    .line 8
    sget-object p2, Lf5/a;->l:Lf5/a;

    .line 9
    .line 10
    invoke-virtual {p2, v1}, Lf5/a;->a(I)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-eqz p2, :cond_b

    .line 15
    .line 16
    sget-object p2, Lf5/a;->m:Lf5/a;

    .line 17
    .line 18
    invoke-virtual {p2, v1}, Lf5/a;->a(I)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_b

    .line 23
    .line 24
    if-eqz v0, :cond_b

    .line 25
    .line 26
    invoke-interface {v0}, Lw5/a;->h()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz p2, :cond_8

    .line 32
    .line 33
    const/4 v4, 0x6

    .line 34
    if-eq p2, v4, :cond_7

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    if-eq p2, v4, :cond_6

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    if-eq p2, v4, :cond_5

    .line 41
    .line 42
    const/4 v4, 0x4

    .line 43
    if-eq p2, v4, :cond_4

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    if-eq p2, v4, :cond_3

    .line 48
    .line 49
    const/16 v4, 0x11

    .line 50
    .line 51
    if-eq p2, v4, :cond_2

    .line 52
    .line 53
    const/16 v4, 0x1e

    .line 54
    .line 55
    if-eq p2, v4, :cond_9

    .line 56
    .line 57
    const/16 v4, 0x1f

    .line 58
    .line 59
    if-eq p2, v4, :cond_1

    .line 60
    .line 61
    :cond_0
    move v3, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move-object p2, v0

    .line 64
    check-cast p2, Lb6/a;

    .line 65
    .line 66
    iget-boolean p2, p2, Lb6/a;->g:Z

    .line 67
    .line 68
    xor-int/2addr v3, p2

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move-object p2, v0

    .line 71
    check-cast p2, Lb6/d;

    .line 72
    .line 73
    iget-wide v4, p2, Lb6/d;->g:D

    .line 74
    .line 75
    const-wide/16 v6, 0x0

    .line 76
    .line 77
    cmpl-double p2, v4, v6

    .line 78
    .line 79
    if-nez p2, :cond_0

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object p2, v0

    .line 83
    check-cast p2, Lb6/e;

    .line 84
    .line 85
    iget p2, p2, Lb6/e;->g:F

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    cmpl-float p2, p2, v4

    .line 89
    .line 90
    if-nez p2, :cond_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    move-object p2, v0

    .line 94
    check-cast p2, Lb6/f;

    .line 95
    .line 96
    iget p2, p2, Lb6/f;->g:I

    .line 97
    .line 98
    if-nez p2, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    move-object p2, v0

    .line 102
    check-cast p2, Lb6/c;

    .line 103
    .line 104
    iget-char p2, p2, Lb6/c;->g:C

    .line 105
    .line 106
    if-nez p2, :cond_0

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_6
    move-object p2, v0

    .line 110
    check-cast p2, Lb6/i;

    .line 111
    .line 112
    iget-short p2, p2, Lb6/i;->g:S

    .line 113
    .line 114
    if-nez p2, :cond_0

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    move-object p2, v0

    .line 118
    check-cast p2, Lb6/g;

    .line 119
    .line 120
    iget-wide v4, p2, Lb6/g;->g:J

    .line 121
    .line 122
    const-wide/16 v6, 0x0

    .line 123
    .line 124
    cmp-long p2, v4, v6

    .line 125
    .line 126
    if-nez p2, :cond_0

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_8
    move-object p2, v0

    .line 130
    check-cast p2, Lb6/b;

    .line 131
    .line 132
    iget-byte p2, p2, Lb6/b;->g:B

    .line 133
    .line 134
    if-nez p2, :cond_0

    .line 135
    .line 136
    :cond_9
    :goto_0
    if-nez v3, :cond_a

    .line 137
    .line 138
    const-string p2, "# The value of this static final field might be set in the static constructor\n"

    .line 139
    .line 140
    invoke-virtual {p0, p2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_a
    const/4 v0, 0x0

    .line 145
    :cond_b
    :goto_1
    const-string p2, ".field "

    .line 146
    .line 147
    invoke-virtual {p0, p2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget p2, p1, Lk5/w;->p:I

    .line 151
    .line 152
    const/4 v3, 0x7

    .line 153
    if-ne p2, v3, :cond_c

    .line 154
    .line 155
    sget-object p2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_c
    invoke-static {p2}, Lf5/c;->a(I)Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-static {p2}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    :goto_2
    sget-object v3, Lf5/a;->n:[Lf5/a;

    .line 167
    .line 168
    array-length v4, v3

    .line 169
    move v5, v2

    .line 170
    move v6, v5

    .line 171
    :goto_3
    if-ge v5, v4, :cond_e

    .line 172
    .line 173
    aget-object v7, v3, v5

    .line 174
    .line 175
    iget-boolean v8, v7, Lf5/a;->k:Z

    .line 176
    .line 177
    if-eqz v8, :cond_d

    .line 178
    .line 179
    iget v7, v7, Lf5/a;->g:I

    .line 180
    .line 181
    and-int/2addr v7, v1

    .line 182
    if-eqz v7, :cond_d

    .line 183
    .line 184
    add-int/lit8 v6, v6, 0x1

    .line 185
    .line 186
    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_e
    new-array v4, v6, [Lf5/a;

    .line 190
    .line 191
    array-length v5, v3

    .line 192
    move v7, v2

    .line 193
    move v8, v7

    .line 194
    :goto_4
    if-ge v7, v5, :cond_10

    .line 195
    .line 196
    aget-object v9, v3, v7

    .line 197
    .line 198
    iget-boolean v10, v9, Lf5/a;->k:Z

    .line 199
    .line 200
    if-eqz v10, :cond_f

    .line 201
    .line 202
    iget v10, v9, Lf5/a;->g:I

    .line 203
    .line 204
    and-int/2addr v10, v1

    .line 205
    if-eqz v10, :cond_f

    .line 206
    .line 207
    add-int/lit8 v10, v8, 0x1

    .line 208
    .line 209
    aput-object v9, v4, v8

    .line 210
    .line 211
    move v8, v10

    .line 212
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 213
    .line 214
    goto :goto_4

    .line 215
    :cond_10
    :goto_5
    const/16 v1, 0x20

    .line 216
    .line 217
    if-ge v2, v6, :cond_11

    .line 218
    .line 219
    aget-object v3, v4, v2

    .line 220
    .line 221
    iget-object v3, v3, Lf5/a;->h:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {p0, v3}, Lq5/a;->write(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v1}, Lq5/a;->write(I)V

    .line 227
    .line 228
    .line 229
    add-int/lit8 v2, v2, 0x1

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_11
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_12

    .line 241
    .line 242
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v2, Lf5/c;

    .line 247
    .line 248
    iget-object v2, v2, Lf5/c;->h:Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p0, v2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v1}, Lq5/a;->write(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_12
    invoke-virtual {p1}, Lk5/w;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p0, p2}, Le5/a;->s(Ljava/lang/CharSequence;)V

    .line 262
    .line 263
    .line 264
    const/16 p2, 0x3a

    .line 265
    .line 266
    invoke-virtual {p0, p2}, Lq5/a;->write(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Lk5/w;->getType()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p2

    .line 273
    invoke-virtual {p0, p2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 274
    .line 275
    .line 276
    if-eqz v0, :cond_13

    .line 277
    .line 278
    const-string p2, " = "

    .line 279
    .line 280
    invoke-virtual {p0, p2}, Lq5/a;->write(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v0}, Le5/a;->g(Lw5/a;)V

    .line 284
    .line 285
    .line 286
    :cond_13
    const/16 p2, 0xa

    .line 287
    .line 288
    invoke-virtual {p0, p2}, Lq5/a;->write(I)V

    .line 289
    .line 290
    .line 291
    iget-object p2, p1, Lk5/w;->j:Lk5/u;

    .line 292
    .line 293
    iget p1, p1, Lk5/w;->n:I

    .line 294
    .line 295
    invoke-static {p2, p1}, Lo5/e;->a(Lk5/u;I)Ljava/util/Set;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 300
    .line 301
    .line 302
    move-result p2

    .line 303
    if-lez p2, :cond_14

    .line 304
    .line 305
    invoke-virtual {p0}, Le5/a;->w()V

    .line 306
    .line 307
    .line 308
    check-cast p1, Ljava/util/Set;

    .line 309
    .line 310
    invoke-static {p0, p1}, Lac/p;->Q(Le5/a;Ljava/util/Set;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0}, Le5/a;->u()V

    .line 314
    .line 315
    .line 316
    const-string p1, ".end field\n"

    .line 317
    .line 318
    invoke-virtual {p0, p1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_14
    return-void
.end method

.method public static final n(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-gt p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "index: "

    .line 7
    .line 8
    const-string v1, ", size: "

    .line 9
    .line 10
    invoke-static {p0, v0, v1, p1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lokio/a;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static n0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

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
    goto :goto_2

    .line 8
    :cond_0
    sget-object v0, Log/l;->h:Log/l;

    .line 9
    .line 10
    sget-object v1, Log/l;->i:Log/l;

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Log/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Log/l;

    .line 39
    .line 40
    iget v3, v3, Log/l;->g:I

    .line 41
    .line 42
    or-int/2addr v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v2}, Ll3/w;->f(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-string v2, "<content(?:\\s[^>]*)?>(.*?)</content>"

    .line 49
    .line 50
    invoke-static {v2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const/4 v0, 0x1

    .line 75
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    const-string v0, "<![CDATA["

    .line 84
    .line 85
    invoke-static {p0, v0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const-string v0, "]]>"

    .line 90
    .line 91
    invoke-static {p0, v0}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const/4 p0, 0x0

    .line 97
    :goto_1
    if-nez p0, :cond_3

    .line 98
    .line 99
    :goto_2
    const-string p0, ""

    .line 100
    .line 101
    :cond_3
    return-object p0
.end method

.method public static final o(III)V
    .locals 3

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, " > toIndex: "

    .line 11
    .line 12
    invoke-static {p0, v0, p2, p1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string v1, ", toIndex: "

    .line 21
    .line 22
    const-string v2, ", size: "

    .line 23
    .line 24
    invoke-static {p0, p1, v0, v1, v2}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p2, p0}, Lj8/o;->e(ILjava/lang/StringBuilder;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static o0(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

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
    goto :goto_2

    .line 8
    :cond_0
    sget-object v0, Log/l;->h:Log/l;

    .line 9
    .line 10
    sget-object v1, Log/l;->i:Log/l;

    .line 11
    .line 12
    filled-new-array {v0, v1}, [Log/l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move v2, v1

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Log/l;

    .line 39
    .line 40
    iget v3, v3, Log/l;->g:I

    .line 41
    .line 42
    or-int/2addr v2, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v2}, Ll3/w;->f(I)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-string v2, "<refermsg(?:\\s[^>]*)?>(.*?)</refermsg>"

    .line 49
    .line 50
    invoke-static {v2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Log/i;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 p0, 0x0

    .line 76
    :goto_1
    if-nez p0, :cond_3

    .line 77
    .line 78
    :goto_2
    const-string p0, ""

    .line 79
    .line 80
    :cond_3
    return-object p0
.end method

.method public static final p(Le1/c;FF)Z
    .locals 2

    .line 1
    iget v0, p0, Le1/c;->a:F

    .line 2
    .line 3
    iget v1, p0, Le1/c;->c:F

    .line 4
    .line 5
    cmpg-float v1, p1, v1

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    cmpg-float p1, v0, p1

    .line 10
    .line 11
    if-gtz p1, :cond_0

    .line 12
    .line 13
    iget p1, p0, Le1/c;->b:F

    .line 14
    .line 15
    iget p0, p0, Le1/c;->d:F

    .line 16
    .line 17
    cmpg-float p0, p2, p0

    .line 18
    .line 19
    if-gtz p0, :cond_0

    .line 20
    .line 21
    cmpg-float p0, p1, p2

    .line 22
    .line 23
    if-gtz p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    const-string v0, "(?:\\s[^>]*)?>(.*?)</"

    .line 11
    .line 12
    const-string v2, ">"

    .line 13
    .line 14
    const-string v3, "<"

    .line 15
    .line 16
    invoke-static {v3, p1, v0, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Log/l;->h:Log/l;

    .line 21
    .line 22
    sget-object v2, Log/l;->i:Log/l;

    .line 23
    .line 24
    filled-new-array {v0, v2}, [Log/l;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v2, 0x0

    .line 39
    move v3, v2

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Log/l;

    .line 51
    .line 52
    iget v4, v4, Log/l;->g:I

    .line 53
    .line 54
    or-int/2addr v3, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {v3}, Ll3/w;->f(I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v2, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Log/i;->a()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const/4 p1, 0x1

    .line 85
    invoke-static {p1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Ljava/lang/String;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    const/4 p0, 0x0

    .line 93
    :goto_1
    if-nez p0, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v1, p0

    .line 97
    :goto_2
    const-string p0, "<![CDATA["

    .line 98
    .line 99
    invoke-static {v1, p0}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string p1, "]]>"

    .line 104
    .line 105
    invoke-static {p0, p1}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lbe/h;->e0(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0
.end method

.method public static q(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    and-int/lit16 v1, v1, 0xff

    .line 22
    .line 23
    int-to-char v1, v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const/16 v2, 0x80

    .line 32
    .line 33
    if-ge v1, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    and-int/lit16 v3, v1, 0xe0

    .line 40
    .line 41
    const/16 v4, 0xc0

    .line 42
    .line 43
    if-ne v3, v4, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    and-int/lit16 v4, v3, 0xc0

    .line 50
    .line 51
    if-ne v4, v2, :cond_3

    .line 52
    .line 53
    and-int/lit8 v1, v1, 0x1f

    .line 54
    .line 55
    shl-int/lit8 v1, v1, 0x6

    .line 56
    .line 57
    and-int/lit8 v2, v3, 0x3f

    .line 58
    .line 59
    or-int/2addr v1, v2

    .line 60
    int-to-char v1, v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 66
    .line 67
    const-string v0, "bad second byte"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_4
    and-int/lit16 v3, v1, 0xf0

    .line 74
    .line 75
    const/16 v4, 0xe0

    .line 76
    .line 77
    if-ne v3, v4, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    and-int/lit16 v5, v3, 0xc0

    .line 88
    .line 89
    if-ne v5, v2, :cond_5

    .line 90
    .line 91
    and-int/lit16 v5, v4, 0xc0

    .line 92
    .line 93
    if-ne v5, v2, :cond_5

    .line 94
    .line 95
    and-int/lit8 v1, v1, 0xf

    .line 96
    .line 97
    shl-int/lit8 v1, v1, 0xc

    .line 98
    .line 99
    and-int/lit8 v2, v3, 0x3f

    .line 100
    .line 101
    shl-int/lit8 v2, v2, 0x6

    .line 102
    .line 103
    or-int/2addr v1, v2

    .line 104
    and-int/lit8 v2, v4, 0x3f

    .line 105
    .line 106
    or-int/2addr v1, v2

    .line 107
    int-to-char v1, v1

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 113
    .line 114
    const-string v0, "bad second or third byte"

    .line 115
    .line 116
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_6
    new-instance p0, Ljava/io/UTFDataFormatException;

    .line 121
    .line 122
    const-string v0, "bad byte"

    .line 123
    .line 124
    invoke-direct {p0, v0}, Ljava/io/UTFDataFormatException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static r(Ll3/l;Ljava/util/List;Lna/a;)Lna/a;
    .locals 2

    .line 1
    const-string v0, "hb_rule_default_template_id"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lna/j;

    .line 25
    .line 26
    iget-object v1, v1, Lna/j;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    check-cast v0, Lna/j;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object p0, v0, Lna/j;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const-string p0, "\u9ed8\u8ba4\u89c4\u5219"

    .line 49
    .line 50
    :cond_2
    invoke-static {v0, p0, p2}, Lac/p;->d(Lna/j;Ljava/lang/String;Lna/a;)Lna/a;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_3
    return-object p2
.end method

.method public static s(Lh/Hchat/hooks/api/model/WeChatMessage;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x6

    .line 3
    const-string v2, ":\n"

    .line 4
    .line 5
    invoke-static {p1, v2, v0, v0, v1}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isGroupChat()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lbe/h;->d0(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-static {p1}, Lbe/h;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_2
    return-object p1
.end method

.method public static t(Landroid/content/Context;J)Lf9/h;
    .locals 10

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    invoke-static {p1}, Lbe/h;->C(Lh/Hchat/hooks/api/model/WeChatMessage;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_0
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    new-instance v0, Lf9/h;

    .line 39
    .line 40
    iget-wide v1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 41
    .line 42
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v8, :cond_1

    .line 45
    .line 46
    invoke-static {p2}, Lbe/h;->d0(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-eqz v7, :cond_2

    .line 52
    .line 53
    invoke-static {p2}, Lbe/h;->Q(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v4, p2

    .line 59
    :goto_0
    if-eqz v8, :cond_3

    .line 60
    .line 61
    invoke-static {p2}, Lbe/h;->c0(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    if-eqz v7, :cond_4

    .line 67
    .line 68
    const-string v5, "title"

    .line 69
    .line 70
    invoke-static {p2, v5}, Lbe/h;->p0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v5, p2

    .line 76
    :goto_1
    if-eqz v7, :cond_5

    .line 77
    .line 78
    invoke-static {p2}, Lbe/h;->R(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    :goto_2
    move-object v6, p2

    .line 83
    goto :goto_3

    .line 84
    :cond_5
    const-string p2, ""

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :goto_3
    const-string p2, "Hchat_edit_message_backup"

    .line 88
    .line 89
    invoke-static {p0, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget-wide p1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 94
    .line 95
    invoke-static {p1, p2}, Lbe/h;->l(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-direct/range {v0 .. v9}, Lf9/h;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 104
    .line 105
    .line 106
    return-object v0

    .line 107
    :cond_6
    :goto_4
    const/4 p0, 0x0

    .line 108
    return-object p0
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&"

    .line 2
    .line 3
    const-string v1, "&amp;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "<"

    .line 11
    .line 12
    const-string v1, "&lt;"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, ">"

    .line 19
    .line 20
    const-string v1, "&gt;"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static v(Ljava/util/Collection;Ljava/util/function/Predicate;)Ljava/util/List;
    .locals 3

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {p1, v1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v0

    .line 40
    :cond_3
    :goto_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 41
    .line 42
    return-object p0
.end method

.method public static w(Ljava/util/List;Ljava/util/function/Predicate;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    move-object v1, v0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {p1, v2}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object v1, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return-object v1

    .line 38
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static varargs x([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    .line 5
    aget-object v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    :goto_1
    if-nez v2, :cond_2

    .line 19
    .line 20
    const-string p0, ""

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_2
    return-object v2
.end method

.method public static y(Lg0/b;Lu2/m;Li2/n0;Lu2/c;Lm2/d;)Lg0/b;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lg0/b;->a:Lu2/m;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p1}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lg0/b;->b:Li2/n0;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Li2/n0;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p3}, Lu2/c;->d()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lg0/b;->c:Lu2/d;

    .line 24
    .line 25
    iget v1, v1, Lu2/d;->g:F

    .line 26
    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lg0/b;->d:Lm2/d;

    .line 32
    .line 33
    if-ne p4, v0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Lg0/b;->h:Lg0/b;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Lg0/b;->a:Lu2/m;

    .line 41
    .line 42
    if-ne p1, v0, :cond_1

    .line 43
    .line 44
    invoke-static {p2, p1}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lg0/b;->b:Li2/n0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Li2/n0;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {p3}, Lu2/c;->d()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Lg0/b;->c:Lu2/d;

    .line 61
    .line 62
    iget v1, v1, Lu2/d;->g:F

    .line 63
    .line 64
    cmpg-float v0, v0, v1

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Lg0/b;->d:Lm2/d;

    .line 69
    .line 70
    if-ne p4, v0, :cond_1

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_1
    new-instance p0, Lg0/b;

    .line 74
    .line 75
    invoke-static {p2, p1}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p3}, Lu2/c;->d()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-interface {p3}, Lu2/c;->q0()F

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    new-instance v1, Lu2/d;

    .line 88
    .line 89
    invoke-direct {v1, v0, p3}, Lu2/d;-><init>(FF)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1, p2, v1, p4}, Lg0/b;-><init>(Lu2/m;Li2/n0;Lu2/d;Lm2/d;)V

    .line 93
    .line 94
    .line 95
    sput-object p0, Lg0/b;->h:Lg0/b;

    .line 96
    .line 97
    return-object p0
.end method

.method public static z(Lorg/luckypray/dexkit/DexKitBridge;Ljh/b;)Lhh/c;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    invoke-virtual {p1, v1}, Lg6/c;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lg6/c;->f(I)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :goto_0
    move v4, v3

    .line 24
    :goto_1
    if-ge v4, v2, :cond_e

    .line 25
    .line 26
    new-instance v5, Ljh/a;

    .line 27
    .line 28
    invoke-direct {v5}, Lg6/c;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lg6/c;->b(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, v6}, Lg6/c;->e(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    mul-int/lit8 v8, v4, 0x4

    .line 43
    .line 44
    add-int/2addr v8, v6

    .line 45
    invoke-virtual {p1, v8}, Lg6/c;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v8, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v6, v8}, Lg6/c;->c(ILjava/nio/ByteBuffer;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    move-object v5, v7

    .line 59
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/4 v6, 0x6

    .line 63
    invoke-virtual {v5, v6}, Lg6/c;->b(I)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    iget v9, v5, Lg6/c;->a:I

    .line 72
    .line 73
    add-int/2addr v6, v9

    .line 74
    invoke-virtual {v8, v6}, Ljava/nio/ByteBuffer;->get(I)B

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    move v6, v3

    .line 80
    :goto_3
    invoke-static {v6}, La7/a;->u(B)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-static {v6}, Lt3/c;->b(I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    packed-switch v8, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lokio/a;->k()V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :pswitch_0
    new-instance v7, Ljh/e;

    .line 97
    .line 98
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast v5, Ljh/e;

    .line 109
    .line 110
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_3

    .line 115
    .line 116
    int-to-byte v8, v3

    .line 117
    iget-object v9, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 118
    .line 119
    iget v5, v5, Lg6/c;->a:I

    .line 120
    .line 121
    add-int/2addr v7, v5

    .line 122
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eq v8, v5, :cond_3

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    goto :goto_4

    .line 130
    :cond_3
    move v5, v3

    .line 131
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    goto/16 :goto_10

    .line 136
    .line 137
    :pswitch_1
    new-instance v7, Ljh/l;

    .line 138
    .line 139
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    check-cast v5, Ljh/l;

    .line 150
    .line 151
    goto/16 :goto_10

    .line 152
    .line 153
    :pswitch_2
    new-instance v7, Ljh/c;

    .line 154
    .line 155
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    check-cast v5, Ljh/c;

    .line 166
    .line 167
    invoke-static {p0, v5}, Lac/p;->s(Lorg/luckypray/dexkit/DexKitBridge;Ljh/c;)Lhh/a;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    goto/16 :goto_10

    .line 172
    .line 173
    :pswitch_3
    new-instance v7, Ljh/b;

    .line 174
    .line 175
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    check-cast v5, Ljh/b;

    .line 186
    .line 187
    invoke-static {p0, v5}, Lbe/h;->z(Lorg/luckypray/dexkit/DexKitBridge;Ljh/b;)Lhh/c;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    goto/16 :goto_10

    .line 192
    .line 193
    :pswitch_4
    new-instance v7, Ljh/o;

    .line 194
    .line 195
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    check-cast v5, Ljh/o;

    .line 206
    .line 207
    invoke-static {p0, v5}, Lfb/v0;->r(Lorg/luckypray/dexkit/DexKitBridge;Ljh/o;)Lhh/l;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    goto/16 :goto_10

    .line 212
    .line 213
    :pswitch_5
    new-instance v7, Ljh/p;

    .line 214
    .line 215
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    check-cast v5, Ljh/p;

    .line 226
    .line 227
    invoke-static {p0, v5}, Lg4/a;->p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    goto/16 :goto_10

    .line 232
    .line 233
    :pswitch_6
    new-instance v7, Ljh/d;

    .line 234
    .line 235
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    check-cast v5, Ljh/d;

    .line 246
    .line 247
    invoke-static {p0, v5}, Lf8/i;->v(Lorg/luckypray/dexkit/DexKitBridge;Ljh/d;)Lhh/i;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    goto/16 :goto_10

    .line 252
    .line 253
    :pswitch_7
    new-instance v8, Ljh/n;

    .line 254
    .line 255
    invoke-direct {v8}, Lg6/c;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v8}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    check-cast v5, Ljh/n;

    .line 266
    .line 267
    :try_start_0
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_4

    .line 272
    .line 273
    iget v9, v5, Lg6/c;->a:I

    .line 274
    .line 275
    add-int/2addr v8, v9

    .line 276
    invoke-virtual {v5, v8}, Lg6/c;->d(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    goto :goto_5

    .line 281
    :cond_4
    move-object v8, v7

    .line 282
    :goto_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    .line 284
    .line 285
    move-object v5, v8

    .line 286
    goto/16 :goto_10

    .line 287
    .line 288
    :catch_0
    :try_start_1
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    if-nez v8, :cond_5

    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_5
    iget-object v7, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 298
    .line 299
    .line 300
    move-result-object v7

    .line 301
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 302
    .line 303
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    invoke-virtual {v5, v8}, Lg6/c;->e(I)I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    invoke-virtual {v7, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v5, v8}, Lg6/c;->f(I)I

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    add-int/2addr v5, v9

    .line 319
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 320
    .line 321
    .line 322
    :goto_6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-static {v7}, Lbe/h;->q(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    invoke-static {v5}, Lf8/i;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 333
    goto :goto_7

    .line 334
    :catchall_0
    move-exception v5

    .line 335
    new-instance v7, Lsf/f;

    .line 336
    .line 337
    invoke-direct {v7, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    move-object v5, v7

    .line 341
    :goto_7
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    if-nez v7, :cond_6

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_6
    const-string v5, ""

    .line 349
    .line 350
    :goto_8
    check-cast v5, Ljava/lang/String;

    .line 351
    .line 352
    goto/16 :goto_10

    .line 353
    .line 354
    :pswitch_8
    new-instance v7, Ljh/h;

    .line 355
    .line 356
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    check-cast v5, Ljh/h;

    .line 367
    .line 368
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-eqz v7, :cond_7

    .line 373
    .line 374
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 375
    .line 376
    iget v5, v5, Lg6/c;->a:I

    .line 377
    .line 378
    add-int/2addr v7, v5

    .line 379
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getDouble(I)D

    .line 380
    .line 381
    .line 382
    move-result-wide v7

    .line 383
    goto :goto_9

    .line 384
    :cond_7
    const-wide/16 v7, 0x0

    .line 385
    .line 386
    :goto_9
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    goto/16 :goto_10

    .line 391
    .line 392
    :pswitch_9
    new-instance v7, Ljh/i;

    .line 393
    .line 394
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    check-cast v5, Ljh/i;

    .line 405
    .line 406
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    if-eqz v7, :cond_8

    .line 411
    .line 412
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 413
    .line 414
    iget v5, v5, Lg6/c;->a:I

    .line 415
    .line 416
    add-int/2addr v7, v5

    .line 417
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getFloat(I)F

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    goto :goto_a

    .line 422
    :cond_8
    const/4 v5, 0x0

    .line 423
    :goto_a
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 424
    .line 425
    .line 426
    move-result-object v5

    .line 427
    goto/16 :goto_10

    .line 428
    .line 429
    :pswitch_a
    new-instance v7, Ljh/k;

    .line 430
    .line 431
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    check-cast v5, Ljh/k;

    .line 442
    .line 443
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    if-eqz v7, :cond_9

    .line 448
    .line 449
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 450
    .line 451
    iget v5, v5, Lg6/c;->a:I

    .line 452
    .line 453
    add-int/2addr v7, v5

    .line 454
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getLong(I)J

    .line 455
    .line 456
    .line 457
    move-result-wide v7

    .line 458
    goto :goto_b

    .line 459
    :cond_9
    const-wide/16 v7, 0x0

    .line 460
    .line 461
    :goto_b
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    goto/16 :goto_10

    .line 466
    .line 467
    :pswitch_b
    new-instance v7, Ljh/j;

    .line 468
    .line 469
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    check-cast v5, Ljh/j;

    .line 480
    .line 481
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 482
    .line 483
    .line 484
    move-result v7

    .line 485
    if-eqz v7, :cond_a

    .line 486
    .line 487
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 488
    .line 489
    iget v5, v5, Lg6/c;->a:I

    .line 490
    .line 491
    add-int/2addr v7, v5

    .line 492
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    goto :goto_c

    .line 497
    :cond_a
    move v5, v3

    .line 498
    :goto_c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    goto/16 :goto_10

    .line 503
    .line 504
    :pswitch_c
    new-instance v7, Ljh/g;

    .line 505
    .line 506
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    check-cast v5, Ljh/g;

    .line 517
    .line 518
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    if-eqz v7, :cond_b

    .line 523
    .line 524
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 525
    .line 526
    iget v5, v5, Lg6/c;->a:I

    .line 527
    .line 528
    add-int/2addr v7, v5

    .line 529
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 530
    .line 531
    .line 532
    move-result v5

    .line 533
    goto :goto_d

    .line 534
    :cond_b
    move v5, v3

    .line 535
    :goto_d
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    goto :goto_10

    .line 540
    :pswitch_d
    new-instance v7, Ljh/m;

    .line 541
    .line 542
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    check-cast v5, Ljh/m;

    .line 553
    .line 554
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 555
    .line 556
    .line 557
    move-result v7

    .line 558
    if-eqz v7, :cond_c

    .line 559
    .line 560
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 561
    .line 562
    iget v5, v5, Lg6/c;->a:I

    .line 563
    .line 564
    add-int/2addr v7, v5

    .line 565
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    goto :goto_e

    .line 570
    :cond_c
    move v5, v3

    .line 571
    :goto_e
    invoke-static {v5}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 572
    .line 573
    .line 574
    move-result-object v5

    .line 575
    goto :goto_10

    .line 576
    :pswitch_e
    new-instance v7, Ljh/f;

    .line 577
    .line 578
    invoke-direct {v7}, Lg6/c;-><init>()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5, v7}, Ljh/a;->p(Lg6/c;)Lg6/c;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    check-cast v5, Ljh/f;

    .line 589
    .line 590
    invoke-virtual {v5, v1}, Lg6/c;->b(I)I

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    if-eqz v7, :cond_d

    .line 595
    .line 596
    iget-object v8, v5, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 597
    .line 598
    iget v5, v5, Lg6/c;->a:I

    .line 599
    .line 600
    add-int/2addr v7, v5

    .line 601
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->get(I)B

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    goto :goto_f

    .line 606
    :cond_d
    move v5, v3

    .line 607
    :goto_f
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    :goto_10
    new-instance v7, Lhh/d;

    .line 612
    .line 613
    invoke-direct {v7, v5, v6}, Lhh/d;-><init>(Ljava/lang/Object;I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    add-int/lit8 v4, v4, 0x1

    .line 620
    .line 621
    goto/16 :goto_1

    .line 622
    .line 623
    :cond_e
    new-instance p1, Lhh/c;

    .line 624
    .line 625
    invoke-direct {p1, p0, v0}, Lhh/c;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/util/ArrayList;)V

    .line 626
    .line 627
    .line 628
    return-object p1

    .line 629
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
