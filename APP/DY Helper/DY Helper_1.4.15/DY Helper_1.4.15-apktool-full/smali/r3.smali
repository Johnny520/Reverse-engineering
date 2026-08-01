.class public final Lr3;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public ι:Lvc;

.field public κ:I

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Lme;

.field public final synthetic ν:Lo3;

.field public final synthetic ξ:Lg21;

.field public final synthetic ο:Lg21;


# direct methods
.method public constructor <init>(Lme;Lo3;Lg21;Lg21;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr3;->μ:Lme;

    .line 2
    .line 3
    iput-object p2, p0, Lr3;->ν:Lo3;

    .line 4
    .line 5
    iput-object p3, p0, Lr3;->ξ:Lg21;

    .line 6
    .line 7
    iput-object p4, p0, Lr3;->ο:Lg21;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ly12;-><init>(ILop;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lbq;

    .line 2
    .line 3
    check-cast p2, Lop;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lr3;->η(Lop;Ljava/lang/Object;)Lop;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lr3;

    .line 10
    .line 11
    sget-object p1, Ls62;->α:Ls62;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lr3;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final η(Lop;Ljava/lang/Object;)Lop;
    .locals 6

    .line 1
    new-instance v0, Lr3;

    .line 2
    .line 3
    iget-object v3, p0, Lr3;->ξ:Lg21;

    .line 4
    .line 5
    iget-object v4, p0, Lr3;->ο:Lg21;

    .line 6
    .line 7
    iget-object v1, p0, Lr3;->μ:Lme;

    .line 8
    .line 9
    iget-object v2, p0, Lr3;->ν:Lo3;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lr3;-><init>(Lme;Lo3;Lg21;Lg21;Lop;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lr3;->λ:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lr3;->κ:I

    .line 2
    .line 3
    iget-object v1, p0, Lr3;->μ:Lme;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lr3;->ι:Lvc;

    .line 11
    .line 12
    iget-object v3, p0, Lr3;->λ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, Lbq;

    .line 15
    .line 16
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lr3;->λ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lbq;

    .line 33
    .line 34
    invoke-interface {v1}, Lme;->iterator()Lvc;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v3, p1

    .line 39
    :goto_0
    iput-object v3, p0, Lr3;->λ:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v0, p0, Lr3;->ι:Lvc;

    .line 42
    .line 43
    iput v2, p0, Lr3;->κ:I

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lvc;->β(Lpp;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    sget-object v4, Lcq;->ε:Lcq;

    .line 50
    .line 51
    if-ne p1, v4, :cond_2

    .line 52
    .line 53
    return-object v4

    .line 54
    :cond_2
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0}, Lvc;->γ()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {v1}, Lme;->ε()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    instance-of v5, v4, Lue;

    .line 71
    .line 72
    const/4 v6, 0x0

    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move-object v4, v6

    .line 77
    :goto_2
    if-nez v4, :cond_4

    .line 78
    .line 79
    move-object v8, p1

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object v8, v4

    .line 82
    :goto_3
    new-instance v7, Lq3;

    .line 83
    .line 84
    const/4 v12, 0x0

    .line 85
    const/4 v13, 0x0

    .line 86
    iget-object v9, p0, Lr3;->ν:Lo3;

    .line 87
    .line 88
    iget-object v10, p0, Lr3;->ξ:Lg21;

    .line 89
    .line 90
    iget-object v11, p0, Lr3;->ο:Lg21;

    .line 91
    .line 92
    invoke-direct/range {v7 .. v13}, Lq3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lop;I)V

    .line 93
    .line 94
    .line 95
    const/4 p1, 0x3

    .line 96
    invoke-static {v3, v6, v7, p1}, Lln0;->Ρ(Lbq;Lup;Le80;I)Lxz1;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    sget-object p0, Ls62;->α:Ls62;

    .line 101
    .line 102
    return-object p0
.end method
