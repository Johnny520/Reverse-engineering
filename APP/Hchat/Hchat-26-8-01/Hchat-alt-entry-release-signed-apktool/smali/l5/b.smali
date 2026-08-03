.class public final Ll5/b;
.super Ll5/a0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lt5/d;


# static fields
.field public static final f:Lf5/f;


# instance fields
.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lf5/f;->u:Lf5/f;

    .line 2
    .line 3
    sput-object v0, Ll5/b;->f:Lf5/f;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lk5/u;I)V
    .locals 4

    .line 1
    sget-object v0, Ll5/b;->f:Lf5/f;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0, p2}, Ll5/a0;-><init>(Lk5/u;Lf5/f;I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 7
    .line 8
    add-int/lit8 v0, p2, 0x2

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput p1, p0, Ll5/b;->d:I

    .line 19
    .line 20
    iput v1, p0, Ll5/b;->e:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iput v0, p0, Ll5/b;->d:I

    .line 24
    .line 25
    add-int/lit8 p2, p2, 0x4

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->N(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Ll5/b;->e:I

    .line 32
    .line 33
    int-to-long v2, v0

    .line 34
    int-to-long p1, p1

    .line 35
    mul-long/2addr v2, p1

    .line 36
    const-wide/32 p1, 0x7fffffff

    .line 37
    .line 38
    .line 39
    cmp-long p1, v2, p1

    .line 40
    .line 41
    if-gtz p1, :cond_1

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    new-instance p1, Ld6/f;

    .line 45
    .line 46
    new-array p2, v1, [Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    const-string v1, "Invalid array-payload instruction: element width*count overflows"

    .line 50
    .line 51
    invoke-direct {p1, v0, v1, p2}, Ld6/f;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method


# virtual methods
.method public final c()I
    .locals 2

    .line 1
    iget v0, p0, Ll5/b;->d:I

    .line 2
    .line 3
    iget v1, p0, Ll5/b;->e:I

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    return v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget v0, p0, Ll5/b;->d:I

    .line 2
    .line 3
    return v0
.end method
