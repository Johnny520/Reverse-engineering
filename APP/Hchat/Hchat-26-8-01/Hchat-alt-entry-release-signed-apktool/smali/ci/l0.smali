.class public final Lci/l0;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/w1;
.implements Lx1/z1;
.implements Lx1/e2;


# static fields
.field public static final F:Lci/a;


# instance fields
.field public A:Lx1/i;

.field public B:Ln/m;

.field public C:Ln/k;

.field public D:Z

.field public final E:Lci/a;

.field public w:Ln/k;

.field public x:Lk/y0;

.field public y:Z

.field public z:Ls1/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lci/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lci/l0;->F:Lci/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ln/k;Lk/y0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lci/l0;->w:Ln/k;

    .line 5
    .line 6
    iput-object p2, p0, Lci/l0;->x:Lk/y0;

    .line 7
    .line 8
    iput-boolean p3, p0, Lci/l0;->y:Z

    .line 9
    .line 10
    iput-object p1, p0, Lci/l0;->C:Ln/k;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    iput-boolean p1, p0, Lci/l0;->D:Z

    .line 20
    .line 21
    sget-object p1, Lci/l0;->F:Lci/a;

    .line 22
    .line 23
    iput-object p1, p0, Lci/l0;->E:Lci/a;

    .line 24
    .line 25
    return-void
.end method

.method public static final n1(Lci/l0;Lqg/t;Lqg/r0;Lfg/p;)V
    .locals 2

    .line 1
    new-instance p0, Lci/h;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-direct {p0, p2, p3, v1, v0}, Lci/h;-><init>(Lqg/r0;Lfg/p;Lwf/c;I)V

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x3

    .line 9
    invoke-static {p1, v1, p0, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final F()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lci/l0;->E:Lci/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P(Ls1/k;Ls1/l;J)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x21

    .line 5
    .line 6
    shr-long v1, p3, v0

    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    shl-long/2addr v1, v3

    .line 11
    shl-long v4, p3, v3

    .line 12
    .line 13
    shr-long/2addr v4, v0

    .line 14
    const-wide v6, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v4, v6

    .line 20
    or-long v0, v1, v4

    .line 21
    .line 22
    shr-long v2, v0, v3

    .line 23
    .line 24
    long-to-int v2, v2

    .line 25
    int-to-float v2, v2

    .line 26
    and-long/2addr v0, v6

    .line 27
    long-to-int v0, v0

    .line 28
    int-to-float v0, v0

    .line 29
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lci/l0;->p1()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lci/l0;->z:Ls1/l0;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    new-instance v0, Lc0/g;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-direct {v0, p0, v1}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Ls1/h0;->a:Ls1/k;

    .line 49
    .line 50
    new-instance v1, Ls1/l0;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-direct {v1, v2, v2, v2, v0}, Ls1/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lci/l0;->z:Ls1/l0;

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, Lci/l0;->z:Ls1/l0;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3, p4}, Ls1/l0;->P(Ls1/k;Ls1/l;J)V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-object v0, p0, Lci/l0;->A:Lx1/i;

    .line 69
    .line 70
    instance-of v1, v0, Lx1/w1;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    check-cast v0, Lx1/w1;

    .line 75
    .line 76
    invoke-interface {v0, p1, p2, p3, p4}, Lx1/w1;->P(Ls1/k;Ls1/l;J)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public final S0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final X0(Lf2/y;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lci/l0;->y:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lf2/w;->a:[Lmg/d;

    .line 9
    .line 10
    sget-object v0, Lf2/u;->j:Lf2/x;

    .line 11
    .line 12
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final b0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lci/l0;->z:Ls1/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ls1/l0;->b0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lci/l0;->A:Lx1/i;

    .line 9
    .line 10
    instance-of v1, v0, Lx1/w1;

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    instance-of v1, v0, Lx1/w1;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast v0, Lx1/w1;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Lx1/w1;->b0()V

    .line 25
    .line 26
    .line 27
    :cond_2
    return-void
.end method

.method public final c1()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lci/l0;->D:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lci/l0;->p1()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lci/l0;->o1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lci/l0;->C:Ln/k;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lci/l0;->w:Ln/k;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lci/l0;->A:Lx1/i;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lx1/j;->l1(Lx1/i;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, Lci/l0;->A:Lx1/i;

    .line 19
    .line 20
    return-void
.end method

.method public final o1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lci/l0;->w:Ln/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lci/l0;->B:Ln/m;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ln/l;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ln/l;-><init>(Ln/m;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ln/k;->b(Ln/j;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lci/l0;->B:Ln/m;

    .line 19
    .line 20
    return-void
.end method

.method public final p1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lci/l0;->A:Lx1/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lci/l0;->x:Lk/y0;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lci/l0;->w:Ln/k;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Ln/k;

    .line 15
    .line 16
    invoke-direct {v1}, Ln/k;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lci/l0;->w:Ln/k;

    .line 20
    .line 21
    :cond_1
    iget-object v1, p0, Lci/l0;->w:Ln/k;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lk/y0;->a(Ln/k;)Lx1/i;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lci/l0;->A:Lx1/i;

    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void
.end method
