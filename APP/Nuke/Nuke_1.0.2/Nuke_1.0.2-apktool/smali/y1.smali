.class public final synthetic Ly1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lnn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    iput p1, p0, Ly1;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Ly1;->i:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Ly1;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    iget-object p0, p0, Ly1;->i:Ljava/util/List;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    check-cast p1, Lo71;

    .line 12
    .line 13
    check-cast p2, Lpx;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 p1, p3, 0x11

    .line 25
    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    if-eq p1, v2, :cond_0

    .line 30
    .line 31
    move p1, v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v4

    .line 34
    :goto_0
    and-int/2addr p3, v3

    .line 35
    check-cast p2, Lgo0;

    .line 36
    .line 37
    invoke-virtual {p2, p3, p1}, Lgo0;->O(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-static {p0, p2, v4}, Ls11;->n(Ljava/util/List;Lpx;I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-virtual {p2}, Lgo0;->R()V

    .line 48
    .line 49
    .line 50
    :goto_1
    return-object v1

    .line 51
    :pswitch_0
    if-eq p1, v2, :cond_2

    .line 52
    .line 53
    move v4, v3

    .line 54
    :cond_2
    and-int/lit8 p1, p3, 0x1

    .line 55
    .line 56
    move-object v8, p2

    .line 57
    check-cast v8, Lgo0;

    .line 58
    .line 59
    invoke-virtual {v8, p1, v4}, Lgo0;->O(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    const p1, 0x790b0002

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    new-instance p1, Lq1;

    .line 73
    .line 74
    invoke-direct {p1, v3, p0}, Lq1;-><init>(ILjava/util/List;)V

    .line 75
    .line 76
    .line 77
    const p0, 0x2ecaf20c

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p1, v8}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    const/16 v9, 0x180

    .line 85
    .line 86
    const/4 v10, 0x1

    .line 87
    const/4 v5, 0x0

    .line 88
    invoke-static/range {v5 .. v10}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    invoke-virtual {v8}, Lgo0;->R()V

    .line 93
    .line 94
    .line 95
    :goto_2
    return-object v1

    .line 96
    :pswitch_1
    if-eq p1, v2, :cond_4

    .line 97
    .line 98
    move p1, v3

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move p1, v4

    .line 101
    :goto_3
    and-int/2addr p3, v3

    .line 102
    move-object v8, p2

    .line 103
    check-cast v8, Lgo0;

    .line 104
    .line 105
    invoke-virtual {v8, p3, p1}, Lgo0;->O(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    const p1, 0x790b0001

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v8}, Lrg3;->P(ILpx;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    new-instance p1, Lq1;

    .line 119
    .line 120
    invoke-direct {p1, v4, p0}, Lq1;-><init>(ILjava/util/List;)V

    .line 121
    .line 122
    .line 123
    const p0, -0x50b12935

    .line 124
    .line 125
    .line 126
    invoke-static {p0, p1, v8}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    const/16 v9, 0x180

    .line 131
    .line 132
    const/4 v10, 0x1

    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-static/range {v5 .. v10}, Leu;->n(Luh1;Ljava/lang/String;Lkw;Lpx;II)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_5
    invoke-virtual {v8}, Lgo0;->R()V

    .line 139
    .line 140
    .line 141
    :goto_4
    return-object v1

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
