.class public final LYue/ۥ۟۟۠ۤ$ۥ۟۟;
.super LYue/ۥ۟۟۠ۤ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e4$\u06e5\u06df<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۨ۟;ILYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "Ljava/lang/Object;",
            ">;I",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LYue/ۥ۟۟۠ۤ$ۥ۟;-><init>(LYue/ۥۣ۟ۨ۟;I)V

    iput-object p3, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۦۥ(Ljava/lang/Object;)LYue/ۥۣ۠ۡ۟;
    .locals 2
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

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    iget-object v1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {v1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-static {v0, p1, v1}, LYue/ۥۣۡۢۥ;->ۥ(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    return-object p1
.end method
