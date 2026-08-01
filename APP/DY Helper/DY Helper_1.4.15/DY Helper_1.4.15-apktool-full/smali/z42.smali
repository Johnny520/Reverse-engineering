.class public final Lz42;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ε:Lｎ;

.field public final synthetic ζ:Lb52;


# direct methods
.method public constructor <init>(Lb52;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz42;->ζ:Lb52;

    .line 5
    .line 6
    new-instance v0, Lｎ;

    .line 7
    .line 8
    iget-object v1, p1, Lb52;->α:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object p1, p1, Lb52;->θ:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x1000

    .line 20
    .line 21
    iput v2, v0, Lｎ;->ε:I

    .line 22
    .line 23
    iput v2, v0, Lｎ;->η:I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput-object v2, v0, Lｎ;->μ:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    iput-object v2, v0, Lｎ;->ν:Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput-boolean v2, v0, Lｎ;->ξ:Z

    .line 32
    .line 33
    iput-boolean v2, v0, Lｎ;->ο:Z

    .line 34
    .line 35
    const/16 v2, 0x10

    .line 36
    .line 37
    iput v2, v0, Lｎ;->π:I

    .line 38
    .line 39
    iput-object v1, v0, Lｎ;->ι:Landroid/content/Context;

    .line 40
    .line 41
    iput-object p1, v0, Lｎ;->α:Ljava/lang/CharSequence;

    .line 42
    .line 43
    iput-object v0, p0, Lz42;->ε:Lｎ;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lz42;->ζ:Lb52;

    .line 2
    .line 3
    iget-object v0, p1, Lb52;->λ:Landroid/view/Window$Callback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean p1, p1, Lb52;->μ:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iget-object p0, p0, Lz42;->ε:Lｎ;

    .line 13
    .line 14
    invoke-interface {v0, p1, p0}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
