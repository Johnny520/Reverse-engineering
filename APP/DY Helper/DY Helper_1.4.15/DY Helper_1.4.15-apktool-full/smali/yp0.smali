.class public final Lyp0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfn;
.implements Lx81;
.implements Lln;


# static fields
.field public static final Υ:Lvo1;

.field public static final Φ:Ltp0;

.field public static final Χ:Lo9;


# instance fields
.field public Α:Z

.field public Β:Lpx0;

.field public Γ:Lyr;

.field public Δ:Lnp0;

.field public Ε:Lg92;

.field public Ζ:Lco;

.field public Η:Lwp0;

.field public Θ:Lwp0;

.field public Ι:Z

.field public final Κ:Lk31;

.field public final Λ:Lbq0;

.field public Μ:Lkq0;

.field public Ν:Lq31;

.field public Ξ:Z

.field public Ο:Lr01;

.field public Π:Lr01;

.field public Ρ:Z

.field public Σ:I

.field public Τ:Z

.field public final ε:Z

.field public ζ:I

.field public η:Z

.field public θ:J

.field public ι:Z

.field public κ:Z

.field public λ:Z

.field public μ:Lyp0;

.field public ν:I

.field public final ξ:Ln5;

.field public ο:Lk21;

.field public π:Z

.field public ρ:Lyp0;

.field public σ:Landroidx/compose/ui/platform/AndroidComposeView;

.field public τ:I

.field public υ:Z

.field public φ:Z

.field public χ:Lxr1;

.field public ψ:Z

