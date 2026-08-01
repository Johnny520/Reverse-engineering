.class public Lxhss/ᲇᛲᛵᲀ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance p0, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/BitSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛱᛱᛲᲇ()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    const/4 v3, 0x2

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x5

    .line 23
    const/4 v5, 0x0

    .line 24
    if-eq v3, v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x6

    .line 27
    if-eq v3, v4, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x7

    .line 30
    if-ne v3, v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛲᛷᛱ()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᛱᛳᲁᲈ(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "; at path "

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const-string v1, "Invalid bitset value type: "

    .line 48
    .line 49
    invoke-static {v1, p0, v0, p1}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛶᲈᛶ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object v5

    .line 53
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᛶᛷᲀ()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    move v0, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v3, 0x1

    .line 62
    if-ne v0, v3, :cond_4

    .line 63
    .line 64
    move v0, v3

    .line 65
    :goto_1
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, v2}, Ljava/util/BitSet;->set(I)V

    .line 68
    .line 69
    .line 70
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    const-string p0, ", expected 0 or 1; at path "

    .line 78
    .line 79
    invoke-virtual {p1, v3}, Lxhss/ᛴᛷᛸᛷ;->ᲇᛸᛳᲁ(Z)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v1, "Invalid bitset value "

    .line 84
    .line 85
    invoke-static {v1, v0, p0, p1}, Lxhss/ᛴᛳᲀᛷ;->ᛷᛵᛵᲈ(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-object v5

    .line 89
    :cond_5
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛲᲀᛵ()V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Ljava/util/BitSet;

    .line 2
    .line 3
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲁᲇᛸ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-ge v0, p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Ljava/util/BitSet;->get(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-long v1, v1

    .line 18
    invoke-virtual {p1, v1, v2}, Lxhss/ᛸᲈᲈᛶ;->ᛴᲈᛱᛴ(J)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛸᛲᲀᛵ()V

    .line 25
    .line 26
    .line 27
    return-void
.end method
