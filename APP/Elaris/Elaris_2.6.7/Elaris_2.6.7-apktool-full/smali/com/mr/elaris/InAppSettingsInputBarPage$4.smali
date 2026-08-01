.class Lcom/mr/elaris/InAppSettingsInputBarPage$4;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsInputBarPage;->showDialog(Lcom/mr/elaris/InAppSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$dialog:Landroid/app/AlertDialog;

.field final synthetic val$hidden:[Z

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>([ZLcom/mr/elaris/InAppSettings;Landroid/app/AlertDialog;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$hidden:[Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$dialog:Landroid/app/AlertDialog;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    invoke-static {}, Lcom/mr/elaris/InAppSettingsInputBarPage;->a()[I

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    array-length v2, v2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$hidden:[Z

    .line 16
    .line 17
    aget-boolean v2, v2, v1

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lcom/mr/elaris/InAppSettingsInputBarPage;->a()[I

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    aget v2, v2, v1

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 38
    .line 39
    const-string v2, "aio_input_bar_hidden_ids"

    .line 40
    .line 41
    invoke-static {p1}, Li5;->K1(Ljava/util/LinkedHashSet;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, v2, p1, v0}, Lcom/mr/elaris/InAppSettings;->saveString(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$dialog:Landroid/app/AlertDialog;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsInputBarPage$4;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/mr/elaris/InAppSettings;->refreshCurrentPage()V

    .line 56
    .line 57
    .line 58
    return-void
.end method
