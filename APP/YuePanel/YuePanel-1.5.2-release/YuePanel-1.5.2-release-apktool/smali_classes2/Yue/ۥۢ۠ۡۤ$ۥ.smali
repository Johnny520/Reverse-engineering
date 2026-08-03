.class public LYue/ۥۢ۠ۡۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۡۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/StringBuilder;

.field public final ۥ۟:Ljava/lang/String;

.field public ۥ۟۟:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LYue/ۥۢ۠ۡۤ;->ۥ۟()Ljava/lang/StringBuilder;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ۟۟:Z

    iput-object p1, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ۟:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/Object;)LYue/ۥۢ۠ۡۤ$ۥ;
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-boolean v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ۟۟:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 p1, 0x0

    iput-boolean p1, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ۟۟:Z

    return-object p0
.end method

.method public ۥ۟(Ljava/lang/Object;)LYue/ۥۢ۠ۡۤ$ۥ;
    .locals 1

    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۢ۠ۡۤ;->ۥ۟۟۠۠(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۢ۠ۡۤ$ۥ;->ۥ:Ljava/lang/StringBuilder;

    return-object v0
.end method
