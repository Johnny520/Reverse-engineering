.class public abstract Lm31;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sput v0, Lm31;->a:F

    .line 6
    .line 7
    return-void
.end method

.method public static final a(Lji;)Lml;
    .locals 3

    .line 1
    sget-object v0, Ldj;->h:Lg41;

    .line 2
    .line 3
    check-cast p0, Lpi;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lym;

    .line 10
    .line 11
    invoke-interface {v0}, Lym;->b()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p0, v1}, Lpi;->c(F)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0}, Lpi;->L()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lii;->a:Lr3;

    .line 26
    .line 27
    if-ne v2, v1, :cond_1

    .line 28
    .line 29
    :cond_0
    new-instance v1, Lx1;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lx1;-><init>(Lym;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lml;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Lml;-><init>(Lx1;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    check-cast v2, Lml;

    .line 43
    .line 44
    return-object v2
.end method
