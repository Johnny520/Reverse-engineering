.class public LYue/ۥ۟ۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(I)I
    .locals 2

    iget v0, p0, LYue/ۥ۟ۢۦ;->ۥ:I

    iget v1, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟:I

    mul-int/2addr p1, v1

    add-int/2addr v0, p1

    return v0
.end method

.method public ۥ۟(IILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p3, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟۟:Ljava/nio/ByteBuffer;

    if-eqz p3, :cond_0

    iput p1, p0, LYue/ۥ۟ۢۦ;->ۥ:I

    add-int/lit8 p1, p1, -0x4

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۢۦ;->ۥ۟:I

    iput p2, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۟ۢۦ;->ۥ:I

    iput p1, p0, LYue/ۥ۟ۢۦ;->ۥ۟:I

    iput p1, p0, LYue/ۥ۟ۢۦ;->ۥ۟۟:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۦ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥ۟ۢۦ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟۟()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v0, v1}, LYue/ۥ۟ۢۦ;->ۥ۟(IILjava/nio/ByteBuffer;)V

    return-void
.end method
