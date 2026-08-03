.class public LYue/ۥۢۢۡۡ$ۥ۟۟;
.super LYue/ۥۢۢ۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۢۡۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۢۢۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥۢۢۡۡ;)V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢۢ۠ۧ;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟۟;->ۥ:LYue/ۥۢۢۡۡ;

    return-void
.end method


# virtual methods
.method public onTransitionEnd(LYue/ۥۢۢ۟ۧ;)V
    .locals 2
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۢۡۡ$ۥ۟۟;->ۥ:LYue/ۥۢۢۡۡ;

    iget v1, v0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۥ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۥ:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۦ:Z

    invoke-virtual {v0}, LYue/ۥۢۢ۟ۧ;->end()V

    :cond_0
    invoke-virtual {p1, p0}, LYue/ۥۢۢ۟ۧ;->removeListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    return-void
.end method

.method public onTransitionStart(LYue/ۥۢۢ۟ۧ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢ۟ۧ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟۟;->ۥ:LYue/ۥۢۢۡۡ;

    iget-boolean v0, p1, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۦ:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۢ۟ۧ;->start()V

    iget-object p1, p0, LYue/ۥۢۢۡۡ$ۥ۟۟;->ۥ:LYue/ۥۢۢۡۡ;

    const/4 v0, 0x1

    iput-boolean v0, p1, LYue/ۥۢۢۡۡ;->ۥ۟۟۠ۦ:Z

    :cond_0
    return-void
.end method
