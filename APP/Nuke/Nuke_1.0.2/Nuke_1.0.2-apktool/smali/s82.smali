.class public final Ls82;
.super Lwj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final A:Ljava/lang/Class;

.field public final B:Lvp0;

.field public C:Lto0;

.field public D:Ljava/lang/Object;

.field public E:Ljava/util/ArrayList;

.field public F:Ls82;

.field public G:Ls82;

.field public final H:Z

.field public I:Z

.field public J:Z

.field public final y:Landroid/content/Context;

.field public final z:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz82;

    .line 2
    .line 3
    invoke-direct {v0}, Lwj;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lb90;->c:Lb90;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lwj;->h(Lb90;)Lwj;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lz82;

    .line 13
    .line 14
    invoke-virtual {v0}, Lwj;->o()Lwj;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lz82;

    .line 19
    .line 20
    invoke-virtual {v0}, Lwj;->s()Lwj;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lz82;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Lx82;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lwj;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ls82;->H:Z

    .line 6
    .line 7
    iput-object p2, p0, Ls82;->z:Lx82;

    .line 8
    .line 9
    iput-object p3, p0, Ls82;->A:Ljava/lang/Class;

    .line 10
    .line 11
    iput-object p4, p0, Ls82;->y:Landroid/content/Context;

    .line 12
    .line 13
    iget-object p4, p2, Lx82;->h:Lcom/bumptech/glide/a;

    .line 14
    .line 15
    iget-object p4, p4, Lcom/bumptech/glide/a;->j:Lvp0;

    .line 16
    .line 17
    iget-object p4, p4, Lvp0;->f:Lhg;

    .line 18
    .line 19
    invoke-virtual {p4, p3}, Luq2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lto0;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p4}, Lhg;->entrySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    check-cast p4, Lkb1;

    .line 32
    .line 33
    invoke-virtual {p4}, Lkb1;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Class;

    .line 54
    .line 55
    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lto0;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    if-nez v0, :cond_2

    .line 69
    .line 70
    sget-object v0, Lvp0;->k:Lto0;

    .line 71
    .line 72
    :cond_2
    iput-object v0, p0, Ls82;->C:Lto0;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/bumptech/glide/a;->j:Lvp0;

    .line 75
    .line 76
    iput-object p1, p0, Ls82;->B:Lvp0;

    .line 77
    .line 78
    iget-object p1, p2, Lx82;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    if-nez p3, :cond_3

    .line 95
    .line 96
    invoke-virtual {p0}, Ls82;->x()Ls82;

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-static {}, Lc80;->g()V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    throw p0

    .line 105
    :cond_4
    monitor-enter p2

    .line 106
    :try_start_0
    iget-object p1, p2, Lx82;->o:Lz82;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    .line 108
    monitor-exit p2

    .line 109
    invoke-virtual {p0, p1}, Ls82;->y(Lwj;)Ls82;

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    throw p0
.end method


