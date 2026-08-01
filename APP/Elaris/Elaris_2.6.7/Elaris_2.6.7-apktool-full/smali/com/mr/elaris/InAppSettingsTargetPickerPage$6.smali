.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;
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
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$friendList:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$summary:Landroid/widget/TextView;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$runnableArr:[Ljava/lang/Runnable;

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
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$friendList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lh5;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    iget-object v2, v0, Lh5;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, v0, Lh5;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$summary:Landroid/widget/TextView;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const-string v1, "\u5df2\u9009\u62e9 "

    .line 46
    .line 47
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, " / "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$friendList:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$6;->val$runnableArr:[Ljava/lang/Runnable;

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    aget-object p0, p0, p1

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 86
    .line 87
    .line 88
    return-void
.end method
