.class public final Lfb/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lfb/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lfb/l1;->e:Log/k;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(Lfb/l1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lfb/d0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p1, p0, Lfb/d0;->b:Lfb/l1;

    .line 7
    .line 8
    return-void
.end method

.method public static b(Lfb/j1;Lfb/b;Lfg/l;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "JADX \u6ca1\u6709\u627e\u5230\u7c7b: "

    .line 2
    .line 3
    invoke-virtual {p1}, Lfb/b;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lfb/j1;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "L"

    .line 9
    .line 10
    invoke-static {v1, v2}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, ";"

    .line 15
    .line 16
    invoke-static {v2, v3}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/16 v3, 0x2f

    .line 21
    .line 22
    const/16 v4, 0x2e

    .line 23
    .line 24
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v3, Lbc/g;

    .line 32
    .line 33
    invoke-direct {v3}, Lbc/g;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    invoke-static {v4, v4}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    iput v5, v3, Lbc/g;->n:I

    .line 42
    .line 43
    iput-boolean v4, v3, Lbc/g;->w:Z

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    iput-boolean v5, v3, Lbc/g;->v:Z

    .line 47
    .line 48
    iput-boolean v5, v3, Lbc/g;->s:Z

    .line 49
    .line 50
    iput-boolean v4, v3, Lbc/g;->o:Z

    .line 51
    .line 52
    iput-boolean v5, v3, Lbc/g;->B:Z

    .line 53
    .line 54
    iput-boolean v5, v3, Lbc/g;->P:Z

    .line 55
    .line 56
    sget-object v4, Lfc/d;->g:Lfc/d;

    .line 57
    .line 58
    iput-object v4, v3, Lbc/g;->k:Lbc/c;

    .line 59
    .line 60
    new-instance v4, Lcd/a;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v4, v3, Lbc/g;->l:Lbd/a;

    .line 66
    .line 67
    new-instance v4, Lfb/c0;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v4, v3, Lbc/g;->O:Luc/b;

    .line 73
    .line 74
    new-instance v4, Lff/c;

    .line 75
    .line 76
    invoke-direct {v4}, Lff/c;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v5, p0, Lfb/j1;->c:[B

    .line 80
    .line 81
    iget-object p0, p0, Lfb/j1;->b:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v4, v4, Lff/c;->b:Lff/a;

    .line 84
    .line 85
    invoke-virtual {v4, p0, v5}, Lff/a;->d(Ljava/lang/String;[B)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    new-instance v4, Lff/d;

    .line 90
    .line 91
    invoke-direct {v4, p0}, Lff/d;-><init>(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    new-instance p0, Lbc/k;

    .line 95
    .line 96
    invoke-direct {p0, v3}, Lbc/k;-><init>(Lbc/g;)V

    .line 97
    .line 98
    .line 99
    :try_start_0
    iget-object v3, p0, Lbc/k;->n:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lbc/k;->e()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lfb/b;->d()V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lbc/k;->k:Lud/u;

    .line 111
    .line 112
    iget-object v3, v3, Lud/u;->n:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    new-instance v4, Lbc/i;

    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    invoke-direct {v4, v2, v5}, Lbc/i;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-interface {v2}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v3, Lbc/j;

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-direct {v3, p0, v4}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/util/Optional;->map(Ljava/util/function/Function;)Ljava/util/Optional;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const/4 v3, 0x0

    .line 143
    invoke-virtual {v2, v3}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Lbc/l;

    .line 148
    .line 149
    if-eqz v2, :cond_0

    .line 150
    .line 151
    invoke-interface {p2, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    move-object v0, p2

    .line 156
    check-cast v0, Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {p1}, Lfb/b;->d()V

    .line 159
    .line 160
    .line 161
    check-cast p2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    .line 163
    invoke-virtual {p0}, Lbc/k;->close()V

    .line 164
    .line 165
    .line 166
    return-object p2

    .line 167
    :catchall_0
    move-exception p1

    .line 168
    goto :goto_0

    .line 169
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 170
    .line 171
    new-instance p2, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    :goto_0
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 188
    :catchall_1
    move-exception p2

    .line 189
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw p2
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "offset"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p4, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v2, v1, v3}, Lr9/e0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const-string v3, "max_chars"

    .line 17
    .line 18
    const/16 v4, 0x5dc0

    .line 19
    .line 20
    invoke-virtual {p4, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    const/16 v3, 0x3e8

    .line 25
    .line 26
    const v4, 0xbb80

    .line 27
    .line 28
    .line 29
    invoke-static {p4, v3, v4}, Lr9/e0;->r(III)I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    add-int/2addr p4, v2

    .line 34
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-le p4, v3, :cond_0

    .line 39
    .line 40
    move p4, v3

    .line 41
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const/4 v4, 0x1

    .line 46
    if-ge p4, v3, :cond_1

    .line 47
    .line 48
    add-int/lit8 v3, p4, -0x1

    .line 49
    .line 50
    const/4 v5, 0x4

    .line 51
    const/16 v6, 0xa

    .line 52
    .line 53
    invoke-static {p3, v6, v3, v5}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/lit16 v5, v2, 0x3e8

    .line 58
    .line 59
    if-lt v3, v5, :cond_1

    .line 60
    .line 61
    add-int/lit8 p4, v3, 0x1

    .line 62
    .line 63
    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    .line 64
    .line 65
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v5, "ok"

    .line 69
    .line 70
    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v5, "descriptor"

    .line 74
    .line 75
    invoke-virtual {v3, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    const-string p1, "sourceEntry"

    .line 79
    .line 80
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string p1, "sourcePath"

    .line 84
    .line 85
    iget-object p2, p0, Lfb/d0;->a:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    const-string p1, "returnedLength"

    .line 94
    .line 95
    sub-int p2, p4, v2

    .line 96
    .line 97
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    const-string p1, "totalLength"

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-ge p4, p1, :cond_2

    .line 114
    .line 115
    move v1, v4

    .line 116
    :cond_2
    const-string p1, "truncated"

    .line 117
    .line 118
    invoke-virtual {v3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-ge p4, p1, :cond_3

    .line 126
    .line 127
    const-string p1, "nextOffset"

    .line 128
    .line 129
    invoke-virtual {v3, p1, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    :cond_3
    const-string p1, "java"

    .line 133
    .line 134
    invoke-virtual {p3, v2, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    return-object p1
.end method
