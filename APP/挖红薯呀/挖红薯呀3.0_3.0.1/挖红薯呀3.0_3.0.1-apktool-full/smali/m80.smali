.class public final Lm80;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lvz0;


# instance fields
.field public r:Lhw;

.field public s:Lf80;

.field public t:Lum0;

.field public u:Z

.field public v:Lhy0;

.field public final w:Lj80;

.field public x:Lj80;


# direct methods
.method public constructor <init>(Lhw;Lf80;Lum0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm80;->r:Lhw;

    .line 5
    .line 6
    iput-object p2, p0, Lm80;->s:Lf80;

    .line 7
    .line 8
    iput-object p3, p0, Lm80;->t:Lum0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lm80;->u:Z

    .line 11
    .line 12
    new-instance p1, Lj80;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Lj80;-><init>(Lm80;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lm80;->w:Lj80;

    .line 19
    .line 20
    invoke-virtual {p0}, Lm80;->w0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final S(Lf01;)V
    .locals 7

    .line 1
    sget-object v0, Ld01;->a:[Lu40;

    .line 2
    .line 3
    sget-object v0, Lb01;->m:Le01;

    .line 4
    .line 5
    sget-object v1, Ld01;->a:[Lu40;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    aget-object v2, v1, v2

    .line 9
    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-interface {p1, v0, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lm80;->w:Lj80;

    .line 16
    .line 17
    sget-object v2, Lb01;->K:Le01;

    .line 18
    .line 19
    invoke-interface {p1, v2, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lm80;->t:Lum0;

    .line 23
    .line 24
    iget-object v2, p0, Lm80;->v:Lhy0;

    .line 25
    .line 26
    const-string v3, "scrollAxisRange"

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    sget-object v5, Lum0;->d:Lum0;

    .line 30
    .line 31
    if-ne v0, v5, :cond_1

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    sget-object v0, Lb01;->v:Le01;

    .line 36
    .line 37
    const/16 v3, 0xd

    .line 38
    .line 39
    aget-object v3, v1, v3

    .line 40
    .line 41
    invoke-interface {p1, v0, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, Lp30;->V(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v4

    .line 49
    :cond_1
    if-eqz v2, :cond_3

    .line 50
    .line 51
    sget-object v0, Lb01;->u:Le01;

    .line 52
    .line 53
    const/16 v3, 0xc

    .line 54
    .line 55
    aget-object v3, v1, v3

    .line 56
    .line 57
    invoke-interface {p1, v0, v2}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object v0, p0, Lm80;->x:Lj80;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    sget-object v2, Lrz0;->f:Le01;

    .line 65
    .line 66
    new-instance v3, Lo0;

    .line 67
    .line 68
    invoke-direct {v3, v4, v0}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v2, v3}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance v0, Lk80;

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    invoke-direct {v0, p0, v2}, Lk80;-><init>(Lm80;I)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Lrz0;->B:Le01;

    .line 81
    .line 82
    new-instance v3, Lo0;

    .line 83
    .line 84
    new-instance v5, Ls2;

    .line 85
    .line 86
    const/16 v6, 0x15

    .line 87
    .line 88
    invoke-direct {v5, v6, v0}, Ls2;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, v4, v5}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v2, v3}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Lm80;->s:Lf80;

    .line 98
    .line 99
    invoke-interface {p0}, Lf80;->c()Lxe;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object v0, Lb01;->f:Le01;

    .line 104
    .line 105
    const/16 v2, 0x17

    .line 106
    .line 107
    aget-object v1, v1, v2

    .line 108
    .line 109
    invoke-interface {p1, v0, p0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_3
    invoke-static {v3}, Lp30;->V(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v4
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final w0()V
    .locals 4

    .line 1
    new-instance v0, Lhy0;

    .line 2
    .line 3
    new-instance v1, Lk80;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lk80;-><init>(Lm80;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lk80;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Lk80;-><init>(Lm80;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lhy0;-><init>(Lhw;Lhw;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lm80;->v:Lhy0;

    .line 19
    .line 20
    iget-boolean v0, p0, Lm80;->u:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Lj80;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Lj80;-><init>(Lm80;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Lm80;->x:Lj80;

    .line 33
    .line 34
    return-void
.end method
