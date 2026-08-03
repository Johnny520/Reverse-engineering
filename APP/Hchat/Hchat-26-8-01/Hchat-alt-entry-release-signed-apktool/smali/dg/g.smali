.class public final Ldg/g;
.super Ldg/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public b:Z

.field public c:[Ljava/io/File;

.field public d:I

.field public final synthetic e:Ldg/h;


# direct methods
.method public constructor <init>(Ldg/h;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldg/g;->e:Ldg/h;

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
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldg/g;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ldg/i;->a:Ljava/io/File;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Ldg/g;->e:Ldg/h;

    .line 9
    .line 10
    iget-object v0, v0, Ldg/h;->j:Ldg/j;

    .line 11
    .line 12
    iget-object v0, v0, Ldg/j;->b:Lfg/l;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0, v2}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ldg/g;->b:Z

    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_1
    iget-object v0, p0, Ldg/g;->c:[Ljava/io/File;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget v3, p0, Ldg/g;->d:I

    .line 38
    .line 39
    array-length v4, v0

    .line 40
    if-ge v3, v4, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-object v1

    .line 44
    :cond_3
    :goto_0
    if-nez v0, :cond_5

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Ldg/g;->c:[Ljava/io/File;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    array-length v0, v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    :cond_4
    return-object v1

    .line 58
    :cond_5
    iget-object v0, p0, Ldg/g;->c:[Ljava/io/File;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget v1, p0, Ldg/g;->d:I

    .line 64
    .line 65
    add-int/lit8 v2, v1, 0x1

    .line 66
    .line 67
    iput v2, p0, Ldg/g;->d:I

    .line 68
    .line 69
    aget-object v0, v0, v1

    .line 70
    .line 71
    return-object v0
.end method
