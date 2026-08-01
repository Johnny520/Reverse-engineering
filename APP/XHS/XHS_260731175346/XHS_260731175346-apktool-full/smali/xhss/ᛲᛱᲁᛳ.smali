.class public final Lxhss/ᛲᛱᲁᛳ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Ljava/util/List;

.field public final synthetic ᲇᛴᲇᛵ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛲᛱᲁᛳ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 6

    .line 1
    iget v0, p0, Lxhss/ᛲᛱᲁᛳ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᛲᛱᲁᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, Lxhss/ᛶᛴᛲᛴ;

    .line 38
    .line 39
    invoke-virtual {v5, p1}, Lxhss/ᛶᛴᛲᛴ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛲᛸᲇ(Ljava/util/ArrayList;)[I

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ([I)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move p0, v4

    .line 61
    :goto_1
    invoke-virtual {p1, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v2, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v4, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 78
    .line 79
    .line 80
    return p0

    .line 81
    :pswitch_0
    iget-object p0, p0, Lxhss/ᛲᛱᲁᛳ;->ᛷᛴᛷᛱ:Ljava/util/List;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    new-instance v0, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {p0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Lxhss/ᛸᛸᲀᛷ;

    .line 109
    .line 110
    invoke-virtual {v5, p1}, Lxhss/ᛸᛸᲀᛷ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    invoke-static {v0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛲᛸᲇ(Ljava/util/ArrayList;)[I

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ([I)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    goto :goto_3

    .line 131
    :cond_3
    move p0, v4

    .line 132
    :goto_3
    invoke-virtual {p1, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v2, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v4, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 149
    .line 150
    .line 151
    return p0

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
