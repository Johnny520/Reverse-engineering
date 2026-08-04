.class public final Lyyds/ᛷᲈᛴᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛳᲈᛵ;
.implements Ljava/io/Serializable;


# instance fields
.field public ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲁᲀ;

.field public ᲇᲈᛵᛷ:Ljava/lang/Object;


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲈᛴᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛷᲈᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲁᲀ;

    .line 8
    .line 9
    invoke-interface {v0}, Lyyds/ᲁᛶᲁᲀ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyyds/ᛷᲈᛴᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iput-object v1, p0, Lyyds/ᛷᲈᛴᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛶᲁᲀ;

    .line 17
    .line 18
    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᲈᛴᲁ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛷᲈᛴᲁ;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Lazy value not initialized yet."

    .line 17
    .line 18
    return-object p0
.end method
