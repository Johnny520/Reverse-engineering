.class Lcom/kongzue/dialogx/dialogs/MessageMenu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kongzue/dialogx/dialogs/MessageMenu;->onDialogShow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/dialogs/MessageMenu;)V
    .locals 0

    iput-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1, p3}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->isMenuItemEnable(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p1, p2}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$100(Lcom/kongzue/dialogx/dialogs/MessageMenu;Landroid/view/View;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-object p4, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p4}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$200(Lcom/kongzue/dialogx/dialogs/MessageMenu;)J

    move-result-wide p4

    sub-long p4, p1, p4

    const-wide/16 v0, 0x64

    cmp-long p4, p4, v0

    if-lez p4, :cond_e

    iget-object p4, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p4, p1, p2}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$202(Lcom/kongzue/dialogx/dialogs/MessageMenu;J)J

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$000(Lcom/kongzue/dialogx/dialogs/MessageMenu;)F

    move-result p1

    iget-object p2, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p2}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->getDialogImpl()Lcom/kongzue/dialogx/dialogs/MessageDialog$DialogImpl;

    move-result-object p2

    iget-object p2, p2, Lcom/kongzue/dialogx/dialogs/MessageDialog$DialogImpl;->bkg:Lcom/kongzue/dialogx/util/views/MaxRelativeLayout;

    invoke-virtual {p2}, Landroid/view/View;->getY()F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget-object p2, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    const/high16 p4, 0x41700000    # 15.0f

    invoke-virtual {p2, p4}, Lcom/kongzue/dialogx/interfaces/BaseDialog;->dip2px(F)I

    move-result p2

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-lez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iput p3, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionIndex:I

    sget-object p2, Lcom/kongzue/dialogx/dialogs/MessageMenu$5;->$SwitchMap$com$kongzue$dialogx$interfaces$SELECT_MODE:[I

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectMode:Lcom/kongzue/dialogx/interfaces/SELECT_MODE;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_c

    const/4 p4, 0x2

    if-eq p1, p4, :cond_8

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto/16 :goto_2

    :cond_2
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p2, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->onMenuItemClickListener:Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;

    instance-of p4, p2, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;

    if-eqz p4, :cond_5

    check-cast p2, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;

    iget-object p4, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;->onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    goto/16 :goto_2

    :cond_3
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    new-instance p4, Ljava/lang/Integer;

    invoke-direct {p4, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuListAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$300(Lcom/kongzue/dialogx/dialogs/MessageMenu;)V

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p3, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$400(Lcom/kongzue/dialogx/dialogs/MessageMenu;)[Ljava/lang/CharSequence;

    move-result-object p1

    iget-object p4, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p4}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$500(Lcom/kongzue/dialogx/dialogs/MessageMenu;)[I

    move-result-object p4

    invoke-virtual {p2, p3, p1, p4}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;->onMultiItemSelect(Ljava/lang/Object;[Ljava/lang/CharSequence;[I)V

    goto/16 :goto_2

    :cond_5
    if-eqz p2, :cond_6

    iget-object p4, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;->onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    goto/16 :goto_2

    :cond_6
    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->selectionItems:Ljava/util/ArrayList;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuListAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-static {p1}, Lcom/kongzue/dialogx/dialogs/MessageMenu;->access$300(Lcom/kongzue/dialogx/dialogs/MessageMenu;)V

    goto/16 :goto_2

    :cond_8
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p4, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->onMenuItemClickListener:Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;

    instance-of p5, p4, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;

    if-eqz p5, :cond_a

    check-cast p4, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;

    iget-object p5, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p4, p5, p1, p3}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;->onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z

    move-result p1

    if-nez p1, :cond_9

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    goto :goto_2

    :cond_9
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuListAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p5, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p4, p5, p1, p3, p2}, Lcom/kongzue/dialogx/interfaces/OnMenuItemSelectListener;->onOneItemSelect(Ljava/lang/Object;Ljava/lang/CharSequence;IZ)V

    goto :goto_2

    :cond_a
    if-eqz p4, :cond_b

    iget-object p2, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p4, p2, p1, p3}, Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;->onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    goto :goto_2

    :cond_b
    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuListAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    goto :goto_2

    :cond_c
    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p2, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->onMenuItemClickListener:Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;

    if-eqz p2, :cond_d

    iget-object p4, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->me:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    iget-object p1, p1, Lcom/kongzue/dialogx/dialogs/MessageMenu;->menuList:Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p2, p4, p1, p3}, Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;->onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Lcom/kongzue/dialogx/dialogs/MessageMenu$2;->this$0:Lcom/kongzue/dialogx/dialogs/MessageMenu;

    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    goto :goto_2

    :cond_d
    invoke-virtual {p1}, Lcom/kongzue/dialogx/dialogs/MessageDialog;->dismiss()V

    :cond_e
    :goto_2
    return-void
.end method
