.class public final Lpe/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lud/r;

.field public final b:Lud/a;

.field public final c:[Lqd/s;

.field public final d:[I


# direct methods
.method public constructor <init>(Lud/r;Lud/a;[Lqd/s;[I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpe/b;->a:Lud/r;

    .line 5
    .line 6
    iput-object p2, p0, Lpe/b;->b:Lud/a;

    .line 7
    .line 8
    iput-object p3, p0, Lpe/b;->c:[Lqd/s;

    .line 9
    .line 10
    iput-object p4, p0, Lpe/b;->d:[I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lqd/r;)Lqd/s;
    .locals 4

    .line 1
    iget v0, p1, Lqd/r;->l:I

    .line 2
    .line 3
    iget-object v1, p0, Lpe/b;->d:[I

    .line 4
    .line 5
    aget v2, v1, v0

    .line 6
    .line 7
    add-int/lit8 v3, v2, 0x1

    .line 8
    .line 9
    aput v3, v1, v0

    .line 10
    .line 11
    iget-object v1, p0, Lpe/b;->a:Lud/r;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Lqd/s;

    .line 17
    .line 18
    invoke-direct {v3, v0, v2, p1}, Lqd/s;-><init>(IILqd/r;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v1, Lud/r;->D:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, v1, Lud/r;->D:Ljava/util/List;

    .line 35
    .line 36
    :cond_0
    iget-object p1, v1, Lud/r;->D:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lpe/b;->c:[Lqd/s;

    .line 42
    .line 43
    aput-object v3, p1, v0

    .line 44
    .line 45
    return-object v3
.end method
