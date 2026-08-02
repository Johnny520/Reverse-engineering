.class public final Lzm;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 9
    const/4 v0, 0x2

    iput v0, p0, Lzm;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzm;->h:I

    .line 2
    .line 3
    iput-object p2, p0, Lzm;->i:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lzm;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lhf1;

    .line 9
    .line 10
    iget-object p1, p1, Lhf1;->a:[F

    .line 11
    .line 12
    iget-object p0, p0, Lzm;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lc61;

    .line 15
    .line 16
    invoke-interface {p0}, Lc61;->w()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0, p0, p1}, Lc61;->H(Lc61;[F)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v1

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Lzm;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lu12;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    iput-boolean p1, p0, Lu12;->c:Z

    .line 43
    .line 44
    :cond_1
    return-object v1

    .line 45
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 46
    .line 47
    iget-object p0, p0, Lzm;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ls52;

    .line 50
    .line 51
    invoke-virtual {p0}, Ls52;->cancel()V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 56
    .line 57
    iget-object p0, p0, Lzm;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lnp;

    .line 60
    .line 61
    invoke-interface {p0}, Lnp;->cancel()V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
