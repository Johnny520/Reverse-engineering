.class public final Lyyds/ᲀᲈᲁᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public volatile ᛲᲈᲁ:Z

.field public volatile ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛱᛷ;


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲈᲀᛱᛷ;)V
    .locals 2

    .line 1
    const-wide v0, -0x21b22e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᲀᲈᲁᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛱᛷ;

    .line 10
    .line 11
    iget-boolean p0, p0, Lyyds/ᲀᲈᲁᛷ;->ᛲᲈᲁ:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᲀᲈᲁᛷ;->ᛲᲈᲁ:Z

    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᲀᲈᲁᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛱᛷ;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᲈᲀᛱᛷ;->ᲀᛲᛳᲀ()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Lyyds/ᲈᲀᛱᛷ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᲀᲈᲁᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛱᛷ;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lyyds/ᲀᲈᲁᛷ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛱᛷ;

    .line 15
    .line 16
    return-void
.end method
