.class public LYue/ۥ۟۟ۢۢ$ۥ۟;
.super LYue/ۥ۠ۨ۠ۥ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df<",
        "LYue/\u06e5\u06df\u06df\u06e2\u06e2$\u06e5<",
        "+TE;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۨ۠;Ljava/lang/Object;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e3;",
            "TE;)V"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟۟ۢۢ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥ۟۟ۢۢ$ۥ;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, LYue/ۥ۠ۨ۠ۥ$ۥ۟;-><init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۥ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p1, LYue/ۥۡۦۡۢ;

    if-eqz p1, :cond_1

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
