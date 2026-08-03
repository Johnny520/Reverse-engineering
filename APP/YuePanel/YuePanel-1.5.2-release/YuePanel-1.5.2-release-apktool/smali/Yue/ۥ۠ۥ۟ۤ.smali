.class public interface abstract LYue/ۥ۠ۥ۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۥ۟ۤ$ۥ۟۟;,
        LYue/ۥ۠ۥ۟ۤ$ۥ۟;,
        LYue/ۥ۠ۥ۟ۤ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$v4$os$IResultReceiver"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۥ۟ۤ;->ۥ۟۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract ۥ(ILandroid/os/Bundle;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method
