.class public final synthetic Lm10;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb03;ZI)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Lm10;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm10;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lm10;->i:Z

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(ZLkw;)V
    .locals 1

    .line 12
    const/4 v0, 0x2

    iput v0, p0, Lm10;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm10;->i:Z

    iput-object p2, p0, Lm10;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLmn0;I)V
    .locals 0

    .line 13
    const/4 p3, 0x1

    iput p3, p0, Lm10;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm10;->i:Z

    iput-object p2, p0, Lm10;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lm10;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lm10;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean p0, p0, Lm10;->i:Z

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, Lkw;

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
    if-eq v0, v4, :cond_0

    .line 27
    .line 28
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    :goto_0
    and-int/2addr p2, v2

    .line 32
    check-cast p1, Lgo0;

    .line 33
    .line 34
    invoke-virtual {p1, p2, v0}, Lgo0;->O(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    sget-object p2, Llu;->i:Ltu2;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    sget-object p0, Llu;->h:Lmp1;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object p0, Llu;->g:Lmp1;

    .line 48
    .line 49
    :goto_1
    invoke-virtual {p2, p0}, Ltu2;->a(Ljava/lang/Object;)Lf42;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/16 p2, 0x8

    .line 54
    .line 55
    invoke-static {p0, v3, p1, p2}, Lci0;->a(Lf42;Lkw;Lpx;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p1}, Lgo0;->R()V

    .line 60
    .line 61
    .line 62
    :goto_2
    return-object v1

    .line 63
    :pswitch_0
    check-cast v3, Lmn0;

    .line 64
    .line 65
    check-cast p1, Lpx;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, Lpp0;->N(I)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    invoke-static {p0, v3, p1, p2}, Lxe1;->a(ZLmn0;Lpx;I)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :pswitch_1
    check-cast v3, Lb03;

    .line 81
    .line 82
    check-cast p1, Lpx;

    .line 83
    .line 84
    check-cast p2, Ljava/lang/Integer;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {v2}, Lpp0;->N(I)I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-static {v3, p0, p1, p2}, Lgf1;->c(Lb03;ZLpx;I)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
