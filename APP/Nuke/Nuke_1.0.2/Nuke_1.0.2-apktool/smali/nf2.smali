.class public abstract Lnf2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lt21;

.field public static final b:Lo72;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Set;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/Set;

.field public static final g:Ljava/util/Set;

.field public static final h:Ljava/util/Set;

.field public static final i:Ljava/util/Set;

.field public static final j:Ljava/util/Set;

.field public static final k:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    sget-object v0, Lu21;->d:Lt21;

    .line 2
    .line 3
    sput-object v0, Lnf2;->a:Lt21;

    .line 4
    .line 5
    new-instance v0, Lo72;

    .line 6
    .line 7
    const-string v1, "^[a-z][A-Za-z0-9_]*$"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lo72;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lnf2;->b:Lo72;

    .line 13
    .line 14
    const-string v0, "prototype"

    .line 15
    .line 16
    const-string v1, "constructor"

    .line 17
    .line 18
    const-string v2, "__proto__"

    .line 19
    .line 20
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lnf2;->c:Ljava/util/Set;

    .line 29
    .line 30
    const-string v0, "digits"

    .line 31
    .line 32
    const-string v1, "uri"

    .line 33
    .line 34
    const-string v2, "plain"

    .line 35
    .line 36
    const-string v3, "nonBlank"

    .line 37
    .line 38
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lnf2;->d:Ljava/util/Set;

    .line 47
    .line 48
    const-string v5, "required"

    .line 49
    .line 50
    const-string v6, "ui"

    .line 51
    .line 52
    const-string v1, "schemaVersion"

    .line 53
    .line 54
    const-string v2, "type"

    .line 55
    .line 56
    const-string v3, "additionalProperties"

    .line 57
    .line 58
    const-string v4, "properties"

    .line 59
    .line 60
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lnf2;->e:Ljava/util/Set;

    .line 69
    .line 70
    const-string v16, "maxItems"

    .line 71
    .line 72
    const-string v17, "uniqueItems"

    .line 73
    .line 74
    const-string v1, "type"

    .line 75
    .line 76
    const-string v2, "title"

    .line 77
    .line 78
    const-string v3, "description"

    .line 79
    .line 80
    const-string v4, "default"

    .line 81
    .line 82
    const-string v5, "sensitive"

    .line 83
    .line 84
    const-string v6, "options"

    .line 85
    .line 86
    const-string v7, "ui"

    .line 87
    .line 88
    const-string v8, "minimum"

    .line 89
    .line 90
    const-string v9, "maximum"

    .line 91
    .line 92
    const-string v10, "multipleOf"

    .line 93
    .line 94
    const-string v11, "minLength"

    .line 95
    .line 96
    const-string v12, "maxLength"

    .line 97
    .line 98
    const-string v13, "format"

    .line 99
    .line 100
    const-string v14, "items"

    .line 101
    .line 102
    const-string v15, "minItems"

    .line 103
    .line 104
    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sput-object v0, Lnf2;->f:Ljava/util/Set;

    .line 113
    .line 114
    const-string v7, "maxLength"

    .line 115
    .line 116
    const-string v8, "format"

    .line 117
    .line 118
    const-string v1, "type"

    .line 119
    .line 120
    const-string v2, "options"

    .line 121
    .line 122
    const-string v3, "minimum"

    .line 123
    .line 124
    const-string v4, "maximum"

    .line 125
    .line 126
    const-string v5, "multipleOf"

    .line 127
    .line 128
    const-string v6, "minLength"

    .line 129
    .line 130
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Lnf2;->g:Ljava/util/Set;

    .line 139
    .line 140
    const-string v0, "minLines"

    .line 141
    .line 142
    const-string v1, "maxLines"

    .line 143
    .line 144
    const-string v2, "widget"

    .line 145
    .line 146
    const-string v3, "placeholder"

    .line 147
    .line 148
    const-string v4, "unit"

    .line 149
    .line 150
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    sput-object v0, Lnf2;->h:Ljava/util/Set;

    .line 159
    .line 160
    const-string v0, "sections"

    .line 161
    .line 162
    invoke-static {v0}, Lt11;->Q(Ljava/lang/Object;)Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lnf2;->i:Ljava/util/Set;

    .line 167
    .line 168
    const-string v0, "title"

    .line 169
    .line 170
    const-string v1, "properties"

    .line 171
    .line 172
    const-string v2, "id"

    .line 173
    .line 174
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    sput-object v0, Lnf2;->j:Ljava/util/Set;

    .line 183
    .line 184
    const-string v0, "value"

    .line 185
    .line 186
    const-string v1, "label"

    .line 187
    .line 188
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sput-object v0, Lnf2;->k:Ljava/util/Set;

    .line 197
    .line 198
    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->codePointCount(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-gt p1, p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, " is too long."

    .line 14
    .line 15
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static b(Ld41;)Lz21;
    .locals 2

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lj31;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v1, p0, Lz21;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Lz21;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string p0, "Field \'options\' must be an array."

    .line 21
    .line 22
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static c(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of v1, p0, Li41;

    .line 12
    .line 13
    const-string v2, "\' must be a boolean."

    .line 14
    .line 15
    const-string v3, "Field \'"

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    check-cast p0, Li41;

    .line 20
    .line 21
    invoke-static {p0}, Ll31;->d(Li41;)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static d(Ld41;Ljava/lang/String;)Ljava/lang/Double;
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of v1, p0, Li41;

    .line 12
    .line 13
    const-string v2, "\' must be a finite number."

    .line 14
    .line 15
    const-string v3, "Field \'"

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    check-cast p0, Li41;

    .line 20
    .line 21
    sget-object v1, Ll31;->a:Lgz0;

    .line 22
    .line 23
    invoke-virtual {p0}, Li41;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lvv2;->V(Ljava/lang/String;)Ljava/lang/Double;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    const-wide v6, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmpg-double v1, v4, v6

    .line 47
    .line 48
    if-gtz v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v0

    .line 52
    :goto_0
    if-eqz p0, :cond_2

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method

.method public static e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of v1, p0, Li41;

    .line 12
    .line 13
    const-string v2, "\' must be an integer."

    .line 14
    .line 15
    const-string v3, "Field \'"

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    check-cast p0, Li41;

    .line 20
    .line 21
    invoke-static {p0}, Ll31;->e(Li41;)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_2
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static f(Ld41;Ljava/lang/String;)Ld41;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of v1, p0, Ld41;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast p0, Ld41;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    const-string p0, "Field \'"

    .line 19
    .line 20
    const-string v1, "\' must be an object."

    .line 21
    .line 22
    invoke-static {p0, p1, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static g(Ld41;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    instance-of v1, p0, Li41;

    .line 12
    .line 13
    const-string v2, "\' must be a string."

    .line 14
    .line 15
    const-string v3, "Field \'"

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    check-cast v1, Li41;

    .line 21
    .line 22
    invoke-virtual {v1}, Li41;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object p0, v0

    .line 30
    :goto_0
    check-cast p0, Li41;

    .line 31
    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Li41;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_3
    invoke-static {v3, p1, v2}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method

.method public static h(Ld41;Ljava/lang/String;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lj31;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lbe0;->h:Lbe0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    instance-of v0, p0, Lz21;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-string v2, "Field \'"

    .line 16
    .line 17
    if-eqz v0, :cond_6

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Iterable;

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v3, 0xa

    .line 24
    .line 25
    invoke-static {p0, v3}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v3, 0x0

    .line 37
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    add-int/lit8 v5, v3, 0x1

    .line 48
    .line 49
    if-ltz v3, :cond_4

    .line 50
    .line 51
    check-cast v4, Lj31;

    .line 52
    .line 53
    instance-of v6, v4, Li41;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    check-cast v4, Li41;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v4, v1

    .line 61
    :goto_1
    const-string v6, "]\' must be a string."

    .line 62
    .line 63
    const-string v7, "["

    .line 64
    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    invoke-virtual {v4}, Li41;->b()Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    invoke-virtual {v4}, Li41;->a()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move v3, v5

    .line 81
    goto :goto_0

    .line 82
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_4
    invoke-static {}, Leu;->a0()V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_5
    return-object v0

    .line 145
    :cond_6
    const-string p0, "\' must be an array."

    .line 146
    .line 147
    invoke-static {v2, p1, p0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method

.method public static i(Ljava/lang/String;)Llf2;
    .locals 49

    .line 1
    const-string v0, "\ufeff"

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    invoke-static {v1, v0}, Lpv2;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lnf2;->a:Lt21;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v2, Lo31;->a:Lo31;

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Lu21;->a(Lw41;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lj31;

    .line 21
    .line 22
    instance-of v1, v0, Ld41;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, Ld41;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_65

    .line 31
    .line 32
    sget-object v1, Lnf2;->e:Ljava/util/Set;

    .line 33
    .line 34
    const-string v3, "Config schema"

    .line 35
    .line 36
    invoke-static {v0, v1, v3}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "schemaVersion"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v3, v1, Li41;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    check-cast v1, Li41;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    if-eqz v1, :cond_64

    .line 54
    .line 55
    invoke-static {v1}, Ll31;->e(Li41;)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_64

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const/4 v3, 0x1

    .line 66
    if-ne v1, v3, :cond_63

    .line 67
    .line 68
    const-string v1, "type"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "object"

    .line 75
    .line 76
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_62

    .line 81
    .line 82
    const-string v4, "additionalProperties"

    .line 83
    .line 84
    invoke-static {v0, v4}, Lnf2;->c(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-static {v4, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_61

    .line 95
    .line 96
    const-string v4, "required"

    .line 97
    .line 98
    invoke-static {v0, v4}, Lnf2;->h(Ld41;Ljava/lang/String;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v5, "properties"

    .line 107
    .line 108
    invoke-virtual {v0, v5}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    instance-of v7, v6, Ld41;

    .line 113
    .line 114
    if-eqz v7, :cond_2

    .line 115
    .line 116
    check-cast v6, Ld41;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    const/4 v6, 0x0

    .line 120
    :goto_2
    if-eqz v6, :cond_60

    .line 121
    .line 122
    iget-object v6, v6, Ld41;->h:Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_5f

    .line 129
    .line 130
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    const/16 v8, 0x80

    .line 135
    .line 136
    if-gt v7, v8, :cond_5e

    .line 137
    .line 138
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 139
    .line 140
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    const-string v11, "ui"

    .line 156
    .line 157
    const-string v12, "title"

    .line 158
    .line 159
    if-eqz v9, :cond_4b

    .line 160
    .line 161
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    check-cast v9, Ljava/util/Map$Entry;

    .line 166
    .line 167
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    move-object v15, v13

    .line 172
    check-cast v15, Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    check-cast v9, Lj31;

    .line 179
    .line 180
    sget-object v13, Lnf2;->b:Lo72;

    .line 181
    .line 182
    invoke-virtual {v13, v15}, Lo72;->b(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    const-string v14, "\'."

    .line 187
    .line 188
    if-eqz v13, :cond_4a

    .line 189
    .line 190
    sget-object v13, Lnf2;->c:Ljava/util/Set;

    .line 191
    .line 192
    invoke-interface {v13, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v13

    .line 196
    if-nez v13, :cond_4a

    .line 197
    .line 198
    instance-of v13, v9, Ld41;

    .line 199
    .line 200
    if-eqz v13, :cond_3

    .line 201
    .line 202
    check-cast v9, Ld41;

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_3
    const/4 v9, 0x0

    .line 206
    :goto_4
    const-string v13, "Config property \'"

    .line 207
    .line 208
    if-eqz v9, :cond_49

    .line 209
    .line 210
    invoke-interface {v4, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v20

    .line 214
    const/16 p0, 0x0

    .line 215
    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v10, "\'"

    .line 225
    .line 226
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    sget-object v8, Lnf2;->f:Ljava/util/Set;

    .line 234
    .line 235
    invoke-static {v9, v8, v2}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v9, v1}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    sget-object v8, Luf2;->i:Li51;

    .line 243
    .line 244
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Li51;->t(Ljava/lang/String;)Luf2;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    const-string v8, "sensitive"

    .line 252
    .line 253
    invoke-static {v9, v8}, Lnf2;->c(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    if-eqz v8, :cond_4

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    move/from16 v21, v8

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_4
    const/16 v21, 0x0

    .line 267
    .line 268
    :goto_5
    sget-object v8, Luf2;->m:Luf2;

    .line 269
    .line 270
    if-eqz v21, :cond_6

    .line 271
    .line 272
    if-ne v2, v8, :cond_5

    .line 273
    .line 274
    goto :goto_6

    .line 275
    :cond_5
    const-string v0, "Sensitive config property \'"

    .line 276
    .line 277
    const-string v1, "\' must be a string."

    .line 278
    .line 279
    invoke-static {v0, v15, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    return-object p0

    .line 287
    :cond_6
    :goto_6
    invoke-static {v9}, Lnf2;->b(Ld41;)Lz21;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    move-object/from16 v34, v4

    .line 292
    .line 293
    if-eqz v3, :cond_7

    .line 294
    .line 295
    new-instance v4, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-static {v3, v2, v4}, Lnf2;->j(Lz21;Luf2;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    goto :goto_7

    .line 315
    :cond_7
    move-object/from16 v3, p0

    .line 316
    .line 317
    :goto_7
    sget-object v4, Lbe0;->h:Lbe0;

    .line 318
    .line 319
    if-nez v3, :cond_8

    .line 320
    .line 321
    move-object/from16 v22, v4

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :cond_8
    move-object/from16 v22, v3

    .line 325
    .line 326
    :goto_8
    const-string v3, "items"

    .line 327
    .line 328
    invoke-static {v9, v3}, Lnf2;->f(Ld41;Ljava/lang/String;)Ld41;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    sget-object v10, Luf2;->n:Luf2;

    .line 333
    .line 334
    move-object/from16 v17, v4

    .line 335
    .line 336
    const-string v4, "format"

    .line 337
    .line 338
    move-object/from16 v35, v6

    .line 339
    .line 340
    const-string v6, "maxLength"

    .line 341
    .line 342
    move-object/from16 v36, v5

    .line 343
    .line 344
    const-string v5, "minLength"

    .line 345
    .line 346
    const-wide/16 v18, 0x0

    .line 347
    .line 348
    move-object/from16 v37, v0

    .line 349
    .line 350
    const-string v0, "multipleOf"

    .line 351
    .line 352
    move-object/from16 v38, v7

    .line 353
    .line 354
    const-string v7, "maximum"

    .line 355
    .line 356
    move-object/from16 v23, v12

    .line 357
    .line 358
    const-string v12, "minimum"

    .line 359
    .line 360
    if-eqz v3, :cond_13

    .line 361
    .line 362
    move-object/from16 v24, v8

    .line 363
    .line 364
    new-instance v8, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v8, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    move-object/from16 v25, v14

    .line 373
    .line 374
    const-string v14, "\' items"

    .line 375
    .line 376
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v8

    .line 383
    move-object/from16 v26, v9

    .line 384
    .line 385
    sget-object v9, Lnf2;->g:Ljava/util/Set;

    .line 386
    .line 387
    invoke-static {v3, v9, v8}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v3, v1}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v8

    .line 394
    invoke-static {v8}, Li51;->t(Ljava/lang/String;)Luf2;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    if-eq v8, v10, :cond_12

    .line 399
    .line 400
    invoke-static {v3, v12}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 401
    .line 402
    .line 403
    move-result-object v42

    .line 404
    invoke-static {v3, v7}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 405
    .line 406
    .line 407
    move-result-object v43

    .line 408
    if-eqz v42, :cond_a

    .line 409
    .line 410
    if-eqz v43, :cond_a

    .line 411
    .line 412
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Double;->doubleValue()D

    .line 413
    .line 414
    .line 415
    move-result-wide v27

    .line 416
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Double;->doubleValue()D

    .line 417
    .line 418
    .line 419
    move-result-wide v29

    .line 420
    cmpg-double v9, v27, v29

    .line 421
    .line 422
    if-gtz v9, :cond_9

    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_9
    const-string v0, "\' item minimum must not exceed maximum."

    .line 426
    .line 427
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    return-object p0

    .line 435
    :cond_a
    :goto_9
    invoke-static {v3, v0}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 436
    .line 437
    .line 438
    move-result-object v44

    .line 439
    if-eqz v44, :cond_c

    .line 440
    .line 441
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Double;->doubleValue()D

    .line 442
    .line 443
    .line 444
    move-result-wide v27

    .line 445
    cmpl-double v9, v27, v18

    .line 446
    .line 447
    if-lez v9, :cond_b

    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_b
    const-string v0, "\' item multipleOf must be positive."

    .line 451
    .line 452
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    return-object p0

    .line 460
    :cond_c
    :goto_a
    invoke-static {v3, v5}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v45

    .line 464
    invoke-static {v3, v6}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 465
    .line 466
    .line 467
    move-result-object v46

    .line 468
    if-eqz v45, :cond_e

    .line 469
    .line 470
    if-eqz v46, :cond_e

    .line 471
    .line 472
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v9

    .line 476
    move-object/from16 v48, v1

    .line 477
    .line 478
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-gt v9, v1, :cond_d

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_d
    const-string v0, "\' item minLength must not exceed maxLength."

    .line 486
    .line 487
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    return-object p0

    .line 495
    :cond_e
    move-object/from16 v48, v1

    .line 496
    .line 497
    :goto_b
    invoke-static {v3}, Lnf2;->b(Ld41;)Lz21;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    if-eqz v1, :cond_f

    .line 502
    .line 503
    new-instance v9, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-direct {v9, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-static {v1, v8, v9}, Lnf2;->j(Lz21;Luf2;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    goto :goto_c

    .line 523
    :cond_f
    move-object/from16 v1, p0

    .line 524
    .line 525
    :goto_c
    if-nez v1, :cond_10

    .line 526
    .line 527
    move-object/from16 v41, v17

    .line 528
    .line 529
    goto :goto_d

    .line 530
    :cond_10
    move-object/from16 v41, v1

    .line 531
    .line 532
    :goto_d
    invoke-static {v3, v4}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    if-eqz v1, :cond_11

    .line 537
    .line 538
    invoke-static {v1}, Lnf2;->m(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    move-object/from16 v47, v1

    .line 542
    .line 543
    goto :goto_e

    .line 544
    :cond_11
    move-object/from16 v47, p0

    .line 545
    .line 546
    :goto_e
    new-instance v39, Lif2;

    .line 547
    .line 548
    move-object/from16 v40, v8

    .line 549
    .line 550
    invoke-direct/range {v39 .. v47}, Lif2;-><init>(Luf2;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    move-object/from16 v29, v39

    .line 554
    .line 555
    goto :goto_f

    .line 556
    :cond_12
    const-string v0, "Nested config arrays are not supported."

    .line 557
    .line 558
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    return-object p0

    .line 562
    :cond_13
    move-object/from16 v48, v1

    .line 563
    .line 564
    move-object/from16 v24, v8

    .line 565
    .line 566
    move-object/from16 v26, v9

    .line 567
    .line 568
    move-object/from16 v25, v14

    .line 569
    .line 570
    move-object/from16 v29, p0

    .line 571
    .line 572
    :goto_f
    if-ne v2, v10, :cond_14

    .line 573
    .line 574
    const/4 v1, 0x1

    .line 575
    goto :goto_10

    .line 576
    :cond_14
    const/4 v1, 0x0

    .line 577
    :goto_10
    if-eqz v29, :cond_15

    .line 578
    .line 579
    const/4 v3, 0x1

    .line 580
    goto :goto_11

    .line 581
    :cond_15
    const/4 v3, 0x0

    .line 582
    :goto_11
    if-ne v1, v3, :cond_48

    .line 583
    .line 584
    move-object/from16 v9, v26

    .line 585
    .line 586
    invoke-static {v9, v11}, Lnf2;->f(Ld41;Ljava/lang/String;)Ld41;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    sget-object v3, Lwf2;->p:Lwf2;

    .line 591
    .line 592
    sget-object v8, Lwf2;->q:Lwf2;

    .line 593
    .line 594
    sget-object v14, Lwf2;->l:Lwf2;

    .line 595
    .line 596
    move-object/from16 v17, v8

    .line 597
    .line 598
    sget-object v8, Lwf2;->m:Lwf2;

    .line 599
    .line 600
    move-object/from16 v26, v4

    .line 601
    .line 602
    sget-object v4, Lwf2;->j:Lwf2;

    .line 603
    .line 604
    move-object/from16 v27, v10

    .line 605
    .line 606
    sget-object v10, Lwf2;->o:Lwf2;

    .line 607
    .line 608
    move-object/from16 v28, v6

    .line 609
    .line 610
    if-eqz v1, :cond_19

    .line 611
    .line 612
    const-string v6, "widget"

    .line 613
    .line 614
    invoke-static {v1, v6}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    if-eqz v1, :cond_19

    .line 619
    .line 620
    sget-object v6, Lwf2;->i:Lj51;

    .line 621
    .line 622
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    sget-object v6, Lwf2;->s:Lyf0;

    .line 626
    .line 627
    invoke-virtual {v6}, Lw2;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v6

    .line 631
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v24

    .line 635
    if-eqz v24, :cond_17

    .line 636
    .line 637
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v24

    .line 641
    move-object/from16 v30, v6

    .line 642
    .line 643
    move-object/from16 v6, v24

    .line 644
    .line 645
    check-cast v6, Lwf2;

    .line 646
    .line 647
    iget-object v6, v6, Lwf2;->h:Ljava/lang/String;

    .line 648
    .line 649
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v6

    .line 653
    if-eqz v6, :cond_16

    .line 654
    .line 655
    goto :goto_13

    .line 656
    :cond_16
    move-object/from16 v6, v30

    .line 657
    .line 658
    goto :goto_12

    .line 659
    :cond_17
    move-object/from16 v24, p0

    .line 660
    .line 661
    :goto_13
    check-cast v24, Lwf2;

    .line 662
    .line 663
    if-eqz v24, :cond_18

    .line 664
    .line 665
    move-object/from16 v6, v25

    .line 666
    .line 667
    :goto_14
    move-object/from16 v1, v24

    .line 668
    .line 669
    goto :goto_16

    .line 670
    :cond_18
    const-string v0, "Unsupported config widget \'"

    .line 671
    .line 672
    move-object/from16 v6, v25

    .line 673
    .line 674
    invoke-static {v0, v1, v6}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    return-object p0

    .line 682
    :cond_19
    move-object/from16 v6, v25

    .line 683
    .line 684
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    move/from16 v25, v1

    .line 689
    .line 690
    sget-object v1, Luf2;->j:Luf2;

    .line 691
    .line 692
    if-ne v2, v1, :cond_1a

    .line 693
    .line 694
    move-object/from16 v24, v4

    .line 695
    .line 696
    goto :goto_14

    .line 697
    :cond_1a
    if-nez v25, :cond_1b

    .line 698
    .line 699
    move-object/from16 v24, v10

    .line 700
    .line 701
    goto :goto_14

    .line 702
    :cond_1b
    move-object/from16 v1, v24

    .line 703
    .line 704
    if-ne v2, v1, :cond_1c

    .line 705
    .line 706
    if-eqz v21, :cond_1c

    .line 707
    .line 708
    move-object/from16 v24, v8

    .line 709
    .line 710
    goto :goto_14

    .line 711
    :cond_1c
    if-ne v2, v1, :cond_1d

    .line 712
    .line 713
    move-object/from16 v24, v14

    .line 714
    .line 715
    goto :goto_14

    .line 716
    :cond_1d
    sget-object v1, Luf2;->k:Luf2;

    .line 717
    .line 718
    if-eq v2, v1, :cond_1f

    .line 719
    .line 720
    sget-object v1, Luf2;->l:Luf2;

    .line 721
    .line 722
    if-ne v2, v1, :cond_1e

    .line 723
    .line 724
    goto :goto_15

    .line 725
    :cond_1e
    move-object/from16 v24, v17

    .line 726
    .line 727
    goto :goto_14

    .line 728
    :cond_1f
    :goto_15
    move-object/from16 v24, v3

    .line 729
    .line 730
    goto :goto_14

    .line 731
    :goto_16
    invoke-interface/range {v22 .. v22}, Ljava/util/Collection;->isEmpty()Z

    .line 732
    .line 733
    .line 734
    move-result v24

    .line 735
    move-object/from16 v25, v6

    .line 736
    .line 737
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 738
    .line 739
    .line 740
    move-result v6

    .line 741
    move-object/from16 v30, v2

    .line 742
    .line 743
    sget-object v2, Lwf2;->n:Lwf2;

    .line 744
    .line 745
    move-object/from16 v31, v5

    .line 746
    .line 747
    if-eqz v6, :cond_23

    .line 748
    .line 749
    const/4 v5, 0x1

    .line 750
    if-eq v6, v5, :cond_22

    .line 751
    .line 752
    const/4 v4, 0x2

    .line 753
    if-eq v6, v4, :cond_22

    .line 754
    .line 755
    const/4 v5, 0x3

    .line 756
    if-eq v6, v5, :cond_21

    .line 757
    .line 758
    const/4 v3, 0x4

    .line 759
    if-ne v6, v3, :cond_20

    .line 760
    .line 761
    invoke-static/range {v17 .. v17}, Lt11;->Q(Ljava/lang/Object;)Ljava/util/Set;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    goto :goto_17

    .line 766
    :cond_20
    invoke-static {}, Lc80;->s()V

    .line 767
    .line 768
    .line 769
    return-object p0

    .line 770
    :cond_21
    filled-new-array {v14, v8, v2, v10}, [Lwf2;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    invoke-static {v3}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    goto :goto_17

    .line 779
    :cond_22
    const/4 v5, 0x3

    .line 780
    filled-new-array {v3, v10}, [Lwf2;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-static {v3}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    goto :goto_17

    .line 789
    :cond_23
    const/4 v5, 0x3

    .line 790
    sget-object v3, Lwf2;->k:Lwf2;

    .line 791
    .line 792
    filled-new-array {v4, v3}, [Lwf2;

    .line 793
    .line 794
    .line 795
    move-result-object v3

    .line 796
    invoke-static {v3}, Lmg;->u0([Ljava/lang/Object;)Ljava/util/Set;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    :goto_17
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    if-eqz v3, :cond_47

    .line 805
    .line 806
    if-ne v1, v10, :cond_25

    .line 807
    .line 808
    if-nez v24, :cond_24

    .line 809
    .line 810
    goto :goto_18

    .line 811
    :cond_24
    const-string v0, "Select config property \'"

    .line 812
    .line 813
    const-string v1, "\' must define options."

    .line 814
    .line 815
    invoke-static {v0, v15, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 820
    .line 821
    .line 822
    return-object p0

    .line 823
    :cond_25
    :goto_18
    invoke-static {v9, v11}, Lnf2;->f(Ld41;Ljava/lang/String;)Ld41;

    .line 824
    .line 825
    .line 826
    move-result-object v3

    .line 827
    if-eqz v3, :cond_26

    .line 828
    .line 829
    new-instance v4, Ljava/lang/StringBuilder;

    .line 830
    .line 831
    invoke-direct {v4, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    const-string v6, "\' ui"

    .line 838
    .line 839
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    sget-object v6, Lnf2;->h:Ljava/util/Set;

    .line 847
    .line 848
    invoke-static {v3, v6, v4}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    :cond_26
    if-eqz v3, :cond_27

    .line 852
    .line 853
    const-string v4, "minLines"

    .line 854
    .line 855
    invoke-static {v3, v4}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    move-object/from16 v43, v4

    .line 860
    .line 861
    goto :goto_19

    .line 862
    :cond_27
    move-object/from16 v43, p0

    .line 863
    .line 864
    :goto_19
    if-eqz v3, :cond_28

    .line 865
    .line 866
    const-string v4, "maxLines"

    .line 867
    .line 868
    invoke-static {v3, v4}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 869
    .line 870
    .line 871
    move-result-object v4

    .line 872
    move-object/from16 v44, v4

    .line 873
    .line 874
    goto :goto_1a

    .line 875
    :cond_28
    move-object/from16 v44, p0

    .line 876
    .line 877
    :goto_1a
    if-ne v1, v2, :cond_2f

    .line 878
    .line 879
    if-eqz v43, :cond_29

    .line 880
    .line 881
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Integer;->intValue()I

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    :goto_1b
    const/4 v4, 0x1

    .line 886
    goto :goto_1c

    .line 887
    :cond_29
    move v2, v5

    .line 888
    goto :goto_1b

    .line 889
    :goto_1c
    if-gt v4, v2, :cond_2e

    .line 890
    .line 891
    const/16 v6, 0xd

    .line 892
    .line 893
    if-ge v2, v6, :cond_2e

    .line 894
    .line 895
    const/4 v2, 0x5

    .line 896
    if-eqz v44, :cond_2a

    .line 897
    .line 898
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Integer;->intValue()I

    .line 899
    .line 900
    .line 901
    move-result v8

    .line 902
    goto :goto_1d

    .line 903
    :cond_2a
    move v8, v2

    .line 904
    :goto_1d
    if-gt v4, v8, :cond_2e

    .line 905
    .line 906
    if-ge v8, v6, :cond_2e

    .line 907
    .line 908
    if-eqz v44, :cond_2b

    .line 909
    .line 910
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Integer;->intValue()I

    .line 911
    .line 912
    .line 913
    move-result v2

    .line 914
    :cond_2b
    if-eqz v43, :cond_2c

    .line 915
    .line 916
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Integer;->intValue()I

    .line 917
    .line 918
    .line 919
    move-result v5

    .line 920
    :cond_2c
    if-lt v2, v5, :cond_2d

    .line 921
    .line 922
    goto :goto_1e

    .line 923
    :cond_2d
    const-string v0, "Textarea maxLines for \'"

    .line 924
    .line 925
    const-string v1, "\' must not be smaller than minLines."

    .line 926
    .line 927
    invoke-static {v0, v15, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    return-object p0

    .line 935
    :cond_2e
    const-string v0, "Textarea lines for \'"

    .line 936
    .line 937
    const-string v1, "\' must be between 1 and 12."

    .line 938
    .line 939
    invoke-static {v0, v15, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 944
    .line 945
    .line 946
    return-object p0

    .line 947
    :cond_2f
    if-nez v43, :cond_46

    .line 948
    .line 949
    if-nez v44, :cond_46

    .line 950
    .line 951
    :goto_1e
    invoke-static {v9, v12}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 952
    .line 953
    .line 954
    move-result-object v2

    .line 955
    invoke-static {v9, v7}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 956
    .line 957
    .line 958
    move-result-object v24

    .line 959
    if-eqz v2, :cond_31

    .line 960
    .line 961
    if-eqz v24, :cond_31

    .line 962
    .line 963
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 964
    .line 965
    .line 966
    move-result-wide v4

    .line 967
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Double;->doubleValue()D

    .line 968
    .line 969
    .line 970
    move-result-wide v6

    .line 971
    cmpg-double v4, v4, v6

    .line 972
    .line 973
    if-gtz v4, :cond_30

    .line 974
    .line 975
    goto :goto_1f

    .line 976
    :cond_30
    const-string v0, "\' minimum must not exceed maximum."

    .line 977
    .line 978
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    return-object p0

    .line 986
    :cond_31
    :goto_1f
    invoke-static {v9, v0}, Lnf2;->d(Ld41;Ljava/lang/String;)Ljava/lang/Double;

    .line 987
    .line 988
    .line 989
    move-result-object v25

    .line 990
    if-eqz v25, :cond_32

    .line 991
    .line 992
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Double;->doubleValue()D

    .line 993
    .line 994
    .line 995
    move-result-wide v4

    .line 996
    cmpl-double v0, v4, v18

    .line 997
    .line 998
    if-lez v0, :cond_33

    .line 999
    .line 1000
    :cond_32
    move-object/from16 v0, v31

    .line 1001
    .line 1002
    goto :goto_20

    .line 1003
    :cond_33
    const-string v0, "\' multipleOf must be positive."

    .line 1004
    .line 1005
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    return-object p0

    .line 1013
    :goto_20
    invoke-static {v9, v0}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    move-object/from16 v4, v28

    .line 1018
    .line 1019
    invoke-static {v9, v4}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v4

    .line 1023
    if-eqz v0, :cond_35

    .line 1024
    .line 1025
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1026
    .line 1027
    .line 1028
    move-result v5

    .line 1029
    if-ltz v5, :cond_34

    .line 1030
    .line 1031
    goto :goto_21

    .line 1032
    :cond_34
    const-string v0, "\' minLength is invalid."

    .line 1033
    .line 1034
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    return-object p0

    .line 1042
    :cond_35
    :goto_21
    if-eqz v4, :cond_37

    .line 1043
    .line 1044
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1045
    .line 1046
    .line 1047
    move-result v5

    .line 1048
    if-ltz v5, :cond_36

    .line 1049
    .line 1050
    goto :goto_22

    .line 1051
    :cond_36
    const-string v0, "\' maxLength is invalid."

    .line 1052
    .line 1053
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    return-object p0

    .line 1061
    :cond_37
    :goto_22
    if-eqz v0, :cond_39

    .line 1062
    .line 1063
    if-eqz v4, :cond_39

    .line 1064
    .line 1065
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1066
    .line 1067
    .line 1068
    move-result v5

    .line 1069
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1070
    .line 1071
    .line 1072
    move-result v6

    .line 1073
    if-gt v5, v6, :cond_38

    .line 1074
    .line 1075
    goto :goto_23

    .line 1076
    :cond_38
    const-string v0, "\' minLength must not exceed maxLength."

    .line 1077
    .line 1078
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    return-object p0

    .line 1086
    :cond_39
    :goto_23
    const-string v5, "minItems"

    .line 1087
    .line 1088
    invoke-static {v9, v5}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v6

    .line 1092
    if-eqz v6, :cond_3a

    .line 1093
    .line 1094
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    goto :goto_24

    .line 1099
    :cond_3a
    const/4 v6, 0x0

    .line 1100
    :goto_24
    const-string v7, "maxItems"

    .line 1101
    .line 1102
    invoke-static {v9, v7}, Lnf2;->e(Ld41;Ljava/lang/String;)Ljava/lang/Integer;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v8

    .line 1106
    const/16 v10, 0x100

    .line 1107
    .line 1108
    if-eqz v8, :cond_3b

    .line 1109
    .line 1110
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 1111
    .line 1112
    .line 1113
    move-result v8

    .line 1114
    goto :goto_25

    .line 1115
    :cond_3b
    move v8, v10

    .line 1116
    :goto_25
    if-ltz v6, :cond_45

    .line 1117
    .line 1118
    const/16 v11, 0x101

    .line 1119
    .line 1120
    if-ge v6, v11, :cond_45

    .line 1121
    .line 1122
    const/4 v12, 0x1

    .line 1123
    if-gt v12, v8, :cond_45

    .line 1124
    .line 1125
    if-ge v8, v11, :cond_45

    .line 1126
    .line 1127
    if-gt v6, v8, :cond_45

    .line 1128
    .line 1129
    const-string v11, "uniqueItems"

    .line 1130
    .line 1131
    move-object/from16 v13, v27

    .line 1132
    .line 1133
    move-object/from16 v12, v30

    .line 1134
    .line 1135
    if-eq v12, v13, :cond_3c

    .line 1136
    .line 1137
    invoke-virtual {v9, v5}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 1138
    .line 1139
    .line 1140
    move-result v5

    .line 1141
    if-nez v5, :cond_3d

    .line 1142
    .line 1143
    invoke-virtual {v9, v7}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v5

    .line 1147
    if-nez v5, :cond_3d

    .line 1148
    .line 1149
    invoke-virtual {v9, v11}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v5

    .line 1153
    if-nez v5, :cond_3d

    .line 1154
    .line 1155
    :cond_3c
    move-object/from16 v5, v23

    .line 1156
    .line 1157
    goto :goto_26

    .line 1158
    :cond_3d
    const-string v0, "Array constraints are only valid for array config properties."

    .line 1159
    .line 1160
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    return-object p0

    .line 1164
    :goto_26
    invoke-static {v9, v5}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v7

    .line 1168
    const/16 v13, 0x80

    .line 1169
    .line 1170
    invoke-static {v13, v7, v5}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1171
    .line 1172
    .line 1173
    const-string v5, "description"

    .line 1174
    .line 1175
    invoke-static {v9, v5}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v13

    .line 1179
    if-eqz v13, :cond_3e

    .line 1180
    .line 1181
    const/16 v14, 0x800

    .line 1182
    .line 1183
    invoke-static {v14, v13, v5}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1184
    .line 1185
    .line 1186
    move-object/from16 v18, v13

    .line 1187
    .line 1188
    goto :goto_27

    .line 1189
    :cond_3e
    move-object/from16 v18, p0

    .line 1190
    .line 1191
    :goto_27
    const-string v5, "default"

    .line 1192
    .line 1193
    invoke-virtual {v9, v5}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v5

    .line 1197
    move-object/from16 v19, v5

    .line 1198
    .line 1199
    check-cast v19, Lj31;

    .line 1200
    .line 1201
    move-object/from16 v5, v26

    .line 1202
    .line 1203
    invoke-static {v9, v5}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    if-eqz v5, :cond_3f

    .line 1208
    .line 1209
    invoke-static {v5}, Lnf2;->m(Ljava/lang/String;)V

    .line 1210
    .line 1211
    .line 1212
    move-object/from16 v28, v5

    .line 1213
    .line 1214
    goto :goto_28

    .line 1215
    :cond_3f
    move-object/from16 v28, p0

    .line 1216
    .line 1217
    :goto_28
    invoke-static {v9, v11}, Lnf2;->c(Ld41;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v5

    .line 1221
    if-eqz v5, :cond_40

    .line 1222
    .line 1223
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v5

    .line 1227
    move/from16 v32, v5

    .line 1228
    .line 1229
    goto :goto_29

    .line 1230
    :cond_40
    const/16 v32, 0x0

    .line 1231
    .line 1232
    :goto_29
    new-instance v33, Lvf2;

    .line 1233
    .line 1234
    if-eqz v3, :cond_41

    .line 1235
    .line 1236
    const-string v5, "placeholder"

    .line 1237
    .line 1238
    invoke-static {v3, v5}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v9

    .line 1242
    if-eqz v9, :cond_41

    .line 1243
    .line 1244
    invoke-static {v10, v9, v5}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1245
    .line 1246
    .line 1247
    move-object/from16 v41, v9

    .line 1248
    .line 1249
    goto :goto_2a

    .line 1250
    :cond_41
    move-object/from16 v41, p0

    .line 1251
    .line 1252
    :goto_2a
    if-eqz v3, :cond_42

    .line 1253
    .line 1254
    const-string v5, "unit"

    .line 1255
    .line 1256
    invoke-static {v3, v5}, Lnf2;->g(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v3

    .line 1260
    if-eqz v3, :cond_42

    .line 1261
    .line 1262
    const/16 v13, 0x80

    .line 1263
    .line 1264
    invoke-static {v13, v3, v5}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    move-object/from16 v42, v3

    .line 1268
    .line 1269
    :goto_2b
    move-object/from16 v40, v1

    .line 1270
    .line 1271
    move-object/from16 v39, v33

    .line 1272
    .line 1273
    goto :goto_2c

    .line 1274
    :cond_42
    move-object/from16 v42, p0

    .line 1275
    .line 1276
    goto :goto_2b

    .line 1277
    :goto_2c
    invoke-direct/range {v39 .. v44}, Lvf2;-><init>(Lwf2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 1278
    .line 1279
    .line 1280
    move-object/from16 v33, v39

    .line 1281
    .line 1282
    new-instance v14, Lkf2;

    .line 1283
    .line 1284
    move-object/from16 v26, v0

    .line 1285
    .line 1286
    move-object/from16 v23, v2

    .line 1287
    .line 1288
    move-object/from16 v27, v4

    .line 1289
    .line 1290
    move/from16 v30, v6

    .line 1291
    .line 1292
    move-object/from16 v17, v7

    .line 1293
    .line 1294
    move/from16 v31, v8

    .line 1295
    .line 1296
    move-object/from16 v16, v12

    .line 1297
    .line 1298
    invoke-direct/range {v14 .. v33}, Lkf2;-><init>(Ljava/lang/String;Luf2;Ljava/lang/String;Ljava/lang/String;Lj31;ZZLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lif2;IIZLvf2;)V

    .line 1299
    .line 1300
    .line 1301
    move-object/from16 v5, v19

    .line 1302
    .line 1303
    if-nez v5, :cond_43

    .line 1304
    .line 1305
    :goto_2d
    move-object/from16 v1, v38

    .line 1306
    .line 1307
    goto :goto_2e

    .line 1308
    :cond_43
    invoke-static {v14, v5}, Lup0;->M(Lkf2;Lj31;)Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    if-nez v0, :cond_44

    .line 1313
    .line 1314
    goto :goto_2d

    .line 1315
    :goto_2e
    invoke-interface {v1, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-object v7, v1

    .line 1319
    move-object/from16 v4, v34

    .line 1320
    .line 1321
    move-object/from16 v6, v35

    .line 1322
    .line 1323
    move-object/from16 v5, v36

    .line 1324
    .line 1325
    move-object/from16 v0, v37

    .line 1326
    .line 1327
    move-object/from16 v1, v48

    .line 1328
    .line 1329
    const/4 v3, 0x1

    .line 1330
    const/16 v8, 0x80

    .line 1331
    .line 1332
    goto/16 :goto_3

    .line 1333
    .line 1334
    :cond_44
    const-string v1, "Default value for config \'"

    .line 1335
    .line 1336
    const-string v2, "\' is invalid: "

    .line 1337
    .line 1338
    invoke-static {v1, v15, v2, v0}, Lum2;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    return-object p0

    .line 1342
    :cond_45
    const-string v0, "\' array limits are invalid."

    .line 1343
    .line 1344
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1349
    .line 1350
    .line 1351
    return-object p0

    .line 1352
    :cond_46
    const-string v0, "minLines and maxLines are only valid for textarea config properties."

    .line 1353
    .line 1354
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1355
    .line 1356
    .line 1357
    return-object p0

    .line 1358
    :cond_47
    move-object v0, v1

    .line 1359
    iget-object v0, v0, Lwf2;->h:Ljava/lang/String;

    .line 1360
    .line 1361
    const-string v1, "Widget \'"

    .line 1362
    .line 1363
    const-string v2, "\' is invalid for config property \'"

    .line 1364
    .line 1365
    move-object/from16 v6, v25

    .line 1366
    .line 1367
    invoke-static {v1, v0, v2, v15, v6}, Lvi0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1372
    .line 1373
    .line 1374
    return-object p0

    .line 1375
    :cond_48
    const-string v0, "Array config property \'"

    .line 1376
    .line 1377
    const-string v1, "\' must define items, and non-array properties must not."

    .line 1378
    .line 1379
    invoke-static {v0, v15, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    return-object p0

    .line 1387
    :cond_49
    const/16 p0, 0x0

    .line 1388
    .line 1389
    const-string v0, "\' must be an object."

    .line 1390
    .line 1391
    invoke-static {v13, v15, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1396
    .line 1397
    .line 1398
    return-object p0

    .line 1399
    :cond_4a
    move-object v6, v14

    .line 1400
    const/16 p0, 0x0

    .line 1401
    .line 1402
    const-string v0, "Invalid config key \'"

    .line 1403
    .line 1404
    invoke-static {v0, v15, v6}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 1409
    .line 1410
    .line 1411
    return-object p0

    .line 1412
    :cond_4b
    move-object/from16 v37, v0

    .line 1413
    .line 1414
    move-object/from16 v34, v4

    .line 1415
    .line 1416
    move-object/from16 v36, v5

    .line 1417
    .line 1418
    move-object v1, v7

    .line 1419
    move-object v5, v12

    .line 1420
    const/16 p0, 0x0

    .line 1421
    .line 1422
    move-object/from16 v4, v34

    .line 1423
    .line 1424
    check-cast v4, Ljava/lang/Iterable;

    .line 1425
    .line 1426
    instance-of v0, v4, Ljava/util/Collection;

    .line 1427
    .line 1428
    if-eqz v0, :cond_4d

    .line 1429
    .line 1430
    move-object v0, v4

    .line 1431
    check-cast v0, Ljava/util/Collection;

    .line 1432
    .line 1433
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1434
    .line 1435
    .line 1436
    move-result v0

    .line 1437
    if-eqz v0, :cond_4d

    .line 1438
    .line 1439
    :cond_4c
    move-object/from16 v0, v37

    .line 1440
    .line 1441
    goto :goto_30

    .line 1442
    :cond_4d
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1447
    .line 1448
    .line 1449
    move-result v2

    .line 1450
    if-eqz v2, :cond_4c

    .line 1451
    .line 1452
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v2

    .line 1456
    check-cast v2, Ljava/lang/String;

    .line 1457
    .line 1458
    invoke-virtual {v1, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 1459
    .line 1460
    .line 1461
    move-result v2

    .line 1462
    if-eqz v2, :cond_4e

    .line 1463
    .line 1464
    goto :goto_2f

    .line 1465
    :cond_4e
    const-string v0, "Config schema required contains an unknown property."

    .line 1466
    .line 1467
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1468
    .line 1469
    .line 1470
    return-object p0

    .line 1471
    :goto_30
    invoke-static {v0, v11}, Lnf2;->f(Ld41;Ljava/lang/String;)Ld41;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    if-eqz v0, :cond_5d

    .line 1476
    .line 1477
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1482
    .line 1483
    .line 1484
    sget-object v3, Lnf2;->i:Ljava/util/Set;

    .line 1485
    .line 1486
    const-string v4, "Config schema ui"

    .line 1487
    .line 1488
    invoke-static {v0, v3, v4}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 1489
    .line 1490
    .line 1491
    const-string v3, "sections"

    .line 1492
    .line 1493
    invoke-virtual {v0, v3}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    instance-of v3, v0, Lz21;

    .line 1498
    .line 1499
    if-eqz v3, :cond_4f

    .line 1500
    .line 1501
    check-cast v0, Lz21;

    .line 1502
    .line 1503
    goto :goto_31

    .line 1504
    :cond_4f
    move-object/from16 v0, p0

    .line 1505
    .line 1506
    :goto_31
    if-eqz v0, :cond_5c

    .line 1507
    .line 1508
    iget-object v3, v0, Lz21;->h:Ljava/util/List;

    .line 1509
    .line 1510
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1511
    .line 1512
    .line 1513
    move-result v4

    .line 1514
    const/4 v12, 0x1

    .line 1515
    if-gt v12, v4, :cond_5b

    .line 1516
    .line 1517
    const/16 v6, 0x21

    .line 1518
    .line 1519
    if-ge v4, v6, :cond_5b

    .line 1520
    .line 1521
    new-instance v4, Ljava/util/ArrayList;

    .line 1522
    .line 1523
    const/16 v6, 0xa

    .line 1524
    .line 1525
    invoke-static {v0, v6}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 1526
    .line 1527
    .line 1528
    move-result v0

    .line 1529
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1530
    .line 1531
    .line 1532
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    const/4 v10, 0x0

    .line 1537
    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1538
    .line 1539
    .line 1540
    move-result v3

    .line 1541
    if-eqz v3, :cond_55

    .line 1542
    .line 1543
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v3

    .line 1547
    add-int/lit8 v7, v10, 0x1

    .line 1548
    .line 1549
    if-ltz v10, :cond_54

    .line 1550
    .line 1551
    check-cast v3, Lj31;

    .line 1552
    .line 1553
    instance-of v8, v3, Ld41;

    .line 1554
    .line 1555
    if-eqz v8, :cond_50

    .line 1556
    .line 1557
    check-cast v3, Ld41;

    .line 1558
    .line 1559
    goto :goto_33

    .line 1560
    :cond_50
    move-object/from16 v3, p0

    .line 1561
    .line 1562
    :goto_33
    const-string v8, "Config section "

    .line 1563
    .line 1564
    if-eqz v3, :cond_53

    .line 1565
    .line 1566
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1567
    .line 1568
    invoke-direct {v9, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v8

    .line 1578
    sget-object v9, Lnf2;->j:Ljava/util/Set;

    .line 1579
    .line 1580
    invoke-static {v3, v9, v8}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 1581
    .line 1582
    .line 1583
    new-instance v8, Lqf2;

    .line 1584
    .line 1585
    const-string v9, "id"

    .line 1586
    .line 1587
    invoke-static {v3, v9}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v9

    .line 1591
    invoke-static {v3, v5}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v10

    .line 1595
    const/16 v13, 0x80

    .line 1596
    .line 1597
    invoke-static {v13, v10, v5}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    move-object/from16 v11, v36

    .line 1601
    .line 1602
    invoke-static {v3, v11}, Lnf2;->h(Ld41;Ljava/lang/String;)Ljava/util/List;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v12

    .line 1606
    invoke-virtual {v3, v11}, Ld41;->containsKey(Ljava/lang/Object;)Z

    .line 1607
    .line 1608
    .line 1609
    move-result v3

    .line 1610
    if-eqz v3, :cond_52

    .line 1611
    .line 1612
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1613
    .line 1614
    .line 1615
    move-result v3

    .line 1616
    if-nez v3, :cond_51

    .line 1617
    .line 1618
    invoke-direct {v8, v9, v10, v12}, Lqf2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move v10, v7

    .line 1625
    move-object/from16 v36, v11

    .line 1626
    .line 1627
    goto :goto_32

    .line 1628
    :cond_51
    const-string v0, "Field \'properties\' must not be empty."

    .line 1629
    .line 1630
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1631
    .line 1632
    .line 1633
    return-object p0

    .line 1634
    :cond_52
    const-string v0, "Field \'properties\' is required."

    .line 1635
    .line 1636
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    return-object p0

    .line 1640
    :cond_53
    const-string v0, " must be an object."

    .line 1641
    .line 1642
    invoke-static {v10, v8, v0}, Lhk1;->g(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1647
    .line 1648
    .line 1649
    return-object p0

    .line 1650
    :cond_54
    invoke-static {}, Leu;->a0()V

    .line 1651
    .line 1652
    .line 1653
    throw p0

    .line 1654
    :cond_55
    new-instance v0, Ljava/util/ArrayList;

    .line 1655
    .line 1656
    invoke-static {v4, v6}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 1657
    .line 1658
    .line 1659
    move-result v3

    .line 1660
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v3

    .line 1667
    :goto_34
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1668
    .line 1669
    .line 1670
    move-result v5

    .line 1671
    if-eqz v5, :cond_56

    .line 1672
    .line 1673
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v5

    .line 1677
    check-cast v5, Lqf2;

    .line 1678
    .line 1679
    iget-object v5, v5, Lqf2;->a:Ljava/lang/String;

    .line 1680
    .line 1681
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1682
    .line 1683
    .line 1684
    goto :goto_34

    .line 1685
    :cond_56
    invoke-static {v0}, Ldu;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    invoke-static {v0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1694
    .line 1695
    .line 1696
    move-result v0

    .line 1697
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1698
    .line 1699
    .line 1700
    move-result v3

    .line 1701
    if-ne v0, v3, :cond_5a

    .line 1702
    .line 1703
    new-instance v0, Ljava/util/ArrayList;

    .line 1704
    .line 1705
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1706
    .line 1707
    .line 1708
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v3

    .line 1712
    :goto_35
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1713
    .line 1714
    .line 1715
    move-result v5

    .line 1716
    if-eqz v5, :cond_57

    .line 1717
    .line 1718
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v5

    .line 1722
    check-cast v5, Lqf2;

    .line 1723
    .line 1724
    iget-object v5, v5, Lqf2;->c:Ljava/util/List;

    .line 1725
    .line 1726
    invoke-static {v5, v0}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 1727
    .line 1728
    .line 1729
    goto :goto_35

    .line 1730
    :cond_57
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1731
    .line 1732
    .line 1733
    move-result v3

    .line 1734
    invoke-static {v0}, Ldu;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v5

    .line 1738
    invoke-static {v5}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v5

    .line 1742
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 1743
    .line 1744
    .line 1745
    move-result v5

    .line 1746
    if-ne v3, v5, :cond_59

    .line 1747
    .line 1748
    invoke-static {v0}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v0

    .line 1752
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1753
    .line 1754
    .line 1755
    move-result v0

    .line 1756
    if-eqz v0, :cond_58

    .line 1757
    .line 1758
    goto :goto_36

    .line 1759
    :cond_58
    const-string v0, "Config sections must contain every config property exactly once."

    .line 1760
    .line 1761
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1762
    .line 1763
    .line 1764
    return-object p0

    .line 1765
    :cond_59
    const-string v0, "Each config property must appear in only one section."

    .line 1766
    .line 1767
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1768
    .line 1769
    .line 1770
    return-object p0

    .line 1771
    :cond_5a
    const-string v0, "Config section ids must be unique."

    .line 1772
    .line 1773
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1774
    .line 1775
    .line 1776
    return-object p0

    .line 1777
    :cond_5b
    const-string v0, "Config schema must contain 1 to 32 sections."

    .line 1778
    .line 1779
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1780
    .line 1781
    .line 1782
    return-object p0

    .line 1783
    :cond_5c
    const-string v0, "Field \'sections\' must be an array."

    .line 1784
    .line 1785
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1786
    .line 1787
    .line 1788
    return-object p0

    .line 1789
    :cond_5d
    new-instance v0, Lqf2;

    .line 1790
    .line 1791
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v2

    .line 1795
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1796
    .line 1797
    .line 1798
    check-cast v2, Ljava/lang/Iterable;

    .line 1799
    .line 1800
    invoke-static {v2}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v2

    .line 1804
    const-string v3, "general"

    .line 1805
    .line 1806
    const-string v4, "\u8bbe\u7f6e"

    .line 1807
    .line 1808
    invoke-direct {v0, v3, v4, v2}, Lqf2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1809
    .line 1810
    .line 1811
    invoke-static {v0}, Leu;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v4

    .line 1815
    :goto_36
    new-instance v0, Llf2;

    .line 1816
    .line 1817
    invoke-direct {v0, v1, v4}, Llf2;-><init>(Ljava/util/LinkedHashMap;Ljava/util/List;)V

    .line 1818
    .line 1819
    .line 1820
    return-object v0

    .line 1821
    :cond_5e
    const/16 p0, 0x0

    .line 1822
    .line 1823
    const-string v0, "Config schema contains too many properties."

    .line 1824
    .line 1825
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1826
    .line 1827
    .line 1828
    return-object p0

    .line 1829
    :cond_5f
    const/16 p0, 0x0

    .line 1830
    .line 1831
    const-string v0, "Config schema must contain at least one property."

    .line 1832
    .line 1833
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1834
    .line 1835
    .line 1836
    return-object p0

    .line 1837
    :cond_60
    const/16 p0, 0x0

    .line 1838
    .line 1839
    const-string v0, "Field \'properties\' must be an object."

    .line 1840
    .line 1841
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1842
    .line 1843
    .line 1844
    return-object p0

    .line 1845
    :cond_61
    const/16 p0, 0x0

    .line 1846
    .line 1847
    const-string v0, "Config schema additionalProperties must be false."

    .line 1848
    .line 1849
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1850
    .line 1851
    .line 1852
    return-object p0

    .line 1853
    :cond_62
    const/16 p0, 0x0

    .line 1854
    .line 1855
    const-string v0, "Config schema type must be \'object\'."

    .line 1856
    .line 1857
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1858
    .line 1859
    .line 1860
    return-object p0

    .line 1861
    :cond_63
    const/16 p0, 0x0

    .line 1862
    .line 1863
    const-string v0, "Unsupported config schema version."

    .line 1864
    .line 1865
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1866
    .line 1867
    .line 1868
    return-object p0

    .line 1869
    :cond_64
    const/16 p0, 0x0

    .line 1870
    .line 1871
    const-string v0, "Field \'schemaVersion\' must be an integer."

    .line 1872
    .line 1873
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1874
    .line 1875
    .line 1876
    return-object p0

    .line 1877
    :cond_65
    const/16 p0, 0x0

    .line 1878
    .line 1879
    const-string v0, "Config schema root must be an object."

    .line 1880
    .line 1881
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1882
    .line 1883
    .line 1884
    return-object p0
.end method

.method public static j(Lz21;Luf2;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lz21;->h:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-gt v5, v3, :cond_10

    .line 14
    .line 15
    const/16 v6, 0xd

    .line 16
    .line 17
    if-ge v3, v6, :cond_10

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v6, 0xa

    .line 22
    .line 23
    invoke-static {v0, v6}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x0

    .line 35
    move v7, v2

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_c

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    add-int/lit8 v9, v7, 0x1

    .line 47
    .line 48
    if-ltz v7, :cond_b

    .line 49
    .line 50
    check-cast v8, Lj31;

    .line 51
    .line 52
    instance-of v10, v8, Ld41;

    .line 53
    .line 54
    if-eqz v10, :cond_0

    .line 55
    .line 56
    check-cast v8, Ld41;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    move-object v8, v4

    .line 60
    :goto_1
    const-string v10, " option "

    .line 61
    .line 62
    if-eqz v8, :cond_a

    .line 63
    .line 64
    new-instance v11, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    sget-object v12, Lnf2;->k:Ljava/util/Set;

    .line 83
    .line 84
    invoke-static {v8, v12, v11}, Lnf2;->k(Ld41;Ljava/util/Set;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v11, "value"

    .line 88
    .line 89
    invoke-virtual {v8, v11}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    instance-of v12, v11, Li41;

    .line 94
    .line 95
    if-eqz v12, :cond_1

    .line 96
    .line 97
    check-cast v11, Li41;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    move-object v11, v4

    .line 101
    :goto_2
    if-eqz v11, :cond_9

    .line 102
    .line 103
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-eqz v12, :cond_7

    .line 108
    .line 109
    if-eq v12, v5, :cond_6

    .line 110
    .line 111
    const/4 v13, 0x2

    .line 112
    if-eq v12, v13, :cond_5

    .line 113
    .line 114
    const/4 v13, 0x3

    .line 115
    if-eq v12, v13, :cond_4

    .line 116
    .line 117
    const/4 v13, 0x4

    .line 118
    if-ne v12, v13, :cond_3

    .line 119
    .line 120
    :cond_2
    move v12, v2

    .line 121
    goto :goto_4

    .line 122
    :cond_3
    invoke-static {}, Lc80;->s()V

    .line 123
    .line 124
    .line 125
    return-object v4

    .line 126
    :cond_4
    invoke-virtual {v11}, Li41;->b()Z

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    invoke-virtual {v11}, Li41;->b()Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    if-nez v12, :cond_2

    .line 136
    .line 137
    sget-object v12, Ll31;->a:Lgz0;

    .line 138
    .line 139
    invoke-virtual {v11}, Li41;->a()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-static {v12}, Lvv2;->V(Ljava/lang/String;)Ljava/lang/Double;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    if-eqz v12, :cond_2

    .line 148
    .line 149
    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    .line 150
    .line 151
    .line 152
    move-result-wide v12

    .line 153
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    const-wide v14, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    cmpg-double v12, v12, v14

    .line 163
    .line 164
    if-gtz v12, :cond_2

    .line 165
    .line 166
    :goto_3
    move v12, v5

    .line 167
    goto :goto_4

    .line 168
    :cond_6
    invoke-virtual {v11}, Li41;->b()Z

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    if-nez v12, :cond_2

    .line 173
    .line 174
    invoke-virtual {v11}, Li41;->a()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    invoke-static {v12}, Lwv2;->f0(Ljava/lang/String;)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    if-eqz v12, :cond_2

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    invoke-virtual {v11}, Li41;->b()Z

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    if-nez v12, :cond_2

    .line 190
    .line 191
    invoke-static {v11}, Ll31;->d(Li41;)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    if-eqz v12, :cond_2

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :goto_4
    if-eqz v12, :cond_8

    .line 199
    .line 200
    new-instance v7, Ljf2;

    .line 201
    .line 202
    const-string v10, "label"

    .line 203
    .line 204
    invoke-static {v8, v10}, Lnf2;->l(Ld41;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    const/16 v12, 0x80

    .line 209
    .line 210
    invoke-static {v12, v8, v10}, Lnf2;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v7, v11, v8}, Ljf2;-><init>(Li41;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move v7, v9

    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_8
    move-object/from16 v8, p1

    .line 223
    .line 224
    iget-object v0, v8, Luf2;->h:Ljava/lang/String;

    .line 225
    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string v1, " value does not match type "

    .line 241
    .line 242
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v0, "."

    .line 249
    .line 250
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v1

    .line 267
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 268
    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v1, " value must be a primitive."

    .line 284
    .line 285
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v1, " must be an object."

    .line 313
    .line 314
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v0

    .line 325
    :cond_b
    invoke-static {}, Leu;->a0()V

    .line 326
    .line 327
    .line 328
    throw v4

    .line 329
    :cond_c
    new-instance v0, Ljava/util/ArrayList;

    .line 330
    .line 331
    invoke-static {v3, v6}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v7

    .line 346
    if-eqz v7, :cond_d

    .line 347
    .line 348
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v7

    .line 352
    check-cast v7, Ljf2;

    .line 353
    .line 354
    iget-object v7, v7, Ljf2;->a:Li41;

    .line 355
    .line 356
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_d
    invoke-static {v0}, Ldu;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v0}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    if-ne v0, v6, :cond_e

    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_e
    move v5, v2

    .line 380
    :goto_6
    if-eqz v5, :cond_f

    .line 381
    .line 382
    return-object v3

    .line 383
    :cond_f
    const-string v0, " option values must be unique."

    .line 384
    .line 385
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    return-object v4

    .line 393
    :cond_10
    const-string v0, " options must contain 1 to 12 items."

    .line 394
    .line 395
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    invoke-static {v0}, Ls;->c(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    return-object v4
.end method

.method public static k(Ld41;Ljava/util/Set;Ljava/lang/String;)V
    .locals 6

    .line 1
    iget-object p0, p0, Ld41;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p1, Ljava/lang/Iterable;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lnp2;->b0(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    .line 21
    .line 22
    invoke-static {p0}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v4, 0x0

    .line 27
    const/16 v5, 0x3f

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static/range {v0 .. v5}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p2, " contains unknown fields: "

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public static l(Ld41;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ld41;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Li41;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Li41;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    const-string v0, "\' must be a string."

    .line 15
    .line 16
    const-string v2, "Field \'"

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Li41;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Li41;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {v2, p1, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_2
    invoke-static {v2, p1, v0}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public static m(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lnf2;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "Unsupported config string format \'"

    .line 11
    .line 12
    const-string v1, "\'."

    .line 13
    .line 14
    invoke-static {v0, p0, v1}, Lvi0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Ls;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
