.class public abstract Lo7/d;
.super Lk7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public k:[Lk7/a;

.field public l:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk7/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-array p1, p1, [Lk7/a;

    .line 5
    .line 6
    iput-object p1, p0, Lo7/d;->k:[Lk7/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final L()[Lk7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/d;->k:[Lk7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final P(Lk7/a;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget v0, p0, Lo7/d;->l:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    iget-object v2, p0, Lo7/d;->k:[Lk7/a;

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    if-gt v1, v3, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    new-array v1, v1, [Lk7/a;

    .line 15
    .line 16
    iput-object v1, p0, Lo7/d;->k:[Lk7/a;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    array-length v3, v2

    .line 20
    if-ge v1, v3, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Lo7/d;->k:[Lk7/a;

    .line 23
    .line 24
    aget-object v4, v2, v1

    .line 25
    .line 26
    aput-object v4, v3, v1

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    :goto_1
    iget-object v1, p0, Lo7/d;->k:[Lk7/a;

    .line 32
    .line 33
    aput-object p1, v1, v0

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Lk7/a;->H(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Lk7/a;->J(Lk7/a;)V

    .line 39
    .line 40
    .line 41
    iget p1, p0, Lo7/d;->l:I

    .line 42
    .line 43
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    iput p1, p0, Lo7/d;->l:I

    .line 46
    .line 47
    return-void
.end method
