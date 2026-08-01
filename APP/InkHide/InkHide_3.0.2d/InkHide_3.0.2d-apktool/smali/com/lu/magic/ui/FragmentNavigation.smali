.class public final Lcom/lu/magic/ui/FragmentNavigation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e;


# instance fields
.field public a:Landroid/view/ViewGroup;

.field public b:Landroidx/fragment/app/z;

.field public c:Ljava/util/Stack;

.field public d:I


# virtual methods
.method public final b(Landroidx/lifecycle/s;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/lu/magic/ui/FragmentNavigation;->c:Ljava/util/Stack;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Landroidx/fragment/app/l;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "fragment.javaClass.toString()"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->b:Landroidx/fragment/app/z;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const-string v3, "supportFragmentManager"

    .line 18
    .line 19
    if-eqz v1, :cond_d

    .line 20
    .line 21
    new-instance v4, Landroidx/fragment/app/a;

    .line 22
    .line 23
    invoke-direct {v4, v1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/z;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->b:Landroidx/fragment/app/z;

    .line 27
    .line 28
    if-eqz v1, :cond_c

    .line 29
    .line 30
    iget-object v1, v1, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 31
    .line 32
    const-string v3, " is already attached to a FragmentManager."

    .line 33
    .line 34
    iget-object v5, v4, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    iget-object v6, v1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    if-ne v6, v5, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Cannot hide Fragment attached to a different FragmentManager. Fragment "

    .line 50
    .line 51
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/fragment/app/l;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_1
    :goto_0
    new-instance v6, Landroidx/fragment/app/G;

    .line 73
    .line 74
    const/4 v7, 0x4

    .line 75
    invoke-direct {v6, v7, v1}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v6}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/G;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object v1, p1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    iget-boolean v1, p1, Landroidx/fragment/app/l;->l:Z

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    iget-object v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->a:Landroid/view/ViewGroup;

    .line 91
    .line 92
    if-eqz v1, :cond_b

    .line 93
    .line 94
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v4, v1, p1, v0}, Landroidx/fragment/app/a;->a(ILandroidx/fragment/app/l;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    iget-object v0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    if-ne v0, v5, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "

    .line 113
    .line 114
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroidx/fragment/app/l;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v0

    .line 135
    :cond_5
    :goto_2
    new-instance v0, Landroidx/fragment/app/G;

    .line 136
    .line 137
    const/16 v1, 0x8

    .line 138
    .line 139
    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v0}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/G;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    if-ne v0, v5, :cond_6

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    const-string v2, "Cannot show Fragment attached to a different FragmentManager. Fragment "

    .line 157
    .line 158
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Landroidx/fragment/app/l;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0

    .line 179
    :cond_7
    :goto_3
    new-instance v0, Landroidx/fragment/app/G;

    .line 180
    .line 181
    const/4 v1, 0x5

    .line 182
    invoke-direct {v0, v1, p1}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v0}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/G;)V

    .line 186
    .line 187
    .line 188
    iget-boolean v0, v4, Landroidx/fragment/app/a;->g:Z

    .line 189
    .line 190
    if-nez v0, :cond_a

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    invoke-virtual {v5, v4, v0}, Landroidx/fragment/app/z;->w(Landroidx/fragment/app/a;Z)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p0, Lcom/lu/magic/ui/FragmentNavigation;->c:Ljava/util/Stack;

    .line 197
    .line 198
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_9

    .line 203
    .line 204
    iget v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-ge v1, v2, :cond_9

    .line 211
    .line 212
    iget v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 213
    .line 214
    const/4 v2, -0x1

    .line 215
    if-le v1, v2, :cond_8

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    add-int/lit8 v2, v2, -0x1

    .line 222
    .line 223
    if-eq v1, v2, :cond_8

    .line 224
    .line 225
    :goto_4
    iget v1, p0, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    add-int/lit8 v2, v2, -0x1

    .line 232
    .line 233
    if-eq v1, v2, :cond_8

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_8
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    :cond_9
    invoke-virtual {v0, p1}, Ljava/util/AbstractList;->indexOf(Ljava/lang/Object;)I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    iput p1, p0, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 247
    .line 248
    return-void

    .line 249
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 250
    .line 251
    const-string v0, "This transaction is already being added to the back stack"

    .line 252
    .line 253
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw p1

    .line 257
    :cond_b
    const-string p1, "fragmentContainer"

    .line 258
    .line 259
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v2

    .line 263
    :cond_c
    invoke-static {v3}, LN0/g;->g(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    throw v2

    .line 267
    :cond_d
    invoke-static {v3}, LN0/g;->g(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v2
.end method
