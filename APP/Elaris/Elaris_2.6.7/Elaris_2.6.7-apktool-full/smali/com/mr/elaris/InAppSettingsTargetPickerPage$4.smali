.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;
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
.method public constructor <init>(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Landroid/widget/TextView;[Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$friendList:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$summary:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$runnableArr:[Ljava/lang/Runnable;

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
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$friendList:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lh5;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    iget-object v0, v0, Lh5;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$summary:Landroid/widget/TextView;

    .line 33
    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v1, "\u5df2\u9009\u62e9 "

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, " / "

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$friendList:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$4;->val$runnableArr:[Ljava/lang/Runnable;

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    aget-object p0, p0, p1

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 77
    .line 78
    .line 79
    return-void
.end method
