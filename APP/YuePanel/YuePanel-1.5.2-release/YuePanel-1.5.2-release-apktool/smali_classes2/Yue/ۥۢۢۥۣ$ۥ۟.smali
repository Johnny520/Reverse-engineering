.class public final LYue/ۥۢۢۥۣ$ۥ۟;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۢۥۣ;->ۥ۟۟([J)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:[J


# direct methods
.method public constructor <init>([J)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۧ۟;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۧ۟;

    invoke-virtual {p1}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟(J)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0, p1}, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟(I)J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۧ۟;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۧ۟;

    invoke-virtual {p1}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۟(J)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0}, LYue/ۥۢۢۧ۠;->ۥ۟۟۠۟([J)Z

    move-result v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۧ۟;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۢۧ۟;

    invoke-virtual {p1}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۟۟(J)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۧ([J)I

    move-result v0

    return v0
.end method

.method public ۥ۟(J)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟۠([JJ)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(I)J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۥ([JI)J

    move-result-wide v0

    return-wide v0
.end method

.method public ۥ۟۟۟(J)I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۦۦ([JJ)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(J)I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۥۣ$ۥ۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۧۦۣ([JJ)I

    move-result p1

    return p1
.end method
