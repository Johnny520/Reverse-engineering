.class public final synthetic Lbj0;
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

.field public final synthetic κ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldj0;Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lxi0;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p6, p0, Lbj0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbj0;->ζ:Ldj0;

    .line 4
    .line 5
    iput-object p2, p0, Lbj0;->η:Lcj0;

    .line 6
    .line 7
    iput-object p3, p0, Lbj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    iput-object p4, p0, Lbj0;->ι:Lxi0;

    .line 10
    .line 11
    iput-object p5, p0, Lbj0;->κ:Ljava/lang/String;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lbj0;->ε:I

    .line 2
    .line 3
    sget-object v1, Lyi0;->ζ:Lyi0;

    .line 4
    .line 5
    iget-object v2, p0, Lbj0;->κ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lbj0;->ι:Lxi0;

    .line 8
    .line 9
    iget-object v4, p0, Lbj0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    iget-object v5, p0, Lbj0;->η:Lcj0;

    .line 12
    .line 13
    iget-object p0, p0, Lbj0;->ζ:Ldj0;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string v2, "\u5bbf\u4e3b\u5220\u9664\u63a5\u53e3\u8fd4\u56de\u5931\u8d25"

    .line 25
    .line 26
    :cond_0
    new-instance v0, Lhj0;

    .line 27
    .line 28
    invoke-direct {v0, v3, v1, v2}, Lhj0;-><init>(Lxi0;Lyi0;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v1, Ldj0;->γ:Ljava/util/concurrent/ScheduledExecutorService;

    .line 32
    .line 33
    invoke-virtual {p0, v5, v4, v0}, Ldj0;->β(Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lhj0;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    new-instance v0, Lhj0;

    .line 38
    .line 39
    const-string v6, "\u8c03\u7528\u5bbf\u4e3b\u5220\u9664\u63a5\u53e3\u5931\u8d25\uff1a"

    .line 40
    .line 41
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v0, v3, v1, v2}, Lhj0;-><init>(Lxi0;Lyi0;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v5, v4, v0}, Ldj0;->β(Lcj0;Ljava/util/concurrent/atomic/AtomicBoolean;Lhj0;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
