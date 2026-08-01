.class public final Landroidx/compose/ui/window/α;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Landroidx/compose/ui/window/DialogLayout;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/window/DialogLayout;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/window/α;->ε:Landroidx/compose/ui/window/DialogLayout;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv80;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, Lv81;->σ(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object p0, p0, Landroidx/compose/ui/window/α;->ε:Landroidx/compose/ui/window/DialogLayout;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/DialogLayout;->α(Lv80;I)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ls62;->α:Ls62;

    .line 19
    .line 20
    return-object p0
.end method
