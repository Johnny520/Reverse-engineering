.class public abstract Lyyds/ᲈᛳᛷᛴ;
.super Lyyds/ᛸᲁᛲᲈ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lyyds/ᛸᲁᛲᲈ;-><init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᲈᛳᛷᛴ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lyyds/ᲈᛳᛷᛴ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᛲᛴᛳᛲ:I

    .line 31
    .line 32
    iget p1, p1, Lyyds/ᲇᛸᛷᛳ;->ᛲᛴᛳᛲ:I

    .line 33
    .line 34
    invoke-static {p0, p1}, Lyyds/ᲇᛸᛷᛳ;->ᛲᛳᛴᛸ(II)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    return v0

    .line 41
    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᛲᲈᲁ()Lyyds/ᲈᛶᲈᛴ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeDisplayCutout()Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v0, p0}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public ᛶᛷᛲᲁ()Lyyds/ᛳᛱᛶᛵ;
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->getDisplayCutout()Landroid/view/DisplayCutout;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Lyyds/ᛳᛱᛶᛵ;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lyyds/ᛳᛱᛶᛵ;-><init>(Landroid/view/DisplayCutout;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
