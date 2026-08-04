.class public final Lyyds/ᲁᛱᲇᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛱᛶ;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲈᛵ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛱᲈᛵ;Lyyds/ᛳᛴᛱᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲈᛵ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᛱᲇᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛱᛶ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛱᲇᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲈᛱᲈᛵ;

    .line 2
    .line 3
    iget-object v0, v0, Lyyds/ᲈᛱᲈᛵ;->ᲀᛴᲁᲈ:Lyyds/ᲀᛱᛵᛶ;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲁᛱᲇᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛱᛶ;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
