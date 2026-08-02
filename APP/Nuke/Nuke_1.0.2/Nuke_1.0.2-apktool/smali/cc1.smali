.class public abstract Lcc1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lmy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln31;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Ln31;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lmy;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lmy;-><init>(Lxm0;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lcc1;->a:Lmy;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Lpx;)Lgm1;
    .locals 5

    .line 1
    check-cast p0, Lgo0;

    .line 2
    .line 3
    sget-object v0, Lcc1;->a:Lmy;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lgm1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    const v0, 0x38ac9bd8

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lgo0;->W(I)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lr7;->f:Ltu2;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :goto_0
    const/4 v2, 0x0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const v3, 0x79080081

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    instance-of v4, v3, Lgm1;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    check-cast v3, Lgm1;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move-object v3, v2

    .line 49
    :goto_1
    if-eqz v3, :cond_1

    .line 50
    .line 51
    move-object v2, v3

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-static {v0}, Lpb3;->b(Landroid/view/View;)Landroid/view/ViewParent;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v3, v0, Landroid/view/View;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    check-cast v0, Landroid/view/View;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :goto_2
    invoke-virtual {p0, v1}, Lgo0;->p(Z)V

    .line 67
    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_4
    const v2, 0x38ac9437

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2}, Lgo0;->W(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lgo0;->p(Z)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method
