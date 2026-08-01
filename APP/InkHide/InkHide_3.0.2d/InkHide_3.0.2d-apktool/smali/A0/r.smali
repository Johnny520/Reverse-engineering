.class public final synthetic LA0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lr0/I1;Lr0/M1;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    iput v0, p0, LA0/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LA0/r;->b:Ljava/lang/Object;

    iput-object p2, p0, LA0/r;->d:Ljava/lang/Object;

    iput-object p1, p0, LA0/r;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LA0/r;->a:I

    iput-object p1, p0, LA0/r;->b:Ljava/lang/Object;

    iput-object p2, p0, LA0/r;->c:Ljava/lang/Object;

    iput-object p3, p0, LA0/r;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, LA0/r;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p0, LA0/r;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/View$OnLongClickListener;

    .line 8
    .line 9
    sget-object v2, Lr0/H0;->g0:Ljava/util/List;

    .line 10
    .line 11
    iget-object v2, p0, LA0/r;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lr0/H0;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-boolean v3, Lz0/i;->a:Z

    .line 19
    .line 20
    invoke-static {}, Lz0/g;->F()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :try_start_0
    invoke-static {v0, v1}, Lr0/H0;->N0(Landroid/view/View;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {v1}, Lr0/H0;->R(Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-static {v0}, Lr0/H0;->X(Landroid/view/View;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v0, v2, Lr0/H0;->H:Ljava/util/WeakHashMap;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {v2, v3, v3, v0}, Lr0/H0;->l1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    new-instance v1, LE0/d;

    .line 61
    .line 62
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :goto_0
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    const-string v1, "conversation quick add runtime long click resolve fail"

    .line 73
    .line 74
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void
.end method

.method private final b()V
    .locals 8

    .line 1
    iget-object v0, p0, LA0/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr0/L0;

    .line 4
    .line 5
    iget-object v1, v0, Lr0/L0;->f:Ljava/util/Set;

    .line 6
    .line 7
    iget-object v2, p0, LA0/r;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/widget/ListView;

    .line 10
    .line 11
    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lr0/L0;->o(Landroid/widget/ListView;)Landroid/widget/ListAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v3, p0, LA0/r;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eq v1, v3, :cond_0

    .line 23
    .line 24
    goto :goto_3

    .line 25
    :cond_0
    iget-object v0, v0, Lr0/L0;->g:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :try_start_0
    const-string v1, "clearCache"

    .line 35
    .line 36
    const-string v4, "i2"

    .line 37
    .line 38
    const-string v5, "j0"

    .line 39
    .line 40
    const-string v6, "i0"

    .line 41
    .line 42
    filled-new-array {v1, v4, v5, v6}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :catchall_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/4 v5, 0x0

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    new-array v5, v5, [Ljava/lang/Object;

    .line 72
    .line 73
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 74
    .line 75
    invoke-interface {v7, v6, v4, v5}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 79
    if-nez v4, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const/4 v5, 0x0

    .line 83
    :try_start_1
    invoke-virtual {v4, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :catchall_1
    move-exception v1

    .line 88
    goto :goto_4

    .line 89
    :cond_3
    :try_start_2
    instance-of v1, v3, Landroid/widget/BaseAdapter;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    :try_start_3
    move-object v1, v3

    .line 94
    check-cast v1, Landroid/widget/BaseAdapter;

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const-string v1, "notifyDataSetChanged"

    .line 101
    .line 102
    new-array v4, v5, [Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 105
    .line 106
    invoke-interface {v5, v3, v1, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 107
    .line 108
    .line 109
    :catchall_2
    :goto_1
    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :goto_2
    :try_start_4
    invoke-virtual {v2}, Landroid/widget/AbsListView;->invalidateViews()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 113
    .line 114
    .line 115
    :catchall_3
    :try_start_5
    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 116
    .line 117
    .line 118
    :catchall_4
    :goto_3
    return-void

    .line 119
    :goto_4
    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    throw v1
.end method

.method private final c()V
    .locals 6

    .line 1
    iget-object v0, p0, LA0/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr0/D1;

    .line 4
    .line 5
    iget-object v1, p0, LA0/r;->d:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    :try_start_0
    iput-boolean v2, v0, Lr0/D1;->i:Z

    .line 10
    .line 11
    const-string v2, "notifyDataSetChanged"

    .line 12
    .line 13
    new-array v4, v3, [Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 16
    .line 17
    invoke-interface {v5, v1, v2, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :catchall_0
    iput-boolean v3, v0, Lr0/D1;->i:Z

    .line 21
    .line 22
    iget-object v0, p0, LA0/r;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private final d()V
    .locals 7

    .line 1
    iget-object v0, p0, LA0/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Li/q1;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, LA0/r;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "/"

    .line 16
    .line 17
    invoke-static {v4, v0, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    move-object v5, v0

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    const-string v0, "file://"

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    new-instance v1, Ljava/io/File;

    .line 40
    .line 41
    invoke-static {v4, v0}, LU0/i;->t0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const-string v0, "http://"

    .line 58
    .line 59
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v3, 0x0

    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    const-string v0, "https://"

    .line 67
    .line 68
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    goto :goto_4

    .line 76
    :cond_2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 77
    .line 78
    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v5, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 86
    .line 87
    invoke-static {v0, v5}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 91
    .line 92
    const/16 v5, 0xbb8

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 104
    .line 105
    .line 106
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    :try_start_1
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 108
    .line 109
    .line 110
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    :try_start_2
    invoke-static {v1, v3}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_1

    .line 120
    :catchall_1
    move-exception v0

    .line 121
    move-object v5, v0

    .line 122
    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    :catchall_2
    move-exception v0

    .line 124
    :try_start_4
    invoke-static {v1, v5}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 128
    :goto_1
    new-instance v5, LE0/d;

    .line 129
    .line 130
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    :goto_2
    instance-of v0, v5, LE0/d;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    move-object v3, v5

    .line 139
    :goto_3
    move-object v0, v3

    .line 140
    check-cast v0, Landroid/graphics/Bitmap;

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :goto_4
    if-nez v5, :cond_4

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_4
    iget-object v0, v2, Li/q1;->g:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_5

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_5
    iget-object v0, v2, Li/q1;->f:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, Ls0/f;

    .line 160
    .line 161
    invoke-virtual {v0, v4, v5}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    new-instance v1, LD0/a;

    .line 165
    .line 166
    iget-object v0, p0, LA0/r;->d:Ljava/lang/Object;

    .line 167
    .line 168
    move-object v3, v0

    .line 169
    check-cast v3, Ls0/e;

    .line 170
    .line 171
    const/4 v6, 0x3

    .line 172
    invoke-direct/range {v1 .. v6}, LD0/a;-><init>(Ljava/lang/Object;Ln0/a;Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v2, Li/q1;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Landroid/app/Activity;

    .line 178
    .line 179
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 180
    .line 181
    .line 182
    :goto_5
    return-void
.end method

.method private final e()V
    .locals 7

    .line 1
    iget-object v0, p0, LA0/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, Ls0/l;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, LA0/r;->c:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "/"

    .line 16
    .line 17
    invoke-static {v4, v0, v1}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    move-object v5, v0

    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_0
    const-string v0, "file://"

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    invoke-static {v4, v0}, LU0/i;->t0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const-string v0, "http://"

    .line 49
    .line 50
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v3, 0x0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    const-string v0, "https://"

    .line 58
    .line 59
    invoke-static {v4, v1, v0}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    move-object v5, v3

    .line 66
    goto :goto_4

    .line 67
    :cond_2
    :try_start_0
    new-instance v0, Ljava/net/URL;

    .line 68
    .line 69
    invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v5, "null cannot be cast to non-null type java.net.HttpURLConnection"

    .line 77
    .line 78
    invoke-static {v0, v5}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 82
    .line 83
    const/16 v5, 0xbb8

    .line 84
    .line 85
    invoke-virtual {v0, v5}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v5}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 95
    .line 96
    .line 97
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    :try_start_1
    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    :try_start_2
    invoke-static {v1, v3}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    goto :goto_1

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    move-object v5, v0

    .line 113
    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    :try_start_4
    invoke-static {v1, v5}, LD/h;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 119
    :goto_1
    new-instance v5, LE0/d;

    .line 120
    .line 121
    invoke-direct {v5, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    instance-of v0, v5, LE0/d;

    .line 125
    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    move-object v3, v5

    .line 130
    :goto_3
    move-object v0, v3

    .line 131
    check-cast v0, Landroid/graphics/Bitmap;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :goto_4
    if-nez v5, :cond_4

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_4
    iget-object v0, v2, Ls0/l;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    iget-object v0, v2, Ls0/l;->g:Ls0/f;

    .line 147
    .line 148
    invoke-virtual {v0, v4, v5}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    new-instance v1, LD0/a;

    .line 152
    .line 153
    iget-object v0, p0, LA0/r;->d:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v3, v0

    .line 156
    check-cast v3, Ls0/j;

    .line 157
    .line 158
    const/4 v6, 0x4

    .line 159
    invoke-direct/range {v1 .. v6}, LD0/a;-><init>(Ljava/lang/Object;Ln0/a;Ljava/lang/String;Landroid/graphics/Bitmap;I)V

    .line 160
    .line 161
    .line 162
    iget-object v0, v2, Ls0/l;->a:Landroid/app/Activity;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 165
    .line 166
    .line 167
    :goto_5
    return-void
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, LA0/r;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v1, p0, LA0/r;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/view/Window;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v2, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, LA0/r;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 30

    move-object/from16 v1, p0

    iget v0, v1, LA0/r;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Landroid/content/Context;

    iget-object v0, v1, LA0/r;->c:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lz0/p;

    iget-object v0, v1, LA0/r;->d:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 1
    sget-object v0, Lz0/q;->a:Landroid/os/Handler;

    .line 2
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 3
    iget-object v9, v8, Lz0/p;->b:Ljava/lang/String;

    .line 4
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 5
    sget-object v0, Lz0/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_0

    goto/16 :goto_3d

    .line 6
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    const-wide/32 v12, 0x240c8400

    sub-long/2addr v10, v12

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    const-string v12, "<get-entries>(...)"

    invoke-static {v0, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 9
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 11
    const-string v13, "it"

    invoke-static {v12, v13}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    cmp-long v12, v12, v10

    if-gez v12, :cond_1

    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 14
    :cond_2
    iget-wide v10, v8, Lz0/p;->d:J

    .line 15
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/16 v12, 0x0

    cmp-long v10, v10, v12

    if-lez v10, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    const-wide/16 v16, 0x1

    add-long v10, v10, v16

    goto :goto_2

    .line 16
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 17
    :goto_2
    iget-object v0, v8, Lz0/p;->c:Ljava/lang/String;

    const/16 v14, 0x20

    .line 18
    invoke-static {v15, v14}, LU0/i;->v0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_5

    move-object v14, v15

    .line 19
    :cond_5
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-eqz v16, :cond_6

    .line 20
    const-string v0, "\u5bf9\u65b9\u5df2\u8bfb\uff0c\u65f6\u95f4 "

    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-wide/from16 v16, v12

    :goto_3
    move-object v12, v0

    goto :goto_4

    :cond_6
    move-wide/from16 v16, v12

    .line 21
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "\""

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" \u5df2\u8bfb\uff0c\u65f6\u95f4 "

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 22
    :goto_4
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 23
    invoke-static {v0, v10, v11, v12}, Lz0/q;->c(Ljava/lang/String;JLjava/lang/String;)Landroid/content/ContentValues;

    move-result-object v0

    .line 24
    invoke-static {}, Lz0/q;->f()Lz0/n;

    move-result-object v13

    const-class v14, Ljava/lang/Number;

    const/16 v18, 0x0

    const-class v5, Landroid/content/ContentValues;

    const/16 v19, 0x4

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/16 v20, 0x1

    const-string v6, "getMethods(...)"

    const-string v3, "getClassLoader(...)"

    if-nez v13, :cond_7

    :goto_5
    move-object/from16 v24, v9

    :goto_6
    move-object/from16 v25, v15

    :goto_7
    const/4 v4, 0x0

    goto/16 :goto_14

    .line 25
    :cond_7
    sget-object v22, Lz0/q;->d:Ljava/lang/Object;

    if-nez v22, :cond_9

    invoke-static {v7, v13}, Lz0/q;->d(Landroid/content/Context;Lz0/n;)Ljava/lang/Object;

    move-result-object v22

    if-eqz v22, :cond_8

    sput-object v22, Lz0/q;->d:Ljava/lang/Object;

    goto :goto_8

    :cond_8
    const/16 v22, 0x0

    :goto_8
    if-nez v22, :cond_9

    goto :goto_5

    :cond_9
    move-object/from16 v23, v22

    .line 26
    iget-object v4, v13, Lz0/n;->a:Ljava/lang/String;

    .line 27
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v24, v9

    .line 28
    sget-object v9, Lc0/f;->b:Ld0/b;

    invoke-interface {v9, v1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    const/4 v4, 0x0

    .line 29
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-static {v4, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v25, v15

    .line 31
    array-length v15, v4

    move-object/from16 v26, v4

    move/from16 v4, v18

    :goto_9
    if-ge v4, v15, :cond_c

    aget-object v27, v26, v4

    move/from16 v28, v4

    .line 32
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    move/from16 v29, v15

    const-string v15, "convertFrom"

    invoke-static {v4, v15}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 33
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    const/4 v15, 0x2

    if-ne v4, v15, :cond_b

    .line 34
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v4, v4, v18

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 35
    invoke-virtual/range {v27 .. v27}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    aget-object v4, v4, v20

    invoke-static {v4, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object/from16 v4, v27

    goto :goto_a

    :cond_b
    add-int/lit8 v4, v28, 0x1

    move/from16 v15, v29

    goto :goto_9

    :cond_c
    const/4 v4, 0x0

    :goto_a
    if-nez v4, :cond_d

    :goto_b
    goto/16 :goto_7

    :cond_d
    move/from16 v15, v20

    .line 36
    :try_start_0
    invoke-virtual {v4, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    sget-object v15, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_c

    :catchall_0
    move-exception v0

    .line 38
    new-instance v4, LE0/d;

    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v4

    .line 39
    :goto_c
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_e

    .line 40
    const-string v1, "read trace convertFrom invoke fail"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    goto/16 :goto_7

    .line 41
    :cond_e
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    array-length v4, v0

    move/from16 v15, v18

    :goto_d
    if-ge v15, v4, :cond_10

    aget-object v26, v0, v15

    move-object/from16 v27, v0

    .line 43
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    move/from16 v28, v4

    .line 44
    iget-object v4, v13, Lz0/n;->e:Ljava/lang/String;

    .line 45
    invoke-static {v0, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 46
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v4, 0x2

    if-ne v0, v4, :cond_f

    .line 47
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v18

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 48
    invoke-virtual/range {v26 .. v26}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/16 v20, 0x1

    aget-object v0, v0, v20

    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 49
    invoke-static/range {v26 .. v26}, Lz0/q;->k(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_e

    :cond_f
    const/16 v20, 0x1

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, v27

    move/from16 v4, v28

    goto :goto_d

    :cond_10
    const/16 v26, 0x0

    :goto_e
    if-nez v26, :cond_14

    .line 50
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    array-length v4, v0

    move/from16 v13, v18

    :goto_f
    if-ge v13, v4, :cond_13

    aget-object v15, v0, v13

    move-object/from16 v26, v0

    .line 52
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    move/from16 v27, v4

    const/4 v4, 0x2

    if-ne v0, v4, :cond_11

    .line 53
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v18

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 54
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/16 v20, 0x1

    aget-object v0, v0, v20

    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 55
    invoke-static {v15}, Lz0/q;->k(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_10

    :cond_11
    const/16 v20, 0x1

    :cond_12
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v26

    move/from16 v4, v27

    goto :goto_f

    :cond_13
    const/4 v15, 0x0

    :goto_10
    if-nez v15, :cond_15

    goto/16 :goto_b

    :cond_14
    move-object/from16 v15, v26

    .line 56
    :cond_15
    :try_start_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v9, v0}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v15, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_16

    check-cast v0, Ljava/lang/Number;

    goto :goto_11

    :catchall_1
    move-exception v0

    goto :goto_12

    :cond_16
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_17

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_13

    :cond_17
    const/4 v0, 0x0

    goto :goto_13

    .line 57
    :goto_12
    new-instance v1, LE0/d;

    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 58
    :goto_13
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_18

    .line 59
    const-string v4, "read trace convertFrom insert fail"

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    filled-new-array {v4, v9, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 60
    :cond_18
    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_19

    const/4 v0, 0x0

    .line 61
    :cond_19
    check-cast v0, Ljava/lang/Long;

    move-object v4, v0

    :goto_14
    if-nez v4, :cond_4b

    .line 62
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 63
    invoke-static {}, Lz0/q;->f()Lz0/n;

    move-result-object v1

    if-nez v1, :cond_1a

    :goto_15
    move-object/from16 v29, v7

    move-wide/from16 v26, v10

    const/4 v0, 0x0

    const/16 v23, 0x3

    goto/16 :goto_28

    .line 64
    :cond_1a
    sget-object v9, Lz0/q;->d:Ljava/lang/Object;

    if-nez v9, :cond_1c

    invoke-static {v7, v1}, Lz0/q;->d(Landroid/content/Context;Lz0/n;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_1b

    sput-object v9, Lz0/q;->d:Ljava/lang/Object;

    goto :goto_16

    :cond_1b
    const/4 v9, 0x0

    :goto_16
    if-nez v9, :cond_1c

    goto :goto_15

    .line 65
    :cond_1c
    iget-object v13, v1, Lz0/n;->a:Ljava/lang/String;

    .line 66
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-static {v15, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v23, 0x3

    .line 67
    sget-object v4, Lc0/f;->b:Ld0/b;

    invoke-interface {v4, v15, v13}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    if-nez v4, :cond_1d

    move-object/from16 v29, v7

    move-wide/from16 v26, v10

    :goto_17
    const/4 v0, 0x0

    goto/16 :goto_28

    :cond_1d
    const/4 v13, 0x0

    .line 68
    invoke-virtual {v4, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v15

    invoke-virtual {v15, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 69
    invoke-static {v15}, LN0/g;->b(Ljava/lang/Object;)V

    const-string v13, "u1"

    invoke-static {v15, v0, v13}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    sget-object v0, LP0/a;->a:LP0/a;

    .line 71
    invoke-virtual {v0}, LP0/a;->c()I

    move-result v0

    move-wide/from16 v26, v10

    int-to-long v10, v0

    add-long v10, v26, v10

    .line 72
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v10, "o1"

    invoke-static {v15, v0, v10}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2710

    .line 73
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "setType"

    invoke-static {v15, v0, v10}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "r1"

    invoke-static {v15, v0, v10}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v10, "j1"

    invoke-static {v15, v0, v10}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v10, "e1"

    invoke-static {v15, v0, v10}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    const-string v0, "d1"

    invoke-static {v15, v12, v0}, Lz0/q;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    array-length v10, v0

    move/from16 v11, v18

    :goto_18
    if-ge v11, v10, :cond_20

    aget-object v13, v0, v11

    move-object/from16 v28, v0

    .line 80
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v29, v7

    const-string v7, "na"

    invoke-static {v0, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 81
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v7, 0x1

    if-ne v0, v7, :cond_1f

    .line 82
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 83
    invoke-static {v13}, Lz0/q;->k(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_1a

    :cond_1e
    const/16 v20, 0x1

    goto :goto_19

    :cond_1f
    move/from16 v20, v7

    :goto_19
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, v28

    move-object/from16 v7, v29

    goto :goto_18

    :cond_20
    move-object/from16 v29, v7

    const/4 v13, 0x0

    :goto_1a
    if-eqz v13, :cond_25

    .line 84
    :try_start_2
    filled-new-array {v15}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_21

    check-cast v0, Ljava/lang/Number;

    goto :goto_1b

    :catchall_2
    move-exception v0

    goto :goto_1c

    :cond_21
    const/4 v0, 0x0

    :goto_1b
    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1d

    :cond_22
    const/4 v0, 0x0

    goto :goto_1d

    .line 85
    :goto_1c
    new-instance v1, LE0/d;

    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 86
    :goto_1d
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 87
    const-string v2, "read trace native na insert fail"

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 88
    :cond_23
    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_24

    const/4 v0, 0x0

    .line 89
    :cond_24
    check-cast v0, Ljava/lang/Long;

    goto/16 :goto_28

    .line 90
    :cond_25
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    array-length v7, v0

    move/from16 v10, v18

    :goto_1e
    if-ge v10, v7, :cond_27

    aget-object v11, v0, v10

    .line 92
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v28, v0

    .line 93
    iget-object v0, v1, Lz0/n;->e:Ljava/lang/String;

    .line 94
    invoke-static {v13, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 95
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v13, 0x2

    if-ne v0, v13, :cond_26

    .line 96
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    aget-object v0, v0, v18

    invoke-virtual {v0, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 97
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/16 v20, 0x1

    aget-object v0, v0, v20

    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    .line 98
    invoke-static {v11}, Lz0/q;->k(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_1f

    :cond_26
    const/16 v20, 0x1

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, v28

    goto :goto_1e

    :cond_27
    const/4 v11, 0x0

    :goto_1f
    if-nez v11, :cond_2c

    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    array-length v1, v0

    move/from16 v7, v18

    :goto_20
    if-ge v7, v1, :cond_2a

    aget-object v10, v0, v7

    .line 101
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    const/4 v13, 0x2

    if-ne v11, v13, :cond_28

    .line 102
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    aget-object v11, v11, v18

    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_28

    .line 103
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/16 v20, 0x1

    aget-object v11, v11, v20

    invoke-static {v11, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_29

    .line 104
    invoke-static {v10}, Lz0/q;->k(Ljava/lang/reflect/Method;)Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v14, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_29

    goto :goto_21

    :cond_28
    const/16 v20, 0x1

    :cond_29
    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_2a
    const/4 v10, 0x0

    :goto_21
    if-nez v10, :cond_2b

    goto/16 :goto_17

    :cond_2b
    move-object v11, v10

    .line 105
    :cond_2c
    :try_start_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_2d

    check-cast v0, Ljava/lang/Number;

    goto :goto_22

    :catchall_3
    move-exception v0

    goto :goto_26

    :cond_2d
    const/4 v0, 0x0

    :goto_22
    if-eqz v0, :cond_30

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    cmp-long v0, v0, v16

    if-ltz v0, :cond_2e

    goto :goto_23

    :cond_2e
    const/4 v2, 0x0

    :goto_23
    if-nez v2, :cond_2f

    goto :goto_24

    :cond_2f
    move-object v0, v2

    goto :goto_27

    .line 106
    :cond_30
    :goto_24
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v9, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_31

    check-cast v0, Ljava/lang/Number;

    goto :goto_25

    :cond_31
    const/4 v0, 0x0

    :goto_25
    if-eqz v0, :cond_32

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_27

    :cond_32
    const/4 v0, 0x0

    goto :goto_27

    .line 107
    :goto_26
    new-instance v1, LE0/d;

    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v1

    .line 108
    :goto_27
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_33

    .line 109
    const-string v2, "read trace native insert fail"

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v4, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 110
    :cond_33
    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_34

    const/4 v0, 0x0

    .line 111
    :cond_34
    check-cast v0, Ljava/lang/Long;

    :goto_28
    if-nez v0, :cond_4a

    .line 112
    iget-object v1, v8, Lz0/p;->a:Ljava/lang/String;

    .line 113
    invoke-virtual/range {v29 .. v29}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    sget-object v2, Lc0/f;->b:Ld0/b;

    const-string v3, "com.tencent.wcdb.database.SQLiteDatabase"

    invoke-interface {v2, v0, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_35

    const/4 v4, 0x0

    goto :goto_2b

    .line 115
    :cond_35
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v2, "getDeclaredFields(...)"

    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    array-length v2, v0

    if-nez v2, :cond_36

    goto :goto_29

    :cond_36
    aget-object v0, v0, v18
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :goto_29
    const/4 v2, 0x0

    goto :goto_2a

    :catchall_4
    move-exception v0

    .line 117
    new-instance v2, LE0/d;

    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    :goto_2a
    if-eqz v2, :cond_37

    const/4 v2, 0x0

    :cond_37
    move-object v4, v2

    :goto_2b
    if-nez v4, :cond_38

    goto/16 :goto_37

    :cond_38
    move-wide/from16 v10, v26

    .line 118
    invoke-static {v1, v10, v11, v12}, Lz0/q;->c(Ljava/lang/String;JLjava/lang/String;)Landroid/content/ContentValues;

    move-result-object v1

    .line 119
    const-class v0, LE0/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v2, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    array-length v3, v2

    move/from16 v7, v18

    :goto_2c
    const-class v9, Ljava/lang/String;

    if-ge v7, v3, :cond_3a

    aget-object v10, v2, v7

    .line 121
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "insertOrThrow"

    invoke-static {v11, v12}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_39

    .line 122
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    move/from16 v12, v23

    if-ne v11, v12, :cond_39

    .line 123
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    aget-object v11, v11, v18

    invoke-static {v11, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_39

    .line 124
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/16 v21, 0x2

    aget-object v11, v11, v21

    invoke-virtual {v5, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_39

    goto :goto_2d

    :cond_39
    const/16 v20, 0x1

    add-int/lit8 v7, v7, 0x1

    const/16 v23, 0x3

    goto :goto_2c

    :cond_3a
    const/4 v10, 0x0

    .line 125
    :goto_2d
    const-string v2, "message"

    if-eqz v10, :cond_3f

    const/4 v13, 0x0

    .line 126
    :try_start_5
    filled-new-array {v2, v13, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v10, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/Number;

    if-eqz v2, :cond_3b

    check-cast v0, Ljava/lang/Number;

    goto :goto_2e

    :catchall_5
    move-exception v0

    goto :goto_2f

    :cond_3b
    const/4 v0, 0x0

    :goto_2e
    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_30

    :cond_3c
    const/4 v0, 0x0

    goto :goto_30

    .line 127
    :goto_2f
    new-instance v2, LE0/d;

    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v2

    .line 128
    :goto_30
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_3d

    .line 129
    const-string v3, "read trace db insertOrThrow fail"

    filled-new-array {v3, v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 130
    :cond_3d
    instance-of v1, v0, LE0/d;

    if-eqz v1, :cond_3e

    const/4 v4, 0x0

    goto :goto_31

    :cond_3e
    move-object v4, v0

    .line 131
    :goto_31
    check-cast v4, Ljava/lang/Long;

    goto/16 :goto_3c

    .line 132
    :cond_3f
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    array-length v7, v3

    move/from16 v10, v18

    :goto_32
    if-ge v10, v7, :cond_42

    aget-object v11, v3, v10

    .line 134
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "insert"

    invoke-static {v12, v13}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_41

    .line 135
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    array-length v12, v12

    const/4 v13, 0x3

    if-ne v12, v13, :cond_40

    .line 136
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    aget-object v12, v12, v18

    invoke-static {v12, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_40

    .line 137
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v12

    const/16 v21, 0x2

    aget-object v12, v12, v21

    invoke-virtual {v5, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_40

    goto :goto_35

    :cond_40
    :goto_33
    const/16 v20, 0x1

    goto :goto_34

    :cond_41
    const/4 v13, 0x3

    goto :goto_33

    :goto_34
    add-int/lit8 v10, v10, 0x1

    goto :goto_32

    :cond_42
    const/4 v11, 0x0

    :goto_35
    if-eqz v11, :cond_45

    const/4 v13, 0x0

    .line 138
    filled-new-array {v2, v13, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_43

    check-cast v0, Ljava/lang/Number;

    goto :goto_36

    :cond_43
    const/4 v0, 0x0

    :goto_36
    if-eqz v0, :cond_44

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_3c

    :cond_44
    :goto_37
    const/4 v4, 0x0

    goto :goto_3c

    .line 139
    :cond_45
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {v0, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    array-length v3, v0

    move/from16 v6, v18

    :goto_38
    if-ge v6, v3, :cond_47

    aget-object v7, v0, v6

    .line 141
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "insertWithOnConflict"

    invoke-static {v9, v10}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_46

    .line 142
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    array-length v9, v9

    move/from16 v10, v19

    if-ne v9, v10, :cond_46

    .line 143
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v9

    const/16 v21, 0x2

    aget-object v9, v9, v21

    invoke-virtual {v5, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_46

    goto :goto_39

    :cond_46
    const/16 v20, 0x1

    add-int/lit8 v6, v6, 0x1

    const/16 v19, 0x4

    goto :goto_38

    :cond_47
    const/4 v7, 0x0

    :goto_39
    if-eqz v7, :cond_48

    .line 144
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v13, 0x0

    filled-new-array {v2, v13, v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_3a

    :cond_48
    const/4 v4, 0x0

    :goto_3a
    instance-of v0, v4, Ljava/lang/Number;

    if-eqz v0, :cond_49

    check-cast v4, Ljava/lang/Number;

    goto :goto_3b

    :cond_49
    const/4 v4, 0x0

    :goto_3b
    if-eqz v4, :cond_44

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    goto :goto_3c

    :cond_4a
    move-object v4, v0

    :cond_4b
    :goto_3c
    if-eqz v4, :cond_4c

    .line 145
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    cmp-long v0, v0, v16

    if-ltz v0, :cond_4c

    .line 146
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 147
    const-class v1, Lq0/h;

    invoke-static {v1}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    move-result-object v1

    check-cast v1, Lq0/h;

    .line 148
    iget-object v1, v1, Lq0/h;->g:Lr0/y;

    invoke-virtual {v1, v0}, Lr0/y;->a(Ljava/lang/String;)V

    .line 149
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 150
    iget-object v1, v8, Lz0/p;->b:Ljava/lang/String;

    .line 151
    const-string v2, "read trace local tip inserted"

    move-object/from16 v15, v25

    filled-new-array {v2, v0, v1, v15}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    goto :goto_3d

    :cond_4c
    move-object/from16 v15, v25

    .line 152
    sget-object v0, Lz0/q;->c:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    iget-object v0, v8, Lz0/p;->a:Ljava/lang/String;

    .line 154
    iget-object v1, v8, Lz0/p;->b:Ljava/lang/String;

    .line 155
    const-string v2, "read trace local tip insert failed"

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 156
    :goto_3d
    iget-object v0, v8, Lz0/p;->b:Ljava/lang/String;

    .line 157
    invoke-static {}, Lz0/q;->e()Ljava/util/List;

    move-result-object v1

    .line 158
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1}, LF0/m;->c0(Ljava/lang/Iterable;)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 160
    check-cast v3, Lz0/p;

    .line 161
    iget-object v4, v3, Lz0/p;->b:Ljava/lang/String;

    .line 162
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4d

    .line 163
    iget-object v10, v3, Lz0/p;->a:Ljava/lang/String;

    iget-object v11, v3, Lz0/p;->b:Ljava/lang/String;

    iget-object v12, v3, Lz0/p;->c:Ljava/lang/String;

    const-string v4, "lastSeen"

    invoke-static {v15, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lz0/p;

    iget-wide v13, v3, Lz0/p;->d:J

    const/16 v16, 0x1

    invoke-direct/range {v9 .. v16}, Lz0/p;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Z)V

    move-object v3, v9

    .line 164
    :cond_4d
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3e

    .line 165
    :cond_4e
    invoke-static {v2}, Lz0/q;->b(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lz0/q;->l(Ljava/util/List;)V

    return-void

    .line 166
    :pswitch_0
    invoke-direct/range {p0 .. p0}, LA0/r;->f()V

    return-void

    :pswitch_1
    invoke-direct/range {p0 .. p0}, LA0/r;->e()V

    return-void

    :pswitch_2
    invoke-direct/range {p0 .. p0}, LA0/r;->d()V

    return-void

    .line 167
    :pswitch_3
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, Lr0/M1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lr0/M1;->c()Z

    move-result v2

    if-nez v2, :cond_4f

    goto :goto_3f

    .line 168
    :cond_4f
    iget-object v2, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v2, Lr0/I1;

    const/4 v15, 0x1

    iput-boolean v15, v2, Lr0/I1;->b:Z

    .line 169
    iget-object v2, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v0, v2}, Lr0/M1;->i(Landroid/app/Activity;)V

    :goto_3f
    return-void

    .line 170
    :pswitch_4
    invoke-direct {v1}, LA0/r;->c()V

    return-void

    :pswitch_5
    invoke-direct {v1}, LA0/r;->b()V

    return-void

    :pswitch_6
    invoke-direct {v1}, LA0/r;->a()V

    return-void

    :pswitch_7
    const/16 v18, 0x0

    iget-object v0, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    .line 171
    iget-object v2, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v2, Lr0/H0;

    move/from16 v3, v18

    iput-boolean v3, v2, Lr0/H0;->u:Z

    .line 172
    iget-object v2, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v2, Lr0/o0;

    :try_start_6
    invoke-virtual {v2}, Lr0/o0;->b()Ljava/lang/Object;

    .line 173
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 174
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 175
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_50

    move-object v4, v2

    check-cast v4, Landroid/view/View;

    goto :goto_40

    :catchall_6
    move-exception v0

    goto :goto_42

    :cond_50
    const/4 v4, 0x0

    :goto_40
    if-eqz v4, :cond_51

    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 176
    :cond_51
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_52

    move-object v4, v0

    check-cast v4, Landroid/view/View;

    goto :goto_41

    :cond_52
    const/4 v4, 0x0

    :goto_41
    if-eqz v4, :cond_53

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    sget-object v4, LE0/i;->a:LE0/i;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_43

    :cond_53
    const/4 v4, 0x0

    goto :goto_43

    .line 177
    :goto_42
    new-instance v4, LE0/d;

    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 178
    :goto_43
    invoke-static {v4}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_54

    .line 179
    const-string v2, "refresh recycler conversation fail"

    const-string v3, "play-8072-recycler"

    filled-new-array {v2, v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    :cond_54
    return-void

    .line 180
    :pswitch_8
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, Lr0/H0;

    const/4 v3, 0x0

    iput-boolean v3, v0, Lr0/H0;->r:Z

    .line 181
    invoke-virtual {v0}, Lr0/H0;->l0()Z

    move-result v2

    if-nez v2, :cond_65

    iget-object v2, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v0, v2}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    move-result v2

    if-nez v2, :cond_55

    goto/16 :goto_4b

    .line 182
    :cond_55
    iget-object v2, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "launcher deferred conversation scan"

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Li0/a;->a([Ljava/lang/Object;)V

    .line 183
    iget-object v2, v0, Lr0/H0;->f:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_64

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_56

    goto/16 :goto_4a

    .line 184
    :cond_56
    invoke-virtual {v0, v2}, Lr0/H0;->A1(Landroid/app/Activity;)Z

    move-result v3

    if-nez v3, :cond_58

    .line 185
    invoke-static {}, Lr0/H0;->Y0()Z

    move-result v0

    if-eqz v0, :cond_57

    .line 186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "8076 scan launcher skip"

    filled-new-array {v3, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 187
    :cond_57
    invoke-static {}, Lr0/H0;->T0()Z

    move-result v0

    if-eqz v0, :cond_65

    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "play8072 scan launcher skip"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    goto/16 :goto_4b

    .line 189
    :cond_58
    invoke-virtual {v0}, Lr0/H0;->l0()Z

    move-result v3

    if-eqz v3, :cond_59

    .line 190
    invoke-static {}, Lr0/H0;->Y0()Z

    move-result v0

    if-eqz v0, :cond_65

    .line 191
    const-string v0, "8076 scan launcher cache-active"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    goto/16 :goto_4b

    .line 192
    :cond_59
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_5a

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    goto :goto_44

    :cond_5a
    const/4 v4, 0x0

    :goto_44
    invoke-virtual {v0, v4}, Lr0/H0;->n0(Landroid/view/View;)Z

    move-result v3

    .line 193
    invoke-static {}, Lr0/H0;->T0()Z

    move-result v4

    const-string v5, "hit="

    if-eqz v4, :cond_5d

    if-nez v3, :cond_5d

    .line 194
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    if-eqz v4, :cond_5b

    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v4

    goto :goto_45

    :cond_5b
    const/4 v4, 0x0

    .line 195
    :goto_45
    invoke-static {}, Lr0/H0;->T0()Z

    move-result v6

    if-nez v6, :cond_5c

    const/4 v4, 0x0

    goto :goto_46

    :cond_5c
    const/4 v6, 0x0

    .line 196
    invoke-virtual {v0, v4, v6, v6}, Lr0/H0;->v1(Landroid/view/View;II)Z

    move-result v4

    .line 197
    :goto_46
    invoke-static {v5, v4}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    .line 198
    const-string v6, "play8072 scan launcher tree"

    filled-new-array {v6, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Li0/a;->d([Ljava/lang/Object;)V

    .line 199
    :cond_5d
    invoke-static {}, Lr0/H0;->Y0()Z

    move-result v4

    if-eqz v4, :cond_5e

    .line 200
    invoke-static {v5, v3}, LL/d;->k(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    .line 201
    const-string v4, "8076 scan launcher tree"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 202
    :cond_5e
    iget-object v3, v0, Lr0/H0;->a:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_5f

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/widget/ListView;

    goto :goto_47

    :cond_5f
    const/4 v4, 0x0

    :goto_47
    if-nez v4, :cond_65

    .line 203
    new-instance v3, Ljava/util/IdentityHashMap;

    invoke-direct {v3}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v3}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v3

    .line 204
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    const/4 v6, 0x0

    .line 205
    invoke-virtual {v0, v2, v6, v3}, Lr0/H0;->H(Ljava/lang/Object;ILjava/util/Set;)LE0/c;

    move-result-object v3

    if-nez v3, :cond_60

    :goto_48
    const/4 v4, 0x0

    goto :goto_49

    .line 206
    :cond_60
    iget-object v4, v3, LE0/c;->a:Ljava/lang/Object;

    check-cast v4, Landroid/widget/ListView;

    if-nez v4, :cond_61

    goto :goto_48

    .line 207
    :cond_61
    iget-object v3, v3, LE0/c;->b:Ljava/lang/Object;

    if-nez v3, :cond_62

    goto :goto_48

    .line 208
    :cond_62
    iget-object v5, v0, Lr0/H0;->O:Li/t;

    invoke-virtual {v5, v4, v3}, Li/t;->d(Landroid/widget/ListView;Ljava/lang/Object;)Lr0/l;

    move-result-object v4

    :goto_49
    if-eqz v4, :cond_63

    .line 209
    invoke-virtual {v0, v4}, Lr0/H0;->r(Lr0/l;)V

    .line 210
    iget-object v2, v4, Lr0/l;->d:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Lr0/H0;->p0(Ljava/lang/Class;)V

    goto :goto_4b

    .line 211
    :cond_63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "legacy conversation object scan miss"

    filled-new-array {v2, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    goto :goto_4b

    .line 212
    :cond_64
    :goto_4a
    invoke-static {}, Lr0/H0;->Y0()Z

    move-result v0

    if-eqz v0, :cond_65

    .line 213
    const-string v0, "8076 scan launcher miss"

    const-string v2, "launcherRef=null"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    :cond_65
    :goto_4b
    return-void

    .line 214
    :pswitch_9
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, Lr0/d0;

    iget-object v2, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    iget-object v3, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v3, Landroid/view/View$OnLongClickListener;

    invoke-static {v0, v2, v3}, Lr0/d0;->f(Lr0/d0;Landroid/view/View;Ljava/lang/Object;)V

    return-void

    .line 215
    :pswitch_a
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lr0/d0;

    iget-object v0, v1, LA0/r;->c:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    iget-object v0, v1, LA0/r;->d:Ljava/lang/Object;

    .line 216
    :try_start_7
    invoke-virtual {v2, v0}, Lr0/d0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    if-nez v0, :cond_66

    .line 217
    :try_start_8
    const-string v0, "getAdapter"

    const/4 v6, 0x0

    new-array v4, v6, [Ljava/lang/Object;

    .line 218
    sget-object v5, Lc0/f;->b:Ld0/b;

    invoke-interface {v5, v3, v0, v4}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_4c

    :catchall_7
    move-exception v0

    .line 219
    :try_start_9
    new-instance v4, LE0/d;

    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    move-object v0, v4

    .line 220
    :goto_4c
    nop

    instance-of v4, v0, LE0/d;

    if-eqz v4, :cond_66

    const/4 v4, 0x0

    goto :goto_4d

    :cond_66
    move-object v4, v0

    .line 221
    :goto_4d
    const-string v0, "notifyDataSetChanged"

    const/4 v6, 0x0

    new-array v5, v6, [Ljava/lang/Object;

    .line 222
    sget-object v6, Lc0/f;->b:Ld0/b;

    invoke-interface {v6, v4, v0, v5}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 223
    :catchall_8
    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    .line 224
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 225
    invoke-virtual {v2, v3}, Lr0/d0;->Z0(Landroid/view/View;)V

    return-void

    .line 226
    :pswitch_b
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    if-nez v2, :cond_67

    goto :goto_4e

    .line 227
    :cond_67
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_68

    const-string v3, ""

    .line 228
    :cond_68
    invoke-static {v3}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 229
    const-string v4, "#"

    const/4 v6, 0x0

    invoke-static {v3, v6, v4}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_69

    .line 230
    iget-object v3, v1, LA0/r;->d:Ljava/lang/Object;

    iget-object v4, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v4, Lr0/w;

    invoke-virtual {v4, v0, v2, v3}, Lr0/w;->h(Landroid/widget/EditText;Landroid/text/Editable;Ljava/lang/Object;)Z

    :cond_69
    :goto_4e
    return-void

    .line 231
    :pswitch_c
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, LC/j;

    iget-object v2, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v2, LD/h;

    iget-object v3, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    :try_start_a
    iget-object v0, v0, LC/j;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LD/h;->j(Landroid/content/Context;)Landroidx/emoji2/text/q;

    move-result-object v0

    if-eqz v0, :cond_6a

    .line 233
    iget-object v4, v0, Landroidx/emoji2/text/q;->a:Landroidx/emoji2/text/j;

    .line 234
    check-cast v4, Landroidx/emoji2/text/p;

    .line 235
    iget-object v5, v4, Landroidx/emoji2/text/p;->e:Ljava/lang/Object;

    .line 236
    monitor-enter v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 237
    :try_start_b
    iput-object v3, v4, Landroidx/emoji2/text/p;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 238
    monitor-exit v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 239
    :try_start_c
    iget-object v0, v0, Landroidx/emoji2/text/q;->a:Landroidx/emoji2/text/j;

    .line 240
    new-instance v4, Landroidx/emoji2/text/l;

    invoke-direct {v4, v2, v3}, Landroidx/emoji2/text/l;-><init>(LD/h;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v4}, Landroidx/emoji2/text/j;->q(LD/h;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    goto :goto_50

    :catchall_9
    move-exception v0

    goto :goto_4f

    :catchall_a
    move-exception v0

    .line 241
    :try_start_d
    monitor-exit v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    :try_start_e
    throw v0

    .line 242
    :cond_6a
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v4, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 243
    :goto_4f
    invoke-virtual {v2, v0}, LD/h;->F(Ljava/lang/Throwable;)V

    .line 244
    invoke-virtual {v3}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_50
    return-void

    .line 245
    :pswitch_d
    new-instance v0, LC/j;

    .line 246
    new-instance v2, LD0/b;

    .line 247
    new-instance v3, LE0/c;

    const-string v4, "Content-Type"

    const-string v5, "application/json; charset=utf-8"

    invoke-direct {v3, v4, v5}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 248
    filled-new-array {v3}, [LE0/c;

    move-result-object v3

    invoke-static {v3}, LF0/v;->a0([LE0/c;)Ljava/util/LinkedHashMap;

    move-result-object v5

    .line 249
    sget-object v3, LU0/a;->a:Ljava/nio/charset/Charset;

    iget-object v4, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    const-string v3, "getBytes(...)"

    invoke-static {v6, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    iget-object v3, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const-string v4, "POST"

    const/16 v7, 0x30

    invoke-direct/range {v2 .. v7}, LD0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)V

    const/4 v4, 0x2

    .line 251
    invoke-direct {v0, v4}, LC/j;-><init>(I)V

    iput-object v2, v0, LC/j;->c:Ljava/lang/Object;

    .line 252
    invoke-virtual {v0}, LC/j;->w()LD0/c;

    move-result-object v0

    iget-object v2, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v2, LM0/l;

    invoke-interface {v2, v0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 253
    :pswitch_e
    new-instance v0, LC/j;

    new-instance v2, LD0/b;

    iget-object v3, v1, LA0/r;->c:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Ljava/util/Map;

    const/4 v6, 0x0

    iget-object v3, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    const-string v4, "GET"

    const/16 v7, 0x38

    invoke-direct/range {v2 .. v7}, LD0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)V

    const/4 v4, 0x2

    .line 254
    invoke-direct {v0, v4}, LC/j;-><init>(I)V

    iput-object v2, v0, LC/j;->c:Ljava/lang/Object;

    .line 255
    invoke-virtual {v0}, LC/j;->w()LD0/c;

    move-result-object v0

    iget-object v2, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v2, LM0/l;

    invoke-interface {v2, v0}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 256
    :pswitch_f
    iget-object v0, v1, LA0/r;->b:Ljava/lang/Object;

    check-cast v0, Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 257
    iget-object v0, v1, LA0/r;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_6c

    :cond_6b
    const/4 v2, 0x1

    goto :goto_51

    .line 258
    :cond_6c
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LE0/c;

    .line 259
    iget-object v3, v3, LE0/c;->b:Ljava/lang/Object;

    .line 260
    check-cast v3, LA0/t;

    .line 261
    iget-boolean v3, v3, LA0/t;->a:Z

    if-nez v3, :cond_6d

    const/4 v2, 0x0

    .line 262
    :goto_51
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6f

    :cond_6e
    const/4 v3, 0x0

    goto :goto_52

    .line 263
    :cond_6f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_70
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LE0/c;

    .line 264
    iget-object v4, v4, LE0/c;->b:Ljava/lang/Object;

    .line 265
    check-cast v4, LA0/t;

    .line 266
    iget-boolean v5, v4, LA0/t;->a:Z

    if-nez v5, :cond_70

    .line 267
    iget-boolean v4, v4, LA0/t;->c:Z

    if-eqz v4, :cond_70

    const/4 v3, 0x1

    .line 268
    :goto_52
    iget-object v4, v1, LA0/r;->c:Ljava/lang/Object;

    check-cast v4, Landroid/app/Activity;

    const-string v5, "unified_dexkit_scan_status_v16"

    const-string v6, "getApplicationContext(...)"

    if-eqz v2, :cond_71

    .line 269
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x1

    .line 270
    invoke-static {v5, v15}, LA0/l;->s(Ljava/lang/String;Z)V

    goto :goto_53

    :cond_71
    const/4 v15, 0x1

    .line 271
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/2addr v3, v15

    .line 272
    invoke-static {v5, v3}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 273
    :goto_53
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-eqz v2, :cond_72

    .line 274
    const-string v2, "\u9002\u914d\u5b8c\u6210"

    goto :goto_54

    :cond_72
    const-string v2, "\u9002\u914d\u5b8c\u6210\uff0c\u90e8\u5206\u672a\u6210\u529f"

    :goto_54
    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_74

    const/4 v5, 0x0

    :cond_73
    const/4 v15, 0x1

    goto :goto_56

    .line 276
    :cond_74
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :goto_55
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_73

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LE0/c;

    .line 277
    iget-object v6, v6, LE0/c;->b:Ljava/lang/Object;

    .line 278
    check-cast v6, LA0/t;

    .line 279
    iget-boolean v6, v6, LA0/t;->a:Z

    if-eqz v6, :cond_76

    const/4 v15, 0x1

    add-int/2addr v5, v15

    if-ltz v5, :cond_75

    goto :goto_55

    .line 280
    :cond_75
    invoke-static {}, LF0/l;->a0()V

    const/16 v22, 0x0

    throw v22

    :cond_76
    const/16 v22, 0x0

    goto :goto_55

    .line 281
    :goto_56
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v5

    .line 282
    new-instance v6, Landroid/widget/LinearLayout;

    invoke-direct {v6, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 283
    invoke-virtual {v6, v15}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 284
    sget-object v7, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/16 v7, 0x18

    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v8

    const/16 v9, 0x10

    invoke-static {v4, v9}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v10

    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v7

    const/4 v11, 0x4

    invoke-static {v4, v11}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v11

    invoke-virtual {v6, v8, v10, v7, v11}, Landroid/view/View;->setPadding(IIII)V

    .line 285
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    if-nez v3, :cond_77

    .line 286
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "\u5168\u90e8\u9002\u914d\u6210\u529f\uff0c\u5171 "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " \u9879"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_57

    .line 287
    :cond_77
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " \u9879\u6210\u529f\uff0c"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " \u9879\u672a\u6210\u529f"

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 288
    :goto_57
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v3, 0x41800000    # 16.0f

    .line 289
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 290
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v3, 0x1c

    .line 291
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 292
    invoke-virtual {v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 293
    new-instance v3, Landroid/widget/TextView;

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 294
    const-string v5, "\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548\u3002"

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v5, 0x41500000    # 13.0f

    .line 295
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v5, 0x78

    .line 296
    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v5, 0x6

    .line 297
    invoke-static {v4, v5}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v5

    const/16 v7, 0xc

    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v8

    const/4 v10, 0x0

    invoke-virtual {v3, v10, v5, v10, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 298
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 299
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_58
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LE0/c;

    .line 300
    iget-object v5, v3, LE0/c;->a:Ljava/lang/Object;

    .line 301
    check-cast v5, LA0/u;

    iget-object v3, v3, LE0/c;->b:Ljava/lang/Object;

    check-cast v3, LA0/t;

    .line 302
    iget-object v5, v5, LA0/u;->b:Ljava/lang/String;

    .line 303
    iget-boolean v3, v3, LA0/t;->a:Z

    if-eqz v3, :cond_78

    const/16 v8, 0x75

    const/16 v10, 0x54

    const/16 v11, 0x24

    .line 304
    invoke-static {v11, v8, v10}, Landroid/graphics/Color;->rgb(III)I

    move-result v8

    goto :goto_59

    :cond_78
    const/16 v8, 0xbe

    const/16 v10, 0x36

    invoke-static {v8, v10, v10}, Landroid/graphics/Color;->rgb(III)I

    move-result v8

    :goto_59
    const/16 v10, 0xee

    if-eqz v3, :cond_79

    const/16 v11, 0xf8

    const/16 v12, 0xf3

    .line 305
    invoke-static {v10, v11, v12}, Landroid/graphics/Color;->rgb(III)I

    move-result v10

    goto :goto_5a

    :cond_79
    const/16 v11, 0xfc

    invoke-static {v11, v10, v10}, Landroid/graphics/Color;->rgb(III)I

    move-result v10

    .line 306
    :goto_5a
    new-instance v11, Landroid/widget/LinearLayout;

    invoke-direct {v11, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v12, 0x0

    .line 307
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 308
    invoke-virtual {v11, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 309
    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v12

    const/16 v13, 0xa

    invoke-static {v4, v13}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v14

    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v15

    invoke-static {v4, v13}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v11, v12, v14, v15, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 310
    invoke-static {v4, v7}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v9

    invoke-static {v10, v9}, LA0/y;->d(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v9

    invoke-virtual {v11, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 311
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    const/4 v12, -0x1

    invoke-direct {v9, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v10, 0x8

    .line 312
    invoke-static {v4, v10}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v10

    iput v10, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 313
    invoke-virtual {v11, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 314
    new-instance v9, Landroid/widget/TextView;

    invoke-direct {v9, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    if-eqz v3, :cond_7a

    .line 315
    const-string v10, "\u2713"

    goto :goto_5b

    :cond_7a
    const-string v10, "!"

    :goto_5b
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v10, 0x11

    .line 316
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v10, 0x41600000    # 14.0f

    .line 317
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 318
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 319
    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setTextColor(I)V

    .line 320
    invoke-static {v4, v13}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v12

    invoke-static {v8, v12}, LA0/y;->d(II)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v8

    invoke-virtual {v9, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 321
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v12, 0x16

    invoke-static {v4, v12}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v15

    invoke-static {v4, v12}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v12

    invoke-direct {v8, v15, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 322
    invoke-static {v4, v13}, LA0/y;->b(Landroid/content/Context;I)I

    move-result v12

    iput v12, v8, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 323
    invoke-virtual {v9, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 324
    invoke-virtual {v11, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 325
    new-instance v8, Landroid/widget/TextView;

    invoke-direct {v8, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    if-eqz v3, :cond_7b

    .line 326
    const-string v3, "\u6210\u529f\uff1a"

    .line 327
    :goto_5c
    invoke-static {v3, v5}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5d

    .line 328
    :cond_7b
    const-string v3, "\u672a\u6210\u529f\uff1a"

    goto :goto_5c

    :goto_5d
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 330
    invoke-virtual {v8, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v3, 0x28

    .line 331
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 332
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 333
    invoke-virtual {v6, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v9, 0x10

    goto/16 :goto_58

    .line 334
    :cond_7c
    invoke-virtual {v2, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const/4 v6, 0x0

    .line 335
    invoke-virtual {v0, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 336
    new-instance v2, LA0/s;

    invoke-direct {v2, v6}, LA0/s;-><init>(I)V

    const-string v3, "\u91cd\u542f\u5fae\u4fe1"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 337
    new-instance v2, LA0/s;

    const/4 v15, 0x1

    invoke-direct {v2, v15}, LA0/s;-><init>(I)V

    const-string v3, "\u7a0d\u540e\u91cd\u542f"

    invoke-virtual {v0, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 338
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
