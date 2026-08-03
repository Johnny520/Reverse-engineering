.class public Lqd/e;
.super Lqd/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final K:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/e;->K:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

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
.method public final l()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/e;->K:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Lqd/q;
    .locals 1

    .line 1
    sget-object v0, Lqd/q;->r:Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    check-cast p1, Lqd/e;

    .line 2
    .line 3
    iget-object p1, p1, Lqd/e;->K:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v0, p0, Lqd/e;->K:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/e;->K:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
