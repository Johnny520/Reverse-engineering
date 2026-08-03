.class public final LIm;
.super LFw;
.source ""

# interfaces
.implements Lkotlin/Function;


# instance fields
.field public c:I

.field public synthetic d:LMc;

.field public final synthetic e:Ln;


# direct methods
.method public constructor <init>(Ln;LEb;)V
    .locals 0

    iput-object p1, p0, LIm;->e:Ln;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, LFw;-><init>(ILEb;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LIm;->e:Ln;

    iget-object v1, v0, Ln;->c:Ljava/lang/Object;

    check-cast v1, Loz;

    iget v2, p0, LIm;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LOj;->T(Ljava/lang/Object;)V

    iget-object p1, p0, LIm;->d:LMc;

    invoke-virtual {v1}, Loz;->p()B

    move-result v2

    if-ne v2, v3, :cond_2

    invoke-virtual {v0, v3}, Ln;->f(Z)Lkotlinx/serialization/json/d;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v4, 0x0

    if-nez v2, :cond_3

    invoke-virtual {v0, v4}, Ln;->f(Z)Lkotlinx/serialization/json/d;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 v5, 0x6

    if-ne v2, v5, :cond_5

    iput v3, p0, LIm;->c:I

    invoke-static {v0, p1, p0}, Ln;->a(Ln;LMc;Lu5;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lgc;->a:Lgc;

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Lkotlinx/serialization/json/b;

    return-object p1

    :cond_5
    const/16 p1, 0x8

    if-ne v2, p1, :cond_6

    invoke-virtual {v0}, Ln;->e()Lkotlinx/serialization/json/a;

    move-result-object p1

    return-object p1

    :cond_6
    const-string p1, "Can\'t begin reading element, unexpected token"

    invoke-static {v1, p1, v4, v5}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 p1, 0x0

    throw p1
.end method
