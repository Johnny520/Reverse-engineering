.class public LYue/ۥۢۡۧ۠$ۥ۟۟;
.super LYue/ۥۢۡۧ۠;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ۟۟۠ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;->ۥ۟۟۠ۧ:LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LYue/ۥۢۡۧ۠;-><init>(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;LYue/ۥۢۡۧ۠$ۥ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟ۡ۟()LYue/ۥۢۡۧ۠$ۥ۟۟;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟ۡۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;
    .locals 1

    invoke-super {p0}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟ۡ۟()LYue/ۥۢۡۧ۠$ۥ۟۟;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۡۧ۠$ۥ۟۟;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۢۡۧ۠$ۥ۟۟;
    .locals 0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public ۥ۟۟ۡۡ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    return-object v0
.end method
