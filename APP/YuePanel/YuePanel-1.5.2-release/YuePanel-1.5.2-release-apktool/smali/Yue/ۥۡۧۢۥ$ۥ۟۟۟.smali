.class public LYue/ۥۡۧۢۥ$ۥ۟۟۟;
.super LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۢۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e0<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Z

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۧۢۥ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ;

    invoke-direct {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Z

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 3

    iget-boolean v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ;

    iget-object v0, v0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v0, :cond_2

    iget-object v0, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۡۧۢۥ$ۥ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۡۧۢۥ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Z

    :cond_1
    return-void
.end method

.method public ۥ۟()Ljava/util/Map$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-boolean v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۤ:Z

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ;

    iget-object v0, v0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    goto :goto_1

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v0, :cond_1

    iget-object v0, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :goto_1
    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0
.end method
