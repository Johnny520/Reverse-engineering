.class public final LYue/ۥۢۡۥ;
.super LYue/ۥۡۧۥ;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        "T::TU;>",
        "LYue/\u06e5\u06e1\u06e7\u06e5<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLYue/ۥ۟ۧۤۢ;)V
    .locals 1
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TU;>;)V"
        }
    .end annotation

    invoke-interface {p3}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-direct {p0, v0, p3}, LYue/ۥۡۧۥ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V

    iput-wide p1, p0, LYue/ۥۢۡۥ;->ۥ۟۟۠ۦ:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۡۥ;->ۥ۟۟۠ۦ:J

    invoke-static {v0, v1, p0}, LYue/ۥۢۡۥ۟;->ۥ(JLYue/ۥ۠ۦ۟ۡ;)LYue/ۥۢۡۤۨ;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۥ(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public ۥ۟۟ۧۦ()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LYue/ۥ۟۟۠ۧ;->ۥ۟۟ۧۦ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LYue/ۥۢۡۥ;->ۥ۟۟۠ۦ:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
