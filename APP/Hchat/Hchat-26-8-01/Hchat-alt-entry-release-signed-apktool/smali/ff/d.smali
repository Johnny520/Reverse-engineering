.class public final Lff/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Llc/a;


# instance fields
.field public final g:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lff/d;->g:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lff/d;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final n(Lud/t;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lff/d;->g:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lff/e;

    .line 18
    .line 19
    iget-object v2, v1, Lff/e;->d:Ljf/e;

    .line 20
    .line 21
    iget v3, v2, Ljf/e;->a:I

    .line 22
    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget v2, v2, Ljf/e;->b:I

    .line 27
    .line 28
    new-instance v4, Lac/k;

    .line 29
    .line 30
    invoke-direct {v4, v1, v2}, Lac/k;-><init>(Lff/e;I)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lf/r;

    .line 34
    .line 35
    invoke-virtual {v4}, Lac/k;->g()Lac/k;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v4}, Lac/k;->g()Lac/k;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-direct {v1, v2, v5}, Lf/r;-><init>(Lac/k;Lac/k;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Ljf/b;

    .line 47
    .line 48
    invoke-direct {v2, v4, v1}, Ljf/b;-><init>(Lac/k;Lf/r;)V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    :goto_1
    if-ge v1, v3, :cond_0

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Lud/t;->accept(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget v5, v4, Lac/k;->h:I

    .line 58
    .line 59
    add-int/lit8 v5, v5, 0x20

    .line 60
    .line 61
    iput v5, v4, Lac/k;->h:I

    .line 62
    .line 63
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    return-void
.end method
