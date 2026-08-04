.class public final Lyyds/ᛲᲈᲁᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

.field public ᛵᛸᛸᛷ:Lyyds/ᛳᛸᛸᛶ;


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lyyds/ᛳᛷᛵᛷ;->ᛲᲈᲁ()Lyyds/ᛶᲈᛷᛸ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛲᲈᲁᛸ;->ᛲᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

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
    iput-object v1, p0, Lyyds/ᛲᲈᲁᛸ;->ᛲᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

    .line 15
    .line 16
    iget-object v1, p0, Lyyds/ᛲᲈᲁᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛳᛸᛸᛶ;

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lyyds/ᛳᛸᛸᛶ;->ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lyyds/ᛲᲈᲁᛸ;->ᛲᲈᲁ:Lyyds/ᛶᲈᛷᛸ;

    .line 22
    .line 23
    return-void
.end method
