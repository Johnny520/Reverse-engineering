.class public final synthetic Lmj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Landroid/view/View;

.field public final synthetic ζ:F


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmj1;->ε:Landroid/view/View;

    .line 5
    .line 6
    iput p2, p0, Lmj1;->ζ:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lmj1;->ε:Landroid/view/View;

    .line 2
    .line 3
    iget p0, p0, Lmj1;->ζ:F

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setAlpha(F)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    new-instance v0, Leo1;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    move-object p0, v0

    .line 18
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, "ProfileVideoOverlayAlpha: \u5ef6\u8fdf\u5e94\u7528\u900f\u660e\u5ea6\u5931\u8d25: "

    .line 29
    .line 30
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
