.class public final synthetic Lag;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ldg;


# direct methods
.method public synthetic constructor <init>(Ldg;I)V
    .locals 0

    .line 1
    iput p2, p0, Lag;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lag;->e:Ldg;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lag;->d:I

    .line 2
    .line 3
    sget-object v1, Lna1;->a:Lna1;

    .line 4
    .line 5
    iget-object p0, p0, Lag;->e:Ldg;

    .line 6
    .line 7
    check-cast p1, Lok0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p1, p0, Ln;->x:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ln;->y:Lhw;

    .line 17
    .line 18
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v1

    .line 22
    :pswitch_0
    iget-object p1, p0, Ldg;->O:Lhw;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Lhw;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-boolean p1, p0, Ldg;->P:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    sget-object p1, Ldj;->l:Lg41;

    .line 34
    .line 35
    invoke-static {p0, p1}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljy;

    .line 40
    .line 41
    invoke-interface {p0}, Ljy;->a()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-object v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
