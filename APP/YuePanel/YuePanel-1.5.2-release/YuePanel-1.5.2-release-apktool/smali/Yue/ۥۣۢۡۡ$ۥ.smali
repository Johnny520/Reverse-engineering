.class public LYue/ۥۣۢۡۡ$ۥ;
.super LYue/ۥ۠ۥ۟ۨ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟ۡ:LYue/ۥۣۢۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢۡۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۡ;

    invoke-direct {p0}, LYue/ۥ۠ۥ۟ۨ$ۥ۟;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟(LYue/ۥ۠ۥ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۥ۟ۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, LYue/ۥۣۢۡ۠;

    invoke-direct {v0, p1}, LYue/ۥۣۢۡ۠;-><init>(LYue/ۥ۠ۥ۟ۧ;)V

    iget-object p1, p0, LYue/ۥۣۢۡۡ$ۥ;->ۥ۟۟۟ۡ:LYue/ۥۣۢۡۡ;

    invoke-virtual {p1, v0}, LYue/ۥۣۢۡۡ;->ۥ(LYue/ۥۣۢۡ۠;)V

    return-void
.end method
