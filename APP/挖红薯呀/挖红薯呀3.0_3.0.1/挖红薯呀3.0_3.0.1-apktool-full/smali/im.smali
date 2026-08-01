.class public final Lim;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lim;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lim;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lim;->a:Lim;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lpi0;Lji;I)V
    .locals 12

    .line 1
    move-object v9, p2

    .line 2
    check-cast v9, Lpi;

    .line 3
    .line 4
    const p2, 0x34946814

    .line 5
    .line 6
    .line 7
    invoke-virtual {v9, p2}, Lpi;->X(I)Lpi;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v0, 0x2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v0

    .line 20
    :goto_0
    or-int/2addr p2, p3

    .line 21
    and-int/lit8 v1, p2, 0x3

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x1

    .line 25
    if-eq v1, v0, :cond_1

    .line 26
    .line 27
    move v0, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v0, v2

    .line 30
    :goto_1
    and-int/2addr p2, v3

    .line 31
    invoke-virtual {v9, p2, v0}, Lpi;->O(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    move p2, v2

    .line 38
    iget-wide v2, p1, Lpi0;->b:J

    .line 39
    .line 40
    iget-wide v4, p1, Lpi0;->c:J

    .line 41
    .line 42
    iget v6, p1, Lpi0;->d:F

    .line 43
    .line 44
    iget-object v0, p1, Lpi0;->a:Lpe0;

    .line 45
    .line 46
    new-instance v1, Lhm;

    .line 47
    .line 48
    invoke-direct {v1, p2, p1}, Lhm;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const p2, 0x76b04459

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v1, v9}, Lkl;->w(ILex;Lji;)Lmh;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    const/high16 v10, 0xc00000

    .line 59
    .line 60
    const/16 v11, 0x62

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    invoke-static/range {v0 .. v11}, Lh51;->a(Lpe0;Lx01;JJFFLmh;Lji;II)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    invoke-virtual {v9}, Lpi;->R()V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-virtual {v9}, Lpi;->r()Lht0;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    new-instance v0, Led;

    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    invoke-direct {v0, p3, v1, p0, p1}, Led;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p2, Lht0;->d:Lww;

    .line 84
    .line 85
    :cond_3
    return-void
.end method
