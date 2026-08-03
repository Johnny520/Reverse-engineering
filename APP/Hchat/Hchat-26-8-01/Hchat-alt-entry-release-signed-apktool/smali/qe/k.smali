.class public final Lqe/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lmh/b;


# instance fields
.field public final a:Lud/u;

.field public final b:Lc9/a0;

.field public final c:Ljava/util/Comparator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lqe/k;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lqe/k;->d:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lud/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/k;->a:Lud/u;

    .line 5
    .line 6
    new-instance p1, Lc9/a0;

    .line 7
    .line 8
    const/16 v0, 0x19

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lqe/k;->b:Lc9/a0;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lqe/k;->c:Ljava/util/Comparator;

    .line 20
    .line 21
    return-void
.end method

.method public static a(Lqd/j;)Lqe/l;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lqd/j;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lqd/q;->s:Lqd/q;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lqd/j;->a(Lqd/q;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lqd/j;->v()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    :goto_0
    sget-object p0, Lqe/l;->h:Lqe/l;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_1
    instance-of v0, p0, Lqd/g;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    :cond_2
    sget-object p0, Lqe/l;->l:Lqe/l;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "Unprocessed type: "

    .line 45
    .line 46
    const-string v1, " in array compare"

    .line 47
    .line 48
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method public static e(Lqd/j;Lqd/j;)Lqe/l;
    .locals 3

    .line 1
    sget-object v0, Lqd/j;->u:Lqd/h;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    sget-object v0, Lqd/j;->v:Lqd/h;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lqd/j;->v()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    instance-of v0, p0, Lqd/a;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_1
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    instance-of v0, p1, Lqd/a;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    sget-object p0, Lqe/l;->j:Lqe/l;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    instance-of v0, p0, Lqd/g;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p0, Lqd/g;

    .line 41
    .line 42
    iget-object p0, p0, Lqd/g;->K:Lqd/q;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    instance-of p0, p0, Lqd/a;

    .line 46
    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    sget-object p0, Lqd/q;->s:Lqd/q;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    sget-object p0, Lqd/q;->r:Lqd/q;

    .line 53
    .line 54
    :goto_0
    invoke-virtual {p1}, Lqd/j;->n()[Lqd/q;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    array-length v0, p1

    .line 59
    const/4 v1, 0x0

    .line 60
    :goto_1
    if-ge v1, v0, :cond_7

    .line 61
    .line 62
    aget-object v2, p1, v1

    .line 63
    .line 64
    if-ne v2, p0, :cond_6

    .line 65
    .line 66
    :cond_5
    :goto_2
    sget-object p0, Lqe/l;->h:Lqe/l;

    .line 67
    .line 68
    return-object p0

    .line 69
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_7
    sget-object p0, Lqe/l;->l:Lqe/l;

    .line 73
    .line 74
    return-object p0
.end method

.method public static f(Lqd/q;)B
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "Unhandled type: "

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :pswitch_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :pswitch_1
    const/4 p0, 0x4

    .line 26
    return p0

    .line 27
    :pswitch_2
    const/4 p0, 0x5

    .line 28
    return p0

    .line 29
    :pswitch_3
    const/4 p0, 0x3

    .line 30
    return p0

    .line 31
    :pswitch_4
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :pswitch_5
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :pswitch_6
    const/4 p0, 0x2

    .line 36
    return p0

    .line 37
    :pswitch_7
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "Type "

    .line 42
    .line 43
    const-string v1, " should not be here"

    .line 44
    .line 45
    invoke-static {v0, p0, v1}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public final b(Lqd/j;Lqd/j;)Lqe/l;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lqd/c;

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_9

    .line 21
    .line 22
    invoke-virtual {p1}, Lqd/j;->i()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-ne v1, v2, :cond_0

    .line 40
    .line 41
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-object p1, v1

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p2}, Lqd/j;->i()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v2, :cond_2

    .line 68
    .line 69
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-object p2, v1

    .line 81
    :cond_3
    :goto_1
    invoke-interface {p1, p2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    sget-object p1, Lqe/l;->g:Lqe/l;

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v0, :cond_5

    .line 99
    .line 100
    sget-object p1, Lqe/l;->j:Lqe/l;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_5
    if-nez v1, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    if-ne v0, v2, :cond_9

    .line 107
    .line 108
    if-ne v1, v2, :cond_9

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lqd/j;

    .line 116
    .line 117
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    check-cast p2, Lqd/j;

    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    :cond_7
    instance-of v0, p2, Lqd/i;

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    sget-object p1, Lqe/l;->m:Lqe/l;

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_8
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 136
    .line 137
    invoke-virtual {p2, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1}, Lqd/j;->i()Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_a

    .line 150
    .line 151
    if-eqz v0, :cond_9

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_9
    sget-object p1, Lqe/l;->l:Lqe/l;

    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_a
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_d

    .line 162
    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_b
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_d

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Lqd/j;

    .line 181
    .line 182
    invoke-virtual {p0, v0, p2}, Lqe/k;->c(Lqd/j;Lqd/j;)Lqe/l;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Lqe/l;->c()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_c

    .line 191
    .line 192
    return-object v0

    .line 193
    :cond_d
    :goto_2
    sget-object p1, Lqe/l;->h:Lqe/l;

    .line 194
    .line 195
    return-object p1
.end method

.method public final c(Lqd/j;Lqd/j;)Lqe/l;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    instance-of v1, p1, Lqd/c;

    .line 14
    .line 15
    instance-of v2, p2, Lqd/c;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Lqd/j;->t()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p2}, Lqd/j;->t()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x2

    .line 34
    if-nez v1, :cond_13

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    if-eqz v0, :cond_a

    .line 42
    .line 43
    if-eq v3, v4, :cond_3

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    sget-object p1, Lqe/l;->i:Lqe/l;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    sget-object p1, Lqe/l;->k:Lqe/l;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_3
    invoke-virtual {p1}, Lqd/j;->q()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    invoke-virtual {p2}, Lqd/j;->q()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_6

    .line 64
    .line 65
    invoke-virtual {p1}, Lqd/j;->q()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p2}, Lqd/j;->q()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-ne v0, v5, :cond_4

    .line 74
    .line 75
    goto/16 :goto_4

    .line 76
    .line 77
    :cond_4
    if-ne v1, v5, :cond_5

    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_5
    invoke-virtual {p1}, Lqd/j;->r()Lqd/j;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p2}, Lqd/j;->r()Lqd/j;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p0, p1, p2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne v0, v1, :cond_16

    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_6
    invoke-virtual {p1}, Lqd/j;->j()Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p2}, Lqd/j;->j()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v0}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_9

    .line 109
    .line 110
    invoke-static {v2}, Lxe/s;->h(Ljava/util/Collection;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_7

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-ne v3, v4, :cond_a

    .line 126
    .line 127
    move v4, v1

    .line 128
    :goto_0
    if-ge v4, v3, :cond_a

    .line 129
    .line 130
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Lqd/j;

    .line 135
    .line 136
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Lqd/j;

    .line 141
    .line 142
    invoke-virtual {p0, v5, v6}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    sget-object v6, Lqe/l;->g:Lqe/l;

    .line 147
    .line 148
    if-eq v5, v6, :cond_8

    .line 149
    .line 150
    return-object v5

    .line 151
    :cond_8
    add-int/lit8 v4, v4, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    :goto_1
    invoke-virtual {p1}, Lqd/j;->m()Lqd/j;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p2}, Lqd/j;->m()Lqd/j;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    if-eqz v2, :cond_a

    .line 165
    .line 166
    invoke-virtual {p0, v0, v2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :cond_a
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 172
    .line 173
    invoke-virtual {p1, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-nez v2, :cond_11

    .line 178
    .line 179
    invoke-virtual {p2, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_b

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_b
    iget-object v0, p0, Lqe/k;->a:Lud/u;

    .line 187
    .line 188
    invoke-static {v0, p1, p2}, Lqd/j;->u(Lud/u;Lqd/j;Lqd/j;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_c

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_c
    invoke-static {v0, p2, p1}, Lqd/j;->u(Lud/u;Lqd/j;Lqd/j;)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_d

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_d
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_e

    .line 207
    .line 208
    iget-object v2, v0, Lud/u;->s:Led/c;

    .line 209
    .line 210
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-object v2, v2, Led/c;->b:Ljava/util/HashMap;

    .line 215
    .line 216
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    goto :goto_2

    .line 221
    :cond_e
    move p1, v1

    .line 222
    :goto_2
    if-eqz p1, :cond_10

    .line 223
    .line 224
    invoke-virtual {p2}, Lqd/j;->v()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_f

    .line 229
    .line 230
    iget-object p1, v0, Lud/u;->s:Led/c;

    .line 231
    .line 232
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p2

    .line 236
    iget-object p1, p1, Led/c;->b:Ljava/util/HashMap;

    .line 237
    .line 238
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    :cond_f
    if-nez v1, :cond_16

    .line 243
    .line 244
    :cond_10
    sget-object p1, Lqe/l;->n:Lqe/l;

    .line 245
    .line 246
    return-object p1

    .line 247
    :cond_11
    :goto_3
    if-eqz v2, :cond_12

    .line 248
    .line 249
    :goto_4
    sget-object p1, Lqe/l;->j:Lqe/l;

    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_12
    :goto_5
    sget-object p1, Lqe/l;->h:Lqe/l;

    .line 253
    .line 254
    return-object p1

    .line 255
    :cond_13
    :goto_6
    invoke-virtual {p1}, Lqd/j;->r()Lqd/j;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {p2}, Lqd/j;->r()Lqd/j;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-nez v0, :cond_14

    .line 264
    .line 265
    if-eqz v3, :cond_17

    .line 266
    .line 267
    :cond_14
    if-eqz v0, :cond_15

    .line 268
    .line 269
    if-eqz v2, :cond_15

    .line 270
    .line 271
    invoke-virtual {p1}, Lqd/j;->q()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-ne v0, v5, :cond_15

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_15
    if-eqz v1, :cond_17

    .line 279
    .line 280
    if-eqz v3, :cond_17

    .line 281
    .line 282
    invoke-virtual {p2}, Lqd/j;->q()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-ne v0, v5, :cond_17

    .line 287
    .line 288
    :cond_16
    :goto_7
    sget-object p1, Lqe/l;->l:Lqe/l;

    .line 289
    .line 290
    return-object p1

    .line 291
    :cond_17
    if-eqz v1, :cond_18

    .line 292
    .line 293
    invoke-virtual {p0, p1, p2}, Lqe/k;->b(Lqd/j;Lqd/j;)Lqe/l;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    return-object p1

    .line 298
    :cond_18
    invoke-virtual {p0, p2, p1}, Lqe/k;->b(Lqd/j;Lqd/j;)Lqe/l;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p1}, Lqe/l;->a()Lqe/l;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    return-object p1
.end method

.method public final d(Lqd/j;Lqd/j;)Lqe/l;
    .locals 5

    .line 1
    if-eq p1, p2, :cond_14

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lqd/j;->w()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2}, Lqd/j;->w()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {p1, p2}, Lqe/k;->e(Lqd/j;Lqd/j;)Lqe/l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {p2, p1}, Lqe/k;->e(Lqd/j;Lqd/j;)Lqe/l;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Lqe/l;->a()Lqe/l;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_2
    instance-of v1, p1, Lqd/a;

    .line 38
    .line 39
    instance-of v2, p2, Lqd/a;

    .line 40
    .line 41
    if-eq v1, v2, :cond_4

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-static {p2}, Lqe/k;->a(Lqd/j;)Lqe/l;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_3
    invoke-static {p1}, Lqe/k;->a(Lqd/j;)Lqe/l;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lqe/l;->a()Lqe/l;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_4
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {p1}, Lqd/j;->g()Lqd/j;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2}, Lqd/j;->g()Lqd/j;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p0, p1, p2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_5
    if-nez v0, :cond_6

    .line 75
    .line 76
    invoke-virtual {p1}, Lqd/j;->n()[Lqd/q;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    array-length p1, p1

    .line 81
    invoke-virtual {p2}, Lqd/j;->n()[Lqd/q;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    array-length p2, p2

    .line 86
    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-lez p1, :cond_f

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_6
    instance-of v0, p1, Lqd/g;

    .line 94
    .line 95
    instance-of v1, p2, Lqd/g;

    .line 96
    .line 97
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {p2}, Lqd/j;->v()Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    if-eqz v3, :cond_7

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Lqe/k;->c(Lqd/j;Lqd/j;)Lqe/l;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :cond_7
    sget-object v4, Lqe/l;->l:Lqe/l;

    .line 115
    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    if-eqz v1, :cond_8

    .line 119
    .line 120
    return-object v4

    .line 121
    :cond_8
    if-eqz v0, :cond_9

    .line 122
    .line 123
    if-eqz v3, :cond_9

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_9
    if-eqz v0, :cond_13

    .line 127
    .line 128
    if-eqz v1, :cond_13

    .line 129
    .line 130
    invoke-virtual {p1}, Lqd/j;->o()Lqd/q;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {p2}, Lqd/j;->o()Lqd/q;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    sget-object v0, Lqd/q;->j:Lqd/q;

    .line 139
    .line 140
    if-eq p1, v0, :cond_11

    .line 141
    .line 142
    if-ne p2, v0, :cond_a

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_a
    sget-object v0, Lqd/q;->t:Lqd/q;

    .line 146
    .line 147
    if-eq p1, v0, :cond_10

    .line 148
    .line 149
    if-ne p2, v0, :cond_b

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_b
    sget-object v0, Lqd/q;->l:Lqd/q;

    .line 153
    .line 154
    if-ne p1, v0, :cond_c

    .line 155
    .line 156
    sget-object v0, Lqd/q;->k:Lqd/q;

    .line 157
    .line 158
    if-ne p2, v0, :cond_c

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_c
    sget-object v0, Lqd/q;->m:Lqd/q;

    .line 162
    .line 163
    if-ne p1, v0, :cond_d

    .line 164
    .line 165
    sget-object v0, Lqd/q;->k:Lqd/q;

    .line 166
    .line 167
    if-ne p2, v0, :cond_d

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_d
    invoke-static {p1}, Lqe/k;->f(Lqd/q;)B

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-static {p2}, Lqe/k;->f(Lqd/q;)B

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-le p1, p2, :cond_e

    .line 179
    .line 180
    :goto_0
    sget-object p1, Lqe/l;->j:Lqe/l;

    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_e
    if-ge p1, p2, :cond_14

    .line 184
    .line 185
    :cond_f
    sget-object p1, Lqe/l;->h:Lqe/l;

    .line 186
    .line 187
    return-object p1

    .line 188
    :cond_10
    :goto_1
    if-ne p1, p2, :cond_12

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_11
    :goto_2
    if-ne p1, p2, :cond_12

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_12
    :goto_3
    return-object v4

    .line 195
    :cond_13
    sget-object v0, Lqe/k;->d:Lmh/b;

    .line 196
    .line 197
    const-string v1, "Type compare function not complete, can\'t compare {} and {}"

    .line 198
    .line 199
    invoke-interface {v0, p1, v1, p2}, Lmh/b;->s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    return-object v4

    .line 203
    :cond_14
    :goto_4
    sget-object p1, Lqe/l;->g:Lqe/l;

    .line 204
    .line 205
    return-object p1
.end method
