.class public final Lxhss/ᛶᛴᛲᛴ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:Lxhss/ᛲᛱᲁᛳ;


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛶᛴᛲᛴ;->ᲇᛴᲇᛵ:Lxhss/ᛲᛱᲁᛳ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lxhss/ᛲᛱᲁᛳ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p0, v0

    .line 12
    :goto_0
    const/4 v1, 0x5

    .line 13
    invoke-virtual {p1, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    invoke-virtual {p1, v1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    invoke-virtual {p1, p0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x2

    .line 32
    invoke-virtual {p1, p0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 40
    .line 41
    .line 42
    return p0
.end method
