.class public final Lqc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lvc;
.implements Lsc;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:LFc;

.field public final c:Luc;

.field public d:I

.field public e:LSm;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:LZr;

.field public i:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/util/List;LFc;Luc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lqc;->d:I

    iput-object p1, p0, Lqc;->a:Ljava/util/List;

    iput-object p2, p0, Lqc;->b:LFc;

    iput-object p3, p0, Lqc;->c:Luc;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lqc;->c:Luc;

    iget-object v1, p0, Lqc;->e:LSm;

    iget-object v2, p0, Lqc;->h:LZr;

    iget-object v2, v2, LZr;->c:Ltc;

    const/4 v3, 0x3

    invoke-interface {v0, v1, p1, v2, v3}, Luc;->a(LSm;Ljava/lang/Exception;Ltc;I)V

    return-void
.end method

.method public final c()Z
    .locals 7

    :cond_0
    :goto_0
    iget-object v0, p0, Lqc;->f:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget v3, p0, Lqc;->g:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, Lqc;->h:LZr;

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    iget v0, p0, Lqc;->g:I

    iget-object v3, p0, Lqc;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v0, p0, Lqc;->f:Ljava/util/List;

    iget v3, p0, Lqc;->g:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Lqc;->g:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Las;

    iget-object v3, p0, Lqc;->i:Ljava/io/File;

    iget-object v4, p0, Lqc;->b:LFc;

    iget v5, v4, LFc;->e:I

    iget v6, v4, LFc;->f:I

    iget-object v4, v4, LFc;->i:Lvt;

    invoke-interface {v0, v3, v5, v6, v4}, Las;->b(Ljava/lang/Object;IILvt;)LZr;

    move-result-object v0

    iput-object v0, p0, Lqc;->h:LZr;

    iget-object v0, p0, Lqc;->h:LZr;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqc;->b:LFc;

    iget-object v3, p0, Lqc;->h:LZr;

    iget-object v3, v3, LZr;->c:Ltc;

    invoke-interface {v3}, Ltc;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, LFc;->c(Ljava/lang/Class;)LNo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqc;->h:LZr;

    iget-object v0, v0, LZr;->c:Ltc;

    iget-object v2, p0, Lqc;->b:LFc;

    iget-object v2, v2, LFc;->o:Lwu;

    invoke-interface {v0, v2, p0}, Ltc;->d(Lwu;Lsc;)V

    move v2, v1

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    iget v0, p0, Lqc;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lqc;->d:I

    iget-object v1, p0, Lqc;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, Lqc;->a:Ljava/util/List;

    iget v1, p0, Lqc;->d:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSm;

    new-instance v1, Lrc;

    iget-object v3, p0, Lqc;->b:LFc;

    iget-object v4, v3, LFc;->n:LSm;

    invoke-direct {v1, v0, v4}, Lrc;-><init>(LSm;LSm;)V

    iget-object v3, v3, LFc;->h:LBb;

    invoke-virtual {v3}, LBb;->a()LUd;

    move-result-object v3

    invoke-interface {v3, v1}, LUd;->b(LSm;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, Lqc;->i:Ljava/io/File;

    if-eqz v1, :cond_0

    iput-object v0, p0, Lqc;->e:LSm;

    iget-object v0, p0, Lqc;->b:LFc;

    iget-object v0, v0, LFc;->c:LRj;

    invoke-virtual {v0}, LRj;->a()LPv;

    move-result-object v0

    invoke-virtual {v0, v1}, LPv;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lqc;->f:Ljava/util/List;

    iput v2, p0, Lqc;->g:I

    goto/16 :goto_0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lqc;->h:LZr;

    if-eqz v0, :cond_0

    iget-object v0, v0, LZr;->c:Ltc;

    invoke-interface {v0}, Ltc;->cancel()V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lqc;->c:Luc;

    iget-object v1, p0, Lqc;->e:LSm;

    iget-object v2, p0, Lqc;->h:LZr;

    iget-object v3, v2, LZr;->c:Ltc;

    const/4 v4, 0x3

    iget-object v5, p0, Lqc;->e:LSm;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Luc;->b(LSm;Ljava/lang/Object;Ltc;ILSm;)V

    return-void
.end method
