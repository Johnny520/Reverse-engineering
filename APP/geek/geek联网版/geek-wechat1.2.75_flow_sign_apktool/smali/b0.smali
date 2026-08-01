.class public final Lb0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;


# instance fields
.field public final a:La0;


# direct methods
.method public constructor <init>(La0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb0;->a:La0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lb0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, Lb0;

    .line 12
    .line 13
    iget-object v0, p0, Lb0;->a:La0;

    .line 14
    .line 15
    iget-object p1, p1, Lb0;->a:La0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lb0;->a:La0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onTouchExplorationStateChanged(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb0;->a:La0;

    .line 2
    .line 3
    check-cast v0, Lqh;

    .line 4
    .line 5
    iget-object v0, v0, Lqh;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lrh;

    .line 8
    .line 9
    iget-object v1, v0, Lrh;->h:Landroid/widget/AutoCompleteTextView;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/widget/TextView;->getInputType()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, Lhj;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x1

    .line 27
    :goto_0
    sget-object v1, Loa0;->a:Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-static {v0, p1}, Lx90;->s(Landroid/view/View;I)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-void
.end method
