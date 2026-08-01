.class public Landroidx/fragment/app/FragmentActivity;
.super Landroidx/activity/ComponentActivity;


# instance fields
.field public final s:Ll0;

.field public final t:Landroidx/lifecycle/a;

.field public u:Z

.field public v:Z

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnl;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lnl;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ll0;

    .line 10
    .line 11
    const/16 v2, 0xf

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 17
    .line 18
    new-instance v0, Landroidx/lifecycle/a;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/lifecycle/a;-><init>(Loq;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->w:Z

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:Lgm;

    .line 29
    .line 30
    iget-object v0, v0, Lgm;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La3;

    .line 33
    .line 34
    new-instance v1, Ls2;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v2}, Ls2;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 38
    .line 39
    .line 40
    const-string v2, "android:support:fragments"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, La3;->e(Ljava/lang/String;Lt10;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lt2;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, p0, v1}, Lt2;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->h(Lyw;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static k(Lyl;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Lyl;->c:Lr5;

    .line 2
    .line 3
    invoke-virtual {p0}, Lr5;->p()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lml;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Lml;->s:Lnl;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Lnl;->G:Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Lml;->g()Lyl;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroidx/fragment/app/FragmentActivity;->k(Lyl;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Lml;->M:Lfm;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    sget-object v4, Ljq;->d:Ljq;

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Lfm;->f()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v2, Lfm;->b:Landroidx/lifecycle/a;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/lifecycle/a;->c:Ljq;

    .line 59
    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ltz v2, :cond_4

    .line 65
    .line 66
    iget-object v0, v1, Lml;->M:Lfm;

    .line 67
    .line 68
    iget-object v0, v0, Lfm;->b:Landroidx/lifecycle/a;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/lifecycle/a;->g()V

    .line 71
    .line 72
    .line 73
    move v0, v3

    .line 74
    :cond_4
    iget-object v2, v1, Lml;->L:Landroidx/lifecycle/a;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/lifecycle/a;->c:Ljq;

    .line 77
    .line 78
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ltz v2, :cond_0

    .line 83
    .line 84
    iget-object v0, v1, Lml;->L:Landroidx/lifecycle/a;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/lifecycle/a;->g()V

    .line 87
    .line 88
    .line 89
    move v0, v3

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    return v0
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "Local FragmentActivity "

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, " State:"

    .line 24
    .line 25
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, "  "

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, "mCreated="

    .line 49
    .line 50
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->u:Z

    .line 54
    .line 55
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 56
    .line 57
    .line 58
    const-string v1, " mResumed="

    .line 59
    .line 60
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->v:Z

    .line 64
    .line 65
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 66
    .line 67
    .line 68
    const-string v1, " mStopped="

    .line 69
    .line 70
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->w:Z

    .line 74
    .line 75
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    invoke-interface {p0}, Lsa0;->d()Lra0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "store"

    .line 89
    .line 90
    invoke-static {v2, v1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Lse;->b:Lse;

    .line 94
    .line 95
    const-string v3, "defaultCreationExtras"

    .line 96
    .line 97
    invoke-static {v3, v2}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const-class v3, Lpr;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 109
    .line 110
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const-string v5, "key"

    .line 115
    .line 116
    invoke-static {v5, v4}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v1, v1, Lra0;->a:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-virtual {v1, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Lpa0;

    .line 126
    .line 127
    invoke-virtual {v3, v5}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_0

    .line 132
    .line 133
    const-string v1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 134
    .line 135
    invoke-static {v1, v5}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 140
    .line 141
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 142
    .line 143
    .line 144
    iget-object v2, v2, Lte;->a:Ljava/util/LinkedHashMap;

    .line 145
    .line 146
    invoke-interface {v3, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 147
    .line 148
    .line 149
    sget-object v2, Lvh;->p:Lvh;

    .line 150
    .line 151
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :try_start_0
    new-instance v2, Lpr;

    .line 155
    .line 156
    invoke-direct {v2}, Lpr;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    .line 158
    .line 159
    :goto_0
    move-object v5, v2

    .line 160
    goto :goto_1

    .line 161
    :catch_0
    new-instance v2, Lpr;

    .line 162
    .line 163
    invoke-direct {v2}, Lpr;-><init>()V

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :goto_1
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    check-cast v1, Lpa0;

    .line 172
    .line 173
    if-eqz v1, :cond_1

    .line 174
    .line 175
    invoke-virtual {v1}, Lpa0;->a()V

    .line 176
    .line 177
    .line 178
    :cond_1
    :goto_2
    check-cast v5, Lpr;

    .line 179
    .line 180
    iget-object v1, v5, Lpr;->c:Le40;

    .line 181
    .line 182
    iget v2, v1, Le40;->c:I

    .line 183
    .line 184
    if-lez v2, :cond_5

    .line 185
    .line 186
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-string v2, "Loaders:"

    .line 190
    .line 191
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget v2, v1, Le40;->c:I

    .line 195
    .line 196
    if-gtz v2, :cond_2

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_2
    iget-object p1, v1, Le40;->b:[Ljava/lang/Object;

    .line 200
    .line 201
    const/4 p2, 0x0

    .line 202
    aget-object p1, p1, p2

    .line 203
    .line 204
    if-nez p1, :cond_3

    .line 205
    .line 206
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string p1, "  #"

    .line 210
    .line 211
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, v1, Le40;->a:[I

    .line 215
    .line 216
    aget p1, p1, p2

    .line 217
    .line 218
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 219
    .line 220
    .line 221
    const-string p1, ": "

    .line 222
    .line 223
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    throw p1

    .line 228
    :cond_3
    new-instance p1, Ljava/lang/ClassCastException;

    .line 229
    .line 230
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 231
    .line 232
    .line 233
    throw p1

    .line 234
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 235
    .line 236
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 237
    .line 238
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_5
    :goto_3
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 243
    .line 244
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v0, Lnl;

    .line 247
    .line 248
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 249
    .line 250
    invoke-virtual {v0, p1, p2, p3, p4}, Lyl;->q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, Ll0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lnl;

    .line 12
    .line 13
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 14
    .line 15
    invoke-virtual {p1}, Lyl;->h()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 5
    .line 6
    sget-object v0, Liq;->ON_CREATE:Liq;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 12
    .line 13
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lnl;

    .line 16
    .line 17
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Lyl;->y:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Lyl;->z:Z

    .line 23
    .line 24
    iget-object v1, p1, Lyl;->F:Lam;

    .line 25
    .line 26
    iput-boolean v0, v1, Lam;->h:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Lyl;->p(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 11
    .line 12
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lnl;

    .line 15
    .line 16
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 17
    .line 18
    invoke-virtual {p1}, Lyl;->j()Z

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 23
    .line 24
    .line 25
    return v0
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    check-cast v0, Lnl;

    .line 3
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 4
    iget-object v0, v0, Lyl;->f:Lql;

    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lql;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 7
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 8
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    check-cast v0, Lnl;

    .line 9
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 10
    iget-object v0, v0, Lyl;->f:Lql;

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1, p2, p3}, Lql;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 12
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 5
    .line 6
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnl;

    .line 9
    .line 10
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 11
    .line 12
    invoke-virtual {v0}, Lyl;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 16
    .line 17
    sget-object v1, Liq;->ON_DESTROY:Liq;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onLowMemory()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 5
    .line 6
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnl;

    .line 9
    .line 10
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 11
    .line 12
    iget-object v0, v0, Lyl;->c:Lr5;

    .line 13
    .line 14
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lml;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Lml;->w()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x6

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    iget-object p1, p2, Ll0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lnl;

    .line 21
    .line 22
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 23
    .line 24
    invoke-virtual {p1}, Lyl;->i()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_2
    iget-object p1, p2, Ll0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lnl;

    .line 32
    .line 33
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 34
    .line 35
    invoke-virtual {p1}, Lyl;->l()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lnl;

    .line 6
    .line 7
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 8
    .line 9
    iget-object p1, p1, Lyl;->c:Lr5;

    .line 10
    .line 11
    invoke-virtual {p1}, Lr5;->p()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lml;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lml;->x()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 4
    .line 5
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lnl;

    .line 8
    .line 9
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 10
    .line 11
    invoke-virtual {v0}, Lyl;->m()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->v:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 8
    .line 9
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lnl;

    .line 12
    .line 13
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Lyl;->p(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 20
    .line 21
    sget-object v1, Liq;->ON_PAUSE:Liq;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lnl;

    .line 6
    .line 7
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 8
    .line 9
    iget-object p1, p1, Lyl;->c:Lr5;

    .line 10
    .line 11
    invoke-virtual {p1}, Lr5;->p()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lml;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lml;->y()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    return-void
.end method

.method public onPostResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 5
    .line 6
    sget-object v1, Liq;->ON_RESUME:Liq;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 12
    .line 13
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnl;

    .line 16
    .line 17
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Lyl;->y:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Lyl;->z:Z

    .line 23
    .line 24
    iget-object v2, v0, Lyl;->F:Lam;

    .line 25
    .line 26
    iput-boolean v1, v2, Lam;->h:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, Lyl;->p(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 9
    .line 10
    iget-object p1, p1, Ll0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lnl;

    .line 13
    .line 14
    iget-object p1, p1, Lnl;->F:Lyl;

    .line 15
    .line 16
    invoke-virtual {p1}, Lyl;->o()Z

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 21
    .line 22
    .line 23
    return v0
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->v:Z

    .line 11
    .line 12
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lnl;

    .line 15
    .line 16
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lyl;->t(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Ll0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lnl;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->w:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->u:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Landroidx/fragment/app/FragmentActivity;->u:Z

    .line 22
    .line 23
    iget-object v2, v0, Lnl;->F:Lyl;

    .line 24
    .line 25
    iput-boolean v1, v2, Lyl;->y:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Lyl;->z:Z

    .line 28
    .line 29
    iget-object v4, v2, Lyl;->F:Lam;

    .line 30
    .line 31
    iput-boolean v1, v4, Lam;->h:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Lyl;->p(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Lnl;->F:Lyl;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lyl;->t(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 43
    .line 44
    sget-object v3, Liq;->ON_START:Liq;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Lnl;->F:Lyl;

    .line 50
    .line 51
    iput-boolean v1, v0, Lyl;->y:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Lyl;->z:Z

    .line 54
    .line 55
    iget-object v2, v0, Lyl;->F:Lam;

    .line 56
    .line 57
    iput-boolean v1, v2, Lam;->h:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, Lyl;->p(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll0;->v()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->w:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->s:Ll0;

    .line 8
    .line 9
    iget-object v2, v1, Ll0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lnl;

    .line 12
    .line 13
    iget-object v2, v2, Lnl;->F:Lyl;

    .line 14
    .line 15
    invoke-static {v2}, Landroidx/fragment/app/FragmentActivity;->k(Lyl;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Ll0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lnl;

    .line 24
    .line 25
    iget-object v1, v1, Lnl;->F:Lyl;

    .line 26
    .line 27
    iput-boolean v0, v1, Lyl;->z:Z

    .line 28
    .line 29
    iget-object v2, v1, Lyl;->F:Lam;

    .line 30
    .line 31
    iput-boolean v0, v2, Lam;->h:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Lyl;->p(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->t:Landroidx/lifecycle/a;

    .line 38
    .line 39
    sget-object v1, Liq;->ON_STOP:Liq;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
