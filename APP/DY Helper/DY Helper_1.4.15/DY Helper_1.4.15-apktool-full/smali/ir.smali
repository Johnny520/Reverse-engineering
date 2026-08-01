.class public final Lir;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfr0;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/lang/Object;

.field public final η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgr0;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lir;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lir;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v0, Lzf;->γ:Lzf;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v1, v0, Lzf;->α:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lxf;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, p1, v1}, Lzf;->α(Ljava/lang/Class;[Ljava/lang/reflect/Method;)Lxf;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    iput-object v1, p0, Lir;->η:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Lgr;Lfr0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lir;->ε:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lir;->ζ:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Lir;->η:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln5;Ljr0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lir;->ε:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p2, p0, Lir;->ζ:Ljava/lang/Object;

    iput-object p1, p0, Lir;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final κ(Lhr0;Lbr0;)V
    .locals 3

    .line 1
    iget v0, p0, Lir;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lir;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lxf;

    .line 9
    .line 10
    iget-object v0, v0, Lxf;->α:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/List;

    .line 17
    .line 18
    iget-object p0, p0, Lir;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v1, p1, p2, p0}, Lxf;->α(Ljava/util/List;Lhr0;Lbr0;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lbr0;->ON_ANY:Lbr0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, p1, p2, p0}, Lxf;->α(Ljava/util/List;Lhr0;Lbr0;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_0
    sget-object p1, Lbr0;->ON_START:Lbr0;

    .line 36
    .line 37
    if-ne p2, p1, :cond_0

    .line 38
    .line 39
    iget-object p1, p0, Lir;->ζ:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljr0;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljr0;->ζ(Lgr0;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lir;->η:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ln5;

    .line 49
    .line 50
    invoke-virtual {p0}, Ln5;->Τ()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void

    .line 54
    :pswitch_1
    iget-object v0, p0, Lir;->ζ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lgr;

    .line 57
    .line 58
    sget-object v1, Lhr;->α:[I

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    aget v1, v1, v2

    .line 65
    .line 66
    packed-switch v1, :pswitch_data_1

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lγ;->κ()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_2
    const-string p0, "ON_ANY must not been send by anybody"

    .line 74
    .line 75
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :pswitch_4
    invoke-interface {v0, p1}, Lgr;->δ(Lhr0;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_6
    invoke-interface {v0, p1}, Lgr;->θ(Lhr0;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_7
    invoke-interface {v0, p1}, Lgr;->η(Lhr0;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    :goto_0
    iget-object p0, p0, Lir;->η:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Lfr0;

    .line 105
    .line 106
    if-eqz p0, :cond_1

    .line 107
    .line 108
    invoke-interface {p0, p1, p2}, Lfr0;->κ(Lhr0;Lbr0;)V

    .line 109
    .line 110
    .line 111
    :cond_1
    :goto_1
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
