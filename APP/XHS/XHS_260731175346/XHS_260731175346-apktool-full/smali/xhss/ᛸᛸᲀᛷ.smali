.class public final Lxhss/ᛸᛸᲀᛷ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:Lxhss/ᛱᲇᛴᲇ;


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 6

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛸᲀᛷ;->ᲇᛴᲇᛵ:Lxhss/ᛱᲇᛴᲇ;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget v5, p0, Lxhss/ᛱᲇᛴᲇ;->ᛱᛱᛲᲇ:I

    .line 11
    .line 12
    if-eqz v5, :cond_0

    .line 13
    .line 14
    packed-switch v5, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    throw v3

    .line 18
    :pswitch_0
    const/16 v5, 0xf

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    const/16 v5, 0xe

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_2
    const/16 v5, 0xd

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_3
    const/16 v5, 0xc

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_4
    const/16 v5, 0xb

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_5
    const/16 v5, 0xa

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_6
    const/16 v5, 0x9

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_7
    const/16 v5, 0x8

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_8
    const/4 v5, 0x7

    .line 43
    goto :goto_0

    .line 44
    :pswitch_9
    const/4 v5, 0x6

    .line 45
    goto :goto_0

    .line 46
    :pswitch_a
    const/4 v5, 0x5

    .line 47
    goto :goto_0

    .line 48
    :pswitch_b
    const/4 v5, 0x4

    .line 49
    goto :goto_0

    .line 50
    :pswitch_c
    move v5, v2

    .line 51
    goto :goto_0

    .line 52
    :pswitch_d
    move v5, v1

    .line 53
    goto :goto_0

    .line 54
    :pswitch_e
    move v5, v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v5, v4

    .line 57
    :goto_0
    if-eqz p0, :cond_1

    .line 58
    .line 59
    iget-object p0, p0, Lxhss/ᛱᲇᛴᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v3, p0

    .line 62
    check-cast v3, Lxhss/ᛳᛲᛶᛶ;

    .line 63
    .line 64
    :cond_1
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-virtual {v3, p1}, Lxhss/ᛶᛵᛱ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move p0, v4

    .line 72
    :goto_1
    invoke-virtual {p1, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v4, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0, v5}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 89
    .line 90
    .line 91
    return p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
