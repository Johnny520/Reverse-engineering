.class public final Lqd/a;
.super Lqd/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final L:[Lqd/q;


# instance fields
.field public final K:Lqd/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lqd/q;->s:Lqd/q;

    .line 2
    .line 3
    filled-new-array {v0}, [Lqd/q;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lqd/a;->L:[Lqd/q;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/a;->K:Lqd/j;

    .line 5
    .line 6
    iget p1, p1, Lqd/j;->a:I

    .line 7
    .line 8
    iput p1, p0, Lqd/j;->a:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final A()Lqd/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->A()Lqd/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lqd/a;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lqd/a;-><init>(Lqd/j;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    return v0
.end method

.method public final g()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lqd/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->h()Lqd/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final n()[Lqd/q;
    .locals 1

    .line 1
    sget-object v0, Lqd/a;->L:[Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lqd/q;
    .locals 1

    .line 1
    sget-object v0, Lqd/q;->s:Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    check-cast p1, Lqd/a;

    .line 2
    .line 3
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 4
    .line 5
    iget-object p1, p1, Lqd/a;->K:Lqd/j;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "[]"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/a;->K:Lqd/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lqd/j;->w()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
