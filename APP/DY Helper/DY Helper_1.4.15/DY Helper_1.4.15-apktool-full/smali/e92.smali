.class public final Le92;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroidx/compose/ui/platform/AbstractComposeView;

.field public final synthetic ζ:Lc92;

.field public final synthetic η:Ld92;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AbstractComposeView;Lc92;Ld92;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le92;->ε:Landroidx/compose/ui/platform/AbstractComposeView;

    .line 2
    .line 3
    iput-object p2, p0, Le92;->ζ:Lc92;

    .line 4
    .line 5
    iput-object p3, p0, Le92;->η:Ld92;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Le92;->ζ:Lc92;

    .line 2
    .line 3
    iget-object v1, p0, Le92;->ε:Landroidx/compose/ui/platform/AbstractComposeView;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lv81;->ε(Landroid/view/View;)Lgi1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lgi1;->α:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object p0, p0, Le92;->η:Ld92;

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method
