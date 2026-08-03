.class public final Lk5/b0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lac/k;


# direct methods
.method public constructor <init>(Lac/k;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/b0;->i:Lac/k;

    .line 5
    .line 6
    iput p2, p0, Lk5/b0;->g:I

    .line 7
    .line 8
    iput p3, p0, Lk5/b0;->h:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Lk5/a0;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/b0;->i:Lac/k;

    .line 4
    .line 5
    iget-object v1, v1, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lk5/u;

    .line 8
    .line 9
    iget-object v1, v1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 10
    .line 11
    iget v2, p0, Lk5/b0;->g:I

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, v2}, Lk5/a0;-><init>(Lk5/b0;Landroidx/lifecycle/x;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
