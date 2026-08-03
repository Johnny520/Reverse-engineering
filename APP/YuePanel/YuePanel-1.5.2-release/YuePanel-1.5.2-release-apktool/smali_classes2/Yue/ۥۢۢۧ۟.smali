.class public final LYue/ۥۢۢۧ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation runtime LYue/ۥ۠ۦۡ;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.5"
.end annotation

.annotation build LYue/ۥۢۥ۠ۧ;
    markerClass = {
        LYue/ۥ۠ۡۥۣ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢۧ۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۢۢۧ۟$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۥ:J = 0x0L

.field public static final ۥ۟۟۠ۦ:J = -0x1L

.field public static final ۥ۟۟۠ۧ:I = 0x8

.field public static final ۥ۟۟۠ۨ:I = 0x40


# instance fields
.field public final ۥۣ۟۟۠:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢۢۧ۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۢۧ۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۢۧ۟;->ۥ۟۟۠ۤ:LYue/ۥۢۢۧ۟$ۥ;

    return-void
.end method

.method public synthetic constructor <init>(J)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LYue/ۥۢۢۧ۟;->ۥۣ۟۟۠:J

    return-void
.end method

.method public static final ۥ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;
    .locals 1

    new-instance v0, LYue/ۥۢۢۧ۟;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۢۧ۟;-><init>(J)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(JB)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۡ(JJ)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۡ(JJ)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۟(JI)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۤ(JS)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(J)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-wide p0
.end method

.method public static final ۥ۟۟۟ۦ(J)J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-wide/16 v0, -0x1

    add-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟ۧ(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۢ(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۟(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۠(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ۥ۟۟۠ۡ(JLjava/lang/Object;)Z
    .locals 4

    instance-of v0, p2, LYue/ۥۢۢۧ۟;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p2, LYue/ۥۢۢۧ۟;

    invoke-virtual {p2}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v2

    cmp-long p0, p0, v2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۠(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۤ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۥ(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۦ(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic ۥ۟۟۠ۧ()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static ۥ۟۟۠ۨ(J)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Long;->hashCode(J)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ(J)J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-wide/16 v0, 0x1

    add-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡ۟(J)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    not-long p0, p0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡ۠(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۡ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    sub-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۢ(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۡ(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۤ(JB)B
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    int-to-byte p0, p0

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۥ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۦ(JI)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۧ(JS)S
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    long-to-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۨ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    or-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    add-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ۟(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ۠(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    add-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۡ(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    add-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۢ(JJ)LYue/ۥۢۢۧۥ;
    .locals 7
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    new-instance v6, LYue/ۥۢۢۧۥ;

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-wide v3, p2

    invoke-direct/range {v0 .. v5}, LYue/ۥۢۢۧۥ;-><init>(JJLYue/ۥ۟ۨۥۢ;)V

    return-object v6
.end method

.method public static final ۥۣ۟۟ۢ(JJ)LYue/ۥۢۢۧۥ;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۢۢۨۡ;->ۥۣ۟۟۠(JJ)LYue/ۥۢۢۧۥ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۤ(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۥ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1, p2, p3}, LYue/ۥۣۢۡ;->ۥۣ۟۟۟(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۦ(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۧ(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۨ(JI)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    shl-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟(JI)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    ushr-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟۟(JB)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟۠(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    mul-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۡ(JI)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۢ(JS)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p2

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    mul-long/2addr p0, v0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣۣ۟۟(J)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    int-to-byte p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۤ(J)D
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۤ(J)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۥ(J)F
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۤ(J)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۦ(J)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۧ(J)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۨ(J)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    int-to-short p0, p0

    return p0
.end method

.method public static ۥ۟۟ۤ(J)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۥ(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ۟(J)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    int-to-byte p0, p0

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤ۠(J)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤۡ(J)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return-wide p0
.end method

.method public static final ۥ۟۟ۤۢ(J)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    long-to-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤۤ(JJ)J
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    xor-long/2addr p0, p2

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, LYue/ۥۢۢۧ۟;

    invoke-virtual {p1}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-virtual {p0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۡ(JJ)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۢۧ۟;->ۥۣ۟۟۠:J

    invoke-static {v0, v1, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۠ۡ(JLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۢۧ۟;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۠ۨ(J)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-wide v0, p0, LYue/ۥۢۢۧ۟;->ۥۣ۟۟۠:J

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟۠(J)I
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, LYue/ۥۣۢۡ;->ۥ۟۟۟ۡ(JJ)I

    move-result p1

    return p1
.end method

.method public final synthetic ۥۣ۟۟ۤ()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۢۢۧ۟;->ۥۣ۟۟۠:J

    return-wide v0
.end method
