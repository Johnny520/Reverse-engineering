.class public final Lt91;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final A:Lnx1;

.field public final B:Lnx1;

.field public a:Liz2;

.field public final b:Lb62;

.field public final c:Lbt2;

.field public final d:Lsz0;

.field public e:Lt03;

.field public final f:Lnx1;

.field public final g:Lnx1;

.field public h:Lc61;

.field public final i:Lnx1;

.field public j:Lsd;

.field public final k:Lnx1;

.field public final l:Lnx1;

.field public final m:Lnx1;

.field public final n:Lnx1;

.field public final o:Lnx1;

.field public p:Z

.field public final q:Lnx1;

.field public final r:Lb5;

.field public final s:Lnx1;

.field public final t:Lnx1;

.field public u:Lin0;

.field public final v:Ln10;

.field public final w:Ln10;

.field public final x:Ln10;

.field public final y:Lq9;

.field public z:J


# direct methods
.method public constructor <init>(Liz2;Lb62;Lbt2;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt91;->a:Liz2;

    .line 5
    .line 6
    iput-object p2, p0, Lt91;->b:Lb62;

    .line 7
    .line 8
    iput-object p3, p0, Lt91;->c:Lbt2;

    .line 9
    .line 10
    new-instance p1, Lsz0;

    .line 11
    .line 12
    const/16 p2, 0x10

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p1, p2, v0}, Lsz0;-><init>(IZ)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lk03;

    .line 19
    .line 20
    sget-object v0, Ltd;->a:Lsd;

    .line 21
    .line 22
    sget-wide v1, Lf13;->b:J

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-direct {p2, v0, v1, v2, v3}, Lk03;-><init>(Lsd;JLf13;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, p1, Lsz0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v4, Lsd0;

    .line 31
    .line 32
    iget-wide v5, p2, Lk03;->b:J

    .line 33
    .line 34
    invoke-direct {v4, v0, v5, v6}, Lsd0;-><init>(Lsd;J)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p1, Lsz0;->j:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p1, p0, Lt91;->d:Lsz0;

    .line 40
    .line 41
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, Lt91;->f:Lnx1;

    .line 48
    .line 49
    new-instance p2, Lza0;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {p2, v0}, Lza0;-><init>(F)V

    .line 53
    .line 54
    .line 55
    invoke-static {p2}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lt91;->g:Lnx1;

    .line 60
    .line 61
    invoke-static {v3}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, Lt91;->i:Lnx1;

    .line 66
    .line 67
    sget-object p2, Ltr0;->h:Ltr0;

    .line 68
    .line 69
    invoke-static {p2}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iput-object p2, p0, Lt91;->k:Lnx1;

    .line 74
    .line 75
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iput-object p2, p0, Lt91;->l:Lnx1;

    .line 80
    .line 81
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iput-object p2, p0, Lt91;->m:Lnx1;

    .line 86
    .line 87
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iput-object p2, p0, Lt91;->n:Lnx1;

    .line 92
    .line 93
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, Lt91;->o:Lnx1;

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    iput-boolean p2, p0, Lt91;->p:Z

    .line 101
    .line 102
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    invoke-static {v0}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, Lt91;->q:Lnx1;

    .line 109
    .line 110
    new-instance v0, Lb5;

    .line 111
    .line 112
    invoke-direct {v0, p3}, Lb5;-><init>(Lbt2;)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, Lt91;->r:Lb5;

    .line 116
    .line 117
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iput-object p3, p0, Lt91;->s:Lnx1;

    .line 122
    .line 123
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Lt91;->t:Lnx1;

    .line 128
    .line 129
    new-instance p1, Lnx0;

    .line 130
    .line 131
    const/16 p3, 0xf

    .line 132
    .line 133
    invoke-direct {p1, p3}, Lnx0;-><init>(I)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lt91;->u:Lin0;

    .line 137
    .line 138
    new-instance p1, Ln10;

    .line 139
    .line 140
    invoke-direct {p1, p0, p2}, Ln10;-><init>(Lt91;I)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lt91;->v:Ln10;

    .line 144
    .line 145
    new-instance p1, Ln10;

    .line 146
    .line 147
    const/4 p2, 0x2

    .line 148
    invoke-direct {p1, p0, p2}, Ln10;-><init>(Lt91;I)V

    .line 149
    .line 150
    .line 151
    iput-object p1, p0, Lt91;->w:Ln10;

    .line 152
    .line 153
    new-instance p1, Ln10;

    .line 154
    .line 155
    const/4 p2, 0x3

    .line 156
    invoke-direct {p1, p0, p2}, Ln10;-><init>(Lt91;I)V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lt91;->x:Ln10;

    .line 160
    .line 161
    invoke-static {}, Lpp0;->i()Lq9;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iput-object p1, p0, Lt91;->y:Lq9;

    .line 166
    .line 167
    sget-wide p1, Lju;->g:J

    .line 168
    .line 169
    iput-wide p1, p0, Lt91;->z:J

    .line 170
    .line 171
    new-instance p1, Lf13;

    .line 172
    .line 173
    invoke-direct {p1, v1, v2}, Lf13;-><init>(J)V

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iput-object p1, p0, Lt91;->A:Lnx1;

    .line 181
    .line 182
    new-instance p1, Lf13;

    .line 183
    .line 184
    invoke-direct {p1, v1, v2}, Lf13;-><init>(J)V

    .line 185
    .line 186
    .line 187
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iput-object p1, p0, Lt91;->B:Lnx1;

    .line 192
    .line 193
    return-void
.end method


# virtual methods
.method public final a()Ltr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lt91;->k:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ltr0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lt91;->f:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final c()Lc61;
    .locals 1

    .line 1
    iget-object p0, p0, Lt91;->h:Lc61;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lc61;->w()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final d()Lz03;
    .locals 0

    .line 1
    iget-object p0, p0, Lt91;->i:Lnx1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnx1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz03;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e(J)V
    .locals 1

    .line 1
    new-instance v0, Lf13;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lf13;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt91;->B:Lnx1;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(J)V
    .locals 1

    .line 1
    new-instance v0, Lf13;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lf13;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lt91;->A:Lnx1;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
