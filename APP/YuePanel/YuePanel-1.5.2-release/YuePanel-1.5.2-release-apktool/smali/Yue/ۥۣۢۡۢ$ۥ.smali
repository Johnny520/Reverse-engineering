.class public LYue/ۥۣۢۡۢ$ۥ;
.super LYue/ۥ۠ۥ۟ۧ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢۡۢ;->ۥ۟۟()LYue/ۥ۠ۥ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟ۡ:LYue/ۥۣۢۡۢ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢۡۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢۡۢ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۢ;

    invoke-direct {p0}, LYue/ۥ۠ۥ۟ۧ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(ZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iget-object p1, p0, LYue/ۥۣۢۡۢ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۢ;

    iget-object p1, p1, LYue/ۥۣۢۡۢ;->ۥ۟:LYue/ۥۡۦۦ۟;

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, LYue/ۥۣۢۡۢ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۢ;

    iget-object p1, p1, LYue/ۥۣۢۡۢ;->ۥ۟:LYue/ۥۡۦۦ۟;

    const/4 p2, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, LYue/ۥۣۢۡۢ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۢ;

    iget-object p1, p1, LYue/ۥۣۢۡۢ;->ۥ۟:LYue/ۥۡۦۦ۟;

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    const-string p1, "PackageManagerCompat"

    const-string p2, "Unable to retrieve the permission revocation setting from the backport"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method
