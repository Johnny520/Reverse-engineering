.class public LYue/ۥ۠ۢۢۡ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۟۠:Z


# instance fields
.field public final ۥ:I

.field public final ۥ۟:I

.field public final ۥ۟۟:D

.field public ۥ۟۟۟:J

.field public ۥ۟۟۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IIID)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟۟:I

    .line 9
    iput p2, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ:I

    .line 10
    iput p3, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟:I

    .line 11
    iput-wide p4, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟:D

    const-wide/high16 p1, -0x8000000000000000L

    .line 12
    iput-wide p1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟:J

    return-void
.end method

.method public constructor <init>(IIIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟۟:I

    .line 3
    iput p2, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ:I

    .line 4
    iput p3, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟:I

    .line 5
    iput-wide p4, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟:J

    const-wide/16 p1, 0x1

    .line 6
    iput-wide p1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟:D

    return-void
.end method

.method public static synthetic ۥ(II)I
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠۠(II)I

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟(LYue/ۥ۠ۢۢۡ$ۥ۟;II)I
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟ۢ(II)I

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۢۢۡ$ۥ۟;)B
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠ۡ()B

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۢۢۡ$ۥ۟;I)B
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠ۢ(I)B

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟(IIJII)I
    .locals 0

    invoke-static/range {p0 .. p5}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥۣ۟۟۟(IIJII)I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟۠(IIII)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    int-to-long v4, p1

    move-object v0, v6

    move v1, p0

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۟ۡ(IZ)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x1

    :goto_0
    move-wide v4, v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v2, 0x1a

    const/4 v3, 0x0

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥۣ۟۟۟(IIJII)I
    .locals 4

    invoke-static {p0}, LYue/ۥ۠ۢۢ۠;->ۥ۟۟۟ۤ(I)Z

    move-result p0

    if-eqz p0, :cond_0

    return p1

    :cond_0
    const/4 p0, 0x1

    :goto_0
    const/16 p1, 0x20

    if-gt p0, p1, :cond_2

    invoke-static {p4, p0}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠۠(II)I

    move-result p1

    add-int/2addr p1, p4

    mul-int v0, p5, p0

    add-int/2addr p1, v0

    int-to-long v0, p1

    sub-long/2addr v0, p2

    long-to-int p1, v0

    int-to-long v0, p1

    invoke-static {v0, v1}, LYue/ۥ۠ۢۢۡ;->ۥۣ۟۟ۡ(J)I

    move-result p1

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p1

    int-to-long v2, p0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    return p1

    :cond_1
    mul-int/lit8 p0, p0, 0x2

    goto :goto_0

    :cond_2
    const/4 p0, 0x3

    return p0
.end method

.method public static ۥ۟۟۟ۤ(IF)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x2

    float-to-double v4, p1

    const/4 v2, 0x3

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIID)V

    return-object v6
.end method

.method public static ۥ۟۟۟ۥ(ID)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v2, 0x3

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIID)V

    return-object v6
.end method

.method public static ۥ۟۟۟ۦ(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x1

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۟ۧ(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x2

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۟ۨ(IJ)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v2, 0x1

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۠(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x0

    int-to-long v4, p1

    const/4 v2, 0x1

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۠۟(II)B
    .locals 0

    shl-int/lit8 p1, p1, 0x2

    or-int/2addr p0, p1

    int-to-byte p0, p0

    return p0
.end method

.method public static ۥ۟۟۠۠(II)I
    .locals 0

    not-int p0, p0

    add-int/lit8 p0, p0, 0x1

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p0, p1

    return p0
.end method

.method public static ۥ۟۟۠ۤ(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x1

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۠ۥ(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x2

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۠ۦ(IJ)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v2, 0x2

    const/4 v3, 0x3

    move-object v0, v6

    move v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method

.method public static ۥ۟۟۠ۧ(II)LYue/ۥ۠ۢۢۡ$ۥ۟;
    .locals 7

    new-instance v6, LYue/ۥ۠ۢۢۡ$ۥ۟;

    const/4 v3, 0x0

    int-to-long v4, p1

    const/4 v2, 0x2

    move-object v0, v6

    move v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;-><init>(IIIJ)V

    return-object v6
.end method


# virtual methods
.method public final ۥ۟۟۟ۢ(II)I
    .locals 6

    iget v0, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ:I

    iget v1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟:I

    iget-wide v2, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۟:J

    move v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥۣ۟۟۟(IIJII)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۠ۡ()B
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠ۢ(I)B

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۠ۢ(I)B
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥۣ۟۟۠(I)I

    move-result p1

    iget v0, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ:I

    invoke-static {p1, v0}, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟۟۠۟(II)B

    move-result p1

    return p1
.end method

.method public final ۥۣ۟۟۠(I)I
    .locals 1

    iget v0, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ:I

    invoke-static {v0}, LYue/ۥ۠ۢۢ۠;->ۥ۟۟۟ۤ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟:I

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    iget p1, p0, LYue/ۥ۠ۢۢۡ$ۥ۟;->ۥ۟:I

    return p1
.end method
