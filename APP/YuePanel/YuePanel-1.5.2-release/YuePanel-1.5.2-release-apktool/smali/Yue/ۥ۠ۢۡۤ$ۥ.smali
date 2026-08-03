.class public LYue/ۥ۠ۢۡۤ$ۥ;
.super Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟ۢ(LYue/ۥ۠ۢۡۤ$ۥ۟۟;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۡۤ$ۥ۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۡۤ$ۥ;->ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;

    invoke-direct {p0}, Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ$ۥ;->ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۢۡۤ$ۥ۟۟;->ۥ(ILjava/lang/CharSequence;)V

    return-void
.end method

.method public onAuthenticationFailed()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ$ۥ;->ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥ۠ۢۡۤ$ۥ۟۟;->ۥ۟()V

    return-void
.end method

.method public onAuthenticationHelp(ILjava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ$ۥ;->ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۢۡۤ$ۥ۟۟;->ۥ۟۟(ILjava/lang/CharSequence;)V

    return-void
.end method

.method public onAuthenticationSucceeded(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۢۡۤ$ۥ;->ۥ:LYue/ۥ۠ۢۡۤ$ۥ۟۟;

    new-instance v1, LYue/ۥ۠ۢۡۤ$ۥ۟۟۟;

    invoke-static {p1}, LYue/ۥ۠ۢۡۤ$ۥ۟;->ۥ۟(Ljava/lang/Object;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۢۡۤ;->ۥ۟۟۟ۡ(Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;)LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;

    move-result-object p1

    invoke-direct {v1, p1}, LYue/ۥ۠ۢۡۤ$ۥ۟۟۟;-><init>(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟۟;)V

    invoke-virtual {v0, v1}, LYue/ۥ۠ۢۡۤ$ۥ۟۟;->ۥ۟۟۟(LYue/ۥ۠ۢۡۤ$ۥ۟۟۟;)V

    return-void
.end method
