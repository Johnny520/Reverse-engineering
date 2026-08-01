.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->friendPickRow(Lcom/mr/elaris/InAppSettings;Lh5;Ljava/util/LinkedHashSet;Landroid/widget/TextView;ILjava/lang/Runnable;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$count:I

.field final synthetic val$friendInfo:Lh5;

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$runnable:Ljava/lang/Runnable;

.field final synthetic val$textView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Lh5;Landroid/widget/TextView;ILjava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$friendInfo:Lh5;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$textView:Landroid/widget/TextView;

    .line 6
    .line 7
    iput p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$count:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$runnable:Ljava/lang/Runnable;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$friendInfo:Lh5;

    .line 4
    .line 5
    iget-object v0, v0, Lh5;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$friendInfo:Lh5;

    .line 16
    .line 17
    iget-object p1, p1, Lh5;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$friendInfo:Lh5;

    .line 24
    .line 25
    iget-object p1, p1, Lh5;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$textView:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz p1, :cond_1

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
    iget-object v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$linkedHashSet:Ljava/util/LinkedHashSet;

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
    iget v1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$count:I

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$20;->val$runnable:Ljava/lang/Runnable;

    .line 68
    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method
