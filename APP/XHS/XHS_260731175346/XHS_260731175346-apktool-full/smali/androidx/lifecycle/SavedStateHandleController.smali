.class public final Landroidx/lifecycle/SavedStateHandleController;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public ᛱᛱᛲᲇ:Z


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᲈᲀᛵᛸ;->ON_DESTROY:Lxhss/ᲈᲀᛵᛸ;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->ᛱᛱᛲᲇ:Z

    .line 7
    .line 8
    invoke-interface {p1}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
