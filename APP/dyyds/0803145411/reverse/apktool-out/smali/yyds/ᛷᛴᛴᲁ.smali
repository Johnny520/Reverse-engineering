.class public final Lyyds/ᛷᛴᛴᲁ;
.super Lyyds/ᛲᲀᛵᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛱᛲ;


# direct methods
.method public constructor <init>(Lyyds/ᛶᛴᛱᛲ;I)V
    .locals 2

    .line 1
    iput-object p1, p0, Lyyds/ᛷᛴᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛱᛲ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1}, Lyyds/ᛲᲀᛵᛷ;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lyyds/ᛲᛱᲁᛳ;->ᛲᲈᲁ()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p2, :cond_0

    .line 12
    .line 13
    if-gt p2, p1, :cond_0

    .line 14
    .line 15
    iput p2, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 19
    .line 20
    const-string v0, "index: "

    .line 21
    .line 22
    const-string v1, ", size: "

    .line 23
    .line 24
    invoke-static {p2, p1, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᲈᲁ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final hasPrevious()Z
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final nextIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    return p0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᛷᛴᛴᲁ;->hasPrevious()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    iput v0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛷᛴᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛶᛴᛱᛲ;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 21
    .line 22
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public final previousIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛲᲀᛵᛷ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, -0x1

    .line 4
    .line 5
    return p0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string p1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
