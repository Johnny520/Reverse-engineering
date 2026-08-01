.class public final Lph;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# static fields
.field public static final e:Lph;

.field public static final f:Lph;

.field public static final g:Lph;

.field public static final h:Lph;

.field public static final i:Lph;


# instance fields
.field public final synthetic d:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lph;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lph;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lph;->e:Lph;

    .line 8
    .line 9
    new-instance v0, Lph;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lph;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lph;->f:Lph;

    .line 16
    .line 17
    new-instance v0, Lph;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lph;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lph;->g:Lph;

    .line 24
    .line 25
    new-instance v0, Lph;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lph;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lph;->h:Lph;

    .line 32
    .line 33
    new-instance v0, Lph;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lph;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lph;->i:Lph;

    .line 40
    .line 41
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lph;->d:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget p0, p0, Lph;->d:I

    .line 2
    .line 3
    sget-object v0, Lna1;->a:Lna1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lvw0;

    .line 12
    .line 13
    check-cast p2, Lff;

    .line 14
    .line 15
    iget-wide p0, p2, Lff;->a:J

    .line 16
    .line 17
    const-wide/16 v0, 0x10

    .line 18
    .line 19
    cmp-long p2, p0, v0

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p0, p1}, Lp30;->W(J)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, Lji;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    and-int/lit8 p2, p0, 0x3

    .line 44
    .line 45
    if-eq p2, v2, :cond_1

    .line 46
    .line 47
    move v1, v3

    .line 48
    :cond_1
    and-int/2addr p0, v3

    .line 49
    check-cast p1, Lpi;

    .line 50
    .line 51
    invoke-virtual {p1, p0, v1}, Lpi;->O(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {p1}, Lpi;->R()V

    .line 59
    .line 60
    .line 61
    :goto_1
    return-object v0

    .line 62
    :pswitch_1
    check-cast p1, Lji;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    and-int/lit8 p2, p0, 0x3

    .line 71
    .line 72
    if-eq p2, v2, :cond_3

    .line 73
    .line 74
    move v1, v3

    .line 75
    :cond_3
    and-int/2addr p0, v3

    .line 76
    check-cast p1, Lpi;

    .line 77
    .line 78
    invoke-virtual {p1, p0, v1}, Lpi;->O(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    invoke-virtual {p1}, Lpi;->R()V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-object v0

    .line 89
    :pswitch_2
    check-cast p1, Lji;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    and-int/lit8 p2, p0, 0x3

    .line 98
    .line 99
    if-eq p2, v2, :cond_5

    .line 100
    .line 101
    move v1, v3

    .line 102
    :cond_5
    and-int/2addr p0, v3

    .line 103
    check-cast p1, Lpi;

    .line 104
    .line 105
    invoke-virtual {p1, p0, v1}, Lpi;->O(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    invoke-virtual {p1}, Lpi;->R()V

    .line 113
    .line 114
    .line 115
    :goto_3
    return-object v0

    .line 116
    :pswitch_3
    check-cast p1, Lji;

    .line 117
    .line 118
    check-cast p2, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    and-int/lit8 p2, p0, 0x3

    .line 125
    .line 126
    if-eq p2, v2, :cond_7

    .line 127
    .line 128
    move v1, v3

    .line 129
    :cond_7
    and-int/2addr p0, v3

    .line 130
    check-cast p1, Lpi;

    .line 131
    .line 132
    invoke-virtual {p1, p0, v1}, Lpi;->O(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_8

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    invoke-virtual {p1}, Lpi;->R()V

    .line 140
    .line 141
    .line 142
    :goto_4
    return-object v0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
