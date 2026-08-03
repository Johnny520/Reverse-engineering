.class public final LYue/ۥ۟ۥۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۥ;
.implements Ljava/io/Serializable;


# annotations
.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۥۤۡ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ$ۥ۟;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "left"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    iput-object p2, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    return-void
.end method

.method private final ۥ۟۟۟ۡ()I
    .locals 3

    const/4 v0, 0x2

    move-object v1, p0

    :goto_0
    iget-object v1, v1, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    instance-of v2, v1, LYue/ۥ۟ۥۤۡ;

    if-eqz v2, :cond_0

    check-cast v1, LYue/ۥ۟ۥۤۡ;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-eq p0, p1, :cond_1

    instance-of v0, p1, LYue/ۥ۟ۥۤۡ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۥۤۡ;

    invoke-direct {p1}, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۟ۡ()I

    move-result v0

    invoke-direct {p0}, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۟ۡ()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, p0}, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۟۠(LYue/ۥ۟ۥۤۡ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 1
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "operation"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-interface {v0, p1, p2}, LYue/ۥ۟ۧۦۥ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-interface {p2, p1, v0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    iget-object v1, v0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-interface {v1, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v0, v0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    instance-of v1, v0, LYue/ۥ۟ۥۤۡ;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥ۟ۥۤۡ;

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۦۥ;->minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    if-ne p1, v0, :cond_1

    move-object p1, p0

    goto :goto_0

    :cond_1
    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    goto :goto_0

    :cond_2
    new-instance v0, LYue/ۥ۟ۥۤۡ;

    iget-object v1, p0, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-direct {v0, p1, v1}, LYue/ۥ۟ۥۤۡ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ$ۥ۟;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ;->ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ""

    sget-object v2, LYue/ۥ۟ۥۤۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۥۤۡ$ۥ۟;

    invoke-virtual {p0, v1, v2}, LYue/ۥ۟ۥۤۡ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;)Z
    .locals 1

    invoke-interface {p1}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۥۤۡ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟۠(LYue/ۥ۟ۥۤۡ;)Z
    .locals 1

    :goto_0
    iget-object v0, p1, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, v0}, LYue/ۥ۟ۥۤۡ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p1, LYue/ۥ۟ۥۤۡ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    instance-of v0, p1, LYue/ۥ۟ۥۤۡ;

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥ۟ۥۤۡ;

    goto :goto_0

    :cond_1
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۥۤۡ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;)Z

    move-result p1

    return p1
.end method

.method public final ۥۣ۟۟۟()Ljava/lang/Object;
    .locals 5

    invoke-direct {p0}, LYue/ۥ۟ۥۤۡ;->ۥ۟۟۟ۡ()I

    move-result v0

    new-array v1, v0, [LYue/ۥ۟ۧۦۥ;

    new-instance v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;

    invoke-direct {v2}, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;-><init>()V

    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    new-instance v4, LYue/ۥ۟ۥۤۡ$ۥ۟۟;

    invoke-direct {v4, v1, v2}, LYue/ۥ۟ۥۤۡ$ۥ۟۟;-><init>([LYue/ۥ۟ۧۦۥ;LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;)V

    invoke-virtual {p0, v3, v4}, LYue/ۥ۟ۥۤۡ;->fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    iget v2, v2, LYue/ۥۡۦۢۥ$ۥ۟۟۟۠;->ۥۣ۟۟۠:I

    if-ne v2, v0, :cond_0

    new-instance v0, LYue/ۥ۟ۥۤۡ$ۥ;

    invoke-direct {v0, v1}, LYue/ۥ۟ۥۤۡ$ۥ;-><init>([LYue/ۥ۟ۧۦۥ;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
