.class public abstract Lyyds/ᛶᛶᲀᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛲᲈᲁ(Landroid/view/View;)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getReceiveContentMimeTypes()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static ᛵᛸᛸᛷ(Landroid/view/View;Lyyds/ᛵᛸᛸᛴ;)Lyyds/ᛵᛸᛸᛴ;
    .locals 1

    .line 1
    iget-object v0, p1, Lyyds/ᛵᛸᛸᛴ;->ᛲᲈᲁ:Lyyds/ᲀᛱᛸᛶ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᲀᛱᛸᛶ;->ᲇᛱᛲ()Landroid/view/ContentInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->performReceiveContent(Landroid/view/ContentInfo;)Landroid/view/ContentInfo;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    if-ne p0, v0, :cond_1

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_1
    new-instance p1, Lyyds/ᛵᛸᛸᛴ;

    .line 19
    .line 20
    new-instance v0, Lyyds/ᛱᛱᛴ;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lyyds/ᛱᛱᛴ;-><init>(Landroid/view/ContentInfo;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Lyyds/ᛵᛸᛸᛴ;-><init>(Lyyds/ᲀᛱᛸᛶ;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method
