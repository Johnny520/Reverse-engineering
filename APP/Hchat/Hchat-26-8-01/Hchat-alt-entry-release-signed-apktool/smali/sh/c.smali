.class public abstract Lsh/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:Lp/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x3a

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lsh/c;->a:F

    .line 5
    .line 6
    const/16 v0, 0x28

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, Lsh/c;->b:F

    .line 10
    .line 11
    const/16 v0, 0x10

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    sput v0, Lsh/c;->c:F

    .line 15
    .line 16
    const/16 v1, 0xd

    .line 17
    .line 18
    int-to-float v1, v1

    .line 19
    new-instance v2, Lp/z0;

    .line 20
    .line 21
    invoke-direct {v2, v0, v1, v0, v1}, Lp/z0;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lsh/c;->d:Lp/z0;

    .line 25
    .line 26
    return-void
.end method

.method public static a(Li0/h0;)Lsh/q1;
    .locals 11

    .line 1
    sget-object v0, Lbi/d;->a:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lbi/b;

    .line 8
    .line 9
    invoke-virtual {v1}, Lbi/b;->j()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbi/b;

    .line 18
    .line 19
    iget-object v1, v1, Lbi/b;->k:Li0/j1;

    .line 20
    .line 21
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lf1/w;

    .line 26
    .line 27
    iget-wide v5, v1, Lf1/w;->a:J

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lbi/b;

    .line 34
    .line 35
    invoke-virtual {v1}, Lbi/b;->e()J

    .line 36
    .line 37
    .line 38
    move-result-wide v7

    .line 39
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lbi/b;

    .line 44
    .line 45
    iget-object v0, v0, Lbi/b;->l:Li0/j1;

    .line 46
    .line 47
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lf1/w;

    .line 52
    .line 53
    iget-wide v9, v0, Lf1/w;->a:J

    .line 54
    .line 55
    invoke-virtual {p0, v3, v4}, Li0/h0;->e(J)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {p0, v5, v6}, Li0/h0;->e(J)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    or-int/2addr v0, v1

    .line 64
    invoke-virtual {p0, v7, v8}, Li0/h0;->e(J)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    or-int/2addr v0, v1

    .line 69
    invoke-virtual {p0, v9, v10}, Li0/h0;->e(J)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    or-int/2addr v0, v1

    .line 74
    invoke-virtual {p0}, Li0/h0;->P()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v0, :cond_0

    .line 79
    .line 80
    sget-object v0, Li0/l;->a:Li0/e;

    .line 81
    .line 82
    if-ne v1, v0, :cond_1

    .line 83
    .line 84
    :cond_0
    new-instance v2, Lsh/q1;

    .line 85
    .line 86
    invoke-direct/range {v2 .. v10}, Lsh/q1;-><init>(JJJJ)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v1, v2

    .line 93
    :cond_1
    check-cast v1, Lsh/q1;

    .line 94
    .line 95
    return-object v1
.end method
