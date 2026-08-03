.class public final synthetic Lwb/ng;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 16
    iput p5, p0, Lwb/ng;->g:I

    iput-object p1, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/ng;->i:Li0/a1;

    iput-object p3, p0, Lwb/ng;->j:Li0/a1;

    iput-object p4, p0, Lwb/ng;->k:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/ng;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ng;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ng;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ng;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/ng;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lwb/s0;

    .line 35
    .line 36
    iget-object v1, v1, Lwb/s0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v2, v1

    .line 62
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-nez v2, :cond_1

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {p1}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v0, p0, Lwb/ng;->i:Li0/a1;

    .line 79
    .line 80
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    iget-object v1, p0, Lwb/ng;->j:Li0/a1;

    .line 86
    .line 87
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    .line 91
    .line 92
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/util/Set;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/Iterable;

    .line 103
    .line 104
    invoke-static {v0}, Lwb/ho;->D5(Ljava/lang/Iterable;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "block_at_all_notification_groups"

    .line 109
    .line 110
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 115
    .line 116
    .line 117
    sget-object p1, Lwb/b;->a:Lwb/b;

    .line 118
    .line 119
    iget-object v0, p0, Lwb/ng;->k:Li0/a1;

    .line 120
    .line 121
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_0
    check-cast p1, Lr/h;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v0, Lwb/p0;->g0:Ls0/d;

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    const/4 v2, 0x3

    .line 136
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 137
    .line 138
    .line 139
    new-instance v3, Lwb/pa;

    .line 140
    .line 141
    const/4 v8, 0x3

    .line 142
    iget-object v4, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    .line 143
    .line 144
    iget-object v5, p0, Lwb/ng;->i:Li0/a1;

    .line 145
    .line 146
    iget-object v6, p0, Lwb/ng;->j:Li0/a1;

    .line 147
    .line 148
    iget-object v7, p0, Lwb/ng;->k:Li0/a1;

    .line 149
    .line 150
    invoke-direct/range {v3 .. v8}, Lwb/pa;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Ls0/d;

    .line 154
    .line 155
    const v4, 0x10da7fe7

    .line 156
    .line 157
    .line 158
    const/4 v5, 0x1

    .line 159
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :pswitch_1
    check-cast p1, Lr/h;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object v0, Lwb/p0;->I5:Ls0/d;

    .line 172
    .line 173
    const/4 v1, 0x0

    .line 174
    const/4 v2, 0x3

    .line 175
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 176
    .line 177
    .line 178
    new-instance v3, Lwb/pa;

    .line 179
    .line 180
    const/4 v8, 0x5

    .line 181
    iget-object v4, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    .line 182
    .line 183
    iget-object v5, p0, Lwb/ng;->i:Li0/a1;

    .line 184
    .line 185
    iget-object v6, p0, Lwb/ng;->j:Li0/a1;

    .line 186
    .line 187
    iget-object v7, p0, Lwb/ng;->k:Li0/a1;

    .line 188
    .line 189
    invoke-direct/range {v3 .. v8}, Lwb/pa;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Ls0/d;

    .line 193
    .line 194
    const v4, 0x7d284337

    .line 195
    .line 196
    .line 197
    const/4 v5, 0x1

    .line 198
    invoke-direct {v0, v4, v3, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :pswitch_2
    move-object v6, p1

    .line 206
    check-cast v6, Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v3, p0, Lwb/ng;->i:Li0/a1;

    .line 212
    .line 213
    invoke-interface {v3, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    const/4 v5, 0x0

    .line 217
    const/16 v7, 0x30

    .line 218
    .line 219
    iget-object v0, p0, Lwb/ng;->h:Landroid/content/SharedPreferences;

    .line 220
    .line 221
    iget-object v1, p0, Lwb/ng;->j:Li0/a1;

    .line 222
    .line 223
    iget-object v2, p0, Lwb/ng;->k:Li0/a1;

    .line 224
    .line 225
    const/4 v4, 0x0

    .line 226
    invoke-static/range {v0 .. v7}, Lwb/ho;->J(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;I)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
