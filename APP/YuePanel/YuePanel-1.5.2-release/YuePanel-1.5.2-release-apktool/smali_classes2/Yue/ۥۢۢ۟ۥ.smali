.class public final LYue/ۥۢۢ۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡۨۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TR;>;)V"
        }
    .end annotation

    const-string v0, "sequence"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformer"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۢ۟ۥ;->ۥ:LYue/ۥۡۨۢ;

    iput-object p2, p0, LYue/ۥۢۢ۟ۥ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥۢۢ۟ۥ;)LYue/ۥۡۨۢ;
    .locals 0

    iget-object p0, p0, LYue/ۥۢۢ۟ۥ;->ۥ:LYue/ۥۡۨۢ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۢۢ۟ۥ;)LYue/ۥۣ۠ۡ۟;
    .locals 0

    iget-object p0, p0, LYue/ۥۢۢ۟ۥ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TR;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۢ۟ۥ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۢ۟ۥ$ۥ;-><init>(LYue/ۥۢۢ۟ۥ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
    .locals 3
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TR;+",
            "Ljava/util/Iterator<",
            "+TE;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "iterator"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۢۢ۟;

    iget-object v1, p0, LYue/ۥۢۢ۟ۥ;->ۥ:LYue/ۥۡۨۢ;

    iget-object v2, p0, LYue/ۥۢۢ۟ۥ;->ۥ۟:LYue/ۥۣ۠ۡ۟;

    invoke-direct {v0, v1, v2, p1}, LYue/ۥ۠ۢۢ۟;-><init>(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method
