.class public LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۢۦۤ$ۥ۟۟۟ۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e4"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:I

.field public final ۥ۟۟:Ljava/lang/String;

.field public final ۥ۟۟۟:Landroid/app/Notification;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ:Ljava/lang/String;

    iput p2, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟:I

    iput-object p3, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/lang/String;

    iput-object p4, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟:Landroid/app/Notification;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NotifyTask["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "packageName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥ۠ۥ۟ۢ;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ:Ljava/lang/String;

    iget v1, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟:I

    iget-object v2, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟۟:Ljava/lang/String;

    iget-object v3, p0, LYue/ۥۡۢۦۤ$ۥ۟۟۟ۤ;->ۥ۟۟۟:Landroid/app/Notification;

    invoke-interface {p1, v0, v1, v2, v3}, LYue/ۥ۠ۥ۟ۢ;->ۥ۟۟۟۠(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    return-void
.end method
