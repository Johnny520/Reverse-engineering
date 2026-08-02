.class public abstract Lmw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Set;

.field public static final c:Ln82;

.field public static final d:Ljava/util/Set;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/Set;

.field public static final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v5, "DELETE"

    .line 2
    .line 3
    const-string v6, "OPTIONS"

    .line 4
    .line 5
    const-string v0, "GET"

    .line 6
    .line 7
    const-string v1, "HEAD"

    .line 8
    .line 9
    const-string v2, "POST"

    .line 10
    .line 11
    const-string v3, "PUT"

    .line 12
    .line 13
    const-string v4, "PATCH"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lmw0;->a:Ljava/util/Set;

    .line 24
    .line 25
    const-string v0, "PUT"

    .line 26
    .line 27
    const-string v1, "PATCH"

    .line 28
    .line 29
    const-string v2, "POST"

    .line 30
    .line 31
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lmw0;->b:Ljava/util/Set;

    .line 40
    .line 41
    sget v0, Lo82;->a:I

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    new-array v1, v0, [B

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    const-wide/16 v4, 0x0

    .line 49
    .line 50
    move-wide v6, v2

    .line 51
    invoke-static/range {v2 .. v7}, Lug3;->a(JJJ)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Ln82;

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v2, v3, v0, v1}, Ln82;-><init>(Lvf1;I[B)V

    .line 58
    .line 59
    .line 60
    sput-object v2, Lmw0;->c:Ln82;

    .line 61
    .line 62
    const/16 v0, 0x12d

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/16 v1, 0x12e

    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const/16 v2, 0x12f

    .line 75
    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/16 v3, 0x133

    .line 81
    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const/16 v4, 0x134

    .line 87
    .line 88
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lmw0;->d:Ljava/util/Set;

    .line 101
    .line 102
    const-string v5, "redirect"

    .line 103
    .line 104
    const-string v6, "maxResponseBytes"

    .line 105
    .line 106
    const-string v1, "method"

    .line 107
    .line 108
    const-string v2, "headers"

    .line 109
    .line 110
    const-string v3, "body"

    .line 111
    .line 112
    const-string v4, "timeoutMs"

    .line 113
    .line 114
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Lmw0;->e:Ljava/util/Set;

    .line 123
    .line 124
    const-string v8, "createParents"

    .line 125
    .line 126
    const-string v9, "requireSuccess"

    .line 127
    .line 128
    const-string v1, "method"

    .line 129
    .line 130
    const-string v2, "headers"

    .line 131
    .line 132
    const-string v3, "body"

    .line 133
    .line 134
    const-string v4, "timeoutMs"

    .line 135
    .line 136
    const-string v5, "redirect"

    .line 137
    .line 138
    const-string v6, "maxBytes"

    .line 139
    .line 140
    const-string v7, "overwrite"

    .line 141
    .line 142
    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sput-object v0, Lmw0;->f:Ljava/util/Set;

    .line 151
    .line 152
    const-string v0, "content-length"

    .line 153
    .line 154
    const-string v1, "transfer-encoding"

    .line 155
    .line 156
    const-string v2, "host"

    .line 157
    .line 158
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lmw0;->g:Ljava/util/Set;

    .line 167
    .line 168
    return-void
.end method

.method public static final a(Ljava/lang/String;)Lyw0;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x4000

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-gt v0, v1, :cond_4

    .line 9
    .line 10
    :try_start_0
    new-instance v0, Lxw0;

    .line 11
    .line 12
    invoke-direct {v0}, Lxw0;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2, p0}, Lxw0;->e(Lyw0;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lxw0;->b()Lyw0;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-object p0, v2

    .line 24
    :goto_0
    if-eqz p0, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Lyw0;->a:Ljava/lang/String;

    .line 27
    .line 28
    const-string v1, "http"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    const-string v1, "https"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const/4 v7, 0x0

    .line 46
    const/16 v8, 0x1c

    .line 47
    .line 48
    const-string v3, "INVALID_ARGUMENT"

    .line 49
    .line 50
    const-string v4, "URL must use HTTP or HTTPS."

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_1
    :goto_1
    iget-object v0, p0, Lyw0;->b:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-gtz v0, :cond_2

    .line 65
    .line 66
    iget-object v0, p0, Lyw0;->c:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-gtz v0, :cond_2

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_2
    const/4 v7, 0x0

    .line 76
    const/16 v8, 0x1c

    .line 77
    .line 78
    const-string v3, "INVALID_ARGUMENT"

    .line 79
    .line 80
    const-string v4, "URL user information is not allowed."

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_3
    const/4 v13, 0x0

    .line 89
    const/16 v14, 0x1c

    .line 90
    .line 91
    const-string v9, "INVALID_ARGUMENT"

    .line 92
    .line 93
    const-string v10, "URL must be an absolute HTTP or HTTPS URL."

    .line 94
    .line 95
    const/4 v11, 0x0

    .line 96
    const/4 v12, 0x0

    .line 97
    invoke-static/range {v9 .. v14}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 98
    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_4
    const/4 v7, 0x0

    .line 102
    const/16 v8, 0x1c

    .line 103
    .line 104
    const-string v3, "INVALID_ARGUMENT"

    .line 105
    .line 106
    const-string v4, "HTTP URL is too long."

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 111
    .line 112
    .line 113
    return-object v2
.end method

.method public static final b(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Low1;

    .line 27
    .line 28
    iget-object v2, v1, Low1;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/lang/String;

    .line 31
    .line 32
    iget-object v1, v1, Low1;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v1}, Leu;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
.end method

.method public static final c(Ljava/lang/String;)I
    .locals 1

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length p0, p0

    .line 14
    return p0
.end method
