.class public Lxhss/ᛴᛱᛶᛸ;
.super Lxhss/ᲇᛶᛴᲀ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᲇᲀᛷ;


# instance fields
.field public final ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;


# direct methods
.method public constructor <init>(Lxhss/ᛴᛵᛳᛵ;Lxhss/ᛸᛴᛳᛷ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lxhss/ᲇᛶᛴᲀ;-><init>(Lxhss/ᛴᛵᛳᛵ;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛷᛴᛷᛱ()Lxhss/ᛱᲇᲀᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public ᛷᛵᛵᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 2
    .line 3
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᲇᛸᛳᲁ(Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lxhss/ᲈᲀᲀᛱ;->ᲁᲁᛴᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1, p0}, Lxhss/ᲈᲀᲀᛱ;->ᛳᛸᛵᲀ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public ᛸᛷᲈᲈ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛱᛶᛸ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛴᛳᛷ;

    .line 2
    .line 3
    invoke-static {p1}, Lxhss/ᲈᲀᲀᛱ;->ᲁᲁᛴᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lxhss/ᛷᛲᛳᛴ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᲁᲁᛴᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
