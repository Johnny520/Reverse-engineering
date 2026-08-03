.class public final LYue/ۥ۟ۦۦ۟$ۥ۟۟;
.super LYue/ۥ۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e2<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TK;TV;TE;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۦۦ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e6\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۦۦ۟;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۦۦ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TK;-TV;+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۦۦ۟;

    invoke-direct {p0}, LYue/ۥ۟۟ۢ;-><init>()V

    iput-object p2, p0, LYue/ۥ۟ۦۦ۟$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ۟۟()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۦۦ۟;

    iget-object v0, v0, LYue/ۥ۟ۦۦ۟;->core:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۦۦ۟$ۥ;

    iget-object v1, p0, LYue/ۥ۟ۦۦ۟$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۣ۠ۢۢ;

    invoke-virtual {v0, v1}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۢ;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥ۟ۦۦ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۡۨ;->size()I

    move-result v0

    return v0
.end method
