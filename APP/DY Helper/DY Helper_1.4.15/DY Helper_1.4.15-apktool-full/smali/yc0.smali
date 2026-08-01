.class public final Lyc0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lyc0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyc0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyc0;->α:Lyc0;

    .line 7
    .line 8
    return-void
.end method

.method public static β(Lorg/json/JSONObject;)Lxd0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v2, "uid"

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v3, "sec_uid"

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v4, "unique_id"

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const-string v5, "short_id"

    .line 35
    .line 36
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const-string v6, "display_name"

    .line 44
    .line 45
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string v7, "hidden_at"

    .line 53
    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    invoke-virtual {v0, v7, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v10

    .line 60
    const/16 v0, 0x40

    .line 61
    .line 62
    invoke-static {v2, v0}, Ls1;->υ(Ljava/lang/String;I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    const/16 v0, 0x100

    .line 67
    .line 68
    invoke-static {v3, v0}, Ls1;->υ(Ljava/lang/String;I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v16

    .line 72
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    :goto_0
    return-object v1

    .line 85
    :cond_1
    const/16 v2, 0x80

    .line 86
    .line 87
    invoke-static {v4, v2}, Ls1;->γ(Ljava/lang/String;I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v17

    .line 91
    invoke-static {v5, v2}, Ls1;->γ(Ljava/lang/String;I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v18

    .line 95
    invoke-static {v6, v0}, Ls1;->γ(Ljava/lang/String;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v19

    .line 99
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    cmp-long v2, v10, v8

    .line 104
    .line 105
    if-lez v2, :cond_2

    .line 106
    .line 107
    move-object v1, v0

    .line 108
    :cond_2
    if-eqz v1, :cond_3

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 111
    .line 112
    .line 113
    move-result-wide v0

    .line 114
    :goto_1
    move-wide v13, v0

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v0

    .line 120
    goto :goto_1

    .line 121
    :goto_2
    new-instance v12, Lxd0;

    .line 122
    .line 123
    invoke-direct/range {v12 .. v19}, Lxd0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v12
.end method


# virtual methods
.method public final α(Ljava/util/List;)Ljava/util/List;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lf7;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2, p1}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/16 p1, 0x7d0

    .line 13
    .line 14
    invoke-static {v1, p1}, Lus1;->Ε(Lss1;I)Lss1;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, Lng;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/16 v8, 0xb

    .line 22
    .line 23
    const-class v4, Lyc0;

    .line 24
    .line 25
    const-string v5, "normalizeRecord"

    .line 26
    .line 27
    const-string v6, "normalizeRecord(Lcom/example/dyhelper/hook/contacthide/HiddenContactRecord;)Lcom/example/dyhelper/hook/contacthide/HiddenContactRecord;"

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    invoke-direct/range {v1 .. v8}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    new-instance p1, Lx30;

    .line 38
    .line 39
    invoke-direct {p1, p0}, Lx30;-><init>(Ly30;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1}, Lx30;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_8

    .line 47
    .line 48
    invoke-virtual {p1}, Lx30;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lxd0;

    .line 53
    .line 54
    iget-object v1, p0, Lxd0;->α:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v2, p0, Lxd0;->β:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-lez v3, :cond_0

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    const/4 v1, 0x0

    .line 66
    :goto_1
    if-eqz v1, :cond_1

    .line 67
    .line 68
    const-string v3, "uid:"

    .line 69
    .line 70
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_2

    .line 75
    :cond_1
    const-string v1, "sec:"

    .line 76
    .line 77
    invoke-static {v1, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lxd0;

    .line 86
    .line 87
    if-nez v3, :cond_2

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    iget-object v4, p0, Lxd0;->α:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-nez v5, :cond_3

    .line 97
    .line 98
    iget-object v4, v3, Lxd0;->α:Ljava/lang/String;

    .line 99
    .line 100
    :cond_3
    move-object v8, v4

    .line 101
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-nez v4, :cond_4

    .line 106
    .line 107
    iget-object v2, v3, Lxd0;->β:Ljava/lang/String;

    .line 108
    .line 109
    :cond_4
    move-object v9, v2

    .line 110
    iget-object v2, p0, Lxd0;->γ:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_5

    .line 117
    .line 118
    iget-object v2, v3, Lxd0;->γ:Ljava/lang/String;

    .line 119
    .line 120
    :cond_5
    move-object v10, v2

    .line 121
    iget-object v2, p0, Lxd0;->δ:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_6

    .line 128
    .line 129
    iget-object v2, v3, Lxd0;->δ:Ljava/lang/String;

    .line 130
    .line 131
    :cond_6
    move-object v11, v2

    .line 132
    iget-object v2, p0, Lxd0;->ε:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_7

    .line 139
    .line 140
    iget-object v2, v3, Lxd0;->ε:Ljava/lang/String;

    .line 141
    .line 142
    :cond_7
    move-object v12, v2

    .line 143
    iget-wide v2, v3, Lxd0;->ζ:J

    .line 144
    .line 145
    iget-wide v4, p0, Lxd0;->ζ:J

    .line 146
    .line 147
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    new-instance v5, Lxd0;

    .line 152
    .line 153
    invoke-direct/range {v5 .. v12}, Lxd0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    move-object p0, v5

    .line 157
    :goto_3
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast p0, Ljava/lang/Iterable;

    .line 169
    .line 170
    new-instance p1, Lqt;

    .line 171
    .line 172
    const/16 v0, 0x17

    .line 173
    .line 174
    invoke-direct {p1, v0}, Lqt;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-static {p0, p1}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0
.end method
