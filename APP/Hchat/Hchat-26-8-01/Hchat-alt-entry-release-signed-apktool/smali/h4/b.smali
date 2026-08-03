.class public final Lh4/b;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:Li4/c;

.field public final c:I


# direct methods
.method public constructor <init>(Li4/c;)V
    .locals 3

    .line 1
    const-string v0, "BootstrapMethods"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lh4/b;->b:Li4/c;

    .line 7
    .line 8
    iget-object v0, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    mul-int/lit8 v0, v0, 0x4

    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x8

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    iget-object v2, p1, Lz4/e;->h:[Ljava/lang/Object;

    .line 17
    .line 18
    array-length v2, v2

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Li4/b;

    .line 26
    .line 27
    iget-object v2, v2, Li4/b;->a:Lh4/u;

    .line 28
    .line 29
    iget-object v2, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 30
    .line 31
    array-length v2, v2

    .line 32
    mul-int/lit8 v2, v2, 0x2

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput v0, p0, Lh4/b;->c:I

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lh4/b;->c:I

    .line 2
    .line 3
    return v0
.end method
