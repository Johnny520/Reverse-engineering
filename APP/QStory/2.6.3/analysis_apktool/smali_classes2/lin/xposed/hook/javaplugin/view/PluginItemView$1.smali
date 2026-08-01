.class Llin/xposed/hook/javaplugin/view/PluginItemView$1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/view/PluginItemView;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/javaplugin/view/PluginItemView;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/view/PluginItemView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView$1;->this$0:Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Llin/xposed/hook/javaplugin/view/PluginItemView$1;->this$0:Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 2
    .line 3
    iget-object p1, p1, Llin/xposed/hook/javaplugin/view/PluginItemView;->infoView:Landroid/widget/RelativeLayout;

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Llin/xposed/hook/javaplugin/view/PluginItemView$1;->this$0:Llin/xposed/hook/javaplugin/view/PluginItemView;

    .line 11
    .line 12
    invoke-static {p0}, Llin/xposed/hook/javaplugin/view/PluginItemView;->飘花落叶言子楪哲兰苏世(Llin/xposed/hook/javaplugin/view/PluginItemView;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
