.class public final Ld90;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ι:Ljava/lang/ThreadLocal;

.field public static final κ:Lqt;


# instance fields
.field public final ε:Ljava/util/ArrayList;

.field public ζ:J

.field public η:J

.field public final θ:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld90;->ι:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    new-instance v0, Lqt;

    .line 9
    .line 10
    const/16 v1, 0x13

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lqt;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ld90;->κ:Lqt;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

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
    iput-object v0, p0, Ld90;->ε:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ld90;->θ:Ljava/util/ArrayList;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Ld90;->ε:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    :try_start_0
    const-string v3, "RV Prefetch"

    .line 6
    .line 7
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    :goto_0
    iput-wide v1, p0, Ld90;->ζ:J

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    move-wide v5, v1

    .line 28
    :goto_1
    if-ge v4, v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    cmp-long v0, v5, v1

    .line 57
    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    iget-wide v5, p0, Ld90;->η:J

    .line 68
    .line 69
    add-long/2addr v3, v5

    .line 70
    invoke-virtual {p0, v3, v4}, Ld90;->β(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_3
    iput-wide v1, p0, Ld90;->ζ:J

    .line 75
    .line 76
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    throw v0
.end method

.method public final α(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/RecyclerView;->τ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->р:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ld90;->ε:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "attempting to post unregistered view!"

    .line 19
    .line 20
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    :goto_0
    iget-wide v0, p0, Ld90;->ζ:J

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, Ld90;->ζ:J

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p0, p1, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 42
    .line 43
    iput p2, p0, Lb90;->α:I

    .line 44
    .line 45
    iput p3, p0, Lb90;->β:I

    .line 46
    .line 47
    return-void
.end method

.method public final β(J)V
    .locals 7

    .line 1
    iget-object v0, p0, Ld90;->ε:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v5}, Landroid/view/View;->getWindowVisibility()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 23
    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iput v2, v5, Lb90;->γ:I

    .line 27
    .line 28
    iget v5, v5, Lb90;->γ:I

    .line 29
    .line 30
    add-int/2addr v4, v5

    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p0, p0, Ld90;->θ:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 37
    .line 38
    .line 39
    move v3, v2

    .line 40
    :goto_1
    if-ge v3, v1, :cond_5

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getWindowVisibility()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->г:Lb90;

    .line 56
    .line 57
    iget v5, v4, Lb90;->α:I

    .line 58
    .line 59
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 60
    .line 61
    .line 62
    iget v5, v4, Lb90;->β:I

    .line 63
    .line 64
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 65
    .line 66
    .line 67
    iget v4, v4, Lb90;->γ:I

    .line 68
    .line 69
    mul-int/lit8 v4, v4, 0x2

    .line 70
    .line 71
    if-lez v4, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-gtz p1, :cond_3

    .line 78
    .line 79
    new-instance p1, Lc90;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Lc90;

    .line 93
    .line 94
    :goto_2
    const/4 p0, 0x0

    .line 95
    throw p0

    .line 96
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    sget-object v0, Ld90;->κ:Lqt;

    .line 100
    .line 101
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-lez v0, :cond_a

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lc90;

    .line 115
    .line 116
    iget-object v0, p0, Lc90;->δ:Landroidx/recyclerview/widget/RecyclerView;

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_6
    iget-boolean v1, p0, Lc90;->α:Z

    .line 122
    .line 123
    const-wide v3, 0x7fffffffffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    if-eqz v1, :cond_7

    .line 129
    .line 130
    move-wide p1, v3

    .line 131
    :cond_7
    iget p0, p0, Lc90;->ε:I

    .line 132
    .line 133
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 134
    .line 135
    invoke-virtual {v1}, Lm6;->Θ()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    const/4 v5, 0x0

    .line 140
    if-gtz v1, :cond_9

    .line 141
    .line 142
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 143
    .line 144
    cmp-long p1, p1, v3

    .line 145
    .line 146
    if-nez p1, :cond_8

    .line 147
    .line 148
    :try_start_0
    invoke-static {}, Landroid/os/Trace;->isEnabled()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_8

    .line 153
    .line 154
    const-string p1, "RV Prefetch forced - needed next frame"

    .line 155
    .line 156
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :catchall_0
    move-exception p0

    .line 161
    goto :goto_5

    .line 162
    :cond_8
    :goto_4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->φ()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, p0}, Lfm1;->ε(I)V

    .line 166
    .line 167
    .line 168
    throw v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    :goto_5
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->χ(Z)V

    .line 170
    .line 171
    .line 172
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 173
    .line 174
    .line 175
    throw p0

    .line 176
    :cond_9
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->ι:Lm6;

    .line 177
    .line 178
    invoke-virtual {p0, v2}, Lm6;->Η(I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, Landroidx/recyclerview/widget/RecyclerView;->σ(Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    throw v5

    .line 186
    :cond_a
    :goto_6
    return-void
.end method
