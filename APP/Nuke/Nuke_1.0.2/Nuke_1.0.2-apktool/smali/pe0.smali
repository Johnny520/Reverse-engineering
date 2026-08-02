.class public final Lpe0;
.super Lke0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ldx0;


# instance fields
.field public final t:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lpe0;->t:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lmj0;->m(I)V

    .line 3
    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iget-wide v2, p0, Lpe0;->t:J

    .line 8
    .line 9
    cmp-long p0, v2, v0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/16 p0, 0x8

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, p0, v0}, Lmj0;->k(II)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p1, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v4, p1, Lmj0;->b:I

    .line 22
    .line 23
    sub-int/2addr v4, p0

    .line 24
    iput v4, p1, Lmj0;->b:I

    .line 25
    .line 26
    invoke-virtual {v1, v4, v2, v3}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lmj0;->l(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lmj0;->g()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 37
    .line 38
    .line 39
    return p0
.end method
