.class public final LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۤ۠$ۥ۟۟;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "Ljava/lang/Throwable;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۦۣ۟;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۦۣ۟;LYue/ۥۣۣ۠ۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e3\u06df;",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۦۣ۟;

    iput-object p2, p0, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥ۟۟(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۦۣ۟;

    invoke-interface {p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۦۣ۟;

    new-instance v0, LYue/ۥ۟۟۠ۡ;

    iget-object v1, p0, LYue/ۥ۟ۥۤ۠$ۥ۟۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۠ۢ;

    invoke-direct {v0, v1}, LYue/ۥ۟۟۠ۡ;-><init>(LYue/ۥۣۣ۠ۢ;)V

    invoke-interface {p1, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method
