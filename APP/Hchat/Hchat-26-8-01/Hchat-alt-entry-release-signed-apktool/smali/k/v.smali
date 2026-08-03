.class public final Lk/v;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lk/y0;

.field public final synthetic h:Z

.field public final synthetic i:Lf2/i;

.field public final synthetic j:Lfg/a;


# direct methods
.method public constructor <init>(Lk/y0;ZLf2/i;Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk/v;->g:Lk/y0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lk/v;->h:Z

    .line 7
    .line 8
    iput-object p3, p0, Lk/v;->i:Lf2/i;

    .line 9
    .line 10
    iput-object p4, p0, Lk/v;->j:Lfg/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ly0/o;

    .line 2
    .line 3
    check-cast p2, Li0/h0;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p1, -0x5af0b3b9

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, Li0/h0;->a0(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p3, Li0/l;->a:Li0/e;

    .line 21
    .line 22
    if-ne p1, p3, :cond_0

    .line 23
    .line 24
    new-instance p1, Ln/k;

    .line 25
    .line 26
    invoke-direct {p1}, Ln/k;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    move-object v1, p1

    .line 33
    check-cast v1, Ln/k;

    .line 34
    .line 35
    sget-object p1, Ly0/l;->a:Ly0/l;

    .line 36
    .line 37
    iget-object p3, p0, Lk/v;->g:Lk/y0;

    .line 38
    .line 39
    invoke-static {p1, v1, p3}, Lk/v0;->a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    new-instance v0, Lk/u;

    .line 44
    .line 45
    iget-object v6, p0, Lk/v;->i:Lf2/i;

    .line 46
    .line 47
    iget-object v7, p0, Lk/v;->j:Lfg/a;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    iget-boolean v4, p0, Lk/v;->h:Z

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-direct/range {v0 .. v7}, Lk/u;-><init>(Ln/k;Lk/y0;ZZLjava/lang/String;Lf2/i;Lfg/a;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 p3, 0x0

    .line 62
    invoke-virtual {p2, p3}, Li0/h0;->p(Z)V

    .line 63
    .line 64
    .line 65
    return-object p1
.end method
