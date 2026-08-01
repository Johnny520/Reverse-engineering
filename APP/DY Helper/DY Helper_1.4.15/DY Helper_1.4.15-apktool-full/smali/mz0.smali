.class public final Lmz0;
.super Lｘ;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public β:Ln;

.field public final γ:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/α;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lmz0;->γ:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lmz0;->β:Ln;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Llz0;

    .line 8
    .line 9
    iget-object p0, p0, Llz0;->ξ:Liz0;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Liz0;->θ:Z

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Liz0;->π(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
