.class public final synthetic Lb8;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lt81;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lb8;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb8;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lb8;->i:I

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Luh1;II)V
    .locals 0

    .line 12
    const/4 p2, 0x0

    iput p2, p0, Lb8;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8;->j:Ljava/lang/Object;

    iput p3, p0, Lb8;->i:I

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb8;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, p0, Lb8;->i:I

    .line 7
    .line 8
    iget-object p0, p0, Lb8;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Lt81;

    .line 14
    .line 15
    check-cast p1, Lpx;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const/4 v5, 0x0

    .line 27
    if-eq v0, v4, :cond_0

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v5

    .line 32
    :goto_0
    and-int/2addr p2, v2

    .line 33
    check-cast p1, Lgo0;

    .line 34
    .line 35
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lt81;->b:Ls81;

    .line 42
    .line 43
    iget-object p2, p2, Ls81;->a:Le9;

    .line 44
    .line 45
    invoke-virtual {p2, v3}, Le9;->e(I)Ll11;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget v0, p2, Ll11;->a:I

    .line 50
    .line 51
    sub-int/2addr v3, v0

    .line 52
    iget-object p2, p2, Ll11;->c:Lb5;

    .line 53
    .line 54
    iget-object p2, p2, Lb5;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p2, Lkw;

    .line 57
    .line 58
    iget-object p0, p0, Lt81;->c:Lo71;

    .line 59
    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p2, p0, v0, p1, v2}, Lkw;->o(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {p1}, Lgo0;->R()V

    .line 73
    .line 74
    .line 75
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    check-cast p0, Luh1;

    .line 77
    .line 78
    check-cast p1, Lpx;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Lpp0;->N(I)I

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-static {p0, p1, p2, v3}, Le8;->b(Luh1;Lpx;II)V

    .line 90
    .line 91
    .line 92
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
