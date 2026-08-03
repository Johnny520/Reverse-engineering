.class public final Lp4/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/l1;
.implements Ltg/d;
.implements Lv0/j;
.implements Lj8/l;
.implements Lwb/kv;
.implements Ly1/v0;


# instance fields
.field public final synthetic g:I

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lp4/t;->g:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lqd/j;->u:Lqd/h;

    .line 10
    .line 11
    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    new-instance p1, Lj0/b;

    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    new-array v0, v0, [Ljava/lang/ref/Reference;

    .line 29
    .line 30
    invoke-direct {p1, v0}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 41
    .line 42
    return-void

    .line 43
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lj0/b;

    .line 47
    .line 48
    const/16 v0, 0x10

    .line 49
    .line 50
    new-array v0, v0, [Lx1/f0;

    .line 51
    .line 52
    invoke-direct {p1, v0}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0x12 -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lp4/t;->g:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 64
    const-string v0, "Hchat_transfer_config"

    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 65
    iput p2, p0, Lp4/t;->g:I

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    iput-object p3, p0, Lp4/t;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ln4/a;IIII)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lp4/t;->g:I

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Lp4/u;

    invoke-direct {v0, p1, p2, p4, p5}, Lp4/u;-><init>(Ln4/a;III)V

    iput-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 77
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpa/c;)V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, Lp4/t;->g:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 67
    new-instance v0, Lm/a;

    const/16 v1, 0x14

    invoke-direct {v0, p1, v1}, Lm/a;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr4/p;Lz4/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lp4/t;->g:I

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 79
    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 80
    iput-object p2, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void

    .line 81
    :cond_0
    const-string p1, "file == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Ls/b0;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lp4/t;->g:I

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 83
    sget-object p1, Lf/o0;->a:Lf/b0;

    .line 84
    new-instance p1, Lf/b0;

    invoke-direct {p1}, Lf/b0;-><init>()V

    .line 85
    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lud/r;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lp4/t;->g:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 72
    iget-object p1, p1, Lud/r;->l:Lud/e;

    .line 73
    iget-object p1, p1, Lud/e;->k:Lud/u;

    .line 74
    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx1/f0;Lv1/n0;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lp4/t;->g:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 69
    invoke-static {p2}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    move-result-object p1

    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([F)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lp4/t;->g:I

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/t;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 87
    new-array p1, p1, [I

    iput-object p1, p0, Lp4/t;->i:Ljava/lang/Object;

    return-void
.end method

.method public static E(Lgf/a;Lqd/j;)Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lud/p;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->k:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1, p1}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lud/p;->d0(Lqd/r;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lgf/a;->i:[I

    .line 18
    .line 19
    aget p0, p0, v2

    .line 20
    .line 21
    new-instance v1, Lqd/r;

    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lud/p;->I(Lqd/l;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static i(Lr4/p;Lt4/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/p;->g:Lr4/h0;

    .line 2
    .line 3
    iget-object v1, p0, Lr4/p;->f:Lr4/h0;

    .line 4
    .line 5
    iget-object v2, p1, Lt4/a;->h:Lv4/d0;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Lr4/h0;->p(Lv4/d0;)Lr4/s0;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lt4/a;->j:Ljava/util/TreeMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lt4/d;

    .line 35
    .line 36
    iget-object v2, v0, Lt4/d;->g:Lv4/c0;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Lr4/h0;->r(Lv4/c0;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lt4/d;->h:Lv4/a;

    .line 42
    .line 43
    invoke-static {p0, v0}, Lp4/t;->j(Lr4/p;Lv4/a;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return-void
.end method

.method public static j(Lr4/p;Lv4/a;)V
    .locals 3

    .line 1
    instance-of v0, p1, Lv4/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lv4/b;

    .line 6
    .line 7
    iget-object p1, p1, Lv4/b;->g:Lt4/a;

    .line 8
    .line 9
    invoke-static {p0, p1}, Lp4/t;->i(Lr4/p;Lt4/a;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of v0, p1, Lv4/d;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    check-cast p1, Lv4/d;

    .line 18
    .line 19
    iget-object p1, p1, Lv4/d;->g:Lv4/c;

    .line 20
    .line 21
    iget-object v0, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 22
    .line 23
    array-length v0, v0

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-ge v1, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lv4/a;

    .line 32
    .line 33
    invoke-static {p0, v2}, Lp4/t;->j(Lr4/p;Lv4/a;)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0, p1}, Lr4/p;->b(Lv4/a;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public static k(Lgf/a;ILqd/j;)Lpd/a;
    .locals 5

    .line 1
    sget v0, Lpd/a;->p:I

    .line 2
    .line 3
    sget-object v0, Lqd/j;->b:Lqd/g;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lp/a;->b(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Lqd/j;->G:Lqd/h;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, p2

    .line 17
    :goto_0
    const/4 v2, 0x0

    .line 18
    invoke-static {p0, v2, v1}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Lp/a;->b(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object p2, Lqd/j;->D:Lqd/h;

    .line 31
    .line 32
    :cond_1
    iget v0, p0, Lgf/a;->j:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x2

    .line 36
    if-eq v0, v4, :cond_3

    .line 37
    .line 38
    const/4 v2, 0x3

    .line 39
    if-ne v0, v2, :cond_2

    .line 40
    .line 41
    new-instance v0, Lpd/a;

    .line 42
    .line 43
    iget-object v2, p0, Lgf/a;->i:[I

    .line 44
    .line 45
    aget v2, v2, v3

    .line 46
    .line 47
    new-instance v3, Lqd/r;

    .line 48
    .line 49
    invoke-direct {v3, v2, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lgf/a;->i:[I

    .line 53
    .line 54
    aget p0, p0, v4

    .line 55
    .line 56
    new-instance v2, Lqd/r;

    .line 57
    .line 58
    invoke-direct {v2, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, p1, v1, v3, v2}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "Unexpected registers count in "

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return-object p0

    .line 80
    :cond_3
    new-instance v0, Lpd/a;

    .line 81
    .line 82
    iget-object v4, p0, Lgf/a;->i:[I

    .line 83
    .line 84
    aget v2, v4, v2

    .line 85
    .line 86
    new-instance v4, Lqd/r;

    .line 87
    .line 88
    invoke-direct {v4, v2, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lgf/a;->i:[I

    .line 92
    .line 93
    aget p0, p0, v3

    .line 94
    .line 95
    new-instance v2, Lqd/r;

    .line 96
    .line 97
    invoke-direct {v2, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, p1, v1, v4, v2}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 101
    .line 102
    .line 103
    return-object v0
.end method

.method public static l(Lgf/a;ILqd/j;)Lpd/a;
    .locals 5

    .line 1
    sget v0, Lpd/a;->p:I

    .line 2
    .line 3
    sget-object v0, Lqd/j;->b:Lqd/g;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lp/a;->b(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Lqd/j;->G:Lqd/h;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, p2

    .line 17
    :goto_0
    const/4 v2, 0x0

    .line 18
    invoke-static {p0, v2, v1}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne p2, v0, :cond_1

    .line 23
    .line 24
    invoke-static {p1}, Lp/a;->b(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    sget-object p2, Lqd/j;->D:Lqd/h;

    .line 31
    .line 32
    :cond_1
    iget-wide v3, p0, Lgf/a;->k:J

    .line 33
    .line 34
    invoke-static {v3, v4, p2}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget v3, p0, Lgf/a;->j:I

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    if-eq v3, v4, :cond_3

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    if-ne v3, v2, :cond_2

    .line 45
    .line 46
    new-instance v2, Lpd/a;

    .line 47
    .line 48
    iget-object p0, p0, Lgf/a;->i:[I

    .line 49
    .line 50
    aget p0, p0, v4

    .line 51
    .line 52
    new-instance v3, Lqd/r;

    .line 53
    .line 54
    invoke-direct {v3, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v2, p1, v1, v3, v0}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "Unexpected registers count in "

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0

    .line 76
    :cond_3
    new-instance v3, Lpd/a;

    .line 77
    .line 78
    iget-object p0, p0, Lgf/a;->i:[I

    .line 79
    .line 80
    aget p0, p0, v2

    .line 81
    .line 82
    new-instance v2, Lqd/r;

    .line 83
    .line 84
    invoke-direct {v2, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v3, p1, v1, v2, v0}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 88
    .line 89
    .line 90
    return-object v3
.end method

.method public static m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lud/p;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->G:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v0, v1, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1, p2}, Lqd/l;->Y(Lgf/a;ILqd/j;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {v0, p2}, Lud/p;->d0(Lqd/r;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lqd/a;

    .line 18
    .line 19
    invoke-direct {p2, p1}, Lqd/a;-><init>(Lqd/j;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-static {p0, p1, p2}, Lqd/l;->Y(Lgf/a;ILqd/j;)Lqd/r;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v0, p1}, Lud/p;->I(Lqd/l;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lqd/j;->A:Lqd/h;

    .line 31
    .line 32
    iget-object p0, p0, Lgf/a;->i:[I

    .line 33
    .line 34
    aget p0, p0, v2

    .line 35
    .line 36
    new-instance p2, Lqd/r;

    .line 37
    .line 38
    invoke-direct {p2, p0, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p2}, Lud/p;->I(Lqd/l;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public static n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lud/p;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->H:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    invoke-direct {v0, v1, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lqd/j;->b:Lqd/g;

    .line 10
    .line 11
    new-instance v1, Lqd/a;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lqd/a;-><init>(Lqd/j;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-static {p0, p1, v1}, Lqd/l;->Y(Lgf/a;ILqd/j;)Lqd/r;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Lud/p;->I(Lqd/l;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lqd/j;->A:Lqd/h;

    .line 25
    .line 26
    iget-object v1, p0, Lgf/a;->i:[I

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    aget v1, v1, v2

    .line 30
    .line 31
    new-instance v2, Lqd/r;

    .line 32
    .line 33
    invoke-direct {v2, v1, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lud/p;->I(Lqd/l;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-static {p0, p1, p2}, Lqd/l;->Y(Lgf/a;ILqd/j;)Lqd/r;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Lud/p;->I(Lqd/l;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public static o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;
    .locals 3

    .line 1
    new-instance v0, Lpd/j;

    .line 2
    .line 3
    sget-object v1, Lpd/k;->o:Lpd/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, p2, v2}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p0, v1, p2}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {v0, p2}, Lud/p;->d0(Lqd/r;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lgf/a;->i:[I

    .line 18
    .line 19
    aget p0, p0, v2

    .line 20
    .line 21
    new-instance p2, Lqd/r;

    .line 22
    .line 23
    invoke-direct {p2, p0, p1}, Lqd/r;-><init>(ILqd/j;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Lud/p;->I(Lqd/l;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;
    .locals 3

    .line 1
    new-instance v0, Lud/p;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p1, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 9
    .line 10
    invoke-static {p0, p1, v2}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lud/p;->d0(Lqd/r;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iget-object v2, p0, Lgf/a;->i:[I

    .line 19
    .line 20
    aget p1, v2, p1

    .line 21
    .line 22
    new-instance v2, Lqd/r;

    .line 23
    .line 24
    invoke-direct {v2, p1, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lud/p;->I(Lqd/l;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lgf/a;->i:[I

    .line 31
    .line 32
    aget p0, p0, v1

    .line 33
    .line 34
    new-instance p1, Lqd/r;

    .line 35
    .line 36
    invoke-direct {p1, p0, p2}, Lqd/r;-><init>(ILqd/j;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lud/p;->I(Lqd/l;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static q(Lv4/a;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lp4/t;->r(Lv4/a;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x1e

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const-string p0, "null"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lv4/a;->j()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x20

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Lz4/k;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static r(Lv4/a;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lv4/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    instance-of v0, p0, Lv4/b0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x2

    .line 12
    return p0

    .line 13
    :cond_1
    instance-of v0, p0, Lv4/j;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    return p0

    .line 19
    :cond_2
    instance-of v0, p0, Lv4/o;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    return p0

    .line 25
    :cond_3
    instance-of v0, p0, Lv4/v;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    const/4 p0, 0x6

    .line 30
    return p0

    .line 31
    :cond_4
    instance-of v0, p0, Lv4/n;

    .line 32
    .line 33
    if-eqz v0, :cond_5

    .line 34
    .line 35
    const/16 p0, 0x10

    .line 36
    .line 37
    return p0

    .line 38
    :cond_5
    instance-of v0, p0, Lv4/k;

    .line 39
    .line 40
    if-eqz v0, :cond_6

    .line 41
    .line 42
    const/16 p0, 0x11

    .line 43
    .line 44
    return p0

    .line 45
    :cond_6
    instance-of v0, p0, Lv4/a0;

    .line 46
    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    const/16 p0, 0x15

    .line 50
    .line 51
    return p0

    .line 52
    :cond_7
    instance-of v0, p0, Lv4/x;

    .line 53
    .line 54
    if-eqz v0, :cond_8

    .line 55
    .line 56
    const/16 p0, 0x16

    .line 57
    .line 58
    return p0

    .line 59
    :cond_8
    instance-of v0, p0, Lv4/c0;

    .line 60
    .line 61
    if-eqz v0, :cond_9

    .line 62
    .line 63
    const/16 p0, 0x17

    .line 64
    .line 65
    return p0

    .line 66
    :cond_9
    instance-of v0, p0, Lv4/d0;

    .line 67
    .line 68
    if-eqz v0, :cond_a

    .line 69
    .line 70
    const/16 p0, 0x18

    .line 71
    .line 72
    return p0

    .line 73
    :cond_a
    instance-of v0, p0, Lv4/m;

    .line 74
    .line 75
    if-eqz v0, :cond_b

    .line 76
    .line 77
    const/16 p0, 0x19

    .line 78
    .line 79
    return p0

    .line 80
    :cond_b
    instance-of v0, p0, Lv4/y;

    .line 81
    .line 82
    if-eqz v0, :cond_c

    .line 83
    .line 84
    const/16 p0, 0x1a

    .line 85
    .line 86
    return p0

    .line 87
    :cond_c
    instance-of v0, p0, Lv4/l;

    .line 88
    .line 89
    if-eqz v0, :cond_d

    .line 90
    .line 91
    const/16 p0, 0x1b

    .line 92
    .line 93
    return p0

    .line 94
    :cond_d
    instance-of v0, p0, Lv4/d;

    .line 95
    .line 96
    if-eqz v0, :cond_e

    .line 97
    .line 98
    const/16 p0, 0x1c

    .line 99
    .line 100
    return p0

    .line 101
    :cond_e
    instance-of v0, p0, Lv4/b;

    .line 102
    .line 103
    if-eqz v0, :cond_f

    .line 104
    .line 105
    const/16 p0, 0x1d

    .line 106
    .line 107
    return p0

    .line 108
    :cond_f
    instance-of v0, p0, Lv4/r;

    .line 109
    .line 110
    if-eqz v0, :cond_10

    .line 111
    .line 112
    const/16 p0, 0x1e

    .line 113
    .line 114
    return p0

    .line 115
    :cond_10
    instance-of p0, p0, Lv4/f;

    .line 116
    .line 117
    if-eqz p0, :cond_11

    .line 118
    .line 119
    const/16 p0, 0x1f

    .line 120
    .line 121
    return p0

    .line 122
    :cond_11
    const-string p0, "Shouldn\'t happen"

    .line 123
    .line 124
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    return p0
.end method

.method public static u(Lx1/f0;)V
    .locals 10

    .line 1
    iget v0, p0, Lx1/f0;->V:I

    .line 2
    .line 3
    if-lez v0, :cond_b

    .line 4
    .line 5
    iget-object v0, p0, Lx1/f0;->M:Lx1/j0;

    .line 6
    .line 7
    iget-object v0, v0, Lx1/j0;->d:Lx1/b0;

    .line 8
    .line 9
    sget-object v1, Lx1/b0;->k:Lx1/b0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_a

    .line 13
    .line 14
    invoke-virtual {p0}, Lx1/f0;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, Lx1/f0;->q()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_a

    .line 25
    .line 26
    iget-boolean v0, p0, Lx1/f0;->W:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_5

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lx1/f0;->H()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    iget-object v0, p0, Lx1/f0;->L:Lx1/b1;

    .line 41
    .line 42
    iget-object v0, v0, Lx1/b1;->f:Ly0/n;

    .line 43
    .line 44
    iget v1, v0, Ly0/n;->j:I

    .line 45
    .line 46
    const/16 v3, 0x100

    .line 47
    .line 48
    and-int/2addr v1, v3

    .line 49
    if-eqz v1, :cond_a

    .line 50
    .line 51
    :goto_0
    if-eqz v0, :cond_a

    .line 52
    .line 53
    iget v1, v0, Ly0/n;->i:I

    .line 54
    .line 55
    and-int/2addr v1, v3

    .line 56
    if-eqz v1, :cond_9

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    move-object v4, v0

    .line 60
    move-object v5, v1

    .line 61
    :goto_1
    if-eqz v4, :cond_9

    .line 62
    .line 63
    instance-of v6, v4, Lx1/n;

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    check-cast v4, Lx1/n;

    .line 68
    .line 69
    invoke-static {v4, v3}, Lx1/k;->t(Lx1/i;I)Lx1/i1;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-interface {v4, v6}, Lx1/n;->w(Lx1/i1;)V

    .line 74
    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_2
    iget v6, v4, Ly0/n;->i:I

    .line 78
    .line 79
    and-int/2addr v6, v3

    .line 80
    if-eqz v6, :cond_8

    .line 81
    .line 82
    instance-of v6, v4, Lx1/j;

    .line 83
    .line 84
    if-eqz v6, :cond_8

    .line 85
    .line 86
    move-object v6, v4

    .line 87
    check-cast v6, Lx1/j;

    .line 88
    .line 89
    iget-object v6, v6, Lx1/j;->v:Ly0/n;

    .line 90
    .line 91
    move v7, v2

    .line 92
    :goto_2
    const/4 v8, 0x1

    .line 93
    if-eqz v6, :cond_7

    .line 94
    .line 95
    iget v9, v6, Ly0/n;->i:I

    .line 96
    .line 97
    and-int/2addr v9, v3

    .line 98
    if-eqz v9, :cond_6

    .line 99
    .line 100
    add-int/lit8 v7, v7, 0x1

    .line 101
    .line 102
    if-ne v7, v8, :cond_3

    .line 103
    .line 104
    move-object v4, v6

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    if-nez v5, :cond_4

    .line 107
    .line 108
    new-instance v5, Lj0/b;

    .line 109
    .line 110
    const/16 v8, 0x10

    .line 111
    .line 112
    new-array v8, v8, [Ly0/n;

    .line 113
    .line 114
    invoke-direct {v5, v8}, Lj0/b;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v4, :cond_5

    .line 118
    .line 119
    invoke-virtual {v5, v4}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v4, v1

    .line 123
    :cond_5
    invoke-virtual {v5, v6}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v6, v6, Ly0/n;->l:Ly0/n;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    if-ne v7, v8, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    :goto_4
    invoke-static {v5}, Lx1/k;->e(Lj0/b;)Ly0/n;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget v1, v0, Ly0/n;->j:I

    .line 138
    .line 139
    and-int/2addr v1, v3

    .line 140
    if-eqz v1, :cond_a

    .line 141
    .line 142
    iget-object v0, v0, Ly0/n;->l:Ly0/n;

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_a
    :goto_5
    iput-boolean v2, p0, Lx1/f0;->U:Z

    .line 146
    .line 147
    invoke-virtual {p0}, Lx1/f0;->y()Lj0/b;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    iget-object v0, p0, Lj0/b;->g:[Ljava/lang/Object;

    .line 152
    .line 153
    iget p0, p0, Lj0/b;->i:I

    .line 154
    .line 155
    :goto_6
    if-ge v2, p0, :cond_b

    .line 156
    .line 157
    aget-object v1, v0, v2

    .line 158
    .line 159
    check-cast v1, Lx1/f0;

    .line 160
    .line 161
    invoke-static {v1}, Lp4/t;->u(Lx1/f0;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_b
    return-void
.end method

.method public static v(Lgf/a;Z)Lpd/g;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lgf/a;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lqd/j;->g()Lqd/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    instance-of v1, v0, Lqd/g;

    .line 17
    .line 18
    iget v2, p0, Lgf/a;->j:I

    .line 19
    .line 20
    new-array v3, v2, [Lqd/l;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lgf/a;->i:[I

    .line 26
    .line 27
    aget p0, p0, v4

    .line 28
    .line 29
    move p1, v4

    .line 30
    :goto_0
    if-ge p1, v2, :cond_1

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Lqd/l;->T(ILqd/j;Z)Lqd/r;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    aput-object v5, v3, p1

    .line 37
    .line 38
    add-int/lit8 p0, p0, 0x1

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move p1, v4

    .line 44
    :goto_1
    if-ge p1, v2, :cond_1

    .line 45
    .line 46
    iget-object v5, p0, Lgf/a;->i:[I

    .line 47
    .line 48
    aget v5, v5, p1

    .line 49
    .line 50
    invoke-static {v5, v0, v1}, Lqd/l;->T(ILqd/j;Z)Lqd/r;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    aput-object v5, v3, p1

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p0, Lpd/g;

    .line 60
    .line 61
    invoke-direct {p0, v2, v0}, Lpd/g;-><init>(ILqd/j;)V

    .line 62
    .line 63
    .line 64
    :goto_2
    if-ge v4, v2, :cond_2

    .line 65
    .line 66
    aget-object p1, v3, v4

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lud/p;->I(Lqd/l;)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v4, v4, 0x1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    return-object p0
.end method

.method public static z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;
    .locals 2

    .line 1
    new-instance v0, Lud/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lud/p;->d0(Lqd/r;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lud/p;->I(Lqd/l;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public A(Lgf/a;IZ)Lpd/n;
    .locals 2

    .line 1
    invoke-static {p1}, Lig/a;->x(Lgf/a;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lud/u;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lpd/n;

    .line 16
    .line 17
    invoke-direct {v1, v0, p1, p2, p3}, Lpd/n;-><init>(Lod/d;Lgf/a;IZ)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string p2, "Failed to load method reference for insn: "

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public B(Lgf/a;Z)Lud/p;
    .locals 6

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/r;

    .line 4
    .line 5
    const-string v1, "Failed to get call site for insn: "

    .line 6
    .line 7
    :try_start_0
    invoke-static {p1}, Lig/a;->v(Lgf/a;)Lqc/a;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    iget-object v1, v2, Lqc/a;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    :pswitch_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lnc/a;

    .line 30
    .line 31
    iget v4, v3, Lnc/a;->g:I

    .line 32
    .line 33
    iget-object v3, v3, Lnc/a;->h:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {v4}, Lt3/c;->b(I)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/16 v5, 0xd

    .line 40
    .line 41
    if-eq v4, v5, :cond_1

    .line 42
    .line 43
    const/16 v5, 0xf

    .line 44
    .line 45
    if-eq v4, v5, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    check-cast v3, Lqc/d;

    .line 49
    .line 50
    iget v4, v3, Lqc/d;->a:I

    .line 51
    .line 52
    packed-switch v4, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    iget-object v3, v3, Lqc/d;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljf/h;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljf/h;->a()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    check-cast v3, Ljf/h;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljf/h;->a()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-static {v1}, Lg4/a;->A(Ljava/util/ArrayList;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-static {v0, p1, p2, v1}, Lg4/a;->g(Lud/r;Lgf/a;ZLjava/util/ArrayList;)Lpd/l;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :catch_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-static {v1}, Loh/h;->I(Ljava/util/ArrayList;)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-static {p1, v1}, Loh/h;->l(Lgf/a;Ljava/util/ArrayList;)Lud/p;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    return-object p1

    .line 93
    :cond_4
    :try_start_1
    invoke-static {v0, p1, p2, v1}, Lig/a;->f(Lud/r;Lgf/a;ZLjava/util/ArrayList;)Lpd/m;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 97
    return-object p1

    .line 98
    :catch_1
    move-exception p1

    .line 99
    :try_start_2
    const-string p2, "\n"

    .line 100
    .line 101
    invoke-static {v1, p2}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-static {p1}, Lxe/s;->g(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    new-instance v3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v4, "Failed to decode invoke-custom: \n"

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string p2, ",\n exception: "

    .line 123
    .line 124
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {v0, p2}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance p2, Lud/p;

    .line 138
    .line 139
    sget-object v0, Lpd/k;->Q:Lpd/k;

    .line 140
    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-direct {p2, v0, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 146
    .line 147
    invoke-virtual {p2, v0}, Lmd/e;->w(Lmd/a;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 151
    .line 152
    new-instance v2, Lnd/p;

    .line 153
    .line 154
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v3, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    const-string v4, "Failed to decode invoke-custom: "

    .line 164
    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-direct {v2, v1, p1}, Lnd/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v0, v2}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    return-object p2

    .line 182
    :cond_5
    new-instance p2, Laf/g;

    .line 183
    .line 184
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 196
    :goto_1
    new-instance p2, Laf/g;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    const-string v1, "\'invoke-custom\' instruction processing error: "

    .line 203
    .line 204
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw p2

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public C(Lgf/a;Z)Lpd/o;
    .locals 8

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/u;

    .line 4
    .line 5
    invoke-static {p1}, Lig/a;->x(Lgf/a;)Ljf/h;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0, v1}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    iget v1, p1, Lgf/a;->l:I

    .line 16
    .line 17
    iget-object v2, p1, Lgf/a;->b:Lac/k;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lac/k;->s(I)Ljf/g;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    iget-object v1, v5, Ljf/g;->a:Ljava/util/List;

    .line 24
    .line 25
    new-instance v2, Lme/a;

    .line 26
    .line 27
    const/4 v3, 0x6

    .line 28
    invoke-direct {v2, v3}, Lme/a;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, v5, Ljf/g;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, v6, Lod/d;->j:Lod/a;

    .line 42
    .line 43
    iget-object v4, v6, Lod/d;->g:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v4, v1, v2}, Lod/d;->b(Lud/u;Lod/a;Ljava/lang/String;Ljava/util/List;Lqd/j;)Lod/d;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    new-instance v2, Lpd/o;

    .line 50
    .line 51
    move-object v4, p1

    .line 52
    move v7, p2

    .line 53
    invoke-direct/range {v2 .. v7}, Lpd/o;-><init>(Lod/d;Lgf/a;Ljf/g;Lod/d;Z)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_0
    move-object v4, p1

    .line 58
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string p2, "Failed to load method reference for insn: "

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lah/a;->k(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    return-object p1
.end method

.method public D(Lgf/a;Z)Lpd/s;
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lud/r;

    .line 4
    .line 5
    new-instance v1, Lpd/s;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    sget-object v3, Lqd/j;->A:Lqd/h;

    .line 9
    .line 10
    invoke-static {p1, v2, v3}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget v3, p1, Lgf/a;->l:I

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, p2}, Lpd/s;-><init>(Lqd/l;IZ)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p1, Lgf/a;->n:Lsc/a;

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lpd/r;

    .line 24
    .line 25
    check-cast p2, Ltc/a;

    .line 26
    .line 27
    invoke-direct {v2, p2}, Lpd/r;-><init>(Ltc/a;)V

    .line 28
    .line 29
    .line 30
    iget p1, p1, Lgf/a;->l:I

    .line 31
    .line 32
    iput-object v2, v1, Lpd/s;->q:Lpd/r;

    .line 33
    .line 34
    iput p1, v1, Lpd/s;->r:I

    .line 35
    .line 36
    :cond_0
    sget-object p1, Lmd/a;->l0:Lmd/a;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lmd/e;->w(Lmd/a;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lmd/b;->u:Lmd/b;

    .line 42
    .line 43
    iget-object p2, v0, Lmd/e;->g:Lmd/f;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Lnd/d;

    .line 50
    .line 51
    if-nez p1, :cond_1

    .line 52
    .line 53
    new-instance p1, Lnd/d;

    .line 54
    .line 55
    invoke-direct {p1}, Lnd/d;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lmd/e;->y(Loc/b;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object p1, p1, Lnd/d;->g:Ljava/util/EnumSet;

    .line 62
    .line 63
    sget-object p2, Lnd/c;->g:Lnd/c;

    .line 64
    .line 65
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-object v1
.end method

.method public F(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpa/c;

    .line 4
    .line 5
    iget-object v1, v0, Lpa/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lu3/c;

    .line 8
    .line 9
    iget-boolean v2, v0, Lpa/c;->a:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v2, v2, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 19
    .line 20
    sget-object v4, Landroidx/lifecycle/l;->h:Landroidx/lifecycle/l;

    .line 21
    .line 22
    if-ne v2, v4, :cond_1

    .line 23
    .line 24
    iget-boolean v2, v0, Lpa/c;->a:Z

    .line 25
    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    iget-object v2, v0, Lpa/c;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Li/e0;

    .line 31
    .line 32
    invoke-virtual {v2}, Li/e0;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v4, Lw3/a;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 45
    .line 46
    .line 47
    iput-boolean v3, v0, Lpa/c;->a:Z

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p1, "SavedStateRegistry was already attached."

    .line 51
    .line 52
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const-string p1, "Restarter must be created only during owner\'s initialization stage"

    .line 57
    .line 58
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    :goto_0
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 67
    .line 68
    sget-object v4, Landroidx/lifecycle/l;->j:Landroidx/lifecycle/l;

    .line 69
    .line 70
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-gez v2, :cond_5

    .line 75
    .line 76
    iget-boolean v1, v0, Lpa/c;->b:Z

    .line 77
    .line 78
    if-nez v1, :cond_4

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    const-string v2, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 84
    .line 85
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    invoke-static {v2, p1}, La7/a;->x(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_3
    iput-object v1, v0, Lpa/c;->g:Ljava/lang/Object;

    .line 96
    .line 97
    iput-boolean v3, v0, Lpa/c;->b:Z

    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    const-string p1, "SavedStateRegistry was already restored."

    .line 101
    .line 102
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    invoke-interface {v1}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object p1, p1, Landroidx/lifecycle/s;->c:Landroidx/lifecycle/l;

    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v1, "performRestore cannot be called when owner is "

    .line 115
    .line 116
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0
.end method

.method public G(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpa/c;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Lsf/e;

    .line 7
    .line 8
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, [Lsf/e;

    .line 13
    .line 14
    invoke-static {v1}, Lx6/d;->n([Lsf/e;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, v0, Lpa/c;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v2, v0, Lpa/c;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Luf/d;

    .line 30
    .line 31
    monitor-enter v2

    .line 32
    :try_start_0
    iget-object v0, v0, Lpa/c;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/util/Map$Entry;

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ly1/l1;

    .line 67
    .line 68
    invoke-virtual {v3}, Ly1/l1;->a()Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    monitor-exit v2

    .line 82
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 89
    .line 90
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void

    .line 94
    :goto_1
    monitor-exit v2

    .line 95
    throw p1
.end method

.method public H(Landroid/view/View;[F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [F

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    instance-of v2, v1, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0, v1, p2}, Lp4/t;->H(Landroid/view/View;[F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    int-to-float v1, v1

    .line 23
    neg-float v1, v1

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    int-to-float v2, v2

    .line 29
    neg-float v2, v2

    .line 30
    invoke-static {v0}, Lf1/i0;->d([F)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1, v2}, Lf1/i0;->f([FFF)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2, v0}, Ly1/g0;->s([F[F)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    int-to-float v1, v1

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    int-to-float v2, v2

    .line 49
    invoke-static {v0}, Lf1/i0;->d([F)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2}, Lf1/i0;->f([FFF)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2, v0}, Ly1/g0;->s([F[F)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, [I

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    int-to-float v2, v2

    .line 71
    neg-float v2, v2

    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    int-to-float v3, v3

    .line 77
    neg-float v3, v3

    .line 78
    invoke-static {v0}, Lf1/i0;->d([F)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v2, v3}, Lf1/i0;->f([FFF)V

    .line 82
    .line 83
    .line 84
    invoke-static {p2, v0}, Ly1/g0;->s([F[F)V

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    aget v2, v1, v2

    .line 89
    .line 90
    int-to-float v2, v2

    .line 91
    const/4 v3, 0x1

    .line 92
    aget v1, v1, v3

    .line 93
    .line 94
    int-to-float v1, v1

    .line 95
    invoke-static {v0}, Lf1/i0;->d([F)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v2, v1}, Lf1/i0;->f([FFF)V

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v0}, Ly1/g0;->s([F[F)V

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_1

    .line 113
    .line 114
    invoke-static {p1, v0}, Lf1/c0;->q(Landroid/graphics/Matrix;[F)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2, v0}, Ly1/g0;->s([F[F)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-void
.end method

.method public I(Lt4/a;Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lz4/d;->d()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p2, v1

    .line 17
    :goto_0
    iget-object v2, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lr4/p;

    .line 20
    .line 21
    iget-object v3, v2, Lr4/p;->f:Lr4/h0;

    .line 22
    .line 23
    iget-object v2, v2, Lr4/p;->g:Lr4/h0;

    .line 24
    .line 25
    iget-object v4, p1, Lt4/a;->h:Lv4/d0;

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Lr4/h0;->m(Lv4/d0;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const-string v6, " // "

    .line 32
    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    new-instance v7, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v8, "  type_idx: "

    .line 38
    .line 39
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v4, v4, Lv4/d0;->g:Lw4/c;

    .line 53
    .line 54
    invoke-virtual {v4}, Lw4/c;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v0, v4}, Lz4/d;->c(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v4, p1, Lt4/a;->h:Lv4/d0;

    .line 69
    .line 70
    invoke-virtual {v2, v4}, Lr4/h0;->m(Lv4/d0;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v0, v2}, Lz4/d;->n(I)I

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, Lt4/a;->j:Ljava/util/TreeMap;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz p2, :cond_2

    .line 92
    .line 93
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    const-string v5, "  size: "

    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v0, v4}, Lz4/d;->c(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v0, v2}, Lz4/d;->n(I)I

    .line 107
    .line 108
    .line 109
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    move v2, v1

    .line 114
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_5

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    check-cast v4, Lt4/d;

    .line 125
    .line 126
    iget-object v5, v4, Lt4/d;->g:Lv4/c0;

    .line 127
    .line 128
    invoke-virtual {v3, v5}, Lr4/h0;->l(Lv4/c0;)I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    iget-object v4, v4, Lt4/d;->h:Lv4/a;

    .line 133
    .line 134
    if-eqz p2, :cond_3

    .line 135
    .line 136
    new-instance v8, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v9, "  elements["

    .line 139
    .line 140
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v9, "]:"

    .line 147
    .line 148
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    invoke-virtual {v0, v1, v8}, Lz4/d;->b(ILjava/lang/String;)V

    .line 156
    .line 157
    .line 158
    add-int/lit8 v2, v2, 0x1

    .line 159
    .line 160
    new-instance v8, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v9, "    name_idx: "

    .line 163
    .line 164
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v7}, La/a;->Y0(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5}, Lv4/c0;->a()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-virtual {v0, v5}, Lz4/d;->c(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_3
    invoke-virtual {v0, v7}, Lz4/d;->n(I)I

    .line 192
    .line 193
    .line 194
    if-eqz p2, :cond_4

    .line 195
    .line 196
    invoke-static {v4}, Lp4/t;->q(Lv4/a;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    const-string v7, "    value: "

    .line 201
    .line 202
    invoke-virtual {v7, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v0, v5}, Lz4/d;->c(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_4
    invoke-virtual {p0, v4}, Lp4/t;->K(Lv4/a;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    if-eqz p2, :cond_6

    .line 214
    .line 215
    invoke-virtual {v0}, Lz4/d;->e()V

    .line 216
    .line 217
    .line 218
    :cond_6
    return-void
.end method

.method public J(Lv4/d;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lz4/d;->d()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p2, v1

    .line 17
    :goto_0
    iget-object p1, p1, Lv4/d;->g:Lv4/c;

    .line 18
    .line 19
    iget-object v2, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 20
    .line 21
    array-length v2, v2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "  size: "

    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Lz4/d;->c(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Lz4/d;->n(I)I

    .line 38
    .line 39
    .line 40
    :goto_1
    if-ge v1, v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Lv4/a;

    .line 47
    .line 48
    if-eqz p2, :cond_2

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v5, "  ["

    .line 53
    .line 54
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v5, "] "

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lp4/t;->q(Lv4/a;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v0, v4}, Lz4/d;->c(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-virtual {p0, v3}, Lp4/t;->K(Lv4/a;)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    if-eqz p2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Lz4/d;->e()V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public K(Lv4/a;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr4/p;

    .line 4
    .line 5
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lz4/d;

    .line 8
    .line 9
    invoke-static {p1}, Lp4/t;->r(Lv4/a;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    const/4 v4, 0x6

    .line 17
    if-eq v2, v4, :cond_3

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq v2, v4, :cond_3

    .line 21
    .line 22
    if-eq v2, v3, :cond_2

    .line 23
    .line 24
    const/4 v4, 0x4

    .line 25
    if-eq v2, v4, :cond_3

    .line 26
    .line 27
    const/16 v3, 0x10

    .line 28
    .line 29
    if-eq v2, v3, :cond_1

    .line 30
    .line 31
    const/16 v3, 0x11

    .line 32
    .line 33
    if-eq v2, v3, :cond_0

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    const-string p1, "Shouldn\'t happen"

    .line 40
    .line 41
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    check-cast p1, Lv4/f;

    .line 46
    .line 47
    iget p1, p1, Lv4/s;->g:I

    .line 48
    .line 49
    shl-int/lit8 p1, p1, 0x5

    .line 50
    .line 51
    or-int/2addr p1, v2

    .line 52
    invoke-virtual {v1, p1}, Lz4/d;->j(I)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_1
    invoke-virtual {v1, v2}, Lz4/d;->j(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    invoke-virtual {v1, v2}, Lz4/d;->j(I)V

    .line 61
    .line 62
    .line 63
    check-cast p1, Lv4/b;

    .line 64
    .line 65
    iget-object p1, p1, Lv4/b;->g:Lt4/a;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v3}, Lp4/t;->I(Lt4/a;Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    invoke-virtual {v1, v2}, Lz4/d;->j(I)V

    .line 72
    .line 73
    .line 74
    check-cast p1, Lv4/d;

    .line 75
    .line 76
    invoke-virtual {p0, p1, v3}, Lp4/t;->J(Lv4/d;Z)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_4
    check-cast p1, Lv4/l;

    .line 81
    .line 82
    invoke-virtual {p1}, Lv4/l;->k()Lv4/m;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object v0, v0, Lr4/p;->i:Lr4/w;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Lr4/w;->l(Lv4/m;)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    int-to-long v3, p1

    .line 93
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_5
    iget-object v0, v0, Lr4/p;->j:Lr4/j0;

    .line 98
    .line 99
    check-cast p1, Lv4/y;

    .line 100
    .line 101
    invoke-virtual {v0, p1}, Lr4/j0;->l(Lv4/e;)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    int-to-long v3, p1

    .line 106
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_6
    iget-object v0, v0, Lr4/p;->i:Lr4/w;

    .line 111
    .line 112
    check-cast p1, Lv4/m;

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Lr4/w;->l(Lv4/m;)I

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    int-to-long v3, p1

    .line 119
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_7
    iget-object v0, v0, Lr4/p;->g:Lr4/h0;

    .line 124
    .line 125
    check-cast p1, Lv4/d0;

    .line 126
    .line 127
    invoke-virtual {v0, p1}, Lr4/h0;->m(Lv4/d0;)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    int-to-long v3, p1

    .line 132
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_8
    iget-object v0, v0, Lr4/p;->f:Lr4/h0;

    .line 137
    .line 138
    check-cast p1, Lv4/c0;

    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lr4/h0;->l(Lv4/c0;)I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    int-to-long v3, p1

    .line 145
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_9
    iget-object v0, v0, Lr4/p;->n:Lr4/h0;

    .line 150
    .line 151
    check-cast p1, Lv4/x;

    .line 152
    .line 153
    iget-object v0, v0, Lr4/h0;->g:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ljava/util/TreeMap;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lr4/g0;

    .line 162
    .line 163
    invoke-virtual {p1}, Lr4/z;->e()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    int-to-long v3, p1

    .line 168
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_a
    iget-object v0, v0, Lr4/p;->h:Lr4/h0;

    .line 173
    .line 174
    check-cast p1, Lv4/a0;

    .line 175
    .line 176
    iget-object p1, p1, Lv4/a0;->g:Lw4/a;

    .line 177
    .line 178
    invoke-virtual {v0, p1}, Lr4/h0;->n(Lw4/a;)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    int-to-long v3, p1

    .line 183
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_0
    check-cast p1, Lv4/k;

    .line 188
    .line 189
    iget-wide v3, p1, Lv4/t;->g:J

    .line 190
    .line 191
    invoke-static {v1, v2, v3, v4}, Lg4/a;->N(Lz4/d;IJ)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_1
    check-cast p1, Lv4/n;

    .line 196
    .line 197
    iget p1, p1, Lv4/s;->g:I

    .line 198
    .line 199
    int-to-long v3, p1

    .line 200
    const/16 p1, 0x20

    .line 201
    .line 202
    shl-long/2addr v3, p1

    .line 203
    invoke-static {v1, v2, v3, v4}, Lg4/a;->N(Lz4/d;IJ)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_2
    check-cast p1, Lv4/u;

    .line 208
    .line 209
    invoke-virtual {p1}, Lv4/u;->m()J

    .line 210
    .line 211
    .line 212
    move-result-wide v3

    .line 213
    invoke-static {v1, v2, v3, v4}, Lg4/a;->O(Lz4/d;IJ)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_3
    check-cast p1, Lv4/u;

    .line 218
    .line 219
    invoke-virtual {p1}, Lv4/u;->m()J

    .line 220
    .line 221
    .line 222
    move-result-wide v4

    .line 223
    const/16 p1, 0x3f

    .line 224
    .line 225
    shr-long v6, v4, p1

    .line 226
    .line 227
    xor-long/2addr v6, v4

    .line 228
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    rsub-int/lit8 p1, p1, 0x48

    .line 233
    .line 234
    shr-int/2addr p1, v3

    .line 235
    add-int/lit8 v0, p1, -0x1

    .line 236
    .line 237
    shl-int/lit8 v0, v0, 0x5

    .line 238
    .line 239
    or-int/2addr v0, v2

    .line 240
    invoke-virtual {v1, v0}, Lz4/d;->j(I)V

    .line 241
    .line 242
    .line 243
    :goto_0
    if-lez p1, :cond_4

    .line 244
    .line 245
    long-to-int v0, v4

    .line 246
    int-to-byte v0, v0

    .line 247
    invoke-virtual {v1, v0}, Lz4/d;->j(I)V

    .line 248
    .line 249
    .line 250
    const/16 v0, 0x8

    .line 251
    .line 252
    shr-long/2addr v4, v0

    .line 253
    add-int/lit8 p1, p1, -0x1

    .line 254
    .line 255
    goto :goto_0

    .line 256
    :cond_4
    return-void

    .line 257
    :pswitch_data_0
    .packed-switch 0x15
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

.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public b(Ltg/e;Lwf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    new-instance v0, Lgg/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lug/g;

    .line 9
    .line 10
    new-instance v2, Lh/w;

    .line 11
    .line 12
    iget-object v3, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Li0/v1;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-direct {v2, v0, p1, v3, v4}, Lh/w;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2, p2}, Lug/g;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    return-object p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv8/q;

    .line 4
    .line 5
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv8/h;

    .line 8
    .line 9
    new-instance v2, Lab/e;

    .line 10
    .line 11
    const/16 v3, 0xe

    .line 12
    .line 13
    invoke-direct {v2, v1, p1, v0, v3}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {v0, v1, p1, v2}, Lv8/q;->b(Lv8/h;Lv8/c;Lfg/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwb/n7;

    .line 4
    .line 5
    invoke-virtual {v0}, Lwb/n7;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(Lv0/b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfg/p;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfg/l;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public f(Lf/u0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf/b0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf/b0;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Lf/u0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lf/g0;

    .line 11
    .line 12
    iget-object v2, v1, Lf/g0;->b:[Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v3, v1, Lf/g0;->c:[J

    .line 15
    .line 16
    iget v1, v1, Lf/g0;->e:I

    .line 17
    .line 18
    :goto_0
    const v4, 0x7fffffff

    .line 19
    .line 20
    .line 21
    if-eq v1, v4, :cond_2

    .line 22
    .line 23
    aget-wide v4, v3, v1

    .line 24
    .line 25
    const/16 v6, 0x1f

    .line 26
    .line 27
    shr-long/2addr v4, v6

    .line 28
    const-wide/32 v6, 0x7fffffff

    .line 29
    .line 30
    .line 31
    and-long/2addr v4, v6

    .line 32
    long-to-int v4, v4

    .line 33
    aget-object v1, v2, v1

    .line 34
    .line 35
    iget-object v5, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Ls/b0;

    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ls/b0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v0, v5}, Lf/b0;->d(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-ltz v6, :cond_0

    .line 48
    .line 49
    iget-object v7, v0, Lf/b0;->c:[I

    .line 50
    .line 51
    aget v6, v7, v6

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_0
    const/4 v6, 0x0

    .line 55
    :goto_1
    const/4 v7, 0x7

    .line 56
    if-ne v6, v7, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1, v1}, Lf/u0;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 63
    .line 64
    invoke-virtual {v0, v6, v5}, Lf/b0;->g(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_2
    move v1, v4

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    return-void
.end method

.method public g(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls/b0;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ls/b0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0, p2}, Ls/b0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public h(Landroid/view/View;[F)V
    .locals 0

    .line 1
    invoke-static {p2}, Lf1/i0;->d([F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Lp4/t;->H(Landroid/view/View;[F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onSuccess(Ljava/io/File;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv8/q;

    .line 4
    .line 5
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv8/h;

    .line 8
    .line 9
    new-instance v2, Lv8/c;

    .line 10
    .line 11
    invoke-direct {v2, v0, v1, p1}, Lv8/c;-><init>(Lv8/q;Lv8/h;Ljava/io/File;)V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lv8/c;

    .line 15
    .line 16
    invoke-direct {v3, v1, p1, v0}, Lv8/c;-><init>(Lv8/h;Ljava/io/File;Lv8/q;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3}, Lv8/q;->b(Lv8/h;Lv8/c;Lfg/a;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public s(Lgf/a;)Lud/p;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lud/u;

    .line 8
    .line 9
    iget-object v3, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lud/r;

    .line 12
    .line 13
    iget-object v4, v1, Lgf/a;->d:Lgf/c;

    .line 14
    .line 15
    iget-object v5, v1, Lgf/a;->b:Lac/k;

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    move v4, v6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v4, v4, Lgf/c;->b:I

    .line 23
    .line 24
    :goto_0
    invoke-static {v4}, Lt3/c;->b(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sget-object v7, Lpd/k;->g:Lpd/k;

    .line 29
    .line 30
    sget-object v8, Lpd/k;->l:Lpd/k;

    .line 31
    .line 32
    sget-object v9, Lpd/k;->u:Lpd/k;

    .line 33
    .line 34
    sget-object v10, Lmd/a;->k0:Lmd/a;

    .line 35
    .line 36
    sget-object v11, Lpd/k;->p:Lpd/k;

    .line 37
    .line 38
    sget-object v14, Lpd/k;->m:Lpd/k;

    .line 39
    .line 40
    sget-object v15, Lpd/k;->t:Lpd/k;

    .line 41
    .line 42
    const/4 v13, 0x0

    .line 43
    const/4 v12, 0x0

    .line 44
    packed-switch v4, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    :pswitch_0
    new-instance v2, Laf/b;

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v3, "Unknown instruction: \'"

    .line 54
    .line 55
    const-string v4, "\'"

    .line 56
    .line 57
    invoke-static {v3, v1, v4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v2

    .line 65
    :pswitch_1
    invoke-virtual {v3, v10}, Lmd/e;->w(Lmd/a;)V

    .line 66
    .line 67
    .line 68
    sget-object v2, Lqd/j;->I:Lqd/h;

    .line 69
    .line 70
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 71
    .line 72
    iget-object v1, v1, Lgf/a;->i:[I

    .line 73
    .line 74
    aget v1, v1, v12

    .line 75
    .line 76
    new-instance v3, Lqd/r;

    .line 77
    .line 78
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 79
    .line 80
    .line 81
    sget-object v1, Lpd/k;->a0:Lpd/k;

    .line 82
    .line 83
    invoke-static {v1, v13, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    return-object v1

    .line 88
    :pswitch_2
    invoke-virtual {v3, v10}, Lmd/e;->w(Lmd/a;)V

    .line 89
    .line 90
    .line 91
    new-instance v2, Lsd/a;

    .line 92
    .line 93
    iget v3, v1, Lgf/a;->l:I

    .line 94
    .line 95
    invoke-direct {v2, v3}, Lsd/a;-><init>(I)V

    .line 96
    .line 97
    .line 98
    sget-object v3, Lqd/j;->I:Lqd/h;

    .line 99
    .line 100
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 101
    .line 102
    iget-object v1, v1, Lgf/a;->i:[I

    .line 103
    .line 104
    aget v1, v1, v12

    .line 105
    .line 106
    new-instance v4, Lqd/r;

    .line 107
    .line 108
    invoke-direct {v4, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v4}, Lud/p;->d0(Lqd/r;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :pswitch_3
    invoke-virtual {v0, v1, v6}, Lp4/t;->B(Lgf/a;Z)Lud/p;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    return-object v1

    .line 120
    :pswitch_4
    invoke-virtual {v0, v1, v12}, Lp4/t;->B(Lgf/a;Z)Lud/p;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    return-object v1

    .line 125
    :pswitch_5
    invoke-virtual {v0, v1, v6}, Lp4/t;->C(Lgf/a;Z)Lpd/o;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    return-object v1

    .line 130
    :pswitch_6
    invoke-virtual {v0, v1, v12}, Lp4/t;->C(Lgf/a;Z)Lpd/o;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    return-object v1

    .line 135
    :pswitch_7
    invoke-virtual {v0, v1, v12}, Lp4/t;->D(Lgf/a;Z)Lpd/s;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    return-object v1

    .line 140
    :pswitch_8
    new-instance v2, Lpd/r;

    .line 141
    .line 142
    iget-object v1, v1, Lgf/a;->n:Lsc/a;

    .line 143
    .line 144
    check-cast v1, Ltc/a;

    .line 145
    .line 146
    invoke-direct {v2, v1}, Lpd/r;-><init>(Ltc/a;)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :pswitch_9
    invoke-virtual {v0, v1, v6}, Lp4/t;->D(Lgf/a;Z)Lpd/s;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    return-object v1

    .line 155
    :pswitch_a
    new-instance v2, Lpd/e;

    .line 156
    .line 157
    iget-object v1, v1, Lgf/a;->n:Lsc/a;

    .line 158
    .line 159
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    check-cast v1, Lhf/a;

    .line 163
    .line 164
    iget-object v3, v1, Lhf/a;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iget v4, v1, Lhf/a;->a:I

    .line 167
    .line 168
    iget v1, v1, Lhf/a;->b:I

    .line 169
    .line 170
    invoke-direct {v2, v4, v1, v3}, Lpd/e;-><init>(IILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-object v2

    .line 174
    :pswitch_b
    new-instance v2, Lpd/f;

    .line 175
    .line 176
    sget-object v3, Lqd/j;->x:Lqd/a;

    .line 177
    .line 178
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 179
    .line 180
    iget-object v4, v1, Lgf/a;->i:[I

    .line 181
    .line 182
    aget v4, v4, v12

    .line 183
    .line 184
    new-instance v5, Lqd/r;

    .line 185
    .line 186
    invoke-direct {v5, v4, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 187
    .line 188
    .line 189
    iget v1, v1, Lgf/a;->l:I

    .line 190
    .line 191
    invoke-direct {v2, v1, v5}, Lpd/f;-><init>(ILqd/l;)V

    .line 192
    .line 193
    .line 194
    return-object v2

    .line 195
    :pswitch_c
    invoke-static {v1, v6}, Lp4/t;->v(Lgf/a;Z)Lpd/g;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    return-object v1

    .line 200
    :pswitch_d
    invoke-static {v1, v12}, Lp4/t;->v(Lgf/a;Z)Lpd/g;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    return-object v1

    .line 205
    :pswitch_e
    invoke-virtual {v1}, Lgf/a;->b()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    iget-wide v4, v1, Lgf/a;->k:J

    .line 214
    .line 215
    long-to-int v4, v4

    .line 216
    if-nez v4, :cond_1

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    instance-of v5, v2, Lqd/a;

    .line 223
    .line 224
    if-eqz v5, :cond_2

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_2
    if-ne v4, v6, :cond_3

    .line 228
    .line 229
    new-instance v4, Lqd/a;

    .line 230
    .line 231
    invoke-direct {v4, v2}, Lqd/a;-><init>(Lqd/j;)V

    .line 232
    .line 233
    .line 234
    move-object v2, v4

    .line 235
    goto :goto_2

    .line 236
    :cond_3
    move v5, v12

    .line 237
    :goto_1
    if-ge v5, v4, :cond_4

    .line 238
    .line 239
    new-instance v7, Lqd/a;

    .line 240
    .line 241
    invoke-direct {v7, v2}, Lqd/a;-><init>(Lqd/j;)V

    .line 242
    .line 243
    .line 244
    add-int/lit8 v5, v5, 0x1

    .line 245
    .line 246
    move-object v2, v7

    .line 247
    goto :goto_1

    .line 248
    :cond_4
    :goto_2
    iget v4, v1, Lgf/a;->j:I

    .line 249
    .line 250
    new-instance v5, Lpd/p;

    .line 251
    .line 252
    add-int/lit8 v7, v4, -0x1

    .line 253
    .line 254
    invoke-direct {v5, v7, v2}, Lpd/p;-><init>(ILqd/j;)V

    .line 255
    .line 256
    .line 257
    sget-object v7, Lqd/l;->k:Lmh/b;

    .line 258
    .line 259
    iget-object v7, v1, Lgf/a;->i:[I

    .line 260
    .line 261
    aget v7, v7, v12

    .line 262
    .line 263
    new-instance v8, Lqd/r;

    .line 264
    .line 265
    invoke-direct {v8, v7, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v5, v8}, Lud/p;->d0(Lqd/r;)V

    .line 269
    .line 270
    .line 271
    move v2, v6

    .line 272
    :goto_3
    if-ge v2, v4, :cond_5

    .line 273
    .line 274
    sget-object v7, Lqd/j;->b:Lqd/g;

    .line 275
    .line 276
    iget-object v8, v1, Lgf/a;->i:[I

    .line 277
    .line 278
    aget v8, v8, v2

    .line 279
    .line 280
    invoke-static {v8, v7, v6}, Lqd/l;->T(ILqd/j;Z)Lqd/r;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    invoke-virtual {v5, v7}, Lud/p;->I(Lqd/l;)V

    .line 285
    .line 286
    .line 287
    add-int/lit8 v2, v2, 0x1

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_5
    sget-object v1, Lmd/b;->u:Lmd/b;

    .line 291
    .line 292
    iget-object v2, v3, Lmd/e;->g:Lmd/f;

    .line 293
    .line 294
    invoke-virtual {v2, v1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    check-cast v1, Lnd/d;

    .line 299
    .line 300
    if-nez v1, :cond_6

    .line 301
    .line 302
    new-instance v1, Lnd/d;

    .line 303
    .line 304
    invoke-direct {v1}, Lnd/d;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3, v1}, Lmd/e;->y(Loc/b;)V

    .line 308
    .line 309
    .line 310
    :cond_6
    iget-object v1, v1, Lnd/d;->g:Ljava/util/EnumSet;

    .line 311
    .line 312
    sget-object v2, Lnd/c;->h:Lnd/c;

    .line 313
    .line 314
    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    return-object v5

    .line 318
    :pswitch_f
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 319
    .line 320
    const/16 v3, 0x8

    .line 321
    .line 322
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    return-object v1

    .line 327
    :pswitch_10
    const/16 v3, 0x8

    .line 328
    .line 329
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 330
    .line 331
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    return-object v1

    .line 336
    :pswitch_11
    const/16 v3, 0x8

    .line 337
    .line 338
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 339
    .line 340
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    return-object v1

    .line 345
    :pswitch_12
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 346
    .line 347
    const/16 v3, 0xb

    .line 348
    .line 349
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    return-object v1

    .line 354
    :pswitch_13
    const/16 v3, 0xb

    .line 355
    .line 356
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 357
    .line 358
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    return-object v1

    .line 363
    :pswitch_14
    const/16 v3, 0xb

    .line 364
    .line 365
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 366
    .line 367
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    return-object v1

    .line 372
    :pswitch_15
    sget-object v2, Lqd/j;->o:Lqd/e;

    .line 373
    .line 374
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 375
    .line 376
    iget-object v1, v1, Lgf/a;->i:[I

    .line 377
    .line 378
    aget v1, v1, v12

    .line 379
    .line 380
    new-instance v3, Lqd/r;

    .line 381
    .line 382
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 383
    .line 384
    .line 385
    sget-object v1, Lpd/k;->r:Lpd/k;

    .line 386
    .line 387
    invoke-static {v1, v13, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    return-object v1

    .line 392
    :pswitch_16
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 393
    .line 394
    const/4 v3, 0x2

    .line 395
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    return-object v1

    .line 400
    :pswitch_17
    const/4 v3, 0x2

    .line 401
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 402
    .line 403
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    return-object v1

    .line 408
    :pswitch_18
    const/4 v3, 0x2

    .line 409
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 410
    .line 411
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    return-object v1

    .line 416
    :pswitch_19
    const/4 v3, 0x2

    .line 417
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 418
    .line 419
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    return-object v1

    .line 424
    :pswitch_1a
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 425
    .line 426
    const/16 v3, 0xa

    .line 427
    .line 428
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    return-object v1

    .line 433
    :pswitch_1b
    const/16 v3, 0xa

    .line 434
    .line 435
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 436
    .line 437
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    return-object v1

    .line 442
    :pswitch_1c
    const/16 v3, 0xa

    .line 443
    .line 444
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 445
    .line 446
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    return-object v1

    .line 451
    :pswitch_1d
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 452
    .line 453
    const/16 v3, 0x9

    .line 454
    .line 455
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    return-object v1

    .line 460
    :pswitch_1e
    const/16 v3, 0x9

    .line 461
    .line 462
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 463
    .line 464
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    return-object v1

    .line 469
    :pswitch_1f
    const/16 v3, 0x9

    .line 470
    .line 471
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 472
    .line 473
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    return-object v1

    .line 478
    :pswitch_20
    new-instance v2, Lpd/a;

    .line 479
    .line 480
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 481
    .line 482
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 483
    .line 484
    iget-object v4, v1, Lgf/a;->i:[I

    .line 485
    .line 486
    aget v4, v4, v12

    .line 487
    .line 488
    new-instance v5, Lqd/r;

    .line 489
    .line 490
    invoke-direct {v5, v4, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 491
    .line 492
    .line 493
    iget-wide v7, v1, Lgf/a;->k:J

    .line 494
    .line 495
    invoke-static {v7, v8, v3}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    iget-object v1, v1, Lgf/a;->i:[I

    .line 500
    .line 501
    aget v1, v1, v6

    .line 502
    .line 503
    new-instance v6, Lqd/r;

    .line 504
    .line 505
    invoke-direct {v6, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 506
    .line 507
    .line 508
    const/4 v3, 0x2

    .line 509
    invoke-direct {v2, v3, v5, v4, v6}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 510
    .line 511
    .line 512
    return-object v2

    .line 513
    :pswitch_21
    new-instance v1, Lud/p;

    .line 514
    .line 515
    invoke-direct {v1, v11, v12}, Lud/p;-><init>(Lpd/k;I)V

    .line 516
    .line 517
    .line 518
    return-object v1

    .line 519
    :pswitch_22
    iget-object v2, v3, Lud/r;->t:Lqd/j;

    .line 520
    .line 521
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 522
    .line 523
    iget-object v1, v1, Lgf/a;->i:[I

    .line 524
    .line 525
    aget v1, v1, v12

    .line 526
    .line 527
    new-instance v3, Lqd/r;

    .line 528
    .line 529
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 530
    .line 531
    .line 532
    invoke-static {v11, v13, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    return-object v1

    .line 537
    :pswitch_23
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 538
    .line 539
    const/4 v3, 0x5

    .line 540
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    return-object v1

    .line 545
    :pswitch_24
    const/4 v3, 0x5

    .line 546
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 547
    .line 548
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    return-object v1

    .line 553
    :pswitch_25
    const/4 v3, 0x5

    .line 554
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 555
    .line 556
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    return-object v1

    .line 561
    :pswitch_26
    const/4 v3, 0x5

    .line 562
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 563
    .line 564
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    return-object v1

    .line 569
    :pswitch_27
    const/4 v3, 0x5

    .line 570
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 571
    .line 572
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    return-object v1

    .line 577
    :pswitch_28
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 578
    .line 579
    const/4 v3, 0x7

    .line 580
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    return-object v1

    .line 585
    :pswitch_29
    const/4 v3, 0x7

    .line 586
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 587
    .line 588
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    return-object v1

    .line 593
    :pswitch_2a
    const/4 v3, 0x7

    .line 594
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 595
    .line 596
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    return-object v1

    .line 601
    :pswitch_2b
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 602
    .line 603
    new-instance v3, Lud/p;

    .line 604
    .line 605
    invoke-direct {v3, v8, v6}, Lud/p;-><init>(Lpd/k;I)V

    .line 606
    .line 607
    .line 608
    invoke-static {v1, v12, v2}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    invoke-virtual {v3, v4}, Lud/p;->d0(Lqd/r;)V

    .line 613
    .line 614
    .line 615
    iget-object v1, v1, Lgf/a;->i:[I

    .line 616
    .line 617
    aget v1, v1, v6

    .line 618
    .line 619
    new-instance v4, Lqd/r;

    .line 620
    .line 621
    invoke-direct {v4, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v3, v4}, Lud/p;->I(Lqd/l;)V

    .line 625
    .line 626
    .line 627
    return-object v3

    .line 628
    :pswitch_2c
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 629
    .line 630
    new-instance v3, Lud/p;

    .line 631
    .line 632
    invoke-direct {v3, v8, v6}, Lud/p;-><init>(Lpd/k;I)V

    .line 633
    .line 634
    .line 635
    invoke-static {v1, v12, v2}, Lqd/l;->U(Lgf/a;ILqd/j;)Lqd/r;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-virtual {v3, v4}, Lud/p;->d0(Lqd/r;)V

    .line 640
    .line 641
    .line 642
    iget-object v1, v1, Lgf/a;->i:[I

    .line 643
    .line 644
    aget v1, v1, v6

    .line 645
    .line 646
    new-instance v4, Lqd/r;

    .line 647
    .line 648
    invoke-direct {v4, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v3, v4}, Lud/p;->I(Lqd/l;)V

    .line 652
    .line 653
    .line 654
    return-object v3

    .line 655
    :pswitch_2d
    invoke-virtual {v1}, Lgf/a;->b()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v2

    .line 659
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    new-instance v3, Lpd/j;

    .line 664
    .line 665
    sget-object v4, Lpd/k;->J:Lpd/k;

    .line 666
    .line 667
    invoke-direct {v3, v4, v2, v12}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 668
    .line 669
    .line 670
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 671
    .line 672
    iget-object v1, v1, Lgf/a;->i:[I

    .line 673
    .line 674
    aget v1, v1, v12

    .line 675
    .line 676
    new-instance v4, Lqd/r;

    .line 677
    .line 678
    invoke-direct {v4, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3, v4}, Lud/p;->d0(Lqd/r;)V

    .line 682
    .line 683
    .line 684
    return-object v3

    .line 685
    :pswitch_2e
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 686
    .line 687
    invoke-static {v1, v2}, Lp4/t;->E(Lgf/a;Lqd/j;)Lud/p;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    return-object v1

    .line 692
    :pswitch_2f
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 693
    .line 694
    invoke-static {v1, v2}, Lp4/t;->E(Lgf/a;Lqd/j;)Lud/p;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    return-object v1

    .line 699
    :pswitch_30
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 700
    .line 701
    invoke-static {v1, v2}, Lp4/t;->E(Lgf/a;Lqd/j;)Lud/p;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    return-object v1

    .line 706
    :pswitch_31
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 707
    .line 708
    invoke-static {v1, v2}, Lp4/t;->E(Lgf/a;Lqd/j;)Lud/p;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    return-object v1

    .line 713
    :pswitch_32
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 714
    .line 715
    const/4 v3, 0x3

    .line 716
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    return-object v1

    .line 721
    :pswitch_33
    const/4 v3, 0x3

    .line 722
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 723
    .line 724
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    return-object v1

    .line 729
    :pswitch_34
    const/4 v3, 0x3

    .line 730
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 731
    .line 732
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    return-object v1

    .line 737
    :pswitch_35
    const/4 v3, 0x3

    .line 738
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 739
    .line 740
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 741
    .line 742
    .line 743
    move-result-object v1

    .line 744
    return-object v1

    .line 745
    :pswitch_36
    const/4 v3, 0x3

    .line 746
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 747
    .line 748
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    return-object v1

    .line 753
    :pswitch_37
    sget-object v2, Lqd/j;->E:Lqd/h;

    .line 754
    .line 755
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 756
    .line 757
    iget-object v3, v1, Lgf/a;->i:[I

    .line 758
    .line 759
    aget v3, v3, v12

    .line 760
    .line 761
    new-instance v4, Lqd/r;

    .line 762
    .line 763
    invoke-direct {v4, v3, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 764
    .line 765
    .line 766
    iget-object v1, v1, Lgf/a;->i:[I

    .line 767
    .line 768
    aget v1, v1, v6

    .line 769
    .line 770
    new-instance v3, Lqd/r;

    .line 771
    .line 772
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 773
    .line 774
    .line 775
    invoke-static {v14, v4, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    return-object v1

    .line 780
    :pswitch_38
    sget-object v2, Lqd/j;->u:Lqd/h;

    .line 781
    .line 782
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 783
    .line 784
    iget-object v1, v1, Lgf/a;->i:[I

    .line 785
    .line 786
    aget v1, v1, v12

    .line 787
    .line 788
    new-instance v3, Lqd/r;

    .line 789
    .line 790
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 791
    .line 792
    .line 793
    new-instance v1, Lud/p;

    .line 794
    .line 795
    sget-object v2, Lpd/k;->P:Lpd/k;

    .line 796
    .line 797
    invoke-direct {v1, v2, v12}, Lud/p;-><init>(Lpd/k;I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1, v3}, Lud/p;->d0(Lqd/r;)V

    .line 801
    .line 802
    .line 803
    return-object v1

    .line 804
    :pswitch_39
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 805
    .line 806
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 807
    .line 808
    iget-object v3, v1, Lgf/a;->i:[I

    .line 809
    .line 810
    aget v3, v3, v12

    .line 811
    .line 812
    new-instance v4, Lqd/r;

    .line 813
    .line 814
    invoke-direct {v4, v3, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 815
    .line 816
    .line 817
    iget-object v1, v1, Lgf/a;->i:[I

    .line 818
    .line 819
    aget v1, v1, v6

    .line 820
    .line 821
    new-instance v3, Lqd/r;

    .line 822
    .line 823
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 824
    .line 825
    .line 826
    invoke-static {v14, v4, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    return-object v1

    .line 831
    :pswitch_3a
    sget-object v2, Lqd/j;->w:Lqd/h;

    .line 832
    .line 833
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 834
    .line 835
    iget-object v1, v1, Lgf/a;->i:[I

    .line 836
    .line 837
    aget v1, v1, v12

    .line 838
    .line 839
    new-instance v3, Lqd/r;

    .line 840
    .line 841
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 842
    .line 843
    .line 844
    new-instance v1, Lud/p;

    .line 845
    .line 846
    sget-object v2, Lpd/k;->s:Lpd/k;

    .line 847
    .line 848
    invoke-direct {v1, v2, v12}, Lud/p;-><init>(Lpd/k;I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v1, v3}, Lud/p;->d0(Lqd/r;)V

    .line 852
    .line 853
    .line 854
    return-object v1

    .line 855
    :pswitch_3b
    iget v2, v1, Lgf/a;->j:I

    .line 856
    .line 857
    new-instance v3, Lud/p;

    .line 858
    .line 859
    sget-object v4, Lpd/k;->n:Lpd/k;

    .line 860
    .line 861
    invoke-direct {v3, v4, v2}, Lud/p;-><init>(Lpd/k;I)V

    .line 862
    .line 863
    .line 864
    :goto_4
    if-ge v12, v2, :cond_7

    .line 865
    .line 866
    sget-object v4, Lqd/j;->u:Lqd/h;

    .line 867
    .line 868
    sget-object v5, Lqd/l;->k:Lmh/b;

    .line 869
    .line 870
    iget-object v5, v1, Lgf/a;->i:[I

    .line 871
    .line 872
    aget v5, v5, v12

    .line 873
    .line 874
    new-instance v6, Lqd/r;

    .line 875
    .line 876
    invoke-direct {v6, v5, v4}, Lqd/r;-><init>(ILqd/j;)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v3, v6}, Lud/p;->I(Lqd/l;)V

    .line 880
    .line 881
    .line 882
    add-int/lit8 v12, v12, 0x1

    .line 883
    .line 884
    goto :goto_4

    .line 885
    :cond_7
    return-object v3

    .line 886
    :pswitch_3c
    sget-object v2, Lqd/j;->y:Lqd/h;

    .line 887
    .line 888
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 889
    .line 890
    iget-object v3, v1, Lgf/a;->i:[I

    .line 891
    .line 892
    aget v3, v3, v12

    .line 893
    .line 894
    new-instance v4, Lqd/r;

    .line 895
    .line 896
    invoke-direct {v4, v3, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 897
    .line 898
    .line 899
    iget-object v1, v1, Lgf/a;->i:[I

    .line 900
    .line 901
    aget v1, v1, v6

    .line 902
    .line 903
    new-instance v3, Lqd/r;

    .line 904
    .line 905
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 906
    .line 907
    .line 908
    invoke-static {v14, v4, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    return-object v1

    .line 913
    :pswitch_3d
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 914
    .line 915
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 916
    .line 917
    iget-object v1, v1, Lgf/a;->i:[I

    .line 918
    .line 919
    aget v1, v1, v12

    .line 920
    .line 921
    new-instance v3, Lqd/r;

    .line 922
    .line 923
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 924
    .line 925
    .line 926
    sget-object v1, Lpd/k;->z:Lpd/k;

    .line 927
    .line 928
    invoke-static {v1, v13, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    return-object v1

    .line 933
    :pswitch_3e
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 934
    .line 935
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 936
    .line 937
    iget-object v1, v1, Lgf/a;->i:[I

    .line 938
    .line 939
    aget v1, v1, v12

    .line 940
    .line 941
    new-instance v3, Lqd/r;

    .line 942
    .line 943
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 944
    .line 945
    .line 946
    sget-object v1, Lpd/k;->y:Lpd/k;

    .line 947
    .line 948
    invoke-static {v1, v13, v3}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    return-object v1

    .line 953
    :pswitch_3f
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 954
    .line 955
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 956
    .line 957
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    return-object v1

    .line 962
    :pswitch_40
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 963
    .line 964
    sget-object v3, Lqd/j;->g:Lqd/g;

    .line 965
    .line 966
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    return-object v1

    .line 971
    :pswitch_41
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 972
    .line 973
    sget-object v3, Lqd/j;->h:Lqd/g;

    .line 974
    .line 975
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    return-object v1

    .line 980
    :pswitch_42
    iget v3, v1, Lgf/a;->m:I

    .line 981
    .line 982
    iget-object v4, v5, Lac/k;->j:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v4, Lff/e;

    .line 985
    .line 986
    iget-object v4, v4, Lff/e;->d:Ljf/e;

    .line 987
    .line 988
    iget v4, v4, Ljf/e;->e:I

    .line 989
    .line 990
    const/16 v16, 0x8

    .line 991
    .line 992
    mul-int/lit8 v3, v3, 0x8

    .line 993
    .line 994
    add-int/2addr v3, v4

    .line 995
    invoke-virtual {v5, v3}, Lac/k;->a(I)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v5}, Lac/k;->L()I

    .line 999
    .line 1000
    .line 1001
    move-result v3

    .line 1002
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    iget-object v7, v5, Lac/k;->i:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 1009
    .line 1010
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    .line 1011
    .line 1012
    .line 1013
    move-result v7

    .line 1014
    invoke-virtual {v5, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v4

    .line 1018
    invoke-virtual {v5, v7}, Lac/k;->v(I)Ljava/lang/String;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v7

    .line 1022
    invoke-virtual {v5, v3}, Lac/k;->y(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    invoke-static {v2, v3}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v3

    .line 1030
    new-instance v5, Lod/c;

    .line 1031
    .line 1032
    invoke-static {v4}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    invoke-direct {v5, v3, v7, v4}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object v3, v2, Lud/u;->e:Lbe/k;

    .line 1040
    .line 1041
    invoke-virtual {v3, v5}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    new-instance v4, Lpd/j;

    .line 1046
    .line 1047
    sget-object v5, Lpd/k;->N:Lpd/k;

    .line 1048
    .line 1049
    invoke-direct {v4, v5, v3, v6}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v2, v3}, Lud/u;->h(Lod/c;)Lud/g;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    if-eqz v2, :cond_8

    .line 1057
    .line 1058
    iget-object v2, v2, Lud/g;->n:Lqd/j;

    .line 1059
    .line 1060
    goto :goto_5

    .line 1061
    :cond_8
    iget-object v2, v3, Lod/c;->i:Lqd/j;

    .line 1062
    .line 1063
    :goto_5
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 1064
    .line 1065
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1066
    .line 1067
    aget v1, v1, v12

    .line 1068
    .line 1069
    new-instance v3, Lqd/r;

    .line 1070
    .line 1071
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v4, v3}, Lud/p;->I(Lqd/l;)V

    .line 1075
    .line 1076
    .line 1077
    return-object v4

    .line 1078
    :pswitch_43
    iget v3, v1, Lgf/a;->m:I

    .line 1079
    .line 1080
    iget-object v4, v5, Lac/k;->j:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v4, Lff/e;

    .line 1083
    .line 1084
    iget-object v4, v4, Lff/e;->d:Ljf/e;

    .line 1085
    .line 1086
    iget v4, v4, Ljf/e;->e:I

    .line 1087
    .line 1088
    const/16 v16, 0x8

    .line 1089
    .line 1090
    mul-int/lit8 v3, v3, 0x8

    .line 1091
    .line 1092
    add-int/2addr v3, v4

    .line 1093
    invoke-virtual {v5, v3}, Lac/k;->a(I)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1097
    .line 1098
    .line 1099
    move-result v3

    .line 1100
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1101
    .line 1102
    .line 1103
    move-result v4

    .line 1104
    iget-object v6, v5, Lac/k;->i:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 1107
    .line 1108
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->getInt()I

    .line 1109
    .line 1110
    .line 1111
    move-result v6

    .line 1112
    invoke-virtual {v5, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v4

    .line 1116
    invoke-virtual {v5, v6}, Lac/k;->v(I)Ljava/lang/String;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v6

    .line 1120
    invoke-virtual {v5, v3}, Lac/k;->y(I)Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v3

    .line 1124
    invoke-static {v2, v3}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v3

    .line 1128
    new-instance v5, Lod/c;

    .line 1129
    .line 1130
    invoke-static {v4}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v4

    .line 1134
    invoke-direct {v5, v3, v6, v4}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 1135
    .line 1136
    .line 1137
    iget-object v3, v2, Lud/u;->e:Lbe/k;

    .line 1138
    .line 1139
    invoke-virtual {v3, v5}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    new-instance v4, Lpd/j;

    .line 1144
    .line 1145
    sget-object v5, Lpd/k;->M:Lpd/k;

    .line 1146
    .line 1147
    invoke-direct {v4, v5, v3, v12}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v2, v3}, Lud/u;->h(Lod/c;)Lud/g;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    if-eqz v2, :cond_9

    .line 1155
    .line 1156
    iget-object v2, v2, Lud/g;->n:Lqd/j;

    .line 1157
    .line 1158
    goto :goto_6

    .line 1159
    :cond_9
    iget-object v2, v3, Lod/c;->i:Lqd/j;

    .line 1160
    .line 1161
    :goto_6
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 1162
    .line 1163
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1164
    .line 1165
    aget v1, v1, v12

    .line 1166
    .line 1167
    new-instance v3, Lqd/r;

    .line 1168
    .line 1169
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v4, v3}, Lud/p;->d0(Lqd/r;)V

    .line 1173
    .line 1174
    .line 1175
    return-object v4

    .line 1176
    :pswitch_44
    iget v3, v1, Lgf/a;->m:I

    .line 1177
    .line 1178
    iget-object v4, v5, Lac/k;->j:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v4, Lff/e;

    .line 1181
    .line 1182
    iget-object v4, v4, Lff/e;->d:Ljf/e;

    .line 1183
    .line 1184
    iget v4, v4, Ljf/e;->e:I

    .line 1185
    .line 1186
    const/16 v16, 0x8

    .line 1187
    .line 1188
    mul-int/lit8 v3, v3, 0x8

    .line 1189
    .line 1190
    add-int/2addr v3, v4

    .line 1191
    invoke-virtual {v5, v3}, Lac/k;->a(I)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1199
    .line 1200
    .line 1201
    move-result v4

    .line 1202
    iget-object v7, v5, Lac/k;->i:Ljava/lang/Object;

    .line 1203
    .line 1204
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 1205
    .line 1206
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    .line 1207
    .line 1208
    .line 1209
    move-result v7

    .line 1210
    invoke-virtual {v5, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v4

    .line 1214
    invoke-virtual {v5, v7}, Lac/k;->v(I)Ljava/lang/String;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v7

    .line 1218
    invoke-virtual {v5, v3}, Lac/k;->y(I)Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v3

    .line 1222
    invoke-static {v2, v3}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v3

    .line 1226
    new-instance v5, Lod/c;

    .line 1227
    .line 1228
    invoke-static {v4}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v4

    .line 1232
    invoke-direct {v5, v3, v7, v4}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 1233
    .line 1234
    .line 1235
    iget-object v3, v2, Lud/u;->e:Lbe/k;

    .line 1236
    .line 1237
    invoke-virtual {v3, v5}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v3

    .line 1241
    new-instance v4, Lpd/j;

    .line 1242
    .line 1243
    sget-object v5, Lpd/k;->L:Lpd/k;

    .line 1244
    .line 1245
    const/4 v7, 0x2

    .line 1246
    invoke-direct {v4, v5, v3, v7}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1247
    .line 1248
    .line 1249
    invoke-virtual {v2, v3}, Lud/u;->h(Lod/c;)Lud/g;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2

    .line 1253
    if-eqz v2, :cond_a

    .line 1254
    .line 1255
    iget-object v2, v2, Lud/g;->n:Lqd/j;

    .line 1256
    .line 1257
    goto :goto_7

    .line 1258
    :cond_a
    iget-object v2, v3, Lod/c;->i:Lqd/j;

    .line 1259
    .line 1260
    :goto_7
    sget-object v5, Lqd/l;->k:Lmh/b;

    .line 1261
    .line 1262
    iget-object v5, v1, Lgf/a;->i:[I

    .line 1263
    .line 1264
    aget v5, v5, v12

    .line 1265
    .line 1266
    new-instance v7, Lqd/r;

    .line 1267
    .line 1268
    invoke-direct {v7, v5, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1269
    .line 1270
    .line 1271
    invoke-virtual {v4, v7}, Lud/p;->I(Lqd/l;)V

    .line 1272
    .line 1273
    .line 1274
    iget-object v2, v3, Lod/c;->g:Lod/a;

    .line 1275
    .line 1276
    iget-object v2, v2, Lod/a;->g:Lqd/j;

    .line 1277
    .line 1278
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1279
    .line 1280
    aget v1, v1, v6

    .line 1281
    .line 1282
    new-instance v3, Lqd/r;

    .line 1283
    .line 1284
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v4, v3}, Lud/p;->I(Lqd/l;)V

    .line 1288
    .line 1289
    .line 1290
    return-object v4

    .line 1291
    :pswitch_45
    iget v3, v1, Lgf/a;->m:I

    .line 1292
    .line 1293
    iget-object v4, v5, Lac/k;->j:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v4, Lff/e;

    .line 1296
    .line 1297
    iget-object v4, v4, Lff/e;->d:Ljf/e;

    .line 1298
    .line 1299
    iget v4, v4, Ljf/e;->e:I

    .line 1300
    .line 1301
    const/16 v16, 0x8

    .line 1302
    .line 1303
    mul-int/lit8 v3, v3, 0x8

    .line 1304
    .line 1305
    add-int/2addr v3, v4

    .line 1306
    invoke-virtual {v5, v3}, Lac/k;->a(I)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    invoke-virtual {v5}, Lac/k;->L()I

    .line 1314
    .line 1315
    .line 1316
    move-result v4

    .line 1317
    iget-object v7, v5, Lac/k;->i:Ljava/lang/Object;

    .line 1318
    .line 1319
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 1320
    .line 1321
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    .line 1322
    .line 1323
    .line 1324
    move-result v7

    .line 1325
    invoke-virtual {v5, v4}, Lac/k;->y(I)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v4

    .line 1329
    invoke-virtual {v5, v7}, Lac/k;->v(I)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v7

    .line 1333
    invoke-virtual {v5, v3}, Lac/k;->y(I)Ljava/lang/String;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    invoke-static {v2, v3}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    new-instance v5, Lod/c;

    .line 1342
    .line 1343
    invoke-static {v4}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v4

    .line 1347
    invoke-direct {v5, v3, v7, v4}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 1348
    .line 1349
    .line 1350
    iget-object v3, v2, Lud/u;->e:Lbe/k;

    .line 1351
    .line 1352
    invoke-virtual {v3, v5}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v3

    .line 1356
    new-instance v4, Lpd/j;

    .line 1357
    .line 1358
    sget-object v5, Lpd/k;->K:Lpd/k;

    .line 1359
    .line 1360
    invoke-direct {v4, v5, v3, v6}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v2, v3}, Lud/u;->h(Lod/c;)Lud/g;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    if-eqz v2, :cond_b

    .line 1368
    .line 1369
    iget-object v2, v2, Lud/g;->n:Lqd/j;

    .line 1370
    .line 1371
    goto :goto_8

    .line 1372
    :cond_b
    iget-object v2, v3, Lod/c;->i:Lqd/j;

    .line 1373
    .line 1374
    :goto_8
    sget-object v5, Lqd/l;->k:Lmh/b;

    .line 1375
    .line 1376
    iget-object v5, v1, Lgf/a;->i:[I

    .line 1377
    .line 1378
    aget v5, v5, v12

    .line 1379
    .line 1380
    new-instance v7, Lqd/r;

    .line 1381
    .line 1382
    invoke-direct {v7, v5, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1383
    .line 1384
    .line 1385
    invoke-virtual {v4, v7}, Lud/p;->d0(Lqd/r;)V

    .line 1386
    .line 1387
    .line 1388
    iget-object v2, v3, Lod/c;->g:Lod/a;

    .line 1389
    .line 1390
    iget-object v2, v2, Lod/a;->g:Lqd/j;

    .line 1391
    .line 1392
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1393
    .line 1394
    aget v1, v1, v6

    .line 1395
    .line 1396
    new-instance v3, Lqd/r;

    .line 1397
    .line 1398
    invoke-direct {v3, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v4, v3}, Lud/p;->I(Lqd/l;)V

    .line 1402
    .line 1403
    .line 1404
    return-object v4

    .line 1405
    :pswitch_46
    invoke-static {v1}, Lig/a;->x(Lgf/a;)Ljf/h;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v4

    .line 1409
    if-eqz v4, :cond_e

    .line 1410
    .line 1411
    invoke-static {v2, v4}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v2

    .line 1415
    invoke-virtual {v2}, Lod/d;->f()Z

    .line 1416
    .line 1417
    .line 1418
    move-result v4

    .line 1419
    if-nez v4, :cond_d

    .line 1420
    .line 1421
    iget-object v4, v2, Lod/d;->j:Lod/a;

    .line 1422
    .line 1423
    iget-object v3, v3, Lud/r;->l:Lud/e;

    .line 1424
    .line 1425
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 1426
    .line 1427
    invoke-static {v4, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1428
    .line 1429
    .line 1430
    move-result v3

    .line 1431
    if-eqz v3, :cond_c

    .line 1432
    .line 1433
    goto :goto_9

    .line 1434
    :cond_c
    const/4 v13, 0x5

    .line 1435
    goto :goto_a

    .line 1436
    :cond_d
    :goto_9
    const/4 v13, 0x2

    .line 1437
    :goto_a
    new-instance v3, Lpd/n;

    .line 1438
    .line 1439
    invoke-direct {v3, v2, v1, v13, v12}, Lpd/n;-><init>(Lod/d;Lgf/a;IZ)V

    .line 1440
    .line 1441
    .line 1442
    return-object v3

    .line 1443
    :cond_e
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    const-string v2, "Failed to load method reference for insn: "

    .line 1448
    .line 1449
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-static {v1}, Lah/a;->k(Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    return-object v13

    .line 1457
    :pswitch_47
    const/4 v3, 0x3

    .line 1458
    invoke-virtual {v0, v1, v3, v6}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v1

    .line 1462
    return-object v1

    .line 1463
    :pswitch_48
    const/4 v3, 0x3

    .line 1464
    invoke-virtual {v0, v1, v3, v12}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v1

    .line 1468
    return-object v1

    .line 1469
    :pswitch_49
    const/4 v3, 0x5

    .line 1470
    invoke-virtual {v0, v1, v3, v6}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    return-object v1

    .line 1475
    :pswitch_4a
    const/4 v3, 0x5

    .line 1476
    invoke-virtual {v0, v1, v3, v12}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v1

    .line 1480
    return-object v1

    .line 1481
    :pswitch_4b
    invoke-virtual {v0, v1, v6, v6}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    return-object v1

    .line 1486
    :pswitch_4c
    invoke-virtual {v0, v1, v6, v12}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    return-object v1

    .line 1491
    :pswitch_4d
    const/4 v2, 0x4

    .line 1492
    invoke-virtual {v0, v1, v2, v6}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    return-object v1

    .line 1497
    :pswitch_4e
    const/4 v2, 0x4

    .line 1498
    invoke-virtual {v0, v1, v2, v12}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    return-object v1

    .line 1503
    :pswitch_4f
    const/4 v3, 0x2

    .line 1504
    invoke-virtual {v0, v1, v3, v6}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v1

    .line 1508
    return-object v1

    .line 1509
    :pswitch_50
    const/4 v3, 0x2

    .line 1510
    invoke-virtual {v0, v1, v3, v12}, Lp4/t;->A(Lgf/a;IZ)Lpd/n;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    return-object v1

    .line 1515
    :pswitch_51
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1516
    .line 1517
    sget-object v3, Lqd/j;->e:Lqd/g;

    .line 1518
    .line 1519
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v1

    .line 1523
    return-object v1

    .line 1524
    :pswitch_52
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1525
    .line 1526
    sget-object v3, Lqd/j;->i:Lqd/g;

    .line 1527
    .line 1528
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v1

    .line 1532
    return-object v1

    .line 1533
    :pswitch_53
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1534
    .line 1535
    sget-object v3, Lqd/j;->g:Lqd/g;

    .line 1536
    .line 1537
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v1

    .line 1541
    return-object v1

    .line 1542
    :pswitch_54
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1543
    .line 1544
    sget-object v3, Lqd/j;->h:Lqd/g;

    .line 1545
    .line 1546
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v1

    .line 1550
    return-object v1

    .line 1551
    :pswitch_55
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1552
    .line 1553
    sget-object v3, Lqd/j;->f:Lqd/g;

    .line 1554
    .line 1555
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    return-object v1

    .line 1560
    :pswitch_56
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1561
    .line 1562
    sget-object v3, Lqd/j;->d:Lqd/g;

    .line 1563
    .line 1564
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v1

    .line 1568
    return-object v1

    .line 1569
    :pswitch_57
    new-instance v2, Lpd/j;

    .line 1570
    .line 1571
    invoke-virtual {v1}, Lgf/a;->b()Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v3

    .line 1575
    invoke-static {v3}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v3

    .line 1579
    sget-object v4, Lpd/k;->B:Lpd/k;

    .line 1580
    .line 1581
    invoke-direct {v2, v4, v3, v6}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1582
    .line 1583
    .line 1584
    sget-object v3, Lqd/j;->c:Lqd/g;

    .line 1585
    .line 1586
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 1587
    .line 1588
    iget-object v4, v1, Lgf/a;->i:[I

    .line 1589
    .line 1590
    aget v4, v4, v12

    .line 1591
    .line 1592
    new-instance v5, Lqd/r;

    .line 1593
    .line 1594
    invoke-direct {v5, v4, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v2, v5}, Lud/p;->d0(Lqd/r;)V

    .line 1598
    .line 1599
    .line 1600
    sget-object v3, Lqd/j;->v:Lqd/h;

    .line 1601
    .line 1602
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1603
    .line 1604
    aget v1, v1, v6

    .line 1605
    .line 1606
    new-instance v4, Lqd/r;

    .line 1607
    .line 1608
    invoke-direct {v4, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v2, v4}, Lud/p;->I(Lqd/l;)V

    .line 1612
    .line 1613
    .line 1614
    return-object v2

    .line 1615
    :pswitch_58
    new-instance v2, Lpd/i;

    .line 1616
    .line 1617
    const/4 v3, 0x2

    .line 1618
    invoke-direct {v2, v1, v3}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1619
    .line 1620
    .line 1621
    return-object v2

    .line 1622
    :pswitch_59
    new-instance v2, Lpd/i;

    .line 1623
    .line 1624
    const/4 v3, 0x3

    .line 1625
    invoke-direct {v2, v1, v3}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1626
    .line 1627
    .line 1628
    return-object v2

    .line 1629
    :pswitch_5a
    new-instance v2, Lpd/i;

    .line 1630
    .line 1631
    const/4 v3, 0x4

    .line 1632
    invoke-direct {v2, v1, v3}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1633
    .line 1634
    .line 1635
    return-object v2

    .line 1636
    :pswitch_5b
    new-instance v2, Lpd/i;

    .line 1637
    .line 1638
    const/4 v3, 0x5

    .line 1639
    invoke-direct {v2, v1, v3}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1640
    .line 1641
    .line 1642
    return-object v2

    .line 1643
    :pswitch_5c
    new-instance v2, Lpd/i;

    .line 1644
    .line 1645
    const/4 v3, 0x6

    .line 1646
    invoke-direct {v2, v1, v3}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1647
    .line 1648
    .line 1649
    return-object v2

    .line 1650
    :pswitch_5d
    new-instance v2, Lpd/i;

    .line 1651
    .line 1652
    invoke-direct {v2, v1, v6}, Lpd/i;-><init>(Lgf/a;I)V

    .line 1653
    .line 1654
    .line 1655
    return-object v2

    .line 1656
    :pswitch_5e
    new-instance v2, Lpd/h;

    .line 1657
    .line 1658
    iget v1, v1, Lgf/a;->l:I

    .line 1659
    .line 1660
    invoke-direct {v2, v1}, Lpd/h;-><init>(I)V

    .line 1661
    .line 1662
    .line 1663
    return-object v2

    .line 1664
    :pswitch_5f
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1665
    .line 1666
    sget-object v3, Lqd/j;->i:Lqd/g;

    .line 1667
    .line 1668
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v1

    .line 1672
    return-object v1

    .line 1673
    :pswitch_60
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1674
    .line 1675
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 1676
    .line 1677
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v1

    .line 1681
    return-object v1

    .line 1682
    :pswitch_61
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1683
    .line 1684
    sget-object v3, Lqd/j;->h:Lqd/g;

    .line 1685
    .line 1686
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v1

    .line 1690
    return-object v1

    .line 1691
    :pswitch_62
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1692
    .line 1693
    sget-object v3, Lqd/j;->i:Lqd/g;

    .line 1694
    .line 1695
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v1

    .line 1699
    return-object v1

    .line 1700
    :pswitch_63
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1701
    .line 1702
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 1703
    .line 1704
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v1

    .line 1708
    return-object v1

    .line 1709
    :pswitch_64
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1710
    .line 1711
    sget-object v3, Lqd/j;->g:Lqd/g;

    .line 1712
    .line 1713
    invoke-static {v1, v2, v3}, Lp4/t;->o(Lgf/a;Lqd/j;Lqd/j;)Lpd/j;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v1

    .line 1717
    return-object v1

    .line 1718
    :pswitch_65
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 1719
    .line 1720
    const/4 v3, 0x4

    .line 1721
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v1

    .line 1725
    return-object v1

    .line 1726
    :pswitch_66
    const/4 v3, 0x4

    .line 1727
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1728
    .line 1729
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    return-object v1

    .line 1734
    :pswitch_67
    const/4 v3, 0x4

    .line 1735
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 1736
    .line 1737
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v1

    .line 1741
    return-object v1

    .line 1742
    :pswitch_68
    const/4 v3, 0x4

    .line 1743
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1744
    .line 1745
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    return-object v1

    .line 1750
    :pswitch_69
    const/4 v3, 0x4

    .line 1751
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1752
    .line 1753
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v1

    .line 1757
    return-object v1

    .line 1758
    :pswitch_6a
    sget-object v2, Lqd/j;->E:Lqd/h;

    .line 1759
    .line 1760
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 1761
    .line 1762
    iget-wide v3, v1, Lgf/a;->k:J

    .line 1763
    .line 1764
    invoke-static {v3, v4, v2}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v2

    .line 1768
    iget-object v3, v2, Lqd/l;->i:Lqd/j;

    .line 1769
    .line 1770
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1771
    .line 1772
    aget v1, v1, v12

    .line 1773
    .line 1774
    new-instance v4, Lqd/r;

    .line 1775
    .line 1776
    invoke-direct {v4, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1777
    .line 1778
    .line 1779
    invoke-static {v7, v4, v2}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    return-object v1

    .line 1784
    :pswitch_6b
    new-instance v2, Lpd/d;

    .line 1785
    .line 1786
    iget v3, v1, Lgf/a;->m:I

    .line 1787
    .line 1788
    invoke-virtual {v5, v3}, Lac/k;->v(I)Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v3

    .line 1792
    invoke-direct {v2, v3}, Lpd/d;-><init>(Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    sget-object v3, Lqd/j;->m:Lqd/e;

    .line 1796
    .line 1797
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 1798
    .line 1799
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1800
    .line 1801
    aget v1, v1, v12

    .line 1802
    .line 1803
    new-instance v4, Lqd/r;

    .line 1804
    .line 1805
    invoke-direct {v4, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v2, v4}, Lud/p;->d0(Lqd/r;)V

    .line 1809
    .line 1810
    .line 1811
    return-object v2

    .line 1812
    :pswitch_6c
    invoke-virtual {v1}, Lgf/a;->b()Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v2

    .line 1816
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v2

    .line 1820
    new-instance v3, Lpd/c;

    .line 1821
    .line 1822
    invoke-direct {v3, v2}, Lpd/c;-><init>(Lqd/j;)V

    .line 1823
    .line 1824
    .line 1825
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v2

    .line 1829
    new-instance v4, Lqd/b;

    .line 1830
    .line 1831
    const-string v5, "java.lang.Class"

    .line 1832
    .line 1833
    invoke-static {v5}, Lxe/s;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v5

    .line 1837
    invoke-direct {v4, v5, v2}, Lqd/b;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 1838
    .line 1839
    .line 1840
    sget-object v2, Lqd/l;->k:Lmh/b;

    .line 1841
    .line 1842
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1843
    .line 1844
    aget v1, v1, v12

    .line 1845
    .line 1846
    new-instance v2, Lqd/r;

    .line 1847
    .line 1848
    invoke-direct {v2, v1, v4}, Lqd/r;-><init>(ILqd/j;)V

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v3, v2}, Lud/p;->d0(Lqd/r;)V

    .line 1852
    .line 1853
    .line 1854
    return-object v3

    .line 1855
    :pswitch_6d
    sget-object v2, Lqd/j;->y:Lqd/h;

    .line 1856
    .line 1857
    sget-object v3, Lqd/l;->k:Lmh/b;

    .line 1858
    .line 1859
    iget-wide v3, v1, Lgf/a;->k:J

    .line 1860
    .line 1861
    invoke-static {v3, v4, v2}, Lqd/l;->S(JLqd/j;)Lqd/n;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v2

    .line 1865
    iget-object v3, v2, Lqd/l;->i:Lqd/j;

    .line 1866
    .line 1867
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1868
    .line 1869
    aget v1, v1, v12

    .line 1870
    .line 1871
    new-instance v4, Lqd/r;

    .line 1872
    .line 1873
    invoke-direct {v4, v1, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1874
    .line 1875
    .line 1876
    invoke-static {v7, v4, v2}, Lp4/t;->z(Lpd/k;Lqd/r;Lqd/l;)Lud/p;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v1

    .line 1880
    return-object v1

    .line 1881
    :pswitch_6e
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 1882
    .line 1883
    invoke-static {v1, v15, v2}, Lp4/t;->p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v1

    .line 1887
    return-object v1

    .line 1888
    :pswitch_6f
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1889
    .line 1890
    invoke-static {v1, v15, v2}, Lp4/t;->p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v1

    .line 1894
    return-object v1

    .line 1895
    :pswitch_70
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1896
    .line 1897
    invoke-static {v1, v15, v2}, Lp4/t;->p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v1

    .line 1901
    return-object v1

    .line 1902
    :pswitch_71
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 1903
    .line 1904
    invoke-static {v1, v9, v2}, Lp4/t;->p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v1

    .line 1908
    return-object v1

    .line 1909
    :pswitch_72
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 1910
    .line 1911
    invoke-static {v1, v9, v2}, Lp4/t;->p(Lgf/a;Lpd/k;Lqd/j;)Lud/p;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v1

    .line 1915
    return-object v1

    .line 1916
    :pswitch_73
    invoke-virtual {v1}, Lgf/a;->b()Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v2

    .line 1920
    invoke-static {v2}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v2

    .line 1924
    new-instance v3, Lpd/j;

    .line 1925
    .line 1926
    sget-object v4, Lpd/k;->A:Lpd/k;

    .line 1927
    .line 1928
    invoke-direct {v3, v4, v2, v6}, Lpd/j;-><init>(Lpd/k;Ljava/lang/Object;I)V

    .line 1929
    .line 1930
    .line 1931
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 1932
    .line 1933
    iget-object v4, v1, Lgf/a;->i:[I

    .line 1934
    .line 1935
    aget v4, v4, v12

    .line 1936
    .line 1937
    new-instance v5, Lqd/r;

    .line 1938
    .line 1939
    invoke-direct {v5, v4, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1940
    .line 1941
    .line 1942
    invoke-virtual {v3, v5}, Lud/p;->d0(Lqd/r;)V

    .line 1943
    .line 1944
    .line 1945
    iget v2, v1, Lgf/a;->j:I

    .line 1946
    .line 1947
    const/4 v7, 0x2

    .line 1948
    if-ne v2, v7, :cond_f

    .line 1949
    .line 1950
    goto :goto_b

    .line 1951
    :cond_f
    move v6, v12

    .line 1952
    :goto_b
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 1953
    .line 1954
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1955
    .line 1956
    aget v1, v1, v6

    .line 1957
    .line 1958
    new-instance v4, Lqd/r;

    .line 1959
    .line 1960
    invoke-direct {v4, v1, v2}, Lqd/r;-><init>(ILqd/j;)V

    .line 1961
    .line 1962
    .line 1963
    invoke-virtual {v3, v4}, Lud/p;->I(Lqd/l;)V

    .line 1964
    .line 1965
    .line 1966
    return-object v3

    .line 1967
    :pswitch_74
    new-instance v2, Lud/p;

    .line 1968
    .line 1969
    sget-object v3, Lpd/k;->C:Lpd/k;

    .line 1970
    .line 1971
    invoke-direct {v2, v3, v6}, Lud/p;-><init>(Lpd/k;I)V

    .line 1972
    .line 1973
    .line 1974
    sget-object v3, Lqd/j;->b:Lqd/g;

    .line 1975
    .line 1976
    sget-object v4, Lqd/l;->k:Lmh/b;

    .line 1977
    .line 1978
    iget-object v4, v1, Lgf/a;->i:[I

    .line 1979
    .line 1980
    aget v4, v4, v12

    .line 1981
    .line 1982
    new-instance v5, Lqd/r;

    .line 1983
    .line 1984
    invoke-direct {v5, v4, v3}, Lqd/r;-><init>(ILqd/j;)V

    .line 1985
    .line 1986
    .line 1987
    invoke-virtual {v2, v5}, Lud/p;->d0(Lqd/r;)V

    .line 1988
    .line 1989
    .line 1990
    sget-object v3, Lqd/j;->u:Lqd/h;

    .line 1991
    .line 1992
    new-instance v4, Lqd/a;

    .line 1993
    .line 1994
    invoke-direct {v4, v3}, Lqd/a;-><init>(Lqd/j;)V

    .line 1995
    .line 1996
    .line 1997
    iget-object v1, v1, Lgf/a;->i:[I

    .line 1998
    .line 1999
    aget v1, v1, v6

    .line 2000
    .line 2001
    new-instance v3, Lqd/r;

    .line 2002
    .line 2003
    invoke-direct {v3, v1, v4}, Lqd/r;-><init>(ILqd/j;)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v2, v3}, Lud/p;->I(Lqd/l;)V

    .line 2007
    .line 2008
    .line 2009
    return-object v2

    .line 2010
    :pswitch_75
    sget-object v2, Lqd/j;->E:Lqd/h;

    .line 2011
    .line 2012
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v1

    .line 2016
    return-object v1

    .line 2017
    :pswitch_76
    sget-object v2, Lqd/j;->e:Lqd/g;

    .line 2018
    .line 2019
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v1

    .line 2023
    return-object v1

    .line 2024
    :pswitch_77
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 2025
    .line 2026
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v1

    .line 2030
    return-object v1

    .line 2031
    :pswitch_78
    sget-object v2, Lqd/j;->f:Lqd/g;

    .line 2032
    .line 2033
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v1

    .line 2037
    return-object v1

    .line 2038
    :pswitch_79
    sget-object v2, Lqd/j;->H:Lqd/h;

    .line 2039
    .line 2040
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v1

    .line 2044
    return-object v1

    .line 2045
    :pswitch_7a
    sget-object v2, Lqd/j;->d:Lqd/g;

    .line 2046
    .line 2047
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v1

    .line 2051
    return-object v1

    .line 2052
    :pswitch_7b
    sget-object v2, Lqd/j;->c:Lqd/g;

    .line 2053
    .line 2054
    invoke-static {v1, v2, v2}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v1

    .line 2058
    return-object v1

    .line 2059
    :pswitch_7c
    sget-object v2, Lqd/j;->F:Lqd/h;

    .line 2060
    .line 2061
    sget-object v3, Lqd/j;->B:Lqd/h;

    .line 2062
    .line 2063
    invoke-static {v1, v2, v3}, Lp4/t;->n(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2064
    .line 2065
    .line 2066
    move-result-object v1

    .line 2067
    return-object v1

    .line 2068
    :pswitch_7d
    sget-object v2, Lqd/j;->E:Lqd/h;

    .line 2069
    .line 2070
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v1

    .line 2074
    return-object v1

    .line 2075
    :pswitch_7e
    sget-object v2, Lqd/j;->e:Lqd/g;

    .line 2076
    .line 2077
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v1

    .line 2081
    return-object v1

    .line 2082
    :pswitch_7f
    sget-object v2, Lqd/j;->v:Lqd/h;

    .line 2083
    .line 2084
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v1

    .line 2088
    return-object v1

    .line 2089
    :pswitch_80
    sget-object v2, Lqd/j;->f:Lqd/g;

    .line 2090
    .line 2091
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v1

    .line 2095
    return-object v1

    .line 2096
    :pswitch_81
    sget-object v2, Lqd/j;->H:Lqd/h;

    .line 2097
    .line 2098
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v1

    .line 2102
    return-object v1

    .line 2103
    :pswitch_82
    sget-object v2, Lqd/j;->d:Lqd/g;

    .line 2104
    .line 2105
    sget-object v3, Lqd/j;->A:Lqd/h;

    .line 2106
    .line 2107
    invoke-static {v1, v2, v3}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v1

    .line 2111
    return-object v1

    .line 2112
    :pswitch_83
    sget-object v2, Lqd/j;->c:Lqd/g;

    .line 2113
    .line 2114
    invoke-static {v1, v2, v2}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v1

    .line 2118
    return-object v1

    .line 2119
    :pswitch_84
    sget-object v2, Lqd/j;->F:Lqd/h;

    .line 2120
    .line 2121
    sget-object v3, Lqd/j;->B:Lqd/h;

    .line 2122
    .line 2123
    invoke-static {v1, v2, v3}, Lp4/t;->m(Lgf/a;Lqd/j;Lqd/j;)Lud/p;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v1

    .line 2127
    return-object v1

    .line 2128
    :pswitch_85
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 2129
    .line 2130
    const/4 v3, 0x6

    .line 2131
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v1

    .line 2135
    return-object v1

    .line 2136
    :pswitch_86
    const/4 v3, 0x6

    .line 2137
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 2138
    .line 2139
    invoke-static {v1, v3, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v1

    .line 2143
    return-object v1

    .line 2144
    :pswitch_87
    const/4 v3, 0x6

    .line 2145
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 2146
    .line 2147
    invoke-static {v1, v3, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v1

    .line 2151
    return-object v1

    .line 2152
    :pswitch_88
    sget-object v2, Lqd/j;->i:Lqd/g;

    .line 2153
    .line 2154
    invoke-static {v1, v6, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v1

    .line 2158
    return-object v1

    .line 2159
    :pswitch_89
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 2160
    .line 2161
    invoke-static {v1, v6, v2}, Lp4/t;->l(Lgf/a;ILqd/j;)Lpd/a;

    .line 2162
    .line 2163
    .line 2164
    move-result-object v1

    .line 2165
    return-object v1

    .line 2166
    :pswitch_8a
    sget-object v2, Lqd/j;->b:Lqd/g;

    .line 2167
    .line 2168
    invoke-static {v1, v6, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v1

    .line 2172
    return-object v1

    .line 2173
    :pswitch_8b
    sget-object v2, Lqd/j;->g:Lqd/g;

    .line 2174
    .line 2175
    invoke-static {v1, v6, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v1

    .line 2179
    return-object v1

    .line 2180
    :pswitch_8c
    sget-object v2, Lqd/j;->h:Lqd/g;

    .line 2181
    .line 2182
    invoke-static {v1, v6, v2}, Lp4/t;->k(Lgf/a;ILqd/j;)Lpd/a;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v1

    .line 2186
    return-object v1

    .line 2187
    :pswitch_8d
    new-instance v1, Lud/p;

    .line 2188
    .line 2189
    sget-object v2, Lpd/k;->Q:Lpd/k;

    .line 2190
    .line 2191
    invoke-direct {v1, v2, v12}, Lud/p;-><init>(Lpd/k;I)V

    .line 2192
    .line 2193
    .line 2194
    return-object v1

    .line 2195
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8d
        :pswitch_8c
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
        :pswitch_84
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
        :pswitch_77
        :pswitch_76
        :pswitch_75
        :pswitch_0
        :pswitch_74
        :pswitch_0
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_0
        :pswitch_5d
        :pswitch_5d
        :pswitch_5c
        :pswitch_5c
        :pswitch_5b
        :pswitch_5b
        :pswitch_5a
        :pswitch_5a
        :pswitch_59
        :pswitch_59
        :pswitch_58
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_0
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public t()V
    .locals 6

    .line 1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj0/b;

    .line 4
    .line 5
    iget-object v1, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    iget v2, v0, Lj0/b;->i:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    sget-object v4, Lx1/o1;->h:Lx1/o1;

    .line 11
    .line 12
    invoke-static {v1, v3, v2, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 13
    .line 14
    .line 15
    iget v1, v0, Lj0/b;->i:I

    .line 16
    .line 17
    iget-object v2, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, [Lx1/f0;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    array-length v4, v2

    .line 24
    if-ge v4, v1, :cond_1

    .line 25
    .line 26
    :cond_0
    const/16 v2, 0x10

    .line 27
    .line 28
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    new-array v2, v2, [Lx1/f0;

    .line 33
    .line 34
    :cond_1
    const/4 v4, 0x0

    .line 35
    iput-object v4, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 36
    .line 37
    :goto_0
    if-ge v3, v1, :cond_2

    .line 38
    .line 39
    iget-object v5, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 40
    .line 41
    aget-object v5, v5, v3

    .line 42
    .line 43
    aput-object v5, v2, v3

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v0}, Lj0/b;->g()V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    :goto_1
    const/4 v0, -0x1

    .line 54
    if-ge v0, v1, :cond_4

    .line 55
    .line 56
    aget-object v0, v2, v1

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-boolean v3, v0, Lx1/f0;->U:Z

    .line 62
    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    invoke-static {v0}, Lp4/t;->u(Lx1/f0;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    aput-object v4, v2, v1

    .line 69
    .line 70
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    iput-object v2, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 74
    .line 75
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lp4/t;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lqd/j;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, ", bounds="

    .line 28
    .line 29
    const-string v3, "}"

    .line 30
    .line 31
    const-string v4, "TypeInfo{type="

    .line 32
    .line 33
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :pswitch_1
    iget-object v0, p0, Lp4/t;->h:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/Map;

    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, ", localVars="

    .line 55
    .line 56
    const-string v3, "}"

    .line 57
    .line 58
    const-string v4, "DebugInfo{lines="

    .line 59
    .line 60
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v1, Landroid/content/SharedPreferences;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return p1

    .line 13
    :catchall_0
    :cond_0
    return v0
.end method

.method public x()Lv1/n0;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/j1;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lv1/n0;

    .line 10
    .line 11
    return-object v0
.end method

.method public y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lp4/t;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :catchall_0
    :cond_0
    return-object p2
.end method
