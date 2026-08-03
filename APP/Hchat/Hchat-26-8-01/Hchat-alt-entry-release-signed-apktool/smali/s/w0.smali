.class public final Ls/w0;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/z1;


# instance fields
.field public A:Ls/t0;

.field public u:Lfg/a;

.field public v:Lr/f;

.field public w:Lm/p1;

.field public x:Z

.field public y:Lf2/j;

.field public final z:Ls/t0;


# direct methods
.method public constructor <init>(Lfg/a;Lr/f;Lm/p1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly0/n;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls/w0;->u:Lfg/a;

    .line 5
    .line 6
    iput-object p2, p0, Ls/w0;->v:Lr/f;

    .line 7
    .line 8
    iput-object p3, p0, Ls/w0;->w:Lm/p1;

    .line 9
    .line 10
    iput-boolean p4, p0, Ls/w0;->x:Z

    .line 11
    .line 12
    new-instance p1, Ls/t0;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Ls/t0;-><init>(Ls/w0;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ls/w0;->z:Ls/t0;

    .line 19
    .line 20
    invoke-virtual {p0}, Ls/w0;->k1()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final X0(Lf2/y;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lf2/w;->f(Lf2/y;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls/w0;->z:Ls/t0;

    .line 5
    .line 6
    sget-object v1, Lf2/u;->M:Lf2/x;

    .line 7
    .line 8
    invoke-interface {p1, v1, v0}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ls/w0;->w:Lm/p1;

    .line 12
    .line 13
    iget-object v1, p0, Ls/w0;->y:Lf2/j;

    .line 14
    .line 15
    const-string v2, "scrollAxisRange"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    sget-object v4, Lm/p1;->g:Lm/p1;

    .line 19
    .line 20
    if-ne v0, v4, :cond_1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    sget-object v0, Lf2/u;->v:Lf2/x;

    .line 25
    .line 26
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 27
    .line 28
    const/16 v4, 0xd

    .line 29
    .line 30
    aget-object v2, v2, v4

    .line 31
    .line 32
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v3

    .line 40
    :cond_1
    if-eqz v1, :cond_4

    .line 41
    .line 42
    sget-object v0, Lf2/u;->u:Lf2/x;

    .line 43
    .line 44
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 45
    .line 46
    const/16 v4, 0xc

    .line 47
    .line 48
    aget-object v2, v2, v4

    .line 49
    .line 50
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object v0, p0, Ls/w0;->A:Ls/t0;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    sget-object v1, Lf2/l;->f:Lf2/x;

    .line 58
    .line 59
    new-instance v2, Lf2/a;

    .line 60
    .line 61
    invoke-direct {v2, v3, v0}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v1, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    new-instance v0, Ls/u0;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p0, v1}, Ls/u0;-><init>(Ls/w0;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, Lf2/l;->C:Lf2/x;

    .line 74
    .line 75
    new-instance v2, Lf2/a;

    .line 76
    .line 77
    new-instance v4, Lb1/f;

    .line 78
    .line 79
    const/16 v5, 0xa

    .line 80
    .line 81
    invoke-direct {v4, v0, v5}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3, v4}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, v1, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Ls/w0;->v:Lr/f;

    .line 91
    .line 92
    iget-boolean v1, v0, Lr/f;->c:Z

    .line 93
    .line 94
    iget-object v0, v0, Lr/f;->a:Li0/x;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    new-instance v1, Lf2/d;

    .line 100
    .line 101
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-direct {v1, v0, v2}, Lf2/d;-><init>(II)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    new-instance v1, Lf2/d;

    .line 116
    .line 117
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-direct {v1, v2, v0}, Lf2/d;-><init>(II)V

    .line 128
    .line 129
    .line 130
    :goto_1
    sget-object v0, Lf2/u;->f:Lf2/x;

    .line 131
    .line 132
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 133
    .line 134
    const/16 v3, 0x18

    .line 135
    .line 136
    aget-object v2, v2, v3

    .line 137
    .line 138
    invoke-interface {p1, v0, v1}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_4
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v3
.end method

.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k1()V
    .locals 4

    .line 1
    new-instance v0, Lf2/j;

    .line 2
    .line 3
    new-instance v1, Ls/u0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Ls/u0;-><init>(Ls/w0;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Ls/u0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Ls/u0;-><init>(Ls/w0;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lf2/j;-><init>(Lfg/a;Lfg/a;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ls/w0;->y:Lf2/j;

    .line 19
    .line 20
    iget-boolean v0, p0, Ls/w0;->x:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ls/t0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Ls/t0;-><init>(Ls/w0;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Ls/w0;->A:Ls/t0;

    .line 33
    .line 34
    return-void
.end method
