.class public final LYue/ۥۡ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡ۟۟;


# instance fields
.field public final ۥ:Ljava/util/regex/Matcher;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Ljava/lang/CharSequence;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1
    .param p1    # Ljava/util/regex/Matcher;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "matcher"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡ۟۟۟;->ۥ:Ljava/util/regex/Matcher;

    iput-object p2, p0, LYue/ۥۡ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    new-instance p1, LYue/ۥۡ۟۟۟$ۥ۟;

    invoke-direct {p1, p0}, LYue/ۥۡ۟۟۟$ۥ۟;-><init>(LYue/ۥۡ۟۟۟;)V

    iput-object p1, p0, LYue/ۥۡ۟۟۟;->ۥ۟۟:LYue/ۥۡ;

    return-void
.end method

.method public static final synthetic ۥ۟۟۟(LYue/ۥۡ۟۟۟;)Ljava/util/regex/MatchResult;
    .locals 0

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getRange()LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۣۤ;->ۥ۟۟(Ljava/util/regex/MatchResult;)LYue/ۥ۠ۥۣۨ;

    move-result-object v0

    return-object v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->group()Ljava/lang/String;

    move-result-object v0

    const-string v1, "matchResult.group()"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public next()LYue/ۥۡ۟۟;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/regex/MatchResult;->end()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/regex/MatchResult;->end()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥۡ۟۟۟;->ۥ۟۟۟۟()Ljava/util/regex/MatchResult;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/regex/MatchResult;->start()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    iget-object v1, p0, LYue/ۥۡ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-gt v0, v1, :cond_1

    iget-object v1, p0, LYue/ۥۡ۟۟۟;->ۥ:Ljava/util/regex/Matcher;

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->pattern()Ljava/util/regex/Pattern;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    const-string v2, "matcher.pattern().matcher(input)"

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LYue/ۥۡ۟۟۟;->ۥ۟:Ljava/lang/CharSequence;

    invoke-static {v1, v0, v2}, LYue/ۥۡۦۣۤ;->ۥ(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LYue/ۥۡ۟۟;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public ۥ()LYue/ۥۡ۟۟$ۥ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡ۟۟$ۥ;->ۥ(LYue/ۥۡ۟۟;)LYue/ۥۡ۟۟$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۡ۟۟۟$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡ۟۟۟$ۥ;-><init>(LYue/ۥۡ۟۟۟;)V

    iput-object v0, p0, LYue/ۥۡ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    :cond_0
    iget-object v0, p0, LYue/ۥۡ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡ۟۟۟;->ۥ۟۟:LYue/ۥۡ;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/util/regex/MatchResult;
    .locals 1

    iget-object v0, p0, LYue/ۥۡ۟۟۟;->ۥ:Ljava/util/regex/Matcher;

    return-object v0
.end method
