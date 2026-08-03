.class public abstract Lh/y0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Li/r0;


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
    invoke-static {v2, v2, v0, v1}, Li/d;->o(FFLjava/lang/Object;I)Li/r0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lh/y0;->a:Li/r0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(JLi/y;Li0/h0;II)Li0/l2;
    .locals 8

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Lh/y0;->a:Li/r0;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p5, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p2, "ColorAnimation"

    .line 13
    .line 14
    :goto_0
    move-object v4, p2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const-string p2, "PressFeedback"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    invoke-static {p0, p1}, Lf1/w;->f(J)Lg1/c;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p3, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    if-nez p2, :cond_2

    .line 32
    .line 33
    sget-object p2, Li0/l;->a:Li0/e;

    .line 34
    .line 35
    if-ne p5, p2, :cond_3

    .line 36
    .line 37
    :cond_2
    invoke-static {p0, p1}, Lf1/w;->f(J)Lg1/c;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    sget-object p5, Lh/c;->j:Lh/c;

    .line 42
    .line 43
    new-instance v0, Lb1/f;

    .line 44
    .line 45
    const/16 v1, 0xc

    .line 46
    .line 47
    invoke-direct {v0, p2, v1}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Li/m1;

    .line 51
    .line 52
    invoke-direct {p2, p5, v0}, Li/m1;-><init>(Lfg/l;Lfg/l;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    move-object p5, p2

    .line 59
    :cond_3
    move-object v1, p5

    .line 60
    check-cast v1, Li/m1;

    .line 61
    .line 62
    new-instance v0, Lf1/w;

    .line 63
    .line 64
    invoke-direct {v0, p0, p1}, Lf1/w;-><init>(J)V

    .line 65
    .line 66
    .line 67
    and-int/lit8 p0, p4, 0xe

    .line 68
    .line 69
    shl-int/lit8 p1, p4, 0x3

    .line 70
    .line 71
    and-int/lit16 p1, p1, 0x380

    .line 72
    .line 73
    or-int/2addr p0, p1

    .line 74
    shl-int/lit8 p1, p4, 0x6

    .line 75
    .line 76
    const p2, 0xe000

    .line 77
    .line 78
    .line 79
    and-int/2addr p2, p1

    .line 80
    or-int/2addr p0, p2

    .line 81
    const/high16 p2, 0x70000

    .line 82
    .line 83
    and-int/2addr p1, p2

    .line 84
    or-int v6, p0, p1

    .line 85
    .line 86
    const/16 v7, 0x8

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    move-object v5, p3

    .line 90
    invoke-static/range {v0 .. v7}, Li/f;->b(Ljava/lang/Object;Li/m1;Li/k;Ljava/lang/Float;Ljava/lang/String;Li0/h0;II)Li0/l2;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method
