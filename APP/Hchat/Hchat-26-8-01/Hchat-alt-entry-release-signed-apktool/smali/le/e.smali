.class public final Lle/e;
.super Lr9/e0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic j:Lud/j;

.field public final synthetic k:Lze/c;

.field public final synthetic l:Lxd/d;


# direct methods
.method public constructor <init>(Lud/j;Lze/c;Lxd/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lle/e;->j:Lud/j;

    .line 5
    .line 6
    iput-object p2, p0, Lle/e;->k:Lze/c;

    .line 7
    .line 8
    iput-object p3, p0, Lle/e;->l:Lxd/d;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Lud/r;Lud/n;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lle/e;->j:Lud/j;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lbe/h;->F(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lud/j;

    .line 15
    .line 16
    instance-of v0, p1, Lud/a;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p1, Lud/a;

    .line 21
    .line 22
    iget-object p1, p1, Lud/a;->n:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lud/a;

    .line 39
    .line 40
    iget-object v1, p0, Lle/e;->k:Lze/c;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lze/c;->b(Lud/a;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    :goto_0
    move-object p1, p2

    .line 49
    check-cast p1, Lmd/e;

    .line 50
    .line 51
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 52
    .line 53
    sget-object v0, Lmd/a;->U:Lmd/a;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    invoke-static {p2, p2}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    invoke-interface {p2}, Lud/n;->u()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, Lud/p;

    .line 72
    .line 73
    sget-object v0, Lpd/k;->T:Lpd/k;

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-direct {p2, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Lmd/a;->m:Lmd/a;

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Lmd/e;->w(Lmd/a;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lnd/e0;

    .line 85
    .line 86
    iget-object v1, p0, Lle/e;->l:Lxd/d;

    .line 87
    .line 88
    invoke-direct {v0, v1}, Lnd/e0;-><init>(Lxd/d;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v0}, Lmd/e;->y(Loc/b;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, Lud/o;

    .line 95
    .line 96
    invoke-direct {v0, p2}, Lud/o;-><init>(Lud/p;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_2
    return-void
.end method
