.class public final Li70;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ln5;

.field public final β:Li0;

.field public final γ:Ln60;

.field public δ:Z

.field public ε:I


# direct methods
.method public constructor <init>(Ln5;Li0;Ljava/lang/ClassLoader;Lw60;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Li70;->δ:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Li70;->ε:I

    .line 9
    .line 10
    iput-object p1, p0, Li70;->α:Ln5;

    .line 11
    .line 12
    iput-object p2, p0, Li70;->β:Li0;

    .line 13
    .line 14
    const-string p1, "state"

    .line 15
    .line 16
    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lh70;

    .line 21
    .line 22
    iget-object p2, p1, Lh70;->ε:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p4, p2}, Lw60;->α(Ljava/lang/String;)Ln60;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p4, p1, Lh70;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p4, p2, Ln60;->ι:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean p4, p1, Lh70;->η:Z

    .line 33
    .line 34
    iput-boolean p4, p2, Ln60;->ρ:Z

    .line 35
    .line 36
    const/4 p4, 0x1

    .line 37
    iput-boolean p4, p2, Ln60;->τ:Z

    .line 38
    .line 39
    iget p4, p1, Lh70;->θ:I

    .line 40
    .line 41
    iput p4, p2, Ln60;->Β:I

    .line 42
    .line 43
    iget p4, p1, Lh70;->ι:I

    .line 44
    .line 45
    iput p4, p2, Ln60;->Γ:I

    .line 46
    .line 47
    iget-object p4, p1, Lh70;->κ:Ljava/lang/String;

    .line 48
    .line 49
    iput-object p4, p2, Ln60;->Δ:Ljava/lang/String;

    .line 50
    .line 51
    iget-boolean p4, p1, Lh70;->λ:Z

    .line 52
    .line 53
    iput-boolean p4, p2, Ln60;->Η:Z

    .line 54
    .line 55
    iget-boolean p4, p1, Lh70;->μ:Z

    .line 56
    .line 57
    iput-boolean p4, p2, Ln60;->π:Z

    .line 58
    .line 59
    iget-boolean p4, p1, Lh70;->ν:Z

    .line 60
    .line 61
    iput-boolean p4, p2, Ln60;->Ζ:Z

    .line 62
    .line 63
    iget-boolean p4, p1, Lh70;->ξ:Z

    .line 64
    .line 65
    iput-boolean p4, p2, Ln60;->Ε:Z

    .line 66
    .line 67
    invoke-static {}, Lcr0;->values()[Lcr0;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    iget v0, p1, Lh70;->ο:I

    .line 72
    .line 73
    aget-object p4, p4, v0

    .line 74
    .line 75
    iput-object p4, p2, Ln60;->Ρ:Lcr0;

    .line 76
    .line 77
    iget-object p4, p1, Lh70;->π:Ljava/lang/String;

    .line 78
    .line 79
    iput-object p4, p2, Ln60;->μ:Ljava/lang/String;

    .line 80
    .line 81
    iget p4, p1, Lh70;->ρ:I

    .line 82
    .line 83
    iput p4, p2, Ln60;->ν:I

    .line 84
    .line 85
    iget-boolean p1, p1, Lh70;->σ:Z

    .line 86
    .line 87
    iput-boolean p1, p2, Ln60;->Μ:Z

    .line 88
    .line 89
    iput-object p2, p0, Li70;->γ:Ln60;

    .line 90
    .line 91
    iput-object p5, p2, Ln60;->ζ:Landroid/os/Bundle;

    .line 92
    .line 93
    const-string p0, "arguments"

    .line 94
    .line 95
    invoke-virtual {p5, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_0

    .line 100
    .line 101
    invoke-virtual {p0, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 102
    .line 103
    .line 104
    :cond_0
    iget-object p1, p2, Ln60;->χ:Lb70;

    .line 105
    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    iget-boolean p3, p1, Lb70;->Η:Z

    .line 109
    .line 110
    if-nez p3, :cond_1

    .line 111
    .line 112
    iget-boolean p1, p1, Lb70;->Θ:Z

    .line 113
    .line 114
    if-nez p1, :cond_1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    const-string p0, "Fragment already added and state has been saved"

    .line 118
    .line 119
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const/4 p0, 0x0

    .line 123
    throw p0

    .line 124
    :cond_2
    :goto_0
    iput-object p0, p2, Ln60;->κ:Landroid/os/Bundle;

    .line 125
    .line 126
    const/4 p0, 0x2

    .line 127
    invoke-static {p0}, Lb70;->Η(I)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_3

    .line 132
    .line 133
    new-instance p0, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string p1, "Instantiated fragment "

    .line 136
    .line 137
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string p1, "FragmentManager"

    .line 148
    .line 149
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    :cond_3
    return-void
.end method

.method public constructor <init>(Ln5;Li0;Ln60;)V
    .locals 1

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 154
    iput-boolean v0, p0, Li70;->δ:Z

    const/4 v0, -0x1

    .line 155
    iput v0, p0, Li70;->ε:I

    .line 156
    iput-object p1, p0, Li70;->α:Ln5;

    .line 157
    iput-object p2, p0, Li70;->β:Li0;

    .line 158
    iput-object p3, p0, Li70;->γ:Ln60;

    return-void
.end method

.method public constructor <init>(Ln5;Li0;Ln60;Landroid/os/Bundle;)V
    .locals 2

    .line 159
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 160
    iput-boolean v0, p0, Li70;->δ:Z

    const/4 v1, -0x1

    .line 161
    iput v1, p0, Li70;->ε:I

    .line 162
    iput-object p1, p0, Li70;->α:Ln5;

    .line 163
    iput-object p2, p0, Li70;->β:Li0;

    .line 164
    iput-object p3, p0, Li70;->γ:Ln60;

    const/4 p0, 0x0

    .line 165
    iput-object p0, p3, Ln60;->η:Landroid/util/SparseArray;

    .line 166
    iput-object p0, p3, Ln60;->θ:Landroid/os/Bundle;

    .line 167
    iput v0, p3, Ln60;->φ:I

    .line 168
    iput-boolean v0, p3, Ln60;->σ:Z

    .line 169
    iput-boolean v0, p3, Ln60;->ο:Z

    .line 170
    iget-object p1, p3, Ln60;->λ:Ln60;

    if-eqz p1, :cond_0

    iget-object p1, p1, Ln60;->ι:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    iput-object p1, p3, Ln60;->μ:Ljava/lang/String;

    .line 171
    iput-object p0, p3, Ln60;->λ:Ln60;

    .line 172
    iput-object p4, p3, Ln60;->ζ:Landroid/os/Bundle;

    .line 173
    const-string p0, "arguments"

    invoke-virtual {p4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, p3, Ln60;->κ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final α()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Li70;->γ:Ln60;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Ln60;->ζ:Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v4, "savedInstanceState"

    .line 34
    .line 35
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object v1, v3, Ln60;->ω:Lb70;

    .line 39
    .line 40
    invoke-virtual {v1}, Lb70;->Ν()V

    .line 41
    .line 42
    .line 43
    iput v0, v3, Ln60;->ε:I

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    iput-boolean v1, v3, Ln60;->Ι:Z

    .line 47
    .line 48
    move-object v4, v3

    .line 49
    check-cast v4, Lws;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    iput-boolean v5, v4, Ln60;->Ι:Z

    .line 53
    .line 54
    iget-boolean v4, v3, Ln60;->Ι:Z

    .line 55
    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v4, "moveto RESTORE_VIEW_STATE: "

    .line 67
    .line 68
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    :cond_2
    const/4 v0, 0x0

    .line 82
    iput-object v0, v3, Ln60;->ζ:Landroid/os/Bundle;

    .line 83
    .line 84
    iget-object v0, v3, Ln60;->ω:Lb70;

    .line 85
    .line 86
    iput-boolean v1, v0, Lb70;->Η:Z

    .line 87
    .line 88
    iput-boolean v1, v0, Lb70;->Θ:Z

    .line 89
    .line 90
    iget-object v2, v0, Lb70;->Ξ:Le70;

    .line 91
    .line 92
    iput-boolean v1, v2, Le70;->η:Z

    .line 93
    .line 94
    const/4 v2, 0x4

    .line 95
    invoke-virtual {v0, v2}, Lb70;->υ(I)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Li70;->α:Ln5;

    .line 99
    .line 100
    invoke-virtual {p0, v1}, Ln5;->ρ(Z)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, " did not call through to super.onActivityCreated()"

    .line 105
    .line 106
    invoke-static {v3, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final β()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->λ:Ln60;

    .line 30
    .line 31
    const-string v2, " that does not belong to this FragmentManager!"

    .line 32
    .line 33
    const-string v3, " declared target fragment "

    .line 34
    .line 35
    iget-object v4, p0, Li70;->β:Li0;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Ln60;->ι:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v4, Li0;->η:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Li70;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v2, v1, Ln60;->λ:Ln60;

    .line 57
    .line 58
    iget-object v2, v2, Ln60;->ι:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v2, v1, Ln60;->μ:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v5, v1, Ln60;->λ:Ln60;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, v1, Ln60;->λ:Ln60;

    .line 76
    .line 77
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p0

    .line 94
    :cond_2
    iget-object v0, v1, Ln60;->μ:Ljava/lang/String;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v4, v4, Li0;->η:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v4, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Li70;

    .line 107
    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    iget-object v0, v1, Ln60;->μ:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {p0, v0, v2}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    move-object v0, v5

    .line 133
    :goto_0
    if-eqz v0, :cond_5

    .line 134
    .line 135
    invoke-virtual {v0}, Li70;->κ()V

    .line 136
    .line 137
    .line 138
    :cond_5
    iget-object v0, v1, Ln60;->χ:Lb70;

    .line 139
    .line 140
    iget-object v2, v0, Lb70;->υ:Lp60;

    .line 141
    .line 142
    iput-object v2, v1, Ln60;->ψ:Lp60;

    .line 143
    .line 144
    iget-object v0, v0, Lb70;->χ:Ln60;

    .line 145
    .line 146
    iput-object v0, v1, Ln60;->Α:Ln60;

    .line 147
    .line 148
    iget-object p0, p0, Li70;->α:Ln5;

    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    invoke-virtual {p0, v0}, Ln5;->ψ(Z)V

    .line 152
    .line 153
    .line 154
    iget-object v2, v1, Ln60;->Φ:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_7

    .line 165
    .line 166
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Lk60;

    .line 171
    .line 172
    iget-object v4, v4, Lk60;->α:Lws;

    .line 173
    .line 174
    iget-object v6, v4, Ln60;->Υ:Ln5;

    .line 175
    .line 176
    iget-object v6, v6, Ln5;->ζ:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v6, Ljq1;

    .line 179
    .line 180
    invoke-virtual {v6}, Ljq1;->α()V

    .line 181
    .line 182
    .line 183
    invoke-static {v4}, Lln0;->χ(Lkq1;)V

    .line 184
    .line 185
    .line 186
    iget-object v6, v4, Ln60;->ζ:Landroid/os/Bundle;

    .line 187
    .line 188
    if-eqz v6, :cond_6

    .line 189
    .line 190
    const-string v7, "registryState"

    .line 191
    .line 192
    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    move-object v6, v5

    .line 198
    :goto_2
    iget-object v4, v4, Ln60;->Υ:Ln5;

    .line 199
    .line 200
    invoke-virtual {v4, v6}, Ln5;->Π(Landroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 205
    .line 206
    .line 207
    iget-object v2, v1, Ln60;->ω:Lb70;

    .line 208
    .line 209
    iget-object v3, v1, Ln60;->ψ:Lp60;

    .line 210
    .line 211
    move-object v4, v1

    .line 212
    check-cast v4, Lws;

    .line 213
    .line 214
    new-instance v6, Ll60;

    .line 215
    .line 216
    invoke-direct {v6, v4}, Ll60;-><init>(Ln60;)V

    .line 217
    .line 218
    .line 219
    new-instance v7, Lvs;

    .line 220
    .line 221
    invoke-direct {v7, v4, v6}, Lvs;-><init>(Lws;Ll60;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, v3, v7, v1}, Lb70;->β(Lp60;Lxb;Ln60;)V

    .line 225
    .line 226
    .line 227
    iput v0, v1, Ln60;->ε:I

    .line 228
    .line 229
    iput-boolean v0, v1, Ln60;->Ι:Z

    .line 230
    .line 231
    iget-object v2, v1, Ln60;->ψ:Lp60;

    .line 232
    .line 233
    iget-object v2, v2, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 234
    .line 235
    const/4 v2, 0x1

    .line 236
    iput-boolean v2, v4, Ln60;->Ι:Z

    .line 237
    .line 238
    iget-object v3, v4, Ln60;->ψ:Lp60;

    .line 239
    .line 240
    if-nez v3, :cond_8

    .line 241
    .line 242
    move-object v3, v5

    .line 243
    goto :goto_3

    .line 244
    :cond_8
    iget-object v3, v3, Lp60;->φ:Landroidx/fragment/app/FragmentActivity;

    .line 245
    .line 246
    :goto_3
    if-eqz v3, :cond_9

    .line 247
    .line 248
    iput-boolean v2, v4, Ln60;->Ι:Z

    .line 249
    .line 250
    :cond_9
    iget-object v3, v4, Ln60;->Τ:Lp11;

    .line 251
    .line 252
    iget-object v6, v4, Lws;->з:Ln;

    .line 253
    .line 254
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const-string v7, "observeForever"

    .line 258
    .line 259
    invoke-static {v7}, Lp11;->α(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    new-instance v7, Lju0;

    .line 263
    .line 264
    invoke-direct {v7, v3, v6}, Lju0;-><init>(Lp11;Ln;)V

    .line 265
    .line 266
    .line 267
    iget-object v3, v3, Lp11;->β:Lup1;

    .line 268
    .line 269
    invoke-virtual {v3, v6}, Lup1;->α(Ljava/lang/Object;)Lrp1;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    if-eqz v8, :cond_a

    .line 274
    .line 275
    iget-object v5, v8, Lrp1;->ζ:Ljava/lang/Object;

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_a
    new-instance v8, Lrp1;

    .line 279
    .line 280
    invoke-direct {v8, v6, v7}, Lrp1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    iget v6, v3, Lup1;->θ:I

    .line 284
    .line 285
    add-int/2addr v6, v2

    .line 286
    iput v6, v3, Lup1;->θ:I

    .line 287
    .line 288
    iget-object v6, v3, Lup1;->ζ:Lrp1;

    .line 289
    .line 290
    if-nez v6, :cond_b

    .line 291
    .line 292
    iput-object v8, v3, Lup1;->ε:Lrp1;

    .line 293
    .line 294
    iput-object v8, v3, Lup1;->ζ:Lrp1;

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_b
    iput-object v8, v6, Lrp1;->η:Lrp1;

    .line 298
    .line 299
    iput-object v6, v8, Lrp1;->θ:Lrp1;

    .line 300
    .line 301
    iput-object v8, v3, Lup1;->ζ:Lrp1;

    .line 302
    .line 303
    :goto_4
    check-cast v5, Lju0;

    .line 304
    .line 305
    if-eqz v5, :cond_c

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_c
    invoke-virtual {v7, v2}, Lju0;->α(Z)V

    .line 309
    .line 310
    .line 311
    :goto_5
    iput-boolean v0, v4, Lws;->к:Z

    .line 312
    .line 313
    iget-boolean v2, v1, Ln60;->Ι:Z

    .line 314
    .line 315
    if-eqz v2, :cond_e

    .line 316
    .line 317
    iget-object v2, v1, Ln60;->χ:Lb70;

    .line 318
    .line 319
    iget-object v2, v2, Lb70;->ν:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-eqz v3, :cond_d

    .line 330
    .line 331
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    check-cast v3, Lf70;

    .line 336
    .line 337
    invoke-interface {v3}, Lf70;->β()V

    .line 338
    .line 339
    .line 340
    goto :goto_6

    .line 341
    :cond_d
    iget-object v1, v1, Ln60;->ω:Lb70;

    .line 342
    .line 343
    iput-boolean v0, v1, Lb70;->Η:Z

    .line 344
    .line 345
    iput-boolean v0, v1, Lb70;->Θ:Z

    .line 346
    .line 347
    iget-object v2, v1, Lb70;->Ξ:Le70;

    .line 348
    .line 349
    iput-boolean v0, v2, Le70;->η:Z

    .line 350
    .line 351
    invoke-virtual {v1, v0}, Lb70;->υ(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p0, v0}, Ln5;->σ(Z)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :cond_e
    const-string p0, " did not call through to super.onAttach()"

    .line 359
    .line 360
    invoke-static {v1, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-void
.end method

.method public final γ()I
    .locals 11

    .line 1
    iget-object v0, p0, Li70;->γ:Ln60;

    .line 2
    .line 3
    iget-object v1, v0, Ln60;->χ:Lb70;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget p0, v0, Ln60;->ε:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    iget v1, p0, Li70;->ε:I

    .line 11
    .line 12
    iget-object v2, v0, Ln60;->Ρ:Lcr0;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x5

    .line 19
    const/4 v4, -0x1

    .line 20
    const/4 v5, 0x4

    .line 21
    const/4 v6, 0x2

    .line 22
    const/4 v7, 0x1

    .line 23
    if-eq v2, v7, :cond_3

    .line 24
    .line 25
    if-eq v2, v6, :cond_2

    .line 26
    .line 27
    const/4 v8, 0x3

    .line 28
    if-eq v2, v8, :cond_1

    .line 29
    .line 30
    if-eq v2, v5, :cond_4

    .line 31
    .line 32
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/4 v2, 0x0

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Ln60;->ρ:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Ln60;->σ:Z

    .line 57
    .line 58
    iget p0, p0, Li70;->ε:I

    .line 59
    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-static {p0, v6}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_1

    .line 67
    :cond_5
    if-ge p0, v5, :cond_6

    .line 68
    .line 69
    iget p0, v0, Ln60;->ε:I

    .line 70
    .line 71
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    goto :goto_1

    .line 76
    :cond_6
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    :cond_7
    :goto_1
    iget-boolean p0, v0, Ln60;->ο:Z

    .line 81
    .line 82
    if-nez p0, :cond_8

    .line 83
    .line 84
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    :cond_8
    iget-object p0, v0, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 89
    .line 90
    if-eqz p0, :cond_e

    .line 91
    .line 92
    invoke-virtual {v0}, Ln60;->θ()Lb70;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Lb70;->Ε()Li2;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const v2, 0x7f0902c3

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    instance-of v9, v8, Lpr;

    .line 111
    .line 112
    if-eqz v9, :cond_9

    .line 113
    .line 114
    check-cast v8, Lpr;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_9
    new-instance v8, Lpr;

    .line 118
    .line 119
    invoke-direct {v8, p0}, Lpr;-><init>(Landroid/view/ViewGroup;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v2, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    iget-object p0, v8, Lpr;->β:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    const/4 v9, 0x0

    .line 136
    if-eqz v2, :cond_b

    .line 137
    .line 138
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    move-object v10, v2

    .line 143
    check-cast v10, Lmz1;

    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-static {v9, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    if-eqz v10, :cond_a

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    move-object v2, v9

    .line 156
    :goto_3
    check-cast v2, Lmz1;

    .line 157
    .line 158
    iget-object p0, v8, Lpr;->γ:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_d

    .line 169
    .line 170
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object v8, v2

    .line 175
    check-cast v8, Lmz1;

    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {v9, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_c

    .line 185
    .line 186
    move-object v9, v2

    .line 187
    :cond_d
    check-cast v9, Lmz1;

    .line 188
    .line 189
    :cond_e
    iget-boolean p0, v0, Ln60;->π:Z

    .line 190
    .line 191
    if-eqz p0, :cond_10

    .line 192
    .line 193
    invoke-virtual {v0}, Ln60;->μ()Z

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    if-eqz p0, :cond_f

    .line 198
    .line 199
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    goto :goto_4

    .line 204
    :cond_f
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    :cond_10
    :goto_4
    iget-boolean p0, v0, Ln60;->Λ:Z

    .line 209
    .line 210
    if-eqz p0, :cond_11

    .line 211
    .line 212
    iget p0, v0, Ln60;->ε:I

    .line 213
    .line 214
    if-ge p0, v3, :cond_11

    .line 215
    .line 216
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :cond_11
    invoke-static {v6}, Lb70;->Η(I)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_12

    .line 225
    .line 226
    new-instance p0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v2, "computeExpectedState() of "

    .line 229
    .line 230
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v2, " for "

    .line 237
    .line 238
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const-string v0, "FragmentManager"

    .line 249
    .line 250
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    :cond_12
    return v1
.end method

.method public final δ()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->ζ:Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    const-string v2, "savedInstanceState"

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    iget-boolean v2, v1, Ln60;->Ο:Z

    .line 42
    .line 43
    const-string v3, "childFragmentManager"

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v2, :cond_7

    .line 48
    .line 49
    iget-object p0, p0, Li70;->α:Ln5;

    .line 50
    .line 51
    invoke-virtual {p0, v5}, Ln5;->ω(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v1, Ln60;->ω:Lb70;

    .line 55
    .line 56
    invoke-virtual {v2}, Lb70;->Ν()V

    .line 57
    .line 58
    .line 59
    iput v4, v1, Ln60;->ε:I

    .line 60
    .line 61
    iput-boolean v5, v1, Ln60;->Ι:Z

    .line 62
    .line 63
    iget-object v2, v1, Ln60;->Σ:Ljr0;

    .line 64
    .line 65
    new-instance v6, Lll1;

    .line 66
    .line 67
    const/4 v7, 0x2

    .line 68
    invoke-direct {v6, v7, v1}, Lll1;-><init>(ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v6}, Ljr0;->α(Lgr0;)V

    .line 72
    .line 73
    .line 74
    move-object v2, v1

    .line 75
    check-cast v2, Lws;

    .line 76
    .line 77
    iput-boolean v4, v2, Ln60;->Ι:Z

    .line 78
    .line 79
    iget-object v6, v2, Ln60;->ζ:Landroid/os/Bundle;

    .line 80
    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    invoke-virtual {v6, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    iget-object v6, v2, Ln60;->ω:Lb70;

    .line 90
    .line 91
    invoke-virtual {v6, v3}, Lb70;->Τ(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    iget-object v3, v2, Ln60;->ω:Lb70;

    .line 95
    .line 96
    iput-boolean v5, v3, Lb70;->Η:Z

    .line 97
    .line 98
    iput-boolean v5, v3, Lb70;->Θ:Z

    .line 99
    .line 100
    iget-object v6, v3, Lb70;->Ξ:Le70;

    .line 101
    .line 102
    iput-boolean v5, v6, Le70;->η:Z

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Lb70;->υ(I)V

    .line 105
    .line 106
    .line 107
    :cond_2
    iget-object v3, v2, Ln60;->ω:Lb70;

    .line 108
    .line 109
    iget v6, v3, Lb70;->τ:I

    .line 110
    .line 111
    if-lt v6, v4, :cond_3

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    iput-boolean v5, v3, Lb70;->Η:Z

    .line 115
    .line 116
    iput-boolean v5, v3, Lb70;->Θ:Z

    .line 117
    .line 118
    iget-object v6, v3, Lb70;->Ξ:Le70;

    .line 119
    .line 120
    iput-boolean v5, v6, Le70;->η:Z

    .line 121
    .line 122
    invoke-virtual {v3, v4}, Lb70;->υ(I)V

    .line 123
    .line 124
    .line 125
    :goto_1
    new-instance v3, Landroid/os/Handler;

    .line 126
    .line 127
    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 128
    .line 129
    .line 130
    iget v3, v2, Ln60;->Γ:I

    .line 131
    .line 132
    if-nez v3, :cond_4

    .line 133
    .line 134
    move v3, v4

    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move v3, v5

    .line 137
    :goto_2
    iput-boolean v3, v2, Lws;->д:Z

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    const-string v3, "android:style"

    .line 142
    .line 143
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    iput v3, v2, Lws;->б:I

    .line 148
    .line 149
    const-string v3, "android:theme"

    .line 150
    .line 151
    invoke-virtual {v0, v3, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    iput v3, v2, Lws;->в:I

    .line 156
    .line 157
    const-string v3, "android:cancelable"

    .line 158
    .line 159
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    iput-boolean v3, v2, Lws;->г:Z

    .line 164
    .line 165
    const-string v3, "android:showsDialog"

    .line 166
    .line 167
    iget-boolean v6, v2, Lws;->д:Z

    .line 168
    .line 169
    invoke-virtual {v0, v3, v6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    iput-boolean v3, v2, Lws;->д:Z

    .line 174
    .line 175
    const-string v3, "android:backStackId"

    .line 176
    .line 177
    const/4 v6, -0x1

    .line 178
    invoke-virtual {v0, v3, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    iput v0, v2, Lws;->е:I

    .line 183
    .line 184
    :cond_5
    iput-boolean v4, v1, Ln60;->Ο:Z

    .line 185
    .line 186
    iget-boolean v0, v1, Ln60;->Ι:Z

    .line 187
    .line 188
    if-eqz v0, :cond_6

    .line 189
    .line 190
    iget-object v0, v1, Ln60;->Σ:Ljr0;

    .line 191
    .line 192
    sget-object v1, Lbr0;->ON_CREATE:Lbr0;

    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljr0;->δ(Lbr0;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v5}, Ln5;->τ(Z)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_6
    const-string p0, " did not call through to super.onCreate()"

    .line 202
    .line 203
    invoke-static {v1, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_7
    iput v4, v1, Ln60;->ε:I

    .line 208
    .line 209
    iget-object p0, v1, Ln60;->ζ:Landroid/os/Bundle;

    .line 210
    .line 211
    if-eqz p0, :cond_8

    .line 212
    .line 213
    invoke-virtual {p0, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-eqz p0, :cond_8

    .line 218
    .line 219
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 220
    .line 221
    invoke-virtual {v0, p0}, Lb70;->Τ(Landroid/os/Bundle;)V

    .line 222
    .line 223
    .line 224
    iget-object p0, v1, Ln60;->ω:Lb70;

    .line 225
    .line 226
    iput-boolean v5, p0, Lb70;->Η:Z

    .line 227
    .line 228
    iput-boolean v5, p0, Lb70;->Θ:Z

    .line 229
    .line 230
    iget-object v0, p0, Lb70;->Ξ:Le70;

    .line 231
    .line 232
    iput-boolean v5, v0, Le70;->η:Z

    .line 233
    .line 234
    invoke-virtual {p0, v4}, Lb70;->υ(I)V

    .line 235
    .line 236
    .line 237
    :cond_8
    return-void
.end method

.method public final ε()V
    .locals 5

    .line 1
    iget-object p0, p0, Li70;->γ:Ln60;

    .line 2
    .line 3
    iget-boolean v0, p0, Ln60;->ρ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x3

    .line 9
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "moveto CREATE_VIEW: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string v2, "savedInstanceState"

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v0, v1

    .line 47
    :goto_0
    invoke-virtual {p0}, Ln60;->ο()Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    move-object v1, v2

    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_3
    iget v2, p0, Ln60;->Γ:I

    .line 58
    .line 59
    if-eqz v2, :cond_7

    .line 60
    .line 61
    const/4 v1, -0x1

    .line 62
    if-eq v2, v1, :cond_6

    .line 63
    .line 64
    iget-object v1, p0, Ln60;->χ:Lb70;

    .line 65
    .line 66
    iget-object v1, v1, Lb70;->φ:Lxb;

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lxb;->Ρ(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroid/view/ViewGroup;

    .line 73
    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    iget-boolean v2, p0, Ln60;->τ:Z

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :try_start_0
    invoke-virtual {p0}, Ln60;->π()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v1, p0, Ln60;->Γ:I

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_1

    .line 96
    :catch_0
    const-string v0, "unknown"

    .line 97
    .line 98
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    iget v2, p0, Ln60;->Γ:I

    .line 101
    .line 102
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v3, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v4, "No view found for id 0x"

    .line 109
    .line 110
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v2, " ("

    .line 117
    .line 118
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v0, ") for fragment "

    .line 125
    .line 126
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v1

    .line 140
    :cond_5
    instance-of v2, v1, Landroidx/fragment/app/FragmentContainerView;

    .line 141
    .line 142
    if-nez v2, :cond_7

    .line 143
    .line 144
    sget-object v2, Lk70;->α:Lj70;

    .line 145
    .line 146
    new-instance v2, Lg70;

    .line 147
    .line 148
    new-instance v3, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v4, "Attempting to add fragment "

    .line 151
    .line 152
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v4, " to container "

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v4, " which is not a FragmentContainerView"

    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-direct {v2, p0, v3}, Lg70;-><init>(Ln60;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v2}, Lk70;->β(Lg70;)V

    .line 179
    .line 180
    .line 181
    invoke-static {p0}, Lk70;->α(Ln60;)Lj70;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_6
    const-string v0, "Cannot create fragment "

    .line 190
    .line 191
    const-string v1, " for a container view with no id"

    .line 192
    .line 193
    invoke-static {v0, p0, v1}, Lql1;->ζ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_7
    :goto_2
    iput-object v1, p0, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 198
    .line 199
    invoke-virtual {p0, v0}, Ln60;->ξ(Landroid/os/Bundle;)V

    .line 200
    .line 201
    .line 202
    const/4 v0, 0x2

    .line 203
    iput v0, p0, Ln60;->ε:I

    .line 204
    .line 205
    return-void
.end method

.method public final ζ()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, Ln60;->π:Z

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Ln60;->μ()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v2

    .line 44
    :goto_0
    const/4 v4, 0x0

    .line 45
    iget-object v5, p0, Li70;->β:Li0;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v6, v1, Ln60;->ι:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v5, v4, v6}, Li0;->Ζ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    :cond_2
    if-nez v0, :cond_7

    .line 55
    .line 56
    iget-object v6, v5, Li0;->ι:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v6, Le70;

    .line 59
    .line 60
    iget-object v7, v6, Le70;->β:Ljava/util/HashMap;

    .line 61
    .line 62
    iget-object v8, v1, Ln60;->ι:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget-boolean v7, v6, Le70;->ε:Z

    .line 72
    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    iget-boolean v6, v6, Le70;->ζ:Z

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    move v6, v3

    .line 79
    :goto_2
    if-eqz v6, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    iget-object p0, v1, Ln60;->μ:Ljava/lang/String;

    .line 83
    .line 84
    if-eqz p0, :cond_6

    .line 85
    .line 86
    invoke-virtual {v5, p0}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p0, :cond_6

    .line 91
    .line 92
    iget-boolean v0, p0, Ln60;->Η:Z

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iput-object p0, v1, Ln60;->λ:Ln60;

    .line 97
    .line 98
    :cond_6
    iput v2, v1, Ln60;->ε:I

    .line 99
    .line 100
    return-void

    .line 101
    :cond_7
    :goto_3
    iget-object v6, v1, Ln60;->ψ:Lp60;

    .line 102
    .line 103
    if-eqz v6, :cond_8

    .line 104
    .line 105
    iget-object v6, v5, Li0;->ι:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v6, Le70;

    .line 108
    .line 109
    iget-boolean v6, v6, Le70;->ζ:Z

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    iget-object v6, v6, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 113
    .line 114
    if-eqz v6, :cond_9

    .line 115
    .line 116
    invoke-virtual {v6}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    xor-int/2addr v6, v3

    .line 121
    goto :goto_4

    .line 122
    :cond_9
    move v6, v3

    .line 123
    :goto_4
    if-eqz v0, :cond_a

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_a
    if-eqz v6, :cond_b

    .line 127
    .line 128
    :goto_5
    iget-object v0, v5, Li0;->ι:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Le70;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Le70;->γ(Ln60;)V

    .line 133
    .line 134
    .line 135
    :cond_b
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 136
    .line 137
    invoke-virtual {v0}, Lb70;->λ()V

    .line 138
    .line 139
    .line 140
    iget-object v0, v1, Ln60;->Σ:Ljr0;

    .line 141
    .line 142
    sget-object v6, Lbr0;->ON_DESTROY:Lbr0;

    .line 143
    .line 144
    invoke-virtual {v0, v6}, Ljr0;->δ(Lbr0;)V

    .line 145
    .line 146
    .line 147
    iput v2, v1, Ln60;->ε:I

    .line 148
    .line 149
    iput-boolean v2, v1, Ln60;->Ο:Z

    .line 150
    .line 151
    iput-boolean v3, v1, Ln60;->Ι:Z

    .line 152
    .line 153
    iget-object v0, p0, Li70;->α:Ln5;

    .line 154
    .line 155
    invoke-virtual {v0, v2}, Ln5;->υ(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5}, Li0;->υ()Ljava/util/ArrayList;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_d

    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Li70;

    .line 177
    .line 178
    if-eqz v2, :cond_c

    .line 179
    .line 180
    iget-object v2, v2, Li70;->γ:Ln60;

    .line 181
    .line 182
    iget-object v3, v1, Ln60;->ι:Ljava/lang/String;

    .line 183
    .line 184
    iget-object v6, v2, Ln60;->μ:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_c

    .line 191
    .line 192
    iput-object v1, v2, Ln60;->λ:Ln60;

    .line 193
    .line 194
    iput-object v4, v2, Ln60;->μ:Ljava/lang/String;

    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_d
    iget-object v0, v1, Ln60;->μ:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v0, :cond_e

    .line 200
    .line 201
    invoke-virtual {v5, v0}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, v1, Ln60;->λ:Ln60;

    .line 206
    .line 207
    :cond_e
    invoke-virtual {v5, p0}, Li0;->Γ(Li70;)V

    .line 208
    .line 209
    .line 210
    return-void
.end method

.method public final η()V
    .locals 8

    .line 1
    iget-object v0, p0, Li70;->γ:Ln60;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-static {v1}, Lb70;->Η(I)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 30
    .line 31
    iget-object v1, v0, Ln60;->ω:Lb70;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, v2}, Lb70;->υ(I)V

    .line 35
    .line 36
    .line 37
    iput v2, v0, Ln60;->ε:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    iput-boolean v1, v0, Ln60;->Ι:Z

    .line 41
    .line 42
    move-object v3, v0

    .line 43
    check-cast v3, Lws;

    .line 44
    .line 45
    iput-boolean v2, v3, Ln60;->Ι:Z

    .line 46
    .line 47
    iget-object v4, v3, Lws;->и:Lxm;

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iput-boolean v2, v3, Lws;->й:Z

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v3, Lws;->и:Lxm;

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/app/Dialog;->dismiss()V

    .line 60
    .line 61
    .line 62
    iget-boolean v4, v3, Lws;->к:Z

    .line 63
    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    iget-object v4, v3, Lws;->и:Lxm;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lws;->onDismiss(Landroid/content/DialogInterface;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iput-object v5, v3, Lws;->и:Lxm;

    .line 72
    .line 73
    iput-boolean v1, v3, Lws;->л:Z

    .line 74
    .line 75
    :cond_2
    iget-boolean v3, v0, Ln60;->Ι:Z

    .line 76
    .line 77
    if-eqz v3, :cond_5

    .line 78
    .line 79
    invoke-interface {v0}, Lr92;->γ()Lq92;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, Lvu0;->γ:Ld70;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v6, Lgq;->β:Lgq;

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v7, Li0;

    .line 94
    .line 95
    invoke-direct {v7, v3, v4, v6}, Li0;-><init>(Lq92;Lp92;Lhq;)V

    .line 96
    .line 97
    .line 98
    const-class v3, Lvu0;

    .line 99
    .line 100
    invoke-static {v3}, Lvm1;->α(Ljava/lang/Class;)Lwf;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v3}, Lwf;->β()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    const-string v6, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 111
    .line 112
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v7, v3, v4}, Li0;->ψ(Lwf;Ljava/lang/String;)Lm92;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Lvu0;

    .line 121
    .line 122
    iget-object v3, v3, Lvu0;->β:Lkz1;

    .line 123
    .line 124
    iget v4, v3, Lkz1;->η:I

    .line 125
    .line 126
    if-gtz v4, :cond_3

    .line 127
    .line 128
    iput-boolean v1, v0, Ln60;->υ:Z

    .line 129
    .line 130
    iget-object p0, p0, Li70;->α:Ln5;

    .line 131
    .line 132
    invoke-virtual {p0, v1}, Ln5;->Ε(Z)V

    .line 133
    .line 134
    .line 135
    iput-object v5, v0, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 136
    .line 137
    iget-object p0, v0, Ln60;->Τ:Lp11;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const-string v3, "setValue"

    .line 143
    .line 144
    invoke-static {v3}, Lp11;->α(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget v3, p0, Lp11;->η:I

    .line 148
    .line 149
    add-int/2addr v3, v2

    .line 150
    iput v3, p0, Lp11;->η:I

    .line 151
    .line 152
    iput-object v5, p0, Lp11;->ε:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-virtual {p0, v5}, Lp11;->γ(Lju0;)V

    .line 155
    .line 156
    .line 157
    iput-boolean v1, v0, Ln60;->σ:Z

    .line 158
    .line 159
    return-void

    .line 160
    :cond_3
    invoke-virtual {v3, v1}, Lkz1;->δ(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Lγ;->β()V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_4
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 172
    .line 173
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_5
    const-string p0, " did not call through to super.onDestroyView()"

    .line 178
    .line 179
    invoke-static {v0, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public final θ()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Li70;->γ:Ln60;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom ATTACHED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, -0x1

    .line 30
    iput v1, v3, Ln60;->ε:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, Ln60;->Ι:Z

    .line 34
    .line 35
    move-object v5, v3

    .line 36
    check-cast v5, Lws;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    iput-boolean v6, v5, Ln60;->Ι:Z

    .line 40
    .line 41
    iget-boolean v7, v5, Lws;->к:Z

    .line 42
    .line 43
    if-nez v7, :cond_1

    .line 44
    .line 45
    iput-boolean v6, v5, Lws;->к:Z

    .line 46
    .line 47
    :cond_1
    iget-object v7, v5, Ln60;->Τ:Lp11;

    .line 48
    .line 49
    iget-object v5, v5, Lws;->з:Ln;

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string v8, "removeObserver"

    .line 55
    .line 56
    invoke-static {v8}, Lp11;->α(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v7, v7, Lp11;->β:Lup1;

    .line 60
    .line 61
    invoke-virtual {v7, v5}, Lup1;->β(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    check-cast v5, Lju0;

    .line 66
    .line 67
    if-nez v5, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v5, v4}, Lju0;->α(Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    iget-boolean v5, v3, Ln60;->Ι:Z

    .line 74
    .line 75
    if-eqz v5, :cond_9

    .line 76
    .line 77
    iget-object v5, v3, Ln60;->ω:Lb70;

    .line 78
    .line 79
    iget-boolean v7, v5, Lb70;->Ι:Z

    .line 80
    .line 81
    if-nez v7, :cond_3

    .line 82
    .line 83
    invoke-virtual {v5}, Lb70;->λ()V

    .line 84
    .line 85
    .line 86
    new-instance v5, Lb70;

    .line 87
    .line 88
    invoke-direct {v5}, Lb70;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v5, v3, Ln60;->ω:Lb70;

    .line 92
    .line 93
    :cond_3
    iget-object v5, p0, Li70;->α:Ln5;

    .line 94
    .line 95
    invoke-virtual {v5, v4}, Ln5;->φ(Z)V

    .line 96
    .line 97
    .line 98
    iput v1, v3, Ln60;->ε:I

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    iput-object v1, v3, Ln60;->ψ:Lp60;

    .line 102
    .line 103
    iput-object v1, v3, Ln60;->Α:Ln60;

    .line 104
    .line 105
    iput-object v1, v3, Ln60;->χ:Lb70;

    .line 106
    .line 107
    iget-boolean v1, v3, Ln60;->π:Z

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    invoke-virtual {v3}, Ln60;->μ()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    iget-object p0, p0, Li70;->β:Li0;

    .line 119
    .line 120
    iget-object p0, p0, Li0;->ι:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, Le70;

    .line 123
    .line 124
    iget-object v1, p0, Le70;->β:Ljava/util/HashMap;

    .line 125
    .line 126
    iget-object v4, v3, Ln60;->ι:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-nez v1, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    iget-boolean v1, p0, Le70;->ε:Z

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    iget-boolean v6, p0, Le70;->ζ:Z

    .line 140
    .line 141
    :cond_6
    :goto_1
    if-eqz v6, :cond_8

    .line 142
    .line 143
    :goto_2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_7

    .line 148
    .line 149
    new-instance p0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v0, "initState called for fragment: "

    .line 152
    .line 153
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    :cond_7
    invoke-virtual {v3}, Ln60;->κ()V

    .line 167
    .line 168
    .line 169
    :cond_8
    return-void

    .line 170
    :cond_9
    const-string p0, " did not call through to super.onDetach()"

    .line 171
    .line 172
    invoke-static {v3, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final ι()V
    .locals 2

    .line 1
    iget-object p0, p0, Li70;->γ:Ln60;

    .line 2
    .line 3
    iget-boolean v0, p0, Ln60;->ρ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Ln60;->σ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Ln60;->υ:Z

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const-string v1, "savedInstanceState"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v0, 0x0

    .line 53
    :goto_0
    invoke-virtual {p0}, Ln60;->ο()Landroid/view/LayoutInflater;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ln60;->ξ(Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final κ()V
    .locals 10

    .line 1
    iget-object v0, p0, Li70;->β:Li0;

    .line 2
    .line 3
    iget-boolean v1, p0, Li70;->δ:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "FragmentManager"

    .line 7
    .line 8
    iget-object v4, p0, Li70;->γ:Ln60;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v2}, Lb70;->Η(I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    new-instance p0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    const/4 v5, 0x1

    .line 38
    :try_start_0
    iput-boolean v5, p0, Li70;->δ:Z

    .line 39
    .line 40
    move v6, v1

    .line 41
    :goto_0
    invoke-virtual {p0}, Li70;->γ()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget v8, v4, Ln60;->ε:I

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-eq v7, v8, :cond_4

    .line 49
    .line 50
    if-le v7, v8, :cond_2

    .line 51
    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    packed-switch v8, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_0
    invoke-virtual {p0}, Li70;->ν()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :pswitch_1
    const/4 v6, 0x6

    .line 68
    iput v6, v4, Ln60;->ε:I

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_2
    invoke-virtual {p0}, Li70;->ξ()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :pswitch_3
    const/4 v6, 0x4

    .line 76
    iput v6, v4, Ln60;->ε:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_4
    invoke-virtual {p0}, Li70;->α()V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_5
    invoke-virtual {p0}, Li70;->ι()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Li70;->ε()V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_6
    invoke-virtual {p0}, Li70;->δ()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_7
    invoke-virtual {p0}, Li70;->β()V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    add-int/lit8 v8, v8, -0x1

    .line 99
    .line 100
    packed-switch v8, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_8
    invoke-virtual {p0}, Li70;->λ()V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_9
    const/4 v6, 0x5

    .line 109
    iput v6, v4, Ln60;->ε:I

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_a
    invoke-virtual {p0}, Li70;->ο()V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_b
    invoke-static {v9}, Lb70;->Η(I)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_3

    .line 121
    .line 122
    new-instance v6, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v7, "movefrom ACTIVITY_CREATED: "

    .line 128
    .line 129
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    :cond_3
    iput v9, v4, Ln60;->ε:I

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :pswitch_c
    iput-boolean v1, v4, Ln60;->σ:Z

    .line 146
    .line 147
    iput v2, v4, Ln60;->ε:I

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :pswitch_d
    invoke-virtual {p0}, Li70;->η()V

    .line 151
    .line 152
    .line 153
    iput v5, v4, Ln60;->ε:I

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :pswitch_e
    invoke-virtual {p0}, Li70;->ζ()V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_f
    invoke-virtual {p0}, Li70;->θ()V

    .line 161
    .line 162
    .line 163
    :goto_1
    move v6, v5

    .line 164
    goto :goto_0

    .line 165
    :cond_4
    if-nez v6, :cond_7

    .line 166
    .line 167
    const/4 v2, -0x1

    .line 168
    if-ne v8, v2, :cond_7

    .line 169
    .line 170
    iget-boolean v2, v4, Ln60;->π:Z

    .line 171
    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    invoke-virtual {v4}, Ln60;->μ()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-nez v2, :cond_7

    .line 179
    .line 180
    invoke-static {v9}, Lb70;->Η(I)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_5

    .line 185
    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    const-string v6, "Cleaning up state of never attached fragment: "

    .line 192
    .line 193
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    :cond_5
    iget-object v2, v0, Li0;->ι:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v2, Le70;

    .line 209
    .line 210
    invoke-virtual {v2, v4}, Le70;->γ(Ln60;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, p0}, Li0;->Γ(Li70;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v9}, Lb70;->Η(I)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_6

    .line 221
    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-string v2, "initState called for fragment: "

    .line 228
    .line 229
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :cond_6
    invoke-virtual {v4}, Ln60;->κ()V

    .line 243
    .line 244
    .line 245
    :cond_7
    iget-boolean v0, v4, Ln60;->Ξ:Z

    .line 246
    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    iget-object v0, v4, Ln60;->χ:Lb70;

    .line 250
    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    iget-boolean v2, v4, Ln60;->ο:Z

    .line 254
    .line 255
    if-eqz v2, :cond_8

    .line 256
    .line 257
    invoke-static {v4}, Lb70;->Θ(Ln60;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_8

    .line 262
    .line 263
    iput-boolean v5, v0, Lb70;->Ζ:Z

    .line 264
    .line 265
    :cond_8
    iput-boolean v1, v4, Ln60;->Ξ:Z

    .line 266
    .line 267
    iget-object v0, v4, Ln60;->ω:Lb70;

    .line 268
    .line 269
    invoke-virtual {v0}, Lb70;->ξ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    .line 271
    .line 272
    :cond_9
    iput-boolean v1, p0, Li70;->δ:Z

    .line 273
    .line 274
    return-void

    .line 275
    :goto_2
    iput-boolean v1, p0, Li70;->δ:Z

    .line 276
    .line 277
    throw v0

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final λ()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, Lb70;->υ(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, Ln60;->Σ:Ljr0;

    .line 36
    .line 37
    sget-object v2, Lbr0;->ON_PAUSE:Lbr0;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljr0;->δ(Lbr0;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x6

    .line 43
    iput v0, v1, Ln60;->ε:I

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, v1, Ln60;->Ι:Z

    .line 47
    .line 48
    iget-object p0, p0, Li70;->α:Ln5;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0, v0}, Ln5;->χ(Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final μ(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    iget-object p0, p0, Li70;->γ:Ln60;

    .line 2
    .line 3
    iget-object v0, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v0, "savedInstanceState"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 22
    .line 23
    new-instance v1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object p1, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v0, "viewState"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Ln60;->η:Landroid/util/SparseArray;

    .line 40
    .line 41
    iget-object p1, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 42
    .line 43
    const-string v0, "viewRegistryState"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Ln60;->θ:Landroid/os/Bundle;

    .line 50
    .line 51
    iget-object p1, p0, Ln60;->ζ:Landroid/os/Bundle;

    .line 52
    .line 53
    const-string v0, "state"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lh70;

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget-object v0, p1, Lh70;->π:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v0, p0, Ln60;->μ:Ljava/lang/String;

    .line 66
    .line 67
    iget v0, p1, Lh70;->ρ:I

    .line 68
    .line 69
    iput v0, p0, Ln60;->ν:I

    .line 70
    .line 71
    iget-boolean p1, p1, Lh70;->σ:Z

    .line 72
    .line 73
    iput-boolean p1, p0, Ln60;->Μ:Z

    .line 74
    .line 75
    :cond_2
    iget-boolean p1, p0, Ln60;->Μ:Z

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    iput-boolean p1, p0, Ln60;->Λ:Z

    .line 81
    .line 82
    :cond_3
    :goto_0
    return-void
.end method

.method public final ν()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->Ν:Lm60;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, Lm60;->κ:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_1
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {v1}, Ln60;->ε()Lm60;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v2, v0, Lm60;->κ:Landroid/view/View;

    .line 56
    .line 57
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 58
    .line 59
    invoke-virtual {v0}, Lb70;->Ν()V

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    invoke-virtual {v0, v3}, Lb70;->ω(Z)Z

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x7

    .line 69
    iput v0, v1, Ln60;->ε:I

    .line 70
    .line 71
    iput-boolean v3, v1, Ln60;->Ι:Z

    .line 72
    .line 73
    iget-object v3, v1, Ln60;->Σ:Ljr0;

    .line 74
    .line 75
    sget-object v4, Lbr0;->ON_RESUME:Lbr0;

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljr0;->δ(Lbr0;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, v1, Ln60;->ω:Lb70;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    iput-boolean v4, v3, Lb70;->Η:Z

    .line 84
    .line 85
    iput-boolean v4, v3, Lb70;->Θ:Z

    .line 86
    .line 87
    iget-object v5, v3, Lb70;->Ξ:Le70;

    .line 88
    .line 89
    iput-boolean v4, v5, Le70;->η:Z

    .line 90
    .line 91
    invoke-virtual {v3, v0}, Lb70;->υ(I)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Li70;->α:Ln5;

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Ln5;->Α(Z)V

    .line 97
    .line 98
    .line 99
    iget-object p0, p0, Li70;->β:Li0;

    .line 100
    .line 101
    iget-object v0, v1, Ln60;->ι:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {p0, v2, v0}, Li0;->Ζ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 104
    .line 105
    .line 106
    iput-object v2, v1, Ln60;->ζ:Landroid/os/Bundle;

    .line 107
    .line 108
    iput-object v2, v1, Ln60;->η:Landroid/util/SparseArray;

    .line 109
    .line 110
    iput-object v2, v1, Ln60;->θ:Landroid/os/Bundle;

    .line 111
    .line 112
    return-void
.end method

.method public final ξ()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 30
    .line 31
    invoke-virtual {v0}, Lb70;->Ν()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Lb70;->ω(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Ln60;->ε:I

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    iput-boolean v3, v1, Ln60;->Ι:Z

    .line 45
    .line 46
    move-object v4, v1

    .line 47
    check-cast v4, Lws;

    .line 48
    .line 49
    iput-boolean v2, v4, Ln60;->Ι:Z

    .line 50
    .line 51
    iget-object v2, v4, Lws;->и:Lxm;

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    iput-boolean v3, v4, Lws;->й:Z

    .line 56
    .line 57
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 58
    .line 59
    .line 60
    iget-object v2, v4, Lws;->и:Lxm;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const v5, 0x7f090386

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const v5, 0x7f090389

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const v5, 0x7f090388

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v5, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    iget-boolean v2, v1, Ln60;->Ι:Z

    .line 92
    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    iget-object v2, v1, Ln60;->Σ:Ljr0;

    .line 96
    .line 97
    sget-object v4, Lbr0;->ON_START:Lbr0;

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Ljr0;->δ(Lbr0;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v1, Ln60;->ω:Lb70;

    .line 103
    .line 104
    iput-boolean v3, v1, Lb70;->Η:Z

    .line 105
    .line 106
    iput-boolean v3, v1, Lb70;->Θ:Z

    .line 107
    .line 108
    iget-object v2, v1, Lb70;->Ξ:Le70;

    .line 109
    .line 110
    iput-boolean v3, v2, Le70;->η:Z

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Lb70;->υ(I)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, Li70;->α:Ln5;

    .line 116
    .line 117
    invoke-virtual {p0, v3}, Ln5;->Γ(Z)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_2
    const-string p0, " did not call through to super.onStart()"

    .line 122
    .line 123
    invoke-static {v1, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final ο()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Li70;->γ:Ln60;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Ln60;->ω:Lb70;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, Lb70;->Θ:Z

    .line 33
    .line 34
    iget-object v3, v0, Lb70;->Ξ:Le70;

    .line 35
    .line 36
    iput-boolean v2, v3, Le70;->η:Z

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    invoke-virtual {v0, v3}, Lb70;->υ(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Ln60;->Σ:Ljr0;

    .line 43
    .line 44
    sget-object v4, Lbr0;->ON_STOP:Lbr0;

    .line 45
    .line 46
    invoke-virtual {v0, v4}, Ljr0;->δ(Lbr0;)V

    .line 47
    .line 48
    .line 49
    iput v3, v1, Ln60;->ε:I

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    iput-boolean v0, v1, Ln60;->Ι:Z

    .line 53
    .line 54
    move-object v3, v1

    .line 55
    check-cast v3, Lws;

    .line 56
    .line 57
    iput-boolean v2, v3, Ln60;->Ι:Z

    .line 58
    .line 59
    iget-object v2, v3, Lws;->и:Lxm;

    .line 60
    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/app/Dialog;->hide()V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-boolean v2, v1, Ln60;->Ι:Z

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    iget-object p0, p0, Li70;->α:Ln5;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ln5;->Δ(Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    const-string p0, " did not call through to super.onStop()"

    .line 77
    .line 78
    invoke-static {v1, p0}, Lγ;->ε(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
