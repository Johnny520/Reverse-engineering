.class public abstract Lxhss/ᲁᲁᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method public static ᛷᛵᛵᲈ(Landroid/view/View;)Lxhss/ᲀᛳᛲᛶ;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {v1, v0}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛱ;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lxhss/ᛵᛸᛱ;->ᛸᛲᛷᛱ(Lxhss/ᲀᛳᛲᛶ;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v1, p0}, Lxhss/ᛵᛸᛱ;->ᲇᛴᲇᛵ(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Lxhss/ᛵᛸᛱ;->ᲈᛳᲀ(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lxhss/ᛵᛸᛱ;->ᛷᲁᲁ()V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
