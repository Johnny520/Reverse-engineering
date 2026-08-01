.class public final synthetic Laj0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldj0;

.field public final synthetic η:Lcj0;

.field public final synthetic θ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ι:Lxi0;


# direct methods
.method public synthetic constructor <init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;I)V
    .locals 0

    .line 1
    iput p5, p0, Laj0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Laj0;->ζ:Ldj0;

    .line 4
    .line 5
    iput-object p2, p0, Laj0;->η:Lcj0;

    .line 6
    .line 7
    iput-object p3, p0, Laj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    iput-object p4, p0, Laj0;->ι:Lxi0;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Laj0;->ε:I

    .line 2
    .line 3
    iget-object v1, p0, Laj0;->ι:Lxi0;

    .line 4
    .line 5
    iget-object v2, p0, Laj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iget-object v3, p0, Laj0;->η:Lcj0;

    .line 8
    .line 9
    iget-object p0, p0, Laj0;->ζ:Ldj0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Lhj0;

    .line 15
    .line 16
    sget-object v4, Lyi0;->ε:Lyi0;

    .line 17
    .line 18
    const-string v5, ""

    .line 19
    .line 20
    invoke-direct {v0, v1, v4, v5}, Lhj0;-><init>(Lxi0;Lyi0;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Ldj0;->γ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    .line 25
    invoke-virtual {p0, v3, v2, v0}, Ldj0;->β(Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lhj0;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    new-instance v0, Lhj0;

    .line 30
    .line 31
    sget-object v4, Lyi0;->η:Lyi0;

    .line 32
    .line 33
    const-string v5, "\u7b49\u5f85\u5bbf\u4e3b\u670d\u52a1\u7aef\u56de\u8c03\u8d85\u65f6"

    .line 34
    .line 35
    invoke-direct {v0, v1, v4, v5}, Lhj0;-><init>(Lxi0;Lyi0;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v3, v2, v0}, Ldj0;->β(Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lhj0;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
