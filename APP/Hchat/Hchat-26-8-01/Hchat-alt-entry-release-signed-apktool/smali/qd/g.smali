.class public final Lqd/g;
.super Lqd/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final K:Lqd/q;


# direct methods
.method public constructor <init>(Lqd/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/g;->K:Lqd/q;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lqd/j;->a:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final o()Lqd/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/g;->K:Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    check-cast p1, Lqd/g;

    .line 2
    .line 3
    iget-object p1, p1, Lqd/g;->K:Lqd/q;

    .line 4
    .line 5
    iget-object v0, p0, Lqd/g;->K:Lqd/q;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/g;->K:Lqd/q;

    .line 2
    .line 3
    iget-object v0, v0, Lqd/q;->h:Ljava/lang/String;

    .line 4
    .line 5
    return-object v0
.end method
