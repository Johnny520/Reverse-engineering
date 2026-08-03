.class public final LYue/ۥۢۢۨۤ;
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
        LYue/ۥۢۢۨۤ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LYue/\u06e5\u06e2\u06e2\u06e8\u06e4;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۢۢۨۤ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۥ:S = 0x0s

.field public static final ۥ۟۟۠ۦ:S = -0x1s

.field public static final ۥ۟۟۠ۧ:I = 0x2

.field public static final ۥ۟۟۠ۨ:I = 0x10


# instance fields
.field public final ۥۣ۟۟۠:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢۢۨۤ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۢۨۤ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۢۨۤ;->ۥ۟۟۠ۤ:LYue/ۥۢۢۨۤ$ۥ;

    return-void
.end method

.method public synthetic constructor <init>(S)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-short p1, p0, LYue/ۥۢۢۨۤ;->ۥۣ۟۟۠:S

    return-void
.end method

.method public static final ۥ(SS)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/2addr p0, p1

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟۟(S)LYue/ۥۢۢۨۤ;
    .locals 1

    new-instance v0, LYue/ۥۢۢۨۤ;

    invoke-direct {v0, p0}, LYue/ۥۢۢۨۤ;-><init>(S)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(SJ)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۤ(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    and-int/2addr p1, v0

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return p0
.end method

.method public static final ۥ۟۟۟ۦ(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-int/lit8 p0, p0, -0x1

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۟(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠۠(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۡ(SLjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۨۤ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥۢۢۨۤ;

    invoke-virtual {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(SS)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۠(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۤ(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۥ(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۦ(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۠ۧ()V
    .locals 0
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return-void
.end method

.method public static ۥ۟۟۠ۨ(S)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Short;->hashCode(S)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-int/lit8 p0, p0, 0x1

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۟(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    not-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۠(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۡ(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۢ(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۡ(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۤ(SB)B
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    int-to-byte p0, p0

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۥ(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۦ(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۧ(SS)S
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۨ(SS)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    or-int/2addr p0, p1

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ۟(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    add-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ۠(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۡ(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۢ(SS)LYue/ۥۢۢۧ;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    new-instance v0, LYue/ۥۢۢۧ;

    const v1, 0xffff

    and-int/2addr p0, v1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟ۢ(SS)LYue/ۥۢۢۧ;
    .locals 1
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

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۨۡ;->ۥۣ۟۟(II)LYue/ۥۢۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۤ(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۥ(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۦ(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۧ(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۨ(SB)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟(SJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    mul-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟۟(SI)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۠(SS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۡ(S)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-byte p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۢ(S)D
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    int-to-double v0, p0

    return-wide v0
.end method

.method public static final ۥۣۣ۟۟(S)F
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    int-to-float p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۤ(S)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    return p0
.end method

.method public static final ۥۣ۟۟ۥ(S)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public static final ۥۣ۟۟ۦ(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return p0
.end method

.method public static ۥۣ۟۟ۧ(S)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۨ(S)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-byte p0, p0

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤ(S)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤ۟(S)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟۟ۤ۠(S)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return p0
.end method

.method public static final ۥ۟۟ۤۢ(SS)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    xor-int/2addr p0, p1

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, LYue/ۥۢۢۨۤ;

    invoke-virtual {p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result p1

    invoke-virtual {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    and-int/2addr p1, v1

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-short v0, p0, LYue/ۥۢۢۨۤ;->ۥۣ۟۟۠:S

    invoke-static {v0, p1}, LYue/ۥۢۢۨۤ;->ۥ۟۟۠ۡ(SLjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-short v0, p0, LYue/ۥۢۢۨۤ;->ۥۣ۟۟۠:S

    invoke-static {v0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۠ۨ(S)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-short v0, p0, LYue/ۥۢۢۨۤ;->ۥۣ۟۟۠:S

    invoke-static {v0}, LYue/ۥۢۢۨۤ;->ۥۣ۟۟ۧ(S)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥۣ۟۟۟(S)I
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    and-int/2addr p1, v1

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p1

    return p1
.end method

.method public final synthetic ۥ۟۟ۤۡ()S
    .locals 1

    iget-short v0, p0, LYue/ۥۢۢۨۤ;->ۥۣ۟۟۠:S

    return v0
.end method
