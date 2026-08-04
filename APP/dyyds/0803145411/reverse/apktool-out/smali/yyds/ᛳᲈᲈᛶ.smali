.class public final Lyyds/ᛳᲈᲈᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲁᛳᲀᲇ;


# direct methods
.method public constructor <init>(Landroid/view/View;Lyyds/ᲁᛳᲀᲇ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lyyds/ᛳᲈᲈᛶ;->ᛲᲈᲁ:Lyyds/ᲁᛳᲀᲇ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p0, p0, Lyyds/ᛳᲈᲈᛶ;->ᛲᲈᲁ:Lyyds/ᲁᛳᲀᲇ;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2}, Lyyds/ᲁᛳᲀᲇ;->ᲇᲈᛵᛷ(Landroid/view/View;Lyyds/ᲈᛶᲈᛴ;)Lyyds/ᲈᛶᲈᛴ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ()Landroid/view/WindowInsets;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
