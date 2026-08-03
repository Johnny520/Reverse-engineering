.class public final Ll5/c0;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/j;


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 1

    .line 1
    sget-object v0, Lf5/f;->s:Lf5/f;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0, p2}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 7
    .line 8
    add-int/lit8 p2, p2, 0x2

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Ll5/c0;->d:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Ll5/c0;->d:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x4

    .line 6
    .line 7
    return v0
.end method

.method public final s()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Ll5/a0;->a:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v1, p0, Ll5/a0;->c:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, 0x4

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->J(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    new-instance v1, Lk5/r;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v0, v2, p0}, Lk5/r;-><init>(IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
