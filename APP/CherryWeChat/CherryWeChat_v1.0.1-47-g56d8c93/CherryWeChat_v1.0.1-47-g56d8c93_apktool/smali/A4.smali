.class public final LA4;
.super Lcr;
.source ""


# static fields
.field public static volatile g:LA4;


# instance fields
.field public final f:Lpd;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lpd;

    invoke-direct {v0}, Lpd;-><init>()V

    iput-object v0, p0, LA4;->f:Lpd;

    return-void
.end method

.method public static X()LA4;
    .locals 2

    sget-object v0, LA4;->g:LA4;

    if-eqz v0, :cond_0

    sget-object v0, LA4;->g:LA4;

    return-object v0

    :cond_0
    const-class v0, LA4;

    monitor-enter v0

    :try_start_0
    sget-object v1, LA4;->g:LA4;

    if-nez v1, :cond_1

    new-instance v1, LA4;

    invoke-direct {v1}, LA4;-><init>()V

    sput-object v1, LA4;->g:LA4;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, LA4;->g:LA4;

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
