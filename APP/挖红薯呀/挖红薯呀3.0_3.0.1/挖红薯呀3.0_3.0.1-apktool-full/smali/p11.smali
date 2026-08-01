.class public abstract Lp11;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final a(JLo31;Lpi;)Lw31;
    .locals 10

    .line 1
    invoke-static {p0, p1}, Lff;->f(J)Lof;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3, v0}, Lpi;->f(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p3}, Lpi;->L()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lii;->a:Lr3;

    .line 16
    .line 17
    if-ne v1, v0, :cond_1

    .line 18
    .line 19
    :cond_0
    invoke-static {p0, p1}, Lff;->f(J)Lof;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lp3;->j:Lp3;

    .line 24
    .line 25
    new-instance v2, Ls2;

    .line 26
    .line 27
    const/4 v3, 0x6

    .line 28
    invoke-direct {v2, v3, v0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lq91;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Lq91;-><init>(Lsw;Lsw;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3, v0}, Lpi;->g0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v1, v0

    .line 40
    :cond_1
    move-object v3, v1

    .line 41
    check-cast v3, Lq91;

    .line 42
    .line 43
    new-instance v2, Lff;

    .line 44
    .line 45
    invoke-direct {v2, p0, p1}, Lff;-><init>(J)V

    .line 46
    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/16 v9, 0x8

    .line 50
    .line 51
    const/4 v5, 0x0

    .line 52
    const-string v6, "ColorAnimation"

    .line 53
    .line 54
    move-object v4, p2

    .line 55
    move-object v7, p3

    .line 56
    invoke-static/range {v2 .. v9}, Lf7;->b(Ljava/lang/Object;Lq91;Lv7;Ljava/lang/Float;Ljava/lang/String;Lji;II)Lw31;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
