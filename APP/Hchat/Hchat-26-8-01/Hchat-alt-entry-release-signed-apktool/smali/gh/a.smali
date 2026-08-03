.class public final Lgh/a;
.super Lx6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lgh/a;->g:I

    .line 5
    .line 6
    iput p1, p0, Lgh/a;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final G(Lg6/b;)I
    .locals 6

    .line 1
    iget v0, p0, Lgh/a;->g:I

    .line 2
    .line 3
    iget v1, p0, Lgh/a;->h:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-virtual {p1, v2}, Lg6/b;->n(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v2, v3}, Lg6/b;->k(II)V

    .line 14
    .line 15
    .line 16
    iget-object v4, p1, Lg6/b;->a:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    iget v5, p1, Lg6/b;->b:I

    .line 19
    .line 20
    sub-int/2addr v5, v2

    .line 21
    iput v5, p1, Lg6/b;->b:I

    .line 22
    .line 23
    invoke-virtual {v4, v5, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {p1, v1}, Lg6/b;->m(I)V

    .line 28
    .line 29
    .line 30
    :cond_0
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v2, v3}, Lg6/b;->k(II)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p1, Lg6/b;->a:Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    iget v4, p1, Lg6/b;->b:I

    .line 38
    .line 39
    sub-int/2addr v4, v2

    .line 40
    iput v4, p1, Lg6/b;->b:I

    .line 41
    .line 42
    invoke-virtual {v1, v4, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v3}, Lg6/b;->m(I)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {p1}, Lg6/b;->g()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p1, v0}, Lg6/b;->i(I)V

    .line 53
    .line 54
    .line 55
    return v0
.end method
