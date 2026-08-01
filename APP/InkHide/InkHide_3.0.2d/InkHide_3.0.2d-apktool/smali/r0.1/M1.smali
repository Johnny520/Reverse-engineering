.class public final Lr0/M1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z

.field public d:J

.field public e:I

.field public volatile f:Z

.field public g:Ljava/lang/ref/WeakReference;

.field public h:Landroid/graphics/Typeface;

.field public i:Z

.field public final j:Ljava/util/IdentityHashMap;

.field public final k:Landroid/os/Handler;

.field public final l:Lr0/E1;

.field public final m:Lr0/E1;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr0/M1;->j:Ljava/util/IdentityHashMap;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lr0/M1;->k:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Lr0/E1;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Lr0/E1;-><init>(Lr0/M1;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lr0/M1;->l:Lr0/E1;

    .line 29
    .line 30
    new-instance v0, Lr0/E1;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {v0, p0, v1}, Lr0/E1;-><init>(Lr0/M1;I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lr0/M1;->m:Lr0/E1;

    .line 37
    .line 38
    return-void
.end method

.method public static final a(Lr0/M1;Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "chattingTabUI"

    .line 5
    .line 6
    const-string v1, "chattingTabUl"

    .line 7
    .line 8
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, LF0/h;->a0([Ljava/lang/Object;)LT0/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LT0/h;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v1}, Lr0/M1;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    :goto_0
    move-object v1, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string v3, "b"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lr0/M1;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string v3, "e"

    .line 51
    .line 52
    invoke-static {v1, v3}, Lr0/M1;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroid/widget/TextView;

    .line 57
    .line 58
    :goto_1
    if-eqz v1, :cond_0

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    move-object v1, v2

    .line 62
    :goto_2
    if-eqz v1, :cond_5

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    move-object v0, v2

    .line 86
    :goto_3
    const-string v3, "\u5fae\u4fe1"

    .line 87
    .line 88
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 96
    .line 97
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-static {p1, v1, v0}, Lr0/M1;->e(Ljava/lang/Object;ILjava/util/IdentityHashMap;)Landroid/widget/TextView;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :goto_4
    if-nez v1, :cond_6

    .line 106
    .line 107
    return-void

    .line 108
    :cond_6
    iget-object v0, p0, Lr0/M1;->g:Ljava/lang/ref/WeakReference;

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v2, v0

    .line 117
    check-cast v2, Landroid/widget/TextView;

    .line 118
    .line 119
    :cond_7
    if-eq v2, v1, :cond_8

    .line 120
    .line 121
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 122
    .line 123
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Lr0/M1;->g:Ljava/lang/ref/WeakReference;

    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, Lr0/M1;->h:Landroid/graphics/Typeface;

    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    iput-boolean v0, p0, Lr0/M1;->i:Z

    .line 143
    .line 144
    :cond_8
    invoke-virtual {p0, v1}, Lr0/M1;->g(Landroid/widget/TextView;)V

    .line 145
    .line 146
    .line 147
    new-instance v0, Lr0/n1;

    .line 148
    .line 149
    const/16 v2, 0xb

    .line 150
    .line 151
    invoke-direct {v0, v2}, Lr0/n1;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Lr0/F1;

    .line 155
    .line 156
    const/4 v3, 0x0

    .line 157
    invoke-direct {v2, p0, p1, v3}, Lr0/F1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 158
    .line 159
    .line 160
    const/16 v3, 0x320

    .line 161
    .line 162
    invoke-static {v1, v0, v3, v2}, Lz0/r;->A(Landroid/view/View;LM0/a;ILandroid/view/View$OnClickListener;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lr0/M1;->j:Ljava/util/IdentityHashMap;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    if-nez v2, :cond_9

    .line 172
    .line 173
    new-instance v2, Lr0/I1;

    .line 174
    .line 175
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    :cond_9
    check-cast v2, Lr0/I1;

    .line 182
    .line 183
    new-instance v0, Lr0/H1;

    .line 184
    .line 185
    invoke-direct {v0, p1, v2, p0}, Lr0/H1;-><init>(Landroid/app/Activity;Lr0/I1;Lr0/M1;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lz0/g;->s()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->isHideFriendEnabled()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    return v0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    return v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "temporary unhide clear"

    .line 19
    .line 20
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lz0/g;->c()V

    .line 28
    .line 29
    .line 30
    :try_start_0
    const-class p0, Lq0/h;

    .line 31
    .line 32
    invoke-static {p0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lq0/h;

    .line 37
    .line 38
    invoke-virtual {p0}, Lq0/h;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :catchall_0
    :goto_0
    return-void
.end method

.method public static e(Ljava/lang/Object;ILjava/util/IdentityHashMap;)Landroid/widget/TextView;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x3

    .line 7
    if-gt p1, v1, :cond_a

    .line 8
    .line 9
    invoke-virtual {p2, p0}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {p2, p0, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    instance-of v1, p0, Landroid/widget/TextView;

    .line 23
    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_0
    if-nez v2, :cond_3

    .line 52
    .line 53
    const-string v2, ""

    .line 54
    .line 55
    :cond_3
    const-string v3, "\u5fae\u4fe1"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_4

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_4
    instance-of v1, p0, Ljava/lang/Iterable;

    .line 65
    .line 66
    const/4 v2, 0x1

    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    check-cast p0, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_a

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    add-int/lit8 v3, p1, 0x1

    .line 86
    .line 87
    invoke-static {v1, v3, p2}, Lr0/M1;->e(Ljava/lang/Object;ILjava/util/IdentityHashMap;)Landroid/widget/TextView;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    return-object v1

    .line 94
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :goto_1
    if-eqz v1, :cond_a

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const-string v4, "getDeclaredFields(...)"

    .line 105
    .line 106
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    array-length v4, v3

    .line 110
    const/4 v5, 0x0

    .line 111
    :goto_2
    if-ge v5, v4, :cond_9

    .line 112
    .line 113
    aget-object v6, v3, v5

    .line 114
    .line 115
    :try_start_0
    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    if-nez v6, :cond_7

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_7
    add-int/lit8 v7, p1, 0x1

    .line 126
    .line 127
    invoke-static {v6, v7, p2}, Lr0/M1;->e(Ljava/lang/Object;ILjava/util/IdentityHashMap;)Landroid/widget/TextView;

    .line 128
    .line 129
    .line 130
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    if-eqz v6, :cond_8

    .line 132
    .line 133
    return-object v6

    .line 134
    :catchall_0
    :cond_8
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    goto :goto_1

    .line 142
    :cond_a
    :goto_4
    return-object v0
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v1, p0

    .line 24
    :goto_1
    return-object v1

    .line 25
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    :cond_1
    return-object v1
.end method

.method public static j(Landroid/app/Activity;)V
    .locals 3

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "temporary unhide clear"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "quick display disabled"

    .line 12
    .line 13
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-static {}, Lz0/g;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const-string v0, "toggle off"

    .line 31
    .line 32
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    const-string p0, "temporary unhide show"

    .line 44
    .line 45
    const-string v0, "toggle on"

    .line 46
    .line 47
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lz0/g;->t()Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_2

    .line 59
    .line 60
    invoke-static {}, Lz0/g;->c()V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {p0}, LF0/m;->c0(Ljava/lang/Iterable;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 93
    .line 94
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    move-object v2, v1

    .line 130
    check-cast v2, Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-nez v2, :cond_4

    .line 137
    .line 138
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-static {p0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sget-boolean v1, Lz0/i;->a:Z

    .line 155
    .line 156
    const-string v1, "temp_unhide_close_friends"

    .line 157
    .line 158
    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_6

    .line 167
    .line 168
    const-string p0, "addAllTemporaryUnhideCloseFriends fail"

    .line 169
    .line 170
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_6
    invoke-static {p0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    sput-object p0, Lz0/i;->d:Ljava/util/Set;

    .line 183
    .line 184
    invoke-static {}, Lz0/g;->I()V

    .line 185
    .line 186
    .line 187
    :goto_2
    :try_start_0
    const-class p0, Lq0/h;

    .line 188
    .line 189
    invoke-static {p0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    check-cast p0, Lq0/h;

    .line 194
    .line 195
    invoke-virtual {p0}, Lq0/h;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    .line 197
    .line 198
    :catchall_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/widget/TextView;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lr0/M1;->g(Landroid/widget/TextView;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-boolean v0, p0, Lr0/M1;->f:Z

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    sget-boolean v0, Lz0/i;->a:Z

    .line 26
    .line 27
    invoke-static {}, Lz0/g;->s()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideTopBarUnreadBold()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-ne v0, v2, :cond_1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Lr0/M1;->h:Landroid/graphics/Typeface;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 67
    .line 68
    :cond_2
    invoke-virtual {p1, v0, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 69
    .line 70
    .line 71
    move v1, v2

    .line 72
    :goto_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    move v2, v1

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    iget-object v0, p0, Lr0/M1;->h:Landroid/graphics/Typeface;

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v3, v0

    .line 100
    :goto_1
    if-eqz v0, :cond_6

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/graphics/Typeface;->getStyle()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    move v0, v1

    .line 108
    :goto_2
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-eqz v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-eqz v4, :cond_7

    .line 123
    .line 124
    invoke-virtual {v4}, Landroid/graphics/Typeface;->getStyle()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-ne v4, v0, :cond_7

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    invoke-virtual {p1, v3, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 132
    .line 133
    .line 134
    move v1, v2

    .line 135
    :goto_3
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFakeBoldText()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iget-boolean v3, p0, Lr0/M1;->i:Z

    .line 144
    .line 145
    if-eq v0, v3, :cond_3

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-boolean v1, p0, Lr0/M1;->i:Z

    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 154
    .line 155
    .line 156
    :goto_4
    if-eqz v2, :cond_8

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 159
    .line 160
    .line 161
    :cond_8
    return-void
.end method

.method public final g(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/M1;->g:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/TextView;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eq v0, p1, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object p1, p0, Lr0/M1;->k:Landroid/os/Handler;

    .line 17
    .line 18
    iget-object v0, p0, Lr0/M1;->l:Lr0/E1;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lr0/M1;->m:Lr0/E1;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    const-wide/16 v2, 0xa0

    .line 32
    .line 33
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr0/M1;->f:Z

    .line 2
    .line 3
    iget-object p1, p0, Lr0/M1;->g:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Landroid/widget/TextView;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lr0/M1;->g(Landroid/widget/TextView;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr0/M1;->a:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Le/r;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {v0, v2, p0}, Le/r;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Landroid/content/IntentFilter;

    .line 14
    .line 15
    const-string v3, "android.intent.action.SCREEN_OFF"

    .line 16
    .line 17
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 21
    .line 22
    .line 23
    iput-boolean v1, p0, Lr0/M1;->a:Z

    .line 24
    .line 25
    :goto_0
    iget-boolean v0, p0, Lr0/M1;->b:Z

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v3, v0, Landroid/app/Application;

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    check-cast v0, Landroid/app/Application;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v2

    .line 43
    :goto_1
    if-nez v0, :cond_4

    .line 44
    .line 45
    instance-of v0, p1, Landroid/app/Application;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, Landroid/app/Application;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    move-object v0, v2

    .line 54
    :goto_2
    if-nez v0, :cond_4

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    new-instance v3, Lr0/j;

    .line 58
    .line 59
    const/4 v4, 0x6

    .line 60
    invoke-direct {v3, p0, v4}, Lr0/j;-><init>(Le0/a;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v1, p0, Lr0/M1;->b:Z

    .line 67
    .line 68
    :goto_3
    iget-object v0, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 69
    .line 70
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_a

    .line 77
    .line 78
    iget-boolean p2, p0, Lr0/M1;->c:Z

    .line 79
    .line 80
    if-eqz p2, :cond_5

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-nez p2, :cond_6

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    move-object p1, p2

    .line 91
    :goto_4
    const-string p2, "sensor"

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    instance-of v0, p2, Landroid/hardware/SensorManager;

    .line 98
    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    move-object v2, p2

    .line 102
    check-cast v2, Landroid/hardware/SensorManager;

    .line 103
    .line 104
    :cond_7
    if-nez v2, :cond_8

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_8
    invoke-virtual {v2, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    if-nez p2, :cond_9

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_9
    new-instance v0, Lr0/L1;

    .line 115
    .line 116
    invoke-direct {v0, p0, p1}, Lr0/L1;-><init>(Lr0/M1;Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    const/4 p1, 0x2

    .line 120
    invoke-virtual {v2, v0, p2, p1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_a

    .line 125
    .line 126
    iput-boolean v1, p0, Lr0/M1;->c:Z

    .line 127
    .line 128
    :cond_a
    :goto_5
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const-string p2, "classLoader"

    .line 137
    .line 138
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 142
    .line 143
    const-string v1, "android.app.Activity"

    .line 144
    .line 145
    invoke-interface {v0, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v0, Lr0/K1;

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    invoke-direct {v0, p0, v2}, Lr0/K1;-><init>(Lr0/M1;I)V

    .line 153
    .line 154
    .line 155
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v2, "onResume"

    .line 160
    .line 161
    invoke-static {p1, v2, v0}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p1, p2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 176
    .line 177
    invoke-interface {p2, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance p2, Lr0/K1;

    .line 182
    .line 183
    const/4 v0, 0x1

    .line 184
    invoke-direct {p2, p0, v0}, Lr0/K1;-><init>(Lr0/M1;I)V

    .line 185
    .line 186
    .line 187
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 188
    .line 189
    filled-new-array {v0, p2}, [Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    const-string v0, "onWindowFocusChanged"

    .line 194
    .line 195
    invoke-static {p1, v0, p2}, Lc0/f;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final i(Landroid/app/Activity;)V
    .locals 4

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->t()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Lz0/g;->p()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, Lr0/M1;->d(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getTripleTapPassword()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-static {p1}, Lr0/M1;->j(Landroid/app/Activity;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    new-instance v0, Landroid/widget/EditText;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    const/16 v1, 0x81

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 57
    .line 58
    .line 59
    const-string v1, "\u8bf7\u8f93\u5165\u5bc6\u7801"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 65
    .line 66
    invoke-direct {v1, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    const-string v2, "\u9a8c\u8bc1"

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "\u786e\u5b9a"

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "\u53d6\u6d88"

    .line 87
    .line 88
    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Lr0/G1;

    .line 97
    .line 98
    invoke-direct {v2, v1, v0, p1, p0}, Lr0/G1;-><init>(Landroid/app/AlertDialog;Landroid/widget/EditText;Landroid/app/Activity;Lr0/M1;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 105
    .line 106
    .line 107
    return-void
.end method
