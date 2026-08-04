.class public final Lyyds/ᛸᛱᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛸᲇᛲ;
.implements Lyyds/ᲀᛱᲀᛳ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛶᛸ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛶᛶᛸ;Lyyds/ᛸᲀᛱᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛱᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛶᛸ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛸᲀᛱᛴ;->ᛱᲈᲁ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᲀᛱᛴ;->ᛶᛷᛲᲁ:Lyyds/ᲁᛴᛲ;

    .line 4
    .line 5
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛵᛳᛳᛷ;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᛸᲀᛱᛴ;->ᛲᲈᲁ(Lyyds/ᛵᛳᛳᛷ;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛸᲈᛵᛸ;)V
    .locals 3

    .line 1
    sget-object p1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object v1, p0, Lyyds/ᛸᛱᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛶᛸ;

    .line 5
    .line 6
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lyyds/ᲈᛷᲈᛶ;

    .line 10
    .line 11
    invoke-direct {p1, v1, p0}, Lyyds/ᲈᛷᲈᛶ;-><init>(Lyyds/ᲁᛶᛶᛸ;Lyyds/ᛸᛱᛳᛴ;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 15
    .line 16
    iget v0, p0, Lyyds/ᲀᛶᛳᲁ;->ᛲᛴᛳᛲ:I

    .line 17
    .line 18
    new-instance v1, Lyyds/ᛸᲈᛵᛸ;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v2, p1}, Lyyds/ᛸᲈᛵᛸ;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v0, v1}, Lyyds/ᛸᲀᛱᛴ;->ᛸᛸᛷᛱ(Ljava/lang/Object;ILyyds/ᛲᛲᲀᛷ;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final ᛷᛲᲈᛱ(Lyyds/ᛸᲈᛵᛸ;)Lyyds/ᛲᛸᛴᛶ;
    .locals 2

    .line 1
    new-instance p1, Lyyds/ᛸᲈᛵᛸ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛶᛸ;

    .line 4
    .line 5
    invoke-direct {p1, v0, p0}, Lyyds/ᛸᲈᛵᛸ;-><init>(Lyyds/ᲁᛶᛶᛸ;Lyyds/ᛸᛱᛳᛴ;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 9
    .line 10
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 11
    .line 12
    invoke-virtual {p0, v1, p1}, Lyyds/ᛸᲀᛱᛴ;->ᛷᛶᛷᲀ(Ljava/lang/Object;Lyyds/ᛲᛲᲀᛷ;)Lyyds/ᛲᛸᛴᛶ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lyyds/ᲁᛶᛶᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public final ᛷᛵᲇᲀ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛸᛱᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛱᛴ;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lyyds/ᛸᲀᛱᛴ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
