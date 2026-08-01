.class final Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;
.implements Lxhss/ᛷᛶᲈᲀ;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛱᛶᛴᛴ;


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 0

    .line 1
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 2
    .line 3
    if-eq p2, p1, :cond_2

    .line 4
    .line 5
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 6
    .line 7
    if-ne p2, p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->ᛱᛱᛲᲇ:Lxhss/ᛱᛶᛴᛴ;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lxhss/ᛱᛶᛴᛴ;->cancel()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_DESTROY:Lxhss/ᲈᲀᛵᛸ;

    .line 18
    .line 19
    if-ne p2, p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    throw p0
.end method
