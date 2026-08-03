.class public LYue/ۥۢۢۡۡ$ۥ۟;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢۡۡ;->prepareAnimatorsForSeeking()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۢۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢۡۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟;->ۥ:LYue/ۥۢۢۡۡ;

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public onTransitionCancel(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۢۡۡ$ۥ۟;->ۥ:LYue/ۥۢۢۡۡ;

    iget-object v0, v0, LYue/ۥۢۢۡۡ;->ۥۣ۟۟۠:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟;->ۥ:LYue/ۥۢۢۡۡ;

    invoke-virtual {p1}, LYue/ۥۢۢۡۡ;->hasAnimators()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟;->ۥ:LYue/ۥۢۢۡۡ;

    sget-object v0, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ۟۟:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    iget-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟;->ۥ:LYue/ۥۢۢۡۡ;

    const/4 v0, 0x1

    iput-boolean v0, p1, LYue/ۥۢۢ۟ۧ;->mEnded:Z

    sget-object v0, LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;->ۥ۟:LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;

    invoke-virtual {p1, v0, v1}, LYue/ۥۢۢ۟ۧ;->notifyListeners(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۥ;Z)V

    :cond_0
    return-void
.end method
