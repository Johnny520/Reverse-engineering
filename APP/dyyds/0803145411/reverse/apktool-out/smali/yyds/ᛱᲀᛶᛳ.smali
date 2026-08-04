.class public final Lyyds/ᛱᲀᛶᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# instance fields
.field public final ᛲᲈᲁ:Landroid/view/MenuItem$OnActionExpandListener;

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛸᛶᲇᛳ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᛶᲇᛳ;Landroid/view/MenuItem$OnActionExpandListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᲀᛶᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛶᲇᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᲀᛶᛳ;->ᛲᲈᲁ:Landroid/view/MenuItem$OnActionExpandListener;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛶᲇᛳ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᲁᲀᛶᲈ;->ᲇᲇᲇᛱ(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lyyds/ᛱᲀᛶᛳ;->ᛲᲈᲁ:Landroid/view/MenuItem$OnActionExpandListener;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛱᲀᛶᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛸᛶᲇᛳ;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lyyds/ᲁᲀᛶᲈ;->ᲇᲇᲇᛱ(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lyyds/ᛱᲀᛶᛳ;->ᛲᲈᲁ:Landroid/view/MenuItem$OnActionExpandListener;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
