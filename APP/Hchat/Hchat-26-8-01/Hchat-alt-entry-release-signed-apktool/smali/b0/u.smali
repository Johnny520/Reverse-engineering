.class public final Lb0/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb0/u;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/u;->h:Ljava/lang/Object;

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
    iget v0, p0, Lb0/u;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lf1/w;

    .line 7
    .line 8
    iget-wide v0, p1, Lf1/w;->a:J

    .line 9
    .line 10
    check-cast p2, Li0/h0;

    .line 11
    .line 12
    check-cast p3, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    and-int/lit8 p3, p1, 0x11

    .line 19
    .line 20
    const/16 v0, 0x10

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    if-eq p3, v0, :cond_0

    .line 24
    .line 25
    move p3, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x0

    .line 28
    :goto_0
    and-int/2addr p1, v1

    .line 29
    invoke-virtual {p2, p1, p3}, Li0/h0;->S(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lb0/u;->h:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Landroid/app/RemoteAction;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/app/RemoteAction;->getIcon()Landroid/graphics/drawable/Icon;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const/16 p3, 0x30

    .line 44
    .line 45
    sget-object v0, Lb0/e0;->a:Lb0/e0;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2, p3}, Lb0/e0;->b(Landroid/graphics/drawable/Icon;Li0/h0;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 52
    .line 53
    .line 54
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_0
    check-cast p1, Lf1/w;

    .line 58
    .line 59
    iget-wide v0, p1, Lf1/w;->a:J

    .line 60
    .line 61
    check-cast p2, Li0/h0;

    .line 62
    .line 63
    check-cast p3, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    and-int/lit8 p3, p1, 0x11

    .line 70
    .line 71
    const/16 v0, 0x10

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    if-eq p3, v0, :cond_2

    .line 75
    .line 76
    move p3, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const/4 p3, 0x0

    .line 79
    :goto_2
    and-int/2addr p1, v1

    .line 80
    invoke-virtual {p2, p1, p3}, Li0/h0;->S(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Lb0/u;->h:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    const/16 p3, 0x30

    .line 91
    .line 92
    sget-object v0, Lb0/e0;->a:Lb0/e0;

    .line 93
    .line 94
    invoke-virtual {v0, p1, p2, p3}, Lb0/e0;->a(Landroid/graphics/drawable/Drawable;Li0/h0;I)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 99
    .line 100
    .line 101
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    return-object p1

    .line 104
    :pswitch_1
    check-cast p1, Lf1/w;

    .line 105
    .line 106
    iget-wide v0, p1, Lf1/w;->a:J

    .line 107
    .line 108
    check-cast p2, Li0/h0;

    .line 109
    .line 110
    check-cast p3, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    and-int/lit8 p3, p1, 0x6

    .line 117
    .line 118
    if-nez p3, :cond_5

    .line 119
    .line 120
    invoke-virtual {p2, v0, v1}, Li0/h0;->e(J)Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_4

    .line 125
    .line 126
    const/4 p3, 0x4

    .line 127
    goto :goto_4

    .line 128
    :cond_4
    const/4 p3, 0x2

    .line 129
    :goto_4
    or-int/2addr p1, p3

    .line 130
    :cond_5
    and-int/lit8 p3, p1, 0x13

    .line 131
    .line 132
    const/16 v2, 0x12

    .line 133
    .line 134
    if-eq p3, v2, :cond_6

    .line 135
    .line 136
    const/4 p3, 0x1

    .line 137
    goto :goto_5

    .line 138
    :cond_6
    const/4 p3, 0x0

    .line 139
    :goto_5
    and-int/lit8 v2, p1, 0x1

    .line 140
    .line 141
    invoke-virtual {p2, v2, p3}, Li0/h0;->S(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-eqz p3, :cond_7

    .line 146
    .line 147
    iget-object p3, p0, Lb0/u;->h:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p3, Lz/d;

    .line 150
    .line 151
    iget p3, p3, Lz/d;->c:I

    .line 152
    .line 153
    shl-int/lit8 p1, p1, 0x3

    .line 154
    .line 155
    and-int/lit8 p1, p1, 0x70

    .line 156
    .line 157
    invoke-static {p3, v0, v1, p2, p1}, Lb0/w;->b(IJLi0/h0;I)V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_7
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 162
    .line 163
    .line 164
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 165
    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
