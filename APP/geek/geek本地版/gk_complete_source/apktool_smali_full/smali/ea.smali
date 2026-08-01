.class public final Lea;
.super Lop;

# interfaces
.implements Lda;


# instance fields
.field public final e:Lwp;


# direct methods
.method public constructor <init>(Lwp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lvr;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lea;->e:Lwp;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsp;->k()Lwp;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lwp;->p(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lea;->l(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lvh;->n:Lvh;

    .line 7
    .line 8
    return-object p1
.end method

.method public final l(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lea;->e:Lwp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsp;->k()Lwp;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lwp;->m(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
