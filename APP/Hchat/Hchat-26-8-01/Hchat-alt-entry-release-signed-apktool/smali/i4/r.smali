.class public final Li4/r;
.super Lz4/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Li4/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li4/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz4/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li4/r;->i:Li4/r;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final o(II)Li4/q;
    .locals 5

    .line 1
    iget-object v0, p0, Lz4/e;->h:[Ljava/lang/Object;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Li4/q;

    .line 12
    .line 13
    iget v3, v2, Li4/q;->f:I

    .line 14
    .line 15
    if-ne p2, v3, :cond_0

    .line 16
    .line 17
    iget v3, v2, Li4/q;->a:I

    .line 18
    .line 19
    if-lt p1, v3, :cond_0

    .line 20
    .line 21
    iget v4, v2, Li4/q;->b:I

    .line 22
    .line 23
    add-int/2addr v3, v4

    .line 24
    if-ge p1, v3, :cond_0

    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method
