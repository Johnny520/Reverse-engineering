.class public abstract Lxhss/ᛷᛱᛸᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# direct methods
.method public static ᛷᛵᛵᲈ(Landroid/app/Activity;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lxhss/ᛴᛷᲀᲁ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lxhss/ᛴᛷᲀᲁ;

    .line 6
    .line 7
    invoke-interface {p0}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
