.class public abstract Ltf;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lvf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvf;

    .line 2
    .line 3
    sget-object v1, Ln2;->q:Lfa;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lvf;-><init>(Lfa;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ltf;->a:Lvf;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lfa;Lji;I)Lvf;
    .locals 4

    .line 1
    sget-object v0, Lrd0;->b:Lr3;

    .line 2
    .line 3
    sget-object v1, Ln2;->q:Lfa;

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lfa;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast p1, Lpi;

    .line 13
    .line 14
    const p0, -0x56396ed8

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lpi;->W(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v2}, Lpi;->p(Z)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Ltf;->a:Lvf;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    check-cast p1, Lpi;

    .line 27
    .line 28
    const v1, -0x56389c81

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v1}, Lpi;->W(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    and-int/lit8 v1, p2, 0x70

    .line 39
    .line 40
    xor-int/lit8 v1, v1, 0x30

    .line 41
    .line 42
    const/16 v3, 0x20

    .line 43
    .line 44
    if-le v1, v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_2

    .line 51
    .line 52
    :cond_1
    and-int/lit8 p2, p2, 0x30

    .line 53
    .line 54
    if-ne p2, v3, :cond_3

    .line 55
    .line 56
    :cond_2
    const/4 p2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    move p2, v2

    .line 59
    :goto_0
    or-int/2addr p2, v0

    .line 60
    invoke-virtual {p1}, Lpi;->L()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    sget-object p2, Lii;->a:Lr3;

    .line 67
    .line 68
    if-ne v0, p2, :cond_5

    .line 69
    .line 70
    :cond_4
    new-instance v0, Lvf;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lvf;-><init>(Lfa;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    check-cast v0, Lvf;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Lpi;->p(Z)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
