.class public final Lk5/a;
.super Ljava/util/AbstractSet;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:Landroidx/lifecycle/x;

.field public final h:I

.field public final i:I

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Comparable;


# direct methods
.method public constructor <init>(Ljava/lang/Comparable;Landroidx/lifecycle/x;III)V
    .locals 0

    .line 1
    iput p5, p0, Lk5/a;->j:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/a;->k:Ljava/lang/Comparable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lk5/a;->g:Landroidx/lifecycle/x;

    .line 9
    .line 10
    iput p3, p0, Lk5/a;->h:I

    .line 11
    .line 12
    iput p4, p0, Lk5/a;->i:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 1
    new-instance v0, Lo5/g;

    .line 2
    .line 3
    iget v1, p0, Lk5/a;->h:I

    .line 4
    .line 5
    iget v2, p0, Lk5/a;->i:I

    .line 6
    .line 7
    iget-object v3, p0, Lk5/a;->g:Landroidx/lifecycle/x;

    .line 8
    .line 9
    invoke-direct {v0, p0, v3, v1, v2}, Lo5/g;-><init>(Lk5/a;Landroidx/lifecycle/x;II)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/a;->i:I

    .line 2
    .line 3
    return v0
.end method
