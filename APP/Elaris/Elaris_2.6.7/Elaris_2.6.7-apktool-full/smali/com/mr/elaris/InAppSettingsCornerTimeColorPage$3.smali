.class Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$formatOptions:[Landroid/widget/TextView;

.field final synthetic val$patterns:[Ljava/lang/String;

.field final synthetic val$refresh:Ljava/lang/Runnable;

.field final synthetic val$selectedIndex:I

.field final synthetic val$selectedPattern:[Ljava/lang/String;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>([Ljava/lang/String;[Ljava/lang/String;I[Landroid/widget/TextView;Lcom/mr/elaris/InAppSettings;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$selectedPattern:[Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$patterns:[Ljava/lang/String;

    .line 4
    .line 5
    iput p3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$selectedIndex:I

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$formatOptions:[Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$refresh:Ljava/lang/Runnable;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$selectedPattern:[Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$patterns:[Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$selectedIndex:I

    .line 6
    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aput-object v0, p1, v1

    .line 11
    .line 12
    move p1, v1

    .line 13
    :goto_0
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$formatOptions:[Landroid/widget/TextView;

    .line 14
    .line 15
    array-length v2, v0

    .line 16
    if-ge p1, v2, :cond_1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 19
    .line 20
    aget-object v0, v0, p1

    .line 21
    .line 22
    iget v3, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$selectedIndex:I

    .line 23
    .line 24
    if-ne p1, v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move v3, v1

    .line 29
    :goto_1
    invoke-static {v2, v0, v3}, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage;->b(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Z)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsCornerTimeColorPage$3;->val$refresh:Ljava/lang/Runnable;

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
