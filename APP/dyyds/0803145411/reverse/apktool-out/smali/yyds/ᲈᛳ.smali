.class public final Lyyds/ᲈᛳ;
.super Landroid/text/style/ClickableSpan;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:I

.field public final ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᛸ;


# direct methods
.method public constructor <init>(ILyyds/ᛱᛵᲈᛸ;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lyyds/ᲈᛳ;->ᲀᛲᛳᲀ:I

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᛸ;

    .line 7
    .line 8
    iput p3, p0, Lyyds/ᲈᛳ;->ᛲᛴᛳᛲ:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    .line 7
    .line 8
    iget v1, p0, Lyyds/ᲈᛳ;->ᲀᛲᛳᲀ:I

    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    iget v0, p0, Lyyds/ᲈᛳ;->ᛲᛴᛳᛲ:I

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛵᲈᛸ;

    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛱᛵᲈᛸ;->ᛲᲈᲁ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method
