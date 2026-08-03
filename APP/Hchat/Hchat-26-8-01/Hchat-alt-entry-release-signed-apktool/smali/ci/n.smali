.class public final synthetic Lci/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgg/t;

.field public final synthetic i:Lci/p;


# direct methods
.method public synthetic constructor <init>(Lgg/t;Lci/p;I)V
    .locals 0

    .line 1
    iput p3, p0, Lci/n;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/n;->h:Lgg/t;

    .line 4
    .line 5
    iput-object p2, p0, Lci/n;->i:Lci/p;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lci/n;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lci/n;->i:Lci/p;

    .line 7
    .line 8
    iget-object v1, v0, Lci/p;->i:Lci/p0;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object p1, p0, Lci/n;->h:Lgg/t;

    .line 17
    .line 18
    iget-wide v4, p1, Lgg/t;->g:J

    .line 19
    .line 20
    const-wide/16 v6, -0x1

    .line 21
    .line 22
    cmp-long v6, v4, v6

    .line 23
    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iput-wide v2, p1, Lgg/t;->g:J

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sub-long v4, v2, v4

    .line 31
    .line 32
    long-to-float v4, v4

    .line 33
    const v5, 0x4e6e6b28    # 1.0E9f

    .line 34
    .line 35
    .line 36
    div-float/2addr v4, v5

    .line 37
    iput-wide v2, p1, Lgg/t;->g:J

    .line 38
    .line 39
    invoke-virtual {v1, v4}, Lci/p0;->b(F)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget-wide v1, v1, Lci/p0;->c:D

    .line 44
    .line 45
    double-to-float v1, v1

    .line 46
    invoke-virtual {v0, v1}, Lci/p;->h(F)V

    .line 47
    .line 48
    .line 49
    iget v1, v0, Lci/p;->b:F

    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iget v2, v0, Lci/p;->b:F

    .line 56
    .line 57
    iget v3, v0, Lci/p;->f:F

    .line 58
    .line 59
    invoke-static {v2, v3}, Lci/k0;->b(FF)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    mul-float/2addr v2, v1

    .line 64
    iput v2, v0, Lci/p;->e:F

    .line 65
    .line 66
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :pswitch_0
    iget-object v0, p0, Lci/n;->i:Lci/p;

    .line 72
    .line 73
    iget-object v1, v0, Lci/p;->h:Lci/p0;

    .line 74
    .line 75
    check-cast p1, Ljava/lang/Long;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    iget-object p1, p0, Lci/n;->h:Lgg/t;

    .line 82
    .line 83
    iget-wide v4, p1, Lgg/t;->g:J

    .line 84
    .line 85
    const-wide/16 v6, -0x1

    .line 86
    .line 87
    cmp-long v6, v4, v6

    .line 88
    .line 89
    if-nez v6, :cond_1

    .line 90
    .line 91
    iput-wide v2, p1, Lgg/t;->g:J

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    sub-long v4, v2, v4

    .line 96
    .line 97
    long-to-float v4, v4

    .line 98
    const v5, 0x4e6e6b28    # 1.0E9f

    .line 99
    .line 100
    .line 101
    div-float/2addr v4, v5

    .line 102
    iput-wide v2, p1, Lgg/t;->g:J

    .line 103
    .line 104
    invoke-virtual {v1, v4}, Lci/p0;->b(F)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget-wide v1, v1, Lci/p0;->c:D

    .line 109
    .line 110
    double-to-float v1, v1

    .line 111
    invoke-virtual {v0, v1}, Lci/p;->g(F)V

    .line 112
    .line 113
    .line 114
    iget v1, v0, Lci/p;->a:F

    .line 115
    .line 116
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iget v2, v0, Lci/p;->a:F

    .line 121
    .line 122
    iget v3, v0, Lci/p;->g:F

    .line 123
    .line 124
    invoke-static {v2, v3}, Lci/k0;->b(FF)F

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    mul-float/2addr v2, v1

    .line 129
    iput v2, v0, Lci/p;->d:F

    .line 130
    .line 131
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
