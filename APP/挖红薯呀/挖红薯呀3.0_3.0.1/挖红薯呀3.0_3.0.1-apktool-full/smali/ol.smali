.class public final Lol;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lol;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lol;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lol;->a:Lol;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ly2;Lji;I)V
    .locals 5

    .line 1
    check-cast p2, Lpi;

    .line 2
    .line 3
    const v0, 0x5d549e6c

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lpi;->X(I)Lpi;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, p3

    .line 20
    and-int/lit8 v2, v0, 0x3

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-eq v2, v1, :cond_1

    .line 24
    .line 25
    move v2, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    and-int/2addr v0, v3

    .line 29
    invoke-virtual {p2, v0, v2}, Lpi;->O(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p1, Ly2;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lhw;

    .line 38
    .line 39
    iget-object v2, p1, Ly2;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lxn;

    .line 42
    .line 43
    new-instance v4, Lhm;

    .line 44
    .line 45
    invoke-direct {v4, v3, p1}, Lhm;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const v3, 0x455a0383

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v4, p2}, Lkl;->w(ILex;Lji;)Lmh;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/16 v4, 0x180

    .line 56
    .line 57
    invoke-static {v0, v2, v3, p2, v4}, Li4;->e(Lhw;Lxn;Lmh;Lji;I)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p2}, Lpi;->R()V

    .line 62
    .line 63
    .line 64
    :goto_2
    invoke-virtual {p2}, Lpi;->r()Lht0;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    new-instance v0, Led;

    .line 71
    .line 72
    invoke-direct {v0, p3, v1, p0, p1}, Led;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p2, Lht0;->d:Lww;

    .line 76
    .line 77
    :cond_3
    return-void
.end method
