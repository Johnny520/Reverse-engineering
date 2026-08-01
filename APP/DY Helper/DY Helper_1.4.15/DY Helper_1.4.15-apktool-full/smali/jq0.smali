.class public final Ljq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf12;


# instance fields
.field public final synthetic α:Lkq0;


# direct methods
.method public constructor <init>(Lkq0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljq0;->α:Lkq0;

    .line 5
    .line 6
    sget-object p0, Lan0;->α:[I

    .line 7
    .line 8
    new-instance p0, Lo11;

    .line 9
    .line 10
    invoke-direct {p0}, Lo11;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 7

    .line 1
    iget-object p0, p0, Ljq0;->α:Lkq0;

    .line 2
    .line 3
    iget-object v0, p0, Lkq0;->ε:Lyp0;

    .line 4
    .line 5
    invoke-virtual {p0}, Lkq0;->γ()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lkq0;->ν:Lb21;

    .line 9
    .line 10
    sget-object v2, Ls62;->α:Ls62;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lb21;->λ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lyp0;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    iget v4, p0, Lkq0;->σ:I

    .line 22
    .line 23
    if-lez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v4, "No pre-composed items to dispose"

    .line 27
    .line 28
    invoke-static {v4}, Lam0;->β(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lh21;

    .line 36
    .line 37
    iget-object v4, v4, Lh21;->ε:Lk21;

    .line 38
    .line 39
    invoke-virtual {v4, v1}, Lk21;->ι(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lh21;

    .line 48
    .line 49
    iget-object v5, v5, Lh21;->ε:Lk21;

    .line 50
    .line 51
    iget v5, v5, Lk21;->η:I

    .line 52
    .line 53
    iget v6, p0, Lkq0;->σ:I

    .line 54
    .line 55
    sub-int/2addr v5, v6

    .line 56
    if-lt v4, v5, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const-string v5, "Item is not in pre-composed item range"

    .line 60
    .line 61
    invoke-static {v5}, Lam0;->β(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    iget v5, p0, Lkq0;->ρ:I

    .line 65
    .line 66
    add-int/2addr v5, v3

    .line 67
    iput v5, p0, Lkq0;->ρ:I

    .line 68
    .line 69
    iget v5, p0, Lkq0;->σ:I

    .line 70
    .line 71
    add-int/lit8 v5, v5, -0x1

    .line 72
    .line 73
    iput v5, p0, Lkq0;->σ:I

    .line 74
    .line 75
    iget-object v5, p0, Lkq0;->ι:Lb21;

    .line 76
    .line 77
    invoke-virtual {v5, v1}, Lb21;->η(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ldq0;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v0}, Lyp0;->ν()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lh21;

    .line 93
    .line 94
    iget-object v1, v1, Lh21;->ε:Lk21;

    .line 95
    .line 96
    iget v1, v1, Lk21;->η:I

    .line 97
    .line 98
    iget v5, p0, Lkq0;->σ:I

    .line 99
    .line 100
    sub-int/2addr v1, v5

    .line 101
    iget v5, p0, Lkq0;->ρ:I

    .line 102
    .line 103
    sub-int/2addr v1, v5

    .line 104
    invoke-virtual {p0, v4, v1}, Lkq0;->ζ(II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v1}, Lkq0;->β(I)V

    .line 108
    .line 109
    .line 110
    :cond_3
    iget-object p0, p0, Lkq0;->π:Lk21;

    .line 111
    .line 112
    invoke-virtual {p0, v2}, Lk21;->θ(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_4

    .line 117
    .line 118
    const/4 p0, 0x6

    .line 119
    invoke-static {v0, v3, p0}, Lyp0;->Υ(Lyp0;ZI)V

    .line 120
    .line 121
    .line 122
    :cond_4
    return-void
.end method
