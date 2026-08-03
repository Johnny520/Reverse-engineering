.class public abstract LYue/ۥ۟۟۠ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۥ$ۥ۟;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation


# instance fields
.field private final key:LYue/ۥ۟ۧۦۥ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟۠ۨ;->key:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۨ;->key:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    return-object v0
.end method

.method public minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method

.method public plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method
