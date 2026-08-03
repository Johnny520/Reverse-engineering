.class public Landroidx/profileinstaller/ProfileInstallReceiver$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/profileinstaller/ۥ۟۟$ۥ۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/profileinstaller/ProfileInstallReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/profileinstaller/ProfileInstallReceiver;


# direct methods
.method public constructor <init>(Landroidx/profileinstaller/ProfileInstallReceiver;)V
    .locals 0

    iput-object p1, p0, Landroidx/profileinstaller/ProfileInstallReceiver$ۥ;->ۥ:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(ILjava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget-object v0, Landroidx/profileinstaller/ۥ۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟$ۥ۟۟۟;

    invoke-interface {v0, p1, p2}, Landroidx/profileinstaller/ۥ۟۟$ۥ۟۟۟;->ۥ(ILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟(ILjava/lang/Object;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    sget-object v0, Landroidx/profileinstaller/ۥ۟۟;->ۥ۟۟۟ۢ:Landroidx/profileinstaller/ۥ۟۟$ۥ۟۟۟;

    invoke-interface {v0, p1, p2}, Landroidx/profileinstaller/ۥ۟۟$ۥ۟۟۟;->ۥ۟(ILjava/lang/Object;)V

    iget-object p2, p0, Landroidx/profileinstaller/ProfileInstallReceiver$ۥ;->ۥ:Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method
