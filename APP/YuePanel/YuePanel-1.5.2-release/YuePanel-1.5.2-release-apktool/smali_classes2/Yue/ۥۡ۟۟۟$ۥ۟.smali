.class public final LYue/ۥۡ۟۟۟$ۥ۟;
.super LYue/ۥ۟۟۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡ۟۟۟;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e0\u06e6<",
        "LYue/\u06e5\u06e0\u06e8\u06e8\u06e8;",
        ">;",
        "LYue/\u06e5\u06e1\u06df;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;


# direct methods
.method public constructor <init>(LYue/ۥۡ۟۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡ۟۟۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;

    invoke-direct {p0}, LYue/ۥ۟۟۠ۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, LYue/ۥ۠ۨۨۨ;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LYue/ۥ۠ۨۨۨ;

    invoke-virtual {p0, p1}, LYue/ۥۡ۟۟۟$ۥ۟;->ۥ۟(LYue/ۥ۠ۨۨۨ;)Z

    move-result p1

    return p1
.end method

.method public get(I)LYue/ۥ۠ۨۨۨ;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .line 1
    iget-object v0, p0, LYue/ۥۡ۟۟۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;

    invoke-static {v0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟(LYue/ۥۡ۟۟۟;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥۡۦۣۤ;->ۥ۟۟۟(Ljava/util/regex/MatchResult;I)LYue/ۥ۠ۥۣۨ;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠۟()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ltz v1, :cond_0

    .line 3
    new-instance v1, LYue/ۥ۠ۨۨۨ;

    iget-object v2, p0, LYue/ۥۡ۟۟۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;

    invoke-static {v2}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟(LYue/ۥۡ۟۟۟;)Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/regex/MatchResult;->group(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "matchResult.group(index)"

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, v0}, LYue/ۥ۠ۨۨۨ;-><init>(Ljava/lang/String;LYue/ۥ۠ۥۣۨ;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method

.method public get(Ljava/lang/String;)LYue/ۥ۠ۨۨۨ;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, LYue/ۥۡۤۡۥ;->ۥ:LYue/ۥۡۤۡۤ;

    iget-object v1, p0, LYue/ۥۡ۟۟۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;

    invoke-static {v1}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟(LYue/ۥۡ۟۟۟;)Ljava/util/regex/MatchResult;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LYue/ۥۡۤۡۤ;->ۥ۟۟(Ljava/util/regex/MatchResult;Ljava/lang/String;)LYue/ۥ۠ۨۨۨ;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e0\u06e8\u06e8\u06e8;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۥۣۡ;->ۥ۟۟ۡۤ(Ljava/util/Collection;)LYue/ۥ۠ۥۣۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠۠۠(Ljava/lang/Iterable;)LYue/ۥۡۨۢ;

    move-result-object v0

    new-instance v1, LYue/ۥۡ۟۟۟$ۥ۟$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۡ۟۟۟$ۥ۟$ۥ;-><init>(LYue/ۥۡ۟۟۟$ۥ۟;)V

    invoke-static {v0, v1}, LYue/ۥۡۨۢۦ;->ۥ۟۠۟(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۟۟۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡ۟۟۟;

    invoke-static {v0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟(LYue/ۥۡ۟۟۟;)Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->groupCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge ۥ۟(LYue/ۥ۠ۨۨۨ;)Z
    .locals 0

    invoke-super {p0, p1}, LYue/ۥ۟۟۠ۦ;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
