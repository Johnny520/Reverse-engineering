.class public final Lv1/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/o0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lfg/l;

.field public final synthetic e:Lv1/d0;

.field public final synthetic f:Lv1/j0;

.field public final synthetic g:Lfg/l;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lfg/l;Lv1/d0;Lv1/j0;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lv1/c0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lv1/c0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lv1/c0;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lv1/c0;->d:Lfg/l;

    .line 11
    .line 12
    iput-object p5, p0, Lv1/c0;->e:Lv1/d0;

    .line 13
    .line 14
    iput-object p6, p0, Lv1/c0;->f:Lv1/j0;

    .line 15
    .line 16
    iput-object p7, p0, Lv1/c0;->g:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/c0;->c:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv1/c0;->f:Lv1/j0;

    .line 2
    .line 3
    iget-object v0, v0, Lv1/j0;->g:Lx1/f0;

    .line 4
    .line 5
    iget-object v1, p0, Lv1/c0;->e:Lv1/d0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lv1/d0;->u0()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v2, p0, Lv1/c0;->g:Lfg/l;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lx1/f0;->L:Lx1/b1;

    .line 16
    .line 17
    iget-object v1, v1, Lx1/b1;->c:Lx1/r;

    .line 18
    .line 19
    iget-object v1, v1, Lx1/r;->Z:Lx1/q;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lx1/n0;->r:Lv1/k0;

    .line 24
    .line 25
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 30
    .line 31
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 32
    .line 33
    iget-object v0, v0, Lx1/n0;->r:Lv1/k0;

    .line 34
    .line 35
    invoke-interface {v2, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final g()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/c0;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lv1/c0;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Lfg/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lv1/c0;->d:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method
