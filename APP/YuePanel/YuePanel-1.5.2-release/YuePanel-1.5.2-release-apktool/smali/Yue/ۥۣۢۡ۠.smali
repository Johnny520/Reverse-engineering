.class public LYue/ۥۣۢۡ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:LYue/ۥ۠ۥ۟ۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥ۟ۧ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۢۡ۠;->ۥ:LYue/ۥ۠ۥ۟ۧ;

    return-void
.end method


# virtual methods
.method public ۥ(ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۡ۠;->ۥ:LYue/ۥ۠ۥ۟ۧ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۠ۥ۟ۧ;->ۥ۟۟۟۟(ZZ)V

    return-void
.end method
