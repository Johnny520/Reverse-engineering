.class public final synthetic Lds;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:Ljava/lang/Long;

.field public final synthetic j:Lin0;

.field public final synthetic k:Z


# direct methods
.method public synthetic constructor <init>(Lxm0;Ljava/lang/Long;Lin0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lds;->h:Lxm0;

    .line 5
    .line 6
    iput-object p2, p0, Lds;->i:Ljava/lang/Long;

    .line 7
    .line 8
    iput-object p3, p0, Lds;->j:Lin0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lds;->k:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Lpb2;

    .line 2
    .line 3
    check-cast p2, Lpx;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, Lgo0;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr p3, v0

    .line 31
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 32
    .line 33
    const/16 v1, 0x12

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    move v0, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    :goto_1
    and-int/2addr p3, v2

    .line 42
    move-object v6, p2

    .line 43
    check-cast v6, Lgo0;

    .line 44
    .line 45
    invoke-virtual {v6, p3, v0}, Lgo0;->O(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_5

    .line 50
    .line 51
    const p2, 0x790b0111

    .line 52
    .line 53
    .line 54
    invoke-static {p2, v6}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p1}, Lpb2;->a(Lpb2;)Luh1;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v7, 0x0

    .line 63
    const/16 v8, 0x38

    .line 64
    .line 65
    iget-object v2, p0, Lds;->h:Lxm0;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-static/range {v1 .. v8}, Lse;->r(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 70
    .line 71
    .line 72
    const p2, 0x790b014a

    .line 73
    .line 74
    .line 75
    invoke-static {p2, v6}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {p1}, Lpb2;->a(Lpb2;)Luh1;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object p1, p0, Lds;->i:Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v6, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    iget-object p3, p0, Lds;->j:Lin0;

    .line 90
    .line 91
    invoke-virtual {v6, p3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    or-int/2addr p2, v0

    .line 96
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    sget-object p2, Lnx;->a:Leb;

    .line 103
    .line 104
    if-ne v0, p2, :cond_4

    .line 105
    .line 106
    :cond_3
    new-instance v0, Lr1;

    .line 107
    .line 108
    const/16 p2, 0xb

    .line 109
    .line 110
    invoke-direct {v0, p2, p1, p3}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    move-object v2, v0

    .line 117
    check-cast v2, Lxm0;

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/16 v8, 0x30

    .line 121
    .line 122
    iget-boolean v4, p0, Lds;->k:Z

    .line 123
    .line 124
    const/4 v5, 0x0

    .line 125
    invoke-static/range {v1 .. v8}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_5
    invoke-virtual {v6}, Lgo0;->R()V

    .line 130
    .line 131
    .line 132
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 133
    .line 134
    return-object p0
.end method
