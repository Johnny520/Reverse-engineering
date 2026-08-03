.class Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$2;
.super LYue/ۥۣۡۡۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->setBackPressedDispatcher(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;Z)V
    .locals 0

    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$2;->this$0:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    invoke-direct {p0, p2}, LYue/ۥۣۡۡۢ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$2;->this$0:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    invoke-static {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->access$100(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;)Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$PrivateBackPressedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$2;->this$0:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    invoke-static {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->access$200(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kongzue/dialogx/interfaces/BaseDialog;

    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/BaseDialog;->isHide()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$2;->this$0:Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    invoke-static {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->access$100(Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;)Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$PrivateBackPressedListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout$PrivateBackPressedListener;->onBackPressed()Z

    :cond_0
    return-void
.end method
