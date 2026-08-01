.class public final Leo;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Le80;

.field public final synthetic η:Lgr0;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Li2;Le80;I)V
    .locals 0

    const/4 p4, 0x0

    iput p4, p0, Leo;->ε:I

    .line 15
    iput-object p1, p0, Leo;->η:Lgr0;

    iput-object p2, p0, Leo;->θ:Ljava/lang/Object;

    iput-object p3, p0, Leo;->ζ:Le80;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lhd2;Lpn;Le80;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Leo;->ε:I

    .line 3
    .line 4
    iput-object p1, p0, Leo;->η:Lgr0;

    .line 5
    .line 6
    iput-object p2, p0, Leo;->θ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Leo;->ζ:Le80;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Leo;->ε:I

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
    move-result p2

    .line 14
    iget-object v0, p0, Leo;->η:Lgr0;

    .line 15
    .line 16
    check-cast v0, Lhd2;

    .line 17
    .line 18
    and-int/lit8 v1, p2, 0x3

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v1, v4

    .line 28
    :goto_0
    and-int/2addr p2, v3

    .line 29
    invoke-virtual {p1, p2, v1}, Lv80;->Ξ(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_5

    .line 34
    .line 35
    iget-object p2, v0, Lhd2;->ε:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Lv80;->Λ()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v3, 0x0

    .line 46
    sget-object v5, Lqn;->α:Li2;

    .line 47
    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    if-ne v2, v5, :cond_2

    .line 51
    .line 52
    :cond_1
    new-instance v2, Lgd2;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v2, v0, v3, v1}, Lgd2;-><init>(Ljava/lang/Object;Lop;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    check-cast v2, Le80;

    .line 62
    .line 63
    invoke-static {v2, p1, p2}, Lxb;->η(Le80;Lv80;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p1}, Lv80;->Λ()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    if-ne v2, v5, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v2, Lgd2;

    .line 79
    .line 80
    const/4 v1, 0x1

    .line 81
    invoke-direct {v2, v0, v3, v1}, Lgd2;-><init>(Ljava/lang/Object;Lop;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Lv80;->е(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    check-cast v2, Le80;

    .line 88
    .line 89
    invoke-static {v2, p1, p2}, Lxb;->η(Le80;Lv80;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Leo;->θ:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lpn;

    .line 95
    .line 96
    iget-object p0, p0, Leo;->ζ:Le80;

    .line 97
    .line 98
    invoke-virtual {v0, p2, p0, p1, v4}, Lpn;->α(Landroidx/compose/ui/platform/AndroidComposeView;Le80;Lv80;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    invoke-virtual {p1}, Lv80;->Ρ()V

    .line 103
    .line 104
    .line 105
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_0
    check-cast p1, Lv80;

    .line 109
    .line 110
    check-cast p2, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 113
    .line 114
    .line 115
    iget-object p2, p0, Leo;->η:Lgr0;

    .line 116
    .line 117
    check-cast p2, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 118
    .line 119
    iget-object v0, p0, Leo;->θ:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Li2;

    .line 122
    .line 123
    const/4 v1, 0x1

    .line 124
    invoke-static {v1}, Lv81;->σ(I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    iget-object p0, p0, Leo;->ζ:Le80;

    .line 129
    .line 130
    invoke-static {p2, v0, p0, p1, v1}, Lfo;->α(Landroidx/compose/ui/platform/AndroidComposeView;Li2;Le80;Lv80;I)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Ls62;->α:Ls62;

    .line 134
    .line 135
    return-object p0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
