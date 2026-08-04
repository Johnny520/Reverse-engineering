.class public final Lyyds/ᛸᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/Iterator;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᲈᛸᲀᛱ;

.field public ᲀᛲᛳᲀ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᲈᛸᲀᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᲀᛱ;

    .line 5
    .line 6
    const/4 p1, -0x2

    .line 7
    iput p1, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛸᛴ;->ᛲᲈᲁ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget p0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛸᛴ;->ᛲᲈᲁ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᛸᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    iget-object v2, p0, Lyyds/ᛸᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᛸᲀᛱ;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, v2, Lyyds/ᲈᛸᲀᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyyds/ᛵᲇᛵᲇ;

    .line 11
    .line 12
    invoke-virtual {v0}, Lyyds/ᛵᲇᛵᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, v2, Lyyds/ᲈᛸᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᛸᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-interface {v0, v1}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    iput-object v0, p0, Lyyds/ᛸᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v0, 0x1

    .line 32
    :goto_1
    iput v0, p0, Lyyds/ᛸᛴ;->ᲇᲈᛵᛷ:I

    .line 33
    .line 34
    return-void
.end method
