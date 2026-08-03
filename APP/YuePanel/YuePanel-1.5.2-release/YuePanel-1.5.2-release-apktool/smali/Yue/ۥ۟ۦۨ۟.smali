.class public final LYue/ۥ۟ۦۨ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۦۨ۟$ۥ;,
        LYue/ۥ۟ۦۨ۟$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x1

.field public static final ۥ۟:I = 0x2

.field public static final ۥ۟۟:I = 0x3


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/net/ConnectivityManager;Landroid/content/Intent;)Landroid/net/NetworkInfo;
    .locals 1
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/Intent;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_NETWORK_STATE"
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ReferencesDeprecated"
        }
    .end annotation

    const-string v0, "networkInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/NetworkInfo;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۥ۟(Landroid/net/ConnectivityManager;)I
    .locals 0
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥ۟ۦۨ۟$ۥ;->ۥ(Landroid/net/ConnectivityManager;)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟(Landroid/net/ConnectivityManager;)Z
    .locals 0
    .param p0    # Landroid/net/ConnectivityManager;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۨ;
        value = "android.permission.ACCESS_NETWORK_STATE"
    .end annotation

    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    move-result p0

    return p0
.end method
