.class public final Ln00;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lps2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lps2;

    .line 5
    .line 6
    invoke-direct {v0}, Lps2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ln00;->a:Lps2;

    .line 10
    .line 11
    return-void
.end method

.method public static b(Ln00;Lmn0;Lkw;Lxm0;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x8

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    iget-object p4, p0, Ln00;->a:Lps2;

    .line 7
    .line 8
    new-instance v0, Lb81;

    .line 9
    .line 10
    invoke-direct {v0, p1, p0, p2, p3}, Lb81;-><init>(Lmn0;Ln00;Lnn0;Lxm0;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lkw;

    .line 14
    .line 15
    const p1, -0x6aa64e33

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-direct {p0, p1, p2, v0}, Lkw;-><init>(IZLun0;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, p0}, Lps2;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lm00;Lpx;I)V
    .locals 7

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, -0x2f9828e7

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, p3

    .line 20
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const/16 v2, 0x20

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v2, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr v0, v2

    .line 32
    and-int/lit8 v2, v0, 0x13

    .line 33
    .line 34
    const/16 v3, 0x12

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v2, v4

    .line 42
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 43
    .line 44
    invoke-virtual {p2, v3, v2}, Lgo0;->O(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    iget-object v2, p0, Ln00;->a:Lps2;

    .line 51
    .line 52
    invoke-virtual {v2}, Lps2;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    :goto_3
    if-ge v4, v3, :cond_4

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Lps2;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lnn0;

    .line 63
    .line 64
    and-int/lit8 v6, v0, 0xe

    .line 65
    .line 66
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-interface {v5, p1, p2, v6}, Lnn0;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {p2}, Lgo0;->R()V

    .line 77
    .line 78
    .line 79
    :cond_4
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    new-instance v0, Laf;

    .line 86
    .line 87
    invoke-direct {v0, p3, v1, p0, p1}, Laf;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 91
    .line 92
    :cond_5
    return-void
.end method
