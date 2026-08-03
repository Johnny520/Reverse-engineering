.class public final Lim;
.super Lhm;
.source ""


# instance fields
.field public final e:Lkm;

.field public final f:Ljm;

.field public final g:Li9;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkm;Ljm;Li9;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcp;-><init>()V

    iput-object p1, p0, Lim;->e:Lkm;

    iput-object p2, p0, Lim;->f:Ljm;

    iput-object p3, p0, Lim;->g:Li9;

    iput-object p4, p0, Lim;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 6

    iget-object p1, p0, Lim;->g:Li9;

    invoke-static {p1}, Lkm;->F(Lcp;)Li9;

    move-result-object v0

    iget-object v1, p0, Lim;->e:Lkm;

    iget-object v2, p0, Lim;->f:Ljm;

    iget-object v3, p0, Lim;->h:Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v1, v2, v0, v3}, Lkm;->N(Ljm;Li9;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v2, Ljm;->a:LTs;

    new-instance v4, Lso;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lso;-><init>(I)V

    invoke-virtual {v0, v4, v5}, Lcp;->c(Lcp;I)Z

    invoke-static {p1}, Lkm;->F(Lcp;)Li9;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1, v2, p1, v3}, Lkm;->N(Ljm;Li9;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {v1, v2, v3}, Lkm;->v(Ljm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lkm;->b(Ljava/lang/Object;)V

    return-void
.end method
