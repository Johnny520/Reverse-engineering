.class public final Lpe1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lpe1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lpe1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lpe1;->α:Lpe1;

    .line 7
    .line 8
    return-void
.end method

.method public static α(Lorg/json/JSONObject;Lne1;)I
    .locals 4

    .line 1
    const-string v0, "base_resp"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "code"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_0
    const-string v1, "status_code"

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 v2, 0x1

    .line 41
    if-ne p0, v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_2
    if-eqz p1, :cond_3

    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_3
    return v3
.end method

.method public static β(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "base_resp"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "message"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "msg"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "status_msg"

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v3, "status_message"

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    filled-new-array {v1, v2, p0, v0}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    new-instance v0, Lf71;

    .line 44
    .line 45
    const/16 v1, 0x19

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lf71;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v0}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/String;

    .line 59
    .line 60
    return-object p0
.end method

.method public static final δ(ILjava/lang/Object;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p1, v1, :cond_9

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-le p0, v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_2

    .line 12
    .line 13
    :cond_0
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 14
    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    check-cast v1, Lorg/json/JSONObject;

    .line 19
    .line 20
    const-string v2, "closeness"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-nez v2, :cond_4

    .line 27
    .line 28
    const-string v2, "behavior_closeness"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-string v2, "level_num"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    :cond_1
    move-object v0, p1

    .line 45
    :cond_2
    check-cast v0, Lorg/json/JSONObject;

    .line 46
    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lya1;

    .line 61
    .line 62
    const/16 v2, 0x12

    .line 63
    .line 64
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lorg/json/JSONObject;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_3
    return-object v0

    .line 79
    :cond_4
    return-object v2

    .line 80
    :cond_5
    instance-of v1, p1, Lorg/json/JSONArray;

    .line 81
    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    move-object v0, p1

    .line 85
    check-cast v0, Lorg/json/JSONArray;

    .line 86
    .line 87
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-static {v1, v0}, Lj81;->Σ(II)Lxm0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    new-instance v1, Lya1;

    .line 101
    .line 102
    const/16 v2, 0x13

    .line 103
    .line 104
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Lorg/json/JSONObject;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_6
    instance-of v1, p1, Ljava/lang/String;

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    check-cast p1, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    const/16 v1, 0x7b

    .line 133
    .line 134
    invoke-static {p1, v1}, Lq02;->у(Ljava/lang/String;C)Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_7
    move-object p1, v0

    .line 142
    :goto_0
    if-eqz p1, :cond_9

    .line 143
    .line 144
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 145
    .line 146
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catchall_0
    move-exception p1

    .line 151
    new-instance v1, Leo1;

    .line 152
    .line 153
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :goto_1
    instance-of p1, v1, Leo1;

    .line 157
    .line 158
    if-eqz p1, :cond_8

    .line 159
    .line 160
    move-object v1, v0

    .line 161
    :cond_8
    check-cast v1, Lorg/json/JSONObject;

    .line 162
    .line 163
    if-eqz v1, :cond_9

    .line 164
    .line 165
    add-int/lit8 p0, p0, 0x1

    .line 166
    .line 167
    invoke-static {p0, v1}, Lpe1;->δ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_9
    :goto_2
    return-object v0
.end method

.method public static ε(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static ζ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p0, Ljava/lang/String;

    .line 25
    .line 26
    const/16 p1, 0xa

    .line 27
    .line 28
    invoke-static {p0, p1}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public static θ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lle1;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, v0}, Lxn0;->ц(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)Lrf1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lrf1;->α()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lrf1;->β:Ljava/lang/Throwable;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string p1, "\u4eb2\u5bc6\u5ea6\u5bbf\u4e3b\u8bf7\u6c42\u5931\u8d25"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    throw p0

    .line 25
    :cond_1
    iget-object p0, p0, Lrf1;->α:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/util/Map;

    .line 28
    .line 29
    if-eqz p0, :cond_a

    .line 30
    .line 31
    const-string p1, "data"

    .line 32
    .line 33
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    instance-of p2, p1, Ljava/util/Map;

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    check-cast p1, Ljava/util/Map;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object p1, p3

    .line 46
    :goto_0
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-static {p1}, Lpe1;->κ(Ljava/util/Map;)Lzw0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move-object p1, p3

    .line 54
    :goto_1
    if-nez p1, :cond_4

    .line 55
    .line 56
    sget-object p1, Lkz;->ε:Lkz;

    .line 57
    .line 58
    :cond_4
    const-string p2, "response"

    .line 59
    .line 60
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p2}, Lpe1;->ι(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-nez p2, :cond_5

    .line 69
    .line 70
    const-string p2, "rawResponse"

    .line 71
    .line 72
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p2}, Lpe1;->ι(Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-nez p2, :cond_5

    .line 81
    .line 82
    new-instance p2, Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    .line 87
    :cond_5
    new-instance v0, Lle1;

    .line 88
    .line 89
    const-string v1, "code"

    .line 90
    .line 91
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    instance-of v1, p0, Ljava/lang/Number;

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    check-cast p0, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_2

    .line 106
    :cond_6
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/16 v1, 0xa

    .line 111
    .line 112
    invoke-static {p0, v1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-eqz p0, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    goto :goto_2

    .line 123
    :cond_7
    const/4 p0, -0x1

    .line 124
    :goto_2
    const-string v1, "httpCode"

    .line 125
    .line 126
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    instance-of v1, p1, Ljava/lang/Number;

    .line 131
    .line 132
    if-eqz v1, :cond_8

    .line 133
    .line 134
    check-cast p1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    goto :goto_3

    .line 145
    :cond_8
    if-nez p1, :cond_9

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    :goto_3
    invoke-direct {v0, p0, p3, p2}, Lle1;-><init>(ILjava/lang/Integer;Lorg/json/JSONObject;)V

    .line 157
    .line 158
    .line 159
    return-object v0

    .line 160
    :cond_a
    const-string p0, "\u4eb2\u5bc6\u5ea6 Bridge \u7ed3\u679c\u4e3a\u7a7a"

    .line 161
    .line 162
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const/4 p0, 0x0

    .line 166
    return-object p0
.end method

.method public static ι(Ljava/lang/Object;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/Map;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    :try_start_0
    check-cast p0, Ljava/util/Map;

    .line 14
    .line 15
    new-instance v0, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-static {p0}, Lpe1;->κ(Ljava/util/Map;)Lzw0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance v0, Leo1;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    instance-of p0, v0, Leo1;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v1, v0

    .line 37
    :goto_1
    check-cast v1, Lorg/json/JSONObject;

    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    :try_start_1
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_1
    move-exception p0

    .line 53
    new-instance v0, Leo1;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    instance-of p0, v0, Leo1;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move-object v1, v0

    .line 64
    :goto_3
    check-cast v1, Lorg/json/JSONObject;

    .line 65
    .line 66
    :cond_4
    :goto_4
    return-object v1
.end method

.method public static κ(Ljava/util/Map;)Lzw0;
    .locals 3

    .line 1
    new-instance v0, Lzw0;

    .line 2
    .line 3
    invoke-direct {v0}, Lzw0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0, v2, v1}, Lzw0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Lzw0;->β()Lzw0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final γ(Ljava/lang/ClassLoader;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v0, p2, v0

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    :try_start_0
    invoke-static {p1, p2, p3}, Lxn0;->σ(Ljava/lang/ClassLoader;J)Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "module_list"

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p3, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v0, "source"

    .line 34
    .line 35
    const-string v1, "IMClientFetch"

    .line 36
    .line 37
    invoke-virtual {p3, v0, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const-string v0, "https://stark-gate.zijieapi.com/ttgame/social_pet/home/info"

    .line 41
    .line 42
    invoke-static {p1, v0, p3, p2}, Lpe1;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)Lle1;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p2, p1, Lle1;->γ:Lorg/json/JSONObject;

    .line 47
    .line 48
    const/4 p3, 0x0

    .line 49
    invoke-static {p3, p2}, Lpe1;->δ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    if-eqz p3, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0, p3}, Lpe1;->η(Lorg/json/JSONObject;)Lne1;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    :goto_0
    move-object v5, p0

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    const/4 p0, 0x0

    .line 62
    goto :goto_0

    .line 63
    :goto_1
    new-instance v0, Loe1;

    .line 64
    .line 65
    iget v1, p1, Lle1;->α:I

    .line 66
    .line 67
    iget-object v2, p1, Lle1;->β:Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-static {p2, v5}, Lpe1;->α(Lorg/json/JSONObject;Lne1;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {p2}, Lpe1;->β(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-direct/range {v0 .. v5}, Loe1;-><init>(ILjava/lang/Integer;ILjava/lang/String;Lne1;)V

    .line 78
    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_1
    const-string p0, "conversationShortId \u5fc5\u987b\u5927\u4e8e 0"

    .line 82
    .line 83
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object p0, v0

    .line 91
    new-instance p1, Leo1;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    return-object p1
.end method

.method public final η(Lorg/json/JSONObject;)Lne1;
    .locals 9

    .line 1
    const-string v0, "behavior_closeness"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0, v1}, Lj81;->Σ(II)Lxm0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lny0;

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/16 v8, 0x10

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    const-class v4, Lorg/json/JSONArray;

    .line 29
    .line 30
    const-string v5, "optJSONObject"

    .line 31
    .line 32
    const-string v6, "optJSONObject(I)Lorg/json/JSONObject;"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Lny0;

    .line 42
    .line 43
    const/16 v8, 0xf

    .line 44
    .line 45
    const-class v4, Lpe1;

    .line 46
    .line 47
    const-string v5, "parseBehavior"

    .line 48
    .line 49
    const-string v6, "parseBehavior(Lorg/json/JSONObject;)Lcom/example/dyhelper/hook/IM/pet/PetElfClosenessApiClient$Behavior;"

    .line 50
    .line 51
    move-object v3, p0

    .line 52
    invoke-direct/range {v1 .. v8}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lus1;->Ζ(Lss1;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    const/4 p0, 0x0

    .line 65
    :goto_0
    if-nez p0, :cond_1

    .line 66
    .line 67
    sget-object p0, Ljz;->ε:Ljz;

    .line 68
    .line 69
    :cond_1
    move-object v7, p0

    .line 70
    new-instance v0, Lne1;

    .line 71
    .line 72
    const-string p0, "level_num"

    .line 73
    .line 74
    invoke-static {p0, p1}, Lpe1;->ε(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const-string p0, "level_max"

    .line 79
    .line 80
    invoke-static {p0, p1}, Lpe1;->ε(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string p0, "level_current"

    .line 85
    .line 86
    invoke-static {p0, p1}, Lpe1;->ζ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string p0, "level_delta_closeness"

    .line 91
    .line 92
    invoke-static {p0, p1}, Lpe1;->ζ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string p0, "total"

    .line 97
    .line 98
    invoke-static {p0, p1}, Lpe1;->ζ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const-string p0, "level_target"

    .line 103
    .line 104
    invoke-static {p0, p1}, Lpe1;->ζ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-direct/range {v0 .. v7}, Lne1;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method
