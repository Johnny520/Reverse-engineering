.class public final synthetic Lgn0;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lgn0;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    iput-object p2, p0, Lgn0;->ζ:Landroid/app/Dialog;

    .line 4
    .line 5
    const-string v4, "createSharePanelActionCard$openFullMenu(Landroid/app/Activity;Landroid/app/Dialog;)V"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    const-class v2, Lkn0;

    .line 10
    .line 11
    const-string v3, "openFullMenu"

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    invoke-direct/range {v0 .. v5}, Lp80;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lgn0;->ζ:Landroid/app/Dialog;

    .line 2
    .line 3
    iget-object p0, p0, Lgn0;->ε:Landroid/app/Activity;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "DYHelper: \u5206\u4eab\u9762\u677f\u6253\u5f00\u5b8c\u6574\u83dc\u5355\u5931\u8d25: Activity \u4e3a\u7a7a"

    .line 8
    .line 9
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v1, Lja0;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-direct {v1, p0, v2}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :catchall_0
    sget-object v0, Lin0;->α:Landroid/os/Handler;

    .line 23
    .line 24
    new-instance v2, Lfn0;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v2, v3, v1, p0}, Lfn0;-><init>(ILp70;Landroid/app/Activity;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 34
    .line 35
    return-object p0
.end method
