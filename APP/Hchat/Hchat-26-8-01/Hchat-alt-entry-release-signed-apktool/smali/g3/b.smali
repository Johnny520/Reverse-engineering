.class public abstract Lg3/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final i:Landroid/view/View$AccessibilityDelegate;


# instance fields
.field public final g:Landroid/view/View$AccessibilityDelegate;

.field public final h:Lg3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg3/b;->i:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg3/b;->i:Landroid/view/View$AccessibilityDelegate;

    .line 5
    .line 6
    iput-object v0, p0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 7
    .line 8
    new-instance v0, Lg3/a;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lg3/a;-><init>(Lg3/b;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lg3/b;->h:Lg3/a;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Landroidx/lifecycle/x;
    .locals 2

    .line 1
    iget-object v0, p0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View$AccessibilityDelegate;->getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/x;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public b(Landroid/view/View;Lh3/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/b;->g:Landroid/view/View$AccessibilityDelegate;

    .line 2
    .line 3
    iget-object p2, p2, Lh3/g;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
