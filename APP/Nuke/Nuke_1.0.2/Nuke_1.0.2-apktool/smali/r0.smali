.class public final synthetic Lr0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLun0;II)V
    .locals 0

    .line 16
    iput p5, p0, Lr0;->h:I

    iput-object p1, p0, Lr0;->l:Ljava/lang/Object;

    iput-boolean p2, p0, Lr0;->j:Z

    iput-object p3, p0, Lr0;->i:Ljava/lang/Object;

    iput p4, p0, Lr0;->k:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Luh1;Lxm0;ZI)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lr0;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lr0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p3, p0, Lr0;->j:Z

    .line 12
    .line 13
    iput p4, p0, Lr0;->k:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLc92;Lb03;I)V
    .locals 1

    .line 17
    const/4 v0, 0x3

    iput v0, p0, Lr0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr0;->j:Z

    iput-object p2, p0, Lr0;->l:Ljava/lang/Object;

    iput-object p3, p0, Lr0;->i:Ljava/lang/Object;

    iput p4, p0, Lr0;->k:I

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lr0;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget v2, p0, Lr0;->k:I

    .line 6
    .line 7
    iget-object v3, p0, Lr0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Lr0;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iget-boolean p0, p0, Lr0;->j:Z

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, Lc92;

    .line 17
    .line 18
    check-cast v3, Lb03;

    .line 19
    .line 20
    check-cast p1, Lpx;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    or-int/lit8 p2, v2, 0x1

    .line 28
    .line 29
    invoke-static {p2}, Lpp0;->N(I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p0, v4, v3, p1, p2}, Lup0;->c(ZLc92;Lb03;Lpx;I)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    check-cast v4, Llp1;

    .line 38
    .line 39
    check-cast v3, Lkw;

    .line 40
    .line 41
    check-cast p1, Lpx;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    or-int/lit8 p2, v2, 0x1

    .line 49
    .line 50
    invoke-static {p2}, Lpp0;->N(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {v4, p0, v3, p1, p2}, Lur1;->a(Llp1;ZLkw;Lpx;I)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_1
    check-cast v4, Luh1;

    .line 59
    .line 60
    check-cast v3, Lxm0;

    .line 61
    .line 62
    check-cast p1, Lpx;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    or-int/lit8 p2, v2, 0x1

    .line 70
    .line 71
    invoke-static {p2}, Lpp0;->N(I)I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {v4, v3, p0, p1, p2}, Lrp0;->M(Luh1;Lxm0;ZLpx;I)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :pswitch_2
    check-cast v4, Lnuke/module/wechat/ai/AIModelInfo;

    .line 80
    .line 81
    check-cast v3, Lxm0;

    .line 82
    .line 83
    check-cast p1, Lpx;

    .line 84
    .line 85
    check-cast p2, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    or-int/lit8 p2, v2, 0x1

    .line 91
    .line 92
    invoke-static {p2}, Lpp0;->N(I)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    invoke-static {v4, p0, v3, p1, p2}, Lse;->c(Lnuke/module/wechat/ai/AIModelInfo;ZLxm0;Lpx;I)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
