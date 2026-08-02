.class public Lq31;
.super Lq43;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lq31;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq31;

    .line 2
    .line 3
    invoke-direct {v0}, Lq31;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq31;->a:Lq31;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(ILl41;)Lk31;
    .locals 2

    .line 1
    invoke-static {p0}, Lvi0;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ll41;->E()V

    .line 19
    .line 20
    .line 21
    sget-object p0, La41;->h:La41;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {p0}, Lvi0;->x(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "Unexpected token: "

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    new-instance p0, Lj41;

    .line 40
    .line 41
    invoke-virtual {p1}, Ll41;->t()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {p0, p1}, Lj41;-><init>(Ljava/lang/Boolean;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-virtual {p1}, Ll41;->G()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Lj41;

    .line 58
    .line 59
    new-instance v0, Li71;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Li71;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p1, v0}, Lj41;-><init>(Ljava/lang/Number;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    new-instance p0, Lj41;

    .line 69
    .line 70
    invoke-virtual {p1}, Ll41;->G()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lj41;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method

.method public static e(Lo41;Lk31;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_b

    .line 2
    .line 3
    instance-of v0, p1, La41;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, Lj41;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    check-cast p1, Lj41;

    .line 14
    .line 15
    iget-object v0, p1, Lj41;->h:Ljava/io/Serializable;

    .line 16
    .line 17
    instance-of v1, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lj41;->c()Ljava/lang/Number;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Lo41;->B(Ljava/lang/Number;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-virtual {p1}, Lj41;->a()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    :goto_0
    invoke-virtual {p0, p1}, Lo41;->E(Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-virtual {p1}, Lj41;->a()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lo41;->D(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    instance-of v0, p1, La31;

    .line 65
    .line 66
    if-eqz v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {p0}, Lo41;->c()V

    .line 69
    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    check-cast p1, La31;

    .line 74
    .line 75
    iget-object p1, p1, La31;->h:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lk31;

    .line 92
    .line 93
    invoke-static {p0, v0}, Lq31;->e(Lo41;Lk31;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-virtual {p0}, Lo41;->h()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_6
    const-string p0, "Not a JSON Array: "

    .line 102
    .line 103
    invoke-static {p0, p1}, Lc80;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    instance-of v0, p1, Le41;

    .line 108
    .line 109
    if-eqz v0, :cond_a

    .line 110
    .line 111
    invoke-virtual {p0}, Lo41;->e()V

    .line 112
    .line 113
    .line 114
    if-eqz v0, :cond_9

    .line 115
    .line 116
    check-cast p1, Le41;

    .line 117
    .line 118
    iget-object p1, p1, Le41;->h:Lmb1;

    .line 119
    .line 120
    invoke-virtual {p1}, Lmb1;->entrySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Lkb1;

    .line 125
    .line 126
    invoke-virtual {p1}, Lkb1;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    :goto_2
    move-object v0, p1

    .line 131
    check-cast v0, Ljb1;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljb1;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    move-object v0, p1

    .line 140
    check-cast v0, Ljb1;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljb1;->b()Llb1;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {p0, v1}, Lo41;->k(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Lk31;

    .line 160
    .line 161
    invoke-static {p0, v0}, Lq31;->e(Lo41;Lk31;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_8
    invoke-virtual {p0}, Lo41;->j()V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_9
    const-string p0, "Not a JSON Object: "

    .line 170
    .line 171
    invoke-static {p0, p1}, Lc80;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v1, "Couldn\'t write "

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p0

    .line 199
    :cond_b
    :goto_3
    invoke-virtual {p0}, Lo41;->p()Lo41;

    .line 200
    .line 201
    .line 202
    return-void
.end method


# virtual methods
.method public final b(Ll41;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ll41;->I()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Lvi0;->u(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move-object v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ll41;->c()V

    .line 18
    .line 19
    .line 20
    new-instance v0, Le41;

    .line 21
    .line 22
    invoke-direct {v0}, Le41;-><init>()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p1}, Ll41;->b()V

    .line 27
    .line 28
    .line 29
    new-instance v0, La31;

    .line 30
    .line 31
    invoke-direct {v0}, La31;-><init>()V

    .line 32
    .line 33
    .line 34
    :goto_0
    if-nez v0, :cond_2

    .line 35
    .line 36
    invoke-static {p0, p1}, Lq31;->d(ILl41;)Lk31;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    new-instance p0, Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayDeque;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ll41;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_a

    .line 51
    .line 52
    instance-of v3, v0, Le41;

    .line 53
    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1}, Ll41;->B()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    move-object v3, v2

    .line 62
    :goto_2
    invoke-virtual {p1}, Ll41;->I()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-static {v4}, Lvi0;->u(I)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_6

    .line 71
    .line 72
    if-eq v5, v1, :cond_5

    .line 73
    .line 74
    move-object v5, v2

    .line 75
    goto :goto_3

    .line 76
    :cond_5
    invoke-virtual {p1}, Ll41;->c()V

    .line 77
    .line 78
    .line 79
    new-instance v5, Le41;

    .line 80
    .line 81
    invoke-direct {v5}, Le41;-><init>()V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    invoke-virtual {p1}, Ll41;->b()V

    .line 86
    .line 87
    .line 88
    new-instance v5, La31;

    .line 89
    .line 90
    invoke-direct {v5}, La31;-><init>()V

    .line 91
    .line 92
    .line 93
    :goto_3
    if-eqz v5, :cond_7

    .line 94
    .line 95
    const/4 v6, 0x1

    .line 96
    goto :goto_4

    .line 97
    :cond_7
    const/4 v6, 0x0

    .line 98
    :goto_4
    if-nez v5, :cond_8

    .line 99
    .line 100
    invoke-static {v4, p1}, Lq31;->d(ILl41;)Lk31;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    :cond_8
    instance-of v4, v0, La31;

    .line 105
    .line 106
    if-eqz v4, :cond_9

    .line 107
    .line 108
    move-object v3, v0

    .line 109
    check-cast v3, La31;

    .line 110
    .line 111
    iget-object v3, v3, La31;->h:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_9
    move-object v4, v0

    .line 118
    check-cast v4, Le41;

    .line 119
    .line 120
    iget-object v4, v4, Le41;->h:Lmb1;

    .line 121
    .line 122
    invoke-virtual {v4, v3, v5}, Lmb1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :goto_5
    if-eqz v6, :cond_3

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move-object v0, v5

    .line 131
    goto :goto_1

    .line 132
    :cond_a
    instance-of v3, v0, La31;

    .line 133
    .line 134
    if-eqz v3, :cond_b

    .line 135
    .line 136
    invoke-virtual {p1}, Ll41;->h()V

    .line 137
    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_b
    invoke-virtual {p1}, Ll41;->j()V

    .line 141
    .line 142
    .line 143
    :goto_6
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_c

    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_c
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lk31;

    .line 155
    .line 156
    goto :goto_1
.end method

.method public final bridge synthetic c(Lo41;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lk31;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lq31;->e(Lo41;Lk31;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
