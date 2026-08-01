.class public final Lqq;
.super Landroid/database/ContentObserver;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm12;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqq;->α:I

    .line 3
    .line 4
    iput-object p1, p0, Lqq;->β:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lwc;Landroid/os/Handler;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lqq;->α:I

    iput-object p1, p0, Lqq;->β:Ljava/lang/Object;

    .line 15
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .line 1
    iget v0, p0, Lqq;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/database/ContentObserver;->deliverSelfNotifications()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onChange(Z)V
    .locals 1

    .line 1
    iget v0, p0, Lqq;->α:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p0, p0, Lqq;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lm12;

    .line 13
    .line 14
    iget-boolean p1, p0, Lsq;->ζ:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, Lsq;->η:Landroid/database/Cursor;

    .line 29
    .line 30
    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, Lsq;->ε:Z

    .line 35
    .line 36
    :cond_0
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 1

    iget v0, p0, Lqq;->α:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/database/ContentObserver;->onChange(ZLandroid/net/Uri;)V

    return-void

    .line 37
    :pswitch_0
    iget-object p0, p0, Lqq;->β:Ljava/lang/Object;

    check-cast p0, Lwc;

    sget-object p1, Ls62;->α:Ls62;

    invoke-interface {p0, p1}, Lqs1;->μ(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
