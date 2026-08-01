.class public final Lpe;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ι:I

.field public κ:I

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Lse;

.field public final synthetic ν:Lg40;


# direct methods
.method public constructor <init>(Lse;Lg40;Ljava/lang/Object;Lop;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lpe;->ι:I

    .line 3
    .line 4
    iput-object p1, p0, Lpe;->μ:Lse;

    .line 5
    .line 6
    iput-object p2, p0, Lpe;->ν:Lg40;

    .line 7
    .line 8
    iput-object p3, p0, Lpe;->λ:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Ly12;-><init>(ILop;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lse;Lg40;Lop;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lpe;->ι:I

    .line 15
    iput-object p1, p0, Lpe;->μ:Lse;

    iput-object p2, p0, Lpe;->ν:Lg40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ly12;-><init>(ILop;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lpe;->ι:I

    .line 2
    .line 3
    check-cast p1, Lbq;

    .line 4
    .line 5
    check-cast p2, Lop;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2, p1}, Lpe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lpe;

    .line 15
    .line 16
    sget-object p1, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lpe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lpe;->η(Lop;Ljava/lang/Object;)Lop;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lpe;

    .line 28
    .line 29
    sget-object p1, Ls62;->α:Ls62;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lpe;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 2

    .line 1
    iget v0, p0, Lpe;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpe;

    .line 7
    .line 8
    iget-object v1, p0, Lpe;->μ:Lse;

    .line 9
    .line 10
    iget-object p0, p0, Lpe;->ν:Lg40;

    .line 11
    .line 12
    invoke-direct {v0, v1, p0, p1}, Lpe;-><init>(Lse;Lg40;Lop;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lpe;->λ:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance p2, Lpe;

    .line 19
    .line 20
    iget-object v0, p0, Lpe;->ν:Lg40;

    .line 21
    .line 22
    iget-object v1, p0, Lpe;->λ:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, Lpe;->μ:Lse;

    .line 25
    .line 26
    invoke-direct {p2, p0, v0, v1, p1}, Lpe;-><init>(Lse;Lg40;Ljava/lang/Object;Lop;)V

    .line 27
    .line 28
    .line 29
    return-object p2

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lpe;->ι:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lpe;->κ:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lpe;->λ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lbq;

    .line 30
    .line 31
    new-instance v0, Lum1;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lpe;->μ:Lse;

    .line 37
    .line 38
    iget-object v3, v2, Lse;->θ:Lf40;

    .line 39
    .line 40
    new-instance v4, Lre;

    .line 41
    .line 42
    iget-object v5, p0, Lpe;->ν:Lg40;

    .line 43
    .line 44
    invoke-direct {v4, v0, p1, v2, v5}, Lre;-><init>(Lum1;Lbq;Lse;Lg40;)V

    .line 45
    .line 46
    .line 47
    iput v1, p0, Lpe;->κ:I

    .line 48
    .line 49
    invoke-interface {v3, v4, p0}, Lf40;->γ(Lg40;Lop;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    sget-object p1, Lcq;->ε:Lcq;

    .line 54
    .line 55
    if-ne p0, p1, :cond_2

    .line 56
    .line 57
    move-object p0, p1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 60
    .line 61
    :goto_1
    return-object p0

    .line 62
    :pswitch_0
    iget v0, p0, Lpe;->κ:I

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    if-ne v0, v1, :cond_3

    .line 68
    .line 69
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lpe;->μ:Lse;

    .line 84
    .line 85
    iget-object p1, p1, Lse;->ι:Ly12;

    .line 86
    .line 87
    iget-object v0, p0, Lpe;->λ:Ljava/lang/Object;

    .line 88
    .line 89
    iput v1, p0, Lpe;->κ:I

    .line 90
    .line 91
    iget-object v1, p0, Lpe;->ν:Lg40;

    .line 92
    .line 93
    invoke-interface {p1, v1, v0, p0}, Lf80;->α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object p1, Lcq;->ε:Lcq;

    .line 98
    .line 99
    if-ne p0, p1, :cond_5

    .line 100
    .line 101
    move-object p0, p1

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 104
    .line 105
    :goto_3
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
