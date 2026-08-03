.class public final Lk5/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic g:Lo5/e;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/util/Iterator;

.field public final synthetic k:Z

.field public final synthetic l:Lk5/o;


# direct methods
.method public constructor <init>(Lk5/o;Lo5/e;IILk5/l;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/g;->l:Lk5/o;

    .line 5
    .line 6
    iput-object p2, p0, Lk5/g;->g:Lo5/e;

    .line 7
    .line 8
    iput p3, p0, Lk5/g;->h:I

    .line 9
    .line 10
    iput p4, p0, Lk5/g;->i:I

    .line 11
    .line 12
    iput-object p5, p0, Lk5/g;->j:Ljava/util/Iterator;

    .line 13
    .line 14
    iput-boolean p6, p0, Lk5/g;->k:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    iget-object v0, p0, Lk5/g;->g:Lo5/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo5/e;->c()Lo5/c;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget-object v0, p0, Lk5/g;->l:Lk5/o;

    .line 8
    .line 9
    iget-object v0, v0, Lk5/o;->j:Lk5/u;

    .line 10
    .line 11
    iget v1, p0, Lk5/g;->h:I

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    sget-object v1, Lo5/m;->a:Lo5/k;

    .line 16
    .line 17
    move-object v5, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v2, Lo5/l;

    .line 20
    .line 21
    invoke-direct {v2, v0, v1}, Lo5/l;-><init>(Lk5/u;I)V

    .line 22
    .line 23
    .line 24
    move-object v5, v2

    .line 25
    :goto_0
    new-instance v1, Lk5/f;

    .line 26
    .line 27
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 28
    .line 29
    iget v4, p0, Lk5/g;->i:I

    .line 30
    .line 31
    move-object v2, p0

    .line 32
    invoke-direct/range {v1 .. v6}, Lk5/f;-><init>(Lk5/g;Landroidx/lifecycle/x;ILo5/m;Lo5/c;)V

    .line 33
    .line 34
    .line 35
    return-object v1
.end method
