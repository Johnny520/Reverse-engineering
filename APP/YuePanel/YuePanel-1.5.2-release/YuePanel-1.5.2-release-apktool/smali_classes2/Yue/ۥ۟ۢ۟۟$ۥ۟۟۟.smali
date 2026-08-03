.class public final LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;
.super LYue/ۥ۟۟ۡۢ;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۢ۟۟;->ۥ۟۟۠ۢ([J)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "Ljava/lang/Long;",
        ">;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۤ:[J


# direct methods
.method public constructor <init>([J)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    invoke-direct {p0}, LYue/ۥ۟۟ۡۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟(J)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟(I)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۟(J)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    array-length v0, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 2

    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۟۟(J)I

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    array-length v0, v0

    return v0
.end method

.method public ۥ۟(J)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥۣۣ۟ۢ([JJ)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟(I)Ljava/lang/Long;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    aget-wide v1, v0, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(J)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۦۦۦ([JJ)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(J)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟۟$ۥ۟۟۟;->ۥ۟۟۠ۤ:[J

    invoke-static {v0, p1, p2}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۧۦۣ([JJ)I

    move-result p1

    return p1
.end method
