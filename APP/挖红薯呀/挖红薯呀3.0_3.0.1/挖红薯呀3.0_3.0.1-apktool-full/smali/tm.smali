.class public final synthetic Ltm;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lum;


# direct methods
.method public synthetic constructor <init>(Lum;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltm;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Ltm;->e:Lum;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ltm;->d:I

    .line 2
    .line 3
    iget-object p0, p0, Ltm;->e:Lum;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Luv0;->a:Lej;

    .line 9
    .line 10
    invoke-static {p0, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lrv0;

    .line 15
    .line 16
    sget-object p0, Li4;->o:Lqv0;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    sget-object v0, Luv0;->a:Lej;

    .line 20
    .line 21
    invoke-static {p0, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lrv0;

    .line 26
    .line 27
    iget-object v1, p0, Lum;->x:Ll6;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lsm;->x0(Lrm;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lum;->x:Ll6;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    if-nez v1, :cond_2

    .line 41
    .line 42
    new-instance v5, Lx1;

    .line 43
    .line 44
    const/4 v0, 0x7

    .line 45
    invoke-direct {v5, v0, p0}, Lx1;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v6, Ltm;

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-direct {v6, p0, v0}, Ltm;-><init>(Lum;I)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lum;->t:Lg30;

    .line 55
    .line 56
    iget-boolean v3, p0, Lum;->u:Z

    .line 57
    .line 58
    iget v4, p0, Lum;->v:F

    .line 59
    .line 60
    sget-object v0, Lvv0;->a:Lp91;

    .line 61
    .line 62
    new-instance v1, Ll6;

    .line 63
    .line 64
    invoke-direct/range {v1 .. v6}, Ll6;-><init>(Lg30;ZFLx1;Ltm;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Lsm;->w0(Lrm;)Lrm;

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, Lum;->x:Ll6;

    .line 71
    .line 72
    :cond_2
    :goto_0
    sget-object p0, Lna1;->a:Lna1;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
