.class public final synthetic Lip1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:F

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:Lxk1;

.field public final synthetic l:Lxk1;


# direct methods
.method public synthetic constructor <init>(FFFLxk1;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lip1;->h:F

    .line 5
    .line 6
    iput p2, p0, Lip1;->i:F

    .line 7
    .line 8
    iput p3, p0, Lip1;->j:F

    .line 9
    .line 10
    iput-object p4, p0, Lip1;->k:Lxk1;

    .line 11
    .line 12
    iput-object p5, p0, Lip1;->l:Lxk1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lca2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lip1;->h:F

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lca2;->k(F)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lca2;->l(F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lip1;->k:Lxk1;

    .line 15
    .line 16
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lh11;

    .line 21
    .line 22
    iget-wide v1, v1, Lh11;->a:J

    .line 23
    .line 24
    const/16 v3, 0x20

    .line 25
    .line 26
    shr-long/2addr v1, v3

    .line 27
    long-to-int v1, v1

    .line 28
    if-lez v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lh11;

    .line 35
    .line 36
    iget-wide v1, v1, Lh11;->a:J

    .line 37
    .line 38
    const-wide v4, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v1, v4

    .line 44
    long-to-int v1, v1

    .line 45
    if-lez v1, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Lip1;->l:Lxk1;

    .line 48
    .line 49
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lrs1;

    .line 54
    .line 55
    iget-wide v6, v2, Lrs1;->a:J

    .line 56
    .line 57
    shr-long/2addr v6, v3

    .line 58
    long-to-int v2, v6

    .line 59
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Lh11;

    .line 68
    .line 69
    iget-wide v6, v6, Lh11;->a:J

    .line 70
    .line 71
    shr-long/2addr v6, v3

    .line 72
    long-to-int v3, v6

    .line 73
    int-to-float v3, v3

    .line 74
    div-float/2addr v2, v3

    .line 75
    invoke-interface {v1}, Lgu2;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lrs1;

    .line 80
    .line 81
    iget-wide v6, v1, Lrs1;->a:J

    .line 82
    .line 83
    and-long/2addr v6, v4

    .line 84
    long-to-int v1, v6

    .line 85
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-interface {v0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lh11;

    .line 94
    .line 95
    iget-wide v6, v0, Lh11;->a:J

    .line 96
    .line 97
    and-long v3, v6, v4

    .line 98
    .line 99
    long-to-int v0, v3

    .line 100
    int-to-float v0, v0

    .line 101
    div-float/2addr v1, v0

    .line 102
    invoke-static {v2, v1}, Lrb3;->a(FF)J

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    invoke-virtual {p1, v0, v1}, Lca2;->r(J)V

    .line 107
    .line 108
    .line 109
    :cond_0
    iget-object v0, p1, Lca2;->x:Le70;

    .line 110
    .line 111
    invoke-interface {v0}, Le70;->b()F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    const/high16 v1, 0x41800000    # 16.0f

    .line 116
    .line 117
    mul-float/2addr v0, v1

    .line 118
    invoke-virtual {p1, v0}, Lca2;->f(F)V

    .line 119
    .line 120
    .line 121
    iget v0, p0, Lip1;->i:F

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lca2;->h(F)V

    .line 124
    .line 125
    .line 126
    iget p0, p0, Lip1;->j:F

    .line 127
    .line 128
    invoke-virtual {p1, p0}, Lca2;->i(F)V

    .line 129
    .line 130
    .line 131
    sget-object p0, La83;->a:La83;

    .line 132
    .line 133
    return-object p0
.end method
