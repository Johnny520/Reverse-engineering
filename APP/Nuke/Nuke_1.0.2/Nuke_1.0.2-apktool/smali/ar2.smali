.class public abstract Lar2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


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
    invoke-static {v2, v2, v0, v1}, Lup0;->G(FFLjava/lang/Object;I)Lqt2;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final a(JLm43;Ljava/lang/String;Lpx;)Lgu2;
    .locals 9

    .line 1
    invoke-static {p0, p1}, Lju;->f(J)Lsu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v6, p4

    .line 6
    check-cast v6, Lgo0;

    .line 7
    .line 8
    invoke-virtual {v6, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez p4, :cond_0

    .line 17
    .line 18
    sget-object p4, Lnx;->a:Leb;

    .line 19
    .line 20
    if-ne v0, p4, :cond_1

    .line 21
    .line 22
    :cond_0
    invoke-static {p0, p1}, Lju;->f(J)Lsu;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    sget-object v0, Lv6;->y:Lv6;

    .line 27
    .line 28
    new-instance v1, Lv5;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-direct {v1, v2, p4}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p4, Ln43;

    .line 35
    .line 36
    invoke-direct {p4, v0, v1}, Ln43;-><init>(Lin0;Lin0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, p4}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v0, p4

    .line 43
    :cond_1
    move-object v2, v0

    .line 44
    check-cast v2, Ln43;

    .line 45
    .line 46
    new-instance v1, Lju;

    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Lju;-><init>(J)V

    .line 49
    .line 50
    .line 51
    const/16 v7, 0x6180

    .line 52
    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    move-object v3, p2

    .line 57
    move-object v5, p3

    .line 58
    invoke-static/range {v1 .. v8}, Luc;->c(Ljava/lang/Object;Ln43;Lhd;Ljava/lang/Float;Ljava/lang/String;Lpx;II)Lgu2;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
