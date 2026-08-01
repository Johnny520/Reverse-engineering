.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->showFriendPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$friendList:Ljava/util/ArrayList;

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$runnableArr:[Ljava/lang/Runnable;

.field final synthetic val$summary:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Landroid/widget/TextView;Ljava/util/ArrayList;[Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$summary:Landroid/widget/TextView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$friendList:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$runnableArr:[Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$summary:Landroid/widget/TextView;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "\u5df2\u9009\u62e9 0 / "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$friendList:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$5;->val$runnableArr:[Ljava/lang/Runnable;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    aget-object p0, p0, p1

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 37
    .line 38
    .line 39
    return-void
.end method
