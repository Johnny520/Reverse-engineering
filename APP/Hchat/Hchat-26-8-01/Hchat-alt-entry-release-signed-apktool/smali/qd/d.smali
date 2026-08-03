.class public abstract Lqd/d;
.super Lqd/j;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final J:[Lqd/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lqd/q;

    .line 3
    .line 4
    sput-object v0, Lqd/d;->J:[Lqd/q;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A()Lqd/j;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final a(Lqd/q;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lqd/j;->o()Lqd/q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public n()[Lqd/q;
    .locals 1

    .line 1
    sget-object v0, Lqd/d;->J:[Lqd/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public w()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
