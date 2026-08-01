.class public final Lon1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ε:Lq50;

.field public ζ:Lr50;

.field public η:Landroid/os/Handler;


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lon1;->ε:Lq50;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq50;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, Lon1;->ζ:Lr50;

    .line 10
    .line 11
    iget-object p0, p0, Lon1;->η:Landroid/os/Handler;

    .line 12
    .line 13
    new-instance v2, Lｓ;

    .line 14
    .line 15
    const/4 v3, 0x5

    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v2, v3, v1, v0, v4}, Lｓ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
