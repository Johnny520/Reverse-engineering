.class public final Li/d1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li/m1;

.field public final b:Li0/j1;

.field public final synthetic c:Li/k1;


# direct methods
.method public constructor <init>(Li/k1;Li/m1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/d1;->c:Li/k1;

    .line 5
    .line 6
    iput-object p2, p0, Li/d1;->a:Li/m1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Li/d1;->b:Li0/j1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Lfg/l;Lfg/l;)Li/c1;
    .locals 8

    .line 1
    iget-object v0, p0, Li/d1;->b:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Li/c1;

    .line 8
    .line 9
    iget-object v2, p0, Li/d1;->c:Li/k1;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Li/c1;

    .line 14
    .line 15
    new-instance v3, Li/g1;

    .line 16
    .line 17
    invoke-virtual {v2}, Li/k1;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {p2, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v2}, Li/k1;->c()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {p2, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Li/d1;->a:Li/m1;

    .line 34
    .line 35
    iget-object v7, v6, Li/m1;->a:Lfg/l;

    .line 36
    .line 37
    invoke-interface {v7, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Li/q;

    .line 42
    .line 43
    invoke-virtual {v5}, Li/q;->d()V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v2, v4, v5, v6}, Li/g1;-><init>(Li/k1;Ljava/lang/Object;Li/q;Li/m1;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, p0, v3, p1, p2}, Li/c1;-><init>(Li/d1;Li/g1;Lfg/l;Lfg/l;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, v2, Li/k1;->i:Lw0/p;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lw0/p;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    check-cast p2, Lgg/m;

    .line 61
    .line 62
    iput-object p2, v1, Li/c1;->i:Lgg/m;

    .line 63
    .line 64
    iput-object p1, v1, Li/c1;->h:Lfg/l;

    .line 65
    .line 66
    invoke-virtual {v2}, Li/k1;->f()Li/e1;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v1, p1}, Li/c1;->a(Li/e1;)V

    .line 71
    .line 72
    .line 73
    return-object v1
.end method
