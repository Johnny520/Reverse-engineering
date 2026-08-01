.class public final Lxhss/ᛲᛳᛱᛱ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;


# direct methods
.method public static ᛵᛲᲁᛶ(Lxhss/ᛲᛳᛱᛱ;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛳᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛴᲁᛶᲁ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lxhss/ᛲᛳᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;

    .line 11
    .line 12
    new-instance p0, Lxhss/ᛳᛲᛶᛶ;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p0, p1, v1, v2}, Lxhss/ᛳᛲᛶᛶ;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    iput-object p0, v0, Lxhss/ᛴᲁᛶᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final ᛵᛷᛲᛸ(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛳᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lxhss/ᛴᲁᛶᲁ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lxhss/ᛲᛳᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;

    .line 11
    .line 12
    new-instance p0, Lxhss/ᛵᛴᛳᛶ;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, v1, v2}, Lxhss/ᛵᛴᛳᛶ;->ᛵᛲᲁᛶ(Ljava/lang/String;IZ)V

    .line 20
    .line 21
    .line 22
    iput-object p0, v0, Lxhss/ᛴᲁᛶᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

    .line 23
    .line 24
    return-void
.end method

.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛲᛳᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛴᲁᛶᲁ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lxhss/ᛴᲁᛶᲁ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-virtual {p1, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    invoke-virtual {p1, p0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 26
    .line 27
    .line 28
    return p0

    .line 29
    :cond_0
    const-string p0, "UsingFieldMatcher matcher not set"

    .line 30
    .line 31
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v0
.end method
