.class public final LFl;
.super LTB;
.source ""


# instance fields
.field public final l:I

.field public final m:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LFl;->l:I

    iput p1, p0, LFl;->m:I

    return-void
.end method


# virtual methods
.method public final N(LCh;)I
    .locals 5

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, LCh;->i(I)V

    const/4 v0, 0x4

    iget v1, p0, LFl;->m:I

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0, v2}, LCh;->g(II)V

    iget-object v3, p1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v4, p1, LCh;->b:I

    sub-int/2addr v4, v0

    iput v4, p1, LCh;->b:I

    invoke-virtual {v3, v4, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v1, p1, LCh;->d:[I

    invoke-virtual {p1}, LCh;->f()I

    move-result v3

    const/4 v4, 0x1

    aput v3, v1, v4

    :cond_0
    iget v1, p0, LFl;->l:I

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0, v2}, LCh;->g(II)V

    iget-object v3, p1, LCh;->a:Ljava/nio/ByteBuffer;

    iget v4, p1, LCh;->b:I

    sub-int/2addr v4, v0

    iput v4, p1, LCh;->b:I

    invoke-virtual {v3, v4, v1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    iget-object v0, p1, LCh;->d:[I

    invoke-virtual {p1}, LCh;->f()I

    move-result v1

    aput v1, v0, v2

    :cond_1
    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0
.end method
