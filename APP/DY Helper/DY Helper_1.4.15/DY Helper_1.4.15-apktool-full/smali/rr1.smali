.class public final Lrr1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:[B

.field public β:I

.field public γ:I

.field public δ:Z

.field public final ε:Z

.field public ζ:Lrr1;

.field public η:Lrr1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 20
    new-array v0, v0, [B

    iput-object v0, p0, Lrr1;->α:[B

    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lrr1;->ε:Z

    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p0, Lrr1;->δ:Z

    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lrr1;->α:[B

    .line 8
    .line 9
    iput p2, p0, Lrr1;->β:I

    .line 10
    .line 11
    iput p3, p0, Lrr1;->γ:I

    .line 12
    .line 13
    iput-boolean p4, p0, Lrr1;->δ:Z

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lrr1;->ε:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final α()Lrr1;
    .locals 4

    .line 1
    iget-object v0, p0, Lrr1;->ζ:Lrr1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eq v0, p0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    iget-object v2, p0, Lrr1;->η:Lrr1;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lrr1;->ζ:Lrr1;

    .line 14
    .line 15
    iput-object v3, v2, Lrr1;->ζ:Lrr1;

    .line 16
    .line 17
    iget-object v2, p0, Lrr1;->ζ:Lrr1;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lrr1;->η:Lrr1;

    .line 23
    .line 24
    iput-object v3, v2, Lrr1;->η:Lrr1;

    .line 25
    .line 26
    iput-object v1, p0, Lrr1;->ζ:Lrr1;

    .line 27
    .line 28
    iput-object v1, p0, Lrr1;->η:Lrr1;

    .line 29
    .line 30
    return-object v0
.end method

.method public final β(Lrr1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p0, p1, Lrr1;->η:Lrr1;

    .line 5
    .line 6
    iget-object v0, p0, Lrr1;->ζ:Lrr1;

    .line 7
    .line 8
    iput-object v0, p1, Lrr1;->ζ:Lrr1;

    .line 9
    .line 10
    iget-object v0, p0, Lrr1;->ζ:Lrr1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lrr1;->η:Lrr1;

    .line 16
    .line 17
    iput-object p1, p0, Lrr1;->ζ:Lrr1;

    .line 18
    .line 19
    return-void
.end method

.method public final γ()Lrr1;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lrr1;->δ:Z

    .line 3
    .line 4
    new-instance v1, Lrr1;

    .line 5
    .line 6
    iget v2, p0, Lrr1;->β:I

    .line 7
    .line 8
    iget v3, p0, Lrr1;->γ:I

    .line 9
    .line 10
    iget-object p0, p0, Lrr1;->α:[B

    .line 11
    .line 12
    invoke-direct {v1, p0, v2, v3, v0}, Lrr1;-><init>([BIIZ)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public final δ(Lrr1;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lrr1;->α:[B

    .line 5
    .line 6
    iget-boolean v1, p1, Lrr1;->ε:Z

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iget v1, p1, Lrr1;->γ:I

    .line 11
    .line 12
    add-int v2, v1, p2

    .line 13
    .line 14
    const/16 v3, 0x2000

    .line 15
    .line 16
    if-le v2, v3, :cond_2

    .line 17
    .line 18
    iget-boolean v4, p1, Lrr1;->δ:Z

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    iget v4, p1, Lrr1;->β:I

    .line 23
    .line 24
    sub-int/2addr v2, v4

    .line 25
    if-gt v2, v3, :cond_0

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {v0, v0, v2, v4, v1}, Lg7;->Μ([B[BIII)V

    .line 29
    .line 30
    .line 31
    iget v1, p1, Lrr1;->γ:I

    .line 32
    .line 33
    iget v3, p1, Lrr1;->β:I

    .line 34
    .line 35
    sub-int/2addr v1, v3

    .line 36
    iput v1, p1, Lrr1;->γ:I

    .line 37
    .line 38
    iput v2, p1, Lrr1;->β:I

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    :goto_0
    iget v1, p1, Lrr1;->γ:I

    .line 54
    .line 55
    iget v2, p0, Lrr1;->β:I

    .line 56
    .line 57
    add-int v3, v2, p2

    .line 58
    .line 59
    iget-object v4, p0, Lrr1;->α:[B

    .line 60
    .line 61
    invoke-static {v4, v0, v1, v2, v3}, Lg7;->Μ([B[BIII)V

    .line 62
    .line 63
    .line 64
    iget v0, p1, Lrr1;->γ:I

    .line 65
    .line 66
    add-int/2addr v0, p2

    .line 67
    iput v0, p1, Lrr1;->γ:I

    .line 68
    .line 69
    iget p1, p0, Lrr1;->β:I

    .line 70
    .line 71
    add-int/2addr p1, p2

    .line 72
    iput p1, p0, Lrr1;->β:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    const-string p0, "only owner can write"

    .line 76
    .line 77
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
