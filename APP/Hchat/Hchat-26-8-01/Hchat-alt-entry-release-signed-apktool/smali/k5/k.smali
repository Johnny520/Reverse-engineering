.class public final Lk5/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final g:Lo5/c;

.field public final h:Lo5/c;

.field public final synthetic i:I

.field public final synthetic j:Ljava/util/Iterator;

.field public final synthetic k:Z

.field public final synthetic l:Lk5/o;


# direct methods
.method public constructor <init>(Lk5/o;Lo5/e;ILk5/m;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/k;->l:Lk5/o;

    .line 5
    .line 6
    iput p3, p0, Lk5/k;->i:I

    .line 7
    .line 8
    iput-object p4, p0, Lk5/k;->j:Ljava/util/Iterator;

    .line 9
    .line 10
    iput-boolean p5, p0, Lk5/k;->k:Z

    .line 11
    .line 12
    invoke-virtual {p2}, Lo5/e;->d()Lo5/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lk5/k;->g:Lo5/c;

    .line 17
    .line 18
    invoke-virtual {p2}, Lo5/e;->e()Lo5/c;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lk5/k;->h:Lo5/c;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Lk5/j;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/k;->l:Lk5/o;

    .line 4
    .line 5
    iget-object v1, v1, Lk5/o;->j:Lk5/u;

    .line 6
    .line 7
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v2, p0, Lk5/k;->i:I

    .line 10
    .line 11
    invoke-direct {v0, p0, v1, v2}, Lk5/j;-><init>(Lk5/k;Landroidx/lifecycle/x;I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
