.class public abstract Le/i;
.super Landroidx/activity/g;
.source "SourceFile"

# interfaces
.implements Le/j;


# instance fields
.field public final p:LC/j;

.field public final q:Landroidx/lifecycle/u;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Le/u;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/activity/g;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/o;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroidx/fragment/app/o;-><init>(Le/i;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LC/j;

    .line 10
    .line 11
    const/16 v2, 0xb

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, LC/j;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Le/i;->p:LC/j;

    .line 17
    .line 18
    new-instance v0, Landroidx/lifecycle/u;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Le/i;->t:Z

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/activity/g;->f:LM/e;

    .line 29
    .line 30
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LM/d;

    .line 33
    .line 34
    new-instance v1, Landroidx/fragment/app/m;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Le/i;I)V

    .line 38
    .line 39
    .line 40
    const-string v2, "android:support:fragments"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, LM/d;->f(Ljava/lang/String;LM/c;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroidx/fragment/app/n;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/n;-><init>(Le/i;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroidx/activity/g;->f(La/b;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/activity/g;->f:LM/e;

    .line 55
    .line 56
    iget-object v0, v0, LM/e;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LM/d;

    .line 59
    .line 60
    new-instance v1, Landroidx/fragment/app/m;

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Le/i;I)V

    .line 64
    .line 65
    .line 66
    const-string v2, "androidx:appcompat"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v1}, LM/d;->f(Ljava/lang/String;LM/c;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Landroidx/fragment/app/n;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/n;-><init>(Le/i;I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroidx/activity/g;->f(La/b;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static l(Landroidx/fragment/app/z;)Z
    .locals 5

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {p0}, LC/h;->q()Ljava/util/List;

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
    check-cast v1, Landroidx/fragment/app/l;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

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
    iget-object v2, v2, Landroidx/fragment/app/o;->h:Le/i;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/l;->e()Landroidx/fragment/app/z;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Le/i;->l(Landroidx/fragment/app/z;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 47
    .line 48
    sget-object v3, Landroidx/lifecycle/n;->d:Landroidx/lifecycle/n;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Landroidx/fragment/app/H;->e()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v2, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ltz v2, :cond_4

    .line 65
    .line 66
    iget-object v0, v1, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/lifecycle/u;->g()V

    .line 71
    .line 72
    .line 73
    move v0, v4

    .line 74
    :cond_4
    iget-object v2, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 75
    .line 76
    iget-object v2, v2, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 77
    .line 78
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-ltz v2, :cond_0

    .line 83
    .line 84
    iget-object v0, v1, Landroidx/fragment/app/l;->M:Landroidx/lifecycle/u;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/lifecycle/u;->g()V

    .line 87
    .line 88
    .line 89
    move v0, v4

    .line 90
    goto :goto_0

    .line 91
    :cond_5
    return v0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/i;->k()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    invoke-virtual {v0}, Le/u;->u()V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Le/u;->u:Landroid/view/ViewGroup;

    .line 14
    .line 15
    const v2, 0x1020002

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, v0, Le/u;->g:Le/p;

    .line 28
    .line 29
    iget-object p2, v0, Le/u;->f:Landroid/view/Window;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Le/p;->a(Landroid/view/Window$Callback;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, v0, Le/u;->I:Z

    .line 9
    .line 10
    iget v2, v0, Le/u;->M:I

    .line 11
    .line 12
    const/16 v3, -0x64

    .line 13
    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    invoke-virtual {v0, p1, v2}, Le/u;->A(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-boolean v2, Le/u;->c0:Z

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    instance-of v2, p1, Landroid/view/ContextThemeWrapper;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-static {p1, v0, v4, v3}, Le/u;->r(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :try_start_0
    move-object v5, p1

    .line 37
    check-cast v5, Landroid/view/ContextThemeWrapper;

    .line 38
    .line 39
    invoke-virtual {v5, v2}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto/16 :goto_7

    .line 43
    .line 44
    :catch_0
    :cond_1
    instance-of v2, p1, Lg/d;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-static {p1, v0, v4, v3}, Le/u;->r(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :try_start_1
    move-object v3, p1

    .line 53
    check-cast v3, Lg/d;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Lg/d;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 56
    .line 57
    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :catch_1
    :cond_2
    sget-boolean v2, Le/u;->b0:Z

    .line 61
    .line 62
    if-nez v2, :cond_3

    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    new-instance v3, Landroid/content/res/Configuration;

    .line 69
    .line 70
    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    .line 71
    .line 72
    .line 73
    const/4 v5, -0x1

    .line 74
    iput v5, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 75
    .line 76
    const/4 v5, 0x0

    .line 77
    iput v5, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 78
    .line 79
    invoke-virtual {p1, v3}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 100
    .line 101
    iput v7, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 102
    .line 103
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-nez v7, :cond_1a

    .line 108
    .line 109
    new-instance v7, Landroid/content/res/Configuration;

    .line 110
    .line 111
    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    .line 112
    .line 113
    .line 114
    iput v5, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 115
    .line 116
    invoke-virtual {v3, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_4

    .line 121
    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_4
    iget v5, v3, Landroid/content/res/Configuration;->fontScale:F

    .line 125
    .line 126
    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    .line 127
    .line 128
    cmpl-float v5, v5, v8

    .line 129
    .line 130
    if-eqz v5, :cond_5

    .line 131
    .line 132
    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    .line 133
    .line 134
    :cond_5
    iget v5, v3, Landroid/content/res/Configuration;->mcc:I

    .line 135
    .line 136
    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    .line 137
    .line 138
    if-eq v5, v8, :cond_6

    .line 139
    .line 140
    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    .line 141
    .line 142
    :cond_6
    iget v5, v3, Landroid/content/res/Configuration;->mnc:I

    .line 143
    .line 144
    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    .line 145
    .line 146
    if-eq v5, v8, :cond_7

    .line 147
    .line 148
    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    .line 149
    .line 150
    :cond_7
    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v6}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    invoke-virtual {v5, v8}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    if-nez v5, :cond_8

    .line 163
    .line 164
    invoke-virtual {v7, v8}, Landroid/content/res/Configuration;->setLocales(Landroid/os/LocaleList;)V

    .line 165
    .line 166
    .line 167
    iget-object v5, v6, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 168
    .line 169
    iput-object v5, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 170
    .line 171
    :cond_8
    iget v5, v3, Landroid/content/res/Configuration;->touchscreen:I

    .line 172
    .line 173
    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    .line 174
    .line 175
    if-eq v5, v8, :cond_9

    .line 176
    .line 177
    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    .line 178
    .line 179
    :cond_9
    iget v5, v3, Landroid/content/res/Configuration;->keyboard:I

    .line 180
    .line 181
    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    .line 182
    .line 183
    if-eq v5, v8, :cond_a

    .line 184
    .line 185
    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    .line 186
    .line 187
    :cond_a
    iget v5, v3, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 188
    .line 189
    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 190
    .line 191
    if-eq v5, v8, :cond_b

    .line 192
    .line 193
    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    .line 194
    .line 195
    :cond_b
    iget v5, v3, Landroid/content/res/Configuration;->navigation:I

    .line 196
    .line 197
    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    .line 198
    .line 199
    if-eq v5, v8, :cond_c

    .line 200
    .line 201
    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    .line 202
    .line 203
    :cond_c
    iget v5, v3, Landroid/content/res/Configuration;->navigationHidden:I

    .line 204
    .line 205
    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    .line 206
    .line 207
    if-eq v5, v8, :cond_d

    .line 208
    .line 209
    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    .line 210
    .line 211
    :cond_d
    iget v5, v3, Landroid/content/res/Configuration;->orientation:I

    .line 212
    .line 213
    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    .line 214
    .line 215
    if-eq v5, v8, :cond_e

    .line 216
    .line 217
    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    .line 218
    .line 219
    :cond_e
    iget v5, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 220
    .line 221
    and-int/lit8 v5, v5, 0xf

    .line 222
    .line 223
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 224
    .line 225
    and-int/lit8 v8, v8, 0xf

    .line 226
    .line 227
    if-eq v5, v8, :cond_f

    .line 228
    .line 229
    iget v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 230
    .line 231
    or-int/2addr v5, v8

    .line 232
    iput v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 233
    .line 234
    :cond_f
    iget v5, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 235
    .line 236
    and-int/lit16 v5, v5, 0xc0

    .line 237
    .line 238
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 239
    .line 240
    and-int/lit16 v8, v8, 0xc0

    .line 241
    .line 242
    if-eq v5, v8, :cond_10

    .line 243
    .line 244
    iget v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 245
    .line 246
    or-int/2addr v5, v8

    .line 247
    iput v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 248
    .line 249
    :cond_10
    iget v5, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 250
    .line 251
    and-int/lit8 v5, v5, 0x30

    .line 252
    .line 253
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 254
    .line 255
    and-int/lit8 v8, v8, 0x30

    .line 256
    .line 257
    if-eq v5, v8, :cond_11

    .line 258
    .line 259
    iget v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 260
    .line 261
    or-int/2addr v5, v8

    .line 262
    iput v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 263
    .line 264
    :cond_11
    iget v5, v3, Landroid/content/res/Configuration;->screenLayout:I

    .line 265
    .line 266
    and-int/lit16 v5, v5, 0x300

    .line 267
    .line 268
    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    .line 269
    .line 270
    and-int/lit16 v8, v8, 0x300

    .line 271
    .line 272
    if-eq v5, v8, :cond_12

    .line 273
    .line 274
    iget v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 275
    .line 276
    or-int/2addr v5, v8

    .line 277
    iput v5, v7, Landroid/content/res/Configuration;->screenLayout:I

    .line 278
    .line 279
    :cond_12
    const/16 v5, 0x1a

    .line 280
    .line 281
    if-lt v2, v5, :cond_14

    .line 282
    .line 283
    invoke-static {v3}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    and-int/lit8 v5, v5, 0x3

    .line 288
    .line 289
    invoke-static {v6}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    and-int/lit8 v8, v8, 0x3

    .line 294
    .line 295
    if-eq v5, v8, :cond_13

    .line 296
    .line 297
    invoke-static {v7}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    invoke-static {v6}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    and-int/lit8 v8, v8, 0x3

    .line 306
    .line 307
    or-int/2addr v5, v8

    .line 308
    invoke-static {v7, v5}, Le/o;->d(Landroid/content/res/Configuration;I)V

    .line 309
    .line 310
    .line 311
    :cond_13
    invoke-static {v3}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    and-int/lit8 v5, v5, 0xc

    .line 316
    .line 317
    invoke-static {v6}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    and-int/lit8 v8, v8, 0xc

    .line 322
    .line 323
    if-eq v5, v8, :cond_14

    .line 324
    .line 325
    invoke-static {v7}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    invoke-static {v6}, Le/o;->a(Landroid/content/res/Configuration;)I

    .line 330
    .line 331
    .line 332
    move-result v8

    .line 333
    and-int/lit8 v8, v8, 0xc

    .line 334
    .line 335
    or-int/2addr v5, v8

    .line 336
    invoke-static {v7, v5}, Le/o;->d(Landroid/content/res/Configuration;I)V

    .line 337
    .line 338
    .line 339
    :cond_14
    iget v5, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 340
    .line 341
    and-int/lit8 v5, v5, 0xf

    .line 342
    .line 343
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 344
    .line 345
    and-int/lit8 v8, v8, 0xf

    .line 346
    .line 347
    if-eq v5, v8, :cond_15

    .line 348
    .line 349
    iget v5, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 350
    .line 351
    or-int/2addr v5, v8

    .line 352
    iput v5, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 353
    .line 354
    :cond_15
    iget v5, v3, Landroid/content/res/Configuration;->uiMode:I

    .line 355
    .line 356
    and-int/lit8 v5, v5, 0x30

    .line 357
    .line 358
    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    .line 359
    .line 360
    and-int/lit8 v8, v8, 0x30

    .line 361
    .line 362
    if-eq v5, v8, :cond_16

    .line 363
    .line 364
    iget v5, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 365
    .line 366
    or-int/2addr v5, v8

    .line 367
    iput v5, v7, Landroid/content/res/Configuration;->uiMode:I

    .line 368
    .line 369
    :cond_16
    iget v5, v3, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 370
    .line 371
    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 372
    .line 373
    if-eq v5, v8, :cond_17

    .line 374
    .line 375
    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 376
    .line 377
    :cond_17
    iget v5, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 378
    .line 379
    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 380
    .line 381
    if-eq v5, v8, :cond_18

    .line 382
    .line 383
    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 384
    .line 385
    :cond_18
    iget v5, v3, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 386
    .line 387
    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 388
    .line 389
    if-eq v5, v8, :cond_19

    .line 390
    .line 391
    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 392
    .line 393
    :cond_19
    iget v3, v3, Landroid/content/res/Configuration;->densityDpi:I

    .line 394
    .line 395
    iget v5, v6, Landroid/content/res/Configuration;->densityDpi:I

    .line 396
    .line 397
    if-eq v3, v5, :cond_1b

    .line 398
    .line 399
    iput v5, v7, Landroid/content/res/Configuration;->densityDpi:I

    .line 400
    .line 401
    goto :goto_1

    .line 402
    :cond_1a
    move-object v7, v4

    .line 403
    :cond_1b
    :goto_1
    invoke-static {p1, v0, v7, v1}, Le/u;->r(Landroid/content/Context;ILandroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    new-instance v3, Lg/d;

    .line 408
    .line 409
    const v5, 0x7f100101

    .line 410
    .line 411
    .line 412
    invoke-direct {v3, p1, v5}, Lg/d;-><init>(Landroid/content/Context;I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3, v0}, Lg/d;->a(Landroid/content/res/Configuration;)V

    .line 416
    .line 417
    .line 418
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 419
    .line 420
    .line 421
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_5

    .line 422
    if-eqz p1, :cond_1f

    .line 423
    .line 424
    invoke-virtual {v3}, Lg/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    const/16 v0, 0x1d

    .line 429
    .line 430
    if-lt v2, v0, :cond_1c

    .line 431
    .line 432
    invoke-static {p1}, Lq/l;->a(Landroid/content/res/Resources$Theme;)V

    .line 433
    .line 434
    .line 435
    goto :goto_6

    .line 436
    :cond_1c
    sget-object v0, Lq/b;->e:Ljava/lang/Object;

    .line 437
    .line 438
    monitor-enter v0

    .line 439
    :try_start_3
    sget-boolean v2, Lq/b;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 440
    .line 441
    if-nez v2, :cond_1d

    .line 442
    .line 443
    :try_start_4
    const-class v2, Landroid/content/res/Resources$Theme;

    .line 444
    .line 445
    const-string v5, "rebase"

    .line 446
    .line 447
    invoke-virtual {v2, v5, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    sput-object v2, Lq/b;->f:Ljava/lang/reflect/Method;

    .line 452
    .line 453
    invoke-virtual {v2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 454
    .line 455
    .line 456
    goto :goto_2

    .line 457
    :catchall_0
    move-exception p1

    .line 458
    goto :goto_5

    .line 459
    :catch_2
    move-exception v2

    .line 460
    :try_start_5
    const-string v5, "ResourcesCompat"

    .line 461
    .line 462
    const-string v6, "Failed to retrieve rebase() method"

    .line 463
    .line 464
    invoke-static {v5, v6, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 465
    .line 466
    .line 467
    :goto_2
    sput-boolean v1, Lq/b;->g:Z

    .line 468
    .line 469
    :cond_1d
    sget-object v1, Lq/b;->f:Ljava/lang/reflect/Method;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 470
    .line 471
    if-eqz v1, :cond_1e

    .line 472
    .line 473
    :try_start_6
    invoke-virtual {v1, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 474
    .line 475
    .line 476
    goto :goto_4

    .line 477
    :catch_3
    move-exception p1

    .line 478
    goto :goto_3

    .line 479
    :catch_4
    move-exception p1

    .line 480
    :goto_3
    :try_start_7
    const-string v1, "ResourcesCompat"

    .line 481
    .line 482
    const-string v2, "Failed to invoke rebase() method via reflection"

    .line 483
    .line 484
    invoke-static {v1, v2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 485
    .line 486
    .line 487
    sput-object v4, Lq/b;->f:Ljava/lang/reflect/Method;

    .line 488
    .line 489
    :cond_1e
    :goto_4
    monitor-exit v0

    .line 490
    goto :goto_6

    .line 491
    :goto_5
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 492
    throw p1

    .line 493
    :catch_5
    :cond_1f
    :goto_6
    move-object p1, v3

    .line 494
    :goto_7
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 495
    .line 496
    .line 497
    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/i;->j()Le/E;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->j()Le/E;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroidx/activity/g;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4

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
    iget-boolean v1, p0, Le/i;->r:Z

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
    iget-boolean v1, p0, Le/i;->s:Z

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
    iget-boolean v1, p0, Le/i;->t:Z

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
    if-eqz v1, :cond_2

    .line 83
    .line 84
    invoke-interface {p0}, Landroidx/lifecycle/Q;->getViewModelStore()Landroidx/lifecycle/P;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, LC/h;

    .line 89
    .line 90
    sget-object v3, LK/a;->e:LG/d;

    .line 91
    .line 92
    invoke-direct {v2, v1, v3}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 93
    .line 94
    .line 95
    const-class v1, LK/a;

    .line 96
    .line 97
    invoke-virtual {v2, v1}, LC/h;->i(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, LK/a;

    .line 102
    .line 103
    iget-object v1, v1, LK/a;->d:Ll/l;

    .line 104
    .line 105
    iget v2, v1, Ll/l;->c:I

    .line 106
    .line 107
    if-lez v2, :cond_2

    .line 108
    .line 109
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v2, "Loaders:"

    .line 113
    .line 114
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget v2, v1, Ll/l;->c:I

    .line 118
    .line 119
    if-gtz v2, :cond_0

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    iget-object p1, v1, Ll/l;->b:[Ljava/lang/Object;

    .line 123
    .line 124
    const/4 p2, 0x0

    .line 125
    aget-object p1, p1, p2

    .line 126
    .line 127
    if-nez p1, :cond_1

    .line 128
    .line 129
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string p1, "  #"

    .line 133
    .line 134
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, v1, Ll/l;->a:[I

    .line 138
    .line 139
    aget p1, p1, p2

    .line 140
    .line 141
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 142
    .line 143
    .line 144
    const-string p1, ": "

    .line 145
    .line 146
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    const/4 p1, 0x0

    .line 150
    throw p1

    .line 151
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 152
    .line 153
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 154
    .line 155
    .line 156
    throw p1

    .line 157
    :cond_2
    :goto_0
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 158
    .line 159
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, Landroidx/fragment/app/o;

    .line 162
    .line 163
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 164
    .line 165
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/z;->t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    invoke-virtual {v0}, Le/u;->u()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Le/u;->f:Landroid/view/Window;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    iget-object v1, v0, Le/u;->j:Lg/i;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Le/u;->y()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lg/i;

    .line 15
    .line 16
    iget-object v2, v0, Le/u;->i:Le/E;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Le/E;->R()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v2, v0, Le/u;->e:Landroid/content/Context;

    .line 26
    .line 27
    :goto_0
    invoke-direct {v1, v2}, Lg/i;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, v0, Le/u;->j:Lg/i;

    .line 31
    .line 32
    :cond_1
    iget-object v0, v0, Le/u;->j:Lg/i;

    .line 33
    .line 34
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    .line 1
    sget v0, Li/r1;->a:I

    .line 2
    .line 3
    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Le/k;
    .locals 2

    .line 1
    iget-object v0, p0, Le/i;->u:Le/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Le/k;->b:Ll/c;

    .line 6
    .line 7
    new-instance v0, Le/u;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1, p0, p0}, Le/u;-><init>(Landroid/content/Context;Landroid/view/Window;Le/j;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le/i;->u:Le/u;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Le/i;->u:Le/u;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Le/k;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j()Le/E;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Le/u;

    .line 6
    .line 7
    invoke-virtual {v0}, Le/u;->y()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Le/u;->i:Le/E;

    .line 11
    .line 12
    return-object v0
.end method

.method public final k()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "<this>"

    .line 10
    .line 11
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v2, 0x7f0900bf

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v2, 0x7f0900c2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0, v1}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const v1, 0x7f0900c1

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final m(Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/g;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, v0, LC/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/o;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/fragment/app/z;->h()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 5
    .line 6
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/o;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/z;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/g;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

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
    iget-object p2, p0, Le/i;->p:LC/j;

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
    iget-object p1, p2, LC/j;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Landroidx/fragment/app/o;

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/fragment/app/z;->i()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_2
    iget-object p1, p2, LC/j;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Landroidx/fragment/app/o;

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroidx/fragment/app/z;->n()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/g;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Le/i;->m(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    iget-boolean v1, v0, Le/u;->z:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-boolean v1, v0, Le/u;->t:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Le/u;->y()V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Le/u;->i:Le/E;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Le/E;->p:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/high16 v3, 0x7f050000

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Le/E;->U(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-static {}, Li/u;->a()Li/u;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, v0, Le/u;->e:Landroid/content/Context;

    .line 45
    .line 46
    monitor-enter v1

    .line 47
    :try_start_0
    iget-object v3, v1, Li/u;->a:Li/N0;

    .line 48
    .line 49
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    :try_start_1
    iget-object v4, v3, Li/N0;->b:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ll/e;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    iget v5, v2, Ll/e;->d:I

    .line 62
    .line 63
    iget-object v6, v2, Ll/e;->c:[Ljava/lang/Object;

    .line 64
    .line 65
    move v7, v4

    .line 66
    :goto_0
    if-ge v7, v5, :cond_1

    .line 67
    .line 68
    const/4 v8, 0x0

    .line 69
    aput-object v8, v6, v7

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iput v4, v2, Ll/e;->d:I

    .line 75
    .line 76
    iput-boolean v4, v2, Ll/e;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    :cond_2
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 79
    monitor-exit v1

    .line 80
    new-instance v1, Landroid/content/res/Configuration;

    .line 81
    .line 82
    iget-object v2, v0, Le/u;->e:Landroid/content/Context;

    .line 83
    .line 84
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Le/u;->L:Landroid/content/res/Configuration;

    .line 96
    .line 97
    invoke-virtual {v0, v4}, Le/u;->m(Z)Z

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Le/u;->e:Landroid/content/Context;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1, v0}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :catchall_0
    move-exception p1

    .line 115
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 116
    :try_start_4
    throw p1

    .line 117
    :catchall_1
    move-exception p1

    .line 118
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 119
    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/g;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Le/i;->p:LC/j;

    .line 12
    .line 13
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroidx/fragment/app/o;

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Landroidx/fragment/app/z;->y:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Landroidx/fragment/app/z;->z:Z

    .line 23
    .line 24
    iget-object v1, p1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 25
    .line 26
    iput-boolean v0, v1, Landroidx/fragment/app/B;->i:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/fragment/app/z;->s(I)V

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
    invoke-super {p0, p1, p2}, Landroidx/activity/g;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Le/i;->getMenuInflater()Landroid/view/MenuInflater;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Le/i;->p:LC/j;

    .line 11
    .line 12
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Landroidx/fragment/app/o;

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/fragment/app/z;->j()Z

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/g;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 23
    .line 24
    .line 25
    return v0
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o;

    .line 2
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    iget-object v0, v0, Landroidx/fragment/app/z;->f:Landroidx/fragment/app/s;

    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/s;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 5
    iget-object v0, p0, Le/i;->p:LC/j;

    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o;

    .line 6
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    iget-object v0, v0, Landroidx/fragment/app/z;->f:Landroidx/fragment/app/s;

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/fragment/app/s;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/i;->n()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Le/k;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1
.end method

.method public final onLowMemory()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 5
    .line 6
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/o;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/z;->l()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Le/i;->o(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Le/i;->j()Le/E;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    const v1, 0x102002c

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-ne p2, v1, :cond_7

    .line 23
    .line 24
    if-eqz p1, :cond_7

    .line 25
    .line 26
    iget-object p1, p1, Le/E;->t:Li/o0;

    .line 27
    .line 28
    check-cast p1, Li/m1;

    .line 29
    .line 30
    iget p1, p1, Li/m1;->b:I

    .line 31
    .line 32
    and-int/lit8 p1, p1, 0x4

    .line 33
    .line 34
    if-eqz p1, :cond_7

    .line 35
    .line 36
    invoke-static {p0}, Lb1/h;->z(Le/i;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_7

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-eqz p2, :cond_6

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lb1/h;->z(Le/i;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-nez p2, :cond_1

    .line 58
    .line 59
    invoke-static {p0}, Lb1/h;->z(Le/i;)Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    :cond_1
    if-eqz p2, :cond_4

    .line 64
    .line 65
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    :try_start_0
    invoke-static {p0, v1}, Lb1/h;->A(Le/i;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :goto_0
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {p0, v1}, Lb1/h;->A(Le/i;Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 97
    .line 98
    .line 99
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 101
    :catch_0
    move-exception p1

    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :goto_1
    const-string p2, "TaskStackBuilder"

    .line 108
    .line 109
    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    .line 110
    .line 111
    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw p2

    .line 120
    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_5

    .line 125
    .line 126
    new-array p2, v2, [Landroid/content/Intent;

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, [Landroid/content/Intent;

    .line 133
    .line 134
    new-instance p2, Landroid/content/Intent;

    .line 135
    .line 136
    aget-object v1, p1, v2

    .line 137
    .line 138
    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 139
    .line 140
    .line 141
    const v1, 0x1000c000

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    aput-object p2, p1, v2

    .line 149
    .line 150
    const/4 p2, 0x0

    .line 151
    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 152
    .line 153
    .line 154
    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 159
    .line 160
    .line 161
    :goto_3
    return v0

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    .line 165
    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    .line 171
    .line 172
    .line 173
    return v0

    .line 174
    :cond_7
    return v2
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/fragment/app/o;

    .line 6
    .line 7
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/fragment/app/z;->m()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/activity/g;->onNewIntent(Landroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/i;->p(ILandroid/view/Menu;)V

    .line 2
    .line 3
    .line 4
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
    iput-boolean v0, p0, Le/i;->s:Z

    .line 6
    .line 7
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 8
    .line 9
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/fragment/app/o;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->s(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 20
    .line 21
    sget-object v1, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/fragment/app/o;

    .line 6
    .line 7
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/fragment/app/z;->q()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Le/u;

    .line 9
    .line 10
    invoke-virtual {p1}, Le/u;->u()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final onPostResume()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/i;->q()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    invoke-virtual {v0}, Le/u;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Le/u;->i:Le/E;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Le/E;->J:Z

    .line 19
    .line 20
    :cond_0
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
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/g;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Le/i;->p:LC/j;

    .line 9
    .line 10
    iget-object p1, p1, LC/j;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Landroidx/fragment/app/o;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/z;->r()Z

    .line 17
    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/g;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 21
    .line 22
    .line 23
    return v0
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/g;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Le/i;->s:Z

    .line 11
    .line 12
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/fragment/app/o;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->v(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/i;->r()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Le/u;->m(Z)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/i;->s()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    invoke-virtual {v0}, Le/u;->y()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Le/u;->i:Le/E;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Le/E;->J:Z

    .line 19
    .line 20
    iget-object v0, v0, Le/E;->I:Lg/k;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Lg/k;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2, p1}, Le/k;->l(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final openOptionsMenu()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/i;->j()Le/E;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/Window;->hasFeature(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final p(ILandroid/view/Menu;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 4
    .line 5
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/fragment/app/o;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/z;->o()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/activity/g;->onPanelClosed(ILandroid/view/Menu;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final q()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 12
    .line 13
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/fragment/app/o;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Landroidx/fragment/app/z;->y:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Landroidx/fragment/app/z;->z:Z

    .line 23
    .line 24
    iget-object v2, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 25
    .line 26
    iput-boolean v1, v2, Landroidx/fragment/app/B;->i:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->s(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final r()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/i;->p:LC/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/j;->x()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-boolean v1, p0, Le/i;->t:Z

    .line 11
    .line 12
    iget-boolean v2, p0, Le/i;->r:Z

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/fragment/app/o;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Le/i;->r:Z

    .line 22
    .line 23
    iget-object v2, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 24
    .line 25
    iput-boolean v1, v2, Landroidx/fragment/app/z;->y:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Landroidx/fragment/app/z;->z:Z

    .line 28
    .line 29
    iget-object v4, v2, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 30
    .line 31
    iput-boolean v1, v4, Landroidx/fragment/app/B;->i:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Landroidx/fragment/app/z;->s(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroidx/fragment/app/z;->v(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 50
    .line 51
    iput-boolean v1, v0, Landroidx/fragment/app/z;->y:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Landroidx/fragment/app/z;->z:Z

    .line 54
    .line 55
    iget-object v2, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 56
    .line 57
    iput-boolean v1, v2, Landroidx/fragment/app/B;->i:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, Landroidx/fragment/app/z;->s(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Le/i;->t:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Le/i;->p:LC/j;

    .line 8
    .line 9
    iget-object v2, v1, LC/j;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/fragment/app/o;

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 14
    .line 15
    invoke-static {v2}, Le/i;->l(Landroidx/fragment/app/z;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, LC/j;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/fragment/app/o;

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/z;->z:Z

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 30
    .line 31
    iput-boolean v0, v2, Landroidx/fragment/app/B;->i:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Landroidx/fragment/app/z;->s(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Le/i;->q:Landroidx/lifecycle/u;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->d(Landroidx/lifecycle/m;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/i;->k()V

    .line 2
    invoke-virtual {p0}, Le/i;->i()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k;->i(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/i;->k()V

    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Le/k;->j(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Le/i;->k()V

    .line 6
    invoke-virtual {p0}, Le/i;->i()Le/k;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Le/k;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/i;->i()Le/k;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Le/u;

    .line 9
    .line 10
    iput p1, v0, Le/u;->N:I

    .line 11
    .line 12
    return-void
.end method
