.class public final Lh/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/e1;


# instance fields
.field public final a:Li/k1;

.field public final b:Li0/j1;

.field public final c:Lf/k0;


# direct methods
.method public constructor <init>(Li/k1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh/t;->a:Li/k1;

    .line 5
    .line 6
    new-instance p1, Lu2/l;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lh/t;->b:Li0/j1;

    .line 18
    .line 19
    sget-object p1, Lf/r0;->a:[J

    .line 20
    .line 21
    new-instance p1, Lf/k0;

    .line 22
    .line 23
    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lh/t;->c:Lf/k0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/t;->a:Li/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/k1;->f()Li/e1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li/e1;->b()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/t;->a:Li/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/k1;->f()Li/e1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Li/e1;->c()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
