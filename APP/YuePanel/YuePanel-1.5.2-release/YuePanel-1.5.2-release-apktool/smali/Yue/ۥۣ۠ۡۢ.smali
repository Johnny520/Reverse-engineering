.class public final LYue/ۥۣ۠ۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۠ۡۢ$ۥ;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/os/Handler;)Ljava/util/concurrent/Executor;
    .locals 1
    .param p0    # Landroid/os/Handler;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۡۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣ۠ۡۢ$ۥ;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method
