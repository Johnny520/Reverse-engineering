.class public LYue/ۥۢۥۢ۟$ۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۥۢ۟$ۥ;-><init>(LYue/ۥۢۥۢ۟;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۥۢ۟;

.field public final synthetic ۥ۟:LYue/ۥۢۥۢ۟$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۢ۟$ۥ;LYue/ۥۢۥۢ۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۥۢ۟$ۥ$ۥ;->ۥ۟:LYue/ۥۢۥۢ۟$ۥ;

    iput-object p2, p0, LYue/ۥۢۥۢ۟$ۥ$ۥ;->ۥ:LYue/ۥۢۥۢ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۥۢ۟$ۥ$ۥ;->ۥ۟:LYue/ۥۢۥۢ۟$ۥ;

    iget-object v0, v0, LYue/ۥۢۥۢ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۢۥۢ۟;

    invoke-static {v0}, LYue/ۥۢۥۢ۟;->ۥۣ۟۟ۦ(LYue/ۥۢۥۢ۟;)LYue/ۥ۠ۨۡۥ;

    move-result-object v0

    const-string v1, "Uncaught exception in thread {}: {}"

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, LYue/ۥ۠ۨۡۥ;->ۥۣ۟۟۠(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
