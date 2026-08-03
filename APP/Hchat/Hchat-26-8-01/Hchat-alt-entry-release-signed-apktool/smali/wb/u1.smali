.class public final synthetic Lwb/u1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/u1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/u1;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/u1;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/u1;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/u1;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lwb/y1;

    .line 37
    .line 38
    const/4 p3, 0x2

    .line 39
    iget-object v0, p0, Lwb/u1;->h:Ljava/util/List;

    .line 40
    .line 41
    iget-object v2, p0, Lwb/u1;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v3, p0, Lwb/u1;->j:Li0/a1;

    .line 44
    .line 45
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/y1;-><init>(Ljava/util/List;Li0/a1;Li0/a1;I)V

    .line 46
    .line 47
    .line 48
    const p3, -0x617faba1

    .line 49
    .line 50
    .line 51
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const/16 p3, 0x30

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 63
    .line 64
    .line 65
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object p1

    .line 68
    :pswitch_0
    const/16 v0, 0x10

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    if-eq p1, v0, :cond_2

    .line 72
    .line 73
    move p1, v1

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const/4 p1, 0x0

    .line 76
    :goto_2
    and-int/2addr p3, v1

    .line 77
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    new-instance p1, Lwb/y1;

    .line 84
    .line 85
    const/4 p3, 0x1

    .line 86
    iget-object v0, p0, Lwb/u1;->h:Ljava/util/List;

    .line 87
    .line 88
    iget-object v2, p0, Lwb/u1;->i:Li0/a1;

    .line 89
    .line 90
    iget-object v3, p0, Lwb/u1;->j:Li0/a1;

    .line 91
    .line 92
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/y1;-><init>(Ljava/util/List;Li0/a1;Li0/a1;I)V

    .line 93
    .line 94
    .line 95
    const p3, 0x126a9cc1

    .line 96
    .line 97
    .line 98
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/16 p3, 0x30

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 110
    .line 111
    .line 112
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_1
    const/16 v0, 0x10

    .line 116
    .line 117
    const/4 v1, 0x1

    .line 118
    if-eq p1, v0, :cond_4

    .line 119
    .line 120
    move p1, v1

    .line 121
    goto :goto_4

    .line 122
    :cond_4
    const/4 p1, 0x0

    .line 123
    :goto_4
    and-int/2addr p3, v1

    .line 124
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    new-instance p1, Lwb/y1;

    .line 131
    .line 132
    const/4 p3, 0x0

    .line 133
    iget-object v0, p0, Lwb/u1;->h:Ljava/util/List;

    .line 134
    .line 135
    iget-object v2, p0, Lwb/u1;->i:Li0/a1;

    .line 136
    .line 137
    iget-object v3, p0, Lwb/u1;->j:Li0/a1;

    .line 138
    .line 139
    invoke-direct {p1, v0, v2, v3, p3}, Lwb/y1;-><init>(Ljava/util/List;Li0/a1;Li0/a1;I)V

    .line 140
    .line 141
    .line 142
    const p3, 0xa4ae2a9

    .line 143
    .line 144
    .line 145
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const/16 p3, 0x30

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 157
    .line 158
    .line 159
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 160
    .line 161
    return-object p1

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
