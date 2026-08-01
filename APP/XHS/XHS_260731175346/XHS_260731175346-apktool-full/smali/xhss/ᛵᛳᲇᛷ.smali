.class public abstract Lxhss/ᛵᛳᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method public static ᛷᛵᛵᲈ(Landroid/view/View;Lxhss/ᛸᛱᛷᛴ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lxhss/ᛲᲀᛳᲇ;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lxhss/ᛲᲀᛳᲇ;-><init>(Landroid/view/View;Lxhss/ᛸᛱᛷᛴ;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const p1, 0x64080100

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    const p1, 0x64080110

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/view/View$OnApplyWindowInsetsListener;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
