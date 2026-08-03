.class public final synthetic Ly1/y2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ly1/w1;
.implements Lgg/h;


# instance fields
.field public final synthetic a:Li0/o;


# direct methods
.method public constructor <init>(Li0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/y2;->a:Li0/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Lgg/j;
    .locals 8

    .line 1
    new-instance v0, Lgg/j;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Ly1/y2;->a:Li0/o;

    .line 7
    .line 8
    const-class v3, Li0/o;

    .line 9
    .line 10
    const-string v4, "scheduleFrameEndCallback"

    .line 11
    .line 12
    const-string v5, "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;"

    .line 13
    .line 14
    invoke-direct/range {v0 .. v7}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ly1/w1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, Lgg/h;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ly1/y2;->a()Lgg/j;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast p1, Lgg/h;

    .line 14
    .line 15
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/y2;->a()Lgg/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
