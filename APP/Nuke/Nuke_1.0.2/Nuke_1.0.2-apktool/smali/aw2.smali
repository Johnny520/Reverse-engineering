.class public final Law2;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lr12;
.implements Lpk0;
.implements Lil0;


# instance fields
.field public x:Lxm0;

.field public y:Z

.field public final z:Lzw2;


# direct methods
.method public constructor <init>(Lxm0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lu60;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Law2;->x:Lxm0;

    .line 5
    .line 6
    new-instance p1, Lr8;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0, p0}, Lr8;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lvw2;->a:Lh12;

    .line 13
    .line 14
    new-instance v0, Lzw2;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, p1}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lu60;->M0(Lt60;)Lt60;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Law2;->z:Lzw2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final J(Lh12;Li12;J)V
    .locals 0

    .line 1
    iget-object p0, p0, Law2;->z:Lzw2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lzw2;->J(Lh12;Li12;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z(Lkl0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lkl0;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput-boolean p1, p0, Law2;->y:Z

    .line 6
    .line 7
    return-void
.end method

.method public final m0()V
    .locals 0

    .line 1
    iget-object p0, p0, Law2;->z:Lzw2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzw2;->m0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s()J
    .locals 4

    .line 1
    sget-object v0, Lqp0;->q:Ldb0;

    .line 2
    .line 3
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lr61;->F:Le70;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v0, Lx23;->b:I

    .line 13
    .line 14
    const/high16 v0, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-interface {p0, v0}, Le70;->T(F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/high16 v2, 0x42200000    # 40.0f

    .line 21
    .line 22
    invoke-interface {p0, v2}, Le70;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-interface {p0, v0}, Le70;->T(F)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v2}, Le70;->T(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {v1, v3, v0, p0}, Ljx2;->e(IIII)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0
.end method
