.class public final Lyyds/ᛳᛵᛸᛱ;
.super Lyyds/ᲁᛱᲈᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᲇᲈᛵᛷ:Lyyds/ᲈᛳᛳᛵ;


# virtual methods
.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-interface {p1}, Lyyds/ᲁᛱᛸᛵ;->ᛵᛸᛸᛷ()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final ᲀᛲᛳᲀ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛶᲀᛶᲀ;

    .line 2
    .line 3
    check-cast p2, Lyyds/ᲁᛱᛸᛵ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛳᛵᛸᛱ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛳᛳᛵ;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲈᛳᛳᛵ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛶᛳᛸ;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p0, p2, p1}, Lyyds/ᛷᛶᛳᛸ;->ᛲᲈᲁ(Lyyds/ᲁᛱᛸᛵ;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
