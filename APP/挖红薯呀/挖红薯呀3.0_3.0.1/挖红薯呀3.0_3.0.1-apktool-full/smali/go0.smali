.class public final synthetic Lgo0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Llo0;


# direct methods
.method public synthetic constructor <init>(Llo0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgo0;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lgo0;->e:Llo0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lgo0;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Lgo0;->e:Llo0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Llo0;->n()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object v0, p0, Llo0;->s:Ldp0;

    .line 18
    .line 19
    iget-object v1, p0, Llo0;->k:Lnm;

    .line 20
    .line 21
    invoke-virtual {v1}, Lnm;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v2, p0, Llo0;->d:Lco0;

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    iget-object v0, v2, Lco0;->b:Ldp0;

    .line 30
    .line 31
    invoke-virtual {v0}, Ldp0;->g()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v0}, Ldp0;->g()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-eq v1, v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ldp0;->g()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p0}, Llo0;->l()F

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, Llo0;->q:Lym;

    .line 57
    .line 58
    sget-object v3, Loo0;->a:Lno0;

    .line 59
    .line 60
    const/high16 v3, 0x42600000    # 56.0f

    .line 61
    .line 62
    invoke-interface {v1, v3}, Lym;->p(F)F

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {p0}, Llo0;->o()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    int-to-float v3, v3

    .line 71
    const/high16 v4, 0x40000000    # 2.0f

    .line 72
    .line 73
    div-float/2addr v3, v4

    .line 74
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {p0}, Llo0;->o()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    int-to-float v3, v3

    .line 83
    div-float/2addr v1, v3

    .line 84
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    cmpl-float v0, v0, v1

    .line 89
    .line 90
    if-ltz v0, :cond_3

    .line 91
    .line 92
    iget-object v0, p0, Llo0;->G:Lgp0;

    .line 93
    .line 94
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget v1, p0, Llo0;->e:I

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    add-int/lit8 v0, v1, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move v0, v1

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    iget-object v0, v2, Lco0;->b:Ldp0;

    .line 114
    .line 115
    invoke-virtual {v0}, Ldp0;->g()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    :goto_1
    invoke-virtual {p0, v0}, Llo0;->k(I)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    goto :goto_0

    .line 124
    :pswitch_1
    iget-object v0, p0, Llo0;->k:Lnm;

    .line 125
    .line 126
    invoke-virtual {v0}, Lnm;->b()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    iget-object p0, p0, Llo0;->t:Ldp0;

    .line 133
    .line 134
    invoke-virtual {p0}, Ldp0;->g()I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    iget-object p0, p0, Llo0;->d:Lco0;

    .line 140
    .line 141
    iget-object p0, p0, Lco0;->b:Ldp0;

    .line 142
    .line 143
    invoke-virtual {p0}, Ldp0;->g()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    :goto_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