# virtual methods
.method public final A()Ls82;
    .locals 2

    .line 1
    invoke-super {p0}, Lwj;->f()Lwj;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ls82;

    .line 6
    .line 7
    iget-object v0, p0, Ls82;->C:Lto0;

    .line 8
    .line 9
    invoke-virtual {v0}, Lto0;->a()Lto0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ls82;->C:Lto0;

    .line 14
    .line 15
    iget-object v0, p0, Ls82;->E:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v1, p0, Ls82;->E:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ls82;->E:Ljava/util/ArrayList;

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Ls82;->F:Ls82;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ls82;->A()Ls82;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, Ls82;->F:Ls82;

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Ls82;->G:Ls82;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ls82;->A()Ls82;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Ls82;->G:Ls82;

    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final B(Lby2;Lwj;)V
    .locals 10

    .line 1
    invoke-static {p1}, Lfg1;->p(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ls82;->I:Z

    .line 5
    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    new-instance v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v5, p0, Ls82;->C:Lto0;

    .line 14
    .line 15
    iget-object v6, p2, Lwj;->j:Li32;

    .line 16
    .line 17
    iget v7, p2, Lwj;->o:I

    .line 18
    .line 19
    iget v8, p2, Lwj;->n:I

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v9, p2

    .line 25
    invoke-virtual/range {v1 .. v9}, Ls82;->z(Ljava/lang/Object;Lby2;Lt82;Lto0;Li32;IILwj;)Ll82;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {v3}, Lby2;->u()Ll82;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p0, p1}, Ll82;->b(Ll82;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-boolean p2, v9, Lwj;->m:Z

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    invoke-interface {p1}, Ll82;->j()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p0, "Argument must not be null"

    .line 51
    .line 52
    invoke-static {p0, p1}, Lfg1;->q(Ljava/lang/String;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Ll82;->isRunning()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    invoke-interface {p1}, Ll82;->i()V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :cond_2
    :goto_0
    iget-object p1, v1, Ls82;->z:Lx82;

    .line 66
    .line 67
    invoke-virtual {p1, v3}, Lx82;->a(Lby2;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, p0}, Lby2;->o(Ll82;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, v1, Ls82;->z:Lx82;

    .line 74
    .line 75
    monitor-enter p1

    .line 76
    :try_start_0
    iget-object p2, p1, Lx82;->m:Lhh1;

    .line 77
    .line 78
    iget-object p2, p2, Lhh1;->i:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, Ljava/util/Set;

    .line 81
    .line 82
    invoke-interface {p2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    iget-object p2, p1, Lx82;->k:Ler2;

    .line 86
    .line 87
    const-string v0, "RequestTracker"

    .line 88
    .line 89
    iget-object v1, p2, Ler2;->j:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, Ljava/util/Set;

    .line 92
    .line 93
    invoke-interface {v1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    iget-boolean v1, p2, Ler2;->i:Z

    .line 97
    .line 98
    if-nez v1, :cond_3

    .line 99
    .line 100
    invoke-interface {p0}, Ll82;->i()V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-interface {p0}, Ll82;->clear()V

    .line 105
    .line 106
    .line 107
    const/4 v1, 0x2

    .line 108
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    const-string v1, "Paused, delaying request"

    .line 115
    .line 116
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    :cond_4
    iget-object p2, p2, Ler2;->k:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p2, Ljava/util/HashSet;

    .line 122
    .line 123
    invoke-virtual {p2, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    .line 126
    :goto_1
    monitor-exit p1

    .line 127
    return-void

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object p0, v0

    .line 130
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    throw p0

    .line 132
    :cond_5
    const-string p0, "You must call #load() before calling #into()"

    .line 133
    .line 134
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final C(Landroid/widget/ImageView;)V
    .locals 4

    .line 1
    invoke-static {}, Lb93;->a()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lfg1;->p(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x800

    .line 8
    .line 9
    iget v1, p0, Lwj;->h:I

    .line 10
    .line 11
    invoke-static {v1, v0}, Lwj;->k(II)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lp82;->a:[I

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    aget v0, v0, v2

    .line 35
    .line 36
    packed-switch v0, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_0
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v2, Lva0;->c:Lva0;

    .line 45
    .line 46
    new-instance v3, Lbq;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, Lwj;->l(Lva0;Lbl;)Lwj;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-boolean v1, v0, Lwj;->w:Z

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :pswitch_1
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v2, Lva0;->b:Lva0;

    .line 63
    .line 64
    new-instance v3, Lgj0;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2, v3}, Lwj;->l(Lva0;Lbl;)Lwj;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-boolean v1, v0, Lwj;->w:Z

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :pswitch_2
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    sget-object v2, Lva0;->c:Lva0;

    .line 81
    .line 82
    new-instance v3, Lbq;

    .line 83
    .line 84
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, v3}, Lwj;->l(Lva0;Lbl;)Lwj;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-boolean v1, v0, Lwj;->w:Z

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_3
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sget-object v2, Lva0;->d:Lva0;

    .line 99
    .line 100
    new-instance v3, Laq;

    .line 101
    .line 102
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v2, v3}, Lwj;->l(Lva0;Lbl;)Lwj;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_1

    .line 110
    :cond_0
    :goto_0
    move-object v0, p0

    .line 111
    :goto_1
    iget-object v2, p0, Ls82;->B:Lvp0;

    .line 112
    .line 113
    iget-object v2, v2, Lvp0;->c:Lz8;

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const-class v2, Landroid/graphics/Bitmap;

    .line 119
    .line 120
    iget-object v3, p0, Ls82;->A:Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_1

    .line 127
    .line 128
    new-instance v1, Lxk;

    .line 129
    .line 130
    const/4 v2, 0x0

    .line 131
    invoke-direct {v1, p1, v2}, Lxk;-><init>(Landroid/widget/ImageView;I)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_1
    const-class v2, Landroid/graphics/drawable/Drawable;

    .line 136
    .line 137
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_2

    .line 142
    .line 143
    new-instance v2, Lxk;

    .line 144
    .line 145
    invoke-direct {v2, p1, v1}, Lxk;-><init>(Landroid/widget/ImageView;I)V

    .line 146
    .line 147
    .line 148
    move-object v1, v2

    .line 149
    :goto_2
    invoke-virtual {p0, v1, v0}, Ls82;->B(Lby2;Lwj;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 154
    .line 155
    new-instance p1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v0, "Unhandled class: "

    .line 158
    .line 159
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v0, ", try .as*(Class).transcode(ResourceTranscoder)"

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final D(Ljava/lang/Object;)Ls82;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0, p1}, Ls82;->D(Ljava/lang/Object;)Ls82;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iput-object p1, p0, Ls82;->D:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Ls82;->I:Z

    .line 18
    .line 19
    invoke-virtual {p0}, Lwj;->p()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public final bridge synthetic a(Lwj;)Lwj;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls82;->y(Lwj;)Ls82;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ls82;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ls82;

    .line 6
    .line 7
    invoke-super {p0, p1}, Lwj;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ls82;->A:Ljava/lang/Class;

    .line 14
    .line 15
    iget-object v1, p1, Ls82;->A:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Ls82;->C:Lto0;

    .line 24
    .line 25
    iget-object v1, p1, Ls82;->C:Lto0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lto0;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Ls82;->D:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p1, Ls82;->D:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v0, p0, Ls82;->E:Ljava/util/ArrayList;

    .line 44
    .line 45
    iget-object v1, p1, Ls82;->E:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    iget-object v0, p0, Ls82;->F:Ls82;

    .line 54
    .line 55
    iget-object v1, p1, Ls82;->F:Ls82;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    iget-object v0, p0, Ls82;->G:Ls82;

    .line 64
    .line 65
    iget-object v1, p1, Ls82;->G:Ls82;

    .line 66
    .line 67
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_0

    .line 72
    .line 73
    iget-boolean v0, p0, Ls82;->H:Z

    .line 74
    .line 75
    iget-boolean v1, p1, Ls82;->H:Z

    .line 76
    .line 77
    if-ne v0, v1, :cond_0

    .line 78
    .line 79
    iget-boolean p0, p0, Ls82;->I:Z

    .line 80
    .line 81
    iget-boolean p1, p1, Ls82;->I:Z

    .line 82
    .line 83
    if-ne p0, p1, :cond_0

    .line 84
    .line 85
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_0
    const/4 p0, 0x0

    .line 88
    return p0
.end method

.method public final bridge synthetic f()Lwj;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lwj;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ls82;->A:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Ls82;->C:Lto0;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Ls82;->D:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Ls82;->E:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Ls82;->F:Ls82;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v1, p0, Ls82;->G:Ls82;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, v1}, Lb93;->h(ILjava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v1, p0, Ls82;->H:Z

    .line 47
    .line 48
    invoke-static {v1, v0}, Lb93;->g(II)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean p0, p0, Ls82;->I:Z

    .line 53
    .line 54
    invoke-static {p0, v0}, Lb93;->g(II)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0
.end method

.method public final x()Ls82;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lwj;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ls82;->A()Ls82;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ls82;->x()Ls82;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lwj;->p()V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final y(Lwj;)Ls82;
    .locals 0

    .line 1
    invoke-static {p1}, Lfg1;->p(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lwj;->a(Lwj;)Lwj;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ls82;

    .line 9
    .line 10
    return-object p0
.end method

.method public final z(Ljava/lang/Object;Lby2;Lt82;Lto0;Li32;IILwj;)Ll82;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v1, p4

    .line 6
    .line 7
    move-object/from16 v7, p8

    .line 8
    .line 9
    iget-object v2, v0, Ls82;->G:Ls82;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Ldg0;

    .line 15
    .line 16
    move-object/from16 v5, p3

    .line 17
    .line 18
    invoke-direct {v2, v4, v5}, Ldg0;-><init>(Ljava/lang/Object;Lt82;)V

    .line 19
    .line 20
    .line 21
    move-object v13, v2

    .line 22
    move-object/from16 v16, v13

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object/from16 v5, p3

    .line 26
    .line 27
    move-object/from16 v16, v3

    .line 28
    .line 29
    move-object v13, v5

    .line 30
    :goto_0
    iget-object v2, v0, Ls82;->F:Ls82;

    .line 31
    .line 32
    if-eqz v2, :cond_8

    .line 33
    .line 34
    iget-boolean v5, v0, Ls82;->J:Z

    .line 35
    .line 36
    if-nez v5, :cond_7

    .line 37
    .line 38
    iget-object v3, v2, Ls82;->C:Lto0;

    .line 39
    .line 40
    iget-boolean v5, v2, Ls82;->H:Z

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    move-object/from16 v17, v1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object/from16 v17, v3

    .line 48
    .line 49
    :goto_1
    const/16 v3, 0x8

    .line 50
    .line 51
    iget v2, v2, Lwj;->h:I

    .line 52
    .line 53
    invoke-static {v2, v3}, Lwj;->k(II)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v3, 0x1

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-object v2, v0, Ls82;->F:Ls82;

    .line 61
    .line 62
    iget-object v2, v2, Lwj;->j:Li32;

    .line 63
    .line 64
    :goto_2
    move-object/from16 v18, v2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    if-eq v2, v3, :cond_5

    .line 74
    .line 75
    const/4 v5, 0x2

    .line 76
    if-eq v2, v5, :cond_4

    .line 77
    .line 78
    const/4 v5, 0x3

    .line 79
    if-ne v2, v5, :cond_3

    .line 80
    .line 81
    sget-object v2, Li32;->j:Li32;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    iget-object v0, v0, Lwj;->j:Li32;

    .line 87
    .line 88
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v3, "unknown priority: "

    .line 91
    .line 92
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_4
    sget-object v2, Li32;->i:Li32;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    sget-object v2, Li32;->h:Li32;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :goto_3
    iget-object v2, v0, Ls82;->F:Ls82;

    .line 113
    .line 114
    iget v5, v2, Lwj;->o:I

    .line 115
    .line 116
    iget v2, v2, Lwj;->n:I

    .line 117
    .line 118
    invoke-static/range {p6 .. p7}, Lb93;->i(II)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_6

    .line 123
    .line 124
    iget-object v6, v0, Ls82;->F:Ls82;

    .line 125
    .line 126
    iget v8, v6, Lwj;->o:I

    .line 127
    .line 128
    iget v6, v6, Lwj;->n:I

    .line 129
    .line 130
    invoke-static {v8, v6}, Lb93;->i(II)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-nez v6, :cond_6

    .line 135
    .line 136
    iget v5, v7, Lwj;->o:I

    .line 137
    .line 138
    iget v2, v7, Lwj;->n:I

    .line 139
    .line 140
    :cond_6
    move/from16 v19, v2

    .line 141
    .line 142
    move/from16 v20, v5

    .line 143
    .line 144
    new-instance v2, Lm23;

    .line 145
    .line 146
    invoke-direct {v2, v4, v13}, Lm23;-><init>(Ljava/lang/Object;Lt82;)V

    .line 147
    .line 148
    .line 149
    move-object v13, v2

    .line 150
    iget-object v2, v0, Ls82;->y:Landroid/content/Context;

    .line 151
    .line 152
    move v5, v3

    .line 153
    iget-object v3, v0, Ls82;->B:Lvp0;

    .line 154
    .line 155
    move v6, v5

    .line 156
    iget-object v5, v0, Ls82;->D:Ljava/lang/Object;

    .line 157
    .line 158
    move v8, v6

    .line 159
    iget-object v6, v0, Ls82;->A:Ljava/lang/Class;

    .line 160
    .line 161
    iget-object v12, v0, Ls82;->E:Ljava/util/ArrayList;

    .line 162
    .line 163
    iget-object v14, v3, Lvp0;->g:Lbf0;

    .line 164
    .line 165
    iget-object v15, v1, Lto0;->h:Li51;

    .line 166
    .line 167
    new-instance v1, Lyq2;

    .line 168
    .line 169
    move-object/from16 v11, p2

    .line 170
    .line 171
    move-object/from16 v10, p5

    .line 172
    .line 173
    move/from16 v8, p6

    .line 174
    .line 175
    move/from16 v9, p7

    .line 176
    .line 177
    invoke-direct/range {v1 .. v15}, Lyq2;-><init>(Landroid/content/Context;Lvp0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lwj;IILi32;Lby2;Ljava/util/ArrayList;Lt82;Lbf0;Li51;)V

    .line 178
    .line 179
    .line 180
    move-object v10, v1

    .line 181
    const/4 v8, 0x1

    .line 182
    iput-boolean v8, v0, Ls82;->J:Z

    .line 183
    .line 184
    iget-object v1, v0, Ls82;->F:Ls82;

    .line 185
    .line 186
    move-object v9, v1

    .line 187
    move-object/from16 v2, p1

    .line 188
    .line 189
    move-object/from16 v3, p2

    .line 190
    .line 191
    move-object v4, v13

    .line 192
    move-object/from16 v5, v17

    .line 193
    .line 194
    move-object/from16 v6, v18

    .line 195
    .line 196
    move/from16 v8, v19

    .line 197
    .line 198
    move/from16 v7, v20

    .line 199
    .line 200
    invoke-virtual/range {v1 .. v9}, Ls82;->z(Ljava/lang/Object;Lby2;Lt82;Lto0;Li32;IILwj;)Ll82;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const/4 v2, 0x0

    .line 205
    iput-boolean v2, v0, Ls82;->J:Z

    .line 206
    .line 207
    iput-object v10, v13, Lm23;->c:Lyq2;

    .line 208
    .line 209
    iput-object v1, v13, Lm23;->d:Ll82;

    .line 210
    .line 211
    move-object/from16 v7, p8

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_7
    const-string v0, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    .line 215
    .line 216
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v3

    .line 220
    :cond_8
    iget-object v2, v0, Ls82;->y:Landroid/content/Context;

    .line 221
    .line 222
    iget-object v3, v0, Ls82;->B:Lvp0;

    .line 223
    .line 224
    iget-object v5, v0, Ls82;->D:Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v6, v0, Ls82;->A:Ljava/lang/Class;

    .line 227
    .line 228
    iget-object v12, v0, Ls82;->E:Ljava/util/ArrayList;

    .line 229
    .line 230
    iget-object v14, v3, Lvp0;->g:Lbf0;

    .line 231
    .line 232
    iget-object v15, v1, Lto0;->h:Li51;

    .line 233
    .line 234
    new-instance v1, Lyq2;

    .line 235
    .line 236
    move-object/from16 v4, p1

    .line 237
    .line 238
    move-object/from16 v11, p2

    .line 239
    .line 240
    move-object/from16 v10, p5

    .line 241
    .line 242
    move/from16 v8, p6

    .line 243
    .line 244
    move/from16 v9, p7

    .line 245
    .line 246
    move-object/from16 v7, p8

    .line 247
    .line 248
    invoke-direct/range {v1 .. v15}, Lyq2;-><init>(Landroid/content/Context;Lvp0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lwj;IILi32;Lby2;Ljava/util/ArrayList;Lt82;Lbf0;Li51;)V

    .line 249
    .line 250
    .line 251
    move-object v13, v1

    .line 252
    :goto_4
    if-nez v16, :cond_9

    .line 253
    .line 254
    return-object v13

    .line 255
    :cond_9
    iget-object v1, v0, Ls82;->G:Ls82;

    .line 256
    .line 257
    iget v2, v1, Lwj;->o:I

    .line 258
    .line 259
    iget v1, v1, Lwj;->n:I

    .line 260
    .line 261
    invoke-static/range {p6 .. p7}, Lb93;->i(II)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_a

    .line 266
    .line 267
    iget-object v3, v0, Ls82;->G:Ls82;

    .line 268
    .line 269
    iget v4, v3, Lwj;->o:I

    .line 270
    .line 271
    iget v3, v3, Lwj;->n:I

    .line 272
    .line 273
    invoke-static {v4, v3}, Lb93;->i(II)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-nez v3, :cond_a

    .line 278
    .line 279
    iget v2, v7, Lwj;->o:I

    .line 280
    .line 281
    iget v1, v7, Lwj;->n:I

    .line 282
    .line 283
    :cond_a
    move v7, v1

    .line 284
    move v6, v2

    .line 285
    iget-object v0, v0, Ls82;->G:Ls82;

    .line 286
    .line 287
    iget-object v4, v0, Ls82;->C:Lto0;

    .line 288
    .line 289
    iget-object v5, v0, Lwj;->j:Li32;

    .line 290
    .line 291
    move-object v8, v0

    .line 292
    move-object/from16 v1, p1

    .line 293
    .line 294
    move-object/from16 v2, p2

    .line 295
    .line 296
    move-object/from16 v3, v16

    .line 297
    .line 298
    invoke-virtual/range {v0 .. v8}, Ls82;->z(Ljava/lang/Object;Lby2;Lt82;Lto0;Li32;IILwj;)Ll82;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iput-object v13, v3, Ldg0;->c:Ll82;

    .line 303
    .line 304
    iput-object v0, v3, Ldg0;->d:Ll82;

    .line 305
    .line 306
    return-object v3
.end method
