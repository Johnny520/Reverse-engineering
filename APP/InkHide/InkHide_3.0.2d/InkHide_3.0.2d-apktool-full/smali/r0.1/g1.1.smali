.class public final synthetic Lr0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/l1;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lr0/l1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/g1;->a:I

    iput-object p1, p0, Lr0/g1;->c:Landroid/app/Activity;

    iput-object p2, p0, Lr0/g1;->b:Lr0/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lr0/l1;Landroid/app/Activity;I)V
    .locals 0

    .line 2
    iput p3, p0, Lr0/g1;->a:I

    iput-object p1, p0, Lr0/g1;->b:Lr0/l1;

    iput-object p2, p0, Lr0/g1;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/g1;->b:Lr0/l1;

    .line 3
    .line 4
    iget-object v2, p0, Lr0/g1;->c:Landroid/app/Activity;

    .line 5
    .line 6
    iget v3, p0, Lr0/g1;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v3, Lr0/l1;->l:LU0/g;

    .line 25
    .line 26
    invoke-virtual {v1, v2, v0}, Lr0/l1;->x(Landroid/app/Activity;Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1, v0}, Lr0/l1;->u(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Lr0/l1;->w(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void

    .line 40
    :pswitch_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v0}, Lr0/l1;->M(Landroid/app/Activity;Landroid/view/View;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    invoke-virtual {v1, v2, v0}, Lr0/l1;->F(Landroid/app/Activity;Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    sget-boolean v2, Lz0/i;->a:Z

    .line 66
    .line 67
    invoke-static {}, Lz0/g;->D()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lr0/l1;->u(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_1
    return-void

    .line 77
    :pswitch_1
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v2, v0}, Lr0/l1;->M(Landroid/app/Activity;Landroid/view/View;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_b

    .line 95
    .line 96
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_b

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-nez v0, :cond_6

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_6
    sget-boolean v3, Lz0/i;->a:Z

    .line 110
    .line 111
    invoke-static {}, Lz0/g;->D()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_7

    .line 116
    .line 117
    invoke-virtual {v1, v2, v0}, Lr0/l1;->F(Landroid/app/Activity;Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Lr0/l1;->u(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-virtual {v1, v2, v0}, Lr0/l1;->x(Landroid/app/Activity;Landroid/view/View;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    invoke-static {}, Lz0/g;->D()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-nez v3, :cond_a

    .line 135
    .line 136
    iget-object v0, v1, Lr0/l1;->b:Ljava/util/Set;

    .line 137
    .line 138
    const-string v2, "hiddenStorageRows"

    .line 139
    .line 140
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_9

    .line 156
    .line 157
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, Landroid/view/View;

    .line 162
    .line 163
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v3}, Lr0/l1;->K(Landroid/view/View;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_9
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_a
    invoke-virtual {v1, v0}, Lr0/l1;->w(Landroid/view/View;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const-string v3, "CleanChatting"

    .line 186
    .line 187
    const/4 v4, 0x1

    .line 188
    invoke-static {v0, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_b

    .line 193
    .line 194
    invoke-virtual {v1, v2}, Lr0/l1;->h(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Lr0/l1;->I(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_b
    :goto_3
    return-void

    .line 201
    :pswitch_2
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    if-eqz v3, :cond_c

    .line 206
    .line 207
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :cond_c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    if-nez v0, :cond_d

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_d
    invoke-static {v2}, Lr0/l1;->A(Landroid/app/Activity;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-eqz v3, :cond_f

    .line 222
    .line 223
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_e

    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_e
    invoke-virtual {v1, v2, v0}, Lr0/l1;->x(Landroid/app/Activity;Landroid/view/View;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    goto :goto_5

    .line 235
    :cond_f
    :goto_4
    const/4 v0, 0x0

    .line 236
    :goto_5
    if-eqz v0, :cond_10

    .line 237
    .line 238
    invoke-virtual {v1, v2}, Lr0/l1;->h(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2}, Lr0/l1;->I(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_10
    return-void

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
