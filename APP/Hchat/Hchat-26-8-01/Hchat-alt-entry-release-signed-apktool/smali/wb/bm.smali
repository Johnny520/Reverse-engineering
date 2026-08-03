.class public final synthetic Lwb/bm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:I

.field public final synthetic i:Lfg/l;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILfg/l;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/bm;->g:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Lwb/bm;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/bm;->i:Lfg/l;

    .line 9
    .line 10
    iput-wide p4, p0, Lwb/bm;->j:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lp/f1;

    .line 3
    .line 4
    move-object v4, p2

    .line 5
    check-cast v4, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p2, p1, 0x6

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v4, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    const/4 p2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p2, 0x2

    .line 29
    :goto_0
    or-int/2addr p1, p2

    .line 30
    :cond_1
    and-int/lit8 p2, p1, 0x13

    .line 31
    .line 32
    const/16 p3, 0x12

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x1

    .line 36
    if-eq p2, p3, :cond_2

    .line 37
    .line 38
    move p2, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move p2, v6

    .line 41
    :goto_1
    and-int/lit8 p3, p1, 0x1

    .line 42
    .line 43
    invoke-virtual {v4, p3, p2}, Li0/h0;->S(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_7

    .line 48
    .line 49
    iget-object p2, p0, Lwb/bm;->g:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    move p3, v6

    .line 56
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_8

    .line 61
    .line 62
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    add-int/lit8 v8, p3, 0x1

    .line 67
    .line 68
    if-ltz p3, :cond_6

    .line 69
    .line 70
    check-cast v1, Lwb/s4;

    .line 71
    .line 72
    iget v2, p0, Lwb/bm;->h:I

    .line 73
    .line 74
    if-ne p3, v2, :cond_3

    .line 75
    .line 76
    move p3, v7

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    move p3, v6

    .line 79
    :goto_3
    iget-object v2, p0, Lwb/bm;->i:Lfg/l;

    .line 80
    .line 81
    invoke-virtual {v4, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {v4, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    or-int/2addr v3, v5

    .line 90
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    sget-object v3, Li0/l;->a:Li0/e;

    .line 97
    .line 98
    if-ne v5, v3, :cond_5

    .line 99
    .line 100
    :cond_4
    new-instance v5, Lwb/xi;

    .line 101
    .line 102
    const/4 v3, 0x4

    .line 103
    invoke-direct {v5, v2, v3, v1}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    check-cast v5, Lfg/a;

    .line 110
    .line 111
    const/16 v2, 0x4c

    .line 112
    .line 113
    int-to-float v2, v2

    .line 114
    invoke-static {v2}, Lp/h1;->b(F)Ly0/o;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    new-instance v3, Lwb/kk;

    .line 119
    .line 120
    iget-wide v9, p0, Lwb/bm;->j:J

    .line 121
    .line 122
    invoke-direct {v3, v1, v9, v10, p3}, Lwb/kk;-><init>(Lwb/s4;JZ)V

    .line 123
    .line 124
    .line 125
    const p3, 0x778d384f

    .line 126
    .line 127
    .line 128
    invoke-static {p3, v3, v4}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    and-int/lit8 p3, p1, 0xe

    .line 133
    .line 134
    or-int/lit16 p3, p3, 0xd80

    .line 135
    .line 136
    move-object v1, v5

    .line 137
    move v5, p3

    .line 138
    invoke-static/range {v0 .. v5}, Lwb/o3;->c(Lp/f1;Lfg/a;Ly0/o;Ls0/d;Li0/h0;I)V

    .line 139
    .line 140
    .line 141
    move p3, v8

    .line 142
    goto :goto_2

    .line 143
    :cond_6
    invoke-static {}, La/a;->Q0()V

    .line 144
    .line 145
    .line 146
    const/4 p1, 0x0

    .line 147
    throw p1

    .line 148
    :cond_7
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 149
    .line 150
    .line 151
    :cond_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 152
    .line 153
    return-object p1
.end method
