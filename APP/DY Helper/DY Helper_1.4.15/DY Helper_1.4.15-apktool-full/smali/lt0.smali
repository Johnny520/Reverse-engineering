.class public final synthetic Llt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lps0;

.field public final synthetic η:Z

.field public final synthetic θ:La80;

.field public final synthetic ι:La80;

.field public final synthetic κ:Lep0;

.field public final synthetic λ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lm2;Lep0;Lps0;ZLa80;La80;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Llt0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llt0;->λ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Llt0;->κ:Lep0;

    .line 10
    .line 11
    iput-object p3, p0, Llt0;->ζ:Lps0;

    .line 12
    .line 13
    iput-boolean p4, p0, Llt0;->η:Z

    .line 14
    .line 15
    iput-object p5, p0, Llt0;->θ:La80;

    .line 16
    .line 17
    iput-object p6, p0, Llt0;->ι:La80;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lps0;ZLa80;La80;Lr01;Lep0;I)V
    .locals 0

    .line 20
    const/4 p7, 0x1

    iput p7, p0, Llt0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt0;->ζ:Lps0;

    iput-boolean p2, p0, Llt0;->η:Z

    iput-object p3, p0, Llt0;->θ:La80;

    iput-object p4, p0, Llt0;->ι:La80;

    iput-object p5, p0, Llt0;->λ:Ljava/lang/Object;

    iput-object p6, p0, Llt0;->κ:Lep0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Llt0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llt0;->λ:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, v0

    .line 9
    check-cast v5, Lr01;

    .line 10
    .line 11
    move-object v7, p1

    .line 12
    check-cast v7, Lv80;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x6001

    .line 20
    .line 21
    invoke-static {p1}, Lv81;->σ(I)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    iget-object v1, p0, Llt0;->ζ:Lps0;

    .line 26
    .line 27
    iget-boolean v2, p0, Llt0;->η:Z

    .line 28
    .line 29
    iget-object v3, p0, Llt0;->θ:La80;

    .line 30
    .line 31
    iget-object v4, p0, Llt0;->ι:La80;

    .line 32
    .line 33
    iget-object v6, p0, Llt0;->κ:Lep0;

    .line 34
    .line 35
    invoke-static/range {v1 .. v8}, Lpt0;->γ(Lps0;ZLa80;La80;Lr01;Lep0;Lv80;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Ls62;->α:Ls62;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    iget-object v0, p0, Llt0;->λ:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Lm2;

    .line 45
    .line 46
    move-object v5, p1

    .line 47
    check-cast v5, Lv80;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    and-int/lit8 p2, p1, 0x3

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v2, 0x1

    .line 60
    if-eq p2, v0, :cond_0

    .line 61
    .line 62
    move p2, v2

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move p2, v7

    .line 65
    :goto_0
    and-int/2addr p1, v2

    .line 66
    invoke-virtual {v5, p1, p2}, Lv80;->Ξ(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    move p1, v7

    .line 73
    iget-object v7, p0, Llt0;->κ:Lep0;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    const p2, -0x5321f8ff

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p2}, Lv80;->Φ(I)V

    .line 81
    .line 82
    .line 83
    sget-object p2, Lxb;->τ:Lu30;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    const v2, 0x7effb

    .line 87
    .line 88
    .line 89
    invoke-static {p2, v0, v2}, Lh62;->д(Lr01;Liv1;I)Lr01;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2, v7}, Lyh;->Ω(Lr01;Lep0;)Lr01;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const/4 v2, 0x0

    .line 98
    const/16 v6, 0x6030

    .line 99
    .line 100
    sget-object v4, Ljp;->β:Li2;

    .line 101
    .line 102
    invoke-static/range {v1 .. v6}, Lyh;->δ(Lm2;Ljava/lang/String;Lr01;Li2;Lv80;I)V

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-virtual {v5, p1}, Lv80;->ο(Z)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_1
    const p2, -0x5378b234

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, p2}, Lv80;->Φ(I)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :goto_2
    sget-object v6, Lxb;->τ:Lu30;

    .line 117
    .line 118
    const/16 v9, 0x6000

    .line 119
    .line 120
    iget-object v2, p0, Llt0;->ζ:Lps0;

    .line 121
    .line 122
    iget-boolean v3, p0, Llt0;->η:Z

    .line 123
    .line 124
    iget-object v4, p0, Llt0;->θ:La80;

    .line 125
    .line 126
    iget-object p0, p0, Llt0;->ι:La80;

    .line 127
    .line 128
    move-object v8, v5

    .line 129
    move-object v5, p0

    .line 130
    invoke-static/range {v2 .. v9}, Lpt0;->γ(Lps0;ZLa80;La80;Lr01;Lep0;Lv80;I)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_2
    invoke-virtual {v5}, Lv80;->Ρ()V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object p0, Ls62;->α:Ls62;

    .line 138
    .line 139
    return-object p0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
