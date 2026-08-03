.class public LYue/ۥ۠ۢۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۢۡۤ$ۥ۟;,
        LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;,
        LYue/ۥ۠ۢۡۤ$ۥ۟۟;,
        LYue/ۥ۠ۢۡۤ$ۥ۟۟۟;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۡۤ;->ۥ:Landroid/content/Context;

    return-void
.end method

.method public static ۥ۟۟(Landroid/content/Context;)LYue/ۥ۠ۢۡۤ;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۡۤ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۢۡۤ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static ۥ۟۟۟(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟۟(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;)LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(LYue/ۥ۠ۢۡۤ$ۥ۟۟;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    new-instance v0, LYue/ۥ۠ۢۡۤ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۢۡۤ$ۥ;-><init>(LYue/ۥ۠ۢۡۤ$ۥ۟۟;)V

    return-object v0
.end method

.method public static ۥۣ۟۟۟(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟۟۟ۡ(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ۥ(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;ILYue/ۥۣ۟ۨۧ;LYue/ۥ۠ۢۡۤ$ۥ۟۟;Landroid/os/Handler;)V
    .locals 6
    .param p1    # LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۟ۨۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠ۢۡۤ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.USE_FINGERPRINT"
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p3}, LYue/ۥۣ۟ۨۧ;->ۥ۟()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/os/CancellationSignal;

    :goto_0
    move-object v3, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, LYue/ۥ۠ۢۡۤ;->ۥ۟(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;ILandroid/os/CancellationSignal;LYue/ۥ۠ۢۡۤ$ۥ۟۟;Landroid/os/Handler;)V

    return-void
.end method

.method public ۥ۟(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;ILandroid/os/CancellationSignal;LYue/ۥ۠ۢۡۤ$ۥ۟۟;Landroid/os/Handler;)V
    .locals 7
    .param p1    # LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/os/CancellationSignal;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۠ۢۡۤ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p5    # Landroid/os/Handler;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.USE_FINGERPRINT"
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ;->ۥ:Landroid/content/Context;

    invoke-static {v0}, LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, LYue/ۥ۠ۢۡۤ;->ۥۣ۟۟۟(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    move-result-object v2

    invoke-static {p4}, LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۢۡۤ$ۥ۟۟;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;

    move-result-object v5

    move-object v3, p3

    move v4, p2

    move-object v6, p5

    invoke-static/range {v1 .. v6}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ(Ljava/lang/Object;Ljava/lang/Object;Landroid/os/CancellationSignal;ILjava/lang/Object;Landroid/os/Handler;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.USE_FINGERPRINT"
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ;->ۥ:Landroid/content/Context;

    invoke-static {v0}, LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟۟۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.USE_FINGERPRINT"
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ;->ۥ:Landroid/content/Context;

    invoke-static {v0}, LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟(Landroid/content/Context;)Landroid/hardware/fingerprint/FingerprintManager;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
