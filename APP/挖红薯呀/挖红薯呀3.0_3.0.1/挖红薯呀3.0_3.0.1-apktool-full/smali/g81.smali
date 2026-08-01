.class public final synthetic Lg81;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:F

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lva1;FLsw;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lg81;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg81;->f:Ljava/lang/Object;

    iput p2, p0, Lg81;->e:F

    iput-object p3, p0, Lg81;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lxq0;Li81;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lg81;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lg81;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lg81;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lg81;->e:F

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lg81;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object v2, p0, Lg81;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget v3, p0, Lg81;->e:F

    .line 8
    .line 9
    iget-object p0, p0, Lg81;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lva1;

    .line 15
    .line 16
    check-cast v2, Lsw;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Long;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    iget-wide v6, p0, Lva1;->b:J

    .line 25
    .line 26
    const-wide/high16 v8, -0x8000000000000000L

    .line 27
    .line 28
    cmp-long p1, v6, v8

    .line 29
    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iput-wide v4, p0, Lva1;->b:J

    .line 33
    .line 34
    :cond_0
    new-instance v9, Lx7;

    .line 35
    .line 36
    iget p1, p0, Lva1;->e:F

    .line 37
    .line 38
    invoke-direct {v9, p1}, Lx7;-><init>(F)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    cmpg-float v0, v3, v0

    .line 43
    .line 44
    sget-object v10, Lva1;->f:Lx7;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lva1;->a:Lmb1;

    .line 49
    .line 50
    new-instance v3, Lx7;

    .line 51
    .line 52
    invoke-direct {v3, p1}, Lx7;-><init>(F)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lva1;->c:Lx7;

    .line 56
    .line 57
    invoke-interface {v0, v3, v10, p1}, Lmb1;->b(Lb8;Lb8;Lb8;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    :goto_0
    move-wide v7, v6

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-wide v6, p0, Lva1;->b:J

    .line 64
    .line 65
    sub-long v6, v4, v6

    .line 66
    .line 67
    long-to-float p1, v6

    .line 68
    div-float/2addr p1, v3

    .line 69
    float-to-double v6, p1

    .line 70
    invoke-static {v6, v7}, Lrd0;->R(D)J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    goto :goto_0

    .line 75
    :goto_1
    iget-object v6, p0, Lva1;->a:Lmb1;

    .line 76
    .line 77
    iget-object v11, p0, Lva1;->c:Lx7;

    .line 78
    .line 79
    invoke-interface/range {v6 .. v11}, Lmb1;->h(JLb8;Lb8;Lb8;)Lb8;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lx7;

    .line 84
    .line 85
    iget p1, p1, Lx7;->a:F

    .line 86
    .line 87
    iget-object v6, p0, Lva1;->a:Lmb1;

    .line 88
    .line 89
    iget-object v11, p0, Lva1;->c:Lx7;

    .line 90
    .line 91
    invoke-interface/range {v6 .. v11}, Lmb1;->e(JLb8;Lb8;Lb8;)Lb8;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lx7;

    .line 96
    .line 97
    iput-object v0, p0, Lva1;->c:Lx7;

    .line 98
    .line 99
    iput-wide v4, p0, Lva1;->b:J

    .line 100
    .line 101
    iget v0, p0, Lva1;->e:F

    .line 102
    .line 103
    sub-float/2addr v0, p1

    .line 104
    iput p1, p0, Lva1;->e:F

    .line 105
    .line 106
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {v2, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    return-object v1

    .line 114
    :pswitch_0
    check-cast p0, Lxq0;

    .line 115
    .line 116
    check-cast v2, Li81;

    .line 117
    .line 118
    check-cast p1, Lwq0;

    .line 119
    .line 120
    iget-object v0, v2, Li81;->v:Lb7;

    .line 121
    .line 122
    if-eqz v0, :cond_2

    .line 123
    .line 124
    invoke-virtual {v0}, Lb7;->d()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/Number;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    float-to-int v0, v0

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    float-to-int v0, v3

    .line 137
    :goto_2
    const/4 v2, 0x0

    .line 138
    invoke-static {p1, p0, v0, v2}, Lwq0;->k(Lwq0;Lxq0;II)V

    .line 139
    .line 140
    .line 141
    return-object v1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
