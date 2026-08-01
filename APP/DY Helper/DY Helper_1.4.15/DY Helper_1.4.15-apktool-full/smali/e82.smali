.class public final synthetic Le82;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Long;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Long;I)V
    .locals 0

    .line 1
    iput p2, p0, Le82;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Le82;->ζ:Ljava/lang/Long;

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
    .locals 3

    .line 1
    iget v0, p0, Le82;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Le82;->ζ:Ljava/lang/Long;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lf82;->μ(Ljava/lang/Long;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :pswitch_0
    :try_start_1
    sget-object v0, Lf82;->ε:Le82;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v1, Lf82;->α:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    new-instance v0, Le82;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, v1}, Le82;-><init>(Ljava/lang/Long;I)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lf82;->ε:Le82;

    .line 33
    .line 34
    sget-object p0, Lf82;->α:Landroid/os/Handler;

    .line 35
    .line 36
    const-wide/16 v1, 0x50

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
