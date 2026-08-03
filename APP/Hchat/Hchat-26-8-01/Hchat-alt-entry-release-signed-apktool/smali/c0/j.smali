.class public final Lc0/j;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/h;
.implements Lx1/n;


# instance fields
.field public w:Lh0/u0;

.field public final x:Li0/j1;


# direct methods
.method public constructor <init>(Lh0/u0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/j;->w:Lh0/u0;

    .line 5
    .line 6
    sget-object p1, Li0/e;->j:Li0/e;

    .line 7
    .line 8
    new-instance v0, Li0/j1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, p1}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lc0/j;->x:Li0/j1;

    .line 15
    .line 16
    new-instance p1, Lc0/g;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-direct {p1, p0, v0}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Ls1/h0;->a:Ls1/k;

    .line 23
    .line 24
    new-instance v0, Ls1/l0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v1, v1, p1}, Ls1/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final w(Lx1/i1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/j;->x:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
