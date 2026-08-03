.class public final synthetic Lp/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Lv1/b1;

.field public final synthetic h:Lv1/m0;

.field public final synthetic i:Lv1/p0;

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:Lp/q;


# direct methods
.method public synthetic constructor <init>(Lv1/b1;Lv1/m0;Lv1/p0;IILp/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/p;->g:Lv1/b1;

    .line 5
    .line 6
    iput-object p2, p0, Lp/p;->h:Lv1/m0;

    .line 7
    .line 8
    iput-object p3, p0, Lp/p;->i:Lv1/p0;

    .line 9
    .line 10
    iput p4, p0, Lp/p;->j:I

    .line 11
    .line 12
    iput p5, p0, Lp/p;->k:I

    .line 13
    .line 14
    iput-object p6, p0, Lp/p;->l:Lp/q;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lv1/a1;

    .line 3
    .line 4
    iget-object p1, p0, Lp/p;->i:Lv1/p0;

    .line 5
    .line 6
    invoke-interface {p1}, Lv1/o;->getLayoutDirection()Lu2/m;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Lp/p;->l:Lp/q;

    .line 11
    .line 12
    iget-object v6, p1, Lp/q;->a:Ly0/g;

    .line 13
    .line 14
    iget-object v1, p0, Lp/p;->g:Lv1/b1;

    .line 15
    .line 16
    iget-object v2, p0, Lp/p;->h:Lv1/m0;

    .line 17
    .line 18
    iget v4, p0, Lp/p;->j:I

    .line 19
    .line 20
    iget v5, p0, Lp/p;->k:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Lp/o;->b(Lv1/a1;Lv1/b1;Lv1/m0;Lu2/m;IILy0/g;)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1
.end method
