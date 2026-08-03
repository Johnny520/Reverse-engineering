.class public final synthetic Lwb/eg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/eg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/eg;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/eg;->g:I

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
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x1

    .line 25
    if-eq p1, v0, :cond_0

    .line 26
    .line 27
    move p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v1

    .line 30
    :goto_0
    and-int/2addr p3, v2

    .line 31
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lwb/eg;->h:Landroid/content/Context;

    .line 38
    .line 39
    invoke-static {p1, p2, v1}, Lwb/ho;->U3(Landroid/content/Context;Li0/h0;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 44
    .line 45
    .line 46
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    const/16 v0, 0x10

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/4 v2, 0x1

    .line 53
    if-eq p1, v0, :cond_2

    .line 54
    .line 55
    move p1, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    move p1, v1

    .line 58
    :goto_2
    and-int/2addr p3, v2

    .line 59
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iget-object p1, p0, Lwb/eg;->h:Landroid/content/Context;

    .line 66
    .line 67
    invoke-static {p1, p2, v1}, Lwb/ho;->k1(Landroid/content/Context;Li0/h0;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 72
    .line 73
    .line 74
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 75
    .line 76
    return-object p1

    .line 77
    :pswitch_1
    const/16 v0, 0x10

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    if-eq p1, v0, :cond_4

    .line 81
    .line 82
    move p1, v1

    .line 83
    goto :goto_4

    .line 84
    :cond_4
    const/4 p1, 0x0

    .line 85
    :goto_4
    and-int/2addr p3, v1

    .line 86
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    new-instance p1, Lwb/ha;

    .line 93
    .line 94
    const/4 p3, 0x5

    .line 95
    iget-object v0, p0, Lwb/eg;->h:Landroid/content/Context;

    .line 96
    .line 97
    invoke-direct {p1, v0, p3}, Lwb/ha;-><init>(Landroid/content/Context;I)V

    .line 98
    .line 99
    .line 100
    const p3, -0x2abd6075

    .line 101
    .line 102
    .line 103
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/16 p3, 0x30

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 115
    .line 116
    .line 117
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 118
    .line 119
    return-object p1

    .line 120
    :pswitch_2
    const/16 v0, 0x10

    .line 121
    .line 122
    const/4 v1, 0x1

    .line 123
    if-eq p1, v0, :cond_6

    .line 124
    .line 125
    move p1, v1

    .line 126
    goto :goto_6

    .line 127
    :cond_6
    const/4 p1, 0x0

    .line 128
    :goto_6
    and-int/2addr p3, v1

    .line 129
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    new-instance p1, Lwb/ha;

    .line 136
    .line 137
    const/4 p3, 0x4

    .line 138
    iget-object v0, p0, Lwb/eg;->h:Landroid/content/Context;

    .line 139
    .line 140
    invoke-direct {p1, v0, p3}, Lwb/ha;-><init>(Landroid/content/Context;I)V

    .line 141
    .line 142
    .line 143
    const p3, -0x74b1d399

    .line 144
    .line 145
    .line 146
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    const/16 p3, 0x30

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 158
    .line 159
    .line 160
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 161
    .line 162
    return-object p1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
