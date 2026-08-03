.class public abstract LYue/ۥۡۦۡ۠;
.super LYue/ۥ۠ۨ۠ۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۦۡۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e2<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۨ۠ۥ;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟۠ۥ()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۦۡ۠;->ۥ۟۟ۦۤ()LYue/ۥۢ۠ۦۢ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۤ()LYue/ۥۢ۠ۦۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public ۥ۟۟ۦۥ(Ljava/lang/Object;)LYue/ۥۣ۠ۡ۟;
    .locals 0
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V
    .param p1    # LYue/ۥ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5<",
            "*>;)V"
        }
    .end annotation
.end method
