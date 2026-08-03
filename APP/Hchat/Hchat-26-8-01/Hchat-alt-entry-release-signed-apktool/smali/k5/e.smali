.class public final Lk5/e;
.super Ljava/util/AbstractList;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Lk5/o;


# direct methods
.method public constructor <init>(Lk5/o;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/e;->i:Lk5/o;

    .line 2
    .line 3
    iput p2, p0, Lk5/e;->g:I

    .line 4
    .line 5
    iput p3, p0, Lk5/e;->h:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/e;->i:Lk5/o;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/o;->j:Lk5/u;

    .line 4
    .line 5
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 6
    .line 7
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 8
    .line 9
    iget v2, p0, Lk5/e;->g:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x4

    .line 12
    .line 13
    mul-int/lit8 p1, p1, 0x2

    .line 14
    .line 15
    add-int/2addr p1, v2

    .line 16
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->P(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {v1, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/e;->h:I

    .line 2
    .line 3
    return v0
.end method
