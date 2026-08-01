.class public final Lfm1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/util/ArrayList;

.field public final β:Ljava/util/ArrayList;

.field public γ:I

.field public δ:I

.field public ε:Lem1;

.field public final synthetic ζ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfm1;->ζ:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lfm1;->α:Ljava/util/ArrayList;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lfm1;->β:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    iput p1, p0, Lfm1;->γ:I

    .line 25
    .line 26
    iput p1, p0, Lfm1;->δ:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final α()Lem1;
    .locals 2

    .line 1
    iget-object v0, p0, Lfm1;->ε:Lem1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lem1;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lem1;->α:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lem1;->β:I

    .line 19
    .line 20
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lem1;->γ:Ljava/util/Set;

    .line 30
    .line 31
    iput-object v0, p0, Lfm1;->ε:Lem1;

    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lfm1;->ε:Lem1;

    .line 34
    .line 35
    return-object p0
.end method

.method public final β(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lfm1;->ε:Lem1;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lem1;->α:Landroid/util/SparseArray;

    .line 6
    .line 7
    iget-object p0, p0, Lem1;->γ:Ljava/util/Set;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-gtz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Ldm1;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    :cond_1
    :goto_0
    return-void
.end method

.method public final γ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lfm1;->β:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    if-gez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->ф:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lfm1;->ζ:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lb90;->γ:I

    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0, v1}, Lfm1;->δ(I)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method

.method public final δ(I)V
    .locals 3

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->с:Z

    .line 2
    .line 3
    const-string v1, "RecyclerView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Recycling cached view at index "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p0, p0, Lfm1;->β:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-nez p0, :cond_2

    .line 31
    .line 32
    sget-boolean p0, Landroidx/recyclerview/widget/RecyclerView;->с:Z

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    const-string p0, "CachedViewHolder to be recycled: null"

    .line 37
    .line 38
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :cond_2
    new-instance p0, Ljava/lang/ClassCastException;

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public final ε(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Lfm1;->ζ:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 4
    .line 5
    if-ltz p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {v1}, Lkm1;->α()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge p1, v2, :cond_4

    .line 12
    .line 13
    iget-boolean v2, v1, Lkm1;->δ:Z

    .line 14
    .line 15
    iget-object v2, p0, Lfm1;->α:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/4 v4, 0x0

    .line 22
    if-gtz v3, :cond_3

    .line 23
    .line 24
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 25
    .line 26
    iget-object v2, v2, Lm6;->θ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v5, 0x0

    .line 35
    if-gtz v3, :cond_2

    .line 36
    .line 37
    iget-object p0, p0, Lfm1;->β:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-gtz v2, :cond_1

    .line 44
    .line 45
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 46
    .line 47
    invoke-virtual {p0, p1, v4}, Lm6;->σ(II)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-ltz p0, :cond_0

    .line 52
    .line 53
    throw v5

    .line 54
    :cond_0
    new-instance v2, Ljava/lang/IndexOutOfBoundsException;

    .line 55
    .line 56
    const-string v3, "(offset:"

    .line 57
    .line 58
    const-string v4, ").state:"

    .line 59
    .line 60
    const-string v5, "Inconsistency detected. Invalid item position "

    .line 61
    .line 62
    invoke-static {v5, p1, v3, p0, v4}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v1}, Lkm1;->α()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v2, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_1
    invoke-static {v4, p0}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    throw p0

    .line 93
    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Landroid/view/View;

    .line 98
    .line 99
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    throw v5

    .line 103
    :cond_3
    invoke-static {v4, v2}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    throw p0

    .line 108
    :cond_4
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 109
    .line 110
    const-string v2, "("

    .line 111
    .line 112
    const-string v3, "). Item count:"

    .line 113
    .line 114
    const-string v4, "Invalid item position "

    .line 115
    .line 116
    invoke-static {v4, p1, v2, p1, v3}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {v1}, Lkm1;->α()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0
.end method

.method public final ζ()V
    .locals 3

    .line 1
    iget v0, p0, Lfm1;->γ:I

    .line 2
    .line 3
    iput v0, p0, Lfm1;->δ:I

    .line 4
    .line 5
    iget-object v0, p0, Lfm1;->β:Ljava/util/ArrayList;

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
    if-ltz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v2, p0, Lfm1;->δ:I

    .line 20
    .line 21
    if-gt v0, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, v1}, Lfm1;->δ(I)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0

    .line 29
    :cond_1
    :goto_0
    return-void
.end method
