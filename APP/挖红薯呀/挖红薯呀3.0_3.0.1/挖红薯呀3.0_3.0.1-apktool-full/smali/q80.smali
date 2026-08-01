.class public final synthetic Lq80;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Lq80;->d:I

    iput-object p3, p0, Lq80;->f:Ljava/lang/Object;

    iput p1, p0, Lq80;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lq80;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p2, p0, Lq80;->e:I

    .line 8
    .line 9
    iput-object p1, p0, Lq80;->f:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lq80;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget v5, p0, Lq80;->e:I

    .line 9
    .line 10
    iget-object p0, p0, Lq80;->f:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Lxn0;

    .line 16
    .line 17
    check-cast p1, Lji;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 v0, p2, 0x3

    .line 26
    .line 27
    if-eq v0, v2, :cond_0

    .line 28
    .line 29
    move v0, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v4

    .line 32
    :goto_0
    and-int/2addr p2, v3

    .line 33
    check-cast p1, Lpi;

    .line 34
    .line 35
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p0, p0, Lxn0;->b:Lu50;

    .line 42
    .line 43
    invoke-virtual {p0}, Lu50;->l()Lu5;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v5}, Lu5;->b(I)Lk30;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget p2, p0, Lk30;->a:I

    .line 52
    .line 53
    sub-int/2addr v5, p2

    .line 54
    iget-object p0, p0, Lk30;->c:Lh70;

    .line 55
    .line 56
    check-cast p0, Lrn0;

    .line 57
    .line 58
    iget-object p0, p0, Lrn0;->b:Lyw;

    .line 59
    .line 60
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v2, Lbo0;->a:Lbo0;

    .line 69
    .line 70
    invoke-interface {p0, v2, p2, p1, v0}, Lyw;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-object v1

    .line 78
    :pswitch_0
    check-cast p0, Lww;

    .line 79
    .line 80
    check-cast p1, Lji;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-static {p0, v5, p1, p2}, Lzc0;->i(Lww;ILji;I)Lna1;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_1
    check-cast p0, Landroid/content/Context;

    .line 94
    .line 95
    check-cast p1, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    check-cast p2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    invoke-static {v5, p0, p1, p2}, Lob0;->d(ILandroid/content/Context;II)Lna1;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_2
    check-cast p0, Lr80;

    .line 113
    .line 114
    check-cast p1, Lji;

    .line 115
    .line 116
    check-cast p2, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    and-int/lit8 v0, p2, 0x3

    .line 123
    .line 124
    if-eq v0, v2, :cond_2

    .line 125
    .line 126
    move v0, v3

    .line 127
    goto :goto_2

    .line 128
    :cond_2
    move v0, v4

    .line 129
    :goto_2
    and-int/2addr p2, v3

    .line 130
    check-cast p1, Lpi;

    .line 131
    .line 132
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    if-eqz p2, :cond_3

    .line 137
    .line 138
    iget-object p2, p0, Lr80;->b:Lp80;

    .line 139
    .line 140
    iget-object p2, p2, Lp80;->a:Lu5;

    .line 141
    .line 142
    invoke-virtual {p2, v5}, Lu5;->b(I)Lk30;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iget v0, p2, Lk30;->a:I

    .line 147
    .line 148
    sub-int/2addr v5, v0

    .line 149
    iget-object p2, p2, Lk30;->c:Lh70;

    .line 150
    .line 151
    check-cast p2, Lo80;

    .line 152
    .line 153
    iget-object p2, p2, Lo80;->a:Lmh;

    .line 154
    .line 155
    iget-object p0, p0, Lr80;->c:Ly60;

    .line 156
    .line 157
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {p2, p0, v0, p1, v2}, Lmh;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_3
    invoke-virtual {p1}, Lpi;->R()V

    .line 170
    .line 171
    .line 172
    :goto_3
    return-object v1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
