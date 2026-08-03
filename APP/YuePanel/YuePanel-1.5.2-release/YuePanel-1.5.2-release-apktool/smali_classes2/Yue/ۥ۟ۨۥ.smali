.class public final LYue/ۥ۟ۨۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.7"
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥ۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۣ۠ۢۤ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "LYue/\u06e5\u06df\u06e8\u06e5\u06e0<",
            "TT;TR;>;TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۤ;)V
    .locals 1
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "LYue/\u06e5\u06df\u06e8\u06e5\u06e0<",
            "TT;TR;>;-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۨۥ;->ۥ:LYue/ۥۣ۠ۢۤ;

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣ۠ۢۤ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "LYue/\u06e5\u06df\u06e8\u06e5\u06e0<",
            "TT;TR;>;TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۨۥ;->ۥ:LYue/ۥۣ۠ۢۤ;

    return-object v0
.end method