.field public final ω:Lk21;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvo1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvo1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyp0;->Υ:Lvo1;

    .line 8
    .line 9
    new-instance v0, Ltp0;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyp0;->Φ:Ltp0;

    .line 15
    .line 16
    new-instance v0, Lo9;

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-direct {v0, v1}, Lo9;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lyp0;->Χ:Lo9;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move p1, v0

    .line 108
    :goto_0
    sget-object v1, Lyr1;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    .line 109
    invoke-direct {p0, v0, p1}, Lyp0;-><init>(IZ)V

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lyp0;->ε:Z

    .line 5
    .line 6
    iput p1, p0, Lyp0;->ζ:I

    .line 7
    .line 8
    const-wide p1, 0x7fffffff7fffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide p1, p0, Lyp0;->θ:J

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lyp0;->ι:Z

    .line 17
    .line 18
    iput-boolean p1, p0, Lyp0;->κ:Z

    .line 19
    .line 20
    new-instance p2, Ln5;

    .line 21
    .line 22
    new-instance v0, Lk21;

    .line 23
    .line 24
    const/16 v1, 0x10

    .line 25
    .line 26
    new-array v2, v1, [Lyp0;

    .line 27
    .line 28
    invoke-direct {v0, v2}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lk1;

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    invoke-direct {v2, v3, p0}, Lk1;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/16 v3, 0x15

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-direct {p2, v3, v0, v2, v4}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lyp0;->ξ:Ln5;

    .line 44
    .line 45
    new-instance p2, Lk21;

    .line 46
    .line 47
    new-array v0, v1, [Lyp0;

    .line 48
    .line 49
    invoke-direct {p2, v0}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lyp0;->ω:Lk21;

    .line 53
    .line 54
    iput-boolean p1, p0, Lyp0;->Α:Z

    .line 55
    .line 56
    sget-object p2, Lyp0;->Υ:Lvo1;

    .line 57
    .line 58
    iput-object p2, p0, Lyp0;->Β:Lpx0;

    .line 59
    .line 60
    sget-object p2, Lln0;->γ:Lzr;

    .line 61
    .line 62
    iput-object p2, p0, Lyp0;->Γ:Lyr;

    .line 63
    .line 64
    sget-object p2, Lnp0;->ε:Lnp0;

    .line 65
    .line 66
    iput-object p2, p0, Lyp0;->Δ:Lnp0;

    .line 67
    .line 68
    sget-object p2, Lyp0;->Φ:Ltp0;

    .line 69
    .line 70
    iput-object p2, p0, Lyp0;->Ε:Lg92;

    .line 71
    .line 72
    sget-object p2, Lco;->γ:Lbo;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object p2, Lbo;->β:Landroidx/compose/runtime/internal/α;

    .line 78
    .line 79
    iput-object p2, p0, Lyp0;->Ζ:Lco;

    .line 80
    .line 81
    sget-object p2, Lwp0;->η:Lwp0;

    .line 82
    .line 83
    iput-object p2, p0, Lyp0;->Η:Lwp0;

    .line 84
    .line 85
    iput-object p2, p0, Lyp0;->Θ:Lwp0;

    .line 86
    .line 87
    new-instance p2, Lk31;

    .line 88
    .line 89
    invoke-direct {p2, p0}, Lk31;-><init>(Lyp0;)V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lyp0;->Κ:Lk31;

    .line 93
    .line 94
    new-instance p2, Lbq0;

    .line 95
    .line 96
    invoke-direct {p2, p0}, Lbq0;-><init>(Lyp0;)V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Lyp0;->Λ:Lbq0;

    .line 100
    .line 101
    iput-boolean p1, p0, Lyp0;->Ξ:Z

    .line 102
    .line 103
    sget-object p1, Lp01;->α:Lp01;

    .line 104
    .line 105
    iput-object p1, p0, Lyp0;->Ο:Lr01;

    .line 106
    .line 107
    return-void
.end method

.method public static Ξ(Lyp0;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object v0, v0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget-boolean v1, v0, Lox0;->ξ:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v0, v0, Lch1;->θ:J

    .line 10
    .line 11
    new-instance v2, Lyo;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, Lyo;-><init>(J)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lyp0;->Η:Lwp0;

    .line 21
    .line 22
    sget-object v1, Lwp0;->η:Lwp0;

    .line 23
    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Lyp0;->γ()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 30
    .line 31
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 32
    .line 33
    iget-wide v0, v2, Lyo;->α:J

    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Lox0;->ю(J)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    :goto_1
    return p0
.end method

.method public static Σ(Lyp0;ZI)V
    .locals 3

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p2, p2, 0x4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    move v1, v0

    .line 13
    :cond_1
    iget-object p2, p0, Lyp0;->μ:Lyp0;

    .line 14
    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const-string p2, "Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope"

    .line 19
    .line 20
    invoke-static {p2}, Lam0;->β(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object p2, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 24
    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_3
    iget-boolean v2, p0, Lyp0;->υ:Z

    .line 29
    .line 30
    if-nez v2, :cond_a

    .line 31
    .line 32
    iget-boolean v2, p0, Lyp0;->ε:Z

    .line 33
    .line 34
    if-nez v2, :cond_a

    .line 35
    .line 36
    invoke-virtual {p2, p0, v0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ψ(Lyp0;ZZ)V

    .line 37
    .line 38
    .line 39
    if-eqz v1, :cond_a

    .line 40
    .line 41
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 42
    .line 43
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Ljw0;->κ:Lbq0;

    .line 49
    .line 50
    iget-object p2, p0, Lbq0;->α:Lyp0;

    .line 51
    .line 52
    invoke-virtual {p2}, Lyp0;->σ()Lyp0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 57
    .line 58
    iget-object p0, p0, Lyp0;->Η:Lwp0;

    .line 59
    .line 60
    if-eqz p2, :cond_a

    .line 61
    .line 62
    sget-object v1, Lwp0;->η:Lwp0;

    .line 63
    .line 64
    if-eq p0, v1, :cond_a

    .line 65
    .line 66
    :goto_1
    iget-object v1, p2, Lyp0;->Η:Lwp0;

    .line 67
    .line 68
    if-ne v1, p0, :cond_5

    .line 69
    .line 70
    invoke-virtual {p2}, Lyp0;->σ()Lyp0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-nez v1, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object p2, v1

    .line 78
    goto :goto_1

    .line 79
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_8

    .line 84
    .line 85
    if-ne p0, v0, :cond_7

    .line 86
    .line 87
    iget-object p0, p2, Lyp0;->μ:Lyp0;

    .line 88
    .line 89
    if-eqz p0, :cond_6

    .line 90
    .line 91
    invoke-virtual {p2, p1}, Lyp0;->Ρ(Z)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    invoke-virtual {p2, p1}, Lyp0;->Τ(Z)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_7
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 100
    .line 101
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_8
    iget-object p0, p2, Lyp0;->μ:Lyp0;

    .line 106
    .line 107
    const/4 v0, 0x6

    .line 108
    if-eqz p0, :cond_9

    .line 109
    .line 110
    invoke-static {p2, p1, v0}, Lyp0;->Σ(Lyp0;ZI)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_9
    invoke-static {p2, p1, v0}, Lyp0;->Υ(Lyp0;ZI)V

    .line 115
    .line 116
    .line 117
    :cond_a
    :goto_3
    return-void
.end method

.method public static Υ(Lyp0;ZI)V
    .locals 3

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p1, v1

    .line 7
    :cond_0
    and-int/lit8 p2, p2, 0x4

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    move p2, v0

    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move p2, v1

    .line 15
    :goto_0
    iget-boolean v2, p0, Lyp0;->υ:Z

    .line 16
    .line 17
    if-nez v2, :cond_7

    .line 18
    .line 19
    iget-boolean v2, p0, Lyp0;->ε:Z

    .line 20
    .line 21
    if-nez v2, :cond_7

    .line 22
    .line 23
    iget-object v2, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_2
    invoke-virtual {v2, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ψ(Lyp0;ZZ)V

    .line 29
    .line 30
    .line 31
    if-eqz p2, :cond_7

    .line 32
    .line 33
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 34
    .line 35
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 36
    .line 37
    iget-object p0, p0, Lox0;->κ:Lbq0;

    .line 38
    .line 39
    iget-object p2, p0, Lbq0;->α:Lyp0;

    .line 40
    .line 41
    invoke-virtual {p2}, Lyp0;->σ()Lyp0;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iget-object p0, p0, Lbq0;->α:Lyp0;

    .line 46
    .line 47
    iget-object p0, p0, Lyp0;->Η:Lwp0;

    .line 48
    .line 49
    if-eqz p2, :cond_7

    .line 50
    .line 51
    sget-object v1, Lwp0;->η:Lwp0;

    .line 52
    .line 53
    if-eq p0, v1, :cond_7

    .line 54
    .line 55
    :goto_1
    iget-object v1, p2, Lyp0;->Η:Lwp0;

    .line 56
    .line 57
    if-ne v1, p0, :cond_4

    .line 58
    .line 59
    invoke-virtual {p2}, Lyp0;->σ()Lyp0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-nez v1, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object p2, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_6

    .line 73
    .line 74
    if-ne p0, v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p2, p1}, Lyp0;->Τ(Z)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    const-string p0, "Intrinsics isn\'t used by the parent"

    .line 81
    .line 82
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    const/4 p0, 0x6

    .line 87
    invoke-static {p2, p1, p0}, Lyp0;->Υ(Lyp0;ZI)V

    .line 88
    .line 89
    .line 90
    :cond_7
    :goto_3
    return-void
.end method

.method public static Φ(Lyp0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object v0, v0, Lbq0;->δ:Lup0;

    .line 4
    .line 5
    sget-object v1, Lxp0;->α:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    iget-object v1, p0, Lyp0;->Λ:Lbq0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v0, v2, :cond_4

    .line 17
    .line 18
    iget-boolean v0, v1, Lbq0;->ε:Z

    .line 19
    .line 20
    const/4 v3, 0x6

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, v2, v3}, Lyp0;->Σ(Lyp0;ZI)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-boolean v0, v1, Lbq0;->ζ:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lyp0;->Ρ(Z)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lyp0;->ο()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-static {p0, v2, v3}, Lyp0;->Υ(Lyp0;ZI)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {p0}, Lyp0;->ξ()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Lyp0;->Τ(Z)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void

    .line 54
    :cond_4
    const-string p0, "Unexpected state "

    .line 55
    .line 56
    iget-object v0, v1, Lbq0;->δ:Lup0;

    .line 57
    .line 58
    invoke-static {v0, p0}, Lγ;->σ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private final κ(Lyp0;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Cannot insert "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " because it already has a parent or an owner. This tree: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v1}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " Other tree: "

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object p0, p1, Lyp0;->ρ:Lyp0;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lkn0;->Π(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " children: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lyp0;->μ()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lh21;

    .line 23
    .line 24
    iget-object v1, v1, Lh21;->ε:Lk21;

    .line 25
    .line 26
    iget v1, v1, Lk21;->η:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, " measurePolicy: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lyp0;->Β:Lpx0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, " deactivated: "

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-boolean p0, p0, Lyp0;->Τ:Z

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final Α(ILyp0;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lyp0;->ρ:Lyp0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p2, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-direct {p0, p2}, Lyp0;->κ(Lyp0;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iput-object p0, p2, Lyp0;->ρ:Lyp0;

    .line 18
    .line 19
    iget-object v0, p0, Lyp0;->ξ:Ln5;

    .line 20
    .line 21
    iget-object v1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lk21;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lk21;->α(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, Ln5;->η:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lk1;

    .line 31
    .line 32
    invoke-virtual {p1}, Lk1;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lyp0;->Ν()V

    .line 36
    .line 37
    .line 38
    iget-boolean p1, p2, Lyp0;->ε:Z

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lyp0;->ν:I

    .line 43
    .line 44
    add-int/lit8 p1, p1, 0x1

    .line 45
    .line 46
    iput p1, p0, Lyp0;->ν:I

    .line 47
    .line 48
    :cond_2
    invoke-virtual {p0}, Lyp0;->Ζ()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lyp0;->β(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object p1, p2, Lyp0;->Λ:Lbq0;

    .line 59
    .line 60
    iget p1, p1, Lbq0;->μ:I

    .line 61
    .line 62
    if-lez p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Lyp0;->Λ:Lbq0;

    .line 65
    .line 66
    iget v0, p1, Lbq0;->μ:I

    .line 67
    .line 68
    add-int/lit8 v0, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lbq0;->δ(I)V

    .line 71
    .line 72
    .line 73
    :cond_4
    iget p1, p2, Lyp0;->Σ:I

    .line 74
    .line 75
    if-lez p1, :cond_5

    .line 76
    .line 77
    iget p1, p0, Lyp0;->Σ:I

    .line 78
    .line 79
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lyp0;->а(I)V

    .line 82
    .line 83
    .line 84
    :cond_5
    return-void
.end method

.method public final Β()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyp0;->Ξ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 6
    .line 7
    iget-object v1, v0, Lk31;->γ:Lgm0;

    .line 8
    .line 9
    iget-object v0, v0, Lk31;->δ:Lq31;

    .line 10
    .line 11
    iget-object v0, v0, Lq31;->υ:Lq31;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lyp0;->Ν:Lq31;

    .line 15
    .line 16
    :goto_0
    invoke-static {v1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v3, v1, Lq31;->Ρ:Lw81;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    :goto_1
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iput-object v1, p0, Lyp0;->Ν:Lq31;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v1, Lq31;->υ:Lq31;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, Lyp0;->Ξ:Z

    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, Lyp0;->Ν:Lq31;

    .line 44
    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    iget-object v1, v0, Lq31;->Ρ:Lw81;

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_5
    const-string p0, "layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?"

    .line 53
    .line 54
    invoke-static {p0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    throw p0

    .line 59
    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    .line 60
    .line 61
    invoke-virtual {v0}, Lq31;->Я()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_7
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_8

    .line 70
    .line 71
    invoke-virtual {v0}, Lyp0;->Β()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_8
    iget-object p0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 76
    .line 77
    if-eqz p0, :cond_9

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 80
    .line 81
    .line 82
    :cond_9
    return-void
.end method

.method public final Γ()V
    .locals 3

    .line 1
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 2
    .line 3
    iget-object v0, p0, Lk31;->δ:Lq31;

    .line 4
    .line 5
    iget-object v1, p0, Lk31;->γ:Lgm0;

    .line 6
    .line 7
    :goto_0
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast v0, Lsp0;

    .line 13
    .line 14
    iget-object v2, v0, Lq31;->Ρ:Lw81;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v2}, Lw81;->invalidate()V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, v0, Lq31;->τ:Lq31;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object p0, p0, Lk31;->γ:Lgm0;

    .line 25
    .line 26
    iget-object p0, p0, Lq31;->Ρ:Lw81;

    .line 27
    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    invoke-interface {p0}, Lw81;->invalidate()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method

.method public final Δ()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyp0;->Δ()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    iget-object v0, p0, Lyp0;->μ:Lyp0;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0, v2, v1}, Lyp0;->Σ(Lyp0;ZI)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    invoke-static {p0, v2, v1}, Lyp0;->Υ(Lyp0;ZI)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final Ε()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyp0;->ψ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 7
    .line 8
    iget-object v0, v0, Lk31;->β:Lj31;

    .line 9
    .line 10
    iget-object v0, v0, Lq01;->κ:Lq01;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Lyp0;->Π:Lr01;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :goto_0
    iput-boolean v1, p0, Lyp0;->φ:Z

    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    iget-object v0, p0, Lyp0;->χ:Lxr1;

    .line 24
    .line 25
    iput-boolean v1, p0, Lyp0;->ψ:Z

    .line 26
    .line 27
    new-instance v1, Lum1;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v2, Lxr1;

    .line 33
    .line 34
    invoke-direct {v2}, Lxr1;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {p0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()Ly81;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Ly0;

    .line 48
    .line 49
    const/4 v4, 0x5

    .line 50
    invoke-direct {v3, p0, v4, v1}, Ly0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v2, Ly81;->δ:La1;

    .line 54
    .line 55
    iget-object v2, v2, Ly81;->α:Lkx1;

    .line 56
    .line 57
    invoke-virtual {v2, p0, v4, v3}, Lkx1;->β(Ljava/lang/Object;La80;Lp70;)V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    iput-boolean v2, p0, Lyp0;->ψ:Z

    .line 62
    .line 63
    iget-object v1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lxr1;

    .line 66
    .line 67
    iput-object v1, p0, Lyp0;->χ:Lxr1;

    .line 68
    .line 69
    iput-boolean v2, p0, Lyp0;->φ:Z

    .line 70
    .line 71
    invoke-static {p0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2, p0, v0}, Les1;->β(Lyp0;Lxr1;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->Α()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final Ζ()V
    .locals 1

    .line 1
    iget v0, p0, Lyp0;->ν:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lyp0;->π:Z

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lyp0;->ρ:Lyp0;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Lyp0;->Ζ()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final Η()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final Θ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget-boolean p0, p0, Lox0;->φ:Z

    .line 6
    .line 7
    return p0
.end method

.method public final Ι()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ljw0;->υ:Lhw0;

    .line 8
    .line 9
    sget-object v0, Lhw0;->η:Lhw0;

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public final Κ(III)V
    .locals 6

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    if-ge v0, p3, :cond_3

    .line 6
    .line 7
    if-le p1, p2, :cond_1

    .line 8
    .line 9
    add-int v1, p1, v0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v1, p1

    .line 13
    :goto_1
    if-le p1, p2, :cond_2

    .line 14
    .line 15
    add-int v2, p2, v0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_2
    add-int v2, p2, p3

    .line 19
    .line 20
    add-int/lit8 v2, v2, -0x2

    .line 21
    .line 22
    :goto_2
    iget-object v3, p0, Lyp0;->ξ:Ln5;

    .line 23
    .line 24
    iget-object v4, v3, Ln5;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, Lk21;

    .line 27
    .line 28
    iget-object v5, v3, Ln5;->η:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Lk1;

    .line 31
    .line 32
    invoke-virtual {v4, v1}, Lk21;->λ(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v5}, Lk1;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    check-cast v1, Lyp0;

    .line 40
    .line 41
    iget-object v3, v3, Ln5;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Lk21;

    .line 44
    .line 45
    invoke-virtual {v3, v2, v1}, Lk21;->α(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Lk1;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-virtual {p0}, Lyp0;->Ν()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lyp0;->Ζ()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lyp0;->Δ()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final Λ(Lyp0;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget v0, v0, Lbq0;->μ:I

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 8
    .line 9
    iget v1, v0, Lbq0;->μ:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lbq0;->δ(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lyp0;->η()V

    .line 21
    .line 22
    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Lyp0;->ρ:Lyp0;

    .line 25
    .line 26
    iget v1, p1, Lyp0;->Σ:I

    .line 27
    .line 28
    if-lez v1, :cond_2

    .line 29
    .line 30
    iget v1, p0, Lyp0;->Σ:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lyp0;->а(I)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p1, Lyp0;->Κ:Lk31;

    .line 38
    .line 39
    iget-object v1, v1, Lk31;->δ:Lq31;

    .line 40
    .line 41
    iput-object v0, v1, Lq31;->υ:Lq31;

    .line 42
    .line 43
    iget-boolean v1, p1, Lyp0;->ε:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget v1, p0, Lyp0;->ν:I

    .line 48
    .line 49
    add-int/lit8 v1, v1, -0x1

    .line 50
    .line 51
    iput v1, p0, Lyp0;->ν:I

    .line 52
    .line 53
    iget-object p1, p1, Lyp0;->ξ:Ln5;

    .line 54
    .line 55
    iget-object p1, p1, Ln5;->ζ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lk21;

    .line 58
    .line 59
    iget-object v1, p1, Lk21;->ε:[Ljava/lang/Object;

    .line 60
    .line 61
    iget p1, p1, Lk21;->η:I

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    :goto_0
    if-ge v2, p1, :cond_3

    .line 65
    .line 66
    aget-object v3, v1, v2

    .line 67
    .line 68
    check-cast v3, Lyp0;

    .line 69
    .line 70
    iget-object v3, v3, Lyp0;->Κ:Lk31;

    .line 71
    .line 72
    iget-object v3, v3, Lk31;->δ:Lq31;

    .line 73
    .line 74
    iput-object v0, v3, Lq31;->υ:Lq31;

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {p0}, Lyp0;->Ζ()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lyp0;->Ν()V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final Μ(Lq31;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lyp0;->Λ:Lbq0;

    .line 12
    .line 13
    iget-object v2, v1, Lbq0;->δ:Lup0;

    .line 14
    .line 15
    sget-object v3, Lup0;->ι:Lup0;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    if-ne v2, v3, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Lyp0;->ο()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lyp0;->ξ()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v2, v4

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    :goto_1
    move v2, v5

    .line 37
    :goto_2
    iget-boolean v3, p0, Lyp0;->λ:Z

    .line 38
    .line 39
    if-eqz v3, :cond_8

    .line 40
    .line 41
    if-eqz v0, :cond_8

    .line 42
    .line 43
    iget-object v3, p0, Lyp0;->Κ:Lk31;

    .line 44
    .line 45
    iget-object v3, v3, Lk31;->δ:Lq31;

    .line 46
    .line 47
    if-ne p1, v3, :cond_3

    .line 48
    .line 49
    iput-boolean v5, p0, Lyp0;->κ:Z

    .line 50
    .line 51
    if-nez v2, :cond_8

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lol1;->ε(Lyp0;)V

    .line 54
    .line 55
    .line 56
    goto :goto_6

    .line 57
    :cond_3
    iput-boolean v5, p0, Lyp0;->ι:Z

    .line 58
    .line 59
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v3, p1, Lk21;->ε:[Ljava/lang/Object;

    .line 64
    .line 65
    iget p1, p1, Lk21;->η:I

    .line 66
    .line 67
    move v6, v4

    .line 68
    :goto_3
    if-ge v6, p1, :cond_5

    .line 69
    .line 70
    aget-object v7, v3, v6

    .line 71
    .line 72
    check-cast v7, Lyp0;

    .line 73
    .line 74
    iput-boolean v5, v7, Lyp0;->κ:Z

    .line 75
    .line 76
    if-nez v2, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0, v7}, Lol1;->ε(Lyp0;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    iget-boolean p1, p0, Lyp0;->λ:Z

    .line 85
    .line 86
    if-eqz p1, :cond_7

    .line 87
    .line 88
    iput-boolean v5, v0, Lol1;->ε:Z

    .line 89
    .line 90
    iget-object p1, v0, Lol1;->β:Ln2;

    .line 91
    .line 92
    iget p0, p0, Lyp0;->ζ:I

    .line 93
    .line 94
    const v2, 0x1ffffff

    .line 95
    .line 96
    .line 97
    and-int/2addr p0, v2

    .line 98
    iget-object v3, p1, Ln2;->γ:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v3, [J

    .line 101
    .line 102
    iget p1, p1, Ln2;->β:I

    .line 103
    .line 104
    :goto_4
    array-length v5, v3

    .line 105
    add-int/lit8 v5, v5, -0x2

    .line 106
    .line 107
    if-ge v4, v5, :cond_7

    .line 108
    .line 109
    if-ge v4, p1, :cond_7

    .line 110
    .line 111
    add-int/lit8 v5, v4, 0x2

    .line 112
    .line 113
    aget-wide v6, v3, v5

    .line 114
    .line 115
    long-to-int v8, v6

    .line 116
    and-int/2addr v8, v2

    .line 117
    if-ne v8, p0, :cond_6

    .line 118
    .line 119
    const/16 p0, 0x3f

    .line 120
    .line 121
    shr-long p0, v6, p0

    .line 122
    .line 123
    const-wide/16 v8, 0x1

    .line 124
    .line 125
    and-long/2addr p0, v8

    .line 126
    const/16 v2, 0x3c

    .line 127
    .line 128
    shl-long/2addr p0, v2

    .line 129
    or-long/2addr p0, v6

    .line 130
    aput-wide p0, v3, v5

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_6
    add-int/lit8 v4, v4, 0x3

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_7
    :goto_5
    invoke-virtual {v0}, Lol1;->θ()V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_6
    iget-object p0, v1, Lbq0;->π:Lox0;

    .line 140
    .line 141
    invoke-virtual {p0}, Lox0;->я()V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final Ν()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lyp0;->Ν()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lyp0;->Α:Z

    .line 17
    .line 18
    return-void
.end method

.method public final Ο()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyp0;->ξ:Ln5;

    .line 2
    .line 3
    iget-object v1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lk21;

    .line 6
    .line 7
    iget v1, v1, Lk21;->η:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    :goto_0
    iget-object v2, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lk21;

    .line 14
    .line 15
    const/4 v3, -0x1

    .line 16
    if-ge v3, v1, :cond_0

    .line 17
    .line 18
    iget-object v2, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, Lyp0;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lyp0;->Λ(Lyp0;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Lk21;->η()V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, Ln5;->η:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lk1;

    .line 36
    .line 37
    invoke-virtual {p0}, Lk1;->invoke()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final Π(II)V
    .locals 2

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v1, "count ("

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ") must be greater than 0"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    add-int/2addr p2, p1

    .line 27
    add-int/lit8 p2, p2, -0x1

    .line 28
    .line 29
    if-gt p1, p2, :cond_1

    .line 30
    .line 31
    :goto_1
    iget-object v0, p0, Lyp0;->ξ:Ln5;

    .line 32
    .line 33
    iget-object v1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Lk21;

    .line 36
    .line 37
    iget-object v1, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 38
    .line 39
    aget-object v1, v1, p2

    .line 40
    .line 41
    check-cast v1, Lyp0;

    .line 42
    .line 43
    invoke-virtual {p0, v1}, Lyp0;->Λ(Lyp0;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, v0, Ln5;->ζ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Lk21;

    .line 49
    .line 50
    invoke-virtual {v1, p2}, Lk21;->λ(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lk1;

    .line 57
    .line 58
    invoke-virtual {v0}, Lk1;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    check-cast v1, Lyp0;

    .line 62
    .line 63
    if-eq p2, p1, :cond_1

    .line 64
    .line 65
    add-int/lit8 p2, p2, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    return-void
.end method

.method public final Ρ(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ω(Lyp0;ZZ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final Τ(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p0, v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->ω(Lyp0;ZZ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final Χ()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 6
    .line 7
    iget p0, p0, Lk21;->η:I

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    if-ge v1, p0, :cond_1

    .line 11
    .line 12
    aget-object v2, v0, v1

    .line 13
    .line 14
    check-cast v2, Lyp0;

    .line 15
    .line 16
    iget-object v3, v2, Lyp0;->Θ:Lwp0;

    .line 17
    .line 18
    iput-object v3, v2, Lyp0;->Η:Lwp0;

    .line 19
    .line 20
    sget-object v4, Lwp0;->η:Lwp0;

    .line 21
    .line 22
    if-eq v3, v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v2}, Lyp0;->Χ()V

    .line 25
    .line 26
    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final Ψ(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyp0;->Ζ:Lco;

    .line 2
    .line 3
    sget-object v1, Lyn;->α:Lm02;

    .line 4
    .line 5
    check-cast v0, Landroidx/compose/runtime/internal/α;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lbd;->Ξ(Landroidx/compose/runtime/internal/α;Lak1;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lxn;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, Lp3;

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-direct {v1, v0, v2, p0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, Ljx0;->д(Ljava/lang/Throwable;Lp70;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    throw p1
.end method

.method public final Ω(Lyr;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lyp0;->Γ:Lyr;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, Lyp0;->Γ:Lyr;

    .line 10
    .line 11
    invoke-virtual {p0}, Lyp0;->Δ()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lyp0;->Β()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p1, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lyp0;->Γ()V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 35
    .line 36
    iget-object p0, p0, Lk31;->ζ:Lq01;

    .line 37
    .line 38
    :goto_1
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-interface {p0}, Lur;->ζ()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    return-void
.end method

.method public final α(Lr01;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lyp0;->Κ:Lk31;

    .line 6
    .line 7
    const/16 v7, 0x10

    .line 8
    .line 9
    invoke-virtual {v2, v7}, Lk31;->δ(I)Z

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget-object v9, v2, Lk31;->ε:Lq22;

    .line 14
    .line 15
    const/16 v10, 0x400

    .line 16
    .line 17
    invoke-virtual {v2, v10}, Lk31;->δ(I)Z

    .line 18
    .line 19
    .line 20
    move-result v11

    .line 21
    iput-object v1, v0, Lyp0;->Ο:Lr01;

    .line 22
    .line 23
    iget-object v3, v2, Lk31;->γ:Lgm0;

    .line 24
    .line 25
    iget-object v4, v2, Lk31;->α:Lyp0;

    .line 26
    .line 27
    iget-object v5, v2, Lk31;->ζ:Lq01;

    .line 28
    .line 29
    iget-object v12, v2, Lk31;->β:Lj31;

    .line 30
    .line 31
    if-eq v5, v12, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string v5, "padChain called on already padded chain"

    .line 35
    .line 36
    invoke-static {v5}, Lam0;->β(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v5, v2, Lk31;->ζ:Lq01;

    .line 40
    .line 41
    iput-object v12, v5, Lq01;->ι:Lq01;

    .line 42
    .line 43
    iput-object v5, v12, Lq01;->κ:Lq01;

    .line 44
    .line 45
    move-object v5, v3

    .line 46
    iget-object v3, v2, Lk31;->η:Lk21;

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget v6, v3, Lk21;->η:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v6, 0x0

    .line 54
    :goto_1
    iget-object v14, v2, Lk31;->θ:Lk21;

    .line 55
    .line 56
    if-nez v14, :cond_2

    .line 57
    .line 58
    new-instance v14, Lk21;

    .line 59
    .line 60
    new-array v15, v7, [Lv01;

    .line 61
    .line 62
    invoke-direct {v14, v15}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-object v15, v2, Lk31;->ι:Lk21;

    .line 66
    .line 67
    invoke-virtual {v15, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    :goto_2
    iget v1, v15, Lk21;->η:I

    .line 73
    .line 74
    if-eqz v1, :cond_6

    .line 75
    .line 76
    add-int/lit8 v1, v1, -0x1

    .line 77
    .line 78
    invoke-virtual {v15, v1}, Lk21;->λ(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lr01;

    .line 83
    .line 84
    instance-of v13, v1, Lvi;

    .line 85
    .line 86
    if-eqz v13, :cond_3

    .line 87
    .line 88
    check-cast v1, Lvi;

    .line 89
    .line 90
    iget-object v13, v1, Lvi;->β:Lr01;

    .line 91
    .line 92
    invoke-virtual {v15, v13}, Lk21;->β(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, Lvi;->α:Lr01;

    .line 96
    .line 97
    invoke-virtual {v15, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    instance-of v13, v1, Lv01;

    .line 102
    .line 103
    if-eqz v13, :cond_4

    .line 104
    .line 105
    invoke-virtual {v14, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    if-nez v16, :cond_5

    .line 110
    .line 111
    new-instance v13, Lb0;

    .line 112
    .line 113
    const/16 v10, 0xd

    .line 114
    .line 115
    invoke-direct {v13, v10, v14}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object/from16 v16, v13

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    move-object/from16 v13, v16

    .line 122
    .line 123
    :goto_3
    invoke-interface {v1, v13}, Lr01;->γ(La80;)Z

    .line 124
    .line 125
    .line 126
    :goto_4
    const/16 v10, 0x400

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_6
    iget v1, v14, Lk21;->η:I

    .line 130
    .line 131
    const-string v13, "expected prior modifier list to be non-empty"

    .line 132
    .line 133
    if-ne v1, v6, :cond_11

    .line 134
    .line 135
    iget-object v1, v12, Lq01;->κ:Lq01;

    .line 136
    .line 137
    move-object v5, v2

    .line 138
    const/4 v2, 0x0

    .line 139
    :goto_5
    if-eqz v1, :cond_c

    .line 140
    .line 141
    if-ge v2, v6, :cond_c

    .line 142
    .line 143
    if-eqz v3, :cond_b

    .line 144
    .line 145
    const/16 v16, 0x2

    .line 146
    .line 147
    iget-object v10, v3, Lk21;->ε:[Ljava/lang/Object;

    .line 148
    .line 149
    aget-object v10, v10, v2

    .line 150
    .line 151
    check-cast v10, Lv01;

    .line 152
    .line 153
    iget-object v7, v14, Lk21;->ε:[Ljava/lang/Object;

    .line 154
    .line 155
    aget-object v7, v7, v2

    .line 156
    .line 157
    check-cast v7, Lv01;

    .line 158
    .line 159
    invoke-static {v10, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v17

    .line 163
    if-eqz v17, :cond_7

    .line 164
    .line 165
    move-object/from16 v18, v3

    .line 166
    .line 167
    move/from16 v3, v16

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    move-object/from16 v18, v3

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-ne v15, v3, :cond_8

    .line 181
    .line 182
    const/4 v3, 0x1

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    const/4 v3, 0x0

    .line 185
    :goto_6
    if-eqz v3, :cond_a

    .line 186
    .line 187
    const/4 v15, 0x1

    .line 188
    if-eq v3, v15, :cond_9

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    invoke-static {v10, v7, v1}, Lk31;->θ(Lv01;Lv01;Lq01;)V

    .line 192
    .line 193
    .line 194
    :goto_7
    iget-object v1, v1, Lq01;->κ:Lq01;

    .line 195
    .line 196
    add-int/lit8 v2, v2, 0x1

    .line 197
    .line 198
    move-object/from16 v3, v18

    .line 199
    .line 200
    const/16 v7, 0x10

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_a
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_b
    invoke-static {v13}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    throw v0

    .line 211
    :cond_c
    move-object/from16 v18, v3

    .line 212
    .line 213
    const/16 v16, 0x2

    .line 214
    .line 215
    :goto_8
    if-ge v2, v6, :cond_10

    .line 216
    .line 217
    if-eqz v18, :cond_f

    .line 218
    .line 219
    if-eqz v1, :cond_e

    .line 220
    .line 221
    iget-object v3, v4, Lyp0;->Π:Lr01;

    .line 222
    .line 223
    if-eqz v3, :cond_d

    .line 224
    .line 225
    const/16 v17, 0x1

    .line 226
    .line 227
    :goto_9
    const/4 v15, 0x1

    .line 228
    goto :goto_a

    .line 229
    :cond_d
    const/16 v17, 0x0

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :goto_a
    xor-int/lit8 v6, v17, 0x1

    .line 233
    .line 234
    move-object v3, v5

    .line 235
    move-object v5, v1

    .line 236
    move-object v1, v3

    .line 237
    move-object v4, v14

    .line 238
    move-object/from16 v3, v18

    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    invoke-virtual/range {v1 .. v6}, Lk31;->ζ(ILk21;Lk21;Lq01;Z)V

    .line 242
    .line 243
    .line 244
    move-object v5, v12

    .line 245
    :goto_b
    const/4 v15, 0x1

    .line 246
    goto/16 :goto_13

    .line 247
    .line 248
    :cond_e
    const-string v0, "structuralUpdate requires a non-null tail"

    .line 249
    .line 250
    invoke-static {v0}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    throw v0

    .line 255
    :cond_f
    invoke-static {v13}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    throw v0

    .line 260
    :cond_10
    move-object v2, v5

    .line 261
    move-object/from16 v3, v18

    .line 262
    .line 263
    const/4 v7, 0x0

    .line 264
    goto :goto_10

    .line 265
    :cond_11
    const/4 v7, 0x0

    .line 266
    const/16 v16, 0x2

    .line 267
    .line 268
    iget-object v10, v4, Lyp0;->Π:Lr01;

    .line 269
    .line 270
    if-eqz v10, :cond_14

    .line 271
    .line 272
    if-nez v6, :cond_14

    .line 273
    .line 274
    move-object v4, v12

    .line 275
    const/4 v1, 0x0

    .line 276
    :goto_c
    iget v5, v14, Lk21;->η:I

    .line 277
    .line 278
    if-ge v1, v5, :cond_12

    .line 279
    .line 280
    iget-object v5, v14, Lk21;->ε:[Ljava/lang/Object;

    .line 281
    .line 282
    aget-object v5, v5, v1

    .line 283
    .line 284
    check-cast v5, Lv01;

    .line 285
    .line 286
    invoke-static {v5, v4}, Lk31;->β(Lv01;Lq01;)Lq01;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    goto :goto_c

    .line 293
    :cond_12
    iget-object v1, v9, Lq01;->ι:Lq01;

    .line 294
    .line 295
    const/4 v4, 0x0

    .line 296
    :goto_d
    if-eqz v1, :cond_13

    .line 297
    .line 298
    if-eq v1, v12, :cond_13

    .line 299
    .line 300
    iget v5, v1, Lq01;->η:I

    .line 301
    .line 302
    or-int/2addr v4, v5

    .line 303
    iput v4, v1, Lq01;->θ:I

    .line 304
    .line 305
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 306
    .line 307
    goto :goto_d

    .line 308
    :cond_13
    move-object v1, v2

    .line 309
    move-object v5, v12

    .line 310
    move-object v4, v14

    .line 311
    goto :goto_b

    .line 312
    :cond_14
    if-nez v1, :cond_18

    .line 313
    .line 314
    if-eqz v3, :cond_17

    .line 315
    .line 316
    iget-object v1, v12, Lq01;->κ:Lq01;

    .line 317
    .line 318
    const/4 v6, 0x0

    .line 319
    :goto_e
    if-eqz v1, :cond_15

    .line 320
    .line 321
    iget v10, v3, Lk21;->η:I

    .line 322
    .line 323
    if-ge v6, v10, :cond_15

    .line 324
    .line 325
    invoke-static {v1}, Lk31;->γ(Lq01;)Lq01;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v1, v1, Lq01;->κ:Lq01;

    .line 330
    .line 331
    add-int/lit8 v6, v6, 0x1

    .line 332
    .line 333
    goto :goto_e

    .line 334
    :cond_15
    invoke-virtual {v4}, Lyp0;->σ()Lyp0;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    if-eqz v1, :cond_16

    .line 339
    .line 340
    iget-object v1, v1, Lyp0;->Κ:Lk31;

    .line 341
    .line 342
    iget-object v1, v1, Lk31;->γ:Lgm0;

    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_16
    move-object v1, v7

    .line 346
    :goto_f
    iput-object v1, v5, Lq31;->υ:Lq31;

    .line 347
    .line 348
    iput-object v5, v2, Lk31;->δ:Lq31;

    .line 349
    .line 350
    :goto_10
    move-object v1, v2

    .line 351
    move-object v5, v12

    .line 352
    move-object v4, v14

    .line 353
    const/4 v15, 0x0

    .line 354
    goto :goto_13

    .line 355
    :cond_17
    invoke-static {v13}, Llz1;->ε(Ljava/lang/String;)Lpm;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    throw v0

    .line 360
    :cond_18
    if-nez v3, :cond_19

    .line 361
    .line 362
    new-instance v3, Lk21;

    .line 363
    .line 364
    const/16 v1, 0x10

    .line 365
    .line 366
    new-array v4, v1, [Lv01;

    .line 367
    .line 368
    invoke-direct {v3, v4}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_19
    if-eqz v10, :cond_1a

    .line 372
    .line 373
    const/4 v15, 0x1

    .line 374
    :goto_11
    const/16 v17, 0x1

    .line 375
    .line 376
    goto :goto_12

    .line 377
    :cond_1a
    const/4 v15, 0x0

    .line 378
    goto :goto_11

    .line 379
    :goto_12
    xor-int/lit8 v6, v15, 0x1

    .line 380
    .line 381
    move-object v1, v2

    .line 382
    const/4 v2, 0x0

    .line 383
    move-object v5, v12

    .line 384
    move-object v4, v14

    .line 385
    invoke-virtual/range {v1 .. v6}, Lk31;->ζ(ILk21;Lk21;Lq01;Z)V

    .line 386
    .line 387
    .line 388
    move/from16 v15, v17

    .line 389
    .line 390
    :goto_13
    iput-object v4, v1, Lk31;->η:Lk21;

    .line 391
    .line 392
    if-eqz v3, :cond_1b

    .line 393
    .line 394
    invoke-virtual {v3}, Lk21;->η()V

    .line 395
    .line 396
    .line 397
    goto :goto_14

    .line 398
    :cond_1b
    move-object v3, v7

    .line 399
    :goto_14
    iput-object v3, v1, Lk31;->θ:Lk21;

    .line 400
    .line 401
    iget-object v2, v5, Lq01;->κ:Lq01;

    .line 402
    .line 403
    if-nez v2, :cond_1c

    .line 404
    .line 405
    goto :goto_15

    .line 406
    :cond_1c
    move-object v9, v2

    .line 407
    :goto_15
    iput-object v7, v9, Lq01;->ι:Lq01;

    .line 408
    .line 409
    iput-object v7, v5, Lq01;->κ:Lq01;

    .line 410
    .line 411
    const/4 v2, -0x1

    .line 412
    iput v2, v5, Lq01;->θ:I

    .line 413
    .line 414
    iput-object v7, v5, Lq01;->μ:Lq31;

    .line 415
    .line 416
    if-eq v9, v5, :cond_1d

    .line 417
    .line 418
    goto :goto_16

    .line 419
    :cond_1d
    const-string v2, "trimChain did not update the head"

    .line 420
    .line 421
    invoke-static {v2}, Lam0;->β(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    :goto_16
    iput-object v9, v1, Lk31;->ζ:Lq01;

    .line 425
    .line 426
    if-eqz v15, :cond_1e

    .line 427
    .line 428
    invoke-virtual {v1}, Lk31;->η()V

    .line 429
    .line 430
    .line 431
    :cond_1e
    const/16 v2, 0x10

    .line 432
    .line 433
    invoke-virtual {v1, v2}, Lk31;->δ(I)Z

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    const/16 v3, 0x400

    .line 438
    .line 439
    invoke-virtual {v1, v3}, Lk31;->δ(I)Z

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    iget-object v4, v0, Lyp0;->Λ:Lbq0;

    .line 444
    .line 445
    invoke-virtual {v4}, Lbq0;->κ()V

    .line 446
    .line 447
    .line 448
    iget-object v4, v0, Lyp0;->μ:Lyp0;

    .line 449
    .line 450
    if-nez v4, :cond_1f

    .line 451
    .line 452
    const/16 v4, 0x200

    .line 453
    .line 454
    invoke-virtual {v1, v4}, Lk31;->δ(I)Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-eqz v1, :cond_1f

    .line 459
    .line 460
    invoke-virtual {v0, v0}, Lyp0;->б(Lyp0;)V

    .line 461
    .line 462
    .line 463
    :cond_1f
    if-ne v8, v2, :cond_20

    .line 464
    .line 465
    if-eq v11, v3, :cond_22

    .line 466
    .line 467
    :cond_20
    invoke-static {v0}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    invoke-virtual {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, Lyp0;->Η()Z

    .line 479
    .line 480
    .line 481
    move-result v4

    .line 482
    if-eqz v4, :cond_22

    .line 483
    .line 484
    iget-object v1, v1, Lol1;->β:Ln2;

    .line 485
    .line 486
    iget v0, v0, Lyp0;->ζ:I

    .line 487
    .line 488
    const v4, 0x1ffffff

    .line 489
    .line 490
    .line 491
    and-int/2addr v0, v4

    .line 492
    iget-object v5, v1, Ln2;->γ:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v5, [J

    .line 495
    .line 496
    iget v1, v1, Ln2;->β:I

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    :goto_17
    array-length v6, v5

    .line 500
    add-int/lit8 v6, v6, -0x2

    .line 501
    .line 502
    if-ge v13, v6, :cond_22

    .line 503
    .line 504
    if-ge v13, v1, :cond_22

    .line 505
    .line 506
    add-int/lit8 v6, v13, 0x2

    .line 507
    .line 508
    aget-wide v7, v5, v6

    .line 509
    .line 510
    long-to-int v9, v7

    .line 511
    and-int/2addr v9, v4

    .line 512
    if-ne v9, v0, :cond_21

    .line 513
    .line 514
    const-wide v0, -0x6000000000000001L

    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    and-long/2addr v0, v7

    .line 520
    const-wide/high16 v7, 0x2000000000000000L

    .line 521
    .line 522
    int-to-long v3, v3

    .line 523
    mul-long/2addr v3, v7

    .line 524
    or-long/2addr v0, v3

    .line 525
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 526
    .line 527
    int-to-long v7, v2

    .line 528
    mul-long/2addr v7, v3

    .line 529
    or-long/2addr v0, v7

    .line 530
    aput-wide v0, v5, v6

    .line 531
    .line 532
    return-void

    .line 533
    :cond_21
    add-int/lit8 v13, v13, 0x3

    .line 534
    .line 535
    goto :goto_17

    .line 536
    :cond_22
    return-void
.end method

.method public final β(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "Cannot attach "

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " as it already is attached.  Tree: "

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v0, p0, Lyp0;->ρ:Lyp0;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 42
    .line 43
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v3, "Attaching to a different owner("

    .line 53
    .line 54
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v3, ") than the parent\'s owner("

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    iget-object v3, v3, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    move-object v3, v2

    .line 75
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v3, "). This tree: "

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v3, " Parent tree: "

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Lyp0;->ρ:Lyp0;

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    move-object v3, v2

    .line 105
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-static {v0}, Lam0;->β(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v3, p0, Lyp0;->Λ:Lbq0;

    .line 120
    .line 121
    const/4 v4, 0x1

    .line 122
    if-nez v0, :cond_5

    .line 123
    .line 124
    iget-object v5, v3, Lbq0;->π:Lox0;

    .line 125
    .line 126
    iput-boolean v4, v5, Lox0;->φ:Z

    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v5, p0}, Lol1;->ε(Lyp0;)V

    .line 133
    .line 134
    .line 135
    iget-object v5, v3, Lbq0;->ρ:Ljw0;

    .line 136
    .line 137
    if-eqz v5, :cond_5

    .line 138
    .line 139
    sget-object v6, Lhw0;->ε:Lhw0;

    .line 140
    .line 141
    iput-object v6, v5, Ljw0;->υ:Lhw0;

    .line 142
    .line 143
    :cond_5
    iget-object v5, p0, Lyp0;->Κ:Lk31;

    .line 144
    .line 145
    iget-object v6, v5, Lk31;->δ:Lq31;

    .line 146
    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    iget-object v7, v0, Lyp0;->Κ:Lk31;

    .line 150
    .line 151
    iget-object v7, v7, Lk31;->γ:Lgm0;

    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_6
    move-object v7, v2

    .line 155
    :goto_4
    iput-object v7, v6, Lq31;->υ:Lq31;

    .line 156
    .line 157
    iput-object p1, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 158
    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    iget v6, v0, Lyp0;->τ:I

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_7
    const/4 v6, -0x1

    .line 165
    :goto_5
    add-int/2addr v6, v4

    .line 166
    iput v6, p0, Lyp0;->τ:I

    .line 167
    .line 168
    iget-object v6, p0, Lyp0;->Π:Lr01;

    .line 169
    .line 170
    if-eqz v6, :cond_8

    .line 171
    .line 172
    invoke-virtual {p0, v6}, Lyp0;->α(Lr01;)V

    .line 173
    .line 174
    .line 175
    :cond_8
    iput-object v2, p0, Lyp0;->Π:Lr01;

    .line 176
    .line 177
    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    iget v6, p0, Lyp0;->ζ:I

    .line 182
    .line 183
    invoke-virtual {v2, v6, p0}, Ln11;->η(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v2, p0, Lyp0;->ρ:Lyp0;

    .line 187
    .line 188
    if-eqz v2, :cond_9

    .line 189
    .line 190
    iget-object v2, v2, Lyp0;->μ:Lyp0;

    .line 191
    .line 192
    if-nez v2, :cond_a

    .line 193
    .line 194
    :cond_9
    iget-object v2, p0, Lyp0;->μ:Lyp0;

    .line 195
    .line 196
    :cond_a
    invoke-virtual {p0, v2}, Lyp0;->б(Lyp0;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, p0, Lyp0;->μ:Lyp0;

    .line 200
    .line 201
    if-nez v2, :cond_b

    .line 202
    .line 203
    const/16 v2, 0x200

    .line 204
    .line 205
    invoke-virtual {v5, v2}, Lk31;->δ(I)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-eqz v2, :cond_b

    .line 210
    .line 211
    invoke-virtual {p0, p0}, Lyp0;->б(Lyp0;)V

    .line 212
    .line 213
    .line 214
    :cond_b
    iget-boolean v2, p0, Lyp0;->Τ:Z

    .line 215
    .line 216
    if-nez v2, :cond_c

    .line 217
    .line 218
    iget-object v2, v5, Lk31;->ζ:Lq01;

    .line 219
    .line 220
    :goto_6
    if-eqz v2, :cond_c

    .line 221
    .line 222
    invoke-virtual {v2}, Lq01;->х()V

    .line 223
    .line 224
    .line 225
    iget-object v2, v2, Lq01;->κ:Lq01;

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_c
    iget-object v2, p0, Lyp0;->ξ:Ln5;

    .line 229
    .line 230
    iget-object v2, v2, Ln5;->ζ:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, Lk21;

    .line 233
    .line 234
    iget-object v6, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 235
    .line 236
    iget v2, v2, Lk21;->η:I

    .line 237
    .line 238
    :goto_7
    if-ge v1, v2, :cond_d

    .line 239
    .line 240
    aget-object v7, v6, v1

    .line 241
    .line 242
    check-cast v7, Lyp0;

    .line 243
    .line 244
    invoke-virtual {v7, p1}, Lyp0;->β(Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 245
    .line 246
    .line 247
    add-int/lit8 v1, v1, 0x1

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_d
    iget-boolean v1, p0, Lyp0;->Τ:Z

    .line 251
    .line 252
    if-nez v1, :cond_e

    .line 253
    .line 254
    invoke-virtual {v5}, Lk31;->ε()V

    .line 255
    .line 256
    .line 257
    :cond_e
    invoke-virtual {p0}, Lyp0;->Δ()V

    .line 258
    .line 259
    .line 260
    if-eqz v0, :cond_f

    .line 261
    .line 262
    invoke-virtual {v0}, Lyp0;->Δ()V

    .line 263
    .line 264
    .line 265
    :cond_f
    invoke-virtual {v3}, Lbq0;->κ()V

    .line 266
    .line 267
    .line 268
    iget-boolean v0, p0, Lyp0;->Τ:Z

    .line 269
    .line 270
    if-nez v0, :cond_10

    .line 271
    .line 272
    const/16 v0, 0x8

    .line 273
    .line 274
    invoke-virtual {v5, v0}, Lk31;->δ(I)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_10

    .line 279
    .line 280
    invoke-virtual {p0}, Lyp0;->Ε()V

    .line 281
    .line 282
    .line 283
    :cond_10
    iget-object p1, p1, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 284
    .line 285
    if-eqz p1, :cond_11

    .line 286
    .line 287
    invoke-virtual {p0}, Lyp0;->υ()Lxr1;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-eqz v0, :cond_11

    .line 292
    .line 293
    iget-object v0, v0, Lxr1;->ε:Lb21;

    .line 294
    .line 295
    sget-object v1, Lfs1;->ρ:Lis1;

    .line 296
    .line 297
    invoke-virtual {v0, v1}, Lb21;->β(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ne v0, v4, :cond_11

    .line 302
    .line 303
    iget-object v0, p1, Lk0;->λ:Lo11;

    .line 304
    .line 305
    iget v1, p0, Lyp0;->ζ:I

    .line 306
    .line 307
    invoke-virtual {v0, v1}, Lo11;->α(I)Z

    .line 308
    .line 309
    .line 310
    iget-object v0, p1, Lk0;->ε:Ly21;

    .line 311
    .line 312
    iget-object p1, p1, Lk0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 313
    .line 314
    iget p0, p0, Lyp0;->ζ:I

    .line 315
    .line 316
    invoke-virtual {v0, p1, p0, v4}, Ly21;->ο(Landroid/view/View;IZ)V

    .line 317
    .line 318
    .line 319
    :cond_11
    return-void
.end method

.method public final γ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyp0;->Η:Lwp0;

    .line 2
    .line 3
    iput-object v0, p0, Lyp0;->Θ:Lwp0;

    .line 4
    .line 5
    sget-object v0, Lwp0;->η:Lwp0;

    .line 6
    .line 7
    iput-object v0, p0, Lyp0;->Η:Lwp0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v1, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Lk21;->η:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, p0, :cond_1

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    check-cast v3, Lyp0;

    .line 23
    .line 24
    iget-object v4, v3, Lyp0;->Η:Lwp0;

    .line 25
    .line 26
    if-eq v4, v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Lyp0;->γ()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final δ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyp0;->Η:Lwp0;

    .line 2
    .line 3
    iput-object v0, p0, Lyp0;->Θ:Lwp0;

    .line 4
    .line 5
    sget-object v0, Lwp0;->η:Lwp0;

    .line 6
    .line 7
    iput-object v0, p0, Lyp0;->Η:Lwp0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Lk21;->η:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, p0, :cond_1

    .line 19
    .line 20
    aget-object v2, v0, v1

    .line 21
    .line 22
    check-cast v2, Lyp0;

    .line 23
    .line 24
    iget-object v3, v2, Lyp0;->Η:Lwp0;

    .line 25
    .line 26
    sget-object v4, Lwp0;->ζ:Lwp0;

    .line 27
    .line 28
    if-ne v3, v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Lyp0;->δ()V

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final ε()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyp0;->Μ:Lkq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lkq0;->ε()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 9
    .line 10
    iget-object v0, p0, Lk31;->δ:Lq31;

    .line 11
    .line 12
    iget-object p0, p0, Lk31;->γ:Lgm0;

    .line 13
    .line 14
    iget-object p0, p0, Lq31;->τ:Lq31;

    .line 15
    .line 16
    :goto_0
    invoke-static {v0, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, Lq31;->ｆ()V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lq31;->τ:Lq31;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final ζ(I)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, p1, :cond_0

    .line 9
    .line 10
    const-string v3, "  "

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "|-"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lyp0;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v2, 0xa

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v2, p0, Lk21;->ε:[Ljava/lang/Object;

    .line 40
    .line 41
    iget p0, p0, Lk21;->η:I

    .line 42
    .line 43
    move v3, v1

    .line 44
    :goto_1
    if-ge v3, p0, :cond_1

    .line 45
    .line 46
    aget-object v4, v2, v3

    .line 47
    .line 48
    check-cast v4, Lyp0;

    .line 49
    .line 50
    add-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :cond_2
    return-object p0
.end method

.method public final η()V
    .locals 11

    .line 1
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v3, "Cannot detach node that is already detached!  Tree: "

    .line 10
    .line 11
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lyp0;->ζ(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Lam0;->γ(Ljava/lang/String;)Ljava/lang/Void;

    .line 32
    .line 33
    .line 34
    new-instance p0, Lpm;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    iget-object v4, p0, Lyp0;->Λ:Lbq0;

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    invoke-virtual {v3}, Lyp0;->Β()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Lyp0;->Δ()V

    .line 52
    .line 53
    .line 54
    iget-object v3, v4, Lbq0;->π:Lox0;

    .line 55
    .line 56
    sget-object v5, Lwp0;->η:Lwp0;

    .line 57
    .line 58
    iput-object v5, v3, Lox0;->π:Lwp0;

    .line 59
    .line 60
    iget-object v3, v4, Lbq0;->ρ:Ljw0;

    .line 61
    .line 62
    if-eqz v3, :cond_2

    .line 63
    .line 64
    iput-object v5, v3, Ljw0;->ξ:Lwp0;

    .line 65
    .line 66
    :cond_2
    iget-object v3, v4, Lbq0;->π:Lox0;

    .line 67
    .line 68
    iget-object v3, v3, Lox0;->Β:Lzp0;

    .line 69
    .line 70
    const/4 v5, 0x1

    .line 71
    iput-boolean v5, v3, Lzp0;->β:Z

    .line 72
    .line 73
    iput-boolean v2, v3, Lzp0;->γ:Z

    .line 74
    .line 75
    iput-boolean v2, v3, Lzp0;->δ:Z

    .line 76
    .line 77
    iput-boolean v2, v3, Lzp0;->ε:Z

    .line 78
    .line 79
    iput-object v1, v3, Lzp0;->ζ:Lc0;

    .line 80
    .line 81
    iget-object v3, v4, Lbq0;->ρ:Ljw0;

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    iget-object v3, v3, Ljw0;->φ:Lzp0;

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iput-boolean v5, v3, Lzp0;->β:Z

    .line 90
    .line 91
    iput-boolean v2, v3, Lzp0;->γ:Z

    .line 92
    .line 93
    iput-boolean v2, v3, Lzp0;->δ:Z

    .line 94
    .line 95
    iput-boolean v2, v3, Lzp0;->ε:Z

    .line 96
    .line 97
    iput-object v1, v3, Lzp0;->ζ:Lc0;

    .line 98
    .line 99
    :cond_3
    iget-object v3, p0, Lyp0;->Κ:Lk31;

    .line 100
    .line 101
    iget-object v6, v3, Lk31;->δ:Lq31;

    .line 102
    .line 103
    iget-object v7, v3, Lk31;->ε:Lq22;

    .line 104
    .line 105
    iget-object v8, v3, Lk31;->γ:Lgm0;

    .line 106
    .line 107
    iget-object v8, v8, Lq31;->τ:Lq31;

    .line 108
    .line 109
    :goto_0
    invoke-static {v6, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v9, :cond_5

    .line 114
    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    invoke-virtual {v6}, Lq31;->ｌ()V

    .line 118
    .line 119
    .line 120
    iget-object v9, v6, Lq31;->σ:Lyp0;

    .line 121
    .line 122
    invoke-virtual {v9}, Lyp0;->Θ()Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    if-eqz v9, :cond_4

    .line 127
    .line 128
    invoke-virtual {v6}, Lq31;->ｇ()V

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object v6, v6, Lq31;->τ:Lq31;

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    move-object v6, v7

    .line 135
    :goto_1
    if-eqz v6, :cond_7

    .line 136
    .line 137
    iget-boolean v8, v6, Lq01;->σ:Z

    .line 138
    .line 139
    if-eqz v8, :cond_6

    .line 140
    .line 141
    invoke-virtual {v6}, Lq01;->я()V

    .line 142
    .line 143
    .line 144
    :cond_6
    iget-object v6, v6, Lq01;->ι:Lq01;

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    iput-boolean v5, p0, Lyp0;->υ:Z

    .line 148
    .line 149
    iget-object v6, p0, Lyp0;->ξ:Ln5;

    .line 150
    .line 151
    iget-object v6, v6, Ln5;->ζ:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, Lk21;

    .line 154
    .line 155
    iget-object v8, v6, Lk21;->ε:[Ljava/lang/Object;

    .line 156
    .line 157
    iget v6, v6, Lk21;->η:I

    .line 158
    .line 159
    move v9, v2

    .line 160
    :goto_2
    if-ge v9, v6, :cond_8

    .line 161
    .line 162
    aget-object v10, v8, v9

    .line 163
    .line 164
    check-cast v10, Lyp0;

    .line 165
    .line 166
    invoke-virtual {v10}, Lyp0;->η()V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v9, v9, 0x1

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    iput-boolean v2, p0, Lyp0;->υ:Z

    .line 173
    .line 174
    :goto_3
    if-eqz v7, :cond_a

    .line 175
    .line 176
    iget-boolean v6, v7, Lq01;->σ:Z

    .line 177
    .line 178
    if-eqz v6, :cond_9

    .line 179
    .line 180
    invoke-virtual {v7}, Lq01;->ц()V

    .line 181
    .line 182
    .line 183
    :cond_9
    iget-object v7, v7, Lq01;->ι:Lq01;

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    iget v7, p0, Lyp0;->ζ:I

    .line 191
    .line 192
    invoke-virtual {v6, v7}, Ln11;->ζ(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    iget-object v6, v0, Landroidx/compose/ui/platform/AndroidComposeView;->б:Lmx0;

    .line 196
    .line 197
    iget-object v7, v6, Lmx0;->β:Lm6;

    .line 198
    .line 199
    iget-object v8, v7, Lm6;->ζ:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, Ln;

    .line 202
    .line 203
    invoke-virtual {v8, p0}, Ln;->Γ(Lyp0;)Z

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    iget-object v9, v7, Lm6;->η:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v9, Ln;

    .line 210
    .line 211
    invoke-virtual {v9, p0}, Ln;->Γ(Lyp0;)Z

    .line 212
    .line 213
    .line 214
    move-result v9

    .line 215
    iget-object v7, v7, Lm6;->θ:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v7, Ln;

    .line 218
    .line 219
    invoke-virtual {v7, p0}, Ln;->Γ(Lyp0;)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    iget-object v6, v6, Lmx0;->ε:Ln5;

    .line 224
    .line 225
    iget-object v6, v6, Ln5;->ζ:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v6, Lk21;

    .line 228
    .line 229
    invoke-virtual {v6, p0}, Lk21;->κ(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    iput-boolean v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Τ:Z

    .line 233
    .line 234
    iget-object v5, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 235
    .line 236
    if-eqz v5, :cond_b

    .line 237
    .line 238
    iget-object v6, v5, Lk0;->λ:Lo11;

    .line 239
    .line 240
    iget v7, p0, Lyp0;->ζ:I

    .line 241
    .line 242
    invoke-virtual {v6, v7}, Lo11;->ε(I)Z

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    if-eqz v6, :cond_b

    .line 247
    .line 248
    iget-object v6, v5, Lk0;->ε:Ly21;

    .line 249
    .line 250
    iget-object v5, v5, Lk0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 251
    .line 252
    iget v7, p0, Lyp0;->ζ:I

    .line 253
    .line 254
    invoke-virtual {v6, v5, v7, v2}, Ly21;->ο(Landroid/view/View;IZ)V

    .line 255
    .line 256
    .line 257
    :cond_b
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {v5, p0}, Lol1;->ζ(Lyp0;)V

    .line 262
    .line 263
    .line 264
    iput-object v1, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 265
    .line 266
    invoke-virtual {p0, v1}, Lyp0;->б(Lyp0;)V

    .line 267
    .line 268
    .line 269
    iput v2, p0, Lyp0;->τ:I

    .line 270
    .line 271
    iget-object v5, v4, Lbq0;->π:Lox0;

    .line 272
    .line 273
    const v6, 0x7fffffff

    .line 274
    .line 275
    .line 276
    iput v6, v5, Lox0;->ν:I

    .line 277
    .line 278
    iput v6, v5, Lox0;->μ:I

    .line 279
    .line 280
    iput-boolean v2, v5, Lox0;->φ:Z

    .line 281
    .line 282
    iget-object v4, v4, Lbq0;->ρ:Ljw0;

    .line 283
    .line 284
    if-eqz v4, :cond_c

    .line 285
    .line 286
    iput v6, v4, Ljw0;->ν:I

    .line 287
    .line 288
    iput v6, v4, Ljw0;->μ:I

    .line 289
    .line 290
    sget-object v5, Lhw0;->η:Lhw0;

    .line 291
    .line 292
    iput-object v5, v4, Ljw0;->υ:Lhw0;

    .line 293
    .line 294
    :cond_c
    const/16 v4, 0x8

    .line 295
    .line 296
    invoke-virtual {v3, v4}, Lk31;->δ(I)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_d

    .line 301
    .line 302
    iget-object v3, p0, Lyp0;->χ:Lxr1;

    .line 303
    .line 304
    iput-object v1, p0, Lyp0;->χ:Lxr1;

    .line 305
    .line 306
    iput-boolean v2, p0, Lyp0;->φ:Z

    .line 307
    .line 308
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Les1;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v1, p0, v3}, Les1;->β(Lyp0;Lxr1;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->Α()V

    .line 316
    .line 317
    .line 318
    :cond_d
    return-void
.end method

.method public final θ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyp0;->Μ:Lkq0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Lkq0;->δ(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-boolean v1, p0, Lyp0;->Τ:Z

    .line 10
    .line 11
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 12
    .line 13
    iget-object v0, v0, Lk31;->ε:Lq22;

    .line 14
    .line 15
    move-object v1, v0

    .line 16
    :goto_0
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-boolean v2, v1, Lq01;->σ:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1}, Lq01;->э()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    move-object v1, v0

    .line 29
    :goto_1
    if-eqz v1, :cond_4

    .line 30
    .line 31
    iget-boolean v2, v1, Lq01;->σ:Z

    .line 32
    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1}, Lq01;->я()V

    .line 36
    .line 37
    .line 38
    :cond_3
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_4
    :goto_2
    if-eqz v0, :cond_6

    .line 42
    .line 43
    iget-boolean v1, v0, Lq01;->σ:Z

    .line 44
    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    invoke-virtual {v0}, Lq01;->ц()V

    .line 48
    .line 49
    .line 50
    :cond_5
    iget-object v0, v0, Lq01;->ι:Lq01;

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_6
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x0

    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-object v0, p0, Lyp0;->χ:Lxr1;

    .line 62
    .line 63
    iput-boolean v1, p0, Lyp0;->φ:Z

    .line 64
    .line 65
    :cond_7
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 66
    .line 67
    if-eqz v0, :cond_8

    .line 68
    .line 69
    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 70
    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    iget-object v2, v0, Lk0;->λ:Lo11;

    .line 74
    .line 75
    iget v3, p0, Lyp0;->ζ:I

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Lo11;->ε(I)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_8

    .line 82
    .line 83
    iget-object v2, v0, Lk0;->ε:Ly21;

    .line 84
    .line 85
    iget-object v0, v0, Lk0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 86
    .line 87
    iget p0, p0, Lyp0;->ζ:I

    .line 88
    .line 89
    invoke-virtual {v2, v0, p0, v1}, Ly21;->ο(Landroid/view/View;IZ)V

    .line 90
    .line 91
    .line 92
    :cond_8
    return-void
.end method

.method public final ι(Lde;Lwa0;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 2
    .line 3
    iget-object v0, v0, Lk31;->δ:Lq31;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lq31;->О(Lde;Lwa0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p0, p1}, Lyp0;->Ψ(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final λ()Ljava/util/List;
    .locals 9

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Ljw0;->χ:Lk21;

    .line 9
    .line 10
    iget-object v1, p0, Ljw0;->κ:Lbq0;

    .line 11
    .line 12
    iget-object v2, v1, Lbq0;->α:Lyp0;

    .line 13
    .line 14
    invoke-virtual {v2}, Lyp0;->μ()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    iget-boolean v2, p0, Ljw0;->ψ:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lk21;->ζ()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    iget-object v1, v1, Lbq0;->α:Lyp0;

    .line 27
    .line 28
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 33
    .line 34
    iget v2, v2, Lk21;->η:I

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    move v5, v4

    .line 38
    :goto_0
    if-ge v5, v2, :cond_2

    .line 39
    .line 40
    aget-object v6, v3, v5

    .line 41
    .line 42
    check-cast v6, Lyp0;

    .line 43
    .line 44
    iget v7, v0, Lk21;->η:I

    .line 45
    .line 46
    if-gt v7, v5, :cond_1

    .line 47
    .line 48
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 49
    .line 50
    iget-object v6, v6, Lbq0;->ρ:Ljw0;

    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v6}, Lk21;->β(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget-object v6, v6, Lyp0;->Λ:Lbq0;

    .line 60
    .line 61
    iget-object v6, v6, Lbq0;->ρ:Ljw0;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object v7, v0, Lk21;->ε:[Ljava/lang/Object;

    .line 67
    .line 68
    aget-object v8, v7, v5

    .line 69
    .line 70
    aput-object v6, v7, v5

    .line 71
    .line 72
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v1}, Lyp0;->μ()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lh21;

    .line 80
    .line 81
    iget-object v1, v1, Lh21;->ε:Lk21;

    .line 82
    .line 83
    iget v1, v1, Lk21;->η:I

    .line 84
    .line 85
    iget v2, v0, Lk21;->η:I

    .line 86
    .line 87
    invoke-virtual {v0, v1, v2}, Lk21;->μ(II)V

    .line 88
    .line 89
    .line 90
    iput-boolean v4, p0, Ljw0;->ψ:Z

    .line 91
    .line 92
    invoke-virtual {v0}, Lk21;->ζ()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public final μ()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lk21;->ζ()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ν()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->ξ:Ln5;

    .line 2
    .line 3
    iget-object p0, p0, Ln5;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lk21;

    .line 6
    .line 7
    invoke-virtual {p0}, Lk21;->ζ()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final ξ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget-boolean p0, p0, Lox0;->ω:Z

    .line 6
    .line 7
    return p0
.end method

.method public final ο()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget-boolean p0, p0, Lox0;->ψ:Z

    .line 6
    .line 7
    return p0
.end method

.method public final π()Lwp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget-object p0, p0, Lox0;->π:Lwp0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final ρ()Lwp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ljw0;->ξ:Lwp0;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    sget-object p0, Lwp0;->η:Lwp0;

    .line 14
    .line 15
    return-object p0
.end method

.method public final σ()Lyp0;
    .locals 2

    .line 1
    iget-object p0, p0, Lyp0;->ρ:Lyp0;

    .line 2
    .line 3
    :goto_0
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lyp0;->ρ:Lyp0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-object p0
.end method

.method public final τ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 2
    .line 3
    iget-object p0, p0, Lbq0;->π:Lox0;

    .line 4
    .line 5
    iget p0, p0, Lox0;->ν:I

    .line 6
    .line 7
    return p0
.end method

.method public final υ()Lxr1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lyp0;->Τ:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lk31;->δ(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Lyp0;->χ:Lxr1;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final φ()Lk21;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyp0;->Α:Z

    .line 2
    .line 3
    iget-object v1, p0, Lyp0;->ω:Lk21;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Lk21;->η()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lyp0;->ψ()Lk21;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v1, Lk21;->η:I

    .line 15
    .line 16
    invoke-virtual {v1, v2, v0}, Lk21;->γ(ILk21;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, v1, Lk21;->η:I

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    sget-object v4, Lyp0;->Χ:Lo9;

    .line 25
    .line 26
    invoke-static {v0, v3, v2, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iput-boolean v3, p0, Lyp0;->Α:Z

    .line 30
    .line 31
    :cond_0
    return-object v1
.end method

.method public final χ()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ψ()Lk21;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyp0;->д()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lyp0;->ν:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lyp0;->ξ:Ln5;

    .line 9
    .line 10
    iget-object p0, p0, Ln5;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lk21;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object p0, p0, Lyp0;->ο:Lk21;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final ω(JLne0;IZ)V
    .locals 9

    .line 1
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 2
    .line 3
    iget-object v0, p0, Lk31;->δ:Lq31;

    .line 4
    .line 5
    sget-object v1, Lq31;->Σ:Lio1;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lq31;->Т(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    iget-object v2, p0, Lk31;->δ:Lq31;

    .line 12
    .line 13
    sget-object v3, Lq31;->Υ:Ll31;

    .line 14
    .line 15
    move-object v6, p3

    .line 16
    move v7, p4

    .line 17
    move v8, p5

    .line 18
    invoke-virtual/range {v2 .. v8}, Lq31;->Э(Lm31;JLne0;IZ)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final а(I)V
    .locals 2

    .line 1
    iget v0, p0, Lyp0;->Σ:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v1, v0, Lyp0;->Σ:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lyp0;->а(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget v0, p0, Lyp0;->Σ:I

    .line 25
    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Lyp0;->σ()Lyp0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget v1, v0, Lyp0;->Σ:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, -0x1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lyp0;->а(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iput p1, p0, Lyp0;->Σ:I

    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final б(Lyp0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyp0;->μ:Lyp0;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lyp0;->μ:Lyp0;

    .line 10
    .line 11
    iget-object v0, p0, Lyp0;->Λ:Lbq0;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object p1, v0, Lbq0;->ρ:Ljw0;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Ljw0;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljw0;-><init>(Lbq0;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, v0, Lbq0;->ρ:Ljw0;

    .line 25
    .line 26
    :cond_0
    iget-object p1, p0, Lyp0;->Κ:Lk31;

    .line 27
    .line 28
    iget-object v0, p1, Lk31;->δ:Lq31;

    .line 29
    .line 30
    iget-object p1, p1, Lk31;->γ:Lgm0;

    .line 31
    .line 32
    iget-object p1, p1, Lq31;->τ:Lq31;

    .line 33
    .line 34
    :goto_0
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Lq31;->Р()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Lq31;->τ:Lq31;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    iput-object p1, v0, Lbq0;->ρ:Ljw0;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    iput-boolean p1, v0, Lbq0;->ζ:Z

    .line 53
    .line 54
    iput-boolean p1, v0, Lbq0;->ε:Z

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p0}, Lyp0;->Δ()V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final в(Lr01;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lyp0;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->Ο:Lr01;

    .line 6
    .line 7
    sget-object v1, Lp01;->α:Lp01;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "Modifiers are not supported on virtual LayoutNodes"

    .line 13
    .line 14
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lyp0;->Τ:Z

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    const-string v0, "modifier is updated when deactivated"

    .line 22
    .line 23
    invoke-static {v0}, Lam0;->α(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lyp0;->α(Lr01;)V

    .line 33
    .line 34
    .line 35
    iget-boolean p1, p0, Lyp0;->φ:Z

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0}, Lyp0;->Ε()V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void

    .line 43
    :cond_4
    iput-object p1, p0, Lyp0;->Π:Lr01;

    .line 44
    .line 45
    return-void
.end method

.method public final г(Lg92;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lyp0;->Ε:Lg92;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_8

    .line 8
    .line 9
    iput-object p1, p0, Lyp0;->Ε:Lg92;

    .line 10
    .line 11
    iget-object p0, p0, Lyp0;->Κ:Lk31;

    .line 12
    .line 13
    iget-object p0, p0, Lk31;->ζ:Lq01;

    .line 14
    .line 15
    iget p1, p0, Lq01;->θ:I

    .line 16
    .line 17
    const/16 v0, 0x10

    .line 18
    .line 19
    and-int/2addr p1, v0

    .line 20
    if-eqz p1, :cond_8

    .line 21
    .line 22
    :goto_0
    if-eqz p0, :cond_8

    .line 23
    .line 24
    iget p1, p0, Lq01;->η:I

    .line 25
    .line 26
    and-int/2addr p1, v0

    .line 27
    if-eqz p1, :cond_7

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    move-object v1, p0

    .line 31
    move-object v2, p1

    .line 32
    :goto_1
    if-eqz v1, :cond_7

    .line 33
    .line 34
    instance-of v3, v1, Ldi1;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    check-cast v1, Ldi1;

    .line 39
    .line 40
    invoke-interface {v1}, Ldi1;->Χ()V

    .line 41
    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v3, v1, Lq01;->η:I

    .line 45
    .line 46
    and-int/2addr v3, v0

    .line 47
    if-eqz v3, :cond_6

    .line 48
    .line 49
    instance-of v3, v1, Lya;

    .line 50
    .line 51
    if-eqz v3, :cond_6

    .line 52
    .line 53
    move-object v3, v1

    .line 54
    check-cast v3, Lya;

    .line 55
    .line 56
    iget-object v3, v3, Lya;->υ:Lq01;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    :goto_2
    const/4 v5, 0x1

    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    iget v6, v3, Lq01;->η:I

    .line 63
    .line 64
    and-int/2addr v6, v0

    .line 65
    if-eqz v6, :cond_4

    .line 66
    .line 67
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    if-ne v4, v5, :cond_1

    .line 70
    .line 71
    move-object v1, v3

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v2, :cond_2

    .line 74
    .line 75
    new-instance v2, Lk21;

    .line 76
    .line 77
    new-array v5, v0, [Lq01;

    .line 78
    .line 79
    invoke-direct {v2, v5}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2, v1}, Lk21;->β(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v1, p1

    .line 88
    :cond_3
    invoke-virtual {v2, v3}, Lk21;->β(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_3
    iget-object v3, v3, Lq01;->κ:Lq01;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    if-ne v4, v5, :cond_6

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    :goto_4
    invoke-static {v2}, Lh62;->γ(Lk21;)Lq01;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    goto :goto_1

    .line 102
    :cond_7
    iget p1, p0, Lq01;->θ:I

    .line 103
    .line 104
    and-int/2addr p1, v0

    .line 105
    if-eqz p1, :cond_8

    .line 106
    .line 107
    iget-object p0, p0, Lq01;->κ:Lq01;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_8
    return-void
.end method

.method public final д()V
    .locals 6

    .line 1
    iget v0, p0, Lyp0;->ν:I

    .line 2
    .line 3
    if-lez v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lyp0;->π:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lyp0;->π:Z

    .line 11
    .line 12
    iget-object v1, p0, Lyp0;->ο:Lk21;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lk21;

    .line 17
    .line 18
    const/16 v2, 0x10

    .line 19
    .line 20
    new-array v2, v2, [Lyp0;

    .line 21
    .line 22
    invoke-direct {v1, v2}, Lk21;-><init>([Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lyp0;->ο:Lk21;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1}, Lk21;->η()V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lyp0;->ξ:Ln5;

    .line 31
    .line 32
    iget-object v2, v2, Ln5;->ζ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lk21;

    .line 35
    .line 36
    iget-object v3, v2, Lk21;->ε:[Ljava/lang/Object;

    .line 37
    .line 38
    iget v2, v2, Lk21;->η:I

    .line 39
    .line 40
    :goto_0
    if-ge v0, v2, :cond_2

    .line 41
    .line 42
    aget-object v4, v3, v0

    .line 43
    .line 44
    check-cast v4, Lyp0;

    .line 45
    .line 46
    iget-boolean v5, v4, Lyp0;->ε:Z

    .line 47
    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v4}, Lyp0;->ψ()Lk21;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v5, v1, Lk21;->η:I

    .line 55
    .line 56
    invoke-virtual {v1, v5, v4}, Lk21;->γ(ILk21;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1, v4}, Lk21;->β(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 67
    .line 68
    iget-object v0, p0, Lbq0;->π:Lox0;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    iput-boolean v1, v0, Lox0;->Δ:Z

    .line 72
    .line 73
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 74
    .line 75
    if-eqz p0, :cond_3

    .line 76
    .line 77
    iput-boolean v1, p0, Ljw0;->ψ:Z

    .line 78
    .line 79
    :cond_3
    return-void
.end method
