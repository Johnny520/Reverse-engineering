.class public abstract Lo5/r;
.super Ljava/util/AbstractSequentialList;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Landroidx/lifecycle/x;

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractSequentialList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo5/r;->g:Landroidx/lifecycle/x;

    .line 5
    .line 6
    iput p2, p0, Lo5/r;->h:I

    .line 7
    .line 8
    iput p3, p0, Lo5/r;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract a(La5/a;I)Ljava/lang/Object;
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 6

    .line 24
    new-instance v0, Lk5/l;

    iget v4, p0, Lo5/r;->i:I

    const/4 v5, 0x3

    iget-object v2, p0, Lo5/r;->g:Landroidx/lifecycle/x;

    iget v3, p0, Lo5/r;->h:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lk5/l;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 6

    .line 1
    new-instance v0, Lk5/l;

    .line 2
    .line 3
    iget v4, p0, Lo5/r;->i:I

    .line 4
    .line 5
    const/4 v5, 0x3

    .line 6
    iget-object v2, p0, Lo5/r;->g:Landroidx/lifecycle/x;

    .line 7
    .line 8
    iget v3, p0, Lo5/r;->h:I

    .line 9
    .line 10
    move-object v1, p0

    .line 11
    invoke-direct/range {v0 .. v5}, Lk5/l;-><init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lo5/s;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lo5/r;->i:I

    .line 2
    .line 3
    return v0
.end method
