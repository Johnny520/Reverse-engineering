.class public final LYue/ۥۣۡۨۦ;
.super LYue/ۥ۟۟ۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements LYue/ۥ۠ۦۣۨ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۨۦ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e2<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;",
        "Ljava/io/Serializable;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e8;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۣۡۨۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۥ:LYue/ۥۣۡۨۦ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TE;*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣۡۨۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣۡۨۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣۡۨۦ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۨۦ$ۥ;

    new-instance v0, LYue/ۥۣۡۨۦ;

    sget-object v1, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۡۤ:LYue/ۥ۠ۨۦۨ$ۥ;

    invoke-virtual {v1}, LYue/ۥ۠ۨۦۨ$ۥ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۣۡۨۦ;-><init>(LYue/ۥ۠ۨۦۨ;)V

    sput-object v0, LYue/ۥۣۡۨۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۨۦ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, LYue/ۥ۠ۨۦۨ;

    invoke-direct {v0}, LYue/ۥ۠ۨۦۨ;-><init>()V

    invoke-direct {p0, v0}, LYue/ۥۣۡۨۦ;-><init>(LYue/ۥ۠ۨۦۨ;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    new-instance v0, LYue/ۥ۠ۨۦۨ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۨۦۨ;-><init>(I)V

    invoke-direct {p0, v0}, LYue/ۥۣۡۨۦ;-><init>(LYue/ۥ۠ۨۦۨ;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۨۦۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TE;*>;)V"
        }
    .end annotation

    const-string v0, "backing"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, LYue/ۥ۟۟ۢ;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-void
.end method

.method private final ۥ۟۟()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۡۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣۡۨ;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۨ;-><init>(Ljava/util/Collection;I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    const-string v1, "The set cannot be serialized while it is being built."

    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥۣ۟۟۟(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TE;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥۣ۟۟ۡ()LYue/ۥ۠ۨۦۨ$ۥ۟۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۢ۠(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->size()I

    move-result v0

    return v0
.end method

.method public final ۥ۟()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۨۦ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۥ()Ljava/util/Map;

    invoke-virtual {p0}, LYue/ۥ۟۟ۢ;->size()I

    move-result v0

    if-lez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    sget-object v0, LYue/ۥۣۡۨۦ;->ۥ۟۟۠ۥ:LYue/ۥۣۡۨۦ;

    :goto_0
    return-object v0
.end method
