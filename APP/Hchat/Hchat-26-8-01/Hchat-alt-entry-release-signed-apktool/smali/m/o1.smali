.class public abstract Lm/o1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lm/o2;

.field public final b:Lgg/a;

.field public c:Lu2/c;

.field public d:Z

.field public final e:Lb/e;


# direct methods
.method public constructor <init>(Lm/o2;Lfg/p;Lu2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/o1;->a:Lm/o2;

    .line 5
    .line 6
    check-cast p2, Lgg/a;

    .line 7
    .line 8
    iput-object p2, p0, Lm/o1;->b:Lgg/a;

    .line 9
    .line 10
    iput-object p3, p0, Lm/o1;->c:Lu2/c;

    .line 11
    .line 12
    new-instance p1, Lb/e;

    .line 13
    .line 14
    const/16 p2, 0x16

    .line 15
    .line 16
    invoke-direct {p1, p2}, Lb/e;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lm/o1;->e:Lb/e;

    .line 20
    .line 21
    return-void
.end method

.method public static a(Ls1/k;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ls1/k;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Ls1/t;

    .line 15
    .line 16
    invoke-virtual {v2}, Ls1/t;->a()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lm/n1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lm/n1;

    .line 7
    .line 8
    iget v1, v0, Lm/n1;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lm/n1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lm/n1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lm/n1;-><init>(Lm/o1;Lyf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lm/n1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lm/n1;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    return-object p1

    .line 45
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v2, p0, Lm/o1;->d:Z

    .line 49
    .line 50
    new-instance p2, Lci/j;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    const/16 v3, 0xa

    .line 54
    .line 55
    invoke-direct {p2, p0, p1, v1, v3}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 56
    .line 57
    .line 58
    iput v2, v0, Lm/n1;->i:I

    .line 59
    .line 60
    new-instance p1, Lqg/f1;

    .line 61
    .line 62
    invoke-interface {v0}, Lwf/c;->getContext()Lwf/g;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-direct {p1, v0, v1}, Lvg/p;-><init>(Lwf/c;Lwf/g;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p1, p2}, Lfb/v0;->L(Lvg/p;Lvg/p;Lfg/p;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 74
    .line 75
    if-ne p1, p2, :cond_3

    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 79
    iput-boolean p1, p0, Lm/o1;->d:Z

    .line 80
    .line 81
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 82
    .line 83
    return-object p1
.end method
