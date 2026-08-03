.class public final LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;
.super LYue/ۥۡۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlin.text.Regex$splitToSequence$1"
    f = "Regex.kt"
    i = {
        0x1,
        0x1,
        0x1
    }
    l = {
        0x112,
        0x11a,
        0x11e
    }
    m = "invokeSuspend"
    n = {
        "$this$sequence",
        "matcher",
        "splitCount"
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۣۢ;->ۥ۟۟۠ۡ(Ljava/lang/CharSequence;I)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e6\u06e7\u06e2;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:I

.field public ۥ۟۟۠ۦ:I

.field public synthetic ۥ۟۟۠ۧ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟۠ۨ:LYue/ۥۡۦۣۢ;

.field public final synthetic ۥ۟۟ۡ:Ljava/lang/CharSequence;

.field public final synthetic ۥ۟۟ۡ۟:I


# direct methods
.method public constructor <init>(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;ILYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e2;",
            "Ljava/lang/CharSequence;",
            "I",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e2$\u06e5\u06df\u06df\u06df\u06e0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۨ:LYue/ۥۡۦۣۢ;

    iput-object p2, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    iput p3, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ۟:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, LYue/ۥۡۦۧۢ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;

    iget-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۨ:LYue/ۥۡۦۣۢ;

    iget-object v2, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    iget v3, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ۟:I

    invoke-direct {v0, v1, v2, v3, p2}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;-><init>(LYue/ۥۡۦۣۢ;Ljava/lang/CharSequence;ILYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ۠;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:I

    iget-object v5, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v5, Ljava/util/regex/Matcher;

    iget-object v6, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast v6, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۨۢ۠;

    iget-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۨ:LYue/ۥۡۦۣۢ;

    invoke-static {v1}, LYue/ۥۡۦۣۢ;->ۥ(LYue/ۥۡۦۣۢ;)Ljava/util/regex/Pattern;

    move-result-object v1

    iget-object v5, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    invoke-virtual {v1, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    iget v5, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ۟:I

    if-eq v5, v4, :cond_9

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    move-object v6, p1

    move-object p1, v1

    move v1, v5

    :cond_5
    iget-object v7, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->start()I

    move-result v8

    invoke-interface {v7, v5, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v6, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:I

    iput v3, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:I

    invoke-virtual {v6, v5, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_6

    return-object v0

    :cond_6
    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->end()I

    move-result v5

    add-int/2addr v1, v4

    iget v7, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ۟:I

    sub-int/2addr v7, v4

    if-eq v1, v7, :cond_7

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-nez v7, :cond_5

    :cond_7
    iget-object p1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-interface {p1, v5, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:I

    invoke-virtual {v6, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_9
    :goto_2
    iget-object v1, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟ۡ:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iput v4, p0, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:I

    invoke-virtual {p1, v1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    return-object v0

    :cond_a
    :goto_3
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۨۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "Ljava/lang/String;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۡۦۣۢ$ۥ۟۟۟۠;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
