.class public final Lzd/a;
.super Lg4/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/p;

.field public final b:Lud/p;


# direct methods
.method public constructor <init>(Lqd/l;Lqd/r;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lud/p;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    sget-object v2, Lpd/k;->Y:Lpd/k;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lzd/a;->a:Lud/p;

    .line 13
    .line 14
    sget-object v1, Lmd/a;->q:Lmd/a;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lmd/e;->w(Lmd/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lqd/r;->c0()Lqd/r;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {v0, p2}, Lud/p;->d0(Lqd/r;)V

    .line 24
    .line 25
    .line 26
    new-instance p2, Lud/p;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {p2, v2, v3}, Lud/p;-><init>(Lpd/k;I)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lzd/a;->b:Lud/p;

    .line 33
    .line 34
    invoke-virtual {p2, v1}, Lmd/e;->w(Lmd/a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lqd/l;->H()Lqd/l;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p2, p1}, Lud/p;->I(Lqd/l;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v0, Lud/p;->l:Lqd/r;

    .line 45
    .line 46
    iget-object p1, p1, Lqd/r;->m:Lqd/s;

    .line 47
    .line 48
    invoke-virtual {p1}, Lqd/s;->b()Lqd/k;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-boolean v3, p1, Lqd/k;->f:Z

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final P(Lzd/c;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lzd/c;->m:Lnd/t;

    .line 2
    .line 3
    iget-object v1, v0, Lnd/t;->b:Lud/a;

    .line 4
    .line 5
    iget-object v0, v0, Lnd/t;->a:Lud/a;

    .line 6
    .line 7
    iget-object v0, v0, Lud/a;->m:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v0, v1}, La/a;->N0(Ljava/util/List;Lud/a;)Lud/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, Lud/a;->l:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v1, p0, Lzd/a;->b:Lud/p;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p1, p1, Lzd/c;->o:Lud/a;

    .line 21
    .line 22
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iget-object v1, p0, Lzd/a;->a:Lud/p;

    .line 26
    .line 27
    invoke-virtual {p1, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
