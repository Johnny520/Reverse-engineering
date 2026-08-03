.class public final LYue/ۥ۠ۡۡۡ$ۥ۟;
.super LYue/ۥ۠ۡۡۡ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/lang/Runnable;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLjava/lang/Runnable;)V
    .locals 0
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2}, LYue/ۥ۠ۡۡۡ$ۥ۟۟;-><init>(J)V

    iput-object p3, p0, LYue/ۥ۠ۡۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۡۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LYue/ۥ۠ۡۡۡ$ۥ۟۟;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۡۡۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
