.class public final Lxhss/ᲁᛴᲇᛲ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:I

.field public final synthetic ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲁᛴᲇᛲ;->ᲇᛴᲇᛵ:I

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
    iget v0, p0, Lxhss/ᲁᛴᲇᛲ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget v0, p0, Lxhss/ᲁᛴᲇᛲ;->ᛷᛴᛷᛱ:I

    .line 11
    .line 12
    iget p0, p0, Lxhss/ᲁᛴᲇᛲ;->ᲇᛶᛴᲀ:I

    .line 13
    .line 14
    invoke-virtual {p1, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 20
    .line 21
    .line 22
    iget-object v3, p1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 23
    .line 24
    iget v5, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 25
    .line 26
    sub-int/2addr v5, v1

    .line 27
    iput v5, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 28
    .line 29
    invoke-virtual {v3, v5, p0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    iget-object p0, p1, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 33
    .line 34
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    aput v3, p0, v2

    .line 39
    .line 40
    :cond_0
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1, v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    iget v2, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 48
    .line 49
    sub-int/2addr v2, v1

    .line 50
    iput v2, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 51
    .line 52
    invoke-virtual {p0, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    iget-object p0, p1, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 56
    .line 57
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    aput v0, p0, v4

    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 68
    .line 69
    .line 70
    return p0

    .line 71
    :pswitch_0
    iget v0, p0, Lxhss/ᲁᛴᲇᛲ;->ᛷᛴᛷᛱ:I

    .line 72
    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    iget p0, p0, Lxhss/ᲁᛴᲇᛲ;->ᲇᛶᛴᲀ:I

    .line 76
    .line 77
    if-eq p0, v2, :cond_3

    .line 78
    .line 79
    if-ne p0, v3, :cond_2

    .line 80
    .line 81
    move p0, v2

    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 p0, 0x0

    .line 84
    throw p0

    .line 85
    :cond_3
    move p0, v4

    .line 86
    :goto_0
    invoke-virtual {p1, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 87
    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, v1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᲁᲁ(II)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p1, Lxhss/ᛱᲁᛴᲈ;->ᛷᛵᛵᲈ:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iget v5, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 97
    .line 98
    sub-int/2addr v5, v1

    .line 99
    iput v5, p1, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ:I

    .line 100
    .line 101
    invoke-virtual {v3, v5, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 102
    .line 103
    .line 104
    iget-object v0, p1, Lxhss/ᛱᲁᛴᲈ;->ᲇᛴᲇᛵ:[I

    .line 105
    .line 106
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᲈᛳᲀ()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    aput v1, v0, v4

    .line 111
    .line 112
    :cond_4
    invoke-virtual {p1, v2, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {p1, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_5
    const-string p0, "modifiers must not be 0"

    .line 124
    .line 125
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    return v4

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
