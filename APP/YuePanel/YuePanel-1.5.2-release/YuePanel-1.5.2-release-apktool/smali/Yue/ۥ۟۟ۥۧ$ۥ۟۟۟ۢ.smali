.class public LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۥۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e2"
.end annotation


# static fields
.field public static final ۥ۟:I = 0x0

.field public static final ۥ۟۟:I = 0x1

.field public static final ۥ۟۟۟:I = 0x2


# instance fields
.field public final ۥ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IFFF)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 5
    invoke-static {p1, p2, p3, p4}, LYue/ۥ۟۟ۥۧ$ۥ۟۟;->ۥ(IFFF)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, p2, p3, p4}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static ۥ۟۟۟۟(IFFF)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;
    .locals 1

    new-instance v0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;

    invoke-static {p0, p1, p2, p3}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->obtain(IFFF)Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public ۥ()F
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getCurrent()F

    move-result v0

    return v0
.end method

.method public ۥ۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getMax()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟()F
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getMin()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۢ;->ۥ:Ljava/lang/Object;

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$RangeInfo;->getType()I

    move-result v0

    return v0
.end method
