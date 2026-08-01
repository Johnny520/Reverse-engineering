.class public final synthetic Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 2

    .line 1
    iget v0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/google/android/material/chip/Chip;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/chip/Chip;->飘花落叶言子世楪苏哲兰:Lcom/google/android/material/internal/飘花落叶言子楪苏哲世兰;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-boolean v1, v0, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 30
    .line 31
    invoke-virtual {v0, p0, v1}, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lcom/google/android/material/internal/飘花落叶言子楪苏哲兰世;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏()V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/chip/Chip;->飘花落叶言子楪兰哲苏世:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    invoke-interface {p0, p1, p2}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void

    .line 48
    :pswitch_0
    check-cast p0, Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 49
    .line 50
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世兰苏哲(Llin/xposed/hook/javaplugin/view/PluginItemView;Landroid/widget/CompoundButton;Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    check-cast p0, Llin/xposed/hook/javaplugin/bean/PluginInfo;

    .line 55
    .line 56
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪世兰哲苏(Llin/xposed/hook/javaplugin/bean/PluginInfo;Landroid/widget/CompoundButton;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
