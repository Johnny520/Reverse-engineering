.class public final Lg0/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static h:Lg0/b;


# instance fields
.field public final a:Lu2/m;

.field public final b:Li2/n0;

.field public final c:Lu2/d;

.field public final d:Lm2/d;

.field public final e:Li2/n0;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Lu2/m;Li2/n0;Lu2/d;Lm2/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/b;->a:Lu2/m;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/b;->b:Li2/n0;

    .line 7
    .line 8
    iput-object p3, p0, Lg0/b;->c:Lu2/d;

    .line 9
    .line 10
    iput-object p4, p0, Lg0/b;->d:Lm2/d;

    .line 11
    .line 12
    invoke-static {p2, p1}, Li2/e0;->h(Li2/n0;Lu2/m;)Li2/n0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lg0/b;->e:Li2/n0;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Lg0/b;->f:F

    .line 21
    .line 22
    iput p1, p0, Lg0/b;->g:F

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(IJ)J
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lg0/b;->g:F

    .line 6
    .line 7
    iget v3, v0, Lg0/b;->f:F

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    :cond_0
    sget-object v6, Lg0/c;->a:Ljava/lang/String;

    .line 23
    .line 24
    const/16 v2, 0xf

    .line 25
    .line 26
    invoke-static {v5, v5, v5, v5, v2}, Lu2/b;->b(IIIII)J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    const/4 v12, 0x1

    .line 31
    const/16 v13, 0x60

    .line 32
    .line 33
    iget-object v7, v0, Lg0/b;->e:Li2/n0;

    .line 34
    .line 35
    iget-object v10, v0, Lg0/b;->c:Lu2/d;

    .line 36
    .line 37
    iget-object v11, v0, Lg0/b;->d:Lm2/d;

    .line 38
    .line 39
    invoke-static/range {v6 .. v13}, Li2/e0;->a(Ljava/lang/String;Li2/n0;JLu2/c;Lm2/d;II)Li2/a;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    move-object/from16 v18, v10

    .line 44
    .line 45
    invoke-virtual {v3}, Li2/a;->b()F

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    sget-object v14, Lg0/c;->b:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v5, v5, v5, v5, v2}, Lu2/b;->b(IIIII)J

    .line 52
    .line 53
    .line 54
    move-result-wide v16

    .line 55
    const/16 v20, 0x2

    .line 56
    .line 57
    const/16 v21, 0x60

    .line 58
    .line 59
    iget-object v15, v0, Lg0/b;->e:Li2/n0;

    .line 60
    .line 61
    iget-object v2, v0, Lg0/b;->d:Lm2/d;

    .line 62
    .line 63
    move-object/from16 v19, v2

    .line 64
    .line 65
    invoke-static/range {v14 .. v21}, Li2/e0;->a(Ljava/lang/String;Li2/n0;JLu2/c;Lm2/d;II)Li2/a;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Li2/a;->b()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    sub-float/2addr v2, v3

    .line 74
    iput v3, v0, Lg0/b;->g:F

    .line 75
    .line 76
    iput v2, v0, Lg0/b;->f:F

    .line 77
    .line 78
    move/from16 v22, v3

    .line 79
    .line 80
    move v3, v2

    .line 81
    move/from16 v2, v22

    .line 82
    .line 83
    :cond_1
    const/4 v4, 0x1

    .line 84
    if-eq v1, v4, :cond_3

    .line 85
    .line 86
    sub-int/2addr v1, v4

    .line 87
    int-to-float v1, v1

    .line 88
    mul-float/2addr v3, v1

    .line 89
    add-float/2addr v3, v2

    .line 90
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-gez v1, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move v5, v1

    .line 98
    :goto_0
    invoke-static/range {p2 .. p3}, Lu2/a;->g(J)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-le v5, v1, :cond_4

    .line 103
    .line 104
    move v5, v1

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-static/range {p2 .. p3}, Lu2/a;->i(J)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    :cond_4
    :goto_1
    invoke-static/range {p2 .. p3}, Lu2/a;->g(J)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    invoke-static/range {p2 .. p3}, Lu2/a;->j(J)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-static/range {p2 .. p3}, Lu2/a;->h(J)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-static {v2, v3, v5, v1}, Lu2/b;->a(IIII)J

    .line 123
    .line 124
    .line 125
    move-result-wide v1

    .line 126
    return-wide v1
.end method
