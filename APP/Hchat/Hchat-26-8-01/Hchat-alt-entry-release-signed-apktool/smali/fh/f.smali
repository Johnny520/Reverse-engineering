.class public final Lfh/f;
.super Lfh/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final g:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lfh/f;->g:I

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
    iget v0, p0, Lfh/f;->g:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {p1, v1, v2}, Lg6/b;->k(II)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p1, Lg6/b;->a:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    iget v4, p1, Lg6/b;->b:I

    .line 17
    .line 18
    sub-int/2addr v4, v1

    .line 19
    iput v4, p1, Lg6/b;->b:I

    .line 20
    .line 21
    invoke-virtual {v3, v4, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lg6/b;->m(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 32
    .line 33
    .line 34
    return v0
.end method
