.class public final Lg12;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lh12;


# direct methods
.method public synthetic constructor <init>(Lh12;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg12;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lg12;->ζ:Lh12;

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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lg12;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyp0;

    .line 7
    .line 8
    check-cast p2, Lh12;

    .line 9
    .line 10
    iget-object p2, p1, Lyp0;->Μ:Lkq0;

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    new-instance p2, Lkq0;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lkq0;-><init>(Lyp0;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p1, Lyp0;->Μ:Lkq0;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Lg12;->ζ:Lh12;

    .line 22
    .line 23
    iput-object p2, p0, Lh12;->α:Lkq0;

    .line 24
    .line 25
    invoke-virtual {p0}, Lh12;->α()Lkq0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lkq0;->γ()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lh12;->α()Lkq0;

    .line 33
    .line 34
    .line 35
    sget-object p0, Ls62;->α:Ls62;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, Lyp0;

    .line 39
    .line 40
    check-cast p2, Le80;

    .line 41
    .line 42
    iget-object p0, p0, Lg12;->ζ:Lh12;

    .line 43
    .line 44
    invoke-virtual {p0}, Lh12;->α()Lkq0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v0, Lhq0;

    .line 49
    .line 50
    invoke-direct {v0, p0, p2}, Lhq0;-><init>(Lkq0;Le80;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p1, Lyp0;->Β:Lpx0;

    .line 54
    .line 55
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_1

    .line 60
    .line 61
    iput-object v0, p1, Lyp0;->Β:Lpx0;

    .line 62
    .line 63
    invoke-virtual {p1}, Lyp0;->Δ()V

    .line 64
    .line 65
    .line 66
    :cond_1
    sget-object p0, Ls62;->α:Ls62;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_1
    check-cast p1, Lyp0;

    .line 70
    .line 71
    check-cast p2, Lun;

    .line 72
    .line 73
    iget-object p0, p0, Lg12;->ζ:Lh12;

    .line 74
    .line 75
    invoke-virtual {p0}, Lh12;->α()Lkq0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iput-object p2, p0, Lkq0;->ζ:Lun;

    .line 80
    .line 81
    sget-object p0, Ls62;->α:Ls62;

    .line 82
    .line 83
    return-object p0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
