.class public final Lk/s;
.super Lx1/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/z1;


# instance fields
.field public final A:Lc1/c;

.field public w:Lk/p;

.field public x:F

.field public y:Lf1/t0;

.field public z:Lv/d;


# direct methods
.method public constructor <init>(FLf1/t0;Lv/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx1/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lk/s;->x:F

    .line 5
    .line 6
    iput-object p2, p0, Lk/s;->y:Lf1/t0;

    .line 7
    .line 8
    iput-object p3, p0, Lk/s;->z:Lv/d;

    .line 9
    .line 10
    new-instance p1, Lb0/d0;

    .line 11
    .line 12
    const/16 p2, 0x17

    .line 13
    .line 14
    invoke-direct {p1, p0, p2}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lc1/c;

    .line 18
    .line 19
    new-instance p3, Lc1/d;

    .line 20
    .line 21
    invoke-direct {p3}, Lc1/d;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, p3, p1}, Lc1/c;-><init>(Lc1/d;Lfg/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Lx1/j;->k1(Lx1/i;)Lx1/i;

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lk/s;->A:Lc1/c;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final X0(Lf2/y;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/s;->z:Lv/d;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lf2/w;->d(Lf2/y;Lf1/r0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
