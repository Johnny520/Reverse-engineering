.class public final Lw/b1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lw/q0;

.field public final b:Lh0/d1;

.field public final c:Ln2/s;

.field public final d:Z

.field public final e:Z

.field public final f:Lh0/j1;

.field public final g:Lb5/k;

.field public final h:Lw/q1;

.field public final i:Lw/f0;

.field public final j:Lw/n0;

.field public final k:Lfg/l;

.field public final l:I


# direct methods
.method public constructor <init>(Lw/q0;Lh0/d1;Ln2/s;ZZLh0/j1;Lb5/k;Lw/q1;Lw/f0;Lfg/l;I)V
    .locals 1

    .line 1
    sget-object v0, Lw/s;->d:Lw/n0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lw/b1;->a:Lw/q0;

    .line 7
    .line 8
    iput-object p2, p0, Lw/b1;->b:Lh0/d1;

    .line 9
    .line 10
    iput-object p3, p0, Lw/b1;->c:Ln2/s;

    .line 11
    .line 12
    iput-boolean p4, p0, Lw/b1;->d:Z

    .line 13
    .line 14
    iput-boolean p5, p0, Lw/b1;->e:Z

    .line 15
    .line 16
    iput-object p6, p0, Lw/b1;->f:Lh0/j1;

    .line 17
    .line 18
    iput-object p7, p0, Lw/b1;->g:Lb5/k;

    .line 19
    .line 20
    iput-object p8, p0, Lw/b1;->h:Lw/q1;

    .line 21
    .line 22
    iput-object p9, p0, Lw/b1;->i:Lw/f0;

    .line 23
    .line 24
    iput-object v0, p0, Lw/b1;->j:Lw/n0;

    .line 25
    .line 26
    iput-object p10, p0, Lw/b1;->k:Lfg/l;

    .line 27
    .line 28
    iput p11, p0, Lw/b1;->l:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lw/b1;->a:Lw/q0;

    .line 2
    .line 3
    iget-object v0, v0, Lw/q0;->d:Lb/e;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ln2/h;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lb/e;->l(Ljava/util/List;)Ln2/s;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Lw/b1;->k:Lfg/l;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method
