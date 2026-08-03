.class public LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# static fields
.field public static final ۥ۟:I = 0x0

.field public static final ۥ۟۟:I = 0x1

.field public static final ۥ۟۟۟:I = 0x2


# instance fields
.field public final ۥ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟۟۟۟(IIZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;
    .locals 1

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;

    invoke-static {p0, p1, p2}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟۟۠(IIZI)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;
    .locals 1

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;

    invoke-static {p0, p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZI)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getColumnCount()I

    move-result v0

    return v0
.end method

.method public ۥ۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getRowCount()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->getSelectionMode()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟۠;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->isHierarchical()Z

    move-result v0

    return v0
.end method
