.class public final LYue/ۥۣۡۨۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/nio/file/Path;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣۡۨۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/nio/file/Path;Ljava/lang/Object;LYue/ۥۣۡۨۢ;)V
    .locals 1
    .param p1    # Ljava/nio/file/Path;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۡۨۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "path"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۨۢ;->ۥ:Ljava/nio/file/Path;

    iput-object p2, p0, LYue/ۥۣۡۨۢ;->ۥ۟:Ljava/lang/Object;

    iput-object p3, p0, LYue/ۥۣۡۨۢ;->ۥ۟۟:LYue/ۥۣۡۨۢ;

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۢ;->ۥ۟۟۟:Ljava/util/Iterator;

    return-object v0
.end method

.method public final ۥ۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۢ;->ۥ۟:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۣۡۨۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۢ;->ۥ۟۟:LYue/ۥۣۡۨۢ;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/nio/file/Path;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۢ;->ۥ:Ljava/nio/file/Path;

    return-object v0
.end method

.method public final ۥ۟۟۟۟(Ljava/util/Iterator;)V
    .locals 0
    .param p1    # Ljava/util/Iterator;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e1\u06e3\u06e8\u06e2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۨۢ;->ۥ۟۟۟:Ljava/util/Iterator;

    return-void
.end method
