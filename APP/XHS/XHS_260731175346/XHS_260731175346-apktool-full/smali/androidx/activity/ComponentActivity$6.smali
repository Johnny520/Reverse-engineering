.class Landroidx/activity/ComponentActivity$6;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 0

    .line 1
    sget-object p0, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 2
    .line 3
    if-ne p2, p0, :cond_1

    .line 4
    .line 5
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 p1, 0x21

    .line 8
    .line 9
    if-ge p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget p0, Lxhss/ᛲᛸᛱᛸ;->ᛷᛵᛵᲈ:I

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0

    .line 16
    :cond_1
    :goto_0
    return-void
.end method
