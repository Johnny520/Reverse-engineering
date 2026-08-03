.class public final Lo5/b;
.super Lo5/o;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Lk5/u;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public constructor <init>(Lk5/u;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo5/b;->g:Lk5/u;

    .line 2
    .line 3
    iput p2, p0, Lo5/b;->h:I

    .line 4
    .line 5
    iput p3, p0, Lo5/b;->i:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lo5/b;->g:Lk5/u;

    .line 2
    .line 3
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    iget v2, p0, Lo5/b;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v2, 0x4

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x4

    .line 10
    .line 11
    add-int/2addr p1, v2

    .line 12
    invoke-virtual {v1, p1}, Landroidx/lifecycle/x;->N(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-instance v1, Lk5/b;

    .line 17
    .line 18
    invoke-direct {v1, v0, p1}, Lk5/b;-><init>(Lk5/u;I)V

    .line 19
    .line 20
    .line 21
    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lo5/b;->i:I

    .line 2
    .line 3
    return v0
.end method
