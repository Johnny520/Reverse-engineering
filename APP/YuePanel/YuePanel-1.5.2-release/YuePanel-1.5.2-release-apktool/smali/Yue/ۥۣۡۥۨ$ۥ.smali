.class public LYue/ۥۣۡۥۨ$ۥ;
.super Landroid/database/DataSetObserver;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۤۦ۠$ۥ۟۟۟ۤ;
.implements LYue/ۥۢۤۦ۠$ۥۣ۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۡۥۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:I

.field public final synthetic ۥ۟:LYue/ۥۣۡۥۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۥۨ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterChanged(LYue/ۥۢۤۦ۠;LYue/ۥۣۡۥۦ;LYue/ۥۣۡۥۦ;)V
    .locals 0

    iget-object p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    invoke-virtual {p1, p2, p3}, LYue/ۥۣۡۥۨ;->ۥ۟(LYue/ۥۣۡۥۦ;LYue/ۥۣۡۥۦ;)V

    return-void
.end method

.method public onChanged()V
    .locals 4

    iget-object v0, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget-object v1, v0, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v1}, LYue/ۥۢۤۦ۠;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget-object v2, v2, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v2}, LYue/ۥۢۤۦ۠;->getAdapter()LYue/ۥۣۡۥۦ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LYue/ۥۣۡۥۨ;->ۥ۟۟(ILYue/ۥۣۡۥۦ;)V

    iget-object v0, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget v1, v0, LYue/ۥۣۡۥۨ;->ۥ۟۟۠ۨ:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    if-ltz v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v2, v0, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v2}, LYue/ۥۢۤۦ۠;->getCurrentItem()I

    move-result v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, LYue/ۥۣۡۥۨ;->ۥ۟۟۟(IFZ)V

    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ:I

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    const/high16 p3, 0x3f000000    # 0.5f

    cmpl-float p3, p2, p3

    if-lez p3, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    iget-object p3, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    const/4 v0, 0x0

    invoke-virtual {p3, p1, p2, v0}, LYue/ۥۣۡۥۨ;->ۥ۟۟۟(IFZ)V

    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    iget p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ:I

    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget-object v0, p1, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v0}, LYue/ۥۢۤۦ۠;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget-object v1, v1, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v1}, LYue/ۥۢۤۦ۠;->getAdapter()LYue/ۥۣۡۥۦ;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LYue/ۥۣۡۥۨ;->ۥ۟۟(ILYue/ۥۣۡۥۦ;)V

    iget-object p1, p0, LYue/ۥۣۡۥۨ$ۥ;->ۥ۟:LYue/ۥۣۡۥۨ;

    iget v0, p1, LYue/ۥۣۡۥۨ;->ۥ۟۟۠ۨ:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v1, p1, LYue/ۥۣۡۥۨ;->ۥۣ۟۟۠:LYue/ۥۢۤۦ۠;

    invoke-virtual {v1}, LYue/ۥۢۤۦ۠;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, LYue/ۥۣۡۥۨ;->ۥ۟۟۟(IFZ)V

    :cond_1
    return-void
.end method
