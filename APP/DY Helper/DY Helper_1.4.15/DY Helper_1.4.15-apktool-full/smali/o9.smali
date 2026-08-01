.class public final synthetic Lo9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo9;->α:I

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
    .locals 7

    .line 1
    iget p0, p0, Lo9;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyp0;

    .line 7
    .line 8
    check-cast p2, Lyp0;

    .line 9
    .line 10
    iget-object p0, p1, Lyp0;->Λ:Lbq0;

    .line 11
    .line 12
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 13
    .line 14
    iget p0, p0, Lox0;->Ι:F

    .line 15
    .line 16
    iget-object v0, p2, Lyp0;->Λ:Lbq0;

    .line 17
    .line 18
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 19
    .line 20
    iget v0, v0, Lox0;->Ι:F

    .line 21
    .line 22
    cmpg-float v1, p0, v0

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lyp0;->τ()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p2}, Lyp0;->τ()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-static {p0, p1}, Lln0;->ο(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    :goto_0
    return p0

    .line 44
    :pswitch_0
    check-cast p1, Lxm0;

    .line 45
    .line 46
    check-cast p2, Lxm0;

    .line 47
    .line 48
    iget p0, p1, Lvm0;->ζ:I

    .line 49
    .line 50
    iget p1, p1, Lvm0;->ε:I

    .line 51
    .line 52
    sub-int/2addr p0, p1

    .line 53
    iget p1, p2, Lvm0;->ζ:I

    .line 54
    .line 55
    iget p2, p2, Lvm0;->ε:I

    .line 56
    .line 57
    sub-int/2addr p1, p2

    .line 58
    sub-int/2addr p0, p1

    .line 59
    return p0

    .line 60
    :pswitch_1
    check-cast p1, Lrn0;

    .line 61
    .line 62
    check-cast p2, Lrn0;

    .line 63
    .line 64
    iget p0, p1, Lrn0;->β:I

    .line 65
    .line 66
    iget p1, p2, Lrn0;->β:I

    .line 67
    .line 68
    invoke-static {p0, p1}, Lln0;->ο(II)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :pswitch_2
    check-cast p1, [B

    .line 74
    .line 75
    check-cast p2, [B

    .line 76
    .line 77
    array-length p0, p1

    .line 78
    array-length v0, p2

    .line 79
    if-eq p0, v0, :cond_1

    .line 80
    .line 81
    array-length p0, p1

    .line 82
    array-length p1, p2

    .line 83
    sub-int/2addr p0, p1

    .line 84
    goto :goto_2

    .line 85
    :cond_1
    const/4 p0, 0x0

    .line 86
    move v0, p0

    .line 87
    :goto_1
    array-length v1, p1

    .line 88
    if-ge v0, v1, :cond_3

    .line 89
    .line 90
    aget-byte v1, p1, v0

    .line 91
    .line 92
    aget-byte v2, p2, v0

    .line 93
    .line 94
    if-eq v1, v2, :cond_2

    .line 95
    .line 96
    sub-int p0, v1, v2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_2
    return p0

    .line 103
    :pswitch_3
    const-string p0, "yyyy-MM-dd"

    .line 104
    .line 105
    check-cast p1, Lp9;

    .line 106
    .line 107
    check-cast p2, Lp9;

    .line 108
    .line 109
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 110
    .line 111
    iget-object v0, p2, Lp9;->α:Ljava/lang/String;

    .line 112
    .line 113
    const-wide/16 v1, 0x0

    .line 114
    .line 115
    :try_start_0
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 116
    .line 117
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 118
    .line 119
    invoke-direct {v3, p0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 129
    .line 130
    .line 131
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_3

    .line 133
    :catchall_0
    :cond_4
    move-wide v3, v1

    .line 134
    :goto_3
    iget-object v0, p1, Lp9;->α:Ljava/lang/String;

    .line 135
    .line 136
    :try_start_1
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 137
    .line 138
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 139
    .line 140
    invoke-direct {v5, p0, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-eqz p0, :cond_5

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 150
    .line 151
    .line 152
    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    :catchall_1
    :cond_5
    invoke-static {v3, v4, v1, v2}, Lln0;->π(JJ)I

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_6

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    iget-wide v0, p2, Lp9;->δ:J

    .line 161
    .line 162
    iget-wide p0, p1, Lp9;->δ:J

    .line 163
    .line 164
    invoke-static {v0, v1, p0, p1}, Lln0;->π(JJ)I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    :goto_4
    return p0

    .line 169
    :pswitch_4
    check-cast p1, Lp9;

    .line 170
    .line 171
    check-cast p2, Lp9;

    .line 172
    .line 173
    iget-wide v0, p2, Lp9;->δ:J

    .line 174
    .line 175
    iget-wide p0, p1, Lp9;->δ:J

    .line 176
    .line 177
    invoke-static {v0, v1, p0, p1}, Lln0;->π(JJ)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    return p0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
