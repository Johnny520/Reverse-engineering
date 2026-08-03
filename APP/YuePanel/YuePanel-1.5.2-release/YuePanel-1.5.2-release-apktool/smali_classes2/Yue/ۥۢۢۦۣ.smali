.class public final LYue/ۥۢۢۦۣ;
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
        LYue/ۥۢۢۦۣ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۤ:LYue/ۥۢۢۦۣ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۠ۥ:I = 0x0

.field public static final ۥ۟۟۠ۦ:I = -0x1

.field public static final ۥ۟۟۠ۧ:I = 0x4

.field public static final ۥ۟۟۠ۨ:I = 0x20


# instance fields
.field public final ۥۣ۟۟۠:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢۢۦۣ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۢۦۣ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۢۢۦۣ;->ۥ۟۟۠ۤ:LYue/ۥۢۢۦۣ$ۥ;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LYue/ۥۢۢۦۣ;->ۥۣ۟۟۠:I

    return-void
.end method

.method public static final ۥ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;
    .locals 1

    new-instance v0, LYue/ۥۢۢۦۣ;

    invoke-direct {v0, p0}, LYue/ۥۢۢۦۣ;-><init>(I)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۟(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(IJ)I
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟۟(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۤ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۥ(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۧ۟;
    .end annotation

    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    return p0
.end method

.method public static final ۥ۟۟۟ۦ(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-int/lit8 p0, p0, -0x1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۟(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟۟(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠۠(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۡ(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥۢۢۦۣ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥۢۢۦۣ;

    invoke-virtual {p1}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۠(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۤ(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->divideUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠ۥ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Integer;->divideUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۦ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

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

.method public static ۥ۟۟۠ۨ(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۟(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    not-int p0, p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۠(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۡ(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۢ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۡ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    sub-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۤ(IB)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

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

.method public static final ۥ۟۟ۡۥ(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۡۦ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۧ(IS)S
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

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

.method public static final ۥ۟۟ۡۨ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    or-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ۟(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    add-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢ۠(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۡ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۢ(II)LYue/ۥۢۢۧ;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    new-instance v0, LYue/ۥۢۢۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟ۢ(II)LYue/ۥۢۢۧ;
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

    invoke-static {p0, p1}, LYue/ۥۢۢۨۡ;->ۥۣ۟۟(II)LYue/ۥۢۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۤ(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۥ(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->remainderUnsigned(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟ۢۦ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟۟۟(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۧ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->remainderUnsigned(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۨ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    shl-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    ushr-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۟(IB)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۠(IJ)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    mul-long/2addr v0, p1

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥۣ۟۟ۡ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۢ(IS)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    mul-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method

.method public static final ۥۣۣ۟۟(I)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-byte p0, p0

    return p0
.end method

.method public static final ۥۣ۟۟ۤ(I)D
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0}, LYue/ۥۣۢۡ;->ۥ۟۟۟۠(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥۣ۟۟ۥ(I)F
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-static {p0}, LYue/ۥۣۢۡ;->ۥ۟۟۟۠(I)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final ۥۣ۟۟ۦ(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return p0
.end method

.method public static final ۥۣ۟۟ۧ(I)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public static final ۥۣ۟۟ۨ(I)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-short p0, p0

    return p0
.end method

.method public static ۥ۟۟ۤ(I)Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ۟(I)B
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-byte p0, p0

    invoke-static {p0}, LYue/ۥۢۢۥۥ;->ۥ۟۟۟ۥ(B)B

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤ۠(I)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    return p0
.end method

.method public static final ۥ۟۟ۤۡ(I)J
    .locals 4
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟۟ۤۢ(I)S
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    int-to-short p0, p0

    invoke-static {p0}, LYue/ۥۢۢۨۤ;->ۥ۟۟۟ۥ(S)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۤۤ(II)I
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    xor-int/2addr p0, p1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LYue/ۥۢۢۦۣ;

    invoke-virtual {p1}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p1

    invoke-virtual {p0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v0

    invoke-static {v0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟(II)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LYue/ۥۢۢۦۣ;->ۥۣ۟۟۠:I

    invoke-static {v0, p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۠ۡ(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LYue/ۥۢۢۦۣ;->ۥۣ۟۟۠:I

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۠ۨ(I)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget v0, p0, LYue/ۥۢۢۦۣ;->ۥۣ۟۟۠:I

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟ۤ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ(I)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v0

    invoke-static {v0, p1}, LYue/ۥۣۢۡ;->ۥ۟۟(II)I

    move-result p1

    return p1
.end method

.method public final synthetic ۥۣ۟۟ۤ()I
    .locals 1

    iget v0, p0, LYue/ۥۢۢۦۣ;->ۥۣ۟۟۠:I

    return v0
.end method
