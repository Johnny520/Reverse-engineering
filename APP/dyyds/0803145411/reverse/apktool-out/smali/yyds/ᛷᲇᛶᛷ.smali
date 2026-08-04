.class public final Lyyds/ᛷᲇᛶᛷ;
.super Lyyds/ᛶᛴᛱᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final ᲀᛲᛳᲀ:[Lyyds/ᲇᲁᲀᲁ;

.field public final ᲇᲈᛵᛷ:[I


# direct methods
.method public constructor <init>([Lyyds/ᲇᲁᲀᲁ;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛷᲇᛶᛷ;->ᲀᛲᛳᲀ:[Lyyds/ᲇᲁᲀᲁ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛷᲇᛶᛷ;->ᲇᲈᛵᛷ:[I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lyyds/ᲇᲁᲀᲁ;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lyyds/ᛲᛱᲁᛳ;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲇᛶᛷ;->ᲀᛲᛳᲀ:[Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    return-object p0
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lyyds/ᲇᲁᲀᲁ;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lyyds/ᛶᛴᛱᛲ;->indexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lyyds/ᲇᲁᲀᲁ;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lyyds/ᛶᛴᛱᛲ;->lastIndexOf(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final ᛲᲈᲁ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲇᛶᛷ;->ᲀᛲᛳᲀ:[Lyyds/ᲇᲁᲀᲁ;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method
