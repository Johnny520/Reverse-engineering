.class public final Lqg/w0;
.super Lqg/u0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Lqg/y0;

.field public final l:Lqg/x0;

.field public final m:Lqg/k;

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqg/y0;Lqg/x0;Lqg/k;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvg/i;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqg/w0;->k:Lqg/y0;

    .line 5
    .line 6
    iput-object p2, p0, Lqg/w0;->l:Lqg/x0;

    .line 7
    .line 8
    iput-object p3, p0, Lqg/w0;->m:Lqg/k;

    .line 9
    .line 10
    iput-object p4, p0, Lqg/w0;->n:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final k()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object p1, p0, Lqg/w0;->m:Lqg/k;

    .line 2
    .line 3
    invoke-static {p1}, Lqg/y0;->Q(Lvg/i;)Lqg/k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lqg/w0;->k:Lqg/y0;

    .line 8
    .line 9
    iget-object v2, p0, Lqg/w0;->l:Lqg/x0;

    .line 10
    .line 11
    iget-object v3, p0, Lqg/w0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0, v3}, Lqg/y0;->Z(Lqg/x0;Lqg/k;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v2, Lqg/x0;->g:Lqg/a1;

    .line 23
    .line 24
    new-instance v4, Lvg/h;

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v4, v5}, Lvg/h;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, Lvg/i;->e(Lvg/i;I)Z

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lqg/y0;->Q(Lvg/i;)Lqg/k;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1, v3}, Lqg/y0;->Z(Lqg/x0;Lqg/k;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {v1, v2, v3}, Lqg/y0;->E(Lqg/x0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Lqg/y0;->r(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
