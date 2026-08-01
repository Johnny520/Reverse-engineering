.class public final Lj61;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Lj61;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lj61;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lo61;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lj61;->γ:Lj61;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-virtual {p1, p0}, Lf81;->α(I)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    iget p1, p3, Lrw1;->χ:I

    .line 7
    .line 8
    iget-object p2, p3, Lrw1;->β:[I

    .line 9
    .line 10
    invoke-virtual {p3, p1}, Lrw1;->σ(I)I

    .line 11
    .line 12
    .line 13
    move-result p5

    .line 14
    invoke-virtual {p3, p5, p2}, Lrw1;->Π(I[I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object p5, p3, Lrw1;->β:[I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-virtual {p3, p1}, Lrw1;->σ(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p3, p1, p5}, Lrw1;->η(I[I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    sub-int p5, p1, p0

    .line 31
    .line 32
    invoke-static {p2, p5}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    :goto_0
    if-ge p2, p1, :cond_2

    .line 37
    .line 38
    iget-object p5, p3, Lrw1;->γ:[Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p3, p2}, Lrw1;->θ(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    aget-object p5, p5, v0

    .line 45
    .line 46
    instance-of v0, p5, La90;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    check-cast p5, La90;

    .line 51
    .line 52
    invoke-virtual {p4, p5}, Len1;->δ(La90;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    instance-of v0, p5, Lbl1;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    check-cast p5, Lbl1;

    .line 61
    .line 62
    invoke-virtual {p5}, Lbl1;->γ()V

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_1
    add-int/lit8 p2, p2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const-string p1, "Check failed"

    .line 69
    .line 70
    if-lez p0, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {p1}, Lsn;->α(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    iget p2, p3, Lrw1;->χ:I

    .line 77
    .line 78
    iget-object p4, p3, Lrw1;->β:[I

    .line 79
    .line 80
    invoke-virtual {p3, p2}, Lrw1;->σ(I)I

    .line 81
    .line 82
    .line 83
    move-result p5

    .line 84
    invoke-virtual {p3, p5, p4}, Lrw1;->Π(I[I)I

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    iget-object p5, p3, Lrw1;->β:[I

    .line 89
    .line 90
    add-int/lit8 v0, p2, 0x1

    .line 91
    .line 92
    invoke-virtual {p3, v0}, Lrw1;->σ(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p3, v0, p5}, Lrw1;->η(I[I)I

    .line 97
    .line 98
    .line 99
    move-result p5

    .line 100
    sub-int/2addr p5, p0

    .line 101
    if-lt p5, p4, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    invoke-static {p1}, Lsn;->α(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    invoke-virtual {p3, p5, p0, p2}, Lrw1;->Μ(III)V

    .line 108
    .line 109
    .line 110
    iget p1, p3, Lrw1;->ι:I

    .line 111
    .line 112
    if-lt p1, p4, :cond_5

    .line 113
    .line 114
    sub-int/2addr p1, p0

    .line 115
    iput p1, p3, Lrw1;->ι:I

    .line 116
    .line 117
    :cond_5
    return-void
.end method
