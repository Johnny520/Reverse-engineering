.class public final Lql;
.super Lu60;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon2;


# instance fields
.field public A:Leq2;

.field public final B:Lpo;

.field public x:Lml;

.field public y:F

.field public z:Lft2;


# direct methods
.method public constructor <init>(FLft2;Leq2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu60;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lql;->y:F

    .line 5
    .line 6
    iput-object p2, p0, Lql;->z:Lft2;

    .line 7
    .line 8
    iput-object p3, p0, Lql;->A:Leq2;

    .line 9
    .line 10
    new-instance p1, Lv;

    .line 11
    .line 12
    const/4 p2, 0x6

    .line 13
    invoke-direct {p1, p2, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lpo;

    .line 17
    .line 18
    new-instance p3, Lqo;

    .line 19
    .line 20
    invoke-direct {p3}, Lqo;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p2, p3, p1}, Lpo;-><init>(Lqo;Lin0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lu60;->M0(Lt60;)Lt60;

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, Lql;->B:Lpo;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final l0(Lzn2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lql;->A:Leq2;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lxn2;->c(Lzn2;Leq2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
