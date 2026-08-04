.class public final Lyyds/ᛸᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Z

.field public ᛲᛴᛳᛲ:I

.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:Z

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:I

.field public ᲇᲈᛵᛷ:I


# virtual methods
.method public final ᛲᲈᲁ(II)V
    .locals 2

    .line 1
    iput p1, p0, Lyyds/ᛸᲇᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput p2, p0, Lyyds/ᛸᲇᲈ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lyyds/ᛸᲇᲈ;->ᛱᲈᲁ:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Lyyds/ᛸᲇᲈ;->ᛶᛷᛲᲁ:Z

    .line 9
    .line 10
    const/high16 v1, -0x80000000

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-eq p2, v1, :cond_0

    .line 15
    .line 16
    iput p2, p0, Lyyds/ᛸᲇᲈ;->ᛲᲈᲁ:I

    .line 17
    .line 18
    :cond_0
    if-eq p1, v1, :cond_3

    .line 19
    .line 20
    iput p1, p0, Lyyds/ᛸᲇᲈ;->ᛵᛸᛸᛷ:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-eq p1, v1, :cond_2

    .line 24
    .line 25
    iput p1, p0, Lyyds/ᛸᲇᲈ;->ᛲᲈᲁ:I

    .line 26
    .line 27
    :cond_2
    if-eq p2, v1, :cond_3

    .line 28
    .line 29
    iput p2, p0, Lyyds/ᛸᲇᲈ;->ᛵᛸᛸᛷ:I

    .line 30
    .line 31
    :cond_3
    return-void
.end method
