.class public final Ldg/e;
.super Ldg/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public e:Z

.field public final synthetic f:Ldg/h;


# direct methods
.method public constructor <init>(Ldg/h;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg/e;->f:Ldg/h;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Ldg/i;-><init>(Ljava/io/File;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 6

    .line 1
    iget-boolean v0, p0, Ldg/e;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Ldg/i;->a:Ljava/io/File;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ldg/e;->c:[Ljava/io/File;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ldg/e;->f:Ldg/h;

    .line 14
    .line 15
    iget-object v0, v0, Ldg/h;->j:Ldg/j;

    .line 16
    .line 17
    iget-object v0, v0, Ldg/j;->b:Lfg/l;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Ldg/e;->c:[Ljava/io/File;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iput-boolean v2, p0, Ldg/e;->e:Z

    .line 43
    .line 44
    :cond_1
    iget-object v0, p0, Ldg/e;->c:[Ljava/io/File;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget v4, p0, Ldg/e;->d:I

    .line 49
    .line 50
    array-length v5, v0

    .line 51
    if-ge v4, v5, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget v1, p0, Ldg/e;->d:I

    .line 57
    .line 58
    add-int/lit8 v2, v1, 0x1

    .line 59
    .line 60
    iput v2, p0, Ldg/e;->d:I

    .line 61
    .line 62
    aget-object v0, v0, v1

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    iget-boolean v0, p0, Ldg/e;->b:Z

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    iput-boolean v2, p0, Ldg/e;->b:Z

    .line 70
    .line 71
    return-object v3

    .line 72
    :cond_3
    return-object v1
.end method
