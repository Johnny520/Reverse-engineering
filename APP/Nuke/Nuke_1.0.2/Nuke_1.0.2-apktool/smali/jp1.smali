.class public final synthetic Ljp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lbs0;

.field public final synthetic j:I

.field public final synthetic k:Lin0;

.field public final synthetic l:Lxk1;

.field public final synthetic m:Lxk1;

.field public final synthetic n:Lxk1;

.field public final synthetic o:Lxk1;


# direct methods
.method public synthetic constructor <init>(ZLbs0;ILin0;Lxk1;Lxk1;Lxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Ljp1;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Ljp1;->i:Lbs0;

    .line 7
    .line 8
    iput p3, p0, Ljp1;->j:I

    .line 9
    .line 10
    iput-object p4, p0, Ljp1;->k:Lin0;

    .line 11
    .line 12
    iput-object p5, p0, Ljp1;->l:Lxk1;

    .line 13
    .line 14
    iput-object p6, p0, Ljp1;->m:Lxk1;

    .line 15
    .line 16
    iput-object p7, p0, Ljp1;->n:Lxk1;

    .line 17
    .line 18
    iput-object p8, p0, Ljp1;->o:Lxk1;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-boolean v0, p0, Ljp1;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ljp1;->i:Lbs0;

    .line 6
    .line 7
    check-cast v0, Lb02;

    .line 8
    .line 9
    iget v1, p0, Ljp1;->j:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lb02;->a(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ljp1;->l:Lxk1;

    .line 15
    .line 16
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Ljp1;->m:Lxk1;

    .line 29
    .line 30
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lrs1;

    .line 35
    .line 36
    iget-wide v1, v1, Lrs1;->a:J

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v1, p0, Ljp1;->n:Lxk1;

    .line 40
    .line 41
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lh11;

    .line 46
    .line 47
    iget-wide v2, v2, Lh11;->a:J

    .line 48
    .line 49
    const/16 v4, 0x20

    .line 50
    .line 51
    shr-long/2addr v2, v4

    .line 52
    long-to-int v2, v2

    .line 53
    int-to-float v2, v2

    .line 54
    const/high16 v3, 0x40000000    # 2.0f

    .line 55
    .line 56
    div-float/2addr v2, v3

    .line 57
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lh11;

    .line 62
    .line 63
    iget-wide v5, v1, Lh11;->a:J

    .line 64
    .line 65
    const-wide v7, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v5, v7

    .line 71
    long-to-int v1, v5

    .line 72
    int-to-float v1, v1

    .line 73
    div-float/2addr v1, v3

    .line 74
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-long v2, v2

    .line 79
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    int-to-long v5, v1

    .line 84
    shl-long v1, v2, v4

    .line 85
    .line 86
    and-long v3, v5, v7

    .line 87
    .line 88
    or-long/2addr v1, v3

    .line 89
    :goto_0
    iget-object v3, p0, Ljp1;->o:Lxk1;

    .line 90
    .line 91
    invoke-interface {v3}, Lgu2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lc61;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-interface {v3}, Lc61;->w()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_2

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const/4 v3, 0x0

    .line 107
    :goto_1
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-interface {v3, v1, v2}, Lc61;->M(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    const-wide/16 v1, 0x0

    .line 115
    .line 116
    :goto_2
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-interface {v0, v3}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lrs1;

    .line 122
    .line 123
    invoke-direct {v0, v1, v2}, Lrs1;-><init>(J)V

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, Ljp1;->k:Lin0;

    .line 127
    .line 128
    invoke-interface {p0, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object p0, La83;->a:La83;

    .line 132
    .line 133
    return-object p0
.end method
