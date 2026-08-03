.class public final Ly1/e2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/s1;


# instance fields
.field public final g:I

.field public final h:Ljava/util/List;

.field public i:Ljava/lang/Float;

.field public j:Ljava/lang/Float;

.field public k:Lf2/j;

.field public l:Lf2/j;


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ly1/e2;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Ly1/e2;->h:Ljava/util/List;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Ly1/e2;->i:Ljava/lang/Float;

    .line 10
    .line 11
    iput-object p1, p0, Ly1/e2;->j:Ljava/lang/Float;

    .line 12
    .line 13
    iput-object p1, p0, Ly1/e2;->k:Lf2/j;

    .line 14
    .line 15
    iput-object p1, p0, Ly1/e2;->l:Lf2/j;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/e2;->h:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
