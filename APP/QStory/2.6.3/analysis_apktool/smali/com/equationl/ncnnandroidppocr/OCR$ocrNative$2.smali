.class final Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;->INSTANCE:Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke()Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;
    .locals 0

    .line 1
    new-instance p0, Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 7
    invoke-virtual {p0}, Lcom/equationl/ncnnandroidppocr/OCR$ocrNative$2;->invoke()Lcom/equationl/ncnnandroidppocr/cpp/OCRNative;

    move-result-object p0

    return-object p0
.end method
