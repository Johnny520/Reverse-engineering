.class public final LYue/ۥۣ۠۟ۧ;
.super LYue/ۥ۟۟ۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "K:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e1<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;TK;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:Ljava/util/HashSet;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Iterator;LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # Ljava/util/Iterator;
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
            "Ljava/util/Iterator<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TK;>;)V"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keySelector"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۡ;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    iput-object p2, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۧ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 3

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۣ۠۟ۧ;->ۥ۟۟۠ۧ:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥ۟۟ۡۡ;->ۥ۟۟(Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۟۟ۡۡ;->ۥ۟()V

    return-void
.end method
