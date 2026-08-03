.class public final La/Fa;
.super La/C;
.source "SourceFile"


# instance fields
.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La/Fa;->d:I

    invoke-direct {p0}, La/C;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;La/I;)V
    .locals 2

    iget v0, p0, La/Fa;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/C;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object p2, p2, La/I;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    return-void

    :pswitch_0
    iget-object v0, p0, La/C;->a:Landroid/view/View$AccessibilityDelegate;

    iget-object v1, p2, La/I;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, La/I;->i(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
