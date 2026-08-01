.class public final Lvo1;
.super Lvp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final β:Lvo1;


# instance fields
.field public final synthetic α:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvo1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lvo1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvo1;->β:Lvo1;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lvo1;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ε(Lrx0;Ljava/util/List;J)Lqx0;
    .locals 7

    .line 1
    iget p0, p0, Lvo1;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p1, "Undefined measure and it is required"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    sget-object v0, Lkz;->ε:Lkz;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eq p0, v1, :cond_1

    .line 25
    .line 26
    new-instance p0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v3, v2

    .line 40
    move v4, v3

    .line 41
    :goto_0
    if-ge v2, v1, :cond_0

    .line 42
    .line 43
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lkx0;

    .line 48
    .line 49
    invoke-interface {v5, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    iget v6, v5, Lch1;->ε:I

    .line 54
    .line 55
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    iget v6, v5, Lch1;->ζ:I

    .line 60
    .line 61
    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {v3, p3, p4}, Lzo;->ζ(IJ)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {v4, p3, p4}, Lzo;->ε(IJ)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    new-instance p4, Lb0;

    .line 80
    .line 81
    const/16 v1, 0x10

    .line 82
    .line 83
    invoke-direct {p4, v1, p0}, Lb0;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, p2, p3, v0, p4}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Lkx0;

    .line 96
    .line 97
    invoke-interface {p0, p3, p4}, Lkx0;->ζ(J)Lch1;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget p2, p0, Lch1;->ε:I

    .line 102
    .line 103
    invoke-static {p2, p3, p4}, Lzo;->ζ(IJ)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    iget v1, p0, Lch1;->ζ:I

    .line 108
    .line 109
    invoke-static {v1, p3, p4}, Lzo;->ε(IJ)I

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    new-instance p4, Lt0;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    invoke-direct {p4, p0, v1}, Lt0;-><init>(Lch1;I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {p1, p2, p3, v0, p4}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-static {p3, p4}, Lyo;->κ(J)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p3, p4}, Lyo;->ι(J)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    sget-object p3, La1;->Γ:La1;

    .line 133
    .line 134
    invoke-interface {p1, p0, p2, v0, p3}, Lrx0;->е(IILjava/util/Map;La80;)Lqx0;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    :goto_1
    return-object p0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
