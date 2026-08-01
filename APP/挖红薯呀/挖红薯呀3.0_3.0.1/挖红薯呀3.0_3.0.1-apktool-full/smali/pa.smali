.class public final synthetic Lpa;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lpf1;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:Lo30;


# direct methods
.method public synthetic constructor <init>(Lg31;JJLo30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpa;->d:Lpf1;

    .line 5
    .line 6
    iput-wide p2, p0, Lpa;->e:J

    .line 7
    .line 8
    iput-wide p4, p0, Lpa;->f:J

    .line 9
    .line 10
    iput-object p6, p0, Lpa;->g:Lo30;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Ld60;

    .line 6
    .line 7
    invoke-virtual {v1}, Ld60;->a()V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x68

    .line 11
    .line 12
    and-int/lit8 v3, v2, 0x2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide v3, v0, Lpa;->e:J

    .line 20
    .line 21
    :goto_0
    and-int/lit8 v5, v2, 0x4

    .line 22
    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    iget-object v5, v1, Ld60;->d:Ldd;

    .line 26
    .line 27
    invoke-interface {v5}, Luq;->c()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    invoke-static {v5, v6, v3, v4}, Luq;->j0(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-wide v5, v0, Lpa;->f:J

    .line 37
    .line 38
    :goto_1
    and-int/lit8 v7, v2, 0x8

    .line 39
    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    const/high16 v7, 0x3f800000    # 1.0f

    .line 43
    .line 44
    :goto_2
    move v11, v7

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const/4 v7, 0x0

    .line 47
    goto :goto_2

    .line 48
    :goto_3
    and-int/lit8 v2, v2, 0x10

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    sget-object v2, Lqt;->Q:Lqt;

    .line 53
    .line 54
    :goto_4
    move-object v10, v2

    .line 55
    goto :goto_5

    .line 56
    :cond_3
    iget-object v2, v0, Lpa;->g:Lo30;

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :goto_5
    iget-object v8, v1, Ld60;->d:Ldd;

    .line 60
    .line 61
    iget-object v1, v8, Ldd;->d:Lcd;

    .line 62
    .line 63
    iget-object v1, v1, Lcd;->c:Lbd;

    .line 64
    .line 65
    const/16 v2, 0x20

    .line 66
    .line 67
    shr-long v12, v3, v2

    .line 68
    .line 69
    long-to-int v7, v12

    .line 70
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    const-wide v12, 0xffffffffL

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    and-long/2addr v3, v12

    .line 80
    long-to-int v3, v3

    .line 81
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    move-wide/from16 v16, v12

    .line 90
    .line 91
    shr-long v12, v5, v2

    .line 92
    .line 93
    long-to-int v2, v12

    .line 94
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-float/2addr v2, v7

    .line 99
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    and-long v5, v5, v16

    .line 104
    .line 105
    long-to-int v5, v5

    .line 106
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    add-float v16, v5, v3

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v14, 0x1

    .line 114
    iget-object v9, v0, Lpa;->d:Lpf1;

    .line 115
    .line 116
    const/4 v13, 0x3

    .line 117
    invoke-virtual/range {v8 .. v14}, Ldd;->d(Lpf1;Lo30;FLja;II)Lw5;

    .line 118
    .line 119
    .line 120
    move-result-object v17

    .line 121
    move-object v12, v1

    .line 122
    move v14, v4

    .line 123
    move v13, v15

    .line 124
    move v15, v2

    .line 125
    invoke-interface/range {v12 .. v17}, Lbd;->m(FFFFLw5;)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lna1;->a:Lna1;

    .line 129
    .line 130
    return-object v0
.end method
