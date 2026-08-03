.class public LYue/ۥ۟۟ۥۧ$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x21
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(ZIIIIZLjava/lang/String;Ljava/lang/String;)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
    .locals 2
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    new-instance v1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    invoke-direct {v1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;-><init>()V

    invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setHeading(Z)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnIndex(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowIndex(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnSpan(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowSpan(I)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setSelected(Z)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setRowTitle(Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p7}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->setColumnTitle(Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo$Builder;->build()Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟(Landroid/view/accessibility/AccessibilityNodeInfo;II)LYue/ۥ۟۟ۥۧ;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getChild(II)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۠ۤ(Ljava/lang/Object;)LYue/ۥ۟۟ۥۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnTitle()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    check-cast p0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowTitle()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtraRenderingInfo()Landroid/view/accessibility/AccessibilityNodeInfo$ExtraRenderingInfo;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Landroid/view/accessibility/AccessibilityNodeInfo;I)LYue/ۥ۟۟ۥۧ;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getParent(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۟۟ۥۧ;->ۥۣ۟۠ۤ(Ljava/lang/Object;)LYue/ۥ۟۟ۥۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/String;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getUniqueId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/view/accessibility/AccessibilityNodeInfo;)Z
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isTextSelectable()Z

    move-result p0

    return p0
.end method

.method public static ۥۣ۟۟۟(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTextSelectable(Z)V

    return-void
.end method

.method public static ۥ۟۟۟ۤ(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setUniqueId(Ljava/lang/String;)V

    return-void
.end method
