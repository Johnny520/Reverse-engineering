.class public final synthetic Lwb/rp;
.super Lgg/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Lqg/t;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Li0/a1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lqg/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/rp;->n:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p10, p0, Lwb/rp;->o:Lqg/t;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/rp;->p:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/rp;->q:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/rp;->r:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/rp;->s:Li0/a1;

    .line 12
    .line 13
    iput-object p6, p0, Lwb/rp;->t:Li0/a1;

    .line 14
    .line 15
    iput-object p7, p0, Lwb/rp;->u:Li0/a1;

    .line 16
    .line 17
    iput-object p8, p0, Lwb/rp;->v:Li0/a1;

    .line 18
    .line 19
    iput-object p9, p0, Lwb/rp;->w:Li0/a1;

    .line 20
    .line 21
    const-class p1, Lgg/k;

    .line 22
    .line 23
    invoke-static {p1}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    const-string p6, "PluginMarketUploadDialog$startUpload(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V"

    .line 28
    .line 29
    const/4 p7, 0x0

    .line 30
    const/4 p3, 0x0

    .line 31
    const-string p5, "startUpload"

    .line 32
    .line 33
    move-object p2, p0

    .line 34
    invoke-direct/range {p2 .. p7}, Lgg/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v8, p0, Lwb/rp;->p:Li0/a1;

    .line 2
    .line 3
    invoke-static {v8}, Lwb/y2;->H(Li0/a1;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    iget-object v0, p0, Lwb/rp;->q:Li0/a1;

    .line 10
    .line 11
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/util/Set;

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lwb/rp;->r:Li0/a1;

    .line 26
    .line 27
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/util/List;

    .line 32
    .line 33
    move-object v2, v1

    .line 34
    new-instance v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    move-object v4, v3

    .line 54
    check-cast v4, Leb/c0;

    .line 55
    .line 56
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Ljava/util/Set;

    .line 61
    .line 62
    iget-object v4, v4, Leb/c0;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, Lwb/rp;->n:Landroid/content/Context;

    .line 79
    .line 80
    iget-object v4, p0, Lwb/rp;->s:Li0/a1;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    check-cast v3, Leb/c0;

    .line 100
    .line 101
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    check-cast v5, Ljava/util/Map;

    .line 106
    .line 107
    iget-object v3, v3, Leb/c0;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/String;

    .line 114
    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    const-string v3, ""

    .line 118
    .line 119
    :cond_5
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_4

    .line 132
    .line 133
    const-string v0, "\u5728\u7ebf\u63d2\u4ef6\u540d\u4e0d\u80fd\u4e3a\u7a7a"

    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    :goto_1
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ltf/y;->a0(I)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    const/16 v3, 0x10

    .line 153
    .line 154
    if-ge v0, v3, :cond_7

    .line 155
    .line 156
    move v0, v3

    .line 157
    :cond_7
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 158
    .line 159
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_8

    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    check-cast v5, Leb/c0;

    .line 177
    .line 178
    iget-object v5, v5, Leb/c0;->a:Ljava/lang/String;

    .line 179
    .line 180
    new-instance v6, Lwb/tp;

    .line 181
    .line 182
    sget-object v7, Lwb/sp;->g:Lwb/sp;

    .line 183
    .line 184
    const-string v9, "\u7b49\u5f85\u4e0a\u4f20"

    .line 185
    .line 186
    invoke-direct {v6, v7, v9}, Lwb/tp;-><init>(Lwb/sp;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_8
    iget-object v0, p0, Lwb/rp;->t:Li0/a1;

    .line 194
    .line 195
    invoke-interface {v0, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-interface {v8, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    move-object v3, v0

    .line 204
    new-instance v0, Lwb/gn;

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    iget-object v5, p0, Lwb/rp;->u:Li0/a1;

    .line 208
    .line 209
    iget-object v6, p0, Lwb/rp;->v:Li0/a1;

    .line 210
    .line 211
    iget-object v7, p0, Lwb/rp;->w:Li0/a1;

    .line 212
    .line 213
    invoke-direct/range {v0 .. v9}, Lwb/gn;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 214
    .line 215
    .line 216
    const/4 v1, 0x3

    .line 217
    iget-object v2, p0, Lwb/rp;->o:Lqg/t;

    .line 218
    .line 219
    const/4 v3, 0x0

    .line 220
    invoke-static {v2, v3, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 221
    .line 222
    .line 223
    :cond_9
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 224
    .line 225
    return-object v0
.end method
