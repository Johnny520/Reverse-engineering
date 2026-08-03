.class public final Lfh/e;
.super Lfh/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lfh/e;->g:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lg6/b;->n(I)V

    .line 3
    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iget v2, p0, Lfh/e;->g:F

    .line 8
    .line 9
    float-to-double v3, v2

    .line 10
    cmpl-double v0, v3, v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Lg6/b;->k(II)V

    .line 17
    .line 18
    .line 19
    iget-object v3, p1, Lg6/b;->a:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v4, p1, Lg6/b;->b:I

    .line 22
    .line 23
    sub-int/2addr v4, v0

    .line 24
    iput v4, p1, Lg6/b;->b:I

    .line 25
    .line 26
    invoke-virtual {v3, v4, v2}, Ljava/nio/ByteBuffer;->putFloat(IF)Ljava/nio/ByteBuffer;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lg6/b;->m(I)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 37
    .line 38
    .line 39
    return v0
.end method
