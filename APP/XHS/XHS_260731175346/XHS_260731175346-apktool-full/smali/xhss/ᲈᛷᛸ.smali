.class public final Lxhss/ᲈᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/util/Iterator;
.implements Lxhss/ᛱᛶᲈᛵ;


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public ᛳᲁᲇᛸ:I

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᲈᛱᛱᲀ;


# direct methods
.method public constructor <init>(Lxhss/ᲈᛱᛱᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᛷᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛱᛱᲀ;

    .line 5
    .line 6
    const/4 p1, -0x2

    .line 7
    iput p1, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᲈᛷᛸ;->ᛷᛵᛵᲈ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget p0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

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
    iget v0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᲈᛷᛸ;->ᛷᛵᛵᲈ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᲈᛷᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v1, -0x1

    .line 15
    iput v1, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

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

.method public final ᛷᛵᛵᲈ()V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᲈᛷᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲈᛱᛱᲀ;

    .line 7
    .line 8
    iget-object v0, v0, Lxhss/ᲈᛱᛱᲀ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lxhss/ᛲᛶᲀᛲ;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxhss/ᛲᛶᲀᛲ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Lxhss/ᲈᛷᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    check-cast v0, Landroid/view/View;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    iput-object v0, p0, Lxhss/ᲈᛷᛸ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    const/4 v0, 0x1

    .line 40
    :goto_1
    iput v0, p0, Lxhss/ᲈᛷᛸ;->ᛳᲁᲇᛸ:I

    .line 41
    .line 42
    return-void
.end method
