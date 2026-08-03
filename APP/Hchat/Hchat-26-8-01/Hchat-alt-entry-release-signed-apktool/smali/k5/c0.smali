.class public final Lk5/c0;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Lac/k;


# direct methods
.method public constructor <init>(Lac/k;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/c0;->j:Lac/k;

    .line 2
    .line 3
    iput p2, p0, Lk5/c0;->g:I

    .line 4
    .line 5
    iput p3, p0, Lk5/c0;->h:I

    .line 6
    .line 7
    iput p4, p0, Lk5/c0;->i:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lk5/f0;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/c0;->j:Lac/k;

    .line 4
    .line 5
    iget-object v1, v1, Lac/k;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lk5/u;

    .line 8
    .line 9
    mul-int/lit8 p1, p1, 0x8

    .line 10
    .line 11
    iget v2, p0, Lk5/c0;->g:I

    .line 12
    .line 13
    add-int/2addr p1, v2

    .line 14
    iget v2, p0, Lk5/c0;->h:I

    .line 15
    .line 16
    invoke-direct {v0, v1, p1, v2}, Lk5/f0;-><init>(Lk5/u;II)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/c0;->i:I

    .line 2
    .line 3
    return v0
.end method
