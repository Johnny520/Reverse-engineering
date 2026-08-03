.class public final Lci/j0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lk/y0;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Lk/y0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci/j0;->g:Lk/y0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lci/j0;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const p1, -0x71bb5877

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Li0/h0;->a0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    sget-object p3, Li0/l;->a:Li0/e;

    .line 24
    .line 25
    if-ne p1, p3, :cond_0

    .line 26
    .line 27
    new-instance p1, Ln/k;

    .line 28
    .line 29
    invoke-direct {p1}, Ln/k;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    check-cast p1, Ln/k;

    .line 36
    .line 37
    sget-object p3, Ly0/l;->a:Ly0/l;

    .line 38
    .line 39
    iget-object v0, p0, Lci/j0;->g:Lk/y0;

    .line 40
    .line 41
    invoke-static {p3, p1, v0}, Lk/v0;->a(Ly0/o;Ln/k;Lk/y0;)Ly0/o;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    new-instance v0, Lci/i0;

    .line 46
    .line 47
    iget-boolean v1, p0, Lci/j0;->h:Z

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v0, p1, v2, v1}, Lci/i0;-><init>(Ln/k;Lk/y0;Z)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p3, v0}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p3, 0x0

    .line 58
    invoke-virtual {p2, p3}, Li0/h0;->p(Z)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method
