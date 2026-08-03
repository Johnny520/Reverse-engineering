.class public final Lid/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Ld6/l;
    .locals 10

    .line 1
    iget-object v0, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lb8/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Lb8/c;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v3, v4, :cond_b

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ld6/i;

    .line 48
    .line 49
    if-lez v3, :cond_a

    .line 50
    .line 51
    add-int/lit8 v5, v3, -0x1

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Ljava/util/Map$Entry;

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ld6/i;

    .line 64
    .line 65
    invoke-virtual {v4, v5}, Ld6/i;->e(Ld6/i;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-eqz v6, :cond_a

    .line 70
    .line 71
    iget-object v6, v4, Ld6/i;->b:Ljava/lang/Comparable;

    .line 72
    .line 73
    iget-object v7, v4, Ld6/i;->a:Ljava/lang/Comparable;

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ld6/i;->e(Ld6/i;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_0

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_0
    invoke-virtual {v4}, Ld6/i;->c()Z

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    if-eqz v8, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5}, Ld6/i;->c()Z

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    iget-object v9, v5, Ld6/i;->a:Ljava/lang/Comparable;

    .line 95
    .line 96
    if-nez v8, :cond_1

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_1
    invoke-static {v7, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_3

    .line 104
    .line 105
    iget-boolean v7, v4, Ld6/i;->c:Z

    .line 106
    .line 107
    if-eqz v7, :cond_2

    .line 108
    .line 109
    :goto_1
    move-object v7, v4

    .line 110
    goto :goto_3

    .line 111
    :cond_2
    move-object v7, v5

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-interface {v7, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-lez v7, :cond_2

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ld6/i;->c()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eqz v7, :cond_2

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :goto_3
    invoke-virtual {v4}, Ld6/i;->d()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_8

    .line 132
    .line 133
    invoke-virtual {v5}, Ld6/i;->d()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    iget-object v9, v5, Ld6/i;->b:Ljava/lang/Comparable;

    .line 138
    .line 139
    if-nez v8, :cond_5

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    invoke-static {v6, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_7

    .line 147
    .line 148
    :cond_6
    move-object v6, v5

    .line 149
    goto :goto_6

    .line 150
    :cond_7
    invoke-interface {v6, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-gez v6, :cond_6

    .line 155
    .line 156
    :goto_4
    move-object v6, v4

    .line 157
    goto :goto_6

    .line 158
    :cond_8
    :goto_5
    invoke-virtual {v4}, Ld6/i;->d()Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_6

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :goto_6
    new-instance v8, Ld6/i;

    .line 166
    .line 167
    iget-object v9, v7, Ld6/i;->a:Ljava/lang/Comparable;

    .line 168
    .line 169
    iget-object v6, v6, Ld6/i;->b:Ljava/lang/Comparable;

    .line 170
    .line 171
    iget-boolean v7, v7, Ld6/i;->c:Z

    .line 172
    .line 173
    invoke-direct {v8, v9, v6, v7}, Ld6/i;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;Z)V

    .line 174
    .line 175
    .line 176
    move-object v6, v8

    .line 177
    :goto_7
    invoke-virtual {v6}, Ld6/i;->f()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_9

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_9
    const-string v0, "Overlapping ranges: range "

    .line 185
    .line 186
    const-string v1, " overlaps with entry "

    .line 187
    .line 188
    invoke-static {v0, v5, v1, v4}, Lj8/o;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    const/4 v0, 0x0

    .line 192
    return-object v0

    .line 193
    :cond_a
    :goto_8
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    check-cast v4, Ljava/util/Map$Entry;

    .line 201
    .line 202
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    add-int/lit8 v3, v3, 0x1

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_b
    new-instance v0, Ld6/l;

    .line 214
    .line 215
    invoke-direct {v0, v1, v2}, Ld6/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 216
    .line 217
    .line 218
    return-object v0
.end method

.method public b(FFFFFF)V
    .locals 8

    .line 1
    iget-object v0, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lm1/k;

    .line 4
    .line 5
    move v2, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    move v5, p4

    .line 9
    move v6, p5

    .line 10
    move v7, p6

    .line 11
    invoke-direct/range {v1 .. v7}, Lm1/k;-><init>(FFFFFF)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public c(FF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Lm1/m;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2}, Lm1/m;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public d(Ld6/i;Ljava/lang/Short;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ld6/i;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lid/a;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v1, Ld6/k;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Ld6/k;-><init>(Ld6/i;Ljava/lang/Short;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p1, "Ranges cannot be empty"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
