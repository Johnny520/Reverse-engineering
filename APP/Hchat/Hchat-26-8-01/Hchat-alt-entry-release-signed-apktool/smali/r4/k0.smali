.class public final Lr4/k0;
.super Lr4/o0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Lr4/m;


# instance fields
.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/HashMap;

.field public final h:I

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lr4/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lr4/m;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lr4/k0;->j:Lr4/m;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lr4/p;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lr4/o0;-><init>(Ljava/lang/String;Lr4/p;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 p2, 0x64

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance p1, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lr4/k0;->g:Ljava/util/HashMap;

    .line 19
    .line 20
    iput p4, p0, Lr4/k0;->h:I

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, Lr4/k0;->i:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lr4/a0;)I
    .locals 0

    .line 1
    check-cast p1, Lr4/l0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lr4/l0;->f()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final c()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :cond_0
    iget-object v1, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-lt v0, v2, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    :goto_0
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lr4/l0;

    .line 18
    .line 19
    iget-object v4, p0, Lr4/o0;->b:Lr4/p;

    .line 20
    .line 21
    invoke-virtual {v3, v4}, Lr4/a0;->a(Lr4/p;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    goto :goto_0
.end method

.method public final h()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lr4/k0;->i:I

    .line 5
    .line 6
    return v0
.end method

.method public final j(Lz4/d;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    move v5, v2

    .line 14
    move v4, v3

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-eqz v6, :cond_3

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lr4/l0;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    move v5, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string v7, "\n"

    .line 34
    .line 35
    invoke-virtual {p1, v3, v7}, Lz4/d;->b(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_1
    iget v7, v6, Lr4/l0;->g:I

    .line 39
    .line 40
    sub-int/2addr v7, v2

    .line 41
    add-int v8, v4, v7

    .line 42
    .line 43
    not-int v7, v7

    .line 44
    and-int/2addr v7, v8

    .line 45
    if-eq v4, v7, :cond_2

    .line 46
    .line 47
    sub-int v4, v7, v4

    .line 48
    .line 49
    invoke-virtual {p1, v4}, Lz4/d;->o(I)V

    .line 50
    .line 51
    .line 52
    move v4, v7

    .line 53
    :cond_2
    iget-object v7, p0, Lr4/o0;->b:Lr4/p;

    .line 54
    .line 55
    invoke-virtual {v6, v7, p1}, Lr4/l0;->d(Lr4/p;Lz4/d;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Lr4/l0;->c()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    add-int/2addr v4, v6

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget p1, p0, Lr4/k0;->i:I

    .line 65
    .line 66
    if-ne v4, p1, :cond_4

    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    const-string p1, "output size mismatch"

    .line 70
    .line 71
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final k(Lr4/l0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget v0, p1, Lr4/l0;->g:I

    .line 5
    .line 6
    iget v1, p0, Lr4/o0;->c:I
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string v0, "incompatible item alignment"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 24
    :catch_0
    const-string p1, "item == null"

    .line 25
    .line 26
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final declared-synchronized l(Lr4/l0;)Lr4/l0;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lr4/o0;->g()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lr4/k0;->g:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lr4/l0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lr4/k0;->k(Lr4/l0;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lr4/k0;->g:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 29
    throw p1
.end method

.method public final m()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr4/o0;->f()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lr4/k0;->h:I

    .line 5
    .line 6
    invoke-static {v0}, Lt3/c;->b(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object v2, p0, Lr4/k0;->f:Ljava/util/ArrayList;

    .line 12
    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, Lr4/k0;->j:Lr4/m;

    .line 24
    .line 25
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    move v3, v1

    .line 34
    :goto_1
    if-ge v1, v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lr4/l0;

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v4, p0, v3}, Lr4/l0;->i(Lr4/k0;I)I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-lt v5, v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4}, Lr4/l0;->c()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    add-int/2addr v3, v5

    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v2, "bogus place() result for "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v2, "...while placing "

    .line 84
    .line 85
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1, v0}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    throw v0

    .line 100
    :cond_3
    iput v3, p0, Lr4/k0;->i:I

    .line 101
    .line 102
    return-void
.end method
