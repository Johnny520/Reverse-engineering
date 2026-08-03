.class public final LYue/ۥ۟ۨۤ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۤۢ;
.implements LYue/ۥ۟ۧۧۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۨۤ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

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
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥۣ۟ۨۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۧۧۨ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;LYue/ۥۣ۟ۨۥ;LYue/ۥ۟ۧۧۨ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۨۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e8\u06e3\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    iput-object p2, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۨۥ;

    iput-object p3, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۧۨ;

    return-void
.end method


# virtual methods
.method public getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۧۨ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۧۧۨ;->getCallerFrame()LYue/ۥ۟ۧۧۨ;

    move-result-object v0

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

    iget-object v0, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۧۨ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۧۧۨ;->getStackTraceElement()Ljava/lang/StackTraceElement;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۟ۨۤ۟;->ۥ:LYue/ۥ۟ۨۤ۟;

    invoke-static {v0, p0}, LYue/ۥ۟ۨۤ۟;->ۥ۟۟(LYue/ۥ۟ۨۤ۟;LYue/ۥ۟ۨۤ۟$ۥ;)V

    iget-object v0, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۤ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۤۢ;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
