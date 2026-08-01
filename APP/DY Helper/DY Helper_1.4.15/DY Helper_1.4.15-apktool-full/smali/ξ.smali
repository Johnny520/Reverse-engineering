.class public final Lξ;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lξ;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lξ;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AbstractComposeView;II)V
    .locals 0

    .line 10
    iput p3, p0, Lξ;->ε:I

    iput-object p1, p0, Lξ;->ζ:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lξ;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv80;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lξ;->ζ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/compose/ui/window/PopupLayout;

    .line 16
    .line 17
    const/4 p2, 0x1

    .line 18
    invoke-static {p2}, Lv81;->σ(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/PopupLayout;->α(Lv80;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Lv80;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lξ;->ζ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Landroidx/compose/ui/platform/ComposeView;

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-static {p2}, Lv81;->σ(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/platform/ComposeView;->α(Lv80;I)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Ls62;->α:Ls62;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    check-cast p2, Lbs1;

    .line 57
    .line 58
    iget-object p0, p0, Lξ;->ζ:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lz1;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lz1;->μ(ILbs1;)V

    .line 63
    .line 64
    .line 65
    sget-object p0, Ls62;->α:Ls62;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    check-cast p1, Lv80;

    .line 69
    .line 70
    check-cast p2, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    and-int/lit8 v0, p2, 0x3

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    const/4 v2, 0x0

    .line 80
    const/4 v3, 0x1

    .line 81
    if-eq v0, v1, :cond_0

    .line 82
    .line 83
    move v0, v3

    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move v0, v2

    .line 86
    :goto_0
    and-int/2addr p2, v3

    .line 87
    invoke-virtual {p1, p2, v0}, Lv80;->Ξ(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_1

    .line 92
    .line 93
    iget-object p0, p0, Lξ;->ζ:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, Landroidx/compose/ui/platform/AbstractComposeView;

    .line 96
    .line 97
    invoke-virtual {p0, p1, v2}, Landroidx/compose/ui/platform/AbstractComposeView;->α(Lv80;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 102
    .line 103
    .line 104
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
