.class public final synthetic Lyt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ε:Lqm1;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:J


# direct methods
.method public synthetic constructor <init>(Lqm1;Lum1;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyt1;->ε:Lqm1;

    .line 5
    .line 6
    iput-object p2, p0, Lyt1;->ζ:Lum1;

    .line 7
    .line 8
    iput-wide p3, p0, Lyt1;->η:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v0, p0, Lyt1;->ε:Lqm1;

    .line 3
    .line 4
    iput-boolean p1, v0, Lqm1;->ε:Z

    .line 5
    .line 6
    iget-object p1, p0, Lyt1;->ζ:Lum1;

    .line 7
    .line 8
    iget-object p1, p1, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Runnable;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lbv1;->α:Lbv1;

    .line 15
    .line 16
    sget-object v0, Lbv1;->π:Lh22;

    .line 17
    .line 18
    invoke-virtual {v0}, Lh22;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroid/os/Handler;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p1, Lbv1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iget-wide v2, p0, Lyt1;->η:J

    .line 34
    .line 35
    cmp-long p0, v0, v2

    .line 36
    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
