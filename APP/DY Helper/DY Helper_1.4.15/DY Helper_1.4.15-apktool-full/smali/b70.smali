.class public final Lb70;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final Α:Li2;

.field public Β:Ln5;

.field public Γ:Ln5;

.field public Δ:Ln5;

.field public Ε:Ljava/util/ArrayDeque;

.field public Ζ:Z

.field public Η:Z

.field public Θ:Z

.field public Ι:Z

.field public Κ:Z

.field public Λ:Ljava/util/ArrayList;

.field public Μ:Ljava/util/ArrayList;

.field public Ν:Ljava/util/ArrayList;

.field public Ξ:Le70;

.field public final Ο:Ld1;

.field public final α:Ljava/util/ArrayList;

.field public β:Z

.field public final γ:Li0;

.field public δ:Ljava/util/ArrayList;

.field public ε:Ljava/util/ArrayList;

.field public final ζ:Lr60;

.field public η:Ld51;

.field public final θ:Lu60;

.field public final ι:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final κ:Ljava/util/Map;

.field public final λ:Ljava/util/Map;

.field public final μ:Ln5;

.field public final ν:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final ξ:Ls60;

.field public final ο:Ls60;

.field public final π:Ls60;

.field public final ρ:Ls60;

.field public final σ:Lv60;

.field public τ:I

.field public υ:Lp60;

.field public φ:Lxb;

.field public χ:Ln60;

.field public ψ:Ln60;

