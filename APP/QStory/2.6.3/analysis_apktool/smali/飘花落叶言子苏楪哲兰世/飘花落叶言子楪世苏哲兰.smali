.class public final L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/contentcapture/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroid/view/View;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(J)Landroid/view/autofill/AutofillId;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object p0, p0, L飘花落叶言子苏楪哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/view/View;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {v0, p0, p1, p2}, Landroidx/core/os/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰(Landroid/view/contentcapture/ContentCaptureSession;Landroid/view/autofill/AutofillId;J)Landroid/view/autofill/AutofillId;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return-object p0
.end method
