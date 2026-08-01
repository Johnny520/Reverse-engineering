.class public final Lxhss/ᲀᛸᛸᲁ;
.super Lxhss/ᛷᛴᛷᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛱᛳᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v0, p1, Lxhss/ᛷᛴᲇᲀ;

    .line 6
    .line 7
    :goto_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᛷᛴᲇᲀ;

    .line 12
    .line 13
    invoke-super {p0, p1}, Lxhss/ᛷᛴᛷᛱ;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Lxhss/ᛱᛲᲇᲀ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛷᛴᛷᛱ;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    sub-int/2addr v1, v2

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v3, v1, v2}, Lxhss/ᲁᛵᛶᲁ;-><init>(III)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lxhss/ᲈᛱᛱᲀ;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2, v0}, Lxhss/ᲈᛱᛱᲀ;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lxhss/ᲇᛴᲇᛵ;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-direct {v0, v2, p0}, Lxhss/ᲇᛴᲇᛵ;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lxhss/ᲀᛲᲇᛲ;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {p0, v1, v0, v2}, Lxhss/ᲀᛲᲇᛲ;-><init>(Ljava/lang/Object;Lxhss/ᲁᛳᲀᛴ;I)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lxhss/ᛵᛴᛱᲈ;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Lxhss/ᛵᛴᛱᲈ;-><init>(Lxhss/ᲀᛲᲇᛲ;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final ᛱᛱᛲᲇ(I)Lxhss/ᛷᛴᲇᲀ;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->start(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->end(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v1, v0, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    new-instance v1, Lxhss/ᛷᛴᲇᲀ;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v1, p0, v0}, Lxhss/ᛷᛴᲇᲀ;-><init>(Ljava/lang/String;Lxhss/ᛱᛲᲇᲀ;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛸᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ljava/util/regex/Matcher;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->groupCount()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    add-int/lit8 p0, p0, 0x1

    .line 12
    .line 13
    return p0
.end method
