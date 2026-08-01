.class public final synthetic Lr0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lp70;


# direct methods
.method public synthetic constructor <init>(ILp70;)V
    .locals 0

    .line 1
    iput p1, p0, Lr0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lr0;->ζ:Lp70;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lr0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lr0;->ζ:Lp70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->α(Lp70;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_3
    :try_start_0
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, "r9e132ed1c22c7945"

    .line 34
    .line 35
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_4
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_6
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
