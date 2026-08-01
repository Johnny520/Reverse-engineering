.class public final Le01;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lde0;


# direct methods
.method public synthetic constructor <init>(Lde0;I)V
    .locals 0

    .line 1
    iput p2, p0, Le01;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Le01;->β:Lde0;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lk01;)V
    .locals 1

    .line 1
    iget v0, p0, Le01;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lm01;->afterHookedMethod(Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lf01;->α:Lf01;

    .line 14
    .line 15
    iget-object p0, p0, Le01;->β:Lde0;

    .line 16
    .line 17
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lf01;->α(Lde0;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lk01;)V
    .locals 1

    .line 1
    iget v0, p0, Le01;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lm01;->beforeHookedMethod(Lk01;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lf01;->α:Lf01;

    .line 14
    .line 15
    iget-object p0, p0, Le01;->β:Lde0;

    .line 16
    .line 17
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lf01;->α(Lde0;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
