.class public final Lre;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg40;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:Lbq;

.field public final synthetic η:Lse;

.field public final synthetic θ:Lg40;


# direct methods
.method public constructor <init>(Lum1;Lbq;Lse;Lg40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lre;->ε:Lum1;

    .line 5
    .line 6
    iput-object p2, p0, Lre;->ζ:Lbq;

    .line 7
    .line 8
    iput-object p3, p0, Lre;->η:Lse;

    .line 9
    .line 10
    iput-object p4, p0, Lre;->θ:Lg40;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lqe;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lqe;

    .line 7
    .line 8
    iget v1, v0, Lqe;->μ:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lqe;->μ:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqe;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lqe;-><init>(Lre;Lop;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lqe;->κ:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lqe;->μ:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Lqe;->ι:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p0, v0, Lqe;->θ:Lre;

    .line 37
    .line 38
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lre;->ε:Lum1;

    .line 54
    .line 55
    iget-object p2, p2, Lum1;->ε:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, Lfo0;

    .line 58
    .line 59
    if-eqz p2, :cond_7

    .line 60
    .line 61
    new-instance v1, Lnf;

    .line 62
    .line 63
    const-string v3, "Child of the scoped flow was cancelled"

    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-direct {v1, v3, v4}, Lnf;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v1}, Lfo0;->ν(Ljava/util/concurrent/CancellationException;)V

    .line 70
    .line 71
    .line 72
    iput-object p0, v0, Lqe;->θ:Lre;

    .line 73
    .line 74
    iput-object p1, v0, Lqe;->ι:Ljava/lang/Object;

    .line 75
    .line 76
    iput v2, v0, Lqe;->μ:I

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :cond_3
    sget-object v1, Lfo0;->ε:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 82
    .line 83
    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    instance-of v3, v1, Lml0;

    .line 88
    .line 89
    sget-object v4, Ls62;->α:Ls62;

    .line 90
    .line 91
    if-nez v3, :cond_4

    .line 92
    .line 93
    iget-object p2, v0, Lpp;->ζ:Lup;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {p2}, Lyh;->Α(Lup;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    invoke-virtual {p2, v1}, Lfo0;->Φ(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-ltz v1, :cond_3

    .line 107
    .line 108
    new-instance v1, Lae;

    .line 109
    .line 110
    invoke-static {v0}, Lxb;->Θ(Lop;)Lop;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const/4 v3, 0x1

    .line 115
    invoke-direct {v1, v3, v0}, Lae;-><init>(ILop;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1}, Lae;->τ()V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lof;

    .line 122
    .line 123
    const/4 v5, 0x1

    .line 124
    invoke-direct {v0, v5, v1}, Lof;-><init>(ILjava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-static {p2, v3, v0}, Lyh;->Τ(Lfo0;ZLco0;)Lvt;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    new-instance v0, Lud;

    .line 132
    .line 133
    invoke-direct {v0, v3, p2}, Lud;-><init>(ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v0}, Lae;->ψ(Lw31;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lae;->σ()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    sget-object v0, Lcq;->ε:Lcq;

    .line 144
    .line 145
    if-ne p2, v0, :cond_5

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_5
    move-object p2, v4

    .line 149
    :goto_1
    if-ne p2, v0, :cond_6

    .line 150
    .line 151
    move-object v4, p2

    .line 152
    :cond_6
    :goto_2
    sget-object p2, Lcq;->ε:Lcq;

    .line 153
    .line 154
    if-ne v4, p2, :cond_7

    .line 155
    .line 156
    return-object p2

    .line 157
    :cond_7
    :goto_3
    iget-object p2, p0, Lre;->ε:Lum1;

    .line 158
    .line 159
    iget-object v0, p0, Lre;->ζ:Lbq;

    .line 160
    .line 161
    new-instance v1, Lpe;

    .line 162
    .line 163
    iget-object v3, p0, Lre;->η:Lse;

    .line 164
    .line 165
    iget-object p0, p0, Lre;->θ:Lg40;

    .line 166
    .line 167
    const/4 v4, 0x0

    .line 168
    invoke-direct {v1, v3, p0, p1, v4}, Lpe;-><init>(Lse;Lg40;Ljava/lang/Object;Lop;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v4, v1, v2}, Lln0;->Ρ(Lbq;Lup;Le80;I)Lxz1;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iput-object p0, p2, Lum1;->ε:Ljava/lang/Object;

    .line 176
    .line 177
    sget-object p0, Ls62;->α:Ls62;

    .line 178
    .line 179
    return-object p0
.end method
