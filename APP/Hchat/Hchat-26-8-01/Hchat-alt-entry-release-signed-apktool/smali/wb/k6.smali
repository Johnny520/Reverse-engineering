.class public final synthetic Lwb/k6;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Lwb/x2;

.field public final synthetic j:Lgg/q;

.field public final synthetic k:Lwb/o6;

.field public final synthetic l:Lgg/u;

.field public final synthetic m:Ljava/util/ArrayList;

.field public final synthetic n:Lgg/u;

.field public final synthetic o:Landroid/view/ViewGroup;

.field public final synthetic p:Lc9/a1;


# direct methods
.method public synthetic constructor <init>(ZLi0/j1;Lwb/x2;Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/k6;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/k6;->h:Li0/j1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/k6;->i:Lwb/x2;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/k6;->j:Lgg/q;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/k6;->k:Lwb/o6;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/k6;->l:Lgg/u;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/k6;->m:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/k6;->n:Lgg/u;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/k6;->o:Landroid/view/ViewGroup;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/k6;->p:Lc9/a1;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p0, Lwb/k6;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lwb/k6;->j:Lgg/q;

    .line 6
    .line 7
    iget-object v2, p0, Lwb/k6;->k:Lwb/o6;

    .line 8
    .line 9
    iget-object v3, p0, Lwb/k6;->l:Lgg/u;

    .line 10
    .line 11
    iget-object v4, p0, Lwb/k6;->m:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v5, p0, Lwb/k6;->n:Lgg/u;

    .line 14
    .line 15
    iget-object v6, p0, Lwb/k6;->o:Landroid/view/ViewGroup;

    .line 16
    .line 17
    iget-object v7, p0, Lwb/k6;->p:Lc9/a1;

    .line 18
    .line 19
    invoke-static/range {v1 .. v7}, La7/a;->T(Lgg/q;Lwb/o6;Lgg/u;Ljava/util/ArrayList;Lgg/u;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lwb/k6;->i:Lwb/x2;

    .line 24
    .line 25
    invoke-static {v0}, Lwb/ho;->C4(Lwb/x2;)Lwb/x2;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, Lwb/k6;->h:Li0/j1;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object v0
.end method
