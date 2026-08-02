.class public final synthetic Lqa;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqa;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget p0, p0, Lqa;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/File;

    .line 7
    .line 8
    check-cast p2, Ljava/io/File;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compare(JJ)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_0
    check-cast p1, Ly81;

    .line 24
    .line 25
    check-cast p2, Ly81;

    .line 26
    .line 27
    iget p0, p1, Ly81;->a:I

    .line 28
    .line 29
    iget p1, p2, Ly81;->a:I

    .line 30
    .line 31
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_1
    check-cast p1, Lr61;

    .line 37
    .line 38
    check-cast p2, Lr61;

    .line 39
    .line 40
    iget-object p0, p1, Lr61;->N:Lv61;

    .line 41
    .line 42
    iget-object p0, p0, Lv61;->p:Lmf1;

    .line 43
    .line 44
    iget p0, p0, Lmf1;->K:F

    .line 45
    .line 46
    iget-object v0, p2, Lr61;->N:Lv61;

    .line 47
    .line 48
    iget-object v0, v0, Lv61;->p:Lmf1;

    .line 49
    .line 50
    iget v0, v0, Lmf1;->K:F

    .line 51
    .line 52
    cmpg-float v1, p0, v0

    .line 53
    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Lr61;->v()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {p2}, Lr61;->v()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    :goto_0
    return p0

    .line 74
    :pswitch_2
    check-cast p1, Lc11;

    .line 75
    .line 76
    check-cast p2, Lc11;

    .line 77
    .line 78
    iget p0, p1, La11;->i:I

    .line 79
    .line 80
    iget p1, p1, La11;->h:I

    .line 81
    .line 82
    sub-int/2addr p0, p1

    .line 83
    iget p1, p2, La11;->i:I

    .line 84
    .line 85
    iget p2, p2, La11;->h:I

    .line 86
    .line 87
    sub-int/2addr p1, p2

    .line 88
    sub-int/2addr p0, p1

    .line 89
    return p0

    .line 90
    :pswitch_3
    check-cast p1, Lb21;

    .line 91
    .line 92
    check-cast p2, Lb21;

    .line 93
    .line 94
    iget p0, p1, Lb21;->b:I

    .line 95
    .line 96
    iget p1, p2, Lb21;->b:I

    .line 97
    .line 98
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0

    .line 103
    :pswitch_4
    check-cast p1, Lj32;

    .line 104
    .line 105
    check-cast p2, Lj32;

    .line 106
    .line 107
    iget p0, p2, Lj32;->a:I

    .line 108
    .line 109
    iget p1, p1, Lj32;->a:I

    .line 110
    .line 111
    invoke-static {p0, p1}, Lt11;->o(II)I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
