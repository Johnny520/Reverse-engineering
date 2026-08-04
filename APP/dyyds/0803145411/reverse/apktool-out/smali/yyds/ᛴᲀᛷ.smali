.class public final synthetic Lyyds/ᛴᲀᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lcom/qmdeve/blurview/widget/BlurView;


# direct methods
.method public synthetic constructor <init>(Lcom/qmdeve/blurview/widget/BlurView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᲀᛷ;->ᲀᛲᛳᲀ:Lcom/qmdeve/blurview/widget/BlurView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛴᲀᛷ;->ᲀᛲᛳᲀ:Lcom/qmdeve/blurview/widget/BlurView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲀᛱᛷᲀ;->ᛲᛴᛳᛲ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lyyds/ᲀᛱᛷᲀ;->ᲀᛲᛱᛱ:Z

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0
.end method
