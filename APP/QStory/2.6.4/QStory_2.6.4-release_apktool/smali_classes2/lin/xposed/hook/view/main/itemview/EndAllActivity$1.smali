.class Llin/xposed/hook/view/main/itemview/EndAllActivity$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/view/main/itemview/EndAllActivity;->getOnClick()Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Llin/xposed/hook/view/main/itemview/EndAllActivity;


# direct methods
.method public constructor <init>(Llin/xposed/hook/view/main/itemview/EndAllActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/EndAllActivity$1;->this$0:Llin/xposed/hook/view/main/itemview/EndAllActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
