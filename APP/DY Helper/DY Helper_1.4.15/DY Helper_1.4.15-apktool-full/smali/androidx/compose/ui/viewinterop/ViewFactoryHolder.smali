.class public final Landroidx/compose/ui/viewinterop/ViewFactoryHolder;
.super Landroidx/compose/ui/viewinterop/AndroidViewHolder;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Landroidx/compose/ui/viewinterop/AndroidViewHolder;"
    }
.end annotation


# static fields
.field public static final synthetic σ:I


# instance fields
.field public ο:La80;

.field public π:La80;

.field public ρ:La80;


# direct methods
.method private final setSavableRegistryEntry(Lxp1;)V
    .locals 0

    .line 1
    return-void
.end method

.method public static final κ(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->setSavableRegistryEntry(Lxp1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getDispatcher()Lw21;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getReleaseBlock()La80;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La80;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->ρ:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResetBlock()La80;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La80;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->π:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getSubCompositionView()Landroidx/compose/ui/platform/AbstractComposeView;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getUpdateBlock()La80;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La80;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->ο:La80;

    .line 2
    .line 3
    return-object p0
.end method

.method public getViewRoot()Landroid/view/View;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final setReleaseBlock(La80;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->ρ:La80;

    .line 2
    .line 3
    new-instance p1, Li92;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, p0, v0}, Li92;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setRelease(Lp70;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setResetBlock(La80;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->π:La80;

    .line 2
    .line 3
    new-instance p1, Li92;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p1, p0, v0}, Li92;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setReset(Lp70;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setUpdateBlock(La80;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La80;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/ViewFactoryHolder;->ο:La80;

    .line 2
    .line 3
    new-instance p1, Li92;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-direct {p1, p0, v0}, Li92;-><init>(Landroidx/compose/ui/viewinterop/ViewFactoryHolder;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder;->setUpdate(Lp70;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
