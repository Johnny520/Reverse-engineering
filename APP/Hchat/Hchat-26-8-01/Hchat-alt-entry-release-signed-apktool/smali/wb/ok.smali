.class public final synthetic Lwb/ok;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;Lk9/j;Lwb/q3;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/ok;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p6, p0, Lwb/ok;->h:Z

    .line 8
    .line 9
    iput-object p1, p0, Lwb/ok;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lwb/ok;->l:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lwb/ok;->m:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, Lwb/ok;->i:Li0/a1;

    .line 16
    .line 17
    iput-object p3, p0, Lwb/ok;->j:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(ZLfg/a;Landroid/app/Activity;Li0/a1;Li0/a1;Lfg/l;)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lwb/ok;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ok;->h:Z

    iput-object p2, p0, Lwb/ok;->k:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ok;->l:Ljava/lang/Object;

    iput-object p4, p0, Lwb/ok;->i:Li0/a1;

    iput-object p5, p0, Lwb/ok;->j:Li0/a1;

    iput-object p6, p0, Lwb/ok;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/ok;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ok;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/a;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/ok;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v2, p0, Lwb/ok;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lfg/l;

    .line 17
    .line 18
    iget-object v3, p0, Lwb/ok;->i:Li0/a1;

    .line 19
    .line 20
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Ln2/s;

    .line 25
    .line 26
    iget-object v3, v3, Ln2/s;->a:Li2/g;

    .line 27
    .line 28
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    iget-boolean v4, p0, Lwb/ok;->h:Z

    .line 45
    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    const-string v0, "\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"

    .line 49
    .line 50
    iget-object v1, p0, Lwb/ok;->j:Li0/a1;

    .line 51
    .line 52
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance v0, Lwb/u4;

    .line 60
    .line 61
    const/4 v4, 0x4

    .line 62
    invoke-direct {v0, v4, v2, v3}, Lwb/u4;-><init>(ILfg/l;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    new-instance v3, Lwb/vu;

    .line 78
    .line 79
    invoke-direct {v3, v1, v0}, Lwb/vu;-><init>(Landroid/app/Activity;Lfg/a;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_0
    iget-object v0, p0, Lwb/ok;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Landroid/content/Context;

    .line 91
    .line 92
    iget-object v1, p0, Lwb/ok;->l:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v2, v1

    .line 95
    check-cast v2, Lk9/j;

    .line 96
    .line 97
    iget-object v1, p0, Lwb/ok;->m:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Lwb/q3;

    .line 100
    .line 101
    iget-boolean v3, p0, Lwb/ok;->h:Z

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    if-nez v3, :cond_2

    .line 105
    .line 106
    const-string v1, "\u8bf7\u586b\u5199\u5b8c\u6574\u7684\u5feb\u6377\u9879\u4fe1\u606f"

    .line 107
    .line 108
    invoke-static {v0, v1, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_2
    iget-object v3, v2, Lk9/j;->b:Ljava/lang/String;

    .line 118
    .line 119
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
    iget-object v4, v2, Lk9/j;->d:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    const/4 v8, 0x0

    .line 138
    const/16 v9, 0x75

    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    const/4 v6, 0x0

    .line 142
    const/4 v7, 0x0

    .line 143
    invoke-static/range {v2 .. v9}, Lk9/j;->a(Lk9/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lk9/j;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-object v1, v1, Lwb/q3;->a:Lk9/j;

    .line 148
    .line 149
    if-eqz v1, :cond_3

    .line 150
    .line 151
    iget-object v3, v1, Lk9/j;->e:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v4, v2, Lk9/j;->e:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_3

    .line 160
    .line 161
    invoke-static {v0, v3}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    if-eqz v1, :cond_4

    .line 165
    .line 166
    iget-object v1, v1, Lk9/j;->f:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v3, v2, Lk9/j;->f:Ljava/lang/String;

    .line 169
    .line 170
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-nez v3, :cond_4

    .line 175
    .line 176
    invoke-static {v0, v1}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_4
    iget-object v1, p0, Lwb/ok;->i:Li0/a1;

    .line 180
    .line 181
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, Ljava/util/List;

    .line 186
    .line 187
    invoke-static {v3}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    if-eqz v5, :cond_6

    .line 200
    .line 201
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    check-cast v5, Lk9/j;

    .line 206
    .line 207
    iget-object v5, v5, Lk9/j;->a:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v6, v2, Lk9/j;->a:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_5

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    add-int/lit8 v10, v10, 0x1

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_6
    const/4 v10, -0x1

    .line 222
    :goto_2
    if-ltz v10, :cond_7

    .line 223
    .line 224
    invoke-virtual {v3, v10, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_7
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    :goto_3
    invoke-static {v0, v1, v3}, Lwb/ho;->V0(Landroid/content/Context;Li0/a1;Ljava/util/ArrayList;)V

    .line 232
    .line 233
    .line 234
    const/4 v0, 0x0

    .line 235
    iget-object v1, p0, Lwb/ok;->j:Li0/a1;

    .line 236
    .line 237
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
