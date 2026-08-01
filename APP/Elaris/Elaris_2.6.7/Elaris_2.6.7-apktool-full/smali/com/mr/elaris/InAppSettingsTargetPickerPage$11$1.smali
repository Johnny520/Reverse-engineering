.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

.field final synthetic val$loadedList:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->val$loadedList:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->val$loadedList:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 18
    .line 19
    iget-object v1, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/mr/elaris/InAppSettingsTargetPickerPage;->mergeSelectedFriendPlaceholders(Ljava/util/List;Ljava/util/LinkedHashSet;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 27
    .line 28
    iget-object v1, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$summary:Landroid/widget/TextView;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const-string v0, "\u6682\u65e0\u597d\u53cb\u5217\u8868"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 44
    .line 45
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 49
    .line 50
    iget-object v2, v2, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, " / "

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 65
    .line 66
    iget-object v2, v2, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$filterArr:[Ljava/lang/Runnable;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    aget-object v0, v0, v1

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 93
    .line 94
    iget-object v2, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$shown:[Z

    .line 95
    .line 96
    aget-boolean v1, v2, v1

    .line 97
    .line 98
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$showPicker:Ljava/lang/Runnable;

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 104
    .line 105
    iget-object v0, v0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    if-nez v1, :cond_1

    .line 114
    .line 115
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;->this$0:Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;

    .line 116
    .line 117
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 118
    .line 119
    const-string v0, "\u6682\u65e0\u597d\u53cb\u5217\u8868\uff1b\u8bf7\u5148\u8fdb\u5165 QQ \u8054\u7cfb\u4eba\u6216\u804a\u5929\u9875\u540e\u518d\u8bd5"

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    return-void
.end method
