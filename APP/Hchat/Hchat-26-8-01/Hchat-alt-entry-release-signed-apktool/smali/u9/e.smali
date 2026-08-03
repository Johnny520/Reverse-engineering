.class public final synthetic Lu9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic g:Lu9/h;

.field public final synthetic h:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lu9/h;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu9/e;->g:Lu9/h;

    .line 5
    .line 6
    iput-object p2, p0, Lu9/e;->h:Landroid/view/View;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lu9/e;->g:Lu9/h;

    .line 2
    .line 3
    iget-object v1, v0, Lu9/h;->e:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v2, "hide_wechat_bottom_bar_enable"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lu9/e;->h:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lu9/h;->e(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lu9/h;->b(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v0, 0x1

    .line 30
    return v0
.end method
