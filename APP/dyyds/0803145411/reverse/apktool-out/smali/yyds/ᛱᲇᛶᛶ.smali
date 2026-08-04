.class public abstract Lyyds/ᛱᲇᛶᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# direct methods
.method public static ᛲᲈᲁ(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    .line 1
    invoke-static {p0}, Lyyds/ᛴᛵᛷᛳ;->ᛶᛷᛲᲁ(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/Object;Lyyds/ᲁᛲᲀᛷ;)Landroid/window/OnBackInvokedCallback;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲈᛴᛴᛷ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Lyyds/ᲈᛴᛴᛷ;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lyyds/ᛴᛵᛷᛳ;->ᛱᲈᲁ(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0, v0}, Lyyds/ᛴᛵᛷᛳ;->ᛱᛳᲇ(Landroid/window/OnBackInvokedDispatcher;Lyyds/ᲈᛴᛴᛷ;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static ᲀᛲᛳᲀ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lyyds/ᛴᛵᛷᛳ;->ᲇᲇᲇᛱ(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Lyyds/ᛴᛵᛷᛳ;->ᛱᲈᲁ(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0, p1}, Lyyds/ᛴᛵᛷᛳ;->ᛲᛲᲈᲈ(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
