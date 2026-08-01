.class public final Lxhss/ᲈᛳᲀ;
.super Lxhss/ᛷᲁᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲁ;

.field public final ᛳᲁᲇᛸ:I

.field public final ᲇᛴᲇᛵ:I


# direct methods
.method public constructor <init>(Lxhss/ᛷᲁᲁ;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᛳᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲁ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᲈᛳᲀ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    invoke-virtual {p1}, Lxhss/ᛷᛴᛷᛱ;->ᛷᛵᛵᲈ()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p2, p3, p1}, Lxhss/ᛶᛵᛱ;->ᛱᛱᛲᲇ(III)V

    .line 13
    .line 14
    .line 15
    sub-int/2addr p3, p2

    .line 16
    iput p3, p0, Lxhss/ᲈᛳᲀ;->ᲇᛴᲇᛵ:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᲀ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-ge p1, v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lxhss/ᲈᛳᲀ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    add-int/2addr v0, p1

    .line 10
    iget-object p0, p0, Lxhss/ᲈᛳᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲁ;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 18
    .line 19
    const-string v1, "index: "

    .line 20
    .line 21
    const-string v2, ", size: "

    .line 22
    .line 23
    invoke-static {p1, v0, v1, v2}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᲈᛶ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲈᛳᲀ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lxhss/ᛶᛵᛱ;->ᛱᛱᛲᲇ(III)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxhss/ᲈᛳᲀ;

    .line 7
    .line 8
    iget v1, p0, Lxhss/ᲈᛳᲀ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr v1, p2

    .line 12
    iget-object p0, p0, Lxhss/ᲈᛳᲀ;->ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲁ;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, v1}, Lxhss/ᲈᛳᲀ;-><init>(Lxhss/ᛷᲁᲁ;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final ᛷᛵᛵᲈ()I
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲈᛳᲀ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    return p0
.end method
