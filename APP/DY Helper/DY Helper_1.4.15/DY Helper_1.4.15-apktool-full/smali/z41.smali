.class public final Lz41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic α:La80;

.field public final synthetic β:La80;

.field public final synthetic γ:Lp70;

.field public final synthetic δ:Lp70;


# direct methods
.method public constructor <init>(La80;La80;Lp70;Lp70;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz41;->α:La80;

    .line 5
    .line 6
    iput-object p2, p0, Lz41;->β:La80;

    .line 7
    .line 8
    iput-object p3, p0, Lz41;->γ:Lp70;

    .line 9
    .line 10
    iput-object p4, p0, Lz41;->δ:Lp70;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 0

    .line 1
    iget-object p0, p0, Lz41;->δ:Lp70;

    .line 2
    .line 3
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackInvoked()V
    .locals 0

    .line 1
    iget-object p0, p0, Lz41;->γ:Lp70;

    .line 2
    .line 3
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj8;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lj8;-><init>(Landroid/window/BackEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lz41;->β:La80;

    .line 10
    .line 11
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj8;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lj8;-><init>(Landroid/window/BackEvent;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lz41;->α:La80;

    .line 10
    .line 11
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
