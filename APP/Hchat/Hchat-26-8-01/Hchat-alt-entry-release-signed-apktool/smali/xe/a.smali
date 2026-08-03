.class public abstract Lxe/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxe/a;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p0}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    invoke-static {p1}, Lxe/q;->g(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    new-instance v0, Lb5/k;

    .line 22
    .line 23
    invoke-direct {v0}, Lb5/k;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lkd/c;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v1, v0, v2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v1}, Lxe/q;->j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lb5/k;

    .line 36
    .line 37
    invoke-direct {v1}, Lb5/k;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v2, Lkd/c;

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    invoke-direct {v2, v1, v3}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v2}, Lxe/q;->j(Ljava/lang/String;Ljava/util/function/IntConsumer;)V

    .line 47
    .line 48
    .line 49
    iget v2, v0, Lb5/k;->c:I

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget v3, v1, Lb5/k;->c:I

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    :cond_2
    int-to-float v2, v2

    .line 58
    iget v3, v0, Lb5/k;->b:I

    .line 59
    .line 60
    int-to-float v3, v3

    .line 61
    div-float/2addr v2, v3

    .line 62
    iget v3, v1, Lb5/k;->c:I

    .line 63
    .line 64
    int-to-float v3, v3

    .line 65
    iget v4, v1, Lb5/k;->b:I

    .line 66
    .line 67
    int-to-float v4, v4

    .line 68
    div-float/2addr v3, v4

    .line 69
    sub-float v4, v3, v2

    .line 70
    .line 71
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    float-to-double v4, v4

    .line 76
    const-wide v6, 0x3f50624dd2f1a9fcL    # 0.001

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    cmpl-double v4, v4, v6

    .line 82
    .line 83
    if-ltz v4, :cond_3

    .line 84
    .line 85
    cmpg-float v0, v2, v3

    .line 86
    .line 87
    if-gtz v0, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    iget v0, v0, Lb5/k;->b:I

    .line 91
    .line 92
    iget v1, v1, Lb5/k;->b:I

    .line 93
    .line 94
    if-lt v0, v1, :cond_4

    .line 95
    .line 96
    :goto_0
    return-object p0

    .line 97
    :cond_4
    return-object p1

    .line 98
    :cond_5
    :goto_1
    if-eqz p0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_6

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_6
    return-object p1
.end method
