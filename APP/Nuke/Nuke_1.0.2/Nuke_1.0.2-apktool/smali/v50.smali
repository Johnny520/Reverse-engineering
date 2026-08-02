.class public final Lv50;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:I

.field public b:Li81;

.field public c:Z

.field public d:I

.field public e:F


# direct methods
.method public static a(Lx81;Z)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lx81;->k:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {p0}, Ldu;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ly81;

    .line 10
    .line 11
    iget p0, p0, Ly81;->a:I

    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x1

    .line 14
    .line 15
    return p0

    .line 16
    :cond_0
    iget-object p0, p0, Lx81;->k:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ly81;

    .line 23
    .line 24
    iget p0, p0, Ly81;->a:I

    .line 25
    .line 26
    add-int/lit8 p0, p0, -0x1

    .line 27
    .line 28
    return p0
.end method
