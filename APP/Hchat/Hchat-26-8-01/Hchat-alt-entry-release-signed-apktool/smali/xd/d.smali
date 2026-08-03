.class public final Lxd/d;
.super Lxd/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/i;


# static fields
.field public static final m:Luf/d;


# instance fields
.field public final k:Lud/a;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Luf/d;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Luf/d;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxd/d;->m:Luf/d;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lud/n;Lud/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lxd/a;-><init>(Lud/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lxd/d;->k:Lud/a;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxd/d;->l:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(Lfd/i;Lfc/f;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lxd/d;->k:Lud/a;

    .line 2
    .line 3
    invoke-static {v0}, La/a;->c0(Lud/h;)Lud/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lpd/s;

    .line 8
    .line 9
    const-string v1, "Switch insn not found in header"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "switch ("

    .line 20
    .line 21
    invoke-virtual {p2, v3}, Lfc/f;->r(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p2, v2, v1}, Lfd/e;->b(Lfc/f;Lqd/l;Z)V

    .line 25
    .line 26
    .line 27
    const-string v1, ") {"

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 30
    .line 31
    .line 32
    invoke-static {p2, v0}, Lic/a;->a(Lfc/f;Lud/p;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p1, Lfd/e;->b:Lud/r;

    .line 36
    .line 37
    invoke-static {p2, v1, v0}, Ljd/c;->a(Lfc/f;Lnd/b0;Lmd/i;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lfc/f;->o()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lxd/d;->l:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_7

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lxd/c;

    .line 60
    .line 61
    iget-object v4, v3, Lxd/c;->a:Ljava/util/List;

    .line 62
    .line 63
    iget-object v3, v3, Lxd/c;->b:Lud/j;

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    sget-object v6, Lxd/d;->m:Luf/d;

    .line 80
    .line 81
    if-ne v5, v6, :cond_0

    .line 82
    .line 83
    const-string v5, "default:"

    .line 84
    .line 85
    invoke-virtual {p2, v5}, Lfc/f;->r(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_0
    const-string v6, "case "

    .line 90
    .line 91
    invoke-virtual {p2, v6}, Lfc/f;->r(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    instance-of v6, v5, Lud/g;

    .line 95
    .line 96
    if-eqz v6, :cond_1

    .line 97
    .line 98
    check-cast v5, Lud/g;

    .line 99
    .line 100
    iget-object v6, v5, Lud/g;->l:Lod/c;

    .line 101
    .line 102
    invoke-virtual {p1, p2, v6, v5}, Lfd/i;->w(Lfc/f;Lod/c;Lud/g;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_1
    instance-of v6, v5, Lod/c;

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    if-eqz v6, :cond_2

    .line 110
    .line 111
    check-cast v5, Lod/c;

    .line 112
    .line 113
    invoke-virtual {p1, p2, v5, v7}, Lfd/i;->w(Lfc/f;Lod/c;Lud/g;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    instance-of v6, v5, Ljava/lang/Integer;

    .line 118
    .line 119
    if-eqz v6, :cond_3

    .line 120
    .line 121
    check-cast v5, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    int-to-long v6, v5

    .line 128
    invoke-virtual {v2}, Lqd/l;->I()Lqd/j;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    iget-boolean v10, p1, Lfd/e;->d:Z

    .line 133
    .line 134
    sget-object v5, Lfd/j;->a:Lmh/b;

    .line 135
    .line 136
    invoke-virtual {v1}, Lud/r;->n()Lud/u;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v9, v5, Lud/u;->c:Lxe/q;

    .line 141
    .line 142
    const/4 v11, 0x0

    .line 143
    invoke-static/range {v6 .. v11}, Lfd/j;->a(JLqd/j;Lxe/q;ZZ)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {p2, v5}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    instance-of v6, v5, Ljava/lang/String;

    .line 152
    .line 153
    if-eqz v6, :cond_4

    .line 154
    .line 155
    const/16 v6, 0x22

    .line 156
    .line 157
    invoke-virtual {p2, v6}, Lfc/f;->d(C)Lfc/f;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    check-cast v5, Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v7, v5}, Lfc/f;->e(Ljava/lang/String;)Lfc/f;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v5, v6}, Lfc/f;->d(C)Lfc/f;

    .line 168
    .line 169
    .line 170
    :goto_2
    const/16 v5, 0x3a

    .line 171
    .line 172
    invoke-virtual {p2, v5}, Lfc/f;->d(C)Lfc/f;

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    new-instance p1, Laf/g;

    .line 177
    .line 178
    if-eqz v5, :cond_5

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    :cond_5
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    const-string v0, "Unexpected key in switch: "

    .line 189
    .line 190
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_6
    invoke-virtual {p1, p2, v3}, Lfd/i;->v(Lfc/f;Lud/j;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_0

    .line 202
    .line 203
    :cond_7
    invoke-virtual {p2}, Lfc/f;->n()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Lfc/f;->q()V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final i()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Lme/a;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lme/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxd/d;->l:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lxd/d;->k:Lud/a;

    .line 2
    .line 3
    iget v0, v0, Lud/a;->i:I

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "SW:"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Switch: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxd/d;->k:Lud/a;

    .line 9
    .line 10
    iget v1, v1, Lud/a;->i:I

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lxd/d;->l:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lxd/c;

    .line 36
    .line 37
    iget-object v3, v2, Lxd/c;->a:Ljava/util/List;

    .line 38
    .line 39
    new-instance v4, Lme/a;

    .line 40
    .line 41
    const/16 v5, 0x19

    .line 42
    .line 43
    invoke-direct {v4, v5}, Lme/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {v3, v4}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "\n case "

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v4, ", "

    .line 56
    .line 57
    invoke-static {v3, v4}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v3, " -> "

    .line 65
    .line 66
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v2, v2, Lxd/c;->b:Lud/j;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lxd/d;->l:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    add-int/lit8 v2, v2, 0x1

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lxd/d;->k:Lud/a;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    new-instance v2, Lme/a;

    .line 20
    .line 21
    const/16 v3, 0x18

    .line 22
    .line 23
    invoke-direct {v2, v3}, Lme/a;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method
