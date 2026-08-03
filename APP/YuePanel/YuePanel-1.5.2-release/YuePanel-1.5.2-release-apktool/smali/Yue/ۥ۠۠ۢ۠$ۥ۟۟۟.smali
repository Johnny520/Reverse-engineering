.class public LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;
.super LYue/ۥ۠۠ۡۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۠۠ۡۧ;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-boolean v0, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LYue/ۥ۠۠ۡۧ;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public setHotspot(FF)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, LYue/ۥ۠۠ۡۧ;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, LYue/ۥ۠۠ۡۧ;->setHotspotBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setState([I)Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, LYue/ۥ۠۠ۡۧ;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setVisible(ZZ)Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, LYue/ۥ۠۠ۡۧ;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۠۠ۢ۠$ۥ۟۟۟;->ۥۣ۟۟۠:Z

    return-void
.end method
