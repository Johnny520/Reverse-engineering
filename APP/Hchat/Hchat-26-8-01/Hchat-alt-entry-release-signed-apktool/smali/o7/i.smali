.class public final Lo7/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ll7/f;


# direct methods
.method public constructor <init>(IILl7/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lo7/i;->h:I

    .line 5
    .line 6
    iput p2, p0, Lo7/i;->i:I

    .line 7
    .line 8
    iput-object p3, p0, Lo7/i;->j:Ll7/f;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lo7/i;->g:I

    .line 2
    .line 3
    iget v1, p0, Lo7/i;->h:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo7/i;->g:I

    .line 2
    .line 3
    iget v1, p0, Lo7/i;->h:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lo7/i;->i:I

    .line 8
    .line 9
    or-int/2addr v1, v0

    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Lo7/i;->g:I

    .line 13
    .line 14
    new-instance v0, Lt7/b;

    .line 15
    .line 16
    iget-object v2, p0, Lo7/i;->j:Ll7/f;

    .line 17
    .line 18
    invoke-direct {v0, v2, v1}, Lt7/b;-><init>(Ll7/f;I)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    return-object v0
.end method
