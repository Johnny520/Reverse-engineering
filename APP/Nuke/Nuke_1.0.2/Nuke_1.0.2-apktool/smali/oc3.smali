.class public final synthetic Loc3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:I

.field public final synthetic j:Lin0;

.field public final synthetic k:Lxk1;

.field public final synthetic l:Ljava/util/Set;

.field public final synthetic m:Lxk1;


# direct methods
.method public synthetic constructor <init>(Lxm0;ILin0;Lxk1;Ljava/util/Set;Lxk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loc3;->h:Lxm0;

    .line 5
    .line 6
    iput p2, p0, Loc3;->i:I

    .line 7
    .line 8
    iput-object p3, p0, Loc3;->j:Lin0;

    .line 9
    .line 10
    iput-object p4, p0, Loc3;->k:Lxk1;

    .line 11
    .line 12
    iput-object p5, p0, Loc3;->l:Ljava/util/Set;

    .line 13
    .line 14
    iput-object p6, p0, Loc3;->m:Lxk1;

    .line 15
    .line 16
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
    iget-object v2, p0, Loc3;->h:Lxm0;

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
    iget p2, p0, Loc3;->i:I

    .line 73
    .line 74
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    const p3, 0x790b0232

    .line 83
    .line 84
    .line 85
    invoke-static {p3, p2, v6}, Lrg3;->Q(I[Ljava/lang/Object;Lpx;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object p2, p0, Loc3;->m:Lxk1;

    .line 90
    .line 91
    invoke-interface {p2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Lnc3;

    .line 96
    .line 97
    instance-of v4, p2, Llc3;

    .line 98
    .line 99
    invoke-static {p1}, Lpb2;->a(Lpb2;)Luh1;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    iget-object p1, p0, Loc3;->j:Lin0;

    .line 104
    .line 105
    invoke-virtual {v6, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    iget-object p3, p0, Loc3;->k:Lxk1;

    .line 110
    .line 111
    invoke-virtual {v6, p3}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    or-int/2addr p2, v0

    .line 116
    iget-object p0, p0, Loc3;->l:Ljava/util/Set;

    .line 117
    .line 118
    invoke-virtual {v6, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    or-int/2addr p2, v0

    .line 123
    invoke-virtual {v6}, Lgo0;->L()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-nez p2, :cond_3

    .line 128
    .line 129
    sget-object p2, Lnx;->a:Leb;

    .line 130
    .line 131
    if-ne v0, p2, :cond_4

    .line 132
    .line 133
    :cond_3
    new-instance v0, Ls1;

    .line 134
    .line 135
    const/16 p2, 0x11

    .line 136
    .line 137
    invoke-direct {v0, p1, p0, p3, p2}, Ls1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v0}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_4
    move-object v2, v0

    .line 144
    check-cast v2, Lxm0;

    .line 145
    .line 146
    const/4 v7, 0x0

    .line 147
    const/16 v8, 0x30

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-static/range {v1 .. v8}, Lse;->q(Ljava/lang/String;Lxm0;Luh1;ZILpx;II)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-virtual {v6}, Lgo0;->R()V

    .line 155
    .line 156
    .line 157
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 158
    .line 159
    return-object p0
.end method
