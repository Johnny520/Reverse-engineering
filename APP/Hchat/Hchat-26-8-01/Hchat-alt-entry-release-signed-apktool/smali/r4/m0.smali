.class public final Lr4/m0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lz4/k;
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lv4/y;

.field public final h:Lr4/v0;


# direct methods
.method public constructor <init>(Lv4/y;Lt4/c;Lr4/p;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr4/m0;->g:Lv4/y;

    .line 5
    .line 6
    iget-object p1, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 7
    .line 8
    array-length p1, p1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lt4/b;

    .line 22
    .line 23
    new-instance v3, Lr4/b;

    .line 24
    .line 25
    invoke-direct {v3, v2, p3}, Lr4/b;-><init>(Lt4/b;Lr4/p;)V

    .line 26
    .line 27
    .line 28
    new-instance v2, Lr4/c;

    .line 29
    .line 30
    const/4 v4, 0x4

    .line 31
    invoke-direct {v2, v4, v4}, Lr4/l0;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v3, v2, Lr4/c;->k:Lr4/b;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Lr4/v0;

    .line 43
    .line 44
    sget-object p2, Lr4/b0;->u:Lr4/b0;

    .line 45
    .line 46
    invoke-direct {p1, p2, v0}, Lr4/v0;-><init>(Lr4/b0;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lr4/m0;->h:Lr4/v0;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lr4/m0;->g:Lv4/y;

    .line 7
    .line 8
    invoke-virtual {v1}, Lv4/w;->a()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lr4/m0;->h:Lr4/v0;

    .line 21
    .line 22
    iget-object v1, v1, Lr4/v0;->l:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lr4/c;

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    const-string v4, ", "

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {v3}, Lr4/c;->l()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lr4/m0;

    .line 2
    .line 3
    iget-object v0, p0, Lr4/m0;->g:Lv4/y;

    .line 4
    .line 5
    iget-object p1, p1, Lr4/m0;->g:Lv4/y;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lv4/a;->d(Lv4/a;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lr4/m0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lr4/m0;

    .line 8
    .line 9
    iget-object p1, p1, Lr4/m0;->g:Lv4/y;

    .line 10
    .line 11
    iget-object v0, p0, Lr4/m0;->g:Lv4/y;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lv4/w;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/m0;->g:Lv4/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv4/w;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
