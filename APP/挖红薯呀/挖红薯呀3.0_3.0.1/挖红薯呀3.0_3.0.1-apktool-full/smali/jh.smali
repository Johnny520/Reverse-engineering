.class public final synthetic Ljh;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p2, p0, Ljh;->d:I

    iput-object p3, p0, Ljh;->f:Ljava/lang/Object;

    iput-object p4, p0, Ljh;->g:Ljava/lang/Object;

    iput p1, p0, Ljh;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILo70;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ljh;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ljh;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iput p1, p0, Ljh;->e:I

    .line 10
    .line 11
    iput-object p3, p0, Ljh;->g:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lkp;Landroid/content/Context;I)V
    .locals 1

    .line 15
    const/4 v0, 0x5

    iput v0, p0, Ljh;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Ljh;->e:I

    iput-object p1, p0, Ljh;->f:Ljava/lang/Object;

    iput-object p2, p0, Ljh;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lo70;ILjava/lang/Object;II)V
    .locals 0

    .line 16
    iput p5, p0, Ljh;->d:I

    iput-object p1, p0, Ljh;->f:Ljava/lang/Object;

    iput p2, p0, Ljh;->e:I

    iput-object p3, p0, Ljh;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ljh;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, Ljh;->e:I

    .line 7
    .line 8
    iget-object v4, p0, Ljh;->g:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ljh;->f:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lb91;

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Boolean;

    .line 18
    .line 19
    check-cast p1, Lji;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p2, v3, 0x1

    .line 27
    .line 28
    invoke-static {p2}, Lj50;->A(I)I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0, v4, p1, p2}, Lb91;->a(Ljava/lang/Boolean;Lji;I)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_0
    check-cast p0, Lxn0;

    .line 37
    .line 38
    check-cast p1, Lji;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lj50;->A(I)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-virtual {p0, v3, v4, p1, p2}, Lxn0;->b(ILjava/lang/Object;Lji;I)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_1
    check-cast p0, Lkp;

    .line 54
    .line 55
    check-cast v4, Landroid/content/Context;

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    check-cast p2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-static {v3, p0, v4, p1, p2}, Lob0;->m(ILkp;Landroid/content/Context;II)Lna1;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_2
    check-cast p0, Lr80;

    .line 75
    .line 76
    check-cast p1, Lji;

    .line 77
    .line 78
    check-cast p2, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, Lj50;->A(I)I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p0, v3, v4, p1, p2}, Lr80;->b(ILjava/lang/Object;Lji;I)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :pswitch_3
    check-cast p0, Lo70;

    .line 92
    .line 93
    check-cast p1, Lji;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    and-int/lit8 v0, p2, 0x3

    .line 102
    .line 103
    const/4 v5, 0x2

    .line 104
    const/4 v6, 0x0

    .line 105
    if-eq v0, v5, :cond_0

    .line 106
    .line 107
    move v0, v2

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    move v0, v6

    .line 110
    :goto_0
    and-int/2addr p2, v2

    .line 111
    check-cast p1, Lpi;

    .line 112
    .line 113
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_1

    .line 118
    .line 119
    invoke-interface {p0, v3, v4, p1, v6}, Lo70;->b(ILjava/lang/Object;Lji;I)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 124
    .line 125
    .line 126
    :goto_1
    return-object v1

    .line 127
    :pswitch_4
    check-cast p0, [Lct0;

    .line 128
    .line 129
    check-cast v4, Lww;

    .line 130
    .line 131
    check-cast p1, Lji;

    .line 132
    .line 133
    check-cast p2, Ljava/lang/Integer;

    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    or-int/lit8 p2, v3, 0x1

    .line 139
    .line 140
    invoke-static {p2}, Lj50;->A(I)I

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    invoke-static {p0, v4, p1, p2}, Li4;->c([Lct0;Lww;Lji;I)V

    .line 145
    .line 146
    .line 147
    return-object v1

    .line 148
    :pswitch_5
    check-cast p0, Lct0;

    .line 149
    .line 150
    check-cast v4, Lww;

    .line 151
    .line 152
    check-cast p1, Lji;

    .line 153
    .line 154
    check-cast p2, Ljava/lang/Integer;

    .line 155
    .line 156
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    or-int/lit8 p2, v3, 0x1

    .line 160
    .line 161
    invoke-static {p2}, Lj50;->A(I)I

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    invoke-static {p0, v4, p1, p2}, Li4;->b(Lct0;Lww;Lji;I)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :pswitch_6
    check-cast p0, Lmh;

    .line 170
    .line 171
    check-cast p1, Lji;

    .line 172
    .line 173
    check-cast p2, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {v3}, Lj50;->A(I)I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    or-int/2addr p2, v2

    .line 183
    invoke-virtual {p0, v4, p1, p2}, Lmh;->d(Ljava/lang/Object;Lji;I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    return-object v1

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
