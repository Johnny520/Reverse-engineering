.class public final synthetic Lot0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lin0;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Landroid/view/View;

.field public final synthetic o:Lrs2;

.field public final synthetic p:Lmn0;

.field public final synthetic q:Lin0;

.field public final synthetic r:Z

.field public final synthetic s:Lmn0;

.field public final synthetic t:Landroid/content/Context;

.field public final synthetic u:Lmn0;


# direct methods
.method public synthetic constructor <init>(Lin0;Lin0;Lmn0;Lmn0;Lmn0;Lrs2;Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p9, p0, Lot0;->h:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p11, p0, Lot0;->i:Ljava/util/List;

    .line 7
    .line 8
    iput-object p12, p0, Lot0;->j:Ljava/util/List;

    .line 9
    .line 10
    iput-object p10, p0, Lot0;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, p0, Lot0;->l:Lin0;

    .line 13
    .line 14
    iput-object p13, p0, Lot0;->m:Ljava/util/List;

    .line 15
    .line 16
    iput-object p8, p0, Lot0;->n:Landroid/view/View;

    .line 17
    .line 18
    iput-object p6, p0, Lot0;->o:Lrs2;

    .line 19
    .line 20
    iput-object p3, p0, Lot0;->p:Lmn0;

    .line 21
    .line 22
    iput-object p2, p0, Lot0;->q:Lin0;

    .line 23
    .line 24
    iput-boolean p14, p0, Lot0;->r:Z

    .line 25
    .line 26
    iput-object p4, p0, Lot0;->s:Lmn0;

    .line 27
    .line 28
    iput-object p7, p0, Lot0;->t:Landroid/content/Context;

    .line 29
    .line 30
    iput-object p5, p0, Lot0;->u:Lmn0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Ls81;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ltr;

    .line 7
    .line 8
    iget-object v1, p0, Lot0;->k:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, Lot0;->l:Lin0;

    .line 11
    .line 12
    iget-object v3, p0, Lot0;->h:Ljava/lang/String;

    .line 13
    .line 14
    const/4 v4, 0x3

    .line 15
    invoke-direct {v0, v1, v2, v3, v4}, Ltr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lkw;

    .line 19
    .line 20
    const v2, -0x5cfd2c52

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    invoke-direct {v1, v2, v5, v0}, Lkw;-><init>(IZLun0;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-static {p1, v0, v1, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    new-instance v6, Lb81;

    .line 38
    .line 39
    const/4 v11, 0x5

    .line 40
    iget-object v7, p0, Lot0;->m:Ljava/util/List;

    .line 41
    .line 42
    iget-object v8, p0, Lot0;->n:Landroid/view/View;

    .line 43
    .line 44
    iget-object v9, p0, Lot0;->o:Lrs2;

    .line 45
    .line 46
    iget-object v10, p0, Lot0;->p:Lmn0;

    .line 47
    .line 48
    invoke-direct/range {v6 .. v11}, Lb81;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lkw;

    .line 52
    .line 53
    const v1, 0x38ea6049

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v1, v5, v6}, Lkw;-><init>(IZLun0;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1, v0, p0, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lsp0;->c:Lkw;

    .line 63
    .line 64
    invoke-static {p1, v0, p0, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_2

    .line 68
    .line 69
    :cond_0
    new-instance v1, Lcb;

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    iget-object v3, p0, Lot0;->q:Lin0;

    .line 73
    .line 74
    iget-boolean v6, p0, Lot0;->r:Z

    .line 75
    .line 76
    invoke-direct {v1, v2, v3, v6}, Lcb;-><init>(ILjava/lang/Object;Z)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Lkw;

    .line 80
    .line 81
    const v6, -0x37c668db

    .line 82
    .line 83
    .line 84
    invoke-direct {v3, v6, v5, v1}, Lkw;-><init>(IZLun0;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0, v3, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lot0;->i:Ljava/util/List;

    .line 91
    .line 92
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/4 v3, 0x0

    .line 97
    move v6, v3

    .line 98
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_2

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    add-int/lit8 v8, v6, 0x1

    .line 109
    .line 110
    if-ltz v6, :cond_1

    .line 111
    .line 112
    check-cast v7, Ljava/util/List;

    .line 113
    .line 114
    const-string v9, "hooker_group_"

    .line 115
    .line 116
    invoke-static {v9, v6}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    new-instance v10, Lit0;

    .line 121
    .line 122
    iget-object v11, p0, Lot0;->s:Lmn0;

    .line 123
    .line 124
    invoke-direct {v10, v6, v7, v11}, Lit0;-><init>(ILjava/util/List;Lmn0;)V

    .line 125
    .line 126
    .line 127
    new-instance v6, Lkw;

    .line 128
    .line 129
    const v7, 0x5a742527

    .line 130
    .line 131
    .line 132
    invoke-direct {v6, v7, v5, v10}, Lkw;-><init>(IZLun0;)V

    .line 133
    .line 134
    .line 135
    invoke-static {p1, v9, v6, v2}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 136
    .line 137
    .line 138
    move v6, v8

    .line 139
    goto :goto_0

    .line 140
    :cond_1
    invoke-static {}, Leu;->a0()V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_2
    iget-object v1, p0, Lot0;->j:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-eqz v6, :cond_4

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    add-int/lit8 v7, v3, 0x1

    .line 161
    .line 162
    if-ltz v3, :cond_3

    .line 163
    .line 164
    check-cast v6, Ljava/util/List;

    .line 165
    .line 166
    const-string v8, "secondary_group_"

    .line 167
    .line 168
    invoke-static {v8, v3}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    new-instance v9, Ljt0;

    .line 173
    .line 174
    iget-object v10, p0, Lot0;->t:Landroid/content/Context;

    .line 175
    .line 176
    iget-object v11, p0, Lot0;->u:Lmn0;

    .line 177
    .line 178
    invoke-direct {v9, v3, v6, v10, v11}, Ljt0;-><init>(ILjava/util/List;Landroid/content/Context;Lmn0;)V

    .line 179
    .line 180
    .line 181
    new-instance v3, Lkw;

    .line 182
    .line 183
    const v6, 0x689c6e5e

    .line 184
    .line 185
    .line 186
    invoke-direct {v3, v6, v5, v9}, Lkw;-><init>(IZLun0;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, v8, v3, v2}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 190
    .line 191
    .line 192
    move v3, v7

    .line 193
    goto :goto_1

    .line 194
    :cond_3
    invoke-static {}, Leu;->a0()V

    .line 195
    .line 196
    .line 197
    throw v0

    .line 198
    :cond_4
    sget-object p0, Lsp0;->e:Lkw;

    .line 199
    .line 200
    invoke-static {p1, v0, p0, v4}, Ls81;->a(Ls81;Ljava/lang/String;Lkw;I)V

    .line 201
    .line 202
    .line 203
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 204
    .line 205
    return-object p0
.end method
