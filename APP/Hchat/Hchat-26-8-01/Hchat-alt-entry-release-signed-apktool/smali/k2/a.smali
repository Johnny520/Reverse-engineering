.class public final Lk2/a;
.super Landroid/text/SegmentFinder;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lb/e;


# direct methods
.method public constructor <init>(Lb/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk2/a;->a:Lb/e;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final nextEndBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/a;->a:Lb/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/e;->h(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final nextStartBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/a;->a:Lb/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/e;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final previousEndBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/a;->a:Lb/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/e;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final previousStartBoundary(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/a;->a:Lb/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lb/e;->g(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