.field public final ω:Lw60;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Li0;

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-direct {v0, v1}, Li0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lb70;->γ:Li0;

    .line 18
    .line 19
    new-instance v0, Lr60;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lr60;-><init>(Lb70;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lb70;->ζ:Lr60;

    .line 25
    .line 26
    new-instance v0, Lu60;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lu60;-><init>(Lb70;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lb70;->θ:Lu60;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lb70;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 39
    .line 40
    new-instance v0, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lb70;->κ:Ljava/util/Map;

    .line 50
    .line 51
    new-instance v0, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lb70;->λ:Ljava/util/Map;

    .line 61
    .line 62
    new-instance v0, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    new-instance v0, Ln5;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Ln5;-><init>(Lb70;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lb70;->μ:Ln5;

    .line 76
    .line 77
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lb70;->ν:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 83
    .line 84
    new-instance v0, Ls60;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-direct {v0, p0, v1}, Ls60;-><init>(Lb70;I)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lb70;->ξ:Ls60;

    .line 91
    .line 92
    new-instance v0, Ls60;

    .line 93
    .line 94
    const/4 v1, 0x1

    .line 95
    invoke-direct {v0, p0, v1}, Ls60;-><init>(Lb70;I)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lb70;->ο:Ls60;

    .line 99
    .line 100
    new-instance v0, Ls60;

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    invoke-direct {v0, p0, v1}, Ls60;-><init>(Lb70;I)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Lb70;->π:Ls60;

    .line 107
    .line 108
    new-instance v0, Ls60;

    .line 109
    .line 110
    const/4 v1, 0x3

    .line 111
    invoke-direct {v0, p0, v1}, Ls60;-><init>(Lb70;I)V

    .line 112
    .line 113
    .line 114
    iput-object v0, p0, Lb70;->ρ:Ls60;

    .line 115
    .line 116
    new-instance v0, Lv60;

    .line 117
    .line 118
    invoke-direct {v0, p0}, Lv60;-><init>(Lb70;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, Lb70;->σ:Lv60;

    .line 122
    .line 123
    const/4 v0, -0x1

    .line 124
    iput v0, p0, Lb70;->τ:I

    .line 125
    .line 126
    new-instance v0, Lw60;

    .line 127
    .line 128
    invoke-direct {v0, p0}, Lw60;-><init>(Lb70;)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, Lb70;->ω:Lw60;

    .line 132
    .line 133
    new-instance v0, Li2;

    .line 134
    .line 135
    const/16 v1, 0x1a

    .line 136
    .line 137
    invoke-direct {v0, v1}, Li2;-><init>(I)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p0, Lb70;->Α:Li2;

    .line 141
    .line 142
    new-instance v0, Ljava/util/ArrayDeque;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object v0, p0, Lb70;->Ε:Ljava/util/ArrayDeque;

    .line 148
    .line 149
    new-instance v0, Ld1;

    .line 150
    .line 151
    const/4 v1, 0x6

    .line 152
    invoke-direct {v0, v1, p0}, Ld1;-><init>(ILjava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iput-object v0, p0, Lb70;->Ο:Ld1;

    .line 156
    .line 157
    return-void
.end method

.method public static Η(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static Θ(Ln60;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ln60;->ω:Lb70;

    .line 5
    .line 6
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 7
    .line 8
    invoke-virtual {p0}, Li0;->φ()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    move v1, v0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ln60;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-static {v2}, Lb70;->Θ(Ln60;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    :cond_1
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_2
    return v0
.end method

.method public static Κ(Ln60;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, Ln60;->Θ:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Ln60;->Α:Ln60;

    .line 13
    .line 14
    invoke-static {p0}, Lb70;->Κ(Ln60;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static Λ(Ln60;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Ln60;->χ:Lb70;

    .line 5
    .line 6
    iget-object v1, v0, Lb70;->ψ:Ln60;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, Lb70;->χ:Ln60;

    .line 15
    .line 16
    invoke-static {p0}, Lb70;->Λ(Ln60;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static б(Ln60;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, Ln60;->Ε:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Ln60;->Ε:Z

    .line 33
    .line 34
    iget-boolean v0, p0, Ln60;->Ξ:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Ln60;->Ξ:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lb70;->χ:Ln60;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lb70;->χ:Ln60;

    .line 52
    .line 53
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lb70;->υ:Lp60;

    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string p0, "null"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string p0, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final Α(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v0, Lb70;->γ:Li0;

    .line 10
    .line 11
    move/from16 v5, p3

    .line 12
    .line 13
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, Lk8;

    .line 18
    .line 19
    iget-boolean v6, v6, Lk8;->ο:Z

    .line 20
    .line 21
    iget-object v7, v0, Lb70;->Ν:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v7, v0, Lb70;->Ν:Ljava/util/ArrayList;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v7, v0, Lb70;->Ν:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4}, Li0;->χ()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v7, v0, Lb70;->ψ:Ln60;

    .line 46
    .line 47
    move v9, v5

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v12, 0x1

    .line 50
    if-ge v9, v3, :cond_13

    .line 51
    .line 52
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    check-cast v13, Lk8;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    check-cast v14, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    iget-object v15, v0, Lb70;->Ν:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-nez v14, :cond_d

    .line 71
    .line 72
    iget-object v14, v13, Lk8;->α:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    :goto_2
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ge v8, v11, :cond_c

    .line 80
    .line 81
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, Lm70;

    .line 86
    .line 87
    iget v5, v11, Lm70;->α:I

    .line 88
    .line 89
    if-eq v5, v12, :cond_b

    .line 90
    .line 91
    const/4 v12, 0x2

    .line 92
    move/from16 v18, v6

    .line 93
    .line 94
    const/16 v6, 0x9

    .line 95
    .line 96
    if-eq v5, v12, :cond_5

    .line 97
    .line 98
    const/4 v12, 0x3

    .line 99
    if-eq v5, v12, :cond_4

    .line 100
    .line 101
    const/4 v12, 0x6

    .line 102
    if-eq v5, v12, :cond_4

    .line 103
    .line 104
    const/4 v12, 0x7

    .line 105
    if-eq v5, v12, :cond_3

    .line 106
    .line 107
    const/16 v12, 0x8

    .line 108
    .line 109
    if-eq v5, v12, :cond_1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    new-instance v5, Lm70;

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    invoke-direct {v5, v6, v7, v12}, Lm70;-><init>(ILn60;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14, v8, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 v5, 0x1

    .line 122
    iput-boolean v5, v11, Lm70;->γ:Z

    .line 123
    .line 124
    add-int/lit8 v8, v8, 0x1

    .line 125
    .line 126
    iget-object v5, v11, Lm70;->β:Ln60;

    .line 127
    .line 128
    move-object v7, v5

    .line 129
    :cond_2
    :goto_3
    move/from16 v21, v9

    .line 130
    .line 131
    move/from16 v20, v10

    .line 132
    .line 133
    const/4 v6, 0x1

    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :cond_3
    const/4 v6, 0x1

    .line 137
    :goto_4
    move/from16 v21, v9

    .line 138
    .line 139
    move/from16 v20, v10

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_4
    iget-object v5, v11, Lm70;->β:Ln60;

    .line 144
    .line 145
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v5, v11, Lm70;->β:Ln60;

    .line 149
    .line 150
    if-ne v5, v7, :cond_2

    .line 151
    .line 152
    new-instance v7, Lm70;

    .line 153
    .line 154
    invoke-direct {v7, v6, v5}, Lm70;-><init>(ILn60;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v14, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    move/from16 v21, v9

    .line 163
    .line 164
    move/from16 v20, v10

    .line 165
    .line 166
    const/4 v6, 0x1

    .line 167
    const/4 v7, 0x0

    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_5
    iget-object v5, v11, Lm70;->β:Ln60;

    .line 171
    .line 172
    iget v12, v5, Ln60;->Γ:I

    .line 173
    .line 174
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v19

    .line 178
    const/16 v17, 0x1

    .line 179
    .line 180
    add-int/lit8 v19, v19, -0x1

    .line 181
    .line 182
    move/from16 v6, v19

    .line 183
    .line 184
    const/16 v19, 0x0

    .line 185
    .line 186
    :goto_5
    if-ltz v6, :cond_9

    .line 187
    .line 188
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v21

    .line 192
    move/from16 v22, v6

    .line 193
    .line 194
    move-object/from16 v6, v21

    .line 195
    .line 196
    check-cast v6, Ln60;

    .line 197
    .line 198
    move/from16 v21, v9

    .line 199
    .line 200
    iget v9, v6, Ln60;->Γ:I

    .line 201
    .line 202
    if-ne v9, v12, :cond_8

    .line 203
    .line 204
    if-ne v6, v5, :cond_6

    .line 205
    .line 206
    move/from16 v20, v10

    .line 207
    .line 208
    const/4 v6, 0x1

    .line 209
    const/16 v19, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_6
    if-ne v6, v7, :cond_7

    .line 213
    .line 214
    new-instance v7, Lm70;

    .line 215
    .line 216
    move/from16 v20, v10

    .line 217
    .line 218
    const/4 v9, 0x0

    .line 219
    const/16 v10, 0x9

    .line 220
    .line 221
    invoke-direct {v7, v10, v6, v9}, Lm70;-><init>(ILn60;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v14, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    goto :goto_6

    .line 231
    :cond_7
    move/from16 v20, v10

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/16 v10, 0x9

    .line 235
    .line 236
    :goto_6
    new-instance v10, Lm70;

    .line 237
    .line 238
    move-object/from16 v23, v7

    .line 239
    .line 240
    const/4 v7, 0x3

    .line 241
    invoke-direct {v10, v7, v6, v9}, Lm70;-><init>(ILn60;I)V

    .line 242
    .line 243
    .line 244
    iget v7, v11, Lm70;->δ:I

    .line 245
    .line 246
    iput v7, v10, Lm70;->δ:I

    .line 247
    .line 248
    iget v7, v11, Lm70;->ζ:I

    .line 249
    .line 250
    iput v7, v10, Lm70;->ζ:I

    .line 251
    .line 252
    iget v7, v11, Lm70;->ε:I

    .line 253
    .line 254
    iput v7, v10, Lm70;->ε:I

    .line 255
    .line 256
    iget v7, v11, Lm70;->η:I

    .line 257
    .line 258
    iput v7, v10, Lm70;->η:I

    .line 259
    .line 260
    invoke-virtual {v14, v8, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    const/4 v6, 0x1

    .line 267
    add-int/2addr v8, v6

    .line 268
    move-object/from16 v7, v23

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_8
    move/from16 v20, v10

    .line 272
    .line 273
    const/4 v6, 0x1

    .line 274
    :goto_7
    add-int/lit8 v9, v22, -0x1

    .line 275
    .line 276
    move v6, v9

    .line 277
    move/from16 v10, v20

    .line 278
    .line 279
    move/from16 v9, v21

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    move/from16 v21, v9

    .line 283
    .line 284
    move/from16 v20, v10

    .line 285
    .line 286
    const/4 v6, 0x1

    .line 287
    if-eqz v19, :cond_a

    .line 288
    .line 289
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    add-int/lit8 v8, v8, -0x1

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_a
    iput v6, v11, Lm70;->α:I

    .line 296
    .line 297
    iput-boolean v6, v11, Lm70;->γ:Z

    .line 298
    .line 299
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_b
    move/from16 v18, v6

    .line 304
    .line 305
    move v6, v12

    .line 306
    goto/16 :goto_4

    .line 307
    .line 308
    :goto_8
    iget-object v5, v11, Lm70;->β:Ln60;

    .line 309
    .line 310
    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :goto_9
    add-int/2addr v8, v6

    .line 314
    move/from16 v5, p3

    .line 315
    .line 316
    move v12, v6

    .line 317
    move/from16 v6, v18

    .line 318
    .line 319
    move/from16 v10, v20

    .line 320
    .line 321
    move/from16 v9, v21

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_c
    move/from16 v18, v6

    .line 326
    .line 327
    move/from16 v21, v9

    .line 328
    .line 329
    move/from16 v20, v10

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_d
    move/from16 v18, v6

    .line 333
    .line 334
    move/from16 v21, v9

    .line 335
    .line 336
    move/from16 v20, v10

    .line 337
    .line 338
    move v6, v12

    .line 339
    iget-object v5, v13, Lk8;->α:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    sub-int/2addr v8, v6

    .line 346
    :goto_a
    if-ltz v8, :cond_10

    .line 347
    .line 348
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    check-cast v9, Lm70;

    .line 353
    .line 354
    iget v10, v9, Lm70;->α:I

    .line 355
    .line 356
    const/4 v12, 0x3

    .line 357
    if-eq v10, v6, :cond_f

    .line 358
    .line 359
    if-eq v10, v12, :cond_e

    .line 360
    .line 361
    packed-switch v10, :pswitch_data_0

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :pswitch_0
    iget-object v6, v9, Lm70;->θ:Lcr0;

    .line 366
    .line 367
    iput-object v6, v9, Lm70;->ι:Lcr0;

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :pswitch_1
    iget-object v6, v9, Lm70;->β:Ln60;

    .line 371
    .line 372
    move-object v7, v6

    .line 373
    goto :goto_b

    .line 374
    :pswitch_2
    const/4 v7, 0x0

    .line 375
    goto :goto_b

    .line 376
    :cond_e
    :pswitch_3
    iget-object v6, v9, Lm70;->β:Ln60;

    .line 377
    .line 378
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_b

    .line 382
    :cond_f
    :pswitch_4
    iget-object v6, v9, Lm70;->β:Ln60;

    .line 383
    .line 384
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    :goto_b
    add-int/lit8 v8, v8, -0x1

    .line 388
    .line 389
    const/4 v6, 0x1

    .line 390
    goto :goto_a

    .line 391
    :cond_10
    :goto_c
    if-nez v20, :cond_12

    .line 392
    .line 393
    iget-boolean v5, v13, Lk8;->η:Z

    .line 394
    .line 395
    if-eqz v5, :cond_11

    .line 396
    .line 397
    goto :goto_d

    .line 398
    :cond_11
    const/4 v10, 0x0

    .line 399
    goto :goto_e

    .line 400
    :cond_12
    :goto_d
    const/4 v10, 0x1

    .line 401
    :goto_e
    add-int/lit8 v9, v21, 0x1

    .line 402
    .line 403
    move/from16 v5, p3

    .line 404
    .line 405
    move/from16 v6, v18

    .line 406
    .line 407
    goto/16 :goto_1

    .line 408
    .line 409
    :cond_13
    move/from16 v18, v6

    .line 410
    .line 411
    iget-object v5, v0, Lb70;->Ν:Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 414
    .line 415
    .line 416
    if-nez v18, :cond_16

    .line 417
    .line 418
    iget v5, v0, Lb70;->τ:I

    .line 419
    .line 420
    const/4 v6, 0x1

    .line 421
    if-lt v5, v6, :cond_16

    .line 422
    .line 423
    move/from16 v5, p3

    .line 424
    .line 425
    :goto_f
    if-ge v5, v3, :cond_16

    .line 426
    .line 427
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    check-cast v6, Lk8;

    .line 432
    .line 433
    iget-object v6, v6, Lk8;->α:Ljava/util/ArrayList;

    .line 434
    .line 435
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    :cond_14
    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v7

    .line 443
    if-eqz v7, :cond_15

    .line 444
    .line 445
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v7

    .line 449
    check-cast v7, Lm70;

    .line 450
    .line 451
    iget-object v7, v7, Lm70;->β:Ln60;

    .line 452
    .line 453
    if-eqz v7, :cond_14

    .line 454
    .line 455
    iget-object v8, v7, Ln60;->χ:Lb70;

    .line 456
    .line 457
    if-eqz v8, :cond_14

    .line 458
    .line 459
    invoke-virtual {v0, v7}, Lb70;->ζ(Ln60;)Li70;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    invoke-virtual {v4, v7}, Li0;->Β(Li70;)V

    .line 464
    .line 465
    .line 466
    goto :goto_10

    .line 467
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 468
    .line 469
    goto :goto_f

    .line 470
    :cond_16
    const-string v4, "Unknown cmd: "

    .line 471
    .line 472
    move/from16 v5, p3

    .line 473
    .line 474
    :goto_11
    const/4 v6, -0x1

    .line 475
    if-ge v5, v3, :cond_22

    .line 476
    .line 477
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v7

    .line 481
    check-cast v7, Lk8;

    .line 482
    .line 483
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    check-cast v8, Ljava/lang/Boolean;

    .line 488
    .line 489
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    if-eqz v8, :cond_1d

    .line 494
    .line 495
    invoke-virtual {v7, v6}, Lk8;->γ(I)V

    .line 496
    .line 497
    .line 498
    iget-object v6, v7, Lk8;->π:Lb70;

    .line 499
    .line 500
    iget-object v8, v7, Lk8;->α:Ljava/util/ArrayList;

    .line 501
    .line 502
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 503
    .line 504
    .line 505
    move-result v9

    .line 506
    const/4 v10, 0x1

    .line 507
    sub-int/2addr v9, v10

    .line 508
    :goto_12
    if-ltz v9, :cond_21

    .line 509
    .line 510
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v11

    .line 514
    check-cast v11, Lm70;

    .line 515
    .line 516
    iget-object v12, v11, Lm70;->β:Ln60;

    .line 517
    .line 518
    if-eqz v12, :cond_1c

    .line 519
    .line 520
    iget-object v13, v12, Ln60;->Ν:Lm60;

    .line 521
    .line 522
    if-nez v13, :cond_17

    .line 523
    .line 524
    goto :goto_13

    .line 525
    :cond_17
    invoke-virtual {v12}, Ln60;->ε()Lm60;

    .line 526
    .line 527
    .line 528
    move-result-object v13

    .line 529
    iput-boolean v10, v13, Lm60;->α:Z

    .line 530
    .line 531
    :goto_13
    iget v10, v7, Lk8;->ζ:I

    .line 532
    .line 533
    const/16 v13, 0x2002

    .line 534
    .line 535
    const/16 v14, 0x1001

    .line 536
    .line 537
    if-eq v10, v14, :cond_1a

    .line 538
    .line 539
    if-eq v10, v13, :cond_18

    .line 540
    .line 541
    const/16 v13, 0x1004

    .line 542
    .line 543
    const/16 v14, 0x2005

    .line 544
    .line 545
    if-eq v10, v14, :cond_1a

    .line 546
    .line 547
    const/16 v15, 0x1003

    .line 548
    .line 549
    if-eq v10, v15, :cond_19

    .line 550
    .line 551
    if-eq v10, v13, :cond_18

    .line 552
    .line 553
    const/4 v13, 0x0

    .line 554
    goto :goto_14

    .line 555
    :cond_18
    move v13, v14

    .line 556
    goto :goto_14

    .line 557
    :cond_19
    move v13, v15

    .line 558
    :cond_1a
    :goto_14
    iget-object v10, v12, Ln60;->Ν:Lm60;

    .line 559
    .line 560
    if-nez v10, :cond_1b

    .line 561
    .line 562
    if-nez v13, :cond_1b

    .line 563
    .line 564
    goto :goto_15

    .line 565
    :cond_1b
    invoke-virtual {v12}, Ln60;->ε()Lm60;

    .line 566
    .line 567
    .line 568
    iget-object v10, v12, Ln60;->Ν:Lm60;

    .line 569
    .line 570
    iput v13, v10, Lm60;->ζ:I

    .line 571
    .line 572
    :goto_15
    invoke-virtual {v12}, Ln60;->ε()Lm60;

    .line 573
    .line 574
    .line 575
    iget-object v10, v12, Ln60;->Ν:Lm60;

    .line 576
    .line 577
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    :cond_1c
    iget v10, v11, Lm70;->α:I

    .line 581
    .line 582
    packed-switch v10, :pswitch_data_1

    .line 583
    .line 584
    .line 585
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 586
    .line 587
    iget v1, v11, Lm70;->α:I

    .line 588
    .line 589
    new-instance v2, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    throw v0

    .line 605
    :pswitch_6
    iget-object v10, v11, Lm70;->θ:Lcr0;

    .line 606
    .line 607
    invoke-virtual {v6, v12, v10}, Lb70;->Ψ(Ln60;Lcr0;)V

    .line 608
    .line 609
    .line 610
    :goto_16
    const/4 v10, 0x1

    .line 611
    goto/16 :goto_17

    .line 612
    .line 613
    :pswitch_7
    invoke-virtual {v6, v12}, Lb70;->Ω(Ln60;)V

    .line 614
    .line 615
    .line 616
    goto :goto_16

    .line 617
    :pswitch_8
    const/4 v10, 0x0

    .line 618
    invoke-virtual {v6, v10}, Lb70;->Ω(Ln60;)V

    .line 619
    .line 620
    .line 621
    goto :goto_16

    .line 622
    :pswitch_9
    iget v10, v11, Lm70;->δ:I

    .line 623
    .line 624
    iget v13, v11, Lm70;->ε:I

    .line 625
    .line 626
    iget v14, v11, Lm70;->ζ:I

    .line 627
    .line 628
    iget v11, v11, Lm70;->η:I

    .line 629
    .line 630
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 631
    .line 632
    .line 633
    const/4 v10, 0x1

    .line 634
    invoke-virtual {v6, v12, v10}, Lb70;->Χ(Ln60;Z)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v6, v12}, Lb70;->η(Ln60;)V

    .line 638
    .line 639
    .line 640
    goto :goto_16

    .line 641
    :pswitch_a
    iget v10, v11, Lm70;->δ:I

    .line 642
    .line 643
    iget v13, v11, Lm70;->ε:I

    .line 644
    .line 645
    iget v14, v11, Lm70;->ζ:I

    .line 646
    .line 647
    iget v11, v11, Lm70;->η:I

    .line 648
    .line 649
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v6, v12}, Lb70;->γ(Ln60;)V

    .line 653
    .line 654
    .line 655
    goto :goto_16

    .line 656
    :pswitch_b
    iget v10, v11, Lm70;->δ:I

    .line 657
    .line 658
    iget v13, v11, Lm70;->ε:I

    .line 659
    .line 660
    iget v14, v11, Lm70;->ζ:I

    .line 661
    .line 662
    iget v11, v11, Lm70;->η:I

    .line 663
    .line 664
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 665
    .line 666
    .line 667
    const/4 v10, 0x1

    .line 668
    invoke-virtual {v6, v12, v10}, Lb70;->Χ(Ln60;Z)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v6, v12}, Lb70;->Ζ(Ln60;)V

    .line 672
    .line 673
    .line 674
    goto :goto_16

    .line 675
    :pswitch_c
    iget v10, v11, Lm70;->δ:I

    .line 676
    .line 677
    iget v13, v11, Lm70;->ε:I

    .line 678
    .line 679
    iget v14, v11, Lm70;->ζ:I

    .line 680
    .line 681
    iget v11, v11, Lm70;->η:I

    .line 682
    .line 683
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    invoke-static {v12}, Lb70;->б(Ln60;)V

    .line 690
    .line 691
    .line 692
    goto :goto_16

    .line 693
    :pswitch_d
    iget v10, v11, Lm70;->δ:I

    .line 694
    .line 695
    iget v13, v11, Lm70;->ε:I

    .line 696
    .line 697
    iget v14, v11, Lm70;->ζ:I

    .line 698
    .line 699
    iget v11, v11, Lm70;->η:I

    .line 700
    .line 701
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v6, v12}, Lb70;->α(Ln60;)Li70;

    .line 705
    .line 706
    .line 707
    goto :goto_16

    .line 708
    :pswitch_e
    iget v10, v11, Lm70;->δ:I

    .line 709
    .line 710
    iget v13, v11, Lm70;->ε:I

    .line 711
    .line 712
    iget v14, v11, Lm70;->ζ:I

    .line 713
    .line 714
    iget v11, v11, Lm70;->η:I

    .line 715
    .line 716
    invoke-virtual {v12, v10, v13, v14, v11}, Ln60;->ρ(IIII)V

    .line 717
    .line 718
    .line 719
    const/4 v10, 0x1

    .line 720
    invoke-virtual {v6, v12, v10}, Lb70;->Χ(Ln60;Z)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v6, v12}, Lb70;->Ρ(Ln60;)V

    .line 724
    .line 725
    .line 726
    :goto_17
    add-int/lit8 v9, v9, -0x1

    .line 727
    .line 728
    goto/16 :goto_12

    .line 729
    .line 730
    :cond_1d
    const/4 v10, 0x1

    .line 731
    invoke-virtual {v7, v10}, Lk8;->γ(I)V

    .line 732
    .line 733
    .line 734
    iget-object v6, v7, Lk8;->π:Lb70;

    .line 735
    .line 736
    iget-object v8, v7, Lk8;->α:Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 739
    .line 740
    .line 741
    move-result v9

    .line 742
    const/4 v12, 0x0

    .line 743
    :goto_18
    if-ge v12, v9, :cond_21

    .line 744
    .line 745
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v10

    .line 749
    check-cast v10, Lm70;

    .line 750
    .line 751
    iget-object v11, v10, Lm70;->β:Ln60;

    .line 752
    .line 753
    if-eqz v11, :cond_20

    .line 754
    .line 755
    iget-object v13, v11, Ln60;->Ν:Lm60;

    .line 756
    .line 757
    if-nez v13, :cond_1e

    .line 758
    .line 759
    goto :goto_19

    .line 760
    :cond_1e
    invoke-virtual {v11}, Ln60;->ε()Lm60;

    .line 761
    .line 762
    .line 763
    move-result-object v13

    .line 764
    const/4 v14, 0x0

    .line 765
    iput-boolean v14, v13, Lm60;->α:Z

    .line 766
    .line 767
    :goto_19
    iget v13, v7, Lk8;->ζ:I

    .line 768
    .line 769
    iget-object v14, v11, Ln60;->Ν:Lm60;

    .line 770
    .line 771
    if-nez v14, :cond_1f

    .line 772
    .line 773
    if-nez v13, :cond_1f

    .line 774
    .line 775
    goto :goto_1a

    .line 776
    :cond_1f
    invoke-virtual {v11}, Ln60;->ε()Lm60;

    .line 777
    .line 778
    .line 779
    iget-object v14, v11, Ln60;->Ν:Lm60;

    .line 780
    .line 781
    iput v13, v14, Lm60;->ζ:I

    .line 782
    .line 783
    :goto_1a
    invoke-virtual {v11}, Ln60;->ε()Lm60;

    .line 784
    .line 785
    .line 786
    iget-object v13, v11, Ln60;->Ν:Lm60;

    .line 787
    .line 788
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    :cond_20
    iget v13, v10, Lm70;->α:I

    .line 792
    .line 793
    packed-switch v13, :pswitch_data_2

    .line 794
    .line 795
    .line 796
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 797
    .line 798
    iget v1, v10, Lm70;->α:I

    .line 799
    .line 800
    new-instance v2, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    throw v0

    .line 816
    :pswitch_10
    iget-object v10, v10, Lm70;->ι:Lcr0;

    .line 817
    .line 818
    invoke-virtual {v6, v11, v10}, Lb70;->Ψ(Ln60;Lcr0;)V

    .line 819
    .line 820
    .line 821
    goto :goto_1b

    .line 822
    :pswitch_11
    const/4 v10, 0x0

    .line 823
    invoke-virtual {v6, v10}, Lb70;->Ω(Ln60;)V

    .line 824
    .line 825
    .line 826
    goto :goto_1b

    .line 827
    :pswitch_12
    invoke-virtual {v6, v11}, Lb70;->Ω(Ln60;)V

    .line 828
    .line 829
    .line 830
    goto :goto_1b

    .line 831
    :pswitch_13
    iget v13, v10, Lm70;->δ:I

    .line 832
    .line 833
    iget v14, v10, Lm70;->ε:I

    .line 834
    .line 835
    iget v15, v10, Lm70;->ζ:I

    .line 836
    .line 837
    iget v10, v10, Lm70;->η:I

    .line 838
    .line 839
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 840
    .line 841
    .line 842
    const/4 v14, 0x0

    .line 843
    invoke-virtual {v6, v11, v14}, Lb70;->Χ(Ln60;Z)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v6, v11}, Lb70;->γ(Ln60;)V

    .line 847
    .line 848
    .line 849
    goto :goto_1b

    .line 850
    :pswitch_14
    iget v13, v10, Lm70;->δ:I

    .line 851
    .line 852
    iget v14, v10, Lm70;->ε:I

    .line 853
    .line 854
    iget v15, v10, Lm70;->ζ:I

    .line 855
    .line 856
    iget v10, v10, Lm70;->η:I

    .line 857
    .line 858
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v6, v11}, Lb70;->η(Ln60;)V

    .line 862
    .line 863
    .line 864
    goto :goto_1b

    .line 865
    :pswitch_15
    iget v13, v10, Lm70;->δ:I

    .line 866
    .line 867
    iget v14, v10, Lm70;->ε:I

    .line 868
    .line 869
    iget v15, v10, Lm70;->ζ:I

    .line 870
    .line 871
    iget v10, v10, Lm70;->η:I

    .line 872
    .line 873
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 874
    .line 875
    .line 876
    const/4 v14, 0x0

    .line 877
    invoke-virtual {v6, v11, v14}, Lb70;->Χ(Ln60;Z)V

    .line 878
    .line 879
    .line 880
    invoke-static {v11}, Lb70;->б(Ln60;)V

    .line 881
    .line 882
    .line 883
    goto :goto_1b

    .line 884
    :pswitch_16
    iget v13, v10, Lm70;->δ:I

    .line 885
    .line 886
    iget v14, v10, Lm70;->ε:I

    .line 887
    .line 888
    iget v15, v10, Lm70;->ζ:I

    .line 889
    .line 890
    iget v10, v10, Lm70;->η:I

    .line 891
    .line 892
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v6, v11}, Lb70;->Ζ(Ln60;)V

    .line 896
    .line 897
    .line 898
    goto :goto_1b

    .line 899
    :pswitch_17
    iget v13, v10, Lm70;->δ:I

    .line 900
    .line 901
    iget v14, v10, Lm70;->ε:I

    .line 902
    .line 903
    iget v15, v10, Lm70;->ζ:I

    .line 904
    .line 905
    iget v10, v10, Lm70;->η:I

    .line 906
    .line 907
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v6, v11}, Lb70;->Ρ(Ln60;)V

    .line 911
    .line 912
    .line 913
    goto :goto_1b

    .line 914
    :pswitch_18
    iget v13, v10, Lm70;->δ:I

    .line 915
    .line 916
    iget v14, v10, Lm70;->ε:I

    .line 917
    .line 918
    iget v15, v10, Lm70;->ζ:I

    .line 919
    .line 920
    iget v10, v10, Lm70;->η:I

    .line 921
    .line 922
    invoke-virtual {v11, v13, v14, v15, v10}, Ln60;->ρ(IIII)V

    .line 923
    .line 924
    .line 925
    const/4 v14, 0x0

    .line 926
    invoke-virtual {v6, v11, v14}, Lb70;->Χ(Ln60;Z)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v6, v11}, Lb70;->α(Ln60;)Li70;

    .line 930
    .line 931
    .line 932
    :goto_1b
    add-int/lit8 v12, v12, 0x1

    .line 933
    .line 934
    goto/16 :goto_18

    .line 935
    .line 936
    :cond_21
    add-int/lit8 v5, v5, 0x1

    .line 937
    .line 938
    goto/16 :goto_11

    .line 939
    .line 940
    :cond_22
    add-int/lit8 v4, v3, -0x1

    .line 941
    .line 942
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v4

    .line 946
    check-cast v4, Ljava/lang/Boolean;

    .line 947
    .line 948
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 949
    .line 950
    .line 951
    move-result v4

    .line 952
    move/from16 v5, p3

    .line 953
    .line 954
    :goto_1c
    if-ge v5, v3, :cond_27

    .line 955
    .line 956
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v7

    .line 960
    check-cast v7, Lk8;

    .line 961
    .line 962
    if-eqz v4, :cond_24

    .line 963
    .line 964
    iget-object v8, v7, Lk8;->α:Ljava/util/ArrayList;

    .line 965
    .line 966
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 967
    .line 968
    .line 969
    move-result v8

    .line 970
    const/16 v17, 0x1

    .line 971
    .line 972
    add-int/lit8 v8, v8, -0x1

    .line 973
    .line 974
    :goto_1d
    if-ltz v8, :cond_26

    .line 975
    .line 976
    iget-object v9, v7, Lk8;->α:Ljava/util/ArrayList;

    .line 977
    .line 978
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v9

    .line 982
    check-cast v9, Lm70;

    .line 983
    .line 984
    iget-object v9, v9, Lm70;->β:Ln60;

    .line 985
    .line 986
    if-eqz v9, :cond_23

    .line 987
    .line 988
    invoke-virtual {v0, v9}, Lb70;->ζ(Ln60;)Li70;

    .line 989
    .line 990
    .line 991
    move-result-object v9

    .line 992
    invoke-virtual {v9}, Li70;->κ()V

    .line 993
    .line 994
    .line 995
    :cond_23
    add-int/lit8 v8, v8, -0x1

    .line 996
    .line 997
    goto :goto_1d

    .line 998
    :cond_24
    iget-object v7, v7, Lk8;->α:Ljava/util/ArrayList;

    .line 999
    .line 1000
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v7

    .line 1004
    :cond_25
    :goto_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1005
    .line 1006
    .line 1007
    move-result v8

    .line 1008
    if-eqz v8, :cond_26

    .line 1009
    .line 1010
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v8

    .line 1014
    check-cast v8, Lm70;

    .line 1015
    .line 1016
    iget-object v8, v8, Lm70;->β:Ln60;

    .line 1017
    .line 1018
    if-eqz v8, :cond_25

    .line 1019
    .line 1020
    invoke-virtual {v0, v8}, Lb70;->ζ(Ln60;)Li70;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v8

    .line 1024
    invoke-virtual {v8}, Li70;->κ()V

    .line 1025
    .line 1026
    .line 1027
    goto :goto_1e

    .line 1028
    :cond_26
    add-int/lit8 v5, v5, 0x1

    .line 1029
    .line 1030
    goto :goto_1c

    .line 1031
    :cond_27
    iget v5, v0, Lb70;->τ:I

    .line 1032
    .line 1033
    const/4 v10, 0x1

    .line 1034
    invoke-virtual {v0, v5, v10}, Lb70;->Μ(IZ)V

    .line 1035
    .line 1036
    .line 1037
    new-instance v5, Ljava/util/HashSet;

    .line 1038
    .line 1039
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 1040
    .line 1041
    .line 1042
    move/from16 v7, p3

    .line 1043
    .line 1044
    :goto_1f
    if-ge v7, v3, :cond_2b

    .line 1045
    .line 1046
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v8

    .line 1050
    check-cast v8, Lk8;

    .line 1051
    .line 1052
    iget-object v8, v8, Lk8;->α:Ljava/util/ArrayList;

    .line 1053
    .line 1054
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v8

    .line 1058
    :cond_28
    :goto_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1059
    .line 1060
    .line 1061
    move-result v9

    .line 1062
    if-eqz v9, :cond_2a

    .line 1063
    .line 1064
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v9

    .line 1068
    check-cast v9, Lm70;

    .line 1069
    .line 1070
    iget-object v9, v9, Lm70;->β:Ln60;

    .line 1071
    .line 1072
    if-eqz v9, :cond_28

    .line 1073
    .line 1074
    iget-object v9, v9, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 1075
    .line 1076
    if-eqz v9, :cond_28

    .line 1077
    .line 1078
    invoke-virtual {v0}, Lb70;->Ε()Li2;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v10

    .line 1082
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1083
    .line 1084
    .line 1085
    const v10, 0x7f0902c3

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v9, v10}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v11

    .line 1092
    instance-of v12, v11, Lpr;

    .line 1093
    .line 1094
    if-eqz v12, :cond_29

    .line 1095
    .line 1096
    check-cast v11, Lpr;

    .line 1097
    .line 1098
    goto :goto_21

    .line 1099
    :cond_29
    new-instance v11, Lpr;

    .line 1100
    .line 1101
    invoke-direct {v11, v9}, Lpr;-><init>(Landroid/view/ViewGroup;)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v9, v10, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    :goto_21
    invoke-virtual {v5, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    goto :goto_20

    .line 1111
    :cond_2a
    add-int/lit8 v7, v7, 0x1

    .line 1112
    .line 1113
    goto :goto_1f

    .line 1114
    :cond_2b
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    :goto_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    if-eqz v5, :cond_2d

    .line 1123
    .line 1124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v5

    .line 1128
    check-cast v5, Lpr;

    .line 1129
    .line 1130
    iput-boolean v4, v5, Lpr;->δ:Z

    .line 1131
    .line 1132
    iget-object v7, v5, Lpr;->β:Ljava/util/ArrayList;

    .line 1133
    .line 1134
    monitor-enter v7

    .line 1135
    :try_start_0
    invoke-virtual {v5}, Lpr;->δ()V

    .line 1136
    .line 1137
    .line 1138
    iget-object v8, v5, Lpr;->β:Ljava/util/ArrayList;

    .line 1139
    .line 1140
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1141
    .line 1142
    .line 1143
    move-result v9

    .line 1144
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v8

    .line 1148
    invoke-interface {v8}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v9

    .line 1152
    if-nez v9, :cond_2c

    .line 1153
    .line 1154
    const/4 v14, 0x0

    .line 1155
    iput-boolean v14, v5, Lpr;->ε:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1156
    .line 1157
    monitor-exit v7

    .line 1158
    invoke-virtual {v5}, Lpr;->β()V

    .line 1159
    .line 1160
    .line 1161
    goto :goto_22

    .line 1162
    :catchall_0
    move-exception v0

    .line 1163
    goto :goto_23

    .line 1164
    :cond_2c
    :try_start_1
    invoke-interface {v8}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v0

    .line 1168
    check-cast v0, Lmz1;

    .line 1169
    .line 1170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1171
    .line 1172
    .line 1173
    const/16 v16, 0x0

    .line 1174
    .line 1175
    throw v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1176
    :goto_23
    monitor-exit v7

    .line 1177
    throw v0

    .line 1178
    :cond_2d
    move/from16 v0, p3

    .line 1179
    .line 1180
    :goto_24
    if-ge v0, v3, :cond_2f

    .line 1181
    .line 1182
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v4

    .line 1186
    check-cast v4, Lk8;

    .line 1187
    .line 1188
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v5

    .line 1192
    check-cast v5, Ljava/lang/Boolean;

    .line 1193
    .line 1194
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v5

    .line 1198
    if-eqz v5, :cond_2e

    .line 1199
    .line 1200
    iget v5, v4, Lk8;->σ:I

    .line 1201
    .line 1202
    if-ltz v5, :cond_2e

    .line 1203
    .line 1204
    iput v6, v4, Lk8;->σ:I

    .line 1205
    .line 1206
    :cond_2e
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1207
    .line 1208
    .line 1209
    add-int/lit8 v0, v0, 0x1

    .line 1210
    .line 1211
    goto :goto_24

    .line 1212
    :cond_2f
    return-void

    .line 1213
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final Β(I)Ln60;
    .locals 4

    .line 1
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 2
    .line 3
    iget-object v0, p0, Li0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ln60;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v3, v2, Ln60;->Β:I

    .line 24
    .line 25
    if-ne v3, p1, :cond_0

    .line 26
    .line 27
    return-object v2

    .line 28
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Li70;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Li70;->γ:Ln60;

    .line 58
    .line 59
    iget v1, v0, Ln60;->Β:I

    .line 60
    .line 61
    if-ne v1, p1, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return-object p0
.end method

.method public final Γ(Ln60;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, Ln60;->Γ:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, Lb70;->φ:Lxb;

    .line 12
    .line 13
    invoke-virtual {v0}, Lxb;->Σ()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object p0, p0, Lb70;->φ:Lxb;

    .line 20
    .line 21
    iget p1, p1, Ln60;->Γ:I

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lxb;->Ρ(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    check-cast p0, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final Δ()Lw60;
    .locals 1

    .line 1
    iget-object v0, p0, Lb70;->χ:Ln60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Ln60;->χ:Lb70;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb70;->Δ()Lw60;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lb70;->ω:Lw60;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Ε()Li2;
    .locals 1

    .line 1
    iget-object v0, p0, Lb70;->χ:Ln60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Ln60;->χ:Lb70;

    .line 6
    .line 7
    invoke-virtual {p0}, Lb70;->Ε()Li2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object p0, p0, Lb70;->Α:Li2;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Ζ(Ln60;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, Ln60;->Ε:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, Ln60;->Ε:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Ln60;->Ξ:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, Ln60;->Ξ:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lb70;->а(Ln60;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final Ι()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lb70;->χ:Ln60;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Ln60;->ψ:Lp60;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-boolean v0, p0, Ln60;->ο:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Ln60;->θ()Lb70;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lb70;->Ι()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final Μ(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p0, "No activity"

    .line 10
    .line 11
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 16
    .line 17
    iget p2, p0, Lb70;->τ:I

    .line 18
    .line 19
    if-ne p1, p2, :cond_2

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_2
    iput p1, p0, Lb70;->τ:I

    .line 23
    .line 24
    iget-object p1, p0, Lb70;->γ:Li0;

    .line 25
    .line 26
    iget-object p2, p1, Li0;->η:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Ljava/util/HashMap;

    .line 29
    .line 30
    iget-object v0, p1, Li0;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ln60;

    .line 49
    .line 50
    iget-object v1, v1, Ln60;->ι:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Li70;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v1}, Li70;->κ()V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Li70;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {v0}, Li70;->κ()V

    .line 87
    .line 88
    .line 89
    iget-object v1, v0, Li70;->γ:Ln60;

    .line 90
    .line 91
    iget-boolean v2, v1, Ln60;->π:Z

    .line 92
    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {v1}, Ln60;->μ()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Li0;->Γ(Li70;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    invoke-virtual {p0}, Lb70;->в()V

    .line 106
    .line 107
    .line 108
    iget-boolean p1, p0, Lb70;->Ζ:Z

    .line 109
    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 113
    .line 114
    if-eqz p1, :cond_7

    .line 115
    .line 116
    iget p2, p0, Lb70;->τ:I

    .line 117
    .line 118
    const/4 v0, 0x7

    .line 119
    if-ne p2, v0, :cond_7

    .line 120
    .line 121
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 122
    .line 123
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 124
    .line 125
    .line 126
    const/4 p1, 0x0

    .line 127
    iput-boolean p1, p0, Lb70;->Ζ:Z

    .line 128
    .line 129
    :cond_7
    :goto_3
    return-void
.end method

.method public final Ν()V
    .locals 2

    .line 1
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lb70;->Η:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lb70;->Θ:Z

    .line 10
    .line 11
    iget-object v1, p0, Lb70;->Ξ:Le70;

    .line 12
    .line 13
    iput-boolean v0, v1, Le70;->η:Z

    .line 14
    .line 15
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 16
    .line 17
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ln60;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 40
    .line 41
    invoke-virtual {v0}, Lb70;->Ν()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final Ξ()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, Lb70;->Ο(II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Ο(II)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lb70;->ω(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v1}, Lb70;->ψ(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lb70;->ψ:Ln60;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ln60;->ζ()Lb70;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Lb70;->Ξ()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    return v1

    .line 26
    :cond_0
    iget-object v2, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v3, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v2, v3, p1, p2}, Lb70;->Π(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v1, p0, Lb70;->β:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v1}, Lb70;->Σ(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lb70;->δ()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, Lb70;->δ()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lb70;->д()V

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Lb70;->Κ:Z

    .line 58
    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iput-boolean v0, p0, Lb70;->Κ:Z

    .line 62
    .line 63
    invoke-virtual {p0}, Lb70;->в()V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 67
    .line 68
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-interface {p0, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    return p1
.end method

.method public final Π(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_4

    .line 27
    :cond_2
    iget-object p3, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/lit8 v3, p3, -0x1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    iget-object v2, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v0

    .line 43
    :goto_1
    if-ltz v2, :cond_5

    .line 44
    .line 45
    iget-object v4, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lk8;

    .line 52
    .line 53
    if-ltz p3, :cond_4

    .line 54
    .line 55
    iget v4, v4, Lk8;->σ:I

    .line 56
    .line 57
    if-ne p3, v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    if-eqz p4, :cond_7

    .line 68
    .line 69
    move v3, v2

    .line 70
    :goto_3
    if-lez v3, :cond_9

    .line 71
    .line 72
    iget-object p4, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 73
    .line 74
    add-int/lit8 v2, v3, -0x1

    .line 75
    .line 76
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    check-cast p4, Lk8;

    .line 81
    .line 82
    if-ltz p3, :cond_9

    .line 83
    .line 84
    iget p4, p4, Lk8;->σ:I

    .line 85
    .line 86
    if-ne p3, p4, :cond_9

    .line 87
    .line 88
    add-int/lit8 v3, v3, -0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    iget-object p3, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    sub-int/2addr p3, v0

    .line 98
    if-ne v2, p3, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p3, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    sub-int/2addr p3, v0

    .line 113
    :goto_5
    if-lt p3, v3, :cond_b

    .line 114
    .line 115
    iget-object p4, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    check-cast p4, Lk8;

    .line 122
    .line 123
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 p3, p3, -0x1

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_b
    return v0
.end method

.method public final Ρ(Ln60;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, Ln60;->φ:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Ln60;->μ()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, Ln60;->Ζ:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, Lb70;->γ:Li0;

    .line 50
    .line 51
    iget-object v1, v0, Li0;->ζ:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, Li0;->ζ:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, Ln60;->ο:Z

    .line 66
    .line 67
    invoke-static {p1}, Lb70;->Θ(Ln60;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, Lb70;->Ζ:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, Ln60;->π:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Lb70;->а(Ln60;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p0
.end method

.method public final Σ(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lk8;

    .line 31
    .line 32
    iget-boolean v3, v3, Lk8;->ο:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, Lb70;->Α(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lk8;

    .line 74
    .line 75
    iget-boolean v3, v3, Lk8;->ο:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, Lb70;->Α(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, Lb70;->Α(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    const-string p0, "Internal error with the back stack records"

    .line 97
    .line 98
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final Τ(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/String;

    .line 24
    .line 25
    const-string v4, "result_"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    iget-object v5, v0, Lb70;->υ:Lp60;

    .line 40
    .line 41
    iget-object v5, v5, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x7

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v5, v0, Lb70;->λ:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "fragment_"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    iget-object v6, v0, Lb70;->υ:Lp60;

    .line 101
    .line 102
    iget-object v6, v6, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 109
    .line 110
    .line 111
    const/16 v6, 0x9

    .line 112
    .line 113
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    iget-object v3, v0, Lb70;->γ:Li0;

    .line 122
    .line 123
    iget-object v4, v3, Li0;->θ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Ljava/util/HashMap;

    .line 126
    .line 127
    iget-object v5, v3, Li0;->η:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v5, Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    const-string v2, "state"

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lc70;

    .line 144
    .line 145
    if-nez v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    invoke-virtual {v5}, Ljava/util/HashMap;->clear()V

    .line 149
    .line 150
    .line 151
    iget-object v4, v1, Lc70;->ε:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    iget-object v7, v0, Lb70;->μ:Ln5;

    .line 162
    .line 163
    const/4 v8, 0x0

    .line 164
    const-string v9, "): "

    .line 165
    .line 166
    const/4 v10, 0x2

    .line 167
    const-string v11, "FragmentManager"

    .line 168
    .line 169
    if-eqz v6, :cond_9

    .line 170
    .line 171
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    check-cast v6, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v3, v8, v6}, Li0;->Ζ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    if-eqz v6, :cond_5

    .line 182
    .line 183
    invoke-virtual {v6, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    check-cast v8, Lh70;

    .line 188
    .line 189
    iget-object v12, v0, Lb70;->Ξ:Le70;

    .line 190
    .line 191
    iget-object v8, v8, Lh70;->ζ:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v12, v12, Le70;->β:Ljava/util/HashMap;

    .line 194
    .line 195
    invoke-virtual {v12, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    check-cast v8, Ln60;

    .line 200
    .line 201
    if-eqz v8, :cond_7

    .line 202
    .line 203
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_6

    .line 208
    .line 209
    new-instance v12, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v13, "restoreSaveState: re-attaching retained "

    .line 212
    .line 213
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v12

    .line 223
    invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    :cond_6
    new-instance v12, Li70;

    .line 227
    .line 228
    invoke-direct {v12, v7, v3, v8, v6}, Li70;-><init>(Ln5;Li0;Ln60;Landroid/os/Bundle;)V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_7
    new-instance v12, Li70;

    .line 233
    .line 234
    iget-object v7, v0, Lb70;->υ:Lp60;

    .line 235
    .line 236
    iget-object v7, v7, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 237
    .line 238
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    invoke-virtual {v0}, Lb70;->Δ()Lw60;

    .line 243
    .line 244
    .line 245
    move-result-object v16

    .line 246
    iget-object v13, v0, Lb70;->μ:Ln5;

    .line 247
    .line 248
    iget-object v14, v0, Lb70;->γ:Li0;

    .line 249
    .line 250
    move-object/from16 v17, v6

    .line 251
    .line 252
    invoke-direct/range {v12 .. v17}, Li70;-><init>(Ln5;Li0;Ljava/lang/ClassLoader;Lw60;Landroid/os/Bundle;)V

    .line 253
    .line 254
    .line 255
    :goto_3
    iget-object v7, v12, Li70;->γ:Ln60;

    .line 256
    .line 257
    iput-object v6, v7, Ln60;->ζ:Landroid/os/Bundle;

    .line 258
    .line 259
    iput-object v0, v7, Ln60;->χ:Lb70;

    .line 260
    .line 261
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_8

    .line 266
    .line 267
    new-instance v6, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    const-string v8, "restoreSaveState: active ("

    .line 270
    .line 271
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget-object v8, v7, Ln60;->ι:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-static {v11, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    .line 291
    .line 292
    :cond_8
    iget-object v6, v0, Lb70;->υ:Lp60;

    .line 293
    .line 294
    iget-object v6, v6, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 295
    .line 296
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v12, v6}, Li70;->μ(Ljava/lang/ClassLoader;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v12}, Li0;->Β(Li70;)V

    .line 304
    .line 305
    .line 306
    iget v6, v0, Lb70;->τ:I

    .line 307
    .line 308
    iput v6, v12, Li70;->ε:I

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_9
    iget-object v2, v0, Lb70;->Ξ:Le70;

    .line 313
    .line 314
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    new-instance v4, Ljava/util/ArrayList;

    .line 318
    .line 319
    iget-object v2, v2, Le70;->β:Ljava/util/HashMap;

    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    const/4 v6, 0x1

    .line 337
    if-eqz v4, :cond_c

    .line 338
    .line 339
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    check-cast v4, Ln60;

    .line 344
    .line 345
    iget-object v12, v4, Ln60;->ι:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    if-eqz v12, :cond_a

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_a
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    if-eqz v12, :cond_b

    .line 359
    .line 360
    new-instance v12, Ljava/lang/StringBuilder;

    .line 361
    .line 362
    const-string v13, "Discarding retained Fragment "

    .line 363
    .line 364
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    const-string v13, " that was not found in the set of active Fragments "

    .line 371
    .line 372
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget-object v13, v1, Lc70;->ε:Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v12

    .line 384
    invoke-static {v11, v12}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 385
    .line 386
    .line 387
    :cond_b
    iget-object v12, v0, Lb70;->Ξ:Le70;

    .line 388
    .line 389
    invoke-virtual {v12, v4}, Le70;->ε(Ln60;)V

    .line 390
    .line 391
    .line 392
    iput-object v0, v4, Ln60;->χ:Lb70;

    .line 393
    .line 394
    new-instance v12, Li70;

    .line 395
    .line 396
    invoke-direct {v12, v7, v3, v4}, Li70;-><init>(Ln5;Li0;Ln60;)V

    .line 397
    .line 398
    .line 399
    iput v6, v12, Li70;->ε:I

    .line 400
    .line 401
    invoke-virtual {v12}, Li70;->κ()V

    .line 402
    .line 403
    .line 404
    iput-boolean v6, v4, Ln60;->π:Z

    .line 405
    .line 406
    invoke-virtual {v12}, Li70;->κ()V

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_c
    iget-object v2, v1, Lc70;->ζ:Ljava/util/ArrayList;

    .line 411
    .line 412
    iget-object v4, v3, Li0;->ζ:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v4, Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 417
    .line 418
    .line 419
    if-eqz v2, :cond_f

    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    if-eqz v4, :cond_f

    .line 430
    .line 431
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    check-cast v4, Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {v3, v4}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    if-eqz v5, :cond_e

    .line 442
    .line 443
    invoke-static {v10}, Lb70;->Η(I)Z

    .line 444
    .line 445
    .line 446
    move-result v7

    .line 447
    if-eqz v7, :cond_d

    .line 448
    .line 449
    new-instance v7, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    const-string v12, "restoreSaveState: added ("

    .line 452
    .line 453
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    .line 471
    .line 472
    :cond_d
    invoke-virtual {v3, v5}, Li0;->γ(Ln60;)V

    .line 473
    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_e
    const-string v0, "No instantiated fragment for ("

    .line 477
    .line 478
    const-string v1, ")"

    .line 479
    .line 480
    invoke-static {v0, v4, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :cond_f
    iget-object v2, v1, Lc70;->η:[Ll8;

    .line 489
    .line 490
    if-eqz v2, :cond_17

    .line 491
    .line 492
    new-instance v2, Ljava/util/ArrayList;

    .line 493
    .line 494
    iget-object v5, v1, Lc70;->η:[Ll8;

    .line 495
    .line 496
    array-length v5, v5

    .line 497
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 498
    .line 499
    .line 500
    iput-object v2, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    :goto_6
    iget-object v5, v1, Lc70;->η:[Ll8;

    .line 504
    .line 505
    array-length v7, v5

    .line 506
    if-ge v2, v7, :cond_16

    .line 507
    .line 508
    aget-object v5, v5, v2

    .line 509
    .line 510
    iget-object v7, v5, Ll8;->ζ:Ljava/util/ArrayList;

    .line 511
    .line 512
    new-instance v8, Lk8;

    .line 513
    .line 514
    invoke-direct {v8, v0}, Lk8;-><init>(Lb70;)V

    .line 515
    .line 516
    .line 517
    iget-object v12, v5, Ll8;->ε:[I

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v14, 0x0

    .line 521
    :goto_7
    array-length v15, v12

    .line 522
    if-ge v13, v15, :cond_12

    .line 523
    .line 524
    new-instance v15, Lm70;

    .line 525
    .line 526
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 527
    .line 528
    .line 529
    add-int/lit8 v16, v13, 0x1

    .line 530
    .line 531
    move/from16 p1, v10

    .line 532
    .line 533
    aget v10, v12, v13

    .line 534
    .line 535
    iput v10, v15, Lm70;->α:I

    .line 536
    .line 537
    invoke-static/range {p1 .. p1}, Lb70;->Η(I)Z

    .line 538
    .line 539
    .line 540
    move-result v10

    .line 541
    if-eqz v10, :cond_10

    .line 542
    .line 543
    new-instance v10, Ljava/lang/StringBuilder;

    .line 544
    .line 545
    const-string v4, "Instantiate "

    .line 546
    .line 547
    invoke-direct {v10, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    const-string v4, " op #"

    .line 554
    .line 555
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v4, " base fragment #"

    .line 562
    .line 563
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    aget v4, v12, v16

    .line 567
    .line 568
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 576
    .line 577
    .line 578
    :cond_10
    invoke-static {}, Lcr0;->values()[Lcr0;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iget-object v10, v5, Ll8;->η:[I

    .line 583
    .line 584
    aget v10, v10, v14

    .line 585
    .line 586
    aget-object v4, v4, v10

    .line 587
    .line 588
    iput-object v4, v15, Lm70;->θ:Lcr0;

    .line 589
    .line 590
    invoke-static {}, Lcr0;->values()[Lcr0;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    iget-object v10, v5, Ll8;->θ:[I

    .line 595
    .line 596
    aget v10, v10, v14

    .line 597
    .line 598
    aget-object v4, v4, v10

    .line 599
    .line 600
    iput-object v4, v15, Lm70;->ι:Lcr0;

    .line 601
    .line 602
    add-int/lit8 v4, v13, 0x2

    .line 603
    .line 604
    aget v10, v12, v16

    .line 605
    .line 606
    if-eqz v10, :cond_11

    .line 607
    .line 608
    move v10, v6

    .line 609
    goto :goto_8

    .line 610
    :cond_11
    const/4 v10, 0x0

    .line 611
    :goto_8
    iput-boolean v10, v15, Lm70;->γ:Z

    .line 612
    .line 613
    add-int/lit8 v10, v13, 0x3

    .line 614
    .line 615
    aget v4, v12, v4

    .line 616
    .line 617
    iput v4, v15, Lm70;->δ:I

    .line 618
    .line 619
    add-int/lit8 v16, v13, 0x4

    .line 620
    .line 621
    aget v10, v12, v10

    .line 622
    .line 623
    iput v10, v15, Lm70;->ε:I

    .line 624
    .line 625
    add-int/lit8 v18, v13, 0x5

    .line 626
    .line 627
    aget v6, v12, v16

    .line 628
    .line 629
    iput v6, v15, Lm70;->ζ:I

    .line 630
    .line 631
    add-int/lit8 v13, v13, 0x6

    .line 632
    .line 633
    move-object/from16 v16, v12

    .line 634
    .line 635
    aget v12, v16, v18

    .line 636
    .line 637
    iput v12, v15, Lm70;->η:I

    .line 638
    .line 639
    iput v4, v8, Lk8;->β:I

    .line 640
    .line 641
    iput v10, v8, Lk8;->γ:I

    .line 642
    .line 643
    iput v6, v8, Lk8;->δ:I

    .line 644
    .line 645
    iput v12, v8, Lk8;->ε:I

    .line 646
    .line 647
    invoke-virtual {v8, v15}, Lk8;->β(Lm70;)V

    .line 648
    .line 649
    .line 650
    add-int/lit8 v14, v14, 0x1

    .line 651
    .line 652
    move/from16 v10, p1

    .line 653
    .line 654
    move-object/from16 v12, v16

    .line 655
    .line 656
    const/4 v6, 0x1

    .line 657
    goto/16 :goto_7

    .line 658
    .line 659
    :cond_12
    move/from16 p1, v10

    .line 660
    .line 661
    iget v4, v5, Ll8;->ι:I

    .line 662
    .line 663
    iput v4, v8, Lk8;->ζ:I

    .line 664
    .line 665
    iget-object v4, v5, Ll8;->κ:Ljava/lang/String;

    .line 666
    .line 667
    iput-object v4, v8, Lk8;->θ:Ljava/lang/String;

    .line 668
    .line 669
    const/4 v4, 0x1

    .line 670
    iput-boolean v4, v8, Lk8;->η:Z

    .line 671
    .line 672
    iget v4, v5, Ll8;->μ:I

    .line 673
    .line 674
    iput v4, v8, Lk8;->ι:I

    .line 675
    .line 676
    iget-object v4, v5, Ll8;->ν:Ljava/lang/CharSequence;

    .line 677
    .line 678
    iput-object v4, v8, Lk8;->κ:Ljava/lang/CharSequence;

    .line 679
    .line 680
    iget v4, v5, Ll8;->ξ:I

    .line 681
    .line 682
    iput v4, v8, Lk8;->λ:I

    .line 683
    .line 684
    iget-object v4, v5, Ll8;->ο:Ljava/lang/CharSequence;

    .line 685
    .line 686
    iput-object v4, v8, Lk8;->μ:Ljava/lang/CharSequence;

    .line 687
    .line 688
    iget-object v4, v5, Ll8;->π:Ljava/util/ArrayList;

    .line 689
    .line 690
    iput-object v4, v8, Lk8;->ν:Ljava/util/ArrayList;

    .line 691
    .line 692
    iget-object v4, v5, Ll8;->ρ:Ljava/util/ArrayList;

    .line 693
    .line 694
    iput-object v4, v8, Lk8;->ξ:Ljava/util/ArrayList;

    .line 695
    .line 696
    iget-boolean v4, v5, Ll8;->σ:Z

    .line 697
    .line 698
    iput-boolean v4, v8, Lk8;->ο:Z

    .line 699
    .line 700
    iget v4, v5, Ll8;->λ:I

    .line 701
    .line 702
    iput v4, v8, Lk8;->σ:I

    .line 703
    .line 704
    const/4 v4, 0x0

    .line 705
    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 706
    .line 707
    .line 708
    move-result v5

    .line 709
    if-ge v4, v5, :cond_14

    .line 710
    .line 711
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    check-cast v5, Ljava/lang/String;

    .line 716
    .line 717
    if-eqz v5, :cond_13

    .line 718
    .line 719
    iget-object v6, v8, Lk8;->α:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    check-cast v6, Lm70;

    .line 726
    .line 727
    invoke-virtual {v3, v5}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    iput-object v5, v6, Lm70;->β:Ln60;

    .line 732
    .line 733
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 734
    .line 735
    goto :goto_9

    .line 736
    :cond_14
    const/4 v4, 0x1

    .line 737
    invoke-virtual {v8, v4}, Lk8;->γ(I)V

    .line 738
    .line 739
    .line 740
    invoke-static/range {p1 .. p1}, Lb70;->Η(I)Z

    .line 741
    .line 742
    .line 743
    move-result v5

    .line 744
    if-eqz v5, :cond_15

    .line 745
    .line 746
    const-string v5, "restoreAllState: back stack #"

    .line 747
    .line 748
    const-string v6, " (index "

    .line 749
    .line 750
    invoke-static {v2, v5, v6}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    move-result-object v5

    .line 754
    iget v6, v8, Lk8;->σ:I

    .line 755
    .line 756
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    invoke-static {v11, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 770
    .line 771
    .line 772
    new-instance v5, Ljv0;

    .line 773
    .line 774
    invoke-direct {v5}, Ljv0;-><init>()V

    .line 775
    .line 776
    .line 777
    new-instance v6, Ljava/io/PrintWriter;

    .line 778
    .line 779
    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 780
    .line 781
    .line 782
    const-string v5, "  "

    .line 783
    .line 784
    const/4 v7, 0x0

    .line 785
    invoke-virtual {v8, v5, v6, v7}, Lk8;->δ(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    .line 789
    .line 790
    .line 791
    goto :goto_a

    .line 792
    :cond_15
    const/4 v7, 0x0

    .line 793
    :goto_a
    iget-object v5, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    add-int/lit8 v2, v2, 0x1

    .line 799
    .line 800
    move/from16 v10, p1

    .line 801
    .line 802
    move v6, v4

    .line 803
    goto/16 :goto_6

    .line 804
    .line 805
    :cond_16
    const/4 v7, 0x0

    .line 806
    goto :goto_b

    .line 807
    :cond_17
    const/4 v7, 0x0

    .line 808
    iput-object v8, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 809
    .line 810
    :goto_b
    iget-object v2, v0, Lb70;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 811
    .line 812
    iget v4, v1, Lc70;->θ:I

    .line 813
    .line 814
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 815
    .line 816
    .line 817
    iget-object v2, v1, Lc70;->ι:Ljava/lang/String;

    .line 818
    .line 819
    if-eqz v2, :cond_18

    .line 820
    .line 821
    invoke-virtual {v3, v2}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    iput-object v2, v0, Lb70;->ψ:Ln60;

    .line 826
    .line 827
    invoke-virtual {v0, v2}, Lb70;->ρ(Ln60;)V

    .line 828
    .line 829
    .line 830
    :cond_18
    iget-object v2, v1, Lc70;->κ:Ljava/util/ArrayList;

    .line 831
    .line 832
    if-eqz v2, :cond_19

    .line 833
    .line 834
    move v4, v7

    .line 835
    :goto_c
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    if-ge v4, v3, :cond_19

    .line 840
    .line 841
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    check-cast v3, Ljava/lang/String;

    .line 846
    .line 847
    iget-object v5, v1, Lc70;->λ:Ljava/util/ArrayList;

    .line 848
    .line 849
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v5

    .line 853
    check-cast v5, Lm8;

    .line 854
    .line 855
    iget-object v6, v0, Lb70;->κ:Ljava/util/Map;

    .line 856
    .line 857
    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    add-int/lit8 v4, v4, 0x1

    .line 861
    .line 862
    goto :goto_c

    .line 863
    :cond_19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 864
    .line 865
    iget-object v1, v1, Lc70;->μ:Ljava/util/ArrayList;

    .line 866
    .line 867
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 868
    .line 869
    .line 870
    iput-object v2, v0, Lb70;->Ε:Ljava/util/ArrayDeque;

    .line 871
    .line 872
    return-void
.end method

.method public final Υ()Landroid/os/Bundle;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lb70;->ε()Ljava/util/HashSet;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x2

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lpr;

    .line 29
    .line 30
    iget-boolean v6, v3, Lpr;->ε:Z

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    invoke-static {v5}, Lb70;->Η(I)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    const-string v5, "FragmentManager"

    .line 41
    .line 42
    const-string v6, "SpecialEffectsController: Forcing postponed operations"

    .line 43
    .line 44
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    iput-boolean v4, v3, Lpr;->ε:Z

    .line 48
    .line 49
    invoke-virtual {v3}, Lpr;->β()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v0}, Lb70;->ε()Ljava/util/HashSet;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lpr;

    .line 72
    .line 73
    invoke-virtual {v3}, Lpr;->γ()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 v2, 0x1

    .line 78
    invoke-virtual {v0, v2}, Lb70;->ω(Z)Z

    .line 79
    .line 80
    .line 81
    iput-boolean v2, v0, Lb70;->Η:Z

    .line 82
    .line 83
    iget-object v3, v0, Lb70;->Ξ:Le70;

    .line 84
    .line 85
    iput-boolean v2, v3, Le70;->η:Z

    .line 86
    .line 87
    iget-object v2, v0, Lb70;->γ:Li0;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v3, Ljava/util/ArrayList;

    .line 93
    .line 94
    iget-object v6, v2, Li0;->η:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/util/HashMap;->size()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_14

    .line 118
    .line 119
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Li70;

    .line 124
    .line 125
    if-eqz v7, :cond_12

    .line 126
    .line 127
    iget-object v8, v7, Li70;->γ:Ln60;

    .line 128
    .line 129
    iget-object v9, v8, Ln60;->ι:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v10, Landroid/os/Bundle;

    .line 132
    .line 133
    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 134
    .line 135
    .line 136
    iget-object v11, v7, Li70;->γ:Ln60;

    .line 137
    .line 138
    iget v12, v11, Ln60;->ε:I

    .line 139
    .line 140
    const/4 v13, -0x1

    .line 141
    if-ne v12, v13, :cond_4

    .line 142
    .line 143
    iget-object v12, v11, Ln60;->ζ:Landroid/os/Bundle;

    .line 144
    .line 145
    if-eqz v12, :cond_4

    .line 146
    .line 147
    invoke-virtual {v10, v12}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    new-instance v12, Lh70;

    .line 151
    .line 152
    invoke-direct {v12, v11}, Lh70;-><init>(Ln60;)V

    .line 153
    .line 154
    .line 155
    const-string v14, "state"

    .line 156
    .line 157
    invoke-virtual {v10, v14, v12}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 158
    .line 159
    .line 160
    iget v12, v11, Ln60;->ε:I

    .line 161
    .line 162
    if-le v12, v13, :cond_f

    .line 163
    .line 164
    new-instance v12, Landroid/os/Bundle;

    .line 165
    .line 166
    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    .line 167
    .line 168
    .line 169
    move-object v14, v11

    .line 170
    check-cast v14, Lws;

    .line 171
    .line 172
    iget-object v15, v14, Lws;->и:Lxm;

    .line 173
    .line 174
    if-eqz v15, :cond_5

    .line 175
    .line 176
    invoke-virtual {v15}, Lxm;->onSaveInstanceState()Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    move/from16 v16, v5

    .line 181
    .line 182
    const-string v5, "android:dialogShowing"

    .line 183
    .line 184
    invoke-virtual {v15, v5, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 185
    .line 186
    .line 187
    const-string v5, "android:savedDialogState"

    .line 188
    .line 189
    invoke-virtual {v12, v5, v15}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    move/from16 v16, v5

    .line 194
    .line 195
    :goto_3
    iget v5, v14, Lws;->б:I

    .line 196
    .line 197
    if-eqz v5, :cond_6

    .line 198
    .line 199
    const-string v15, "android:style"

    .line 200
    .line 201
    invoke-virtual {v12, v15, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 202
    .line 203
    .line 204
    :cond_6
    iget v5, v14, Lws;->в:I

    .line 205
    .line 206
    if-eqz v5, :cond_7

    .line 207
    .line 208
    const-string v15, "android:theme"

    .line 209
    .line 210
    invoke-virtual {v12, v15, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 211
    .line 212
    .line 213
    :cond_7
    iget-boolean v5, v14, Lws;->г:Z

    .line 214
    .line 215
    if-nez v5, :cond_8

    .line 216
    .line 217
    const-string v15, "android:cancelable"

    .line 218
    .line 219
    invoke-virtual {v12, v15, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 220
    .line 221
    .line 222
    :cond_8
    iget-boolean v5, v14, Lws;->д:Z

    .line 223
    .line 224
    if-nez v5, :cond_9

    .line 225
    .line 226
    const-string v15, "android:showsDialog"

    .line 227
    .line 228
    invoke-virtual {v12, v15, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 229
    .line 230
    .line 231
    :cond_9
    iget v5, v14, Lws;->е:I

    .line 232
    .line 233
    if-eq v5, v13, :cond_a

    .line 234
    .line 235
    const-string v13, "android:backStackId"

    .line 236
    .line 237
    invoke-virtual {v12, v13, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 238
    .line 239
    .line 240
    :cond_a
    invoke-virtual {v12}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-nez v5, :cond_b

    .line 245
    .line 246
    const-string v5, "savedInstanceState"

    .line 247
    .line 248
    invoke-virtual {v10, v5, v12}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 249
    .line 250
    .line 251
    :cond_b
    iget-object v5, v7, Li70;->α:Ln5;

    .line 252
    .line 253
    invoke-virtual {v5, v4}, Ln5;->Β(Z)V

    .line 254
    .line 255
    .line 256
    new-instance v5, Landroid/os/Bundle;

    .line 257
    .line 258
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 259
    .line 260
    .line 261
    iget-object v7, v11, Ln60;->Υ:Ln5;

    .line 262
    .line 263
    invoke-virtual {v7, v5}, Ln5;->Ρ(Landroid/os/Bundle;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-nez v7, :cond_c

    .line 271
    .line 272
    const-string v7, "registryState"

    .line 273
    .line 274
    invoke-virtual {v10, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 275
    .line 276
    .line 277
    :cond_c
    iget-object v5, v11, Ln60;->ω:Lb70;

    .line 278
    .line 279
    invoke-virtual {v5}, Lb70;->Υ()Landroid/os/Bundle;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-virtual {v5}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    if-nez v7, :cond_d

    .line 288
    .line 289
    const-string v7, "childFragmentManager"

    .line 290
    .line 291
    invoke-virtual {v10, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 292
    .line 293
    .line 294
    :cond_d
    iget-object v5, v11, Ln60;->η:Landroid/util/SparseArray;

    .line 295
    .line 296
    if-eqz v5, :cond_e

    .line 297
    .line 298
    const-string v7, "viewState"

    .line 299
    .line 300
    invoke-virtual {v10, v7, v5}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 301
    .line 302
    .line 303
    :cond_e
    iget-object v5, v11, Ln60;->θ:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v5, :cond_10

    .line 306
    .line 307
    const-string v7, "viewRegistryState"

    .line 308
    .line 309
    invoke-virtual {v10, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_f
    move/from16 v16, v5

    .line 314
    .line 315
    :cond_10
    :goto_4
    iget-object v5, v11, Ln60;->κ:Landroid/os/Bundle;

    .line 316
    .line 317
    if-eqz v5, :cond_11

    .line 318
    .line 319
    const-string v7, "arguments"

    .line 320
    .line 321
    invoke-virtual {v10, v7, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 322
    .line 323
    .line 324
    :cond_11
    invoke-virtual {v2, v10, v9}, Li0;->Ζ(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 325
    .line 326
    .line 327
    iget-object v5, v8, Ln60;->ι:Ljava/lang/String;

    .line 328
    .line 329
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    invoke-static/range {v16 .. v16}, Lb70;->Η(I)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_13

    .line 337
    .line 338
    const-string v5, "FragmentManager"

    .line 339
    .line 340
    new-instance v7, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v9, "Saved state of "

    .line 343
    .line 344
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v9, ": "

    .line 351
    .line 352
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    iget-object v8, v8, Ln60;->ζ:Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v7

    .line 364
    invoke-static {v5, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    goto :goto_5

    .line 368
    :cond_12
    move/from16 v16, v5

    .line 369
    .line 370
    :cond_13
    :goto_5
    move/from16 v5, v16

    .line 371
    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :cond_14
    move/from16 v16, v5

    .line 375
    .line 376
    iget-object v2, v0, Lb70;->γ:Li0;

    .line 377
    .line 378
    iget-object v2, v2, Li0;->θ:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v2, Ljava/util/HashMap;

    .line 381
    .line 382
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    if-eqz v5, :cond_15

    .line 387
    .line 388
    invoke-static/range {v16 .. v16}, Lb70;->Η(I)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_1e

    .line 393
    .line 394
    const-string v0, "FragmentManager"

    .line 395
    .line 396
    const-string v2, "saveAllState: no fragments!"

    .line 397
    .line 398
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    return-object v1

    .line 402
    :cond_15
    iget-object v5, v0, Lb70;->γ:Li0;

    .line 403
    .line 404
    iget-object v6, v5, Li0;->ζ:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v6, Ljava/util/ArrayList;

    .line 407
    .line 408
    monitor-enter v6

    .line 409
    :try_start_0
    iget-object v7, v5, Li0;->ζ:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v7, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    const/4 v8, 0x0

    .line 418
    if-eqz v7, :cond_16

    .line 419
    .line 420
    monitor-exit v6

    .line 421
    move-object v7, v8

    .line 422
    goto :goto_7

    .line 423
    :catchall_0
    move-exception v0

    .line 424
    goto/16 :goto_b

    .line 425
    .line 426
    :cond_16
    new-instance v7, Ljava/util/ArrayList;

    .line 427
    .line 428
    iget-object v9, v5, Li0;->ζ:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v9, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v9

    .line 436
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 437
    .line 438
    .line 439
    iget-object v5, v5, Li0;->ζ:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v5, Ljava/util/ArrayList;

    .line 442
    .line 443
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    :cond_17
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v9

    .line 451
    if-eqz v9, :cond_18

    .line 452
    .line 453
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    check-cast v9, Ln60;

    .line 458
    .line 459
    iget-object v10, v9, Ln60;->ι:Ljava/lang/String;

    .line 460
    .line 461
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    invoke-static/range {v16 .. v16}, Lb70;->Η(I)Z

    .line 465
    .line 466
    .line 467
    move-result v10

    .line 468
    if-eqz v10, :cond_17

    .line 469
    .line 470
    const-string v10, "FragmentManager"

    .line 471
    .line 472
    new-instance v11, Ljava/lang/StringBuilder;

    .line 473
    .line 474
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 475
    .line 476
    .line 477
    const-string v12, "saveAllState: adding fragment ("

    .line 478
    .line 479
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    iget-object v12, v9, Ln60;->ι:Ljava/lang/String;

    .line 483
    .line 484
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v12, "): "

    .line 488
    .line 489
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 500
    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_18
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 504
    :goto_7
    iget-object v5, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 505
    .line 506
    if-eqz v5, :cond_1a

    .line 507
    .line 508
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 509
    .line 510
    .line 511
    move-result v5

    .line 512
    if-lez v5, :cond_1a

    .line 513
    .line 514
    new-array v6, v5, [Ll8;

    .line 515
    .line 516
    :goto_8
    if-ge v4, v5, :cond_1b

    .line 517
    .line 518
    new-instance v9, Ll8;

    .line 519
    .line 520
    iget-object v10, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 521
    .line 522
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v10

    .line 526
    check-cast v10, Lk8;

    .line 527
    .line 528
    invoke-direct {v9, v10}, Ll8;-><init>(Lk8;)V

    .line 529
    .line 530
    .line 531
    aput-object v9, v6, v4

    .line 532
    .line 533
    invoke-static/range {v16 .. v16}, Lb70;->Η(I)Z

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    if-eqz v9, :cond_19

    .line 538
    .line 539
    const-string v9, "FragmentManager"

    .line 540
    .line 541
    const-string v10, "saveAllState: adding back stack #"

    .line 542
    .line 543
    const-string v11, ": "

    .line 544
    .line 545
    invoke-static {v4, v10, v11}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    move-result-object v10

    .line 549
    iget-object v11, v0, Lb70;->δ:Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v11

    .line 555
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v10

    .line 562
    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 563
    .line 564
    .line 565
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 566
    .line 567
    goto :goto_8

    .line 568
    :cond_1a
    move-object v6, v8

    .line 569
    :cond_1b
    new-instance v4, Lc70;

    .line 570
    .line 571
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 572
    .line 573
    .line 574
    iput-object v8, v4, Lc70;->ι:Ljava/lang/String;

    .line 575
    .line 576
    new-instance v5, Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 579
    .line 580
    .line 581
    iput-object v5, v4, Lc70;->κ:Ljava/util/ArrayList;

    .line 582
    .line 583
    new-instance v8, Ljava/util/ArrayList;

    .line 584
    .line 585
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 586
    .line 587
    .line 588
    iput-object v8, v4, Lc70;->λ:Ljava/util/ArrayList;

    .line 589
    .line 590
    iput-object v3, v4, Lc70;->ε:Ljava/util/ArrayList;

    .line 591
    .line 592
    iput-object v7, v4, Lc70;->ζ:Ljava/util/ArrayList;

    .line 593
    .line 594
    iput-object v6, v4, Lc70;->η:[Ll8;

    .line 595
    .line 596
    iget-object v3, v0, Lb70;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 597
    .line 598
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    iput v3, v4, Lc70;->θ:I

    .line 603
    .line 604
    iget-object v3, v0, Lb70;->ψ:Ln60;

    .line 605
    .line 606
    if-eqz v3, :cond_1c

    .line 607
    .line 608
    iget-object v3, v3, Ln60;->ι:Ljava/lang/String;

    .line 609
    .line 610
    iput-object v3, v4, Lc70;->ι:Ljava/lang/String;

    .line 611
    .line 612
    :cond_1c
    iget-object v3, v0, Lb70;->κ:Ljava/util/Map;

    .line 613
    .line 614
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 619
    .line 620
    .line 621
    iget-object v3, v0, Lb70;->κ:Ljava/util/Map;

    .line 622
    .line 623
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 628
    .line 629
    .line 630
    new-instance v3, Ljava/util/ArrayList;

    .line 631
    .line 632
    iget-object v5, v0, Lb70;->Ε:Ljava/util/ArrayDeque;

    .line 633
    .line 634
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 635
    .line 636
    .line 637
    iput-object v3, v4, Lc70;->μ:Ljava/util/ArrayList;

    .line 638
    .line 639
    const-string v3, "state"

    .line 640
    .line 641
    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 642
    .line 643
    .line 644
    iget-object v3, v0, Lb70;->λ:Ljava/util/Map;

    .line 645
    .line 646
    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    if-eqz v4, :cond_1d

    .line 659
    .line 660
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    check-cast v4, Ljava/lang/String;

    .line 665
    .line 666
    const-string v5, "result_"

    .line 667
    .line 668
    invoke-static {v5, v4}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v5

    .line 672
    iget-object v6, v0, Lb70;->λ:Ljava/util/Map;

    .line 673
    .line 674
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v4

    .line 678
    check-cast v4, Landroid/os/Bundle;

    .line 679
    .line 680
    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 681
    .line 682
    .line 683
    goto :goto_9

    .line 684
    :cond_1d
    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    if-eqz v3, :cond_1e

    .line 697
    .line 698
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    check-cast v3, Ljava/lang/String;

    .line 703
    .line 704
    const-string v4, "fragment_"

    .line 705
    .line 706
    invoke-static {v4, v3}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    check-cast v3, Landroid/os/Bundle;

    .line 715
    .line 716
    invoke-virtual {v1, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 717
    .line 718
    .line 719
    goto :goto_a

    .line 720
    :cond_1e
    return-object v1

    .line 721
    :goto_b
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 722
    throw v0
.end method

.method public final Φ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 14
    .line 15
    iget-object v1, v1, Lp60;->ψ:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, Lb70;->Ο:Ld1;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 23
    .line 24
    iget-object v1, v1, Lp60;->ψ:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, Lb70;->Ο:Ld1;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lb70;->д()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public final Χ(Ln60;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lb70;->Γ(Ln60;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    instance-of p1, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p1, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final Ψ(Ln60;Lcr0;)V
    .locals 2

    .line 1
    iget-object v0, p1, Ln60;->ι:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, Ln60;->ψ:Lp60;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, Ln60;->χ:Lb70;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, Ln60;->Ρ:Lcr0;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p2, "Fragment "

    .line 27
    .line 28
    const-string v0, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {p2, p1, v0, p0}, Lγ;->ι(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final Ω(Ln60;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Ln60;->ι:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Ln60;->ψ:Lp60;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, Ln60;->χ:Lb70;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "Fragment "

    .line 27
    .line 28
    const-string v1, " is not an active fragment of FragmentManager "

    .line 29
    .line 30
    invoke-static {v0, p1, v1, p0}, Lγ;->ι(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Lb70;->ψ:Ln60;

    .line 35
    .line 36
    iput-object p1, p0, Lb70;->ψ:Ln60;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lb70;->ρ(Ln60;)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lb70;->ψ:Ln60;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lb70;->ρ(Ln60;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final α(Ln60;)Li70;
    .locals 3

    .line 1
    iget-object v0, p1, Ln60;->Π:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, Lk70;->γ(Ln60;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

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
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Lb70;->ζ(Ln60;)Li70;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, Ln60;->χ:Lb70;

    .line 39
    .line 40
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Li0;->Β(Li70;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, Ln60;->Ζ:Z

    .line 46
    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Li0;->γ(Ln60;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, Ln60;->π:Z

    .line 54
    .line 55
    iput-boolean v1, p1, Ln60;->Ξ:Z

    .line 56
    .line 57
    invoke-static {p1}, Lb70;->Θ(Ln60;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, Lb70;->Ζ:Z

    .line 65
    .line 66
    :cond_2
    return-object v0
.end method

.method public final β(Lp60;Lxb;Ln60;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 2
    .line 3
    if-nez v0, :cond_14

    .line 4
    .line 5
    iput-object p1, p0, Lb70;->υ:Lp60;

    .line 6
    .line 7
    iput-object p2, p0, Lb70;->φ:Lxb;

    .line 8
    .line 9
    iput-object p3, p0, Lb70;->χ:Ln60;

    .line 10
    .line 11
    iget-object p2, p0, Lb70;->ν:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, Lx60;

    .line 16
    .line 17
    invoke-direct {v0, p3}, Lx60;-><init>(Ln60;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, Lb70;->χ:Ln60;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lb70;->д()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_5

    .line 37
    .line 38
    iget-object p2, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroidx/activity/ComponentActivity;->θ()Ld51;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v2, p0, Lb70;->η:Ld51;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object p2, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object p2, p1

    .line 51
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v8, p0, Lb70;->θ:Lu60;

    .line 55
    .line 56
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-interface {p2}, Lhr0;->δ()Ljr0;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget-object v0, p2, Ljr0;->γ:Lcr0;

    .line 64
    .line 65
    sget-object v1, Lcr0;->ε:Lcr0;

    .line 66
    .line 67
    if-ne v0, v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    new-instance v0, Lb51;

    .line 71
    .line 72
    invoke-direct {v0, v2, p2, v8}, Lb51;-><init>(Ld51;Ljr0;Lu60;)V

    .line 73
    .line 74
    .line 75
    iget-object p2, v8, Lu60;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ld51;->γ()V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lw0;

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/4 v7, 0x7

    .line 87
    const/4 v1, 0x0

    .line 88
    const-class v3, Ld51;

    .line 89
    .line 90
    const-string v4, "updateEnabledCallbacks"

    .line 91
    .line 92
    const-string v5, "updateEnabledCallbacks()V"

    .line 93
    .line 94
    invoke-direct/range {v0 .. v7}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    iput-object v0, v8, Lu60;->γ:Lp80;

    .line 98
    .line 99
    :cond_5
    :goto_2
    const/4 p2, 0x0

    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    iget-object p1, p3, Ln60;->χ:Lb70;

    .line 103
    .line 104
    iget-object p1, p1, Lb70;->Ξ:Le70;

    .line 105
    .line 106
    iget-object v0, p1, Le70;->γ:Ljava/util/HashMap;

    .line 107
    .line 108
    iget-object v1, p3, Ln60;->ι:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Le70;

    .line 115
    .line 116
    if-nez v1, :cond_6

    .line 117
    .line 118
    new-instance v1, Le70;

    .line 119
    .line 120
    iget-boolean p1, p1, Le70;->ε:Z

    .line 121
    .line 122
    invoke-direct {v1, p1}, Le70;-><init>(Z)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p3, Ln60;->ι:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_6
    iput-object v1, p0, Lb70;->Ξ:Le70;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    if-eqz p1, :cond_9

    .line 134
    .line 135
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 136
    .line 137
    invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->γ()Lq92;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v0, Lgq;->β:Lgq;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v1, Li0;

    .line 150
    .line 151
    sget-object v2, Le70;->θ:Ld70;

    .line 152
    .line 153
    invoke-direct {v1, p1, v2, v0}, Li0;-><init>(Lq92;Lp92;Lhq;)V

    .line 154
    .line 155
    .line 156
    const-class p1, Le70;

    .line 157
    .line 158
    invoke-static {p1}, Lvm1;->α(Ljava/lang/Class;)Lwf;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Lwf;->β()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 169
    .line 170
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v1, p1, v0}, Li0;->ψ(Lwf;Ljava/lang/String;)Lm92;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Le70;

    .line 179
    .line 180
    iput-object p1, p0, Lb70;->Ξ:Le70;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_8
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 184
    .line 185
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_9
    new-instance p1, Le70;

    .line 190
    .line 191
    invoke-direct {p1, p2}, Le70;-><init>(Z)V

    .line 192
    .line 193
    .line 194
    iput-object p1, p0, Lb70;->Ξ:Le70;

    .line 195
    .line 196
    :goto_3
    iget-object p1, p0, Lb70;->Ξ:Le70;

    .line 197
    .line 198
    iget-boolean v0, p0, Lb70;->Η:Z

    .line 199
    .line 200
    if-nez v0, :cond_a

    .line 201
    .line 202
    iget-boolean v0, p0, Lb70;->Θ:Z

    .line 203
    .line 204
    if-eqz v0, :cond_b

    .line 205
    .line 206
    :cond_a
    const/4 p2, 0x1

    .line 207
    :cond_b
    iput-boolean p2, p1, Le70;->η:Z

    .line 208
    .line 209
    iget-object p2, p0, Lb70;->γ:Li0;

    .line 210
    .line 211
    iput-object p1, p2, Li0;->ι:Ljava/lang/Object;

    .line 212
    .line 213
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 214
    .line 215
    if-eqz p1, :cond_c

    .line 216
    .line 217
    if-nez p3, :cond_c

    .line 218
    .line 219
    invoke-virtual {p1}, Lp60;->α()Ln5;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    new-instance p2, Lqm;

    .line 224
    .line 225
    const/4 v0, 0x3

    .line 226
    invoke-direct {p2, v0, p0}, Lqm;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    const-string v0, "android:support:fragments"

    .line 230
    .line 231
    invoke-virtual {p1, v0, p2}, Ln5;->Σ(Ljava/lang/String;Lhq1;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, v0}, Ln5;->ν(Ljava/lang/String;)Landroid/os/Bundle;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    if-eqz p1, :cond_c

    .line 239
    .line 240
    invoke-virtual {p0, p1}, Lb70;->Τ(Landroid/os/Bundle;)V

    .line 241
    .line 242
    .line 243
    :cond_c
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 244
    .line 245
    if-eqz p1, :cond_e

    .line 246
    .line 247
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 248
    .line 249
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->ξ:Lsm;

    .line 250
    .line 251
    if-eqz p3, :cond_d

    .line 252
    .line 253
    new-instance p2, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 256
    .line 257
    .line 258
    iget-object v0, p3, Ln60;->ι:Ljava/lang/String;

    .line 259
    .line 260
    const-string v1, ":"

    .line 261
    .line 262
    invoke-static {p2, v0, v1}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    goto :goto_4

    .line 267
    :cond_d
    const-string p2, ""

    .line 268
    .line 269
    :goto_4
    const-string v0, "FragmentManager:"

    .line 270
    .line 271
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    const-string v0, "StartActivityForResult"

    .line 276
    .line 277
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    new-instance v1, Ll;

    .line 282
    .line 283
    const/4 v2, 0x1

    .line 284
    invoke-direct {v1, v2}, Ll;-><init>(I)V

    .line 285
    .line 286
    .line 287
    new-instance v2, Lt60;

    .line 288
    .line 289
    const/4 v3, 0x1

    .line 290
    invoke-direct {v2, p0, v3}, Lt60;-><init>(Lb70;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v0, v1, v2}, Lsm;->β(Ljava/lang/String;Ls1;Lt60;)Ln5;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iput-object v0, p0, Lb70;->Β:Ln5;

    .line 298
    .line 299
    const-string v0, "StartIntentSenderForResult"

    .line 300
    .line 301
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    new-instance v1, Ll;

    .line 306
    .line 307
    const/4 v2, 0x2

    .line 308
    invoke-direct {v1, v2}, Ll;-><init>(I)V

    .line 309
    .line 310
    .line 311
    new-instance v2, Lt60;

    .line 312
    .line 313
    const/4 v3, 0x2

    .line 314
    invoke-direct {v2, p0, v3}, Lt60;-><init>(Lb70;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1, v0, v1, v2}, Lsm;->β(Ljava/lang/String;Ls1;Lt60;)Ln5;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iput-object v0, p0, Lb70;->Γ:Ln5;

    .line 322
    .line 323
    const-string v0, "RequestPermissions"

    .line 324
    .line 325
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    new-instance v0, Ll;

    .line 330
    .line 331
    const/4 v1, 0x0

    .line 332
    invoke-direct {v0, v1}, Ll;-><init>(I)V

    .line 333
    .line 334
    .line 335
    new-instance v1, Lt60;

    .line 336
    .line 337
    const/4 v2, 0x0

    .line 338
    invoke-direct {v1, p0, v2}, Lt60;-><init>(Lb70;I)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, p2, v0, v1}, Lsm;->β(Ljava/lang/String;Ls1;Lt60;)Ln5;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    iput-object p1, p0, Lb70;->Δ:Ln5;

    .line 346
    .line 347
    :cond_e
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 348
    .line 349
    if-eqz p1, :cond_f

    .line 350
    .line 351
    iget-object p2, p0, Lb70;->ξ:Ls60;

    .line 352
    .line 353
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 354
    .line 355
    invoke-virtual {p1, p2}, Landroidx/activity/ComponentActivity;->ζ(Lap;)V

    .line 356
    .line 357
    .line 358
    :cond_f
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 359
    .line 360
    if-eqz p1, :cond_10

    .line 361
    .line 362
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 363
    .line 364
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->π:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 365
    .line 366
    iget-object p2, p0, Lb70;->ο:Ls60;

    .line 367
    .line 368
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    :cond_10
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 372
    .line 373
    if-eqz p1, :cond_11

    .line 374
    .line 375
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 376
    .line 377
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->σ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 378
    .line 379
    iget-object p2, p0, Lb70;->π:Ls60;

    .line 380
    .line 381
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    :cond_11
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 385
    .line 386
    if-eqz p1, :cond_12

    .line 387
    .line 388
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 389
    .line 390
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->τ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 391
    .line 392
    iget-object p2, p0, Lb70;->ρ:Ls60;

    .line 393
    .line 394
    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    :cond_12
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 398
    .line 399
    if-eqz p1, :cond_13

    .line 400
    .line 401
    if-nez p3, :cond_13

    .line 402
    .line 403
    iget-object p1, p1, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 404
    .line 405
    iget-object p1, p1, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 406
    .line 407
    iget-object p2, p1, Lm6;->θ:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 410
    .line 411
    iget-object p0, p0, Lb70;->σ:Lv60;

    .line 412
    .line 413
    invoke-virtual {p2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    iget-object p0, p1, Lm6;->η:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast p0, Ljava/lang/Runnable;

    .line 419
    .line 420
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 421
    .line 422
    .line 423
    :cond_13
    return-void

    .line 424
    :cond_14
    const-string p0, "Already attached"

    .line 425
    .line 426
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    return-void
.end method

.method public final γ(Ln60;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

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
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, Ln60;->Ζ:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, Ln60;->Ζ:Z

    .line 33
    .line 34
    iget-boolean v1, p1, Ln60;->ο:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Li0;->γ(Ln60;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lb70;->Η(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, Lb70;->Θ(Ln60;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Lb70;->Ζ:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final δ()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lb70;->β:Z

    .line 3
    .line 4
    iget-object v0, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final ε()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 7
    .line 8
    invoke-virtual {v1}, Li0;->υ()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Li70;

    .line 27
    .line 28
    iget-object v2, v2, Li70;->γ:Ln60;

    .line 29
    .line 30
    iget-object v2, v2, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Lb70;->Ε()Li2;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x7f0902c3

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    instance-of v5, v4, Lpr;

    .line 49
    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    check-cast v4, Lpr;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-instance v4, Lpr;

    .line 56
    .line 57
    invoke-direct {v4, v2}, Lpr;-><init>(Landroid/view/ViewGroup;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    return-object v0
.end method

.method public final ζ(Ln60;)Li70;
    .locals 3

    .line 1
    iget-object v0, p1, Ln60;->ι:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 4
    .line 5
    iget-object v2, v1, Li0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Li70;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, Li70;

    .line 19
    .line 20
    iget-object v2, p0, Lb70;->μ:Ln5;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, Li70;-><init>(Ln5;Li0;Ln60;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lb70;->υ:Lp60;

    .line 26
    .line 27
    iget-object p1, p1, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Li70;->μ(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p0, p0, Lb70;->τ:I

    .line 37
    .line 38
    iput p0, v0, Li70;->ε:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final η(Ln60;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, Lb70;->Η(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, Ln60;->Ζ:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, Ln60;->Ζ:Z

    .line 33
    .line 34
    iget-boolean v3, p1, Ln60;->ο:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, Lb70;->Η(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, Lb70;->γ:Li0;

    .line 62
    .line 63
    iget-object v1, v0, Li0;->ζ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, Li0;->ζ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Ln60;->ο:Z

    .line 78
    .line 79
    invoke-static {p1}, Lb70;->Θ(Ln60;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, Lb70;->Ζ:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, Lb70;->а(Ln60;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p0

    .line 94
    :cond_3
    return-void
.end method

.method public final θ(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lb70;->г(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 21
    .line 22
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ln60;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Ln60;->Ι:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lb70;->θ(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final ι()Z
    .locals 4

    .line 1
    iget v0, p0, Lb70;->τ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 9
    .line 10
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ln60;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Ln60;->Ε:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 37
    .line 38
    invoke-virtual {v0}, Lb70;->ι()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final κ()Z
    .locals 7

    .line 1
    iget v0, p0, Lb70;->τ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lb70;->γ:Li0;

    .line 9
    .line 10
    invoke-virtual {v0}, Li0;->χ()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ln60;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, Lb70;->Κ(Ln60;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, Ln60;->Ε:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, Ln60;->ω:Lb70;

    .line 45
    .line 46
    invoke-virtual {v6}, Lb70;->κ()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ln60;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final λ()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lb70;->Ι:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lb70;->ω(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lb70;->ε()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lpr;

    .line 26
    .line 27
    invoke-virtual {v2}, Lpr;->γ()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 32
    .line 33
    iget-object v2, p0, Lb70;->γ:Li0;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v2, Li0;->ι:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Le70;

    .line 40
    .line 41
    iget-boolean v0, v0, Le70;->ζ:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v1, v1, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/2addr v0, v1

    .line 53
    :cond_2
    :goto_1
    if-eqz v0, :cond_5

    .line 54
    .line 55
    iget-object v0, p0, Lb70;->κ:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lm8;

    .line 76
    .line 77
    iget-object v1, v1, Lm8;->ε:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v4, v2, Li0;->ι:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Le70;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/4 v5, 0x3

    .line 103
    invoke-static {v5}, Lb70;->Η(I)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_4

    .line 108
    .line 109
    new-instance v5, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    const-string v6, "Clearing non-config state for saved state of Fragment "

    .line 112
    .line 113
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const-string v6, "FragmentManager"

    .line 124
    .line 125
    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    :cond_4
    invoke-virtual {v4, v3}, Le70;->δ(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    const/4 v0, -0x1

    .line 133
    invoke-virtual {p0, v0}, Lb70;->υ(I)V

    .line 134
    .line 135
    .line 136
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 137
    .line 138
    if-eqz v0, :cond_6

    .line 139
    .line 140
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 141
    .line 142
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->π:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 143
    .line 144
    iget-object v1, p0, Lb70;->ο:Ls60;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_6
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 154
    .line 155
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->ο:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 156
    .line 157
    iget-object v1, p0, Lb70;->ξ:Ls60;

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    :cond_7
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 167
    .line 168
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->σ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 169
    .line 170
    iget-object v1, p0, Lb70;->π:Ls60;

    .line 171
    .line 172
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    :cond_8
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 176
    .line 177
    if-eqz v0, :cond_9

    .line 178
    .line 179
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 180
    .line 181
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->τ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 182
    .line 183
    iget-object v1, p0, Lb70;->ρ:Ls60;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_9
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 189
    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    iget-object v1, p0, Lb70;->χ:Ln60;

    .line 193
    .line 194
    if-nez v1, :cond_b

    .line 195
    .line 196
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 197
    .line 198
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->η:Lm6;

    .line 199
    .line 200
    iget-object v1, v0, Lm6;->θ:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 203
    .line 204
    iget-object v2, p0, Lb70;->σ:Lv60;

    .line 205
    .line 206
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    iget-object v1, v0, Lm6;->ζ:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    if-nez v1, :cond_a

    .line 218
    .line 219
    iget-object v0, v0, Lm6;->η:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Ljava/lang/Runnable;

    .line 222
    .line 223
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_a
    invoke-static {}, Lγ;->β()V

    .line 228
    .line 229
    .line 230
    :cond_b
    :goto_3
    const/4 v0, 0x0

    .line 231
    iput-object v0, p0, Lb70;->υ:Lp60;

    .line 232
    .line 233
    iput-object v0, p0, Lb70;->φ:Lxb;

    .line 234
    .line 235
    iput-object v0, p0, Lb70;->χ:Ln60;

    .line 236
    .line 237
    iget-object v1, p0, Lb70;->η:Ld51;

    .line 238
    .line 239
    if-eqz v1, :cond_d

    .line 240
    .line 241
    iget-object v1, p0, Lb70;->θ:Lu60;

    .line 242
    .line 243
    iget-object v1, v1, Lu60;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_c

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    check-cast v2, Lxd;

    .line 260
    .line 261
    invoke-interface {v2}, Lxd;->cancel()V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_c
    iput-object v0, p0, Lb70;->η:Ld51;

    .line 266
    .line 267
    :cond_d
    iget-object v0, p0, Lb70;->Β:Ln5;

    .line 268
    .line 269
    if-eqz v0, :cond_e

    .line 270
    .line 271
    invoke-virtual {v0}, Ln5;->Ψ()V

    .line 272
    .line 273
    .line 274
    iget-object v0, p0, Lb70;->Γ:Ln5;

    .line 275
    .line 276
    invoke-virtual {v0}, Ln5;->Ψ()V

    .line 277
    .line 278
    .line 279
    iget-object p0, p0, Lb70;->Δ:Ln5;

    .line 280
    .line 281
    invoke-virtual {p0}, Ln5;->Ψ()V

    .line 282
    .line 283
    .line 284
    :cond_e
    return-void
.end method

.method public final μ(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lb70;->г(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 21
    .line 22
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ln60;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iput-boolean v1, v0, Ln60;->Ι:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lb70;->μ(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final ν(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lb70;->г(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 21
    .line 22
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ln60;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lb70;->ν(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final ξ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 2
    .line 3
    invoke-virtual {p0}, Li0;->φ()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln60;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ln60;->λ()Z

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 29
    .line 30
    invoke-virtual {v0}, Lb70;->ξ()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final ο()Z
    .locals 4

    .line 1
    iget v0, p0, Lb70;->τ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 9
    .line 10
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Ln60;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v0, Ln60;->Ε:Z

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 37
    .line 38
    invoke-virtual {v0}, Lb70;->ο()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v0, v1

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final π()V
    .locals 2

    .line 1
    iget v0, p0, Lb70;->τ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 8
    .line 9
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ln60;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-boolean v1, v0, Ln60;->Ε:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 36
    .line 37
    invoke-virtual {v0}, Lb70;->π()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final ρ(Ln60;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Ln60;->ι:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    iget-object p0, p1, Ln60;->χ:Lb70;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Lb70;->Λ(Ln60;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    iget-object v0, p1, Ln60;->ξ:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eq v0, p0, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iput-object p0, p1, Ln60;->ξ:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p0, p1, Ln60;->ω:Lb70;

    .line 43
    .line 44
    invoke-virtual {p0}, Lb70;->д()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lb70;->ψ:Ln60;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lb70;->ρ(Ln60;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final σ(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lb70;->г(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    :goto_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 21
    .line 22
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Ln60;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v0, v0, Ln60;->ω:Lb70;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-virtual {v0, v1}, Lb70;->σ(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final τ()Z
    .locals 5

    .line 1
    iget v0, p0, Lb70;->τ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 9
    .line 10
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    move v0, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ln60;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-static {v3}, Lb70;->Κ(Ln60;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    iget-boolean v4, v3, Ln60;->Ε:Z

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    iget-object v3, v3, Ln60;->ω:Lb70;

    .line 44
    .line 45
    invoke-virtual {v3}, Lb70;->τ()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v3, v1

    .line 51
    :goto_1
    if-eqz v3, :cond_1

    .line 52
    .line 53
    move v0, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v0
.end method

.method public final υ(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lb70;->β:Z

    .line 4
    .line 5
    iget-object v2, p0, Lb70;->γ:Li0;

    .line 6
    .line 7
    iget-object v2, v2, Li0;->η:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Li70;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, Li70;->ε:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, Lb70;->Μ(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lb70;->ε()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lpr;

    .line 58
    .line 59
    invoke-virtual {v2}, Lpr;->γ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, Lb70;->β:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lb70;->ω(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, Lb70;->β:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final φ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lb70;->γ:Li0;

    .line 8
    .line 9
    iget-object v2, v1, Li0;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, Li0;->η:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    if-nez v4, :cond_1e

    .line 29
    .line 30
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "Active Fragments:"

    .line 34
    .line 35
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1e

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Li70;

    .line 57
    .line 58
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    if-eqz v4, :cond_1d

    .line 62
    .line 63
    iget-object v4, v4, Li70;->γ:Ln60;

    .line 64
    .line 65
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v6, "mFragmentId=#"

    .line 75
    .line 76
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget v6, v4, Ln60;->Β:I

    .line 80
    .line 81
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v6, " mContainerId=#"

    .line 89
    .line 90
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget v6, v4, Ln60;->Γ:I

    .line 94
    .line 95
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v6, " mTag="

    .line 103
    .line 104
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v6, v4, Ln60;->Δ:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const-string v6, "mState="

    .line 116
    .line 117
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget v6, v4, Ln60;->ε:I

    .line 121
    .line 122
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    .line 123
    .line 124
    .line 125
    const-string v6, " mWho="

    .line 126
    .line 127
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    iget-object v6, v4, Ln60;->ι:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v6, " mBackStackNesting="

    .line 136
    .line 137
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget v6, v4, Ln60;->φ:I

    .line 141
    .line 142
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v6, "mAdded="

    .line 149
    .line 150
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v6, v4, Ln60;->ο:Z

    .line 154
    .line 155
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v6, " mRemoving="

    .line 159
    .line 160
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v6, v4, Ln60;->π:Z

    .line 164
    .line 165
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    const-string v6, " mFromLayout="

    .line 169
    .line 170
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    iget-boolean v6, v4, Ln60;->ρ:Z

    .line 174
    .line 175
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 176
    .line 177
    .line 178
    const-string v6, " mInLayout="

    .line 179
    .line 180
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-boolean v6, v4, Ln60;->σ:Z

    .line 184
    .line 185
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v6, "mHidden="

    .line 192
    .line 193
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iget-boolean v6, v4, Ln60;->Ε:Z

    .line 197
    .line 198
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 199
    .line 200
    .line 201
    const-string v6, " mDetached="

    .line 202
    .line 203
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-boolean v6, v4, Ln60;->Ζ:Z

    .line 207
    .line 208
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 209
    .line 210
    .line 211
    const-string v6, " mMenuVisible="

    .line 212
    .line 213
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iget-boolean v6, v4, Ln60;->Θ:Z

    .line 217
    .line 218
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 219
    .line 220
    .line 221
    const-string v6, " mHasMenu="

    .line 222
    .line 223
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "mRetainInstance="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, Ln60;->Η:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mUserVisibleHint="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v6, v4, Ln60;->Μ:Z

    .line 248
    .line 249
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v4, Ln60;->χ:Lb70;

    .line 253
    .line 254
    if-eqz v6, :cond_0

    .line 255
    .line 256
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v6, "mFragmentManager="

    .line 260
    .line 261
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v6, v4, Ln60;->χ:Lb70;

    .line 265
    .line 266
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    iget-object v6, v4, Ln60;->ψ:Lp60;

    .line 270
    .line 271
    if-eqz v6, :cond_1

    .line 272
    .line 273
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v6, "mHost="

    .line 277
    .line 278
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, Ln60;->ψ:Lp60;

    .line 282
    .line 283
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1
    iget-object v6, v4, Ln60;->Α:Ln60;

    .line 287
    .line 288
    if-eqz v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v6, "mParentFragment="

    .line 294
    .line 295
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v6, v4, Ln60;->Α:Ln60;

    .line 299
    .line 300
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v6, v4, Ln60;->κ:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_3

    .line 306
    .line 307
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v6, "mArguments="

    .line 311
    .line 312
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v6, v4, Ln60;->κ:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_3
    iget-object v6, v4, Ln60;->ζ:Landroid/os/Bundle;

    .line 321
    .line 322
    if-eqz v6, :cond_4

    .line 323
    .line 324
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "mSavedFragmentState="

    .line 328
    .line 329
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v6, v4, Ln60;->ζ:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_4
    iget-object v6, v4, Ln60;->η:Landroid/util/SparseArray;

    .line 338
    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v6, "mSavedViewState="

    .line 345
    .line 346
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v4, Ln60;->η:Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_5
    iget-object v6, v4, Ln60;->θ:Landroid/os/Bundle;

    .line 355
    .line 356
    if-eqz v6, :cond_6

    .line 357
    .line 358
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "mSavedViewRegistryState="

    .line 362
    .line 363
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, v4, Ln60;->θ:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_6
    iget-object v6, v4, Ln60;->λ:Ln60;

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    if-eqz v6, :cond_7

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_7
    iget-object v6, v4, Ln60;->χ:Lb70;

    .line 378
    .line 379
    if-eqz v6, :cond_8

    .line 380
    .line 381
    iget-object v8, v4, Ln60;->μ:Ljava/lang/String;

    .line 382
    .line 383
    if-eqz v8, :cond_8

    .line 384
    .line 385
    iget-object v6, v6, Lb70;->γ:Li0;

    .line 386
    .line 387
    invoke-virtual {v6, v8}, Li0;->ο(Ljava/lang/String;)Ln60;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    goto :goto_1

    .line 392
    :cond_8
    move-object v6, v7

    .line 393
    :goto_1
    if-eqz v6, :cond_9

    .line 394
    .line 395
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    const-string v8, "mTarget="

    .line 399
    .line 400
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    const-string v6, " mTargetRequestCode="

    .line 407
    .line 408
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget v6, v4, Ln60;->ν:I

    .line 412
    .line 413
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 414
    .line 415
    .line 416
    :cond_9
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-string v6, "mPopDirection="

    .line 420
    .line 421
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 425
    .line 426
    if-nez v6, :cond_a

    .line 427
    .line 428
    move v6, v5

    .line 429
    goto :goto_2

    .line 430
    :cond_a
    iget-boolean v6, v6, Lm60;->α:Z

    .line 431
    .line 432
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 433
    .line 434
    .line 435
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 436
    .line 437
    if-nez v6, :cond_b

    .line 438
    .line 439
    move v6, v5

    .line 440
    goto :goto_3

    .line 441
    :cond_b
    iget v6, v6, Lm60;->β:I

    .line 442
    .line 443
    :goto_3
    if-eqz v6, :cond_d

    .line 444
    .line 445
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    const-string v6, "getEnterAnim="

    .line 449
    .line 450
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 454
    .line 455
    if-nez v6, :cond_c

    .line 456
    .line 457
    move v6, v5

    .line 458
    goto :goto_4

    .line 459
    :cond_c
    iget v6, v6, Lm60;->β:I

    .line 460
    .line 461
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 462
    .line 463
    .line 464
    :cond_d
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 465
    .line 466
    if-nez v6, :cond_e

    .line 467
    .line 468
    move v6, v5

    .line 469
    goto :goto_5

    .line 470
    :cond_e
    iget v6, v6, Lm60;->γ:I

    .line 471
    .line 472
    :goto_5
    if-eqz v6, :cond_10

    .line 473
    .line 474
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v6, "getExitAnim="

    .line 478
    .line 479
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 483
    .line 484
    if-nez v6, :cond_f

    .line 485
    .line 486
    move v6, v5

    .line 487
    goto :goto_6

    .line 488
    :cond_f
    iget v6, v6, Lm60;->γ:I

    .line 489
    .line 490
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 491
    .line 492
    .line 493
    :cond_10
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 494
    .line 495
    if-nez v6, :cond_11

    .line 496
    .line 497
    move v6, v5

    .line 498
    goto :goto_7

    .line 499
    :cond_11
    iget v6, v6, Lm60;->δ:I

    .line 500
    .line 501
    :goto_7
    if-eqz v6, :cond_13

    .line 502
    .line 503
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    const-string v6, "getPopEnterAnim="

    .line 507
    .line 508
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 512
    .line 513
    if-nez v6, :cond_12

    .line 514
    .line 515
    move v6, v5

    .line 516
    goto :goto_8

    .line 517
    :cond_12
    iget v6, v6, Lm60;->δ:I

    .line 518
    .line 519
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 520
    .line 521
    .line 522
    :cond_13
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 523
    .line 524
    if-nez v6, :cond_14

    .line 525
    .line 526
    move v6, v5

    .line 527
    goto :goto_9

    .line 528
    :cond_14
    iget v6, v6, Lm60;->ε:I

    .line 529
    .line 530
    :goto_9
    if-eqz v6, :cond_16

    .line 531
    .line 532
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    const-string v6, "getPopExitAnim="

    .line 536
    .line 537
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget-object v6, v4, Ln60;->Ν:Lm60;

    .line 541
    .line 542
    if-nez v6, :cond_15

    .line 543
    .line 544
    move v6, v5

    .line 545
    goto :goto_a

    .line 546
    :cond_15
    iget v6, v6, Lm60;->ε:I

    .line 547
    .line 548
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 549
    .line 550
    .line 551
    :cond_16
    iget-object v6, v4, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 552
    .line 553
    if-eqz v6, :cond_17

    .line 554
    .line 555
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    const-string v6, "mContainer="

    .line 559
    .line 560
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    iget-object v6, v4, Ln60;->Κ:Landroid/view/ViewGroup;

    .line 564
    .line 565
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    :cond_17
    iget-object v6, v4, Ln60;->ψ:Lp60;

    .line 569
    .line 570
    if-nez v6, :cond_18

    .line 571
    .line 572
    move-object v6, v7

    .line 573
    goto :goto_b

    .line 574
    :cond_18
    iget-object v6, v6, Lp60;->χ:Landroidx/fragment/app/FragmentActivity;

    .line 575
    .line 576
    :goto_b
    if-eqz v6, :cond_1c

    .line 577
    .line 578
    invoke-interface {v4}, Lr92;->γ()Lq92;

    .line 579
    .line 580
    .line 581
    move-result-object v6

    .line 582
    sget-object v8, Lvu0;->γ:Ld70;

    .line 583
    .line 584
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    sget-object v9, Lgq;->β:Lgq;

    .line 588
    .line 589
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    new-instance v10, Li0;

    .line 593
    .line 594
    invoke-direct {v10, v6, v8, v9}, Li0;-><init>(Lq92;Lp92;Lhq;)V

    .line 595
    .line 596
    .line 597
    const-class v6, Lvu0;

    .line 598
    .line 599
    invoke-static {v6}, Lvm1;->α(Ljava/lang/Class;)Lwf;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    invoke-virtual {v6}, Lwf;->β()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v8

    .line 607
    if-eqz v8, :cond_1b

    .line 608
    .line 609
    const-string v9, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 610
    .line 611
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v8

    .line 615
    invoke-virtual {v10, v6, v8}, Li0;->ψ(Lwf;Ljava/lang/String;)Lm92;

    .line 616
    .line 617
    .line 618
    move-result-object v6

    .line 619
    check-cast v6, Lvu0;

    .line 620
    .line 621
    iget-object v6, v6, Lvu0;->β:Lkz1;

    .line 622
    .line 623
    iget v8, v6, Lkz1;->η:I

    .line 624
    .line 625
    if-lez v8, :cond_1c

    .line 626
    .line 627
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    const-string v8, "Loaders:"

    .line 631
    .line 632
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    iget v8, v6, Lkz1;->η:I

    .line 636
    .line 637
    if-gtz v8, :cond_19

    .line 638
    .line 639
    goto :goto_c

    .line 640
    :cond_19
    invoke-virtual {v6, v5}, Lkz1;->δ(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    if-eqz p0, :cond_1a

    .line 645
    .line 646
    invoke-static {}, Lγ;->β()V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :cond_1a
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    const-string p0, "  #"

    .line 654
    .line 655
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    iget-object p0, v6, Lkz1;->ε:[I

    .line 659
    .line 660
    aget p0, p0, v5

    .line 661
    .line 662
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 663
    .line 664
    .line 665
    const-string p0, ": "

    .line 666
    .line 667
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    throw v7

    .line 671
    :cond_1b
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 672
    .line 673
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :cond_1c
    :goto_c
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    new-instance v6, Ljava/lang/StringBuilder;

    .line 681
    .line 682
    const-string v7, "Child "

    .line 683
    .line 684
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    iget-object v7, v4, Ln60;->ω:Lb70;

    .line 688
    .line 689
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    const-string v7, ":"

    .line 693
    .line 694
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v6

    .line 701
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 702
    .line 703
    .line 704
    iget-object v4, v4, Ln60;->ω:Lb70;

    .line 705
    .line 706
    const-string v6, "  "

    .line 707
    .line 708
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    invoke-virtual {v4, v6, p2, p3, p4}, Lb70;->φ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    goto/16 :goto_0

    .line 716
    .line 717
    :cond_1d
    const-string v4, "null"

    .line 718
    .line 719
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    goto/16 :goto_0

    .line 723
    .line 724
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 725
    .line 726
    .line 727
    move-result p2

    .line 728
    if-lez p2, :cond_1f

    .line 729
    .line 730
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    const-string p4, "Added Fragments:"

    .line 734
    .line 735
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    move p4, v5

    .line 739
    :goto_d
    if-ge p4, p2, :cond_1f

    .line 740
    .line 741
    invoke-virtual {v2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    check-cast v1, Ln60;

    .line 746
    .line 747
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    const-string v3, "  #"

    .line 751
    .line 752
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 756
    .line 757
    .line 758
    const-string v3, ": "

    .line 759
    .line 760
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1}, Ln60;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    add-int/lit8 p4, p4, 0x1

    .line 771
    .line 772
    goto :goto_d

    .line 773
    :cond_1f
    iget-object p2, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 774
    .line 775
    if-eqz p2, :cond_20

    .line 776
    .line 777
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 778
    .line 779
    .line 780
    move-result p2

    .line 781
    if-lez p2, :cond_20

    .line 782
    .line 783
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    const-string p4, "Fragments Created Menus:"

    .line 787
    .line 788
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    move p4, v5

    .line 792
    :goto_e
    if-ge p4, p2, :cond_20

    .line 793
    .line 794
    iget-object v1, p0, Lb70;->ε:Ljava/util/ArrayList;

    .line 795
    .line 796
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    check-cast v1, Ln60;

    .line 801
    .line 802
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    const-string v2, "  #"

    .line 806
    .line 807
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 811
    .line 812
    .line 813
    const-string v2, ": "

    .line 814
    .line 815
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v1}, Ln60;->toString()Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 823
    .line 824
    .line 825
    add-int/lit8 p4, p4, 0x1

    .line 826
    .line 827
    goto :goto_e

    .line 828
    :cond_20
    iget-object p2, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 829
    .line 830
    if-eqz p2, :cond_21

    .line 831
    .line 832
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 833
    .line 834
    .line 835
    move-result p2

    .line 836
    if-lez p2, :cond_21

    .line 837
    .line 838
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    const-string p4, "Back Stack:"

    .line 842
    .line 843
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    move p4, v5

    .line 847
    :goto_f
    if-ge p4, p2, :cond_21

    .line 848
    .line 849
    iget-object v1, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 850
    .line 851
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    check-cast v1, Lk8;

    .line 856
    .line 857
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    const-string v2, "  #"

    .line 861
    .line 862
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 866
    .line 867
    .line 868
    const-string v2, ": "

    .line 869
    .line 870
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v1}, Lk8;->toString()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v2

    .line 877
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    const/4 v2, 0x1

    .line 881
    invoke-virtual {v1, v0, p3, v2}, Lk8;->δ(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 882
    .line 883
    .line 884
    add-int/lit8 p4, p4, 0x1

    .line 885
    .line 886
    goto :goto_f

    .line 887
    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    new-instance p2, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    const-string p4, "Back Stack Index: "

    .line 893
    .line 894
    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    iget-object p4, p0, Lb70;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 898
    .line 899
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 900
    .line 901
    .line 902
    move-result p4

    .line 903
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object p2

    .line 910
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    iget-object p2, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 914
    .line 915
    monitor-enter p2

    .line 916
    :try_start_0
    iget-object p4, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 917
    .line 918
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 919
    .line 920
    .line 921
    move-result p4

    .line 922
    if-lez p4, :cond_22

    .line 923
    .line 924
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    const-string v0, "Pending Actions:"

    .line 928
    .line 929
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    :goto_10
    if-ge v5, p4, :cond_22

    .line 933
    .line 934
    iget-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 935
    .line 936
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    check-cast v0, Lz60;

    .line 941
    .line 942
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    const-string v1, "  #"

    .line 946
    .line 947
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 951
    .line 952
    .line 953
    const-string v1, ": "

    .line 954
    .line 955
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    add-int/lit8 v5, v5, 0x1

    .line 962
    .line 963
    goto :goto_10

    .line 964
    :catchall_0
    move-exception p0

    .line 965
    goto :goto_11

    .line 966
    :cond_22
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 967
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    const-string p2, "FragmentManager misc state:"

    .line 971
    .line 972
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    const-string p2, "  mHost="

    .line 979
    .line 980
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    iget-object p2, p0, Lb70;->υ:Lp60;

    .line 984
    .line 985
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 989
    .line 990
    .line 991
    const-string p2, "  mContainer="

    .line 992
    .line 993
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    iget-object p2, p0, Lb70;->φ:Lxb;

    .line 997
    .line 998
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 999
    .line 1000
    .line 1001
    iget-object p2, p0, Lb70;->χ:Ln60;

    .line 1002
    .line 1003
    if-eqz p2, :cond_23

    .line 1004
    .line 1005
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1006
    .line 1007
    .line 1008
    const-string p2, "  mParent="

    .line 1009
    .line 1010
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object p2, p0, Lb70;->χ:Ln60;

    .line 1014
    .line 1015
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    :cond_23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    const-string p2, "  mCurState="

    .line 1022
    .line 1023
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1024
    .line 1025
    .line 1026
    iget p2, p0, Lb70;->τ:I

    .line 1027
    .line 1028
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 1029
    .line 1030
    .line 1031
    const-string p2, " mStateSaved="

    .line 1032
    .line 1033
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1034
    .line 1035
    .line 1036
    iget-boolean p2, p0, Lb70;->Η:Z

    .line 1037
    .line 1038
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1039
    .line 1040
    .line 1041
    const-string p2, " mStopped="

    .line 1042
    .line 1043
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    iget-boolean p2, p0, Lb70;->Θ:Z

    .line 1047
    .line 1048
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1049
    .line 1050
    .line 1051
    const-string p2, " mDestroyed="

    .line 1052
    .line 1053
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    iget-boolean p2, p0, Lb70;->Ι:Z

    .line 1057
    .line 1058
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1059
    .line 1060
    .line 1061
    iget-boolean p2, p0, Lb70;->Ζ:Z

    .line 1062
    .line 1063
    if-eqz p2, :cond_24

    .line 1064
    .line 1065
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    const-string p1, "  mNeedMenuInvalidate="

    .line 1069
    .line 1070
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    iget-boolean p0, p0, Lb70;->Ζ:Z

    .line 1074
    .line 1075
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->println(Z)V

    .line 1076
    .line 1077
    .line 1078
    :cond_24
    return-void

    .line 1079
    :goto_11
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1080
    throw p0
.end method

.method public final χ(Lz60;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Lb70;->Ι:Z

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "FragmentManager has been destroyed"

    .line 12
    .line 13
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 18
    .line 19
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-boolean v0, p0, Lb70;->Η:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-boolean v0, p0, Lb70;->Θ:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 33
    .line 34
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    :goto_0
    iget-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_0
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 42
    .line 43
    if-nez v1, :cond_5

    .line 44
    .line 45
    if-eqz p2, :cond_4

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "Activity has been destroyed"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_5
    iget-object p2, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lb70;->Φ()V

    .line 65
    .line 66
    .line 67
    monitor-exit v0

    .line 68
    return-void

    .line 69
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    throw p0
.end method

.method public final ψ(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lb70;->β:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Lb70;->Ι:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const-string p0, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "FragmentManager has not been attached to a host."

    .line 20
    .line 21
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 30
    .line 31
    iget-object v1, v1, Lp60;->ψ:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-ne v0, v1, :cond_5

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-boolean p1, p0, Lb70;->Η:Z

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-boolean p1, p0, Lb70;->Θ:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const-string p0, "Can not perform this action after onSaveInstanceState"

    .line 51
    .line 52
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    :goto_0
    iget-object p1, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 73
    .line 74
    :cond_4
    return-void

    .line 75
    :cond_5
    const-string p0, "Must be called from main thread of fragment host"

    .line 76
    .line 77
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_6
    const-string p0, "FragmentManager is already executing transactions"

    .line 82
    .line 83
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final ω(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, Lb70;->ψ(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_4

    .line 26
    :cond_0
    :try_start_1
    iget-object v4, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    move v5, p1

    .line 33
    move v6, v5

    .line 34
    :goto_1
    iget-object v7, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 35
    .line 36
    if-ge v5, v4, :cond_1

    .line 37
    .line 38
    :try_start_2
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lz60;

    .line 43
    .line 44
    invoke-interface {v7, v1, v2}, Lz60;->α(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 45
    .line 46
    .line 47
    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    or-int/2addr v6, v7

    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :try_start_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lb70;->υ:Lp60;

    .line 58
    .line 59
    iget-object v1, v1, Lp60;->ψ:Landroid/os/Handler;

    .line 60
    .line 61
    iget-object v2, p0, Lb70;->Ο:Ld1;

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    :goto_2
    if-eqz v6, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    iput-boolean v0, p0, Lb70;->β:Z

    .line 71
    .line 72
    :try_start_4
    iget-object v1, p0, Lb70;->Λ:Ljava/util/ArrayList;

    .line 73
    .line 74
    iget-object v2, p0, Lb70;->Μ:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p0, v1, v2}, Lb70;->Σ(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lb70;->δ()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_2
    move-exception p1

    .line 84
    invoke-virtual {p0}, Lb70;->δ()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-virtual {p0}, Lb70;->д()V

    .line 89
    .line 90
    .line 91
    iget-boolean v1, p0, Lb70;->Κ:Z

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    iput-boolean p1, p0, Lb70;->Κ:Z

    .line 96
    .line 97
    invoke-virtual {p0}, Lb70;->в()V

    .line 98
    .line 99
    .line 100
    :cond_3
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 101
    .line 102
    iget-object p0, p0, Li0;->η:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p0, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/4 p1, 0x0

    .line 111
    invoke-static {p1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 116
    .line 117
    .line 118
    return v0

    .line 119
    :goto_3
    :try_start_5
    iget-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 125
    .line 126
    iget-object v0, v0, Lp60;->ψ:Landroid/os/Handler;

    .line 127
    .line 128
    iget-object p0, p0, Lb70;->Ο:Ld1;

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :goto_4
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 135
    throw p0
.end method

.method public final а(Ln60;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lb70;->Γ(Ln60;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_7

    .line 6
    .line 7
    iget-object v0, p1, Ln60;->Ν:Lm60;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    move v2, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v2, v0, Lm60;->β:I

    .line 15
    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    move v3, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v3, v0, Lm60;->γ:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v3, v2

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move v2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v2, v0, Lm60;->δ:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v2, v3

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v0, v0, Lm60;->ε:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v0, v2

    .line 37
    if-lez v0, :cond_7

    .line 38
    .line 39
    const v0, 0x7f09038a

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_4

    .line 47
    .line 48
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Ln60;

    .line 56
    .line 57
    iget-object p1, p1, Ln60;->Ν:Lm60;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v1, p1, Lm60;->α:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, p0, Ln60;->Ν:Lm60;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {p0}, Ln60;->ε()Lm60;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iput-boolean v1, p0, Lm60;->α:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final в()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb70;->γ:Li0;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0;->υ()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Li70;

    .line 22
    .line 23
    iget-object v2, v1, Li70;->γ:Ln60;

    .line 24
    .line 25
    iget-boolean v3, v2, Ln60;->Λ:Z

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-boolean v3, p0, Lb70;->β:Z

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    iput-boolean v1, p0, Lb70;->Κ:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x0

    .line 38
    iput-boolean v3, v2, Ln60;->Λ:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Li70;->κ()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method public final г(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljv0;

    .line 16
    .line 17
    invoke-direct {v0}, Ljv0;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lb70;->υ:Lp60;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array p0, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, p0}, Landroidx/fragment/app/FragmentActivity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, Lb70;->φ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception p0

    .line 55
    invoke-static {v1, v3, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
.end method

.method public final д()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb70;->α:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lb70;->θ:Lu60;

    .line 14
    .line 15
    iput-boolean v2, p0, Lu60;->α:Z

    .line 16
    .line 17
    iget-object p0, p0, Lu60;->γ:Lp80;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Lb70;->θ:Lu60;

    .line 30
    .line 31
    iget-object v1, p0, Lb70;->δ:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_0
    if-lez v1, :cond_3

    .line 43
    .line 44
    iget-object p0, p0, Lb70;->χ:Ln60;

    .line 45
    .line 46
    invoke-static {p0}, Lb70;->Λ(Ln60;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    iput-boolean v2, v0, Lu60;->α:Z

    .line 55
    .line 56
    iget-object p0, v0, Lu60;->γ:Lp80;

    .line 57
    .line 58
    if-eqz p0, :cond_4

    .line 59
    .line 60
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p0
.end method
