.class public final Le0/d;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/w1;
.implements Ld1/g;
.implements Ld1/x;


# instance fields
.field public w:Lfg/a;

.field public x:Z

.field public final y:Ls1/l0;


# direct methods
.method public constructor <init>(Lfg/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le0/d;->w:Lfg/a;

    .line 5
    .line 6
    new-instance p1, Lc0/g;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, p0, v0}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ls1/h0;->a:Ls1/k;

    .line 13
    .line 14
    new-instance v0, Ls1/l0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, v1, p1}, Ls1/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Le0/d;->y:Ls1/l0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final E(Ld1/z;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ld1/z;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Le0/d;->x:Z

    .line 6
    .line 7
    return-void
.end method

.method public final H()J
    .locals 5

    .line 1
    sget-object v0, Le0/b;->a:Lx1/l;

    .line 2
    .line 3
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lx1/f0;->E:Lu2/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v2, Lx1/c2;->b:I

    .line 13
    .line 14
    iget v2, v0, Lx1/l;->a:F

    .line 15
    .line 16
    invoke-interface {v1, v2}, Lu2/c;->G0(F)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget v3, v0, Lx1/l;->b:F

    .line 21
    .line 22
    invoke-interface {v1, v3}, Lu2/c;->G0(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget v4, v0, Lx1/l;->c:F

    .line 27
    .line 28
    invoke-interface {v1, v4}, Lu2/c;->G0(F)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    iget v0, v0, Lx1/l;->d:F

    .line 33
    .line 34
    invoke-interface {v1, v0}, Lu2/c;->G0(F)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v2, v3, v4, v0}, Lx1/d1;->h(IIII)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
.end method

.method public final P(Ls1/k;Ls1/l;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/d;->y:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ls1/l0;->P(Ls1/k;Ls1/l;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b0()V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/d;->y:Ls1/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls1/l0;->b0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
