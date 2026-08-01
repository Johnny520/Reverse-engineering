.class public final Ll4;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lww;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lww;II)V
    .locals 0

    .line 15
    iput p5, p0, Ll4;->d:I

    iput-object p1, p0, Ll4;->e:Ljava/lang/Object;

    iput-object p2, p0, Ll4;->f:Ljava/lang/Object;

    iput-object p3, p0, Ll4;->g:Lww;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lw3;Lt6;Lww;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ll4;->d:I

    .line 3
    .line 4
    iput-object p1, p0, Ll4;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ll4;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ll4;->g:Lww;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ll4;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lna1;->a:Lna1;

    .line 5
    .line 6
    iget-object v3, p0, Ll4;->g:Lww;

    .line 7
    .line 8
    iget-object v4, p0, Ll4;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ll4;->e:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Lji;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    check-cast p0, Ldn0;

    .line 23
    .line 24
    check-cast v4, Lt6;

    .line 25
    .line 26
    invoke-static {v1}, Lj50;->A(I)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-static {p0, v4, v3, p1, p2}, Ldj;->a(Ldn0;Lt6;Lww;Lji;I)V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :pswitch_0
    check-cast p1, Lji;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 39
    .line 40
    .line 41
    check-cast p0, Lhw;

    .line 42
    .line 43
    check-cast v4, Lxn;

    .line 44
    .line 45
    check-cast v3, Lmh;

    .line 46
    .line 47
    const/16 p2, 0x181

    .line 48
    .line 49
    invoke-static {p2}, Lj50;->A(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-static {p0, v4, v3, p1, p2}, Li4;->e(Lhw;Lxn;Lmh;Lji;I)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_1
    check-cast p1, Lji;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    and-int/lit8 v0, p2, 0x3

    .line 66
    .line 67
    const/4 v5, 0x2

    .line 68
    const/4 v6, 0x0

    .line 69
    if-eq v0, v5, :cond_0

    .line 70
    .line 71
    move v0, v1

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v0, v6

    .line 74
    :goto_0
    and-int/2addr p2, v1

    .line 75
    check-cast p1, Lpi;

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0}, Lpi;->O(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    if-eqz p2, :cond_1

    .line 82
    .line 83
    check-cast p0, Lw3;

    .line 84
    .line 85
    check-cast v4, Lt6;

    .line 86
    .line 87
    invoke-static {p0, v4, v3, p1, v6}, Ldj;->a(Ldn0;Lt6;Lww;Lji;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {p1}, Lpi;->R()V

    .line 92
    .line 93
    .line 94
    :goto_1
    return-object v2

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
