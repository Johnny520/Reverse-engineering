.class public final Lxhss/ᲈᛴᲈᛵ;
.super Lxhss/ᛵᛶᛲᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Iterator;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public final synthetic ᲇᛶᛴᲀ:I


# direct methods
.method public constructor <init>(Lxhss/ᛷᛸᛵᛶ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲈᛴᲈᛵ;->ᲇᛶᛴᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p2, -0x1

    .line 9
    iput p2, p0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 10
    .line 11
    iget p1, p1, Lxhss/ᛷᛸᛵᛶ;->ᛸᛲᲀᛵ:I

    .line 12
    .line 13
    iput p1, p0, Lxhss/ᛵᛶᛲᛵ;->ᲇᛴᲇᛵ:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛴᲈᛵ;->ᲇᛶᛴᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 10
    .line 11
    iget-object v1, p0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lxhss/ᛷᛸᛵᛶ;

    .line 14
    .line 15
    iget v2, v1, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 22
    .line 23
    iput v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 24
    .line 25
    iget-object v1, v1, Lxhss/ᛷᛸᛵᛶ;->ᛳᲁᲇᛸ:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v1, v0

    .line 28
    .line 29
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :pswitch_0
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ()V

    .line 40
    .line 41
    .line 42
    iget v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 43
    .line 44
    iget-object v1, p0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Lxhss/ᛷᛸᛵᛶ;

    .line 47
    .line 48
    iget v2, v1, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 49
    .line 50
    if-ge v0, v2, :cond_1

    .line 51
    .line 52
    add-int/lit8 v2, v0, 0x1

    .line 53
    .line 54
    iput v2, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 55
    .line 56
    iput v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 57
    .line 58
    iget-object v1, v1, Lxhss/ᛷᛸᛵᛶ;->ᛱᛱᛲᲇ:[Ljava/lang/Object;

    .line 59
    .line 60
    aget-object v0, v1, v0

    .line 61
    .line 62
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 67
    .line 68
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :pswitch_1
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ()V

    .line 73
    .line 74
    .line 75
    iget v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 76
    .line 77
    iget-object v1, p0, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, Lxhss/ᛷᛸᛵᛶ;

    .line 80
    .line 81
    iget v2, v1, Lxhss/ᛷᛸᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 82
    .line 83
    if-ge v0, v2, :cond_2

    .line 84
    .line 85
    add-int/lit8 v2, v0, 0x1

    .line 86
    .line 87
    iput v2, p0, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 88
    .line 89
    iput v0, p0, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ:I

    .line 90
    .line 91
    new-instance v2, Lxhss/ᲀᛵᲁᛱ;

    .line 92
    .line 93
    invoke-direct {v2, v1, v0}, Lxhss/ᲀᛵᲁᛱ;-><init>(Lxhss/ᛷᛸᛵᛶ;I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lxhss/ᛵᛶᛲᛵ;->ᛳᲁᲇᛸ()V

    .line 97
    .line 98
    .line 99
    return-object v2

    .line 100
    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 101
    .line 102
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 103
    .line 104
    .line 105
    throw p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
