.class public final Lyyds/ᛴᛶᲁᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public ᛵᛸᛸᛷ:F

.field public ᲀᛲᛳᲀ:F


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛴᛱᛱᛸ;Lyyds/ᲇᛵᲈᛵ;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    iget-object v0, p2, Lyyds/ᲇᛵᲈᛵ;->ᲇᲈᛵᛷ:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v1, p2, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛴᛱᛱᛸ;->ᛲᲀᛲᛲ()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    new-instance v1, Lyyds/ᛸᛶᛱᲈ;

    .line 21
    .line 22
    invoke-direct {v1, p0, p1, p2, v0}, Lyyds/ᛸᛶᛱᲈ;-><init>(Lyyds/ᛴᛶᲁᛶ;Lyyds/ᛴᛱᛱᛸ;Lyyds/ᲇᛵᲈᛵ;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object p0, p2, Lyyds/ᲇᛵᲈᛵ;->ᛶᛷᛲᲁ:Lyyds/ᲀᛶᛴᛷ;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    invoke-interface {p0, p1}, Lyyds/ᲀᛶᛴᛷ;->ᛵᛸᛸᛷ(Z)V

    .line 35
    .line 36
    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    invoke-virtual {v0, p0}, Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    :goto_0
    return-void
.end method
