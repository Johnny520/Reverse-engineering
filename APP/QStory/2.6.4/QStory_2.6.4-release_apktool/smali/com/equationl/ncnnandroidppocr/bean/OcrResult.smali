.class public final Lcom/equationl/ncnnandroidppocr/bean/OcrResult;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003J9\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/equationl/ncnnandroidppocr/bean/OcrResult;",
        "",
        "text",
        "",
        "inferenceTime",
        "",
        "textLines",
        "",
        "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
        "drawBitmap",
        "Landroid/graphics/Bitmap;",
        "(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)V",
        "getDrawBitmap",
        "()Landroid/graphics/Bitmap;",
        "getInferenceTime",
        "()J",
        "getText",
        "()Ljava/lang/String;",
        "getTextLines",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "ncnnAndroidPPOCR_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final drawBitmap:Landroid/graphics/Bitmap;

.field private final inferenceTime:J

.field private final text:Ljava/lang/String;

.field private final textLines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p2, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 13
    .line 14
    iput-object p4, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;-><init>(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/equationl/ncnnandroidppocr/bean/OcrResult;Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-object p4, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 20
    .line 21
    if-eqz p6, :cond_3

    .line 22
    .line 23
    iget-object p5, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 24
    .line 25
    :cond_3
    move-object p6, p4

    .line 26
    move-object p7, p5

    .line 27
    move-wide p4, p2

    .line 28
    move-object p2, p0

    .line 29
    move-object p3, p1

    .line 30
    invoke-virtual/range {p2 .. p7}, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->copy(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component3()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)Lcom/equationl/ncnnandroidppocr/bean/OcrResult;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrResult;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 8
    .line 9
    invoke-direct/range {p0 .. p5}, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;-><init>(Ljava/lang/String;JLjava/util/List;Landroid/graphics/Bitmap;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-wide v3, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 25
    .line 26
    iget-wide v5, p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 34
    .line 35
    iget-object v3, p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    return v0
.end method

.method public final getDrawBitmap()Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInferenceTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTextLines()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/equationl/ncnnandroidppocr/bean/OcrTextLineResult;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-wide v2, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    :goto_0
    add-int/2addr v0, p0

    .line 33
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->text:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->inferenceTime:J

    .line 4
    .line 5
    iget-object v3, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->textLines:Ljava/util/List;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/equationl/ncnnandroidppocr/bean/OcrResult;->drawBitmap:Landroid/graphics/Bitmap;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v5, "OcrResult(text="

    .line 12
    .line 13
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", inferenceTime="

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", textLines="

    .line 28
    .line 29
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", drawBitmap="

    .line 36
    .line 37
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")"

    .line 44
    .line 45
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
