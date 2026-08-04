.class public final Lyyds/ᛸᛴᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

.field public ᛵᛸᛸᛷ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Lyyds/ᛱᛱᛴ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    iput v0, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 11
    .line 12
    iput-object p1, p0, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 8
    .line 9
    if-eq v0, v1, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 19
    .line 20
    iget v1, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 21
    .line 22
    iget-object v2, v2, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Lyyds/ᛲᛷᛱᲀ;

    .line 25
    .line 26
    iget-object v2, v2, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Lyyds/ᛴᛲᲇᛵ;->ᲀᛲᛳᲀ(II)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 33
    .line 34
    iget v1, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 35
    .line 36
    invoke-virtual {v2, v0, v1}, Lyyds/ᛱᛱᛴ;->ᛲᛳᛴᛸ(II)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 41
    .line 42
    iget v1, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 43
    .line 44
    invoke-virtual {v2, v0, v1}, Lyyds/ᛱᛱᛴ;->ᛵᲀᛵᛸ(II)V

    .line 45
    .line 46
    .line 47
    :goto_0
    const/4 v0, 0x0

    .line 48
    iput v0, p0, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 49
    .line 50
    return-void
.end method

.method public final ᛵᛸᛸᛷ(II)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 7
    .line 8
    iget v2, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    add-int/2addr v2, v0

    .line 11
    if-gt p1, v2, :cond_0

    .line 12
    .line 13
    add-int v3, p1, p2

    .line 14
    .line 15
    if-lt v3, v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 22
    .line 23
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget p2, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 28
    .line 29
    sub-int/2addr p1, p2

    .line 30
    iput p1, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ()V

    .line 34
    .line 35
    .line 36
    iput p1, p0, Lyyds/ᛸᛴᛷ;->ᲀᛲᛳᲀ:I

    .line 37
    .line 38
    iput p2, p0, Lyyds/ᛸᛴᛷ;->ᲇᲈᛵᛷ:I

    .line 39
    .line 40
    iput v1, p0, Lyyds/ᛸᛴᛷ;->ᛵᛸᛸᛷ:I

    .line 41
    .line 42
    return-void
.end method

.method public final ᲀᛲᛳᲀ(II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lyyds/ᛸᛴᛷ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛱᛱᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛲᛷᛱᲀ;

    .line 9
    .line 10
    iget-object p0, p0, Lyyds/ᛲᛵᲇᛳ;->ᛲᲈᲁ:Lyyds/ᛴᛲᲇᛵ;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᛲᲇᛵ;->ᛵᛸᛸᛷ(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
