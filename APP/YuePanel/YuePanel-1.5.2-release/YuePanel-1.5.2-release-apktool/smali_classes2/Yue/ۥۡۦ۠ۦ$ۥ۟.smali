.class public final LYue/ۥۡۦ۠ۦ$ۥ۟;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦ۠ۦ;-><init>(LYue/ۥۢۡ۟ۢ;IJLjava/util/concurrent/TimeUnit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥۡۦ۠ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦ۠ۦ;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, LYue/ۥۡۦ۠ۦ$ۥ۟;->ۥ۟۟۟۟:LYue/ۥۡۦ۠ۦ;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p2, v1, p1, v0}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 3

    iget-object v0, p0, LYue/ۥۡۦ۠ۦ$ۥ۟;->ۥ۟۟۟۟:LYue/ۥۡۦ۠ۦ;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۦ۠ۦ;->ۥ۟(J)J

    move-result-wide v0

    return-wide v0
.end method
