.class public final Lyyds/ᛱᛱᛱᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:Z


# virtual methods
.method public final ᛲᲈᲁ()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛱᛱᲁ;->ᲀᛲᛳᲀ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lyyds/ᛱᛱᛱᲁ;->ᛵᛸᛸᛷ:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-boolean p0, p0, Lyyds/ᛱᛱᛱᲁ;->ᛲᲈᲁ:Z

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, 0x0

    .line 16
    return p0
.end method
