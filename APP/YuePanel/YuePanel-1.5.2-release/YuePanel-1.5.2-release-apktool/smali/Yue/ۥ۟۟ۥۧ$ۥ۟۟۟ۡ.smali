.class public LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥۣ۟۟۟(IIIIZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
    .locals 1

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    invoke-static {p0, p1, p2, p3, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۤ(IIIIZZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;
    .locals 1

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    invoke-static/range {p0 .. p5}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnIndex()I

    move-result v0

    return v0
.end method

.method public ۥ۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getColumnSpan()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowIndex()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->getRowSpan()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۠()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->isHeading()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->isSelected()Z

    move-result v0

    return v0
.end method
