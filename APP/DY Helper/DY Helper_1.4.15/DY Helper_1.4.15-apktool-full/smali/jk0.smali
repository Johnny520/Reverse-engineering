.class public final synthetic Ljk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Llk0;

.field public final synthetic ζ:I

.field public final synthetic η:I

.field public final synthetic θ:I

.field public final synthetic ι:I

.field public final synthetic κ:I


# direct methods
.method public synthetic constructor <init>(Llk0;IIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljk0;->ε:Llk0;

    .line 5
    .line 6
    iput p2, p0, Ljk0;->ζ:I

    .line 7
    .line 8
    iput p3, p0, Ljk0;->η:I

    .line 9
    .line 10
    iput p4, p0, Ljk0;->θ:I

    .line 11
    .line 12
    iput p5, p0, Ljk0;->ι:I

    .line 13
    .line 14
    iput p6, p0, Ljk0;->κ:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lmk0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Ljk0;->η:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    :cond_0
    iget v2, p0, Ljk0;->θ:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    move v2, v3

    .line 18
    :cond_1
    iget v4, p0, Ljk0;->ι:I

    .line 19
    .line 20
    if-ge v4, v3, :cond_2

    .line 21
    .line 22
    move v4, v3

    .line 23
    :cond_2
    iget v5, p0, Ljk0;->κ:I

    .line 24
    .line 25
    if-ge v5, v3, :cond_3

    .line 26
    .line 27
    move v5, v3

    .line 28
    :cond_3
    iget-object p1, p1, Lmk0;->α:Llk0;

    .line 29
    .line 30
    iget v6, p1, Llk0;->γ:I

    .line 31
    .line 32
    iget v7, p1, Llk0;->α:I

    .line 33
    .line 34
    sub-int v8, v6, v7

    .line 35
    .line 36
    iget v9, p1, Llk0;->δ:I

    .line 37
    .line 38
    iget p1, p1, Llk0;->β:I

    .line 39
    .line 40
    sub-int v10, v9, p1

    .line 41
    .line 42
    if-lt v8, v2, :cond_6

    .line 43
    .line 44
    if-gt v4, v10, :cond_6

    .line 45
    .line 46
    if-gt v10, v5, :cond_6

    .line 47
    .line 48
    iget-object v4, p0, Ljk0;->ε:Llk0;

    .line 49
    .line 50
    iget v5, v4, Llk0;->δ:I

    .line 51
    .line 52
    iget v8, v4, Llk0;->α:I

    .line 53
    .line 54
    iget p0, p0, Ljk0;->ζ:I

    .line 55
    .line 56
    sub-int p0, v5, p0

    .line 57
    .line 58
    if-lt p1, p0, :cond_6

    .line 59
    .line 60
    add-int/2addr v0, v5

    .line 61
    if-gt p1, v0, :cond_6

    .line 62
    .line 63
    if-gt v9, v5, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget p0, v4, Llk0;->γ:I

    .line 67
    .line 68
    sub-int p1, p0, v8

    .line 69
    .line 70
    if-ge p1, v3, :cond_5

    .line 71
    .line 72
    move p1, v3

    .line 73
    :cond_5
    invoke-static {v6, p0}, Ljava/lang/Math;->min(II)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sub-int/2addr p0, v0

    .line 82
    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-lt p0, p1, :cond_6

    .line 87
    .line 88
    move v1, v3

    .line 89
    :cond_6
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
