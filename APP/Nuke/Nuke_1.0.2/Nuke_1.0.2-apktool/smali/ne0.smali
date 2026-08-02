.class public final Lne0;
.super Lke0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ldx0;


# instance fields
.field public final t:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lne0;->t:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final D(Lmj0;)I
    .locals 4

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
    iget p0, p0, Lne0;->t:F

    .line 8
    .line 9
    float-to-double v2, p0

    .line 10
    cmpl-double v0, v2, v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Lmj0;->k(II)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p1, Lmj0;->a:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v3, p1, Lmj0;->b:I

    .line 22
    .line 23
    sub-int/2addr v3, v0

    .line 24
    iput v3, p1, Lmj0;->b:I

    .line 25
    .line 26
    invoke-virtual {v2, v3, p0}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lmj0;->l(I)V

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
