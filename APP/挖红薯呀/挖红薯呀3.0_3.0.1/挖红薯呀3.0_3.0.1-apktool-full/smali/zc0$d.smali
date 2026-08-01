.class final Lzc0$d;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc0;->B0(Llf1;ZLsw;Lpe0;IZLji;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm51;",
        "Lww;"
    }
.end annotation

.annotation runtime Ljl;
    c = "top.anjao2024.xp1whs.MainActivityKt$MainScreen$2$2$1"
    f = "MainActivity.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field h:I

.field final synthetic i:Llo0;

.field final synthetic j:Lwg0;


# direct methods
.method public constructor <init>(Llo0;Lwg0;Lik;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0;",
            "Lwg0;",
            "Lik;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lzc0$d;->i:Llo0;

    .line 2
    .line 3
    iput-object p2, p0, Lzc0$d;->j:Lwg0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lm51;-><init>(ILik;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lik;",
            ")",
            "Lik;"
        }
    .end annotation

    .line 1
    new-instance p1, Lzc0$d;

    .line 2
    .line 3
    iget-object v0, p0, Lzc0$d;->i:Llo0;

    .line 4
    .line 5
    iget-object p0, p0, Lzc0$d;->j:Lwg0;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lzc0$d;-><init>(Llo0;Lwg0;Lik;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyk;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lzc0$d;->p(Lyk;Lik;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lzc0$d;->h:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lzc0$d;->j:Lwg0;

    .line 9
    .line 10
    iget-object p0, p0, Lzc0$d;->i:Llo0;

    .line 11
    .line 12
    iget-object p0, p0, Llo0;->d:Lco0;

    .line 13
    .line 14
    iget-object p0, p0, Lco0;->b:Ldp0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldp0;->g()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p1, p0}, Lzc0;->b1(Lwg0;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lna1;->a:Lna1;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final p(Lyk;Lik;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyk;",
            "Lik;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lzc0$d;->g(Ljava/lang/Object;Lik;)Lik;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lzc0$d;

    .line 6
    .line 7
    sget-object p1, Lna1;->a:Lna1;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lzc0$d;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
