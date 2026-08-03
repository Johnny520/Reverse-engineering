.class public Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ۥ۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥۣ۟۟۠:I

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget v1, v1, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۧ:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥۣ۟۟۠:I

    if-gez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            null
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟(I)Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    iget-object p2, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget-object v1, p2, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۤ:Landroid/view/LayoutInflater;

    iget p2, p2, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟ۡ:I

    invoke-virtual {v1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    move-object p3, p2

    check-cast p3, Landroidx/appcompat/view/menu/ۥ۟۟۟ۥ$ۥ;

    invoke-virtual {p0, p1}, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟(I)Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    move-result-object p1

    invoke-interface {p3, p1, v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟ۥ$ۥ;->initialize(Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;I)V

    return-object p2
.end method

.method public notifyDataSetChanged()V
    .locals 0

    invoke-virtual {p0}, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ()V

    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public ۥ()V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getExpandedItem()Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget-object v1, v1, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    if-ne v4, v0, :cond_0

    iput v3, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥۣ۟۟۠:I

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method

.method public ۥ۟(I)Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۥ:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:Landroidx/appcompat/view/menu/ۥ۟۟;

    iget v1, v1, Landroidx/appcompat/view/menu/ۥ۟۟;->ۥ۟۟۠ۧ:I

    add-int/2addr p1, v1

    iget v1, p0, Landroidx/appcompat/view/menu/ۥ۟۟$ۥ;->ۥۣ۟۟۠:I

    if-ltz v1, :cond_0

    if-lt p1, v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/view/menu/ۥ۟۟۟ۢ;

    return-object p1
.end method
