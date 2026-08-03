.class public final Lbe/c;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final h:Ljava/util/Map;

.field public static final i:Ljava/util/Set;

.field public static final j:Ljava/util/List;


# instance fields
.field public g:Lud/u;


# direct methods
.method static constructor <clinit>()V
    .locals 33

    .line 1
    const-string v31, "java.lang.Exception"

    .line 2
    .line 3
    const-string v32, "exc"

    .line 4
    .line 5
    const-string v1, "java.lang.String"

    .line 6
    .line 7
    const-string v2, "str"

    .line 8
    .line 9
    const-string v3, "java.lang.Class"

    .line 10
    .line 11
    const-string v4, "cls"

    .line 12
    .line 13
    const-string v5, "java.lang.Throwable"

    .line 14
    .line 15
    const-string v6, "th"

    .line 16
    .line 17
    const-string v7, "java.lang.Object"

    .line 18
    .line 19
    const-string v8, "obj"

    .line 20
    .line 21
    const-string v9, "java.util.Iterator"

    .line 22
    .line 23
    const-string v10, "it"

    .line 24
    .line 25
    const-string v11, "java.util.HashMap"

    .line 26
    .line 27
    const-string v12, "map"

    .line 28
    .line 29
    const-string v13, "java.lang.Boolean"

    .line 30
    .line 31
    const-string v14, "bool"

    .line 32
    .line 33
    const-string v15, "java.lang.Short"

    .line 34
    .line 35
    const-string v16, "sh"

    .line 36
    .line 37
    const-string v17, "java.lang.Integer"

    .line 38
    .line 39
    const-string v18, "num"

    .line 40
    .line 41
    const-string v19, "java.lang.Character"

    .line 42
    .line 43
    const-string v20, "ch"

    .line 44
    .line 45
    const-string v21, "java.lang.Byte"

    .line 46
    .line 47
    const-string v22, "b"

    .line 48
    .line 49
    const-string v23, "java.lang.Float"

    .line 50
    .line 51
    const-string v24, "f"

    .line 52
    .line 53
    const-string v25, "java.lang.Long"

    .line 54
    .line 55
    const-string v26, "l"

    .line 56
    .line 57
    const-string v27, "java.lang.Double"

    .line 58
    .line 59
    const-string v28, "d"

    .line 60
    .line 61
    const-string v29, "java.lang.StringBuilder"

    .line 62
    .line 63
    const-string v30, "sb"

    .line 64
    .line 65
    filled-new-array/range {v1 .. v32}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v1, Lxe/s;->a:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v1, Ljava/util/HashMap;

    .line 72
    .line 73
    const/16 v2, 0x10

    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    move v3, v2

    .line 80
    :goto_0
    const/16 v4, 0x1f

    .line 81
    .line 82
    if-ge v3, v4, :cond_0

    .line 83
    .line 84
    aget-object v4, v0, v3

    .line 85
    .line 86
    add-int/lit8 v5, v3, 0x1

    .line 87
    .line 88
    aget-object v5, v0, v5

    .line 89
    .line 90
    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    add-int/lit8 v3, v3, 0x2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sput-object v0, Lbe/c;->h:Ljava/util/Map;

    .line 101
    .line 102
    const-string v0, "size"

    .line 103
    .line 104
    const-string v1, "length"

    .line 105
    .line 106
    const-string v3, "list"

    .line 107
    .line 108
    const-string v4, "map"

    .line 109
    .line 110
    const-string v5, "next"

    .line 111
    .line 112
    filled-new-array {v0, v1, v3, v4, v5}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Ljava/util/HashSet;

    .line 117
    .line 118
    const/4 v3, 0x5

    .line 119
    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    .line 120
    .line 121
    .line 122
    move v4, v2

    .line 123
    :goto_1
    if-ge v4, v3, :cond_2

    .line 124
    .line 125
    aget-object v5, v0, v4

    .line 126
    .line 127
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_1

    .line 135
    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    const-string v0, "duplicate element: "

    .line 140
    .line 141
    invoke-static {v5, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    sput-object v0, Lbe/c;->i:Ljava/util/Set;

    .line 150
    .line 151
    const-string v3, "get"

    .line 152
    .line 153
    const-string v4, "set"

    .line 154
    .line 155
    const-string v5, "to"

    .line 156
    .line 157
    const-string v6, "parse"

    .line 158
    .line 159
    const-string v7, "read"

    .line 160
    .line 161
    const-string v8, "format"

    .line 162
    .line 163
    filled-new-array/range {v3 .. v8}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v1, Ljava/util/ArrayList;

    .line 168
    .line 169
    const/4 v3, 0x6

    .line 170
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    :goto_2
    if-ge v2, v3, :cond_3

    .line 174
    .line 175
    aget-object v4, v0, v2

    .line 176
    .line 177
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v2, v2, 0x1

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_3
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    sput-object v0, Lbe/c;->j:Ljava/util/List;

    .line 191
    .line 192
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/4 v2, 0x3

    .line 67
    if-ge v1, v2, :cond_3

    .line 68
    .line 69
    const-string v0, "Var"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_3
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ApplyVariableNames"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbe/c;->g:Lud/u;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Lud/r;)V
    .locals 6

    .line 1
    iget-object p1, p1, Lud/r;->D:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_9

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lqd/s;

    .line 18
    .line 19
    invoke-virtual {v0}, Lqd/s;->b()Lqd/k;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v1, v0, Lqd/k;->e:Z

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v1, "this"

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    iget-boolean v1, v0, Lqd/k;->f:Z

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    :goto_1
    move-object v1, v2

    .line 37
    goto :goto_3

    .line 38
    :cond_2
    iget-object v1, v0, Lqd/k;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    iget-object v1, v0, Lqd/k;->c:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v1}, Lxe/s;->n(Ljava/util/Collection;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_8

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    new-instance v4, La7/b;

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    invoke-direct {v4, v5}, La7/b;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v3, v4}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    iget-object v1, v0, Lqd/k;->b:Lqd/j;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lbe/c;->j(Lqd/j;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_8

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Lqd/s;

    .line 93
    .line 94
    invoke-virtual {v3}, Lqd/s;->e()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    if-eqz v4, :cond_6

    .line 99
    .line 100
    move-object v3, v4

    .line 101
    goto :goto_2

    .line 102
    :cond_6
    iget-object v4, v3, Lqd/s;->i:Lqd/r;

    .line 103
    .line 104
    iget-object v4, v4, Lqd/l;->j:Lud/p;

    .line 105
    .line 106
    if-eqz v4, :cond_7

    .line 107
    .line 108
    invoke-virtual {p0, v3, v4}, Lbe/c;->k(Lqd/s;Lud/p;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-static {v3}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_7

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    move-object v3, v2

    .line 120
    :goto_2
    if-eqz v3, :cond_5

    .line 121
    .line 122
    move-object v1, v3

    .line 123
    goto :goto_3

    .line 124
    :cond_8
    iget-object v1, v0, Lqd/k;->b:Lqd/j;

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Lbe/c;->j(Lqd/j;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    :goto_3
    if-eqz v1, :cond_0

    .line 131
    .line 132
    iput-object v1, v0, Lqd/k;->a:Ljava/lang/String;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_9
    return-void
.end method

.method public final j(Lqd/j;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lqd/g;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Lqd/j;->o()Lqd/q;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p1, p1, Lqd/q;->g:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_0
    instance-of v0, p1, Lqd/a;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lqd/j;->h()Lqd/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p0, p1}, Lbe/c;->j(Lqd/j;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "Arr"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    instance-of v0, p1, Lqd/c;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_2
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, Lbe/c;->h:Ljava/util/Map;

    .line 66
    .line 67
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/lang/String;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_3
    iget-object v0, p0, Lbe/c;->g:Lud/u;

    .line 77
    .line 78
    invoke-static {v0, p1}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Lod/a;->k()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Lbe/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    const-string p1, "Var"

    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :cond_5
    return-object v0

    .line 115
    :cond_6
    invoke-virtual {p1}, Lqd/j;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method

.method public final k(Lqd/s;Lud/p;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p2, Lud/p;->k:Lpd/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_17

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    if-eq v0, v1, :cond_17

    .line 14
    .line 15
    const/16 v1, 0x16

    .line 16
    .line 17
    if-eq v0, v1, :cond_16

    .line 18
    .line 19
    const/16 v1, 0x22

    .line 20
    .line 21
    const-string v3, "Var"

    .line 22
    .line 23
    sget-object v4, Lbe/c;->h:Ljava/util/Map;

    .line 24
    .line 25
    if-eq v0, v1, :cond_6

    .line 26
    .line 27
    const/16 v1, 0x25

    .line 28
    .line 29
    if-eq v0, v1, :cond_17

    .line 30
    .line 31
    const/16 p1, 0x26

    .line 32
    .line 33
    if-eq v0, p1, :cond_0

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_0
    check-cast p2, Ltd/a;

    .line 38
    .line 39
    iget-object p1, p0, Lbe/c;->g:Lud/u;

    .line 40
    .line 41
    iget-object p1, p1, Lud/u;->h:Lfe/a;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of v0, p1, Lud/r;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    check-cast p1, Lud/r;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object p1, v2

    .line 55
    :goto_0
    if-eqz p1, :cond_2

    .line 56
    .line 57
    sget-object v0, Lmd/a;->H:Lmd/a;

    .line 58
    .line 59
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_2
    iget-object p1, p2, Ltd/a;->o:Lod/d;

    .line 70
    .line 71
    iget-object p1, p1, Lod/d;->j:Lod/a;

    .line 72
    .line 73
    iget-object p2, p1, Lod/a;->j:Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_3
    invoke-virtual {p1}, Lod/a;->k()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lbe/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    return-object p2

    .line 95
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-static {p2}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :cond_5
    return-object p2

    .line 115
    :cond_6
    check-cast p2, Lpd/n;

    .line 116
    .line 117
    iget-object p2, p2, Lpd/n;->p:Lod/d;

    .line 118
    .line 119
    iget-object v0, p2, Lod/d;->n:Ljava/lang/String;

    .line 120
    .line 121
    iget-object p2, p2, Lod/d;->j:Lod/a;

    .line 122
    .line 123
    const-string v1, "getInstance"

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_a

    .line 130
    .line 131
    iget-object p1, p2, Lod/a;->j:Ljava/lang/String;

    .line 132
    .line 133
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/lang/String;

    .line 138
    .line 139
    if-eqz p1, :cond_7

    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_7
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1}, Lbe/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    if-eqz p2, :cond_8

    .line 151
    .line 152
    return-object p2

    .line 153
    :cond_8
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-static {p2}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :cond_9
    return-object p2

    .line 173
    :cond_a
    sget-object v1, Lbe/c;->j:Ljava/util/List;

    .line 174
    .line 175
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_c

    .line 184
    .line 185
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    check-cast v5, Ljava/lang/String;

    .line 190
    .line 191
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    if-eqz v6, :cond_b

    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    :cond_c
    if-eqz v2, :cond_d

    .line 206
    .line 207
    invoke-static {v2}, Lbe/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    return-object p1

    .line 212
    :cond_d
    const-string v1, "iterator"

    .line 213
    .line 214
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_e

    .line 219
    .line 220
    const-string p1, "it"

    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_e
    const-string v1, "toString"

    .line 224
    .line 225
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_12

    .line 230
    .line 231
    iget-object p1, p2, Lod/a;->j:Ljava/lang/String;

    .line 232
    .line 233
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Ljava/lang/String;

    .line 238
    .line 239
    if-eqz p1, :cond_f

    .line 240
    .line 241
    return-object p1

    .line 242
    :cond_f
    invoke-virtual {p2}, Lod/a;->k()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-static {p1}, Lbe/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    if-eqz p2, :cond_10

    .line 251
    .line 252
    return-object p2

    .line 253
    :cond_10
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-static {p2}, Lxe/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-eqz p1, :cond_11

    .line 266
    .line 267
    invoke-virtual {p2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    return-object p1

    .line 272
    :cond_11
    return-object p2

    .line 273
    :cond_12
    const-string v1, "forName"

    .line 274
    .line 275
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_13

    .line 280
    .line 281
    iget-object p2, p2, Lod/a;->g:Lqd/j;

    .line 282
    .line 283
    sget-object v1, Lqd/j;->l:Lqd/e;

    .line 284
    .line 285
    invoke-virtual {p2, v1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    if-eqz p2, :cond_13

    .line 290
    .line 291
    const-string p1, "java.lang.Class"

    .line 292
    .line 293
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    check-cast p1, Ljava/lang/String;

    .line 298
    .line 299
    return-object p1

    .line 300
    :cond_13
    sget-object p2, Lbe/c;->i:Ljava/util/Set;

    .line 301
    .line 302
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p2

    .line 306
    if-nez p2, :cond_15

    .line 307
    .line 308
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iget-object p1, p1, Lqd/k;->b:Lqd/j;

    .line 313
    .line 314
    invoke-virtual {p0, p1}, Lbe/c;->j(Lqd/j;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result p2

    .line 322
    if-nez p2, :cond_15

    .line 323
    .line 324
    invoke-static {v0}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    if-eqz p2, :cond_14

    .line 329
    .line 330
    goto :goto_1

    .line 331
    :cond_14
    const/4 p2, 0x0

    .line 332
    invoke-virtual {v0, p2}, Ljava/lang/String;->charAt(I)C

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    invoke-static {p2}, Ljava/lang/Character;->toUpperCase(C)C

    .line 337
    .line 338
    .line 339
    move-result p2

    .line 340
    const/4 v1, 0x1

    .line 341
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    new-instance v1, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    :goto_1
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    return-object p1

    .line 365
    :cond_15
    return-object v0

    .line 366
    :cond_16
    const-string p1, "length"

    .line 367
    .line 368
    return-object p1

    .line 369
    :cond_17
    iget-object p2, p2, Lud/p;->m:Ljava/util/List;

    .line 370
    .line 371
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    :cond_18
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_19

    .line 380
    .line 381
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, Lqd/l;

    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    instance-of v1, v0, Lqd/m;

    .line 391
    .line 392
    if-eqz v1, :cond_18

    .line 393
    .line 394
    check-cast v0, Lqd/m;

    .line 395
    .line 396
    iget-object v0, v0, Lqd/m;->l:Lud/p;

    .line 397
    .line 398
    invoke-virtual {p0, p1, v0}, Lbe/c;->k(Lqd/s;Lud/p;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    if-eqz v0, :cond_18

    .line 403
    .line 404
    return-object v0

    .line 405
    :cond_19
    :goto_2
    return-object v2
.end method
