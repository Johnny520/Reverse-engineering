.class public final synthetic Ls/u0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ls/w0;


# direct methods
.method public synthetic constructor <init>(Ls/w0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls/u0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ls/u0;->h:Ls/w0;

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
    iget v0, p0, Ls/u0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls/u0;->h:Ls/w0;

    .line 7
    .line 8
    iget-object v1, v0, Ls/w0;->v:Lr/f;

    .line 9
    .line 10
    iget-object v1, v1, Lr/f;->b:Lr/z;

    .line 11
    .line 12
    invoke-virtual {v1}, Lr/z;->j()Lr/p;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v2, v2, Lr/p;->o:Lm/p1;

    .line 17
    .line 18
    sget-object v3, Lm/p1;->g:Lm/p1;

    .line 19
    .line 20
    if-ne v2, v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1}, Lr/z;->j()Lr/p;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lr/p;->b()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    const-wide v3, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v1, v3

    .line 36
    :goto_0
    long-to-int v1, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v1}, Lr/z;->j()Lr/p;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lr/p;->b()J

    .line 43
    .line 44
    .line 45
    move-result-wide v1

    .line 46
    const/16 v3, 0x20

    .line 47
    .line 48
    shr-long/2addr v1, v3

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    iget-object v0, v0, Ls/w0;->v:Lr/f;

    .line 51
    .line 52
    iget-object v0, v0, Lr/f;->b:Lr/z;

    .line 53
    .line 54
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget v2, v2, Lr/p;->l:I

    .line 59
    .line 60
    neg-int v2, v2

    .line 61
    invoke-virtual {v0}, Lr/z;->j()Lr/p;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget v0, v0, Lr/p;->p:I

    .line 66
    .line 67
    add-int/2addr v2, v0

    .line 68
    sub-int/2addr v1, v2

    .line 69
    int-to-float v0, v1

    .line 70
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :pswitch_0
    iget-object v0, p0, Ls/u0;->h:Ls/w0;

    .line 76
    .line 77
    iget-object v0, v0, Ls/w0;->v:Lr/f;

    .line 78
    .line 79
    iget-object v0, v0, Lr/f;->b:Lr/z;

    .line 80
    .line 81
    invoke-virtual {v0}, Lr/z;->h()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v0}, Lr/z;->i()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    invoke-virtual {v0}, Lr/z;->d()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    mul-int/lit16 v1, v1, 0x1f4

    .line 96
    .line 97
    add-int/2addr v1, v2

    .line 98
    int-to-float v0, v1

    .line 99
    const/16 v1, 0x64

    .line 100
    .line 101
    int-to-float v1, v1

    .line 102
    add-float/2addr v0, v1

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    mul-int/lit16 v1, v1, 0x1f4

    .line 105
    .line 106
    add-int/2addr v1, v2

    .line 107
    int-to-float v0, v1

    .line 108
    :goto_2
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_1
    iget-object v0, p0, Ls/u0;->h:Ls/w0;

    .line 114
    .line 115
    iget-object v0, v0, Ls/w0;->v:Lr/f;

    .line 116
    .line 117
    iget-object v0, v0, Lr/f;->b:Lr/z;

    .line 118
    .line 119
    invoke-virtual {v0}, Lr/z;->h()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {v0}, Lr/z;->i()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    mul-int/lit16 v1, v1, 0x1f4

    .line 128
    .line 129
    add-int/2addr v1, v0

    .line 130
    int-to-float v0, v1

    .line 131
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
