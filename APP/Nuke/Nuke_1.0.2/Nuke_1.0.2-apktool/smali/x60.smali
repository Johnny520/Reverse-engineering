.class public final Lx60;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lgy;
.implements Los1;


# instance fields
.field public final A:Lnu;

.field public B:Lua;

.field public final x:Lbk1;

.field public final y:Z

.field public final z:F


# direct methods
.method public constructor <init>(Lbk1;ZLnu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu60;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx60;->x:Lbk1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lx60;->y:Z

    .line 7
    .line 8
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    iput p1, p0, Lx60;->z:F

    .line 11
    .line 12
    iput-object p3, p0, Lx60;->A:Lnu;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 2

    .line 1
    new-instance v0, Lw60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lw60;-><init>(Lx60;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    new-instance v0, Lw60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lw60;-><init>(Lx60;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
