.class public final LYue/ۥ۠۟ۢۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۨ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠۟ۢۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۠۟ۢۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    sget-object v1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    invoke-virtual {v0, v1, p1}, LYue/ۥ۟ۧۦۨ;->dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۢۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v0}, LYue/ۥ۟ۧۦۨ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
