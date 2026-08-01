.class public final Lxhss/ᛸᛲᲇᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛸᛲᲇᲁ;->ᛷᛵᛵᲈ:I

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
    iget p0, p0, Lxhss/ᛸᛲᲇᲁ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Comparable;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Comparable;

    .line 9
    .line 10
    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p1, Lxhss/ᛳᛸᛸᛵ;

    .line 16
    .line 17
    iget-object p0, p1, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 18
    .line 19
    check-cast p2, Lxhss/ᛳᛸᛸᛵ;

    .line 20
    .line 21
    iget-object p1, p2, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_1
    check-cast p1, Lxhss/ᲀᛷᲀᲇ;

    .line 29
    .line 30
    iget-object p0, p1, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 31
    .line 32
    check-cast p2, Lxhss/ᲀᛷᲀᲇ;

    .line 33
    .line 34
    iget-object p1, p2, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_2
    check-cast p1, Lxhss/ᲇᛸᛳᛸ;

    .line 42
    .line 43
    iget-object p0, p1, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 44
    .line 45
    check-cast p2, Lxhss/ᲇᛸᛳᛸ;

    .line 46
    .line 47
    iget-object p1, p2, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lxhss/ᛸᛶᛳᛷ;->ᛱᛱᛲᲇ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0

    .line 54
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    check-cast p2, Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    const/4 v0, 0x4

    .line 80
    :goto_0
    if-ge v0, p0, :cond_1

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eq v1, v2, :cond_0

    .line 91
    .line 92
    invoke-static {v1, v2}, Lxhss/ᛱᛱᛷᛸ;->ᲇᛴᲇᛵ(II)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-gez p0, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eq p0, p1, :cond_3

    .line 111
    .line 112
    if-ge p0, p1, :cond_2

    .line 113
    .line 114
    :goto_1
    const/4 p0, -0x1

    .line 115
    goto :goto_2

    .line 116
    :cond_2
    const/4 p0, 0x1

    .line 117
    goto :goto_2

    .line 118
    :cond_3
    const/4 p0, 0x0

    .line 119
    :goto_2
    return p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
