.class public LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;->onPreExecute()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ;->ۥ:LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ;->ۥ:LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;

    iget-object v0, v0, LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;->ۥ۟۟۟۟:LYue/ۥۡۥ۠ۥ$ۥ۟۟۟;

    invoke-virtual {v0}, LYue/ۥۡۥ۠ۥ$ۥ۟۟۟;->ۥ()V

    iget-object v0, p0, LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ$ۥ;->ۥ:LYue/ۥۡۥ۠ۥ$ۥ۟۟۟$ۥ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    return-void
.end method
