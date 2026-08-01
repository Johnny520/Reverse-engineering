.class public final Ll40;
.super Ly12;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# instance fields
.field public ι:I

.field public synthetic κ:Lg40;

.field public synthetic λ:Ljava/lang/Object;

.field public final synthetic μ:Ly12;


# direct methods
.method public constructor <init>(Le80;Lop;)V
    .locals 0

    .line 1
    check-cast p1, Ly12;

    .line 2
    .line 3
    iput-object p1, p0, Ll40;->μ:Ly12;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p2}, Ly12;-><init>(ILop;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lg40;

    .line 2
    .line 3
    check-cast p3, Lop;

    .line 4
    .line 5
    new-instance v0, Ll40;

    .line 6
    .line 7
    iget-object p0, p0, Ll40;->μ:Ly12;

    .line 8
    .line 9
    invoke-direct {v0, p0, p3}, Ll40;-><init>(Le80;Lop;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Ll40;->κ:Lg40;

    .line 13
    .line 14
    iput-object p2, v0, Ll40;->λ:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, Ls62;->α:Ls62;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ll40;->κ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ll40;->ι:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lcq;->ε:Lcq;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

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
    return-object p0

    .line 24
    :cond_1
    iget-object v0, p0, Ll40;->κ:Lg40;

    .line 25
    .line 26
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Li81;->Β(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ll40;->κ:Lg40;

    .line 34
    .line 35
    iget-object p1, p0, Ll40;->λ:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Ll40;->κ:Lg40;

    .line 38
    .line 39
    iput v2, p0, Ll40;->ι:I

    .line 40
    .line 41
    iget-object v2, p0, Ll40;->μ:Ly12;

    .line 42
    .line 43
    invoke-interface {v2, p1, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v3, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    const/4 v2, 0x0

    .line 51
    iput-object v2, p0, Ll40;->κ:Lg40;

    .line 52
    .line 53
    iput v1, p0, Ll40;->ι:I

    .line 54
    .line 55
    invoke-interface {v0, p1, p0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v3, :cond_4

    .line 60
    .line 61
    :goto_1
    return-object v3

    .line 62
    :cond_4
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 63
    .line 64
    return-object p0
.end method
