.class public final Lsm;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/util/HashMap;

.field public final β:Ljava/util/HashMap;

.field public final γ:Ljava/util/HashMap;

.field public δ:Ljava/util/ArrayList;

.field public final transient ε:Ljava/util/HashMap;

.field public final ζ:Ljava/util/HashMap;

.field public final η:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lsm;->α:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lsm;->β:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lsm;->γ:Ljava/util/HashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lsm;->δ:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lsm;->ε:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lsm;->ζ:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance v0, Landroid/os/Bundle;

    .line 47
    .line 48
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lsm;->η:Landroid/os/Bundle;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final α(IILandroid/content/Intent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lsm;->α:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v0, p0, Lsm;->ε:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lm;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v1, v0, Lm;->α:Lt60;

    .line 28
    .line 29
    iget-object v2, p0, Lsm;->δ:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lm;->β:Ls1;

    .line 38
    .line 39
    invoke-virtual {v0, p2, p3}, Ls1;->φ(ILandroid/content/Intent;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {v1, p2}, Lt60;->α(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lsm;->δ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v0, p0, Lsm;->ζ:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v0, Lk;

    .line 58
    .line 59
    invoke-direct {v0, p2, p3}, Lk;-><init>(ILandroid/content/Intent;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lsm;->η:Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-virtual {p0, p1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public final β(Ljava/lang/String;Ls1;Lt60;)Ln5;
    .locals 6

    .line 1
    iget-object v0, p0, Lsm;->β:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    sget-object v1, Lmk1;->ε:Lв;

    .line 13
    .line 14
    sget-object v1, Lmk1;->ε:Lв;

    .line 15
    .line 16
    invoke-virtual {v1}, Lв;->α()Ljava/util/Random;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/high16 v2, 0x7fff0000

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/high16 v3, 0x10000

    .line 27
    .line 28
    :goto_0
    add-int/2addr v1, v3

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, Lsm;->α:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    sget-object v1, Lmk1;->ε:Lв;

    .line 42
    .line 43
    sget-object v1, Lmk1;->ε:Lв;

    .line 44
    .line 45
    invoke-virtual {v1}, Lв;->α()Ljava/util/Random;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v5, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :goto_1
    new-instance v0, Lm;

    .line 69
    .line 70
    invoke-direct {v0, p3, p2}, Lm;-><init>(Lt60;Ls1;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lsm;->ε:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lsm;->ζ:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3, v1}, Lt60;->α(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    iget-object v0, p0, Lsm;->η:Landroid/os/Bundle;

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Lk;

    .line 103
    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget v0, v1, Lk;->ε:I

    .line 110
    .line 111
    iget-object v1, v1, Lk;->ζ:Landroid/content/Intent;

    .line 112
    .line 113
    invoke-virtual {p2, v0, v1}, Ls1;->φ(ILandroid/content/Intent;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p3, p2}, Lt60;->α(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    new-instance p2, Ln5;

    .line 121
    .line 122
    const/4 p3, 0x1

    .line 123
    invoke-direct {p2, p0, p3, p1}, Ln5;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object p2
.end method
