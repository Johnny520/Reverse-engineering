.class public final LYue/ۥۢ۟ۧۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۤۢ;
.implements LYue/ۥ۟ۧۧۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢ۟ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    iput-object p2, p0, LYue/ۥۢ۟ۧۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    return-void
.end method


# virtual methods
.method public getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    instance-of v1, v0, LYue/ۥ۟ۧۧۨ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢ۟ۧۤ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢ۟ۧۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
