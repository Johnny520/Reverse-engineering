.class public final Lxhss/ᛵᛸᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲇᲀ;

.field public ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lxhss/ᲈᲀᛵᛸ;->ᛷᛵᛵᲈ()Lxhss/ᛱᛷᛸᲁ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    :cond_0
    iput-object v1, p0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 15
    .line 16
    iget-object v1, p0, Lxhss/ᛵᛸᛱᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲇᲀ;

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lxhss/ᛷᲁᲇᲀ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 22
    .line 23
    return-void
.end method
