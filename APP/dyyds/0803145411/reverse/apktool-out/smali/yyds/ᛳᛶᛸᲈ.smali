.class public final Lyyds/ᛳᛶᛸᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:I


# virtual methods
.method public final ᛲᲈᲁ()I
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛳᛶᛸᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛳᛶᛸᲈ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iget v1, p0, Lyyds/ᛳᛶᛸᲈ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    iget p0, p0, Lyyds/ᛳᛶᛸᲈ;->ᛵᛸᛸᛷ:I

    .line 9
    .line 10
    sub-int/2addr v1, p0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
