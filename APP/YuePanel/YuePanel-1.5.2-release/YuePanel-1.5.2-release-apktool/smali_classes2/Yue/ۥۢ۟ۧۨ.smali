.class public LYue/ۥۢ۟ۧۨ;
.super LYue/ۥ۟۟۠ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e0\u06e7<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;Z)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LYue/ۥ۟۟۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;ZZ)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟۟۠ۧ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
