.class public final Lq81;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lon2;


# instance fields
.field public final A:Ln81;

.field public B:Ln81;

.field public v:Lxm0;

.field public w:Ll81;

.field public x:Lqv1;

.field public y:Z

.field public z:Lel2;


# direct methods
.method public constructor <init>(Lxm0;Ll81;Lqv1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq81;->v:Lxm0;

    .line 5
    .line 6
    iput-object p2, p0, Lq81;->w:Ll81;

    .line 7
    .line 8
    iput-object p3, p0, Lq81;->x:Lqv1;

    .line 9
    .line 10
    iput-boolean p4, p0, Lq81;->y:Z

    .line 11
    .line 12
    new-instance p1, Ln81;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p0, p2}, Ln81;-><init>(Lq81;I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lq81;->A:Ln81;

    .line 19
    .line 20
    invoke-virtual {p0}, Lq81;->M0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final B0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M0()V
    .locals 4

    .line 1
    new-instance v0, Lel2;

    .line 2
    .line 3
    new-instance v1, Lo81;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Lo81;-><init>(Lq81;I)V

    .line 7
    .line 8
    .line 9
    new-instance v2, Lo81;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-direct {v2, p0, v3}, Lo81;-><init>(Lq81;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lel2;-><init>(Lxm0;Lxm0;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lq81;->z:Lel2;

    .line 19
    .line 20
    iget-boolean v0, p0, Lq81;->y:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, Ln81;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Ln81;-><init>(Lq81;I)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    iput-object v0, p0, Lq81;->B:Ln81;

    .line 33
    .line 34
    return-void
.end method

.method public final l0(Lzn2;)V
    .locals 7

    .line 1
    sget-object v0, Lxn2;->a:[Lv41;

    .line 2
    .line 3
    sget-object v0, Lvn2;->n:Lyn2;

    .line 4
    .line 5
    sget-object v1, Lxn2;->a:[Lv41;

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
    invoke-interface {p1, v0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lq81;->A:Ln81;

    .line 16
    .line 17
    sget-object v2, Lvn2;->N:Lyn2;

    .line 18
    .line 19
    invoke-interface {p1, v2, v0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lq81;->x:Lqv1;

    .line 23
    .line 24
    iget-object v2, p0, Lq81;->z:Lel2;

    .line 25
    .line 26
    const-string v3, "scrollAxisRange"

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    sget-object v5, Lqv1;->h:Lqv1;

    .line 30
    .line 31
    if-ne v0, v5, :cond_1

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    sget-object v0, Lvn2;->w:Lyn2;

    .line 36
    .line 37
    const/16 v3, 0xd

    .line 38
    .line 39
    aget-object v3, v1, v3

    .line 40
    .line 41
    invoke-interface {p1, v0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v4

    .line 49
    :cond_1
    if-eqz v2, :cond_3

    .line 50
    .line 51
    sget-object v0, Lvn2;->v:Lyn2;

    .line 52
    .line 53
    const/16 v3, 0xc

    .line 54
    .line 55
    aget-object v3, v1, v3

    .line 56
    .line 57
    invoke-interface {p1, v0, v2}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object v0, p0, Lq81;->B:Ln81;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    sget-object v2, Lkn2;->f:Lyn2;

    .line 65
    .line 66
    new-instance v3, Lq3;

    .line 67
    .line 68
    invoke-direct {v3, v4, v0}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    new-instance v0, Lo81;

    .line 75
    .line 76
    const/4 v2, 0x2

    .line 77
    invoke-direct {v0, p0, v2}, Lo81;-><init>(Lq81;I)V

    .line 78
    .line 79
    .line 80
    sget-object v2, Lkn2;->C:Lyn2;

    .line 81
    .line 82
    new-instance v3, Lq3;

    .line 83
    .line 84
    new-instance v5, Lv5;

    .line 85
    .line 86
    const/16 v6, 0x13

    .line 87
    .line 88
    invoke-direct {v5, v6, v0}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v3, v4, v5}, Lq3;-><init>(Ljava/lang/String;Lun0;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1, v2, v3}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Lq81;->w:Ll81;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v0, Lzt;

    .line 103
    .line 104
    iget-object p0, p0, Ll81;->a:Ln70;

    .line 105
    .line 106
    invoke-virtual {p0}, Ln70;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    const/4 v2, 0x1

    .line 117
    invoke-direct {v0, p0, v2}, Lzt;-><init>(II)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lvn2;->f:Lyn2;

    .line 121
    .line 122
    const/16 v2, 0x18

    .line 123
    .line 124
    aget-object v1, v1, v2

    .line 125
    .line 126
    invoke-interface {p1, p0, v0}, Lzn2;->a(Lyn2;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    invoke-static {v3}, Lt11;->S(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v4
.end method
