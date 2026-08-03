.class public LYue/ۥۡ۠ۦۨ$ۥ۟۟;
.super LYue/ۥ۠۠ۢ۠;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡ۠ۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟ۡۧ:I

.field public final ۥ۟۟ۡۨ:I

.field public ۥ۟۟ۢ:LYue/ۥۡ۠ۦۤ;

.field public ۥ۟۟ۢ۟:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    invoke-direct {p0, p1, p2}, LYue/ۥ۠۠ۢ۠;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    const/16 v0, 0x16

    const/16 v1, 0x15

    if-ne p2, p1, :cond_0

    iput v1, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۧ:I

    iput v0, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۨ:I

    goto :goto_0

    :cond_0
    iput v0, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۧ:I

    iput v1, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۨ:I

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic hasFocus()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠۠ۢ۠;->hasFocus()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic hasWindowFocus()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠۠ۢ۠;->hasWindowFocus()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isFocused()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠۠ۢ۠;->isFocused()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic isInTouchMode()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠۠ۢ۠;->isInTouchMode()Z

    move-result v0

    return v0
.end method

.method public onHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۡ۠ۦۤ;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/HeaderViewListAdapter;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v1

    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/view/menu/ۥ۟۟۟;

    goto :goto_0

    :cond_0
    check-cast v0, Landroidx/appcompat/view/menu/ۥ۟۟۟;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/16 v3, 0xa

    if-eq v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {p0, v2, v3}, Landroid/widget/AbsListView;->pointToPosition(II)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    sub-int/2addr v2, v1

    if-ltz v2, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟;->getCount()I

    move-result v1

    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Landroidx/appcompat/view/menu/ۥ۟۟۟;->ۥ۟۟۟(I)Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ۟:Landroid/view/MenuItem;

    if-eq v2, v1, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟;->ۥ۟()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object v0

    if-eqz v2, :cond_2

    iget-object v3, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۡ۠ۦۤ;

    invoke-interface {v3, v0, v2}, LYue/ۥۡ۠ۦۤ;->ۥ۟۟۟۠(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V

    :cond_2
    iput-object v1, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ۟:Landroid/view/MenuItem;

    if-eqz v1, :cond_3

    iget-object v2, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۡ۠ۦۤ;

    invoke-interface {v2, v0, v1}, LYue/ۥۡ۠ۦۤ;->ۥ۟۟(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V

    :cond_3
    invoke-super {p0, p1}, LYue/ۥ۠۠ۢ۠;->onHoverEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/view/menu/ListMenuItemView;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v2, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۧ:I

    if-ne p1, v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ListMenuItemView;->getItemData()Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;->hasSubMenu()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    move-result-wide v2

    invoke-virtual {p0, v0, p1, v2, v3}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    return v1

    :cond_1
    if-eqz v0, :cond_3

    iget v0, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۡۨ:I

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    instance-of p2, p1, Landroid/widget/HeaderViewListAdapter;

    if-eqz p2, :cond_2

    check-cast p1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {p1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ۥ۟۟۟;

    goto :goto_0

    :cond_2
    check-cast p1, Landroidx/appcompat/view/menu/ۥ۟۟۟;

    :goto_0
    invoke-virtual {p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟;->ۥ۟()Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->close(Z)V

    return v1

    :cond_3
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥ۠۠ۢ۠;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setHoverListener(LYue/ۥۡ۠ۦۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->ۥ۟۟ۢ:LYue/ۥۡ۠ۦۤ;

    return-void
.end method

.method public bridge synthetic setSelector(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥ۠۠ۢ۠;->setSelector(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public bridge synthetic ۥ۟۟۟(IZ)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥ۠۠ۢ۠;->ۥ۟۟۟(IZ)I

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟۟۟۟(IIIII)I
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000,
            0x1000,
            0x1010,
            0x1000
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    invoke-super/range {p0 .. p5}, LYue/ۥ۠۠ۢ۠;->ۥ۟۟۟۟(IIIII)I

    move-result p1

    return p1
.end method

.method public bridge synthetic ۥ۟۟۟۠(Landroid/view/MotionEvent;I)Z
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000,
            0x1000
        }
        names = {
            null,
            null
        }
    .end annotation

    invoke-super {p0, p1, p2}, LYue/ۥ۠۠ۢ۠;->ۥ۟۟۟۠(Landroid/view/MotionEvent;I)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠۟()V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method
