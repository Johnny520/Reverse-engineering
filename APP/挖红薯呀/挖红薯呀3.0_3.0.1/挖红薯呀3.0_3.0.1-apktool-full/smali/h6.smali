.class public final synthetic Lh6;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh6;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 1
    iget p0, p0, Lh6;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lw80;

    .line 7
    .line 8
    check-cast p2, Lw80;

    .line 9
    .line 10
    iget p0, p1, Lw80;->a:I

    .line 11
    .line 12
    iget p1, p2, Lw80;->a:I

    .line 13
    .line 14
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p1, Lb60;

    .line 20
    .line 21
    check-cast p2, Lb60;

    .line 22
    .line 23
    iget-object p0, p1, Lb60;->J:Lf60;

    .line 24
    .line 25
    iget-object p0, p0, Lf60;->p:Lwd0;

    .line 26
    .line 27
    iget p0, p0, Lwd0;->G:F

    .line 28
    .line 29
    iget-object v0, p2, Lb60;->J:Lf60;

    .line 30
    .line 31
    iget-object v0, v0, Lf60;->p:Lwd0;

    .line 32
    .line 33
    iget v0, v0, Lwd0;->G:F

    .line 34
    .line 35
    cmpg-float v1, p0, v0

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p1}, Lb60;->w()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-virtual {p2}, Lb60;->w()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    :goto_0
    return p0

    .line 57
    :pswitch_1
    check-cast p1, Luo0;

    .line 58
    .line 59
    check-cast p2, Luo0;

    .line 60
    .line 61
    iget-object p0, p1, Luo0;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    iget-object p1, p1, Luo0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    sub-int/2addr p0, p1

    .line 78
    iget-object p1, p2, Luo0;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iget-object p2, p2, Luo0;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    sub-int/2addr p1, p2

    .line 95
    sub-int/2addr p0, p1

    .line 96
    return p0

    .line 97
    :pswitch_2
    check-cast p1, [B

    .line 98
    .line 99
    check-cast p2, [B

    .line 100
    .line 101
    array-length p0, p1

    .line 102
    array-length v0, p2

    .line 103
    if-eq p0, v0, :cond_1

    .line 104
    .line 105
    array-length p0, p1

    .line 106
    array-length p1, p2

    .line 107
    sub-int/2addr p0, p1

    .line 108
    goto :goto_2

    .line 109
    :cond_1
    const/4 p0, 0x0

    .line 110
    move v0, p0

    .line 111
    :goto_1
    array-length v1, p1

    .line 112
    if-ge v0, v1, :cond_3

    .line 113
    .line 114
    aget-byte v1, p1, v0

    .line 115
    .line 116
    aget-byte v2, p2, v0

    .line 117
    .line 118
    if-eq v1, v2, :cond_2

    .line 119
    .line 120
    sub-int p0, v1, v2

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    :goto_2
    return p0

    .line 127
    :pswitch_3
    check-cast p1, Lx30;

    .line 128
    .line 129
    check-cast p2, Lx30;

    .line 130
    .line 131
    iget p0, p1, Lx30;->b:I

    .line 132
    .line 133
    iget p1, p2, Lx30;->b:I

    .line 134
    .line 135
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    return p0

    .line 140
    :pswitch_4
    check-cast p1, Lms0;

    .line 141
    .line 142
    check-cast p2, Lms0;

    .line 143
    .line 144
    iget p0, p2, Lms0;->a:I

    .line 145
    .line 146
    iget p1, p1, Lms0;->a:I

    .line 147
    .line 148
    invoke-static {p0, p1}, Lp30;->r(II)I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    return p0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
