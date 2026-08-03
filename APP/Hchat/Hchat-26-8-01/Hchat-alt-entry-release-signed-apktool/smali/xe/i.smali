.class public final Lxe/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final g:I

.field public h:I

.field public final synthetic i:Lxe/j;


# direct methods
.method public constructor <init>(Lxe/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxe/i;->i:Lxe/j;

    .line 5
    .line 6
    iget-object p1, p1, Lxe/j;->g:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length p1, p1

    .line 9
    iput p1, p0, Lxe/i;->g:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lxe/i;->h:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lxe/i;->h:I

    .line 2
    .line 3
    iget v1, p0, Lxe/i;->g:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

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
    :try_start_0
    iget-object v0, p0, Lxe/i;->i:Lxe/j;

    .line 2
    .line 3
    iget-object v0, v0, Lxe/j;->g:[Ljava/lang/Object;

    .line 4
    .line 5
    iget v1, p0, Lxe/i;->h:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, Lxe/i;->h:I

    .line 10
    .line 11
    aget-object v0, v0, v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method
