.class public Lhd2;
.super Lp2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ll20;


# instance fields
.field public final k:Lt00;


# direct methods
.method public constructor <init>(Lt00;La20;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lp2;-><init>(La20;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lhd2;->k:Lt00;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final S()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final d()Ll20;
    .locals 1

    .line 1
    iget-object p0, p0, Lhd2;->k:Lt00;

    .line 2
    .line 3
    instance-of v0, p0, Ll20;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ll20;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public j0()V
    .locals 0

    .line 1
    return-void
.end method

.method public x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhd2;->k:Lt00;

    .line 2
    .line 3
    invoke-static {p0}, Lgf1;->z(Lt00;)Lt00;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lfg1;->L(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Lp40;->Q(Lt00;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public y(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhd2;->k:Lt00;

    .line 2
    .line 3
    invoke-static {p1}, Lfg1;->L(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lt00;->h(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
