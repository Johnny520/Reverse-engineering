.class public final Lr3/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ltg/b0;

.field public final b:Ltf/k;

.field public final c:Ltf/k;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Ljava/util/LinkedHashSet;

.field public g:Z

.field public h:Z

.field public i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr3/e;->a:Lr3/e;

    .line 5
    .line 6
    invoke-static {v0}, Ltg/s;->b(Ljava/lang/Object;)Ltg/b0;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lr3/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lr3/b;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ltg/s;->b(Ljava/lang/Object;)Ltg/b0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lr3/d;->a:Ltg/b0;

    .line 19
    .line 20
    new-instance v0, Ltf/k;

    .line 21
    .line 22
    invoke-direct {v0}, Ltf/k;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lr3/d;->b:Ltf/k;

    .line 26
    .line 27
    new-instance v0, Ltf/k;

    .line 28
    .line 29
    invoke-direct {v0}, Ltf/k;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lr3/d;->c:Ltf/k;

    .line 33
    .line 34
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lr3/d;->d:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Lr3/d;->e:Ljava/util/LinkedHashSet;

    .line 47
    .line 48
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Lr3/d;->f:Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    return-void
.end method

.method public static b(Lr3/d;)Ls3/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lr3/d;->c:Ltf/k;

    .line 2
    .line 3
    iget-object p0, p0, Lr3/d;->b:Ltf/k;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v3, v1

    .line 21
    check-cast v3, Ls3/a;

    .line 22
    .line 23
    iget-boolean v4, v3, Ls3/a;->d:Z

    .line 24
    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    iget-boolean v3, v3, Ls3/a;->e:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v1, v2

    .line 33
    :cond_2
    :goto_0
    check-cast v1, Ls3/a;

    .line 34
    .line 35
    if-nez v1, :cond_6

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v1, v0

    .line 52
    check-cast v1, Ls3/a;

    .line 53
    .line 54
    iget-boolean v3, v1, Ls3/a;->d:Z

    .line 55
    .line 56
    if-nez v3, :cond_4

    .line 57
    .line 58
    iget-boolean v1, v1, Ls3/a;->e:Z

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    :cond_4
    move-object v2, v0

    .line 63
    :cond_5
    check-cast v2, Ls3/a;

    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_6
    return-object v1
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lr3/d;->b:Ltf/k;

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    invoke-virtual {v2}, Ltf/k;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    :cond_0
    move v2, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v2}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ls3/a;

    .line 30
    .line 31
    iget-boolean v4, v3, Ls3/a;->d:Z

    .line 32
    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    iget-boolean v3, v3, Ls3/a;->e:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    :cond_3
    move v2, v0

    .line 40
    :goto_0
    iget-object v3, p0, Lr3/d;->c:Ltf/k;

    .line 41
    .line 42
    if-eqz v3, :cond_5

    .line 43
    .line 44
    invoke-virtual {v3}, Ltf/k;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    :cond_4
    move v3, v1

    .line 51
    goto :goto_1

    .line 52
    :cond_5
    invoke-virtual {v3}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    check-cast v4, Ls3/a;

    .line 67
    .line 68
    iget-boolean v5, v4, Ls3/a;->d:Z

    .line 69
    .line 70
    if-nez v5, :cond_7

    .line 71
    .line 72
    iget-boolean v4, v4, Ls3/a;->e:Z

    .line 73
    .line 74
    if-eqz v4, :cond_6

    .line 75
    .line 76
    :cond_7
    move v3, v0

    .line 77
    :goto_1
    if-nez v2, :cond_9

    .line 78
    .line 79
    if-eqz v3, :cond_8

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_8
    move v4, v1

    .line 83
    goto :goto_3

    .line 84
    :cond_9
    :goto_2
    move v4, v0

    .line 85
    :goto_3
    iget-boolean v5, p0, Lr3/d;->h:Z

    .line 86
    .line 87
    if-eq v5, v2, :cond_a

    .line 88
    .line 89
    move v5, v0

    .line 90
    goto :goto_4

    .line 91
    :cond_a
    move v5, v1

    .line 92
    :goto_4
    iget-boolean v6, p0, Lr3/d;->g:Z

    .line 93
    .line 94
    if-eq v6, v3, :cond_b

    .line 95
    .line 96
    move v6, v0

    .line 97
    goto :goto_5

    .line 98
    :cond_b
    move v6, v1

    .line 99
    :goto_5
    iget-boolean v7, p0, Lr3/d;->i:Z

    .line 100
    .line 101
    if-eq v7, v4, :cond_c

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_c
    move v0, v1

    .line 105
    :goto_6
    if-eqz v5, :cond_e

    .line 106
    .line 107
    iget-object v1, p0, Lr3/d;->f:Ljava/util/LinkedHashSet;

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-nez v5, :cond_d

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lah/a;->d()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_e
    :goto_7
    if-eqz v6, :cond_10

    .line 132
    .line 133
    iget-object v1, p0, Lr3/d;->e:Ljava/util/LinkedHashSet;

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-nez v5, :cond_f

    .line 144
    .line 145
    goto :goto_8

    .line 146
    :cond_f
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Lah/a;->d()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_10
    :goto_8
    if-eqz v0, :cond_12

    .line 158
    .line 159
    iget-object v0, p0, Lr3/d;->d:Ljava/util/LinkedHashSet;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_11

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Lah/a;->d()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_12
    :goto_9
    iput-boolean v2, p0, Lr3/d;->h:Z

    .line 184
    .line 185
    iput-boolean v3, p0, Lr3/d;->g:Z

    .line 186
    .line 187
    iput-boolean v4, p0, Lr3/d;->i:Z

    .line 188
    .line 189
    invoke-static {p0}, Lr3/d;->b(Lr3/d;)Ls3/a;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {p0, v0}, Lr3/d;->c(Ls3/a;)V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public final c(Ls3/a;)V
    .locals 4

    .line 1
    invoke-static {p0}, Lr3/d;->b(Lr3/d;)Ls3/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance p1, Lr3/b;

    .line 16
    .line 17
    invoke-direct {p1}, Lr3/b;-><init>()V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lr3/d;->b:Ltf/k;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ls3/a;

    .line 43
    .line 44
    iget-boolean v3, v2, Ls3/a;->d:Z

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    iget-object v3, v2, Ls3/a;->b:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    iget-object v2, v2, Ls3/a;->b:Ljava/util/List;

    .line 57
    .line 58
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    iget-object v1, p0, Lr3/d;->c:Ltf/k;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_5

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, Ls3/a;

    .line 79
    .line 80
    iget-boolean v3, v2, Ls3/a;->d:Z

    .line 81
    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    iget-object v3, v2, Ls3/a;->b:Ljava/util/List;

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-nez v3, :cond_4

    .line 91
    .line 92
    iget-object v2, v2, Ls3/a;->b:Ljava/util/List;

    .line 93
    .line 94
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    iget-object v1, v0, Ls3/a;->a:Lr3/c;

    .line 99
    .line 100
    iget-object v0, v0, Ls3/a;->c:Ljava/util/List;

    .line 101
    .line 102
    new-instance v2, Lr3/b;

    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {}, La/a;->E()Luf/c;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3, p1}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v1}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v0}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, La/a;->t(Luf/c;)Luf/c;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-direct {v2, p1, v0}, Lr3/b;-><init>(ILjava/util/List;)V

    .line 129
    .line 130
    .line 131
    move-object p1, v2

    .line 132
    :goto_2
    iget-object v0, p0, Lr3/d;->a:Ltg/b0;

    .line 133
    .line 134
    invoke-virtual {v0}, Ltg/b0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    check-cast v1, Lr3/b;

    .line 139
    .line 140
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    const/4 v1, 0x0

    .line 148
    invoke-virtual {v0, v1, p1}, Ltg/b0;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lr3/d;->f:Ljava/util/LinkedHashSet;

    .line 152
    .line 153
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_9

    .line 162
    .line 163
    iget-object p1, p0, Lr3/d;->e:Ljava/util/LinkedHashSet;

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_8

    .line 174
    .line 175
    iget-object p1, p0, Lr3/d;->d:Ljava/util/LinkedHashSet;

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_7

    .line 186
    .line 187
    :goto_3
    return-void

    .line 188
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-static {}, Lah/a;->d()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lah/a;->d()V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-static {}, Lah/a;->d()V

    .line 218
    .line 219
    .line 220
    return-void
.end method
