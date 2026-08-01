.class public final Lam;
.super Ljava/lang/Object;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ljava/util/ArrayList;

.field public D:Ljava/util/ArrayList;

.field public E:Ljava/util/ArrayList;

.field public F:Lcm;

.field public final G:Li7;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Lr5;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:Lsl;

.field public g:Landroidx/activity/a;

.field public final h:Lul;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ld4;

.field public final l:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public m:I

.field public n:Lpl;

.field public o:Lgf;

.field public p:Lol;

.field public q:Lol;

.field public final r:Lvl;

.field public final s:Lxh;

.field public t:Ld4;

.field public u:Ld4;

.field public v:Ld4;

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
    iput-object v0, p0, Lam;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lr5;

    .line 12
    .line 13
    invoke-direct {v0}, Lr5;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lam;->c:Lr5;

    .line 17
    .line 18
    new-instance v0, Lsl;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lsl;-><init>(Lam;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lam;->f:Lsl;

    .line 24
    .line 25
    new-instance v0, Lul;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lul;-><init>(Lam;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lam;->h:Lul;

    .line 31
    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lam;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lam;->j:Ljava/util/Map;

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    new-instance v0, Lxh;

    .line 67
    .line 68
    invoke-direct {v0, p0}, Lxh;-><init>(Lam;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Ld4;

    .line 72
    .line 73
    invoke-direct {v0, p0}, Ld4;-><init>(Lam;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lam;->k:Ld4;

    .line 77
    .line 78
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lam;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 84
    .line 85
    const/4 v0, -0x1

    .line 86
    iput v0, p0, Lam;->m:I

    .line 87
    .line 88
    new-instance v0, Lvl;

    .line 89
    .line 90
    invoke-direct {v0, p0}, Lvl;-><init>(Lam;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lam;->r:Lvl;

    .line 94
    .line 95
    new-instance v0, Lxh;

    .line 96
    .line 97
    const/16 v1, 0x1a

    .line 98
    .line 99
    invoke-direct {v0, v1}, Lxh;-><init>(I)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, Lam;->s:Lxh;

    .line 103
    .line 104
    new-instance v0, Ljava/util/ArrayDeque;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lam;->w:Ljava/util/ArrayDeque;

    .line 110
    .line 111
    new-instance v0, Li7;

    .line 112
    .line 113
    const/4 v1, 0x7

    .line 114
    invoke-direct {v0, v1, p0}, Li7;-><init>(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iput-object v0, p0, Lam;->G:Li7;

    .line 118
    .line 119
    return-void
.end method

.method public static A(I)Z
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

.method public static B(Lol;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lol;->t:Lam;

    .line 5
    .line 6
    iget-object p0, p0, Lam;->c:Lr5;

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
    iget-object p0, p0, Lr5;->b:Ljava/lang/Object;

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
    check-cast v1, Landroidx/fragment/app/a;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v1, v1, Landroidx/fragment/app/a;->c:Lol;

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
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/4 v1, 0x0

    .line 58
    move v2, v1

    .line 59
    move v3, v2

    .line 60
    :cond_2
    if-ge v3, p0, :cond_4

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    check-cast v4, Lol;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    invoke-static {v4}, Lam;->B(Lol;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :cond_3
    if-eqz v2, :cond_2

    .line 77
    .line 78
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :cond_4
    return v1
.end method

.method public static C(Lol;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lol;->B:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Lol;->r:Lam;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lol;->u:Lol;

    .line 13
    .line 14
    invoke-static {p0}, Lam;->C(Lol;)Z

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

.method public static D(Lol;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lol;->r:Lam;

    .line 5
    .line 6
    iget-object v1, v0, Lam;->q:Lol;

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
    iget-object p0, v0, Lam;->p:Lol;

    .line 15
    .line 16
    invoke-static {p0}, Lam;->D(Lol;)Z

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

.method public static R(Lol;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

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
    iget-boolean v0, p0, Lol;->y:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lol;->y:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Lol;->I:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Lol;->I:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final E(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lam;->n:Lpl;

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
    iget p2, p0, Lam;->m:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_2
    iput p1, p0, Lam;->m:I

    .line 25
    .line 26
    iget-object p1, p0, Lam;->c:Lr5;

    .line 27
    .line 28
    iget-object p2, p1, Lr5;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/HashMap;

    .line 31
    .line 32
    iget-object v0, p1, Lr5;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    move v3, v2

    .line 42
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    check-cast v4, Lol;

    .line 51
    .line 52
    iget-object v4, v4, Lol;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroidx/fragment/app/a;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4}, Landroidx/fragment/app/a;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroidx/fragment/app/a;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/a;->k()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, Landroidx/fragment/app/a;->c:Lol;

    .line 92
    .line 93
    iget-boolean v3, v1, Lol;->l:Z

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iget v1, v1, Lol;->q:I

    .line 98
    .line 99
    if-lez v1, :cond_6

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    invoke-virtual {p1, v0}, Lr5;->w(Landroidx/fragment/app/a;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_7
    invoke-virtual {p0}, Lam;->S()V

    .line 107
    .line 108
    .line 109
    iget-boolean p1, p0, Lam;->x:Z

    .line 110
    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    iget-object p1, p0, Lam;->n:Lpl;

    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    iget p2, p0, Lam;->m:I

    .line 118
    .line 119
    const/4 v0, 0x7

    .line 120
    if-ne p2, v0, :cond_8

    .line 121
    .line 122
    iget-object p1, p1, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 123
    .line 124
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->f()V

    .line 125
    .line 126
    .line 127
    iput-boolean v2, p0, Lam;->x:Z

    .line 128
    .line 129
    :cond_8
    :goto_3
    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    iget-object v0, p0, Lam;->n:Lpl;

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
    iput-boolean v0, p0, Lam;->y:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lam;->z:Z

    .line 10
    .line 11
    iget-object v1, p0, Lam;->F:Lcm;

    .line 12
    .line 13
    iput-boolean v0, v1, Lcm;->h:Z

    .line 14
    .line 15
    iget-object v0, p0, Lam;->c:Lr5;

    .line 16
    .line 17
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v1, Lol;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, Lol;->t:Lam;

    .line 40
    .line 41
    invoke-virtual {v1}, Lam;->F()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final G()Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lam;->t(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Lam;->s(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lam;->q:Lol;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lol;->g()Lam;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lam;->G()Z

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
    iget-object v2, p0, Lam;->C:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, Lam;->D:Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v4, -0x1

    .line 29
    invoke-virtual {p0, v2, v3, v4, v0}, Lam;->H(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iput-boolean v1, p0, Lam;->b:Z

    .line 36
    .line 37
    :try_start_0
    iget-object v1, p0, Lam;->C:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v3, p0, Lam;->D:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p0, v1, v3}, Lam;->J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lam;->d()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-virtual {p0}, Lam;->d()V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lam;->T()V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, p0, Lam;->B:Z

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iput-boolean v0, p0, Lam;->B:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Lam;->S()V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v0, p0, Lam;->c:Lr5;

    .line 66
    .line 67
    iget-object v0, v0, Lr5;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v0, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    return v2
.end method

.method public final H(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lam;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    if-gez p3, :cond_2

    .line 8
    .line 9
    and-int/lit8 v2, p4, 0x1

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    sub-int/2addr p3, v1

    .line 18
    if-gez p3, :cond_1

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_1
    iget-object p4, p0, Lam;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    if-ltz p3, :cond_6

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sub-int/2addr v0, v1

    .line 43
    :goto_0
    if-ltz v0, :cond_4

    .line 44
    .line 45
    iget-object v2, p0, Lam;->d:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ll7;

    .line 52
    .line 53
    if-ltz p3, :cond_3

    .line 54
    .line 55
    iget v2, v2, Ll7;->r:I

    .line 56
    .line 57
    if-ne p3, v2, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    :goto_1
    if-gez v0, :cond_5

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    and-int/2addr p4, v1

    .line 67
    if-eqz p4, :cond_7

    .line 68
    .line 69
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 70
    .line 71
    if-ltz v0, :cond_7

    .line 72
    .line 73
    iget-object p4, p0, Lam;->d:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    check-cast p4, Ll7;

    .line 80
    .line 81
    if-ltz p3, :cond_7

    .line 82
    .line 83
    iget p4, p4, Ll7;->r:I

    .line 84
    .line 85
    if-ne p3, p4, :cond_7

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    const/4 v0, -0x1

    .line 89
    :cond_7
    iget-object p3, p0, Lam;->d:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p3

    .line 95
    sub-int/2addr p3, v1

    .line 96
    if-ne v0, p3, :cond_8

    .line 97
    .line 98
    :goto_3
    const/4 p1, 0x0

    .line 99
    return p1

    .line 100
    :cond_8
    iget-object p3, p0, Lam;->d:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    sub-int/2addr p3, v1

    .line 107
    :goto_4
    if-le p3, v0, :cond_9

    .line 108
    .line 109
    iget-object p4, p0, Lam;->d:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    add-int/lit8 p3, p3, -0x1

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_9
    return v1
.end method

.method public final I(Lol;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Lol;->q:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    iget v0, p1, Lol;->q:I

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
    iget-boolean v3, p1, Lol;->z:Z

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 55
    .line 56
    iget-object v3, v0, Lr5;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/ArrayList;

    .line 59
    .line 60
    monitor-enter v3

    .line 61
    :try_start_0
    iget-object v0, v0, Lr5;->c:Ljava/lang/Object;

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
    iput-boolean v1, p1, Lol;->k:Z

    .line 70
    .line 71
    invoke-static {p1}, Lam;->B(Lol;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iput-boolean v2, p0, Lam;->x:Z

    .line 78
    .line 79
    :cond_4
    iput-boolean v2, p1, Lol;->l:Z

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lam;->Q(Lol;)V

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

.method public final J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
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
    check-cast v3, Ll7;

    .line 31
    .line 32
    iget-boolean v3, v3, Ll7;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Lam;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

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
    check-cast v3, Ll7;

    .line 74
    .line 75
    iget-boolean v3, v3, Ll7;->o:Z

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
    invoke-virtual {p0, p1, p2, v1, v2}, Lam;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

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
    invoke-virtual {p0, p1, p2, v2, v0}, Lam;->u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

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

.method public final K(Landroid/os/Parcelable;)V
    .locals 19

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
    check-cast v1, Lbm;

    .line 9
    .line 10
    iget-object v2, v1, Lbm;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    iget-object v2, v0, Lam;->c:Lr5;

    .line 16
    .line 17
    iget-object v3, v2, Lr5;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 22
    .line 23
    .line 24
    iget-object v3, v1, Lbm;->a:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v6, 0x0

    .line 31
    :cond_2
    :goto_1
    iget-object v7, v0, Lam;->k:Ld4;

    .line 32
    .line 33
    const-string v8, "): "

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    const-string v10, "FragmentManager"

    .line 37
    .line 38
    if-ge v6, v4, :cond_6

    .line 39
    .line 40
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    add-int/lit8 v6, v6, 0x1

    .line 45
    .line 46
    check-cast v11, Lem;

    .line 47
    .line 48
    if-eqz v11, :cond_2

    .line 49
    .line 50
    iget-object v12, v0, Lam;->F:Lcm;

    .line 51
    .line 52
    iget-object v13, v11, Lem;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v12, v12, Lcm;->c:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    check-cast v12, Lol;

    .line 61
    .line 62
    if-eqz v12, :cond_4

    .line 63
    .line 64
    invoke-static {v9}, Lam;->A(I)Z

    .line 65
    .line 66
    .line 67
    move-result v13

    .line 68
    if-eqz v13, :cond_3

    .line 69
    .line 70
    new-instance v13, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v14, "restoreSaveState: re-attaching retained "

    .line 73
    .line 74
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    invoke-static {v10, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_3
    new-instance v13, Landroidx/fragment/app/a;

    .line 88
    .line 89
    invoke-direct {v13, v7, v2, v12, v11}, Landroidx/fragment/app/a;-><init>(Ld4;Lr5;Lol;Lem;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    new-instance v12, Landroidx/fragment/app/a;

    .line 94
    .line 95
    iget-object v7, v0, Lam;->n:Lpl;

    .line 96
    .line 97
    iget-object v7, v7, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 98
    .line 99
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 100
    .line 101
    .line 102
    move-result-object v15

    .line 103
    invoke-virtual {v0}, Lam;->x()Lvl;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    iget-object v13, v0, Lam;->k:Ld4;

    .line 108
    .line 109
    iget-object v14, v0, Lam;->c:Lr5;

    .line 110
    .line 111
    move-object/from16 v17, v11

    .line 112
    .line 113
    invoke-direct/range {v12 .. v17}, Landroidx/fragment/app/a;-><init>(Ld4;Lr5;Ljava/lang/ClassLoader;Lvl;Lem;)V

    .line 114
    .line 115
    .line 116
    move-object v13, v12

    .line 117
    :goto_2
    iget-object v7, v13, Landroidx/fragment/app/a;->c:Lol;

    .line 118
    .line 119
    iput-object v0, v7, Lol;->r:Lam;

    .line 120
    .line 121
    invoke-static {v9}, Lam;->A(I)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_5

    .line 126
    .line 127
    new-instance v9, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v11, "restoreSaveState: active ("

    .line 130
    .line 131
    invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v11, v7, Lol;->e:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-static {v10, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_5
    iget-object v7, v0, Lam;->n:Lpl;

    .line 153
    .line 154
    iget-object v7, v7, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 155
    .line 156
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-virtual {v13, v7}, Landroidx/fragment/app/a;->m(Ljava/lang/ClassLoader;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v13}, Lr5;->v(Landroidx/fragment/app/a;)V

    .line 164
    .line 165
    .line 166
    iget v7, v0, Lam;->m:I

    .line 167
    .line 168
    iput v7, v13, Landroidx/fragment/app/a;->e:I

    .line 169
    .line 170
    goto/16 :goto_1

    .line 171
    .line 172
    :cond_6
    iget-object v3, v0, Lam;->F:Lcm;

    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v4, Ljava/util/ArrayList;

    .line 178
    .line 179
    iget-object v3, v3, Lcm;->c:Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    const/4 v6, 0x0

    .line 193
    :goto_3
    const/4 v11, 0x1

    .line 194
    if-ge v6, v3, :cond_9

    .line 195
    .line 196
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v12

    .line 200
    add-int/lit8 v6, v6, 0x1

    .line 201
    .line 202
    check-cast v12, Lol;

    .line 203
    .line 204
    iget-object v13, v12, Lol;->e:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v14, v2, Lr5;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v14, Ljava/util/HashMap;

    .line 209
    .line 210
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    if-eqz v13, :cond_7

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_7
    invoke-static {v9}, Lam;->A(I)Z

    .line 218
    .line 219
    .line 220
    move-result v13

    .line 221
    if-eqz v13, :cond_8

    .line 222
    .line 223
    new-instance v13, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v14, "Discarding retained Fragment "

    .line 226
    .line 227
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v14, " that was not found in the set of active Fragments "

    .line 234
    .line 235
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-object v14, v1, Lbm;->a:Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    invoke-static {v10, v13}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    :cond_8
    iget-object v13, v0, Lam;->F:Lcm;

    .line 251
    .line 252
    invoke-virtual {v13, v12}, Lcm;->b(Lol;)V

    .line 253
    .line 254
    .line 255
    iput-object v0, v12, Lol;->r:Lam;

    .line 256
    .line 257
    new-instance v13, Landroidx/fragment/app/a;

    .line 258
    .line 259
    invoke-direct {v13, v7, v2, v12}, Landroidx/fragment/app/a;-><init>(Ld4;Lr5;Lol;)V

    .line 260
    .line 261
    .line 262
    iput v11, v13, Landroidx/fragment/app/a;->e:I

    .line 263
    .line 264
    invoke-virtual {v13}, Landroidx/fragment/app/a;->k()V

    .line 265
    .line 266
    .line 267
    iput-boolean v11, v12, Lol;->l:Z

    .line 268
    .line 269
    invoke-virtual {v13}, Landroidx/fragment/app/a;->k()V

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_9
    iget-object v3, v1, Lbm;->b:Ljava/util/ArrayList;

    .line 274
    .line 275
    iget-object v4, v2, Lr5;->c:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v4, Ljava/util/ArrayList;

    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 280
    .line 281
    .line 282
    if-eqz v3, :cond_c

    .line 283
    .line 284
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    const/4 v6, 0x0

    .line 289
    :goto_4
    if-ge v6, v4, :cond_c

    .line 290
    .line 291
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    add-int/lit8 v6, v6, 0x1

    .line 296
    .line 297
    check-cast v7, Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v2, v7}, Lr5;->g(Ljava/lang/String;)Lol;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    if-eqz v12, :cond_b

    .line 304
    .line 305
    invoke-static {v9}, Lam;->A(I)Z

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    if-eqz v13, :cond_a

    .line 310
    .line 311
    new-instance v13, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v14, "restoreSaveState: added ("

    .line 314
    .line 315
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    invoke-static {v10, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    :cond_a
    invoke-virtual {v2, v12}, Lr5;->a(Lol;)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 339
    .line 340
    const-string v2, "No instantiated fragment for ("

    .line 341
    .line 342
    const-string v3, ")"

    .line 343
    .line 344
    invoke-static {v2, v7, v3}, Lg40;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v1

    .line 352
    :cond_c
    iget-object v3, v1, Lbm;->c:[Lm7;

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    if-eqz v3, :cond_12

    .line 356
    .line 357
    new-instance v3, Ljava/util/ArrayList;

    .line 358
    .line 359
    iget-object v6, v1, Lbm;->c:[Lm7;

    .line 360
    .line 361
    array-length v6, v6

    .line 362
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 363
    .line 364
    .line 365
    iput-object v3, v0, Lam;->d:Ljava/util/ArrayList;

    .line 366
    .line 367
    const/4 v3, 0x0

    .line 368
    :goto_5
    iget-object v6, v1, Lbm;->c:[Lm7;

    .line 369
    .line 370
    array-length v7, v6

    .line 371
    if-ge v3, v7, :cond_11

    .line 372
    .line 373
    aget-object v6, v6, v3

    .line 374
    .line 375
    iget-object v7, v6, Lm7;->a:[I

    .line 376
    .line 377
    new-instance v12, Ll7;

    .line 378
    .line 379
    invoke-direct {v12, v0}, Ll7;-><init>(Lam;)V

    .line 380
    .line 381
    .line 382
    const/4 v13, 0x0

    .line 383
    const/4 v14, 0x0

    .line 384
    :goto_6
    array-length v15, v7

    .line 385
    if-ge v13, v15, :cond_f

    .line 386
    .line 387
    new-instance v15, Lgm;

    .line 388
    .line 389
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 390
    .line 391
    .line 392
    add-int/lit8 v16, v13, 0x1

    .line 393
    .line 394
    move/from16 p1, v9

    .line 395
    .line 396
    aget v9, v7, v13

    .line 397
    .line 398
    iput v9, v15, Lgm;->a:I

    .line 399
    .line 400
    invoke-static/range {p1 .. p1}, Lam;->A(I)Z

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    if-eqz v9, :cond_d

    .line 405
    .line 406
    new-instance v9, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    const-string v5, "Instantiate "

    .line 409
    .line 410
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v5, " op #"

    .line 417
    .line 418
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v5, " base fragment #"

    .line 425
    .line 426
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    aget v5, v7, v16

    .line 430
    .line 431
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 439
    .line 440
    .line 441
    :cond_d
    iget-object v5, v6, Lm7;->b:Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    check-cast v5, Ljava/lang/String;

    .line 448
    .line 449
    if-eqz v5, :cond_e

    .line 450
    .line 451
    invoke-virtual {v2, v5}, Lr5;->g(Ljava/lang/String;)Lol;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    iput-object v5, v15, Lgm;->b:Lol;

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_e
    iput-object v4, v15, Lgm;->b:Lol;

    .line 459
    .line 460
    :goto_7
    invoke-static {}, Lnq;->values()[Lnq;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    iget-object v9, v6, Lm7;->c:[I

    .line 465
    .line 466
    aget v9, v9, v14

    .line 467
    .line 468
    aget-object v5, v5, v9

    .line 469
    .line 470
    iput-object v5, v15, Lgm;->g:Lnq;

    .line 471
    .line 472
    invoke-static {}, Lnq;->values()[Lnq;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    iget-object v9, v6, Lm7;->d:[I

    .line 477
    .line 478
    aget v9, v9, v14

    .line 479
    .line 480
    aget-object v5, v5, v9

    .line 481
    .line 482
    iput-object v5, v15, Lgm;->h:Lnq;

    .line 483
    .line 484
    add-int/lit8 v5, v13, 0x2

    .line 485
    .line 486
    aget v9, v7, v16

    .line 487
    .line 488
    iput v9, v15, Lgm;->c:I

    .line 489
    .line 490
    add-int/lit8 v16, v13, 0x3

    .line 491
    .line 492
    aget v5, v7, v5

    .line 493
    .line 494
    iput v5, v15, Lgm;->d:I

    .line 495
    .line 496
    add-int/lit8 v18, v13, 0x4

    .line 497
    .line 498
    aget v4, v7, v16

    .line 499
    .line 500
    iput v4, v15, Lgm;->e:I

    .line 501
    .line 502
    add-int/lit8 v13, v13, 0x5

    .line 503
    .line 504
    aget v11, v7, v18

    .line 505
    .line 506
    iput v11, v15, Lgm;->f:I

    .line 507
    .line 508
    iput v9, v12, Ll7;->b:I

    .line 509
    .line 510
    iput v5, v12, Ll7;->c:I

    .line 511
    .line 512
    iput v4, v12, Ll7;->d:I

    .line 513
    .line 514
    iput v11, v12, Ll7;->e:I

    .line 515
    .line 516
    invoke-virtual {v12, v15}, Ll7;->b(Lgm;)V

    .line 517
    .line 518
    .line 519
    add-int/lit8 v14, v14, 0x1

    .line 520
    .line 521
    move/from16 v9, p1

    .line 522
    .line 523
    const/4 v4, 0x0

    .line 524
    const/4 v11, 0x1

    .line 525
    goto/16 :goto_6

    .line 526
    .line 527
    :cond_f
    move/from16 p1, v9

    .line 528
    .line 529
    iget v4, v6, Lm7;->e:I

    .line 530
    .line 531
    iput v4, v12, Ll7;->f:I

    .line 532
    .line 533
    iget-object v4, v6, Lm7;->f:Ljava/lang/String;

    .line 534
    .line 535
    iput-object v4, v12, Ll7;->h:Ljava/lang/String;

    .line 536
    .line 537
    iget v4, v6, Lm7;->g:I

    .line 538
    .line 539
    iput v4, v12, Ll7;->r:I

    .line 540
    .line 541
    const/4 v4, 0x1

    .line 542
    iput-boolean v4, v12, Ll7;->g:Z

    .line 543
    .line 544
    iget v4, v6, Lm7;->h:I

    .line 545
    .line 546
    iput v4, v12, Ll7;->i:I

    .line 547
    .line 548
    iget-object v4, v6, Lm7;->i:Ljava/lang/CharSequence;

    .line 549
    .line 550
    iput-object v4, v12, Ll7;->j:Ljava/lang/CharSequence;

    .line 551
    .line 552
    iget v4, v6, Lm7;->j:I

    .line 553
    .line 554
    iput v4, v12, Ll7;->k:I

    .line 555
    .line 556
    iget-object v4, v6, Lm7;->k:Ljava/lang/CharSequence;

    .line 557
    .line 558
    iput-object v4, v12, Ll7;->l:Ljava/lang/CharSequence;

    .line 559
    .line 560
    iget-object v4, v6, Lm7;->l:Ljava/util/ArrayList;

    .line 561
    .line 562
    iput-object v4, v12, Ll7;->m:Ljava/util/ArrayList;

    .line 563
    .line 564
    iget-object v4, v6, Lm7;->m:Ljava/util/ArrayList;

    .line 565
    .line 566
    iput-object v4, v12, Ll7;->n:Ljava/util/ArrayList;

    .line 567
    .line 568
    iget-boolean v4, v6, Lm7;->n:Z

    .line 569
    .line 570
    iput-boolean v4, v12, Ll7;->o:Z

    .line 571
    .line 572
    const/4 v4, 0x1

    .line 573
    invoke-virtual {v12, v4}, Ll7;->c(I)V

    .line 574
    .line 575
    .line 576
    invoke-static/range {p1 .. p1}, Lam;->A(I)Z

    .line 577
    .line 578
    .line 579
    move-result v5

    .line 580
    if-eqz v5, :cond_10

    .line 581
    .line 582
    new-instance v5, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    const-string v6, "restoreAllState: back stack #"

    .line 585
    .line 586
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    const-string v6, " (index "

    .line 593
    .line 594
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    iget v6, v12, Ll7;->r:I

    .line 598
    .line 599
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v5

    .line 612
    invoke-static {v10, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    .line 614
    .line 615
    new-instance v5, Les;

    .line 616
    .line 617
    invoke-direct {v5}, Les;-><init>()V

    .line 618
    .line 619
    .line 620
    new-instance v6, Ljava/io/PrintWriter;

    .line 621
    .line 622
    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 623
    .line 624
    .line 625
    const-string v5, "  "

    .line 626
    .line 627
    const/4 v7, 0x0

    .line 628
    invoke-virtual {v12, v5, v6, v7}, Ll7;->d(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    .line 632
    .line 633
    .line 634
    goto :goto_8

    .line 635
    :cond_10
    const/4 v7, 0x0

    .line 636
    :goto_8
    iget-object v5, v0, Lam;->d:Ljava/util/ArrayList;

    .line 637
    .line 638
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    add-int/lit8 v3, v3, 0x1

    .line 642
    .line 643
    move/from16 v9, p1

    .line 644
    .line 645
    move v11, v4

    .line 646
    const/4 v4, 0x0

    .line 647
    goto/16 :goto_5

    .line 648
    .line 649
    :cond_11
    const/4 v7, 0x0

    .line 650
    goto :goto_9

    .line 651
    :cond_12
    move-object v3, v4

    .line 652
    const/4 v7, 0x0

    .line 653
    iput-object v3, v0, Lam;->d:Ljava/util/ArrayList;

    .line 654
    .line 655
    :goto_9
    iget-object v3, v0, Lam;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 656
    .line 657
    iget v4, v1, Lbm;->d:I

    .line 658
    .line 659
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 660
    .line 661
    .line 662
    iget-object v3, v1, Lbm;->e:Ljava/lang/String;

    .line 663
    .line 664
    if-eqz v3, :cond_13

    .line 665
    .line 666
    invoke-virtual {v2, v3}, Lr5;->g(Ljava/lang/String;)Lol;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    iput-object v2, v0, Lam;->q:Lol;

    .line 671
    .line 672
    invoke-virtual {v0, v2}, Lam;->n(Lol;)V

    .line 673
    .line 674
    .line 675
    :cond_13
    iget-object v2, v1, Lbm;->f:Ljava/util/ArrayList;

    .line 676
    .line 677
    if-eqz v2, :cond_14

    .line 678
    .line 679
    move v5, v7

    .line 680
    :goto_a
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-ge v5, v3, :cond_14

    .line 685
    .line 686
    iget-object v3, v1, Lbm;->g:Ljava/util/ArrayList;

    .line 687
    .line 688
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    check-cast v3, Landroid/os/Bundle;

    .line 693
    .line 694
    iget-object v4, v0, Lam;->n:Lpl;

    .line 695
    .line 696
    iget-object v4, v4, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 697
    .line 698
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 703
    .line 704
    .line 705
    iget-object v4, v0, Lam;->j:Ljava/util/Map;

    .line 706
    .line 707
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v6

    .line 711
    invoke-interface {v4, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    add-int/lit8 v5, v5, 0x1

    .line 715
    .line 716
    goto :goto_a

    .line 717
    :cond_14
    new-instance v2, Ljava/util/ArrayDeque;

    .line 718
    .line 719
    iget-object v1, v1, Lbm;->h:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 722
    .line 723
    .line 724
    iput-object v2, v0, Lam;->w:Ljava/util/ArrayDeque;

    .line 725
    .line 726
    return-void
.end method

.method public final L()Lbm;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lam;->e()Ljava/util/HashSet;

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
    check-cast v1, Ldg;

    .line 21
    .line 22
    iget-boolean v3, v1, Ldg;->e:Z

    .line 23
    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    iput-boolean v2, v1, Ldg;->e:Z

    .line 27
    .line 28
    invoke-virtual {v1}, Ldg;->c()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0}, Lam;->e()Ljava/util/HashSet;

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
    check-cast v1, Ldg;

    .line 51
    .line 52
    invoke-virtual {v1}, Ldg;->e()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v0, 0x1

    .line 57
    invoke-virtual {p0, v0}, Lam;->t(Z)Z

    .line 58
    .line 59
    .line 60
    iput-boolean v0, p0, Lam;->y:Z

    .line 61
    .line 62
    iget-object v1, p0, Lam;->F:Lcm;

    .line 63
    .line 64
    iput-boolean v0, v1, Lcm;->h:Z

    .line 65
    .line 66
    iget-object v0, p0, Lam;->c:Lr5;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v1, Ljava/util/ArrayList;

    .line 72
    .line 73
    iget-object v0, v0, Lr5;->b:Ljava/lang/Object;

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
    check-cast v3, Landroidx/fragment/app/a;

    .line 105
    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    iget-object v6, v3, Landroidx/fragment/app/a;->c:Lol;

    .line 109
    .line 110
    new-instance v7, Lem;

    .line 111
    .line 112
    invoke-direct {v7, v6}, Lem;-><init>(Lol;)V

    .line 113
    .line 114
    .line 115
    iget v8, v6, Lol;->a:I

    .line 116
    .line 117
    const/4 v9, -0x1

    .line 118
    if-le v8, v9, :cond_e

    .line 119
    .line 120
    iget-object v8, v7, Lem;->m:Landroid/os/Bundle;

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
    invoke-virtual {v6, v8}, Lol;->r(Landroid/os/Bundle;)V

    .line 130
    .line 131
    .line 132
    iget-object v9, v6, Lol;->O:Lim;

    .line 133
    .line 134
    invoke-virtual {v9, v8}, Lim;->c(Landroid/os/Bundle;)V

    .line 135
    .line 136
    .line 137
    iget-object v9, v6, Lol;->t:Lam;

    .line 138
    .line 139
    invoke-virtual {v9}, Lam;->L()Lbm;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    if-eqz v9, :cond_4

    .line 144
    .line 145
    const-string v10, "android:support:fragments"

    .line 146
    .line 147
    invoke-virtual {v8, v10, v9}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object v9, v3, Landroidx/fragment/app/a;->a:Ld4;

    .line 151
    .line 152
    invoke-virtual {v9, v2}, Ld4;->m(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v8}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    move-object v5, v8

    .line 163
    :goto_3
    iget-object v8, v6, Lol;->E:Landroid/view/View;

    .line 164
    .line 165
    if-eqz v8, :cond_6

    .line 166
    .line 167
    invoke-virtual {v3}, Landroidx/fragment/app/a;->o()V

    .line 168
    .line 169
    .line 170
    :cond_6
    iget-object v3, v6, Lol;->c:Landroid/util/SparseArray;

    .line 171
    .line 172
    if-eqz v3, :cond_8

    .line 173
    .line 174
    if-nez v5, :cond_7

    .line 175
    .line 176
    new-instance v5, Landroid/os/Bundle;

    .line 177
    .line 178
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 179
    .line 180
    .line 181
    :cond_7
    const-string v3, "android:view_state"

    .line 182
    .line 183
    iget-object v8, v6, Lol;->c:Landroid/util/SparseArray;

    .line 184
    .line 185
    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 186
    .line 187
    .line 188
    :cond_8
    iget-object v3, v6, Lol;->d:Landroid/os/Bundle;

    .line 189
    .line 190
    if-eqz v3, :cond_a

    .line 191
    .line 192
    if-nez v5, :cond_9

    .line 193
    .line 194
    new-instance v5, Landroid/os/Bundle;

    .line 195
    .line 196
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 197
    .line 198
    .line 199
    :cond_9
    const-string v3, "android:view_registry_state"

    .line 200
    .line 201
    iget-object v8, v6, Lol;->d:Landroid/os/Bundle;

    .line 202
    .line 203
    invoke-virtual {v5, v3, v8}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 204
    .line 205
    .line 206
    :cond_a
    iget-boolean v3, v6, Lol;->G:Z

    .line 207
    .line 208
    if-nez v3, :cond_c

    .line 209
    .line 210
    if-nez v5, :cond_b

    .line 211
    .line 212
    new-instance v5, Landroid/os/Bundle;

    .line 213
    .line 214
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 215
    .line 216
    .line 217
    :cond_b
    const-string v3, "android:user_visible_hint"

    .line 218
    .line 219
    iget-boolean v8, v6, Lol;->G:Z

    .line 220
    .line 221
    invoke-virtual {v5, v3, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    :cond_c
    iput-object v5, v7, Lem;->m:Landroid/os/Bundle;

    .line 225
    .line 226
    iget-object v3, v6, Lol;->h:Ljava/lang/String;

    .line 227
    .line 228
    if-eqz v3, :cond_f

    .line 229
    .line 230
    if-nez v5, :cond_d

    .line 231
    .line 232
    new-instance v3, Landroid/os/Bundle;

    .line 233
    .line 234
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object v3, v7, Lem;->m:Landroid/os/Bundle;

    .line 238
    .line 239
    :cond_d
    iget-object v3, v7, Lem;->m:Landroid/os/Bundle;

    .line 240
    .line 241
    const-string v5, "android:target_state"

    .line 242
    .line 243
    iget-object v8, v6, Lol;->h:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {v3, v5, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    iget v3, v6, Lol;->i:I

    .line 249
    .line 250
    if-eqz v3, :cond_f

    .line 251
    .line 252
    iget-object v5, v7, Lem;->m:Landroid/os/Bundle;

    .line 253
    .line 254
    const-string v8, "android:target_req_state"

    .line 255
    .line 256
    invoke-virtual {v5, v8, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_e
    iget-object v3, v6, Lol;->b:Landroid/os/Bundle;

    .line 261
    .line 262
    iput-object v3, v7, Lem;->m:Landroid/os/Bundle;

    .line 263
    .line 264
    :cond_f
    :goto_4
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    invoke-static {v4}, Lam;->A(I)Z

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    if-eqz v3, :cond_3

    .line 272
    .line 273
    const-string v3, "FragmentManager"

    .line 274
    .line 275
    new-instance v4, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v5, "Saved state of "

    .line 278
    .line 279
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v5, ": "

    .line 286
    .line 287
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    iget-object v5, v7, Lem;->m:Landroid/os/Bundle;

    .line 291
    .line 292
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    goto/16 :goto_2

    .line 303
    .line 304
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_12

    .line 309
    .line 310
    invoke-static {v4}, Lam;->A(I)Z

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    if-eqz v0, :cond_11

    .line 315
    .line 316
    const-string v0, "FragmentManager"

    .line 317
    .line 318
    const-string v1, "saveAllState: no fragments!"

    .line 319
    .line 320
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 321
    .line 322
    .line 323
    :cond_11
    return-object v5

    .line 324
    :cond_12
    iget-object v0, p0, Lam;->c:Lr5;

    .line 325
    .line 326
    iget-object v3, v0, Lr5;->c:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v3, Ljava/util/ArrayList;

    .line 329
    .line 330
    monitor-enter v3

    .line 331
    :try_start_0
    iget-object v6, v0, Lr5;->c:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v6, Ljava/util/ArrayList;

    .line 334
    .line 335
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 336
    .line 337
    .line 338
    move-result v6

    .line 339
    if-eqz v6, :cond_13

    .line 340
    .line 341
    monitor-exit v3

    .line 342
    move-object v6, v5

    .line 343
    goto :goto_6

    .line 344
    :catchall_0
    move-exception v0

    .line 345
    goto/16 :goto_8

    .line 346
    .line 347
    :cond_13
    new-instance v6, Ljava/util/ArrayList;

    .line 348
    .line 349
    iget-object v7, v0, Lr5;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v7, Ljava/util/ArrayList;

    .line 352
    .line 353
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 354
    .line 355
    .line 356
    move-result v7

    .line 357
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 358
    .line 359
    .line 360
    iget-object v0, v0, Lr5;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    move v8, v2

    .line 369
    :cond_14
    :goto_5
    if-ge v8, v7, :cond_15

    .line 370
    .line 371
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    add-int/lit8 v8, v8, 0x1

    .line 376
    .line 377
    check-cast v9, Lol;

    .line 378
    .line 379
    iget-object v10, v9, Lol;->e:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    invoke-static {v4}, Lam;->A(I)Z

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    if-eqz v10, :cond_14

    .line 389
    .line 390
    const-string v10, "FragmentManager"

    .line 391
    .line 392
    new-instance v11, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 395
    .line 396
    .line 397
    const-string v12, "saveAllState: adding fragment ("

    .line 398
    .line 399
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    iget-object v12, v9, Lol;->e:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v12, "): "

    .line 408
    .line 409
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v9

    .line 419
    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 420
    .line 421
    .line 422
    goto :goto_5

    .line 423
    :cond_15
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 424
    :goto_6
    iget-object v0, p0, Lam;->d:Ljava/util/ArrayList;

    .line 425
    .line 426
    if-eqz v0, :cond_17

    .line 427
    .line 428
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-lez v0, :cond_17

    .line 433
    .line 434
    new-array v3, v0, [Lm7;

    .line 435
    .line 436
    :goto_7
    if-ge v2, v0, :cond_18

    .line 437
    .line 438
    new-instance v7, Lm7;

    .line 439
    .line 440
    iget-object v8, p0, Lam;->d:Ljava/util/ArrayList;

    .line 441
    .line 442
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    check-cast v8, Ll7;

    .line 447
    .line 448
    invoke-direct {v7, v8}, Lm7;-><init>(Ll7;)V

    .line 449
    .line 450
    .line 451
    aput-object v7, v3, v2

    .line 452
    .line 453
    invoke-static {v4}, Lam;->A(I)Z

    .line 454
    .line 455
    .line 456
    move-result v7

    .line 457
    if-eqz v7, :cond_16

    .line 458
    .line 459
    const-string v7, "FragmentManager"

    .line 460
    .line 461
    new-instance v8, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v9, "saveAllState: adding back stack #"

    .line 464
    .line 465
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    const-string v9, ": "

    .line 472
    .line 473
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    iget-object v9, p0, Lam;->d:Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v8

    .line 489
    invoke-static {v7, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 493
    .line 494
    goto :goto_7

    .line 495
    :cond_17
    move-object v3, v5

    .line 496
    :cond_18
    new-instance v0, Lbm;

    .line 497
    .line 498
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 499
    .line 500
    .line 501
    iput-object v5, v0, Lbm;->e:Ljava/lang/String;

    .line 502
    .line 503
    new-instance v2, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 506
    .line 507
    .line 508
    iput-object v2, v0, Lbm;->f:Ljava/util/ArrayList;

    .line 509
    .line 510
    new-instance v4, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .line 514
    .line 515
    iput-object v4, v0, Lbm;->g:Ljava/util/ArrayList;

    .line 516
    .line 517
    iput-object v1, v0, Lbm;->a:Ljava/util/ArrayList;

    .line 518
    .line 519
    iput-object v6, v0, Lbm;->b:Ljava/util/ArrayList;

    .line 520
    .line 521
    iput-object v3, v0, Lbm;->c:[Lm7;

    .line 522
    .line 523
    iget-object v1, p0, Lam;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 524
    .line 525
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    iput v1, v0, Lbm;->d:I

    .line 530
    .line 531
    iget-object v1, p0, Lam;->q:Lol;

    .line 532
    .line 533
    if-eqz v1, :cond_19

    .line 534
    .line 535
    iget-object v1, v1, Lol;->e:Ljava/lang/String;

    .line 536
    .line 537
    iput-object v1, v0, Lbm;->e:Ljava/lang/String;

    .line 538
    .line 539
    :cond_19
    iget-object v1, p0, Lam;->j:Ljava/util/Map;

    .line 540
    .line 541
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 546
    .line 547
    .line 548
    iget-object v1, p0, Lam;->j:Ljava/util/Map;

    .line 549
    .line 550
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 555
    .line 556
    .line 557
    new-instance v1, Ljava/util/ArrayList;

    .line 558
    .line 559
    iget-object v2, p0, Lam;->w:Ljava/util/ArrayDeque;

    .line 560
    .line 561
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 562
    .line 563
    .line 564
    iput-object v1, v0, Lbm;->h:Ljava/util/ArrayList;

    .line 565
    .line 566
    return-object v0

    .line 567
    :goto_8
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 568
    throw v0
.end method

.method public final M()V
    .locals 3

    .line 1
    iget-object v0, p0, Lam;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lam;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lam;->n:Lpl;

    .line 14
    .line 15
    iget-object v1, v1, Lpl;->A:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lam;->G:Li7;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lam;->n:Lpl;

    .line 23
    .line 24
    iget-object v1, v1, Lpl;->A:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lam;->G:Li7;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lam;->T()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final N(Lol;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lam;->w(Lol;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final O(Lol;Lnq;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lol;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lam;->c:Lr5;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lr5;->g(Ljava/lang/String;)Lol;

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
    iget-object v0, p1, Lol;->s:Lpl;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Lol;->r:Lam;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Lol;->K:Lnq;

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

.method public final P(Lol;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lol;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lam;->c:Lr5;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lr5;->g(Ljava/lang/String;)Lol;

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
    iget-object v0, p1, Lol;->s:Lpl;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Lol;->r:Lam;

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
    iget-object v0, p0, Lam;->q:Lol;

    .line 55
    .line 56
    iput-object p1, p0, Lam;->q:Lol;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lam;->n(Lol;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lam;->q:Lol;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lam;->n(Lol;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final Q(Lol;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lam;->w(Lol;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, Lol;->H:Lnl;

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
    iget v3, v1, Lnl;->b:I

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
    iget v4, v1, Lnl;->c:I

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
    iget v3, v1, Lnl;->d:I

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
    iget v1, v1, Lnl;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f0901bc

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
    check-cast v0, Lol;

    .line 56
    .line 57
    iget-object p1, p1, Lol;->H:Lnl;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, Lnl;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, Lol;->H:Lnl;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, Lol;->f()Lnl;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, Lnl;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final S()V
    .locals 7

    .line 1
    iget-object v0, p0, Lam;->c:Lr5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr5;->i()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    check-cast v4, Landroidx/fragment/app/a;

    .line 22
    .line 23
    iget-object v5, v4, Landroidx/fragment/app/a;->c:Lol;

    .line 24
    .line 25
    iget-boolean v6, v5, Lol;->F:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Lam;->b:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iput-boolean v4, p0, Lam;->B:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-boolean v2, v5, Lol;->F:Z

    .line 38
    .line 39
    invoke-virtual {v4}, Landroidx/fragment/app/a;->k()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final T()V
    .locals 4

    .line 1
    iget-object v0, p0, Lam;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lam;->a:Ljava/util/ArrayList;

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
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lam;->h:Lul;

    .line 14
    .line 15
    iput-boolean v2, v1, Lul;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Lul;->c:Lfx;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljm;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lam;->h:Lul;

    .line 30
    .line 31
    iget-object v1, p0, Lam;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_0
    if-lez v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, Lam;->p:Lol;

    .line 45
    .line 46
    invoke-static {v1}, Lam;->D(Lol;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    iput-boolean v2, v0, Lul;->a:Z

    .line 55
    .line 56
    iget-object v0, v0, Lul;->c:Lfx;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, Ljm;->a()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method

.method public final a(Lol;)Landroidx/fragment/app/a;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

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
    invoke-virtual {p0, p1}, Lam;->f(Lol;)Landroidx/fragment/app/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object p0, p1, Lol;->r:Lam;

    .line 32
    .line 33
    iget-object v1, p0, Lam;->c:Lr5;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lr5;->v(Landroidx/fragment/app/a;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v2, p1, Lol;->z:Z

    .line 39
    .line 40
    if-nez v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Lr5;->a(Lol;)V

    .line 43
    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, p1, Lol;->l:Z

    .line 47
    .line 48
    iget-object v2, p1, Lol;->E:Landroid/view/View;

    .line 49
    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    iput-boolean v1, p1, Lol;->I:Z

    .line 53
    .line 54
    :cond_1
    invoke-static {p1}, Lam;->B(Lol;)Z

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
    iput-boolean p1, p0, Lam;->x:Z

    .line 62
    .line 63
    :cond_2
    return-object v0
.end method

.method public final b(Lpl;Lgf;Lol;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lam;->n:Lpl;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    iput-object p1, p0, Lam;->n:Lpl;

    .line 6
    .line 7
    iput-object p2, p0, Lam;->o:Lgf;

    .line 8
    .line 9
    iput-object p3, p0, Lam;->p:Lol;

    .line 10
    .line 11
    iget-object p2, p0, Lam;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lwl;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lwl;-><init>(Lol;)V

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
    iget-object p2, p0, Lam;->p:Lol;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lam;->T()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroidx/activity/ComponentActivity;->i()Landroidx/activity/a;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, Lam;->g:Landroidx/activity/a;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, Lam;->h:Lul;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Landroidx/activity/a;->a(Lsq;Lul;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    const/4 v0, 0x1

    .line 58
    if-eqz p3, :cond_6

    .line 59
    .line 60
    iget-object p1, p3, Lol;->r:Lam;

    .line 61
    .line 62
    iget-object p1, p1, Lam;->F:Lcm;

    .line 63
    .line 64
    iget-object v1, p1, Lcm;->d:Ljava/util/HashMap;

    .line 65
    .line 66
    iget-object v2, p3, Lol;->e:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lcm;

    .line 73
    .line 74
    if-nez v2, :cond_5

    .line 75
    .line 76
    new-instance v2, Lcm;

    .line 77
    .line 78
    iget-boolean p1, p1, Lcm;->f:Z

    .line 79
    .line 80
    invoke-direct {v2, p1}, Lcm;-><init>(Z)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p3, Lol;->e:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_5
    iput-object v2, p0, Lam;->F:Lcm;

    .line 89
    .line 90
    goto/16 :goto_5

    .line 91
    .line 92
    :cond_6
    if-eqz p1, :cond_a

    .line 93
    .line 94
    iget-object p1, p1, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 95
    .line 96
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->d()Lwa0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string v1, "store"

    .line 101
    .line 102
    invoke-static {v1, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v1, Lte;->b:Lte;

    .line 106
    .line 107
    const-string v2, "defaultCreationExtras"

    .line 108
    .line 109
    invoke-static {v2, v1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const-class v2, Lcm;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-eqz v3, :cond_9

    .line 119
    .line 120
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 121
    .line 122
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "key"

    .line 127
    .line 128
    invoke-static {v4, v3}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p1, Lwa0;->a:Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, Lua0;

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_7

    .line 144
    .line 145
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    .line 146
    .line 147
    invoke-static {p1, v4}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 152
    .line 153
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v1, v1, Lue;->a:Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 159
    .line 160
    .line 161
    sget-object v1, Lxh;->p:Lxh;

    .line 162
    .line 163
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    :try_start_0
    new-instance v1, Lcm;

    .line 167
    .line 168
    invoke-direct {v1, v0}, Lcm;-><init>(Z)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    .line 170
    .line 171
    :goto_2
    move-object v4, v1

    .line 172
    goto :goto_3

    .line 173
    :catch_0
    new-instance v1, Lcm;

    .line 174
    .line 175
    invoke-direct {v1, v0}, Lcm;-><init>(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :goto_3
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, Lua0;

    .line 184
    .line 185
    if-eqz p1, :cond_8

    .line 186
    .line 187
    invoke-virtual {p1}, Lua0;->a()V

    .line 188
    .line 189
    .line 190
    :cond_8
    :goto_4
    check-cast v4, Lcm;

    .line 191
    .line 192
    iput-object v4, p0, Lam;->F:Lcm;

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 198
    .line 199
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p1

    .line 203
    :cond_a
    new-instance p1, Lcm;

    .line 204
    .line 205
    invoke-direct {p1, p2}, Lcm;-><init>(Z)V

    .line 206
    .line 207
    .line 208
    iput-object p1, p0, Lam;->F:Lcm;

    .line 209
    .line 210
    :goto_5
    iget-object p1, p0, Lam;->F:Lcm;

    .line 211
    .line 212
    iget-boolean v1, p0, Lam;->y:Z

    .line 213
    .line 214
    if-nez v1, :cond_b

    .line 215
    .line 216
    iget-boolean v1, p0, Lam;->z:Z

    .line 217
    .line 218
    if-eqz v1, :cond_c

    .line 219
    .line 220
    :cond_b
    move p2, v0

    .line 221
    :cond_c
    iput-boolean p2, p1, Lcm;->h:Z

    .line 222
    .line 223
    iget-object p2, p0, Lam;->c:Lr5;

    .line 224
    .line 225
    iput-object p1, p2, Lr5;->d:Ljava/lang/Object;

    .line 226
    .line 227
    iget-object p1, p0, Lam;->n:Lpl;

    .line 228
    .line 229
    if-eqz p1, :cond_e

    .line 230
    .line 231
    iget-object p1, p1, Lpl;->C:Landroidx/fragment/app/FragmentActivity;

    .line 232
    .line 233
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->j:Lbc;

    .line 234
    .line 235
    if-eqz p3, :cond_d

    .line 236
    .line 237
    new-instance p2, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    iget-object p3, p3, Lol;->e:Ljava/lang/String;

    .line 243
    .line 244
    const-string v0, ":"

    .line 245
    .line 246
    invoke-static {p2, p3, v0}, Lg40;->l(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p2

    .line 250
    goto :goto_6

    .line 251
    :cond_d
    const-string p2, ""

    .line 252
    .line 253
    :goto_6
    const-string p3, "FragmentManager:"

    .line 254
    .line 255
    invoke-static {p3, p2}, Lg40;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    const-string p3, "StartActivityForResult"

    .line 260
    .line 261
    invoke-static {p2, p3}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p3

    .line 265
    new-instance v0, Lv1;

    .line 266
    .line 267
    const/4 v1, 0x1

    .line 268
    invoke-direct {v0, v1}, Lv1;-><init>(I)V

    .line 269
    .line 270
    .line 271
    new-instance v1, Ltl;

    .line 272
    .line 273
    const/4 v2, 0x2

    .line 274
    invoke-direct {v1, p0, v2}, Ltl;-><init>(Lam;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p3, v0, v1}, Lbc;->b(Ljava/lang/String;Lgf;Ltl;)Ld4;

    .line 278
    .line 279
    .line 280
    move-result-object p3

    .line 281
    iput-object p3, p0, Lam;->t:Ld4;

    .line 282
    .line 283
    const-string p3, "StartIntentSenderForResult"

    .line 284
    .line 285
    invoke-static {p2, p3}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p3

    .line 289
    new-instance v0, Lv1;

    .line 290
    .line 291
    const/4 v1, 0x2

    .line 292
    invoke-direct {v0, v1}, Lv1;-><init>(I)V

    .line 293
    .line 294
    .line 295
    new-instance v1, Ltl;

    .line 296
    .line 297
    const/4 v2, 0x0

    .line 298
    invoke-direct {v1, p0, v2}, Ltl;-><init>(Lam;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, p3, v0, v1}, Lbc;->b(Ljava/lang/String;Lgf;Ltl;)Ld4;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    iput-object p3, p0, Lam;->u:Ld4;

    .line 306
    .line 307
    const-string p3, "RequestPermissions"

    .line 308
    .line 309
    invoke-static {p2, p3}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p2

    .line 313
    new-instance p3, Lv1;

    .line 314
    .line 315
    const/4 v0, 0x0

    .line 316
    invoke-direct {p3, v0}, Lv1;-><init>(I)V

    .line 317
    .line 318
    .line 319
    new-instance v0, Ltl;

    .line 320
    .line 321
    const/4 v1, 0x1

    .line 322
    invoke-direct {v0, p0, v1}, Ltl;-><init>(Lam;I)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, p2, p3, v0}, Lbc;->b(Ljava/lang/String;Lgf;Ltl;)Ld4;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    iput-object p1, p0, Lam;->v:Ld4;

    .line 330
    .line 331
    :cond_e
    return-void

    .line 332
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    const-string p2, "Already attached"

    .line 335
    .line 336
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    throw p1
.end method

.method public final c(Lol;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

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
    iget-boolean v1, p1, Lol;->z:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Lol;->z:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lol;->k:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lam;->c:Lr5;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Lr5;->a(Lol;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lam;->A(I)Z

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
    invoke-static {p1}, Lam;->B(Lol;)Z

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
    iput-boolean p1, p0, Lam;->x:Z

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
    iput-boolean v0, p0, Lam;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, Lam;->D:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lam;->C:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lam;->c:Lr5;

    .line 7
    .line 8
    invoke-virtual {v1}, Lr5;->i()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Landroidx/fragment/app/a;

    .line 26
    .line 27
    iget-object v4, v4, Landroidx/fragment/app/a;->c:Lol;

    .line 28
    .line 29
    iget-object v4, v4, Lol;->D:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Lam;->y()Lxh;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v4, v5}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public final f(Lol;)Landroidx/fragment/app/a;
    .locals 3

    .line 1
    iget-object v0, p1, Lol;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lam;->c:Lr5;

    .line 4
    .line 5
    iget-object v2, v1, Lr5;->b:Ljava/lang/Object;

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
    check-cast v0, Landroidx/fragment/app/a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Landroidx/fragment/app/a;

    .line 19
    .line 20
    iget-object v2, p0, Lam;->k:Ld4;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Landroidx/fragment/app/a;-><init>(Ld4;Lr5;Lol;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lam;->n:Lpl;

    .line 26
    .line 27
    iget-object p1, p1, Lpl;->z:Landroidx/fragment/app/FragmentActivity;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Landroidx/fragment/app/a;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, Lam;->m:I

    .line 37
    .line 38
    iput p1, v0, Landroidx/fragment/app/a;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(Lol;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Lam;->A(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Lol;->z:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Lol;->z:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Lol;->k:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Lam;->A(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lam;->c:Lr5;

    .line 62
    .line 63
    iget-object v1, v0, Lr5;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Lr5;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Lol;->k:Z

    .line 78
    .line 79
    invoke-static {p1}, Lam;->B(Lol;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Lam;->x:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lam;->Q(Lol;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v1
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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v1, Lol;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, v1, Lol;->C:Z

    .line 27
    .line 28
    iget-object v1, v1, Lol;->t:Lam;

    .line 29
    .line 30
    invoke-virtual {v1}, Lam;->h()V

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
    iget v0, p0, Lam;->m:I

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v3, Lol;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Lol;->y:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Lol;->t:Lam;

    .line 37
    .line 38
    invoke-virtual {v3}, Lam;->i()Z

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
    iget v0, p0, Lam;->m:I

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v5, Lol;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lam;->C(Lol;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Lol;->y:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Lol;->t:Lam;

    .line 45
    .line 46
    invoke-virtual {v6}, Lam;->j()Z

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
    iget-object v0, p0, Lam;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Lam;->e:Ljava/util/ArrayList;

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
    iget-object v0, p0, Lam;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lol;

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
    iput-object v3, p0, Lam;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final k()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lam;->A:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lam;->t(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lam;->e()Ljava/util/HashSet;

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
    check-cast v1, Ldg;

    .line 26
    .line 27
    invoke-virtual {v1}, Ldg;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, -0x1

    .line 32
    invoke-virtual {p0, v0}, Lam;->p(I)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Lam;->n:Lpl;

    .line 37
    .line 38
    iput-object v0, p0, Lam;->o:Lgf;

    .line 39
    .line 40
    iput-object v0, p0, Lam;->p:Lol;

    .line 41
    .line 42
    iget-object v1, p0, Lam;->g:Landroidx/activity/a;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lam;->h:Lul;

    .line 47
    .line 48
    iget-object v1, v1, Lul;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v2, Lr8;

    .line 65
    .line 66
    invoke-interface {v2}, Lr8;->cancel()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    iput-object v0, p0, Lam;->g:Landroidx/activity/a;

    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Lam;->t:Ld4;

    .line 73
    .line 74
    if-eqz v0, :cond_f

    .line 75
    .line 76
    iget-object v1, v0, Ld4;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lbc;

    .line 79
    .line 80
    iget-object v0, v0, Ld4;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Ljava/lang/String;

    .line 83
    .line 84
    iget-object v2, v1, Lbc;->g:Landroid/os/Bundle;

    .line 85
    .line 86
    iget-object v3, v1, Lbc;->f:Ljava/util/HashMap;

    .line 87
    .line 88
    iget-object v4, v1, Lbc;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_3

    .line 95
    .line 96
    iget-object v4, v1, Lbc;->b:Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    check-cast v4, Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    iget-object v5, v1, Lbc;->a:Ljava/util/HashMap;

    .line 107
    .line 108
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :cond_3
    iget-object v4, v1, Lbc;->e:Ljava/util/HashMap;

    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    const-string v5, "ActivityResultRegistry"

    .line 121
    .line 122
    const-string v6, "Dropping pending result for request "

    .line 123
    .line 124
    const-string v7, ": "

    .line 125
    .line 126
    if-eqz v4, :cond_4

    .line 127
    .line 128
    new-instance v4, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_5

    .line 161
    .line 162
    new-instance v3, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    :cond_5
    iget-object v1, v1, Lbc;->c:Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-nez v0, :cond_e

    .line 197
    .line 198
    iget-object v0, p0, Lam;->u:Ld4;

    .line 199
    .line 200
    iget-object v1, v0, Ld4;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Lbc;

    .line 203
    .line 204
    iget-object v0, v0, Ld4;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Ljava/lang/String;

    .line 207
    .line 208
    iget-object v2, v1, Lbc;->g:Landroid/os/Bundle;

    .line 209
    .line 210
    iget-object v3, v1, Lbc;->f:Ljava/util/HashMap;

    .line 211
    .line 212
    iget-object v4, v1, Lbc;->d:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-nez v4, :cond_6

    .line 219
    .line 220
    iget-object v4, v1, Lbc;->b:Ljava/util/HashMap;

    .line 221
    .line 222
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Ljava/lang/Integer;

    .line 227
    .line 228
    if-eqz v4, :cond_6

    .line 229
    .line 230
    iget-object v8, v1, Lbc;->a:Ljava/util/HashMap;

    .line 231
    .line 232
    invoke-virtual {v8, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    :cond_6
    iget-object v4, v1, Lbc;->e:Ljava/util/HashMap;

    .line 236
    .line 237
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_7

    .line 245
    .line 246
    new-instance v4, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    :cond_7
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-eqz v3, :cond_8

    .line 279
    .line 280
    new-instance v3, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :cond_8
    iget-object v1, v1, Lbc;->c:Ljava/util/HashMap;

    .line 309
    .line 310
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-nez v0, :cond_d

    .line 315
    .line 316
    iget-object v0, p0, Lam;->v:Ld4;

    .line 317
    .line 318
    iget-object v1, v0, Ld4;->c:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v1, Lbc;

    .line 321
    .line 322
    iget-object v0, v0, Ld4;->b:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, Ljava/lang/String;

    .line 325
    .line 326
    iget-object v2, v1, Lbc;->g:Landroid/os/Bundle;

    .line 327
    .line 328
    iget-object v3, v1, Lbc;->f:Ljava/util/HashMap;

    .line 329
    .line 330
    iget-object v4, v1, Lbc;->d:Ljava/util/ArrayList;

    .line 331
    .line 332
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-nez v4, :cond_9

    .line 337
    .line 338
    iget-object v4, v1, Lbc;->b:Ljava/util/HashMap;

    .line 339
    .line 340
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    check-cast v4, Ljava/lang/Integer;

    .line 345
    .line 346
    if-eqz v4, :cond_9

    .line 347
    .line 348
    iget-object v8, v1, Lbc;->a:Ljava/util/HashMap;

    .line 349
    .line 350
    invoke-virtual {v8, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    :cond_9
    iget-object v4, v1, Lbc;->e:Ljava/util/HashMap;

    .line 354
    .line 355
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_a

    .line 363
    .line 364
    new-instance v4, Ljava/lang/StringBuilder;

    .line 365
    .line 366
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    :cond_a
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    if-eqz v3, :cond_b

    .line 397
    .line 398
    new-instance v3, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    :cond_b
    iget-object v1, v1, Lbc;->c:Ljava/util/HashMap;

    .line 427
    .line 428
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    if-nez v0, :cond_c

    .line 433
    .line 434
    goto :goto_2

    .line 435
    :cond_c
    new-instance v0, Ljava/lang/ClassCastException;

    .line 436
    .line 437
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :cond_d
    new-instance v0, Ljava/lang/ClassCastException;

    .line 442
    .line 443
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 444
    .line 445
    .line 446
    throw v0

    .line 447
    :cond_e
    new-instance v0, Ljava/lang/ClassCastException;

    .line 448
    .line 449
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 450
    .line 451
    .line 452
    throw v0

    .line 453
    :cond_f
    :goto_2
    return-void
.end method

.method public final l()Z
    .locals 5

    .line 1
    iget v0, p0, Lam;->m:I

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v3, Lol;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, Lol;->y:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, Lol;->t:Lam;

    .line 37
    .line 38
    invoke-virtual {v3}, Lam;->l()Z

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

.method public final m()V
    .locals 3

    .line 1
    iget v0, p0, Lam;->m:I

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    check-cast v1, Lol;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, Lol;->y:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, Lol;->t:Lam;

    .line 36
    .line 37
    invoke-virtual {v1}, Lam;->m()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final n(Lol;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lol;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lam;->c:Lr5;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lr5;->g(Ljava/lang/String;)Lol;

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
    iget-object v0, p1, Lol;->r:Lam;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lam;->D(Lol;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p1, Lol;->j:Ljava/lang/Boolean;

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
    iput-object v0, p1, Lol;->j:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p1, p1, Lol;->t:Lam;

    .line 43
    .line 44
    invoke-virtual {p1}, Lam;->T()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, Lam;->q:Lol;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lam;->n(Lol;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    .line 1
    iget v0, p0, Lam;->m:I

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
    iget-object v0, p0, Lam;->c:Lr5;

    .line 9
    .line 10
    invoke-virtual {v0}, Lr5;->p()Ljava/util/List;

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
    :goto_0
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
    check-cast v3, Lol;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-static {v3}, Lam;->C(Lol;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-boolean v4, v3, Lol;->y:Z

    .line 39
    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    iget-object v3, v3, Lol;->t:Lam;

    .line 43
    .line 44
    invoke-virtual {v3}, Lam;->o()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    const/4 v3, 0x0

    .line 50
    :goto_1
    if-eqz v3, :cond_1

    .line 51
    .line 52
    move v1, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    return v1
.end method

.method public final p(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lam;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Lam;->c:Lr5;

    .line 6
    .line 7
    iget-object v2, v2, Lr5;->b:Ljava/lang/Object;

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
    check-cast v3, Landroidx/fragment/app/a;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Landroidx/fragment/app/a;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lam;->E(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lam;->e()Ljava/util/HashSet;

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
    check-cast v2, Ldg;

    .line 58
    .line 59
    invoke-virtual {v2}, Ldg;->e()V
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
    iput-boolean v1, p0, Lam;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lam;->t(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lam;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 13

    move-object/from16 v0, p3

    .line 1
    const-string v1, "    "

    .line 2
    invoke-static {p1, v1}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lam;->c:Lr5;

    .line 4
    iget-object v3, v2, Lr5;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    const-string v4, "    "

    .line 5
    invoke-static {p1, v4}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    iget-object v2, v2, Lr5;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_20

    .line 7
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 8
    const-string v5, "Active Fragments:"

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 9
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/a;

    .line 10
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v5, :cond_1f

    .line 11
    iget-object v5, v5, Landroidx/fragment/app/a;->c:Lol;

    .line 12
    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentId=#"

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 15
    iget v6, v5, Lol;->v:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 16
    const-string v6, " mContainerId=#"

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 17
    iget v6, v5, Lol;->w:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 18
    const-string v6, " mTag="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v5, Lol;->x:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mState="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v5, Lol;->a:I

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 20
    const-string v6, " mWho="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v5, Lol;->e:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 21
    const-string v6, " mBackStackNesting="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v5, Lol;->q:I

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 22
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mAdded="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->k:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 23
    const-string v6, " mRemoving="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->l:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 24
    const-string v6, " mFromLayout="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->m:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 25
    const-string v6, " mInLayout="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->n:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 26
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHidden="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->y:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 27
    const-string v6, " mDetached="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->z:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 28
    const-string v6, " mMenuVisible="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v5, Lol;->B:Z

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 29
    const-string v6, " mHasMenu="

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 30
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mRetainInstance="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v7, v5, Lol;->A:Z

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Z)V

    .line 31
    const-string v7, " mUserVisibleHint="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v7, v5, Lol;->G:Z

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Z)V

    .line 32
    iget-object v7, v5, Lol;->r:Lam;

    if-eqz v7, :cond_0

    .line 33
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mFragmentManager="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 34
    iget-object v7, v5, Lol;->r:Lam;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 35
    :cond_0
    iget-object v7, v5, Lol;->s:Lpl;

    if-eqz v7, :cond_1

    .line 36
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mHost="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 37
    iget-object v7, v5, Lol;->s:Lpl;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 38
    :cond_1
    iget-object v7, v5, Lol;->u:Lol;

    if-eqz v7, :cond_2

    .line 39
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mParentFragment="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 40
    iget-object v7, v5, Lol;->u:Lol;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 41
    :cond_2
    iget-object v7, v5, Lol;->f:Landroid/os/Bundle;

    if-eqz v7, :cond_3

    .line 42
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mArguments="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v7, v5, Lol;->f:Landroid/os/Bundle;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 43
    :cond_3
    iget-object v7, v5, Lol;->b:Landroid/os/Bundle;

    if-eqz v7, :cond_4

    .line 44
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mSavedFragmentState="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 45
    iget-object v7, v5, Lol;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 46
    :cond_4
    iget-object v7, v5, Lol;->c:Landroid/util/SparseArray;

    if-eqz v7, :cond_5

    .line 47
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mSavedViewState="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 48
    iget-object v7, v5, Lol;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 49
    :cond_5
    iget-object v7, v5, Lol;->d:Landroid/os/Bundle;

    if-eqz v7, :cond_6

    .line 50
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mSavedViewRegistryState="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 51
    iget-object v7, v5, Lol;->d:Landroid/os/Bundle;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 52
    :cond_6
    iget-object v7, v5, Lol;->g:Lol;

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    goto :goto_1

    .line 53
    :cond_7
    iget-object v7, v5, Lol;->r:Lam;

    if-eqz v7, :cond_8

    iget-object v9, v5, Lol;->h:Ljava/lang/String;

    if-eqz v9, :cond_8

    .line 54
    iget-object v7, v7, Lam;->c:Lr5;

    .line 55
    invoke-virtual {v7, v9}, Lr5;->g(Ljava/lang/String;)Lol;

    move-result-object v7

    goto :goto_1

    :cond_8
    move-object v7, v8

    :goto_1
    if-eqz v7, :cond_9

    .line 56
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "mTarget="

    invoke-virtual {v0, v9}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 57
    const-string v7, " mTargetRequestCode="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    iget v7, v5, Lol;->i:I

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(I)V

    .line 59
    :cond_9
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mPopDirection="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 60
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_a

    move v7, v6

    goto :goto_2

    .line 61
    :cond_a
    iget-boolean v7, v7, Lnl;->a:Z

    .line 62
    :goto_2
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Z)V

    .line 63
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_b

    move v7, v6

    goto :goto_3

    .line 64
    :cond_b
    iget v7, v7, Lnl;->b:I

    :goto_3
    if-eqz v7, :cond_d

    .line 65
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "getEnterAnim="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 66
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_c

    move v7, v6

    goto :goto_4

    .line 67
    :cond_c
    iget v7, v7, Lnl;->b:I

    .line 68
    :goto_4
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(I)V

    .line 69
    :cond_d
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_e

    move v7, v6

    goto :goto_5

    .line 70
    :cond_e
    iget v7, v7, Lnl;->c:I

    :goto_5
    if-eqz v7, :cond_10

    .line 71
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "getExitAnim="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 72
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_f

    move v7, v6

    goto :goto_6

    .line 73
    :cond_f
    iget v7, v7, Lnl;->c:I

    .line 74
    :goto_6
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(I)V

    .line 75
    :cond_10
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_11

    move v7, v6

    goto :goto_7

    .line 76
    :cond_11
    iget v7, v7, Lnl;->d:I

    :goto_7
    if-eqz v7, :cond_13

    .line 77
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "getPopEnterAnim="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 78
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_12

    move v7, v6

    goto :goto_8

    .line 79
    :cond_12
    iget v7, v7, Lnl;->d:I

    .line 80
    :goto_8
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(I)V

    .line 81
    :cond_13
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_14

    move v7, v6

    goto :goto_9

    .line 82
    :cond_14
    iget v7, v7, Lnl;->e:I

    :goto_9
    if-eqz v7, :cond_16

    .line 83
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "getPopExitAnim="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 84
    iget-object v7, v5, Lol;->H:Lnl;

    if-nez v7, :cond_15

    move v7, v6

    goto :goto_a

    .line 85
    :cond_15
    iget v7, v7, Lnl;->e:I

    .line 86
    :goto_a
    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(I)V

    .line 87
    :cond_16
    iget-object v7, v5, Lol;->D:Landroid/view/ViewGroup;

    if-eqz v7, :cond_17

    .line 88
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mContainer="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v7, v5, Lol;->D:Landroid/view/ViewGroup;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 89
    :cond_17
    iget-object v7, v5, Lol;->E:Landroid/view/View;

    if-eqz v7, :cond_18

    .line 90
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v7, "mView="

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v7, v5, Lol;->E:Landroid/view/View;

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 91
    :cond_18
    invoke-virtual {v5}, Lol;->h()Landroid/content/Context;

    move-result-object v7

    if-eqz v7, :cond_1e

    .line 92
    invoke-interface {v5}, Lxa0;->d()Lwa0;

    move-result-object v7

    .line 93
    const-string v9, "store"

    invoke-static {v9, v7}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    sget-object v9, Lte;->b:Lte;

    .line 95
    const-string v10, "defaultCreationExtras"

    invoke-static {v10, v9}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    const-class v10, Ltr;

    .line 97
    invoke-virtual {v10}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_1d

    .line 98
    const-string v12, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 99
    const-string v12, "key"

    invoke-static {v12, v11}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 100
    iget-object v7, v7, Lwa0;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lua0;

    .line 101
    invoke-virtual {v10, v12}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    .line 102
    const-string v7, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"

    invoke-static {v7, v12}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_d

    .line 103
    :cond_19
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 104
    iget-object v9, v9, Lue;->a:Ljava/util/LinkedHashMap;

    .line 105
    invoke-interface {v10, v9}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 106
    sget-object v9, Lxh;->p:Lxh;

    .line 107
    invoke-interface {v10, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    :try_start_0
    new-instance v9, Ltr;

    invoke-direct {v9}, Ltr;-><init>()V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    :goto_b
    move-object v12, v9

    goto :goto_c

    .line 109
    :catch_0
    new-instance v9, Ltr;

    invoke-direct {v9}, Ltr;-><init>()V

    goto :goto_b

    .line 110
    :goto_c
    invoke-interface {v7, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lua0;

    if-eqz v7, :cond_1a

    .line 111
    invoke-virtual {v7}, Lua0;->a()V

    .line 112
    :cond_1a
    :goto_d
    check-cast v12, Ltr;

    .line 113
    iget-object v7, v12, Ltr;->c:Ll40;

    .line 114
    iget v9, v7, Ll40;->c:I

    if-lez v9, :cond_1e

    .line 115
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v9, "Loaders:"

    invoke-virtual {v0, v9}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 116
    iget v9, v7, Ll40;->c:I

    if-gtz v9, :cond_1b

    goto :goto_e

    .line 117
    :cond_1b
    iget-object p1, v7, Ll40;->b:[Ljava/lang/Object;

    aget-object p1, p1, v6

    if-nez p1, :cond_1c

    .line 118
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 119
    iget-object p1, v7, Ll40;->a:[I

    aget p1, p1, v6

    .line 120
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 121
    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v8

    .line 122
    :cond_1c
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    .line 123
    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 124
    :cond_1e
    :goto_e
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 125
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Child "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v5, Lol;->t:Lam;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 126
    iget-object v5, v5, Lol;->t:Lam;

    const-string v6, "  "

    .line 127
    invoke-static {v4, v6}, Lg40;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v8, p4

    .line 128
    invoke-virtual {v5, v6, p2, v0, v8}, Lam;->q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1f
    move-object/from16 v8, p4

    .line 129
    const-string v5, "null"

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 130
    :cond_20
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    if-lez v2, :cond_21

    .line 131
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v5, "Added Fragments:"

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v5, v4

    :goto_f
    if-ge v5, v2, :cond_21

    .line 132
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lol;

    .line 133
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    const-string v7, "  #"

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 135
    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 136
    const-string v7, ": "

    invoke-virtual {v0, v7}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v6}, Lol;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    .line 138
    :cond_21
    iget-object v2, p0, Lam;->e:Ljava/util/ArrayList;

    if-eqz v2, :cond_22

    .line 139
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_22

    .line 140
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "Fragments Created Menus:"

    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v3, v4

    :goto_10
    if-ge v3, v2, :cond_22

    .line 141
    iget-object v5, p0, Lam;->e:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lol;

    .line 142
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 143
    const-string v6, "  #"

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->print(I)V

    .line 145
    const-string v6, ": "

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v5}, Lol;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    .line 147
    :cond_22
    iget-object v2, p0, Lam;->d:Ljava/util/ArrayList;

    if-eqz v2, :cond_23

    .line 148
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_23

    .line 149
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "Back Stack:"

    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v3, v4

    :goto_11
    if-ge v3, v2, :cond_23

    .line 150
    iget-object v5, p0, Lam;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll7;

    .line 151
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 152
    const-string v6, "  #"

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 153
    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->print(I)V

    .line 154
    const-string v6, ": "

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 155
    invoke-virtual {v5}, Ll7;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v6, 0x1

    .line 156
    invoke-virtual {v5, v1, v0, v6}, Ll7;->d(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    .line 157
    :cond_23
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 158
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Back Stack Index: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lam;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 159
    iget-object v1, p0, Lam;->a:Ljava/util/ArrayList;

    monitor-enter v1

    .line 160
    :try_start_1
    iget-object v2, p0, Lam;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_24

    .line 161
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "Pending Actions:"

    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_12
    if-ge v4, v2, :cond_24

    .line 162
    iget-object v3, p0, Lam;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lyl;

    .line 163
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 164
    const-string v5, "  #"

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v0, v4}, Ljava/io/PrintWriter;->print(I)V

    .line 166
    const-string v5, ": "

    invoke-virtual {v0, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v0, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_12

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_13

    .line 168
    :cond_24
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 169
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 170
    const-string v1, "FragmentManager misc state:"

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 172
    const-string v1, "  mHost="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 173
    iget-object v1, p0, Lam;->n:Lpl;

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 174
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 175
    const-string v1, "  mContainer="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 176
    iget-object v1, p0, Lam;->o:Lgf;

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 177
    iget-object v1, p0, Lam;->p:Lol;

    if-eqz v1, :cond_25

    .line 178
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 179
    const-string v1, "  mParent="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 180
    iget-object v1, p0, Lam;->p:Lol;

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 181
    :cond_25
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 182
    const-string v1, "  mCurState="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 183
    iget v1, p0, Lam;->m:I

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 184
    const-string v1, " mStateSaved="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 185
    iget-boolean v1, p0, Lam;->y:Z

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 186
    const-string v1, " mStopped="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 187
    iget-boolean v1, p0, Lam;->z:Z

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 188
    const-string v1, " mDestroyed="

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 189
    iget-boolean v1, p0, Lam;->A:Z

    invoke-virtual {v0, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 190
    iget-boolean v1, p0, Lam;->x:Z

    if-eqz v1, :cond_26

    .line 191
    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 192
    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    iget-boolean p1, p0, Lam;->x:Z

    invoke-virtual {v0, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_26
    return-void

    .line 194
    :goto_13
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final r(Lyl;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lam;->n:Lpl;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, Lam;->A:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, Lam;->y:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-boolean v0, p0, Lam;->z:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, Lam;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, Lam;->n:Lpl;

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "Activity has been destroyed"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_5
    iget-object p2, p0, Lam;->a:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lam;->M()V

    .line 71
    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public final s(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lam;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lam;->n:Lpl;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, Lam;->A:Z

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
    iget-object v1, p0, Lam;->n:Lpl;

    .line 34
    .line 35
    iget-object v1, v1, Lpl;->A:Landroid/os/Handler;

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
    iget-boolean p1, p0, Lam;->y:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-boolean p1, p0, Lam;->z:Z

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
    iget-object p1, p0, Lam;->C:Ljava/util/ArrayList;

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
    iput-object p1, p0, Lam;->C:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lam;->D:Ljava/util/ArrayList;

    .line 79
    .line 80
    :cond_4
    const/4 p1, 0x0

    .line 81
    iput-boolean p1, p0, Lam;->b:Z

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

.method public final t(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lam;->s(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Lam;->C:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Lam;->D:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Lam;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Lam;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_3

    .line 26
    :cond_0
    iget-object v4, p0, Lam;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v5, p1

    .line 33
    move v6, v5

    .line 34
    :goto_1
    if-ge v5, v4, :cond_1

    .line 35
    .line 36
    iget-object v7, p0, Lam;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lyl;

    .line 43
    .line 44
    invoke-interface {v7, v1, v2}, Lyl;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    or-int/2addr v6, v7

    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    iget-object v1, p0, Lam;->a:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lam;->n:Lpl;

    .line 58
    .line 59
    iget-object v1, v1, Lpl;->A:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object v2, p0, Lam;->G:Li7;

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
    if-eqz v6, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Lam;->b:Z

    .line 71
    .line 72
    :try_start_1
    iget-object v1, p0, Lam;->C:Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object v2, p0, Lam;->D:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p0, v1, v2}, Lam;->J(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lam;->d()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    invoke-virtual {p0}, Lam;->d()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-virtual {p0}, Lam;->T()V

    .line 89
    .line 90
    .line 91
    iget-boolean v1, p0, Lam;->B:Z

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iput-boolean p1, p0, Lam;->B:Z

    .line 96
    .line 97
    invoke-virtual {p0}, Lam;->S()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p1, p0, Lam;->c:Lr5;

    .line 101
    .line 102
    iget-object p1, p1, Lr5;->b:Ljava/lang/Object;

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
    iget-object v1, p0, Lam;->p:Lol;

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
    iget-object v1, p0, Lam;->p:Lol;

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
    iget-object v1, p0, Lam;->n:Lpl;

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
    iget-object v1, p0, Lam;->n:Lpl;

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

.method public final u(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    .line 1
    iget-object v4, v1, Lam;->c:Lr5;

    move/from16 v5, p3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll7;

    iget-boolean v6, v6, Ll7;->o:Z

    .line 2
    iget-object v7, v1, Lam;->E:Ljava/util/ArrayList;

    if-nez v7, :cond_0

    .line 3
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v1, Lam;->E:Ljava/util/ArrayList;

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 5
    :goto_0
    iget-object v7, v1, Lam;->E:Ljava/util/ArrayList;

    invoke-virtual {v4}, Lr5;->p()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v7, v1, Lam;->q:Lol;

    move v9, v5

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v3, :cond_13

    .line 7
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll7;

    .line 8
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_d

    .line 9
    iget-object v13, v1, Lam;->E:Ljava/util/ArrayList;

    .line 10
    iget-object v8, v12, Ll7;->a:Ljava/util/ArrayList;

    const/4 v15, 0x0

    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v15, v14, :cond_c

    .line 11
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lgm;

    .line 12
    iget v5, v14, Lgm;->a:I

    if-eq v5, v11, :cond_b

    move/from16 v16, v11

    const/4 v11, 0x2

    move/from16 v17, v6

    const/16 v6, 0x9

    if-eq v5, v11, :cond_5

    const/4 v11, 0x3

    if-eq v5, v11, :cond_4

    const/4 v11, 0x6

    if-eq v5, v11, :cond_4

    const/4 v11, 0x7

    if-eq v5, v11, :cond_3

    const/16 v11, 0x8

    if-eq v5, v11, :cond_1

    goto :goto_3

    .line 13
    :cond_1
    new-instance v5, Lgm;

    invoke-direct {v5, v6, v7}, Lgm;-><init>(ILol;)V

    invoke-virtual {v8, v15, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v15, v15, 0x1

    .line 14
    iget-object v5, v14, Lgm;->b:Lol;

    move-object v7, v5

    :cond_2
    :goto_3
    move/from16 v19, v9

    :goto_4
    move/from16 v6, v16

    goto/16 :goto_9

    :cond_3
    move/from16 v6, v16

    :goto_5
    move/from16 v19, v9

    goto/16 :goto_8

    .line 15
    :cond_4
    iget-object v5, v14, Lgm;->b:Lol;

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    iget-object v5, v14, Lgm;->b:Lol;

    if-ne v5, v7, :cond_2

    .line 17
    new-instance v7, Lgm;

    invoke-direct {v7, v6, v5}, Lgm;-><init>(ILol;)V

    invoke-virtual {v8, v15, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v15, v15, 0x1

    move/from16 v19, v9

    move/from16 v6, v16

    const/4 v7, 0x0

    goto/16 :goto_9

    .line 18
    :cond_5
    iget-object v5, v14, Lgm;->b:Lol;

    .line 19
    iget v11, v5, Lol;->w:I

    .line 20
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v18

    add-int/lit8 v18, v18, -0x1

    move/from16 v6, v18

    const/16 v18, 0x0

    :goto_6
    if-ltz v6, :cond_9

    .line 21
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v20, v6

    move-object/from16 v6, v19

    check-cast v6, Lol;

    move/from16 v19, v9

    .line 22
    iget v9, v6, Lol;->w:I

    if-ne v9, v11, :cond_8

    if-ne v6, v5, :cond_6

    move/from16 v18, v16

    goto :goto_7

    :cond_6
    if-ne v6, v7, :cond_7

    .line 23
    new-instance v7, Lgm;

    const/16 v9, 0x9

    invoke-direct {v7, v9, v6}, Lgm;-><init>(ILol;)V

    invoke-virtual {v8, v15, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v15, v15, 0x1

    const/4 v7, 0x0

    .line 24
    :cond_7
    new-instance v9, Lgm;

    move-object/from16 v21, v7

    const/4 v7, 0x3

    invoke-direct {v9, v7, v6}, Lgm;-><init>(ILol;)V

    .line 25
    iget v7, v14, Lgm;->c:I

    iput v7, v9, Lgm;->c:I

    .line 26
    iget v7, v14, Lgm;->e:I

    iput v7, v9, Lgm;->e:I

    .line 27
    iget v7, v14, Lgm;->d:I

    iput v7, v9, Lgm;->d:I

    .line 28
    iget v7, v14, Lgm;->f:I

    iput v7, v9, Lgm;->f:I

    .line 29
    invoke-virtual {v8, v15, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 30
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v7, v21

    :cond_8
    :goto_7
    add-int/lit8 v6, v20, -0x1

    move/from16 v9, v19

    goto :goto_6

    :cond_9
    move/from16 v19, v9

    if-eqz v18, :cond_a

    .line 31
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v15, v15, -0x1

    goto/16 :goto_4

    :cond_a
    move/from16 v6, v16

    .line 32
    iput v6, v14, Lgm;->a:I

    .line 33
    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    move/from16 v17, v6

    move v6, v11

    goto/16 :goto_5

    .line 34
    :goto_8
    iget-object v5, v14, Lgm;->b:Lol;

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    add-int/2addr v15, v6

    move/from16 v5, p3

    move v11, v6

    move/from16 v6, v17

    move/from16 v9, v19

    goto/16 :goto_2

    :cond_c
    move/from16 v17, v6

    move/from16 v19, v9

    goto :goto_c

    :cond_d
    move/from16 v17, v6

    move/from16 v19, v9

    move v6, v11

    .line 35
    iget-object v5, v1, Lam;->E:Ljava/util/ArrayList;

    .line 36
    iget-object v8, v12, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    sub-int/2addr v9, v6

    :goto_a
    if-ltz v9, :cond_10

    .line 37
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lgm;

    .line 38
    iget v13, v11, Lgm;->a:I

    if-eq v13, v6, :cond_f

    const/4 v6, 0x3

    if-eq v13, v6, :cond_e

    packed-switch v13, :pswitch_data_0

    goto :goto_b

    .line 39
    :pswitch_0
    iget-object v13, v11, Lgm;->g:Lnq;

    iput-object v13, v11, Lgm;->h:Lnq;

    goto :goto_b

    .line 40
    :pswitch_1
    iget-object v7, v11, Lgm;->b:Lol;

    goto :goto_b

    :pswitch_2
    const/4 v7, 0x0

    goto :goto_b

    .line 41
    :cond_e
    :pswitch_3
    iget-object v11, v11, Lgm;->b:Lol;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    const/4 v6, 0x3

    .line 42
    :pswitch_4
    iget-object v11, v11, Lgm;->b:Lol;

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_b
    add-int/lit8 v9, v9, -0x1

    const/4 v6, 0x1

    goto :goto_a

    :cond_10
    :goto_c
    if-nez v10, :cond_12

    .line 43
    iget-boolean v5, v12, Ll7;->g:Z

    if-eqz v5, :cond_11

    goto :goto_d

    :cond_11
    const/4 v10, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/4 v10, 0x1

    :goto_e
    add-int/lit8 v9, v19, 0x1

    move/from16 v5, p3

    move/from16 v6, v17

    goto/16 :goto_1

    :cond_13
    move/from16 v17, v6

    .line 44
    iget-object v5, v1, Lam;->E:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    if-nez v17, :cond_16

    .line 45
    iget v5, v1, Lam;->m:I

    const/4 v6, 0x1

    if-lt v5, v6, :cond_16

    move/from16 v5, p3

    :goto_f
    if-ge v5, v3, :cond_16

    .line 46
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll7;

    .line 47
    iget-object v6, v6, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :cond_14
    :goto_10
    if-ge v8, v7, :cond_15

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    check-cast v9, Lgm;

    .line 48
    iget-object v9, v9, Lgm;->b:Lol;

    if-eqz v9, :cond_14

    .line 49
    iget-object v10, v9, Lol;->r:Lam;

    if-eqz v10, :cond_14

    .line 50
    invoke-virtual {v1, v9}, Lam;->f(Lol;)Landroidx/fragment/app/a;

    move-result-object v9

    .line 51
    invoke-virtual {v4, v9}, Lr5;->v(Landroidx/fragment/app/a;)V

    goto :goto_10

    :cond_15
    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_16
    move/from16 v4, p3

    :goto_11
    const/4 v5, -0x1

    if-ge v4, v3, :cond_22

    .line 52
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll7;

    .line 53
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_1d

    .line 54
    invoke-virtual {v6, v5}, Ll7;->c(I)V

    .line 55
    iget-object v5, v6, Ll7;->p:Lam;

    .line 56
    iget-object v7, v6, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_12
    if-ltz v8, :cond_21

    .line 57
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lgm;

    .line 58
    iget-object v11, v10, Lgm;->b:Lol;

    if-eqz v11, :cond_1c

    .line 59
    iget-object v12, v11, Lol;->H:Lnl;

    if-nez v12, :cond_17

    goto :goto_13

    .line 60
    :cond_17
    invoke-virtual {v11}, Lol;->f()Lnl;

    move-result-object v12

    iput-boolean v9, v12, Lnl;->a:Z

    .line 61
    :goto_13
    iget v12, v6, Ll7;->f:I

    const/16 v13, 0x2002

    const/16 v14, 0x1001

    if-eq v12, v14, :cond_1a

    const/16 v15, 0x1003

    if-eq v12, v15, :cond_19

    if-eq v12, v13, :cond_18

    const/4 v13, 0x0

    goto :goto_14

    :cond_18
    move v13, v14

    goto :goto_14

    :cond_19
    move v13, v15

    .line 62
    :cond_1a
    :goto_14
    iget-object v12, v11, Lol;->H:Lnl;

    if-nez v12, :cond_1b

    if-nez v13, :cond_1b

    goto :goto_15

    .line 63
    :cond_1b
    invoke-virtual {v11}, Lol;->f()Lnl;

    .line 64
    iget-object v12, v11, Lol;->H:Lnl;

    iput v13, v12, Lnl;->f:I

    .line 65
    :goto_15
    invoke-virtual {v11}, Lol;->f()Lnl;

    .line 66
    iget-object v12, v11, Lol;->H:Lnl;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    :cond_1c
    iget v12, v10, Lgm;->a:I

    packed-switch v12, :pswitch_data_1

    .line 68
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown cmd: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, Lgm;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :pswitch_6
    iget-object v10, v10, Lgm;->g:Lnq;

    invoke-virtual {v5, v11, v10}, Lam;->O(Lol;Lnq;)V

    goto :goto_16

    .line 70
    :pswitch_7
    invoke-virtual {v5, v11}, Lam;->P(Lol;)V

    goto :goto_16

    :pswitch_8
    const/4 v10, 0x0

    .line 71
    invoke-virtual {v5, v10}, Lam;->P(Lol;)V

    goto :goto_16

    .line 72
    :pswitch_9
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 73
    invoke-virtual {v5, v11, v9}, Lam;->N(Lol;Z)V

    .line 74
    invoke-virtual {v5, v11}, Lam;->g(Lol;)V

    goto :goto_16

    .line 75
    :pswitch_a
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 76
    invoke-virtual {v5, v11}, Lam;->c(Lol;)V

    goto :goto_16

    .line 77
    :pswitch_b
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 78
    invoke-virtual {v5, v11, v9}, Lam;->N(Lol;Z)V

    .line 79
    invoke-virtual {v5, v11}, Lam;->z(Lol;)V

    goto :goto_16

    .line 80
    :pswitch_c
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, Lam;->R(Lol;)V

    goto :goto_16

    .line 82
    :pswitch_d
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 83
    invoke-virtual {v5, v11}, Lam;->a(Lol;)Landroidx/fragment/app/a;

    goto :goto_16

    .line 84
    :pswitch_e
    iget v12, v10, Lgm;->c:I

    iget v13, v10, Lgm;->d:I

    iget v14, v10, Lgm;->e:I

    iget v10, v10, Lgm;->f:I

    invoke-virtual {v11, v12, v13, v14, v10}, Lol;->B(IIII)V

    .line 85
    invoke-virtual {v5, v11, v9}, Lam;->N(Lol;Z)V

    .line 86
    invoke-virtual {v5, v11}, Lam;->I(Lol;)V

    :goto_16
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_12

    :cond_1d
    const/4 v5, 0x1

    .line 87
    invoke-virtual {v6, v5}, Ll7;->c(I)V

    .line 88
    iget-object v5, v6, Ll7;->p:Lam;

    .line 89
    iget-object v7, v6, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_17
    if-ge v10, v8, :cond_21

    .line 90
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lgm;

    .line 91
    iget-object v12, v11, Lgm;->b:Lol;

    if-eqz v12, :cond_20

    .line 92
    iget-object v13, v12, Lol;->H:Lnl;

    if-nez v13, :cond_1e

    goto :goto_18

    .line 93
    :cond_1e
    invoke-virtual {v12}, Lol;->f()Lnl;

    move-result-object v13

    iput-boolean v9, v13, Lnl;->a:Z

    .line 94
    :goto_18
    iget v13, v6, Ll7;->f:I

    .line 95
    iget-object v14, v12, Lol;->H:Lnl;

    if-nez v14, :cond_1f

    if-nez v13, :cond_1f

    goto :goto_19

    .line 96
    :cond_1f
    invoke-virtual {v12}, Lol;->f()Lnl;

    .line 97
    iget-object v14, v12, Lol;->H:Lnl;

    iput v13, v14, Lnl;->f:I

    .line 98
    :goto_19
    invoke-virtual {v12}, Lol;->f()Lnl;

    .line 99
    iget-object v13, v12, Lol;->H:Lnl;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    :cond_20
    iget v13, v11, Lgm;->a:I

    packed-switch v13, :pswitch_data_2

    .line 101
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown cmd: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v11, Lgm;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :pswitch_10
    iget-object v11, v11, Lgm;->h:Lnq;

    invoke-virtual {v5, v12, v11}, Lam;->O(Lol;Lnq;)V

    goto :goto_1a

    :pswitch_11
    const/4 v11, 0x0

    .line 103
    invoke-virtual {v5, v11}, Lam;->P(Lol;)V

    goto :goto_1a

    .line 104
    :pswitch_12
    invoke-virtual {v5, v12}, Lam;->P(Lol;)V

    goto :goto_1a

    .line 105
    :pswitch_13
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 106
    invoke-virtual {v5, v12, v9}, Lam;->N(Lol;Z)V

    .line 107
    invoke-virtual {v5, v12}, Lam;->c(Lol;)V

    goto :goto_1a

    .line 108
    :pswitch_14
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 109
    invoke-virtual {v5, v12}, Lam;->g(Lol;)V

    goto :goto_1a

    .line 110
    :pswitch_15
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 111
    invoke-virtual {v5, v12, v9}, Lam;->N(Lol;Z)V

    .line 112
    invoke-static {v12}, Lam;->R(Lol;)V

    goto :goto_1a

    .line 113
    :pswitch_16
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 114
    invoke-virtual {v5, v12}, Lam;->z(Lol;)V

    goto :goto_1a

    .line 115
    :pswitch_17
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 116
    invoke-virtual {v5, v12}, Lam;->I(Lol;)V

    goto :goto_1a

    .line 117
    :pswitch_18
    iget v13, v11, Lgm;->c:I

    iget v14, v11, Lgm;->d:I

    iget v15, v11, Lgm;->e:I

    iget v11, v11, Lgm;->f:I

    invoke-virtual {v12, v13, v14, v15, v11}, Lol;->B(IIII)V

    .line 118
    invoke-virtual {v5, v12, v9}, Lam;->N(Lol;Z)V

    .line 119
    invoke-virtual {v5, v12}, Lam;->a(Lol;)Landroidx/fragment/app/a;

    :goto_1a
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_17

    :cond_21
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_11

    :cond_22
    add-int/lit8 v4, v3, -0x1

    .line 120
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v6, p3

    :goto_1b
    if-ge v6, v3, :cond_27

    .line 121
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll7;

    if-eqz v4, :cond_24

    .line 122
    iget-object v8, v7, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/16 v16, 0x1

    add-int/lit8 v8, v8, -0x1

    :goto_1c
    if-ltz v8, :cond_26

    .line 123
    iget-object v9, v7, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lgm;

    .line 124
    iget-object v9, v9, Lgm;->b:Lol;

    if-eqz v9, :cond_23

    .line 125
    invoke-virtual {v1, v9}, Lam;->f(Lol;)Landroidx/fragment/app/a;

    move-result-object v9

    .line 126
    invoke-virtual {v9}, Landroidx/fragment/app/a;->k()V

    :cond_23
    add-int/lit8 v8, v8, -0x1

    goto :goto_1c

    .line 127
    :cond_24
    iget-object v7, v7, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    :cond_25
    :goto_1d
    if-ge v9, v8, :cond_26

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    check-cast v10, Lgm;

    .line 128
    iget-object v10, v10, Lgm;->b:Lol;

    if-eqz v10, :cond_25

    .line 129
    invoke-virtual {v1, v10}, Lam;->f(Lol;)Landroidx/fragment/app/a;

    move-result-object v10

    .line 130
    invoke-virtual {v10}, Landroidx/fragment/app/a;->k()V

    goto :goto_1d

    :cond_26
    add-int/lit8 v6, v6, 0x1

    goto :goto_1b

    .line 131
    :cond_27
    iget v6, v1, Lam;->m:I

    const/4 v7, 0x1

    invoke-virtual {v1, v6, v7}, Lam;->E(IZ)V

    .line 132
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_1e
    if-ge v7, v3, :cond_2a

    .line 133
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll7;

    .line 134
    iget-object v8, v8, Ll7;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :cond_28
    :goto_1f
    if-ge v10, v9, :cond_29

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v10, v10, 0x1

    check-cast v11, Lgm;

    .line 135
    iget-object v11, v11, Lgm;->b:Lol;

    if-eqz v11, :cond_28

    .line 136
    iget-object v11, v11, Lol;->D:Landroid/view/ViewGroup;

    if-eqz v11, :cond_28

    .line 137
    invoke-virtual {v1}, Lam;->y()Lxh;

    move-result-object v12

    .line 138
    invoke-static {v11, v12}, Ldg;->f(Landroid/view/ViewGroup;Lxh;)Ldg;

    move-result-object v11

    .line 139
    invoke-virtual {v6, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_29
    add-int/lit8 v7, v7, 0x1

    goto :goto_1e

    .line 140
    :cond_2a
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_20
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldg;

    .line 141
    iput-boolean v4, v7, Ldg;->d:Z

    .line 142
    iget-object v8, v7, Ldg;->b:Ljava/util/ArrayList;

    .line 143
    monitor-enter v8

    .line 144
    :try_start_0
    invoke-virtual {v7}, Ldg;->g()V

    const/4 v9, 0x0

    .line 145
    iput-boolean v9, v7, Ldg;->e:Z

    .line 146
    iget-object v10, v7, Ldg;->b:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    :goto_21
    if-ltz v10, :cond_2c

    .line 147
    iget-object v11, v7, Ldg;->b:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln40;

    .line 148
    iget-object v12, v11, Ln40;->c:Lol;

    .line 149
    iget-object v12, v12, Lol;->E:Landroid/view/View;

    invoke-static {v12}, Lg40;->c(Landroid/view/View;)I

    move-result v12

    .line 150
    iget v13, v11, Ln40;->a:I

    const/4 v14, 0x2

    if-ne v13, v14, :cond_2b

    if-eq v12, v14, :cond_2b

    .line 151
    iget-object v10, v11, Ln40;->c:Lol;

    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-boolean v9, v7, Ldg;->e:Z

    goto :goto_22

    :catchall_0
    move-exception v0

    goto :goto_23

    :cond_2b
    add-int/lit8 v10, v10, -0x1

    goto :goto_21

    .line 153
    :cond_2c
    :goto_22
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    invoke-virtual {v7}, Ldg;->c()V

    goto :goto_20

    .line 155
    :goto_23
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_2d
    move/from16 v4, p3

    :goto_24
    if-ge v4, v3, :cond_2f

    .line 156
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll7;

    .line 157
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_2e

    .line 158
    iget v7, v6, Ll7;->r:I

    if-ltz v7, :cond_2e

    .line 159
    iput v5, v6, Ll7;->r:I

    .line 160
    :cond_2e
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_24

    :cond_2f
    return-void

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

.method public final v(I)Lol;
    .locals 5

    .line 1
    iget-object v0, p0, Lam;->c:Lr5;

    .line 2
    .line 3
    iget-object v1, v0, Lr5;->c:Ljava/lang/Object;

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
    check-cast v3, Lol;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, Lol;->v:I

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
    iget-object v0, v0, Lr5;->b:Ljava/lang/Object;

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
    check-cast v1, Landroidx/fragment/app/a;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, Landroidx/fragment/app/a;->c:Lol;

    .line 58
    .line 59
    iget v2, v1, Lol;->v:I

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

.method public final w(Lol;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Lol;->D:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Lol;->w:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lam;->o:Lgf;

    .line 12
    .line 13
    invoke-virtual {v0}, Lgf;->L()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lam;->o:Lgf;

    .line 20
    .line 21
    iget p1, p1, Lol;->w:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lgf;->K(I)Landroid/view/View;

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

.method public final x()Lvl;
    .locals 1

    .line 1
    iget-object v0, p0, Lam;->p:Lol;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lol;->r:Lam;

    .line 6
    .line 7
    invoke-virtual {v0}, Lam;->x()Lvl;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lam;->r:Lvl;

    .line 13
    .line 14
    return-object v0
.end method

.method public final y()Lxh;
    .locals 1

    .line 1
    iget-object v0, p0, Lam;->p:Lol;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lol;->r:Lam;

    .line 6
    .line 7
    invoke-virtual {v0}, Lam;->y()Lxh;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lam;->s:Lxh;

    .line 13
    .line 14
    return-object v0
.end method

.method public final z(Lol;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lam;->A(I)Z

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
    iget-boolean v0, p1, Lol;->y:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Lol;->y:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Lol;->I:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Lol;->I:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lam;->Q(Lol;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
