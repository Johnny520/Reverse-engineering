.class public LYue/ۥۣۡۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

.field public ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

.field public ۥ۟۟۠ۦ:LYue/ۥۣۡۢۤ;

.field public ۥ۟۟۠ۧ:LYue/ۥۣۡۢۤ;

.field public final ۥ۟۟۠ۨ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۡۢۤ;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            "Ljava/lang/Class<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    invoke-static {p2}, LYue/ۥۣۢۥ۠;->ۥ۟۟۠(Ljava/lang/Object;)V

    iput-object p2, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۨ:Ljava/lang/Class;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۢۦ;->ۥ۟۟۟ۡ(LYue/ۥۣۡۢۤ;)V

    return-void
.end method

.method public static ۥ۟(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۦ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ")",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e6<",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۢۦ;

    const-class v1, LYue/ۥۣۡۢۤ;

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۢۦ;-><init>(LYue/ۥۣۡۢۤ;Ljava/lang/Class;)V

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۦ;->ۥ۟۟()V

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣۡۢۦ;->ۥ۟۟۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۤۡ()V

    return-void
.end method

.method public final ۥ()LYue/ۥۣۡۢۤ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    :cond_0
    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟۠ۢ()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۣۡۢۤ;->ۥ۟۟۠۠(I)LYue/ۥۣۡۢۤ;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥۣۡۢۦ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    invoke-virtual {v1, v0}, LYue/ۥۣۡۢۤ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, v2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, LYue/ۥۣۡۢۦ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    invoke-virtual {v1, v0}, LYue/ۥۣۡۢۤ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢۦ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_5

    return-object v2

    :cond_5
    iget-object v1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۨ:Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_6
    :goto_1
    return-object v2
.end method

.method public final ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۢۤ;

    if-eqz v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥ۟۟ۢ۟()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۢۤ;

    iput-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    :cond_1
    invoke-virtual {p0}, LYue/ۥۣۡۢۦ;->ۥ()LYue/ۥۣۡۢۤ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    return-void
.end method

.method public ۥ۟۟۟()LYue/ۥۣۡۢۤ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۡۢۦ;->ۥ۟۟()V

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    iput-object v1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۢۤ;

    iput-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    invoke-virtual {v0}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۦ()LYue/ۥۣۡۢۤ;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۢۤ;

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥۣۡۢۤ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۨ:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۢۤ;

    :cond_0
    iput-object p1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۢۤ;

    iput-object p1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۦ:LYue/ۥۣۡۢۤ;

    iput-object p1, p0, LYue/ۥۣۡۢۦ;->ۥۣ۟۟۠:LYue/ۥۣۡۢۤ;

    invoke-virtual {p1}, LYue/ۥۣۡۢۤ;->ۥۣ۟۟ۦ()LYue/ۥۣۡۢۤ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۡۢۦ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۢۤ;

    return-void
.end method
