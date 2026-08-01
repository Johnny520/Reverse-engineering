.class public final Landroidx/fragment/app/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ljava/util/ArrayList;

.field public D:Ljava/util/ArrayList;

.field public E:Ljava/util/ArrayList;

.field public F:Landroidx/fragment/app/B;

.field public final G:LD/b;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:LC/h;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Landroidx/fragment/app/s;

.field public g:Landroidx/activity/i;

.field public final h:Landroidx/fragment/app/u;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:LH/a;

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public m:I

.field public n:Landroidx/fragment/app/o;

.field public o:LD/h;

.field public p:Landroidx/fragment/app/l;

.field public q:Landroidx/fragment/app/l;

.field public final r:Landroidx/fragment/app/v;

.field public final s:LG/d;

.field public t:LH/a;

.field public u:LH/a;

.field public v:LH/a;

.field public w:Ljava/util/ArrayDeque;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, LC/h;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, LC/h;->b:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, LC/h;->c:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 31
    .line 32
    new-instance v0, Landroidx/fragment/app/s;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/z;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Landroidx/fragment/app/z;->f:Landroidx/fragment/app/s;

    .line 38
    .line 39
    new-instance v0, Landroidx/fragment/app/u;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/z;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 45
    .line 46
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Landroidx/fragment/app/z;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Landroidx/fragment/app/z;->j:Ljava/util/Map;

    .line 63
    .line 64
    new-instance v0, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    new-instance v0, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    new-instance v0, LG/d;

    .line 81
    .line 82
    invoke-direct {v0, p0}, LG/d;-><init>(Landroidx/fragment/app/z;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, LH/a;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, LH/a;->b:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object p0, v0, LH/a;->c:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v0, p0, Landroidx/fragment/app/z;->k:LH/a;

    .line 100
    .line 101
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Landroidx/fragment/app/z;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    const/4 v0, -0x1

    .line 109
    iput v0, p0, Landroidx/fragment/app/z;->m:I

    .line 110
    .line 111
    new-instance v0, Landroidx/fragment/app/v;

    .line 112
    .line 113
    invoke-direct {v0, p0}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/z;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Landroidx/fragment/app/z;->r:Landroidx/fragment/app/v;

    .line 117
    .line 118
    new-instance v0, LG/d;

    .line 119
    .line 120
    const/16 v1, 0x16

    .line 121
    .line 122
    invoke-direct {v0, v1}, LG/d;-><init>(I)V

    .line 123
    .line 124
    .line 125
    iput-object v0, p0, Landroidx/fragment/app/z;->s:LG/d;

    .line 126
    .line 127
    new-instance v0, Ljava/util/ArrayDeque;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, Landroidx/fragment/app/z;->w:Ljava/util/ArrayDeque;

    .line 133
    .line 134
    new-instance v0, LD/b;

    .line 135
    .line 136
    const/4 v1, 0x3

    .line 137
    invoke-direct {v0, v1, p0}, LD/b;-><init>(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Landroidx/fragment/app/z;->G:LD/b;

    .line 141
    .line 142
    return-void
.end method

.method public static E(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static F(Landroidx/fragment/app/l;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, LC/h;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroidx/fragment/app/F;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v1, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v1, 0x0

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 v0, 0x0

    .line 58
    move v1, v0

    .line 59
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Landroidx/fragment/app/l;

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-static {v2}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :cond_3
    if-eqz v1, :cond_2

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    return p0

    .line 81
    :cond_4
    return v0
.end method

.method public static G(Landroidx/fragment/app/l;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/l;->C:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/fragment/app/z;->G(Landroidx/fragment/app/l;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static H(Landroidx/fragment/app/l;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 5
    .line 6
    iget-object v1, v0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/fragment/app/z;->H(Landroidx/fragment/app/l;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static T(Landroidx/fragment/app/l;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/l;->z:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/l;->z:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Landroidx/fragment/app/l;->J:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Landroidx/fragment/app/l;->J:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Landroidx/fragment/app/l;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Landroidx/fragment/app/l;->x:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/z;->o:LD/h;

    .line 12
    .line 13
    invoke-virtual {v0}, LD/h;->H()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/z;->o:LD/h;

    .line 20
    .line 21
    iget p1, p1, Landroidx/fragment/app/l;->x:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LD/h;->G(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final B()Landroidx/fragment/app/v;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/z;->B()Landroidx/fragment/app/v;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->r:Landroidx/fragment/app/v;

    .line 13
    .line 14
    return-object v0
.end method

.method public final C()LG/d;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/z;->C()LG/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->s:LG/d;

    .line 13
    .line 14
    return-object v0
.end method

.method public final D(Landroidx/fragment/app/l;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Landroidx/fragment/app/l;->z:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Landroidx/fragment/app/l;->z:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/l;->J:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Landroidx/fragment/app/l;->J:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->S(Landroidx/fragment/app/l;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final I(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, Landroidx/fragment/app/z;->m:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_2
    iput p1, p0, Landroidx/fragment/app/z;->m:I

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 28
    .line 29
    iget-object p2, p1, LC/h;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p2, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p1, LC/h;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Ljava/util/HashMap;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroidx/fragment/app/l;

    .line 52
    .line 53
    iget-object v0, v0, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroidx/fragment/app/F;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Landroidx/fragment/app/F;->k()V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Landroidx/fragment/app/F;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, Landroidx/fragment/app/F;->k()V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 93
    .line 94
    iget-boolean v2, v1, Landroidx/fragment/app/l;->m:Z

    .line 95
    .line 96
    if-eqz v2, :cond_5

    .line 97
    .line 98
    iget v1, v1, Landroidx/fragment/app/l;->r:I

    .line 99
    .line 100
    if-lez v1, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-virtual {p1, v0}, LC/h;->s(Landroidx/fragment/app/F;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/z;->U()V

    .line 108
    .line 109
    .line 110
    iget-boolean p1, p0, Landroidx/fragment/app/z;->x:Z

    .line 111
    .line 112
    if-eqz p1, :cond_8

    .line 113
    .line 114
    iget-object p1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 115
    .line 116
    if-eqz p1, :cond_8

    .line 117
    .line 118
    iget p2, p0, Landroidx/fragment/app/z;->m:I

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    if-ne p2, v0, :cond_8

    .line 122
    .line 123
    iget-object p1, p1, Landroidx/fragment/app/o;->h:Le/i;

    .line 124
    .line 125
    invoke-virtual {p1}, Le/i;->i()Le/k;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Le/k;->b()V

    .line 130
    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    iput-boolean p1, p0, Landroidx/fragment/app/z;->x:Z

    .line 134
    .line 135
    :cond_8
    :goto_3
    return-void
.end method

.method public final J()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/z;->y:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/z;->z:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 12
    .line 13
    iput-boolean v0, v1, Landroidx/fragment/app/B;->i:Z

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 16
    .line 17
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroidx/fragment/app/l;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/fragment/app/z;->J()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final K()Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->v(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Landroidx/fragment/app/z;->u(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Landroidx/fragment/app/l;->e()Landroidx/fragment/app/z;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Landroidx/fragment/app/z;->K()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    return v1

    .line 24
    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v4, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    :goto_0
    move v2, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    sub-int/2addr v4, v1

    .line 39
    if-gez v4, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object v5, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move v2, v1

    .line 57
    :goto_1
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-boolean v1, p0, Landroidx/fragment/app/z;->b:Z

    .line 60
    .line 61
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object v3, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0, v1, v3}, Landroidx/fragment/app/z;->M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 74
    .line 75
    .line 76
    throw v0

    .line 77
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroidx/fragment/app/z;->V()V

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, Landroidx/fragment/app/z;->B:Z

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    iput-boolean v0, p0, Landroidx/fragment/app/z;->B:Z

    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/z;->U()V

    .line 87
    .line 88
    .line 89
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 90
    .line 91
    iget-object v0, v0, LC/h;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-interface {v0, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    return v2
.end method

.method public final L(Landroidx/fragment/app/l;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "remove: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " nesting="

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget v1, p1, Landroidx/fragment/app/l;->r:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "FragmentManager"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    iget v0, p1, Landroidx/fragment/app/l;->r:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x1

    .line 41
    if-lez v0, :cond_1

    .line 42
    .line 43
    move v0, v2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v0, v1

    .line 46
    :goto_0
    iget-boolean v3, p1, Landroidx/fragment/app/l;->A:Z

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return-void

    .line 54
    :cond_3
    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 55
    .line 56
    iget-object v3, v0, LC/h;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    monitor-enter v3

    .line 61
    :try_start_0
    iget-object v0, v0, LC/h;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    iput-boolean v1, p1, Landroidx/fragment/app/l;->l:Z

    .line 70
    .line 71
    invoke-static {p1}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iput-boolean v2, p0, Landroidx/fragment/app/z;->x:Z

    .line 78
    .line 79
    :cond_4
    iput-boolean v2, p1, Landroidx/fragment/app/l;->m:Z

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->S(Landroidx/fragment/app/l;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p1
.end method

.method public final M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroidx/fragment/app/a;

    .line 31
    .line 32
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Landroidx/fragment/app/z;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/fragment/app/a;

    .line 74
    .line 75
    iget-boolean v3, v3, Landroidx/fragment/app/a;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Landroidx/fragment/app/z;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Landroidx/fragment/app/z;->x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p2, "Internal error with the back stack records"

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public final N(Landroid/os/Parcelable;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move-object/from16 v1, p1

    .line 7
    .line 8
    check-cast v1, Landroidx/fragment/app/A;

    .line 9
    .line 10
    iget-object v2, v1, Landroidx/fragment/app/A;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/z;->c:LC/h;

    .line 16
    .line 17
    iget-object v3, v2, LC/h;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 22
    .line 23
    .line 24
    iget-object v3, v1, Landroidx/fragment/app/A;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x2

    .line 35
    iget-object v6, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 36
    .line 37
    const-string v7, "): "

    .line 38
    .line 39
    const-string v8, "FragmentManager"

    .line 40
    .line 41
    if-eqz v4, :cond_6

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    move-object v14, v4

    .line 48
    check-cast v14, Landroidx/fragment/app/D;

    .line 49
    .line 50
    if-eqz v14, :cond_2

    .line 51
    .line 52
    iget-object v4, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 53
    .line 54
    iget-object v4, v4, Landroidx/fragment/app/B;->d:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v9, v14, Landroidx/fragment/app/D;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v4, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Landroidx/fragment/app/l;

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_3

    .line 71
    .line 72
    new-instance v9, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v10, "restoreSaveState: re-attaching retained "

    .line 75
    .line 76
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    :cond_3
    new-instance v9, Landroidx/fragment/app/F;

    .line 90
    .line 91
    invoke-direct {v9, v6, v2, v4, v14}, Landroidx/fragment/app/F;-><init>(LH/a;LC/h;Landroidx/fragment/app/l;Landroidx/fragment/app/D;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance v9, Landroidx/fragment/app/F;

    .line 96
    .line 97
    iget-object v4, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 98
    .line 99
    iget-object v4, v4, Landroidx/fragment/app/o;->e:Le/i;

    .line 100
    .line 101
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    invoke-virtual {v0}, Landroidx/fragment/app/z;->B()Landroidx/fragment/app/v;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    iget-object v10, v0, Landroidx/fragment/app/z;->k:LH/a;

    .line 110
    .line 111
    iget-object v11, v0, Landroidx/fragment/app/z;->c:LC/h;

    .line 112
    .line 113
    invoke-direct/range {v9 .. v14}, Landroidx/fragment/app/F;-><init>(LH/a;LC/h;Ljava/lang/ClassLoader;Landroidx/fragment/app/v;Landroidx/fragment/app/D;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iget-object v4, v9, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 117
    .line 118
    iput-object v0, v4, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 119
    .line 120
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    new-instance v5, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v6, "restoreSaveState: active ("

    .line 129
    .line 130
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v6, v4, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-static {v8, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    :cond_5
    iget-object v4, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 152
    .line 153
    iget-object v4, v4, Landroidx/fragment/app/o;->e:Le/i;

    .line 154
    .line 155
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v9, v4}, Landroidx/fragment/app/F;->m(Ljava/lang/ClassLoader;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v9}, LC/h;->r(Landroidx/fragment/app/F;)V

    .line 163
    .line 164
    .line 165
    iget v4, v0, Landroidx/fragment/app/z;->m:I

    .line 166
    .line 167
    iput v4, v9, Landroidx/fragment/app/F;->e:I

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :cond_6
    iget-object v3, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v4, Ljava/util/ArrayList;

    .line 177
    .line 178
    iget-object v3, v3, Landroidx/fragment/app/B;->d:Ljava/util/HashMap;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    const/4 v10, 0x1

    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Landroidx/fragment/app/l;

    .line 203
    .line 204
    iget-object v11, v4, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v12, v2, LC/h;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v12, Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-virtual {v12, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    if-eqz v11, :cond_8

    .line 215
    .line 216
    move v9, v10

    .line 217
    goto :goto_4

    .line 218
    :cond_8
    const/4 v9, 0x0

    .line 219
    :goto_4
    if-nez v9, :cond_7

    .line 220
    .line 221
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_9

    .line 226
    .line 227
    new-instance v9, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v11, "Discarding retained Fragment "

    .line 230
    .line 231
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v11, " that was not found in the set of active Fragments "

    .line 238
    .line 239
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    iget-object v11, v1, Landroidx/fragment/app/A;->a:Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    :cond_9
    iget-object v9, v0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 255
    .line 256
    invoke-virtual {v9, v4}, Landroidx/fragment/app/B;->c(Landroidx/fragment/app/l;)V

    .line 257
    .line 258
    .line 259
    iput-object v0, v4, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 260
    .line 261
    new-instance v9, Landroidx/fragment/app/F;

    .line 262
    .line 263
    invoke-direct {v9, v6, v2, v4}, Landroidx/fragment/app/F;-><init>(LH/a;LC/h;Landroidx/fragment/app/l;)V

    .line 264
    .line 265
    .line 266
    iput v10, v9, Landroidx/fragment/app/F;->e:I

    .line 267
    .line 268
    invoke-virtual {v9}, Landroidx/fragment/app/F;->k()V

    .line 269
    .line 270
    .line 271
    iput-boolean v10, v4, Landroidx/fragment/app/l;->m:Z

    .line 272
    .line 273
    invoke-virtual {v9}, Landroidx/fragment/app/F;->k()V

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_a
    iget-object v3, v1, Landroidx/fragment/app/A;->b:Ljava/util/ArrayList;

    .line 278
    .line 279
    iget-object v4, v2, LC/h;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v4, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 284
    .line 285
    .line 286
    if-eqz v3, :cond_d

    .line 287
    .line 288
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-eqz v4, :cond_d

    .line 297
    .line 298
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    check-cast v4, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v2, v4}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    if-eqz v6, :cond_c

    .line 309
    .line 310
    invoke-static {v5}, Landroidx/fragment/app/z;->E(I)Z

    .line 311
    .line 312
    .line 313
    move-result v11

    .line 314
    if-eqz v11, :cond_b

    .line 315
    .line 316
    new-instance v11, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    const-string v12, "restoreSaveState: added ("

    .line 319
    .line 320
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v4

    .line 336
    invoke-static {v8, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    .line 338
    .line 339
    :cond_b
    invoke-virtual {v2, v6}, LC/h;->f(Landroidx/fragment/app/l;)V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 344
    .line 345
    const-string v2, "No instantiated fragment for ("

    .line 346
    .line 347
    const-string v3, ")"

    .line 348
    .line 349
    invoke-static {v2, v4, v3}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v1

    .line 357
    :cond_d
    iget-object v3, v1, Landroidx/fragment/app/A;->c:[Landroidx/fragment/app/b;

    .line 358
    .line 359
    const/4 v4, 0x0

    .line 360
    if-eqz v3, :cond_13

    .line 361
    .line 362
    new-instance v3, Ljava/util/ArrayList;

    .line 363
    .line 364
    iget-object v6, v1, Landroidx/fragment/app/A;->c:[Landroidx/fragment/app/b;

    .line 365
    .line 366
    array-length v6, v6

    .line 367
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 368
    .line 369
    .line 370
    iput-object v3, v0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 371
    .line 372
    const/4 v3, 0x0

    .line 373
    :goto_6
    iget-object v6, v1, Landroidx/fragment/app/A;->c:[Landroidx/fragment/app/b;

    .line 374
    .line 375
    array-length v11, v6

    .line 376
    if-ge v3, v11, :cond_12

    .line 377
    .line 378
    aget-object v6, v6, v3

    .line 379
    .line 380
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    new-instance v11, Landroidx/fragment/app/a;

    .line 384
    .line 385
    invoke-direct {v11, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/z;)V

    .line 386
    .line 387
    .line 388
    const/4 v12, 0x0

    .line 389
    const/4 v13, 0x0

    .line 390
    :goto_7
    iget-object v14, v6, Landroidx/fragment/app/b;->a:[I

    .line 391
    .line 392
    array-length v15, v14

    .line 393
    if-ge v12, v15, :cond_10

    .line 394
    .line 395
    new-instance v15, Landroidx/fragment/app/G;

    .line 396
    .line 397
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    add-int/lit8 v16, v12, 0x1

    .line 401
    .line 402
    move/from16 p1, v5

    .line 403
    .line 404
    aget v5, v14, v12

    .line 405
    .line 406
    iput v5, v15, Landroidx/fragment/app/G;->a:I

    .line 407
    .line 408
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/z;->E(I)Z

    .line 409
    .line 410
    .line 411
    move-result v5

    .line 412
    if-eqz v5, :cond_e

    .line 413
    .line 414
    new-instance v5, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    const-string v9, "Instantiate "

    .line 417
    .line 418
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v9, " op #"

    .line 425
    .line 426
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string v9, " base fragment #"

    .line 433
    .line 434
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    aget v9, v14, v16

    .line 438
    .line 439
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    invoke-static {v8, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 447
    .line 448
    .line 449
    :cond_e
    iget-object v5, v6, Landroidx/fragment/app/b;->b:Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    check-cast v5, Ljava/lang/String;

    .line 456
    .line 457
    if-eqz v5, :cond_f

    .line 458
    .line 459
    invoke-virtual {v2, v5}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    iput-object v5, v15, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 464
    .line 465
    goto :goto_8

    .line 466
    :cond_f
    iput-object v4, v15, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 467
    .line 468
    :goto_8
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    iget-object v9, v6, Landroidx/fragment/app/b;->c:[I

    .line 473
    .line 474
    aget v9, v9, v13

    .line 475
    .line 476
    aget-object v5, v5, v9

    .line 477
    .line 478
    iput-object v5, v15, Landroidx/fragment/app/G;->g:Landroidx/lifecycle/n;

    .line 479
    .line 480
    invoke-static {}, Landroidx/lifecycle/n;->values()[Landroidx/lifecycle/n;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    iget-object v9, v6, Landroidx/fragment/app/b;->d:[I

    .line 485
    .line 486
    aget v9, v9, v13

    .line 487
    .line 488
    aget-object v5, v5, v9

    .line 489
    .line 490
    iput-object v5, v15, Landroidx/fragment/app/G;->h:Landroidx/lifecycle/n;

    .line 491
    .line 492
    add-int/lit8 v5, v12, 0x2

    .line 493
    .line 494
    aget v9, v14, v16

    .line 495
    .line 496
    iput v9, v15, Landroidx/fragment/app/G;->c:I

    .line 497
    .line 498
    add-int/lit8 v16, v12, 0x3

    .line 499
    .line 500
    aget v5, v14, v5

    .line 501
    .line 502
    iput v5, v15, Landroidx/fragment/app/G;->d:I

    .line 503
    .line 504
    add-int/lit8 v17, v12, 0x4

    .line 505
    .line 506
    aget v4, v14, v16

    .line 507
    .line 508
    iput v4, v15, Landroidx/fragment/app/G;->e:I

    .line 509
    .line 510
    add-int/lit8 v12, v12, 0x5

    .line 511
    .line 512
    aget v14, v14, v17

    .line 513
    .line 514
    iput v14, v15, Landroidx/fragment/app/G;->f:I

    .line 515
    .line 516
    iput v9, v11, Landroidx/fragment/app/a;->b:I

    .line 517
    .line 518
    iput v5, v11, Landroidx/fragment/app/a;->c:I

    .line 519
    .line 520
    iput v4, v11, Landroidx/fragment/app/a;->d:I

    .line 521
    .line 522
    iput v14, v11, Landroidx/fragment/app/a;->e:I

    .line 523
    .line 524
    invoke-virtual {v11, v15}, Landroidx/fragment/app/a;->b(Landroidx/fragment/app/G;)V

    .line 525
    .line 526
    .line 527
    add-int/lit8 v13, v13, 0x1

    .line 528
    .line 529
    move/from16 v5, p1

    .line 530
    .line 531
    const/4 v4, 0x0

    .line 532
    goto/16 :goto_7

    .line 533
    .line 534
    :cond_10
    move/from16 p1, v5

    .line 535
    .line 536
    iget v4, v6, Landroidx/fragment/app/b;->e:I

    .line 537
    .line 538
    iput v4, v11, Landroidx/fragment/app/a;->f:I

    .line 539
    .line 540
    iget-object v4, v6, Landroidx/fragment/app/b;->f:Ljava/lang/String;

    .line 541
    .line 542
    iput-object v4, v11, Landroidx/fragment/app/a;->h:Ljava/lang/String;

    .line 543
    .line 544
    iget v4, v6, Landroidx/fragment/app/b;->g:I

    .line 545
    .line 546
    iput v4, v11, Landroidx/fragment/app/a;->q:I

    .line 547
    .line 548
    iput-boolean v10, v11, Landroidx/fragment/app/a;->g:Z

    .line 549
    .line 550
    iget v4, v6, Landroidx/fragment/app/b;->h:I

    .line 551
    .line 552
    iput v4, v11, Landroidx/fragment/app/a;->i:I

    .line 553
    .line 554
    iget-object v4, v6, Landroidx/fragment/app/b;->i:Ljava/lang/CharSequence;

    .line 555
    .line 556
    iput-object v4, v11, Landroidx/fragment/app/a;->j:Ljava/lang/CharSequence;

    .line 557
    .line 558
    iget v4, v6, Landroidx/fragment/app/b;->j:I

    .line 559
    .line 560
    iput v4, v11, Landroidx/fragment/app/a;->k:I

    .line 561
    .line 562
    iget-object v4, v6, Landroidx/fragment/app/b;->k:Ljava/lang/CharSequence;

    .line 563
    .line 564
    iput-object v4, v11, Landroidx/fragment/app/a;->l:Ljava/lang/CharSequence;

    .line 565
    .line 566
    iget-object v4, v6, Landroidx/fragment/app/b;->l:Ljava/util/ArrayList;

    .line 567
    .line 568
    iput-object v4, v11, Landroidx/fragment/app/a;->m:Ljava/util/ArrayList;

    .line 569
    .line 570
    iget-object v4, v6, Landroidx/fragment/app/b;->m:Ljava/util/ArrayList;

    .line 571
    .line 572
    iput-object v4, v11, Landroidx/fragment/app/a;->n:Ljava/util/ArrayList;

    .line 573
    .line 574
    iget-boolean v4, v6, Landroidx/fragment/app/b;->n:Z

    .line 575
    .line 576
    iput-boolean v4, v11, Landroidx/fragment/app/a;->o:Z

    .line 577
    .line 578
    invoke-virtual {v11, v10}, Landroidx/fragment/app/a;->c(I)V

    .line 579
    .line 580
    .line 581
    invoke-static/range {p1 .. p1}, Landroidx/fragment/app/z;->E(I)Z

    .line 582
    .line 583
    .line 584
    move-result v4

    .line 585
    if-eqz v4, :cond_11

    .line 586
    .line 587
    new-instance v4, Ljava/lang/StringBuilder;

    .line 588
    .line 589
    const-string v5, "restoreAllState: back stack #"

    .line 590
    .line 591
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    const-string v5, " (index "

    .line 598
    .line 599
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    iget v5, v11, Landroidx/fragment/app/a;->q:I

    .line 603
    .line 604
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-static {v8, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 618
    .line 619
    .line 620
    new-instance v4, Landroidx/fragment/app/I;

    .line 621
    .line 622
    invoke-direct {v4}, Landroidx/fragment/app/I;-><init>()V

    .line 623
    .line 624
    .line 625
    new-instance v5, Ljava/io/PrintWriter;

    .line 626
    .line 627
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 628
    .line 629
    .line 630
    const-string v4, "  "

    .line 631
    .line 632
    const/4 v6, 0x0

    .line 633
    invoke-virtual {v11, v4, v5, v6}, Landroidx/fragment/app/a;->d(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 637
    .line 638
    .line 639
    goto :goto_9

    .line 640
    :cond_11
    const/4 v6, 0x0

    .line 641
    :goto_9
    iget-object v4, v0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 642
    .line 643
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 644
    .line 645
    .line 646
    add-int/lit8 v3, v3, 0x1

    .line 647
    .line 648
    move/from16 v5, p1

    .line 649
    .line 650
    const/4 v4, 0x0

    .line 651
    goto/16 :goto_6

    .line 652
    .line 653
    :cond_12
    const/4 v6, 0x0

    .line 654
    goto :goto_a

    .line 655
    :cond_13
    move-object v3, v4

    .line 656
    const/4 v6, 0x0

    .line 657
    iput-object v3, v0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 658
    .line 659
    :goto_a
    iget-object v3, v0, Landroidx/fragment/app/z;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 660
    .line 661
    iget v4, v1, Landroidx/fragment/app/A;->d:I

    .line 662
    .line 663
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 664
    .line 665
    .line 666
    iget-object v3, v1, Landroidx/fragment/app/A;->e:Ljava/lang/String;

    .line 667
    .line 668
    if-eqz v3, :cond_14

    .line 669
    .line 670
    invoke-virtual {v2, v3}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    iput-object v2, v0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 675
    .line 676
    invoke-virtual {v0, v2}, Landroidx/fragment/app/z;->p(Landroidx/fragment/app/l;)V

    .line 677
    .line 678
    .line 679
    :cond_14
    iget-object v2, v1, Landroidx/fragment/app/A;->f:Ljava/util/ArrayList;

    .line 680
    .line 681
    if-eqz v2, :cond_15

    .line 682
    .line 683
    move v9, v6

    .line 684
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 685
    .line 686
    .line 687
    move-result v3

    .line 688
    if-ge v9, v3, :cond_15

    .line 689
    .line 690
    iget-object v3, v1, Landroidx/fragment/app/A;->g:Ljava/util/ArrayList;

    .line 691
    .line 692
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    check-cast v3, Landroid/os/Bundle;

    .line 697
    .line 698
    iget-object v4, v0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 699
    .line 700
    iget-object v4, v4, Landroidx/fragment/app/o;->e:Le/i;

    .line 701
    .line 702
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 707
    .line 708
    .line 709
    iget-object v4, v0, Landroidx/fragment/app/z;->j:Ljava/util/Map;

    .line 710
    .line 711
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    add-int/lit8 v9, v9, 0x1

    .line 719
    .line 720
    goto :goto_b

    .line 721
    :cond_15
    new-instance v2, Ljava/util/ArrayDeque;

    .line 722
    .line 723
    iget-object v1, v1, Landroidx/fragment/app/A;->h:Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 726
    .line 727
    .line 728
    iput-object v2, v0, Landroidx/fragment/app/z;->w:Ljava/util/ArrayDeque;

    .line 729
    .line 730
    return-void
.end method

.method public final O()Landroidx/fragment/app/A;
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/HashSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/fragment/app/i;

    .line 21
    .line 22
    iget-boolean v3, v1, Landroidx/fragment/app/i;->e:Z

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iput-boolean v2, v1, Landroidx/fragment/app/i;->e:Z

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/fragment/app/i;->c()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/HashSet;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroidx/fragment/app/i;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/fragment/app/i;->e()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v0, 0x1

    .line 57
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->v(Z)Z

    .line 58
    .line 59
    .line 60
    iput-boolean v0, p0, Landroidx/fragment/app/z;->y:Z

    .line 61
    .line 62
    iget-object v1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 63
    .line 64
    iput-boolean v0, v1, Landroidx/fragment/app/B;->i:Z

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v0, v0, LC/h;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, 0x2

    .line 97
    const/4 v5, 0x0

    .line 98
    if-eqz v3, :cond_10

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Landroidx/fragment/app/F;

    .line 105
    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    new-instance v6, Landroidx/fragment/app/D;

    .line 109
    .line 110
    iget-object v7, v3, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 111
    .line 112
    invoke-direct {v6, v7}, Landroidx/fragment/app/D;-><init>(Landroidx/fragment/app/l;)V

    .line 113
    .line 114
    .line 115
    iget v8, v7, Landroidx/fragment/app/l;->b:I

    .line 116
    .line 117
    const/4 v9, -0x1

    .line 118
    if-le v8, v9, :cond_e

    .line 119
    .line 120
    iget-object v8, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 121
    .line 122
    if-nez v8, :cond_e

    .line 123
    .line 124
    new-instance v8, Landroid/os/Bundle;

    .line 125
    .line 126
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v9, v7, Landroidx/fragment/app/l;->P:LM/e;

    .line 130
    .line 131
    invoke-virtual {v9, v8}, LM/e;->e(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    iget-object v9, v7, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 135
    .line 136
    invoke-virtual {v9}, Landroidx/fragment/app/z;->O()Landroidx/fragment/app/A;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    if-eqz v9, :cond_4

    .line 141
    .line 142
    const-string v10, "android:support:fragments"

    .line 143
    .line 144
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-object v9, v3, Landroidx/fragment/app/F;->a:LH/a;

    .line 148
    .line 149
    invoke-virtual {v9, v2}, LH/a;->l(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eqz v9, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    move-object v5, v8

    .line 160
    :goto_3
    iget-object v8, v7, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 161
    .line 162
    if-eqz v8, :cond_6

    .line 163
    .line 164
    invoke-virtual {v3}, Landroidx/fragment/app/F;->o()V

    .line 165
    .line 166
    .line 167
    :cond_6
    iget-object v3, v7, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 168
    .line 169
    if-eqz v3, :cond_8

    .line 170
    .line 171
    if-nez v5, :cond_7

    .line 172
    .line 173
    new-instance v5, Landroid/os/Bundle;

    .line 174
    .line 175
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 176
    .line 177
    .line 178
    :cond_7
    const-string v3, "android:view_state"

    .line 179
    .line 180
    iget-object v8, v7, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 181
    .line 182
    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 183
    .line 184
    .line 185
    :cond_8
    iget-object v3, v7, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 186
    .line 187
    if-eqz v3, :cond_a

    .line 188
    .line 189
    if-nez v5, :cond_9

    .line 190
    .line 191
    new-instance v5, Landroid/os/Bundle;

    .line 192
    .line 193
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 194
    .line 195
    .line 196
    :cond_9
    const-string v3, "android:view_registry_state"

    .line 197
    .line 198
    iget-object v8, v7, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 199
    .line 200
    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    :cond_a
    iget-boolean v3, v7, Landroidx/fragment/app/l;->H:Z

    .line 204
    .line 205
    if-nez v3, :cond_c

    .line 206
    .line 207
    if-nez v5, :cond_b

    .line 208
    .line 209
    new-instance v5, Landroid/os/Bundle;

    .line 210
    .line 211
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 212
    .line 213
    .line 214
    :cond_b
    const-string v3, "android:user_visible_hint"

    .line 215
    .line 216
    iget-boolean v8, v7, Landroidx/fragment/app/l;->H:Z

    .line 217
    .line 218
    invoke-virtual {v5, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 219
    .line 220
    .line 221
    :cond_c
    iput-object v5, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 222
    .line 223
    iget-object v3, v7, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 224
    .line 225
    if-eqz v3, :cond_f

    .line 226
    .line 227
    if-nez v5, :cond_d

    .line 228
    .line 229
    new-instance v3, Landroid/os/Bundle;

    .line 230
    .line 231
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 232
    .line 233
    .line 234
    iput-object v3, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 235
    .line 236
    :cond_d
    iget-object v3, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 237
    .line 238
    const-string v5, "android:target_state"

    .line 239
    .line 240
    iget-object v8, v7, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v3, v5, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    iget v3, v7, Landroidx/fragment/app/l;->j:I

    .line 246
    .line 247
    if-eqz v3, :cond_f

    .line 248
    .line 249
    iget-object v5, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 250
    .line 251
    const-string v8, "android:target_req_state"

    .line 252
    .line 253
    invoke-virtual {v5, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_e
    iget-object v3, v7, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 258
    .line 259
    iput-object v3, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 260
    .line 261
    :cond_f
    :goto_4
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    if-eqz v3, :cond_3

    .line 269
    .line 270
    new-instance v3, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v4, "Saved state of "

    .line 273
    .line 274
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    const-string v4, ": "

    .line 281
    .line 282
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    iget-object v4, v6, Landroidx/fragment/app/D;->m:Landroid/os/Bundle;

    .line 286
    .line 287
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    const-string v4, "FragmentManager"

    .line 295
    .line 296
    invoke-static {v4, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 297
    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_12

    .line 306
    .line 307
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_11

    .line 312
    .line 313
    const-string v0, "FragmentManager"

    .line 314
    .line 315
    const-string v1, "saveAllState: no fragments!"

    .line 316
    .line 317
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 318
    .line 319
    .line 320
    :cond_11
    return-object v5

    .line 321
    :cond_12
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 322
    .line 323
    iget-object v3, v0, LC/h;->b:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v3, Ljava/util/ArrayList;

    .line 326
    .line 327
    monitor-enter v3

    .line 328
    :try_start_0
    iget-object v6, v0, LC/h;->b:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v6, Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_13

    .line 337
    .line 338
    monitor-exit v3

    .line 339
    move-object v6, v5

    .line 340
    goto :goto_6

    .line 341
    :catchall_0
    move-exception v0

    .line 342
    goto/16 :goto_8

    .line 343
    .line 344
    :cond_13
    new-instance v6, Ljava/util/ArrayList;

    .line 345
    .line 346
    iget-object v7, v0, LC/h;->b:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v7, Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 355
    .line 356
    .line 357
    iget-object v0, v0, LC/h;->b:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Ljava/util/ArrayList;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    :cond_14
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v7

    .line 369
    if-eqz v7, :cond_15

    .line 370
    .line 371
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v7

    .line 375
    check-cast v7, Landroidx/fragment/app/l;

    .line 376
    .line 377
    iget-object v8, v7, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 378
    .line 379
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 383
    .line 384
    .line 385
    move-result v8

    .line 386
    if-eqz v8, :cond_14

    .line 387
    .line 388
    const-string v8, "FragmentManager"

    .line 389
    .line 390
    new-instance v9, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const-string v10, "saveAllState: adding fragment ("

    .line 396
    .line 397
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    iget-object v10, v7, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 401
    .line 402
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v10, "): "

    .line 406
    .line 407
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-static {v8, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_15
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 422
    :goto_6
    iget-object v0, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 423
    .line 424
    if-eqz v0, :cond_17

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-lez v0, :cond_17

    .line 431
    .line 432
    new-array v3, v0, [Landroidx/fragment/app/b;

    .line 433
    .line 434
    :goto_7
    if-ge v2, v0, :cond_18

    .line 435
    .line 436
    new-instance v7, Landroidx/fragment/app/b;

    .line 437
    .line 438
    iget-object v8, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 439
    .line 440
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    check-cast v8, Landroidx/fragment/app/a;

    .line 445
    .line 446
    invoke-direct {v7, v8}, Landroidx/fragment/app/b;-><init>(Landroidx/fragment/app/a;)V

    .line 447
    .line 448
    .line 449
    aput-object v7, v3, v2

    .line 450
    .line 451
    invoke-static {v4}, Landroidx/fragment/app/z;->E(I)Z

    .line 452
    .line 453
    .line 454
    move-result v7

    .line 455
    if-eqz v7, :cond_16

    .line 456
    .line 457
    const-string v7, "FragmentManager"

    .line 458
    .line 459
    new-instance v8, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    const-string v9, "saveAllState: adding back stack #"

    .line 462
    .line 463
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    const-string v9, ": "

    .line 470
    .line 471
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    iget-object v9, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 488
    .line 489
    .line 490
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 491
    .line 492
    goto :goto_7

    .line 493
    :cond_17
    move-object v3, v5

    .line 494
    :cond_18
    new-instance v0, Landroidx/fragment/app/A;

    .line 495
    .line 496
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 497
    .line 498
    .line 499
    iput-object v5, v0, Landroidx/fragment/app/A;->e:Ljava/lang/String;

    .line 500
    .line 501
    new-instance v2, Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 504
    .line 505
    .line 506
    iput-object v2, v0, Landroidx/fragment/app/A;->f:Ljava/util/ArrayList;

    .line 507
    .line 508
    new-instance v4, Ljava/util/ArrayList;

    .line 509
    .line 510
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 511
    .line 512
    .line 513
    iput-object v4, v0, Landroidx/fragment/app/A;->g:Ljava/util/ArrayList;

    .line 514
    .line 515
    iput-object v1, v0, Landroidx/fragment/app/A;->a:Ljava/util/ArrayList;

    .line 516
    .line 517
    iput-object v6, v0, Landroidx/fragment/app/A;->b:Ljava/util/ArrayList;

    .line 518
    .line 519
    iput-object v3, v0, Landroidx/fragment/app/A;->c:[Landroidx/fragment/app/b;

    .line 520
    .line 521
    iget-object v1, p0, Landroidx/fragment/app/z;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    iput v1, v0, Landroidx/fragment/app/A;->d:I

    .line 528
    .line 529
    iget-object v1, p0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 530
    .line 531
    if-eqz v1, :cond_19

    .line 532
    .line 533
    iget-object v1, v1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 534
    .line 535
    iput-object v1, v0, Landroidx/fragment/app/A;->e:Ljava/lang/String;

    .line 536
    .line 537
    :cond_19
    iget-object v1, p0, Landroidx/fragment/app/z;->j:Ljava/util/Map;

    .line 538
    .line 539
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 540
    .line 541
    .line 542
    move-result-object v1

    .line 543
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 544
    .line 545
    .line 546
    iget-object v1, p0, Landroidx/fragment/app/z;->j:Ljava/util/Map;

    .line 547
    .line 548
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 553
    .line 554
    .line 555
    new-instance v1, Ljava/util/ArrayList;

    .line 556
    .line 557
    iget-object v2, p0, Landroidx/fragment/app/z;->w:Ljava/util/ArrayDeque;

    .line 558
    .line 559
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 560
    .line 561
    .line 562
    iput-object v1, v0, Landroidx/fragment/app/A;->h:Ljava/util/ArrayList;

    .line 563
    .line 564
    return-object v0

    .line 565
    :goto_8
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 566
    throw v0
.end method

.method public final P(Landroidx/fragment/app/l;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->A(Landroidx/fragment/app/l;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/q;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/q;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/q;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Q(Landroidx/fragment/app/l;Landroidx/lifecycle/n;)V
    .locals 2

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Landroidx/fragment/app/l;->L:Landroidx/lifecycle/n;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Fragment "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2
.end method

.method public final R(Landroidx/fragment/app/l;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Fragment "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 55
    .line 56
    iput-object p1, p0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->p(Landroidx/fragment/app/l;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->p(Landroidx/fragment/app/l;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final S(Landroidx/fragment/app/l;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->A(Landroidx/fragment/app/l;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, Landroidx/fragment/app/k;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, Landroidx/fragment/app/k;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, Landroidx/fragment/app/k;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, Landroidx/fragment/app/k;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f0900c3

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/fragment/app/l;

    .line 56
    .line 57
    iget-object p1, p1, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Landroidx/fragment/app/k;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Landroidx/fragment/app/k;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final U()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/h;->k()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/F;

    .line 22
    .line 23
    iget-object v2, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 24
    .line 25
    iget-boolean v3, v2, Landroidx/fragment/app/l;->G:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Landroidx/fragment/app/z;->b:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Landroidx/fragment/app/z;->B:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Landroidx/fragment/app/l;->G:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/fragment/app/F;->k()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final V()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 14
    .line 15
    iput-boolean v2, v1, Landroidx/fragment/app/u;->a:Z

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_2

    .line 21
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget-object v0, p0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v3

    .line 35
    :goto_0
    if-lez v1, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 38
    .line 39
    invoke-static {v1}, Landroidx/fragment/app/z;->H(Landroidx/fragment/app/l;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v2, v3

    .line 47
    :goto_1
    iput-boolean v2, v0, Landroidx/fragment/app/u;->a:Z

    .line 48
    .line 49
    return-void

    .line 50
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v1
.end method

.method public final a(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "add: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object p0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, LC/h;->r(Landroidx/fragment/app/F;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v2, p1, Landroidx/fragment/app/l;->A:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, p1}, LC/h;->f(Landroidx/fragment/app/l;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, p1, Landroidx/fragment/app/l;->m:Z

    .line 47
    .line 48
    iget-object v2, p1, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    iput-boolean v1, p1, Landroidx/fragment/app/l;->J:Z

    .line 53
    .line 54
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    iput-boolean p1, p0, Landroidx/fragment/app/z;->x:Z

    .line 62
    .line 63
    :cond_2
    return-object v0
.end method

.method public final b(Landroidx/fragment/app/o;LD/h;Landroidx/fragment/app/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 2
    .line 3
    if-nez v0, :cond_c

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/fragment/app/z;->o:LD/h;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/z;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroidx/fragment/app/w;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Landroidx/fragment/app/w;-><init>(Landroidx/fragment/app/l;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/z;->V()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Landroidx/fragment/app/o;->h:Le/i;

    .line 39
    .line 40
    iget-object p2, p2, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 41
    .line 42
    iput-object p2, p0, Landroidx/fragment/app/z;->g:Landroidx/activity/i;

    .line 43
    .line 44
    if-eqz p3, :cond_3

    .line 45
    .line 46
    move-object v0, p3

    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move-object v0, p1

    .line 49
    :goto_1
    iget-object v1, p0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 50
    .line 51
    invoke-virtual {p2, v0, v1}, Landroidx/activity/i;->a(Landroidx/lifecycle/s;Landroidx/fragment/app/u;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    const/4 p2, 0x0

    .line 55
    if-eqz p3, :cond_6

    .line 56
    .line 57
    iget-object p1, p3, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 58
    .line 59
    iget-object p1, p1, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 60
    .line 61
    iget-object v0, p1, Landroidx/fragment/app/B;->e:Ljava/util/HashMap;

    .line 62
    .line 63
    iget-object v1, p3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Landroidx/fragment/app/B;

    .line 70
    .line 71
    if-nez v1, :cond_5

    .line 72
    .line 73
    new-instance v1, Landroidx/fragment/app/B;

    .line 74
    .line 75
    iget-boolean p1, p1, Landroidx/fragment/app/B;->g:Z

    .line 76
    .line 77
    invoke-direct {v1, p1}, Landroidx/fragment/app/B;-><init>(Z)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_5
    iput-object v1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    if-eqz p1, :cond_7

    .line 89
    .line 90
    iget-object p1, p1, Landroidx/fragment/app/o;->h:Le/i;

    .line 91
    .line 92
    invoke-virtual {p1}, Landroidx/activity/g;->getViewModelStore()Landroidx/lifecycle/P;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance v0, LC/h;

    .line 97
    .line 98
    sget-object v1, Landroidx/fragment/app/B;->j:LG/d;

    .line 99
    .line 100
    invoke-direct {v0, p1, v1}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 101
    .line 102
    .line 103
    const-class p1, Landroidx/fragment/app/B;

    .line 104
    .line 105
    invoke-virtual {v0, p1}, LC/h;->i(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Landroidx/fragment/app/B;

    .line 110
    .line 111
    iput-object p1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    new-instance p1, Landroidx/fragment/app/B;

    .line 115
    .line 116
    invoke-direct {p1, p2}, Landroidx/fragment/app/B;-><init>(Z)V

    .line 117
    .line 118
    .line 119
    iput-object p1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 120
    .line 121
    :goto_2
    iget-object p1, p0, Landroidx/fragment/app/z;->F:Landroidx/fragment/app/B;

    .line 122
    .line 123
    iget-boolean v0, p0, Landroidx/fragment/app/z;->y:Z

    .line 124
    .line 125
    if-nez v0, :cond_8

    .line 126
    .line 127
    iget-boolean v0, p0, Landroidx/fragment/app/z;->z:Z

    .line 128
    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    :cond_8
    const/4 p2, 0x1

    .line 132
    :cond_9
    iput-boolean p2, p1, Landroidx/fragment/app/B;->i:Z

    .line 133
    .line 134
    iget-object p2, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 135
    .line 136
    iput-object p1, p2, LC/h;->d:Ljava/lang/Object;

    .line 137
    .line 138
    iget-object p1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 139
    .line 140
    if-eqz p1, :cond_b

    .line 141
    .line 142
    iget-object p1, p1, Landroidx/fragment/app/o;->h:Le/i;

    .line 143
    .line 144
    if-eqz p3, :cond_a

    .line 145
    .line 146
    new-instance p2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    iget-object p3, p3, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 152
    .line 153
    const-string v0, ":"

    .line 154
    .line 155
    invoke-static {p2, p3, v0}, LL/d;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    goto :goto_3

    .line 160
    :cond_a
    const-string p2, ""

    .line 161
    .line 162
    :goto_3
    const-string p3, "FragmentManager:"

    .line 163
    .line 164
    invoke-static {p3, p2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    new-instance p3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v0, "StartActivityForResult"

    .line 177
    .line 178
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    new-instance v0, Landroidx/fragment/app/x;

    .line 186
    .line 187
    const/4 v1, 0x2

    .line 188
    invoke-direct {v0, v1}, Landroidx/fragment/app/x;-><init>(I)V

    .line 189
    .line 190
    .line 191
    new-instance v1, Landroidx/fragment/app/t;

    .line 192
    .line 193
    const/4 v2, 0x2

    .line 194
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/z;I)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p1, Landroidx/activity/g;->j:Landroidx/activity/e;

    .line 198
    .line 199
    invoke-virtual {p1, p3, v0, v1}, Landroidx/activity/e;->b(Ljava/lang/String;LD/h;Landroidx/fragment/app/t;)LH/a;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    iput-object p3, p0, Landroidx/fragment/app/z;->t:LH/a;

    .line 204
    .line 205
    new-instance p3, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v0, "StartIntentSenderForResult"

    .line 214
    .line 215
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p3

    .line 222
    new-instance v0, Landroidx/fragment/app/x;

    .line 223
    .line 224
    const/4 v1, 0x0

    .line 225
    invoke-direct {v0, v1}, Landroidx/fragment/app/x;-><init>(I)V

    .line 226
    .line 227
    .line 228
    new-instance v1, Landroidx/fragment/app/t;

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/z;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, p3, v0, v1}, Landroidx/activity/e;->b(Ljava/lang/String;LD/h;Landroidx/fragment/app/t;)LH/a;

    .line 235
    .line 236
    .line 237
    move-result-object p3

    .line 238
    iput-object p3, p0, Landroidx/fragment/app/z;->u:LH/a;

    .line 239
    .line 240
    new-instance p3, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string p2, "RequestPermissions"

    .line 249
    .line 250
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    new-instance p3, Landroidx/fragment/app/x;

    .line 258
    .line 259
    const/4 v0, 0x1

    .line 260
    invoke-direct {p3, v0}, Landroidx/fragment/app/x;-><init>(I)V

    .line 261
    .line 262
    .line 263
    new-instance v0, Landroidx/fragment/app/t;

    .line 264
    .line 265
    const/4 v1, 0x1

    .line 266
    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/z;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1, p2, p3, v0}, Landroidx/activity/e;->b(Ljava/lang/String;LD/h;Landroidx/fragment/app/t;)LH/a;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    iput-object p1, p0, Landroidx/fragment/app/z;->v:LH/a;

    .line 274
    .line 275
    :cond_b
    return-void

    .line 276
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    const-string p2, "Already attached"

    .line 279
    .line 280
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1
.end method

.method public final c(Landroidx/fragment/app/l;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/l;->A:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/l;->A:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Landroidx/fragment/app/l;->l:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, LC/h;->f(Landroidx/fragment/app/l;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Landroidx/fragment/app/z;->x:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/z;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 7
    .line 8
    invoke-virtual {v1}, LC/h;->k()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroidx/fragment/app/F;

    .line 27
    .line 28
    iget-object v2, v2, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 29
    .line 30
    iget-object v2, v2, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/z;->C()LG/d;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object v0
.end method

.method public final f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 4
    .line 5
    iget-object v2, v1, LC/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/fragment/app/F;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/F;

    .line 19
    .line 20
    iget-object v2, p0, Landroidx/fragment/app/z;->k:LH/a;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/F;-><init>(LH/a;LC/h;Landroidx/fragment/app/l;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 26
    .line 27
    iget-object p1, p1, Landroidx/fragment/app/o;->e:Le/i;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/F;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Landroidx/fragment/app/z;->m:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/F;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(Landroidx/fragment/app/l;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Landroidx/fragment/app/l;->A:Z

    .line 28
    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p1, Landroidx/fragment/app/l;->A:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Landroidx/fragment/app/l;->l:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v0}, Landroidx/fragment/app/z;->E(I)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 62
    .line 63
    iget-object v2, v0, LC/h;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v2

    .line 68
    :try_start_0
    iget-object v0, v0, LC/h;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Landroidx/fragment/app/l;->l:Z

    .line 78
    .line 79
    invoke-static {p1}, Landroidx/fragment/app/z;->F(Landroidx/fragment/app/l;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v1, p0, Landroidx/fragment/app/z;->x:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->S(Landroidx/fragment/app/l;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    return-void
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/l;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/z;->h()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/l;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/l;->z:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/z;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final j()Z
    .locals 7

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Landroidx/fragment/app/l;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Landroidx/fragment/app/z;->G(Landroidx/fragment/app/l;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Landroidx/fragment/app/l;->z:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 45
    .line 46
    invoke-virtual {v6}, Landroidx/fragment/app/z;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroidx/fragment/app/l;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final k()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/z;->A:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->v(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroidx/fragment/app/i;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/i;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, -0x1

    .line 32
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->s(I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 37
    .line 38
    iput-object v0, p0, Landroidx/fragment/app/z;->o:LD/h;

    .line 39
    .line 40
    iput-object v0, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 41
    .line 42
    iget-object v1, p0, Landroidx/fragment/app/z;->g:Landroidx/activity/i;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/fragment/app/z;->h:Landroidx/fragment/app/u;

    .line 47
    .line 48
    iget-object v1, v1, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Landroidx/activity/a;

    .line 65
    .line 66
    invoke-interface {v2}, Landroidx/activity/a;->cancel()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iput-object v0, p0, Landroidx/fragment/app/z;->g:Landroidx/activity/i;

    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/z;->t:LH/a;

    .line 73
    .line 74
    if-eqz v0, :cond_f

    .line 75
    .line 76
    iget-object v1, v0, LH/a;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Landroidx/activity/e;

    .line 79
    .line 80
    iget-object v2, v1, Landroidx/activity/e;->e:Ljava/util/ArrayList;

    .line 81
    .line 82
    iget-object v0, v0, LH/a;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_3

    .line 91
    .line 92
    iget-object v2, v1, Landroidx/activity/e;->c:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/lang/Integer;

    .line 99
    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    iget-object v3, v1, Landroidx/activity/e;->b:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    :cond_3
    iget-object v2, v1, Landroidx/activity/e;->f:Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    iget-object v2, v1, Landroidx/activity/e;->g:Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    const-string v4, "ActivityResultRegistry"

    .line 119
    .line 120
    const-string v5, "Dropping pending result for request "

    .line 121
    .line 122
    const-string v6, ": "

    .line 123
    .line 124
    if-eqz v3, :cond_4

    .line 125
    .line 126
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-object v2, v1, Landroidx/activity/e;->h:Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    iget-object v1, v1, Landroidx/activity/e;->d:Ljava/util/HashMap;

    .line 177
    .line 178
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-nez v0, :cond_e

    .line 183
    .line 184
    iget-object v0, p0, Landroidx/fragment/app/z;->u:LH/a;

    .line 185
    .line 186
    iget-object v1, v0, LH/a;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Landroidx/activity/e;

    .line 189
    .line 190
    iget-object v2, v1, Landroidx/activity/e;->e:Ljava/util/ArrayList;

    .line 191
    .line 192
    iget-object v0, v0, LH/a;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_6

    .line 201
    .line 202
    iget-object v2, v1, Landroidx/activity/e;->c:Ljava/util/HashMap;

    .line 203
    .line 204
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v2, :cond_6

    .line 211
    .line 212
    iget-object v3, v1, Landroidx/activity/e;->b:Ljava/util/HashMap;

    .line 213
    .line 214
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_6
    iget-object v2, v1, Landroidx/activity/e;->f:Ljava/util/HashMap;

    .line 218
    .line 219
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    iget-object v2, v1, Landroidx/activity/e;->g:Ljava/util/HashMap;

    .line 223
    .line 224
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_7

    .line 229
    .line 230
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_7
    iget-object v2, v1, Landroidx/activity/e;->h:Landroid/os/Bundle;

    .line 252
    .line 253
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-eqz v3, :cond_8

    .line 258
    .line 259
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_8
    iget-object v1, v1, Landroidx/activity/e;->d:Ljava/util/HashMap;

    .line 281
    .line 282
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-nez v0, :cond_d

    .line 287
    .line 288
    iget-object v0, p0, Landroidx/fragment/app/z;->v:LH/a;

    .line 289
    .line 290
    iget-object v1, v0, LH/a;->c:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, Landroidx/activity/e;

    .line 293
    .line 294
    iget-object v2, v1, Landroidx/activity/e;->e:Ljava/util/ArrayList;

    .line 295
    .line 296
    iget-object v0, v0, LH/a;->b:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v0, Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-nez v2, :cond_9

    .line 305
    .line 306
    iget-object v2, v1, Landroidx/activity/e;->c:Ljava/util/HashMap;

    .line 307
    .line 308
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    check-cast v2, Ljava/lang/Integer;

    .line 313
    .line 314
    if-eqz v2, :cond_9

    .line 315
    .line 316
    iget-object v3, v1, Landroidx/activity/e;->b:Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    :cond_9
    iget-object v2, v1, Landroidx/activity/e;->f:Ljava/util/HashMap;

    .line 322
    .line 323
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    iget-object v2, v1, Landroidx/activity/e;->g:Ljava/util/HashMap;

    .line 327
    .line 328
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_a

    .line 333
    .line 334
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    .line 351
    .line 352
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    :cond_a
    iget-object v2, v1, Landroidx/activity/e;->h:Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v3, :cond_b

    .line 362
    .line 363
    invoke-static {v5, v0, v6}, LL/d;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :cond_b
    iget-object v1, v1, Landroidx/activity/e;->d:Ljava/util/HashMap;

    .line 385
    .line 386
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-nez v0, :cond_c

    .line 391
    .line 392
    goto :goto_2

    .line 393
    :cond_c
    new-instance v0, Ljava/lang/ClassCastException;

    .line 394
    .line 395
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :cond_d
    new-instance v0, Ljava/lang/ClassCastException;

    .line 400
    .line 401
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 402
    .line 403
    .line 404
    throw v0

    .line 405
    :cond_e
    new-instance v0, Ljava/lang/ClassCastException;

    .line 406
    .line 407
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_f
    :goto_2
    return-void
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/l;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, v1, Landroidx/fragment/app/l;->D:Z

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroidx/fragment/app/z;->l()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final m()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/l;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/z;->m()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public final n()Z
    .locals 5

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroidx/fragment/app/l;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Landroidx/fragment/app/l;->z:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/fragment/app/z;->n()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final o()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->m:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 8
    .line 9
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Landroidx/fragment/app/l;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Landroidx/fragment/app/l;->z:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroidx/fragment/app/z;->o()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final p(Landroidx/fragment/app/l;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroidx/fragment/app/z;->H(Landroidx/fragment/app/l;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p1, Landroidx/fragment/app/l;->k:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p1, Landroidx/fragment/app/l;->k:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p1, p1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/fragment/app/z;->V()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroidx/fragment/app/z;->p(Landroidx/fragment/app/l;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final q()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroidx/fragment/app/l;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/z;->q()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method public final r()Z
    .locals 6

    .line 1
    iget v0, p0, Landroidx/fragment/app/z;->m:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 9
    .line 10
    invoke-virtual {v0}, LC/h;->q()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroidx/fragment/app/l;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, Landroidx/fragment/app/z;->G(Landroidx/fragment/app/l;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, Landroidx/fragment/app/l;->z:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/fragment/app/z;->r()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v1

    .line 51
    :goto_1
    if-eqz v4, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v3
.end method

.method public final s(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/z;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 6
    .line 7
    iget-object v2, v2, LC/h;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/F;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/F;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/z;->I(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/z;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroidx/fragment/app/i;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroidx/fragment/app/i;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/z;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Landroidx/fragment/app/z;->v(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/z;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string v1, "    "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v3, "    "

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v3, v1, LC/h;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/4 v5, 0x0

    .line 49
    if-nez v4, :cond_1e

    .line 50
    .line 51
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v4, "Active Fragments:"

    .line 55
    .line 56
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1e

    .line 72
    .line 73
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Landroidx/fragment/app/F;

    .line 78
    .line 79
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    if-eqz v4, :cond_1d

    .line 83
    .line 84
    iget-object v4, v4, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 85
    .line 86
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const-string v6, "mFragmentId=#"

    .line 96
    .line 97
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget v6, v4, Landroidx/fragment/app/l;->w:I

    .line 101
    .line 102
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string v6, " mContainerId=#"

    .line 110
    .line 111
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget v6, v4, Landroidx/fragment/app/l;->x:I

    .line 115
    .line 116
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v6, " mTag="

    .line 124
    .line 125
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v6, v4, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v6, "mState="

    .line 137
    .line 138
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget v6, v4, Landroidx/fragment/app/l;->b:I

    .line 142
    .line 143
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 144
    .line 145
    .line 146
    const-string v6, " mWho="

    .line 147
    .line 148
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v6, v4, Landroidx/fragment/app/l;->f:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v6, " mBackStackNesting="

    .line 157
    .line 158
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget v6, v4, Landroidx/fragment/app/l;->r:I

    .line 162
    .line 163
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v6, "mAdded="

    .line 170
    .line 171
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-boolean v6, v4, Landroidx/fragment/app/l;->l:Z

    .line 175
    .line 176
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 177
    .line 178
    .line 179
    const-string v6, " mRemoving="

    .line 180
    .line 181
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-boolean v6, v4, Landroidx/fragment/app/l;->m:Z

    .line 185
    .line 186
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 187
    .line 188
    .line 189
    const-string v6, " mFromLayout="

    .line 190
    .line 191
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    iget-boolean v6, v4, Landroidx/fragment/app/l;->n:Z

    .line 195
    .line 196
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 197
    .line 198
    .line 199
    const-string v6, " mInLayout="

    .line 200
    .line 201
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-boolean v6, v4, Landroidx/fragment/app/l;->o:Z

    .line 205
    .line 206
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v6, "mHidden="

    .line 213
    .line 214
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget-boolean v6, v4, Landroidx/fragment/app/l;->z:Z

    .line 218
    .line 219
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 220
    .line 221
    .line 222
    const-string v6, " mDetached="

    .line 223
    .line 224
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-boolean v6, v4, Landroidx/fragment/app/l;->A:Z

    .line 228
    .line 229
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 230
    .line 231
    .line 232
    const-string v6, " mMenuVisible="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Landroidx/fragment/app/l;->C:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mHasMenu="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string v6, "mRetainInstance="

    .line 254
    .line 255
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    iget-boolean v6, v4, Landroidx/fragment/app/l;->B:Z

    .line 259
    .line 260
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 261
    .line 262
    .line 263
    const-string v6, " mUserVisibleHint="

    .line 264
    .line 265
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-boolean v6, v4, Landroidx/fragment/app/l;->H:Z

    .line 269
    .line 270
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 271
    .line 272
    .line 273
    iget-object v6, v4, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 274
    .line 275
    if-eqz v6, :cond_0

    .line 276
    .line 277
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    const-string v6, "mFragmentManager="

    .line 281
    .line 282
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    iget-object v6, v4, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 286
    .line 287
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_0
    iget-object v6, v4, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 291
    .line 292
    if-eqz v6, :cond_1

    .line 293
    .line 294
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const-string v6, "mHost="

    .line 298
    .line 299
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-object v6, v4, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 303
    .line 304
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    :cond_1
    iget-object v6, v4, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 308
    .line 309
    if-eqz v6, :cond_2

    .line 310
    .line 311
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    const-string v6, "mParentFragment="

    .line 315
    .line 316
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    iget-object v6, v4, Landroidx/fragment/app/l;->v:Landroidx/fragment/app/l;

    .line 320
    .line 321
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_2
    iget-object v6, v4, Landroidx/fragment/app/l;->g:Landroid/os/Bundle;

    .line 325
    .line 326
    if-eqz v6, :cond_3

    .line 327
    .line 328
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    const-string v6, "mArguments="

    .line 332
    .line 333
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v6, v4, Landroidx/fragment/app/l;->g:Landroid/os/Bundle;

    .line 337
    .line 338
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    :cond_3
    iget-object v6, v4, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 342
    .line 343
    if-eqz v6, :cond_4

    .line 344
    .line 345
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string v6, "mSavedFragmentState="

    .line 349
    .line 350
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    iget-object v6, v4, Landroidx/fragment/app/l;->c:Landroid/os/Bundle;

    .line 354
    .line 355
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    :cond_4
    iget-object v6, v4, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 359
    .line 360
    if-eqz v6, :cond_5

    .line 361
    .line 362
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    const-string v6, "mSavedViewState="

    .line 366
    .line 367
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-object v6, v4, Landroidx/fragment/app/l;->d:Landroid/util/SparseArray;

    .line 371
    .line 372
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_5
    iget-object v6, v4, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 376
    .line 377
    if-eqz v6, :cond_6

    .line 378
    .line 379
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const-string v6, "mSavedViewRegistryState="

    .line 383
    .line 384
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    iget-object v6, v4, Landroidx/fragment/app/l;->e:Landroid/os/Bundle;

    .line 388
    .line 389
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_6
    iget-object v6, v4, Landroidx/fragment/app/l;->h:Landroidx/fragment/app/l;

    .line 393
    .line 394
    const/4 v7, 0x0

    .line 395
    if-eqz v6, :cond_7

    .line 396
    .line 397
    goto :goto_1

    .line 398
    :cond_7
    iget-object v6, v4, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 399
    .line 400
    if-eqz v6, :cond_8

    .line 401
    .line 402
    iget-object v8, v4, Landroidx/fragment/app/l;->i:Ljava/lang/String;

    .line 403
    .line 404
    if-eqz v8, :cond_8

    .line 405
    .line 406
    iget-object v6, v6, Landroidx/fragment/app/z;->c:LC/h;

    .line 407
    .line 408
    invoke-virtual {v6, v8}, LC/h;->g(Ljava/lang/String;)Landroidx/fragment/app/l;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    goto :goto_1

    .line 413
    :cond_8
    move-object v6, v7

    .line 414
    :goto_1
    if-eqz v6, :cond_9

    .line 415
    .line 416
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-string v8, "mTarget="

    .line 420
    .line 421
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    const-string v6, " mTargetRequestCode="

    .line 428
    .line 429
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget v6, v4, Landroidx/fragment/app/l;->j:I

    .line 433
    .line 434
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 435
    .line 436
    .line 437
    :cond_9
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    const-string v6, "mPopDirection="

    .line 441
    .line 442
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 446
    .line 447
    if-nez v6, :cond_a

    .line 448
    .line 449
    move v6, v5

    .line 450
    goto :goto_2

    .line 451
    :cond_a
    iget-boolean v6, v6, Landroidx/fragment/app/k;->a:Z

    .line 452
    .line 453
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 454
    .line 455
    .line 456
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 457
    .line 458
    if-nez v6, :cond_b

    .line 459
    .line 460
    move v6, v5

    .line 461
    goto :goto_3

    .line 462
    :cond_b
    iget v6, v6, Landroidx/fragment/app/k;->b:I

    .line 463
    .line 464
    :goto_3
    if-eqz v6, :cond_d

    .line 465
    .line 466
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    const-string v6, "getEnterAnim="

    .line 470
    .line 471
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 475
    .line 476
    if-nez v6, :cond_c

    .line 477
    .line 478
    move v6, v5

    .line 479
    goto :goto_4

    .line 480
    :cond_c
    iget v6, v6, Landroidx/fragment/app/k;->b:I

    .line 481
    .line 482
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 483
    .line 484
    .line 485
    :cond_d
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 486
    .line 487
    if-nez v6, :cond_e

    .line 488
    .line 489
    move v6, v5

    .line 490
    goto :goto_5

    .line 491
    :cond_e
    iget v6, v6, Landroidx/fragment/app/k;->c:I

    .line 492
    .line 493
    :goto_5
    if-eqz v6, :cond_10

    .line 494
    .line 495
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    const-string v6, "getExitAnim="

    .line 499
    .line 500
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 504
    .line 505
    if-nez v6, :cond_f

    .line 506
    .line 507
    move v6, v5

    .line 508
    goto :goto_6

    .line 509
    :cond_f
    iget v6, v6, Landroidx/fragment/app/k;->c:I

    .line 510
    .line 511
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 512
    .line 513
    .line 514
    :cond_10
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 515
    .line 516
    if-nez v6, :cond_11

    .line 517
    .line 518
    move v6, v5

    .line 519
    goto :goto_7

    .line 520
    :cond_11
    iget v6, v6, Landroidx/fragment/app/k;->d:I

    .line 521
    .line 522
    :goto_7
    if-eqz v6, :cond_13

    .line 523
    .line 524
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    const-string v6, "getPopEnterAnim="

    .line 528
    .line 529
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 533
    .line 534
    if-nez v6, :cond_12

    .line 535
    .line 536
    move v6, v5

    .line 537
    goto :goto_8

    .line 538
    :cond_12
    iget v6, v6, Landroidx/fragment/app/k;->d:I

    .line 539
    .line 540
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 541
    .line 542
    .line 543
    :cond_13
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 544
    .line 545
    if-nez v6, :cond_14

    .line 546
    .line 547
    move v6, v5

    .line 548
    goto :goto_9

    .line 549
    :cond_14
    iget v6, v6, Landroidx/fragment/app/k;->e:I

    .line 550
    .line 551
    :goto_9
    if-eqz v6, :cond_16

    .line 552
    .line 553
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    const-string v6, "getPopExitAnim="

    .line 557
    .line 558
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    iget-object v6, v4, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    .line 562
    .line 563
    if-nez v6, :cond_15

    .line 564
    .line 565
    move v6, v5

    .line 566
    goto :goto_a

    .line 567
    :cond_15
    iget v6, v6, Landroidx/fragment/app/k;->e:I

    .line 568
    .line 569
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 570
    .line 571
    .line 572
    :cond_16
    iget-object v6, v4, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 573
    .line 574
    if-eqz v6, :cond_17

    .line 575
    .line 576
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    const-string v6, "mContainer="

    .line 580
    .line 581
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    iget-object v6, v4, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 585
    .line 586
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    :cond_17
    iget-object v6, v4, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 590
    .line 591
    if-eqz v6, :cond_18

    .line 592
    .line 593
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    const-string v6, "mView="

    .line 597
    .line 598
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    iget-object v6, v4, Landroidx/fragment/app/l;->F:Landroid/view/View;

    .line 602
    .line 603
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    :cond_18
    iget-object v6, v4, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 607
    .line 608
    if-nez v6, :cond_19

    .line 609
    .line 610
    move-object v6, v7

    .line 611
    goto :goto_b

    .line 612
    :cond_19
    iget-object v6, v6, Landroidx/fragment/app/o;->e:Le/i;

    .line 613
    .line 614
    :goto_b
    if-eqz v6, :cond_1c

    .line 615
    .line 616
    invoke-interface {v4}, Landroidx/lifecycle/Q;->getViewModelStore()Landroidx/lifecycle/P;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    new-instance v8, LC/h;

    .line 621
    .line 622
    sget-object v9, LK/a;->e:LG/d;

    .line 623
    .line 624
    invoke-direct {v8, v6, v9}, LC/h;-><init>(Landroidx/lifecycle/P;Landroidx/lifecycle/O;)V

    .line 625
    .line 626
    .line 627
    const-class v6, LK/a;

    .line 628
    .line 629
    invoke-virtual {v8, v6}, LC/h;->i(Ljava/lang/Class;)Landroidx/lifecycle/L;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    check-cast v6, LK/a;

    .line 634
    .line 635
    iget-object v6, v6, LK/a;->d:Ll/l;

    .line 636
    .line 637
    iget v8, v6, Ll/l;->c:I

    .line 638
    .line 639
    if-lez v8, :cond_1c

    .line 640
    .line 641
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    const-string v8, "Loaders:"

    .line 645
    .line 646
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    iget v8, v6, Ll/l;->c:I

    .line 650
    .line 651
    if-gtz v8, :cond_1a

    .line 652
    .line 653
    goto :goto_c

    .line 654
    :cond_1a
    iget-object p1, v6, Ll/l;->b:[Ljava/lang/Object;

    .line 655
    .line 656
    aget-object p1, p1, v5

    .line 657
    .line 658
    if-nez p1, :cond_1b

    .line 659
    .line 660
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    const-string p1, "  #"

    .line 664
    .line 665
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    iget-object p1, v6, Ll/l;->a:[I

    .line 669
    .line 670
    aget p1, p1, v5

    .line 671
    .line 672
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 673
    .line 674
    .line 675
    const-string p1, ": "

    .line 676
    .line 677
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw v7

    .line 681
    :cond_1b
    new-instance p1, Ljava/lang/ClassCastException;

    .line 682
    .line 683
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 684
    .line 685
    .line 686
    throw p1

    .line 687
    :cond_1c
    :goto_c
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    new-instance v6, Ljava/lang/StringBuilder;

    .line 691
    .line 692
    const-string v7, "Child "

    .line 693
    .line 694
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    iget-object v7, v4, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 698
    .line 699
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    const-string v7, ":"

    .line 703
    .line 704
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 705
    .line 706
    .line 707
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    iget-object v4, v4, Landroidx/fragment/app/l;->u:Landroidx/fragment/app/z;

    .line 715
    .line 716
    new-instance v6, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 722
    .line 723
    .line 724
    const-string v7, "  "

    .line 725
    .line 726
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    .line 728
    .line 729
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v6

    .line 733
    invoke-virtual {v4, v6, p2, p3, p4}, Landroidx/fragment/app/z;->t(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 734
    .line 735
    .line 736
    goto/16 :goto_0

    .line 737
    .line 738
    :cond_1d
    const-string v4, "null"

    .line 739
    .line 740
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    goto/16 :goto_0

    .line 744
    .line 745
    :cond_1e
    iget-object p2, v1, LC/h;->b:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast p2, Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result p4

    .line 753
    if-lez p4, :cond_1f

    .line 754
    .line 755
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    const-string v1, "Added Fragments:"

    .line 759
    .line 760
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    move v1, v5

    .line 764
    :goto_d
    if-ge v1, p4, :cond_1f

    .line 765
    .line 766
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    check-cast v2, Landroidx/fragment/app/l;

    .line 771
    .line 772
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    const-string v3, "  #"

    .line 776
    .line 777
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 781
    .line 782
    .line 783
    const-string v3, ": "

    .line 784
    .line 785
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2}, Landroidx/fragment/app/l;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    add-int/lit8 v1, v1, 0x1

    .line 796
    .line 797
    goto :goto_d

    .line 798
    :cond_1f
    iget-object p2, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 799
    .line 800
    if-eqz p2, :cond_20

    .line 801
    .line 802
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 803
    .line 804
    .line 805
    move-result p2

    .line 806
    if-lez p2, :cond_20

    .line 807
    .line 808
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    const-string p4, "Fragments Created Menus:"

    .line 812
    .line 813
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    move p4, v5

    .line 817
    :goto_e
    if-ge p4, p2, :cond_20

    .line 818
    .line 819
    iget-object v1, p0, Landroidx/fragment/app/z;->e:Ljava/util/ArrayList;

    .line 820
    .line 821
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v1

    .line 825
    check-cast v1, Landroidx/fragment/app/l;

    .line 826
    .line 827
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    const-string v2, "  #"

    .line 831
    .line 832
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 836
    .line 837
    .line 838
    const-string v2, ": "

    .line 839
    .line 840
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v1}, Landroidx/fragment/app/l;->toString()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v1

    .line 847
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 848
    .line 849
    .line 850
    add-int/lit8 p4, p4, 0x1

    .line 851
    .line 852
    goto :goto_e

    .line 853
    :cond_20
    iget-object p2, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 854
    .line 855
    if-eqz p2, :cond_21

    .line 856
    .line 857
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 858
    .line 859
    .line 860
    move-result p2

    .line 861
    if-lez p2, :cond_21

    .line 862
    .line 863
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 864
    .line 865
    .line 866
    const-string p4, "Back Stack:"

    .line 867
    .line 868
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    move p4, v5

    .line 872
    :goto_f
    if-ge p4, p2, :cond_21

    .line 873
    .line 874
    iget-object v1, p0, Landroidx/fragment/app/z;->d:Ljava/util/ArrayList;

    .line 875
    .line 876
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    check-cast v1, Landroidx/fragment/app/a;

    .line 881
    .line 882
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    const-string v2, "  #"

    .line 886
    .line 887
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 891
    .line 892
    .line 893
    const-string v2, ": "

    .line 894
    .line 895
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v1}, Landroidx/fragment/app/a;->toString()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    const/4 v2, 0x1

    .line 906
    invoke-virtual {v1, v0, p3, v2}, Landroidx/fragment/app/a;->d(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 907
    .line 908
    .line 909
    add-int/lit8 p4, p4, 0x1

    .line 910
    .line 911
    goto :goto_f

    .line 912
    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    new-instance p2, Ljava/lang/StringBuilder;

    .line 916
    .line 917
    const-string p4, "Back Stack Index: "

    .line 918
    .line 919
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    iget-object p4, p0, Landroidx/fragment/app/z;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 923
    .line 924
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 925
    .line 926
    .line 927
    move-result p4

    .line 928
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object p2

    .line 935
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    iget-object p2, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 939
    .line 940
    monitor-enter p2

    .line 941
    :try_start_0
    iget-object p4, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 942
    .line 943
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 944
    .line 945
    .line 946
    move-result p4

    .line 947
    if-lez p4, :cond_22

    .line 948
    .line 949
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    const-string v0, "Pending Actions:"

    .line 953
    .line 954
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    :goto_10
    if-ge v5, p4, :cond_22

    .line 958
    .line 959
    iget-object v0, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 960
    .line 961
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    check-cast v0, Landroidx/fragment/app/a;

    .line 966
    .line 967
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    const-string v1, "  #"

    .line 971
    .line 972
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 976
    .line 977
    .line 978
    const-string v1, ": "

    .line 979
    .line 980
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    add-int/lit8 v5, v5, 0x1

    .line 987
    .line 988
    goto :goto_10

    .line 989
    :catchall_0
    move-exception p1

    .line 990
    goto :goto_11

    .line 991
    :cond_22
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 992
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    const-string p2, "FragmentManager misc state:"

    .line 996
    .line 997
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    const-string p2, "  mHost="

    .line 1004
    .line 1005
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    iget-object p2, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 1009
    .line 1010
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1014
    .line 1015
    .line 1016
    const-string p2, "  mContainer="

    .line 1017
    .line 1018
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    iget-object p2, p0, Landroidx/fragment/app/z;->o:LD/h;

    .line 1022
    .line 1023
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    iget-object p2, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 1027
    .line 1028
    if-eqz p2, :cond_23

    .line 1029
    .line 1030
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1031
    .line 1032
    .line 1033
    const-string p2, "  mParent="

    .line 1034
    .line 1035
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1036
    .line 1037
    .line 1038
    iget-object p2, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 1039
    .line 1040
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    const-string p2, "  mCurState="

    .line 1047
    .line 1048
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1049
    .line 1050
    .line 1051
    iget p2, p0, Landroidx/fragment/app/z;->m:I

    .line 1052
    .line 1053
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 1054
    .line 1055
    .line 1056
    const-string p2, " mStateSaved="

    .line 1057
    .line 1058
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1059
    .line 1060
    .line 1061
    iget-boolean p2, p0, Landroidx/fragment/app/z;->y:Z

    .line 1062
    .line 1063
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1064
    .line 1065
    .line 1066
    const-string p2, " mStopped="

    .line 1067
    .line 1068
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1069
    .line 1070
    .line 1071
    iget-boolean p2, p0, Landroidx/fragment/app/z;->z:Z

    .line 1072
    .line 1073
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1074
    .line 1075
    .line 1076
    const-string p2, " mDestroyed="

    .line 1077
    .line 1078
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    iget-boolean p2, p0, Landroidx/fragment/app/z;->A:Z

    .line 1082
    .line 1083
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1084
    .line 1085
    .line 1086
    iget-boolean p2, p0, Landroidx/fragment/app/z;->x:Z

    .line 1087
    .line 1088
    if-eqz p2, :cond_24

    .line 1089
    .line 1090
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    const-string p1, "  mNeedMenuInvalidate="

    .line 1094
    .line 1095
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1096
    .line 1097
    .line 1098
    iget-boolean p1, p0, Landroidx/fragment/app/z;->x:Z

    .line 1099
    .line 1100
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 1101
    .line 1102
    .line 1103
    :cond_24
    return-void

    .line 1104
    :goto_11
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1105
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/fragment/app/z;->p:Landroidx/fragment/app/l;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/z;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Landroidx/fragment/app/z;->A:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/fragment/app/o;->f:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget-boolean p1, p0, Landroidx/fragment/app/z;->y:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-boolean p1, p0, Landroidx/fragment/app/z;->z:Z

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 79
    .line 80
    :cond_4
    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Landroidx/fragment/app/z;->b:Z

    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v0, "Must be called from main thread of fragment host"

    .line 87
    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v0, "FragmentManager is already executing transactions"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method

.method public final v(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Landroidx/fragment/app/z;->u(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    monitor-exit v3

    .line 23
    move v7, p1

    .line 24
    goto :goto_2

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_3

    .line 27
    :cond_0
    iget-object v4, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    move v6, p1

    .line 34
    move v7, v6

    .line 35
    :goto_1
    if-ge v6, v4, :cond_1

    .line 36
    .line 37
    iget-object v7, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Landroidx/fragment/app/a;

    .line 44
    .line 45
    invoke-virtual {v7, v1, v2}, Landroidx/fragment/app/a;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    move v7, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/z;->a:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 58
    .line 59
    iget-object v1, v1, Landroidx/fragment/app/o;->f:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object v2, p0, Landroidx/fragment/app/z;->G:LD/b;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    :goto_2
    if-eqz v7, :cond_2

    .line 68
    .line 69
    iput-boolean v5, p0, Landroidx/fragment/app/z;->b:Z

    .line 70
    .line 71
    :try_start_1
    iget-object v0, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v1, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/z;->M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 79
    .line 80
    .line 81
    move v0, v5

    .line 82
    goto :goto_0

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/z;->V()V

    .line 89
    .line 90
    .line 91
    iget-boolean v1, p0, Landroidx/fragment/app/z;->B:Z

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iput-boolean p1, p0, Landroidx/fragment/app/z;->B:Z

    .line 96
    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/z;->U()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 101
    .line 102
    iget-object p1, p1, LC/h;->c:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/4 v1, 0x0

    .line 111
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    return v0

    .line 119
    :goto_3
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    throw p1
.end method

.method public final w(Landroidx/fragment/app/a;Z)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/fragment/app/z;->A:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-virtual {p0, p2}, Landroidx/fragment/app/z;->u(Z)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/a;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Landroidx/fragment/app/z;->b:Z

    .line 24
    .line 25
    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/z;->C:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object p2, p0, Landroidx/fragment/app/z;->D:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/z;->M(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/z;->V()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p0, Landroidx/fragment/app/z;->B:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Landroidx/fragment/app/z;->B:Z

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/z;->U()V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 49
    .line 50
    iget-object p1, p1, LC/h;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 p2, 0x0

    .line 59
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-interface {p1, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    invoke-virtual {p0}, Landroidx/fragment/app/z;->d()V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public final x(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    .line 1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    iget-boolean v5, v5, Landroidx/fragment/app/a;->o:Z

    .line 2
    iget-object v6, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    .line 3
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 5
    :goto_0
    iget-object v6, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    iget-object v7, v1, Landroidx/fragment/app/z;->c:LC/h;

    invoke-virtual {v7}, LC/h;->q()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v6, v1, Landroidx/fragment/app/z;->q:Landroidx/fragment/app/l;

    move v9, v3

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v4, :cond_13

    .line 7
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroidx/fragment/app/a;

    .line 8
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_d

    .line 9
    iget-object v13, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    const/4 v8, 0x0

    .line 10
    :goto_2
    iget-object v15, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 11
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v8, v14, :cond_c

    .line 12
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/G;

    .line 13
    iget v3, v14, Landroidx/fragment/app/G;->a:I

    if-eq v3, v11, :cond_b

    move/from16 v16, v11

    const/4 v11, 0x2

    move/from16 v17, v5

    const/16 v5, 0x9

    if-eq v3, v11, :cond_5

    const/4 v11, 0x3

    if-eq v3, v11, :cond_4

    const/4 v11, 0x6

    if-eq v3, v11, :cond_4

    const/4 v11, 0x7

    if-eq v3, v11, :cond_3

    const/16 v11, 0x8

    if-eq v3, v11, :cond_1

    goto :goto_3

    .line 14
    :cond_1
    new-instance v3, Landroidx/fragment/app/G;

    invoke-direct {v3, v5, v6}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    invoke-virtual {v15, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    .line 15
    iget-object v3, v14, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    move-object v6, v3

    :cond_2
    :goto_3
    move/from16 v19, v9

    :goto_4
    move/from16 v5, v16

    goto/16 :goto_9

    :cond_3
    move/from16 v5, v16

    :goto_5
    move/from16 v19, v9

    goto/16 :goto_8

    .line 16
    :cond_4
    iget-object v3, v14, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    iget-object v3, v14, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-ne v3, v6, :cond_2

    .line 18
    new-instance v6, Landroidx/fragment/app/G;

    invoke-direct {v6, v5, v3}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    invoke-virtual {v15, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    move/from16 v19, v9

    move/from16 v5, v16

    const/4 v6, 0x0

    goto/16 :goto_9

    .line 19
    :cond_5
    iget-object v3, v14, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    .line 20
    iget v11, v3, Landroidx/fragment/app/l;->x:I

    .line 21
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v18

    add-int/lit8 v18, v18, -0x1

    move/from16 v5, v18

    const/16 v18, 0x0

    :goto_6
    if-ltz v5, :cond_9

    .line 22
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v5

    move-object/from16 v5, v19

    check-cast v5, Landroidx/fragment/app/l;

    move/from16 v19, v9

    .line 23
    iget v9, v5, Landroidx/fragment/app/l;->x:I

    if-ne v9, v11, :cond_8

    if-ne v5, v3, :cond_6

    move/from16 v18, v16

    goto :goto_7

    :cond_6
    if-ne v5, v6, :cond_7

    .line 24
    new-instance v6, Landroidx/fragment/app/G;

    const/16 v9, 0x9

    invoke-direct {v6, v9, v5}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    invoke-virtual {v15, v8, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    const/4 v6, 0x0

    .line 25
    :cond_7
    new-instance v9, Landroidx/fragment/app/G;

    move-object/from16 v21, v6

    const/4 v6, 0x3

    invoke-direct {v9, v6, v5}, Landroidx/fragment/app/G;-><init>(ILandroidx/fragment/app/l;)V

    .line 26
    iget v6, v14, Landroidx/fragment/app/G;->c:I

    iput v6, v9, Landroidx/fragment/app/G;->c:I

    .line 27
    iget v6, v14, Landroidx/fragment/app/G;->e:I

    iput v6, v9, Landroidx/fragment/app/G;->e:I

    .line 28
    iget v6, v14, Landroidx/fragment/app/G;->d:I

    iput v6, v9, Landroidx/fragment/app/G;->d:I

    .line 29
    iget v6, v14, Landroidx/fragment/app/G;->f:I

    iput v6, v9, Landroidx/fragment/app/G;->f:I

    .line 30
    invoke-virtual {v15, v8, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 31
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v6, v21

    :cond_8
    :goto_7
    add-int/lit8 v5, v20, -0x1

    move/from16 v9, v19

    goto :goto_6

    :cond_9
    move/from16 v19, v9

    if-eqz v18, :cond_a

    .line 32
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_4

    :cond_a
    move/from16 v5, v16

    .line 33
    iput v5, v14, Landroidx/fragment/app/G;->a:I

    .line 34
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move/from16 v17, v5

    move v5, v11

    goto/16 :goto_5

    .line 35
    :goto_8
    iget-object v3, v14, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v8, v5

    move/from16 v3, p3

    move v11, v5

    move/from16 v5, v17

    move/from16 v9, v19

    goto/16 :goto_2

    :cond_c
    move/from16 v17, v5

    move/from16 v19, v9

    goto :goto_c

    :cond_d
    move/from16 v17, v5

    move/from16 v19, v9

    move v5, v11

    .line 36
    iget-object v3, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    .line 37
    iget-object v8, v12, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 38
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v5

    :goto_a
    if-ltz v9, :cond_10

    .line 39
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/G;

    .line 40
    iget v13, v11, Landroidx/fragment/app/G;->a:I

    if-eq v13, v5, :cond_f

    const/4 v5, 0x3

    if-eq v13, v5, :cond_e

    packed-switch v13, :pswitch_data_0

    goto :goto_b

    .line 41
    :pswitch_0
    iget-object v13, v11, Landroidx/fragment/app/G;->g:Landroidx/lifecycle/n;

    iput-object v13, v11, Landroidx/fragment/app/G;->h:Landroidx/lifecycle/n;

    goto :goto_b

    .line 42
    :pswitch_1
    iget-object v6, v11, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    goto :goto_b

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_b

    .line 43
    :cond_e
    :pswitch_3
    iget-object v11, v11, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    const/4 v5, 0x3

    .line 44
    :pswitch_4
    iget-object v11, v11, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v9, v9, -0x1

    const/4 v5, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v10, :cond_12

    .line 45
    iget-boolean v3, v12, Landroidx/fragment/app/a;->g:Z

    if-eqz v3, :cond_11

    goto :goto_d

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/4 v10, 0x1

    :goto_e
    add-int/lit8 v9, v19, 0x1

    move/from16 v3, p3

    move/from16 v5, v17

    goto/16 :goto_1

    :cond_13
    move/from16 v17, v5

    .line 46
    iget-object v3, v1, Landroidx/fragment/app/z;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    if-nez v17, :cond_16

    .line 47
    iget v3, v1, Landroidx/fragment/app/z;->m:I

    const/4 v5, 0x1

    if-lt v3, v5, :cond_16

    move/from16 v3, p3

    :goto_f
    if-ge v3, v4, :cond_16

    .line 48
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    .line 49
    iget-object v5, v5, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_14
    :goto_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/G;

    .line 50
    iget-object v6, v6, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v6, :cond_14

    .line 51
    iget-object v8, v6, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    if-eqz v8, :cond_14

    .line 52
    invoke-virtual {v1, v6}, Landroidx/fragment/app/z;->f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    move-result-object v6

    .line 53
    invoke-virtual {v7, v6}, LC/h;->r(Landroidx/fragment/app/F;)V

    goto :goto_10

    :cond_15
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_16
    move/from16 v3, p3

    :goto_11
    const/4 v5, -0x1

    if-ge v3, v4, :cond_22

    .line 54
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/a;

    .line 55
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_1d

    .line 56
    invoke-virtual {v6, v5}, Landroidx/fragment/app/a;->c(I)V

    .line 57
    iget-object v5, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 58
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x1

    sub-int/2addr v7, v8

    :goto_12
    if-ltz v7, :cond_21

    .line 59
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/G;

    .line 60
    iget-object v10, v9, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v10, :cond_1c

    .line 61
    iget-object v11, v10, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    if-nez v11, :cond_17

    goto :goto_13

    .line 62
    :cond_17
    invoke-virtual {v10}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    move-result-object v11

    iput-boolean v8, v11, Landroidx/fragment/app/k;->a:Z

    .line 63
    :goto_13
    iget v11, v6, Landroidx/fragment/app/a;->f:I

    const/16 v12, 0x2002

    const/16 v13, 0x1001

    if-eq v11, v13, :cond_1a

    const/16 v14, 0x1003

    if-eq v11, v14, :cond_19

    if-eq v11, v12, :cond_18

    const/4 v12, 0x0

    goto :goto_14

    :cond_18
    move v12, v13

    goto :goto_14

    :cond_19
    move v12, v14

    .line 64
    :cond_1a
    :goto_14
    iget-object v11, v10, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    if-nez v11, :cond_1b

    if-nez v12, :cond_1b

    goto :goto_15

    .line 65
    :cond_1b
    invoke-virtual {v10}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 66
    iget-object v11, v10, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    iput v12, v11, Landroidx/fragment/app/k;->f:I

    .line 67
    :goto_15
    invoke-virtual {v10}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 68
    iget-object v11, v10, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    :cond_1c
    iget v11, v9, Landroidx/fragment/app/G;->a:I

    iget-object v12, v6, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    packed-switch v11, :pswitch_data_1

    .line 70
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown cmd: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v9, Landroidx/fragment/app/G;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :pswitch_6
    iget-object v9, v9, Landroidx/fragment/app/G;->g:Landroidx/lifecycle/n;

    invoke-virtual {v12, v10, v9}, Landroidx/fragment/app/z;->Q(Landroidx/fragment/app/l;Landroidx/lifecycle/n;)V

    goto :goto_16

    .line 72
    :pswitch_7
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->R(Landroidx/fragment/app/l;)V

    goto :goto_16

    :pswitch_8
    const/4 v9, 0x0

    .line 73
    invoke-virtual {v12, v9}, Landroidx/fragment/app/z;->R(Landroidx/fragment/app/l;)V

    goto :goto_16

    .line 74
    :pswitch_9
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 75
    invoke-virtual {v12, v10, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 76
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->g(Landroidx/fragment/app/l;)V

    goto :goto_16

    .line 77
    :pswitch_a
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 78
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->c(Landroidx/fragment/app/l;)V

    goto :goto_16

    .line 79
    :pswitch_b
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 80
    invoke-virtual {v12, v10, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 81
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->D(Landroidx/fragment/app/l;)V

    goto :goto_16

    .line 82
    :pswitch_c
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Landroidx/fragment/app/z;->T(Landroidx/fragment/app/l;)V

    goto :goto_16

    .line 84
    :pswitch_d
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 85
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    goto :goto_16

    .line 86
    :pswitch_e
    iget v11, v9, Landroidx/fragment/app/G;->c:I

    iget v13, v9, Landroidx/fragment/app/G;->d:I

    iget v14, v9, Landroidx/fragment/app/G;->e:I

    iget v9, v9, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v10, v11, v13, v14, v9}, Landroidx/fragment/app/l;->o(IIII)V

    .line 87
    invoke-virtual {v12, v10, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 88
    invoke-virtual {v12, v10}, Landroidx/fragment/app/z;->L(Landroidx/fragment/app/l;)V

    :goto_16
    add-int/lit8 v7, v7, -0x1

    goto/16 :goto_12

    :cond_1d
    const/4 v5, 0x1

    .line 89
    invoke-virtual {v6, v5}, Landroidx/fragment/app/a;->c(I)V

    .line 90
    iget-object v5, v6, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    .line 91
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    move v9, v8

    :goto_17
    if-ge v9, v7, :cond_21

    .line 92
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/G;

    .line 93
    iget-object v11, v10, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v11, :cond_20

    .line 94
    iget-object v12, v11, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    if-nez v12, :cond_1e

    goto :goto_18

    .line 95
    :cond_1e
    invoke-virtual {v11}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    move-result-object v12

    iput-boolean v8, v12, Landroidx/fragment/app/k;->a:Z

    .line 96
    :goto_18
    iget v12, v6, Landroidx/fragment/app/a;->f:I

    .line 97
    iget-object v13, v11, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    if-nez v13, :cond_1f

    if-nez v12, :cond_1f

    goto :goto_19

    .line 98
    :cond_1f
    invoke-virtual {v11}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 99
    iget-object v13, v11, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    iput v12, v13, Landroidx/fragment/app/k;->f:I

    .line 100
    :goto_19
    invoke-virtual {v11}, Landroidx/fragment/app/l;->d()Landroidx/fragment/app/k;

    .line 101
    iget-object v12, v11, Landroidx/fragment/app/l;->I:Landroidx/fragment/app/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    :cond_20
    iget v12, v10, Landroidx/fragment/app/G;->a:I

    iget-object v13, v6, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    packed-switch v12, :pswitch_data_2

    .line 103
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown cmd: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, Landroidx/fragment/app/G;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :pswitch_10
    iget-object v10, v10, Landroidx/fragment/app/G;->h:Landroidx/lifecycle/n;

    invoke-virtual {v13, v11, v10}, Landroidx/fragment/app/z;->Q(Landroidx/fragment/app/l;Landroidx/lifecycle/n;)V

    goto :goto_1a

    :pswitch_11
    const/4 v10, 0x0

    .line 105
    invoke-virtual {v13, v10}, Landroidx/fragment/app/z;->R(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 106
    :pswitch_12
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->R(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 107
    :pswitch_13
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 108
    invoke-virtual {v13, v11, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 109
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->c(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 110
    :pswitch_14
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 111
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->g(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 112
    :pswitch_15
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 113
    invoke-virtual {v13, v11, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 114
    invoke-static {v11}, Landroidx/fragment/app/z;->T(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 115
    :pswitch_16
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 116
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->D(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 117
    :pswitch_17
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 118
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->L(Landroidx/fragment/app/l;)V

    goto :goto_1a

    .line 119
    :pswitch_18
    iget v12, v10, Landroidx/fragment/app/G;->c:I

    iget v14, v10, Landroidx/fragment/app/G;->d:I

    iget v15, v10, Landroidx/fragment/app/G;->e:I

    iget v10, v10, Landroidx/fragment/app/G;->f:I

    invoke-virtual {v11, v12, v14, v15, v10}, Landroidx/fragment/app/l;->o(IIII)V

    .line 120
    invoke-virtual {v13, v11, v8}, Landroidx/fragment/app/z;->P(Landroidx/fragment/app/l;Z)V

    .line 121
    invoke-virtual {v13, v11}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    :goto_1a
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_17

    :cond_21
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_11

    :cond_22
    add-int/lit8 v3, v4, -0x1

    .line 122
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move/from16 v6, p3

    :goto_1b
    if-ge v6, v4, :cond_27

    .line 123
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/a;

    if-eqz v3, :cond_24

    .line 124
    iget-object v8, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v16, 0x1

    add-int/lit8 v8, v8, -0x1

    :goto_1c
    if-ltz v8, :cond_26

    .line 125
    iget-object v9, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/G;

    .line 126
    iget-object v9, v9, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v9, :cond_23

    .line 127
    invoke-virtual {v1, v9}, Landroidx/fragment/app/z;->f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    move-result-object v9

    .line 128
    invoke-virtual {v9}, Landroidx/fragment/app/F;->k()V

    :cond_23
    add-int/lit8 v8, v8, -0x1

    goto :goto_1c

    .line 129
    :cond_24
    iget-object v7, v7, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_25
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_26

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/G;

    .line 130
    iget-object v8, v8, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v8, :cond_25

    .line 131
    invoke-virtual {v1, v8}, Landroidx/fragment/app/z;->f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    move-result-object v8

    .line 132
    invoke-virtual {v8}, Landroidx/fragment/app/F;->k()V

    goto :goto_1d

    :cond_26
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    .line 133
    :cond_27
    iget v6, v1, Landroidx/fragment/app/z;->m:I

    const/4 v7, 0x1

    invoke-virtual {v1, v6, v7}, Landroidx/fragment/app/z;->I(IZ)V

    .line 134
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_1e
    if-ge v7, v4, :cond_2a

    .line 135
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/a;

    .line 136
    iget-object v8, v8, Landroidx/fragment/app/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_28
    :goto_1f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/fragment/app/G;

    .line 137
    iget-object v9, v9, Landroidx/fragment/app/G;->b:Landroidx/fragment/app/l;

    if-eqz v9, :cond_28

    .line 138
    iget-object v9, v9, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    if-eqz v9, :cond_28

    .line 139
    invoke-virtual {v1}, Landroidx/fragment/app/z;->C()LG/d;

    move-result-object v10

    .line 140
    invoke-static {v9, v10}, Landroidx/fragment/app/i;->f(Landroid/view/ViewGroup;LG/d;)Landroidx/fragment/app/i;

    move-result-object v9

    .line 141
    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_29
    add-int/lit8 v7, v7, 0x1

    goto :goto_1e

    .line 142
    :cond_2a
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_20
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/i;

    .line 143
    iput-boolean v3, v7, Landroidx/fragment/app/i;->d:Z

    .line 144
    iget-object v8, v7, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    .line 145
    monitor-enter v8

    .line 146
    :try_start_0
    invoke-virtual {v7}, Landroidx/fragment/app/i;->g()V

    const/4 v9, 0x0

    .line 147
    iput-boolean v9, v7, Landroidx/fragment/app/i;->e:Z

    .line 148
    iget-object v10, v7, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    :goto_21
    if-ltz v10, :cond_2c

    .line 149
    iget-object v11, v7, Landroidx/fragment/app/i;->b:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/K;

    .line 150
    iget-object v12, v11, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 151
    iget-object v12, v12, Landroidx/fragment/app/l;->F:Landroid/view/View;

    invoke-static {v12}, Landroidx/fragment/app/L;->c(Landroid/view/View;)I

    move-result v12

    .line 152
    iget v13, v11, Landroidx/fragment/app/K;->a:I

    const/4 v14, 0x2

    if-ne v13, v14, :cond_2b

    if-eq v12, v14, :cond_2b

    .line 153
    iget-object v10, v11, Landroidx/fragment/app/K;->c:Landroidx/fragment/app/l;

    .line 154
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v9, v7, Landroidx/fragment/app/i;->e:Z

    goto :goto_22

    :catchall_0
    move-exception v0

    goto :goto_23

    :cond_2b
    add-int/lit8 v10, v10, -0x1

    goto :goto_21

    .line 155
    :cond_2c
    :goto_22
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    invoke-virtual {v7}, Landroidx/fragment/app/i;->c()V

    goto :goto_20

    .line 157
    :goto_23
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2d
    move/from16 v3, p3

    :goto_24
    if-ge v3, v4, :cond_2f

    .line 158
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/a;

    .line 159
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_2e

    .line 160
    iget v7, v6, Landroidx/fragment/app/a;->q:I

    if-ltz v7, :cond_2e

    .line 161
    iput v5, v6, Landroidx/fragment/app/a;->q:I

    .line 162
    :cond_2e
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v3, v3, 0x1

    goto :goto_24

    :cond_2f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final y(I)Landroidx/fragment/app/l;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    iget-object v1, v0, LC/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/l;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Landroidx/fragment/app/l;->w:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, LC/h;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Landroidx/fragment/app/F;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 58
    .line 59
    iget v2, v1, Landroidx/fragment/app/l;->w:I

    .line 60
    .line 61
    if-ne v2, p1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public final z(Ljava/lang/String;)Landroidx/fragment/app/l;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/z;->c:LC/h;

    .line 2
    .line 3
    iget-object v1, v0, LC/h;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/fragment/app/l;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v4, v3, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, v0, LC/h;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Landroidx/fragment/app/F;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    iget-object v1, v1, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 62
    .line 63
    iget-object v2, v1, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method
