.class public final Lcom/lu/wxmask/ui/MainActivity;
.super Le/i;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public v:Lcom/lu/magic/ui/FragmentNavigation;

.field public w:LH/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/i;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/ui/MainActivity;->v:Lcom/lu/magic/ui/FragmentNavigation;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v1, v0, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    if-ltz v1, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/lu/magic/ui/FragmentNavigation;->c:Ljava/util/Stack;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-lt v1, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v2, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroidx/fragment/app/l;

    .line 25
    .line 26
    const-string v2, "frag"

    .line 27
    .line 28
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lcom/lu/magic/ui/FragmentNavigation;->d(Landroidx/fragment/app/l;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/activity/g;->onBackPressed()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string v0, "fragmentNavigation"

    .line 40
    .line 41
    invoke-static {v0}, LN0/g;->g(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    throw v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Le/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f0c0021

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {p1, v0, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const v0, 0x7f090069

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v0}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Landroid/widget/FrameLayout;

    .line 25
    .line 26
    if-eqz v1, :cond_6

    .line 27
    .line 28
    new-instance v0, LH/a;

    .line 29
    .line 30
    check-cast p1, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v0, p1, v1, v3}, LH/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lcom/lu/wxmask/ui/MainActivity;->w:LH/a;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Le/i;->setContentView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Lcom/lu/magic/ui/FragmentNavigation;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/lu/wxmask/ui/MainActivity;->w:LH/a;

    .line 44
    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    iget-object v0, v0, LH/a;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Ljava/util/Stack;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p1, Lcom/lu/magic/ui/FragmentNavigation;->c:Ljava/util/Stack;

    .line 60
    .line 61
    const/4 v1, -0x1

    .line 62
    iput v1, p1, Lcom/lu/magic/ui/FragmentNavigation;->d:I

    .line 63
    .line 64
    iget-object v1, p0, Le/i;->p:LC/j;

    .line 65
    .line 66
    iget-object v1, v1, LC/j;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Landroidx/fragment/app/o;

    .line 69
    .line 70
    const-string v3, "activity.supportFragmentManager"

    .line 71
    .line 72
    iget-object v1, v1, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/z;

    .line 73
    .line 74
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p1, Lcom/lu/magic/ui/FragmentNavigation;->b:Landroidx/fragment/app/z;

    .line 78
    .line 79
    iput-object v0, p1, Lcom/lu/magic/ui/FragmentNavigation;->a:Landroid/view/ViewGroup;

    .line 80
    .line 81
    iget-object v0, p0, Landroidx/activity/g;->e:Landroidx/lifecycle/u;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lcom/lu/wxmask/ui/MainActivity;->v:Lcom/lu/magic/ui/FragmentNavigation;

    .line 87
    .line 88
    const-class v0, Lv0/c;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Class;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v3, "fragClass.toString()"

    .line 95
    .line 96
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v3, p1, Lcom/lu/magic/ui/FragmentNavigation;->b:Landroidx/fragment/app/z;

    .line 100
    .line 101
    if-eqz v3, :cond_4

    .line 102
    .line 103
    invoke-virtual {v3, v1}, Landroidx/fragment/app/z;->z(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-nez v1, :cond_0

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    move-object v1, v0

    .line 114
    check-cast v1, Landroidx/fragment/app/l;

    .line 115
    .line 116
    :cond_0
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v1}, Lcom/lu/magic/ui/FragmentNavigation;->d(Landroidx/fragment/app/l;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, LC/h;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroidx/activity/g;->getViewModelStore()Landroidx/lifecycle/P;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object v1, p0, Landroidx/activity/g;->h:Landroidx/lifecycle/J;

    .line 129
    .line 130
    if-nez v1, :cond_2

    .line 131
    .line 132
    new-instance v1, Landroidx/lifecycle/J;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_1

    .line 143
    .line 144
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    :cond_1
    invoke-direct {v1, v3, p0, v2}, Landroidx/lifecycle/J;-><init>(Landroid/app/Application;LM/f;Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    iput-object v1, p0, Landroidx/activity/g;->h:Landroidx/lifecycle/J;

    .line 156
    .line 157
    :cond_2
    iget-object v1, p0, Landroidx/activity/g;->h:Landroidx/lifecycle/J;

    .line 158
    .line 159
    invoke-interface {p0}, Landroidx/lifecycle/i;->a()LJ/b;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-direct {p1, v0, v1, v2}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;LJ/b;)V

    .line 164
    .line 165
    .line 166
    const-class v0, Lx0/b;

    .line 167
    .line 168
    invoke-virtual {p1, v0}, LC/h;->i(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p1, Lx0/b;

    .line 173
    .line 174
    iget-boolean v0, p1, Lx0/b;->d:Z

    .line 175
    .line 176
    if-eqz v0, :cond_3

    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_3
    const/4 v0, 0x1

    .line 180
    iput-boolean v0, p1, Lx0/b;->d:Z

    .line 181
    .line 182
    sget-object v1, Lz0/d;->a:Lz0/c;

    .line 183
    .line 184
    new-instance v2, Lo0/b;

    .line 185
    .line 186
    const/16 v3, 0x9

    .line 187
    .line 188
    invoke-direct {v2, p1, p0, v3}, Lo0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 189
    .line 190
    .line 191
    new-instance p1, LC/d;

    .line 192
    .line 193
    const/16 v3, 0xe

    .line 194
    .line 195
    invoke-direct {p1, v3, v2}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v0, p1}, Lz0/c;->h(ZLM0/l;)V

    .line 199
    .line 200
    .line 201
    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p0, p1}, Lcom/lu/wxmask/ui/MainActivity;->t(Landroid/content/Intent;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_4
    const-string p1, "supportFragmentManager"

    .line 210
    .line 211
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v2

    .line 215
    :cond_5
    const-string p1, "binding"

    .line 216
    .line 217
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    throw v2

    .line 221
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    new-instance v0, Ljava/lang/NullPointerException;

    .line 230
    .line 231
    const-string v1, "Missing required view with ID: "

    .line 232
    .line 233
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x1

    .line 5
    const-string v0, "menu"

    .line 6
    .line 7
    invoke-static {v1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Landroid/app/Activity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const-string v5, "res/raw/menu_ui.json"

    .line 20
    .line 21
    invoke-direct {v0, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-array v4, v3, [Ljava/lang/reflect/Type;

    .line 25
    .line 26
    const-class v5, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;

    .line 27
    .line 28
    aput-object v5, v4, v2

    .line 29
    .line 30
    sget-object v5, Lg0/a;->a:LT/l;

    .line 31
    .line 32
    const-class v5, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    array-length v7, v6

    .line 39
    if-ne v3, v7, :cond_6

    .line 40
    .line 41
    move v8, v2

    .line 42
    :goto_0
    if-ge v8, v7, :cond_2

    .line 43
    .line 44
    aget-object v9, v4, v8

    .line 45
    .line 46
    invoke-static {v9}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    aget-object v11, v6, v8

    .line 51
    .line 52
    invoke-interface {v11}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 53
    .line 54
    .line 55
    move-result-object v12

    .line 56
    array-length v13, v12

    .line 57
    move v14, v2

    .line 58
    :goto_1
    if-ge v14, v13, :cond_1

    .line 59
    .line 60
    aget-object v15, v12, v14

    .line 61
    .line 62
    invoke-static {v15}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v15

    .line 66
    invoke-virtual {v15, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    if-eqz v15, :cond_0

    .line 71
    .line 72
    add-int/2addr v14, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "Type argument "

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v2, " does not satisfy bounds for type variable "

    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v2, " declared by "

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v0

    .line 110
    :cond_1
    add-int/2addr v8, v3

    .line 111
    goto :goto_0

    .line 112
    :cond_2
    new-instance v6, LV/b;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    invoke-direct {v6, v7, v5, v4}, LV/b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v6}, LV/d;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {v4}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 126
    .line 127
    .line 128
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_3

    .line 133
    .line 134
    sget-object v5, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 135
    .line 136
    invoke-static {v0, v5}, LD/h;->O(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    sget-object v5, Lg0/a;->a:LT/l;

    .line 141
    .line 142
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance v6, La0/a;

    .line 146
    .line 147
    invoke-direct {v6, v4}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v5, v0, v6}, LT/l;->c(Ljava/lang/String;La0/a;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ljava/util/ArrayList;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 162
    .line 163
    .line 164
    invoke-static/range {p0 .. p0}, Lv0/b;->a(Lcom/lu/wxmask/ui/MainActivity;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-static {v0, v5}, LD/h;->X(Ljava/io/File;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    sget-object v0, Lg0/a;->a:LT/l;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v6, La0/a;

    .line 177
    .line 178
    invoke-direct {v6, v4}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v5, v6}, LT/l;->c(Ljava/lang/String;La0/a;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catch_0
    invoke-static/range {p0 .. p0}, Lv0/b;->a(Lcom/lu/wxmask/ui/MainActivity;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sget-object v5, Lg0/a;->a:LT/l;

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance v6, La0/a;

    .line 198
    .line 199
    invoke-direct {v6, v4}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v0, v6}, LT/l;->c(Ljava/lang/String;La0/a;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/util/ArrayList;

    .line 207
    .line 208
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const-string v0, "iterator(...)"

    .line 213
    .line 214
    invoke-static {v4, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v5, "next(...)"

    .line 228
    .line 229
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    move-object v5, v0

    .line 233
    check-cast v5, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;

    .line 234
    .line 235
    :try_start_1
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v0, v6, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 256
    .line 257
    goto :goto_4

    .line 258
    :catch_1
    move-exception v0

    .line 259
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Li0/a;->b([Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    const/4 v0, -0x1

    .line 267
    :goto_4
    invoke-virtual {v5}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getSince()I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-ge v0, v6, :cond_4

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_4
    invoke-virtual {v5}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getGroupId()I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    invoke-virtual {v5}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getItemId()I

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    invoke-virtual {v5}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getOrder()I

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    invoke-virtual {v5}, Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;->getTitle()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    invoke-interface {v1, v0, v6, v7, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const/16 v6, 0x8

    .line 295
    .line 296
    invoke-interface {v0, v6}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 297
    .line 298
    .line 299
    new-instance v6, Lr0/q0;

    .line 300
    .line 301
    move-object/from16 v8, p0

    .line 302
    .line 303
    invoke-direct {v6, v5, v8}, Lr0/q0;-><init>(Lcom/lu/wxmask/ui/JsonMenuManager$MenuBean;Lcom/lu/wxmask/ui/MainActivity;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v0, v6}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_5
    move-object/from16 v8, p0

    .line 311
    .line 312
    return v3

    .line 313
    :cond_6
    move-object/from16 v8, p0

    .line 314
    .line 315
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 316
    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    const-string v2, " requires "

    .line 330
    .line 331
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    const-string v2, " type arguments, but got 1"

    .line 338
    .line 339
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    throw v0
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Le/i;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/lu/wxmask/ui/MainActivity;->t(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Le/i;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-boolean v0, Lb1/h;->j:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    sget-wide v2, Lb1/h;->k:J

    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide/32 v2, 0x6ddd00

    .line 16
    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Lv0/b;->b(Landroid/content/ContextWrapper;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final t(Landroid/content/Intent;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "from"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-class v1, Lcom/lu/wxmask/ui/DeepLinkActivity;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    iget-object v0, p0, Lcom/lu/wxmask/ui/MainActivity;->w:LH/a;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    new-instance v1, LA0/m;

    .line 34
    .line 35
    const/16 v2, 0xe

    .line 36
    .line 37
    invoke-direct {v1, p0, p1, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v0, LH/a;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Landroid/widget/FrameLayout;

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    const-string p1, "binding"

    .line 49
    .line 50
    invoke-static {p1}, LN0/g;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    throw p1

    .line 55
    :cond_3
    :goto_0
    return-void
.end method
